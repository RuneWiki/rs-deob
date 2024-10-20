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
import java.util.Date;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class144 {

    @ObfuscatedName("client.i")
    public static boolean field287 = true;

    @ObfuscatedName("client.h")
    public static int field288 = 1;

    @ObfuscatedName("client.q")
    public static int field289 = 0;

    @ObfuscatedName("client.m")
    public static int field290 = 0;

    @ObfuscatedName("client.g")
    public static boolean field292 = false;

    @ObfuscatedName("client.v")
    public static boolean field570 = false;

    @ObfuscatedName("client.l")
    public static int field294 = 0;

    @ObfuscatedName("client.w")
    public static class108[] field348 = new class108[4];

    @ObfuscatedName("client.s")
    public static int field297 = 0;

    @ObfuscatedName("client.j")
    public static boolean field298 = true;

    @ObfuscatedName("client.b")
    public static int field299 = 0;

    @ObfuscatedName("client.r")
    public static long field459 = -1L;

    @ObfuscatedName("client.c")
    public static int field490 = -1;

    @ObfuscatedName("client.k")
    public static int field424 = -1;

    @ObfuscatedName("client.ar")
    public static int field303 = -1;

    @ObfuscatedName("client.as")
    public static boolean field304 = true;

    @ObfuscatedName("client.ac")
    public static boolean field305 = false;

    @ObfuscatedName("client.ah")
    public static int field508 = 0;

    @ObfuscatedName("client.al")
    public static int field307 = 0;

    @ObfuscatedName("client.am")
    public static int field308 = 0;

    @ObfuscatedName("client.ae")
    public static int field379 = 0;

    @ObfuscatedName("client.ai")
    public static int field310 = 0;

    @ObfuscatedName("client.aa")
    public static int field311 = 0;

    @ObfuscatedName("client.ag")
    public static int field312 = 0;

    @ObfuscatedName("client.an")
    public static int field313 = 0;

    @ObfuscatedName("client.ap")
    public static int field314 = 0;

    @ObfuscatedName("client.af")
    public static class21 field315 = class21.field574;

    @ObfuscatedName("client.au")
    public static int field316 = 0;

    @ObfuscatedName("client.ao")
    public static int field318 = 0;

    @ObfuscatedName("client.az")
    public static int field319 = 0;

    @ObfuscatedName("client.bd")
    public static int field421 = 0;

    @ObfuscatedName("client.by")
    public static int field321 = 0;

    @ObfuscatedName("client.bi")
    public static int field322 = 0;

    @ObfuscatedName("client.br")
    public static int field323 = 0;

    @ObfuscatedName("client.bq")
    public static int field324 = 0;

    @ObfuscatedName("client.cb")
    public static class35[] field378 = new class35[32768];

    @ObfuscatedName("client.ct")
    public static int field327 = 0;

    @ObfuscatedName("client.cj")
    public static int[] field521 = new int[32768];

    @ObfuscatedName("client.cd")
    public static int field329 = 0;

    @ObfuscatedName("client.cq")
    public static int[] field330 = new int[250];

    @ObfuscatedName("client.cv")
    public static class122 field331 = new class122(5000);

    @ObfuscatedName("client.ch")
    public static class122 field332 = new class122(5000);

    @ObfuscatedName("client.cn")
    public static class122 field333 = new class122(15000);

    @ObfuscatedName("client.cy")
    public static int field334 = 0;

    @ObfuscatedName("client.cl")
    public static int field436 = 0;

    @ObfuscatedName("client.cg")
    public static int field336 = 0;

    @ObfuscatedName("client.cu")
    public static int field368 = 0;

    @ObfuscatedName("client.cr")
    public static int field415 = 0;

    @ObfuscatedName("client.ca")
    public static int field339 = 0;

    @ObfuscatedName("client.cs")
    public static int field340 = 0;

    @ObfuscatedName("client.cm")
    public static int field526 = 0;

    @ObfuscatedName("client.cz")
    public static boolean field342 = false;

    @ObfuscatedName("client.df")
    public static int field295 = 0;

    @ObfuscatedName("client.dh")
    public static int field478 = 1;

    @ObfuscatedName("client.dw")
    public static int field567 = 0;

    @ObfuscatedName("client.dg")
    public static int field455 = 1;

    @ObfuscatedName("client.da")
    public static int field347 = 0;

    @ObfuscatedName("client.dx")
    public static boolean field349 = false;

    @ObfuscatedName("client.db")
    public static int[][][] field350 = new int[4][13][13];

    @ObfuscatedName("client.dl")
    public static final int[] field438 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dy")
    public static int field439 = 0;

    @ObfuscatedName("client.dj")
    public static int field353 = 2;

    @ObfuscatedName("client.dq")
    public static int field354 = 0;

    @ObfuscatedName("client.dd")
    public static int field550 = 2;

    @ObfuscatedName("client.dp")
    public static int field309 = 0;

    @ObfuscatedName("client.di")
    public static int field476 = 1;

    @ObfuscatedName("client.em")
    public static int field426 = 0;

    @ObfuscatedName("client.ew")
    public static int field359 = 0;

    @ObfuscatedName("client.ei")
    public static int field360 = 2;

    @ObfuscatedName("client.en")
    public static int field361 = 0;

    @ObfuscatedName("client.eq")
    public static int field362 = 1;

    @ObfuscatedName("client.es")
    public static int field382 = 0;

    @ObfuscatedName("client.er")
    public static int field352 = 0;

    @ObfuscatedName("client.eo")
    public static int field365 = 2301979;

    @ObfuscatedName("client.eu")
    public static int field366 = 5063219;

    @ObfuscatedName("client.eh")
    public static int field367 = 3353893;

    @ObfuscatedName("client.ep")
    public static int field355 = 7759444;

    @ObfuscatedName("client.ek")
    public static boolean field369 = false;

    @ObfuscatedName("client.ez")
    public static int field519 = 0;

    @ObfuscatedName("client.fl")
    public static int field371 = 128;

    @ObfuscatedName("client.fe")
    public static int field372 = 0;

    @ObfuscatedName("client.fi")
    public static int field373 = 0;

    @ObfuscatedName("client.fh")
    public static int field374 = 0;

    @ObfuscatedName("client.fo")
    public static int field545 = 0;

    @ObfuscatedName("client.fd")
    public static int field376 = 0;

    @ObfuscatedName("client.ft")
    public static int field377 = 50;

    @ObfuscatedName("client.fc")
    public static int field529 = 0;

    @ObfuscatedName("client.fm")
    public static boolean field542 = false;

    @ObfuscatedName("client.ff")
    public static int field380 = 0;

    @ObfuscatedName("client.fn")
    public static int field338 = 0;

    @ObfuscatedName("client.fk")
    public static int field418 = 50;

    @ObfuscatedName("client.fx")
    public static int[] field383 = new int[field418];

    @ObfuscatedName("client.fz")
    public static int[] field384 = new int[field418];

    @ObfuscatedName("client.fb")
    public static int[] field385 = new int[field418];

    @ObfuscatedName("client.fy")
    public static int[] field386 = new int[field418];

    @ObfuscatedName("client.fu")
    public static int[] field387 = new int[field418];

    @ObfuscatedName("client.fs")
    public static int[] field388 = new int[field418];

    @ObfuscatedName("client.fa")
    public static int[] field389 = new int[field418];

    @ObfuscatedName("client.gh")
    public static String[] field390 = new String[field418];

    @ObfuscatedName("client.gl")
    public static int[][] field488 = new int[104][104];

    @ObfuscatedName("client.gz")
    public static int field506 = 0;

    @ObfuscatedName("client.gk")
    public static int field518 = -1;

    @ObfuscatedName("client.go")
    public static int field394 = -1;

    @ObfuscatedName("client.gw")
    public static int field437 = 0;

    @ObfuscatedName("client.ge")
    public static int field522 = 0;

    @ObfuscatedName("client.gm")
    public static int field326 = 0;

    @ObfuscatedName("client.gs")
    public static int field398 = 0;

    @ObfuscatedName("client.ga")
    public static int field399 = 0;

    @ObfuscatedName("client.gj")
    public static int field515 = 0;

    @ObfuscatedName("client.gt")
    public static int field363 = 0;

    @ObfuscatedName("client.gr")
    public static int field441 = 0;

    @ObfuscatedName("client.gd")
    public static int field403 = 0;

    @ObfuscatedName("client.gi")
    public static int field404 = 0;

    @ObfuscatedName("client.gy")
    public static boolean field405 = false;

    @ObfuscatedName("client.gp")
    public static int field406 = 0;

    @ObfuscatedName("client.gv")
    public static int field407 = 0;

    @ObfuscatedName("client.gx")
    public static class3[] field293 = new class3[2048];

    @ObfuscatedName("client.gg")
    public static int field410 = -1;

    @ObfuscatedName("client.gu")
    public static int field494 = 0;

    @ObfuscatedName("client.he")
    public static int field412 = 0;

    @ObfuscatedName("client.hi")
    public static int[] field413 = new int[1000];

    @ObfuscatedName("client.hu")
    public static final int[] field501 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hh")
    public static String[] field428 = new String[8];

    @ObfuscatedName("client.hy")
    public static boolean[] field416 = new boolean[8];

    @ObfuscatedName("client.ht")
    public static int[] field417 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hl")
    public static int field375 = -1;

    @ObfuscatedName("client.ha")
    public static class199[][][] field419 = new class199[4][104][104];

    @ObfuscatedName("client.hr")
    public static class199 field420 = new class199();

    @ObfuscatedName("client.hs")
    public static class199 field533 = new class199();

    @ObfuscatedName("client.ho")
    public static class199 field422 = new class199();

    @ObfuscatedName("client.hj")
    public static int[] field423 = new int[25];

    @ObfuscatedName("client.hw")
    public static int[] field401 = new int[25];

    @ObfuscatedName("client.hf")
    public static int[] field425 = new int[25];

    @ObfuscatedName("client.hx")
    public static int field464 = 0;

    @ObfuscatedName("client.hn")
    public static boolean field427 = false;

    @ObfuscatedName("client.hp")
    public static int field400 = 0;

    @ObfuscatedName("client.hz")
    public static int[] field429 = new int[500];

    @ObfuscatedName("client.hb")
    public static int[] field430 = new int[500];

    @ObfuscatedName("client.ih")
    public static int[] field431 = new int[500];

    @ObfuscatedName("client.if")
    public static int[] field537 = new int[500];

    @ObfuscatedName("client.ia")
    public static String[] field433 = new String[500];

    @ObfuscatedName("client.ic")
    public static String[] field434 = new String[500];

    @ObfuscatedName("client.ie")
    public static int field435 = -1;

    @ObfuscatedName("client.ig")
    public static int field351 = -1;

    @ObfuscatedName("client.id")
    public static int field565 = 0;

    @ObfuscatedName("client.io")
    public static int field328 = 50;

    @ObfuscatedName("client.ip")
    public static int field450 = 0;

    @ObfuscatedName("client.it")
    public static String field440 = null;

    @ObfuscatedName("client.is")
    public static boolean field381 = false;

    @ObfuscatedName("client.il")
    public static int field442 = -1;

    @ObfuscatedName("client.iz")
    public static int field443 = -1;

    @ObfuscatedName("client.in")
    public static String field393 = null;

    @ObfuscatedName("client.iy")
    public static String field445 = null;

    @ObfuscatedName("client.iv")
    public static int field392 = -1;

    @ObfuscatedName("client.ij")
    public static class196 field447 = new class196(8);

    @ObfuscatedName("client.ii")
    public static int field448 = 0;

    @ObfuscatedName("client.jy")
    public static int field449 = 0;

    @ObfuscatedName("client.jx")
    public static class173 field300 = null;

    @ObfuscatedName("client.jp")
    public static int field451 = 0;

    @ObfuscatedName("client.jz")
    public static int field452 = 0;

    @ObfuscatedName("client.js")
    public static int field453 = 0;

    @ObfuscatedName("client.jr")
    public static int field446 = -1;

    @ObfuscatedName("client.jd")
    public static boolean field397 = false;

    @ObfuscatedName("client.jk")
    public static boolean field497 = false;

    @ObfuscatedName("client.jb")
    public static boolean field457 = false;

    @ObfuscatedName("client.jw")
    public static class173 field458 = null;

    @ObfuscatedName("client.jt")
    public static class173 field517 = null;

    @ObfuscatedName("client.je")
    public static class173 field505 = null;

    @ObfuscatedName("client.jn")
    public static int field461 = 0;

    @ObfuscatedName("client.ji")
    public static int field462 = 0;

    @ObfuscatedName("client.jc")
    public static class173 field463 = null;

    @ObfuscatedName("client.ja")
    public static boolean field414 = false;

    @ObfuscatedName("client.jf")
    public static int field465 = -1;

    @ObfuscatedName("client.jo")
    public static int field466 = -1;

    @ObfuscatedName("client.jv")
    public static boolean field467 = false;

    @ObfuscatedName("client.jm")
    public static int field468 = -1;

    @ObfuscatedName("client.jq")
    public static int field444 = -1;

    @ObfuscatedName("client.jh")
    public static boolean field470 = false;

    @ObfuscatedName("client.ko")
    public static int field549 = 1;

    @ObfuscatedName("client.ky")
    public static int[] field472 = new int[32];

    @ObfuscatedName("client.kq")
    public static int field473 = 0;

    @ObfuscatedName("client.ku")
    public static int[] field474 = new int[32];

    @ObfuscatedName("client.kd")
    public static int field475 = 0;

    @ObfuscatedName("client.kc")
    public static int[] field364 = new int[32];

    @ObfuscatedName("client.kl")
    public static int field477 = 0;

    @ObfuscatedName("client.ka")
    public static int field344 = 0;

    @ObfuscatedName("client.ki")
    public static int field479 = 0;

    @ObfuscatedName("client.km")
    public static int field343 = 0;

    @ObfuscatedName("client.ks")
    public static int field432 = 0;

    @ObfuscatedName("client.kz")
    public static int field482 = 0;

    @ObfuscatedName("client.kg")
    public static int field483 = 0;

    @ObfuscatedName("client.kh")
    public static int field485 = 0;

    @ObfuscatedName("client.kr")
    public static class199 field486 = new class199();

    @ObfuscatedName("client.kv")
    public static class199 field487 = new class199();

    @ObfuscatedName("client.kt")
    public static class199 field346 = new class199();

    @ObfuscatedName("client.kn")
    public static class196 field395 = new class196(512);

    @ObfuscatedName("client.kb")
    public static int field409 = 0;

    @ObfuscatedName("client.kk")
    public static int field491 = -2;

    @ObfuscatedName("client.kx")
    public static boolean[] field492 = new boolean[100];

    @ObfuscatedName("client.ls")
    public static boolean[] field484 = new boolean[100];

    @ObfuscatedName("client.li")
    public static boolean[] field481 = new boolean[100];

    @ObfuscatedName("client.lt")
    public static int[] field495 = new int[100];

    @ObfuscatedName("client.ln")
    public static int[] field496 = new int[100];

    @ObfuscatedName("client.lk")
    public static int[] field536 = new int[100];

    @ObfuscatedName("client.lb")
    public static int[] field337 = new int[100];

    @ObfuscatedName("client.lh")
    public static int field499 = 0;

    @ObfuscatedName("client.la")
    public static long field500 = 0L;

    @ObfuscatedName("client.le")
    public static boolean field511 = true;

    @ObfuscatedName("client.ld")
    public static int field502 = 765;

    @ObfuscatedName("client.lu")
    public static int field503 = 1;

    @ObfuscatedName("client.ly")
    public static int[] field504 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lz")
    public static int field356 = 0;

    @ObfuscatedName("client.lo")
    public static int field285 = 0;

    @ObfuscatedName("client.lw")
    public static String field507 = "";

    @ObfuscatedName("client.lv")
    public static long[] field532 = new long[100];

    @ObfuscatedName("client.lg")
    public static int field509 = 0;

    @ObfuscatedName("client.lc")
    public static int field510 = 0;

    @ObfuscatedName("client.lr")
    public static int[] field534 = new int[128];

    @ObfuscatedName("client.mb")
    public static int[] field512 = new int[128];

    @ObfuscatedName("client.mk")
    public static long field513 = -1L;

    @ObfuscatedName("client.mh")
    public static String field514 = null;

    @ObfuscatedName("client.ml")
    public static String field402 = null;

    @ObfuscatedName("client.mo")
    public static int field516 = -1;

    @ObfuscatedName("client.mt")
    public static int field569 = 0;

    @ObfuscatedName("client.me")
    public static int[] field396 = new int[1000];

    @ObfuscatedName("client.my")
    public static int[] field370 = new int[1000];

    @ObfuscatedName("client.mn")
    public static class79[] field520 = new class79[1000];

    @ObfuscatedName("client.mx")
    public static int field469 = 0;

    @ObfuscatedName("client.mz")
    public static int field480 = 0;

    @ObfuscatedName("client.mc")
    public static int field523 = 0;

    @ObfuscatedName("client.mu")
    public static int field357 = 255;

    @ObfuscatedName("client.mg")
    public static int field525 = -1;

    @ObfuscatedName("client.mw")
    public static boolean field320 = false;

    @ObfuscatedName("client.ne")
    public static int field527 = 127;

    @ObfuscatedName("client.nz")
    public static int field528 = 127;

    @ObfuscatedName("client.nx")
    public static int field345 = 0;

    @ObfuscatedName("client.nv")
    public static int[] field530 = new int[50];

    @ObfuscatedName("client.ng")
    public static int[] field531 = new int[50];

    @ObfuscatedName("client.nb")
    public static int[] field306 = new int[50];

    @ObfuscatedName("client.nw")
    public static int[] field498 = new int[50];

    @ObfuscatedName("client.nm")
    public static class59[] field302 = new class59[50];

    @ObfuscatedName("client.nf")
    public static boolean field535 = false;

    @ObfuscatedName("client.na")
    public static boolean[] field335 = new boolean[5];

    @ObfuscatedName("client.oc")
    public static int[] field471 = new int[5];

    @ObfuscatedName("client.om")
    public static int[] field538 = new int[5];

    @ObfuscatedName("client.oz")
    public static int[] field539 = new int[5];

    @ObfuscatedName("client.ot")
    public static int[] field540 = new int[5];

    @ObfuscatedName("client.os")
    public static short field541 = 256;

    @ObfuscatedName("client.ov")
    public static short field411 = 205;

    @ObfuscatedName("client.oi")
    public static short field543 = 256;

    @ObfuscatedName("client.ow")
    public static short field544 = 320;

    @ObfuscatedName("client.of")
    public static short field557 = 1;

    @ObfuscatedName("client.od")
    public static short field546 = 32767;

    @ObfuscatedName("client.ou")
    public static short field547 = 1;

    @ObfuscatedName("client.oo")
    public static short field548 = 32767;

    @ObfuscatedName("client.oy")
    public static int field524 = 0;

    @ObfuscatedName("client.oh")
    public static int field560 = 0;

    @ObfuscatedName("client.oq")
    public static int field551 = 0;

    @ObfuscatedName("client.or")
    public static int field552 = 0;

    @ObfuscatedName("client.oa")
    public static int field553 = 0;

    @ObfuscatedName("client.oj")
    public static int field554 = 0;

    @ObfuscatedName("client.og")
    public static int field555 = 0;

    @ObfuscatedName("client.ox")
    public static class18[] field556 = new class18[400];

    @ObfuscatedName("client.on")
    public static class195 field301 = new class195();

    @ObfuscatedName("client.op")
    public static int field558 = 0;

    @ObfuscatedName("client.ok")
    public static class8[] field559 = new class8[400];

    @ObfuscatedName("client.oe")
    public static class179 field493 = new class179();

    @ObfuscatedName("client.pj")
    public static int field561 = -1;

    @ObfuscatedName("client.pg")
    public static int field562 = -1;

    @ObfuscatedName("client.pu")
    public static class220[] field563 = new class220[8];

    @ObfuscatedName("client.py")
    public static long field564 = -1L;

    @ObfuscatedName("client.pk")
    public static long field489 = -1L;

    @ObfuscatedName("client.pm")
    public static final class11 field566 = new class11();

    @ObfuscatedName("client.pc")
    public static int[] field456 = new int[50];

    @ObfuscatedName("client.pz")
    public static int[] field568 = new int[50];

    @ObfuscatedName("client.i(I)V")
    public final void method415() {
    }

    public final void init() {
        if (!this.method2801()) {
            return;
        }
        class190[] var1 = new class190[] { class190.field3042, class190.field3037, class190.field3039, class190.field3050, class190.field3049, class190.field3047, class190.field3045, class190.field3044, class190.field3040, class190.field3046, class190.field3038, class190.field3041, class190.field3051, class190.field3043, class190.field3048 };
        class190[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class190 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3052);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3052)) {
                    case 2:
                        field289 = Integer.parseInt(var5);
                        break;
                    case 3:
                        if (var5.equalsIgnoreCase(class2.field29)) {
                            field292 = true;
                        } else {
                            field292 = false;
                        }
                        break;
                    case 4:
                        Statics.field1957 = (class154) class109.method787(class154.method551(), Integer.parseInt(var5));
                        if (Statics.field1957 == class154.field2276) {
                            Statics.field291 = class212.field3118;
                        } else {
                            Statics.field291 = class212.field3129;
                        }
                        break;
                    case 5:
                        Statics.field460 = var5;
                        break;
                    case 6:
                        Statics.field3212 = class153.method2237(Integer.parseInt(var5));
                        break;
                    case 7:
                        field294 = Integer.parseInt(var5);
                        break;
                    case 8:
                        Statics.field2652 = Integer.parseInt(var5);
                        break;
                    case 9:
                        if (var5.equalsIgnoreCase(class2.field29)) {
                        }
                        break;
                    case 10:
                        Statics.field296 = Integer.parseInt(var5);
                        break;
                    case 11:
                        Statics.field1986 = var5;
                        break;
                    case 12:
                        field290 = Integer.parseInt(var5);
                    case 13:
                    default:
                        break;
                    case 14:
                        field288 = Integer.parseInt(var5);
                }
            }
        }
        method2215();
        Statics.field1517 = this.getCodeBase().getHost();
        String var6 = Statics.field3212.field2269;
        byte var7 = 0;
        try {
            class149.method2233("oldschool", var6, var7, 16);
        } catch (Exception var9) {
            class148.method2604((String) null, var9);
        }
        Statics.field286 = this;
        this.method2791(765, 503, 97);
    }

    @ObfuscatedName("dh.q(I)V")
    public static final void method2215() {
        class86.field1484 = false;
        field570 = false;
    }

    @ObfuscatedName("client.u(B)V")
    public final void method228() {
        Statics.field1514 = field290 == 0 ? 43594 : field288 + 40000;
        Statics.field1351 = field290 == 0 ? 443 : field288 + 50000;
        Statics.field1080 = Statics.field1514;
        Statics.field2644 = class174.field2891;
        Statics.field2215 = class174.field2889;
        Statics.field572 = class174.field2888;
        Statics.field1968 = class174.field2894;
        if (Statics.field2084.toLowerCase().indexOf("microsoft") == -1) {
            class137.field2115[44] = 71;
            class137.field2115[45] = 26;
            class137.field2115[46] = 72;
            class137.field2115[47] = 73;
            class137.field2115[59] = 57;
            class137.field2115[61] = 27;
            class137.field2115[91] = 42;
            class137.field2115[92] = 74;
            class137.field2115[93] = 43;
            class137.field2115[192] = 28;
            class137.field2115[222] = 58;
            class137.field2115[520] = 59;
        } else {
            class137.field2115[186] = 57;
            class137.field2115[187] = 27;
            class137.field2115[188] = 71;
            class137.field2115[189] = 26;
            class137.field2115[190] = 72;
            class137.field2115[191] = 73;
            class137.field2115[192] = 58;
            class137.field2115[219] = 42;
            class137.field2115[220] = 74;
            class137.field2115[221] = 43;
            class137.field2115[222] = 59;
            class137.field2115[223] = 28;
        }
        Canvas var1 = Statics.field1038;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class137.field2109);
        var1.addFocusListener(class137.field2109);
        class140.method2571(Statics.field1038);
        Statics.field1428 = class131.method136();
        if (Statics.field1428 != null) {
            Statics.field1428.method2611(Statics.field1038);
        }
        Statics.field1147 = new class134(255, class149.field2223, class149.field2227, 500000);
        class227 var2 = null;
        class9 var3 = new class9();
        try {
            var2 = class149.method903("", Statics.field1957.field2273, false);
            byte[] var4 = new byte[(int) var2.method3810()];
            int var6;
            for (int var5 = 0; var5 < var4.length; var5 += var6) {
                var6 = var2.method3811(var4, var5, var4.length - var5);
                if (var6 == -1) {
                    throw new IOException();
                }
            }
            var3 = new class9(new class119(var4));
        } catch (Exception var16) {
        }
        try {
            if (var2 != null) {
                var2.method3809();
            }
        } catch (Exception var15) {
        }
        Statics.field1030 = var3;
        Statics.field1877 = this.getToolkit().getSystemClipboard();
        String var11 = Statics.field2085;
        class138.field2122 = this;
        class138.field2120 = var11;
        if (field290 != 0) {
            field305 = true;
        }
        int var12 = Statics.field1030.field148;
        field500 = 0L;
        if (var12 >= 2) {
            field511 = true;
        } else {
            field511 = false;
        }
        method2679();
        if (field297 >= 25) {
            field331.method2555(11);
            class122 var13 = field331;
            int var14 = field511 ? 2 : 1;
            var13.method2347(var14);
            field331.method2318(Statics.field2178);
            field331.method2318(Statics.field164);
        }
        field2181 = true;
    }

    @ObfuscatedName("client.m(I)V")
    public final void method229() {
        field299++;
        this.method232();
        class170.method631();
        try {
            if (class183.field2946 == 1) {
                int var1 = Statics.field3197.method3315();
                if (var1 > 0 && Statics.field3197.method3321()) {
                    int var2 = var1 - Statics.field72;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field3197.method3314(var2);
                } else {
                    Statics.field3197.method3320();
                    Statics.field3197.method3318();
                    if (Statics.field714 == null) {
                        class183.field2946 = 0;
                    } else {
                        class183.field2946 = 2;
                    }
                    Statics.field225 = null;
                    Statics.field2910 = null;
                }
            }
        } catch (Exception var346) {
            var346.printStackTrace();
            Statics.field3197.method3320();
            class183.field2946 = 0;
            Statics.field225 = null;
            Statics.field2910 = null;
            Statics.field714 = null;
        }
        method1973();
        class137 var4 = class137.field2109;
        synchronized (class137.field2109) {
            class137.field2086++;
            class137.field2098 = class137.field2113;
            class137.field2110 = 0;
            if (class137.field2106 >= 0) {
                while (class137.field2106 != class137.field2105) {
                    int var6 = class137.field2104[class137.field2105];
                    class137.field2105 = class137.field2105 + 1 & 0x7F;
                    if (var6 < 0) {
                        class137.field2112[~var6] = false;
                    } else {
                        if (!class137.field2112[var6] && class137.field2110 < class137.field2116.length - 1) {
                            class137.field2116[++class137.field2110 - 1] = var6;
                        }
                        class137.field2112[var6] = true;
                    }
                }
            } else {
                for (int var5 = 0; var5 < 112; var5++) {
                    class137.field2112[var5] = false;
                }
                class137.field2106 = class137.field2105;
            }
            class137.field2113 = class137.field2114;
        }
        class140 var8 = class140.field2132;
        synchronized (class140.field2132) {
            class140.field2137 = class140.field2134;
            class140.field2150 = class140.field2141;
            class140.field2139 = class140.field2136 * -1925873959;
            class140.field2144 = class140.field2135;
            class140.field2145 = class140.field2143;
            class140.field2146 = class140.field2142;
            class140.field2147 = class140.field2148;
            class140.field2135 = 0;
        }
        if (Statics.field1428 != null) {
            int var10 = Statics.field1428.method2615();
            field485 = var10;
        }
        int var10002;
        if (field297 == 0) {
            method2607();
            Statics.field780.method2625();
            for (int var11 = 0; var11 < 32; var11++) {
                field2185[var11] = 0L;
            }
            for (int var12 = 0; var12 < 32; var12++) {
                field2194[var12] = 0L;
            }
            Statics.field1192 = 0;
        } else if (field297 == 5) {
            class32.method84(this);
            method2607();
            Statics.field780.method2625();
            for (int var13 = 0; var13 < 32; var13++) {
                field2185[var13] = 0L;
            }
            for (int var14 = 0; var14 < 32; var14++) {
                field2194[var14] = 0L;
            }
            Statics.field1192 = 0;
        } else if (field297 == 10 || field297 == 11) {
            class32.method84(this);
        } else if (field297 == 20) {
            class32.method84(this);
            method1();
        } else if (field297 == 25) {
            method2177(false);
            field295 = 0;
            boolean var15 = true;
            for (int var16 = 0; var16 < Statics.field137.length; var16++) {
                if (Statics.field2626[var16] != -1 && Statics.field137[var16] == null) {
                    Statics.field137[var16] = Statics.field3133.method3030(Statics.field2626[var16], 0);
                    if (Statics.field137[var16] == null) {
                        var15 = false;
                        field295++;
                    }
                }
                if (Statics.field60[var16] != -1 && Statics.field3145[var16] == null) {
                    Statics.field3145[var16] = Statics.field3133.method3013(Statics.field60[var16], 0, Statics.field1430[var16]);
                    if (Statics.field3145[var16] == null) {
                        var15 = false;
                        field295++;
                    }
                }
            }
            if (var15) {
                field567 = 0;
                boolean var17 = true;
                for (int var18 = 0; var18 < Statics.field137.length; var18++) {
                    byte[] var19 = Statics.field3145[var18];
                    if (var19 != null) {
                        int var20 = (Statics.field264[var18] >> 8) * 64 - Statics.field585;
                        int var21 = (Statics.field264[var18] & 0xFF) * 64 - Statics.field57;
                        if (field349) {
                            var20 = 10;
                            var21 = 10;
                        }
                        var17 &= class6.method7(var19, var20, var21);
                    }
                }
                if (var17) {
                    if (field347 != 0) {
                        method1115(class157.field2308 + class2.field27 + class2.field24 + 100 + "%" + class2.field28, true);
                    }
                    method1973();
                    method3439();
                    method1973();
                    Statics.field107.method1721();
                    method1973();
                    System.gc();
                    for (int var22 = 0; var22 < 4; var22++) {
                        field348[var22].method2176();
                    }
                    for (int var23 = 0; var23 < 4; var23++) {
                        for (int var24 = 0; var24 < 104; var24++) {
                            for (int var25 = 0; var25 < 104; var25++) {
                                class6.field84[var23][var24][var25] = 0;
                            }
                        }
                    }
                    method1973();
                    Statics.method132();
                    int var26 = Statics.field137.length;
                    class24.method549();
                    method2177(true);
                    if (!field349) {
                        int var27 = 0;
                        label1929: while (true) {
                            if (var27 >= var26) {
                                for (int var41 = 0; var41 < var26; var41++) {
                                    int var42 = (Statics.field264[var41] >> 8) * 64 - Statics.field585;
                                    int var43 = (Statics.field264[var41] & 0xFF) * 64 - Statics.field57;
                                    byte[] var44 = Statics.field137[var41];
                                    if (var44 == null && Statics.field2664 < 800) {
                                        method1973();
                                        class6.method2674(var42, var43, 64, 64);
                                    }
                                }
                                method2177(true);
                                int var45 = 0;
                                while (true) {
                                    if (var45 >= var26) {
                                        break label1929;
                                    }
                                    byte[] var46 = Statics.field3145[var45];
                                    if (var46 != null) {
                                        int var47 = (Statics.field264[var45] >> 8) * 64 - Statics.field585;
                                        int var48 = (Statics.field264[var45] & 0xFF) * 64 - Statics.field57;
                                        method1973();
                                        class86 var49 = Statics.field107;
                                        class108[] var50 = field348;
                                        class119 var51 = new class119(var46);
                                        int var52 = -1;
                                        while (true) {
                                            int var53 = var51.method2303();
                                            if (var53 == 0) {
                                                break;
                                            }
                                            var52 += var53;
                                            int var54 = 0;
                                            while (true) {
                                                int var55 = var51.method2303();
                                                if (var55 == 0) {
                                                    break;
                                                }
                                                var54 += var55 - 1;
                                                int var56 = var54 & 0x3F;
                                                int var57 = var54 >> 6 & 0x3F;
                                                int var58 = var54 >> 12;
                                                int var59 = var51.method2290();
                                                int var60 = var59 >> 2;
                                                int var61 = var59 & 0x3;
                                                int var62 = var47 + var57;
                                                int var63 = var48 + var56;
                                                if (var62 > 0 && var63 > 0 && var62 < 103 && var63 < 103) {
                                                    int var64 = var58;
                                                    if ((class6.field84[1][var62][var63] & 0x2) == 2) {
                                                        var64 = var58 - 1;
                                                    }
                                                    class108 var65 = null;
                                                    if (var64 >= 0) {
                                                        var65 = var50[var64];
                                                    }
                                                    class6.method3101(var58, var62, var63, var52, var61, var60, var49, var65);
                                                }
                                            }
                                        }
                                    }
                                    var45++;
                                }
                            }
                            int var28 = (Statics.field264[var27] >> 8) * 64 - Statics.field585;
                            int var29 = (Statics.field264[var27] & 0xFF) * 64 - Statics.field57;
                            byte[] var30 = Statics.field137[var27];
                            if (var30 != null) {
                                method1973();
                                int var31 = Statics.field1988 * 8 - 48;
                                int var32 = Statics.field2664 * 8 - 48;
                                class108[] var33 = field348;
                                int var34 = 0;
                                label1926: while (true) {
                                    if (var34 >= 4) {
                                        class119 var37 = new class119(var30);
                                        int var38 = 0;
                                        while (true) {
                                            if (var38 >= 4) {
                                                break label1926;
                                            }
                                            for (int var39 = 0; var39 < 64; var39++) {
                                                for (int var40 = 0; var40 < 64; var40++) {
                                                    class6.method700(var37, var38, var28 + var39, var29 + var40, var31, var32, 0);
                                                }
                                            }
                                            var38++;
                                        }
                                    }
                                    for (int var35 = 0; var35 < 64; var35++) {
                                        for (int var36 = 0; var36 < 64; var36++) {
                                            if (var28 + var35 > 0 && var28 + var35 < 103 && var29 + var36 > 0 && var29 + var36 < 103) {
                                                var33[var34].field1896[var28 + var35][var29 + var36] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var34++;
                                }
                            }
                            var27++;
                        }
                    }
                    if (field349) {
                        int var66 = 0;
                        label1862: while (true) {
                            if (var66 >= 4) {
                                for (int var84 = 0; var84 < 13; var84++) {
                                    for (int var85 = 0; var85 < 13; var85++) {
                                        int var86 = field350[0][var84][var85];
                                        if (var86 == -1) {
                                            class6.method2674(var84 * 8, var85 * 8, 8, 8);
                                        }
                                    }
                                }
                                method2177(true);
                                int var87 = 0;
                                while (true) {
                                    if (var87 >= 4) {
                                        break label1862;
                                    }
                                    method1973();
                                    for (int var88 = 0; var88 < 13; var88++) {
                                        label1785: for (int var89 = 0; var89 < 13; var89++) {
                                            int var90 = field350[var87][var88][var89];
                                            if (var90 != -1) {
                                                int var91 = var90 >> 24 & 0x3;
                                                int var92 = var90 >> 1 & 0x3;
                                                int var93 = var90 >> 14 & 0x3FF;
                                                int var94 = var90 >> 3 & 0x7FF;
                                                int var95 = (var93 / 8 << 8) + var94 / 8;
                                                for (int var96 = 0; var96 < Statics.field264.length; var96++) {
                                                    if (Statics.field264[var96] == var95 && Statics.field3145[var96] != null) {
                                                        byte[] var97 = Statics.field3145[var96];
                                                        int var98 = var88 * 8;
                                                        int var99 = var89 * 8;
                                                        int var100 = (var93 & 0x7) * 8;
                                                        int var101 = (var94 & 0x7) * 8;
                                                        class86 var102 = Statics.field107;
                                                        class108[] var103 = field348;
                                                        class119 var104 = new class119(var97);
                                                        int var105 = -1;
                                                        while (true) {
                                                            int var106 = var104.method2303();
                                                            if (var106 == 0) {
                                                                continue label1785;
                                                            }
                                                            var105 += var106;
                                                            int var107 = 0;
                                                            while (true) {
                                                                int var108 = var104.method2303();
                                                                if (var108 == 0) {
                                                                    break;
                                                                }
                                                                var107 += var108 - 1;
                                                                int var109 = var107 & 0x3F;
                                                                int var110 = var107 >> 6 & 0x3F;
                                                                int var111 = var107 >> 12;
                                                                int var112 = var104.method2290();
                                                                int var113 = var112 >> 2;
                                                                int var114 = var112 & 0x3;
                                                                if (var91 == var111 && var110 >= var100 && var110 < var100 + 8 && var109 >= var101 && var109 < var101 + 8) {
                                                                    class41 var115 = class41.method2717(var105);
                                                                    int var116 = var98 + class177.method178(var110 & 0x7, var109 & 0x7, var92, var115.field929, var115.field920, var114);
                                                                    int var118 = var110 & 0x7;
                                                                    int var119 = var109 & 0x7;
                                                                    int var121 = var115.field929;
                                                                    int var122 = var115.field920;
                                                                    if ((var114 & 0x1) == 1) {
                                                                        int var123 = var121;
                                                                        var121 = var122;
                                                                        var122 = var123;
                                                                    }
                                                                    int var124 = var92 & 0x3;
                                                                    int var125;
                                                                    if (var124 == 0) {
                                                                        var125 = var119;
                                                                    } else if (var124 == 1) {
                                                                        var125 = 7 - var118 - (var121 - 1);
                                                                    } else if (var124 == 2) {
                                                                        var125 = 7 - var119 - (var122 - 1);
                                                                    } else {
                                                                        var125 = var118;
                                                                    }
                                                                    int var126 = var99 + var125;
                                                                    if (var116 > 0 && var126 > 0 && var116 < 103 && var126 < 103) {
                                                                        int var127 = var87;
                                                                        if ((class6.field84[1][var116][var126] & 0x2) == 2) {
                                                                            var127 = var87 - 1;
                                                                        }
                                                                        class108 var128 = null;
                                                                        if (var127 >= 0) {
                                                                            var128 = var103[var127];
                                                                        }
                                                                        class6.method3101(var87, var116, var126, var105, var92 + var114 & 0x3, var113, var102, var128);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var87++;
                                }
                            }
                            method1973();
                            for (int var67 = 0; var67 < 13; var67++) {
                                for (int var68 = 0; var68 < 13; var68++) {
                                    boolean var69 = false;
                                    int var70 = field350[var66][var67][var68];
                                    if (var70 != -1) {
                                        int var71 = var70 >> 24 & 0x3;
                                        int var72 = var70 >> 1 & 0x3;
                                        int var73 = var70 >> 14 & 0x3FF;
                                        int var74 = var70 >> 3 & 0x7FF;
                                        int var75 = (var73 / 8 << 8) + var74 / 8;
                                        for (int var76 = 0; var76 < Statics.field264.length; var76++) {
                                            if (Statics.field264[var76] == var75 && Statics.field137[var76] != null) {
                                                class6.method57(Statics.field137[var76], var66, var67 * 8, var68 * 8, var71, (var73 & 0x7) * 8, (var74 & 0x7) * 8, var72, field348);
                                                var69 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var69) {
                                        int var77 = var66;
                                        int var78 = var67 * 8;
                                        int var79 = var68 * 8;
                                        for (int var80 = 0; var80 < 8; var80++) {
                                            for (int var81 = 0; var81 < 8; var81++) {
                                                class6.field83[var77][var78 + var80][var79 + var81] = 0;
                                            }
                                        }
                                        if (var78 > 0) {
                                            for (int var82 = 1; var82 < 8; var82++) {
                                                class6.field83[var77][var78][var79 + var82] = class6.field83[var77][var78 - 1][var79 + var82];
                                            }
                                        }
                                        if (var79 > 0) {
                                            for (int var83 = 1; var83 < 8; var83++) {
                                                class6.field83[var77][var78 + var83][var79] = class6.field83[var77][var78 + var83][var79 - 1];
                                            }
                                        }
                                        if (var78 > 0 && class6.field83[var77][var78 - 1][var79] != 0) {
                                            class6.field83[var77][var78][var79] = class6.field83[var77][var78 - 1][var79];
                                        } else if (var79 > 0 && class6.field83[var77][var78][var79 - 1] != 0) {
                                            class6.field83[var77][var78][var79] = class6.field83[var77][var78][var79 - 1];
                                        } else if (var78 > 0 && var79 > 0 && class6.field83[var77][var78 - 1][var79 - 1] != 0) {
                                            class6.field83[var77][var78][var79] = class6.field83[var77][var78 - 1][var79 - 1];
                                        }
                                    }
                                }
                            }
                            var66++;
                        }
                    }
                    method2177(true);
                    method3439();
                    method1973();
                    class86 var129 = Statics.field107;
                    class108[] var130 = field348;
                    for (int var131 = 0; var131 < 4; var131++) {
                        for (int var132 = 0; var132 < 104; var132++) {
                            for (int var133 = 0; var133 < 104; var133++) {
                                if ((class6.field84[var131][var132][var133] & 0x1) == 1) {
                                    int var134 = var131;
                                    if ((class6.field84[1][var132][var133] & 0x2) == 2) {
                                        var134 = var131 - 1;
                                    }
                                    if (var134 >= 0) {
                                        var130[var134].method2179(var132, var133);
                                    }
                                }
                            }
                        }
                    }
                    class6.field97 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field97 < -8) {
                        class6.field97 = -8;
                    }
                    if (class6.field97 > 8) {
                        class6.field97 = 8;
                    }
                    class6.field98 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field98 < -16) {
                        class6.field98 = -16;
                    }
                    if (class6.field98 > 16) {
                        class6.field98 = 16;
                    }
                    for (int var135 = 0; var135 < 4; var135++) {
                        byte[][] var136 = Statics.field2159[var135];
                        int var137 = (int) Math.sqrt(5100.0D);
                        int var138 = var137 * 768 >> 8;
                        for (int var139 = 1; var139 < 103; var139++) {
                            for (int var140 = 1; var140 < 103; var140++) {
                                int var141 = class6.field83[var135][var140 + 1][var139] - class6.field83[var135][var140 - 1][var139];
                                int var142 = class6.field83[var135][var140][var139 + 1] - class6.field83[var135][var140][var139 - 1];
                                int var143 = (int) Math.sqrt((double) (var142 * var142 + var141 * var141 + 65536));
                                int var144 = (var141 << 8) / var143;
                                int var145 = 65536 / var143;
                                int var146 = (var142 << 8) / var143;
                                int var147 = (var146 * -50 + var144 * -50 + var145 * -10) / var138 + 96;
                                int var148 = (var136[var140][var139] >> 1) + (var136[var140][var139 + 1] >> 3) + (var136[var140][var139 - 1] >> 2) + (var136[var140 - 1][var139] >> 2) + (var136[var140 + 1][var139] >> 3);
                                Statics.field87[var140][var139] = var147 - var148;
                            }
                        }
                        for (int var149 = 0; var149 < 104; var149++) {
                            Statics.field2124[var149] = 0;
                            Statics.field95[var149] = 0;
                            Statics.field1963[var149] = 0;
                            Statics.field89[var149] = 0;
                            Statics.field90[var149] = 0;
                        }
                        for (int var150 = -5; var150 < 109; var150++) {
                            for (int var151 = 0; var151 < 104; var151++) {
                                int var152 = var150 + 5;
                                if (var152 >= 0 && var152 < 104) {
                                    int var153 = Statics.field86[var135][var152][var151] & 0xFF;
                                    if (var153 > 0) {
                                        class42 var154 = class42.method184(var153 - 1);
                                        Statics.field2124[var151] += var154.field964;
                                        Statics.field95[var151] += var154.field972;
                                        Statics.field1963[var151] += var154.field968;
                                        Statics.field89[var151] += var154.field970;
                                        var10002 = Statics.field90[var151]++;
                                    }
                                }
                                int var155 = var150 - 5;
                                if (var155 >= 0 && var155 < 104) {
                                    int var156 = Statics.field86[var135][var155][var151] & 0xFF;
                                    if (var156 > 0) {
                                        class42 var157 = class42.method184(var156 - 1);
                                        Statics.field2124[var151] -= var157.field964;
                                        Statics.field95[var151] -= var157.field972;
                                        Statics.field1963[var151] -= var157.field968;
                                        Statics.field89[var151] -= var157.field970;
                                        var10002 = Statics.field90[var151]--;
                                    }
                                }
                            }
                            if (var150 >= 1 && var150 < 103) {
                                int var158 = 0;
                                int var159 = 0;
                                int var160 = 0;
                                int var161 = 0;
                                int var162 = 0;
                                for (int var163 = -5; var163 < 109; var163++) {
                                    int var164 = var163 + 5;
                                    if (var164 >= 0 && var164 < 104) {
                                        var158 += Statics.field2124[var164];
                                        var159 += Statics.field95[var164];
                                        var160 += Statics.field1963[var164];
                                        var161 += Statics.field89[var164];
                                        var162 += Statics.field90[var164];
                                    }
                                    int var165 = var163 - 5;
                                    if (var165 >= 0 && var165 < 104) {
                                        var158 -= Statics.field2124[var165];
                                        var159 -= Statics.field95[var165];
                                        var160 -= Statics.field1963[var165];
                                        var161 -= Statics.field89[var165];
                                        var162 -= Statics.field90[var165];
                                    }
                                    if (var163 >= 1 && var163 < 103 && (!field570 || (class6.field84[0][var150][var163] & 0x2) != 0 || (class6.field84[var135][var150][var163] & 0x10) == 0)) {
                                        if (var135 < class6.field104) {
                                            class6.field104 = var135;
                                        }
                                        int var166 = Statics.field86[var135][var150][var163] & 0xFF;
                                        int var167 = Statics.field774[var135][var150][var163] & 0xFF;
                                        if (var166 > 0 || var167 > 0) {
                                            int var168 = class6.field83[var135][var150][var163];
                                            int var169 = class6.field83[var135][var150 + 1][var163];
                                            int var170 = class6.field83[var135][var150 + 1][var163 + 1];
                                            int var171 = class6.field83[var135][var150][var163 + 1];
                                            int var172 = Statics.field87[var150][var163];
                                            int var173 = Statics.field87[var150 + 1][var163];
                                            int var174 = Statics.field87[var150 + 1][var163 + 1];
                                            int var175 = Statics.field87[var150][var163 + 1];
                                            int var176 = -1;
                                            int var177 = -1;
                                            if (var166 > 0) {
                                                int var178 = var158 * 256 / var161;
                                                int var179 = var159 / var162;
                                                int var180 = var160 / var162;
                                                var176 = class6.method86(var178, var179, var180);
                                                int var181 = class6.field97 + var178 & 0xFF;
                                                int var182 = class6.field98 + var180;
                                                if (var182 < 0) {
                                                    var182 = 0;
                                                } else if (var182 > 255) {
                                                    var182 = 255;
                                                }
                                                var177 = class6.method86(var181, var179, var182);
                                            }
                                            if (var135 > 0) {
                                                boolean var183 = true;
                                                if (var166 == 0 && Statics.field2052[var135][var150][var163] != 0) {
                                                    var183 = false;
                                                }
                                                if (var167 > 0) {
                                                    int var184 = var167 - 1;
                                                    class47 var185 = (class47) class47.field1042.method3456((long) var184);
                                                    class47 var186;
                                                    if (var185 == null) {
                                                        byte[] var187 = Statics.field1057.method3030(4, var184);
                                                        class47 var188 = new class47();
                                                        if (var187 != null) {
                                                            var188.method909(new class119(var187), var184);
                                                        }
                                                        var188.method907();
                                                        class47.field1042.method3451(var188, (long) var184);
                                                        var186 = var188;
                                                    } else {
                                                        var186 = var185;
                                                    }
                                                    if (!var186.field1045) {
                                                        var183 = false;
                                                    }
                                                }
                                                if (var183 && var168 == var169 && var168 == var170 && var168 == var171) {
                                                    Statics.field8[var135][var150][var163] |= 0x924;
                                                }
                                            }
                                            int var189 = 0;
                                            if (var177 != -1) {
                                                var189 = class91.field1566[class6.method33(var177, 96)];
                                            }
                                            if (var167 == 0) {
                                                var129.method1778(var135, var150, var163, 0, 0, -1, var168, var169, var170, var171, class6.method33(var176, var172), class6.method33(var176, var173), class6.method33(var176, var174), class6.method33(var176, var175), 0, 0, 0, 0, var189, 0);
                                            } else {
                                                int var190 = Statics.field2052[var135][var150][var163] + 1;
                                                byte var191 = Statics.field592[var135][var150][var163];
                                                int var192 = var167 - 1;
                                                class47 var193 = (class47) class47.field1042.method3456((long) var192);
                                                class47 var194;
                                                if (var193 == null) {
                                                    byte[] var195 = Statics.field1057.method3030(4, var192);
                                                    class47 var196 = new class47();
                                                    if (var195 != null) {
                                                        var196.method909(new class119(var195), var192);
                                                    }
                                                    var196.method907();
                                                    class47.field1042.method3451(var196, (long) var192);
                                                    var194 = var196;
                                                } else {
                                                    var194 = var193;
                                                }
                                                int var198 = var194.field1044;
                                                int var199;
                                                int var200;
                                                if (var198 >= 0) {
                                                    var199 = Statics.field1576.method1961(var198);
                                                    var200 = -1;
                                                } else if (var194.field1056 == 16711935) {
                                                    var200 = -2;
                                                    var198 = -1;
                                                    var199 = -2;
                                                } else {
                                                    var200 = class6.method86(var194.field1047, var194.field1048, var194.field1043);
                                                    int var201 = class6.field97 + var194.field1047 & 0xFF;
                                                    int var202 = class6.field98 + var194.field1043;
                                                    if (var202 < 0) {
                                                        var202 = 0;
                                                    } else if (var202 > 255) {
                                                        var202 = 255;
                                                    }
                                                    var199 = class6.method86(var201, var194.field1048, var202);
                                                }
                                                int var203 = 0;
                                                if (var199 != -2) {
                                                    var203 = class91.field1566[class6.method2217(var199, 96)];
                                                }
                                                if (var194.field1046 != -1) {
                                                    int var204 = class6.field97 + var194.field1041 & 0xFF;
                                                    int var205 = class6.field98 + var194.field1052;
                                                    if (var205 < 0) {
                                                        var205 = 0;
                                                    } else if (var205 > 255) {
                                                        var205 = 255;
                                                    }
                                                    int var206 = class6.method86(var204, var194.field1050, var205);
                                                    var203 = class91.field1566[class6.method2217(var206, 96)];
                                                }
                                                var129.method1778(var135, var150, var163, var190, var191, var198, var168, var169, var170, var171, class6.method33(var176, var172), class6.method33(var176, var173), class6.method33(var176, var174), class6.method33(var176, var175), class6.method2217(var200, var172), class6.method2217(var200, var173), class6.method2217(var200, var174), class6.method2217(var200, var175), var189, var203);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var207 = 1; var207 < 103; var207++) {
                            for (int var208 = 1; var208 < 103; var208++) {
                                var129.method1725(var135, var208, var207, class6.method729(var135, var208, var207));
                            }
                        }
                        Statics.field86[var135] = (byte[][]) null;
                        Statics.field774[var135] = (byte[][]) null;
                        Statics.field2052[var135] = (byte[][]) null;
                        Statics.field592[var135] = (byte[][]) null;
                        Statics.field2159[var135] = (byte[][]) null;
                    }
                    var129.method1752(-50, -10, -50);
                    for (int var209 = 0; var209 < 104; var209++) {
                        for (int var210 = 0; var210 < 104; var210++) {
                            if ((class6.field84[1][var209][var210] & 0x2) == 2) {
                                var129.method1723(var209, var210);
                            }
                        }
                    }
                    int var211 = 1;
                    int var212 = 2;
                    int var213 = 4;
                    for (int var214 = 0; var214 < 4; var214++) {
                        if (var214 > 0) {
                            var211 <<= 0x3;
                            var212 <<= 0x3;
                            var213 <<= 0x3;
                        }
                        for (int var215 = 0; var215 <= var214; var215++) {
                            for (int var216 = 0; var216 <= 104; var216++) {
                                for (int var217 = 0; var217 <= 104; var217++) {
                                    if ((Statics.field8[var215][var217][var216] & var211) != 0) {
                                        int var218 = var216;
                                        int var219 = var216;
                                        int var220 = var215;
                                        int var221 = var215;
                                        while (var218 > 0 && (Statics.field8[var215][var217][var218 - 1] & var211) != 0) {
                                            var218--;
                                        }
                                        while (var219 < 104 && (Statics.field8[var215][var217][var219 + 1] & var211) != 0) {
                                            var219++;
                                        }
                                        label1511: while (var220 > 0) {
                                            for (int var222 = var218; var222 <= var219; var222++) {
                                                if ((Statics.field8[var220 - 1][var217][var222] & var211) == 0) {
                                                    break label1511;
                                                }
                                            }
                                            var220--;
                                        }
                                        label1500: while (var221 < var214) {
                                            for (int var223 = var218; var223 <= var219; var223++) {
                                                if ((Statics.field8[var221 + 1][var217][var223] & var211) == 0) {
                                                    break label1500;
                                                }
                                            }
                                            var221++;
                                        }
                                        int var224 = (var221 + 1 - var220) * (var219 - var218 + 1);
                                        if (var224 >= 8) {
                                            short var225 = 240;
                                            int var226 = class6.field83[var221][var217][var218] - var225;
                                            int var227 = class6.field83[var220][var217][var218];
                                            class86.method1724(var214, 1, var217 * 128, var217 * 128, var218 * 128, var219 * 128 + 128, var226, var227);
                                            for (int var228 = var220; var228 <= var221; var228++) {
                                                for (int var229 = var218; var229 <= var219; var229++) {
                                                    Statics.field8[var228][var217][var229] &= ~var211;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field8[var215][var217][var216] & var212) != 0) {
                                        int var230 = var217;
                                        int var231 = var217;
                                        int var232 = var215;
                                        int var233 = var215;
                                        while (var230 > 0 && (Statics.field8[var215][var230 - 1][var216] & var212) != 0) {
                                            var230--;
                                        }
                                        while (var231 < 104 && (Statics.field8[var215][var231 + 1][var216] & var212) != 0) {
                                            var231++;
                                        }
                                        label1564: while (var232 > 0) {
                                            for (int var234 = var230; var234 <= var231; var234++) {
                                                if ((Statics.field8[var232 - 1][var234][var216] & var212) == 0) {
                                                    break label1564;
                                                }
                                            }
                                            var232--;
                                        }
                                        label1553: while (var233 < var214) {
                                            for (int var235 = var230; var235 <= var231; var235++) {
                                                if ((Statics.field8[var233 + 1][var235][var216] & var212) == 0) {
                                                    break label1553;
                                                }
                                            }
                                            var233++;
                                        }
                                        int var236 = (var233 + 1 - var232) * (var231 - var230 + 1);
                                        if (var236 >= 8) {
                                            short var237 = 240;
                                            int var238 = class6.field83[var233][var230][var216] - var237;
                                            int var239 = class6.field83[var232][var230][var216];
                                            class86.method1724(var214, 2, var230 * 128, var231 * 128 + 128, var216 * 128, var216 * 128, var238, var239);
                                            for (int var240 = var232; var240 <= var233; var240++) {
                                                for (int var241 = var230; var241 <= var231; var241++) {
                                                    Statics.field8[var240][var241][var216] &= ~var212;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field8[var215][var217][var216] & var213) != 0) {
                                        int var242 = var217;
                                        int var243 = var217;
                                        int var244 = var216;
                                        int var245 = var216;
                                        while (var244 > 0 && (Statics.field8[var215][var217][var244 - 1] & var213) != 0) {
                                            var244--;
                                        }
                                        while (var245 < 104 && (Statics.field8[var215][var217][var245 + 1] & var213) != 0) {
                                            var245++;
                                        }
                                        label1617: while (var242 > 0) {
                                            for (int var246 = var244; var246 <= var245; var246++) {
                                                if ((Statics.field8[var215][var242 - 1][var246] & var213) == 0) {
                                                    break label1617;
                                                }
                                            }
                                            var242--;
                                        }
                                        label1606: while (var243 < 104) {
                                            for (int var247 = var244; var247 <= var245; var247++) {
                                                if ((Statics.field8[var215][var243 + 1][var247] & var213) == 0) {
                                                    break label1606;
                                                }
                                            }
                                            var243++;
                                        }
                                        if ((var243 - var242 + 1) * (var245 - var244 + 1) >= 4) {
                                            int var248 = class6.field83[var215][var242][var244];
                                            class86.method1724(var214, 4, var242 * 128, var243 * 128 + 128, var244 * 128, var245 * 128 + 128, var248, var248);
                                            for (int var249 = var242; var249 <= var243; var249++) {
                                                for (int var250 = var244; var250 <= var245; var250++) {
                                                    Statics.field8[var215][var249][var250] &= ~var213;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method2177(true);
                    int var251 = class6.field104;
                    if (var251 > Statics.field1516) {
                        var251 = Statics.field1516;
                    }
                    if (var251 < Statics.field1516 - 1) {
                        int var252 = Statics.field1516 - 1;
                    }
                    if (field570) {
                        Statics.field107.method1722(class6.field104);
                    } else {
                        Statics.field107.method1722(0);
                    }
                    for (int var253 = 0; var253 < 104; var253++) {
                        for (int var254 = 0; var254 < 104; var254++) {
                            method2235(var253, var254);
                        }
                    }
                    method1973();
                    method2892();
                    class41.field918.method3452();
                    if (Statics.field872 != null) {
                        field331.method2555(42);
                        field331.method2278(1057001181);
                    }
                    if (!field349) {
                        int var255 = (Statics.field1988 - 6) / 8;
                        int var256 = (Statics.field1988 + 6) / 8;
                        int var257 = (Statics.field2664 - 6) / 8;
                        int var258 = (Statics.field2664 + 6) / 8;
                        for (int var259 = var255 - 1; var259 <= var256 + 1; var259++) {
                            for (int var260 = var257 - 1; var260 <= var258 + 1; var260++) {
                                if (var259 < var255 || var259 > var256 || var260 < var257 || var260 > var258) {
                                    Statics.field3133.method2994("m" + var259 + "_" + var260);
                                    Statics.field3133.method2994("l" + var259 + "_" + var260);
                                }
                            }
                        }
                    }
                    method908(30);
                    method1973();
                    class6.method895();
                    field331.method2555(112);
                    Statics.field780.method2625();
                    for (int var261 = 0; var261 < 32; var261++) {
                        field2185[var261] = 0L;
                    }
                    for (int var262 = 0; var262 < 32; var262++) {
                        field2194[var262] = 0L;
                    }
                    Statics.field1192 = 0;
                } else {
                    field347 = 2;
                }
            } else {
                field347 = 1;
            }
        }
        if (field297 == 30) {
            if (field508 > 1) {
                field508--;
            }
            if (field526 > 0) {
                field526--;
            }
            if (field342) {
                field342 = false;
                if (field526 > 0) {
                    method2086();
                } else {
                    method908(40);
                    Statics.field1366 = Statics.field1764;
                    Statics.field1764 = null;
                }
            } else {
                if (!field427) {
                    field433[0] = class157.field2535;
                    field434[0] = "";
                    field431[0] = 1006;
                    field400 = 1;
                }
                for (int var263 = 0; var263 < 100 && method34(); var263++) {
                }
                if (field297 == 30) {
                    while (class211.method2757()) {
                        field331.method2555(94);
                        field331.method2347(0);
                        int var264 = field331.field1984;
                        class211.method2759(field331);
                        field331.method2287(field331.field1984 - var264);
                    }
                    Object var265 = Statics.field586.field199;
                    synchronized (Statics.field586.field199) {
                        if (!field287) {
                            Statics.field586.field200 = 0;
                        } else if (class140.field2144 != 0 || Statics.field586.field200 >= 40) {
                            field331.method2555(9);
                            field331.method2347(0);
                            int var266 = field331.field1984;
                            int var267 = 0;
                            for (int var268 = 0; var268 < Statics.field586.field200 && field331.field1984 - var266 < 240; var268++) {
                                var267++;
                                int var269 = Statics.field586.field212[var268];
                                if (var269 < 0) {
                                    var269 = 0;
                                } else if (var269 > 502) {
                                    var269 = 502;
                                }
                                int var270 = Statics.field586.field201[var268];
                                if (var270 < 0) {
                                    var270 = 0;
                                } else if (var270 > 764) {
                                    var270 = 764;
                                }
                                int var271 = var269 * 765 + var270;
                                if (Statics.field586.field212[var268] == -1 && Statics.field586.field201[var268] == -1) {
                                    var270 = -1;
                                    var269 = -1;
                                    var271 = 524287;
                                }
                                if (field490 != var270 || field424 != var269) {
                                    int var272 = var270 - field490;
                                    field490 = var270;
                                    int var273 = var269 - field424;
                                    field424 = var269;
                                    if (field303 < 8 && var272 >= -32 && var272 <= 31 && var273 >= -32 && var273 <= 31) {
                                        var272 += 32;
                                        var273 += 32;
                                        field331.method2318((field303 << 12) + (var272 << 6) + var273);
                                        field303 = 0;
                                    } else if (field303 < 8) {
                                        field331.method2277((field303 << 19) + 8388608 + var271);
                                        field303 = 0;
                                    } else {
                                        field331.method2278((field303 << 19) + -1073741824 + var271);
                                        field303 = 0;
                                    }
                                } else if (field303 < 2047) {
                                    field303++;
                                }
                            }
                            field331.method2287(field331.field1984 - var266);
                            if (var267 >= Statics.field586.field200) {
                                Statics.field586.field200 = 0;
                            } else {
                                Statics.field586.field200 -= var267;
                                for (int var274 = 0; var274 < Statics.field586.field200; var274++) {
                                    Statics.field586.field201[var274] = Statics.field586.field201[var267 + var274];
                                    Statics.field586.field212[var274] = Statics.field586.field212[var267 + var274];
                                }
                            }
                        }
                    }
                    if (class140.field2144 == 1 || !Statics.field1037 && class140.field2144 == 4 || class140.field2144 == 2) {
                        long var276 = (class140.field2147 - field459) / 50L;
                        if (var276 > 4095L) {
                            var276 = 4095L;
                        }
                        field459 = class140.field2147;
                        int var278 = class140.field2146;
                        if (var278 < 0) {
                            var278 = 0;
                        } else if (var278 > Statics.field164) {
                            var278 = Statics.field164;
                        }
                        int var279 = class140.field2145;
                        if (var279 < 0) {
                            var279 = 0;
                        } else if (var279 > Statics.field2178) {
                            var279 = Statics.field2178;
                        }
                        int var280 = (int) var276;
                        field331.method2555(181);
                        field331.method2318((var280 << 1) + (class140.field2144 == 2 ? 1 : 0));
                        field331.method2318(var279);
                        field331.method2318(var278);
                    }
                    if (class137.field2110 > 0) {
                        field331.method2555(80);
                        field331.method2318(0);
                        int var281 = field331.field1984;
                        long var282 = class115.method568();
                        for (int var284 = 0; var284 < class137.field2110; var284++) {
                            long var285 = var282 - field513;
                            if (var285 > 16777215L) {
                                var285 = 16777215L;
                            }
                            field513 = var282;
                            field331.method2482((int) var285);
                            field331.method2445(class137.field2116[var284]);
                        }
                        field331.method2286(field331.field1984 - var281);
                    }
                    if (field529 > 0) {
                        field529--;
                    }
                    if (class137.field2112[96] || class137.field2112[97] || class137.field2112[98] || class137.field2112[99]) {
                        field542 = true;
                    }
                    if (field542 && field529 <= 0) {
                        field529 = 20;
                        field542 = false;
                        field331.method2555(65);
                        field331.method2322(field372);
                        field331.method2322(field371);
                    }
                    if (Statics.field1998 && !field304) {
                        field304 = true;
                        field331.method2555(184);
                        field331.method2347(1);
                    }
                    if (!Statics.field1998 && field304) {
                        field304 = false;
                        field331.method2555(184);
                        field331.method2347(0);
                    }
                    if (Statics.field1516 != field516) {
                        field516 = Statics.field1516;
                        method175(Statics.field1516);
                    }
                    if (field297 == 30) {
                        method1997();
                        method1995();
                        field336++;
                        if (field336 <= 750) {
                            method718();
                            method154();
                            int[] var287 = class33.field758;
                            for (int var288 = 0; var288 < class33.field754; var288++) {
                                class3 var289 = field293[var287[var288]];
                                if (var289 != null && var289.field823 > 0) {
                                    var289.field823--;
                                    if (var289.field823 == 0) {
                                        var289.field838 = null;
                                    }
                                }
                            }
                            for (int var290 = 0; var290 < field327; var290++) {
                                int var291 = field521[var290];
                                class35 var292 = field378[var291];
                                if (var292 != null && var292.field823 > 0) {
                                    var292.field823--;
                                    if (var292.field823 == 0) {
                                        var292.field838 = null;
                                    }
                                }
                            }
                            field352++;
                            if (field398 != 0) {
                                field326 += 20;
                                if (field326 >= 400) {
                                    field398 = 0;
                                }
                            }
                            if (Statics.field866 != null) {
                                field399++;
                                if (field399 >= 15) {
                                    Statics.method572(Statics.field866);
                                    Statics.field866 = null;
                                }
                            }
                            class173 var293 = Statics.field2985;
                            class173 var294 = Statics.field2149;
                            Statics.field2985 = null;
                            Statics.field2149 = null;
                            field463 = null;
                            field467 = false;
                            field414 = false;
                            field510 = 0;
                            while (true) {
                                while (class137.method2213() && field510 < 128) {
                                    if (field453 >= 2 && class137.field2112[82] && Statics.field2103 == 66) {
                                        String var295 = class12.method150();
                                        Statics.field1877.setContents(new StringSelection(var295), (ClipboardOwner) null);
                                    } else {
                                        field512[field510] = Statics.field2103;
                                        field534[field510] = Statics.field2265;
                                        field510++;
                                    }
                                }
                                if (field392 != -1) {
                                    int var296 = field392;
                                    int var297 = Statics.field2178;
                                    int var298 = Statics.field164;
                                    if (class173.method2229(var296)) {
                                        method30(Statics.field2807[var296], -1, 0, 0, var297, var298, 0, 0);
                                    }
                                }
                                field549++;
                                while (true) {
                                    class1 var299;
                                    class173 var300;
                                    class173 var301;
                                    do {
                                        var299 = (class1) field487.method3518();
                                        if (var299 == null) {
                                            while (true) {
                                                class1 var302;
                                                class173 var303;
                                                class173 var304;
                                                do {
                                                    var302 = (class1) field346.method3518();
                                                    if (var302 == null) {
                                                        while (true) {
                                                            class1 var305;
                                                            class173 var306;
                                                            class173 var307;
                                                            do {
                                                                var305 = (class1) field486.method3518();
                                                                if (var305 == null) {
                                                                    method2240();
                                                                    if (field517 != null) {
                                                                        method1975();
                                                                    }
                                                                    if (Statics.field1551 != null) {
                                                                        Statics.method572(Statics.field1551);
                                                                        field406++;
                                                                        if (class140.field2137 == 0) {
                                                                            if (field405) {
                                                                                if (Statics.field1551 == Statics.field1364 && field404 != field363) {
                                                                                    class173 var308 = Statics.field1551;
                                                                                    byte var309 = 0;
                                                                                    if (field449 == 1 && var308.field2882 == 206) {
                                                                                        var309 = 1;
                                                                                    }
                                                                                    if (var308.field2819[field404] <= 0) {
                                                                                        var309 = 0;
                                                                                    }
                                                                                    if (class178.method733(method707(var308))) {
                                                                                        int var310 = field363;
                                                                                        int var311 = field404;
                                                                                        var308.field2819[var311] = var308.field2819[var310];
                                                                                        var308.field2871[var311] = var308.field2871[var310];
                                                                                        var308.field2819[var310] = -1;
                                                                                        var308.field2871[var310] = 0;
                                                                                    } else if (var309 == 1) {
                                                                                        int var312 = field363;
                                                                                        int var313 = field404;
                                                                                        while (var312 != var313) {
                                                                                            if (var312 > var313) {
                                                                                                var308.method3107(var312 - 1, var312);
                                                                                                var312--;
                                                                                            } else if (var312 < var313) {
                                                                                                var308.method3107(var312 + 1, var312);
                                                                                                var312++;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        var308.method3107(field404, field363);
                                                                                    }
                                                                                    field331.method2555(236);
                                                                                    field331.method2333(Statics.field1551.field2769);
                                                                                    field331.method2322(field363);
                                                                                    field331.method2347(var309);
                                                                                    field331.method2318(field404);
                                                                                }
                                                                            } else if ((field464 == 1 || method1108(field400 - 1)) && field400 > 2) {
                                                                                method171(field441, field403);
                                                                            } else if (field400 > 0) {
                                                                                int var314 = field441;
                                                                                int var315 = field403;
                                                                                class31 var316 = Statics.field2727;
                                                                                method730(var316.field707, var316.field708, var316.field709, var316.field710, var316.field711, var316.field711, var314, var315);
                                                                                Statics.field2727 = null;
                                                                            }
                                                                            field399 = 10;
                                                                            class140.field2144 = 0;
                                                                            Statics.field1551 = null;
                                                                        } else if (field406 >= 5 && (class140.field2150 > field441 + 5 || class140.field2150 < field441 - 5 || class140.field2139 * -432201367 > field403 + 5 || class140.field2139 * -432201367 < field403 - 5)) {
                                                                            field405 = true;
                                                                        }
                                                                    }
                                                                    if (class86.field1478 != -1) {
                                                                        int var317 = class86.field1478;
                                                                        int var318 = class86.field1450;
                                                                        field331.method2555(216);
                                                                        field331.method2347(5);
                                                                        field331.method2323(Statics.field585 + var317);
                                                                        field331.method2347(class137.field2112[82] ? (class137.field2112[81] ? 2 : 1) : 0);
                                                                        field331.method2318(Statics.field57 + var318);
                                                                        class86.field1478 = -1;
                                                                        field437 = class140.field2145;
                                                                        field522 = class140.field2146;
                                                                        field398 = 1;
                                                                        field326 = 0;
                                                                        field469 = var317;
                                                                        field480 = var318;
                                                                    }
                                                                    if (Statics.field2985 != var293) {
                                                                        if (var293 != null) {
                                                                            Statics.method572(var293);
                                                                        }
                                                                        if (Statics.field2985 != null) {
                                                                            Statics.method572(Statics.field2985);
                                                                        }
                                                                    }
                                                                    if (Statics.field2149 != var294 && field565 == field328) {
                                                                        if (var294 != null) {
                                                                            Statics.method572(var294);
                                                                        }
                                                                        if (Statics.field2149 != null) {
                                                                            Statics.method572(Statics.field2149);
                                                                        }
                                                                    }
                                                                    if (Statics.field2149 == null) {
                                                                        if (field565 > 0) {
                                                                            field565--;
                                                                        }
                                                                    } else if (field565 < field328) {
                                                                        field565++;
                                                                        if (field565 == field328) {
                                                                            Statics.method572(Statics.field2149);
                                                                        }
                                                                    }
                                                                    method891();
                                                                    if (field535) {
                                                                        int var319 = Statics.field2133 * 128 + 64;
                                                                        int var320 = Statics.field1053 * 128 + 64;
                                                                        int var321 = Statics.method141(var319, var320, Statics.field1516) - Statics.field2633;
                                                                        if (Statics.field571 < var319) {
                                                                            Statics.field571 += Statics.field1682 * (var319 - Statics.field571) / 1000 + Statics.field703;
                                                                            if (Statics.field571 > var319) {
                                                                                Statics.field571 = var319;
                                                                            }
                                                                        }
                                                                        if (Statics.field571 > var319) {
                                                                            Statics.field571 -= Statics.field1682 * (Statics.field571 - var319) / 1000 + Statics.field703;
                                                                            if (Statics.field571 < var319) {
                                                                                Statics.field571 = var319;
                                                                            }
                                                                        }
                                                                        if (Statics.field20 < var321) {
                                                                            Statics.field20 += Statics.field1682 * (var321 - Statics.field20) / 1000 + Statics.field703;
                                                                            if (Statics.field20 > var321) {
                                                                                Statics.field20 = var321;
                                                                            }
                                                                        }
                                                                        if (Statics.field20 > var321) {
                                                                            Statics.field20 -= Statics.field1682 * (Statics.field20 - var321) / 1000 + Statics.field703;
                                                                            if (Statics.field20 < var321) {
                                                                                Statics.field20 = var321;
                                                                            }
                                                                        }
                                                                        if (Statics.field731 < var320) {
                                                                            Statics.field731 += Statics.field1682 * (var320 - Statics.field731) / 1000 + Statics.field703;
                                                                            if (Statics.field731 > var320) {
                                                                                Statics.field731 = var320;
                                                                            }
                                                                        }
                                                                        if (Statics.field731 > var320) {
                                                                            Statics.field731 -= Statics.field1682 * (Statics.field731 - var320) / 1000 + Statics.field703;
                                                                            if (Statics.field731 < var320) {
                                                                                Statics.field731 = var320;
                                                                            }
                                                                        }
                                                                        int var322 = Statics.field2054 * 128 + 64;
                                                                        int var323 = Statics.field1436 * 128 + 64;
                                                                        int var324 = Statics.method141(var322, var323, Statics.field1516) - Statics.field637;
                                                                        int var325 = var322 - Statics.field571;
                                                                        int var326 = var324 - Statics.field20;
                                                                        int var327 = var323 - Statics.field731;
                                                                        int var328 = (int) Math.sqrt((double) (var325 * var325 + var327 * var327));
                                                                        int var329 = (int) (Math.atan2((double) var326, (double) var328) * 325.949D) & 0x7FF;
                                                                        int var330 = (int) (Math.atan2((double) var325, (double) var327) * -325.949D) & 0x7FF;
                                                                        if (var329 < 128) {
                                                                            var329 = 128;
                                                                        }
                                                                        if (var329 > 383) {
                                                                            var329 = 383;
                                                                        }
                                                                        if (Statics.field2214 < var329) {
                                                                            Statics.field2214 += Statics.field2058 * (var329 - Statics.field2214) / 1000 + Statics.field269;
                                                                            if (Statics.field2214 > var329) {
                                                                                Statics.field2214 = var329;
                                                                            }
                                                                        }
                                                                        if (Statics.field2214 > var329) {
                                                                            Statics.field2214 -= Statics.field2058 * (Statics.field2214 - var329) / 1000 + Statics.field269;
                                                                            if (Statics.field2214 < var329) {
                                                                                Statics.field2214 = var329;
                                                                            }
                                                                        }
                                                                        int var331 = var330 - Statics.field1540;
                                                                        if (var331 > 1024) {
                                                                            var331 -= 2048;
                                                                        }
                                                                        if (var331 < -1024) {
                                                                            var331 += 2048;
                                                                        }
                                                                        if (var331 > 0) {
                                                                            Statics.field1540 += Statics.field2058 * var331 / 1000 + Statics.field269;
                                                                            Statics.field1540 &= 0x7FF;
                                                                        }
                                                                        if (var331 < 0) {
                                                                            Statics.field1540 -= Statics.field2058 * -var331 / 1000 + Statics.field269;
                                                                            Statics.field1540 &= 0x7FF;
                                                                        }
                                                                        int var332 = var330 - Statics.field1540;
                                                                        if (var332 > 1024) {
                                                                            var332 -= 2048;
                                                                        }
                                                                        if (var332 < -1024) {
                                                                            var332 += 2048;
                                                                        }
                                                                        if (var332 < 0 && var331 > 0 || var332 > 0 && var331 < 0) {
                                                                            Statics.field1540 = var330;
                                                                        }
                                                                    }
                                                                    for (int var333 = 0; var333 < 5; var333++) {
                                                                        var10002 = field540[var333]++;
                                                                    }
                                                                    Statics.field358.method189();
                                                                    int var334 = ++class140.field2138 - 1;
                                                                    int var336 = class137.field2086;
                                                                    if (var334 > 15000 && var336 > 15000) {
                                                                        field526 = 250;
                                                                        class140.method615(14500);
                                                                        field331.method2555(95);
                                                                    }
                                                                    field426++;
                                                                    if (field426 > 500) {
                                                                        field426 = 0;
                                                                        int var338 = (int) (Math.random() * 8.0D);
                                                                        if ((var338 & 0x1) == 1) {
                                                                            field439 += field353;
                                                                        }
                                                                        if ((var338 & 0x2) == 2) {
                                                                            field354 += field550;
                                                                        }
                                                                        if ((var338 & 0x4) == 4) {
                                                                            field309 += field476;
                                                                        }
                                                                    }
                                                                    if (field439 < -50) {
                                                                        field353 = 2;
                                                                    }
                                                                    if (field439 > 50) {
                                                                        field353 = -2;
                                                                    }
                                                                    if (field354 < -55) {
                                                                        field550 = 2;
                                                                    }
                                                                    if (field354 > 55) {
                                                                        field550 = -2;
                                                                    }
                                                                    if (field309 < -40) {
                                                                        field476 = 1;
                                                                    }
                                                                    if (field309 > 40) {
                                                                        field476 = -1;
                                                                    }
                                                                    field382++;
                                                                    if (field382 > 500) {
                                                                        field382 = 0;
                                                                        int var339 = (int) (Math.random() * 8.0D);
                                                                        if ((var339 & 0x1) == 1) {
                                                                            field359 += field360;
                                                                        }
                                                                        if ((var339 & 0x2) == 2) {
                                                                            field361 += field362;
                                                                        }
                                                                    }
                                                                    if (field359 < -60) {
                                                                        field360 = 2;
                                                                    }
                                                                    if (field359 > 60) {
                                                                        field360 = -2;
                                                                    }
                                                                    if (field361 < -20) {
                                                                        field362 = 1;
                                                                    }
                                                                    if (field361 > 10) {
                                                                        field362 = -1;
                                                                    }
                                                                    for (class39 var340 = (class39) field301.method3474(); var340 != null; var340 = (class39) field301.method3475()) {
                                                                        if ((long) var340.field871 < class115.method568() / 1000L - 5L) {
                                                                            if (var340.field869 > 0) {
                                                                                class12.method100(5, "", var340.field870 + class157.field2446);
                                                                            }
                                                                            if (var340.field869 == 0) {
                                                                                class12.method100(5, "", var340.field870 + class157.field2447);
                                                                            }
                                                                            var340.method3602();
                                                                        }
                                                                    }
                                                                    field368++;
                                                                    if (field368 > 50) {
                                                                        field331.method2555(117);
                                                                    }
                                                                    try {
                                                                        if (Statics.field1764 != null && field331.field1984 > 0) {
                                                                            Statics.field1764.method2771(field331.field1989, 0, field331.field1984);
                                                                            field331.field1984 = 0;
                                                                            field368 = 0;
                                                                            return;
                                                                        }
                                                                    } catch (IOException var343) {
                                                                        if (field526 > 0) {
                                                                            method2086();
                                                                        } else {
                                                                            method908(40);
                                                                            Statics.field1366 = Statics.field1764;
                                                                            Statics.field1764 = null;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                var306 = var305.field3;
                                                                if (var306.field2755 < 0) {
                                                                    break;
                                                                }
                                                                var307 = class173.method2765(var306.field2773);
                                                            } while (var307 == null || var307.field2886 == null || var306.field2755 >= var307.field2886.length || var307.field2886[var306.field2755] != var306);
                                                            class37.method3091(var305, 200000);
                                                        }
                                                    }
                                                    var303 = var302.field3;
                                                    if (var303.field2755 < 0) {
                                                        break;
                                                    }
                                                    var304 = class173.method2765(var303.field2773);
                                                } while (var304 == null || var304.field2886 == null || var303.field2755 >= var304.field2886.length || var304.field2886[var303.field2755] != var303);
                                                class37.method3091(var302, 200000);
                                            }
                                        }
                                        var300 = var299.field3;
                                        if (var300.field2755 < 0) {
                                            break;
                                        }
                                        var301 = class173.method2765(var300.field2773);
                                    } while (var301 == null || var301.field2886 == null || var300.field2755 >= var301.field2886.length || var301.field2886[var300.field2755] != var300);
                                    class37.method3091(var299, 200000);
                                }
                            }
                        } else if (field526 > 0) {
                            method2086();
                        } else {
                            method908(40);
                            Statics.field1366 = Statics.field1764;
                            Statics.field1764 = null;
                        }
                    }
                }
            }
        } else if (field297 == 40 || field297 == 45) {
            method1();
        }
    }

    @ObfuscatedName("client.y(I)V")
    public final void method231() {
        boolean var1;
        label222: {
            try {
                if (class183.field2946 == 2) {
                    if (Statics.field225 == null) {
                        Statics.field225 = class180.method3235(Statics.field714, Statics.field2943, Statics.field2024);
                        if (Statics.field225 == null) {
                            var1 = false;
                            break label222;
                        }
                    }
                    if (Statics.field2910 == null) {
                        Statics.field2910 = new class60(Statics.field2947, Statics.field2944);
                    }
                    if (Statics.field3197.method3373(Statics.field225, Statics.field2945, Statics.field2910, 22050)) {
                        Statics.field3197.method3411();
                        Statics.field3197.method3314(Statics.field2948);
                        Statics.field3197.method3319(Statics.field225, Statics.field2061);
                        class183.field2946 = 0;
                        Statics.field225 = null;
                        Statics.field2910 = null;
                        Statics.field714 = null;
                        var1 = true;
                        break label222;
                    }
                }
            } catch (Exception var34) {
                var34.printStackTrace();
                Statics.field3197.method3320();
                class183.field2946 = 0;
                Statics.field225 = null;
                Statics.field2910 = null;
                Statics.field714 = null;
            }
            var1 = false;
        }
        if (var1 && field320 && Statics.field689 != null) {
            Statics.field689.method1110();
        }
        if (field297 == 10 || field297 == 20 || field297 == 30) {
            if (field500 != 0L && class115.method568() > field500) {
                int var4 = field511 ? 2 : 1;
                field500 = 0L;
                if (var4 >= 2) {
                    field511 = true;
                } else {
                    field511 = false;
                }
                method2679();
                if (field297 >= 25) {
                    field331.method2555(11);
                    class122 var5 = field331;
                    int var6 = field511 ? 2 : 1;
                    var5.method2347(var6);
                    field331.method2318(Statics.field2178);
                    field331.method2318(Statics.field164);
                }
                field2181 = true;
            } else if (field2193) {
                Canvas var7 = Statics.field1038;
                var7.removeKeyListener(class137.field2109);
                var7.removeFocusListener(class137.field2109);
                class137.field2106 = -1;
                class140.method955(Statics.field1038);
                if (Statics.field1428 != null) {
                    Statics.field1428.method2612(Statics.field1038);
                }
                Statics.field286.method2792();
                Statics.field1038.setBackground(Color.black);
                Canvas var8 = Statics.field1038;
                var8.setFocusTraversalKeysEnabled(false);
                var8.addKeyListener(class137.field2109);
                var8.addFocusListener(class137.field2109);
                Canvas var9 = Statics.field1038;
                var9.addMouseListener(class140.field2132);
                var9.addMouseMotionListener(class140.field2132);
                var9.addFocusListener(class140.field2132);
                if (Statics.field1428 != null) {
                    Statics.field1428.method2611(Statics.field1038);
                }
                if (field392 != -1) {
                    method2875(false);
                }
                field2192 = true;
            }
        }
        Dimension var10 = this.method2806();
        if (Statics.field2160 != var10.width || Statics.field1177 != var10.height || field2192) {
            method2679();
            field500 = class115.method568() + 500L;
            field2192 = false;
        }
        boolean var11 = false;
        if (field2181) {
            field2181 = false;
            var11 = true;
            for (int var12 = 0; var12 < 100; var12++) {
                field492[var12] = true;
            }
        }
        if (var11) {
            method921();
        }
        if (field297 == 0) {
            int var13 = class32.field733;
            String var14 = class32.field734;
            Color var15 = null;
            try {
                Graphics var16 = Statics.field1038.getGraphics();
                if (Statics.field174 == null) {
                    Statics.field174 = new Font("Helvetica", 1, 13);
                    Statics.field133 = Statics.field1038.getFontMetrics(Statics.field174);
                }
                if (var11) {
                    var16.setColor(Color.black);
                    var16.fillRect(0, 0, Statics.field2178, Statics.field164);
                }
                if (var15 == null) {
                    var15 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field672 == null) {
                        Statics.field672 = Statics.field1038.createImage(304, 34);
                    }
                    Graphics var17 = Statics.field672.getGraphics();
                    var17.setColor(var15);
                    var17.drawRect(0, 0, 303, 33);
                    var17.fillRect(2, 2, var13 * 3, 30);
                    var17.setColor(Color.black);
                    var17.drawRect(1, 1, 301, 31);
                    var17.fillRect(var13 * 3 + 2, 2, 300 - var13 * 3, 30);
                    var17.setFont(Statics.field174);
                    var17.setColor(Color.white);
                    var17.drawString(var14, (304 - Statics.field133.stringWidth(var14)) / 2, 22);
                    var16.drawImage(Statics.field672, Statics.field2178 / 2 - 152, Statics.field164 / 2 - 18, (ImageObserver) null);
                } catch (Exception var30) {
                    int var19 = Statics.field2178 / 2 - 152;
                    int var20 = Statics.field164 / 2 - 18;
                    var16.setColor(var15);
                    var16.drawRect(var19, var20, 303, 33);
                    var16.fillRect(var19 + 2, var20 + 2, var13 * 3, 30);
                    var16.setColor(Color.black);
                    var16.drawRect(var19 + 1, var20 + 1, 301, 31);
                    var16.fillRect(var13 * 3 + var19 + 2, var20 + 2, 300 - var13 * 3, 30);
                    var16.setFont(Statics.field174);
                    var16.setColor(Color.white);
                    var16.drawString(var14, var19 + (304 - Statics.field133.stringWidth(var14)) / 2, var20 + 22);
                }
            } catch (Exception var31) {
                Statics.field1038.repaint();
            }
        } else if (field297 == 5) {
            class32.method1425(Statics.field2625, Statics.field249, Statics.field341, var11);
        } else if (field297 == 10 || field297 == 11) {
            class32.method1425(Statics.field2625, Statics.field249, Statics.field341, var11);
        } else if (field297 == 20) {
            class32.method1425(Statics.field2625, Statics.field249, Statics.field341, var11);
        } else if (field297 == 25) {
            if (field347 == 1) {
                if (field295 > field478) {
                    field478 = field295;
                }
                int var22 = (field478 * 50 - field295 * 50) / field478;
                method1115(class157.field2308 + class2.field27 + class2.field24 + var22 + "%" + class2.field28, false);
            } else if (field347 == 2) {
                if (field567 > field455) {
                    field455 = field567;
                }
                int var23 = (field455 * 50 - field567 * 50) / field455 + 50;
                method1115(class157.field2308 + class2.field27 + class2.field24 + var23 + "%" + class2.field28, false);
            } else {
                method1115(class157.field2308, false);
            }
        } else if (field297 == 30) {
            method2894();
        } else if (field297 == 40) {
            method1115(class157.field2309 + class2.field27 + class157.field2310, false);
        } else if (field297 == 45) {
            method1115(class157.field2457, false);
        }
        if (field297 == 30 && field499 == 0 && !var11) {
            try {
                Graphics var24 = Statics.field1038.getGraphics();
                for (int var25 = 0; var25 < field409; var25++) {
                    if (field484[var25]) {
                        Statics.field3103.method1459(var24, field495[var25], field496[var25], field536[var25], field337[var25]);
                        field484[var25] = false;
                    }
                }
            } catch (Exception var33) {
                Statics.field1038.repaint();
            }
        } else if (field297 > 0) {
            try {
                Graphics var27 = Statics.field1038.getGraphics();
                Statics.field3103.method1458(var27, 0, 0);
                for (int var28 = 0; var28 < field409; var28++) {
                    field484[var28] = false;
                }
            } catch (Exception var32) {
                Statics.field1038.repaint();
            }
        }
    }

    @ObfuscatedName("client.p(I)V")
    public final void method483() {
        if (Statics.field358.method208()) {
            Statics.field358.method193();
        }
        if (Statics.field586 != null) {
            Statics.field586.field203 = false;
        }
        Statics.field586 = null;
        if (Statics.field1764 != null) {
            Statics.field1764.method2784();
            Statics.field1764 = null;
        }
        if (class137.field2109 != null) {
            class137 var1 = class137.field2109;
            synchronized (class137.field2109) {
                class137.field2109 = null;
            }
        }
        if (class140.field2132 != null) {
            class140 var3 = class140.field2132;
            synchronized (class140.field2132) {
                class140.field2132 = null;
            }
        }
        Statics.field1428 = null;
        if (Statics.field689 != null) {
            Statics.field689.method1111();
        }
        if (Statics.field699 != null) {
            Statics.field699.method1111();
        }
        if (Statics.field2722 != null) {
            Statics.field2722.method2784();
        }
        class170.method1454();
        class149.method940();
    }

    @ObfuscatedName("az.t(IS)V")
    public static void method908(int arg0) {
        if (field297 == arg0) {
            return;
        }
        if (field297 == 0) {
            Statics.field672 = null;
            Statics.field174 = null;
            Statics.field133 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field321 = 0;
            field322 = 0;
            field323 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1366 != null) {
            Statics.field1366.method2784();
            Statics.field1366 = null;
        }
        if (field297 == 25) {
            field347 = 0;
            field295 = 0;
            field478 = 1;
            field567 = 0;
            field455 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method2715(Statics.field1038, Statics.field713, Statics.field1553, true, 0);
        } else if (arg0 == 20) {
            class32.method2715(Statics.field1038, Statics.field713, Statics.field1553, true, field297 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method2715(Statics.field1038, Statics.field713, Statics.field1553, false, 4);
        } else {
            class32.method534();
        }
        field297 = arg0;
    }

    @ObfuscatedName("client.g(I)V")
    public void method232() {
        if (field297 != 1000) {
            boolean var1 = class171.method180();
            if (!var1) {
                this.method233();
            }
        }
    }

    @ObfuscatedName("client.v(I)V")
    public void method233() {
        if (class171.field2731 >= 4) {
            this.method2820("js5crc");
            field297 = 1000;
            return;
        }
        if (class171.field2735 >= 4) {
            if (field297 <= 5) {
                this.method2820("js5io");
                field297 = 1000;
                return;
            }
            field319 = 3000;
            class171.field2735 = 3;
        }
        if (--field319 + 1 > 0) {
            return;
        }
        try {
            if (field318 == 0) {
                Statics.field2583 = Statics.field2177.method2653(Statics.field1517, Statics.field1080);
                field318++;
            }
            if (field318 == 1) {
                if (Statics.field2583.field2204 == 2) {
                    this.method234(-1);
                    return;
                }
                if (Statics.field2583.field2204 == 1) {
                    field318++;
                }
            }
            if (field318 == 2) {
                Statics.field317 = new class143((Socket) Statics.field2583.field2200, Statics.field2177);
                class119 var1 = new class119(5);
                var1.method2347(15);
                var1.method2278(97);
                Statics.field317.method2771(var1.field1989, 0, 5);
                field318++;
                Statics.field1157 = class115.method568();
            }
            if (field318 == 3) {
                if (field297 <= 5 || Statics.field317.method2780() > 0) {
                    int var2 = Statics.field317.method2768();
                    if (var2 != 0) {
                        this.method234(var2);
                        return;
                    }
                    field318++;
                } else if (class115.method568() - Statics.field1157 > 30000L) {
                    this.method234(-2);
                    return;
                }
            }
            if (field318 == 4) {
                Statics.method2891(Statics.field317, field297 > 20);
                Statics.field2583 = null;
                Statics.field317 = null;
                field318 = 0;
                field421 = 0;
            }
        } catch (IOException var4) {
            this.method234(-3);
        }
    }

    @ObfuscatedName("client.l(II)V")
    public void method234(int arg0) {
        Statics.field2583 = null;
        Statics.field317 = null;
        field318 = 0;
        if (Statics.field1514 == Statics.field1080) {
            Statics.field1080 = Statics.field1351;
        } else {
            Statics.field1080 = Statics.field1514;
        }
        field421++;
        if (field421 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field297 <= 5) {
                this.method2820("js5connect_full");
                field297 = 1000;
            } else {
                field319 = 3000;
            }
        } else if (field421 >= 2 && arg0 == 6) {
            this.method2820("js5connect_outofdate");
            field297 = 1000;
        } else if (field421 >= 4) {
            if (field297 <= 5) {
                this.method2820("js5connect");
                field297 = 1000;
            } else {
                field319 = 3000;
            }
        }
    }

    @ObfuscatedName("di.e(B)V")
    public static void method2607() {
        if (field316 == 0) {
            Statics.field107 = new class86(4, 104, 104, class6.field83);
            for (int var0 = 0; var0 < 4; var0++) {
                field348[var0] = new class108(104, 104);
            }
            Statics.field2279 = new class79(512, 512);
            class32.field734 = class157.field2496;
            class32.field733 = 5;
            field316 = 20;
        } else if (field316 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class91.field1579[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class86.method1756(var1, 500, 800, 512, 334);
            class32.field734 = class157.field2312;
            class32.field733 = 10;
            field316 = 30;
        } else if (field316 == 30) {
            Statics.field75 = method2700(0, false, true, true);
            Statics.field21 = method2700(1, false, true, true);
            Statics.field187 = method2700(2, true, false, true);
            Statics.field3112 = method2700(3, false, true, true);
            Statics.field631 = method2700(4, false, true, true);
            Statics.field3133 = method2700(5, true, true, true);
            Statics.field2658 = method2700(6, true, true, false);
            Statics.field173 = method2700(7, false, true, true);
            Statics.field1553 = method2700(8, false, true, true);
            Statics.field1981 = method2700(9, false, true, true);
            Statics.field713 = method2700(10, false, true, true);
            Statics.field773 = method2700(11, false, true, true);
            Statics.field1010 = method2700(12, false, true, true);
            Statics.field628 = method2700(13, true, false, true);
            Statics.field99 = method2700(14, false, true, false);
            Statics.field2015 = method2700(15, false, true, true);
            class32.field734 = class157.field2313;
            class32.field733 = 20;
            field316 = 40;
        } else if (field316 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field75.method3061() * 4 / 100;
            int var8 = var7 + Statics.field21.method3061() * 4 / 100;
            int var9 = var8 + Statics.field187.method3061() * 2 / 100;
            int var10 = var9 + Statics.field3112.method3061() * 2 / 100;
            int var11 = var10 + Statics.field631.method3061() * 6 / 100;
            int var12 = var11 + Statics.field3133.method3061() * 4 / 100;
            int var13 = var12 + Statics.field2658.method3061() * 2 / 100;
            int var14 = var13 + Statics.field173.method3061() * 60 / 100;
            int var15 = var14 + Statics.field1553.method3061() * 2 / 100;
            int var16 = var15 + Statics.field1981.method3061() * 2 / 100;
            int var17 = var16 + Statics.field713.method3061() * 2 / 100;
            int var18 = var17 + Statics.field773.method3061() * 2 / 100;
            int var19 = var18 + Statics.field1010.method3061() * 2 / 100;
            int var20 = var19 + Statics.field628.method3061() * 2 / 100;
            int var21 = var20 + Statics.field99.method3061() * 2 / 100;
            int var22 = var21 + Statics.field2015.method3061() * 2 / 100;
            if (var22 == 100) {
                class32.field734 = class157.field2381;
                class32.field733 = 30;
                field316 = 45;
            } else {
                if (var22 != 0) {
                    class32.field734 = class157.field2396 + var22 + "%";
                }
                class32.field733 = 30;
            }
        } else if (field316 == 45) {
            class57.method425(22050, !field570, 2);
            class184 var23 = new class184();
            var23.method3322(9, 128);
            Statics.field689 = class57.method614(Statics.field2177, Statics.field1038, 0, 22050);
            Statics.field689.method1130(var23);
            class183.method1426(Statics.field2015, Statics.field99, Statics.field631, var23);
            Statics.field699 = class57.method614(Statics.field2177, Statics.field1038, 1, 2048);
            Statics.field1533 = new class56();
            Statics.field699.method1130(Statics.field1533);
            Statics.field2140 = new class75(22050, Statics.field1172);
            class32.field734 = class157.field2316;
            class32.field733 = 35;
            field316 = 50;
        } else if (field316 == 50) {
            int var24 = 0;
            if (Statics.field249 == null) {
                Statics.field249 = class77.method540(Statics.field1553, Statics.field628, "p11_full", "");
            } else {
                var24++;
            }
            if (Statics.field341 == null) {
                Statics.field341 = class77.method540(Statics.field1553, Statics.field628, "p12_full", "");
            } else {
                var24++;
            }
            if (Statics.field2625 == null) {
                Statics.field2625 = class77.method540(Statics.field1553, Statics.field628, "b12_full", "");
            } else {
                var24++;
            }
            if (var24 < 3) {
                class32.field734 = class157.field2430 + var24 * 100 / 3 + "%";
                class32.field733 = 40;
            } else {
                Statics.field1371 = new class160(true);
                class32.field734 = class157.field2318;
                class32.field733 = 40;
                field316 = 60;
            }
        } else if (field316 == 60) {
            class168 var25 = Statics.field713;
            class168 var26 = Statics.field1553;
            int var27 = 0;
            if (var25.method2992("title.jpg", "")) {
                var27++;
            }
            if (var26.method2992("logo", "")) {
                var27++;
            }
            if (var26.method2992("logo_deadman_mode", "")) {
                var27++;
            }
            if (var26.method2992("titlebox", "")) {
                var27++;
            }
            if (var26.method2992("titlebutton", "")) {
                var27++;
            }
            if (var26.method2992("runes", "")) {
                var27++;
            }
            if (var26.method2992("title_mute", "")) {
                var27++;
            }
            if (var26.method2993("options_radio_buttons,0")) {
                var27++;
            }
            if (var26.method2993("options_radio_buttons,2")) {
                var27++;
            }
            var26.method2992("sl_back", "");
            var26.method2992("sl_flags", "");
            var26.method2992("sl_arrows", "");
            var26.method2992("sl_stars", "");
            var26.method2992("sl_button", "");
            byte var30 = 9;
            if (var27 < var30) {
                class32.field734 = class157.field2562 + var27 * 100 / var30 + "%";
                class32.field733 = 50;
            } else {
                class32.field734 = class157.field2554;
                class32.field733 = 50;
                method908(5);
                field316 = 70;
            }
        } else if (field316 == 70) {
            if (Statics.field187.method2978()) {
                class47.method2238(Statics.field187);
                class168 var32 = Statics.field187;
                Statics.field969 = var32;
                Statics.method98(Statics.field187, Statics.field173);
                class168 var33 = Statics.field187;
                class168 var34 = Statics.field173;
                boolean var35 = field570;
                Statics.field934 = var33;
                Statics.field3148 = var34;
                class41.field930 = var35;
                class40.method2705(Statics.field187, Statics.field173);
                class168 var36 = Statics.field187;
                class168 var37 = Statics.field173;
                boolean var38 = field292;
                class224 var39 = Statics.field249;
                Statics.field1099 = var36;
                Statics.field1100 = var37;
                Statics.field1035 = var38;
                Statics.field256 = Statics.field1099.method2973(10);
                Statics.field1954 = var39;
                class168 var40 = Statics.field187;
                class168 var41 = Statics.field75;
                class168 var42 = Statics.field21;
                Statics.field977 = var40;
                Statics.field975 = var41;
                Statics.field77 = var42;
                class168 var43 = Statics.field187;
                class168 var44 = Statics.field173;
                Statics.field1008 = var43;
                Statics.field996 = var44;
                class168 var45 = Statics.field187;
                Statics.field1068 = var45;
                class168 var46 = Statics.field187;
                Statics.field1156 = var46;
                Statics.field1151 = Statics.field1156.method2973(16);
                class168 var47 = Statics.field3112;
                class168 var48 = Statics.field173;
                class168 var49 = Statics.field1553;
                class168 var50 = Statics.field628;
                Statics.field2745 = var47;
                Statics.field2736 = var48;
                Statics.field2757 = var49;
                Statics.field2784 = var50;
                Statics.field2807 = new class173[Statics.field2745.method3045()][];
                Statics.field2639 = new boolean[Statics.field2745.method3045()];
                class168 var51 = Statics.field187;
                Statics.field1092 = var51;
                class168 var52 = Statics.field187;
                Statics.field1076 = var52;
                class46.method724(Statics.field187);
                class168 var53 = Statics.field187;
                Statics.field1550 = var53;
                Statics.field358 = new class20();
                class32.field734 = class157.field2322;
                class32.field733 = 60;
                field316 = 80;
            } else {
                class32.field734 = class157.field2527 + Statics.field187.method3059() + "%";
                class32.field733 = 60;
            }
        } else if (field316 == 80) {
            int var54 = 0;
            if (Statics.field152 == null) {
                class168 var55 = Statics.field1553;
                int var56 = var55.method2989("compass");
                int var57 = var55.method2990(var56, "");
                class79 var58 = class77.method97(var55, var56, var57);
                Statics.field152 = var58;
            } else {
                var54++;
            }
            if (Statics.field69 == null) {
                class168 var59 = Statics.field1553;
                int var60 = var59.method2989("mapedge");
                int var61 = var59.method2990(var60, "");
                class79 var62 = class77.method97(var59, var60, var61);
                Statics.field69 = var62;
            } else {
                var54++;
            }
            if (Statics.field1063 == null) {
                Statics.field1063 = class77.method610(Statics.field1553, "mapscene", "");
            } else {
                var54++;
            }
            if (Statics.field2280 == null) {
                Statics.field2280 = class77.method1526(Statics.field1553, "mapfunction", "");
            } else {
                var54++;
            }
            if (Statics.field1152 == null) {
                Statics.field1152 = class77.method1526(Statics.field1553, "hitmarks", "");
            } else {
                var54++;
            }
            if (Statics.field2233 == null) {
                Statics.field2233 = class77.method1526(Statics.field1553, "headicons_pk", "");
            } else {
                var54++;
            }
            if (Statics.field160 == null) {
                Statics.field160 = class77.method1526(Statics.field1553, "headicons_prayer", "");
            } else {
                var54++;
            }
            if (Statics.field144 == null) {
                Statics.field144 = class77.method1526(Statics.field1553, "headicons_hint", "");
            } else {
                var54++;
            }
            if (Statics.field2161 == null) {
                Statics.field2161 = class77.method1526(Statics.field1553, "mapmarker", "");
            } else {
                var54++;
            }
            if (Statics.field2238 == null) {
                Statics.field2238 = class77.method1526(Statics.field1553, "cross", "");
            } else {
                var54++;
            }
            if (Statics.field3154 == null) {
                Statics.field3154 = class77.method1526(Statics.field1553, "mapdots", "");
            } else {
                var54++;
            }
            if (Statics.field2044 == null) {
                Statics.field2044 = class77.method610(Statics.field1553, "scrollbar", "");
            } else {
                var54++;
            }
            if (Statics.field35 == null) {
                Statics.field35 = class77.method610(Statics.field1553, "mod_icons", "");
            } else {
                var54++;
            }
            if (var54 < 13) {
                class32.field734 = class157.field2323 + var54 * 100 / 13 + "%";
                class32.field733 = 70;
            } else {
                Statics.field3179 = Statics.field35;
                Statics.field69.method1539();
                int var63 = (int) (Math.random() * 21.0D) - 10;
                int var64 = (int) (Math.random() * 21.0D) - 10;
                int var65 = (int) (Math.random() * 21.0D) - 10;
                int var66 = (int) (Math.random() * 41.0D) - 20;
                for (int var67 = 0; var67 < Statics.field2280.length; var67++) {
                    Statics.field2280[var67].method1538(var63 + var66, var64 + var66, var65 + var66);
                }
                Statics.field1063[0].method1694(var63 + var66, var64 + var66, var65 + var66);
                class32.field734 = class157.field2324;
                class32.field733 = 70;
                field316 = 90;
            }
        } else if (field316 == 90) {
            if (Statics.field1981.method2978()) {
                class95 var68 = new class95(Statics.field1981, Statics.field1553, 20, 0.8D, field570 ? 64 : 128);
                class91.method1901(var68);
                class91.method1920(0.8D);
                class32.field734 = class157.field2326;
                class32.field733 = 90;
                field316 = 110;
            } else {
                class32.field734 = class157.field2325 + Statics.field1981.method3059() + "%";
                class32.field733 = 90;
            }
        } else if (field316 == 110) {
            Statics.field586 = new class14();
            Statics.field2177.method2666(Statics.field586, 10);
            class32.field734 = class157.field2327;
            class32.field733 = 94;
            field316 = 120;
        } else if (field316 == 120) {
            if (Statics.field713.method2992("huffman", "")) {
                class113 var69 = new class113(Statics.field713.method2986("huffman", ""));
                class222.method2877(var69);
                class32.field734 = class157.field2384;
                class32.field733 = 96;
                field316 = 130;
            } else {
                class32.field734 = class157.field2328 + "%";
                class32.field733 = 96;
            }
        } else if (field316 == 130) {
            if (!Statics.field3112.method2978()) {
                class32.field734 = class157.field2330 + Statics.field3112.method3059() * 4 / 5 + "%";
                class32.field733 = 100;
            } else if (!Statics.field1010.method2978()) {
                class32.field734 = class157.field2330 + (80 + Statics.field1010.method3059() / 6) + "%";
                class32.field733 = 100;
            } else if (Statics.field628.method2978()) {
                class32.field734 = class157.field2331;
                class32.field733 = 100;
                field316 = 140;
            } else {
                class32.field734 = class157.field2330 + (96 + Statics.field628.method3059() / 20) + "%";
                class32.field733 = 100;
            }
        } else if (field316 == 140) {
            method908(10);
        }
    }

    @ObfuscatedName("ec.a(IZZZB)Lft;")
    public static class168 method2700(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class134 var4 = null;
        if (class149.field2223 != null) {
            var4 = new class134(arg0, class149.field2223, Statics.field3160[arg0], 1000000);
        }
        return new class168(var4, Statics.field1147, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("o.w(B)V")
    public static final void method1() {
        try {
            if (field321 == 0) {
                if (Statics.field1764 != null) {
                    Statics.field1764.method2784();
                    Statics.field1764 = null;
                }
                Statics.field1670 = null;
                field342 = false;
                field322 = 0;
                field321 = 1;
            }
            if (field321 == 1) {
                if (Statics.field1670 == null) {
                    Statics.field1670 = Statics.field2177.method2653(Statics.field1517, Statics.field1080);
                }
                if (Statics.field1670.field2204 == 2) {
                    throw new IOException();
                }
                if (Statics.field1670.field2204 == 1) {
                    Statics.field1764 = new class143((Socket) Statics.field1670.field2200, Statics.field2177);
                    Statics.field1670 = null;
                    field321 = 2;
                }
            }
            if (field321 == 2) {
                field331.field1984 = 0;
                field331.method2347(14);
                Statics.field1764.method2771(field331.field1989, 0, 1);
                field333.field1984 = 0;
                field321 = 3;
            }
            if (field321 == 3) {
                if (Statics.field689 != null) {
                    Statics.field689.method1109();
                }
                if (Statics.field699 != null) {
                    Statics.field699.method1109();
                }
                int var0 = Statics.field1764.method2768();
                if (Statics.field689 != null) {
                    Statics.field689.method1109();
                }
                if (Statics.field699 != null) {
                    Statics.field699.method1109();
                }
                if (var0 != 0) {
                    method3226(var0);
                    return;
                }
                field333.field1984 = 0;
                field321 = 5;
            }
            if (field321 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field331.field1984 = 0;
                field331.method2347(1);
                field331.method2347(class32.field741.method529());
                field331.method2278(var1[0]);
                field331.method2278(var1[1]);
                field331.method2278(var1[2]);
                field331.method2278(var1[3]);
                switch(class32.field741.field2589) {
                    case 0:
                    case 3:
                        field331.method2277(Statics.field751);
                        field331.field1984 += 5;
                        break;
                    case 1:
                        field331.method2278((Integer) Statics.field1030.field150.get(class163.method2763(class32.field739)));
                        field331.field1984 += 4;
                        break;
                    case 2:
                        field331.field1984 += 8;
                }
                field331.method2281(class32.field740);
                field331.method2310(class5.field82, class5.field74);
                field332.field1984 = 0;
                if (field297 == 40) {
                    field332.method2347(18);
                } else {
                    field332.method2347(16);
                }
                field332.method2318(0);
                int var2 = field332.field1984;
                field332.method2278(97);
                field332.method2392(field331.field1989, 0, field331.field1984);
                int var3 = field332.field1984;
                field332.method2281(class32.field739);
                field332.method2347((field511 ? 1 : 0) << 1 | (field570 ? 1 : 0));
                field332.method2318(Statics.field2178);
                field332.method2318(Statics.field164);
                class149.method169(field332);
                field332.method2281(Statics.field460);
                field332.method2278(Statics.field2652);
                class119 var4 = new class119(Statics.field1371.method2898());
                Statics.field1371.method2897(var4);
                field332.method2392(var4.field1989, 0, var4.field1989.length);
                field332.method2347(Statics.field296);
                field332.method2278(Statics.field75.field2677);
                field332.method2278(Statics.field21.field2677);
                field332.method2278(Statics.field187.field2677);
                field332.method2278(Statics.field3112.field2677);
                field332.method2278(Statics.field631.field2677);
                field332.method2278(Statics.field3133.field2677);
                field332.method2278(Statics.field2658.field2677);
                field332.method2278(Statics.field173.field2677);
                field332.method2278(Statics.field1553.field2677);
                field332.method2278(Statics.field1981.field2677);
                field332.method2278(Statics.field713.field2677);
                field332.method2278(Statics.field773.field2677);
                field332.method2278(Statics.field1010.field2677);
                field332.method2278(Statics.field628.field2677);
                field332.method2278(Statics.field99.field2677);
                field332.method2278(Statics.field2015.field2677);
                field332.method2328(var1, var3, field332.field1984);
                field332.method2286(field332.field1984 - var2);
                Statics.field1764.method2771(field332.field1989, 0, field332.field1984);
                field331.method2536(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field333.method2536(var1);
                field321 = 6;
            }
            if (field321 == 6 && Statics.field1764.method2780() > 0) {
                int var6 = Statics.field1764.method2768();
                if (var6 == 21 && field297 == 20) {
                    field321 = 7;
                } else if (var6 == 2) {
                    field321 = 9;
                } else if (var6 == 15 && field297 == 40) {
                    field334 = -1;
                    field321 = 13;
                } else if (var6 == 23 && field323 < 1) {
                    field323++;
                    field321 = 0;
                } else if (var6 == 29) {
                    field321 = 11;
                } else {
                    method3226(var6);
                    return;
                }
            }
            if (field321 == 7 && Statics.field1764.method2780() > 0) {
                field324 = (Statics.field1764.method2768() + 3) * 60;
                field321 = 8;
            }
            if (field321 == 8) {
                field322 = 0;
                class32.method149(class157.field2404, class157.field2395, field324 / 60 + class157.field2337);
                if (--field324 <= 0) {
                    field321 = 0;
                }
            } else {
                if (field321 == 9 && Statics.field1764.method2780() >= 13) {
                    boolean var7 = Statics.field1764.method2768() == 1;
                    Statics.field1764.method2770(field333.field1989, 0, 4);
                    field333.field1984 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field333.method2561() << 24;
                        int var10 = var9 | field333.method2561() << 16;
                        int var11 = var10 | field333.method2561() << 8;
                        int var12 = var11 | field333.method2561();
                        int var13 = class163.method2763(class32.field739);
                        if (Statics.field1030.field150.size() >= 10 && !Statics.field1030.field150.containsKey(var13)) {
                            Iterator var14 = Statics.field1030.field150.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field1030.field150.put(var13, var12);
                        class9.method2599();
                    }
                    field453 = Statics.field1764.method2768();
                    field397 = Statics.field1764.method2768() == 1;
                    field410 = Statics.field1764.method2768();
                    field410 <<= 0x8;
                    field410 += Statics.field1764.method2768();
                    field494 = Statics.field1764.method2768();
                    Statics.field1764.method2770(field333.field1989, 0, 1);
                    field333.field1984 = 0;
                    field436 = field333.method2561();
                    Statics.field1764.method2770(field333.field1989, 0, 2);
                    field333.field1984 = 0;
                    field334 = field333.method2292();
                    if (field494 == 1) {
                        try {
                            client var15 = Statics.field286;
                            JSObject.getWindow(var15).call("zap", (Object[]) null);
                        } catch (Throwable var30) {
                        }
                    } else {
                        try {
                            class132.method2621(Statics.field286, "unzap");
                        } catch (Throwable var29) {
                        }
                    }
                    field321 = 10;
                }
                if (field321 != 10) {
                    if (field321 == 11 && Statics.field1764.method2780() >= 2) {
                        field333.field1984 = 0;
                        Statics.field1764.method2770(field333.field1989, 0, 2);
                        field333.field1984 = 0;
                        Statics.field325 = field333.method2292();
                        field321 = 12;
                    }
                    if (field321 == 12 && Statics.field1764.method2780() >= Statics.field325) {
                        field333.field1984 = 0;
                        Statics.field1764.method2770(field333.field1989, 0, Statics.field325);
                        field333.field1984 = 0;
                        String var18 = field333.method2344();
                        String var19 = field333.method2344();
                        String var20 = field333.method2344();
                        class32.method149(var18, var19, var20);
                        method908(10);
                    }
                    if (field321 == 13) {
                        if (field334 == -1) {
                            if (Statics.field1764.method2780() < 2) {
                                return;
                            }
                            Statics.field1764.method2770(field333.field1989, 0, 2);
                            field333.field1984 = 0;
                            field334 = field333.method2292();
                        }
                        if (Statics.field1764.method2780() >= field334) {
                            Statics.field1764.method2770(field333.field1989, 0, field334);
                            field333.field1984 = 0;
                            int var21 = field334;
                            field331.field1984 = 0;
                            field333.field1984 = 0;
                            field436 = -1;
                            field415 = -1;
                            field339 = -1;
                            field340 = -1;
                            field334 = 0;
                            field336 = 0;
                            field508 = 0;
                            field400 = 0;
                            field427 = false;
                            field523 = 0;
                            field469 = 0;
                            for (int var22 = 0; var22 < 2048; var22++) {
                                field293[var22] = null;
                            }
                            Statics.field2040 = null;
                            for (int var23 = 0; var23 < field378.length; var23++) {
                                class35 var24 = field378[var23];
                                if (var24 != null) {
                                    var24.field844 = -1;
                                    var24.field833 = false;
                                }
                            }
                            class16.method2690();
                            method908(30);
                            for (int var25 = 0; var25 < 100; var25++) {
                                field492[var25] = true;
                            }
                            field331.method2555(11);
                            class122 var26 = field331;
                            int var27 = field511 ? 2 : 1;
                            var26.method2347(var27);
                            field331.method2318(Statics.field2178);
                            field331.method2318(Statics.field164);
                            class33.method574(field333);
                            if (field333.field1984 != var21) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field322++;
                        if (field322 > 2000) {
                            if (field323 < 1) {
                                if (Statics.field1514 == Statics.field1080) {
                                    Statics.field1080 = Statics.field1351;
                                } else {
                                    Statics.field1080 = Statics.field1514;
                                }
                                field323++;
                                field321 = 0;
                            } else {
                                method3226(-3);
                            }
                        }
                    }
                } else if (Statics.field1764.method2780() >= field334) {
                    field333.field1984 = 0;
                    Statics.field1764.method2770(field333.field1989, 0, field334);
                    method147();
                    class33.method574(field333);
                    Statics.field1988 = -1;
                    method2085(false);
                    field436 = -1;
                }
            }
        } catch (IOException var31) {
            if (field323 < 1) {
                if (Statics.field1514 == Statics.field1080) {
                    Statics.field1080 = Statics.field1351;
                } else {
                    Statics.field1080 = Statics.field1514;
                }
                field323++;
                field321 = 0;
            } else {
                method3226(-2);
            }
        }
    }

    @ObfuscatedName("a.d(I)V")
    public static void method147() {
        field459 = -1L;
        field303 = -1;
        Statics.field586.field200 = 0;
        Statics.field1998 = true;
        field304 = true;
        field513 = -1L;
        class211.method3225();
        field331.field1984 = 0;
        field333.field1984 = 0;
        field436 = -1;
        field415 = -1;
        field339 = -1;
        field340 = -1;
        field336 = 0;
        field508 = 0;
        field526 = 0;
        field307 = 0;
        field400 = 0;
        field427 = false;
        class140.method615(0);
        class12.method182();
        field450 = 0;
        field381 = false;
        field345 = 0;
        field439 = (int) (Math.random() * 100.0D) - 50;
        field354 = (int) (Math.random() * 110.0D) - 55;
        field309 = (int) (Math.random() * 80.0D) - 40;
        field359 = (int) (Math.random() * 120.0D) - 60;
        field361 = (int) (Math.random() * 30.0D) - 20;
        field372 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field523 = 0;
        field516 = -1;
        field469 = 0;
        field480 = 0;
        field315 = class21.field574;
        field327 = 0;
        class33.method722();
        for (int var0 = 0; var0 < 2048; var0++) {
            field293[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field378[var1] = null;
        }
        field375 = -1;
        field533.method3535();
        field422.method3535();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field419[var2][var3][var4] = null;
                }
            }
        }
        field420 = new class199();
        field555 = 0;
        field554 = 0;
        field558 = 0;
        for (int var5 = 0; var5 < Statics.field1151; var5++) {
            class53 var6 = class53.method2783(var5);
            if (var6 != null) {
                class176.field2902[var5] = 0;
                class176.field2901[var5] = 0;
            }
        }
        Statics.field358.method191();
        field446 = -1;
        if (field392 != -1) {
            class173.method140(field392);
        }
        for (class4 var7 = (class4) field447.method3486(); var7 != null; var7 = (class4) field447.method3484()) {
            method110(var7, true);
        }
        field392 = -1;
        field447 = new class196(8);
        field300 = null;
        field427 = false;
        field400 = 0;
        field493.method3190((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field428[var8] = null;
            field416[var8] = false;
        }
        class16.method2690();
        field298 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field492[var9] = true;
        }
        field331.method2555(11);
        class122 var10 = field331;
        int var11 = field511 ? 2 : 1;
        var10.method2347(var11);
        field331.method2318(Statics.field2178);
        field331.method2318(Statics.field164);
        field514 = null;
        Statics.field30 = 0;
        Statics.field155 = null;
        for (int var12 = 0; var12 < 8; var12++) {
            field563[var12] = new class220();
        }
        Statics.field1864 = null;
    }

    @ObfuscatedName("fy.z(II)V")
    public static void method3226(int arg0) {
        if (arg0 == -3) {
            class32.method149(class157.field2453, class157.field2339, class157.field2340);
        } else if (arg0 == -2) {
            class32.method149(class157.field2341, class157.field2342, class157.field2343);
        } else if (arg0 == -1) {
            class32.method149(class157.field2352, class157.field2319, class157.field2346);
        } else if (arg0 == 3) {
            class32.method149(class157.field2347, class157.field2348, class157.field2349);
        } else if (arg0 == 4) {
            class32.method149(class157.field2350, class157.field2351, class157.field2500);
        } else if (arg0 == 5) {
            class32.method149(class157.field2353, class157.field2354, class157.field2355);
        } else if (arg0 == 6) {
            class32.method149(class157.field2356, class157.field2357, class157.field2383);
        } else if (arg0 == 7) {
            class32.method149(class157.field2359, class157.field2360, class157.field2460);
        } else if (arg0 == 8) {
            class32.method149(class157.field2362, class157.field2315, class157.field2512);
        } else if (arg0 == 9) {
            class32.method149(class157.field2365, class157.field2366, class157.field2491);
        } else if (arg0 == 10) {
            class32.method149(class157.field2368, class157.field2369, class157.field2370);
        } else if (arg0 == 11) {
            class32.method149(class157.field2371, class157.field2379, class157.field2373);
        } else if (arg0 == 12) {
            class32.method149(class157.field2374, class157.field2424, class157.field2376);
        } else if (arg0 == 13) {
            class32.method149(class157.field2377, class157.field2361, class157.field2335);
        } else if (arg0 == 14) {
            class32.method149(class157.field2563, class157.field2502, class157.field2382);
        } else if (arg0 == 16) {
            class32.method149(class157.field2521, class157.field2329, class157.field2388);
        } else if (arg0 == 17) {
            class32.method149(class157.field2386, class157.field2380, class157.field2364);
        } else if (arg0 == 18) {
            class32.method149(class157.field2560, class157.field2445, class157.field2391);
        } else if (arg0 == 19) {
            class32.method149(class157.field2392, class157.field2393, class157.field2375);
        } else if (arg0 == 20) {
            class32.method149(class157.field2462, class157.field2428, class157.field2397);
        } else if (arg0 == 22) {
            class32.method149(class157.field2398, class157.field2442, class157.field2400);
        } else if (arg0 == 23) {
            class32.method149(class157.field2401, class157.field2444, class157.field2403);
        } else if (arg0 == 24) {
            class32.method149(class157.field2465, class157.field2405, class157.field2468);
        } else if (arg0 == 25) {
            class32.method149(class157.field2407, class157.field2503, class157.field2409);
        } else if (arg0 == 26) {
            class32.method149(class157.field2410, class157.field2506, class157.field2412);
        } else if (arg0 == 27) {
            class32.method149(class157.field2413, class157.field2474, class157.field2415);
        } else if (arg0 == 31) {
            class32.method149(class157.field2422, class157.field2423, class157.field2449);
        } else if (arg0 == 32) {
            class32.method149(class157.field2425, class157.field2426, class157.field2427);
        } else if (arg0 == 37) {
            class32.method149(class157.field2298, class157.field2429, class157.field2408);
        } else if (arg0 == 38) {
            class32.method149(class157.field2557, class157.field2432, class157.field2433);
        } else if (arg0 == 55) {
            class32.method149(class157.field2434, class157.field2358, class157.field2436);
        } else if (arg0 == 56) {
            class32.method149(class157.field2437, class157.field2438, class157.field2439);
            method908(11);
            return;
        } else if (arg0 == 57) {
            class32.method149(class157.field2559, class157.field2441, class157.field2467);
            method908(11);
            return;
        } else {
            class32.method149(class157.field2461, class157.field2510, class157.field2344);
        }
        method908(10);
    }

    @ObfuscatedName("cw.s(I)V")
    public static final void method2086() {
        if (Statics.field1764 != null) {
            Statics.field1764.method2784();
            Statics.field1764 = null;
        }
        method3439();
        Statics.field107.method1721();
        for (int var0 = 0; var0 < 4; var0++) {
            field348[var0].method2176();
        }
        System.gc();
        class183.field2946 = 1;
        Statics.field714 = null;
        Statics.field2943 = -1;
        Statics.field2024 = -1;
        Statics.field2948 = 0;
        Statics.field2061 = false;
        Statics.field72 = 2;
        field525 = -1;
        field320 = false;
        class24.method549();
        method908(10);
    }

    @ObfuscatedName("go.j(B)V")
    public static final void method3439() {
        class47.field1042.method3452();
        class42.field965.method3452();
        class45.field1031.method3452();
        class41.field947.method3452();
        class41.field918.method3452();
        class41.field948.method3452();
        class41.field919.method3452();
        class40.field877.method3452();
        class40.field878.method3452();
        class52.field1101.method3452();
        class52.field1109.method3452();
        class52.field1136.method3452();
        class43.field981.method3452();
        class43.field976.method3452();
        class44.method712();
        class48.method2596();
        class53.field1162.method3452();
        class179.method177();
        class173.field2748.method3452();
        class173.field2749.method3452();
        class173.field2836.method3452();
        class173.field2833.method3452();
        ((class95) Statics.field1576).method1981();
        class23.field608.method3452();
        Statics.field75.method2987();
        Statics.field21.method2987();
        Statics.field3112.method2987();
        Statics.field631.method2987();
        Statics.field3133.method2987();
        Statics.field2658.method2987();
        Statics.field173.method2987();
        Statics.field1553.method2987();
        Statics.field1981.method2987();
        Statics.field713.method2987();
        Statics.field773.method2987();
        Statics.field1010.method2987();
    }

    @ObfuscatedName("cu.b(B)V")
    public static final void method1973() {
        if (Statics.field699 != null) {
            Statics.field699.method1119();
        }
        if (Statics.field689 != null) {
            Statics.field689.method1119();
        }
    }

    @ObfuscatedName("cz.r(I)V")
    public static final void method1995() {
        for (int var0 = 0; var0 < field345; var0++) {
            int var10002 = field306[var0]--;
            if (field306[var0] >= -10) {
                class59 var2 = field302[var0];
                if (var2 == null) {
                    class59 var10000 = (class59) null;
                    var2 = class59.method1169(Statics.field631, field530[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field306[var0] += var2.method1164();
                    field302[var0] = var2;
                }
                if (field306[var0] < 0) {
                    int var9;
                    if (field498[var0] == 0) {
                        var9 = field527;
                    } else {
                        int var3 = (field498[var0] & 0xFF) * 128;
                        int var4 = field498[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2040.field854;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field498[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2040.field808;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field306[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field528 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1163().method1204(Statics.field2140);
                        class65 var11 = class65.method1225(var10, 100, var9);
                        var11.method1228(field531[var0] - 1);
                        Statics.field1533.method1068(var11);
                    }
                    field306[var0] = -100;
                }
            } else {
                field345--;
                for (int var1 = var0; var1 < field345; var1++) {
                    field530[var1] = field530[var1 + 1];
                    field302[var1] = field302[var1 + 1];
                    field531[var1] = field531[var1 + 1];
                    field306[var1] = field306[var1 + 1];
                    field498[var1] = field498[var1 + 1];
                }
                var0--;
            }
        }
        if (!field320) {
            return;
        }
        boolean var12;
        if (class183.field2946 == 0) {
            var12 = Statics.field3197.method3321();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field357 != 0 && field525 != -1) {
                class183.method3076(Statics.field2658, field525, 0, field357, false);
            }
            field320 = false;
        }
    }

    @ObfuscatedName("e.n(Lau;IIII)V")
    public static void method137(class43 arg0, int arg1, int arg2, int arg3) {
        if (field345 >= 50 || field528 == 0 || arg0.field989 == null || arg1 >= arg0.field989.length) {
            return;
        }
        int var4 = arg0.field989[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field530[field345] = var5;
        field531[field345] = var6;
        field306[field345] = 0;
        field302[field345] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field498[field345] = (var8 << 16) + (var9 << 8) + var7;
        field345++;
    }

    @ObfuscatedName("ci.c(IIIB)V")
    public static void method2078(int arg0, int arg1, int arg2) {
        if (field527 == 0 || arg1 == 0 || field345 >= 50) {
            return;
        }
        field530[field345] = arg0;
        field531[field345] = arg1;
        field306[field345] = arg2;
        field302[field345] = null;
        field498[field345] = 0;
        field345++;
    }

    @ObfuscatedName("n.k(III)V")
    public static void method557(int arg0, int arg1) {
        if (field357 != 0 && arg0 != -1) {
            class183.method3076(Statics.field773, arg0, 0, field357, false);
            field320 = true;
        }
    }

    @ObfuscatedName("ab.x(I)V")
    public static final void method891() {
        int var0 = field439 + Statics.field2040.field854;
        int var1 = field354 + Statics.field2040.field808;
        if (Statics.field1668 - var0 < -500 || Statics.field1668 - var0 > 500 || Statics.field191 - var1 < -500 || Statics.field191 - var1 > 500) {
            Statics.field1668 = var0;
            Statics.field191 = var1;
        }
        if (Statics.field1668 != var0) {
            Statics.field1668 += (var0 - Statics.field1668) / 16;
        }
        if (Statics.field191 != var1) {
            Statics.field191 += (var1 - Statics.field191) / 16;
        }
        if (class140.field2137 == 4 && Statics.field1037) {
            int var2 = class140.field2139 * -432201367 - field376;
            field374 = var2 * 2;
            field376 = var2 == -1 || var2 == 1 ? class140.field2139 * -432201367 : (field376 + class140.field2139 * -432201367) / 2;
            int var3 = field545 - class140.field2150;
            field373 = var3 * 2;
            field545 = var3 == -1 || var3 == 1 ? class140.field2150 : (field545 + class140.field2150) / 2;
        } else {
            if (class137.field2112[96]) {
                field373 += (-24 - field373) / 2;
            } else if (class137.field2112[97]) {
                field373 += (24 - field373) / 2;
            } else {
                field373 /= 2;
            }
            if (class137.field2112[98]) {
                field374 += (12 - field374) / 2;
            } else if (class137.field2112[99]) {
                field374 += (-12 - field374) / 2;
            } else {
                field374 /= 2;
            }
            field376 = class140.field2139 * -432201367;
            field545 = class140.field2150;
        }
        field372 = field373 / 2 + field372 & 0x7FF;
        field371 += field374 / 2;
        if (field371 < 128) {
            field371 = 128;
        }
        if (field371 > 383) {
            field371 = 383;
        }
        int var4 = Statics.field1668 >> 7;
        int var5 = Statics.field191 >> 7;
        int var6 = Statics.method141(Statics.field1668, Statics.field191, Statics.field1516);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field1516;
                    if (var10 < 3 && (class6.field84[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field83[var10][var8][var9];
                    if (var11 > var7) {
                        var7 = var11;
                    }
                }
            }
        }
        int var12 = var7 * 192;
        if (var12 > 98048) {
            var12 = 98048;
        }
        if (var12 < 32768) {
            var12 = 32768;
        }
        if (var12 > field380) {
            field380 += (var12 - field380) / 24;
        } else if (var12 < field380) {
            field380 += (var12 - field380) / 80;
        }
    }

    @ObfuscatedName("ag.ar(B)V")
    public static final void method718() {
        int var0 = class33.field754;
        int[] var1 = class33.field758;
        for (int var2 = 0; var2 < var0; var2++) {
            class3 var3 = field293[var1[var2]];
            if (var3 != null) {
                method2570(var3, 1);
            }
        }
    }

    @ObfuscatedName("a.as(I)V")
    public static final void method154() {
        for (int var0 = 0; var0 < field327; var0++) {
            int var1 = field521[var0];
            class35 var2 = field378[var1];
            if (var2 != null) {
                method2570(var2, var2.field779.field881);
            }
        }
    }

    @ObfuscatedName("dt.ac(Lap;II)V")
    public static final void method2570(class38 arg0, int arg1) {
        if (arg0.field852 > field299) {
            int var2 = arg0.field852 - field299;
            int var3 = arg0.field861 * 128 + arg0.field811 * 64;
            int var4 = arg0.field850 * 128 + arg0.field811 * 64;
            arg0.field854 += (var3 - arg0.field854) / var2;
            arg0.field808 += (var4 - arg0.field808) / var2;
            arg0.field864 = 0;
            arg0.field857 = arg0.field810;
        } else if (arg0.field839 >= field299) {
            method894(arg0);
        } else {
            method2812(arg0);
        }
        if (arg0.field854 < 128 || arg0.field808 < 128 || arg0.field854 >= 13184 || arg0.field808 >= 13184) {
            arg0.field847 = -1;
            arg0.field843 = -1;
            arg0.field852 = 0;
            arg0.field839 = 0;
            arg0.field854 = arg0.field853[0] * 128 + arg0.field811 * 64;
            arg0.field808 = arg0.field862[0] * 128 + arg0.field811 * 64;
            arg0.method723();
        }
        if (Statics.field2040 == arg0 && (arg0.field854 < 1536 || arg0.field808 < 1536 || arg0.field854 >= 11776 || arg0.field808 >= 11776)) {
            arg0.field847 = -1;
            arg0.field843 = -1;
            arg0.field852 = 0;
            arg0.field839 = 0;
            arg0.field854 = arg0.field853[0] * 128 + arg0.field811 * 64;
            arg0.field808 = arg0.field862[0] * 128 + arg0.field811 * 64;
            arg0.method723();
        }
        if (arg0.field859 != 0) {
            if (arg0.field844 != -1) {
                class38 var5 = null;
                if (arg0.field844 < 32768) {
                    var5 = field378[arg0.field844];
                } else if (arg0.field844 >= 32768) {
                    var5 = field293[arg0.field844 - 32768];
                }
                if (var5 != null) {
                    int var6 = arg0.field854 - var5.field854;
                    int var7 = arg0.field808 - var5.field808;
                    if (var6 != 0 || var7 != 0) {
                        arg0.field857 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field833) {
                    arg0.field844 = -1;
                    arg0.field833 = false;
                }
            }
            if (arg0.field834 != -1 && (arg0.field865 == 0 || arg0.field864 > 0)) {
                arg0.field857 = arg0.field834;
                arg0.field834 = -1;
            }
            int var8 = arg0.field857 - arg0.field809 & 0x7FF;
            if (var8 == 0 && arg0.field833) {
                arg0.field844 = -1;
                arg0.field833 = false;
            }
            if (var8 == 0) {
                arg0.field858 = 0;
            } else {
                arg0.field858++;
                if (var8 > 1024) {
                    arg0.field809 -= arg0.field859;
                    boolean var9 = true;
                    if (var8 < arg0.field859 || var8 > 2048 - arg0.field859) {
                        arg0.field809 = arg0.field857;
                        var9 = false;
                    }
                    if (arg0.field848 == arg0.field812 && (arg0.field858 > 25 || var9)) {
                        if (arg0.field831 == -1) {
                            arg0.field848 = arg0.field815;
                        } else {
                            arg0.field848 = arg0.field831;
                        }
                    }
                } else {
                    arg0.field809 += arg0.field859;
                    boolean var10 = true;
                    if (var8 < arg0.field859 || var8 > 2048 - arg0.field859) {
                        arg0.field809 = arg0.field857;
                        var10 = false;
                    }
                    if (arg0.field848 == arg0.field812 && (arg0.field858 > 25 || var10)) {
                        if (arg0.field829 == -1) {
                            arg0.field848 = arg0.field815;
                        } else {
                            arg0.field848 = arg0.field829;
                        }
                    }
                }
                arg0.field809 &= 0x7FF;
            }
        }
        arg0.field818 = false;
        if (arg0.field848 != -1) {
            class43 var12 = class43.method3081(arg0.field848);
            if (var12 == null || var12.field978 == null) {
                arg0.field848 = -1;
            } else {
                arg0.field820++;
                if (arg0.field836 < var12.field978.length && arg0.field820 > var12.field980[arg0.field836]) {
                    arg0.field820 = 1;
                    arg0.field836++;
                    method137(var12, arg0.field836, arg0.field854, arg0.field808);
                }
                if (arg0.field836 >= var12.field978.length) {
                    arg0.field820 = 0;
                    arg0.field836 = 0;
                    method137(var12, arg0.field836, arg0.field854, arg0.field808);
                }
            }
        }
        if (arg0.field843 != -1 && field299 >= arg0.field846) {
            if (arg0.field835 < 0) {
                arg0.field835 = 0;
            }
            int var13 = class44.method1455(arg0.field843).field998;
            if (var13 == -1) {
                arg0.field843 = -1;
            } else {
                class43 var14 = class43.method3081(var13);
                if (var14 == null || var14.field978 == null) {
                    arg0.field843 = -1;
                } else {
                    arg0.field845++;
                    if (arg0.field835 < var14.field978.length && arg0.field845 > var14.field980[arg0.field835]) {
                        arg0.field845 = 1;
                        arg0.field835++;
                        method137(var14, arg0.field835, arg0.field854, arg0.field808);
                    }
                    if (arg0.field835 >= var14.field978.length && (arg0.field835 < 0 || arg0.field835 >= var14.field978.length)) {
                        arg0.field843 = -1;
                    }
                }
            }
        }
        if (arg0.field847 != -1 && arg0.field841 <= 1) {
            class43 var15 = class43.method3081(arg0.field847);
            if (var15.field987 == 1 && arg0.field832 > 0 && arg0.field852 <= field299 && arg0.field839 < field299) {
                arg0.field841 = 1;
                return;
            }
        }
        if (arg0.field847 != -1 && arg0.field841 == 0) {
            class43 var16 = class43.method3081(arg0.field847);
            if (var16 == null || var16.field978 == null) {
                arg0.field847 = -1;
            } else {
                arg0.field840++;
                if (arg0.field860 < var16.field978.length && arg0.field840 > var16.field980[arg0.field860]) {
                    arg0.field840 = 1;
                    arg0.field860++;
                    method137(var16, arg0.field860, arg0.field854, arg0.field808);
                }
                if (arg0.field860 >= var16.field978.length) {
                    arg0.field860 -= var16.field974;
                    arg0.field842++;
                    if (arg0.field842 >= var16.field988) {
                        arg0.field847 = -1;
                    } else if (arg0.field860 >= 0 && arg0.field860 < var16.field978.length) {
                        method137(var16, arg0.field860, arg0.field854, arg0.field808);
                    } else {
                        arg0.field847 = -1;
                    }
                }
                arg0.field818 = var16.field984;
            }
        }
        if (arg0.field841 > 0) {
            arg0.field841--;
        }
    }

    @ObfuscatedName("ab.ah(Lap;I)V")
    public static final void method894(class38 arg0) {
        if (field299 == arg0.field839 || arg0.field847 == -1 || arg0.field841 != 0 || arg0.field840 + 1 > class43.method3081(arg0.field847).field980[arg0.field860]) {
            int var1 = arg0.field839 - arg0.field852;
            int var2 = field299 - arg0.field852;
            int var3 = arg0.field861 * 128 + arg0.field811 * 64;
            int var4 = arg0.field850 * 128 + arg0.field811 * 64;
            int var5 = arg0.field837 * 128 + arg0.field811 * 64;
            int var6 = arg0.field851 * 128 + arg0.field811 * 64;
            arg0.field854 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field808 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field864 = 0;
        arg0.field857 = arg0.field810;
        arg0.field809 = arg0.field857;
    }

    @ObfuscatedName("ef.al(Lap;B)V")
    public static final void method2812(class38 arg0) {
        arg0.field848 = arg0.field812;
        if (arg0.field865 == 0) {
            arg0.field864 = 0;
            return;
        }
        if (arg0.field847 != -1 && arg0.field841 == 0) {
            class43 var1 = class43.method3081(arg0.field847);
            if (arg0.field832 > 0 && var1.field987 == 0) {
                arg0.field864++;
                return;
            }
            if (arg0.field832 <= 0 && var1.field990 == 0) {
                arg0.field864++;
                return;
            }
        }
        int var2 = arg0.field854;
        int var3 = arg0.field808;
        int var4 = arg0.field853[arg0.field865 - 1] * 128 + arg0.field811 * 64;
        int var5 = arg0.field862[arg0.field865 - 1] * 128 + arg0.field811 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field857 = 1280;
            } else if (var3 > var5) {
                arg0.field857 = 1792;
            } else {
                arg0.field857 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field857 = 768;
            } else if (var3 > var5) {
                arg0.field857 = 256;
            } else {
                arg0.field857 = 512;
            }
        } else if (var3 < var5) {
            arg0.field857 = 1024;
        } else if (var3 > var5) {
            arg0.field857 = 0;
        }
        byte var6 = arg0.field863[arg0.field865 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field854 = var4;
            arg0.field808 = var5;
            arg0.field865--;
            if (arg0.field832 > 0) {
                arg0.field832--;
            }
            return;
        }
        int var7 = arg0.field857 - arg0.field809 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field816;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field815;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field849;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field817;
        }
        if (var8 == -1) {
            var8 = arg0.field815;
        }
        arg0.field848 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class35) {
            var10 = ((class35) arg0).field779.field909;
        }
        if (var10) {
            if (arg0.field857 != arg0.field809 && arg0.field844 == -1 && arg0.field859 != 0) {
                var9 = 2;
            }
            if (arg0.field865 > 2) {
                var9 = 6;
            }
            if (arg0.field865 > 3) {
                var9 = 8;
            }
            if (arg0.field864 > 0 && arg0.field865 > 1) {
                var9 = 8;
                arg0.field864--;
            }
        } else {
            if (arg0.field865 > 1) {
                var9 = 6;
            }
            if (arg0.field865 > 2) {
                var9 = 8;
            }
            if (arg0.field864 > 0 && arg0.field865 > 1) {
                var9 = 8;
                arg0.field864--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field848 == arg0.field815 && arg0.field819 != -1) {
            arg0.field848 = arg0.field819;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field854 += var9;
                if (arg0.field854 > var4) {
                    arg0.field854 = var4;
                }
            } else if (var2 > var4) {
                arg0.field854 -= var9;
                if (arg0.field854 < var4) {
                    arg0.field854 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field808 += var9;
                if (arg0.field808 > var5) {
                    arg0.field808 = var5;
                }
            } else if (var3 > var5) {
                arg0.field808 -= var9;
                if (arg0.field808 < var5) {
                    arg0.field808 = var5;
                }
            }
        }
        if (arg0.field854 == var4 && arg0.field808 == var5) {
            arg0.field865--;
            if (arg0.field832 > 0) {
                arg0.field832--;
            }
        }
    }

    @ObfuscatedName("ft.am(Li;IIB)V")
    public static void method3077(class3 arg0, int arg1, int arg2) {
        if (arg0.field847 == arg1 && arg1 != -1) {
            int var3 = class43.method3081(arg1).field991;
            if (var3 == 1) {
                arg0.field860 = 0;
                arg0.field840 = 0;
                arg0.field841 = arg2;
                arg0.field842 = 0;
            }
            if (var3 == 2) {
                arg0.field842 = 0;
            }
        } else if (arg1 == -1 || arg0.field847 == -1 || class43.method3081(arg1).field985 >= class43.method3081(arg0.field847).field985) {
            arg0.field847 = arg1;
            arg0.field860 = 0;
            arg0.field840 = 0;
            arg0.field841 = arg2;
            arg0.field842 = 0;
            arg0.field832 = arg0.field865;
        }
    }

    @ObfuscatedName("er.ae(I)V")
    public static void method2679() {
        client var0 = Statics.field286;
        synchronized (Statics.field286) {
            Container var1 = Statics.field286.method2802();
            if (var1 != null) {
                Statics.field2160 = Math.max(var1.getSize().width, Statics.field679);
                Statics.field1177 = Math.max(var1.getSize().height, Statics.field2189);
                if (Statics.field872 == var1) {
                    Insets var2 = Statics.field872.getInsets();
                    Statics.field2160 -= var2.right + var2.left;
                    Statics.field1177 -= var2.top + var2.bottom;
                }
                if (Statics.field2160 <= 0) {
                    Statics.field2160 = 1;
                }
                if (Statics.field1177 <= 0) {
                    Statics.field1177 = 1;
                }
                int var3 = field511 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field2178 = field502;
                    Statics.field164 = field503 * 503;
                } else {
                    Statics.field2178 = Math.min(Statics.field2160, 7680);
                    Statics.field164 = Math.min(Statics.field1177, 2160);
                }
                field2184 = (Statics.field2160 - Statics.field2178) / 2;
                field2190 = 0;
                Statics.field1038.setSize(Statics.field2178, Statics.field164);
                Statics.field3103 = class78.method3079(Statics.field2178, Statics.field164, Statics.field1038);
                if (Statics.field872 == var1) {
                    Insets var4 = Statics.field872.getInsets();
                    Statics.field1038.setLocation(field2184 + var4.left, field2190 + var4.top);
                } else {
                    Statics.field1038.setLocation(field2184, field2190);
                }
                int var5 = Statics.field2178;
                int var6 = Statics.field164;
                if (Statics.field2160 < var5) {
                    int var7 = Statics.field2160;
                }
                if (Statics.field1177 < var6) {
                    int var8 = Statics.field1177;
                }
                if (Statics.field1030 != null) {
                    try {
                        client var9 = Statics.field286;
                        int var10 = field511 ? 2 : 1;
                        Object[] var11 = new Object[] { var10 };
                        JSObject.getWindow(var9).call("resize", var11);
                    } catch (Throwable var14) {
                    }
                }
                if (field392 != -1) {
                    method2875(true);
                }
                method921();
            }
        }
    }

    @ObfuscatedName("az.ai(I)V")
    public static void method921() {
        int var0 = field2184;
        int var1 = field2190;
        int var2 = Statics.field2160 - Statics.field2178 - var0;
        int var3 = Statics.field1177 - Statics.field164 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field286.method2802();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field872 == var4) {
                Insets var7 = Statics.field872.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field1177);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field2160, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field2160 + var5 - var2, var6, var2, Statics.field1177);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field1177 + var6 - var3, Statics.field2160, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("fj.aa(I)V")
    public static final void method2894() {
        if (field392 != -1) {
            int var0 = field392;
            if (class173.method2229(var0)) {
                method83(Statics.field2807[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field409; var1++) {
            if (field492[var1]) {
                field484[var1] = true;
            }
            field481[var1] = field492[var1];
            field492[var1] = false;
        }
        field491 = field299;
        field435 = -1;
        field351 = -1;
        Statics.field1364 = null;
        if (field392 != -1) {
            field409 = 0;
            method2077(field392, 0, 0, Statics.field2178, Statics.field164, 0, 0, -1);
        }
        class80.method1642();
        if (field427) {
            method634();
        } else if (field435 != -1) {
            method1996(field435, field351);
        }
        if (field499 == 3) {
            for (int var2 = 0; var2 < field409; var2++) {
                if (field481[var2]) {
                    class80.method1634(field495[var2], field496[var2], field536[var2], field337[var2], 16711935, 128);
                } else if (field484[var2]) {
                    class80.method1634(field495[var2], field496[var2], field536[var2], field337[var2], 16711680, 128);
                }
            }
        }
        class24.method2236(Statics.field1516, Statics.field2040.field854, Statics.field2040.field808, field352);
        field352 = 0;
    }

    @ObfuscatedName("bp.ag(Ljava/lang/String;ZI)V")
    public static final void method1115(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field341.method3783(arg0, 250);
        int var6 = Statics.field341.method3721(arg0, 250) * 13;
        class80.method1665(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1641(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field341.method3797(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method804(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field1038.getGraphics();
                Statics.field3103.method1458(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field1038.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field409; var13++) {
            if (field536[var13] + field495[var13] > var9 && field495[var13] < var9 + var11 && field496[var13] + field337[var13] > var10 && field496[var13] < var10 + var12) {
                field484[var13] = true;
            }
        }
    }

    @ObfuscatedName("cv.an(IIIIZI)V")
    public static final void method1894(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field411 - field541) * var5 / 100 + field541;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field547) {
            short var8 = field547;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field546) {
                var6 = field546;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1642();
                    class80.method1665(arg0, arg1, var10, arg3, -16777216);
                    class80.method1665(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field548) {
            short var11 = field548;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field557) {
                var6 = field557;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1642();
                    class80.method1665(arg0, arg1, arg2, var13, -16777216);
                    class80.method1665(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field544 - field543) * var5 / 100 + field543;
        field553 = arg3 * var6 * var14 / 85504 << 1;
        if (field551 != arg2 || field552 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class91.field1579[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class86.method1756(var15, 500, 800, arg2, arg3);
        }
        field524 = arg0;
        field560 = arg1;
        field551 = arg2;
        field552 = arg3;
    }

    @ObfuscatedName("el.ap(Lai;B)V")
    public static final void method2748(class34 arg0) {
        if (Statics.field2040.field854 >> 7 == field469 && Statics.field2040.field808 >> 7 == field480) {
            field469 = 0;
        }
        int var1 = class33.field754;
        int[] var2 = class33.field758;
        int var3 = var1;
        if (class34.field769 == arg0 || class34.field770 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field769 == arg0) {
                var5 = Statics.field2040;
                var6 = Statics.field2040.field58 << 14;
            } else if (class34.field770 == arg0) {
                var5 = field293[field375];
                var6 = field375 << 14;
            } else {
                var5 = field293[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field772 == arg0 && field375 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method22() && !var5.field56) {
                var5.field54 = false;
                if ((field570 && var1 > 50 || var1 > 200) && class34.field769 != arg0 && var5.field848 == var5.field812) {
                    var5.field54 = true;
                }
                int var7 = var5.field854 >> 7;
                int var8 = var5.field808 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field49 == null || field299 < var5.field48 || field299 >= var5.field63) {
                        if ((var5.field854 & 0x7F) == 64 && (var5.field808 & 0x7F) == 64) {
                            if (field506 == field488[var7][var8]) {
                                continue;
                            }
                            field488[var7][var8] = field506;
                        }
                        var5.field43 = Statics.method141(var5.field854, var5.field808, Statics.field1516);
                        Statics.field107.method1746(Statics.field1516, var5.field854, var5.field808, var5.field43, 60, var5, var5.field809, var6, var5.field818);
                    } else {
                        var5.field54 = false;
                        var5.field43 = Statics.method141(var5.field854, var5.field808, Statics.field1516);
                        Statics.field107.method1733(Statics.field1516, var5.field854, var5.field808, var5.field43, 60, var5, var5.field809, var6, var5.field50, var5.field62, var5.field52, var5.field46);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bg.ay(ZI)V")
    public static final void method1450(boolean arg0) {
        for (int var1 = 0; var1 < field327; var1++) {
            class35 var2 = field378[field521[var1]];
            int var3 = (field521[var1] << 14) + 536870912;
            if (var2 != null && var2.method22() && var2.field779.field900 == arg0 && var2.field779.method748()) {
                int var4 = var2.field854 >> 7;
                int var5 = var2.field808 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field811 == 1 && (var2.field854 & 0x7F) == 64 && (var2.field808 & 0x7F) == 64) {
                        if (field506 == field488[var4][var5]) {
                            continue;
                        }
                        field488[var4][var5] = field506;
                    }
                    if (!var2.field779.field889) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field107.method1746(Statics.field1516, var2.field854, var2.field808, Statics.method141(var2.field854 + (var2.field811 * 64 - 64), var2.field808 + (var2.field811 * 64 - 64), Statics.field1516), var2.field811 * 64 - 64 + 60, var2, var2.field809, var3, var2.field818);
                }
            }
        }
    }

    @ObfuscatedName("d.ax(I)V")
    public static final void method172() {
        for (class7 var0 = (class7) field533.method3520(); var0 != null; var0 = (class7) field533.method3522()) {
            if (Statics.field1516 != var0.field113 || field299 > var0.field115) {
                var0.method3605();
            } else if (field299 >= var0.field111) {
                if (var0.field108 > 0) {
                    class35 var1 = field378[var0.field108 - 1];
                    if (var1 != null && var1.field854 >= 0 && var1.field854 < 13312 && var1.field808 >= 0 && var1.field808 < 13312) {
                        var0.method78(var1.field854, var1.field808, Statics.method141(var1.field854, var1.field808, var0.field113) - var0.field117, field299);
                    }
                }
                if (var0.field108 < 0) {
                    int var2 = -var0.field108 - 1;
                    class3 var3;
                    if (field410 == var2) {
                        var3 = Statics.field2040;
                    } else {
                        var3 = field293[var2];
                    }
                    if (var3 != null && var3.field854 >= 0 && var3.field854 < 13312 && var3.field808 >= 0 && var3.field808 < 13312) {
                        var0.method78(var3.field854, var3.field808, Statics.method141(var3.field854, var3.field808, var0.field113) - var0.field117, field299);
                    }
                }
                var0.method77(field352);
                Statics.field107.method1746(Statics.field1516, (int) var0.field116, (int) var0.field109, (int) var0.field119, 60, var0, var0.field128, -1, false);
            }
        }
    }

    @ObfuscatedName("cr.af(I)V")
    public static final void method1978() {
        for (class30 var0 = (class30) field422.method3520(); var0 != null; var0 = (class30) field422.method3522()) {
            if (Statics.field1516 != var0.field693 || var0.field691) {
                var0.method3605();
            } else if (field299 >= var0.field692) {
                var0.method632(field352);
                if (var0.field691) {
                    var0.method3605();
                } else {
                    Statics.field107.method1746(var0.field693, var0.field694, var0.field705, var0.field696, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("dq.av(Lap;IIIIII)V")
    public static final void method2601(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method22()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field779;
            if (var6.field894 != null) {
                var6 = var6.method735();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field754;
        int[] var8 = class33.field758;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field56) {
                return;
            }
            if (var10.field37 != -1 || var10.field38 != -1) {
                method8(arg0, arg0.field856 + 15);
                if (field518 > -1) {
                    if (var10.field37 != -1) {
                        Statics.field2233[var10.field37].method1547(field518 + arg2 - 12, field394 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field38 != -1) {
                        Statics.field160[var10.field38].method1547(field518 + arg2 - 12, field394 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field307 == 10 && field379 == var8[arg1]) {
                method8(arg0, arg0.field856 + 15);
                if (field518 > -1) {
                    Statics.field144[1].method1547(field518 + arg2 - 12, field394 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field779;
            if (var11.field894 != null) {
                var11 = var11.method735();
            }
            if (var11.field903 >= 0 && var11.field903 < Statics.field160.length) {
                method8(arg0, arg0.field856 + 15);
                if (field518 > -1) {
                    Statics.field160[var11.field903].method1547(field518 + arg2 - 12, field394 + arg3 - 30);
                }
            }
            if (field307 == 1 && field308 == field521[arg1 - var7] && field299 % 20 < 10) {
                method8(arg0, arg0.field856 + 15);
                if (field518 > -1) {
                    Statics.field144[0].method1547(field518 + arg2 - 12, field394 + arg3 - 28);
                }
            }
        }
        if (arg0.field838 != null && (arg1 >= var7 || !arg0.field822 && (field356 == 4 || !arg0.field821 && (field356 == 0 || field356 == 3 || field356 == 1 && method2786(((class3) arg0).field44, false))))) {
            method8(arg0, arg0.field856);
            if (field518 > -1 && field338 < field418) {
                field386[field338] = Statics.field2625.method3775(arg0.field838) / 2;
                field385[field338] = Statics.field2625.field3175;
                field383[field338] = field518;
                field384[field338] = field394;
                field387[field338] = arg0.field824;
                field388[field338] = arg0.field825;
                field389[field338] = arg0.field823;
                field390[field338] = arg0.field838;
                field338++;
            }
        }
        if (arg0.field807 > field299) {
            method8(arg0, arg0.field856 + 15);
            if (field518 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field779;
                    var12 = var13.field911;
                }
                int var14 = arg0.field830 * var12 / arg0.field814;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field830 > 0) {
                    var14 = 1;
                }
                class80.method1665(field518 + arg2 - var12 / 2, field394 + arg3 - 3, var14, 5, 65280);
                class80.method1665(field518 + arg2 - var12 / 2 + var14, field394 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field828[var15] > field299) {
                method8(arg0, arg0.field856 / 2);
                if (field518 > -1) {
                    if (var15 == 1) {
                        field394 -= 20;
                    }
                    if (var15 == 2) {
                        field518 -= 15;
                        field394 -= 10;
                    }
                    if (var15 == 3) {
                        field518 += 15;
                        field394 -= 10;
                    }
                    Statics.field1152[arg0.field827[var15]].method1547(field518 + arg2 - 12, field394 + arg3 - 12);
                    Statics.field249.method3794(Integer.toString(arg0.field826[var15]), field518 + arg2 - 1, field394 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("ar.au(IIIIB)V")
    public static final void method613(int arg0, int arg1, int arg2, int arg3) {
        field338 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class33.field754;
        int[] var7 = class33.field758;
        for (int var8 = 0; var8 < field327 + var6; var8++) {
            class38 var9;
            if (var8 < var6) {
                var9 = field293[var7[var8]];
                if (field375 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field378[field521[var8 - var6]];
            }
            method2601(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method2601(field293[field375], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field338; var10++) {
            int var11 = field383[var10];
            int var12 = field384[var10];
            int var13 = field386[var10];
            int var14 = field385[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field384[var16] - field385[var16] && var12 - var14 < field384[var16] + 2 && var11 - var13 < field386[var16] + field383[var16] && var11 + var13 > field383[var16] - field386[var16] && field384[var16] - field385[var16] < var12) {
                        var12 = field384[var16] - field385[var16];
                        var15 = true;
                    }
                }
            }
            field518 = field383[var10];
            field394 = field384[var10] = var12;
            String var17 = field390[var10];
            if (field448 == 0) {
                int var18 = 16776960;
                if (field387[var10] < 6) {
                    var18 = field504[field387[var10]];
                }
                if (field387[var10] == 6) {
                    var18 = field506 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field387[var10] == 7) {
                    var18 = field506 % 20 < 10 ? 255 : 65535;
                }
                if (field387[var10] == 8) {
                    var18 = field506 % 20 < 10 ? 45056 : 8454016;
                }
                if (field387[var10] == 9) {
                    int var19 = 150 - field389[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field387[var10] == 10) {
                    int var20 = 150 - field389[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field387[var10] == 11) {
                    int var21 = 150 - field389[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field388[var10] == 0) {
                    Statics.field2625.method3794(var17, field518 + arg0, field394 + arg1, var18, 0);
                }
                if (field388[var10] == 1) {
                    Statics.field2625.method3791(var17, field518 + arg0, field394 + arg1, var18, 0, field506);
                }
                if (field388[var10] == 2) {
                    Statics.field2625.method3728(var17, field518 + arg0, field394 + arg1, var18, 0, field506);
                }
                if (field388[var10] == 3) {
                    Statics.field2625.method3803(var17, field518 + arg0, field394 + arg1, var18, 0, field506, 150 - field389[var10]);
                }
                if (field388[var10] == 4) {
                    int var22 = (150 - field389[var10]) * (Statics.field2625.method3775(var17) + 100) / 150;
                    class80.method1673(field518 + arg0 - 50, arg1, field518 + arg0 + 50, arg1 + arg3);
                    Statics.field2625.method3723(var17, field518 + arg0 + 50 - var22, field394 + arg1, var18, 0);
                    class80.method1633(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field388[var10] == 5) {
                    int var23 = 150 - field389[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class80.method1673(arg0, field394 + arg1 - Statics.field2625.field3175 - 1, arg0 + arg2, field394 + arg1 + 5);
                    Statics.field2625.method3794(var17, field518 + arg0, field394 + arg1 + var24, var18, 0);
                    class80.method1633(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field2625.method3794(var17, field518 + arg0, field394 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("az.ad(IIIIB)V")
    public static final void method915(int arg0, int arg1, int arg2, int arg3) {
        if (field398 == 1) {
            Statics.field2238[field326 / 100].method1547(field437 - 8, field522 - 8);
        }
        if (field398 == 2) {
            Statics.field2238[field326 / 100 + 4].method1547(field437 - 8, field522 - 8);
        }
        field407 = 0;
        int var4 = (Statics.field2040.field854 >> 7) + Statics.field585;
        int var5 = (Statics.field2040.field808 >> 7) + Statics.field57;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field407 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field407 = 1;
        }
        if (field407 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field407 = 0;
        }
    }

    @ObfuscatedName("f.ab(Lap;IB)V")
    public static final void method8(class38 arg0, int arg1) {
        method2533(arg0.field854, arg0.field808, arg1);
    }

    @ObfuscatedName("db.ao(IIIB)V")
    public static final void method2533(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field518 = -1;
            field394 = -1;
            return;
        }
        int var3 = Statics.method141(arg0, arg1, Statics.field1516) - arg2;
        int var4 = arg0 - Statics.field571;
        int var5 = var3 - Statics.field20;
        int var6 = arg1 - Statics.field731;
        int var7 = class91.field1579[Statics.field2214];
        int var8 = class91.field1580[Statics.field2214];
        int var9 = class91.field1579[Statics.field1540];
        int var10 = class91.field1580[Statics.field1540];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field518 = field553 * var11 / var15 + field551 / 2;
            field394 = field553 * var14 / var15 + field552 / 2;
        } else {
            field518 = -1;
            field394 = -1;
        }
    }

    @ObfuscatedName("bo.aj(IIIIIII)V")
    public static final void method1025(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class91.field1579[var6];
            int var12 = class91.field1580[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class91.field1579[var7];
            int var15 = class91.field1580[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field571 = arg0 - var8;
        Statics.field20 = arg1 - var9;
        Statics.field731 = arg2 - var10;
        Statics.field2214 = arg3;
        Statics.field1540 = arg4;
    }

    @ObfuscatedName("cw.ak(ZI)V")
    public static final void method2085(boolean arg0) {
        field349 = arg0;
        if (!field349) {
            int var1 = field333.method2292();
            int var2 = field333.method2292();
            int var3 = field333.method2292();
            Statics.field1430 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field1430[var4][var5] = field333.method2295();
                }
            }
            Statics.field264 = new int[var3];
            Statics.field2626 = new int[var3];
            Statics.field60 = new int[var3];
            Statics.field137 = new byte[var3][];
            Statics.field3145 = new byte[var3][];
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
                        Statics.field264[var7] = var10;
                        Statics.field2626[var7] = Statics.field3133.method2989("m" + var8 + "_" + var9);
                        Statics.field60[var7] = Statics.field3133.method2989("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method1194(var1, var2);
            return;
        }
        int var11 = field333.method2326();
        int var12 = field333.method2362();
        int var13 = field333.method2292();
        field333.method2539();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field333.method2558(1);
                    if (var17 == 1) {
                        field350[var14][var15][var16] = field333.method2558(26);
                    } else {
                        field350[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field333.method2546();
        Statics.field1430 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field1430[var18][var19] = field333.method2295();
            }
        }
        Statics.field264 = new int[var13];
        Statics.field2626 = new int[var13];
        Statics.field60 = new int[var13];
        Statics.field137 = new byte[var13][];
        Statics.field3145 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field350[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field264[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field264[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field2626[var20] = Statics.field3133.method2989("m" + var29 + "_" + var30);
                            Statics.field60[var20] = Statics.field3133.method2989("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method1194(var11, var12);
    }

    @ObfuscatedName("bw.aw(III)V")
    public static final void method1194(int arg0, int arg1) {
        if (Statics.field1988 == arg0 && Statics.field2664 == arg1) {
            return;
        }
        Statics.field1988 = arg0;
        Statics.field2664 = arg1;
        method908(25);
        method1115(class157.field2308, true);
        int var2 = Statics.field585;
        int var3 = Statics.field57;
        Statics.field585 = (arg0 - 6) * 8;
        Statics.field57 = (arg1 - 6) * 8;
        int var4 = Statics.field585 - var2;
        int var5 = Statics.field57 - var3;
        int var6 = Statics.field585;
        int var7 = Statics.field57;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field378[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field853[var10] -= var4;
                    var9.field862[var10] -= var5;
                }
                var9.field854 -= var4 * 128;
                var9.field808 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field293[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field853[var13] -= var4;
                    var12.field862[var13] -= var5;
                }
                var12.field854 -= var4 * 128;
                var12.field808 -= var5 * 128;
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
                        field419[var24][var20][var21] = field419[var24][var22][var23];
                    } else {
                        field419[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field420.method3520(); var25 != null; var25 = (class17) field420.method3522()) {
            var25.field232 -= var4;
            var25.field231 -= var5;
            if (var25.field232 < 0 || var25.field231 < 0 || var25.field232 >= 104 || var25.field231 >= 104) {
                var25.method3605();
            }
        }
        if (field469 != 0) {
            field469 -= var4;
            field480 -= var5;
        }
        field345 = 0;
        field535 = false;
        field516 = -1;
        field422.method3535();
        field533.method3535();
        for (int var26 = 0; var26 < 4; var26++) {
            field348[var26].method2176();
        }
    }

    @ObfuscatedName("df.at(ZI)V")
    public static final void method2177(boolean arg0) {
        method1973();
        field368++;
        if (field368 < 50 && !arg0) {
            return;
        }
        field368 = 0;
        if (field342 || Statics.field1764 == null) {
            return;
        }
        field331.method2555(117);
        try {
            Statics.field1764.method2771(field331.field1989, 0, field331.field1984);
            field331.field1984 = 0;
        } catch (IOException var2) {
            field342 = true;
        }
    }

    @ObfuscatedName("d.aq(IB)V")
    public static final void method175(int arg0) {
        int[] var1 = Statics.field2279.field1392;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field84[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field107.method1790(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field84[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field107.method1790(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field2279.method1568();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field84[arg0][var10][var9] & 0x18) == 0) {
                    method71(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field84[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method71(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field569 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field107.method1852(Statics.field1516, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class41.method2717(var14).field942;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field348[Statics.field1516].field1896;
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
                        field520[field569] = Statics.field2280[var15];
                        field396[field569] = var16;
                        field370[field569] = var17;
                        field569++;
                    }
                }
            }
        }
        Statics.field3103.method1527();
    }

    @ObfuscatedName("u.bo(IIIIII)V")
    public static final void method71(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field107.method1747(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field107.method1751(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2279.field1392;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method2717(var12);
            if (var13.field943 == -1) {
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
                class81 var14 = Statics.field1063[var13.field943];
                if (var14 != null) {
                    int var15 = (var13.field929 * 4 - var14.field1410) / 2;
                    int var16 = (var13.field920 * 4 - var14.field1407) / 2;
                    var14.method1699(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field920) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field107.method1749(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field107.method1751(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method2717(var21);
            if (var22.field943 != -1) {
                class81 var23 = Statics.field1063[var22.field943];
                if (var23 != null) {
                    int var24 = (var22.field929 * 4 - var23.field1410) / 2;
                    int var25 = (var22.field920 * 4 - var23.field1407) / 2;
                    var23.method1699(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field920) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2279.field1392;
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
        int var29 = Statics.field107.method1852(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method2717(var30);
        if (var31.field943 == -1) {
            return;
        }
        class81 var32 = Statics.field1063[var31.field943];
        if (var32 != null) {
            int var33 = (var31.field929 * 4 - var32.field1410) / 2;
            int var34 = (var31.field920 * 4 - var32.field1407) / 2;
            var32.method1699(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field920) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("q.bf(I)Z")
    public static final boolean method34() {
        if (Statics.field1764 == null) {
            return false;
        }
        try {
            int var0 = Statics.field1764.method2780();
            if (var0 == 0) {
                return false;
            }
            if (field436 == -1) {
                Statics.field1764.method2770(field333.field1989, 0, 1);
                field333.field1984 = 0;
                field436 = field333.method2561();
                field334 = class188.field3033[field436];
                var0--;
            }
            if (field334 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field1764.method2770(field333.field1989, 0, 1);
                field334 = field333.field1989[0] & 0xFF;
                var0--;
            }
            if (field334 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field1764.method2770(field333.field1989, 0, 2);
                field333.field1984 = 0;
                field334 = field333.method2292();
                var0 -= 2;
            }
            if (var0 < field334) {
                return false;
            }
            field333.field1984 = 0;
            Statics.field1764.method2770(field333.field1989, 0, field334);
            field336 = 0;
            field340 = field339;
            field339 = field415;
            field415 = field436;
            if (field436 == 49) {
                field555 = 1;
                field479 = field549;
                field436 = -1;
                return true;
            }
            if (field436 == 176) {
                Statics.field1610 = class130.method2496(field333.method2290());
                field436 = -1;
                return true;
            }
            if (field436 == 196) {
                int var1 = field333.method2295();
                class4 var2 = (class4) field447.method3482((long) var1);
                if (var2 != null) {
                    method110(var2, true);
                }
                if (field300 != null) {
                    Statics.method572(field300);
                    field300 = null;
                }
                field436 = -1;
                return true;
            }
            if (field436 == 164) {
                int var3 = field333.method2334();
                int var4 = field333.method2362();
                class173 var5 = class173.method2765(var3);
                if (var5.field2870 != 1 || var5.field2796 != var4) {
                    var5.field2870 = 1;
                    var5.field2796 = var4;
                    Statics.method572(var5);
                }
                field436 = -1;
                return true;
            }
            if (field436 == 179) {
                if (field392 != -1) {
                    int var6 = field392;
                    if (class173.method2229(var6)) {
                        method221(Statics.field2807[var6], 0);
                    }
                }
                field436 = -1;
                return true;
            }
            if (field436 == 122) {
                String var7 = field333.method2344();
                String var8 = class223.method3722(class163.method2886(class222.method155(field333)));
                class12.method100(6, var7, var8);
                field436 = -1;
                return true;
            }
            if (field436 == 207) {
                int var9 = field333.method2290();
                int var10 = field333.method2290();
                int var11 = field333.method2290();
                int var12 = field333.method2290();
                field335[var9] = true;
                field471[var9] = var10;
                field538[var9] = var11;
                field539[var9] = var12;
                field540[var9] = 0;
                field436 = -1;
                return true;
            }
            if (field436 == 112) {
                String var13 = field333.method2344();
                Object[] var14 = new Object[var13.length() + 1];
                for (int var15 = var13.length() - 1; var15 >= 0; var15--) {
                    if (var13.charAt(var15) == 's') {
                        var14[var15 + 1] = field333.method2344();
                    } else {
                        var14[var15 + 1] = Integer.valueOf(field333.method2295());
                    }
                }
                var14[0] = Integer.valueOf(field333.method2295());
                class1 var16 = new class1();
                var16.field4 = var14;
                class37.method3091(var16, 200000);
                field436 = -1;
                return true;
            }
            if (field436 == 173) {
                int var17 = field333.method2295();
                int var18 = field333.method2362();
                int var19 = field333.method2362();
                int var20 = field333.method2325();
                class173 var21 = class173.method2765(var17);
                if (var21.field2803 != var19 || var21.field2804 != var20 || var21.field2806 != var18) {
                    var21.field2803 = var19;
                    var21.field2804 = var20;
                    var21.field2806 = var18;
                    Statics.method572(var21);
                }
                field436 = -1;
                return true;
            }
            if (field436 == 184) {
                class211.method3080(field333, field334);
                field436 = -1;
                return true;
            }
            if (field436 == 60) {
                int var22 = field333.method2336();
                int var23 = field333.method2325();
                if (var23 == 65535) {
                    var23 = -1;
                }
                int var24 = field333.method2295();
                class173 var25 = class173.method2765(var24);
                if (var25.field2753) {
                    var25.field2872 = var23;
                    var25.field2873 = var22;
                    class52 var27 = class52.method1979(var23);
                    var25.field2803 = var27.field1125;
                    var25.field2804 = var27.field1113;
                    var25.field2805 = var27.field1114;
                    var25.field2801 = var27.field1106;
                    var25.field2802 = var27.field1116;
                    var25.field2806 = var27.field1146;
                    if (var27.field1117 == 1) {
                        var25.field2810 = 1;
                    } else {
                        var25.field2810 = 2;
                    }
                    if (var25.field2747 > 0) {
                        var25.field2806 = var25.field2806 * 32 / var25.field2747;
                    } else if (var25.field2824 > 0) {
                        var25.field2806 = var25.field2806 * 32 / var25.field2824;
                    }
                    Statics.method572(var25);
                } else if (var23 == -1) {
                    var25.field2870 = 0;
                    field436 = -1;
                    return true;
                } else {
                    class52 var26 = class52.method1979(var23);
                    var25.field2870 = 4;
                    var25.field2796 = var23;
                    var25.field2803 = var26.field1125;
                    var25.field2804 = var26.field1113;
                    var25.field2806 = var26.field1146 * 100 / var22;
                    Statics.method572(var25);
                }
                field436 = -1;
                return true;
            }
            if (field436 == 154) {
                String var28 = field333.method2344();
                long var29 = (long) field333.method2292();
                long var31 = (long) field333.method2477();
                class152[] var33 = new class152[] { class152.field2252, class152.field2257, class152.field2256, class152.field2255, class152.field2250 };
                class152 var34 = (class152) class109.method787(var33, field333.method2290());
                long var35 = (var29 << 32) + var31;
                boolean var37 = false;
                for (int var38 = 0; var38 < 100; var38++) {
                    if (field532[var38] == var35) {
                        var37 = true;
                        break;
                    }
                }
                if (method1977(var28)) {
                    var37 = true;
                }
                if (!var37 && field407 == 0) {
                    field532[field509] = var35;
                    field509 = (field509 + 1) % 100;
                    String var39 = class223.method3722(class163.method2886(class222.method155(field333)));
                    byte var40;
                    if (var34.field2249) {
                        var40 = 7;
                    } else {
                        var40 = 3;
                    }
                    if (var34.field2251 == -1) {
                        class12.method100(var40, var28, var39);
                    } else {
                        int var42 = var34.field2251;
                        String var43 = "<img=" + var42 + ">";
                        class12.method100(var40, var43 + var28, var39);
                    }
                }
                field436 = -1;
                return true;
            }
            if (field436 == 183) {
                int var44 = field333.method2295();
                int var45 = field333.method2292();
                if (var44 < -70000) {
                    var45 += 32768;
                }
                class173 var46;
                if (var44 >= 0) {
                    var46 = class173.method2765(var44);
                } else {
                    var46 = null;
                }
                while (field333.field1984 < field334) {
                    int var47 = field333.method2303();
                    int var48 = field333.method2292();
                    int var49 = 0;
                    if (var48 != 0) {
                        var49 = field333.method2290();
                        if (var49 == 255) {
                            var49 = field333.method2295();
                        }
                    }
                    if (var46 != null && var47 >= 0 && var47 < var46.field2819.length) {
                        var46.field2819[var47] = var48;
                        var46.field2871[var47] = var49;
                    }
                    class16.method2242(var45, var47, var48 - 1, var49);
                }
                if (var46 != null) {
                    Statics.method572(var46);
                }
                method1513();
                field474[++field475 - 1 & 0x1F] = var45 & 0x7FFF;
                field436 = -1;
                return true;
            }
            if (field436 == 201) {
                int var50 = field333.method2292();
                if (var50 == 65535) {
                    var50 = -1;
                }
                int var51 = field333.method2292();
                if (var51 == 65535) {
                    var51 = -1;
                }
                int var52 = field333.method2295();
                int var53 = field333.method2295();
                for (int var54 = var50; var54 <= var51; var54++) {
                    long var55 = ((long) var53 << 32) + (long) var54;
                    class208 var57 = field395.method3482(var55);
                    if (var57 != null) {
                        var57.method3605();
                    }
                    field395.method3495(new class201(var52), var55);
                }
                field436 = -1;
                return true;
            }
            if (field436 == 242) {
                String var58 = field333.method2344();
                int var59 = field333.method2316();
                int var60 = field333.method2316();
                if (var60 >= 1 && var60 <= 8) {
                    if (var58.equalsIgnoreCase("null")) {
                        var58 = null;
                    }
                    field428[var60 - 1] = var58;
                    field416[var60 - 1] = var59 == 0;
                }
                field436 = -1;
                return true;
            }
            if (field436 == 7) {
                field535 = false;
                for (int var61 = 0; var61 < 5; var61++) {
                    field335[var61] = false;
                }
                field436 = -1;
                return true;
            }
            if (field436 == 237) {
                int var62 = field333.method2453();
                Statics.field192 = Statics.field2177.method2654(var62);
                field436 = -1;
                return true;
            }
            if (field436 == 92) {
                for (int var63 = 0; var63 < class176.field2901.length; var63++) {
                    if (class176.field2902[var63] != class176.field2901[var63]) {
                        class176.field2901[var63] = class176.field2902[var63];
                        method2218(var63);
                        field472[++field473 - 1 & 0x1F] = var63;
                    }
                }
                field436 = -1;
                return true;
            }
            if (field436 == 149) {
                method1513();
                int var64 = field333.method2317();
                int var65 = field333.method2290();
                int var66 = field333.method2453();
                field425[var64] = var66;
                field423[var64] = var65;
                field401[var64] = 1;
                for (int var67 = 0; var67 < 98; var67++) {
                    if (var66 >= class155.field2285[var67]) {
                        field401[var64] = var67 + 2;
                    }
                }
                field364[++field477 - 1 & 0x1F] = var64;
                field436 = -1;
                return true;
            }
            if (field436 == 236) {
                method1513();
                field451 = field333.method2290();
                field483 = field549;
                field436 = -1;
                return true;
            }
            if (field436 == 113) {
                Statics.field260 = field333.method2317();
                Statics.field1860 = field333.method2290();
                field436 = -1;
                return true;
            }
            if (field436 == 99) {
                for (int var68 = 0; var68 < Statics.field1151; var68++) {
                    class53 var69 = class53.method2783(var68);
                    if (var69 != null) {
                        class176.field2902[var68] = 0;
                        class176.field2901[var68] = 0;
                    }
                }
                method1513();
                field473 += 32;
                field436 = -1;
                return true;
            }
            if (field436 == 198) {
                int var70 = field333.method2295();
                int var71 = field333.method2292();
                if (var70 < -70000) {
                    var71 += 32768;
                }
                class173 var72;
                if (var70 >= 0) {
                    var72 = class173.method2765(var70);
                } else {
                    var72 = null;
                }
                if (var72 != null) {
                    for (int var73 = 0; var73 < var72.field2819.length; var73++) {
                        var72.field2819[var73] = 0;
                        var72.field2871[var73] = 0;
                    }
                }
                class16.method527(var71);
                int var74 = field333.method2292();
                for (int var75 = 0; var75 < var74; var75++) {
                    int var76 = field333.method2377();
                    if (var76 == 255) {
                        var76 = field333.method2336();
                    }
                    int var77 = field333.method2326();
                    if (var72 != null && var75 < var72.field2819.length) {
                        var72.field2819[var75] = var77;
                        var72.field2871[var75] = var76;
                    }
                    class16.method2242(var71, var75, var77 - 1, var76);
                }
                if (var72 != null) {
                    Statics.method572(var72);
                }
                method1513();
                field474[++field475 - 1 & 0x1F] = var71 & 0x7FFF;
                field436 = -1;
                return true;
            }
            if (field436 == 145) {
                class33.method722();
                for (int var78 = 0; var78 < 2048; var78++) {
                    field293[var78] = null;
                }
                class33.method574(field333);
                field436 = -1;
                return true;
            }
            if (field436 == 77) {
                int var79 = field333.method2453();
                int var80 = field333.method2326();
                int var81 = field333.method2362();
                class173 var82 = class173.method2765(var79);
                var82.field2808 = (var80 << 16) + var81;
                field436 = -1;
                return true;
            }
            if (field436 == 102) {
                field535 = true;
                Statics.field2133 = field333.method2290();
                Statics.field1053 = field333.method2290();
                Statics.field2633 = field333.method2292();
                Statics.field703 = field333.method2290();
                Statics.field1682 = field333.method2290();
                if (Statics.field1682 >= 100) {
                    Statics.field571 = Statics.field2133 * 128 + 64;
                    Statics.field731 = Statics.field1053 * 128 + 64;
                    Statics.field20 = Statics.method141(Statics.field571, Statics.field731, Statics.field1516) - Statics.field2633;
                }
                field436 = -1;
                return true;
            }
            if (field436 == 185) {
                int var83 = field333.method2453();
                int var84 = field333.method2325();
                int var85 = field333.method2316();
                class4 var86 = (class4) field447.method3482((long) var83);
                if (var86 != null) {
                    method110(var86, var86.field65 != var84);
                }
                class4 var87 = new class4();
                var87.field65 = var84;
                var87.field66 = var85;
                field447.method3495(var87, (long) var83);
                method197(var84);
                class173 var88 = class173.method2765(var83);
                Statics.method572(var88);
                if (field300 != null) {
                    Statics.method572(field300);
                    field300 = null;
                }
                method1895();
                method1444(Statics.field2807[var83 >> 16], var88, false);
                class37.method3442(var84);
                if (field392 != -1) {
                    int var89 = field392;
                    if (class173.method2229(var89)) {
                        method221(Statics.field2807[var89], 1);
                    }
                }
                field436 = -1;
                return true;
            }
            if (field436 == 229) {
                int var90 = field333.method2326();
                if (var90 == 65535) {
                    var90 = -1;
                }
                if (var90 == -1 && !field320) {
                    Statics.field3197.method3320();
                    class183.field2946 = 1;
                    Statics.field714 = null;
                } else if (var90 != -1 && field525 != var90 && field357 != 0 && !field320) {
                    class183.method2169(2, Statics.field2658, var90, 0, field357, false);
                }
                field525 = var90;
                field436 = -1;
                return true;
            }
            if (field436 == 50) {
                int var91 = field333.method2481();
                int var92 = field333.method2325();
                if (var92 == 65535) {
                    var92 = -1;
                }
                method557(var92, var91);
                field436 = -1;
                return true;
            }
            if (field436 == 37) {
                for (int var93 = 0; var93 < field293.length; var93++) {
                    if (field293[var93] != null) {
                        field293[var93].field847 = -1;
                    }
                }
                for (int var94 = 0; var94 < field378.length; var94++) {
                    if (field378[var94] != null) {
                        field378[var94].field847 = -1;
                    }
                }
                field436 = -1;
                return true;
            }
            if (field436 == 90) {
                field307 = field333.method2290();
                if (field307 == 1) {
                    field308 = field333.method2292();
                }
                if (field307 >= 2 && field307 <= 6) {
                    if (field307 == 2) {
                        field313 = 64;
                        field314 = 64;
                    }
                    if (field307 == 3) {
                        field313 = 0;
                        field314 = 64;
                    }
                    if (field307 == 4) {
                        field313 = 128;
                        field314 = 64;
                    }
                    if (field307 == 5) {
                        field313 = 64;
                        field314 = 0;
                    }
                    if (field307 == 6) {
                        field313 = 64;
                        field314 = 128;
                    }
                    field307 = 2;
                    field310 = field333.method2292();
                    field311 = field333.method2292();
                    field312 = field333.method2290();
                }
                if (field307 == 10) {
                    field379 = field333.method2292();
                }
                field436 = -1;
                return true;
            }
            if (field436 == 223) {
                field333.field1984 += 28;
                if (field333.method2312()) {
                    class149.method3150(field333, field333.field1984 - 28);
                }
                field436 = -1;
                return true;
            }
            if (field436 == 150) {
                boolean var95 = field333.method2290() == 1;
                int var96 = field333.method2453();
                class173 var97 = class173.method2765(var96);
                if (var97.field2774 != var95) {
                    var97.field2774 = var95;
                    Statics.method572(var97);
                }
                field436 = -1;
                return true;
            }
            if (field436 == 14) {
                int var98 = field333.method2295();
                int var99 = field333.method2295();
                if (Statics.field2067 == null || !Statics.field2067.isValid()) {
                    try {
                        Iterator var100 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var100.hasNext()) {
                            GarbageCollectorMXBean var101 = (GarbageCollectorMXBean) var100.next();
                            if (var101.isValid()) {
                                Statics.field2067 = var101;
                                field489 = -1L;
                                field564 = -1L;
                            }
                        }
                    } catch (Throwable var286) {
                    }
                }
                long var103 = class115.method568();
                int var105 = -1;
                if (Statics.field2067 != null) {
                    long var106 = Statics.field2067.getCollectionTime();
                    if (field564 != -1L) {
                        long var108 = var106 - field564;
                        long var110 = var103 - field489;
                        if (var110 != 0L) {
                            var105 = (int) (var108 * 100L / var110);
                        }
                    }
                    field564 = var106;
                    field489 = var103;
                }
                field331.method2555(102);
                field331.method2347(field2176);
                field331.method2278(var98);
                field331.method2421(var99);
                field331.method2315(var105);
                field436 = -1;
                return true;
            }
            if (field436 == 45) {
                field469 = field333.method2290();
                if (field469 == 255) {
                    field469 = 0;
                }
                field480 = field333.method2290();
                if (field480 == 255) {
                    field480 = 0;
                }
                field436 = -1;
                return true;
            }
            if (field436 == 249) {
                field523 = field333.method2290();
                field436 = -1;
                return true;
            }
            if (field436 == 123) {
                int var112 = field333.method2292();
                int var113 = field333.method2453();
                int var114 = var112 >> 10 & 0x1F;
                int var115 = var112 >> 5 & 0x1F;
                int var116 = var112 & 0x1F;
                int var117 = (var116 << 3) + (var114 << 19) + (var115 << 11);
                class173 var118 = class173.method2765(var113);
                if (var118.field2779 != var117) {
                    var118.field2779 = var117;
                    Statics.method572(var118);
                }
                field436 = -1;
                return true;
            }
            if (field436 == 74) {
                Statics.field260 = field333.method2316();
                Statics.field1860 = field333.method2377();
                for (int var119 = Statics.field1860; var119 < Statics.field1860 + 8; var119++) {
                    for (int var120 = Statics.field260; var120 < Statics.field260 + 8; var120++) {
                        if (field419[Statics.field1516][var119][var120] != null) {
                            field419[Statics.field1516][var119][var120] = null;
                            method2235(var119, var120);
                        }
                    }
                }
                for (class17 var121 = (class17) field420.method3520(); var121 != null; var121 = (class17) field420.method3522()) {
                    if (var121.field232 >= Statics.field1860 && var121.field232 < Statics.field1860 + 8 && var121.field231 >= Statics.field260 && var121.field231 < Statics.field260 + 8 && Statics.field1516 == var121.field235) {
                        var121.field239 = 0;
                    }
                }
                field436 = -1;
                return true;
            }
            if (field436 == 81) {
                class26 var122 = new class26();
                var122.field654 = field333.method2344();
                var122.field652 = field333.method2292();
                int var123 = field333.method2295();
                var122.field643 = var123;
                method908(45);
                Statics.field1764.method2784();
                Statics.field1764 = null;
                class32.method711(var122);
                field436 = -1;
                return false;
            }
            if (field436 == 69) {
                int var124 = field333.method2292();
                int var125 = field333.method2290();
                int var126 = field333.method2292();
                method2078(var124, var125, var126);
                field436 = -1;
                return true;
            }
            if (field436 == 177) {
                int var127 = field333.method2292();
                int var128 = field333.method2334();
                class173 var129 = class173.method2765(var128);
                if (var129.field2870 != 2 || var129.field2796 != var127) {
                    var129.field2870 = 2;
                    var129.field2796 = var127;
                    Statics.method572(var129);
                }
                field436 = -1;
                return true;
            }
            if (field436 == 41) {
                int var130 = field333.method2334();
                int var131 = field333.method2293();
                class173 var132 = class173.method2765(var130);
                if (var132.field2754 != var131 || var131 == -1) {
                    var132.field2754 = var131;
                    var132.field2874 = 0;
                    var132.field2875 = 0;
                    Statics.method572(var132);
                }
                field436 = -1;
                return true;
            }
            if (field436 == 139) {
                method112(false);
                field436 = -1;
                return true;
            }
            if (field436 == 231 || field436 == 221 || field436 == 225 || field436 == 253 || field436 == 95 || field436 == 127 || field436 == 72 || field436 == 232 || field436 == 11 || field436 == 57) {
                method922();
                field436 = -1;
                return true;
            }
            if (field436 == 158) {
                int var133 = field333.method2334();
                class173 var134 = class173.method2765(var133);
                var134.field2870 = 3;
                var134.field2796 = Statics.field2040.field36.method3198();
                Statics.method572(var134);
                field436 = -1;
                return true;
            }
            if (field436 == 170) {
                int var135 = field333.method2295();
                class173 var136 = class173.method2765(var135);
                for (int var137 = 0; var137 < var136.field2819.length; var137++) {
                    var136.field2819[var137] = -1;
                    var136.field2819[var137] = 0;
                }
                Statics.method572(var136);
                field436 = -1;
                return true;
            }
            if (field436 == 152) {
                field508 = field333.method2325() * 30;
                field483 = field549;
                field436 = -1;
                return true;
            }
            if (field436 == 16) {
                int var138 = field333.method2290();
                if (field333.method2290() == 0) {
                    field563[var138] = new class220();
                    field333.field1984 += 18;
                } else {
                    field333.field1984--;
                    field563[var138] = new class220(field333, false);
                }
                field432 = field549;
                field436 = -1;
                return true;
            }
            if (field436 == 56) {
                field535 = true;
                Statics.field2054 = field333.method2290();
                Statics.field1436 = field333.method2290();
                Statics.field637 = field333.method2292();
                Statics.field269 = field333.method2290();
                Statics.field2058 = field333.method2290();
                if (Statics.field2058 >= 100) {
                    int var139 = Statics.field2054 * 128 + 64;
                    int var140 = Statics.field1436 * 128 + 64;
                    int var141 = Statics.method141(var139, var140, Statics.field1516) - Statics.field637;
                    int var142 = var139 - Statics.field571;
                    int var143 = var141 - Statics.field20;
                    int var144 = var140 - Statics.field731;
                    int var145 = (int) Math.sqrt((double) (var142 * var142 + var144 * var144));
                    Statics.field2214 = (int) (Math.atan2((double) var143, (double) var145) * 325.949D) & 0x7FF;
                    Statics.field1540 = (int) (Math.atan2((double) var142, (double) var144) * -325.949D) & 0x7FF;
                    if (Statics.field2214 < 128) {
                        Statics.field2214 = 128;
                    }
                    if (Statics.field2214 > 383) {
                        Statics.field2214 = 383;
                    }
                }
                field436 = -1;
                return true;
            }
            if (field436 == 33) {
                int var146 = field333.method2325();
                class16.method2787(var146);
                field474[++field475 - 1 & 0x1F] = var146 & 0x7FFF;
                field436 = -1;
                return true;
            }
            if (field436 == 182) {
                int var147 = field333.method2326();
                int var148 = field333.method2295();
                class173 var149 = class173.method2765(var148);
                if (var149 != null && var149.field2756 == 0) {
                    if (var147 > var149.field2778 - var149.field2770) {
                        var147 = var149.field2778 - var149.field2770;
                    }
                    if (var147 < 0) {
                        var147 = 0;
                    }
                    if (var149.field2751 != var147) {
                        var149.field2751 = var147;
                        Statics.method572(var149);
                    }
                }
                field436 = -1;
                return true;
            }
            if (field436 == 53) {
                method2086();
                field436 = -1;
                return false;
            }
            if (field436 == 210) {
                int var150 = field333.method2326();
                int var151 = field333.method2334();
                class176.field2902[var150] = var151;
                if (class176.field2901[var150] != var151) {
                    class176.field2901[var150] = var151;
                    method2218(var150);
                }
                field472[++field473 - 1 & 0x1F] = var150;
                field436 = -1;
                return true;
            }
            if (field436 == 241) {
                method2085(true);
                field333.method2561();
                int var152 = field333.method2292();
                class33.method638(field333, var152);
                field436 = -1;
                return true;
            }
            if (field436 == 30) {
                String var153 = field333.method2344();
                int var154 = field333.method2292();
                byte var155 = field333.method2435();
                boolean var156 = false;
                if (var155 == -128) {
                    var156 = true;
                }
                if (var156) {
                    if (Statics.field30 == 0) {
                        field436 = -1;
                        return true;
                    }
                    boolean var157 = false;
                    int var158;
                    for (var158 = 0; var158 < Statics.field30 && (!Statics.field155[var158].field633.equals(var153) || Statics.field155[var158].field634 != var154); var158++) {
                    }
                    if (var158 < Statics.field30) {
                        while (var158 < Statics.field30 - 1) {
                            Statics.field155[var158] = Statics.field155[var158 + 1];
                            var158++;
                        }
                        Statics.field30--;
                        Statics.field155[Statics.field30] = null;
                    }
                } else {
                    field333.method2344();
                    class25 var159 = new class25();
                    var159.field633 = var153;
                    var159.field632 = class164.method573(var159.field633, Statics.field291);
                    var159.field634 = var154;
                    var159.field639 = var155;
                    int var160;
                    for (var160 = Statics.field30 - 1; var160 >= 0; var160--) {
                        int var161 = Statics.field155[var160].field632.compareTo(var159.field632);
                        if (var161 == 0) {
                            Statics.field155[var160].field634 = var154;
                            Statics.field155[var160].field639 = var155;
                            if (var153.equals(Statics.field2040.field44)) {
                                Statics.field686 = var155;
                            }
                            field343 = field549;
                            field436 = -1;
                            return true;
                        }
                        if (var161 < 0) {
                            break;
                        }
                    }
                    if (Statics.field30 >= Statics.field155.length) {
                        field436 = -1;
                        return true;
                    }
                    for (int var162 = Statics.field30 - 1; var162 > var160; var162--) {
                        Statics.field155[var162 + 1] = Statics.field155[var162];
                    }
                    if (Statics.field30 == 0) {
                        Statics.field155 = new class25[100];
                    }
                    Statics.field155[var160 + 1] = var159;
                    Statics.field30++;
                    if (var153.equals(Statics.field2040.field44)) {
                        Statics.field686 = var155;
                    }
                }
                field343 = field549;
                field436 = -1;
                return true;
            }
            if (field436 == 186) {
                method1513();
                field452 = field333.method2293();
                field483 = field549;
                field436 = -1;
                return true;
            }
            if (field436 == 193) {
                Statics.field1860 = field333.method2377();
                Statics.field260 = field333.method2377();
                while (field333.field1984 < field334) {
                    field436 = field333.method2290();
                    method922();
                }
                field436 = -1;
                return true;
            }
            if (field436 == 47) {
                while (field333.field1984 < field334) {
                    int var163 = field333.method2290();
                    boolean var164 = (var163 & 0x1) == 1;
                    String var165 = field333.method2344();
                    String var166 = field333.method2344();
                    field333.method2344();
                    for (int var167 = 0; var167 < field558; var167++) {
                        class8 var168 = field559[var167];
                        if (var164) {
                            if (var166.equals(var168.field139)) {
                                var168.field139 = var165;
                                var168.field143 = var166;
                                var165 = null;
                                break;
                            }
                        } else if (var165.equals(var168.field139)) {
                            var168.field139 = var165;
                            var168.field143 = var166;
                            var165 = null;
                            break;
                        }
                    }
                    if (var165 != null && field558 < 400) {
                        class8 var169 = new class8();
                        field559[field558] = var169;
                        var169.field139 = var165;
                        var169.field143 = var166;
                        field558++;
                    }
                }
                field479 = field549;
                field436 = -1;
                return true;
            }
            if (field436 == 76) {
                int var170 = field334 + field333.field1984;
                int var171 = field333.method2292();
                int var172 = field333.method2292();
                if (field392 != var171) {
                    field392 = var171;
                    method2875(false);
                    method197(field392);
                    class37.method3442(field392);
                    for (int var173 = 0; var173 < 100; var173++) {
                        field492[var173] = true;
                    }
                }
                while (var172-- > 0) {
                    int var174 = field333.method2295();
                    int var175 = field333.method2292();
                    int var176 = field333.method2290();
                    class4 var177 = (class4) field447.method3482((long) var174);
                    if (var177 != null && var177.field65 != var175) {
                        method110(var177, true);
                        var177 = null;
                    }
                    if (var177 == null) {
                        class4 var178 = new class4();
                        var178.field65 = var175;
                        var178.field66 = var176;
                        field447.method3495(var178, (long) var174);
                        method197(var175);
                        class173 var179 = class173.method2765(var174);
                        Statics.method572(var179);
                        if (field300 != null) {
                            Statics.method572(field300);
                            field300 = null;
                        }
                        method1895();
                        method1444(Statics.field2807[var174 >> 16], var179, false);
                        class37.method3442(var175);
                        if (field392 != -1) {
                            int var180 = field392;
                            if (class173.method2229(var180)) {
                                method221(Statics.field2807[var180], 1);
                            }
                        }
                        var177 = var178;
                    }
                    var177.field67 = true;
                }
                for (class4 var182 = (class4) field447.method3486(); var182 != null; var182 = (class4) field447.method3484()) {
                    if (var182.field67) {
                        var182.field67 = false;
                    } else {
                        method110(var182, true);
                    }
                }
                field395 = new class196(512);
                while (field333.field1984 < var170) {
                    int var183 = field333.method2295();
                    int var184 = field333.method2292();
                    int var185 = field333.method2292();
                    int var186 = field333.method2295();
                    for (int var187 = var184; var187 <= var185; var187++) {
                        long var188 = ((long) var183 << 32) + (long) var187;
                        field395.method3495(new class201(var186), var188);
                    }
                }
                field436 = -1;
                return true;
            }
            if (field436 == 233) {
                while (field333.field1984 < field334) {
                    boolean var190 = field333.method2290() == 1;
                    String var191 = field333.method2344();
                    String var192 = field333.method2344();
                    int var193 = field333.method2292();
                    int var194 = field333.method2290();
                    int var195 = field333.method2290();
                    boolean var196 = (var195 & 0x2) != 0;
                    boolean var197 = (var195 & 0x1) != 0;
                    if (var193 > 0) {
                        field333.method2344();
                        field333.method2290();
                        field333.method2295();
                    }
                    field333.method2344();
                    for (int var198 = 0; var198 < field554; var198++) {
                        class18 var199 = field556[var198];
                        if (var190) {
                            if (var192.equals(var199.field255)) {
                                var199.field255 = var191;
                                var199.field250 = var192;
                                var191 = null;
                                break;
                            }
                        } else if (var191.equals(var199.field255)) {
                            if (var199.field248 != var193) {
                                boolean var200 = true;
                                for (class39 var201 = (class39) field301.method3474(); var201 != null; var201 = (class39) field301.method3475()) {
                                    if (var201.field870.equals(var191)) {
                                        if (var193 != 0 && var201.field869 == 0) {
                                            var201.method3602();
                                            var200 = false;
                                        } else if (var193 == 0 && var201.field869 != 0) {
                                            var201.method3602();
                                            var200 = false;
                                        }
                                    }
                                }
                                if (var200) {
                                    field301.method3473(new class39(var191, var193));
                                }
                                var199.field248 = var193;
                            }
                            var199.field250 = var192;
                            var199.field246 = var194;
                            var199.field257 = var196;
                            var199.field251 = var197;
                            var191 = null;
                            break;
                        }
                    }
                    if (var191 != null && field554 < 400) {
                        class18 var202 = new class18();
                        field556[field554] = var202;
                        var202.field255 = var191;
                        var202.field250 = var192;
                        var202.field248 = var193;
                        var202.field246 = var194;
                        var202.field257 = var196;
                        var202.field251 = var197;
                        field554++;
                    }
                }
                field555 = 2;
                field479 = field549;
                boolean var203 = false;
                int var204 = field554;
                while (var204 > 0) {
                    boolean var205 = true;
                    var204--;
                    for (int var206 = 0; var206 < var204; var206++) {
                        boolean var207 = false;
                        class18 var208 = field556[var206];
                        class18 var209 = field556[var206 + 1];
                        if (field288 != var208.field248 && field288 == var209.field248) {
                            var207 = true;
                        }
                        if (!var207 && var208.field248 == 0 && var209.field248 != 0) {
                            var207 = true;
                        }
                        if (!var207 && !var208.field257 && var209.field257) {
                            var207 = true;
                        }
                        if (!var207 && !var208.field251 && var209.field251) {
                            var207 = true;
                        }
                        if (var207) {
                            class18 var210 = field556[var206];
                            field556[var206] = field556[var206 + 1];
                            field556[var206 + 1] = var210;
                            var205 = false;
                        }
                    }
                    if (var205) {
                        break;
                    }
                }
                field436 = -1;
                return true;
            }
            if (field436 == 118) {
                int var211 = field333.method2295();
                String var212 = field333.method2344();
                class173 var213 = class173.method2765(var211);
                if (!var212.equals(var213.field2830)) {
                    var213.field2830 = var212;
                    Statics.method572(var213);
                }
                field436 = -1;
                return true;
            }
            if (field436 == 3) {
                byte var214 = field333.method2321();
                int var215 = field333.method2292();
                class176.field2902[var215] = var214;
                if (class176.field2901[var215] != var214) {
                    class176.field2901[var215] = var214;
                    method2218(var215);
                }
                field472[++field473 - 1 & 0x1F] = var215;
                field436 = -1;
                return true;
            }
            if (field436 == 247) {
                String var216 = field333.method2344();
                Statics.field460 = var216;
                try {
                    String var217 = Statics.field286.getParameter(class190.field3039.field3052);
                    String var218 = Statics.field286.getParameter(class190.field3050.field3052);
                    String var219 = var217 + "settings=" + var216 + "; version=1; path=/; domain=" + var218;
                    String var220;
                    if (var216.length() == 0) {
                        var220 = var219 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        String var221 = var219 + "; Expires=";
                        long var222 = class115.method568() + 94608000000L;
                        class111.field1941.setTime(new Date(var222));
                        int var224 = class111.field1941.get(7);
                        int var225 = class111.field1941.get(5);
                        int var226 = class111.field1941.get(2);
                        int var227 = class111.field1941.get(1);
                        int var228 = class111.field1941.get(11);
                        int var229 = class111.field1941.get(12);
                        int var230 = class111.field1941.get(13);
                        String var231 = class111.field1939[var224 - 1] + ", " + var225 / 10 + var225 % 10 + "-" + class111.field1940[0][var226] + "-" + var227 + " " + var228 / 10 + var228 % 10 + ":" + var229 / 10 + var229 % 10 + ":" + var230 / 10 + var230 % 10 + " GMT";
                        var220 = var221 + var231 + "; Max-Age=" + 94608000L;
                    }
                    client var232 = Statics.field286;
                    String var233 = "document.cookie=\"" + var220 + "\"";
                    JSObject.getWindow(var232).eval(var233);
                } catch (Throwable var285) {
                }
                field436 = -1;
                return true;
            }
            if (field436 == 87) {
                method112(true);
                field436 = -1;
                return true;
            }
            if (field436 == 200) {
                field343 = field549;
                if (field334 == 0) {
                    field514 = null;
                    field402 = null;
                    Statics.field30 = 0;
                    Statics.field155 = null;
                    field436 = -1;
                    return true;
                }
                field402 = field333.method2344();
                long var235 = field333.method2422();
                field514 = class162.method1446(var235);
                Statics.field778 = field333.method2435();
                int var237 = field333.method2290();
                if (var237 == 255) {
                    field436 = -1;
                    return true;
                }
                Statics.field30 = var237;
                class25[] var238 = new class25[100];
                for (int var239 = 0; var239 < Statics.field30; var239++) {
                    var238[var239] = new class25();
                    var238[var239].field633 = field333.method2344();
                    var238[var239].field632 = class164.method573(var238[var239].field633, Statics.field291);
                    var238[var239].field634 = field333.method2292();
                    var238[var239].field639 = field333.method2435();
                    field333.method2344();
                    if (var238[var239].field633.equals(Statics.field2040.field44)) {
                        Statics.field686 = var238[var239].field639;
                    }
                }
                boolean var240 = false;
                int var241 = Statics.field30;
                while (var241 > 0) {
                    boolean var242 = true;
                    var241--;
                    for (int var243 = 0; var243 < var241; var243++) {
                        if (var238[var243].field632.compareTo(var238[var243 + 1].field632) > 0) {
                            class25 var244 = var238[var243];
                            var238[var243] = var238[var243 + 1];
                            var238[var243 + 1] = var244;
                            var242 = false;
                        }
                    }
                    if (var242) {
                        break;
                    }
                }
                Statics.field155 = var238;
                field436 = -1;
                return true;
            }
            if (field436 == 147) {
                boolean var245 = field333.method2290() == 1;
                if (var245) {
                    Statics.field2661 = class115.method568() - field333.method2422();
                    Statics.field1864 = new class221(field333, true);
                } else {
                    Statics.field1864 = null;
                }
                field482 = field549;
                field436 = -1;
                return true;
            }
            if (field436 == 138) {
                field356 = field333.method2290();
                field285 = field333.method2290();
                field436 = -1;
                return true;
            }
            if (field436 == 12) {
                int var246 = field333.method2303();
                boolean var247 = field333.method2290() == 1;
                String var248 = "";
                boolean var249 = false;
                if (var247) {
                    var248 = field333.method2344();
                    if (method1977(var248)) {
                        var249 = true;
                    }
                }
                String var250 = field333.method2344();
                if (!var249) {
                    class12.method100(var246, var248, var250);
                }
                field436 = -1;
                return true;
            }
            if (field436 == 64) {
                class33.method638(field333, field334);
                field436 = -1;
                return true;
            }
            if (field436 == 224) {
                method2085(false);
                field333.method2561();
                int var251 = field333.method2292();
                class33.method638(field333, var251);
                field436 = -1;
                return true;
            }
            if (field436 == 83) {
                int var252 = field333.method2293();
                int var253 = field333.method2467();
                int var254 = field333.method2295();
                class173 var255 = class173.method2765(var254);
                if (var255.field2763 != var252 || var255.field2764 != var253 || var255.field2759 != 0 || var255.field2760 != 0) {
                    var255.field2763 = var252;
                    var255.field2764 = var253;
                    var255.field2759 = 0;
                    var255.field2760 = 0;
                    Statics.method572(var255);
                    method2755(var255);
                    if (var255.field2756 == 0) {
                        method1444(Statics.field2807[var254 >> 16], var255, false);
                    }
                }
                field436 = -1;
                return true;
            }
            if (field436 == 24) {
                int var256 = field333.method2326();
                field392 = var256;
                method2875(false);
                method197(var256);
                class37.method3442(field392);
                for (int var257 = 0; var257 < 100; var257++) {
                    field492[var257] = true;
                }
                field436 = -1;
                return true;
            }
            if (field436 == 48) {
                String var258 = field333.method2344();
                long var259 = field333.method2422();
                long var261 = (long) field333.method2292();
                long var263 = (long) field333.method2477();
                class152[] var265 = new class152[] { class152.field2252, class152.field2257, class152.field2256, class152.field2255, class152.field2250 };
                class152 var266 = (class152) class109.method787(var265, field333.method2290());
                long var267 = (var261 << 32) + var263;
                boolean var269 = false;
                for (int var270 = 0; var270 < 100; var270++) {
                    if (field532[var270] == var267) {
                        var269 = true;
                        break;
                    }
                }
                if (var266.field2259 && method1977(var258)) {
                    var269 = true;
                }
                if (!var269 && field407 == 0) {
                    field532[field509] = var267;
                    field509 = (field509 + 1) % 100;
                    String var271 = class223.method3722(class163.method2886(class222.method155(field333)));
                    if (var266.field2251 == -1) {
                        class12.method3440(9, var258, var271, class162.method2692(var259));
                    } else {
                        int var272 = var266.field2251;
                        String var273 = "<img=" + var272 + ">";
                        class12.method3440(9, var273 + var258, var271, class162.method2692(var259));
                    }
                }
                field436 = -1;
                return true;
            }
            if (field436 == 243) {
                int var274 = field333.method2336();
                int var275 = field333.method2295();
                class4 var276 = (class4) field447.method3482((long) var274);
                class4 var277 = (class4) field447.method3482((long) var275);
                if (var277 != null) {
                    method110(var277, var276 == null || var276.field65 != var277.field65);
                }
                if (var276 != null) {
                    var276.method3605();
                    field447.method3495(var276, (long) var275);
                }
                class173 var278 = class173.method2765(var274);
                if (var278 != null) {
                    Statics.method572(var278);
                }
                class173 var279 = class173.method2765(var275);
                if (var279 != null) {
                    Statics.method572(var279);
                    method1444(Statics.field2807[var279.field2769 >>> 16], var279, true);
                }
                if (field392 != -1) {
                    int var280 = field392;
                    if (class173.method2229(var280)) {
                        method221(Statics.field2807[var280], 1);
                    }
                }
                field436 = -1;
                return true;
            }
            class148.method2604("" + field436 + class2.field22 + field339 + class2.field22 + field340 + class2.field22 + field334, (Throwable) null);
            method2086();
        } catch (IOException var287) {
            if (field526 > 0) {
                method2086();
            } else {
                method908(40);
                Statics.field1366 = Statics.field1764;
                Statics.field1764 = null;
            }
        } catch (Exception var288) {
            String var283 = "" + field436 + class2.field22 + field339 + class2.field22 + field340 + class2.field22 + field334 + class2.field22 + (Statics.field585 + Statics.field2040.field853[0]) + class2.field22 + (Statics.field57 + Statics.field2040.field862[0]) + class2.field22;
            for (int var284 = 0; var284 < field334 && var284 < 50; var284++) {
                var283 = var283 + field333.field1989[var284] + class2.field22;
            }
            class148.method2604(var283, var288);
            method2086();
        }
        return true;
    }

    @ObfuscatedName("az.bb(I)V")
    public static final void method922() {
        if (field436 == 225) {
            int var0 = field333.method2292();
            int var1 = field333.method2362();
            int var2 = field333.method2325();
            int var3 = field333.method2290();
            int var4 = (var3 >> 4 & 0x7) + Statics.field1860;
            int var5 = (var3 & 0x7) + Statics.field260;
            byte var6 = field333.method2321();
            int var7 = field333.method2317();
            int var8 = var7 >> 2;
            int var9 = var7 & 0x3;
            int var10 = field438[var8];
            byte var11 = field333.method2298();
            byte var12 = field333.method2321();
            int var13 = field333.method2362();
            byte var14 = field333.method2319();
            class3 var15;
            if (field410 == var0) {
                var15 = Statics.field2040;
            } else {
                var15 = field293[var0];
            }
            if (var15 != null) {
                class41 var16 = class41.method2717(var2);
                int var17;
                int var18;
                if (var9 == 1 || var9 == 3) {
                    var17 = var16.field920;
                    var18 = var16.field929;
                } else {
                    var17 = var16.field929;
                    var18 = var16.field920;
                }
                int var19 = (var17 >> 1) + var4;
                int var20 = (var17 + 1 >> 1) + var4;
                int var21 = (var18 >> 1) + var5;
                int var22 = (var18 + 1 >> 1) + var5;
                int[][] var23 = class6.field83[Statics.field1516];
                int var24 = var23[var19][var21] + var23[var20][var21] + var23[var19][var22] + var23[var20][var22] >> 2;
                int var25 = (var4 << 7) + (var17 << 6);
                int var26 = (var5 << 7) + (var18 << 6);
                class105 var27 = var16.method767(var8, var9, var23, var25, var24, var26);
                if (var27 != null) {
                    method753(Statics.field1516, var4, var5, var10, -1, 0, 0, var13 + 1, var1 + 1);
                    var15.field48 = field299 + var13;
                    var15.field63 = field299 + var1;
                    var15.field49 = var27;
                    var15.field51 = var4 * 128 + var17 * 64;
                    var15.field45 = var5 * 128 + var18 * 64;
                    var15.field47 = var24;
                    if (var11 > var6) {
                        byte var28 = var11;
                        var11 = var6;
                        var6 = var28;
                    }
                    if (var14 > var12) {
                        byte var29 = var14;
                        var14 = var12;
                        var12 = var29;
                    }
                    var15.field50 = var4 + var11;
                    var15.field52 = var4 + var6;
                    var15.field62 = var5 + var14;
                    var15.field46 = var5 + var12;
                }
            }
        }
        if (field436 == 57) {
            int var30 = field333.method2292();
            int var31 = field333.method2317();
            int var32 = (var31 >> 4 & 0x7) + Statics.field1860;
            int var33 = (var31 & 0x7) + Statics.field260;
            int var34 = field333.method2317();
            int var35 = var34 >> 2;
            int var36 = var34 & 0x3;
            int var37 = field438[var35];
            if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
                method753(Statics.field1516, var32, var33, var37, var30, var35, var36, 0, -1);
            }
            return;
        }
        if (field436 == 231) {
            int var38 = field333.method2290();
            int var39 = (var38 >> 4 & 0x7) + Statics.field1860;
            int var40 = (var38 & 0x7) + Statics.field260;
            int var41 = field333.method2292();
            int var42 = field333.method2290();
            int var43 = var42 >> 4 & 0xF;
            int var44 = var42 & 0x7;
            int var45 = field333.method2290();
            if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                int var46 = var43 + 1;
                if (Statics.field2040.field853[0] >= var39 - var46 && Statics.field2040.field853[0] <= var39 + var46 && Statics.field2040.field862[0] >= var40 - var46 && Statics.field2040.field862[0] <= var40 + var46 && field528 != 0 && var44 > 0 && field345 < 50) {
                    field530[field345] = var41;
                    field531[field345] = var44;
                    field306[field345] = var45;
                    field302[field345] = null;
                    field498[field345] = (var39 << 16) + (var40 << 8) + var43;
                    field345++;
                }
            }
        }
        if (field436 == 72) {
            int var47 = field333.method2316();
            int var48 = (var47 >> 4 & 0x7) + Statics.field1860;
            int var49 = (var47 & 0x7) + Statics.field260;
            int var50 = field333.method2326();
            int var51 = field333.method2292();
            if (var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104) {
                class29 var52 = new class29();
                var52.field688 = var51;
                var52.field683 = var50;
                if (field419[Statics.field1516][var48][var49] == null) {
                    field419[Statics.field1516][var48][var49] = new class199();
                }
                field419[Statics.field1516][var48][var49].method3515(var52);
                method2235(var48, var49);
            }
        } else if (field436 == 11) {
            int var53 = field333.method2377();
            int var54 = var53 >> 2;
            int var55 = var53 & 0x3;
            int var56 = field438[var54];
            int var57 = field333.method2316();
            int var58 = (var57 >> 4 & 0x7) + Statics.field1860;
            int var59 = (var57 & 0x7) + Statics.field260;
            if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                method753(Statics.field1516, var58, var59, var56, -1, var54, var55, 0, -1);
            }
        } else if (field436 == 221) {
            int var60 = field333.method2290();
            int var61 = (var60 >> 4 & 0x7) + Statics.field1860;
            int var62 = (var60 & 0x7) + Statics.field260;
            int var63 = field333.method2292();
            int var64 = field333.method2292();
            int var65 = field333.method2292();
            if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104) {
                class199 var66 = field419[Statics.field1516][var61][var62];
                if (var66 != null) {
                    for (class29 var67 = (class29) var66.method3520(); var67 != null; var67 = (class29) var66.method3522()) {
                        if ((var63 & 0x7FFF) == var67.field688 && var67.field683 == var64) {
                            var67.field683 = var65;
                            break;
                        }
                    }
                    method2235(var61, var62);
                }
            }
        } else if (field436 == 95) {
            int var68 = field333.method2290();
            int var69 = (var68 >> 4 & 0x7) + Statics.field1860;
            int var70 = (var68 & 0x7) + Statics.field260;
            int var71 = var69 + field333.method2435();
            int var72 = var70 + field333.method2435();
            int var73 = field333.method2293();
            int var74 = field333.method2292();
            int var75 = field333.method2290() * 4;
            int var76 = field333.method2290() * 4;
            int var77 = field333.method2292();
            int var78 = field333.method2292();
            int var79 = field333.method2290();
            int var80 = field333.method2290();
            if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104 && var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104 && var74 != 65535) {
                int var81 = var69 * 128 + 64;
                int var82 = var70 * 128 + 64;
                int var83 = var71 * 128 + 64;
                int var84 = var72 * 128 + 64;
                class7 var85 = new class7(var74, Statics.field1516, var81, var82, Statics.method141(var81, var82, Statics.field1516) - var75, field299 + var77, field299 + var78, var79, var80, var73, var76);
                var85.method78(var83, var84, Statics.method141(var83, var84, Statics.field1516) - var76, field299 + var77);
                field533.method3515(var85);
            }
        } else if (field436 == 232) {
            int var86 = field333.method2377();
            int var87 = (var86 >> 4 & 0x7) + Statics.field1860;
            int var88 = (var86 & 0x7) + Statics.field260;
            int var89 = field333.method2377();
            int var90 = var89 >> 2;
            int var91 = var89 & 0x3;
            int var92 = field438[var90];
            int var93 = field333.method2326();
            if (var87 >= 0 && var88 >= 0 && var87 < 103 && var88 < 103) {
                if (var92 == 0) {
                    class87 var94 = Statics.field107.method1743(Statics.field1516, var87, var88);
                    if (var94 != null) {
                        int var95 = var94.field1512 >> 14 & 0x7FFF;
                        if (var90 == 2) {
                            var94.field1506 = new class13(var95, 2, var91 + 4, Statics.field1516, var87, var88, var93, false, var94.field1506);
                            var94.field1519 = new class13(var95, 2, var91 + 1 & 0x3, Statics.field1516, var87, var88, var93, false, var94.field1519);
                        } else {
                            var94.field1506 = new class13(var95, var90, var91, Statics.field1516, var87, var88, var93, false, var94.field1506);
                        }
                    }
                }
                if (var92 == 1) {
                    class94 var96 = Statics.field107.method1744(Statics.field1516, var87, var88);
                    if (var96 != null) {
                        int var97 = var96.field1599 >> 14 & 0x7FFF;
                        if (var90 == 4 || var90 == 5) {
                            var96.field1598 = new class13(var97, 4, var91, Statics.field1516, var87, var88, var93, false, var96.field1598);
                        } else if (var90 == 6) {
                            var96.field1598 = new class13(var97, 4, var91 + 4, Statics.field1516, var87, var88, var93, false, var96.field1598);
                        } else if (var90 == 7) {
                            var96.field1598 = new class13(var97, 4, (var91 + 2 & 0x3) + 4, Statics.field1516, var87, var88, var93, false, var96.field1598);
                        } else if (var90 == 8) {
                            var96.field1598 = new class13(var97, 4, var91 + 4, Statics.field1516, var87, var88, var93, false, var96.field1598);
                            var96.field1600 = new class13(var97, 4, (var91 + 2 & 0x3) + 4, Statics.field1516, var87, var88, var93, false, var96.field1600);
                        }
                    }
                }
                if (var92 == 2) {
                    class98 var98 = Statics.field107.method1745(Statics.field1516, var87, var88);
                    if (var90 == 11) {
                        var90 = 10;
                    }
                    if (var98 != null) {
                        var98.field1667 = new class13(var98.field1666 >> 14 & 0x7FFF, var90, var91, Statics.field1516, var87, var88, var93, false, var98.field1667);
                    }
                }
                if (var92 == 3) {
                    class93 var99 = Statics.field107.method1839(Statics.field1516, var87, var88);
                    if (var99 != null) {
                        var99.field1591 = new class13(var99.field1585 >> 14 & 0x7FFF, 22, var91, Statics.field1516, var87, var88, var93, false, var99.field1591);
                    }
                }
            }
        } else if (field436 == 253) {
            int var100 = field333.method2290();
            int var101 = (var100 >> 4 & 0x7) + Statics.field1860;
            int var102 = (var100 & 0x7) + Statics.field260;
            int var103 = field333.method2292();
            int var104 = field333.method2290();
            int var105 = field333.method2292();
            if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104) {
                int var106 = var101 * 128 + 64;
                int var107 = var102 * 128 + 64;
                class30 var108 = new class30(var103, Statics.field1516, var106, var107, Statics.method141(var106, var107, Statics.field1516) - var104, var105, field299);
                field422.method3515(var108);
            }
        } else if (field436 == 127) {
            int var109 = field333.method2290();
            int var110 = (var109 >> 4 & 0x7) + Statics.field1860;
            int var111 = (var109 & 0x7) + Statics.field260;
            int var112 = field333.method2362();
            if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                class199 var113 = field419[Statics.field1516][var110][var111];
                if (var113 != null) {
                    for (class29 var114 = (class29) var113.method3520(); var114 != null; var114 = (class29) var113.method3522()) {
                        if ((var112 & 0x7FFF) == var114.field688) {
                            var114.method3605();
                            break;
                        }
                    }
                    if (var113.method3520() == null) {
                        field419[Statics.field1516][var110][var111] = null;
                    }
                    method2235(var110, var111);
                }
            }
        }
    }

    @ObfuscatedName("ax.bj(IIIIIIIIII)V")
    public static final void method753(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field420.method3520(); var10 != null; var10 = (class17) field420.method3522()) {
            if (var10.field235 == arg0 && var10.field232 == arg1 && var10.field231 == arg2 && var10.field230 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field235 = arg0;
            var9.field230 = arg3;
            var9.field232 = arg1;
            var9.field231 = arg2;
            method1530(var9);
            field420.method3515(var9);
        }
        var9.field236 = arg4;
        var9.field245 = arg5;
        var9.field237 = arg6;
        var9.field238 = arg7;
        var9.field239 = arg8;
    }

    @ObfuscatedName("fq.bp(I)V")
    public static final void method2892() {
        for (class17 var0 = (class17) field420.method3520(); var0 != null; var0 = (class17) field420.method3522()) {
            if (var0.field239 == -1) {
                var0.field238 = 0;
                method1530(var0);
            } else {
                var0.method3605();
            }
        }
    }

    @ObfuscatedName("bl.bh(Ld;S)V")
    public static final void method1530(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field230 == 0) {
            var1 = Statics.field107.method1747(arg0.field235, arg0.field232, arg0.field231);
        }
        if (arg0.field230 == 1) {
            var1 = Statics.field107.method1748(arg0.field235, arg0.field232, arg0.field231);
        }
        if (arg0.field230 == 2) {
            var1 = Statics.field107.method1749(arg0.field235, arg0.field232, arg0.field231);
        }
        if (arg0.field230 == 3) {
            var1 = Statics.field107.method1852(arg0.field235, arg0.field232, arg0.field231);
        }
        if (var1 != 0) {
            int var5 = Statics.field107.method1751(arg0.field235, arg0.field232, arg0.field231, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field228 = var2;
        arg0.field234 = var3;
        arg0.field233 = var4;
    }

    @ObfuscatedName("cc.bz(I)V")
    public static final void method1997() {
        for (class17 var0 = (class17) field420.method3520(); var0 != null; var0 = (class17) field420.method3522()) {
            if (var0.field239 > 0) {
                var0.field239--;
            }
            if (var0.field239 == 0) {
                if (var0.field228 >= 0) {
                    int var1 = var0.field228;
                    int var2 = var0.field234;
                    class41 var3 = class41.method2717(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method759(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method3(var0.field235, var0.field230, var0.field232, var0.field231, var0.field228, var0.field233, var0.field234);
                var0.method3605();
            } else {
                if (var0.field238 > 0) {
                    var0.field238--;
                }
                if (var0.field238 == 0 && var0.field232 >= 1 && var0.field231 >= 1 && var0.field232 <= 102 && var0.field231 <= 102) {
                    if (var0.field236 >= 0) {
                        int var5 = var0.field236;
                        int var6 = var0.field245;
                        class41 var7 = class41.method2717(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method759(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method3(var0.field235, var0.field230, var0.field232, var0.field231, var0.field236, var0.field237, var0.field245);
                    var0.field238 = -1;
                    if (var0.field236 == var0.field228 && var0.field228 == -1) {
                        var0.method3605();
                    } else if (var0.field236 == var0.field228 && var0.field237 == var0.field233 && var0.field245 == var0.field234) {
                        var0.method3605();
                    }
                }
            }
        }
    }

    @ObfuscatedName("o.bw(IIIIIIII)V")
    public static final void method3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field570 && Statics.field1516 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field107.method1747(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field107.method1748(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field107.method1749(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field107.method1852(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field107.method1751(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field107.method1738(arg0, arg2, arg3);
                class41 var15 = class41.method2717(var12);
                if (var15.field931 != 0) {
                    field348[arg0].method2175(arg2, arg3, var13, var14, var15.field932);
                }
            }
            if (arg1 == 1) {
                Statics.field107.method1889(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field107.method1782(arg0, arg2, arg3);
                class41 var16 = class41.method2717(var12);
                if (var16.field929 + arg2 > 103 || var16.field929 + arg3 > 103 || var16.field920 + arg2 > 103 || var16.field920 + arg3 > 103) {
                    return;
                }
                if (var16.field931 != 0) {
                    field348[arg0].method2209(arg2, arg3, var16.field929, var16.field920, var14, var16.field932);
                }
            }
            if (arg1 == 3) {
                Statics.field107.method1741(arg0, arg2, arg3);
                class41 var17 = class41.method2717(var12);
                if (var17.field931 == 1) {
                    field348[arg0].method2194(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field84[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method2216(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field107, field348[arg0]);
    }

    @ObfuscatedName("du.bm(III)V")
    public static final void method2235(int arg0, int arg1) {
        class199 var2 = field419[Statics.field1516][arg0][arg1];
        if (var2 == null) {
            Statics.field107.method1742(Statics.field1516, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3520(); var6 != null; var6 = (class29) var2.method3522()) {
            class52 var7 = class52.method1979(var6.field688);
            long var8 = (long) var7.field1118;
            if (var7.field1117 == 1) {
                var8 = (long) (var6.field683 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field107.method1742(Statics.field1516, arg0, arg1);
            return;
        }
        var2.method3516(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3520(); var12 != null; var12 = (class29) var2.method3522()) {
            if (var5.field688 != var12.field688) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field688 != var12.field688 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field107.method1807(Statics.field1516, arg0, arg1, Statics.method141(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1516), var5, var13, var10, var11);
    }

    @ObfuscatedName("g.bn(ZI)V")
    public static final void method112(boolean arg0) {
        field412 = 0;
        field329 = 0;
        Statics.method570();
        while (field333.method2541(field334) >= 27) {
            int var1 = field333.method2558(15);
            if (var1 == 32767) {
                break;
            }
            boolean var21 = false;
            if (field378[var1] == null) {
                field378[var1] = new class35();
                var21 = true;
            }
            class35 var22 = field378[var1];
            field521[++field327 - 1] = var1;
            var22.field855 = field299;
            int var23 = field333.method2558(1);
            int var24 = field333.method2558(1);
            if (var24 == 1) {
                field330[++field329 - 1] = var1;
            }
            int var25;
            if (arg0) {
                var25 = field333.method2558(8);
                if (var25 > 127) {
                    var25 -= 256;
                }
            } else {
                var25 = field333.method2558(5);
                if (var25 > 15) {
                    var25 -= 32;
                }
            }
            int var26;
            if (arg0) {
                var26 = field333.method2558(8);
                if (var26 > 127) {
                    var26 -= 256;
                }
            } else {
                var26 = field333.method2558(5);
                if (var26 > 15) {
                    var26 -= 32;
                }
            }
            var22.field779 = class40.method3100(field333.method2558(14));
            int var27 = field417[field333.method2558(3)];
            if (var21) {
                var22.field857 = var22.field809 = var27;
            }
            var22.field811 = var22.field779.field881;
            var22.field859 = var22.field779.field897;
            if (var22.field859 == 0) {
                var22.field809 = 0;
            }
            var22.field815 = var22.field779.field887;
            var22.field816 = var22.field779.field888;
            var22.field817 = var22.field779.field895;
            var22.field849 = var22.field779.field890;
            var22.field812 = var22.field779.field892;
            var22.field831 = var22.field779.field885;
            var22.field829 = var22.field779.field886;
            var22.method702(Statics.field2040.field853[0] + var25, Statics.field2040.field862[0] + var26, var23 == 1);
        }
        field333.method2546();
        for (int var2 = 0; var2 < field329; var2++) {
            int var3 = field330[var2];
            class35 var4 = field378[var3];
            int var5 = field333.method2290();
            if ((var5 & 0x10) != 0) {
                var4.field779 = class40.method3100(field333.method2326());
                var4.field811 = var4.field779.field881;
                var4.field859 = var4.field779.field897;
                var4.field815 = var4.field779.field887;
                var4.field816 = var4.field779.field888;
                var4.field817 = var4.field779.field895;
                var4.field849 = var4.field779.field890;
                var4.field812 = var4.field779.field892;
                var4.field831 = var4.field779.field885;
                var4.field829 = var4.field779.field886;
            }
            if ((var5 & 0x2) != 0) {
                int var6 = field333.method2362();
                int var7 = field333.method2326();
                int var8 = var4.field854 - (var6 - Statics.field585 - Statics.field585) * 64;
                int var9 = var4.field808 - (var7 - Statics.field57 - Statics.field57) * 64;
                if (var8 != 0 || var9 != 0) {
                    var4.field834 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
            if ((var5 & 0x80) != 0) {
                var4.field843 = field333.method2326();
                int var10 = field333.method2334();
                var4.field813 = var10 >> 16;
                var4.field846 = (var10 & 0xFFFF) + field299;
                var4.field835 = 0;
                var4.field845 = 0;
                if (var4.field846 > field299) {
                    var4.field835 = -1;
                }
                if (var4.field843 == 65535) {
                    var4.field843 = -1;
                }
            }
            if ((var5 & 0x20) != 0) {
                int var11 = field333.method2377();
                int var12 = field333.method2316();
                var4.method728(var11, var12, field299);
                var4.field807 = field299 + 300;
                var4.field830 = field333.method2292();
                var4.field814 = field333.method2325();
            }
            if ((var5 & 0x8) != 0) {
                int var13 = field333.method2326();
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = field333.method2377();
                if (var4.field847 == var13 && var13 != -1) {
                    int var15 = class43.method3081(var13).field991;
                    if (var15 == 1) {
                        var4.field860 = 0;
                        var4.field840 = 0;
                        var4.field841 = var14;
                        var4.field842 = 0;
                    }
                    if (var15 == 2) {
                        var4.field842 = 0;
                    }
                } else if (var13 == -1 || var4.field847 == -1 || class43.method3081(var13).field985 >= class43.method3081(var4.field847).field985) {
                    var4.field847 = var13;
                    var4.field860 = 0;
                    var4.field840 = 0;
                    var4.field841 = var14;
                    var4.field842 = 0;
                    var4.field832 = var4.field865;
                }
            }
            if ((var5 & 0x40) != 0) {
                var4.field844 = field333.method2362();
                if (var4.field844 == 65535) {
                    var4.field844 = -1;
                }
            }
            if ((var5 & 0x4) != 0) {
                int var16 = field333.method2317();
                int var17 = field333.method2316();
                var4.method728(var16, var17, field299);
                var4.field807 = field299 + 300;
                var4.field830 = field333.method2292();
                var4.field814 = field333.method2292();
            }
            if ((var5 & 0x1) != 0) {
                var4.field838 = field333.method2344();
                var4.field823 = 100;
            }
        }
        for (int var18 = 0; var18 < field412; var18++) {
            int var19 = field413[var18];
            if (field299 != field378[var19].field855) {
                field378[var19].field779 = null;
                field378[var19] = null;
            }
        }
        if (field334 != field333.field1984) {
            throw new RuntimeException(field333.field1984 + class2.field22 + field334);
        }
        for (int var20 = 0; var20 < field327; var20++) {
            if (field378[field521[var20]] == null) {
                throw new RuntimeException(var20 + class2.field22 + field327);
            }
        }
    }

    @ObfuscatedName("cz.ba(III)V")
    public static final void method1996(int arg0, int arg1) {
        if (field400 < 2 && field450 == 0 && !field381) {
            return;
        }
        String var2;
        if (field450 == 1 && field400 < 2) {
            var2 = class157.field2482 + class157.field2459 + field440 + " " + class2.field26;
        } else if (field381 && field400 < 2) {
            var2 = field393 + class157.field2459 + field445 + " " + class2.field26;
        } else {
            int var3 = field400 - 1;
            String var4;
            if (field434[var3].length() > 0) {
                var4 = field433[var3] + class157.field2459 + field434[var3];
            } else {
                var4 = field433[var3];
            }
            var2 = var4;
        }
        if (field400 > 2) {
            var2 = var2 + class2.method2244(16777215) + " " + '/' + " " + (field400 - 2) + class157.field2508;
        }
        Statics.field2625.method3730(var2, arg0 + 4, arg1 + 15, 16777215, 0, field299 / 1000);
    }

    @ObfuscatedName("ah.bv(B)V")
    public static final void method634() {
        int var0 = Statics.field1952;
        int var1 = Statics.field180;
        int var2 = Statics.field3146;
        int var3 = Statics.field1544;
        int var4 = 6116423;
        class80.method1665(var0, var1, var2, var3, var4);
        class80.method1665(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class80.method1641(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field2625.method3723(class157.field2452, var0 + 3, var1 + 14, var4, -1);
        int var5 = class140.field2150;
        int var6 = class140.field2139 * -432201367;
        for (int var7 = 0; var7 < field400; var7++) {
            int var8 = (field400 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class224 var10 = Statics.field2625;
            String var11;
            if (field434[var7].length() > 0) {
                var11 = field433[var7] + class157.field2459 + field434[var7];
            } else {
                var11 = field433[var7];
            }
            var10.method3723(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field1952;
        int var13 = Statics.field180;
        int var14 = Statics.field3146;
        int var15 = Statics.field1544;
        for (int var16 = 0; var16 < field409; var16++) {
            if (field536[var16] + field495[var16] > var12 && field495[var16] < var12 + var14 && field496[var16] + field337[var16] > var13 && field496[var16] < var13 + var15) {
                field484[var16] = true;
            }
        }
    }

    @ObfuscatedName("av.bd(IIIII)V")
    public static final void method804(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field409; var4++) {
            if (field536[var4] + field495[var4] > arg0 && field495[var4] < arg0 + arg2 && field496[var4] + field337[var4] > arg1 && field496[var4] < arg1 + arg3) {
                field492[var4] = true;
            }
        }
    }

    @ObfuscatedName("de.by(B)V")
    public static final void method2240() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field400 - 1; var1++) {
                if (field431[var1] < 1000 && field431[var1 + 1] > 1000) {
                    String var2 = field434[var1];
                    field434[var1] = field434[var1 + 1];
                    field434[var1 + 1] = var2;
                    String var3 = field433[var1];
                    field433[var1] = field433[var1 + 1];
                    field433[var1 + 1] = var3;
                    int var4 = field431[var1];
                    field431[var1] = field431[var1 + 1];
                    field431[var1 + 1] = var4;
                    int var5 = field429[var1];
                    field429[var1] = field429[var1 + 1];
                    field429[var1 + 1] = var5;
                    int var6 = field430[var1];
                    field430[var1] = field430[var1 + 1];
                    field430[var1 + 1] = var6;
                    int var7 = field537[var1];
                    field537[var1] = field537[var1 + 1];
                    field537[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
        if (Statics.field1551 != null || field517 != null) {
            return;
        }
        int var26;
        int var27;
        label222: {
            int var8 = class140.field2144;
            if (field427) {
                if (var8 != 1 && (Statics.field1037 || var8 != 4)) {
                    int var9 = class140.field2150;
                    int var10 = class140.field2139 * -432201367;
                    if (var9 < Statics.field1952 - 10 || var9 > Statics.field3146 + Statics.field1952 + 10 || var10 < Statics.field180 - 10 || var10 > Statics.field180 + Statics.field1544 + 10) {
                        field427 = false;
                        method804(Statics.field1952, Statics.field180, Statics.field3146, Statics.field1544);
                    }
                }
                if (var8 == 1 || !Statics.field1037 && var8 == 4) {
                    int var11 = Statics.field1952;
                    int var12 = Statics.field180;
                    int var13 = Statics.field3146;
                    int var14 = class140.field2145;
                    int var15 = class140.field2146;
                    int var16 = -1;
                    for (int var17 = 0; var17 < field400; var17++) {
                        int var18 = (field400 - 1 - var17) * 15 + var12 + 31;
                        if (var14 > var11 && var14 < var11 + var13 && var15 > var18 - 13 && var15 < var18 + 3) {
                            var16 = var17;
                        }
                    }
                    if (var16 != -1 && var16 >= 0) {
                        int var19 = field429[var16];
                        int var20 = field430[var16];
                        int var21 = field431[var16];
                        int var22 = field537[var16];
                        String var23 = field433[var16];
                        String var24 = field434[var16];
                        method730(var19, var20, var21, var22, var23, var24, class140.field2145, class140.field2146);
                    }
                    field427 = false;
                    method804(Statics.field1952, Statics.field180, Statics.field3146, Statics.field1544);
                }
            } else {
                if ((var8 == 1 || !Statics.field1037 && var8 == 4) && field400 > 0) {
                    int var25 = field431[field400 - 1];
                    if (var25 == 39 || var25 == 40 || var25 == 41 || var25 == 42 || var25 == 43 || var25 == 33 || var25 == 34 || var25 == 35 || var25 == 36 || var25 == 37 || var25 == 38 || var25 == 1005) {
                        var26 = field429[field400 - 1];
                        var27 = field430[field400 - 1];
                        class173 var28 = class173.method2765(var27);
                        int var29 = method707(var28);
                        boolean var30 = (var29 >> 28 & 0x1) != 0;
                        if (var30) {
                            break label222;
                        }
                        class178 var10000 = (class178) null;
                        if (class178.method733(method707(var28))) {
                            break label222;
                        }
                    }
                }
                if ((var8 == 1 || !Statics.field1037 && var8 == 4) && (field464 == 1 && field400 > 2 || method1108(field400 - 1))) {
                    var8 = 2;
                }
                if ((var8 == 1 || !Statics.field1037 && var8 == 4) && field400 > 0) {
                    int var35 = field400 - 1;
                    if (var35 >= 0) {
                        int var36 = field429[var35];
                        int var37 = field430[var35];
                        int var38 = field431[var35];
                        int var39 = field537[var35];
                        String var40 = field433[var35];
                        String var41 = field434[var35];
                        method730(var36, var37, var38, var39, var40, var41, class140.field2145, class140.field2146);
                    }
                }
                if (var8 == 2 && field400 > 0) {
                    method171(class140.field2145, class140.field2146);
                }
            }
            return;
        }
        if (Statics.field1551 != null && !field405 && field464 != 1 && !method1108(field400 - 1) && field400 > 0) {
            int var31 = field441;
            int var32 = field403;
            class31 var33 = Statics.field2727;
            method730(var33.field707, var33.field708, var33.field709, var33.field710, var33.field711, var33.field711, var31, var32);
            Statics.field2727 = null;
        }
        field405 = false;
        field406 = 0;
        if (Statics.field1551 != null) {
            Statics.method572(Statics.field1551);
        }
        Statics.field1551 = class173.method2765(var27);
        field363 = var26;
        field441 = class140.field2145;
        field403 = class140.field2146;
        if (field400 > 0) {
            int var34 = field400 - 1;
            Statics.field2727 = new class31();
            Statics.field2727.field707 = field429[var34];
            Statics.field2727.field708 = field430[var34];
            Statics.field2727.field709 = field431[var34];
            Statics.field2727.field710 = field537[var34];
            Statics.field2727.field711 = field433[var34];
        }
        Statics.method572(Statics.field1551);
    }

    @ObfuscatedName("d.bi(III)V")
    public static final void method171(int arg0, int arg1) {
        int var2 = Statics.field2625.method3775(class157.field2452);
        for (int var3 = 0; var3 < field400; var3++) {
            class224 var4 = Statics.field2625;
            String var5;
            if (field434[var3].length() > 0) {
                var5 = field433[var3] + class157.field2459 + field434[var3];
            } else {
                var5 = field433[var3];
            }
            int var6 = var4.method3775(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field400 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field2178) {
            var8 = Statics.field2178 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field164) {
            var9 = Statics.field164 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field427 = true;
        Statics.field1952 = var8;
        Statics.field180 = var9;
        Statics.field3146 = var2;
        Statics.field1544 = field400 * 15 + 22;
    }

    @ObfuscatedName("bp.br(II)Z")
    public static final boolean method1108(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field431[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("ap.bq(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method730(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 25) {
            class173 var8 = class173.method2212(arg1, arg0);
            if (var8 != null) {
                method1532();
                int var11 = method707(var8);
                int var12 = var11 >> 11 & 0x3F;
                method881(arg1, arg0, var12, var8.field2872);
                field450 = 0;
                int var13 = method707(var8);
                int var14 = var13 >> 11 & 0x3F;
                String var15;
                if (var14 == 0) {
                    var15 = null;
                } else if (var8.field2795 == null || var8.field2795.trim().length() == 0) {
                    var15 = null;
                } else {
                    var15 = var8.field2795;
                }
                field393 = var15;
                if (field393 == null) {
                    field393 = "Null";
                }
                if (var8.field2753) {
                    field445 = var8.field2825 + class2.method2244(16777215);
                } else {
                    field445 = class2.method2244(65280) + var8.field2839 + class2.method2244(16777215);
                }
            }
            return;
        }
        if (arg2 == 47) {
            class3 var16 = field293[arg3];
            if (var16 != null) {
                field437 = arg6;
                field522 = arg7;
                field398 = 2;
                field326 = 0;
                field469 = arg0;
                field480 = arg1;
                field331.method2555(105);
                field331.method2313(class137.field2112[82] ? 1 : 0);
                field331.method2476(arg3);
            }
        }
        if (arg2 == 21) {
            field437 = arg6;
            field522 = arg7;
            field398 = 2;
            field326 = 0;
            field469 = arg0;
            field480 = arg1;
            field331.method2555(238);
            field331.method2476(Statics.field585 + arg0);
            field331.method2322(Statics.field57 + arg1);
            field331.method2445(class137.field2112[82] ? 1 : 0);
            field331.method2322(arg3);
        }
        if (arg2 == 1) {
            field437 = arg6;
            field522 = arg7;
            field398 = 2;
            field326 = 0;
            field469 = arg0;
            field480 = arg1;
            field331.method2555(90);
            field331.method2318(Statics.field585 + arg0);
            field331.method2445(class137.field2112[82] ? 1 : 0);
            field331.method2421(Statics.field1212);
            field331.method2318(arg3 >> 14 & 0x7FFF);
            field331.method2323(Statics.field13);
            field331.method2323(Statics.field57 + arg1);
            field331.method2322(Statics.field1618);
        }
        if (arg2 == 4) {
            field437 = arg6;
            field522 = arg7;
            field398 = 2;
            field326 = 0;
            field469 = arg0;
            field480 = arg1;
            field331.method2555(101);
            field331.method2318(Statics.field57 + arg1);
            field331.method2347(class137.field2112[82] ? 1 : 0);
            field331.method2323(Statics.field585 + arg0);
            field331.method2476(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 22) {
            field437 = arg6;
            field522 = arg7;
            field398 = 2;
            field326 = 0;
            field469 = arg0;
            field480 = arg1;
            field331.method2555(136);
            field331.method2315(class137.field2112[82] ? 1 : 0);
            field331.method2318(arg3);
            field331.method2322(Statics.field57 + arg1);
            field331.method2476(Statics.field585 + arg0);
        }
        if (arg2 == 20) {
            field437 = arg6;
            field522 = arg7;
            field398 = 2;
            field326 = 0;
            field469 = arg0;
            field480 = arg1;
            field331.method2555(50);
            field331.method2322(arg3);
            field331.method2322(Statics.field57 + arg1);
            field331.method2445(class137.field2112[82] ? 1 : 0);
            field331.method2323(Statics.field585 + arg0);
        }
        if (arg2 == 46) {
            class3 var17 = field293[arg3];
            if (var17 != null) {
                field437 = arg6;
                field522 = arg7;
                field398 = 2;
                field326 = 0;
                field469 = arg0;
                field480 = arg1;
                field331.method2555(143);
                field331.method2313(class137.field2112[82] ? 1 : 0);
                field331.method2322(arg3);
            }
        }
        if (arg2 == 50) {
            class3 var18 = field293[arg3];
            if (var18 != null) {
                field437 = arg6;
                field522 = arg7;
                field398 = 2;
                field326 = 0;
                field469 = arg0;
                field480 = arg1;
                field331.method2555(170);
                field331.method2445(class137.field2112[82] ? 1 : 0);
                field331.method2476(arg3);
            }
        }
        if (arg2 == 43) {
            field331.method2555(31);
            field331.method2318(arg0);
            field331.method2421(arg1);
            field331.method2318(arg3);
            field399 = 0;
            Statics.field866 = class173.method2765(arg1);
            field515 = arg0;
        }
        if (arg2 == 7) {
            class35 var19 = field378[arg3];
            if (var19 != null) {
                field437 = arg6;
                field522 = arg7;
                field398 = 2;
                field326 = 0;
                field469 = arg0;
                field480 = arg1;
                field331.method2555(203);
                field331.method2347(class137.field2112[82] ? 1 : 0);
                field331.method2331(Statics.field1212);
                field331.method2318(Statics.field13);
                field331.method2476(Statics.field1618);
                field331.method2476(arg3);
            }
        }
        if (arg2 == 24) {
            class173 var20 = class173.method2765(arg1);
            boolean var21 = true;
            if (var20.field2882 > 0) {
                var21 = method664(var20);
            }
            if (var21) {
                field331.method2555(169);
                field331.method2278(arg1);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class173 var22 = class173.method2212(arg1, arg0);
            if (var22 != null) {
                method3611(arg3, arg1, arg0, var22.field2872, arg5);
            }
        }
        if (arg2 == 5) {
            field437 = arg6;
            field522 = arg7;
            field398 = 2;
            field326 = 0;
            field469 = arg0;
            field480 = arg1;
            field331.method2555(213);
            field331.method2347(class137.field2112[82] ? 1 : 0);
            field331.method2322(arg3 >> 14 & 0x7FFF);
            field331.method2323(Statics.field57 + arg1);
            field331.method2476(Statics.field585 + arg0);
        }
        if (arg2 == 16) {
            field437 = arg6;
            field522 = arg7;
            field398 = 2;
            field326 = 0;
            field469 = arg0;
            field480 = arg1;
            field331.method2555(168);
            field331.method2445(class137.field2112[82] ? 1 : 0);
            field331.method2318(Statics.field13);
            field331.method2333(Statics.field1212);
            field331.method2323(arg3);
            field331.method2323(Statics.field1618);
            field331.method2476(Statics.field585 + arg0);
            field331.method2323(Statics.field57 + arg1);
        }
        if (arg2 == 15) {
            class3 var23 = field293[arg3];
            if (var23 != null) {
                field437 = arg6;
                field522 = arg7;
                field398 = 2;
                field326 = 0;
                field469 = arg0;
                field480 = arg1;
                field331.method2555(222);
                field331.method2347(class137.field2112[82] ? 1 : 0);
                field331.method2322(arg3);
                field331.method2421(Statics.field1548);
                field331.method2476(field442);
            }
        }
        if (arg2 == 40) {
            field331.method2555(252);
            field331.method2476(arg3);
            field331.method2278(arg1);
            field331.method2476(arg0);
            field399 = 0;
            Statics.field866 = class173.method2765(arg1);
            field515 = arg0;
        }
        if (arg2 == 36) {
            field331.method2555(177);
            field331.method2476(arg3);
            field331.method2333(arg1);
            field331.method2476(arg0);
            field399 = 0;
            Statics.field866 = class173.method2765(arg1);
            field515 = arg0;
        }
        if (arg2 == 3) {
            field437 = arg6;
            field522 = arg7;
            field398 = 2;
            field326 = 0;
            field469 = arg0;
            field480 = arg1;
            field331.method2555(180);
            field331.method2315(class137.field2112[82] ? 1 : 0);
            field331.method2322(arg3 >> 14 & 0x7FFF);
            field331.method2318(Statics.field57 + arg1);
            field331.method2476(Statics.field585 + arg0);
        }
        if (arg2 == 11) {
            class35 var24 = field378[arg3];
            if (var24 != null) {
                field437 = arg6;
                field522 = arg7;
                field398 = 2;
                field326 = 0;
                field469 = arg0;
                field480 = arg1;
                field331.method2555(163);
                field331.method2323(arg3);
                field331.method2347(class137.field2112[82] ? 1 : 0);
            }
        }
        if (arg2 == 6) {
            field437 = arg6;
            field522 = arg7;
            field398 = 2;
            field326 = 0;
            field469 = arg0;
            field480 = arg1;
            field331.method2555(212);
            field331.method2313(class137.field2112[82] ? 1 : 0);
            field331.method2476(arg3 >> 14 & 0x7FFF);
            field331.method2323(Statics.field57 + arg1);
            field331.method2318(Statics.field585 + arg0);
        }
        if (arg2 == 58) {
            class173 var25 = class173.method2212(arg1, arg0);
            if (var25 != null) {
                field331.method2555(195);
                field331.method2322(field442);
                field331.method2322(arg0);
                field331.method2322(field443);
                field331.method2331(arg1);
                field331.method2331(Statics.field1548);
                field331.method2322(var25.field2872);
            }
        }
        if (arg2 == 1003) {
            field437 = arg6;
            field522 = arg7;
            field398 = 2;
            field326 = 0;
            class35 var26 = field378[arg3];
            if (var26 != null) {
                class40 var27 = var26.field779;
                if (var27.field894 != null) {
                    var27 = var27.method735();
                }
                if (var27 != null) {
                    field331.method2555(78);
                    field331.method2318(var27.field876);
                }
            }
        }
        if (arg2 == 37) {
            field331.method2555(123);
            field331.method2322(arg0);
            field331.method2278(arg1);
            field331.method2318(arg3);
            field399 = 0;
            Statics.field866 = class173.method2765(arg1);
            field515 = arg0;
        }
        if (arg2 == 1004) {
            field437 = arg6;
            field522 = arg7;
            field398 = 2;
            field326 = 0;
            field331.method2555(83);
            field331.method2323(arg3);
        }
        if (arg2 == 29) {
            field331.method2555(169);
            field331.method2278(arg1);
            class173 var28 = class173.method2765(arg1);
            if (var28.field2864 != null && var28.field2864[0][0] == 5) {
                int var29 = var28.field2864[0][1];
                if (class176.field2901[var29] != var28.field2866[0]) {
                    class176.field2901[var29] = var28.field2866[0];
                    method2218(var29);
                }
            }
        }
        if (arg2 == 18) {
            field437 = arg6;
            field522 = arg7;
            field398 = 2;
            field326 = 0;
            field469 = arg0;
            field480 = arg1;
            field331.method2555(243);
            field331.method2318(arg3);
            field331.method2313(class137.field2112[82] ? 1 : 0);
            field331.method2322(Statics.field585 + arg0);
            field331.method2318(Statics.field57 + arg1);
        }
        if (arg2 == 12) {
            class35 var30 = field378[arg3];
            if (var30 != null) {
                field437 = arg6;
                field522 = arg7;
                field398 = 2;
                field326 = 0;
                field469 = arg0;
                field480 = arg1;
                field331.method2555(214);
                field331.method2476(arg3);
                field331.method2347(class137.field2112[82] ? 1 : 0);
            }
        }
        if (arg2 == 33) {
            field331.method2555(228);
            field331.method2476(arg0);
            field331.method2318(arg3);
            field331.method2421(arg1);
            field399 = 0;
            Statics.field866 = class173.method2765(arg1);
            field515 = arg0;
        }
        if (arg2 == 45) {
            class3 var31 = field293[arg3];
            if (var31 != null) {
                field437 = arg6;
                field522 = arg7;
                field398 = 2;
                field326 = 0;
                field469 = arg0;
                field480 = arg1;
                field331.method2555(200);
                field331.method2315(class137.field2112[82] ? 1 : 0);
                field331.method2318(arg3);
            }
        }
        if (arg2 == 31) {
            field331.method2555(92);
            field331.method2333(arg1);
            field331.method2318(Statics.field13);
            field331.method2331(Statics.field1212);
            field331.method2318(arg0);
            field331.method2322(arg3);
            field331.method2476(Statics.field1618);
            field399 = 0;
            Statics.field866 = class173.method2765(arg1);
            field515 = arg0;
        }
        if (arg2 == 35) {
            field331.method2555(109);
            field331.method2323(arg3);
            field331.method2323(arg0);
            field331.method2421(arg1);
            field399 = 0;
            Statics.field866 = class173.method2765(arg1);
            field515 = arg0;
        }
        if (arg2 == 10) {
            class35 var32 = field378[arg3];
            if (var32 != null) {
                field437 = arg6;
                field522 = arg7;
                field398 = 2;
                field326 = 0;
                field469 = arg0;
                field480 = arg1;
                field331.method2555(239);
                field331.method2476(arg3);
                field331.method2445(class137.field2112[82] ? 1 : 0);
            }
        }
        if (arg2 == 9) {
            class35 var33 = field378[arg3];
            if (var33 != null) {
                field437 = arg6;
                field522 = arg7;
                field398 = 2;
                field326 = 0;
                field469 = arg0;
                field480 = arg1;
                field331.method2555(202);
                field331.method2315(class137.field2112[82] ? 1 : 0);
                field331.method2322(arg3);
            }
        }
        if (arg2 == 41) {
            field331.method2555(36);
            field331.method2333(arg1);
            field331.method2318(arg0);
            field331.method2323(arg3);
            field399 = 0;
            Statics.field866 = class173.method2765(arg1);
            field515 = arg0;
        }
        if (arg2 == 48) {
            class3 var34 = field293[arg3];
            if (var34 != null) {
                field437 = arg6;
                field522 = arg7;
                field398 = 2;
                field326 = 0;
                field469 = arg0;
                field480 = arg1;
                field331.method2555(185);
                field331.method2323(arg3);
                field331.method2347(class137.field2112[82] ? 1 : 0);
            }
        }
        if (arg2 == 8) {
            class35 var35 = field378[arg3];
            if (var35 != null) {
                field437 = arg6;
                field522 = arg7;
                field398 = 2;
                field326 = 0;
                field469 = arg0;
                field480 = arg1;
                field331.method2555(1);
                field331.method2421(Statics.field1548);
                field331.method2445(class137.field2112[82] ? 1 : 0);
                field331.method2318(arg3);
                field331.method2476(field442);
            }
        }
        if (arg2 == 38) {
            method1532();
            class173 var36 = class173.method2765(arg1);
            field450 = 1;
            Statics.field13 = arg0;
            Statics.field1212 = arg1;
            Statics.field1618 = arg3;
            Statics.method572(var36);
            field440 = class2.method2244(16748608) + class52.method1979(arg3).field1145 + class2.method2244(16777215);
            if (field440 == null) {
                field440 = "null";
            }
            return;
        }
        if (arg2 == 1005) {
            class173 var37 = class173.method2765(arg1);
            if (var37 == null || var37.field2871[arg0] < 100000) {
                field331.method2555(83);
                field331.method2323(arg3);
            } else {
                class12.method100(27, "", var37.field2871[arg0] + " x " + class52.method1979(arg3).field1145);
            }
            field399 = 0;
            Statics.field866 = class173.method2765(arg1);
            field515 = arg0;
        }
        if (arg2 == 34) {
            field331.method2555(217);
            field331.method2278(arg1);
            field331.method2322(arg3);
            field331.method2323(arg0);
            field399 = 0;
            Statics.field866 = class173.method2765(arg1);
            field515 = arg0;
        }
        if (arg2 == 23) {
            Statics.field107.method1758(Statics.field1516, arg0, arg1);
        }
        if (arg2 == 13) {
            class35 var38 = field378[arg3];
            if (var38 != null) {
                field437 = arg6;
                field522 = arg7;
                field398 = 2;
                field326 = 0;
                field469 = arg0;
                field480 = arg1;
                field331.method2555(96);
                field331.method2445(class137.field2112[82] ? 1 : 0);
                field331.method2322(arg3);
            }
        }
        if (arg2 == 19) {
            field437 = arg6;
            field522 = arg7;
            field398 = 2;
            field326 = 0;
            field469 = arg0;
            field480 = arg1;
            field331.method2555(104);
            field331.method2318(Statics.field585 + arg0);
            field331.method2323(Statics.field57 + arg1);
            field331.method2476(arg3);
            field331.method2347(class137.field2112[82] ? 1 : 0);
        }
        if (arg2 == 17) {
            field437 = arg6;
            field522 = arg7;
            field398 = 2;
            field326 = 0;
            field469 = arg0;
            field480 = arg1;
            field331.method2555(12);
            field331.method2445(class137.field2112[82] ? 1 : 0);
            field331.method2476(Statics.field585 + arg0);
            field331.method2331(Statics.field1548);
            field331.method2318(arg3);
            field331.method2476(Statics.field57 + arg1);
            field331.method2318(field442);
        }
        if (arg2 == 39) {
            field331.method2555(125);
            field331.method2331(arg1);
            field331.method2322(arg0);
            field331.method2476(arg3);
            field399 = 0;
            Statics.field866 = class173.method2765(arg1);
            field515 = arg0;
        }
        if (arg2 == 1002) {
            field437 = arg6;
            field522 = arg7;
            field398 = 2;
            field326 = 0;
            field331.method2555(147);
            field331.method2318(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 26) {
            field331.method2555(57);
            for (class4 var39 = (class4) field447.method3486(); var39 != null; var39 = (class4) field447.method3484()) {
                if (var39.field66 == 0 || var39.field66 == 3) {
                    method110(var39, true);
                }
            }
            if (field300 != null) {
                Statics.method572(field300);
                field300 = null;
            }
        }
        if (arg2 == 44) {
            class3 var40 = field293[arg3];
            if (var40 != null) {
                field437 = arg6;
                field522 = arg7;
                field398 = 2;
                field326 = 0;
                field469 = arg0;
                field480 = arg1;
                field331.method2555(220);
                field331.method2347(class137.field2112[82] ? 1 : 0);
                field331.method2476(arg3);
            }
        }
        if (arg2 == 30 && field300 == null) {
            method153(arg1, arg0);
            field300 = class173.method2212(arg1, arg0);
            Statics.method572(field300);
        }
        if (arg2 == 42) {
            field331.method2555(61);
            field331.method2278(arg1);
            field331.method2476(arg3);
            field331.method2476(arg0);
            field399 = 0;
            Statics.field866 = class173.method2765(arg1);
            field515 = arg0;
        }
        if (arg2 == 51) {
            class3 var41 = field293[arg3];
            if (var41 != null) {
                field437 = arg6;
                field522 = arg7;
                field398 = 2;
                field326 = 0;
                field469 = arg0;
                field480 = arg1;
                field331.method2555(34);
                field331.method2315(class137.field2112[82] ? 1 : 0);
                field331.method2323(arg3);
            }
        }
        if (arg2 == 2) {
            field437 = arg6;
            field522 = arg7;
            field398 = 2;
            field326 = 0;
            field469 = arg0;
            field480 = arg1;
            field331.method2555(107);
            field331.method2318(Statics.field585 + arg0);
            field331.method2333(Statics.field1548);
            field331.method2476(Statics.field57 + arg1);
            field331.method2323(field442);
            field331.method2323(arg3 >> 14 & 0x7FFF);
            field331.method2315(class137.field2112[82] ? 1 : 0);
        }
        if (arg2 == 14) {
            class3 var42 = field293[arg3];
            if (var42 != null) {
                field437 = arg6;
                field522 = arg7;
                field398 = 2;
                field326 = 0;
                field469 = arg0;
                field480 = arg1;
                field331.method2555(246);
                field331.method2318(arg3);
                field331.method2323(Statics.field13);
                field331.method2315(class137.field2112[82] ? 1 : 0);
                field331.method2476(Statics.field1618);
                field331.method2333(Statics.field1212);
            }
        }
        if (arg2 == 49) {
            class3 var43 = field293[arg3];
            if (var43 != null) {
                field437 = arg6;
                field522 = arg7;
                field398 = 2;
                field326 = 0;
                field469 = arg0;
                field480 = arg1;
                field331.method2555(8);
                field331.method2318(arg3);
                field331.method2347(class137.field2112[82] ? 1 : 0);
            }
        }
        if (arg2 == 1001) {
            field437 = arg6;
            field522 = arg7;
            field398 = 2;
            field326 = 0;
            field469 = arg0;
            field480 = arg1;
            field331.method2555(224);
            field331.method2322(arg3 >> 14 & 0x7FFF);
            field331.method2318(Statics.field57 + arg1);
            field331.method2313(class137.field2112[82] ? 1 : 0);
            field331.method2318(Statics.field585 + arg0);
        }
        if (arg2 == 32) {
            field331.method2555(27);
            field331.method2323(arg3);
            field331.method2318(field442);
            field331.method2322(arg0);
            field331.method2421(arg1);
            field331.method2421(Statics.field1548);
            field399 = 0;
            Statics.field866 = class173.method2765(arg1);
            field515 = arg0;
        }
        if (arg2 == 28) {
            field331.method2555(169);
            field331.method2278(arg1);
            class173 var44 = class173.method2765(arg1);
            if (var44.field2864 != null && var44.field2864[0][0] == 5) {
                int var45 = var44.field2864[0][1];
                class176.field2901[var45] = 1 - class176.field2901[var45];
                method2218(var45);
            }
        }
        if (field450 != 0) {
            field450 = 0;
            Statics.method572(class173.method2765(Statics.field1212));
        }
        if (field381) {
            method1532();
        }
        if (Statics.field866 != null && field399 == 0) {
            Statics.method572(Statics.field866);
        }
    }

    @ObfuscatedName("b.bx(ILjava/lang/String;S)V")
    public static void method537(int arg0, String arg1) {
        int var2 = class33.field754;
        int[] var3 = class33.field758;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class3 var6 = field293[var3[var5]];
            if (var6 != null && Statics.field2040 != var6 && var6.field44 != null && var6.field44.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field331.method2555(220);
                    field331.method2347(0);
                    field331.method2476(var3[var5]);
                } else if (arg0 == 4) {
                    field331.method2555(105);
                    field331.method2313(0);
                    field331.method2476(var3[var5]);
                } else if (arg0 == 6) {
                    field331.method2555(8);
                    field331.method2318(var3[var5]);
                    field331.method2347(0);
                } else if (arg0 == 7) {
                    field331.method2555(170);
                    field331.method2445(0);
                    field331.method2476(var3[var5]);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class12.method100(4, "", class157.field2389 + arg1);
        }
    }

    @ObfuscatedName("ab.be(IIIII)V")
    public static void method881(int arg0, int arg1, int arg2, int arg3) {
        class173 var4 = class173.method2212(arg0, arg1);
        if (var4 != null && var4.field2843 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field4 = var4.field2843;
            class37.method3091(var5, 200000);
        }
        field443 = arg3;
        field381 = true;
        Statics.field1548 = arg0;
        field442 = arg1;
        Statics.field1049 = arg2;
        Statics.method572(var4);
    }

    @ObfuscatedName("bl.bs(I)V")
    public static void method1532() {
        if (!field381) {
            return;
        }
        class173 var0 = class173.method2212(Statics.field1548, field442);
        if (var0 != null && var0.field2863 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field4 = var0.field2863;
            class37.method3091(var1, 200000);
        }
        field381 = false;
        Statics.method572(var0);
    }

    @ObfuscatedName("a.bc(III)V")
    public static void method153(int arg0, int arg1) {
        field331.method2555(82);
        field331.method2333(arg0);
        field331.method2476(arg1);
    }

    @ObfuscatedName("hm.bg(IIIILjava/lang/String;I)V")
    public static void method3611(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class173 var5 = class173.method2212(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2852 != null) {
            class1 var6 = new class1();
            var6.field3 = var5;
            var6.field6 = arg0;
            var6.field10 = arg4;
            var6.field4 = var5.field2852;
            class37.method3091(var6, 200000);
        }
        boolean var7 = true;
        if (var5.field2882 > 0) {
            var7 = method664(var5);
        }
        if (!var7 || !class178.method1193(method707(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field331.method2555(131);
            field331.method2278(arg1);
            field331.method2318(arg2);
            field331.method2318(arg3);
        }
        if (arg0 == 2) {
            field331.method2555(73);
            field331.method2278(arg1);
            field331.method2318(arg2);
            field331.method2318(arg3);
        }
        if (arg0 == 3) {
            field331.method2555(115);
            field331.method2278(arg1);
            field331.method2318(arg2);
            field331.method2318(arg3);
        }
        if (arg0 == 4) {
            field331.method2555(44);
            field331.method2278(arg1);
            field331.method2318(arg2);
            field331.method2318(arg3);
        }
        if (arg0 == 5) {
            field331.method2555(176);
            field331.method2278(arg1);
            field331.method2318(arg2);
            field331.method2318(arg3);
        }
        if (arg0 == 6) {
            field331.method2555(20);
            field331.method2278(arg1);
            field331.method2318(arg2);
            field331.method2318(arg3);
        }
        if (arg0 == 7) {
            field331.method2555(240);
            field331.method2278(arg1);
            field331.method2318(arg2);
            field331.method2318(arg3);
        }
        if (arg0 == 8) {
            field331.method2555(13);
            field331.method2278(arg1);
            field331.method2318(arg2);
            field331.method2318(arg3);
        }
        if (arg0 == 9) {
            field331.method2555(237);
            field331.method2278(arg1);
            field331.method2318(arg2);
            field331.method2318(arg3);
        }
        if (arg0 == 10) {
            field331.method2555(39);
            field331.method2278(arg1);
            field331.method2318(arg2);
            field331.method2318(arg3);
        }
    }

    @ObfuscatedName("gm.bu(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method3441(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field427 || field400 >= 500) {
            return;
        }
        field433[field400] = arg0;
        field434[field400] = arg1;
        field431[field400] = arg2;
        field537[field400] = arg3;
        field429[field400] = arg4;
        field430[field400] = arg5;
        field400++;
    }

    @ObfuscatedName("cv.bk(I)V")
    public static void method1895() {
        for (int var0 = 0; var0 < field400; var0++) {
            int var1 = field431[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field400 - 1) {
                    for (int var3 = var0; var3 < field400 - 1; var3++) {
                        field433[var3] = field433[var3 + 1];
                        field434[var3] = field434[var3 + 1];
                        field431[var3] = field431[var3 + 1];
                        field537[var3] = field537[var3 + 1];
                        field429[var3] = field429[var3 + 1];
                        field430[var3] = field430[var3 + 1];
                    }
                }
                field400--;
            }
        }
    }

    @ObfuscatedName("go.bl(Lax;IIII)V")
    public static final void method3437(class40 arg0, int arg1, int arg2, int arg3) {
        if (field400 >= 400) {
            return;
        }
        if (arg0.field894 != null) {
            arg0 = arg0.method735();
        }
        if (arg0 == null || !arg0.field889 || arg0.field910 && field446 != arg1) {
            return;
        }
        String var4 = arg0.field896;
        if (arg0.field893 != 0) {
            var4 = var4 + method144(arg0.field893, Statics.field2040.field41) + " " + class2.field24 + class157.field2455 + arg0.field893 + class2.field28;
        }
        if (field450 == 1) {
            method3441(class157.field2482, field440 + " " + class2.field26 + " " + class2.method2244(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field381) {
            String[] var5 = arg0.field904;
            if (field457) {
                var5 = method1521(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class157.field2451)) {
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
                        method3441(var5[var6], class2.method2244(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class157.field2451)) {
                        short var9 = 0;
                        if (field315 == class21.field575 || field315 == class21.field574 && arg0.field893 > Statics.field2040.field41) {
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
                        method3441(var5[var8], class2.method2244(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method3441(class157.field2448, class2.method2244(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1049 & 0x2) == 2) {
            method3441(field393, field445 + " " + class2.field26 + " " + class2.method2244(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("au.cb(Li;IIII)V")
    public static final void method843(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2040 == arg0 || field400 >= 400) {
            return;
        }
        String var4;
        if (arg0.field42 == 0) {
            var4 = arg0.field53[0] + arg0.field44 + arg0.field53[1] + method144(arg0.field41, Statics.field2040.field41) + " " + class2.field24 + class157.field2455 + arg0.field41 + class2.field28 + arg0.field53[2];
        } else {
            var4 = arg0.field53[0] + arg0.field44 + arg0.field53[1] + " " + class2.field24 + class157.field2456 + arg0.field42 + class2.field28 + arg0.field53[2];
        }
        if (field450 == 1) {
            method3441(class157.field2482, field440 + " " + class2.field26 + " " + class2.method2244(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field381) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field428[var5] != null) {
                    short var6 = 0;
                    if (field428[var5].equalsIgnoreCase(class157.field2451)) {
                        if (field315 == class21.field575 || field315 == class21.field574 && arg0.field41 > Statics.field2040.field41) {
                            var6 = 2000;
                        }
                        if (Statics.field2040.field55 != 0 && arg0.field55 != 0) {
                            if (Statics.field2040.field55 == arg0.field55) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field416[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field501[var5] + var6;
                    method3441(field428[var5], class2.method2244(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1049 & 0x8) == 8) {
            method3441(field393, field445 + " " + class2.field26 + " " + class2.method2244(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field400; var9++) {
            if (field431[var9] == 23) {
                field434[var9] = class2.method2244(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("e.ct(IIS)Ljava/lang/String;")
    public static final String method144(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method2244(16711680);
        } else if (var2 < -6) {
            return class2.method2244(16723968);
        } else if (var2 < -3) {
            return class2.method2244(16740352);
        } else if (var2 < 0) {
            return class2.method2244(16756736);
        } else if (var2 > 9) {
            return class2.method2244(65280);
        } else if (var2 > 6) {
            return class2.method2244(4259584);
        } else if (var2 > 3) {
            return class2.method2244(8453888);
        } else if (var2 > 0) {
            return class2.method2244(12648192);
        } else {
            return class2.method2244(16776960);
        }
    }

    @ObfuscatedName("cf.cj(IIIIIIIIB)V")
    public static final void method2077(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class173.method2229(arg0)) {
            Statics.field601 = null;
            method2885(Statics.field2807[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field601 != null) {
                method2885(Statics.field601, -1412584499, arg1, arg2, arg3, arg4, Statics.field2241, Statics.field627, arg7);
                Statics.field601 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field492[var8] = true;
            }
        } else {
            field492[arg7] = true;
        }
    }

    @ObfuscatedName("eh.cd([Lff;IIIIIIIIB)V")
    public static final void method2885(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1633(arg2, arg3, arg4, arg5);
        class91.method1897();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class173 var10 = arg0[var9];
            if (var10 != null && (var10.field2773 == arg1 || arg1 == -1412584499 && field517 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field495[field409] = var10.field2767 + arg6;
                    field496[field409] = var10.field2820 + arg7;
                    field536[field409] = var10.field2793;
                    field337[field409] = var10.field2770;
                    var11 = ++field409 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2883 = var11;
                var10.field2884 = field299;
                if (!var10.field2753 || !method890(var10)) {
                    if (var10.field2882 > 0) {
                        method1993(var10);
                    }
                    int var12 = var10.field2767 + arg6;
                    int var13 = var10.field2820 + arg7;
                    int var14 = var10.field2789;
                    if (field517 == var10) {
                        if (arg1 != -1412584499 && !var10.field2881) {
                            Statics.field601 = arg0;
                            Statics.field2241 = arg6;
                            Statics.field627 = arg7;
                            continue;
                        }
                        if (field470 && field414) {
                            int var15 = class140.field2150;
                            int var16 = class140.field2139 * -432201367;
                            int var17 = var15 - field461;
                            int var18 = var16 - field462;
                            if (var17 < field465) {
                                var17 = field465;
                            }
                            if (var10.field2793 + var17 > field465 + field505.field2793) {
                                var17 = field465 + field505.field2793 - var10.field2793;
                            }
                            if (var18 < field466) {
                                var18 = field466;
                            }
                            if (var10.field2770 + var18 > field466 + field505.field2770) {
                                var18 = field466 + field505.field2770 - var10.field2770;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2881) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2756 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2756 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2793 + var12;
                        int var26 = var10.field2770 + var13;
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
                        int var29 = var10.field2793 + var12;
                        int var30 = var10.field2770 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2753 || var19 < var21 && var20 < var22) {
                        if (var10.field2882 != 0) {
                            if (var10.field2882 == 1336) {
                                if (field305) {
                                    var13 += 15;
                                    Statics.field341.method3739("Fps:" + field2176, var10.field2793 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field570) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field570) {
                                        var33 = 16711680;
                                    }
                                    Statics.field341.method3739("Mem:" + var32 + "k", var10.field2793 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2882 == 1337) {
                                field435 = var12;
                                field351 = var13;
                                int var36 = var10.field2793;
                                int var37 = var10.field2770;
                                field506++;
                                method2748(class34.field769);
                                boolean var38 = false;
                                if (field375 >= 0) {
                                    int var39 = class33.field754;
                                    int[] var40 = class33.field758;
                                    for (int var41 = 0; var41 < var39; var41++) {
                                        if (field375 == var40[var41]) {
                                            var38 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var38) {
                                    method2748(class34.field770);
                                }
                                method1450(true);
                                method2748(var38 ? class34.field772 : class34.field771);
                                method1450(false);
                                method172();
                                method1978();
                                method1894(var12, var13, var36, var37, true);
                                int var42 = field524;
                                int var43 = field560;
                                int var44 = field551;
                                int var45 = field552;
                                class80.method1633(var42, var43, var42 + var44, var43 + var45);
                                class91.method1897();
                                if (!field535) {
                                    int var46 = field371;
                                    if (field380 / 256 > var46) {
                                        var46 = field380 / 256;
                                    }
                                    if (field335[4] && field538[4] + 128 > var46) {
                                        var46 = field538[4] + 128;
                                    }
                                    int var47 = field372 + field309 & 0x7FF;
                                    method1025(Statics.field1668, Statics.method141(Statics.field2040.field854, Statics.field2040.field808, Statics.field1516) - field377, Statics.field191, var46, var47, var46 * 3 + 600);
                                }
                                int var60;
                                if (field535) {
                                    int var61;
                                    if (Statics.field1030.field147) {
                                        var61 = Statics.field1516;
                                    } else {
                                        int var62 = Statics.method141(Statics.field571, Statics.field731, Statics.field1516);
                                        if (var62 - Statics.field20 >= 800 || (class6.field84[Statics.field1516][Statics.field571 >> 7][Statics.field731 >> 7] & 0x4) == 0) {
                                            var61 = 3;
                                        } else {
                                            var61 = Statics.field1516;
                                        }
                                    }
                                    var60 = var61;
                                } else {
                                    int var48;
                                    if (Statics.field1030.field147) {
                                        var48 = Statics.field1516;
                                    } else {
                                        label1066: {
                                            int var49 = 3;
                                            if (Statics.field2214 < 310) {
                                                int var50 = Statics.field571 >> 7;
                                                int var51 = Statics.field731 >> 7;
                                                int var52 = Statics.field2040.field854 >> 7;
                                                int var53 = Statics.field2040.field808 >> 7;
                                                if (var50 < 0 || var51 < 0 || var50 >= 104 || var51 >= 104) {
                                                    var48 = Statics.field1516;
                                                    break label1066;
                                                }
                                                if ((class6.field84[Statics.field1516][var50][var51] & 0x4) != 0) {
                                                    var49 = Statics.field1516;
                                                }
                                                int var54;
                                                if (var52 > var50) {
                                                    var54 = var52 - var50;
                                                } else {
                                                    var54 = var50 - var52;
                                                }
                                                int var55;
                                                if (var53 > var51) {
                                                    var55 = var53 - var51;
                                                } else {
                                                    var55 = var51 - var53;
                                                }
                                                if (var54 > var55) {
                                                    int var56 = var55 * 65536 / var54;
                                                    int var57 = 32768;
                                                    while (var50 != var52) {
                                                        if (var50 < var52) {
                                                            var50++;
                                                        } else if (var50 > var52) {
                                                            var50--;
                                                        }
                                                        if ((class6.field84[Statics.field1516][var50][var51] & 0x4) != 0) {
                                                            var49 = Statics.field1516;
                                                        }
                                                        var57 += var56;
                                                        if (var57 >= 65536) {
                                                            var57 -= 65536;
                                                            if (var51 < var53) {
                                                                var51++;
                                                            } else if (var51 > var53) {
                                                                var51--;
                                                            }
                                                            if ((class6.field84[Statics.field1516][var50][var51] & 0x4) != 0) {
                                                                var49 = Statics.field1516;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int var58 = var54 * 65536 / var55;
                                                    int var59 = 32768;
                                                    while (var51 != var53) {
                                                        if (var51 < var53) {
                                                            var51++;
                                                        } else if (var51 > var53) {
                                                            var51--;
                                                        }
                                                        if ((class6.field84[Statics.field1516][var50][var51] & 0x4) != 0) {
                                                            var49 = Statics.field1516;
                                                        }
                                                        var59 += var58;
                                                        if (var59 >= 65536) {
                                                            var59 -= 65536;
                                                            if (var50 < var52) {
                                                                var50++;
                                                            } else if (var50 > var52) {
                                                                var50--;
                                                            }
                                                            if ((class6.field84[Statics.field1516][var50][var51] & 0x4) != 0) {
                                                                var49 = Statics.field1516;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (Statics.field2040.field854 >= 0 && Statics.field2040.field808 >= 0 && Statics.field2040.field854 < 13312 && Statics.field2040.field808 < 13312) {
                                                if ((class6.field84[Statics.field1516][Statics.field2040.field854 >> 7][Statics.field2040.field808 >> 7] & 0x4) != 0) {
                                                    var49 = Statics.field1516;
                                                }
                                                var48 = var49;
                                            } else {
                                                var48 = Statics.field1516;
                                            }
                                        }
                                    }
                                    var60 = var48;
                                }
                                int var63 = Statics.field571;
                                int var64 = Statics.field20;
                                int var65 = Statics.field731;
                                int var66 = Statics.field2214;
                                int var67 = Statics.field1540;
                                for (int var68 = 0; var68 < 5; var68++) {
                                    if (field335[var68]) {
                                        int var69 = (int) (Math.random() * (double) (field471[var68] * 2 + 1) - (double) field471[var68] + Math.sin((double) field539[var68] / 100.0D * (double) field540[var68]) * (double) field538[var68]);
                                        if (var68 == 0) {
                                            Statics.field571 += var69;
                                        }
                                        if (var68 == 1) {
                                            Statics.field20 += var69;
                                        }
                                        if (var68 == 2) {
                                            Statics.field731 += var69;
                                        }
                                        if (var68 == 3) {
                                            Statics.field1540 = Statics.field1540 + var69 & 0x7FF;
                                        }
                                        if (var68 == 4) {
                                            Statics.field2214 += var69;
                                            if (Statics.field2214 < 128) {
                                                Statics.field2214 = 128;
                                            }
                                            if (Statics.field2214 > 383) {
                                                Statics.field2214 = 383;
                                            }
                                        }
                                    }
                                }
                                int var70 = class140.field2150;
                                int var71 = class140.field2139 * -432201367;
                                if (class140.field2144 != 0) {
                                    var70 = class140.field2145;
                                    var71 = class140.field2146;
                                }
                                if (var70 >= var42 && var70 < var42 + var44 && var71 >= var43 && var71 < var43 + var45) {
                                    class105.field1820 = true;
                                    class105.field1847 = 0;
                                    class105.field1845 = var70 - var42;
                                    class105.field1800 = var71 - var43;
                                } else {
                                    class105.field1820 = false;
                                    class105.field1847 = 0;
                                }
                                method1973();
                                class80.method1665(var42, var43, var44, var45, 0);
                                method1973();
                                int var72 = class91.field1565;
                                class91.field1565 = field553;
                                Statics.field107.method1759(Statics.field571, Statics.field20, Statics.field731, Statics.field2214, Statics.field1540, var60);
                                class91.field1565 = var72;
                                method1973();
                                Statics.field107.method1735();
                                method613(var42, var43, var44, var45);
                                if (field307 == 2) {
                                    method2533((field310 - Statics.field585 << 7) + field313, (field311 - Statics.field57 << 7) + field314, field312 * 2);
                                    if (field518 > -1 && field299 % 20 < 10) {
                                        Statics.field144[0].method1547(field518 + var42 - 12, field394 + var43 - 28);
                                    }
                                }
                                ((class95) Statics.field1576).method1983(field352);
                                method915(var42, var43, var44, var45);
                                Statics.field571 = var63;
                                Statics.field20 = var64;
                                Statics.field731 = var65;
                                Statics.field2214 = var66;
                                Statics.field1540 = var67;
                                if (field298) {
                                    byte var73 = 0;
                                    int var74 = class171.field2732 + class171.field2718 + var73;
                                    if (var74 == 0) {
                                        field298 = false;
                                    }
                                }
                                if (field298) {
                                    class80.method1665(var42, var43, var44, var45, 0);
                                    method1115(class157.field2308, false);
                                }
                                field492[var10.field2883] = true;
                                class80.method1633(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2882 == 1338) {
                                method1992(var10, var12, var13, var11);
                                class80.method1633(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2882 == 1339) {
                                class175 var76 = var10.method3112(false);
                                if (var76 != null) {
                                    if (field523 < 3) {
                                        Statics.field152.method1558(var12, var13, var76.field2896, var76.field2895, 25, 25, field372, 256, var76.field2898, var76.field2897);
                                    } else {
                                        class80.method1648(var12, var13, 0, var76.field2898, var76.field2897);
                                    }
                                }
                                class80.method1633(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2756 == 0) {
                            if (!var10.field2753 && method890(var10) && Statics.field2985 != var10) {
                                continue;
                            }
                            if (!var10.field2753) {
                                if (var10.field2751 > var10.field2778 - var10.field2770) {
                                    var10.field2751 = var10.field2778 - var10.field2770;
                                }
                                if (var10.field2751 < 0) {
                                    var10.field2751 = 0;
                                }
                            }
                            method2885(arg0, var10.field2769, var19, var20, var21, var22, var12 - var10.field2776, var13 - var10.field2751, var11);
                            if (var10.field2886 != null) {
                                method2885(var10.field2886, var10.field2769, var19, var20, var21, var22, var12 - var10.field2776, var13 - var10.field2751, var11);
                            }
                            class4 var77 = (class4) field447.method3482((long) var10.field2769);
                            if (var77 != null) {
                                method2077(var77.field65, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class80.method1633(arg2, arg3, arg4, arg5);
                            class91.method1897();
                        }
                        if (field511 || field481[var11] || field499 > 1) {
                            if (var10.field2756 == 0 && !var10.field2753 && var10.field2778 > var10.field2770) {
                                int var78 = var10.field2793 + var12;
                                int var79 = var10.field2751;
                                int var80 = var10.field2770;
                                int var81 = var10.field2778;
                                Statics.field2044[0].method1699(var78, var13);
                                Statics.field2044[1].method1699(var78, var13 + var80 - 16);
                                class80.method1665(var78, var13 + 16, 16, var80 - 32, field365);
                                int var82 = (var80 - 32) * var80 / var81;
                                if (var82 < 8) {
                                    var82 = 8;
                                }
                                int var83 = (var80 - 32 - var82) * var79 / (var81 - var80);
                                class80.method1665(var78, var13 + 16 + var83, 16, var82, field366);
                                class80.method1645(var78, var13 + 16 + var83, var82, field355);
                                class80.method1645(var78 + 1, var13 + 16 + var83, var82, field355);
                                class80.method1643(var78, var13 + 16 + var83, 16, field355);
                                class80.method1643(var78, var13 + 17 + var83, 16, field355);
                                class80.method1645(var78 + 15, var13 + 16 + var83, var82, field367);
                                class80.method1645(var78 + 14, var13 + 17 + var83, var82 - 1, field367);
                                class80.method1643(var78, var13 + 15 + var83 + var82, 16, field367);
                                class80.method1643(var78 + 1, var13 + 14 + var83 + var82, 15, field367);
                            }
                            if (var10.field2756 != 1) {
                                if (var10.field2756 == 2) {
                                    int var84 = 0;
                                    for (int var85 = 0; var85 < var10.field2766; var85++) {
                                        for (int var86 = 0; var86 < var10.field2824; var86++) {
                                            int var87 = (var10.field2818 + 32) * var86 + var12;
                                            int var88 = (var10.field2746 + 32) * var85 + var13;
                                            if (var84 < 20) {
                                                var87 += var10.field2876[var84];
                                                var88 += var10.field2821[var84];
                                            }
                                            if (var10.field2819[var84] > 0) {
                                                boolean var89 = false;
                                                boolean var90 = false;
                                                int var91 = var10.field2819[var84] - 1;
                                                if (var87 + 32 > arg2 && var87 < arg4 && var88 + 32 > arg3 && var88 < arg5 || Statics.field1551 == var10 && field363 == var84) {
                                                    class79 var92;
                                                    if (field450 == 1 && Statics.field13 == var84 && Statics.field1212 == var10.field2769) {
                                                        var92 = class52.method525(var91, var10.field2871[var84], 2, 0, 2, false);
                                                    } else {
                                                        var92 = class52.method525(var91, var10.field2871[var84], 1, 3153952, 2, false);
                                                    }
                                                    if (var92 == null) {
                                                        Statics.method572(var10);
                                                    } else if (Statics.field1551 == var10 && field363 == var84) {
                                                        int var93 = class140.field2150 - field441;
                                                        int var94 = class140.field2139 * -432201367 - field403;
                                                        if (var93 < 5 && var93 > -5) {
                                                            var93 = 0;
                                                        }
                                                        if (var94 < 5 && var94 > -5) {
                                                            var94 = 0;
                                                        }
                                                        if (field406 < 5) {
                                                            var93 = 0;
                                                            var94 = 0;
                                                        }
                                                        var92.method1582(var87 + var93, var88 + var94, 128);
                                                        if (arg1 != -1) {
                                                            class173 var95 = arg0[arg1 & 0xFFFF];
                                                            if (var88 + var94 < class80.field1400 && var95.field2751 > 0) {
                                                                int var96 = field352 * (class80.field1400 - var88 - var94) / 3;
                                                                if (var96 > field352 * 10) {
                                                                    var96 = field352 * 10;
                                                                }
                                                                if (var96 > var95.field2751) {
                                                                    var96 = var95.field2751;
                                                                }
                                                                var95.field2751 -= var96;
                                                                field403 += var96;
                                                                Statics.method572(var95);
                                                            }
                                                            if (var88 + var94 + 32 > class80.field1401 && var95.field2751 < var95.field2778 - var95.field2770) {
                                                                int var97 = field352 * (var88 + var94 + 32 - class80.field1401) / 3;
                                                                if (var97 > field352 * 10) {
                                                                    var97 = field352 * 10;
                                                                }
                                                                if (var97 > var95.field2778 - var95.field2770 - var95.field2751) {
                                                                    var97 = var95.field2778 - var95.field2770 - var95.field2751;
                                                                }
                                                                var95.field2751 += var97;
                                                                field403 -= var97;
                                                                Statics.method572(var95);
                                                            }
                                                        }
                                                    } else if (Statics.field866 == var10 && field515 == var84) {
                                                        var92.method1582(var87, var88, 128);
                                                    } else {
                                                        var92.method1547(var87, var88);
                                                    }
                                                }
                                            } else if (var10.field2800 != null && var84 < 20) {
                                                class79 var98 = var10.method3110(var84);
                                                if (var98 != null) {
                                                    var98.method1547(var87, var88);
                                                } else if (class173.field2752) {
                                                    Statics.method572(var10);
                                                }
                                            }
                                            var84++;
                                        }
                                    }
                                } else if (var10.field2756 == 3) {
                                    int var99;
                                    if (method170(var10)) {
                                        var99 = var10.field2780;
                                        if (Statics.field2985 == var10 && var10.field2782 != 0) {
                                            var99 = var10.field2782;
                                        }
                                    } else {
                                        var99 = var10.field2779;
                                        if (Statics.field2985 == var10 && var10.field2781 != 0) {
                                            var99 = var10.field2781;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2783) {
                                            class80.method1665(var12, var13, var10.field2793, var10.field2770, var99);
                                        } else {
                                            class80.method1641(var12, var13, var10.field2793, var10.field2770, var99);
                                        }
                                    } else if (var10.field2783) {
                                        class80.method1634(var12, var13, var10.field2793, var10.field2770, var99, 256 - (var14 & 0xFF));
                                    } else {
                                        class80.method1684(var12, var13, var10.field2793, var10.field2770, var99, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2756 == 4) {
                                    class224 var100 = var10.method3136();
                                    if (var100 != null) {
                                        String var101 = var10.field2830;
                                        int var102;
                                        if (method170(var10)) {
                                            var102 = var10.field2780;
                                            if (Statics.field2985 == var10 && var10.field2782 != 0) {
                                                var102 = var10.field2782;
                                            }
                                            if (var10.field2813.length() > 0) {
                                                var101 = var10.field2813;
                                            }
                                        } else {
                                            var102 = var10.field2779;
                                            if (Statics.field2985 == var10 && var10.field2781 != 0) {
                                                var102 = var10.field2781;
                                            }
                                        }
                                        if (var10.field2753 && var10.field2872 != -1) {
                                            class52 var103 = class52.method1979(var10.field2872);
                                            var101 = var103.field1145;
                                            if (var101 == null) {
                                                var101 = "null";
                                            }
                                            if ((var103.field1117 == 1 || var10.field2873 != 1) && var10.field2873 != -1) {
                                                var101 = class2.method2244(16748608) + var101 + class2.field25 + " " + 'x' + method2587(var10.field2873);
                                            }
                                        }
                                        if (field300 == var10) {
                                            class157 var10000 = (class157) null;
                                            var101 = class157.field2457;
                                            var102 = var10.field2779;
                                        }
                                        if (!var10.field2753) {
                                            var101 = method556(var101, var10);
                                        }
                                        var100.method3797(var101, var12, var13, var10.field2793, var10.field2770, var102, var10.field2744 ? 0 : -1, var10.field2877, var10.field2816, var10.field2815);
                                    } else if (class173.field2752) {
                                        Statics.method572(var10);
                                    }
                                } else if (var10.field2756 == 5) {
                                    if (var10.field2753) {
                                        class79 var105;
                                        if (var10.field2872 == -1) {
                                            var105 = var10.method3146(false);
                                        } else {
                                            var105 = class52.method525(var10.field2872, var10.field2873, var10.field2841, var10.field2792, var10.field2810, false);
                                        }
                                        if (var105 != null) {
                                            int var106 = var105.field1396;
                                            int var107 = var105.field1391;
                                            if (var10.field2790) {
                                                class80.method1673(var12, var13, var10.field2793 + var12, var10.field2770 + var13);
                                                int var108 = (var10.field2793 + (var106 - 1)) / var106;
                                                int var109 = (var10.field2770 + (var107 - 1)) / var107;
                                                for (int var110 = 0; var110 < var108; var110++) {
                                                    for (int var111 = 0; var111 < var109; var111++) {
                                                        if (var10.field2775 != 0) {
                                                            var105.method1606(var106 / 2 + var106 * var110 + var12, var107 / 2 + var107 * var111 + var13, var10.field2775, 4096);
                                                        } else if (var14 == 0) {
                                                            var105.method1547(var106 * var110 + var12, var107 * var111 + var13);
                                                        } else {
                                                            var105.method1582(var106 * var110 + var12, var107 * var111 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1633(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var112 = var10.field2793 * 4096 / var106;
                                                if (var10.field2775 != 0) {
                                                    var105.method1606(var10.field2793 / 2 + var12, var10.field2770 / 2 + var13, var10.field2775, var112);
                                                } else if (var14 != 0) {
                                                    var105.method1571(var12, var13, var10.field2793, var10.field2770, 256 - (var14 & 0xFF));
                                                } else if (var10.field2793 == var106 && var10.field2770 == var107) {
                                                    var105.method1547(var12, var13);
                                                } else {
                                                    var105.method1549(var12, var13, var10.field2793, var10.field2770);
                                                }
                                            }
                                        } else if (class173.field2752) {
                                            Statics.method572(var10);
                                        }
                                    } else {
                                        class79 var104 = var10.method3146(method170(var10));
                                        if (var104 != null) {
                                            var104.method1547(var12, var13);
                                        } else if (class173.field2752) {
                                            Statics.method572(var10);
                                        }
                                    }
                                } else if (var10.field2756 == 6) {
                                    boolean var113 = method170(var10);
                                    int var114;
                                    if (var113) {
                                        var114 = var10.field2786;
                                    } else {
                                        var114 = var10.field2754;
                                    }
                                    class105 var115 = null;
                                    int var116 = 0;
                                    if (var10.field2872 != -1) {
                                        class52 var117 = class52.method1979(var10.field2872);
                                        if (var117 != null) {
                                            class52 var118 = var117.method975(var10.field2873);
                                            var115 = var118.method1010(1);
                                            if (var115 == null) {
                                                Statics.method572(var10);
                                            } else {
                                                var115.method2093();
                                                var116 = var115.field1441 / 2;
                                            }
                                        }
                                    } else if (var10.field2870 == 5) {
                                        if (var10.field2796 == 0) {
                                            var115 = field493.method3204((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var115 = Statics.field2040.method21();
                                        }
                                    } else if (var114 == -1) {
                                        var115 = var10.method3111((class43) null, -1, var113, Statics.field2040.field36);
                                        if (var115 == null && class173.field2752) {
                                            Statics.method572(var10);
                                        }
                                    } else {
                                        class43 var119 = class43.method3081(var114);
                                        var115 = var10.method3111(var119, var10.field2874, var113, Statics.field2040.field36);
                                        if (var115 == null && class173.field2752) {
                                            Statics.method572(var10);
                                        }
                                    }
                                    class91.method1937(var10.field2793 / 2 + var12, var10.field2770 / 2 + var13);
                                    int var120 = var10.field2806 * class91.field1579[var10.field2803] >> 16;
                                    int var121 = var10.field2806 * class91.field1580[var10.field2803] >> 16;
                                    if (var115 != null) {
                                        if (var10.field2753) {
                                            var115.method2093();
                                            if (var10.field2809) {
                                                var115.method2104(0, var10.field2804, var10.field2805, var10.field2803, var10.field2801, var10.field2802 + var116 + var120, var10.field2802 + var121, var10.field2806);
                                            } else {
                                                var115.method2103(0, var10.field2804, var10.field2805, var10.field2803, var10.field2801, var10.field2802 + var116 + var120, var10.field2802 + var121);
                                            }
                                        } else {
                                            var115.method2103(0, var10.field2804, 0, var10.field2803, 0, var120, var121);
                                        }
                                    }
                                    class91.method1899();
                                } else {
                                    if (var10.field2756 == 7) {
                                        class224 var122 = var10.method3136();
                                        if (var122 == null) {
                                            if (class173.field2752) {
                                                Statics.method572(var10);
                                            }
                                            continue;
                                        }
                                        int var123 = 0;
                                        for (int var124 = 0; var124 < var10.field2766; var124++) {
                                            for (int var125 = 0; var125 < var10.field2824; var125++) {
                                                if (var10.field2819[var123] > 0) {
                                                    class52 var126 = class52.method1979(var10.field2819[var123] - 1);
                                                    String var127;
                                                    if (var126.field1117 != 1 && var10.field2871[var123] == 1) {
                                                        var127 = class2.method2244(16748608) + var126.field1145 + class2.field25;
                                                    } else {
                                                        var127 = class2.method2244(16748608) + var126.field1145 + class2.field25 + " " + 'x' + method2587(var10.field2871[var123]);
                                                    }
                                                    int var128 = (var10.field2818 + 115) * var125 + var12;
                                                    int var129 = (var10.field2746 + 12) * var124 + var13;
                                                    if (var10.field2877 == 0) {
                                                        var122.method3723(var127, var128, var129, var10.field2779, var10.field2744 ? 0 : -1);
                                                    } else if (var10.field2877 == 1) {
                                                        var122.method3794(var127, var10.field2793 / 2 + var128, var129, var10.field2779, var10.field2744 ? 0 : -1);
                                                    } else {
                                                        var122.method3739(var127, var10.field2793 + var128 - 1, var129, var10.field2779, var10.field2744 ? 0 : -1);
                                                    }
                                                }
                                                var123++;
                                            }
                                        }
                                    }
                                    if (var10.field2756 == 8 && Statics.field2149 == var10 && field565 == field328) {
                                        int var130 = 0;
                                        int var131 = 0;
                                        class224 var132 = Statics.field341;
                                        String var133 = var10.field2830;
                                        String var134 = method556(var133, var10);
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
                                            int var137 = var132.method3775(var136);
                                            if (var137 > var130) {
                                                var130 = var137;
                                            }
                                            var131 += var132.field3175 + 1;
                                        }
                                        var130 += 6;
                                        var131 += 7;
                                        int var138 = var10.field2793 + var12 - 5 - var130;
                                        int var139 = var10.field2770 + var13 + 5;
                                        if (var138 < var12 + 5) {
                                            var138 = var12 + 5;
                                        }
                                        if (var130 + var138 > arg4) {
                                            var138 = arg4 - var130;
                                        }
                                        if (var131 + var139 > arg5) {
                                            var139 = arg5 - var131;
                                        }
                                        class80.method1665(var138, var139, var130, var131, 16777120);
                                        class80.method1641(var138, var139, var130, var131, 0);
                                        String var140 = var10.field2830;
                                        int var141 = var132.field3175 + var139 + 2;
                                        String var142 = method556(var140, var10);
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
                                            var132.method3723(var144, var138 + 3, var141, 0, -1);
                                            var141 += var132.field3175 + 1;
                                        }
                                    }
                                    if (var10.field2756 == 9) {
                                        if (var10.field2822 == 1) {
                                            int var145;
                                            int var146;
                                            int var147;
                                            int var148;
                                            if (var10.field2847) {
                                                var145 = var12;
                                                var146 = var10.field2770 + var13;
                                                var147 = var10.field2793 + var12;
                                                var148 = var13;
                                            } else {
                                                var145 = var12;
                                                var146 = var13;
                                                var147 = var10.field2793 + var12;
                                                var148 = var10.field2770 + var13;
                                            }
                                            class80.method1676(var145, var146, var147, var148, var10.field2779);
                                        } else {
                                            int var149 = var10.field2793 >= 0 ? var10.field2793 : -var10.field2793;
                                            int var150 = var10.field2770 >= 0 ? var10.field2770 : -var10.field2770;
                                            int var151 = var149;
                                            if (var149 < var150) {
                                                var151 = var150;
                                            }
                                            if (var151 != 0) {
                                                int var152 = (var10.field2793 << 16) / var151;
                                                int var153 = (var10.field2770 << 16) / var151;
                                                if (var153 <= var152) {
                                                    var152 = -var152;
                                                } else {
                                                    var153 = -var153;
                                                }
                                                int var154 = var10.field2822 * var153 >> 17;
                                                int var155 = var10.field2822 * var153 + 1 >> 17;
                                                int var156 = var10.field2822 * var152 >> 17;
                                                int var157 = var10.field2822 * var152 + 1 >> 17;
                                                int var158 = var12 + var154;
                                                int var159 = var12 - var155;
                                                int var160 = var10.field2793 + var12 - var155;
                                                int var161 = var10.field2793 + var12 + var154;
                                                int var162 = var13 + var156;
                                                int var163 = var13 - var157;
                                                int var164 = var10.field2770 + var13 - var157;
                                                int var165 = var10.field2770 + var13 + var156;
                                                class91.method1905(var158, var159, var160);
                                                class91.method1908(var162, var163, var164, var158, var159, var160, var10.field2779);
                                                class91.method1905(var158, var160, var161);
                                                class91.method1908(var162, var164, var165, var158, var160, var161, var10.field2779);
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

    @ObfuscatedName("n.cq(Ljava/lang/String;Lff;I)Ljava/lang/String;")
    public static String method556(String arg0, class173 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method2905(method1531(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field192 != null) {
                    var5 = class163.method2767(Statics.field192.field2206);
                    if (Statics.field192.field2200 != null) {
                        var5 = (String) Statics.field192.field2200;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("dj.ce(II)Ljava/lang/String;")
    public static final String method2587(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field22 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2244(65408) + var1.substring(0, var1.length() - 8) + class157.field2545 + " " + class2.field24 + var1 + class2.field28 + class2.field25;
        } else if (var1.length() > 6) {
            return " " + class2.method2244(16777215) + var1.substring(0, var1.length() - 4) + class157.field2387 + " " + class2.field24 + var1 + class2.field28 + class2.field25;
        } else {
            return " " + class2.method2244(16776960) + var1 + class2.field25;
        }
    }

    @ObfuscatedName("eu.co(ZI)V")
    public static final void method2875(boolean arg0) {
        method2559(field392, Statics.field2178, Statics.field164, arg0);
    }

    @ObfuscatedName("el.cp(Lff;S)V")
    public static void method2755(class173 arg0) {
        class173 var1 = arg0.field2773 == -1 ? null : class173.method2765(arg0.field2773);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field2178;
            var3 = Statics.field164;
        } else {
            var2 = var1.field2793;
            var3 = var1.field2770;
        }
        method609(arg0, var2, var3, false);
        method3806(arg0, var2, var3);
    }

    @ObfuscatedName("bg.cv([Lff;Lff;ZI)V")
    public static void method1444(class173[] arg0, class173 arg1, boolean arg2) {
        int var3 = arg1.field2777 == 0 ? arg1.field2793 : arg1.field2777;
        int var4 = arg1.field2778 == 0 ? arg1.field2770 : arg1.field2778;
        method66(arg0, arg1.field2769, var3, var4, arg2);
        if (arg1.field2886 != null) {
            method66(arg1.field2886, arg1.field2769, var3, var4, arg2);
        }
        class4 var5 = (class4) field447.method3482((long) arg1.field2769);
        if (var5 != null) {
            int var6 = var5.field65;
            if (class173.method2229(var6)) {
                method66(Statics.field2807[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2882 == 1337) {
        }
    }

    @ObfuscatedName("dl.ch(IIIZI)V")
    public static final void method2559(int arg0, int arg1, int arg2, boolean arg3) {
        if (class173.method2229(arg0)) {
            method66(Statics.field2807[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("u.cn([Lff;IIIZI)V")
    public static void method66(class173[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class173 var6 = arg0[var5];
            if (var6 != null && var6.field2773 == arg1) {
                method609(var6, arg2, arg3, arg4);
                method3806(var6, arg2, arg3);
                if (var6.field2776 > var6.field2777 - var6.field2793) {
                    var6.field2776 = var6.field2777 - var6.field2793;
                }
                if (var6.field2776 < 0) {
                    var6.field2776 = 0;
                }
                if (var6.field2751 > var6.field2778 - var6.field2770) {
                    var6.field2751 = var6.field2778 - var6.field2770;
                }
                if (var6.field2751 < 0) {
                    var6.field2751 = 0;
                }
                if (var6.field2756 == 0) {
                    method1444(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("x.cy(Lff;IIZB)V")
    public static void method609(class173 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2793;
        int var5 = arg0.field2770;
        if (arg0.field2761 == 0) {
            arg0.field2793 = arg0.field2824;
        } else if (arg0.field2761 == 1) {
            arg0.field2793 = arg1 - arg0.field2824;
        } else if (arg0.field2761 == 2) {
            arg0.field2793 = arg0.field2824 * arg1 >> 14;
        }
        if (arg0.field2794 == 0) {
            arg0.field2770 = arg0.field2766;
        } else if (arg0.field2794 == 1) {
            arg0.field2770 = arg2 - arg0.field2766;
        } else if (arg0.field2794 == 2) {
            arg0.field2770 = arg0.field2766 * arg2 >> 14;
        }
        if (arg0.field2761 == 4) {
            arg0.field2793 = arg0.field2771 * arg0.field2770 / arg0.field2772;
        }
        if (arg0.field2794 == 4) {
            arg0.field2770 = arg0.field2793 * arg0.field2772 / arg0.field2771;
        }
        if (field497 && arg0.field2756 == 0) {
            if (arg0.field2770 < 5 && arg0.field2793 < 5) {
                arg0.field2770 = 5;
                arg0.field2793 = 5;
            } else {
                if (arg0.field2770 <= 0) {
                    arg0.field2770 = 5;
                }
                if (arg0.field2793 <= 0) {
                    arg0.field2793 = 5;
                }
            }
        }
        if (arg0.field2882 == 1337) {
            field458 = arg0;
        }
        if (arg3 && arg0.field2861 != null && (arg0.field2793 != var4 || arg0.field2770 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field4 = arg0.field2861;
            field486.method3515(var6);
        }
    }

    @ObfuscatedName("hx.cl(Lff;IIB)V")
    public static void method3806(class173 arg0, int arg1, int arg2) {
        if (arg0.field2759 == 0) {
            arg0.field2767 = arg0.field2763;
        } else if (arg0.field2759 == 1) {
            arg0.field2767 = (arg1 - arg0.field2793) / 2 + arg0.field2763;
        } else if (arg0.field2759 == 2) {
            arg0.field2767 = arg1 - arg0.field2793 - arg0.field2763;
        } else if (arg0.field2759 == 3) {
            arg0.field2767 = arg0.field2763 * arg1 >> 14;
        } else if (arg0.field2759 == 4) {
            arg0.field2767 = (arg0.field2763 * arg1 >> 14) + (arg1 - arg0.field2793) / 2;
        } else {
            arg0.field2767 = arg1 - arg0.field2793 - (arg0.field2763 * arg1 >> 14);
        }
        if (arg0.field2760 == 0) {
            arg0.field2820 = arg0.field2764;
        } else if (arg0.field2760 == 1) {
            arg0.field2820 = (arg2 - arg0.field2770) / 2 + arg0.field2764;
        } else if (arg0.field2760 == 2) {
            arg0.field2820 = arg2 - arg0.field2770 - arg0.field2764;
        } else if (arg0.field2760 == 3) {
            arg0.field2820 = arg0.field2764 * arg2 >> 14;
        } else if (arg0.field2760 == 4) {
            arg0.field2820 = (arg0.field2764 * arg2 >> 14) + (arg2 - arg0.field2770) / 2;
        } else {
            arg0.field2820 = arg2 - arg0.field2770 - (arg0.field2764 * arg2 >> 14);
        }
        if (!field497 || arg0.field2756 != 0) {
            return;
        }
        if (arg0.field2767 < 0) {
            arg0.field2767 = 0;
        } else if (arg0.field2793 + arg0.field2767 > arg1) {
            arg0.field2767 = arg1 - arg0.field2793;
        }
        if (arg0.field2820 < 0) {
            arg0.field2820 = 0;
        } else if (arg0.field2820 + arg0.field2770 > arg2) {
            arg0.field2820 = arg2 - arg0.field2770;
        }
    }

    @ObfuscatedName("fr.cg(IB)Ljava/lang/String;")
    public static final String method2905(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("d.cu(Lff;I)Z")
    public static final boolean method170(class173 arg0) {
        if (arg0.field2865 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2865.length; var1++) {
            int var2 = method1531(arg0, var1);
            int var3 = arg0.field2866[var1];
            if (arg0.field2865[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2865[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2865[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("bl.cr(Lff;II)I")
    public static final int method1531(class173 arg0, int arg1) {
        if (arg0.field2864 == null || arg1 >= arg0.field2864.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2864[arg1];
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
                    var7 = field423[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field401[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field425[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class173 var11 = class173.method2765(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method1979(var12).field1119 || field292)) {
                        for (int var13 = 0; var13 < var11.field2819.length; var13++) {
                            if (var12 + 1 == var11.field2819[var13]) {
                                var7 += var11.field2871[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class176.field2901[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class155.field2285[field401[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class176.field2901[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2040.field41;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class155.field2284[var14]) {
                            var7 += field401[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class173 var17 = class173.method2765(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method1979(var18).field1119 || field292)) {
                        for (int var19 = 0; var19 < var17.field2819.length; var19++) {
                            if (var18 + 1 == var17.field2819[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field451;
                }
                if (var6 == 12) {
                    var7 = field452;
                }
                if (var6 == 13) {
                    int var20 = class176.field2901[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class176.method701(var22);
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
                    var7 = (Statics.field2040.field854 >> 7) + Statics.field585;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2040.field808 >> 7) + Statics.field57;
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

    @ObfuscatedName("i.ca([Lff;IIIIIIII)V")
    public static final void method30(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class173 var9 = arg0[var8];
            if (var9 != null && (!var9.field2753 || var9.field2756 == 0 || var9.field2832 || method707(var9) != 0 || field505 == var9 || var9.field2882 == 1338) && var9.field2773 == arg1 && (!var9.field2753 || !method890(var9))) {
                int var10 = var9.field2767 + arg6;
                int var11 = var9.field2820 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2756 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2756 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2793 + var10;
                    int var19 = var9.field2770 + var11;
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
                    int var22 = var9.field2793 + var10;
                    int var23 = var9.field2770 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field517 == var9) {
                    field467 = true;
                    field468 = var10;
                    field444 = var11;
                }
                if (!var9.field2753 || var12 < var14 && var13 < var15) {
                    int var24 = class140.field2150;
                    int var25 = class140.field2139 * -432201367;
                    if (class140.field2144 != 0) {
                        var24 = class140.field2145;
                        var25 = class140.field2146;
                    }
                    if (var9.field2882 == 1337) {
                        if (!field298 && !field427 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field450 == 0 && !field381) {
                                method3441(class157.field2454, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class105.field1847; var28++) {
                                int var29 = class105.field1848[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field107.method1751(Statics.field1516, var30, var31, var29) >= 0) {
                                        class41 var34 = class41.method2717(var33);
                                        if (var34.field949 != null) {
                                            var34 = var34.method785();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field450 == 1) {
                                            method3441(class157.field2482, field440 + " " + class2.field26 + " " + class2.method2244(65535) + var34.field955, 1, var29, var30, var31);
                                        } else if (!field381) {
                                            String[] var35 = var34.field941;
                                            if (field457) {
                                                var35 = method1521(var35);
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
                                                        method3441(var35[var36], class2.method2244(65535) + var34.field955, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method3441(class157.field2448, class2.method2244(65535) + var34.field955, 1002, var34.field921 << 14, var30, var31);
                                        } else if ((Statics.field1049 & 0x4) == 4) {
                                            method3441(field393, field445 + " " + class2.field26 + " " + class2.method2244(65535) + var34.field955, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class35 var38 = field378[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field779.field881 == 1 && (var38.field854 & 0x7F) == 64 && (var38.field808 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field327; var39++) {
                                                class35 var40 = field378[field521[var39]];
                                                if (var40 != null && var38 != var40 && var40.field779.field881 == 1 && var38.field854 == var40.field854 && var38.field808 == var40.field808) {
                                                    method3437(var40.field779, field521[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class33.field754;
                                            int[] var42 = class33.field758;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class3 var44 = field293[var42[var43]];
                                                if (var44 != null && var38.field854 == var44.field854 && var38.field808 == var44.field808) {
                                                    method843(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method3437(var38.field779, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var45 = field293[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field854 & 0x7F) == 64 && (var45.field808 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field327; var46++) {
                                                class35 var47 = field378[field521[var46]];
                                                if (var47 != null && var47.field779.field881 == 1 && var45.field854 == var47.field854 && var45.field808 == var47.field808) {
                                                    method3437(var47.field779, field521[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class33.field754;
                                            int[] var49 = class33.field758;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class3 var51 = field293[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field854 == var51.field854 && var45.field808 == var51.field808) {
                                                    method843(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field375 == var33) {
                                            var26 = var29;
                                        } else {
                                            method843(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class199 var52 = field419[Statics.field1516][var30][var31];
                                        if (var52 != null) {
                                            for (class29 var53 = (class29) var52.method3533(); var53 != null; var53 = (class29) var52.method3523()) {
                                                class52 var54 = class52.method1979(var53.field688);
                                                if (field450 == 1) {
                                                    method3441(class157.field2482, field440 + " " + class2.field26 + " " + class2.method2244(16748608) + var54.field1145, 16, var53.field688, var30, var31);
                                                } else if (!field381) {
                                                    String[] var55 = var54.field1120;
                                                    if (field457) {
                                                        var55 = method1521(var55);
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
                                                            method3441(var55[var56], class2.method2244(16748608) + var54.field1145, var57, var53.field688, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method3441(class157.field2299, class2.method2244(16748608) + var54.field1145, 20, var53.field688, var30, var31);
                                                        }
                                                    }
                                                    method3441(class157.field2448, class2.method2244(16748608) + var54.field1145, 1004, var53.field688, var30, var31);
                                                } else if ((Statics.field1049 & 0x1) == 1) {
                                                    method3441(field393, field445 + " " + class2.field26 + " " + class2.method2244(16748608) + var54.field1145, 17, var53.field688, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class3 var60 = field293[field375];
                                method843(var60, field375, var58, var59);
                            }
                        }
                    } else if (var9.field2882 != 1338) {
                        if (!field427 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var75 = var24 - var10;
                            int var76 = var25 - var11;
                            if (var9.field2768 == 1) {
                                method3441(var9.field2869, "", 24, 0, 0, var9.field2769);
                            }
                            if (var9.field2768 == 2 && !field381) {
                                int var77 = method707(var9);
                                int var78 = var77 >> 11 & 0x3F;
                                String var79;
                                if (var78 == 0) {
                                    var79 = null;
                                } else if (var9.field2795 == null || var9.field2795.trim().length() == 0) {
                                    var79 = null;
                                } else {
                                    var79 = var9.field2795;
                                }
                                if (var79 != null) {
                                    method3441(var79, class2.method2244(65280) + var9.field2839, 25, 0, -1, var9.field2769);
                                }
                            }
                            if (var9.field2768 == 3) {
                                method3441(class157.field2541, "", 26, 0, 0, var9.field2769);
                            }
                            if (var9.field2768 == 4) {
                                method3441(var9.field2869, "", 28, 0, 0, var9.field2769);
                            }
                            if (var9.field2768 == 5) {
                                method3441(var9.field2869, "", 29, 0, 0, var9.field2769);
                            }
                            if (var9.field2768 == 6 && field300 == null) {
                                method3441(var9.field2869, "", 30, 0, -1, var9.field2769);
                            }
                            if (var9.field2756 == 2) {
                                int var81 = 0;
                                for (int var82 = 0; var82 < var9.field2770; var82++) {
                                    for (int var83 = 0; var83 < var9.field2793; var83++) {
                                        int var84 = (var9.field2818 + 32) * var83;
                                        int var85 = (var9.field2746 + 32) * var82;
                                        if (var81 < 20) {
                                            var84 += var9.field2876[var81];
                                            var85 += var9.field2821[var81];
                                        }
                                        if (var75 >= var84 && var76 >= var85 && var75 < var84 + 32 && var76 < var85 + 32) {
                                            field404 = var81;
                                            Statics.field1364 = var9;
                                            if (var9.field2819[var81] > 0) {
                                                class52 var86 = class52.method1979(var9.field2819[var81] - 1);
                                                if (field450 == 1 && class178.method699(method707(var9))) {
                                                    if (Statics.field1212 != var9.field2769 || Statics.field13 != var81) {
                                                        method3441(class157.field2482, field440 + " " + class2.field26 + " " + class2.method2244(16748608) + var86.field1145, 31, var86.field1112, var81, var9.field2769);
                                                    }
                                                } else if (!field381 || !class178.method699(method707(var9))) {
                                                    String[] var87 = var86.field1121;
                                                    if (field457) {
                                                        var87 = method1521(var87);
                                                    }
                                                    if (class178.method699(method707(var9))) {
                                                        for (int var88 = 4; var88 >= 3; var88--) {
                                                            if (var87 != null && var87[var88] != null) {
                                                                byte var89;
                                                                if (var88 == 3) {
                                                                    var89 = 36;
                                                                } else {
                                                                    var89 = 37;
                                                                }
                                                                method3441(var87[var88], class2.method2244(16748608) + var86.field1145, var89, var86.field1112, var81, var9.field2769);
                                                            } else if (var88 == 4) {
                                                                method3441(class157.field2300, class2.method2244(16748608) + var86.field1145, 37, var86.field1112, var81, var9.field2769);
                                                            }
                                                        }
                                                    }
                                                    if (class178.method2872(method707(var9))) {
                                                        method3441(class157.field2482, class2.method2244(16748608) + var86.field1145, 38, var86.field1112, var81, var9.field2769);
                                                    }
                                                    if (class178.method699(method707(var9)) && var87 != null) {
                                                        for (int var90 = 2; var90 >= 0; var90--) {
                                                            if (var87[var90] != null) {
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
                                                                method3441(var87[var90], class2.method2244(16748608) + var86.field1145, var91, var86.field1112, var81, var9.field2769);
                                                            }
                                                        }
                                                    }
                                                    String[] var92 = var9.field2823;
                                                    if (field457) {
                                                        var92 = method1521(var92);
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
                                                                method3441(var92[var93], class2.method2244(16748608) + var86.field1145, var94, var86.field1112, var81, var9.field2769);
                                                            }
                                                        }
                                                    }
                                                    method3441(class157.field2448, class2.method2244(16748608) + var86.field1145, 1005, var86.field1112, var81, var9.field2769);
                                                } else if ((Statics.field1049 & 0x10) == 16) {
                                                    method3441(field393, field445 + " " + class2.field26 + " " + class2.method2244(16748608) + var86.field1145, 32, var86.field1112, var81, var9.field2769);
                                                }
                                            }
                                        }
                                        var81++;
                                    }
                                }
                            }
                            if (var9.field2753) {
                                if (!field381) {
                                    for (int var95 = 9; var95 >= 5; var95--) {
                                        String var96 = method139(var9, var95);
                                        if (var96 != null) {
                                            method3441(var96, var9.field2825, 1007, var95 + 1, var9.field2755, var9.field2769);
                                        }
                                    }
                                    int var97 = method707(var9);
                                    int var98 = var97 >> 11 & 0x3F;
                                    String var99;
                                    if (var98 == 0) {
                                        var99 = null;
                                    } else if (var9.field2795 == null || var9.field2795.trim().length() == 0) {
                                        var99 = null;
                                    } else {
                                        var99 = var9.field2795;
                                    }
                                    if (var99 != null) {
                                        method3441(var99, var9.field2825, 25, 0, var9.field2755, var9.field2769);
                                    }
                                    for (int var101 = 4; var101 >= 0; var101--) {
                                        String var102 = method139(var9, var101);
                                        if (var102 != null) {
                                            method3441(var102, var9.field2825, 57, var101 + 1, var9.field2755, var9.field2769);
                                        }
                                    }
                                    int var103 = method707(var9);
                                    boolean var104 = (var103 & 0x1) != 0;
                                    if (var104) {
                                        method3441(class157.field2304, "", 30, 0, var9.field2755, var9.field2769);
                                    }
                                } else if (class178.method1019(method707(var9)) && (Statics.field1049 & 0x20) == 32) {
                                    method3441(field393, field445 + " " + class2.field26 + " " + var9.field2825, 58, 0, var9.field2755, var9.field2769);
                                }
                            }
                        }
                        if (var9.field2756 == 0) {
                            if (!var9.field2753 && method890(var9) && Statics.field2985 != var9) {
                                continue;
                            }
                            method30(arg0, var9.field2769, var12, var13, var14, var15, var10 - var9.field2776, var11 - var9.field2751);
                            if (var9.field2886 != null) {
                                method30(var9.field2886, var9.field2769, var12, var13, var14, var15, var10 - var9.field2776, var11 - var9.field2751);
                            }
                            class4 var105 = (class4) field447.method3482((long) var9.field2769);
                            if (var105 != null) {
                                if (var105.field66 == 0 && class140.field2150 >= var12 && class140.field2139 * -432201367 >= var13 && class140.field2150 < var14 && class140.field2139 * -432201367 < var15 && !field427 && !field497) {
                                    for (class1 var106 = (class1) field486.method3520(); var106 != null; var106 = (class1) field486.method3522()) {
                                        if (var106.field2) {
                                            var106.method3605();
                                            var106.field3.field2853 = false;
                                        }
                                    }
                                    if (Statics.field1431 == 0) {
                                        field517 = null;
                                        field505 = null;
                                    }
                                    if (!field427) {
                                        field433[0] = class157.field2535;
                                        field434[0] = "";
                                        field431[0] = 1006;
                                        field400 = 1;
                                    }
                                }
                                int var107 = var105.field65;
                                if (class173.method2229(var107)) {
                                    method30(Statics.field2807[var107], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2753) {
                            if (var9.field2885) {
                                if (class140.field2150 >= var12 && class140.field2139 * -432201367 >= var13 && class140.field2150 < var14 && class140.field2139 * -432201367 < var15) {
                                    for (class1 var108 = (class1) field486.method3520(); var108 != null; var108 = (class1) field486.method3522()) {
                                        if (var108.field2) {
                                            var108.method3605();
                                            var108.field3.field2853 = false;
                                        }
                                    }
                                    if (Statics.field1431 == 0) {
                                        field517 = null;
                                        field505 = null;
                                    }
                                    if (!field427) {
                                        field433[0] = class157.field2535;
                                        field434[0] = "";
                                        field431[0] = 1006;
                                        field400 = 1;
                                    }
                                }
                            } else if (var9.field2837 && class140.field2150 >= var12 && class140.field2139 * -432201367 >= var13 && class140.field2150 < var14 && class140.field2139 * -432201367 < var15) {
                                for (class1 var109 = (class1) field486.method3520(); var109 != null; var109 = (class1) field486.method3522()) {
                                    if (var109.field2 && var109.field3.field2812 == var109.field4) {
                                        var109.method3605();
                                    }
                                }
                            }
                            boolean var110;
                            if (class140.field2150 >= var12 && class140.field2139 * -432201367 >= var13 && class140.field2150 < var14 && class140.field2139 * -432201367 < var15) {
                                var110 = true;
                            } else {
                                var110 = false;
                            }
                            boolean var111 = false;
                            if ((class140.field2137 == 1 || !Statics.field1037 && class140.field2137 == 4) && var110) {
                                var111 = true;
                            }
                            boolean var112 = false;
                            if ((class140.field2144 == 1 || !Statics.field1037 && class140.field2144 == 4) && class140.field2145 >= var12 && class140.field2146 >= var13 && class140.field2145 < var14 && class140.field2146 < var15) {
                                var112 = true;
                            }
                            if (var112) {
                                method3164(var9, class140.field2145 - var10, class140.field2146 - var11);
                            }
                            if (field517 != null && field517 != var9 && var110 && class178.method2890(method707(var9))) {
                                field463 = var9;
                            }
                            if (field505 == var9) {
                                field414 = true;
                                field465 = var10;
                                field466 = var11;
                            }
                            if (var9.field2832) {
                                if (var110 && field485 != 0 && var9.field2812 != null) {
                                    class1 var113 = new class1();
                                    var113.field2 = true;
                                    var113.field3 = var9;
                                    var113.field5 = field485;
                                    var113.field4 = var9.field2812;
                                    field486.method3515(var113);
                                }
                                if (field517 != null || Statics.field1551 != null || field427) {
                                    var112 = false;
                                    var111 = false;
                                    var110 = false;
                                }
                                if (!var9.field2878 && var112) {
                                    var9.field2878 = true;
                                    if (var9.field2834 != null) {
                                        class1 var114 = new class1();
                                        var114.field2 = true;
                                        var114.field3 = var9;
                                        var114.field19 = class140.field2145 - var10;
                                        var114.field5 = class140.field2146 - var11;
                                        var114.field4 = var9.field2834;
                                        field486.method3515(var114);
                                    }
                                }
                                if (var9.field2878 && var111 && var9.field2835 != null) {
                                    class1 var115 = new class1();
                                    var115.field2 = true;
                                    var115.field3 = var9;
                                    var115.field19 = class140.field2150 - var10;
                                    var115.field5 = class140.field2139 * -432201367 - var11;
                                    var115.field4 = var9.field2835;
                                    field486.method3515(var115);
                                }
                                if (var9.field2878 && !var111) {
                                    var9.field2878 = false;
                                    if (var9.field2860 != null) {
                                        class1 var116 = new class1();
                                        var116.field2 = true;
                                        var116.field3 = var9;
                                        var116.field19 = class140.field2150 - var10;
                                        var116.field5 = class140.field2139 * -432201367 - var11;
                                        var116.field4 = var9.field2860;
                                        field346.method3515(var116);
                                    }
                                }
                                if (var111 && var9.field2849 != null) {
                                    class1 var117 = new class1();
                                    var117.field2 = true;
                                    var117.field3 = var9;
                                    var117.field19 = class140.field2150 - var10;
                                    var117.field5 = class140.field2139 * -432201367 - var11;
                                    var117.field4 = var9.field2849;
                                    field486.method3515(var117);
                                }
                                if (!var9.field2853 && var110) {
                                    var9.field2853 = true;
                                    if (var9.field2791 != null) {
                                        class1 var118 = new class1();
                                        var118.field2 = true;
                                        var118.field3 = var9;
                                        var118.field19 = class140.field2150 - var10;
                                        var118.field5 = class140.field2139 * -432201367 - var11;
                                        var118.field4 = var9.field2791;
                                        field486.method3515(var118);
                                    }
                                }
                                if (var9.field2853 && var110 && var9.field2765 != null) {
                                    class1 var119 = new class1();
                                    var119.field2 = true;
                                    var119.field3 = var9;
                                    var119.field19 = class140.field2150 - var10;
                                    var119.field5 = class140.field2139 * -432201367 - var11;
                                    var119.field4 = var9.field2765;
                                    field486.method3515(var119);
                                }
                                if (var9.field2853 && !var110) {
                                    var9.field2853 = false;
                                    if (var9.field2840 != null) {
                                        class1 var120 = new class1();
                                        var120.field2 = true;
                                        var120.field3 = var9;
                                        var120.field19 = class140.field2150 - var10;
                                        var120.field5 = class140.field2139 * -432201367 - var11;
                                        var120.field4 = var9.field2840;
                                        field346.method3515(var120);
                                    }
                                }
                                if (var9.field2851 != null) {
                                    class1 var121 = new class1();
                                    var121.field3 = var9;
                                    var121.field4 = var9.field2851;
                                    field487.method3515(var121);
                                }
                                if (var9.field2845 != null && field473 > var9.field2880) {
                                    if (var9.field2846 == null || field473 - var9.field2880 > 32) {
                                        class1 var126 = new class1();
                                        var126.field3 = var9;
                                        var126.field4 = var9.field2845;
                                        field486.method3515(var126);
                                    } else {
                                        label1014: for (int var122 = var9.field2880; var122 < field473; var122++) {
                                            int var123 = field472[var122 & 0x1F];
                                            for (int var124 = 0; var124 < var9.field2846.length; var124++) {
                                                if (var9.field2846[var124] == var123) {
                                                    class1 var125 = new class1();
                                                    var125.field3 = var9;
                                                    var125.field4 = var9.field2845;
                                                    field486.method3515(var125);
                                                    break label1014;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2880 = field473;
                                }
                                if (var9.field2758 != null && field475 > var9.field2750) {
                                    if (var9.field2848 == null || field475 - var9.field2750 > 32) {
                                        class1 var131 = new class1();
                                        var131.field3 = var9;
                                        var131.field4 = var9.field2758;
                                        field486.method3515(var131);
                                    } else {
                                        label990: for (int var127 = var9.field2750; var127 < field475; var127++) {
                                            int var128 = field474[var127 & 0x1F];
                                            for (int var129 = 0; var129 < var9.field2848.length; var129++) {
                                                if (var9.field2848[var129] == var128) {
                                                    class1 var130 = new class1();
                                                    var130.field3 = var9;
                                                    var130.field4 = var9.field2758;
                                                    field486.method3515(var130);
                                                    break label990;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2750 = field475;
                                }
                                if (var9.field2857 != null && field477 > var9.field2799) {
                                    if (var9.field2817 == null || field477 - var9.field2799 > 32) {
                                        class1 var136 = new class1();
                                        var136.field3 = var9;
                                        var136.field4 = var9.field2857;
                                        field486.method3515(var136);
                                    } else {
                                        label966: for (int var132 = var9.field2799; var132 < field477; var132++) {
                                            int var133 = field364[var132 & 0x1F];
                                            for (int var134 = 0; var134 < var9.field2817.length; var134++) {
                                                if (var9.field2817[var134] == var133) {
                                                    class1 var135 = new class1();
                                                    var135.field3 = var9;
                                                    var135.field4 = var9.field2857;
                                                    field486.method3515(var135);
                                                    break label966;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2799 = field477;
                                }
                                if (field344 > var9.field2879 && var9.field2854 != null) {
                                    class1 var137 = new class1();
                                    var137.field3 = var9;
                                    var137.field4 = var9.field2854;
                                    field486.method3515(var137);
                                }
                                if (field479 > var9.field2879 && var9.field2856 != null) {
                                    class1 var138 = new class1();
                                    var138.field3 = var9;
                                    var138.field4 = var9.field2856;
                                    field486.method3515(var138);
                                }
                                if (field343 > var9.field2879 && var9.field2844 != null) {
                                    class1 var139 = new class1();
                                    var139.field3 = var9;
                                    var139.field4 = var9.field2844;
                                    field486.method3515(var139);
                                }
                                if (field432 > var9.field2879 && var9.field2788 != null) {
                                    class1 var140 = new class1();
                                    var140.field3 = var9;
                                    var140.field4 = var9.field2788;
                                    field486.method3515(var140);
                                }
                                if (field482 > var9.field2879 && var9.field2831 != null) {
                                    class1 var141 = new class1();
                                    var141.field3 = var9;
                                    var141.field4 = var9.field2831;
                                    field486.method3515(var141);
                                }
                                if (field483 > var9.field2879 && var9.field2858 != null) {
                                    class1 var142 = new class1();
                                    var142.field3 = var9;
                                    var142.field4 = var9.field2858;
                                    field486.method3515(var142);
                                }
                                var9.field2879 = field549;
                                if (var9.field2855 != null) {
                                    for (int var143 = 0; var143 < field510; var143++) {
                                        class1 var144 = new class1();
                                        var144.field3 = var9;
                                        var144.field9 = field512[var143];
                                        var144.field7 = field534[var143];
                                        var144.field4 = var9.field2855;
                                        field486.method3515(var144);
                                    }
                                }
                            }
                        }
                        if (!var9.field2753 && field517 == null && Statics.field1551 == null && !field427) {
                            if ((var9.field2867 >= 0 || var9.field2781 != 0) && class140.field2150 >= var12 && class140.field2139 * -432201367 >= var13 && class140.field2150 < var14 && class140.field2139 * -432201367 < var15) {
                                if (var9.field2867 >= 0) {
                                    Statics.field2985 = arg0[var9.field2867];
                                } else {
                                    Statics.field2985 = var9;
                                }
                            }
                            if (var9.field2756 == 8 && class140.field2150 >= var12 && class140.field2139 * -432201367 >= var13 && class140.field2150 < var14 && class140.field2139 * -432201367 < var15) {
                                Statics.field2149 = var9;
                            }
                            if (var9.field2778 > var9.field2770) {
                                int var145 = var9.field2793 + var10;
                                int var146 = var9.field2770;
                                int var147 = var9.field2778;
                                int var148 = class140.field2150;
                                int var149 = class140.field2139 * -432201367;
                                if (field369) {
                                    field519 = 32;
                                } else {
                                    field519 = 0;
                                }
                                field369 = false;
                                if (class140.field2137 == 1 || !Statics.field1037 && class140.field2137 == 4) {
                                    if (var148 >= var145 && var148 < var145 + 16 && var149 >= var11 && var149 < var11 + 16) {
                                        var9.field2751 -= 4;
                                        Statics.method572(var9);
                                    } else if (var148 >= var145 && var148 < var145 + 16 && var149 >= var11 + var146 - 16 && var149 < var11 + var146) {
                                        var9.field2751 += 4;
                                        Statics.method572(var9);
                                    } else if (var148 >= var145 - field519 && var148 < field519 + var145 + 16 && var149 >= var11 + 16 && var149 < var11 + var146 - 16) {
                                        int var150 = (var146 - 32) * var146 / var147;
                                        if (var150 < 8) {
                                            var150 = 8;
                                        }
                                        int var151 = var149 - var11 - 16 - var150 / 2;
                                        int var152 = var146 - 32 - var150;
                                        var9.field2751 = (var147 - var146) * var151 / var152;
                                        Statics.method572(var9);
                                        field369 = true;
                                    }
                                }
                                if (field485 != 0) {
                                    int var153 = var9.field2793;
                                    if (var148 >= var145 - var153 && var149 >= var11 && var148 < var145 + 16 && var149 <= var11 + var146) {
                                        var9.field2751 += field485 * 45;
                                        Statics.method572(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field523 == 0 || field523 == 3) && (class140.field2144 == 1 || !Statics.field1037 && class140.field2144 == 4)) {
                        class175 var61 = var9.method3112(true);
                        if (var61 != null) {
                            int var62 = class140.field2145 - var10;
                            int var63 = class140.field2146 - var11;
                            if (var61.method3152(var62, var63)) {
                                int var64 = var62 - var61.field2896 / 2;
                                int var65 = var63 - var61.field2895 / 2;
                                int var66 = field372 + field359 & 0x7FF;
                                int var67 = class91.field1579[var66];
                                int var68 = class91.field1580[var66];
                                int var69 = (field361 + 256) * var67 >> 8;
                                int var70 = (field361 + 256) * var68 >> 8;
                                int var71 = var64 * var70 + var65 * var69 >> 11;
                                int var72 = var65 * var70 - var64 * var69 >> 11;
                                int var73 = Statics.field2040.field854 + var71 >> 7;
                                int var74 = Statics.field2040.field808 - var72 >> 7;
                                field331.method2555(254);
                                field331.method2347(18);
                                field331.method2323(Statics.field585 + var73);
                                field331.method2347(class137.field2112[82] ? (class137.field2112[81] ? 2 : 1) : 0);
                                field331.method2318(Statics.field57 + var74);
                                field331.method2347(var64);
                                field331.method2347(var65);
                                field331.method2318(field372);
                                field331.method2347(57);
                                field331.method2347(field359);
                                field331.method2347(field361);
                                field331.method2347(89);
                                field331.method2318(Statics.field2040.field854);
                                field331.method2318(Statics.field2040.field808);
                                field331.method2347(63);
                                field469 = var73;
                                field480 = var74;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("j.cs([Lff;IB)V")
    public static final void method221(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2756 == 0) {
                    if (var3.field2886 != null) {
                        method221(var3.field2886, arg1);
                    }
                    class4 var4 = (class4) field447.method3482((long) var3.field2769);
                    if (var4 != null) {
                        int var5 = var4.field65;
                        if (class173.method2229(var5)) {
                            method221(Statics.field2807[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2859 != null) {
                    class1 var6 = new class1();
                    var6.field3 = var3;
                    var6.field4 = var3.field2859;
                    class37.method3091(var6, 200000);
                }
                if (arg1 == 1 && var3.field2814 != null) {
                    if (var3.field2755 >= 0) {
                        class173 var7 = class173.method2765(var3.field2769);
                        if (var7 == null || var7.field2886 == null || var3.field2755 >= var7.field2886.length || var7.field2886[var3.field2755] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field3 = var3;
                    var8.field4 = var3.field2814;
                    class37.method3091(var8, 200000);
                }
            }
        }
    }

    @ObfuscatedName("fz.cm(Lff;III)V")
    public static final void method3164(class173 arg0, int arg1, int arg2) {
        if (field517 != null || field427 || arg0 == null || method51(arg0) == null) {
            return;
        }
        field517 = arg0;
        field505 = method51(arg0);
        field461 = arg1;
        field462 = arg2;
        Statics.field1431 = 0;
        field470 = false;
        if (field400 <= 0) {
            return;
        }
        int var3 = field400 - 1;
        Statics.field2727 = new class31();
        Statics.field2727.field707 = field429[var3];
        Statics.field2727.field708 = field430[var3];
        Statics.field2727.field709 = field431[var3];
        Statics.field2727.field710 = field537[var3];
        Statics.field2727.field711 = field433[var3];
    }

    @ObfuscatedName("cu.cz(I)V")
    public static final void method1975() {
        Statics.method572(field517);
        Statics.field1431++;
        if (field467 && field414) {
            int var0 = class140.field2150;
            int var1 = class140.field2139 * -432201367;
            int var2 = var0 - field461;
            int var3 = var1 - field462;
            if (var2 < field465) {
                var2 = field465;
            }
            if (field517.field2793 + var2 > field465 + field505.field2793) {
                var2 = field465 + field505.field2793 - field517.field2793;
            }
            if (var3 < field466) {
                var3 = field466;
            }
            if (field517.field2770 + var3 > field466 + field505.field2770) {
                var3 = field466 + field505.field2770 - field517.field2770;
            }
            int var4 = var2 - field468;
            int var5 = var3 - field444;
            int var6 = field517.field2838;
            if (Statics.field1431 > field517.field2829 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field470 = true;
            }
            int var7 = field505.field2776 + (var2 - field465);
            int var8 = field505.field2751 + (var3 - field466);
            if (field517.field2785 != null && field470) {
                class1 var9 = new class1();
                var9.field3 = field517;
                var9.field19 = var7;
                var9.field5 = var8;
                var9.field4 = field517.field2785;
                class37.method3091(var9, 200000);
            }
            if (class140.field2137 == 0) {
                if (field470) {
                    if (field517.field2842 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field517;
                        var10.field19 = var7;
                        var10.field5 = var8;
                        var10.field1 = field463;
                        var10.field4 = field517.field2842;
                        class37.method3091(var10, 200000);
                    }
                    if (field463 != null) {
                        class173 var11 = field517;
                        int var12 = class178.method2230(method707(var11));
                        class173 var13;
                        if (var12 == 0) {
                            var13 = null;
                        } else {
                            int var14 = 0;
                            while (true) {
                                if (var14 >= var12) {
                                    var13 = var11;
                                    break;
                                }
                                var11 = class173.method2765(var11.field2773);
                                if (var11 == null) {
                                    var13 = null;
                                    break;
                                }
                                var14++;
                            }
                        }
                        if (var13 != null) {
                            field331.method2555(72);
                            field331.method2476(field517.field2755);
                            field331.method2323(field517.field2872);
                            field331.method2421(field517.field2769);
                            field331.method2318(field463.field2755);
                            field331.method2476(field463.field2872);
                            field331.method2421(field463.field2769);
                        }
                    }
                } else if ((field464 == 1 || method1108(field400 - 1)) && field400 > 2) {
                    method171(field468 + field461, field462 + field444);
                } else if (field400 > 0) {
                    int var15 = field468 + field461;
                    int var16 = field462 + field444;
                    class31 var17 = Statics.field2727;
                    method730(var17.field707, var17.field708, var17.field709, var17.field710, var17.field711, var17.field711, var15, var16);
                    Statics.field2727 = null;
                }
                field517 = null;
            }
        } else if (Statics.field1431 > 1) {
            field517 = null;
        }
    }

    @ObfuscatedName("bk.ck(B)V")
    public static void method1513() {
        for (class4 var0 = (class4) field447.method3486(); var0 != null; var0 = (class4) field447.method3484()) {
            int var1 = var0.field65;
            if (class173.method2229(var1)) {
                boolean var2 = true;
                class173[] var3 = Statics.field2807[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2753;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3097;
                    class173 var6 = class173.method2765(var5);
                    if (var6 != null) {
                        Statics.method572(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("u.cf(Lff;I)Lff;")
    public static class173 method51(class173 arg0) {
        class173 var1 = arg0;
        int var2 = class178.method2230(method707(arg0));
        class173 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = class173.method2765(var1.field2773);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class173 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2827;
        }
        return var5;
    }

    @ObfuscatedName("bk.ci([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method1521(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("j.cx(II)V")
    public static final void method197(int arg0) {
        if (!class173.method2229(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2807[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3 != null) {
                var3.field2874 = 0;
                var3.field2875 = 0;
            }
        }
    }

    @ObfuscatedName("m.cw([Lff;II)V")
    public static final void method83(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null && var3.field2773 == arg1 && (!var3.field2753 || !method890(var3))) {
                if (var3.field2756 == 0) {
                    if (!var3.field2753 && method890(var3) && Statics.field2985 != var3) {
                        continue;
                    }
                    method83(arg0, var3.field2769);
                    if (var3.field2886 != null) {
                        method83(var3.field2886, var3.field2769);
                    }
                    class4 var4 = (class4) field447.method3482((long) var3.field2769);
                    if (var4 != null) {
                        int var5 = var4.field65;
                        if (class173.method2229(var5)) {
                            method83(Statics.field2807[var5], -1);
                        }
                    }
                }
                if (var3.field2756 == 6) {
                    if (var3.field2754 != -1 || var3.field2786 != -1) {
                        boolean var6 = method170(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2786;
                        } else {
                            var7 = var3.field2754;
                        }
                        if (var7 != -1) {
                            class43 var8 = class43.method3081(var7);
                            var3.field2875 += field352;
                            while (var3.field2875 > var8.field980[var3.field2874]) {
                                var3.field2875 -= var8.field980[var3.field2874];
                                var3.field2874++;
                                if (var3.field2874 >= var8.field978.length) {
                                    var3.field2874 -= var8.field974;
                                    if (var3.field2874 < 0 || var3.field2874 >= var8.field978.length) {
                                        var3.field2874 = 0;
                                    }
                                }
                                Statics.method572(var3);
                            }
                        }
                    }
                    if (var3.field2808 != 0 && !var3.field2753) {
                        int var9 = var3.field2808 >> 16;
                        int var10 = var3.field2808 << 16 >> 16;
                        int var11 = field352 * var9;
                        int var12 = field352 * var10;
                        var3.field2803 = var3.field2803 + var11 & 0x7FF;
                        var3.field2804 = var3.field2804 + var12 & 0x7FF;
                        Statics.method572(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dg.dm(II)V")
    public static final void method2218(int arg0) {
        method1513();
        class24.method696();
        int var1 = class53.method2783(arg0).field1153;
        if (var1 == 0) {
            return;
        }
        int var2 = class176.field2901[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class91.method1920(0.9D);
                ((class95) Statics.field1576).method1982(0.9D);
            }
            if (var2 == 2) {
                class91.method1920(0.8D);
                ((class95) Statics.field1576).method1982(0.8D);
            }
            if (var2 == 3) {
                class91.method1920(0.7D);
                ((class95) Statics.field1576).method1982(0.7D);
            }
            if (var2 == 4) {
                class91.method1920(0.6D);
                ((class95) Statics.field1576).method1982(0.6D);
            }
            class52.field1136.method3452();
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
            if (field357 != var3) {
                if (field357 == 0 && field525 != -1) {
                    class183.method3076(Statics.field2658, field525, 0, var3, false);
                    field320 = false;
                } else if (var3 == 0) {
                    Statics.field3197.method3320();
                    class183.field2946 = 1;
                    Statics.field714 = null;
                    field320 = false;
                } else {
                    class183.method1976(var3);
                }
                field357 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field527 = 127;
            }
            if (var2 == 1) {
                field527 = 96;
            }
            if (var2 == 2) {
                field527 = 64;
            }
            if (var2 == 3) {
                field527 = 32;
            }
            if (var2 == 4) {
                field527 = 0;
            }
        }
        if (var1 == 5) {
            field464 = var2;
        }
        if (var1 == 6) {
            field448 = var2;
        }
        if (var1 == 9) {
            field449 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field528 = 127;
            }
            if (var2 == 1) {
                field528 = 96;
            }
            if (var2 == 2) {
                field528 = 64;
            }
            if (var2 == 3) {
                field528 = 32;
            }
            if (var2 == 4) {
                field528 = 0;
            }
        }
        if (var1 == 17) {
            field446 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field315 = (class21) class109.method787(class21.method40(), var2);
            if (field315 == null) {
                field315 = class21.field574;
            }
        }
        if (var1 != 19) {
            return;
        }
        if (var2 == -1) {
            field375 = -1;
        } else {
            field375 = var2 & 0x7FF;
        }
    }

    @ObfuscatedName("cs.ds(Lff;I)V")
    public static final void method1993(class173 arg0) {
        int var1 = arg0.field2882;
        if (var1 == 324) {
            if (field561 == -1) {
                field561 = arg0.field2787;
                field562 = arg0.field2868;
            }
            if (field493.field2912) {
                arg0.field2787 = field561;
            } else {
                arg0.field2787 = field562;
            }
        } else if (var1 == 325) {
            if (field561 == -1) {
                field561 = arg0.field2787;
                field562 = arg0.field2868;
            }
            if (field493.field2912) {
                arg0.field2787 = field562;
            } else {
                arg0.field2787 = field561;
            }
        } else if (var1 == 327) {
            arg0.field2803 = 150;
            arg0.field2804 = (int) (Math.sin((double) field299 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2870 = 5;
            arg0.field2796 = 0;
        } else if (var1 == 328) {
            arg0.field2803 = 150;
            arg0.field2804 = (int) (Math.sin((double) field299 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2870 = 5;
            arg0.field2796 = 1;
        }
    }

    @ObfuscatedName("g.dz(Lh;ZI)V")
    public static final void method110(class4 arg0, boolean arg1) {
        int var2 = arg0.field65;
        int var3 = (int) arg0.field3097;
        arg0.method3605();
        if (arg1) {
            class173.method140(var2);
        }
        for (class201 var4 = (class201) field395.method3486(); var4 != null; var4 = (class201) field395.method3484()) {
            if ((long) var2 == (var4.field3097 >> 48 & 0xFFFFL)) {
                var4.method3605();
            }
        }
        class173 var5 = class173.method2765(var3);
        if (var5 != null) {
            Statics.method572(var5);
        }
        method1895();
        if (field392 != -1) {
            int var6 = field392;
            if (class173.method2229(var6)) {
                method221(Statics.field2807[var6], 1);
            }
        }
    }

    @ObfuscatedName("am.df(Lff;I)Z")
    public static final boolean method664(class173 arg0) {
        int var1 = arg0.field2882;
        if (var1 == 205) {
            field526 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field493.method3218(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field493.method3192(var4, var5 == 1);
        }
        if (var1 == 324) {
            field493.method3206(false);
        }
        if (var1 == 325) {
            field493.method3206(true);
        }
        if (var1 == 326) {
            field331.method2555(192);
            field493.method3194(field331);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ca.dh(Lff;IIII)V")
    public static final void method1992(class173 arg0, int arg1, int arg2, int arg3) {
        method1973();
        class175 var4 = arg0.method3112(false);
        if (var4 == null) {
            return;
        }
        class80.method1633(arg1, arg2, var4.field2896 + arg1, var4.field2895 + arg2);
        if (field523 == 2 || field523 == 5) {
            class80.method1648(arg1, arg2, 0, var4.field2898, var4.field2897);
        } else {
            int var5 = field372 + field359 & 0x7FF;
            int var6 = Statics.field2040.field854 / 32 + 48;
            int var7 = 464 - Statics.field2040.field808 / 32;
            Statics.field2279.method1558(arg1, arg2, var4.field2896, var4.field2895, var6, var7, var5, field361 + 256, var4.field2898, var4.field2897);
            for (int var8 = 0; var8 < field569; var8++) {
                int var9 = field396[var8] * 4 + 2 - Statics.field2040.field854 / 32;
                int var10 = field370[var8] * 4 + 2 - Statics.field2040.field808 / 32;
                method1998(arg1, arg2, var9, var10, field520[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class199 var13 = field419[Statics.field1516][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field2040.field854 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field2040.field808 / 32;
                        method1998(arg1, arg2, var14, var15, Statics.field3154[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field327; var16++) {
                class35 var17 = field378[field521[var16]];
                if (var17 != null && var17.method22()) {
                    class40 var18 = var17.field779;
                    if (var18 != null && var18.field894 != null) {
                        var18 = var18.method735();
                    }
                    if (var18 != null && var18.field908 && var18.field889) {
                        int var19 = var17.field854 / 32 - Statics.field2040.field854 / 32;
                        int var20 = var17.field808 / 32 - Statics.field2040.field808 / 32;
                        method1998(arg1, arg2, var19, var20, Statics.field3154[1], var4);
                    }
                }
            }
            int var21 = class33.field754;
            int[] var22 = class33.field758;
            for (int var23 = 0; var23 < var21; var23++) {
                class3 var24 = field293[var22[var23]];
                if (var24 != null && var24.method22() && !var24.field56 && Statics.field2040 != var24) {
                    int var25 = var24.field854 / 32 - Statics.field2040.field854 / 32;
                    int var26 = var24.field808 / 32 - Statics.field2040.field808 / 32;
                    boolean var27 = false;
                    if (method2786(var24.field44, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field30; var29++) {
                        if (var24.field44.equals(Statics.field155[var29].field633)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field2040.field55 != 0 && var24.field55 != 0 && Statics.field2040.field55 == var24.field55) {
                        var30 = true;
                    }
                    if (var27) {
                        method1998(arg1, arg2, var25, var26, Statics.field3154[3], var4);
                    } else if (var30) {
                        method1998(arg1, arg2, var25, var26, Statics.field3154[4], var4);
                    } else if (var28) {
                        method1998(arg1, arg2, var25, var26, Statics.field3154[5], var4);
                    } else {
                        method1998(arg1, arg2, var25, var26, Statics.field3154[2], var4);
                    }
                }
            }
            if (field307 != 0 && field299 % 20 < 10) {
                if (field307 == 1 && field308 >= 0 && field308 < field378.length) {
                    class35 var31 = field378[field308];
                    if (var31 != null) {
                        int var32 = var31.field854 / 32 - Statics.field2040.field854 / 32;
                        int var33 = var31.field808 / 32 - Statics.field2040.field808 / 32;
                        method630(arg1, arg2, var32, var33, Statics.field2161[1], var4);
                    }
                }
                if (field307 == 2) {
                    int var34 = field310 * 4 - Statics.field585 * 4 + 2 - Statics.field2040.field854 / 32;
                    int var35 = field311 * 4 - Statics.field57 * 4 + 2 - Statics.field2040.field808 / 32;
                    method630(arg1, arg2, var34, var35, Statics.field2161[1], var4);
                }
                if (field307 == 10 && field379 >= 0 && field379 < field293.length) {
                    class3 var36 = field293[field379];
                    if (var36 != null) {
                        int var37 = var36.field854 / 32 - Statics.field2040.field854 / 32;
                        int var38 = var36.field808 / 32 - Statics.field2040.field808 / 32;
                        method630(arg1, arg2, var37, var38, Statics.field2161[1], var4);
                    }
                }
            }
            if (field469 != 0) {
                int var39 = field469 * 4 + 2 - Statics.field2040.field854 / 32;
                int var40 = field480 * 4 + 2 - Statics.field2040.field808 / 32;
                method1998(arg1, arg2, var39, var40, Statics.field2161[0], var4);
            }
            if (!Statics.field2040.field56) {
                class80.method1665(var4.field2896 / 2 + arg1 - 1, var4.field2895 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field484[arg3] = true;
    }

    @ObfuscatedName("ac.dw(IIIILcb;Lfk;I)V")
    public static final void method630(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method1998(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field372 + field359 & 0x7FF;
        int var8 = class91.field1579[var7];
        int var9 = class91.field1580[var7];
        int var10 = var8 * 256 / (field361 + 256);
        int var11 = var9 * 256 / (field361 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field69.method1588(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("cc.dg(IIIILcb;Lfk;B)V")
    public static final void method1998(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field372 + field359 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class91.field1579[var6];
        int var9 = class91.field1580[var6];
        int var10 = var8 * 256 / (field361 + 256);
        int var11 = var9 * 256 / (field361 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1557(arg5.field2896 / 2 + var12 - arg4.field1396 / 2, arg5.field2895 / 2 - var13 - arg4.field1391 / 2, arg0, arg1, arg5.field2896, arg5.field2895, arg5.field2898, arg5.field2897);
        } else {
            arg4.method1547(arg5.field2896 / 2 + arg0 + var12 - arg4.field1396 / 2, arg5.field2895 / 2 + arg1 - var13 - arg4.field1391 / 2);
        }
    }

    @ObfuscatedName("ev.da(Ljava/lang/String;ZI)Z")
    public static boolean method2786(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class164.method573(arg0, Statics.field291);
        for (int var3 = 0; var3 < field554; var3++) {
            if (var2.equalsIgnoreCase(class164.method573(field556[var3].field255, Statics.field291)) && (!arg1 || field556[var3].field248 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class164.method573(Statics.field2040.field44, Statics.field291))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cu.do(Ljava/lang/String;S)Z")
    public static boolean method1977(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class164.method573(arg0, Statics.field291);
        for (int var2 = 0; var2 < field558; var2++) {
            class8 var3 = field559[var2];
            if (var1.equalsIgnoreCase(class164.method573(var3.field139, Statics.field291))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class164.method573(var3.field143, Statics.field291))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("bs.dv(Ljava/lang/String;IB)V")
    public static final void method1421(String arg0, int arg1) {
        field331.method2555(247);
        field331.method2347(class119.method2219(arg0) + 1);
        field331.method2281(arg0);
        field331.method2347(arg1);
    }

    @ObfuscatedName("aa.du(Lff;S)I")
    public static int method707(class173 arg0) {
        class201 var1 = (class201) field395.method3482(((long) arg0.field2769 << 32) + (long) arg0.field2755);
        return var1 == null ? arg0.field2828 : var1.field3084;
    }

    @ObfuscatedName("ab.de(Lff;I)Z")
    public static boolean method890(class173 arg0) {
        if (field497) {
            if (method707(arg0) != 0) {
                return false;
            }
            if (arg0.field2756 == 0) {
                return false;
            }
        }
        return arg0.field2774;
    }

    @ObfuscatedName("e.dk(Lff;II)Ljava/lang/String;")
    public static String method139(class173 arg0, int arg1) {
        if (!class178.method1193(method707(arg0), arg1) && arg0.field2852 == null) {
            return null;
        } else if (arg0.field2826 == null || arg0.field2826.length <= arg1 || arg0.field2826[arg1] == null || arg0.field2826[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2826[arg1];
        }
    }

    @ObfuscatedName("a.dr(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method156(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field290 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field290 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field290 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field290 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field290 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field460 != null) {
            var3 = "/p=" + Statics.field460;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field294 + "/a=" + Statics.field2652 + var3 + "/";
    }
}

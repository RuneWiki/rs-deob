package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Date;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class144 {

    @ObfuscatedName("client.w")
    public static class108[] field355 = new class108[4];

    @ObfuscatedName("client.d")
    public static boolean field515 = true;

    @ObfuscatedName("client.z")
    public static int field348 = 1;

    @ObfuscatedName("client.l")
    public static int field576 = 0;

    @ObfuscatedName("client.p")
    public static int field475 = 0;

    @ObfuscatedName("client.v")
    public static boolean field577 = false;

    @ObfuscatedName("client.o")
    public static boolean field295 = false;

    @ObfuscatedName("client.n")
    public static int field299 = 0;

    @ObfuscatedName("client.t")
    public static int field300 = 0;

    @ObfuscatedName("client.a")
    public static boolean field301 = true;

    @ObfuscatedName("client.s")
    public static int field302 = 0;

    @ObfuscatedName("client.e")
    public static long field303 = 1L;

    @ObfuscatedName("client.i")
    public static int field304 = -1;

    @ObfuscatedName("client.h")
    public static int field305 = -1;

    @ObfuscatedName("client.ay")
    public static int field306 = -1;

    @ObfuscatedName("client.ak")
    public static boolean field307 = true;

    @ObfuscatedName("client.ai")
    public static boolean field296 = false;

    @ObfuscatedName("client.ag")
    public static int field387 = 0;

    @ObfuscatedName("client.ab")
    public static int field326 = 0;

    @ObfuscatedName("client.aa")
    public static int field311 = 0;

    @ObfuscatedName("client.af")
    public static int field420 = 0;

    @ObfuscatedName("client.al")
    public static int field313 = 0;

    @ObfuscatedName("client.ad")
    public static int field314 = 0;

    @ObfuscatedName("client.aw")
    public static int field315 = 0;

    @ObfuscatedName("client.an")
    public static int field353 = 0;

    @ObfuscatedName("client.ax")
    public static int field317 = 0;

    @ObfuscatedName("client.au")
    public static class21 field405 = class21.field583;

    @ObfuscatedName("client.ao")
    public static class21 field319 = class21.field583;

    @ObfuscatedName("client.am")
    public static int field289 = 0;

    @ObfuscatedName("client.ah")
    public static int field345 = 0;

    @ObfuscatedName("client.ar")
    public static int field322 = 0;

    @ObfuscatedName("client.bp")
    public static int field327 = 0;

    @ObfuscatedName("client.by")
    public static int field328 = 0;

    @ObfuscatedName("client.ba")
    public static int field329 = 0;

    @ObfuscatedName("client.bx")
    public static int field330 = 0;

    @ObfuscatedName("client.bg")
    public static int field333 = 0;

    @ObfuscatedName("client.cx")
    public static class35[] field351 = new class35[32768];

    @ObfuscatedName("client.co")
    public static int field404 = 0;

    @ObfuscatedName("client.cl")
    public static int[] field334 = new int[32768];

    @ObfuscatedName("client.cp")
    public static int field335 = 0;

    @ObfuscatedName("client.cn")
    public static int[] field336 = new int[250];

    @ObfuscatedName("client.cs")
    public static class122 field367 = new class122(5000);

    @ObfuscatedName("client.cr")
    public static class122 field338 = new class122(5000);

    @ObfuscatedName("client.ci")
    public static class122 field339 = new class122(15000);

    @ObfuscatedName("client.ct")
    public static int field340 = 0;

    @ObfuscatedName("client.ca")
    public static int field341 = 0;

    @ObfuscatedName("client.cv")
    public static int field342 = 0;

    @ObfuscatedName("client.cb")
    public static int field343 = 0;

    @ObfuscatedName("client.cm")
    public static int field344 = 0;

    @ObfuscatedName("client.cu")
    public static int field433 = 0;

    @ObfuscatedName("client.cj")
    public static int field346 = 0;

    @ObfuscatedName("client.cf")
    public static int field347 = 0;

    @ObfuscatedName("client.cq")
    public static boolean field325 = false;

    @ObfuscatedName("client.dj")
    public static int field554 = 0;

    @ObfuscatedName("client.di")
    public static int field337 = 1;

    @ObfuscatedName("client.dx")
    public static int field352 = 0;

    @ObfuscatedName("client.db")
    public static int field447 = 1;

    @ObfuscatedName("client.dl")
    public static int field354 = 0;

    @ObfuscatedName("client.dv")
    public static boolean field479 = false;

    @ObfuscatedName("client.dr")
    public static int[][][] field357 = new int[4][13][13];

    @ObfuscatedName("client.dp")
    public static final int[] field477 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dt")
    public static int field528 = 0;

    @ObfuscatedName("client.dk")
    public static int field361 = 2;

    @ObfuscatedName("client.do")
    public static int field469 = 0;

    @ObfuscatedName("client.dy")
    public static int field363 = 2;

    @ObfuscatedName("client.du")
    public static int field522 = 0;

    @ObfuscatedName("client.ex")
    public static int field365 = 1;

    @ObfuscatedName("client.eu")
    public static int field366 = 0;

    @ObfuscatedName("client.er")
    public static int field558 = 0;

    @ObfuscatedName("client.ea")
    public static int field368 = 2;

    @ObfuscatedName("client.ez")
    public static int field481 = 0;

    @ObfuscatedName("client.eq")
    public static int field370 = 1;

    @ObfuscatedName("client.ej")
    public static int field371 = 0;

    @ObfuscatedName("client.el")
    public static int field372 = 0;

    @ObfuscatedName("client.ef")
    public static int field374 = 2301979;

    @ObfuscatedName("client.ep")
    public static int field375 = 5063219;

    @ObfuscatedName("client.ei")
    public static int field292 = 3353893;

    @ObfuscatedName("client.es")
    public static int field377 = 7759444;

    @ObfuscatedName("client.en")
    public static boolean field378 = false;

    @ObfuscatedName("client.fw")
    public static int field293 = 0;

    @ObfuscatedName("client.fe")
    public static int field380 = 128;

    @ObfuscatedName("client.fo")
    public static int field573 = 0;

    @ObfuscatedName("client.fa")
    public static int field382 = 0;

    @ObfuscatedName("client.fs")
    public static int field383 = 0;

    @ObfuscatedName("client.fc")
    public static int field384 = 0;

    @ObfuscatedName("client.fn")
    public static int field385 = 0;

    @ObfuscatedName("client.fh")
    public static int field386 = 50;

    @ObfuscatedName("client.fu")
    public static int field482 = 0;

    @ObfuscatedName("client.fp")
    public static boolean field388 = false;

    @ObfuscatedName("client.fy")
    public static int field389 = 0;

    @ObfuscatedName("client.fm")
    public static int field529 = 0;

    @ObfuscatedName("client.fd")
    public static int field391 = 50;

    @ObfuscatedName("client.fk")
    public static int[] field316 = new int[field391];

    @ObfuscatedName("client.ff")
    public static int[] field524 = new int[field391];

    @ObfuscatedName("client.fl")
    public static int[] field394 = new int[field391];

    @ObfuscatedName("client.ft")
    public static int[] field395 = new int[field391];

    @ObfuscatedName("client.fz")
    public static int[] field438 = new int[field391];

    @ObfuscatedName("client.fb")
    public static int[] field416 = new int[field391];

    @ObfuscatedName("client.gu")
    public static int[] field398 = new int[field391];

    @ObfuscatedName("client.gn")
    public static String[] field399 = new String[field391];

    @ObfuscatedName("client.gi")
    public static int[][] field400 = new int[104][104];

    @ObfuscatedName("client.gy")
    public static int field401 = 0;

    @ObfuscatedName("client.gk")
    public static int field572 = -1;

    @ObfuscatedName("client.gc")
    public static int field403 = -1;

    @ObfuscatedName("client.gp")
    public static int field456 = 0;

    @ObfuscatedName("client.go")
    public static int field536 = 0;

    @ObfuscatedName("client.ge")
    public static int field406 = 0;

    @ObfuscatedName("client.gv")
    public static int field407 = 0;

    @ObfuscatedName("client.gw")
    public static int field408 = 0;

    @ObfuscatedName("client.gl")
    public static int field458 = 0;

    @ObfuscatedName("client.gq")
    public static int field410 = 0;

    @ObfuscatedName("client.ga")
    public static int field411 = 0;

    @ObfuscatedName("client.gd")
    public static int field412 = 0;

    @ObfuscatedName("client.gg")
    public static int field413 = 0;

    @ObfuscatedName("client.gz")
    public static boolean field414 = false;

    @ObfuscatedName("client.gs")
    public static int field415 = 0;

    @ObfuscatedName("client.gm")
    public static int field505 = 0;

    @ObfuscatedName("client.gj")
    public static class3[] field575 = new class3[2048];

    @ObfuscatedName("client.gr")
    public static int field418 = -1;

    @ObfuscatedName("client.hh")
    public static int field419 = 0;

    @ObfuscatedName("client.hj")
    public static int field320 = 0;

    @ObfuscatedName("client.hw")
    public static int[] field421 = new int[1000];

    @ObfuscatedName("client.hv")
    public static final int[] field488 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hs")
    public static String[] field423 = new String[8];

    @ObfuscatedName("client.he")
    public static boolean[] field424 = new boolean[8];

    @ObfuscatedName("client.hn")
    public static int[] field425 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ho")
    public static int field539 = -1;

    @ObfuscatedName("client.hg")
    public static class199[][][] field427 = new class199[4][104][104];

    @ObfuscatedName("client.ht")
    public static class199 field428 = new class199();

    @ObfuscatedName("client.hf")
    public static class199 field451 = new class199();

    @ObfuscatedName("client.hx")
    public static class199 field430 = new class199();

    @ObfuscatedName("client.hp")
    public static int[] field431 = new int[25];

    @ObfuscatedName("client.hq")
    public static int[] field432 = new int[25];

    @ObfuscatedName("client.hk")
    public static int[] field379 = new int[25];

    @ObfuscatedName("client.hc")
    public static int field308 = 0;

    @ObfuscatedName("client.hd")
    public static boolean field442 = false;

    @ObfuscatedName("client.hm")
    public static int field436 = 0;

    @ObfuscatedName("client.ha")
    public static int[] field437 = new int[500];

    @ObfuscatedName("client.ig")
    public static int[] field417 = new int[500];

    @ObfuscatedName("client.iy")
    public static int[] field439 = new int[500];

    @ObfuscatedName("client.im")
    public static int[] field557 = new int[500];

    @ObfuscatedName("client.ih")
    public static String[] field441 = new String[500];

    @ObfuscatedName("client.iq")
    public static String[] field318 = new String[500];

    @ObfuscatedName("client.iw")
    public static int field443 = -1;

    @ObfuscatedName("client.ip")
    public static int field444 = -1;

    @ObfuscatedName("client.id")
    public static int field445 = 0;

    @ObfuscatedName("client.ic")
    public static int field446 = 50;

    @ObfuscatedName("client.ie")
    public static int field369 = 0;

    @ObfuscatedName("client.ik")
    public static String field448 = null;

    @ObfuscatedName("client.is")
    public static boolean field449 = false;

    @ObfuscatedName("client.it")
    public static int field521 = -1;

    @ObfuscatedName("client.iv")
    public static int field392 = -1;

    @ObfuscatedName("client.ij")
    public static String field452 = null;

    @ObfuscatedName("client.ib")
    public static String field362 = null;

    @ObfuscatedName("client.iz")
    public static int field454 = -1;

    @ObfuscatedName("client.if")
    public static class196 field455 = new class196(8);

    @ObfuscatedName("client.jx")
    public static int field511 = 0;

    @ObfuscatedName("client.jw")
    public static int field453 = 0;

    @ObfuscatedName("client.jg")
    public static class173 field489 = null;

    @ObfuscatedName("client.js")
    public static int field459 = 0;

    @ObfuscatedName("client.jn")
    public static int field460 = 0;

    @ObfuscatedName("client.jb")
    public static int field461 = 0;

    @ObfuscatedName("client.jp")
    public static int field462 = -1;

    @ObfuscatedName("client.ja")
    public static boolean field463 = false;

    @ObfuscatedName("client.jv")
    public static boolean field464 = false;

    @ObfuscatedName("client.jj")
    public static boolean field465 = false;

    @ObfuscatedName("client.ju")
    public static class173 field422 = null;

    @ObfuscatedName("client.jf")
    public static class173 field467 = null;

    @ObfuscatedName("client.jy")
    public static class173 field390 = null;

    @ObfuscatedName("client.jq")
    public static int field556 = 0;

    @ObfuscatedName("client.jk")
    public static int field470 = 0;

    @ObfuscatedName("client.jz")
    public static class173 field471 = null;

    @ObfuscatedName("client.jh")
    public static boolean field501 = false;

    @ObfuscatedName("client.jc")
    public static int field473 = -1;

    @ObfuscatedName("client.jt")
    public static int field474 = -1;

    @ObfuscatedName("client.jo")
    public static boolean field397 = false;

    @ObfuscatedName("client.jr")
    public static int field476 = -1;

    @ObfuscatedName("client.je")
    public static int field497 = -1;

    @ObfuscatedName("client.ji")
    public static boolean field478 = false;

    @ObfuscatedName("client.ka")
    public static int field567 = 1;

    @ObfuscatedName("client.kl")
    public static int[] field480 = new int[32];

    @ObfuscatedName("client.ki")
    public static int field486 = 0;

    @ObfuscatedName("client.ko")
    public static int[] field321 = new int[32];

    @ObfuscatedName("client.kx")
    public static int field494 = 0;

    @ObfuscatedName("client.kp")
    public static int[] field484 = new int[32];

    @ObfuscatedName("client.kd")
    public static int field485 = 0;

    @ObfuscatedName("client.kq")
    public static int field291 = 0;

    @ObfuscatedName("client.ky")
    public static int field487 = 0;

    @ObfuscatedName("client.kr")
    public static int field466 = 0;

    @ObfuscatedName("client.ku")
    public static int field350 = 0;

    @ObfuscatedName("client.kv")
    public static int field356 = 0;

    @ObfuscatedName("client.kj")
    public static int field491 = 0;

    @ObfuscatedName("client.kb")
    public static int field492 = 0;

    @ObfuscatedName("client.kk")
    public static class199 field310 = new class199();

    @ObfuscatedName("client.kz")
    public static class199 field331 = new class199();

    @ObfuscatedName("client.ks")
    public static class199 field495 = new class199();

    @ObfuscatedName("client.kn")
    public static class196 field496 = new class196(512);

    @ObfuscatedName("client.ke")
    public static int field376 = 0;

    @ObfuscatedName("client.kt")
    public static int field498 = -2;

    @ObfuscatedName("client.lq")
    public static boolean[] field578 = new boolean[100];

    @ObfuscatedName("client.ld")
    public static boolean[] field500 = new boolean[100];

    @ObfuscatedName("client.la")
    public static boolean[] field409 = new boolean[100];

    @ObfuscatedName("client.lv")
    public static int[] field502 = new int[100];

    @ObfuscatedName("client.lh")
    public static int[] field396 = new int[100];

    @ObfuscatedName("client.lz")
    public static int[] field504 = new int[100];

    @ObfuscatedName("client.ll")
    public static int[] field468 = new int[100];

    @ObfuscatedName("client.lf")
    public static int field506 = 0;

    @ObfuscatedName("client.lw")
    public static long field507 = 0L;

    @ObfuscatedName("client.lx")
    public static boolean field508 = true;

    @ObfuscatedName("client.lr")
    public static int field509 = 1;

    @ObfuscatedName("client.li")
    public static int field499 = 503;

    @ObfuscatedName("client.lp")
    public static int[] field450 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lt")
    public static int field512 = 0;

    @ObfuscatedName("client.lj")
    public static int field513 = 0;

    @ObfuscatedName("client.lo")
    public static String field514 = "";

    @ObfuscatedName("client.lb")
    public static long[] field358 = new long[100];

    @ObfuscatedName("client.lc")
    public static int field516 = 0;

    @ObfuscatedName("client.lm")
    public static int field517 = 0;

    @ObfuscatedName("client.mn")
    public static int[] field518 = new int[128];

    @ObfuscatedName("client.mh")
    public static int[] field519 = new int[128];

    @ObfuscatedName("client.md")
    public static long field520 = -1L;

    @ObfuscatedName("client.mi")
    public static String field550 = null;

    @ObfuscatedName("client.mx")
    public static String field298 = null;

    @ObfuscatedName("client.ms")
    public static int field523 = -1;

    @ObfuscatedName("client.mm")
    public static int field426 = 0;

    @ObfuscatedName("client.ma")
    public static int[] field525 = new int[1000];

    @ObfuscatedName("client.mb")
    public static int[] field526 = new int[1000];

    @ObfuscatedName("client.mg")
    public static class79[] field527 = new class79[1000];

    @ObfuscatedName("client.mo")
    public static int field483 = 0;

    @ObfuscatedName("client.mz")
    public static int field381 = 0;

    @ObfuscatedName("client.mu")
    public static int field530 = 0;

    @ObfuscatedName("client.mp")
    public static int field531 = 255;

    @ObfuscatedName("client.ml")
    public static int field532 = -1;

    @ObfuscatedName("client.mc")
    public static boolean field533 = false;

    @ObfuscatedName("client.nu")
    public static int field534 = 127;

    @ObfuscatedName("client.no")
    public static int field535 = 127;

    @ObfuscatedName("client.nc")
    public static int field393 = 0;

    @ObfuscatedName("client.nb")
    public static int[] field537 = new int[50];

    @ObfuscatedName("client.nr")
    public static int[] field538 = new int[50];

    @ObfuscatedName("client.nw")
    public static int[] field402 = new int[50];

    @ObfuscatedName("client.na")
    public static int[] field540 = new int[50];

    @ObfuscatedName("client.ne")
    public static class59[] field541 = new class59[50];

    @ObfuscatedName("client.nj")
    public static boolean field563 = false;

    @ObfuscatedName("client.ot")
    public static boolean[] field543 = new boolean[5];

    @ObfuscatedName("client.op")
    public static int[] field544 = new int[5];

    @ObfuscatedName("client.ou")
    public static int[] field545 = new int[5];

    @ObfuscatedName("client.ol")
    public static int[] field546 = new int[5];

    @ObfuscatedName("client.oq")
    public static int[] field542 = new int[5];

    @ObfuscatedName("client.ob")
    public static short field548 = 256;

    @ObfuscatedName("client.os")
    public static short field549 = 205;

    @ObfuscatedName("client.oc")
    public static short field555 = 256;

    @ObfuscatedName("client.ov")
    public static short field551 = 320;

    @ObfuscatedName("client.on")
    public static short field552 = 1;

    @ObfuscatedName("client.oe")
    public static short field553 = 32767;

    @ObfuscatedName("client.oo")
    public static short field493 = 1;

    @ObfuscatedName("client.oh")
    public static short field364 = 32767;

    @ObfuscatedName("client.oy")
    public static int field565 = 0;

    @ObfuscatedName("client.ok")
    public static int field440 = 0;

    @ObfuscatedName("client.of")
    public static int field510 = 0;

    @ObfuscatedName("client.om")
    public static int field559 = 0;

    @ObfuscatedName("client.ox")
    public static int field560 = 0;

    @ObfuscatedName("client.od")
    public static int field561 = 0;

    @ObfuscatedName("client.og")
    public static int field562 = 0;

    @ObfuscatedName("client.oj")
    public static class18[] field434 = new class18[400];

    @ObfuscatedName("client.or")
    public static class195 field564 = new class195();

    @ObfuscatedName("client.oz")
    public static int field472 = 0;

    @ObfuscatedName("client.oa")
    public static class8[] field566 = new class8[400];

    @ObfuscatedName("client.pk")
    public static class179 field503 = new class179();

    @ObfuscatedName("client.po")
    public static int field568 = -1;

    @ObfuscatedName("client.pt")
    public static int field569 = -1;

    @ObfuscatedName("client.pu")
    public static class220[] field570 = new class220[8];

    @ObfuscatedName("client.pr")
    public static long field571 = -1L;

    @ObfuscatedName("client.pm")
    public static long field547 = -1L;

    @ObfuscatedName("client.ph")
    public static final class11 field312 = new class11();

    @ObfuscatedName("client.pw")
    public static int[] field574 = new int[50];

    @ObfuscatedName("client.pj")
    public static int[] field429 = new int[50];

    @ObfuscatedName("client.b(I)V")
    public final void method488() {
    }

    public final void init() {
        if (!this.method2889()) {
            return;
        }
        class190[] var1 = class190.method3153();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class190 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3050);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3050)) {
                    case 1:
                        Statics.field1999 = var4;
                        break;
                    case 2:
                        Statics.field1954 = Integer.parseInt(var4);
                        break;
                    case 3:
                        Statics.field2072 = var4;
                        break;
                    case 4:
                        field299 = Integer.parseInt(var4);
                    case 5:
                    case 6:
                    case 14:
                    default:
                        break;
                    case 7:
                        field348 = Integer.parseInt(var4);
                        break;
                    case 8:
                        class154[] var5 = new class154[] { class154.field2281, class154.field2274, class154.field2275, class154.field2276, class154.field2278, class154.field2272 };
                        Statics.field144 = (class154) class109.method3002(var5, Integer.parseInt(var4));
                        if (Statics.field144 == class154.field2272) {
                            Statics.field309 = class212.field3110;
                        } else {
                            Statics.field309 = class212.field3120;
                        }
                        break;
                    case 9:
                        Statics.field294 = class153.method959(Integer.parseInt(var4));
                        break;
                    case 10:
                        field475 = Integer.parseInt(var4);
                        break;
                    case 11:
                        field576 = Integer.parseInt(var4);
                        break;
                    case 12:
                        if (var4.equalsIgnoreCase(class2.field30)) {
                        }
                        break;
                    case 13:
                        if (var4.equalsIgnoreCase(class2.field30)) {
                            field577 = true;
                        } else {
                            field577 = false;
                        }
                        break;
                    case 15:
                        Statics.field209 = Integer.parseInt(var4);
                }
            }
        }
        class86.field1508 = false;
        field295 = false;
        Statics.field3042 = this.getCodeBase().getHost();
        String var6 = Statics.field294.field2268;
        byte var7 = 0;
        try {
            class149.method1072("oldschool", var6, var7, 16);
        } catch (Exception var9) {
            class148.method2631((String) null, var9);
        }
        Statics.field290 = this;
        this.method2875(765, 503, 102);
    }

    @ObfuscatedName("client.d(I)V")
    public final void method467() {
        Statics.field1159 = field475 == 0 ? 43594 : field348 + 40000;
        Statics.field1046 = field475 == 0 ? 443 : field348 + 50000;
        Statics.field17 = Statics.field1159;
        Statics.field1177 = class174.field2876;
        Statics.field2905 = class174.field2873;
        Statics.field1050 = class174.field2874;
        Statics.field251 = class174.field2875;
        if (Statics.field2088.toLowerCase().indexOf("microsoft") == -1) {
            class137.field2120[44] = 71;
            class137.field2120[45] = 26;
            class137.field2120[46] = 72;
            class137.field2120[47] = 73;
            class137.field2120[59] = 57;
            class137.field2120[61] = 27;
            class137.field2120[91] = 42;
            class137.field2120[92] = 74;
            class137.field2120[93] = 43;
            class137.field2120[192] = 28;
            class137.field2120[222] = 58;
            class137.field2120[520] = 59;
        } else {
            class137.field2120[186] = 57;
            class137.field2120[187] = 27;
            class137.field2120[188] = 71;
            class137.field2120[189] = 26;
            class137.field2120[190] = 72;
            class137.field2120[191] = 73;
            class137.field2120[192] = 58;
            class137.field2120[219] = 42;
            class137.field2120[220] = 74;
            class137.field2120[221] = 43;
            class137.field2120[222] = 59;
            class137.field2120[223] = 28;
        }
        Canvas var1 = Statics.field1362;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class137.field2106);
        var1.addFocusListener(class137.field2106);
        class140.method2626(Statics.field1362);
        class145 var2;
        try {
            var2 = new class145();
        } catch (Throwable var5) {
            var2 = null;
        }
        Statics.field1381 = var2;
        if (Statics.field1381 != null) {
            Statics.field1381.method2694(Statics.field1362);
        }
        Statics.field2676 = new class134(255, class149.field2225, class149.field2230, 500000);
        Statics.field783 = class9.method154();
        Statics.field1526 = this.getToolkit().getSystemClipboard();
        class138.method596(this, Statics.field2974);
        if (field475 != 0) {
            field296 = true;
        }
        int var4 = Statics.field783.field148;
        field507 = 0L;
        if (var4 >= 2) {
            field508 = true;
        } else {
            field508 = false;
        }
        method1783();
        if (field300 >= 25) {
            field367.method2612(231);
            field367.method2476(method11());
            field367.method2349(Statics.field2014);
            field367.method2349(Statics.field2019);
        }
        field2200 = true;
    }

    @ObfuscatedName("client.z(B)V")
    public final void method250() {
        field302++;
        this.method253();
        while (true) {
            class199 var1 = class170.field2697;
            class169 var2;
            synchronized (class170.field2697) {
                var2 = (class169) class170.field2696.method3601();
            }
            if (var2 == null) {
                class183.method2949();
                method943();
                class137 var4 = class137.field2106;
                synchronized (class137.field2106) {
                    class137.field2119++;
                    class137.field2116 = class137.field2114;
                    class137.field2115 = 0;
                    if (class137.field2111 >= 0) {
                        while (class137.field2111 != class137.field2110) {
                            int var6 = class137.field2123[class137.field2110];
                            class137.field2110 = class137.field2110 + 1 & 0x7F;
                            if (var6 < 0) {
                                class137.field2108[~var6] = false;
                            } else {
                                if (!class137.field2108[var6] && class137.field2115 < class137.field2117.length - 1) {
                                    class137.field2117[++class137.field2115 - 1] = var6;
                                }
                                class137.field2108[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class137.field2108[var5] = false;
                        }
                        class137.field2111 = class137.field2110;
                    }
                    class137.field2114 = class137.field2100;
                }
                class140 var8 = class140.field2154;
                synchronized (class140.field2154) {
                    class140.field2151 = class140.field2140;
                    class140.field2139 = class140.field2141;
                    class140.field2145 = class140.field2147;
                    class140.field2150 = class140.field2138;
                    class140.field2142 = class140.field2156;
                    class140.field2148 = class140.field2143;
                    class140.field2153 = class140.field2149;
                    class140.field2138 = 0;
                }
                if (Statics.field1381 != null) {
                    int var10 = Statics.field1381.method2708();
                    field492 = var10;
                }
                if (field300 == 0) {
                    method2072();
                    class144.method2844();
                } else if (field300 == 5) {
                    class32.method1(this);
                    method2072();
                    class144.method2844();
                } else if (field300 == 10 || field300 == 11) {
                    class32.method1(this);
                } else if (field300 == 20) {
                    class32.method1(this);
                    method821();
                } else if (field300 == 25) {
                    method1090(false);
                    field554 = 0;
                    boolean var11 = true;
                    for (int var12 = 0; var12 < Statics.field151.length; var12++) {
                        if (Statics.field1951[var12] != -1 && Statics.field151[var12] == null) {
                            Statics.field151[var12] = Statics.field1888.method3112(Statics.field1951[var12], 0);
                            if (Statics.field151[var12] == null) {
                                var11 = false;
                                field554++;
                            }
                        }
                        if (Statics.field1941[var12] != -1 && Statics.field75[var12] == null) {
                            Statics.field75[var12] = Statics.field1888.method3118(Statics.field1941[var12], 0, Statics.field977[var12]);
                            if (Statics.field75[var12] == null) {
                                var11 = false;
                                field554++;
                            }
                        }
                    }
                    if (var11) {
                        field352 = 0;
                        boolean var13 = true;
                        for (int var14 = 0; var14 < Statics.field151.length; var14++) {
                            byte[] var15 = Statics.field75[var14];
                            if (var15 != null) {
                                int var16 = (Statics.field232[var14] >> 8) * 64 - Statics.field3144;
                                int var17 = (Statics.field232[var14] & 0xFF) * 64 - Statics.field656;
                                if (field479) {
                                    var16 = 10;
                                    var17 = 10;
                                }
                                var13 &= class6.method2989(var15, var16, var17);
                            }
                        }
                        if (var13) {
                            if (field354 != 0) {
                                method1786(class157.field2307 + class2.field27 + class2.field24 + 100 + "%" + class2.field25, true);
                            }
                            method943();
                            method1008();
                            method943();
                            Statics.field39.method1855();
                            method943();
                            System.gc();
                            for (int var18 = 0; var18 < 4; var18++) {
                                field355[var18].method2270();
                            }
                            for (int var19 = 0; var19 < 4; var19++) {
                                for (int var20 = 0; var20 < 104; var20++) {
                                    for (int var21 = 0; var21 < 104; var21++) {
                                        class6.field88[var19][var20][var21] = 0;
                                    }
                                }
                            }
                            method943();
                            class6.method14();
                            int var22 = Statics.field151.length;
                            class24.method727();
                            method1090(true);
                            if (!field479) {
                                int var23 = 0;
                                label467: while (true) {
                                    if (var23 >= var22) {
                                        for (int var37 = 0; var37 < var22; var37++) {
                                            int var38 = (Statics.field232[var37] >> 8) * 64 - Statics.field3144;
                                            int var39 = (Statics.field232[var37] & 0xFF) * 64 - Statics.field656;
                                            byte[] var40 = Statics.field151[var37];
                                            if (var40 == null && Statics.field2615 < 800) {
                                                method943();
                                                class6.method2305(var38, var39, 64, 64);
                                            }
                                        }
                                        method1090(true);
                                        int var41 = 0;
                                        while (true) {
                                            if (var41 >= var22) {
                                                break label467;
                                            }
                                            byte[] var42 = Statics.field75[var41];
                                            if (var42 != null) {
                                                int var43 = (Statics.field232[var41] >> 8) * 64 - Statics.field3144;
                                                int var44 = (Statics.field232[var41] & 0xFF) * 64 - Statics.field656;
                                                method943();
                                                class6.method3718(var42, var43, var44, Statics.field39, field355);
                                            }
                                            var41++;
                                        }
                                    }
                                    int var24 = (Statics.field232[var23] >> 8) * 64 - Statics.field3144;
                                    int var25 = (Statics.field232[var23] & 0xFF) * 64 - Statics.field656;
                                    byte[] var26 = Statics.field151[var23];
                                    if (var26 != null) {
                                        method943();
                                        int var27 = Statics.field256 * 8 - 48;
                                        int var28 = Statics.field2615 * 8 - 48;
                                        class108[] var29 = field355;
                                        int var30 = 0;
                                        label464: while (true) {
                                            if (var30 >= 4) {
                                                class119 var33 = new class119(var26);
                                                int var34 = 0;
                                                while (true) {
                                                    if (var34 >= 4) {
                                                        break label464;
                                                    }
                                                    for (int var35 = 0; var35 < 64; var35++) {
                                                        for (int var36 = 0; var36 < 64; var36++) {
                                                            class6.method41(var33, var34, var24 + var35, var25 + var36, var27, var28, 0);
                                                        }
                                                    }
                                                    var34++;
                                                }
                                            }
                                            for (int var31 = 0; var31 < 64; var31++) {
                                                for (int var32 = 0; var32 < 64; var32++) {
                                                    if (var24 + var31 > 0 && var24 + var31 < 103 && var25 + var32 > 0 && var25 + var32 < 103) {
                                                        var29[var30].field1883[var24 + var31][var25 + var32] &= 0xFEFFFFFF;
                                                    }
                                                }
                                            }
                                            var30++;
                                        }
                                    }
                                    var23++;
                                }
                            }
                            if (field479) {
                                int var45 = 0;
                                label413: while (true) {
                                    if (var45 >= 4) {
                                        for (int var56 = 0; var56 < 13; var56++) {
                                            for (int var57 = 0; var57 < 13; var57++) {
                                                int var58 = field357[0][var56][var57];
                                                if (var58 == -1) {
                                                    class6.method2305(var56 * 8, var57 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method1090(true);
                                        int var59 = 0;
                                        while (true) {
                                            if (var59 >= 4) {
                                                break label413;
                                            }
                                            method943();
                                            for (int var60 = 0; var60 < 13; var60++) {
                                                label370: for (int var61 = 0; var61 < 13; var61++) {
                                                    int var62 = field357[var59][var60][var61];
                                                    if (var62 != -1) {
                                                        int var63 = var62 >> 24 & 0x3;
                                                        int var64 = var62 >> 1 & 0x3;
                                                        int var65 = var62 >> 14 & 0x3FF;
                                                        int var66 = var62 >> 3 & 0x7FF;
                                                        int var67 = (var65 / 8 << 8) + var66 / 8;
                                                        for (int var68 = 0; var68 < Statics.field232.length; var68++) {
                                                            if (Statics.field232[var68] == var67 && Statics.field75[var68] != null) {
                                                                byte[] var69 = Statics.field75[var68];
                                                                int var70 = var60 * 8;
                                                                int var71 = var61 * 8;
                                                                int var72 = (var65 & 0x7) * 8;
                                                                int var73 = (var66 & 0x7) * 8;
                                                                class86 var74 = Statics.field39;
                                                                class108[] var75 = field355;
                                                                class119 var76 = new class119(var69);
                                                                int var77 = -1;
                                                                while (true) {
                                                                    int var78 = var76.method2506();
                                                                    if (var78 == 0) {
                                                                        continue label370;
                                                                    }
                                                                    var77 += var78;
                                                                    int var79 = 0;
                                                                    while (true) {
                                                                        int var80 = var76.method2506();
                                                                        if (var80 == 0) {
                                                                            break;
                                                                        }
                                                                        var79 += var80 - 1;
                                                                        int var81 = var79 & 0x3F;
                                                                        int var82 = var79 >> 6 & 0x3F;
                                                                        int var83 = var79 >> 12;
                                                                        int var84 = var76.method2362();
                                                                        int var85 = var84 >> 2;
                                                                        int var86 = var84 & 0x3;
                                                                        if (var63 == var83 && var82 >= var72 && var82 < var72 + 8 && var81 >= var73 && var81 < var73 + 8) {
                                                                            class41 var87 = class41.method3251(var77);
                                                                            int var88 = var70 + class177.method2300(var82 & 0x7, var81 & 0x7, var64, var87.field942, var87.field943, var86);
                                                                            int var89 = var71 + class177.method667(var82 & 0x7, var81 & 0x7, var64, var87.field942, var87.field943, var86);
                                                                            if (var88 > 0 && var89 > 0 && var88 < 103 && var89 < 103) {
                                                                                int var90 = var59;
                                                                                if ((class6.field88[1][var88][var89] & 0x2) == 2) {
                                                                                    var90 = var59 - 1;
                                                                                }
                                                                                class108 var91 = null;
                                                                                if (var90 >= 0) {
                                                                                    var91 = var75[var90];
                                                                                }
                                                                                class6.method3008(var59, var88, var89, var77, var64 + var86 & 0x3, var85, var74, var91);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var59++;
                                        }
                                    }
                                    method943();
                                    for (int var46 = 0; var46 < 13; var46++) {
                                        for (int var47 = 0; var47 < 13; var47++) {
                                            boolean var48 = false;
                                            int var49 = field357[var45][var46][var47];
                                            if (var49 != -1) {
                                                int var50 = var49 >> 24 & 0x3;
                                                int var51 = var49 >> 1 & 0x3;
                                                int var52 = var49 >> 14 & 0x3FF;
                                                int var53 = var49 >> 3 & 0x7FF;
                                                int var54 = (var52 / 8 << 8) + var53 / 8;
                                                for (int var55 = 0; var55 < Statics.field232.length; var55++) {
                                                    if (Statics.field232[var55] == var54 && Statics.field151[var55] != null) {
                                                        class6.method2990(Statics.field151[var55], var45, var46 * 8, var47 * 8, var50, (var52 & 0x7) * 8, (var53 & 0x7) * 8, var51, field355);
                                                        var48 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var48) {
                                                class6.method2734(var45, var46 * 8, var47 * 8);
                                            }
                                        }
                                    }
                                    var45++;
                                }
                            }
                            method1090(true);
                            method1008();
                            method943();
                            class6.method190(Statics.field39, field355);
                            method1090(true);
                            int var92 = class6.field104;
                            if (var92 > Statics.field1765) {
                                var92 = Statics.field1765;
                            }
                            if (var92 < Statics.field1765 - 1) {
                                int var93 = Statics.field1765 - 1;
                            }
                            if (field295) {
                                Statics.field39.method1949(class6.field104);
                            } else {
                                Statics.field39.method1949(0);
                            }
                            for (int var94 = 0; var94 < 104; var94++) {
                                for (int var95 = 0; var95 < 104; var95++) {
                                    Statics.method123(var94, var95);
                                }
                            }
                            method943();
                            for (class17 var96 = (class17) field428.method3603(); var96 != null; var96 = (class17) field428.method3596()) {
                                if (var96.field250 == -1) {
                                    var96.field235 = 0;
                                    method1271(var96);
                                } else {
                                    var96.method3693();
                                }
                            }
                            class41.field930.method3532();
                            if (Statics.field703 != null) {
                                field367.method2612(169);
                                field367.method2351(1057001181);
                            }
                            if (!field479) {
                                int var97 = (Statics.field256 - 6) / 8;
                                int var98 = (Statics.field256 + 6) / 8;
                                int var99 = (Statics.field2615 - 6) / 8;
                                int var100 = (Statics.field2615 + 6) / 8;
                                for (int var101 = var97 - 1; var101 <= var98 + 1; var101++) {
                                    for (int var102 = var99 - 1; var102 <= var100 + 1; var102++) {
                                        if (var101 < var97 || var101 > var98 || var102 < var99 || var102 > var100) {
                                            Statics.field1888.method3151("m" + var101 + "_" + var102);
                                            Statics.field1888.method3151("l" + var101 + "_" + var102);
                                        }
                                    }
                                }
                            }
                            method43(30);
                            method943();
                            Statics.field700 = (byte[][][]) null;
                            Statics.field685 = (byte[][][]) null;
                            Statics.field90 = (byte[][][]) null;
                            Statics.field2015 = (byte[][][]) null;
                            Statics.field101 = (int[][][]) null;
                            Statics.field2125 = (byte[][][]) null;
                            Statics.field170 = (int[][]) null;
                            Statics.field1952 = null;
                            Statics.field89 = null;
                            Statics.field3135 = null;
                            Statics.field1101 = null;
                            Statics.field660 = null;
                            field367.method2612(111);
                            class144.method2844();
                        } else {
                            field354 = 2;
                        }
                    } else {
                        field354 = 1;
                    }
                }
                if (field300 == 30) {
                    method107();
                } else if (field300 == 40 || field300 == 45) {
                    method821();
                }
                return;
            }
            var2.field2691.method3170(var2.field2690, (int) var2.field3099, var2.field2694, false);
        }
    }

    @ObfuscatedName("client.l(B)V")
    public final void method322() {
        boolean var1;
        label343: {
            try {
                if (class183.field2940 == 2) {
                    if (Statics.field3197 == null) {
                        Statics.field3197 = class180.method3320(Statics.field76, Statics.field2944, Statics.field2945);
                        if (Statics.field3197 == null) {
                            var1 = false;
                            break label343;
                        }
                    }
                    if (Statics.field2105 == null) {
                        Statics.field2105 = new class60(Statics.field2941, Statics.field2939);
                    }
                    if (Statics.field2942.method3409(Statics.field3197, Statics.field2943, Statics.field2105, 22050)) {
                        Statics.field2942.method3467();
                        Statics.field2942.method3407(Statics.field2244);
                        Statics.field2942.method3411(Statics.field3197, Statics.field73);
                        class183.field2940 = 0;
                        Statics.field3197 = null;
                        Statics.field2105 = null;
                        Statics.field76 = null;
                        var1 = true;
                        break label343;
                    }
                }
            } catch (Exception var47) {
                var47.printStackTrace();
                Statics.field2942.method3459();
                class183.field2940 = 0;
                Statics.field3197 = null;
                Statics.field2105 = null;
                Statics.field76 = null;
            }
            var1 = false;
        }
        if (var1 && field533 && Statics.field2041 != null) {
            Statics.field2041.method1194();
        }
        if (field300 == 10 || field300 == 20 || field300 == 30) {
            if (field507 != 0L && class115.method579() > field507) {
                int var4 = method11();
                field507 = 0L;
                if (var4 >= 2) {
                    field508 = true;
                } else {
                    field508 = false;
                }
                method1783();
                if (field300 >= 25) {
                    field367.method2612(231);
                    field367.method2476(method11());
                    field367.method2349(Statics.field2014);
                    field367.method2349(Statics.field2019);
                }
                field2200 = true;
            } else if (field2193) {
                method3521();
            }
        }
        Dimension var5 = this.method2937();
        if (Statics.field1029 != var5.width || Statics.field2197 != var5.height || field2203) {
            method1783();
            field507 = class115.method579() + 500L;
            field2203 = false;
        }
        boolean var6 = false;
        if (field2200) {
            field2200 = false;
            var6 = true;
            for (int var7 = 0; var7 < 100; var7++) {
                field578[var7] = true;
            }
        }
        if (var6) {
            method3075();
        }
        if (field300 == 0) {
            class144.method1516(class32.field730, class32.field738, (Color) null, var6);
        } else if (field300 == 5) {
            class32.method960(Statics.field221, Statics.field349, Statics.field1393, var6);
        } else if (field300 == 10 || field300 == 11) {
            class32.method960(Statics.field221, Statics.field349, Statics.field1393, var6);
        } else if (field300 == 20) {
            class32.method960(Statics.field221, Statics.field349, Statics.field1393, var6);
        } else if (field300 == 25) {
            if (field354 == 1) {
                if (field554 > field337) {
                    field337 = field554;
                }
                int var8 = (field337 * 50 - field554 * 50) / field337;
                method1786(class157.field2307 + class2.field27 + class2.field24 + var8 + "%" + class2.field25, false);
            } else if (field354 == 2) {
                if (field352 > field447) {
                    field447 = field352;
                }
                int var9 = (field447 * 50 - field352 * 50) / field447 + 50;
                method1786(class157.field2307 + class2.field27 + class2.field24 + var9 + "%" + class2.field25, false);
            } else {
                method1786(class157.field2307, false);
            }
        } else if (field300 == 30) {
            if (field454 != -1) {
                method1784(field454);
            }
            for (int var10 = 0; var10 < field376; var10++) {
                if (field578[var10]) {
                    field500[var10] = true;
                }
                field409[var10] = field578[var10];
                field578[var10] = false;
            }
            field498 = field302;
            field443 = -1;
            field444 = -1;
            Statics.field825 = null;
            if (field454 != -1) {
                field376 = 0;
                method761(field454, 0, 0, Statics.field2014, Statics.field2019, 0, 0, -1);
            }
            class80.method1706();
            if (field442) {
                int var14 = Statics.field2989;
                int var15 = Statics.field218;
                int var16 = Statics.field2146;
                int var17 = Statics.field1365;
                int var18 = 6116423;
                class80.method1713(var14, var15, var16, var17, var18);
                class80.method1713(var14 + 1, var15 + 1, var16 - 2, 16, 0);
                class80.method1751(var14 + 1, var15 + 18, var16 - 2, var17 - 19, 0);
                Statics.field221.method3810(class157.field2451, var14 + 3, var15 + 14, var18, -1);
                int var19 = class140.field2139;
                int var20 = class140.field2145;
                for (int var21 = 0; var21 < field436; var21++) {
                    int var22 = (field436 - 1 - var21) * 15 + var15 + 31;
                    int var23 = 16777215;
                    if (var19 > var14 && var19 < var14 + var16 && var20 > var22 - 13 && var20 < var22 + 3) {
                        var23 = 16776960;
                    }
                    Statics.field221.method3810(method45(var21), var14 + 3, var22, var23, 0);
                }
                method3511(Statics.field2989, Statics.field218, Statics.field2146, Statics.field1365);
            } else if (field443 != -1) {
                int var11 = field443;
                int var12 = field444;
                if (field436 >= 2 || field369 != 0 || field449) {
                    String var13;
                    if (field369 == 1 && field436 < 2) {
                        var13 = class157.field2448 + class157.field2458 + field448 + " " + class2.field37;
                    } else if (field449 && field436 < 2) {
                        var13 = field452 + class157.field2458 + field362 + " " + class2.field37;
                    } else {
                        var13 = method45(field436 - 1);
                    }
                    if (field436 > 2) {
                        var13 = var13 + class2.method3003(16777215) + " " + '/' + " " + (field436 - 2) + class157.field2452;
                    }
                    Statics.field221.method3817(var13, var11 + 4, var12 + 15, 16777215, 0, field302 / 1000);
                }
            }
            if (field506 == 3) {
                for (int var24 = 0; var24 < field376; var24++) {
                    if (field409[var24]) {
                        class80.method1712(field502[var24], field396[var24], field504[var24], field468[var24], 16711935, 128);
                    } else if (field500[var24]) {
                        class80.method1712(field502[var24], field396[var24], field504[var24], field468[var24], 16711680, 128);
                    }
                }
            }
            int var25 = Statics.field1765;
            int var26 = Statics.field176.field875;
            int var27 = Statics.field176.field819;
            int var28 = field372;
            for (class24 var29 = (class24) class24.field615.method3603(); var29 != null; var29 = (class24) class24.field615.method3596()) {
                if (var29.field612 != -1 || var29.field622 != null) {
                    int var30 = 0;
                    if (var26 > var29.field609) {
                        var30 += var26 - var29.field609;
                    } else if (var26 < var29.field607) {
                        var30 += var29.field607 - var26;
                    }
                    if (var27 > var29.field608) {
                        var30 += var27 - var29.field608;
                    } else if (var27 < var29.field605) {
                        var30 += var29.field605 - var27;
                    }
                    if (var30 - 64 > var29.field611 || field535 == 0 || var29.field606 != var25) {
                        if (var29.field624 != null) {
                            Statics.field82.method1155(var29.field624);
                            var29.field624 = null;
                        }
                        if (var29.field613 != null) {
                            Statics.field82.method1155(var29.field613);
                            var29.field613 = null;
                        }
                    } else {
                        var30 -= 64;
                        if (var30 < 0) {
                            var30 = 0;
                        }
                        int var31 = field535 * (var29.field611 - var30) / var29.field611;
                        class59 var10000;
                        if (var29.field624 != null) {
                            var29.field624.method1428(var31);
                        } else if (var29.field612 >= 0) {
                            var10000 = (class59) null;
                            class59 var32 = class59.method1253(Statics.field162, var29.field612, 0);
                            if (var32 != null) {
                                class63 var33 = var32.method1257().method1284(Statics.field632);
                                class65 var34 = class65.method1307(var33, 100, var31);
                                var34.method1310(-1);
                                Statics.field82.method1143(var34);
                                var29.field624 = var34;
                            }
                        }
                        if (var29.field613 != null) {
                            var29.field613.method1428(var31);
                            if (!var29.field613.method3694()) {
                                var29.field613 = null;
                            }
                        } else if (var29.field622 != null && (var29.field617 -= var28) <= 0) {
                            int var35 = (int) (Math.random() * (double) var29.field622.length);
                            var10000 = (class59) null;
                            class59 var36 = class59.method1253(Statics.field162, var29.field622[var35], 0);
                            if (var36 != null) {
                                class63 var37 = var36.method1257().method1284(Statics.field632);
                                class65 var38 = class65.method1307(var37, 100, var31);
                                var38.method1310(0);
                                Statics.field82.method1143(var38);
                                var29.field613 = var38;
                                var29.field617 = var29.field614 + (int) (Math.random() * (double) (var29.field618 - var29.field614));
                            }
                        }
                    }
                }
            }
            field372 = 0;
        } else if (field300 == 40) {
            method1786(class157.field2308 + class2.field27 + class157.field2309, false);
        } else if (field300 == 45) {
            method1786(class157.field2456, false);
        }
        if (field300 == 30 && field506 == 0 && !var6) {
            try {
                Graphics var39 = Statics.field1362.getGraphics();
                for (int var40 = 0; var40 < field376; var40++) {
                    if (field500[var40]) {
                        Statics.field137.method1568(var39, field502[var40], field396[var40], field504[var40], field468[var40]);
                        field500[var40] = false;
                    }
                }
            } catch (Exception var46) {
                Statics.field1362.repaint();
            }
        } else if (field300 > 0) {
            try {
                Graphics var42 = Statics.field1362.getGraphics();
                Statics.field137.method1542(var42, 0, 0);
                for (int var43 = 0; var43 < field376; var43++) {
                    field500[var43] = false;
                }
            } catch (Exception var45) {
                Statics.field1362.repaint();
            }
        }
    }

    @ObfuscatedName("client.m(I)V")
    public final void method252() {
        if (Statics.field1885.method213()) {
            Statics.field1885.method232();
        }
        if (Statics.field2159 != null) {
            Statics.field2159.field206 = false;
        }
        Statics.field2159 = null;
        if (Statics.field2589 != null) {
            Statics.field2589.method2856();
            Statics.field2589 = null;
        }
        class137.method918();
        class140.method1606();
        Statics.field1381 = null;
        if (Statics.field2041 != null) {
            Statics.field2041.method1195();
        }
        if (Statics.field2042 != null) {
            Statics.field2042.method1195();
        }
        if (Statics.field2718 != null) {
            Statics.field2718.method2856();
        }
        Object var1 = class170.field2699;
        synchronized (class170.field2699) {
            if (class170.field2698 != 0) {
                class170.field2698 = 1;
                try {
                    class170.field2699.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        try {
            class149.field2225.method3920();
            for (int var4 = 0; var4 < Statics.field205; var4++) {
                Statics.field1092[var4].method3920();
            }
            class149.field2230.method3920();
            class149.field2235.method3920();
        } catch (Exception var7) {
        }
    }

    @ObfuscatedName("w.p(II)V")
    public static void method43(int arg0) {
        if (field300 == arg0) {
            return;
        }
        if (field300 == 0) {
            Statics.field2201 = null;
            Statics.field2032 = null;
            Statics.field2126 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field328 = 0;
            field329 = 0;
            field330 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field762 != null) {
            Statics.field762.method2856();
            Statics.field762 = null;
        }
        if (field300 == 25) {
            field354 = 0;
            field554 = 0;
            field337 = 1;
            field352 = 0;
            field447 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method657(Statics.field1362, Statics.field297, Statics.field1768, true, 0);
        } else if (arg0 == 20) {
            class32.method657(Statics.field1362, Statics.field297, Statics.field1768, true, field300 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method657(Statics.field1362, Statics.field297, Statics.field1768, false, 4);
        } else if (Statics.field737) {
            Statics.field727 = null;
            Statics.field2170 = null;
            Statics.field745 = null;
            Statics.field1958 = null;
            Statics.field3166 = null;
            Statics.field1754 = null;
            Statics.field2922 = null;
            Statics.field755 = null;
            Statics.field597 = null;
            Statics.field2648 = null;
            Statics.field1051 = null;
            Statics.field2071 = null;
            Statics.field2903 = null;
            Statics.field2037 = null;
            Statics.field223 = null;
            Statics.field1947 = null;
            Statics.field200 = null;
            Statics.field797 = null;
            Statics.field591 = null;
            Statics.field653 = null;
            Statics.field1618 = null;
            Statics.field2263 = null;
            Statics.method3179(2);
            class171.method659(true);
            Statics.field737 = false;
        }
        field300 = arg0;
    }

    @ObfuscatedName("client.u(B)V")
    public void method253() {
        if (field300 == 1000) {
            return;
        }
        long var1 = class115.method579();
        int var3 = (int) (var1 - Statics.field2703);
        Statics.field2703 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class171.field2702 += var3;
        boolean var4;
        if (class171.field2701 == 0 && class171.field2712 == 0 && class171.field2708 == 0 && class171.field2705 == 0) {
            var4 = true;
        } else if (Statics.field2718 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class171.field2702 > 30000) {
                        throw new IOException();
                    }
                    while (class171.field2712 < 20 && class171.field2705 > 0) {
                        class172 var5 = (class172) class171.field2704.method3571();
                        class119 var6 = new class119(4);
                        var6.method2476(1);
                        var6.method2537((int) var5.field3099);
                        Statics.field2718.method2859(var6.field1986, 0, 4);
                        class171.field2706.method3569(var5, var5.field3099);
                        class171.field2705--;
                        class171.field2712++;
                    }
                    while (class171.field2701 < 20 && class171.field2708 > 0) {
                        class172 var7 = (class172) class171.field2720.method3670();
                        class119 var8 = new class119(4);
                        var8.method2476(0);
                        var8.method2537((int) var7.field3099);
                        Statics.field2718.method2859(var8.field1986, 0, 4);
                        var7.method3671();
                        class171.field2707.method3569(var7, var7.field3099);
                        class171.field2708--;
                        class171.field2701++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2718.method2860();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class171.field2702 = 0;
                        byte var11 = 0;
                        if (Statics.field2068 == null) {
                            var11 = 8;
                        } else if (class171.field2714 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class171.field2713.field1977;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2718.method2858(class171.field2713.field1986, class171.field2713.field1977, var12);
                            if (class171.field2717 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class171.field2713.field1986[class171.field2713.field1977 + var13] ^= class171.field2717;
                                }
                            }
                            class171.field2713.field1977 += var12;
                            if (class171.field2713.field1977 < var11) {
                                break;
                            }
                            if (Statics.field2068 == null) {
                                class171.field2713.field1977 = 0;
                                int var14 = class171.field2713.method2362();
                                int var15 = class171.field2713.method2376();
                                int var16 = class171.field2713.method2362();
                                int var17 = class171.field2713.method2367();
                                long var18 = (long) ((var14 << 16) + var15);
                                class172 var20 = (class172) class171.field2706.method3573(var18);
                                Statics.field1950 = true;
                                if (var20 == null) {
                                    var20 = (class172) class171.field2707.method3573(var18);
                                    Statics.field1950 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2068 = var20;
                                Statics.field1449 = new class119(var17 + var21 + Statics.field2068.field2724);
                                Statics.field1449.method2476(var16);
                                Statics.field1449.method2351(var17);
                                class171.field2714 = 8;
                                class171.field2713.field1977 = 0;
                            } else if (class171.field2714 == 0) {
                                if (class171.field2713.field1986[0] == -1) {
                                    class171.field2714 = 1;
                                    class171.field2713.field1977 = 0;
                                } else {
                                    Statics.field2068 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field1449.field1986.length - Statics.field2068.field2724;
                            int var23 = 512 - class171.field2714;
                            if (var23 > var22 - Statics.field1449.field1977) {
                                var23 = var22 - Statics.field1449.field1977;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2718.method2858(Statics.field1449.field1986, Statics.field1449.field1977, var23);
                            if (class171.field2717 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field1449.field1986[Statics.field1449.field1977 + var24] ^= class171.field2717;
                                }
                            }
                            Statics.field1449.field1977 += var23;
                            class171.field2714 += var23;
                            if (Statics.field1449.field1977 == var22) {
                                if (Statics.field2068.field3099 == 16711935L) {
                                    Statics.field2644 = Statics.field1449;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class168 var26 = class171.field2710[var25];
                                        if (var26 != null) {
                                            Statics.field2644.field1977 = var25 * 8 + 5;
                                            int var27 = Statics.field2644.method2367();
                                            int var28 = Statics.field2644.method2367();
                                            var26.method3157(var27, var28);
                                        }
                                    }
                                } else {
                                    class171.field2711.reset();
                                    class171.field2711.update(Statics.field1449.field1986, 0, var22);
                                    int var29 = (int) class171.field2711.getValue();
                                    if (Statics.field2068.field2722 != var29) {
                                        try {
                                            Statics.field2718.method2856();
                                        } catch (Exception var35) {
                                        }
                                        class171.field2716++;
                                        Statics.field2718 = null;
                                        class171.field2717 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class171.field2716 = 0;
                                    class171.field2719 = 0;
                                    Statics.field2068.field2723.method3158((int) (Statics.field2068.field3099 & 0xFFFFL), Statics.field1449.field1986, (Statics.field2068.field3099 & 0xFF0000L) == 16711680L, Statics.field1950);
                                }
                                Statics.field2068.method3693();
                                if (Statics.field1950) {
                                    class171.field2712--;
                                } else {
                                    class171.field2701--;
                                }
                                class171.field2714 = 0;
                                Statics.field2068 = null;
                                Statics.field1449 = null;
                            } else {
                                if (class171.field2714 != 512) {
                                    break;
                                }
                                class171.field2714 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2718.method2856();
                } catch (Exception var34) {
                }
                class171.field2719++;
                Statics.field2718 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method483();
        }
    }

    @ObfuscatedName("client.c(S)V")
    public void method483() {
        if (class171.field2716 >= 4) {
            this.method2886("js5crc");
            field300 = 1000;
            return;
        }
        if (class171.field2719 >= 4) {
            if (field300 <= 5) {
                this.method2886("js5io");
                field300 = 1000;
                return;
            }
            field322 = 3000;
            class171.field2719 = 3;
        }
        if (--field322 + 1 > 0) {
            return;
        }
        try {
            if (field345 == 0) {
                Statics.field36 = Statics.field107.method2738(Statics.field3042, Statics.field17);
                field345++;
            }
            if (field345 == 1) {
                if (Statics.field36.field2216 == 2) {
                    this.method255(-1);
                    return;
                }
                if (Statics.field36.field2216 == 1) {
                    field345++;
                }
            }
            if (field345 == 2) {
                Statics.field2895 = new class143((Socket) Statics.field36.field2217, Statics.field107);
                class119 var1 = new class119(5);
                var1.method2476(15);
                var1.method2351(102);
                Statics.field2895.method2859(var1.field1986, 0, 5);
                field345++;
                Statics.field3147 = class115.method579();
            }
            if (field345 == 3) {
                if (field300 <= 5 || Statics.field2895.method2860() > 0) {
                    int var2 = Statics.field2895.method2862();
                    if (var2 != 0) {
                        this.method255(var2);
                        return;
                    }
                    field345++;
                } else if (class115.method579() - Statics.field3147 > 30000L) {
                    this.method255(-2);
                    return;
                }
            }
            if (field345 == 4) {
                class171.method3001(Statics.field2895, field300 > 20);
                Statics.field36 = null;
                Statics.field2895 = null;
                field345 = 0;
                field327 = 0;
            }
        } catch (IOException var4) {
            this.method255(-3);
        }
    }

    @ObfuscatedName("client.v(II)V")
    public void method255(int arg0) {
        Statics.field36 = null;
        Statics.field2895 = null;
        field345 = 0;
        if (Statics.field17 == Statics.field1159) {
            Statics.field17 = Statics.field1046;
        } else {
            Statics.field17 = Statics.field1159;
        }
        field327++;
        if (field327 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field300 <= 5) {
                this.method2886("js5connect_full");
                field300 = 1000;
            } else {
                field322 = 3000;
            }
        } else if (field327 >= 2 && arg0 == 6) {
            this.method2886("js5connect_outofdate");
            field300 = 1000;
        } else if (field327 >= 4) {
            if (field300 <= 5) {
                this.method2886("js5connect");
                field300 = 1000;
            } else {
                field322 = 3000;
            }
        }
    }

    @ObfuscatedName("cm.o(B)V")
    public static void method2072() {
        if (field289 == 0) {
            Statics.field39 = new class86(4, 104, 104, class6.field87);
            for (int var0 = 0; var0 < 4; var0++) {
                field355[var0] = new class108(104, 104);
            }
            Statics.field1366 = new class79(512, 512);
            class32.field738 = class157.field2310;
            class32.field730 = 5;
            field289 = 20;
        } else if (field289 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class91.field1577[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class86.method1828(var1, 500, 800, 512, 334);
            class32.field738 = class157.field2311;
            class32.field730 = 10;
            field289 = 30;
        } else if (field289 == 30) {
            Statics.field323 = method151(0, false, true, true);
            Statics.field103 = method151(1, false, true, true);
            Statics.field3213 = method151(2, true, false, true);
            Statics.field324 = method151(3, false, true, true);
            Statics.field162 = method151(4, false, true, true);
            Statics.field1888 = method151(5, true, true, true);
            Statics.field1370 = method151(6, true, true, false);
            Statics.field754 = method151(7, false, true, true);
            Statics.field1768 = method151(8, false, true, true);
            Statics.field225 = method151(9, false, true, true);
            Statics.field297 = method151(10, false, true, true);
            Statics.field2073 = method151(11, false, true, true);
            Statics.field985 = method151(12, false, true, true);
            Statics.field246 = method151(13, true, false, true);
            Statics.field457 = method151(14, false, true, false);
            Statics.field925 = method151(15, false, true, true);
            class32.field738 = class157.field2312;
            class32.field730 = 20;
            field289 = 40;
        } else if (field289 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field323.method3159() * 4 / 100;
            int var8 = var7 + Statics.field103.method3159() * 4 / 100;
            int var9 = var8 + Statics.field3213.method3159() * 2 / 100;
            int var10 = var9 + Statics.field324.method3159() * 2 / 100;
            int var11 = var10 + Statics.field162.method3159() * 6 / 100;
            int var12 = var11 + Statics.field1888.method3159() * 4 / 100;
            int var13 = var12 + Statics.field1370.method3159() * 2 / 100;
            int var14 = var13 + Statics.field754.method3159() * 60 / 100;
            int var15 = var14 + Statics.field1768.method3159() * 2 / 100;
            int var16 = var15 + Statics.field225.method3159() * 2 / 100;
            int var17 = var16 + Statics.field297.method3159() * 2 / 100;
            int var18 = var17 + Statics.field2073.method3159() * 2 / 100;
            int var19 = var18 + Statics.field985.method3159() * 2 / 100;
            int var20 = var19 + Statics.field246.method3159() * 2 / 100;
            int var21 = var20 + Statics.field457.method3159() * 2 / 100;
            int var22 = var21 + Statics.field925.method3159() * 2 / 100;
            if (var22 == 100) {
                class32.field738 = class157.field2314;
                class32.field730 = 30;
                field289 = 45;
            } else {
                if (var22 != 0) {
                    class32.field738 = class157.field2325 + var22 + "%";
                }
                class32.field730 = 30;
            }
        } else if (field289 == 45) {
            boolean var23 = !field295;
            Statics.field1189 = 22050;
            Statics.field1185 = var23;
            Statics.field1962 = 2;
            class184 var24 = new class184();
            var24.method3413(9, 128);
            Statics.field2041 = class57.method23(Statics.field107, Statics.field1362, 0, 22050);
            Statics.field2041.method1191(var24);
            class183.method2076(Statics.field925, Statics.field457, Statics.field162, var24);
            Statics.field2042 = class57.method23(Statics.field107, Statics.field1362, 1, 2048);
            Statics.field82 = new class56();
            Statics.field2042.method1191(Statics.field82);
            Statics.field632 = new class75(22050, Statics.field1189);
            class32.field738 = class157.field2547;
            class32.field730 = 35;
            field289 = 50;
        } else if (field289 == 50) {
            int var25 = 0;
            if (Statics.field349 == null) {
                class168 var26 = Statics.field1768;
                class168 var27 = Statics.field246;
                int var28 = var26.method3079("p11_full");
                int var29 = var26.method3094(var28, "");
                class224 var30 = class77.method243(var26, var27, var28, var29);
                Statics.field349 = var30;
            } else {
                var25++;
            }
            if (Statics.field1393 == null) {
                class168 var31 = Statics.field1768;
                class168 var32 = Statics.field246;
                int var33 = var31.method3079("p12_full");
                int var34 = var31.method3094(var33, "");
                class224 var35 = class77.method243(var31, var32, var33, var34);
                Statics.field1393 = var35;
            } else {
                var25++;
            }
            if (Statics.field221 == null) {
                class168 var36 = Statics.field1768;
                class168 var37 = Statics.field246;
                int var38 = var36.method3079("b12_full");
                int var39 = var36.method3094(var38, "");
                class224 var40 = class77.method243(var36, var37, var38, var39);
                Statics.field221 = var40;
            } else {
                var25++;
            }
            if (var25 < 3) {
                class32.field738 = class157.field2316 + var25 * 100 / 3 + "%";
                class32.field730 = 40;
            } else {
                Statics.field654 = new class160(true);
                class32.field738 = class157.field2352;
                class32.field730 = 40;
                field289 = 60;
            }
        } else if (field289 == 60) {
            class168 var41 = Statics.field297;
            class168 var42 = Statics.field1768;
            int var43 = 0;
            if (var41.method3096("title.jpg", "")) {
                var43++;
            }
            if (var42.method3096("logo", "")) {
                var43++;
            }
            if (var42.method3096("logo_deadman_mode", "")) {
                var43++;
            }
            if (var42.method3096("titlebox", "")) {
                var43++;
            }
            if (var42.method3096("titlebutton", "")) {
                var43++;
            }
            if (var42.method3096("runes", "")) {
                var43++;
            }
            if (var42.method3096("title_mute", "")) {
                var43++;
            }
            if (var42.method3097("options_radio_buttons,0")) {
                var43++;
            }
            if (var42.method3097("options_radio_buttons,2")) {
                var43++;
            }
            var42.method3096("sl_back", "");
            var42.method3096("sl_flags", "");
            var42.method3096("sl_arrows", "");
            var42.method3096("sl_stars", "");
            var42.method3096("sl_button", "");
            int var46 = class32.method2053();
            if (var43 < var46) {
                class32.field738 = class157.field2318 + var43 * 100 / var46 + "%";
                class32.field730 = 50;
            } else {
                class32.field738 = class157.field2377;
                class32.field730 = 50;
                method43(5);
                field289 = 70;
            }
        } else if (field289 == 70) {
            if (Statics.field3213.method3143()) {
                class168 var47 = Statics.field3213;
                Statics.field1060 = var47;
                class42.method2297(Statics.field3213);
                class45.method162(Statics.field3213, Statics.field754);
                class41.method146(Statics.field3213, Statics.field754, field295);
                class40.method2165(Statics.field3213, Statics.field754);
                class52.method2657(Statics.field3213, Statics.field754, field577, Statics.field349);
                class43.method3713(Statics.field3213, Statics.field323, Statics.field103);
                class168 var48 = Statics.field3213;
                class168 var49 = Statics.field754;
                Statics.field1019 = var48;
                Statics.field1012 = var49;
                class48.method2078(Statics.field3213);
                class168 var50 = Statics.field3213;
                Statics.field1162 = var50;
                Statics.field1966 = Statics.field1162.method3088(16);
                class168 var51 = Statics.field324;
                class168 var52 = Statics.field754;
                class168 var53 = Statics.field1768;
                class168 var54 = Statics.field246;
                Statics.field657 = var51;
                Statics.field2729 = var52;
                Statics.field2130 = var53;
                Statics.field2823 = var54;
                Statics.field2811 = new class173[Statics.field657.method3089()][];
                Statics.field2728 = new boolean[Statics.field657.method3089()];
                class168 var55 = Statics.field3213;
                Statics.field1103 = var55;
                class49.method2674(Statics.field3213);
                class168 var56 = Statics.field3213;
                Statics.field1048 = var56;
                class168 var57 = Statics.field3213;
                Statics.field1095 = var57;
                Statics.field1885 = new class20();
                class32.field738 = class157.field2321;
                class32.field730 = 60;
                field289 = 80;
            } else {
                class32.field738 = class157.field2320 + Statics.field3213.method3161() + "%";
                class32.field730 = 60;
            }
        } else if (field289 == 80) {
            int var58 = 0;
            if (Statics.field2070 == null) {
                Statics.field2070 = class77.method607(Statics.field1768, "compass", "");
            } else {
                var58++;
            }
            if (Statics.field14 == null) {
                Statics.field14 = class77.method607(Statics.field1768, "mapedge", "");
            } else {
                var58++;
            }
            if (Statics.field18 == null) {
                Statics.field18 = class77.method1533(Statics.field1768, "mapscene", "");
            } else {
                var58++;
            }
            if (Statics.field711 == null) {
                Statics.field711 = class77.method995(Statics.field1768, "mapfunction", "");
            } else {
                var58++;
            }
            if (Statics.field2287 == null) {
                Statics.field2287 = class77.method995(Statics.field1768, "hitmarks", "");
            } else {
                var58++;
            }
            if (Statics.field2122 == null) {
                Statics.field2122 = class77.method995(Statics.field1768, "headicons_pk", "");
            } else {
                var58++;
            }
            if (Statics.field214 == null) {
                Statics.field214 = class77.method995(Statics.field1768, "headicons_prayer", "");
            } else {
                var58++;
            }
            if (Statics.field2087 == null) {
                Statics.field2087 = class77.method995(Statics.field1768, "headicons_hint", "");
            } else {
                var58++;
            }
            if (Statics.field2132 == null) {
                Statics.field2132 = class77.method995(Statics.field1768, "mapmarker", "");
            } else {
                var58++;
            }
            if (Statics.field373 == null) {
                Statics.field373 = class77.method995(Statics.field1768, "cross", "");
            } else {
                var58++;
            }
            if (Statics.field79 == null) {
                Statics.field79 = class77.method995(Statics.field1768, "mapdots", "");
            } else {
                var58++;
            }
            if (Statics.field2639 == null) {
                Statics.field2639 = class77.method1533(Statics.field1768, "scrollbar", "");
            } else {
                var58++;
            }
            if (Statics.field168 == null) {
                Statics.field168 = class77.method1533(Statics.field1768, "mod_icons", "");
            } else {
                var58++;
            }
            if (var58 < 13) {
                class32.field738 = class157.field2380 + var58 * 100 / 13 + "%";
                class32.field730 = 70;
            } else {
                Statics.field3178 = Statics.field168;
                Statics.field14.method1690();
                int var59 = (int) (Math.random() * 21.0D) - 10;
                int var60 = (int) (Math.random() * 21.0D) - 10;
                int var61 = (int) (Math.random() * 21.0D) - 10;
                int var62 = (int) (Math.random() * 41.0D) - 20;
                for (int var63 = 0; var63 < Statics.field711.length; var63++) {
                    Statics.field711[var63].method1703(var59 + var62, var60 + var62, var61 + var62);
                }
                Statics.field18[0].method1763(var59 + var62, var60 + var62, var61 + var62);
                class32.field738 = class157.field2323;
                class32.field730 = 70;
                field289 = 90;
            }
        } else if (field289 == 90) {
            if (Statics.field225.method3143()) {
                class95 var64 = new class95(Statics.field225, Statics.field1768, 20, 0.8D, field295 ? 64 : 128);
                class91.method1987(var64);
                class91.method1988(0.8D);
                class32.field738 = class157.field2566;
                class32.field730 = 90;
                field289 = 110;
            } else {
                class32.field738 = class157.field2324 + Statics.field225.method3161() + "%";
                class32.field730 = 90;
            }
        } else if (field289 == 110) {
            Statics.field2159 = new class14();
            Statics.field107.method2742(Statics.field2159, 10);
            class32.field738 = class157.field2326;
            class32.field730 = 94;
            field289 = 120;
        } else if (field289 == 120) {
            if (Statics.field297.method3096("huffman", "")) {
                class113 var65 = new class113(Statics.field297.method3095("huffman", ""));
                Statics.field3167 = var65;
                class32.field738 = class157.field2328;
                class32.field730 = 96;
                field289 = 130;
            } else {
                class32.field738 = class157.field2327 + "%";
                class32.field730 = 96;
            }
        } else if (field289 == 130) {
            if (!Statics.field324.method3143()) {
                class32.field738 = class157.field2329 + Statics.field324.method3161() * 4 / 5 + "%";
                class32.field730 = 100;
            } else if (!Statics.field985.method3143()) {
                class32.field738 = class157.field2329 + (80 + Statics.field985.method3161() / 6) + "%";
                class32.field730 = 100;
            } else if (Statics.field246.method3143()) {
                class32.field738 = class157.field2508;
                class32.field730 = 100;
                field289 = 140;
            } else {
                class32.field738 = class157.field2329 + (96 + Statics.field246.method3161() / 20) + "%";
                class32.field730 = 100;
            }
        } else if (field289 == 140) {
            method43(10);
        }
    }

    @ObfuscatedName("o.n(IZZZI)Lfn;")
    public static class168 method151(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class134 var4 = null;
        if (class149.field2225 != null) {
            var4 = new class134(arg0, class149.field2225, Statics.field1092[arg0], 1000000);
        }
        return new class168(var4, Statics.field2676, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("au.k(I)V")
    public static final void method821() {
        try {
            if (field328 == 0) {
                if (Statics.field2589 != null) {
                    Statics.field2589.method2856();
                    Statics.field2589 = null;
                }
                Statics.field2137 = null;
                field325 = false;
                field329 = 0;
                field328 = 1;
            }
            if (field328 == 1) {
                if (Statics.field2137 == null) {
                    Statics.field2137 = Statics.field107.method2738(Statics.field3042, Statics.field17);
                }
                if (Statics.field2137.field2216 == 2) {
                    throw new IOException();
                }
                if (Statics.field2137.field2216 == 1) {
                    Statics.field2589 = new class143((Socket) Statics.field2137.field2217, Statics.field107);
                    Statics.field2137 = null;
                    field328 = 2;
                }
            }
            if (field328 == 2) {
                field367.field1977 = 0;
                field367.method2476(14);
                Statics.field2589.method2859(field367.field1986, 0, 1);
                field339.field1977 = 0;
                field328 = 3;
            }
            if (field328 == 3) {
                if (Statics.field2041 != null) {
                    Statics.field2041.method1193();
                }
                if (Statics.field2042 != null) {
                    Statics.field2042.method1193();
                }
                int var0 = Statics.field2589.method2862();
                if (Statics.field2041 != null) {
                    Statics.field2041.method1193();
                }
                if (Statics.field2042 != null) {
                    Statics.field2042.method1193();
                }
                if (var0 != 0) {
                    method730(var0);
                    return;
                }
                field339.field1977 = 0;
                field328 = 5;
            }
            if (field328 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field367.field1977 = 0;
                field367.method2476(1);
                field367.method2476(class32.field733.method569());
                field367.method2351(var1[0]);
                field367.method2351(var1[1]);
                field367.method2351(var1[2]);
                field367.method2351(var1[3]);
                switch(class32.field733.field2590) {
                    case 0:
                        field367.field1977 += 8;
                        break;
                    case 1:
                    case 2:
                        field367.method2537(Statics.field3140);
                        field367.field1977 += 5;
                        break;
                    case 3:
                        field367.method2351((Integer) Statics.field783.field149.get(class163.method3712(class32.field750)));
                        field367.field1977 += 4;
                }
                field367.method2354(class32.field734);
                field367.method2416(class5.field83, class5.field78);
                field338.field1977 = 0;
                if (field300 == 40) {
                    field338.method2476(18);
                } else {
                    field338.method2476(16);
                }
                field338.method2349(0);
                int var2 = field338.field1977;
                field338.method2351(102);
                field338.method2382(field367.field1986, 0, field367.field1977);
                int var3 = field338.field1977;
                field338.method2354(class32.field750);
                field338.method2476((field508 ? 1 : 0) << 1 | (field295 ? 1 : 0));
                field338.method2349(Statics.field2014);
                field338.method2349(Statics.field2019);
                class122 var4 = field338;
                byte[] var5 = new byte[24];
                try {
                    class149.field2235.method3936(0L);
                    class149.field2235.method3923(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var29) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2382(var5, 0, 24);
                field338.method2354(Statics.field2072);
                field338.method2351(Statics.field209);
                class119 var9 = new class119(Statics.field654.method3000());
                Statics.field654.method2993(var9);
                field338.method2382(var9.field1986, 0, var9.field1986.length);
                field338.method2476(Statics.field1954);
                field338.method2351(Statics.field323.field2658);
                field338.method2351(Statics.field103.field2658);
                field338.method2351(Statics.field3213.field2658);
                field338.method2351(Statics.field324.field2658);
                field338.method2351(Statics.field162.field2658);
                field338.method2351(Statics.field1888.field2658);
                field338.method2351(Statics.field1370.field2658);
                field338.method2351(Statics.field754.field2658);
                field338.method2351(Statics.field1768.field2658);
                field338.method2351(Statics.field225.field2658);
                field338.method2351(Statics.field297.field2658);
                field338.method2351(Statics.field2073.field2658);
                field338.method2351(Statics.field985.field2658);
                field338.method2351(Statics.field246.field2658);
                field338.method2351(Statics.field457.field2658);
                field338.method2351(Statics.field925.field2658);
                field338.method2499(var1, var3, field338.field1977);
                field338.method2418(field338.field1977 - var2);
                Statics.field2589.method2859(field338.field1986, 0, field338.field1977);
                field367.method2611(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field339.method2611(var1);
                field328 = 6;
            }
            if (field328 == 6 && Statics.field2589.method2860() > 0) {
                int var11 = Statics.field2589.method2862();
                if (var11 == 21 && field300 == 20) {
                    field328 = 7;
                } else if (var11 == 2) {
                    field328 = 9;
                } else if (var11 == 15 && field300 == 40) {
                    field340 = -1;
                    field328 = 13;
                } else if (var11 == 23 && field330 < 1) {
                    field330++;
                    field328 = 0;
                } else if (var11 == 29) {
                    field328 = 11;
                } else {
                    method730(var11);
                    return;
                }
            }
            if (field328 == 7 && Statics.field2589.method2860() > 0) {
                field333 = (Statics.field2589.method2862() + 3) * 60;
                field328 = 8;
            }
            if (field328 == 8) {
                field329 = 0;
                class32.method760(class157.field2334, class157.field2335, field333 / 60 + class157.field2336);
                if (--field333 <= 0) {
                    field328 = 0;
                }
            } else {
                if (field328 == 9 && Statics.field2589.method2860() >= 13) {
                    boolean var12 = Statics.field2589.method2862() == 1;
                    Statics.field2589.method2858(field339.field1986, 0, 4);
                    field339.field1977 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field339.method2620() << 24;
                        int var15 = var14 | field339.method2620() << 16;
                        int var16 = var15 | field339.method2620() << 8;
                        int var17 = var16 | field339.method2620();
                        int var18 = class163.method3712(class32.field750);
                        if (Statics.field783.field149.size() >= 10 && !Statics.field783.field149.containsKey(var18)) {
                            Iterator var19 = Statics.field783.field149.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field783.field149.put(var18, var17);
                        class9.method2298();
                    }
                    field461 = Statics.field2589.method2862();
                    field463 = Statics.field2589.method2862() == 1;
                    field418 = Statics.field2589.method2862();
                    field418 <<= 0x8;
                    field418 += Statics.field2589.method2862();
                    field419 = Statics.field2589.method2862();
                    Statics.field2589.method2858(field339.field1986, 0, 1);
                    field339.field1977 = 0;
                    field341 = field339.method2620();
                    Statics.field2589.method2858(field339.field1986, 0, 2);
                    field339.field1977 = 0;
                    field340 = field339.method2376();
                    if (field419 == 1) {
                        try {
                            class132.method2711(Statics.field290, "zap");
                        } catch (Throwable var28) {
                        }
                    } else {
                        try {
                            class132.method2711(Statics.field290, "unzap");
                        } catch (Throwable var27) {
                        }
                    }
                    field328 = 10;
                }
                if (field328 != 10) {
                    if (field328 == 11 && Statics.field2589.method2860() >= 2) {
                        field339.field1977 = 0;
                        Statics.field2589.method2858(field339.field1986, 0, 2);
                        field339.field1977 = 0;
                        Statics.field175 = field339.method2376();
                        field328 = 12;
                    }
                    if (field328 == 12 && Statics.field2589.method2860() >= Statics.field175) {
                        field339.field1977 = 0;
                        Statics.field2589.method2858(field339.field1986, 0, Statics.field175);
                        field339.field1977 = 0;
                        String var22 = field339.method2370();
                        String var23 = field339.method2370();
                        String var24 = field339.method2370();
                        class32.method760(var22, var23, var24);
                        method43(10);
                    }
                    if (field328 == 13) {
                        if (field340 == -1) {
                            if (Statics.field2589.method2860() < 2) {
                                return;
                            }
                            Statics.field2589.method2858(field339.field1986, 0, 2);
                            field339.field1977 = 0;
                            field340 = field339.method2376();
                        }
                        if (Statics.field2589.method2860() >= field340) {
                            Statics.field2589.method2858(field339.field1986, 0, field340);
                            field339.field1977 = 0;
                            int var25 = field340;
                            method1977();
                            class33.method1007(field339);
                            if (field339.field1977 != var25) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field329++;
                        if (field329 > 2000) {
                            if (field330 < 1) {
                                if (Statics.field17 == Statics.field1159) {
                                    Statics.field17 = Statics.field1046;
                                } else {
                                    Statics.field17 = Statics.field1159;
                                }
                                field330++;
                                field328 = 0;
                            } else {
                                method730(-3);
                            }
                        }
                    }
                } else if (Statics.field2589.method2860() >= field340) {
                    field339.field1977 = 0;
                    Statics.field2589.method2858(field339.field1986, 0, field340);
                    method2311();
                    class33.method1007(field339);
                    Statics.field256 = -1;
                    method2172(false);
                    field341 = -1;
                }
            }
        } catch (IOException var30) {
            if (field330 < 1) {
                if (Statics.field17 == Statics.field1159) {
                    Statics.field17 = Statics.field1046;
                } else {
                    Statics.field17 = Statics.field1159;
                }
                field330++;
                field328 = 0;
            } else {
                method730(-2);
            }
        }
    }

    @ObfuscatedName("dw.f(I)V")
    public static void method2311() {
        field303 = 1L;
        field306 = -1;
        Statics.field2159.field204 = 0;
        Statics.field1363 = true;
        field307 = true;
        field520 = -1L;
        class211.method2056();
        field367.field1977 = 0;
        field339.field1977 = 0;
        field341 = -1;
        field344 = -1;
        field433 = -1;
        field346 = -1;
        field342 = 0;
        field387 = 0;
        field347 = 0;
        field326 = 0;
        field436 = 0;
        field442 = false;
        class140.method180(0);
        class12.method179();
        field369 = 0;
        field449 = false;
        field393 = 0;
        field528 = (int) (Math.random() * 100.0D) - 50;
        field469 = (int) (Math.random() * 110.0D) - 55;
        field522 = (int) (Math.random() * 80.0D) - 40;
        field558 = (int) (Math.random() * 120.0D) - 60;
        field481 = (int) (Math.random() * 30.0D) - 20;
        field573 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field530 = 0;
        field523 = -1;
        field483 = 0;
        field381 = 0;
        field405 = class21.field583;
        field319 = class21.field583;
        field404 = 0;
        class33.field767 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class33.field766[var0] = null;
            class33.field765[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field575[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field351[var2] = null;
        }
        field539 = -1;
        field451.method3622();
        field430.method3622();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field427[var3][var4][var5] = null;
                }
            }
        }
        field428 = new class199();
        field562 = 0;
        field561 = 0;
        field472 = 0;
        for (int var6 = 0; var6 < Statics.field1966; var6++) {
            class53 var7 = class53.method122(var6);
            if (var7 != null) {
                class176.field2884[var6] = 0;
                class176.field2885[var6] = 0;
            }
        }
        Statics.field1885.method208();
        field462 = -1;
        if (field454 != -1) {
            class173.method2968(field454);
        }
        for (class4 var8 = (class4) field455.method3571(); var8 != null; var8 = (class4) field455.method3572()) {
            method718(var8, true);
        }
        field454 = -1;
        field455 = new class196(8);
        field489 = null;
        field442 = false;
        field436 = 0;
        field503.method3283((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field423[var9] = null;
            field424[var9] = false;
        }
        class16.field226 = new class196(32);
        field301 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field578[var10] = true;
        }
        field367.method2612(231);
        field367.method2476(method11());
        field367.method2349(Statics.field2014);
        field367.method2349(Statics.field2019);
        field550 = null;
        Statics.field1547 = 0;
        Statics.field142 = null;
        for (int var11 = 0; var11 < 8; var11++) {
            field570[var11] = new class220();
        }
        Statics.field233 = null;
    }

    @ObfuscatedName("cr.x(I)V")
    public static void method1977() {
        field367.field1977 = 0;
        field339.field1977 = 0;
        field341 = -1;
        field344 = -1;
        field433 = -1;
        field346 = -1;
        field340 = 0;
        field342 = 0;
        field387 = 0;
        field436 = 0;
        field442 = false;
        field530 = 0;
        field483 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field575[var0] = null;
        }
        Statics.field176 = null;
        for (int var1 = 0; var1 < field351.length; var1++) {
            class35 var2 = field351[var1];
            if (var2 != null) {
                var2.field848 = -1;
                var2.field841 = false;
            }
        }
        class16.field226 = new class196(32);
        method43(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field578[var3] = true;
        }
        field367.method2612(231);
        field367.method2476(method11());
        field367.method2349(Statics.field2014);
        field367.method2349(Statics.field2019);
    }

    @ObfuscatedName("aw.j(IB)V")
    public static void method730(int arg0) {
        if (arg0 == -3) {
            class32.method760(class157.field2491, class157.field2520, class157.field2339);
        } else if (arg0 == -2) {
            class32.method760(class157.field2306, class157.field2341, class157.field2407);
        } else if (arg0 == -1) {
            class32.method760(class157.field2343, class157.field2358, class157.field2539);
        } else if (arg0 == 3) {
            class32.method760(class157.field2346, class157.field2347, class157.field2348);
        } else if (arg0 == 4) {
            class32.method760(class157.field2349, class157.field2350, class157.field2423);
        } else if (arg0 == 5) {
            class32.method760(class157.field2370, class157.field2322, class157.field2354);
        } else if (arg0 == 6) {
            class32.method760(class157.field2355, class157.field2418, class157.field2357);
        } else if (arg0 == 7) {
            class32.method760(class157.field2534, class157.field2359, class157.field2360);
        } else if (arg0 == 8) {
            class32.method760(class157.field2506, class157.field2362, class157.field2363);
        } else if (arg0 == 9) {
            class32.method760(class157.field2411, class157.field2365, class157.field2479);
        } else if (arg0 == 10) {
            class32.method760(class157.field2367, class157.field2368, class157.field2369);
        } else if (arg0 == 11) {
            class32.method760(class157.field2552, class157.field2345, class157.field2403);
        } else if (arg0 == 12) {
            class32.method760(class157.field2395, class157.field2374, class157.field2375);
        } else if (arg0 == 13) {
            class32.method760(class157.field2376, class157.field2432, class157.field2483);
        } else if (arg0 == 14) {
            class32.method760(class157.field2379, class157.field2344, class157.field2504);
        } else if (arg0 == 16) {
            class32.method760(class157.field2382, class157.field2383, class157.field2384);
        } else if (arg0 == 17) {
            class32.method760(class157.field2385, class157.field2386, class157.field2387);
        } else if (arg0 == 18) {
            class32.method760(class157.field2388, class157.field2389, class157.field2390);
        } else if (arg0 == 19) {
            class32.method760(class157.field2391, class157.field2353, class157.field2393);
        } else if (arg0 == 20) {
            class32.method760(class157.field2394, class157.field2364, class157.field2433);
        } else if (arg0 == 22) {
            class32.method760(class157.field2397, class157.field2317, class157.field2399);
        } else if (arg0 == 23) {
            class32.method760(class157.field2400, class157.field2401, class157.field2402);
        } else if (arg0 == 24) {
            class32.method760(class157.field2371, class157.field2373, class157.field2405);
        } else if (arg0 == 25) {
            class32.method760(class157.field2406, class157.field2514, class157.field2408);
        } else if (arg0 == 26) {
            class32.method760(class157.field2409, class157.field2410, class157.field2516);
        } else if (arg0 == 27) {
            class32.method760(class157.field2412, class157.field2528, class157.field2414);
        } else if (arg0 == 31) {
            class32.method760(class157.field2404, class157.field2422, class157.field2338);
        } else if (arg0 == 32) {
            class32.method760(class157.field2556, class157.field2425, class157.field2511);
        } else if (arg0 == 37) {
            class32.method760(class157.field2427, class157.field2428, class157.field2332);
        } else if (arg0 == 38) {
            class32.method760(class157.field2430, class157.field2518, class157.field2538);
        } else if (arg0 == 55) {
            class32.method760(class157.field2436, class157.field2434, class157.field2435);
        } else if (arg0 == 56) {
            class32.method760(class157.field2297, class157.field2437, class157.field2438);
            method43(11);
            return;
        } else if (arg0 == 57) {
            class32.method760(class157.field2502, class157.field2440, class157.field2441);
            method43(11);
            return;
        } else {
            class32.method760(class157.field2442, class157.field2560, class157.field2444);
        }
        method43(10);
    }

    @ObfuscatedName("a.r(I)V")
    public static final void method568() {
        if (Statics.field2589 != null) {
            Statics.field2589.method2856();
            Statics.field2589 = null;
        }
        method1008();
        Statics.field39.method1855();
        for (int var0 = 0; var0 < 4; var0++) {
            field355[var0].method2270();
        }
        System.gc();
        Statics.method3179(2);
        field532 = -1;
        field533 = false;
        class24.method727();
        method43(10);
    }

    @ObfuscatedName("ac.y(I)V")
    public static final void method1008() {
        class47.field1065.method3532();
        class42.method192();
        class45.method1006();
        class41.field929.method3532();
        class41.field930.method3532();
        class41.field966.method3532();
        class41.field932.method3532();
        class40.field912.method3532();
        class40.field891.method3532();
        class52.method124();
        class43.field1005.method3532();
        class43.field990.method3532();
        class44.field1013.method3532();
        class44.field1014.method3532();
        class48.method121();
        class53.field1161.method3532();
        class179.method110();
        class173.field2731.method3532();
        class173.field2732.method3532();
        class173.field2733.method3532();
        class173.field2734.method3532();
        ((class95) Statics.field1554).method2060();
        class23.field595.method3532();
        Statics.field323.method3091();
        Statics.field103.method3091();
        Statics.field324.method3091();
        Statics.field162.method3091();
        Statics.field1888.method3091();
        Statics.field1370.method3091();
        Statics.field754.method3091();
        Statics.field1768.method3091();
        Statics.field225.method3091();
        Statics.field297.method3091();
        Statics.field2073.method3091();
        Statics.field985.method3091();
    }

    @ObfuscatedName("b.t(B)V")
    public static final void method13() {
        if (field347 > 0) {
            method568();
        } else {
            method43(40);
            Statics.field762 = Statics.field2589;
            Statics.field2589 = null;
        }
    }

    @ObfuscatedName("p.a(I)V")
    public static final void method107() {
        if (field387 > 1) {
            field387--;
        }
        if (field347 > 0) {
            field347--;
        }
        if (field325) {
            field325 = false;
            method13();
            return;
        }
        if (!field442) {
            field441[0] = class157.field2533;
            field318[0] = "";
            field439[0] = 1006;
            field436 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field2589 == null) {
                var1 = false;
            } else {
                label2844: {
                    try {
                        int var2 = Statics.field2589.method2860();
                        if (var2 == 0) {
                            var1 = false;
                            break label2844;
                        }
                        if (field341 == -1) {
                            Statics.field2589.method2858(field339.field1986, 0, 1);
                            field339.field1977 = 0;
                            field341 = field339.method2620();
                            field340 = class188.field3030[field341];
                            var2--;
                        }
                        if (field340 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2844;
                            }
                            Statics.field2589.method2858(field339.field1986, 0, 1);
                            field340 = field339.field1986[0] & 0xFF;
                            var2--;
                        }
                        if (field340 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2844;
                            }
                            Statics.field2589.method2858(field339.field1986, 0, 2);
                            field339.field1977 = 0;
                            field340 = field339.method2376();
                            var2 -= 2;
                        }
                        if (var2 < field340) {
                            var1 = false;
                            break label2844;
                        }
                        field339.field1977 = 0;
                        Statics.field2589.method2858(field339.field1986, 0, field340);
                        field342 = 0;
                        field346 = field433;
                        field433 = field344;
                        field344 = field341;
                        if (field341 == 168) {
                            field563 = false;
                            for (int var3 = 0; var3 < 5; var3++) {
                                field543[var3] = false;
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 191) {
                            int var4 = field339.method2408();
                            Statics.field80 = Statics.field107.method2739(var4);
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 68) {
                            method105();
                            int var5 = field339.method2389();
                            int var6 = field339.method2464();
                            int var7 = field339.method2390();
                            field379[var7] = var6;
                            field431[var7] = var5;
                            field432[var7] = 1;
                            for (int var8 = 0; var8 < 98; var8++) {
                                if (var6 >= class155.field2285[var8]) {
                                    field432[var7] = var8 + 2;
                                }
                            }
                            field484[++field485 - 1 & 0x1F] = var7;
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 92) {
                            int var9 = field339.method2368();
                            field454 = var9;
                            method3011(field454, Statics.field2014, Statics.field2019, false);
                            Statics.method164(var9);
                            class37.method2983(field454);
                            for (int var10 = 0; var10 < 100; var10++) {
                                field578[var10] = true;
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 46) {
                            boolean var11 = field339.method2362() == 1;
                            if (var11) {
                                Statics.field1867 = class115.method579() - field339.method2564();
                                Statics.field233 = new class221(field339, true);
                            } else {
                                Statics.field233 = null;
                            }
                            field356 = field567;
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 211) {
                            int var12 = field339.method2376();
                            byte var13 = field339.method2392();
                            class176.field2884[var12] = var13;
                            if (class176.field2885[var12] != var13) {
                                class176.field2885[var12] = var13;
                            }
                            method152(var12);
                            field480[++field486 - 1 & 0x1F] = var12;
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 241) {
                            int var14 = field340 + field339.field1977;
                            int var15 = field339.method2376();
                            int var16 = field339.method2376();
                            if (field454 != var15) {
                                field454 = var15;
                                method3011(field454, Statics.field2014, Statics.field2019, false);
                                Statics.method164(field454);
                                class37.method2983(field454);
                                for (int var17 = 0; var17 < 100; var17++) {
                                    field578[var17] = true;
                                }
                            }
                            while (var16-- > 0) {
                                int var18 = field339.method2367();
                                int var19 = field339.method2376();
                                int var20 = field339.method2362();
                                class4 var21 = (class4) field455.method3573((long) var18);
                                if (var21 != null && var21.field74 != var19) {
                                    method718(var21, true);
                                    var21 = null;
                                }
                                if (var21 == null) {
                                    var21 = Statics.method759(var18, var19, var20);
                                }
                                var21.field71 = true;
                            }
                            for (class4 var22 = (class4) field455.method3571(); var22 != null; var22 = (class4) field455.method3572()) {
                                if (var22.field71) {
                                    var22.field71 = false;
                                } else {
                                    method718(var22, true);
                                }
                            }
                            field496 = new class196(512);
                            while (field339.field1977 < var14) {
                                int var23 = field339.method2367();
                                int var24 = field339.method2376();
                                int var25 = field339.method2376();
                                int var26 = field339.method2367();
                                for (int var27 = var24; var27 <= var25; var27++) {
                                    long var28 = ((long) var23 << 32) + (long) var27;
                                    field496.method3569(new class201(var26), var28);
                                }
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 73) {
                            String var30 = field339.method2370();
                            class122 var31 = field339;
                            String var32 = class222.method3067(var31, 32767);
                            String var33 = class223.method3887(class163.method2256(var32));
                            class12.method2737(6, var30, var33);
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 252) {
                            int var34 = field339.method2367();
                            int var35 = field339.method2367();
                            if (Statics.field788 == null || !Statics.field788.isValid()) {
                                try {
                                    Iterator var36 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                    while (var36.hasNext()) {
                                        GarbageCollectorMXBean var37 = (GarbageCollectorMXBean) var36.next();
                                        if (var37.isValid()) {
                                            Statics.field788 = var37;
                                            field547 = -1L;
                                            field571 = -1L;
                                        }
                                    }
                                } catch (Throwable var442) {
                                }
                            }
                            long var39 = class115.method579();
                            int var41 = -1;
                            if (Statics.field788 != null) {
                                long var42 = Statics.field788.getCollectionTime();
                                if (field571 != -1L) {
                                    long var44 = var42 - field571;
                                    long var46 = var39 - field547;
                                    if (var46 != 0L) {
                                        var41 = (int) (var44 * 100L / var46);
                                    }
                                }
                                field571 = var42;
                                field547 = var39;
                            }
                            field367.method2612(10);
                            field367.method2385(var41);
                            field367.method2387(field2189);
                            field367.method2404(var34);
                            field367.method2404(var35);
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 213) {
                            for (int var48 = 0; var48 < Statics.field1966; var48++) {
                                class53 var49 = class53.method122(var48);
                                if (var49 != null) {
                                    class176.field2884[var48] = 0;
                                    class176.field2885[var48] = 0;
                                }
                            }
                            method105();
                            field486 += 32;
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 132) {
                            class26 var50 = new class26();
                            var50.field639 = field339.method2370();
                            var50.field646 = field339.method2376();
                            int var51 = field339.method2367();
                            var50.field650 = var51;
                            method43(45);
                            Statics.field2589.method2856();
                            Statics.field2589 = null;
                            class32.method567(var50);
                            field341 = -1;
                            var1 = false;
                            break label2844;
                        }
                        if (field341 == 203) {
                            Statics.field359 = field339.method2388();
                            Statics.field134 = field339.method2389();
                            while (field339.field1977 < field340) {
                                field341 = field339.method2362();
                                method660();
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 83) {
                            int var52 = field339.method2508();
                            int var53 = field339.method2388();
                            int var54 = field339.method2549();
                            class4 var55 = (class4) field455.method3573((long) var54);
                            if (var55 != null) {
                                method718(var55, var55.field74 != var52);
                            }
                            Statics.method759(var54, var52, var53);
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 72) {
                            field562 = 1;
                            field487 = field567;
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 180) {
                            String var56 = field339.method2370();
                            int var57 = field339.method2376();
                            byte var58 = field339.method2391();
                            boolean var59 = false;
                            if (var58 == -128) {
                                var59 = true;
                            }
                            if (var59) {
                                if (Statics.field1547 == 0) {
                                    field341 = -1;
                                    var1 = true;
                                    break label2844;
                                }
                                boolean var60 = false;
                                int var61;
                                for (var61 = 0; var61 < Statics.field1547 && (!Statics.field142[var61].field631.equals(var56) || Statics.field142[var61].field628 != var57); var61++) {
                                }
                                if (var61 < Statics.field1547) {
                                    while (var61 < Statics.field1547 - 1) {
                                        Statics.field142[var61] = Statics.field142[var61 + 1];
                                        var61++;
                                    }
                                    Statics.field1547--;
                                    Statics.field142[Statics.field1547] = null;
                                }
                            } else {
                                field339.method2370();
                                class25 var62 = new class25();
                                var62.field631 = var56;
                                var62.field627 = class164.method843(var62.field631, Statics.field309);
                                var62.field628 = var57;
                                var62.field629 = var58;
                                int var63;
                                for (var63 = Statics.field1547 - 1; var63 >= 0; var63--) {
                                    int var64 = Statics.field142[var63].field627.compareTo(var62.field627);
                                    if (var64 == 0) {
                                        Statics.field142[var63].field628 = var57;
                                        Statics.field142[var63].field629 = var58;
                                        if (var56.equals(Statics.field176.field52)) {
                                            Statics.field2277 = var58;
                                        }
                                        field466 = field567;
                                        field341 = -1;
                                        var1 = true;
                                        break label2844;
                                    }
                                    if (var64 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field1547 >= Statics.field142.length) {
                                    field341 = -1;
                                    var1 = true;
                                    break label2844;
                                }
                                for (int var65 = Statics.field1547 - 1; var65 > var63; var65--) {
                                    Statics.field142[var65 + 1] = Statics.field142[var65];
                                }
                                if (Statics.field1547 == 0) {
                                    Statics.field142 = new class25[100];
                                }
                                Statics.field142[var63 + 1] = var62;
                                Statics.field1547++;
                                if (var56.equals(Statics.field176.field52)) {
                                    Statics.field2277 = var58;
                                }
                            }
                            field466 = field567;
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 102) {
                            field326 = field339.method2362();
                            if (field326 == 1) {
                                field311 = field339.method2376();
                            }
                            if (field326 >= 2 && field326 <= 6) {
                                if (field326 == 2) {
                                    field353 = 64;
                                    field317 = 64;
                                }
                                if (field326 == 3) {
                                    field353 = 0;
                                    field317 = 64;
                                }
                                if (field326 == 4) {
                                    field353 = 128;
                                    field317 = 64;
                                }
                                if (field326 == 5) {
                                    field353 = 64;
                                    field317 = 0;
                                }
                                if (field326 == 6) {
                                    field353 = 64;
                                    field317 = 128;
                                }
                                field326 = 2;
                                field313 = field339.method2376();
                                field314 = field339.method2376();
                                field315 = field339.method2362();
                            }
                            if (field326 == 10) {
                                field420 = field339.method2376();
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 248) {
                            int var66 = field339.method2367();
                            int var67 = field339.method2399();
                            int var68 = field339.method2399();
                            class173 var69 = class173.method1976(var66);
                            var69.field2847 = (var68 << 16) + var67;
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 79) {
                            int var70 = field339.method2399();
                            class16.method15(var70);
                            field321[++field494 - 1 & 0x1F] = var70 & 0x7FFF;
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 116) {
                            method105();
                            field460 = field339.method2365();
                            field491 = field567;
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 135) {
                            int var71 = field339.method2408();
                            int var72 = field339.method2399();
                            class176.field2884[var72] = var71;
                            if (class176.field2885[var72] != var71) {
                                class176.field2885[var72] = var71;
                            }
                            method152(var72);
                            field480[++field486 - 1 & 0x1F] = var72;
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 32) {
                            int var73 = field339.method2549();
                            class173 var74 = class173.method1976(var73);
                            for (int var75 = 0; var75 < var74.field2853.length; var75++) {
                                var74.field2853[var75] = -1;
                                var74.field2853[var75] = 0;
                            }
                            method2721(var74);
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 246) {
                            field339.field1977 += 28;
                            if (field339.method2384()) {
                                class122 var76 = field339;
                                int var77 = field339.field1977 - 28;
                                if (class149.field2235 != null) {
                                    try {
                                        class149.field2235.method3936(0L);
                                        class149.field2235.method3926(var76.field1986, var77, 24);
                                    } catch (Exception var440) {
                                    }
                                }
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 75) {
                            int var79 = field339.method2401();
                            int var80 = field339.method2549();
                            int var81 = field339.method2365();
                            class173 var82 = class173.method1976(var80);
                            if (var82.field2746 != var79 || var82.field2756 != var81 || var82.field2742 != 0 || var82.field2743 != 0) {
                                var82.field2746 = var79;
                                var82.field2756 = var81;
                                var82.field2742 = 0;
                                var82.field2743 = 0;
                                method2721(var82);
                                method182(var82);
                                if (var82.field2739 == 0) {
                                    method958(Statics.field2811[var80 >> 16], var82, false);
                                }
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 57) {
                            int var83 = field339.method2367();
                            int var84 = field339.method2376();
                            if (var83 < -70000) {
                                var84 += 32768;
                            }
                            class173 var85;
                            if (var83 >= 0) {
                                var85 = class173.method1976(var83);
                            } else {
                                var85 = null;
                            }
                            while (field339.field1977 < field340) {
                                int var86 = field339.method2506();
                                int var87 = field339.method2376();
                                int var88 = 0;
                                if (var87 != 0) {
                                    var88 = field339.method2362();
                                    if (var88 == 255) {
                                        var88 = field339.method2367();
                                    }
                                }
                                if (var85 != null && var86 >= 0 && var86 < var85.field2853.length) {
                                    var85.field2853[var86] = var87;
                                    var85.field2854[var86] = var88;
                                }
                                class16.method1517(var84, var86, var87 - 1, var88);
                            }
                            if (var85 != null) {
                                method2721(var85);
                            }
                            method105();
                            field321[++field494 - 1 & 0x1F] = var84 & 0x7FFF;
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 179) {
                            int var89 = field339.method2367();
                            int var90 = field339.method2367();
                            class4 var91 = (class4) field455.method3573((long) var90);
                            class4 var92 = (class4) field455.method3573((long) var89);
                            if (var92 != null) {
                                method718(var92, var91 == null || var91.field74 != var92.field74);
                            }
                            if (var91 != null) {
                                var91.method3693();
                                field455.method3569(var91, (long) var89);
                            }
                            class173 var93 = class173.method1976(var90);
                            if (var93 != null) {
                                method2721(var93);
                            }
                            class173 var94 = class173.method1976(var89);
                            if (var94 != null) {
                                method2721(var94);
                                method958(Statics.field2811[var94.field2737 >>> 16], var94, true);
                            }
                            if (field454 != -1) {
                                method1089(field454, 1);
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 181) {
                            String var95 = field339.method2370();
                            Object[] var96 = new Object[var95.length() + 1];
                            for (int var97 = var95.length() - 1; var97 >= 0; var97--) {
                                if (var95.charAt(var97) == 's') {
                                    var96[var97 + 1] = field339.method2370();
                                } else {
                                    var96[var97 + 1] = Integer.valueOf(field339.method2367());
                                }
                            }
                            var96[0] = Integer.valueOf(field339.method2367());
                            class1 var98 = new class1();
                            var98.field12 = var96;
                            class37.method734(var98);
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 240) {
                            while (field339.field1977 < field340) {
                                boolean var99 = field339.method2362() == 1;
                                String var100 = field339.method2370();
                                String var101 = field339.method2370();
                                int var102 = field339.method2376();
                                int var103 = field339.method2362();
                                int var104 = field339.method2362();
                                boolean var105 = (var104 & 0x2) != 0;
                                boolean var106 = (var104 & 0x1) != 0;
                                if (var102 > 0) {
                                    field339.method2370();
                                    field339.method2362();
                                    field339.method2367();
                                }
                                field339.method2370();
                                for (int var107 = 0; var107 < field561; var107++) {
                                    class18 var108 = field434[var107];
                                    if (var99) {
                                        if (var101.equals(var108.field261)) {
                                            var108.field261 = var100;
                                            var108.field254 = var101;
                                            var100 = null;
                                            break;
                                        }
                                    } else if (var100.equals(var108.field261)) {
                                        if (var108.field253 != var102) {
                                            boolean var109 = true;
                                            for (class39 var110 = (class39) field564.method3558(); var110 != null; var110 = (class39) field564.method3560()) {
                                                if (var110.field882.equals(var100)) {
                                                    if (var102 != 0 && var110.field884 == 0) {
                                                        var110.method3692();
                                                        var109 = false;
                                                    } else if (var102 == 0 && var110.field884 != 0) {
                                                        var110.method3692();
                                                        var109 = false;
                                                    }
                                                }
                                            }
                                            if (var109) {
                                                field564.method3557(new class39(var100, var102));
                                            }
                                            var108.field253 = var102;
                                        }
                                        var108.field254 = var101;
                                        var108.field260 = var103;
                                        var108.field255 = var105;
                                        var108.field252 = var106;
                                        var100 = null;
                                        break;
                                    }
                                }
                                if (var100 != null && field561 < 400) {
                                    class18 var111 = new class18();
                                    field434[field561] = var111;
                                    var111.field261 = var100;
                                    var111.field254 = var101;
                                    var111.field253 = var102;
                                    var111.field260 = var103;
                                    var111.field255 = var105;
                                    var111.field252 = var106;
                                    field561++;
                                }
                            }
                            field562 = 2;
                            field487 = field567;
                            boolean var112 = false;
                            int var113 = field561;
                            while (var113 > 0) {
                                boolean var114 = true;
                                var113--;
                                for (int var115 = 0; var115 < var113; var115++) {
                                    boolean var116 = false;
                                    class18 var117 = field434[var115];
                                    class18 var118 = field434[var115 + 1];
                                    if (field348 != var117.field253 && field348 == var118.field253) {
                                        var116 = true;
                                    }
                                    if (!var116 && var117.field253 == 0 && var118.field253 != 0) {
                                        var116 = true;
                                    }
                                    if (!var116 && !var117.field255 && var118.field255) {
                                        var116 = true;
                                    }
                                    if (!var116 && !var117.field252 && var118.field252) {
                                        var116 = true;
                                    }
                                    if (var116) {
                                        class18 var119 = field434[var115];
                                        field434[var115] = field434[var115 + 1];
                                        field434[var115 + 1] = var119;
                                        var114 = false;
                                    }
                                }
                                if (var114) {
                                    break;
                                }
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 44) {
                            int var120 = field339.method2362();
                            int var121 = field339.method2362();
                            int var122 = field339.method2362();
                            int var123 = field339.method2362();
                            field543[var120] = true;
                            field544[var120] = var121;
                            field545[var120] = var122;
                            field546[var120] = var123;
                            field542[var120] = 0;
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 55) {
                            int var124 = field339.method2376();
                            int var125 = field339.method2549();
                            class173 var126 = class173.method1976(var125);
                            if (var126.field2778 != 1 || var126.field2779 != var124) {
                                var126.field2778 = 1;
                                var126.field2779 = var124;
                                method2721(var126);
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 5) {
                            for (int var127 = 0; var127 < field575.length; var127++) {
                                if (field575[var127] != null) {
                                    field575[var127].field859 = -1;
                                }
                            }
                            for (int var128 = 0; var128 < field351.length; var128++) {
                                if (field351[var128] != null) {
                                    field351[var128].field859 = -1;
                                }
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 31) {
                            Statics.field134 = field339.method2388();
                            Statics.field359 = field339.method2362();
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 112) {
                            class33.method134(field339, field340);
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 194) {
                            String var129 = field339.method2370();
                            int var130 = field339.method2388();
                            int var131 = field339.method2389();
                            if (var130 >= 1 && var130 <= 8) {
                                if (var129.equalsIgnoreCase("null")) {
                                    var129 = null;
                                }
                                field423[var130 - 1] = var129;
                                field424[var130 - 1] = var131 == 0;
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 144) {
                            field387 = field339.method2508() * 30;
                            field491 = field567;
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 94) {
                            field512 = field339.method2362();
                            field513 = field339.method2362();
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 142) {
                            if (field454 != -1) {
                                method1089(field454, 0);
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 172) {
                            int var132 = field339.method2376();
                            int var133 = field339.method2464();
                            class173 var134 = class173.method1976(var133);
                            if (var134.field2778 != 2 || var134.field2779 != var132) {
                                var134.field2778 = 2;
                                var134.field2779 = var132;
                                method2721(var134);
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 36) {
                            int var135 = field339.method2464();
                            int var136 = field339.method2368();
                            int var137 = var136 >> 10 & 0x1F;
                            int var138 = var136 >> 5 & 0x1F;
                            int var139 = var136 & 0x1F;
                            int var140 = (var139 << 3) + (var137 << 19) + (var138 << 11);
                            class173 var141 = class173.method1976(var135);
                            if (var141.field2804 != var140) {
                                var141.field2804 = var140;
                                method2721(var141);
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 245) {
                            int var142 = field339.method2367();
                            int var143 = field339.method2408();
                            int var144 = field339.method2508();
                            if (var144 == 65535) {
                                var144 = -1;
                            }
                            class173 var145 = class173.method1976(var142);
                            if (var145.field2736) {
                                var145.field2855 = var144;
                                var145.field2856 = var143;
                                class52 var147 = class52.method2767(var144);
                                var145.field2786 = var147.field1123;
                                var145.field2818 = var147.field1112;
                                var145.field2846 = var147.field1125;
                                var145.field2784 = var147.field1126;
                                var145.field2785 = var147.field1127;
                                var145.field2789 = var147.field1118;
                                if (var147.field1128 == 1) {
                                    var145.field2793 = 1;
                                } else {
                                    var145.field2793 = 2;
                                }
                                if (var145.field2790 > 0) {
                                    var145.field2789 = var145.field2789 * 32 / var145.field2790;
                                } else if (var145.field2748 > 0) {
                                    var145.field2789 = var145.field2789 * 32 / var145.field2748;
                                }
                                method2721(var145);
                            } else {
                                if (var144 == -1) {
                                    var145.field2778 = 0;
                                    field341 = -1;
                                    var1 = true;
                                    break label2844;
                                }
                                class52 var146 = class52.method2767(var144);
                                var145.field2778 = 4;
                                var145.field2779 = var144;
                                var145.field2786 = var146.field1123;
                                var145.field2818 = var146.field1112;
                                var145.field2789 = var146.field1118 * 100 / var143;
                                method2721(var145);
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 104) {
                            int var148 = field339.method2549();
                            class173 var149 = class173.method1976(var148);
                            var149.field2778 = 3;
                            var149.field2779 = Statics.field176.field41.method3291();
                            method2721(var149);
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 239) {
                            field466 = field567;
                            if (field340 == 0) {
                                field550 = null;
                                field298 = null;
                                Statics.field1547 = 0;
                                Statics.field142 = null;
                                field341 = -1;
                                var1 = true;
                            } else {
                                field298 = field339.method2370();
                                long var150 = field339.method2564();
                                long var152 = var150;
                                String var154;
                                if (var150 <= 0L || var150 >= 6582952005840035281L) {
                                    var154 = null;
                                } else if (var150 % 37L == 0L) {
                                    var154 = null;
                                } else {
                                    int var155 = 0;
                                    for (long var156 = var150; var156 != 0L; var156 /= 37L) {
                                        var155++;
                                    }
                                    StringBuilder var158 = new StringBuilder(var155);
                                    while (var152 != 0L) {
                                        long var159 = var152;
                                        var152 /= 37L;
                                        var158.append(class162.field2638[(int) (var159 - var152 * 37L)]);
                                    }
                                    var154 = var158.reverse().toString();
                                }
                                field550 = var154;
                                Statics.field3158 = field339.method2391();
                                int var161 = field339.method2362();
                                if (var161 == 255) {
                                    field341 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field1547 = var161;
                                    class25[] var162 = new class25[100];
                                    for (int var163 = 0; var163 < Statics.field1547; var163++) {
                                        var162[var163] = new class25();
                                        var162[var163].field631 = field339.method2370();
                                        var162[var163].field627 = class164.method843(var162[var163].field631, Statics.field309);
                                        var162[var163].field628 = field339.method2376();
                                        var162[var163].field629 = field339.method2391();
                                        field339.method2370();
                                        if (var162[var163].field631.equals(Statics.field176.field52)) {
                                            Statics.field2277 = var162[var163].field629;
                                        }
                                    }
                                    boolean var164 = false;
                                    int var165 = Statics.field1547;
                                    while (var165 > 0) {
                                        boolean var166 = true;
                                        var165--;
                                        for (int var167 = 0; var167 < var165; var167++) {
                                            if (var162[var167].field627.compareTo(var162[var167 + 1].field627) > 0) {
                                                class25 var168 = var162[var167];
                                                var162[var167] = var162[var167 + 1];
                                                var162[var167 + 1] = var168;
                                                var166 = false;
                                            }
                                        }
                                        if (var166) {
                                            break;
                                        }
                                    }
                                    Statics.field142 = var162;
                                    field341 = -1;
                                    var1 = true;
                                }
                            }
                            break label2844;
                        }
                        if (field341 == 91) {
                            int var169 = field339.method2506();
                            boolean var170 = field339.method2362() == 1;
                            String var171 = "";
                            boolean var172 = false;
                            if (var170) {
                                var171 = field339.method2370();
                                if (method1603(var171)) {
                                    var172 = true;
                                }
                            }
                            String var173 = field339.method2370();
                            if (!var172) {
                                class12.method2737(var169, var171, var173);
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 97) {
                            method2982(true);
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 157) {
                            method2982(false);
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 149) {
                            int var174 = field339.method2367();
                            int var175 = field339.method2368();
                            int var176 = field339.method2376();
                            int var177 = field339.method2376();
                            class173 var178 = class173.method1976(var174);
                            if (var178.field2786 != var176 || var178.field2818 != var175 || var178.field2789 != var177) {
                                var178.field2786 = var176;
                                var178.field2818 = var175;
                                var178.field2789 = var177;
                                method2721(var178);
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 103) {
                            int var179 = field339.method2367();
                            class4 var180 = (class4) field455.method3573((long) var179);
                            if (var180 != null) {
                                method718(var180, true);
                            }
                            if (field489 != null) {
                                method2721(field489);
                                field489 = null;
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 242) {
                            for (int var181 = 0; var181 < class176.field2885.length; var181++) {
                                if (class176.field2885[var181] != class176.field2884[var181]) {
                                    class176.field2885[var181] = class176.field2884[var181];
                                    method152(var181);
                                    field480[++field486 - 1 & 0x1F] = var181;
                                }
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 221) {
                            String var182 = field339.method2370();
                            long var183 = (long) field339.method2376();
                            long var185 = (long) field339.method2366();
                            class152 var187 = (class152) class109.method3002(class152.method2854(), field339.method2362());
                            long var188 = (var183 << 32) + var185;
                            boolean var190 = false;
                            for (int var191 = 0; var191 < 100; var191++) {
                                if (field358[var191] == var188) {
                                    var190 = true;
                                    break;
                                }
                            }
                            if (method1603(var182)) {
                                var190 = true;
                            }
                            if (!var190 && field505 == 0) {
                                field358[field516] = var188;
                                field516 = (field516 + 1) % 100;
                                class122 var192 = field339;
                                String var193 = class222.method3067(var192, 32767);
                                String var194 = class223.method3887(class163.method2256(var193));
                                byte var195;
                                if (var187.field2259) {
                                    var195 = 7;
                                } else {
                                    var195 = 3;
                                }
                                if (var187.field2257 == -1) {
                                    class12.method2737(var195, var182, var194);
                                } else {
                                    class12.method2737(var195, class2.method1228(var187.field2257) + var182, var194);
                                }
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 218) {
                            int var196 = field339.method2367();
                            int var197 = field339.method2376();
                            if (var196 < -70000) {
                                var197 += 32768;
                            }
                            class173 var198;
                            if (var196 >= 0) {
                                var198 = class173.method1976(var196);
                            } else {
                                var198 = null;
                            }
                            if (var198 != null) {
                                for (int var199 = 0; var199 < var198.field2853.length; var199++) {
                                    var198.field2853[var199] = 0;
                                    var198.field2854[var199] = 0;
                                }
                            }
                            class16.method2806(var197);
                            int var200 = field339.method2376();
                            for (int var201 = 0; var201 < var200; var201++) {
                                int var202 = field339.method2376();
                                int var203 = field339.method2362();
                                if (var203 == 255) {
                                    var203 = field339.method2408();
                                }
                                if (var198 != null && var201 < var198.field2853.length) {
                                    var198.field2853[var201] = var202;
                                    var198.field2854[var201] = var203;
                                }
                                class16.method1517(var197, var201, var202 - 1, var203);
                            }
                            if (var198 != null) {
                                method2721(var198);
                            }
                            method105();
                            field321[++field494 - 1 & 0x1F] = var197 & 0x7FFF;
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 182) {
                            field563 = true;
                            Statics.field174 = field339.method2362();
                            Statics.field3141 = field339.method2362();
                            Statics.field224 = field339.method2376();
                            Statics.field2580 = field339.method2362();
                            Statics.field697 = field339.method2362();
                            if (Statics.field697 >= 100) {
                                Statics.field781 = Statics.field174 * 128 + 64;
                                Statics.field1944 = Statics.field3141 * 128 + 64;
                                Statics.field2030 = method97(Statics.field781, Statics.field1944, Statics.field1765) - Statics.field224;
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 156) {
                            method568();
                            field341 = -1;
                            var1 = false;
                            break label2844;
                        }
                        if (field341 == 39) {
                            class122 var204 = field339;
                            int var205 = field340;
                            class210 var206 = new class210();
                            var206.field3102 = var204.method2362();
                            var206.field3105 = var204.method2367();
                            var206.field3104 = new int[var206.field3102];
                            var206.field3108 = new int[var206.field3102];
                            var206.field3101 = new Field[var206.field3102];
                            var206.field3106 = new int[var206.field3102];
                            var206.field3107 = new Method[var206.field3102];
                            var206.field3103 = new byte[var206.field3102][][];
                            for (int var207 = 0; var207 < var206.field3102; var207++) {
                                try {
                                    int var208 = var204.method2362();
                                    if (var208 == 0 || var208 == 1 || var208 == 2) {
                                        String var209 = var204.method2370();
                                        String var210 = var204.method2370();
                                        int var211 = 0;
                                        if (var208 == 1) {
                                            var211 = var204.method2367();
                                        }
                                        var206.field3104[var207] = var208;
                                        var206.field3106[var207] = var211;
                                        if (class211.method2668(var209).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        var206.field3101[var207] = class211.method2668(var209).getDeclaredField(var210);
                                    } else if (var208 == 3 || var208 == 4) {
                                        String var212 = var204.method2370();
                                        String var213 = var204.method2370();
                                        int var214 = var204.method2362();
                                        String[] var215 = new String[var214];
                                        for (int var216 = 0; var216 < var214; var216++) {
                                            var215[var216] = var204.method2370();
                                        }
                                        String var217 = var204.method2370();
                                        byte[][] var218 = new byte[var214][];
                                        if (var208 == 3) {
                                            for (int var219 = 0; var219 < var214; var219++) {
                                                int var220 = var204.method2367();
                                                var218[var219] = new byte[var220];
                                                var204.method2477(var218[var219], 0, var220);
                                            }
                                        }
                                        var206.field3104[var207] = var208;
                                        Class[] var221 = new Class[var214];
                                        for (int var222 = 0; var222 < var214; var222++) {
                                            var221[var222] = class211.method2668(var215[var222]);
                                        }
                                        Class var223 = class211.method2668(var217);
                                        if (class211.method2668(var212).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        Method[] var224 = class211.method2668(var212).getDeclaredMethods();
                                        Method[] var225 = var224;
                                        for (int var226 = 0; var226 < var225.length; var226++) {
                                            Method var227 = var225[var226];
                                            if (var227.getName().equals(var213)) {
                                                Class[] var228 = var227.getParameterTypes();
                                                if (var221.length == var228.length) {
                                                    boolean var229 = true;
                                                    for (int var230 = 0; var230 < var221.length; var230++) {
                                                        if (var221[var230] != var228[var230]) {
                                                            var229 = false;
                                                            break;
                                                        }
                                                    }
                                                    if (var229 && var223 == var227.getReturnType()) {
                                                        var206.field3107[var207] = var227;
                                                    }
                                                }
                                            }
                                        }
                                        var206.field3103[var207] = var218;
                                    }
                                } catch (ClassNotFoundException var443) {
                                    var206.field3108[var207] = -1;
                                } catch (SecurityException var444) {
                                    var206.field3108[var207] = -2;
                                } catch (NullPointerException var445) {
                                    var206.field3108[var207] = -3;
                                } catch (Exception var446) {
                                    var206.field3108[var207] = -4;
                                } catch (Throwable var447) {
                                    var206.field3108[var207] = -5;
                                }
                            }
                            class211.field3109.method3639(var206);
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 202) {
                            int var236 = field339.method2376();
                            int var237 = field339.method2362();
                            int var238 = field339.method2376();
                            if (field534 != 0 && var237 != 0 && field393 < 50) {
                                field537[field393] = var236;
                                field538[field393] = var237;
                                field402[field393] = var238;
                                field541[field393] = null;
                                field540[field393] = 0;
                                field393++;
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 171) {
                            while (field339.field1977 < field340) {
                                int var242 = field339.method2362();
                                boolean var243 = (var242 & 0x1) == 1;
                                String var244 = field339.method2370();
                                String var245 = field339.method2370();
                                field339.method2370();
                                for (int var246 = 0; var246 < field472; var246++) {
                                    class8 var247 = field566[var246];
                                    if (var243) {
                                        if (var245.equals(var247.field139)) {
                                            var247.field139 = var244;
                                            var247.field138 = var245;
                                            var244 = null;
                                            break;
                                        }
                                    } else if (var244.equals(var247.field139)) {
                                        var247.field139 = var244;
                                        var247.field138 = var245;
                                        var244 = null;
                                        break;
                                    }
                                }
                                if (var244 != null && field472 < 400) {
                                    class8 var248 = new class8();
                                    field566[field472] = var248;
                                    var248.field139 = var244;
                                    var248.field138 = var245;
                                    field472++;
                                }
                            }
                            field487 = field567;
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 82) {
                            method105();
                            field459 = field339.method2362();
                            field491 = field567;
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 137) {
                            int var249 = field339.method2549();
                            int var250 = field339.method2396();
                            class173 var251 = class173.method1976(var249);
                            if (var251.field2842 != var250 || var250 == -1) {
                                var251.field2842 = var250;
                                var251.field2857 = 0;
                                var251.field2830 = 0;
                                method2721(var251);
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 197) {
                            String var252 = field339.method2370();
                            Statics.field2072 = var252;
                            try {
                                String var253 = Statics.field290.getParameter(class190.field3044.field3050);
                                String var254 = Statics.field290.getParameter(class190.field3048.field3050);
                                String var255 = var253 + "settings=" + var252 + "; version=1; path=/; domain=" + var254;
                                String var256;
                                if (var252.length() == 0) {
                                    var256 = var255 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                                } else {
                                    String var257 = var255 + "; Expires=";
                                    long var258 = class115.method579() + 94608000000L;
                                    class111.field1933.setTime(new Date(var258));
                                    int var260 = class111.field1933.get(7);
                                    int var261 = class111.field1933.get(5);
                                    int var262 = class111.field1933.get(2);
                                    int var263 = class111.field1933.get(1);
                                    int var264 = class111.field1933.get(11);
                                    int var265 = class111.field1933.get(12);
                                    int var266 = class111.field1933.get(13);
                                    String var267 = class111.field1932[var260 - 1] + ", " + var261 / 10 + var261 % 10 + "-" + class111.field1937[0][var262] + "-" + var263 + " " + var264 / 10 + var264 % 10 + ":" + var265 / 10 + var265 % 10 + ":" + var266 / 10 + var266 % 10 + " GMT";
                                    var256 = var257 + var267 + "; Max-Age=" + 94608000L;
                                }
                                class132.method2714(Statics.field290, "document.cookie=\"" + var256 + "\"");
                            } catch (Throwable var439) {
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 255 || field341 == 12 || field341 == 66 || field341 == 78 || field341 == 166 || field341 == 93 || field341 == 225 || field341 == 129 || field341 == 115 || field341 == 134) {
                            method660();
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 62) {
                            class33.method2784();
                            for (int var269 = 0; var269 < 2048; var269++) {
                                field575[var269] = null;
                            }
                            class33.method1007(field339);
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 27) {
                            int var270 = field339.method2376();
                            if (var270 == 65535) {
                                var270 = -1;
                            }
                            int var271 = field339.method2549();
                            int var272 = field339.method2464();
                            int var273 = field339.method2399();
                            if (var273 == 65535) {
                                var273 = -1;
                            }
                            for (int var274 = var273; var274 <= var270; var274++) {
                                long var275 = ((long) var272 << 32) + (long) var274;
                                class208 var277 = field496.method3573(var275);
                                if (var277 != null) {
                                    var277.method3693();
                                }
                                field496.method3569(new class201(var271), var275);
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 33) {
                            String var278 = field339.method2370();
                            long var279 = field339.method2564();
                            long var281 = (long) field339.method2376();
                            long var283 = (long) field339.method2366();
                            class152 var285 = (class152) class109.method3002(class152.method2854(), field339.method2362());
                            long var286 = (var281 << 32) + var283;
                            boolean var288 = false;
                            for (int var289 = 0; var289 < 100; var289++) {
                                if (field358[var289] == var286) {
                                    var288 = true;
                                    break;
                                }
                            }
                            if (var285.field2260 && method1603(var278)) {
                                var288 = true;
                            }
                            if (!var288 && field505 == 0) {
                                field358[field516] = var286;
                                field516 = (field516 + 1) % 100;
                                class122 var290 = field339;
                                String var291 = class222.method3067(var290, 32767);
                                String var292 = class223.method3887(class163.method2256(var291));
                                if (var285.field2257 == -1) {
                                    class12.method1030(9, var278, var292, class162.method1018(var279));
                                } else {
                                    class12.method1030(9, class2.method1228(var285.field2257) + var278, var292, class162.method1018(var279));
                                }
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 238) {
                            method2172(true);
                            field339.method2620();
                            int var293 = field339.method2376();
                            class33.method134(field339, var293);
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 148) {
                            field483 = field339.method2362();
                            if (field483 == 255) {
                                field483 = 0;
                            }
                            field381 = field339.method2362();
                            if (field381 == 255) {
                                field381 = 0;
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 117) {
                            Statics.field29 = class130.method668(field339.method2362());
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 151) {
                            Statics.field134 = field339.method2389();
                            Statics.field359 = field339.method2390();
                            for (int var294 = Statics.field134; var294 < Statics.field134 + 8; var294++) {
                                for (int var295 = Statics.field359; var295 < Statics.field359 + 8; var295++) {
                                    if (field427[Statics.field1765][var294][var295] != null) {
                                        field427[Statics.field1765][var294][var295] = null;
                                        Statics.method123(var294, var295);
                                    }
                                }
                            }
                            for (class17 var296 = (class17) field428.method3603(); var296 != null; var296 = (class17) field428.method3596()) {
                                if (var296.field237 >= Statics.field134 && var296.field237 < Statics.field134 + 8 && var296.field238 >= Statics.field359 && var296.field238 < Statics.field359 + 8 && Statics.field1765 == var296.field245) {
                                    var296.field250 = 0;
                                }
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 119) {
                            int var297 = field339.method2367();
                            String var298 = field339.method2370();
                            class173 var299 = class173.method1976(var297);
                            if (!var298.equals(var299.field2795)) {
                                var299.field2795 = var298;
                                method2721(var299);
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 42) {
                            int var300 = field339.method2362();
                            if (field339.method2362() == 0) {
                                field570[var300] = new class220();
                                field339.field1977 += 18;
                            } else {
                                field339.field1977--;
                                field570[var300] = new class220(field339, false);
                            }
                            field350 = field567;
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 243) {
                            field530 = field339.method2362();
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 231) {
                            method2172(false);
                            field339.method2620();
                            int var301 = field339.method2376();
                            class33.method134(field339, var301);
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 118) {
                            boolean var302 = field339.method2390() == 1;
                            int var303 = field339.method2549();
                            class173 var304 = class173.method1976(var303);
                            if (var304.field2757 != var302) {
                                var304.field2757 = var302;
                                method2721(var304);
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 206) {
                            int var305 = field339.method2549();
                            int var306 = field339.method2376();
                            class173 var307 = class173.method1976(var305);
                            if (var307 != null && var307.field2739 == 0) {
                                if (var306 > var307.field2761 - var307.field2753) {
                                    var306 = var307.field2761 - var307.field2753;
                                }
                                if (var306 < 0) {
                                    var306 = 0;
                                }
                                if (var307.field2791 != var306) {
                                    var307.field2791 = var306;
                                    method2721(var307);
                                }
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 1) {
                            int var308 = field339.method2399();
                            if (var308 == 65535) {
                                var308 = -1;
                            }
                            if (var308 == -1 && !field533) {
                                class183.method749();
                            } else if (var308 != -1 && field532 != var308 && field531 != 0 && !field533) {
                                class183.method153(2, Statics.field1370, var308, 0, field531, false);
                            }
                            field532 = var308;
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 232) {
                            int var309 = field339.method2366();
                            int var310 = field339.method2368();
                            if (var310 == 65535) {
                                var310 = -1;
                            }
                            method1215(var310, var309);
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        if (field341 == 193) {
                            field563 = true;
                            Statics.field1889 = field339.method2362();
                            Statics.field1158 = field339.method2362();
                            Statics.field1028 = field339.method2376();
                            Statics.field216 = field339.method2362();
                            Statics.field435 = field339.method2362();
                            if (Statics.field435 >= 100) {
                                int var311 = Statics.field1889 * 128 + 64;
                                int var312 = Statics.field1158 * 128 + 64;
                                int var313 = method97(var311, var312, Statics.field1765) - Statics.field1028;
                                int var314 = var311 - Statics.field781;
                                int var315 = var313 - Statics.field2030;
                                int var316 = var312 - Statics.field1944;
                                int var317 = (int) Math.sqrt((double) (var314 * var314 + var316 * var316));
                                Statics.field10 = (int) (Math.atan2((double) var315, (double) var317) * 325.949D) & 0x7FF;
                                Statics.field2161 = (int) (Math.atan2((double) var314, (double) var316) * -325.949D) & 0x7FF;
                                if (Statics.field10 < 128) {
                                    Statics.field10 = 128;
                                }
                                if (Statics.field10 > 383) {
                                    Statics.field10 = 383;
                                }
                            }
                            field341 = -1;
                            var1 = true;
                            break label2844;
                        }
                        class148.method2631("" + field341 + class2.field22 + field433 + class2.field22 + field346 + class2.field22 + field340, (Throwable) null);
                        method568();
                    } catch (IOException var448) {
                        method13();
                    } catch (Exception var449) {
                        String var320 = "" + field341 + class2.field22 + field433 + class2.field22 + field346 + class2.field22 + field340 + class2.field22 + (Statics.field3144 + Statics.field176.field872[0]) + class2.field22 + (Statics.field656 + Statics.field176.field873[0]) + class2.field22;
                        for (int var321 = 0; var321 < field340 && var321 < 50; var321++) {
                            var320 = var320 + field339.field1986[var321] + class2.field22;
                        }
                        class148.method2631(var320, var449);
                        method568();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field300 != 30) {
            return;
        }
        while (class211.method2670()) {
            field367.method2612(212);
            field367.method2476(0);
            int var322 = field367.field1977;
            class211.method1102(field367);
            field367.method2359(field367.field1977 - var322);
        }
        Object var323 = Statics.field2159.field203;
        synchronized (Statics.field2159.field203) {
            if (!field515) {
                Statics.field2159.field204 = 0;
            } else if (class140.field2150 != 0 || Statics.field2159.field204 >= 40) {
                field367.method2612(223);
                field367.method2476(0);
                int var324 = field367.field1977;
                int var325 = 0;
                for (int var326 = 0; var326 < Statics.field2159.field204 && field367.field1977 - var324 < 240; var326++) {
                    var325++;
                    int var327 = Statics.field2159.field202[var326];
                    if (var327 < 0) {
                        var327 = 0;
                    } else if (var327 > 502) {
                        var327 = 502;
                    }
                    int var328 = Statics.field2159.field207[var326];
                    if (var328 < 0) {
                        var328 = 0;
                    } else if (var328 > 764) {
                        var328 = 764;
                    }
                    int var329 = var327 * 765 + var328;
                    if (Statics.field2159.field202[var326] == -1 && Statics.field2159.field207[var326] == -1) {
                        var328 = -1;
                        var327 = -1;
                        var329 = 524287;
                    }
                    if (field304 != var328 || field305 != var327) {
                        int var330 = var328 - field304;
                        field304 = var328;
                        int var331 = var327 - field305;
                        field305 = var327;
                        if (field306 < 8 && var330 >= -32 && var330 <= 31 && var331 >= -32 && var331 <= 31) {
                            var330 += 32;
                            var331 += 32;
                            field367.method2349((field306 << 12) + (var330 << 6) + var331);
                            field306 = 0;
                        } else if (field306 < 8) {
                            field367.method2537((field306 << 19) + 8388608 + var329);
                            field306 = 0;
                        } else {
                            field367.method2351((field306 << 19) + -1073741824 + var329);
                            field306 = 0;
                        }
                    } else if (field306 < 2047) {
                        field306++;
                    }
                }
                field367.method2359(field367.field1977 - var324);
                if (var325 >= Statics.field2159.field204) {
                    Statics.field2159.field204 = 0;
                } else {
                    Statics.field2159.field204 -= var325;
                    for (int var332 = 0; var332 < Statics.field2159.field204; var332++) {
                        Statics.field2159.field207[var332] = Statics.field2159.field207[var325 + var332];
                        Statics.field2159.field202[var332] = Statics.field2159.field202[var325 + var332];
                    }
                }
            }
        }
        if (class140.field2150 == 1 || !Statics.field1395 && class140.field2150 == 4 || class140.field2150 == 2) {
            long var334 = (class140.field2153 - field303 * -1L) / 50L;
            if (var334 > 4095L) {
                var334 = 4095L;
            }
            field303 = class140.field2153 * -1L;
            int var336 = class140.field2148;
            if (var336 < 0) {
                var336 = 0;
            } else if (var336 > Statics.field2019) {
                var336 = Statics.field2019;
            }
            int var337 = class140.field2142;
            if (var337 < 0) {
                var337 = 0;
            } else if (var337 > Statics.field2014) {
                var337 = Statics.field2014;
            }
            int var338 = (int) var334;
            field367.method2612(46);
            field367.method2349((class140.field2150 == 2 ? 1 : 0) + (var338 << 1));
            field367.method2349(var337);
            field367.method2349(var336);
        }
        if (class137.field2115 > 0) {
            field367.method2612(132);
            field367.method2349(0);
            int var339 = field367.field1977;
            long var340 = class115.method579();
            for (int var342 = 0; var342 < class137.field2115; var342++) {
                long var343 = var340 - field520;
                if (var343 > 16777215L) {
                    var343 = 16777215L;
                }
                field520 = var340;
                field367.method2387(class137.field2117[var342]);
                field367.method2513((int) var343);
            }
            field367.method2418(field367.field1977 - var339);
        }
        if (field482 > 0) {
            field482--;
        }
        if (class137.field2108[96] || class137.field2108[97] || class137.field2108[98] || class137.field2108[99]) {
            field388 = true;
        }
        if (field388 && field482 <= 0) {
            field482 = 20;
            field388 = false;
            field367.method2612(0);
            field367.method2503(field573);
            field367.method2503(field380);
        }
        if (Statics.field1363 && !field307) {
            field307 = true;
            field367.method2612(83);
            field367.method2476(1);
        }
        if (!Statics.field1363 && field307) {
            field307 = false;
            field367.method2612(83);
            field367.method2476(0);
        }
        if (Statics.field1765 != field523) {
            field523 = Statics.field1765;
            int var345 = Statics.field1765;
            int[] var346 = Statics.field1366.field1407;
            int var347 = var346.length;
            for (int var348 = 0; var348 < var347; var348++) {
                var346[var348] = 0;
            }
            for (int var349 = 1; var349 < 103; var349++) {
                int var350 = (103 - var349) * 2048 + 24628;
                for (int var351 = 1; var351 < 103; var351++) {
                    if ((class6.field88[var345][var351][var349] & 0x18) == 0) {
                        Statics.field39.method1827(var346, var350, 512, var345, var351, var349);
                    }
                    if (var345 < 3 && (class6.field88[var345 + 1][var351][var349] & 0x8) != 0) {
                        Statics.field39.method1827(var346, var350, 512, var345 + 1, var351, var349);
                    }
                    var350 += 4;
                }
            }
            int var352 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var353 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field1366.method1619();
            for (int var354 = 1; var354 < 103; var354++) {
                for (int var355 = 1; var355 < 103; var355++) {
                    if ((class6.field88[var345][var355][var354] & 0x18) == 0) {
                        method201(var345, var355, var354, var352, var353);
                    }
                    if (var345 < 3 && (class6.field88[var345 + 1][var355][var354] & 0x8) != 0) {
                        method201(var345 + 1, var355, var354, var352, var353);
                    }
                }
            }
            field426 = 0;
            for (int var356 = 0; var356 < 104; var356++) {
                for (int var357 = 0; var357 < 104; var357++) {
                    int var358 = Statics.field39.method1822(Statics.field1765, var356, var357);
                    if (var358 != 0) {
                        int var359 = var358 >> 14 & 0x7FFF;
                        int var360 = class41.method3251(var359).field955;
                        if (var360 >= 0) {
                            int var361 = var356;
                            int var362 = var357;
                            if (var360 != 22 && var360 != 29 && var360 != 34 && var360 != 36 && var360 != 46 && var360 != 47 && var360 != 48) {
                                int[][] var363 = field355[Statics.field1765].field1883;
                                for (int var364 = 0; var364 < 10; var364++) {
                                    int var365 = (int) (Math.random() * 4.0D);
                                    if (var365 == 0 && var361 > 0 && var361 > var356 - 3 && (var363[var361 - 1][var362] & 0x1240108) == 0) {
                                        var361--;
                                    }
                                    if (var365 == 1 && var361 < 103 && var361 < var356 + 3 && (var363[var361 + 1][var362] & 0x1240180) == 0) {
                                        var361++;
                                    }
                                    if (var365 == 2 && var362 > 0 && var362 > var357 - 3 && (var363[var361][var362 - 1] & 0x1240102) == 0) {
                                        var362--;
                                    }
                                    if (var365 == 3 && var362 < 103 && var362 < var357 + 3 && (var363[var361][var362 + 1] & 0x1240120) == 0) {
                                        var362++;
                                    }
                                }
                            }
                            field527[field426] = Statics.field711[var360];
                            field525[field426] = var361;
                            field526[field426] = var362;
                            field426++;
                        }
                    }
                }
            }
            Statics.field137.method1608();
        }
        if (field300 != 30) {
            return;
        }
        for (class17 var366 = (class17) field428.method3603(); var366 != null; var366 = (class17) field428.method3596()) {
            if (var366.field250 > 0) {
                var366.field250--;
            }
            if (var366.field250 != 0) {
                if (var366.field235 > 0) {
                    var366.field235--;
                }
                if (var366.field235 == 0 && var366.field237 >= 1 && var366.field238 >= 1 && var366.field237 <= 102 && var366.field238 <= 102 && (var366.field242 < 0 || class6.method3258(var366.field242, var366.field244))) {
                    method2850(var366.field245, var366.field243, var366.field237, var366.field238, var366.field242, var366.field240, var366.field244);
                    var366.field235 = -1;
                    if (var366.field242 == var366.field239 && var366.field239 == -1) {
                        var366.method3693();
                    } else if (var366.field242 == var366.field239 && var366.field240 == var366.field236 && var366.field244 == var366.field241) {
                        var366.method3693();
                    }
                }
            } else if (var366.field239 < 0 || class6.method3258(var366.field239, var366.field241)) {
                method2850(var366.field245, var366.field243, var366.field237, var366.field238, var366.field239, var366.field236, var366.field241);
                var366.method3693();
            }
        }
        method160();
        field342++;
        if (field342 > 750) {
            method13();
            return;
        }
        method138();
        for (int var367 = 0; var367 < field404; var367++) {
            int var368 = field334[var367];
            class35 var369 = field351[var368];
            if (var369 != null) {
                method2288(var369, var369.field790.field894);
            }
        }
        int[] var370 = class33.field770;
        for (int var371 = 0; var371 < class33.field767; var371++) {
            class3 var372 = field575[var370[var371]];
            if (var372 != null && var372.field834 > 0) {
                var372.field834--;
                if (var372.field834 == 0) {
                    var372.field876 = null;
                }
            }
        }
        for (int var373 = 0; var373 < field404; var373++) {
            int var374 = field334[var373];
            class35 var375 = field351[var374];
            if (var375 != null && var375.field834 > 0) {
                var375.field834--;
                if (var375.field834 == 0) {
                    var375.field876 = null;
                }
            }
        }
        field372++;
        if (field407 != 0) {
            field406 += 20;
            if (field406 >= 400) {
                field407 = 0;
            }
        }
        if (Statics.field201 != null) {
            field408++;
            if (field408 >= 15) {
                method2721(Statics.field201);
                Statics.field201 = null;
            }
        }
        class173 var376 = Statics.field360;
        class173 var377 = Statics.field630;
        Statics.field360 = null;
        Statics.field630 = null;
        field471 = null;
        field397 = false;
        field501 = false;
        field517 = 0;
        while (class137.method3259() && field517 < 128) {
            if (field461 >= 2 && class137.field2108[82] && Statics.field19 == 66) {
                String var378 = "";
                Iterator var379 = class12.field177.iterator();
                while (var379.hasNext()) {
                    class36 var380 = (class36) var379.next();
                    var378 = var378 + var380.field794 + ':' + var380.field796 + '\n';
                }
                Statics.field1526.setContents(new StringSelection(var378), (ClipboardOwner) null);
            } else {
                field519[field517] = Statics.field19;
                field518[field517] = Statics.field1042;
                field517++;
            }
        }
        if (field454 != -1) {
            int var383 = field454;
            int var384 = Statics.field2014;
            int var385 = Statics.field2019;
            if (class173.method2967(var383)) {
                method132(Statics.field2811[var383], -1, 0, 0, var384, var385, 0, 0);
            }
        }
        field567++;
        while (true) {
            class1 var386;
            class173 var387;
            class173 var388;
            do {
                var386 = (class1) field331.method3601();
                if (var386 == null) {
                    while (true) {
                        class1 var389;
                        class173 var390;
                        class173 var391;
                        do {
                            var389 = (class1) field495.method3601();
                            if (var389 == null) {
                                while (true) {
                                    class1 var392;
                                    class173 var393;
                                    class173 var394;
                                    do {
                                        var392 = (class1) field310.method3601();
                                        if (var392 == null) {
                                            method643();
                                            if (field467 != null) {
                                                method2721(field467);
                                                Statics.field1080++;
                                                if (field397 && field501) {
                                                    int var395 = class140.field2139;
                                                    int var396 = class140.field2145;
                                                    int var397 = var395 - field556;
                                                    int var398 = var396 - field470;
                                                    if (var397 < field473) {
                                                        var397 = field473;
                                                    }
                                                    if (field467.field2780 + var397 > field473 + field390.field2780) {
                                                        var397 = field473 + field390.field2780 - field467.field2780;
                                                    }
                                                    if (var398 < field474) {
                                                        var398 = field474;
                                                    }
                                                    if (field467.field2753 + var398 > field474 + field390.field2753) {
                                                        var398 = field474 + field390.field2753 - field467.field2753;
                                                    }
                                                    int var399 = var397 - field476;
                                                    int var400 = var398 - field497;
                                                    int var401 = field467.field2770;
                                                    if (Statics.field1080 > field467.field2787 && (var399 > var401 || var399 < -var401 || var400 > var401 || var400 < -var401)) {
                                                        field478 = true;
                                                    }
                                                    int var402 = field390.field2758 + (var397 - field473);
                                                    int var403 = field390.field2791 + (var398 - field474);
                                                    if (field467.field2824 != null && field478) {
                                                        class1 var404 = new class1();
                                                        var404.field16 = field467;
                                                        var404.field13 = var402;
                                                        var404.field5 = var403;
                                                        var404.field12 = field467.field2824;
                                                        class37.method734(var404);
                                                    }
                                                    if (class140.field2151 == 0) {
                                                        if (field478) {
                                                            if (field467.field2730 != null) {
                                                                class1 var405 = new class1();
                                                                var405.field16 = field467;
                                                                var405.field13 = var402;
                                                                var405.field5 = var403;
                                                                var405.field7 = field471;
                                                                var405.field12 = field467.field2730;
                                                                class37.method734(var405);
                                                            }
                                                            if (field471 != null && method661(field467) != null) {
                                                                field367.method2612(55);
                                                                field367.method2351(field471.field2737);
                                                                field367.method2490(field467.field2855);
                                                                field367.method2404(field467.field2737);
                                                                field367.method2453(field467.field2738);
                                                                field367.method2453(field471.field2738);
                                                                field367.method2503(field471.field2855);
                                                            }
                                                        } else if ((field308 == 1 || method1591(field436 - 1)) && field436 > 2) {
                                                            method42(field556 + field476, field497 + field470);
                                                        } else if (field436 > 0) {
                                                            int var406 = field556 + field476;
                                                            int var407 = field497 + field470;
                                                            method186(Statics.field2028, var406, var407);
                                                            Statics.field2028 = null;
                                                        }
                                                        field467 = null;
                                                    }
                                                } else if (Statics.field1080 > 1) {
                                                    field467 = null;
                                                }
                                            }
                                            if (Statics.field272 != null) {
                                                method2721(Statics.field272);
                                                field415++;
                                                if (class140.field2151 == 0) {
                                                    if (field414) {
                                                        if (Statics.field825 == Statics.field272 && field413 != field410) {
                                                            class173 var408 = Statics.field272;
                                                            byte var409 = 0;
                                                            if (field453 == 1 && var408.field2741 == 206) {
                                                                var409 = 1;
                                                            }
                                                            if (var408.field2853[field413] <= 0) {
                                                                var409 = 0;
                                                            }
                                                            if (class178.method3006(method184(var408))) {
                                                                int var410 = field410;
                                                                int var411 = field413;
                                                                var408.field2853[var411] = var408.field2853[var410];
                                                                var408.field2854[var411] = var408.field2854[var410];
                                                                var408.field2853[var410] = -1;
                                                                var408.field2854[var410] = 0;
                                                            } else if (var409 == 1) {
                                                                int var412 = field410;
                                                                int var413 = field413;
                                                                while (var412 != var413) {
                                                                    if (var412 > var413) {
                                                                        var408.method3209(var412 - 1, var412);
                                                                        var412--;
                                                                    } else if (var412 < var413) {
                                                                        var408.method3209(var412 + 1, var412);
                                                                        var412++;
                                                                    }
                                                                }
                                                            } else {
                                                                var408.method3209(field413, field410);
                                                            }
                                                            field367.method2612(254);
                                                            field367.method2403(Statics.field272.field2737);
                                                            field367.method2386(var409);
                                                            field367.method2453(field413);
                                                            field367.method2349(field410);
                                                        }
                                                    } else if ((field308 == 1 || method1591(field436 - 1)) && field436 > 2) {
                                                        method42(field411, field412);
                                                    } else if (field436 > 0) {
                                                        int var414 = field411;
                                                        int var415 = field412;
                                                        method186(Statics.field2028, var414, var415);
                                                        Statics.field2028 = null;
                                                    }
                                                    field408 = 10;
                                                    class140.field2150 = 0;
                                                    Statics.field272 = null;
                                                } else if (field415 >= 5 && (class140.field2139 > field411 + 5 || class140.field2139 < field411 - 5 || class140.field2145 > field412 + 5 || class140.field2145 < field412 - 5)) {
                                                    field414 = true;
                                                }
                                            }
                                            if (class86.field1489 != -1) {
                                                int var416 = class86.field1489;
                                                int var417 = class86.field1490;
                                                field367.method2612(173);
                                                field367.method2476(5);
                                                field367.method2490(Statics.field3144 + var416);
                                                field367.method2453(Statics.field656 + var417);
                                                field367.method2385(class137.field2108[82] ? (class137.field2108[81] ? 2 : 1) : 0);
                                                class86.field1489 = -1;
                                                field456 = class140.field2142;
                                                field536 = class140.field2148;
                                                field407 = 1;
                                                field406 = 0;
                                                field483 = var416;
                                                field381 = var417;
                                            }
                                            if (Statics.field360 != var376) {
                                                if (var376 != null) {
                                                    method2721(var376);
                                                }
                                                if (Statics.field360 != null) {
                                                    method2721(Statics.field360);
                                                }
                                            }
                                            if (Statics.field630 != var377 && field446 == field445) {
                                                if (var377 != null) {
                                                    method2721(var377);
                                                }
                                                if (Statics.field630 != null) {
                                                    method2721(Statics.field630);
                                                }
                                            }
                                            if (Statics.field630 == null) {
                                                if (field445 > 0) {
                                                    field445--;
                                                }
                                            } else if (field445 < field446) {
                                                field445++;
                                                if (field446 == field445) {
                                                    method2721(Statics.field630);
                                                }
                                            }
                                            int var418 = field528 + Statics.field176.field875;
                                            int var419 = field469 + Statics.field176.field819;
                                            if (Statics.field180 - var418 < -500 || Statics.field180 - var418 > 500 || Statics.field757 - var419 < -500 || Statics.field757 - var419 > 500) {
                                                Statics.field180 = var418;
                                                Statics.field757 = var419;
                                            }
                                            if (Statics.field180 != var418) {
                                                Statics.field180 += (var418 - Statics.field180) / 16;
                                            }
                                            if (Statics.field757 != var419) {
                                                Statics.field757 += (var419 - Statics.field757) / 16;
                                            }
                                            if (class140.field2151 == 4 && Statics.field1395) {
                                                int var420 = class140.field2145 - field385;
                                                field383 = var420 * 2;
                                                field385 = var420 == -1 || var420 == 1 ? class140.field2145 : (field385 + class140.field2145) / 2;
                                                int var421 = field384 - class140.field2139;
                                                field382 = var421 * 2;
                                                field384 = var421 == -1 || var421 == 1 ? class140.field2139 : (field384 + class140.field2139) / 2;
                                            } else {
                                                if (class137.field2108[96]) {
                                                    field382 += (-24 - field382) / 2;
                                                } else if (class137.field2108[97]) {
                                                    field382 += (24 - field382) / 2;
                                                } else {
                                                    field382 /= 2;
                                                }
                                                if (class137.field2108[98]) {
                                                    field383 += (12 - field383) / 2;
                                                } else if (class137.field2108[99]) {
                                                    field383 += (-12 - field383) / 2;
                                                } else {
                                                    field383 /= 2;
                                                }
                                                field385 = class140.field2145;
                                                field384 = class140.field2139;
                                            }
                                            field573 = field382 / 2 + field573 & 0x7FF;
                                            field380 += field383 / 2;
                                            if (field380 < 128) {
                                                field380 = 128;
                                            }
                                            if (field380 > 383) {
                                                field380 = 383;
                                            }
                                            int var422 = Statics.field180 >> 7;
                                            int var423 = Statics.field757 >> 7;
                                            int var424 = method97(Statics.field180, Statics.field757, Statics.field1765);
                                            int var425 = 0;
                                            if (var422 > 3 && var423 > 3 && var422 < 100 && var423 < 100) {
                                                for (int var426 = var422 - 4; var426 <= var422 + 4; var426++) {
                                                    for (int var427 = var423 - 4; var427 <= var423 + 4; var427++) {
                                                        int var428 = Statics.field1765;
                                                        if (var428 < 3 && (class6.field88[1][var426][var427] & 0x2) == 2) {
                                                            var428++;
                                                        }
                                                        int var429 = var424 - class6.field87[var428][var426][var427];
                                                        if (var429 > var425) {
                                                            var425 = var429;
                                                        }
                                                    }
                                                }
                                            }
                                            int var430 = var425 * 192;
                                            if (var430 > 98048) {
                                                var430 = 98048;
                                            }
                                            if (var430 < 32768) {
                                                var430 = 32768;
                                            }
                                            if (var430 > field389) {
                                                field389 += (var430 - field389) / 24;
                                            } else if (var430 < field389) {
                                                field389 += (var430 - field389) / 80;
                                            }
                                            if (field563) {
                                                method1067();
                                            }
                                            for (int var431 = 0; var431 < 5; var431++) {
                                                int var10002 = field542[var431]++;
                                            }
                                            Statics.field1885.method212();
                                            int var432 = class140.method3405();
                                            int var433 = class137.method2768();
                                            if (var432 > 15000 && var433 > 15000) {
                                                field347 = 250;
                                                class140.method180(14500);
                                                field367.method2612(205);
                                            }
                                            field366++;
                                            if (field366 > 500) {
                                                field366 = 0;
                                                int var434 = (int) (Math.random() * 8.0D);
                                                if ((var434 & 0x1) == 1) {
                                                    field528 += field361;
                                                }
                                                if ((var434 & 0x2) == 2) {
                                                    field469 += field363;
                                                }
                                                if ((var434 & 0x4) == 4) {
                                                    field522 += field365;
                                                }
                                            }
                                            if (field528 < -50) {
                                                field361 = 2;
                                            }
                                            if (field528 > 50) {
                                                field361 = -2;
                                            }
                                            if (field469 < -55) {
                                                field363 = 2;
                                            }
                                            if (field469 > 55) {
                                                field363 = -2;
                                            }
                                            if (field522 < -40) {
                                                field365 = 1;
                                            }
                                            if (field522 > 40) {
                                                field365 = -1;
                                            }
                                            field371++;
                                            if (field371 > 500) {
                                                field371 = 0;
                                                int var435 = (int) (Math.random() * 8.0D);
                                                if ((var435 & 0x1) == 1) {
                                                    field558 += field368;
                                                }
                                                if ((var435 & 0x2) == 2) {
                                                    field481 += field370;
                                                }
                                            }
                                            if (field558 < -60) {
                                                field368 = 2;
                                            }
                                            if (field558 > 60) {
                                                field368 = -2;
                                            }
                                            if (field481 < -20) {
                                                field370 = 1;
                                            }
                                            if (field481 > 10) {
                                                field370 = -1;
                                            }
                                            for (class39 var436 = (class39) field564.method3558(); var436 != null; var436 = (class39) field564.method3560()) {
                                                if ((long) var436.field883 < class115.method579() / 1000L - 5L) {
                                                    if (var436.field884 > 0) {
                                                        class12.method2737(5, "", var436.field882 + class157.field2482);
                                                    }
                                                    if (var436.field884 == 0) {
                                                        class12.method2737(5, "", var436.field882 + class157.field2559);
                                                    }
                                                    var436.method3692();
                                                }
                                            }
                                            field343++;
                                            if (field343 > 50) {
                                                field367.method2612(71);
                                            }
                                            try {
                                                if (Statics.field2589 != null && field367.field1977 > 0) {
                                                    Statics.field2589.method2859(field367.field1986, 0, field367.field1977);
                                                    field367.field1977 = 0;
                                                    field343 = 0;
                                                }
                                            } catch (IOException var438) {
                                                method13();
                                            }
                                            return;
                                        }
                                        var393 = var392.field16;
                                        if (var393.field2738 < 0) {
                                            break;
                                        }
                                        var394 = class173.method1976(var393.field2858);
                                    } while (var394 == null || var394.field2868 == null || var393.field2738 >= var394.field2868.length || var394.field2868[var393.field2738] != var393);
                                    class37.method734(var392);
                                }
                            }
                            var390 = var389.field16;
                            if (var390.field2738 < 0) {
                                break;
                            }
                            var391 = class173.method1976(var390.field2858);
                        } while (var391 == null || var391.field2868 == null || var390.field2738 >= var391.field2868.length || var391.field2868[var390.field2738] != var390);
                        class37.method734(var389);
                    }
                }
                var387 = var386.field16;
                if (var387.field2738 < 0) {
                    break;
                }
                var388 = class173.method1976(var387.field2858);
            } while (var388 == null || var388.field2868 == null || var387.field2738 >= var388.field2868.length || var388.field2868[var387.field2738] != var387);
            class37.method734(var386);
        }
    }

    @ObfuscatedName("av.s(B)V")
    public static final void method943() {
        if (Statics.field2042 != null) {
            Statics.field2042.method1200();
        }
        if (Statics.field2041 != null) {
            Statics.field2041.method1200();
        }
    }

    @ObfuscatedName("k.e(I)V")
    public static final void method160() {
        for (int var0 = 0; var0 < field393; var0++) {
            int var10002 = field402[var0]--;
            if (field402[var0] >= -10) {
                class59 var2 = field541[var0];
                if (var2 == null) {
                    class59 var10000 = (class59) null;
                    var2 = class59.method1253(Statics.field162, field537[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field402[var0] += var2.method1247();
                    field541[var0] = var2;
                }
                if (field402[var0] < 0) {
                    int var9;
                    if (field540[var0] == 0) {
                        var9 = field534;
                    } else {
                        int var3 = (field540[var0] & 0xFF) * 128;
                        int var4 = field540[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field176.field875;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field540[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field176.field819;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field402[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field535 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1257().method1284(Statics.field632);
                        class65 var11 = class65.method1307(var10, 100, var9);
                        var11.method1310(field538[var0] - 1);
                        Statics.field82.method1143(var11);
                    }
                    field402[var0] = -100;
                }
            } else {
                field393--;
                for (int var1 = var0; var1 < field393; var1++) {
                    field537[var1] = field537[var1 + 1];
                    field541[var1] = field541[var1 + 1];
                    field538[var1] = field538[var1 + 1];
                    field402[var1] = field402[var1 + 1];
                    field540[var1] = field540[var1 + 1];
                }
                var0--;
            }
        }
        if (field533 && !class183.method217()) {
            if (field531 != 0 && field532 != -1) {
                class183.method2057(Statics.field1370, field532, 0, field531, false);
            }
            field533 = false;
        }
    }

    @ObfuscatedName("ci.q(Laj;IIIB)V")
    public static void method1980(class43 arg0, int arg1, int arg2, int arg3) {
        if (field393 >= 50 || field535 == 0 || arg0.field1007 == null || arg1 >= arg0.field1007.length) {
            return;
        }
        int var4 = arg0.field1007[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field537[field393] = var5;
        field538[field393] = var6;
        field402[field393] = 0;
        field541[field393] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field540[field393] = (var8 << 16) + (var9 << 8) + var7;
        field393++;
    }

    @ObfuscatedName("bh.i(III)V")
    public static void method1215(int arg0, int arg1) {
        if (field531 != 0 && arg0 != -1) {
            class183.method2057(Statics.field2073, arg0, 0, field531, false);
            field533 = true;
        }
    }

    @ObfuscatedName("d.h(Lfp;III)V")
    public static final void method48(class173 arg0, int arg1, int arg2) {
        if (field530 != 0 && field530 != 3 || class140.field2150 != 1 && Statics.field1395 || class140.field2150 != 4) {
            return;
        }
        class175 var3 = arg0.method3238(true);
        if (var3 == null) {
            return;
        }
        int var4 = class140.field2142 - arg1;
        int var5 = class140.field2148 - arg2;
        if (!var3.method3255(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2877 / 2;
        int var7 = var5 - var3.field2878 / 2;
        int var8 = field573 + field558 & 0x7FF;
        int var9 = class91.field1577[var8];
        int var10 = class91.field1574[var8];
        int var11 = (field481 + 256) * var9 >> 8;
        int var12 = (field481 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field176.field875 + var13 >> 7;
        int var16 = Statics.field176.field819 - var14 >> 7;
        field367.method2612(196);
        field367.method2476(18);
        field367.method2490(Statics.field3144 + var15);
        field367.method2453(Statics.field656 + var16);
        field367.method2385(class137.field2108[82] ? (class137.field2108[81] ? 2 : 1) : 0);
        field367.method2476(var6);
        field367.method2476(var7);
        field367.method2349(field573);
        field367.method2476(57);
        field367.method2476(field558);
        field367.method2476(field481);
        field367.method2476(89);
        field367.method2349(Statics.field176.field875);
        field367.method2349(Statics.field176.field819);
        field367.method2476(63);
        field483 = var15;
        field381 = var16;
    }

    @ObfuscatedName("at.ak(I)V")
    public static final void method1067() {
        int var0 = Statics.field174 * 128 + 64;
        int var1 = Statics.field3141 * 128 + 64;
        int var2 = method97(var0, var1, Statics.field1765) - Statics.field224;
        if (Statics.field781 < var0) {
            Statics.field781 += Statics.field697 * (var0 - Statics.field781) / 1000 + Statics.field2580;
            if (Statics.field781 > var0) {
                Statics.field781 = var0;
            }
        }
        if (Statics.field781 > var0) {
            Statics.field781 -= Statics.field697 * (Statics.field781 - var0) / 1000 + Statics.field2580;
            if (Statics.field781 < var0) {
                Statics.field781 = var0;
            }
        }
        if (Statics.field2030 < var2) {
            Statics.field2030 += Statics.field697 * (var2 - Statics.field2030) / 1000 + Statics.field2580;
            if (Statics.field2030 > var2) {
                Statics.field2030 = var2;
            }
        }
        if (Statics.field2030 > var2) {
            Statics.field2030 -= Statics.field697 * (Statics.field2030 - var2) / 1000 + Statics.field2580;
            if (Statics.field2030 < var2) {
                Statics.field2030 = var2;
            }
        }
        if (Statics.field1944 < var1) {
            Statics.field1944 += Statics.field697 * (var1 - Statics.field1944) / 1000 + Statics.field2580;
            if (Statics.field1944 > var1) {
                Statics.field1944 = var1;
            }
        }
        if (Statics.field1944 > var1) {
            Statics.field1944 -= Statics.field697 * (Statics.field1944 - var1) / 1000 + Statics.field2580;
            if (Statics.field1944 < var1) {
                Statics.field1944 = var1;
            }
        }
        int var3 = Statics.field1889 * 128 + 64;
        int var4 = Statics.field1158 * 128 + 64;
        int var5 = method97(var3, var4, Statics.field1765) - Statics.field1028;
        int var6 = var3 - Statics.field781;
        int var7 = var5 - Statics.field2030;
        int var8 = var4 - Statics.field1944;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field10 < var10) {
            Statics.field10 += Statics.field435 * (var10 - Statics.field10) / 1000 + Statics.field216;
            if (Statics.field10 > var10) {
                Statics.field10 = var10;
            }
        }
        if (Statics.field10 > var10) {
            Statics.field10 -= Statics.field435 * (Statics.field10 - var10) / 1000 + Statics.field216;
            if (Statics.field10 < var10) {
                Statics.field10 = var10;
            }
        }
        int var12 = var11 - Statics.field2161;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field2161 += Statics.field435 * var12 / 1000 + Statics.field216;
            Statics.field2161 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field2161 -= Statics.field435 * -var12 / 1000 + Statics.field216;
            Statics.field2161 &= 0x7FF;
        }
        int var13 = var11 - Statics.field2161;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field2161 = var11;
        }
    }

    @ObfuscatedName("v.ai(I)V")
    public static final void method138() {
        int var0 = class33.field767;
        int[] var1 = class33.field770;
        for (int var2 = 0; var2 < var0; var2++) {
            class3 var3 = field575[var1[var2]];
            if (var3 != null) {
                method2288(var3, 1);
            }
        }
    }

    @ObfuscatedName("di.ag(Lax;II)V")
    public static final void method2288(class38 arg0, int arg1) {
        if (arg0.field863 > field302) {
            int var2 = arg0.field863 - field302;
            int var3 = arg0.field843 * 128 + arg0.field822 * 64;
            int var4 = arg0.field822 * 64 + arg0.field818 * 128;
            arg0.field875 += (var3 - arg0.field875) / var2;
            arg0.field819 += (var4 - arg0.field819) / var2;
            arg0.field842 = 0;
            arg0.field868 = arg0.field865;
        } else if (arg0.field864 >= field302) {
            method2798(arg0);
        } else {
            arg0.field846 = arg0.field823;
            if (arg0.field871 == 0) {
                arg0.field842 = 0;
            } else {
                label322: {
                    if (arg0.field859 != -1 && arg0.field826 == 0) {
                        class43 var5 = class43.method2054(arg0.field859);
                        if (arg0.field849 > 0 && var5.field993 == 0) {
                            arg0.field842++;
                            break label322;
                        }
                        if (arg0.field849 <= 0 && var5.field1006 == 0) {
                            arg0.field842++;
                            break label322;
                        }
                    }
                    int var6 = arg0.field875;
                    int var7 = arg0.field819;
                    int var8 = arg0.field872[arg0.field871 - 1] * 128 + arg0.field822 * 64;
                    int var9 = arg0.field873[arg0.field871 - 1] * 128 + arg0.field822 * 64;
                    if (var6 < var8) {
                        if (var7 < var9) {
                            arg0.field868 = 1280;
                        } else if (var7 > var9) {
                            arg0.field868 = 1792;
                        } else {
                            arg0.field868 = 1536;
                        }
                    } else if (var6 > var8) {
                        if (var7 < var9) {
                            arg0.field868 = 768;
                        } else if (var7 > var9) {
                            arg0.field868 = 256;
                        } else {
                            arg0.field868 = 512;
                        }
                    } else if (var7 < var9) {
                        arg0.field868 = 1024;
                    } else if (var7 > var9) {
                        arg0.field868 = 0;
                    }
                    byte var10 = arg0.field874[arg0.field871 - 1];
                    if (var8 - var6 <= 256 && var8 - var6 >= -256 && var9 - var7 <= 256 && var9 - var7 >= -256) {
                        int var11 = arg0.field868 - arg0.field820 & 0x7FF;
                        if (var11 > 1024) {
                            var11 -= 2048;
                        }
                        int var12 = arg0.field827;
                        if (var11 >= -256 && var11 <= 256) {
                            var12 = arg0.field847;
                        } else if (var11 >= 256 && var11 < 768) {
                            var12 = arg0.field845;
                        } else if (var11 >= -768 && var11 <= -256) {
                            var12 = arg0.field828;
                        }
                        if (var12 == -1) {
                            var12 = arg0.field847;
                        }
                        arg0.field846 = var12;
                        int var13 = 4;
                        boolean var14 = true;
                        if (arg0 instanceof class35) {
                            var14 = ((class35) arg0).field790.field922;
                        }
                        if (var14) {
                            if (arg0.field868 != arg0.field820 && arg0.field848 == -1 && arg0.field870 != 0) {
                                var13 = 2;
                            }
                            if (arg0.field871 > 2) {
                                var13 = 6;
                            }
                            if (arg0.field871 > 3) {
                                var13 = 8;
                            }
                            if (arg0.field842 > 0 && arg0.field871 > 1) {
                                var13 = 8;
                                arg0.field842--;
                            }
                        } else {
                            if (arg0.field871 > 1) {
                                var13 = 6;
                            }
                            if (arg0.field871 > 2) {
                                var13 = 8;
                            }
                            if (arg0.field842 > 0 && arg0.field871 > 1) {
                                var13 = 8;
                                arg0.field842--;
                            }
                        }
                        if (var10 == 2) {
                            var13 <<= 0x1;
                        }
                        if (var13 >= 8 && arg0.field847 == arg0.field846 && arg0.field830 != -1) {
                            arg0.field846 = arg0.field830;
                        }
                        if (var6 != var8 || var7 != var9) {
                            if (var6 < var8) {
                                arg0.field875 += var13;
                                if (arg0.field875 > var8) {
                                    arg0.field875 = var8;
                                }
                            } else if (var6 > var8) {
                                arg0.field875 -= var13;
                                if (arg0.field875 < var8) {
                                    arg0.field875 = var8;
                                }
                            }
                            if (var7 < var9) {
                                arg0.field819 += var13;
                                if (arg0.field819 > var9) {
                                    arg0.field819 = var9;
                                }
                            } else if (var7 > var9) {
                                arg0.field819 -= var13;
                                if (arg0.field819 < var9) {
                                    arg0.field819 = var9;
                                }
                            }
                        }
                        if (arg0.field875 == var8 && arg0.field819 == var9) {
                            arg0.field871--;
                            if (arg0.field849 > 0) {
                                arg0.field849--;
                            }
                        }
                    } else {
                        arg0.field875 = var8;
                        arg0.field819 = var9;
                        arg0.field871--;
                        if (arg0.field849 > 0) {
                            arg0.field849--;
                        }
                    }
                }
            }
        }
        if (arg0.field875 < 128 || arg0.field819 < 128 || arg0.field875 >= 13184 || arg0.field819 >= 13184) {
            arg0.field859 = -1;
            arg0.field854 = -1;
            arg0.field863 = 0;
            arg0.field864 = 0;
            arg0.field875 = arg0.field872[0] * 128 + arg0.field822 * 64;
            arg0.field819 = arg0.field873[0] * 128 + arg0.field822 * 64;
            arg0.method751();
        }
        if (Statics.field176 == arg0 && (arg0.field875 < 1536 || arg0.field819 < 1536 || arg0.field875 >= 11776 || arg0.field819 >= 11776)) {
            arg0.field859 = -1;
            arg0.field854 = -1;
            arg0.field863 = 0;
            arg0.field864 = 0;
            arg0.field875 = arg0.field872[0] * 128 + arg0.field822 * 64;
            arg0.field819 = arg0.field873[0] * 128 + arg0.field822 * 64;
            arg0.method751();
        }
        method2849(arg0);
        arg0.field821 = false;
        if (arg0.field846 != -1) {
            class43 var15 = class43.method2054(arg0.field846);
            if (var15 == null || var15.field994 == null) {
                arg0.field846 = -1;
            } else {
                arg0.field861++;
                if (arg0.field852 < var15.field994.length && arg0.field861 > var15.field996[arg0.field852]) {
                    arg0.field861 = 1;
                    arg0.field852++;
                    method1980(var15, arg0.field852, arg0.field875, arg0.field819);
                }
                if (arg0.field852 >= var15.field994.length) {
                    arg0.field861 = 0;
                    arg0.field852 = 0;
                    method1980(var15, arg0.field852, arg0.field875, arg0.field819);
                }
            }
        }
        if (arg0.field854 != -1 && field302 >= arg0.field857) {
            if (arg0.field855 < 0) {
                arg0.field855 = 0;
            }
            int var16 = class44.method2656(arg0.field854).field1017;
            if (var16 == -1) {
                arg0.field854 = -1;
            } else {
                class43 var17 = class43.method2054(var16);
                if (var17 == null || var17.field994 == null) {
                    arg0.field854 = -1;
                } else {
                    arg0.field856++;
                    if (arg0.field855 < var17.field994.length && arg0.field856 > var17.field996[arg0.field855]) {
                        arg0.field856 = 1;
                        arg0.field855++;
                        method1980(var17, arg0.field855, arg0.field875, arg0.field819);
                    }
                    if (arg0.field855 >= var17.field994.length && (arg0.field855 < 0 || arg0.field855 >= var17.field994.length)) {
                        arg0.field854 = -1;
                    }
                }
            }
        }
        if (arg0.field859 != -1 && arg0.field826 <= 1) {
            class43 var18 = class43.method2054(arg0.field859);
            if (var18.field993 == 1 && arg0.field849 > 0 && arg0.field863 <= field302 && arg0.field864 < field302) {
                arg0.field826 = 1;
                return;
            }
        }
        if (arg0.field859 != -1 && arg0.field826 == 0) {
            class43 var19 = class43.method2054(arg0.field859);
            if (var19 == null || var19.field994 == null) {
                arg0.field859 = -1;
            } else {
                arg0.field844++;
                if (arg0.field850 < var19.field994.length && arg0.field844 > var19.field996[arg0.field850]) {
                    arg0.field844 = 1;
                    arg0.field850++;
                    method1980(var19, arg0.field850, arg0.field875, arg0.field819);
                }
                if (arg0.field850 >= var19.field994.length) {
                    arg0.field850 -= var19.field998;
                    arg0.field853++;
                    if (arg0.field853 >= var19.field1004) {
                        arg0.field859 = -1;
                    } else if (arg0.field850 >= 0 && arg0.field850 < var19.field994.length) {
                        method1980(var19, arg0.field850, arg0.field875, arg0.field819);
                    } else {
                        arg0.field859 = -1;
                    }
                }
                arg0.field821 = var19.field1000;
            }
        }
        if (arg0.field826 > 0) {
            arg0.field826--;
        }
    }

    @ObfuscatedName("el.ab(Lax;I)V")
    public static final void method2798(class38 arg0) {
        if (field302 == arg0.field864 || arg0.field859 == -1 || arg0.field826 != 0 || arg0.field844 + 1 > class43.method2054(arg0.field859).field996[arg0.field850]) {
            int var1 = arg0.field864 - arg0.field863;
            int var2 = field302 - arg0.field863;
            int var3 = arg0.field843 * 128 + arg0.field822 * 64;
            int var4 = arg0.field822 * 64 + arg0.field818 * 128;
            int var5 = arg0.field831 * 128 + arg0.field822 * 64;
            int var6 = arg0.field829 * 128 + arg0.field822 * 64;
            arg0.field875 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field819 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field842 = 0;
        arg0.field868 = arg0.field865;
        arg0.field820 = arg0.field868;
    }

    @ObfuscatedName("ey.aa(Lax;I)V")
    public static final void method2849(class38 arg0) {
        if (arg0.field870 == 0) {
            return;
        }
        if (arg0.field848 != -1) {
            class38 var1 = null;
            if (arg0.field848 < 32768) {
                var1 = field351[arg0.field848];
            } else if (arg0.field848 >= 32768) {
                var1 = field575[arg0.field848 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field875 - var1.field875;
                int var3 = arg0.field819 - var1.field819;
                if (var2 != 0 || var3 != 0) {
                    arg0.field868 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field841) {
                arg0.field848 = -1;
                arg0.field841 = false;
            }
        }
        if (arg0.field824 != -1 && (arg0.field871 == 0 || arg0.field842 > 0)) {
            arg0.field868 = arg0.field824;
            arg0.field824 = -1;
        }
        int var4 = arg0.field868 - arg0.field820 & 0x7FF;
        if (var4 == 0 && arg0.field841) {
            arg0.field848 = -1;
            arg0.field841 = false;
        }
        if (var4 == 0) {
            arg0.field869 = 0;
            return;
        }
        arg0.field869++;
        if (var4 > 1024) {
            arg0.field820 -= arg0.field870;
            boolean var5 = true;
            if (var4 < arg0.field870 || var4 > 2048 - arg0.field870) {
                arg0.field820 = arg0.field868;
                var5 = false;
            }
            if (arg0.field846 == arg0.field823 && (arg0.field869 > 25 || var5)) {
                if (arg0.field862 == -1) {
                    arg0.field846 = arg0.field847;
                } else {
                    arg0.field846 = arg0.field862;
                }
            }
        } else {
            arg0.field820 += arg0.field870;
            boolean var6 = true;
            if (var4 < arg0.field870 || var4 > 2048 - arg0.field870) {
                arg0.field820 = arg0.field868;
                var6 = false;
            }
            if (arg0.field846 == arg0.field823 && (arg0.field869 > 25 || var6)) {
                if (arg0.field832 == -1) {
                    arg0.field846 = arg0.field847;
                } else {
                    arg0.field846 = arg0.field832;
                }
            }
        }
        arg0.field820 &= 0x7FF;
    }

    @ObfuscatedName("t.af(Lw;III)V")
    public static void method242(class3 arg0, int arg1, int arg2) {
        if (arg0.field859 == arg1 && arg1 != -1) {
            int var3 = class43.method2054(arg1).field991;
            if (var3 == 1) {
                arg0.field850 = 0;
                arg0.field844 = 0;
                arg0.field826 = arg2;
                arg0.field853 = 0;
            }
            if (var3 == 2) {
                arg0.field853 = 0;
            }
        } else if (arg1 == -1 || arg0.field859 == -1 || class43.method2054(arg1).field1001 >= class43.method2054(arg0.field859).field1001) {
            arg0.field859 = arg1;
            arg0.field850 = 0;
            arg0.field844 = 0;
            arg0.field826 = arg2;
            arg0.field853 = 0;
            arg0.field849 = arg0.field871;
        }
    }

    @ObfuscatedName("b.al(I)I")
    public static int method11() {
        return field508 ? 2 : 1;
    }

    @ObfuscatedName("gk.ad(I)V")
    public static void method3521() {
        Canvas var0 = Statics.field1362;
        var0.removeKeyListener(class137.field2106);
        var0.removeFocusListener(class137.field2106);
        class137.field2111 = -1;
        class140.method974(Statics.field1362);
        if (Statics.field1381 != null) {
            Statics.field1381.method2695(Statics.field1362);
        }
        Statics.field290.method2876();
        Statics.field1362.setBackground(Color.black);
        Canvas var1 = Statics.field1362;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class137.field2106);
        var1.addFocusListener(class137.field2106);
        class140.method2626(Statics.field1362);
        if (Statics.field1381 != null) {
            Statics.field1381.method2694(Statics.field1362);
        }
        if (field454 != -1) {
            method3011(field454, Statics.field2014, Statics.field2019, false);
        }
        field2203 = true;
    }

    @ObfuscatedName("cn.aw(B)V")
    public static void method1783() {
        client var0 = Statics.field290;
        synchronized (Statics.field290) {
            Container var1 = Statics.field290.method2887();
            if (var1 != null) {
                Statics.field1029 = Math.max(var1.getSize().width, Statics.field2182);
                Statics.field2197 = Math.max(var1.getSize().height, Statics.field2168);
                if (Statics.field703 == var1) {
                    Insets var2 = Statics.field703.getInsets();
                    Statics.field1029 -= var2.right + var2.left;
                    Statics.field2197 -= var2.top + var2.bottom;
                }
                if (Statics.field1029 <= 0) {
                    Statics.field1029 = 1;
                }
                if (Statics.field2197 <= 0) {
                    Statics.field2197 = 1;
                }
                if (method11() == 1) {
                    Statics.field2014 = field509 * 765;
                    Statics.field2019 = field499;
                } else {
                    Statics.field2014 = Math.min(Statics.field1029, 7680);
                    Statics.field2019 = Math.min(Statics.field2197, 2160);
                }
                field2198 = (Statics.field1029 - Statics.field2014) / 2;
                field2207 = 0;
                Statics.field1362.setSize(Statics.field2014, Statics.field2019);
                Statics.field137 = class78.method2289(Statics.field2014, Statics.field2019, Statics.field1362);
                if (Statics.field703 == var1) {
                    Insets var3 = Statics.field703.getInsets();
                    Statics.field1362.setLocation(field2198 + var3.left, field2207 + var3.top);
                } else {
                    Statics.field1362.setLocation(field2198, field2207);
                }
                int var4 = Statics.field2014;
                int var5 = Statics.field2019;
                if (Statics.field1029 < var4) {
                    int var6 = Statics.field1029;
                }
                if (Statics.field2197 < var5) {
                    int var7 = Statics.field2197;
                }
                if (Statics.field783 != null) {
                    try {
                        client var8 = Statics.field290;
                        Object[] var9 = new Object[] { method11() };
                        JSObject.getWindow(var8).call("resize", var9);
                    } catch (Throwable var12) {
                    }
                }
                if (field454 != -1) {
                    method3011(field454, Statics.field2014, Statics.field2019, true);
                }
                method3075();
            }
        }
    }

    @ObfuscatedName("fs.an(I)V")
    public static void method3075() {
        int var0 = field2198;
        int var1 = field2207;
        int var2 = Statics.field1029 - Statics.field2014 - var0;
        int var3 = Statics.field2197 - Statics.field2019 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field290.method2887();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field703 == var4) {
                Insets var7 = Statics.field703.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field2197);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field1029, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field1029 + var5 - var2, var6, var2, Statics.field2197);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field2197 + var6 - var3, Statics.field1029, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("cn.ax(Ljava/lang/String;ZI)V")
    public static final void method1786(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1393.method3809(arg0, 250);
        int var6 = Statics.field1393.method3808(arg0, 250) * 13;
        class80.method1713(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1751(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1393.method3813(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method173(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method3511(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1362.getGraphics();
            Statics.field137.method1542(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1362.repaint();
        }
    }

    @ObfuscatedName("f.aq(IIIIZB)V")
    public static final void method161(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field549 - field548) * var5 / 100 + field548;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field493) {
            short var8 = field493;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field553) {
                var6 = field553;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1706();
                    class80.method1713(arg0, arg1, var10, arg3, -16777216);
                    class80.method1713(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field364) {
            short var11 = field364;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field552) {
                var6 = field552;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1706();
                    class80.method1713(arg0, arg1, arg2, var13, -16777216);
                    class80.method1713(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field551 - field555) * var5 / 100 + field555;
        field560 = arg3 * var6 * var14 / 85504 << 1;
        if (field510 != arg2 || field559 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class91.field1577[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class86.method1828(var15, 500, 800, arg2, arg3);
        }
        field565 = arg0;
        field440 = arg1;
        field510 = arg2;
        field559 = arg3;
    }

    @ObfuscatedName("y.ae(Lal;B)V")
    public static final void method193(class34 arg0) {
        if (Statics.field176.field875 >> 7 == field483 && Statics.field176.field819 >> 7 == field381) {
            field483 = 0;
        }
        int var1 = class33.field767;
        int[] var2 = class33.field770;
        int var3 = var1;
        if (class34.field779 == arg0 || class34.field780 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field779 == arg0) {
                var5 = Statics.field176;
                var6 = Statics.field176.field40 << 14;
            } else if (class34.field780 == arg0) {
                var5 = field575[field539];
                var6 = field539 << 14;
            } else {
                var5 = field575[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field782 == arg0 && field539 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method44() && !var5.field56) {
                var5.field58 = false;
                if ((field295 && var1 > 50 || var1 > 200) && class34.field779 != arg0 && var5.field846 == var5.field823) {
                    var5.field58 = true;
                }
                int var7 = var5.field875 >> 7;
                int var8 = var5.field819 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field53 == null || field302 < var5.field48 || field302 >= var5.field64) {
                        if ((var5.field875 & 0x7F) == 64 && (var5.field819 & 0x7F) == 64) {
                            if (field401 == field400[var7][var8]) {
                                continue;
                            }
                            field400[var7][var8] = field401;
                        }
                        var5.field47 = method97(var5.field875, var5.field819, Statics.field1765);
                        Statics.field39.method1805(Statics.field1765, var5.field875, var5.field819, var5.field47, 60, var5, var5.field820, var6, var5.field821);
                    } else {
                        var5.field58 = false;
                        var5.field47 = method97(var5.field875, var5.field819, Statics.field1765);
                        Statics.field39.method1806(Statics.field1765, var5.field875, var5.field819, var5.field47, 60, var5, var5.field820, var6, var5.field54, var5.field55, var5.field50, var5.field45);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bz.au(ZB)V")
    public static final void method1615(boolean arg0) {
        for (int var1 = 0; var1 < field404; var1++) {
            class35 var2 = field351[field334[var1]];
            int var3 = (field334[var1] << 14) + 536870912;
            if (var2 != null && var2.method44() && var2.field790.field913 == arg0 && var2.field790.method775()) {
                int var4 = var2.field875 >> 7;
                int var5 = var2.field819 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field822 == 1 && (var2.field875 & 0x7F) == 64 && (var2.field819 & 0x7F) == 64) {
                        if (field401 == field400[var4][var5]) {
                            continue;
                        }
                        field400[var4][var5] = field401;
                    }
                    if (!var2.field790.field921) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field39.method1805(Statics.field1765, var2.field875, var2.field819, method97(var2.field875 + (var2.field822 * 64 - 64), var2.field819 + (var2.field822 * 64 - 64), Statics.field1765), var2.field822 * 64 - 64 + 60, var2, var2.field820, var3, var2.field821);
                }
            }
        }
    }

    @ObfuscatedName("ao.ao(I)V")
    public static final void method865() {
        for (class7 var0 = (class7) field451.method3603(); var0 != null; var0 = (class7) field451.method3596()) {
            if (Statics.field1765 != var0.field110 || field302 > var0.field116) {
                var0.method3693();
            } else if (field302 >= var0.field127) {
                if (var0.field119 > 0) {
                    class35 var1 = field351[var0.field119 - 1];
                    if (var1 != null && var1.field875 >= 0 && var1.field875 < 13312 && var1.field819 >= 0 && var1.field819 < 13312) {
                        var0.method100(var1.field875, var1.field819, method97(var1.field875, var1.field819, var0.field110) - var0.field114, field302);
                    }
                }
                if (var0.field119 < 0) {
                    int var2 = -var0.field119 - 1;
                    class3 var3;
                    if (field418 == var2) {
                        var3 = Statics.field176;
                    } else {
                        var3 = field575[var2];
                    }
                    if (var3 != null && var3.field875 >= 0 && var3.field875 < 13312 && var3.field819 >= 0 && var3.field819 < 13312) {
                        var0.method100(var3.field875, var3.field819, method97(var3.field875, var3.field819, var0.field110) - var0.field114, field302);
                    }
                }
                var0.method101(field372);
                Statics.field39.method1805(Statics.field1765, (int) var0.field121, (int) var0.field122, (int) var0.field123, 60, var0, var0.field135, -1, false);
            }
        }
    }

    @ObfuscatedName("t.aj(I)V")
    public static final void method235() {
        for (class30 var0 = (class30) field430.method3603(); var0 != null; var0 = (class30) field430.method3596()) {
            if (Statics.field1765 != var0.field715 || var0.field710) {
                var0.method3693();
            } else if (field302 >= var0.field702) {
                var0.method665(field372);
                if (var0.field710) {
                    var0.method3693();
                } else {
                    Statics.field39.method1805(var0.field715, var0.field704, var0.field701, var0.field706, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("fn.am(B)I")
    public static final int method3154() {
        if (Statics.field783.field146) {
            return Statics.field1765;
        }
        int var0 = 3;
        if (Statics.field10 < 310) {
            int var1 = Statics.field781 >> 7;
            int var2 = Statics.field1944 >> 7;
            int var3 = Statics.field176.field875 >> 7;
            int var4 = Statics.field176.field819 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field1765;
            }
            if ((class6.field88[Statics.field1765][var1][var2] & 0x4) != 0) {
                var0 = Statics.field1765;
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
                    if ((class6.field88[Statics.field1765][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1765;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field88[Statics.field1765][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1765;
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
                    if ((class6.field88[Statics.field1765][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1765;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field88[Statics.field1765][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1765;
                        }
                    }
                }
            }
        }
        if (Statics.field176.field875 >= 0 && Statics.field176.field819 >= 0 && Statics.field176.field875 < 13312 && Statics.field176.field819 < 13312) {
            if ((class6.field88[Statics.field1765][Statics.field176.field875 >> 7][Statics.field176.field819 >> 7] & 0x4) != 0) {
                var0 = Statics.field1765;
            }
            return var0;
        } else {
            return Statics.field1765;
        }
    }

    @ObfuscatedName("cc.av(IIB)V")
    public static final void method2164(int arg0, int arg1) {
        if (field326 == 2) {
            method948((field313 - Statics.field3144 << 7) + field353, (field314 - Statics.field656 << 7) + field317, field315 * 2);
            if (field572 > -1 && field302 % 20 < 10) {
                Statics.field2087[0].method1629(field572 + arg0 - 12, field403 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("n.ap(Lax;IIIIII)V")
    public static final void method156(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method44()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field790;
            if (var6.field899 != null) {
                var6 = var6.method770();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field767;
        int[] var8 = class33.field770;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field56) {
                return;
            }
            if (var10.field57 != -1 || var10.field43 != -1) {
                method2980(arg0, arg0.field867 + 15);
                if (field572 > -1) {
                    if (var10.field57 != -1) {
                        Statics.field2122[var10.field57].method1629(field572 + arg2 - 12, field403 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field43 != -1) {
                        Statics.field214[var10.field43].method1629(field572 + arg2 - 12, field403 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field326 == 10 && field420 == var8[arg1]) {
                method2980(arg0, arg0.field867 + 15);
                if (field572 > -1) {
                    Statics.field2087[1].method1629(field572 + arg2 - 12, field403 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field790;
            if (var11.field899 != null) {
                var11 = var11.method770();
            }
            if (var11.field888 >= 0 && var11.field888 < Statics.field214.length) {
                method2980(arg0, arg0.field867 + 15);
                if (field572 > -1) {
                    Statics.field214[var11.field888].method1629(field572 + arg2 - 12, field403 + arg3 - 30);
                }
            }
            if (field326 == 1 && field311 == field334[arg1 - var7] && field302 % 20 < 10) {
                method2980(arg0, arg0.field867 + 15);
                if (field572 > -1) {
                    Statics.field2087[0].method1629(field572 + arg2 - 12, field403 + arg3 - 28);
                }
            }
        }
        if (arg0.field876 != null && (arg1 >= var7 || !arg0.field833 && (field512 == 4 || !arg0.field851 && (field512 == 0 || field512 == 3 || field512 == 1 && method842(((class3) arg0).field52, false))))) {
            method2980(arg0, arg0.field867);
            if (field572 > -1 && field529 < field391) {
                field395[field529] = Statics.field221.method3888(arg0.field876) / 2;
                field394[field529] = Statics.field221.field3172;
                field316[field529] = field572;
                field524[field529] = field403;
                field438[field529] = arg0.field835;
                field416[field529] = arg0.field836;
                field398[field529] = arg0.field834;
                field399[field529] = arg0.field876;
                field529++;
            }
        }
        if (arg0.field840 > field302) {
            method2980(arg0, arg0.field867 + 15);
            if (field572 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field790;
                    var12 = var13.field895;
                }
                int var14 = arg0.field860 * var12 / arg0.field880;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field860 > 0) {
                    var14 = 1;
                }
                class80.method1713(field572 + arg2 - var12 / 2, field403 + arg3 - 3, var14, 5, 65280);
                class80.method1713(field572 + arg2 - var12 / 2 + var14, field403 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field839[var15] > field302) {
                method2980(arg0, arg0.field867 / 2);
                if (field572 > -1) {
                    if (var15 == 1) {
                        field403 -= 20;
                    }
                    if (var15 == 2) {
                        field572 -= 15;
                        field403 -= 10;
                    }
                    if (var15 == 3) {
                        field572 += 15;
                        field403 -= 10;
                    }
                    Statics.field2287[arg0.field838[var15]].method1629(field572 + arg2 - 12, field403 + arg3 - 12);
                    Statics.field349.method3812(Integer.toString(arg0.field837[var15]), field572 + arg2 - 1, field403 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("q.ah(I)V")
    public static final void method603() {
        field505 = 0;
        int var0 = (Statics.field176.field875 >> 7) + Statics.field3144;
        int var1 = (Statics.field176.field819 >> 7) + Statics.field656;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field505 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field505 = 1;
        }
        if (field505 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field505 = 0;
        }
    }

    @ObfuscatedName("cq.ar(IIIII)V")
    public static final void method2077(int arg0, int arg1, int arg2, int arg3) {
        if (field407 == 1) {
            Statics.field373[field406 / 100].method1629(field456 - 8, field536 - 8);
        }
        if (field407 == 2) {
            Statics.field373[field406 / 100 + 4].method1629(field456 - 8, field536 - 8);
        }
        method603();
    }

    @ObfuscatedName("ep.az(Lax;IB)V")
    public static final void method2980(class38 arg0, int arg1) {
        method948(arg0.field875, arg0.field819, arg1);
    }

    @ObfuscatedName("av.ac(IIIB)V")
    public static final void method948(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field572 = -1;
            field403 = -1;
            return;
        }
        int var3 = method97(arg0, arg1, Statics.field1765) - arg2;
        int var4 = arg0 - Statics.field781;
        int var5 = var3 - Statics.field2030;
        int var6 = arg1 - Statics.field1944;
        int var7 = class91.field1577[Statics.field10];
        int var8 = class91.field1574[Statics.field10];
        int var9 = class91.field1577[Statics.field2161];
        int var10 = class91.field1574[Statics.field2161];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field572 = field560 * var11 / var15 + field510 / 2;
            field403 = field560 * var14 / var15 + field559 / 2;
        } else {
            field572 = -1;
            field403 = -1;
        }
    }

    @ObfuscatedName("l.as(IIII)I")
    public static final int method97(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field88[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field87[var5][var3][var4] + class6.field87[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field87[var5][var3][var4 + 1] + class6.field87[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("cg.at(ZI)V")
    public static final void method2172(boolean arg0) {
        field479 = arg0;
        if (!field479) {
            int var1 = field339.method2399();
            int var2 = field339.method2368();
            int var3 = field339.method2376();
            Statics.field977 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field977[var4][var5] = field339.method2367();
                }
            }
            Statics.field232 = new int[var3];
            Statics.field1951 = new int[var3];
            Statics.field1941 = new int[var3];
            Statics.field151 = new byte[var3][];
            Statics.field75 = new byte[var3][];
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
                        Statics.field232[var7] = var10;
                        Statics.field1951[var7] = Statics.field1888.method3079("m" + var8 + "_" + var9);
                        Statics.field1941[var7] = Statics.field1888.method3079("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method2675(var1, var2);
            return;
        }
        int var11 = field339.method2508();
        int var12 = field339.method2376();
        int var13 = field339.method2376();
        field339.method2623();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field339.method2614(1);
                    if (var17 == 1) {
                        field357[var14][var15][var16] = field339.method2614(26);
                    } else {
                        field357[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field339.method2615();
        Statics.field977 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field977[var18][var19] = field339.method2367();
            }
        }
        Statics.field232 = new int[var13];
        Statics.field1951 = new int[var13];
        Statics.field1941 = new int[var13];
        Statics.field151 = new byte[var13][];
        Statics.field75 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field357[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field232[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field232[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field1951[var20] = Statics.field1888.method3079("m" + var29 + "_" + var30);
                            Statics.field1941[var20] = Statics.field1888.method3079("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method2675(var11, var12);
    }

    @ObfuscatedName("dt.bt(IIB)V")
    public static final void method2675(int arg0, int arg1) {
        if (Statics.field256 == arg0 && Statics.field2615 == arg1) {
            return;
        }
        Statics.field256 = arg0;
        Statics.field2615 = arg1;
        method43(25);
        method1786(class157.field2307, true);
        int var2 = Statics.field3144;
        int var3 = Statics.field656;
        Statics.field3144 = (arg0 - 6) * 8;
        Statics.field656 = (arg1 - 6) * 8;
        int var4 = Statics.field3144 - var2;
        int var5 = Statics.field656 - var3;
        int var6 = Statics.field3144;
        int var7 = Statics.field656;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field351[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field872[var10] -= var4;
                    var9.field873[var10] -= var5;
                }
                var9.field875 -= var4 * 128;
                var9.field819 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field575[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field872[var13] -= var4;
                    var12.field873[var13] -= var5;
                }
                var12.field875 -= var4 * 128;
                var12.field819 -= var5 * 128;
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
                        field427[var24][var20][var21] = field427[var24][var22][var23];
                    } else {
                        field427[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field428.method3603(); var25 != null; var25 = (class17) field428.method3596()) {
            var25.field237 -= var4;
            var25.field238 -= var5;
            if (var25.field237 < 0 || var25.field238 < 0 || var25.field237 >= 104 || var25.field238 >= 104) {
                var25.method3693();
            }
        }
        if (field483 != 0) {
            field483 -= var4;
            field381 -= var5;
        }
        field393 = 0;
        field563 = false;
        field523 = -1;
        field430.method3622();
        field451.method3622();
        for (int var26 = 0; var26 < 4; var26++) {
            field355[var26].method2270();
        }
    }

    @ObfuscatedName("at.bl(ZB)V")
    public static final void method1090(boolean arg0) {
        method943();
        field343++;
        if (field343 < 50 && !arg0) {
            return;
        }
        field343 = 0;
        if (field325 || Statics.field2589 == null) {
            return;
        }
        field367.method2612(71);
        try {
            Statics.field2589.method2859(field367.field1986, 0, field367.field1977);
            field367.field1977 = 0;
        } catch (IOException var2) {
            field325 = true;
        }
    }

    @ObfuscatedName("y.bo(IIIIIB)V")
    public static final void method201(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field39.method1819(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field39.method1823(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1366.field1407;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method3251(var12);
            if (var13.field956 == -1) {
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
                class81 var14 = Statics.field18[var13.field956];
                if (var14 != null) {
                    int var15 = (var13.field942 * 4 - var14.field1421) / 2;
                    int var16 = (var13.field943 * 4 - var14.field1419) / 2;
                    var14.method1764(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field943) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field39.method1821(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field39.method1823(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method3251(var21);
            if (var22.field956 != -1) {
                class81 var23 = Statics.field18[var22.field956];
                if (var23 != null) {
                    int var24 = (var22.field942 * 4 - var23.field1421) / 2;
                    int var25 = (var22.field943 * 4 - var23.field1419) / 2;
                    var23.method1764(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field943) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1366.field1407;
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
        int var29 = Statics.field39.method1822(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method3251(var30);
        if (var31.field956 == -1) {
            return;
        }
        class81 var32 = Statics.field18[var31.field956];
        if (var32 != null) {
            int var33 = (var31.field942 * 4 - var32.field1421) / 2;
            int var34 = (var31.field943 * 4 - var32.field1419) / 2;
            var32.method1764(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field943) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("ag.bu(B)V")
    public static final void method660() {
        if (field341 == 134) {
            int var0 = field339.method2388();
            int var1 = (var0 >> 4 & 0x7) + Statics.field134;
            int var2 = (var0 & 0x7) + Statics.field359;
            int var3 = field339.method2368();
            int var4 = field339.method2390();
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = field477[var5];
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                method189(Statics.field1765, var1, var2, var7, var3, var5, var6, 0, -1);
            }
        } else if (field341 == 115) {
            int var8 = field339.method2390();
            int var9 = var8 >> 2;
            int var10 = var8 & 0x3;
            int var11 = field477[var9];
            int var12 = field339.method2362();
            int var13 = (var12 >> 4 & 0x7) + Statics.field134;
            int var14 = (var12 & 0x7) + Statics.field359;
            if (var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104) {
                method189(Statics.field1765, var13, var14, var11, -1, var9, var10, 0, -1);
            }
        } else {
            if (field341 == 255) {
                int var15 = field339.method2362();
                int var16 = (var15 >> 4 & 0x7) + Statics.field134;
                int var17 = (var15 & 0x7) + Statics.field359;
                int var18 = field339.method2376();
                int var19 = field339.method2362();
                int var20 = var19 >> 4 & 0xF;
                int var21 = var19 & 0x7;
                int var22 = field339.method2362();
                if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                    int var23 = var20 + 1;
                    if (Statics.field176.field872[0] >= var16 - var23 && Statics.field176.field872[0] <= var16 + var23 && Statics.field176.field873[0] >= var17 - var23 && Statics.field176.field873[0] <= var17 + var23 && field535 != 0 && var21 > 0 && field393 < 50) {
                        field537[field393] = var18;
                        field538[field393] = var21;
                        field402[field393] = var22;
                        field541[field393] = null;
                        field540[field393] = (var16 << 16) + (var17 << 8) + var20;
                        field393++;
                    }
                }
            }
            if (field341 == 12) {
                int var24 = field339.method2362();
                int var25 = (var24 >> 4 & 0x7) + Statics.field134;
                int var26 = (var24 & 0x7) + Statics.field359;
                int var27 = field339.method2376();
                int var28 = field339.method2376();
                int var29 = field339.method2376();
                if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                    class199 var30 = field427[Statics.field1765][var25][var26];
                    if (var30 != null) {
                        for (class29 var31 = (class29) var30.method3603(); var31 != null; var31 = (class29) var30.method3596()) {
                            if ((var27 & 0x7FFF) == var31.field693 && var31.field696 == var28) {
                                var31.field696 = var29;
                                break;
                            }
                        }
                        Statics.method123(var25, var26);
                    }
                }
            } else if (field341 == 93) {
                int var32 = field339.method2368();
                int var33 = field339.method2388();
                int var34 = (var33 >> 4 & 0x7) + Statics.field134;
                int var35 = (var33 & 0x7) + Statics.field359;
                if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
                    class199 var36 = field427[Statics.field1765][var34][var35];
                    if (var36 != null) {
                        for (class29 var37 = (class29) var36.method3603(); var37 != null; var37 = (class29) var36.method3596()) {
                            if ((var32 & 0x7FFF) == var37.field693) {
                                var37.method3693();
                                break;
                            }
                        }
                        if (var36.method3603() == null) {
                            field427[Statics.field1765][var34][var35] = null;
                        }
                        Statics.method123(var34, var35);
                    }
                }
            } else if (field341 == 225) {
                int var38 = field339.method2508();
                int var39 = field339.method2389();
                int var40 = (var39 >> 4 & 0x7) + Statics.field134;
                int var41 = (var39 & 0x7) + Statics.field359;
                int var42 = field339.method2508();
                if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
                    class29 var43 = new class29();
                    var43.field693 = var38;
                    var43.field696 = var42;
                    if (field427[Statics.field1765][var40][var41] == null) {
                        field427[Statics.field1765][var40][var41] = new class199();
                    }
                    field427[Statics.field1765][var40][var41].method3598(var43);
                    Statics.method123(var40, var41);
                }
            } else if (field341 == 78) {
                int var44 = field339.method2362();
                int var45 = (var44 >> 4 & 0x7) + Statics.field134;
                int var46 = (var44 & 0x7) + Statics.field359;
                int var47 = field339.method2376();
                int var48 = field339.method2362();
                int var49 = field339.method2376();
                if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                    int var50 = var45 * 128 + 64;
                    int var51 = var46 * 128 + 64;
                    class30 var52 = new class30(var47, Statics.field1765, var50, var51, method97(var50, var51, Statics.field1765) - var48, var49, field302);
                    field430.method3598(var52);
                }
            } else if (field341 == 166) {
                int var53 = field339.method2362();
                int var54 = (var53 >> 4 & 0x7) + Statics.field134;
                int var55 = (var53 & 0x7) + Statics.field359;
                int var56 = var54 + field339.method2391();
                int var57 = var55 + field339.method2391();
                int var58 = field339.method2365();
                int var59 = field339.method2376();
                int var60 = field339.method2362() * 4;
                int var61 = field339.method2362() * 4;
                int var62 = field339.method2376();
                int var63 = field339.method2376();
                int var64 = field339.method2362();
                int var65 = field339.method2362();
                if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104 && var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104 && var59 != 65535) {
                    int var66 = var54 * 128 + 64;
                    int var67 = var55 * 128 + 64;
                    int var68 = var56 * 128 + 64;
                    int var69 = var57 * 128 + 64;
                    class7 var70 = new class7(var59, Statics.field1765, var66, var67, method97(var66, var67, Statics.field1765) - var60, field302 + var62, field302 + var63, var64, var65, var58, var61);
                    var70.method100(var68, var69, method97(var68, var69, Statics.field1765) - var61, field302 + var62);
                    field451.method3598(var70);
                }
            } else if (field341 == 129) {
                int var71 = field339.method2389();
                int var72 = (var71 >> 4 & 0x7) + Statics.field134;
                int var73 = (var71 & 0x7) + Statics.field359;
                int var74 = field339.method2388();
                int var75 = var74 >> 2;
                int var76 = var74 & 0x3;
                int var77 = field477[var75];
                int var78 = field339.method2399();
                if (var72 >= 0 && var73 >= 0 && var72 < 103 && var73 < 103) {
                    if (var77 == 0) {
                        class87 var79 = Statics.field39.method1868(Statics.field1765, var72, var73);
                        if (var79 != null) {
                            int var80 = var79.field1523 >> 14 & 0x7FFF;
                            if (var75 == 2) {
                                var79.field1525 = new class13(var80, 2, var76 + 4, Statics.field1765, var72, var73, var78, false, var79.field1525);
                                var79.field1522 = new class13(var80, 2, var76 + 1 & 0x3, Statics.field1765, var72, var73, var78, false, var79.field1522);
                            } else {
                                var79.field1525 = new class13(var80, var75, var76, Statics.field1765, var72, var73, var78, false, var79.field1525);
                            }
                        }
                    }
                    if (var77 == 1) {
                        class94 var81 = Statics.field39.method1914(Statics.field1765, var72, var73);
                        if (var81 != null) {
                            int var82 = var81.field1597 >> 14 & 0x7FFF;
                            if (var75 == 4 || var75 == 5) {
                                var81.field1592 = new class13(var82, 4, var76, Statics.field1765, var72, var73, var78, false, var81.field1592);
                            } else if (var75 == 6) {
                                var81.field1592 = new class13(var82, 4, var76 + 4, Statics.field1765, var72, var73, var78, false, var81.field1592);
                            } else if (var75 == 7) {
                                var81.field1592 = new class13(var82, 4, (var76 + 2 & 0x3) + 4, Statics.field1765, var72, var73, var78, false, var81.field1592);
                            } else if (var75 == 8) {
                                var81.field1592 = new class13(var82, 4, var76 + 4, Statics.field1765, var72, var73, var78, false, var81.field1592);
                                var81.field1596 = new class13(var82, 4, (var76 + 2 & 0x3) + 4, Statics.field1765, var72, var73, var78, false, var81.field1596);
                            }
                        }
                    }
                    if (var77 == 2) {
                        class98 var83 = Statics.field39.method1817(Statics.field1765, var72, var73);
                        if (var75 == 11) {
                            var75 = 10;
                        }
                        if (var83 != null) {
                            var83.field1647 = new class13(var83.field1648 >> 14 & 0x7FFF, var75, var76, Statics.field1765, var72, var73, var78, false, var83.field1647);
                        }
                    }
                    if (var77 == 3) {
                        class93 var84 = Statics.field39.method1818(Statics.field1765, var72, var73);
                        if (var84 != null) {
                            var84.field1582 = new class13(var84.field1583 >> 14 & 0x7FFF, 22, var76, Statics.field1765, var72, var73, var78, false, var84.field1582);
                        }
                    }
                }
            } else if (field341 == 66) {
                int var85 = field339.method2376();
                int var86 = field339.method2388();
                int var87 = (var86 >> 4 & 0x7) + Statics.field134;
                int var88 = (var86 & 0x7) + Statics.field359;
                int var89 = field339.method2376();
                byte var90 = field339.method2393();
                byte var91 = field339.method2393();
                byte var92 = field339.method2393();
                int var93 = field339.method2508();
                int var94 = field339.method2376();
                byte var95 = field339.method2556();
                int var96 = field339.method2388();
                int var97 = var96 >> 2;
                int var98 = var96 & 0x3;
                int var99 = field477[var97];
                class3 var100;
                if (field418 == var85) {
                    var100 = Statics.field176;
                } else {
                    var100 = field575[var85];
                }
                if (var100 != null) {
                    class41 var101 = class41.method3251(var94);
                    int var102;
                    int var103;
                    if (var98 == 1 || var98 == 3) {
                        var102 = var101.field943;
                        var103 = var101.field942;
                    } else {
                        var102 = var101.field942;
                        var103 = var101.field943;
                    }
                    int var104 = (var102 >> 1) + var87;
                    int var105 = (var102 + 1 >> 1) + var87;
                    int var106 = (var103 >> 1) + var88;
                    int var107 = (var103 + 1 >> 1) + var88;
                    int[][] var108 = class6.field87[Statics.field1765];
                    int var109 = var108[var104][var106] + var108[var105][var106] + var108[var104][var107] + var108[var105][var107] >> 2;
                    int var110 = (var87 << 7) + (var102 << 6);
                    int var111 = (var88 << 7) + (var103 << 6);
                    class105 var112 = var101.method806(var97, var98, var108, var110, var109, var111);
                    if (var112 != null) {
                        method189(Statics.field1765, var87, var88, var99, -1, 0, 0, var89 + 1, var93 + 1);
                        var100.field48 = field302 + var89;
                        var100.field64 = field302 + var93;
                        var100.field53 = var112;
                        var100.field44 = var87 * 128 + var102 * 64;
                        var100.field60 = var88 * 128 + var103 * 64;
                        var100.field51 = var109;
                        if (var92 > var90) {
                            byte var113 = var92;
                            var92 = var90;
                            var90 = var113;
                        }
                        if (var91 > var95) {
                            byte var114 = var91;
                            var91 = var95;
                            var95 = var114;
                        }
                        var100.field54 = var87 + var92;
                        var100.field50 = var87 + var90;
                        var100.field55 = var88 + var91;
                        var100.field45 = var88 + var95;
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.bh(IIIIIIIIII)V")
    public static final void method189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field428.method3603(); var10 != null; var10 = (class17) field428.method3596()) {
            if (var10.field245 == arg0 && var10.field237 == arg1 && var10.field238 == arg2 && var10.field243 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field245 = arg0;
            var9.field243 = arg3;
            var9.field237 = arg1;
            var9.field238 = arg2;
            method1271(var9);
            field428.method3598(var9);
        }
        var9.field242 = arg4;
        var9.field244 = arg5;
        var9.field240 = arg6;
        var9.field235 = arg7;
        var9.field250 = arg8;
    }

    @ObfuscatedName("bm.bc(Lj;B)V")
    public static final void method1271(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field243 == 0) {
            var1 = Statics.field39.method1819(arg0.field245, arg0.field237, arg0.field238);
        }
        if (arg0.field243 == 1) {
            var1 = Statics.field39.method1820(arg0.field245, arg0.field237, arg0.field238);
        }
        if (arg0.field243 == 2) {
            var1 = Statics.field39.method1821(arg0.field245, arg0.field237, arg0.field238);
        }
        if (arg0.field243 == 3) {
            var1 = Statics.field39.method1822(arg0.field245, arg0.field237, arg0.field238);
        }
        if (var1 != 0) {
            int var5 = Statics.field39.method1823(arg0.field245, arg0.field237, arg0.field238, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field239 = var2;
        arg0.field241 = var3;
        arg0.field236 = var4;
    }

    @ObfuscatedName("ey.br(IIIIIIIB)V")
    public static final void method2850(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field295 && Statics.field1765 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field39.method1819(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field39.method1820(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field39.method1821(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field39.method1822(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field39.method1823(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field39.method1811(arg0, arg2, arg3);
                class41 var15 = class41.method3251(var12);
                if (var15.field937 != 0) {
                    field355[arg0].method2273(arg2, arg3, var13, var14, var15.field945);
                }
            }
            if (arg1 == 1) {
                Statics.field39.method1812(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field39.method1853(arg0, arg2, arg3);
                class41 var16 = class41.method3251(var12);
                if (var16.field942 + arg2 > 103 || var16.field942 + arg3 > 103 || var16.field943 + arg2 > 103 || var16.field943 + arg3 > 103) {
                    return;
                }
                if (var16.field937 != 0) {
                    field355[arg0].method2264(arg2, arg3, var16.field942, var16.field943, var14, var16.field945);
                }
            }
            if (arg1 == 3) {
                Statics.field39.method1814(arg0, arg2, arg3);
                class41 var17 = class41.method3251(var12);
                if (var17.field937 == 1) {
                    field355[arg0].method2263(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field88[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class86 var19 = Statics.field39;
        class108 var20 = field355[arg0];
        class41 var21 = class41.method3251(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field943;
            var23 = var21.field942;
        } else {
            var22 = var21.field942;
            var23 = var21.field943;
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
        int[][] var28 = class6.field87[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field953 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field963 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class85 var34;
            if (var21.field949 == -1 && var21.field968 == null) {
                var34 = var21.method806(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            var19.method1800(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field937 == 1) {
                var20.method2261(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class85 var57;
            if (var21.field949 == -1 && var21.field968 == null) {
                var57 = var21.method806(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            if (var57 != null) {
                var19.method1795(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field937 != 0) {
                var20.method2259(arg2, arg3, var22, var23, var21.field945);
            }
        } else if (arg6 >= 12) {
            class85 var35;
            if (var21.field949 == -1 && var21.field968 == null) {
                var35 = var21.method806(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            var19.method1795(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field937 != 0) {
                var20.method2259(arg2, arg3, var22, var23, var21.field945);
            }
        } else if (arg6 == 0) {
            class85 var36;
            if (var21.field949 == -1 && var21.field968 == null) {
                var36 = var21.method806(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            var19.method1972(arg0, arg2, arg3, var29, var36, (class85) null, class6.field94[arg5], 0, var32, var33);
            if (var21.field937 != 0) {
                var20.method2258(arg2, arg3, arg6, arg5, var21.field945);
            }
        } else if (arg6 == 1) {
            class85 var37;
            if (var21.field949 == -1 && var21.field968 == null) {
                var37 = var21.method806(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            var19.method1972(arg0, arg2, arg3, var29, var37, (class85) null, class6.field95[arg5], 0, var32, var33);
            if (var21.field937 != 0) {
                var20.method2258(arg2, arg3, arg6, arg5, var21.field945);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class85 var39;
            class85 var40;
            if (var21.field949 == -1 && var21.field968 == null) {
                var39 = var21.method806(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method806(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field949, true, (class85) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            var19.method1972(arg0, arg2, arg3, var29, var39, var40, class6.field94[arg5], class6.field94[var38], var32, var33);
            if (var21.field937 != 0) {
                var20.method2258(arg2, arg3, arg6, arg5, var21.field945);
            }
        } else if (arg6 == 3) {
            class85 var41;
            if (var21.field949 == -1 && var21.field968 == null) {
                var41 = var21.method806(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            var19.method1972(arg0, arg2, arg3, var29, var41, (class85) null, class6.field95[arg5], 0, var32, var33);
            if (var21.field937 != 0) {
                var20.method2258(arg2, arg3, arg6, arg5, var21.field945);
            }
        } else if (arg6 == 9) {
            class85 var42;
            if (var21.field949 == -1 && var21.field968 == null) {
                var42 = var21.method806(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            var19.method1795(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field937 != 0) {
                var20.method2259(arg2, arg3, var22, var23, var21.field945);
            }
        } else if (arg6 == 4) {
            class85 var43;
            if (var21.field949 == -1 && var21.field968 == null) {
                var43 = var21.method806(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            var19.method1803(arg0, arg2, arg3, var29, var43, (class85) null, class6.field94[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1819(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class41.method3251(var45 >> 14 & 0x7FFF).field951;
            }
            class85 var46;
            if (var21.field949 == -1 && var21.field968 == null) {
                var46 = var21.method806(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            var19.method1803(arg0, arg2, arg3, var29, var46, (class85) null, class6.field94[arg5], 0, class6.field102[arg5] * var44, class6.field97[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1819(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class41.method3251(var48 >> 14 & 0x7FFF).field951 / 2;
            }
            class85 var49;
            if (var21.field949 == -1 && var21.field968 == null) {
                var49 = var21.method806(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            var19.method1803(arg0, arg2, arg3, var29, var49, (class85) null, 256, arg5, class6.field98[arg5] * var47, class6.field99[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class85 var51;
            if (var21.field949 == -1 && var21.field968 == null) {
                var51 = var21.method806(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            var19.method1803(arg0, arg2, arg3, var29, var51, (class85) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1819(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class41.method3251(var53 >> 14 & 0x7FFF).field951 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class85 var55;
            class85 var56;
            if (var21.field949 == -1 && var21.field968 == null) {
                var55 = var21.method806(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method806(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field949, true, (class85) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            var19.method1803(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field98[arg5] * var52, class6.field99[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("es.be(ZB)V")
    public static final void method2982(boolean arg0) {
        field320 = 0;
        field335 = 0;
        field339.method2623();
        int var1 = field339.method2614(8);
        if (var1 < field404) {
            for (int var2 = var1; var2 < field404; var2++) {
                field421[++field320 - 1] = field334[var2];
            }
        }
        if (var1 > field404) {
            throw new RuntimeException("");
        }
        field404 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field334[var3];
            class35 var5 = field351[var4];
            int var6 = field339.method2614(1);
            if (var6 == 0) {
                field334[++field404 - 1] = var4;
                var5.field866 = field302;
            } else {
                int var7 = field339.method2614(2);
                if (var7 == 0) {
                    field334[++field404 - 1] = var4;
                    var5.field866 = field302;
                    field336[++field335 - 1] = var4;
                } else if (var7 == 1) {
                    field334[++field404 - 1] = var4;
                    var5.field866 = field302;
                    int var8 = field339.method2614(3);
                    var5.method722(var8, (byte) 1);
                    int var9 = field339.method2614(1);
                    if (var9 == 1) {
                        field336[++field335 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field334[++field404 - 1] = var4;
                    var5.field866 = field302;
                    int var10 = field339.method2614(3);
                    var5.method722(var10, (byte) 2);
                    int var11 = field339.method2614(3);
                    var5.method722(var11, (byte) 2);
                    int var12 = field339.method2614(1);
                    if (var12 == 1) {
                        field336[++field335 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field421[++field320 - 1] = var4;
                }
            }
        }
        method3049(arg0);
        method187();
        for (int var13 = 0; var13 < field320; var13++) {
            int var14 = field421[var13];
            if (field302 != field351[var14].field866) {
                field351[var14].field790 = null;
                field351[var14] = null;
            }
        }
        if (field340 != field339.field1977) {
            throw new RuntimeException(field339.field1977 + class2.field22 + field340);
        }
        for (int var15 = 0; var15 < field404; var15++) {
            if (field351[field334[var15]] == null) {
                throw new RuntimeException(var15 + class2.field22 + field404);
            }
        }
    }

    @ObfuscatedName("fo.bb(ZI)V")
    public static final void method3049(boolean arg0) {
        while (true) {
            if (field339.method2616(field340) >= 27) {
                int var1 = field339.method2614(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field351[var1] == null) {
                        field351[var1] = new class35();
                        var2 = true;
                    }
                    class35 var3 = field351[var1];
                    field334[++field404 - 1] = var1;
                    var3.field866 = field302;
                    int var4 = field339.method2614(1);
                    if (var4 == 1) {
                        field336[++field335 - 1] = var1;
                    }
                    var3.field790 = class40.method140(field339.method2614(14));
                    int var5;
                    if (arg0) {
                        var5 = field339.method2614(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = field339.method2614(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = field425[field339.method2614(3)];
                    if (var2) {
                        var3.field868 = var3.field820 = var6;
                    }
                    int var7 = field339.method2614(1);
                    int var8;
                    if (arg0) {
                        var8 = field339.method2614(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = field339.method2614(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    var3.field822 = var3.field790.field894;
                    var3.field870 = var3.field790.field896;
                    if (var3.field870 == 0) {
                        var3.field820 = 0;
                    }
                    var3.field847 = var3.field790.field900;
                    var3.field827 = var3.field790.field901;
                    var3.field828 = var3.field790.field890;
                    var3.field845 = var3.field790.field917;
                    var3.field823 = var3.field790.field924;
                    var3.field862 = var3.field790.field898;
                    var3.field832 = var3.field790.field905;
                    var3.method721(Statics.field176.field872[0] + var8, Statics.field176.field873[0] + var5, var7 == 1);
                    continue;
                }
            }
            field339.method2615();
            return;
        }
    }

    @ObfuscatedName("r.bd(B)V")
    public static final void method187() {
        for (int var0 = 0; var0 < field335; var0++) {
            int var1 = field336[var0];
            class35 var2 = field351[var1];
            int var3 = field339.method2362();
            if ((var3 & 0x2) != 0) {
                int var4 = field339.method2376();
                int var5 = field339.method2368();
                int var6 = var2.field875 - (var4 - Statics.field3144 - Statics.field3144) * 64;
                int var7 = var2.field819 - (var5 - Statics.field656 - Statics.field656) * 64;
                if (var6 != 0 || var7 != 0) {
                    var2.field824 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x20) != 0) {
                int var8 = field339.method2362();
                int var9 = field339.method2390();
                var2.method753(var8, var9, field302);
                var2.field840 = field302 + 300;
                var2.field860 = field339.method2399();
                var2.field880 = field339.method2399();
            }
            if ((var3 & 0x8) != 0) {
                var2.field848 = field339.method2508();
                if (var2.field848 == 65535) {
                    var2.field848 = -1;
                }
            }
            if ((var3 & 0x4) != 0) {
                var2.field854 = field339.method2508();
                int var10 = field339.method2367();
                var2.field858 = var10 >> 16;
                var2.field857 = (var10 & 0xFFFF) + field302;
                var2.field855 = 0;
                var2.field856 = 0;
                if (var2.field857 > field302) {
                    var2.field855 = -1;
                }
                if (var2.field854 == 65535) {
                    var2.field854 = -1;
                }
            }
            if ((var3 & 0x40) != 0) {
                int var11 = field339.method2376();
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = field339.method2362();
                if (var2.field859 == var11 && var11 != -1) {
                    int var13 = class43.method2054(var11).field991;
                    if (var13 == 1) {
                        var2.field850 = 0;
                        var2.field844 = 0;
                        var2.field826 = var12;
                        var2.field853 = 0;
                    }
                    if (var13 == 2) {
                        var2.field853 = 0;
                    }
                } else if (var11 == -1 || var2.field859 == -1 || class43.method2054(var11).field1001 >= class43.method2054(var2.field859).field1001) {
                    var2.field859 = var11;
                    var2.field850 = 0;
                    var2.field844 = 0;
                    var2.field826 = var12;
                    var2.field853 = 0;
                    var2.field849 = var2.field871;
                }
            }
            if ((var3 & 0x80) != 0) {
                int var14 = field339.method2389();
                int var15 = field339.method2390();
                var2.method753(var14, var15, field302);
                var2.field840 = field302 + 300;
                var2.field860 = field339.method2368();
                var2.field880 = field339.method2399();
            }
            if ((var3 & 0x1) != 0) {
                var2.field790 = class40.method140(field339.method2508());
                var2.field822 = var2.field790.field894;
                var2.field870 = var2.field790.field896;
                var2.field847 = var2.field790.field900;
                var2.field827 = var2.field790.field901;
                var2.field828 = var2.field790.field890;
                var2.field845 = var2.field790.field917;
                var2.field823 = var2.field790.field924;
                var2.field862 = var2.field790.field898;
                var2.field832 = var2.field790.field905;
            }
            if ((var3 & 0x10) != 0) {
                var2.field876 = field339.method2370();
                var2.field834 = 100;
            }
        }
    }

    @ObfuscatedName("fg.bw(IIB)Lds;")
    public static class107 method2987(int arg0, int arg1) {
        field312.field1864 = arg0;
        field312.field1861 = arg1;
        field312.field1868 = 1;
        field312.field1863 = 1;
        return field312;
    }

    @ObfuscatedName("x.bq(IIIII)V")
    public static final void method173(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field376; var4++) {
            if (field504[var4] + field502[var4] > arg0 && field502[var4] < arg0 + arg2 && field468[var4] + field396[var4] > arg1 && field396[var4] < arg1 + arg3) {
                field578[var4] = true;
            }
        }
    }

    @ObfuscatedName("gi.bp(IIIII)V")
    public static final void method3511(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field376; var4++) {
            if (field504[var4] + field502[var4] > arg0 && field502[var4] < arg0 + arg2 && field468[var4] + field396[var4] > arg1 && field396[var4] < arg1 + arg3) {
                field500[var4] = true;
            }
        }
    }

    @ObfuscatedName("h.by(B)V")
    public static final void method643() {
        method719();
        if (Statics.field272 != null || field467 != null) {
            return;
        }
        int var0 = class140.field2150;
        if (field442) {
            if (var0 != 1 && (Statics.field1395 || var0 != 4)) {
                int var1 = class140.field2139;
                int var2 = class140.field2145;
                if (var1 < Statics.field2989 - 10 || var1 > Statics.field2989 + Statics.field2146 + 10 || var2 < Statics.field218 - 10 || var2 > Statics.field218 + Statics.field1365 + 10) {
                    field442 = false;
                    method173(Statics.field2989, Statics.field218, Statics.field2146, Statics.field1365);
                }
            }
            if (var0 == 1 || !Statics.field1395 && var0 == 4) {
                int var3 = Statics.field2989;
                int var4 = Statics.field218;
                int var5 = Statics.field2146;
                int var6 = class140.field2142;
                int var7 = class140.field2148;
                int var8 = -1;
                for (int var9 = 0; var9 < field436; var9++) {
                    int var10 = (field436 - 1 - var9) * 15 + var4 + 31;
                    if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                        var8 = var9;
                    }
                }
                if (var8 != -1 && var8 >= 0) {
                    int var11 = field437[var8];
                    int var12 = field417[var8];
                    int var13 = field439[var8];
                    int var14 = field557[var8];
                    String var15 = field441[var8];
                    String var16 = field318[var8];
                    method2741(var11, var12, var13, var14, var15, var16, class140.field2142, class140.field2148);
                }
                field442 = false;
                method173(Statics.field2989, Statics.field218, Statics.field2146, Statics.field1365);
            }
            return;
        }
        if ((var0 == 1 || !Statics.field1395 && var0 == 4) && field436 > 0) {
            int var17 = field439[field436 - 1];
            if (var17 == 39 || var17 == 40 || var17 == 41 || var17 == 42 || var17 == 43 || var17 == 33 || var17 == 34 || var17 == 35 || var17 == 36 || var17 == 37 || var17 == 38 || var17 == 1005) {
                int var18 = field437[field436 - 1];
                int var19 = field417[field436 - 1];
                class173 var20 = class173.method1976(var19);
                if (class178.method2970(method184(var20)) || class178.method3006(method184(var20))) {
                    if (Statics.field272 != null && !field414 && field308 != 1 && !method1591(field436 - 1) && field436 > 0) {
                        int var21 = field411;
                        int var22 = field412;
                        method186(Statics.field2028, var21, var22);
                        Statics.field2028 = null;
                    }
                    field414 = false;
                    field415 = 0;
                    if (Statics.field272 != null) {
                        method2721(Statics.field272);
                    }
                    Statics.field272 = class173.method1976(var19);
                    field410 = var18;
                    field411 = class140.field2142;
                    field412 = class140.field2148;
                    if (field436 > 0) {
                        int var23 = field436 - 1;
                        Statics.field2028 = new class31();
                        Statics.field2028.field719 = field437[var23];
                        Statics.field2028.field723 = field417[var23];
                        Statics.field2028.field724 = field439[var23];
                        Statics.field2028.field720 = field557[var23];
                        Statics.field2028.field721 = field441[var23];
                    }
                    method2721(Statics.field272);
                    return;
                }
            }
        }
        if ((var0 == 1 || !Statics.field1395 && var0 == 4) && (field308 == 1 && field436 > 2 || method1591(field436 - 1))) {
            var0 = 2;
        }
        if ((var0 == 1 || !Statics.field1395 && var0 == 4) && field436 > 0) {
            int var24 = field436 - 1;
            if (var24 >= 0) {
                int var25 = field437[var24];
                int var26 = field417[var24];
                int var27 = field439[var24];
                int var28 = field557[var24];
                String var29 = field441[var24];
                String var30 = field318[var24];
                method2741(var25, var26, var27, var28, var29, var30, class140.field2142, class140.field2148);
            }
        }
        if (var0 == 2 && field436 > 0) {
            method42(class140.field2142, class140.field2148);
        }
    }

    @ObfuscatedName("w.bf(III)V")
    public static final void method42(int arg0, int arg1) {
        int var2 = Statics.field221.method3888(class157.field2451);
        for (int var3 = 0; var3 < field436; var3++) {
            int var4 = Statics.field221.method3888(method45(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field436 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field2014) {
            var6 = Statics.field2014 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field2019) {
            var7 = Statics.field2019 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field442 = true;
        Statics.field2989 = var6;
        Statics.field218 = var7;
        Statics.field2146 = var2;
        Statics.field1365 = field436 * 15 + 22;
    }

    @ObfuscatedName("bs.ba(II)Z")
    public static final boolean method1591(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field439[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("r.bx(Lab;III)V")
    public static final void method186(class31 arg0, int arg1, int arg2) {
        method2741(arg0.field719, arg0.field723, arg0.field724, arg0.field720, arg0.field721, arg0.field721, arg1, arg2);
    }

    @ObfuscatedName("eq.bg(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method2741(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 22) {
            field456 = arg6;
            field536 = arg7;
            field407 = 2;
            field406 = 0;
            field483 = arg0;
            field381 = arg1;
            field367.method2612(191);
            field367.method2349(arg3);
            field367.method2490(Statics.field656 + arg1);
            field367.method2386(class137.field2108[82] ? 1 : 0);
            field367.method2349(Statics.field3144 + arg0);
        }
        if (arg2 == 36) {
            field367.method2612(181);
            field367.method2490(arg3);
            field367.method2490(arg0);
            field367.method2351(arg1);
            field408 = 0;
            Statics.field201 = class173.method1976(arg1);
            field458 = arg0;
        }
        if (arg2 == 34) {
            field367.method2612(188);
            field367.method2453(arg3);
            field367.method2404(arg1);
            field367.method2503(arg0);
            field408 = 0;
            Statics.field201 = class173.method1976(arg1);
            field458 = arg0;
        }
        if (arg2 == 5) {
            field456 = arg6;
            field536 = arg7;
            field407 = 2;
            field406 = 0;
            field483 = arg0;
            field381 = arg1;
            field367.method2612(122);
            field367.method2503(Statics.field3144 + arg0);
            field367.method2349(Statics.field656 + arg1);
            field367.method2349(arg3 >> 14 & 0x7FFF);
            field367.method2386(class137.field2108[82] ? 1 : 0);
        }
        if (arg2 == 24) {
            class173 var8 = class173.method1976(arg1);
            boolean var9 = true;
            if (var8.field2741 > 0) {
                var9 = method666(var8);
            }
            if (var9) {
                field367.method2612(154);
                field367.method2351(arg1);
            }
        }
        if (arg2 == 18) {
            field456 = arg6;
            field536 = arg7;
            field407 = 2;
            field406 = 0;
            field483 = arg0;
            field381 = arg1;
            field367.method2612(38);
            field367.method2453(arg3);
            field367.method2453(Statics.field656 + arg1);
            field367.method2385(class137.field2108[82] ? 1 : 0);
            field367.method2453(Statics.field3144 + arg0);
        }
        if (arg2 == 14) {
            class3 var10 = field575[arg3];
            if (var10 != null) {
                field456 = arg6;
                field536 = arg7;
                field407 = 2;
                field406 = 0;
                field483 = arg0;
                field381 = arg1;
                field367.method2612(63);
                field367.method2349(Statics.field152);
                field367.method2404(Statics.field2686);
                field367.method2476(class137.field2108[82] ? 1 : 0);
                field367.method2503(Statics.field1658);
                field367.method2453(arg3);
            }
        }
        if (arg2 == 43) {
            field367.method2612(153);
            field367.method2453(arg3);
            field367.method2404(arg1);
            field367.method2349(arg0);
            field408 = 0;
            Statics.field201 = class173.method1976(arg1);
            field458 = arg0;
        }
        if (arg2 == 26) {
            field367.method2612(189);
            for (class4 var11 = (class4) field455.method3571(); var11 != null; var11 = (class4) field455.method3572()) {
                if (var11.field69 == 0 || var11.field69 == 3) {
                    method718(var11, true);
                }
            }
            if (field489 != null) {
                method2721(field489);
                field489 = null;
            }
        }
        if (arg2 == 47) {
            class3 var12 = field575[arg3];
            if (var12 != null) {
                field456 = arg6;
                field536 = arg7;
                field407 = 2;
                field406 = 0;
                field483 = arg0;
                field381 = arg1;
                field367.method2612(197);
                field367.method2387(class137.field2108[82] ? 1 : 0);
                field367.method2349(arg3);
            }
        }
        if (arg2 == 58) {
            class173 var13 = class173.method2984(arg1, arg0);
            if (var13 != null) {
                field367.method2612(59);
                field367.method2351(Statics.field20);
                field367.method2503(field521);
                field367.method2349(field392);
                field367.method2349(var13.field2855);
                field367.method2403(arg1);
                field367.method2490(arg0);
            }
        }
        if (arg2 == 29) {
            field367.method2612(154);
            field367.method2351(arg1);
            class173 var14 = class173.method1976(arg1);
            if (var14.field2829 != null && var14.field2829[0][0] == 5) {
                int var15 = var14.field2829[0][1];
                if (class176.field2885[var15] != var14.field2849[0]) {
                    class176.field2885[var15] = var14.field2849[0];
                    method152(var15);
                }
            }
        }
        if (arg2 == 7) {
            class35 var16 = field351[arg3];
            if (var16 != null) {
                field456 = arg6;
                field536 = arg7;
                field407 = 2;
                field406 = 0;
                field483 = arg0;
                field381 = arg1;
                field367.method2612(69);
                field367.method2351(Statics.field2686);
                field367.method2503(arg3);
                field367.method2349(Statics.field1658);
                field367.method2387(class137.field2108[82] ? 1 : 0);
                field367.method2503(Statics.field152);
            }
        }
        if (arg2 == 3) {
            field456 = arg6;
            field536 = arg7;
            field407 = 2;
            field406 = 0;
            field483 = arg0;
            field381 = arg1;
            field367.method2612(236);
            field367.method2503(Statics.field656 + arg1);
            field367.method2386(class137.field2108[82] ? 1 : 0);
            field367.method2453(Statics.field3144 + arg0);
            field367.method2490(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 45) {
            class3 var17 = field575[arg3];
            if (var17 != null) {
                field456 = arg6;
                field536 = arg7;
                field407 = 2;
                field406 = 0;
                field483 = arg0;
                field381 = arg1;
                field367.method2612(192);
                field367.method2385(class137.field2108[82] ? 1 : 0);
                field367.method2453(arg3);
            }
        }
        if (arg2 == 48) {
            class3 var18 = field575[arg3];
            if (var18 != null) {
                field456 = arg6;
                field536 = arg7;
                field407 = 2;
                field406 = 0;
                field483 = arg0;
                field381 = arg1;
                field367.method2612(185);
                field367.method2387(class137.field2108[82] ? 1 : 0);
                field367.method2453(arg3);
            }
        }
        if (arg2 == 40) {
            field367.method2612(75);
            field367.method2349(arg3);
            field367.method2490(arg0);
            field367.method2404(arg1);
            field408 = 0;
            Statics.field201 = class173.method1976(arg1);
            field458 = arg0;
        }
        if (arg2 == 21) {
            field456 = arg6;
            field536 = arg7;
            field407 = 2;
            field406 = 0;
            field483 = arg0;
            field381 = arg1;
            field367.method2612(215);
            field367.method2490(Statics.field656 + arg1);
            field367.method2503(Statics.field3144 + arg0);
            field367.method2386(class137.field2108[82] ? 1 : 0);
            field367.method2490(arg3);
        }
        if (arg2 == 1003) {
            field456 = arg6;
            field536 = arg7;
            field407 = 2;
            field406 = 0;
            class35 var19 = field351[arg3];
            if (var19 != null) {
                class40 var20 = var19.field790;
                if (var20.field899 != null) {
                    var20 = var20.method770();
                }
                if (var20 != null) {
                    field367.method2612(76);
                    field367.method2490(var20.field892);
                }
            }
        }
        if (arg2 == 25) {
            class173 var21 = class173.method2984(arg1, arg0);
            if (var21 != null) {
                method49();
                int var24 = method184(var21);
                int var25 = var24 >> 11 & 0x3F;
                method763(arg1, arg0, var25, var21.field2855);
                field369 = 0;
                int var26 = method184(var21);
                int var27 = var26 >> 11 & 0x3F;
                String var28;
                if (var27 == 0) {
                    var28 = null;
                } else if (var21.field2814 == null || var21.field2814.trim().length() == 0) {
                    var28 = null;
                } else {
                    var28 = var21.field2814;
                }
                field452 = var28;
                if (field452 == null) {
                    field452 = "Null";
                }
                if (var21.field2736) {
                    field362 = var21.field2825 + class2.method3003(16777215);
                } else {
                    field362 = class2.method3003(65280) + var21.field2851 + class2.method3003(16777215);
                }
            }
            return;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class173 var29 = class173.method2984(arg1, arg0);
            if (var29 != null) {
                method1974(arg3, arg1, arg0, var29.field2855, arg5);
            }
        }
        if (arg2 == 49) {
            class3 var30 = field575[arg3];
            if (var30 != null) {
                field456 = arg6;
                field536 = arg7;
                field407 = 2;
                field406 = 0;
                field483 = arg0;
                field381 = arg1;
                field367.method2612(37);
                field367.method2453(arg3);
                field367.method2386(class137.field2108[82] ? 1 : 0);
            }
        }
        if (arg2 == 32) {
            field367.method2612(126);
            field367.method2349(arg0);
            field367.method2405(Statics.field20);
            field367.method2503(arg3);
            field367.method2490(field521);
            field367.method2405(arg1);
            field408 = 0;
            Statics.field201 = class173.method1976(arg1);
            field458 = arg0;
        }
        if (arg2 == 35) {
            field367.method2612(161);
            field367.method2351(arg1);
            field367.method2453(arg3);
            field367.method2453(arg0);
            field408 = 0;
            Statics.field201 = class173.method1976(arg1);
            field458 = arg0;
        }
        if (arg2 == 12) {
            class35 var31 = field351[arg3];
            if (var31 != null) {
                field456 = arg6;
                field536 = arg7;
                field407 = 2;
                field406 = 0;
                field483 = arg0;
                field381 = arg1;
                field367.method2612(232);
                field367.method2476(class137.field2108[82] ? 1 : 0);
                field367.method2503(arg3);
            }
        }
        if (arg2 == 1002) {
            field456 = arg6;
            field536 = arg7;
            field407 = 2;
            field406 = 0;
            field367.method2612(141);
            field367.method2453(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 17) {
            field456 = arg6;
            field536 = arg7;
            field407 = 2;
            field406 = 0;
            field483 = arg0;
            field381 = arg1;
            field367.method2612(178);
            field367.method2387(class137.field2108[82] ? 1 : 0);
            field367.method2453(field521);
            field367.method2351(Statics.field20);
            field367.method2503(Statics.field656 + arg1);
            field367.method2503(Statics.field3144 + arg0);
            field367.method2503(arg3);
        }
        if (arg2 == 9) {
            class35 var32 = field351[arg3];
            if (var32 != null) {
                field456 = arg6;
                field536 = arg7;
                field407 = 2;
                field406 = 0;
                field483 = arg0;
                field381 = arg1;
                field367.method2612(238);
                field367.method2476(class137.field2108[82] ? 1 : 0);
                field367.method2453(arg3);
            }
        }
        if (arg2 == 51) {
            class3 var33 = field575[arg3];
            if (var33 != null) {
                field456 = arg6;
                field536 = arg7;
                field407 = 2;
                field406 = 0;
                field483 = arg0;
                field381 = arg1;
                field367.method2612(246);
                field367.method2503(arg3);
                field367.method2387(class137.field2108[82] ? 1 : 0);
            }
        }
        if (arg2 == 31) {
            field367.method2612(101);
            field367.method2405(arg1);
            field367.method2503(Statics.field152);
            field367.method2453(arg0);
            field367.method2351(Statics.field2686);
            field367.method2490(arg3);
            field367.method2349(Statics.field1658);
            field408 = 0;
            Statics.field201 = class173.method1976(arg1);
            field458 = arg0;
        }
        if (arg2 == 1001) {
            field456 = arg6;
            field536 = arg7;
            field407 = 2;
            field406 = 0;
            field483 = arg0;
            field381 = arg1;
            field367.method2612(171);
            field367.method2490(Statics.field656 + arg1);
            field367.method2385(class137.field2108[82] ? 1 : 0);
            field367.method2453(arg3 >> 14 & 0x7FFF);
            field367.method2503(Statics.field3144 + arg0);
        }
        if (arg2 == 46) {
            class3 var34 = field575[arg3];
            if (var34 != null) {
                field456 = arg6;
                field536 = arg7;
                field407 = 2;
                field406 = 0;
                field483 = arg0;
                field381 = arg1;
                field367.method2612(30);
                field367.method2385(class137.field2108[82] ? 1 : 0);
                field367.method2453(arg3);
            }
        }
        if (arg2 == 38) {
            method49();
            class173 var35 = class173.method1976(arg1);
            field369 = 1;
            Statics.field1658 = arg0;
            Statics.field2686 = arg1;
            Statics.field152 = arg3;
            method2721(var35);
            field448 = class2.method3003(16748608) + class52.method2767(arg3).field1111 + class2.method3003(16777215);
            if (field448 == null) {
                field448 = "null";
            }
            return;
        }
        if (arg2 == 30 && field489 == null) {
            method645(arg1, arg0);
            field489 = class173.method2984(arg1, arg0);
            method2721(field489);
        }
        if (arg2 == 11) {
            class35 var36 = field351[arg3];
            if (var36 != null) {
                field456 = arg6;
                field536 = arg7;
                field407 = 2;
                field406 = 0;
                field483 = arg0;
                field381 = arg1;
                field367.method2612(22);
                field367.method2349(arg3);
                field367.method2385(class137.field2108[82] ? 1 : 0);
            }
        }
        if (arg2 == 4) {
            field456 = arg6;
            field536 = arg7;
            field407 = 2;
            field406 = 0;
            field483 = arg0;
            field381 = arg1;
            field367.method2612(180);
            field367.method2349(Statics.field656 + arg1);
            field367.method2385(class137.field2108[82] ? 1 : 0);
            field367.method2490(arg3 >> 14 & 0x7FFF);
            field367.method2349(Statics.field3144 + arg0);
        }
        if (arg2 == 2) {
            field456 = arg6;
            field536 = arg7;
            field407 = 2;
            field406 = 0;
            field483 = arg0;
            field381 = arg1;
            field367.method2612(168);
            field367.method2503(Statics.field656 + arg1);
            field367.method2351(Statics.field20);
            field367.method2387(class137.field2108[82] ? 1 : 0);
            field367.method2453(field521);
            field367.method2349(Statics.field3144 + arg0);
            field367.method2453(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1004) {
            field456 = arg6;
            field536 = arg7;
            field407 = 2;
            field406 = 0;
            field367.method2612(252);
            field367.method2490(arg3);
        }
        if (arg2 == 13) {
            class35 var37 = field351[arg3];
            if (var37 != null) {
                field456 = arg6;
                field536 = arg7;
                field407 = 2;
                field406 = 0;
                field483 = arg0;
                field381 = arg1;
                field367.method2612(230);
                field367.method2476(class137.field2108[82] ? 1 : 0);
                field367.method2490(arg3);
            }
        }
        if (arg2 == 37) {
            field367.method2612(216);
            field367.method2351(arg1);
            field367.method2453(arg0);
            field367.method2503(arg3);
            field408 = 0;
            Statics.field201 = class173.method1976(arg1);
            field458 = arg0;
        }
        if (arg2 == 23) {
            Statics.field39.method1802(Statics.field1765, arg0, arg1);
        }
        if (arg2 == 28) {
            field367.method2612(154);
            field367.method2351(arg1);
            class173 var38 = class173.method1976(arg1);
            if (var38.field2829 != null && var38.field2829[0][0] == 5) {
                int var39 = var38.field2829[0][1];
                class176.field2885[var39] = 1 - class176.field2885[var39];
                method152(var39);
            }
        }
        if (arg2 == 20) {
            field456 = arg6;
            field536 = arg7;
            field407 = 2;
            field406 = 0;
            field483 = arg0;
            field381 = arg1;
            field367.method2612(182);
            field367.method2490(Statics.field3144 + arg0);
            field367.method2453(Statics.field656 + arg1);
            field367.method2386(class137.field2108[82] ? 1 : 0);
            field367.method2453(arg3);
        }
        if (arg2 == 50) {
            class3 var40 = field575[arg3];
            if (var40 != null) {
                field456 = arg6;
                field536 = arg7;
                field407 = 2;
                field406 = 0;
                field483 = arg0;
                field381 = arg1;
                field367.method2612(235);
                field367.method2453(arg3);
                field367.method2385(class137.field2108[82] ? 1 : 0);
            }
        }
        if (arg2 == 1) {
            field456 = arg6;
            field536 = arg7;
            field407 = 2;
            field406 = 0;
            field483 = arg0;
            field381 = arg1;
            field367.method2612(127);
            field367.method2349(arg3 >> 14 & 0x7FFF);
            field367.method2351(Statics.field2686);
            field367.method2503(Statics.field3144 + arg0);
            field367.method2453(Statics.field656 + arg1);
            field367.method2349(Statics.field152);
            field367.method2490(Statics.field1658);
            field367.method2476(class137.field2108[82] ? 1 : 0);
        }
        if (arg2 == 19) {
            field456 = arg6;
            field536 = arg7;
            field407 = 2;
            field406 = 0;
            field483 = arg0;
            field381 = arg1;
            field367.method2612(48);
            field367.method2349(Statics.field3144 + arg0);
            field367.method2349(Statics.field656 + arg1);
            field367.method2490(arg3);
            field367.method2385(class137.field2108[82] ? 1 : 0);
        }
        if (arg2 == 39) {
            field367.method2612(74);
            field367.method2453(arg3);
            field367.method2453(arg0);
            field367.method2351(arg1);
            field408 = 0;
            Statics.field201 = class173.method1976(arg1);
            field458 = arg0;
        }
        if (arg2 == 6) {
            field456 = arg6;
            field536 = arg7;
            field407 = 2;
            field406 = 0;
            field483 = arg0;
            field381 = arg1;
            field367.method2612(139);
            field367.method2349(Statics.field656 + arg1);
            field367.method2385(class137.field2108[82] ? 1 : 0);
            field367.method2349(arg3 >> 14 & 0x7FFF);
            field367.method2503(Statics.field3144 + arg0);
        }
        if (arg2 == 1005) {
            class173 var41 = class173.method1976(arg1);
            if (var41 == null || var41.field2854[arg0] < 100000) {
                field367.method2612(252);
                field367.method2490(arg3);
            } else {
                class12.method2737(27, "", var41.field2854[arg0] + " x " + class52.method2767(arg3).field1111);
            }
            field408 = 0;
            Statics.field201 = class173.method1976(arg1);
            field458 = arg0;
        }
        if (arg2 == 15) {
            class3 var42 = field575[arg3];
            if (var42 != null) {
                field456 = arg6;
                field536 = arg7;
                field407 = 2;
                field406 = 0;
                field483 = arg0;
                field381 = arg1;
                field367.method2612(123);
                field367.method2490(field521);
                field367.method2405(Statics.field20);
                field367.method2503(arg3);
                field367.method2386(class137.field2108[82] ? 1 : 0);
            }
        }
        if (arg2 == 10) {
            class35 var43 = field351[arg3];
            if (var43 != null) {
                field456 = arg6;
                field536 = arg7;
                field407 = 2;
                field406 = 0;
                field483 = arg0;
                field381 = arg1;
                field367.method2612(243);
                field367.method2476(class137.field2108[82] ? 1 : 0);
                field367.method2349(arg3);
            }
        }
        if (arg2 == 42) {
            field367.method2612(85);
            field367.method2349(arg0);
            field367.method2453(arg3);
            field367.method2403(arg1);
            field408 = 0;
            Statics.field201 = class173.method1976(arg1);
            field458 = arg0;
        }
        if (arg2 == 16) {
            field456 = arg6;
            field536 = arg7;
            field407 = 2;
            field406 = 0;
            field483 = arg0;
            field381 = arg1;
            field367.method2612(194);
            field367.method2405(Statics.field2686);
            field367.method2503(Statics.field656 + arg1);
            field367.method2386(class137.field2108[82] ? 1 : 0);
            field367.method2349(Statics.field3144 + arg0);
            field367.method2490(Statics.field1658);
            field367.method2453(Statics.field152);
            field367.method2503(arg3);
        }
        if (arg2 == 44) {
            class3 var44 = field575[arg3];
            if (var44 != null) {
                field456 = arg6;
                field536 = arg7;
                field407 = 2;
                field406 = 0;
                field483 = arg0;
                field381 = arg1;
                field367.method2612(9);
                field367.method2476(class137.field2108[82] ? 1 : 0);
                field367.method2453(arg3);
            }
        }
        if (arg2 == 33) {
            field367.method2612(224);
            field367.method2351(arg1);
            field367.method2453(arg0);
            field367.method2490(arg3);
            field408 = 0;
            Statics.field201 = class173.method1976(arg1);
            field458 = arg0;
        }
        if (arg2 == 41) {
            field367.method2612(244);
            field367.method2503(arg0);
            field367.method2503(arg3);
            field367.method2351(arg1);
            field408 = 0;
            Statics.field201 = class173.method1976(arg1);
            field458 = arg0;
        }
        if (arg2 == 8) {
            class35 var45 = field351[arg3];
            if (var45 != null) {
                field456 = arg6;
                field536 = arg7;
                field407 = 2;
                field406 = 0;
                field483 = arg0;
                field381 = arg1;
                field367.method2612(219);
                field367.method2503(field521);
                field367.method2385(class137.field2108[82] ? 1 : 0);
                field367.method2405(Statics.field20);
                field367.method2503(arg3);
            }
        }
        if (field369 != 0) {
            field369 = 0;
            method2721(class173.method1976(Statics.field2686));
        }
        if (field449) {
            method49();
        }
        if (Statics.field201 != null && field408 == 0) {
            method2721(Statics.field201);
        }
    }

    @ObfuscatedName("cu.bj(ILjava/lang/String;I)V")
    public static void method2075(int arg0, String arg1) {
        int var2 = class33.field767;
        int[] var3 = class33.field770;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class3 var6 = field575[var3[var5]];
            if (var6 != null && Statics.field176 != var6 && var6.field52 != null && var6.field52.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field367.method2612(9);
                    field367.method2476(0);
                    field367.method2453(var3[var5]);
                } else if (arg0 == 4) {
                    field367.method2612(197);
                    field367.method2387(0);
                    field367.method2349(var3[var5]);
                } else if (arg0 == 6) {
                    field367.method2612(37);
                    field367.method2453(var3[var5]);
                    field367.method2386(0);
                } else if (arg0 == 7) {
                    field367.method2612(235);
                    field367.method2453(var3[var5]);
                    field367.method2385(0);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class12.method2737(4, "", class157.field2366 + arg1);
        }
    }

    @ObfuscatedName("aq.bk(IIIIB)V")
    public static void method763(int arg0, int arg1, int arg2, int arg3) {
        class173 var4 = class173.method2984(arg0, arg1);
        if (var4 != null && var4.field2826 != null) {
            class1 var5 = new class1();
            var5.field16 = var4;
            var5.field12 = var4.field2826;
            class37.method734(var5);
        }
        field392 = arg3;
        field449 = true;
        Statics.field20 = arg0;
        field521 = arg1;
        Statics.field694 = arg2;
        method2721(var4);
    }

    @ObfuscatedName("d.bn(I)V")
    public static void method49() {
        if (!field449) {
            return;
        }
        class173 var0 = class173.method2984(Statics.field20, field521);
        if (var0 != null && var0.field2817 != null) {
            class1 var1 = new class1();
            var1.field16 = var0;
            var1.field12 = var0.field2817;
            class37.method734(var1);
        }
        field449 = false;
        method2721(var0);
    }

    @ObfuscatedName("ak.bi(III)V")
    public static void method645(int arg0, int arg1) {
        field367.method2612(13);
        field367.method2403(arg0);
        field367.method2349(arg1);
    }

    @ObfuscatedName("cw.bv(IIIILjava/lang/String;B)V")
    public static void method1974(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class173 var5 = class173.method2984(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2835 != null) {
            class1 var6 = new class1();
            var6.field16 = var5;
            var6.field6 = arg0;
            var6.field4 = arg4;
            var6.field12 = var5.field2835;
            class37.method734(var6);
        }
        boolean var7 = true;
        if (var5.field2741 > 0) {
            var7 = method666(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method184(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            field367.method2612(174);
            field367.method2351(arg1);
            field367.method2349(arg2);
            field367.method2349(arg3);
        }
        if (arg0 == 2) {
            field367.method2612(40);
            field367.method2351(arg1);
            field367.method2349(arg2);
            field367.method2349(arg3);
        }
        if (arg0 == 3) {
            field367.method2612(87);
            field367.method2351(arg1);
            field367.method2349(arg2);
            field367.method2349(arg3);
        }
        if (arg0 == 4) {
            field367.method2612(255);
            field367.method2351(arg1);
            field367.method2349(arg2);
            field367.method2349(arg3);
        }
        if (arg0 == 5) {
            field367.method2612(89);
            field367.method2351(arg1);
            field367.method2349(arg2);
            field367.method2349(arg3);
        }
        if (arg0 == 6) {
            field367.method2612(131);
            field367.method2351(arg1);
            field367.method2349(arg2);
            field367.method2349(arg3);
        }
        if (arg0 == 7) {
            field367.method2612(62);
            field367.method2351(arg1);
            field367.method2349(arg2);
            field367.method2349(arg3);
        }
        if (arg0 == 8) {
            field367.method2612(228);
            field367.method2351(arg1);
            field367.method2349(arg2);
            field367.method2349(arg3);
        }
        if (arg0 == 9) {
            field367.method2612(91);
            field367.method2351(arg1);
            field367.method2349(arg2);
            field367.method2349(arg3);
        }
        if (arg0 == 10) {
            field367.method2612(206);
            field367.method2351(arg1);
            field367.method2349(arg2);
            field367.method2349(arg3);
        }
    }

    @ObfuscatedName("al.bs(B)V")
    public static final void method719() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field436 - 1; var1++) {
                if (field439[var1] < 1000 && field439[var1 + 1] > 1000) {
                    String var2 = field318[var1];
                    field318[var1] = field318[var1 + 1];
                    field318[var1 + 1] = var2;
                    String var3 = field441[var1];
                    field441[var1] = field441[var1 + 1];
                    field441[var1 + 1] = var3;
                    int var4 = field439[var1];
                    field439[var1] = field439[var1 + 1];
                    field439[var1 + 1] = var4;
                    int var5 = field437[var1];
                    field437[var1] = field437[var1 + 1];
                    field437[var1 + 1] = var5;
                    int var6 = field417[var1];
                    field417[var1] = field417[var1 + 1];
                    field417[var1 + 1] = var6;
                    int var7 = field557[var1];
                    field557[var1] = field557[var1 + 1];
                    field557[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("b.bz(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method10(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field442 || field436 >= 500) {
            return;
        }
        field441[field436] = arg0;
        field318[field436] = arg1;
        field439[field436] = arg2;
        field557[field436] = arg3;
        field437[field436] = arg4;
        field417[field436] = arg5;
        field436++;
    }

    @ObfuscatedName("de.cy(I)V")
    public static void method2666() {
        for (int var0 = 0; var0 < field436; var0++) {
            if (method648(field439[var0])) {
                if (var0 < field436 - 1) {
                    for (int var1 = var0; var1 < field436 - 1; var1++) {
                        field441[var1] = field441[var1 + 1];
                        field318[var1] = field318[var1 + 1];
                        field439[var1] = field439[var1 + 1];
                        field557[var1] = field557[var1 + 1];
                        field437[var1] = field437[var1 + 1];
                        field417[var1] = field417[var1 + 1];
                    }
                }
                field436--;
            }
        }
    }

    @ObfuscatedName("ak.cx(II)Z")
    public static boolean method648(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("w.co(II)Ljava/lang/String;")
    public static String method45(int arg0) {
        return field318[arg0].length() > 0 ? field441[arg0] + class157.field2458 + field318[arg0] : field441[arg0];
    }

    @ObfuscatedName("dg.cl(Lae;IIIB)V")
    public static final void method2301(class40 arg0, int arg1, int arg2, int arg3) {
        if (field436 >= 400) {
            return;
        }
        if (arg0.field899 != null) {
            arg0 = arg0.method770();
        }
        if (arg0 == null || !arg0.field921 || arg0.field923 && field462 != arg1) {
            return;
        }
        String var4 = arg0.field893;
        if (arg0.field910 != 0) {
            int var6 = arg0.field910;
            int var7 = Statics.field176.field62;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method3003(16711680);
            } else if (var8 < -6) {
                var9 = class2.method3003(16723968);
            } else if (var8 < -3) {
                var9 = class2.method3003(16740352);
            } else if (var8 < 0) {
                var9 = class2.method3003(16756736);
            } else if (var8 > 9) {
                var9 = class2.method3003(65280);
            } else if (var8 > 6) {
                var9 = class2.method3003(4259584);
            } else if (var8 > 3) {
                var9 = class2.method3003(8453888);
            } else if (var8 > 0) {
                var9 = class2.method3003(12648192);
            } else {
                var9 = class2.method3003(16776960);
            }
            var4 = var4 + var9 + " " + class2.field24 + class157.field2454 + arg0.field910 + class2.field25;
        }
        if (field369 == 1) {
            method10(class157.field2448, field448 + " " + class2.field37 + " " + class2.method3003(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field449) {
            String[] var10 = arg0.field908;
            if (field465) {
                var10 = method682(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class157.field2450)) {
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
                        method10(var10[var11], class2.method3003(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class157.field2450)) {
                        short var14 = 0;
                        if (field319 != class21.field583) {
                            if (field319 == class21.field581 || field319 == class21.field585 && arg0.field910 > Statics.field176.field62) {
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
                            method10(var10[var13], class2.method3003(16776960) + var4, var15, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method10(class157.field2476, class2.method3003(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field694 & 0x2) == 2) {
            method10(field452, field362 + " " + class2.field37 + " " + class2.method3003(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("y.cp(Lw;IIIB)V")
    public static final void method199(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field176 == arg0 || field436 >= 400) {
            return;
        }
        String var9;
        if (arg0.field46 == 0) {
            String var4 = arg0.field49[0] + arg0.field52 + arg0.field49[1];
            int var5 = arg0.field62;
            int var6 = Statics.field176.field62;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method3003(16711680);
            } else if (var7 < -6) {
                var8 = class2.method3003(16723968);
            } else if (var7 < -3) {
                var8 = class2.method3003(16740352);
            } else if (var7 < 0) {
                var8 = class2.method3003(16756736);
            } else if (var7 > 9) {
                var8 = class2.method3003(65280);
            } else if (var7 > 6) {
                var8 = class2.method3003(4259584);
            } else if (var7 > 3) {
                var8 = class2.method3003(8453888);
            } else if (var7 > 0) {
                var8 = class2.method3003(12648192);
            } else {
                var8 = class2.method3003(16776960);
            }
            var9 = var4 + var8 + " " + class2.field24 + class157.field2454 + arg0.field62 + class2.field25 + arg0.field49[2];
        } else {
            var9 = arg0.field49[0] + arg0.field52 + arg0.field49[1] + " " + class2.field24 + class157.field2413 + arg0.field46 + class2.field25 + arg0.field49[2];
        }
        if (field369 == 1) {
            method10(class157.field2448, field448 + " " + class2.field37 + " " + class2.method3003(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field449) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field423[var10] != null) {
                    short var11 = 0;
                    if (field423[var10].equalsIgnoreCase(class157.field2450)) {
                        if (field405 == class21.field583) {
                            continue;
                        }
                        if (field405 == class21.field581 || field405 == class21.field585 && arg0.field62 > Statics.field176.field62) {
                            var11 = 2000;
                        }
                        if (Statics.field176.field59 != 0 && arg0.field59 != 0) {
                            if (Statics.field176.field59 == arg0.field59) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field424[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field488[var10] + var11;
                    method10(field423[var10], class2.method3003(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field694 & 0x8) == 8) {
            method10(field452, field362 + " " + class2.field37 + " " + class2.method3003(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field436; var14++) {
            if (field439[var14] == 23) {
                field318[var14] = class2.method3003(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("ax.cn(IIIIIIIII)V")
    public static final void method761(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class173.method2967(arg0)) {
            Statics.field15 = null;
            method3009(Statics.field2811[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field15 != null) {
                method3009(Statics.field15, -1412584499, arg1, arg2, arg3, arg4, Statics.field659, Statics.field2650, arg7);
                Statics.field15 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field578[var8] = true;
            }
        } else {
            field578[arg7] = true;
        }
    }

    @ObfuscatedName("fx.ch([Lfp;IIIIIIIII)V")
    public static final void method3009(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1738(arg2, arg3, arg4, arg5);
        class91.method1984();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class173 var10 = arg0[var9];
            if (var10 != null && (var10.field2858 == arg1 || arg1 == -1412584499 && field467 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field502[field376] = var10.field2750 + arg6;
                    field396[field376] = var10.field2859 + arg7;
                    field504[field376] = var10.field2780;
                    field468[field376] = var10.field2753;
                    var11 = ++field376 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2821 = var11;
                var10.field2867 = field302;
                if (!var10.field2736 || !method2290(var10)) {
                    if (var10.field2741 > 0) {
                        int var12 = var10.field2741;
                        if (var12 == 324) {
                            if (field568 == -1) {
                                field568 = var10.field2782;
                                field569 = var10.field2762;
                            }
                            if (field503.field2901) {
                                var10.field2782 = field568;
                            } else {
                                var10.field2782 = field569;
                            }
                        } else if (var12 == 325) {
                            if (field568 == -1) {
                                field568 = var10.field2782;
                                field569 = var10.field2762;
                            }
                            if (field503.field2901) {
                                var10.field2782 = field569;
                            } else {
                                var10.field2782 = field568;
                            }
                        } else if (var12 == 327) {
                            var10.field2786 = 150;
                            var10.field2818 = (int) (Math.sin((double) field302 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2778 = 5;
                            var10.field2779 = 0;
                        } else if (var12 == 328) {
                            var10.field2786 = 150;
                            var10.field2818 = (int) (Math.sin((double) field302 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2778 = 5;
                            var10.field2779 = 1;
                        }
                    }
                    int var13 = var10.field2750 + arg6;
                    int var14 = var10.field2859 + arg7;
                    int var15 = var10.field2767;
                    if (field467 == var10) {
                        if (arg1 != -1412584499 && !var10.field2813) {
                            Statics.field15 = arg0;
                            Statics.field659 = arg6;
                            Statics.field2650 = arg7;
                            continue;
                        }
                        if (field478 && field501) {
                            int var16 = class140.field2139;
                            int var17 = class140.field2145;
                            int var18 = var16 - field556;
                            int var19 = var17 - field470;
                            if (var18 < field473) {
                                var18 = field473;
                            }
                            if (var10.field2780 + var18 > field473 + field390.field2780) {
                                var18 = field473 + field390.field2780 - var10.field2780;
                            }
                            if (var19 < field474) {
                                var19 = field474;
                            }
                            if (var10.field2753 + var19 > field474 + field390.field2753) {
                                var19 = field474 + field390.field2753 - var10.field2753;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2813) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2739 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2739 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2780 + var13;
                        int var27 = var10.field2753 + var14;
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
                        int var30 = var10.field2780 + var13;
                        int var31 = var10.field2753 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2736 || var20 < var22 && var21 < var23) {
                        if (var10.field2741 != 0) {
                            if (var10.field2741 == 1336) {
                                if (field296) {
                                    var14 += 15;
                                    Statics.field1393.method3811("Fps:" + field2189, var10.field2780 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field295) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field295) {
                                        var34 = 16711680;
                                    }
                                    Statics.field1393.method3811("Mem:" + var33 + "k", var10.field2780 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2741 == 1337) {
                                field443 = var13;
                                field444 = var14;
                                int var37 = var10.field2780;
                                int var38 = var10.field2753;
                                field401++;
                                method193(class34.field779);
                                boolean var39 = false;
                                if (field539 >= 0) {
                                    int var40 = class33.field767;
                                    int[] var41 = class33.field770;
                                    for (int var42 = 0; var42 < var40; var42++) {
                                        if (field539 == var41[var42]) {
                                            var39 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var39) {
                                    method193(class34.field780);
                                }
                                method1615(true);
                                method193(var39 ? class34.field782 : class34.field786);
                                method1615(false);
                                method865();
                                method235();
                                method161(var13, var14, var37, var38, true);
                                int var43 = field565;
                                int var44 = field440;
                                int var45 = field510;
                                int var46 = field559;
                                class80.method1738(var43, var44, var43 + var45, var44 + var46);
                                class91.method1984();
                                if (!field563) {
                                    int var47 = field380;
                                    if (field389 / 256 > var47) {
                                        var47 = field389 / 256;
                                    }
                                    if (field543[4] && field545[4] + 128 > var47) {
                                        var47 = field545[4] + 128;
                                    }
                                    int var48 = field573 + field522 & 0x7FF;
                                    int var49 = Statics.field180;
                                    int var50 = method97(Statics.field176.field875, Statics.field176.field819, Statics.field1765) - field386;
                                    int var51 = Statics.field757;
                                    int var52 = var47 * 3 + 600;
                                    int var53 = 2048 - var47 & 0x7FF;
                                    int var54 = 2048 - var48 & 0x7FF;
                                    int var55 = 0;
                                    int var56 = 0;
                                    int var57 = var52;
                                    if (var53 != 0) {
                                        int var58 = class91.field1577[var53];
                                        int var59 = class91.field1574[var53];
                                        int var60 = var56 * var59 - var52 * var58 >> 16;
                                        var57 = var56 * var58 + var52 * var59 >> 16;
                                        var56 = var60;
                                    }
                                    if (var54 != 0) {
                                        int var61 = class91.field1577[var54];
                                        int var62 = class91.field1574[var54];
                                        int var63 = var55 * var62 + var57 * var61 >> 16;
                                        var57 = var57 * var62 - var55 * var61 >> 16;
                                        var55 = var63;
                                    }
                                    Statics.field781 = var49 - var55;
                                    Statics.field2030 = var50 - var56;
                                    Statics.field1944 = var51 - var57;
                                    Statics.field10 = var47;
                                    Statics.field2161 = var48;
                                }
                                int var64;
                                if (field563) {
                                    int var65;
                                    if (Statics.field783.field146) {
                                        var65 = Statics.field1765;
                                    } else {
                                        int var66 = method97(Statics.field781, Statics.field1944, Statics.field1765);
                                        if (var66 - Statics.field2030 >= 800 || (class6.field88[Statics.field1765][Statics.field781 >> 7][Statics.field1944 >> 7] & 0x4) == 0) {
                                            var65 = 3;
                                        } else {
                                            var65 = Statics.field1765;
                                        }
                                    }
                                    var64 = var65;
                                } else {
                                    var64 = method3154();
                                }
                                int var67 = Statics.field781;
                                int var68 = Statics.field2030;
                                int var69 = Statics.field1944;
                                int var70 = Statics.field10;
                                int var71 = Statics.field2161;
                                for (int var72 = 0; var72 < 5; var72++) {
                                    if (field543[var72]) {
                                        int var73 = (int) (Math.random() * (double) (field544[var72] * 2 + 1) - (double) field544[var72] + Math.sin((double) field546[var72] / 100.0D * (double) field542[var72]) * (double) field545[var72]);
                                        if (var72 == 0) {
                                            Statics.field781 += var73;
                                        }
                                        if (var72 == 1) {
                                            Statics.field2030 += var73;
                                        }
                                        if (var72 == 2) {
                                            Statics.field1944 += var73;
                                        }
                                        if (var72 == 3) {
                                            Statics.field2161 = Statics.field2161 + var73 & 0x7FF;
                                        }
                                        if (var72 == 4) {
                                            Statics.field10 += var73;
                                            if (Statics.field10 < 128) {
                                                Statics.field10 = 128;
                                            }
                                            if (Statics.field10 > 383) {
                                                Statics.field10 = 383;
                                            }
                                        }
                                    }
                                }
                                int var74 = class140.field2139;
                                int var75 = class140.field2145;
                                if (class140.field2150 != 0) {
                                    var74 = class140.field2142;
                                    var75 = class140.field2148;
                                }
                                if (var74 >= var43 && var74 < var43 + var45 && var75 >= var44 && var75 < var44 + var46) {
                                    class105.field1836 = true;
                                    class105.field1811 = 0;
                                    class105.field1819 = var74 - var43;
                                    class105.field1838 = var75 - var44;
                                } else {
                                    class105.field1836 = false;
                                    class105.field1811 = 0;
                                }
                                method943();
                                class80.method1713(var43, var44, var45, var46, 0);
                                method943();
                                int var76 = class91.field1573;
                                class91.field1573 = field560;
                                Statics.field39.method1794(Statics.field781, Statics.field2030, Statics.field1944, Statics.field10, Statics.field2161, var64);
                                class91.field1573 = var76;
                                method943();
                                Statics.field39.method1808();
                                field529 = 0;
                                boolean var77 = false;
                                int var78 = -1;
                                int var79 = class33.field767;
                                int[] var80 = class33.field770;
                                for (int var81 = 0; var81 < field404 + var79; var81++) {
                                    class38 var82;
                                    if (var81 < var79) {
                                        var82 = field575[var80[var81]];
                                        if (field539 == var80[var81]) {
                                            var77 = true;
                                            var78 = var81;
                                            continue;
                                        }
                                    } else {
                                        var82 = field351[field334[var81 - var79]];
                                    }
                                    method156(var82, var81, var43, var44, var45, var46);
                                }
                                if (var77) {
                                    method156(field575[field539], var78, var43, var44, var45, var46);
                                }
                                for (int var83 = 0; var83 < field529; var83++) {
                                    int var84 = field316[var83];
                                    int var85 = field524[var83];
                                    int var86 = field395[var83];
                                    int var87 = field394[var83];
                                    boolean var88 = true;
                                    while (var88) {
                                        var88 = false;
                                        for (int var89 = 0; var89 < var83; var89++) {
                                            if (var85 + 2 > field524[var89] - field394[var89] && var85 - var87 < field524[var89] + 2 && var84 - var86 < field395[var89] + field316[var89] && var84 + var86 > field316[var89] - field395[var89] && field524[var89] - field394[var89] < var85) {
                                                var85 = field524[var89] - field394[var89];
                                                var88 = true;
                                            }
                                        }
                                    }
                                    field572 = field316[var83];
                                    field403 = field524[var83] = var85;
                                    String var90 = field399[var83];
                                    if (field511 == 0) {
                                        int var91 = 16776960;
                                        if (field438[var83] < 6) {
                                            var91 = field450[field438[var83]];
                                        }
                                        if (field438[var83] == 6) {
                                            var91 = field401 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field438[var83] == 7) {
                                            var91 = field401 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field438[var83] == 8) {
                                            var91 = field401 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field438[var83] == 9) {
                                            int var92 = 150 - field398[var83];
                                            if (var92 < 50) {
                                                var91 = var92 * 1280 + 16711680;
                                            } else if (var92 < 100) {
                                                var91 = 16776960 - (var92 - 50) * 327680;
                                            } else if (var92 < 150) {
                                                var91 = (var92 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field438[var83] == 10) {
                                            int var93 = 150 - field398[var83];
                                            if (var93 < 50) {
                                                var91 = var93 * 5 + 16711680;
                                            } else if (var93 < 100) {
                                                var91 = 16711935 - (var93 - 50) * 327680;
                                            } else if (var93 < 150) {
                                                var91 = (var93 - 100) * 327680 + 255 - (var93 - 100) * 5;
                                            }
                                        }
                                        if (field438[var83] == 11) {
                                            int var94 = 150 - field398[var83];
                                            if (var94 < 50) {
                                                var91 = 16777215 - var94 * 327685;
                                            } else if (var94 < 100) {
                                                var91 = (var94 - 50) * 327685 + 65280;
                                            } else if (var94 < 150) {
                                                var91 = 16777215 - (var94 - 100) * 327680;
                                            }
                                        }
                                        if (field416[var83] == 0) {
                                            Statics.field221.method3812(var90, field572 + var43, field403 + var44, var91, 0);
                                        }
                                        if (field416[var83] == 1) {
                                            Statics.field221.method3814(var90, field572 + var43, field403 + var44, var91, 0, field401);
                                        }
                                        if (field416[var83] == 2) {
                                            Statics.field221.method3852(var90, field572 + var43, field403 + var44, var91, 0, field401);
                                        }
                                        if (field416[var83] == 3) {
                                            Statics.field221.method3816(var90, field572 + var43, field403 + var44, var91, 0, field401, 150 - field398[var83]);
                                        }
                                        if (field416[var83] == 4) {
                                            int var95 = (150 - field398[var83]) * (Statics.field221.method3888(var90) + 100) / 150;
                                            class80.method1704(field572 + var43 - 50, var44, field572 + var43 + 50, var44 + var46);
                                            Statics.field221.method3810(var90, field572 + var43 + 50 - var95, field403 + var44, var91, 0);
                                            class80.method1738(var43, var44, var43 + var45, var44 + var46);
                                        }
                                        if (field416[var83] == 5) {
                                            int var96 = 150 - field398[var83];
                                            int var97 = 0;
                                            if (var96 < 25) {
                                                var97 = var96 - 25;
                                            } else if (var96 > 125) {
                                                var97 = var96 - 125;
                                            }
                                            class80.method1704(var43, field403 + var44 - Statics.field221.field3172 - 1, var43 + var45, field403 + var44 + 5);
                                            Statics.field221.method3812(var90, field572 + var43, field403 + var44 + var97, var91, 0);
                                            class80.method1738(var43, var44, var43 + var45, var44 + var46);
                                        }
                                    } else {
                                        Statics.field221.method3812(var90, field572 + var43, field403 + var44, 16776960, 0);
                                    }
                                }
                                method2164(var43, var44);
                                ((class95) Statics.field1554).method2061(field372);
                                method2077(var43, var44, var45, var46);
                                Statics.field781 = var67;
                                Statics.field2030 = var68;
                                Statics.field1944 = var69;
                                Statics.field10 = var70;
                                Statics.field2161 = var71;
                                if (field301 && class171.method723(true, false) == 0) {
                                    field301 = false;
                                }
                                if (field301) {
                                    class80.method1713(var43, var44, var45, var46, 0);
                                    method1786(class157.field2307, false);
                                }
                                field578[var10.field2821] = true;
                                class80.method1738(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2741 == 1338) {
                                method943();
                                class175 var98 = var10.method3238(false);
                                if (var98 != null) {
                                    class80.method1738(var13, var14, var98.field2877 + var13, var98.field2878 + var14);
                                    if (field530 == 2 || field530 == 5) {
                                        class80.method1722(var13, var14, 0, var98.field2880, var98.field2879);
                                    } else {
                                        int var99 = field573 + field558 & 0x7FF;
                                        int var100 = Statics.field176.field875 / 32 + 48;
                                        int var101 = 464 - Statics.field176.field819 / 32;
                                        Statics.field1366.method1640(var13, var14, var98.field2877, var98.field2878, var100, var101, var99, field481 + 256, var98.field2880, var98.field2879);
                                        for (int var102 = 0; var102 < field426; var102++) {
                                            int var103 = field525[var102] * 4 + 2 - Statics.field176.field875 / 32;
                                            int var104 = field526[var102] * 4 + 2 - Statics.field176.field819 / 32;
                                            method748(var13, var14, var103, var104, field527[var102], var98);
                                        }
                                        int var105 = 0;
                                        while (true) {
                                            if (var105 >= 104) {
                                                for (int var110 = 0; var110 < field404; var110++) {
                                                    class35 var111 = field351[field334[var110]];
                                                    if (var111 != null && var111.method44()) {
                                                        class40 var112 = var111.field790;
                                                        if (var112 != null && var112.field899 != null) {
                                                            var112 = var112.method770();
                                                        }
                                                        if (var112 != null && var112.field909 && var112.field921) {
                                                            int var113 = var111.field875 / 32 - Statics.field176.field875 / 32;
                                                            int var114 = var111.field819 / 32 - Statics.field176.field819 / 32;
                                                            method748(var13, var14, var113, var114, Statics.field79[1], var98);
                                                        }
                                                    }
                                                }
                                                int var115 = class33.field767;
                                                int[] var116 = class33.field770;
                                                for (int var117 = 0; var117 < var115; var117++) {
                                                    class3 var118 = field575[var116[var117]];
                                                    if (var118 != null && var118.method44() && !var118.field56 && Statics.field176 != var118) {
                                                        int var119 = var118.field875 / 32 - Statics.field176.field875 / 32;
                                                        int var120 = var118.field819 / 32 - Statics.field176.field819 / 32;
                                                        boolean var121 = false;
                                                        if (method842(var118.field52, true)) {
                                                            var121 = true;
                                                        }
                                                        boolean var122 = false;
                                                        for (int var123 = 0; var123 < Statics.field1547; var123++) {
                                                            if (var118.field52.equals(Statics.field142[var123].field631)) {
                                                                var122 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var124 = false;
                                                        if (Statics.field176.field59 != 0 && var118.field59 != 0 && Statics.field176.field59 == var118.field59) {
                                                            var124 = true;
                                                        }
                                                        if (var121) {
                                                            method748(var13, var14, var119, var120, Statics.field79[3], var98);
                                                        } else if (var124) {
                                                            method748(var13, var14, var119, var120, Statics.field79[4], var98);
                                                        } else if (var122) {
                                                            method748(var13, var14, var119, var120, Statics.field79[5], var98);
                                                        } else {
                                                            method748(var13, var14, var119, var120, Statics.field79[2], var98);
                                                        }
                                                    }
                                                }
                                                if (field326 != 0 && field302 % 20 < 10) {
                                                    if (field326 == 1 && field311 >= 0 && field311 < field351.length) {
                                                        class35 var125 = field351[field311];
                                                        if (var125 != null) {
                                                            int var126 = var125.field875 / 32 - Statics.field176.field875 / 32;
                                                            int var127 = var125.field819 / 32 - Statics.field176.field819 / 32;
                                                            method202(var13, var14, var126, var127, Statics.field2132[1], var98);
                                                        }
                                                    }
                                                    if (field326 == 2) {
                                                        int var128 = field313 * 4 - Statics.field3144 * 4 + 2 - Statics.field176.field875 / 32;
                                                        int var129 = field314 * 4 - Statics.field656 * 4 + 2 - Statics.field176.field819 / 32;
                                                        method202(var13, var14, var128, var129, Statics.field2132[1], var98);
                                                    }
                                                    if (field326 == 10 && field420 >= 0 && field420 < field575.length) {
                                                        class3 var130 = field575[field420];
                                                        if (var130 != null) {
                                                            int var131 = var130.field875 / 32 - Statics.field176.field875 / 32;
                                                            int var132 = var130.field819 / 32 - Statics.field176.field819 / 32;
                                                            method202(var13, var14, var131, var132, Statics.field2132[1], var98);
                                                        }
                                                    }
                                                }
                                                if (field483 != 0) {
                                                    int var133 = field483 * 4 + 2 - Statics.field176.field875 / 32;
                                                    int var134 = field381 * 4 + 2 - Statics.field176.field819 / 32;
                                                    method748(var13, var14, var133, var134, Statics.field2132[0], var98);
                                                }
                                                if (!Statics.field176.field56) {
                                                    class80.method1713(var98.field2877 / 2 + var13 - 1, var98.field2878 / 2 + var14 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var106 = 0; var106 < 104; var106++) {
                                                class199 var107 = field427[Statics.field1765][var105][var106];
                                                if (var107 != null) {
                                                    int var108 = var105 * 4 + 2 - Statics.field176.field875 / 32;
                                                    int var109 = var106 * 4 + 2 - Statics.field176.field819 / 32;
                                                    method748(var13, var14, var108, var109, Statics.field79[0], var98);
                                                }
                                            }
                                            var105++;
                                        }
                                    }
                                    field500[var11] = true;
                                }
                                class80.method1738(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2741 == 1339) {
                                method104(var10, var13, var14, var11);
                                class80.method1738(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2739 == 0) {
                            if (!var10.field2736 && method2290(var10) && Statics.field360 != var10) {
                                continue;
                            }
                            if (!var10.field2736) {
                                if (var10.field2791 > var10.field2761 - var10.field2753) {
                                    var10.field2791 = var10.field2761 - var10.field2753;
                                }
                                if (var10.field2791 < 0) {
                                    var10.field2791 = 0;
                                }
                            }
                            method3009(arg0, var10.field2737, var20, var21, var22, var23, var13 - var10.field2758, var14 - var10.field2791, var11);
                            if (var10.field2868 != null) {
                                method3009(var10.field2868, var10.field2737, var20, var21, var22, var23, var13 - var10.field2758, var14 - var10.field2791, var11);
                            }
                            class4 var135 = (class4) field455.method3573((long) var10.field2737);
                            if (var135 != null) {
                                method761(var135.field74, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class80.method1738(arg2, arg3, arg4, arg5);
                            class91.method1984();
                        }
                        if (field508 || field409[var11] || field506 > 1) {
                            if (var10.field2739 == 0 && !var10.field2736 && var10.field2761 > var10.field2753) {
                                int var136 = var10.field2780 + var13;
                                int var137 = var10.field2791;
                                int var138 = var10.field2753;
                                int var139 = var10.field2761;
                                Statics.field2639[0].method1764(var136, var14);
                                Statics.field2639[1].method1764(var136, var14 + var138 - 16);
                                class80.method1713(var136, var14 + 16, 16, var138 - 32, field374);
                                int var140 = (var138 - 32) * var138 / var139;
                                if (var140 < 8) {
                                    var140 = 8;
                                }
                                int var141 = (var138 - 32 - var140) * var137 / (var139 - var138);
                                class80.method1713(var136, var14 + 16 + var141, 16, var140, field375);
                                class80.method1754(var136, var14 + 16 + var141, var140, field377);
                                class80.method1754(var136 + 1, var14 + 16 + var141, var140, field377);
                                class80.method1743(var136, var14 + 16 + var141, 16, field377);
                                class80.method1743(var136, var14 + 17 + var141, 16, field377);
                                class80.method1754(var136 + 15, var14 + 16 + var141, var140, field292);
                                class80.method1754(var136 + 14, var14 + 17 + var141, var140 - 1, field292);
                                class80.method1743(var136, var14 + 15 + var141 + var140, 16, field292);
                                class80.method1743(var136 + 1, var14 + 14 + var141 + var140, 15, field292);
                            }
                            if (var10.field2739 != 1) {
                                if (var10.field2739 == 2) {
                                    int var142 = 0;
                                    for (int var143 = 0; var143 < var10.field2749; var143++) {
                                        for (int var144 = 0; var144 < var10.field2748; var144++) {
                                            int var145 = (var10.field2751 + 32) * var144 + var13;
                                            int var146 = (var10.field2802 + 32) * var143 + var14;
                                            if (var142 < 20) {
                                                var145 += var10.field2803[var142];
                                                var146 += var10.field2771[var142];
                                            }
                                            if (var10.field2853[var142] > 0) {
                                                boolean var147 = false;
                                                boolean var148 = false;
                                                int var149 = var10.field2853[var142] - 1;
                                                if (var145 + 32 > arg2 && var145 < arg4 && var146 + 32 > arg3 && var146 < arg5 || Statics.field272 == var10 && field410 == var142) {
                                                    class79 var150;
                                                    if (field369 == 1 && Statics.field1658 == var142 && Statics.field2686 == var10.field2737) {
                                                        var150 = class52.method605(var149, var10.field2854[var142], 2, 0, 2, false);
                                                    } else {
                                                        var150 = class52.method605(var149, var10.field2854[var142], 1, 3153952, 2, false);
                                                    }
                                                    if (var150 == null) {
                                                        method2721(var10);
                                                    } else if (Statics.field272 == var10 && field410 == var142) {
                                                        int var151 = class140.field2139 - field411;
                                                        int var152 = class140.field2145 - field412;
                                                        if (var151 < 5 && var151 > -5) {
                                                            var151 = 0;
                                                        }
                                                        if (var152 < 5 && var152 > -5) {
                                                            var152 = 0;
                                                        }
                                                        if (field415 < 5) {
                                                            var151 = 0;
                                                            var152 = 0;
                                                        }
                                                        var150.method1635(var145 + var151, var146 + var152, 128);
                                                        if (arg1 != -1) {
                                                            class173 var153 = arg0[arg1 & 0xFFFF];
                                                            if (var146 + var152 < class80.field1412 && var153.field2791 > 0) {
                                                                int var154 = field372 * (class80.field1412 - var146 - var152) / 3;
                                                                if (var154 > field372 * 10) {
                                                                    var154 = field372 * 10;
                                                                }
                                                                if (var154 > var153.field2791) {
                                                                    var154 = var153.field2791;
                                                                }
                                                                var153.field2791 -= var154;
                                                                field412 += var154;
                                                                method2721(var153);
                                                            }
                                                            if (var146 + var152 + 32 > class80.field1413 && var153.field2791 < var153.field2761 - var153.field2753) {
                                                                int var155 = field372 * (var146 + var152 + 32 - class80.field1413) / 3;
                                                                if (var155 > field372 * 10) {
                                                                    var155 = field372 * 10;
                                                                }
                                                                if (var155 > var153.field2761 - var153.field2753 - var153.field2791) {
                                                                    var155 = var153.field2761 - var153.field2753 - var153.field2791;
                                                                }
                                                                var153.field2791 += var155;
                                                                field412 -= var155;
                                                                method2721(var153);
                                                            }
                                                        }
                                                    } else if (Statics.field201 == var10 && field458 == var142) {
                                                        var150.method1635(var145, var146, 128);
                                                    } else {
                                                        var150.method1629(var145, var146);
                                                    }
                                                }
                                            } else if (var10.field2805 != null && var142 < 20) {
                                                class79 var156 = var10.method3235(var142);
                                                if (var156 != null) {
                                                    var156.method1629(var145, var146);
                                                } else if (class173.field2735) {
                                                    method2721(var10);
                                                }
                                            }
                                            var142++;
                                        }
                                    }
                                } else if (var10.field2739 == 3) {
                                    int var157;
                                    if (method2797(var10)) {
                                        var157 = var10.field2759;
                                        if (Statics.field360 == var10 && var10.field2765 != 0) {
                                            var157 = var10.field2765;
                                        }
                                    } else {
                                        var157 = var10.field2804;
                                        if (Statics.field360 == var10 && var10.field2764 != 0) {
                                            var157 = var10.field2764;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2766) {
                                            class80.method1713(var13, var14, var10.field2780, var10.field2753, var157);
                                        } else {
                                            class80.method1751(var13, var14, var10.field2780, var10.field2753, var157);
                                        }
                                    } else if (var10.field2766) {
                                        class80.method1712(var13, var14, var10.field2780, var10.field2753, var157, 256 - (var15 & 0xFF));
                                    } else {
                                        class80.method1716(var13, var14, var10.field2780, var10.field2753, var157, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2739 == 4) {
                                    class224 var158 = var10.method3215();
                                    if (var158 != null) {
                                        String var159 = var10.field2795;
                                        int var160;
                                        if (method2797(var10)) {
                                            var160 = var10.field2759;
                                            if (Statics.field360 == var10 && var10.field2765 != 0) {
                                                var160 = var10.field2765;
                                            }
                                            if (var10.field2796.length() > 0) {
                                                var159 = var10.field2796;
                                            }
                                        } else {
                                            var160 = var10.field2804;
                                            if (Statics.field360 == var10 && var10.field2764 != 0) {
                                                var160 = var10.field2764;
                                            }
                                        }
                                        if (var10.field2736 && var10.field2855 != -1) {
                                            class52 var161 = class52.method2767(var10.field2855);
                                            var159 = var161.field1111;
                                            if (var159 == null) {
                                                var159 = "null";
                                            }
                                            if ((var161.field1128 == 1 || var10.field2856 != 1) && var10.field2856 != -1) {
                                                var159 = class2.method3003(16748608) + var159 + class2.field28 + " " + 'x' + method52(var10.field2856);
                                            }
                                        }
                                        if (field489 == var10) {
                                            class157 var10000 = (class157) null;
                                            var159 = class157.field2456;
                                            var160 = var10.field2804;
                                        }
                                        if (!var10.field2736) {
                                            var159 = method2283(var159, var10);
                                        }
                                        var158.method3813(var159, var13, var14, var10.field2780, var10.field2753, var160, var10.field2809 ? 0 : -1, var10.field2798, var10.field2820, var10.field2745);
                                    } else if (class173.field2735) {
                                        method2721(var10);
                                    }
                                } else if (var10.field2739 == 5) {
                                    if (var10.field2736) {
                                        class79 var163;
                                        if (var10.field2855 == -1) {
                                            var163 = var10.method3210(false);
                                        } else {
                                            var163 = class52.method605(var10.field2855, var10.field2856, var10.field2774, var10.field2775, var10.field2793, false);
                                        }
                                        if (var163 != null) {
                                            int var164 = var163.field1400;
                                            int var165 = var163.field1403;
                                            if (var10.field2773) {
                                                class80.method1704(var13, var14, var10.field2780 + var13, var10.field2753 + var14);
                                                int var166 = (var10.field2780 + (var164 - 1)) / var164;
                                                int var167 = (var10.field2753 + (var165 - 1)) / var165;
                                                for (int var168 = 0; var168 < var166; var168++) {
                                                    for (int var169 = 0; var169 < var167; var169++) {
                                                        if (var10.field2772 != 0) {
                                                            var163.method1642(var164 / 2 + var164 * var168 + var13, var165 / 2 + var165 * var169 + var14, var10.field2772, 4096);
                                                        } else if (var15 == 0) {
                                                            var163.method1629(var164 * var168 + var13, var165 * var169 + var14);
                                                        } else {
                                                            var163.method1635(var164 * var168 + var13, var165 * var169 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1738(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var170 = var10.field2780 * 4096 / var164;
                                                if (var10.field2772 != 0) {
                                                    var163.method1642(var10.field2780 / 2 + var13, var10.field2753 / 2 + var14, var10.field2772, var170);
                                                } else if (var15 != 0) {
                                                    var163.method1637(var13, var14, var10.field2780, var10.field2753, 256 - (var15 & 0xFF));
                                                } else if (var10.field2780 == var164 && var10.field2753 == var165) {
                                                    var163.method1629(var13, var14);
                                                } else {
                                                    var163.method1631(var13, var14, var10.field2780, var10.field2753);
                                                }
                                            }
                                        } else if (class173.field2735) {
                                            method2721(var10);
                                        }
                                    } else {
                                        class79 var162 = var10.method3210(method2797(var10));
                                        if (var162 != null) {
                                            var162.method1629(var13, var14);
                                        } else if (class173.field2735) {
                                            method2721(var10);
                                        }
                                    }
                                } else if (var10.field2739 == 6) {
                                    boolean var171 = method2797(var10);
                                    int var172;
                                    if (var171) {
                                        var172 = var10.field2752;
                                    } else {
                                        var172 = var10.field2842;
                                    }
                                    class105 var173 = null;
                                    int var174 = 0;
                                    if (var10.field2855 != -1) {
                                        class52 var175 = class52.method2767(var10.field2855);
                                        if (var175 != null) {
                                            class52 var176 = var175.method1057(var10.field2856);
                                            var173 = var176.method1060(1);
                                            if (var173 == null) {
                                                method2721(var10);
                                            } else {
                                                var173.method2208();
                                                var174 = var173.field1452 / 2;
                                            }
                                        }
                                    } else if (var10.field2778 == 5) {
                                        if (var10.field2779 == 0) {
                                            var173 = field503.method3306((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var173 = Statics.field176.method19();
                                        }
                                    } else if (var172 == -1) {
                                        var173 = var10.method3212((class43) null, -1, var171, Statics.field176.field41);
                                        if (var173 == null && class173.field2735) {
                                            method2721(var10);
                                        }
                                    } else {
                                        class43 var177 = class43.method2054(var172);
                                        var173 = var10.method3212(var177, var10.field2857, var171, Statics.field176.field41);
                                        if (var173 == null && class173.field2735) {
                                            method2721(var10);
                                        }
                                    }
                                    class91.method1986(var10.field2780 / 2 + var13, var10.field2753 / 2 + var14);
                                    int var178 = var10.field2789 * class91.field1577[var10.field2786] >> 16;
                                    int var179 = var10.field2789 * class91.field1574[var10.field2786] >> 16;
                                    if (var173 != null) {
                                        if (var10.field2736) {
                                            var173.method2208();
                                            if (var10.field2792) {
                                                var173.method2192(0, var10.field2818, var10.field2846, var10.field2786, var10.field2784, var10.field2785 + var174 + var178, var10.field2785 + var179, var10.field2789);
                                            } else {
                                                var173.method2191(0, var10.field2818, var10.field2846, var10.field2786, var10.field2784, var10.field2785 + var174 + var178, var10.field2785 + var179);
                                            }
                                        } else {
                                            var173.method2191(0, var10.field2818, 0, var10.field2786, 0, var178, var179);
                                        }
                                    }
                                    class91.method2010();
                                } else {
                                    if (var10.field2739 == 7) {
                                        class224 var180 = var10.method3215();
                                        if (var180 == null) {
                                            if (class173.field2735) {
                                                method2721(var10);
                                            }
                                            continue;
                                        }
                                        int var181 = 0;
                                        for (int var182 = 0; var182 < var10.field2749; var182++) {
                                            for (int var183 = 0; var183 < var10.field2748; var183++) {
                                                if (var10.field2853[var181] > 0) {
                                                    class52 var184 = class52.method2767(var10.field2853[var181] - 1);
                                                    String var185;
                                                    if (var184.field1128 != 1 && var10.field2854[var181] == 1) {
                                                        var185 = class2.method3003(16748608) + var184.field1111 + class2.field28;
                                                    } else {
                                                        var185 = class2.method3003(16748608) + var184.field1111 + class2.field28 + " " + 'x' + method52(var10.field2854[var181]);
                                                    }
                                                    int var186 = (var10.field2751 + 115) * var183 + var13;
                                                    int var187 = (var10.field2802 + 12) * var182 + var14;
                                                    if (var10.field2798 == 0) {
                                                        var180.method3810(var185, var186, var187, var10.field2804, var10.field2809 ? 0 : -1);
                                                    } else if (var10.field2798 == 1) {
                                                        var180.method3812(var185, var10.field2780 / 2 + var186, var187, var10.field2804, var10.field2809 ? 0 : -1);
                                                    } else {
                                                        var180.method3811(var185, var10.field2780 + var186 - 1, var187, var10.field2804, var10.field2809 ? 0 : -1);
                                                    }
                                                }
                                                var181++;
                                            }
                                        }
                                    }
                                    if (var10.field2739 == 8 && Statics.field630 == var10 && field446 == field445) {
                                        int var188 = 0;
                                        int var189 = 0;
                                        class224 var190 = Statics.field1393;
                                        String var191 = var10.field2795;
                                        String var192 = method2283(var191, var10);
                                        while (var192.length() > 0) {
                                            int var193 = var192.indexOf(class2.field27);
                                            String var194;
                                            if (var193 == -1) {
                                                var194 = var192;
                                                var192 = "";
                                            } else {
                                                var194 = var192.substring(0, var193);
                                                var192 = var192.substring(var193 + 4);
                                            }
                                            int var195 = var190.method3888(var194);
                                            if (var195 > var188) {
                                                var188 = var195;
                                            }
                                            var189 += var190.field3172 + 1;
                                        }
                                        var188 += 6;
                                        var189 += 7;
                                        int var196 = var10.field2780 + var13 - 5 - var188;
                                        int var197 = var10.field2753 + var14 + 5;
                                        if (var196 < var13 + 5) {
                                            var196 = var13 + 5;
                                        }
                                        if (var188 + var196 > arg4) {
                                            var196 = arg4 - var188;
                                        }
                                        if (var189 + var197 > arg5) {
                                            var197 = arg5 - var189;
                                        }
                                        class80.method1713(var196, var197, var188, var189, 16777120);
                                        class80.method1751(var196, var197, var188, var189, 0);
                                        String var198 = var10.field2795;
                                        int var199 = var190.field3172 + var197 + 2;
                                        String var200 = method2283(var198, var10);
                                        while (var200.length() > 0) {
                                            int var201 = var200.indexOf(class2.field27);
                                            String var202;
                                            if (var201 == -1) {
                                                var202 = var200;
                                                var200 = "";
                                            } else {
                                                var202 = var200.substring(0, var201);
                                                var200 = var200.substring(var201 + 4);
                                            }
                                            var190.method3810(var202, var196 + 3, var199, 0, -1);
                                            var199 += var190.field3172 + 1;
                                        }
                                    }
                                    if (var10.field2739 == 9) {
                                        if (var10.field2768 == 1) {
                                            int var203;
                                            int var204;
                                            int var205;
                                            int var206;
                                            if (var10.field2769) {
                                                var203 = var13;
                                                var204 = var10.field2753 + var14;
                                                var205 = var10.field2780 + var13;
                                                var206 = var14;
                                            } else {
                                                var203 = var13;
                                                var204 = var14;
                                                var205 = var10.field2780 + var13;
                                                var206 = var10.field2753 + var14;
                                            }
                                            class80.method1721(var203, var204, var205, var206, var10.field2804);
                                        } else {
                                            int var207 = var10.field2780 >= 0 ? var10.field2780 : -var10.field2780;
                                            int var208 = var10.field2753 >= 0 ? var10.field2753 : -var10.field2753;
                                            int var209 = var207;
                                            if (var207 < var208) {
                                                var209 = var208;
                                            }
                                            if (var209 != 0) {
                                                int var210 = (var10.field2780 << 16) / var209;
                                                int var211 = (var10.field2753 << 16) / var209;
                                                if (var211 <= var210) {
                                                    var210 = -var210;
                                                } else {
                                                    var211 = -var211;
                                                }
                                                int var212 = var10.field2768 * var211 >> 17;
                                                int var213 = var10.field2768 * var211 + 1 >> 17;
                                                int var214 = var10.field2768 * var210 >> 17;
                                                int var215 = var10.field2768 * var210 + 1 >> 17;
                                                int var216 = var13 + var212;
                                                int var217 = var13 - var213;
                                                int var218 = var10.field2780 + var13 - var213;
                                                int var219 = var10.field2780 + var13 + var212;
                                                int var220 = var14 + var214;
                                                int var221 = var14 - var215;
                                                int var222 = var10.field2753 + var14 - var215;
                                                int var223 = var10.field2753 + var14 + var214;
                                                class91.method1991(var216, var217, var218);
                                                class91.method1994(var220, var221, var222, var216, var217, var218, var10.field2804);
                                                class91.method1991(var216, var218, var219);
                                                class91.method1994(var220, var222, var223, var216, var218, var219, var10.field2804);
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

    @ObfuscatedName("dz.cz(Ljava/lang/String;Lfp;B)Ljava/lang/String;")
    public static String method2283(String arg0, class173 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method1792(method919(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field80 != null) {
                    var5 = class163.method2845(Statics.field80.field2215);
                    if (Statics.field80.field2217 != null) {
                        var5 = (String) Statics.field80.field2217;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("z.cw(IB)Ljava/lang/String;")
    public static final String method52(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field22 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method3003(65408) + var1.substring(0, var1.length() - 8) + class157.field2459 + " " + class2.field24 + var1 + class2.field25 + class2.field28;
        } else if (var1.length() > 6) {
            return " " + class2.method3003(16777215) + var1.substring(0, var1.length() - 4) + class157.field2461 + " " + class2.field24 + var1 + class2.field25 + class2.field28;
        } else {
            return " " + class2.method3003(16776960) + var1 + class2.field28;
        }
    }

    @ObfuscatedName("j.cs(Lfp;B)V")
    public static void method182(class173 arg0) {
        class173 var1 = arg0.field2858 == -1 ? null : class173.method1976(arg0.field2858);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field2014;
            var3 = Statics.field2019;
        } else {
            var2 = var1.field2780;
            var3 = var1.field2753;
        }
        method2791(arg0, var2, var3, false);
        method2310(arg0, var2, var3);
    }

    @ObfuscatedName("ap.cr([Lfp;Lfp;ZB)V")
    public static void method958(class173[] arg0, class173 arg1, boolean arg2) {
        int var3 = arg1.field2760 == 0 ? arg1.field2780 : arg1.field2760;
        int var4 = arg1.field2761 == 0 ? arg1.field2753 : arg1.field2761;
        method155(arg0, arg1.field2737, var3, var4, arg2);
        if (arg1.field2868 != null) {
            method155(arg1.field2868, arg1.field2737, var3, var4, arg2);
        }
        class4 var5 = (class4) field455.method3573((long) arg1.field2737);
        if (var5 != null) {
            method3011(var5.field74, var3, var4, arg2);
        }
        if (arg1.field2741 == 1337) {
        }
    }

    @ObfuscatedName("fx.ci(IIIZI)V")
    public static final void method3011(int arg0, int arg1, int arg2, boolean arg3) {
        if (class173.method2967(arg0)) {
            method155(Statics.field2811[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("n.ct([Lfp;IIIZI)V")
    public static void method155(class173[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class173 var6 = arg0[var5];
            if (var6 != null && var6.field2858 == arg1) {
                method2791(var6, arg2, arg3, arg4);
                method2310(var6, arg2, arg3);
                if (var6.field2758 > var6.field2760 - var6.field2780) {
                    var6.field2758 = var6.field2760 - var6.field2780;
                }
                if (var6.field2758 < 0) {
                    var6.field2758 = 0;
                }
                if (var6.field2791 > var6.field2761 - var6.field2753) {
                    var6.field2791 = var6.field2761 - var6.field2753;
                }
                if (var6.field2791 < 0) {
                    var6.field2791 = 0;
                }
                if (var6.field2739 == 0) {
                    method958(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("el.ca(Lfp;IIZI)V")
    public static void method2791(class173 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2780;
        int var5 = arg0.field2753;
        if (arg0.field2744 == 0) {
            arg0.field2780 = arg0.field2748;
        } else if (arg0.field2744 == 1) {
            arg0.field2780 = arg1 - arg0.field2748;
        } else if (arg0.field2744 == 2) {
            arg0.field2780 = arg0.field2748 * arg1 >> 14;
        }
        if (arg0.field2763 == 0) {
            arg0.field2753 = arg0.field2749;
        } else if (arg0.field2763 == 1) {
            arg0.field2753 = arg2 - arg0.field2749;
        } else if (arg0.field2763 == 2) {
            arg0.field2753 = arg0.field2749 * arg2 >> 14;
        }
        if (arg0.field2744 == 4) {
            arg0.field2780 = arg0.field2833 * arg0.field2753 / arg0.field2755;
        }
        if (arg0.field2763 == 4) {
            arg0.field2753 = arg0.field2780 * arg0.field2755 / arg0.field2833;
        }
        if (field464 && arg0.field2739 == 0) {
            if (arg0.field2753 < 5 && arg0.field2780 < 5) {
                arg0.field2753 = 5;
                arg0.field2780 = 5;
            } else {
                if (arg0.field2753 <= 0) {
                    arg0.field2753 = 5;
                }
                if (arg0.field2780 <= 0) {
                    arg0.field2780 = 5;
                }
            }
        }
        if (arg0.field2741 == 1337) {
            field422 = arg0;
        }
        if (arg3 && arg0.field2812 != null && (arg0.field2780 != var4 || arg0.field2753 != var5)) {
            class1 var6 = new class1();
            var6.field16 = arg0;
            var6.field12 = arg0.field2812;
            field310.method3598(var6);
        }
    }

    @ObfuscatedName("dw.cv(Lfp;III)V")
    public static void method2310(class173 arg0, int arg1, int arg2) {
        if (arg0.field2742 == 0) {
            arg0.field2750 = arg0.field2746;
        } else if (arg0.field2742 == 1) {
            arg0.field2750 = (arg1 - arg0.field2780) / 2 + arg0.field2746;
        } else if (arg0.field2742 == 2) {
            arg0.field2750 = arg1 - arg0.field2780 - arg0.field2746;
        } else if (arg0.field2742 == 3) {
            arg0.field2750 = arg0.field2746 * arg1 >> 14;
        } else if (arg0.field2742 == 4) {
            arg0.field2750 = (arg0.field2746 * arg1 >> 14) + (arg1 - arg0.field2780) / 2;
        } else {
            arg0.field2750 = arg1 - arg0.field2780 - (arg0.field2746 * arg1 >> 14);
        }
        if (arg0.field2743 == 0) {
            arg0.field2859 = arg0.field2756;
        } else if (arg0.field2743 == 1) {
            arg0.field2859 = (arg2 - arg0.field2753) / 2 + arg0.field2756;
        } else if (arg0.field2743 == 2) {
            arg0.field2859 = arg2 - arg0.field2753 - arg0.field2756;
        } else if (arg0.field2743 == 3) {
            arg0.field2859 = arg0.field2756 * arg2 >> 14;
        } else if (arg0.field2743 == 4) {
            arg0.field2859 = (arg0.field2756 * arg2 >> 14) + (arg2 - arg0.field2753) / 2;
        } else {
            arg0.field2859 = arg2 - arg0.field2753 - (arg0.field2756 * arg2 >> 14);
        }
        if (!field464 || arg0.field2739 != 0) {
            return;
        }
        if (arg0.field2750 < 0) {
            arg0.field2750 = 0;
        } else if (arg0.field2780 + arg0.field2750 > arg1) {
            arg0.field2750 = arg1 - arg0.field2780;
        }
        if (arg0.field2859 < 0) {
            arg0.field2859 = 0;
        } else if (arg0.field2859 + arg0.field2753 > arg2) {
            arg0.field2859 = arg2 - arg0.field2753;
        }
    }

    @ObfuscatedName("ch.cb(II)Ljava/lang/String;")
    public static final String method1792(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("el.cm(Lfp;I)Z")
    public static final boolean method2797(class173 arg0) {
        if (arg0.field2848 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2848.length; var1++) {
            int var2 = method919(arg0, var1);
            int var3 = arg0.field2849[var1];
            if (arg0.field2848[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2848[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2848[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("am.cu(Lfp;II)I")
    public static final int method919(class173 arg0, int arg1) {
        if (arg0.field2829 == null || arg1 >= arg0.field2829.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2829[arg1];
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
                    var7 = field431[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field432[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field379[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class173 var11 = class173.method1976(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method2767(var12).field1142 || field577)) {
                        for (int var13 = 0; var13 < var11.field2853.length; var13++) {
                            if (var12 + 1 == var11.field2853[var13]) {
                                var7 += var11.field2854[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class176.field2885[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class155.field2285[field432[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class176.field2885[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field176.field62;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class155.field2286[var14]) {
                            var7 += field432[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class173 var17 = class173.method1976(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method2767(var18).field1142 || field577)) {
                        for (int var19 = 0; var19 < var17.field2853.length; var19++) {
                            if (var18 + 1 == var17.field2853[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field459;
                }
                if (var6 == 12) {
                    var7 = field460;
                }
                if (var6 == 13) {
                    int var20 = class176.field2885[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class176.method98(var22);
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
                    var7 = (Statics.field176.field875 >> 7) + Statics.field3144;
                }
                if (var6 == 19) {
                    var7 = (Statics.field176.field819 >> 7) + Statics.field656;
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

    @ObfuscatedName("c.cj([Lfp;IIIIIIIS)V")
    public static final void method132(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class173 var9 = arg0[var8];
            if (var9 != null && (!var9.field2736 || var9.field2739 == 0 || var9.field2800 || method184(var9) != 0 || field390 == var9 || var9.field2741 == 1338) && var9.field2858 == arg1 && (!var9.field2736 || !method2290(var9))) {
                int var10 = var9.field2750 + arg6;
                int var11 = var9.field2859 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2739 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2739 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2780 + var10;
                    int var19 = var9.field2753 + var11;
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
                    int var22 = var9.field2780 + var10;
                    int var23 = var9.field2753 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field467 == var9) {
                    field397 = true;
                    field476 = var10;
                    field497 = var11;
                }
                if (!var9.field2736 || var12 < var14 && var13 < var15) {
                    int var24 = class140.field2139;
                    int var25 = class140.field2145;
                    if (class140.field2150 != 0) {
                        var24 = class140.field2142;
                        var25 = class140.field2148;
                    }
                    if (var9.field2741 == 1337) {
                        if (!field301 && !field442 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field369 == 0 && !field449) {
                                method10(class157.field2453, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class105.field1811; var28++) {
                                int var29 = class105.field1784[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field39.method1823(Statics.field1765, var30, var31, var29) >= 0) {
                                        class41 var34 = class41.method3251(var33);
                                        if (var34.field968 != null) {
                                            var34 = var34.method809();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field369 == 1) {
                                            method10(class157.field2448, field448 + " " + class2.field37 + " " + class2.method3003(65535) + var34.field940, 1, var29, var30, var31);
                                        } else if (!field449) {
                                            String[] var35 = var34.field954;
                                            if (field465) {
                                                var35 = method682(var35);
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
                                                        method10(var35[var36], class2.method3003(65535) + var34.field940, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method10(class157.field2476, class2.method3003(65535) + var34.field940, 1002, var34.field952 << 14, var30, var31);
                                        } else if ((Statics.field694 & 0x4) == 4) {
                                            method10(field452, field362 + " " + class2.field37 + " " + class2.method3003(65535) + var34.field940, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class35 var38 = field351[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field790.field894 == 1 && (var38.field875 & 0x7F) == 64 && (var38.field819 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field404; var39++) {
                                                class35 var40 = field351[field334[var39]];
                                                if (var40 != null && var38 != var40 && var40.field790.field894 == 1 && var38.field875 == var40.field875 && var38.field819 == var40.field819) {
                                                    method2301(var40.field790, field334[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class33.field767;
                                            int[] var42 = class33.field770;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class3 var44 = field575[var42[var43]];
                                                if (var44 != null && var38.field875 == var44.field875 && var38.field819 == var44.field819) {
                                                    method199(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method2301(var38.field790, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var45 = field575[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field875 & 0x7F) == 64 && (var45.field819 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field404; var46++) {
                                                class35 var47 = field351[field334[var46]];
                                                if (var47 != null && var47.field790.field894 == 1 && var45.field875 == var47.field875 && var45.field819 == var47.field819) {
                                                    method2301(var47.field790, field334[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class33.field767;
                                            int[] var49 = class33.field770;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class3 var51 = field575[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field875 == var51.field875 && var45.field819 == var51.field819) {
                                                    method199(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field539 == var33) {
                                            var26 = var29;
                                        } else {
                                            method199(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class199 var52 = field427[Statics.field1765][var30][var31];
                                        if (var52 != null) {
                                            for (class29 var53 = (class29) var52.method3604(); var53 != null; var53 = (class29) var52.method3606()) {
                                                class52 var54 = class52.method2767(var53.field693);
                                                if (field369 == 1) {
                                                    method10(class157.field2448, field448 + " " + class2.field37 + " " + class2.method3003(16748608) + var54.field1111, 16, var53.field693, var30, var31);
                                                } else if (!field449) {
                                                    String[] var55 = var54.field1131;
                                                    if (field465) {
                                                        var55 = method682(var55);
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
                                                            method10(var55[var56], class2.method3003(16748608) + var54.field1111, var57, var53.field693, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method10(class157.field2298, class2.method3003(16748608) + var54.field1111, 20, var53.field693, var30, var31);
                                                        }
                                                    }
                                                    method10(class157.field2476, class2.method3003(16748608) + var54.field1111, 1004, var53.field693, var30, var31);
                                                } else if ((Statics.field694 & 0x1) == 1) {
                                                    method10(field452, field362 + " " + class2.field37 + " " + class2.method3003(16748608) + var54.field1111, 17, var53.field693, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class3 var60 = field575[field539];
                                method199(var60, field539, var58, var59);
                            }
                        }
                    } else if (var9.field2741 == 1338) {
                        method48(var9, var10, var11);
                    } else {
                        if (!field442 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var61 = var24 - var10;
                            int var62 = var25 - var11;
                            if (var9.field2740 == 1) {
                                method10(var9.field2852, "", 24, 0, 0, var9.field2737);
                            }
                            if (var9.field2740 == 2 && !field449) {
                                int var63 = method184(var9);
                                int var64 = var63 >> 11 & 0x3F;
                                String var65;
                                if (var64 == 0) {
                                    var65 = null;
                                } else if (var9.field2814 == null || var9.field2814.trim().length() == 0) {
                                    var65 = null;
                                } else {
                                    var65 = var9.field2814;
                                }
                                if (var65 != null) {
                                    method10(var65, class2.method3003(65280) + var9.field2851, 25, 0, -1, var9.field2737);
                                }
                            }
                            if (var9.field2740 == 3) {
                                method10(class157.field2457, "", 26, 0, 0, var9.field2737);
                            }
                            if (var9.field2740 == 4) {
                                method10(var9.field2852, "", 28, 0, 0, var9.field2737);
                            }
                            if (var9.field2740 == 5) {
                                method10(var9.field2852, "", 29, 0, 0, var9.field2737);
                            }
                            if (var9.field2740 == 6 && field489 == null) {
                                method10(var9.field2852, "", 30, 0, -1, var9.field2737);
                            }
                            if (var9.field2739 == 2) {
                                int var67 = 0;
                                for (int var68 = 0; var68 < var9.field2753; var68++) {
                                    for (int var69 = 0; var69 < var9.field2780; var69++) {
                                        int var70 = (var9.field2751 + 32) * var69;
                                        int var71 = (var9.field2802 + 32) * var68;
                                        if (var67 < 20) {
                                            var70 += var9.field2803[var67];
                                            var71 += var9.field2771[var67];
                                        }
                                        if (var61 >= var70 && var62 >= var71 && var61 < var70 + 32 && var62 < var71 + 32) {
                                            field413 = var67;
                                            Statics.field825 = var9;
                                            if (var9.field2853[var67] > 0) {
                                                class52 var72 = class52.method2767(var9.field2853[var67] - 1);
                                                if (field369 == 1 && class178.method2942(method184(var9))) {
                                                    if (Statics.field2686 != var9.field2737 || Statics.field1658 != var67) {
                                                        method10(class157.field2448, field448 + " " + class2.field37 + " " + class2.method3003(16748608) + var72.field1111, 31, var72.field1115, var67, var9.field2737);
                                                    }
                                                } else if (!field449 || !class178.method2942(method184(var9))) {
                                                    String[] var73 = var72.field1132;
                                                    if (field465) {
                                                        var73 = method682(var73);
                                                    }
                                                    if (class178.method2942(method184(var9))) {
                                                        for (int var74 = 4; var74 >= 3; var74--) {
                                                            if (var73 != null && var73[var74] != null) {
                                                                byte var75;
                                                                if (var74 == 3) {
                                                                    var75 = 36;
                                                                } else {
                                                                    var75 = 37;
                                                                }
                                                                method10(var73[var74], class2.method3003(16748608) + var72.field1111, var75, var72.field1115, var67, var9.field2737);
                                                            } else if (var74 == 4) {
                                                                method10(class157.field2299, class2.method3003(16748608) + var72.field1111, 37, var72.field1115, var67, var9.field2737);
                                                            }
                                                        }
                                                    }
                                                    int var76 = method184(var9);
                                                    boolean var77 = (var76 >> 31 & 0x1) != 0;
                                                    if (var77) {
                                                        method10(class157.field2448, class2.method3003(16748608) + var72.field1111, 38, var72.field1115, var67, var9.field2737);
                                                    }
                                                    class178 var10000 = (class178) null;
                                                    if (class178.method2942(method184(var9)) && var73 != null) {
                                                        for (int var78 = 2; var78 >= 0; var78--) {
                                                            if (var73[var78] != null) {
                                                                byte var79 = 0;
                                                                if (var78 == 0) {
                                                                    var79 = 33;
                                                                }
                                                                if (var78 == 1) {
                                                                    var79 = 34;
                                                                }
                                                                if (var78 == 2) {
                                                                    var79 = 35;
                                                                }
                                                                method10(var73[var78], class2.method3003(16748608) + var72.field1111, var79, var72.field1115, var67, var9.field2737);
                                                            }
                                                        }
                                                    }
                                                    String[] var80 = var9.field2806;
                                                    if (field465) {
                                                        var80 = method682(var80);
                                                    }
                                                    if (var80 != null) {
                                                        for (int var81 = 4; var81 >= 0; var81--) {
                                                            if (var80[var81] != null) {
                                                                byte var82 = 0;
                                                                if (var81 == 0) {
                                                                    var82 = 39;
                                                                }
                                                                if (var81 == 1) {
                                                                    var82 = 40;
                                                                }
                                                                if (var81 == 2) {
                                                                    var82 = 41;
                                                                }
                                                                if (var81 == 3) {
                                                                    var82 = 42;
                                                                }
                                                                if (var81 == 4) {
                                                                    var82 = 43;
                                                                }
                                                                method10(var80[var81], class2.method3003(16748608) + var72.field1111, var82, var72.field1115, var67, var9.field2737);
                                                            }
                                                        }
                                                    }
                                                    method10(class157.field2476, class2.method3003(16748608) + var72.field1111, 1005, var72.field1115, var67, var9.field2737);
                                                } else if ((Statics.field694 & 0x10) == 16) {
                                                    method10(field452, field362 + " " + class2.field37 + " " + class2.method3003(16748608) + var72.field1111, 32, var72.field1115, var67, var9.field2737);
                                                }
                                            }
                                        }
                                        var67++;
                                    }
                                }
                            }
                            if (var9.field2736) {
                                if (field449) {
                                    int var83 = method184(var9);
                                    boolean var84 = (var83 >> 21 & 0x1) != 0;
                                    if (var84 && (Statics.field694 & 0x20) == 32) {
                                        method10(field452, field362 + " " + class2.field37 + " " + var9.field2825, 58, 0, var9.field2738, var9.field2737);
                                    }
                                } else {
                                    for (int var85 = 9; var85 >= 5; var85--) {
                                        String var86 = method2691(var9, var85);
                                        if (var86 != null) {
                                            method10(var86, var9.field2825, 1007, var85 + 1, var9.field2738, var9.field2737);
                                        }
                                    }
                                    int var87 = method184(var9);
                                    int var88 = var87 >> 11 & 0x3F;
                                    String var89;
                                    if (var88 == 0) {
                                        var89 = null;
                                    } else if (var9.field2814 == null || var9.field2814.trim().length() == 0) {
                                        var89 = null;
                                    } else {
                                        var89 = var9.field2814;
                                    }
                                    if (var89 != null) {
                                        method10(var89, var9.field2825, 25, 0, var9.field2738, var9.field2737);
                                    }
                                    for (int var91 = 4; var91 >= 0; var91--) {
                                        String var92 = method2691(var9, var91);
                                        if (var92 != null) {
                                            method10(var92, var9.field2825, 57, var91 + 1, var9.field2738, var9.field2737);
                                        }
                                    }
                                    int var93 = method184(var9);
                                    boolean var94 = (var93 & 0x1) != 0;
                                    if (var94) {
                                        method10(class157.field2396, "", 30, 0, var9.field2738, var9.field2737);
                                    }
                                }
                            }
                        }
                        if (var9.field2739 == 0) {
                            if (!var9.field2736 && method2290(var9) && Statics.field360 != var9) {
                                continue;
                            }
                            method132(arg0, var9.field2737, var12, var13, var14, var15, var10 - var9.field2758, var11 - var9.field2791);
                            if (var9.field2868 != null) {
                                method132(var9.field2868, var9.field2737, var12, var13, var14, var15, var10 - var9.field2758, var11 - var9.field2791);
                            }
                            class4 var95 = (class4) field455.method3573((long) var9.field2737);
                            if (var95 != null) {
                                if (var95.field69 == 0 && class140.field2139 >= var12 && class140.field2145 >= var13 && class140.field2139 < var14 && class140.field2145 < var15 && !field442 && !field464) {
                                    for (class1 var96 = (class1) field310.method3603(); var96 != null; var96 = (class1) field310.method3596()) {
                                        if (var96.field2) {
                                            var96.method3693();
                                            var96.field16.field2860 = false;
                                        }
                                    }
                                    if (Statics.field1080 == 0) {
                                        field467 = null;
                                        field390 = null;
                                    }
                                    if (!field442) {
                                        field441[0] = class157.field2533;
                                        field318[0] = "";
                                        field439[0] = 1006;
                                        field436 = 1;
                                    }
                                }
                                int var97 = var95.field74;
                                if (class173.method2967(var97)) {
                                    method132(Statics.field2811[var97], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2736) {
                            if (var9.field2808) {
                                if (class140.field2139 >= var12 && class140.field2145 >= var13 && class140.field2139 < var14 && class140.field2145 < var15) {
                                    for (class1 var98 = (class1) field310.method3603(); var98 != null; var98 = (class1) field310.method3596()) {
                                        if (var98.field2) {
                                            var98.method3693();
                                            var98.field16.field2860 = false;
                                        }
                                    }
                                    if (Statics.field1080 == 0) {
                                        field467 = null;
                                        field390 = null;
                                    }
                                    if (!field442) {
                                        field441[0] = class157.field2533;
                                        field318[0] = "";
                                        field439[0] = 1006;
                                        field436 = 1;
                                    }
                                }
                            } else if (var9.field2869 && class140.field2139 >= var12 && class140.field2145 >= var13 && class140.field2139 < var14 && class140.field2145 < var15) {
                                for (class1 var99 = (class1) field310.method3603(); var99 != null; var99 = (class1) field310.method3596()) {
                                    if (var99.field2 && var99.field16.field2836 == var99.field12) {
                                        var99.method3693();
                                    }
                                }
                            }
                            boolean var100;
                            if (class140.field2139 >= var12 && class140.field2145 >= var13 && class140.field2139 < var14 && class140.field2145 < var15) {
                                var100 = true;
                            } else {
                                var100 = false;
                            }
                            boolean var101 = false;
                            if ((class140.field2151 == 1 || !Statics.field1395 && class140.field2151 == 4) && var100) {
                                var101 = true;
                            }
                            boolean var102 = false;
                            if ((class140.field2150 == 1 || !Statics.field1395 && class140.field2150 == 4) && class140.field2142 >= var12 && class140.field2148 >= var13 && class140.field2142 < var14 && class140.field2148 < var15) {
                                var102 = true;
                            }
                            if (var102) {
                                method109(var9, class140.field2142 - var10, class140.field2148 - var11);
                            }
                            if (field467 != null && field467 != var9 && var100) {
                                int var103 = method184(var9);
                                boolean var104 = (var103 >> 20 & 0x1) != 0;
                                if (var104) {
                                    field471 = var9;
                                }
                            }
                            if (field390 == var9) {
                                field501 = true;
                                field473 = var10;
                                field474 = var11;
                            }
                            if (var9.field2800) {
                                if (var100 && field492 != 0 && var9.field2836 != null) {
                                    class1 var105 = new class1();
                                    var105.field2 = true;
                                    var105.field16 = var9;
                                    var105.field5 = field492;
                                    var105.field12 = var9.field2836;
                                    field310.method3598(var105);
                                }
                                if (field467 != null || Statics.field272 != null || field442) {
                                    var102 = false;
                                    var101 = false;
                                    var100 = false;
                                }
                                if (!var9.field2861 && var102) {
                                    var9.field2861 = true;
                                    if (var9.field2788 != null) {
                                        class1 var106 = new class1();
                                        var106.field2 = true;
                                        var106.field16 = var9;
                                        var106.field13 = class140.field2142 - var10;
                                        var106.field5 = class140.field2148 - var11;
                                        var106.field12 = var9.field2788;
                                        field310.method3598(var106);
                                    }
                                }
                                if (var9.field2861 && var101 && var9.field2727 != null) {
                                    class1 var107 = new class1();
                                    var107.field2 = true;
                                    var107.field16 = var9;
                                    var107.field13 = class140.field2139 - var10;
                                    var107.field5 = class140.field2145 - var11;
                                    var107.field12 = var9.field2727;
                                    field310.method3598(var107);
                                }
                                if (var9.field2861 && !var101) {
                                    var9.field2861 = false;
                                    if (var9.field2794 != null) {
                                        class1 var108 = new class1();
                                        var108.field2 = true;
                                        var108.field16 = var9;
                                        var108.field13 = class140.field2139 - var10;
                                        var108.field5 = class140.field2145 - var11;
                                        var108.field12 = var9.field2794;
                                        field495.method3598(var108);
                                    }
                                }
                                if (var101 && var9.field2866 != null) {
                                    class1 var109 = new class1();
                                    var109.field2 = true;
                                    var109.field16 = var9;
                                    var109.field13 = class140.field2139 - var10;
                                    var109.field5 = class140.field2145 - var11;
                                    var109.field12 = var9.field2866;
                                    field310.method3598(var109);
                                }
                                if (!var9.field2860 && var100) {
                                    var9.field2860 = true;
                                    if (var9.field2783 != null) {
                                        class1 var110 = new class1();
                                        var110.field2 = true;
                                        var110.field16 = var9;
                                        var110.field13 = class140.field2139 - var10;
                                        var110.field5 = class140.field2145 - var11;
                                        var110.field12 = var9.field2783;
                                        field310.method3598(var110);
                                    }
                                }
                                if (var9.field2860 && var100 && var9.field2822 != null) {
                                    class1 var111 = new class1();
                                    var111.field2 = true;
                                    var111.field16 = var9;
                                    var111.field13 = class140.field2139 - var10;
                                    var111.field5 = class140.field2145 - var11;
                                    var111.field12 = var9.field2822;
                                    field310.method3598(var111);
                                }
                                if (var9.field2860 && !var100) {
                                    var9.field2860 = false;
                                    if (var9.field2834 != null) {
                                        class1 var112 = new class1();
                                        var112.field2 = true;
                                        var112.field16 = var9;
                                        var112.field13 = class140.field2139 - var10;
                                        var112.field5 = class140.field2145 - var11;
                                        var112.field12 = var9.field2834;
                                        field495.method3598(var112);
                                    }
                                }
                                if (var9.field2862 != null) {
                                    class1 var113 = new class1();
                                    var113.field16 = var9;
                                    var113.field12 = var9.field2862;
                                    field331.method3598(var113);
                                }
                                if (var9.field2828 != null && field486 > var9.field2863) {
                                    if (var9.field2754 == null || field486 - var9.field2863 > 32) {
                                        class1 var118 = new class1();
                                        var118.field16 = var9;
                                        var118.field12 = var9.field2828;
                                        field310.method3598(var118);
                                    } else {
                                        label1002: for (int var114 = var9.field2863; var114 < field486; var114++) {
                                            int var115 = field480[var114 & 0x1F];
                                            for (int var116 = 0; var116 < var9.field2754.length; var116++) {
                                                if (var9.field2754[var116] == var115) {
                                                    class1 var117 = new class1();
                                                    var117.field16 = var9;
                                                    var117.field12 = var9.field2828;
                                                    field310.method3598(var117);
                                                    break label1002;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2863 = field486;
                                }
                                if (var9.field2799 != null && field494 > var9.field2864) {
                                    if (var9.field2831 == null || field494 - var9.field2864 > 32) {
                                        class1 var123 = new class1();
                                        var123.field16 = var9;
                                        var123.field12 = var9.field2799;
                                        field310.method3598(var123);
                                    } else {
                                        label978: for (int var119 = var9.field2864; var119 < field494; var119++) {
                                            int var120 = field321[var119 & 0x1F];
                                            for (int var121 = 0; var121 < var9.field2831.length; var121++) {
                                                if (var9.field2831[var121] == var120) {
                                                    class1 var122 = new class1();
                                                    var122.field16 = var9;
                                                    var122.field12 = var9.field2799;
                                                    field310.method3598(var122);
                                                    break label978;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2864 = field494;
                                }
                                if (var9.field2832 != null && field485 > var9.field2865) {
                                    if (var9.field2797 == null || field485 - var9.field2865 > 32) {
                                        class1 var128 = new class1();
                                        var128.field16 = var9;
                                        var128.field12 = var9.field2832;
                                        field310.method3598(var128);
                                    } else {
                                        label954: for (int var124 = var9.field2865; var124 < field485; var124++) {
                                            int var125 = field484[var124 & 0x1F];
                                            for (int var126 = 0; var126 < var9.field2797.length; var126++) {
                                                if (var9.field2797[var126] == var125) {
                                                    class1 var127 = new class1();
                                                    var127.field16 = var9;
                                                    var127.field12 = var9.field2832;
                                                    field310.method3598(var127);
                                                    break label954;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2865 = field485;
                                }
                                if (field291 > var9.field2827 && var9.field2837 != null) {
                                    class1 var129 = new class1();
                                    var129.field16 = var9;
                                    var129.field12 = var9.field2837;
                                    field310.method3598(var129);
                                }
                                if (field487 > var9.field2827 && var9.field2839 != null) {
                                    class1 var130 = new class1();
                                    var130.field16 = var9;
                                    var130.field12 = var9.field2839;
                                    field310.method3598(var130);
                                }
                                if (field466 > var9.field2827 && var9.field2840 != null) {
                                    class1 var131 = new class1();
                                    var131.field16 = var9;
                                    var131.field12 = var9.field2840;
                                    field310.method3598(var131);
                                }
                                if (field350 > var9.field2827 && var9.field2845 != null) {
                                    class1 var132 = new class1();
                                    var132.field16 = var9;
                                    var132.field12 = var9.field2845;
                                    field310.method3598(var132);
                                }
                                if (field356 > var9.field2827 && var9.field2850 != null) {
                                    class1 var133 = new class1();
                                    var133.field16 = var9;
                                    var133.field12 = var9.field2850;
                                    field310.method3598(var133);
                                }
                                if (field491 > var9.field2827 && var9.field2841 != null) {
                                    class1 var134 = new class1();
                                    var134.field16 = var9;
                                    var134.field12 = var9.field2841;
                                    field310.method3598(var134);
                                }
                                var9.field2827 = field567;
                                if (var9.field2838 != null) {
                                    for (int var135 = 0; var135 < field517; var135++) {
                                        class1 var136 = new class1();
                                        var136.field16 = var9;
                                        var136.field8 = field519[var135];
                                        var136.field9 = field518[var135];
                                        var136.field12 = var9.field2838;
                                        field310.method3598(var136);
                                    }
                                }
                            }
                        }
                        if (!var9.field2736 && field467 == null && Statics.field272 == null && !field442) {
                            if ((var9.field2781 >= 0 || var9.field2764 != 0) && class140.field2139 >= var12 && class140.field2145 >= var13 && class140.field2139 < var14 && class140.field2145 < var15) {
                                if (var9.field2781 >= 0) {
                                    Statics.field360 = arg0[var9.field2781];
                                } else {
                                    Statics.field360 = var9;
                                }
                            }
                            if (var9.field2739 == 8 && class140.field2139 >= var12 && class140.field2145 >= var13 && class140.field2139 < var14 && class140.field2145 < var15) {
                                Statics.field630 = var9;
                            }
                            if (var9.field2761 > var9.field2753) {
                                int var137 = var9.field2780 + var10;
                                int var138 = var9.field2753;
                                int var139 = var9.field2761;
                                int var140 = class140.field2139;
                                int var141 = class140.field2145;
                                if (field378) {
                                    field293 = 32;
                                } else {
                                    field293 = 0;
                                }
                                field378 = false;
                                if (class140.field2151 == 1 || !Statics.field1395 && class140.field2151 == 4) {
                                    if (var140 >= var137 && var140 < var137 + 16 && var141 >= var11 && var141 < var11 + 16) {
                                        var9.field2791 -= 4;
                                        method2721(var9);
                                    } else if (var140 >= var137 && var140 < var137 + 16 && var141 >= var11 + var138 - 16 && var141 < var11 + var138) {
                                        var9.field2791 += 4;
                                        method2721(var9);
                                    } else if (var140 >= var137 - field293 && var140 < field293 + var137 + 16 && var141 >= var11 + 16 && var141 < var11 + var138 - 16) {
                                        int var142 = (var138 - 32) * var138 / var139;
                                        if (var142 < 8) {
                                            var142 = 8;
                                        }
                                        int var143 = var141 - var11 - 16 - var142 / 2;
                                        int var144 = var138 - 32 - var142;
                                        var9.field2791 = (var139 - var138) * var143 / var144;
                                        method2721(var9);
                                        field378 = true;
                                    }
                                }
                                if (field492 != 0) {
                                    int var145 = var9.field2780;
                                    if (var140 >= var137 - var145 && var141 >= var11 && var140 < var137 + 16 && var141 <= var11 + var138) {
                                        var9.field2791 += field492 * 45;
                                        method2721(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("at.cf(III)V")
    public static final void method1089(int arg0, int arg1) {
        if (class173.method2967(arg0)) {
            method2055(Statics.field2811[arg0], arg1);
        }
    }

    @ObfuscatedName("cb.cq([Lfp;II)V")
    public static final void method2055(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2739 == 0) {
                    if (var3.field2868 != null) {
                        method2055(var3.field2868, arg1);
                    }
                    class4 var4 = (class4) field455.method3573((long) var3.field2737);
                    if (var4 != null) {
                        method1089(var4.field74, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2747 != null) {
                    class1 var5 = new class1();
                    var5.field16 = var3;
                    var5.field12 = var3.field2747;
                    class37.method734(var5);
                }
                if (arg1 == 1 && var3.field2843 != null) {
                    if (var3.field2738 >= 0) {
                        class173 var6 = class173.method1976(var3.field2737);
                        if (var6 == null || var6.field2868 == null || var3.field2738 >= var6.field2868.length || var6.field2868[var3.field2738] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field16 = var3;
                    var7.field12 = var3.field2843;
                    class37.method734(var7);
                }
            }
        }
    }

    @ObfuscatedName("p.cd(Lfp;III)V")
    public static final void method109(class173 arg0, int arg1, int arg2) {
        if (field467 != null || field442 || arg0 == null) {
            return;
        }
        class173 var3 = method661(arg0);
        if (var3 == null) {
            var3 = arg0.field2810;
        }
        if (var3 == null) {
            return;
        }
        field467 = arg0;
        class173 var5 = method661(arg0);
        if (var5 == null) {
            var5 = arg0.field2810;
        }
        field390 = var5;
        field556 = arg1;
        field470 = arg2;
        Statics.field1080 = 0;
        field478 = false;
        if (field436 > 0) {
            int var7 = field436 - 1;
            Statics.field2028 = new class31();
            Statics.field2028.field719 = field437[var7];
            Statics.field2028.field723 = field417[var7];
            Statics.field2028.field724 = field439[var7];
            Statics.field2028.field720 = field557[var7];
            Statics.field2028.field721 = field441[var7];
        }
        return;
    }

    @ObfuscatedName("er.cc(Lfp;I)V")
    public static void method2721(class173 arg0) {
        if (field498 == arg0.field2867) {
            field578[arg0.field2821] = true;
        }
    }

    @ObfuscatedName("p.ce(I)V")
    public static void method105() {
        for (class4 var0 = (class4) field455.method3571(); var0 != null; var0 = (class4) field455.method3572()) {
            int var1 = var0.field74;
            if (class173.method2967(var1)) {
                boolean var2 = true;
                class173[] var3 = Statics.field2811[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2736;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3099;
                    class173 var6 = class173.method1976(var5);
                    if (var6 != null) {
                        method2721(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("aa.ck([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method682(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("cn.dd(II)V")
    public static final void method1784(int arg0) {
        if (class173.method2967(arg0)) {
            method738(Statics.field2811[arg0], -1);
        }
    }

    @ObfuscatedName("aw.dq([Lfp;II)V")
    public static final void method738(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null && var3.field2858 == arg1 && (!var3.field2736 || !method2290(var3))) {
                if (var3.field2739 == 0) {
                    if (!var3.field2736 && method2290(var3) && Statics.field360 != var3) {
                        continue;
                    }
                    method738(arg0, var3.field2737);
                    if (var3.field2868 != null) {
                        method738(var3.field2868, var3.field2737);
                    }
                    class4 var4 = (class4) field455.method3573((long) var3.field2737);
                    if (var4 != null) {
                        method1784(var4.field74);
                    }
                }
                if (var3.field2739 == 6) {
                    if (var3.field2842 != -1 || var3.field2752 != -1) {
                        boolean var5 = method2797(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2752;
                        } else {
                            var6 = var3.field2842;
                        }
                        if (var6 != -1) {
                            class43 var7 = class43.method2054(var6);
                            var3.field2830 += field372;
                            while (var3.field2830 > var7.field996[var3.field2857]) {
                                var3.field2830 -= var7.field996[var3.field2857];
                                var3.field2857++;
                                if (var3.field2857 >= var7.field994.length) {
                                    var3.field2857 -= var7.field998;
                                    if (var3.field2857 < 0 || var3.field2857 >= var7.field994.length) {
                                        var3.field2857 = 0;
                                    }
                                }
                                method2721(var3);
                            }
                        }
                    }
                    if (var3.field2847 != 0 && !var3.field2736) {
                        int var8 = var3.field2847 >> 16;
                        int var9 = var3.field2847 << 16 >> 16;
                        int var10 = field372 * var8;
                        int var11 = field372 * var9;
                        var3.field2786 = var3.field2786 + var10 & 0x7FF;
                        var3.field2818 = var3.field2818 + var11 & 0x7FF;
                        method2721(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("o.ds(IB)V")
    public static final void method152(int arg0) {
        method105();
        for (class24 var1 = (class24) class24.field615.method3603(); var1 != null; var1 = (class24) class24.field615.method3596()) {
            if (var1.field619 != null) {
                var1.method600();
            }
        }
        int var2 = class53.method122(arg0).field1160;
        if (var2 == 0) {
            return;
        }
        int var3 = class176.field2885[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class91.method1988(0.9D);
                ((class95) Statics.field1554).method2058(0.9D);
            }
            if (var3 == 2) {
                class91.method1988(0.8D);
                ((class95) Statics.field1554).method2058(0.8D);
            }
            if (var3 == 3) {
                class91.method1988(0.7D);
                ((class95) Statics.field1554).method2058(0.7D);
            }
            if (var3 == 4) {
                class91.method1988(0.6D);
                ((class95) Statics.field1554).method2058(0.6D);
            }
            class52.field1114.method3532();
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
            if (field531 != var4) {
                if (field531 == 0 && field532 != -1) {
                    class183.method2057(Statics.field1370, field532, 0, var4, false);
                    field533 = false;
                } else if (var4 == 0) {
                    class183.method749();
                    field533 = false;
                } else {
                    class183.method1019(var4);
                }
                field531 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field534 = 127;
            }
            if (var3 == 1) {
                field534 = 96;
            }
            if (var3 == 2) {
                field534 = 64;
            }
            if (var3 == 3) {
                field534 = 32;
            }
            if (var3 == 4) {
                field534 = 0;
            }
        }
        if (var2 == 5) {
            field308 = var3;
        }
        if (var2 == 6) {
            field511 = var3;
        }
        if (var2 == 9) {
            field453 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field535 = 127;
            }
            if (var3 == 1) {
                field535 = 96;
            }
            if (var3 == 2) {
                field535 = 64;
            }
            if (var3 == 3) {
                field535 = 32;
            }
            if (var3 == 4) {
                field535 = 0;
            }
        }
        if (var2 == 17) {
            field462 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field405 = (class21) class109.method3002(class21.method767(), var3);
            if (field405 == null) {
                field405 = class21.field585;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field539 = -1;
            } else {
                field539 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field319 = (class21) class109.method3002(class21.method767(), var3);
            if (field319 == null) {
                field319 = class21.field585;
            }
        }
    }

    @ObfuscatedName("af.dj(Ld;ZI)V")
    public static final void method718(class4 arg0, boolean arg1) {
        int var2 = arg0.field74;
        int var3 = (int) arg0.field3099;
        arg0.method3693();
        if (arg1) {
            class173.method2968(var2);
        }
        for (class201 var4 = (class201) field496.method3571(); var4 != null; var4 = (class201) field496.method3572()) {
            if ((var4.field3099 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method3693();
            }
        }
        class173 var5 = class173.method1976(var3);
        if (var5 != null) {
            method2721(var5);
        }
        method2666();
        if (field454 != -1) {
            method1089(field454, 1);
        }
    }

    @ObfuscatedName("ag.di(Lfp;I)Z")
    public static final boolean method666(class173 arg0) {
        int var1 = arg0.field2741;
        if (var1 == 205) {
            field347 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field503.method3284(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field503.method3295(var4, var5 == 1);
        }
        if (var1 == 324) {
            field503.method3286(false);
        }
        if (var1 == 325) {
            field503.method3286(true);
        }
        if (var1 == 326) {
            field367.method2612(80);
            field503.method3313(field367);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("p.dx(Lfp;IIII)V")
    public static final void method104(class173 arg0, int arg1, int arg2, int arg3) {
        class175 var4 = arg0.method3238(false);
        if (var4 == null) {
            return;
        }
        if (field530 < 3) {
            Statics.field2070.method1640(arg1, arg2, var4.field2877, var4.field2878, 25, 25, field573, 256, var4.field2880, var4.field2879);
        } else {
            class80.method1722(arg1, arg2, 0, var4.field2880, var4.field2879);
        }
    }

    @ObfuscatedName("y.db(IIIILcy;Lfm;I)V")
    public static final void method202(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method748(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field573 + field558 & 0x7FF;
        int var8 = class91.field1577[var7];
        int var9 = class91.field1574[var7];
        int var10 = var8 * 256 / (field481 + 256);
        int var11 = var9 * 256 / (field481 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field14.method1641(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("an.dl(IIIILcy;Lfm;I)V")
    public static final void method748(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field573 + field558 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class91.field1577[var6];
        int var9 = class91.field1574[var6];
        int var10 = var8 * 256 / (field481 + 256);
        int var11 = var9 * 256 / (field481 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1661(arg5.field2877 / 2 + var12 - arg4.field1400 / 2, arg5.field2878 / 2 - var13 - arg4.field1403 / 2, arg0, arg1, arg5.field2877, arg5.field2878, arg5.field2880, arg5.field2879);
        } else {
            arg4.method1629(arg5.field2877 / 2 + arg0 + var12 - arg4.field1400 / 2, arg5.field2878 / 2 + arg1 - var13 - arg4.field1403 / 2);
        }
    }

    @ObfuscatedName("au.dg(Ljava/lang/String;ZI)Z")
    public static boolean method842(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class164.method843(arg0, Statics.field309);
        for (int var3 = 0; var3 < field561; var3++) {
            if (var2.equalsIgnoreCase(class164.method843(field434[var3].field261, Statics.field309)) && (!arg1 || field434[var3].field253 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class164.method843(Statics.field176.field52, Statics.field309))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bs.dn(Ljava/lang/String;I)Z")
    public static boolean method1603(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class164.method843(arg0, Statics.field309);
        for (int var2 = 0; var2 < field472; var2++) {
            class8 var3 = field566[var2];
            if (var1.equalsIgnoreCase(class164.method843(var3.field139, Statics.field309))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class164.method843(var3.field138, Statics.field309))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ei.dw(Ljava/lang/String;S)V")
    public static final void method2981(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field561 < 200 || field419 == 1) || field561 >= 400) {
            class12.method2737(30, "", class157.field2464);
            return;
        }
        String var1 = class164.method843(arg0, Statics.field309);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field561; var2++) {
            class18 var3 = field434[var2];
            String var4 = class164.method843(var3.field261, Statics.field309);
            if (var4 != null && var4.equals(var1)) {
                class12.method2737(30, "", arg0 + class157.field2465);
                return;
            }
            if (var3.field254 != null) {
                String var5 = class164.method843(var3.field254, Statics.field309);
                if (var5 != null && var5.equals(var1)) {
                    class12.method2737(30, "", arg0 + class157.field2465);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field472; var6++) {
            class8 var7 = field566[var6];
            String var8 = class164.method843(var7.field139, Statics.field309);
            if (var8 != null && var8.equals(var1)) {
                class12.method2737(30, "", class157.field2470 + arg0 + class157.field2471);
                return;
            }
            if (var7.field138 != null) {
                String var9 = class164.method843(var7.field138, Statics.field309);
                if (var9 != null && var9.equals(var1)) {
                    class12.method2737(30, "", class157.field2470 + arg0 + class157.field2471);
                    return;
                }
            }
        }
        if (class164.method843(Statics.field176.field52, Statics.field309).equals(var1)) {
            class12.method2737(30, "", class157.field2468);
        } else {
            field367.method2612(119);
            field367.method2476(class119.method50(arg0));
            field367.method2354(arg0);
        }
    }

    @ObfuscatedName("dg.dh(Ljava/lang/String;I)V")
    public static final void method2299(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class164.method843(arg0, Statics.field309);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field561; var2++) {
            class18 var3 = field434[var2];
            String var4 = var3.field261;
            String var5 = class164.method843(var4, Statics.field309);
            if (class129.method2167(arg0, var1, var4, var5)) {
                field561--;
                for (int var6 = var2; var6 < field561; var6++) {
                    field434[var6] = field434[var6 + 1];
                }
                field487 = field567;
                field367.method2612(137);
                field367.method2476(class119.method50(arg0));
                field367.method2354(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("u.da(Ljava/lang/String;II)V")
    public static final void method125(String arg0, int arg1) {
        field367.method2612(193);
        field367.method2476(class119.method50(arg0) + 1);
        field367.method2476(arg1);
        field367.method2354(arg0);
    }

    @ObfuscatedName("am.dm(Ljava/lang/String;I)V")
    public static final void method902(String arg0) {
        if (!arg0.equals("")) {
            field367.method2612(32);
            field367.method2476(class119.method50(arg0));
            field367.method2354(arg0);
        }
    }

    @ObfuscatedName("j.dc(Lfp;B)I")
    public static int method184(class173 arg0) {
        class201 var1 = (class201) field496.method3573(((long) arg0.field2737 << 32) + (long) arg0.field2738);
        return var1 == null ? arg0.field2807 : var1.field3085;
    }

    @ObfuscatedName("ag.dv(Lfp;I)Lfp;")
    public static class173 method661(class173 arg0) {
        int var1 = class178.method2302(method184(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class173.method1976(arg0.field2858);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("dx.dr(Lfp;I)Z")
    public static boolean method2290(class173 arg0) {
        if (field464) {
            if (method184(arg0) != 0) {
                return false;
            }
            if (arg0.field2739 == 0) {
                return false;
            }
        }
        return arg0.field2757;
    }

    @ObfuscatedName("du.dp(Lfp;IB)Ljava/lang/String;")
    public static String method2691(class173 arg0, int arg1) {
        int var2 = method184(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2835 == null) {
            return null;
        } else if (arg0.field2801 == null || arg0.field2801.length <= arg1 || arg0.field2801[arg1] == null || arg0.field2801[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2801[arg1];
        }
    }

    @ObfuscatedName("y.df(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method200(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field475 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field475 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field475 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field475 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field475 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field2072 != null) {
            var3 = "/p=" + Statics.field2072;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field299 + "/a=" + Statics.field209 + var3 + "/";
    }

    @ObfuscatedName("aa.de(Ljava/lang/String;ZI)V")
    public static void method690(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1144; var5++) {
            class52 var6 = class52.method2767(var5);
            if ((!arg1 || var6.field1107) && var6.field1148 == -1 && var6.field1111.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field2871 = -1;
                    Statics.field2074 = null;
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
        Statics.field2074 = var3;
        Statics.field1516 = 0;
        Statics.field2871 = var4;
        String[] var9 = new String[Statics.field2871];
        for (int var10 = 0; var10 < Statics.field2871; var10++) {
            var9[var10] = class52.method2767(var3[var10]).field1111;
        }
        class124.method2634(var9, Statics.field2074);
    }
}

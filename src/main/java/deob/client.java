package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class144 {

    @ObfuscatedName("client.w")
    public static class108[] field389 = new class108[4];

    @ObfuscatedName("client.e")
    public static boolean field292 = true;

    @ObfuscatedName("client.c")
    public static int field293 = 1;

    @ObfuscatedName("client.a")
    public static int field409 = 0;

    @ObfuscatedName("client.m")
    public static int field318 = 0;

    @ObfuscatedName("client.o")
    public static boolean field296 = false;

    @ObfuscatedName("client.f")
    public static boolean field429 = false;

    @ObfuscatedName("client.s")
    public static int field316 = 0;

    @ObfuscatedName("client.h")
    public static int field301 = 0;

    @ObfuscatedName("client.j")
    public static boolean field302 = true;

    @ObfuscatedName("client.v")
    public static int field303 = 0;

    @ObfuscatedName("client.l")
    public static long field304 = 1L;

    @ObfuscatedName("client.t")
    public static int field305 = -1;

    @ObfuscatedName("client.i")
    public static int field530 = -1;

    @ObfuscatedName("client.ah")
    public static int field307 = -1;

    @ObfuscatedName("client.aa")
    public static boolean field308 = true;

    @ObfuscatedName("client.ao")
    public static boolean field467 = false;

    @ObfuscatedName("client.ai")
    public static int field548 = 0;

    @ObfuscatedName("client.ab")
    public static int field311 = 0;

    @ObfuscatedName("client.ae")
    public static int field312 = 0;

    @ObfuscatedName("client.aw")
    public static int field343 = 0;

    @ObfuscatedName("client.aj")
    public static int field566 = 0;

    @ObfuscatedName("client.ay")
    public static int field315 = 0;

    @ObfuscatedName("client.af")
    public static int field510 = 0;

    @ObfuscatedName("client.al")
    public static int field317 = 0;

    @ObfuscatedName("client.aq")
    public static int field486 = 0;

    @ObfuscatedName("client.ar")
    public static class21 field320 = class21.field581;

    @ObfuscatedName("client.am")
    public static int field321 = 0;

    @ObfuscatedName("client.av")
    public static int field568 = 0;

    @ObfuscatedName("client.ac")
    public static int field490 = 0;

    @ObfuscatedName("client.bz")
    public static int field324 = 0;

    @ObfuscatedName("client.bs")
    public static int field325 = 0;

    @ObfuscatedName("client.bw")
    public static int field326 = 0;

    @ObfuscatedName("client.bq")
    public static int field327 = 0;

    @ObfuscatedName("client.bt")
    public static int field328 = 0;

    @ObfuscatedName("client.cy")
    public static class35[] field415 = new class35[32768];

    @ObfuscatedName("client.cc")
    public static int field457 = 0;

    @ObfuscatedName("client.cr")
    public static int[] field331 = new int[32768];

    @ObfuscatedName("client.cm")
    public static int field382 = 0;

    @ObfuscatedName("client.cp")
    public static int[] field333 = new int[250];

    @ObfuscatedName("client.co")
    public static class122 field337 = new class122(5000);

    @ObfuscatedName("client.cu")
    public static class122 field335 = new class122(5000);

    @ObfuscatedName("client.ct")
    public static class122 field535 = new class122(15000);

    @ObfuscatedName("client.ck")
    public static int field396 = 0;

    @ObfuscatedName("client.cj")
    public static int field388 = 0;

    @ObfuscatedName("client.cb")
    public static int field309 = 0;

    @ObfuscatedName("client.cq")
    public static int field340 = 0;

    @ObfuscatedName("client.cv")
    public static int field341 = 0;

    @ObfuscatedName("client.cd")
    public static int field425 = 0;

    @ObfuscatedName("client.cf")
    public static int field452 = 0;

    @ObfuscatedName("client.ce")
    public static int field344 = 0;

    @ObfuscatedName("client.cw")
    public static boolean field345 = false;

    @ObfuscatedName("client.du")
    public static int field346 = 0;

    @ObfuscatedName("client.dp")
    public static int field347 = 1;

    @ObfuscatedName("client.dl")
    public static int field348 = 0;

    @ObfuscatedName("client.dj")
    public static int field349 = 1;

    @ObfuscatedName("client.de")
    public static int field336 = 0;

    @ObfuscatedName("client.dv")
    public static boolean field496 = false;

    @ObfuscatedName("client.dm")
    public static int[][][] field353 = new int[4][13][13];

    @ObfuscatedName("client.ds")
    public static final int[] field354 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dr")
    public static int field355 = 0;

    @ObfuscatedName("client.do")
    public static int field356 = 2;

    @ObfuscatedName("client.dy")
    public static int field297 = 0;

    @ObfuscatedName("client.dt")
    public static int field358 = 2;

    @ObfuscatedName("client.di")
    public static int field454 = 0;

    @ObfuscatedName("client.dc")
    public static int field360 = 1;

    @ObfuscatedName("client.eq")
    public static int field361 = 0;

    @ObfuscatedName("client.ec")
    public static int field456 = 0;

    @ObfuscatedName("client.ew")
    public static int field522 = 2;

    @ObfuscatedName("client.er")
    public static int field364 = 0;

    @ObfuscatedName("client.ey")
    public static int field365 = 1;

    @ObfuscatedName("client.es")
    public static int field366 = 0;

    @ObfuscatedName("client.en")
    public static int field367 = 0;

    @ObfuscatedName("client.ej")
    public static int field322 = 2301979;

    @ObfuscatedName("client.ez")
    public static int field313 = 5063219;

    @ObfuscatedName("client.ex")
    public static int field370 = 3353893;

    @ObfuscatedName("client.eu")
    public static int field371 = 7759444;

    @ObfuscatedName("client.el")
    public static boolean field372 = false;

    @ObfuscatedName("client.ei")
    public static int field523 = 0;

    @ObfuscatedName("client.fb")
    public static int field374 = 128;

    @ObfuscatedName("client.fl")
    public static int field375 = 0;

    @ObfuscatedName("client.fa")
    public static int field376 = 0;

    @ObfuscatedName("client.fr")
    public static int field377 = 0;

    @ObfuscatedName("client.fd")
    public static int field378 = 0;

    @ObfuscatedName("client.fu")
    public static int field379 = 0;

    @ObfuscatedName("client.fy")
    public static int field380 = 50;

    @ObfuscatedName("client.fm")
    public static int field381 = 0;

    @ObfuscatedName("client.fx")
    public static boolean field546 = false;

    @ObfuscatedName("client.ft")
    public static int field383 = 0;

    @ObfuscatedName("client.fk")
    public static int field384 = 0;

    @ObfuscatedName("client.fc")
    public static int field385 = 50;

    @ObfuscatedName("client.fp")
    public static int[] field386 = new int[field385];

    @ObfuscatedName("client.fz")
    public static int[] field387 = new int[field385];

    @ObfuscatedName("client.fq")
    public static int[] field524 = new int[field385];

    @ObfuscatedName("client.ff")
    public static int[] field529 = new int[field385];

    @ObfuscatedName("client.fs")
    public static int[] field390 = new int[field385];

    @ObfuscatedName("client.fw")
    public static int[] field391 = new int[field385];

    @ObfuscatedName("client.fn")
    public static int[] field392 = new int[field385];

    @ObfuscatedName("client.gq")
    public static String[] field393 = new String[field385];

    @ObfuscatedName("client.gu")
    public static int[][] field539 = new int[104][104];

    @ObfuscatedName("client.gw")
    public static int field332 = 0;

    @ObfuscatedName("client.gb")
    public static int field298 = -1;

    @ObfuscatedName("client.gl")
    public static int field397 = -1;

    @ObfuscatedName("client.gd")
    public static int field398 = 0;

    @ObfuscatedName("client.gk")
    public static int field399 = 0;

    @ObfuscatedName("client.gi")
    public static int field400 = 0;

    @ObfuscatedName("client.gy")
    public static int field401 = 0;

    @ObfuscatedName("client.gg")
    public static int field402 = 0;

    @ObfuscatedName("client.gf")
    public static int field403 = 0;

    @ObfuscatedName("client.gv")
    public static int field405 = 0;

    @ObfuscatedName("client.gr")
    public static int field406 = 0;

    @ObfuscatedName("client.ge")
    public static int field407 = 0;

    @ObfuscatedName("client.gh")
    public static int field408 = 0;

    @ObfuscatedName("client.gn")
    public static boolean field441 = false;

    @ObfuscatedName("client.go")
    public static int field410 = 0;

    @ObfuscatedName("client.gs")
    public static int field411 = 0;

    @ObfuscatedName("client.gz")
    public static class3[] field412 = new class3[2048];

    @ObfuscatedName("client.gj")
    public static int field373 = -1;

    @ObfuscatedName("client.gx")
    public static int field414 = 0;

    @ObfuscatedName("client.hf")
    public static int field482 = 0;

    @ObfuscatedName("client.ht")
    public static int[] field537 = new int[1000];

    @ObfuscatedName("client.hy")
    public static final int[] field417 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hr")
    public static String[] field418 = new String[8];

    @ObfuscatedName("client.hn")
    public static boolean[] field547 = new boolean[8];

    @ObfuscatedName("client.hv")
    public static int[] field394 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ho")
    public static int field421 = -1;

    @ObfuscatedName("client.ha")
    public static class199[][][] field422 = new class199[4][104][104];

    @ObfuscatedName("client.hc")
    public static class199 field423 = new class199();

    @ObfuscatedName("client.he")
    public static class199 field424 = new class199();

    @ObfuscatedName("client.hk")
    public static class199 field483 = new class199();

    @ObfuscatedName("client.hg")
    public static int[] field426 = new int[25];

    @ObfuscatedName("client.hw")
    public static int[] field427 = new int[25];

    @ObfuscatedName("client.hi")
    public static int[] field428 = new int[25];

    @ObfuscatedName("client.hs")
    public static int field458 = 0;

    @ObfuscatedName("client.hz")
    public static boolean field430 = false;

    @ObfuscatedName("client.hp")
    public static int field571 = 0;

    @ObfuscatedName("client.hj")
    public static int[] field432 = new int[500];

    @ObfuscatedName("client.hd")
    public static int[] field433 = new int[500];

    @ObfuscatedName("client.ih")
    public static int[] field434 = new int[500];

    @ObfuscatedName("client.ii")
    public static int[] field435 = new int[500];

    @ObfuscatedName("client.ie")
    public static String[] field436 = new String[500];

    @ObfuscatedName("client.iy")
    public static String[] field437 = new String[500];

    @ObfuscatedName("client.im")
    public static int field574 = -1;

    @ObfuscatedName("client.ij")
    public static int field439 = -1;

    @ObfuscatedName("client.io")
    public static int field440 = 0;

    @ObfuscatedName("client.if")
    public static int field487 = 50;

    @ObfuscatedName("client.ir")
    public static int field442 = 0;

    @ObfuscatedName("client.iq")
    public static String field443 = null;

    @ObfuscatedName("client.is")
    public static boolean field334 = false;

    @ObfuscatedName("client.ik")
    public static int field445 = -1;

    @ObfuscatedName("client.ig")
    public static int field446 = -1;

    @ObfuscatedName("client.iu")
    public static String field447 = null;

    @ObfuscatedName("client.il")
    public static String field494 = null;

    @ObfuscatedName("client.it")
    public static int field413 = -1;

    @ObfuscatedName("client.id")
    public static class196 field450 = new class196(8);

    @ObfuscatedName("client.ix")
    public static int field451 = 0;

    @ObfuscatedName("client.ji")
    public static int field420 = 0;

    @ObfuscatedName("client.jd")
    public static class173 field453 = null;

    @ObfuscatedName("client.jl")
    public static int field560 = 0;

    @ObfuscatedName("client.jr")
    public static int field455 = 0;

    @ObfuscatedName("client.ja")
    public static int field295 = 0;

    @ObfuscatedName("client.jg")
    public static int field558 = -1;

    @ObfuscatedName("client.jv")
    public static boolean field306 = false;

    @ObfuscatedName("client.jx")
    public static boolean field459 = false;

    @ObfuscatedName("client.jh")
    public static boolean field484 = false;

    @ObfuscatedName("client.je")
    public static class173 field338 = null;

    @ObfuscatedName("client.jn")
    public static class173 field359 = null;

    @ObfuscatedName("client.jb")
    public static class173 field463 = null;

    @ObfuscatedName("client.jm")
    public static int field464 = 0;

    @ObfuscatedName("client.jw")
    public static int field538 = 0;

    @ObfuscatedName("client.ju")
    public static class173 field466 = null;

    @ObfuscatedName("client.jc")
    public static boolean field540 = false;

    @ObfuscatedName("client.jy")
    public static int field468 = -1;

    @ObfuscatedName("client.jt")
    public static int field362 = -1;

    @ObfuscatedName("client.jf")
    public static boolean field470 = false;

    @ObfuscatedName("client.jq")
    public static int field471 = -1;

    @ObfuscatedName("client.jj")
    public static int field472 = -1;

    @ObfuscatedName("client.jp")
    public static boolean field473 = false;

    @ObfuscatedName("client.ka")
    public static int field357 = 1;

    @ObfuscatedName("client.kc")
    public static int[] field475 = new int[32];

    @ObfuscatedName("client.kv")
    public static int field476 = 0;

    @ObfuscatedName("client.ky")
    public static int[] field477 = new int[32];

    @ObfuscatedName("client.ko")
    public static int field478 = 0;

    @ObfuscatedName("client.kl")
    public static int[] field479 = new int[32];

    @ObfuscatedName("client.kj")
    public static int field532 = 0;

    @ObfuscatedName("client.kr")
    public static int field481 = 0;

    @ObfuscatedName("client.kb")
    public static int field329 = 0;

    @ObfuscatedName("client.kf")
    public static int field351 = 0;

    @ObfuscatedName("client.kn")
    public static int field342 = 0;

    @ObfuscatedName("client.kq")
    public static int field514 = 0;

    @ObfuscatedName("client.kw")
    public static int field485 = 0;

    @ObfuscatedName("client.ki")
    public static int field488 = 0;

    @ObfuscatedName("client.ks")
    public static class199 field489 = new class199();

    @ObfuscatedName("client.kz")
    public static class199 field404 = new class199();

    @ObfuscatedName("client.kx")
    public static class199 field491 = new class199();

    @ObfuscatedName("client.ku")
    public static class196 field492 = new class196(512);

    @ObfuscatedName("client.kd")
    public static int field493 = 0;

    @ObfuscatedName("client.kp")
    public static int field323 = -2;

    @ObfuscatedName("client.ke")
    public static boolean[] field495 = new boolean[100];

    @ObfuscatedName("client.lj")
    public static boolean[] field508 = new boolean[100];

    @ObfuscatedName("client.la")
    public static boolean[] field497 = new boolean[100];

    @ObfuscatedName("client.lz")
    public static int[] field498 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field507 = new int[100];

    @ObfuscatedName("client.lw")
    public static int[] field500 = new int[100];

    @ObfuscatedName("client.lr")
    public static int[] field501 = new int[100];

    @ObfuscatedName("client.lt")
    public static int field502 = 0;

    @ObfuscatedName("client.lk")
    public static long field503 = 0L;

    @ObfuscatedName("client.lo")
    public static boolean field504 = true;

    @ObfuscatedName("client.ly")
    public static int field505 = 1;

    @ObfuscatedName("client.lv")
    public static int field506 = 1;

    @ObfuscatedName("client.lq")
    public static int[] field350 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ls")
    public static int field363 = 0;

    @ObfuscatedName("client.ld")
    public static int field509 = 0;

    @ObfuscatedName("client.le")
    public static String field461 = "";

    @ObfuscatedName("client.ln")
    public static long[] field511 = new long[100];

    @ObfuscatedName("client.lh")
    public static int field512 = 0;

    @ObfuscatedName("client.lm")
    public static int field513 = 0;

    @ObfuscatedName("client.lx")
    public static int[] field314 = new int[128];

    @ObfuscatedName("client.mj")
    public static int[] field515 = new int[128];

    @ObfuscatedName("client.mb")
    public static long field516 = -1L;

    @ObfuscatedName("client.mo")
    public static String field517 = null;

    @ObfuscatedName("client.mw")
    public static String field518 = null;

    @ObfuscatedName("client.mi")
    public static int field519 = -1;

    @ObfuscatedName("client.mm")
    public static int field561 = 0;

    @ObfuscatedName("client.mg")
    public static int[] field444 = new int[1000];

    @ObfuscatedName("client.ms")
    public static int[] field352 = new int[1000];

    @ObfuscatedName("client.mp")
    public static class79[] field564 = new class79[1000];

    @ObfuscatedName("client.mz")
    public static int field460 = 0;

    @ObfuscatedName("client.mn")
    public static int field525 = 0;

    @ObfuscatedName("client.mx")
    public static int field526 = 0;

    @ObfuscatedName("client.mf")
    public static int field527 = 255;

    @ObfuscatedName("client.mk")
    public static int field416 = -1;

    @ObfuscatedName("client.md")
    public static boolean field552 = false;

    @ObfuscatedName("client.nb")
    public static int field528 = 127;

    @ObfuscatedName("client.ni")
    public static int field531 = 127;

    @ObfuscatedName("client.nw")
    public static int field550 = 0;

    @ObfuscatedName("client.nt")
    public static int[] field533 = new int[50];

    @ObfuscatedName("client.nl")
    public static int[] field534 = new int[50];

    @ObfuscatedName("client.nz")
    public static int[] field542 = new int[50];

    @ObfuscatedName("client.nv")
    public static int[] field294 = new int[50];

    @ObfuscatedName("client.nx")
    public static class59[] field469 = new class59[50];

    @ObfuscatedName("client.nc")
    public static boolean field431 = false;

    @ObfuscatedName("client.nk")
    public static boolean[] field310 = new boolean[5];

    @ObfuscatedName("client.om")
    public static int[] field474 = new int[5];

    @ObfuscatedName("client.oh")
    public static int[] field449 = new int[5];

    @ObfuscatedName("client.ox")
    public static int[] field543 = new int[5];

    @ObfuscatedName("client.ov")
    public static int[] field544 = new int[5];

    @ObfuscatedName("client.ou")
    public static short field545 = 256;

    @ObfuscatedName("client.on")
    public static short field368 = 205;

    @ObfuscatedName("client.oj")
    public static short field438 = 256;

    @ObfuscatedName("client.ow")
    public static short field572 = 320;

    @ObfuscatedName("client.os")
    public static short field549 = 1;

    @ObfuscatedName("client.op")
    public static short field330 = 32767;

    @ObfuscatedName("client.ot")
    public static short field551 = 1;

    @ObfuscatedName("client.oc")
    public static short field541 = 32767;

    @ObfuscatedName("client.oy")
    public static int field553 = 0;

    @ObfuscatedName("client.oi")
    public static int field554 = 0;

    @ObfuscatedName("client.og")
    public static int field555 = 0;

    @ObfuscatedName("client.or")
    public static int field556 = 0;

    @ObfuscatedName("client.oz")
    public static int field557 = 0;

    @ObfuscatedName("client.oe")
    public static int field419 = 0;

    @ObfuscatedName("client.oa")
    public static int field559 = 0;

    @ObfuscatedName("client.of")
    public static class18[] field369 = new class18[400];

    @ObfuscatedName("client.ol")
    public static class195 field339 = new class195();

    @ObfuscatedName("client.oo")
    public static int field562 = 0;

    @ObfuscatedName("client.ok")
    public static class8[] field563 = new class8[400];

    @ObfuscatedName("client.oq")
    public static class179 field465 = new class179();

    @ObfuscatedName("client.pp")
    public static int field565 = -1;

    @ObfuscatedName("client.pn")
    public static int field448 = -1;

    @ObfuscatedName("client.pl")
    public static class220[] field567 = new class220[8];

    @ObfuscatedName("client.ps")
    public static long field290 = -1L;

    @ObfuscatedName("client.pv")
    public static long field569 = -1L;

    @ObfuscatedName("client.pk")
    public static final class11 field570 = new class11();

    @ObfuscatedName("client.py")
    public static int[] field462 = new int[50];

    @ObfuscatedName("client.pr")
    public static int[] field520 = new int[50];

    @ObfuscatedName("client.d(B)V")
    public final void method241() {
    }

    public final void init() {
        if (!this.method2813()) {
            return;
        }
        class190[] var1 = class190.method635();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class190 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3045);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3045)) {
                    case 3:
                        Statics.field2028 = var4;
                        break;
                    case 4:
                        class154[] var5 = new class154[] { class154.field2264, class154.field2270, class154.field2268, class154.field2263, class154.field2265, class154.field2267 };
                        Statics.field1092 = (class154) class109.method104(var5, Integer.parseInt(var4));
                        if (Statics.field1092 == class154.field2267) {
                            Statics.field2000 = class212.field3114;
                        } else {
                            Statics.field2000 = class212.field3113;
                        }
                    case 5:
                    default:
                        break;
                    case 6:
                        field318 = Integer.parseInt(var4);
                        break;
                    case 7:
                        Statics.field499 = Integer.parseInt(var4);
                        break;
                    case 8:
                        Statics.field1554 = class153.method956(Integer.parseInt(var4));
                        break;
                    case 9:
                        if (var4.equalsIgnoreCase(class2.field19)) {
                            field296 = true;
                        } else {
                            field296 = false;
                        }
                        break;
                    case 10:
                        Statics.field67 = var4;
                        break;
                    case 11:
                        field293 = Integer.parseInt(var4);
                        break;
                    case 12:
                        field316 = Integer.parseInt(var4);
                        break;
                    case 13:
                        Statics.field299 = Integer.parseInt(var4);
                        break;
                    case 14:
                        field409 = Integer.parseInt(var4);
                        break;
                    case 15:
                        if (var4.equalsIgnoreCase(class2.field19)) {
                        }
                }
            }
        }
        method2011();
        Statics.field185 = this.getCodeBase().getHost();
        String var6 = Statics.field1554.field2255;
        byte var7 = 0;
        try {
            Statics.field2212 = 16;
            Statics.field1994 = var7;
            try {
                Statics.field1095 = System.getProperty("os.name");
            } catch (Exception var21) {
                Statics.field1095 = "Unknown";
            }
            Statics.field3011 = Statics.field1095.toLowerCase();
            try {
                Statics.field2021 = System.getProperty("user.home");
                if (Statics.field2021 != null) {
                    Statics.field2021 = Statics.field2021 + "/";
                }
            } catch (Exception var20) {
            }
            try {
                if (Statics.field3011.startsWith("win")) {
                    if (Statics.field2021 == null) {
                        Statics.field2021 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2021 == null) {
                    Statics.field2021 = System.getenv("HOME");
                }
                if (Statics.field2021 != null) {
                    Statics.field2021 = Statics.field2021 + "/";
                }
            } catch (Exception var19) {
            }
            if (Statics.field2021 == null) {
                Statics.field2021 = "~/";
            }
            Statics.field2570 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2021, "/tmp/", "" };
            Statics.field2885 = new String[] { ".jagex_cache_" + Statics.field1994, ".file_store_" + Statics.field1994 };
            label122: for (int var11 = 0; var11 < 4; var11++) {
                Statics.field2116 = class149.method110("oldschool", var6, var11);
                if (!Statics.field2116.exists()) {
                    Statics.field2116.mkdirs();
                }
                File[] var12 = Statics.field2116.listFiles();
                if (var12 == null) {
                    break;
                }
                File[] var13 = var12;
                int var14 = 0;
                while (true) {
                    if (var14 >= var13.length) {
                        break label122;
                    }
                    File var15 = var13[var14];
                    if (!class149.method2023(var15, false)) {
                        break;
                    }
                    var14++;
                }
            }
            File var16 = Statics.field2116;
            Statics.field2064 = var16;
            if (!Statics.field2064.exists()) {
                throw new RuntimeException("");
            }
            class135.field2063 = true;
            class149.method713();
            class149.field2218 = new class228(new class227(class135.method986("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class149.field2219 = new class228(new class227(class135.method986("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2626 = new class228[Statics.field2212];
            for (int var17 = 0; var17 < Statics.field2212; var17++) {
                Statics.field2626[var17] = new class228(new class227(class135.method986("main_file_cache.idx" + var17), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var22) {
            class148.method2701((String) null, var22);
        }
        Statics.field291 = this;
        this.method2811(765, 503, 94);
    }

    @ObfuscatedName("cv.w(I)V")
    public static final void method2011() {
        class86.field1499 = false;
        field429 = false;
    }

    @ObfuscatedName("client.e(I)V")
    public final void method272() {
        Statics.field272 = field318 == 0 ? 43594 : field293 + 40000;
        Statics.field287 = field318 == 0 ? 443 : field293 + 50000;
        Statics.field623 = Statics.field272;
        Statics.field2151 = class174.field2865;
        Statics.field2889 = class174.field2863;
        Statics.field2896 = class174.field2862;
        Statics.field2973 = class174.field2864;
        class137.method190();
        Statics.method2239(Statics.field252);
        class140.method2020(Statics.field252);
        Statics.field707 = class131.method869();
        if (Statics.field707 != null) {
            Statics.field707.method2646(Statics.field252);
        }
        Statics.field1380 = new class134(255, class149.field2218, class149.field2219, 500000);
        Statics.field1549 = class9.method118();
        Statics.field861 = this.getToolkit().getSystemClipboard();
        class138.method3066(this, Statics.field1961);
        if (field318 != 0) {
            field467 = true;
        }
        method2912(Statics.field1549.field146);
    }

    @ObfuscatedName("client.c(I)V")
    public final void method244() {
        field303++;
        this.method247();
        while (true) {
            class199 var1 = class170.field2684;
            class169 var2;
            synchronized (class170.field2684) {
                var2 = (class169) class170.field2683.method3491();
            }
            if (var2 == null) {
                class183.method2873();
                method1481();
                class137 var4 = class137.field2096;
                synchronized (class137.field2096) {
                    class137.field2103++;
                    class137.field2102 = class137.field2086;
                    class137.field2101 = 0;
                    if (class137.field2097 >= 0) {
                        while (class137.field2105 != class137.field2097) {
                            int var6 = class137.field2082[class137.field2105];
                            class137.field2105 = class137.field2105 + 1 & 0x7F;
                            if (var6 < 0) {
                                class137.field2094[~var6] = false;
                            } else {
                                if (!class137.field2094[var6] && class137.field2101 < class137.field2100.length - 1) {
                                    class137.field2100[++class137.field2101 - 1] = var6;
                                }
                                class137.field2094[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class137.field2094[var5] = false;
                        }
                        class137.field2097 = class137.field2105;
                    }
                    class137.field2086 = class137.field2090;
                }
                class140.method694();
                if (Statics.field707 != null) {
                    int var8 = Statics.field707.method2638();
                    field488 = var8;
                }
                if (field301 == 0) {
                    method8();
                    Statics.field969.method2656();
                    for (int var9 = 0; var9 < 32; var9++) {
                        field2178[var9] = 0L;
                    }
                    for (int var10 = 0; var10 < 32; var10++) {
                        field2174[var10] = 0L;
                    }
                    Statics.field999 = 0;
                } else if (field301 == 5) {
                    class32.method890(this);
                    method8();
                    Statics.field969.method2656();
                    for (int var11 = 0; var11 < 32; var11++) {
                        field2178[var11] = 0L;
                    }
                    for (int var12 = 0; var12 < 32; var12++) {
                        field2174[var12] = 0L;
                    }
                    Statics.field999 = 0;
                } else if (field301 == 10 || field301 == 11) {
                    class32.method890(this);
                } else if (field301 == 20) {
                    class32.method890(this);
                    method111();
                } else if (field301 == 25) {
                    method107(false);
                    field346 = 0;
                    boolean var13 = true;
                    for (int var14 = 0; var14 < Statics.field172.length; var14++) {
                        if (Statics.field2871[var14] != -1 && Statics.field172[var14] == null) {
                            Statics.field172[var14] = Statics.field92.method3045(Statics.field2871[var14], 0);
                            if (Statics.field172[var14] == null) {
                                var13 = false;
                                field346++;
                            }
                        }
                        if (Statics.field130[var14] != -1 && Statics.field207[var14] == null) {
                            Statics.field207[var14] = Statics.field92.method3006(Statics.field130[var14], 0, Statics.field53[var14]);
                            if (Statics.field207[var14] == null) {
                                var13 = false;
                                field346++;
                            }
                        }
                    }
                    if (var13) {
                        field348 = 0;
                        boolean var15 = true;
                        for (int var16 = 0; var16 < Statics.field172.length; var16++) {
                            byte[] var17 = Statics.field207[var16];
                            if (var17 != null) {
                                int var18 = (Statics.field1958[var16] >> 8) * 64 - Statics.field941;
                                int var19 = (Statics.field1958[var16] & 0xFF) * 64 - Statics.field23;
                                if (field496) {
                                    var18 = 10;
                                    var19 = 10;
                                }
                                var15 &= class6.method1928(var17, var18, var19);
                            }
                        }
                        if (var15) {
                            if (field336 != 0) {
                                method565(class157.field2386 + class2.field25 + class2.field22 + 100 + "%" + class2.field20, true);
                            }
                            method1481();
                            method2112();
                            method1481();
                            Statics.field2038.method1755();
                            method1481();
                            System.gc();
                            for (int var20 = 0; var20 < 4; var20++) {
                                field389[var20].method2208();
                            }
                            for (int var21 = 0; var21 < 4; var21++) {
                                for (int var22 = 0; var22 < 104; var22++) {
                                    for (int var23 = 0; var23 < 104; var23++) {
                                        class6.field80[var21][var22][var23] = 0;
                                    }
                                }
                            }
                            method1481();
                            class6.method1925();
                            int var24 = Statics.field172.length;
                            Statics.method173();
                            method107(true);
                            if (!field496) {
                                for (int var25 = 0; var25 < var24; var25++) {
                                    int var26 = (Statics.field1958[var25] >> 8) * 64 - Statics.field941;
                                    int var27 = (Statics.field1958[var25] & 0xFF) * 64 - Statics.field23;
                                    byte[] var28 = Statics.field172[var25];
                                    if (var28 != null) {
                                        method1481();
                                        class6.method100(var28, var26, var27, Statics.field24 * 8 - 48, Statics.field1743 * 8 - 48, field389);
                                    }
                                }
                                for (int var29 = 0; var29 < var24; var29++) {
                                    int var30 = (Statics.field1958[var29] >> 8) * 64 - Statics.field941;
                                    int var31 = (Statics.field1958[var29] & 0xFF) * 64 - Statics.field23;
                                    byte[] var32 = Statics.field172[var29];
                                    if (var32 == null && Statics.field1743 < 800) {
                                        method1481();
                                        class6.method923(var30, var31, 64, 64);
                                    }
                                }
                                method107(true);
                                for (int var33 = 0; var33 < var24; var33++) {
                                    byte[] var34 = Statics.field207[var33];
                                    if (var34 != null) {
                                        int var35 = (Statics.field1958[var33] >> 8) * 64 - Statics.field941;
                                        int var36 = (Statics.field1958[var33] & 0xFF) * 64 - Statics.field23;
                                        method1481();
                                        class6.method712(var34, var35, var36, Statics.field2038, field389);
                                    }
                                }
                            }
                            if (field496) {
                                int var37 = 0;
                                label1107: while (true) {
                                    if (var37 >= 4) {
                                        for (int var75 = 0; var75 < 13; var75++) {
                                            for (int var76 = 0; var76 < 13; var76++) {
                                                int var77 = field353[0][var75][var76];
                                                if (var77 == -1) {
                                                    class6.method923(var75 * 8, var76 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method107(true);
                                        int var78 = 0;
                                        while (true) {
                                            if (var78 >= 4) {
                                                break label1107;
                                            }
                                            method1481();
                                            for (int var79 = 0; var79 < 13; var79++) {
                                                for (int var80 = 0; var80 < 13; var80++) {
                                                    int var81 = field353[var78][var79][var80];
                                                    if (var81 != -1) {
                                                        int var82 = var81 >> 24 & 0x3;
                                                        int var83 = var81 >> 1 & 0x3;
                                                        int var84 = var81 >> 14 & 0x3FF;
                                                        int var85 = var81 >> 3 & 0x7FF;
                                                        int var86 = (var84 / 8 << 8) + var85 / 8;
                                                        for (int var87 = 0; var87 < Statics.field1958.length; var87++) {
                                                            if (Statics.field1958[var87] == var86 && Statics.field207[var87] != null) {
                                                                class6.method574(Statics.field207[var87], var78, var79 * 8, var80 * 8, var82, (var84 & 0x7) * 8, (var85 & 0x7) * 8, var83, Statics.field2038, field389);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var78++;
                                        }
                                    }
                                    method1481();
                                    for (int var38 = 0; var38 < 13; var38++) {
                                        for (int var39 = 0; var39 < 13; var39++) {
                                            boolean var40 = false;
                                            int var41 = field353[var37][var38][var39];
                                            if (var41 != -1) {
                                                int var42 = var41 >> 24 & 0x3;
                                                int var43 = var41 >> 1 & 0x3;
                                                int var44 = var41 >> 14 & 0x3FF;
                                                int var45 = var41 >> 3 & 0x7FF;
                                                int var46 = (var44 / 8 << 8) + var45 / 8;
                                                for (int var47 = 0; var47 < Statics.field1958.length; var47++) {
                                                    if (Statics.field1958[var47] == var46 && Statics.field172[var47] != null) {
                                                        byte[] var48 = Statics.field172[var47];
                                                        int var49 = var38 * 8;
                                                        int var50 = var39 * 8;
                                                        int var51 = (var44 & 0x7) * 8;
                                                        int var52 = (var45 & 0x7) * 8;
                                                        class108[] var53 = field389;
                                                        for (int var54 = 0; var54 < 8; var54++) {
                                                            for (int var55 = 0; var55 < 8; var55++) {
                                                                if (var49 + var54 > 0 && var49 + var54 < 103 && var50 + var55 > 0 && var50 + var55 < 103) {
                                                                    var53[var37].field1892[var49 + var54][var50 + var55] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class119 var56 = new class119(var48);
                                                        for (int var57 = 0; var57 < 4; var57++) {
                                                            for (int var58 = 0; var58 < 64; var58++) {
                                                                for (int var59 = 0; var59 < 64; var59++) {
                                                                    if (var42 == var57 && var58 >= var51 && var58 < var51 + 8 && var59 >= var52 && var59 < var52 + 8) {
                                                                        int var63 = var58 & 0x7;
                                                                        int var64 = var59 & 0x7;
                                                                        int var66 = var43 & 0x3;
                                                                        int var67;
                                                                        if (var66 == 0) {
                                                                            var67 = var63;
                                                                        } else if (var66 == 1) {
                                                                            var67 = var64;
                                                                        } else if (var66 == 2) {
                                                                            var67 = 7 - var63;
                                                                        } else {
                                                                            var67 = 7 - var64;
                                                                        }
                                                                        class6.method2641(var56, var37, var49 + var67, var50 + class177.method714(var58 & 0x7, var59 & 0x7, var43), 0, 0, var43);
                                                                    } else {
                                                                        class6.method2641(var56, 0, -1, -1, 0, 0, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var40 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var40) {
                                                int var68 = var37;
                                                int var69 = var38 * 8;
                                                int var70 = var39 * 8;
                                                for (int var71 = 0; var71 < 8; var71++) {
                                                    for (int var72 = 0; var72 < 8; var72++) {
                                                        class6.field86[var68][var69 + var71][var70 + var72] = 0;
                                                    }
                                                }
                                                if (var69 > 0) {
                                                    for (int var73 = 1; var73 < 8; var73++) {
                                                        class6.field86[var68][var69][var70 + var73] = class6.field86[var68][var69 - 1][var70 + var73];
                                                    }
                                                }
                                                if (var70 > 0) {
                                                    for (int var74 = 1; var74 < 8; var74++) {
                                                        class6.field86[var68][var69 + var74][var70] = class6.field86[var68][var69 + var74][var70 - 1];
                                                    }
                                                }
                                                if (var69 > 0 && class6.field86[var68][var69 - 1][var70] != 0) {
                                                    class6.field86[var68][var69][var70] = class6.field86[var68][var69 - 1][var70];
                                                } else if (var70 > 0 && class6.field86[var68][var69][var70 - 1] != 0) {
                                                    class6.field86[var68][var69][var70] = class6.field86[var68][var69][var70 - 1];
                                                } else if (var69 > 0 && var70 > 0 && class6.field86[var68][var69 - 1][var70 - 1] != 0) {
                                                    class6.field86[var68][var69][var70] = class6.field86[var68][var69 - 1][var70 - 1];
                                                }
                                            }
                                        }
                                    }
                                    var37++;
                                }
                            }
                            method107(true);
                            method2112();
                            method1481();
                            class86 var88 = Statics.field2038;
                            class108[] var89 = field389;
                            for (int var90 = 0; var90 < 4; var90++) {
                                for (int var91 = 0; var91 < 104; var91++) {
                                    for (int var92 = 0; var92 < 104; var92++) {
                                        if ((class6.field80[var90][var91][var92] & 0x1) == 1) {
                                            int var93 = var90;
                                            if ((class6.field80[1][var91][var92] & 0x2) == 2) {
                                                var93 = var90 - 1;
                                            }
                                            if (var93 >= 0) {
                                                var89[var93].method2207(var91, var92);
                                            }
                                        }
                                    }
                                }
                            }
                            class6.field94 += (int) (Math.random() * 5.0D) - 2;
                            if (class6.field94 < -8) {
                                class6.field94 = -8;
                            }
                            if (class6.field94 > 8) {
                                class6.field94 = 8;
                            }
                            class6.field95 += (int) (Math.random() * 5.0D) - 2;
                            if (class6.field95 < -16) {
                                class6.field95 = -16;
                            }
                            if (class6.field95 > 16) {
                                class6.field95 = 16;
                            }
                            for (int var94 = 0; var94 < 4; var94++) {
                                byte[][] var95 = Statics.field87[var94];
                                int var96 = (int) Math.sqrt(5100.0D);
                                int var97 = var96 * 768 >> 8;
                                for (int var98 = 1; var98 < 103; var98++) {
                                    for (int var99 = 1; var99 < 103; var99++) {
                                        int var100 = class6.field86[var94][var99 + 1][var98] - class6.field86[var94][var99 - 1][var98];
                                        int var101 = class6.field86[var94][var99][var98 + 1] - class6.field86[var94][var99][var98 - 1];
                                        int var102 = (int) Math.sqrt((double) (var101 * var101 + var100 * var100 + 65536));
                                        int var103 = (var100 << 8) / var102;
                                        int var104 = 65536 / var102;
                                        int var105 = (var101 << 8) / var102;
                                        int var106 = (var105 * -50 + var103 * -50 + var104 * -10) / var97 + 96;
                                        int var107 = (var95[var99][var98] >> 1) + (var95[var99][var98 + 1] >> 3) + (var95[var99][var98 - 1] >> 2) + (var95[var99 - 1][var98] >> 2) + (var95[var99 + 1][var98] >> 3);
                                        Statics.field2232[var99][var98] = var106 - var107;
                                    }
                                }
                                for (int var108 = 0; var108 < 104; var108++) {
                                    Statics.field64[var108] = 0;
                                    Statics.field84[var108] = 0;
                                    Statics.field85[var108] = 0;
                                    Statics.field258[var108] = 0;
                                    Statics.field2152[var108] = 0;
                                }
                                for (int var109 = -5; var109 < 109; var109++) {
                                    for (int var110 = 0; var110 < 104; var110++) {
                                        int var111 = var109 + 5;
                                        int var10002;
                                        if (var111 >= 0 && var111 < 104) {
                                            int var112 = Statics.field82[var94][var111][var110] & 0xFF;
                                            if (var112 > 0) {
                                                int var113 = var112 - 1;
                                                class42 var114 = (class42) class42.field973.method3425((long) var113);
                                                class42 var115;
                                                if (var114 == null) {
                                                    byte[] var116 = Statics.field971.method3045(1, var113);
                                                    class42 var117 = new class42();
                                                    if (var116 != null) {
                                                        var117.method813(new class119(var116), var113);
                                                    }
                                                    var117.method812();
                                                    class42.field973.method3427(var117, (long) var113);
                                                    var115 = var117;
                                                } else {
                                                    var115 = var114;
                                                }
                                                Statics.field64[var110] += var115.field978;
                                                Statics.field84[var110] += var115.field972;
                                                Statics.field85[var110] += var115.field968;
                                                Statics.field258[var110] += var115.field974;
                                                var10002 = Statics.field2152[var110]++;
                                            }
                                        }
                                        int var119 = var109 - 5;
                                        if (var119 >= 0 && var119 < 104) {
                                            int var120 = Statics.field82[var94][var119][var110] & 0xFF;
                                            if (var120 > 0) {
                                                int var121 = var120 - 1;
                                                class42 var122 = (class42) class42.field973.method3425((long) var121);
                                                class42 var123;
                                                if (var122 == null) {
                                                    byte[] var124 = Statics.field971.method3045(1, var121);
                                                    class42 var125 = new class42();
                                                    if (var124 != null) {
                                                        var125.method813(new class119(var124), var121);
                                                    }
                                                    var125.method812();
                                                    class42.field973.method3427(var125, (long) var121);
                                                    var123 = var125;
                                                } else {
                                                    var123 = var122;
                                                }
                                                Statics.field64[var110] -= var123.field978;
                                                Statics.field84[var110] -= var123.field972;
                                                Statics.field85[var110] -= var123.field968;
                                                Statics.field258[var110] -= var123.field974;
                                                var10002 = Statics.field2152[var110]--;
                                            }
                                        }
                                    }
                                    if (var109 >= 1 && var109 < 103) {
                                        int var127 = 0;
                                        int var128 = 0;
                                        int var129 = 0;
                                        int var130 = 0;
                                        int var131 = 0;
                                        for (int var132 = -5; var132 < 109; var132++) {
                                            int var133 = var132 + 5;
                                            if (var133 >= 0 && var133 < 104) {
                                                var127 += Statics.field64[var133];
                                                var128 += Statics.field84[var133];
                                                var129 += Statics.field85[var133];
                                                var130 += Statics.field258[var133];
                                                var131 += Statics.field2152[var133];
                                            }
                                            int var134 = var132 - 5;
                                            if (var134 >= 0 && var134 < 104) {
                                                var127 -= Statics.field64[var134];
                                                var128 -= Statics.field84[var134];
                                                var129 -= Statics.field85[var134];
                                                var130 -= Statics.field258[var134];
                                                var131 -= Statics.field2152[var134];
                                            }
                                            if (var132 >= 1 && var132 < 103 && (!field429 || (class6.field80[0][var109][var132] & 0x2) != 0 || (class6.field80[var94][var109][var132] & 0x10) == 0)) {
                                                if (var94 < class6.field98) {
                                                    class6.field98 = var94;
                                                }
                                                int var135 = Statics.field82[var94][var109][var132] & 0xFF;
                                                int var136 = Statics.field2687[var94][var109][var132] & 0xFF;
                                                if (var135 > 0 || var136 > 0) {
                                                    int var137 = class6.field86[var94][var109][var132];
                                                    int var138 = class6.field86[var94][var109 + 1][var132];
                                                    int var139 = class6.field86[var94][var109 + 1][var132 + 1];
                                                    int var140 = class6.field86[var94][var109][var132 + 1];
                                                    int var141 = Statics.field2232[var109][var132];
                                                    int var142 = Statics.field2232[var109 + 1][var132];
                                                    int var143 = Statics.field2232[var109 + 1][var132 + 1];
                                                    int var144 = Statics.field2232[var109][var132 + 1];
                                                    int var145 = -1;
                                                    int var146 = -1;
                                                    if (var135 > 0) {
                                                        int var147 = var127 * 256 / var130;
                                                        int var148 = var128 / var131;
                                                        int var149 = var129 / var131;
                                                        var145 = class6.method1502(var147, var148, var149);
                                                        int var150 = class6.field94 + var147 & 0xFF;
                                                        int var151 = class6.field95 + var149;
                                                        if (var151 < 0) {
                                                            var151 = 0;
                                                        } else if (var151 > 255) {
                                                            var151 = 255;
                                                        }
                                                        var146 = class6.method1502(var150, var148, var151);
                                                    }
                                                    if (var94 > 0) {
                                                        boolean var152 = true;
                                                        if (var135 == 0 && Statics.field2031[var94][var109][var132] != 0) {
                                                            var152 = false;
                                                        }
                                                        if (var136 > 0 && !class47.method3(var136 - 1).field1052) {
                                                            var152 = false;
                                                        }
                                                        if (var152 && var137 == var138 && var137 == var139 && var137 == var140) {
                                                            Statics.field93[var94][var109][var132] |= 0x924;
                                                        }
                                                    }
                                                    int var153 = 0;
                                                    if (var146 != -1) {
                                                        var153 = class91.field1580[class6.method112(var146, 96)];
                                                    }
                                                    if (var136 == 0) {
                                                        var88.method1774(var94, var109, var132, 0, 0, -1, var137, var138, var139, var140, class6.method112(var145, var141), class6.method112(var145, var142), class6.method112(var145, var143), class6.method112(var145, var144), 0, 0, 0, 0, var153, 0);
                                                    } else {
                                                        int var154 = Statics.field2031[var94][var109][var132] + 1;
                                                        byte var155 = Statics.field869[var94][var109][var132];
                                                        class47 var156 = class47.method3(var136 - 1);
                                                        int var157 = var156.field1049;
                                                        int var158;
                                                        int var159;
                                                        if (var157 >= 0) {
                                                            var158 = Statics.field1581.method1994(var157);
                                                            var159 = -1;
                                                        } else if (var156.field1051 == 16711935) {
                                                            var159 = -2;
                                                            var157 = -1;
                                                            var158 = -2;
                                                        } else {
                                                            var159 = class6.method1502(var156.field1055, var156.field1056, var156.field1063);
                                                            int var160 = class6.field94 + var156.field1055 & 0xFF;
                                                            int var161 = class6.field95 + var156.field1063;
                                                            if (var161 < 0) {
                                                                var161 = 0;
                                                            } else if (var161 > 255) {
                                                                var161 = 255;
                                                            }
                                                            var158 = class6.method1502(var160, var156.field1056, var161);
                                                        }
                                                        int var162 = 0;
                                                        if (var158 != -2) {
                                                            var162 = class91.field1580[class6.method585(var158, 96)];
                                                        }
                                                        if (var156.field1054 != -1) {
                                                            int var163 = class6.field94 + var156.field1058 & 0xFF;
                                                            int var164 = class6.field95 + var156.field1060;
                                                            if (var164 < 0) {
                                                                var164 = 0;
                                                            } else if (var164 > 255) {
                                                                var164 = 255;
                                                            }
                                                            int var165 = class6.method1502(var163, var156.field1059, var164);
                                                            var162 = class91.field1580[class6.method585(var165, 96)];
                                                        }
                                                        var88.method1774(var94, var109, var132, var154, var155, var157, var137, var138, var139, var140, class6.method112(var145, var141), class6.method112(var145, var142), class6.method112(var145, var143), class6.method112(var145, var144), class6.method585(var159, var141), class6.method585(var159, var142), class6.method585(var159, var143), class6.method585(var159, var144), var153, var162);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var166 = 1; var166 < 103; var166++) {
                                    for (int var167 = 1; var167 < 103; var167++) {
                                        int var172;
                                        if ((class6.field80[var94][var167][var166] & 0x8) != 0) {
                                            var172 = 0;
                                        } else if (var94 <= 0 || (class6.field80[1][var167][var166] & 0x2) == 0) {
                                            var172 = var94;
                                        } else {
                                            var172 = var94 - 1;
                                        }
                                        var88.method1759(var94, var167, var166, var172);
                                    }
                                }
                                Statics.field82[var94] = (byte[][]) null;
                                Statics.field2687[var94] = (byte[][]) null;
                                Statics.field2031[var94] = (byte[][]) null;
                                Statics.field869[var94] = (byte[][]) null;
                                Statics.field87[var94] = (byte[][]) null;
                            }
                            var88.method1786(-50, -10, -50);
                            for (int var173 = 0; var173 < 104; var173++) {
                                for (int var174 = 0; var174 < 104; var174++) {
                                    if ((class6.field80[1][var173][var174] & 0x2) == 2) {
                                        var88.method1878(var173, var174);
                                    }
                                }
                            }
                            int var175 = 1;
                            int var176 = 2;
                            int var177 = 4;
                            for (int var178 = 0; var178 < 4; var178++) {
                                if (var178 > 0) {
                                    var175 <<= 0x3;
                                    var176 <<= 0x3;
                                    var177 <<= 0x3;
                                }
                                for (int var179 = 0; var179 <= var178; var179++) {
                                    for (int var180 = 0; var180 <= 104; var180++) {
                                        for (int var181 = 0; var181 <= 104; var181++) {
                                            if ((Statics.field93[var179][var181][var180] & var175) != 0) {
                                                int var182 = var180;
                                                int var183 = var180;
                                                int var184 = var179;
                                                int var185 = var179;
                                                while (var182 > 0 && (Statics.field93[var179][var181][var182 - 1] & var175) != 0) {
                                                    var182--;
                                                }
                                                while (var183 < 104 && (Statics.field93[var179][var181][var183 + 1] & var175) != 0) {
                                                    var183++;
                                                }
                                                label724: while (var184 > 0) {
                                                    for (int var186 = var182; var186 <= var183; var186++) {
                                                        if ((Statics.field93[var184 - 1][var181][var186] & var175) == 0) {
                                                            break label724;
                                                        }
                                                    }
                                                    var184--;
                                                }
                                                label713: while (var185 < var178) {
                                                    for (int var187 = var182; var187 <= var183; var187++) {
                                                        if ((Statics.field93[var185 + 1][var181][var187] & var175) == 0) {
                                                            break label713;
                                                        }
                                                    }
                                                    var185++;
                                                }
                                                int var188 = (var185 + 1 - var184) * (var183 - var182 + 1);
                                                if (var188 >= 8) {
                                                    short var189 = 240;
                                                    int var190 = class6.field86[var185][var181][var182] - var189;
                                                    int var191 = class6.field86[var184][var181][var182];
                                                    class86.method1784(var178, 1, var181 * 128, var181 * 128, var182 * 128, var183 * 128 + 128, var190, var191);
                                                    for (int var192 = var184; var192 <= var185; var192++) {
                                                        for (int var193 = var182; var193 <= var183; var193++) {
                                                            Statics.field93[var192][var181][var193] &= ~var175;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field93[var179][var181][var180] & var176) != 0) {
                                                int var194 = var181;
                                                int var195 = var181;
                                                int var196 = var179;
                                                int var197 = var179;
                                                while (var194 > 0 && (Statics.field93[var179][var194 - 1][var180] & var176) != 0) {
                                                    var194--;
                                                }
                                                while (var195 < 104 && (Statics.field93[var179][var195 + 1][var180] & var176) != 0) {
                                                    var195++;
                                                }
                                                label777: while (var196 > 0) {
                                                    for (int var198 = var194; var198 <= var195; var198++) {
                                                        if ((Statics.field93[var196 - 1][var198][var180] & var176) == 0) {
                                                            break label777;
                                                        }
                                                    }
                                                    var196--;
                                                }
                                                label766: while (var197 < var178) {
                                                    for (int var199 = var194; var199 <= var195; var199++) {
                                                        if ((Statics.field93[var197 + 1][var199][var180] & var176) == 0) {
                                                            break label766;
                                                        }
                                                    }
                                                    var197++;
                                                }
                                                int var200 = (var197 + 1 - var196) * (var195 - var194 + 1);
                                                if (var200 >= 8) {
                                                    short var201 = 240;
                                                    int var202 = class6.field86[var197][var194][var180] - var201;
                                                    int var203 = class6.field86[var196][var194][var180];
                                                    class86.method1784(var178, 2, var194 * 128, var195 * 128 + 128, var180 * 128, var180 * 128, var202, var203);
                                                    for (int var204 = var196; var204 <= var197; var204++) {
                                                        for (int var205 = var194; var205 <= var195; var205++) {
                                                            Statics.field93[var204][var205][var180] &= ~var176;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field93[var179][var181][var180] & var177) != 0) {
                                                int var206 = var181;
                                                int var207 = var181;
                                                int var208 = var180;
                                                int var209 = var180;
                                                while (var208 > 0 && (Statics.field93[var179][var181][var208 - 1] & var177) != 0) {
                                                    var208--;
                                                }
                                                while (var209 < 104 && (Statics.field93[var179][var181][var209 + 1] & var177) != 0) {
                                                    var209++;
                                                }
                                                label830: while (var206 > 0) {
                                                    for (int var210 = var208; var210 <= var209; var210++) {
                                                        if ((Statics.field93[var179][var206 - 1][var210] & var177) == 0) {
                                                            break label830;
                                                        }
                                                    }
                                                    var206--;
                                                }
                                                label819: while (var207 < 104) {
                                                    for (int var211 = var208; var211 <= var209; var211++) {
                                                        if ((Statics.field93[var179][var207 + 1][var211] & var177) == 0) {
                                                            break label819;
                                                        }
                                                    }
                                                    var207++;
                                                }
                                                if ((var207 - var206 + 1) * (var209 - var208 + 1) >= 4) {
                                                    int var212 = class6.field86[var179][var206][var208];
                                                    class86.method1784(var178, 4, var206 * 128, var207 * 128 + 128, var208 * 128, var209 * 128 + 128, var212, var212);
                                                    for (int var213 = var206; var213 <= var207; var213++) {
                                                        for (int var214 = var208; var214 <= var209; var214++) {
                                                            Statics.field93[var179][var213][var214] &= ~var177;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            method107(true);
                            int var215 = class6.field98;
                            if (var215 > Statics.field27) {
                                var215 = Statics.field27;
                            }
                            if (var215 < Statics.field27 - 1) {
                                int var216 = Statics.field27 - 1;
                            }
                            if (field429) {
                                Statics.field2038.method1915(class6.field98);
                            } else {
                                Statics.field2038.method1915(0);
                            }
                            for (int var217 = 0; var217 < 104; var217++) {
                                for (int var218 = 0; var218 < 104; var218++) {
                                    method2258(var217, var218);
                                }
                            }
                            method1481();
                            for (class17 var219 = (class17) field423.method3493(); var219 != null; var219 = (class17) field423.method3495()) {
                                if (var219.field247 == -1) {
                                    var219.field244 = 0;
                                    method966(var219);
                                } else {
                                    var219.method3588();
                                }
                            }
                            class41.field917.method3428();
                            if (Statics.field1609 != null) {
                                field337.method2574(191);
                                field337.method2423(1057001181);
                            }
                            if (!field496) {
                                int var220 = (Statics.field24 - 6) / 8;
                                int var221 = (Statics.field24 + 6) / 8;
                                int var222 = (Statics.field1743 - 6) / 8;
                                int var223 = (Statics.field1743 + 6) / 8;
                                for (int var224 = var220 - 1; var224 <= var221 + 1; var224++) {
                                    for (int var225 = var222 - 1; var225 <= var223 + 1; var225++) {
                                        if (var224 < var220 || var224 > var221 || var225 < var222 || var225 > var223) {
                                            Statics.field92.method2997("m" + var224 + "_" + var225);
                                            Statics.field92.method2997("l" + var224 + "_" + var225);
                                        }
                                    }
                                }
                            }
                            method139(30);
                            method1481();
                            class6.method722();
                            field337.method2574(209);
                            Statics.field969.method2656();
                            for (int var226 = 0; var226 < 32; var226++) {
                                field2178[var226] = 0L;
                            }
                            for (int var227 = 0; var227 < 32; var227++) {
                                field2174[var227] = 0L;
                            }
                            Statics.field999 = 0;
                        } else {
                            field336 = 2;
                        }
                    } else {
                        field336 = 1;
                    }
                }
                if (field301 == 30) {
                    Statics.method168();
                } else if (field301 == 40 || field301 == 45) {
                    method111();
                }
                return;
            }
            var2.field2679.method3071(var2.field2680, (int) var2.field3091, var2.field2678, false);
        }
    }

    @ObfuscatedName("client.a(B)V")
    public final void method365() {
        boolean var1;
        label382: {
            try {
                if (class183.field2928 == 2) {
                    if (Statics.field2929 == null) {
                        Statics.field2929 = class180.method3227(Statics.field2924, Statics.field630, Statics.field2930);
                        if (Statics.field2929 == null) {
                            var1 = false;
                            break label382;
                        }
                    }
                    if (Statics.field863 == null) {
                        Statics.field863 = new class60(Statics.field2926, Statics.field2925);
                    }
                    if (Statics.field2932.method3344(Statics.field2929, Statics.field2933, Statics.field863, 22050)) {
                        Statics.field2932.method3397();
                        Statics.field2932.method3308(Statics.field680);
                        Statics.field2932.method3312(Statics.field2929, Statics.field1515);
                        class183.field2928 = 0;
                        Statics.field2929 = null;
                        Statics.field863 = null;
                        Statics.field2924 = null;
                        var1 = true;
                        break label382;
                    }
                }
            } catch (Exception var63) {
                var63.printStackTrace();
                Statics.field2932.method3371();
                class183.field2928 = 0;
                Statics.field2929 = null;
                Statics.field863 = null;
                Statics.field2924 = null;
            }
            var1 = false;
        }
        if (var1 && field552 && Statics.field1607 != null) {
            Statics.field1607.method1163();
        }
        if (field301 == 10 || field301 == 20 || field301 == 30) {
            if (field503 != 0L && class115.method671() > field503) {
                int var4 = field504 ? 2 : 1;
                method2912(var4);
            } else if (field2185) {
                method711();
            }
        }
        Dimension var5 = this.method2823();
        if (Statics.field2058 != var5.width || Statics.field1353 != var5.height || field2184) {
            method198();
            field503 = class115.method671() + 500L;
            field2184 = false;
        }
        boolean var6 = false;
        if (field2182) {
            field2182 = false;
            var6 = true;
            for (int var7 = 0; var7 < 100; var7++) {
                field495[var7] = true;
            }
        }
        if (var6) {
            method166();
        }
        if (field301 == 0) {
            int var8 = class32.field714;
            String var9 = class32.field728;
            Color var10 = null;
            try {
                Graphics var11 = Statics.field252.getGraphics();
                if (Statics.field1621 == null) {
                    Statics.field1621 = new Font("Helvetica", 1, 13);
                    Statics.field1558 = Statics.field252.getFontMetrics(Statics.field1621);
                }
                if (var6) {
                    var11.setColor(Color.black);
                    var11.fillRect(0, 0, Statics.field2114, Statics.field2638);
                }
                if (var10 == null) {
                    var10 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field2243 == null) {
                        Statics.field2243 = Statics.field252.createImage(304, 34);
                    }
                    Graphics var12 = Statics.field2243.getGraphics();
                    var12.setColor(var10);
                    var12.drawRect(0, 0, 303, 33);
                    var12.fillRect(2, 2, var8 * 3, 30);
                    var12.setColor(Color.black);
                    var12.drawRect(1, 1, 301, 31);
                    var12.fillRect(var8 * 3 + 2, 2, 300 - var8 * 3, 30);
                    var12.setFont(Statics.field1621);
                    var12.setColor(Color.white);
                    var12.drawString(var9, (304 - Statics.field1558.stringWidth(var9)) / 2, 22);
                    var11.drawImage(Statics.field2243, Statics.field2114 / 2 - 152, Statics.field2638 / 2 - 18, (ImageObserver) null);
                } catch (Exception var59) {
                    int var14 = Statics.field2114 / 2 - 152;
                    int var15 = Statics.field2638 / 2 - 18;
                    var11.setColor(var10);
                    var11.drawRect(var14, var15, 303, 33);
                    var11.fillRect(var14 + 2, var15 + 2, var8 * 3, 30);
                    var11.setColor(Color.black);
                    var11.drawRect(var14 + 1, var15 + 1, 301, 31);
                    var11.fillRect(var8 * 3 + var14 + 2, var15 + 2, 300 - var8 * 3, 30);
                    var11.setFont(Statics.field1621);
                    var11.setColor(Color.white);
                    var11.drawString(var9, var14 + (304 - Statics.field1558.stringWidth(var9)) / 2, var15 + 22);
                }
            } catch (Exception var60) {
                Statics.field252.repaint();
            }
        } else if (field301 == 5) {
            class32.method2243(Statics.field1044, Statics.field2278, Statics.field143, var6);
        } else if (field301 == 10 || field301 == 11) {
            class32.method2243(Statics.field1044, Statics.field2278, Statics.field143, var6);
        } else if (field301 == 20) {
            class32.method2243(Statics.field1044, Statics.field2278, Statics.field143, var6);
        } else if (field301 == 25) {
            if (field336 == 1) {
                if (field346 > field347) {
                    field347 = field346;
                }
                int var17 = (field347 * 50 - field346 * 50) / field347;
                method565(class157.field2386 + class2.field25 + class2.field22 + var17 + "%" + class2.field20, false);
            } else if (field336 == 2) {
                if (field348 > field349) {
                    field349 = field348;
                }
                int var18 = (field349 * 50 - field348 * 50) / field349 + 50;
                method565(class157.field2386 + class2.field25 + class2.field22 + var18 + "%" + class2.field20, false);
            } else {
                method565(class157.field2386, false);
            }
        } else if (field301 == 30) {
            if (field413 != -1) {
                method2111(field413);
            }
            for (int var19 = 0; var19 < field493; var19++) {
                if (field495[var19]) {
                    field508[var19] = true;
                }
                field497[var19] = field495[var19];
                field495[var19] = false;
            }
            field323 = field303;
            field574 = -1;
            field439 = -1;
            Statics.field1600 = null;
            if (field413 != -1) {
                field493 = 0;
                method629(field413, 0, 0, Statics.field2114, Statics.field2638, 0, 0, -1);
            }
            class80.method1707();
            if (field430) {
                int var23 = Statics.field2643;
                int var24 = Statics.field3138;
                int var25 = Statics.field3046;
                int var26 = Statics.field1938;
                int var27 = 6116423;
                class80.method1670(var23, var24, var25, var26, var27);
                class80.method1670(var23 + 1, var24 + 1, var25 - 2, 16, 0);
                class80.method1703(var23 + 1, var24 + 18, var25 - 2, var26 - 19, 0);
                Statics.field1044.method3702(class157.field2446, var23 + 3, var24 + 14, var27, -1);
                int var28 = class140.field2131;
                int var29 = class140.field2132 * -1076088155;
                for (int var30 = 0; var30 < field571; var30++) {
                    int var31 = (field571 - 1 - var30) * 15 + var24 + 31;
                    int var32 = 16777215;
                    if (var28 > var23 && var28 < var23 + var25 && var29 > var31 - 13 && var29 < var31 + 3) {
                        var32 = 16776960;
                    }
                    Statics.field1044.method3702(method928(var30), var23 + 3, var31, var32, 0);
                }
                int var33 = Statics.field2643;
                int var34 = Statics.field3138;
                int var35 = Statics.field3046;
                int var36 = Statics.field1938;
                for (int var37 = 0; var37 < field493; var37++) {
                    if (field500[var37] + field498[var37] > var33 && field498[var37] < var33 + var35 && field507[var37] + field501[var37] > var34 && field507[var37] < var34 + var36) {
                        field508[var37] = true;
                    }
                }
            } else if (field574 != -1) {
                int var20 = field574;
                int var21 = field439;
                if (field571 >= 2 || field442 != 0 || field334) {
                    String var22;
                    if (field442 == 1 && field571 < 2) {
                        var22 = class157.field2443 + class157.field2453 + field443 + " " + class2.field21;
                    } else if (field334 && field571 < 2) {
                        var22 = field447 + class157.field2453 + field494 + " " + class2.field21;
                    } else {
                        var22 = method928(field571 - 1);
                    }
                    if (field571 > 2) {
                        var22 = var22 + class2.method2122(16777215) + " " + '/' + " " + (field571 - 2) + class157.field2447;
                    }
                    Statics.field1044.method3752(var22, var20 + 4, var21 + 15, 16777215, 0, field303 / 1000);
                }
            }
            if (field502 == 3) {
                for (int var38 = 0; var38 < field493; var38++) {
                    if (field497[var38]) {
                        class80.method1700(field498[var38], field507[var38], field500[var38], field501[var38], 16711935, 128);
                    } else if (field508[var38]) {
                        class80.method1700(field498[var38], field507[var38], field500[var38], field501[var38], 16711680, 128);
                    }
                }
            }
            int var39 = Statics.field27;
            int var40 = Statics.field677.field839;
            int var41 = Statics.field677.field803;
            int var42 = field367;
            for (class24 var43 = (class24) class24.field617.method3493(); var43 != null; var43 = (class24) class24.field617.method3495()) {
                if (var43.field610 != -1 || var43.field618 != null) {
                    int var44 = 0;
                    if (var40 > var43.field616) {
                        var44 += var40 - var43.field616;
                    } else if (var40 < var43.field608) {
                        var44 += var43.field608 - var40;
                    }
                    if (var41 > var43.field611) {
                        var44 += var41 - var43.field611;
                    } else if (var41 < var43.field613) {
                        var44 += var43.field613 - var41;
                    }
                    if (var44 - 64 > var43.field612 || field531 == 0 || var43.field609 != var39) {
                        if (var43.field614 != null) {
                            Statics.field1215.method1113(var43.field614);
                            var43.field614 = null;
                        }
                        if (var43.field619 != null) {
                            Statics.field1215.method1113(var43.field619);
                            var43.field619 = null;
                        }
                    } else {
                        var44 -= 64;
                        if (var44 < 0) {
                            var44 = 0;
                        }
                        int var45 = field531 * (var43.field612 - var44) / var43.field612;
                        class59 var10000;
                        if (var43.field614 != null) {
                            var43.field614.method1274(var45);
                        } else if (var43.field610 >= 0) {
                            var10000 = (class59) null;
                            class59 var46 = class59.method1203(Statics.field2977, var43.field610, 0);
                            if (var46 != null) {
                                class63 var47 = var46.method1204().method1245(Statics.field604);
                                class65 var48 = class65.method1389(var47, 100, var45);
                                var48.method1277(-1);
                                Statics.field1215.method1112(var48);
                                var43.field614 = var48;
                            }
                        }
                        if (var43.field619 != null) {
                            var43.field619.method1274(var45);
                            if (!var43.field619.method3592()) {
                                var43.field619 = null;
                            }
                        } else if (var43.field618 != null && (var43.field607 -= var42) <= 0) {
                            int var49 = (int) (Math.random() * (double) var43.field618.length);
                            var10000 = (class59) null;
                            class59 var50 = class59.method1203(Statics.field2977, var43.field618[var49], 0);
                            if (var50 != null) {
                                class63 var51 = var50.method1204().method1245(Statics.field604);
                                class65 var52 = class65.method1389(var51, 100, var45);
                                var52.method1277(0);
                                Statics.field1215.method1112(var52);
                                var43.field619 = var52;
                                var43.field607 = var43.field615 + (int) (Math.random() * (double) (var43.field606 - var43.field615));
                            }
                        }
                    }
                }
            }
            field367 = 0;
        } else if (field301 == 40) {
            method565(class157.field2426 + class2.field25 + class157.field2304, false);
        } else if (field301 == 45) {
            method565(class157.field2451, false);
        }
        if (field301 == 30 && field502 == 0 && !var6) {
            try {
                Graphics var53 = Statics.field252.getGraphics();
                for (int var54 = 0; var54 < field493; var54++) {
                    if (field508[var54]) {
                        Statics.field2119.method1513(var53, field498[var54], field507[var54], field500[var54], field501[var54]);
                        field508[var54] = false;
                    }
                }
            } catch (Exception var62) {
                Statics.field252.repaint();
            }
        } else if (field301 > 0) {
            try {
                Graphics var56 = Statics.field252.getGraphics();
                Statics.field2119.method1511(var56, 0, 0);
                for (int var57 = 0; var57 < field493; var57++) {
                    field508[var57] = false;
                }
            } catch (Exception var61) {
                Statics.field252.repaint();
            }
        }
    }

    @ObfuscatedName("client.q(I)V")
    public final void method246() {
        if (Statics.field480.method211()) {
            Statics.field480.method208();
        }
        if (Statics.field2003 != null) {
            Statics.field2003.field209 = false;
        }
        Statics.field2003 = null;
        if (Statics.field154 != null) {
            Statics.field154.method2794();
            Statics.field154 = null;
        }
        if (class137.field2096 != null) {
            class137 var1 = class137.field2096;
            synchronized (class137.field2096) {
                class137.field2096 = null;
            }
        }
        class140.method108();
        Statics.field707 = null;
        if (Statics.field1607 != null) {
            Statics.field1607.method1177();
        }
        if (Statics.field2927 != null) {
            Statics.field2927.method1177();
        }
        if (Statics.field2700 != null) {
            Statics.field2700.method2794();
        }
        Object var3 = class170.field2686;
        synchronized (class170.field2686) {
            if (class170.field2685 != 0) {
                class170.field2685 = 1;
                try {
                    class170.field2686.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        class149.method589();
    }

    @ObfuscatedName("k.m(II)V")
    public static void method139(int arg0) {
        if (field301 == arg0) {
            return;
        }
        if (field301 == 0) {
            Statics.field2243 = null;
            Statics.field1621 = null;
            Statics.field1558 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field325 = 0;
            field326 = 0;
            field327 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1395 != null) {
            Statics.field1395.method2794();
            Statics.field1395 = null;
        }
        if (field301 == 25) {
            field336 = 0;
            field346 = 0;
            field347 = 1;
            field348 = 0;
            field349 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method3152(Statics.field252, Statics.field7, Statics.field1102, true, 0);
        } else if (arg0 == 20) {
            class32.method3152(Statics.field252, Statics.field7, Statics.field1102, true, field301 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method3152(Statics.field252, Statics.field7, Statics.field1102, false, 4);
        } else if (Statics.field731) {
            Statics.field715 = null;
            Statics.field2639 = null;
            Statics.field1750 = null;
            Statics.field3142 = null;
            Statics.field1219 = null;
            Statics.field2170 = null;
            Statics.field716 = null;
            Statics.field717 = null;
            Statics.field718 = null;
            Statics.field199 = null;
            Statics.field1023 = null;
            Statics.field1348 = null;
            Statics.field1047 = null;
            Statics.field3192 = null;
            Statics.field705 = null;
            Statics.field186 = null;
            Statics.field678 = null;
            Statics.field1382 = null;
            Statics.field622 = null;
            Statics.field70 = null;
            Statics.field1393 = null;
            Statics.field2895 = null;
            class183.method553(2);
            class171.method1749(true);
            Statics.field731 = false;
        }
        field301 = arg0;
    }

    @ObfuscatedName("client.n(I)V")
    public void method247() {
        if (field301 == 1000) {
            return;
        }
        long var1 = class115.method671();
        int var3 = (int) (var1 - Statics.field2690);
        Statics.field2690 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class171.field2709 += var3;
        boolean var4;
        if (class171.field2705 == 0 && class171.field2710 == 0 && class171.field2697 == 0 && class171.field2692 == 0) {
            var4 = true;
        } else if (Statics.field2700 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class171.field2709 > 30000) {
                        throw new IOException();
                    }
                    while (class171.field2710 < 20 && class171.field2692 > 0) {
                        class172 var5 = (class172) class171.field2691.method3461();
                        class119 var6 = new class119(4);
                        var6.method2354(1);
                        var6.method2494((int) var5.field3091);
                        Statics.field2700.method2789(var6.field1974, 0, 4);
                        class171.field2688.method3460(var5, var5.field3091);
                        class171.field2692--;
                        class171.field2710++;
                    }
                    while (class171.field2705 < 20 && class171.field2697 > 0) {
                        class172 var7 = (class172) class171.field2699.method3546();
                        class119 var8 = new class119(4);
                        var8.method2354(0);
                        var8.method2494((int) var7.field3091);
                        Statics.field2700.method2789(var8.field1974, 0, 4);
                        var7.method3561();
                        class171.field2698.method3460(var7, var7.field3091);
                        class171.field2697--;
                        class171.field2705++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2700.method2807();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class171.field2709 = 0;
                        byte var11 = 0;
                        if (Statics.field2051 == null) {
                            var11 = 8;
                        } else if (class171.field2702 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class171.field2701.field1973;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2700.method2792(class171.field2701.field1974, class171.field2701.field1973, var12);
                            if (class171.field2693 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class171.field2701.field1974[class171.field2701.field1973 + var13] ^= class171.field2693;
                                }
                            }
                            class171.field2701.field1973 += var12;
                            if (class171.field2701.field1973 < var11) {
                                break;
                            }
                            if (Statics.field2051 == null) {
                                class171.field2701.field1973 = 0;
                                int var14 = class171.field2701.method2326();
                                int var15 = class171.field2701.method2525();
                                int var16 = class171.field2701.method2326();
                                int var17 = class171.field2701.method2331();
                                long var18 = (long) ((var14 << 16) + var15);
                                class172 var20 = (class172) class171.field2688.method3459(var18);
                                Statics.field2695 = true;
                                if (var20 == null) {
                                    var20 = (class172) class171.field2698.method3459(var18);
                                    Statics.field2695 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2051 = var20;
                                Statics.field2591 = new class119(var17 + var21 + Statics.field2051.field2715);
                                Statics.field2591.method2354(var16);
                                Statics.field2591.method2423(var17);
                                class171.field2702 = 8;
                                class171.field2701.field1973 = 0;
                            } else if (class171.field2702 == 0) {
                                if (class171.field2701.field1974[0] == -1) {
                                    class171.field2702 = 1;
                                    class171.field2701.field1973 = 0;
                                } else {
                                    Statics.field2051 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2591.field1974.length - Statics.field2051.field2715;
                            int var23 = 512 - class171.field2702;
                            if (var23 > var22 - Statics.field2591.field1973) {
                                var23 = var22 - Statics.field2591.field1973;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2700.method2792(Statics.field2591.field1974, Statics.field2591.field1973, var23);
                            if (class171.field2693 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2591.field1974[Statics.field2591.field1973 + var24] ^= class171.field2693;
                                }
                            }
                            Statics.field2591.field1973 += var23;
                            class171.field2702 += var23;
                            if (Statics.field2591.field1973 == var22) {
                                if (Statics.field2051.field3091 == 16711935L) {
                                    Statics.field148 = Statics.field2591;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class168 var26 = class171.field2704[var25];
                                        if (var26 != null) {
                                            Statics.field148.field1973 = var25 * 8 + 5;
                                            int var27 = Statics.field148.method2331();
                                            int var28 = Statics.field148.method2331();
                                            var26.method3069(var27, var28);
                                        }
                                    }
                                } else {
                                    class171.field2703.reset();
                                    class171.field2703.update(Statics.field2591.field1974, 0, var22);
                                    int var29 = (int) class171.field2703.getValue();
                                    if (Statics.field2051.field2712 != var29) {
                                        try {
                                            Statics.field2700.method2794();
                                        } catch (Exception var35) {
                                        }
                                        class171.field2706++;
                                        Statics.field2700 = null;
                                        class171.field2693 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class171.field2706 = 0;
                                    class171.field2707 = 0;
                                    Statics.field2051.field2716.method3072((int) (Statics.field2051.field3091 & 0xFFFFL), Statics.field2591.field1974, (Statics.field2051.field3091 & 0xFF0000L) == 16711680L, Statics.field2695);
                                }
                                Statics.field2051.method3588();
                                if (Statics.field2695) {
                                    class171.field2710--;
                                } else {
                                    class171.field2705--;
                                }
                                class171.field2702 = 0;
                                Statics.field2051 = null;
                                Statics.field2591 = null;
                            } else {
                                if (class171.field2702 != 512) {
                                    break;
                                }
                                class171.field2702 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2700.method2794();
                } catch (Exception var34) {
                }
                class171.field2707++;
                Statics.field2700 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method441();
        }
    }

    @ObfuscatedName("client.k(I)V")
    public void method441() {
        if (class171.field2706 >= 4) {
            this.method2821("js5crc");
            field301 = 1000;
            return;
        }
        if (class171.field2707 >= 4) {
            if (field301 <= 5) {
                this.method2821("js5io");
                field301 = 1000;
                return;
            }
            field490 = 3000;
            class171.field2707 = 3;
        }
        if (--field490 + 1 > 0) {
            return;
        }
        try {
            if (field568 == 0) {
                Statics.field1524 = Statics.field1981.method2680(Statics.field185, Statics.field623);
                field568++;
            }
            if (field568 == 1) {
                if (Statics.field1524.field2198 == 2) {
                    this.method383(-1);
                    return;
                }
                if (Statics.field1524.field2198 == 1) {
                    field568++;
                }
            }
            if (field568 == 2) {
                Statics.field1787 = new class143((Socket) Statics.field1524.field2202, Statics.field1981);
                class119 var1 = new class119(5);
                var1.method2354(15);
                var1.method2423(94);
                Statics.field1787.method2789(var1.field1974, 0, 5);
                field568++;
                Statics.field2262 = class115.method671();
            }
            if (field568 == 3) {
                if (field301 <= 5 || Statics.field1787.method2807() > 0) {
                    int var2 = Statics.field1787.method2790();
                    if (var2 != 0) {
                        this.method383(var2);
                        return;
                    }
                    field568++;
                } else if (class115.method671() - Statics.field2262 > 30000L) {
                    this.method383(-2);
                    return;
                }
            }
            if (field568 == 4) {
                class171.method1507(Statics.field1787, field301 > 20);
                Statics.field1524 = null;
                Statics.field1787 = null;
                field568 = 0;
                field324 = 0;
            }
        } catch (IOException var4) {
            this.method383(-3);
        }
    }

    @ObfuscatedName("client.o(IS)V")
    public void method383(int arg0) {
        Statics.field1524 = null;
        Statics.field1787 = null;
        field568 = 0;
        if (Statics.field623 == Statics.field272) {
            Statics.field623 = Statics.field287;
        } else {
            Statics.field623 = Statics.field272;
        }
        field324++;
        if (field324 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field301 <= 5) {
                this.method2821("js5connect_full");
                field301 = 1000;
            } else {
                field490 = 3000;
            }
        } else if (field324 >= 2 && arg0 == 6) {
            this.method2821("js5connect_outofdate");
            field301 = 1000;
        } else if (field324 >= 4) {
            if (field301 <= 5) {
                this.method2821("js5connect");
                field301 = 1000;
            } else {
                field490 = 3000;
            }
        }
    }

    @ObfuscatedName("d.f(I)V")
    public static void method8() {
        if (field321 == 0) {
            Statics.field2038 = new class86(4, 104, 104, class6.field86);
            for (int var0 = 0; var0 < 4; var0++) {
                field389[var0] = new class108(104, 104);
            }
            Statics.field1652 = new class79(512, 512);
            class32.field728 = class157.field2305;
            class32.field714 = 5;
            field321 = 20;
        } else if (field321 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class91.field1566[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class86.method1838(var1, 500, 800, 512, 334);
            class32.field728 = class157.field2306;
            class32.field714 = 10;
            field321 = 30;
        } else if (field321 == 30) {
            Statics.field2227 = method2705(0, false, true, true);
            Statics.field2167 = method2705(1, false, true, true);
            Statics.field3141 = method2705(2, true, false, true);
            Statics.field3206 = method2705(3, false, true, true);
            Statics.field2977 = method2705(4, false, true, true);
            Statics.field92 = method2705(5, true, true, true);
            Statics.field767 = method2705(6, true, true, false);
            Statics.field174 = method2705(7, false, true, true);
            Statics.field1102 = method2705(8, false, true, true);
            Statics.field1024 = method2705(9, false, true, true);
            Statics.field7 = method2705(10, false, true, true);
            Statics.field1379 = method2705(11, false, true, true);
            Statics.field2221 = method2705(12, false, true, true);
            Statics.field300 = method2705(13, true, false, true);
            Statics.field73 = method2705(14, false, true, false);
            Statics.field3154 = method2705(15, false, true, true);
            class32.field728 = class157.field2508;
            class32.field714 = 20;
            field321 = 40;
        } else if (field321 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2227.method3070() * 4 / 100;
            int var8 = var7 + Statics.field2167.method3070() * 4 / 100;
            int var9 = var8 + Statics.field3141.method3070() * 2 / 100;
            int var10 = var9 + Statics.field3206.method3070() * 2 / 100;
            int var11 = var10 + Statics.field2977.method3070() * 6 / 100;
            int var12 = var11 + Statics.field92.method3070() * 4 / 100;
            int var13 = var12 + Statics.field767.method3070() * 2 / 100;
            int var14 = var13 + Statics.field174.method3070() * 60 / 100;
            int var15 = var14 + Statics.field1102.method3070() * 2 / 100;
            int var16 = var15 + Statics.field1024.method3070() * 2 / 100;
            int var17 = var16 + Statics.field7.method3070() * 2 / 100;
            int var18 = var17 + Statics.field1379.method3070() * 2 / 100;
            int var19 = var18 + Statics.field2221.method3070() * 2 / 100;
            int var20 = var19 + Statics.field300.method3070() * 2 / 100;
            int var21 = var20 + Statics.field73.method3070() * 2 / 100;
            int var22 = var21 + Statics.field3154.method3070() * 2 / 100;
            if (var22 == 100) {
                class32.field728 = class157.field2309;
                class32.field714 = 30;
                field321 = 45;
            } else {
                if (var22 != 0) {
                    class32.field728 = class157.field2308 + var22 + "%";
                }
                class32.field714 = 30;
            }
        } else if (field321 == 45) {
            class57.method36(22050, !field429, 2);
            class184 var23 = new class184();
            var23.method3314(9, 128);
            Statics.field1607 = class57.method6(Statics.field1981, Statics.field252, 0, 22050);
            Statics.field1607.method1154(var23);
            class183.method103(Statics.field3154, Statics.field73, Statics.field2977, var23);
            Statics.field2927 = class57.method6(Statics.field1981, Statics.field252, 1, 2048);
            Statics.field1215 = new class56();
            Statics.field2927.method1154(Statics.field1215);
            Statics.field604 = new class75(22050, Statics.field2644);
            class32.field728 = class157.field2310;
            class32.field714 = 35;
            field321 = 50;
        } else if (field321 == 50) {
            int var24 = 0;
            if (Statics.field2278 == null) {
                class168 var25 = Statics.field1102;
                class168 var26 = Statics.field300;
                int var27 = var25.method3005("p11_full");
                int var28 = var25.method3012(var27, "");
                class224 var29;
                if (class77.method994(var25, var27, var28)) {
                    var29 = class77.method622(var26.method3045(var27, var28));
                } else {
                    var29 = null;
                }
                Statics.field2278 = var29;
            } else {
                var24++;
            }
            if (Statics.field143 == null) {
                class168 var31 = Statics.field1102;
                class168 var32 = Statics.field300;
                int var33 = var31.method3005("p12_full");
                int var34 = var31.method3012(var33, "");
                class224 var35;
                if (class77.method994(var31, var33, var34)) {
                    var35 = class77.method622(var32.method3045(var33, var34));
                } else {
                    var35 = null;
                }
                Statics.field143 = var35;
            } else {
                var24++;
            }
            if (Statics.field1044 == null) {
                class168 var37 = Statics.field1102;
                class168 var38 = Statics.field300;
                int var39 = var37.method3005("b12_full");
                int var40 = var37.method3012(var39, "");
                class224 var41;
                if (class77.method994(var37, var39, var40)) {
                    var41 = class77.method622(var38.method3045(var39, var40));
                } else {
                    var41 = null;
                }
                Statics.field1044 = var41;
            } else {
                var24++;
            }
            if (var24 < 3) {
                class32.field728 = class157.field2311 + var24 * 100 / 3 + "%";
                class32.field714 = 40;
            } else {
                Statics.field234 = new class160(true);
                class32.field728 = class157.field2449;
                class32.field714 = 40;
                field321 = 60;
            }
        } else if (field321 == 60) {
            int var43 = class32.method140(Statics.field7, Statics.field1102);
            int var44 = class32.method185();
            if (var43 < var44) {
                class32.field728 = class157.field2519 + var43 * 100 / var44 + "%";
                class32.field714 = 50;
            } else {
                class32.field728 = class157.field2314;
                class32.field714 = 50;
                method139(5);
                field321 = 70;
            }
        } else if (field321 == 70) {
            if (Statics.field3141.method3000()) {
                class168 var45 = Statics.field3141;
                Statics.field1057 = var45;
                class42.method737(Statics.field3141);
                class168 var46 = Statics.field3141;
                class168 var47 = Statics.field174;
                Statics.field1038 = var46;
                Statics.field1026 = var47;
                Statics.field1035 = Statics.field1038.method3050(3);
                class168 var48 = Statics.field3141;
                class168 var49 = Statics.field174;
                boolean var50 = field429;
                Statics.field3188 = var48;
                Statics.field915 = var49;
                class41.field954 = var50;
                class168 var51 = Statics.field3141;
                class168 var52 = Statics.field174;
                Statics.field875 = var51;
                Statics.field872 = var52;
                class52.method43(Statics.field3141, Statics.field174, field296, Statics.field2278);
                class168 var53 = Statics.field3141;
                class168 var54 = Statics.field2227;
                class168 var55 = Statics.field2167;
                Statics.field988 = var53;
                Statics.field980 = var54;
                Statics.field585 = var55;
                Statics.method2600(Statics.field3141, Statics.field174);
                class168 var56 = Statics.field3141;
                Statics.field1072 = var56;
                class168 var57 = Statics.field3141;
                Statics.field1160 = var57;
                Statics.field1165 = Statics.field1160.method3050(16);
                class168 var58 = Statics.field3206;
                class168 var59 = Statics.field174;
                class168 var60 = Statics.field1102;
                class168 var61 = Statics.field300;
                Statics.field2720 = var58;
                Statics.field1045 = var59;
                Statics.field1358 = var60;
                Statics.field778 = var61;
                Statics.field2745 = new class173[Statics.field2720.method3007()][];
                Statics.field2811 = new boolean[Statics.field2720.method3007()];
                class51.method882(Statics.field3141);
                class49.method867(Statics.field3141);
                class168 var62 = Statics.field3141;
                Statics.field1043 = var62;
                class50.method2626(Statics.field3141);
                Statics.field480 = new class20();
                class32.field728 = class157.field2326;
                class32.field714 = 60;
                field321 = 80;
            } else {
                class32.field728 = class157.field2315 + Statics.field3141.method3074() + "%";
                class32.field714 = 60;
            }
        } else if (field321 == 80) {
            int var63 = 0;
            if (Statics.field233 == null) {
                Statics.field233 = class77.method1161(Statics.field1102, "compass", "");
            } else {
                var63++;
            }
            if (Statics.field227 == null) {
                Statics.field227 = class77.method1161(Statics.field1102, "mapedge", "");
            } else {
                var63++;
            }
            if (Statics.field124 == null) {
                Statics.field124 = class77.method195(Statics.field1102, "mapscene", "");
            } else {
                var63++;
            }
            if (Statics.field1083 == null) {
                Statics.field1083 = class77.method2569(Statics.field1102, "mapfunction", "");
            } else {
                var63++;
            }
            if (Statics.field1037 == null) {
                Statics.field1037 = class77.method2569(Statics.field1102, "hitmarks", "");
            } else {
                var63++;
            }
            if (Statics.field57 == null) {
                Statics.field57 = class77.method2569(Statics.field1102, "headicons_pk", "");
            } else {
                var63++;
            }
            if (Statics.field2043 == null) {
                Statics.field2043 = class77.method2569(Statics.field1102, "headicons_prayer", "");
            } else {
                var63++;
            }
            if (Statics.field3029 == null) {
                Statics.field3029 = class77.method2569(Statics.field1102, "headicons_hint", "");
            } else {
                var63++;
            }
            if (Statics.field1222 == null) {
                Statics.field1222 = class77.method2569(Statics.field1102, "mapmarker", "");
            } else {
                var63++;
            }
            if (Statics.field2156 == null) {
                Statics.field2156 = class77.method2569(Statics.field1102, "cross", "");
            } else {
                var63++;
            }
            if (Statics.field2019 == null) {
                Statics.field2019 = class77.method2569(Statics.field1102, "mapdots", "");
            } else {
                var63++;
            }
            if (Statics.field251 == null) {
                Statics.field251 = class77.method195(Statics.field1102, "scrollbar", "");
            } else {
                var63++;
            }
            if (Statics.field647 == null) {
                Statics.field647 = class77.method195(Statics.field1102, "mod_icons", "");
            } else {
                var63++;
            }
            if (var63 < 13) {
                class32.field728 = class157.field2317 + var63 * 100 / 13 + "%";
                class32.field714 = 70;
            } else {
                Statics.field3169 = Statics.field647;
                Statics.field227.method1577();
                int var64 = (int) (Math.random() * 21.0D) - 10;
                int var65 = (int) (Math.random() * 21.0D) - 10;
                int var66 = (int) (Math.random() * 21.0D) - 10;
                int var67 = (int) (Math.random() * 41.0D) - 20;
                for (int var68 = 0; var68 < Statics.field1083.length; var68++) {
                    Statics.field1083[var68].method1606(var64 + var67, var65 + var67, var66 + var67);
                }
                Statics.field124[0].method1723(var64 + var67, var65 + var67, var66 + var67);
                class32.field728 = class157.field2318;
                class32.field714 = 70;
                field321 = 90;
            }
        } else if (field321 == 90) {
            if (Statics.field1024.method3000()) {
                class95 var69 = new class95(Statics.field1024, Statics.field1102, 20, 0.8D, field429 ? 64 : 128);
                class91.method1935(var69);
                class91.method1943(0.8D);
                class32.field728 = class157.field2438;
                class32.field714 = 90;
                field321 = 110;
            } else {
                class32.field728 = class157.field2485 + Statics.field1024.method3074() + "%";
                class32.field714 = 90;
            }
        } else if (field321 == 110) {
            Statics.field2003 = new class14();
            Statics.field1981.method2689(Statics.field2003, 10);
            class32.field728 = class157.field2478;
            class32.field714 = 94;
            field321 = 120;
        } else if (field321 == 120) {
            if (Statics.field7.method3014("huffman", "")) {
                class113 var70 = new class113(Statics.field7.method3013("huffman", ""));
                class222.method810(var70);
                class32.field728 = class157.field2400;
                class32.field714 = 96;
                field321 = 130;
            } else {
                class32.field728 = class157.field2322 + "%";
                class32.field714 = 96;
            }
        } else if (field321 == 130) {
            if (!Statics.field3206.method3000()) {
                class32.field728 = class157.field2324 + Statics.field3206.method3074() * 4 / 5 + "%";
                class32.field714 = 100;
            } else if (!Statics.field2221.method3000()) {
                class32.field728 = class157.field2324 + (80 + Statics.field2221.method3074() / 6) + "%";
                class32.field714 = 100;
            } else if (Statics.field300.method3000()) {
                class32.field728 = class157.field2325;
                class32.field714 = 100;
                field321 = 140;
            } else {
                class32.field728 = class157.field2324 + (96 + Statics.field300.method3074() / 20) + "%";
                class32.field714 = 100;
            }
        } else if (field321 == 140) {
            method139(10);
        }
    }

    @ObfuscatedName("es.s(IZZZI)Lfy;")
    public static class168 method2705(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class134 var4 = null;
        if (class149.field2218 != null) {
            var4 = new class134(arg0, class149.field2218, Statics.field2626[arg0], 1000000);
        }
        return new class168(var4, Statics.field1380, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("q.z(I)V")
    public static final void method111() {
        try {
            if (field325 == 0) {
                if (Statics.field154 != null) {
                    Statics.field154.method2794();
                    Statics.field154 = null;
                }
                Statics.field910 = null;
                field345 = false;
                field326 = 0;
                field325 = 1;
            }
            if (field325 == 1) {
                if (Statics.field910 == null) {
                    Statics.field910 = Statics.field1981.method2680(Statics.field185, Statics.field623);
                }
                if (Statics.field910.field2198 == 2) {
                    throw new IOException();
                }
                if (Statics.field910.field2198 == 1) {
                    Statics.field154 = new class143((Socket) Statics.field910.field2202, Statics.field1981);
                    Statics.field910 = null;
                    field325 = 2;
                }
            }
            if (field325 == 2) {
                field337.field1973 = 0;
                field337.method2354(14);
                Statics.field154.method2789(field337.field1974, 0, 1);
                field535.field1973 = 0;
                field325 = 3;
            }
            if (field325 == 3) {
                if (Statics.field1607 != null) {
                    Statics.field1607.method1156();
                }
                if (Statics.field2927 != null) {
                    Statics.field2927.method1156();
                }
                int var0 = Statics.field154.method2790();
                if (Statics.field1607 != null) {
                    Statics.field1607.method1156();
                }
                if (Statics.field2927 != null) {
                    Statics.field2927.method1156();
                }
                if (var0 != 0) {
                    method2010(var0);
                    return;
                }
                field535.field1973 = 0;
                field325 = 5;
            }
            if (field325 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field337.field1973 = 0;
                field337.method2354(1);
                field337.method2354(class32.field735.method557());
                field337.method2423(var1[0]);
                field337.method2423(var1[1]);
                field337.method2423(var1[2]);
                field337.method2423(var1[3]);
                switch(class32.field735.field2575) {
                    case 0:
                        field337.method2423((Integer) Statics.field1549.field147.get(class163.method614(class32.field733)));
                        field337.field1973 += 4;
                        break;
                    case 1:
                        field337.field1973 += 8;
                        break;
                    case 2:
                    case 3:
                        field337.method2494(Statics.field2258);
                        field337.field1973 += 5;
                }
                field337.method2372(class32.field734);
                field337.method2346(class5.field66, class5.field76);
                field335.field1973 = 0;
                if (field301 == 40) {
                    field335.method2354(18);
                } else {
                    field335.method2354(16);
                }
                field335.method2312(0);
                int var2 = field335.field1973;
                field335.method2423(94);
                field335.method2311(field337.field1974, 0, field337.field1973);
                int var3 = field335.field1973;
                field335.method2372(class32.field733);
                field335.method2354((field504 ? 1 : 0) << 1 | (field429 ? 1 : 0));
                field335.method2312(Statics.field2114);
                field335.method2312(Statics.field2638);
                class149.method1567(field335);
                field335.method2372(Statics.field2028);
                field335.method2423(Statics.field299);
                class119 var4 = new class119(Statics.field234.method2917());
                Statics.field234.method2918(var4);
                field335.method2311(var4.field1974, 0, var4.field1974.length);
                field335.method2354(Statics.field499);
                field335.method2423(Statics.field2227.field2657);
                field335.method2423(Statics.field2167.field2657);
                field335.method2423(Statics.field3141.field2657);
                field335.method2423(Statics.field3206.field2657);
                field335.method2423(Statics.field2977.field2657);
                field335.method2423(Statics.field92.field2657);
                field335.method2423(Statics.field767.field2657);
                field335.method2423(Statics.field174.field2657);
                field335.method2423(Statics.field1102.field2657);
                field335.method2423(Statics.field1024.field2657);
                field335.method2423(Statics.field7.field2657);
                field335.method2423(Statics.field1379.field2657);
                field335.method2423(Statics.field2221.field2657);
                field335.method2423(Statics.field300.field2657);
                field335.method2423(Statics.field73.field2657);
                field335.method2423(Statics.field3154.field2657);
                field335.method2344(var1, var3, field335.field1973);
                field335.method2477(field335.field1973 - var2);
                Statics.field154.method2789(field335.field1974, 0, field335.field1973);
                field337.method2573(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field535.method2573(var1);
                field325 = 6;
            }
            if (field325 == 6 && Statics.field154.method2807() > 0) {
                int var6 = Statics.field154.method2790();
                if (var6 == 21 && field301 == 20) {
                    field325 = 7;
                } else if (var6 == 2) {
                    field325 = 9;
                } else if (var6 == 15 && field301 == 40) {
                    field396 = -1;
                    field325 = 13;
                } else if (var6 == 23 && field327 < 1) {
                    field327++;
                    field325 = 0;
                } else if (var6 == 29) {
                    field325 = 11;
                } else {
                    method2010(var6);
                    return;
                }
            }
            if (field325 == 7 && Statics.field154.method2807() > 0) {
                field328 = (Statics.field154.method2790() + 3) * 60;
                field325 = 8;
            }
            if (field325 == 8) {
                field326 = 0;
                class32.method718(class157.field2293, class157.field2491, field328 / 60 + class157.field2475);
                if (--field328 <= 0) {
                    field325 = 0;
                }
            } else {
                if (field325 == 9 && Statics.field154.method2807() >= 13) {
                    boolean var7 = Statics.field154.method2790() == 1;
                    Statics.field154.method2792(field535.field1974, 0, 4);
                    field535.field1973 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field535.method2575() << 24;
                        int var10 = var9 | field535.method2575() << 16;
                        int var11 = var10 | field535.method2575() << 8;
                        int var12 = var11 | field535.method2575();
                        int var13 = class163.method614(class32.field733);
                        if (Statics.field1549.field147.size() >= 10 && !Statics.field1549.field147.containsKey(var13)) {
                            Iterator var14 = Statics.field1549.field147.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field1549.field147.put(var13, var12);
                        class9.method38();
                    }
                    field295 = Statics.field154.method2790();
                    field306 = Statics.field154.method2790() == 1;
                    field373 = Statics.field154.method2790();
                    field373 <<= 0x8;
                    field373 += Statics.field154.method2790();
                    field414 = Statics.field154.method2790();
                    Statics.field154.method2792(field535.field1974, 0, 1);
                    field535.field1973 = 0;
                    field388 = field535.method2575();
                    Statics.field154.method2792(field535.field1974, 0, 2);
                    field535.field1973 = 0;
                    field396 = field535.method2525();
                    if (field414 == 1) {
                        try {
                            class132.method2650(Statics.field291, "zap");
                        } catch (Throwable var43) {
                        }
                    } else {
                        try {
                            class132.method2650(Statics.field291, "unzap");
                        } catch (Throwable var42) {
                        }
                    }
                    field325 = 10;
                }
                if (field325 != 10) {
                    if (field325 == 11 && Statics.field154.method2807() >= 2) {
                        field535.field1973 = 0;
                        Statics.field154.method2792(field535.field1974, 0, 2);
                        field535.field1973 = 0;
                        Statics.field152 = field535.method2525();
                        field325 = 12;
                    }
                    if (field325 == 12 && Statics.field154.method2807() >= Statics.field152) {
                        field535.field1973 = 0;
                        Statics.field154.method2792(field535.field1974, 0, Statics.field152);
                        field535.field1973 = 0;
                        String var31 = field535.method2334();
                        String var32 = field535.method2334();
                        String var33 = field535.method2334();
                        class32.method718(var31, var32, var33);
                        method139(10);
                    }
                    if (field325 == 13) {
                        if (field396 == -1) {
                            if (Statics.field154.method2807() < 2) {
                                return;
                            }
                            Statics.field154.method2792(field535.field1974, 0, 2);
                            field535.field1973 = 0;
                            field396 = field535.method2525();
                        }
                        if (Statics.field154.method2807() >= field396) {
                            Statics.field154.method2792(field535.field1974, 0, field396);
                            field535.field1973 = 0;
                            int var34 = field396;
                            field337.field1973 = 0;
                            field535.field1973 = 0;
                            field388 = -1;
                            field341 = -1;
                            field425 = -1;
                            field452 = -1;
                            field396 = 0;
                            field309 = 0;
                            field548 = 0;
                            field571 = 0;
                            field430 = false;
                            field526 = 0;
                            field460 = 0;
                            for (int var35 = 0; var35 < 2048; var35++) {
                                field412[var35] = null;
                            }
                            Statics.field677 = null;
                            for (int var36 = 0; var36 < field415.length; var36++) {
                                class35 var37 = field415[var36];
                                if (var37 != null) {
                                    var37.field827 = -1;
                                    var37.field828 = false;
                                }
                            }
                            class16.method612();
                            method139(30);
                            for (int var38 = 0; var38 < 100; var38++) {
                                field495[var38] = true;
                            }
                            field337.method2574(221);
                            class122 var39 = field337;
                            int var40 = field504 ? 2 : 1;
                            var39.method2354(var40);
                            field337.method2312(Statics.field2114);
                            field337.method2312(Statics.field2638);
                            class33.method588(field535);
                            if (field535.field1973 != var34) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field326++;
                        if (field326 > 2000) {
                            if (field327 < 1) {
                                if (Statics.field623 == Statics.field272) {
                                    Statics.field623 = Statics.field287;
                                } else {
                                    Statics.field623 = Statics.field272;
                                }
                                field327++;
                                field325 = 0;
                            } else {
                                method2010(-3);
                            }
                        }
                    }
                } else if (Statics.field154.method2807() >= field396) {
                    field535.field1973 = 0;
                    Statics.field154.method2792(field535.field1974, 0, field396);
                    field304 = 1L;
                    field307 = -1;
                    Statics.field2003.field202 = 0;
                    Statics.field255 = true;
                    field308 = true;
                    field516 = -1L;
                    class211.method3087();
                    field337.field1973 = 0;
                    field535.field1973 = 0;
                    field388 = -1;
                    field341 = -1;
                    field425 = -1;
                    field452 = -1;
                    field309 = 0;
                    field548 = 0;
                    field344 = 0;
                    field311 = 0;
                    field571 = 0;
                    field430 = false;
                    class140.method194(0);
                    class12.method2025();
                    field442 = 0;
                    field334 = false;
                    field550 = 0;
                    field355 = (int) (Math.random() * 100.0D) - 50;
                    field297 = (int) (Math.random() * 110.0D) - 55;
                    field454 = (int) (Math.random() * 80.0D) - 40;
                    field456 = (int) (Math.random() * 120.0D) - 60;
                    field364 = (int) (Math.random() * 30.0D) - 20;
                    field375 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field526 = 0;
                    field519 = -1;
                    field460 = 0;
                    field525 = 0;
                    field320 = class21.field581;
                    field457 = 0;
                    class33.field750 = 0;
                    for (int var17 = 0; var17 < 2048; var17++) {
                        class33.field754[var17] = null;
                        class33.field745[var17] = 1;
                    }
                    for (int var18 = 0; var18 < 2048; var18++) {
                        field412[var18] = null;
                    }
                    for (int var19 = 0; var19 < 32768; var19++) {
                        field415[var19] = null;
                    }
                    field421 = -1;
                    field424.method3487();
                    field483.method3487();
                    for (int var20 = 0; var20 < 4; var20++) {
                        for (int var21 = 0; var21 < 104; var21++) {
                            for (int var22 = 0; var22 < 104; var22++) {
                                field422[var20][var21][var22] = null;
                            }
                        }
                    }
                    field423 = new class199();
                    field559 = 0;
                    field419 = 0;
                    field562 = 0;
                    for (int var23 = 0; var23 < Statics.field1165; var23++) {
                        class53 var24 = class53.method39(var23);
                        if (var24 != null) {
                            class176.field2872[var23] = 0;
                            class176.field2875[var23] = 0;
                        }
                    }
                    Statics.field480.method206();
                    field558 = -1;
                    if (field413 != -1) {
                        class173.method2634(field413);
                    }
                    for (class4 var25 = (class4) field450.method3461(); var25 != null; var25 = (class4) field450.method3462()) {
                        method109(var25, true);
                    }
                    field413 = -1;
                    field450 = new class196(8);
                    field453 = null;
                    field430 = false;
                    field571 = 0;
                    field465.method3190((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var26 = 0; var26 < 8; var26++) {
                        field418[var26] = null;
                        field547[var26] = false;
                    }
                    class16.method612();
                    field302 = true;
                    for (int var27 = 0; var27 < 100; var27++) {
                        field495[var27] = true;
                    }
                    field337.method2574(221);
                    class122 var28 = field337;
                    int var29 = field504 ? 2 : 1;
                    var28.method2354(var29);
                    field337.method2312(Statics.field2114);
                    field337.method2312(Statics.field2638);
                    field517 = null;
                    Statics.field1543 = 0;
                    Statics.field179 = null;
                    for (int var30 = 0; var30 < 8; var30++) {
                        field567[var30] = new class220();
                    }
                    Statics.field68 = null;
                    class33.method588(field535);
                    Statics.field24 = -1;
                    method696(false);
                    field388 = -1;
                }
            }
        } catch (IOException var44) {
            if (field327 < 1) {
                if (Statics.field623 == Statics.field272) {
                    Statics.field623 = Statics.field287;
                } else {
                    Statics.field623 = Statics.field272;
                }
                field327++;
                field325 = 0;
            } else {
                method2010(-2);
            }
        }
    }

    @ObfuscatedName("cq.b(IB)V")
    public static void method2010(int arg0) {
        if (arg0 == -3) {
            class32.method718(class157.field2319, class157.field2333, class157.field2334);
        } else if (arg0 == -2) {
            class32.method718(class157.field2335, class157.field2336, class157.field2337);
        } else if (arg0 == -1) {
            class32.method718(class157.field2338, class157.field2339, class157.field2340);
        } else if (arg0 == 3) {
            class32.method718(class157.field2341, class157.field2342, class157.field2343);
        } else if (arg0 == 4) {
            class32.method718(class157.field2344, class157.field2345, class157.field2346);
        } else if (arg0 == 5) {
            class32.method718(class157.field2347, class157.field2460, class157.field2414);
        } else if (arg0 == 6) {
            class32.method718(class157.field2350, class157.field2351, class157.field2416);
        } else if (arg0 == 7) {
            class32.method718(class157.field2353, class157.field2354, class157.field2355);
        } else if (arg0 == 8) {
            class32.method718(class157.field2356, class157.field2357, class157.field2358);
        } else if (arg0 == 9) {
            class32.method718(class157.field2376, class157.field2529, class157.field2464);
        } else if (arg0 == 10) {
            class32.method718(class157.field2362, class157.field2363, class157.field2330);
        } else if (arg0 == 11) {
            class32.method718(class157.field2365, class157.field2523, class157.field2367);
        } else if (arg0 == 12) {
            class32.method718(class157.field2565, class157.field2369, class157.field2370);
        } else if (arg0 == 13) {
            class32.method718(class157.field2303, class157.field2402, class157.field2496);
        } else if (arg0 == 14) {
            class32.method718(class157.field2374, class157.field2313, class157.field2507);
        } else if (arg0 == 16) {
            class32.method718(class157.field2377, class157.field2378, class157.field2379);
        } else if (arg0 == 17) {
            class32.method718(class157.field2380, class157.field2381, class157.field2382);
        } else if (arg0 == 18) {
            class32.method718(class157.field2383, class157.field2384, class157.field2538);
        } else if (arg0 == 19) {
            class32.method718(class157.field2321, class157.field2387, class157.field2433);
        } else if (arg0 == 20) {
            class32.method718(class157.field2389, class157.field2533, class157.field2359);
        } else if (arg0 == 22) {
            class32.method718(class157.field2392, class157.field2393, class157.field2394);
        } else if (arg0 == 23) {
            class32.method718(class157.field2537, class157.field2388, class157.field2397);
        } else if (arg0 == 24) {
            class32.method718(class157.field2398, class157.field2399, class157.field2320);
        } else if (arg0 == 25) {
            class32.method718(class157.field2428, class157.field2488, class157.field2403);
        } else if (arg0 == 26) {
            class32.method718(class157.field2404, class157.field2405, class157.field2406);
        } else if (arg0 == 27) {
            class32.method718(class157.field2422, class157.field2408, class157.field2409);
        } else if (arg0 == 31) {
            class32.method718(class157.field2502, class157.field2417, class157.field2391);
        } else if (arg0 == 32) {
            class32.method718(class157.field2419, class157.field2564, class157.field2421);
        } else if (arg0 == 37) {
            class32.method718(class157.field2385, class157.field2423, class157.field2424);
        } else if (arg0 == 38) {
            class32.method718(class157.field2425, class157.field2487, class157.field2427);
        } else if (arg0 == 55) {
            class32.method718(class157.field2486, class157.field2429, class157.field2430);
        } else if (arg0 == 56) {
            class32.method718(class157.field2551, class157.field2297, class157.field2484);
            method139(11);
            return;
        } else if (arg0 == 57) {
            class32.method718(class157.field2434, class157.field2435, class157.field2436);
            method139(11);
            return;
        } else {
            class32.method718(class157.field2437, class157.field2302, class157.field2439);
        }
        method139(10);
    }

    @ObfuscatedName("dz.p(B)V")
    public static final void method2601() {
        if (Statics.field154 != null) {
            Statics.field154.method2794();
            Statics.field154 = null;
        }
        method2112();
        Statics.field2038.method1755();
        for (int var0 = 0; var0 < 4; var0++) {
            field389[var0].method2208();
        }
        System.gc();
        class183.method553(2);
        field416 = -1;
        field552 = false;
        Statics.method173();
        method139(10);
    }

    @ObfuscatedName("ca.r(I)V")
    public static final void method2112() {
        class47.method2896();
        class42.method7();
        class45.field1028.method3428();
        class41.field916.method3428();
        class41.field917.method3428();
        class41.field950.method3428();
        class41.field918.method3428();
        class40.method47();
        class52.field1129.method3428();
        class52.field1114.method3428();
        class52.field1115.method3428();
        class43.field981.method3428();
        class43.field982.method3428();
        class44.field1004.method3428();
        class44.field1007.method3428();
        class48.field1067.method3428();
        class53.method736();
        class179.field2894.method3428();
        class173.field2807.method3428();
        class173.field2722.method3428();
        class173.field2723.method3428();
        class173.field2810.method3428();
        ((class95) Statics.field1581).method2014();
        class23.field592.method3428();
        Statics.field2227.method3009();
        Statics.field2167.method3009();
        Statics.field3206.method3009();
        Statics.field2977.method3009();
        Statics.field92.method3009();
        Statics.field767.method3009();
        Statics.field174.method3009();
        Statics.field1102.method3009();
        Statics.field1024.method3009();
        Statics.field7.method3009();
        Statics.field1379.method3009();
        Statics.field2221.method3009();
    }

    @ObfuscatedName("fd.x(B)V")
    public static final void method2986() {
        if (field344 > 0) {
            method2601();
        } else {
            method139(40);
            Statics.field1395 = Statics.field154;
            Statics.field154 = null;
        }
    }

    @ObfuscatedName("ba.j(B)V")
    public static final void method1481() {
        if (Statics.field2927 != null) {
            Statics.field2927.method1185();
        }
        if (Statics.field1607 != null) {
            Statics.field1607.method1185();
        }
    }

    @ObfuscatedName("bi.v(B)V")
    public static final void method1220() {
        for (int var0 = 0; var0 < field550; var0++) {
            int var10002 = field542[var0]--;
            if (field542[var0] >= -10) {
                class59 var2 = field469[var0];
                if (var2 == null) {
                    class59 var10000 = (class59) null;
                    var2 = class59.method1203(Statics.field2977, field533[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field542[var0] += var2.method1216();
                    field469[var0] = var2;
                }
                if (field542[var0] < 0) {
                    int var9;
                    if (field294[var0] == 0) {
                        var9 = field528;
                    } else {
                        int var3 = (field294[var0] & 0xFF) * 128;
                        int var4 = field294[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field677.field839;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field294[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field677.field803;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field542[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field531 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1204().method1245(Statics.field604);
                        class65 var11 = class65.method1389(var10, 100, var9);
                        var11.method1277(field534[var0] - 1);
                        Statics.field1215.method1112(var11);
                    }
                    field542[var0] = -100;
                }
            } else {
                field550--;
                for (int var1 = var0; var1 < field550; var1++) {
                    field533[var1] = field533[var1 + 1];
                    field469[var1] = field469[var1 + 1];
                    field534[var1] = field534[var1 + 1];
                    field542[var1] = field542[var1 + 1];
                    field294[var1] = field294[var1 + 1];
                }
                var0--;
            }
        }
        if (field552 && !class183.method2929()) {
            if (field527 != 0 && field416 != -1) {
                class183.method2205(Statics.field767, field416, 0, field527, false);
            }
            field552 = false;
        }
    }

    @ObfuscatedName("cg.l(Lam;IIII)V")
    public static void method2110(class43 arg0, int arg1, int arg2, int arg3) {
        if (field550 >= 50 || field531 == 0 || arg0.field990 == null || arg1 >= arg0.field990.length) {
            return;
        }
        int var4 = arg0.field990[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field533[field550] = var5;
        field534[field550] = var6;
        field542[field550] = 0;
        field469[field550] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field294[field550] = (var8 << 16) + (var9 << 8) + var7;
        field550++;
    }

    @ObfuscatedName("eu.u(IB)V")
    public static void method2908(int arg0) {
        if (arg0 == -1 && !field552) {
            class183.method2657();
        } else if (arg0 != -1 && field416 != arg0 && field527 != 0 && !field552) {
            class183.method2733(2, Statics.field767, arg0, 0, field527, false);
        }
        field416 = arg0;
    }

    @ObfuscatedName("c.i(I)V")
    public static final void method95() {
        if (Statics.field27 == field519) {
            return;
        }
        field519 = Statics.field27;
        int var0 = Statics.field27;
        int[] var1 = Statics.field1652.field1408;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field80[var0][var6][var4] & 0x18) == 0) {
                    Statics.field2038.method1789(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class6.field80[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field2038.method1789(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1652.method1583();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field80[var0][var10][var9] & 0x18) == 0) {
                    method2(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class6.field80[var0 + 1][var10][var9] & 0x8) != 0) {
                    method2(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field561 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field2038.method1808(Statics.field27, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class41.method2614(var14).field942;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field389[Statics.field27].field1892;
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
                        field564[field561] = Statics.field1083[var15];
                        field444[field561] = var16;
                        field352[field561] = var17;
                        field561++;
                    }
                }
            }
        }
        Statics.field2119.method1566();
    }

    @ObfuscatedName("eg.ah(Lft;III)V")
    public static final void method2784(class173 arg0, int arg1, int arg2) {
        if (field526 != 0 && field526 != 3 || class140.field2137 != 1 && Statics.field319 || class140.field2137 != 4) {
            return;
        }
        class175 var3 = arg0.method3103(true);
        if (var3 == null) {
            return;
        }
        int var4 = class140.field2134 - arg1;
        int var5 = class140.field2133 - arg2;
        if (!var3.method3153(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2866 / 2;
        int var7 = var5 - var3.field2867 / 2;
        int var8 = field456 + field375 & 0x7FF;
        int var9 = class91.field1566[var8];
        int var10 = class91.field1585[var8];
        int var11 = (field364 + 256) * var9 >> 8;
        int var12 = (field364 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field677.field839 + var13 >> 7;
        int var16 = Statics.field677.field803 - var14 >> 7;
        field337.method2574(183);
        field337.method2354(18);
        field337.method2360(Statics.field23 + var16);
        field337.method2312(Statics.field941 + var15);
        field337.method2354(class137.field2094[82] ? (class137.field2094[81] ? 2 : 1) : 0);
        field337.method2354(var6);
        field337.method2354(var7);
        field337.method2312(field375);
        field337.method2354(57);
        field337.method2354(field456);
        field337.method2354(field364);
        field337.method2354(89);
        field337.method2312(Statics.field677.field839);
        field337.method2312(Statics.field677.field803);
        field337.method2354(63);
        field460 = var15;
        field525 = var16;
    }

    @ObfuscatedName("eq.aa(B)V")
    public static final void method2647() {
        int[] var0 = class33.field751;
        for (int var1 = 0; var1 < class33.field750; var1++) {
            class3 var2 = field412[var0[var1]];
            if (var2 != null && var2.field818 > 0) {
                var2.field818--;
                if (var2.field818 == 0) {
                    var2.field807 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field457; var3++) {
            int var4 = field331[var3];
            class35 var5 = field415[var4];
            if (var5 != null && var5.field818 > 0) {
                var5.field818--;
                if (var5.field818 == 0) {
                    var5.field807 = null;
                }
            }
        }
    }

    @ObfuscatedName("m.ao(Ljava/lang/String;B)V")
    public static final void method122(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1549.field144 = !Statics.field1549.field144;
            class9.method38();
            if (Statics.field1549.field144) {
                class12.method2628(99, "", "Roofs are now all hidden");
            } else {
                class12.method2628(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field467 = !field467;
        }
        if (field295 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field467 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field467 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method2986();
            }
            if (arg0.equalsIgnoreCase("errortest") && field318 == 2) {
                throw new RuntimeException();
            }
        }
        field337.method2574(84);
        field337.method2354(arg0.length() + 1);
        field337.method2372(arg0);
    }

    @ObfuscatedName("cq.ai(B)V")
    public static final void method2008() {
        int var0 = Statics.field1560 * 128 + 64;
        int var1 = Statics.field1371 * 128 + 64;
        int var2 = Statics.method200(var0, var1, Statics.field27) - Statics.field395;
        if (Statics.field226 < var0) {
            Statics.field226 += Statics.field1091 * (var0 - Statics.field226) / 1000 + Statics.field2647;
            if (Statics.field226 > var0) {
                Statics.field226 = var0;
            }
        }
        if (Statics.field226 > var0) {
            Statics.field226 -= Statics.field1091 * (Statics.field226 - var0) / 1000 + Statics.field2647;
            if (Statics.field226 < var0) {
                Statics.field226 = var0;
            }
        }
        if (Statics.field165 < var2) {
            Statics.field165 += Statics.field1091 * (var2 - Statics.field165) / 1000 + Statics.field2647;
            if (Statics.field165 > var2) {
                Statics.field165 = var2;
            }
        }
        if (Statics.field165 > var2) {
            Statics.field165 -= Statics.field1091 * (Statics.field165 - var2) / 1000 + Statics.field2647;
            if (Statics.field165 < var2) {
                Statics.field165 = var2;
            }
        }
        if (Statics.field217 < var1) {
            Statics.field217 += Statics.field1091 * (var1 - Statics.field217) / 1000 + Statics.field2647;
            if (Statics.field217 > var1) {
                Statics.field217 = var1;
            }
        }
        if (Statics.field217 > var1) {
            Statics.field217 -= Statics.field1091 * (Statics.field217 - var1) / 1000 + Statics.field2647;
            if (Statics.field217 < var1) {
                Statics.field217 = var1;
            }
        }
        int var3 = Statics.field2280 * 128 + 64;
        int var4 = Statics.field575 * 128 + 64;
        int var5 = Statics.method200(var3, var4, Statics.field27) - Statics.field1593;
        int var6 = var3 - Statics.field226;
        int var7 = var5 - Statics.field165;
        int var8 = var4 - Statics.field217;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field908 < var10) {
            Statics.field908 += Statics.field1021 * (var10 - Statics.field908) / 1000 + Statics.field2882;
            if (Statics.field908 > var10) {
                Statics.field908 = var10;
            }
        }
        if (Statics.field908 > var10) {
            Statics.field908 -= Statics.field1021 * (Statics.field908 - var10) / 1000 + Statics.field2882;
            if (Statics.field908 < var10) {
                Statics.field908 = var10;
            }
        }
        int var12 = var11 - Statics.field657;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field657 += Statics.field1021 * var12 / 1000 + Statics.field2882;
            Statics.field657 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field657 -= Statics.field1021 * -var12 / 1000 + Statics.field2882;
            Statics.field657 &= 0x7FF;
        }
        int var13 = var11 - Statics.field657;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field657 = var11;
        }
    }

    @ObfuscatedName("ba.ab(Laq;IB)V")
    public static final void method1483(class38 arg0, int arg1) {
        if (arg0.field847 > field303) {
            int var2 = arg0.field847 - field303;
            int var3 = arg0.field858 * 128 + arg0.field806 * 64;
            int var4 = arg0.field841 * 128 + arg0.field806 * 64;
            arg0.field839 += (var3 - arg0.field839) / var2;
            arg0.field803 += (var4 - arg0.field803) / var2;
            arg0.field859 = 0;
            arg0.field822 = arg0.field852;
        } else if (arg0.field848 >= field303) {
            if (field303 == arg0.field848 || arg0.field833 == -1 || arg0.field836 != 0 || arg0.field835 + 1 > class43.method750(arg0.field833).field985[arg0.field834]) {
                int var5 = arg0.field848 - arg0.field847;
                int var6 = field303 - arg0.field847;
                int var7 = arg0.field858 * 128 + arg0.field806 * 64;
                int var8 = arg0.field841 * 128 + arg0.field806 * 64;
                int var9 = arg0.field824 * 128 + arg0.field806 * 64;
                int var10 = arg0.field846 * 128 + arg0.field806 * 64;
                arg0.field839 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field803 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field859 = 0;
            arg0.field822 = arg0.field852;
            arg0.field804 = arg0.field822;
        } else {
            method1009(arg0);
        }
        if (arg0.field839 < 128 || arg0.field803 < 128 || arg0.field839 >= 13184 || arg0.field803 >= 13184) {
            arg0.field833 = -1;
            arg0.field838 = -1;
            arg0.field847 = 0;
            arg0.field848 = 0;
            arg0.field839 = arg0.field856[0] * 128 + arg0.field806 * 64;
            arg0.field803 = arg0.field857[0] * 128 + arg0.field806 * 64;
            arg0.method730();
        }
        if (Statics.field677 == arg0 && (arg0.field839 < 1536 || arg0.field803 < 1536 || arg0.field839 >= 11776 || arg0.field803 >= 11776)) {
            arg0.field833 = -1;
            arg0.field838 = -1;
            arg0.field847 = 0;
            arg0.field848 = 0;
            arg0.field839 = arg0.field856[0] * 128 + arg0.field806 * 64;
            arg0.field803 = arg0.field857[0] * 128 + arg0.field806 * 64;
            arg0.method730();
        }
        method1745(arg0);
        Statics.method590(arg0);
    }

    @ObfuscatedName("at.ae(Laq;I)V")
    public static final void method1009(class38 arg0) {
        arg0.field830 = arg0.field832;
        if (arg0.field855 == 0) {
            arg0.field859 = 0;
            return;
        }
        if (arg0.field833 != -1 && arg0.field836 == 0) {
            class43 var1 = class43.method750(arg0.field833);
            if (arg0.field802 > 0 && var1.field983 == 0) {
                arg0.field859++;
                return;
            }
            if (arg0.field802 <= 0 && var1.field995 == 0) {
                arg0.field859++;
                return;
            }
        }
        int var2 = arg0.field839;
        int var3 = arg0.field803;
        int var4 = arg0.field856[arg0.field855 - 1] * 128 + arg0.field806 * 64;
        int var5 = arg0.field857[arg0.field855 - 1] * 128 + arg0.field806 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field822 = 1280;
            } else if (var3 > var5) {
                arg0.field822 = 1792;
            } else {
                arg0.field822 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field822 = 768;
            } else if (var3 > var5) {
                arg0.field822 = 256;
            } else {
                arg0.field822 = 512;
            }
        } else if (var3 < var5) {
            arg0.field822 = 1024;
        } else if (var3 > var5) {
            arg0.field822 = 0;
        }
        byte var6 = arg0.field813[arg0.field855 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field839 = var4;
            arg0.field803 = var5;
            arg0.field855--;
            if (arg0.field802 > 0) {
                arg0.field802--;
            }
            return;
        }
        int var7 = arg0.field822 - arg0.field804 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field811;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field810;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field829;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field826;
        }
        if (var8 == -1) {
            var8 = arg0.field810;
        }
        arg0.field830 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class35) {
            var10 = ((class35) arg0).field777.field879;
        }
        if (var10) {
            if (arg0.field822 != arg0.field804 && arg0.field827 == -1 && arg0.field854 != 0) {
                var9 = 2;
            }
            if (arg0.field855 > 2) {
                var9 = 6;
            }
            if (arg0.field855 > 3) {
                var9 = 8;
            }
            if (arg0.field859 > 0 && arg0.field855 > 1) {
                var9 = 8;
                arg0.field859--;
            }
        } else {
            if (arg0.field855 > 1) {
                var9 = 6;
            }
            if (arg0.field855 > 2) {
                var9 = 8;
            }
            if (arg0.field859 > 0 && arg0.field855 > 1) {
                var9 = 8;
                arg0.field859--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field830 == arg0.field810 && arg0.field814 != -1) {
            arg0.field830 = arg0.field814;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field839 += var9;
                if (arg0.field839 > var4) {
                    arg0.field839 = var4;
                }
            } else if (var2 > var4) {
                arg0.field839 -= var9;
                if (arg0.field839 < var4) {
                    arg0.field839 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field803 += var9;
                if (arg0.field803 > var5) {
                    arg0.field803 = var5;
                }
            } else if (var3 > var5) {
                arg0.field803 -= var9;
                if (arg0.field803 < var5) {
                    arg0.field803 = var5;
                }
            }
        }
        if (arg0.field839 == var4 && arg0.field803 == var5) {
            arg0.field855--;
            if (arg0.field802 > 0) {
                arg0.field802--;
            }
        }
    }

    @ObfuscatedName("cn.aw(Laq;I)V")
    public static final void method1745(class38 arg0) {
        if (arg0.field854 == 0) {
            return;
        }
        if (arg0.field827 != -1) {
            class38 var1 = null;
            if (arg0.field827 < 32768) {
                var1 = field415[arg0.field827];
            } else if (arg0.field827 >= 32768) {
                var1 = field412[arg0.field827 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field839 - var1.field839;
                int var3 = arg0.field803 - var1.field803;
                if (var2 != 0 || var3 != 0) {
                    arg0.field822 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field828) {
                arg0.field827 = -1;
                arg0.field828 = false;
            }
        }
        if (arg0.field843 != -1 && (arg0.field855 == 0 || arg0.field859 > 0)) {
            arg0.field822 = arg0.field843;
            arg0.field843 = -1;
        }
        int var4 = arg0.field822 - arg0.field804 & 0x7FF;
        if (var4 == 0 && arg0.field828) {
            arg0.field827 = -1;
            arg0.field828 = false;
        }
        if (var4 == 0) {
            arg0.field853 = 0;
            return;
        }
        arg0.field853++;
        if (var4 > 1024) {
            arg0.field804 -= arg0.field854;
            boolean var5 = true;
            if (var4 < arg0.field854 || var4 > 2048 - arg0.field854) {
                arg0.field804 = arg0.field822;
                var5 = false;
            }
            if (arg0.field832 == arg0.field830 && (arg0.field853 > 25 || var5)) {
                if (arg0.field808 == -1) {
                    arg0.field830 = arg0.field810;
                } else {
                    arg0.field830 = arg0.field808;
                }
            }
        } else {
            arg0.field804 += arg0.field854;
            boolean var6 = true;
            if (var4 < arg0.field854 || var4 > 2048 - arg0.field854) {
                arg0.field804 = arg0.field822;
                var6 = false;
            }
            if (arg0.field832 == arg0.field830 && (arg0.field853 > 25 || var6)) {
                if (arg0.field862 == -1) {
                    arg0.field830 = arg0.field810;
                } else {
                    arg0.field830 = arg0.field862;
                }
            }
        }
        arg0.field804 &= 0x7FF;
    }

    @ObfuscatedName("aq.ay(Lg;IIB)V")
    public static void method733(class3 arg0, int arg1, int arg2) {
        if (arg0.field833 == arg1 && arg1 != -1) {
            int var3 = class43.method750(arg1).field996;
            if (var3 == 1) {
                arg0.field834 = 0;
                arg0.field835 = 0;
                arg0.field836 = arg2;
                arg0.field837 = 0;
            }
            if (var3 == 2) {
                arg0.field837 = 0;
            }
        } else if (arg1 == -1 || arg0.field833 == -1 || class43.method750(arg1).field979 >= class43.method750(arg0.field833).field979) {
            arg0.field833 = arg1;
            arg0.field834 = 0;
            arg0.field835 = 0;
            arg0.field836 = arg2;
            arg0.field837 = 0;
            arg0.field802 = arg0.field855;
        }
    }

    @ObfuscatedName("ei.af(II)V")
    public static void method2912(int arg0) {
        field503 = 0L;
        if (arg0 >= 2) {
            field504 = true;
        } else {
            field504 = false;
        }
        method198();
        if (field301 >= 25) {
            field337.method2574(221);
            class122 var1 = field337;
            int var2 = field504 ? 2 : 1;
            var1.method2354(var2);
            field337.method2312(Statics.field2114);
            field337.method2312(Statics.field2638);
        }
        field2182 = true;
    }

    @ObfuscatedName("af.al(I)V")
    public static void method711() {
        Canvas var0 = Statics.field252;
        var0.removeKeyListener(class137.field2096);
        var0.removeFocusListener(class137.field2096);
        class137.field2097 = -1;
        class140.method2785(Statics.field252);
        if (Statics.field707 != null) {
            Statics.field707.method2637(Statics.field252);
        }
        Statics.field291.method2812();
        Statics.field252.setBackground(Color.black);
        Statics.method2239(Statics.field252);
        class140.method2020(Statics.field252);
        if (Statics.field707 != null) {
            Statics.field707.method2646(Statics.field252);
        }
        if (field413 != -1) {
            method2610(field413, Statics.field2114, Statics.field2638, false);
        }
        field2184 = true;
    }

    @ObfuscatedName("x.aq(B)V")
    public static void method198() {
        client var0 = Statics.field291;
        synchronized (Statics.field291) {
            Container var1 = Statics.field291.method2815();
            if (var1 != null) {
                Statics.field2058 = Math.max(var1.getSize().width, Statics.field1940);
                Statics.field1353 = Math.max(var1.getSize().height, Statics.field1103);
                if (Statics.field1609 == var1) {
                    Insets var2 = Statics.field1609.getInsets();
                    Statics.field2058 -= var2.right + var2.left;
                    Statics.field1353 -= var2.top + var2.bottom;
                }
                if (Statics.field2058 <= 0) {
                    Statics.field2058 = 1;
                }
                if (Statics.field1353 <= 0) {
                    Statics.field1353 = 1;
                }
                int var3 = field504 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field2114 = field505 * 765;
                    Statics.field2638 = field506 * 503;
                } else {
                    Statics.field2114 = Math.min(Statics.field2058, 7680);
                    Statics.field2638 = Math.min(Statics.field1353, 2160);
                }
                field2179 = (Statics.field2058 - Statics.field2114) / 2;
                field2180 = 0;
                Statics.field252.setSize(Statics.field2114, Statics.field2638);
                int var4 = Statics.field2114;
                int var5 = Statics.field2638;
                Canvas var6 = Statics.field252;
                class78 var8;
                try {
                    class82 var7 = new class82();
                    var7.method1510(var4, var5, var6);
                    var8 = var7;
                } catch (Throwable var13) {
                    class76 var10 = new class76();
                    var10.method1510(var4, var5, var6);
                    var8 = var10;
                }
                Statics.field2119 = var8;
                if (Statics.field1609 == var1) {
                    Insets var11 = Statics.field1609.getInsets();
                    Statics.field252.setLocation(field2179 + var11.left, field2180 + var11.top);
                } else {
                    Statics.field252.setLocation(field2179, field2180);
                }
                method186();
                if (field413 != -1) {
                    method2610(field413, Statics.field2114, Statics.field2638, true);
                }
                method166();
            }
        }
    }

    @ObfuscatedName("p.ak(I)V")
    public static void method186() {
        int var0 = Statics.field2114;
        int var1 = Statics.field2638;
        if (Statics.field2058 < var0) {
            int var2 = Statics.field2058;
        }
        if (Statics.field1353 < var1) {
            int var3 = Statics.field1353;
        }
        if (Statics.field1549 == null) {
            return;
        }
        try {
            client var4 = Statics.field291;
            int var5 = field504 ? 2 : 1;
            class132.method2651(var4, "resize", new Object[] { var5 });
        } catch (Throwable var7) {
        }
    }

    @ObfuscatedName("f.az(I)V")
    public static void method166() {
        int var0 = field2179;
        int var1 = field2180;
        int var2 = Statics.field2058 - Statics.field2114 - var0;
        int var3 = Statics.field1353 - Statics.field2638 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field291.method2815();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1609 == var4) {
                Insets var7 = Statics.field1609.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field1353);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field2058, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field2058 + var5 - var2, var6, var2, Statics.field1353);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field1353 + var6 - var3, Statics.field2058, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("v.ar(Ljava/lang/String;ZI)V")
    public static final void method565(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field143.method3699(arg0, 250);
        int var6 = Statics.field143.method3763(arg0, 250) * 13;
        class80.method1670(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1703(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field143.method3697(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2109(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field252.getGraphics();
                Statics.field2119.method1511(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field252.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field493; var13++) {
            if (field500[var13] + field498[var13] > var9 && field498[var13] < var9 + var11 && field507[var13] + field501[var13] > var10 && field507[var13] < var10 + var12) {
                field508[var13] = true;
            }
        }
    }

    @ObfuscatedName("cx.as(IIIIZI)V")
    public static final void method2028(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field368 - field545) * var5 / 100 + field545;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field551) {
            short var8 = field551;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field330) {
                var6 = field330;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1707();
                    class80.method1670(arg0, arg1, var10, arg3, -16777216);
                    class80.method1670(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field541) {
            short var11 = field541;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field549) {
                var6 = field549;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1707();
                    class80.method1670(arg0, arg1, arg2, var13, -16777216);
                    class80.method1670(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field572 - field438) * var5 / 100 + field438;
        field557 = arg3 * var6 * var14 / 85504 << 1;
        if (field555 != arg2 || field556 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class91.field1566[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class86.method1838(var15, 500, 800, arg2, arg3);
        }
        field553 = arg0;
        field554 = arg1;
        field555 = arg2;
        field556 = arg3;
    }

    @ObfuscatedName("an.am(Laj;I)V")
    public static final void method884(class34 arg0) {
        if (Statics.field677.field839 >> 7 == field460 && Statics.field677.field803 >> 7 == field525) {
            field460 = 0;
        }
        int var1 = class33.field750;
        int[] var2 = class33.field751;
        int var3 = var1;
        if (class34.field764 == arg0 || class34.field762 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field764 == arg0) {
                var5 = Statics.field677;
                var6 = Statics.field677.field44 << 14;
            } else if (class34.field762 == arg0) {
                var5 = field412[field421];
                var6 = field421 << 14;
            } else {
                var5 = field412[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field770 == arg0 && field421 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method11() && !var5.field48) {
                var5.field30 = false;
                if ((field429 && var1 > 50 || var1 > 200) && class34.field764 != arg0 && var5.field832 == var5.field830) {
                    var5.field30 = true;
                }
                int var7 = var5.field839 >> 7;
                int var8 = var5.field803 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field41 == null || field303 < var5.field36 || field303 >= var5.field50) {
                        if ((var5.field839 & 0x7F) == 64 && (var5.field803 & 0x7F) == 64) {
                            if (field332 == field539[var7][var8]) {
                                continue;
                            }
                            field539[var7][var8] = field332;
                        }
                        var5.field29 = Statics.method200(var5.field839, var5.field803, Statics.field27);
                        Statics.field2038.method1799(Statics.field27, var5.field839, var5.field803, var5.field29, 60, var5, var5.field804, var6, var5.field805);
                    } else {
                        var5.field30 = false;
                        var5.field29 = Statics.method200(var5.field839, var5.field803, Statics.field27);
                        Statics.field2038.method1767(Statics.field27, var5.field839, var5.field803, var5.field29, 60, var5, var5.field804, var6, var5.field42, var5.field43, var5.field33, var5.field45);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ac.an(ZI)V")
    public static final void method944(boolean arg0) {
        for (int var1 = 0; var1 < field457; var1++) {
            class35 var2 = field415[field331[var1]];
            int var3 = (field331[var1] << 14) + 536870912;
            if (var2 != null && var2.method11() && var2.field777.field896 == arg0 && var2.field777.method738()) {
                int var4 = var2.field839 >> 7;
                int var5 = var2.field803 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field806 == 1 && (var2.field839 & 0x7F) == 64 && (var2.field803 & 0x7F) == 64) {
                        if (field332 == field539[var4][var5]) {
                            continue;
                        }
                        field539[var4][var5] = field332;
                    }
                    if (!var2.field777.field888) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2038.method1799(Statics.field27, var2.field839, var2.field803, Statics.method200(var2.field839 + (var2.field806 * 64 - 64), var2.field803 + (var2.field806 * 64 - 64), Statics.field27), var2.field806 * 64 - 64 + 60, var2, var2.field804, var3, var2.field805);
                }
            }
        }
    }

    @ObfuscatedName("s.au(I)V")
    public static final void method167() {
        for (class7 var0 = (class7) field424.method3493(); var0 != null; var0 = (class7) field424.method3495()) {
            if (Statics.field27 != var0.field100 || field303 > var0.field106) {
                var0.method3588();
            } else if (field303 >= var0.field104) {
                if (var0.field121 > 0) {
                    class35 var1 = field415[var0.field121 - 1];
                    if (var1 != null && var1.field839 >= 0 && var1.field839 < 13312 && var1.field803 >= 0 && var1.field803 < 13312) {
                        var0.method98(var1.field839, var1.field803, Statics.method200(var1.field839, var1.field803, var0.field100) - var0.field107, field303);
                    }
                }
                if (var0.field121 < 0) {
                    int var2 = -var0.field121 - 1;
                    class3 var3;
                    if (field373 == var2) {
                        var3 = Statics.field677;
                    } else {
                        var3 = field412[var2];
                    }
                    if (var3 != null && var3.field839 >= 0 && var3.field839 < 13312 && var3.field803 >= 0 && var3.field803 < 13312) {
                        var0.method98(var3.field839, var3.field803, Statics.method200(var3.field839, var3.field803, var0.field100) - var0.field107, field303);
                    }
                }
                var0.method105(field367);
                Statics.field2038.method1799(Statics.field27, (int) var0.field105, (int) var0.field112, (int) var0.field113, 60, var0, var0.field109, -1, false);
            }
        }
    }

    @ObfuscatedName("ag.av(I)I")
    public static final int method981() {
        if (Statics.field1549.field144) {
            return Statics.field27;
        } else {
            int var0 = Statics.method200(Statics.field226, Statics.field217, Statics.field27);
            return var0 - Statics.field165 >= 800 || (class6.field80[Statics.field27][Statics.field226 >> 7][Statics.field217 >> 7] & 0x4) == 0 ? 3 : Statics.field27;
        }
    }

    @ObfuscatedName("client.ac(Laq;IIIIIB)V")
    public static final void method484(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method11()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field777;
            if (var6.field871 != null) {
                var6 = var6.method744();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field750;
        int[] var8 = class33.field751;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field48) {
                return;
            }
            if (var10.field31 != -1 || var10.field32 != -1) {
                method734(arg0, arg0.field851 + 15);
                if (field298 > -1) {
                    if (var10.field31 != -1) {
                        Statics.field57[var10.field31].method1622(field298 + arg2 - 12, field397 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field32 != -1) {
                        Statics.field2043[var10.field32].method1622(field298 + arg2 - 12, field397 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field311 == 10 && field343 == var8[arg1]) {
                method734(arg0, arg0.field851 + 15);
                if (field298 > -1) {
                    Statics.field3029[1].method1622(field298 + arg2 - 12, field397 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field777;
            if (var11.field871 != null) {
                var11 = var11.method744();
            }
            if (var11.field905 >= 0 && var11.field905 < Statics.field2043.length) {
                method734(arg0, arg0.field851 + 15);
                if (field298 > -1) {
                    Statics.field2043[var11.field905].method1622(field298 + arg2 - 12, field397 + arg3 - 30);
                }
            }
            if (field311 == 1 && field312 == field331[arg1 - var7] && field303 % 20 < 10) {
                method734(arg0, arg0.field851 + 15);
                if (field298 > -1) {
                    Statics.field3029[0].method1622(field298 + arg2 - 12, field397 + arg3 - 28);
                }
            }
        }
        if (arg0.field807 != null && (arg1 >= var7 || !arg0.field845 && (field363 == 4 || !arg0.field816 && (field363 == 0 || field363 == 3 || field363 == 1 && method192(((class3) arg0).field38, false))))) {
            method734(arg0, arg0.field851);
            if (field298 > -1 && field384 < field385) {
                field529[field384] = Statics.field1044.method3758(arg0.field807) / 2;
                field524[field384] = Statics.field1044.field3163;
                field386[field384] = field298;
                field387[field384] = field397;
                field390[field384] = arg0.field819;
                field391[field384] = arg0.field844;
                field392[field384] = arg0.field818;
                field393[field384] = arg0.field807;
                field384++;
            }
        }
        if (arg0.field860 > field303) {
            method734(arg0, arg0.field851 + 15);
            if (field298 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field777;
                    var12 = var13.field907;
                }
                int var14 = arg0.field825 * var12 / arg0.field815;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field825 > 0) {
                    var14 = 1;
                }
                class80.method1670(field298 + arg2 - var12 / 2, field397 + arg3 - 3, var14, 5, 65280);
                class80.method1670(field298 + arg2 - var12 / 2 + var14, field397 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field823[var15] > field303) {
                method734(arg0, arg0.field851 / 2);
                if (field298 > -1) {
                    if (var15 == 1) {
                        field397 -= 20;
                    }
                    if (var15 == 2) {
                        field298 -= 15;
                        field397 -= 10;
                    }
                    if (var15 == 3) {
                        field298 += 15;
                        field397 -= 10;
                    }
                    Statics.field1037[arg0.field820[var15]].method1622(field298 + arg2 - 12, field397 + arg3 - 12);
                    Statics.field2278.method3741(Integer.toString(arg0.field821[var15]), field298 + arg2 - 1, field397 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("dj.ap(I)V")
    public static final void method2249() {
        field411 = 0;
        int var0 = (Statics.field677.field839 >> 7) + Statics.field941;
        int var1 = (Statics.field677.field803 >> 7) + Statics.field23;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field411 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field411 = 1;
        }
        if (field411 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field411 = 0;
        }
    }

    @ObfuscatedName("ae.ad(IIIII)V")
    public static final void method673(int arg0, int arg1, int arg2, int arg3) {
        if (field401 == 1) {
            Statics.field2156[field400 / 100].method1622(field398 - 8, field399 - 8);
        }
        if (field401 == 2) {
            Statics.field2156[field400 / 100 + 4].method1622(field398 - 8, field399 - 8);
        }
        method2249();
    }

    @ObfuscatedName("aq.ag(Laq;II)V")
    public static final void method734(class38 arg0, int arg1) {
        method777(arg0.field839, arg0.field803, arg1);
    }

    @ObfuscatedName("ar.ax(IIII)V")
    public static final void method777(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field298 = -1;
            field397 = -1;
            return;
        }
        int var3 = Statics.method200(arg0, arg1, Statics.field27) - arg2;
        int var4 = arg0 - Statics.field226;
        int var5 = var3 - Statics.field165;
        int var6 = arg1 - Statics.field217;
        int var7 = class91.field1566[Statics.field908];
        int var8 = class91.field1585[Statics.field908];
        int var9 = class91.field1566[Statics.field657];
        int var10 = class91.field1585[Statics.field657];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field298 = field557 * var11 / var15 + field555 / 2;
            field397 = field557 * var14 / var15 + field556 / 2;
        } else {
            field298 = -1;
            field397 = -1;
        }
    }

    @ObfuscatedName("aj.bm(ZI)V")
    public static final void method696(boolean arg0) {
        field496 = arg0;
        if (!field496) {
            int var1 = field535.method2525();
            int var2 = field535.method2525();
            int var3 = field535.method2525();
            Statics.field53 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field53[var4][var5] = field535.method2331();
                }
            }
            Statics.field1958 = new int[var3];
            Statics.field2871 = new int[var3];
            Statics.field130 = new int[var3];
            Statics.field172 = new byte[var3][];
            Statics.field207 = new byte[var3][];
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
                        Statics.field1958[var7] = var10;
                        Statics.field2871[var7] = Statics.field92.method3005("m" + var8 + "_" + var9);
                        Statics.field130[var7] = Statics.field92.method3005("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method552(var1, var2);
            return;
        }
        int var11 = field535.method2362();
        int var12 = field535.method2525();
        int var13 = field535.method2525();
        field535.method2576();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field535.method2582(1);
                    if (var17 == 1) {
                        field353[var14][var15][var16] = field535.method2582(26);
                    } else {
                        field353[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field535.method2578();
        Statics.field53 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field53[var18][var19] = field535.method2331();
            }
        }
        Statics.field1958 = new int[var13];
        Statics.field2871 = new int[var13];
        Statics.field130 = new int[var13];
        Statics.field172 = new byte[var13][];
        Statics.field207 = new byte[var13][];
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
                            if (Statics.field1958[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field1958[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field2871[var20] = Statics.field92.method3005("m" + var29 + "_" + var30);
                            Statics.field130[var20] = Statics.field92.method3005("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method552(var12, var11);
    }

    @ObfuscatedName("client.bd(III)V")
    public static final void method552(int arg0, int arg1) {
        if (Statics.field24 == arg0 && Statics.field1743 == arg1) {
            return;
        }
        Statics.field24 = arg0;
        Statics.field1743 = arg1;
        method139(25);
        method565(class157.field2386, true);
        int var2 = Statics.field941;
        int var3 = Statics.field23;
        Statics.field941 = (arg0 - 6) * 8;
        Statics.field23 = (arg1 - 6) * 8;
        int var4 = Statics.field941 - var2;
        int var5 = Statics.field23 - var3;
        int var6 = Statics.field941;
        int var7 = Statics.field23;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field415[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field856[var10] -= var4;
                    var9.field857[var10] -= var5;
                }
                var9.field839 -= var4 * 128;
                var9.field803 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field412[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field856[var13] -= var4;
                    var12.field857[var13] -= var5;
                }
                var12.field839 -= var4 * 128;
                var12.field803 -= var5 * 128;
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
                        field422[var24][var20][var21] = field422[var24][var22][var23];
                    } else {
                        field422[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field423.method3493(); var25 != null; var25 = (class17) field423.method3495()) {
            var25.field236 -= var4;
            var25.field237 -= var5;
            if (var25.field236 < 0 || var25.field237 < 0 || var25.field236 >= 104 || var25.field237 >= 104) {
                var25.method3588();
            }
        }
        if (field460 != 0) {
            field460 -= var4;
            field525 -= var5;
        }
        field550 = 0;
        field431 = false;
        field519 = -1;
        field483.method3487();
        field424.method3487();
        for (int var26 = 0; var26 < 4; var26++) {
            field389[var26].method2208();
        }
    }

    @ObfuscatedName("q.bf(ZI)V")
    public static final void method107(boolean arg0) {
        method1481();
        field340++;
        if (field340 < 50 && !arg0) {
            return;
        }
        field340 = 0;
        if (field345 || Statics.field154 == null) {
            return;
        }
        field337.method2574(71);
        try {
            Statics.field154.method2789(field337.field1974, 0, field337.field1973);
            field337.field1973 = 0;
        } catch (IOException var2) {
            field345 = true;
        }
    }

    @ObfuscatedName("y.bj(IIIIIB)V")
    public static final void method2(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2038.method1804(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2038.method1845(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1652.field1408;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method2614(var12);
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
                class81 var14 = Statics.field124[var13.field943];
                if (var14 != null) {
                    int var15 = (var13.field929 * 4 - var14.field1422) / 2;
                    int var16 = (var13.field930 * 4 - var14.field1423) / 2;
                    var14.method1724(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field930) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2038.method1783(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2038.method1845(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method2614(var21);
            if (var22.field943 != -1) {
                class81 var23 = Statics.field124[var22.field943];
                if (var23 != null) {
                    int var24 = (var22.field929 * 4 - var23.field1422) / 2;
                    int var25 = (var22.field930 * 4 - var23.field1423) / 2;
                    var23.method1724(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field930) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1652.field1408;
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
        int var29 = Statics.field2038.method1808(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method2614(var30);
        if (var31.field943 == -1) {
            return;
        }
        class81 var32 = Statics.field124[var31.field943];
        if (var32 != null) {
            int var33 = (var31.field929 * 4 - var32.field1422) / 2;
            int var34 = (var31.field930 * 4 - var32.field1423) / 2;
            var32.method1724(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field930) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("bm.bk(I)Z")
    public static final boolean method1054() {
        if (Statics.field154 == null) {
            return false;
        }
        try {
            int var0 = Statics.field154.method2807();
            if (var0 == 0) {
                return false;
            }
            if (field388 == -1) {
                Statics.field154.method2792(field535.field1974, 0, 1);
                field535.field1973 = 0;
                field388 = field535.method2575();
                field396 = class188.field3007[field388];
                var0--;
            }
            if (field396 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field154.method2792(field535.field1974, 0, 1);
                field396 = field535.field1974[0] & 0xFF;
                var0--;
            }
            if (field396 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field154.method2792(field535.field1974, 0, 2);
                field535.field1973 = 0;
                field396 = field535.method2525();
                var0 -= 2;
            }
            if (var0 < field396) {
                return false;
            }
            field535.field1973 = 0;
            Statics.field154.method2792(field535.field1974, 0, field396);
            field309 = 0;
            field452 = field425;
            field425 = field341;
            field341 = field388;
            if (field388 == 195) {
                field431 = true;
                Statics.field2280 = field535.method2326();
                Statics.field575 = field535.method2326();
                Statics.field1593 = field535.method2525();
                Statics.field2882 = field535.method2326();
                Statics.field1021 = field535.method2326();
                if (Statics.field1021 >= 100) {
                    int var1 = Statics.field2280 * 128 + 64;
                    int var2 = Statics.field575 * 128 + 64;
                    int var3 = Statics.method200(var1, var2, Statics.field27) - Statics.field1593;
                    int var4 = var1 - Statics.field226;
                    int var5 = var3 - Statics.field165;
                    int var6 = var2 - Statics.field217;
                    int var7 = (int) Math.sqrt((double) (var4 * var4 + var6 * var6));
                    Statics.field908 = (int) (Math.atan2((double) var5, (double) var7) * 325.949D) & 0x7FF;
                    Statics.field657 = (int) (Math.atan2((double) var4, (double) var6) * -325.949D) & 0x7FF;
                    if (Statics.field908 < 128) {
                        Statics.field908 = 128;
                    }
                    if (Statics.field908 > 383) {
                        Statics.field908 = 383;
                    }
                }
                field388 = -1;
                return true;
            }
            if (field388 == 220) {
                int var8 = field535.method2488();
                class173 var9 = class173.method945(var8);
                var9.field2718 = 3;
                var9.field2769 = Statics.field677.field39.method3216();
                method628(var9);
                field388 = -1;
                return true;
            }
            if (field388 == 60) {
                int var10 = field535.method2331();
                int var11 = field535.method2331();
                if (Statics.field2635 == null || !Statics.field2635.isValid()) {
                    try {
                        Iterator var12 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var12.hasNext()) {
                            GarbageCollectorMXBean var13 = (GarbageCollectorMXBean) var12.next();
                            if (var13.isValid()) {
                                Statics.field2635 = var13;
                                field569 = -1L;
                                field290 = -1L;
                            }
                        }
                    } catch (Throwable var288) {
                    }
                }
                long var15 = class115.method671();
                int var17 = -1;
                if (Statics.field2635 != null) {
                    long var18 = Statics.field2635.getCollectionTime();
                    if (field290 != -1L) {
                        long var20 = var18 - field290;
                        long var22 = var15 - field569;
                        if (var22 != 0L) {
                            var17 = (int) (var20 * 100L / var22);
                        }
                    }
                    field290 = var18;
                    field569 = var15;
                }
                field337.method2574(250);
                field337.method2351(var17);
                field337.method2411(var10);
                field337.method2315(var11);
                field337.method2513(field2177);
                field388 = -1;
                return true;
            }
            if (field388 == 224) {
                for (int var24 = 0; var24 < Statics.field1165; var24++) {
                    class53 var25 = class53.method39(var24);
                    if (var25 != null) {
                        class176.field2872[var24] = 0;
                        class176.field2875[var24] = 0;
                    }
                }
                method124();
                field476 += 32;
                field388 = -1;
                return true;
            }
            if (field388 == 173) {
                int var26 = field535.method2488();
                int var27 = field535.method2373();
                class4 var28 = (class4) field450.method3459((long) var27);
                class4 var29 = (class4) field450.method3459((long) var26);
                if (var29 != null) {
                    method109(var29, var28 == null || var28.field63 != var29.field63);
                }
                if (var28 != null) {
                    var28.method3588();
                    field450.method3460(var28, (long) var26);
                }
                class173 var30 = class173.method945(var27);
                if (var30 != null) {
                    method628(var30);
                }
                class173 var31 = class173.method945(var26);
                if (var31 != null) {
                    method628(var31);
                    method892(Statics.field2745[var31.field2727 >>> 16], var31, true);
                }
                if (field413 != -1) {
                    int var32 = field413;
                    if (Statics.method723(var32)) {
                        method1063(Statics.field2745[var32], 1);
                    }
                }
                field388 = -1;
                return true;
            }
            if (field388 == 103) {
                int var33 = field535.method2326();
                if (field535.method2326() == 0) {
                    field567[var33] = new class220();
                    field535.field1973 += 18;
                } else {
                    field535.field1973--;
                    field567[var33] = new class220(field535, false);
                }
                field342 = field357;
                field388 = -1;
                return true;
            }
            if (field388 == 25) {
                int var34 = field535.method2525();
                int var35 = field535.method2326();
                int var36 = field535.method2525();
                if (field528 != 0 && var35 != 0 && field550 < 50) {
                    field533[field550] = var34;
                    field534[field550] = var35;
                    field542[field550] = var36;
                    field469[field550] = null;
                    field294[field550] = 0;
                    field550++;
                }
                field388 = -1;
                return true;
            }
            if (field388 == 138) {
                int var40 = field535.method2331();
                int var41 = field535.method2525();
                class173 var42 = class173.method945(var40);
                if (var42.field2718 != 1 || var42.field2769 != var41) {
                    var42.field2718 = 1;
                    var42.field2769 = var41;
                    method628(var42);
                }
                field388 = -1;
                return true;
            }
            if (field388 == 250) {
                field351 = field357;
                if (field396 == 0) {
                    field517 = null;
                    field518 = null;
                    Statics.field1543 = 0;
                    Statics.field179 = null;
                    field388 = -1;
                    return true;
                }
                field518 = field535.method2334();
                long var43 = field535.method2332();
                long var45 = var43;
                String var47;
                if (var43 <= 0L || var43 >= 6582952005840035281L) {
                    var47 = null;
                } else if (var43 % 37L == 0L) {
                    var47 = null;
                } else {
                    int var48 = 0;
                    for (long var49 = var43; var49 != 0L; var49 /= 37L) {
                        var48++;
                    }
                    StringBuilder var51 = new StringBuilder(var48);
                    while (var45 != 0L) {
                        long var52 = var45;
                        var45 /= 37L;
                        var51.append(class162.field2625[(int) (var52 - var45 * 37L)]);
                    }
                    var47 = var51.reverse().toString();
                }
                field517 = var47;
                Statics.field1048 = field535.method2461();
                int var54 = field535.method2326();
                if (var54 == 255) {
                    field388 = -1;
                    return true;
                }
                Statics.field1543 = var54;
                class25[] var55 = new class25[100];
                for (int var56 = 0; var56 < Statics.field1543; var56++) {
                    var55[var56] = new class25();
                    var55[var56].field629 = field535.method2334();
                    var55[var56].field626 = class164.method171(var55[var56].field629, Statics.field2000);
                    var55[var56].field627 = field535.method2525();
                    var55[var56].field625 = field535.method2461();
                    field535.method2334();
                    if (var55[var56].field629.equals(Statics.field677.field38)) {
                        Statics.field173 = var55[var56].field625;
                    }
                }
                boolean var57 = false;
                int var58 = Statics.field1543;
                while (var58 > 0) {
                    boolean var59 = true;
                    var58--;
                    for (int var60 = 0; var60 < var58; var60++) {
                        if (var55[var60].field626.compareTo(var55[var60 + 1].field626) > 0) {
                            class25 var61 = var55[var60];
                            var55[var60] = var55[var60 + 1];
                            var55[var60 + 1] = var61;
                            var59 = false;
                        }
                    }
                    if (var59) {
                        break;
                    }
                }
                Statics.field179 = var55;
                field388 = -1;
                return true;
            }
            if (field388 == 23) {
                class33.method453(field535, field396);
                field388 = -1;
                return true;
            }
            if (field388 == 121) {
                int var62 = field535.method2488();
                int var63 = field535.method2362();
                int var64 = field535.method2353();
                class4 var65 = (class4) field450.method3459((long) var62);
                if (var65 != null) {
                    method109(var65, var65.field63 != var63);
                }
                method559(var62, var63, var64);
                field388 = -1;
                return true;
            }
            if (field388 == 10) {
                method2601();
                field388 = -1;
                return false;
            }
            if (field388 == 183 || field388 == 179 || field388 == 44 || field388 == 198 || field388 == 15 || field388 == 140 || field388 == 63 || field388 == 180 || field388 == 159 || field388 == 72) {
                method2900();
                field388 = -1;
                return true;
            }
            if (field388 == 118) {
                int var66 = field535.method2331();
                Statics.field13 = Statics.field1981.method2677(var66);
                field388 = -1;
                return true;
            }
            if (field388 == 205) {
                class33.field750 = 0;
                for (int var67 = 0; var67 < 2048; var67++) {
                    class33.field754[var67] = null;
                    class33.field745[var67] = 1;
                }
                for (int var68 = 0; var68 < 2048; var68++) {
                    field412[var68] = null;
                }
                class33.method588(field535);
                field388 = -1;
                return true;
            }
            if (field388 == 92) {
                field535.field1973 += 28;
                if (field535.method2436()) {
                    class122 var69 = field535;
                    int var70 = field535.field1973 - 28;
                    if (class149.field2217 != null) {
                        try {
                            class149.field2217.method3806(0L);
                            class149.field2217.method3811(var69.field1974, var70, 24);
                        } catch (Exception var287) {
                        }
                    }
                }
                field388 = -1;
                return true;
            }
            if (field388 == 35) {
                int var72 = field535.method2525();
                field413 = var72;
                method2610(field413, Statics.field2114, Statics.field2638, false);
                method189(var72);
                class37.method573(field413);
                for (int var73 = 0; var73 < 100; var73++) {
                    field495[var73] = true;
                }
                field388 = -1;
                return true;
            }
            if (field388 == 9) {
                int var74 = field535.method2331();
                class4 var75 = (class4) field450.method3459((long) var74);
                if (var75 != null) {
                    method109(var75, true);
                }
                if (field453 != null) {
                    method628(field453);
                    field453 = null;
                }
                field388 = -1;
                return true;
            }
            if (field388 == 101) {
                int var76 = field535.method2353();
                int var77 = field535.method2465();
                String var78 = field535.method2334();
                if (var76 >= 1 && var76 <= 8) {
                    if (var78.equalsIgnoreCase("null")) {
                        var78 = null;
                    }
                    field418[var76 - 1] = var78;
                    field547[var76 - 1] = var77 == 0;
                }
                field388 = -1;
                return true;
            }
            if (field388 == 219) {
                method124();
                int var79 = field535.method2331();
                int var80 = field535.method2400();
                int var81 = field535.method2465();
                field428[var81] = var79;
                field426[var81] = var80;
                field427[var81] = 1;
                for (int var82 = 0; var82 < 98; var82++) {
                    if (var79 >= class155.field2276[var82]) {
                        field427[var81] = var82 + 2;
                    }
                }
                field479[++field532 - 1 & 0x1F] = var81;
                field388 = -1;
                return true;
            }
            if (field388 == 42) {
                field431 = true;
                Statics.field1560 = field535.method2326();
                Statics.field1371 = field535.method2326();
                Statics.field395 = field535.method2525();
                Statics.field2647 = field535.method2326();
                Statics.field1091 = field535.method2326();
                if (Statics.field1091 >= 100) {
                    Statics.field226 = Statics.field1560 * 128 + 64;
                    Statics.field217 = Statics.field1371 * 128 + 64;
                    Statics.field165 = Statics.method200(Statics.field226, Statics.field217, Statics.field27) - Statics.field395;
                }
                field388 = -1;
                return true;
            }
            if (field388 == 170) {
                int var83 = field535.method2373();
                int var84 = field535.method2361();
                class176.field2872[var84] = var83;
                if (class176.field2875[var84] != var83) {
                    class176.field2875[var84] = var83;
                    method554(var84);
                }
                field475[++field476 - 1 & 0x1F] = var84;
                field388 = -1;
                return true;
            }
            if (field388 == 197) {
                method957(true);
                field388 = -1;
                return true;
            }
            if (field388 == 153) {
                field526 = field535.method2326();
                field388 = -1;
                return true;
            }
            if (field388 == 46) {
                field548 = field535.method2361() * 30;
                field485 = field357;
                field388 = -1;
                return true;
            }
            if (field388 == 151) {
                field363 = field535.method2326();
                field509 = field535.method2326();
                field388 = -1;
                return true;
            }
            if (field388 == 110) {
                class26 var85 = new class26();
                var85.field642 = field535.method2334();
                var85.field641 = field535.method2525();
                int var86 = field535.method2331();
                var85.field640 = var86;
                method139(45);
                Statics.field154.method2794();
                Statics.field154 = null;
                Statics.method980(var85);
                field388 = -1;
                return false;
            }
            if (field388 == 58) {
                field559 = 1;
                field329 = field357;
                field388 = -1;
                return true;
            }
            if (field388 == 162) {
                boolean var87 = field535.method2326() == 1;
                if (var87) {
                    Statics.field2874 = class115.method671() - field535.method2332();
                    Statics.field68 = new class221(field535, true);
                } else {
                    Statics.field68 = null;
                }
                field514 = field357;
                field388 = -1;
                return true;
            }
            if (field388 == 95) {
                int var88 = field535.method2362();
                if (var88 == 65535) {
                    var88 = -1;
                }
                method2908(var88);
                field388 = -1;
                return true;
            }
            if (field388 == 233) {
                int var89 = field535.method2368();
                int var90 = field535.method2361();
                if (var90 == 65535) {
                    var90 = -1;
                }
                Statics.method2909(var90, var89);
                field388 = -1;
                return true;
            }
            if (field388 == 142) {
                int var91 = field535.method2326();
                int var92 = field535.method2326();
                int var93 = field535.method2326();
                int var94 = field535.method2326();
                field310[var91] = true;
                field474[var91] = var92;
                field449[var91] = var93;
                field543[var91] = var94;
                field544[var91] = 0;
                field388 = -1;
                return true;
            }
            if (field388 == 226) {
                String var95 = field535.method2334();
                int var96 = field535.method2373();
                class173 var97 = class173.method945(var96);
                if (!var95.equals(var97.field2721)) {
                    var97.field2721 = var95;
                    method628(var97);
                }
                field388 = -1;
                return true;
            }
            if (field388 == 13) {
                method696(true);
                field535.method2575();
                int var98 = field535.method2525();
                class33.method453(field535, var98);
                field388 = -1;
                return true;
            }
            if (field388 == 234) {
                int var99 = field535.method2362();
                class16 var100 = (class16) class16.field228.method3459((long) var99);
                if (var100 != null) {
                    var100.method3588();
                }
                field477[++field478 - 1 & 0x1F] = var99 & 0x7FFF;
                field388 = -1;
                return true;
            }
            if (field388 == 236) {
                Statics.field1166 = field535.method2353();
                Statics.field605 = field535.method2326();
                field388 = -1;
                return true;
            }
            if (field388 == 114) {
                int var101 = field535.method2331();
                int var102 = field535.method2525();
                if (var101 < -70000) {
                    var102 += 32768;
                }
                class173 var103;
                if (var101 >= 0) {
                    var103 = class173.method945(var101);
                } else {
                    var103 = null;
                }
                while (field535.field1973 < field396) {
                    int var104 = field535.method2321();
                    int var105 = field535.method2525();
                    int var106 = 0;
                    if (var105 != 0) {
                        var106 = field535.method2326();
                        if (var106 == 255) {
                            var106 = field535.method2331();
                        }
                    }
                    if (var103 != null && var104 >= 0 && var104 < var103.field2742.length) {
                        var103.field2742[var104] = var105;
                        var103.field2800[var104] = var106;
                    }
                    class16.method2704(var102, var104, var105 - 1, var106);
                }
                if (var103 != null) {
                    method628(var103);
                }
                method124();
                field477[++field478 - 1 & 0x1F] = var102 & 0x7FFF;
                field388 = -1;
                return true;
            }
            if (field388 == 120) {
                class211.method630(field535, field396);
                field388 = -1;
                return true;
            }
            if (field388 == 105) {
                int var107 = field396 + field535.field1973;
                int var108 = field535.method2525();
                int var109 = field535.method2525();
                if (field413 != var108) {
                    field413 = var108;
                    method2610(field413, Statics.field2114, Statics.field2638, false);
                    method189(field413);
                    class37.method573(field413);
                    for (int var110 = 0; var110 < 100; var110++) {
                        field495[var110] = true;
                    }
                }
                while (var109-- > 0) {
                    int var111 = field535.method2331();
                    int var112 = field535.method2525();
                    int var113 = field535.method2326();
                    class4 var114 = (class4) field450.method3459((long) var111);
                    if (var114 != null && var114.field63 != var112) {
                        method109(var114, true);
                        var114 = null;
                    }
                    if (var114 == null) {
                        var114 = method559(var111, var112, var113);
                    }
                    var114.field58 = true;
                }
                for (class4 var115 = (class4) field450.method3461(); var115 != null; var115 = (class4) field450.method3462()) {
                    if (var115.field58) {
                        var115.field58 = false;
                    } else {
                        method109(var115, true);
                    }
                }
                field492 = new class196(512);
                while (field535.field1973 < var107) {
                    int var116 = field535.method2331();
                    int var117 = field535.method2525();
                    int var118 = field535.method2525();
                    int var119 = field535.method2331();
                    for (int var120 = var117; var120 <= var118; var120++) {
                        long var121 = ((long) var116 << 32) + (long) var120;
                        field492.method3460(new class201(var119), var121);
                    }
                }
                field388 = -1;
                return true;
            }
            if (field388 == 65) {
                String var123 = field535.method2334();
                int var124 = field535.method2525();
                byte var125 = field535.method2461();
                boolean var126 = false;
                if (var125 == -128) {
                    var126 = true;
                }
                if (var126) {
                    if (Statics.field1543 == 0) {
                        field388 = -1;
                        return true;
                    }
                    boolean var127 = false;
                    int var128;
                    for (var128 = 0; var128 < Statics.field1543 && (!Statics.field179[var128].field629.equals(var123) || Statics.field179[var128].field627 != var124); var128++) {
                    }
                    if (var128 < Statics.field1543) {
                        while (var128 < Statics.field1543 - 1) {
                            Statics.field179[var128] = Statics.field179[var128 + 1];
                            var128++;
                        }
                        Statics.field1543--;
                        Statics.field179[Statics.field1543] = null;
                    }
                } else {
                    field535.method2334();
                    class25 var129 = new class25();
                    var129.field629 = var123;
                    var129.field626 = class164.method171(var129.field629, Statics.field2000);
                    var129.field627 = var124;
                    var129.field625 = var125;
                    int var130;
                    for (var130 = Statics.field1543 - 1; var130 >= 0; var130--) {
                        int var131 = Statics.field179[var130].field626.compareTo(var129.field626);
                        if (var131 == 0) {
                            Statics.field179[var130].field627 = var124;
                            Statics.field179[var130].field625 = var125;
                            if (var123.equals(Statics.field677.field38)) {
                                Statics.field173 = var125;
                            }
                            field351 = field357;
                            field388 = -1;
                            return true;
                        }
                        if (var131 < 0) {
                            break;
                        }
                    }
                    if (Statics.field1543 >= Statics.field179.length) {
                        field388 = -1;
                        return true;
                    }
                    for (int var132 = Statics.field1543 - 1; var132 > var130; var132--) {
                        Statics.field179[var132 + 1] = Statics.field179[var132];
                    }
                    if (Statics.field1543 == 0) {
                        Statics.field179 = new class25[100];
                    }
                    Statics.field179[var130 + 1] = var129;
                    Statics.field1543++;
                    if (var123.equals(Statics.field677.field38)) {
                        Statics.field173 = var125;
                    }
                }
                field351 = field357;
                field388 = -1;
                return true;
            }
            if (field388 == 45) {
                int var133 = field535.method2321();
                boolean var134 = field535.method2326() == 1;
                String var135 = "";
                boolean var136 = false;
                if (var134) {
                    var135 = field535.method2334();
                    if (method187(var135)) {
                        var136 = true;
                    }
                }
                String var137 = field535.method2334();
                if (!var136) {
                    class12.method2628(var133, var135, var137);
                }
                field388 = -1;
                return true;
            }
            if (field388 == 152) {
                method696(false);
                field535.method2575();
                int var138 = field535.method2525();
                class33.method453(field535, var138);
                field388 = -1;
                return true;
            }
            if (field388 == 239) {
                int var139 = field535.method2525();
                int var140 = field535.method2525();
                int var141 = field535.method2331();
                class173 var142 = class173.method945(var141);
                var142.field2736 = (var140 << 16) + var139;
                field388 = -1;
                return true;
            }
            if (field388 == 132) {
                method124();
                field455 = field535.method2383();
                field485 = field357;
                field388 = -1;
                return true;
            }
            if (field388 == 99) {
                int var143 = field535.method2525();
                int var144 = field535.method2361();
                int var145 = field535.method2525();
                int var146 = field535.method2331();
                class173 var147 = class173.method945(var146);
                if (var147.field2776 != var144 || var147.field2784 != var145 || var147.field2790 != var143) {
                    var147.field2776 = var144;
                    var147.field2784 = var145;
                    var147.field2790 = var143;
                    method628(var147);
                }
                field388 = -1;
                return true;
            }
            if (field388 == 82) {
                int var148 = field535.method2331();
                class173 var149 = class173.method945(var148);
                for (int var150 = 0; var150 < var149.field2742.length; var150++) {
                    var149.field2742[var150] = -1;
                    var149.field2742[var150] = 0;
                }
                method628(var149);
                field388 = -1;
                return true;
            }
            if (field388 == 12) {
                int var151 = field535.method2326();
                class130[] var152 = class130.method2270();
                int var153 = 0;
                class130 var155;
                while (true) {
                    if (var153 >= var152.length) {
                        var155 = null;
                        break;
                    }
                    class130 var154 = var152[var153];
                    if (var154.field2044 == var151) {
                        var155 = var154;
                        break;
                    }
                    var153++;
                }
                Statics.field218 = var155;
                field388 = -1;
                return true;
            }
            if (field388 == 171) {
                String var156 = field535.method2334();
                long var157 = field535.method2332();
                long var159 = (long) field535.method2525();
                long var161 = (long) field535.method2476();
                class152 var163 = (class152) class109.method104(class152.method2875(), field535.method2326());
                long var164 = (var159 << 32) + var161;
                boolean var166 = false;
                for (int var167 = 0; var167 < 100; var167++) {
                    if (field511[var167] == var164) {
                        var166 = true;
                        break;
                    }
                }
                if (var163.field2245 && method187(var156)) {
                    var166 = true;
                }
                if (!var166 && field411 == 0) {
                    field511[field512] = var164;
                    field512 = (field512 + 1) % 100;
                    class122 var168 = field535;
                    String var169 = Statics.method2619(var168, 32767);
                    String var170 = class223.method3766(class163.method2024(var169));
                    if (var163.field2237 == -1) {
                        class12.method2247(9, var156, var170, class162.method1554(var157));
                    } else {
                        int var171 = var163.field2237;
                        String var172 = "<img=" + var171 + ">";
                        class12.method2247(9, var172 + var156, var170, class162.method1554(var157));
                    }
                }
                field388 = -1;
                return true;
            }
            if (field388 == 75) {
                int var173 = field535.method2361();
                int var174 = field535.method2488();
                class173 var175 = class173.method945(var174);
                if (var175.field2718 != 2 || var175.field2769 != var173) {
                    var175.field2718 = 2;
                    var175.field2769 = var173;
                    method628(var175);
                }
                field388 = -1;
                return true;
            }
            if (field388 == 16) {
                field311 = field535.method2326();
                if (field311 == 1) {
                    field312 = field535.method2525();
                }
                if (field311 >= 2 && field311 <= 6) {
                    if (field311 == 2) {
                        field317 = 64;
                        field486 = 64;
                    }
                    if (field311 == 3) {
                        field317 = 0;
                        field486 = 64;
                    }
                    if (field311 == 4) {
                        field317 = 128;
                        field486 = 64;
                    }
                    if (field311 == 5) {
                        field317 = 64;
                        field486 = 0;
                    }
                    if (field311 == 6) {
                        field317 = 64;
                        field486 = 128;
                    }
                    field311 = 2;
                    field566 = field535.method2525();
                    field315 = field535.method2525();
                    field510 = field535.method2326();
                }
                if (field311 == 10) {
                    field343 = field535.method2525();
                }
                field388 = -1;
                return true;
            }
            if (field388 == 240) {
                field431 = false;
                for (int var176 = 0; var176 < 5; var176++) {
                    field310[var176] = false;
                }
                field388 = -1;
                return true;
            }
            if (field388 == 208) {
                while (field535.field1973 < field396) {
                    int var177 = field535.method2326();
                    boolean var178 = (var177 & 0x1) == 1;
                    String var179 = field535.method2334();
                    String var180 = field535.method2334();
                    field535.method2334();
                    for (int var181 = 0; var181 < field562; var181++) {
                        class8 var182 = field563[var181];
                        if (var178) {
                            if (var180.equals(var182.field138)) {
                                var182.field138 = var179;
                                var182.field128 = var180;
                                var179 = null;
                                break;
                            }
                        } else if (var179.equals(var182.field138)) {
                            var182.field138 = var179;
                            var182.field128 = var180;
                            var179 = null;
                            break;
                        }
                    }
                    if (var179 != null && field562 < 400) {
                        class8 var183 = new class8();
                        field563[field562] = var183;
                        var183.field138 = var179;
                        var183.field128 = var180;
                        field562++;
                    }
                }
                field329 = field357;
                field388 = -1;
                return true;
            }
            if (field388 == 218) {
                int var184 = field535.method2331();
                int var185 = field535.method2364();
                int var186 = field535.method2366();
                class173 var187 = class173.method945(var184);
                if (var187.field2823 != var186 || var187.field2737 != var185 || var187.field2732 != 0 || var187.field2733 != 0) {
                    var187.field2823 = var186;
                    var187.field2737 = var185;
                    var187.field2732 = 0;
                    var187.field2733 = 0;
                    method628(var187);
                    method2271(var187);
                    if (var187.field2729 == 0) {
                        method892(Statics.field2745[var184 >> 16], var187, false);
                    }
                }
                field388 = -1;
                return true;
            }
            if (field388 == 141) {
                String var188 = field535.method2334();
                Object[] var189 = new Object[var188.length() + 1];
                for (int var190 = var188.length() - 1; var190 >= 0; var190--) {
                    if (var188.charAt(var190) == 's') {
                        var189[var190 + 1] = field535.method2334();
                    } else {
                        var189[var190 + 1] = Integer.valueOf(field535.method2331());
                    }
                }
                var189[0] = Integer.valueOf(field535.method2331());
                class1 var191 = new class1();
                var191.field15 = var189;
                class37.method1926(var191);
                field388 = -1;
                return true;
            }
            if (field388 == 243) {
                int var192 = field535.method2361();
                if (var192 == 65535) {
                    var192 = -1;
                }
                int var193 = field535.method2488();
                int var194 = field535.method2373();
                class173 var195 = class173.method945(var193);
                if (var195.field2726) {
                    var195.field2845 = var192;
                    var195.field2846 = var194;
                    class52 var197 = class52.method560(var192);
                    var195.field2776 = var197.field1150;
                    var195.field2784 = var197.field1113;
                    var195.field2778 = var197.field1126;
                    var195.field2779 = var197.field1127;
                    var195.field2775 = var197.field1119;
                    var195.field2790 = var197.field1123;
                    if (var197.field1149 == 1) {
                        var195.field2783 = 1;
                    } else {
                        var195.field2783 = 2;
                    }
                    if (var195.field2780 > 0) {
                        var195.field2790 = var195.field2790 * 32 / var195.field2780;
                    } else if (var195.field2738 > 0) {
                        var195.field2790 = var195.field2790 * 32 / var195.field2738;
                    }
                    method628(var195);
                } else if (var192 == -1) {
                    var195.field2718 = 0;
                    field388 = -1;
                    return true;
                } else {
                    class52 var196 = class52.method560(var192);
                    var195.field2718 = 4;
                    var195.field2769 = var192;
                    var195.field2776 = var196.field1150;
                    var195.field2784 = var196.field1113;
                    var195.field2790 = var196.field1123 * 100 / var194;
                    method628(var195);
                }
                field388 = -1;
                return true;
            }
            if (field388 == 158) {
                int var198 = field535.method2525();
                byte var199 = field535.method2355();
                class176.field2872[var198] = var199;
                if (class176.field2875[var198] != var199) {
                    class176.field2875[var198] = var199;
                    method554(var198);
                }
                field475[++field476 - 1 & 0x1F] = var198;
                field388 = -1;
                return true;
            }
            if (field388 == 123) {
                method957(false);
                field388 = -1;
                return true;
            }
            if (field388 == 87) {
                int var200 = field535.method2331();
                int var201 = field535.method2525();
                if (var200 < -70000) {
                    var201 += 32768;
                }
                class173 var202;
                if (var200 >= 0) {
                    var202 = class173.method945(var200);
                } else {
                    var202 = null;
                }
                if (var202 != null) {
                    for (int var203 = 0; var203 < var202.field2742.length; var203++) {
                        var202.field2742[var203] = 0;
                        var202.field2800[var203] = 0;
                    }
                }
                class16 var204 = (class16) class16.field228.method3459((long) var201);
                if (var204 != null) {
                    for (int var205 = 0; var205 < var204.field224.length; var205++) {
                        var204.field224[var205] = -1;
                        var204.field225[var205] = 0;
                    }
                }
                int var206 = field535.method2525();
                for (int var207 = 0; var207 < var206; var207++) {
                    int var208 = field535.method2465();
                    if (var208 == 255) {
                        var208 = field535.method2373();
                    }
                    int var209 = field535.method2363();
                    if (var202 != null && var207 < var202.field2742.length) {
                        var202.field2742[var207] = var209;
                        var202.field2800[var207] = var208;
                    }
                    class16.method2704(var201, var207, var209 - 1, var208);
                }
                if (var202 != null) {
                    method628(var202);
                }
                method124();
                field477[++field478 - 1 & 0x1F] = var201 & 0x7FFF;
                field388 = -1;
                return true;
            }
            if (field388 == 14) {
                int var210 = field535.method2373();
                int var211 = field535.method2525();
                class173 var212 = class173.method945(var210);
                if (var212 != null && var212.field2729 == 0) {
                    if (var211 > var212.field2850 - var212.field2743) {
                        var211 = var212.field2850 - var212.field2743;
                    }
                    if (var211 < 0) {
                        var211 = 0;
                    }
                    if (var212.field2749 != var211) {
                        var212.field2749 = var211;
                        method628(var212);
                    }
                }
                field388 = -1;
                return true;
            }
            if (field388 == 255) {
                int var213 = field535.method2525();
                if (var213 == 65535) {
                    var213 = -1;
                }
                int var214 = field535.method2331();
                int var215 = field535.method2525();
                if (var215 == 65535) {
                    var215 = -1;
                }
                int var216 = field535.method2374();
                for (int var217 = var213; var217 <= var215; var217++) {
                    long var218 = ((long) var216 << 32) + (long) var217;
                    class208 var220 = field492.method3459(var218);
                    if (var220 != null) {
                        var220.method3588();
                    }
                    field492.method3460(new class201(var214), var218);
                }
                field388 = -1;
                return true;
            }
            if (field388 == 145) {
                method3226(field535.method2334());
                field388 = -1;
                return true;
            }
            if (field388 == 176) {
                int var221 = field535.method2362();
                int var222 = field535.method2331();
                int var223 = var221 >> 10 & 0x1F;
                int var224 = var221 >> 5 & 0x1F;
                int var225 = var221 & 0x1F;
                int var226 = (var225 << 3) + (var223 << 19) + (var224 << 11);
                class173 var227 = class173.method945(var222);
                if (var227.field2798 != var226) {
                    var227.field2798 = var226;
                    method628(var227);
                }
                field388 = -1;
                return true;
            }
            if (field388 == 124) {
                int var228 = field535.method2373();
                boolean var229 = field535.method2353() == 1;
                class173 var230 = class173.method945(var228);
                if (var230.field2724 != var229) {
                    var230.field2724 = var229;
                    method628(var230);
                }
                field388 = -1;
                return true;
            }
            if (field388 == 22) {
                Statics.field1166 = field535.method2465();
                Statics.field605 = field535.method2465();
                while (field535.field1973 < field396) {
                    field388 = field535.method2326();
                    method2900();
                }
                field388 = -1;
                return true;
            }
            if (field388 == 26) {
                int var231 = field535.method2523();
                int var232 = field535.method2374();
                class173 var233 = class173.method945(var232);
                if (var233.field2751 != var231 || var231 == -1) {
                    var233.field2751 = var231;
                    var233.field2859 = 0;
                    var233.field2794 = 0;
                    method628(var233);
                }
                field388 = -1;
                return true;
            }
            if (field388 == 156) {
                if (field413 != -1) {
                    int var234 = field413;
                    if (Statics.method723(var234)) {
                        method1063(Statics.field2745[var234], 0);
                    }
                }
                field388 = -1;
                return true;
            }
            if (field388 == 106) {
                String var235 = field535.method2334();
                long var236 = (long) field535.method2525();
                long var238 = (long) field535.method2476();
                class152 var240 = (class152) class109.method104(class152.method2875(), field535.method2326());
                long var241 = (var236 << 32) + var238;
                boolean var243 = false;
                for (int var244 = 0; var244 < 100; var244++) {
                    if (field511[var244] == var241) {
                        var243 = true;
                        break;
                    }
                }
                if (method187(var235)) {
                    var243 = true;
                }
                if (!var243 && field411 == 0) {
                    field511[field512] = var241;
                    field512 = (field512 + 1) % 100;
                    class122 var245 = field535;
                    String var246 = Statics.method2619(var245, 32767);
                    String var247 = class223.method3766(class163.method2024(var246));
                    byte var248;
                    if (var240.field2244) {
                        var248 = 7;
                    } else {
                        var248 = 3;
                    }
                    if (var240.field2237 == -1) {
                        class12.method2628(var248, var235, var247);
                    } else {
                        int var250 = var240.field2237;
                        String var251 = "<img=" + var250 + ">";
                        class12.method2628(var248, var251 + var235, var247);
                    }
                }
                field388 = -1;
                return true;
            }
            if (field388 == 74) {
                for (int var252 = 0; var252 < class176.field2875.length; var252++) {
                    if (class176.field2875[var252] != class176.field2872[var252]) {
                        class176.field2875[var252] = class176.field2872[var252];
                        method554(var252);
                        field475[++field476 - 1 & 0x1F] = var252;
                    }
                }
                field388 = -1;
                return true;
            }
            if (field388 == 6) {
                while (field535.field1973 < field396) {
                    boolean var253 = field535.method2326() == 1;
                    String var254 = field535.method2334();
                    String var255 = field535.method2334();
                    int var256 = field535.method2525();
                    int var257 = field535.method2326();
                    int var258 = field535.method2326();
                    boolean var259 = (var258 & 0x2) != 0;
                    boolean var260 = (var258 & 0x1) != 0;
                    if (var256 > 0) {
                        field535.method2334();
                        field535.method2326();
                        field535.method2331();
                    }
                    field535.method2334();
                    for (int var261 = 0; var261 < field419; var261++) {
                        class18 var262 = field369[var261];
                        if (var253) {
                            if (var255.equals(var262.field253)) {
                                var262.field253 = var254;
                                var262.field254 = var255;
                                var254 = null;
                                break;
                            }
                        } else if (var254.equals(var262.field253)) {
                            if (var262.field260 != var256) {
                                boolean var263 = true;
                                for (class39 var264 = (class39) field339.method3452(); var264 != null; var264 = (class39) field339.method3453()) {
                                    if (var264.field864.equals(var254)) {
                                        if (var256 != 0 && var264.field865 == 0) {
                                            var264.method3584();
                                            var263 = false;
                                        } else if (var256 == 0 && var264.field865 != 0) {
                                            var264.method3584();
                                            var263 = false;
                                        }
                                    }
                                }
                                if (var263) {
                                    field339.method3451(new class39(var254, var256));
                                }
                                var262.field260 = var256;
                            }
                            var262.field254 = var255;
                            var262.field259 = var257;
                            var262.field256 = var259;
                            var262.field257 = var260;
                            var254 = null;
                            break;
                        }
                    }
                    if (var254 != null && field419 < 400) {
                        class18 var265 = new class18();
                        field369[field419] = var265;
                        var265.field253 = var254;
                        var265.field254 = var255;
                        var265.field260 = var256;
                        var265.field259 = var257;
                        var265.field256 = var259;
                        var265.field257 = var260;
                        field419++;
                    }
                }
                field559 = 2;
                field329 = field357;
                boolean var266 = false;
                int var267 = field419;
                while (var267 > 0) {
                    boolean var268 = true;
                    var267--;
                    for (int var269 = 0; var269 < var267; var269++) {
                        boolean var270 = false;
                        class18 var271 = field369[var269];
                        class18 var272 = field369[var269 + 1];
                        if (field293 != var271.field260 && field293 == var272.field260) {
                            var270 = true;
                        }
                        if (!var270 && var271.field260 == 0 && var272.field260 != 0) {
                            var270 = true;
                        }
                        if (!var270 && !var271.field256 && var272.field256) {
                            var270 = true;
                        }
                        if (!var270 && !var271.field257 && var272.field257) {
                            var270 = true;
                        }
                        if (var270) {
                            class18 var273 = field369[var269];
                            field369[var269] = field369[var269 + 1];
                            field369[var269 + 1] = var273;
                            var268 = false;
                        }
                    }
                    if (var268) {
                        break;
                    }
                }
                field388 = -1;
                return true;
            }
            if (field388 == 200) {
                Statics.field1166 = field535.method2465();
                Statics.field605 = field535.method2353();
                for (int var274 = Statics.field605; var274 < Statics.field605 + 8; var274++) {
                    for (int var275 = Statics.field1166; var275 < Statics.field1166 + 8; var275++) {
                        if (field422[Statics.field27][var274][var275] != null) {
                            field422[Statics.field27][var274][var275] = null;
                            method2258(var274, var275);
                        }
                    }
                }
                for (class17 var276 = (class17) field423.method3493(); var276 != null; var276 = (class17) field423.method3495()) {
                    if (var276.field236 >= Statics.field605 && var276.field236 < Statics.field605 + 8 && var276.field237 >= Statics.field1166 && var276.field237 < Statics.field1166 + 8 && Statics.field27 == var276.field249) {
                        var276.field247 = 0;
                    }
                }
                field388 = -1;
                return true;
            }
            if (field388 == 157) {
                String var277 = field535.method2334();
                class122 var278 = field535;
                String var279 = Statics.method2619(var278, 32767);
                String var280 = class223.method3766(class163.method2024(var279));
                class12.method2628(6, var277, var280);
                field388 = -1;
                return true;
            }
            if (field388 == 11) {
                field460 = field535.method2326();
                if (field460 == 255) {
                    field460 = 0;
                }
                field525 = field535.method2326();
                if (field525 == 255) {
                    field525 = 0;
                }
                field388 = -1;
                return true;
            }
            if (field388 == 136) {
                method124();
                field560 = field535.method2326();
                field485 = field357;
                field388 = -1;
                return true;
            }
            if (field388 == 38) {
                for (int var281 = 0; var281 < field412.length; var281++) {
                    if (field412[var281] != null) {
                        field412[var281].field833 = -1;
                    }
                }
                for (int var282 = 0; var282 < field415.length; var282++) {
                    if (field415[var282] != null) {
                        field415[var282].field833 = -1;
                    }
                }
                field388 = -1;
                return true;
            }
            class148.method2701("" + field388 + class2.field17 + field425 + class2.field17 + field452 + class2.field17 + field396, (Throwable) null);
            method2601();
        } catch (IOException var289) {
            method2986();
        } catch (Exception var290) {
            String var285 = "" + field388 + class2.field17 + field425 + class2.field17 + field452 + class2.field17 + field396 + class2.field17 + (Statics.field941 + Statics.field677.field856[0]) + class2.field17 + (Statics.field23 + Statics.field677.field857[0]) + class2.field17;
            for (int var286 = 0; var286 < field396 && var286 < 50; var286++) {
                var285 = var285 + field535.field1974[var286] + class2.field17;
            }
            class148.method2701(var285, var290);
            method2601();
        }
        return true;
    }

    @ObfuscatedName("eh.bh(B)V")
    public static final void method2900() {
        if (field388 == 159) {
            int var0 = field535.method2400();
            int var1 = var0 >> 2;
            int var2 = var0 & 0x3;
            int var3 = field354[var1];
            int var4 = field535.method2326();
            int var5 = (var4 >> 4 & 0x7) + Statics.field605;
            int var6 = (var4 & 0x7) + Statics.field1166;
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                method123(Statics.field27, var5, var6, var3, -1, var1, var2, 0, -1);
            }
        } else if (field388 == 72) {
            int var7 = field535.method2400();
            int var8 = var7 >> 2;
            int var9 = var7 & 0x3;
            int var10 = field354[var8];
            int var11 = field535.method2363();
            int var12 = field535.method2353();
            int var13 = (var12 >> 4 & 0x7) + Statics.field605;
            int var14 = (var12 & 0x7) + Statics.field1166;
            if (var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104) {
                method123(Statics.field27, var13, var14, var10, var11, var8, var9, 0, -1);
            }
        } else if (field388 == 140) {
            int var15 = field535.method2326();
            int var16 = (var15 >> 4 & 0x7) + Statics.field605;
            int var17 = (var15 & 0x7) + Statics.field1166;
            int var18 = field535.method2525();
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                class199 var19 = field422[Statics.field27][var16][var17];
                if (var19 != null) {
                    for (class29 var20 = (class29) var19.method3493(); var20 != null; var20 = (class29) var19.method3495()) {
                        if ((var18 & 0x7FFF) == var20.field683) {
                            var20.method3588();
                            break;
                        }
                    }
                    if (var19.method3493() == null) {
                        field422[Statics.field27][var16][var17] = null;
                    }
                    method2258(var16, var17);
                }
            }
        } else if (field388 == 180) {
            int var21 = field535.method2465();
            int var22 = (var21 >> 4 & 0x7) + Statics.field605;
            int var23 = (var21 & 0x7) + Statics.field1166;
            int var24 = field535.method2362();
            int var25 = field535.method2353();
            int var26 = var25 >> 2;
            int var27 = var25 & 0x3;
            int var28 = field354[var26];
            if (var22 >= 0 && var23 >= 0 && var22 < 103 && var23 < 103) {
                if (var28 == 0) {
                    class87 var29 = Statics.field2038.method1873(Statics.field27, var22, var23);
                    if (var29 != null) {
                        int var30 = var29.field1521 >> 14 & 0x7FFF;
                        if (var26 == 2) {
                            var29.field1526 = new class13(var30, 2, var27 + 4, Statics.field27, var22, var23, var24, false, var29.field1526);
                            var29.field1520 = new class13(var30, 2, var27 + 1 & 0x3, Statics.field27, var22, var23, var24, false, var29.field1520);
                        } else {
                            var29.field1526 = new class13(var30, var26, var27, Statics.field27, var22, var23, var24, false, var29.field1526);
                        }
                    }
                }
                if (var28 == 1) {
                    class94 var31 = Statics.field2038.method1778(Statics.field27, var22, var23);
                    if (var31 != null) {
                        int var32 = var31.field1603 >> 14 & 0x7FFF;
                        if (var26 == 4 || var26 == 5) {
                            var31.field1594 = new class13(var32, 4, var27, Statics.field27, var22, var23, var24, false, var31.field1594);
                        } else if (var26 == 6) {
                            var31.field1594 = new class13(var32, 4, var27 + 4, Statics.field27, var22, var23, var24, false, var31.field1594);
                        } else if (var26 == 7) {
                            var31.field1594 = new class13(var32, 4, (var27 + 2 & 0x3) + 4, Statics.field27, var22, var23, var24, false, var31.field1594);
                        } else if (var26 == 8) {
                            var31.field1594 = new class13(var32, 4, var27 + 4, Statics.field27, var22, var23, var24, false, var31.field1594);
                            var31.field1602 = new class13(var32, 4, (var27 + 2 & 0x3) + 4, Statics.field27, var22, var23, var24, false, var31.field1602);
                        }
                    }
                }
                if (var28 == 2) {
                    class98 var33 = Statics.field2038.method1792(Statics.field27, var22, var23);
                    if (var26 == 11) {
                        var26 = 10;
                    }
                    if (var33 != null) {
                        var33.field1650 = new class13(var33.field1660 >> 14 & 0x7FFF, var26, var27, Statics.field27, var22, var23, var24, false, var33.field1650);
                    }
                }
                if (var28 == 3) {
                    class93 var34 = Statics.field2038.method1837(Statics.field27, var22, var23);
                    if (var34 != null) {
                        var34.field1589 = new class13(var34.field1588 >> 14 & 0x7FFF, 22, var27, Statics.field27, var22, var23, var24, false, var34.field1589);
                    }
                }
            }
        } else if (field388 == 179) {
            int var35 = field535.method2326();
            int var36 = (var35 >> 4 & 0x7) + Statics.field605;
            int var37 = (var35 & 0x7) + Statics.field1166;
            int var38 = field535.method2525();
            int var39 = field535.method2525();
            int var40 = field535.method2525();
            if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
                class199 var41 = field422[Statics.field27][var36][var37];
                if (var41 != null) {
                    for (class29 var42 = (class29) var41.method3493(); var42 != null; var42 = (class29) var41.method3495()) {
                        if ((var38 & 0x7FFF) == var42.field683 && var42.field675 == var39) {
                            var42.field675 = var40;
                            break;
                        }
                    }
                    method2258(var36, var37);
                }
            }
        } else if (field388 == 63) {
            int var43 = field535.method2525();
            int var44 = field535.method2326();
            int var45 = (var44 >> 4 & 0x7) + Statics.field605;
            int var46 = (var44 & 0x7) + Statics.field1166;
            int var47 = field535.method2361();
            if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                class29 var48 = new class29();
                var48.field683 = var43;
                var48.field675 = var47;
                if (field422[Statics.field27][var45][var46] == null) {
                    field422[Statics.field27][var45][var46] = new class199();
                }
                field422[Statics.field27][var45][var46].method3488(var48);
                method2258(var45, var46);
            }
        } else if (field388 == 15) {
            int var49 = field535.method2326();
            int var50 = (var49 >> 4 & 0x7) + Statics.field605;
            int var51 = (var49 & 0x7) + Statics.field1166;
            int var52 = var50 + field535.method2461();
            int var53 = var51 + field535.method2461();
            int var54 = field535.method2383();
            int var55 = field535.method2525();
            int var56 = field535.method2326() * 4;
            int var57 = field535.method2326() * 4;
            int var58 = field535.method2525();
            int var59 = field535.method2525();
            int var60 = field535.method2326();
            int var61 = field535.method2326();
            if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104 && var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104 && var55 != 65535) {
                int var62 = var50 * 128 + 64;
                int var63 = var51 * 128 + 64;
                int var64 = var52 * 128 + 64;
                int var65 = var53 * 128 + 64;
                class7 var66 = new class7(var55, Statics.field27, var62, var63, Statics.method200(var62, var63, Statics.field27) - var56, field303 + var58, field303 + var59, var60, var61, var54, var57);
                var66.method98(var64, var65, Statics.method200(var64, var65, Statics.field27) - var57, field303 + var58);
                field424.method3488(var66);
            }
        } else {
            if (field388 == 183) {
                int var67 = field535.method2326();
                int var68 = (var67 >> 4 & 0x7) + Statics.field605;
                int var69 = (var67 & 0x7) + Statics.field1166;
                int var70 = field535.method2525();
                int var71 = field535.method2326();
                int var72 = var71 >> 4 & 0xF;
                int var73 = var71 & 0x7;
                int var74 = field535.method2326();
                if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104) {
                    int var75 = var72 + 1;
                    if (Statics.field677.field856[0] >= var68 - var75 && Statics.field677.field856[0] <= var68 + var75 && Statics.field677.field857[0] >= var69 - var75 && Statics.field677.field857[0] <= var69 + var75 && field531 != 0 && var73 > 0 && field550 < 50) {
                        field533[field550] = var70;
                        field534[field550] = var73;
                        field542[field550] = var74;
                        field469[field550] = null;
                        field294[field550] = (var68 << 16) + (var69 << 8) + var72;
                        field550++;
                    }
                }
            }
            if (field388 == 198) {
                int var76 = field535.method2326();
                int var77 = (var76 >> 4 & 0x7) + Statics.field605;
                int var78 = (var76 & 0x7) + Statics.field1166;
                int var79 = field535.method2525();
                int var80 = field535.method2326();
                int var81 = field535.method2525();
                if (var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104) {
                    int var82 = var77 * 128 + 64;
                    int var83 = var78 * 128 + 64;
                    class30 var84 = new class30(var79, Statics.field27, var82, var83, Statics.method200(var82, var83, Statics.field27) - var80, var81, field303);
                    field483.method3488(var84);
                }
            } else if (field388 == 44) {
                int var85 = field535.method2362();
                byte var86 = field535.method2472();
                int var87 = field535.method2362();
                int var88 = field535.method2400();
                int var89 = var88 >> 2;
                int var90 = var88 & 0x3;
                int var91 = field354[var89];
                int var92 = field535.method2525();
                byte var93 = field535.method2461();
                byte var94 = field535.method2356();
                byte var95 = field535.method2461();
                int var96 = field535.method2361();
                int var97 = field535.method2326();
                int var98 = (var97 >> 4 & 0x7) + Statics.field605;
                int var99 = (var97 & 0x7) + Statics.field1166;
                class3 var100;
                if (field373 == var96) {
                    var100 = Statics.field677;
                } else {
                    var100 = field412[var96];
                }
                if (var100 != null) {
                    class41 var101 = class41.method2614(var85);
                    int var102;
                    int var103;
                    if (var90 == 1 || var90 == 3) {
                        var102 = var101.field930;
                        var103 = var101.field929;
                    } else {
                        var102 = var101.field929;
                        var103 = var101.field930;
                    }
                    int var104 = (var102 >> 1) + var98;
                    int var105 = (var102 + 1 >> 1) + var98;
                    int var106 = (var103 >> 1) + var99;
                    int var107 = (var103 + 1 >> 1) + var99;
                    int[][] var108 = class6.field86[Statics.field27];
                    int var109 = var108[var104][var106] + var108[var105][var106] + var108[var104][var107] + var108[var105][var107] >> 2;
                    int var110 = (var98 << 7) + (var102 << 6);
                    int var111 = (var99 << 7) + (var103 << 6);
                    class105 var112 = var101.method771(var89, var90, var108, var110, var109, var111);
                    if (var112 != null) {
                        method123(Statics.field27, var98, var99, var91, -1, 0, 0, var92 + 1, var87 + 1);
                        var100.field36 = field303 + var92;
                        var100.field50 = field303 + var87;
                        var100.field41 = var112;
                        var100.field34 = var98 * 128 + var102 * 64;
                        var100.field40 = var99 * 128 + var103 * 64;
                        var100.field52 = var109;
                        if (var94 > var86) {
                            byte var113 = var94;
                            var94 = var86;
                            var86 = var113;
                        }
                        if (var95 > var93) {
                            byte var114 = var95;
                            var95 = var93;
                            var93 = var114;
                        }
                        var100.field42 = var94 + var98;
                        var100.field33 = var86 + var98;
                        var100.field43 = var95 + var99;
                        var100.field45 = var93 + var99;
                    }
                }
            }
        }
    }

    @ObfuscatedName("m.bc(IIIIIIIIIB)V")
    public static final void method123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field423.method3493(); var10 != null; var10 = (class17) field423.method3495()) {
            if (var10.field249 == arg0 && var10.field236 == arg1 && var10.field237 == arg2 && var10.field245 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field249 = arg0;
            var9.field245 = arg3;
            var9.field236 = arg1;
            var9.field237 = arg2;
            method966(var9);
            field423.method3488(var9);
        }
        var9.field241 = arg4;
        var9.field243 = arg5;
        var9.field242 = arg6;
        var9.field244 = arg7;
        var9.field247 = arg8;
    }

    @ObfuscatedName("ad.bi(Lp;I)V")
    public static final void method966(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field245 == 0) {
            var1 = Statics.field2038.method1804(arg0.field249, arg0.field236, arg0.field237);
        }
        if (arg0.field245 == 1) {
            var1 = Statics.field2038.method1782(arg0.field249, arg0.field236, arg0.field237);
        }
        if (arg0.field245 == 2) {
            var1 = Statics.field2038.method1783(arg0.field249, arg0.field236, arg0.field237);
        }
        if (arg0.field245 == 3) {
            var1 = Statics.field2038.method1808(arg0.field249, arg0.field236, arg0.field237);
        }
        if (var1 != 0) {
            int var5 = Statics.field2038.method1845(arg0.field249, arg0.field236, arg0.field237, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field238 = var2;
        arg0.field240 = var3;
        arg0.field250 = var4;
    }

    @ObfuscatedName("n.by(B)V")
    public static final void method133() {
        for (class17 var0 = (class17) field423.method3493(); var0 != null; var0 = (class17) field423.method3495()) {
            if (var0.field247 > 0) {
                var0.field247--;
            }
            if (var0.field247 != 0) {
                if (var0.field244 > 0) {
                    var0.field244--;
                }
                if (var0.field244 == 0 && var0.field236 >= 1 && var0.field237 >= 1 && var0.field236 <= 102 && var0.field237 <= 102 && (var0.field241 < 0 || class6.method2599(var0.field241, var0.field243))) {
                    method174(var0.field249, var0.field245, var0.field236, var0.field237, var0.field241, var0.field242, var0.field243);
                    var0.field244 = -1;
                    if (var0.field241 == var0.field238 && var0.field238 == -1) {
                        var0.method3588();
                    } else if (var0.field241 == var0.field238 && var0.field250 == var0.field242 && var0.field243 == var0.field240) {
                        var0.method3588();
                    }
                }
            } else if (var0.field238 < 0 || class6.method2599(var0.field238, var0.field240)) {
                method174(var0.field249, var0.field245, var0.field236, var0.field237, var0.field238, var0.field250, var0.field240);
                var0.method3588();
            }
        }
    }

    @ObfuscatedName("z.bn(IIIIIIIS)V")
    public static final void method174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field429 && Statics.field27 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2038.method1804(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2038.method1782(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2038.method1783(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2038.method1808(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2038.method1845(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2038.method1772(arg0, arg2, arg3);
                class41 var15 = class41.method2614(var12);
                if (var15.field931 != 0) {
                    field389[arg0].method2214(arg2, arg3, var13, var14, var15.field932);
                }
            }
            if (arg1 == 1) {
                Statics.field2038.method1770(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2038.method1874(arg0, arg2, arg3);
                class41 var16 = class41.method2614(var12);
                if (var16.field929 + arg2 > 103 || var16.field929 + arg3 > 103 || var16.field930 + arg2 > 103 || var16.field930 + arg3 > 103) {
                    return;
                }
                if (var16.field931 != 0) {
                    field389[arg0].method2215(arg2, arg3, var16.field929, var16.field930, var14, var16.field932);
                }
            }
            if (arg1 == 3) {
                Statics.field2038.method1864(arg0, arg2, arg3);
                class41 var17 = class41.method2614(var12);
                if (var17.field931 == 1) {
                    field389[arg0].method2211(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field80[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class86 var19 = Statics.field2038;
        class108 var20 = field389[arg0];
        class41 var21 = class41.method2614(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field930;
            var23 = var21.field929;
        } else {
            var22 = var21.field929;
            var23 = var21.field930;
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
        int[][] var28 = class6.field86[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field933 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field924 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class85 var34;
            if (var21.field937 == -1 && var21.field962 == null) {
                var34 = var21.method771(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1761(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field931 == 1) {
                var20.method2212(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class85 var57;
            if (var21.field937 == -1 && var21.field962 == null) {
                var57 = var21.method771(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            if (var57 != null) {
                var19.method1765(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field931 != 0) {
                var20.method2210(arg2, arg3, var22, var23, var21.field932);
            }
        } else if (arg6 >= 12) {
            class85 var35;
            if (var21.field937 == -1 && var21.field962 == null) {
                var35 = var21.method771(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1765(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field931 != 0) {
                var20.method2210(arg2, arg3, var22, var23, var21.field932);
            }
        } else if (arg6 == 0) {
            class85 var36;
            if (var21.field937 == -1 && var21.field962 == null) {
                var36 = var21.method771(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1763(arg0, arg2, arg3, var29, var36, (class85) null, class6.field88[arg5], 0, var32, var33);
            if (var21.field931 != 0) {
                var20.method2209(arg2, arg3, arg6, arg5, var21.field932);
            }
        } else if (arg6 == 1) {
            class85 var37;
            if (var21.field937 == -1 && var21.field962 == null) {
                var37 = var21.method771(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1763(arg0, arg2, arg3, var29, var37, (class85) null, class6.field79[arg5], 0, var32, var33);
            if (var21.field931 != 0) {
                var20.method2209(arg2, arg3, arg6, arg5, var21.field932);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class85 var39;
            class85 var40;
            if (var21.field937 == -1 && var21.field962 == null) {
                var39 = var21.method771(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method771(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field937, true, (class85) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1763(arg0, arg2, arg3, var29, var39, var40, class6.field88[arg5], class6.field88[var38], var32, var33);
            if (var21.field931 != 0) {
                var20.method2209(arg2, arg3, arg6, arg5, var21.field932);
            }
        } else if (arg6 == 3) {
            class85 var41;
            if (var21.field937 == -1 && var21.field962 == null) {
                var41 = var21.method771(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1763(arg0, arg2, arg3, var29, var41, (class85) null, class6.field79[arg5], 0, var32, var33);
            if (var21.field931 != 0) {
                var20.method2209(arg2, arg3, arg6, arg5, var21.field932);
            }
        } else if (arg6 == 9) {
            class85 var42;
            if (var21.field937 == -1 && var21.field962 == null) {
                var42 = var21.method771(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1765(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field931 != 0) {
                var20.method2210(arg2, arg3, var22, var23, var21.field932);
            }
        } else if (arg6 == 4) {
            class85 var43;
            if (var21.field937 == -1 && var21.field962 == null) {
                var43 = var21.method771(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1899(arg0, arg2, arg3, var29, var43, (class85) null, class6.field88[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1804(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class41.method2614(var45 >> 14 & 0x7FFF).field938;
            }
            class85 var46;
            if (var21.field937 == -1 && var21.field962 == null) {
                var46 = var21.method771(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1899(arg0, arg2, arg3, var29, var46, (class85) null, class6.field88[arg5], 0, class6.field90[arg5] * var44, class6.field91[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1804(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class41.method2614(var48 >> 14 & 0x7FFF).field938 / 2;
            }
            class85 var49;
            if (var21.field937 == -1 && var21.field962 == null) {
                var49 = var21.method771(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1899(arg0, arg2, arg3, var29, var49, (class85) null, 256, arg5, class6.field89[arg5] * var47, class6.field83[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class85 var51;
            if (var21.field937 == -1 && var21.field962 == null) {
                var51 = var21.method771(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1899(arg0, arg2, arg3, var29, var51, (class85) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1804(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class41.method2614(var53 >> 14 & 0x7FFF).field938 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class85 var55;
            class85 var56;
            if (var21.field937 == -1 && var21.field962 == null) {
                var55 = var21.method771(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method771(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field937, true, (class85) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field937, true, (class85) null);
            }
            var19.method1899(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field89[arg5] * var52, class6.field83[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("dn.be(III)V")
    public static final void method2258(int arg0, int arg1) {
        class199 var2 = field422[Statics.field27][arg0][arg1];
        if (var2 == null) {
            Statics.field2038.method1776(Statics.field27, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3493(); var6 != null; var6 = (class29) var2.method3495()) {
            class52 var7 = class52.method560(var6.field683);
            long var8 = (long) var7.field1130;
            if (var7.field1149 == 1) {
                var8 = (long) (var6.field675 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field2038.method1776(Statics.field27, arg0, arg1);
            return;
        }
        var2.method3489(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3493(); var12 != null; var12 = (class29) var2.method3495()) {
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
        Statics.field2038.method1831(Statics.field27, arg0, arg1, Statics.method200(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field27), var5, var13, var10, var11);
    }

    @ObfuscatedName("ap.bg(ZS)V")
    public static final void method957(boolean arg0) {
        field482 = 0;
        field382 = 0;
        field535.method2576();
        int var1 = field535.method2582(8);
        if (var1 < field457) {
            for (int var2 = var1; var2 < field457; var2++) {
                field537[++field482 - 1] = field331[var2];
            }
        }
        if (var1 > field457) {
            throw new RuntimeException("");
        }
        field457 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field331[var3];
            class35 var5 = field415[var4];
            int var6 = field535.method2582(1);
            if (var6 == 0) {
                field331[++field457 - 1] = var4;
                var5.field812 = field303;
            } else {
                int var7 = field535.method2582(2);
                if (var7 == 0) {
                    field331[++field457 - 1] = var4;
                    var5.field812 = field303;
                    field333[++field382 - 1] = var4;
                } else if (var7 == 1) {
                    field331[++field457 - 1] = var4;
                    var5.field812 = field303;
                    int var8 = field535.method2582(3);
                    var5.method700(var8, (byte) 1);
                    int var9 = field535.method2582(1);
                    if (var9 == 1) {
                        field333[++field382 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field331[++field457 - 1] = var4;
                    var5.field812 = field303;
                    int var10 = field535.method2582(3);
                    var5.method700(var10, (byte) 2);
                    int var11 = field535.method2582(3);
                    var5.method700(var11, (byte) 2);
                    int var12 = field535.method2582(1);
                    if (var12 == 1) {
                        field333[++field382 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field537[++field482 - 1] = var4;
                }
            }
        }
        method1746(arg0);
        method164();
        for (int var13 = 0; var13 < field482; var13++) {
            int var14 = field537[var13];
            if (field303 != field415[var14].field812) {
                field415[var14].field777 = null;
                field415[var14] = null;
            }
        }
        if (field396 != field535.field1973) {
            throw new RuntimeException(field535.field1973 + class2.field17 + field396);
        }
        for (int var15 = 0; var15 < field457; var15++) {
            if (field415[field331[var15]] == null) {
                throw new RuntimeException(var15 + class2.field17 + field457);
            }
        }
    }

    @ObfuscatedName("cn.bp(ZB)V")
    public static final void method1746(boolean arg0) {
        while (true) {
            if (field535.method2595(field396) >= 27) {
                int var1 = field535.method2582(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field415[var1] == null) {
                        field415[var1] = new class35();
                        var2 = true;
                    }
                    class35 var3 = field415[var1];
                    field331[++field457 - 1] = var1;
                    var3.field812 = field303;
                    int var4 = field535.method2582(1);
                    if (var4 == 1) {
                        field333[++field382 - 1] = var1;
                    }
                    int var5 = field535.method2582(1);
                    var3.field777 = class40.method2027(field535.method2582(14));
                    int var6;
                    if (arg0) {
                        var6 = field535.method2582(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = field535.method2582(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    int var7;
                    if (arg0) {
                        var7 = field535.method2582(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = field535.method2582(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    int var8 = field394[field535.method2582(3)];
                    if (var2) {
                        var3.field822 = var3.field804 = var8;
                    }
                    var3.field806 = var3.field777.field889;
                    var3.field854 = var3.field777.field901;
                    if (var3.field854 == 0) {
                        var3.field804 = 0;
                    }
                    var3.field810 = var3.field777.field883;
                    var3.field811 = var3.field777.field904;
                    var3.field826 = var3.field777.field885;
                    var3.field829 = var3.field777.field886;
                    var3.field832 = var3.field777.field880;
                    var3.field808 = var3.field777.field881;
                    var3.field862 = var3.field777.field882;
                    var3.method698(Statics.field677.field856[0] + var6, Statics.field677.field857[0] + var7, var5 == 1);
                    continue;
                }
            }
            field535.method2578();
            return;
        }
    }

    @ObfuscatedName("o.bz(I)V")
    public static final void method164() {
        for (int var0 = 0; var0 < field382; var0++) {
            int var1 = field333[var0];
            class35 var2 = field415[var1];
            int var3 = field535.method2326();
            if ((var3 & 0x10) != 0) {
                int var4 = field535.method2362();
                int var5 = field535.method2525();
                int var6 = var2.field839 - (var4 - Statics.field941 - Statics.field941) * 64;
                int var7 = var2.field803 - (var5 - Statics.field23 - Statics.field23) * 64;
                if (var6 != 0 || var7 != 0) {
                    var2.field843 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x40) != 0) {
                int var8 = field535.method2525();
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = field535.method2353();
                if (var2.field833 == var8 && var8 != -1) {
                    int var10 = class43.method750(var8).field996;
                    if (var10 == 1) {
                        var2.field834 = 0;
                        var2.field835 = 0;
                        var2.field836 = var9;
                        var2.field837 = 0;
                    }
                    if (var10 == 2) {
                        var2.field837 = 0;
                    }
                } else if (var8 == -1 || var2.field833 == -1 || class43.method750(var8).field979 >= class43.method750(var2.field833).field979) {
                    var2.field833 = var8;
                    var2.field834 = 0;
                    var2.field835 = 0;
                    var2.field836 = var9;
                    var2.field837 = 0;
                    var2.field802 = var2.field855;
                }
            }
            if ((var3 & 0x2) != 0) {
                var2.field838 = field535.method2363();
                int var11 = field535.method2488();
                var2.field842 = var11 >> 16;
                var2.field849 = (var11 & 0xFFFF) + field303;
                var2.field850 = 0;
                var2.field840 = 0;
                if (var2.field849 > field303) {
                    var2.field850 = -1;
                }
                if (var2.field838 == 65535) {
                    var2.field838 = -1;
                }
            }
            if ((var3 & 0x8) != 0) {
                int var12 = field535.method2400();
                int var13 = field535.method2465();
                var2.method727(var12, var13, field303);
                var2.field860 = field303 + 300;
                var2.field825 = field535.method2361();
                var2.field815 = field535.method2363();
            }
            if ((var3 & 0x1) != 0) {
                int var14 = field535.method2326();
                int var15 = field535.method2326();
                var2.method727(var14, var15, field303);
                var2.field860 = field303 + 300;
                var2.field825 = field535.method2362();
                var2.field815 = field535.method2525();
            }
            if ((var3 & 0x20) != 0) {
                var2.field807 = field535.method2334();
                var2.field818 = 100;
            }
            if ((var3 & 0x4) != 0) {
                var2.field827 = field535.method2363();
                if (var2.field827 == 65535) {
                    var2.field827 = -1;
                }
            }
            if ((var3 & 0x80) != 0) {
                var2.field777 = class40.method2027(field535.method2361());
                var2.field806 = var2.field777.field889;
                var2.field854 = var2.field777.field901;
                var2.field810 = var2.field777.field883;
                var2.field811 = var2.field777.field904;
                var2.field826 = var2.field777.field885;
                var2.field829 = var2.field777.field886;
                var2.field832 = var2.field777.field880;
                var2.field808 = var2.field777.field881;
                var2.field862 = var2.field777.field882;
            }
        }
    }

    @ObfuscatedName("fp.bs(III)Ldh;")
    public static class107 method3160(int arg0, int arg1) {
        field570.field1876 = arg0;
        field570.field1871 = arg1;
        field570.field1872 = 1;
        field570.field1873 = 1;
        return field570;
    }

    @ObfuscatedName("cg.bw(IIIIB)V")
    public static final void method2109(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field493; var4++) {
            if (field500[var4] + field498[var4] > arg0 && field498[var4] < arg0 + arg2 && field507[var4] + field501[var4] > arg1 && field507[var4] < arg1 + arg3) {
                field495[var4] = true;
            }
        }
    }

    @ObfuscatedName("en.bq(I)V")
    public static final void method2728() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field571 - 1; var1++) {
                if (field434[var1] < 1000 && field434[var1 + 1] > 1000) {
                    String var2 = field437[var1];
                    field437[var1] = field437[var1 + 1];
                    field437[var1 + 1] = var2;
                    String var3 = field436[var1];
                    field436[var1] = field436[var1 + 1];
                    field436[var1 + 1] = var3;
                    int var4 = field434[var1];
                    field434[var1] = field434[var1 + 1];
                    field434[var1 + 1] = var4;
                    int var5 = field432[var1];
                    field432[var1] = field432[var1 + 1];
                    field432[var1 + 1] = var5;
                    int var6 = field433[var1];
                    field433[var1] = field433[var1 + 1];
                    field433[var1 + 1] = var6;
                    int var7 = field435[var1];
                    field435[var1] = field435[var1 + 1];
                    field435[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
        if (Statics.field536 != null || field359 != null) {
            return;
        }
        int var8 = class140.field2137;
        if (field430) {
            if (var8 != 1 && (Statics.field319 || var8 != 4)) {
                int var9 = class140.field2131;
                int var10 = class140.field2132 * -1076088155;
                if (var9 < Statics.field2643 - 10 || var9 > Statics.field3046 + Statics.field2643 + 10 || var10 < Statics.field3138 - 10 || var10 > Statics.field3138 + Statics.field1938 + 10) {
                    field430 = false;
                    method2109(Statics.field2643, Statics.field3138, Statics.field3046, Statics.field1938);
                }
            }
            if (var8 == 1 || !Statics.field319 && var8 == 4) {
                int var11 = Statics.field2643;
                int var12 = Statics.field3138;
                int var13 = Statics.field3046;
                int var14 = class140.field2134;
                int var15 = class140.field2133;
                int var16 = -1;
                for (int var17 = 0; var17 < field571; var17++) {
                    int var18 = (field571 - 1 - var17) * 15 + var12 + 31;
                    if (var14 > var11 && var14 < var11 + var13 && var15 > var18 - 13 && var15 < var18 + 3) {
                        var16 = var17;
                    }
                }
                if (var16 != -1) {
                    method863(var16);
                }
                field430 = false;
                method2109(Statics.field2643, Statics.field3138, Statics.field3046, Statics.field1938);
            }
            return;
        }
        if ((var8 == 1 || !Statics.field319 && var8 == 4) && field571 > 0) {
            int var19 = field434[field571 - 1];
            if (var19 == 39 || var19 == 40 || var19 == 41 || var19 == 42 || var19 == 43 || var19 == 33 || var19 == 34 || var19 == 35 || var19 == 36 || var19 == 37 || var19 == 38 || var19 == 1005) {
                int var20 = field432[field571 - 1];
                int var21 = field433[field571 - 1];
                class173 var22 = class173.method945(var21);
                if (class178.method2904(method165(var22)) || class178.method2668(method165(var22))) {
                    if (Statics.field536 != null && !field441 && field458 != 1 && !method2914(field571 - 1) && field571 > 0) {
                        method3158(field406, field407);
                    }
                    field441 = false;
                    field410 = 0;
                    if (Statics.field536 != null) {
                        method628(Statics.field536);
                    }
                    Statics.field536 = class173.method945(var21);
                    field405 = var20;
                    field406 = class140.field2134;
                    field407 = class140.field2133;
                    if (field571 > 0) {
                        int var23 = field571 - 1;
                        Statics.field135 = new class31();
                        Statics.field135.field712 = field432[var23];
                        Statics.field135.field701 = field433[var23];
                        Statics.field135.field702 = field434[var23];
                        Statics.field135.field700 = field435[var23];
                        Statics.field135.field704 = field436[var23];
                    }
                    method628(Statics.field536);
                    return;
                }
            }
        }
        if ((var8 == 1 || !Statics.field319 && var8 == 4) && (field458 == 1 && field571 > 2 || method2914(field571 - 1))) {
            var8 = 2;
        }
        if ((var8 == 1 || !Statics.field319 && var8 == 4) && field571 > 0) {
            method863(field571 - 1);
        }
        if (var8 == 2 && field571 > 0) {
            method239(class140.field2134, class140.field2133);
        }
    }

    @ObfuscatedName("h.bt(III)V")
    public static final void method239(int arg0, int arg1) {
        int var2 = Statics.field1044.method3758(class157.field2446);
        for (int var3 = 0; var3 < field571; var3++) {
            int var4 = Statics.field1044.method3758(method928(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field571 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field2114) {
            var6 = Statics.field2114 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field2638) {
            var7 = Statics.field2638 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field430 = true;
        Statics.field2643 = var6;
        Statics.field3138 = var7;
        Statics.field3046 = var2;
        Statics.field1938 = field571 * 15 + 22;
    }

    @ObfuscatedName("fj.bb(IS)Z")
    public static final boolean method2914(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field434[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("am.bv(II)V")
    public static final void method863(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field432[arg0];
        int var2 = field433[arg0];
        int var3 = field434[arg0];
        int var4 = field435[arg0];
        String var5 = field436[arg0];
        String var6 = field437[arg0];
        method759(var1, var2, var3, var4, var5, var6, class140.field2134, class140.field2133);
    }

    @ObfuscatedName("az.ba(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method759(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 7) {
            class35 var8 = field415[arg3];
            if (var8 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field400 = 0;
                field460 = arg0;
                field525 = arg1;
                field337.method2574(173);
                field337.method2359(Statics.field229);
                field337.method2370(Statics.field125);
                field337.method2358(arg3);
                field337.method2359(Statics.field768);
                field337.method2351(class137.field2094[82] ? 1 : 0);
            }
        }
        if (arg2 == 58) {
            class173 var9 = class173.method2665(arg1, arg0);
            if (var9 != null) {
                field337.method2574(57);
                field337.method2423(Statics.field268);
                field337.method2411(arg1);
                field337.method2359(var9.field2845);
                field337.method2358(field446);
                field337.method2312(field445);
                field337.method2360(arg0);
            }
        }
        if (arg2 == 12) {
            class35 var10 = field415[arg3];
            if (var10 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field400 = 0;
                field460 = arg0;
                field525 = arg1;
                field337.method2574(5);
                field337.method2351(class137.field2094[82] ? 1 : 0);
                field337.method2358(arg3);
            }
        }
        if (arg2 == 1003) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field400 = 0;
            class35 var11 = field415[arg3];
            if (var11 != null) {
                class40 var12 = var11.field777;
                if (var12.field871 != null) {
                    var12 = var12.method744();
                }
                if (var12 != null) {
                    field337.method2574(226);
                    field337.method2360(var12.field898);
                }
            }
        }
        if (arg2 == 34) {
            field337.method2574(122);
            field337.method2358(arg0);
            field337.method2315(arg1);
            field337.method2358(arg3);
            field402 = 0;
            Statics.field1040 = class173.method945(arg1);
            field403 = arg0;
        }
        if (arg2 == 22) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field400 = 0;
            field460 = arg0;
            field525 = arg1;
            field337.method2574(184);
            field337.method2513(class137.field2094[82] ? 1 : 0);
            field337.method2360(Statics.field23 + arg1);
            field337.method2312(arg3);
            field337.method2359(Statics.field941 + arg0);
        }
        if (arg2 == 1005) {
            class173 var13 = class173.method945(arg1);
            if (var13 == null || var13.field2800[arg0] < 100000) {
                field337.method2574(93);
                field337.method2358(arg3);
            } else {
                class12.method2628(27, "", var13.field2800[arg0] + " x " + class52.method560(arg3).field1118);
            }
            field402 = 0;
            Statics.field1040 = class173.method945(arg1);
            field403 = arg0;
        }
        if (arg2 == 1001) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field400 = 0;
            field460 = arg0;
            field525 = arg1;
            field337.method2574(119);
            field337.method2350(class137.field2094[82] ? 1 : 0);
            field337.method2360(arg3 >> 14 & 0x7FFF);
            field337.method2359(Statics.field941 + arg0);
            field337.method2359(Statics.field23 + arg1);
        }
        if (arg2 == 5) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field400 = 0;
            field460 = arg0;
            field525 = arg1;
            field337.method2574(248);
            field337.method2359(Statics.field23 + arg1);
            field337.method2359(arg3 >> 14 & 0x7FFF);
            field337.method2350(class137.field2094[82] ? 1 : 0);
            field337.method2360(Statics.field941 + arg0);
        }
        if (arg2 == 48) {
            class3 var14 = field412[arg3];
            if (var14 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field400 = 0;
                field460 = arg0;
                field525 = arg1;
                field337.method2574(79);
                field337.method2358(arg3);
                field337.method2351(class137.field2094[82] ? 1 : 0);
            }
        }
        if (arg2 == 40) {
            field337.method2574(38);
            field337.method2359(arg0);
            field337.method2360(arg3);
            field337.method2423(arg1);
            field402 = 0;
            Statics.field1040 = class173.method945(arg1);
            field403 = arg0;
        }
        if (arg2 == 46) {
            class3 var15 = field412[arg3];
            if (var15 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field400 = 0;
                field460 = arg0;
                field525 = arg1;
                field337.method2574(169);
                field337.method2513(class137.field2094[82] ? 1 : 0);
                field337.method2359(arg3);
            }
        }
        if (arg2 == 50) {
            class3 var16 = field412[arg3];
            if (var16 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field400 = 0;
                field460 = arg0;
                field525 = arg1;
                field337.method2574(239);
                field337.method2351(class137.field2094[82] ? 1 : 0);
                field337.method2360(arg3);
            }
        }
        if (arg2 == 51) {
            class3 var17 = field412[arg3];
            if (var17 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field400 = 0;
                field460 = arg0;
                field525 = arg1;
                field337.method2574(131);
                field337.method2360(arg3);
                field337.method2513(class137.field2094[82] ? 1 : 0);
            }
        }
        if (arg2 == 19) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field400 = 0;
            field460 = arg0;
            field525 = arg1;
            field337.method2574(147);
            field337.method2360(Statics.field23 + arg1);
            field337.method2354(class137.field2094[82] ? 1 : 0);
            field337.method2312(arg3);
            field337.method2358(Statics.field941 + arg0);
        }
        if (arg2 == 17) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field400 = 0;
            field460 = arg0;
            field525 = arg1;
            field337.method2574(30);
            field337.method2359(Statics.field23 + arg1);
            field337.method2370(Statics.field268);
            field337.method2312(arg3);
            field337.method2312(field445);
            field337.method2354(class137.field2094[82] ? 1 : 0);
            field337.method2359(Statics.field941 + arg0);
        }
        if (arg2 == 14) {
            class3 var18 = field412[arg3];
            if (var18 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field400 = 0;
                field460 = arg0;
                field525 = arg1;
                field337.method2574(67);
                field337.method2360(Statics.field768);
                field337.method2370(Statics.field125);
                field337.method2354(class137.field2094[82] ? 1 : 0);
                field337.method2360(Statics.field229);
                field337.method2312(arg3);
            }
        }
        if (arg2 == 25) {
            class173 var19 = class173.method2665(arg1, arg0);
            if (var19 != null) {
                method188();
                int var20 = method165(var19);
                int var21 = var20 >> 11 & 0x3F;
                int var23 = var19.field2845;
                class173 var24 = class173.method2665(arg1, arg0);
                if (var24 != null && var24.field2816 != null) {
                    class1 var25 = new class1();
                    var25.field3 = var24;
                    var25.field15 = var24.field2816;
                    class37.method1926(var25);
                }
                field446 = var23;
                field334 = true;
                Statics.field268 = arg1;
                field445 = arg0;
                Statics.field1190 = var21;
                method628(var24);
                field442 = 0;
                int var26 = method165(var19);
                int var27 = var26 >> 11 & 0x3F;
                String var28;
                if (var27 == 0) {
                    var28 = null;
                } else if (var19.field2804 == null || var19.field2804.trim().length() == 0) {
                    var28 = null;
                } else {
                    var28 = var19.field2804;
                }
                field447 = var28;
                if (field447 == null) {
                    field447 = "Null";
                }
                if (var19.field2726) {
                    field494 = var19.field2747 + class2.method2122(16777215);
                } else {
                    field494 = class2.method2122(65280) + var19.field2809 + class2.method2122(16777215);
                }
            }
            return;
        }
        if (arg2 == 37) {
            field337.method2574(48);
            field337.method2423(arg1);
            field337.method2358(arg0);
            field337.method2360(arg3);
            field402 = 0;
            Statics.field1040 = class173.method945(arg1);
            field403 = arg0;
        }
        if (arg2 == 16) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field400 = 0;
            field460 = arg0;
            field525 = arg1;
            field337.method2574(227);
            field337.method2351(class137.field2094[82] ? 1 : 0);
            field337.method2358(Statics.field941 + arg0);
            field337.method2358(Statics.field768);
            field337.method2359(Statics.field229);
            field337.method2423(Statics.field125);
            field337.method2358(Statics.field23 + arg1);
            field337.method2358(arg3);
        }
        if (arg2 == 10) {
            class35 var29 = field415[arg3];
            if (var29 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field400 = 0;
                field460 = arg0;
                field525 = arg1;
                field337.method2574(117);
                field337.method2358(arg3);
                field337.method2350(class137.field2094[82] ? 1 : 0);
            }
        }
        if (arg2 == 1002) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field400 = 0;
            field337.method2574(65);
            field337.method2359(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 24) {
            class173 var30 = class173.method945(arg1);
            boolean var31 = true;
            if (var30.field2731 > 0) {
                var31 = method1051(var30);
            }
            if (var31) {
                field337.method2574(165);
                field337.method2423(arg1);
            }
        }
        if (arg2 == 11) {
            class35 var32 = field415[arg3];
            if (var32 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field400 = 0;
                field460 = arg0;
                field525 = arg1;
                field337.method2574(110);
                field337.method2358(arg3);
                field337.method2513(class137.field2094[82] ? 1 : 0);
            }
        }
        if (arg2 == 21) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field400 = 0;
            field460 = arg0;
            field525 = arg1;
            field337.method2574(114);
            field337.method2360(arg3);
            field337.method2359(Statics.field941 + arg0);
            field337.method2351(class137.field2094[82] ? 1 : 0);
            field337.method2359(Statics.field23 + arg1);
        }
        if (arg2 == 15) {
            class3 var33 = field412[arg3];
            if (var33 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field400 = 0;
                field460 = arg0;
                field525 = arg1;
                field337.method2574(61);
                field337.method2354(class137.field2094[82] ? 1 : 0);
                field337.method2358(field445);
                field337.method2358(arg3);
                field337.method2370(Statics.field268);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class173 var34 = class173.method2665(arg1, arg0);
            if (var34 != null) {
                int var35 = var34.field2845;
                class173 var36 = class173.method2665(arg1, arg0);
                if (var36 != null) {
                    if (var36.field2772 != null) {
                        class1 var37 = new class1();
                        var37.field3 = var36;
                        var37.field6 = arg3;
                        var37.field10 = arg5;
                        var37.field15 = var36.field2772;
                        class37.method1926(var37);
                    }
                    boolean var38 = true;
                    if (var36.field2731 > 0) {
                        var38 = method1051(var36);
                    }
                    if (var38 && class178.method724(method165(var36), arg3 - 1)) {
                        if (arg3 == 1) {
                            field337.method2574(166);
                            field337.method2423(arg1);
                            field337.method2312(arg0);
                            field337.method2312(var35);
                        }
                        if (arg3 == 2) {
                            field337.method2574(156);
                            field337.method2423(arg1);
                            field337.method2312(arg0);
                            field337.method2312(var35);
                        }
                        if (arg3 == 3) {
                            field337.method2574(19);
                            field337.method2423(arg1);
                            field337.method2312(arg0);
                            field337.method2312(var35);
                        }
                        if (arg3 == 4) {
                            field337.method2574(101);
                            field337.method2423(arg1);
                            field337.method2312(arg0);
                            field337.method2312(var35);
                        }
                        if (arg3 == 5) {
                            field337.method2574(63);
                            field337.method2423(arg1);
                            field337.method2312(arg0);
                            field337.method2312(var35);
                        }
                        if (arg3 == 6) {
                            field337.method2574(74);
                            field337.method2423(arg1);
                            field337.method2312(arg0);
                            field337.method2312(var35);
                        }
                        if (arg3 == 7) {
                            field337.method2574(98);
                            field337.method2423(arg1);
                            field337.method2312(arg0);
                            field337.method2312(var35);
                        }
                        if (arg3 == 8) {
                            field337.method2574(22);
                            field337.method2423(arg1);
                            field337.method2312(arg0);
                            field337.method2312(var35);
                        }
                        if (arg3 == 9) {
                            field337.method2574(153);
                            field337.method2423(arg1);
                            field337.method2312(arg0);
                            field337.method2312(var35);
                        }
                        if (arg3 == 10) {
                            field337.method2574(59);
                            field337.method2423(arg1);
                            field337.method2312(arg0);
                            field337.method2312(var35);
                        }
                    }
                }
            }
        }
        if (arg2 == 9) {
            class35 var39 = field415[arg3];
            if (var39 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field400 = 0;
                field460 = arg0;
                field525 = arg1;
                field337.method2574(163);
                field337.method2359(arg3);
                field337.method2513(class137.field2094[82] ? 1 : 0);
            }
        }
        if (arg2 == 8) {
            class35 var40 = field415[arg3];
            if (var40 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field400 = 0;
                field460 = arg0;
                field525 = arg1;
                field337.method2574(129);
                field337.method2312(field445);
                field337.method2513(class137.field2094[82] ? 1 : 0);
                field337.method2359(arg3);
                field337.method2411(Statics.field268);
            }
        }
        if (arg2 == 29) {
            field337.method2574(165);
            field337.method2423(arg1);
            class173 var41 = class173.method945(arg1);
            if (var41.field2837 != null && var41.field2837[0][0] == 5) {
                int var42 = var41.field2837[0][1];
                if (class176.field2875[var42] != var41.field2839[0]) {
                    class176.field2875[var42] = var41.field2839[0];
                    method554(var42);
                }
            }
        }
        if (arg2 == 47) {
            class3 var43 = field412[arg3];
            if (var43 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field400 = 0;
                field460 = arg0;
                field525 = arg1;
                field337.method2574(195);
                field337.method2354(class137.field2094[82] ? 1 : 0);
                field337.method2359(arg3);
            }
        }
        if (arg2 == 2) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field400 = 0;
            field460 = arg0;
            field525 = arg1;
            field337.method2574(145);
            field337.method2360(field445);
            field337.method2360(Statics.field941 + arg0);
            field337.method2411(Statics.field268);
            field337.method2358(arg3 >> 14 & 0x7FFF);
            field337.method2358(Statics.field23 + arg1);
            field337.method2354(class137.field2094[82] ? 1 : 0);
        }
        if (arg2 == 4) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field400 = 0;
            field460 = arg0;
            field525 = arg1;
            field337.method2574(234);
            field337.method2358(arg3 >> 14 & 0x7FFF);
            field337.method2350(class137.field2094[82] ? 1 : 0);
            field337.method2359(Statics.field23 + arg1);
            field337.method2358(Statics.field941 + arg0);
        }
        if (arg2 == 31) {
            field337.method2574(151);
            field337.method2359(Statics.field768);
            field337.method2360(arg3);
            field337.method2411(arg1);
            field337.method2359(Statics.field229);
            field337.method2358(arg0);
            field337.method2411(Statics.field125);
            field402 = 0;
            Statics.field1040 = class173.method945(arg1);
            field403 = arg0;
        }
        if (arg2 == 1) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field400 = 0;
            field460 = arg0;
            field525 = arg1;
            field337.method2574(75);
            field337.method2359(Statics.field768);
            field337.method2423(Statics.field125);
            field337.method2358(Statics.field23 + arg1);
            field337.method2312(Statics.field941 + arg0);
            field337.method2360(Statics.field229);
            field337.method2360(arg3 >> 14 & 0x7FFF);
            field337.method2513(class137.field2094[82] ? 1 : 0);
        }
        if (arg2 == 41) {
            field337.method2574(197);
            field337.method2411(arg1);
            field337.method2358(arg0);
            field337.method2360(arg3);
            field402 = 0;
            Statics.field1040 = class173.method945(arg1);
            field403 = arg0;
        }
        if (arg2 == 44) {
            class3 var44 = field412[arg3];
            if (var44 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field400 = 0;
                field460 = arg0;
                field525 = arg1;
                field337.method2574(45);
                field337.method2351(class137.field2094[82] ? 1 : 0);
                field337.method2360(arg3);
            }
        }
        if (arg2 == 26) {
            method2703();
        }
        if (arg2 == 35) {
            field337.method2574(58);
            field337.method2358(arg0);
            field337.method2411(arg1);
            field337.method2359(arg3);
            field402 = 0;
            Statics.field1040 = class173.method945(arg1);
            field403 = arg0;
        }
        if (arg2 == 3) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field400 = 0;
            field460 = arg0;
            field525 = arg1;
            field337.method2574(155);
            field337.method2350(class137.field2094[82] ? 1 : 0);
            field337.method2312(arg3 >> 14 & 0x7FFF);
            field337.method2360(Statics.field941 + arg0);
            field337.method2358(Statics.field23 + arg1);
        }
        if (arg2 == 28) {
            field337.method2574(165);
            field337.method2423(arg1);
            class173 var45 = class173.method945(arg1);
            if (var45.field2837 != null && var45.field2837[0][0] == 5) {
                int var46 = var45.field2837[0][1];
                class176.field2875[var46] = 1 - class176.field2875[var46];
                method554(var46);
            }
        }
        if (arg2 == 32) {
            field337.method2574(144);
            field337.method2359(arg3);
            field337.method2411(Statics.field268);
            field337.method2359(arg0);
            field337.method2359(field445);
            field337.method2370(arg1);
            field402 = 0;
            Statics.field1040 = class173.method945(arg1);
            field403 = arg0;
        }
        if (arg2 == 30 && field453 == null) {
            method106(arg1, arg0);
            field453 = class173.method2665(arg1, arg0);
            method628(field453);
        }
        if (arg2 == 43) {
            field337.method2574(179);
            field337.method2312(arg3);
            field337.method2370(arg1);
            field337.method2359(arg0);
            field402 = 0;
            Statics.field1040 = class173.method945(arg1);
            field403 = arg0;
        }
        if (arg2 == 6) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field400 = 0;
            field460 = arg0;
            field525 = arg1;
            field337.method2574(112);
            field337.method2354(class137.field2094[82] ? 1 : 0);
            field337.method2358(arg3 >> 14 & 0x7FFF);
            field337.method2359(Statics.field23 + arg1);
            field337.method2359(Statics.field941 + arg0);
        }
        if (arg2 == 13) {
            class35 var47 = field415[arg3];
            if (var47 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field400 = 0;
                field460 = arg0;
                field525 = arg1;
                field337.method2574(189);
                field337.method2359(arg3);
                field337.method2513(class137.field2094[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field337.method2574(249);
            field337.method2358(arg0);
            field337.method2370(arg1);
            field337.method2359(arg3);
            field402 = 0;
            Statics.field1040 = class173.method945(arg1);
            field403 = arg0;
        }
        if (arg2 == 33) {
            field337.method2574(53);
            field337.method2358(arg3);
            field337.method2315(arg1);
            field337.method2312(arg0);
            field402 = 0;
            Statics.field1040 = class173.method945(arg1);
            field403 = arg0;
        }
        if (arg2 == 49) {
            class3 var48 = field412[arg3];
            if (var48 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field400 = 0;
                field460 = arg0;
                field525 = arg1;
                field337.method2574(77);
                field337.method2351(class137.field2094[82] ? 1 : 0);
                field337.method2358(arg3);
            }
        }
        if (arg2 == 18) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field400 = 0;
            field460 = arg0;
            field525 = arg1;
            field337.method2574(180);
            field337.method2354(class137.field2094[82] ? 1 : 0);
            field337.method2360(arg3);
            field337.method2312(Statics.field941 + arg0);
            field337.method2360(Statics.field23 + arg1);
        }
        if (arg2 == 38) {
            method188();
            class173 var49 = class173.method945(arg1);
            field442 = 1;
            Statics.field768 = arg0;
            Statics.field125 = arg1;
            Statics.field229 = arg3;
            method628(var49);
            field443 = class2.method2122(16748608) + class52.method560(arg3).field1118 + class2.method2122(16777215);
            if (field443 == null) {
                field443 = "null";
            }
            return;
        }
        if (arg2 == 23) {
            Statics.field2038.method1849(Statics.field27, arg0, arg1);
        }
        if (arg2 == 39) {
            field337.method2574(133);
            field337.method2411(arg1);
            field337.method2359(arg0);
            field337.method2312(arg3);
            field402 = 0;
            Statics.field1040 = class173.method945(arg1);
            field403 = arg0;
        }
        if (arg2 == 1004) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field400 = 0;
            field337.method2574(93);
            field337.method2358(arg3);
        }
        if (arg2 == 42) {
            field337.method2574(146);
            field337.method2359(arg0);
            field337.method2360(arg3);
            field337.method2423(arg1);
            field402 = 0;
            Statics.field1040 = class173.method945(arg1);
            field403 = arg0;
        }
        if (arg2 == 45) {
            class3 var50 = field412[arg3];
            if (var50 != null) {
                field398 = arg6;
                field399 = arg7;
                field401 = 2;
                field400 = 0;
                field460 = arg0;
                field525 = arg1;
                field337.method2574(2);
                field337.method2351(class137.field2094[82] ? 1 : 0);
                field337.method2312(arg3);
            }
        }
        if (arg2 == 20) {
            field398 = arg6;
            field399 = arg7;
            field401 = 2;
            field400 = 0;
            field460 = arg0;
            field525 = arg1;
            field337.method2574(201);
            field337.method2312(Statics.field941 + arg0);
            field337.method2358(arg3);
            field337.method2359(Statics.field23 + arg1);
            field337.method2350(class137.field2094[82] ? 1 : 0);
        }
        if (field442 != 0) {
            field442 = 0;
            method628(class173.method945(Statics.field125));
        }
        if (field334) {
            method188();
        }
        if (Statics.field1040 != null && field402 == 0) {
            method628(Statics.field1040);
        }
    }

    @ObfuscatedName("p.bu(I)V")
    public static void method188() {
        if (!field334) {
            return;
        }
        class173 var0 = class173.method2665(Statics.field268, field445);
        if (var0 != null && var0.field2817 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field15 = var0.field2817;
            class37.method1926(var1);
        }
        field334 = false;
        method628(var0);
    }

    @ObfuscatedName("q.br(III)V")
    public static void method106(int arg0, int arg1) {
        field337.method2574(182);
        field337.method2360(arg1);
        field337.method2370(arg0);
    }

    @ObfuscatedName("s.bo(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method169(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field430 || field571 >= 500) {
            return;
        }
        field436[field571] = arg0;
        field437[field571] = arg1;
        field434[field571] = arg2;
        field435[field571] = arg3;
        field432[field571] = arg4;
        field433[field571] = arg5;
        field571++;
    }

    @ObfuscatedName("av.bl(II)Ljava/lang/String;")
    public static String method928(int arg0) {
        return field437[arg0].length() > 0 ? field436[arg0] + class157.field2453 + field437[arg0] : field436[arg0];
    }

    @ObfuscatedName("y.cy(IIIII)V")
    public static final void method1(int arg0, int arg1, int arg2, int arg3) {
        if (field442 == 0 && !field334) {
            method169(class157.field2307, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class105.field1817; var6++) {
            int var7 = class105.field1810[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field2038.method1845(Statics.field27, var8, var9, var7) >= 0) {
                    class41 var12 = class41.method2614(var11);
                    if (var12.field962 != null) {
                        var12 = var12.method769();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field442 == 1) {
                        method169(class157.field2443, field443 + " " + class2.field21 + " " + class2.method2122(65535) + var12.field934, 1, var7, var8, var9);
                    } else if (!field334) {
                        String[] var13 = var12.field963;
                        if (field484) {
                            var13 = method1064(var13);
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
                                    method169(var13[var14], class2.method2122(65535) + var12.field934, var15, var7, var8, var9);
                                }
                            }
                        }
                        method169(class157.field2316, class2.method2122(65535) + var12.field934, 1002, var12.field923 << 14, var8, var9);
                    } else if ((Statics.field1190 & 0x4) == 4) {
                        method169(field447, field494 + " " + class2.field21 + " " + class2.method2122(65535) + var12.field934, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class35 var16 = field415[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field777.field889 == 1 && (var16.field839 & 0x7F) == 64 && (var16.field803 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field457; var17++) {
                            class35 var18 = field415[field331[var17]];
                            if (var18 != null && var16 != var18 && var18.field777.field889 == 1 && var16.field839 == var18.field839 && var16.field803 == var18.field803) {
                                method637(var18.field777, field331[var17], var8, var9);
                            }
                        }
                        int var19 = class33.field750;
                        int[] var20 = class33.field751;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class3 var22 = field412[var20[var21]];
                            if (var22 != null && var16.field839 == var22.field839 && var16.field803 == var22.field803) {
                                method707(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method637(var16.field777, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var23 = field412[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field839 & 0x7F) == 64 && (var23.field803 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field457; var24++) {
                            class35 var25 = field415[field331[var24]];
                            if (var25 != null && var25.field777.field889 == 1 && var23.field839 == var25.field839 && var23.field803 == var25.field803) {
                                method637(var25.field777, field331[var24], var8, var9);
                            }
                        }
                        int var26 = class33.field750;
                        int[] var27 = class33.field751;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class3 var29 = field412[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field839 == var29.field839 && var23.field803 == var29.field803) {
                                method707(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field421 == var11) {
                        var4 = var7;
                    } else {
                        method707(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class199 var30 = field422[Statics.field27][var8][var9];
                    if (var30 != null) {
                        for (class29 var31 = (class29) var30.method3494(); var31 != null; var31 = (class29) var30.method3501()) {
                            class52 var32 = class52.method560(var31.field683);
                            if (field442 == 1) {
                                method169(class157.field2443, field443 + " " + class2.field21 + " " + class2.method2122(16748608) + var32.field1118, 16, var31.field683, var8, var9);
                            } else if (!field334) {
                                String[] var33 = var32.field1132;
                                if (field484) {
                                    var33 = method1064(var33);
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
                                        method169(var33[var34], class2.method2122(16748608) + var32.field1118, var35, var31.field683, var8, var9);
                                    } else if (var34 == 2) {
                                        method169(class157.field2535, class2.method2122(16748608) + var32.field1118, 20, var31.field683, var8, var9);
                                    }
                                }
                                method169(class157.field2316, class2.method2122(16748608) + var32.field1118, 1004, var31.field683, var8, var9);
                            } else if ((Statics.field1190 & 0x1) == 1) {
                                method169(field447, field494 + " " + class2.field21 + " " + class2.method2122(16748608) + var32.field1118, 17, var31.field683, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class3 var38 = field412[field421];
            method707(var38, field421, var36, var37);
        }
    }

    @ObfuscatedName("ab.cc(Laz;IIII)V")
    public static final void method637(class40 arg0, int arg1, int arg2, int arg3) {
        if (field571 >= 400) {
            return;
        }
        if (arg0.field871 != null) {
            arg0 = arg0.method744();
        }
        if (arg0 == null || !arg0.field888 || arg0.field894 && field558 != arg1) {
            return;
        }
        String var4 = arg0.field876;
        if (arg0.field893 != 0) {
            int var6 = arg0.field893;
            int var7 = Statics.field677.field54;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method2122(16711680);
            } else if (var8 < -6) {
                var9 = class2.method2122(16723968);
            } else if (var8 < -3) {
                var9 = class2.method2122(16740352);
            } else if (var8 < 0) {
                var9 = class2.method2122(16756736);
            } else if (var8 > 9) {
                var9 = class2.method2122(65280);
            } else if (var8 > 6) {
                var9 = class2.method2122(4259584);
            } else if (var8 > 3) {
                var9 = class2.method2122(8453888);
            } else if (var8 > 0) {
                var9 = class2.method2122(12648192);
            } else {
                var9 = class2.method2122(16776960);
            }
            var4 = var4 + var9 + " " + class2.field22 + class157.field2554 + arg0.field893 + class2.field20;
        }
        if (field442 == 1) {
            method169(class157.field2443, field443 + " " + class2.field21 + " " + class2.method2122(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field334) {
            String[] var10 = arg0.field877;
            if (field484) {
                var10 = method1064(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class157.field2323)) {
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
                        method169(var10[var11], class2.method2122(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class157.field2323)) {
                        short var14 = 0;
                        if (field320 == class21.field577 || field320 == class21.field581 && arg0.field893 > Statics.field677.field54) {
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
                        method169(var10[var13], class2.method2122(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method169(class157.field2316, class2.method2122(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1190 & 0x2) == 2) {
            method169(field447, field494 + " " + class2.field21 + " " + class2.method2122(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ay.cr(Lg;IIIB)V")
    public static final void method707(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field677 == arg0 || field571 >= 400) {
            return;
        }
        String var9;
        if (arg0.field35 == 0) {
            String var4 = arg0.field38;
            int var5 = arg0.field54;
            int var6 = Statics.field677.field54;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method2122(16711680);
            } else if (var7 < -6) {
                var8 = class2.method2122(16723968);
            } else if (var7 < -3) {
                var8 = class2.method2122(16740352);
            } else if (var7 < 0) {
                var8 = class2.method2122(16756736);
            } else if (var7 > 9) {
                var8 = class2.method2122(65280);
            } else if (var7 > 6) {
                var8 = class2.method2122(4259584);
            } else if (var7 > 3) {
                var8 = class2.method2122(8453888);
            } else if (var7 > 0) {
                var8 = class2.method2122(12648192);
            } else {
                var8 = class2.method2122(16776960);
            }
            var9 = var4 + var8 + " " + class2.field22 + class157.field2554 + arg0.field54 + class2.field20;
        } else {
            var9 = arg0.field38 + " " + class2.field22 + class157.field2450 + arg0.field35 + class2.field20;
        }
        if (field442 == 1) {
            method169(class157.field2443, field443 + " " + class2.field21 + " " + class2.method2122(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field334) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field418[var10] != null) {
                    short var11 = 0;
                    if (field418[var10].equalsIgnoreCase(class157.field2323)) {
                        if (field320 == class21.field577 || field320 == class21.field581 && arg0.field54 > Statics.field677.field54) {
                            var11 = 2000;
                        }
                        if (Statics.field677.field47 != 0 && arg0.field47 != 0) {
                            if (Statics.field677.field47 == arg0.field47) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field547[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field417[var10] + var11;
                    method169(field418[var10], class2.method2122(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1190 & 0x8) == 8) {
            method169(field447, field494 + " " + class2.field21 + " " + class2.method2122(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field571; var14++) {
            if (field434[var14] == 23) {
                field437[var14] = class2.method2122(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("ao.cm(IIIIIIIII)V")
    public static final void method629(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (Statics.method723(arg0)) {
            Statics.field215 = null;
            Statics.method2740(Statics.field2745[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field215 != null) {
                Statics.method2740(Statics.field215, -1412584499, arg1, arg2, arg3, arg4, Statics.field2642, Statics.field589, arg7);
                Statics.field215 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field495[var8] = true;
            }
        } else {
            field495[arg7] = true;
        }
    }

    @ObfuscatedName("gu.cn(Ljava/lang/String;Lft;I)Ljava/lang/String;")
    public static String method3404(String arg0, class173 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method2029(arg1, var2 - 1);
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
                if (Statics.field13 != null) {
                    var8 = class163.method2702(Statics.field13.field2194);
                    if (Statics.field13.field2202 != null) {
                        var8 = (String) Statics.field13.field2202;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("q.ci(IB)Ljava/lang/String;")
    public static final String method113(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field17 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2122(65408) + var1.substring(0, var1.length() - 8) + class157.field2454 + " " + class2.field22 + var1 + class2.field20 + class2.field16;
        } else if (var1.length() > 6) {
            return " " + class2.method2122(16777215) + var1.substring(0, var1.length() - 4) + class157.field2456 + " " + class2.field22 + var1 + class2.field20 + class2.field16;
        } else {
            return " " + class2.method2122(16776960) + var1 + class2.field16;
        }
    }

    @ObfuscatedName("dq.ch(Lft;I)V")
    public static void method2271(class173 arg0) {
        class173 var1 = arg0.field2746 == -1 ? null : class173.method945(arg0.field2746);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field2114;
            var3 = Statics.field2638;
        } else {
            var2 = var1.field2825;
            var3 = var1.field2743;
        }
        method751(arg0, var2, var3, false);
        method692(arg0, var2, var3);
    }

    @ObfuscatedName("au.co([Lft;Lft;ZI)V")
    public static void method892(class173[] arg0, class173 arg1, boolean arg2) {
        int var3 = arg1.field2750 == 0 ? arg1.field2825 : arg1.field2750;
        int var4 = arg1.field2850 == 0 ? arg1.field2743 : arg1.field2850;
        method3645(arg0, arg1.field2727, var3, var4, arg2);
        if (arg1.field2849 != null) {
            method3645(arg1.field2849, arg1.field2727, var3, var4, arg2);
        }
        class4 var5 = (class4) field450.method3459((long) arg1.field2727);
        if (var5 != null) {
            method2610(var5.field63, var3, var4, arg2);
        }
        if (arg1.field2731 == 1337) {
        }
    }

    @ObfuscatedName("dz.cu(IIIZI)V")
    public static final void method2610(int arg0, int arg1, int arg2, boolean arg3) {
        if (Statics.method723(arg0)) {
            method3645(Statics.field2745[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ho.ct([Lft;IIIZB)V")
    public static void method3645(class173[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class173 var6 = arg0[var5];
            if (var6 != null && var6.field2746 == arg1) {
                method751(var6, arg2, arg3, arg4);
                method692(var6, arg2, arg3);
                if (var6.field2764 > var6.field2750 - var6.field2825) {
                    var6.field2764 = var6.field2750 - var6.field2825;
                }
                if (var6.field2764 < 0) {
                    var6.field2764 = 0;
                }
                if (var6.field2749 > var6.field2850 - var6.field2743) {
                    var6.field2749 = var6.field2850 - var6.field2743;
                }
                if (var6.field2749 < 0) {
                    var6.field2749 = 0;
                }
                if (var6.field2729 == 0) {
                    method892(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("az.ck(Lft;IIZI)V")
    public static void method751(class173 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2825;
        int var5 = arg0.field2743;
        if (arg0.field2730 == 0) {
            arg0.field2825 = arg0.field2738;
        } else if (arg0.field2730 == 1) {
            arg0.field2825 = arg1 - arg0.field2738;
        } else if (arg0.field2730 == 2) {
            arg0.field2825 = arg0.field2738 * arg1 >> 14;
        }
        if (arg0.field2735 == 0) {
            arg0.field2743 = arg0.field2739;
        } else if (arg0.field2735 == 1) {
            arg0.field2743 = arg2 - arg0.field2739;
        } else if (arg0.field2735 == 2) {
            arg0.field2743 = arg0.field2739 * arg2 >> 14;
        }
        if (arg0.field2730 == 4) {
            arg0.field2825 = arg0.field2744 * arg0.field2743 / arg0.field2781;
        }
        if (arg0.field2735 == 4) {
            arg0.field2743 = arg0.field2825 * arg0.field2781 / arg0.field2744;
        }
        if (field459 && arg0.field2729 == 0) {
            if (arg0.field2743 < 5 && arg0.field2825 < 5) {
                arg0.field2743 = 5;
                arg0.field2825 = 5;
            } else {
                if (arg0.field2743 <= 0) {
                    arg0.field2743 = 5;
                }
                if (arg0.field2825 <= 0) {
                    arg0.field2825 = 5;
                }
            }
        }
        if (arg0.field2731 == 1337) {
            field338 = arg0;
        }
        if (arg3 && arg0.field2834 != null && (arg0.field2825 != var4 || arg0.field2743 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field15 = arg0.field2834;
            field489.method3488(var6);
        }
    }

    @ObfuscatedName("aw.cj(Lft;III)V")
    public static void method692(class173 arg0, int arg1, int arg2) {
        if (arg0.field2732 == 0) {
            arg0.field2768 = arg0.field2823;
        } else if (arg0.field2732 == 1) {
            arg0.field2768 = (arg1 - arg0.field2825) / 2 + arg0.field2823;
        } else if (arg0.field2732 == 2) {
            arg0.field2768 = arg1 - arg0.field2825 - arg0.field2823;
        } else if (arg0.field2732 == 3) {
            arg0.field2768 = arg0.field2823 * arg1 >> 14;
        } else if (arg0.field2732 == 4) {
            arg0.field2768 = (arg0.field2823 * arg1 >> 14) + (arg1 - arg0.field2825) / 2;
        } else {
            arg0.field2768 = arg1 - arg0.field2825 - (arg0.field2823 * arg1 >> 14);
        }
        if (arg0.field2733 == 0) {
            arg0.field2812 = arg0.field2737;
        } else if (arg0.field2733 == 1) {
            arg0.field2812 = (arg2 - arg0.field2743) / 2 + arg0.field2737;
        } else if (arg0.field2733 == 2) {
            arg0.field2812 = arg2 - arg0.field2743 - arg0.field2737;
        } else if (arg0.field2733 == 3) {
            arg0.field2812 = arg0.field2737 * arg2 >> 14;
        } else if (arg0.field2733 == 4) {
            arg0.field2812 = (arg0.field2737 * arg2 >> 14) + (arg2 - arg0.field2743) / 2;
        } else {
            arg0.field2812 = arg2 - arg0.field2743 - (arg0.field2737 * arg2 >> 14);
        }
        if (!field459 || arg0.field2729 != 0) {
            return;
        }
        if (arg0.field2768 < 0) {
            arg0.field2768 = 0;
        } else if (arg0.field2825 + arg0.field2768 > arg1) {
            arg0.field2768 = arg1 - arg0.field2825;
        }
        if (arg0.field2812 < 0) {
            arg0.field2812 = 0;
        } else if (arg0.field2812 + arg0.field2743 > arg2) {
            arg0.field2812 = arg2 - arg0.field2743;
        }
    }

    @ObfuscatedName("ca.cb(IIIIII)V")
    public static final void method2113(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field251[0].method1724(arg0, arg1);
        Statics.field251[1].method1724(arg0, arg1 + arg3 - 16);
        class80.method1670(arg0, arg1 + 16, 16, arg3 - 32, field322);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class80.method1670(arg0, arg1 + 16 + var6, 16, var5, field313);
        class80.method1671(arg0, arg1 + 16 + var6, var5, field371);
        class80.method1671(arg0 + 1, arg1 + 16 + var6, var5, field371);
        class80.method1674(arg0, arg1 + 16 + var6, 16, field371);
        class80.method1674(arg0, arg1 + 17 + var6, 16, field371);
        class80.method1671(arg0 + 15, arg1 + 16 + var6, var5, field370);
        class80.method1671(arg0 + 14, arg1 + 17 + var6, var5 - 1, field370);
        class80.method1674(arg0, arg1 + 15 + var6 + var5, 16, field370);
        class80.method1674(arg0 + 1, arg1 + 14 + var6 + var5, 15, field370);
    }

    @ObfuscatedName("b.cq(Lft;B)Z")
    public static final boolean method175(class173 arg0) {
        if (arg0.field2789 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2789.length; var1++) {
            int var2 = method2029(arg0, var1);
            int var3 = arg0.field2839[var1];
            if (arg0.field2789[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2789[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2789[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("cx.cv(Lft;II)I")
    public static final int method2029(class173 arg0, int arg1) {
        if (arg0.field2837 == null || arg1 >= arg0.field2837.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2837[arg1];
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
                    var7 = field426[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field427[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field428[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class173 var11 = class173.method945(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method560(var12).field1131 || field296)) {
                        for (int var13 = 0; var13 < var11.field2742.length; var13++) {
                            if (var12 + 1 == var11.field2742[var13]) {
                                var7 += var11.field2800[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class176.field2875[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class155.field2276[field427[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class176.field2875[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field677.field54;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class155.field2279[var14]) {
                            var7 += field427[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class173 var17 = class173.method945(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method560(var18).field1131 || field296)) {
                        for (int var19 = 0; var19 < var17.field2742.length; var19++) {
                            if (var18 + 1 == var17.field2742[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field560;
                }
                if (var6 == 12) {
                    var7 = field455;
                }
                if (var6 == 13) {
                    int var20 = class176.field2875[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class176.method2749(var22);
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
                    var7 = (Statics.field677.field839 >> 7) + Statics.field941;
                }
                if (var6 == 19) {
                    var7 = (Statics.field677.field803 >> 7) + Statics.field23;
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

    @ObfuscatedName("bx.cd(IIIIIIII)V")
    public static final void method1565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (Statics.method723(arg0)) {
            method725(Statics.field2745[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("al.cf([Lft;IIIIIIII)V")
    public static final void method725(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class173 var9 = arg0[var8];
            if (var9 != null && (!var9.field2726 || var9.field2729 == 0 || var9.field2787 || method165(var9) != 0 || field463 == var9 || var9.field2731 == 1338) && var9.field2746 == arg1 && (!var9.field2726 || !method163(var9))) {
                int var10 = var9.field2768 + arg6;
                int var11 = var9.field2812 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2729 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2729 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2825 + var10;
                    int var19 = var9.field2743 + var11;
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
                    int var22 = var9.field2825 + var10;
                    int var23 = var9.field2743 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field359 == var9) {
                    field470 = true;
                    field471 = var10;
                    field472 = var11;
                }
                if (!var9.field2726 || var12 < var14 && var13 < var15) {
                    int var24 = class140.field2131;
                    int var25 = class140.field2132 * -1076088155;
                    if (class140.field2137 != 0) {
                        var24 = class140.field2134;
                        var25 = class140.field2133;
                    }
                    if (var9.field2731 == 1337) {
                        if (!field302 && !field430 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method1(var24, var25, var12, var13);
                        }
                    } else if (var9.field2731 == 1338) {
                        method2784(var9, var10, var11);
                    } else {
                        if (!field430 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var26 = var24 - var10;
                            int var27 = var25 - var11;
                            if (var9.field2777 == 1) {
                                method169(var9.field2842, "", 24, 0, 0, var9.field2727);
                            }
                            if (var9.field2777 == 2 && !field334) {
                                int var28 = method165(var9);
                                int var29 = var28 >> 11 & 0x3F;
                                String var30;
                                if (var29 == 0) {
                                    var30 = null;
                                } else if (var9.field2804 == null || var9.field2804.trim().length() == 0) {
                                    var30 = null;
                                } else {
                                    var30 = var9.field2804;
                                }
                                if (var30 != null) {
                                    method169(var30, class2.method2122(65280) + var9.field2809, 25, 0, -1, var9.field2727);
                                }
                            }
                            if (var9.field2777 == 3) {
                                method169(class157.field2452, "", 26, 0, 0, var9.field2727);
                            }
                            if (var9.field2777 == 4) {
                                method169(var9.field2842, "", 28, 0, 0, var9.field2727);
                            }
                            if (var9.field2777 == 5) {
                                method169(var9.field2842, "", 29, 0, 0, var9.field2727);
                            }
                            if (var9.field2777 == 6 && field453 == null) {
                                method169(var9.field2842, "", 30, 0, -1, var9.field2727);
                            }
                            if (var9.field2729 == 2) {
                                int var32 = 0;
                                for (int var33 = 0; var33 < var9.field2743; var33++) {
                                    for (int var34 = 0; var34 < var9.field2825; var34++) {
                                        int var35 = (var9.field2791 + 32) * var34;
                                        int var36 = (var9.field2785 + 32) * var33;
                                        if (var32 < 20) {
                                            var35 += var9.field2793[var32];
                                            var36 += var9.field2857[var32];
                                        }
                                        if (var26 >= var35 && var27 >= var36 && var26 < var35 + 32 && var27 < var36 + 32) {
                                            field408 = var32;
                                            Statics.field1600 = var9;
                                            if (var9.field2742[var32] > 0) {
                                                class52 var37 = class52.method560(var9.field2742[var32] - 1);
                                                if (field442 == 1 && class178.method191(method165(var9))) {
                                                    if (Statics.field125 != var9.field2727 || Statics.field768 != var32) {
                                                        method169(class157.field2443, field443 + " " + class2.field21 + " " + class2.method2122(16748608) + var37.field1118, 31, var37.field1116, var32, var9.field2727);
                                                    }
                                                } else if (!field334 || !class178.method191(method165(var9))) {
                                                    String[] var38 = var37.field1133;
                                                    if (field484) {
                                                        var38 = method1064(var38);
                                                    }
                                                    if (class178.method191(method165(var9))) {
                                                        for (int var39 = 4; var39 >= 3; var39--) {
                                                            if (var38 != null && var38[var39] != null) {
                                                                byte var40;
                                                                if (var39 == 3) {
                                                                    var40 = 36;
                                                                } else {
                                                                    var40 = 37;
                                                                }
                                                                method169(var38[var39], class2.method2122(16748608) + var37.field1118, var40, var37.field1116, var32, var9.field2727);
                                                            } else if (var39 == 4) {
                                                                method169(class157.field2294, class2.method2122(16748608) + var37.field1118, 37, var37.field1116, var32, var9.field2727);
                                                            }
                                                        }
                                                    }
                                                    int var41 = method165(var9);
                                                    boolean var42 = (var41 >> 31 & 0x1) != 0;
                                                    if (var42) {
                                                        method169(class157.field2443, class2.method2122(16748608) + var37.field1118, 38, var37.field1116, var32, var9.field2727);
                                                    }
                                                    class178 var10000 = (class178) null;
                                                    if (class178.method191(method165(var9)) && var38 != null) {
                                                        for (int var43 = 2; var43 >= 0; var43--) {
                                                            if (var38[var43] != null) {
                                                                byte var44 = 0;
                                                                if (var43 == 0) {
                                                                    var44 = 33;
                                                                }
                                                                if (var43 == 1) {
                                                                    var44 = 34;
                                                                }
                                                                if (var43 == 2) {
                                                                    var44 = 35;
                                                                }
                                                                method169(var38[var43], class2.method2122(16748608) + var37.field1118, var44, var37.field1116, var32, var9.field2727);
                                                            }
                                                        }
                                                    }
                                                    String[] var45 = var9.field2796;
                                                    if (field484) {
                                                        var45 = method1064(var45);
                                                    }
                                                    if (var45 != null) {
                                                        for (int var46 = 4; var46 >= 0; var46--) {
                                                            if (var45[var46] != null) {
                                                                byte var47 = 0;
                                                                if (var46 == 0) {
                                                                    var47 = 39;
                                                                }
                                                                if (var46 == 1) {
                                                                    var47 = 40;
                                                                }
                                                                if (var46 == 2) {
                                                                    var47 = 41;
                                                                }
                                                                if (var46 == 3) {
                                                                    var47 = 42;
                                                                }
                                                                if (var46 == 4) {
                                                                    var47 = 43;
                                                                }
                                                                method169(var45[var46], class2.method2122(16748608) + var37.field1118, var47, var37.field1116, var32, var9.field2727);
                                                            }
                                                        }
                                                    }
                                                    method169(class157.field2316, class2.method2122(16748608) + var37.field1118, 1005, var37.field1116, var32, var9.field2727);
                                                } else if ((Statics.field1190 & 0x10) == 16) {
                                                    method169(field447, field494 + " " + class2.field21 + " " + class2.method2122(16748608) + var37.field1118, 32, var37.field1116, var32, var9.field2727);
                                                }
                                            }
                                        }
                                        var32++;
                                    }
                                }
                            }
                            if (var9.field2726) {
                                if (!field334) {
                                    for (int var48 = 9; var48 >= 5; var48--) {
                                        String var49 = method634(var9, var48);
                                        if (var49 != null) {
                                            method169(var49, var9.field2747, 1007, var48 + 1, var9.field2728, var9.field2727);
                                        }
                                    }
                                    int var50 = method165(var9);
                                    int var51 = var50 >> 11 & 0x3F;
                                    String var52;
                                    if (var51 == 0) {
                                        var52 = null;
                                    } else if (var9.field2804 == null || var9.field2804.trim().length() == 0) {
                                        var52 = null;
                                    } else {
                                        var52 = var9.field2804;
                                    }
                                    if (var52 != null) {
                                        method169(var52, var9.field2747, 25, 0, var9.field2728, var9.field2727);
                                    }
                                    for (int var54 = 4; var54 >= 0; var54--) {
                                        String var55 = method634(var9, var54);
                                        if (var55 != null) {
                                            method169(var55, var9.field2747, 57, var54 + 1, var9.field2728, var9.field2727);
                                        }
                                    }
                                    if (class178.method1929(method165(var9))) {
                                        method169(class157.field2298, "", 30, 0, var9.field2728, var9.field2727);
                                    }
                                } else if (class178.method3107(method165(var9)) && (Statics.field1190 & 0x20) == 32) {
                                    method169(field447, field494 + " " + class2.field21 + " " + var9.field2747, 58, 0, var9.field2728, var9.field2727);
                                }
                            }
                        }
                        if (var9.field2729 == 0) {
                            if (!var9.field2726 && method163(var9) && Statics.field2014 != var9) {
                                continue;
                            }
                            method725(arg0, var9.field2727, var12, var13, var14, var15, var10 - var9.field2764, var11 - var9.field2749);
                            if (var9.field2849 != null) {
                                method725(var9.field2849, var9.field2727, var12, var13, var14, var15, var10 - var9.field2764, var11 - var9.field2749);
                            }
                            class4 var56 = (class4) field450.method3459((long) var9.field2727);
                            if (var56 != null) {
                                if (var56.field59 == 0 && class140.field2131 >= var12 && class140.field2132 * -1076088155 >= var13 && class140.field2131 < var14 && class140.field2132 * -1076088155 < var15 && !field430 && !field459) {
                                    for (class1 var57 = (class1) field489.method3493(); var57 != null; var57 = (class1) field489.method3495()) {
                                        if (var57.field2) {
                                            var57.method3588();
                                            var57.field3.field2719 = false;
                                        }
                                    }
                                    if (Statics.field286 == 0) {
                                        field359 = null;
                                        field463 = null;
                                    }
                                    if (!field430) {
                                        field436[0] = class157.field2470;
                                        field437[0] = "";
                                        field434[0] = 1006;
                                        field571 = 1;
                                    }
                                }
                                method1565(var56.field63, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2726) {
                            if (var9.field2858) {
                                if (class140.field2131 >= var12 && class140.field2132 * -1076088155 >= var13 && class140.field2131 < var14 && class140.field2132 * -1076088155 < var15) {
                                    for (class1 var58 = (class1) field489.method3493(); var58 != null; var58 = (class1) field489.method3495()) {
                                        if (var58.field2) {
                                            var58.method3588();
                                            var58.field3.field2719 = false;
                                        }
                                    }
                                    if (Statics.field286 == 0) {
                                        field359 = null;
                                        field463 = null;
                                    }
                                    if (!field430) {
                                        field436[0] = class157.field2470;
                                        field437[0] = "";
                                        field434[0] = 1006;
                                        field571 = 1;
                                    }
                                }
                            } else if (var9.field2774 && class140.field2131 >= var12 && class140.field2132 * -1076088155 >= var13 && class140.field2131 < var14 && class140.field2132 * -1076088155 < var15) {
                                for (class1 var59 = (class1) field489.method3493(); var59 != null; var59 = (class1) field489.method3495()) {
                                    if (var59.field2 && var59.field3.field2826 == var59.field15) {
                                        var59.method3588();
                                    }
                                }
                            }
                            boolean var60;
                            if (class140.field2131 >= var12 && class140.field2132 * -1076088155 >= var13 && class140.field2131 < var14 && class140.field2132 * -1076088155 < var15) {
                                var60 = true;
                            } else {
                                var60 = false;
                            }
                            boolean var61 = false;
                            if ((class140.field2130 == 1 || !Statics.field319 && class140.field2130 == 4) && var60) {
                                var61 = true;
                            }
                            boolean var62 = false;
                            if ((class140.field2137 == 1 || !Statics.field319 && class140.field2137 == 4) && class140.field2134 >= var12 && class140.field2133 >= var13 && class140.field2134 < var14 && class140.field2133 < var15) {
                                var62 = true;
                            }
                            if (var62) {
                                method2251(var9, class140.field2134 - var10, class140.field2133 - var11);
                            }
                            if (field359 != null && field359 != var9 && var60 && class178.method2783(method165(var9))) {
                                field466 = var9;
                            }
                            if (field463 == var9) {
                                field540 = true;
                                field468 = var10;
                                field362 = var11;
                            }
                            if (var9.field2787) {
                                if (var60 && field488 != 0 && var9.field2826 != null) {
                                    class1 var63 = new class1();
                                    var63.field2 = true;
                                    var63.field3 = var9;
                                    var63.field14 = field488;
                                    var63.field15 = var9.field2826;
                                    field489.method3488(var63);
                                }
                                if (field359 != null || Statics.field536 != null || field430) {
                                    var62 = false;
                                    var61 = false;
                                    var60 = false;
                                }
                                if (!var9.field2851 && var62) {
                                    var9.field2851 = true;
                                    if (var9.field2848 != null) {
                                        class1 var64 = new class1();
                                        var64.field2 = true;
                                        var64.field3 = var9;
                                        var64.field1 = class140.field2134 - var10;
                                        var64.field14 = class140.field2133 - var11;
                                        var64.field15 = var9.field2848;
                                        field489.method3488(var64);
                                    }
                                }
                                if (var9.field2851 && var61 && var9.field2808 != null) {
                                    class1 var65 = new class1();
                                    var65.field2 = true;
                                    var65.field3 = var9;
                                    var65.field1 = class140.field2131 - var10;
                                    var65.field14 = class140.field2132 * -1076088155 - var11;
                                    var65.field15 = var9.field2808;
                                    field489.method3488(var65);
                                }
                                if (var9.field2851 && !var61) {
                                    var9.field2851 = false;
                                    if (var9.field2771 != null) {
                                        class1 var66 = new class1();
                                        var66.field2 = true;
                                        var66.field3 = var9;
                                        var66.field1 = class140.field2131 - var10;
                                        var66.field14 = class140.field2132 * -1076088155 - var11;
                                        var66.field15 = var9.field2771;
                                        field491.method3488(var66);
                                    }
                                }
                                if (var61 && var9.field2841 != null) {
                                    class1 var67 = new class1();
                                    var67.field2 = true;
                                    var67.field3 = var9;
                                    var67.field1 = class140.field2131 - var10;
                                    var67.field14 = class140.field2132 * -1076088155 - var11;
                                    var67.field15 = var9.field2841;
                                    field489.method3488(var67);
                                }
                                if (!var9.field2719 && var60) {
                                    var9.field2719 = true;
                                    if (var9.field2760 != null) {
                                        class1 var68 = new class1();
                                        var68.field2 = true;
                                        var68.field3 = var9;
                                        var68.field1 = class140.field2131 - var10;
                                        var68.field14 = class140.field2132 * -1076088155 - var11;
                                        var68.field15 = var9.field2760;
                                        field489.method3488(var68);
                                    }
                                }
                                if (var9.field2719 && var60 && var9.field2805 != null) {
                                    class1 var69 = new class1();
                                    var69.field2 = true;
                                    var69.field3 = var9;
                                    var69.field1 = class140.field2131 - var10;
                                    var69.field14 = class140.field2132 * -1076088155 - var11;
                                    var69.field15 = var9.field2805;
                                    field489.method3488(var69);
                                }
                                if (var9.field2719 && !var60) {
                                    var9.field2719 = false;
                                    if (var9.field2813 != null) {
                                        class1 var70 = new class1();
                                        var70.field2 = true;
                                        var70.field3 = var9;
                                        var70.field1 = class140.field2131 - var10;
                                        var70.field14 = class140.field2132 * -1076088155 - var11;
                                        var70.field15 = var9.field2813;
                                        field491.method3488(var70);
                                    }
                                }
                                if (var9.field2824 != null) {
                                    class1 var71 = new class1();
                                    var71.field3 = var9;
                                    var71.field15 = var9.field2824;
                                    field404.method3488(var71);
                                }
                                if (var9.field2818 != null && field476 > var9.field2853) {
                                    if (var9.field2819 == null || field476 - var9.field2853 > 32) {
                                        class1 var76 = new class1();
                                        var76.field3 = var9;
                                        var76.field15 = var9.field2818;
                                        field489.method3488(var76);
                                    } else {
                                        label715: for (int var72 = var9.field2853; var72 < field476; var72++) {
                                            int var73 = field475[var72 & 0x1F];
                                            for (int var74 = 0; var74 < var9.field2819.length; var74++) {
                                                if (var9.field2819[var74] == var73) {
                                                    class1 var75 = new class1();
                                                    var75.field3 = var9;
                                                    var75.field15 = var9.field2818;
                                                    field489.method3488(var75);
                                                    break label715;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2853 = field476;
                                }
                                if (var9.field2820 != null && field478 > var9.field2854) {
                                    if (var9.field2821 == null || field478 - var9.field2854 > 32) {
                                        class1 var81 = new class1();
                                        var81.field3 = var9;
                                        var81.field15 = var9.field2820;
                                        field489.method3488(var81);
                                    } else {
                                        label691: for (int var77 = var9.field2854; var77 < field478; var77++) {
                                            int var78 = field477[var77 & 0x1F];
                                            for (int var79 = 0; var79 < var9.field2821.length; var79++) {
                                                if (var9.field2821[var79] == var78) {
                                                    class1 var80 = new class1();
                                                    var80.field3 = var9;
                                                    var80.field15 = var9.field2820;
                                                    field489.method3488(var80);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2854 = field478;
                                }
                                if (var9.field2822 != null && field532 > var9.field2855) {
                                    if (var9.field2734 == null || field532 - var9.field2855 > 32) {
                                        class1 var86 = new class1();
                                        var86.field3 = var9;
                                        var86.field15 = var9.field2822;
                                        field489.method3488(var86);
                                    } else {
                                        label667: for (int var82 = var9.field2855; var82 < field532; var82++) {
                                            int var83 = field479[var82 & 0x1F];
                                            for (int var84 = 0; var84 < var9.field2734.length; var84++) {
                                                if (var9.field2734[var84] == var83) {
                                                    class1 var85 = new class1();
                                                    var85.field3 = var9;
                                                    var85.field15 = var9.field2822;
                                                    field489.method3488(var85);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2855 = field532;
                                }
                                if (field481 > var9.field2852 && var9.field2827 != null) {
                                    class1 var87 = new class1();
                                    var87.field3 = var9;
                                    var87.field15 = var9.field2827;
                                    field489.method3488(var87);
                                }
                                if (field329 > var9.field2852 && var9.field2829 != null) {
                                    class1 var88 = new class1();
                                    var88.field3 = var9;
                                    var88.field15 = var9.field2829;
                                    field489.method3488(var88);
                                }
                                if (field351 > var9.field2852 && var9.field2830 != null) {
                                    class1 var89 = new class1();
                                    var89.field3 = var9;
                                    var89.field15 = var9.field2830;
                                    field489.method3488(var89);
                                }
                                if (field342 > var9.field2852 && var9.field2835 != null) {
                                    class1 var90 = new class1();
                                    var90.field3 = var9;
                                    var90.field15 = var9.field2835;
                                    field489.method3488(var90);
                                }
                                if (field514 > var9.field2852 && var9.field2836 != null) {
                                    class1 var91 = new class1();
                                    var91.field3 = var9;
                                    var91.field15 = var9.field2836;
                                    field489.method3488(var91);
                                }
                                if (field485 > var9.field2852 && var9.field2831 != null) {
                                    class1 var92 = new class1();
                                    var92.field3 = var9;
                                    var92.field15 = var9.field2831;
                                    field489.method3488(var92);
                                }
                                var9.field2852 = field357;
                                if (var9.field2828 != null) {
                                    for (int var93 = 0; var93 < field513; var93++) {
                                        class1 var94 = new class1();
                                        var94.field3 = var9;
                                        var94.field8 = field515[var93];
                                        var94.field12 = field314[var93];
                                        var94.field15 = var9.field2828;
                                        field489.method3488(var94);
                                    }
                                }
                            }
                        }
                        if (!var9.field2726 && field359 == null && Statics.field536 == null && !field430) {
                            if ((var9.field2840 >= 0 || var9.field2754 != 0) && class140.field2131 >= var12 && class140.field2132 * -1076088155 >= var13 && class140.field2131 < var14 && class140.field2132 * -1076088155 < var15) {
                                if (var9.field2840 >= 0) {
                                    Statics.field2014 = arg0[var9.field2840];
                                } else {
                                    Statics.field2014 = var9;
                                }
                            }
                            if (var9.field2729 == 8 && class140.field2131 >= var12 && class140.field2132 * -1076088155 >= var13 && class140.field2131 < var14 && class140.field2132 * -1076088155 < var15) {
                                Statics.field3047 = var9;
                            }
                            if (var9.field2850 > var9.field2743) {
                                int var95 = var9.field2825 + var10;
                                int var96 = var9.field2743;
                                int var97 = var9.field2850;
                                int var98 = class140.field2131;
                                int var99 = class140.field2132 * -1076088155;
                                if (field372) {
                                    field523 = 32;
                                } else {
                                    field523 = 0;
                                }
                                field372 = false;
                                if (class140.field2130 == 1 || !Statics.field319 && class140.field2130 == 4) {
                                    if (var98 >= var95 && var98 < var95 + 16 && var99 >= var11 && var99 < var11 + 16) {
                                        var9.field2749 -= 4;
                                        method628(var9);
                                    } else if (var98 >= var95 && var98 < var95 + 16 && var99 >= var11 + var96 - 16 && var99 < var11 + var96) {
                                        var9.field2749 += 4;
                                        method628(var9);
                                    } else if (var98 >= var95 - field523 && var98 < field523 + var95 + 16 && var99 >= var11 + 16 && var99 < var11 + var96 - 16) {
                                        int var100 = (var96 - 32) * var96 / var97;
                                        if (var100 < 8) {
                                            var100 = 8;
                                        }
                                        int var101 = var99 - var11 - 16 - var100 / 2;
                                        int var102 = var96 - 32 - var100;
                                        var9.field2749 = (var97 - var96) * var101 / var102;
                                        method628(var9);
                                        field372 = true;
                                    }
                                }
                                if (field488 != 0) {
                                    int var103 = var9.field2825;
                                    if (var98 >= var95 - var103 && var99 >= var11 && var98 < var95 + 16 && var99 <= var11 + var96) {
                                        var9.field2749 += field488 * 45;
                                        method628(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bm.ce([Lft;II)V")
    public static final void method1063(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2729 == 0) {
                    if (var3.field2849 != null) {
                        method1063(var3.field2849, arg1);
                    }
                    class4 var4 = (class4) field450.method3459((long) var3.field2727);
                    if (var4 != null) {
                        int var5 = var4.field63;
                        if (Statics.method723(var5)) {
                            method1063(Statics.field2745[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2832 != null) {
                    class1 var6 = new class1();
                    var6.field3 = var3;
                    var6.field15 = var3.field2832;
                    class37.method1926(var6);
                }
                if (arg1 == 1 && var3.field2833 != null) {
                    if (var3.field2728 >= 0) {
                        class173 var7 = class173.method945(var3.field2727);
                        if (var7 == null || var7.field2849 == null || var3.field2728 >= var7.field2849.length || var7.field2849[var3.field2728] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field3 = var3;
                    var8.field15 = var3.field2833;
                    class37.method1926(var8);
                }
            }
        }
    }

    @ObfuscatedName("dj.cw(Lft;IIB)V")
    public static final void method2251(class173 arg0, int arg1, int arg2) {
        if (field359 != null || field430 || arg0 == null || method3416(arg0) == null) {
            return;
        }
        field359 = arg0;
        field463 = method3416(arg0);
        field464 = arg1;
        field538 = arg2;
        Statics.field286 = 0;
        field473 = false;
        if (field571 <= 0) {
            return;
        }
        int var3 = field571 - 1;
        Statics.field135 = new class31();
        Statics.field135.field712 = field432[var3];
        Statics.field135.field701 = field433[var3];
        Statics.field135.field702 = field434[var3];
        Statics.field135.field700 = field435[var3];
        Statics.field135.field704 = field436[var3];
    }

    @ObfuscatedName("fc.cx(IIB)V")
    public static void method3158(int arg0, int arg1) {
        class31 var2 = Statics.field135;
        method759(var2.field712, var2.field701, var2.field702, var2.field700, var2.field704, var2.field704, arg0, arg1);
        Statics.field135 = null;
    }

    @ObfuscatedName("aa.cl(Lft;B)V")
    public static void method628(class173 arg0) {
        if (field323 == arg0.field2725) {
            field495[arg0.field2856] = true;
        }
    }

    @ObfuscatedName("m.cg(B)V")
    public static void method124() {
        for (class4 var0 = (class4) field450.method3461(); var0 != null; var0 = (class4) field450.method3462()) {
            int var1 = var0.field63;
            if (Statics.method723(var1)) {
                boolean var2 = true;
                class173[] var3 = Statics.field2745[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2726;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3091;
                    class173 var6 = class173.method945(var5);
                    if (var6 != null) {
                        method628(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("gl.ca(Lft;B)Lft;")
    public static class173 method3416(class173 arg0) {
        class173 var1 = method440(arg0);
        if (var1 == null) {
            var1 = arg0.field2741;
        }
        return var1;
    }

    @ObfuscatedName("bm.cz([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1064(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("p.cs(IS)V")
    public static final void method189(int arg0) {
        if (!Statics.method723(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2745[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3 != null) {
                var3.field2859 = 0;
                var3.field2794 = 0;
            }
        }
    }

    @ObfuscatedName("ca.dg(II)V")
    public static final void method2111(int arg0) {
        if (Statics.method723(arg0)) {
            method1187(Statics.field2745[arg0], -1);
        }
    }

    @ObfuscatedName("bk.da([Lft;IB)V")
    public static final void method1187(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null && var3.field2746 == arg1 && (!var3.field2726 || !method163(var3))) {
                if (var3.field2729 == 0) {
                    if (!var3.field2726 && method163(var3) && Statics.field2014 != var3) {
                        continue;
                    }
                    method1187(arg0, var3.field2727);
                    if (var3.field2849 != null) {
                        method1187(var3.field2849, var3.field2727);
                    }
                    class4 var4 = (class4) field450.method3459((long) var3.field2727);
                    if (var4 != null) {
                        method2111(var4.field63);
                    }
                }
                if (var3.field2729 == 6) {
                    if (var3.field2751 != -1 || var3.field2773 != -1) {
                        boolean var5 = method175(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2773;
                        } else {
                            var6 = var3.field2751;
                        }
                        if (var6 != -1) {
                            class43 var7 = class43.method750(var6);
                            var3.field2794 += field367;
                            while (var3.field2794 > var7.field985[var3.field2859]) {
                                var3.field2794 -= var7.field985[var3.field2859];
                                var3.field2859++;
                                if (var3.field2859 >= var7.field986.length) {
                                    var3.field2859 -= var7.field994;
                                    if (var3.field2859 < 0 || var3.field2859 >= var7.field986.length) {
                                        var3.field2859 = 0;
                                    }
                                }
                                method628(var3);
                            }
                        }
                    }
                    if (var3.field2736 != 0 && !var3.field2726) {
                        int var8 = var3.field2736 >> 16;
                        int var9 = var3.field2736 << 16 >> 16;
                        int var10 = field367 * var8;
                        int var11 = field367 * var9;
                        var3.field2776 = var3.field2776 + var10 & 0x7FF;
                        var3.field2784 = var3.field2784 + var11 & 0x7FF;
                        method628(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("client.dh(IB)V")
    public static final void method554(int arg0) {
        method124();
        class24.method2754();
        int var1 = class53.method39(arg0).field1162;
        if (var1 == 0) {
            return;
        }
        int var2 = class176.field2875[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class91.method1943(0.9D);
                ((class95) Statics.field1581).method2013(0.9D);
            }
            if (var2 == 2) {
                class91.method1943(0.8D);
                ((class95) Statics.field1581).method2013(0.8D);
            }
            if (var2 == 3) {
                class91.method1943(0.7D);
                ((class95) Statics.field1581).method2013(0.7D);
            }
            if (var2 == 4) {
                class91.method1943(0.6D);
                ((class95) Statics.field1581).method2013(0.6D);
            }
            class52.field1115.method3428();
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
            if (field527 != var3) {
                if (field527 == 0 && field416 != -1) {
                    class183.method2205(Statics.field767, field416, 0, var3, false);
                    field552 = false;
                } else if (var3 == 0) {
                    class183.method2657();
                    field552 = false;
                } else {
                    class183.method2951(var3);
                }
                field527 = var3;
            }
        }
        if (var1 == 4) {
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
        if (var1 == 5) {
            field458 = var2;
        }
        if (var1 == 6) {
            field451 = var2;
        }
        if (var1 == 9) {
            field420 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field531 = 127;
            }
            if (var2 == 1) {
                field531 = 96;
            }
            if (var2 == 2) {
                field531 = 64;
            }
            if (var2 == 3) {
                field531 = 32;
            }
            if (var2 == 4) {
                field531 = 0;
            }
        }
        if (var1 == 17) {
            field558 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class21[] var4 = new class21[] { class21.field577, class21.field578, class21.field581 };
            field320 = (class21) class109.method104(var4, var2);
            if (field320 == null) {
                field320 = class21.field581;
            }
        }
        if (var1 != 19) {
            return;
        }
        if (var2 == -1) {
            field421 = -1;
        } else {
            field421 = var2 & 0x7FF;
        }
    }

    @ObfuscatedName("es.du(I)V")
    public static final void method2703() {
        field337.method2574(106);
        for (class4 var0 = (class4) field450.method3461(); var0 != null; var0 = (class4) field450.method3462()) {
            if (var0.field59 == 0 || var0.field59 == 3) {
                method109(var0, true);
            }
        }
        if (field453 != null) {
            method628(field453);
            field453 = null;
        }
    }

    @ObfuscatedName("j.dp(IIIB)Lw;")
    public static final class4 method559(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field63 = arg1;
        var3.field59 = arg2;
        field450.method3460(var3, (long) arg0);
        method189(arg1);
        class173 var4 = class173.method945(arg0);
        method628(var4);
        if (field453 != null) {
            method628(field453);
            field453 = null;
        }
        Statics.method170();
        method892(Statics.field2745[arg0 >> 16], var4, false);
        class37.method573(arg1);
        if (field413 != -1) {
            int var5 = field413;
            if (Statics.method723(var5)) {
                method1063(Statics.field2745[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("q.dl(Lw;ZI)V")
    public static final void method109(class4 arg0, boolean arg1) {
        int var2 = arg0.field63;
        int var3 = (int) arg0.field3091;
        arg0.method3588();
        if (arg1) {
            class173.method2634(var2);
        }
        method3157(var2);
        class173 var4 = class173.method945(var3);
        if (var4 != null) {
            method628(var4);
        }
        Statics.method170();
        if (field413 != -1) {
            int var5 = field413;
            if (Statics.method723(var5)) {
                method1063(Statics.field2745[var5], 1);
            }
        }
    }

    @ObfuscatedName("at.dj(Lft;B)Z")
    public static final boolean method1051(class173 arg0) {
        int var1 = arg0.field2731;
        if (var1 == 205) {
            field344 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field465.method3202(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field465.method3189(var4, var5 == 1);
        }
        if (var1 == 324) {
            field465.method3194(false);
        }
        if (var1 == 325) {
            field465.method3194(true);
        }
        if (var1 == 326) {
            field337.method2574(25);
            field465.method3191(field337);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("d.de(Lft;IIII)V")
    public static final void method9(class173 arg0, int arg1, int arg2, int arg3) {
        method1481();
        class175 var4 = arg0.method3103(false);
        if (var4 == null) {
            return;
        }
        class80.method1713(arg1, arg2, var4.field2866 + arg1, var4.field2867 + arg2);
        if (field526 == 2 || field526 == 5) {
            class80.method1679(arg1, arg2, 0, var4.field2870, var4.field2868);
        } else {
            int var5 = field456 + field375 & 0x7FF;
            int var6 = Statics.field677.field839 / 32 + 48;
            int var7 = 464 - Statics.field677.field803 / 32;
            Statics.field1652.method1596(arg1, arg2, var4.field2866, var4.field2867, var6, var7, var5, field364 + 256, var4.field2870, var4.field2868);
            for (int var8 = 0; var8 < field561; var8++) {
                int var9 = field444[var8] * 4 + 2 - Statics.field677.field839 / 32;
                int var10 = field352[var8] * 4 + 2 - Statics.field677.field803 / 32;
                method1065(arg1, arg2, var9, var10, field564[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class199 var13 = field422[Statics.field27][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field677.field839 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field677.field803 / 32;
                        method1065(arg1, arg2, var14, var15, Statics.field2019[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field457; var16++) {
                class35 var17 = field415[field331[var16]];
                if (var17 != null && var17.method11()) {
                    class40 var18 = var17.field777;
                    if (var18 != null && var18.field871 != null) {
                        var18 = var18.method744();
                    }
                    if (var18 != null && var18.field892 && var18.field888) {
                        int var19 = var17.field839 / 32 - Statics.field677.field839 / 32;
                        int var20 = var17.field803 / 32 - Statics.field677.field803 / 32;
                        method1065(arg1, arg2, var19, var20, Statics.field2019[1], var4);
                    }
                }
            }
            int var21 = class33.field750;
            int[] var22 = class33.field751;
            for (int var23 = 0; var23 < var21; var23++) {
                class3 var24 = field412[var22[var23]];
                if (var24 != null && var24.method11() && !var24.field48 && Statics.field677 != var24) {
                    int var25 = var24.field839 / 32 - Statics.field677.field839 / 32;
                    int var26 = var24.field803 / 32 - Statics.field677.field803 / 32;
                    boolean var27 = false;
                    if (method192(var24.field38, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field1543; var29++) {
                        if (var24.field38.equals(Statics.field179[var29].field629)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field677.field47 != 0 && var24.field47 != 0 && Statics.field677.field47 == var24.field47) {
                        var30 = true;
                    }
                    if (var27) {
                        method1065(arg1, arg2, var25, var26, Statics.field2019[3], var4);
                    } else if (var30) {
                        method1065(arg1, arg2, var25, var26, Statics.field2019[4], var4);
                    } else if (var28) {
                        method1065(arg1, arg2, var25, var26, Statics.field2019[5], var4);
                    } else {
                        method1065(arg1, arg2, var25, var26, Statics.field2019[2], var4);
                    }
                }
            }
            if (field311 != 0 && field303 % 20 < 10) {
                if (field311 == 1 && field312 >= 0 && field312 < field415.length) {
                    class35 var31 = field415[field312];
                    if (var31 != null) {
                        int var32 = var31.field839 / 32 - Statics.field677.field839 / 32;
                        int var33 = var31.field803 / 32 - Statics.field677.field803 / 32;
                        method162(arg1, arg2, var32, var33, Statics.field1222[1], var4);
                    }
                }
                if (field311 == 2) {
                    int var34 = field566 * 4 - Statics.field941 * 4 + 2 - Statics.field677.field839 / 32;
                    int var35 = field315 * 4 - Statics.field23 * 4 + 2 - Statics.field677.field803 / 32;
                    method162(arg1, arg2, var34, var35, Statics.field1222[1], var4);
                }
                if (field311 == 10 && field343 >= 0 && field343 < field412.length) {
                    class3 var36 = field412[field343];
                    if (var36 != null) {
                        int var37 = var36.field839 / 32 - Statics.field677.field839 / 32;
                        int var38 = var36.field803 / 32 - Statics.field677.field803 / 32;
                        method162(arg1, arg2, var37, var38, Statics.field1222[1], var4);
                    }
                }
            }
            if (field460 != 0) {
                int var39 = field460 * 4 + 2 - Statics.field677.field839 / 32;
                int var40 = field525 * 4 + 2 - Statics.field677.field803 / 32;
                method1065(arg1, arg2, var39, var40, Statics.field1222[0], var4);
            }
            if (!Statics.field677.field48) {
                class80.method1670(var4.field2866 / 2 + arg1 - 1, var4.field2867 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field508[arg3] = true;
    }

    @ObfuscatedName("ar.dn(Lft;IIIS)V")
    public static final void method785(class173 arg0, int arg1, int arg2, int arg3) {
        class175 var4 = arg0.method3103(false);
        if (var4 == null) {
            return;
        }
        if (field526 < 3) {
            Statics.field233.method1596(arg1, arg2, var4.field2866, var4.field2867, 25, 25, field375, 256, var4.field2870, var4.field2868);
        } else {
            class80.method1679(arg1, arg2, 0, var4.field2870, var4.field2868);
        }
    }

    @ObfuscatedName("o.dk(IIIILcy;Lfc;B)V")
    public static final void method162(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method1065(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field456 + field375 & 0x7FF;
        int var8 = class91.field1566[var7];
        int var9 = class91.field1585[var7];
        int var10 = var8 * 256 / (field364 + 256);
        int var11 = var9 * 256 / (field364 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field227.method1597(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("bm.db(IIIILcy;Lfc;I)V")
    public static final void method1065(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field456 + field375 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class91.field1566[var6];
        int var9 = class91.field1585[var6];
        int var10 = var8 * 256 / (field364 + 256);
        int var11 = var9 * 256 / (field364 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1640(arg5.field2866 / 2 + var12 - arg4.field1406 / 2, arg5.field2867 / 2 - var13 - arg4.field1407 / 2, arg0, arg1, arg5.field2866, arg5.field2867, arg5.field2870, arg5.field2868);
        } else {
            arg4.method1622(arg5.field2866 / 2 + arg0 + var12 - arg4.field1406 / 2, arg5.field2867 / 2 + arg1 - var13 - arg4.field1407 / 2);
        }
    }

    @ObfuscatedName("r.dq(Ljava/lang/String;ZB)Z")
    public static boolean method192(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class164.method171(arg0, Statics.field2000);
        for (int var3 = 0; var3 < field419; var3++) {
            if (var2.equalsIgnoreCase(class164.method171(field369[var3].field253, Statics.field2000)) && (!arg1 || field369[var3].field260 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class164.method171(Statics.field677.field38, Statics.field2000))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("p.df(Ljava/lang/String;I)Z")
    public static boolean method187(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class164.method171(arg0, Statics.field2000);
        for (int var2 = 0; var2 < field562; var2++) {
            class8 var3 = field563[var2];
            if (var1.equalsIgnoreCase(class164.method171(var3.field138, Statics.field2000))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class164.method171(var3.field128, Statics.field2000))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("dl.dw(Ljava/lang/String;ZI)V")
    public static final void method2248(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field562 < 100 || field414 == 1) || field562 >= 400) {
            class12.method2628(31, "", class157.field2461);
            return;
        }
        String var2 = class164.method171(arg0, Statics.field2000);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field562; var3++) {
            class8 var4 = field563[var3];
            String var5 = class164.method171(var4.field138, Statics.field2000);
            if (var5 != null && var5.equals(var2)) {
                class12.method2628(31, "", arg0 + class157.field2462);
                return;
            }
            if (var4.field128 != null) {
                String var6 = class164.method171(var4.field128, Statics.field2000);
                if (var6 != null && var6.equals(var2)) {
                    class12.method2628(31, "", arg0 + class157.field2462);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field419; var7++) {
            class18 var8 = field369[var7];
            String var9 = class164.method171(var8.field253, Statics.field2000);
            if (var9 != null && var9.equals(var2)) {
                class12.method2628(31, "", class157.field2467 + arg0 + class157.field2468);
                return;
            }
            if (var8.field254 != null) {
                String var10 = class164.method171(var8.field254, Statics.field2000);
                if (var10 != null && var10.equals(var2)) {
                    class12.method2628(31, "", class157.field2467 + arg0 + class157.field2468);
                    return;
                }
            }
        }
        if (class164.method171(Statics.field677.field38, Statics.field2000).equals(var2)) {
            class12.method2628(31, "", class157.field2348);
        } else {
            field337.method2574(204);
            field337.method2354(class119.method636(arg0));
            field337.method2372(arg0);
        }
    }

    @ObfuscatedName("fc.dd(II)V")
    public static void method3157(int arg0) {
        for (class201 var1 = (class201) field492.method3461(); var1 != null; var1 = (class201) field492.method3462()) {
            if ((var1.field3091 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3588();
            }
        }
    }

    @ObfuscatedName("f.dv(Lft;I)I")
    public static int method165(class173 arg0) {
        class201 var1 = (class201) field492.method3459(((long) arg0.field2727 << 32) + (long) arg0.field2728);
        return var1 == null ? arg0.field2797 : var1.field3078;
    }

    @ObfuscatedName("client.dm(Lft;B)Lft;")
    public static class173 method440(class173 arg0) {
        int var1 = class178.method2264(method165(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class173.method945(arg0.field2746);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("o.ds(Lft;I)Z")
    public static boolean method163(class173 arg0) {
        if (field459) {
            if (method165(arg0) != 0) {
                return false;
            }
            if (arg0.field2729 == 0) {
                return false;
            }
        }
        return arg0.field2724;
    }

    @ObfuscatedName("ai.dz(Lft;IB)Ljava/lang/String;")
    public static String method634(class173 arg0, int arg1) {
        if (!class178.method724(method165(arg0), arg1) && arg0.field2772 == null) {
            return null;
        } else if (arg0.field2799 == null || arg0.field2799.length <= arg1 || arg0.field2799[arg1] == null || arg0.field2799[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2799[arg1];
        }
    }

    @ObfuscatedName("ah.dx(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method613(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field318 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field318 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field318 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field318 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field318 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field2028 != null) {
            var3 = "/p=" + Statics.field2028;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field316 + "/a=" + Statics.field299 + var3 + "/";
    }

    @ObfuscatedName("ff.dr(Ljava/lang/String;I)V")
    public static void method3226(String arg0) {
        Statics.field2028 = arg0;
        try {
            String var1 = Statics.field291.getParameter(class190.field3031.field3045);
            String var2 = Statics.field291.getParameter(class190.field3030.field3045);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class111.method2021(class115.method671() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field291;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }
}

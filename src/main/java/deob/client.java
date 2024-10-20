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
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class144 {

    @ObfuscatedName("client.v")
    public static boolean field295 = true;

    @ObfuscatedName("client.n")
    public static int field296 = 1;

    @ObfuscatedName("client.f")
    public static int field467 = 0;

    @ObfuscatedName("client.o")
    public static int field298 = 0;

    @ObfuscatedName("client.b")
    public static boolean field300 = false;

    @ObfuscatedName("client.c")
    public static boolean field301 = false;

    @ObfuscatedName("client.l")
    public static int field302 = 0;

    @ObfuscatedName("client.w")
    public static class108[] field554 = new class108[4];

    @ObfuscatedName("client.r")
    public static int field304 = 0;

    @ObfuscatedName("client.u")
    public static boolean field315 = true;

    @ObfuscatedName("client.m")
    public static int field303 = 0;

    @ObfuscatedName("client.t")
    public static long field501 = 1L;

    @ObfuscatedName("client.e")
    public static int field308 = -1;

    @ObfuscatedName("client.a")
    public static int field309 = -1;

    @ObfuscatedName("client.at")
    public static int field539 = -1;

    @ObfuscatedName("client.aa")
    public static boolean field343 = true;

    @ObfuscatedName("client.ad")
    public static boolean field562 = false;

    @ObfuscatedName("client.af")
    public static int field313 = 0;

    @ObfuscatedName("client.ag")
    public static int field475 = 0;

    @ObfuscatedName("client.as")
    public static int field294 = 0;

    @ObfuscatedName("client.al")
    public static int field547 = 0;

    @ObfuscatedName("client.am")
    public static int field317 = 0;

    @ObfuscatedName("client.ar")
    public static int field318 = 0;

    @ObfuscatedName("client.ap")
    public static int field314 = 0;

    @ObfuscatedName("client.ac")
    public static int field551 = 0;

    @ObfuscatedName("client.ab")
    public static int field307 = 0;

    @ObfuscatedName("client.ay")
    public static class21 field457 = class21.field594;

    @ObfuscatedName("client.az")
    public static int field323 = 0;

    @ObfuscatedName("client.aq")
    public static int field580 = 0;

    @ObfuscatedName("client.ax")
    public static int field325 = 0;

    @ObfuscatedName("client.br")
    public static int field393 = 0;

    @ObfuscatedName("client.bz")
    public static int field365 = 0;

    @ObfuscatedName("client.bo")
    public static int field330 = 0;

    @ObfuscatedName("client.bg")
    public static int field486 = 0;

    @ObfuscatedName("client.bv")
    public static int field469 = 0;

    @ObfuscatedName("client.cl")
    public static class35[] field322 = new class35[32768];

    @ObfuscatedName("client.cm")
    public static int field336 = 0;

    @ObfuscatedName("client.cj")
    public static int[] field337 = new int[32768];

    @ObfuscatedName("client.cp")
    public static int field338 = 0;

    @ObfuscatedName("client.ck")
    public static int[] field505 = new int[250];

    @ObfuscatedName("client.cn")
    public static class122 field341 = new class122(5000);

    @ObfuscatedName("client.cy")
    public static class122 field342 = new class122(5000);

    @ObfuscatedName("client.cd")
    public static class122 field333 = new class122(15000);

    @ObfuscatedName("client.ca")
    public static int field344 = 0;

    @ObfuscatedName("client.ce")
    public static int field345 = 0;

    @ObfuscatedName("client.cq")
    public static int field346 = 0;

    @ObfuscatedName("client.cf")
    public static int field347 = 0;

    @ObfuscatedName("client.ct")
    public static int field362 = 0;

    @ObfuscatedName("client.cr")
    public static int field349 = 0;

    @ObfuscatedName("client.cs")
    public static int field372 = 0;

    @ObfuscatedName("client.cz")
    public static int field481 = 0;

    @ObfuscatedName("client.cb")
    public static boolean field352 = false;

    @ObfuscatedName("client.da")
    public static int field354 = 0;

    @ObfuscatedName("client.dk")
    public static int field355 = 1;

    @ObfuscatedName("client.dx")
    public static int field579 = 0;

    @ObfuscatedName("client.dq")
    public static int field357 = 1;

    @ObfuscatedName("client.dr")
    public static int field358 = 0;

    @ObfuscatedName("client.dn")
    public static boolean field360 = false;

    @ObfuscatedName("client.dc")
    public static int[][][] field361 = new int[4][13][13];

    @ObfuscatedName("client.dp")
    public static final int[] field407 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dj")
    public static int field319 = 0;

    @ObfuscatedName("client.dl")
    public static int field364 = 2;

    @ObfuscatedName("client.dw")
    public static int field525 = 0;

    @ObfuscatedName("client.df")
    public static int field466 = 2;

    @ObfuscatedName("client.di")
    public static int field367 = 0;

    @ObfuscatedName("client.dy")
    public static int field368 = 1;

    @ObfuscatedName("client.en")
    public static int field369 = 0;

    @ObfuscatedName("client.ea")
    public static int field370 = 0;

    @ObfuscatedName("client.ed")
    public static int field371 = 2;

    @ObfuscatedName("client.ev")
    public static int field582 = 0;

    @ObfuscatedName("client.em")
    public static int field373 = 1;

    @ObfuscatedName("client.eh")
    public static int field374 = 0;

    @ObfuscatedName("client.ew")
    public static int field472 = 0;

    @ObfuscatedName("client.eg")
    public static int field378 = 2301979;

    @ObfuscatedName("client.ez")
    public static int field570 = 5063219;

    @ObfuscatedName("client.ei")
    public static int field380 = 3353893;

    @ObfuscatedName("client.ej")
    public static int field381 = 7759444;

    @ObfuscatedName("client.eu")
    public static boolean field382 = false;

    @ObfuscatedName("client.et")
    public static int field383 = 0;

    @ObfuscatedName("client.fp")
    public static int field384 = 128;

    @ObfuscatedName("client.ft")
    public static int field385 = 0;

    @ObfuscatedName("client.fr")
    public static int field386 = 0;

    @ObfuscatedName("client.fo")
    public static int field310 = 0;

    @ObfuscatedName("client.fm")
    public static int field388 = 0;

    @ObfuscatedName("client.fv")
    public static int field493 = 0;

    @ObfuscatedName("client.ff")
    public static int field390 = 50;

    @ObfuscatedName("client.fi")
    public static int field391 = 0;

    @ObfuscatedName("client.fb")
    public static boolean field450 = false;

    @ObfuscatedName("client.fy")
    public static int field443 = 0;

    @ObfuscatedName("client.fu")
    public static int field394 = 0;

    @ObfuscatedName("client.fl")
    public static int field395 = 50;

    @ObfuscatedName("client.fj")
    public static int[] field396 = new int[field395];

    @ObfuscatedName("client.fc")
    public static int[] field397 = new int[field395];

    @ObfuscatedName("client.fd")
    public static int[] field398 = new int[field395];

    @ObfuscatedName("client.fa")
    public static int[] field387 = new int[field395];

    @ObfuscatedName("client.fq")
    public static int[] field400 = new int[field395];

    @ObfuscatedName("client.fk")
    public static int[] field569 = new int[field395];

    @ObfuscatedName("client.fs")
    public static int[] field320 = new int[field395];

    @ObfuscatedName("client.gr")
    public static String[] field403 = new String[field395];

    @ObfuscatedName("client.gj")
    public static int[][] field404 = new int[104][104];

    @ObfuscatedName("client.gf")
    public static int field405 = 0;

    @ObfuscatedName("client.ge")
    public static int field321 = -1;

    @ObfuscatedName("client.gi")
    public static int field567 = -1;

    @ObfuscatedName("client.gz")
    public static int field408 = 0;

    @ObfuscatedName("client.gl")
    public static int field520 = 0;

    @ObfuscatedName("client.gw")
    public static int field429 = 0;

    @ObfuscatedName("client.gs")
    public static int field411 = 0;

    @ObfuscatedName("client.gk")
    public static int field412 = 0;

    @ObfuscatedName("client.gd")
    public static int field413 = 0;

    @ObfuscatedName("client.gv")
    public static int field414 = 0;

    @ObfuscatedName("client.gn")
    public static int field415 = 0;

    @ObfuscatedName("client.gq")
    public static int field329 = 0;

    @ObfuscatedName("client.gt")
    public static int field417 = 0;

    @ObfuscatedName("client.gc")
    public static boolean field418 = false;

    @ObfuscatedName("client.gx")
    public static int field419 = 0;

    @ObfuscatedName("client.gp")
    public static int field332 = 0;

    @ObfuscatedName("client.ga")
    public static class3[] field421 = new class3[2048];

    @ObfuscatedName("client.gh")
    public static int field422 = -1;

    @ObfuscatedName("client.gm")
    public static int field423 = 0;

    @ObfuscatedName("client.hv")
    public static int field424 = 0;

    @ObfuscatedName("client.hn")
    public static int[] field297 = new int[1000];

    @ObfuscatedName("client.hf")
    public static final int[] field426 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hh")
    public static String[] field316 = new String[8];

    @ObfuscatedName("client.hg")
    public static boolean[] field366 = new boolean[8];

    @ObfuscatedName("client.hw")
    public static int[] field531 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hp")
    public static int field464 = -1;

    @ObfuscatedName("client.hl")
    public static class199[][][] field431 = new class199[4][104][104];

    @ObfuscatedName("client.ho")
    public static class199 field432 = new class199();

    @ObfuscatedName("client.hs")
    public static class199 field566 = new class199();

    @ObfuscatedName("client.hq")
    public static class199 field434 = new class199();

    @ObfuscatedName("client.hz")
    public static int[] field435 = new int[25];

    @ObfuscatedName("client.hd")
    public static int[] field436 = new int[25];

    @ObfuscatedName("client.hu")
    public static int[] field437 = new int[25];

    @ObfuscatedName("client.hr")
    public static int field529 = 0;

    @ObfuscatedName("client.hi")
    public static boolean field439 = false;

    @ObfuscatedName("client.hy")
    public static int field440 = 0;

    @ObfuscatedName("client.ht")
    public static int[] field441 = new int[500];

    @ObfuscatedName("client.he")
    public static int[] field389 = new int[500];

    @ObfuscatedName("client.ik")
    public static int[] field379 = new int[500];

    @ObfuscatedName("client.in")
    public static int[] field444 = new int[500];

    @ObfuscatedName("client.io")
    public static String[] field445 = new String[500];

    @ObfuscatedName("client.ih")
    public static String[] field446 = new String[500];

    @ObfuscatedName("client.ia")
    public static int field495 = -1;

    @ObfuscatedName("client.ir")
    public static int field448 = -1;

    @ObfuscatedName("client.iv")
    public static int field449 = 0;

    @ObfuscatedName("client.il")
    public static int field503 = 50;

    @ObfuscatedName("client.ic")
    public static int field451 = 0;

    @ObfuscatedName("client.it")
    public static String field438 = null;

    @ObfuscatedName("client.iq")
    public static boolean field454 = false;

    @ObfuscatedName("client.im")
    public static int field455 = -1;

    @ObfuscatedName("client.iy")
    public static int field456 = -1;

    @ObfuscatedName("client.ie")
    public static String field311 = null;

    @ObfuscatedName("client.iw")
    public static String field458 = null;

    @ObfuscatedName("client.ig")
    public static int field416 = -1;

    @ObfuscatedName("client.ij")
    public static class196 field460 = new class196(8);

    @ObfuscatedName("client.ib")
    public static int field461 = 0;

    @ObfuscatedName("client.jp")
    public static int field462 = 0;

    @ObfuscatedName("client.jd")
    public static class173 field463 = null;

    @ObfuscatedName("client.jh")
    public static int field312 = 0;

    @ObfuscatedName("client.jg")
    public static int field465 = 0;

    @ObfuscatedName("client.jk")
    public static int field453 = 0;

    @ObfuscatedName("client.jf")
    public static int field363 = -1;

    @ObfuscatedName("client.jv")
    public static boolean field468 = false;

    @ObfuscatedName("client.jl")
    public static boolean field452 = false;

    @ObfuscatedName("client.js")
    public static boolean field470 = false;

    @ObfuscatedName("client.jq")
    public static class173 field471 = null;

    @ObfuscatedName("client.jo")
    public static class173 field399 = null;

    @ObfuscatedName("client.jz")
    public static class173 field537 = null;

    @ObfuscatedName("client.jy")
    public static int field564 = 0;

    @ObfuscatedName("client.jn")
    public static int field428 = 0;

    @ObfuscatedName("client.ju")
    public static class173 field476 = null;

    @ObfuscatedName("client.jr")
    public static boolean field477 = false;

    @ObfuscatedName("client.jx")
    public static int field459 = -1;

    @ObfuscatedName("client.ja")
    public static int field479 = -1;

    @ObfuscatedName("client.jm")
    public static boolean field480 = false;

    @ObfuscatedName("client.jt")
    public static int field331 = -1;

    @ObfuscatedName("client.ji")
    public static int field482 = -1;

    @ObfuscatedName("client.je")
    public static boolean field483 = false;

    @ObfuscatedName("client.ku")
    public static int field484 = 1;

    @ObfuscatedName("client.km")
    public static int[] field430 = new int[32];

    @ObfuscatedName("client.ka")
    public static int field473 = 0;

    @ObfuscatedName("client.ko")
    public static int[] field487 = new int[32];

    @ObfuscatedName("client.kn")
    public static int field351 = 0;

    @ObfuscatedName("client.kc")
    public static int[] field489 = new int[32];

    @ObfuscatedName("client.ki")
    public static int field490 = 0;

    @ObfuscatedName("client.kk")
    public static int field491 = 0;

    @ObfuscatedName("client.kp")
    public static int field492 = 0;

    @ObfuscatedName("client.kg")
    public static int field521 = 0;

    @ObfuscatedName("client.kz")
    public static int field494 = 0;

    @ObfuscatedName("client.kh")
    public static int field546 = 0;

    @ObfuscatedName("client.kl")
    public static int field496 = 0;

    @ObfuscatedName("client.kw")
    public static int field497 = 0;

    @ObfuscatedName("client.kf")
    public static class199 field498 = new class199();

    @ObfuscatedName("client.ky")
    public static class199 field499 = new class199();

    @ObfuscatedName("client.kd")
    public static class199 field500 = new class199();

    @ObfuscatedName("client.kq")
    public static class196 field433 = new class196(512);

    @ObfuscatedName("client.ke")
    public static int field502 = 0;

    @ObfuscatedName("client.ks")
    public static int field571 = -2;

    @ObfuscatedName("client.kx")
    public static boolean[] field504 = new boolean[100];

    @ObfuscatedName("client.lk")
    public static boolean[] field442 = new boolean[100];

    @ObfuscatedName("client.lt")
    public static boolean[] field559 = new boolean[100];

    @ObfuscatedName("client.ls")
    public static int[] field402 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field508 = new int[100];

    @ObfuscatedName("client.lc")
    public static int[] field509 = new int[100];

    @ObfuscatedName("client.lo")
    public static int[] field510 = new int[100];

    @ObfuscatedName("client.lm")
    public static int field511 = 0;

    @ObfuscatedName("client.lr")
    public static long field512 = 0L;

    @ObfuscatedName("client.ll")
    public static boolean field513 = true;

    @ObfuscatedName("client.la")
    public static int field514 = 1;

    @ObfuscatedName("client.lj")
    public static int field515 = 503;

    @ObfuscatedName("client.ld")
    public static int[] field516 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lz")
    public static int field406 = 0;

    @ObfuscatedName("client.lh")
    public static int field518 = 0;

    @ObfuscatedName("client.lg")
    public static String field519 = "";

    @ObfuscatedName("client.lv")
    public static long[] field350 = new long[100];

    @ObfuscatedName("client.lx")
    public static int field410 = 0;

    @ObfuscatedName("client.lf")
    public static int field305 = 0;

    @ObfuscatedName("client.ly")
    public static int[] field523 = new int[128];

    @ObfuscatedName("client.mq")
    public static int[] field524 = new int[128];

    @ObfuscatedName("client.mp")
    public static long field425 = -1L;

    @ObfuscatedName("client.mv")
    public static String field526 = null;

    @ObfuscatedName("client.mc")
    public static String field527 = null;

    @ObfuscatedName("client.mu")
    public static int field540 = -1;

    @ObfuscatedName("client.mm")
    public static int field348 = 0;

    @ObfuscatedName("client.mx")
    public static int[] field530 = new int[1000];

    @ObfuscatedName("client.mg")
    public static int[] field507 = new int[1000];

    @ObfuscatedName("client.mz")
    public static class79[] field532 = new class79[1000];

    @ObfuscatedName("client.mn")
    public static int field533 = 0;

    @ObfuscatedName("client.mr")
    public static int field534 = 0;

    @ObfuscatedName("client.mf")
    public static int field535 = 0;

    @ObfuscatedName("client.ma")
    public static int field536 = 255;

    @ObfuscatedName("client.mh")
    public static int field401 = -1;

    @ObfuscatedName("client.mo")
    public static boolean field538 = false;

    @ObfuscatedName("client.nt")
    public static int field427 = 127;

    @ObfuscatedName("client.ng")
    public static int field328 = 127;

    @ObfuscatedName("client.nh")
    public static int field542 = 0;

    @ObfuscatedName("client.nb")
    public static int[] field543 = new int[50];

    @ObfuscatedName("client.nc")
    public static int[] field544 = new int[50];

    @ObfuscatedName("client.nx")
    public static int[] field545 = new int[50];

    @ObfuscatedName("client.nm")
    public static int[] field339 = new int[50];

    @ObfuscatedName("client.nk")
    public static class59[] field447 = new class59[50];

    @ObfuscatedName("client.nj")
    public static boolean field548 = false;

    @ObfuscatedName("client.nw")
    public static boolean[] field549 = new boolean[5];

    @ObfuscatedName("client.ou")
    public static int[] field550 = new int[5];

    @ObfuscatedName("client.ob")
    public static int[] field560 = new int[5];

    @ObfuscatedName("client.op")
    public static int[] field326 = new int[5];

    @ObfuscatedName("client.oq")
    public static int[] field553 = new int[5];

    @ObfuscatedName("client.oc")
    public static short field485 = 256;

    @ObfuscatedName("client.ot")
    public static short field555 = 205;

    @ObfuscatedName("client.oa")
    public static short field556 = 256;

    @ObfuscatedName("client.ok")
    public static short field557 = 320;

    @ObfuscatedName("client.om")
    public static short field558 = 1;

    @ObfuscatedName("client.od")
    public static short field474 = 32767;

    @ObfuscatedName("client.oe")
    public static short field335 = 1;

    @ObfuscatedName("client.ow")
    public static short field561 = 32767;

    @ObfuscatedName("client.og")
    public static int field506 = 0;

    @ObfuscatedName("client.oh")
    public static int field563 = 0;

    @ObfuscatedName("client.oy")
    public static int field522 = 0;

    @ObfuscatedName("client.os")
    public static int field565 = 0;

    @ObfuscatedName("client.ol")
    public static int field324 = 0;

    @ObfuscatedName("client.or")
    public static int field578 = 0;

    @ObfuscatedName("client.oz")
    public static int field568 = 0;

    @ObfuscatedName("client.oi")
    public static class18[] field478 = new class18[400];

    @ObfuscatedName("client.oj")
    public static class195 field528 = new class195();

    @ObfuscatedName("client.oo")
    public static int field356 = 0;

    @ObfuscatedName("client.ov")
    public static class8[] field572 = new class8[400];

    @ObfuscatedName("client.on")
    public static class179 field573 = new class179();

    @ObfuscatedName("client.pf")
    public static int field574 = -1;

    @ObfuscatedName("client.pj")
    public static int field575 = -1;

    @ObfuscatedName("client.pl")
    public static class220[] field576 = new class220[8];

    @ObfuscatedName("client.pu")
    public static long field577 = -1L;

    @ObfuscatedName("client.py")
    public static long field306 = -1L;

    @ObfuscatedName("client.pr")
    public static final class11 field359 = new class11();

    @ObfuscatedName("client.pw")
    public static int[] field420 = new int[50];

    @ObfuscatedName("client.pp")
    public static int[] field581 = new int[50];

    @ObfuscatedName("client.v(I)V")
    public final void method233() {
    }

    public final void init() {
        if (!this.method2891()) {
            return;
        }
        class190[] var1 = new class190[] { class190.field3043, class190.field3030, class190.field3038, class190.field3044, class190.field3036, class190.field3037, class190.field3042, class190.field3041, class190.field3039, class190.field3033, class190.field3040, class190.field3031, class190.field3035, class190.field3034, class190.field3032 };
        class190[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class190 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3045);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3045)) {
                    case 1:
                        if (var5.equalsIgnoreCase(class2.field30)) {
                            field300 = true;
                        } else {
                            field300 = false;
                        }
                        break;
                    case 2:
                        Statics.field299 = (class154) class109.method46(class154.method843(), Integer.parseInt(var5));
                        if (Statics.field299 == class154.field2276) {
                            Statics.field1868 = class212.field3112;
                        } else {
                            Statics.field1868 = class212.field3116;
                        }
                        break;
                    case 3:
                        if (var5.equalsIgnoreCase(class2.field30)) {
                        }
                        break;
                    case 4:
                        field298 = Integer.parseInt(var5);
                        break;
                    case 5:
                        field302 = Integer.parseInt(var5);
                        break;
                    case 6:
                        Statics.field409 = Integer.parseInt(var5);
                        break;
                    case 7:
                        Statics.field694 = var5;
                    case 8:
                    case 11:
                    case 14:
                    default:
                        break;
                    case 9:
                        Statics.field1946 = class153.method2990(Integer.parseInt(var5));
                        break;
                    case 10:
                        Statics.field1882 = Integer.parseInt(var5);
                        break;
                    case 12:
                        Statics.field13 = var5;
                        break;
                    case 13:
                        field296 = Integer.parseInt(var5);
                        break;
                    case 15:
                        field467 = Integer.parseInt(var5);
                }
            }
        }
        method1782();
        Statics.field1094 = this.getCodeBase().getHost();
        String var6 = Statics.field1946.field2259;
        byte var7 = 0;
        try {
            Statics.field2222 = 16;
            Statics.field86 = var7;
            try {
                Statics.field1221 = System.getProperty("os.name");
            } catch (Exception var45) {
                Statics.field1221 = "Unknown";
            }
            Statics.field222 = Statics.field1221.toLowerCase();
            try {
                Statics.field2128 = System.getProperty("user.home");
                if (Statics.field2128 != null) {
                    Statics.field2128 = Statics.field2128 + "/";
                }
            } catch (Exception var44) {
            }
            try {
                if (Statics.field222.startsWith("win")) {
                    if (Statics.field2128 == null) {
                        Statics.field2128 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2128 == null) {
                    Statics.field2128 = System.getenv("HOME");
                }
                if (Statics.field2128 != null) {
                    Statics.field2128 = Statics.field2128 + "/";
                }
            } catch (Exception var43) {
            }
            if (Statics.field2128 == null) {
                Statics.field2128 = "~/";
            }
            Statics.field2226 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2128, "/tmp/", "" };
            Statics.field2931 = new String[] { ".jagex_cache_" + Statics.field86, ".file_store_" + Statics.field86 };
            int var11 = 0;
            label244: while (var11 < 4) {
                String var12 = var11 == 0 ? "" : "" + var11;
                Statics.field2220 = new File(Statics.field2128, "jagex_cl_oldschool_" + var6 + var12 + ".dat");
                String var13 = null;
                String var14 = null;
                boolean var15 = false;
                if (Statics.field2220.exists()) {
                    try {
                        class227 var16 = new class227(Statics.field2220, "rw", 10000L);
                        class119 var17 = new class119((int) var16.method3910());
                        while (var17.field1973 < var17.field1978.length) {
                            int var18 = var16.method3915(var17.field1978, var17.field1973, var17.field1978.length - var17.field1973);
                            if (var18 == -1) {
                                throw new IOException();
                            }
                            var17.field1973 += var18;
                        }
                        var17.field1973 = 0;
                        int var19 = var17.method2383();
                        if (var19 < 1 || var19 > 3) {
                            throw new IOException("" + var19);
                        }
                        int var20 = 0;
                        if (var19 > 1) {
                            var20 = var17.method2383();
                        }
                        if (var19 <= 2) {
                            var13 = var17.method2392();
                            if (var20 == 1) {
                                var14 = var17.method2392();
                            }
                        } else {
                            var13 = var17.method2393();
                            if (var20 == 1) {
                                var14 = var17.method2393();
                            }
                        }
                        var16.method3909();
                    } catch (IOException var47) {
                        var47.printStackTrace();
                    }
                    if (var13 != null) {
                        File var22 = new File(var13);
                        if (!var22.exists()) {
                            var13 = null;
                        }
                    }
                    if (var13 != null) {
                        File var23 = new File(var13, "test.dat");
                        if (!class149.method621(var23, true)) {
                            var13 = null;
                        }
                    }
                }
                if (var13 == null && var11 == 0) {
                    label219: for (int var24 = 0; var24 < Statics.field2931.length; var24++) {
                        for (int var25 = 0; var25 < Statics.field2226.length; var25++) {
                            File var26 = new File(Statics.field2226[var25] + Statics.field2931[var24] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var26.exists() && class149.method621(new File(var26, "test.dat"), true)) {
                                var13 = var26.toString();
                                var15 = true;
                                break label219;
                            }
                        }
                    }
                }
                if (var13 == null) {
                    var13 = Statics.field2128 + File.separatorChar + "jagexcache" + var12 + File.separatorChar + "oldschool" + File.separatorChar + var6 + File.separatorChar;
                    var15 = true;
                }
                if (var14 != null) {
                    File var27 = new File(var14);
                    File var28 = new File(var13);
                    try {
                        File[] var29 = var27.listFiles();
                        File[] var30 = var29;
                        for (int var31 = 0; var31 < var30.length; var31++) {
                            File var32 = var30[var31];
                            File var33 = new File(var28, var32.getName());
                            boolean var34 = var32.renameTo(var33);
                            if (!var34) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var46) {
                        var46.printStackTrace();
                    }
                    var15 = true;
                }
                if (var15) {
                    class149.method1532(new File(var13), (File) null);
                }
                File var36 = new File(var13);
                Statics.field2221 = var36;
                if (!Statics.field2221.exists()) {
                    Statics.field2221.mkdirs();
                }
                File[] var37 = Statics.field2221.listFiles();
                if (var37 != null) {
                    File[] var38 = var37;
                    for (int var39 = 0; var39 < var38.length; var39++) {
                        File var40 = var38[var39];
                        if (!class149.method621(var40, false)) {
                            var11++;
                            continue label244;
                        }
                    }
                }
                break;
            }
            class135.method2672(Statics.field2221);
            class149.method79();
            class149.field2225 = new class228(new class227(class135.method1596("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class149.field2232 = new class228(new class227(class135.method1596("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field68 = new class228[Statics.field2222];
            for (int var41 = 0; var41 < Statics.field2222; var41++) {
                Statics.field68[var41] = new class228(new class227(class135.method1596("main_file_cache.idx" + var41), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var48) {
            class148.method190((String) null, var48);
        }
        Statics.field2881 = this;
        this.method2937(765, 503, 93);
    }

    @ObfuscatedName("ci.f(B)V")
    public static final void method1782() {
        class86.field1487 = false;
        field301 = false;
    }

    @ObfuscatedName("client.g(I)V")
    public final void method427() {
        Statics.field392 = field298 == 0 ? 43594 : field296 + 40000;
        Statics.field64 = field298 == 0 ? 443 : field296 + 50000;
        Statics.field334 = Statics.field392;
        Statics.field2892 = class174.field2866;
        Statics.field2286 = class174.field2870;
        Statics.field2886 = class174.field2867;
        Statics.field1549 = class174.field2868;
        if (Statics.field2081.toLowerCase().indexOf("microsoft") == -1) {
            class137.field2108[44] = 71;
            class137.field2108[45] = 26;
            class137.field2108[46] = 72;
            class137.field2108[47] = 73;
            class137.field2108[59] = 57;
            class137.field2108[61] = 27;
            class137.field2108[91] = 42;
            class137.field2108[92] = 74;
            class137.field2108[93] = 43;
            class137.field2108[192] = 28;
            class137.field2108[222] = 58;
            class137.field2108[520] = 59;
        } else {
            class137.field2108[186] = 57;
            class137.field2108[187] = 27;
            class137.field2108[188] = 71;
            class137.field2108[189] = 26;
            class137.field2108[190] = 72;
            class137.field2108[191] = 73;
            class137.field2108[192] = 58;
            class137.field2108[219] = 42;
            class137.field2108[220] = 74;
            class137.field2108[221] = 43;
            class137.field2108[222] = 59;
            class137.field2108[223] = 28;
        }
        class137.method2754(Statics.field2897);
        class140.method698(Statics.field2897);
        Statics.field2278 = class131.method121();
        if (Statics.field2278 != null) {
            Statics.field2278.method2704(Statics.field2897);
        }
        Statics.field676 = new class134(255, class149.field2225, class149.field2232, 500000);
        class227 var1 = null;
        class9 var2 = new class9();
        try {
            var1 = Statics.method3301("", Statics.field299.field2277, false);
            byte[] var3 = new byte[(int) var1.method3910()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method3915(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class9(new class119(var3));
        } catch (Exception var10) {
        }
        try {
            if (var1 != null) {
                var1.method3909();
            }
        } catch (Exception var9) {
        }
        Statics.field2871 = var2;
        Statics.field27 = this.getToolkit().getSystemClipboard();
        class138.method938(this, Statics.field647);
        if (field298 != 0) {
            field562 = true;
        }
        method2335(Statics.field2871.field150);
    }

    @ObfuscatedName("client.o(I)V")
    public final void method237() {
        field303++;
        this.method240();
        class170.method674();
        try {
            if (class183.field2927 == 1) {
                int var1 = Statics.field2926.method3421();
                if (var1 > 0 && Statics.field2926.method3425()) {
                    int var2 = var1 - Statics.field28;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2926.method3420(var2);
                } else {
                    Statics.field2926.method3426();
                    Statics.field2926.method3424();
                    if (Statics.field174 == null) {
                        class183.field2927 = 0;
                    } else {
                        class183.field2927 = 2;
                    }
                    Statics.field1612 = null;
                    Statics.field1993 = null;
                }
            }
        } catch (Exception var849) {
            var849.printStackTrace();
            Statics.field2926.method3426();
            class183.field2927 = 0;
            Statics.field1612 = null;
            Statics.field1993 = null;
            Statics.field174 = null;
        }
        method585();
        class137.method703();
        class140 var4 = class140.field2143;
        synchronized (class140.field2143) {
            class140.field2142 = class140.field2130;
            class140.field2134 = class140.field2131;
            class140.field2135 = class140.field2138 * 829225445;
            class140.field2140 = class140.field2136;
            class140.field2146 = class140.field2137;
            class140.field2132 = class140.field2133;
            class140.field2141 = class140.field2139;
            class140.field2136 = 0;
        }
        if (Statics.field2278 != null) {
            int var6 = Statics.field2278.method2706();
            field497 = var6;
        }
        int var10002;
        if (field304 == 0) {
            method2262();
            class144.method2755();
        } else if (field304 == 5) {
            class32.method2323(this);
            method2262();
            class144.method2755();
        } else if (field304 == 10 || field304 == 11) {
            class32.method2323(this);
        } else if (field304 == 20) {
            class32.method2323(this);
            method2330();
        } else if (field304 == 25) {
            method51(false);
            field354 = 0;
            boolean var7 = true;
            for (int var8 = 0; var8 < Statics.field682.length; var8++) {
                if (Statics.field488[var8] != -1 && Statics.field682[var8] == null) {
                    Statics.field682[var8] = Statics.field2153.method3073(Statics.field488[var8], 0);
                    if (Statics.field682[var8] == null) {
                        var7 = false;
                        field354++;
                    }
                }
                if (Statics.field2125[var8] != -1 && Statics.field787[var8] == null) {
                    Statics.field787[var8] = Statics.field2153.method3074(Statics.field2125[var8], 0, Statics.field1958[var8]);
                    if (Statics.field787[var8] == null) {
                        var7 = false;
                        field354++;
                    }
                }
            }
            if (var7) {
                field579 = 0;
                boolean var9 = true;
                for (int var10 = 0; var10 < Statics.field682.length; var10++) {
                    byte[] var11 = Statics.field787[var10];
                    if (var11 != null) {
                        int var12 = (Statics.field274[var10] >> 8) * 64 - Statics.field2719;
                        int var13 = (Statics.field274[var10] & 0xFF) * 64 - Statics.field607;
                        if (field360) {
                            var12 = 10;
                            var13 = 10;
                        }
                        boolean var15 = true;
                        class119 var16 = new class119(var11);
                        int var17 = -1;
                        label4882: while (true) {
                            int var18 = var16.method2484();
                            if (var18 == 0) {
                                var9 &= var15;
                                break;
                            }
                            var17 += var18;
                            int var19 = 0;
                            boolean var20 = false;
                            while (true) {
                                while (!var20) {
                                    int var22 = var16.method2484();
                                    if (var22 == 0) {
                                        continue label4882;
                                    }
                                    var19 += var22 - 1;
                                    int var23 = var19 & 0x3F;
                                    int var24 = var19 >> 6 & 0x3F;
                                    int var25 = var16.method2383() >> 2;
                                    int var26 = var12 + var24;
                                    int var27 = var13 + var23;
                                    if (var26 > 0 && var27 > 0 && var26 < 103 && var27 < 103) {
                                        class41 var28 = class41.method2325(var17);
                                        if (var25 != 22 || !field301 || var28.field943 != 0 || var28.field937 == 1 || var28.field966) {
                                            if (!var28.method770()) {
                                                field579++;
                                                var15 = false;
                                            }
                                            var20 = true;
                                        }
                                    }
                                }
                                int var21 = var16.method2484();
                                if (var21 == 0) {
                                    break;
                                }
                                var16.method2383();
                            }
                        }
                    }
                }
                if (var9) {
                    if (field358 != 0) {
                        method953(class157.field2313 + class2.field22 + class2.field19 + 100 + "%" + class2.field20, true);
                    }
                    method585();
                    method50();
                    method585();
                    Statics.field649.method1790();
                    method585();
                    System.gc();
                    for (int var30 = 0; var30 < 4; var30++) {
                        field554[var30].method2265();
                    }
                    for (int var31 = 0; var31 < 4; var31++) {
                        for (int var32 = 0; var32 < 104; var32++) {
                            for (int var33 = 0; var33 < 104; var33++) {
                                class6.field109[var31][var32][var33] = 0;
                            }
                        }
                    }
                    method585();
                    class6.method2850();
                    int var34 = Statics.field682.length;
                    class24.method805();
                    method51(true);
                    if (!field360) {
                        for (int var35 = 0; var35 < var34; var35++) {
                            int var36 = (Statics.field274[var35] >> 8) * 64 - Statics.field2719;
                            int var37 = (Statics.field274[var35] & 0xFF) * 64 - Statics.field607;
                            byte[] var38 = Statics.field682[var35];
                            if (var38 != null) {
                                method585();
                                class6.method2822(var38, var36, var37, Statics.field166 * 8 - 48, Statics.field2982 * 8 - 48, field554);
                            }
                        }
                        for (int var39 = 0; var39 < var34; var39++) {
                            int var40 = (Statics.field274[var39] >> 8) * 64 - Statics.field2719;
                            int var41 = (Statics.field274[var39] & 0xFF) * 64 - Statics.field607;
                            byte[] var42 = Statics.field682[var39];
                            if (var42 == null && Statics.field2982 < 800) {
                                method585();
                                class6.method1488(var40, var41, 64, 64);
                            }
                        }
                        method51(true);
                        for (int var43 = 0; var43 < var34; var43++) {
                            byte[] var44 = Statics.field787[var43];
                            if (var44 != null) {
                                int var45 = (Statics.field274[var43] >> 8) * 64 - Statics.field2719;
                                int var46 = (Statics.field274[var43] & 0xFF) * 64 - Statics.field607;
                                method585();
                                class86 var47 = Statics.field649;
                                class108[] var48 = field554;
                                class119 var49 = new class119(var44);
                                int var50 = -1;
                                while (true) {
                                    int var51 = var49.method2484();
                                    if (var51 == 0) {
                                        break;
                                    }
                                    var50 += var51;
                                    int var52 = 0;
                                    while (true) {
                                        int var53 = var49.method2484();
                                        if (var53 == 0) {
                                            break;
                                        }
                                        var52 += var53 - 1;
                                        int var54 = var52 & 0x3F;
                                        int var55 = var52 >> 6 & 0x3F;
                                        int var56 = var52 >> 12;
                                        int var57 = var49.method2383();
                                        int var58 = var57 >> 2;
                                        int var59 = var57 & 0x3;
                                        int var60 = var45 + var55;
                                        int var61 = var46 + var54;
                                        if (var60 > 0 && var61 > 0 && var60 < 103 && var61 < 103) {
                                            int var62 = var56;
                                            if ((class6.field109[1][var60][var61] & 0x2) == 2) {
                                                var62 = var56 - 1;
                                            }
                                            class108 var63 = null;
                                            if (var62 >= 0) {
                                                var63 = var48[var62];
                                            }
                                            class6.method2303(var56, var60, var61, var50, var59, var58, var47, var63);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (field360) {
                        int var64 = 0;
                        label4787: while (true) {
                            if (var64 >= 4) {
                                for (int var82 = 0; var82 < 13; var82++) {
                                    for (int var83 = 0; var83 < 13; var83++) {
                                        int var84 = field361[0][var82][var83];
                                        if (var84 == -1) {
                                            class6.method1488(var82 * 8, var83 * 8, 8, 8);
                                        }
                                    }
                                }
                                method51(true);
                                int var85 = 0;
                                while (true) {
                                    if (var85 >= 4) {
                                        break label4787;
                                    }
                                    method585();
                                    for (int var86 = 0; var86 < 13; var86++) {
                                        label4710: for (int var87 = 0; var87 < 13; var87++) {
                                            int var88 = field361[var85][var86][var87];
                                            if (var88 != -1) {
                                                int var89 = var88 >> 24 & 0x3;
                                                int var90 = var88 >> 1 & 0x3;
                                                int var91 = var88 >> 14 & 0x3FF;
                                                int var92 = var88 >> 3 & 0x7FF;
                                                int var93 = (var91 / 8 << 8) + var92 / 8;
                                                for (int var94 = 0; var94 < Statics.field274.length; var94++) {
                                                    if (Statics.field274[var94] == var93 && Statics.field787[var94] != null) {
                                                        byte[] var95 = Statics.field787[var94];
                                                        int var96 = var86 * 8;
                                                        int var97 = var87 * 8;
                                                        int var98 = (var91 & 0x7) * 8;
                                                        int var99 = (var92 & 0x7) * 8;
                                                        class86 var100 = Statics.field649;
                                                        class108[] var101 = field554;
                                                        class119 var102 = new class119(var95);
                                                        int var103 = -1;
                                                        while (true) {
                                                            int var104 = var102.method2484();
                                                            if (var104 == 0) {
                                                                continue label4710;
                                                            }
                                                            var103 += var104;
                                                            int var105 = 0;
                                                            while (true) {
                                                                int var106 = var102.method2484();
                                                                if (var106 == 0) {
                                                                    break;
                                                                }
                                                                var105 += var106 - 1;
                                                                int var107 = var105 & 0x3F;
                                                                int var108 = var105 >> 6 & 0x3F;
                                                                int var109 = var105 >> 12;
                                                                int var110 = var102.method2383();
                                                                int var111 = var110 >> 2;
                                                                int var112 = var110 & 0x3;
                                                                if (var89 == var109 && var108 >= var98 && var108 < var98 + 8 && var107 >= var99 && var107 < var99 + 8) {
                                                                    class41 var113 = class41.method2325(var103);
                                                                    int var115 = var108 & 0x7;
                                                                    int var116 = var107 & 0x7;
                                                                    int var118 = var113.field928;
                                                                    int var119 = var113.field978;
                                                                    if ((var112 & 0x1) == 1) {
                                                                        int var120 = var118;
                                                                        var118 = var119;
                                                                        var119 = var120;
                                                                    }
                                                                    int var121 = var90 & 0x3;
                                                                    int var122;
                                                                    if (var121 == 0) {
                                                                        var122 = var115;
                                                                    } else if (var121 == 1) {
                                                                        var122 = var116;
                                                                    } else if (var121 == 2) {
                                                                        var122 = 7 - var115 - (var118 - 1);
                                                                    } else {
                                                                        var122 = 7 - var116 - (var119 - 1);
                                                                    }
                                                                    int var123 = var96 + var122;
                                                                    int var124 = var97 + class177.method2796(var108 & 0x7, var107 & 0x7, var90, var113.field928, var113.field978, var112);
                                                                    if (var123 > 0 && var124 > 0 && var123 < 103 && var124 < 103) {
                                                                        int var125 = var85;
                                                                        if ((class6.field109[1][var123][var124] & 0x2) == 2) {
                                                                            var125 = var85 - 1;
                                                                        }
                                                                        class108 var126 = null;
                                                                        if (var125 >= 0) {
                                                                            var126 = var101[var125];
                                                                        }
                                                                        class6.method2303(var85, var123, var124, var103, var90 + var112 & 0x3, var111, var100, var126);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var85++;
                                }
                            }
                            method585();
                            for (int var65 = 0; var65 < 13; var65++) {
                                for (int var66 = 0; var66 < 13; var66++) {
                                    boolean var67 = false;
                                    int var68 = field361[var64][var65][var66];
                                    if (var68 != -1) {
                                        int var69 = var68 >> 24 & 0x3;
                                        int var70 = var68 >> 1 & 0x3;
                                        int var71 = var68 >> 14 & 0x3FF;
                                        int var72 = var68 >> 3 & 0x7FF;
                                        int var73 = (var71 / 8 << 8) + var72 / 8;
                                        for (int var74 = 0; var74 < Statics.field274.length; var74++) {
                                            if (Statics.field274[var74] == var73 && Statics.field682[var74] != null) {
                                                class6.method958(Statics.field682[var74], var64, var65 * 8, var66 * 8, var69, (var71 & 0x7) * 8, (var72 & 0x7) * 8, var70, field554);
                                                var67 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var67) {
                                        int var75 = var64;
                                        int var76 = var65 * 8;
                                        int var77 = var66 * 8;
                                        for (int var78 = 0; var78 < 8; var78++) {
                                            for (int var79 = 0; var79 < 8; var79++) {
                                                class6.field89[var75][var76 + var78][var77 + var79] = 0;
                                            }
                                        }
                                        if (var76 > 0) {
                                            for (int var80 = 1; var80 < 8; var80++) {
                                                class6.field89[var75][var76][var77 + var80] = class6.field89[var75][var76 - 1][var77 + var80];
                                            }
                                        }
                                        if (var77 > 0) {
                                            for (int var81 = 1; var81 < 8; var81++) {
                                                class6.field89[var75][var76 + var81][var77] = class6.field89[var75][var76 + var81][var77 - 1];
                                            }
                                        }
                                        if (var76 > 0 && class6.field89[var75][var76 - 1][var77] != 0) {
                                            class6.field89[var75][var76][var77] = class6.field89[var75][var76 - 1][var77];
                                        } else if (var77 > 0 && class6.field89[var75][var76][var77 - 1] != 0) {
                                            class6.field89[var75][var76][var77] = class6.field89[var75][var76][var77 - 1];
                                        } else if (var76 > 0 && var77 > 0 && class6.field89[var75][var76 - 1][var77 - 1] != 0) {
                                            class6.field89[var75][var76][var77] = class6.field89[var75][var76 - 1][var77 - 1];
                                        }
                                    }
                                }
                            }
                            var64++;
                        }
                    }
                    method51(true);
                    method50();
                    method585();
                    class86 var127 = Statics.field649;
                    class108[] var128 = field554;
                    for (int var129 = 0; var129 < 4; var129++) {
                        for (int var130 = 0; var130 < 104; var130++) {
                            for (int var131 = 0; var131 < 104; var131++) {
                                if ((class6.field109[var129][var130][var131] & 0x1) == 1) {
                                    int var132 = var129;
                                    if ((class6.field109[1][var130][var131] & 0x2) == 2) {
                                        var132 = var129 - 1;
                                    }
                                    if (var132 >= 0) {
                                        var128[var132].method2268(var130, var131);
                                    }
                                }
                            }
                        }
                    }
                    class6.field103 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field103 < -8) {
                        class6.field103 = -8;
                    }
                    if (class6.field103 > 8) {
                        class6.field103 = 8;
                    }
                    class6.field104 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field104 < -16) {
                        class6.field104 = -16;
                    }
                    if (class6.field104 > 16) {
                        class6.field104 = 16;
                    }
                    for (int var133 = 0; var133 < 4; var133++) {
                        byte[][] var134 = Statics.field93[var133];
                        int var135 = (int) Math.sqrt(5100.0D);
                        int var136 = var135 * 768 >> 8;
                        for (int var137 = 1; var137 < 103; var137++) {
                            for (int var138 = 1; var138 < 103; var138++) {
                                int var139 = class6.field89[var133][var138 + 1][var137] - class6.field89[var133][var138 - 1][var137];
                                int var140 = class6.field89[var133][var138][var137 + 1] - class6.field89[var133][var138][var137 - 1];
                                int var141 = (int) Math.sqrt((double) (var140 * var140 + var139 * var139 + 65536));
                                int var142 = (var139 << 8) / var141;
                                int var143 = 65536 / var141;
                                int var144 = (var140 << 8) / var141;
                                int var145 = (var144 * -50 + var142 * -50 + var143 * -10) / var136 + 96;
                                int var146 = (var134[var138][var137] >> 1) + (var134[var138][var137 + 1] >> 3) + (var134[var138][var137 - 1] >> 2) + (var134[var138 - 1][var137] >> 2) + (var134[var138 + 1][var137] >> 3);
                                Statics.field94[var138][var137] = var145 - var146;
                            }
                        }
                        for (int var147 = 0; var147 < 104; var147++) {
                            Statics.field3096[var147] = 0;
                            Statics.field791[var147] = 0;
                            Statics.field1372[var147] = 0;
                            Statics.field3144[var147] = 0;
                            Statics.field1629[var147] = 0;
                        }
                        for (int var148 = -5; var148 < 109; var148++) {
                            for (int var149 = 0; var149 < 104; var149++) {
                                int var150 = var148 + 5;
                                if (var150 >= 0 && var150 < 104) {
                                    int var151 = Statics.field2633[var133][var150][var149] & 0xFF;
                                    if (var151 > 0) {
                                        class42 var152 = class42.method162(var151 - 1);
                                        Statics.field3096[var149] += var152.field983;
                                        Statics.field791[var149] += var152.field982;
                                        Statics.field1372[var149] += var152.field984;
                                        Statics.field3144[var149] += var152.field985;
                                        var10002 = Statics.field1629[var149]++;
                                    }
                                }
                                int var153 = var148 - 5;
                                if (var153 >= 0 && var153 < 104) {
                                    int var154 = Statics.field2633[var133][var153][var149] & 0xFF;
                                    if (var154 > 0) {
                                        class42 var155 = class42.method162(var154 - 1);
                                        Statics.field3096[var149] -= var155.field983;
                                        Statics.field791[var149] -= var155.field982;
                                        Statics.field1372[var149] -= var155.field984;
                                        Statics.field3144[var149] -= var155.field985;
                                        var10002 = Statics.field1629[var149]--;
                                    }
                                }
                            }
                            if (var148 >= 1 && var148 < 103) {
                                int var156 = 0;
                                int var157 = 0;
                                int var158 = 0;
                                int var159 = 0;
                                int var160 = 0;
                                for (int var161 = -5; var161 < 109; var161++) {
                                    int var162 = var161 + 5;
                                    if (var162 >= 0 && var162 < 104) {
                                        var156 += Statics.field3096[var162];
                                        var157 += Statics.field791[var162];
                                        var158 += Statics.field1372[var162];
                                        var159 += Statics.field3144[var162];
                                        var160 += Statics.field1629[var162];
                                    }
                                    int var163 = var161 - 5;
                                    if (var163 >= 0 && var163 < 104) {
                                        var156 -= Statics.field3096[var163];
                                        var157 -= Statics.field791[var163];
                                        var158 -= Statics.field1372[var163];
                                        var159 -= Statics.field3144[var163];
                                        var160 -= Statics.field1629[var163];
                                    }
                                    if (var161 >= 1 && var161 < 103 && (!field301 || (class6.field109[0][var148][var161] & 0x2) != 0 || (class6.field109[var133][var148][var161] & 0x10) == 0)) {
                                        if (var133 < class6.field107) {
                                            class6.field107 = var133;
                                        }
                                        int var164 = Statics.field2633[var133][var148][var161] & 0xFF;
                                        int var165 = Statics.field90[var133][var148][var161] & 0xFF;
                                        if (var164 > 0 || var165 > 0) {
                                            int var166 = class6.field89[var133][var148][var161];
                                            int var167 = class6.field89[var133][var148 + 1][var161];
                                            int var168 = class6.field89[var133][var148 + 1][var161 + 1];
                                            int var169 = class6.field89[var133][var148][var161 + 1];
                                            int var170 = Statics.field94[var148][var161];
                                            int var171 = Statics.field94[var148 + 1][var161];
                                            int var172 = Statics.field94[var148 + 1][var161 + 1];
                                            int var173 = Statics.field94[var148][var161 + 1];
                                            int var174 = -1;
                                            int var175 = -1;
                                            if (var164 > 0) {
                                                int var176 = var156 * 256 / var159;
                                                int var177 = var157 / var160;
                                                int var178 = var158 / var160;
                                                var174 = class6.method2336(var176, var177, var178);
                                                int var179 = class6.field103 + var176 & 0xFF;
                                                int var180 = class6.field104 + var178;
                                                if (var180 < 0) {
                                                    var180 = 0;
                                                } else if (var180 > 255) {
                                                    var180 = 255;
                                                }
                                                var175 = class6.method2336(var179, var177, var180);
                                            }
                                            if (var133 > 0) {
                                                boolean var181 = true;
                                                if (var164 == 0 && Statics.field199[var133][var148][var161] != 0) {
                                                    var181 = false;
                                                }
                                                if (var165 > 0) {
                                                    int var182 = var165 - 1;
                                                    class47 var183 = (class47) class47.field1057.method3538((long) var182);
                                                    class47 var184;
                                                    if (var183 == null) {
                                                        byte[] var185 = Statics.field1055.method3073(4, var182);
                                                        class47 var186 = new class47();
                                                        if (var185 != null) {
                                                            var186.method956(new class119(var185), var182);
                                                        }
                                                        var186.method954();
                                                        class47.field1057.method3540(var186, (long) var182);
                                                        var184 = var186;
                                                    } else {
                                                        var184 = var183;
                                                    }
                                                    if (!var184.field1059) {
                                                        var181 = false;
                                                    }
                                                }
                                                if (var181 && var166 == var167 && var166 == var168 && var166 == var169) {
                                                    Statics.field1609[var133][var148][var161] |= 0x924;
                                                }
                                            }
                                            int var187 = 0;
                                            if (var175 != -1) {
                                                var187 = class91.field1575[class6.method2729(var175, 96)];
                                            }
                                            if (var165 == 0) {
                                                var127.method1795(var133, var148, var161, 0, 0, -1, var166, var167, var168, var169, class6.method2729(var174, var170), class6.method2729(var174, var171), class6.method2729(var174, var172), class6.method2729(var174, var173), 0, 0, 0, 0, var187, 0);
                                            } else {
                                                int var188 = Statics.field199[var133][var148][var161] + 1;
                                                byte var189 = Statics.field91[var133][var148][var161];
                                                int var190 = var165 - 1;
                                                class47 var191 = (class47) class47.field1057.method3538((long) var190);
                                                class47 var192;
                                                if (var191 == null) {
                                                    byte[] var193 = Statics.field1055.method3073(4, var190);
                                                    class47 var194 = new class47();
                                                    if (var193 != null) {
                                                        var194.method956(new class119(var193), var190);
                                                    }
                                                    var194.method954();
                                                    class47.field1057.method3540(var194, (long) var190);
                                                    var192 = var194;
                                                } else {
                                                    var192 = var191;
                                                }
                                                int var196 = var192.field1067;
                                                int var197;
                                                int var198;
                                                if (var196 >= 0) {
                                                    var197 = Statics.field1582.method2040(var196);
                                                    var198 = -1;
                                                } else if (var192.field1062 == 16711935) {
                                                    var198 = -2;
                                                    var196 = -1;
                                                    var197 = -2;
                                                } else {
                                                    var198 = class6.method2336(var192.field1061, var192.field1058, var192.field1063);
                                                    int var199 = class6.field103 + var192.field1061 & 0xFF;
                                                    int var200 = class6.field104 + var192.field1063;
                                                    if (var200 < 0) {
                                                        var200 = 0;
                                                    } else if (var200 > 255) {
                                                        var200 = 255;
                                                    }
                                                    var197 = class6.method2336(var199, var192.field1058, var200);
                                                }
                                                int var201 = 0;
                                                if (var197 != -2) {
                                                    var201 = class91.field1575[class6.method732(var197, 96)];
                                                }
                                                if (var192.field1060 != -1) {
                                                    int var202 = class6.field103 + var192.field1064 & 0xFF;
                                                    int var203 = class6.field104 + var192.field1066;
                                                    if (var203 < 0) {
                                                        var203 = 0;
                                                    } else if (var203 > 255) {
                                                        var203 = 255;
                                                    }
                                                    int var204 = class6.method2336(var202, var192.field1065, var203);
                                                    var201 = class91.field1575[class6.method732(var204, 96)];
                                                }
                                                var127.method1795(var133, var148, var161, var188, var189, var196, var166, var167, var168, var169, class6.method2729(var174, var170), class6.method2729(var174, var171), class6.method2729(var174, var172), class6.method2729(var174, var173), class6.method732(var198, var170), class6.method732(var198, var171), class6.method732(var198, var172), class6.method732(var198, var173), var187, var201);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var205 = 1; var205 < 103; var205++) {
                            for (int var206 = 1; var206 < 103; var206++) {
                                var127.method1872(var133, var206, var205, class6.method1245(var133, var206, var205));
                            }
                        }
                        Statics.field2633[var133] = (byte[][]) null;
                        Statics.field90[var133] = (byte[][]) null;
                        Statics.field199[var133] = (byte[][]) null;
                        Statics.field91[var133] = (byte[][]) null;
                        Statics.field93[var133] = (byte[][]) null;
                    }
                    var127.method1890(-50, -10, -50);
                    for (int var207 = 0; var207 < 104; var207++) {
                        for (int var208 = 0; var208 < 104; var208++) {
                            if ((class6.field109[1][var207][var208] & 0x2) == 2) {
                                var127.method1792(var207, var208);
                            }
                        }
                    }
                    int var209 = 1;
                    int var210 = 2;
                    int var211 = 4;
                    for (int var212 = 0; var212 < 4; var212++) {
                        if (var212 > 0) {
                            var209 <<= 0x3;
                            var210 <<= 0x3;
                            var211 <<= 0x3;
                        }
                        for (int var213 = 0; var213 <= var212; var213++) {
                            for (int var214 = 0; var214 <= 104; var214++) {
                                for (int var215 = 0; var215 <= 104; var215++) {
                                    if ((Statics.field1609[var213][var215][var214] & var209) != 0) {
                                        int var216 = var214;
                                        int var217 = var214;
                                        int var218 = var213;
                                        int var219 = var213;
                                        while (var216 > 0 && (Statics.field1609[var213][var215][var216 - 1] & var209) != 0) {
                                            var216--;
                                        }
                                        while (var217 < 104 && (Statics.field1609[var213][var215][var217 + 1] & var209) != 0) {
                                            var217++;
                                        }
                                        label4436: while (var218 > 0) {
                                            for (int var220 = var216; var220 <= var217; var220++) {
                                                if ((Statics.field1609[var218 - 1][var215][var220] & var209) == 0) {
                                                    break label4436;
                                                }
                                            }
                                            var218--;
                                        }
                                        label4425: while (var219 < var212) {
                                            for (int var221 = var216; var221 <= var217; var221++) {
                                                if ((Statics.field1609[var219 + 1][var215][var221] & var209) == 0) {
                                                    break label4425;
                                                }
                                            }
                                            var219++;
                                        }
                                        int var222 = (var219 + 1 - var218) * (var217 - var216 + 1);
                                        if (var222 >= 8) {
                                            short var223 = 240;
                                            int var224 = class6.field89[var219][var215][var216] - var223;
                                            int var225 = class6.field89[var218][var215][var216];
                                            class86.method1942(var212, 1, var215 * 128, var215 * 128, var216 * 128, var217 * 128 + 128, var224, var225);
                                            for (int var226 = var218; var226 <= var219; var226++) {
                                                for (int var227 = var216; var227 <= var217; var227++) {
                                                    Statics.field1609[var226][var215][var227] &= ~var209;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field1609[var213][var215][var214] & var210) != 0) {
                                        int var228 = var215;
                                        int var229 = var215;
                                        int var230 = var213;
                                        int var231 = var213;
                                        while (var228 > 0 && (Statics.field1609[var213][var228 - 1][var214] & var210) != 0) {
                                            var228--;
                                        }
                                        while (var229 < 104 && (Statics.field1609[var213][var229 + 1][var214] & var210) != 0) {
                                            var229++;
                                        }
                                        label4489: while (var230 > 0) {
                                            for (int var232 = var228; var232 <= var229; var232++) {
                                                if ((Statics.field1609[var230 - 1][var232][var214] & var210) == 0) {
                                                    break label4489;
                                                }
                                            }
                                            var230--;
                                        }
                                        label4478: while (var231 < var212) {
                                            for (int var233 = var228; var233 <= var229; var233++) {
                                                if ((Statics.field1609[var231 + 1][var233][var214] & var210) == 0) {
                                                    break label4478;
                                                }
                                            }
                                            var231++;
                                        }
                                        int var234 = (var231 + 1 - var230) * (var229 - var228 + 1);
                                        if (var234 >= 8) {
                                            short var235 = 240;
                                            int var236 = class6.field89[var231][var228][var214] - var235;
                                            int var237 = class6.field89[var230][var228][var214];
                                            class86.method1942(var212, 2, var228 * 128, var229 * 128 + 128, var214 * 128, var214 * 128, var236, var237);
                                            for (int var238 = var230; var238 <= var231; var238++) {
                                                for (int var239 = var228; var239 <= var229; var239++) {
                                                    Statics.field1609[var238][var239][var214] &= ~var210;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field1609[var213][var215][var214] & var211) != 0) {
                                        int var240 = var215;
                                        int var241 = var215;
                                        int var242 = var214;
                                        int var243 = var214;
                                        while (var242 > 0 && (Statics.field1609[var213][var215][var242 - 1] & var211) != 0) {
                                            var242--;
                                        }
                                        while (var243 < 104 && (Statics.field1609[var213][var215][var243 + 1] & var211) != 0) {
                                            var243++;
                                        }
                                        label4542: while (var240 > 0) {
                                            for (int var244 = var242; var244 <= var243; var244++) {
                                                if ((Statics.field1609[var213][var240 - 1][var244] & var211) == 0) {
                                                    break label4542;
                                                }
                                            }
                                            var240--;
                                        }
                                        label4531: while (var241 < 104) {
                                            for (int var245 = var242; var245 <= var243; var245++) {
                                                if ((Statics.field1609[var213][var241 + 1][var245] & var211) == 0) {
                                                    break label4531;
                                                }
                                            }
                                            var241++;
                                        }
                                        if ((var241 - var240 + 1) * (var243 - var242 + 1) >= 4) {
                                            int var246 = class6.field89[var213][var240][var242];
                                            class86.method1942(var212, 4, var240 * 128, var241 * 128 + 128, var242 * 128, var243 * 128 + 128, var246, var246);
                                            for (int var247 = var240; var247 <= var241; var247++) {
                                                for (int var248 = var242; var248 <= var243; var248++) {
                                                    Statics.field1609[var213][var247][var248] &= ~var211;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method51(true);
                    int var249 = class6.field107;
                    if (var249 > Statics.field721) {
                        var249 = Statics.field721;
                    }
                    if (var249 < Statics.field721 - 1) {
                        int var250 = Statics.field721 - 1;
                    }
                    if (field301) {
                        Statics.field649.method1791(class6.field107);
                    } else {
                        Statics.field649.method1791(0);
                    }
                    for (int var251 = 0; var251 < 104; var251++) {
                        for (int var252 = 0; var252 < 104; var252++) {
                            method198(var251, var252);
                        }
                    }
                    method585();
                    for (class17 var253 = (class17) field432.method3611(); var253 != null; var253 = (class17) field432.method3616()) {
                        if (var253.field246 == -1) {
                            var253.field249 = 0;
                            method170(var253);
                        } else {
                            var253.method3711();
                        }
                    }
                    class41.field931.method3541();
                    if (Statics.field1156 != null) {
                        field341.method2631(176);
                        field341.method2556(1057001181);
                    }
                    if (!field360) {
                        int var254 = (Statics.field166 - 6) / 8;
                        int var255 = (Statics.field166 + 6) / 8;
                        int var256 = (Statics.field2982 - 6) / 8;
                        int var257 = (Statics.field2982 + 6) / 8;
                        for (int var258 = var254 - 1; var258 <= var255 + 1; var258++) {
                            for (int var259 = var256 - 1; var259 <= var257 + 1; var259++) {
                                if (var258 < var254 || var258 > var255 || var259 < var256 || var259 > var257) {
                                    Statics.field2153.method3131("m" + var258 + "_" + var259);
                                    Statics.field2153.method3131("l" + var258 + "_" + var259);
                                }
                            }
                        }
                    }
                    method2652(30);
                    method585();
                    class6.method105();
                    field341.method2631(223);
                    Statics.field2063.method2730();
                    for (int var260 = 0; var260 < 32; var260++) {
                        field2184[var260] = 0L;
                    }
                    for (int var261 = 0; var261 < 32; var261++) {
                        field2185[var261] = 0L;
                    }
                    Statics.field1760 = 0;
                } else {
                    field358 = 2;
                }
            } else {
                field358 = 1;
            }
        }
        if (field304 == 30) {
            if (field313 > 1) {
                field313--;
            }
            if (field481 > 0) {
                field481--;
            }
            if (field352) {
                field352 = false;
                method4();
            } else {
                if (!field439) {
                    field445[0] = class157.field2471;
                    field446[0] = "";
                    field379[0] = 1006;
                    field440 = 1;
                }
                for (int var262 = 0; var262 < 100; var262++) {
                    boolean var263;
                    if (Statics.field701 == null) {
                        var263 = false;
                    } else {
                        label5166: {
                            try {
                                int var264 = Statics.field701.method2870();
                                if (var264 == 0) {
                                    var263 = false;
                                    break label5166;
                                }
                                if (field345 == -1) {
                                    Statics.field701.method2869(field333.field1978, 0, 1);
                                    field333.field1973 = 0;
                                    field345 = field333.method2632();
                                    field344 = class188.field3026[field345];
                                    var264--;
                                }
                                if (field344 == -1) {
                                    if (var264 <= 0) {
                                        var263 = false;
                                        break label5166;
                                    }
                                    Statics.field701.method2869(field333.field1978, 0, 1);
                                    field344 = field333.field1978[0] & 0xFF;
                                    var264--;
                                }
                                if (field344 == -2) {
                                    if (var264 <= 1) {
                                        var263 = false;
                                        break label5166;
                                    }
                                    Statics.field701.method2869(field333.field1978, 0, 2);
                                    field333.field1973 = 0;
                                    field344 = field333.method2385();
                                    var264 -= 2;
                                }
                                if (var264 < field344) {
                                    var263 = false;
                                    break label5166;
                                }
                                field333.field1973 = 0;
                                Statics.field701.method2869(field333.field1978, 0, field344);
                                field346 = 0;
                                field372 = field349;
                                field349 = field362;
                                field362 = field345;
                                if (field345 == 78) {
                                    method110();
                                    field312 = field333.method2383();
                                    field496 = field484;
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 43) {
                                    field548 = true;
                                    Statics.field1956 = field333.method2383();
                                    Statics.field1558 = field333.method2383();
                                    Statics.field193 = field333.method2385();
                                    Statics.field290 = field333.method2383();
                                    Statics.field587 = field333.method2383();
                                    if (Statics.field587 >= 100) {
                                        int var265 = Statics.field1956 * 128 + 64;
                                        int var266 = Statics.field1558 * 128 + 64;
                                        int var267 = method560(var265, var266, Statics.field721) - Statics.field193;
                                        int var268 = var265 - Statics.field2242;
                                        int var269 = var267 - Statics.field1077;
                                        int var270 = var266 - Statics.field263;
                                        int var271 = (int) Math.sqrt((double) (var268 * var268 + var270 * var270));
                                        Statics.field1755 = (int) (Math.atan2((double) var269, (double) var271) * 325.949D) & 0x7FF;
                                        Statics.field2214 = (int) (Math.atan2((double) var268, (double) var270) * -325.949D) & 0x7FF;
                                        if (Statics.field1755 < 128) {
                                            Statics.field1755 = 128;
                                        }
                                        if (Statics.field1755 > 383) {
                                            Statics.field1755 = 383;
                                        }
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 147) {
                                    int var272 = field333.method2388();
                                    int var273 = field333.method2385();
                                    if (var272 < -70000) {
                                        var273 += 32768;
                                    }
                                    class173 var274;
                                    if (var272 >= 0) {
                                        var274 = class173.method2977(var272);
                                    } else {
                                        var274 = null;
                                    }
                                    if (var274 != null) {
                                        for (int var275 = 0; var275 < var274.field2808.length; var275++) {
                                            var274.field2808[var275] = 0;
                                            var274.field2817[var275] = 0;
                                        }
                                    }
                                    class16 var276 = (class16) class16.field233.method3584((long) var273);
                                    if (var276 != null) {
                                        for (int var277 = 0; var277 < var276.field226.length; var277++) {
                                            var276.field226[var277] = -1;
                                            var276.field227[var277] = 0;
                                        }
                                    }
                                    int var278 = field333.method2385();
                                    for (int var279 = 0; var279 < var278; var279++) {
                                        int var280 = field333.method2418();
                                        int var281 = field333.method2549();
                                        if (var281 == 255) {
                                            var281 = field333.method2428();
                                        }
                                        if (var274 != null && var279 < var274.field2808.length) {
                                            var274.field2808[var279] = var280;
                                            var274.field2817[var279] = var281;
                                        }
                                        class16.method3186(var273, var279, var280 - 1, var281);
                                    }
                                    if (var274 != null) {
                                        method2263(var274);
                                    }
                                    method110();
                                    field487[++field351 - 1 & 0x1F] = var273 & 0x7FFF;
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 63) {
                                    String var282 = field333.method2391();
                                    String var283 = class223.method3831(class163.method47(class222.method3281(field333)));
                                    class12.method974(6, var282, var283);
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 8) {
                                    method3769();
                                    field345 = -1;
                                    var263 = false;
                                    break label5166;
                                }
                                if (field345 == 20) {
                                    Statics.field602 = field333.method2423();
                                    Statics.field2160 = field333.method2549();
                                    while (field333.field1973 < field344) {
                                        field345 = field333.method2383();
                                        method921();
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 119) {
                                    int var284 = field333.method2385();
                                    int var285 = field333.method2383();
                                    int var286 = field333.method2385();
                                    Statics.method1974(var284, var285, var286);
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 177) {
                                    method192(false);
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 57) {
                                    int var287 = field333.method2484();
                                    boolean var288 = field333.method2383() == 1;
                                    String var289 = "";
                                    boolean var290 = false;
                                    if (var288) {
                                        var289 = field333.method2391();
                                        if (method2(var289)) {
                                            var290 = true;
                                        }
                                    }
                                    String var291 = field333.method2391();
                                    if (!var290) {
                                        class12.method974(var287, var289, var291);
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 54) {
                                    int var292 = field333.method2383();
                                    int var293 = field333.method2428();
                                    int var294 = field333.method2419();
                                    class4 var295 = (class4) field460.method3584((long) var293);
                                    if (var295 != null) {
                                        method200(var295, var295.field60 != var294);
                                    }
                                    class4 var296 = new class4();
                                    var296.field60 = var294;
                                    var296.field57 = var292;
                                    field460.method3575(var296, (long) var293);
                                    method3188(var294);
                                    class173 var297 = class173.method2977(var293);
                                    method2263(var297);
                                    if (field463 != null) {
                                        method2263(field463);
                                        field463 = null;
                                    }
                                    method2818();
                                    method2996(Statics.field2791[var293 >> 16], var297, false);
                                    class37.method644(var294);
                                    if (field416 != -1) {
                                        method14(field416, 1);
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 146) {
                                    int var298 = field333.method2428();
                                    int var299 = field333.method2385();
                                    class173 var300 = class173.method2977(var298);
                                    if (var300 != null && var300.field2734 == 0) {
                                        if (var299 > var300.field2756 - var300.field2748) {
                                            var299 = var300.field2756 - var300.field2748;
                                        }
                                        if (var299 < 0) {
                                            var299 = 0;
                                        }
                                        if (var300.field2819 != var299) {
                                            var300.field2819 = var299;
                                            method2263(var300);
                                        }
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 145) {
                                    boolean var301 = field333.method2383() == 1;
                                    int var302 = field333.method2487();
                                    class173 var303 = class173.method2977(var302);
                                    if (var303.field2752 != var301) {
                                        var303.field2752 = var301;
                                        method2263(var303);
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 56) {
                                    int var304 = field344 + field333.field1973;
                                    int var305 = field333.method2385();
                                    int var306 = field333.method2385();
                                    if (field416 != var305) {
                                        field416 = var305;
                                        method635(false);
                                        method3188(field416);
                                        class37.method644(field416);
                                        for (int var307 = 0; var307 < 100; var307++) {
                                            field504[var307] = true;
                                        }
                                    }
                                    while (var306-- > 0) {
                                        int var308 = field333.method2388();
                                        int var309 = field333.method2385();
                                        int var310 = field333.method2383();
                                        class4 var311 = (class4) field460.method3584((long) var308);
                                        if (var311 != null && var311.field60 != var309) {
                                            method200(var311, true);
                                            var311 = null;
                                        }
                                        if (var311 == null) {
                                            var311 = method2856(var308, var309, var310);
                                        }
                                        var311.field58 = true;
                                    }
                                    for (class4 var312 = (class4) field460.method3577(); var312 != null; var312 = (class4) field460.method3578()) {
                                        if (var312.field58) {
                                            var312.field58 = false;
                                        } else {
                                            method200(var312, true);
                                        }
                                    }
                                    field433 = new class196(512);
                                    while (field333.field1973 < var304) {
                                        int var313 = field333.method2388();
                                        int var314 = field333.method2385();
                                        int var315 = field333.method2385();
                                        int var316 = field333.method2388();
                                        for (int var317 = var314; var317 <= var315; var317++) {
                                            long var318 = ((long) var313 << 32) + (long) var317;
                                            field433.method3575(new class201(var316), var318);
                                        }
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 191) {
                                    field568 = 1;
                                    field492 = field484;
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 221) {
                                    int var320 = field333.method2383();
                                    int var321 = field333.method2383();
                                    int var322 = field333.method2383();
                                    int var323 = field333.method2383();
                                    field549[var320] = true;
                                    field550[var320] = var321;
                                    field560[var320] = var322;
                                    field326[var320] = var323;
                                    field553[var320] = 0;
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 139) {
                                    String var324 = field333.method2391();
                                    int var325 = field333.method2385();
                                    byte var326 = field333.method2370();
                                    boolean var327 = false;
                                    if (var326 == -128) {
                                        var327 = true;
                                    }
                                    if (var327) {
                                        if (Statics.field75 == 0) {
                                            field345 = -1;
                                            var263 = true;
                                            break label5166;
                                        }
                                        boolean var328 = false;
                                        int var329;
                                        for (var329 = 0; var329 < Statics.field75 && (!Statics.field137[var329].field644.equals(var324) || Statics.field137[var329].field640 != var325); var329++) {
                                        }
                                        if (var329 < Statics.field75) {
                                            while (var329 < Statics.field75 - 1) {
                                                Statics.field137[var329] = Statics.field137[var329 + 1];
                                                var329++;
                                            }
                                            Statics.field75--;
                                            Statics.field137[Statics.field75] = null;
                                        }
                                    } else {
                                        field333.method2391();
                                        class25 var330 = new class25();
                                        var330.field644 = var324;
                                        var330.field639 = class164.method175(var330.field644, Statics.field1868);
                                        var330.field640 = var325;
                                        var330.field641 = var326;
                                        int var331;
                                        for (var331 = Statics.field75 - 1; var331 >= 0; var331--) {
                                            int var332 = Statics.field137[var331].field639.compareTo(var330.field639);
                                            if (var332 == 0) {
                                                Statics.field137[var331].field640 = var325;
                                                Statics.field137[var331].field641 = var326;
                                                if (var324.equals(Statics.field101.field41)) {
                                                    Statics.field2037 = var326;
                                                }
                                                field521 = field484;
                                                field345 = -1;
                                                var263 = true;
                                                break label5166;
                                            }
                                            if (var332 < 0) {
                                                break;
                                            }
                                        }
                                        if (Statics.field75 >= Statics.field137.length) {
                                            field345 = -1;
                                            var263 = true;
                                            break label5166;
                                        }
                                        for (int var333 = Statics.field75 - 1; var333 > var331; var333--) {
                                            Statics.field137[var333 + 1] = Statics.field137[var333];
                                        }
                                        if (Statics.field75 == 0) {
                                            Statics.field137 = new class25[100];
                                        }
                                        Statics.field137[var331 + 1] = var330;
                                        Statics.field75++;
                                        if (var324.equals(Statics.field101.field41)) {
                                            Statics.field2037 = var326;
                                        }
                                    }
                                    field521 = field484;
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 17) {
                                    class122 var334 = field333;
                                    int var335 = field344;
                                    int var336 = var334.field1973;
                                    class33.field764 = 0;
                                    int var337 = 0;
                                    var334.method2629();
                                    for (int var338 = 0; var338 < class33.field774; var338++) {
                                        int var339 = class33.field769[var338];
                                        if ((class33.field765[var339] & 0x1) == 0) {
                                            if (var337 > 0) {
                                                var337--;
                                                class33.field765[var339] = (byte) (class33.field765[var339] | 0x2);
                                            } else {
                                                int var340 = var334.method2630(1);
                                                if (var340 == 0) {
                                                    var337 = class33.method634(var334);
                                                    class33.field765[var339] = (byte) (class33.field765[var339] | 0x2);
                                                } else {
                                                    class33.method2753(var334, var339);
                                                }
                                            }
                                        }
                                    }
                                    var334.method2644();
                                    if (var337 != 0) {
                                        throw new RuntimeException();
                                    }
                                    var334.method2629();
                                    for (int var341 = 0; var341 < class33.field774; var341++) {
                                        int var342 = class33.field769[var341];
                                        if ((class33.field765[var342] & 0x1) != 0) {
                                            if (var337 > 0) {
                                                var337--;
                                                class33.field765[var342] = (byte) (class33.field765[var342] | 0x2);
                                            } else {
                                                int var343 = var334.method2630(1);
                                                if (var343 == 0) {
                                                    var337 = class33.method634(var334);
                                                    class33.field765[var342] = (byte) (class33.field765[var342] | 0x2);
                                                } else {
                                                    class33.method2753(var334, var342);
                                                }
                                            }
                                        }
                                    }
                                    var334.method2644();
                                    if (var337 != 0) {
                                        throw new RuntimeException();
                                    }
                                    var334.method2629();
                                    for (int var344 = 0; var344 < class33.field770; var344++) {
                                        int var345 = class33.field771[var344];
                                        if ((class33.field765[var345] & 0x1) != 0) {
                                            if (var337 > 0) {
                                                var337--;
                                                class33.field765[var345] = (byte) (class33.field765[var345] | 0x2);
                                            } else {
                                                int var346 = var334.method2630(1);
                                                if (var346 == 0) {
                                                    var337 = class33.method634(var334);
                                                    class33.field765[var345] = (byte) (class33.field765[var345] | 0x2);
                                                } else if (Statics.method2972(var334, var345)) {
                                                    class33.field765[var345] = (byte) (class33.field765[var345] | 0x2);
                                                }
                                            }
                                        }
                                    }
                                    var334.method2644();
                                    if (var337 != 0) {
                                        throw new RuntimeException();
                                    }
                                    var334.method2629();
                                    for (int var347 = 0; var347 < class33.field770; var347++) {
                                        int var348 = class33.field771[var347];
                                        if ((class33.field765[var348] & 0x1) == 0) {
                                            if (var337 > 0) {
                                                var337--;
                                                class33.field765[var348] = (byte) (class33.field765[var348] | 0x2);
                                            } else {
                                                int var349 = var334.method2630(1);
                                                if (var349 == 0) {
                                                    var337 = class33.method634(var334);
                                                    class33.field765[var348] = (byte) (class33.field765[var348] | 0x2);
                                                } else if (Statics.method2972(var334, var348)) {
                                                    class33.field765[var348] = (byte) (class33.field765[var348] | 0x2);
                                                }
                                            }
                                        }
                                    }
                                    var334.method2644();
                                    if (var337 != 0) {
                                        throw new RuntimeException();
                                    }
                                    class33.field774 = 0;
                                    class33.field770 = 0;
                                    for (int var350 = 1; var350 < 2048; var350++) {
                                        class33.field765[var350] = (byte) (class33.field765[var350] >> 1);
                                        class3 var351 = field421[var350];
                                        if (var351 == null) {
                                            class33.field771[++class33.field770 - 1] = var350;
                                        } else {
                                            class33.field769[++class33.field774 - 1] = var350;
                                        }
                                    }
                                    for (int var352 = 0; var352 < class33.field764; var352++) {
                                        int var353 = class33.field775[var352];
                                        class3 var354 = field421[var353];
                                        int var355 = var334.method2383();
                                        if ((var355 & 0x8) != 0) {
                                            var355 += var334.method2383() << 8;
                                        }
                                        byte var356 = -1;
                                        if ((var355 & 0x20) != 0) {
                                            int var357 = var334.method2383();
                                            byte[] var358 = new byte[var357];
                                            class119 var359 = new class119(var358);
                                            var334.method2394(var358, 0, var357);
                                            class33.field767[var353] = var359;
                                            var354.method12(var359);
                                        }
                                        if ((var355 & 0x80) != 0) {
                                            int var360 = var334.method2385();
                                            if (var360 == 65535) {
                                                var360 = -1;
                                            }
                                            int var361 = var334.method2383();
                                            method2320(var354, var360, var361);
                                        }
                                        if ((var355 & 0x10) != 0) {
                                            var354.field841 = var334.method2385();
                                            if (var354.field841 == 65535) {
                                                var354.field841 = -1;
                                            }
                                        }
                                        if ((var355 & 0x4) != 0) {
                                            var354.field822 = var334.method2391();
                                            if (var354.field822.charAt(0) == '~') {
                                                var354.field822 = var354.field822.substring(1);
                                                class12.method974(2, var354.field41, var354.field822);
                                            } else if (Statics.field101 == var354) {
                                                class12.method974(2, var354.field41, var354.field822);
                                            }
                                            var354.field830 = false;
                                            var354.field833 = 0;
                                            var354.field856 = 0;
                                            var354.field832 = 150;
                                        }
                                        if ((var355 & 0x40) != 0) {
                                            int var362 = var334.method2385();
                                            int var363 = var334.method2383();
                                            var354.method727(var362, var363, field303);
                                            var354.field877 = field303 + 300;
                                            var354.field839 = var334.method2383();
                                            var354.field840 = var334.method2383();
                                        }
                                        if ((var355 & 0x1) != 0) {
                                            var354.field868 = var334.method2385();
                                            if (var354.field869 == 0) {
                                                var354.field866 = var354.field868;
                                                var354.field868 = -1;
                                            }
                                        }
                                        if ((var355 & 0x2) != 0) {
                                            int var364 = var334.method2385();
                                            class152 var365 = (class152) class109.method46(class152.method2251(), var334.method2383());
                                            boolean var366 = var334.method2383() == 1;
                                            int var367 = var334.method2383();
                                            int var368 = var334.field1973;
                                            if (var354.field41 != null && var354.field32 != null) {
                                                boolean var369 = false;
                                                if (var365.field2255 && method2(var354.field41)) {
                                                    var369 = true;
                                                }
                                                if (!var369 && field332 == 0 && !var354.field44) {
                                                    class33.field777.field1973 = 0;
                                                    var334.method2394(class33.field777.field1978, 0, var367);
                                                    class33.field777.field1973 = 0;
                                                    class119 var370 = class33.field777;
                                                    String var374;
                                                    try {
                                                        int var371 = var370.method2484();
                                                        if (var371 > 32767) {
                                                            var371 = 32767;
                                                        }
                                                        byte[] var372 = new byte[var371];
                                                        var370.field1973 += Statics.field3163.method2316(var370.field1978, var370.field1973, var372, 0, var371);
                                                        String var373 = class165.method832(var372, 0, var371);
                                                        var374 = var373;
                                                    } catch (Exception var838) {
                                                        var374 = "Cabbage";
                                                    }
                                                    String var377 = class223.method3831(class163.method47(var374));
                                                    var354.field822 = var377.trim();
                                                    var354.field833 = var364 >> 8;
                                                    var354.field856 = var364 & 0xFF;
                                                    var354.field832 = 150;
                                                    var354.field830 = var366;
                                                    var354.field831 = Statics.field101 != var354 && var365.field2255 && field519 != "" && var377.toLowerCase().indexOf(field519) == -1;
                                                    int var378;
                                                    if (var365.field2254) {
                                                        var378 = var366 ? 91 : 1;
                                                    } else {
                                                        var378 = var366 ? 90 : 2;
                                                    }
                                                    if (var365.field2253 == -1) {
                                                        class12.method974(var378, var354.field41, var377);
                                                    } else {
                                                        class12.method974(var378, class2.method567(var365.field2253) + var354.field41, var377);
                                                    }
                                                }
                                            }
                                            var334.field1973 = var367 + var368;
                                        }
                                        if ((var355 & 0x200) != 0) {
                                            var354.field826 = var334.method2385();
                                            int var379 = var334.method2388();
                                            var354.field827 = var379 >> 16;
                                            var354.field855 = (var379 & 0xFFFF) + field303;
                                            var354.field847 = 0;
                                            var354.field854 = 0;
                                            if (var354.field855 > field303) {
                                                var354.field847 = -1;
                                            }
                                            if (var354.field826 == 65535) {
                                                var354.field826 = -1;
                                            }
                                        }
                                        if ((var355 & 0x100) != 0) {
                                            var354.field857 = var334.method2370();
                                            var354.field859 = var334.method2370();
                                            var354.field858 = var334.method2370();
                                            var354.field860 = var334.method2370();
                                            var354.field861 = var334.method2385() + field303;
                                            var354.field862 = var334.method2385() + field303;
                                            var354.field863 = var334.method2385();
                                            if (var354.field40) {
                                                var354.field857 += var354.field52;
                                                var354.field859 += var354.field37;
                                                var354.field858 += var354.field52;
                                                var354.field860 += var354.field37;
                                                var354.field869 = 0;
                                            } else {
                                                var354.field857 += var354.field870[0];
                                                var354.field859 += var354.field817[0];
                                                var354.field858 += var354.field870[0];
                                                var354.field860 += var354.field817[0];
                                                var354.field869 = 1;
                                            }
                                            var354.field874 = 0;
                                        }
                                        if ((var355 & 0x800) != 0) {
                                            int var380 = var334.method2385();
                                            int var381 = var334.method2383();
                                            var354.method727(var380, var381, field303);
                                            var354.field877 = field303 + 300;
                                            var354.field839 = var334.method2383();
                                            var354.field840 = var334.method2383();
                                        }
                                        if ((var355 & 0x400) != 0) {
                                            class33.field766[var353] = var334.method2370();
                                        }
                                        if ((var355 & 0x1000) != 0) {
                                            var356 = var334.method2370();
                                        }
                                        if (var354.field40) {
                                            if (var356 == 127) {
                                                var354.method16(var354.field52, var354.field37);
                                            } else {
                                                byte var382;
                                                if (var356 == -1) {
                                                    var382 = class33.field766[var353];
                                                } else {
                                                    var382 = var356;
                                                }
                                                var354.method15(var354.field52, var354.field37, var382);
                                            }
                                        }
                                    }
                                    if (var334.field1973 - var336 != var335) {
                                        throw new RuntimeException(var334.field1973 - var336 + " " + var335);
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 157) {
                                    field406 = field333.method2383();
                                    field518 = field333.method2383();
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 241) {
                                    int var383 = field333.method2487();
                                    class173 var384 = class173.method2977(var383);
                                    for (int var385 = 0; var385 < var384.field2808.length; var385++) {
                                        var384.field2808[var385] = -1;
                                        var384.field2808[var385] = 0;
                                    }
                                    method2263(var384);
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 55) {
                                    int var386 = field333.method2385();
                                    class16.method2887(var386);
                                    field487[++field351 - 1 & 0x1F] = var386 & 0x7FFF;
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 41) {
                                    Statics.field717 = class130.method2976(field333.method2383());
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 111) {
                                    method2304(true);
                                    field333.method2632();
                                    int var387 = field333.method2385();
                                    class122 var388 = field333;
                                    int var389 = var388.field1973;
                                    class33.field764 = 0;
                                    int var390 = 0;
                                    var388.method2629();
                                    for (int var391 = 0; var391 < class33.field774; var391++) {
                                        int var392 = class33.field769[var391];
                                        if ((class33.field765[var392] & 0x1) == 0) {
                                            if (var390 > 0) {
                                                var390--;
                                                class33.field765[var392] = (byte) (class33.field765[var392] | 0x2);
                                            } else {
                                                int var393 = var388.method2630(1);
                                                if (var393 == 0) {
                                                    var390 = class33.method634(var388);
                                                    class33.field765[var392] = (byte) (class33.field765[var392] | 0x2);
                                                } else {
                                                    class33.method2753(var388, var392);
                                                }
                                            }
                                        }
                                    }
                                    var388.method2644();
                                    if (var390 != 0) {
                                        throw new RuntimeException();
                                    }
                                    var388.method2629();
                                    for (int var394 = 0; var394 < class33.field774; var394++) {
                                        int var395 = class33.field769[var394];
                                        if ((class33.field765[var395] & 0x1) != 0) {
                                            if (var390 > 0) {
                                                var390--;
                                                class33.field765[var395] = (byte) (class33.field765[var395] | 0x2);
                                            } else {
                                                int var396 = var388.method2630(1);
                                                if (var396 == 0) {
                                                    var390 = class33.method634(var388);
                                                    class33.field765[var395] = (byte) (class33.field765[var395] | 0x2);
                                                } else {
                                                    class33.method2753(var388, var395);
                                                }
                                            }
                                        }
                                    }
                                    var388.method2644();
                                    if (var390 != 0) {
                                        throw new RuntimeException();
                                    }
                                    var388.method2629();
                                    for (int var397 = 0; var397 < class33.field770; var397++) {
                                        int var398 = class33.field771[var397];
                                        if ((class33.field765[var398] & 0x1) != 0) {
                                            if (var390 > 0) {
                                                var390--;
                                                class33.field765[var398] = (byte) (class33.field765[var398] | 0x2);
                                            } else {
                                                int var399 = var388.method2630(1);
                                                if (var399 == 0) {
                                                    var390 = class33.method634(var388);
                                                    class33.field765[var398] = (byte) (class33.field765[var398] | 0x2);
                                                } else if (Statics.method2972(var388, var398)) {
                                                    class33.field765[var398] = (byte) (class33.field765[var398] | 0x2);
                                                }
                                            }
                                        }
                                    }
                                    var388.method2644();
                                    if (var390 != 0) {
                                        throw new RuntimeException();
                                    }
                                    var388.method2629();
                                    for (int var400 = 0; var400 < class33.field770; var400++) {
                                        int var401 = class33.field771[var400];
                                        if ((class33.field765[var401] & 0x1) == 0) {
                                            if (var390 > 0) {
                                                var390--;
                                                class33.field765[var401] = (byte) (class33.field765[var401] | 0x2);
                                            } else {
                                                int var402 = var388.method2630(1);
                                                if (var402 == 0) {
                                                    var390 = class33.method634(var388);
                                                    class33.field765[var401] = (byte) (class33.field765[var401] | 0x2);
                                                } else if (Statics.method2972(var388, var401)) {
                                                    class33.field765[var401] = (byte) (class33.field765[var401] | 0x2);
                                                }
                                            }
                                        }
                                    }
                                    var388.method2644();
                                    if (var390 != 0) {
                                        throw new RuntimeException();
                                    }
                                    class33.field774 = 0;
                                    class33.field770 = 0;
                                    for (int var403 = 1; var403 < 2048; var403++) {
                                        class33.field765[var403] = (byte) (class33.field765[var403] >> 1);
                                        class3 var404 = field421[var403];
                                        if (var404 == null) {
                                            class33.field771[++class33.field770 - 1] = var403;
                                        } else {
                                            class33.field769[++class33.field774 - 1] = var403;
                                        }
                                    }
                                    for (int var405 = 0; var405 < class33.field764; var405++) {
                                        int var406 = class33.field775[var405];
                                        class3 var407 = field421[var406];
                                        int var408 = var388.method2383();
                                        if ((var408 & 0x8) != 0) {
                                            var408 += var388.method2383() << 8;
                                        }
                                        byte var409 = -1;
                                        if ((var408 & 0x20) != 0) {
                                            int var410 = var388.method2383();
                                            byte[] var411 = new byte[var410];
                                            class119 var412 = new class119(var411);
                                            var388.method2394(var411, 0, var410);
                                            class33.field767[var406] = var412;
                                            var407.method12(var412);
                                        }
                                        if ((var408 & 0x80) != 0) {
                                            int var413 = var388.method2385();
                                            if (var413 == 65535) {
                                                var413 = -1;
                                            }
                                            int var414 = var388.method2383();
                                            method2320(var407, var413, var414);
                                        }
                                        if ((var408 & 0x10) != 0) {
                                            var407.field841 = var388.method2385();
                                            if (var407.field841 == 65535) {
                                                var407.field841 = -1;
                                            }
                                        }
                                        if ((var408 & 0x4) != 0) {
                                            var407.field822 = var388.method2391();
                                            if (var407.field822.charAt(0) == '~') {
                                                var407.field822 = var407.field822.substring(1);
                                                class12.method974(2, var407.field41, var407.field822);
                                            } else if (Statics.field101 == var407) {
                                                class12.method974(2, var407.field41, var407.field822);
                                            }
                                            var407.field830 = false;
                                            var407.field833 = 0;
                                            var407.field856 = 0;
                                            var407.field832 = 150;
                                        }
                                        if ((var408 & 0x40) != 0) {
                                            int var415 = var388.method2385();
                                            int var416 = var388.method2383();
                                            var407.method727(var415, var416, field303);
                                            var407.field877 = field303 + 300;
                                            var407.field839 = var388.method2383();
                                            var407.field840 = var388.method2383();
                                        }
                                        if ((var408 & 0x1) != 0) {
                                            var407.field868 = var388.method2385();
                                            if (var407.field869 == 0) {
                                                var407.field866 = var407.field868;
                                                var407.field868 = -1;
                                            }
                                        }
                                        if ((var408 & 0x2) != 0) {
                                            int var417 = var388.method2385();
                                            class152 var418 = (class152) class109.method46(class152.method2251(), var388.method2383());
                                            boolean var419 = var388.method2383() == 1;
                                            int var420 = var388.method2383();
                                            int var421 = var388.field1973;
                                            if (var407.field41 != null && var407.field32 != null) {
                                                boolean var422 = false;
                                                if (var418.field2255 && method2(var407.field41)) {
                                                    var422 = true;
                                                }
                                                if (!var422 && field332 == 0 && !var407.field44) {
                                                    class33.field777.field1973 = 0;
                                                    var388.method2394(class33.field777.field1978, 0, var420);
                                                    class33.field777.field1973 = 0;
                                                    class119 var423 = class33.field777;
                                                    String var427;
                                                    try {
                                                        int var424 = var423.method2484();
                                                        if (var424 > 32767) {
                                                            var424 = 32767;
                                                        }
                                                        byte[] var425 = new byte[var424];
                                                        var423.field1973 += Statics.field3163.method2316(var423.field1978, var423.field1973, var425, 0, var424);
                                                        String var426 = class165.method832(var425, 0, var424);
                                                        var427 = var426;
                                                    } catch (Exception var837) {
                                                        var427 = "Cabbage";
                                                    }
                                                    String var430 = class223.method3831(class163.method47(var427));
                                                    var407.field822 = var430.trim();
                                                    var407.field833 = var417 >> 8;
                                                    var407.field856 = var417 & 0xFF;
                                                    var407.field832 = 150;
                                                    var407.field830 = var419;
                                                    var407.field831 = Statics.field101 != var407 && var418.field2255 && field519 != "" && var430.toLowerCase().indexOf(field519) == -1;
                                                    int var431;
                                                    if (var418.field2254) {
                                                        var431 = var419 ? 91 : 1;
                                                    } else {
                                                        var431 = var419 ? 90 : 2;
                                                    }
                                                    if (var418.field2253 == -1) {
                                                        class12.method974(var431, var407.field41, var430);
                                                    } else {
                                                        class12.method974(var431, class2.method567(var418.field2253) + var407.field41, var430);
                                                    }
                                                }
                                            }
                                            var388.field1973 = var420 + var421;
                                        }
                                        if ((var408 & 0x200) != 0) {
                                            var407.field826 = var388.method2385();
                                            int var432 = var388.method2388();
                                            var407.field827 = var432 >> 16;
                                            var407.field855 = (var432 & 0xFFFF) + field303;
                                            var407.field847 = 0;
                                            var407.field854 = 0;
                                            if (var407.field855 > field303) {
                                                var407.field847 = -1;
                                            }
                                            if (var407.field826 == 65535) {
                                                var407.field826 = -1;
                                            }
                                        }
                                        if ((var408 & 0x100) != 0) {
                                            var407.field857 = var388.method2370();
                                            var407.field859 = var388.method2370();
                                            var407.field858 = var388.method2370();
                                            var407.field860 = var388.method2370();
                                            var407.field861 = var388.method2385() + field303;
                                            var407.field862 = var388.method2385() + field303;
                                            var407.field863 = var388.method2385();
                                            if (var407.field40) {
                                                var407.field857 += var407.field52;
                                                var407.field859 += var407.field37;
                                                var407.field858 += var407.field52;
                                                var407.field860 += var407.field37;
                                                var407.field869 = 0;
                                            } else {
                                                var407.field857 += var407.field870[0];
                                                var407.field859 += var407.field817[0];
                                                var407.field858 += var407.field870[0];
                                                var407.field860 += var407.field817[0];
                                                var407.field869 = 1;
                                            }
                                            var407.field874 = 0;
                                        }
                                        if ((var408 & 0x800) != 0) {
                                            int var433 = var388.method2385();
                                            int var434 = var388.method2383();
                                            var407.method727(var433, var434, field303);
                                            var407.field877 = field303 + 300;
                                            var407.field839 = var388.method2383();
                                            var407.field840 = var388.method2383();
                                        }
                                        if ((var408 & 0x400) != 0) {
                                            class33.field766[var406] = var388.method2370();
                                        }
                                        if ((var408 & 0x1000) != 0) {
                                            var409 = var388.method2370();
                                        }
                                        if (var407.field40) {
                                            if (var409 == 127) {
                                                var407.method16(var407.field52, var407.field37);
                                            } else {
                                                byte var435;
                                                if (var409 == -1) {
                                                    var435 = class33.field766[var406];
                                                } else {
                                                    var435 = var409;
                                                }
                                                var407.method15(var407.field52, var407.field37, var435);
                                            }
                                        }
                                    }
                                    if (var388.field1973 - var389 != var387) {
                                        throw new RuntimeException(var388.field1973 - var389 + " " + var387);
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 77) {
                                    for (int var436 = 0; var436 < field421.length; var436++) {
                                        if (field421[var436] != null) {
                                            field421[var436].field834 = -1;
                                        }
                                    }
                                    for (int var437 = 0; var437 < field322.length; var437++) {
                                        if (field322[var437] != null) {
                                            field322[var437].field834 = -1;
                                        }
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 81) {
                                    int var438 = field333.method2430();
                                    String var439 = field333.method2391();
                                    class173 var440 = class173.method2977(var438);
                                    if (!var439.equals(var440.field2790)) {
                                        var440.field2790 = var439;
                                        method2263(var440);
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 224) {
                                    String var441 = field333.method2391();
                                    Object[] var442 = new Object[var441.length() + 1];
                                    for (int var443 = var441.length() - 1; var443 >= 0; var443--) {
                                        if (var441.charAt(var443) == 's') {
                                            var442[var443 + 1] = field333.method2391();
                                        } else {
                                            var442[var443 + 1] = Integer.valueOf(field333.method2388());
                                        }
                                    }
                                    var442[0] = Integer.valueOf(field333.method2388());
                                    class1 var444 = new class1();
                                    var444.field9 = var442;
                                    class37.method2681(var444, 200000);
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 172) {
                                    Statics.field2160 = field333.method2423();
                                    Statics.field602 = field333.method2423();
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 168) {
                                    boolean var445 = field333.method2383() == 1;
                                    if (var445) {
                                        Statics.field251 = class115.method2082() - field333.method2389();
                                        Statics.field229 = new class221(field333, true);
                                    } else {
                                        Statics.field229 = null;
                                    }
                                    field546 = field484;
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 40) {
                                    int var446 = field333.method2421();
                                    int var447 = field333.method2388();
                                    class173 var448 = class173.method2977(var447);
                                    if (var448.field2861 != var446 || var446 == -1) {
                                        var448.field2861 = var446;
                                        var448.field2841 = 0;
                                        var448.field2860 = 0;
                                        method2263(var448);
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 225) {
                                    field333.field1973 += 28;
                                    if (field333.method2405()) {
                                        class122 var449 = field333;
                                        int var450 = field333.field1973 - 28;
                                        if (class149.field2224 != null) {
                                            try {
                                                class149.field2224.method3954(0L);
                                                class149.field2224.method3940(var449.field1978, var450, 24);
                                            } catch (Exception var836) {
                                            }
                                        }
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 143) {
                                    int var452 = field333.method2388();
                                    class4 var453 = (class4) field460.method3584((long) var452);
                                    if (var453 != null) {
                                        method200(var453, true);
                                    }
                                    if (field463 != null) {
                                        method2263(field463);
                                        field463 = null;
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 188) {
                                    int var454 = field333.method2388();
                                    int var455 = field333.method2388();
                                    if (Statics.field71 == null || !Statics.field71.isValid()) {
                                        try {
                                            Iterator var456 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                            while (var456.hasNext()) {
                                                GarbageCollectorMXBean var457 = (GarbageCollectorMXBean) var456.next();
                                                if (var457.isValid()) {
                                                    Statics.field71 = var457;
                                                    field306 = -1L;
                                                    field577 = -1L;
                                                }
                                            }
                                        } catch (Throwable var846) {
                                        }
                                    }
                                    long var459 = class115.method2082();
                                    int var461 = -1;
                                    if (Statics.field71 != null) {
                                        long var462 = Statics.field71.getCollectionTime();
                                        if (field577 != -1L) {
                                            long var464 = var462 - field577;
                                            long var466 = var459 - field306;
                                            if (var466 != 0L) {
                                                var461 = (int) (var464 * 100L / var466);
                                            }
                                        }
                                        field577 = var462;
                                        field306 = var459;
                                    }
                                    field341.method2631(217);
                                    field341.method2408(field2192);
                                    field341.method2382(var454);
                                    field341.method2382(var455);
                                    field341.method2408(var461);
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 162) {
                                    byte var468 = field333.method2483();
                                    int var469 = field333.method2418();
                                    class176.field2877[var469] = var468;
                                    if (class176.field2879[var469] != var468) {
                                        class176.field2879[var469] = var468;
                                        method806(var469);
                                    }
                                    field430[++field473 - 1 & 0x1F] = var469;
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 201) {
                                    int var470 = field333.method2430();
                                    Statics.field277 = Statics.field2158.method2772(var470);
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 15) {
                                    int var471 = field333.method2422();
                                    int var472 = field333.method2388();
                                    int var473 = field333.method2421();
                                    class173 var474 = class173.method2977(var472);
                                    if (var474.field2785 != var471 || var474.field2742 != var473 || var474.field2737 != 0 || var474.field2807 != 0) {
                                        var474.field2785 = var471;
                                        var474.field2742 = var473;
                                        var474.field2737 = 0;
                                        var474.field2807 = 0;
                                        method2263(var474);
                                        method111(var474);
                                        if (var474.field2734 == 0) {
                                            method2996(Statics.field2791[var472 >> 16], var474, false);
                                        }
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 87) {
                                    int var475 = field333.method2428();
                                    int var476 = field333.method2385();
                                    int var477 = var476 >> 10 & 0x1F;
                                    int var478 = var476 >> 5 & 0x1F;
                                    int var479 = var476 & 0x1F;
                                    int var480 = (var479 << 3) + (var477 << 19) + (var478 << 11);
                                    class173 var481 = class173.method2977(var475);
                                    if (var481.field2745 != var480) {
                                        var481.field2745 = var480;
                                        method2263(var481);
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 208) {
                                    int var482 = field333.method2430();
                                    int var483 = field333.method2418();
                                    if (var483 == 65535) {
                                        var483 = -1;
                                    }
                                    int var484 = field333.method2487();
                                    int var485 = field333.method2419();
                                    if (var485 == 65535) {
                                        var485 = -1;
                                    }
                                    for (int var486 = var483; var486 <= var485; var486++) {
                                        long var487 = ((long) var482 << 32) + (long) var486;
                                        class208 var489 = field433.method3584(var487);
                                        if (var489 != null) {
                                            var489.method3711();
                                        }
                                        field433.method3575(new class201(var484), var487);
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 171) {
                                    field475 = field333.method2383();
                                    if (field475 == 1) {
                                        field294 = field333.method2385();
                                    }
                                    if (field475 >= 2 && field475 <= 6) {
                                        if (field475 == 2) {
                                            field551 = 64;
                                            field307 = 64;
                                        }
                                        if (field475 == 3) {
                                            field551 = 0;
                                            field307 = 64;
                                        }
                                        if (field475 == 4) {
                                            field551 = 128;
                                            field307 = 64;
                                        }
                                        if (field475 == 5) {
                                            field551 = 64;
                                            field307 = 0;
                                        }
                                        if (field475 == 6) {
                                            field551 = 64;
                                            field307 = 128;
                                        }
                                        field475 = 2;
                                        field317 = field333.method2385();
                                        field318 = field333.method2385();
                                        field314 = field333.method2383();
                                    }
                                    if (field475 == 10) {
                                        field547 = field333.method2385();
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 154) {
                                    String var490 = field333.method2391();
                                    long var491 = (long) field333.method2385();
                                    long var493 = (long) field333.method2387();
                                    class152 var495 = (class152) class109.method46(class152.method2251(), field333.method2383());
                                    long var496 = (var491 << 32) + var493;
                                    boolean var498 = false;
                                    for (int var499 = 0; var499 < 100; var499++) {
                                        if (field350[var499] == var496) {
                                            var498 = true;
                                            break;
                                        }
                                    }
                                    if (method2(var490)) {
                                        var498 = true;
                                    }
                                    if (!var498 && field332 == 0) {
                                        field350[field410] = var496;
                                        field410 = (field410 + 1) % 100;
                                        String var500 = class223.method3831(class163.method47(class222.method3281(field333)));
                                        byte var501;
                                        if (var495.field2254) {
                                            var501 = 7;
                                        } else {
                                            var501 = 3;
                                        }
                                        if (var495.field2253 == -1) {
                                            class12.method974(var501, var490, var500);
                                        } else {
                                            class12.method974(var501, class2.method567(var495.field2253) + var490, var500);
                                        }
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 45) {
                                    int var502 = field333.method2383();
                                    if (field333.method2383() == 0) {
                                        field576[var502] = new class220();
                                        field333.field1973 += 18;
                                    } else {
                                        field333.field1973--;
                                        field576[var502] = new class220(field333, false);
                                    }
                                    field494 = field484;
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 120) {
                                    method192(true);
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 35) {
                                    int var503 = field333.method2430();
                                    int var504 = field333.method2419();
                                    class173 var505 = class173.method2977(var503);
                                    if (var505.field2839 != 2 || var505.field2774 != var504) {
                                        var505.field2839 = 2;
                                        var505.field2774 = var504;
                                        method2263(var505);
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 216) {
                                    int var506 = field333.method2418();
                                    field416 = var506;
                                    method635(false);
                                    method3188(var506);
                                    class37.method644(field416);
                                    for (int var507 = 0; var507 < 100; var507++) {
                                        field504[var507] = true;
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 118) {
                                    int var508 = field333.method2388();
                                    int var509 = field333.method2385();
                                    if (var508 < -70000) {
                                        var509 += 32768;
                                    }
                                    class173 var510;
                                    if (var508 >= 0) {
                                        var510 = class173.method2977(var508);
                                    } else {
                                        var510 = null;
                                    }
                                    while (field333.field1973 < field344) {
                                        int var511 = field333.method2484();
                                        int var512 = field333.method2385();
                                        int var513 = 0;
                                        if (var512 != 0) {
                                            var513 = field333.method2383();
                                            if (var513 == 255) {
                                                var513 = field333.method2388();
                                            }
                                        }
                                        if (var510 != null && var511 >= 0 && var511 < var510.field2808.length) {
                                            var510.field2808[var511] = var512;
                                            var510.field2817[var511] = var513;
                                        }
                                        class16.method3186(var509, var511, var512 - 1, var513);
                                    }
                                    if (var510 != null) {
                                        method2263(var510);
                                    }
                                    method110();
                                    field487[++field351 - 1 & 0x1F] = var509 & 0x7FFF;
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 124) {
                                    field313 = field333.method2385() * 30;
                                    field496 = field484;
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 114) {
                                    int var514 = field333.method2559();
                                    if (var514 == 65535) {
                                        var514 = -1;
                                    }
                                    int var515 = field333.method2487();
                                    int var516 = field333.method2487();
                                    class173 var517 = class173.method2977(var515);
                                    if (var517.field2820) {
                                        var517.field2850 = var514;
                                        var517.field2851 = var516;
                                        class52 var519 = class52.method588(var514);
                                        var517.field2725 = var519.field1121;
                                        var517.field2782 = var519.field1122;
                                        var517.field2783 = var519.field1123;
                                        var517.field2779 = var519.field1124;
                                        var517.field2781 = var519.field1125;
                                        var517.field2784 = var519.field1126;
                                        if (var519.field1109 == 1) {
                                            var517.field2802 = 1;
                                        } else {
                                            var517.field2802 = 2;
                                        }
                                        if (var517.field2754 > 0) {
                                            var517.field2784 = var517.field2784 * 32 / var517.field2754;
                                        } else if (var517.field2743 > 0) {
                                            var517.field2784 = var517.field2784 * 32 / var517.field2743;
                                        }
                                        method2263(var517);
                                    } else {
                                        if (var514 == -1) {
                                            var517.field2839 = 0;
                                            field345 = -1;
                                            var263 = true;
                                            break label5166;
                                        }
                                        class52 var518 = class52.method588(var514);
                                        var517.field2839 = 4;
                                        var517.field2774 = var514;
                                        var517.field2725 = var518.field1121;
                                        var517.field2782 = var518.field1122;
                                        var517.field2784 = var518.field1126 * 100 / var516;
                                        method2263(var517);
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 187) {
                                    while (field333.field1973 < field344) {
                                        int var520 = field333.method2383();
                                        boolean var521 = (var520 & 0x1) == 1;
                                        String var522 = field333.method2391();
                                        String var523 = field333.method2391();
                                        field333.method2391();
                                        for (int var524 = 0; var524 < field356; var524++) {
                                            class8 var525 = field572[var524];
                                            if (var521) {
                                                if (var523.equals(var525.field141)) {
                                                    var525.field141 = var522;
                                                    var525.field148 = var523;
                                                    var522 = null;
                                                    break;
                                                }
                                            } else if (var522.equals(var525.field141)) {
                                                var525.field141 = var522;
                                                var525.field148 = var523;
                                                var522 = null;
                                                break;
                                            }
                                        }
                                        if (var522 != null && field356 < 400) {
                                            class8 var526 = new class8();
                                            field572[field356] = var526;
                                            var526.field141 = var522;
                                            var526.field148 = var523;
                                            field356++;
                                        }
                                    }
                                    field492 = field484;
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 152) {
                                    field535 = field333.method2383();
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 22) {
                                    field548 = false;
                                    for (int var527 = 0; var527 < 5; var527++) {
                                        field549[var527] = false;
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 252) {
                                    class26 var528 = new class26();
                                    var528.field662 = field333.method2391();
                                    var528.field655 = field333.method2385();
                                    int var529 = field333.method2388();
                                    var528.field660 = var529;
                                    method2652(45);
                                    Statics.field701.method2865();
                                    Statics.field701 = null;
                                    class32.method643(var528);
                                    field345 = -1;
                                    var263 = false;
                                    break label5166;
                                }
                                if (field345 == 209) {
                                    for (int var530 = 0; var530 < Statics.field1167; var530++) {
                                        class53 var531 = class53.method989(var530);
                                        if (var531 != null) {
                                            class176.field2877[var530] = 0;
                                            class176.field2879[var530] = 0;
                                        }
                                    }
                                    method110();
                                    field473 += 32;
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 250) {
                                    class33.method2073();
                                    for (int var532 = 0; var532 < 2048; var532++) {
                                        field421[var532] = null;
                                    }
                                    class33.method1247(field333);
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 65) {
                                    method110();
                                    int var533 = field333.method2411();
                                    int var534 = field333.method2423();
                                    int var535 = field333.method2430();
                                    field437[var533] = var535;
                                    field435[var533] = var534;
                                    field436[var533] = 1;
                                    for (int var536 = 0; var536 < 98; var536++) {
                                        if (var535 >= class155.field2284[var536]) {
                                            field436[var533] = var536 + 2;
                                        }
                                    }
                                    field489[++field490 - 1 & 0x1F] = var533;
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 102) {
                                    int var537 = field333.method2559();
                                    int var538 = field333.method2428();
                                    class176.field2877[var537] = var538;
                                    if (class176.field2879[var537] != var538) {
                                        class176.field2879[var537] = var538;
                                        method806(var537);
                                    }
                                    field430[++field473 - 1 & 0x1F] = var537;
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 66) {
                                    int var539 = field333.method2419();
                                    int var540 = field333.method2487();
                                    int var541 = field333.method2559();
                                    class173 var542 = class173.method2977(var540);
                                    var542.field2741 = (var541 << 16) + var539;
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 233) {
                                    if (field416 != -1) {
                                        method14(field416, 0);
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 29) {
                                    int var543 = field333.method2388();
                                    int var544 = field333.method2487();
                                    class4 var545 = (class4) field460.method3584((long) var544);
                                    class4 var546 = (class4) field460.method3584((long) var543);
                                    if (var546 != null) {
                                        method200(var546, var545 == null || var545.field60 != var546.field60);
                                    }
                                    if (var545 != null) {
                                        var545.method3711();
                                        field460.method3575(var545, (long) var543);
                                    }
                                    class173 var547 = class173.method2977(var544);
                                    if (var547 != null) {
                                        method2263(var547);
                                    }
                                    class173 var548 = class173.method2977(var543);
                                    if (var548 != null) {
                                        method2263(var548);
                                        method2996(Statics.field2791[var548.field2732 >>> 16], var548, true);
                                    }
                                    if (field416 != -1) {
                                        method14(field416, 1);
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 210) {
                                    field548 = true;
                                    Statics.field2256 = field333.method2383();
                                    Statics.field1032 = field333.method2383();
                                    Statics.field1596 = field333.method2385();
                                    Statics.field1666 = field333.method2383();
                                    Statics.field1782 = field333.method2383();
                                    if (Statics.field1782 >= 100) {
                                        Statics.field2242 = Statics.field2256 * 128 + 64;
                                        Statics.field263 = Statics.field1032 * 128 + 64;
                                        Statics.field1077 = method560(Statics.field2242, Statics.field263, Statics.field721) - Statics.field1596;
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 10) {
                                    int var549 = field333.method2385();
                                    int var550 = field333.method2388();
                                    int var551 = field333.method2385();
                                    int var552 = field333.method2419();
                                    class173 var553 = class173.method2977(var550);
                                    if (var553.field2725 != var552 || var553.field2782 != var549 || var553.field2784 != var551) {
                                        var553.field2725 = var552;
                                        var553.field2782 = var549;
                                        var553.field2784 = var551;
                                        method2263(var553);
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 174) {
                                    method110();
                                    field465 = field333.method2386();
                                    field496 = field484;
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 140) {
                                    String var554 = field333.method2391();
                                    long var555 = field333.method2389();
                                    long var557 = (long) field333.method2385();
                                    long var559 = (long) field333.method2387();
                                    class152 var561 = (class152) class109.method46(class152.method2251(), field333.method2383());
                                    long var562 = (var557 << 32) + var559;
                                    boolean var564 = false;
                                    for (int var565 = 0; var565 < 100; var565++) {
                                        if (field350[var565] == var562) {
                                            var564 = true;
                                            break;
                                        }
                                    }
                                    if (var561.field2255 && method2(var554)) {
                                        var564 = true;
                                    }
                                    if (!var564 && field332 == 0) {
                                        field350[field410] = var562;
                                        field410 = (field410 + 1) % 100;
                                        String var566 = class223.method3831(class163.method47(class222.method3281(field333)));
                                        if (var561.field2253 == -1) {
                                            class12.method1590(9, var554, var566, Statics.method2078(var555));
                                        } else {
                                            class12.method1590(9, class2.method567(var561.field2253) + var554, var566, Statics.method2078(var555));
                                        }
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 227) {
                                    int var567 = field333.method2388();
                                    class173 var568 = class173.method2977(var567);
                                    var568.field2839 = 3;
                                    var568.field2774 = Statics.field101.field32.method3330();
                                    method2263(var568);
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 205) {
                                    field533 = field333.method2383();
                                    if (field533 == 255) {
                                        field533 = 0;
                                    }
                                    field534 = field333.method2383();
                                    if (field534 == 255) {
                                        field534 = 0;
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 104) {
                                    field521 = field484;
                                    if (field344 == 0) {
                                        field526 = null;
                                        field527 = null;
                                        Statics.field75 = 0;
                                        Statics.field137 = null;
                                        field345 = -1;
                                        var263 = true;
                                        break label5166;
                                    }
                                    field527 = field333.method2391();
                                    long var569 = field333.method2389();
                                    field526 = class162.method191(var569);
                                    Statics.field3191 = field333.method2370();
                                    int var571 = field333.method2383();
                                    if (var571 == 255) {
                                        field345 = -1;
                                        var263 = true;
                                        break label5166;
                                    }
                                    Statics.field75 = var571;
                                    class25[] var572 = new class25[100];
                                    for (int var573 = 0; var573 < Statics.field75; var573++) {
                                        var572[var573] = new class25();
                                        var572[var573].field644 = field333.method2391();
                                        var572[var573].field639 = class164.method175(var572[var573].field644, Statics.field1868);
                                        var572[var573].field640 = field333.method2385();
                                        var572[var573].field641 = field333.method2370();
                                        field333.method2391();
                                        if (var572[var573].field644.equals(Statics.field101.field41)) {
                                            Statics.field2037 = var572[var573].field641;
                                        }
                                    }
                                    boolean var574 = false;
                                    int var575 = Statics.field75;
                                    while (var575 > 0) {
                                        boolean var576 = true;
                                        var575--;
                                        for (int var577 = 0; var577 < var575; var577++) {
                                            if (var572[var577].field639.compareTo(var572[var577 + 1].field639) > 0) {
                                                class25 var578 = var572[var577];
                                                var572[var577] = var572[var577 + 1];
                                                var572[var577 + 1] = var578;
                                                var576 = false;
                                            }
                                        }
                                        if (var576) {
                                            break;
                                        }
                                    }
                                    Statics.field137 = var572;
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 240) {
                                    Statics.field602 = field333.method2549();
                                    Statics.field2160 = field333.method2411();
                                    for (int var579 = Statics.field2160; var579 < Statics.field2160 + 8; var579++) {
                                        for (int var580 = Statics.field602; var580 < Statics.field602 + 8; var580++) {
                                            if (field431[Statics.field721][var579][var580] != null) {
                                                field431[Statics.field721][var579][var580] = null;
                                                method198(var579, var580);
                                            }
                                        }
                                    }
                                    for (class17 var581 = (class17) field432.method3611(); var581 != null; var581 = (class17) field432.method3616()) {
                                        if (var581.field237 >= Statics.field2160 && var581.field237 < Statics.field2160 + 8 && var581.field238 >= Statics.field602 && var581.field238 < Statics.field602 + 8 && Statics.field721 == var581.field247) {
                                            var581.field246 = 0;
                                        }
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 131) {
                                    method167(field333.method2391());
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 254) {
                                    while (field333.field1973 < field344) {
                                        boolean var582 = field333.method2383() == 1;
                                        String var583 = field333.method2391();
                                        String var584 = field333.method2391();
                                        int var585 = field333.method2385();
                                        int var586 = field333.method2383();
                                        int var587 = field333.method2383();
                                        boolean var588 = (var587 & 0x2) != 0;
                                        boolean var589 = (var587 & 0x1) != 0;
                                        if (var585 > 0) {
                                            field333.method2391();
                                            field333.method2383();
                                            field333.method2388();
                                        }
                                        field333.method2391();
                                        for (int var590 = 0; var590 < field578; var590++) {
                                            class18 var591 = field478[var590];
                                            if (var582) {
                                                if (var584.equals(var591.field258)) {
                                                    var591.field258 = var583;
                                                    var591.field254 = var584;
                                                    var583 = null;
                                                    break;
                                                }
                                            } else if (var583.equals(var591.field258)) {
                                                if (var591.field260 != var585) {
                                                    boolean var592 = true;
                                                    for (class39 var593 = (class39) field528.method3563(); var593 != null; var593 = (class39) field528.method3565()) {
                                                        if (var593.field879.equals(var583)) {
                                                            if (var585 != 0 && var593.field878 == 0) {
                                                                var593.method3707();
                                                                var592 = false;
                                                            } else if (var585 == 0 && var593.field878 != 0) {
                                                                var593.method3707();
                                                                var592 = false;
                                                            }
                                                        }
                                                    }
                                                    if (var592) {
                                                        field528.method3567(new class39(var583, var585));
                                                    }
                                                    var591.field260 = var585;
                                                }
                                                var591.field254 = var584;
                                                var591.field256 = var586;
                                                var591.field257 = var588;
                                                var591.field259 = var589;
                                                var583 = null;
                                                break;
                                            }
                                        }
                                        if (var583 != null && field578 < 400) {
                                            class18 var594 = new class18();
                                            field478[field578] = var594;
                                            var594.field258 = var583;
                                            var594.field254 = var584;
                                            var594.field260 = var585;
                                            var594.field256 = var586;
                                            var594.field257 = var588;
                                            var594.field259 = var589;
                                            field578++;
                                        }
                                    }
                                    field568 = 2;
                                    field492 = field484;
                                    boolean var595 = false;
                                    int var596 = field578;
                                    while (var596 > 0) {
                                        boolean var597 = true;
                                        var596--;
                                        for (int var598 = 0; var598 < var596; var598++) {
                                            boolean var599 = false;
                                            class18 var600 = field478[var598];
                                            class18 var601 = field478[var598 + 1];
                                            if (field296 != var600.field260 && field296 == var601.field260) {
                                                var599 = true;
                                            }
                                            if (!var599 && var600.field260 == 0 && var601.field260 != 0) {
                                                var599 = true;
                                            }
                                            if (!var599 && !var600.field257 && var601.field257) {
                                                var599 = true;
                                            }
                                            if (!var599 && !var600.field259 && var601.field259) {
                                                var599 = true;
                                            }
                                            if (var599) {
                                                class18 var602 = field478[var598];
                                                field478[var598] = field478[var598 + 1];
                                                field478[var598 + 1] = var602;
                                                var597 = false;
                                            }
                                        }
                                        if (var597) {
                                            break;
                                        }
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 196) {
                                    method2304(false);
                                    field333.method2632();
                                    int var603 = field333.method2385();
                                    class122 var604 = field333;
                                    int var605 = var604.field1973;
                                    class33.field764 = 0;
                                    int var606 = 0;
                                    var604.method2629();
                                    for (int var607 = 0; var607 < class33.field774; var607++) {
                                        int var608 = class33.field769[var607];
                                        if ((class33.field765[var608] & 0x1) == 0) {
                                            if (var606 > 0) {
                                                var606--;
                                                class33.field765[var608] = (byte) (class33.field765[var608] | 0x2);
                                            } else {
                                                int var609 = var604.method2630(1);
                                                if (var609 == 0) {
                                                    var606 = class33.method634(var604);
                                                    class33.field765[var608] = (byte) (class33.field765[var608] | 0x2);
                                                } else {
                                                    class33.method2753(var604, var608);
                                                }
                                            }
                                        }
                                    }
                                    var604.method2644();
                                    if (var606 != 0) {
                                        throw new RuntimeException();
                                    }
                                    var604.method2629();
                                    for (int var610 = 0; var610 < class33.field774; var610++) {
                                        int var611 = class33.field769[var610];
                                        if ((class33.field765[var611] & 0x1) != 0) {
                                            if (var606 > 0) {
                                                var606--;
                                                class33.field765[var611] = (byte) (class33.field765[var611] | 0x2);
                                            } else {
                                                int var612 = var604.method2630(1);
                                                if (var612 == 0) {
                                                    var606 = class33.method634(var604);
                                                    class33.field765[var611] = (byte) (class33.field765[var611] | 0x2);
                                                } else {
                                                    class33.method2753(var604, var611);
                                                }
                                            }
                                        }
                                    }
                                    var604.method2644();
                                    if (var606 != 0) {
                                        throw new RuntimeException();
                                    }
                                    var604.method2629();
                                    for (int var613 = 0; var613 < class33.field770; var613++) {
                                        int var614 = class33.field771[var613];
                                        if ((class33.field765[var614] & 0x1) != 0) {
                                            if (var606 > 0) {
                                                var606--;
                                                class33.field765[var614] = (byte) (class33.field765[var614] | 0x2);
                                            } else {
                                                int var615 = var604.method2630(1);
                                                if (var615 == 0) {
                                                    var606 = class33.method634(var604);
                                                    class33.field765[var614] = (byte) (class33.field765[var614] | 0x2);
                                                } else if (Statics.method2972(var604, var614)) {
                                                    class33.field765[var614] = (byte) (class33.field765[var614] | 0x2);
                                                }
                                            }
                                        }
                                    }
                                    var604.method2644();
                                    if (var606 != 0) {
                                        throw new RuntimeException();
                                    }
                                    var604.method2629();
                                    for (int var616 = 0; var616 < class33.field770; var616++) {
                                        int var617 = class33.field771[var616];
                                        if ((class33.field765[var617] & 0x1) == 0) {
                                            if (var606 > 0) {
                                                var606--;
                                                class33.field765[var617] = (byte) (class33.field765[var617] | 0x2);
                                            } else {
                                                int var618 = var604.method2630(1);
                                                if (var618 == 0) {
                                                    var606 = class33.method634(var604);
                                                    class33.field765[var617] = (byte) (class33.field765[var617] | 0x2);
                                                } else if (Statics.method2972(var604, var617)) {
                                                    class33.field765[var617] = (byte) (class33.field765[var617] | 0x2);
                                                }
                                            }
                                        }
                                    }
                                    var604.method2644();
                                    if (var606 != 0) {
                                        throw new RuntimeException();
                                    }
                                    class33.field774 = 0;
                                    class33.field770 = 0;
                                    for (int var619 = 1; var619 < 2048; var619++) {
                                        class33.field765[var619] = (byte) (class33.field765[var619] >> 1);
                                        class3 var620 = field421[var619];
                                        if (var620 == null) {
                                            class33.field771[++class33.field770 - 1] = var619;
                                        } else {
                                            class33.field769[++class33.field774 - 1] = var619;
                                        }
                                    }
                                    for (int var621 = 0; var621 < class33.field764; var621++) {
                                        int var622 = class33.field775[var621];
                                        class3 var623 = field421[var622];
                                        int var624 = var604.method2383();
                                        if ((var624 & 0x8) != 0) {
                                            var624 += var604.method2383() << 8;
                                        }
                                        byte var625 = -1;
                                        if ((var624 & 0x20) != 0) {
                                            int var626 = var604.method2383();
                                            byte[] var627 = new byte[var626];
                                            class119 var628 = new class119(var627);
                                            var604.method2394(var627, 0, var626);
                                            class33.field767[var622] = var628;
                                            var623.method12(var628);
                                        }
                                        if ((var624 & 0x80) != 0) {
                                            int var629 = var604.method2385();
                                            if (var629 == 65535) {
                                                var629 = -1;
                                            }
                                            int var630 = var604.method2383();
                                            method2320(var623, var629, var630);
                                        }
                                        if ((var624 & 0x10) != 0) {
                                            var623.field841 = var604.method2385();
                                            if (var623.field841 == 65535) {
                                                var623.field841 = -1;
                                            }
                                        }
                                        if ((var624 & 0x4) != 0) {
                                            var623.field822 = var604.method2391();
                                            if (var623.field822.charAt(0) == '~') {
                                                var623.field822 = var623.field822.substring(1);
                                                class12.method974(2, var623.field41, var623.field822);
                                            } else if (Statics.field101 == var623) {
                                                class12.method974(2, var623.field41, var623.field822);
                                            }
                                            var623.field830 = false;
                                            var623.field833 = 0;
                                            var623.field856 = 0;
                                            var623.field832 = 150;
                                        }
                                        if ((var624 & 0x40) != 0) {
                                            int var631 = var604.method2385();
                                            int var632 = var604.method2383();
                                            var623.method727(var631, var632, field303);
                                            var623.field877 = field303 + 300;
                                            var623.field839 = var604.method2383();
                                            var623.field840 = var604.method2383();
                                        }
                                        if ((var624 & 0x1) != 0) {
                                            var623.field868 = var604.method2385();
                                            if (var623.field869 == 0) {
                                                var623.field866 = var623.field868;
                                                var623.field868 = -1;
                                            }
                                        }
                                        if ((var624 & 0x2) != 0) {
                                            int var633 = var604.method2385();
                                            class152 var634 = (class152) class109.method46(class152.method2251(), var604.method2383());
                                            boolean var635 = var604.method2383() == 1;
                                            int var636 = var604.method2383();
                                            int var637 = var604.field1973;
                                            if (var623.field41 != null && var623.field32 != null) {
                                                boolean var638 = false;
                                                if (var634.field2255 && method2(var623.field41)) {
                                                    var638 = true;
                                                }
                                                if (!var638 && field332 == 0 && !var623.field44) {
                                                    class33.field777.field1973 = 0;
                                                    var604.method2394(class33.field777.field1978, 0, var636);
                                                    class33.field777.field1973 = 0;
                                                    class119 var639 = class33.field777;
                                                    String var643;
                                                    try {
                                                        int var640 = var639.method2484();
                                                        if (var640 > 32767) {
                                                            var640 = 32767;
                                                        }
                                                        byte[] var641 = new byte[var640];
                                                        var639.field1973 += Statics.field3163.method2316(var639.field1978, var639.field1973, var641, 0, var640);
                                                        String var642 = class165.method832(var641, 0, var640);
                                                        var643 = var642;
                                                    } catch (Exception var835) {
                                                        var643 = "Cabbage";
                                                    }
                                                    String var646 = class223.method3831(class163.method47(var643));
                                                    var623.field822 = var646.trim();
                                                    var623.field833 = var633 >> 8;
                                                    var623.field856 = var633 & 0xFF;
                                                    var623.field832 = 150;
                                                    var623.field830 = var635;
                                                    var623.field831 = Statics.field101 != var623 && var634.field2255 && field519 != "" && var646.toLowerCase().indexOf(field519) == -1;
                                                    int var647;
                                                    if (var634.field2254) {
                                                        var647 = var635 ? 91 : 1;
                                                    } else {
                                                        var647 = var635 ? 90 : 2;
                                                    }
                                                    if (var634.field2253 == -1) {
                                                        class12.method974(var647, var623.field41, var646);
                                                    } else {
                                                        class12.method974(var647, class2.method567(var634.field2253) + var623.field41, var646);
                                                    }
                                                }
                                            }
                                            var604.field1973 = var636 + var637;
                                        }
                                        if ((var624 & 0x200) != 0) {
                                            var623.field826 = var604.method2385();
                                            int var648 = var604.method2388();
                                            var623.field827 = var648 >> 16;
                                            var623.field855 = (var648 & 0xFFFF) + field303;
                                            var623.field847 = 0;
                                            var623.field854 = 0;
                                            if (var623.field855 > field303) {
                                                var623.field847 = -1;
                                            }
                                            if (var623.field826 == 65535) {
                                                var623.field826 = -1;
                                            }
                                        }
                                        if ((var624 & 0x100) != 0) {
                                            var623.field857 = var604.method2370();
                                            var623.field859 = var604.method2370();
                                            var623.field858 = var604.method2370();
                                            var623.field860 = var604.method2370();
                                            var623.field861 = var604.method2385() + field303;
                                            var623.field862 = var604.method2385() + field303;
                                            var623.field863 = var604.method2385();
                                            if (var623.field40) {
                                                var623.field857 += var623.field52;
                                                var623.field859 += var623.field37;
                                                var623.field858 += var623.field52;
                                                var623.field860 += var623.field37;
                                                var623.field869 = 0;
                                            } else {
                                                var623.field857 += var623.field870[0];
                                                var623.field859 += var623.field817[0];
                                                var623.field858 += var623.field870[0];
                                                var623.field860 += var623.field817[0];
                                                var623.field869 = 1;
                                            }
                                            var623.field874 = 0;
                                        }
                                        if ((var624 & 0x800) != 0) {
                                            int var649 = var604.method2385();
                                            int var650 = var604.method2383();
                                            var623.method727(var649, var650, field303);
                                            var623.field877 = field303 + 300;
                                            var623.field839 = var604.method2383();
                                            var623.field840 = var604.method2383();
                                        }
                                        if ((var624 & 0x400) != 0) {
                                            class33.field766[var622] = var604.method2370();
                                        }
                                        if ((var624 & 0x1000) != 0) {
                                            var625 = var604.method2370();
                                        }
                                        if (var623.field40) {
                                            if (var625 == 127) {
                                                var623.method16(var623.field52, var623.field37);
                                            } else {
                                                byte var651;
                                                if (var625 == -1) {
                                                    var651 = class33.field766[var622];
                                                } else {
                                                    var651 = var625;
                                                }
                                                var623.method15(var623.field52, var623.field37, var651);
                                            }
                                        }
                                    }
                                    if (var604.field1973 - var605 != var603) {
                                        throw new RuntimeException(var604.field1973 - var605 + " " + var603);
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 136) {
                                    int var652 = field333.method2385();
                                    if (var652 == 65535) {
                                        var652 = -1;
                                    }
                                    method3182(var652);
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 115) {
                                    int var653 = field333.method2424();
                                    int var654 = field333.method2419();
                                    if (var654 == 65535) {
                                        var654 = -1;
                                    }
                                    method2306(var654, var653);
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 230) {
                                    int var655 = field333.method2428();
                                    int var656 = field333.method2418();
                                    class173 var657 = class173.method2977(var655);
                                    if (var657.field2839 != 1 || var657.field2774 != var656) {
                                        var657.field2839 = 1;
                                        var657.field2774 = var656;
                                        method2263(var657);
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 249 || field345 == 80 || field345 == 163 || field345 == 101 || field345 == 106 || field345 == 197 || field345 == 156 || field345 == 27 || field345 == 88 || field345 == 103) {
                                    method921();
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 137) {
                                    String var658 = field333.method2391();
                                    int var659 = field333.method2423();
                                    int var660 = field333.method2549();
                                    if (var660 >= 1 && var660 <= 8) {
                                        if (var658.equalsIgnoreCase("null")) {
                                            var658 = null;
                                        }
                                        field316[var660 - 1] = var658;
                                        field366[var660 - 1] = var659 == 0;
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 184) {
                                    class122 var661 = field333;
                                    int var662 = field344;
                                    class210 var663 = new class210();
                                    var663.field3100 = var661.method2383();
                                    var663.field3105 = var661.method2388();
                                    var663.field3101 = new int[var663.field3100];
                                    var663.field3102 = new int[var663.field3100];
                                    var663.field3104 = new Field[var663.field3100];
                                    var663.field3099 = new int[var663.field3100];
                                    var663.field3103 = new Method[var663.field3100];
                                    var663.field3106 = new byte[var663.field3100][][];
                                    for (int var664 = 0; var664 < var663.field3100; var664++) {
                                        try {
                                            int var665 = var661.method2383();
                                            if (var665 == 0 || var665 == 1 || var665 == 2) {
                                                String var666 = var661.method2391();
                                                String var667 = var661.method2391();
                                                int var668 = 0;
                                                if (var665 == 1) {
                                                    var668 = var661.method2388();
                                                }
                                                var663.field3101[var664] = var665;
                                                var663.field3099[var664] = var668;
                                                if (class211.method825(var666).getClassLoader() == null) {
                                                    throw new SecurityException();
                                                }
                                                var663.field3104[var664] = class211.method825(var666).getDeclaredField(var667);
                                            } else if (var665 == 3 || var665 == 4) {
                                                String var669 = var661.method2391();
                                                String var670 = var661.method2391();
                                                int var671 = var661.method2383();
                                                String[] var672 = new String[var671];
                                                for (int var673 = 0; var673 < var671; var673++) {
                                                    var672[var673] = var661.method2391();
                                                }
                                                String var674 = var661.method2391();
                                                byte[][] var675 = new byte[var671][];
                                                if (var665 == 3) {
                                                    for (int var676 = 0; var676 < var671; var676++) {
                                                        int var677 = var661.method2388();
                                                        var675[var676] = new byte[var677];
                                                        var661.method2394(var675[var676], 0, var677);
                                                    }
                                                }
                                                var663.field3101[var664] = var665;
                                                Class[] var678 = new Class[var671];
                                                for (int var679 = 0; var679 < var671; var679++) {
                                                    var678[var679] = class211.method825(var672[var679]);
                                                }
                                                Class var680 = class211.method825(var674);
                                                if (class211.method825(var669).getClassLoader() == null) {
                                                    throw new SecurityException();
                                                }
                                                Method[] var681 = class211.method825(var669).getDeclaredMethods();
                                                Method[] var682 = var681;
                                                for (int var683 = 0; var683 < var682.length; var683++) {
                                                    Method var684 = var682[var683];
                                                    if (var684.getName().equals(var670)) {
                                                        Class[] var685 = var684.getParameterTypes();
                                                        if (var678.length == var685.length) {
                                                            boolean var686 = true;
                                                            for (int var687 = 0; var687 < var678.length; var687++) {
                                                                if (var678[var687] != var685[var687]) {
                                                                    var686 = false;
                                                                    break;
                                                                }
                                                            }
                                                            if (var686 && var680 == var684.getReturnType()) {
                                                                var663.field3103[var664] = var684;
                                                            }
                                                        }
                                                    }
                                                }
                                                var663.field3106[var664] = var675;
                                            }
                                        } catch (ClassNotFoundException var841) {
                                            var663.field3102[var664] = -1;
                                        } catch (SecurityException var842) {
                                            var663.field3102[var664] = -2;
                                        } catch (NullPointerException var843) {
                                            var663.field3102[var664] = -3;
                                        } catch (Exception var844) {
                                            var663.field3102[var664] = -4;
                                        } catch (Throwable var845) {
                                            var663.field3102[var664] = -5;
                                        }
                                    }
                                    class211.field3110.method3654(var663);
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                if (field345 == 123) {
                                    for (int var693 = 0; var693 < class176.field2879.length; var693++) {
                                        if (class176.field2879[var693] != class176.field2877[var693]) {
                                            class176.field2879[var693] = class176.field2877[var693];
                                            method806(var693);
                                            field430[++field473 - 1 & 0x1F] = var693;
                                        }
                                    }
                                    field345 = -1;
                                    var263 = true;
                                    break label5166;
                                }
                                class148.method190("" + field345 + class2.field18 + field349 + class2.field18 + field372 + class2.field18 + field344, (Throwable) null);
                                method3769();
                            } catch (IOException var847) {
                                method4();
                            } catch (Exception var848) {
                                String var696 = "" + field345 + class2.field18 + field349 + class2.field18 + field372 + class2.field18 + field344 + class2.field18 + (Statics.field2719 + Statics.field101.field870[0]) + class2.field18 + (Statics.field607 + Statics.field101.field817[0]) + class2.field18;
                                for (int var697 = 0; var697 < field344 && var697 < 50; var697++) {
                                    var696 = var696 + field333.field1978[var697] + class2.field18;
                                }
                                class148.method190(var696, var848);
                                method3769();
                            }
                            var263 = true;
                        }
                    }
                    if (!var263) {
                        break;
                    }
                }
                if (field304 == 30) {
                    while (class211.method2786()) {
                        field341.method2631(101);
                        field341.method2499(0);
                        int var698 = field341.field1973;
                        class211.method721(field341);
                        field341.method2380(field341.field1973 - var698);
                    }
                    Object var699 = Statics.field1999.field201;
                    synchronized (Statics.field1999.field201) {
                        if (!field295) {
                            Statics.field1999.field203 = 0;
                        } else if (class140.field2140 != 0 || Statics.field1999.field203 >= 40) {
                            field341.method2631(117);
                            field341.method2499(0);
                            int var700 = field341.field1973;
                            int var701 = 0;
                            for (int var702 = 0; var702 < Statics.field1999.field203 && field341.field1973 - var700 < 240; var702++) {
                                var701++;
                                int var703 = Statics.field1999.field209[var702];
                                if (var703 < 0) {
                                    var703 = 0;
                                } else if (var703 > 502) {
                                    var703 = 502;
                                }
                                int var704 = Statics.field1999.field202[var702];
                                if (var704 < 0) {
                                    var704 = 0;
                                } else if (var704 > 764) {
                                    var704 = 764;
                                }
                                int var705 = var703 * 765 + var704;
                                if (Statics.field1999.field209[var702] == -1 && Statics.field1999.field202[var702] == -1) {
                                    var704 = -1;
                                    var703 = -1;
                                    var705 = 524287;
                                }
                                if (field308 != var704 || field309 != var703) {
                                    int var706 = var704 - field308;
                                    field308 = var704;
                                    int var707 = var703 - field309;
                                    field309 = var703;
                                    if (field539 < 8 && var706 >= -32 && var706 <= 31 && var707 >= -32 && var707 <= 31) {
                                        var706 += 32;
                                        var707 += 32;
                                        field341.method2369((field539 << 12) + (var706 << 6) + var707);
                                        field539 = 0;
                                    } else if (field539 < 8) {
                                        field341.method2413((field539 << 19) + 8388608 + var705);
                                        field539 = 0;
                                    } else {
                                        field341.method2556((field539 << 19) + -1073741824 + var705);
                                        field539 = 0;
                                    }
                                } else if (field539 < 2047) {
                                    field539++;
                                }
                            }
                            field341.method2380(field341.field1973 - var700);
                            if (var701 >= Statics.field1999.field203) {
                                Statics.field1999.field203 = 0;
                            } else {
                                Statics.field1999.field203 -= var701;
                                for (int var708 = 0; var708 < Statics.field1999.field203; var708++) {
                                    Statics.field1999.field202[var708] = Statics.field1999.field202[var701 + var708];
                                    Statics.field1999.field209[var708] = Statics.field1999.field209[var701 + var708];
                                }
                            }
                        }
                    }
                    if (class140.field2140 == 1 || !Statics.field2584 && class140.field2140 == 4 || class140.field2140 == 2) {
                        long var710 = (class140.field2141 - field501 * -1L) / 50L;
                        if (var710 > 4095L) {
                            var710 = 4095L;
                        }
                        field501 = class140.field2141 * -1L;
                        int var712 = class140.field2132;
                        if (var712 < 0) {
                            var712 = 0;
                        } else if (var712 > Statics.field705) {
                            var712 = Statics.field705;
                        }
                        int var713 = class140.field2146;
                        if (var713 < 0) {
                            var713 = 0;
                        } else if (var713 > Statics.field2115) {
                            var713 = Statics.field2115;
                        }
                        int var714 = (int) var710;
                        field341.method2631(63);
                        field341.method2369((class140.field2140 == 2 ? 1 : 0) + (var714 << 1));
                        field341.method2369(var713);
                        field341.method2369(var712);
                    }
                    if (class137.field2091 > 0) {
                        field341.method2631(115);
                        field341.method2369(0);
                        int var715 = field341.field1973;
                        long var716 = class115.method2082();
                        for (int var718 = 0; var718 < class137.field2091; var718++) {
                            long var719 = var716 - field425;
                            if (var719 > 16777215L) {
                                var719 = 16777215L;
                            }
                            field425 = var716;
                            field341.method2587((int) var719);
                            field341.method2407(class137.field2106[var718]);
                        }
                        field341.method2379(field341.field1973 - var715);
                    }
                    if (field391 > 0) {
                        field391--;
                    }
                    if (class137.field2102[96] || class137.field2102[97] || class137.field2102[98] || class137.field2102[99]) {
                        field450 = true;
                    }
                    if (field450 && field391 <= 0) {
                        field391 = 20;
                        field450 = false;
                        field341.method2631(83);
                        field341.method2441(field385);
                        field341.method2441(field384);
                    }
                    if (Statics.field3123 && !field343) {
                        field343 = true;
                        field341.method2631(125);
                        field341.method2499(1);
                    }
                    if (!Statics.field3123 && field343) {
                        field343 = false;
                        field341.method2631(125);
                        field341.method2499(0);
                    }
                    method3274();
                    if (field304 == 30) {
                        method579();
                        method39();
                        field346++;
                        if (field346 > 750) {
                            method4();
                        } else {
                            int var721 = class33.field774;
                            int[] var722 = class33.field769;
                            for (int var723 = 0; var723 < var721; var723++) {
                                class3 var724 = field421[var722[var723]];
                                if (var724 != null) {
                                    method620(var724, 1);
                                }
                            }
                            method734();
                            int[] var725 = class33.field769;
                            for (int var726 = 0; var726 < class33.field774; var726++) {
                                class3 var727 = field421[var725[var726]];
                                if (var727 != null && var727.field832 > 0) {
                                    var727.field832--;
                                    if (var727.field832 == 0) {
                                        var727.field822 = null;
                                    }
                                }
                            }
                            for (int var728 = 0; var728 < field336; var728++) {
                                int var729 = field337[var728];
                                class35 var730 = field322[var729];
                                if (var730 != null && var730.field832 > 0) {
                                    var730.field832--;
                                    if (var730.field832 == 0) {
                                        var730.field822 = null;
                                    }
                                }
                            }
                            field472++;
                            if (field411 != 0) {
                                field429 += 20;
                                if (field429 >= 400) {
                                    field411 = 0;
                                }
                            }
                            if (Statics.field171 != null) {
                                field412++;
                                if (field412 >= 15) {
                                    method2263(Statics.field171);
                                    Statics.field171 = null;
                                }
                            }
                            class173 var731 = Statics.field1158;
                            class173 var732 = Statics.field1746;
                            Statics.field1158 = null;
                            Statics.field1746 = null;
                            field476 = null;
                            field480 = false;
                            field477 = false;
                            field305 = 0;
                            while (true) {
                                while (class137.method2692() && field305 < 128) {
                                    if (field453 >= 2 && class137.field2102[82] && Statics.field802 == 66) {
                                        String var733 = "";
                                        Iterator var734 = class12.field182.iterator();
                                        while (var734.hasNext()) {
                                            class36 var735 = (class36) var734.next();
                                            var733 = var733 + var735.field795 + ':' + var735.field794 + '\n';
                                        }
                                        Statics.field27.setContents(new StringSelection(var733), (ClipboardOwner) null);
                                    } else {
                                        field524[field305] = Statics.field802;
                                        field523[field305] = Statics.field590;
                                        field305++;
                                    }
                                }
                                if (field416 != -1) {
                                    int var738 = field416;
                                    int var739 = Statics.field2115;
                                    int var740 = Statics.field705;
                                    if (class173.method692(var738)) {
                                        method207(Statics.field2791[var738], -1, 0, 0, var739, var740, 0, 0);
                                    }
                                }
                                field484++;
                                while (true) {
                                    class1 var741;
                                    class173 var742;
                                    class173 var743;
                                    do {
                                        var741 = (class1) field499.method3628();
                                        if (var741 == null) {
                                            while (true) {
                                                class1 var744;
                                                class173 var745;
                                                class173 var746;
                                                do {
                                                    var744 = (class1) field500.method3628();
                                                    if (var744 == null) {
                                                        while (true) {
                                                            class1 var747;
                                                            class173 var748;
                                                            class173 var749;
                                                            do {
                                                                var747 = (class1) field498.method3628();
                                                                if (var747 == null) {
                                                                    boolean var750 = false;
                                                                    while (!var750) {
                                                                        var750 = true;
                                                                        for (int var751 = 0; var751 < field440 - 1; var751++) {
                                                                            if (field379[var751] < 1000 && field379[var751 + 1] > 1000) {
                                                                                String var752 = field446[var751];
                                                                                field446[var751] = field446[var751 + 1];
                                                                                field446[var751 + 1] = var752;
                                                                                String var753 = field445[var751];
                                                                                field445[var751] = field445[var751 + 1];
                                                                                field445[var751 + 1] = var753;
                                                                                int var754 = field379[var751];
                                                                                field379[var751] = field379[var751 + 1];
                                                                                field379[var751 + 1] = var754;
                                                                                int var755 = field441[var751];
                                                                                field441[var751] = field441[var751 + 1];
                                                                                field441[var751 + 1] = var755;
                                                                                int var756 = field389[var751];
                                                                                field389[var751] = field389[var751 + 1];
                                                                                field389[var751 + 1] = var756;
                                                                                int var757 = field444[var751];
                                                                                field444[var751] = field444[var751 + 1];
                                                                                field444[var751 + 1] = var757;
                                                                                var750 = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (Statics.field1951 == null && field399 == null) {
                                                                        int var758 = class140.field2140;
                                                                        if (field439) {
                                                                            if (var758 != 1 && (Statics.field2584 || var758 != 4)) {
                                                                                int var759 = class140.field2134;
                                                                                int var760 = class140.field2135 * 782474221;
                                                                                if (var759 < Statics.field211 - 10 || var759 > Statics.field211 + Statics.field1874 + 10 || var760 < Statics.field887 - 10 || var760 > Statics.field887 + Statics.field1771 + 10) {
                                                                                    field439 = false;
                                                                                    method123(Statics.field211, Statics.field887, Statics.field1874, Statics.field1771);
                                                                                }
                                                                            }
                                                                            if (var758 == 1 || !Statics.field2584 && var758 == 4) {
                                                                                int var761 = Statics.field211;
                                                                                int var762 = Statics.field887;
                                                                                int var763 = Statics.field1874;
                                                                                int var764 = class140.field2146;
                                                                                int var765 = class140.field2132;
                                                                                int var766 = -1;
                                                                                for (int var767 = 0; var767 < field440; var767++) {
                                                                                    int var768 = (field440 - 1 - var767) * 15 + var762 + 31;
                                                                                    if (var764 > var761 && var764 < var761 + var763 && var765 > var768 - 13 && var765 < var768 + 3) {
                                                                                        var766 = var767;
                                                                                    }
                                                                                }
                                                                                if (var766 != -1 && var766 >= 0) {
                                                                                    int var769 = field441[var766];
                                                                                    int var770 = field389[var766];
                                                                                    int var771 = field379[var766];
                                                                                    int var772 = field444[var766];
                                                                                    String var773 = field445[var766];
                                                                                    String var774 = field446[var766];
                                                                                    method1199(var769, var770, var771, var772, var773, var774, class140.field2146, class140.field2132);
                                                                                }
                                                                                field439 = false;
                                                                                method123(Statics.field211, Statics.field887, Statics.field1874, Statics.field1771);
                                                                            }
                                                                        } else {
                                                                            label5241: {
                                                                                int var776;
                                                                                int var777;
                                                                                label5330: {
                                                                                    if ((var758 == 1 || !Statics.field2584 && var758 == 4) && field440 > 0) {
                                                                                        int var775 = field379[field440 - 1];
                                                                                        if (var775 == 39 || var775 == 40 || var775 == 41 || var775 == 42 || var775 == 43 || var775 == 33 || var775 == 34 || var775 == 35 || var775 == 36 || var775 == 37 || var775 == 38 || var775 == 1005) {
                                                                                            var776 = field441[field440 - 1];
                                                                                            var777 = field389[field440 - 1];
                                                                                            class173 var778 = class173.method2977(var777);
                                                                                            int var779 = method2693(var778);
                                                                                            boolean var780 = (var779 >> 28 & 0x1) != 0;
                                                                                            if (var780) {
                                                                                                break label5330;
                                                                                            }
                                                                                            class178 var850 = (class178) null;
                                                                                            if (class178.method2989(method2693(var778))) {
                                                                                                break label5330;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if ((var758 == 1 || !Statics.field2584 && var758 == 4) && (field529 == 1 && field440 > 2 || method2159(field440 - 1))) {
                                                                                        var758 = 2;
                                                                                    }
                                                                                    if ((var758 == 1 || !Statics.field2584 && var758 == 4) && field440 > 0) {
                                                                                        int var782 = field440 - 1;
                                                                                        if (var782 >= 0) {
                                                                                            int var783 = field441[var782];
                                                                                            int var784 = field389[var782];
                                                                                            int var785 = field379[var782];
                                                                                            int var786 = field444[var782];
                                                                                            String var787 = field445[var782];
                                                                                            String var788 = field446[var782];
                                                                                            method1199(var783, var784, var785, var786, var787, var788, class140.field2146, class140.field2132);
                                                                                        }
                                                                                    }
                                                                                    if (var758 == 2 && field440 > 0) {
                                                                                        method3013(class140.field2146, class140.field2132);
                                                                                    }
                                                                                    break label5241;
                                                                                }
                                                                                if (Statics.field1951 != null && !field418 && field529 != 1 && !method2159(field440 - 1) && field440 > 0) {
                                                                                    method3531(field415, field329);
                                                                                }
                                                                                field418 = false;
                                                                                field419 = 0;
                                                                                if (Statics.field1951 != null) {
                                                                                    method2263(Statics.field1951);
                                                                                }
                                                                                Statics.field1951 = class173.method2977(var777);
                                                                                field414 = var776;
                                                                                field415 = class140.field2146;
                                                                                field329 = class140.field2132;
                                                                                if (field440 > 0) {
                                                                                    int var781 = field440 - 1;
                                                                                    Statics.field630 = new class31();
                                                                                    Statics.field630.field723 = field441[var781];
                                                                                    Statics.field630.field728 = field389[var781];
                                                                                    Statics.field630.field725 = field379[var781];
                                                                                    Statics.field630.field722 = field444[var781];
                                                                                    Statics.field630.field726 = field445[var781];
                                                                                }
                                                                                method2263(Statics.field1951);
                                                                            }
                                                                        }
                                                                    }
                                                                    if (field399 != null) {
                                                                        method2667();
                                                                    }
                                                                    if (Statics.field1951 != null) {
                                                                        method2263(Statics.field1951);
                                                                        field419++;
                                                                        if (class140.field2142 == 0) {
                                                                            if (field418) {
                                                                                if (Statics.field685 == Statics.field1951 && field417 != field414) {
                                                                                    class173 var789 = Statics.field1951;
                                                                                    byte var790 = 0;
                                                                                    if (field462 == 1 && var789.field2777 == 206) {
                                                                                        var790 = 1;
                                                                                    }
                                                                                    if (var789.field2808[field417] <= 0) {
                                                                                        var790 = 0;
                                                                                    }
                                                                                    int var791 = method2693(var789);
                                                                                    boolean var792 = (var791 >> 29 & 0x1) != 0;
                                                                                    if (var792) {
                                                                                        int var793 = field414;
                                                                                        int var794 = field417;
                                                                                        var789.field2808[var794] = var789.field2808[var793];
                                                                                        var789.field2817[var794] = var789.field2817[var793];
                                                                                        var789.field2808[var793] = -1;
                                                                                        var789.field2817[var793] = 0;
                                                                                    } else if (var790 == 1) {
                                                                                        int var795 = field414;
                                                                                        int var796 = field417;
                                                                                        while (var795 != var796) {
                                                                                            if (var795 > var796) {
                                                                                                var789.method3215(var795 - 1, var795);
                                                                                                var795--;
                                                                                            } else if (var795 < var796) {
                                                                                                var789.method3215(var795 + 1, var795);
                                                                                                var795++;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        var789.method3215(field417, field414);
                                                                                    }
                                                                                    field341.method2631(61);
                                                                                    field341.method2408(var790);
                                                                                    field341.method2415(field414);
                                                                                    field341.method2582(field417);
                                                                                    field341.method2426(Statics.field1951.field2732);
                                                                                }
                                                                            } else if ((field529 == 1 || method2159(field440 - 1)) && field440 > 2) {
                                                                                method3013(field415, field329);
                                                                            } else if (field440 > 0) {
                                                                                method3531(field415, field329);
                                                                            }
                                                                            field412 = 10;
                                                                            class140.field2140 = 0;
                                                                            Statics.field1951 = null;
                                                                        } else if (field419 >= 5 && (class140.field2134 > field415 + 5 || class140.field2134 < field415 - 5 || class140.field2135 * 782474221 > field329 + 5 || class140.field2135 * 782474221 < field329 - 5)) {
                                                                            field418 = true;
                                                                        }
                                                                    }
                                                                    if (class86.field1513 != -1) {
                                                                        int var797 = class86.field1513;
                                                                        int var798 = class86.field1488;
                                                                        field341.method2631(187);
                                                                        field341.method2499(5);
                                                                        field341.method2369(Statics.field2719 + var797);
                                                                        field341.method2499(class137.field2102[82] ? (class137.field2102[81] ? 2 : 1) : 0);
                                                                        field341.method2582(Statics.field607 + var798);
                                                                        class86.field1513 = -1;
                                                                        field408 = class140.field2146;
                                                                        field520 = class140.field2132;
                                                                        field411 = 1;
                                                                        field429 = 0;
                                                                        field533 = var797;
                                                                        field534 = var798;
                                                                    }
                                                                    if (Statics.field1158 != var731) {
                                                                        if (var731 != null) {
                                                                            method2263(var731);
                                                                        }
                                                                        if (Statics.field1158 != null) {
                                                                            method2263(Statics.field1158);
                                                                        }
                                                                    }
                                                                    if (Statics.field1746 != var732 && field503 == field449) {
                                                                        if (var732 != null) {
                                                                            method2263(var732);
                                                                        }
                                                                        if (Statics.field1746 != null) {
                                                                            method2263(Statics.field1746);
                                                                        }
                                                                    }
                                                                    if (Statics.field1746 == null) {
                                                                        if (field449 > 0) {
                                                                            field449--;
                                                                        }
                                                                    } else if (field449 < field503) {
                                                                        field449++;
                                                                        if (field503 == field449) {
                                                                            method2263(Statics.field1746);
                                                                        }
                                                                    }
                                                                    int var799 = field319 + Statics.field101.field853;
                                                                    int var800 = field525 + Statics.field101.field843;
                                                                    if (Statics.field225 - var799 < -500 || Statics.field225 - var799 > 500 || Statics.field1876 - var800 < -500 || Statics.field1876 - var800 > 500) {
                                                                        Statics.field225 = var799;
                                                                        Statics.field1876 = var800;
                                                                    }
                                                                    if (Statics.field225 != var799) {
                                                                        Statics.field225 += (var799 - Statics.field225) / 16;
                                                                    }
                                                                    if (Statics.field1876 != var800) {
                                                                        Statics.field1876 += (var800 - Statics.field1876) / 16;
                                                                    }
                                                                    if (class140.field2142 == 4 && Statics.field2584) {
                                                                        int var801 = class140.field2135 * 782474221 - field493 * 782474221;
                                                                        field310 = var801 * 2;
                                                                        field493 = (var801 == -1 || var801 == 1 ? class140.field2135 * 782474221 : (field493 * 782474221 + class140.field2135 * 782474221) / 2) * 829225445;
                                                                        int var802 = field388 - class140.field2134;
                                                                        field386 = var802 * 2;
                                                                        field388 = var802 == -1 || var802 == 1 ? class140.field2134 : (field388 + class140.field2134) / 2;
                                                                    } else {
                                                                        if (class137.field2102[96]) {
                                                                            field386 += (-24 - field386) / 2;
                                                                        } else if (class137.field2102[97]) {
                                                                            field386 += (24 - field386) / 2;
                                                                        } else {
                                                                            field386 /= 2;
                                                                        }
                                                                        if (class137.field2102[98]) {
                                                                            field310 += (12 - field310) / 2;
                                                                        } else if (class137.field2102[99]) {
                                                                            field310 += (-12 - field310) / 2;
                                                                        } else {
                                                                            field310 /= 2;
                                                                        }
                                                                        field493 = class140.field2135;
                                                                        field388 = class140.field2134;
                                                                    }
                                                                    field385 = field386 / 2 + field385 & 0x7FF;
                                                                    field384 += field310 / 2;
                                                                    if (field384 < 128) {
                                                                        field384 = 128;
                                                                    }
                                                                    if (field384 > 383) {
                                                                        field384 = 383;
                                                                    }
                                                                    int var803 = Statics.field225 >> 7;
                                                                    int var804 = Statics.field1876 >> 7;
                                                                    int var805 = method560(Statics.field225, Statics.field1876, Statics.field721);
                                                                    int var806 = 0;
                                                                    if (var803 > 3 && var804 > 3 && var803 < 100 && var804 < 100) {
                                                                        for (int var807 = var803 - 4; var807 <= var803 + 4; var807++) {
                                                                            for (int var808 = var804 - 4; var808 <= var804 + 4; var808++) {
                                                                                int var809 = Statics.field721;
                                                                                if (var809 < 3 && (class6.field109[1][var807][var808] & 0x2) == 2) {
                                                                                    var809++;
                                                                                }
                                                                                int var810 = var805 - class6.field89[var809][var807][var808];
                                                                                if (var810 > var806) {
                                                                                    var806 = var810;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    int var811 = var806 * 192;
                                                                    if (var811 > 98048) {
                                                                        var811 = 98048;
                                                                    }
                                                                    if (var811 < 32768) {
                                                                        var811 = 32768;
                                                                    }
                                                                    if (var811 > field443) {
                                                                        field443 += (var811 - field443) / 24;
                                                                    } else if (var811 < field443) {
                                                                        field443 += (var811 - field443) / 80;
                                                                    }
                                                                    if (field548) {
                                                                        int var812 = Statics.field2256 * 128 + 64;
                                                                        int var813 = Statics.field1032 * 128 + 64;
                                                                        int var814 = method560(var812, var813, Statics.field721) - Statics.field1596;
                                                                        if (Statics.field2242 < var812) {
                                                                            Statics.field2242 += Statics.field1782 * (var812 - Statics.field2242) / 1000 + Statics.field1666;
                                                                            if (Statics.field2242 > var812) {
                                                                                Statics.field2242 = var812;
                                                                            }
                                                                        }
                                                                        if (Statics.field2242 > var812) {
                                                                            Statics.field2242 -= Statics.field1782 * (Statics.field2242 - var812) / 1000 + Statics.field1666;
                                                                            if (Statics.field2242 < var812) {
                                                                                Statics.field2242 = var812;
                                                                            }
                                                                        }
                                                                        if (Statics.field1077 < var814) {
                                                                            Statics.field1077 += Statics.field1782 * (var814 - Statics.field1077) / 1000 + Statics.field1666;
                                                                            if (Statics.field1077 > var814) {
                                                                                Statics.field1077 = var814;
                                                                            }
                                                                        }
                                                                        if (Statics.field1077 > var814) {
                                                                            Statics.field1077 -= Statics.field1782 * (Statics.field1077 - var814) / 1000 + Statics.field1666;
                                                                            if (Statics.field1077 < var814) {
                                                                                Statics.field1077 = var814;
                                                                            }
                                                                        }
                                                                        if (Statics.field263 < var813) {
                                                                            Statics.field263 += Statics.field1782 * (var813 - Statics.field263) / 1000 + Statics.field1666;
                                                                            if (Statics.field263 > var813) {
                                                                                Statics.field263 = var813;
                                                                            }
                                                                        }
                                                                        if (Statics.field263 > var813) {
                                                                            Statics.field263 -= Statics.field1782 * (Statics.field263 - var813) / 1000 + Statics.field1666;
                                                                            if (Statics.field263 < var813) {
                                                                                Statics.field263 = var813;
                                                                            }
                                                                        }
                                                                        int var815 = Statics.field1956 * 128 + 64;
                                                                        int var816 = Statics.field1558 * 128 + 64;
                                                                        int var817 = method560(var815, var816, Statics.field721) - Statics.field193;
                                                                        int var818 = var815 - Statics.field2242;
                                                                        int var819 = var817 - Statics.field1077;
                                                                        int var820 = var816 - Statics.field263;
                                                                        int var821 = (int) Math.sqrt((double) (var818 * var818 + var820 * var820));
                                                                        int var822 = (int) (Math.atan2((double) var819, (double) var821) * 325.949D) & 0x7FF;
                                                                        int var823 = (int) (Math.atan2((double) var818, (double) var820) * -325.949D) & 0x7FF;
                                                                        if (var822 < 128) {
                                                                            var822 = 128;
                                                                        }
                                                                        if (var822 > 383) {
                                                                            var822 = 383;
                                                                        }
                                                                        if (Statics.field1755 < var822) {
                                                                            Statics.field1755 += Statics.field587 * (var822 - Statics.field1755) / 1000 + Statics.field290;
                                                                            if (Statics.field1755 > var822) {
                                                                                Statics.field1755 = var822;
                                                                            }
                                                                        }
                                                                        if (Statics.field1755 > var822) {
                                                                            Statics.field1755 -= Statics.field587 * (Statics.field1755 - var822) / 1000 + Statics.field290;
                                                                            if (Statics.field1755 < var822) {
                                                                                Statics.field1755 = var822;
                                                                            }
                                                                        }
                                                                        int var824 = var823 - Statics.field2214;
                                                                        if (var824 > 1024) {
                                                                            var824 -= 2048;
                                                                        }
                                                                        if (var824 < -1024) {
                                                                            var824 += 2048;
                                                                        }
                                                                        if (var824 > 0) {
                                                                            Statics.field2214 += Statics.field587 * var824 / 1000 + Statics.field290;
                                                                            Statics.field2214 &= 0x7FF;
                                                                        }
                                                                        if (var824 < 0) {
                                                                            Statics.field2214 -= Statics.field587 * -var824 / 1000 + Statics.field290;
                                                                            Statics.field2214 &= 0x7FF;
                                                                        }
                                                                        int var825 = var823 - Statics.field2214;
                                                                        if (var825 > 1024) {
                                                                            var825 -= 2048;
                                                                        }
                                                                        if (var825 < -1024) {
                                                                            var825 += 2048;
                                                                        }
                                                                        if (var825 < 0 && var824 > 0 || var825 > 0 && var824 < 0) {
                                                                            Statics.field2214 = var823;
                                                                        }
                                                                    }
                                                                    for (int var826 = 0; var826 < 5; var826++) {
                                                                        var10002 = field553[var826]++;
                                                                    }
                                                                    Statics.field2045.method211();
                                                                    int var827 = ++class140.field2129 - 1;
                                                                    int var829 = class137.method1072();
                                                                    if (var827 > 15000 && var829 > 15000) {
                                                                        field481 = 250;
                                                                        class140.method988(14500);
                                                                        field341.method2631(188);
                                                                    }
                                                                    field369++;
                                                                    if (field369 > 500) {
                                                                        field369 = 0;
                                                                        int var830 = (int) (Math.random() * 8.0D);
                                                                        if ((var830 & 0x1) == 1) {
                                                                            field319 += field364;
                                                                        }
                                                                        if ((var830 & 0x2) == 2) {
                                                                            field525 += field466;
                                                                        }
                                                                        if ((var830 & 0x4) == 4) {
                                                                            field367 += field368;
                                                                        }
                                                                    }
                                                                    if (field319 < -50) {
                                                                        field364 = 2;
                                                                    }
                                                                    if (field319 > 50) {
                                                                        field364 = -2;
                                                                    }
                                                                    if (field525 < -55) {
                                                                        field466 = 2;
                                                                    }
                                                                    if (field525 > 55) {
                                                                        field466 = -2;
                                                                    }
                                                                    if (field367 < -40) {
                                                                        field368 = 1;
                                                                    }
                                                                    if (field367 > 40) {
                                                                        field368 = -1;
                                                                    }
                                                                    field374++;
                                                                    if (field374 > 500) {
                                                                        field374 = 0;
                                                                        int var831 = (int) (Math.random() * 8.0D);
                                                                        if ((var831 & 0x1) == 1) {
                                                                            field370 += field371;
                                                                        }
                                                                        if ((var831 & 0x2) == 2) {
                                                                            field582 += field373;
                                                                        }
                                                                    }
                                                                    if (field370 < -60) {
                                                                        field371 = 2;
                                                                    }
                                                                    if (field370 > 60) {
                                                                        field371 = -2;
                                                                    }
                                                                    if (field582 < -20) {
                                                                        field373 = 1;
                                                                    }
                                                                    if (field582 > 10) {
                                                                        field373 = -1;
                                                                    }
                                                                    for (class39 var832 = (class39) field528.method3563(); var832 != null; var832 = (class39) field528.method3565()) {
                                                                        if ((long) var832.field882 < class115.method2082() / 1000L - 5L) {
                                                                            if (var832.field878 > 0) {
                                                                                class12.method974(5, "", var832.field879 + class157.field2451);
                                                                            }
                                                                            if (var832.field878 == 0) {
                                                                                class12.method974(5, "", var832.field879 + class157.field2452);
                                                                            }
                                                                            var832.method3707();
                                                                        }
                                                                    }
                                                                    field347++;
                                                                    if (field347 > 50) {
                                                                        field341.method2631(179);
                                                                    }
                                                                    try {
                                                                        if (Statics.field701 != null && field341.field1973 > 0) {
                                                                            Statics.field701.method2884(field341.field1978, 0, field341.field1973);
                                                                            field341.field1973 = 0;
                                                                            field347 = 0;
                                                                            return;
                                                                        }
                                                                    } catch (IOException var834) {
                                                                        method4();
                                                                    }
                                                                    return;
                                                                }
                                                                var748 = var747.field3;
                                                                if (var748.field2735 < 0) {
                                                                    break;
                                                                }
                                                                var749 = class173.method2977(var748.field2786);
                                                            } while (var749 == null || var749.field2854 == null || var748.field2735 >= var749.field2854.length || var749.field2854[var748.field2735] != var748);
                                                            class37.method2681(var747, 200000);
                                                        }
                                                    }
                                                    var745 = var744.field3;
                                                    if (var745.field2735 < 0) {
                                                        break;
                                                    }
                                                    var746 = class173.method2977(var745.field2786);
                                                } while (var746 == null || var746.field2854 == null || var745.field2735 >= var746.field2854.length || var746.field2854[var745.field2735] != var745);
                                                class37.method2681(var744, 200000);
                                            }
                                        }
                                        var742 = var741.field3;
                                        if (var742.field2735 < 0) {
                                            break;
                                        }
                                        var743 = class173.method2977(var742.field2786);
                                    } while (var743 == null || var743.field2854 == null || var742.field2735 >= var743.field2854.length || var743.field2854[var742.field2735] != var742);
                                    class37.method2681(var741, 200000);
                                }
                            }
                        }
                    }
                }
            }
        } else if (field304 == 40 || field304 == 45) {
            method2330();
        }
    }

    @ObfuscatedName("client.s(B)V")
    public final void method238() {
        boolean var1 = class183.method1492();
        if (var1 && field538 && Statics.field1357 != null) {
            Statics.field1357.method1167();
        }
        if (field304 == 10 || field304 == 20 || field304 == 30) {
            if (field512 != 0L && class115.method2082() > field512) {
                method2335(method724());
            } else if (field2191) {
                method2979();
            }
        }
        Dimension var2 = this.method2901();
        if (Statics.field1196 != var2.width || Statics.field2622 != var2.height || field2194) {
            method1595();
            field512 = class115.method2082() + 500L;
            field2194 = false;
        }
        boolean var3 = false;
        if (field2183) {
            field2183 = false;
            var3 = true;
            for (int var4 = 0; var4 < 100; var4++) {
                field504[var4] = true;
            }
        }
        if (var3) {
            method45();
        }
        if (field304 == 0) {
            class144.method2160(class32.field744, class32.field745, (Color) null, var3);
        } else if (field304 == 5) {
            class32.method587(Statics.field175, Statics.field353, Statics.field25, var3);
        } else if (field304 == 10 || field304 == 11) {
            class32.method587(Statics.field175, Statics.field353, Statics.field25, var3);
        } else if (field304 == 20) {
            class32.method587(Statics.field175, Statics.field353, Statics.field25, var3);
        } else if (field304 == 25) {
            if (field358 == 1) {
                if (field354 > field355) {
                    field355 = field354;
                }
                int var5 = (field355 * 50 - field354 * 50) / field355;
                method953(class157.field2313 + class2.field22 + class2.field19 + var5 + "%" + class2.field20, false);
            } else if (field358 == 2) {
                if (field579 > field357) {
                    field357 = field579;
                }
                int var6 = (field357 * 50 - field579 * 50) / field357 + 50;
                method953(class157.field2313 + class2.field22 + class2.field19 + var6 + "%" + class2.field20, false);
            } else {
                method953(class157.field2313, false);
            }
        } else if (field304 == 30) {
            method2062();
        } else if (field304 == 40) {
            method953(class157.field2484 + class2.field22 + class157.field2306, false);
        } else if (field304 == 45) {
            method953(class157.field2346, false);
        }
        if (field304 == 30 && field511 == 0 && !var3) {
            try {
                Graphics var7 = Statics.field2897.getGraphics();
                for (int var8 = 0; var8 < field502; var8++) {
                    if (field442[var8]) {
                        Statics.field2075.method1556(var7, field402[var8], field508[var8], field509[var8], field510[var8]);
                        field442[var8] = false;
                    }
                }
            } catch (Exception var14) {
                Statics.field2897.repaint();
            }
        } else if (field304 > 0) {
            try {
                Graphics var10 = Statics.field2897.getGraphics();
                Statics.field2075.method1520(var10, 0, 0);
                for (int var11 = 0; var11 < field502; var11++) {
                    field442[var11] = false;
                }
            } catch (Exception var13) {
                Statics.field2897.repaint();
            }
        }
    }

    @ObfuscatedName("client.k(I)V")
    public final void method239() {
        if (Statics.field2045.method212()) {
            Statics.field2045.method205();
        }
        if (Statics.field1999 != null) {
            Statics.field1999.field200 = false;
        }
        Statics.field1999 = null;
        if (Statics.field701 != null) {
            Statics.field701.method2865();
            Statics.field701 = null;
        }
        if (class137.field2107 != null) {
            class137 var1 = class137.field2107;
            synchronized (class137.field2107) {
                class137.field2107 = null;
            }
        }
        class140.method1060();
        Statics.field2278 = null;
        if (Statics.field1357 != null) {
            Statics.field1357.method1164();
        }
        if (Statics.field666 != null) {
            Statics.field666.method1164();
        }
        class171.method3720();
        Object var3 = class170.field2693;
        synchronized (class170.field2693) {
            if (class170.field2690 != 0) {
                class170.field2690 = 1;
                try {
                    class170.field2693.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        class149.method2261();
    }

    @ObfuscatedName("dp.b(II)V")
    public static void method2652(int arg0) {
        if (field304 == arg0) {
            return;
        }
        if (field304 == 0) {
            class144.method2257();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field365 = 0;
            field330 = 0;
            field486 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field340 != null) {
            Statics.field340.method2865();
            Statics.field340 = null;
        }
        if (field304 == 25) {
            field358 = 0;
            field354 = 0;
            field355 = 1;
            field579 = 0;
            field357 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            Statics.method824(Statics.field2897, Statics.field327, Statics.field642, true, 0);
        } else if (arg0 == 20) {
            Statics.method824(Statics.field2897, Statics.field327, Statics.field642, true, field304 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            Statics.method824(Statics.field2897, Statics.field327, Statics.field642, false, 4);
        } else if (Statics.field758) {
            Statics.field759 = null;
            Statics.field735 = null;
            Statics.field3108 = null;
            Statics.field886 = null;
            Statics.field87 = null;
            Statics.field2687 = null;
            Statics.field77 = null;
            Statics.field287 = null;
            Statics.field80 = null;
            Statics.field1604 = null;
            Statics.field1373 = null;
            Statics.field288 = null;
            Statics.field208 = null;
            Statics.field239 = null;
            Statics.field143 = null;
            Statics.field10 = null;
            Statics.field1095 = null;
            Statics.field2878 = null;
            Statics.field727 = null;
            Statics.field59 = null;
            Statics.field184 = null;
            Statics.field687 = null;
            class183.field2927 = 1;
            Statics.field174 = null;
            Statics.field1762 = -1;
            Statics.field697 = -1;
            Statics.field3107 = 0;
            Statics.field2068 = false;
            Statics.field28 = 2;
            class171.method2858(true);
            Statics.field758 = false;
        }
        field304 = arg0;
    }

    @ObfuscatedName("client.c(B)V")
    public void method240() {
        if (field304 != 1000) {
            boolean var1 = class171.method5();
            if (!var1) {
                this.method241();
            }
        }
    }

    @ObfuscatedName("client.l(I)V")
    public void method241() {
        if (class171.field2712 >= 4) {
            this.method2894("js5crc");
            field304 = 1000;
            return;
        }
        if (class171.field2703 >= 4) {
            if (field304 <= 5) {
                this.method2894("js5io");
                field304 = 1000;
                return;
            }
            field325 = 3000;
            class171.field2703 = 3;
        }
        if (--field325 + 1 > 0) {
            return;
        }
        try {
            if (field580 == 0) {
                Statics.field139 = Statics.field2158.method2765(Statics.field1094, Statics.field334);
                field580++;
            }
            if (field580 == 1) {
                if (Statics.field139.field2200 == 2) {
                    this.method242(-1);
                    return;
                }
                if (Statics.field139.field2200 == 1) {
                    field580++;
                }
            }
            if (field580 == 2) {
                Statics.field1218 = new class143((Socket) Statics.field139.field2204, Statics.field2158);
                class119 var1 = new class119(5);
                var1.method2499(15);
                var1.method2556(93);
                Statics.field1218.method2884(var1.field1978, 0, 5);
                field580++;
                Statics.field76 = class115.method2082();
            }
            if (field580 == 3) {
                if (field304 <= 5 || Statics.field1218.method2870() > 0) {
                    int var2 = Statics.field1218.method2867();
                    if (var2 != 0) {
                        this.method242(var2);
                        return;
                    }
                    field580++;
                } else if (class115.method2082() - Statics.field76 > 30000L) {
                    this.method242(-2);
                    return;
                }
            }
            if (field580 == 4) {
                class143 var3 = Statics.field1218;
                boolean var4 = field304 > 20;
                if (Statics.field2713 != null) {
                    try {
                        Statics.field2713.method2865();
                    } catch (Exception var14) {
                    }
                    Statics.field2713 = null;
                }
                Statics.field2713 = var3;
                class171.method2858(var4);
                class171.field2707.field1973 = 0;
                Statics.field1611 = null;
                Statics.field1971 = null;
                class171.field2708 = 0;
                while (true) {
                    class172 var6 = (class172) class171.field2700.method3577();
                    if (var6 == null) {
                        while (true) {
                            class172 var7 = (class172) class171.field2705.method3577();
                            if (var7 == null) {
                                if (class171.field2711 != 0) {
                                    try {
                                        class119 var8 = new class119(4);
                                        var8.method2499(4);
                                        var8.method2499(class171.field2711);
                                        var8.method2369(0);
                                        Statics.field2713.method2884(var8.field1978, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2713.method2865();
                                        } catch (Exception var12) {
                                        }
                                        class171.field2703++;
                                        Statics.field2713 = null;
                                    }
                                }
                                class171.field2699 = 0;
                                Statics.field84 = class115.method2082();
                                Statics.field139 = null;
                                Statics.field1218 = null;
                                field580 = 0;
                                field393 = 0;
                                return;
                            }
                            class171.field2702.method3669(var7);
                            class171.field2701.method3575(var7, var7.field3093);
                            class171.field2704++;
                            class171.field2706--;
                        }
                    }
                    class171.field2696.method3575(var6, var6.field3093);
                    class171.field2697++;
                    class171.field2698--;
                }
            }
        } catch (IOException var15) {
            this.method242(-3);
        }
    }

    @ObfuscatedName("client.p(IB)V")
    public void method242(int arg0) {
        Statics.field139 = null;
        Statics.field1218 = null;
        field580 = 0;
        if (Statics.field392 == Statics.field334) {
            Statics.field334 = Statics.field64;
        } else {
            Statics.field334 = Statics.field392;
        }
        field393++;
        if (field393 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field304 <= 5) {
                this.method2894("js5connect_full");
                field304 = 1000;
            } else {
                field325 = 3000;
            }
        } else if (field393 >= 2 && arg0 == 6) {
            this.method2894("js5connect_outofdate");
            field304 = 1000;
        } else if (field393 >= 4) {
            if (field304 <= 5) {
                this.method2894("js5connect");
                field304 = 1000;
            } else {
                field325 = 3000;
            }
        }
    }

    @ObfuscatedName("de.d(I)V")
    public static void method2262() {
        if (field323 == 0) {
            Statics.field649 = new class86(4, 104, 104, class6.field89);
            for (int var0 = 0; var0 < 4; var0++) {
                field554[var0] = new class108(104, 104);
            }
            Statics.field1873 = new class79(512, 512);
            class32.field745 = class157.field2316;
            class32.field744 = 5;
            field323 = 20;
        } else if (field323 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class91.field1585[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class86.method1945(var1, 500, 800, 512, 334);
            class32.field745 = class157.field2317;
            class32.field744 = 10;
            field323 = 30;
        } else if (field323 == 30) {
            Statics.field980 = method1516(0, false, true, true);
            Statics.field69 = method1516(1, false, true, true);
            Statics.field83 = method1516(2, true, false, true);
            Statics.field926 = method1516(3, false, true, true);
            Statics.field1897 = method1516(4, false, true, true);
            Statics.field2153 = method1516(5, true, true, true);
            Statics.field2019 = method1516(6, true, true, false);
            Statics.field2287 = method1516(7, false, true, true);
            Statics.field642 = method1516(8, false, true, true);
            Statics.field517 = method1516(9, false, true, true);
            Statics.field327 = method1516(10, false, true, true);
            Statics.field1768 = method1516(11, false, true, true);
            Statics.field219 = method1516(12, false, true, true);
            Statics.field221 = method1516(13, true, false, true);
            Statics.field2248 = method1516(14, false, true, false);
            Statics.field3196 = method1516(15, false, true, true);
            class32.field745 = class157.field2318;
            class32.field744 = 20;
            field323 = 40;
        } else if (field323 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field980.method3169() * 4 / 100;
            int var8 = var7 + Statics.field69.method3169() * 4 / 100;
            int var9 = var8 + Statics.field83.method3169() * 2 / 100;
            int var10 = var9 + Statics.field926.method3169() * 2 / 100;
            int var11 = var10 + Statics.field1897.method3169() * 6 / 100;
            int var12 = var11 + Statics.field2153.method3169() * 4 / 100;
            int var13 = var12 + Statics.field2019.method3169() * 2 / 100;
            int var14 = var13 + Statics.field2287.method3169() * 60 / 100;
            int var15 = var14 + Statics.field642.method3169() * 2 / 100;
            int var16 = var15 + Statics.field517.method3169() * 2 / 100;
            int var17 = var16 + Statics.field327.method3169() * 2 / 100;
            int var18 = var17 + Statics.field1768.method3169() * 2 / 100;
            int var19 = var18 + Statics.field219.method3169() * 2 / 100;
            int var20 = var19 + Statics.field221.method3169() * 2 / 100;
            int var21 = var20 + Statics.field2248.method3169() * 2 / 100;
            int var22 = var21 + Statics.field3196.method3169() * 2 / 100;
            if (var22 == 100) {
                class32.field745 = class157.field2320;
                class32.field744 = 30;
                field323 = 45;
            } else {
                if (var22 != 0) {
                    class32.field745 = class157.field2319 + var22 + "%";
                }
                class32.field744 = 30;
            }
        } else if (field323 == 45) {
            boolean var23 = !field301;
            Statics.field1189 = 22050;
            Statics.field3098 = var23;
            Statics.field1175 = 2;
            class184 var24 = new class184();
            var24.method3515(9, 128);
            Statics.field1357 = Statics.method917(Statics.field2158, Statics.field2897, 0, 22050);
            Statics.field1357.method1195(var24);
            class168 var25 = Statics.field3196;
            class168 var26 = Statics.field2248;
            class168 var27 = Statics.field1897;
            Statics.field2928 = var25;
            Statics.field2925 = var26;
            Statics.field605 = var27;
            Statics.field2926 = var24;
            Statics.field666 = Statics.method917(Statics.field2158, Statics.field2897, 1, 2048);
            Statics.field645 = new class56();
            Statics.field666.method1195(Statics.field645);
            Statics.field12 = new class75(22050, Statics.field1189);
            class32.field745 = class157.field2321;
            class32.field744 = 35;
            field323 = 50;
        } else if (field323 == 50) {
            int var28 = 0;
            if (Statics.field353 == null) {
                Statics.field353 = class77.method22(Statics.field642, Statics.field221, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field25 == null) {
                Statics.field25 = class77.method22(Statics.field642, Statics.field221, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field175 == null) {
                Statics.field175 = class77.method22(Statics.field642, Statics.field221, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class32.field745 = class157.field2322 + var28 * 100 / 3 + "%";
                class32.field744 = 40;
            } else {
                Statics.field790 = new class160(true);
                class32.field745 = class157.field2544;
                class32.field744 = 40;
                field323 = 60;
            }
        } else if (field323 == 60) {
            int var29 = class32.method2980(Statics.field327, Statics.field642);
            int var30 = class32.method691();
            if (var29 < var30) {
                class32.field745 = class157.field2324 + var29 * 100 / var30 + "%";
                class32.field744 = 50;
            } else {
                class32.field745 = class157.field2325;
                class32.field744 = 50;
                method2652(5);
                field323 = 70;
            }
        } else if (field323 == 70) {
            if (Statics.field83.method3086()) {
                class168 var31 = Statics.field83;
                Statics.field1055 = var31;
                class168 var32 = Statics.field83;
                Statics.field3146 = var32;
                class45.method584(Statics.field83, Statics.field2287);
                class168 var33 = Statics.field83;
                class168 var34 = Statics.field2287;
                boolean var35 = field301;
                Statics.field3139 = var33;
                Statics.field929 = var34;
                class41.field935 = var35;
                Statics.method2988(Statics.field83, Statics.field2287);
                class168 var36 = Statics.field83;
                class168 var37 = Statics.field2287;
                boolean var38 = field300;
                class224 var39 = Statics.field353;
                Statics.field1107 = var36;
                Statics.field1631 = var37;
                Statics.field681 = var38;
                Statics.field1137 = Statics.field1107.method3092(10);
                Statics.field2050 = var39;
                class168 var40 = Statics.field83;
                class168 var41 = Statics.field980;
                class168 var42 = Statics.field69;
                Statics.field1010 = var40;
                Statics.field1001 = var41;
                Statics.field999 = var42;
                class168 var43 = Statics.field83;
                class168 var44 = Statics.field2287;
                Statics.field1016 = var43;
                Statics.field1025 = var44;
                class168 var45 = Statics.field83;
                Statics.field1076 = var45;
                class53.method942(Statics.field83);
                class168 var46 = Statics.field926;
                class168 var47 = Statics.field2287;
                class168 var48 = Statics.field642;
                class168 var49 = Statics.field221;
                Statics.field2852 = var46;
                Statics.field2821 = var47;
                Statics.field2285 = var48;
                Statics.field2738 = var49;
                Statics.field2791 = new class173[Statics.field2852.method3083()][];
                Statics.field2721 = new boolean[Statics.field2852.method3083()];
                class168 var50 = Statics.field83;
                Statics.field2882 = var50;
                class49.method173(Statics.field83);
                class46.method716(Statics.field83);
                class50.method707(Statics.field83);
                Statics.field2045 = new class20();
                class32.field745 = class157.field2418;
                class32.field744 = 60;
                field323 = 80;
            } else {
                class32.field745 = class157.field2326 + Statics.field83.method3168() + "%";
                class32.field744 = 60;
            }
        } else if (field323 == 80) {
            int var51 = 0;
            if (Statics.field1527 == null) {
                Statics.field1527 = class77.method1073(Statics.field642, "compass", "");
            } else {
                var51++;
            }
            if (Statics.field3046 == null) {
                class168 var52 = Statics.field642;
                int var53 = var52.method3084("mapedge");
                int var54 = var52.method3076(var53, "");
                class79 var55 = class77.method960(var52, var53, var54);
                Statics.field3046 = var55;
            } else {
                var51++;
            }
            if (Statics.field1103 == null) {
                Statics.field1103 = class77.method1490(Statics.field642, "mapscene", "");
            } else {
                var51++;
            }
            if (Statics.field285 == null) {
                Statics.field285 = class77.method553(Statics.field642, "mapfunction", "");
            } else {
                var51++;
            }
            if (Statics.field218 == null) {
                Statics.field218 = class77.method553(Statics.field642, "hitmarks", "");
            } else {
                var51++;
            }
            if (Statics.field197 == null) {
                Statics.field197 = class77.method553(Statics.field642, "headicons_pk", "");
            } else {
                var51++;
            }
            if (Statics.field1045 == null) {
                Statics.field1045 = class77.method553(Statics.field642, "headicons_prayer", "");
            } else {
                var51++;
            }
            if (Statics.field2961 == null) {
                Statics.field2961 = class77.method553(Statics.field642, "headicons_hint", "");
            } else {
                var51++;
            }
            if (Statics.field376 == null) {
                Statics.field376 = class77.method553(Statics.field642, "mapmarker", "");
            } else {
                var51++;
            }
            if (Statics.field377 == null) {
                Statics.field377 = class77.method553(Statics.field642, "cross", "");
            } else {
                var51++;
            }
            if (Statics.field1985 == null) {
                Statics.field1985 = class77.method553(Statics.field642, "mapdots", "");
            } else {
                var51++;
            }
            if (Statics.field927 == null) {
                Statics.field927 = class77.method1490(Statics.field642, "scrollbar", "");
            } else {
                var51++;
            }
            if (Statics.field206 == null) {
                Statics.field206 = class77.method1490(Statics.field642, "mod_icons", "");
            } else {
                var51++;
            }
            if (var51 < 13) {
                class32.field745 = class157.field2328 + var51 * 100 / 13 + "%";
                class32.field744 = 70;
            } else {
                Statics.field3173 = Statics.field206;
                Statics.field3046.method1603();
                int var56 = (int) (Math.random() * 21.0D) - 10;
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 21.0D) - 10;
                int var59 = (int) (Math.random() * 41.0D) - 20;
                for (int var60 = 0; var60 < Statics.field285.length; var60++) {
                    Statics.field285[var60].method1602(var56 + var59, var57 + var59, var58 + var59);
                }
                Statics.field1103[0].method1761(var56 + var59, var57 + var59, var58 + var59);
                class32.field745 = class157.field2329;
                class32.field744 = 70;
                field323 = 90;
            }
        } else if (field323 == 90) {
            if (Statics.field517.method3086()) {
                class95 var61 = new class95(Statics.field517, Statics.field642, 20, 0.8D, field301 ? 64 : 128);
                class91.method1982(var61);
                class91.method1983(0.8D);
                class32.field745 = class157.field2331;
                class32.field744 = 90;
                field323 = 110;
            } else {
                class32.field745 = class157.field2434 + Statics.field517.method3168() + "%";
                class32.field744 = 90;
            }
        } else if (field323 == 110) {
            Statics.field1999 = new class14();
            Statics.field2158.method2780(Statics.field1999, 10);
            class32.field745 = class157.field2332;
            class32.field744 = 94;
            field323 = 120;
        } else if (field323 == 120) {
            if (Statics.field327.method3098("huffman", "")) {
                class113 var62 = new class113(Statics.field327.method3089("huffman", ""));
                class222.method1535(var62);
                class32.field745 = class157.field2486;
                class32.field744 = 96;
                field323 = 130;
            } else {
                class32.field745 = class157.field2333 + "%";
                class32.field744 = 96;
            }
        } else if (field323 == 130) {
            if (!Statics.field926.method3086()) {
                class32.field745 = class157.field2335 + Statics.field926.method3168() * 4 / 5 + "%";
                class32.field744 = 100;
            } else if (!Statics.field219.method3086()) {
                class32.field745 = class157.field2335 + (80 + Statics.field219.method3168() / 6) + "%";
                class32.field744 = 100;
            } else if (Statics.field221.method3086()) {
                class32.field745 = class157.field2367;
                class32.field744 = 100;
                field323 = 140;
            } else {
                class32.field745 = class157.field2335 + (96 + Statics.field221.method3168() / 20) + "%";
                class32.field744 = 100;
            }
        } else if (field323 == 140) {
            method2652(10);
        }
    }

    @ObfuscatedName("bw.i(IZZZI)Lff;")
    public static class168 method1516(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class134 var4 = null;
        if (class149.field2225 != null) {
            var4 = new class134(arg0, class149.field2225, Statics.field68[arg0], 1000000);
        }
        return new class168(var4, Statics.field676, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dt.x(B)V")
    public static final void method2330() {
        try {
            if (field365 == 0) {
                if (Statics.field701 != null) {
                    Statics.field701.method2865();
                    Statics.field701 = null;
                }
                Statics.field618 = null;
                field352 = false;
                field330 = 0;
                field365 = 1;
            }
            if (field365 == 1) {
                if (Statics.field618 == null) {
                    Statics.field618 = Statics.field2158.method2765(Statics.field1094, Statics.field334);
                }
                if (Statics.field618.field2200 == 2) {
                    throw new IOException();
                }
                if (Statics.field618.field2200 == 1) {
                    Statics.field701 = new class143((Socket) Statics.field618.field2204, Statics.field2158);
                    Statics.field618 = null;
                    field365 = 2;
                }
            }
            if (field365 == 2) {
                field341.field1973 = 0;
                field341.method2499(14);
                Statics.field701.method2884(field341.field1978, 0, 1);
                field333.field1973 = 0;
                field365 = 3;
            }
            if (field365 == 3) {
                if (Statics.field1357 != null) {
                    Statics.field1357.method1175();
                }
                if (Statics.field666 != null) {
                    Statics.field666.method1175();
                }
                int var0 = Statics.field701.method2867();
                if (Statics.field1357 != null) {
                    Statics.field1357.method1175();
                }
                if (Statics.field666 != null) {
                    Statics.field666.method1175();
                }
                if (var0 != 0) {
                    method158(var0);
                    return;
                }
                field333.field1973 = 0;
                field365 = 5;
            }
            if (field365 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field341.field1973 = 0;
                field341.method2499(1);
                field341.method2499(class32.field752.method554());
                field341.method2556(var1[0]);
                field341.method2556(var1[1]);
                field341.method2556(var1[2]);
                field341.method2556(var1[3]);
                switch(class32.field752.field2589) {
                    case 0:
                        field341.field1973 += 8;
                        break;
                    case 1:
                    case 2:
                        field341.method2413(Statics.field2865);
                        field341.field1973 += 5;
                        break;
                    case 3:
                        field341.method2556((Integer) Statics.field2871.field155.get(class163.method2327(class32.field750)));
                        field341.field1973 += 4;
                }
                field341.method2374(class32.field751);
                field341.method2403(class5.field81, class5.field74);
                field342.field1973 = 0;
                if (field304 == 40) {
                    field342.method2499(18);
                } else {
                    field342.method2499(16);
                }
                field342.method2369(0);
                int var2 = field342.field1973;
                field342.method2556(93);
                field342.method2377(field341.field1978, 0, field341.field1973);
                int var3 = field342.field1973;
                field342.method2374(class32.field750);
                field342.method2499((field513 ? 1 : 0) << 1 | (field301 ? 1 : 0));
                field342.method2369(Statics.field2115);
                field342.method2369(Statics.field705);
                class149.method889(field342);
                field342.method2374(Statics.field13);
                field342.method2556(Statics.field1882);
                class119 var4 = new class119(Statics.field790.method3000());
                Statics.field790.method2999(var4);
                field342.method2377(var4.field1978, 0, var4.field1978.length);
                field342.method2499(Statics.field409);
                field342.method2556(Statics.field980.field2667);
                field342.method2556(Statics.field69.field2667);
                field342.method2556(Statics.field83.field2667);
                field342.method2556(Statics.field926.field2667);
                field342.method2556(Statics.field1897.field2667);
                field342.method2556(Statics.field2153.field2667);
                field342.method2556(Statics.field2019.field2667);
                field342.method2556(Statics.field2287.field2667);
                field342.method2556(Statics.field642.field2667);
                field342.method2556(Statics.field517.field2667);
                field342.method2556(Statics.field327.field2667);
                field342.method2556(Statics.field1768.field2667);
                field342.method2556(Statics.field219.field2667);
                field342.method2556(Statics.field221.field2667);
                field342.method2556(Statics.field2248.field2667);
                field342.method2556(Statics.field3196.field2667);
                field342.method2401(var1, var3, field342.field1973);
                field342.method2379(field342.field1973 - var2);
                Statics.field701.method2884(field342.field1978, 0, field342.field1973);
                field341.method2634(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field333.method2634(var1);
                field365 = 6;
            }
            if (field365 == 6 && Statics.field701.method2870() > 0) {
                int var6 = Statics.field701.method2867();
                if (var6 == 21 && field304 == 20) {
                    field365 = 7;
                } else if (var6 == 2) {
                    field365 = 9;
                } else if (var6 == 15 && field304 == 40) {
                    field344 = -1;
                    field365 = 13;
                } else if (var6 == 23 && field486 < 1) {
                    field486++;
                    field365 = 0;
                } else if (var6 == 29) {
                    field365 = 11;
                } else {
                    method158(var6);
                    return;
                }
            }
            if (field365 == 7 && Statics.field701.method2870() > 0) {
                field469 = (Statics.field701.method2867() + 3) * 60;
                field365 = 8;
            }
            if (field365 == 8) {
                field330 = 0;
                class32.method2171(class157.field2340, class157.field2341, field469 / 60 + class157.field2342);
                if (--field469 <= 0) {
                    field365 = 0;
                }
            } else {
                if (field365 == 9 && Statics.field701.method2870() >= 13) {
                    boolean var7 = Statics.field701.method2867() == 1;
                    Statics.field701.method2869(field333.field1978, 0, 4);
                    field333.field1973 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field333.method2632() << 24;
                        int var10 = var9 | field333.method2632() << 16;
                        int var11 = var10 | field333.method2632() << 8;
                        int var12 = var11 | field333.method2632();
                        int var13 = class163.method2327(class32.field750);
                        if (Statics.field2871.field155.size() >= 10 && !Statics.field2871.field155.containsKey(var13)) {
                            Iterator var14 = Statics.field2871.field155.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field2871.field155.put(var13, var12);
                        class9.method2589();
                    }
                    field453 = Statics.field701.method2867();
                    field468 = Statics.field701.method2867() == 1;
                    field422 = Statics.field701.method2867();
                    field422 <<= 0x8;
                    field422 += Statics.field701.method2867();
                    field423 = Statics.field701.method2867();
                    Statics.field701.method2869(field333.field1978, 0, 1);
                    field333.field1973 = 0;
                    field345 = field333.method2632();
                    Statics.field701.method2869(field333.field1978, 0, 2);
                    field333.field1973 = 0;
                    field344 = field333.method2385();
                    if (field423 == 1) {
                        try {
                            client var15 = Statics.field2881;
                            JSObject.getWindow(var15).call("zap", (Object[]) null);
                        } catch (Throwable var29) {
                        }
                    } else {
                        try {
                            client var17 = Statics.field2881;
                            JSObject.getWindow(var17).call("unzap", (Object[]) null);
                        } catch (Throwable var28) {
                        }
                    }
                    field365 = 10;
                }
                if (field365 != 10) {
                    if (field365 == 11 && Statics.field701.method2870() >= 2) {
                        field333.field1973 = 0;
                        Statics.field701.method2869(field333.field1978, 0, 2);
                        field333.field1973 = 0;
                        Statics.field210 = field333.method2385();
                        field365 = 12;
                    }
                    if (field365 == 12 && Statics.field701.method2870() >= Statics.field210) {
                        field333.field1973 = 0;
                        Statics.field701.method2869(field333.field1978, 0, Statics.field210);
                        field333.field1973 = 0;
                        String var19 = field333.method2391();
                        String var20 = field333.method2391();
                        String var21 = field333.method2391();
                        class32.method2171(var19, var20, var21);
                        method2652(10);
                    }
                    if (field365 == 13) {
                        if (field344 == -1) {
                            if (Statics.field701.method2870() < 2) {
                                return;
                            }
                            Statics.field701.method2869(field333.field1978, 0, 2);
                            field333.field1973 = 0;
                            field344 = field333.method2385();
                        }
                        if (Statics.field701.method2870() >= field344) {
                            Statics.field701.method2869(field333.field1978, 0, field344);
                            field333.field1973 = 0;
                            int var22 = field344;
                            field341.field1973 = 0;
                            field333.field1973 = 0;
                            field345 = -1;
                            field362 = -1;
                            field349 = -1;
                            field372 = -1;
                            field344 = 0;
                            field346 = 0;
                            field313 = 0;
                            field440 = 0;
                            field439 = false;
                            field535 = 0;
                            field533 = 0;
                            for (int var23 = 0; var23 < 2048; var23++) {
                                field421[var23] = null;
                            }
                            Statics.field101 = null;
                            for (int var24 = 0; var24 < field322.length; var24++) {
                                class35 var25 = field322[var24];
                                if (var25 != null) {
                                    var25.field841 = -1;
                                    var25.field842 = false;
                                }
                            }
                            class16.method161();
                            method2652(30);
                            for (int var26 = 0; var26 < 100; var26++) {
                                field504[var26] = true;
                            }
                            field341.method2631(133);
                            field341.method2499(method724());
                            field341.method2369(Statics.field2115);
                            field341.method2369(Statics.field705);
                            class33.method1247(field333);
                            if (field333.field1973 != var22) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field330++;
                        if (field330 > 2000) {
                            if (field486 < 1) {
                                if (Statics.field392 == Statics.field334) {
                                    Statics.field334 = Statics.field64;
                                } else {
                                    Statics.field334 = Statics.field392;
                                }
                                field486++;
                                field365 = 0;
                            } else {
                                method158(-3);
                            }
                        }
                    }
                } else if (Statics.field701.method2870() >= field344) {
                    field333.field1973 = 0;
                    Statics.field701.method2869(field333.field1978, 0, field344);
                    method2061();
                    class33.method1247(field333);
                    Statics.field166 = -1;
                    method2304(false);
                    field345 = -1;
                }
            }
        } catch (IOException var30) {
            if (field486 < 1) {
                if (Statics.field392 == Statics.field334) {
                    Statics.field334 = Statics.field64;
                } else {
                    Statics.field334 = Statics.field392;
                }
                field486++;
                field365 = 0;
            } else {
                method158(-2);
            }
        }
    }

    @ObfuscatedName("ct.j(I)V")
    public static void method2061() {
        field501 = 1L;
        field539 = -1;
        Statics.field1999.field203 = 0;
        Statics.field3123 = true;
        field343 = true;
        field425 = -1L;
        class211.field3110 = new class202();
        field341.field1973 = 0;
        field333.field1973 = 0;
        field345 = -1;
        field362 = -1;
        field349 = -1;
        field372 = -1;
        field346 = 0;
        field313 = 0;
        field481 = 0;
        field475 = 0;
        field440 = 0;
        field439 = false;
        class140.method988(0);
        class12.field180.clear();
        class12.field182.method3595();
        class12.field181.method3643();
        class12.field179 = 0;
        field451 = 0;
        field454 = false;
        field542 = 0;
        field319 = (int) (Math.random() * 100.0D) - 50;
        field525 = (int) (Math.random() * 110.0D) - 55;
        field367 = (int) (Math.random() * 80.0D) - 40;
        field370 = (int) (Math.random() * 120.0D) - 60;
        field582 = (int) (Math.random() * 30.0D) - 20;
        field385 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field535 = 0;
        field540 = -1;
        field533 = 0;
        field534 = 0;
        field457 = class21.field594;
        field336 = 0;
        class33.field774 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class33.field767[var0] = null;
            class33.field766[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field421[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field322[var2] = null;
        }
        field464 = -1;
        field566.method3608();
        field434.method3608();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field431[var3][var4][var5] = null;
                }
            }
        }
        field432 = new class199();
        field568 = 0;
        field578 = 0;
        field356 = 0;
        for (int var6 = 0; var6 < Statics.field1167; var6++) {
            class53 var7 = class53.method989(var6);
            if (var7 != null) {
                class176.field2877[var6] = 0;
                class176.field2879[var6] = 0;
            }
        }
        Statics.field2045.method219();
        field363 = -1;
        if (field416 != -1) {
            class173.method2627(field416);
        }
        for (class4 var8 = (class4) field460.method3577(); var8 != null; var8 = (class4) field460.method3578()) {
            method200(var8, true);
        }
        field416 = -1;
        field460 = new class196(8);
        field463 = null;
        field439 = false;
        field440 = 0;
        field573.method3303((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field316[var9] = null;
            field366[var9] = false;
        }
        class16.method161();
        field315 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field504[var10] = true;
        }
        field341.method2631(133);
        field341.method2499(method724());
        field341.method2369(Statics.field2115);
        field341.method2369(Statics.field705);
        field526 = null;
        Statics.field75 = 0;
        Statics.field137 = null;
        for (int var11 = 0; var11 < 8; var11++) {
            field576[var11] = new class220();
        }
        Statics.field229 = null;
    }

    @ObfuscatedName("p.w(IB)V")
    public static void method158(int arg0) {
        if (arg0 == -3) {
            class32.method2171(class157.field2343, class157.field2531, class157.field2504);
        } else if (arg0 == -2) {
            class32.method2171(class157.field2568, class157.field2347, class157.field2348);
        } else if (arg0 == -1) {
            class32.method2171(class157.field2349, class157.field2419, class157.field2369);
        } else if (arg0 == 3) {
            class32.method2171(class157.field2453, class157.field2353, class157.field2354);
        } else if (arg0 == 4) {
            class32.method2171(class157.field2355, class157.field2356, class157.field2357);
        } else if (arg0 == 5) {
            class32.method2171(class157.field2358, class157.field2359, class157.field2444);
        } else if (arg0 == 6) {
            class32.method2171(class157.field2361, class157.field2362, class157.field2363);
        } else if (arg0 == 7) {
            class32.method2171(class157.field2364, class157.field2365, class157.field2366);
        } else if (arg0 == 8) {
            class32.method2171(class157.field2352, class157.field2368, class157.field2556);
        } else if (arg0 == 9) {
            class32.method2171(class157.field2370, class157.field2371, class157.field2392);
        } else if (arg0 == 10) {
            class32.method2171(class157.field2384, class157.field2374, class157.field2307);
        } else if (arg0 == 11) {
            class32.method2171(class157.field2376, class157.field2400, class157.field2472);
        } else if (arg0 == 12) {
            class32.method2171(class157.field2327, class157.field2380, class157.field2381);
        } else if (arg0 == 13) {
            class32.method2171(class157.field2382, class157.field2383, class157.field2482);
        } else if (arg0 == 14) {
            class32.method2171(class157.field2385, class157.field2386, class157.field2387);
        } else if (arg0 == 16) {
            class32.method2171(class157.field2388, class157.field2389, class157.field2458);
        } else if (arg0 == 17) {
            class32.method2171(class157.field2391, class157.field2459, class157.field2393);
        } else if (arg0 == 18) {
            class32.method2171(class157.field2323, class157.field2395, class157.field2513);
        } else if (arg0 == 19) {
            class32.method2171(class157.field2490, class157.field2398, class157.field2399);
        } else if (arg0 == 20) {
            class32.method2171(class157.field2377, class157.field2401, class157.field2402);
        } else if (arg0 == 22) {
            class32.method2171(class157.field2305, class157.field2404, class157.field2405);
        } else if (arg0 == 23) {
            class32.method2171(class157.field2406, class157.field2407, class157.field2408);
        } else if (arg0 == 24) {
            class32.method2171(class157.field2409, class157.field2410, class157.field2411);
        } else if (arg0 == 25) {
            class32.method2171(class157.field2412, class157.field2413, class157.field2457);
        } else if (arg0 == 26) {
            class32.method2171(class157.field2415, class157.field2416, class157.field2417);
        } else if (arg0 == 27) {
            class32.method2171(class157.field2426, class157.field2427, class157.field2420);
        } else if (arg0 == 31) {
            class32.method2171(class157.field2414, class157.field2428, class157.field2429);
        } else if (arg0 == 32) {
            class32.method2171(class157.field2530, class157.field2431, class157.field2432);
        } else if (arg0 == 37) {
            class32.method2171(class157.field2433, class157.field2538, class157.field2435);
        } else if (arg0 == 38) {
            class32.method2171(class157.field2463, class157.field2437, class157.field2314);
        } else if (arg0 == 55) {
            class32.method2171(class157.field2439, class157.field2440, class157.field2441);
        } else if (arg0 == 56) {
            class32.method2171(class157.field2442, class157.field2443, class157.field2464);
            method2652(11);
            return;
        } else if (arg0 == 57) {
            class32.method2171(class157.field2477, class157.field2446, class157.field2447);
            method2652(11);
            return;
        } else {
            class32.method2171(class157.field2448, class157.field2449, class157.field2554);
        }
        method2652(10);
    }

    @ObfuscatedName("hp.r(I)V")
    public static final void method3769() {
        if (Statics.field701 != null) {
            Statics.field701.method2865();
            Statics.field701 = null;
        }
        method50();
        Statics.field649.method1790();
        for (int var0 = 0; var0 < 4; var0++) {
            field554[var0].method2265();
        }
        System.gc();
        class183.field2927 = 1;
        Statics.field174 = null;
        Statics.field1762 = -1;
        Statics.field697 = -1;
        Statics.field3107 = 0;
        Statics.field2068 = false;
        Statics.field28 = 2;
        field401 = -1;
        field538 = false;
        class24.method805();
        method2652(10);
    }

    @ObfuscatedName("f.u(I)V")
    public static final void method50() {
        class47.field1057.method3541();
        class42.method2074();
        class45.method600();
        class41.field960.method3541();
        class41.field931.method3541();
        class41.field932.method3541();
        class41.field933.method3541();
        class40.method2826();
        class52.field1134.method3541();
        class52.field1111.method3541();
        class52.field1112.method3541();
        class43.method622();
        class44.method2080();
        class48.field1070.method3541();
        class53.method1554();
        class179.field2887.method3541();
        class173.field2726.method3541();
        class173.field2846.method3541();
        class173.field2728.method3541();
        class173.field2831.method3541();
        ((class95) Statics.field1582).method2063();
        class23.field610.method3541();
        Statics.field980.method3085();
        Statics.field69.method3085();
        Statics.field926.method3085();
        Statics.field1897.method3085();
        Statics.field2153.method3085();
        Statics.field2019.method3085();
        Statics.field2287.method3085();
        Statics.field642.method3085();
        Statics.field517.method3085();
        Statics.field327.method3085();
        Statics.field1768.method3085();
        Statics.field219.method3085();
    }

    @ObfuscatedName("h.m(I)V")
    public static final void method4() {
        if (field481 > 0) {
            method3769();
        } else {
            method2652(40);
            Statics.field340 = Statics.field701;
            Statics.field701 = null;
        }
    }

    @ObfuscatedName("y.t(I)V")
    public static final void method585() {
        if (Statics.field666 != null) {
            Statics.field666.method1165();
        }
        if (Statics.field1357 != null) {
            Statics.field1357.method1165();
        }
    }

    @ObfuscatedName("v.z(I)V")
    public static final void method39() {
        for (int var0 = 0; var0 < field542; var0++) {
            int var10002 = field545[var0]--;
            if (field545[var0] >= -10) {
                class59 var2 = field447[var0];
                if (var2 == null) {
                    class59 var10000 = (class59) null;
                    var2 = class59.method1226(Statics.field1897, field543[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field545[var0] += var2.method1225();
                    field447[var0] = var2;
                }
                if (field545[var0] < 0) {
                    int var9;
                    if (field339[var0] == 0) {
                        var9 = field427;
                    } else {
                        int var3 = (field339[var0] & 0xFF) * 128;
                        int var4 = field339[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field101.field853;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field339[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field101.field843;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field545[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field328 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1214().method1261(Statics.field12);
                        class65 var11 = class65.method1284(var10, 100, var9);
                        var11.method1287(field544[var0] - 1);
                        Statics.field645.method1119(var11);
                    }
                    field545[var0] = -100;
                }
            } else {
                field542--;
                for (int var1 = var0; var1 < field542; var1++) {
                    field543[var1] = field543[var1 + 1];
                    field447[var1] = field447[var1 + 1];
                    field544[var1] = field544[var1 + 1];
                    field545[var1] = field545[var1 + 1];
                    field339[var1] = field339[var1 + 1];
                }
                var0--;
            }
        }
        if (field538 && !class183.method2885()) {
            if (field536 != 0 && field401 != -1) {
                class183.method3296(Statics.field2019, field401, 0, field536, false);
            }
            field538 = false;
        }
    }

    @ObfuscatedName("fc.e(Laz;IIII)V")
    public static void method3287(class43 arg0, int arg1, int arg2, int arg3) {
        if (field542 >= 50 || field328 == 0 || arg0.field997 == null || arg1 >= arg0.field997.length) {
            return;
        }
        int var4 = arg0.field997[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field543[field542] = var5;
        field544[field542] = var6;
        field545[field542] = 0;
        field447[field542] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field339[field542] = (var8 << 16) + (var9 << 8) + var7;
        field542++;
    }

    @ObfuscatedName("ff.a(IB)V")
    public static void method3182(int arg0) {
        if (arg0 == -1 && !field538) {
            Statics.field2926.method3426();
            class183.field2927 = 1;
            Statics.field174 = null;
        } else if (arg0 != -1 && field401 != arg0 && field536 != 0 && !field538) {
            class168 var1 = Statics.field2019;
            int var2 = field536;
            class183.field2927 = 1;
            Statics.field174 = var1;
            Statics.field1762 = arg0;
            Statics.field697 = 0;
            Statics.field3107 = var2;
            Statics.field2068 = false;
            Statics.field28 = 2;
        }
        field401 = arg0;
    }

    @ObfuscatedName("dk.at(IIB)V")
    public static void method2306(int arg0, int arg1) {
        if (field536 != 0 && arg0 != -1) {
            class183.method3296(Statics.field1768, arg0, 0, field536, false);
            field538 = true;
        }
    }

    @ObfuscatedName("fj.aa(I)V")
    public static final void method3274() {
        if (Statics.field721 == field540) {
            return;
        }
        field540 = Statics.field721;
        int var0 = Statics.field721;
        int[] var1 = Statics.field1873.field1405;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field109[var0][var6][var4] & 0x18) == 0) {
                    Statics.field649.method1822(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class6.field109[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field649.method1822(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1873.method1601();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field109[var0][var10][var9] & 0x18) == 0) {
                    method1249(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class6.field109[var0 + 1][var10][var9] & 0x8) != 0) {
                    method1249(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field348 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field649.method1819(Statics.field721, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class41.method2325(var14).field956;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field554[Statics.field721].field1891;
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
                        field532[field348] = Statics.field285[var15];
                        field530[field348] = var16;
                        field507[field348] = var17;
                        field348++;
                    }
                }
            }
        }
        Statics.field2075.method1593();
    }

    @ObfuscatedName("an.ad(I)V")
    public static final void method734() {
        for (int var0 = 0; var0 < field336; var0++) {
            int var1 = field337[var0];
            class35 var2 = field322[var1];
            if (var2 != null) {
                method620(var2, var2.field786.field907);
            }
        }
    }

    @ObfuscatedName("at.af(Lab;II)V")
    public static final void method620(class38 arg0, int arg1) {
        if (arg0.field861 > field303) {
            int var2 = arg0.field861 - field303;
            int var3 = arg0.field857 * 128 + arg0.field821 * 64;
            int var4 = arg0.field859 * 128 + arg0.field821 * 64;
            arg0.field853 += (var3 - arg0.field853) / var2;
            arg0.field843 += (var4 - arg0.field843) / var2;
            arg0.field873 = 0;
            arg0.field866 = arg0.field863;
        } else if (arg0.field862 >= field303) {
            method166(arg0);
        } else {
            arg0.field844 = arg0.field820;
            if (arg0.field869 == 0) {
                arg0.field873 = 0;
            } else {
                label322: {
                    if (arg0.field834 != -1 && arg0.field819 == 0) {
                        class43 var5 = class43.method733(arg0.field834);
                        if (arg0.field874 > 0 && var5.field1005 == 0) {
                            arg0.field873++;
                            break label322;
                        }
                        if (arg0.field874 <= 0 && var5.field1006 == 0) {
                            arg0.field873++;
                            break label322;
                        }
                    }
                    int var6 = arg0.field853;
                    int var7 = arg0.field843;
                    int var8 = arg0.field870[arg0.field869 - 1] * 128 + arg0.field821 * 64;
                    int var9 = arg0.field817[arg0.field869 - 1] * 128 + arg0.field821 * 64;
                    if (var6 < var8) {
                        if (var7 < var9) {
                            arg0.field866 = 1280;
                        } else if (var7 > var9) {
                            arg0.field866 = 1792;
                        } else {
                            arg0.field866 = 1536;
                        }
                    } else if (var6 > var8) {
                        if (var7 < var9) {
                            arg0.field866 = 768;
                        } else if (var7 > var9) {
                            arg0.field866 = 256;
                        } else {
                            arg0.field866 = 512;
                        }
                    } else if (var7 < var9) {
                        arg0.field866 = 1024;
                    } else if (var7 > var9) {
                        arg0.field866 = 0;
                    }
                    byte var10 = arg0.field872[arg0.field869 - 1];
                    if (var8 - var6 <= 256 && var8 - var6 >= -256 && var9 - var7 <= 256 && var9 - var7 >= -256) {
                        int var11 = arg0.field866 - arg0.field818 & 0x7FF;
                        if (var11 > 1024) {
                            var11 -= 2048;
                        }
                        int var12 = arg0.field875;
                        if (var11 >= -256 && var11 <= 256) {
                            var12 = arg0.field824;
                        } else if (var11 >= 256 && var11 < 768) {
                            var12 = arg0.field829;
                        } else if (var11 >= -768 && var11 <= -256) {
                            var12 = arg0.field850;
                        }
                        if (var12 == -1) {
                            var12 = arg0.field824;
                        }
                        arg0.field844 = var12;
                        int var13 = 4;
                        boolean var14 = true;
                        if (arg0 instanceof class35) {
                            var14 = ((class35) arg0).field786.field923;
                        }
                        if (var14) {
                            if (arg0.field866 != arg0.field818 && arg0.field841 == -1 && arg0.field825 != 0) {
                                var13 = 2;
                            }
                            if (arg0.field869 > 2) {
                                var13 = 6;
                            }
                            if (arg0.field869 > 3) {
                                var13 = 8;
                            }
                            if (arg0.field873 > 0 && arg0.field869 > 1) {
                                var13 = 8;
                                arg0.field873--;
                            }
                        } else {
                            if (arg0.field869 > 1) {
                                var13 = 6;
                            }
                            if (arg0.field869 > 2) {
                                var13 = 8;
                            }
                            if (arg0.field873 > 0 && arg0.field869 > 1) {
                                var13 = 8;
                                arg0.field873--;
                            }
                        }
                        if (var10 == 2) {
                            var13 <<= 0x1;
                        }
                        if (var13 >= 8 && arg0.field844 == arg0.field824 && arg0.field828 != -1) {
                            arg0.field844 = arg0.field828;
                        }
                        if (var6 != var8 || var7 != var9) {
                            if (var6 < var8) {
                                arg0.field853 += var13;
                                if (arg0.field853 > var8) {
                                    arg0.field853 = var8;
                                }
                            } else if (var6 > var8) {
                                arg0.field853 -= var13;
                                if (arg0.field853 < var8) {
                                    arg0.field853 = var8;
                                }
                            }
                            if (var7 < var9) {
                                arg0.field843 += var13;
                                if (arg0.field843 > var9) {
                                    arg0.field843 = var9;
                                }
                            } else if (var7 > var9) {
                                arg0.field843 -= var13;
                                if (arg0.field843 < var9) {
                                    arg0.field843 = var9;
                                }
                            }
                        }
                        if (arg0.field853 == var8 && arg0.field843 == var9) {
                            arg0.field869--;
                            if (arg0.field874 > 0) {
                                arg0.field874--;
                            }
                        }
                    } else {
                        arg0.field853 = var8;
                        arg0.field843 = var9;
                        arg0.field869--;
                        if (arg0.field874 > 0) {
                            arg0.field874--;
                        }
                    }
                }
            }
        }
        if (arg0.field853 < 128 || arg0.field843 < 128 || arg0.field853 >= 13184 || arg0.field843 >= 13184) {
            arg0.field834 = -1;
            arg0.field826 = -1;
            arg0.field861 = 0;
            arg0.field862 = 0;
            arg0.field853 = arg0.field870[0] * 128 + arg0.field821 * 64;
            arg0.field843 = arg0.field817[0] * 128 + arg0.field821 * 64;
            arg0.method730();
        }
        if (Statics.field101 == arg0 && (arg0.field853 < 1536 || arg0.field843 < 1536 || arg0.field853 >= 11776 || arg0.field843 >= 11776)) {
            arg0.field834 = -1;
            arg0.field826 = -1;
            arg0.field861 = 0;
            arg0.field862 = 0;
            arg0.field853 = arg0.field870[0] * 128 + arg0.field821 * 64;
            arg0.field843 = arg0.field817[0] * 128 + arg0.field821 * 64;
            arg0.method730();
        }
        Statics.method3189(arg0);
        arg0.field852 = false;
        if (arg0.field844 != -1) {
            class43 var15 = class43.method733(arg0.field844);
            if (var15 == null || var15.field994 == null) {
                arg0.field844 = -1;
            } else {
                arg0.field846++;
                if (arg0.field845 < var15.field994.length && arg0.field846 > var15.field996[arg0.field845]) {
                    arg0.field846 = 1;
                    arg0.field845++;
                    method3287(var15, arg0.field845, arg0.field853, arg0.field843);
                }
                if (arg0.field845 >= var15.field994.length) {
                    arg0.field846 = 0;
                    arg0.field845 = 0;
                    method3287(var15, arg0.field845, arg0.field853, arg0.field843);
                }
            }
        }
        if (arg0.field826 != -1 && field303 >= arg0.field855) {
            if (arg0.field847 < 0) {
                arg0.field847 = 0;
            }
            int var16 = class44.method2821(arg0.field826).field1019;
            if (var16 == -1) {
                arg0.field826 = -1;
            } else {
                class43 var17 = class43.method733(var16);
                if (var17 == null || var17.field994 == null) {
                    arg0.field826 = -1;
                } else {
                    arg0.field854++;
                    if (arg0.field847 < var17.field994.length && arg0.field854 > var17.field996[arg0.field847]) {
                        arg0.field854 = 1;
                        arg0.field847++;
                        method3287(var17, arg0.field847, arg0.field853, arg0.field843);
                    }
                    if (arg0.field847 >= var17.field994.length && (arg0.field847 < 0 || arg0.field847 >= var17.field994.length)) {
                        arg0.field826 = -1;
                    }
                }
            }
        }
        if (arg0.field834 != -1 && arg0.field819 <= 1) {
            class43 var18 = class43.method733(arg0.field834);
            if (var18.field1005 == 1 && arg0.field874 > 0 && arg0.field861 <= field303 && arg0.field862 < field303) {
                arg0.field819 = 1;
                return;
            }
        }
        if (arg0.field834 != -1 && arg0.field819 == 0) {
            class43 var19 = class43.method733(arg0.field834);
            if (var19 == null || var19.field994 == null) {
                arg0.field834 = -1;
            } else {
                arg0.field849++;
                if (arg0.field848 < var19.field994.length && arg0.field849 > var19.field996[arg0.field848]) {
                    arg0.field849 = 1;
                    arg0.field848++;
                    method3287(var19, arg0.field848, arg0.field853, arg0.field843);
                }
                if (arg0.field848 >= var19.field994.length) {
                    arg0.field848 -= var19.field998;
                    arg0.field851++;
                    if (arg0.field851 >= var19.field1004) {
                        arg0.field834 = -1;
                    } else if (arg0.field848 >= 0 && arg0.field848 < var19.field994.length) {
                        method3287(var19, arg0.field848, arg0.field853, arg0.field843);
                    } else {
                        arg0.field834 = -1;
                    }
                }
                arg0.field852 = var19.field1000;
            }
        }
        if (arg0.field819 > 0) {
            arg0.field819--;
        }
    }

    @ObfuscatedName("d.ag(Lab;S)V")
    public static final void method166(class38 arg0) {
        if (field303 == arg0.field862 || arg0.field834 == -1 || arg0.field819 != 0 || arg0.field849 + 1 > class43.method733(arg0.field834).field996[arg0.field848]) {
            int var1 = arg0.field862 - arg0.field861;
            int var2 = field303 - arg0.field861;
            int var3 = arg0.field857 * 128 + arg0.field821 * 64;
            int var4 = arg0.field859 * 128 + arg0.field821 * 64;
            int var5 = arg0.field858 * 128 + arg0.field821 * 64;
            int var6 = arg0.field860 * 128 + arg0.field821 * 64;
            arg0.field853 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field843 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field873 = 0;
        arg0.field866 = arg0.field863;
        arg0.field818 = arg0.field866;
    }

    @ObfuscatedName("do.al(Lv;III)V")
    public static void method2320(class3 arg0, int arg1, int arg2) {
        if (arg0.field834 == arg1 && arg1 != -1) {
            int var3 = class43.method733(arg1).field1007;
            if (var3 == 1) {
                arg0.field848 = 0;
                arg0.field849 = 0;
                arg0.field819 = arg2;
                arg0.field851 = 0;
            }
            if (var3 == 2) {
                arg0.field851 = 0;
            }
        } else if (arg1 == -1 || arg0.field834 == -1 || class43.method733(arg1).field991 >= class43.method733(arg0.field834).field991) {
            arg0.field834 = arg1;
            arg0.field848 = 0;
            arg0.field849 = 0;
            arg0.field819 = arg2;
            arg0.field851 = 0;
            arg0.field874 = arg0.field869;
        }
    }

    @ObfuscatedName("ac.am(I)I")
    public static int method724() {
        return field513 ? 2 : 1;
    }

    @ObfuscatedName("dt.ar(II)V")
    public static void method2335(int arg0) {
        field512 = 0L;
        if (arg0 >= 2) {
            field513 = true;
        } else {
            field513 = false;
        }
        method1595();
        if (field304 >= 25) {
            field341.method2631(133);
            field341.method2499(method724());
            field341.method2369(Statics.field2115);
            field341.method2369(Statics.field705);
        }
        field2183 = true;
    }

    @ObfuscatedName("er.ap(I)V")
    public static void method2979() {
        class137.method92(Statics.field2897);
        Canvas var0 = Statics.field2897;
        var0.removeMouseListener(class140.field2143);
        var0.removeMouseMotionListener(class140.field2143);
        var0.removeFocusListener(class140.field2143);
        class140.field2130 = 0;
        if (Statics.field2278 != null) {
            Statics.field2278.method2705(Statics.field2897);
        }
        Statics.field2881.method2890();
        Statics.field2897.setBackground(Color.black);
        class137.method2754(Statics.field2897);
        class140.method698(Statics.field2897);
        if (Statics.field2278 != null) {
            Statics.field2278.method2704(Statics.field2897);
        }
        if (field416 != -1) {
            method635(false);
        }
        field2194 = true;
    }

    @ObfuscatedName("ba.ac(I)V")
    public static void method1595() {
        client var0 = Statics.field2881;
        synchronized (Statics.field2881) {
            Container var1 = Statics.field2881.method2897();
            if (var1 != null) {
                Statics.field1196 = Math.max(var1.getSize().width, Statics.field706);
                Statics.field2622 = Math.max(var1.getSize().height, Statics.field876);
                if (Statics.field1156 == var1) {
                    Insets var2 = Statics.field1156.getInsets();
                    Statics.field1196 -= var2.right + var2.left;
                    Statics.field2622 -= var2.top + var2.bottom;
                }
                if (Statics.field1196 <= 0) {
                    Statics.field1196 = 1;
                }
                if (Statics.field2622 <= 0) {
                    Statics.field2622 = 1;
                }
                if (method724() == 1) {
                    Statics.field2115 = field514 * 765;
                    Statics.field705 = field515;
                } else {
                    Statics.field2115 = Math.min(Statics.field1196, 7680);
                    Statics.field705 = Math.min(Statics.field2622, 2160);
                }
                field2186 = (Statics.field1196 - Statics.field2115) / 2;
                field2187 = 0;
                Statics.field2897.setSize(Statics.field2115, Statics.field705);
                int var3 = Statics.field2115;
                int var4 = Statics.field705;
                Canvas var5 = Statics.field2897;
                class78 var7;
                try {
                    class82 var6 = new class82();
                    var6.method1519(var3, var4, var5);
                    var7 = var6;
                } catch (Throwable var12) {
                    class76 var9 = new class76();
                    var9.method1519(var3, var4, var5);
                    var7 = var9;
                }
                Statics.field2075 = var7;
                if (Statics.field1156 == var1) {
                    Insets var10 = Statics.field1156.getInsets();
                    Statics.field2897.setLocation(field2186 + var10.left, field2187 + var10.top);
                } else {
                    Statics.field2897.setLocation(field2186, field2187);
                }
                method3737();
                if (field416 != -1) {
                    method635(true);
                }
                method45();
            }
        }
    }

    @ObfuscatedName("hf.ab(I)V")
    public static void method3737() {
        int var0 = Statics.field2115;
        int var1 = Statics.field705;
        if (Statics.field1196 < var0) {
            int var2 = Statics.field1196;
        }
        if (Statics.field2622 < var1) {
            int var3 = Statics.field2622;
        }
        if (Statics.field2871 != null) {
            try {
                class132.method2728(Statics.field2881, "resize", new Object[] { method724() });
            } catch (Throwable var5) {
            }
        }
    }

    @ObfuscatedName("n.an(I)V")
    public static void method45() {
        int var0 = field2186;
        int var1 = field2187;
        int var2 = Statics.field1196 - Statics.field2115 - var0;
        int var3 = Statics.field2622 - Statics.field705 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field2881.method2897();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1156 == var4) {
                Insets var7 = Statics.field1156.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field2622);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field1196, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field1196 + var5 - var2, var6, var2, Statics.field2622);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field2622 + var6 - var3, Statics.field1196, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("ct.ak(B)V")
    public static final void method2062() {
        if (field416 != -1) {
            int var0 = field416;
            if (class173.method692(var0)) {
                method2654(Statics.field2791[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field502; var1++) {
            if (field504[var1]) {
                field442[var1] = true;
            }
            field559[var1] = field504[var1];
            field504[var1] = false;
        }
        field571 = field303;
        field495 = -1;
        field448 = -1;
        Statics.field685 = null;
        if (field416 != -1) {
            field502 = 0;
            method3533(field416, 0, 0, Statics.field2115, Statics.field705, 0, 0, -1);
        }
        class80.method1702();
        if (field439) {
            int var2 = Statics.field211;
            int var3 = Statics.field887;
            int var4 = Statics.field1874;
            int var5 = Statics.field1771;
            int var6 = 6116423;
            class80.method1716(var2, var3, var4, var5, var6);
            class80.method1716(var2 + 1, var3 + 1, var4 - 2, 16, 0);
            class80.method1711(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
            Statics.field175.method3844(class157.field2351, var2 + 3, var3 + 14, var6, -1);
            int var7 = class140.field2134;
            int var8 = class140.field2135 * 782474221;
            for (int var9 = 0; var9 < field440; var9++) {
                int var10 = (field440 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                Statics.field175.method3844(method3219(var9), var2 + 3, var10, var11, 0);
            }
            method104(Statics.field211, Statics.field887, Statics.field1874, Statics.field1771);
        } else if (field495 != -1) {
            method3288(field495, field448);
        }
        if (field511 == 3) {
            for (int var12 = 0; var12 < field502; var12++) {
                if (field559[var12]) {
                    class80.method1708(field402[var12], field508[var12], field509[var12], field510[var12], 16711935, 128);
                } else if (field442[var12]) {
                    class80.method1708(field402[var12], field508[var12], field509[var12], field510[var12], 16711680, 128);
                }
            }
        }
        class24.method2060(Statics.field721, Statics.field101.field853, Statics.field101.field843, field472);
        field472 = 0;
    }

    @ObfuscatedName("ax.ay(Ljava/lang/String;ZB)V")
    public static final void method953(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field25.method3873(arg0, 250);
        int var6 = Statics.field25.method3830(arg0, 250) * 13;
        class80.method1716(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1711(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field25.method3834(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method123(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method104(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field2897.getGraphics();
            Statics.field2075.method1520(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field2897.repaint();
        }
    }

    @ObfuscatedName("ex.au(IIIIB)V")
    public static final void method2823(int arg0, int arg1, int arg2, int arg3) {
        field405++;
        method617(class34.field781);
        boolean var4 = false;
        if (field464 >= 0) {
            int var5 = class33.field774;
            int[] var6 = class33.field769;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field464 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method617(class34.field782);
        }
        method2997(true);
        method617(var4 ? class34.field783 : class34.field784);
        method2997(false);
        for (class7 var8 = (class7) field566.method3611(); var8 != null; var8 = (class7) field566.method3616()) {
            if (Statics.field721 != var8.field113 || field303 > var8.field119) {
                var8.method3711();
            } else if (field303 >= var8.field118) {
                if (var8.field126 > 0) {
                    class35 var9 = field322[var8.field126 - 1];
                    if (var9 != null && var9.field853 >= 0 && var9.field853 < 13312 && var9.field843 >= 0 && var9.field843 < 13312) {
                        var8.method96(var9.field853, var9.field843, method560(var9.field853, var9.field843, var8.field113) - var8.field140, field303);
                    }
                }
                if (var8.field126 < 0) {
                    int var10 = -var8.field126 - 1;
                    class3 var11;
                    if (field422 == var10) {
                        var11 = Statics.field101;
                    } else {
                        var11 = field421[var10];
                    }
                    if (var11 != null && var11.field853 >= 0 && var11.field853 < 13312 && var11.field843 >= 0 && var11.field843 < 13312) {
                        var8.method96(var11.field853, var11.field843, method560(var11.field853, var11.field843, var8.field113) - var8.field140, field303);
                    }
                }
                var8.method97(field472);
                Statics.field649.method1924(Statics.field721, (int) var8.field124, (int) var8.field121, (int) var8.field134, 60, var8, var8.field122, -1, false);
            }
        }
        method952();
        method185(arg0, arg1, arg2, arg3, true);
        int var12 = field506;
        int var13 = field563;
        int var14 = field522;
        int var15 = field565;
        class80.method1710(var12, var13, var12 + var14, var13 + var15);
        class91.method1980();
        if (!field548) {
            int var16 = field384;
            if (field443 / 256 > var16) {
                var16 = field443 / 256;
            }
            if (field549[4] && field560[4] + 128 > var16) {
                var16 = field560[4] + 128;
            }
            int var17 = field385 + field367 & 0x7FF;
            method1037(Statics.field225, method560(Statics.field101.field853, Statics.field101.field843, Statics.field721) - field390, Statics.field1876, var16, var17, var16 * 3 + 600);
        }
        int var30;
        if (field548) {
            int var31;
            if (Statics.field2871.field152) {
                var31 = Statics.field721;
            } else {
                int var32 = method560(Statics.field2242, Statics.field263, Statics.field721);
                if (var32 - Statics.field1077 >= 800 || (class6.field109[Statics.field721][Statics.field2242 >> 7][Statics.field263 >> 7] & 0x4) == 0) {
                    var31 = 3;
                } else {
                    var31 = Statics.field721;
                }
            }
            var30 = var31;
        } else {
            int var18;
            if (Statics.field2871.field152) {
                var18 = Statics.field721;
            } else {
                label502: {
                    int var19 = 3;
                    if (Statics.field1755 < 310) {
                        int var20 = Statics.field2242 >> 7;
                        int var21 = Statics.field263 >> 7;
                        int var22 = Statics.field101.field853 >> 7;
                        int var23 = Statics.field101.field843 >> 7;
                        if (var20 < 0 || var21 < 0 || var20 >= 104 || var21 >= 104) {
                            var18 = Statics.field721;
                            break label502;
                        }
                        if ((class6.field109[Statics.field721][var20][var21] & 0x4) != 0) {
                            var19 = Statics.field721;
                        }
                        int var24;
                        if (var22 > var20) {
                            var24 = var22 - var20;
                        } else {
                            var24 = var20 - var22;
                        }
                        int var25;
                        if (var23 > var21) {
                            var25 = var23 - var21;
                        } else {
                            var25 = var21 - var23;
                        }
                        if (var24 > var25) {
                            int var26 = var25 * 65536 / var24;
                            int var27 = 32768;
                            while (var20 != var22) {
                                if (var20 < var22) {
                                    var20++;
                                } else if (var20 > var22) {
                                    var20--;
                                }
                                if ((class6.field109[Statics.field721][var20][var21] & 0x4) != 0) {
                                    var19 = Statics.field721;
                                }
                                var27 += var26;
                                if (var27 >= 65536) {
                                    var27 -= 65536;
                                    if (var21 < var23) {
                                        var21++;
                                    } else if (var21 > var23) {
                                        var21--;
                                    }
                                    if ((class6.field109[Statics.field721][var20][var21] & 0x4) != 0) {
                                        var19 = Statics.field721;
                                    }
                                }
                            }
                        } else {
                            int var28 = var24 * 65536 / var25;
                            int var29 = 32768;
                            while (var21 != var23) {
                                if (var21 < var23) {
                                    var21++;
                                } else if (var21 > var23) {
                                    var21--;
                                }
                                if ((class6.field109[Statics.field721][var20][var21] & 0x4) != 0) {
                                    var19 = Statics.field721;
                                }
                                var29 += var28;
                                if (var29 >= 65536) {
                                    var29 -= 65536;
                                    if (var20 < var22) {
                                        var20++;
                                    } else if (var20 > var22) {
                                        var20--;
                                    }
                                    if ((class6.field109[Statics.field721][var20][var21] & 0x4) != 0) {
                                        var19 = Statics.field721;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field101.field853 >= 0 && Statics.field101.field843 >= 0 && Statics.field101.field853 < 13312 && Statics.field101.field843 < 13312) {
                        if ((class6.field109[Statics.field721][Statics.field101.field853 >> 7][Statics.field101.field843 >> 7] & 0x4) != 0) {
                            var19 = Statics.field721;
                        }
                        var18 = var19;
                    } else {
                        var18 = Statics.field721;
                    }
                }
            }
            var30 = var18;
        }
        int var33 = Statics.field2242;
        int var34 = Statics.field1077;
        int var35 = Statics.field263;
        int var36 = Statics.field1755;
        int var37 = Statics.field2214;
        for (int var38 = 0; var38 < 5; var38++) {
            if (field549[var38]) {
                int var39 = (int) (Math.random() * (double) (field550[var38] * 2 + 1) - (double) field550[var38] + Math.sin((double) field326[var38] / 100.0D * (double) field553[var38]) * (double) field560[var38]);
                if (var38 == 0) {
                    Statics.field2242 += var39;
                }
                if (var38 == 1) {
                    Statics.field1077 += var39;
                }
                if (var38 == 2) {
                    Statics.field263 += var39;
                }
                if (var38 == 3) {
                    Statics.field2214 = Statics.field2214 + var39 & 0x7FF;
                }
                if (var38 == 4) {
                    Statics.field1755 += var39;
                    if (Statics.field1755 < 128) {
                        Statics.field1755 = 128;
                    }
                    if (Statics.field1755 > 383) {
                        Statics.field1755 = 383;
                    }
                }
            }
        }
        int var40 = class140.field2134;
        int var41 = class140.field2135 * 782474221;
        if (class140.field2140 != 0) {
            var40 = class140.field2146;
            var41 = class140.field2132;
        }
        if (var40 >= var12 && var40 < var12 + var14 && var41 >= var13 && var41 < var13 + var15) {
            class105.field1801 = true;
            class105.field1799 = 0;
            class105.field1833 = var40 - var12;
            class105.field1847 = var41 - var13;
        } else {
            class105.field1801 = false;
            class105.field1799 = 0;
        }
        method585();
        class80.method1716(var12, var13, var14, var15, 0);
        method585();
        int var42 = class91.field1571;
        class91.field1571 = field324;
        Statics.field649.method1828(Statics.field2242, Statics.field1077, Statics.field263, Statics.field1755, Statics.field2214, var30);
        class91.field1571 = var42;
        method585();
        Statics.field649.method1804();
        field394 = 0;
        boolean var43 = false;
        int var44 = -1;
        int var45 = class33.field774;
        int[] var46 = class33.field769;
        for (int var47 = 0; var47 < field336 + var45; var47++) {
            class38 var48;
            if (var47 < var45) {
                var48 = field421[var46[var47]];
                if (field464 == var46[var47]) {
                    var43 = true;
                    var44 = var47;
                    continue;
                }
            } else {
                var48 = field322[field337[var47 - var45]];
            }
            Statics.method1536(var48, var47, var12, var13, var14, var15);
        }
        if (var43) {
            Statics.method1536(field421[field464], var44, var12, var13, var14, var15);
        }
        for (int var49 = 0; var49 < field394; var49++) {
            int var50 = field396[var49];
            int var51 = field397[var49];
            int var52 = field387[var49];
            int var53 = field398[var49];
            boolean var54 = true;
            while (var54) {
                var54 = false;
                for (int var55 = 0; var55 < var49; var55++) {
                    if (var51 + 2 > field397[var55] - field398[var55] && var51 - var53 < field397[var55] + 2 && var50 - var52 < field396[var55] + field387[var55] && var50 + var52 > field396[var55] - field387[var55] && field397[var55] - field398[var55] < var51) {
                        var51 = field397[var55] - field398[var55];
                        var54 = true;
                    }
                }
            }
            field321 = field396[var49];
            field567 = field397[var49] = var51;
            String var56 = field403[var49];
            if (field461 == 0) {
                int var57 = 16776960;
                if (field400[var49] < 6) {
                    var57 = field516[field400[var49]];
                }
                if (field400[var49] == 6) {
                    var57 = field405 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field400[var49] == 7) {
                    var57 = field405 % 20 < 10 ? 255 : 65535;
                }
                if (field400[var49] == 8) {
                    var57 = field405 % 20 < 10 ? 45056 : 8454016;
                }
                if (field400[var49] == 9) {
                    int var58 = 150 - field320[var49];
                    if (var58 < 50) {
                        var57 = var58 * 1280 + 16711680;
                    } else if (var58 < 100) {
                        var57 = 16776960 - (var58 - 50) * 327680;
                    } else if (var58 < 150) {
                        var57 = (var58 - 100) * 5 + 65280;
                    }
                }
                if (field400[var49] == 10) {
                    int var59 = 150 - field320[var49];
                    if (var59 < 50) {
                        var57 = var59 * 5 + 16711680;
                    } else if (var59 < 100) {
                        var57 = 16711935 - (var59 - 50) * 327680;
                    } else if (var59 < 150) {
                        var57 = (var59 - 100) * 327680 + 255 - (var59 - 100) * 5;
                    }
                }
                if (field400[var49] == 11) {
                    int var60 = 150 - field320[var49];
                    if (var60 < 50) {
                        var57 = 16777215 - var60 * 327685;
                    } else if (var60 < 100) {
                        var57 = (var60 - 50) * 327685 + 65280;
                    } else if (var60 < 150) {
                        var57 = 16777215 - (var60 - 100) * 327680;
                    }
                }
                if (field569[var49] == 0) {
                    Statics.field175.method3903(var56, field321 + var12, field567 + var13, var57, 0);
                }
                if (field569[var49] == 1) {
                    Statics.field175.method3897(var56, field321 + var12, field567 + var13, var57, 0, field405);
                }
                if (field569[var49] == 2) {
                    Statics.field175.method3836(var56, field321 + var12, field567 + var13, var57, 0, field405);
                }
                if (field569[var49] == 3) {
                    Statics.field175.method3837(var56, field321 + var12, field567 + var13, var57, 0, field405, 150 - field320[var49]);
                }
                if (field569[var49] == 4) {
                    int var61 = (150 - field320[var49]) * (Statics.field175.method3827(var56) + 100) / 150;
                    class80.method1754(field321 + var12 - 50, var13, field321 + var12 + 50, var13 + var15);
                    Statics.field175.method3844(var56, field321 + var12 + 50 - var61, field567 + var13, var57, 0);
                    class80.method1710(var12, var13, var12 + var14, var13 + var15);
                }
                if (field569[var49] == 5) {
                    int var62 = 150 - field320[var49];
                    int var63 = 0;
                    if (var62 < 25) {
                        var63 = var62 - 25;
                    } else if (var62 > 125) {
                        var63 = var62 - 125;
                    }
                    class80.method1754(var12, field567 + var13 - Statics.field175.field3177 - 1, var12 + var14, field567 + var13 + 5);
                    Statics.field175.method3903(var56, field321 + var12, field567 + var13 + var63, var57, 0);
                    class80.method1710(var12, var13, var12 + var14, var13 + var15);
                }
            } else {
                Statics.field175.method3903(var56, field321 + var12, field567 + var13, 16776960, 0);
            }
        }
        if (field475 == 2) {
            method2756((field317 - Statics.field2719 << 7) + field551, (field318 - Statics.field607 << 7) + field307, field314 * 2);
            if (field321 > -1 && field303 % 20 < 10) {
                Statics.field2961[0].method1646(field321 + var12 - 12, field567 + var13 - 28);
            }
        }
        ((class95) Statics.field1582).method2065(field472);
        if (field411 == 1) {
            Statics.field377[field429 / 100].method1646(field408 - 8, field520 - 8);
        }
        if (field411 == 2) {
            Statics.field377[field429 / 100 + 4].method1646(field408 - 8, field520 - 8);
        }
        Statics.method2860();
        Statics.field2242 = var33;
        Statics.field1077 = var34;
        Statics.field263 = var35;
        Statics.field1755 = var36;
        Statics.field2214 = var37;
        if (field315) {
            byte var64 = 0;
            int var65 = class171.field2698 + class171.field2697 + var64;
            if (var65 == 0) {
                field315 = false;
            }
        }
        if (field315) {
            class80.method1716(var12, var13, var14, var15, 0);
            method953(class157.field2313, false);
        }
    }

    @ObfuscatedName("x.az(IIIIZS)V")
    public static final void method185(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field555 - field485) * var5 / 100 + field485;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field335) {
            short var8 = field335;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field474) {
                var6 = field474;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1702();
                    class80.method1716(arg0, arg1, var10, arg3, -16777216);
                    class80.method1716(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field561) {
            short var11 = field561;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field558) {
                var6 = field558;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1702();
                    class80.method1716(arg0, arg1, arg2, var13, -16777216);
                    class80.method1716(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field557 - field556) * var5 / 100 + field556;
        field324 = arg3 * var6 * var14 / 85504 << 1;
        if (field522 != arg2 || field565 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class91.field1585[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class86.method1945(var15, 500, 800, arg2, arg3);
        }
        field506 = arg0;
        field563 = arg1;
        field522 = arg2;
        field565 = arg3;
    }

    @ObfuscatedName("a.aw(Lam;I)V")
    public static final void method617(class34 arg0) {
        if (Statics.field101.field853 >> 7 == field533 && Statics.field101.field843 >> 7 == field534) {
            field533 = 0;
        }
        int var1 = class33.field774;
        int[] var2 = class33.field769;
        int var3 = var1;
        if (class34.field781 == arg0 || class34.field782 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field781 == arg0) {
                var5 = Statics.field101;
                var6 = Statics.field101.field55 << 14;
            } else if (class34.field782 == arg0) {
                var5 = field421[field464];
                var6 = field464 << 14;
            } else {
                var5 = field421[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field783 == arg0 && field464 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method18() && !var5.field44) {
                var5.field48 = false;
                if ((field301 && var1 > 50 || var1 > 200) && class34.field781 != arg0 && var5.field844 == var5.field820) {
                    var5.field48 = true;
                }
                int var7 = var5.field853 >> 7;
                int var8 = var5.field843 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field43 == null || field303 < var5.field53 || field303 >= var5.field39) {
                        if ((var5.field853 & 0x7F) == 64 && (var5.field843 & 0x7F) == 64) {
                            if (field405 == field404[var7][var8]) {
                                continue;
                            }
                            field404[var7][var8] = field405;
                        }
                        var5.field31 = method560(var5.field853, var5.field843, Statics.field721);
                        Statics.field649.method1924(Statics.field721, var5.field853, var5.field843, var5.field31, 60, var5, var5.field818, var6, var5.field852);
                    } else {
                        var5.field48 = false;
                        var5.field31 = method560(var5.field853, var5.field843, Statics.field721);
                        Statics.field649.method1802(Statics.field721, var5.field853, var5.field843, var5.field31, 60, var5, var5.field818, var6, var5.field50, var5.field45, var5.field46, var5.field47);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fw.av(ZI)V")
    public static final void method2997(boolean arg0) {
        for (int var1 = 0; var1 < field336; var1++) {
            class35 var2 = field322[field337[var1]];
            int var3 = (field337[var1] << 14) + 536870912;
            if (var2 != null && var2.method18() && var2.field786.field911 == arg0 && var2.field786.method752()) {
                int var4 = var2.field853 >> 7;
                int var5 = var2.field843 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field821 == 1 && (var2.field853 & 0x7F) == 64 && (var2.field843 & 0x7F) == 64) {
                        if (field405 == field404[var4][var5]) {
                            continue;
                        }
                        field404[var4][var5] = field405;
                    }
                    if (!var2.field786.field922) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field649.method1924(Statics.field721, var2.field853, var2.field843, method560(var2.field853 + (var2.field821 * 64 - 64), var2.field843 + (var2.field821 * 64 - 64), Statics.field721), var2.field821 * 64 - 64 + 60, var2, var2.field818, var3, var2.field852);
                }
            }
        }
    }

    @ObfuscatedName("ax.aq(B)V")
    public static final void method952() {
        for (class30 var0 = (class30) field434.method3611(); var0 != null; var0 = (class30) field434.method3616()) {
            if (Statics.field721 != var0.field710 || var0.field715) {
                var0.method3711();
            } else if (field303 >= var0.field708) {
                var0.method637(field472);
                if (var0.field715) {
                    var0.method3711();
                } else {
                    Statics.field649.method1924(var0.field710, var0.field711, var0.field712, var0.field713, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("du.ae(Lab;II)V")
    public static final void method2256(class38 arg0, int arg1) {
        method2756(arg0.field853, arg0.field843, arg1);
    }

    @ObfuscatedName("em.aj(IIII)V")
    public static final void method2756(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field321 = -1;
            field567 = -1;
            return;
        }
        int var3 = method560(arg0, arg1, Statics.field721) - arg2;
        int var4 = arg0 - Statics.field2242;
        int var5 = var3 - Statics.field1077;
        int var6 = arg1 - Statics.field263;
        int var7 = class91.field1585[Statics.field1755];
        int var8 = class91.field1586[Statics.field1755];
        int var9 = class91.field1585[Statics.field2214];
        int var10 = class91.field1586[Statics.field2214];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field321 = field324 * var11 / var15 + field522 / 2;
            field567 = field324 * var14 / var15 + field565 / 2;
        } else {
            field321 = -1;
            field567 = -1;
        }
    }

    @ObfuscatedName("t.ah(IIII)I")
    public static final int method560(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field109[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field89[var5][var3][var4] + class6.field89[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field89[var5][var3][var4 + 1] + class6.field89[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ao.ao(IIIIIIB)V")
    public static final void method1037(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class91.field1585[var6];
            int var12 = class91.field1586[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class91.field1585[var7];
            int var15 = class91.field1586[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field2242 = arg0 - var8;
        Statics.field1077 = arg1 - var9;
        Statics.field263 = arg2 - var10;
        Statics.field1755 = arg3;
        Statics.field2214 = arg4;
    }

    @ObfuscatedName("da.bs(ZI)V")
    public static final void method2304(boolean arg0) {
        field360 = arg0;
        if (!field360) {
            int var1 = field333.method2418();
            int var2 = field333.method2385();
            int var3 = field333.method2385();
            Statics.field1958 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field1958[var4][var5] = field333.method2388();
                }
            }
            Statics.field274 = new int[var3];
            Statics.field488 = new int[var3];
            Statics.field2125 = new int[var3];
            Statics.field682 = new byte[var3][];
            Statics.field787 = new byte[var3][];
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
                        Statics.field274[var7] = var10;
                        Statics.field488[var7] = Statics.field2153.method3084("m" + var8 + "_" + var9);
                        Statics.field2125[var7] = Statics.field2153.method3084("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method108(var1, var2);
            return;
        }
        int var11 = field333.method2419();
        int var12 = field333.method2385();
        int var13 = field333.method2385();
        field333.method2629();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field333.method2630(1);
                    if (var17 == 1) {
                        field361[var14][var15][var16] = field333.method2630(26);
                    } else {
                        field361[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field333.method2644();
        Statics.field1958 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field1958[var18][var19] = field333.method2388();
            }
        }
        Statics.field274 = new int[var13];
        Statics.field488 = new int[var13];
        Statics.field2125 = new int[var13];
        Statics.field682 = new byte[var13][];
        Statics.field787 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field361[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field274[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field274[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field488[var20] = Statics.field2153.method3084("m" + var29 + "_" + var30);
                            Statics.field2125[var20] = Statics.field2153.method3084("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method108(var12, var11);
    }

    @ObfuscatedName("s.be(III)V")
    public static final void method108(int arg0, int arg1) {
        if (Statics.field166 == arg0 && Statics.field2982 == arg1) {
            return;
        }
        Statics.field166 = arg0;
        Statics.field2982 = arg1;
        method2652(25);
        method953(class157.field2313, true);
        int var2 = Statics.field2719;
        int var3 = Statics.field607;
        Statics.field2719 = (arg0 - 6) * 8;
        Statics.field607 = (arg1 - 6) * 8;
        int var4 = Statics.field2719 - var2;
        int var5 = Statics.field607 - var3;
        int var6 = Statics.field2719;
        int var7 = Statics.field607;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field322[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field870[var10] -= var4;
                    var9.field817[var10] -= var5;
                }
                var9.field853 -= var4 * 128;
                var9.field843 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field421[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field870[var13] -= var4;
                    var12.field817[var13] -= var5;
                }
                var12.field853 -= var4 * 128;
                var12.field843 -= var5 * 128;
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
                        field431[var24][var20][var21] = field431[var24][var22][var23];
                    } else {
                        field431[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field432.method3611(); var25 != null; var25 = (class17) field432.method3616()) {
            var25.field237 -= var4;
            var25.field238 -= var5;
            if (var25.field237 < 0 || var25.field238 < 0 || var25.field237 >= 104 || var25.field238 >= 104) {
                var25.method3711();
            }
        }
        if (field533 != 0) {
            field533 -= var4;
            field534 -= var5;
        }
        field542 = 0;
        field548 = false;
        field540 = -1;
        field434.method3608();
        field566.method3608();
        for (int var26 = 0; var26 < 4; var26++) {
            field554[var26].method2265();
        }
    }

    @ObfuscatedName("g.bq(ZI)V")
    public static final void method51(boolean arg0) {
        method585();
        field347++;
        if (field347 < 50 && !arg0) {
            return;
        }
        field347 = 0;
        if (field352 || Statics.field701 == null) {
            return;
        }
        field341.method2631(179);
        try {
            Statics.field701.method2884(field341.field1978, 0, field341.field1973);
            field341.field1973 = 0;
        } catch (IOException var2) {
            field352 = true;
        }
    }

    @ObfuscatedName("bk.bm(IIIIII)V")
    public static final void method1249(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field649.method1957(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field649.method1820(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1873.field1405;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method2325(var12);
            if (var13.field958 == -1) {
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
                class81 var14 = Statics.field1103[var13.field958];
                if (var14 != null) {
                    int var15 = (var13.field928 * 4 - var14.field1426) / 2;
                    int var16 = (var13.field978 * 4 - var14.field1424) / 2;
                    var14.method1767(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field978) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field649.method1915(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field649.method1820(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method2325(var21);
            if (var22.field958 != -1) {
                class81 var23 = Statics.field1103[var22.field958];
                if (var23 != null) {
                    int var24 = (var22.field928 * 4 - var23.field1426) / 2;
                    int var25 = (var22.field978 * 4 - var23.field1424) / 2;
                    var23.method1767(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field978) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1873.field1405;
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
        int var29 = Statics.field649.method1819(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method2325(var30);
        if (var31.field958 == -1) {
            return;
        }
        class81 var32 = Statics.field1103[var31.field958];
        if (var32 != null) {
            int var33 = (var31.field928 * 4 - var32.field1426) / 2;
            int var34 = (var31.field978 * 4 - var32.field1424) / 2;
            var32.method1767(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field978) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("av.bi(I)V")
    public static final void method921() {
        if (field345 == 103) {
            int var0 = field333.method2418();
            int var1 = field333.method2411();
            int var2 = (var1 >> 4 & 0x7) + Statics.field2160;
            int var3 = (var1 & 0x7) + Statics.field602;
            int var4 = field333.method2549();
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = field407[var5];
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                method1512(Statics.field721, var2, var3, var7, var0, var5, var6, 0, -1);
            }
            return;
        }
        if (field345 == 163) {
            byte var8 = field333.method2414();
            int var9 = field333.method2418();
            int var10 = field333.method2423();
            int var11 = var10 >> 2;
            int var12 = var10 & 0x3;
            int var13 = field407[var11];
            int var14 = field333.method2418();
            int var15 = field333.method2549();
            int var16 = (var15 >> 4 & 0x7) + Statics.field2160;
            int var17 = (var15 & 0x7) + Statics.field602;
            int var18 = field333.method2418();
            byte var19 = field333.method2370();
            byte var20 = field333.method2371();
            int var21 = field333.method2419();
            byte var22 = field333.method2483();
            class3 var23;
            if (field422 == var21) {
                var23 = Statics.field101;
            } else {
                var23 = field421[var21];
            }
            if (var23 != null) {
                class41 var24 = class41.method2325(var14);
                int var25;
                int var26;
                if (var12 == 1 || var12 == 3) {
                    var25 = var24.field978;
                    var26 = var24.field928;
                } else {
                    var25 = var24.field928;
                    var26 = var24.field978;
                }
                int var27 = (var25 >> 1) + var16;
                int var28 = (var25 + 1 >> 1) + var16;
                int var29 = (var26 >> 1) + var17;
                int var30 = (var26 + 1 >> 1) + var17;
                int[][] var31 = class6.field89[Statics.field721];
                int var32 = var31[var27][var29] + var31[var28][var29] + var31[var27][var30] + var31[var28][var30] >> 2;
                int var33 = (var16 << 7) + (var25 << 6);
                int var34 = (var17 << 7) + (var26 << 6);
                class105 var35 = var24.method793(var11, var12, var31, var33, var32, var34);
                if (var35 != null) {
                    method1512(Statics.field721, var16, var17, var13, -1, 0, 0, var9 + 1, var18 + 1);
                    var23.field53 = field303 + var9;
                    var23.field39 = field303 + var18;
                    var23.field43 = var35;
                    var23.field54 = var16 * 128 + var25 * 64;
                    var23.field42 = var17 * 128 + var26 * 64;
                    var23.field36 = var32;
                    if (var22 > var19) {
                        byte var36 = var22;
                        var22 = var19;
                        var19 = var36;
                    }
                    if (var8 > var20) {
                        byte var37 = var8;
                        var8 = var20;
                        var20 = var37;
                    }
                    var23.field50 = var16 + var22;
                    var23.field46 = var16 + var19;
                    var23.field45 = var8 + var17;
                    var23.field47 = var17 + var20;
                }
            }
        }
        if (field345 == 106) {
            int var38 = field333.method2383();
            int var39 = (var38 >> 4 & 0x7) + Statics.field2160;
            int var40 = (var38 & 0x7) + Statics.field602;
            int var41 = var39 + field333.method2370();
            int var42 = var40 + field333.method2370();
            int var43 = field333.method2386();
            int var44 = field333.method2385();
            int var45 = field333.method2383() * 4;
            int var46 = field333.method2383() * 4;
            int var47 = field333.method2385();
            int var48 = field333.method2385();
            int var49 = field333.method2383();
            int var50 = field333.method2383();
            if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104 && var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104 && var44 != 65535) {
                int var51 = var39 * 128 + 64;
                int var52 = var40 * 128 + 64;
                int var53 = var41 * 128 + 64;
                int var54 = var42 * 128 + 64;
                class7 var55 = new class7(var44, Statics.field721, var51, var52, method560(var51, var52, Statics.field721) - var45, field303 + var47, field303 + var48, var49, var50, var43, var46);
                var55.method96(var53, var54, method560(var53, var54, Statics.field721) - var46, field303 + var47);
                field566.method3609(var55);
            }
            return;
        }
        if (field345 == 249) {
            int var56 = field333.method2383();
            int var57 = (var56 >> 4 & 0x7) + Statics.field2160;
            int var58 = (var56 & 0x7) + Statics.field602;
            int var59 = field333.method2385();
            int var60 = field333.method2383();
            int var61 = var60 >> 4 & 0xF;
            int var62 = var60 & 0x7;
            int var63 = field333.method2383();
            if (var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104) {
                int var64 = var61 + 1;
                if (Statics.field101.field870[0] >= var57 - var64 && Statics.field101.field870[0] <= var57 + var64 && Statics.field101.field817[0] >= var58 - var64 && Statics.field101.field817[0] <= var58 + var64 && field328 != 0 && var62 > 0 && field542 < 50) {
                    field543[field542] = var59;
                    field544[field542] = var62;
                    field545[field542] = var63;
                    field447[field542] = null;
                    field339[field542] = (var57 << 16) + (var58 << 8) + var61;
                    field542++;
                }
            }
        }
        if (field345 == 156) {
            int var65 = field333.method2549();
            int var66 = (var65 >> 4 & 0x7) + Statics.field2160;
            int var67 = (var65 & 0x7) + Statics.field602;
            int var68 = field333.method2559();
            int var69 = field333.method2559();
            if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104) {
                class29 var70 = new class29();
                var70.field699 = var69;
                var70.field700 = var68;
                if (field431[Statics.field721][var66][var67] == null) {
                    field431[Statics.field721][var66][var67] = new class199();
                }
                field431[Statics.field721][var66][var67].method3609(var70);
                method198(var66, var67);
            }
        } else if (field345 == 197) {
            int var71 = field333.method2423();
            int var72 = (var71 >> 4 & 0x7) + Statics.field2160;
            int var73 = (var71 & 0x7) + Statics.field602;
            int var74 = field333.method2418();
            if (var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104) {
                class199 var75 = field431[Statics.field721][var72][var73];
                if (var75 != null) {
                    for (class29 var76 = (class29) var75.method3611(); var76 != null; var76 = (class29) var75.method3616()) {
                        if ((var74 & 0x7FFF) == var76.field699) {
                            var76.method3711();
                            break;
                        }
                    }
                    if (var75.method3611() == null) {
                        field431[Statics.field721][var72][var73] = null;
                    }
                    method198(var72, var73);
                }
            }
        } else if (field345 == 101) {
            int var77 = field333.method2383();
            int var78 = (var77 >> 4 & 0x7) + Statics.field2160;
            int var79 = (var77 & 0x7) + Statics.field602;
            int var80 = field333.method2385();
            int var81 = field333.method2383();
            int var82 = field333.method2385();
            if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                int var83 = var78 * 128 + 64;
                int var84 = var79 * 128 + 64;
                class30 var85 = new class30(var80, Statics.field721, var83, var84, method560(var83, var84, Statics.field721) - var81, var82, field303);
                field434.method3609(var85);
            }
        } else if (field345 == 88) {
            int var86 = field333.method2411();
            int var87 = var86 >> 2;
            int var88 = var86 & 0x3;
            int var89 = field407[var87];
            int var90 = field333.method2411();
            int var91 = (var90 >> 4 & 0x7) + Statics.field2160;
            int var92 = (var90 & 0x7) + Statics.field602;
            if (var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104) {
                method1512(Statics.field721, var91, var92, var89, -1, var87, var88, 0, -1);
            }
        } else if (field345 == 27) {
            int var93 = field333.method2385();
            int var94 = field333.method2423();
            int var95 = var94 >> 2;
            int var96 = var94 & 0x3;
            int var97 = field407[var95];
            int var98 = field333.method2549();
            int var99 = (var98 >> 4 & 0x7) + Statics.field2160;
            int var100 = (var98 & 0x7) + Statics.field602;
            if (var99 >= 0 && var100 >= 0 && var99 < 103 && var100 < 103) {
                if (var97 == 0) {
                    class87 var101 = Statics.field649.method1812(Statics.field721, var99, var100);
                    if (var101 != null) {
                        int var102 = var101.field1523 >> 14 & 0x7FFF;
                        if (var95 == 2) {
                            var101.field1519 = new class13(var102, 2, var96 + 4, Statics.field721, var99, var100, var93, false, var101.field1519);
                            var101.field1520 = new class13(var102, 2, var96 + 1 & 0x3, Statics.field721, var99, var100, var93, false, var101.field1520);
                        } else {
                            var101.field1519 = new class13(var102, var95, var96, Statics.field721, var99, var100, var93, false, var101.field1519);
                        }
                    }
                }
                if (var97 == 1) {
                    class94 var103 = Statics.field649.method1813(Statics.field721, var99, var100);
                    if (var103 != null) {
                        int var104 = var103.field1607 >> 14 & 0x7FFF;
                        if (var95 == 4 || var95 == 5) {
                            var103.field1603 = new class13(var104, 4, var96, Statics.field721, var99, var100, var93, false, var103.field1603);
                        } else if (var95 == 6) {
                            var103.field1603 = new class13(var104, 4, var96 + 4, Statics.field721, var99, var100, var93, false, var103.field1603);
                        } else if (var95 == 7) {
                            var103.field1603 = new class13(var104, 4, (var96 + 2 & 0x3) + 4, Statics.field721, var99, var100, var93, false, var103.field1603);
                        } else if (var95 == 8) {
                            var103.field1603 = new class13(var104, 4, var96 + 4, Statics.field721, var99, var100, var93, false, var103.field1603);
                            var103.field1608 = new class13(var104, 4, (var96 + 2 & 0x3) + 4, Statics.field721, var99, var100, var93, false, var103.field1608);
                        }
                    }
                }
                if (var97 == 2) {
                    class98 var105 = Statics.field649.method1814(Statics.field721, var99, var100);
                    if (var95 == 11) {
                        var95 = 10;
                    }
                    if (var105 != null) {
                        var105.field1660 = new class13(var105.field1673 >> 14 & 0x7FFF, var95, var96, Statics.field721, var99, var100, var93, false, var105.field1660);
                    }
                }
                if (var97 == 3) {
                    class93 var106 = Statics.field649.method1815(Statics.field721, var99, var100);
                    if (var106 != null) {
                        var106.field1590 = new class13(var106.field1591 >> 14 & 0x7FFF, 22, var96, Statics.field721, var99, var100, var93, false, var106.field1590);
                    }
                }
            }
        } else if (field345 == 80) {
            int var107 = field333.method2383();
            int var108 = (var107 >> 4 & 0x7) + Statics.field2160;
            int var109 = (var107 & 0x7) + Statics.field602;
            int var110 = field333.method2385();
            int var111 = field333.method2385();
            int var112 = field333.method2385();
            if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                class199 var113 = field431[Statics.field721][var108][var109];
                if (var113 != null) {
                    for (class29 var114 = (class29) var113.method3611(); var114 != null; var114 = (class29) var113.method3616()) {
                        if ((var110 & 0x7FFF) == var114.field699 && var114.field700 == var111) {
                            var114.field700 = var112;
                            break;
                        }
                    }
                    method198(var108, var109);
                }
            }
        }
    }

    @ObfuscatedName("bw.bc(IIIIIIIIII)V")
    public static final void method1512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field432.method3611(); var10 != null; var10 = (class17) field432.method3616()) {
            if (var10.field247 == arg0 && var10.field237 == arg1 && var10.field238 == arg2 && var10.field245 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field247 = arg0;
            var9.field245 = arg3;
            var9.field237 = arg1;
            var9.field238 = arg2;
            method170(var9);
            field432.method3609(var9);
        }
        var9.field242 = arg4;
        var9.field244 = arg5;
        var9.field243 = arg6;
        var9.field249 = arg7;
        var9.field246 = arg8;
    }

    @ObfuscatedName("d.bd(Lj;B)V")
    public static final void method170(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field245 == 0) {
            var1 = Statics.field649.method1957(arg0.field247, arg0.field237, arg0.field238);
        }
        if (arg0.field245 == 1) {
            var1 = Statics.field649.method1874(arg0.field247, arg0.field237, arg0.field238);
        }
        if (arg0.field245 == 2) {
            var1 = Statics.field649.method1915(arg0.field247, arg0.field237, arg0.field238);
        }
        if (arg0.field245 == 3) {
            var1 = Statics.field649.method1819(arg0.field247, arg0.field237, arg0.field238);
        }
        if (var1 != 0) {
            int var5 = Statics.field649.method1820(arg0.field247, arg0.field237, arg0.field238, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field240 = var2;
        arg0.field252 = var3;
        arg0.field235 = var4;
    }

    @ObfuscatedName("e.bk(I)V")
    public static final void method579() {
        for (class17 var0 = (class17) field432.method3611(); var0 != null; var0 = (class17) field432.method3616()) {
            if (var0.field246 > 0) {
                var0.field246--;
            }
            if (var0.field246 == 0) {
                if (var0.field240 >= 0) {
                    int var1 = var0.field240;
                    int var2 = var0.field252;
                    class41 var3 = class41.method2325(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method776(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method2259(var0.field247, var0.field245, var0.field237, var0.field238, var0.field240, var0.field235, var0.field252);
                var0.method3711();
            } else {
                if (var0.field249 > 0) {
                    var0.field249--;
                }
                if (var0.field249 == 0 && var0.field237 >= 1 && var0.field238 >= 1 && var0.field237 <= 102 && var0.field238 <= 102) {
                    if (var0.field242 >= 0) {
                        int var5 = var0.field242;
                        int var6 = var0.field244;
                        class41 var7 = class41.method2325(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method776(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method2259(var0.field247, var0.field245, var0.field237, var0.field238, var0.field242, var0.field243, var0.field244);
                    var0.field249 = -1;
                    if (var0.field242 == var0.field240 && var0.field240 == -1) {
                        var0.method3711();
                    } else if (var0.field242 == var0.field240 && var0.field243 == var0.field235 && var0.field252 == var0.field244) {
                        var0.method3711();
                    }
                }
            }
        }
    }

    @ObfuscatedName("du.bu(IIIIIIII)V")
    public static final void method2259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field301 && Statics.field721 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field649.method1957(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field649.method1874(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field649.method1915(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field649.method1819(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field649.method1820(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field649.method1807(arg0, arg2, arg3);
                class41 var15 = class41.method2325(var12);
                if (var15.field937 != 0) {
                    field554[arg0].method2271(arg2, arg3, var13, var14, var15.field946);
                }
            }
            if (arg1 == 1) {
                Statics.field649.method1870(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field649.method1884(arg0, arg2, arg3);
                class41 var16 = class41.method2325(var12);
                if (var16.field928 + arg2 > 103 || var16.field928 + arg3 > 103 || var16.field978 + arg2 > 103 || var16.field978 + arg3 > 103) {
                    return;
                }
                if (var16.field937 != 0) {
                    field554[arg0].method2272(arg2, arg3, var16.field928, var16.field978, var14, var16.field946);
                }
            }
            if (arg1 == 3) {
                Statics.field649.method1810(arg0, arg2, arg3);
                class41 var17 = class41.method2325(var12);
                if (var17.field937 == 1) {
                    field554[arg0].method2274(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field109[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class86 var19 = Statics.field649;
        class108 var20 = field554[arg0];
        class41 var21 = class41.method2325(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field978;
            var23 = var21.field928;
        } else {
            var22 = var21.field928;
            var23 = var21.field978;
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
        int[][] var28 = class6.field89[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field943 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field968 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class85 var34;
            if (var21.field949 == -1 && var21.field969 == null) {
                var34 = var21.method793(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            var19.method1840(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field937 == 1) {
                var20.method2269(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class85 var57;
            if (var21.field949 == -1 && var21.field969 == null) {
                var57 = var21.method793(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            if (var57 != null) {
                var19.method1800(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field937 != 0) {
                var20.method2267(arg2, arg3, var22, var23, var21.field946);
            }
        } else if (arg6 >= 12) {
            class85 var35;
            if (var21.field949 == -1 && var21.field969 == null) {
                var35 = var21.method793(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            var19.method1800(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field937 != 0) {
                var20.method2267(arg2, arg3, var22, var23, var21.field946);
            }
        } else if (arg6 == 0) {
            class85 var36;
            if (var21.field949 == -1 && var21.field969 == null) {
                var36 = var21.method793(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            var19.method1798(arg0, arg2, arg3, var29, var36, (class85) null, class6.field97[arg5], 0, var32, var33);
            if (var21.field937 != 0) {
                var20.method2266(arg2, arg3, arg6, arg5, var21.field946);
            }
        } else if (arg6 == 1) {
            class85 var37;
            if (var21.field949 == -1 && var21.field969 == null) {
                var37 = var21.method793(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            var19.method1798(arg0, arg2, arg3, var29, var37, (class85) null, class6.field98[arg5], 0, var32, var33);
            if (var21.field937 != 0) {
                var20.method2266(arg2, arg3, arg6, arg5, var21.field946);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class85 var39;
            class85 var40;
            if (var21.field949 == -1 && var21.field969 == null) {
                var39 = var21.method793(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method793(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field949, true, (class85) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            var19.method1798(arg0, arg2, arg3, var29, var39, var40, class6.field97[arg5], class6.field97[var38], var32, var33);
            if (var21.field937 != 0) {
                var20.method2266(arg2, arg3, arg6, arg5, var21.field946);
            }
        } else if (arg6 == 3) {
            class85 var41;
            if (var21.field949 == -1 && var21.field969 == null) {
                var41 = var21.method793(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            var19.method1798(arg0, arg2, arg3, var29, var41, (class85) null, class6.field98[arg5], 0, var32, var33);
            if (var21.field937 != 0) {
                var20.method2266(arg2, arg3, arg6, arg5, var21.field946);
            }
        } else if (arg6 == 9) {
            class85 var42;
            if (var21.field949 == -1 && var21.field969 == null) {
                var42 = var21.method793(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            var19.method1800(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field937 != 0) {
                var20.method2267(arg2, arg3, var22, var23, var21.field946);
            }
        } else if (arg6 == 4) {
            class85 var43;
            if (var21.field949 == -1 && var21.field969 == null) {
                var43 = var21.method793(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            var19.method1910(arg0, arg2, arg3, var29, var43, (class85) null, class6.field97[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1957(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class41.method2325(var45 >> 14 & 0x7FFF).field952;
            }
            class85 var46;
            if (var21.field949 == -1 && var21.field969 == null) {
                var46 = var21.method793(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            var19.method1910(arg0, arg2, arg3, var29, var46, (class85) null, class6.field97[arg5], 0, class6.field99[arg5] * var44, class6.field100[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1957(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class41.method2325(var48 >> 14 & 0x7FFF).field952 / 2;
            }
            class85 var49;
            if (var21.field949 == -1 && var21.field969 == null) {
                var49 = var21.method793(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            var19.method1910(arg0, arg2, arg3, var29, var49, (class85) null, 256, arg5, class6.field92[arg5] * var47, class6.field102[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class85 var51;
            if (var21.field949 == -1 && var21.field969 == null) {
                var51 = var21.method793(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            var19.method1910(arg0, arg2, arg3, var29, var51, (class85) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1957(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class41.method2325(var53 >> 14 & 0x7FFF).field952 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class85 var55;
            class85 var56;
            if (var21.field949 == -1 && var21.field969 == null) {
                var55 = var21.method793(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method793(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field949, true, (class85) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field949, true, (class85) null);
            }
            var19.method1910(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field92[arg5] * var52, class6.field102[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("r.bj(III)V")
    public static final void method198(int arg0, int arg1) {
        class199 var2 = field431[Statics.field721][arg0][arg1];
        if (var2 == null) {
            Statics.field649.method1811(Statics.field721, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3611(); var6 != null; var6 = (class29) var2.method3616()) {
            class52 var7 = class52.method588(var6.field699);
            long var8 = (long) var7.field1144;
            if (var7.field1109 == 1) {
                var8 = (long) (var6.field700 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field649.method1811(Statics.field721, arg0, arg1);
            return;
        }
        var2.method3621(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3611(); var12 != null; var12 = (class29) var2.method3616()) {
            if (var5.field699 != var12.field699) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field699 != var12.field699 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field649.method1797(Statics.field721, arg0, arg1, method560(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field721), var5, var13, var10, var11);
    }

    @ObfuscatedName("j.bl(ZB)V")
    public static final void method192(boolean arg0) {
        field424 = 0;
        field338 = 0;
        field333.method2629();
        int var1 = field333.method2630(8);
        if (var1 < field336) {
            for (int var2 = var1; var2 < field336; var2++) {
                field297[++field424 - 1] = field337[var2];
            }
        }
        if (var1 > field336) {
            throw new RuntimeException("");
        }
        field336 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field337[var3];
            class35 var5 = field322[var4];
            int var6 = field333.method2630(1);
            if (var6 == 0) {
                field337[++field336 - 1] = var4;
                var5.field864 = field303;
            } else {
                int var7 = field333.method2630(2);
                if (var7 == 0) {
                    field337[++field336 - 1] = var4;
                    var5.field864 = field303;
                    field505[++field338 - 1] = var4;
                } else if (var7 == 1) {
                    field337[++field336 - 1] = var4;
                    var5.field864 = field303;
                    int var8 = field333.method2630(3);
                    var5.method696(var8, (byte) 1);
                    int var9 = field333.method2630(1);
                    if (var9 == 1) {
                        field505[++field338 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field337[++field336 - 1] = var4;
                    var5.field864 = field303;
                    int var10 = field333.method2630(3);
                    var5.method696(var10, (byte) 2);
                    int var11 = field333.method2630(3);
                    var5.method696(var11, (byte) 2);
                    int var12 = field333.method2630(1);
                    if (var12 == 1) {
                        field505[++field338 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field297[++field424 - 1] = var4;
                }
            }
        }
        while (field333.method2636(field344) >= 27) {
            int var13 = field333.method2630(15);
            if (var13 == 32767) {
                break;
            }
            boolean var33 = false;
            if (field322[var13] == null) {
                field322[var13] = new class35();
                var33 = true;
            }
            class35 var34 = field322[var13];
            field337[++field336 - 1] = var13;
            var34.field864 = field303;
            var34.field786 = class40.method3(field333.method2630(14));
            int var35;
            if (arg0) {
                var35 = field333.method2630(8);
                if (var35 > 127) {
                    var35 -= 256;
                }
            } else {
                var35 = field333.method2630(5);
                if (var35 > 15) {
                    var35 -= 32;
                }
            }
            int var36 = field333.method2630(1);
            int var37;
            if (arg0) {
                var37 = field333.method2630(8);
                if (var37 > 127) {
                    var37 -= 256;
                }
            } else {
                var37 = field333.method2630(5);
                if (var37 > 15) {
                    var37 -= 32;
                }
            }
            int var38 = field333.method2630(1);
            if (var38 == 1) {
                field505[++field338 - 1] = var13;
            }
            int var39 = field531[field333.method2630(3)];
            if (var33) {
                var34.field866 = var34.field818 = var39;
            }
            var34.field821 = var34.field786.field907;
            var34.field825 = var34.field786.field899;
            if (var34.field825 == 0) {
                var34.field818 = 0;
            }
            var34.field824 = var34.field786.field901;
            var34.field875 = var34.field786.field902;
            var34.field850 = var34.field786.field903;
            var34.field829 = var34.field786.field904;
            var34.field820 = var34.field786.field898;
            var34.field871 = var34.field786.field897;
            var34.field823 = var34.field786.field900;
            var34.method699(Statics.field101.field870[0] + var35, Statics.field101.field817[0] + var37, var36 == 1);
        }
        field333.method2644();
        for (int var14 = 0; var14 < field338; var14++) {
            int var15 = field505[var14];
            class35 var16 = field322[var15];
            int var17 = field333.method2383();
            if ((var17 & 0x8) != 0) {
                var16.field841 = field333.method2559();
                if (var16.field841 == 65535) {
                    var16.field841 = -1;
                }
            }
            if ((var17 & 0x80) != 0) {
                int var18 = field333.method2418();
                int var19 = field333.method2385();
                int var20 = var16.field853 - (var18 - Statics.field2719 - Statics.field2719) * 64;
                int var21 = var16.field843 - (var19 - Statics.field607 - Statics.field607) * 64;
                if (var20 != 0 || var21 != 0) {
                    var16.field868 = (int) (Math.atan2((double) var20, (double) var21) * 325.949D) & 0x7FF;
                }
            }
            if ((var17 & 0x1) != 0) {
                int var22 = field333.method2411();
                int var23 = field333.method2411();
                var16.method727(var22, var23, field303);
                var16.field877 = field303 + 300;
                var16.field839 = field333.method2385();
                var16.field840 = field333.method2418();
            }
            if ((var17 & 0x40) != 0) {
                var16.field786 = class40.method3(field333.method2419());
                var16.field821 = var16.field786.field907;
                var16.field825 = var16.field786.field899;
                var16.field824 = var16.field786.field901;
                var16.field875 = var16.field786.field902;
                var16.field850 = var16.field786.field903;
                var16.field829 = var16.field786.field904;
                var16.field820 = var16.field786.field898;
                var16.field871 = var16.field786.field897;
                var16.field823 = var16.field786.field900;
            }
            if ((var17 & 0x2) != 0) {
                var16.field822 = field333.method2391();
                var16.field832 = 100;
            }
            if ((var17 & 0x20) != 0) {
                int var24 = field333.method2383();
                int var25 = field333.method2549();
                var16.method727(var24, var25, field303);
                var16.field877 = field303 + 300;
                var16.field839 = field333.method2419();
                var16.field840 = field333.method2418();
            }
            if ((var17 & 0x4) != 0) {
                int var26 = field333.method2385();
                if (var26 == 65535) {
                    var26 = -1;
                }
                int var27 = field333.method2383();
                if (var16.field834 == var26 && var26 != -1) {
                    int var28 = class43.method733(var26).field1007;
                    if (var28 == 1) {
                        var16.field848 = 0;
                        var16.field849 = 0;
                        var16.field819 = var27;
                        var16.field851 = 0;
                    }
                    if (var28 == 2) {
                        var16.field851 = 0;
                    }
                } else if (var26 == -1 || var16.field834 == -1 || class43.method733(var26).field991 >= class43.method733(var16.field834).field991) {
                    var16.field834 = var26;
                    var16.field848 = 0;
                    var16.field849 = 0;
                    var16.field819 = var27;
                    var16.field851 = 0;
                    var16.field874 = var16.field869;
                }
            }
            if ((var17 & 0x10) != 0) {
                var16.field826 = field333.method2418();
                int var29 = field333.method2430();
                var16.field827 = var29 >> 16;
                var16.field855 = (var29 & 0xFFFF) + field303;
                var16.field847 = 0;
                var16.field854 = 0;
                if (var16.field855 > field303) {
                    var16.field847 = -1;
                }
                if (var16.field826 == 65535) {
                    var16.field826 = -1;
                }
            }
        }
        for (int var30 = 0; var30 < field424; var30++) {
            int var31 = field297[var30];
            if (field303 != field322[var31].field864) {
                field322[var31].field786 = null;
                field322[var31] = null;
            }
        }
        if (field344 != field333.field1973) {
            throw new RuntimeException(field333.field1973 + class2.field18 + field344);
        }
        for (int var32 = 0; var32 < field336; var32++) {
            if (field322[field337[var32]] == null) {
                throw new RuntimeException(var32 + class2.field18 + field336);
            }
        }
    }

    @ObfuscatedName("ew.bn(Lv;IIBB)V")
    public static final void method2812(class3 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field870[0];
        int var5 = arg0.field817[0];
        if (var4 < 0 || var4 >= 104 || var5 < 0 || var5 >= 104 || arg1 < 0 || arg1 >= 104 || arg2 < 0 || arg2 >= 104) {
            return;
        }
        int var6 = class106.method2993(var4, var5, arg0.method11(), method159(arg1, arg2), field554[arg0.field51], true, field420, field581);
        if (var6 >= 1) {
            for (int var7 = 0; var7 < var6 - 1; var7++) {
                arg0.method30(field420[var7], field581[var7], arg3);
            }
        }
    }

    @ObfuscatedName("p.br(IIB)Lde;")
    public static class107 method159(int arg0, int arg1) {
        field359.field1875 = arg0;
        field359.field1867 = arg1;
        field359.field1869 = 1;
        field359.field1870 = 1;
        return field359;
    }

    @ObfuscatedName("fd.bz(IIB)V")
    public static final void method3288(int arg0, int arg1) {
        if (field440 < 2 && field451 == 0 && !field454) {
            return;
        }
        String var2;
        if (field451 == 1 && field440 < 2) {
            var2 = class157.field2430 + class157.field2506 + field438 + " " + class2.field21;
        } else if (field454 && field440 < 2) {
            var2 = field311 + class157.field2506 + field458 + " " + class2.field21;
        } else {
            var2 = method3219(field440 - 1);
        }
        if (field440 > 2) {
            var2 = var2 + class2.method951(16777215) + " " + '/' + " " + (field440 - 2) + class157.field2372;
        }
        Statics.field175.method3838(var2, arg0 + 4, arg1 + 15, 16777215, 0, field303 / 1000);
    }

    @ObfuscatedName("k.bo(IIIII)V")
    public static final void method123(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field502; var4++) {
            if (field509[var4] + field402[var4] > arg0 && field402[var4] < arg0 + arg2 && field510[var4] + field508[var4] > arg1 && field508[var4] < arg1 + arg3) {
                field504[var4] = true;
            }
        }
    }

    @ObfuscatedName("o.bg(IIIII)V")
    public static final void method104(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field502; var4++) {
            if (field509[var4] + field402[var4] > arg0 && field402[var4] < arg0 + arg2 && field510[var4] + field508[var4] > arg1 && field508[var4] < arg1 + arg3) {
                field442[var4] = true;
            }
        }
    }

    @ObfuscatedName("fp.bv(III)V")
    public static final void method3013(int arg0, int arg1) {
        int var2 = Statics.field175.method3827(class157.field2351);
        for (int var3 = 0; var3 < field440; var3++) {
            int var4 = Statics.field175.method3827(method3219(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field440 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field2115) {
            var6 = Statics.field2115 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field705) {
            var7 = Statics.field705 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field439 = true;
        Statics.field211 = var6;
        Statics.field887 = var7;
        Statics.field1874 = var2;
        Statics.field1771 = field440 * 15 + 22;
    }

    @ObfuscatedName("cg.bb(IB)Z")
    public static final boolean method2159(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field379[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("bi.by(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1199(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 22) {
            field408 = arg6;
            field520 = arg7;
            field411 = 2;
            field429 = 0;
            field533 = arg0;
            field534 = arg1;
            field341.method2631(4);
            field341.method2415(Statics.field607 + arg1);
            field341.method2415(Statics.field2719 + arg0);
            field341.method2369(arg3);
            field341.method2407(class137.field2102[82] ? 1 : 0);
        }
        if (arg2 == 3) {
            field408 = arg6;
            field520 = arg7;
            field411 = 2;
            field429 = 0;
            field533 = arg0;
            field534 = arg1;
            field341.method2631(155);
            field341.method2408(class137.field2102[82] ? 1 : 0);
            field341.method2582(arg3 >> 14 & 0x7FFF);
            field341.method2369(Statics.field2719 + arg0);
            field341.method2441(Statics.field607 + arg1);
        }
        if (arg2 == 21) {
            field408 = arg6;
            field520 = arg7;
            field411 = 2;
            field429 = 0;
            field533 = arg0;
            field534 = arg1;
            field341.method2631(89);
            field341.method2582(Statics.field2719 + arg0);
            field341.method2369(Statics.field607 + arg1);
            field341.method2369(arg3);
            field341.method2499(class137.field2102[82] ? 1 : 0);
        }
        if (arg2 == 5) {
            field408 = arg6;
            field520 = arg7;
            field411 = 2;
            field429 = 0;
            field533 = arg0;
            field534 = arg1;
            field341.method2631(95);
            field341.method2408(class137.field2102[82] ? 1 : 0);
            field341.method2441(Statics.field607 + arg1);
            field341.method2441(arg3 >> 14 & 0x7FFF);
            field341.method2582(Statics.field2719 + arg0);
        }
        if (arg2 == 16) {
            field408 = arg6;
            field520 = arg7;
            field411 = 2;
            field429 = 0;
            field533 = arg0;
            field534 = arg1;
            field341.method2631(200);
            field341.method2441(Statics.field2719 + arg0);
            field341.method2582(Statics.field375);
            field341.method2441(arg3);
            field341.method2415(Statics.field607 + arg1);
            field341.method2382(Statics.field2074);
            field341.method2369(Statics.field2717);
            field341.method2408(class137.field2102[82] ? 1 : 0);
        }
        if (arg2 == 14) {
            class3 var8 = field421[arg3];
            if (var8 != null) {
                field408 = arg6;
                field520 = arg7;
                field411 = 2;
                field429 = 0;
                field533 = arg0;
                field534 = arg1;
                field341.method2631(85);
                field341.method2582(arg3);
                field341.method2397(class137.field2102[82] ? 1 : 0);
                field341.method2415(Statics.field375);
                field341.method2415(Statics.field2717);
                field341.method2426(Statics.field2074);
            }
        }
        if (arg2 == 31) {
            field341.method2631(212);
            field341.method2426(arg1);
            field341.method2369(arg0);
            field341.method2582(Statics.field375);
            field341.method2415(Statics.field2717);
            field341.method2382(Statics.field2074);
            field341.method2415(arg3);
            field412 = 0;
            Statics.field171 = class173.method2977(arg1);
            field413 = arg0;
        }
        if (arg2 == 19) {
            field408 = arg6;
            field520 = arg7;
            field411 = 2;
            field429 = 0;
            field533 = arg0;
            field534 = arg1;
            field341.method2631(149);
            field341.method2441(arg3);
            field341.method2415(Statics.field2719 + arg0);
            field341.method2499(class137.field2102[82] ? 1 : 0);
            field341.method2369(Statics.field607 + arg1);
        }
        if (arg2 == 29) {
            field341.method2631(116);
            field341.method2556(arg1);
            class173 var9 = class173.method2977(arg1);
            if (var9.field2818 != null && var9.field2818[0][0] == 5) {
                int var10 = var9.field2818[0][1];
                if (class176.field2879[var10] != var9.field2844[0]) {
                    class176.field2879[var10] = var9.field2844[0];
                    method806(var10);
                }
            }
        }
        if (arg2 == 24) {
            class173 var11 = class173.method2977(arg1);
            boolean var12 = true;
            if (var11.field2777 > 0) {
                var12 = method2695(var11);
            }
            if (var12) {
                field341.method2631(116);
                field341.method2556(arg1);
            }
        }
        if (arg2 == 25) {
            class173 var13 = class173.method2077(arg1, arg0);
            if (var13 != null) {
                method93();
                int var16 = method2693(var13);
                int var17 = var16 >> 11 & 0x3F;
                method1783(arg1, arg0, var17, var13.field2850);
                field451 = 0;
                int var18 = method2693(var13);
                int var19 = var18 >> 11 & 0x3F;
                String var20;
                if (var19 == 0) {
                    var20 = null;
                } else if (var13.field2809 == null || var13.field2809.trim().length() == 0) {
                    var20 = null;
                } else {
                    var20 = var13.field2809;
                }
                field311 = var20;
                if (field311 == null) {
                    field311 = "Null";
                }
                if (var13.field2820) {
                    field458 = var13.field2723 + class2.method951(16777215);
                } else {
                    field458 = class2.method951(65280) + var13.field2789 + class2.method951(16777215);
                }
            }
            return;
        }
        if (arg2 == 1004) {
            field408 = arg6;
            field520 = arg7;
            field411 = 2;
            field429 = 0;
            field341.method2631(79);
            field341.method2441(arg3);
        }
        if (arg2 == 58) {
            class173 var21 = class173.method2077(arg1, arg0);
            if (var21 != null) {
                field341.method2631(174);
                field341.method2369(var21.field2850);
                field341.method2441(arg0);
                field341.method2382(Statics.field2211);
                field341.method2441(field455);
                field341.method2369(field456);
                field341.method2427(arg1);
            }
        }
        if (arg2 == 23) {
            Statics.field649.method1827(Statics.field721, arg0, arg1);
        }
        if (arg2 == 7) {
            class35 var22 = field322[arg3];
            if (var22 != null) {
                field408 = arg6;
                field520 = arg7;
                field411 = 2;
                field429 = 0;
                field533 = arg0;
                field534 = arg1;
                field341.method2631(53);
                field341.method2415(arg3);
                field341.method2427(Statics.field2074);
                field341.method2369(Statics.field375);
                field341.method2499(class137.field2102[82] ? 1 : 0);
                field341.method2415(Statics.field2717);
            }
        }
        if (arg2 == 8) {
            class35 var23 = field322[arg3];
            if (var23 != null) {
                field408 = arg6;
                field520 = arg7;
                field411 = 2;
                field429 = 0;
                field533 = arg0;
                field534 = arg1;
                field341.method2631(124);
                field341.method2415(field455);
                field341.method2426(Statics.field2211);
                field341.method2415(arg3);
                field341.method2397(class137.field2102[82] ? 1 : 0);
            }
        }
        if (arg2 == 1) {
            field408 = arg6;
            field520 = arg7;
            field411 = 2;
            field429 = 0;
            field533 = arg0;
            field534 = arg1;
            field341.method2631(154);
            field341.method2369(Statics.field2719 + arg0);
            field341.method2408(class137.field2102[82] ? 1 : 0);
            field341.method2369(Statics.field375);
            field341.method2441(Statics.field607 + arg1);
            field341.method2369(Statics.field2717);
            field341.method2441(arg3 >> 14 & 0x7FFF);
            field341.method2427(Statics.field2074);
        }
        if (arg2 == 43) {
            field341.method2631(135);
            field341.method2427(arg1);
            field341.method2415(arg0);
            field341.method2415(arg3);
            field412 = 0;
            Statics.field171 = class173.method2977(arg1);
            field413 = arg0;
        }
        if (arg2 == 11) {
            class35 var24 = field322[arg3];
            if (var24 != null) {
                field408 = arg6;
                field520 = arg7;
                field411 = 2;
                field429 = 0;
                field533 = arg0;
                field534 = arg1;
                field341.method2631(132);
                field341.method2408(class137.field2102[82] ? 1 : 0);
                field341.method2582(arg3);
            }
        }
        if (arg2 == 28) {
            field341.method2631(116);
            field341.method2556(arg1);
            class173 var25 = class173.method2977(arg1);
            if (var25.field2818 != null && var25.field2818[0][0] == 5) {
                int var26 = var25.field2818[0][1];
                class176.field2879[var26] = 1 - class176.field2879[var26];
                method806(var26);
            }
        }
        if (arg2 == 20) {
            field408 = arg6;
            field520 = arg7;
            field411 = 2;
            field429 = 0;
            field533 = arg0;
            field534 = arg1;
            field341.method2631(3);
            field341.method2441(arg3);
            field341.method2499(class137.field2102[82] ? 1 : 0);
            field341.method2441(Statics.field2719 + arg0);
            field341.method2441(Statics.field607 + arg1);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class173 var27 = class173.method2077(arg1, arg0);
            if (var27 != null) {
                method180(arg3, arg1, arg0, var27.field2850, arg5);
            }
        }
        if (arg2 == 4) {
            field408 = arg6;
            field520 = arg7;
            field411 = 2;
            field429 = 0;
            field533 = arg0;
            field534 = arg1;
            field341.method2631(215);
            field341.method2369(arg3 >> 14 & 0x7FFF);
            field341.method2397(class137.field2102[82] ? 1 : 0);
            field341.method2369(Statics.field2719 + arg0);
            field341.method2582(Statics.field607 + arg1);
        }
        if (arg2 == 17) {
            field408 = arg6;
            field520 = arg7;
            field411 = 2;
            field429 = 0;
            field533 = arg0;
            field534 = arg1;
            field341.method2631(239);
            field341.method2369(field455);
            field341.method2441(Statics.field607 + arg1);
            field341.method2382(Statics.field2211);
            field341.method2415(arg3);
            field341.method2369(Statics.field2719 + arg0);
            field341.method2407(class137.field2102[82] ? 1 : 0);
        }
        if (arg2 == 38) {
            method93();
            class173 var28 = class173.method2977(arg1);
            field451 = 1;
            Statics.field2717 = arg0;
            Statics.field2074 = arg1;
            Statics.field375 = arg3;
            method2263(var28);
            field438 = class2.method951(16748608) + class52.method588(arg3).field1151 + class2.method951(16777215);
            if (field438 == null) {
                field438 = "null";
            }
            return;
        }
        if (arg2 == 50) {
            class3 var29 = field421[arg3];
            if (var29 != null) {
                field408 = arg6;
                field520 = arg7;
                field411 = 2;
                field429 = 0;
                field533 = arg0;
                field534 = arg1;
                field341.method2631(107);
                field341.method2415(arg3);
                field341.method2499(class137.field2102[82] ? 1 : 0);
            }
        }
        if (arg2 == 10) {
            class35 var30 = field322[arg3];
            if (var30 != null) {
                field408 = arg6;
                field520 = arg7;
                field411 = 2;
                field429 = 0;
                field533 = arg0;
                field534 = arg1;
                field341.method2631(185);
                field341.method2407(class137.field2102[82] ? 1 : 0);
                field341.method2369(arg3);
            }
        }
        if (arg2 == 47) {
            class3 var31 = field421[arg3];
            if (var31 != null) {
                field408 = arg6;
                field520 = arg7;
                field411 = 2;
                field429 = 0;
                field533 = arg0;
                field534 = arg1;
                field341.method2631(142);
                field341.method2407(class137.field2102[82] ? 1 : 0);
                field341.method2582(arg3);
            }
        }
        if (arg2 == 13) {
            class35 var32 = field322[arg3];
            if (var32 != null) {
                field408 = arg6;
                field520 = arg7;
                field411 = 2;
                field429 = 0;
                field533 = arg0;
                field534 = arg1;
                field341.method2631(69);
                field341.method2499(class137.field2102[82] ? 1 : 0);
                field341.method2415(arg3);
            }
        }
        if (arg2 == 15) {
            class3 var33 = field421[arg3];
            if (var33 != null) {
                field408 = arg6;
                field520 = arg7;
                field411 = 2;
                field429 = 0;
                field533 = arg0;
                field534 = arg1;
                field341.method2631(68);
                field341.method2415(arg3);
                field341.method2382(Statics.field2211);
                field341.method2397(class137.field2102[82] ? 1 : 0);
                field341.method2369(field455);
            }
        }
        if (arg2 == 40) {
            field341.method2631(143);
            field341.method2369(arg3);
            field341.method2556(arg1);
            field341.method2582(arg0);
            field412 = 0;
            Statics.field171 = class173.method2977(arg1);
            field413 = arg0;
        }
        if (arg2 == 9) {
            class35 var34 = field322[arg3];
            if (var34 != null) {
                field408 = arg6;
                field520 = arg7;
                field411 = 2;
                field429 = 0;
                field533 = arg0;
                field534 = arg1;
                field341.method2631(165);
                field341.method2441(arg3);
                field341.method2499(class137.field2102[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field341.method2631(108);
            field341.method2415(arg3);
            field341.method2441(arg0);
            field341.method2382(arg1);
            field412 = 0;
            Statics.field171 = class173.method2977(arg1);
            field413 = arg0;
        }
        if (arg2 == 32) {
            field341.method2631(40);
            field341.method2441(field455);
            field341.method2441(arg0);
            field341.method2369(arg3);
            field341.method2426(Statics.field2211);
            field341.method2426(arg1);
            field412 = 0;
            Statics.field171 = class173.method2977(arg1);
            field413 = arg0;
        }
        if (arg2 == 49) {
            class3 var35 = field421[arg3];
            if (var35 != null) {
                field408 = arg6;
                field520 = arg7;
                field411 = 2;
                field429 = 0;
                field533 = arg0;
                field534 = arg1;
                field341.method2631(153);
                field341.method2407(class137.field2102[82] ? 1 : 0);
                field341.method2582(arg3);
            }
        }
        if (arg2 == 1002) {
            field408 = arg6;
            field520 = arg7;
            field411 = 2;
            field429 = 0;
            field341.method2631(216);
            field341.method2582(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 41) {
            field341.method2631(247);
            field341.method2415(arg3);
            field341.method2426(arg1);
            field341.method2369(arg0);
            field412 = 0;
            Statics.field171 = class173.method2977(arg1);
            field413 = arg0;
        }
        if (arg2 == 51) {
            class3 var36 = field421[arg3];
            if (var36 != null) {
                field408 = arg6;
                field520 = arg7;
                field411 = 2;
                field429 = 0;
                field533 = arg0;
                field534 = arg1;
                field341.method2631(170);
                field341.method2369(arg3);
                field341.method2408(class137.field2102[82] ? 1 : 0);
            }
        }
        if (arg2 == 34) {
            field341.method2631(172);
            field341.method2441(arg3);
            field341.method2556(arg1);
            field341.method2441(arg0);
            field412 = 0;
            Statics.field171 = class173.method2977(arg1);
            field413 = arg0;
        }
        if (arg2 == 12) {
            class35 var37 = field322[arg3];
            if (var37 != null) {
                field408 = arg6;
                field520 = arg7;
                field411 = 2;
                field429 = 0;
                field533 = arg0;
                field534 = arg1;
                field341.method2631(30);
                field341.method2582(arg3);
                field341.method2499(class137.field2102[82] ? 1 : 0);
            }
        }
        if (arg2 == 37) {
            field341.method2631(94);
            field341.method2441(arg3);
            field341.method2582(arg0);
            field341.method2427(arg1);
            field412 = 0;
            Statics.field171 = class173.method2977(arg1);
            field413 = arg0;
        }
        if (arg2 == 44) {
            class3 var38 = field421[arg3];
            if (var38 != null) {
                field408 = arg6;
                field520 = arg7;
                field411 = 2;
                field429 = 0;
                field533 = arg0;
                field534 = arg1;
                field341.method2631(208);
                field341.method2397(class137.field2102[82] ? 1 : 0);
                field341.method2369(arg3);
            }
        }
        if (arg2 == 42) {
            field341.method2631(138);
            field341.method2582(arg0);
            field341.method2556(arg1);
            field341.method2415(arg3);
            field412 = 0;
            Statics.field171 = class173.method2977(arg1);
            field413 = arg0;
        }
        if (arg2 == 2) {
            field408 = arg6;
            field520 = arg7;
            field411 = 2;
            field429 = 0;
            field533 = arg0;
            field534 = arg1;
            field341.method2631(206);
            field341.method2441(Statics.field2719 + arg0);
            field341.method2427(Statics.field2211);
            field341.method2582(arg3 >> 14 & 0x7FFF);
            field341.method2415(field455);
            field341.method2415(Statics.field607 + arg1);
            field341.method2397(class137.field2102[82] ? 1 : 0);
        }
        if (arg2 == 6) {
            field408 = arg6;
            field520 = arg7;
            field411 = 2;
            field429 = 0;
            field533 = arg0;
            field534 = arg1;
            field341.method2631(33);
            field341.method2415(Statics.field607 + arg1);
            field341.method2499(class137.field2102[82] ? 1 : 0);
            field341.method2415(Statics.field2719 + arg0);
            field341.method2582(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 35) {
            field341.method2631(24);
            field341.method2556(arg1);
            field341.method2369(arg3);
            field341.method2415(arg0);
            field412 = 0;
            Statics.field171 = class173.method2977(arg1);
            field413 = arg0;
        }
        if (arg2 == 45) {
            class3 var39 = field421[arg3];
            if (var39 != null) {
                field408 = arg6;
                field520 = arg7;
                field411 = 2;
                field429 = 0;
                field533 = arg0;
                field534 = arg1;
                field341.method2631(146);
                field341.method2582(arg3);
                field341.method2397(class137.field2102[82] ? 1 : 0);
            }
        }
        if (arg2 == 30 && field463 == null) {
            field341.method2631(177);
            field341.method2582(arg0);
            field341.method2426(arg1);
            field463 = class173.method2077(arg1, arg0);
            method2263(field463);
        }
        if (arg2 == 18) {
            field408 = arg6;
            field520 = arg7;
            field411 = 2;
            field429 = 0;
            field533 = arg0;
            field534 = arg1;
            field341.method2631(210);
            field341.method2582(Statics.field2719 + arg0);
            field341.method2499(class137.field2102[82] ? 1 : 0);
            field341.method2441(Statics.field607 + arg1);
            field341.method2415(arg3);
        }
        if (arg2 == 48) {
            class3 var40 = field421[arg3];
            if (var40 != null) {
                field408 = arg6;
                field520 = arg7;
                field411 = 2;
                field429 = 0;
                field533 = arg0;
                field534 = arg1;
                field341.method2631(28);
                field341.method2369(arg3);
                field341.method2408(class137.field2102[82] ? 1 : 0);
            }
        }
        if (arg2 == 39) {
            field341.method2631(159);
            field341.method2426(arg1);
            field341.method2415(arg3);
            field341.method2415(arg0);
            field412 = 0;
            Statics.field171 = class173.method2977(arg1);
            field413 = arg0;
        }
        if (arg2 == 1003) {
            field408 = arg6;
            field520 = arg7;
            field411 = 2;
            field429 = 0;
            class35 var41 = field322[arg3];
            if (var41 != null) {
                class40 var42 = var41.field786;
                if (var42.field919 != null) {
                    var42 = var42.method742();
                }
                if (var42 != null) {
                    field341.method2631(235);
                    field341.method2369(var42.field893);
                }
            }
        }
        if (arg2 == 46) {
            class3 var43 = field421[arg3];
            if (var43 != null) {
                field408 = arg6;
                field520 = arg7;
                field411 = 2;
                field429 = 0;
                field533 = arg0;
                field534 = arg1;
                field341.method2631(224);
                field341.method2499(class137.field2102[82] ? 1 : 0);
                field341.method2582(arg3);
            }
        }
        if (arg2 == 1001) {
            field408 = arg6;
            field520 = arg7;
            field411 = 2;
            field429 = 0;
            field533 = arg0;
            field534 = arg1;
            field341.method2631(241);
            field341.method2408(class137.field2102[82] ? 1 : 0);
            field341.method2415(Statics.field607 + arg1);
            field341.method2441(Statics.field2719 + arg0);
            field341.method2582(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 26) {
            method715();
        }
        if (arg2 == 33) {
            field341.method2631(227);
            field341.method2415(arg0);
            field341.method2369(arg3);
            field341.method2556(arg1);
            field412 = 0;
            Statics.field171 = class173.method2977(arg1);
            field413 = arg0;
        }
        if (arg2 == 1005) {
            class173 var44 = class173.method2977(arg1);
            if (var44 == null || var44.field2817[arg0] < 100000) {
                field341.method2631(79);
                field341.method2441(arg3);
            } else {
                class12.method974(27, "", var44.field2817[arg0] + " x " + class52.method588(arg3).field1151);
            }
            field412 = 0;
            Statics.field171 = class173.method2977(arg1);
            field413 = arg0;
        }
        if (field451 != 0) {
            field451 = 0;
            method2263(class173.method2977(Statics.field2074));
        }
        if (field454) {
            method93();
        }
        if (Statics.field171 != null && field412 == 0) {
            method2263(Statics.field171);
        }
    }

    @ObfuscatedName("ci.bt(IIIIB)V")
    public static void method1783(int arg0, int arg1, int arg2, int arg3) {
        class173 var4 = class173.method2077(arg0, arg1);
        if (var4 != null && var4.field2801 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field9 = var4.field2801;
            class37.method2681(var5, 200000);
        }
        field456 = arg3;
        field454 = true;
        Statics.field2211 = arg0;
        field455 = arg1;
        Statics.field1542 = arg2;
        method2263(var4);
    }

    @ObfuscatedName("g.bf(I)V")
    public static void method93() {
        if (!field454) {
            return;
        }
        class173 var0 = class173.method2077(Statics.field2211, field455);
        if (var0 != null && var0.field2822 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field9 = var0.field2822;
            class37.method2681(var1, 200000);
        }
        field454 = false;
        method2263(var0);
    }

    @ObfuscatedName("x.bw(IIIILjava/lang/String;I)V")
    public static void method180(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class173 var5 = class173.method2077(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2830 != null) {
            class1 var6 = new class1();
            var6.field3 = var5;
            var6.field6 = arg0;
            var6.field1 = arg4;
            var6.field9 = var5.field2830;
            class37.method2681(var6, 200000);
        }
        boolean var7 = true;
        if (var5.field2777 > 0) {
            var7 = method2695(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method2693(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            field341.method2631(13);
            field341.method2556(arg1);
            field341.method2369(arg2);
            field341.method2369(arg3);
        }
        if (arg0 == 2) {
            field341.method2631(80);
            field341.method2556(arg1);
            field341.method2369(arg2);
            field341.method2369(arg3);
        }
        if (arg0 == 3) {
            field341.method2631(81);
            field341.method2556(arg1);
            field341.method2369(arg2);
            field341.method2369(arg3);
        }
        if (arg0 == 4) {
            field341.method2631(191);
            field341.method2556(arg1);
            field341.method2369(arg2);
            field341.method2369(arg3);
        }
        if (arg0 == 5) {
            field341.method2631(120);
            field341.method2556(arg1);
            field341.method2369(arg2);
            field341.method2369(arg3);
        }
        if (arg0 == 6) {
            field341.method2631(122);
            field341.method2556(arg1);
            field341.method2369(arg2);
            field341.method2369(arg3);
        }
        if (arg0 == 7) {
            field341.method2631(192);
            field341.method2556(arg1);
            field341.method2369(arg2);
            field341.method2369(arg3);
        }
        if (arg0 == 8) {
            field341.method2631(90);
            field341.method2556(arg1);
            field341.method2369(arg2);
            field341.method2369(arg3);
        }
        if (arg0 == 9) {
            field341.method2631(245);
            field341.method2556(arg1);
            field341.method2369(arg2);
            field341.method2369(arg3);
        }
        if (arg0 == 10) {
            field341.method2631(64);
            field341.method2556(arg1);
            field341.method2369(arg2);
            field341.method2369(arg3);
        }
    }

    @ObfuscatedName("el.bp(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2886(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field439 || field440 >= 500) {
            return;
        }
        field445[field440] = arg0;
        field446[field440] = arg1;
        field379[field440] = arg2;
        field444[field440] = arg3;
        field441[field440] = arg4;
        field389[field440] = arg5;
        field440++;
    }

    @ObfuscatedName("ek.bh(I)V")
    public static void method2818() {
        for (int var0 = 0; var0 < field440; var0++) {
            int var1 = field379[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field440 - 1) {
                    for (int var3 = var0; var3 < field440 - 1; var3++) {
                        field445[var3] = field445[var3 + 1];
                        field446[var3] = field446[var3 + 1];
                        field379[var3] = field379[var3 + 1];
                        field444[var3] = field444[var3 + 1];
                        field441[var3] = field441[var3 + 1];
                        field389[var3] = field389[var3 + 1];
                    }
                }
                field440--;
            }
        }
    }

    @ObfuscatedName("fy.ba(II)Ljava/lang/String;")
    public static String method3219(int arg0) {
        return field446[arg0].length() > 0 ? field445[arg0] + class157.field2506 + field446[arg0] : field445[arg0];
    }

    @ObfuscatedName("av.cl(IIIIB)V")
    public static final void method918(int arg0, int arg1, int arg2, int arg3) {
        if (field451 == 0 && !field454) {
            method2886(class157.field2474, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class105.field1799; var6++) {
            int var7 = class105.field1817[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field649.method1820(Statics.field721, var8, var9, var7) >= 0) {
                    class41 var12 = class41.method2325(var11);
                    if (var12.field969 != null) {
                        var12 = var12.method775();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field451 == 1) {
                        method2886(class157.field2430, field438 + " " + class2.field21 + " " + class2.method951(65535) + var12.field938, 1, var7, var8, var9);
                    } else if (!field454) {
                        String[] var13 = var12.field955;
                        if (field470) {
                            var13 = method2702(var13);
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
                                    method2886(var13[var14], class2.method951(65535) + var12.field938, var15, var7, var8, var9);
                                }
                            }
                        }
                        method2886(class157.field2455, class2.method951(65535) + var12.field938, 1002, var12.field962 << 14, var8, var9);
                    } else if ((Statics.field1542 & 0x4) == 4) {
                        method2886(field311, field458 + " " + class2.field21 + " " + class2.method951(65535) + var12.field938, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class35 var16 = field322[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field786.field907 == 1 && (var16.field853 & 0x7F) == 64 && (var16.field843 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field336; var17++) {
                            class35 var18 = field322[field337[var17]];
                            if (var18 != null && var16 != var18 && var18.field786.field907 == 1 && var16.field853 == var18.field853 && var16.field843 == var18.field843) {
                                method693(var18.field786, field337[var17], var8, var9);
                            }
                        }
                        int var19 = class33.field774;
                        int[] var20 = class33.field769;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class3 var22 = field421[var20[var21]];
                            if (var22 != null && var16.field853 == var22.field853 && var16.field843 == var22.field843) {
                                method172(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method693(var16.field786, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var23 = field421[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field853 & 0x7F) == 64 && (var23.field843 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field336; var24++) {
                            class35 var25 = field322[field337[var24]];
                            if (var25 != null && var25.field786.field907 == 1 && var23.field853 == var25.field853 && var23.field843 == var25.field843) {
                                method693(var25.field786, field337[var24], var8, var9);
                            }
                        }
                        int var26 = class33.field774;
                        int[] var27 = class33.field769;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class3 var29 = field421[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field853 == var29.field853 && var23.field843 == var29.field843) {
                                method172(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field464 == var11) {
                        var4 = var7;
                    } else {
                        method172(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class199 var30 = field431[Statics.field721][var8][var9];
                    if (var30 != null) {
                        for (class29 var31 = (class29) var30.method3607(); var31 != null; var31 = (class29) var30.method3617()) {
                            class52 var32 = class52.method588(var31.field699);
                            if (field451 == 1) {
                                method2886(class157.field2430, field438 + " " + class2.field21 + " " + class2.method951(16748608) + var32.field1151, 16, var31.field699, var8, var9);
                            } else if (!field454) {
                                String[] var33 = var32.field1129;
                                if (field470) {
                                    var33 = method2702(var33);
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
                                        method2886(var33[var34], class2.method951(16748608) + var32.field1151, var35, var31.field699, var8, var9);
                                    } else if (var34 == 2) {
                                        method2886(class157.field2350, class2.method951(16748608) + var32.field1151, 20, var31.field699, var8, var9);
                                    }
                                }
                                method2886(class157.field2455, class2.method951(16748608) + var32.field1151, 1004, var31.field699, var8, var9);
                            } else if ((Statics.field1542 & 0x1) == 1) {
                                method2886(field311, field458 + " " + class2.field21 + " " + class2.method951(16748608) + var32.field1151, 17, var31.field699, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class3 var38 = field421[field464];
            method172(var38, field464, var36, var37);
        }
    }

    @ObfuscatedName("al.cm(Lak;IIII)V")
    public static final void method693(class40 arg0, int arg1, int arg2, int arg3) {
        if (field440 >= 400) {
            return;
        }
        if (arg0.field919 != null) {
            arg0 = arg0.method742();
        }
        if (arg0 == null || !arg0.field922 || arg0.field924 && field363 != arg1) {
            return;
        }
        String var4 = arg0.field917;
        if (arg0.field905 != 0) {
            var4 = var4 + method2722(arg0.field905, Statics.field101.field35) + " " + class2.field19 + class157.field2460 + arg0.field905 + class2.field20;
        }
        if (field451 == 1) {
            method2886(class157.field2430, field438 + " " + class2.field21 + " " + class2.method951(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field454) {
            String[] var5 = arg0.field909;
            if (field470) {
                var5 = method2702(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class157.field2456)) {
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
                        method2886(var5[var6], class2.method951(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class157.field2456)) {
                        short var9 = 0;
                        if (field457 == class21.field589 || field457 == class21.field594 && arg0.field905 > Statics.field101.field35) {
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
                        method2886(var5[var8], class2.method951(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method2886(class157.field2455, class2.method951(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1542 & 0x2) == 2) {
            method2886(field311, field458 + " " + class2.field21 + " " + class2.method951(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("i.cj(Lv;IIIB)V")
    public static final void method172(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field101 == arg0 || field440 >= 400) {
            return;
        }
        String var4;
        if (arg0.field34 == 0) {
            var4 = arg0.field41 + method2722(arg0.field35, Statics.field101.field35) + " " + class2.field19 + class157.field2460 + arg0.field35 + class2.field20;
        } else {
            var4 = arg0.field41 + " " + class2.field19 + class157.field2461 + arg0.field34 + class2.field20;
        }
        if (field451 == 1) {
            method2886(class157.field2430, field438 + " " + class2.field21 + " " + class2.method951(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field454) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field316[var5] != null) {
                    short var6 = 0;
                    if (field316[var5].equalsIgnoreCase(class157.field2456)) {
                        if (field457 == class21.field589 || field457 == class21.field594 && arg0.field35 > Statics.field101.field35) {
                            var6 = 2000;
                        }
                        if (Statics.field101.field49 != 0 && arg0.field49 != 0) {
                            if (Statics.field101.field49 == arg0.field49) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field366[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field426[var5] + var6;
                    method2886(field316[var5], class2.method951(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1542 & 0x8) == 8) {
            method2886(field311, field458 + " " + class2.field21 + " " + class2.method951(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field440; var9++) {
            if (field379[var9] == 23) {
                field446[var9] = class2.method951(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("en.cp(III)Ljava/lang/String;")
    public static final String method2722(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method951(16711680);
        } else if (var2 < -6) {
            return class2.method951(16723968);
        } else if (var2 < -3) {
            return class2.method951(16740352);
        } else if (var2 < 0) {
            return class2.method951(16756736);
        } else if (var2 > 9) {
            return class2.method951(65280);
        } else if (var2 > 6) {
            return class2.method951(4259584);
        } else if (var2 > 3) {
            return class2.method951(8453888);
        } else if (var2 > 0) {
            return class2.method951(12648192);
        } else {
            return class2.method951(16776960);
        }
    }

    @ObfuscatedName("gs.ck(IIIIIIIII)V")
    public static final void method3533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class173.method692(arg0)) {
            Statics.field280 = null;
            method2952(Statics.field2791[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field280 != null) {
                method2952(Statics.field280, -1412584499, arg1, arg2, arg3, arg4, Statics.field2241, Statics.field204, arg7);
                Statics.field280 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field504[var8] = true;
            }
        } else {
            field504[arg7] = true;
        }
    }

    @ObfuscatedName("ey.ci([Lfy;IIIIIIIII)V")
    public static final void method2952(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1710(arg2, arg3, arg4, arg5);
        class91.method1980();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class173 var10 = arg0[var9];
            if (var10 != null && (var10.field2786 == arg1 || arg1 == -1412584499 && field399 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field402[field502] = var10.field2863 + arg6;
                    field508[field502] = var10.field2746 + arg7;
                    field509[field502] = var10.field2747;
                    field510[field502] = var10.field2748;
                    var11 = ++field502 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2810 = var11;
                var10.field2862 = field303;
                if (!var10.field2820 || !method157(var10)) {
                    if (var10.field2777 > 0) {
                        method1489(var10);
                    }
                    int var12 = var10.field2863 + arg6;
                    int var13 = var10.field2746 + arg7;
                    int var14 = var10.field2772;
                    if (field399 == var10) {
                        if (arg1 != -1412584499 && !var10.field2811) {
                            Statics.field280 = arg0;
                            Statics.field2241 = arg6;
                            Statics.field204 = arg7;
                            continue;
                        }
                        if (field483 && field477) {
                            int var15 = class140.field2134;
                            int var16 = class140.field2135 * 782474221;
                            int var17 = var15 - field564;
                            int var18 = var16 - field428;
                            if (var17 < field459) {
                                var17 = field459;
                            }
                            if (var10.field2747 + var17 > field459 + field537.field2747) {
                                var17 = field459 + field537.field2747 - var10.field2747;
                            }
                            if (var18 < field479) {
                                var18 = field479;
                            }
                            if (var10.field2748 + var18 > field479 + field537.field2748) {
                                var18 = field479 + field537.field2748 - var10.field2748;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2811) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2734 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2734 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2747 + var12;
                        int var26 = var10.field2748 + var13;
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
                        int var29 = var10.field2747 + var12;
                        int var30 = var10.field2748 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2820 || var19 < var21 && var20 < var22) {
                        if (var10.field2777 != 0) {
                            if (var10.field2777 == 1336) {
                                if (field562) {
                                    var13 += 15;
                                    Statics.field25.method3832("Fps:" + field2192, var10.field2747 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field301) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field301) {
                                        var33 = 16711680;
                                    }
                                    Statics.field25.method3832("Mem:" + var32 + "k", var10.field2747 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2777 == 1337) {
                                field495 = var12;
                                field448 = var13;
                                method2823(var12, var13, var10.field2747, var10.field2748);
                                field504[var10.field2810] = true;
                                class80.method1710(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2777 == 1338) {
                                method2694(var10, var12, var13, var11);
                                class80.method1710(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2777 == 1339) {
                                class175 var34 = var10.method3220(false);
                                if (var34 != null) {
                                    if (field535 < 3) {
                                        Statics.field1527.method1698(var12, var13, var34.field2874, var34.field2872, 25, 25, field385, 256, var34.field2875, var34.field2873);
                                    } else {
                                        class80.method1718(var12, var13, 0, var34.field2875, var34.field2873);
                                    }
                                }
                                class80.method1710(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2734 == 0) {
                            if (!var10.field2820 && method157(var10) && Statics.field1158 != var10) {
                                continue;
                            }
                            if (!var10.field2820) {
                                if (var10.field2819 > var10.field2756 - var10.field2748) {
                                    var10.field2819 = var10.field2756 - var10.field2748;
                                }
                                if (var10.field2819 < 0) {
                                    var10.field2819 = 0;
                                }
                            }
                            method2952(arg0, var10.field2732, var19, var20, var21, var22, var12 - var10.field2753, var13 - var10.field2819, var11);
                            if (var10.field2854 != null) {
                                method2952(var10.field2854, var10.field2732, var19, var20, var21, var22, var12 - var10.field2753, var13 - var10.field2819, var11);
                            }
                            class4 var35 = (class4) field460.method3584((long) var10.field2732);
                            if (var35 != null) {
                                method3533(var35.field60, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class80.method1710(arg2, arg3, arg4, arg5);
                            class91.method1980();
                        }
                        if (field513 || field559[var11] || field511 > 1) {
                            if (var10.field2734 == 0 && !var10.field2820 && var10.field2756 > var10.field2748) {
                                int var36 = var10.field2747 + var12;
                                int var37 = var10.field2819;
                                int var38 = var10.field2748;
                                int var39 = var10.field2756;
                                Statics.field927[0].method1767(var36, var13);
                                Statics.field927[1].method1767(var36, var13 + var38 - 16);
                                class80.method1716(var36, var13 + 16, 16, var38 - 32, field378);
                                int var40 = (var38 - 32) * var38 / var39;
                                if (var40 < 8) {
                                    var40 = 8;
                                }
                                int var41 = (var38 - 32 - var40) * var37 / (var39 - var38);
                                class80.method1716(var36, var13 + 16 + var41, 16, var40, field570);
                                class80.method1715(var36, var13 + 16 + var41, var40, field381);
                                class80.method1715(var36 + 1, var13 + 16 + var41, var40, field381);
                                class80.method1755(var36, var13 + 16 + var41, 16, field381);
                                class80.method1755(var36, var13 + 17 + var41, 16, field381);
                                class80.method1715(var36 + 15, var13 + 16 + var41, var40, field380);
                                class80.method1715(var36 + 14, var13 + 17 + var41, var40 - 1, field380);
                                class80.method1755(var36, var13 + 15 + var41 + var40, 16, field380);
                                class80.method1755(var36 + 1, var13 + 14 + var41 + var40, 15, field380);
                            }
                            if (var10.field2734 != 1) {
                                if (var10.field2734 == 2) {
                                    int var42 = 0;
                                    for (int var43 = 0; var43 < var10.field2744; var43++) {
                                        for (int var44 = 0; var44 < var10.field2743; var44++) {
                                            int var45 = (var10.field2796 + 32) * var44 + var12;
                                            int var46 = (var10.field2797 + 32) * var43 + var13;
                                            if (var42 < 20) {
                                                var45 += var10.field2798[var42];
                                                var46 += var10.field2799[var42];
                                            }
                                            if (var10.field2808[var42] > 0) {
                                                boolean var47 = false;
                                                boolean var48 = false;
                                                int var49 = var10.field2808[var42] - 1;
                                                if (var45 + 32 > arg2 && var45 < arg4 && var46 + 32 > arg3 && var46 < arg5 || Statics.field1951 == var10 && field414 == var42) {
                                                    class79 var50;
                                                    if (field451 == 1 && Statics.field2717 == var42 && Statics.field2074 == var10.field2732) {
                                                        var50 = class52.method1251(var49, var10.field2817[var42], 2, 0, 2, false);
                                                    } else {
                                                        var50 = class52.method1251(var49, var10.field2817[var42], 1, 3153952, 2, false);
                                                    }
                                                    if (var50 == null) {
                                                        method2263(var10);
                                                    } else if (Statics.field1951 == var10 && field414 == var42) {
                                                        int var51 = class140.field2134 - field415;
                                                        int var52 = class140.field2135 * 782474221 - field329;
                                                        if (var51 < 5 && var51 > -5) {
                                                            var51 = 0;
                                                        }
                                                        if (var52 < 5 && var52 > -5) {
                                                            var52 = 0;
                                                        }
                                                        if (field419 < 5) {
                                                            var51 = 0;
                                                            var52 = 0;
                                                        }
                                                        var50.method1626(var45 + var51, var46 + var52, 128);
                                                        if (arg1 != -1) {
                                                            class173 var53 = arg0[arg1 & 0xFFFF];
                                                            if (var46 + var52 < class80.field1420 && var53.field2819 > 0) {
                                                                int var54 = field472 * (class80.field1420 - var46 - var52) / 3;
                                                                if (var54 > field472 * 10) {
                                                                    var54 = field472 * 10;
                                                                }
                                                                if (var54 > var53.field2819) {
                                                                    var54 = var53.field2819;
                                                                }
                                                                var53.field2819 -= var54;
                                                                field329 += var54;
                                                                method2263(var53);
                                                            }
                                                            if (var46 + var52 + 32 > class80.field1418 && var53.field2819 < var53.field2756 - var53.field2748) {
                                                                int var55 = field472 * (var46 + var52 + 32 - class80.field1418) / 3;
                                                                if (var55 > field472 * 10) {
                                                                    var55 = field472 * 10;
                                                                }
                                                                if (var55 > var53.field2756 - var53.field2748 - var53.field2819) {
                                                                    var55 = var53.field2756 - var53.field2748 - var53.field2819;
                                                                }
                                                                var53.field2819 += var55;
                                                                field329 -= var55;
                                                                method2263(var53);
                                                            }
                                                        }
                                                    } else if (Statics.field171 == var10 && field413 == var42) {
                                                        var50.method1626(var45, var46, 128);
                                                    } else {
                                                        var50.method1646(var45, var46);
                                                    }
                                                }
                                            } else if (var10.field2800 != null && var42 < 20) {
                                                class79 var56 = var10.method3218(var42);
                                                if (var56 != null) {
                                                    var56.method1646(var45, var46);
                                                } else if (class173.field2845) {
                                                    method2263(var10);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                } else if (var10.field2734 == 3) {
                                    int var57;
                                    if (method723(var10)) {
                                        var57 = var10.field2758;
                                        if (Statics.field1158 == var10 && var10.field2729 != 0) {
                                            var57 = var10.field2729;
                                        }
                                    } else {
                                        var57 = var10.field2745;
                                        if (Statics.field1158 == var10 && var10.field2759 != 0) {
                                            var57 = var10.field2759;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2761) {
                                            class80.method1716(var12, var13, var10.field2747, var10.field2748, var57);
                                        } else {
                                            class80.method1711(var12, var13, var10.field2747, var10.field2748, var57);
                                        }
                                    } else if (var10.field2761) {
                                        class80.method1708(var12, var13, var10.field2747, var10.field2748, var57, 256 - (var14 & 0xFF));
                                    } else {
                                        class80.method1712(var12, var13, var10.field2747, var10.field2748, var57, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2734 == 4) {
                                    class224 var58 = var10.method3257();
                                    if (var58 != null) {
                                        String var59 = var10.field2790;
                                        int var60;
                                        if (method723(var10)) {
                                            var60 = var10.field2758;
                                            if (Statics.field1158 == var10 && var10.field2729 != 0) {
                                                var60 = var10.field2729;
                                            }
                                            if (var10.field2848.length() > 0) {
                                                var59 = var10.field2848;
                                            }
                                        } else {
                                            var60 = var10.field2745;
                                            if (Statics.field1158 == var10 && var10.field2759 != 0) {
                                                var60 = var10.field2759;
                                            }
                                        }
                                        if (var10.field2820 && var10.field2850 != -1) {
                                            class52 var61 = class52.method588(var10.field2850);
                                            var59 = var61.field1151;
                                            if (var59 == null) {
                                                var59 = "null";
                                            }
                                            if ((var61.field1109 == 1 || var10.field2851 != 1) && var10.field2851 != -1) {
                                                var59 = class2.method951(16748608) + var59 + class2.field23 + " " + 'x' + method2081(var10.field2851);
                                            }
                                        }
                                        if (field463 == var10) {
                                            class157 var10000 = (class157) null;
                                            var59 = class157.field2346;
                                            var60 = var10.field2745;
                                        }
                                        if (!var10.field2820) {
                                            var59 = method914(var59, var10);
                                        }
                                        var58.method3834(var59, var12, var13, var10.field2747, var10.field2748, var60, var10.field2795 ? 0 : -1, var10.field2793, var10.field2794, var10.field2792);
                                    } else if (class173.field2845) {
                                        method2263(var10);
                                    }
                                } else if (var10.field2734 == 5) {
                                    if (var10.field2820) {
                                        class79 var63;
                                        if (var10.field2850 == -1) {
                                            var63 = var10.method3259(false);
                                        } else {
                                            var63 = class52.method1251(var10.field2850, var10.field2851, var10.field2769, var10.field2770, var10.field2802, false);
                                        }
                                        if (var63 != null) {
                                            int var64 = var63.field1407;
                                            int var65 = var63.field1412;
                                            if (var10.field2768) {
                                                class80.method1754(var12, var13, var10.field2747 + var12, var10.field2748 + var13);
                                                int var66 = (var10.field2747 + (var64 - 1)) / var64;
                                                int var67 = (var10.field2748 + (var65 - 1)) / var65;
                                                for (int var68 = 0; var68 < var66; var68++) {
                                                    for (int var69 = 0; var69 < var67; var69++) {
                                                        if (var10.field2727 != 0) {
                                                            var63.method1624(var64 / 2 + var64 * var68 + var12, var65 / 2 + var65 * var69 + var13, var10.field2727, 4096);
                                                        } else if (var14 == 0) {
                                                            var63.method1646(var64 * var68 + var12, var65 * var69 + var13);
                                                        } else {
                                                            var63.method1626(var64 * var68 + var12, var65 * var69 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1710(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var70 = var10.field2747 * 4096 / var64;
                                                if (var10.field2727 != 0) {
                                                    var63.method1624(var10.field2747 / 2 + var12, var10.field2748 / 2 + var13, var10.field2727, var70);
                                                } else if (var14 != 0) {
                                                    var63.method1619(var12, var13, var10.field2747, var10.field2748, 256 - (var14 & 0xFF));
                                                } else if (var10.field2747 == var64 && var10.field2748 == var65) {
                                                    var63.method1646(var12, var13);
                                                } else {
                                                    var63.method1613(var12, var13, var10.field2747, var10.field2748);
                                                }
                                            }
                                        } else if (class173.field2845) {
                                            method2263(var10);
                                        }
                                    } else {
                                        class79 var62 = var10.method3259(method723(var10));
                                        if (var62 != null) {
                                            var62.method1646(var12, var13);
                                        } else if (class173.field2845) {
                                            method2263(var10);
                                        }
                                    }
                                } else if (var10.field2734 == 6) {
                                    boolean var71 = method723(var10);
                                    int var72;
                                    if (var71) {
                                        var72 = var10.field2778;
                                    } else {
                                        var72 = var10.field2861;
                                    }
                                    class105 var73 = null;
                                    int var74 = 0;
                                    if (var10.field2850 != -1) {
                                        class52 var75 = class52.method588(var10.field2850);
                                        if (var75 != null) {
                                            class52 var76 = var75.method1050(var10.field2851);
                                            var73 = var76.method1008(1);
                                            if (var73 == null) {
                                                method2263(var10);
                                            } else {
                                                var73.method2220();
                                                var74 = var73.field1450 / 2;
                                            }
                                        }
                                    } else if (var10.field2839 == 5) {
                                        if (var10.field2774 == 0) {
                                            var73 = field573.method3335((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var73 = Statics.field101.method32();
                                        }
                                    } else if (var72 == -1) {
                                        var73 = var10.method3214((class43) null, -1, var71, Statics.field101.field32);
                                        if (var73 == null && class173.field2845) {
                                            method2263(var10);
                                        }
                                    } else {
                                        class43 var77 = class43.method733(var72);
                                        var73 = var10.method3214(var77, var10.field2841, var71, Statics.field101.field32);
                                        if (var73 == null && class173.field2845) {
                                            method2263(var10);
                                        }
                                    }
                                    class91.method1981(var10.field2747 / 2 + var12, var10.field2748 / 2 + var13);
                                    int var78 = var10.field2784 * class91.field1585[var10.field2725] >> 16;
                                    int var79 = var10.field2784 * class91.field1586[var10.field2725] >> 16;
                                    if (var73 != null) {
                                        if (var10.field2820) {
                                            var73.method2220();
                                            if (var10.field2787) {
                                                var73.method2189(0, var10.field2782, var10.field2783, var10.field2725, var10.field2779, var10.field2781 + var74 + var78, var10.field2781 + var79, var10.field2784);
                                            } else {
                                                var73.method2188(0, var10.field2782, var10.field2783, var10.field2725, var10.field2779, var10.field2781 + var74 + var78, var10.field2781 + var79);
                                            }
                                        } else {
                                            var73.method2188(0, var10.field2782, 0, var10.field2725, 0, var78, var79);
                                        }
                                    }
                                    class91.method2016();
                                } else {
                                    if (var10.field2734 == 7) {
                                        class224 var80 = var10.method3257();
                                        if (var80 == null) {
                                            if (class173.field2845) {
                                                method2263(var10);
                                            }
                                            continue;
                                        }
                                        int var81 = 0;
                                        for (int var82 = 0; var82 < var10.field2744; var82++) {
                                            for (int var83 = 0; var83 < var10.field2743; var83++) {
                                                if (var10.field2808[var81] > 0) {
                                                    class52 var84 = class52.method588(var10.field2808[var81] - 1);
                                                    String var85;
                                                    if (var84.field1109 != 1 && var10.field2817[var81] == 1) {
                                                        var85 = class2.method951(16748608) + var84.field1151 + class2.field23;
                                                    } else {
                                                        var85 = class2.method951(16748608) + var84.field1151 + class2.field23 + " " + 'x' + method2081(var10.field2817[var81]);
                                                    }
                                                    int var86 = (var10.field2796 + 115) * var83 + var12;
                                                    int var87 = (var10.field2797 + 12) * var82 + var13;
                                                    if (var10.field2793 == 0) {
                                                        var80.method3844(var85, var86, var87, var10.field2745, var10.field2795 ? 0 : -1);
                                                    } else if (var10.field2793 == 1) {
                                                        var80.method3903(var85, var10.field2747 / 2 + var86, var87, var10.field2745, var10.field2795 ? 0 : -1);
                                                    } else {
                                                        var80.method3832(var85, var10.field2747 + var86 - 1, var87, var10.field2745, var10.field2795 ? 0 : -1);
                                                    }
                                                }
                                                var81++;
                                            }
                                        }
                                    }
                                    if (var10.field2734 == 8 && Statics.field1746 == var10 && field503 == field449) {
                                        int var88 = 0;
                                        int var89 = 0;
                                        class224 var90 = Statics.field25;
                                        String var91 = var10.field2790;
                                        String var92 = method914(var91, var10);
                                        while (var92.length() > 0) {
                                            int var93 = var92.indexOf(class2.field22);
                                            String var94;
                                            if (var93 == -1) {
                                                var94 = var92;
                                                var92 = "";
                                            } else {
                                                var94 = var92.substring(0, var93);
                                                var92 = var92.substring(var93 + 4);
                                            }
                                            int var95 = var90.method3827(var94);
                                            if (var95 > var88) {
                                                var88 = var95;
                                            }
                                            var89 += var90.field3177 + 1;
                                        }
                                        var88 += 6;
                                        var89 += 7;
                                        int var96 = var10.field2747 + var12 - 5 - var88;
                                        int var97 = var10.field2748 + var13 + 5;
                                        if (var96 < var12 + 5) {
                                            var96 = var12 + 5;
                                        }
                                        if (var88 + var96 > arg4) {
                                            var96 = arg4 - var88;
                                        }
                                        if (var89 + var97 > arg5) {
                                            var97 = arg5 - var89;
                                        }
                                        class80.method1716(var96, var97, var88, var89, 16777120);
                                        class80.method1711(var96, var97, var88, var89, 0);
                                        String var98 = var10.field2790;
                                        int var99 = var90.field3177 + var97 + 2;
                                        String var100 = method914(var98, var10);
                                        while (var100.length() > 0) {
                                            int var101 = var100.indexOf(class2.field22);
                                            String var102;
                                            if (var101 == -1) {
                                                var102 = var100;
                                                var100 = "";
                                            } else {
                                                var102 = var100.substring(0, var101);
                                                var100 = var100.substring(var101 + 4);
                                            }
                                            var90.method3844(var102, var96 + 3, var99, 0, -1);
                                            var99 += var90.field3177 + 1;
                                        }
                                    }
                                    if (var10.field2734 == 9) {
                                        if (var10.field2763 == 1) {
                                            int var103;
                                            int var104;
                                            int var105;
                                            int var106;
                                            if (var10.field2764) {
                                                var103 = var12;
                                                var104 = var10.field2748 + var13;
                                                var105 = var10.field2747 + var12;
                                                var106 = var13;
                                            } else {
                                                var103 = var12;
                                                var104 = var13;
                                                var105 = var10.field2747 + var12;
                                                var106 = var10.field2748 + var13;
                                            }
                                            class80.method1747(var103, var104, var105, var106, var10.field2745);
                                        } else {
                                            int var107 = var10.field2747 >= 0 ? var10.field2747 : -var10.field2747;
                                            int var108 = var10.field2748 >= 0 ? var10.field2748 : -var10.field2748;
                                            int var109 = var107;
                                            if (var107 < var108) {
                                                var109 = var108;
                                            }
                                            if (var109 != 0) {
                                                int var110 = (var10.field2747 << 16) / var109;
                                                int var111 = (var10.field2748 << 16) / var109;
                                                if (var111 <= var110) {
                                                    var110 = -var110;
                                                } else {
                                                    var111 = -var111;
                                                }
                                                int var112 = var10.field2763 * var111 >> 17;
                                                int var113 = var10.field2763 * var111 + 1 >> 17;
                                                int var114 = var10.field2763 * var110 >> 17;
                                                int var115 = var10.field2763 * var110 + 1 >> 17;
                                                int var116 = var12 + var112;
                                                int var117 = var12 - var113;
                                                int var118 = var10.field2747 + var12 - var113;
                                                int var119 = var10.field2747 + var12 + var112;
                                                int var120 = var13 + var114;
                                                int var121 = var13 - var115;
                                                int var122 = var10.field2748 + var13 - var115;
                                                int var123 = var10.field2748 + var13 + var114;
                                                class91.method1986(var116, var117, var118);
                                                class91.method1989(var120, var121, var122, var116, var117, var118, var10.field2745);
                                                class91.method1986(var116, var118, var119);
                                                class91.method1989(var120, var122, var123, var116, var118, var119, var10.field2745);
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

    @ObfuscatedName("av.co(Ljava/lang/String;Lfy;I)Ljava/lang/String;")
    public static String method914(String arg0, class173 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method2313(arg1, var2 - 1);
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
                if (Statics.field277 != null) {
                    var8 = class163.method2260(Statics.field277.field2202);
                    if (Statics.field277.field2204 != null) {
                        var8 = (String) Statics.field277.field2204;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("cx.cu(II)Ljava/lang/String;")
    public static final String method2081(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field18 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method951(65408) + var1.substring(0, var1.length() - 8) + class157.field2465 + " " + class2.field19 + var1 + class2.field20 + class2.field23;
        } else if (var1.length() > 6) {
            return " " + class2.method951(16777215) + var1.substring(0, var1.length() - 4) + class157.field2467 + " " + class2.field19 + var1 + class2.field20 + class2.field23;
        } else {
            return " " + class2.method951(16776960) + var1 + class2.field23;
        }
    }

    @ObfuscatedName("ad.cn(ZB)V")
    public static final void method635(boolean arg0) {
        int var1 = field416;
        int var2 = Statics.field2115;
        int var3 = Statics.field705;
        if (class173.method692(var1)) {
            method201(Statics.field2791[var1], -1, var2, var3, arg0);
        }
    }

    @ObfuscatedName("k.cy(Lfy;B)V")
    public static void method111(class173 arg0) {
        class173 var1 = arg0.field2786 == -1 ? null : class173.method2977(arg0.field2786);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field2115;
            var3 = Statics.field705;
        } else {
            var2 = var1.field2747;
            var3 = var1.field2748;
        }
        method2326(arg0, var2, var3, false);
        method2170(arg0, var2, var3);
    }

    @ObfuscatedName("fh.cd([Lfy;Lfy;ZB)V")
    public static void method2996(class173[] arg0, class173 arg1, boolean arg2) {
        int var3 = arg1.field2755 == 0 ? arg1.field2747 : arg1.field2755;
        int var4 = arg1.field2756 == 0 ? arg1.field2748 : arg1.field2756;
        method201(arg0, arg1.field2732, var3, var4, arg2);
        if (arg1.field2854 != null) {
            method201(arg1.field2854, arg1.field2732, var3, var4, arg2);
        }
        class4 var5 = (class4) field460.method3584((long) arg1.field2732);
        if (var5 != null) {
            method49(var5.field60, var3, var4, arg2);
        }
        if (arg1.field2777 == 1337) {
        }
    }

    @ObfuscatedName("f.ca(IIIZB)V")
    public static final void method49(int arg0, int arg1, int arg2, boolean arg3) {
        if (class173.method692(arg0)) {
            method201(Statics.field2791[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("r.ce([Lfy;IIIZB)V")
    public static void method201(class173[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class173 var6 = arg0[var5];
            if (var6 != null && var6.field2786 == arg1) {
                method2326(var6, arg2, arg3, arg4);
                method2170(var6, arg2, arg3);
                if (var6.field2753 > var6.field2755 - var6.field2747) {
                    var6.field2753 = var6.field2755 - var6.field2747;
                }
                if (var6.field2753 < 0) {
                    var6.field2753 = 0;
                }
                if (var6.field2819 > var6.field2756 - var6.field2748) {
                    var6.field2819 = var6.field2756 - var6.field2748;
                }
                if (var6.field2819 < 0) {
                    var6.field2819 = 0;
                }
                if (var6.field2734 == 0) {
                    method2996(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ds.cq(Lfy;IIZI)V")
    public static void method2326(class173 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2747;
        int var5 = arg0.field2748;
        if (arg0.field2739 == 0) {
            arg0.field2747 = arg0.field2743;
        } else if (arg0.field2739 == 1) {
            arg0.field2747 = arg1 - arg0.field2743;
        } else if (arg0.field2739 == 2) {
            arg0.field2747 = arg0.field2743 * arg1 >> 14;
        }
        if (arg0.field2740 == 0) {
            arg0.field2748 = arg0.field2744;
        } else if (arg0.field2740 == 1) {
            arg0.field2748 = arg2 - arg0.field2744;
        } else if (arg0.field2740 == 2) {
            arg0.field2748 = arg0.field2744 * arg2 >> 14;
        }
        if (arg0.field2739 == 4) {
            arg0.field2747 = arg0.field2749 * arg0.field2748 / arg0.field2750;
        }
        if (arg0.field2740 == 4) {
            arg0.field2748 = arg0.field2750 * arg0.field2747 / arg0.field2749;
        }
        if (field452 && arg0.field2734 == 0) {
            if (arg0.field2748 < 5 && arg0.field2747 < 5) {
                arg0.field2748 = 5;
                arg0.field2747 = 5;
            } else {
                if (arg0.field2748 <= 0) {
                    arg0.field2748 = 5;
                }
                if (arg0.field2747 <= 0) {
                    arg0.field2747 = 5;
                }
            }
        }
        if (arg0.field2777 == 1337) {
            field471 = arg0;
        }
        if (arg3 && arg0.field2736 != null && (arg0.field2747 != var4 || arg0.field2748 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field9 = arg0.field2736;
            field498.method3609(var6);
        }
    }

    @ObfuscatedName("cw.cf(Lfy;IIB)V")
    public static void method2170(class173 arg0, int arg1, int arg2) {
        if (arg0.field2737 == 0) {
            arg0.field2863 = arg0.field2785;
        } else if (arg0.field2737 == 1) {
            arg0.field2863 = (arg1 - arg0.field2747) / 2 + arg0.field2785;
        } else if (arg0.field2737 == 2) {
            arg0.field2863 = arg1 - arg0.field2747 - arg0.field2785;
        } else if (arg0.field2737 == 3) {
            arg0.field2863 = arg0.field2785 * arg1 >> 14;
        } else if (arg0.field2737 == 4) {
            arg0.field2863 = (arg0.field2785 * arg1 >> 14) + (arg1 - arg0.field2747) / 2;
        } else {
            arg0.field2863 = arg1 - arg0.field2747 - (arg0.field2785 * arg1 >> 14);
        }
        if (arg0.field2807 == 0) {
            arg0.field2746 = arg0.field2742;
        } else if (arg0.field2807 == 1) {
            arg0.field2746 = (arg2 - arg0.field2748) / 2 + arg0.field2742;
        } else if (arg0.field2807 == 2) {
            arg0.field2746 = arg2 - arg0.field2748 - arg0.field2742;
        } else if (arg0.field2807 == 3) {
            arg0.field2746 = arg0.field2742 * arg2 >> 14;
        } else if (arg0.field2807 == 4) {
            arg0.field2746 = (arg0.field2742 * arg2 >> 14) + (arg2 - arg0.field2748) / 2;
        } else {
            arg0.field2746 = arg2 - arg0.field2748 - (arg0.field2742 * arg2 >> 14);
        }
        if (!field452 || arg0.field2734 != 0) {
            return;
        }
        if (arg0.field2863 < 0) {
            arg0.field2863 = 0;
        } else if (arg0.field2863 + arg0.field2747 > arg1) {
            arg0.field2863 = arg1 - arg0.field2747;
        }
        if (arg0.field2746 < 0) {
            arg0.field2746 = 0;
        } else if (arg0.field2748 + arg0.field2746 > arg2) {
            arg0.field2746 = arg2 - arg0.field2748;
        }
    }

    @ObfuscatedName("dy.ct(Lfy;IIIIIII)V")
    public static final void method2701(class173 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field382) {
            field383 = 32;
        } else {
            field383 = 0;
        }
        field382 = false;
        if (class140.field2142 == 1 || !Statics.field2584 && class140.field2142 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2819 -= 4;
                method2263(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2819 += 4;
                method2263(arg0);
            } else if (arg5 >= arg1 - field383 && arg5 < field383 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2819 = (arg4 - arg3) * var8 / var9;
                method2263(arg0);
                field382 = true;
            }
        }
        if (field497 == 0) {
            return;
        }
        int var10 = arg0.field2747;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2819 += field497 * 45;
            method2263(arg0);
        }
    }

    @ObfuscatedName("ac.cr(Lfy;S)Z")
    public static final boolean method723(class173 arg0) {
        if (arg0.field2843 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2843.length; var1++) {
            int var2 = method2313(arg0, var1);
            int var3 = arg0.field2844[var1];
            if (arg0.field2843[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2843[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2843[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("dq.cs(Lfy;II)I")
    public static final int method2313(class173 arg0, int arg1) {
        if (arg0.field2818 == null || arg1 >= arg0.field2818.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2818[arg1];
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
                    var7 = field436[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field437[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class173 var11 = class173.method2977(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method588(var12).field1128 || field300)) {
                        for (int var13 = 0; var13 < var11.field2808.length; var13++) {
                            if (var12 + 1 == var11.field2808[var13]) {
                                var7 += var11.field2817[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class176.field2879[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class155.field2284[field436[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class176.field2879[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field101.field35;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class155.field2282[var14]) {
                            var7 += field436[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class173 var17 = class173.method2977(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method588(var18).field1128 || field300)) {
                        for (int var19 = 0; var19 < var17.field2808.length; var19++) {
                            if (var18 + 1 == var17.field2808[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field312;
                }
                if (var6 == 12) {
                    var7 = field465;
                }
                if (var6 == 13) {
                    int var20 = class176.field2879[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class176.method156(var22);
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
                    var7 = (Statics.field101.field853 >> 7) + Statics.field2719;
                }
                if (var6 == 19) {
                    var7 = (Statics.field101.field843 >> 7) + Statics.field607;
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

    @ObfuscatedName("u.cb([Lfy;IIIIIIIB)V")
    public static final void method207(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class173 var9 = arg0[var8];
            if (var9 != null && (!var9.field2820 || var9.field2734 == 0 || var9.field2803 || method2693(var9) != 0 || field537 == var9 || var9.field2777 == 1338) && var9.field2786 == arg1 && (!var9.field2820 || !method157(var9))) {
                int var10 = var9.field2863 + arg6;
                int var11 = var9.field2746 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2734 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2734 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2747 + var10;
                    int var19 = var9.field2748 + var11;
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
                    int var22 = var9.field2747 + var10;
                    int var23 = var9.field2748 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field399 == var9) {
                    field480 = true;
                    field331 = var10;
                    field482 = var11;
                }
                if (!var9.field2820 || var12 < var14 && var13 < var15) {
                    int var24 = class140.field2134;
                    int var25 = class140.field2135 * 782474221;
                    if (class140.field2140 != 0) {
                        var24 = class140.field2146;
                        var25 = class140.field2132;
                    }
                    if (var9.field2777 == 1337) {
                        if (!field315 && !field439 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method918(var24, var25, var12, var13);
                        }
                    } else if (var9.field2777 != 1338) {
                        if (!field439 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            Statics.method1194(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2734 == 0) {
                            if (!var9.field2820 && method157(var9) && Statics.field1158 != var9) {
                                continue;
                            }
                            method207(arg0, var9.field2732, var12, var13, var14, var15, var10 - var9.field2753, var11 - var9.field2819);
                            if (var9.field2854 != null) {
                                method207(var9.field2854, var9.field2732, var12, var13, var14, var15, var10 - var9.field2753, var11 - var9.field2819);
                            }
                            class4 var40 = (class4) field460.method3584((long) var9.field2732);
                            if (var40 != null) {
                                if (var40.field57 == 0 && class140.field2134 >= var12 && class140.field2135 * 782474221 >= var13 && class140.field2134 < var14 && class140.field2135 * 782474221 < var15 && !field439 && !field452) {
                                    for (class1 var41 = (class1) field498.method3611(); var41 != null; var41 = (class1) field498.method3616()) {
                                        if (var41.field2) {
                                            var41.method3711();
                                            var41.field3.field2855 = false;
                                        }
                                    }
                                    if (Statics.field990 == 0) {
                                        field399 = null;
                                        field537 = null;
                                    }
                                    if (!field439) {
                                        field445[0] = class157.field2471;
                                        field446[0] = "";
                                        field379[0] = 1006;
                                        field440 = 1;
                                    }
                                }
                                int var42 = var40.field60;
                                if (class173.method692(var42)) {
                                    method207(Statics.field2791[var42], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2820) {
                            if (var9.field2733) {
                                if (class140.field2134 >= var12 && class140.field2135 * 782474221 >= var13 && class140.field2134 < var14 && class140.field2135 * 782474221 < var15) {
                                    for (class1 var43 = (class1) field498.method3611(); var43 != null; var43 = (class1) field498.method3616()) {
                                        if (var43.field2) {
                                            var43.method3711();
                                            var43.field3.field2855 = false;
                                        }
                                    }
                                    if (Statics.field990 == 0) {
                                        field399 = null;
                                        field537 = null;
                                    }
                                    if (!field439) {
                                        field445[0] = class157.field2471;
                                        field446[0] = "";
                                        field379[0] = 1006;
                                        field440 = 1;
                                    }
                                }
                            } else if (var9.field2864 && class140.field2134 >= var12 && class140.field2135 * 782474221 >= var13 && class140.field2134 < var14 && class140.field2135 * 782474221 < var15) {
                                for (class1 var44 = (class1) field498.method3611(); var44 != null; var44 = (class1) field498.method3616()) {
                                    if (var44.field2 && var44.field3.field2730 == var44.field9) {
                                        var44.method3711();
                                    }
                                }
                            }
                            boolean var45;
                            if (class140.field2134 >= var12 && class140.field2135 * 782474221 >= var13 && class140.field2134 < var14 && class140.field2135 * 782474221 < var15) {
                                var45 = true;
                            } else {
                                var45 = false;
                            }
                            boolean var46 = false;
                            if ((class140.field2142 == 1 || !Statics.field2584 && class140.field2142 == 4) && var45) {
                                var46 = true;
                            }
                            boolean var47 = false;
                            if ((class140.field2140 == 1 || !Statics.field2584 && class140.field2140 == 4) && class140.field2146 >= var12 && class140.field2132 >= var13 && class140.field2146 < var14 && class140.field2132 < var15) {
                                var47 = true;
                            }
                            if (var47) {
                                method2673(var9, class140.field2146 - var10, class140.field2132 - var11);
                            }
                            if (field399 != null && field399 != var9 && var45 && class178.method695(method2693(var9))) {
                                field476 = var9;
                            }
                            if (field537 == var9) {
                                field477 = true;
                                field459 = var10;
                                field479 = var11;
                            }
                            if (var9.field2803) {
                                if (var45 && field497 != 0 && var9.field2730 != null) {
                                    class1 var48 = new class1();
                                    var48.field2 = true;
                                    var48.field3 = var9;
                                    var48.field14 = field497;
                                    var48.field9 = var9.field2730;
                                    field498.method3609(var48);
                                }
                                if (field399 != null || Statics.field1951 != null || field439) {
                                    var47 = false;
                                    var46 = false;
                                    var45 = false;
                                }
                                if (!var9.field2856 && var47) {
                                    var9.field2856 = true;
                                    if (var9.field2812 != null) {
                                        class1 var49 = new class1();
                                        var49.field2 = true;
                                        var49.field3 = var9;
                                        var49.field4 = class140.field2146 - var10;
                                        var49.field14 = class140.field2132 - var11;
                                        var49.field9 = var9.field2812;
                                        field498.method3609(var49);
                                    }
                                }
                                if (var9.field2856 && var46 && var9.field2813 != null) {
                                    class1 var50 = new class1();
                                    var50.field2 = true;
                                    var50.field3 = var9;
                                    var50.field4 = class140.field2134 - var10;
                                    var50.field14 = class140.field2135 * 782474221 - var11;
                                    var50.field9 = var9.field2813;
                                    field498.method3609(var50);
                                }
                                if (var9.field2856 && !var46) {
                                    var9.field2856 = false;
                                    if (var9.field2814 != null) {
                                        class1 var51 = new class1();
                                        var51.field2 = true;
                                        var51.field3 = var9;
                                        var51.field4 = class140.field2134 - var10;
                                        var51.field14 = class140.field2135 * 782474221 - var11;
                                        var51.field9 = var9.field2814;
                                        field500.method3609(var51);
                                    }
                                }
                                if (var46 && var9.field2815 != null) {
                                    class1 var52 = new class1();
                                    var52.field2 = true;
                                    var52.field3 = var9;
                                    var52.field4 = class140.field2134 - var10;
                                    var52.field14 = class140.field2135 * 782474221 - var11;
                                    var52.field9 = var9.field2815;
                                    field498.method3609(var52);
                                }
                                if (!var9.field2855 && var45) {
                                    var9.field2855 = true;
                                    if (var9.field2816 != null) {
                                        class1 var53 = new class1();
                                        var53.field2 = true;
                                        var53.field3 = var9;
                                        var53.field4 = class140.field2134 - var10;
                                        var53.field14 = class140.field2135 * 782474221 - var11;
                                        var53.field9 = var9.field2816;
                                        field498.method3609(var53);
                                    }
                                }
                                if (var9.field2855 && var45 && var9.field2842 != null) {
                                    class1 var54 = new class1();
                                    var54.field2 = true;
                                    var54.field3 = var9;
                                    var54.field4 = class140.field2134 - var10;
                                    var54.field14 = class140.field2135 * 782474221 - var11;
                                    var54.field9 = var9.field2842;
                                    field498.method3609(var54);
                                }
                                if (var9.field2855 && !var45) {
                                    var9.field2855 = false;
                                    if (var9.field2724 != null) {
                                        class1 var55 = new class1();
                                        var55.field2 = true;
                                        var55.field3 = var9;
                                        var55.field4 = class140.field2134 - var10;
                                        var55.field14 = class140.field2135 * 782474221 - var11;
                                        var55.field9 = var9.field2724;
                                        field500.method3609(var55);
                                    }
                                }
                                if (var9.field2829 != null) {
                                    class1 var56 = new class1();
                                    var56.field3 = var9;
                                    var56.field9 = var9.field2829;
                                    field499.method3609(var56);
                                }
                                if (var9.field2823 != null && field473 > var9.field2858) {
                                    if (var9.field2824 == null || field473 - var9.field2858 > 32) {
                                        class1 var61 = new class1();
                                        var61.field3 = var9;
                                        var61.field9 = var9.field2823;
                                        field498.method3609(var61);
                                    } else {
                                        label526: for (int var57 = var9.field2858; var57 < field473; var57++) {
                                            int var58 = field430[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var9.field2824.length; var59++) {
                                                if (var9.field2824[var59] == var58) {
                                                    class1 var60 = new class1();
                                                    var60.field3 = var9;
                                                    var60.field9 = var9.field2823;
                                                    field498.method3609(var60);
                                                    break label526;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2858 = field473;
                                }
                                if (var9.field2825 != null && field351 > var9.field2859) {
                                    if (var9.field2826 == null || field351 - var9.field2859 > 32) {
                                        class1 var66 = new class1();
                                        var66.field3 = var9;
                                        var66.field9 = var9.field2825;
                                        field498.method3609(var66);
                                    } else {
                                        label502: for (int var62 = var9.field2859; var62 < field351; var62++) {
                                            int var63 = field487[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var9.field2826.length; var64++) {
                                                if (var9.field2826[var64] == var63) {
                                                    class1 var65 = new class1();
                                                    var65.field3 = var9;
                                                    var65.field9 = var9.field2825;
                                                    field498.method3609(var65);
                                                    break label502;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2859 = field351;
                                }
                                if (var9.field2827 != null && field490 > var9.field2766) {
                                    if (var9.field2828 == null || field490 - var9.field2766 > 32) {
                                        class1 var71 = new class1();
                                        var71.field3 = var9;
                                        var71.field9 = var9.field2827;
                                        field498.method3609(var71);
                                    } else {
                                        label478: for (int var67 = var9.field2766; var67 < field490; var67++) {
                                            int var68 = field489[var67 & 0x1F];
                                            for (int var69 = 0; var69 < var9.field2828.length; var69++) {
                                                if (var9.field2828[var69] == var68) {
                                                    class1 var70 = new class1();
                                                    var70.field3 = var9;
                                                    var70.field9 = var9.field2827;
                                                    field498.method3609(var70);
                                                    break label478;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2766 = field490;
                                }
                                if (field491 > var9.field2857 && var9.field2832 != null) {
                                    class1 var72 = new class1();
                                    var72.field3 = var9;
                                    var72.field9 = var9.field2832;
                                    field498.method3609(var72);
                                }
                                if (field492 > var9.field2857 && var9.field2834 != null) {
                                    class1 var73 = new class1();
                                    var73.field3 = var9;
                                    var73.field9 = var9.field2834;
                                    field498.method3609(var73);
                                }
                                if (field521 > var9.field2857 && var9.field2835 != null) {
                                    class1 var74 = new class1();
                                    var74.field3 = var9;
                                    var74.field9 = var9.field2835;
                                    field498.method3609(var74);
                                }
                                if (field494 > var9.field2857 && var9.field2849 != null) {
                                    class1 var75 = new class1();
                                    var75.field3 = var9;
                                    var75.field9 = var9.field2849;
                                    field498.method3609(var75);
                                }
                                if (field546 > var9.field2857 && var9.field2765 != null) {
                                    class1 var76 = new class1();
                                    var76.field3 = var9;
                                    var76.field9 = var9.field2765;
                                    field498.method3609(var76);
                                }
                                if (field496 > var9.field2857 && var9.field2836 != null) {
                                    class1 var77 = new class1();
                                    var77.field3 = var9;
                                    var77.field9 = var9.field2836;
                                    field498.method3609(var77);
                                }
                                var9.field2857 = field484;
                                if (var9.field2833 != null) {
                                    for (int var78 = 0; var78 < field305; var78++) {
                                        class1 var79 = new class1();
                                        var79.field3 = var9;
                                        var79.field8 = field524[var78];
                                        var79.field5 = field523[var78];
                                        var79.field9 = var9.field2833;
                                        field498.method3609(var79);
                                    }
                                }
                            }
                        }
                        if (!var9.field2820 && field399 == null && Statics.field1951 == null && !field439) {
                            if ((var9.field2788 >= 0 || var9.field2759 != 0) && class140.field2134 >= var12 && class140.field2135 * 782474221 >= var13 && class140.field2134 < var14 && class140.field2135 * 782474221 < var15) {
                                if (var9.field2788 >= 0) {
                                    Statics.field1158 = arg0[var9.field2788];
                                } else {
                                    Statics.field1158 = var9;
                                }
                            }
                            if (var9.field2734 == 8 && class140.field2134 >= var12 && class140.field2135 * 782474221 >= var13 && class140.field2134 < var14 && class140.field2135 * 782474221 < var15) {
                                Statics.field1746 = var9;
                            }
                            if (var9.field2756 > var9.field2748) {
                                method2701(var9, var9.field2747 + var10, var11, var9.field2748, var9.field2756, class140.field2134, class140.field2135 * 782474221);
                            }
                        }
                    } else if ((field535 == 0 || field535 == 3) && (class140.field2140 == 1 || !Statics.field2584 && class140.field2140 == 4)) {
                        class175 var26 = var9.method3220(true);
                        if (var26 != null) {
                            int var27 = class140.field2146 - var10;
                            int var28 = class140.field2132 - var11;
                            if (var26.method3273(var27, var28)) {
                                int var29 = var27 - var26.field2874 / 2;
                                int var30 = var28 - var26.field2872 / 2;
                                int var31 = field385 + field370 & 0x7FF;
                                int var32 = class91.field1585[var31];
                                int var33 = class91.field1586[var31];
                                int var34 = (field582 + 256) * var32 >> 8;
                                int var35 = (field582 + 256) * var33 >> 8;
                                int var36 = var29 * var35 + var30 * var34 >> 11;
                                int var37 = var30 * var35 - var29 * var34 >> 11;
                                int var38 = Statics.field101.field853 + var36 >> 7;
                                int var39 = Statics.field101.field843 - var37 >> 7;
                                field341.method2631(97);
                                field341.method2499(18);
                                field341.method2369(Statics.field2719 + var38);
                                field341.method2499(class137.field2102[82] ? (class137.field2102[81] ? 2 : 1) : 0);
                                field341.method2582(Statics.field607 + var39);
                                field341.method2499(var29);
                                field341.method2499(var30);
                                field341.method2369(field385);
                                field341.method2499(57);
                                field341.method2499(field370);
                                field341.method2499(field582);
                                field341.method2499(89);
                                field341.method2369(Statics.field101.field853);
                                field341.method2369(Statics.field101.field843);
                                field341.method2499(63);
                                field533 = var38;
                                field534 = var39;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("v.cx(III)V")
    public static final void method14(int arg0, int arg1) {
        if (class173.method692(arg0)) {
            method3270(Statics.field2791[arg0], arg1);
        }
    }

    @ObfuscatedName("fl.ch([Lfy;IB)V")
    public static final void method3270(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2734 == 0) {
                    if (var3.field2854 != null) {
                        method3270(var3.field2854, arg1);
                    }
                    class4 var4 = (class4) field460.method3584((long) var3.field2732);
                    if (var4 != null) {
                        method14(var4.field60, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2837 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field9 = var3.field2837;
                    class37.method2681(var5, 200000);
                }
                if (arg1 == 1 && var3.field2838 != null) {
                    if (var3.field2735 >= 0) {
                        class173 var6 = class173.method2977(var3.field2732);
                        if (var6 == null || var6.field2854 == null || var3.field2735 >= var6.field2854.length || var6.field2854[var3.field2735] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field9 = var3.field2838;
                    class37.method2681(var7, 200000);
                }
            }
        }
    }

    @ObfuscatedName("dv.cg(Lfy;III)V")
    public static final void method2673(class173 arg0, int arg1, int arg2) {
        if (field399 != null || field439 || arg0 == null) {
            return;
        }
        class173 var3 = method930(arg0);
        if (var3 == null) {
            var3 = arg0.field2805;
        }
        if (var3 == null) {
            return;
        }
        field399 = arg0;
        class173 var5 = method930(arg0);
        if (var5 == null) {
            var5 = arg0.field2805;
        }
        field537 = var5;
        field564 = arg1;
        field428 = arg2;
        Statics.field990 = 0;
        field483 = false;
        if (field440 > 0) {
            int var7 = field440 - 1;
            Statics.field630 = new class31();
            Statics.field630.field723 = field441[var7];
            Statics.field630.field728 = field389[var7];
            Statics.field630.field725 = field379[var7];
            Statics.field630.field722 = field444[var7];
            Statics.field630.field726 = field445[var7];
        }
        return;
    }

    @ObfuscatedName("dv.cv(B)V")
    public static final void method2667() {
        method2263(field399);
        Statics.field990++;
        if (field480 && field477) {
            int var0 = class140.field2134;
            int var1 = class140.field2135 * 782474221;
            int var2 = var0 - field564;
            int var3 = var1 - field428;
            if (var2 < field459) {
                var2 = field459;
            }
            if (field399.field2747 + var2 > field459 + field537.field2747) {
                var2 = field459 + field537.field2747 - field399.field2747;
            }
            if (var3 < field479) {
                var3 = field479;
            }
            if (field399.field2748 + var3 > field479 + field537.field2748) {
                var3 = field479 + field537.field2748 - field399.field2748;
            }
            int var4 = var2 - field331;
            int var5 = var3 - field482;
            int var6 = field399.field2806;
            if (Statics.field990 > field399.field2762 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field483 = true;
            }
            int var7 = field537.field2753 + (var2 - field459);
            int var8 = field537.field2819 + (var3 - field479);
            if (field399.field2722 != null && field483) {
                class1 var9 = new class1();
                var9.field3 = field399;
                var9.field4 = var7;
                var9.field14 = var8;
                var9.field9 = field399.field2722;
                class37.method2681(var9, 200000);
            }
            if (class140.field2142 == 0) {
                if (field483) {
                    if (field399.field2760 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field399;
                        var10.field4 = var7;
                        var10.field14 = var8;
                        var10.field7 = field476;
                        var10.field9 = field399.field2760;
                        class37.method2681(var10, 200000);
                    }
                    if (field476 != null && method930(field399) != null) {
                        field341.method2631(58);
                        field341.method2369(field399.field2735);
                        field341.method2427(field399.field2732);
                        field341.method2382(field476.field2732);
                        field341.method2441(field399.field2850);
                        field341.method2369(field476.field2735);
                        field341.method2415(field476.field2850);
                    }
                } else if ((field529 == 1 || method2159(field440 - 1)) && field440 > 2) {
                    method3013(field564 + field331, field482 + field428);
                } else if (field440 > 0) {
                    method3531(field564 + field331, field482 + field428);
                }
                field399 = null;
            }
        } else if (Statics.field990 > 1) {
            field399 = null;
        }
    }

    @ObfuscatedName("gl.cc(IIS)V")
    public static void method3531(int arg0, int arg1) {
        Statics.method1976(Statics.field630, arg0, arg1);
        Statics.field630 = null;
    }

    @ObfuscatedName("de.cw(Lfy;B)V")
    public static void method2263(class173 arg0) {
        if (field571 == arg0.field2862) {
            field504[arg0.field2810] = true;
        }
    }

    @ObfuscatedName("s.dg(I)V")
    public static void method110() {
        for (class4 var0 = (class4) field460.method3577(); var0 != null; var0 = (class4) field460.method3578()) {
            int var1 = var0.field60;
            if (class173.method692(var1)) {
                boolean var2 = true;
                class173[] var3 = Statics.field2791[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2820;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3093;
                    class173 var6 = class173.method2977(var5);
                    if (var6 != null) {
                        method2263(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dy.du([Ljava/lang/String;S)[Ljava/lang/String;")
    public static final String[] method2702(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("ff.de(IB)V")
    public static final void method3188(int arg0) {
        if (!class173.method692(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2791[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3 != null) {
                var3.field2841 = 0;
                var3.field2860 = 0;
            }
        }
    }

    @ObfuscatedName("dp.da([Lfy;IB)V")
    public static final void method2654(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null && var3.field2786 == arg1 && (!var3.field2820 || !method157(var3))) {
                if (var3.field2734 == 0) {
                    if (!var3.field2820 && method157(var3) && Statics.field1158 != var3) {
                        continue;
                    }
                    method2654(arg0, var3.field2732);
                    if (var3.field2854 != null) {
                        method2654(var3.field2854, var3.field2732);
                    }
                    class4 var4 = (class4) field460.method3584((long) var3.field2732);
                    if (var4 != null) {
                        int var5 = var4.field60;
                        if (class173.method692(var5)) {
                            method2654(Statics.field2791[var5], -1);
                        }
                    }
                }
                if (var3.field2734 == 6) {
                    if (var3.field2861 != -1 || var3.field2778 != -1) {
                        boolean var6 = method723(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2778;
                        } else {
                            var7 = var3.field2861;
                        }
                        if (var7 != -1) {
                            class43 var8 = class43.method733(var7);
                            var3.field2860 += field472;
                            while (var3.field2860 > var8.field996[var3.field2841]) {
                                var3.field2860 -= var8.field996[var3.field2841];
                                var3.field2841++;
                                if (var3.field2841 >= var8.field994.length) {
                                    var3.field2841 -= var8.field998;
                                    if (var3.field2841 < 0 || var3.field2841 >= var8.field994.length) {
                                        var3.field2841 = 0;
                                    }
                                }
                                method2263(var3);
                            }
                        }
                    }
                    if (var3.field2741 != 0 && !var3.field2820) {
                        int var9 = var3.field2741 >> 16;
                        int var10 = var3.field2741 << 16 >> 16;
                        int var11 = field472 * var9;
                        int var12 = field472 * var10;
                        var3.field2725 = var3.field2725 + var11 & 0x7FF;
                        var3.field2782 = var3.field2782 + var12 & 0x7FF;
                        method2263(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ay.dk(IB)V")
    public static final void method806(int arg0) {
        method110();
        for (class24 var1 = (class24) class24.field629.method3611(); var1 != null; var1 = (class24) class24.field629.method3616()) {
            if (var1.field628 != null) {
                var1.method573();
            }
        }
        int var2 = class53.method989(arg0).field1163;
        if (var2 == 0) {
            return;
        }
        int var3 = class176.field2879[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class91.method1983(0.9D);
                ((class95) Statics.field1582).method2064(0.9D);
            }
            if (var3 == 2) {
                class91.method1983(0.8D);
                ((class95) Statics.field1582).method2064(0.8D);
            }
            if (var3 == 3) {
                class91.method1983(0.7D);
                ((class95) Statics.field1582).method2064(0.7D);
            }
            if (var3 == 4) {
                class91.method1983(0.6D);
                ((class95) Statics.field1582).method2064(0.6D);
            }
            class52.field1112.method3541();
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
            if (field536 != var4) {
                if (field536 == 0 && field401 != -1) {
                    class183.method3296(Statics.field2019, field401, 0, var4, false);
                    field538 = false;
                } else if (var4 == 0) {
                    Statics.field2926.method3426();
                    class183.field2927 = 1;
                    Statics.field174 = null;
                    field538 = false;
                } else {
                    class183.method143(var4);
                }
                field536 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field427 = 127;
            }
            if (var3 == 1) {
                field427 = 96;
            }
            if (var3 == 2) {
                field427 = 64;
            }
            if (var3 == 3) {
                field427 = 32;
            }
            if (var3 == 4) {
                field427 = 0;
            }
        }
        if (var2 == 5) {
            field529 = var3;
        }
        if (var2 == 6) {
            field461 = var3;
        }
        if (var2 == 9) {
            field462 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field328 = 127;
            }
            if (var3 == 1) {
                field328 = 96;
            }
            if (var3 == 2) {
                field328 = 64;
            }
            if (var3 == 3) {
                field328 = 32;
            }
            if (var3 == 4) {
                field328 = 0;
            }
        }
        if (var2 == 17) {
            field363 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class21[] var5 = new class21[] { class21.field589, class21.field591, class21.field594 };
            field457 = (class21) class109.method46(var5, var3);
            if (field457 == null) {
                field457 = class21.field594;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field464 = -1;
        } else {
            field464 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("bt.dx(Lfy;I)V")
    public static final void method1489(class173 arg0) {
        int var1 = arg0.field2777;
        if (var1 == 324) {
            if (field574 == -1) {
                field574 = arg0.field2780;
                field575 = arg0.field2840;
            }
            if (field573.field2888) {
                arg0.field2780 = field574;
            } else {
                arg0.field2780 = field575;
            }
        } else if (var1 == 325) {
            if (field574 == -1) {
                field574 = arg0.field2780;
                field575 = arg0.field2840;
            }
            if (field573.field2888) {
                arg0.field2780 = field575;
            } else {
                arg0.field2780 = field574;
            }
        } else if (var1 == 327) {
            arg0.field2725 = 150;
            arg0.field2782 = (int) (Math.sin((double) field303 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2839 = 5;
            arg0.field2774 = 0;
        } else if (var1 == 328) {
            arg0.field2725 = 150;
            arg0.field2782 = (int) (Math.sin((double) field303 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2839 = 5;
            arg0.field2774 = 1;
        }
    }

    @ObfuscatedName("ap.dq(I)V")
    public static final void method715() {
        field341.method2631(233);
        for (class4 var0 = (class4) field460.method3577(); var0 != null; var0 = (class4) field460.method3578()) {
            if (var0.field57 == 0 || var0.field57 == 3) {
                method200(var0, true);
            }
        }
        if (field463 != null) {
            method2263(field463);
            field463 = null;
        }
    }

    @ObfuscatedName("ef.dr(IIII)Ln;")
    public static final class4 method2856(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field60 = arg1;
        var3.field57 = arg2;
        field460.method3575(var3, (long) arg0);
        method3188(arg1);
        class173 var4 = class173.method2977(arg0);
        method2263(var4);
        if (field463 != null) {
            method2263(field463);
            field463 = null;
        }
        method2818();
        method2996(Statics.field2791[arg0 >> 16], var4, false);
        class37.method644(arg1);
        if (field416 != -1) {
            method14(field416, 1);
        }
        return var3;
    }

    @ObfuscatedName("r.do(Ln;ZI)V")
    public static final void method200(class4 arg0, boolean arg1) {
        int var2 = arg0.field60;
        int var3 = (int) arg0.field3093;
        arg0.method3711();
        if (arg1) {
            class173.method2627(var2);
        }
        for (class201 var4 = (class201) field433.method3577(); var4 != null; var4 = (class201) field433.method3578()) {
            if ((var4.field3093 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method3711();
            }
        }
        class173 var5 = class173.method2977(var3);
        if (var5 != null) {
            method2263(var5);
        }
        method2818();
        if (field416 != -1) {
            method14(field416, 1);
        }
    }

    @ObfuscatedName("di.dh(Lfy;I)Z")
    public static final boolean method2695(class173 arg0) {
        int var1 = arg0.field2777;
        if (var1 == 205) {
            field481 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field573.method3304(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field573.method3305(var4, var5 == 1);
        }
        if (var1 == 324) {
            field573.method3306(false);
        }
        if (var1 == 325) {
            field573.method3306(true);
        }
        if (var1 == 326) {
            field341.method2631(7);
            field573.method3324(field341);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("di.ds(Lfy;IIII)V")
    public static final void method2694(class173 arg0, int arg1, int arg2, int arg3) {
        method585();
        class175 var4 = arg0.method3220(false);
        if (var4 == null) {
            return;
        }
        class80.method1710(arg1, arg2, var4.field2874 + arg1, var4.field2872 + arg2);
        if (field535 == 2 || field535 == 5) {
            class80.method1718(arg1, arg2, 0, var4.field2875, var4.field2873);
        } else {
            int var5 = field385 + field370 & 0x7FF;
            int var6 = Statics.field101.field853 / 32 + 48;
            int var7 = 464 - Statics.field101.field843 / 32;
            Statics.field1873.method1698(arg1, arg2, var4.field2874, var4.field2872, var6, var7, var5, field582 + 256, var4.field2875, var4.field2873);
            for (int var8 = 0; var8 < field348; var8++) {
                int var9 = field530[var8] * 4 + 2 - Statics.field101.field853 / 32;
                int var10 = field507[var8] * 4 + 2 - Statics.field101.field843 / 32;
                method2168(arg1, arg2, var9, var10, field532[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class199 var13 = field431[Statics.field721][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field101.field853 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field101.field843 / 32;
                        method2168(arg1, arg2, var14, var15, Statics.field1985[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field336; var16++) {
                class35 var17 = field322[field337[var16]];
                if (var17 != null && var17.method18()) {
                    class40 var18 = var17.field786;
                    if (var18 != null && var18.field919 != null) {
                        var18 = var18.method742();
                    }
                    if (var18 != null && var18.field914 && var18.field922) {
                        int var19 = var17.field853 / 32 - Statics.field101.field853 / 32;
                        int var20 = var17.field843 / 32 - Statics.field101.field843 / 32;
                        method2168(arg1, arg2, var19, var20, Statics.field1985[1], var4);
                    }
                }
            }
            int var21 = class33.field774;
            int[] var22 = class33.field769;
            for (int var23 = 0; var23 < var21; var23++) {
                class3 var24 = field421[var22[var23]];
                if (var24 != null && var24.method18() && !var24.field44 && Statics.field101 != var24) {
                    int var25 = var24.field853 / 32 - Statics.field101.field853 / 32;
                    int var26 = var24.field843 / 32 - Statics.field101.field843 / 32;
                    boolean var27 = false;
                    if (method2863(var24.field41, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field75; var29++) {
                        if (var24.field41.equals(Statics.field137[var29].field644)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field101.field49 != 0 && var24.field49 != 0 && Statics.field101.field49 == var24.field49) {
                        var30 = true;
                    }
                    if (var27) {
                        method2168(arg1, arg2, var25, var26, Statics.field1985[3], var4);
                    } else if (var30) {
                        method2168(arg1, arg2, var25, var26, Statics.field1985[4], var4);
                    } else if (var28) {
                        method2168(arg1, arg2, var25, var26, Statics.field1985[5], var4);
                    } else {
                        method2168(arg1, arg2, var25, var26, Statics.field1985[2], var4);
                    }
                }
            }
            if (field475 != 0 && field303 % 20 < 10) {
                if (field475 == 1 && field294 >= 0 && field294 < field322.length) {
                    class35 var31 = field322[field294];
                    if (var31 != null) {
                        int var32 = var31.field853 / 32 - Statics.field101.field853 / 32;
                        int var33 = var31.field843 / 32 - Statics.field101.field843 / 32;
                        method160(arg1, arg2, var32, var33, Statics.field376[1], var4);
                    }
                }
                if (field475 == 2) {
                    int var34 = field317 * 4 - Statics.field2719 * 4 + 2 - Statics.field101.field853 / 32;
                    int var35 = field318 * 4 - Statics.field607 * 4 + 2 - Statics.field101.field843 / 32;
                    method160(arg1, arg2, var34, var35, Statics.field376[1], var4);
                }
                if (field475 == 10 && field547 >= 0 && field547 < field421.length) {
                    class3 var36 = field421[field547];
                    if (var36 != null) {
                        int var37 = var36.field853 / 32 - Statics.field101.field853 / 32;
                        int var38 = var36.field843 / 32 - Statics.field101.field843 / 32;
                        method160(arg1, arg2, var37, var38, Statics.field376[1], var4);
                    }
                }
            }
            if (field533 != 0) {
                int var39 = field533 * 4 + 2 - Statics.field101.field853 / 32;
                int var40 = field534 * 4 + 2 - Statics.field101.field843 / 32;
                method2168(arg1, arg2, var39, var40, Statics.field376[0], var4);
            }
            if (!Statics.field101.field44) {
                class80.method1716(var4.field2874 / 2 + arg1 - 1, var4.field2872 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field442[arg3] = true;
    }

    @ObfuscatedName("p.dt(IIIILcl;Lfl;B)V")
    public static final void method160(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2168(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field385 + field370 & 0x7FF;
        int var8 = class91.field1585[var7];
        int var9 = class91.field1586[var7];
        int var10 = var8 * 256 / (field582 + 256);
        int var11 = var9 * 256 / (field582 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field3046.method1623(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("cc.dd(IIIILcl;Lfl;I)V")
    public static final void method2168(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field385 + field370 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class91.field1585[var6];
        int var9 = class91.field1586[var6];
        int var10 = var8 * 256 / (field582 + 256);
        int var11 = var9 * 256 / (field582 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1606(arg5.field2874 / 2 + var12 - arg4.field1407 / 2, arg5.field2872 / 2 - var13 - arg4.field1412 / 2, arg0, arg1, arg5.field2874, arg5.field2872, arg5.field2875, arg5.field2873);
        } else {
            arg4.method1646(arg5.field2874 / 2 + arg0 + var12 - arg4.field1407 / 2, arg5.field2872 / 2 + arg1 - var13 - arg4.field1412 / 2);
        }
    }

    @ObfuscatedName("eq.db(Ljava/lang/String;ZI)Z")
    public static boolean method2863(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class164.method175(arg0, Statics.field1868);
        for (int var3 = 0; var3 < field578; var3++) {
            if (var2.equalsIgnoreCase(class164.method175(field478[var3].field258, Statics.field1868)) && (!arg1 || field478[var3].field260 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class164.method175(Statics.field101.field41, Statics.field1868))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("h.dm(Ljava/lang/String;B)Z")
    public static boolean method2(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class164.method175(arg0, Statics.field1868);
        for (int var2 = 0; var2 < field356; var2++) {
            class8 var3 = field572[var2];
            if (var1.equalsIgnoreCase(class164.method175(var3.field141, Statics.field1868))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class164.method175(var3.field148, Statics.field1868))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("an.dn(Ljava/lang/String;I)V")
    public static final void method735(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field578 < 200 || field423 == 1) || field578 >= 400) {
            class12.method974(30, "", class157.field2548);
            return;
        }
        String var1 = class164.method175(arg0, Statics.field1868);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field578; var2++) {
            class18 var3 = field478[var2];
            String var4 = class164.method175(var3.field258, Statics.field1868);
            if (var4 != null && var4.equals(var1)) {
                class12.method974(30, "", arg0 + class157.field2516);
                return;
            }
            if (var3.field254 != null) {
                String var5 = class164.method175(var3.field254, Statics.field1868);
                if (var5 != null && var5.equals(var1)) {
                    class12.method974(30, "", arg0 + class157.field2516);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field356; var6++) {
            class8 var7 = field572[var6];
            String var8 = class164.method175(var7.field141, Statics.field1868);
            if (var8 != null && var8.equals(var1)) {
                class12.method974(30, "", class157.field2476 + arg0 + class157.field2397);
                return;
            }
            if (var7.field148 != null) {
                String var9 = class164.method175(var7.field148, Statics.field1868);
                if (var9 != null && var9.equals(var1)) {
                    class12.method974(30, "", class157.field2476 + arg0 + class157.field2397);
                    return;
                }
            }
        }
        if (class164.method175(Statics.field101.field41, Statics.field1868).equals(var1)) {
            class12.method974(30, "", class157.field2454);
        } else {
            field341.method2631(21);
            field341.method2499(class119.method2072(arg0));
            field341.method2374(arg0);
        }
    }

    @ObfuscatedName("y.dc(Ljava/lang/String;ZI)V")
    public static final void method586(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field356 < 100 || field423 == 1) || field356 >= 400) {
            class12.method974(31, "", class157.field2470);
            return;
        }
        String var2 = class164.method175(arg0, Statics.field1868);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field356; var3++) {
            class8 var4 = field572[var3];
            String var5 = class164.method175(var4.field141, Statics.field1868);
            if (var5 != null && var5.equals(var2)) {
                class12.method974(31, "", arg0 + class157.field2473);
                return;
            }
            if (var4.field148 != null) {
                String var6 = class164.method175(var4.field148, Statics.field1868);
                if (var6 != null && var6.equals(var2)) {
                    class12.method974(31, "", arg0 + class157.field2473);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field578; var7++) {
            class18 var8 = field478[var7];
            String var9 = class164.method175(var8.field258, Statics.field1868);
            if (var9 != null && var9.equals(var2)) {
                class12.method974(31, "", class157.field2478 + arg0 + class157.field2479);
                return;
            }
            if (var8.field254 != null) {
                String var10 = class164.method175(var8.field254, Statics.field1868);
                if (var10 != null && var10.equals(var2)) {
                    class12.method974(31, "", class157.field2478 + arg0 + class157.field2479);
                    return;
                }
            }
        }
        if (class164.method175(Statics.field101.field41, Statics.field1868).equals(var2)) {
            class12.method974(31, "", class157.field2475);
        } else {
            field341.method2631(255);
            field341.method2499(class119.method2072(arg0));
            field341.method2374(arg0);
        }
    }

    @ObfuscatedName("c.dp(Ljava/lang/String;I)V")
    public static final void method136(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class164.method175(arg0, Statics.field1868);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field356; var2++) {
            class8 var3 = field572[var2];
            String var4 = var3.field141;
            String var5 = class164.method175(var4, Statics.field1868);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field356--;
                for (int var7 = var2; var7 < field356; var7++) {
                    field572[var7] = field572[var7 + 1];
                }
                field492 = field484;
                field341.method2631(34);
                field341.method2499(class119.method2072(arg0));
                field341.method2374(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("cf.dz(Ljava/lang/String;I)V")
    public static final void method2059(String arg0) {
        if (Statics.field137 != null) {
            field341.method2631(226);
            field341.method2499(class119.method2072(arg0));
            field341.method2374(arg0);
        }
    }

    @ObfuscatedName("ak.dv(I)V")
    public static final void method736() {
        field341.method2631(232);
        field341.method2499(0);
    }

    @ObfuscatedName("dw.dj(Lfy;I)I")
    public static int method2693(class173 arg0) {
        class201 var1 = (class201) field433.method3584(((long) arg0.field2732 << 32) + (long) arg0.field2735);
        return var1 == null ? arg0.field2767 : var1.field3080;
    }

    @ObfuscatedName("aq.dl(Lfy;B)Lfy;")
    public static class173 method930(class173 arg0) {
        int var1 = class178.method2721(method2693(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class173.method2977(arg0.field2786);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("p.dw(Lfy;I)Z")
    public static boolean method157(class173 arg0) {
        if (field452) {
            if (method2693(arg0) != 0) {
                return false;
            }
            if (arg0.field2734 == 0) {
                return false;
            }
        }
        return arg0.field2752;
    }

    @ObfuscatedName("af.df(Lfy;II)Ljava/lang/String;")
    public static String method641(class173 arg0, int arg1) {
        int var2 = method2693(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2830 == null) {
            return null;
        } else if (arg0.field2804 == null || arg0.field2804.length <= arg1 || arg0.field2804[arg1] == null || arg0.field2804[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2804[arg1];
        }
    }

    @ObfuscatedName("ax.di(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method955(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field298 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field298 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field298 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field298 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field298 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field13 != null) {
            var3 = "/p=" + Statics.field13;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field302 + "/a=" + Statics.field1882 + var3 + "/";
    }

    @ObfuscatedName("d.dy(Ljava/lang/String;I)V")
    public static void method167(String arg0) {
        Statics.field13 = arg0;
        try {
            String var1 = Statics.field2881.getParameter(class190.field3042.field3045);
            String var2 = Statics.field2881.getParameter(class190.field3043.field3045);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class111.method3069(class115.method2082() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class132.method2723(Statics.field2881, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("dm.en(Ljava/lang/String;ZB)V")
    public static void method2590(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1137; var5++) {
            class52 var6 = class52.method588(var5);
            if ((!arg1 || var6.field1115) && var6.field1146 == -1 && var6.field1151.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field2073 = -1;
                    Statics.field2024 = null;
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
        Statics.field2024 = var3;
        Statics.field1748 = 0;
        Statics.field2073 = var4;
        String[] var9 = new String[Statics.field2073];
        for (int var10 = 0; var10 < Statics.field2073; var10++) {
            var9[var10] = class52.method588(var3[var10]).field1151;
        }
        class124.method713(var9, Statics.field2024);
    }
}

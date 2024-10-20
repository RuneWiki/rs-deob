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
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class144 {

    @ObfuscatedName("client.r")
    public static boolean field285 = true;

    @ObfuscatedName("client.n")
    public static int field460 = 1;

    @ObfuscatedName("client.q")
    public static int field287 = 0;

    @ObfuscatedName("client.d")
    public static int field288 = 0;

    @ObfuscatedName("client.e")
    public static boolean field361 = false;

    @ObfuscatedName("client.z")
    public static boolean field291 = false;

    @ObfuscatedName("client.t")
    public static int field358 = 0;

    @ObfuscatedName("client.g")
    public static int field507 = 0;

    @ObfuscatedName("client.u")
    public static boolean field295 = true;

    @ObfuscatedName("client.o")
    public static int field290 = 0;

    @ObfuscatedName("client.k")
    public static long field364 = 1L;

    @ObfuscatedName("client.j")
    public static int field298 = -1;

    @ObfuscatedName("client.p")
    public static int field299 = -1;

    @ObfuscatedName("client.w")
    public static class108[] field348 = new class108[4];

    @ObfuscatedName("client.au")
    public static int field300 = -1;

    @ObfuscatedName("client.ar")
    public static boolean field296 = true;

    @ObfuscatedName("client.ah")
    public static boolean field302 = false;

    @ObfuscatedName("client.af")
    public static int field303 = 0;

    @ObfuscatedName("client.az")
    public static int field511 = 0;

    @ObfuscatedName("client.av")
    public static int field504 = 0;

    @ObfuscatedName("client.al")
    public static int field322 = 0;

    @ObfuscatedName("client.aw")
    public static int field307 = 0;

    @ObfuscatedName("client.ac")
    public static int field388 = 0;

    @ObfuscatedName("client.ai")
    public static int field309 = 0;

    @ObfuscatedName("client.ab")
    public static int field304 = 0;

    @ObfuscatedName("client.aj")
    public static int field311 = 0;

    @ObfuscatedName("client.ap")
    public static class21 field313 = class21.field575;

    @ObfuscatedName("client.aa")
    public static int field314 = 0;

    @ObfuscatedName("client.am")
    public static int field519 = 0;

    @ObfuscatedName("client.aq")
    public static int field316 = 0;

    @ObfuscatedName("client.bb")
    public static int field517 = 0;

    @ObfuscatedName("client.bj")
    public static int field320 = 0;

    @ObfuscatedName("client.bo")
    public static int field570 = 0;

    @ObfuscatedName("client.bu")
    public static int field416 = 0;

    @ObfuscatedName("client.bd")
    public static int field536 = 0;

    @ObfuscatedName("client.ck")
    public static class35[] field324 = new class35[32768];

    @ObfuscatedName("client.cs")
    public static int field325 = 0;

    @ObfuscatedName("client.ca")
    public static int[] field326 = new int[32768];

    @ObfuscatedName("client.cr")
    public static int field327 = 0;

    @ObfuscatedName("client.cu")
    public static int[] field328 = new int[250];

    @ObfuscatedName("client.ct")
    public static class122 field330 = new class122(5000);

    @ObfuscatedName("client.cf")
    public static class122 field331 = new class122(5000);

    @ObfuscatedName("client.ch")
    public static class122 field332 = new class122(15000);

    @ObfuscatedName("client.cp")
    public static int field333 = 0;

    @ObfuscatedName("client.cq")
    public static int field334 = 0;

    @ObfuscatedName("client.cm")
    public static int field335 = 0;

    @ObfuscatedName("client.cv")
    public static int field292 = 0;

    @ObfuscatedName("client.cj")
    public static int field359 = 0;

    @ObfuscatedName("client.cb")
    public static int field338 = 0;

    @ObfuscatedName("client.cc")
    public static int field339 = 0;

    @ObfuscatedName("client.cw")
    public static int field340 = 0;

    @ObfuscatedName("client.cz")
    public static boolean field341 = false;

    @ObfuscatedName("client.dd")
    public static int field342 = 0;

    @ObfuscatedName("client.dr")
    public static int field343 = 1;

    @ObfuscatedName("client.dh")
    public static int field571 = 0;

    @ObfuscatedName("client.dt")
    public static int field345 = 1;

    @ObfuscatedName("client.dk")
    public static int field346 = 0;

    @ObfuscatedName("client.dq")
    public static boolean field547 = false;

    @ObfuscatedName("client.df")
    public static int[][][] field350 = new int[4][13][13];

    @ObfuscatedName("client.dv")
    public static final int[] field490 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.du")
    public static int field352 = 0;

    @ObfuscatedName("client.dw")
    public static int field353 = 2;

    @ObfuscatedName("client.dm")
    public static int field354 = 0;

    @ObfuscatedName("client.dl")
    public static int field465 = 2;

    @ObfuscatedName("client.da")
    public static int field438 = 0;

    @ObfuscatedName("client.di")
    public static int field357 = 1;

    @ObfuscatedName("client.ev")
    public static int field439 = 0;

    @ObfuscatedName("client.em")
    public static int field470 = 0;

    @ObfuscatedName("client.es")
    public static int field360 = 2;

    @ObfuscatedName("client.ec")
    public static int field367 = 0;

    @ObfuscatedName("client.ef")
    public static int field362 = 1;

    @ObfuscatedName("client.ee")
    public static int field363 = 0;

    @ObfuscatedName("client.eh")
    public static int field355 = 0;

    @ObfuscatedName("client.ew")
    public static int field297 = 2301979;

    @ObfuscatedName("client.et")
    public static int field556 = 5063219;

    @ObfuscatedName("client.eb")
    public static int field368 = 3353893;

    @ObfuscatedName("client.ey")
    public static int field369 = 7759444;

    @ObfuscatedName("client.eq")
    public static boolean field370 = false;

    @ObfuscatedName("client.eu")
    public static int field437 = 0;

    @ObfuscatedName("client.fm")
    public static int field372 = 128;

    @ObfuscatedName("client.fo")
    public static int field373 = 0;

    @ObfuscatedName("client.fk")
    public static int field443 = 0;

    @ObfuscatedName("client.fg")
    public static int field392 = 0;

    @ObfuscatedName("client.fd")
    public static int field492 = 0;

    @ObfuscatedName("client.fe")
    public static int field377 = 0;

    @ObfuscatedName("client.fs")
    public static int field378 = 50;

    @ObfuscatedName("client.ft")
    public static int field379 = 0;

    @ObfuscatedName("client.fu")
    public static boolean field380 = false;

    @ObfuscatedName("client.fr")
    public static int field432 = 0;

    @ObfuscatedName("client.fx")
    public static int field382 = 0;

    @ObfuscatedName("client.fp")
    public static int field383 = 50;

    @ObfuscatedName("client.fi")
    public static int[] field557 = new int[field383];

    @ObfuscatedName("client.fh")
    public static int[] field385 = new int[field383];

    @ObfuscatedName("client.fz")
    public static int[] field386 = new int[field383];

    @ObfuscatedName("client.fv")
    public static int[] field336 = new int[field383];

    @ObfuscatedName("client.fw")
    public static int[] field568 = new int[field383];

    @ObfuscatedName("client.fn")
    public static int[] field317 = new int[field383];

    @ObfuscatedName("client.fa")
    public static int[] field390 = new int[field383];

    @ObfuscatedName("client.gz")
    public static String[] field391 = new String[field383];

    @ObfuscatedName("client.gj")
    public static int[][] field508 = new int[104][104];

    @ObfuscatedName("client.gg")
    public static int field393 = 0;

    @ObfuscatedName("client.gh")
    public static int field394 = -1;

    @ObfuscatedName("client.gc")
    public static int field374 = -1;

    @ObfuscatedName("client.ge")
    public static int field549 = 0;

    @ObfuscatedName("client.gf")
    public static int field427 = 0;

    @ObfuscatedName("client.gi")
    public static int field398 = 0;

    @ObfuscatedName("client.gx")
    public static int field399 = 0;

    @ObfuscatedName("client.gm")
    public static int field400 = 0;

    @ObfuscatedName("client.ga")
    public static int field477 = 0;

    @ObfuscatedName("client.gk")
    public static int field402 = 0;

    @ObfuscatedName("client.gl")
    public static int field403 = 0;

    @ObfuscatedName("client.gb")
    public static int field404 = 0;

    @ObfuscatedName("client.gp")
    public static int field405 = 0;

    @ObfuscatedName("client.gq")
    public static boolean field555 = false;

    @ObfuscatedName("client.gv")
    public static int field407 = 0;

    @ObfuscatedName("client.gy")
    public static int field408 = 0;

    @ObfuscatedName("client.gr")
    public static class3[] field409 = new class3[2048];

    @ObfuscatedName("client.gs")
    public static int field410 = -1;

    @ObfuscatedName("client.go")
    public static int field411 = 0;

    @ObfuscatedName("client.hg")
    public static int field412 = 0;

    @ObfuscatedName("client.hh")
    public static int[] field413 = new int[1000];

    @ObfuscatedName("client.hj")
    public static final int[] field414 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hm")
    public static String[] field415 = new String[8];

    @ObfuscatedName("client.hx")
    public static boolean[] field448 = new boolean[8];

    @ObfuscatedName("client.hd")
    public static int[] field417 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hq")
    public static int field454 = -1;

    @ObfuscatedName("client.hl")
    public static class199[][][] field419 = new class199[4][104][104];

    @ObfuscatedName("client.hs")
    public static class199 field420 = new class199();

    @ObfuscatedName("client.hw")
    public static class199 field371 = new class199();

    @ObfuscatedName("client.hu")
    public static class199 field444 = new class199();

    @ObfuscatedName("client.ha")
    public static int[] field423 = new int[25];

    @ObfuscatedName("client.hv")
    public static int[] field424 = new int[25];

    @ObfuscatedName("client.hy")
    public static int[] field425 = new int[25];

    @ObfuscatedName("client.he")
    public static int field426 = 0;

    @ObfuscatedName("client.hc")
    public static boolean field310 = false;

    @ObfuscatedName("client.ho")
    public static int field428 = 0;

    @ObfuscatedName("client.ht")
    public static int[] field429 = new int[500];

    @ObfuscatedName("client.hr")
    public static int[] field430 = new int[500];

    @ObfuscatedName("client.ig")
    public static int[] field431 = new int[500];

    @ObfuscatedName("client.if")
    public static int[] field306 = new int[500];

    @ObfuscatedName("client.iu")
    public static String[] field553 = new String[500];

    @ObfuscatedName("client.is")
    public static String[] field468 = new String[500];

    @ObfuscatedName("client.ij")
    public static int field435 = -1;

    @ObfuscatedName("client.id")
    public static int field436 = -1;

    @ObfuscatedName("client.ir")
    public static int field286 = 0;

    @ObfuscatedName("client.iw")
    public static int field523 = 50;

    @ObfuscatedName("client.im")
    public static int field484 = 0;

    @ObfuscatedName("client.ia")
    public static String field440 = null;

    @ObfuscatedName("client.il")
    public static boolean field491 = false;

    @ObfuscatedName("client.in")
    public static int field442 = -1;

    @ObfuscatedName("client.iv")
    public static int field365 = -1;

    @ObfuscatedName("client.ih")
    public static String field520 = null;

    @ObfuscatedName("client.ic")
    public static String field445 = null;

    @ObfuscatedName("client.ii")
    public static int field446 = -1;

    @ObfuscatedName("client.ik")
    public static class196 field447 = new class196(8);

    @ObfuscatedName("client.ib")
    public static int field572 = 0;

    @ObfuscatedName("client.jf")
    public static int field449 = 0;

    @ObfuscatedName("client.ji")
    public static class173 field450 = null;

    @ObfuscatedName("client.jt")
    public static int field451 = 0;

    @ObfuscatedName("client.jc")
    public static int field461 = 0;

    @ObfuscatedName("client.jb")
    public static int field384 = 0;

    @ObfuscatedName("client.jd")
    public static int field356 = -1;

    @ObfuscatedName("client.jg")
    public static boolean field422 = false;

    @ObfuscatedName("client.jl")
    public static boolean field452 = false;

    @ObfuscatedName("client.ja")
    public static boolean field457 = false;

    @ObfuscatedName("client.je")
    public static class173 field458 = null;

    @ObfuscatedName("client.jm")
    public static class173 field459 = null;

    @ObfuscatedName("client.jj")
    public static class173 field497 = null;

    @ObfuscatedName("client.jh")
    public static int field562 = 0;

    @ObfuscatedName("client.jq")
    public static int field462 = 0;

    @ObfuscatedName("client.jz")
    public static class173 field463 = null;

    @ObfuscatedName("client.jx")
    public static boolean field464 = false;

    @ObfuscatedName("client.js")
    public static int field387 = -1;

    @ObfuscatedName("client.jo")
    public static int field466 = -1;

    @ObfuscatedName("client.jv")
    public static boolean field467 = false;

    @ObfuscatedName("client.jn")
    public static int field283 = -1;

    @ObfuscatedName("client.jw")
    public static int field469 = -1;

    @ObfuscatedName("client.jr")
    public static boolean field535 = false;

    @ObfuscatedName("client.kn")
    public static int field566 = 1;

    @ObfuscatedName("client.kz")
    public static int[] field472 = new int[32];

    @ObfuscatedName("client.ko")
    public static int field381 = 0;

    @ObfuscatedName("client.kw")
    public static int[] field513 = new int[32];

    @ObfuscatedName("client.kp")
    public static int field474 = 0;

    @ObfuscatedName("client.kv")
    public static int[] field476 = new int[32];

    @ObfuscatedName("client.kf")
    public static int field337 = 0;

    @ObfuscatedName("client.kr")
    public static int field478 = 0;

    @ObfuscatedName("client.ka")
    public static int field433 = 0;

    @ObfuscatedName("client.kh")
    public static int field351 = 0;

    @ObfuscatedName("client.ku")
    public static int field481 = 0;

    @ObfuscatedName("client.ky")
    public static int field482 = 0;

    @ObfuscatedName("client.kt")
    public static int field483 = 0;

    @ObfuscatedName("client.kx")
    public static int field389 = 0;

    @ObfuscatedName("client.kj")
    public static class199 field485 = new class199();

    @ObfuscatedName("client.kl")
    public static class199 field488 = new class199();

    @ObfuscatedName("client.ks")
    public static class199 field487 = new class199();

    @ObfuscatedName("client.kd")
    public static class196 field375 = new class196(512);

    @ObfuscatedName("client.kq")
    public static int field489 = 0;

    @ObfuscatedName("client.kk")
    public static int field550 = -2;

    @ObfuscatedName("client.ki")
    public static boolean[] field559 = new boolean[100];

    @ObfuscatedName("client.lf")
    public static boolean[] field480 = new boolean[100];

    @ObfuscatedName("client.lh")
    public static boolean[] field493 = new boolean[100];

    @ObfuscatedName("client.lm")
    public static int[] field323 = new int[100];

    @ObfuscatedName("client.lg")
    public static int[] field495 = new int[100];

    @ObfuscatedName("client.lt")
    public static int[] field496 = new int[100];

    @ObfuscatedName("client.lv")
    public static int[] field479 = new int[100];

    @ObfuscatedName("client.ll")
    public static int field498 = 0;

    @ObfuscatedName("client.le")
    public static long field499 = 0L;

    @ObfuscatedName("client.lz")
    public static boolean field500 = true;

    @ObfuscatedName("client.lr")
    public static int field516 = 1;

    @ObfuscatedName("client.lc")
    public static int field502 = 1;

    @ObfuscatedName("client.lb")
    public static int[] field503 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lu")
    public static int field395 = 0;

    @ObfuscatedName("client.lp")
    public static int field505 = 0;

    @ObfuscatedName("client.lw")
    public static String field506 = "";

    @ObfuscatedName("client.lq")
    public static long[] field321 = new long[100];

    @ObfuscatedName("client.ld")
    public static int field509 = 0;

    @ObfuscatedName("client.lx")
    public static int field510 = 0;

    @ObfuscatedName("client.li")
    public static int[] field455 = new int[128];

    @ObfuscatedName("client.ml")
    public static int[] field512 = new int[128];

    @ObfuscatedName("client.mh")
    public static long field376 = -1L;

    @ObfuscatedName("client.mk")
    public static String field366 = null;

    @ObfuscatedName("client.mm")
    public static String field515 = null;

    @ObfuscatedName("client.mq")
    public static int field501 = -1;

    @ObfuscatedName("client.mc")
    public static int field401 = 0;

    @ObfuscatedName("client.mg")
    public static int[] field305 = new int[1000];

    @ObfuscatedName("client.md")
    public static int[] field441 = new int[1000];

    @ObfuscatedName("client.mp")
    public static class79[] field434 = new class79[1000];

    @ObfuscatedName("client.mf")
    public static int field521 = 0;

    @ObfuscatedName("client.mw")
    public static int field522 = 0;

    @ObfuscatedName("client.my")
    public static int field494 = 0;

    @ObfuscatedName("client.mj")
    public static int field524 = 255;

    @ObfuscatedName("client.mo")
    public static int field525 = -1;

    @ObfuscatedName("client.mt")
    public static boolean field526 = false;

    @ObfuscatedName("client.nb")
    public static int field527 = 127;

    @ObfuscatedName("client.nf")
    public static int field528 = 127;

    @ObfuscatedName("client.na")
    public static int field529 = 0;

    @ObfuscatedName("client.nr")
    public static int[] field530 = new int[50];

    @ObfuscatedName("client.nk")
    public static int[] field531 = new int[50];

    @ObfuscatedName("client.nn")
    public static int[] field532 = new int[50];

    @ObfuscatedName("client.nm")
    public static int[] field533 = new int[50];

    @ObfuscatedName("client.nl")
    public static class59[] field534 = new class59[50];

    @ObfuscatedName("client.nq")
    public static boolean field344 = false;

    @ObfuscatedName("client.nj")
    public static boolean[] field329 = new boolean[5];

    @ObfuscatedName("client.og")
    public static int[] field537 = new int[5];

    @ObfuscatedName("client.od")
    public static int[] field538 = new int[5];

    @ObfuscatedName("client.oh")
    public static int[] field539 = new int[5];

    @ObfuscatedName("client.os")
    public static int[] field540 = new int[5];

    @ObfuscatedName("client.oj")
    public static short field541 = 256;

    @ObfuscatedName("client.om")
    public static short field542 = 205;

    @ObfuscatedName("client.op")
    public static short field543 = 256;

    @ObfuscatedName("client.oz")
    public static short field544 = 320;

    @ObfuscatedName("client.oa")
    public static short field545 = 1;

    @ObfuscatedName("client.ol")
    public static short field546 = 32767;

    @ObfuscatedName("client.oi")
    public static short field315 = 1;

    @ObfuscatedName("client.oo")
    public static short field548 = 32767;

    @ObfuscatedName("client.ot")
    public static int field475 = 0;

    @ObfuscatedName("client.oy")
    public static int field453 = 0;

    @ObfuscatedName("client.oq")
    public static int field551 = 0;

    @ObfuscatedName("client.ob")
    public static int field552 = 0;

    @ObfuscatedName("client.ou")
    public static int field308 = 0;

    @ObfuscatedName("client.on")
    public static int field554 = 0;

    @ObfuscatedName("client.ox")
    public static int field456 = 0;

    @ObfuscatedName("client.oc")
    public static class18[] field486 = new class18[400];

    @ObfuscatedName("client.ok")
    public static class195 field473 = new class195();

    @ObfuscatedName("client.of")
    public static int field558 = 0;

    @ObfuscatedName("client.ow")
    public static class8[] field421 = new class8[400];

    @ObfuscatedName("client.oe")
    public static class179 field560 = new class179();

    @ObfuscatedName("client.pc")
    public static int field561 = -1;

    @ObfuscatedName("client.pn")
    public static int field397 = -1;

    @ObfuscatedName("client.px")
    public static class220[] field563 = new class220[8];

    @ObfuscatedName("client.pk")
    public static long field471 = -1L;

    @ObfuscatedName("client.pq")
    public static long field565 = -1L;

    @ObfuscatedName("client.pj")
    public static final class11 field518 = new class11();

    @ObfuscatedName("client.pd")
    public static int[] field567 = new int[50];

    @ObfuscatedName("client.pt")
    public static int[] field294 = new int[50];

    @ObfuscatedName("client.x(I)V")
    public final void method395() {
    }

    public final void init() {
        if (!this.method2820()) {
            return;
        }
        class190[] var1 = new class190[] { class190.field3037, class190.field3038, class190.field3045, class190.field3040, class190.field3036, class190.field3049, class190.field3041, class190.field3053, class190.field3042, class190.field3039, class190.field3047, class190.field3035, class190.field3048, class190.field3043, class190.field3046 };
        class190[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class190 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3050);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3050)) {
                    case 1:
                        field460 = Integer.parseInt(var5);
                        break;
                    case 2:
                        Statics.field293 = Integer.parseInt(var5);
                        break;
                    case 3:
                        field287 = Integer.parseInt(var5);
                        break;
                    case 4:
                        class154[] var6 = new class154[] { class154.field2273, class154.field2271, class154.field2274, class154.field2272, class154.field2270, class154.field2277 };
                        Statics.field1360 = (class154) class109.method2293(var6, Integer.parseInt(var5));
                        if (Statics.field1360 == class154.field2272) {
                            Statics.field289 = class212.field3126;
                        } else {
                            Statics.field289 = class212.field3124;
                        }
                    case 5:
                    case 10:
                    case 14:
                    default:
                        break;
                    case 6:
                        field358 = Integer.parseInt(var5);
                        break;
                    case 7:
                        Statics.field3113 = class153.method3221(Integer.parseInt(var5));
                        break;
                    case 8:
                        if (var5.equalsIgnoreCase(class2.field28)) {
                            field361 = true;
                        } else {
                            field361 = false;
                        }
                        break;
                    case 9:
                        Statics.field573 = Integer.parseInt(var5);
                        break;
                    case 11:
                        if (var5.equalsIgnoreCase(class2.field28)) {
                        }
                        break;
                    case 12:
                        field288 = Integer.parseInt(var5);
                        break;
                    case 13:
                        Statics.field1057 = var5;
                        break;
                    case 15:
                        Statics.field1166 = var5;
                }
            }
        }
        class86.field1503 = false;
        field291 = false;
        Statics.field796 = this.getCodeBase().getHost();
        String var7 = Statics.field3113.field2264;
        byte var8 = 0;
        try {
            Statics.field2215 = 16;
            Statics.field2222 = var8;
            try {
                Statics.field277 = System.getProperty("os.name");
            } catch (Exception var22) {
                Statics.field277 = "Unknown";
            }
            Statics.field764 = Statics.field277.toLowerCase();
            try {
                Statics.field70 = System.getProperty("user.home");
                if (Statics.field70 != null) {
                    Statics.field70 = Statics.field70 + "/";
                }
            } catch (Exception var21) {
            }
            try {
                if (Statics.field764.startsWith("win")) {
                    if (Statics.field70 == null) {
                        Statics.field70 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field70 == null) {
                    Statics.field70 = System.getenv("HOME");
                }
                if (Statics.field70 != null) {
                    Statics.field70 = Statics.field70 + "/";
                }
            } catch (Exception var20) {
            }
            if (Statics.field70 == null) {
                Statics.field70 = "~/";
            }
            Statics.field1888 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field70, "/tmp/", "" };
            Statics.field252 = new String[] { ".jagex_cache_" + Statics.field2222, ".file_store_" + Statics.field2222 };
            label122: for (int var12 = 0; var12 < 4; var12++) {
                Statics.field2211 = class149.method2622("oldschool", var7, var12);
                if (!Statics.field2211.exists()) {
                    Statics.field2211.mkdirs();
                }
                File[] var13 = Statics.field2211.listFiles();
                if (var13 == null) {
                    break;
                }
                File[] var14 = var13;
                int var15 = 0;
                while (true) {
                    if (var15 >= var14.length) {
                        break label122;
                    }
                    File var16 = var14[var15];
                    if (!class149.method2624(var16, false)) {
                        break;
                    }
                    var15++;
                }
            }
            File var17 = Statics.field2211;
            Statics.field2078 = var17;
            if (!Statics.field2078.exists()) {
                throw new RuntimeException("");
            }
            class135.field2077 = true;
            class149.method668();
            class149.field2225 = new class228(new class227(class135.method799("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class149.field2223 = new class228(new class227(class135.method799("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2221 = new class228[Statics.field2215];
            for (int var18 = 0; var18 < Statics.field2215; var18++) {
                Statics.field2221[var18] = new class228(new class227(class135.method799("main_file_cache.idx" + var18), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var23) {
            class148.method145((String) null, var23);
        }
        Statics.field284 = this;
        this.method2818(765, 503, 95);
    }

    @ObfuscatedName("client.h(I)V")
    public final void method223() {
        Statics.field1055 = field288 == 0 ? 43594 : field460 + 40000;
        Statics.field92 = field288 == 0 ? 443 : field460 + 50000;
        Statics.field2283 = Statics.field1055;
        Statics.field2899 = class174.field2876;
        Statics.field2895 = class174.field2878;
        Statics.field2286 = class174.field2877;
        Statics.field1375 = class174.field2875;
        class137.method142();
        Canvas var1 = Statics.field1781;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class137.field2106);
        var1.addFocusListener(class137.field2106);
        Canvas var2 = Statics.field1781;
        var2.addMouseListener(class140.field2143);
        var2.addMouseMotionListener(class140.field2143);
        var2.addFocusListener(class140.field2143);
        Statics.field142 = class131.method2931();
        if (Statics.field142 != null) {
            Statics.field142.method2664(Statics.field1781);
        }
        Statics.field2066 = new class134(255, class149.field2225, class149.field2223, 500000);
        Statics.field1389 = class9.method165();
        Statics.field77 = this.getToolkit().getSystemClipboard();
        class138.method660(this, Statics.field54);
        if (field288 != 0) {
            field302 = true;
        }
        method188(Statics.field1389.field138);
    }

    @ObfuscatedName("client.d(B)V")
    public final void method224() {
        field290++;
        this.method227();
        class170.method965();
        class183.method2930();
        method1759();
        class137 var1 = class137.field2106;
        synchronized (class137.field2106) {
            class137.field2101++;
            class137.field2118 = class137.field2117;
            class137.field2112 = 0;
            if (class137.field2110 >= 0) {
                while (class137.field2110 != class137.field2109) {
                    int var3 = class137.field2115[class137.field2109];
                    class137.field2109 = class137.field2109 + 1 & 0x7F;
                    if (var3 < 0) {
                        class137.field2107[~var3] = false;
                    } else {
                        if (!class137.field2107[var3] && class137.field2112 < class137.field2113.length - 1) {
                            class137.field2113[++class137.field2112 - 1] = var3;
                        }
                        class137.field2107[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class137.field2107[var2] = false;
                }
                class137.field2110 = class137.field2109;
            }
            class137.field2117 = class137.field2116;
        }
        class140.method2139();
        if (Statics.field142 != null) {
            int var5 = Statics.field142.method2657();
            field389 = var5;
        }
        if (field507 == 0) {
            method1577();
            class144.method2021();
        } else if (field507 == 5) {
            class32.method3133(this);
            method1577();
            class144.method2021();
        } else if (field507 == 10 || field507 == 11) {
            class32.method3133(this);
        } else if (field507 == 20) {
            class32.method3133(this);
            method2615();
        } else if (field507 == 25) {
            method1000(false);
            field342 = 0;
            boolean var6 = true;
            for (int var7 = 0; var7 < Statics.field569.length; var7++) {
                if (Statics.field1398[var7] != -1 && Statics.field569[var7] == null) {
                    Statics.field569[var7] = Statics.field2242.method3035(Statics.field1398[var7], 0);
                    if (Statics.field569[var7] == null) {
                        var6 = false;
                        field342++;
                    }
                }
                if (Statics.field1094[var7] != -1 && Statics.field347[var7] == null) {
                    Statics.field347[var7] = Statics.field2242.method3036(Statics.field1094[var7], 0, Statics.field1100[var7]);
                    if (Statics.field347[var7] == null) {
                        var6 = false;
                        field342++;
                    }
                }
            }
            if (var6) {
                field571 = 0;
                boolean var8 = true;
                for (int var9 = 0; var9 < Statics.field569.length; var9++) {
                    byte[] var10 = Statics.field347[var9];
                    if (var10 != null) {
                        int var11 = (Statics.field1088[var9] >> 8) * 64 - Statics.field1201;
                        int var12 = (Statics.field1088[var9] & 0xFF) * 64 - Statics.field1150;
                        if (field547) {
                            var11 = 10;
                            var12 = 10;
                        }
                        var8 &= Statics.method13(var10, var11, var12);
                    }
                }
                if (var8) {
                    if (field346 != 0) {
                        Statics.method155(class157.field2309 + class2.field23 + class2.field24 + 100 + "%" + class2.field17, true);
                    }
                    method1759();
                    method2226();
                    method1759();
                    Statics.field676.method1770();
                    method1759();
                    System.gc();
                    for (int var13 = 0; var13 < 4; var13++) {
                        field348[var13].method2229();
                    }
                    for (int var14 = 0; var14 < 4; var14++) {
                        for (int var15 = 0; var15 < 104; var15++) {
                            for (int var16 = 0; var16 < 104; var16++) {
                                class6.field76[var14][var15][var16] = 0;
                            }
                        }
                    }
                    method1759();
                    class6.method2531();
                    int var17 = Statics.field569.length;
                    class24.method693();
                    method1000(true);
                    if (!field547) {
                        for (int var18 = 0; var18 < var17; var18++) {
                            int var19 = (Statics.field1088[var18] >> 8) * 64 - Statics.field1201;
                            int var20 = (Statics.field1088[var18] & 0xFF) * 64 - Statics.field1150;
                            byte[] var21 = Statics.field569[var18];
                            if (var21 != null) {
                                method1759();
                                class6.method46(var21, var19, var20, Statics.field2058 * 8 - 48, Statics.field1450 * 8 - 48, field348);
                            }
                        }
                        for (int var22 = 0; var22 < var17; var22++) {
                            int var23 = (Statics.field1088[var22] >> 8) * 64 - Statics.field1201;
                            int var24 = (Statics.field1088[var22] & 0xFF) * 64 - Statics.field1150;
                            byte[] var25 = Statics.field569[var22];
                            if (var25 == null && Statics.field1450 < 800) {
                                method1759();
                                class6.method2574(var23, var24, 64, 64);
                            }
                        }
                        method1000(true);
                        for (int var26 = 0; var26 < var17; var26++) {
                            byte[] var27 = Statics.field347[var26];
                            if (var27 != null) {
                                int var28 = (Statics.field1088[var26] >> 8) * 64 - Statics.field1201;
                                int var29 = (Statics.field1088[var26] & 0xFF) * 64 - Statics.field1150;
                                method1759();
                                class86 var30 = Statics.field676;
                                class108[] var31 = field348;
                                class119 var32 = new class119(var27);
                                int var33 = -1;
                                while (true) {
                                    int var34 = var32.method2446();
                                    if (var34 == 0) {
                                        break;
                                    }
                                    var33 += var34;
                                    int var35 = 0;
                                    while (true) {
                                        int var36 = var32.method2446();
                                        if (var36 == 0) {
                                            break;
                                        }
                                        var35 += var36 - 1;
                                        int var37 = var35 & 0x3F;
                                        int var38 = var35 >> 6 & 0x3F;
                                        int var39 = var35 >> 12;
                                        int var40 = var32.method2380();
                                        int var41 = var40 >> 2;
                                        int var42 = var40 & 0x3;
                                        int var43 = var28 + var38;
                                        int var44 = var29 + var37;
                                        if (var43 > 0 && var44 > 0 && var43 < 103 && var44 < 103) {
                                            int var45 = var39;
                                            if ((class6.field76[1][var43][var44] & 0x2) == 2) {
                                                var45 = var39 - 1;
                                            }
                                            class108 var46 = null;
                                            if (var45 >= 0) {
                                                var46 = var31[var45];
                                            }
                                            class6.method846(var39, var43, var44, var33, var42, var41, var30, var46);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (field547) {
                        int var47 = 0;
                        label1017: while (true) {
                            if (var47 >= 4) {
                                for (int var58 = 0; var58 < 13; var58++) {
                                    for (int var59 = 0; var59 < 13; var59++) {
                                        int var60 = field350[0][var58][var59];
                                        if (var60 == -1) {
                                            class6.method2574(var58 * 8, var59 * 8, 8, 8);
                                        }
                                    }
                                }
                                method1000(true);
                                int var61 = 0;
                                while (true) {
                                    if (var61 >= 4) {
                                        break label1017;
                                    }
                                    method1759();
                                    for (int var62 = 0; var62 < 13; var62++) {
                                        label974: for (int var63 = 0; var63 < 13; var63++) {
                                            int var64 = field350[var61][var62][var63];
                                            if (var64 != -1) {
                                                int var65 = var64 >> 24 & 0x3;
                                                int var66 = var64 >> 1 & 0x3;
                                                int var67 = var64 >> 14 & 0x3FF;
                                                int var68 = var64 >> 3 & 0x7FF;
                                                int var69 = (var67 / 8 << 8) + var68 / 8;
                                                for (int var70 = 0; var70 < Statics.field1088.length; var70++) {
                                                    if (Statics.field1088[var70] == var69 && Statics.field347[var70] != null) {
                                                        byte[] var71 = Statics.field347[var70];
                                                        int var72 = var62 * 8;
                                                        int var73 = var63 * 8;
                                                        int var74 = (var67 & 0x7) * 8;
                                                        int var75 = (var68 & 0x7) * 8;
                                                        class86 var76 = Statics.field676;
                                                        class108[] var77 = field348;
                                                        class119 var78 = new class119(var71);
                                                        int var79 = -1;
                                                        while (true) {
                                                            int var80 = var78.method2446();
                                                            if (var80 == 0) {
                                                                continue label974;
                                                            }
                                                            var79 += var80;
                                                            int var81 = 0;
                                                            while (true) {
                                                                int var82 = var78.method2446();
                                                                if (var82 == 0) {
                                                                    break;
                                                                }
                                                                var81 += var82 - 1;
                                                                int var83 = var81 & 0x3F;
                                                                int var84 = var81 >> 6 & 0x3F;
                                                                int var85 = var81 >> 12;
                                                                int var86 = var78.method2380();
                                                                int var87 = var86 >> 2;
                                                                int var88 = var86 & 0x3;
                                                                if (var65 == var85 && var84 >= var74 && var84 < var74 + 8 && var83 >= var75 && var83 < var75 + 8) {
                                                                    class41 var89 = class41.method1767(var79);
                                                                    int var91 = var84 & 0x7;
                                                                    int var92 = var83 & 0x7;
                                                                    int var94 = var89.field936;
                                                                    int var95 = var89.field937;
                                                                    if ((var88 & 0x1) == 1) {
                                                                        int var96 = var94;
                                                                        var94 = var95;
                                                                        var95 = var96;
                                                                    }
                                                                    int var97 = var66 & 0x3;
                                                                    int var98;
                                                                    if (var97 == 0) {
                                                                        var98 = var91;
                                                                    } else if (var97 == 1) {
                                                                        var98 = var92;
                                                                    } else if (var97 == 2) {
                                                                        var98 = 7 - var91 - (var94 - 1);
                                                                    } else {
                                                                        var98 = 7 - var92 - (var95 - 1);
                                                                    }
                                                                    int var99 = var72 + var98;
                                                                    int var101 = var84 & 0x7;
                                                                    int var102 = var83 & 0x7;
                                                                    int var104 = var89.field936;
                                                                    int var105 = var89.field937;
                                                                    if ((var88 & 0x1) == 1) {
                                                                        int var106 = var104;
                                                                        var104 = var105;
                                                                        var105 = var106;
                                                                    }
                                                                    int var107 = var66 & 0x3;
                                                                    int var108;
                                                                    if (var107 == 0) {
                                                                        var108 = var102;
                                                                    } else if (var107 == 1) {
                                                                        var108 = 7 - var101 - (var104 - 1);
                                                                    } else if (var107 == 2) {
                                                                        var108 = 7 - var102 - (var105 - 1);
                                                                    } else {
                                                                        var108 = var101;
                                                                    }
                                                                    int var109 = var73 + var108;
                                                                    if (var99 > 0 && var109 > 0 && var99 < 103 && var109 < 103) {
                                                                        int var110 = var61;
                                                                        if ((class6.field76[1][var99][var109] & 0x2) == 2) {
                                                                            var110 = var61 - 1;
                                                                        }
                                                                        class108 var111 = null;
                                                                        if (var110 >= 0) {
                                                                            var111 = var77[var110];
                                                                        }
                                                                        class6.method846(var61, var99, var109, var79, var66 + var88 & 0x3, var87, var76, var111);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var61++;
                                }
                            }
                            method1759();
                            for (int var48 = 0; var48 < 13; var48++) {
                                for (int var49 = 0; var49 < 13; var49++) {
                                    boolean var50 = false;
                                    int var51 = field350[var47][var48][var49];
                                    if (var51 != -1) {
                                        int var52 = var51 >> 24 & 0x3;
                                        int var53 = var51 >> 1 & 0x3;
                                        int var54 = var51 >> 14 & 0x3FF;
                                        int var55 = var51 >> 3 & 0x7FF;
                                        int var56 = (var54 / 8 << 8) + var55 / 8;
                                        for (int var57 = 0; var57 < Statics.field1088.length; var57++) {
                                            if (Statics.field1088[var57] == var56 && Statics.field569[var57] != null) {
                                                class6.method2265(Statics.field569[var57], var47, var48 * 8, var49 * 8, var52, (var54 & 0x7) * 8, (var55 & 0x7) * 8, var53, field348);
                                                var50 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var50) {
                                        Statics.method2679(var47, var48 * 8, var49 * 8);
                                    }
                                }
                            }
                            var47++;
                        }
                    }
                    method1000(true);
                    method2226();
                    method1759();
                    class86 var112 = Statics.field676;
                    class108[] var113 = field348;
                    for (int var114 = 0; var114 < 4; var114++) {
                        for (int var115 = 0; var115 < 104; var115++) {
                            for (int var116 = 0; var116 < 104; var116++) {
                                if ((class6.field76[var114][var115][var116] & 0x1) == 1) {
                                    int var117 = var114;
                                    if ((class6.field76[1][var115][var116] & 0x2) == 2) {
                                        var117 = var114 - 1;
                                    }
                                    if (var117 >= 0) {
                                        var113[var117].method2232(var115, var116);
                                    }
                                }
                            }
                        }
                    }
                    class6.field85 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field85 < -8) {
                        class6.field85 = -8;
                    }
                    if (class6.field85 > 8) {
                        class6.field85 = 8;
                    }
                    class6.field86 += (int) (Math.random() * 5.0D) - 2;
                    if (class6.field86 < -16) {
                        class6.field86 = -16;
                    }
                    if (class6.field86 > 16) {
                        class6.field86 = 16;
                    }
                    for (int var118 = 0; var118 < 4; var118++) {
                        byte[][] var119 = Statics.field79[var118];
                        int var120 = (int) Math.sqrt(5100.0D);
                        int var121 = var120 * 768 >> 8;
                        for (int var122 = 1; var122 < 103; var122++) {
                            for (int var123 = 1; var123 < 103; var123++) {
                                int var124 = class6.field74[var118][var123 + 1][var122] - class6.field74[var118][var123 - 1][var122];
                                int var125 = class6.field74[var118][var123][var122 + 1] - class6.field74[var118][var123][var122 - 1];
                                int var126 = (int) Math.sqrt((double) (var125 * var125 + var124 * var124 + 65536));
                                int var127 = (var124 << 8) / var126;
                                int var128 = 65536 / var126;
                                int var129 = (var125 << 8) / var126;
                                int var130 = (var129 * -50 + var127 * -50 + var128 * -10) / var121 + 96;
                                int var131 = (var119[var123][var122] >> 1) + (var119[var123][var122 + 1] >> 3) + (var119[var123][var122 - 1] >> 2) + (var119[var123 - 1][var122] >> 2) + (var119[var123 + 1][var122] >> 3);
                                Statics.field141[var123][var122] = var130 - var131;
                            }
                        }
                        for (int var132 = 0; var132 < 104; var132++) {
                            Statics.field185[var132] = 0;
                            Statics.field1397[var132] = 0;
                            Statics.field78[var132] = 0;
                            Statics.field3190[var132] = 0;
                            Statics.field1101[var132] = 0;
                        }
                        for (int var133 = -5; var133 < 109; var133++) {
                            for (int var134 = 0; var134 < 104; var134++) {
                                int var135 = var133 + 5;
                                int var10002;
                                if (var135 >= 0 && var135 < 104) {
                                    int var136 = Statics.field675[var118][var135][var134] & 0xFF;
                                    if (var136 > 0) {
                                        int var137 = var136 - 1;
                                        class42 var138 = (class42) class42.field972.method3464((long) var137);
                                        class42 var139;
                                        if (var138 == null) {
                                            byte[] var140 = Statics.field978.method3035(1, var137);
                                            class42 var141 = new class42();
                                            if (var140 != null) {
                                                var141.method847(new class119(var140), var137);
                                            }
                                            var141.method844();
                                            class42.field972.method3466(var141, (long) var137);
                                            var139 = var141;
                                        } else {
                                            var139 = var138;
                                        }
                                        Statics.field185[var134] += var139.field974;
                                        Statics.field1397[var134] += var139.field971;
                                        Statics.field78[var134] += var139.field976;
                                        Statics.field3190[var134] += var139.field977;
                                        var10002 = Statics.field1101[var134]++;
                                    }
                                }
                                int var143 = var133 - 5;
                                if (var143 >= 0 && var143 < 104) {
                                    int var144 = Statics.field675[var118][var143][var134] & 0xFF;
                                    if (var144 > 0) {
                                        int var145 = var144 - 1;
                                        class42 var146 = (class42) class42.field972.method3464((long) var145);
                                        class42 var147;
                                        if (var146 == null) {
                                            byte[] var148 = Statics.field978.method3035(1, var145);
                                            class42 var149 = new class42();
                                            if (var148 != null) {
                                                var149.method847(new class119(var148), var145);
                                            }
                                            var149.method844();
                                            class42.field972.method3466(var149, (long) var145);
                                            var147 = var149;
                                        } else {
                                            var147 = var146;
                                        }
                                        Statics.field185[var134] -= var147.field974;
                                        Statics.field1397[var134] -= var147.field971;
                                        Statics.field78[var134] -= var147.field976;
                                        Statics.field3190[var134] -= var147.field977;
                                        var10002 = Statics.field1101[var134]--;
                                    }
                                }
                            }
                            if (var133 >= 1 && var133 < 103) {
                                int var151 = 0;
                                int var152 = 0;
                                int var153 = 0;
                                int var154 = 0;
                                int var155 = 0;
                                for (int var156 = -5; var156 < 109; var156++) {
                                    int var157 = var156 + 5;
                                    if (var157 >= 0 && var157 < 104) {
                                        var151 += Statics.field185[var157];
                                        var152 += Statics.field1397[var157];
                                        var153 += Statics.field78[var157];
                                        var154 += Statics.field3190[var157];
                                        var155 += Statics.field1101[var157];
                                    }
                                    int var158 = var156 - 5;
                                    if (var158 >= 0 && var158 < 104) {
                                        var151 -= Statics.field185[var158];
                                        var152 -= Statics.field1397[var158];
                                        var153 -= Statics.field78[var158];
                                        var154 -= Statics.field3190[var158];
                                        var155 -= Statics.field1101[var158];
                                    }
                                    if (var156 >= 1 && var156 < 103 && (!field291 || (class6.field76[0][var133][var156] & 0x2) != 0 || (class6.field76[var118][var133][var156] & 0x10) == 0)) {
                                        if (var118 < class6.field80) {
                                            class6.field80 = var118;
                                        }
                                        int var159 = Statics.field675[var118][var133][var156] & 0xFF;
                                        int var160 = Statics.field2248[var118][var133][var156] & 0xFF;
                                        if (var159 > 0 || var160 > 0) {
                                            int var161 = class6.field74[var118][var133][var156];
                                            int var162 = class6.field74[var118][var133 + 1][var156];
                                            int var163 = class6.field74[var118][var133 + 1][var156 + 1];
                                            int var164 = class6.field74[var118][var133][var156 + 1];
                                            int var165 = Statics.field141[var133][var156];
                                            int var166 = Statics.field141[var133 + 1][var156];
                                            int var167 = Statics.field141[var133 + 1][var156 + 1];
                                            int var168 = Statics.field141[var133][var156 + 1];
                                            int var169 = -1;
                                            int var170 = -1;
                                            if (var159 > 0) {
                                                int var171 = var151 * 256 / var154;
                                                int var172 = var152 / var155;
                                                int var173 = var153 / var155;
                                                var169 = class6.method2022(var171, var172, var173);
                                                int var174 = class6.field85 + var171 & 0xFF;
                                                int var175 = class6.field86 + var173;
                                                if (var175 < 0) {
                                                    var175 = 0;
                                                } else if (var175 > 255) {
                                                    var175 = 255;
                                                }
                                                var170 = class6.method2022(var174, var172, var175);
                                            }
                                            if (var118 > 0) {
                                                boolean var176 = true;
                                                if (var159 == 0 && Statics.field73[var118][var133][var156] != 0) {
                                                    var176 = false;
                                                }
                                                if (var160 > 0) {
                                                    int var177 = var160 - 1;
                                                    class47 var178 = (class47) class47.field1044.method3464((long) var177);
                                                    class47 var179;
                                                    if (var178 == null) {
                                                        byte[] var180 = Statics.field1053.method3035(4, var177);
                                                        class47 var181 = new class47();
                                                        if (var180 != null) {
                                                            var181.method960(new class119(var180), var177);
                                                        }
                                                        var181.method946();
                                                        class47.field1044.method3466(var181, (long) var177);
                                                        var179 = var181;
                                                    } else {
                                                        var179 = var178;
                                                    }
                                                    if (!var179.field1047) {
                                                        var176 = false;
                                                    }
                                                }
                                                if (var176 && var161 == var162 && var161 == var163 && var161 == var164) {
                                                    Statics.field1388[var118][var133][var156] |= 0x924;
                                                }
                                            }
                                            int var182 = 0;
                                            if (var170 != -1) {
                                                var182 = class91.field1561[class6.method2275(var170, 96)];
                                            }
                                            if (var160 == 0) {
                                                var112.method1775(var118, var133, var156, 0, 0, -1, var161, var162, var163, var164, class6.method2275(var169, var165), class6.method2275(var169, var166), class6.method2275(var169, var167), class6.method2275(var169, var168), 0, 0, 0, 0, var182, 0);
                                            } else {
                                                int var183 = Statics.field73[var118][var133][var156] + 1;
                                                byte var184 = Statics.field200[var118][var133][var156];
                                                int var185 = var160 - 1;
                                                class47 var186 = (class47) class47.field1044.method3464((long) var185);
                                                class47 var187;
                                                if (var186 == null) {
                                                    byte[] var188 = Statics.field1053.method3035(4, var185);
                                                    class47 var189 = new class47();
                                                    if (var188 != null) {
                                                        var189.method960(new class119(var188), var185);
                                                    }
                                                    var189.method946();
                                                    class47.field1044.method3466(var189, (long) var185);
                                                    var187 = var189;
                                                } else {
                                                    var187 = var186;
                                                }
                                                int var191 = var187.field1054;
                                                int var192;
                                                int var193;
                                                if (var191 >= 0) {
                                                    var192 = Statics.field1577.method2005(var191);
                                                    var193 = -1;
                                                } else if (var187.field1045 == 16711935) {
                                                    var193 = -2;
                                                    var191 = -1;
                                                    var192 = -2;
                                                } else {
                                                    var193 = class6.method2022(var187.field1049, var187.field1050, var187.field1051);
                                                    int var194 = class6.field85 + var187.field1049 & 0xFF;
                                                    int var195 = class6.field86 + var187.field1051;
                                                    if (var195 < 0) {
                                                        var195 = 0;
                                                    } else if (var195 > 255) {
                                                        var195 = 255;
                                                    }
                                                    var192 = class6.method2022(var194, var187.field1050, var195);
                                                }
                                                int var196 = 0;
                                                if (var192 != -2) {
                                                    var196 = class91.field1561[class6.method2271(var192, 96)];
                                                }
                                                if (var187.field1052 != -1) {
                                                    int var197 = class6.field85 + var187.field1056 & 0xFF;
                                                    int var198 = class6.field86 + var187.field1043;
                                                    if (var198 < 0) {
                                                        var198 = 0;
                                                    } else if (var198 > 255) {
                                                        var198 = 255;
                                                    }
                                                    int var199 = class6.method2022(var197, var187.field1048, var198);
                                                    var196 = class91.field1561[class6.method2271(var199, 96)];
                                                }
                                                var112.method1775(var118, var133, var156, var183, var184, var191, var161, var162, var163, var164, class6.method2275(var169, var165), class6.method2275(var169, var166), class6.method2275(var169, var167), class6.method2275(var169, var168), class6.method2271(var193, var165), class6.method2271(var193, var166), class6.method2271(var193, var167), class6.method2271(var193, var168), var182, var196);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var200 = 1; var200 < 103; var200++) {
                            for (int var201 = 1; var201 < 103; var201++) {
                                var112.method1884(var118, var201, var200, Statics.method679(var118, var201, var200));
                            }
                        }
                        Statics.field675[var118] = (byte[][]) null;
                        Statics.field2248[var118] = (byte[][]) null;
                        Statics.field73[var118] = (byte[][]) null;
                        Statics.field200[var118] = (byte[][]) null;
                        Statics.field79[var118] = (byte[][]) null;
                    }
                    var112.method1801(-50, -10, -50);
                    for (int var202 = 0; var202 < 104; var202++) {
                        for (int var203 = 0; var203 < 104; var203++) {
                            if ((class6.field76[1][var202][var203] & 0x2) == 2) {
                                var112.method1772(var202, var203);
                            }
                        }
                    }
                    int var204 = 1;
                    int var205 = 2;
                    int var206 = 4;
                    for (int var207 = 0; var207 < 4; var207++) {
                        if (var207 > 0) {
                            var204 <<= 0x3;
                            var205 <<= 0x3;
                            var206 <<= 0x3;
                        }
                        for (int var208 = 0; var208 <= var207; var208++) {
                            for (int var209 = 0; var209 <= 104; var209++) {
                                for (int var210 = 0; var210 <= 104; var210++) {
                                    if ((Statics.field1388[var208][var210][var209] & var204) != 0) {
                                        int var211 = var209;
                                        int var212 = var209;
                                        int var213 = var208;
                                        int var214 = var208;
                                        while (var211 > 0 && (Statics.field1388[var208][var210][var211 - 1] & var204) != 0) {
                                            var211--;
                                        }
                                        while (var212 < 104 && (Statics.field1388[var208][var210][var212 + 1] & var204) != 0) {
                                            var212++;
                                        }
                                        label700: while (var213 > 0) {
                                            for (int var215 = var211; var215 <= var212; var215++) {
                                                if ((Statics.field1388[var213 - 1][var210][var215] & var204) == 0) {
                                                    break label700;
                                                }
                                            }
                                            var213--;
                                        }
                                        label689: while (var214 < var207) {
                                            for (int var216 = var211; var216 <= var212; var216++) {
                                                if ((Statics.field1388[var214 + 1][var210][var216] & var204) == 0) {
                                                    break label689;
                                                }
                                            }
                                            var214++;
                                        }
                                        int var217 = (var214 + 1 - var213) * (var212 - var211 + 1);
                                        if (var217 >= 8) {
                                            short var218 = 240;
                                            int var219 = class6.field74[var214][var210][var211] - var218;
                                            int var220 = class6.field74[var213][var210][var211];
                                            class86.method1901(var207, 1, var210 * 128, var210 * 128, var211 * 128, var212 * 128 + 128, var219, var220);
                                            for (int var221 = var213; var221 <= var214; var221++) {
                                                for (int var222 = var211; var222 <= var212; var222++) {
                                                    Statics.field1388[var221][var210][var222] &= ~var204;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field1388[var208][var210][var209] & var205) != 0) {
                                        int var223 = var210;
                                        int var224 = var210;
                                        int var225 = var208;
                                        int var226 = var208;
                                        while (var223 > 0 && (Statics.field1388[var208][var223 - 1][var209] & var205) != 0) {
                                            var223--;
                                        }
                                        while (var224 < 104 && (Statics.field1388[var208][var224 + 1][var209] & var205) != 0) {
                                            var224++;
                                        }
                                        label753: while (var225 > 0) {
                                            for (int var227 = var223; var227 <= var224; var227++) {
                                                if ((Statics.field1388[var225 - 1][var227][var209] & var205) == 0) {
                                                    break label753;
                                                }
                                            }
                                            var225--;
                                        }
                                        label742: while (var226 < var207) {
                                            for (int var228 = var223; var228 <= var224; var228++) {
                                                if ((Statics.field1388[var226 + 1][var228][var209] & var205) == 0) {
                                                    break label742;
                                                }
                                            }
                                            var226++;
                                        }
                                        int var229 = (var226 + 1 - var225) * (var224 - var223 + 1);
                                        if (var229 >= 8) {
                                            short var230 = 240;
                                            int var231 = class6.field74[var226][var223][var209] - var230;
                                            int var232 = class6.field74[var225][var223][var209];
                                            class86.method1901(var207, 2, var223 * 128, var224 * 128 + 128, var209 * 128, var209 * 128, var231, var232);
                                            for (int var233 = var225; var233 <= var226; var233++) {
                                                for (int var234 = var223; var234 <= var224; var234++) {
                                                    Statics.field1388[var233][var234][var209] &= ~var205;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field1388[var208][var210][var209] & var206) != 0) {
                                        int var235 = var210;
                                        int var236 = var210;
                                        int var237 = var209;
                                        int var238 = var209;
                                        while (var237 > 0 && (Statics.field1388[var208][var210][var237 - 1] & var206) != 0) {
                                            var237--;
                                        }
                                        while (var238 < 104 && (Statics.field1388[var208][var210][var238 + 1] & var206) != 0) {
                                            var238++;
                                        }
                                        label806: while (var235 > 0) {
                                            for (int var239 = var237; var239 <= var238; var239++) {
                                                if ((Statics.field1388[var208][var235 - 1][var239] & var206) == 0) {
                                                    break label806;
                                                }
                                            }
                                            var235--;
                                        }
                                        label795: while (var236 < 104) {
                                            for (int var240 = var237; var240 <= var238; var240++) {
                                                if ((Statics.field1388[var208][var236 + 1][var240] & var206) == 0) {
                                                    break label795;
                                                }
                                            }
                                            var236++;
                                        }
                                        if ((var236 - var235 + 1) * (var238 - var237 + 1) >= 4) {
                                            int var241 = class6.field74[var208][var235][var237];
                                            class86.method1901(var207, 4, var235 * 128, var236 * 128 + 128, var237 * 128, var238 * 128 + 128, var241, var241);
                                            for (int var242 = var235; var242 <= var236; var242++) {
                                                for (int var243 = var237; var243 <= var238; var243++) {
                                                    Statics.field1388[var208][var242][var243] &= ~var206;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method1000(true);
                    int var244 = class6.field80;
                    if (var244 > Statics.field1181) {
                        var244 = Statics.field1181;
                    }
                    if (var244 < Statics.field1181 - 1) {
                        int var245 = Statics.field1181 - 1;
                    }
                    if (field291) {
                        Statics.field676.method1771(class6.field80);
                    } else {
                        Statics.field676.method1771(0);
                    }
                    for (int var246 = 0; var246 < 104; var246++) {
                        for (int var247 = 0; var247 < 104; var247++) {
                            method1080(var246, var247);
                        }
                    }
                    method1759();
                    method742();
                    class41.field945.method3467();
                    if (Statics.field1399 != null) {
                        field330.method2578(162);
                        field330.method2333(1057001181);
                    }
                    if (!field547) {
                        int var248 = (Statics.field2058 - 6) / 8;
                        int var249 = (Statics.field2058 + 6) / 8;
                        int var250 = (Statics.field1450 - 6) / 8;
                        int var251 = (Statics.field1450 + 6) / 8;
                        for (int var252 = var248 - 1; var252 <= var249 + 1; var252++) {
                            for (int var253 = var250 - 1; var253 <= var251 + 1; var253++) {
                                if (var252 < var248 || var252 > var249 || var253 < var250 || var253 > var251) {
                                    Statics.field2242.method3075("m" + var252 + "_" + var253);
                                    Statics.field2242.method3075("l" + var252 + "_" + var253);
                                }
                            }
                        }
                    }
                    method1766(30);
                    method1759();
                    class6.method1949();
                    field330.method2578(70);
                    class144.method2021();
                } else {
                    field346 = 2;
                }
            } else {
                field346 = 1;
            }
        }
        if (field507 == 30) {
            method114();
        } else if (field507 == 40 || field507 == 45) {
            method2615();
        }
    }

    @ObfuscatedName("client.c(I)V")
    public final void method225() {
        boolean var1;
        label240: {
            try {
                if (class183.field2937 == 2) {
                    if (Statics.field207 == null) {
                        Statics.field207 = class180.method3281(Statics.field3131, Statics.field2251, Statics.field2936);
                        if (Statics.field207 == null) {
                            var1 = false;
                            break label240;
                        }
                    }
                    if (Statics.field1400 == null) {
                        Statics.field1400 = new class60(Statics.field2933, Statics.field2934);
                    }
                    if (Statics.field2935.method3355(Statics.field207, Statics.field2932, Statics.field1400, 22050)) {
                        Statics.field2935.method3356();
                        Statics.field2935.method3353(Statics.field2028);
                        Statics.field2935.method3358(Statics.field207, Statics.field2938);
                        class183.field2937 = 0;
                        Statics.field207 = null;
                        Statics.field1400 = null;
                        Statics.field3131 = null;
                        var1 = true;
                        break label240;
                    }
                }
            } catch (Exception var32) {
                var32.printStackTrace();
                Statics.field2935.method3386();
                class183.field2937 = 0;
                Statics.field207 = null;
                Statics.field1400 = null;
                Statics.field3131 = null;
            }
            var1 = false;
        }
        if (var1 && field526 && Statics.field95 != null) {
            Statics.field95.method1181();
        }
        if (field507 == 10 || field507 == 20 || field507 == 30) {
            if (field499 != 0L && class115.method2134() > field499) {
                method188(method167());
            } else if (field2187) {
                method2596();
            }
        }
        Dimension var4 = this.method2851();
        if (Statics.field1950 != var4.width || Statics.field880 != var4.height || field2186) {
            method924();
            field499 = class115.method2134() + 500L;
            field2186 = false;
        }
        boolean var5 = false;
        if (field2173) {
            field2173 = false;
            var5 = true;
            for (int var6 = 0; var6 < 100; var6++) {
                field559[var6] = true;
            }
        }
        if (var5) {
            method3132();
        }
        if (field507 == 0) {
            class144.method144(class32.field730, class32.field726, (Color) null, var5);
        } else if (field507 == 5) {
            class32.method573(Statics.field1516, Statics.field2006, Statics.field1946, var5);
        } else if (field507 == 10 || field507 == 11) {
            class32.method573(Statics.field1516, Statics.field2006, Statics.field1946, var5);
        } else if (field507 == 20) {
            class32.method573(Statics.field1516, Statics.field2006, Statics.field1946, var5);
        } else if (field507 == 25) {
            if (field346 == 1) {
                if (field342 > field343) {
                    field343 = field342;
                }
                int var7 = (field343 * 50 - field342 * 50) / field343;
                Statics.method155(class157.field2309 + class2.field23 + class2.field24 + var7 + "%" + class2.field17, false);
            } else if (field346 == 2) {
                if (field571 > field345) {
                    field345 = field571;
                }
                int var8 = (field345 * 50 - field571 * 50) / field345 + 50;
                Statics.method155(class157.field2309 + class2.field23 + class2.field24 + var8 + "%" + class2.field17, false);
            } else {
                Statics.method155(class157.field2309, false);
            }
        } else if (field507 == 30) {
            if (field446 != -1) {
                int var9 = field446;
                if (class173.method2289(var9)) {
                    method137(Statics.field2801[var9], -1);
                }
            }
            for (int var10 = 0; var10 < field489; var10++) {
                if (field559[var10]) {
                    field480[var10] = true;
                }
                field493[var10] = field559[var10];
                field559[var10] = false;
            }
            field550 = field290;
            field435 = -1;
            field436 = -1;
            Statics.field763 = null;
            if (field446 != -1) {
                field489 = 0;
                method1523(field446, 0, 0, Statics.field63, Statics.field686, 0, 0, -1);
            }
            class80.method1686();
            if (field310) {
                int var11 = Statics.field2588;
                int var12 = Statics.field1869;
                int var13 = Statics.field2298;
                int var14 = Statics.field601;
                int var15 = 6116423;
                class80.method1692(var11, var12, var13, var14, var15);
                class80.method1692(var11 + 1, var12 + 1, var13 - 2, 16, 0);
                class80.method1694(var11 + 1, var12 + 18, var13 - 2, var14 - 19, 0);
                Statics.field1516.method3733(class157.field2453, var11 + 3, var12 + 14, var15, -1);
                int var16 = class140.field2146;
                int var17 = class140.field2136;
                for (int var18 = 0; var18 < field428; var18++) {
                    int var19 = (field428 - 1 - var18) * 15 + var12 + 31;
                    int var20 = 16777215;
                    if (var16 > var11 && var16 < var11 + var13 && var17 > var19 - 13 && var17 < var19 + 3) {
                        var20 = 16776960;
                    }
                    class224 var21 = Statics.field1516;
                    String var22;
                    if (field468[var18].length() > 0) {
                        var22 = field553[var18] + class157.field2460 + field468[var18];
                    } else {
                        var22 = field553[var18];
                    }
                    var21.method3733(var22, var11 + 3, var19, var20, 0);
                }
                method213(Statics.field2588, Statics.field1869, Statics.field2298, Statics.field601);
            } else if (field435 != -1) {
                method1498(field435, field436);
            }
            if (field498 == 3) {
                for (int var23 = 0; var23 < field489; var23++) {
                    if (field493[var23]) {
                        class80.method1698(field323[var23], field495[var23], field496[var23], field479[var23], 16711935, 128);
                    } else if (field480[var23]) {
                        class80.method1698(field323[var23], field495[var23], field496[var23], field479[var23], 16711680, 128);
                    }
                }
            }
            class24.method2796(Statics.field1181, Statics.field1544.field866, Statics.field1544.field814, field355);
            field355 = 0;
        } else if (field507 == 40) {
            Statics.method155(class157.field2310 + class2.field23 + class157.field2311, false);
        } else if (field507 == 45) {
            Statics.method155(class157.field2491, false);
        }
        if (field507 == 30 && field498 == 0 && !var5) {
            try {
                Graphics var24 = Statics.field1781.getGraphics();
                for (int var25 = 0; var25 < field489; var25++) {
                    if (field480[var25]) {
                        Statics.field1379.method1529(var24, field323[var25], field495[var25], field496[var25], field479[var25]);
                        field480[var25] = false;
                    }
                }
            } catch (Exception var31) {
                Statics.field1781.repaint();
            }
        } else if (field507 > 0) {
            try {
                Graphics var27 = Statics.field1781.getGraphics();
                Statics.field1379.method1528(var27, 0, 0);
                for (int var28 = 0; var28 < field489; var28++) {
                    field480[var28] = false;
                }
            } catch (Exception var30) {
                Statics.field1781.repaint();
            }
        }
    }

    @ObfuscatedName("client.y(S)V")
    public final void method421() {
        if (Statics.field275.method215()) {
            Statics.field275.method184();
        }
        if (Statics.field258 != null) {
            Statics.field258.field197 = false;
        }
        Statics.field258 = null;
        if (Statics.field2278 != null) {
            Statics.field2278.method2797();
            Statics.field2278 = null;
        }
        class137.method936();
        if (class140.field2143 != null) {
            class140 var1 = class140.field2143;
            synchronized (class140.field2143) {
                class140.field2143 = null;
            }
        }
        Statics.field142 = null;
        if (Statics.field95 != null) {
            Statics.field95.method1208();
        }
        if (Statics.field2701 != null) {
            Statics.field2701.method1208();
        }
        if (Statics.field2710 != null) {
            Statics.field2710.method2797();
        }
        Object var3 = class170.field2698;
        synchronized (class170.field2698) {
            if (class170.field2697 != 0) {
                class170.field2697 = 1;
                try {
                    class170.field2698.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        Statics.method2019();
    }

    @ObfuscatedName("cy.m(II)V")
    public static void method1766(int arg0) {
        if (field507 == arg0) {
            return;
        }
        if (field507 == 0) {
            class144.method744();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field320 = 0;
            field570 = 0;
            field416 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field301 != null) {
            Statics.field301.method2797();
            Statics.field301 = null;
        }
        if (field507 == 25) {
            field346 = 0;
            field342 = 0;
            field343 = 1;
            field571 = 0;
            field345 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method943(Statics.field1781, Statics.field772, Statics.field1382, true, 0);
        } else if (arg0 == 20) {
            class32.method943(Statics.field1781, Statics.field772, Statics.field1382, true, field507 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method943(Statics.field1781, Statics.field772, Statics.field1382, false, 4);
        } else {
            class32.method2597();
        }
        field507 = arg0;
    }

    @ObfuscatedName("client.e(B)V")
    public void method227() {
        if (field507 != 1000) {
            boolean var1 = class171.method2968();
            if (!var1) {
                this.method304();
            }
        }
    }

    @ObfuscatedName("client.z(I)V")
    public void method304() {
        if (class171.field2718 >= 4) {
            this.method2827("js5crc");
            field507 = 1000;
            return;
        }
        if (class171.field2722 >= 4) {
            if (field507 <= 5) {
                this.method2827("js5io");
                field507 = 1000;
                return;
            }
            field316 = 3000;
            class171.field2722 = 3;
        }
        if (--field316 + 1 > 0) {
            return;
        }
        try {
            if (field519 == 0) {
                Statics.field997 = Statics.field2889.method2696(Statics.field796, Statics.field2283);
                field519++;
            }
            if (field519 == 1) {
                if (Statics.field997.field2194 == 2) {
                    this.method229(-1);
                    return;
                }
                if (Statics.field997.field2194 == 1) {
                    field519++;
                }
            }
            if (field519 == 2) {
                Statics.field1554 = new class143((Socket) Statics.field997.field2197, Statics.field2889);
                class119 var1 = new class119(5);
                var1.method2436(15);
                var1.method2333(95);
                Statics.field1554.method2802(var1.field1982, 0, 5);
                field519++;
                Statics.field62 = class115.method2134();
            }
            if (field519 == 3) {
                if (field507 <= 5 || Statics.field1554.method2805() > 0) {
                    int var2 = Statics.field1554.method2799();
                    if (var2 != 0) {
                        this.method229(var2);
                        return;
                    }
                    field519++;
                } else if (class115.method2134() - Statics.field62 > 30000L) {
                    this.method229(-2);
                    return;
                }
            }
            if (field519 == 4) {
                class171.method1513(Statics.field1554, field507 > 20);
                Statics.field997 = null;
                Statics.field1554 = null;
                field519 = 0;
                field517 = 0;
            }
        } catch (IOException var4) {
            this.method229(-3);
        }
    }

    @ObfuscatedName("client.t(II)V")
    public void method229(int arg0) {
        Statics.field997 = null;
        Statics.field1554 = null;
        field519 = 0;
        if (Statics.field2283 == Statics.field1055) {
            Statics.field2283 = Statics.field92;
        } else {
            Statics.field2283 = Statics.field1055;
        }
        field517++;
        if (field517 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field507 <= 5) {
                this.method2827("js5connect_full");
                field507 = 1000;
            } else {
                field316 = 3000;
            }
        } else if (field517 >= 2 && arg0 == 6) {
            this.method2827("js5connect_outofdate");
            field507 = 1000;
        } else if (field517 >= 4) {
            if (field507 <= 5) {
                this.method2827("js5connect");
                field507 = 1000;
            } else {
                field316 = 3000;
            }
        }
    }

    @ObfuscatedName("bc.b(I)V")
    public static void method1577() {
        if (field314 == 0) {
            Statics.field676 = new class86(4, 104, 104, class6.field74);
            for (int var0 = 0; var0 < 4; var0++) {
                field348[var0] = new class108(104, 104);
            }
            Statics.field655 = new class79(512, 512);
            class32.field726 = class157.field2312;
            class32.field730 = 5;
            field314 = 20;
        } else if (field314 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class91.field1574[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class86.method1805(var1, 500, 800, 512, 334);
            class32.field726 = class157.field2313;
            class32.field730 = 10;
            field314 = 30;
        } else if (field314 == 30) {
            Statics.field187 = method2(0, false, true, true);
            Statics.field87 = method2(1, false, true, true);
            Statics.field684 = method2(2, true, false, true);
            Statics.field3054 = method2(3, false, true, true);
            Statics.field669 = method2(4, false, true, true);
            Statics.field2242 = method2(5, true, true, true);
            Statics.field1938 = method2(6, true, true, false);
            Statics.field249 = method2(7, false, true, true);
            Statics.field1382 = method2(8, false, true, true);
            Statics.field418 = method2(9, false, true, true);
            Statics.field772 = method2(10, false, true, true);
            Statics.field760 = method2(11, false, true, true);
            Statics.field2049 = method2(12, false, true, true);
            Statics.field318 = method2(13, true, false, true);
            Statics.field1081 = method2(14, false, true, false);
            Statics.field1759 = method2(15, false, true, true);
            class32.field726 = class157.field2314;
            class32.field730 = 20;
            field314 = 40;
        } else if (field314 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field187.method3115() * 4 / 100;
            int var8 = var7 + Statics.field87.method3115() * 4 / 100;
            int var9 = var8 + Statics.field684.method3115() * 2 / 100;
            int var10 = var9 + Statics.field3054.method3115() * 2 / 100;
            int var11 = var10 + Statics.field669.method3115() * 6 / 100;
            int var12 = var11 + Statics.field2242.method3115() * 4 / 100;
            int var13 = var12 + Statics.field1938.method3115() * 2 / 100;
            int var14 = var13 + Statics.field249.method3115() * 60 / 100;
            int var15 = var14 + Statics.field1382.method3115() * 2 / 100;
            int var16 = var15 + Statics.field418.method3115() * 2 / 100;
            int var17 = var16 + Statics.field772.method3115() * 2 / 100;
            int var18 = var17 + Statics.field760.method3115() * 2 / 100;
            int var19 = var18 + Statics.field2049.method3115() * 2 / 100;
            int var20 = var19 + Statics.field318.method3115() * 2 / 100;
            int var21 = var20 + Statics.field1081.method3115() * 2 / 100;
            int var22 = var21 + Statics.field1759.method3115() * 2 / 100;
            if (var22 == 100) {
                class32.field726 = class157.field2394;
                class32.field730 = 30;
                field314 = 45;
            } else {
                if (var22 != 0) {
                    class32.field726 = class157.field2315 + var22 + "%";
                }
                class32.field730 = 30;
            }
        } else if (field314 == 45) {
            class57.method604(22050, !field291, 2);
            class184 var23 = new class184();
            var23.method3390(9, 128);
            Statics.field95 = class57.method168(Statics.field2889, Statics.field1781, 0, 22050);
            Statics.field95.method1178(var23);
            class168 var24 = Statics.field1759;
            class168 var25 = Statics.field1081;
            class168 var26 = Statics.field669;
            Statics.field2932 = var24;
            Statics.field2934 = var25;
            Statics.field2933 = var26;
            Statics.field2935 = var23;
            Statics.field2701 = class57.method168(Statics.field2889, Statics.field1781, 1, 2048);
            Statics.field1038 = new class56();
            Statics.field2701.method1178(Statics.field1038);
            Statics.field3052 = new class75(22050, Statics.field1190);
            class32.field726 = class157.field2317;
            class32.field730 = 35;
            field314 = 50;
        } else if (field314 == 50) {
            int var27 = 0;
            if (Statics.field2006 == null) {
                class168 var28 = Statics.field1382;
                class168 var29 = Statics.field318;
                int var30 = var28.method3049("p11_full");
                int var31 = var28.method3079(var30, "");
                class224 var32;
                if (class77.method12(var28, var30, var31)) {
                    byte[] var33 = var29.method3035(var30, var31);
                    class224 var34;
                    if (var33 == null) {
                        var34 = null;
                    } else {
                        class224 var35 = new class224(var33, Statics.field2891, Statics.field3144, Statics.field1384, Statics.field1386, Statics.field1041, Statics.field1755);
                        Statics.field2891 = null;
                        Statics.field3144 = null;
                        Statics.field1384 = null;
                        Statics.field1386 = null;
                        Statics.field1041 = null;
                        Statics.field1755 = (byte[][]) null;
                        var34 = var35;
                    }
                    var32 = var34;
                } else {
                    var32 = null;
                }
                Statics.field2006 = var32;
            } else {
                var27++;
            }
            if (Statics.field1946 == null) {
                class168 var37 = Statics.field1382;
                class168 var38 = Statics.field318;
                int var39 = var37.method3049("p12_full");
                int var40 = var37.method3079(var39, "");
                class224 var41;
                if (class77.method12(var37, var39, var40)) {
                    byte[] var42 = var38.method3035(var39, var40);
                    class224 var43;
                    if (var42 == null) {
                        var43 = null;
                    } else {
                        class224 var44 = new class224(var42, Statics.field2891, Statics.field3144, Statics.field1384, Statics.field1386, Statics.field1041, Statics.field1755);
                        Statics.field2891 = null;
                        Statics.field3144 = null;
                        Statics.field1384 = null;
                        Statics.field1386 = null;
                        Statics.field1041 = null;
                        Statics.field1755 = (byte[][]) null;
                        var43 = var44;
                    }
                    var41 = var43;
                } else {
                    var41 = null;
                }
                Statics.field1946 = var41;
            } else {
                var27++;
            }
            if (Statics.field1516 == null) {
                class168 var46 = Statics.field1382;
                class168 var47 = Statics.field318;
                int var48 = var46.method3049("b12_full");
                int var49 = var46.method3079(var48, "");
                class224 var50;
                if (class77.method12(var46, var48, var49)) {
                    byte[] var51 = var47.method3035(var48, var49);
                    class224 var52;
                    if (var51 == null) {
                        var52 = null;
                    } else {
                        class224 var53 = new class224(var51, Statics.field2891, Statics.field3144, Statics.field1384, Statics.field1386, Statics.field1041, Statics.field1755);
                        Statics.field2891 = null;
                        Statics.field3144 = null;
                        Statics.field1384 = null;
                        Statics.field1386 = null;
                        Statics.field1041 = null;
                        Statics.field1755 = (byte[][]) null;
                        var52 = var53;
                    }
                    var50 = var52;
                } else {
                    var50 = null;
                }
                Statics.field1516 = var50;
            } else {
                var27++;
            }
            if (var27 < 3) {
                class32.field726 = class157.field2318 + var27 * 100 / 3 + "%";
                class32.field730 = 40;
            } else {
                Statics.field801 = new class160(true);
                class32.field726 = class157.field2319;
                class32.field730 = 40;
                field314 = 60;
            }
        } else if (field314 == 60) {
            class168 var55 = Statics.field772;
            class168 var56 = Statics.field1382;
            int var57 = 0;
            if (var55.method3106("title.jpg", "")) {
                var57++;
            }
            if (var56.method3106("logo", "")) {
                var57++;
            }
            if (var56.method3106("titlebox", "")) {
                var57++;
            }
            if (var56.method3106("titlebutton", "")) {
                var57++;
            }
            if (var56.method3106("runes", "")) {
                var57++;
            }
            if (var56.method3106("title_mute", "")) {
                var57++;
            }
            if (var56.method3068("options_radio_buttons,0")) {
                var57++;
            }
            if (var56.method3068("options_radio_buttons,2")) {
                var57++;
            }
            var56.method3106("sl_back", "");
            var56.method3106("sl_flags", "");
            var56.method3106("sl_arrows", "");
            var56.method3106("sl_stars", "");
            var56.method3106("sl_button", "");
            byte var60 = 8;
            if (var57 < var60) {
                class32.field726 = class157.field2367 + var57 * 100 / var60 + "%";
                class32.field730 = 50;
            } else {
                class32.field726 = class157.field2321;
                class32.field730 = 50;
                method1766(5);
                field314 = 70;
            }
        } else if (field314 == 70) {
            if (Statics.field684.method3039()) {
                class47.method2146(Statics.field684);
                class42.method2939(Statics.field684);
                class168 var62 = Statics.field684;
                class168 var63 = Statics.field249;
                Statics.field1033 = var62;
                Statics.field1023 = var63;
                Statics.field1024 = Statics.field1033.method3044(3);
                class41.method644(Statics.field684, Statics.field249, field291);
                class168 var64 = Statics.field684;
                class168 var65 = Statics.field249;
                Statics.field896 = var64;
                Statics.field882 = var65;
                class52.method163(Statics.field684, Statics.field249, field361, Statics.field2006);
                class168 var66 = Statics.field684;
                class168 var67 = Statics.field187;
                class168 var68 = Statics.field87;
                Statics.field2158 = var66;
                Statics.field999 = var67;
                Statics.field980 = var68;
                class44.method2947(Statics.field684, Statics.field249);
                class48.method2928(Statics.field684);
                class168 var69 = Statics.field684;
                Statics.field1167 = var69;
                Statics.field1165 = Statics.field1167.method3044(16);
                class173.method2279(Statics.field3054, Statics.field249, Statics.field1382, Statics.field318);
                class168 var70 = Statics.field684;
                Statics.field1097 = var70;
                class49.method2037(Statics.field684);
                class168 var71 = Statics.field684;
                Statics.field1039 = var71;
                class168 var72 = Statics.field684;
                Statics.field1091 = var72;
                Statics.field275 = new class20();
                class32.field726 = class157.field2323;
                class32.field730 = 60;
                field314 = 80;
            } else {
                class32.field726 = class157.field2530 + Statics.field684.method3114() + "%";
                class32.field730 = 60;
            }
        } else if (field314 == 80) {
            int var73 = 0;
            if (Statics.field184 == null) {
                Statics.field184 = Statics.method682(Statics.field1382, "compass", "");
            } else {
                var73++;
            }
            if (Statics.field667 == null) {
                Statics.field667 = Statics.method682(Statics.field1382, "mapedge", "");
            } else {
                var73++;
            }
            if (Statics.field2577 == null) {
                Statics.field2577 = class77.method44(Statics.field1382, "mapscene", "");
            } else {
                var73++;
            }
            if (Statics.field1892 == null) {
                Statics.field1892 = class77.method725(Statics.field1382, "mapfunction", "");
            } else {
                var73++;
            }
            if (Statics.field8 == null) {
                Statics.field8 = class77.method725(Statics.field1382, "hitmarks", "");
            } else {
                var73++;
            }
            if (Statics.field1393 == null) {
                Statics.field1393 = class77.method725(Statics.field1382, "headicons_pk", "");
            } else {
                var73++;
            }
            if (Statics.field57 == null) {
                Statics.field57 = class77.method725(Statics.field1382, "headicons_prayer", "");
            } else {
                var73++;
            }
            if (Statics.field236 == null) {
                Statics.field236 = class77.method725(Statics.field1382, "headicons_hint", "");
            } else {
                var73++;
            }
            if (Statics.field514 == null) {
                Statics.field514 = class77.method725(Statics.field1382, "mapmarker", "");
            } else {
                var73++;
            }
            if (Statics.field709 == null) {
                Statics.field709 = class77.method725(Statics.field1382, "cross", "");
            } else {
                var73++;
            }
            if (Statics.field2191 == null) {
                Statics.field2191 = class77.method725(Statics.field1382, "mapdots", "");
            } else {
                var73++;
            }
            if (Statics.field2020 == null) {
                Statics.field2020 = class77.method44(Statics.field1382, "scrollbar", "");
            } else {
                var73++;
            }
            if (Statics.field127 == null) {
                Statics.field127 = class77.method44(Statics.field1382, "mod_icons", "");
            } else {
                var73++;
            }
            if (var73 < 13) {
                class32.field726 = class157.field2324 + var73 * 100 / 13 + "%";
                class32.field730 = 70;
            } else {
                Statics.field3184 = Statics.field127;
                Statics.field667.method1589();
                int var74 = (int) (Math.random() * 21.0D) - 10;
                int var75 = (int) (Math.random() * 21.0D) - 10;
                int var76 = (int) (Math.random() * 21.0D) - 10;
                int var77 = (int) (Math.random() * 41.0D) - 20;
                for (int var78 = 0; var78 < Statics.field1892.length; var78++) {
                    Statics.field1892[var78].method1584(var74 + var77, var75 + var77, var76 + var77);
                }
                Statics.field2577[0].method1738(var74 + var77, var75 + var77, var76 + var77);
                class32.field726 = class157.field2325;
                class32.field730 = 70;
                field314 = 90;
            }
        } else if (field314 == 90) {
            if (Statics.field418.method3039()) {
                class95 var79 = new class95(Statics.field418, Statics.field1382, 20, 0.8D, field291 ? 64 : 128);
                class91.method1955(var79);
                class91.method1956(0.8D);
                class32.field726 = class157.field2442;
                class32.field730 = 90;
                field314 = 110;
            } else {
                class32.field726 = class157.field2378 + Statics.field418.method3114() + "%";
                class32.field730 = 90;
            }
        } else if (field314 == 110) {
            Statics.field258 = new class14();
            Statics.field2889.method2697(Statics.field258, 10);
            class32.field726 = class157.field2328;
            class32.field730 = 94;
            field314 = 120;
        } else if (field314 == 120) {
            if (Statics.field772.method3106("huffman", "")) {
                class113 var80 = new class113(Statics.field772.method3051("huffman", ""));
                Statics.field3166 = var80;
                class32.field726 = class157.field2399;
                class32.field730 = 96;
                field314 = 130;
            } else {
                class32.field726 = class157.field2329 + "%";
                class32.field730 = 96;
            }
        } else if (field314 == 130) {
            if (!Statics.field3054.method3039()) {
                class32.field726 = class157.field2331 + Statics.field3054.method3114() * 4 / 5 + "%";
                class32.field730 = 100;
            } else if (!Statics.field2049.method3039()) {
                class32.field726 = class157.field2331 + (80 + Statics.field2049.method3114() / 6) + "%";
                class32.field730 = 100;
            } else if (Statics.field318.method3039()) {
                class32.field726 = class157.field2484;
                class32.field730 = 100;
                field314 = 140;
            } else {
                class32.field726 = class157.field2331 + (96 + Statics.field318.method3114() / 20) + "%";
                class32.field730 = 100;
            }
        } else if (field314 == 140) {
            method1766(10);
        }
    }

    @ObfuscatedName("i.l(IZZZI)Lfs;")
    public static class168 method2(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class134 var4 = null;
        if (class149.field2225 != null) {
            var4 = new class134(arg0, class149.field2225, Statics.field2221[arg0], 1000000);
        }
        return new class168(var4, Statics.field2066, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("de.s(B)V")
    public static final void method2615() {
        try {
            if (field320 == 0) {
                if (Statics.field2278 != null) {
                    Statics.field2278.method2797();
                    Statics.field2278 = null;
                }
                Statics.field2208 = null;
                field341 = false;
                field570 = 0;
                field320 = 1;
            }
            if (field320 == 1) {
                if (Statics.field2208 == null) {
                    Statics.field2208 = Statics.field2889.method2696(Statics.field796, Statics.field2283);
                }
                if (Statics.field2208.field2194 == 2) {
                    throw new IOException();
                }
                if (Statics.field2208.field2194 == 1) {
                    Statics.field2278 = new class143((Socket) Statics.field2208.field2197, Statics.field2889);
                    Statics.field2208 = null;
                    field320 = 2;
                }
            }
            if (field320 == 2) {
                field330.field1980 = 0;
                field330.method2436(14);
                Statics.field2278.method2802(field330.field1982, 0, 1);
                field332.field1980 = 0;
                field320 = 3;
            }
            if (field320 == 3) {
                if (Statics.field95 != null) {
                    Statics.field95.method1182();
                }
                if (Statics.field2701 != null) {
                    Statics.field2701.method1182();
                }
                int var0 = Statics.field2278.method2799();
                if (Statics.field95 != null) {
                    Statics.field95.method1182();
                }
                if (Statics.field2701 != null) {
                    Statics.field2701.method1182();
                }
                if (var0 != 0) {
                    method2532(var0);
                    return;
                }
                field332.field1980 = 0;
                field320 = 5;
            }
            if (field320 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field330.field1980 = 0;
                field330.method2436(1);
                field330.method2436(class32.field738.method562());
                field330.method2333(var1[0]);
                field330.method2333(var1[1]);
                field330.method2333(var1[2]);
                field330.method2333(var1[3]);
                switch(class32.field738.field2586) {
                    case 0:
                        field330.field1980 += 8;
                        break;
                    case 1:
                    case 2:
                        field330.method2467(Statics.field685);
                        field330.field1980 += 5;
                        break;
                    case 3:
                        field330.method2333((Integer) Statics.field1389.field143.get(class163.method1943(class32.field739)));
                        field330.field1980 += 4;
                }
                field330.method2336(class32.field737);
                field330.method2401(class5.field72, class5.field64);
                field331.field1980 = 0;
                if (field507 == 40) {
                    field331.method2436(18);
                } else {
                    field331.method2436(16);
                }
                field331.method2331(0);
                int var2 = field331.field1980;
                field331.method2333(95);
                field331.method2393(field330.field1982, 0, field330.field1980);
                int var3 = field331.field1980;
                field331.method2336(class32.field739);
                field331.method2436((field500 ? 1 : 0) << 1 | (field291 ? 1 : 0));
                field331.method2331(Statics.field63);
                field331.method2331(Statics.field686);
                class122 var4 = field331;
                byte[] var5 = new byte[24];
                try {
                    class149.field2213.method3841(0L);
                    class149.field2213.method3835(var5);
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
                var4.method2393(var5, 0, 24);
                field331.method2336(Statics.field1166);
                field331.method2333(Statics.field293);
                class119 var9 = new class119(Statics.field801.method2963());
                Statics.field801.method2954(var9);
                field331.method2393(var9.field1982, 0, var9.field1982.length);
                field331.method2436(Statics.field573);
                field331.method2333(Statics.field187.field2670);
                field331.method2333(Statics.field87.field2670);
                field331.method2333(Statics.field684.field2670);
                field331.method2333(Statics.field3054.field2670);
                field331.method2333(Statics.field669.field2670);
                field331.method2333(Statics.field2242.field2670);
                field331.method2333(Statics.field1938.field2670);
                field331.method2333(Statics.field249.field2670);
                field331.method2333(Statics.field1382.field2670);
                field331.method2333(Statics.field418.field2670);
                field331.method2333(Statics.field772.field2670);
                field331.method2333(Statics.field760.field2670);
                field331.method2333(Statics.field2049.field2670);
                field331.method2333(Statics.field318.field2670);
                field331.method2333(Statics.field1081.field2670);
                field331.method2333(Statics.field1759.field2670);
                field331.method2523(var1, var3, field331.field1980);
                field331.method2474(field331.field1980 - var2);
                Statics.field2278.method2802(field331.field1982, 0, field331.field1980);
                field330.method2577(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field332.method2577(var1);
                field320 = 6;
            }
            if (field320 == 6 && Statics.field2278.method2805() > 0) {
                int var11 = Statics.field2278.method2799();
                if (var11 == 21 && field507 == 20) {
                    field320 = 7;
                } else if (var11 == 2) {
                    field320 = 9;
                } else if (var11 == 15 && field507 == 40) {
                    field333 = -1;
                    field320 = 13;
                } else if (var11 == 23 && field416 < 1) {
                    field416++;
                    field320 = 0;
                } else if (var11 == 29) {
                    field320 = 11;
                } else {
                    method2532(var11);
                    return;
                }
            }
            if (field320 == 7 && Statics.field2278.method2805() > 0) {
                field536 = (Statics.field2278.method2799() + 3) * 60;
                field320 = 8;
            }
            if (field320 == 8) {
                field570 = 0;
                class32.method420(class157.field2336, class157.field2337, field536 / 60 + class157.field2385);
                if (--field536 <= 0) {
                    field320 = 0;
                }
            } else {
                if (field320 == 9 && Statics.field2278.method2805() >= 13) {
                    boolean var12 = Statics.field2278.method2799() == 1;
                    Statics.field2278.method2801(field332.field1982, 0, 4);
                    field332.field1980 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field332.method2593() << 24;
                        int var15 = var14 | field332.method2593() << 16;
                        int var16 = var15 | field332.method2593() << 8;
                        int var17 = var16 | field332.method2593();
                        int var18 = class163.method1943(class32.field739);
                        if (Statics.field1389.field143.size() >= 10 && !Statics.field1389.field143.containsKey(var18)) {
                            Iterator var19 = Statics.field1389.field143.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field1389.field143.put(var18, var17);
                        class9.method86();
                    }
                    field384 = Statics.field2278.method2799();
                    field422 = Statics.field2278.method2799() == 1;
                    field410 = Statics.field2278.method2799();
                    field410 <<= 0x8;
                    field410 += Statics.field2278.method2799();
                    field411 = Statics.field2278.method2799();
                    Statics.field2278.method2801(field332.field1982, 0, 1);
                    field332.field1980 = 0;
                    field334 = field332.method2593();
                    Statics.field2278.method2801(field332.field1982, 0, 2);
                    field332.field1980 = 0;
                    field333 = field332.method2347();
                    if (field411 == 1) {
                        try {
                            class132.method2667(Statics.field284, "zap");
                        } catch (Throwable var32) {
                        }
                    } else {
                        try {
                            class132.method2667(Statics.field284, "unzap");
                        } catch (Throwable var31) {
                        }
                    }
                    field320 = 10;
                }
                if (field320 != 10) {
                    if (field320 == 11 && Statics.field2278.method2805() >= 2) {
                        field332.field1980 = 0;
                        Statics.field2278.method2801(field332.field1982, 0, 2);
                        field332.field1980 = 0;
                        Statics.field3167 = field332.method2347();
                        field320 = 12;
                    }
                    if (field320 == 12 && Statics.field2278.method2805() >= Statics.field3167) {
                        field332.field1980 = 0;
                        Statics.field2278.method2801(field332.field1982, 0, Statics.field3167);
                        field332.field1980 = 0;
                        String var22 = field332.method2356();
                        String var23 = field332.method2356();
                        String var24 = field332.method2356();
                        class32.method420(var22, var23, var24);
                        method1766(10);
                    }
                    if (field320 == 13) {
                        if (field333 == -1) {
                            if (Statics.field2278.method2805() < 2) {
                                return;
                            }
                            Statics.field2278.method2801(field332.field1982, 0, 2);
                            field332.field1980 = 0;
                            field333 = field332.method2347();
                        }
                        if (Statics.field2278.method2805() >= field333) {
                            Statics.field2278.method2801(field332.field1982, 0, field333);
                            field332.field1980 = 0;
                            int var25 = field333;
                            field330.field1980 = 0;
                            field332.field1980 = 0;
                            field334 = -1;
                            field359 = -1;
                            field338 = -1;
                            field339 = -1;
                            field333 = 0;
                            field335 = 0;
                            field303 = 0;
                            field428 = 0;
                            field310 = false;
                            field494 = 0;
                            field521 = 0;
                            for (int var26 = 0; var26 < 2048; var26++) {
                                field409[var26] = null;
                            }
                            Statics.field1544 = null;
                            for (int var27 = 0; var27 < field324.length; var27++) {
                                class35 var28 = field324[var27];
                                if (var28 != null) {
                                    var28.field836 = -1;
                                    var28.field868 = false;
                                }
                            }
                            class16.field213 = new class196(32);
                            method1766(30);
                            for (int var29 = 0; var29 < 100; var29++) {
                                field559[var29] = true;
                            }
                            method3459();
                            class33.method1768(field332);
                            if (field332.field1980 != var25) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field570++;
                        if (field570 > 2000) {
                            if (field416 < 1) {
                                if (Statics.field2283 == Statics.field1055) {
                                    Statics.field2283 = Statics.field92;
                                } else {
                                    Statics.field2283 = Statics.field1055;
                                }
                                field416++;
                                field320 = 0;
                            } else {
                                method2532(-3);
                            }
                        }
                    }
                } else if (Statics.field2278.method2805() >= field333) {
                    field332.field1980 = 0;
                    Statics.field2278.method2801(field332.field1982, 0, field333);
                    method601();
                    class33.method1768(field332);
                    Statics.field2058 = -1;
                    method94(false);
                    field334 = -1;
                }
            }
        } catch (IOException var34) {
            if (field416 < 1) {
                if (Statics.field2283 == Statics.field1055) {
                    Statics.field2283 = Statics.field92;
                } else {
                    Statics.field2283 = Statics.field1055;
                }
                field416++;
                field320 = 0;
            } else {
                method2532(-2);
            }
        }
    }

    @ObfuscatedName("j.f(B)V")
    public static void method601() {
        field364 = 1L;
        field300 = -1;
        Statics.field258.field196 = 0;
        Statics.field1670 = true;
        field296 = true;
        field376 = -1L;
        class211.method180();
        field330.field1980 = 0;
        field332.field1980 = 0;
        field334 = -1;
        field359 = -1;
        field338 = -1;
        field339 = -1;
        field335 = 0;
        field303 = 0;
        field340 = 0;
        field511 = 0;
        field428 = 0;
        field310 = false;
        class140.method658(0);
        class12.method567();
        field484 = 0;
        field491 = false;
        field529 = 0;
        field352 = (int) (Math.random() * 100.0D) - 50;
        field354 = (int) (Math.random() * 110.0D) - 55;
        field438 = (int) (Math.random() * 80.0D) - 40;
        field470 = (int) (Math.random() * 120.0D) - 60;
        field367 = (int) (Math.random() * 30.0D) - 20;
        field373 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field494 = 0;
        field501 = -1;
        field521 = 0;
        field522 = 0;
        field313 = class21.field575;
        field325 = 0;
        class33.field750 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class33.field752[var0] = null;
            class33.field761[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field409[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field324[var2] = null;
        }
        field454 = -1;
        field371.method3553();
        field444.method3553();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field419[var3][var4][var5] = null;
                }
            }
        }
        field420 = new class199();
        field456 = 0;
        field554 = 0;
        field558 = 0;
        for (int var6 = 0; var6 < Statics.field1165; var6++) {
            class53 var7 = class53.method732(var6);
            if (var7 != null) {
                class176.field2885[var6] = 0;
                class176.field2886[var6] = 0;
            }
        }
        Statics.field275.method186();
        field356 = -1;
        if (field446 != -1) {
            class173.method667(field446);
        }
        for (class4 var8 = (class4) field447.method3506(); var8 != null; var8 = (class4) field447.method3500()) {
            method101(var8, true);
        }
        field446 = -1;
        field447 = new class196(8);
        field450 = null;
        field310 = false;
        field428 = 0;
        field560.method3269((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field415[var9] = null;
            field448[var9] = false;
        }
        class16.field213 = new class196(32);
        field295 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field559[var10] = true;
        }
        method3459();
        field366 = null;
        Statics.field679 = 0;
        Statics.field170 = null;
        for (int var11 = 0; var11 < 8; var11++) {
            field563[var11] = new class220();
        }
        Statics.field133 = null;
    }

    @ObfuscatedName("dx.g(IB)V")
    public static void method2532(int arg0) {
        if (arg0 == -3) {
            class32.method420(class157.field2339, class157.field2340, class157.field2341);
        } else if (arg0 == -2) {
            class32.method420(class157.field2481, class157.field2355, class157.field2431);
        } else if (arg0 == -1) {
            class32.method420(class157.field2345, class157.field2455, class157.field2377);
        } else if (arg0 == 3) {
            class32.method420(class157.field2348, class157.field2389, class157.field2350);
        } else if (arg0 == 4) {
            class32.method420(class157.field2351, class157.field2352, class157.field2332);
        } else if (arg0 == 5) {
            class32.method420(class157.field2354, class157.field2560, class157.field2356);
        } else if (arg0 == 6) {
            class32.method420(class157.field2379, class157.field2358, class157.field2359);
        } else if (arg0 == 7) {
            class32.method420(class157.field2450, class157.field2514, class157.field2362);
        } else if (arg0 == 8) {
            class32.method420(class157.field2555, class157.field2364, class157.field2365);
        } else if (arg0 == 9) {
            class32.method420(class157.field2366, class157.field2449, class157.field2368);
        } else if (arg0 == 10) {
            class32.method420(class157.field2369, class157.field2479, class157.field2371);
        } else if (arg0 == 11) {
            class32.method420(class157.field2372, class157.field2373, class157.field2374);
        } else if (arg0 == 12) {
            class32.method420(class157.field2375, class157.field2376, class157.field2335);
        } else if (arg0 == 13) {
            class32.method420(class157.field2418, class157.field2567, class157.field2380);
        } else if (arg0 == 14) {
            class32.method420(class157.field2553, class157.field2440, class157.field2416);
        } else if (arg0 == 16) {
            class32.method420(class157.field2428, class157.field2524, class157.field2386);
        } else if (arg0 == 17) {
            class32.method420(class157.field2387, class157.field2388, class157.field2544);
        } else if (arg0 == 18) {
            class32.method420(class157.field2390, class157.field2338, class157.field2392);
        } else if (arg0 == 19) {
            class32.method420(class157.field2516, class157.field2306, class157.field2437);
        } else if (arg0 == 20) {
            class32.method420(class157.field2301, class157.field2397, class157.field2398);
        } else if (arg0 == 22) {
            class32.method420(class157.field2395, class157.field2400, class157.field2401);
        } else if (arg0 == 23) {
            class32.method420(class157.field2482, class157.field2403, class157.field2404);
        } else if (arg0 == 24) {
            class32.method420(class157.field2495, class157.field2357, class157.field2360);
        } else if (arg0 == 25) {
            class32.method420(class157.field2408, class157.field2343, class157.field2391);
        } else if (arg0 == 26) {
            class32.method420(class157.field2411, class157.field2412, class157.field2413);
        } else if (arg0 == 27) {
            class32.method420(class157.field2464, class157.field2526, class157.field2529);
        } else if (arg0 == 31) {
            class32.method420(class157.field2423, class157.field2424, class157.field2425);
        } else if (arg0 == 32) {
            class32.method420(class157.field2506, class157.field2427, class157.field2542);
        } else if (arg0 == 37) {
            class32.method420(class157.field2429, class157.field2383, class157.field2426);
        } else if (arg0 == 38) {
            class32.method420(class157.field2326, class157.field2433, class157.field2434);
        } else if (arg0 == 55) {
            class32.method420(class157.field2370, class157.field2436, class157.field2523);
        } else if (arg0 == 56) {
            class32.method420(class157.field2438, class157.field2342, class157.field2410);
            method1766(11);
            return;
        } else if (arg0 == 57) {
            class32.method420(class157.field2441, class157.field2564, class157.field2443);
            method1766(11);
            return;
        } else {
            class32.method420(class157.field2444, class157.field2445, class157.field2446);
        }
        method1766(10);
    }

    @ObfuscatedName("f.u(I)V")
    public static final void method166() {
        if (Statics.field2278 != null) {
            Statics.field2278.method2797();
            Statics.field2278 = null;
        }
        method2226();
        Statics.field676.method1770();
        for (int var0 = 0; var0 < 4; var0++) {
            field348[var0].method2229();
        }
        System.gc();
        class183.method856(2);
        field525 = -1;
        field526 = false;
        class24.method693();
        method1766(10);
    }

    @ObfuscatedName("dn.o(B)V")
    public static final void method2226() {
        class47.method745();
        class42.method670();
        Statics.method656();
        class41.field952.method3467();
        class41.field945.method3467();
        class41.field925.method3467();
        class41.field926.method3467();
        class40.method672();
        class52.method648();
        class43.method594();
        class44.field1019.method3467();
        class44.field1003.method3467();
        class48.method51();
        class53.method1758();
        class179.field2903.method3467();
        class173.field2864.method3467();
        class173.field2736.method3467();
        class173.field2782.method3467();
        class173.field2738.method3467();
        ((class95) Statics.field1577).method2028();
        class23.field593.method3467();
        Statics.field187.method3089();
        Statics.field87.method3089();
        Statics.field3054.method3089();
        Statics.field669.method3089();
        Statics.field2242.method3089();
        Statics.field1938.method3089();
        Statics.field249.method3089();
        Statics.field1382.method3089();
        Statics.field418.method3089();
        Statics.field772.method3089();
        Statics.field760.method3089();
        Statics.field2049.method3089();
    }

    @ObfuscatedName("y.k(B)V")
    public static final void method114() {
        if (field303 > 1) {
            field303--;
        }
        if (field340 > 0) {
            field340--;
        }
        if (field341) {
            field341 = false;
            if (field340 > 0) {
                method166();
            } else {
                method1766(40);
                Statics.field301 = Statics.field2278;
                Statics.field2278 = null;
            }
            return;
        }
        if (!field310) {
            field553[0] = class157.field2536;
            field468[0] = "";
            field431[0] = 1006;
            field428 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field2278 == null) {
                var1 = false;
            } else {
                label2493: {
                    try {
                        int var2 = Statics.field2278.method2805();
                        if (var2 == 0) {
                            var1 = false;
                            break label2493;
                        }
                        if (field334 == -1) {
                            Statics.field2278.method2801(field332.field1982, 0, 1);
                            field332.field1980 = 0;
                            field334 = field332.method2593();
                            field333 = class188.field3029[field334];
                            var2--;
                        }
                        if (field333 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2493;
                            }
                            Statics.field2278.method2801(field332.field1982, 0, 1);
                            field333 = field332.field1982[0] & 0xFF;
                            var2--;
                        }
                        if (field333 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2493;
                            }
                            Statics.field2278.method2801(field332.field1982, 0, 2);
                            field332.field1980 = 0;
                            field333 = field332.method2347();
                            var2 -= 2;
                        }
                        if (var2 < field333) {
                            var1 = false;
                            break label2493;
                        }
                        field332.field1980 = 0;
                        Statics.field2278.method2801(field332.field1982, 0, field333);
                        field335 = 0;
                        field339 = field338;
                        field338 = field359;
                        field359 = field334;
                        if (field334 == 229) {
                            field344 = true;
                            Statics.field1672 = field332.method2380();
                            Statics.field700 = field332.method2380();
                            Statics.field211 = field332.method2347();
                            Statics.field272 = field332.method2380();
                            Statics.field668 = field332.method2380();
                            if (Statics.field668 >= 100) {
                                Statics.field160 = Statics.field1672 * 128 + 64;
                                Statics.field1620 = Statics.field700 * 128 + 64;
                                Statics.field2041 = method2950(Statics.field160, Statics.field1620, Statics.field1181) - Statics.field211;
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 217) {
                            int var3 = field332.method2380();
                            int var4 = field332.method2380();
                            int var5 = field332.method2380();
                            int var6 = field332.method2380();
                            field329[var3] = true;
                            field537[var3] = var4;
                            field538[var3] = var5;
                            field539[var3] = var6;
                            field540[var3] = 0;
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 97) {
                            int var7 = field332.method2352();
                            int var8 = field332.method2430();
                            class173 var9 = class173.method2966(var7);
                            if (var9 != null && var9.field2743 == 0) {
                                if (var8 > var9.field2765 - var9.field2872) {
                                    var8 = var9.field2765 - var9.field2872;
                                }
                                if (var8 < 0) {
                                    var8 = 0;
                                }
                                if (var9.field2763 != var8) {
                                    var9.field2763 = var8;
                                    method2951(var9);
                                }
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 6) {
                            int var10 = field332.method2347();
                            int var11 = field332.method2380();
                            int var12 = field332.method2347();
                            method666(var10, var11, var12);
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 87) {
                            method94(false);
                            field332.method2593();
                            int var13 = field332.method2347();
                            class33.method197(field332, var13);
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 75) {
                            int var14 = field332.method2379();
                            if (var14 == 65535) {
                                var14 = -1;
                            }
                            int var15 = field332.method2430();
                            if (var15 == 65535) {
                                var15 = -1;
                            }
                            int var16 = field332.method2387();
                            int var17 = field332.method2350();
                            for (int var18 = var14; var18 <= var15; var18++) {
                                long var19 = ((long) var17 << 32) + (long) var18;
                                class208 var21 = field375.method3496(var19);
                                if (var21 != null) {
                                    var21.method3626();
                                }
                                field375.method3497(new class201(var16), var19);
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 13) {
                            int var22 = field332.method2352();
                            int var23 = field332.method2350();
                            class4 var24 = (class4) field447.method3496((long) var23);
                            class4 var25 = (class4) field447.method3496((long) var22);
                            if (var25 != null) {
                                method101(var25, var24 == null || var24.field58 != var25.field58);
                            }
                            if (var24 != null) {
                                var24.method3626();
                                field447.method3497(var24, (long) var22);
                            }
                            class173 var26 = class173.method2966(var23);
                            if (var26 != null) {
                                method2951(var26);
                            }
                            class173 var27 = class173.method2966(var22);
                            if (var27 != null) {
                                method2951(var27);
                                method2278(Statics.field2801[var27.field2741 >>> 16], var27, true);
                            }
                            if (field446 != -1) {
                                int var28 = field446;
                                if (class173.method2289(var28)) {
                                    method2932(Statics.field2801[var28], 1);
                                }
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 53) {
                            int var29 = field332.method2347();
                            int var30 = field332.method2387();
                            class173 var31 = class173.method2966(var30);
                            if (var31.field2747 != 2 || var31.field2789 != var29) {
                                var31.field2747 = 2;
                                var31.field2789 = var29;
                                method2951(var31);
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 254) {
                            String var32 = field332.method2356();
                            int var33 = field332.method2347();
                            byte var34 = field332.method2346();
                            boolean var35 = false;
                            if (var34 == -128) {
                                var35 = true;
                            }
                            if (var35) {
                                if (Statics.field679 == 0) {
                                    field334 = -1;
                                    var1 = true;
                                    break label2493;
                                }
                                boolean var36 = false;
                                int var37;
                                for (var37 = 0; var37 < Statics.field679 && (!Statics.field170[var37].field622.equals(var32) || Statics.field170[var37].field623 != var33); var37++) {
                                }
                                if (var37 < Statics.field679) {
                                    while (var37 < Statics.field679 - 1) {
                                        Statics.field170[var37] = Statics.field170[var37 + 1];
                                        var37++;
                                    }
                                    Statics.field679--;
                                    Statics.field170[Statics.field679] = null;
                                }
                            } else {
                                field332.method2356();
                                class25 var38 = new class25();
                                var38.field622 = var32;
                                var38.field628 = class164.method48(var38.field622, Statics.field289);
                                var38.field623 = var33;
                                var38.field631 = var34;
                                int var39;
                                for (var39 = Statics.field679 - 1; var39 >= 0; var39--) {
                                    int var40 = Statics.field170[var39].field628.compareTo(var38.field628);
                                    if (var40 == 0) {
                                        Statics.field170[var39].field623 = var33;
                                        Statics.field170[var39].field631 = var34;
                                        if (var32.equals(Statics.field1544.field35)) {
                                            Statics.field238 = var34;
                                        }
                                        field351 = field566;
                                        field334 = -1;
                                        var1 = true;
                                        break label2493;
                                    }
                                    if (var40 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field679 >= Statics.field170.length) {
                                    field334 = -1;
                                    var1 = true;
                                    break label2493;
                                }
                                for (int var41 = Statics.field679 - 1; var41 > var39; var41--) {
                                    Statics.field170[var41 + 1] = Statics.field170[var41];
                                }
                                if (Statics.field679 == 0) {
                                    Statics.field170 = new class25[100];
                                }
                                Statics.field170[var39 + 1] = var38;
                                Statics.field679++;
                                if (var32.equals(Statics.field1544.field35)) {
                                    Statics.field238 = var34;
                                }
                            }
                            field351 = field566;
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 169) {
                            field494 = field332.method2380();
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 230) {
                            method166();
                            field334 = -1;
                            var1 = false;
                            break label2493;
                        }
                        if (field334 == 176) {
                            boolean var42 = field332.method2355() == 1;
                            int var43 = field332.method2387();
                            class173 var44 = class173.method2966(var43);
                            if (var44.field2840 != var42) {
                                var44.field2840 = var42;
                                method2951(var44);
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 238) {
                            int var45 = field332.method2350();
                            int var46 = field332.method2347();
                            if (var45 < -70000) {
                                var46 += 32768;
                            }
                            class173 var47;
                            if (var45 >= 0) {
                                var47 = class173.method2966(var45);
                            } else {
                                var47 = null;
                            }
                            if (var47 != null) {
                                for (int var48 = 0; var48 < var47.field2857.length; var48++) {
                                    var47.field2857[var48] = 0;
                                    var47.field2794[var48] = 0;
                                }
                            }
                            class16 var49 = (class16) class16.field213.method3496((long) var46);
                            if (var49 != null) {
                                for (int var50 = 0; var50 < var49.field216.length; var50++) {
                                    var49.field216[var50] = -1;
                                    var49.field210[var50] = 0;
                                }
                            }
                            int var51 = field332.method2347();
                            for (int var52 = 0; var52 < var51; var52++) {
                                int var53 = field332.method2379();
                                int var54 = field332.method2380();
                                if (var54 == 255) {
                                    var54 = field332.method2350();
                                }
                                if (var47 != null && var52 < var47.field2857.length) {
                                    var47.field2857[var52] = var53;
                                    var47.field2794[var52] = var54;
                                }
                                class16.method1071(var46, var52, var53 - 1, var54);
                            }
                            if (var47 != null) {
                                method2951(var47);
                            }
                            method2757();
                            field513[++field474 - 1 & 0x1F] = var46 & 0x7FFF;
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 210) {
                            byte var55 = field332.method2346();
                            int var56 = field332.method2347();
                            class176.field2885[var56] = var55;
                            if (class176.field2886[var56] != var55) {
                                class176.field2886[var56] = var55;
                                method1218(var56);
                            }
                            field472[++field381 - 1 & 0x1F] = var56;
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 118) {
                            int var57 = field332.method2352();
                            int var58 = field332.method2347();
                            int var59 = var58 >> 10 & 0x1F;
                            int var60 = var58 >> 5 & 0x1F;
                            int var61 = var58 & 0x1F;
                            int var62 = (var61 << 3) + (var59 << 19) + (var60 << 11);
                            class173 var63 = class173.method2966(var57);
                            if (var63.field2766 != var62) {
                                var63.field2766 = var62;
                                method2951(var63);
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 27) {
                            field395 = field332.method2380();
                            field505 = field332.method2380();
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 1) {
                            boolean var64 = field332.method2380() == 1;
                            if (var64) {
                                Statics.field1161 = class115.method2134() - field332.method2451();
                                Statics.field133 = new class221(field332, true);
                            } else {
                                Statics.field133 = null;
                            }
                            field482 = field566;
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 100) {
                            String var65 = field332.method2356();
                            String var66 = class223.method3732(class163.method50(class222.method2906(field332)));
                            class12.method112(6, var65, var66);
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 14) {
                            for (int var67 = 0; var67 < field409.length; var67++) {
                                if (field409[var67] != null) {
                                    field409[var67].field841 = -1;
                                }
                            }
                            for (int var68 = 0; var68 < field324.length; var68++) {
                                if (field324[var68] != null) {
                                    field324[var68].field841 = -1;
                                }
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 201) {
                            int var69 = field332.method2388();
                            Statics.field627 = Statics.field2889.method2698(var69);
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 182) {
                            method179(field332.method2356());
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 120) {
                            int var70 = field332.method2380();
                            if (field332.method2380() == 0) {
                                field563[var70] = new class220();
                                field332.field1980 += 18;
                            } else {
                                field332.field1980--;
                                field563[var70] = new class220(field332, false);
                            }
                            field481 = field566;
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 2) {
                            for (int var71 = 0; var71 < Statics.field1165; var71++) {
                                class53 var72 = class53.method732(var71);
                                if (var72 != null) {
                                    class176.field2885[var71] = 0;
                                    class176.field2886[var71] = 0;
                                }
                            }
                            method2757();
                            field381 += 32;
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 10) {
                            Statics.field1674 = field332.method2380();
                            Statics.field2036 = field332.method2372();
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 162) {
                            int var73 = field332.method2379();
                            int var74 = field332.method2387();
                            class176.field2885[var73] = var74;
                            if (class176.field2886[var73] != var74) {
                                class176.field2886[var73] = var74;
                                method1218(var73);
                            }
                            field472[++field381 - 1 & 0x1F] = var73;
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 249) {
                            int var75 = field332.method2350();
                            int var76 = field332.method2347();
                            if (var75 < -70000) {
                                var76 += 32768;
                            }
                            class173 var77;
                            if (var75 >= 0) {
                                var77 = class173.method2966(var75);
                            } else {
                                var77 = null;
                            }
                            while (field332.field1980 < field333) {
                                int var78 = field332.method2446();
                                int var79 = field332.method2347();
                                int var80 = 0;
                                if (var79 != 0) {
                                    var80 = field332.method2380();
                                    if (var80 == 255) {
                                        var80 = field332.method2350();
                                    }
                                }
                                if (var77 != null && var78 >= 0 && var78 < var77.field2857.length) {
                                    var77.field2857[var78] = var79;
                                    var77.field2794[var78] = var80;
                                }
                                class16.method1071(var76, var78, var79 - 1, var80);
                            }
                            if (var77 != null) {
                                method2951(var77);
                            }
                            method2757();
                            field513[++field474 - 1 & 0x1F] = var76 & 0x7FFF;
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 177) {
                            method583(false);
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 90) {
                            field303 = field332.method2381() * 30;
                            field483 = field566;
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 209) {
                            Statics.field1674 = field332.method2371();
                            Statics.field2036 = field332.method2371();
                            while (field332.field1980 < field333) {
                                field334 = field332.method2380();
                                method2972();
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 39) {
                            method2757();
                            field451 = field332.method2380();
                            field483 = field566;
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 160) {
                            int var81 = field332.method2387();
                            class173 var82 = class173.method2966(var81);
                            for (int var83 = 0; var83 < var82.field2857.length; var83++) {
                                var82.field2857[var83] = -1;
                                var82.field2857[var83] = 0;
                            }
                            method2951(var82);
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 98) {
                            String var84 = field332.method2356();
                            int var85 = field332.method2388();
                            class173 var86 = class173.method2966(var85);
                            if (!var84.equals(var86.field2799)) {
                                var86.field2799 = var84;
                                method2951(var86);
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 82) {
                            method2757();
                            int var87 = field332.method2371();
                            int var88 = field332.method2350();
                            int var89 = field332.method2355();
                            field425[var87] = var88;
                            field423[var87] = var89;
                            field424[var87] = 1;
                            for (int var90 = 0; var90 < 98; var90++) {
                                if (var88 >= class155.field2281[var90]) {
                                    field424[var87] = var90 + 2;
                                }
                            }
                            field476[++field337 - 1 & 0x1F] = var87;
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 220) {
                            int var91 = field332.method2388();
                            int var92 = field332.method2379();
                            class173 var93 = class173.method2966(var91);
                            if (var93.field2747 != 1 || var93.field2789 != var92) {
                                var93.field2747 = 1;
                                var93.field2789 = var92;
                                method2951(var93);
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 240) {
                            field344 = false;
                            for (int var94 = 0; var94 < 5; var94++) {
                                field329[var94] = false;
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 251) {
                            while (field332.field1980 < field333) {
                                int var95 = field332.method2380();
                                boolean var96 = (var95 & 0x1) == 1;
                                String var97 = field332.method2356();
                                String var98 = field332.method2356();
                                field332.method2356();
                                for (int var99 = 0; var99 < field558; var99++) {
                                    class8 var100 = field421[var99];
                                    if (var96) {
                                        if (var98.equals(var100.field131)) {
                                            var100.field131 = var97;
                                            var100.field125 = var98;
                                            var97 = null;
                                            break;
                                        }
                                    } else if (var97.equals(var100.field131)) {
                                        var100.field131 = var97;
                                        var100.field125 = var98;
                                        var97 = null;
                                        break;
                                    }
                                }
                                if (var97 != null && field558 < 400) {
                                    class8 var101 = new class8();
                                    field421[field558] = var101;
                                    var101.field131 = var97;
                                    var101.field125 = var98;
                                    field558++;
                                }
                            }
                            field433 = field566;
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 99) {
                            int var102 = field332.method2430();
                            int var103 = field332.method2347();
                            int var104 = field332.method2350();
                            int var105 = field332.method2379();
                            class173 var106 = class173.method2966(var104);
                            if (var106.field2790 != var105 || var106.field2791 != var102 || var106.field2793 != var103) {
                                var106.field2790 = var105;
                                var106.field2791 = var102;
                                var106.field2793 = var103;
                                method2951(var106);
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 34) {
                            method2757();
                            field461 = field332.method2348();
                            field483 = field566;
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 138) {
                            int var107 = field332.method2381();
                            if (var107 == 65535) {
                                var107 = -1;
                            }
                            method2602(var107);
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 246) {
                            int var108 = field332.method2383();
                            int var109 = field332.method2379();
                            if (var109 == 65535) {
                                var109 = -1;
                            }
                            method726(var109, var108);
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 5) {
                            int var110 = field332.method2352();
                            int var111 = field332.method2379();
                            int var112 = field332.method2355();
                            class4 var113 = (class4) field447.method3496((long) var110);
                            if (var113 != null) {
                                method101(var113, var113.field58 != var111);
                            }
                            method895(var110, var111, var112);
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 168) {
                            field456 = 1;
                            field433 = field566;
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 226) {
                            field351 = field566;
                            if (field333 == 0) {
                                field366 = null;
                                field515 = null;
                                Statics.field679 = 0;
                                Statics.field170 = null;
                                field334 = -1;
                                var1 = true;
                            } else {
                                field515 = field332.method2356();
                                long var114 = field332.method2451();
                                field366 = class162.method3458(var114);
                                Statics.field2241 = field332.method2346();
                                int var116 = field332.method2380();
                                if (var116 == 255) {
                                    field334 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field679 = var116;
                                    class25[] var117 = new class25[100];
                                    for (int var118 = 0; var118 < Statics.field679; var118++) {
                                        var117[var118] = new class25();
                                        var117[var118].field622 = field332.method2356();
                                        var117[var118].field628 = class164.method48(var117[var118].field622, Statics.field289);
                                        var117[var118].field623 = field332.method2347();
                                        var117[var118].field631 = field332.method2346();
                                        field332.method2356();
                                        if (var117[var118].field622.equals(Statics.field1544.field35)) {
                                            Statics.field238 = var117[var118].field631;
                                        }
                                    }
                                    boolean var119 = false;
                                    int var120 = Statics.field679;
                                    while (var120 > 0) {
                                        boolean var121 = true;
                                        var120--;
                                        for (int var122 = 0; var122 < var120; var122++) {
                                            if (var117[var122].field628.compareTo(var117[var122 + 1].field628) > 0) {
                                                class25 var123 = var117[var122];
                                                var117[var122] = var117[var122 + 1];
                                                var117[var122 + 1] = var123;
                                                var121 = false;
                                            }
                                        }
                                        if (var121) {
                                            break;
                                        }
                                    }
                                    Statics.field170 = var117;
                                    field334 = -1;
                                    var1 = true;
                                }
                            }
                            break label2493;
                        }
                        if (field334 == 186) {
                            int var124 = field332.method2446();
                            boolean var125 = field332.method2380() == 1;
                            String var126 = "";
                            boolean var127 = false;
                            if (var125) {
                                var126 = field332.method2356();
                                if (method113(var126)) {
                                    var127 = true;
                                }
                            }
                            String var128 = field332.method2356();
                            if (!var127) {
                                class12.method112(var124, var126, var128);
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 66) {
                            int var129 = field332.method2347();
                            field446 = var129;
                            int var130 = field446;
                            int var131 = Statics.field63;
                            int var132 = Statics.field686;
                            if (class173.method2289(var130)) {
                                method9(Statics.field2801[var130], -1, var131, var132, false);
                            }
                            method2754(var129);
                            class37.method663(field446);
                            for (int var133 = 0; var133 < 100; var133++) {
                                field559[var133] = true;
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 35) {
                            field344 = true;
                            Statics.field2054 = field332.method2380();
                            Statics.field2060 = field332.method2380();
                            Statics.field1654 = field332.method2347();
                            Statics.field1927 = field332.method2380();
                            Statics.field1556 = field332.method2380();
                            if (Statics.field1556 >= 100) {
                                int var134 = Statics.field2054 * 128 + 64;
                                int var135 = Statics.field2060 * 128 + 64;
                                int var136 = method2950(var134, var135, Statics.field1181) - Statics.field1654;
                                int var137 = var134 - Statics.field160;
                                int var138 = var136 - Statics.field2041;
                                int var139 = var135 - Statics.field1620;
                                int var140 = (int) Math.sqrt((double) (var137 * var137 + var139 * var139));
                                Statics.field1446 = (int) (Math.atan2((double) var138, (double) var140) * 325.949D) & 0x7FF;
                                Statics.field1866 = (int) (Math.atan2((double) var137, (double) var139) * -325.949D) & 0x7FF;
                                if (Statics.field1446 < 128) {
                                    Statics.field1446 = 128;
                                }
                                if (Statics.field1446 > 383) {
                                    Statics.field1446 = 383;
                                }
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 67) {
                            method583(true);
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 127) {
                            int var141 = field332.method2350();
                            int var142 = field332.method2350();
                            if (Statics.field1953 == null || !Statics.field1953.isValid()) {
                                try {
                                    Iterator var143 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                    while (var143.hasNext()) {
                                        GarbageCollectorMXBean var144 = (GarbageCollectorMXBean) var143.next();
                                        if (var144.isValid()) {
                                            Statics.field1953 = var144;
                                            field565 = -1L;
                                            field471 = -1L;
                                        }
                                    }
                                } catch (Throwable var348) {
                                }
                            }
                            long var146 = class115.method2134();
                            int var148 = -1;
                            if (Statics.field1953 != null) {
                                long var149 = Statics.field1953.getCollectionTime();
                                if (field471 != -1L) {
                                    long var151 = var149 - field471;
                                    long var153 = var146 - field565;
                                    if (var153 != 0L) {
                                        var148 = (int) (var151 * 100L / var153);
                                    }
                                }
                                field471 = var149;
                                field565 = var146;
                            }
                            field330.method2578(169);
                            field330.method2505(var141);
                            field330.method2341(var142);
                            field330.method2370(field2174);
                            field330.method2417(var148);
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 122) {
                            int var155 = field332.method2388();
                            int var156 = field332.method2382();
                            class173 var157 = class173.method2966(var155);
                            if (var157.field2808 != var156 || var156 == -1) {
                                var157.field2808 = var156;
                                var157.field2861 = 0;
                                var157.field2827 = 0;
                                method2951(var157);
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 179) {
                            int var158 = field332.method2430();
                            class16 var159 = (class16) class16.field213.method3496((long) var158);
                            if (var159 != null) {
                                var159.method3626();
                            }
                            field513[++field474 - 1 & 0x1F] = var158 & 0x7FFF;
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 208) {
                            class26 var160 = new class26();
                            var160.field643 = field332.method2356();
                            var160.field640 = field332.method2347();
                            int var161 = field332.method2350();
                            var160.field650 = var161;
                            method1766(45);
                            Statics.field2278.method2797();
                            Statics.field2278 = null;
                            class32.method730(var160);
                            field334 = -1;
                            var1 = false;
                            break label2493;
                        }
                        if (field334 == 56) {
                            field521 = field332.method2380();
                            if (field521 == 255) {
                                field521 = 0;
                            }
                            field522 = field332.method2380();
                            if (field522 == 255) {
                                field522 = 0;
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 134) {
                            class33.field750 = 0;
                            for (int var162 = 0; var162 < 2048; var162++) {
                                class33.field752[var162] = null;
                                class33.field761[var162] = 1;
                            }
                            for (int var163 = 0; var163 < 2048; var163++) {
                                field409[var163] = null;
                            }
                            class33.method1768(field332);
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 157) {
                            Statics.field1674 = field332.method2380();
                            Statics.field2036 = field332.method2355();
                            for (int var164 = Statics.field1674; var164 < Statics.field1674 + 8; var164++) {
                                for (int var165 = Statics.field2036; var165 < Statics.field2036 + 8; var165++) {
                                    if (field419[Statics.field1181][var164][var165] != null) {
                                        field419[Statics.field1181][var164][var165] = null;
                                        method1080(var164, var165);
                                    }
                                }
                            }
                            for (class17 var166 = (class17) field420.method3534(); var166 != null; var166 = (class17) field420.method3536()) {
                                if (var166.field222 >= Statics.field1674 && var166.field222 < Statics.field1674 + 8 && var166.field226 >= Statics.field2036 && var166.field226 < Statics.field2036 + 8 && Statics.field1181 == var166.field240) {
                                    var166.field231 = 0;
                                }
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 49) {
                            int var167 = field332.method2388();
                            int var168 = field332.method2347();
                            if (var168 == 65535) {
                                var168 = -1;
                            }
                            int var169 = field332.method2352();
                            class173 var170 = class173.method2966(var169);
                            if (var170.field2831) {
                                var170.field2859 = var168;
                                var170.field2860 = var167;
                                class52 var172 = class52.method970(var168);
                                var170.field2790 = var172.field1125;
                                var170.field2791 = var172.field1131;
                                var170.field2851 = var172.field1139;
                                var170.field2788 = var172.field1128;
                                var170.field2759 = var172.field1129;
                                var170.field2793 = var172.field1124;
                                if (var172.field1130 == 1) {
                                    var170.field2797 = 1;
                                } else {
                                    var170.field2797 = 2;
                                }
                                if (var170.field2755 > 0) {
                                    var170.field2793 = var170.field2793 * 32 / var170.field2755;
                                } else if (var170.field2752 > 0) {
                                    var170.field2793 = var170.field2793 * 32 / var170.field2752;
                                }
                                method2951(var170);
                            } else {
                                if (var168 == -1) {
                                    var170.field2747 = 0;
                                    field334 = -1;
                                    var1 = true;
                                    break label2493;
                                }
                                class52 var171 = class52.method970(var168);
                                var170.field2747 = 4;
                                var170.field2789 = var168;
                                var170.field2790 = var171.field1125;
                                var170.field2791 = var171.field1131;
                                var170.field2793 = var171.field1124 * 100 / var167;
                                method2951(var170);
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 165) {
                            int var173 = field333 + field332.field1980;
                            int var174 = field332.method2347();
                            int var175 = field332.method2347();
                            if (field446 != var174) {
                                field446 = var174;
                                int var176 = field446;
                                int var177 = Statics.field63;
                                int var178 = Statics.field686;
                                if (class173.method2289(var176)) {
                                    method9(Statics.field2801[var176], -1, var177, var178, false);
                                }
                                method2754(field446);
                                class37.method663(field446);
                                for (int var179 = 0; var179 < 100; var179++) {
                                    field559[var179] = true;
                                }
                            }
                            while (var175-- > 0) {
                                int var180 = field332.method2350();
                                int var181 = field332.method2347();
                                int var182 = field332.method2380();
                                class4 var183 = (class4) field447.method3496((long) var180);
                                if (var183 != null && var183.field58 != var181) {
                                    method101(var183, true);
                                    var183 = null;
                                }
                                if (var183 == null) {
                                    var183 = method895(var180, var181, var182);
                                }
                                var183.field59 = true;
                            }
                            for (class4 var184 = (class4) field447.method3506(); var184 != null; var184 = (class4) field447.method3500()) {
                                if (var184.field59) {
                                    var184.field59 = false;
                                } else {
                                    method101(var184, true);
                                }
                            }
                            field375 = new class196(512);
                            while (field332.field1980 < var173) {
                                int var185 = field332.method2350();
                                int var186 = field332.method2347();
                                int var187 = field332.method2347();
                                int var188 = field332.method2350();
                                for (int var189 = var186; var189 <= var187; var189++) {
                                    long var190 = ((long) var185 << 32) + (long) var189;
                                    field375.method3497(new class201(var188), var190);
                                }
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 149) {
                            class33.method197(field332, field333);
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 83) {
                            int var192 = field332.method2387();
                            class173 var193 = class173.method2966(var192);
                            var193.field2747 = 3;
                            var193.field2789 = Statics.field1544.field30.method3244();
                            method2951(var193);
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 187) {
                            method94(true);
                            field332.method2593();
                            int var194 = field332.method2347();
                            class33.method197(field332, var194);
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 76) {
                            String var195 = field332.method2356();
                            long var196 = field332.method2451();
                            long var198 = (long) field332.method2347();
                            long var200 = (long) field332.method2349();
                            class152 var202 = (class152) class109.method2293(class152.method47(), field332.method2380());
                            long var203 = (var198 << 32) + var200;
                            boolean var205 = false;
                            for (int var206 = 0; var206 < 100; var206++) {
                                if (field321[var206] == var203) {
                                    var205 = true;
                                    break;
                                }
                            }
                            if (var202.field2260 && method113(var195)) {
                                var205 = true;
                            }
                            if (!var205 && field408 == 0) {
                                field321[field509] = var203;
                                field509 = (field509 + 1) % 100;
                                String var207 = class223.method3732(class163.method50(class222.method2906(field332)));
                                if (var202.field2258 == -1) {
                                    class12.method2682(9, var195, var207, Statics.method842(var196));
                                } else {
                                    int var208 = var202.field2258;
                                    String var209 = "<img=" + var208 + ">";
                                    class12.method2682(9, var209 + var195, var207, Statics.method842(var196));
                                }
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 151) {
                            field332.field1980 += 28;
                            if (field332.method2367()) {
                                class149.method1524(field332, field332.field1980 - 28);
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 43) {
                            if (field446 != -1) {
                                int var210 = field446;
                                if (class173.method2289(var210)) {
                                    method2932(Statics.field2801[var210], 0);
                                }
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 231) {
                            String var211 = field332.method2356();
                            int var212 = field332.method2380();
                            int var213 = field332.method2371();
                            if (var213 >= 1 && var213 <= 8) {
                                if (var211.equalsIgnoreCase("null")) {
                                    var211 = null;
                                }
                                field415[var213 - 1] = var211;
                                field448[var213 - 1] = var212 == 0;
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 131) {
                            for (int var214 = 0; var214 < class176.field2886.length; var214++) {
                                if (class176.field2886[var214] != class176.field2885[var214]) {
                                    class176.field2886[var214] = class176.field2885[var214];
                                    method1218(var214);
                                    field472[++field381 - 1 & 0x1F] = var214;
                                }
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 18) {
                            String var215 = field332.method2356();
                            Object[] var216 = new Object[var215.length() + 1];
                            for (int var217 = var215.length() - 1; var217 >= 0; var217--) {
                                if (var215.charAt(var217) == 's') {
                                    var216[var217 + 1] = field332.method2356();
                                } else {
                                    var216[var217 + 1] = Integer.valueOf(field332.method2350());
                                }
                            }
                            var216[0] = Integer.valueOf(field332.method2350());
                            class1 var218 = new class1();
                            var218.field12 = var216;
                            class37.method571(var218, 200000);
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 185) {
                            Statics.field651 = class130.method2268(field332.method2380());
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 80) {
                            int var219 = field332.method2350();
                            int var220 = field332.method2347();
                            int var221 = field332.method2430();
                            class173 var222 = class173.method2966(var219);
                            var222.field2795 = (var220 << 16) + var221;
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 68) {
                            String var223 = field332.method2356();
                            long var224 = (long) field332.method2347();
                            long var226 = (long) field332.method2349();
                            class152[] var228 = new class152[] { class152.field2262, class152.field2255, class152.field2254, class152.field2253, class152.field2256 };
                            class152 var229 = (class152) class109.method2293(var228, field332.method2380());
                            long var230 = (var224 << 32) + var226;
                            boolean var232 = false;
                            for (int var233 = 0; var233 < 100; var233++) {
                                if (field321[var233] == var230) {
                                    var232 = true;
                                    break;
                                }
                            }
                            if (method113(var223)) {
                                var232 = true;
                            }
                            if (!var232 && field408 == 0) {
                                field321[field509] = var230;
                                field509 = (field509 + 1) % 100;
                                String var234 = class223.method3732(class163.method50(class222.method2906(field332)));
                                byte var235;
                                if (var229.field2259) {
                                    var235 = 7;
                                } else {
                                    var235 = 3;
                                }
                                if (var229.field2258 == -1) {
                                    class12.method112(var235, var223, var234);
                                } else {
                                    int var237 = var229.field2258;
                                    String var238 = "<img=" + var237 + ">";
                                    class12.method112(var235, var238 + var223, var234);
                                }
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 65) {
                            int var239 = field332.method2350();
                            class4 var240 = (class4) field447.method3496((long) var239);
                            if (var240 != null) {
                                method101(var240, true);
                            }
                            if (field450 != null) {
                                method2951(field450);
                                field450 = null;
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 24) {
                            class211.method2937(field332, field333);
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 28) {
                            field511 = field332.method2380();
                            if (field511 == 1) {
                                field504 = field332.method2347();
                            }
                            if (field511 >= 2 && field511 <= 6) {
                                if (field511 == 2) {
                                    field304 = 64;
                                    field311 = 64;
                                }
                                if (field511 == 3) {
                                    field304 = 0;
                                    field311 = 64;
                                }
                                if (field511 == 4) {
                                    field304 = 128;
                                    field311 = 64;
                                }
                                if (field511 == 5) {
                                    field304 = 64;
                                    field311 = 0;
                                }
                                if (field511 == 6) {
                                    field304 = 64;
                                    field311 = 128;
                                }
                                field511 = 2;
                                field307 = field332.method2347();
                                field388 = field332.method2347();
                                field309 = field332.method2380();
                            }
                            if (field511 == 10) {
                                field322 = field332.method2347();
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 141 || field334 == 175 || field334 == 156 || field334 == 15 || field334 == 45 || field334 == 92 || field334 == 88 || field334 == 3 || field334 == 124 || field334 == 55) {
                            method2972();
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 81) {
                            int var241 = field332.method2382();
                            int var242 = field332.method2352();
                            int var243 = field332.method2382();
                            class173 var244 = class173.method2966(var242);
                            if (var244.field2735 != var241 || var244.field2858 != var243 || var244.field2746 != 0 || var244.field2865 != 0) {
                                var244.field2735 = var241;
                                var244.field2858 = var243;
                                var244.field2746 = 0;
                                var244.field2865 = 0;
                                method2951(var244);
                                method216(var244);
                                if (var244.field2743 == 0) {
                                    method2278(Statics.field2801[var242 >> 16], var244, false);
                                }
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        if (field334 == 0) {
                            while (field332.field1980 < field333) {
                                boolean var245 = field332.method2380() == 1;
                                String var246 = field332.method2356();
                                String var247 = field332.method2356();
                                int var248 = field332.method2347();
                                int var249 = field332.method2380();
                                int var250 = field332.method2380();
                                boolean var251 = (var250 & 0x2) != 0;
                                boolean var252 = (var250 & 0x1) != 0;
                                if (var248 > 0) {
                                    field332.method2356();
                                    field332.method2380();
                                    field332.method2350();
                                }
                                field332.method2356();
                                for (int var253 = 0; var253 < field554; var253++) {
                                    class18 var254 = field486[var253];
                                    if (var245) {
                                        if (var247.equals(var254.field243)) {
                                            var254.field243 = var246;
                                            var254.field242 = var247;
                                            var246 = null;
                                            break;
                                        }
                                    } else if (var246.equals(var254.field243)) {
                                        if (var254.field241 != var248) {
                                            boolean var255 = true;
                                            for (class39 var256 = (class39) field473.method3489(); var256 != null; var256 = (class39) field473.method3490()) {
                                                if (var256.field874.equals(var246)) {
                                                    if (var248 != 0 && var256.field871 == 0) {
                                                        var256.method3620();
                                                        var255 = false;
                                                    } else if (var248 == 0 && var256.field871 != 0) {
                                                        var256.method3620();
                                                        var255 = false;
                                                    }
                                                }
                                            }
                                            if (var255) {
                                                field473.method3488(new class39(var246, var248));
                                            }
                                            var254.field241 = var248;
                                        }
                                        var254.field242 = var247;
                                        var254.field244 = var249;
                                        var254.field245 = var251;
                                        var254.field246 = var252;
                                        var246 = null;
                                        break;
                                    }
                                }
                                if (var246 != null && field554 < 400) {
                                    class18 var257 = new class18();
                                    field486[field554] = var257;
                                    var257.field243 = var246;
                                    var257.field242 = var247;
                                    var257.field241 = var248;
                                    var257.field244 = var249;
                                    var257.field245 = var251;
                                    var257.field246 = var252;
                                    field554++;
                                }
                            }
                            field456 = 2;
                            field433 = field566;
                            boolean var258 = false;
                            int var259 = field554;
                            while (var259 > 0) {
                                boolean var260 = true;
                                var259--;
                                for (int var261 = 0; var261 < var259; var261++) {
                                    boolean var262 = false;
                                    class18 var263 = field486[var261];
                                    class18 var264 = field486[var261 + 1];
                                    if (field460 != var263.field241 && field460 == var264.field241) {
                                        var262 = true;
                                    }
                                    if (!var262 && var263.field241 == 0 && var264.field241 != 0) {
                                        var262 = true;
                                    }
                                    if (!var262 && !var263.field245 && var264.field245) {
                                        var262 = true;
                                    }
                                    if (!var262 && !var263.field246 && var264.field246) {
                                        var262 = true;
                                    }
                                    if (var262) {
                                        class18 var265 = field486[var261];
                                        field486[var261] = field486[var261 + 1];
                                        field486[var261 + 1] = var265;
                                        var260 = false;
                                    }
                                }
                                if (var260) {
                                    break;
                                }
                            }
                            field334 = -1;
                            var1 = true;
                            break label2493;
                        }
                        class148.method145("" + field334 + class2.field21 + field338 + class2.field21 + field339 + class2.field21 + field333, (Throwable) null);
                        method166();
                    } catch (IOException var349) {
                        if (field340 > 0) {
                            method166();
                        } else {
                            method1766(40);
                            Statics.field301 = Statics.field2278;
                            Statics.field2278 = null;
                        }
                    } catch (Exception var350) {
                        String var268 = "" + field334 + class2.field21 + field338 + class2.field21 + field339 + class2.field21 + field333 + class2.field21 + (Statics.field1201 + Statics.field1544.field857[0]) + class2.field21 + (Statics.field1150 + Statics.field1544.field865[0]) + class2.field21;
                        for (int var269 = 0; var269 < field333 && var269 < 50; var269++) {
                            var268 = var268 + field332.field1982[var269] + class2.field21;
                        }
                        class148.method145(var268, var350);
                        method166();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field507 != 30) {
            return;
        }
        while (class211.method2817()) {
            field330.method2578(28);
            field330.method2436(0);
            int var270 = field330.field1980;
            class211.method3215(field330);
            field330.method2366(field330.field1980 - var270);
        }
        Object var271 = Statics.field258.field191;
        synchronized (Statics.field258.field191) {
            if (!field285) {
                Statics.field258.field196 = 0;
            } else if (class140.field2141 != 0 || Statics.field258.field196 >= 40) {
                field330.method2578(32);
                field330.method2436(0);
                int var272 = field330.field1980;
                int var273 = 0;
                for (int var274 = 0; var274 < Statics.field258.field196 && field330.field1980 - var272 < 240; var274++) {
                    var273++;
                    int var275 = Statics.field258.field194[var274];
                    if (var275 < 0) {
                        var275 = 0;
                    } else if (var275 > 502) {
                        var275 = 502;
                    }
                    int var276 = Statics.field258.field193[var274];
                    if (var276 < 0) {
                        var276 = 0;
                    } else if (var276 > 764) {
                        var276 = 764;
                    }
                    int var277 = var275 * 765 + var276;
                    if (Statics.field258.field194[var274] == -1 && Statics.field258.field193[var274] == -1) {
                        var276 = -1;
                        var275 = -1;
                        var277 = 524287;
                    }
                    if (field298 != var276 || field299 != var275) {
                        int var278 = var276 - field298;
                        field298 = var276;
                        int var279 = var275 - field299;
                        field299 = var275;
                        if (field300 < 8 && var278 >= -32 && var278 <= 31 && var279 >= -32 && var279 <= 31) {
                            var278 += 32;
                            var279 += 32;
                            field330.method2331((field300 << 12) + (var278 << 6) + var279);
                            field300 = 0;
                        } else if (field300 < 8) {
                            field330.method2467((field300 << 19) + 8388608 + var277);
                            field300 = 0;
                        } else {
                            field330.method2333((field300 << 19) + -1073741824 + var277);
                            field300 = 0;
                        }
                    } else if (field300 < 2047) {
                        field300++;
                    }
                }
                field330.method2366(field330.field1980 - var272);
                if (var273 >= Statics.field258.field196) {
                    Statics.field258.field196 = 0;
                } else {
                    Statics.field258.field196 -= var273;
                    for (int var280 = 0; var280 < Statics.field258.field196; var280++) {
                        Statics.field258.field193[var280] = Statics.field258.field193[var273 + var280];
                        Statics.field258.field194[var280] = Statics.field258.field194[var273 + var280];
                    }
                }
            }
        }
        if (class140.field2141 == 1 || !Statics.field312 && class140.field2141 == 4 || class140.field2141 == 2) {
            long var282 = (class140.field2144 - field364 * -1L) / 50L;
            if (var282 > 4095L) {
                var282 = 4095L;
            }
            field364 = class140.field2144 * -1L;
            int var284 = class140.field2131;
            if (var284 < 0) {
                var284 = 0;
            } else if (var284 > Statics.field686) {
                var284 = Statics.field686;
            }
            int var285 = class140.field2133;
            if (var285 < 0) {
                var285 = 0;
            } else if (var285 > Statics.field63) {
                var285 = Statics.field63;
            }
            int var286 = (int) var282;
            field330.method2578(221);
            field330.method2331((var286 << 1) + (class140.field2141 == 2 ? 1 : 0));
            field330.method2331(var285);
            field330.method2331(var284);
        }
        if (class137.field2112 > 0) {
            field330.method2578(64);
            field330.method2331(0);
            int var287 = field330.field1980;
            long var288 = class115.method2134();
            for (int var290 = 0; var290 < class137.field2112; var290++) {
                long var291 = var288 - field376;
                if (var291 > 16777215L) {
                    var291 = 16777215L;
                }
                field376 = var288;
                field330.method2436(class137.field2113[var290]);
                field330.method2467((int) var291);
            }
            field330.method2474(field330.field1980 - var287);
        }
        if (field379 > 0) {
            field379--;
        }
        if (class137.field2107[96] || class137.field2107[97] || class137.field2107[98] || class137.field2107[99]) {
            field380 = true;
        }
        if (field380 && field379 <= 0) {
            field379 = 20;
            field380 = false;
            field330.method2578(29);
            field330.method2331(field373);
            field330.method2365(field372);
        }
        if (Statics.field1670 && !field296) {
            field296 = true;
            field330.method2578(253);
            field330.method2436(1);
        }
        if (!Statics.field1670 && field296) {
            field296 = false;
            field330.method2578(253);
            field330.method2436(0);
        }
        method1942();
        if (field507 != 30) {
            return;
        }
        for (class17 var293 = (class17) field420.method3534(); var293 != null; var293 = (class17) field420.method3536()) {
            if (var293.field231 > 0) {
                var293.field231--;
            }
            if (var293.field231 != 0) {
                if (var293.field220 > 0) {
                    var293.field220--;
                }
                if (var293.field220 == 0 && var293.field222 >= 1 && var293.field226 >= 1 && var293.field222 <= 102 && var293.field226 <= 102 && (var293.field227 < 0 || class6.method740(var293.field227, var293.field229))) {
                    method3160(var293.field240, var293.field221, var293.field222, var293.field226, var293.field227, var293.field234, var293.field229);
                    var293.field220 = -1;
                    if (var293.field227 == var293.field224 && var293.field224 == -1) {
                        var293.method3626();
                    } else if (var293.field227 == var293.field224 && var293.field234 == var293.field225 && var293.field229 == var293.field228) {
                        var293.method3626();
                    }
                }
            } else if (var293.field224 < 0 || class6.method740(var293.field224, var293.field228)) {
                method3160(var293.field240, var293.field221, var293.field222, var293.field226, var293.field224, var293.field225, var293.field228);
                var293.method3626();
            }
        }
        method2949();
        field335++;
        if (field335 <= 750) {
            method2910();
            method778();
            method85();
            field355++;
            if (field399 != 0) {
                field398 += 20;
                if (field398 >= 400) {
                    field399 = 0;
                }
            }
            if (Statics.field266 != null) {
                field400++;
                if (field400 >= 15) {
                    method2951(Statics.field266);
                    Statics.field266 = null;
                }
            }
            class173 var294 = Statics.field129;
            class173 var295 = Statics.field1753;
            Statics.field129 = null;
            Statics.field1753 = null;
            field463 = null;
            field467 = false;
            field464 = false;
            field510 = 0;
            while (class137.method741() && field510 < 128) {
                if (field384 >= 2 && class137.field2107[82] && Statics.field584 == 66) {
                    String var296 = class12.method821();
                    Statics.field77.setContents(new StringSelection(var296), (ClipboardOwner) null);
                } else {
                    field512[field510] = Statics.field584;
                    field455[field510] = Statics.field770;
                    field510++;
                }
            }
            if (field446 != -1) {
                method5(field446, 0, 0, Statics.field63, Statics.field686, 0, 0);
            }
            field566++;
            while (true) {
                class1 var297;
                class173 var298;
                class173 var299;
                do {
                    var297 = (class1) field488.method3532();
                    if (var297 == null) {
                        while (true) {
                            class1 var300;
                            class173 var301;
                            class173 var302;
                            do {
                                var300 = (class1) field487.method3532();
                                if (var300 == null) {
                                    while (true) {
                                        class1 var303;
                                        class173 var304;
                                        class173 var305;
                                        do {
                                            var303 = (class1) field485.method3532();
                                            if (var303 == null) {
                                                method2269();
                                                if (Statics.field1224 == null && field459 == null) {
                                                    int var306 = class140.field2141;
                                                    if (field310) {
                                                        if (var306 != 1 && (Statics.field312 || var306 != 4)) {
                                                            int var307 = class140.field2146;
                                                            int var308 = class140.field2136;
                                                            if (var307 < Statics.field2588 - 10 || var307 > Statics.field2588 + Statics.field2298 + 10 || var308 < Statics.field1869 - 10 || var308 > Statics.field601 + Statics.field1869 + 10) {
                                                                field310 = false;
                                                                method760(Statics.field2588, Statics.field1869, Statics.field2298, Statics.field601);
                                                            }
                                                        }
                                                        if (var306 == 1 || !Statics.field312 && var306 == 4) {
                                                            int var309 = Statics.field2588;
                                                            int var310 = Statics.field1869;
                                                            int var311 = Statics.field2298;
                                                            int var312 = class140.field2133;
                                                            int var313 = class140.field2131;
                                                            int var314 = -1;
                                                            for (int var315 = 0; var315 < field428; var315++) {
                                                                int var316 = (field428 - 1 - var315) * 15 + var310 + 31;
                                                                if (var312 > var309 && var312 < var309 + var311 && var313 > var316 - 13 && var313 < var316 + 3) {
                                                                    var314 = var315;
                                                                }
                                                            }
                                                            if (var314 != -1) {
                                                                method592(var314);
                                                            }
                                                            field310 = false;
                                                            method760(Statics.field2588, Statics.field1869, Statics.field2298, Statics.field601);
                                                        }
                                                    } else {
                                                        label2592: {
                                                            int var318;
                                                            int var319;
                                                            label2686: {
                                                                if ((var306 == 1 || !Statics.field312 && var306 == 4) && field428 > 0) {
                                                                    int var317 = field431[field428 - 1];
                                                                    if (var317 == 39 || var317 == 40 || var317 == 41 || var317 == 42 || var317 == 43 || var317 == 33 || var317 == 34 || var317 == 35 || var317 == 36 || var317 == 37 || var317 == 38 || var317 == 1005) {
                                                                        var318 = field429[field428 - 1];
                                                                        var319 = field430[field428 - 1];
                                                                        class173 var320 = class173.method2966(var319);
                                                                        int var321 = method217(var320);
                                                                        boolean var322 = (var321 >> 28 & 0x1) != 0;
                                                                        if (var322) {
                                                                            break label2686;
                                                                        }
                                                                        int var323 = method217(var320);
                                                                        boolean var324 = (var323 >> 29 & 0x1) != 0;
                                                                        if (var324) {
                                                                            break label2686;
                                                                        }
                                                                    }
                                                                }
                                                                if ((var306 == 1 || !Statics.field312 && var306 == 4) && (field426 == 1 && field428 > 2 || method649(field428 - 1))) {
                                                                    var306 = 2;
                                                                }
                                                                if ((var306 == 1 || !Statics.field312 && var306 == 4) && field428 > 0) {
                                                                    method592(field428 - 1);
                                                                }
                                                                if (var306 == 2 && field428 > 0) {
                                                                    method3650(class140.field2133, class140.field2131);
                                                                }
                                                                break label2592;
                                                            }
                                                            if (Statics.field1224 != null && !field555 && field426 != 1 && !method649(field428 - 1) && field428 > 0) {
                                                                int var325 = field403;
                                                                int var326 = field404;
                                                                method1765(Statics.field2638, var325, var326);
                                                                Statics.field2638 = null;
                                                            }
                                                            field555 = false;
                                                            field407 = 0;
                                                            if (Statics.field1224 != null) {
                                                                method2951(Statics.field1224);
                                                            }
                                                            Statics.field1224 = class173.method2966(var319);
                                                            field402 = var318;
                                                            field403 = class140.field2133;
                                                            field404 = class140.field2131;
                                                            if (field428 > 0) {
                                                                Statics.method2793(field428 - 1);
                                                            }
                                                            method2951(Statics.field1224);
                                                        }
                                                    }
                                                }
                                                if (field459 != null) {
                                                    method100();
                                                }
                                                if (Statics.field1224 != null) {
                                                    method2951(Statics.field1224);
                                                    field407++;
                                                    if (class140.field2134 == 0) {
                                                        if (field555) {
                                                            if (Statics.field763 == Statics.field1224 && field405 != field402) {
                                                                class173 var327 = Statics.field1224;
                                                                byte var328 = 0;
                                                                if (field449 == 1 && var327.field2745 == 206) {
                                                                    var328 = 1;
                                                                }
                                                                if (var327.field2857[field405] <= 0) {
                                                                    var328 = 0;
                                                                }
                                                                int var329 = method217(var327);
                                                                boolean var330 = (var329 >> 29 & 0x1) != 0;
                                                                if (var330) {
                                                                    int var331 = field402;
                                                                    int var332 = field405;
                                                                    var327.field2857[var332] = var327.field2857[var331];
                                                                    var327.field2794[var332] = var327.field2794[var331];
                                                                    var327.field2857[var331] = -1;
                                                                    var327.field2794[var331] = 0;
                                                                } else if (var328 == 1) {
                                                                    int var333 = field402;
                                                                    int var334 = field405;
                                                                    while (var333 != var334) {
                                                                        if (var333 > var334) {
                                                                            var327.method3164(var333 - 1, var333);
                                                                            var333--;
                                                                        } else if (var333 < var334) {
                                                                            var327.method3164(var333 + 1, var333);
                                                                            var333++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var327.method3164(field405, field402);
                                                                }
                                                                field330.method2578(243);
                                                                field330.method2417(var328);
                                                                field330.method2331(field405);
                                                                field330.method2365(field402);
                                                                field330.method2333(Statics.field1224.field2741);
                                                            }
                                                        } else if ((field426 == 1 || method649(field428 - 1)) && field428 > 2) {
                                                            method3650(field403, field404);
                                                        } else if (field428 > 0) {
                                                            int var335 = field403;
                                                            int var336 = field404;
                                                            method1765(Statics.field2638, var335, var336);
                                                            Statics.field2638 = null;
                                                        }
                                                        field400 = 10;
                                                        class140.field2141 = 0;
                                                        Statics.field1224 = null;
                                                    } else if (field407 >= 5 && (class140.field2146 > field403 + 5 || class140.field2146 < field403 - 5 || class140.field2136 > field404 + 5 || class140.field2136 < field404 - 5)) {
                                                        field555 = true;
                                                    }
                                                }
                                                if (class86.field1488 != -1) {
                                                    int var337 = class86.field1488;
                                                    int var338 = class86.field1489;
                                                    field330.method2578(255);
                                                    field330.method2436(5);
                                                    field330.method2417(class137.field2107[82] ? (class137.field2107[81] ? 2 : 1) : 0);
                                                    field330.method2339(Statics.field1150 + var338);
                                                    field330.method2378(Statics.field1201 + var337);
                                                    class86.field1488 = -1;
                                                    field549 = class140.field2133;
                                                    field427 = class140.field2131;
                                                    field399 = 1;
                                                    field398 = 0;
                                                    field521 = var337;
                                                    field522 = var338;
                                                }
                                                if (Statics.field129 != var294) {
                                                    if (var294 != null) {
                                                        method2951(var294);
                                                    }
                                                    if (Statics.field129 != null) {
                                                        method2951(Statics.field129);
                                                    }
                                                }
                                                if (Statics.field1753 != var295 && field523 == field286) {
                                                    if (var295 != null) {
                                                        method2951(var295);
                                                    }
                                                    if (Statics.field1753 != null) {
                                                        method2951(Statics.field1753);
                                                    }
                                                }
                                                if (Statics.field1753 == null) {
                                                    if (field286 > 0) {
                                                        field286--;
                                                    }
                                                } else if (field286 < field523) {
                                                    field286++;
                                                    if (field523 == field286) {
                                                        method2951(Statics.field1753);
                                                    }
                                                }
                                                method2746();
                                                if (field344) {
                                                    method109();
                                                }
                                                for (int var339 = 0; var339 < 5; var339++) {
                                                    int var10002 = field540[var339]++;
                                                }
                                                Statics.field275.method190();
                                                int var340 = class140.method118();
                                                int var341 = class137.method159();
                                                if (var340 > 15000 && var341 > 15000) {
                                                    field340 = 250;
                                                    class140.method658(14500);
                                                    field330.method2578(230);
                                                }
                                                field439++;
                                                if (field439 > 500) {
                                                    field439 = 0;
                                                    int var342 = (int) (Math.random() * 8.0D);
                                                    if ((var342 & 0x1) == 1) {
                                                        field352 += field353;
                                                    }
                                                    if ((var342 & 0x2) == 2) {
                                                        field354 += field465;
                                                    }
                                                    if ((var342 & 0x4) == 4) {
                                                        field438 += field357;
                                                    }
                                                }
                                                if (field352 < -50) {
                                                    field353 = 2;
                                                }
                                                if (field352 > 50) {
                                                    field353 = -2;
                                                }
                                                if (field354 < -55) {
                                                    field465 = 2;
                                                }
                                                if (field354 > 55) {
                                                    field465 = -2;
                                                }
                                                if (field438 < -40) {
                                                    field357 = 1;
                                                }
                                                if (field438 > 40) {
                                                    field357 = -1;
                                                }
                                                field363++;
                                                if (field363 > 500) {
                                                    field363 = 0;
                                                    int var343 = (int) (Math.random() * 8.0D);
                                                    if ((var343 & 0x1) == 1) {
                                                        field470 += field360;
                                                    }
                                                    if ((var343 & 0x2) == 2) {
                                                        field367 += field362;
                                                    }
                                                }
                                                if (field470 < -60) {
                                                    field360 = 2;
                                                }
                                                if (field470 > 60) {
                                                    field360 = -2;
                                                }
                                                if (field367 < -20) {
                                                    field362 = 1;
                                                }
                                                if (field367 > 10) {
                                                    field362 = -1;
                                                }
                                                for (class39 var344 = (class39) field473.method3489(); var344 != null; var344 = (class39) field473.method3490()) {
                                                    if ((long) var344.field870 < class115.method2134() / 1000L - 5L) {
                                                        if (var344.field871 > 0) {
                                                            class12.method112(5, "", var344.field874 + class157.field2447);
                                                        }
                                                        if (var344.field871 == 0) {
                                                            class12.method112(5, "", var344.field874 + class157.field2448);
                                                        }
                                                        var344.method3620();
                                                    }
                                                }
                                                field292++;
                                                if (field292 > 50) {
                                                    field330.method2578(69);
                                                }
                                                try {
                                                    if (Statics.field2278 != null && field330.field1980 > 0) {
                                                        Statics.field2278.method2802(field330.field1982, 0, field330.field1980);
                                                        field330.field1980 = 0;
                                                        field292 = 0;
                                                    }
                                                } catch (IOException var346) {
                                                    if (field340 > 0) {
                                                        method166();
                                                    } else {
                                                        method1766(40);
                                                        Statics.field301 = Statics.field2278;
                                                        Statics.field2278 = null;
                                                    }
                                                }
                                                return;
                                            }
                                            var304 = var303.field3;
                                            if (var304.field2742 < 0) {
                                                break;
                                            }
                                            var305 = class173.method2966(var304.field2829);
                                        } while (var305 == null || var305.field2863 == null || var304.field2742 >= var305.field2863.length || var305.field2863[var304.field2742] != var304);
                                        class37.method571(var303, 200000);
                                    }
                                }
                                var301 = var300.field3;
                                if (var301.field2742 < 0) {
                                    break;
                                }
                                var302 = class173.method2966(var301.field2829);
                            } while (var302 == null || var302.field2863 == null || var301.field2742 >= var302.field2863.length || var302.field2863[var301.field2742] != var301);
                            class37.method571(var300, 200000);
                        }
                    }
                    var298 = var297.field3;
                    if (var298.field2742 < 0) {
                        break;
                    }
                    var299 = class173.method2966(var298.field2829);
                } while (var299 == null || var299.field2863 == null || var298.field2742 >= var299.field2863.length || var299.field2863[var298.field2742] != var298);
                class37.method571(var297, 200000);
            }
        } else if (field340 > 0) {
            method166();
        } else {
            method1766(40);
            Statics.field301 = Statics.field2278;
            Statics.field2278 = null;
        }
    }

    @ObfuscatedName("cd.a(I)V")
    public static final void method1759() {
        if (Statics.field2701 != null) {
            Statics.field2701.method1188();
        }
        if (Statics.field95 != null) {
            Statics.field95.method1188();
        }
    }

    @ObfuscatedName("eu.j(B)V")
    public static final void method2949() {
        for (int var0 = 0; var0 < field529; var0++) {
            int var10002 = field532[var0]--;
            if (field532[var0] >= -10) {
                class59 var2 = field534[var0];
                if (var2 == null) {
                    class59 var10000 = (class59) null;
                    var2 = class59.method1240(Statics.field669, field530[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field532[var0] += var2.method1236();
                    field534[var0] = var2;
                }
                if (field532[var0] < 0) {
                    int var9;
                    if (field533[var0] == 0) {
                        var9 = field527;
                    } else {
                        int var3 = (field533[var0] & 0xFF) * 128;
                        int var4 = field533[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field1544.field866;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field533[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field1544.field814;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field532[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field528 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1235().method1279(Statics.field3052);
                        class65 var11 = class65.method1297(var10, 100, var9);
                        var11.method1303(field531[var0] - 1);
                        Statics.field1038.method1158(var11);
                    }
                    field532[var0] = -100;
                }
            } else {
                field529--;
                for (int var1 = var0; var1 < field529; var1++) {
                    field530[var1] = field530[var1 + 1];
                    field534[var1] = field534[var1 + 1];
                    field531[var1] = field531[var1 + 1];
                    field532[var1] = field532[var1 + 1];
                    field533[var1] = field533[var1 + 1];
                }
                var0--;
            }
        }
        if (field526 && !class183.method153()) {
            if (field524 != 0 && field525 != -1) {
                class183.method121(Statics.field1938, field525, 0, field524, false);
            }
            field526 = false;
        }
    }

    @ObfuscatedName("u.p(Laa;IIIB)V")
    public static void method212(class43 arg0, int arg1, int arg2, int arg3) {
        if (field529 >= 50 || field528 == 0 || arg0.field986 == null || arg1 >= arg0.field986.length) {
            return;
        }
        int var4 = arg0.field986[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field530[field529] = var5;
        field531[field529] = var6;
        field532[field529] = 0;
        field534[field529] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field533[field529] = (var8 << 16) + (var9 << 8) + var7;
        field529++;
    }

    @ObfuscatedName("ar.w(IIII)V")
    public static void method666(int arg0, int arg1, int arg2) {
        if (field527 == 0 || arg1 == 0 || field529 >= 50) {
            return;
        }
        field530[field529] = arg0;
        field531[field529] = arg1;
        field532[field529] = arg2;
        field534[field529] = null;
        field533[field529] = 0;
        field529++;
    }

    @ObfuscatedName("db.au(IB)V")
    public static void method2602(int arg0) {
        if (arg0 == -1 && !field526) {
            Statics.field2935.method3386();
            class183.field2937 = 1;
            Statics.field3131 = null;
        } else if (arg0 != -1 && field525 != arg0 && field524 != 0 && !field526) {
            class183.method2637(2, Statics.field1938, arg0, 0, field524, false);
        }
        field525 = arg0;
    }

    @ObfuscatedName("al.ar(IIB)V")
    public static void method726(int arg0, int arg1) {
        if (field524 != 0 && arg0 != -1) {
            class183.method121(Statics.field760, arg0, 0, field524, false);
            field526 = true;
        }
    }

    @ObfuscatedName("ct.ah(I)V")
    public static final void method1942() {
        if (Statics.field1181 != field501) {
            field501 = Statics.field1181;
            method3108(Statics.field1181);
        }
    }

    @ObfuscatedName("av.af(Lfr;III)V")
    public static final void method684(class173 arg0, int arg1, int arg2) {
        if (field494 != 0 && field494 != 3 || class140.field2141 != 1 && Statics.field312 || class140.field2141 != 4) {
            return;
        }
        class175 var3 = arg0.method3198(true);
        if (var3 == null) {
            return;
        }
        int var4 = class140.field2133 - arg1;
        int var5 = class140.field2131 - arg2;
        if (!var3.method3223(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2881 / 2;
        int var7 = var5 - var3.field2882 / 2;
        int var8 = field470 + field373 & 0x7FF;
        int var9 = class91.field1574[var8];
        int var10 = class91.field1581[var8];
        int var11 = (field367 + 256) * var9 >> 8;
        int var12 = (field367 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field1544.field866 + var13 >> 7;
        int var16 = Statics.field1544.field814 - var14 >> 7;
        field330.method2578(3);
        field330.method2436(18);
        field330.method2417(class137.field2107[82] ? (class137.field2107[81] ? 2 : 1) : 0);
        field330.method2339(Statics.field1150 + var16);
        field330.method2378(Statics.field1201 + var15);
        field330.method2436(var6);
        field330.method2436(var7);
        field330.method2331(field373);
        field330.method2436(57);
        field330.method2436(field470);
        field330.method2436(field367);
        field330.method2436(89);
        field330.method2331(Statics.field1544.field866);
        field330.method2331(Statics.field1544.field814);
        field330.method2436(63);
        field521 = var15;
        field522 = var16;
    }

    @ObfuscatedName("q.az(B)V")
    public static final void method85() {
        int[] var0 = class33.field751;
        for (int var1 = 0; var1 < class33.field750; var1++) {
            class3 var2 = field409[var0[var1]];
            if (var2 != null && var2.field826 > 0) {
                var2.field826--;
                if (var2.field826 == 0) {
                    var2.field823 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field325; var3++) {
            int var4 = field326[var3];
            class35 var5 = field324[var4];
            if (var5 != null && var5.field826 > 0) {
                var5.field826--;
                if (var5.field826 == 0) {
                    var5.field823 = null;
                }
            }
        }
    }

    @ObfuscatedName("r.av(Ljava/lang/String;B)V")
    public static final void method45(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1389.field136 = !Statics.field1389.field136;
            class9.method86();
            if (Statics.field1389.field136) {
                class12.method112(99, "", "Roofs are now all hidden");
            } else {
                class12.method112(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field302 = !field302;
        }
        if (field384 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field302 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field302 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                if (field340 > 0) {
                    method166();
                } else {
                    method1766(40);
                    Statics.field301 = Statics.field2278;
                    Statics.field2278 = null;
                }
            }
            if (arg0.equalsIgnoreCase("errortest") && field288 == 2) {
                throw new RuntimeException();
            }
        }
        field330.method2578(83);
        field330.method2436(arg0.length() + 1);
        field330.method2336(arg0);
    }

    @ObfuscatedName("c.al(I)V")
    public static final void method109() {
        int var0 = Statics.field1672 * 128 + 64;
        int var1 = Statics.field700 * 128 + 64;
        int var2 = method2950(var0, var1, Statics.field1181) - Statics.field211;
        if (Statics.field160 < var0) {
            Statics.field160 += Statics.field668 * (var0 - Statics.field160) / 1000 + Statics.field272;
            if (Statics.field160 > var0) {
                Statics.field160 = var0;
            }
        }
        if (Statics.field160 > var0) {
            Statics.field160 -= Statics.field668 * (Statics.field160 - var0) / 1000 + Statics.field272;
            if (Statics.field160 < var0) {
                Statics.field160 = var0;
            }
        }
        if (Statics.field2041 < var2) {
            Statics.field2041 += Statics.field668 * (var2 - Statics.field2041) / 1000 + Statics.field272;
            if (Statics.field2041 > var2) {
                Statics.field2041 = var2;
            }
        }
        if (Statics.field2041 > var2) {
            Statics.field2041 -= Statics.field668 * (Statics.field2041 - var2) / 1000 + Statics.field272;
            if (Statics.field2041 < var2) {
                Statics.field2041 = var2;
            }
        }
        if (Statics.field1620 < var1) {
            Statics.field1620 += Statics.field668 * (var1 - Statics.field1620) / 1000 + Statics.field272;
            if (Statics.field1620 > var1) {
                Statics.field1620 = var1;
            }
        }
        if (Statics.field1620 > var1) {
            Statics.field1620 -= Statics.field668 * (Statics.field1620 - var1) / 1000 + Statics.field272;
            if (Statics.field1620 < var1) {
                Statics.field1620 = var1;
            }
        }
        int var3 = Statics.field2054 * 128 + 64;
        int var4 = Statics.field2060 * 128 + 64;
        int var5 = method2950(var3, var4, Statics.field1181) - Statics.field1654;
        int var6 = var3 - Statics.field160;
        int var7 = var5 - Statics.field2041;
        int var8 = var4 - Statics.field1620;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1446 < var10) {
            Statics.field1446 += Statics.field1556 * (var10 - Statics.field1446) / 1000 + Statics.field1927;
            if (Statics.field1446 > var10) {
                Statics.field1446 = var10;
            }
        }
        if (Statics.field1446 > var10) {
            Statics.field1446 -= Statics.field1556 * (Statics.field1446 - var10) / 1000 + Statics.field1927;
            if (Statics.field1446 < var10) {
                Statics.field1446 = var10;
            }
        }
        int var12 = var11 - Statics.field1866;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1866 += Statics.field1556 * var12 / 1000 + Statics.field1927;
            Statics.field1866 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1866 -= Statics.field1556 * -var12 / 1000 + Statics.field1927;
            Statics.field1866 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1866;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1866 = var11;
        }
    }

    @ObfuscatedName("el.aw(B)V")
    public static final void method2746() {
        int var0 = field352 + Statics.field1544.field866;
        int var1 = field354 + Statics.field1544.field814;
        if (Statics.field616 - var0 < -500 || Statics.field616 - var0 > 500 || Statics.field1772 - var1 < -500 || Statics.field1772 - var1 > 500) {
            Statics.field616 = var0;
            Statics.field1772 = var1;
        }
        if (Statics.field616 != var0) {
            Statics.field616 += (var0 - Statics.field616) / 16;
        }
        if (Statics.field1772 != var1) {
            Statics.field1772 += (var1 - Statics.field1772) / 16;
        }
        if (class140.field2134 == 4 && Statics.field312) {
            int var2 = class140.field2136 - field377;
            field392 = var2 * 2;
            field377 = var2 == -1 || var2 == 1 ? class140.field2136 : (field377 + class140.field2136) / 2;
            int var3 = field492 - class140.field2146;
            field443 = var3 * 2;
            field492 = var3 == -1 || var3 == 1 ? class140.field2146 : (field492 + class140.field2146) / 2;
        } else {
            if (class137.field2107[96]) {
                field443 += (-24 - field443) / 2;
            } else if (class137.field2107[97]) {
                field443 += (24 - field443) / 2;
            } else {
                field443 /= 2;
            }
            if (class137.field2107[98]) {
                field392 += (12 - field392) / 2;
            } else if (class137.field2107[99]) {
                field392 += (-12 - field392) / 2;
            } else {
                field392 /= 2;
            }
            field377 = class140.field2136;
            field492 = class140.field2146;
        }
        field373 = field443 / 2 + field373 & 0x7FF;
        field372 += field392 / 2;
        if (field372 < 128) {
            field372 = 128;
        }
        if (field372 > 383) {
            field372 = 383;
        }
        int var4 = Statics.field616 >> 7;
        int var5 = Statics.field1772 >> 7;
        int var6 = method2950(Statics.field616, Statics.field1772, Statics.field1181);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field1181;
                    if (var10 < 3 && (class6.field76[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class6.field74[var10][var8][var9];
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
        if (var12 > field432) {
            field432 += (var12 - field432) / 24;
        } else if (var12 < field432) {
            field432 += (var12 - field432) / 80;
        }
    }

    @ObfuscatedName("eo.ac(B)V")
    public static final void method2910() {
        int var0 = class33.field750;
        int[] var1 = class33.field751;
        for (int var2 = 0; var2 < var0; var2++) {
            class3 var3 = field409[var1[var2]];
            if (var3 != null) {
                method680(var3, 1);
            }
        }
    }

    @ObfuscatedName("ay.ai(I)V")
    public static final void method778() {
        for (int var0 = 0; var0 < field325; var0++) {
            int var1 = field326[var0];
            class35 var2 = field324[var1];
            if (var2 != null) {
                method680(var2, var2.field779.field906);
            }
        }
    }

    @ObfuscatedName("az.ab(Laj;IS)V")
    public static final void method680(class38 arg0, int arg1) {
        if (arg0.field839 > field290) {
            int var2 = arg0.field839 - field290;
            int var3 = arg0.field853 * 64 + arg0.field851 * 128;
            int var4 = arg0.field864 * 128 + arg0.field853 * 64;
            arg0.field866 += (var3 - arg0.field866) / var2;
            arg0.field814 += (var4 - arg0.field814) / var2;
            arg0.field867 = 0;
            arg0.field860 = arg0.field834;
        } else if (arg0.field856 >= field290) {
            if (field290 == arg0.field856 || arg0.field841 == -1 || arg0.field844 != 0 || arg0.field820 + 1 > class43.method2299(arg0.field841).field985[arg0.field842]) {
                int var5 = arg0.field856 - arg0.field839;
                int var6 = field290 - arg0.field839;
                int var7 = arg0.field853 * 64 + arg0.field851 * 128;
                int var8 = arg0.field864 * 128 + arg0.field853 * 64;
                int var9 = arg0.field853 * 64 + arg0.field811 * 128;
                int var10 = arg0.field854 * 128 + arg0.field853 * 64;
                arg0.field866 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field814 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field867 = 0;
            arg0.field860 = arg0.field834;
            arg0.field812 = arg0.field860;
        } else {
            arg0.field838 = arg0.field815;
            if (arg0.field863 == 0) {
                arg0.field867 = 0;
            } else {
                label321: {
                    if (arg0.field841 != -1 && arg0.field844 == 0) {
                        class43 var11 = class43.method2299(arg0.field841);
                        if (arg0.field824 > 0 && var11.field994 == 0) {
                            arg0.field867++;
                            break label321;
                        }
                        if (arg0.field824 <= 0 && var11.field979 == 0) {
                            arg0.field867++;
                            break label321;
                        }
                    }
                    int var12 = arg0.field866;
                    int var13 = arg0.field814;
                    int var14 = arg0.field857[arg0.field863 - 1] * 128 + arg0.field853 * 64;
                    int var15 = arg0.field865[arg0.field863 - 1] * 128 + arg0.field853 * 64;
                    if (var12 < var14) {
                        if (var13 < var15) {
                            arg0.field860 = 1280;
                        } else if (var13 > var15) {
                            arg0.field860 = 1792;
                        } else {
                            arg0.field860 = 1536;
                        }
                    } else if (var12 > var14) {
                        if (var13 < var15) {
                            arg0.field860 = 768;
                        } else if (var13 > var15) {
                            arg0.field860 = 256;
                        } else {
                            arg0.field860 = 512;
                        }
                    } else if (var13 < var15) {
                        arg0.field860 = 1024;
                    } else if (var13 > var15) {
                        arg0.field860 = 0;
                    }
                    byte var16 = arg0.field861[arg0.field863 - 1];
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        int var17 = arg0.field860 - arg0.field812 & 0x7FF;
                        if (var17 > 1024) {
                            var17 -= 2048;
                        }
                        int var18 = arg0.field819;
                        if (var17 >= -256 && var17 <= 256) {
                            var18 = arg0.field818;
                        } else if (var17 >= 256 && var17 < 768) {
                            var18 = arg0.field821;
                        } else if (var17 >= -768 && var17 <= -256) {
                            var18 = arg0.field829;
                        }
                        if (var18 == -1) {
                            var18 = arg0.field818;
                        }
                        arg0.field838 = var18;
                        int var19 = 4;
                        boolean var20 = true;
                        if (arg0 instanceof class35) {
                            var20 = ((class35) arg0).field779.field915;
                        }
                        if (var20) {
                            if (arg0.field860 != arg0.field812 && arg0.field836 == -1 && arg0.field862 != 0) {
                                var19 = 2;
                            }
                            if (arg0.field863 > 2) {
                                var19 = 6;
                            }
                            if (arg0.field863 > 3) {
                                var19 = 8;
                            }
                            if (arg0.field867 > 0 && arg0.field863 > 1) {
                                var19 = 8;
                                arg0.field867--;
                            }
                        } else {
                            if (arg0.field863 > 1) {
                                var19 = 6;
                            }
                            if (arg0.field863 > 2) {
                                var19 = 8;
                            }
                            if (arg0.field867 > 0 && arg0.field863 > 1) {
                                var19 = 8;
                                arg0.field867--;
                            }
                        }
                        if (var16 == 2) {
                            var19 <<= 0x1;
                        }
                        if (var19 >= 8 && arg0.field838 == arg0.field818 && arg0.field822 != -1) {
                            arg0.field838 = arg0.field822;
                        }
                        if (var12 != var14 || var13 != var15) {
                            if (var12 < var14) {
                                arg0.field866 += var19;
                                if (arg0.field866 > var14) {
                                    arg0.field866 = var14;
                                }
                            } else if (var12 > var14) {
                                arg0.field866 -= var19;
                                if (arg0.field866 < var14) {
                                    arg0.field866 = var14;
                                }
                            }
                            if (var13 < var15) {
                                arg0.field814 += var19;
                                if (arg0.field814 > var15) {
                                    arg0.field814 = var15;
                                }
                            } else if (var13 > var15) {
                                arg0.field814 -= var19;
                                if (arg0.field814 < var15) {
                                    arg0.field814 = var15;
                                }
                            }
                        }
                        if (arg0.field866 == var14 && arg0.field814 == var15) {
                            arg0.field863--;
                            if (arg0.field824 > 0) {
                                arg0.field824--;
                            }
                        }
                    } else {
                        arg0.field866 = var14;
                        arg0.field814 = var15;
                        arg0.field863--;
                        if (arg0.field824 > 0) {
                            arg0.field824--;
                        }
                    }
                }
            }
        }
        if (arg0.field866 < 128 || arg0.field814 < 128 || arg0.field866 >= 13184 || arg0.field814 >= 13184) {
            arg0.field841 = -1;
            arg0.field843 = -1;
            arg0.field839 = 0;
            arg0.field856 = 0;
            arg0.field866 = arg0.field857[0] * 128 + arg0.field853 * 64;
            arg0.field814 = arg0.field865[0] * 128 + arg0.field853 * 64;
            arg0.method757();
        }
        if (Statics.field1544 == arg0 && (arg0.field866 < 1536 || arg0.field814 < 1536 || arg0.field866 >= 11776 || arg0.field814 >= 11776)) {
            arg0.field841 = -1;
            arg0.field843 = -1;
            arg0.field839 = 0;
            arg0.field856 = 0;
            arg0.field866 = arg0.field857[0] * 128 + arg0.field853 * 64;
            arg0.field814 = arg0.field865[0] * 128 + arg0.field853 * 64;
            arg0.method757();
        }
        if (arg0.field862 != 0) {
            if (arg0.field836 != -1) {
                class38 var21 = null;
                if (arg0.field836 < 32768) {
                    var21 = field324[arg0.field836];
                } else if (arg0.field836 >= 32768) {
                    var21 = field409[arg0.field836 - 32768];
                }
                if (var21 != null) {
                    int var22 = arg0.field866 - var21.field866;
                    int var23 = arg0.field814 - var21.field814;
                    if (var22 != 0 || var23 != 0) {
                        arg0.field860 = (int) (Math.atan2((double) var22, (double) var23) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field868) {
                    arg0.field836 = -1;
                    arg0.field868 = false;
                }
            }
            if (arg0.field837 != -1 && (arg0.field863 == 0 || arg0.field867 > 0)) {
                arg0.field860 = arg0.field837;
                arg0.field837 = -1;
            }
            int var24 = arg0.field860 - arg0.field812 & 0x7FF;
            if (var24 == 0 && arg0.field868) {
                arg0.field836 = -1;
                arg0.field868 = false;
            }
            if (var24 == 0) {
                arg0.field835 = 0;
            } else {
                arg0.field835++;
                if (var24 > 1024) {
                    arg0.field812 -= arg0.field862;
                    boolean var25 = true;
                    if (var24 < arg0.field862 || var24 > 2048 - arg0.field862) {
                        arg0.field812 = arg0.field860;
                        var25 = false;
                    }
                    if (arg0.field838 == arg0.field815 && (arg0.field835 > 25 || var25)) {
                        if (arg0.field855 == -1) {
                            arg0.field838 = arg0.field818;
                        } else {
                            arg0.field838 = arg0.field855;
                        }
                    }
                } else {
                    arg0.field812 += arg0.field862;
                    boolean var26 = true;
                    if (var24 < arg0.field862 || var24 > 2048 - arg0.field862) {
                        arg0.field812 = arg0.field860;
                        var26 = false;
                    }
                    if (arg0.field838 == arg0.field815 && (arg0.field835 > 25 || var26)) {
                        if (arg0.field817 == -1) {
                            arg0.field838 = arg0.field818;
                        } else {
                            arg0.field838 = arg0.field817;
                        }
                    }
                }
                arg0.field812 &= 0x7FF;
            }
        }
        method735(arg0);
    }

    @ObfuscatedName("ac.aj(Laj;I)V")
    public static final void method735(class38 arg0) {
        arg0.field813 = false;
        if (arg0.field838 != -1) {
            class43 var1 = class43.method2299(arg0.field838);
            if (var1 == null || var1.field983 == null) {
                arg0.field838 = -1;
            } else {
                arg0.field840++;
                if (arg0.field810 < var1.field983.length && arg0.field840 > var1.field985[arg0.field810]) {
                    arg0.field840 = 1;
                    arg0.field810++;
                    method212(var1, arg0.field810, arg0.field866, arg0.field814);
                }
                if (arg0.field810 >= var1.field983.length) {
                    arg0.field840 = 0;
                    arg0.field810 = 0;
                    method212(var1, arg0.field810, arg0.field866, arg0.field814);
                }
            }
        }
        if (arg0.field843 != -1 && field290 >= arg0.field849) {
            if (arg0.field847 < 0) {
                arg0.field847 = 0;
            }
            int var2 = class44.method2267(arg0.field843).field1009;
            if (var2 == -1) {
                arg0.field843 = -1;
            } else {
                class43 var3 = class43.method2299(var2);
                if (var3 == null || var3.field983 == null) {
                    arg0.field843 = -1;
                } else {
                    arg0.field848++;
                    if (arg0.field847 < var3.field983.length && arg0.field848 > var3.field985[arg0.field847]) {
                        arg0.field848 = 1;
                        arg0.field847++;
                        method212(var3, arg0.field847, arg0.field866, arg0.field814);
                    }
                    if (arg0.field847 >= var3.field983.length && (arg0.field847 < 0 || arg0.field847 >= var3.field983.length)) {
                        arg0.field843 = -1;
                    }
                }
            }
        }
        if (arg0.field841 != -1 && arg0.field844 <= 1) {
            class43 var4 = class43.method2299(arg0.field841);
            if (var4.field994 == 1 && arg0.field824 > 0 && arg0.field839 <= field290 && arg0.field856 < field290) {
                arg0.field844 = 1;
                return;
            }
        }
        if (arg0.field841 != -1 && arg0.field844 == 0) {
            class43 var5 = class43.method2299(arg0.field841);
            if (var5 == null || var5.field983 == null) {
                arg0.field841 = -1;
            } else {
                arg0.field820++;
                if (arg0.field842 < var5.field983.length && arg0.field820 > var5.field985[arg0.field842]) {
                    arg0.field820 = 1;
                    arg0.field842++;
                    method212(var5, arg0.field842, arg0.field866, arg0.field814);
                }
                if (arg0.field842 >= var5.field983.length) {
                    arg0.field842 -= var5.field987;
                    arg0.field845++;
                    if (arg0.field845 >= var5.field993) {
                        arg0.field841 = -1;
                    } else if (arg0.field842 >= 0 && arg0.field842 < var5.field983.length) {
                        method212(var5, arg0.field842, arg0.field866, arg0.field814);
                    } else {
                        arg0.field841 = -1;
                    }
                }
                arg0.field813 = var5.field990;
            }
        }
        if (arg0.field844 > 0) {
            arg0.field844--;
        }
    }

    @ObfuscatedName("aw.an(Lr;IIS)V")
    public static void method729(class3 arg0, int arg1, int arg2) {
        if (arg0.field841 == arg1 && arg1 != -1) {
            int var3 = class43.method2299(arg1).field995;
            if (var3 == 1) {
                arg0.field842 = 0;
                arg0.field820 = 0;
                arg0.field844 = arg2;
                arg0.field845 = 0;
            }
            if (var3 == 2) {
                arg0.field845 = 0;
            }
        } else if (arg1 == -1 || arg0.field841 == -1 || class43.method2299(arg1).field996 >= class43.method2299(arg0.field841).field996) {
            arg0.field841 = arg1;
            arg0.field842 = 0;
            arg0.field820 = 0;
            arg0.field844 = arg2;
            arg0.field845 = 0;
            arg0.field824 = arg0.field863;
        }
    }

    @ObfuscatedName("f.ay(I)I")
    public static int method167() {
        return field500 ? 2 : 1;
    }

    @ObfuscatedName("u.ap(II)V")
    public static void method188(int arg0) {
        field499 = 0L;
        if (arg0 >= 2) {
            field500 = true;
        } else {
            field500 = false;
        }
        method924();
        if (field507 >= 25) {
            method3459();
        }
        field2173 = true;
    }

    @ObfuscatedName("dv.ax(I)V")
    public static void method2596() {
        class137.method1267(Statics.field1781);
        class140.method569(Statics.field1781);
        if (Statics.field142 != null) {
            Statics.field142.method2656(Statics.field1781);
        }
        Statics.field284.method2819();
        Statics.field1781.setBackground(Color.black);
        Canvas var0 = Statics.field1781;
        var0.setFocusTraversalKeysEnabled(false);
        var0.addKeyListener(class137.field2106);
        var0.addFocusListener(class137.field2106);
        Canvas var1 = Statics.field1781;
        var1.addMouseListener(class140.field2143);
        var1.addMouseMotionListener(class140.field2143);
        var1.addFocusListener(class140.field2143);
        if (Statics.field142 != null) {
            Statics.field142.method2664(Statics.field1781);
        }
        if (field446 != -1) {
            int var2 = field446;
            int var3 = Statics.field63;
            int var4 = Statics.field686;
            if (class173.method2289(var2)) {
                method9(Statics.field2801[var2], -1, var3, var4, false);
            }
        }
        field2186 = true;
    }

    @ObfuscatedName("gx.aa(B)V")
    public static void method3459() {
        field330.method2578(25);
        field330.method2436(method167());
        field330.method2331(Statics.field63);
        field330.method2331(Statics.field686);
    }

    @ObfuscatedName("ao.ae(I)V")
    public static void method924() {
        client var0 = Statics.field284;
        synchronized (Statics.field284) {
            Container var1 = Statics.field284.method2828();
            if (var1 != null) {
                Statics.field1950 = Math.max(var1.getSize().width, Statics.field765);
                Statics.field880 = Math.max(var1.getSize().height, Statics.field918);
                if (Statics.field1399 == var1) {
                    Insets var2 = Statics.field1399.getInsets();
                    Statics.field1950 -= var2.right + var2.left;
                    Statics.field880 -= var2.top + var2.bottom;
                }
                if (Statics.field1950 <= 0) {
                    Statics.field1950 = 1;
                }
                if (Statics.field880 <= 0) {
                    Statics.field880 = 1;
                }
                if (method167() == 1) {
                    Statics.field63 = field516 * 765;
                    Statics.field686 = field502 * 503;
                } else {
                    Statics.field63 = Math.min(Statics.field1950, 7680);
                    Statics.field686 = Math.min(Statics.field880, 2160);
                }
                field2182 = (Statics.field1950 - Statics.field63) / 2;
                field2183 = 0;
                Statics.field1781.setSize(Statics.field63, Statics.field686);
                Statics.field1379 = class78.method2029(Statics.field63, Statics.field686, Statics.field1781);
                if (Statics.field1399 == var1) {
                    Insets var3 = Statics.field1399.getInsets();
                    Statics.field1781.setLocation(field2182 + var3.left, field2183 + var3.top);
                } else {
                    Statics.field1781.setLocation(field2182, field2183);
                }
                int var4 = Statics.field63;
                int var5 = Statics.field686;
                if (Statics.field1950 < var4) {
                    int var6 = Statics.field1950;
                }
                if (Statics.field880 < var5) {
                    int var7 = Statics.field880;
                }
                if (Statics.field1389 != null) {
                    try {
                        class132.method2666(Statics.field284, "resize", new Object[] { method167() });
                    } catch (Throwable var13) {
                    }
                }
                if (field446 != -1) {
                    int var9 = field446;
                    int var10 = Statics.field63;
                    int var11 = Statics.field686;
                    if (class173.method2289(var9)) {
                        method9(Statics.field2801[var9], -1, var10, var11, true);
                    }
                }
                method3132();
            }
        }
    }

    @ObfuscatedName("fq.ao(B)V")
    public static void method3132() {
        int var0 = field2182;
        int var1 = field2183;
        int var2 = Statics.field1950 - Statics.field63 - var0;
        int var3 = Statics.field880 - Statics.field686 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field284.method2828();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1399 == var4) {
                Insets var7 = Statics.field1399.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field880);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field1950, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field1950 + var5 - var2, var6, var2, Statics.field880);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field880 + var6 - var3, Statics.field1950, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("aa.aq(IIIII)V")
    public static final void method871(int arg0, int arg1, int arg2, int arg3) {
        field393++;
        method561(class34.field766);
        boolean var4 = false;
        if (field454 >= 0) {
            int var5 = class33.field750;
            int[] var6 = class33.field751;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field454 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method561(class34.field767);
        }
        method164(true);
        method561(var4 ? class34.field769 : class34.field768);
        method164(false);
        method2026();
        method2722();
        method2038(arg0, arg1, arg2, arg3, true);
        int var8 = field475;
        int var9 = field453;
        int var10 = field551;
        int var11 = field552;
        class80.method1734(var8, var9, var8 + var10, var9 + var11);
        class91.method1951();
        if (!field344) {
            int var12 = field372;
            if (field432 / 256 > var12) {
                var12 = field432 / 256;
            }
            if (field329[4] && field538[4] + 128 > var12) {
                var12 = field538[4] + 128;
            }
            int var13 = field438 + field373 & 0x7FF;
            int var14 = Statics.field616;
            int var15 = method2950(Statics.field1544.field866, Statics.field1544.field814, Statics.field1181) - field378;
            int var16 = Statics.field1772;
            int var17 = var12 * 3 + 600;
            int var18 = 2048 - var12 & 0x7FF;
            int var19 = 2048 - var13 & 0x7FF;
            int var20 = 0;
            int var21 = 0;
            int var22 = var17;
            if (var18 != 0) {
                int var23 = class91.field1574[var18];
                int var24 = class91.field1581[var18];
                int var25 = var21 * var24 - var17 * var23 >> 16;
                var22 = var21 * var23 + var17 * var24 >> 16;
                var21 = var25;
            }
            if (var19 != 0) {
                int var26 = class91.field1574[var19];
                int var27 = class91.field1581[var19];
                int var28 = var20 * var27 + var22 * var26 >> 16;
                var22 = var22 * var27 - var20 * var26 >> 16;
                var20 = var28;
            }
            Statics.field160 = var14 - var20;
            Statics.field2041 = var15 - var21;
            Statics.field1620 = var16 - var22;
            Statics.field1446 = var12;
            Statics.field1866 = var13;
        }
        int var41;
        if (field344) {
            var41 = method1001();
        } else {
            int var29;
            if (Statics.field1389.field136) {
                var29 = Statics.field1181;
            } else {
                label440: {
                    int var30 = 3;
                    if (Statics.field1446 < 310) {
                        int var31 = Statics.field160 >> 7;
                        int var32 = Statics.field1620 >> 7;
                        int var33 = Statics.field1544.field866 >> 7;
                        int var34 = Statics.field1544.field814 >> 7;
                        if (var31 < 0 || var32 < 0 || var31 >= 104 || var32 >= 104) {
                            var29 = Statics.field1181;
                            break label440;
                        }
                        if ((class6.field76[Statics.field1181][var31][var32] & 0x4) != 0) {
                            var30 = Statics.field1181;
                        }
                        int var35;
                        if (var33 > var31) {
                            var35 = var33 - var31;
                        } else {
                            var35 = var31 - var33;
                        }
                        int var36;
                        if (var34 > var32) {
                            var36 = var34 - var32;
                        } else {
                            var36 = var32 - var34;
                        }
                        if (var35 > var36) {
                            int var37 = var36 * 65536 / var35;
                            int var38 = 32768;
                            while (var31 != var33) {
                                if (var31 < var33) {
                                    var31++;
                                } else if (var31 > var33) {
                                    var31--;
                                }
                                if ((class6.field76[Statics.field1181][var31][var32] & 0x4) != 0) {
                                    var30 = Statics.field1181;
                                }
                                var38 += var37;
                                if (var38 >= 65536) {
                                    var38 -= 65536;
                                    if (var32 < var34) {
                                        var32++;
                                    } else if (var32 > var34) {
                                        var32--;
                                    }
                                    if ((class6.field76[Statics.field1181][var31][var32] & 0x4) != 0) {
                                        var30 = Statics.field1181;
                                    }
                                }
                            }
                        } else {
                            int var39 = var35 * 65536 / var36;
                            int var40 = 32768;
                            while (var32 != var34) {
                                if (var32 < var34) {
                                    var32++;
                                } else if (var32 > var34) {
                                    var32--;
                                }
                                if ((class6.field76[Statics.field1181][var31][var32] & 0x4) != 0) {
                                    var30 = Statics.field1181;
                                }
                                var40 += var39;
                                if (var40 >= 65536) {
                                    var40 -= 65536;
                                    if (var31 < var33) {
                                        var31++;
                                    } else if (var31 > var33) {
                                        var31--;
                                    }
                                    if ((class6.field76[Statics.field1181][var31][var32] & 0x4) != 0) {
                                        var30 = Statics.field1181;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field1544.field866 >= 0 && Statics.field1544.field814 >= 0 && Statics.field1544.field866 < 13312 && Statics.field1544.field814 < 13312) {
                        if ((class6.field76[Statics.field1181][Statics.field1544.field866 >> 7][Statics.field1544.field814 >> 7] & 0x4) != 0) {
                            var30 = Statics.field1181;
                        }
                        var29 = var30;
                    } else {
                        var29 = Statics.field1181;
                    }
                }
            }
            var41 = var29;
        }
        int var42 = Statics.field160;
        int var43 = Statics.field2041;
        int var44 = Statics.field1620;
        int var45 = Statics.field1446;
        int var46 = Statics.field1866;
        for (int var47 = 0; var47 < 5; var47++) {
            if (field329[var47]) {
                int var48 = (int) (Math.random() * (double) (field537[var47] * 2 + 1) - (double) field537[var47] + Math.sin((double) field539[var47] / 100.0D * (double) field540[var47]) * (double) field538[var47]);
                if (var47 == 0) {
                    Statics.field160 += var48;
                }
                if (var47 == 1) {
                    Statics.field2041 += var48;
                }
                if (var47 == 2) {
                    Statics.field1620 += var48;
                }
                if (var47 == 3) {
                    Statics.field1866 = Statics.field1866 + var48 & 0x7FF;
                }
                if (var47 == 4) {
                    Statics.field1446 += var48;
                    if (Statics.field1446 < 128) {
                        Statics.field1446 = 128;
                    }
                    if (Statics.field1446 > 383) {
                        Statics.field1446 = 383;
                    }
                }
            }
        }
        int var49 = class140.field2146;
        int var50 = class140.field2136;
        if (class140.field2141 != 0) {
            var49 = class140.field2133;
            var50 = class140.field2131;
        }
        if (var49 >= var8 && var49 < var8 + var10 && var50 >= var9 && var50 < var9 + var11) {
            class105.field1836 = true;
            class105.field1821 = 0;
            class105.field1840 = var49 - var8;
            class105.field1830 = var50 - var9;
        } else {
            class105.field1836 = false;
            class105.field1821 = 0;
        }
        method1759();
        class80.method1692(var8, var9, var10, var11, 0);
        method1759();
        int var51 = class91.field1566;
        class91.field1566 = field308;
        Statics.field676.method1808(Statics.field160, Statics.field2041, Statics.field1620, Statics.field1446, Statics.field1866, var41);
        class91.field1566 = var51;
        method1759();
        Statics.field676.method1860();
        field382 = 0;
        boolean var52 = false;
        int var53 = -1;
        int var54 = class33.field750;
        int[] var55 = class33.field751;
        for (int var56 = 0; var56 < field325 + var54; var56++) {
            class38 var57;
            if (var56 < var54) {
                var57 = field409[var55[var56]];
                if (field454 == var55[var56]) {
                    var52 = true;
                    var53 = var56;
                    continue;
                }
            } else {
                var57 = field324[field326[var56 - var54]];
            }
            method1582(var57, var56, var8, var9, var10, var11);
        }
        if (var52) {
            method1582(field409[field454], var53, var8, var9, var10, var11);
        }
        for (int var58 = 0; var58 < field382; var58++) {
            int var59 = field557[var58];
            int var60 = field385[var58];
            int var61 = field336[var58];
            int var62 = field386[var58];
            boolean var63 = true;
            while (var63) {
                var63 = false;
                for (int var64 = 0; var64 < var58; var64++) {
                    if (var60 + 2 > field385[var64] - field386[var64] && var60 - var62 < field385[var64] + 2 && var59 - var61 < field557[var64] + field336[var64] && var59 + var61 > field557[var64] - field336[var64] && field385[var64] - field386[var64] < var60) {
                        var60 = field385[var64] - field386[var64];
                        var63 = true;
                    }
                }
            }
            field394 = field557[var58];
            field374 = field385[var58] = var60;
            String var65 = field391[var58];
            if (field572 == 0) {
                int var66 = 16776960;
                if (field568[var58] < 6) {
                    var66 = field503[field568[var58]];
                }
                if (field568[var58] == 6) {
                    var66 = field393 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field568[var58] == 7) {
                    var66 = field393 % 20 < 10 ? 255 : 65535;
                }
                if (field568[var58] == 8) {
                    var66 = field393 % 20 < 10 ? 45056 : 8454016;
                }
                if (field568[var58] == 9) {
                    int var67 = 150 - field390[var58];
                    if (var67 < 50) {
                        var66 = var67 * 1280 + 16711680;
                    } else if (var67 < 100) {
                        var66 = 16776960 - (var67 - 50) * 327680;
                    } else if (var67 < 150) {
                        var66 = (var67 - 100) * 5 + 65280;
                    }
                }
                if (field568[var58] == 10) {
                    int var68 = 150 - field390[var58];
                    if (var68 < 50) {
                        var66 = var68 * 5 + 16711680;
                    } else if (var68 < 100) {
                        var66 = 16711935 - (var68 - 50) * 327680;
                    } else if (var68 < 150) {
                        var66 = (var68 - 100) * 327680 + 255 - (var68 - 100) * 5;
                    }
                }
                if (field568[var58] == 11) {
                    int var69 = 150 - field390[var58];
                    if (var69 < 50) {
                        var66 = 16777215 - var69 * 327685;
                    } else if (var69 < 100) {
                        var66 = (var69 - 50) * 327685 + 65280;
                    } else if (var69 < 150) {
                        var66 = 16777215 - (var69 - 100) * 327680;
                    }
                }
                if (field317[var58] == 0) {
                    Statics.field1516.method3735(var65, field394 + var8, field374 + var9, var66, 0);
                }
                if (field317[var58] == 1) {
                    Statics.field1516.method3737(var65, field394 + var8, field374 + var9, var66, 0, field393);
                }
                if (field317[var58] == 2) {
                    Statics.field1516.method3782(var65, field394 + var8, field374 + var9, var66, 0, field393);
                }
                if (field317[var58] == 3) {
                    Statics.field1516.method3730(var65, field394 + var8, field374 + var9, var66, 0, field393, 150 - field390[var58]);
                }
                if (field317[var58] == 4) {
                    int var70 = (150 - field390[var58]) * (Statics.field1516.method3729(var65) + 100) / 150;
                    class80.method1697(field394 + var8 - 50, var9, field394 + var8 + 50, var9 + var11);
                    Statics.field1516.method3733(var65, field394 + var8 + 50 - var70, field374 + var9, var66, 0);
                    class80.method1734(var8, var9, var8 + var10, var9 + var11);
                }
                if (field317[var58] == 5) {
                    int var71 = 150 - field390[var58];
                    int var72 = 0;
                    if (var71 < 25) {
                        var72 = var71 - 25;
                    } else if (var71 > 125) {
                        var72 = var71 - 125;
                    }
                    class80.method1697(var8, field374 + var9 - Statics.field1516.field3174 - 1, var8 + var10, field374 + var9 + 5);
                    Statics.field1516.method3735(var65, field394 + var8, field374 + var9 + var72, var66, 0);
                    class80.method1734(var8, var9, var8 + var10, var9 + var11);
                }
            } else {
                Statics.field1516.method3735(var65, field394 + var8, field374 + var9, 16776960, 0);
            }
        }
        if (field511 == 2) {
            method49((field307 - Statics.field1201 << 7) + field304, (field388 - Statics.field1150 << 7) + field311, field309 * 2);
            if (field394 > -1 && field290 % 20 < 10) {
                Statics.field236[0].method1597(field394 + var8 - 12, field374 + var9 - 28);
            }
        }
        ((class95) Statics.field1577).method2024(field355);
        method2691(var8, var9, var10, var11);
        Statics.field160 = var42;
        Statics.field2041 = var43;
        Statics.field1620 = var44;
        Statics.field1446 = var45;
        Statics.field1866 = var46;
        if (field295 && class171.method587(true, false) == 0) {
            field295 = false;
        }
        if (field295) {
            class80.method1692(var8, var9, var10, var11, 0);
            Statics.method155(class157.field2309, false);
        }
    }

    @ObfuscatedName("cc.ak(IIIIZI)V")
    public static final void method2038(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field542 - field541) * var5 / 100 + field541;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field315) {
            short var8 = field315;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field546) {
                var6 = field546;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1686();
                    class80.method1692(arg0, arg1, var10, arg3, -16777216);
                    class80.method1692(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field548) {
            short var11 = field548;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field545) {
                var6 = field545;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1686();
                    class80.method1692(arg0, arg1, arg2, var13, -16777216);
                    class80.method1692(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field544 - field543) * var5 / 100 + field543;
        field308 = arg3 * var6 * var14 / 85504 << 1;
        if (field551 != arg2 || field552 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class91.field1574[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class86.method1805(var15, 500, 800, arg2, arg3);
        }
        field475 = arg0;
        field453 = arg1;
        field551 = arg2;
        field552 = arg3;
    }

    @ObfuscatedName("client.at(Law;I)V")
    public static final void method561(class34 arg0) {
        if (Statics.field1544.field866 >> 7 == field521 && Statics.field1544.field814 >> 7 == field522) {
            field521 = 0;
        }
        int var1 = class33.field750;
        int[] var2 = class33.field751;
        int var3 = var1;
        if (class34.field766 == arg0 || class34.field767 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field766 == arg0) {
                var5 = Statics.field1544;
                var6 = Statics.field1544.field50 << 14;
            } else if (class34.field767 == arg0) {
                var5 = field409[field454];
                var6 = field454 << 14;
            } else {
                var5 = field409[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field769 == arg0 && field454 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method36() && !var5.field47) {
                var5.field37 = false;
                if ((field291 && var1 > 50 || var1 > 200) && class34.field766 != arg0 && var5.field838 == var5.field815) {
                    var5.field37 = true;
                }
                int var7 = var5.field866 >> 7;
                int var8 = var5.field814 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field41 == null || field290 < var5.field36 || field290 >= var5.field40) {
                        if ((var5.field866 & 0x7F) == 64 && (var5.field814 & 0x7F) == 64) {
                            if (field393 == field508[var7][var8]) {
                                continue;
                            }
                            field508[var7][var8] = field393;
                        }
                        var5.field49 = method2950(var5.field866, var5.field814, Statics.field1181);
                        Statics.field676.method1939(Statics.field1181, var5.field866, var5.field814, var5.field49, 60, var5, var5.field812, var6, var5.field813);
                    } else {
                        var5.field37 = false;
                        var5.field49 = method2950(var5.field866, var5.field814, Statics.field1181);
                        Statics.field676.method1782(Statics.field1181, var5.field866, var5.field814, var5.field49, 60, var5, var5.field812, var6, var5.field42, var5.field43, var5.field44, var5.field45);
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.as(ZI)V")
    public static final void method164(boolean arg0) {
        for (int var1 = 0; var1 < field325; var1++) {
            class35 var2 = field324[field326[var1]];
            int var3 = (field326[var1] << 14) + 536870912;
            if (var2 != null && var2.method36() && var2.field779.field893 == arg0 && var2.field779.method795()) {
                int var4 = var2.field866 >> 7;
                int var5 = var2.field814 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field853 == 1 && (var2.field866 & 0x7F) == 64 && (var2.field814 & 0x7F) == 64) {
                        if (field393 == field508[var4][var5]) {
                            continue;
                        }
                        field508[var4][var5] = field393;
                    }
                    if (!var2.field779.field914) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field676.method1939(Statics.field1181, var2.field866, var2.field814, method2950(var2.field866 + (var2.field853 * 64 - 64), var2.field814 + (var2.field853 * 64 - 64), Statics.field1181), var2.field853 * 64 - 64 + 60, var2, var2.field812, var3, var2.field813);
                }
            }
        }
    }

    @ObfuscatedName("cb.ag(B)V")
    public static final void method2026() {
        for (class7 var0 = (class7) field371.method3534(); var0 != null; var0 = (class7) field371.method3536()) {
            if (Statics.field1181 != var0.field103 || field290 > var0.field104) {
                var0.method3626();
            } else if (field290 >= var0.field98) {
                if (var0.field107 > 0) {
                    class35 var1 = field324[var0.field107 - 1];
                    if (var1 != null && var1.field866 >= 0 && var1.field866 < 13312 && var1.field814 >= 0 && var1.field814 < 13312) {
                        var0.method87(var1.field866, var1.field814, method2950(var1.field866, var1.field814, var0.field103) - var0.field109, field290);
                    }
                }
                if (var0.field107 < 0) {
                    int var2 = -var0.field107 - 1;
                    class3 var3;
                    if (field410 == var2) {
                        var3 = Statics.field1544;
                    } else {
                        var3 = field409[var2];
                    }
                    if (var3 != null && var3.field866 >= 0 && var3.field866 < 13312 && var3.field814 >= 0 && var3.field814 < 13312) {
                        var0.method87(var3.field866, var3.field814, method2950(var3.field866, var3.field814, var0.field103) - var0.field109, field290);
                    }
                }
                var0.method95(field355);
                Statics.field676.method1939(Statics.field1181, (int) var0.field101, (int) var0.field110, (int) var0.field111, 60, var0, var0.field117, -1, false);
            }
        }
    }

    @ObfuscatedName("ee.ad(I)V")
    public static final void method2722() {
        for (class30 var0 = (class30) field444.method3534(); var0 != null; var0 = (class30) field444.method3536()) {
            if (Statics.field1181 != var0.field694 || var0.field698) {
                var0.method3626();
            } else if (field290 >= var0.field697) {
                var0.method674(field355);
                if (var0.field698) {
                    var0.method3626();
                } else {
                    Statics.field676.method1939(var0.field694, var0.field692, var0.field693, var0.field702, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("as.bw(I)I")
    public static final int method1001() {
        if (Statics.field1389.field136) {
            return Statics.field1181;
        } else {
            int var0 = method2950(Statics.field160, Statics.field1620, Statics.field1181);
            return var0 - Statics.field2041 >= 800 || (class6.field76[Statics.field1181][Statics.field160 >> 7][Statics.field1620 >> 7] & 0x4) == 0 ? 3 : Statics.field1181;
        }
    }

    @ObfuscatedName("bp.bq(Laj;IIIIIB)V")
    public static final void method1582(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method36()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field779;
            if (var6.field911 != null) {
                var6 = var6.method776();
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
            if (var10.field47) {
                return;
            }
            if (var10.field29 != -1 || var10.field32 != -1) {
                method327(arg0, arg0.field859 + 15);
                if (field394 > -1) {
                    if (var10.field29 != -1) {
                        Statics.field1393[var10.field29].method1597(field394 + arg2 - 12, field374 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field32 != -1) {
                        Statics.field57[var10.field32].method1597(field394 + arg2 - 12, field374 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field511 == 10 && field322 == var8[arg1]) {
                method327(arg0, arg0.field859 + 15);
                if (field394 > -1) {
                    Statics.field236[1].method1597(field394 + arg2 - 12, field374 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field779;
            if (var11.field911 != null) {
                var11 = var11.method776();
            }
            if (var11.field909 >= 0 && var11.field909 < Statics.field57.length) {
                method327(arg0, arg0.field859 + 15);
                if (field394 > -1) {
                    Statics.field57[var11.field909].method1597(field394 + arg2 - 12, field374 + arg3 - 30);
                }
            }
            if (field511 == 1 && field504 == field326[arg1 - var7] && field290 % 20 < 10) {
                method327(arg0, arg0.field859 + 15);
                if (field394 > -1) {
                    Statics.field236[0].method1597(field394 + arg2 - 12, field374 + arg3 - 28);
                }
            }
        }
        if (arg0.field823 != null && (arg1 >= var7 || !arg0.field825 && (field395 == 4 || !arg0.field846 && (field395 == 0 || field395 == 3 || field395 == 1 && method4(((class3) arg0).field35, false))))) {
            method327(arg0, arg0.field859);
            if (field394 > -1 && field382 < field383) {
                field336[field382] = Statics.field1516.method3729(arg0.field823) / 2;
                field386[field382] = Statics.field1516.field3174;
                field557[field382] = field394;
                field385[field382] = field374;
                field568[field382] = arg0.field827;
                field317[field382] = arg0.field828;
                field390[field382] = arg0.field826;
                field391[field382] = arg0.field823;
                field382++;
            }
        }
        if (arg0.field832 > field290) {
            method327(arg0, arg0.field859 + 15);
            if (field394 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field779;
                    var12 = var13.field917;
                }
                int var14 = arg0.field833 * var12 / arg0.field816;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field833 > 0) {
                    var14 = 1;
                }
                class80.method1692(field394 + arg2 - var12 / 2, field374 + arg3 - 3, var14, 5, 65280);
                class80.method1692(field394 + arg2 - var12 / 2 + var14, field374 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field831[var15] > field290) {
                method327(arg0, arg0.field859 / 2);
                if (field394 > -1) {
                    if (var15 == 1) {
                        field374 -= 20;
                    }
                    if (var15 == 2) {
                        field394 -= 15;
                        field374 -= 10;
                    }
                    if (var15 == 3) {
                        field394 += 15;
                        field374 -= 10;
                    }
                    Statics.field8[arg0.field830[var15]].method1597(field394 + arg2 - 12, field374 + arg3 - 12);
                    Statics.field2006.method3735(Integer.toString(arg0.field852[var15]), field394 + arg2 - 1, field374 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("aq.bt(I)V")
    public static final void method949() {
        field408 = 0;
        int var0 = (Statics.field1544.field866 >> 7) + Statics.field1201;
        int var1 = (Statics.field1544.field814 >> 7) + Statics.field1150;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field408 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field408 = 1;
        }
        if (field408 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field408 = 0;
        }
    }

    @ObfuscatedName("ef.bl(IIIII)V")
    public static final void method2691(int arg0, int arg1, int arg2, int arg3) {
        if (field399 == 1) {
            Statics.field709[field398 / 100].method1597(field549 - 8, field427 - 8);
        }
        if (field399 == 2) {
            Statics.field709[field398 / 100 + 4].method1597(field549 - 8, field427 - 8);
        }
        method949();
    }

    @ObfuscatedName("client.bg(Laj;II)V")
    public static final void method327(class38 arg0, int arg1) {
        method49(arg0.field866, arg0.field814, arg1);
    }

    @ObfuscatedName("x.bz(IIII)V")
    public static final void method49(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field394 = -1;
            field374 = -1;
            return;
        }
        int var3 = method2950(arg0, arg1, Statics.field1181) - arg2;
        int var4 = arg0 - Statics.field160;
        int var5 = var3 - Statics.field2041;
        int var6 = arg1 - Statics.field1620;
        int var7 = class91.field1574[Statics.field1446];
        int var8 = class91.field1581[Statics.field1446];
        int var9 = class91.field1574[Statics.field1866];
        int var10 = class91.field1581[Statics.field1866];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field394 = field308 * var11 / var15 + field551 / 2;
            field374 = field308 * var14 / var15 + field552 / 2;
        } else {
            field394 = -1;
            field374 = -1;
        }
    }

    @ObfuscatedName("fj.ba(IIIS)I")
    public static final int method2950(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field76[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field74[var5][var3][var4] + class6.field74[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field74[var5][var3][var4 + 1] + class6.field74[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("h.by(ZI)V")
    public static final void method94(boolean arg0) {
        field547 = arg0;
        if (!field547) {
            int var1 = field332.method2430();
            int var2 = field332.method2379();
            int var3 = field332.method2347();
            Statics.field1100 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field1100[var4][var5] = field332.method2350();
                }
            }
            Statics.field1088 = new int[var3];
            Statics.field1398 = new int[var3];
            Statics.field1094 = new int[var3];
            Statics.field569 = new byte[var3][];
            Statics.field347 = new byte[var3][];
            boolean var6 = false;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && var1 / 8 == 48) {
                var6 = true;
            }
            if (var2 / 8 == 48 && var1 / 8 == 148) {
                var6 = true;
            }
            int var7 = 0;
            for (int var8 = (var2 - 6) / 8; var8 <= (var2 + 6) / 8; var8++) {
                for (int var9 = (var1 - 6) / 8; var9 <= (var1 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    if (!var6 || var9 != 49 && var9 != 149 && var9 != 147 && var8 != 50 && (var8 != 49 || var9 != 47)) {
                        Statics.field1088[var7] = var10;
                        Statics.field1398[var7] = Statics.field2242.method3049("m" + var8 + "_" + var9);
                        Statics.field1094[var7] = Statics.field2242.method3049("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method1(var2, var1);
            return;
        }
        int var11 = field332.method2347();
        int var12 = field332.method2347();
        int var13 = field332.method2347();
        field332.method2580();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field332.method2589(1);
                    if (var17 == 1) {
                        field350[var14][var15][var16] = field332.method2589(26);
                    } else {
                        field350[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field332.method2582();
        Statics.field1100 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field1100[var18][var19] = field332.method2350();
            }
        }
        Statics.field1088 = new int[var13];
        Statics.field1398 = new int[var13];
        Statics.field1094 = new int[var13];
        Statics.field569 = new byte[var13][];
        Statics.field347 = new byte[var13][];
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
                            if (Statics.field1088[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field1088[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field1398[var20] = Statics.field2242.method3049("m" + var29 + "_" + var30);
                            Statics.field1094[var20] = Statics.field2242.method3049("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method1(var11, var12);
    }

    @ObfuscatedName("i.bf(IIB)V")
    public static final void method1(int arg0, int arg1) {
        if (Statics.field2058 == arg0 && Statics.field1450 == arg1) {
            return;
        }
        Statics.field2058 = arg0;
        Statics.field1450 = arg1;
        method1766(25);
        Statics.method155(class157.field2309, true);
        int var2 = Statics.field1201;
        int var3 = Statics.field1150;
        Statics.field1201 = (arg0 - 6) * 8;
        Statics.field1150 = (arg1 - 6) * 8;
        int var4 = Statics.field1201 - var2;
        int var5 = Statics.field1150 - var3;
        int var6 = Statics.field1201;
        int var7 = Statics.field1150;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field324[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field857[var10] -= var4;
                    var9.field865[var10] -= var5;
                }
                var9.field866 -= var4 * 128;
                var9.field814 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field409[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field857[var13] -= var4;
                    var12.field865[var13] -= var5;
                }
                var12.field866 -= var4 * 128;
                var12.field814 -= var5 * 128;
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
        for (class17 var25 = (class17) field420.method3534(); var25 != null; var25 = (class17) field420.method3536()) {
            var25.field222 -= var4;
            var25.field226 -= var5;
            if (var25.field222 < 0 || var25.field226 < 0 || var25.field222 >= 104 || var25.field226 >= 104) {
                var25.method3626();
            }
        }
        if (field521 != 0) {
            field521 -= var4;
            field522 -= var5;
        }
        field529 = 0;
        field344 = false;
        field501 = -1;
        field444.method3553();
        field371.method3553();
        for (int var26 = 0; var26 < 4; var26++) {
            field348[var26].method2229();
        }
    }

    @ObfuscatedName("as.bi(ZB)V")
    public static final void method1000(boolean arg0) {
        method1759();
        field292++;
        if (field292 < 50 && !arg0) {
            return;
        }
        field292 = 0;
        if (field341 || Statics.field2278 == null) {
            return;
        }
        field330.method2578(69);
        try {
            Statics.field2278.method2802(field330.field1982, 0, field330.field1980);
            field330.field1980 = 0;
        } catch (IOException var2) {
            field341 = true;
        }
    }

    @ObfuscatedName("fe.bx(II)V")
    public static final void method3108(int arg0) {
        int[] var1 = Statics.field655.field1414;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field76[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field676.method1874(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field76[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field676.method1874(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field655.method1587();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field76[arg0][var10][var9] & 0x18) == 0) {
                    method160(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field76[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method160(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field401 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field676.method1799(Statics.field1181, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class41.method1767(var14).field935;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field348[Statics.field1181].field1882;
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
                        field434[field401] = Statics.field1892[var15];
                        field305[field401] = var16;
                        field441[field401] = var17;
                        field401++;
                    }
                }
            }
        }
        Statics.field1379.method1579();
    }

    @ObfuscatedName("s.br(IIIIII)V")
    public static final void method160(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field676.method1796(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field676.method1800(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field655.field1414;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method1767(var12);
            if (var13.field950 == -1) {
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
                class81 var14 = Statics.field2577[var13.field950];
                if (var14 != null) {
                    int var15 = (var13.field936 * 4 - var14.field1424) / 2;
                    int var16 = (var13.field937 * 4 - var14.field1422) / 2;
                    var14.method1736(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field937) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field676.method1798(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field676.method1800(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method1767(var21);
            if (var22.field950 != -1) {
                class81 var23 = Statics.field2577[var22.field950];
                if (var23 != null) {
                    int var24 = (var22.field936 * 4 - var23.field1424) / 2;
                    int var25 = (var22.field937 * 4 - var23.field1422) / 2;
                    var23.method1736(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field937) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field655.field1414;
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
        int var29 = Statics.field676.method1799(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method1767(var30);
        if (var31.field950 == -1) {
            return;
        }
        class81 var32 = Statics.field2577[var31.field950];
        if (var32 != null) {
            int var33 = (var31.field936 * 4 - var32.field1424) / 2;
            int var34 = (var31.field937 * 4 - var32.field1422) / 2;
            var32.method1736(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field937) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("fm.bs(I)V")
    public static final void method2972() {
        if (field334 == 3) {
            int var0 = field332.method2371();
            int var1 = var0 >> 2;
            int var2 = var0 & 0x3;
            int var3 = field490[var1];
            int var4 = field332.method2381();
            int var5 = field332.method2371();
            int var6 = (var5 >> 4 & 0x7) + Statics.field1674;
            int var7 = (var5 & 0x7) + Statics.field2036;
            if (var6 >= 0 && var7 >= 0 && var6 < 103 && var7 < 103) {
                if (var3 == 0) {
                    class87 var8 = Statics.field676.method1792(Statics.field1181, var6, var7);
                    if (var8 != null) {
                        int var9 = var8.field1522 >> 14 & 0x7FFF;
                        if (var1 == 2) {
                            var8.field1520 = new class13(var9, 2, var2 + 4, Statics.field1181, var6, var7, var4, false, var8.field1520);
                            var8.field1521 = new class13(var9, 2, var2 + 1 & 0x3, Statics.field1181, var6, var7, var4, false, var8.field1521);
                        } else {
                            var8.field1520 = new class13(var9, var1, var2, Statics.field1181, var6, var7, var4, false, var8.field1520);
                        }
                    }
                }
                if (var3 == 1) {
                    class94 var10 = Statics.field676.method1930(Statics.field1181, var6, var7);
                    if (var10 != null) {
                        int var11 = var10.field1598 >> 14 & 0x7FFF;
                        if (var1 == 4 || var1 == 5) {
                            var10.field1596 = new class13(var11, 4, var2, Statics.field1181, var6, var7, var4, false, var10.field1596);
                        } else if (var1 == 6) {
                            var10.field1596 = new class13(var11, 4, var2 + 4, Statics.field1181, var6, var7, var4, false, var10.field1596);
                        } else if (var1 == 7) {
                            var10.field1596 = new class13(var11, 4, (var2 + 2 & 0x3) + 4, Statics.field1181, var6, var7, var4, false, var10.field1596);
                        } else if (var1 == 8) {
                            var10.field1596 = new class13(var11, 4, var2 + 4, Statics.field1181, var6, var7, var4, false, var10.field1596);
                            var10.field1603 = new class13(var11, 4, (var2 + 2 & 0x3) + 4, Statics.field1181, var6, var7, var4, false, var10.field1603);
                        }
                    }
                }
                if (var3 == 2) {
                    class98 var12 = Statics.field676.method1900(Statics.field1181, var6, var7);
                    if (var1 == 11) {
                        var1 = 10;
                    }
                    if (var12 != null) {
                        var12.field1648 = new class13(var12.field1656 >> 14 & 0x7FFF, var1, var2, Statics.field1181, var6, var7, var4, false, var12.field1648);
                    }
                }
                if (var3 == 3) {
                    class93 var13 = Statics.field676.method1781(Statics.field1181, var6, var7);
                    if (var13 != null) {
                        var13.field1585 = new class13(var13.field1586 >> 14 & 0x7FFF, 22, var2, Statics.field1181, var6, var7, var4, false, var13.field1585);
                    }
                }
            }
        } else if (field334 == 45) {
            int var14 = field332.method2380();
            int var15 = (var14 >> 4 & 0x7) + Statics.field1674;
            int var16 = (var14 & 0x7) + Statics.field2036;
            int var17 = var15 + field332.method2346();
            int var18 = var16 + field332.method2346();
            int var19 = field332.method2348();
            int var20 = field332.method2347();
            int var21 = field332.method2380() * 4;
            int var22 = field332.method2380() * 4;
            int var23 = field332.method2347();
            int var24 = field332.method2347();
            int var25 = field332.method2380();
            int var26 = field332.method2380();
            if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104 && var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104 && var20 != 65535) {
                int var27 = var15 * 128 + 64;
                int var28 = var16 * 128 + 64;
                int var29 = var17 * 128 + 64;
                int var30 = var18 * 128 + 64;
                class7 var31 = new class7(var20, Statics.field1181, var27, var28, method2950(var27, var28, Statics.field1181) - var21, field290 + var23, field290 + var24, var25, var26, var19, var22);
                var31.method87(var29, var30, method2950(var29, var30, Statics.field1181) - var22, field290 + var23);
                field371.method3529(var31);
            }
        } else if (field334 == 55) {
            int var32 = field332.method2371();
            int var33 = (var32 >> 4 & 0x7) + Statics.field1674;
            int var34 = (var32 & 0x7) + Statics.field2036;
            int var35 = field332.method2430();
            int var36 = field332.method2371();
            int var37 = var36 >> 2;
            int var38 = var36 & 0x3;
            int var39 = field490[var37];
            if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
                Statics.method7(Statics.field1181, var33, var34, var39, var35, var37, var38, 0, -1);
            }
        } else if (field334 == 175) {
            int var40 = field332.method2380();
            int var41 = (var40 >> 4 & 0x7) + Statics.field1674;
            int var42 = (var40 & 0x7) + Statics.field2036;
            int var43 = field332.method2347();
            int var44 = field332.method2347();
            int var45 = field332.method2347();
            if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
                class199 var46 = field419[Statics.field1181][var41][var42];
                if (var46 != null) {
                    for (class29 var47 = (class29) var46.method3534(); var47 != null; var47 = (class29) var46.method3536()) {
                        if ((var43 & 0x7FFF) == var47.field682 && var47.field683 == var44) {
                            var47.field683 = var45;
                            break;
                        }
                    }
                    method1080(var41, var42);
                }
            }
        } else {
            if (field334 == 141) {
                int var48 = field332.method2380();
                int var49 = (var48 >> 4 & 0x7) + Statics.field1674;
                int var50 = (var48 & 0x7) + Statics.field2036;
                int var51 = field332.method2347();
                int var52 = field332.method2380();
                int var53 = var52 >> 4 & 0xF;
                int var54 = var52 & 0x7;
                int var55 = field332.method2380();
                if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                    int var56 = var53 + 1;
                    if (Statics.field1544.field857[0] >= var49 - var56 && Statics.field1544.field857[0] <= var49 + var56 && Statics.field1544.field865[0] >= var50 - var56 && Statics.field1544.field865[0] <= var50 + var56 && field528 != 0 && var54 > 0 && field529 < 50) {
                        field530[field529] = var51;
                        field531[field529] = var54;
                        field532[field529] = var55;
                        field534[field529] = null;
                        field533[field529] = (var49 << 16) + (var50 << 8) + var53;
                        field529++;
                    }
                }
            }
            if (field334 == 15) {
                int var57 = field332.method2380();
                int var58 = (var57 >> 4 & 0x7) + Statics.field1674;
                int var59 = (var57 & 0x7) + Statics.field2036;
                int var60 = field332.method2347();
                int var61 = field332.method2380();
                int var62 = field332.method2347();
                if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                    int var63 = var58 * 128 + 64;
                    int var64 = var59 * 128 + 64;
                    class30 var65 = new class30(var60, Statics.field1181, var63, var64, method2950(var63, var64, Statics.field1181) - var61, var62, field290);
                    field444.method3529(var65);
                }
            } else if (field334 == 124) {
                int var66 = field332.method2372();
                int var67 = var66 >> 2;
                int var68 = var66 & 0x3;
                int var69 = field490[var67];
                int var70 = field332.method2355();
                int var71 = (var70 >> 4 & 0x7) + Statics.field1674;
                int var72 = (var70 & 0x7) + Statics.field2036;
                if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104) {
                    Statics.method7(Statics.field1181, var71, var72, var69, -1, var67, var68, 0, -1);
                }
            } else if (field334 == 88) {
                int var73 = field332.method2355();
                int var74 = (var73 >> 4 & 0x7) + Statics.field1674;
                int var75 = (var73 & 0x7) + Statics.field2036;
                int var76 = field332.method2430();
                int var77 = field332.method2347();
                if (var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104) {
                    class29 var78 = new class29();
                    var78.field682 = var76;
                    var78.field683 = var77;
                    if (field419[Statics.field1181][var74][var75] == null) {
                        field419[Statics.field1181][var74][var75] = new class199();
                    }
                    field419[Statics.field1181][var74][var75].method3529(var78);
                    method1080(var74, var75);
                }
            } else {
                if (field334 == 156) {
                    byte var79 = field332.method2456();
                    int var80 = field332.method2430();
                    int var81 = field332.method2371();
                    int var82 = (var81 >> 4 & 0x7) + Statics.field1674;
                    int var83 = (var81 & 0x7) + Statics.field2036;
                    int var84 = field332.method2347();
                    byte var85 = field332.method2346();
                    byte var86 = field332.method2346();
                    byte var87 = field332.method2374();
                    int var88 = field332.method2430();
                    int var89 = field332.method2380();
                    int var90 = var89 >> 2;
                    int var91 = var89 & 0x3;
                    int var92 = field490[var90];
                    int var93 = field332.method2430();
                    class3 var94;
                    if (field410 == var88) {
                        var94 = Statics.field1544;
                    } else {
                        var94 = field409[var88];
                    }
                    if (var94 != null) {
                        class41 var95 = class41.method1767(var84);
                        int var96;
                        int var97;
                        if (var91 == 1 || var91 == 3) {
                            var96 = var95.field937;
                            var97 = var95.field936;
                        } else {
                            var96 = var95.field936;
                            var97 = var95.field937;
                        }
                        int var98 = (var96 >> 1) + var82;
                        int var99 = (var96 + 1 >> 1) + var82;
                        int var100 = (var97 >> 1) + var83;
                        int var101 = (var97 + 1 >> 1) + var83;
                        int[][] var102 = class6.field74[Statics.field1181];
                        int var103 = var102[var98][var100] + var102[var99][var100] + var102[var98][var101] + var102[var99][var101] >> 2;
                        int var104 = (var82 << 7) + (var96 << 6);
                        int var105 = (var83 << 7) + (var97 << 6);
                        class105 var106 = var95.method812(var90, var91, var102, var104, var103, var105);
                        if (var106 != null) {
                            Statics.method7(Statics.field1181, var82, var83, var92, -1, 0, 0, var93 + 1, var80 + 1);
                            var94.field36 = field290 + var93;
                            var94.field40 = field290 + var80;
                            var94.field41 = var106;
                            var94.field55 = var82 * 128 + var96 * 64;
                            var94.field48 = var83 * 128 + var97 * 64;
                            var94.field39 = var103;
                            if (var85 > var86) {
                                byte var107 = var85;
                                var85 = var86;
                                var86 = var107;
                            }
                            if (var79 > var87) {
                                byte var108 = var79;
                                var79 = var87;
                                var87 = var108;
                            }
                            var94.field42 = var82 + var85;
                            var94.field44 = var82 + var86;
                            var94.field43 = var79 + var83;
                            var94.field45 = var83 + var87;
                        }
                    }
                }
                if (field334 == 92) {
                    int var109 = field332.method2381();
                    int var110 = field332.method2380();
                    int var111 = (var110 >> 4 & 0x7) + Statics.field1674;
                    int var112 = (var110 & 0x7) + Statics.field2036;
                    if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104) {
                        class199 var113 = field419[Statics.field1181][var111][var112];
                        if (var113 != null) {
                            for (class29 var114 = (class29) var113.method3534(); var114 != null; var114 = (class29) var113.method3536()) {
                                if ((var109 & 0x7FFF) == var114.field682) {
                                    var114.method3626();
                                    break;
                                }
                            }
                            if (var113.method3534() == null) {
                                field419[Statics.field1181][var111][var112] = null;
                            }
                            method1080(var111, var112);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.bj(I)V")
    public static final void method742() {
        for (class17 var0 = (class17) field420.method3534(); var0 != null; var0 = (class17) field420.method3536()) {
            if (var0.field231 == -1) {
                var0.field220 = 0;
                method762(var0);
            } else {
                var0.method3626();
            }
        }
    }

    @ObfuscatedName("aj.bo(Ls;B)V")
    public static final void method762(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field221 == 0) {
            var1 = Statics.field676.method1796(arg0.field240, arg0.field222, arg0.field226);
        }
        if (arg0.field221 == 1) {
            var1 = Statics.field676.method1797(arg0.field240, arg0.field222, arg0.field226);
        }
        if (arg0.field221 == 2) {
            var1 = Statics.field676.method1798(arg0.field240, arg0.field222, arg0.field226);
        }
        if (arg0.field221 == 3) {
            var1 = Statics.field676.method1799(arg0.field240, arg0.field222, arg0.field226);
        }
        if (var1 != 0) {
            int var5 = Statics.field676.method1800(arg0.field240, arg0.field222, arg0.field226, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field224 = var2;
        arg0.field228 = var3;
        arg0.field225 = var4;
    }

    @ObfuscatedName("fu.bu(IIIIIIII)V")
    public static final void method3160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field291 && Statics.field1181 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field676.method1796(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field676.method1797(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field676.method1798(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field676.method1799(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field676.method1800(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field676.method1913(arg0, arg2, arg3);
                class41 var15 = class41.method1767(var12);
                if (var15.field938 != 0) {
                    field348[arg0].method2258(arg2, arg3, var13, var14, var15.field939);
                }
            }
            if (arg1 == 1) {
                Statics.field676.method1788(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field676.method1846(arg0, arg2, arg3);
                class41 var16 = class41.method1767(var12);
                if (var16.field936 + arg2 > 103 || var16.field936 + arg3 > 103 || var16.field937 + arg2 > 103 || var16.field937 + arg3 > 103) {
                    return;
                }
                if (var16.field938 != 0) {
                    field348[arg0].method2235(arg2, arg3, var16.field936, var16.field937, var14, var16.field939);
                }
            }
            if (arg1 == 3) {
                Statics.field676.method1814(arg0, arg2, arg3);
                class41 var17 = class41.method1767(var12);
                if (var17.field938 == 1) {
                    field348[arg0].method2238(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field76[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class86 var19 = Statics.field676;
        class108 var20 = field348[arg0];
        class41 var21 = class41.method1767(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field937;
            var23 = var21.field936;
        } else {
            var22 = var21.field936;
            var23 = var21.field937;
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
        int[][] var28 = class6.field74[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field940 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field961 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class85 var34;
            if (var21.field944 == -1 && var21.field962 == null) {
                var34 = var21.method812(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field944, true, (class85) null);
            }
            var19.method1776(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field938 == 1) {
                var20.method2228(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class85 var57;
            if (var21.field944 == -1 && var21.field962 == null) {
                var57 = var21.method812(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field944, true, (class85) null);
            }
            if (var57 != null) {
                var19.method1895(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field938 != 0) {
                var20.method2231(arg2, arg3, var22, var23, var21.field939);
            }
        } else if (arg6 >= 12) {
            class85 var35;
            if (var21.field944 == -1 && var21.field962 == null) {
                var35 = var21.method812(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field944, true, (class85) null);
            }
            var19.method1895(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field938 != 0) {
                var20.method2231(arg2, arg3, var22, var23, var21.field939);
            }
        } else if (arg6 == 0) {
            class85 var36;
            if (var21.field944 == -1 && var21.field962 == null) {
                var36 = var21.method812(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field944, true, (class85) null);
            }
            var19.method1778(arg0, arg2, arg3, var29, var36, (class85) null, class6.field93[arg5], 0, var32, var33);
            if (var21.field938 != 0) {
                var20.method2230(arg2, arg3, arg6, arg5, var21.field939);
            }
        } else if (arg6 == 1) {
            class85 var37;
            if (var21.field944 == -1 && var21.field962 == null) {
                var37 = var21.method812(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field944, true, (class85) null);
            }
            var19.method1778(arg0, arg2, arg3, var29, var37, (class85) null, class6.field94[arg5], 0, var32, var33);
            if (var21.field938 != 0) {
                var20.method2230(arg2, arg3, arg6, arg5, var21.field939);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class85 var39;
            class85 var40;
            if (var21.field944 == -1 && var21.field962 == null) {
                var39 = var21.method812(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method812(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field944, true, (class85) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field944, true, (class85) null);
            }
            var19.method1778(arg0, arg2, arg3, var29, var39, var40, class6.field93[arg5], class6.field93[var38], var32, var33);
            if (var21.field938 != 0) {
                var20.method2230(arg2, arg3, arg6, arg5, var21.field939);
            }
        } else if (arg6 == 3) {
            class85 var41;
            if (var21.field944 == -1 && var21.field962 == null) {
                var41 = var21.method812(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field944, true, (class85) null);
            }
            var19.method1778(arg0, arg2, arg3, var29, var41, (class85) null, class6.field94[arg5], 0, var32, var33);
            if (var21.field938 != 0) {
                var20.method2230(arg2, arg3, arg6, arg5, var21.field939);
            }
        } else if (arg6 == 9) {
            class85 var42;
            if (var21.field944 == -1 && var21.field962 == null) {
                var42 = var21.method812(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field944, true, (class85) null);
            }
            var19.method1895(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field938 != 0) {
                var20.method2231(arg2, arg3, var22, var23, var21.field939);
            }
        } else if (arg6 == 4) {
            class85 var43;
            if (var21.field944 == -1 && var21.field962 == null) {
                var43 = var21.method812(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field944, true, (class85) null);
            }
            var19.method1779(arg0, arg2, arg3, var29, var43, (class85) null, class6.field93[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1796(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class41.method1767(var45 >> 14 & 0x7FFF).field943;
            }
            class85 var46;
            if (var21.field944 == -1 && var21.field962 == null) {
                var46 = var21.method812(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field944, true, (class85) null);
            }
            var19.method1779(arg0, arg2, arg3, var29, var46, (class85) null, class6.field93[arg5], 0, class6.field81[arg5] * var44, class6.field82[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1796(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class41.method1767(var48 >> 14 & 0x7FFF).field943 / 2;
            }
            class85 var49;
            if (var21.field944 == -1 && var21.field962 == null) {
                var49 = var21.method812(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field944, true, (class85) null);
            }
            var19.method1779(arg0, arg2, arg3, var29, var49, (class85) null, 256, arg5, class6.field83[arg5] * var47, class6.field84[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class85 var51;
            if (var21.field944 == -1 && var21.field962 == null) {
                var51 = var21.method812(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field944, true, (class85) null);
            }
            var19.method1779(arg0, arg2, arg3, var29, var51, (class85) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1796(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class41.method1767(var53 >> 14 & 0x7FFF).field943 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class85 var55;
            class85 var56;
            if (var21.field944 == -1 && var21.field962 == null) {
                var55 = var21.method812(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method812(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field944, true, (class85) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field944, true, (class85) null);
            }
            var19.method1779(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field83[arg5] * var52, class6.field84[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("bw.bd(III)V")
    public static final void method1080(int arg0, int arg1) {
        class199 var2 = field419[Statics.field1181][arg0][arg1];
        if (var2 == null) {
            Statics.field676.method1881(Statics.field1181, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3534(); var6 != null; var6 = (class29) var2.method3536()) {
            class52 var7 = class52.method970(var6.field682);
            long var8 = (long) var7.field1112;
            if (var7.field1130 == 1) {
                var8 = (long) (var6.field683 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field676.method1881(Statics.field1181, arg0, arg1);
            return;
        }
        var2.method3530(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3534(); var12 != null; var12 = (class29) var2.method3536()) {
            if (var5.field682 != var12.field682) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field682 != var12.field682 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field676.method1909(Statics.field1181, arg0, arg1, method2950(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1181), var5, var13, var10, var11);
    }

    @ObfuscatedName("k.bm(ZI)V")
    public static final void method583(boolean arg0) {
        field412 = 0;
        field327 = 0;
        method1090();
        method596(arg0);
        method2573();
        for (int var1 = 0; var1 < field412; var1++) {
            int var2 = field413[var1];
            if (field290 != field324[var2].field858) {
                field324[var2].field779 = null;
                field324[var2] = null;
            }
        }
        if (field333 != field332.field1980) {
            throw new RuntimeException(field332.field1980 + class2.field21 + field333);
        }
        for (int var3 = 0; var3 < field325; var3++) {
            if (field324[field326[var3]] == null) {
                throw new RuntimeException(var3 + class2.field21 + field325);
            }
        }
    }

    @ObfuscatedName("bw.bh(B)V")
    public static final void method1090() {
        field332.method2580();
        int var0 = field332.method2589(8);
        if (var0 < field325) {
            for (int var1 = var0; var1 < field325; var1++) {
                field413[++field412 - 1] = field326[var1];
            }
        }
        if (var0 > field325) {
            throw new RuntimeException("");
        }
        field325 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field326[var2];
            class35 var4 = field324[var3];
            int var5 = field332.method2589(1);
            if (var5 == 0) {
                field326[++field325 - 1] = var3;
                var4.field858 = field290;
            } else {
                int var6 = field332.method2589(2);
                if (var6 == 0) {
                    field326[++field325 - 1] = var3;
                    var4.field858 = field290;
                    field328[++field327 - 1] = var3;
                } else if (var6 == 1) {
                    field326[++field325 - 1] = var3;
                    var4.field858 = field290;
                    int var7 = field332.method2589(3);
                    var4.method733(var7, (byte) 1);
                    int var8 = field332.method2589(1);
                    if (var8 == 1) {
                        field328[++field327 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field326[++field325 - 1] = var3;
                    var4.field858 = field290;
                    int var9 = field332.method2589(3);
                    var4.method733(var9, (byte) 2);
                    int var10 = field332.method2589(3);
                    var4.method733(var10, (byte) 2);
                    int var11 = field332.method2589(1);
                    if (var11 == 1) {
                        field328[++field327 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field413[++field412 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("j.bn(ZB)V")
    public static final void method596(boolean arg0) {
        while (true) {
            if (field332.method2583(field333) >= 27) {
                int var1 = field332.method2589(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field324[var1] == null) {
                        field324[var1] = new class35();
                        var2 = true;
                    }
                    class35 var3 = field324[var1];
                    field326[++field325 - 1] = var1;
                    var3.field858 = field290;
                    int var4 = field417[field332.method2589(3)];
                    if (var2) {
                        var3.field860 = var3.field812 = var4;
                    }
                    var3.field779 = class40.method2940(field332.method2589(14));
                    int var5 = field332.method2589(1);
                    int var6;
                    if (arg0) {
                        var6 = field332.method2589(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = field332.method2589(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    int var7;
                    if (arg0) {
                        var7 = field332.method2589(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = field332.method2589(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    int var8 = field332.method2589(1);
                    if (var8 == 1) {
                        field328[++field327 - 1] = var1;
                    }
                    var3.field853 = var3.field779.field906;
                    var3.field862 = var3.field779.field881;
                    if (var3.field862 == 0) {
                        var3.field812 = 0;
                    }
                    var3.field818 = var3.field779.field899;
                    var3.field819 = var3.field779.field894;
                    var3.field829 = var3.field779.field895;
                    var3.field821 = var3.field779.field916;
                    var3.field815 = var3.field779.field890;
                    var3.field855 = var3.field779.field891;
                    var3.field817 = var3.field779.field904;
                    var3.method734(Statics.field1544.field857[0] + var6, Statics.field1544.field865[0] + var7, var5 == 1);
                    continue;
                }
            }
            field332.method2582();
            return;
        }
    }

    @ObfuscatedName("df.bk(I)V")
    public static final void method2573() {
        for (int var0 = 0; var0 < field327; var0++) {
            int var1 = field328[var0];
            class35 var2 = field324[var1];
            int var3 = field332.method2380();
            if ((var3 & 0x1) != 0) {
                int var4 = field332.method2372();
                int var5 = field332.method2371();
                var2.method754(var4, var5, field290);
                var2.field832 = field290 + 300;
                var2.field833 = field332.method2430();
                var2.field816 = field332.method2347();
            }
            if ((var3 & 0x40) != 0) {
                var2.field779 = class40.method2940(field332.method2379());
                var2.field853 = var2.field779.field906;
                var2.field862 = var2.field779.field881;
                var2.field818 = var2.field779.field899;
                var2.field819 = var2.field779.field894;
                var2.field829 = var2.field779.field895;
                var2.field821 = var2.field779.field916;
                var2.field815 = var2.field779.field890;
                var2.field855 = var2.field779.field891;
                var2.field817 = var2.field779.field904;
            }
            if ((var3 & 0x8) != 0) {
                int var6 = field332.method2381();
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = field332.method2371();
                if (var2.field841 == var6 && var6 != -1) {
                    int var8 = class43.method2299(var6).field995;
                    if (var8 == 1) {
                        var2.field842 = 0;
                        var2.field820 = 0;
                        var2.field844 = var7;
                        var2.field845 = 0;
                    }
                    if (var8 == 2) {
                        var2.field845 = 0;
                    }
                } else if (var6 == -1 || var2.field841 == -1 || class43.method2299(var6).field996 >= class43.method2299(var2.field841).field996) {
                    var2.field841 = var6;
                    var2.field842 = 0;
                    var2.field820 = 0;
                    var2.field844 = var7;
                    var2.field845 = 0;
                    var2.field824 = var2.field863;
                }
            }
            if ((var3 & 0x20) != 0) {
                int var9 = field332.method2371();
                int var10 = field332.method2371();
                var2.method754(var9, var10, field290);
                var2.field832 = field290 + 300;
                var2.field833 = field332.method2430();
                var2.field816 = field332.method2430();
            }
            if ((var3 & 0x2) != 0) {
                var2.field836 = field332.method2379();
                if (var2.field836 == 65535) {
                    var2.field836 = -1;
                }
            }
            if ((var3 & 0x80) != 0) {
                var2.field843 = field332.method2379();
                int var11 = field332.method2350();
                var2.field850 = var11 >> 16;
                var2.field849 = (var11 & 0xFFFF) + field290;
                var2.field847 = 0;
                var2.field848 = 0;
                if (var2.field849 > field290) {
                    var2.field847 = -1;
                }
                if (var2.field843 == 65535) {
                    var2.field843 = -1;
                }
            }
            if ((var3 & 0x10) != 0) {
                var2.field823 = field332.method2356();
                var2.field826 = 100;
            }
            if ((var3 & 0x4) != 0) {
                int var12 = field332.method2430();
                int var13 = field332.method2347();
                int var14 = var2.field866 - (var12 - Statics.field1201 - Statics.field1201) * 64;
                int var15 = var2.field814 - (var13 - Statics.field1150 - Statics.field1150) * 64;
                if (var14 != 0 || var15 != 0) {
                    var2.field837 = (int) (Math.atan2((double) var14, (double) var15) * 325.949D) & 0x7FF;
                }
            }
        }
    }

    @ObfuscatedName("g.be(Lr;IIBI)V")
    public static final void method170(class3 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field857[0];
        int var5 = arg0.field865[0];
        int var6 = arg0.method42();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = class106.method1038(var4, var5, arg0.method42(), method2020(arg1, arg2), field348[arg0.field38], true, field567, field294);
        if (var7 >= 1) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg0.method21(field567[var8], field294[var8], arg3);
            }
        }
    }

    @ObfuscatedName("cv.bv(IIB)Ldn;")
    public static class107 method2020(int arg0, int arg1) {
        field518.field1864 = arg0;
        field518.field1861 = arg1;
        field518.field1860 = 1;
        field518.field1865 = 1;
        return field518;
    }

    @ObfuscatedName("bn.bc(III)V")
    public static final void method1498(int arg0, int arg1) {
        if (field428 < 2 && field484 == 0 && !field491) {
            return;
        }
        String var2;
        if (field484 == 1 && field428 < 2) {
            var2 = class157.field2435 + class157.field2460 + field440 + " " + class2.field22;
        } else if (field491 && field428 < 2) {
            var2 = field520 + class157.field2460 + field445 + " " + class2.field22;
        } else {
            int var3 = field428 - 1;
            String var4;
            if (field468[var3].length() > 0) {
                var4 = field553[var3] + class157.field2460 + field468[var3];
            } else {
                var4 = field553[var3];
            }
            var2 = var4;
        }
        if (field428 > 2) {
            var2 = var2 + class2.method2933(16777215) + " " + '/' + " " + (field428 - 2) + class157.field2454;
        }
        Statics.field1516.method3740(var2, arg0 + 4, arg1 + 15, 16777215, 0, field290 / 1000);
    }

    @ObfuscatedName("aj.bp(IIIII)V")
    public static final void method760(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field489; var4++) {
            if (field496[var4] + field323[var4] > arg0 && field323[var4] < arg0 + arg2 && field495[var4] + field479[var4] > arg1 && field495[var4] < arg1 + arg3) {
                field559[var4] = true;
            }
        }
    }

    @ObfuscatedName("u.ck(IIIIB)V")
    public static final void method213(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field489; var4++) {
            if (field496[var4] + field323[var4] > arg0 && field323[var4] < arg0 + arg2 && field495[var4] + field479[var4] > arg1 && field495[var4] < arg1 + arg3) {
                field480[var4] = true;
            }
        }
    }

    @ObfuscatedName("hh.cs(III)V")
    public static final void method3650(int arg0, int arg1) {
        int var2 = Statics.field1516.method3729(class157.field2453);
        for (int var3 = 0; var3 < field428; var3++) {
            class224 var4 = Statics.field1516;
            String var5;
            if (field468[var3].length() > 0) {
                var5 = field553[var3] + class157.field2460 + field468[var3];
            } else {
                var5 = field553[var3];
            }
            int var6 = var4.method3729(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field428 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field63) {
            var8 = Statics.field63 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field686) {
            var9 = Statics.field686 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field310 = true;
        Statics.field2588 = var8;
        Statics.field1869 = var9;
        Statics.field2298 = var2;
        Statics.field601 = field428 * 15 + 22;
    }

    @ObfuscatedName("au.ca(II)Z")
    public static final boolean method649(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field431[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("j.cr(II)V")
    public static final void method592(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field429[arg0];
        int var2 = field430[arg0];
        int var3 = field431[arg0];
        int var4 = field306[arg0];
        String var5 = field553[arg0];
        String var6 = field468[arg0];
        method599(var1, var2, var3, var4, var5, var6, class140.field2133, class140.field2131);
    }

    @ObfuscatedName("cy.cu(Laz;III)V")
    public static final void method1765(class31 arg0, int arg1, int arg2) {
        method599(arg0.field705, arg0.field711, arg0.field706, arg0.field707, arg0.field708, arg0.field708, arg1, arg2);
    }

    @ObfuscatedName("j.cd(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method599(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 37) {
            field330.method2578(65);
            field330.method2331(arg0);
            field330.method2333(arg1);
            field330.method2378(arg3);
            field400 = 0;
            Statics.field266 = class173.method2966(arg1);
            field477 = arg0;
        }
        if (arg2 == 31) {
            field330.method2578(128);
            field330.method2378(arg3);
            field330.method2365(Statics.field2094);
            field330.method2505(Statics.field781);
            field330.method2341(arg1);
            field330.method2339(arg0);
            field330.method2365(Statics.field2135);
            field400 = 0;
            Statics.field266 = class173.method2966(arg1);
            field477 = arg0;
        }
        if (arg2 == 21) {
            field549 = arg6;
            field427 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field330.method2578(201);
            field330.method2370(class137.field2107[82] ? 1 : 0);
            field330.method2378(arg3);
            field330.method2331(Statics.field1201 + arg0);
            field330.method2331(Statics.field1150 + arg1);
        }
        if (arg2 == 1) {
            field549 = arg6;
            field427 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field330.method2578(226);
            field330.method2339(Statics.field1150 + arg1);
            field330.method2365(Statics.field2094);
            field330.method2378(Statics.field1201 + arg0);
            field330.method2341(Statics.field781);
            field330.method2339(Statics.field2135);
            field330.method2370(class137.field2107[82] ? 1 : 0);
            field330.method2339(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 2) {
            field549 = arg6;
            field427 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field330.method2578(143);
            field330.method2368(class137.field2107[82] ? 1 : 0);
            field330.method2333(Statics.field1968);
            field330.method2331(Statics.field1150 + arg1);
            field330.method2331(Statics.field1201 + arg0);
            field330.method2339(field442);
            field330.method2378(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 38) {
            method2948();
            class173 var8 = class173.method2966(arg1);
            field484 = 1;
            Statics.field2135 = arg0;
            Statics.field781 = arg1;
            Statics.field2094 = arg3;
            method2951(var8);
            field440 = class2.method2933(16748608) + class52.method970(arg3).field1119 + class2.method2933(16777215);
            if (field440 == null) {
                field440 = "null";
            }
            return;
        }
        if (arg2 == 46) {
            class3 var9 = field409[arg3];
            if (var9 != null) {
                field549 = arg6;
                field427 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field330.method2578(179);
                field330.method2339(arg3);
                field330.method2370(class137.field2107[82] ? 1 : 0);
            }
        }
        if (arg2 == 40) {
            field330.method2578(157);
            field330.method2365(arg3);
            field330.method2384(arg1);
            field330.method2378(arg0);
            field400 = 0;
            Statics.field266 = class173.method2966(arg1);
            field477 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class173 var10 = class173.method3127(arg1, arg0);
            if (var10 != null) {
                int var11 = var10.field2859;
                class173 var12 = class173.method3127(arg1, arg0);
                if (var12 != null) {
                    if (var12.field2783 != null) {
                        class1 var13 = new class1();
                        var13.field3 = var12;
                        var13.field6 = arg3;
                        var13.field4 = arg5;
                        var13.field12 = var12.field2783;
                        class37.method571(var13, 200000);
                    }
                    boolean var14 = true;
                    if (var12.field2745 > 0) {
                        var14 = method89(var12);
                    }
                    if (var14) {
                        int var15 = method217(var12);
                        int var16 = arg3 - 1;
                        boolean var17 = (var15 >> var16 + 1 & 0x1) != 0;
                        if (var17) {
                            if (arg3 == 1) {
                                field330.method2578(110);
                                field330.method2333(arg1);
                                field330.method2331(arg0);
                                field330.method2331(var11);
                            }
                            if (arg3 == 2) {
                                field330.method2578(139);
                                field330.method2333(arg1);
                                field330.method2331(arg0);
                                field330.method2331(var11);
                            }
                            if (arg3 == 3) {
                                field330.method2578(39);
                                field330.method2333(arg1);
                                field330.method2331(arg0);
                                field330.method2331(var11);
                            }
                            if (arg3 == 4) {
                                field330.method2578(54);
                                field330.method2333(arg1);
                                field330.method2331(arg0);
                                field330.method2331(var11);
                            }
                            if (arg3 == 5) {
                                field330.method2578(130);
                                field330.method2333(arg1);
                                field330.method2331(arg0);
                                field330.method2331(var11);
                            }
                            if (arg3 == 6) {
                                field330.method2578(154);
                                field330.method2333(arg1);
                                field330.method2331(arg0);
                                field330.method2331(var11);
                            }
                            if (arg3 == 7) {
                                field330.method2578(67);
                                field330.method2333(arg1);
                                field330.method2331(arg0);
                                field330.method2331(var11);
                            }
                            if (arg3 == 8) {
                                field330.method2578(196);
                                field330.method2333(arg1);
                                field330.method2331(arg0);
                                field330.method2331(var11);
                            }
                            if (arg3 == 9) {
                                field330.method2578(202);
                                field330.method2333(arg1);
                                field330.method2331(arg0);
                                field330.method2331(var11);
                            }
                            if (arg3 == 10) {
                                field330.method2578(237);
                                field330.method2333(arg1);
                                field330.method2331(arg0);
                                field330.method2331(var11);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 22) {
            field549 = arg6;
            field427 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field330.method2578(49);
            field330.method2339(Statics.field1150 + arg1);
            field330.method2370(class137.field2107[82] ? 1 : 0);
            field330.method2378(Statics.field1201 + arg0);
            field330.method2331(arg3);
        }
        if (arg2 == 23) {
            Statics.field676.method1807(Statics.field1181, arg0, arg1);
        }
        if (arg2 == 11) {
            class35 var18 = field324[arg3];
            if (var18 != null) {
                field549 = arg6;
                field427 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field330.method2578(51);
                field330.method2417(class137.field2107[82] ? 1 : 0);
                field330.method2331(arg3);
            }
        }
        if (arg2 == 16) {
            field549 = arg6;
            field427 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field330.method2578(112);
            field330.method2339(Statics.field2094);
            field330.method2365(Statics.field1150 + arg1);
            field330.method2339(Statics.field2135);
            field330.method2436(class137.field2107[82] ? 1 : 0);
            field330.method2339(Statics.field1201 + arg0);
            field330.method2339(arg3);
            field330.method2384(Statics.field781);
        }
        if (arg2 == 12) {
            class35 var19 = field324[arg3];
            if (var19 != null) {
                field549 = arg6;
                field427 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field330.method2578(173);
                field330.method2365(arg3);
                field330.method2436(class137.field2107[82] ? 1 : 0);
            }
        }
        if (arg2 == 51) {
            class3 var20 = field409[arg3];
            if (var20 != null) {
                field549 = arg6;
                field427 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field330.method2578(144);
                field330.method2378(arg3);
                field330.method2370(class137.field2107[82] ? 1 : 0);
            }
        }
        if (arg2 == 9) {
            class35 var21 = field324[arg3];
            if (var21 != null) {
                field549 = arg6;
                field427 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field330.method2578(85);
                field330.method2378(arg3);
                field330.method2368(class137.field2107[82] ? 1 : 0);
            }
        }
        if (arg2 == 13) {
            class35 var22 = field324[arg3];
            if (var22 != null) {
                field549 = arg6;
                field427 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field330.method2578(187);
                field330.method2436(class137.field2107[82] ? 1 : 0);
                field330.method2365(arg3);
            }
        }
        if (arg2 == 58) {
            class173 var23 = class173.method3127(arg1, arg0);
            if (var23 != null) {
                field330.method2578(11);
                field330.method2339(field442);
                field330.method2365(arg0);
                field330.method2505(Statics.field1968);
                field330.method2365(field365);
                field330.method2365(var23.field2859);
                field330.method2384(arg1);
            }
        }
        if (arg2 == 18) {
            field549 = arg6;
            field427 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field330.method2578(204);
            field330.method2339(arg3);
            field330.method2365(Statics.field1201 + arg0);
            field330.method2436(class137.field2107[82] ? 1 : 0);
            field330.method2365(Statics.field1150 + arg1);
        }
        if (arg2 == 48) {
            class3 var24 = field409[arg3];
            if (var24 != null) {
                field549 = arg6;
                field427 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field330.method2578(127);
                field330.method2417(class137.field2107[82] ? 1 : 0);
                field330.method2365(arg3);
            }
        }
        if (arg2 == 1003) {
            field549 = arg6;
            field427 = arg7;
            field399 = 2;
            field398 = 0;
            class35 var25 = field324[arg3];
            if (var25 != null) {
                class40 var26 = var25.field779;
                if (var26.field911 != null) {
                    var26 = var26.method776();
                }
                if (var26 != null) {
                    field330.method2578(236);
                    field330.method2339(var26.field885);
                }
            }
        }
        if (arg2 == 24) {
            class173 var27 = class173.method2966(arg1);
            boolean var28 = true;
            if (var27.field2745 > 0) {
                var28 = method89(var27);
            }
            if (var28) {
                field330.method2578(120);
                field330.method2333(arg1);
            }
        }
        if (arg2 == 32) {
            field330.method2578(92);
            field330.method2384(Statics.field1968);
            field330.method2339(arg0);
            field330.method2384(arg1);
            field330.method2339(arg3);
            field330.method2339(field442);
            field400 = 0;
            Statics.field266 = class173.method2966(arg1);
            field477 = arg0;
        }
        if (arg2 == 43) {
            field330.method2578(129);
            field330.method2365(arg0);
            field330.method2505(arg1);
            field330.method2331(arg3);
            field400 = 0;
            Statics.field266 = class173.method2966(arg1);
            field477 = arg0;
        }
        if (arg2 == 1002) {
            field549 = arg6;
            field427 = arg7;
            field399 = 2;
            field398 = 0;
            field330.method2578(152);
            field330.method2339(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 4) {
            field549 = arg6;
            field427 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field330.method2578(93);
            field330.method2331(arg3 >> 14 & 0x7FFF);
            field330.method2368(class137.field2107[82] ? 1 : 0);
            field330.method2378(Statics.field1201 + arg0);
            field330.method2378(Statics.field1150 + arg1);
        }
        if (arg2 == 1001) {
            field549 = arg6;
            field427 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field330.method2578(146);
            field330.method2365(Statics.field1201 + arg0);
            field330.method2339(Statics.field1150 + arg1);
            field330.method2370(class137.field2107[82] ? 1 : 0);
            field330.method2378(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 47) {
            class3 var29 = field409[arg3];
            if (var29 != null) {
                field549 = arg6;
                field427 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field330.method2578(207);
                field330.method2436(class137.field2107[82] ? 1 : 0);
                field330.method2339(arg3);
            }
        }
        if (arg2 == 15) {
            class3 var30 = field409[arg3];
            if (var30 != null) {
                field549 = arg6;
                field427 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field330.method2578(109);
                field330.method2331(arg3);
                field330.method2333(Statics.field1968);
                field330.method2331(field442);
                field330.method2436(class137.field2107[82] ? 1 : 0);
            }
        }
        if (arg2 == 49) {
            class3 var31 = field409[arg3];
            if (var31 != null) {
                field549 = arg6;
                field427 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field330.method2578(231);
                field330.method2365(arg3);
                field330.method2417(class137.field2107[82] ? 1 : 0);
            }
        }
        if (arg2 == 26) {
            field330.method2578(208);
            for (class4 var32 = (class4) field447.method3506(); var32 != null; var32 = (class4) field447.method3500()) {
                if (var32.field60 == 0 || var32.field60 == 3) {
                    method101(var32, true);
                }
            }
            if (field450 != null) {
                method2951(field450);
                field450 = null;
            }
        }
        if (arg2 == 8) {
            class35 var33 = field324[arg3];
            if (var33 != null) {
                field549 = arg6;
                field427 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field330.method2578(183);
                field330.method2331(arg3);
                field330.method2339(field442);
                field330.method2370(class137.field2107[82] ? 1 : 0);
                field330.method2505(Statics.field1968);
            }
        }
        if (arg2 == 50) {
            class3 var34 = field409[arg3];
            if (var34 != null) {
                field549 = arg6;
                field427 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field330.method2578(235);
                field330.method2417(class137.field2107[82] ? 1 : 0);
                field330.method2365(arg3);
            }
        }
        if (arg2 == 39) {
            field330.method2578(222);
            field330.method2384(arg1);
            field330.method2378(arg3);
            field330.method2339(arg0);
            field400 = 0;
            Statics.field266 = class173.method2966(arg1);
            field477 = arg0;
        }
        if (arg2 == 34) {
            field330.method2578(66);
            field330.method2339(arg3);
            field330.method2378(arg0);
            field330.method2341(arg1);
            field400 = 0;
            Statics.field266 = class173.method2966(arg1);
            field477 = arg0;
        }
        if (arg2 == 20) {
            field549 = arg6;
            field427 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field330.method2578(20);
            field330.method2436(class137.field2107[82] ? 1 : 0);
            field330.method2365(Statics.field1201 + arg0);
            field330.method2378(arg3);
            field330.method2339(Statics.field1150 + arg1);
        }
        if (arg2 == 6) {
            field549 = arg6;
            field427 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field330.method2578(155);
            field330.method2368(class137.field2107[82] ? 1 : 0);
            field330.method2339(arg3 >> 14 & 0x7FFF);
            field330.method2378(Statics.field1150 + arg1);
            field330.method2378(Statics.field1201 + arg0);
        }
        if (arg2 == 41) {
            field330.method2578(103);
            field330.method2339(arg3);
            field330.method2378(arg0);
            field330.method2384(arg1);
            field400 = 0;
            Statics.field266 = class173.method2966(arg1);
            field477 = arg0;
        }
        if (arg2 == 28) {
            field330.method2578(120);
            field330.method2333(arg1);
            class173 var35 = class173.method2966(arg1);
            if (var35.field2837 != null && var35.field2837[0][0] == 5) {
                int var36 = var35.field2837[0][1];
                class176.field2886[var36] = 1 - class176.field2886[var36];
                method1218(var36);
            }
        }
        if (arg2 == 7) {
            class35 var37 = field324[arg3];
            if (var37 != null) {
                field549 = arg6;
                field427 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field330.method2578(12);
                field330.method2378(arg3);
                field330.method2331(Statics.field2094);
                field330.method2365(Statics.field2135);
                field330.method2341(Statics.field781);
                field330.method2417(class137.field2107[82] ? 1 : 0);
            }
        }
        if (arg2 == 5) {
            field549 = arg6;
            field427 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field330.method2578(163);
            field330.method2378(arg3 >> 14 & 0x7FFF);
            field330.method2378(Statics.field1201 + arg0);
            field330.method2331(Statics.field1150 + arg1);
            field330.method2368(class137.field2107[82] ? 1 : 0);
        }
        if (arg2 == 35) {
            field330.method2578(121);
            field330.method2339(arg0);
            field330.method2331(arg3);
            field330.method2384(arg1);
            field400 = 0;
            Statics.field266 = class173.method2966(arg1);
            field477 = arg0;
        }
        if (arg2 == 30 && field450 == null) {
            method2721(arg1, arg0);
            field450 = class173.method3127(arg1, arg0);
            method2951(field450);
        }
        if (arg2 == 19) {
            field549 = arg6;
            field427 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field330.method2578(161);
            field330.method2378(arg3);
            field330.method2339(Statics.field1201 + arg0);
            field330.method2339(Statics.field1150 + arg1);
            field330.method2368(class137.field2107[82] ? 1 : 0);
        }
        if (arg2 == 17) {
            field549 = arg6;
            field427 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field330.method2578(101);
            field330.method2339(field442);
            field330.method2365(Statics.field1150 + arg1);
            field330.method2417(class137.field2107[82] ? 1 : 0);
            field330.method2339(arg3);
            field330.method2365(Statics.field1201 + arg0);
            field330.method2384(Statics.field1968);
        }
        if (arg2 == 42) {
            field330.method2578(24);
            field330.method2333(arg1);
            field330.method2365(arg3);
            field330.method2378(arg0);
            field400 = 0;
            Statics.field266 = class173.method2966(arg1);
            field477 = arg0;
        }
        if (arg2 == 33) {
            field330.method2578(117);
            field330.method2333(arg1);
            field330.method2331(arg3);
            field330.method2339(arg0);
            field400 = 0;
            Statics.field266 = class173.method2966(arg1);
            field477 = arg0;
        }
        if (arg2 == 29) {
            field330.method2578(120);
            field330.method2333(arg1);
            class173 var38 = class173.method2966(arg1);
            if (var38.field2837 != null && var38.field2837[0][0] == 5) {
                int var39 = var38.field2837[0][1];
                if (class176.field2886[var39] != var38.field2836[0]) {
                    class176.field2886[var39] = var38.field2836[0];
                    method1218(var39);
                }
            }
        }
        if (arg2 == 36) {
            field330.method2578(171);
            field330.method2365(arg3);
            field330.method2331(arg0);
            field330.method2505(arg1);
            field400 = 0;
            Statics.field266 = class173.method2966(arg1);
            field477 = arg0;
        }
        if (arg2 == 1004) {
            field549 = arg6;
            field427 = arg7;
            field399 = 2;
            field398 = 0;
            field330.method2578(156);
            field330.method2378(arg3);
        }
        if (arg2 == 25) {
            class173 var40 = class173.method3127(arg1, arg0);
            if (var40 != null) {
                method2948();
                int var41 = method217(var40);
                int var42 = var41 >> 11 & 0x3F;
                int var44 = var40.field2859;
                class173 var45 = class173.method3127(arg1, arg0);
                if (var45 != null && var45.field2760 != null) {
                    class1 var46 = new class1();
                    var46.field3 = var45;
                    var46.field12 = var45.field2760;
                    class37.method571(var46, 200000);
                }
                field365 = var44;
                field491 = true;
                Statics.field1968 = arg1;
                field442 = arg0;
                Statics.field233 = var42;
                method2951(var45);
                field484 = 0;
                int var47 = method217(var40);
                int var48 = var47 >> 11 & 0x3F;
                String var49;
                if (var48 == 0) {
                    var49 = null;
                } else if (var40.field2818 == null || var40.field2818.trim().length() == 0) {
                    var49 = null;
                } else {
                    var49 = var40.field2818;
                }
                field520 = var49;
                if (field520 == null) {
                    field520 = "Null";
                }
                if (var40.field2831) {
                    field445 = var40.field2812 + class2.method2933(16777215);
                } else {
                    field445 = class2.method2933(65280) + var40.field2855 + class2.method2933(16777215);
                }
            }
            return;
        }
        if (arg2 == 1005) {
            class173 var50 = class173.method2966(arg1);
            if (var50 == null || var50.field2794[arg0] < 100000) {
                field330.method2578(156);
                field330.method2378(arg3);
            } else {
                class12.method112(27, "", var50.field2794[arg0] + " x " + class52.method970(arg3).field1119);
            }
            field400 = 0;
            Statics.field266 = class173.method2966(arg1);
            field477 = arg0;
        }
        if (arg2 == 3) {
            field549 = arg6;
            field427 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field330.method2578(57);
            field330.method2370(class137.field2107[82] ? 1 : 0);
            field330.method2339(arg3 >> 14 & 0x7FFF);
            field330.method2378(Statics.field1150 + arg1);
            field330.method2339(Statics.field1201 + arg0);
        }
        if (arg2 == 45) {
            class3 var51 = field409[arg3];
            if (var51 != null) {
                field549 = arg6;
                field427 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field330.method2578(131);
                field330.method2339(arg3);
                field330.method2370(class137.field2107[82] ? 1 : 0);
            }
        }
        if (arg2 == 14) {
            class3 var52 = field409[arg3];
            if (var52 != null) {
                field549 = arg6;
                field427 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field330.method2578(91);
                field330.method2331(Statics.field2094);
                field330.method2365(arg3);
                field330.method2368(class137.field2107[82] ? 1 : 0);
                field330.method2378(Statics.field2135);
                field330.method2505(Statics.field781);
            }
        }
        if (arg2 == 10) {
            class35 var53 = field324[arg3];
            if (var53 != null) {
                field549 = arg6;
                field427 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field330.method2578(229);
                field330.method2331(arg3);
                field330.method2436(class137.field2107[82] ? 1 : 0);
            }
        }
        if (arg2 == 44) {
            class3 var54 = field409[arg3];
            if (var54 != null) {
                field549 = arg6;
                field427 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field330.method2578(191);
                field330.method2339(arg3);
                field330.method2436(class137.field2107[82] ? 1 : 0);
            }
        }
        if (field484 != 0) {
            field484 = 0;
            method2951(class173.method2966(Statics.field781));
        }
        if (field491) {
            method2948();
        }
        if (Statics.field266 != null && field400 == 0) {
            method2951(Statics.field266);
        }
    }

    @ObfuscatedName("eq.cy(I)V")
    public static void method2948() {
        if (!field491) {
            return;
        }
        class173 var0 = class173.method3127(Statics.field1968, field442);
        if (var0 != null && var0.field2803 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field12 = var0.field2803;
            class37.method571(var1, 200000);
        }
        field491 = false;
        method2951(var0);
    }

    @ObfuscatedName("ee.co(III)V")
    public static void method2721(int arg0, int arg1) {
        field330.method2578(200);
        field330.method2505(arg0);
        field330.method2378(arg1);
    }

    @ObfuscatedName("dh.ct(B)V")
    public static final void method2269() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field428 - 1; var1++) {
                if (field431[var1] < 1000 && field431[var1 + 1] > 1000) {
                    String var2 = field468[var1];
                    field468[var1] = field468[var1 + 1];
                    field468[var1 + 1] = var2;
                    String var3 = field553[var1];
                    field553[var1] = field553[var1 + 1];
                    field553[var1 + 1] = var3;
                    int var4 = field431[var1];
                    field431[var1] = field431[var1 + 1];
                    field431[var1 + 1] = var4;
                    int var5 = field429[var1];
                    field429[var1] = field429[var1 + 1];
                    field429[var1 + 1] = var5;
                    int var6 = field430[var1];
                    field430[var1] = field430[var1 + 1];
                    field430[var1 + 1] = var6;
                    int var7 = field306[var1];
                    field306[var1] = field306[var1 + 1];
                    field306[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("aj.cf(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method763(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field310 || field428 >= 500) {
            return;
        }
        field553[field428] = arg0;
        field468[field428] = arg1;
        field431[field428] = arg2;
        field306[field428] = arg3;
        field429[field428] = arg4;
        field430[field428] = arg5;
        field428++;
    }

    @ObfuscatedName("z.ch(I)V")
    public static void method146() {
        for (int var0 = 0; var0 < field428; var0++) {
            int var1 = field431[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field428 - 1) {
                    for (int var3 = var0; var3 < field428 - 1; var3++) {
                        field553[var3] = field553[var3 + 1];
                        field468[var3] = field468[var3 + 1];
                        field431[var3] = field431[var3 + 1];
                        field306[var3] = field306[var3 + 1];
                        field429[var3] = field429[var3 + 1];
                        field430[var3] = field430[var3 + 1];
                    }
                }
                field428--;
            }
        }
    }

    @ObfuscatedName("ad.cq(Lay;IIIB)V")
    public static final void method1072(class40 arg0, int arg1, int arg2, int arg3) {
        if (field428 >= 400) {
            return;
        }
        if (arg0.field911 != null) {
            arg0 = arg0.method776();
        }
        if (arg0 == null || !arg0.field914 || arg0.field887 && field356 != arg1) {
            return;
        }
        String var4 = arg0.field919;
        if (arg0.field903 != 0) {
            var4 = var4 + method143(arg0.field903, Statics.field1544.field33) + " " + class2.field24 + class157.field2456 + arg0.field903 + class2.field17;
        }
        if (field484 == 1) {
            method763(class157.field2435, field440 + " " + class2.field22 + " " + class2.method2933(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field491) {
            String[] var5 = arg0.field901;
            if (field457) {
                var5 = method1757(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class157.field2452)) {
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
                        method763(var5[var6], class2.method2933(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class157.field2452)) {
                        short var9 = 0;
                        if (field313 == class21.field574 || field313 == class21.field575 && arg0.field903 > Statics.field1544.field33) {
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
                        method763(var5[var8], class2.method2933(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method763(class157.field2353, class2.method2933(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field233 & 0x2) == 2) {
            method763(field520, field445 + " " + class2.field22 + " " + class2.method2933(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ch.cm(Lr;IIIB)V")
    public static final void method1945(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1544 == arg0 || field428 >= 400) {
            return;
        }
        String var4;
        if (arg0.field51 == 0) {
            var4 = arg0.field35 + method143(arg0.field33, Statics.field1544.field33) + " " + class2.field24 + class157.field2456 + arg0.field33 + class2.field17;
        } else {
            var4 = arg0.field35 + " " + class2.field24 + class157.field2415 + arg0.field51 + class2.field17;
        }
        if (field484 == 1) {
            method763(class157.field2435, field440 + " " + class2.field22 + " " + class2.method2933(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field491) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field415[var5] != null) {
                    short var6 = 0;
                    if (field415[var5].equalsIgnoreCase(class157.field2452)) {
                        if (field313 == class21.field574 || field313 == class21.field575 && arg0.field33 > Statics.field1544.field33) {
                            var6 = 2000;
                        }
                        if (Statics.field1544.field34 != 0 && arg0.field34 != 0) {
                            if (Statics.field1544.field34 == arg0.field34) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field448[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field414[var5] + var6;
                    method763(field415[var5], class2.method2933(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field233 & 0x8) == 8) {
            method763(field520, field445 + " " + class2.field22 + " " + class2.method2933(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field428; var9++) {
            if (field431[var9] == 23) {
                field468[var9] = class2.method2933(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("z.cv(IIB)Ljava/lang/String;")
    public static final String method143(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method2933(16711680);
        } else if (var2 < -6) {
            return class2.method2933(16723968);
        } else if (var2 < -3) {
            return class2.method2933(16740352);
        } else if (var2 < 0) {
            return class2.method2933(16756736);
        } else if (var2 > 9) {
            return class2.method2933(65280);
        } else if (var2 > 6) {
            return class2.method2933(4259584);
        } else if (var2 > 3) {
            return class2.method2933(8453888);
        } else if (var2 > 0) {
            return class2.method2933(12648192);
        } else {
            return class2.method2933(16776960);
        }
    }

    @ObfuscatedName("be.cj(IIIIIIIII)V")
    public static final void method1523(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class173.method2289(arg0)) {
            Statics.field1402 = null;
            method116(Statics.field2801[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1402 != null) {
                method116(Statics.field1402, -1412584499, arg1, arg2, arg3, arg4, Statics.field648, Statics.field658, arg7);
                Statics.field1402 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field559[var8] = true;
            }
        } else {
            field559[arg7] = true;
        }
    }

    @ObfuscatedName("y.cb([Lfr;IIIIIIIII)V")
    public static final void method116(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1734(arg2, arg3, arg4, arg5);
        class91.method1951();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class173 var10 = arg0[var9];
            if (var10 != null && (var10.field2829 == arg1 || arg1 == -1412584499 && field459 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field323[field489] = var10.field2754 + arg6;
                    field495[field489] = var10.field2748 + arg7;
                    field496[field489] = var10.field2756;
                    field479[field489] = var10.field2872;
                    var11 = ++field489 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2769 = var11;
                var10.field2871 = field290;
                if (!var10.field2831 || !method643(var10)) {
                    if (var10.field2745 > 0) {
                        method3018(var10);
                    }
                    int var12 = var10.field2754 + arg6;
                    int var13 = var10.field2748 + arg7;
                    int var14 = var10.field2771;
                    if (field459 == var10) {
                        if (arg1 != -1412584499 && !var10.field2817) {
                            Statics.field1402 = arg0;
                            Statics.field648 = arg6;
                            Statics.field658 = arg7;
                            continue;
                        }
                        if (field535 && field464) {
                            int var15 = class140.field2146;
                            int var16 = class140.field2136;
                            int var17 = var15 - field562;
                            int var18 = var16 - field462;
                            if (var17 < field387) {
                                var17 = field387;
                            }
                            if (var10.field2756 + var17 > field387 + field497.field2756) {
                                var17 = field387 + field497.field2756 - var10.field2756;
                            }
                            if (var18 < field466) {
                                var18 = field466;
                            }
                            if (var10.field2872 + var18 > field466 + field497.field2872) {
                                var18 = field466 + field497.field2872 - var10.field2872;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2817) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2743 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2743 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2756 + var12;
                        int var26 = var10.field2872 + var13;
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
                        int var29 = var10.field2756 + var12;
                        int var30 = var10.field2872 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2831 || var19 < var21 && var20 < var22) {
                        if (var10.field2745 != 0) {
                            if (var10.field2745 == 1336) {
                                if (field302) {
                                    var13 += 15;
                                    Statics.field1946.method3780("Fps:" + field2174, var10.field2756 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field291) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field291) {
                                        var33 = 16711680;
                                    }
                                    Statics.field1946.method3780("Mem:" + var32 + "k", var10.field2756 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2745 == 1337) {
                                field435 = var12;
                                field436 = var13;
                                method871(var12, var13, var10.field2756, var10.field2872);
                                field559[var10.field2769] = true;
                                class80.method1734(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2745 == 1338) {
                                method2612(var10, var12, var13, var11);
                                class80.method1734(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2745 == 1339) {
                                class175 var34 = var10.method3198(false);
                                if (var34 != null) {
                                    if (field494 < 3) {
                                        Statics.field184.method1607(var12, var13, var34.field2881, var34.field2882, 25, 25, field373, 256, var34.field2883, var34.field2880);
                                    } else {
                                        class80.method1701(var12, var13, 0, var34.field2883, var34.field2880);
                                    }
                                }
                                class80.method1734(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2743 == 0) {
                            if (!var10.field2831 && method643(var10) && Statics.field129 != var10) {
                                continue;
                            }
                            if (!var10.field2831) {
                                if (var10.field2763 > var10.field2765 - var10.field2872) {
                                    var10.field2763 = var10.field2765 - var10.field2872;
                                }
                                if (var10.field2763 < 0) {
                                    var10.field2763 = 0;
                                }
                            }
                            method116(arg0, var10.field2741, var19, var20, var21, var22, var12 - var10.field2842, var13 - var10.field2763, var11);
                            if (var10.field2863 != null) {
                                method116(var10.field2863, var10.field2741, var19, var20, var21, var22, var12 - var10.field2842, var13 - var10.field2763, var11);
                            }
                            class4 var35 = (class4) field447.method3496((long) var10.field2741);
                            if (var35 != null) {
                                method1523(var35.field58, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class80.method1734(arg2, arg3, arg4, arg5);
                            class91.method1951();
                        }
                        if (field500 || field493[var11] || field498 > 1) {
                            if (var10.field2743 == 0 && !var10.field2831 && var10.field2765 > var10.field2872) {
                                int var36 = var10.field2756 + var12;
                                int var37 = var10.field2763;
                                int var38 = var10.field2872;
                                int var39 = var10.field2765;
                                Statics.field2020[0].method1736(var36, var13);
                                Statics.field2020[1].method1736(var36, var13 + var38 - 16);
                                class80.method1692(var36, var13 + 16, 16, var38 - 32, field297);
                                int var40 = (var38 - 32) * var38 / var39;
                                if (var40 < 8) {
                                    var40 = 8;
                                }
                                int var41 = (var38 - 32 - var40) * var37 / (var39 - var38);
                                class80.method1692(var36, var13 + 16 + var41, 16, var40, field556);
                                class80.method1700(var36, var13 + 16 + var41, var40, field369);
                                class80.method1700(var36 + 1, var13 + 16 + var41, var40, field369);
                                class80.method1707(var36, var13 + 16 + var41, 16, field369);
                                class80.method1707(var36, var13 + 17 + var41, 16, field369);
                                class80.method1700(var36 + 15, var13 + 16 + var41, var40, field368);
                                class80.method1700(var36 + 14, var13 + 17 + var41, var40 - 1, field368);
                                class80.method1707(var36, var13 + 15 + var41 + var40, 16, field368);
                                class80.method1707(var36 + 1, var13 + 14 + var41 + var40, 15, field368);
                            }
                            if (var10.field2743 != 1) {
                                if (var10.field2743 == 2) {
                                    int var42 = 0;
                                    for (int var43 = 0; var43 < var10.field2753; var43++) {
                                        for (int var44 = 0; var44 < var10.field2752; var44++) {
                                            int var45 = (var10.field2805 + 32) * var44 + var12;
                                            int var46 = (var10.field2806 + 32) * var43 + var13;
                                            if (var42 < 20) {
                                                var45 += var10.field2807[var42];
                                                var46 += var10.field2822[var42];
                                            }
                                            if (var10.field2857[var42] > 0) {
                                                boolean var47 = false;
                                                boolean var48 = false;
                                                int var49 = var10.field2857[var42] - 1;
                                                if (var45 + 32 > arg2 && var45 < arg4 && var46 + 32 > arg3 && var46 < arg5 || Statics.field1224 == var10 && field402 == var42) {
                                                    class79 var50;
                                                    if (field484 == 1 && Statics.field2135 == var42 && Statics.field781 == var10.field2741) {
                                                        var50 = class52.method983(var49, var10.field2794[var42], 2, 0, 2, false);
                                                    } else {
                                                        var50 = class52.method983(var49, var10.field2794[var42], 1, 3153952, 2, false);
                                                    }
                                                    if (var50 == null) {
                                                        method2951(var10);
                                                    } else if (Statics.field1224 == var10 && field402 == var42) {
                                                        int var51 = class140.field2146 - field403;
                                                        int var52 = class140.field2136 - field404;
                                                        if (var51 < 5 && var51 > -5) {
                                                            var51 = 0;
                                                        }
                                                        if (var52 < 5 && var52 > -5) {
                                                            var52 = 0;
                                                        }
                                                        if (field407 < 5) {
                                                            var51 = 0;
                                                            var52 = 0;
                                                        }
                                                        var50.method1633(var45 + var51, var46 + var52, 128);
                                                        if (arg1 != -1) {
                                                            class173 var53 = arg0[arg1 & 0xFFFF];
                                                            if (var46 + var52 < class80.field1418 && var53.field2763 > 0) {
                                                                int var54 = field355 * (class80.field1418 - var46 - var52) / 3;
                                                                if (var54 > field355 * 10) {
                                                                    var54 = field355 * 10;
                                                                }
                                                                if (var54 > var53.field2763) {
                                                                    var54 = var53.field2763;
                                                                }
                                                                var53.field2763 -= var54;
                                                                field404 += var54;
                                                                method2951(var53);
                                                            }
                                                            if (var46 + var52 + 32 > class80.field1421 && var53.field2763 < var53.field2765 - var53.field2872) {
                                                                int var55 = field355 * (var46 + var52 + 32 - class80.field1421) / 3;
                                                                if (var55 > field355 * 10) {
                                                                    var55 = field355 * 10;
                                                                }
                                                                if (var55 > var53.field2765 - var53.field2872 - var53.field2763) {
                                                                    var55 = var53.field2765 - var53.field2872 - var53.field2763;
                                                                }
                                                                var53.field2763 += var55;
                                                                field404 -= var55;
                                                                method2951(var53);
                                                            }
                                                        }
                                                    } else if (Statics.field266 == var10 && field477 == var42) {
                                                        var50.method1633(var45, var46, 128);
                                                    } else {
                                                        var50.method1597(var45, var46);
                                                    }
                                                }
                                            } else if (var10.field2809 != null && var42 < 20) {
                                                class79 var56 = var10.method3171(var42);
                                                if (var56 != null) {
                                                    var56.method1597(var45, var46);
                                                } else if (class173.field2739) {
                                                    method2951(var10);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                } else if (var10.field2743 == 3) {
                                    int var57;
                                    if (method769(var10)) {
                                        var57 = var10.field2767;
                                        if (Statics.field129 == var10 && var10.field2816 != 0) {
                                            var57 = var10.field2816;
                                        }
                                    } else {
                                        var57 = var10.field2766;
                                        if (Statics.field129 == var10 && var10.field2768 != 0) {
                                            var57 = var10.field2768;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2772) {
                                            class80.method1692(var12, var13, var10.field2756, var10.field2872, var57);
                                        } else {
                                            class80.method1694(var12, var13, var10.field2756, var10.field2872, var57);
                                        }
                                    } else if (var10.field2772) {
                                        class80.method1698(var12, var13, var10.field2756, var10.field2872, var57, 256 - (var14 & 0xFF));
                                    } else {
                                        class80.method1695(var12, var13, var10.field2756, var10.field2872, var57, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2743 == 4) {
                                    class224 var58 = var10.method3167();
                                    if (var58 != null) {
                                        String var59 = var10.field2799;
                                        int var60;
                                        if (method769(var10)) {
                                            var60 = var10.field2767;
                                            if (Statics.field129 == var10 && var10.field2816 != 0) {
                                                var60 = var10.field2816;
                                            }
                                            if (var10.field2800.length() > 0) {
                                                var59 = var10.field2800;
                                            }
                                        } else {
                                            var60 = var10.field2766;
                                            if (Statics.field129 == var10 && var10.field2768 != 0) {
                                                var60 = var10.field2768;
                                            }
                                        }
                                        if (var10.field2831 && var10.field2859 != -1) {
                                            class52 var61 = class52.method970(var10.field2859);
                                            var59 = var61.field1119;
                                            if (var59 == null) {
                                                var59 = "null";
                                            }
                                            if ((var61.field1130 == 1 || var10.field2860 != 1) && var10.field2860 != -1) {
                                                var59 = class2.method2933(16748608) + var59 + class2.field27 + " " + 'x' + Statics.method2227(var10.field2860);
                                            }
                                        }
                                        if (field450 == var10) {
                                            class157 var10000 = (class157) null;
                                            var59 = class157.field2491;
                                            var60 = var10.field2766;
                                        }
                                        if (!var10.field2831) {
                                            var59 = method602(var59, var10);
                                        }
                                        var58.method3736(var59, var12, var13, var10.field2756, var10.field2872, var60, var10.field2804 ? 0 : -1, var10.field2802, var10.field2813, var10.field2823);
                                    } else if (class173.field2739) {
                                        method2951(var10);
                                    }
                                } else if (var10.field2743 == 5) {
                                    if (var10.field2831) {
                                        class79 var63;
                                        if (var10.field2859 == -1) {
                                            var63 = var10.method3204(false);
                                        } else {
                                            var63 = class52.method983(var10.field2859, var10.field2860, var10.field2778, var10.field2779, var10.field2797, false);
                                        }
                                        if (var63 != null) {
                                            int var64 = var63.field1408;
                                            int var65 = var63.field1409;
                                            if (var10.field2777) {
                                                class80.method1697(var12, var13, var10.field2756 + var12, var10.field2872 + var13);
                                                int var66 = (var10.field2756 + (var64 - 1)) / var64;
                                                int var67 = (var10.field2872 + (var65 - 1)) / var65;
                                                for (int var68 = 0; var68 < var66; var68++) {
                                                    for (int var69 = 0; var69 < var67; var69++) {
                                                        if (var10.field2787 != 0) {
                                                            var63.method1678(var64 / 2 + var64 * var68 + var12, var65 / 2 + var65 * var69 + var13, var10.field2787, 4096);
                                                        } else if (var14 == 0) {
                                                            var63.method1597(var64 * var68 + var12, var65 * var69 + var13);
                                                        } else {
                                                            var63.method1633(var64 * var68 + var12, var65 * var69 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1734(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var70 = var10.field2756 * 4096 / var64;
                                                if (var10.field2787 != 0) {
                                                    var63.method1678(var10.field2756 / 2 + var12, var10.field2872 / 2 + var13, var10.field2787, var70);
                                                } else if (var14 != 0) {
                                                    var63.method1672(var12, var13, var10.field2756, var10.field2872, 256 - (var14 & 0xFF));
                                                } else if (var10.field2756 == var64 && var10.field2872 == var65) {
                                                    var63.method1597(var12, var13);
                                                } else {
                                                    var63.method1650(var12, var13, var10.field2756, var10.field2872);
                                                }
                                            }
                                        } else if (class173.field2739) {
                                            method2951(var10);
                                        }
                                    } else {
                                        class79 var62 = var10.method3204(method769(var10));
                                        if (var62 != null) {
                                            var62.method1597(var12, var13);
                                        } else if (class173.field2739) {
                                            method2951(var10);
                                        }
                                    }
                                } else if (var10.field2743 == 6) {
                                    boolean var71 = method769(var10);
                                    int var72;
                                    if (var71) {
                                        var72 = var10.field2838;
                                    } else {
                                        var72 = var10.field2808;
                                    }
                                    class105 var73 = null;
                                    int var74 = 0;
                                    if (var10.field2859 != -1) {
                                        class52 var75 = class52.method970(var10.field2859);
                                        if (var75 != null) {
                                            class52 var76 = var75.method1026(var10.field2860);
                                            var73 = var76.method1022(1);
                                            if (var73 == null) {
                                                method2951(var10);
                                            } else {
                                                var73.method2153();
                                                var74 = var73.field1451 / 2;
                                            }
                                        }
                                    } else if (var10.field2747 == 5) {
                                        if (var10.field2789 == 0) {
                                            var73 = field560.method3242((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var73 = Statics.field1544.method18();
                                        }
                                    } else if (var72 == -1) {
                                        var73 = var10.method3165((class43) null, -1, var71, Statics.field1544.field30);
                                        if (var73 == null && class173.field2739) {
                                            method2951(var10);
                                        }
                                    } else {
                                        class43 var77 = class43.method2299(var72);
                                        var73 = var10.method3165(var77, var10.field2861, var71, Statics.field1544.field30);
                                        if (var73 == null && class173.field2739) {
                                            method2951(var10);
                                        }
                                    }
                                    class91.method1954(var10.field2756 / 2 + var12, var10.field2872 / 2 + var13);
                                    int var78 = var10.field2793 * class91.field1574[var10.field2790] >> 16;
                                    int var79 = var10.field2793 * class91.field1581[var10.field2790] >> 16;
                                    if (var73 != null) {
                                        if (var10.field2831) {
                                            var73.method2153();
                                            if (var10.field2796) {
                                                var73.method2165(0, var10.field2791, var10.field2851, var10.field2790, var10.field2788, var10.field2759 + var74 + var78, var10.field2759 + var79, var10.field2793);
                                            } else {
                                                var73.method2164(0, var10.field2791, var10.field2851, var10.field2790, var10.field2788, var10.field2759 + var74 + var78, var10.field2759 + var79);
                                            }
                                        } else {
                                            var73.method2164(0, var10.field2791, 0, var10.field2790, 0, var78, var79);
                                        }
                                    }
                                    class91.method1953();
                                } else {
                                    if (var10.field2743 == 7) {
                                        class224 var80 = var10.method3167();
                                        if (var80 == null) {
                                            if (class173.field2739) {
                                                method2951(var10);
                                            }
                                            continue;
                                        }
                                        int var81 = 0;
                                        for (int var82 = 0; var82 < var10.field2753; var82++) {
                                            for (int var83 = 0; var83 < var10.field2752; var83++) {
                                                if (var10.field2857[var81] > 0) {
                                                    class52 var84 = class52.method970(var10.field2857[var81] - 1);
                                                    String var85;
                                                    if (var84.field1130 != 1 && var10.field2794[var81] == 1) {
                                                        var85 = class2.method2933(16748608) + var84.field1119 + class2.field27;
                                                    } else {
                                                        var85 = class2.method2933(16748608) + var84.field1119 + class2.field27 + " " + 'x' + Statics.method2227(var10.field2794[var81]);
                                                    }
                                                    int var86 = (var10.field2805 + 115) * var83 + var12;
                                                    int var87 = (var10.field2806 + 12) * var82 + var13;
                                                    if (var10.field2802 == 0) {
                                                        var80.method3733(var85, var86, var87, var10.field2766, var10.field2804 ? 0 : -1);
                                                    } else if (var10.field2802 == 1) {
                                                        var80.method3735(var85, var10.field2756 / 2 + var86, var87, var10.field2766, var10.field2804 ? 0 : -1);
                                                    } else {
                                                        var80.method3780(var85, var10.field2756 + var86 - 1, var87, var10.field2766, var10.field2804 ? 0 : -1);
                                                    }
                                                }
                                                var81++;
                                            }
                                        }
                                    }
                                    if (var10.field2743 == 8 && Statics.field1753 == var10 && field523 == field286) {
                                        int var88 = 0;
                                        int var89 = 0;
                                        class224 var90 = Statics.field1946;
                                        String var91 = var10.field2799;
                                        String var92 = method602(var91, var10);
                                        while (var92.length() > 0) {
                                            int var93 = var92.indexOf(class2.field23);
                                            String var94;
                                            if (var93 == -1) {
                                                var94 = var92;
                                                var92 = "";
                                            } else {
                                                var94 = var92.substring(0, var93);
                                                var92 = var92.substring(var93 + 4);
                                            }
                                            int var95 = var90.method3729(var94);
                                            if (var95 > var88) {
                                                var88 = var95;
                                            }
                                            var89 += var90.field3174 + 1;
                                        }
                                        var88 += 6;
                                        var89 += 7;
                                        int var96 = var10.field2756 + var12 - 5 - var88;
                                        int var97 = var10.field2872 + var13 + 5;
                                        if (var96 < var12 + 5) {
                                            var96 = var12 + 5;
                                        }
                                        if (var88 + var96 > arg4) {
                                            var96 = arg4 - var88;
                                        }
                                        if (var89 + var97 > arg5) {
                                            var97 = arg5 - var89;
                                        }
                                        class80.method1692(var96, var97, var88, var89, 16777120);
                                        class80.method1694(var96, var97, var88, var89, 0);
                                        String var98 = var10.field2799;
                                        int var99 = var90.field3174 + var97 + 2;
                                        String var100 = method602(var98, var10);
                                        while (var100.length() > 0) {
                                            int var101 = var100.indexOf(class2.field23);
                                            String var102;
                                            if (var101 == -1) {
                                                var102 = var100;
                                                var100 = "";
                                            } else {
                                                var102 = var100.substring(0, var101);
                                                var100 = var100.substring(var101 + 4);
                                            }
                                            var90.method3733(var102, var96 + 3, var99, 0, -1);
                                            var99 += var90.field3174 + 1;
                                        }
                                    }
                                    if (var10.field2743 == 9) {
                                        if (var10.field2856 == 1) {
                                            int var103;
                                            int var104;
                                            int var105;
                                            int var106;
                                            if (var10.field2773) {
                                                var103 = var12;
                                                var104 = var10.field2872 + var13;
                                                var105 = var10.field2756 + var12;
                                                var106 = var13;
                                            } else {
                                                var103 = var12;
                                                var104 = var13;
                                                var105 = var10.field2756 + var12;
                                                var106 = var10.field2872 + var13;
                                            }
                                            class80.method1691(var103, var104, var105, var106, var10.field2766);
                                        } else {
                                            int var107 = var10.field2756 >= 0 ? var10.field2756 : -var10.field2756;
                                            int var108 = var10.field2872 >= 0 ? var10.field2872 : -var10.field2872;
                                            int var109 = var107;
                                            if (var107 < var108) {
                                                var109 = var108;
                                            }
                                            if (var109 != 0) {
                                                int var110 = (var10.field2756 << 16) / var109;
                                                int var111 = (var10.field2872 << 16) / var109;
                                                if (var111 <= var110) {
                                                    var110 = -var110;
                                                } else {
                                                    var111 = -var111;
                                                }
                                                int var112 = var10.field2856 * var111 >> 17;
                                                int var113 = var10.field2856 * var111 + 1 >> 17;
                                                int var114 = var10.field2856 * var110 >> 17;
                                                int var115 = var10.field2856 * var110 + 1 >> 17;
                                                int var116 = var12 + var112;
                                                int var117 = var12 - var113;
                                                int var118 = var10.field2756 + var12 - var113;
                                                int var119 = var10.field2756 + var12 + var112;
                                                int var120 = var13 + var114;
                                                int var121 = var13 - var115;
                                                int var122 = var10.field2872 + var13 - var115;
                                                int var123 = var10.field2872 + var13 + var114;
                                                class91.method1959(var116, var117, var118);
                                                class91.method1962(var120, var121, var122, var116, var117, var118, var10.field2766);
                                                class91.method1959(var116, var118, var119);
                                                class91.method1962(var120, var122, var123, var116, var118, var119, var10.field2766);
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

    @ObfuscatedName("p.cc(Ljava/lang/String;Lfr;I)Ljava/lang/String;")
    public static String method602(String arg0, class173 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method2147(method99(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field627 != null) {
                    var5 = Statics.method585(Statics.field627.field2199);
                    if (Statics.field627.field2197 != null) {
                        var5 = (String) Statics.field627.field2197;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("u.cz(Lfr;I)V")
    public static void method216(class173 arg0) {
        class173 var1 = arg0.field2829 == -1 ? null : class173.method2966(arg0.field2829);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field63;
            var3 = Statics.field686;
        } else {
            var2 = var1.field2756;
            var3 = var1.field2872;
        }
        method1070(arg0, var2, var3, false);
        method96(arg0, var2, var3);
    }

    @ObfuscatedName("dt.cl([Lfr;Lfr;ZI)V")
    public static void method2278(class173[] arg0, class173 arg1, boolean arg2) {
        int var3 = arg1.field2764 == 0 ? arg1.field2756 : arg1.field2764;
        int var4 = arg1.field2765 == 0 ? arg1.field2872 : arg1.field2765;
        method9(arg0, arg1.field2741, var3, var4, arg2);
        if (arg1.field2863 != null) {
            method9(arg1.field2863, arg1.field2741, var3, var4, arg2);
        }
        class4 var5 = (class4) field447.method3496((long) arg1.field2741);
        if (var5 != null) {
            method673(var5.field58, var3, var4, arg2);
        }
        if (arg1.field2745 == 1337) {
        }
    }

    @ObfuscatedName("af.cx(IIIZI)V")
    public static final void method673(int arg0, int arg1, int arg2, boolean arg3) {
        if (class173.method2289(arg0)) {
            method9(Statics.field2801[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("v.ci([Lfr;IIIZI)V")
    public static void method9(class173[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class173 var6 = arg0[var5];
            if (var6 != null && var6.field2829 == arg1) {
                method1070(var6, arg2, arg3, arg4);
                method96(var6, arg2, arg3);
                if (var6.field2842 > var6.field2764 - var6.field2756) {
                    var6.field2842 = var6.field2764 - var6.field2756;
                }
                if (var6.field2842 < 0) {
                    var6.field2842 = 0;
                }
                if (var6.field2763 > var6.field2765 - var6.field2872) {
                    var6.field2763 = var6.field2765 - var6.field2872;
                }
                if (var6.field2763 < 0) {
                    var6.field2763 = 0;
                }
                if (var6.field2743 == 0) {
                    method2278(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ad.ce(Lfr;IIZB)V")
    public static void method1070(class173 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2756;
        int var5 = arg0.field2872;
        if (arg0.field2758 == 0) {
            arg0.field2756 = arg0.field2752;
        } else if (arg0.field2758 == 1) {
            arg0.field2756 = arg1 - arg0.field2752;
        } else if (arg0.field2758 == 2) {
            arg0.field2756 = arg0.field2752 * arg1 >> 14;
        }
        if (arg0.field2737 == 0) {
            arg0.field2872 = arg0.field2753;
        } else if (arg0.field2737 == 1) {
            arg0.field2872 = arg2 - arg0.field2753;
        } else if (arg0.field2737 == 2) {
            arg0.field2872 = arg0.field2753 * arg2 >> 14;
        }
        if (arg0.field2758 == 4) {
            arg0.field2756 = arg0.field2872 * arg0.field2832 / arg0.field2730;
        }
        if (arg0.field2737 == 4) {
            arg0.field2872 = arg0.field2756 * arg0.field2730 / arg0.field2832;
        }
        if (field452 && arg0.field2743 == 0) {
            if (arg0.field2872 < 5 && arg0.field2756 < 5) {
                arg0.field2872 = 5;
                arg0.field2756 = 5;
            } else {
                if (arg0.field2872 <= 0) {
                    arg0.field2872 = 5;
                }
                if (arg0.field2756 <= 0) {
                    arg0.field2756 = 5;
                }
            }
        }
        if (arg0.field2745 == 1337) {
            field458 = arg0;
        }
        if (arg3 && arg0.field2848 != null && (arg0.field2756 != var4 || arg0.field2872 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field12 = arg0.field2848;
            field485.method3529(var6);
        }
    }

    @ObfuscatedName("h.cn(Lfr;III)V")
    public static void method96(class173 arg0, int arg1, int arg2) {
        if (arg0.field2746 == 0) {
            arg0.field2754 = arg0.field2735;
        } else if (arg0.field2746 == 1) {
            arg0.field2754 = (arg1 - arg0.field2756) / 2 + arg0.field2735;
        } else if (arg0.field2746 == 2) {
            arg0.field2754 = arg1 - arg0.field2756 - arg0.field2735;
        } else if (arg0.field2746 == 3) {
            arg0.field2754 = arg0.field2735 * arg1 >> 14;
        } else if (arg0.field2746 == 4) {
            arg0.field2754 = (arg0.field2735 * arg1 >> 14) + (arg1 - arg0.field2756) / 2;
        } else {
            arg0.field2754 = arg1 - arg0.field2756 - (arg0.field2735 * arg1 >> 14);
        }
        if (arg0.field2865 == 0) {
            arg0.field2748 = arg0.field2858;
        } else if (arg0.field2865 == 1) {
            arg0.field2748 = (arg2 - arg0.field2872) / 2 + arg0.field2858;
        } else if (arg0.field2865 == 2) {
            arg0.field2748 = arg2 - arg0.field2872 - arg0.field2858;
        } else if (arg0.field2865 == 3) {
            arg0.field2748 = arg0.field2858 * arg2 >> 14;
        } else if (arg0.field2865 == 4) {
            arg0.field2748 = (arg0.field2858 * arg2 >> 14) + (arg2 - arg0.field2872) / 2;
        } else {
            arg0.field2748 = arg2 - arg0.field2872 - (arg0.field2858 * arg2 >> 14);
        }
        if (!field452 || arg0.field2743 != 0) {
            return;
        }
        if (arg0.field2754 < 0) {
            arg0.field2754 = 0;
        } else if (arg0.field2756 + arg0.field2754 > arg1) {
            arg0.field2754 = arg1 - arg0.field2756;
        }
        if (arg0.field2748 < 0) {
            arg0.field2748 = 0;
        } else if (arg0.field2872 + arg0.field2748 > arg2) {
            arg0.field2748 = arg2 - arg0.field2872;
        }
    }

    @ObfuscatedName("cg.cg(II)Ljava/lang/String;")
    public static final String method2147(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("an.dj(Lfr;I)Z")
    public static final boolean method769(class173 arg0) {
        if (arg0.field2852 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2852.length; var1++) {
            int var2 = method99(arg0, var1);
            int var3 = arg0.field2836[var1];
            if (arg0.field2852[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2852[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2852[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("d.dg(Lfr;II)I")
    public static final int method99(class173 arg0, int arg1) {
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
                    var7 = field423[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field424[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field425[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class173 var11 = class173.method2966(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method970(var12).field1137 || field361)) {
                        for (int var13 = 0; var13 < var11.field2857.length; var13++) {
                            if (var12 + 1 == var11.field2857[var13]) {
                                var7 += var11.field2794[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class176.field2886[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class155.field2281[field424[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class176.field2886[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1544.field33;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class155.field2280[var14]) {
                            var7 += field424[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class173 var17 = class173.method2966(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method970(var18).field1137 || field361)) {
                        for (int var19 = 0; var19 < var17.field2857.length; var19++) {
                            if (var18 + 1 == var17.field2857[var19]) {
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
                    var7 = field461;
                }
                if (var6 == 13) {
                    int var20 = class176.field2886[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class176.method140(var22);
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
                    var7 = (Statics.field1544.field866 >> 7) + Statics.field1201;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1544.field814 >> 7) + Statics.field1150;
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

    @ObfuscatedName("i.dn(IIIIIIIB)V")
    public static final void method5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class173.method2289(arg0)) {
            method2646(Statics.field2801[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("dm.dd([Lfr;IIIIIIIB)V")
    public static final void method2646(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class173 var9 = arg0[var8];
            if (var9 != null && (!var9.field2831 || var9.field2743 == 0 || var9.field2785 || method217(var9) != 0 || field497 == var9 || var9.field2745 == 1338) && var9.field2829 == arg1 && (!var9.field2831 || !method643(var9))) {
                int var10 = var9.field2754 + arg6;
                int var11 = var9.field2748 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2743 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2743 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2756 + var10;
                    int var19 = var9.field2872 + var11;
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
                    int var22 = var9.field2756 + var10;
                    int var23 = var9.field2872 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field459 == var9) {
                    field467 = true;
                    field283 = var10;
                    field469 = var11;
                }
                if (!var9.field2831 || var12 < var14 && var13 < var15) {
                    int var24 = class140.field2146;
                    int var25 = class140.field2136;
                    if (class140.field2141 != 0) {
                        var24 = class140.field2133;
                        var25 = class140.field2131;
                    }
                    if (var9.field2745 == 1337) {
                        if (!field295 && !field310 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            Statics.method841(var24, var25, var12, var13);
                        }
                    } else if (var9.field2745 == 1338) {
                        method684(var9, var10, var11);
                    } else {
                        if (!field310 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var26 = var24 - var10;
                            int var27 = var25 - var11;
                            if (var9.field2744 == 1) {
                                method763(var9.field2761, "", 24, 0, 0, var9.field2741);
                            }
                            if (var9.field2744 == 2 && !field491) {
                                int var28 = method217(var9);
                                int var29 = var28 >> 11 & 0x3F;
                                String var30;
                                if (var29 == 0) {
                                    var30 = null;
                                } else if (var9.field2818 == null || var9.field2818.trim().length() == 0) {
                                    var30 = null;
                                } else {
                                    var30 = var9.field2818;
                                }
                                if (var30 != null) {
                                    method763(var30, class2.method2933(65280) + var9.field2855, 25, 0, -1, var9.field2741);
                                }
                            }
                            if (var9.field2744 == 3) {
                                method763(class157.field2459, "", 26, 0, 0, var9.field2741);
                            }
                            if (var9.field2744 == 4) {
                                method763(var9.field2761, "", 28, 0, 0, var9.field2741);
                            }
                            if (var9.field2744 == 5) {
                                method763(var9.field2761, "", 29, 0, 0, var9.field2741);
                            }
                            if (var9.field2744 == 6 && field450 == null) {
                                method763(var9.field2761, "", 30, 0, -1, var9.field2741);
                            }
                            if (var9.field2743 == 2) {
                                int var32 = 0;
                                for (int var33 = 0; var33 < var9.field2872; var33++) {
                                    for (int var34 = 0; var34 < var9.field2756; var34++) {
                                        int var35 = (var9.field2805 + 32) * var34;
                                        int var36 = (var9.field2806 + 32) * var33;
                                        if (var32 < 20) {
                                            var35 += var9.field2807[var32];
                                            var36 += var9.field2822[var32];
                                        }
                                        if (var26 >= var35 && var27 >= var36 && var26 < var35 + 32 && var27 < var36 + 32) {
                                            field405 = var32;
                                            Statics.field763 = var9;
                                            if (var9.field2857[var32] > 0) {
                                                class52 var37 = class52.method970(var9.field2857[var32] - 1);
                                                if (field484 == 1 && class178.method3006(method217(var9))) {
                                                    if (Statics.field781 != var9.field2741 || Statics.field2135 != var32) {
                                                        method763(class157.field2435, field440 + " " + class2.field22 + " " + class2.method2933(16748608) + var37.field1119, 31, var37.field1117, var32, var9.field2741);
                                                    }
                                                } else if (!field491 || !class178.method3006(method217(var9))) {
                                                    String[] var38 = var37.field1134;
                                                    if (field457) {
                                                        var38 = method1757(var38);
                                                    }
                                                    if (class178.method3006(method217(var9))) {
                                                        for (int var39 = 4; var39 >= 3; var39--) {
                                                            if (var38 != null && var38[var39] != null) {
                                                                byte var40;
                                                                if (var39 == 3) {
                                                                    var40 = 36;
                                                                } else {
                                                                    var40 = 37;
                                                                }
                                                                method763(var38[var39], class2.method2933(16748608) + var37.field1119, var40, var37.field1117, var32, var9.field2741);
                                                            } else if (var39 == 4) {
                                                                method763(class157.field2396, class2.method2933(16748608) + var37.field1119, 37, var37.field1117, var32, var9.field2741);
                                                            }
                                                        }
                                                    }
                                                    if (class178.method2291(method217(var9))) {
                                                        method763(class157.field2435, class2.method2933(16748608) + var37.field1119, 38, var37.field1117, var32, var9.field2741);
                                                    }
                                                    if (class178.method3006(method217(var9)) && var38 != null) {
                                                        for (int var41 = 2; var41 >= 0; var41--) {
                                                            if (var38[var41] != null) {
                                                                byte var42 = 0;
                                                                if (var41 == 0) {
                                                                    var42 = 33;
                                                                }
                                                                if (var41 == 1) {
                                                                    var42 = 34;
                                                                }
                                                                if (var41 == 2) {
                                                                    var42 = 35;
                                                                }
                                                                method763(var38[var41], class2.method2933(16748608) + var37.field1119, var42, var37.field1117, var32, var9.field2741);
                                                            }
                                                        }
                                                    }
                                                    String[] var43 = var9.field2810;
                                                    if (field457) {
                                                        var43 = method1757(var43);
                                                    }
                                                    if (var43 != null) {
                                                        for (int var44 = 4; var44 >= 0; var44--) {
                                                            if (var43[var44] != null) {
                                                                byte var45 = 0;
                                                                if (var44 == 0) {
                                                                    var45 = 39;
                                                                }
                                                                if (var44 == 1) {
                                                                    var45 = 40;
                                                                }
                                                                if (var44 == 2) {
                                                                    var45 = 41;
                                                                }
                                                                if (var44 == 3) {
                                                                    var45 = 42;
                                                                }
                                                                if (var44 == 4) {
                                                                    var45 = 43;
                                                                }
                                                                method763(var43[var44], class2.method2933(16748608) + var37.field1119, var45, var37.field1117, var32, var9.field2741);
                                                            }
                                                        }
                                                    }
                                                    method763(class157.field2353, class2.method2933(16748608) + var37.field1119, 1005, var37.field1117, var32, var9.field2741);
                                                } else if ((Statics.field233 & 0x10) == 16) {
                                                    method763(field520, field445 + " " + class2.field22 + " " + class2.method2933(16748608) + var37.field1119, 32, var37.field1117, var32, var9.field2741);
                                                }
                                            }
                                        }
                                        var32++;
                                    }
                                }
                            }
                            if (var9.field2831) {
                                if (field491) {
                                    int var46 = method217(var9);
                                    boolean var47 = (var46 >> 21 & 0x1) != 0;
                                    if (var47 && (Statics.field233 & 0x20) == 32) {
                                        method763(field520, field445 + " " + class2.field22 + " " + var9.field2812, 58, 0, var9.field2742, var9.field2741);
                                    }
                                } else {
                                    for (int var48 = 9; var48 >= 5; var48--) {
                                        int var49 = method217(var9);
                                        boolean var50 = (var49 >> var48 + 1 & 0x1) != 0;
                                        String var51;
                                        if (!var50 && var9.field2783 == null) {
                                            var51 = null;
                                        } else if (var9.field2819 == null || var9.field2819.length <= var48 || var9.field2819[var48] == null || var9.field2819[var48].trim().length() == 0) {
                                            var51 = null;
                                        } else {
                                            var51 = var9.field2819[var48];
                                        }
                                        if (var51 != null) {
                                            method763(var51, var9.field2812, 1007, var48 + 1, var9.field2742, var9.field2741);
                                        }
                                    }
                                    int var53 = method217(var9);
                                    int var54 = var53 >> 11 & 0x3F;
                                    String var55;
                                    if (var54 == 0) {
                                        var55 = null;
                                    } else if (var9.field2818 == null || var9.field2818.trim().length() == 0) {
                                        var55 = null;
                                    } else {
                                        var55 = var9.field2818;
                                    }
                                    if (var55 != null) {
                                        method763(var55, var9.field2812, 25, 0, var9.field2742, var9.field2741);
                                    }
                                    for (int var57 = 4; var57 >= 0; var57--) {
                                        int var58 = method217(var9);
                                        boolean var59 = (var58 >> var57 + 1 & 0x1) != 0;
                                        String var60;
                                        if (!var59 && var9.field2783 == null) {
                                            var60 = null;
                                        } else if (var9.field2819 == null || var9.field2819.length <= var57 || var9.field2819[var57] == null || var9.field2819[var57].trim().length() == 0) {
                                            var60 = null;
                                        } else {
                                            var60 = var9.field2819[var57];
                                        }
                                        if (var60 != null) {
                                            method763(var60, var9.field2812, 57, var57 + 1, var9.field2742, var9.field2741);
                                        }
                                    }
                                    if (Statics.method597(method217(var9))) {
                                        method763(class157.field2539, "", 30, 0, var9.field2742, var9.field2741);
                                    }
                                }
                            }
                        }
                        if (var9.field2743 == 0) {
                            if (!var9.field2831 && method643(var9) && Statics.field129 != var9) {
                                continue;
                            }
                            method2646(arg0, var9.field2741, var12, var13, var14, var15, var10 - var9.field2842, var11 - var9.field2763);
                            if (var9.field2863 != null) {
                                method2646(var9.field2863, var9.field2741, var12, var13, var14, var15, var10 - var9.field2842, var11 - var9.field2763);
                            }
                            class4 var62 = (class4) field447.method3496((long) var9.field2741);
                            if (var62 != null) {
                                if (var62.field60 == 0 && class140.field2146 >= var12 && class140.field2136 >= var13 && class140.field2146 < var14 && class140.field2136 < var15 && !field310 && !field452) {
                                    for (class1 var63 = (class1) field485.method3534(); var63 != null; var63 = (class1) field485.method3536()) {
                                        if (var63.field2) {
                                            var63.method3626();
                                            var63.field3.field2870 = false;
                                        }
                                    }
                                    if (Statics.field784 == 0) {
                                        field459 = null;
                                        field497 = null;
                                    }
                                    if (!field310) {
                                        field553[0] = class157.field2536;
                                        field468[0] = "";
                                        field431[0] = 1006;
                                        field428 = 1;
                                    }
                                }
                                method5(var62.field58, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2831) {
                            if (var9.field2751) {
                                if (class140.field2146 >= var12 && class140.field2136 >= var13 && class140.field2146 < var14 && class140.field2136 < var15) {
                                    for (class1 var64 = (class1) field485.method3534(); var64 != null; var64 = (class1) field485.method3536()) {
                                        if (var64.field2) {
                                            var64.method3626();
                                            var64.field3.field2870 = false;
                                        }
                                    }
                                    if (Statics.field784 == 0) {
                                        field459 = null;
                                        field497 = null;
                                    }
                                    if (!field310) {
                                        field553[0] = class157.field2536;
                                        field468[0] = "";
                                        field431[0] = 1006;
                                        field428 = 1;
                                    }
                                }
                            } else if (var9.field2830 && class140.field2146 >= var12 && class140.field2136 >= var13 && class140.field2146 < var14 && class140.field2136 < var15) {
                                for (class1 var65 = (class1) field485.method3534(); var65 != null; var65 = (class1) field485.method3536()) {
                                    if (var65.field2 && var65.field3.field2740 == var65.field12) {
                                        var65.method3626();
                                    }
                                }
                            }
                            boolean var66;
                            if (class140.field2146 >= var12 && class140.field2136 >= var13 && class140.field2146 < var14 && class140.field2136 < var15) {
                                var66 = true;
                            } else {
                                var66 = false;
                            }
                            boolean var67 = false;
                            if ((class140.field2134 == 1 || !Statics.field312 && class140.field2134 == 4) && var66) {
                                var67 = true;
                            }
                            boolean var68 = false;
                            if ((class140.field2141 == 1 || !Statics.field312 && class140.field2141 == 4) && class140.field2133 >= var12 && class140.field2131 >= var13 && class140.field2133 < var14 && class140.field2131 < var15) {
                                var68 = true;
                            }
                            if (var68) {
                                method1948(var9, class140.field2133 - var10, class140.field2131 - var11);
                            }
                            if (field459 != null && field459 != var9 && var66 && class178.method3(method217(var9))) {
                                field463 = var9;
                            }
                            if (field497 == var9) {
                                field464 = true;
                                field387 = var10;
                                field466 = var11;
                            }
                            if (var9.field2785) {
                                if (var66 && field389 != 0 && var9.field2740 != null) {
                                    class1 var69 = new class1();
                                    var69.field2 = true;
                                    var69.field3 = var9;
                                    var69.field1 = field389;
                                    var69.field12 = var9.field2740;
                                    field485.method3529(var69);
                                }
                                if (field459 != null || Statics.field1224 != null || field310) {
                                    var68 = false;
                                    var67 = false;
                                    var66 = false;
                                }
                                if (!var9.field2762 && var68) {
                                    var9.field2762 = true;
                                    if (var9.field2821 != null) {
                                        class1 var70 = new class1();
                                        var70.field2 = true;
                                        var70.field3 = var9;
                                        var70.field10 = class140.field2133 - var10;
                                        var70.field1 = class140.field2131 - var11;
                                        var70.field12 = var9.field2821;
                                        field485.method3529(var70);
                                    }
                                }
                                if (var9.field2762 && var67 && var9.field2786 != null) {
                                    class1 var71 = new class1();
                                    var71.field2 = true;
                                    var71.field3 = var9;
                                    var71.field10 = class140.field2146 - var10;
                                    var71.field1 = class140.field2136 - var11;
                                    var71.field12 = var9.field2786;
                                    field485.method3529(var71);
                                }
                                if (var9.field2762 && !var67) {
                                    var9.field2762 = false;
                                    if (var9.field2839 != null) {
                                        class1 var72 = new class1();
                                        var72.field2 = true;
                                        var72.field3 = var9;
                                        var72.field10 = class140.field2146 - var10;
                                        var72.field1 = class140.field2136 - var11;
                                        var72.field12 = var9.field2839;
                                        field487.method3529(var72);
                                    }
                                }
                                if (var67 && var9.field2824 != null) {
                                    class1 var73 = new class1();
                                    var73.field2 = true;
                                    var73.field3 = var9;
                                    var73.field10 = class140.field2146 - var10;
                                    var73.field1 = class140.field2136 - var11;
                                    var73.field12 = var9.field2824;
                                    field485.method3529(var73);
                                }
                                if (!var9.field2870 && var66) {
                                    var9.field2870 = true;
                                    if (var9.field2825 != null) {
                                        class1 var74 = new class1();
                                        var74.field2 = true;
                                        var74.field3 = var9;
                                        var74.field10 = class140.field2146 - var10;
                                        var74.field1 = class140.field2136 - var11;
                                        var74.field12 = var9.field2825;
                                        field485.method3529(var74);
                                    }
                                }
                                if (var9.field2870 && var66 && var9.field2784 != null) {
                                    class1 var75 = new class1();
                                    var75.field2 = true;
                                    var75.field3 = var9;
                                    var75.field10 = class140.field2146 - var10;
                                    var75.field1 = class140.field2136 - var11;
                                    var75.field12 = var9.field2784;
                                    field485.method3529(var75);
                                }
                                if (var9.field2870 && !var66) {
                                    var9.field2870 = false;
                                    if (var9.field2873 != null) {
                                        class1 var76 = new class1();
                                        var76.field2 = true;
                                        var76.field3 = var9;
                                        var76.field10 = class140.field2146 - var10;
                                        var76.field1 = class140.field2136 - var11;
                                        var76.field12 = var9.field2873;
                                        field487.method3529(var76);
                                    }
                                }
                                if (var9.field2757 != null) {
                                    class1 var77 = new class1();
                                    var77.field3 = var9;
                                    var77.field12 = var9.field2757;
                                    field488.method3529(var77);
                                }
                                if (var9.field2750 != null && field381 > var9.field2867) {
                                    if (var9.field2833 == null || field381 - var9.field2867 > 32) {
                                        class1 var82 = new class1();
                                        var82.field3 = var9;
                                        var82.field12 = var9.field2750;
                                        field485.method3529(var82);
                                    } else {
                                        label744: for (int var78 = var9.field2867; var78 < field381; var78++) {
                                            int var79 = field472[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var9.field2833.length; var80++) {
                                                if (var9.field2833[var80] == var79) {
                                                    class1 var81 = new class1();
                                                    var81.field3 = var9;
                                                    var81.field12 = var9.field2750;
                                                    field485.method3529(var81);
                                                    break label744;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2867 = field381;
                                }
                                if (var9.field2834 != null && field474 > var9.field2868) {
                                    if (var9.field2835 == null || field474 - var9.field2868 > 32) {
                                        class1 var87 = new class1();
                                        var87.field3 = var9;
                                        var87.field12 = var9.field2834;
                                        field485.method3529(var87);
                                    } else {
                                        label720: for (int var83 = var9.field2868; var83 < field474; var83++) {
                                            int var84 = field513[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var9.field2835.length; var85++) {
                                                if (var9.field2835[var85] == var84) {
                                                    class1 var86 = new class1();
                                                    var86.field3 = var9;
                                                    var86.field12 = var9.field2834;
                                                    field485.method3529(var86);
                                                    break label720;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2868 = field474;
                                }
                                if (var9.field2811 != null && field337 > var9.field2869) {
                                    if (var9.field2776 == null || field337 - var9.field2869 > 32) {
                                        class1 var92 = new class1();
                                        var92.field3 = var9;
                                        var92.field12 = var9.field2811;
                                        field485.method3529(var92);
                                    } else {
                                        label696: for (int var88 = var9.field2869; var88 < field337; var88++) {
                                            int var89 = field476[var88 & 0x1F];
                                            for (int var90 = 0; var90 < var9.field2776.length; var90++) {
                                                if (var9.field2776[var90] == var89) {
                                                    class1 var91 = new class1();
                                                    var91.field3 = var9;
                                                    var91.field12 = var9.field2811;
                                                    field485.method3529(var91);
                                                    break label696;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2869 = field337;
                                }
                                if (field478 > var9.field2866 && var9.field2841 != null) {
                                    class1 var93 = new class1();
                                    var93.field3 = var9;
                                    var93.field12 = var9.field2841;
                                    field485.method3529(var93);
                                }
                                if (field433 > var9.field2866 && var9.field2843 != null) {
                                    class1 var94 = new class1();
                                    var94.field3 = var9;
                                    var94.field12 = var9.field2843;
                                    field485.method3529(var94);
                                }
                                if (field351 > var9.field2866 && var9.field2844 != null) {
                                    class1 var95 = new class1();
                                    var95.field3 = var9;
                                    var95.field12 = var9.field2844;
                                    field485.method3529(var95);
                                }
                                if (field481 > var9.field2866 && var9.field2792 != null) {
                                    class1 var96 = new class1();
                                    var96.field3 = var9;
                                    var96.field12 = var9.field2792;
                                    field485.method3529(var96);
                                }
                                if (field482 > var9.field2866 && var9.field2850 != null) {
                                    class1 var97 = new class1();
                                    var97.field3 = var9;
                                    var97.field12 = var9.field2850;
                                    field485.method3529(var97);
                                }
                                if (field483 > var9.field2866 && var9.field2845 != null) {
                                    class1 var98 = new class1();
                                    var98.field3 = var9;
                                    var98.field12 = var9.field2845;
                                    field485.method3529(var98);
                                }
                                var9.field2866 = field566;
                                if (var9.field2862 != null) {
                                    for (int var99 = 0; var99 < field510; var99++) {
                                        class1 var100 = new class1();
                                        var100.field3 = var9;
                                        var100.field5 = field512[var99];
                                        var100.field9 = field455[var99];
                                        var100.field12 = var9.field2862;
                                        field485.method3529(var100);
                                    }
                                }
                            }
                        }
                        if (!var9.field2831 && field459 == null && Statics.field1224 == null && !field310) {
                            if ((var9.field2854 >= 0 || var9.field2768 != 0) && class140.field2146 >= var12 && class140.field2136 >= var13 && class140.field2146 < var14 && class140.field2136 < var15) {
                                if (var9.field2854 >= 0) {
                                    Statics.field129 = arg0[var9.field2854];
                                } else {
                                    Statics.field129 = var9;
                                }
                            }
                            if (var9.field2743 == 8 && class140.field2146 >= var12 && class140.field2136 >= var13 && class140.field2146 < var14 && class140.field2136 < var15) {
                                Statics.field1753 = var9;
                            }
                            if (var9.field2765 > var9.field2872) {
                                int var101 = var9.field2756 + var10;
                                int var102 = var9.field2872;
                                int var103 = var9.field2765;
                                int var104 = class140.field2146;
                                int var105 = class140.field2136;
                                if (field370) {
                                    field437 = 32;
                                } else {
                                    field437 = 0;
                                }
                                field370 = false;
                                if (class140.field2134 == 1 || !Statics.field312 && class140.field2134 == 4) {
                                    if (var104 >= var101 && var104 < var101 + 16 && var105 >= var11 && var105 < var11 + 16) {
                                        var9.field2763 -= 4;
                                        method2951(var9);
                                    } else if (var104 >= var101 && var104 < var101 + 16 && var105 >= var11 + var102 - 16 && var105 < var11 + var102) {
                                        var9.field2763 += 4;
                                        method2951(var9);
                                    } else if (var104 >= var101 - field437 && var104 < field437 + var101 + 16 && var105 >= var11 + 16 && var105 < var11 + var102 - 16) {
                                        int var106 = (var102 - 32) * var102 / var103;
                                        if (var106 < 8) {
                                            var106 = 8;
                                        }
                                        int var107 = var105 - var11 - 16 - var106 / 2;
                                        int var108 = var102 - 32 - var106;
                                        var9.field2763 = (var103 - var102) * var107 / var108;
                                        method2951(var9);
                                        field370 = true;
                                    }
                                }
                                if (field389 != 0) {
                                    int var109 = var9.field2756;
                                    if (var104 >= var101 - var109 && var105 >= var11 && var104 < var101 + 16 && var105 <= var11 + var102) {
                                        var9.field2763 += field389 * 45;
                                        method2951(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ew.dr([Lfr;IB)V")
    public static final void method2932(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2743 == 0) {
                    if (var3.field2863 != null) {
                        method2932(var3.field2863, arg1);
                    }
                    class4 var4 = (class4) field447.method3496((long) var3.field2741);
                    if (var4 != null) {
                        int var5 = var4.field58;
                        if (class173.method2289(var5)) {
                            method2932(Statics.field2801[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2846 != null) {
                    class1 var6 = new class1();
                    var6.field3 = var3;
                    var6.field12 = var3.field2846;
                    class37.method571(var6, 200000);
                }
                if (arg1 == 1 && var3.field2847 != null) {
                    if (var3.field2742 >= 0) {
                        class173 var7 = class173.method2966(var3.field2741);
                        if (var7 == null || var7.field2863 == null || var3.field2742 >= var7.field2863.length || var7.field2863[var3.field2742] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field3 = var3;
                    var8.field12 = var3.field2847;
                    class37.method571(var8, 200000);
                }
            }
        }
    }

    @ObfuscatedName("cp.dh(Lfr;III)V")
    public static final void method1948(class173 arg0, int arg1, int arg2) {
        if (field459 != null || field310 || arg0 == null || method897(arg0) == null) {
            return;
        }
        field459 = arg0;
        field497 = method897(arg0);
        field562 = arg1;
        field462 = arg2;
        Statics.field784 = 0;
        field535 = false;
        if (field428 > 0) {
            Statics.method2793(field428 - 1);
        }
    }

    @ObfuscatedName("d.dt(B)V")
    public static final void method100() {
        method2951(field459);
        Statics.field784++;
        if (field467 && field464) {
            int var0 = class140.field2146;
            int var1 = class140.field2136;
            int var2 = var0 - field562;
            int var3 = var1 - field462;
            if (var2 < field387) {
                var2 = field387;
            }
            if (field459.field2756 + var2 > field387 + field497.field2756) {
                var2 = field387 + field497.field2756 - field459.field2756;
            }
            if (var3 < field466) {
                var3 = field466;
            }
            if (field459.field2872 + var3 > field466 + field497.field2872) {
                var3 = field466 + field497.field2872 - field459.field2872;
            }
            int var4 = var2 - field283;
            int var5 = var3 - field469;
            int var6 = field459.field2815;
            if (Statics.field784 > field459.field2826 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field535 = true;
            }
            int var7 = field497.field2842 + (var2 - field387);
            int var8 = field497.field2763 + (var3 - field466);
            if (field459.field2828 != null && field535) {
                class1 var9 = new class1();
                var9.field3 = field459;
                var9.field10 = var7;
                var9.field1 = var8;
                var9.field12 = field459.field2828;
                class37.method571(var9, 200000);
            }
            if (class140.field2134 == 0) {
                if (field535) {
                    if (field459.field2749 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field459;
                        var10.field10 = var7;
                        var10.field1 = var8;
                        var10.field7 = field463;
                        var10.field12 = field459.field2749;
                        class37.method571(var10, 200000);
                    }
                    if (field463 != null && method2570(field459) != null) {
                        field330.method2578(153);
                        field330.method2339(field459.field2859);
                        field330.method2331(field463.field2742);
                        field330.method2384(field463.field2741);
                        field330.method2339(field459.field2742);
                        field330.method2341(field459.field2741);
                        field330.method2339(field463.field2859);
                    }
                } else if ((field426 == 1 || method649(field428 - 1)) && field428 > 2) {
                    method3650(field562 + field283, field469 + field462);
                } else if (field428 > 0) {
                    int var11 = field562 + field283;
                    int var12 = field469 + field462;
                    method1765(Statics.field2638, var11, var12);
                    Statics.field2638 = null;
                }
                field459 = null;
            }
        } else if (Statics.field784 > 1) {
            field459 = null;
        }
    }

    @ObfuscatedName("ff.dz(Lfr;I)V")
    public static void method2951(class173 arg0) {
        if (field550 == arg0.field2871) {
            field559[arg0.field2769] = true;
        }
    }

    @ObfuscatedName("en.dp(I)V")
    public static void method2757() {
        for (class4 var0 = (class4) field447.method3506(); var0 != null; var0 = (class4) field447.method3500()) {
            int var1 = var0.field58;
            if (class173.method2289(var1)) {
                boolean var2 = true;
                class173[] var3 = Statics.field2801[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2831;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3100;
                    class173 var6 = class173.method2966(var5);
                    if (var6 != null) {
                        method2951(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ae.dc(Lfr;S)Lfr;")
    public static class173 method897(class173 arg0) {
        class173 var1 = method2570(arg0);
        if (var1 == null) {
            var1 = arg0.field2814;
        }
        return var1;
    }

    @ObfuscatedName("cd.ds([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method1757(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("el.do(II)V")
    public static final void method2754(int arg0) {
        if (!class173.method2289(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2801[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3 != null) {
                var3.field2861 = 0;
                var3.field2827 = 0;
            }
        }
    }

    @ObfuscatedName("e.dy([Lfr;II)V")
    public static final void method137(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null && var3.field2829 == arg1 && (!var3.field2831 || !method643(var3))) {
                if (var3.field2743 == 0) {
                    if (!var3.field2831 && method643(var3) && Statics.field129 != var3) {
                        continue;
                    }
                    method137(arg0, var3.field2741);
                    if (var3.field2863 != null) {
                        method137(var3.field2863, var3.field2741);
                    }
                    class4 var4 = (class4) field447.method3496((long) var3.field2741);
                    if (var4 != null) {
                        int var5 = var4.field58;
                        if (class173.method2289(var5)) {
                            method137(Statics.field2801[var5], -1);
                        }
                    }
                }
                if (var3.field2743 == 6) {
                    if (var3.field2808 != -1 || var3.field2838 != -1) {
                        boolean var6 = method769(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2838;
                        } else {
                            var7 = var3.field2808;
                        }
                        if (var7 != -1) {
                            class43 var8 = class43.method2299(var7);
                            var3.field2827 += field355;
                            while (var3.field2827 > var8.field985[var3.field2861]) {
                                var3.field2827 -= var8.field985[var3.field2861];
                                var3.field2861++;
                                if (var3.field2861 >= var8.field983.length) {
                                    var3.field2861 -= var8.field987;
                                    if (var3.field2861 < 0 || var3.field2861 >= var8.field983.length) {
                                        var3.field2861 = 0;
                                    }
                                }
                                method2951(var3);
                            }
                        }
                    }
                    if (var3.field2795 != 0 && !var3.field2831) {
                        int var9 = var3.field2795 >> 16;
                        int var10 = var3.field2795 << 16 >> 16;
                        int var11 = field355 * var9;
                        int var12 = field355 * var10;
                        var3.field2790 = var3.field2790 + var11 & 0x7FF;
                        var3.field2791 = var3.field2791 + var12 & 0x7FF;
                        method2951(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bg.dx(II)V")
    public static final void method1218(int arg0) {
        method2757();
        for (class24 var1 = (class24) class24.field604.method3534(); var1 != null; var1 = (class24) class24.field604.method3536()) {
            if (var1.field620 != null) {
                var1.method589();
            }
        }
        int var2 = class53.method732(arg0).field1164;
        if (var2 == 0) {
            return;
        }
        int var3 = class176.field2886[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class91.method1956(0.9D);
                ((class95) Statics.field1577).method2025(0.9D);
            }
            if (var3 == 2) {
                class91.method1956(0.8D);
                ((class95) Statics.field1577).method2025(0.8D);
            }
            if (var3 == 3) {
                class91.method1956(0.7D);
                ((class95) Statics.field1577).method2025(0.7D);
            }
            if (var3 == 4) {
                class91.method1956(0.6D);
                ((class95) Statics.field1577).method2025(0.6D);
            }
            class52.field1116.method3467();
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
            if (field524 != var4) {
                if (field524 == 0 && field525 != -1) {
                    class183.method121(Statics.field1938, field525, 0, var4, false);
                    field526 = false;
                } else if (var4 == 0) {
                    Statics.field2935.method3386();
                    class183.field2937 = 1;
                    Statics.field3131 = null;
                    field526 = false;
                } else {
                    class183.method3141(var4);
                }
                field524 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field527 = 127;
            }
            if (var3 == 1) {
                field527 = 96;
            }
            if (var3 == 2) {
                field527 = 64;
            }
            if (var3 == 3) {
                field527 = 32;
            }
            if (var3 == 4) {
                field527 = 0;
            }
        }
        if (var2 == 5) {
            field426 = var3;
        }
        if (var2 == 6) {
            field572 = var3;
        }
        if (var2 == 9) {
            field449 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field528 = 127;
            }
            if (var3 == 1) {
                field528 = 96;
            }
            if (var3 == 2) {
                field528 = 64;
            }
            if (var3 == 3) {
                field528 = 32;
            }
            if (var3 == 4) {
                field528 = 0;
            }
        }
        if (var2 == 17) {
            field356 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class21[] var5 = new class21[] { class21.field575, class21.field577, class21.field574 };
            field313 = (class21) class109.method2293(var5, var3);
            if (field313 == null) {
                field313 = class21.field575;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field454 = -1;
        } else {
            field454 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("fg.dq(Lfr;B)V")
    public static final void method3018(class173 arg0) {
        int var1 = arg0.field2745;
        if (var1 == 324) {
            if (field561 == -1) {
                field561 = arg0.field2774;
                field397 = arg0.field2775;
            }
            if (field560.field2902) {
                arg0.field2774 = field561;
            } else {
                arg0.field2774 = field397;
            }
        } else if (var1 == 325) {
            if (field561 == -1) {
                field561 = arg0.field2774;
                field397 = arg0.field2775;
            }
            if (field560.field2902) {
                arg0.field2774 = field397;
            } else {
                arg0.field2774 = field561;
            }
        } else if (var1 == 327) {
            arg0.field2790 = 150;
            arg0.field2791 = (int) (Math.sin((double) field290 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2747 = 5;
            arg0.field2789 = 0;
        } else if (var1 == 328) {
            arg0.field2790 = 150;
            arg0.field2791 = (int) (Math.sin((double) field290 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2747 = 5;
            arg0.field2789 = 1;
        }
    }

    @ObfuscatedName("aa.df(IIII)Ln;")
    public static final class4 method895(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field58 = arg1;
        var3.field60 = arg2;
        field447.method3497(var3, (long) arg0);
        method2754(arg1);
        class173 var4 = class173.method2966(arg0);
        method2951(var4);
        if (field450 != null) {
            method2951(field450);
            field450 = null;
        }
        method146();
        method2278(Statics.field2801[arg0 >> 16], var4, false);
        class37.method663(arg1);
        if (field446 != -1) {
            int var5 = field446;
            if (class173.method2289(var5)) {
                method2932(Statics.field2801[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("d.dv(Ln;ZB)V")
    public static final void method101(class4 arg0, boolean arg1) {
        int var2 = arg0.field58;
        int var3 = (int) arg0.field3100;
        arg0.method3626();
        if (arg1) {
            class173.method667(var2);
        }
        Statics.method176(var2);
        class173 var4 = class173.method2966(var3);
        if (var4 != null) {
            method2951(var4);
        }
        method146();
        if (field446 != -1) {
            int var5 = field446;
            if (class173.method2289(var5)) {
                method2932(Statics.field2801[var5], 1);
            }
        }
    }

    @ObfuscatedName("h.db(Lfr;B)Z")
    public static final boolean method89(class173 arg0) {
        int var1 = arg0.field2745;
        if (var1 == 205) {
            field340 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field560.method3237(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field560.method3238(var4, var5 == 1);
        }
        if (var1 == 324) {
            field560.method3260(false);
        }
        if (var1 == 325) {
            field560.method3260(true);
        }
        if (var1 == 326) {
            field330.method2578(181);
            field560.method3240(field330);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("db.de(Lfr;IIII)V")
    public static final void method2612(class173 arg0, int arg1, int arg2, int arg3) {
        method1759();
        class175 var4 = arg0.method3198(false);
        if (var4 == null) {
            return;
        }
        class80.method1734(arg1, arg2, var4.field2881 + arg1, var4.field2882 + arg2);
        if (field494 == 2 || field494 == 5) {
            class80.method1701(arg1, arg2, 0, var4.field2883, var4.field2880);
        } else {
            int var5 = field470 + field373 & 0x7FF;
            int var6 = Statics.field1544.field866 / 32 + 48;
            int var7 = 464 - Statics.field1544.field814 / 32;
            Statics.field655.method1607(arg1, arg2, var4.field2881, var4.field2882, var6, var7, var5, field367 + 256, var4.field2883, var4.field2880);
            for (int var8 = 0; var8 < field401; var8++) {
                int var9 = field305[var8] * 4 + 2 - Statics.field1544.field866 / 32;
                int var10 = field441[var8] * 4 + 2 - Statics.field1544.field814 / 32;
                method605(arg1, arg2, var9, var10, field434[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class199 var13 = field419[Statics.field1181][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field1544.field866 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field1544.field814 / 32;
                        method605(arg1, arg2, var14, var15, Statics.field2191[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field325; var16++) {
                class35 var17 = field324[field326[var16]];
                if (var17 != null && var17.method36()) {
                    class40 var18 = var17.field779;
                    if (var18 != null && var18.field911 != null) {
                        var18 = var18.method776();
                    }
                    if (var18 != null && var18.field886 && var18.field914) {
                        int var19 = var17.field866 / 32 - Statics.field1544.field866 / 32;
                        int var20 = var17.field814 / 32 - Statics.field1544.field814 / 32;
                        method605(arg1, arg2, var19, var20, Statics.field2191[1], var4);
                    }
                }
            }
            int var21 = class33.field750;
            int[] var22 = class33.field751;
            for (int var23 = 0; var23 < var21; var23++) {
                class3 var24 = field409[var22[var23]];
                if (var24 != null && var24.method36() && !var24.field47 && Statics.field1544 != var24) {
                    int var25 = var24.field866 / 32 - Statics.field1544.field866 / 32;
                    int var26 = var24.field814 / 32 - Statics.field1544.field814 / 32;
                    boolean var27 = false;
                    if (method4(var24.field35, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field679; var29++) {
                        if (var24.field35.equals(Statics.field170[var29].field622)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field1544.field34 != 0 && var24.field34 != 0 && Statics.field1544.field34 == var24.field34) {
                        var30 = true;
                    }
                    if (var27) {
                        method605(arg1, arg2, var25, var26, Statics.field2191[3], var4);
                    } else if (var30) {
                        method605(arg1, arg2, var25, var26, Statics.field2191[4], var4);
                    } else if (var28) {
                        method605(arg1, arg2, var25, var26, Statics.field2191[5], var4);
                    } else {
                        method605(arg1, arg2, var25, var26, Statics.field2191[2], var4);
                    }
                }
            }
            if (field511 != 0 && field290 % 20 < 10) {
                if (field511 == 1 && field504 >= 0 && field504 < field324.length) {
                    class35 var31 = field324[field504];
                    if (var31 != null) {
                        int var32 = var31.field866 / 32 - Statics.field1544.field866 / 32;
                        int var33 = var31.field814 / 32 - Statics.field1544.field814 / 32;
                        method3225(arg1, arg2, var32, var33, Statics.field514[1], var4);
                    }
                }
                if (field511 == 2) {
                    int var34 = field307 * 4 - Statics.field1201 * 4 + 2 - Statics.field1544.field866 / 32;
                    int var35 = field388 * 4 - Statics.field1150 * 4 + 2 - Statics.field1544.field814 / 32;
                    method3225(arg1, arg2, var34, var35, Statics.field514[1], var4);
                }
                if (field511 == 10 && field322 >= 0 && field322 < field409.length) {
                    class3 var36 = field409[field322];
                    if (var36 != null) {
                        int var37 = var36.field866 / 32 - Statics.field1544.field866 / 32;
                        int var38 = var36.field814 / 32 - Statics.field1544.field814 / 32;
                        method3225(arg1, arg2, var37, var38, Statics.field514[1], var4);
                    }
                }
            }
            if (field521 != 0) {
                int var39 = field521 * 4 + 2 - Statics.field1544.field866 / 32;
                int var40 = field522 * 4 + 2 - Statics.field1544.field814 / 32;
                method605(arg1, arg2, var39, var40, Statics.field514[0], var4);
            }
            if (!Statics.field1544.field47) {
                class80.method1692(var4.field2881 / 2 + arg1 - 1, var4.field2882 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field480[arg3] = true;
    }

    @ObfuscatedName("fp.du(IIIILck;Lfp;I)V")
    public static final void method3225(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method605(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field470 + field373 & 0x7FF;
        int var8 = class91.field1574[var7];
        int var9 = class91.field1581[var7];
        int var10 = var8 * 256 / (field367 + 256);
        int var11 = var9 * 256 / (field367 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field667.method1627(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("p.dw(IIIILck;Lfp;I)V")
    public static final void method605(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field470 + field373 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class91.field1574[var6];
        int var9 = class91.field1581[var6];
        int var10 = var8 * 256 / (field367 + 256);
        int var11 = var9 * 256 / (field367 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1606(arg5.field2881 / 2 + var12 - arg4.field1408 / 2, arg5.field2882 / 2 - var13 - arg4.field1409 / 2, arg0, arg1, arg5.field2881, arg5.field2882, arg5.field2883, arg5.field2880);
        } else {
            arg4.method1597(arg5.field2881 / 2 + arg0 + var12 - arg4.field1408 / 2, arg5.field2882 / 2 + arg1 - var13 - arg4.field1409 / 2);
        }
    }

    @ObfuscatedName("i.dm(Ljava/lang/String;ZI)Z")
    public static boolean method4(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class164.method48(arg0, Statics.field289);
        for (int var3 = 0; var3 < field554; var3++) {
            if (var2.equalsIgnoreCase(class164.method48(field486[var3].field243, Statics.field289)) && (!arg1 || field486[var3].field241 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class164.method48(Statics.field1544.field35, Statics.field289))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("y.dl(Ljava/lang/String;I)Z")
    public static boolean method113(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class164.method48(arg0, Statics.field289);
        for (int var2 = 0; var2 < field558; var2++) {
            class8 var3 = field421[var2];
            if (var1.equalsIgnoreCase(class164.method48(var3.field131, Statics.field289))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class164.method48(var3.field125, Statics.field289))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("au.da(Ljava/lang/String;ZI)V")
    public static final void method647(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field558 < 100 || field411 == 1) || field558 >= 400) {
            class12.method112(31, "", class157.field2468);
            return;
        }
        String var2 = class164.method48(arg0, Statics.field289);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field558; var3++) {
            class8 var4 = field421[var3];
            String var5 = class164.method48(var4.field131, Statics.field289);
            if (var5 != null && var5.equals(var2)) {
                class12.method112(31, "", arg0 + class157.field2469);
                return;
            }
            if (var4.field125 != null) {
                String var6 = class164.method48(var4.field125, Statics.field289);
                if (var6 != null && var6.equals(var2)) {
                    class12.method112(31, "", arg0 + class157.field2469);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field554; var7++) {
            class18 var8 = field486[var7];
            String var9 = class164.method48(var8.field243, Statics.field289);
            if (var9 != null && var9.equals(var2)) {
                class12.method112(31, "", class157.field2474 + arg0 + class157.field2475);
                return;
            }
            if (var8.field242 != null) {
                String var10 = class164.method48(var8.field242, Statics.field289);
                if (var10 != null && var10.equals(var2)) {
                    class12.method112(31, "", class157.field2474 + arg0 + class157.field2475);
                    return;
                }
            }
        }
        if (class164.method48(Statics.field1544.field35, Statics.field289).equals(var2)) {
            class12.method112(31, "", class157.field2471);
        } else {
            field330.method2578(78);
            field330.method2436(class119.method141(arg0));
            field330.method2336(arg0);
        }
    }

    @ObfuscatedName("et.di(Ljava/lang/String;I)V")
    public static final void method2936(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class164.method48(arg0, Statics.field289);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field558; var2++) {
            class8 var3 = field421[var2];
            String var4 = var3.field131;
            String var5 = class164.method48(var4, Statics.field289);
            if (class129.method768(arg0, var1, var4, var5)) {
                field558--;
                for (int var6 = var2; var6 < field558; var6++) {
                    field421[var6] = field421[var6 + 1];
                }
                field433 = field566;
                field330.method2578(211);
                field330.method2436(class119.method141(arg0));
                field330.method2336(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("dn.ev(B)V")
    public static final void method2225() {
        field330.method2578(166);
        field330.method2436(0);
    }

    @ObfuscatedName("u.es(Lfr;I)I")
    public static int method217(class173 arg0) {
        class201 var1 = (class201) field375.method3496(((long) arg0.field2741 << 32) + (long) arg0.field2742);
        return var1 == null ? arg0.field2770 : var1.field3086;
    }

    @ObfuscatedName("df.ec(Lfr;I)Lfr;")
    public static class173 method2570(class173 arg0) {
        int var1 = method217(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class173.method2966(arg0.field2829);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("w.ef(Lfr;I)Z")
    public static boolean method643(class173 arg0) {
        if (field452) {
            if (method217(arg0) != 0) {
                return false;
            }
            if (arg0.field2743 == 0) {
                return false;
            }
        }
        return arg0.field2840;
    }

    @ObfuscatedName("aw.ee(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method728(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field288 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field288 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field288 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field288 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field288 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1166 != null) {
            var3 = "/p=" + Statics.field1166;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field358 + "/a=" + Statics.field293 + var3 + "/";
    }

    @ObfuscatedName("g.eh(Ljava/lang/String;B)V")
    public static void method179(String arg0) {
        Statics.field1166 = arg0;
        try {
            String var1 = Statics.field284.getParameter(class190.field3053.field3050);
            String var2 = Statics.field284.getParameter(class190.field3048.field3050);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class111.method219(class115.method2134() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field284;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }
}

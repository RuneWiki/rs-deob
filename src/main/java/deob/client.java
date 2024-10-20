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
import java.net.Socket;
import java.util.Date;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class114 {

    @ObfuscatedName("client.m")
    public static boolean field317 = true;

    @ObfuscatedName("client.h")
    public static int field284 = 1;

    @ObfuscatedName("client.w")
    public static class118[] field552 = new class118[4];

    @ObfuscatedName("client.r")
    public static int field285 = 0;

    @ObfuscatedName("client.p")
    public static int field444 = 0;

    @ObfuscatedName("client.q")
    public static boolean field440 = false;

    @ObfuscatedName("client.l")
    public static boolean field289 = false;

    @ObfuscatedName("client.e")
    public static int field290 = 0;

    @ObfuscatedName("client.a")
    public static int field293 = 0;

    @ObfuscatedName("client.b")
    public static boolean field281 = true;

    @ObfuscatedName("client.j")
    public static int field295 = 0;

    @ObfuscatedName("client.k")
    public static long field296 = 1L;

    @ObfuscatedName("client.u")
    public static int field297 = -1;

    @ObfuscatedName("client.t")
    public static int field393 = -1;

    @ObfuscatedName("client.av")
    public static int field299 = -1;

    @ObfuscatedName("client.aw")
    public static boolean field288 = true;

    @ObfuscatedName("client.ay")
    public static boolean field564 = false;

    @ObfuscatedName("client.as")
    public static int field302 = 0;

    @ObfuscatedName("client.ai")
    public static int field303 = 0;

    @ObfuscatedName("client.aq")
    public static int field304 = 0;

    @ObfuscatedName("client.ac")
    public static int field305 = 0;

    @ObfuscatedName("client.ae")
    public static int field306 = 0;

    @ObfuscatedName("client.ag")
    public static int field307 = 0;

    @ObfuscatedName("client.am")
    public static int field454 = 0;

    @ObfuscatedName("client.af")
    public static int field309 = 0;

    @ObfuscatedName("client.ap")
    public static int field310 = 0;

    @ObfuscatedName("client.ax")
    public static class41 field311 = class41.field807;

    @ObfuscatedName("client.ad")
    public static class41 field488 = class41.field807;

    @ObfuscatedName("client.al")
    public static int field313 = 0;

    @ObfuscatedName("client.at")
    public static int field315 = 0;

    @ObfuscatedName("client.au")
    public static int field283 = 0;

    @ObfuscatedName("client.bu")
    public static int field321 = 0;

    @ObfuscatedName("client.bk")
    public static int field453 = 0;

    @ObfuscatedName("client.bh")
    public static int field323 = 0;

    @ObfuscatedName("client.bb")
    public static int field324 = 0;

    @ObfuscatedName("client.bg")
    public static int field325 = 0;

    @ObfuscatedName("client.cd")
    public static class36[] field461 = new class36[32768];

    @ObfuscatedName("client.cg")
    public static int field327 = 0;

    @ObfuscatedName("client.cw")
    public static int[] field560 = new int[32768];

    @ObfuscatedName("client.ca")
    public static int field338 = 0;

    @ObfuscatedName("client.cc")
    public static int[] field330 = new int[250];

    @ObfuscatedName("client.cu")
    public static class167 field331 = new class167(5000);

    @ObfuscatedName("client.ce")
    public static class167 field332 = new class167(5000);

    @ObfuscatedName("client.cz")
    public static class167 field371 = new class167(15000);

    @ObfuscatedName("client.cb")
    public static int field565 = 0;

    @ObfuscatedName("client.ch")
    public static int field335 = 0;

    @ObfuscatedName("client.cj")
    public static int field336 = 0;

    @ObfuscatedName("client.cq")
    public static int field337 = 0;

    @ObfuscatedName("client.cr")
    public static int field483 = 0;

    @ObfuscatedName("client.cv")
    public static int field339 = 0;

    @ObfuscatedName("client.cm")
    public static int field340 = 0;

    @ObfuscatedName("client.cl")
    public static int field406 = 0;

    @ObfuscatedName("client.co")
    public static boolean field426 = false;

    @ObfuscatedName("client.dt")
    public static int field343 = 0;

    @ObfuscatedName("client.dw")
    public static int field344 = 1;

    @ObfuscatedName("client.do")
    public static int field345 = 0;

    @ObfuscatedName("client.dk")
    public static int field346 = 1;

    @ObfuscatedName("client.dr")
    public static int field368 = 0;

    @ObfuscatedName("client.du")
    public static boolean field349 = false;

    @ObfuscatedName("client.dz")
    public static int[][][] field350 = new int[4][13][13];

    @ObfuscatedName("client.dg")
    public static final int[] field351 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dc")
    public static int field352 = 0;

    @ObfuscatedName("client.di")
    public static int field510 = 2;

    @ObfuscatedName("client.dq")
    public static int field354 = 0;

    @ObfuscatedName("client.dh")
    public static int field355 = 2;

    @ObfuscatedName("client.dx")
    public static int field356 = 0;

    @ObfuscatedName("client.ef")
    public static int field357 = 1;

    @ObfuscatedName("client.ec")
    public static int field496 = 0;

    @ObfuscatedName("client.et")
    public static int field359 = 0;

    @ObfuscatedName("client.es")
    public static int field455 = 2;

    @ObfuscatedName("client.eo")
    public static int field361 = 0;

    @ObfuscatedName("client.eb")
    public static int field362 = 1;

    @ObfuscatedName("client.en")
    public static int field363 = 0;

    @ObfuscatedName("client.ey")
    public static int field518 = 0;

    @ObfuscatedName("client.eu")
    public static int field342 = 2301979;

    @ObfuscatedName("client.ex")
    public static int field366 = 5063219;

    @ObfuscatedName("client.eq")
    public static int field532 = 3353893;

    @ObfuscatedName("client.em")
    public static int field328 = 7759444;

    @ObfuscatedName("client.eh")
    public static boolean field326 = false;

    @ObfuscatedName("client.ed")
    public static int field370 = 0;

    @ObfuscatedName("client.fj")
    public static int field535 = 128;

    @ObfuscatedName("client.fy")
    public static int field373 = 0;

    @ObfuscatedName("client.fi")
    public static int field487 = 0;

    @ObfuscatedName("client.fq")
    public static int field375 = 0;

    @ObfuscatedName("client.fs")
    public static int field376 = 0;

    @ObfuscatedName("client.fm")
    public static int field377 = 0;

    @ObfuscatedName("client.fz")
    public static int field378 = 50;

    @ObfuscatedName("client.fl")
    public static int field379 = 0;

    @ObfuscatedName("client.fe")
    public static boolean field566 = false;

    @ObfuscatedName("client.fg")
    public static int field381 = 0;

    @ObfuscatedName("client.fw")
    public static int field382 = 0;

    @ObfuscatedName("client.fo")
    public static int field383 = 50;

    @ObfuscatedName("client.fd")
    public static int[] field531 = new int[field383];

    @ObfuscatedName("client.ft")
    public static int[] field385 = new int[field383];

    @ObfuscatedName("client.fh")
    public static int[] field386 = new int[field383];

    @ObfuscatedName("client.fn")
    public static int[] field387 = new int[field383];

    @ObfuscatedName("client.fv")
    public static int[] field388 = new int[field383];

    @ObfuscatedName("client.fb")
    public static int[] field294 = new int[field383];

    @ObfuscatedName("client.fp")
    public static int[] field390 = new int[field383];

    @ObfuscatedName("client.gj")
    public static String[] field308 = new String[field383];

    @ObfuscatedName("client.gn")
    public static int[][] field392 = new int[104][104];

    @ObfuscatedName("client.gq")
    public static int field549 = 0;

    @ObfuscatedName("client.ge")
    public static int field348 = -1;

    @ObfuscatedName("client.gx")
    public static int field395 = -1;

    @ObfuscatedName("client.gt")
    public static int field396 = 0;

    @ObfuscatedName("client.gb")
    public static int field397 = 0;

    @ObfuscatedName("client.gz")
    public static int field398 = 0;

    @ObfuscatedName("client.gf")
    public static int field502 = 0;

    @ObfuscatedName("client.gc")
    public static int field400 = 0;

    @ObfuscatedName("client.gk")
    public static int field553 = 0;

    @ObfuscatedName("client.gs")
    public static int field402 = 0;

    @ObfuscatedName("client.gh")
    public static int field403 = 0;

    @ObfuscatedName("client.gy")
    public static int field404 = 0;

    @ObfuscatedName("client.gg")
    public static int field405 = 0;

    @ObfuscatedName("client.gu")
    public static boolean field434 = false;

    @ObfuscatedName("client.gm")
    public static int field407 = 0;

    @ObfuscatedName("client.gw")
    public static int field367 = 0;

    @ObfuscatedName("client.gp")
    public static class24[] field409 = new class24[2048];

    @ObfuscatedName("client.gl")
    public static int field410 = -1;

    @ObfuscatedName("client.go")
    public static int field411 = 0;

    @ObfuscatedName("client.hv")
    public static int field412 = 0;

    @ObfuscatedName("client.hz")
    public static int[] field413 = new int[1000];

    @ObfuscatedName("client.hq")
    public static final int[] field543 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hs")
    public static String[] field415 = new String[8];

    @ObfuscatedName("client.hd")
    public static boolean[] field435 = new boolean[8];

    @ObfuscatedName("client.hy")
    public static int[] field417 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hl")
    public static int field526 = -1;

    @ObfuscatedName("client.hk")
    public static class129[][][] field419 = new class129[4][104][104];

    @ObfuscatedName("client.hj")
    public static class129 field420 = new class129();

    @ObfuscatedName("client.hb")
    public static class129 field511 = new class129();

    @ObfuscatedName("client.hw")
    public static class129 field422 = new class129();

    @ObfuscatedName("client.hn")
    public static int[] field423 = new int[25];

    @ObfuscatedName("client.hc")
    public static int[] field424 = new int[25];

    @ObfuscatedName("client.hg")
    public static int[] field545 = new int[25];

    @ObfuscatedName("client.hf")
    public static int field438 = 0;

    @ObfuscatedName("client.hi")
    public static boolean field427 = false;

    @ObfuscatedName("client.ht")
    public static int field428 = 0;

    @ObfuscatedName("client.hh")
    public static int[] field490 = new int[500];

    @ObfuscatedName("client.hr")
    public static int[] field316 = new int[500];

    @ObfuscatedName("client.ib")
    public static int[] field431 = new int[500];

    @ObfuscatedName("client.iq")
    public static int[] field399 = new int[500];

    @ObfuscatedName("client.ik")
    public static String[] field433 = new String[500];

    @ObfuscatedName("client.in")
    public static String[] field358 = new String[500];

    @ObfuscatedName("client.ih")
    public static int field408 = -1;

    @ObfuscatedName("client.iy")
    public static int field436 = -1;

    @ObfuscatedName("client.iv")
    public static int field437 = 0;

    @ObfuscatedName("client.io")
    public static int field425 = 50;

    @ObfuscatedName("client.ic")
    public static int field439 = 0;

    @ObfuscatedName("client.it")
    public static String field372 = null;

    @ObfuscatedName("client.id")
    public static boolean field441 = false;

    @ObfuscatedName("client.is")
    public static int field442 = -1;

    @ObfuscatedName("client.ip")
    public static int field443 = -1;

    @ObfuscatedName("client.ii")
    public static String field298 = null;

    @ObfuscatedName("client.ir")
    public static String field445 = null;

    @ObfuscatedName("client.if")
    public static int field391 = -1;

    @ObfuscatedName("client.ig")
    public static class126 field447 = new class126(8);

    @ObfuscatedName("client.ij")
    public static int field374 = 0;

    @ObfuscatedName("client.jg")
    public static int field449 = 0;

    @ObfuscatedName("client.jw")
    public static class151 field450 = null;

    @ObfuscatedName("client.jp")
    public static int field451 = 0;

    @ObfuscatedName("client.jz")
    public static int field452 = 0;

    @ObfuscatedName("client.ji")
    public static int field504 = 0;

    @ObfuscatedName("client.jo")
    public static int field460 = -1;

    @ObfuscatedName("client.jy")
    public static boolean field334 = false;

    @ObfuscatedName("client.jj")
    public static boolean field456 = false;

    @ObfuscatedName("client.jh")
    public static boolean field347 = false;

    @ObfuscatedName("client.jf")
    public static class151 field458 = null;

    @ObfuscatedName("client.je")
    public static class151 field384 = null;

    @ObfuscatedName("client.ja")
    public static class151 field341 = null;

    @ObfuscatedName("client.jn")
    public static int field508 = 0;

    @ObfuscatedName("client.jr")
    public static int field462 = 0;

    @ObfuscatedName("client.jl")
    public static class151 field364 = null;

    @ObfuscatedName("client.jm")
    public static boolean field463 = false;

    @ObfuscatedName("client.jb")
    public static int field465 = -1;

    @ObfuscatedName("client.jv")
    public static int field466 = -1;

    @ObfuscatedName("client.jx")
    public static boolean field467 = false;

    @ObfuscatedName("client.ju")
    public static int field468 = -1;

    @ObfuscatedName("client.jq")
    public static int field418 = -1;

    @ObfuscatedName("client.js")
    public static boolean field470 = false;

    @ObfuscatedName("client.kb")
    public static int field471 = 1;

    @ObfuscatedName("client.kl")
    public static int[] field401 = new int[32];

    @ObfuscatedName("client.ky")
    public static int field473 = 0;

    @ObfuscatedName("client.kp")
    public static int[] field474 = new int[32];

    @ObfuscatedName("client.kk")
    public static int field469 = 0;

    @ObfuscatedName("client.kt")
    public static int[] field476 = new int[32];

    @ObfuscatedName("client.kg")
    public static int field477 = 0;

    @ObfuscatedName("client.ke")
    public static int field478 = 0;

    @ObfuscatedName("client.ka")
    public static int field389 = 0;

    @ObfuscatedName("client.kc")
    public static int field480 = 0;

    @ObfuscatedName("client.kn")
    public static int field481 = 0;

    @ObfuscatedName("client.kh")
    public static int field482 = 0;

    @ObfuscatedName("client.kx")
    public static int field380 = 0;

    @ObfuscatedName("client.kd")
    public static int field484 = 0;

    @ObfuscatedName("client.ku")
    public static class129 field485 = new class129();

    @ObfuscatedName("client.kz")
    public static class129 field486 = new class129();

    @ObfuscatedName("client.kj")
    public static class129 field570 = new class129();

    @ObfuscatedName("client.kw")
    public static class126 field503 = new class126(512);

    @ObfuscatedName("client.ki")
    public static int field489 = 0;

    @ObfuscatedName("client.kv")
    public static int field555 = -2;

    @ObfuscatedName("client.ks")
    public static boolean[] field491 = new boolean[100];

    @ObfuscatedName("client.ll")
    public static boolean[] field492 = new boolean[100];

    @ObfuscatedName("client.lx")
    public static boolean[] field493 = new boolean[100];

    @ObfuscatedName("client.ld")
    public static int[] field494 = new int[100];

    @ObfuscatedName("client.lc")
    public static int[] field495 = new int[100];

    @ObfuscatedName("client.lo")
    public static int[] field369 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field497 = new int[100];

    @ObfuscatedName("client.lk")
    public static int field498 = 0;

    @ObfuscatedName("client.ls")
    public static long field499 = 0L;

    @ObfuscatedName("client.lw")
    public static boolean field500 = true;

    @ObfuscatedName("client.lm")
    public static int field501 = 765;

    @ObfuscatedName("client.lu")
    public static int field521 = 503;

    @ObfuscatedName("client.lb")
    public static int[] field322 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lv")
    public static int field365 = 0;

    @ObfuscatedName("client.lj")
    public static int field505 = 0;

    @ObfuscatedName("client.lr")
    public static String field506 = "";

    @ObfuscatedName("client.lg")
    public static long[] field507 = new long[100];

    @ObfuscatedName("client.lh")
    public static int field551 = 0;

    @ObfuscatedName("client.lz")
    public static int field509 = 0;

    @ObfuscatedName("client.lf")
    public static int[] field475 = new int[128];

    @ObfuscatedName("client.mi")
    public static int[] field353 = new int[128];

    @ObfuscatedName("client.mv")
    public static long field512 = -1L;

    @ObfuscatedName("client.mm")
    public static String field513 = null;

    @ObfuscatedName("client.mn")
    public static String field329 = null;

    @ObfuscatedName("client.mf")
    public static int field515 = -1;

    @ObfuscatedName("client.mp")
    public static int field516 = 0;

    @ObfuscatedName("client.mu")
    public static int[] field394 = new int[1000];

    @ObfuscatedName("client.mh")
    public static int[] field429 = new int[1000];

    @ObfuscatedName("client.mr")
    public static class225[] field519 = new class225[1000];

    @ObfuscatedName("client.ms")
    public static int field520 = 0;

    @ObfuscatedName("client.my")
    public static int field312 = 0;

    @ObfuscatedName("client.mq")
    public static int field522 = 0;

    @ObfuscatedName("client.mw")
    public static int field523 = 255;

    @ObfuscatedName("client.ml")
    public static int field319 = -1;

    @ObfuscatedName("client.mt")
    public static boolean field525 = false;

    @ObfuscatedName("client.nh")
    public static int field479 = 127;

    @ObfuscatedName("client.ns")
    public static int field527 = 127;

    @ObfuscatedName("client.nv")
    public static int field528 = 0;

    @ObfuscatedName("client.nl")
    public static int[] field529 = new int[50];

    @ObfuscatedName("client.ng")
    public static int[] field530 = new int[50];

    @ObfuscatedName("client.nq")
    public static int[] field432 = new int[50];

    @ObfuscatedName("client.nc")
    public static int[] field300 = new int[50];

    @ObfuscatedName("client.nb")
    public static class54[] field533 = new class54[50];

    @ObfuscatedName("client.nr")
    public static boolean field534 = false;

    @ObfuscatedName("client.nx")
    public static boolean[] field430 = new boolean[5];

    @ObfuscatedName("client.oc")
    public static int[] field536 = new int[5];

    @ObfuscatedName("client.op")
    public static int[] field537 = new int[5];

    @ObfuscatedName("client.ok")
    public static int[] field538 = new int[5];

    @ObfuscatedName("client.ob")
    public static int[] field472 = new int[5];

    @ObfuscatedName("client.on")
    public static short field540 = 256;

    @ObfuscatedName("client.oa")
    public static short field457 = 205;

    @ObfuscatedName("client.oy")
    public static short field542 = 256;

    @ObfuscatedName("client.ol")
    public static short field459 = 320;

    @ObfuscatedName("client.oq")
    public static short field544 = 1;

    @ObfuscatedName("client.or")
    public static short field541 = 32767;

    @ObfuscatedName("client.ot")
    public static short field546 = 1;

    @ObfuscatedName("client.of")
    public static short field547 = 32767;

    @ObfuscatedName("client.od")
    public static int field548 = 0;

    @ObfuscatedName("client.om")
    public static int field524 = 0;

    @ObfuscatedName("client.oe")
    public static int field539 = 0;

    @ObfuscatedName("client.ou")
    public static int field287 = 0;

    @ObfuscatedName("client.ox")
    public static int field448 = 0;

    @ObfuscatedName("client.ow")
    public static int field517 = 0;

    @ObfuscatedName("client.oz")
    public static int field554 = 0;

    @ObfuscatedName("client.oh")
    public static class15[] field421 = new class15[400];

    @ObfuscatedName("client.os")
    public static class131 field556 = new class131();

    @ObfuscatedName("client.ov")
    public static int field557 = 0;

    @ObfuscatedName("client.oi")
    public static class20[] field558 = new class20[400];

    @ObfuscatedName("client.oj")
    public static class148 field416 = new class148();

    @ObfuscatedName("client.pk")
    public static int field559 = -1;

    @ObfuscatedName("client.pq")
    public static int field561 = -1;

    @ObfuscatedName("client.pm")
    public static class5[] field562 = new class5[8];

    @ObfuscatedName("client.ph")
    public static long field563 = -1L;

    @ObfuscatedName("client.pp")
    public static long field514 = -1L;

    @ObfuscatedName("client.ps")
    public static final class23 field567 = new class23();

    @ObfuscatedName("client.pn")
    public static int[] field550 = new int[50];

    @ObfuscatedName("client.pi")
    public static int[] field301 = new int[50];

    @ObfuscatedName("client.w(I)V")
    public final void method542() {
    }

    public final void init() {
        if (!this.method2001()) {
            return;
        }
        class215[] var1 = new class215[] { class215.field3142, class215.field3151, class215.field3138, class215.field3141, class215.field3139, class215.field3149, class215.field3150, class215.field3148, class215.field3145, class215.field3152, class215.field3147, class215.field3143, class215.field3144, class215.field3140, class215.field3146 };
        class215[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class215 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3153);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3153)) {
                    case 1:
                        if (var5.equalsIgnoreCase(class38.field784)) {
                        }
                    case 2:
                    case 3:
                    case 10:
                    default:
                        break;
                    case 4:
                        int var7 = Integer.parseInt(var5);
                        class179[] var8 = new class179[] { class179.field2684, class179.field2688, class179.field2687, class179.field2682 };
                        class179[] var9 = var8;
                        int var10 = 0;
                        class179 var12;
                        while (true) {
                            if (var10 >= var9.length) {
                                var12 = null;
                                break;
                            }
                            class179 var11 = var9[var10];
                            if (var11.field2683 == var7) {
                                var12 = var11;
                                break;
                            }
                            var10++;
                        }
                        Statics.field286 = var12;
                        break;
                    case 5:
                        field444 = Integer.parseInt(var5);
                        break;
                    case 6:
                        class180[] var6 = new class180[] { class180.field2698, class180.field2692, class180.field2691, class180.field2696, class180.field2694, class180.field2693 };
                        Statics.field759 = (class180) Statics.method1856(var6, Integer.parseInt(var5));
                        if (Statics.field759 == class180.field2698) {
                            Statics.field1741 = class229.field3235;
                        } else {
                            Statics.field1741 = class229.field3242;
                        }
                        break;
                    case 7:
                        field290 = Integer.parseInt(var5);
                        break;
                    case 8:
                        Statics.field1630 = var5;
                        break;
                    case 9:
                        Statics.field292 = Integer.parseInt(var5);
                        break;
                    case 11:
                        Statics.field291 = Integer.parseInt(var5);
                        break;
                    case 12:
                        field285 = Integer.parseInt(var5);
                        break;
                    case 13:
                        Statics.field92 = var5;
                        break;
                    case 14:
                        field284 = Integer.parseInt(var5);
                        break;
                    case 15:
                        if (var5.equalsIgnoreCase(class38.field784)) {
                            field440 = true;
                        } else {
                            field440 = false;
                        }
                }
            }
        }
        class88.field1481 = false;
        field289 = false;
        Statics.field196 = this.getCodeBase().getHost();
        String var13 = Statics.field286.field2681;
        byte var14 = 0;
        try {
            class105.method3031("oldschool", var13, var14, 16);
        } catch (Exception var16) {
            class102.method755((String) null, var16);
        }
        Statics.field282 = this;
        this.method2043(765, 503, 127);
    }

    @ObfuscatedName("client.c(S)V")
    public final void method269() {
        Statics.field220 = field444 == 0 ? 43594 : field284 + 40000;
        Statics.field771 = field444 == 0 ? 443 : field284 + 50000;
        Statics.field56 = Statics.field220;
        Statics.field2042 = class149.field2054;
        Statics.field1824 = class149.field2053;
        Statics.field236 = class149.field2052;
        Statics.field1909 = class149.field2050;
        if (Statics.field1673.toLowerCase().indexOf("microsoft") == -1) {
            class106.field1722[44] = 71;
            class106.field1722[45] = 26;
            class106.field1722[46] = 72;
            class106.field1722[47] = 73;
            class106.field1722[59] = 57;
            class106.field1722[61] = 27;
            class106.field1722[91] = 42;
            class106.field1722[92] = 74;
            class106.field1722[93] = 43;
            class106.field1722[192] = 28;
            class106.field1722[222] = 58;
            class106.field1722[520] = 59;
        } else {
            class106.field1722[186] = 57;
            class106.field1722[187] = 27;
            class106.field1722[188] = 71;
            class106.field1722[189] = 26;
            class106.field1722[190] = 72;
            class106.field1722[191] = 73;
            class106.field1722[192] = 58;
            class106.field1722[219] = 42;
            class106.field1722[220] = 74;
            class106.field1722[221] = 43;
            class106.field1722[222] = 59;
            class106.field1722[223] = 28;
        }
        class106.method1058(Statics.field1726);
        Canvas var1 = Statics.field1726;
        var1.addMouseListener(class116.field1800);
        var1.addMouseMotionListener(class116.field1800);
        var1.addFocusListener(class116.field1800);
        class107 var2;
        try {
            var2 = new class107();
        } catch (Throwable var15) {
            var2 = null;
        }
        Statics.field2733 = var2;
        if (Statics.field2733 != null) {
            Statics.field2733.method1938(Statics.field1726);
        }
        Statics.field896 = new class117(255, class105.field1681, class105.field1688, 500000);
        class74 var4 = null;
        class31 var5 = new class31();
        try {
            var4 = class105.method2171("", Statics.field759.field2697, false);
            byte[] var6 = new byte[(int) var4.method1349()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method1354(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class31(new class161(var6));
        } catch (Exception var16) {
        }
        try {
            if (var4 != null) {
                var4.method1352();
            }
        } catch (Exception var14) {
        }
        Statics.field1344 = var5;
        Statics.field1601 = this.getToolkit().getSystemClipboard();
        String var13 = Statics.field235;
        class115.field1794 = this;
        class115.field1795 = var13;
        if (field444 != 0) {
            field564 = true;
        }
        method195(Statics.field1344.field693);
    }

    @ObfuscatedName("client.z(I)V")
    public final void method294() {
        field295++;
        this.method390();
        class184.method1353();
        try {
            if (class139.field1918 == 1) {
                int var1 = Statics.field1920.method2375();
                if (var1 > 0 && Statics.field1920.method2381()) {
                    int var2 = var1 - Statics.field1793;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field1920.method2374(var2);
                } else {
                    Statics.field1920.method2380();
                    Statics.field1920.method2406();
                    if (Statics.field13 == null) {
                        class139.field1918 = 0;
                    } else {
                        class139.field1918 = 2;
                    }
                    Statics.field2289 = null;
                    Statics.field761 = null;
                }
            }
        } catch (Exception var146) {
            var146.printStackTrace();
            Statics.field1920.method2380();
            class139.field1918 = 0;
            Statics.field2289 = null;
            Statics.field761 = null;
            Statics.field13 = null;
        }
        method186();
        Statics.method193();
        class116.method721();
        if (Statics.field2733 != null) {
            int var4 = Statics.field2733.method1939();
            field484 = var4;
        }
        if (field293 == 0) {
            method1647();
            class114.method605();
        } else if (field293 == 5) {
            class42.method1061(this);
            method1647();
            class114.method605();
        } else if (field293 == 10 || field293 == 11) {
            class42.method1061(this);
        } else if (field293 == 20) {
            class42.method1061(this);
            Statics.method1965();
        } else if (field293 == 25) {
            method212();
        }
        if (field293 == 30) {
            if (field302 > 1) {
                field302--;
            }
            if (field406 > 0) {
                field406--;
            }
            if (field426) {
                field426 = false;
                if (field406 > 0) {
                    method2056();
                } else {
                    method3231(40);
                    Statics.field177 = Statics.field1184;
                    Statics.field1184 = null;
                }
            } else {
                if (!field427) {
                    field433[0] = class174.field2606;
                    field358[0] = "";
                    field431[0] = 1006;
                    field428 = 1;
                }
                for (int var5 = 0; var5 < 100 && method627(); var5++) {
                }
                if (field293 == 30) {
                    while (class228.method3549()) {
                        field331.method3010(134);
                        field331.method2765(0);
                        int var6 = field331.field2285;
                        class228.method3769(field331);
                        field331.method2780(field331.field2285 - var6);
                    }
                    Object var7 = Statics.field1730.field223;
                    synchronized (Statics.field1730.field223) {
                        if (!field317) {
                            Statics.field1730.field215 = 0;
                        } else if (class116.field1809 != 0 || Statics.field1730.field215 >= 40) {
                            field331.method3010(186);
                            field331.method2765(0);
                            int var8 = field331.field2285;
                            int var9 = 0;
                            for (int var10 = 0; var10 < Statics.field1730.field215 && field331.field2285 - var8 < 240; var10++) {
                                var9++;
                                int var11 = Statics.field1730.field218[var10];
                                if (var11 < 0) {
                                    var11 = 0;
                                } else if (var11 > 502) {
                                    var11 = 502;
                                }
                                int var12 = Statics.field1730.field217[var10];
                                if (var12 < 0) {
                                    var12 = 0;
                                } else if (var12 > 764) {
                                    var12 = 764;
                                }
                                int var13 = var11 * 765 + var12;
                                if (Statics.field1730.field218[var10] == -1 && Statics.field1730.field217[var10] == -1) {
                                    var12 = -1;
                                    var11 = -1;
                                    var13 = 524287;
                                }
                                if (field297 != var12 || field393 != var11) {
                                    int var14 = var12 - field297;
                                    field297 = var12;
                                    int var15 = var11 - field393;
                                    field393 = var11;
                                    if (field299 < 8 && var14 >= -32 && var14 <= 31 && var15 >= -32 && var15 <= 31) {
                                        var14 += 32;
                                        var15 += 32;
                                        field331.method2766((field299 << 12) + (var14 << 6) + var15);
                                        field299 = 0;
                                    } else if (field299 < 8) {
                                        field331.method2767((field299 << 19) + 8388608 + var13);
                                        field299 = 0;
                                    } else {
                                        field331.method2768((field299 << 19) + -1073741824 + var13);
                                        field299 = 0;
                                    }
                                } else if (field299 < 2047) {
                                    field299++;
                                }
                            }
                            field331.method2780(field331.field2285 - var8);
                            if (var9 >= Statics.field1730.field215) {
                                Statics.field1730.field215 = 0;
                            } else {
                                Statics.field1730.field215 -= var9;
                                for (int var16 = 0; var16 < Statics.field1730.field215; var16++) {
                                    Statics.field1730.field217[var16] = Statics.field1730.field217[var9 + var16];
                                    Statics.field1730.field218[var16] = Statics.field1730.field218[var9 + var16];
                                }
                            }
                        }
                    }
                    if (class116.field1809 == 1 || !Statics.field230 && class116.field1809 == 4 || class116.field1809 == 2) {
                        long var18 = (class116.field1797 - field296 * -1L) / 50L;
                        if (var18 > 4095L) {
                            var18 = 4095L;
                        }
                        field296 = class116.field1797 * -1L;
                        int var20 = class116.field1807;
                        if (var20 < 0) {
                            var20 = 0;
                        } else if (var20 > Statics.field1104) {
                            var20 = Statics.field1104;
                        }
                        int var21 = class116.field1810;
                        if (var21 < 0) {
                            var21 = 0;
                        } else if (var21 > Statics.field170) {
                            var21 = Statics.field170;
                        }
                        int var22 = (int) var18;
                        field331.method3010(55);
                        field331.method2766((class116.field1809 == 2 ? 1 : 0) + (var22 << 1));
                        field331.method2766(var21);
                        field331.method2766(var20);
                    }
                    if (class106.field1717 > 0) {
                        field331.method3010(166);
                        field331.method2766(0);
                        int var23 = field331.field2285;
                        long var24 = class163.method3594();
                        for (int var26 = 0; var26 < class106.field1717; var26++) {
                            long var27 = var24 - field512;
                            if (var27 > 16777215L) {
                                var27 = 16777215L;
                            }
                            field512 = var24;
                            field331.method2776(class106.field1716[var26]);
                            field331.method2820((int) var27);
                        }
                        field331.method2917(field331.field2285 - var23);
                    }
                    if (field379 > 0) {
                        field379--;
                    }
                    if (class106.field1710[96] || class106.field1710[97] || class106.field1710[98] || class106.field1710[99]) {
                        field566 = true;
                    }
                    if (field566 && field379 <= 0) {
                        field379 = 20;
                        field566 = false;
                        field331.method3010(255);
                        field331.method2766(field535);
                        field331.method2813(field373);
                    }
                    if (Statics.field1084 && !field288) {
                        field288 = true;
                        field331.method3010(49);
                        field331.method2765(1);
                    }
                    if (!Statics.field1084 && field288) {
                        field288 = false;
                        field331.method3010(49);
                        field331.method2765(0);
                    }
                    if (Statics.field2326 != field515) {
                        field515 = Statics.field2326;
                        method682(Statics.field2326);
                    }
                    if (field293 == 30) {
                        for (class26 var29 = (class26) field420.method2290(); var29 != null; var29 = (class26) field420.method2285()) {
                            if (var29.field583 > 0) {
                                var29.field583--;
                            }
                            if (var29.field583 == 0) {
                                if (var29.field576 >= 0) {
                                    int var30 = var29.field576;
                                    int var31 = var29.field585;
                                    class198 var32 = class198.method197(var30);
                                    if (var31 == 11) {
                                        var31 = 10;
                                    }
                                    if (var31 >= 5 && var31 <= 8) {
                                        var31 = 4;
                                    }
                                    boolean var33 = var32.method3409(var31);
                                    if (!var33) {
                                        continue;
                                    }
                                }
                                method3078(var29.field574, var29.field578, var29.field579, var29.field575, var29.field576, var29.field573, var29.field585);
                                var29.method2273();
                            } else {
                                if (var29.field582 > 0) {
                                    var29.field582--;
                                }
                                if (var29.field582 == 0 && var29.field579 >= 1 && var29.field575 >= 1 && var29.field579 <= 102 && var29.field575 <= 102) {
                                    if (var29.field580 >= 0) {
                                        int var34 = var29.field580;
                                        int var35 = var29.field581;
                                        class198 var36 = class198.method197(var34);
                                        if (var35 == 11) {
                                            var35 = 10;
                                        }
                                        if (var35 >= 5 && var35 <= 8) {
                                            var35 = 4;
                                        }
                                        boolean var37 = var36.method3409(var35);
                                        if (!var37) {
                                            continue;
                                        }
                                    }
                                    method3078(var29.field574, var29.field578, var29.field579, var29.field575, var29.field580, var29.field584, var29.field581);
                                    var29.field582 = -1;
                                    if (var29.field580 == var29.field576 && var29.field576 == -1) {
                                        var29.method2273();
                                    } else if (var29.field580 == var29.field576 && var29.field584 == var29.field573 && var29.field585 == var29.field581) {
                                        var29.method2273();
                                    }
                                }
                            }
                        }
                        int var10002;
                        for (int var38 = 0; var38 < field528; var38++) {
                            var10002 = field432[var38]--;
                            if (field432[var38] >= -10) {
                                class54 var40 = field533[var38];
                                if (var40 == null) {
                                    class54 var10000 = (class54) null;
                                    var40 = class54.method943(Statics.field2037, field529[var38], 0);
                                    if (var40 == null) {
                                        continue;
                                    }
                                    field432[var38] += var40.method938();
                                    field533[var38] = var40;
                                }
                                if (field432[var38] < 0) {
                                    int var47;
                                    if (field300[var38] == 0) {
                                        var47 = field479;
                                    } else {
                                        int var41 = (field300[var38] & 0xFF) * 128;
                                        int var42 = field300[var38] >> 16 & 0xFF;
                                        int var43 = var42 * 128 + 64 - Statics.field810.field648;
                                        if (var43 < 0) {
                                            var43 = -var43;
                                        }
                                        int var44 = field300[var38] >> 8 & 0xFF;
                                        int var45 = var44 * 128 + 64 - Statics.field810.field597;
                                        if (var45 < 0) {
                                            var45 = -var45;
                                        }
                                        int var46 = var43 + var45 - 128;
                                        if (var46 > var41) {
                                            field432[var38] = -100;
                                            continue;
                                        }
                                        if (var46 < 0) {
                                            var46 = 0;
                                        }
                                        var47 = field527 * (var41 - var46) / var41;
                                    }
                                    if (var47 > 0) {
                                        class56 var48 = var40.method937().method987(Statics.field36);
                                        class67 var49 = class67.method1122(var48, 100, var47);
                                        var49.method1138(field530[var38] - 1);
                                        Statics.field2008.method882(var49);
                                    }
                                    field432[var38] = -100;
                                }
                            } else {
                                field528--;
                                for (int var39 = var38; var39 < field528; var39++) {
                                    field529[var39] = field529[var39 + 1];
                                    field533[var39] = field533[var39 + 1];
                                    field530[var39] = field530[var39 + 1];
                                    field432[var39] = field432[var39 + 1];
                                    field300[var39] = field300[var39 + 1];
                                }
                                var38--;
                            }
                        }
                        if (field525 && !class139.method2978()) {
                            if (field523 != 0 && field319 != -1) {
                                class139.method2173(Statics.field747, field319, 0, field523, false);
                            }
                            field525 = false;
                        }
                        field336++;
                        if (field336 <= 750) {
                            method1113();
                            for (int var50 = 0; var50 < field327; var50++) {
                                int var51 = field560[var50];
                                class36 var52 = field461[var51];
                                if (var52 != null) {
                                    method1866(var52, var52.field757.field3010);
                                }
                            }
                            method196();
                            field518++;
                            if (field502 != 0) {
                                field398 += 20;
                                if (field398 >= 400) {
                                    field502 = 0;
                                }
                            }
                            if (Statics.field1615 != null) {
                                field400++;
                                if (field400 >= 15) {
                                    method1487(Statics.field1615);
                                    Statics.field1615 = null;
                                }
                            }
                            class151 var53 = Statics.field803;
                            class151 var54 = Statics.field1724;
                            Statics.field803 = null;
                            Statics.field1724 = null;
                            field364 = null;
                            field467 = false;
                            field463 = false;
                            field509 = 0;
                            while (true) {
                                while (class106.method731() && field509 < 128) {
                                    if (field504 >= 2 && class106.field1710[82] && Statics.field26 == 66) {
                                        String var55 = "";
                                        Iterator var56 = class48.field926.iterator();
                                        while (var56.hasNext()) {
                                            class22 var57 = (class22) var56.next();
                                            var55 = var55 + var57.field228 + ':' + var57.field233 + '\n';
                                        }
                                        Statics.field1601.setContents(new StringSelection(var55), (ClipboardOwner) null);
                                    } else {
                                        field353[field509] = Statics.field26;
                                        field475[field509] = Statics.field2318;
                                        field509++;
                                    }
                                }
                                if (field391 != -1) {
                                    int var60 = field391;
                                    int var61 = Statics.field170;
                                    int var62 = Statics.field1104;
                                    if (class151.method1075(var60)) {
                                        method1480(Statics.field2173[var60], -1, 0, 0, var61, var62, 0, 0);
                                    }
                                }
                                field471++;
                                while (true) {
                                    class19 var63;
                                    class151 var64;
                                    class151 var65;
                                    do {
                                        var63 = (class19) field486.method2298();
                                        if (var63 == null) {
                                            while (true) {
                                                class19 var66;
                                                class151 var67;
                                                class151 var68;
                                                do {
                                                    var66 = (class19) field570.method2298();
                                                    if (var66 == null) {
                                                        while (true) {
                                                            class19 var69;
                                                            class151 var70;
                                                            class151 var71;
                                                            do {
                                                                var69 = (class19) field485.method2298();
                                                                if (var69 == null) {
                                                                    boolean var72 = false;
                                                                    while (!var72) {
                                                                        var72 = true;
                                                                        for (int var73 = 0; var73 < field428 - 1; var73++) {
                                                                            if (field431[var73] < 1000 && field431[var73 + 1] > 1000) {
                                                                                String var74 = field358[var73];
                                                                                field358[var73] = field358[var73 + 1];
                                                                                field358[var73 + 1] = var74;
                                                                                String var75 = field433[var73];
                                                                                field433[var73] = field433[var73 + 1];
                                                                                field433[var73 + 1] = var75;
                                                                                int var76 = field431[var73];
                                                                                field431[var73] = field431[var73 + 1];
                                                                                field431[var73 + 1] = var76;
                                                                                int var77 = field490[var73];
                                                                                field490[var73] = field490[var73 + 1];
                                                                                field490[var73 + 1] = var77;
                                                                                int var78 = field316[var73];
                                                                                field316[var73] = field316[var73 + 1];
                                                                                field316[var73 + 1] = var78;
                                                                                int var79 = field399[var73];
                                                                                field399[var73] = field399[var73 + 1];
                                                                                field399[var73 + 1] = var79;
                                                                                var72 = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (Statics.field2314 == null && field384 == null) {
                                                                        int var80 = class116.field1809;
                                                                        if (field427) {
                                                                            if (var80 != 1 && (Statics.field230 || var80 != 4)) {
                                                                                int var81 = class116.field1812;
                                                                                int var82 = class116.field1811 * 853340747;
                                                                                if (var81 < Statics.field879 - 10 || var81 > Statics.field879 + Statics.field782 + 10 || var82 < Statics.field279 - 10 || var82 > Statics.field279 + Statics.field221 + 10) {
                                                                                    field427 = false;
                                                                                    method808(Statics.field879, Statics.field279, Statics.field782, Statics.field221);
                                                                                }
                                                                            }
                                                                            if (var80 == 1 || !Statics.field230 && var80 == 4) {
                                                                                int var83 = Statics.field879;
                                                                                int var84 = Statics.field279;
                                                                                int var85 = Statics.field782;
                                                                                int var86 = class116.field1810;
                                                                                int var87 = class116.field1807;
                                                                                int var88 = -1;
                                                                                for (int var89 = 0; var89 < field428; var89++) {
                                                                                    int var90 = (field428 - 1 - var89) * 15 + var84 + 31;
                                                                                    if (var86 > var83 && var86 < var83 + var85 && var87 > var90 - 13 && var87 < var90 + 3) {
                                                                                        var88 = var89;
                                                                                    }
                                                                                }
                                                                                if (var88 != -1 && var88 >= 0) {
                                                                                    int var91 = field490[var88];
                                                                                    int var92 = field316[var88];
                                                                                    int var93 = field431[var88];
                                                                                    int var94 = field399[var88];
                                                                                    String var95 = field433[var88];
                                                                                    String var96 = field358[var88];
                                                                                    method3320(var91, var92, var93, var94, var95, var96, class116.field1810, class116.field1807);
                                                                                }
                                                                                field427 = false;
                                                                                method808(Statics.field879, Statics.field279, Statics.field782, Statics.field221);
                                                                            }
                                                                        } else {
                                                                            label1263: {
                                                                                if ((var80 == 1 || !Statics.field230 && var80 == 4) && field428 > 0) {
                                                                                    int var97 = field431[field428 - 1];
                                                                                    if (var97 == 39 || var97 == 40 || var97 == 41 || var97 == 42 || var97 == 43 || var97 == 33 || var97 == 34 || var97 == 35 || var97 == 36 || var97 == 37 || var97 == 38 || var97 == 1005) {
                                                                                        label1250: {
                                                                                            int var98 = field490[field428 - 1];
                                                                                            int var99 = field316[field428 - 1];
                                                                                            class151 var100 = class151.method80(var99);
                                                                                            if (!class152.method852(method3219(var100))) {
                                                                                                int var101 = method3219(var100);
                                                                                                boolean var102 = (var101 >> 29 & 0x1) != 0;
                                                                                                if (!var102) {
                                                                                                    break label1250;
                                                                                                }
                                                                                            }
                                                                                            if (Statics.field2314 != null && !field434 && field438 != 1 && !method723(field428 - 1) && field428 > 0) {
                                                                                                method607(field403, field404);
                                                                                            }
                                                                                            field434 = false;
                                                                                            field407 = 0;
                                                                                            if (Statics.field2314 != null) {
                                                                                                method1487(Statics.field2314);
                                                                                            }
                                                                                            Statics.field2314 = class151.method80(var99);
                                                                                            field402 = var98;
                                                                                            field403 = class116.field1810;
                                                                                            field404 = class116.field1807;
                                                                                            if (field428 > 0) {
                                                                                                int var103 = field428 - 1;
                                                                                                Statics.field20 = new class39();
                                                                                                Statics.field20.field799 = field490[var103];
                                                                                                Statics.field20.field792 = field316[var103];
                                                                                                Statics.field20.field793 = field431[var103];
                                                                                                Statics.field20.field794 = field399[var103];
                                                                                                Statics.field20.field791 = field433[var103];
                                                                                            }
                                                                                            method1487(Statics.field2314);
                                                                                            break label1263;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if ((var80 == 1 || !Statics.field230 && var80 == 4) && (field438 == 1 && field428 > 2 || method723(field428 - 1))) {
                                                                                    var80 = 2;
                                                                                }
                                                                                if ((var80 == 1 || !Statics.field230 && var80 == 4) && field428 > 0) {
                                                                                    int var104 = field428 - 1;
                                                                                    if (var104 >= 0) {
                                                                                        int var105 = field490[var104];
                                                                                        int var106 = field316[var104];
                                                                                        int var107 = field431[var104];
                                                                                        int var108 = field399[var104];
                                                                                        String var109 = field433[var104];
                                                                                        String var110 = field358[var104];
                                                                                        method3320(var105, var106, var107, var108, var109, var110, class116.field1810, class116.field1807);
                                                                                    }
                                                                                }
                                                                                if (var80 == 2 && field428 > 0) {
                                                                                    method1395(class116.field1810, class116.field1807);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (field384 != null) {
                                                                        method1487(field384);
                                                                        Statics.field1290++;
                                                                        if (field467 && field463) {
                                                                            int var111 = class116.field1812;
                                                                            int var112 = class116.field1811 * 853340747;
                                                                            int var113 = var111 - field508;
                                                                            int var114 = var112 - field462;
                                                                            if (var113 < field465) {
                                                                                var113 = field465;
                                                                            }
                                                                            if (field384.field2110 + var113 > field465 + field341.field2110) {
                                                                                var113 = field465 + field341.field2110 - field384.field2110;
                                                                            }
                                                                            if (var114 < field466) {
                                                                                var114 = field466;
                                                                            }
                                                                            if (field384.field2086 + var114 > field466 + field341.field2086) {
                                                                                var114 = field466 + field341.field2086 - field384.field2086;
                                                                            }
                                                                            int var115 = var113 - field468;
                                                                            int var116 = var114 - field418;
                                                                            int var117 = field384.field2126;
                                                                            if (Statics.field1290 > field384.field2147 && (var115 > var117 || var115 < -var117 || var116 > var117 || var116 < -var117)) {
                                                                                field470 = true;
                                                                            }
                                                                            int var118 = field341.field2166 + (var113 - field465);
                                                                            int var119 = field341.field2092 + (var114 - field466);
                                                                            if (field384.field2159 != null && field470) {
                                                                                class19 var120 = new class19();
                                                                                var120.field193 = field384;
                                                                                var120.field185 = var118;
                                                                                var120.field186 = var119;
                                                                                var120.field197 = field384.field2159;
                                                                                class33.method3007(var120, 200000);
                                                                            }
                                                                            if (class116.field1802 == 0) {
                                                                                if (field470) {
                                                                                    if (field384.field2059 != null) {
                                                                                        class19 var121 = new class19();
                                                                                        var121.field193 = field384;
                                                                                        var121.field185 = var118;
                                                                                        var121.field186 = var119;
                                                                                        var121.field188 = field364;
                                                                                        var121.field197 = field384.field2059;
                                                                                        class33.method3007(var121, 200000);
                                                                                    }
                                                                                    if (field364 != null) {
                                                                                        class151 var122 = field384;
                                                                                        int var123 = class152.method3342(method3219(var122));
                                                                                        class151 var124;
                                                                                        if (var123 == 0) {
                                                                                            var124 = null;
                                                                                        } else {
                                                                                            int var125 = 0;
                                                                                            while (true) {
                                                                                                if (var125 >= var123) {
                                                                                                    var124 = var122;
                                                                                                    break;
                                                                                                }
                                                                                                var122 = class151.method80(var122.field2089);
                                                                                                if (var122 == null) {
                                                                                                    var124 = null;
                                                                                                    break;
                                                                                                }
                                                                                                var125++;
                                                                                            }
                                                                                        }
                                                                                        if (var124 != null) {
                                                                                            field331.method3010(164);
                                                                                            field331.method2766(field364.field2124);
                                                                                            field331.method2813(field384.field2105);
                                                                                            field331.method2768(field384.field2070);
                                                                                            field331.method2973(field384.field2124);
                                                                                            field331.method2801(field364.field2070);
                                                                                            field331.method2973(field364.field2105);
                                                                                        }
                                                                                    }
                                                                                } else if ((field438 == 1 || method723(field428 - 1)) && field428 > 2) {
                                                                                    method1395(field508 + field468, field462 + field418);
                                                                                } else if (field428 > 0) {
                                                                                    method607(field508 + field468, field462 + field418);
                                                                                }
                                                                                field384 = null;
                                                                            }
                                                                        } else if (Statics.field1290 > 1) {
                                                                            field384 = null;
                                                                        }
                                                                    }
                                                                    if (Statics.field2314 != null) {
                                                                        method1487(Statics.field2314);
                                                                        field407++;
                                                                        if (class116.field1802 == 0) {
                                                                            if (field434) {
                                                                                if (Statics.field2314 == Statics.field1604 && field405 != field402) {
                                                                                    class151 var126 = Statics.field2314;
                                                                                    byte var127 = 0;
                                                                                    if (field449 == 1 && var126.field2074 == 206) {
                                                                                        var127 = 1;
                                                                                    }
                                                                                    if (var126.field2188[field405] <= 0) {
                                                                                        var127 = 0;
                                                                                    }
                                                                                    int var128 = method3219(var126);
                                                                                    boolean var129 = (var128 >> 29 & 0x1) != 0;
                                                                                    if (var129) {
                                                                                        int var130 = field402;
                                                                                        int var131 = field405;
                                                                                        var126.field2188[var131] = var126.field2188[var130];
                                                                                        var126.field2185[var131] = var126.field2185[var130];
                                                                                        var126.field2188[var130] = -1;
                                                                                        var126.field2185[var130] = 0;
                                                                                    } else if (var127 == 1) {
                                                                                        int var132 = field402;
                                                                                        int var133 = field405;
                                                                                        while (var132 != var133) {
                                                                                            if (var132 > var133) {
                                                                                                var126.method2631(var132 - 1, var132);
                                                                                                var132--;
                                                                                            } else if (var132 < var133) {
                                                                                                var126.method2631(var132 + 1, var132);
                                                                                                var132++;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        var126.method2631(field405, field402);
                                                                                    }
                                                                                    field331.method3010(182);
                                                                                    field331.method2801(Statics.field2314.field2070);
                                                                                    field331.method2766(field405);
                                                                                    field331.method2963(var127);
                                                                                    field331.method2766(field402);
                                                                                }
                                                                            } else if ((field438 == 1 || method723(field428 - 1)) && field428 > 2) {
                                                                                method1395(field403, field404);
                                                                            } else if (field428 > 0) {
                                                                                method607(field403, field404);
                                                                            }
                                                                            field400 = 10;
                                                                            class116.field1809 = 0;
                                                                            Statics.field2314 = null;
                                                                        } else if (field407 >= 5 && (class116.field1812 > field403 + 5 || class116.field1812 < field403 - 5 || class116.field1811 * 853340747 > field404 + 5 || class116.field1811 * 853340747 < field404 - 5)) {
                                                                            field434 = true;
                                                                        }
                                                                    }
                                                                    if (class88.field1507 != -1) {
                                                                        int var134 = class88.field1507;
                                                                        int var135 = class88.field1508;
                                                                        field331.method3010(214);
                                                                        field331.method2765(5);
                                                                        field331.method2766(Statics.field171 + var134);
                                                                        field331.method2888(class106.field1710[82] ? (class106.field1710[81] ? 2 : 1) : 0);
                                                                        field331.method2973(Statics.field464 + var135);
                                                                        class88.field1507 = -1;
                                                                        field396 = class116.field1810;
                                                                        field397 = class116.field1807;
                                                                        field502 = 1;
                                                                        field398 = 0;
                                                                        field520 = var134;
                                                                        field312 = var135;
                                                                    }
                                                                    if (Statics.field803 != var53) {
                                                                        if (var53 != null) {
                                                                            method1487(var53);
                                                                        }
                                                                        if (Statics.field803 != null) {
                                                                            method1487(Statics.field803);
                                                                        }
                                                                    }
                                                                    if (Statics.field1724 != var54 && field437 == field425) {
                                                                        if (var54 != null) {
                                                                            method1487(var54);
                                                                        }
                                                                        if (Statics.field1724 != null) {
                                                                            method1487(Statics.field1724);
                                                                        }
                                                                    }
                                                                    if (Statics.field1724 == null) {
                                                                        if (field437 > 0) {
                                                                            field437--;
                                                                        }
                                                                    } else if (field437 < field425) {
                                                                        field437++;
                                                                        if (field437 == field425) {
                                                                            method1487(Statics.field1724);
                                                                        }
                                                                    }
                                                                    method751();
                                                                    if (field534) {
                                                                        method1964();
                                                                    }
                                                                    for (int var136 = 0; var136 < 5; var136++) {
                                                                        var10002 = field472[var136]++;
                                                                    }
                                                                    Statics.field30.method826();
                                                                    int var137 = class116.method190();
                                                                    int var138 = class106.field1721;
                                                                    if (var137 > 15000 && var138 > 15000) {
                                                                        field406 = 250;
                                                                        class116.method616(14500);
                                                                        field331.method3010(4);
                                                                    }
                                                                    field496++;
                                                                    if (field496 > 500) {
                                                                        field496 = 0;
                                                                        int var140 = (int) (Math.random() * 8.0D);
                                                                        if ((var140 & 0x1) == 1) {
                                                                            field352 += field510;
                                                                        }
                                                                        if ((var140 & 0x2) == 2) {
                                                                            field354 += field355;
                                                                        }
                                                                        if ((var140 & 0x4) == 4) {
                                                                            field356 += field357;
                                                                        }
                                                                    }
                                                                    if (field352 < -50) {
                                                                        field510 = 2;
                                                                    }
                                                                    if (field352 > 50) {
                                                                        field510 = -2;
                                                                    }
                                                                    if (field354 < -55) {
                                                                        field355 = 2;
                                                                    }
                                                                    if (field354 > 55) {
                                                                        field355 = -2;
                                                                    }
                                                                    if (field356 < -40) {
                                                                        field357 = 1;
                                                                    }
                                                                    if (field356 > 40) {
                                                                        field357 = -1;
                                                                    }
                                                                    field363++;
                                                                    if (field363 > 500) {
                                                                        field363 = 0;
                                                                        int var141 = (int) (Math.random() * 8.0D);
                                                                        if ((var141 & 0x1) == 1) {
                                                                            field359 += field455;
                                                                        }
                                                                        if ((var141 & 0x2) == 2) {
                                                                            field361 += field362;
                                                                        }
                                                                    }
                                                                    if (field359 < -60) {
                                                                        field455 = 2;
                                                                    }
                                                                    if (field359 > 60) {
                                                                        field455 = -2;
                                                                    }
                                                                    if (field361 < -20) {
                                                                        field362 = 1;
                                                                    }
                                                                    if (field361 > 10) {
                                                                        field362 = -1;
                                                                    }
                                                                    for (class17 var142 = (class17) field556.method2313(); var142 != null; var142 = (class17) field556.method2312()) {
                                                                        if ((long) var142.field169 < class163.method3594() / 1000L - 5L) {
                                                                            if (var142.field163 > 0) {
                                                                                class48.method121(5, "", var142.field164 + class174.field2514);
                                                                            }
                                                                            if (var142.field163 == 0) {
                                                                                class48.method121(5, "", var142.field164 + class174.field2515);
                                                                            }
                                                                            var142.method2325();
                                                                        }
                                                                    }
                                                                    field337++;
                                                                    if (field337 > 50) {
                                                                        field331.method3010(155);
                                                                    }
                                                                    try {
                                                                        if (Statics.field1184 != null && field331.field2285 > 0) {
                                                                            Statics.field1184.method1970(field331.field2291, 0, field331.field2285);
                                                                            field331.field2285 = 0;
                                                                            field337 = 0;
                                                                            return;
                                                                        }
                                                                    } catch (IOException var144) {
                                                                        if (field406 > 0) {
                                                                            method2056();
                                                                        } else {
                                                                            method3231(40);
                                                                            Statics.field177 = Statics.field1184;
                                                                            Statics.field1184 = null;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                var70 = var69.field193;
                                                                if (var70.field2124 < 0) {
                                                                    break;
                                                                }
                                                                var71 = class151.method80(var70.field2089);
                                                            } while (var71 == null || var71.field2194 == null || var70.field2124 >= var71.field2194.length || var71.field2194[var70.field2124] != var70);
                                                            class33.method3007(var69, 200000);
                                                        }
                                                    }
                                                    var67 = var66.field193;
                                                    if (var67.field2124 < 0) {
                                                        break;
                                                    }
                                                    var68 = class151.method80(var67.field2089);
                                                } while (var68 == null || var68.field2194 == null || var67.field2124 >= var68.field2194.length || var68.field2194[var67.field2124] != var67);
                                                class33.method3007(var66, 200000);
                                            }
                                        }
                                        var64 = var63.field193;
                                        if (var64.field2124 < 0) {
                                            break;
                                        }
                                        var65 = class151.method80(var64.field2089);
                                    } while (var65 == null || var65.field2194 == null || var64.field2124 >= var65.field2194.length || var65.field2194[var64.field2124] != var64);
                                    class33.method3007(var63, 200000);
                                }
                            }
                        } else if (field406 > 0) {
                            method2056();
                        } else {
                            method3231(40);
                            Statics.field177 = Statics.field1184;
                            Statics.field1184 = null;
                        }
                    }
                }
            }
        } else if (field293 == 40 || field293 == 45) {
            Statics.method1965();
        }
    }

    @ObfuscatedName("client.q(B)V")
    public final void method355() {
        boolean var1 = class139.method629();
        if (var1 && field525 && Statics.field115 != null) {
            Statics.field115.method1012();
        }
        if (field293 == 10 || field293 == 20 || field293 == 30) {
            if (field499 != 0L && class163.method3594() > field499) {
                int var2 = method1932();
                field499 = 0L;
                if (var2 >= 2) {
                    field500 = true;
                } else {
                    field500 = false;
                }
                method3482();
                if (field293 >= 25) {
                    method722();
                }
                field1781 = true;
            } else if (field1769) {
                method3770();
            }
        }
        Dimension var3 = this.method2011();
        if (Statics.field2323 != var3.width || Statics.field954 != var3.height || field1783) {
            method3482();
            field499 = class163.method3594() + 500L;
            field1783 = false;
        }
        boolean var4 = false;
        if (field1781) {
            field1781 = false;
            var4 = true;
            for (int var5 = 0; var5 < 100; var5++) {
                field491[var5] = true;
            }
        }
        if (var4) {
            method204();
        }
        if (field293 == 0) {
            class114.method2745(class42.field834, class42.field827, (Color) null, var4);
        } else if (field293 == 5) {
            class42.method2684(Statics.field2237, Statics.field1294, Statics.field46, var4);
        } else if (field293 == 10 || field293 == 11) {
            class42.method2684(Statics.field2237, Statics.field1294, Statics.field46, var4);
        } else if (field293 == 20) {
            class42.method2684(Statics.field2237, Statics.field1294, Statics.field46, var4);
        } else if (field293 == 25) {
            if (field368 == 1) {
                if (field343 > field344) {
                    field344 = field343;
                }
                int var6 = (field344 * 50 - field343 * 50) / field344;
                method666(class174.field2379 + class38.field780 + class38.field774 + var6 + "%" + class38.field787, false);
            } else if (field368 == 2) {
                if (field345 > field346) {
                    field346 = field345;
                }
                int var7 = (field346 * 50 - field345 * 50) / field346 + 50;
                method666(class174.field2379 + class38.field780 + class38.field774 + var7 + "%" + class38.field787, false);
            } else {
                method666(class174.field2379, false);
            }
        } else if (field293 == 30) {
            method185();
        } else if (field293 == 40) {
            method666(class174.field2372 + class38.field780 + class174.field2381, false);
        } else if (field293 == 45) {
            method666(class174.field2394, false);
        }
        if (field293 == 30 && field498 == 0 && !var4) {
            try {
                Graphics var8 = Statics.field1726.getGraphics();
                for (int var9 = 0; var9 < field489; var9++) {
                    if (field492[var9]) {
                        Statics.field744.method3780(var8, field494[var9], field495[var9], field369[var9], field497[var9]);
                        field492[var9] = false;
                    }
                }
            } catch (Exception var15) {
                Statics.field1726.repaint();
            }
        } else if (field293 > 0) {
            try {
                Graphics var11 = Statics.field1726.getGraphics();
                Statics.field744.method3777(var11, 0, 0);
                for (int var12 = 0; var12 < field489; var12++) {
                    field492[var12] = false;
                }
            } catch (Exception var14) {
                Statics.field1726.repaint();
            }
        }
    }

    @ObfuscatedName("client.l(I)V")
    public final void method272() {
        if (Statics.field30.method850()) {
            Statics.field30.method824();
        }
        if (Statics.field1730 != null) {
            Statics.field1730.field216 = false;
        }
        Statics.field1730 = null;
        if (Statics.field1184 != null) {
            Statics.field1184.method1984();
            Statics.field1184 = null;
        }
        class106.method719();
        class116.method1837();
        Statics.field2733 = null;
        if (Statics.field115 != null) {
            Statics.field115.method1026();
        }
        if (Statics.field157 != null) {
            Statics.field157.method1026();
        }
        if (Statics.field2762 != null) {
            Statics.field2762.method1984();
        }
        Statics.method635();
        class105.method736();
    }

    @ObfuscatedName("gx.y(II)V")
    public static void method3231(int arg0) {
        if (field293 == arg0) {
            return;
        }
        if (field293 == 0) {
            Statics.field72 = null;
            Statics.field1548 = null;
            Statics.field1618 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field453 = 0;
            field323 = 0;
            field324 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field177 != null) {
            Statics.field177.method1984();
            Statics.field177 = null;
        }
        if (field293 == 25) {
            field368 = 0;
            field343 = 0;
            field344 = 1;
            field345 = 0;
            field346 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class42.method1858(Statics.field1726, Statics.field318, Statics.field2241, true, 0);
        } else if (arg0 == 20) {
            class42.method1858(Statics.field1726, Statics.field318, Statics.field2241, true, field293 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class42.method1858(Statics.field1726, Statics.field318, Statics.field2241, false, 4);
        } else if (Statics.field832) {
            Statics.field819 = null;
            Statics.field820 = null;
            Statics.field821 = null;
            Statics.field822 = null;
            Statics.field823 = null;
            Statics.field824 = null;
            Statics.field2707 = null;
            Statics.field70 = null;
            Statics.field57 = null;
            Statics.field151 = null;
            Statics.field1912 = null;
            Statics.field1925 = null;
            Statics.field2359 = null;
            Statics.field842 = null;
            Statics.field1910 = null;
            Statics.field801 = null;
            Statics.field201 = null;
            Statics.field1731 = null;
            Statics.field2781 = null;
            Statics.field1291 = null;
            Statics.field73 = null;
            Statics.field1849 = null;
            class139.field1918 = 1;
            Statics.field13 = null;
            Statics.field1919 = -1;
            Statics.field1567 = -1;
            Statics.field1650 = 0;
            Statics.field743 = false;
            Statics.field1793 = 2;
            class186.method103(true);
            Statics.field832 = false;
        }
        field293 = arg0;
    }

    @ObfuscatedName("client.e(B)V")
    public void method390() {
        if (field293 != 1000) {
            boolean var1 = class186.method264();
            if (!var1) {
                this.method274();
            }
        }
    }

    @ObfuscatedName("client.x(I)V")
    public void method274() {
        if (class186.field2758 >= 4) {
            this.method2042("js5crc");
            field293 = 1000;
            return;
        }
        if (class186.field2764 >= 4) {
            if (field293 <= 5) {
                this.method2042("js5io");
                field293 = 1000;
                return;
            }
            field283 = 3000;
            class186.field2764 = 3;
        }
        if (--field283 + 1 > 0) {
            return;
        }
        try {
            if (field315 == 0) {
                Statics.field3162 = Statics.field160.method1865(Statics.field196, Statics.field56);
                field315++;
            }
            if (field315 == 1) {
                if (Statics.field3162.field1662 == 2) {
                    this.method275(-1);
                    return;
                }
                if (Statics.field3162.field1662 == 1) {
                    field315++;
                }
            }
            if (field315 == 2) {
                Statics.field314 = new class111((Socket) Statics.field3162.field1664, Statics.field160);
                class161 var1 = new class161(5);
                var1.method2765(15);
                var1.method2768(127);
                Statics.field314.method1970(var1.field2291, 0, 5);
                field315++;
                Statics.field1923 = class163.method3594();
            }
            if (field315 == 3) {
                if (field293 <= 5 || Statics.field314.method1968() > 0) {
                    int var2 = Statics.field314.method1967();
                    if (var2 != 0) {
                        this.method275(var2);
                        return;
                    }
                    field315++;
                } else if (class163.method3594() - Statics.field1923 > 30000L) {
                    this.method275(-2);
                    return;
                }
            }
            if (field315 == 4) {
                class111 var3 = Statics.field314;
                boolean var4 = field293 > 20;
                if (Statics.field2762 != null) {
                    try {
                        Statics.field2762.method1984();
                    } catch (Exception var14) {
                    }
                    Statics.field2762 = null;
                }
                Statics.field2762 = var3;
                class186.method103(var4);
                class186.field2759.field2285 = 0;
                Statics.field2309 = null;
                Statics.field2047 = null;
                class186.field2752 = 0;
                while (true) {
                    class182 var6 = (class182) class186.field2751.method2238();
                    if (var6 == null) {
                        while (true) {
                            class182 var7 = (class182) class186.field2756.method2238();
                            if (var7 == null) {
                                if (class186.field2763 != 0) {
                                    try {
                                        class161 var8 = new class161(4);
                                        var8.method2765(4);
                                        var8.method2765(class186.field2763);
                                        var8.method2766(0);
                                        Statics.field2762.method1970(var8.field2291, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2762.method1984();
                                        } catch (Exception var12) {
                                        }
                                        class186.field2764++;
                                        Statics.field2762 = null;
                                    }
                                }
                                class186.field2747 = 0;
                                Statics.field2748 = class163.method3594();
                                Statics.field3162 = null;
                                Statics.field314 = null;
                                field315 = 0;
                                field321 = 0;
                                return;
                            }
                            class186.field2753.method2194(var7);
                            class186.field2754.method2230(var7, var7.field1879);
                            class186.field2755++;
                            class186.field2757--;
                        }
                    }
                    class186.field2749.method2230(var6, var6.field1879);
                    class186.field2750++;
                    class186.field2746--;
                }
            }
        } catch (IOException var15) {
            this.method275(-3);
        }
    }

    @ObfuscatedName("client.f(II)V")
    public void method275(int arg0) {
        Statics.field3162 = null;
        Statics.field314 = null;
        field315 = 0;
        if (Statics.field56 == Statics.field220) {
            Statics.field56 = Statics.field771;
        } else {
            Statics.field56 = Statics.field220;
        }
        field321++;
        if (field321 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field293 <= 5) {
                this.method2042("js5connect_full");
                field293 = 1000;
            } else {
                field283 = 3000;
            }
        } else if (field321 >= 2 && arg0 == 6) {
            this.method2042("js5connect_outofdate");
            field293 = 1000;
        } else if (field321 >= 4) {
            if (field293 <= 5) {
                this.method2042("js5connect");
                field293 = 1000;
            } else {
                field283 = 3000;
            }
        }
    }

    @ObfuscatedName("cy.s(B)V")
    public static void method1647() {
        if (field313 == 0) {
            Statics.field2244 = new class88(4, 104, 104, class12.field111);
            for (int var0 = 0; var0 < 4; var0++) {
                field552[var0] = new class118(104, 104);
            }
            Statics.field880 = new class225(512, 512);
            class42.field827 = class174.field2499;
            class42.field834 = 5;
            field313 = 20;
        } else if (field313 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class85.field1445[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class88.method1685(var1, 500, 800, 512, 334);
            class42.field827 = class174.field2383;
            class42.field834 = 10;
            field313 = 30;
        } else if (field313 == 30) {
            Statics.field1953 = method116(0, false, true, true);
            Statics.field2767 = method116(1, false, true, true);
            Statics.field2016 = method116(2, true, false, true);
            Statics.field2364 = method116(3, false, true, true);
            Statics.field2037 = method116(4, false, true, true);
            Statics.field414 = method116(5, true, true, true);
            Statics.field747 = method116(6, true, true, false);
            Statics.field1203 = method116(7, false, true, true);
            Statics.field2241 = method116(8, false, true, true);
            Statics.field2789 = method116(9, false, true, true);
            Statics.field318 = method116(10, false, true, true);
            Statics.field333 = method116(11, false, true, true);
            Statics.field276 = method116(12, false, true, true);
            Statics.field320 = method116(13, true, false, true);
            Statics.field2051 = method116(14, false, true, false);
            Statics.field2792 = method116(15, false, true, true);
            class42.field827 = class174.field2414;
            class42.field834 = 20;
            field313 = 40;
        } else if (field313 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1953.method3187() * 4 / 100;
            int var8 = var7 + Statics.field2767.method3187() * 4 / 100;
            int var9 = var8 + Statics.field2016.method3187() * 2 / 100;
            int var10 = var9 + Statics.field2364.method3187() * 2 / 100;
            int var11 = var10 + Statics.field2037.method3187() * 6 / 100;
            int var12 = var11 + Statics.field414.method3187() * 4 / 100;
            int var13 = var12 + Statics.field747.method3187() * 2 / 100;
            int var14 = var13 + Statics.field1203.method3187() * 60 / 100;
            int var15 = var14 + Statics.field2241.method3187() * 2 / 100;
            int var16 = var15 + Statics.field2789.method3187() * 2 / 100;
            int var17 = var16 + Statics.field318.method3187() * 2 / 100;
            int var18 = var17 + Statics.field333.method3187() * 2 / 100;
            int var19 = var18 + Statics.field276.method3187() * 2 / 100;
            int var20 = var19 + Statics.field320.method3187() * 2 / 100;
            int var21 = var20 + Statics.field2051.method3187() * 2 / 100;
            int var22 = var21 + Statics.field2792.method3187() * 2 / 100;
            if (var22 == 100) {
                class42.field827 = class174.field2386;
                class42.field834 = 30;
                field313 = 45;
            } else {
                if (var22 != 0) {
                    class42.field827 = class174.field2385 + var22 + "%";
                }
                class42.field834 = 30;
            }
        } else if (field313 == 45) {
            boolean var23 = !field289;
            Statics.field1032 = 22050;
            Statics.field1047 = var23;
            Statics.field1033 = 2;
            class140 var24 = new class140();
            var24.method2382(9, 128);
            Statics.field115 = class58.method738(Statics.field160, Statics.field1726, 0, 22050);
            Statics.field115.method1009(var24);
            class185 var25 = Statics.field2792;
            class185 var26 = Statics.field2051;
            class185 var27 = Statics.field2037;
            Statics.field1915 = var25;
            Statics.field1914 = var26;
            Statics.field1916 = var27;
            Statics.field1920 = var24;
            Statics.field157 = class58.method738(Statics.field160, Statics.field1726, 1, 2048);
            Statics.field2008 = new class52();
            Statics.field157.method1009(Statics.field2008);
            Statics.field36 = new class66(22050, Statics.field1032);
            class42.field827 = class174.field2589;
            class42.field834 = 35;
            field313 = 50;
        } else if (field313 == 50) {
            int var28 = 0;
            if (Statics.field1294 == null) {
                Statics.field1294 = class226.method3551(Statics.field2241, Statics.field320, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field46 == null) {
                Statics.field46 = class226.method3551(Statics.field2241, Statics.field320, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field2237 == null) {
                Statics.field2237 = class226.method3551(Statics.field2241, Statics.field320, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class42.field827 = class174.field2435 + var28 * 100 / 3 + "%";
                class42.field834 = 40;
            } else {
                Statics.field1537 = new class231(true);
                class42.field827 = class174.field2389;
                class42.field834 = 40;
                field313 = 60;
            }
        } else if (field313 == 60) {
            int var29 = class42.method3536(Statics.field318, Statics.field2241);
            byte var30 = 9;
            if (var29 < var30) {
                class42.field827 = class174.field2390 + var29 * 100 / var30 + "%";
                class42.field834 = 50;
            } else {
                class42.field827 = class174.field2391;
                class42.field834 = 50;
                method3231(5);
                field313 = 70;
            }
        } else if (field313 == 70) {
            if (Statics.field2016.method3158()) {
                class185 var32 = Statics.field2016;
                Statics.field3033 = var32;
                class185 var33 = Statics.field2016;
                Statics.field2813 = var33;
                class185 var34 = Statics.field2016;
                class185 var35 = Statics.field1203;
                Statics.field2830 = var34;
                Statics.field2821 = var35;
                Statics.field2819 = Statics.field2830.method3103(3);
                class185 var36 = Statics.field2016;
                class185 var37 = Statics.field1203;
                boolean var38 = field289;
                Statics.field2913 = var36;
                Statics.field2893 = var37;
                class198.field2936 = var38;
                class200.method3087(Statics.field2016, Statics.field1203);
                class185 var39 = Statics.field2016;
                class185 var40 = Statics.field1203;
                boolean var41 = field440;
                class209 var42 = Statics.field1294;
                Statics.field2943 = var39;
                Statics.field2368 = var40;
                Statics.field2944 = var41;
                Statics.field1466 = Statics.field2943.method3103(10);
                Statics.field2734 = var42;
                class185 var43 = Statics.field2016;
                class185 var44 = Statics.field1953;
                class185 var45 = Statics.field2767;
                Statics.field3050 = var43;
                Statics.field3282 = var44;
                Statics.field3045 = var45;
                class185 var46 = Statics.field2016;
                class185 var47 = Statics.field1203;
                Statics.field2808 = var46;
                Statics.field2796 = var47;
                class195.method3075(Statics.field2016);
                class188.method1396(Statics.field2016);
                class151.method1912(Statics.field2364, Statics.field1203, Statics.field2241, Statics.field320);
                class185 var48 = Statics.field2016;
                Statics.field2769 = var48;
                class196.method3077(Statics.field2016);
                class185 var49 = Statics.field2016;
                Statics.field2783 = var49;
                class185 var50 = Statics.field2016;
                Statics.field2790 = var50;
                Statics.field30 = new class47();
                class185 var51 = Statics.field2016;
                class185 var52 = Statics.field2241;
                class185 var53 = Statics.field320;
                Statics.field2882 = var51;
                Statics.field2867 = var52;
                Statics.field2889 = var53;
                class194.method2489(Statics.field2016, Statics.field2241);
                class42.field827 = class174.field2393;
                class42.field834 = 60;
                field313 = 80;
            } else {
                class42.field827 = class174.field2472 + Statics.field2016.method3210() + "%";
                class42.field834 = 60;
            }
        } else if (field313 == 80) {
            int var54 = 0;
            if (Statics.field214 == null) {
                Statics.field214 = class226.method1976(Statics.field2241, "compass", "");
            } else {
                var54++;
            }
            if (Statics.field1556 == null) {
                Statics.field1556 = class226.method1976(Statics.field2241, "mapedge", "");
            } else {
                var54++;
            }
            if (Statics.field1564 == null) {
                Statics.field1564 = class226.method3183(Statics.field2241, "mapscene", "");
            } else {
                var54++;
            }
            if (Statics.field97 == null) {
                Statics.field97 = class226.method2372(Statics.field2241, "mapfunction", "");
            } else {
                var54++;
            }
            if (Statics.field658 == null) {
                Statics.field658 = class226.method2372(Statics.field2241, "headicons_pk", "");
            } else {
                var54++;
            }
            if (Statics.field168 == null) {
                Statics.field168 = class226.method2372(Statics.field2241, "headicons_prayer", "");
            } else {
                var54++;
            }
            if (Statics.field38 == null) {
                Statics.field38 = class226.method2372(Statics.field2241, "headicons_hint", "");
            } else {
                var54++;
            }
            if (Statics.field48 == null) {
                Statics.field48 = class226.method2372(Statics.field2241, "mapmarker", "");
            } else {
                var54++;
            }
            if (Statics.field1746 == null) {
                Statics.field1746 = class226.method2372(Statics.field2241, "cross", "");
            } else {
                var54++;
            }
            if (Statics.field88 == null) {
                Statics.field88 = class226.method2372(Statics.field2241, "mapdots", "");
            } else {
                var54++;
            }
            if (Statics.field2358 == null) {
                Statics.field2358 = class226.method3183(Statics.field2241, "scrollbar", "");
            } else {
                var54++;
            }
            if (Statics.field2794 == null) {
                Statics.field2794 = class226.method3183(Statics.field2241, "mod_icons", "");
            } else {
                var54++;
            }
            if (var54 < 12) {
                class42.field827 = class174.field2463 + var54 * 100 / 12 + "%";
                class42.field834 = 70;
            } else {
                Statics.field3095 = Statics.field2794;
                Statics.field1556.method3906();
                int var55 = (int) (Math.random() * 21.0D) - 10;
                int var56 = (int) (Math.random() * 21.0D) - 10;
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 41.0D) - 20;
                for (int var59 = 0; var59 < Statics.field97.length; var59++) {
                    Statics.field97[var59].method3934(var55 + var58, var56 + var58, var57 + var58);
                }
                Statics.field1564[0].method3866(var55 + var58, var56 + var58, var57 + var58);
                class42.field827 = class174.field2451;
                class42.field834 = 70;
                field313 = 90;
            }
        } else if (field313 == 90) {
            if (Statics.field2789.method3158()) {
                class75 var60 = new class75(Statics.field2789, Statics.field2241, 20, 0.8D, field289 ? 64 : 128);
                class85.method1580(var60);
                class85.method1595(0.8D);
                class42.field827 = class174.field2397;
                class42.field834 = 90;
                field313 = 110;
            } else {
                class42.field827 = class174.field2396 + Statics.field2789.method3210() + "%";
                class42.field834 = 90;
            }
        } else if (field313 == 110) {
            Statics.field1730 = new class21();
            Statics.field160.method1871(Statics.field1730, 10);
            class42.field827 = class174.field2614;
            class42.field834 = 94;
            field313 = 120;
        } else if (field313 == 120) {
            if (Statics.field318.method3135("huffman", "")) {
                class153 var61 = new class153(Statics.field318.method3110("huffman", ""));
                class211.method1347(var61);
                class42.field827 = class174.field2460;
                class42.field834 = 96;
                field313 = 130;
            } else {
                class42.field827 = class174.field2399 + "%";
                class42.field834 = 96;
            }
        } else if (field313 == 130) {
            if (!Statics.field2364.method3158()) {
                class42.field827 = class174.field2401 + Statics.field2364.method3210() * 4 / 5 + "%";
                class42.field834 = 100;
            } else if (!Statics.field276.method3158()) {
                class42.field827 = class174.field2401 + (80 + Statics.field276.method3210() / 6) + "%";
                class42.field834 = 100;
            } else if (Statics.field320.method3158()) {
                class42.field827 = class174.field2402;
                class42.field834 = 100;
                field313 = 140;
            } else {
                class42.field827 = class174.field2401 + (96 + Statics.field320.method3210() / 20) + "%";
                class42.field834 = 100;
            }
        } else if (field313 == 140) {
            method3231(10);
        }
    }

    @ObfuscatedName("z.o(IZZZI)Lgq;")
    public static class185 method116(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class117 var4 = null;
        if (class105.field1681 != null) {
            var4 = new class117(arg0, class105.field1681, Statics.field1689[arg0], 1000000);
        }
        return new class185(var4, Statics.field896, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dk.a(IB)V")
    public static void method1993(int arg0) {
        if (arg0 == -3) {
            class42.method45(class174.field2409, class174.field2410, class174.field2630);
        } else if (arg0 == -2) {
            class42.method45(class174.field2412, class174.field2413, class174.field2556);
        } else if (arg0 == -1) {
            class42.method45(class174.field2516, class174.field2416, class174.field2417);
        } else if (arg0 == 3) {
            class42.field831 = 3;
        } else if (arg0 == 4) {
            class42.method45(class174.field2552, class174.field2419, class174.field2382);
        } else if (arg0 == 5) {
            class42.method45(class174.field2421, class174.field2422, class174.field2423);
        } else if (arg0 == 6) {
            class42.method45(class174.field2424, class174.field2492, class174.field2426);
        } else if (arg0 == 7) {
            class42.method45(class174.field2537, class174.field2428, class174.field2487);
        } else if (arg0 == 8) {
            class42.method45(class174.field2430, class174.field2431, class174.field2432);
        } else if (arg0 == 9) {
            class42.method45(class174.field2588, class174.field2434, class174.field2525);
        } else if (arg0 == 10) {
            class42.method45(class174.field2549, class174.field2437, class174.field2438);
        } else if (arg0 == 11) {
            class42.method45(class174.field2601, class174.field2440, class174.field2420);
        } else if (arg0 == 12) {
            class42.method45(class174.field2442, class174.field2443, class174.field2444);
        } else if (arg0 == 13) {
            class42.method45(class174.field2445, class174.field2446, class174.field2427);
        } else if (arg0 == 14) {
            class42.method45(class174.field2380, class174.field2449, class174.field2450);
        } else if (arg0 == 16) {
            class42.method45(class174.field2378, class174.field2604, class174.field2453);
        } else if (arg0 == 17) {
            class42.method45(class174.field2623, class174.field2455, class174.field2512);
        } else if (arg0 == 18) {
            class42.method45(class174.field2457, class174.field2458, class174.field2459);
        } else if (arg0 == 19) {
            class42.method45(class174.field2531, class174.field2461, class174.field2584);
        } else if (arg0 == 20) {
            class42.method45(class174.field2477, class174.field2454, class174.field2465);
        } else if (arg0 == 22) {
            class42.method45(class174.field2466, class174.field2467, class174.field2468);
        } else if (arg0 == 23) {
            class42.method45(class174.field2469, class174.field2494, class174.field2471);
        } else if (arg0 == 24) {
            class42.method45(class174.field2548, class174.field2473, class174.field2646);
        } else if (arg0 == 25) {
            class42.method45(class174.field2475, class174.field2476, class174.field2447);
        } else if (arg0 == 26) {
            class42.method45(class174.field2478, class174.field2479, class174.field2480);
        } else if (arg0 == 27) {
            class42.method45(class174.field2392, class174.field2470, class174.field2483);
        } else if (arg0 == 31) {
            class42.method45(class174.field2490, class174.field2522, class174.field2488);
        } else if (arg0 == 32) {
            class42.method45(class174.field2493, class174.field2425, class174.field2583);
        } else if (arg0 == 37) {
            class42.method45(class174.field2624, class174.field2497, class174.field2498);
        } else if (arg0 == 38) {
            class42.method45(class174.field2551, class174.field2500, class174.field2501);
        } else if (arg0 == 55) {
            class42.method45(class174.field2484, class174.field2415, class174.field2504);
        } else if (arg0 == 56) {
            class42.method45(class174.field2509, class174.field2506, class174.field2507);
            method3231(11);
            return;
        } else if (arg0 == 57) {
            class42.method45(class174.field2508, class174.field2439, class174.field2395);
            method3231(11);
            return;
        } else {
            class42.method45(class174.field2625, class174.field2436, class174.field2513);
        }
        method3231(10);
    }

    @ObfuscatedName("dp.b(B)V")
    public static final void method2056() {
        if (Statics.field1184 != null) {
            Statics.field1184.method1984();
            Statics.field1184 = null;
        }
        method180();
        Statics.field2244.method1650();
        for (int var0 = 0; var0 < 4; var0++) {
            field552[var0].method2132();
        }
        System.gc();
        class139.field1918 = 1;
        Statics.field13 = null;
        Statics.field1919 = -1;
        Statics.field1567 = -1;
        Statics.field1650 = 0;
        Statics.field743 = false;
        Statics.field1793 = 2;
        field319 = -1;
        field525 = false;
        class32.method1821();
        method3231(10);
    }

    @ObfuscatedName("y.j(B)V")
    public static final void method180() {
        class201.method2371();
        class192.field2812.method2220();
        class193.field2822.method2220();
        class198.field2903.method2220();
        class198.field2905.method2220();
        class198.field2891.method2220();
        class198.field2897.method2220();
        class200.method769();
        class199.field2946.method2220();
        class199.field2952.method2220();
        class199.field2947.method2220();
        class202.field3046.method2220();
        class202.field3047.method2220();
        class191.method757();
        class195.method628();
        class188.field2775.method2220();
        class197.method1822();
        class194.method1994();
        class148.method817();
        class151.method161();
        ((class75) Statics.field1442).method1375();
        class49.field937.method2220();
        Statics.field1953.method3106();
        Statics.field2767.method3106();
        Statics.field2364.method3106();
        Statics.field2037.method3106();
        Statics.field414.method3106();
        Statics.field747.method3106();
        Statics.field1203.method3106();
        Statics.field2241.method3106();
        Statics.field2789.method3106();
        Statics.field318.method3106();
        Statics.field333.method3106();
        Statics.field276.method3106();
    }

    @ObfuscatedName("e.k(I)V")
    public static final void method186() {
        if (Statics.field157 != null) {
            Statics.field157.method1013();
        }
        if (Statics.field115 != null) {
            Statics.field115.method1013();
        }
    }

    @ObfuscatedName("s.v(Lgm;IIII)V")
    public static void method201(class202 arg0, int arg1, int arg2, int arg3) {
        if (field528 >= 50 || field527 == 0 || arg0.field3057 == null || arg1 >= arg0.field3057.length) {
            return;
        }
        int var4 = arg0.field3057[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field529[field528] = var5;
        field530[field528] = var6;
        field432[field528] = 0;
        field533[field528] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field300[field528] = (var8 << 16) + (var9 << 8) + var7;
        field528++;
    }

    @ObfuscatedName("af.u(IB)V")
    public static void method737(int arg0) {
        if (arg0 == -1 && !field525) {
            class139.method187();
        } else if (arg0 != -1 && field319 != arg0 && field523 != 0 && !field525) {
            class185 var1 = Statics.field747;
            int var2 = field523;
            class139.field1918 = 1;
            Statics.field13 = var1;
            Statics.field1919 = arg0;
            Statics.field1567 = 0;
            Statics.field1650 = var2;
            Statics.field743 = false;
            Statics.field1793 = 2;
        }
        field319 = arg0;
    }

    @ObfuscatedName("fr.t(Leu;III)V")
    public static final void method2747(class151 arg0, int arg1, int arg2) {
        if (field522 != 0 && field522 != 3 || class116.field1809 != 1 && Statics.field230 || class116.field1809 != 4) {
            return;
        }
        class146 var3 = arg0.method2636(true);
        if (var3 == null) {
            return;
        }
        int var4 = class116.field1810 - arg1;
        int var5 = class116.field1807 - arg2;
        if (!var3.method2574(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2029 / 2;
        int var7 = var5 - var3.field2021 / 2;
        int var8 = field373 + field359 & 0x7FF;
        int var9 = class85.field1445[var8];
        int var10 = class85.field1446[var8];
        int var11 = (field361 + 256) * var9 >> 8;
        int var12 = (field361 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field810.field648 + var13 >> 7;
        int var16 = Statics.field810.field597 - var14 >> 7;
        field331.method3010(35);
        field331.method2765(18);
        field331.method2766(Statics.field171 + var15);
        field331.method2888(class106.field1710[82] ? (class106.field1710[81] ? 2 : 1) : 0);
        field331.method2973(Statics.field464 + var16);
        field331.method2765(var6);
        field331.method2765(var7);
        field331.method2766(field373);
        field331.method2765(57);
        field331.method2765(field359);
        field331.method2765(field361);
        field331.method2765(89);
        field331.method2766(Statics.field810.field648);
        field331.method2766(Statics.field810.field597);
        field331.method2765(63);
        field520 = var15;
        field312 = var16;
    }

    @ObfuscatedName("f.av(I)V")
    public static final void method196() {
        int[] var0 = class46.field903;
        for (int var1 = 0; var1 < class46.field898; var1++) {
            class24 var2 = field409[var0[var1]];
            if (var2 != null && var2.field608 > 0) {
                var2.field608--;
                if (var2.field608 == 0) {
                    var2.field603 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field327; var3++) {
            int var4 = field560[var3];
            class36 var5 = field461[var4];
            if (var5 != null && var5.field608 > 0) {
                var5.field608--;
                if (var5.field608 == 0) {
                    var5.field603 = null;
                }
            }
        }
    }

    @ObfuscatedName("p.aw(Ljava/lang/String;B)V")
    public static final void method95(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1344.field692 = !Statics.field1344.field692;
            class31.method43();
            if (Statics.field1344.field692) {
                class48.method121(99, "", "Roofs are now all hidden");
            } else {
                class48.method121(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field564 = !field564;
        }
        if (field504 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field564 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field564 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                if (field406 > 0) {
                    method2056();
                } else {
                    method3231(40);
                    Statics.field177 = Statics.field1184;
                    Statics.field1184 = null;
                }
            }
            if (arg0.equalsIgnoreCase("errortest") && field444 == 2) {
                throw new RuntimeException();
            }
        }
        field331.method3010(146);
        field331.method2765(arg0.length() + 1);
        field331.method2771(arg0);
    }

    @ObfuscatedName("dw.ay(B)V")
    public static final void method1964() {
        int var0 = Statics.field949 * 128 + 64;
        int var1 = Statics.field653 * 128 + 64;
        int var2 = method162(var0, var1, Statics.field2326) - Statics.field1086;
        if (Statics.field42 < var0) {
            Statics.field42 += Statics.field1759 * (var0 - Statics.field42) / 1000 + Statics.field1536;
            if (Statics.field42 > var0) {
                Statics.field42 = var0;
            }
        }
        if (Statics.field42 > var0) {
            Statics.field42 -= Statics.field1759 * (Statics.field42 - var0) / 1000 + Statics.field1536;
            if (Statics.field42 < var0) {
                Statics.field42 = var0;
            }
        }
        if (Statics.field360 < var2) {
            Statics.field360 += Statics.field1759 * (var2 - Statics.field360) / 1000 + Statics.field1536;
            if (Statics.field360 > var2) {
                Statics.field360 = var2;
            }
        }
        if (Statics.field360 > var2) {
            Statics.field360 -= Statics.field1759 * (Statics.field360 - var2) / 1000 + Statics.field1536;
            if (Statics.field360 < var2) {
                Statics.field360 = var2;
            }
        }
        if (Statics.field568 < var1) {
            Statics.field568 += Statics.field1759 * (var1 - Statics.field568) / 1000 + Statics.field1536;
            if (Statics.field568 > var1) {
                Statics.field568 = var1;
            }
        }
        if (Statics.field568 > var1) {
            Statics.field568 -= Statics.field1759 * (Statics.field568 - var1) / 1000 + Statics.field1536;
            if (Statics.field568 < var1) {
                Statics.field568 = var1;
            }
        }
        int var3 = Statics.field2022 * 128 + 64;
        int var4 = Statics.field788 * 128 + 64;
        int var5 = method162(var3, var4, Statics.field2326) - Statics.field2007;
        int var6 = var3 - Statics.field42;
        int var7 = var5 - Statics.field360;
        int var8 = var4 - Statics.field568;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field813 < var10) {
            Statics.field813 += Statics.field84 * (var10 - Statics.field813) / 1000 + Statics.field129;
            if (Statics.field813 > var10) {
                Statics.field813 = var10;
            }
        }
        if (Statics.field813 > var10) {
            Statics.field813 -= Statics.field84 * (Statics.field813 - var10) / 1000 + Statics.field129;
            if (Statics.field813 < var10) {
                Statics.field813 = var10;
            }
        }
        int var12 = var11 - Statics.field1691;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1691 += Statics.field84 * var12 / 1000 + Statics.field129;
            Statics.field1691 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1691 -= Statics.field84 * -var12 / 1000 + Statics.field129;
            Statics.field1691 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1691;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1691 = var11;
        }
    }

    @ObfuscatedName("ap.as(B)V")
    public static final void method751() {
        int var0 = field352 + Statics.field810.field648;
        int var1 = field354 + Statics.field810.field597;
        if (Statics.field927 - var0 < -500 || Statics.field927 - var0 > 500 || Statics.field224 - var1 < -500 || Statics.field224 - var1 > 500) {
            Statics.field927 = var0;
            Statics.field224 = var1;
        }
        if (Statics.field927 != var0) {
            Statics.field927 += (var0 - Statics.field927) / 16;
        }
        if (Statics.field224 != var1) {
            Statics.field224 += (var1 - Statics.field224) / 16;
        }
        if (class116.field1802 == 4 && Statics.field230) {
            int var2 = class116.field1811 * 853340747 - field377 * 853340747;
            field375 = var2 * 2;
            field377 = (var2 == -1 || var2 == 1 ? class116.field1811 * 853340747 : (field377 * 853340747 + class116.field1811 * 853340747) / 2) * 1256376163;
            int var3 = field376 - class116.field1812;
            field487 = var3 * 2;
            field376 = var3 == -1 || var3 == 1 ? class116.field1812 : (field376 + class116.field1812) / 2;
        } else {
            if (class106.field1710[96]) {
                field487 += (-24 - field487) / 2;
            } else if (class106.field1710[97]) {
                field487 += (24 - field487) / 2;
            } else {
                field487 /= 2;
            }
            if (class106.field1710[98]) {
                field375 += (12 - field375) / 2;
            } else if (class106.field1710[99]) {
                field375 += (-12 - field375) / 2;
            } else {
                field375 /= 2;
            }
            field377 = class116.field1811;
            field376 = class116.field1812;
        }
        field373 = field487 / 2 + field373 & 0x7FF;
        field535 += field375 / 2;
        if (field535 < 128) {
            field535 = 128;
        }
        if (field535 > 383) {
            field535 = 383;
        }
        int var4 = Statics.field927 >> 7;
        int var5 = Statics.field224 >> 7;
        int var6 = method162(Statics.field927, Statics.field224, Statics.field2326);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field2326;
                    if (var10 < 3 && (class12.field104[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class12.field111[var10][var8][var9];
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
        if (var12 > field381) {
            field381 += (var12 - field381) / 24;
        } else if (var12 < field381) {
            field381 += (var12 - field381) / 80;
        }
    }

    @ObfuscatedName("bu.ai(I)V")
    public static final void method1113() {
        int var0 = class46.field898;
        int[] var1 = class46.field903;
        for (int var2 = 0; var2 < var0; var2++) {
            class24 var3 = field409[var1[var2]];
            if (var3 != null) {
                method1866(var3, 1);
            }
        }
    }

    @ObfuscatedName("ci.aq(Law;II)V")
    public static final void method1866(class28 arg0, int arg1) {
        if (arg0.field649 > field295) {
            int var2 = arg0.field649 - field295;
            int var3 = arg0.field638 * 128 + arg0.field600 * 64;
            int var4 = arg0.field640 * 128 + arg0.field600 * 64;
            arg0.field648 += (var3 - arg0.field648) / var2;
            arg0.field597 += (var4 - arg0.field597) / var2;
            arg0.field635 = 0;
            arg0.field647 = arg0.field644;
        } else if (arg0.field643 >= field295) {
            method2626(arg0);
        } else {
            method724(arg0);
        }
        if (arg0.field648 < 128 || arg0.field597 < 128 || arg0.field648 >= 13184 || arg0.field597 >= 13184) {
            arg0.field628 = -1;
            arg0.field633 = -1;
            arg0.field649 = 0;
            arg0.field643 = 0;
            arg0.field648 = arg0.field629[0] * 128 + arg0.field600 * 64;
            arg0.field597 = arg0.field652[0] * 128 + arg0.field600 * 64;
            arg0.method618();
        }
        if (Statics.field810 == arg0 && (arg0.field648 < 1536 || arg0.field597 < 1536 || arg0.field648 >= 11776 || arg0.field597 >= 11776)) {
            arg0.field628 = -1;
            arg0.field633 = -1;
            arg0.field649 = 0;
            arg0.field643 = 0;
            arg0.field648 = arg0.field629[0] * 128 + arg0.field600 * 64;
            arg0.field597 = arg0.field652[0] * 128 + arg0.field600 * 64;
            arg0.method618();
        }
        if (arg0.field630 != 0) {
            if (arg0.field642 != -1) {
                class28 var5 = null;
                if (arg0.field642 < 32768) {
                    var5 = field461[arg0.field642];
                } else if (arg0.field642 >= 32768) {
                    var5 = field409[arg0.field642 - 32768];
                }
                if (var5 != null) {
                    int var6 = arg0.field648 - var5.field648;
                    int var7 = arg0.field597 - var5.field597;
                    if (var6 != 0 || var7 != 0) {
                        arg0.field647 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field623) {
                    arg0.field642 = -1;
                    arg0.field623 = false;
                }
            }
            if (arg0.field624 != -1 && (arg0.field650 == 0 || arg0.field635 > 0)) {
                arg0.field647 = arg0.field624;
                arg0.field624 = -1;
            }
            int var8 = arg0.field647 - arg0.field598 & 0x7FF;
            if (var8 == 0 && arg0.field623) {
                arg0.field642 = -1;
                arg0.field623 = false;
            }
            if (var8 == 0) {
                arg0.field636 = 0;
            } else {
                arg0.field636++;
                if (var8 > 1024) {
                    arg0.field598 -= arg0.field630;
                    boolean var9 = true;
                    if (var8 < arg0.field630 || var8 > 2048 - arg0.field630) {
                        arg0.field598 = arg0.field647;
                        var9 = false;
                    }
                    if (arg0.field625 == arg0.field601 && (arg0.field636 > 25 || var9)) {
                        if (arg0.field602 == -1) {
                            arg0.field625 = arg0.field604;
                        } else {
                            arg0.field625 = arg0.field602;
                        }
                    }
                } else {
                    arg0.field598 += arg0.field630;
                    boolean var10 = true;
                    if (var8 < arg0.field630 || var8 > 2048 - arg0.field630) {
                        arg0.field598 = arg0.field647;
                        var10 = false;
                    }
                    if (arg0.field625 == arg0.field601 && (arg0.field636 > 25 || var10)) {
                        if (arg0.field605 == -1) {
                            arg0.field625 = arg0.field604;
                        } else {
                            arg0.field625 = arg0.field605;
                        }
                    }
                }
                arg0.field598 &= 0x7FF;
            }
        }
        method181(arg0);
    }

    @ObfuscatedName("eu.ac(Law;B)V")
    public static final void method2626(class28 arg0) {
        if (field295 == arg0.field643 || arg0.field628 == -1 || arg0.field646 != 0 || arg0.field596 + 1 > class202.method119(arg0.field628).field3051[arg0.field621]) {
            int var1 = arg0.field643 - arg0.field649;
            int var2 = field295 - arg0.field649;
            int var3 = arg0.field638 * 128 + arg0.field600 * 64;
            int var4 = arg0.field640 * 128 + arg0.field600 * 64;
            int var5 = arg0.field639 * 128 + arg0.field600 * 64;
            int var6 = arg0.field641 * 128 + arg0.field600 * 64;
            arg0.field648 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field597 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field635 = 0;
        arg0.field647 = arg0.field644;
        arg0.field598 = arg0.field647;
    }

    @ObfuscatedName("ag.ae(Law;B)V")
    public static final void method724(class28 arg0) {
        arg0.field625 = arg0.field601;
        if (arg0.field650 == 0) {
            arg0.field635 = 0;
            return;
        }
        if (arg0.field628 != -1 && arg0.field646 == 0) {
            class202 var1 = class202.method119(arg0.field628);
            if (arg0.field655 > 0 && var1.field3059 == 0) {
                arg0.field635++;
                return;
            }
            if (arg0.field655 <= 0 && var1.field3063 == 0) {
                arg0.field635++;
                return;
            }
        }
        int var2 = arg0.field648;
        int var3 = arg0.field597;
        int var4 = arg0.field629[arg0.field650 - 1] * 128 + arg0.field600 * 64;
        int var5 = arg0.field652[arg0.field650 - 1] * 128 + arg0.field600 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field647 = 1280;
            } else if (var3 > var5) {
                arg0.field647 = 1792;
            } else {
                arg0.field647 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field647 = 768;
            } else if (var3 > var5) {
                arg0.field647 = 256;
            } else {
                arg0.field647 = 512;
            }
        } else if (var3 < var5) {
            arg0.field647 = 1024;
        } else if (var3 > var5) {
            arg0.field647 = 0;
        }
        byte var6 = arg0.field626[arg0.field650 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field648 = var4;
            arg0.field597 = var5;
            arg0.field650--;
            if (arg0.field655 > 0) {
                arg0.field655--;
            }
            return;
        }
        int var7 = arg0.field647 - arg0.field598 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field651;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field604;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field607;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field606;
        }
        if (var8 == -1) {
            var8 = arg0.field604;
        }
        arg0.field625 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class36) {
            var10 = ((class36) arg0).field757.field3003;
        }
        if (var10) {
            if (arg0.field647 != arg0.field598 && arg0.field642 == -1 && arg0.field630 != 0) {
                var9 = 2;
            }
            if (arg0.field650 > 2) {
                var9 = 6;
            }
            if (arg0.field650 > 3) {
                var9 = 8;
            }
            if (arg0.field635 > 0 && arg0.field650 > 1) {
                var9 = 8;
                arg0.field635--;
            }
        } else {
            if (arg0.field650 > 1) {
                var9 = 6;
            }
            if (arg0.field650 > 2) {
                var9 = 8;
            }
            if (arg0.field635 > 0 && arg0.field650 > 1) {
                var9 = 8;
                arg0.field635--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field625 == arg0.field604 && arg0.field631 != -1) {
            arg0.field625 = arg0.field631;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field648 += var9;
                if (arg0.field648 > var4) {
                    arg0.field648 = var4;
                }
            } else if (var2 > var4) {
                arg0.field648 -= var9;
                if (arg0.field648 < var4) {
                    arg0.field648 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field597 += var9;
                if (arg0.field597 > var5) {
                    arg0.field597 = var5;
                }
            } else if (var3 > var5) {
                arg0.field597 -= var9;
                if (arg0.field597 < var5) {
                    arg0.field597 = var5;
                }
            }
        }
        if (arg0.field648 == var4 && arg0.field597 == var5) {
            arg0.field650--;
            if (arg0.field655 > 0) {
                arg0.field655--;
            }
        }
    }

    @ObfuscatedName("y.ag(Law;I)V")
    public static final void method181(class28 arg0) {
        arg0.field599 = false;
        if (arg0.field625 != -1) {
            class202 var1 = class202.method119(arg0.field625);
            if (var1 == null || var1.field3048 == null) {
                arg0.field625 = -1;
            } else {
                arg0.field627++;
                if (arg0.field654 < var1.field3048.length && arg0.field627 > var1.field3051[arg0.field654]) {
                    arg0.field627 = 1;
                    arg0.field654++;
                    method201(var1, arg0.field654, arg0.field648, arg0.field597);
                }
                if (arg0.field654 >= var1.field3048.length) {
                    arg0.field627 = 0;
                    arg0.field654 = 0;
                    method201(var1, arg0.field654, arg0.field648, arg0.field597);
                }
            }
        }
        if (arg0.field633 != -1 && field295 >= arg0.field609) {
            if (arg0.field634 < 0) {
                arg0.field634 = 0;
            }
            int var2 = class191.method3085(arg0.field633).field2801;
            if (var2 == -1) {
                arg0.field633 = -1;
            } else {
                class202 var3 = class202.method119(var2);
                if (var3 == null || var3.field3048 == null) {
                    arg0.field633 = -1;
                } else {
                    arg0.field617++;
                    if (arg0.field634 < var3.field3048.length && arg0.field617 > var3.field3051[arg0.field634]) {
                        arg0.field617 = 1;
                        arg0.field634++;
                        method201(var3, arg0.field634, arg0.field648, arg0.field597);
                    }
                    if (arg0.field634 >= var3.field3048.length && (arg0.field634 < 0 || arg0.field634 >= var3.field3048.length)) {
                        arg0.field633 = -1;
                    }
                }
            }
        }
        if (arg0.field628 != -1 && arg0.field646 <= 1) {
            class202 var4 = class202.method119(arg0.field628);
            if (var4.field3059 == 1 && arg0.field655 > 0 && arg0.field649 <= field295 && arg0.field643 < field295) {
                arg0.field646 = 1;
                return;
            }
        }
        if (arg0.field628 != -1 && arg0.field646 == 0) {
            class202 var5 = class202.method119(arg0.field628);
            if (var5 == null || var5.field3048 == null) {
                arg0.field628 = -1;
            } else {
                arg0.field596++;
                if (arg0.field621 < var5.field3048.length && arg0.field596 > var5.field3051[arg0.field621]) {
                    arg0.field596 = 1;
                    arg0.field621++;
                    method201(var5, arg0.field621, arg0.field648, arg0.field597);
                }
                if (arg0.field621 >= var5.field3048.length) {
                    arg0.field621 -= var5.field3062;
                    arg0.field632++;
                    if (arg0.field632 >= var5.field3056) {
                        arg0.field628 = -1;
                    } else if (arg0.field621 >= 0 && arg0.field621 < var5.field3048.length) {
                        method201(var5, arg0.field621, arg0.field648, arg0.field597);
                    } else {
                        arg0.field628 = -1;
                    }
                }
                arg0.field599 = var5.field3054;
            }
        }
        if (arg0.field646 > 0) {
            arg0.field646--;
        }
    }

    @ObfuscatedName("af.am(Lv;III)V")
    public static void method739(class24 arg0, int arg1, int arg2) {
        if (arg0.field628 == arg1 && arg1 != -1) {
            int var3 = class202.method119(arg1).field3061;
            if (var3 == 1) {
                arg0.field621 = 0;
                arg0.field596 = 0;
                arg0.field646 = arg2;
                arg0.field632 = 0;
            }
            if (var3 == 2) {
                arg0.field632 = 0;
            }
        } else if (arg1 == -1 || arg0.field628 == -1 || class202.method119(arg1).field3055 >= class202.method119(arg0.field628).field3055) {
            arg0.field628 = arg1;
            arg0.field621 = 0;
            arg0.field596 = 0;
            arg0.field646 = arg2;
            arg0.field632 = 0;
            arg0.field655 = arg0.field650;
        }
    }

    @ObfuscatedName("df.af(S)I")
    public static int method1932() {
        return field500 ? 2 : 1;
    }

    @ObfuscatedName("f.ap(II)V")
    public static void method195(int arg0) {
        field499 = 0L;
        if (arg0 >= 2) {
            field500 = true;
        } else {
            field500 = false;
        }
        method3482();
        if (field293 >= 25) {
            method722();
        }
        field1781 = true;
    }

    @ObfuscatedName("hl.az(B)V")
    public static void method3770() {
        Canvas var0 = Statics.field1726;
        var0.removeKeyListener(class106.field1723);
        var0.removeFocusListener(class106.field1723);
        class106.field1719 = -1;
        class116.method120(Statics.field1726);
        if (Statics.field2733 != null) {
            Statics.field2733.method1940(Statics.field1726);
        }
        Statics.field282.method2000();
        Statics.field1726.setBackground(Color.black);
        class106.method1058(Statics.field1726);
        class116.method12(Statics.field1726);
        if (Statics.field2733 != null) {
            Statics.field2733.method1938(Statics.field1726);
        }
        if (field391 != -1) {
            method1861(field391, Statics.field170, Statics.field1104, false);
        }
        field1783 = true;
    }

    @ObfuscatedName("ag.ab(B)V")
    public static void method722() {
        field331.method3010(135);
        field331.method2765(method1932());
        field331.method2766(Statics.field170);
        field331.method2766(Statics.field1104);
    }

    @ObfuscatedName("gy.ax(I)V")
    public static void method3482() {
        client var0 = Statics.field282;
        synchronized (Statics.field282) {
            Container var1 = Statics.field282.method2007();
            if (var1 != null) {
                Statics.field2323 = Math.max(var1.getSize().width, Statics.field64);
                Statics.field954 = Math.max(var1.getSize().height, Statics.field3198);
                if (Statics.field231 == var1) {
                    Insets var2 = Statics.field231.getInsets();
                    Statics.field2323 -= var2.right + var2.left;
                    Statics.field954 -= var2.top + var2.bottom;
                }
                if (Statics.field2323 <= 0) {
                    Statics.field2323 = 1;
                }
                if (Statics.field954 <= 0) {
                    Statics.field954 = 1;
                }
                if (method1932() == 1) {
                    Statics.field170 = field501;
                    Statics.field1104 = field521;
                } else {
                    Statics.field170 = Math.min(Statics.field2323, 7680);
                    Statics.field1104 = Math.min(Statics.field954, 2160);
                }
                field1777 = (Statics.field2323 - Statics.field170) / 2;
                field1784 = 0;
                Statics.field1726.setSize(Statics.field170, Statics.field1104);
                Statics.field744 = class221.method2128(Statics.field170, Statics.field1104, Statics.field1726);
                if (Statics.field231 == var1) {
                    Insets var3 = Statics.field231.getInsets();
                    Statics.field1726.setLocation(field1777 + var3.left, field1784 + var3.top);
                } else {
                    Statics.field1726.setLocation(field1777, field1784);
                }
                method265();
                if (field391 != -1) {
                    method1861(field391, Statics.field170, Statics.field1104, true);
                }
                method204();
            }
        }
    }

    @ObfuscatedName("u.ad(I)V")
    public static void method265() {
        int var0 = Statics.field170;
        int var1 = Statics.field1104;
        if (Statics.field2323 < var0) {
            int var2 = Statics.field2323;
        }
        if (Statics.field954 < var1) {
            int var3 = Statics.field954;
        }
        if (Statics.field1344 == null) {
            return;
        }
        try {
            client var4 = Statics.field282;
            Object[] var5 = new Object[] { method1932() };
            JSObject.getWindow(var4).call("resize", var5);
        } catch (Throwable var7) {
        }
    }

    @ObfuscatedName("o.ah(I)V")
    public static void method204() {
        int var0 = field1777;
        int var1 = field1784;
        int var2 = Statics.field2323 - Statics.field170 - var0;
        int var3 = Statics.field954 - Statics.field1104 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field282.method2007();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field231 == var4) {
                Insets var7 = Statics.field231.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field954);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field2323, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field2323 + var5 - var2, var6, var2, Statics.field954);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field954 + var6 - var3, Statics.field2323, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("e.al(B)V")
    public static final void method185() {
        if (field391 != -1) {
            method1956(field391);
        }
        for (int var0 = 0; var0 < field489; var0++) {
            if (field491[var0]) {
                field492[var0] = true;
            }
            field493[var0] = field491[var0];
            field491[var0] = false;
        }
        field555 = field295;
        field408 = -1;
        field436 = -1;
        Statics.field1604 = null;
        if (field391 != -1) {
            field489 = 0;
            method21(field391, 0, 0, Statics.field170, Statics.field1104, 0, 0, -1);
        }
        class220.method3786();
        if (field427) {
            method215();
        } else if (field408 != -1) {
            int var1 = field408;
            int var2 = field436;
            if (field428 >= 2 || field439 != 0 || field441) {
                String var3;
                if (field439 == 1 && field428 < 2) {
                    var3 = class174.field2517 + class174.field2527 + field372 + " " + class38.field779;
                } else if (field441 && field428 < 2) {
                    var3 = field298 + class174.field2527 + field445 + " " + class38.field779;
                } else {
                    int var4 = field428 - 1;
                    String var5;
                    if (field358[var4].length() > 0) {
                        var5 = field433[var4] + class174.field2527 + field358[var4];
                    } else {
                        var5 = field433[var4];
                    }
                    var3 = var5;
                }
                if (field428 > 2) {
                    var3 = var3 + class38.method183(16777215) + " " + '/' + " " + (field428 - 2) + class174.field2521;
                }
                Statics.field2237.method3680(var3, var1 + 4, var2 + 15, 16777215, 0, field295 / 1000);
            }
        }
        if (field498 == 3) {
            for (int var6 = 0; var6 < field489; var6++) {
                if (field493[var6]) {
                    class220.method3792(field494[var6], field495[var6], field369[var6], field497[var6], 16711935, 128);
                } else if (field492[var6]) {
                    class220.method3792(field494[var6], field495[var6], field369[var6], field497[var6], 16711680, 128);
                }
            }
        }
        int var7 = Statics.field2326;
        int var8 = Statics.field810.field648;
        int var9 = Statics.field810.field597;
        int var10 = field518;
        for (class32 var11 = (class32) class32.field698.method2290(); var11 != null; var11 = (class32) class32.field698.method2285()) {
            if (var11.field703 != -1 || var11.field707 != null) {
                int var12 = 0;
                if (var8 > var11.field699) {
                    var12 += var8 - var11.field699;
                } else if (var8 < var11.field711) {
                    var12 += var11.field711 - var8;
                }
                if (var9 > var11.field696) {
                    var12 += var9 - var11.field696;
                } else if (var9 < var11.field700) {
                    var12 += var11.field700 - var9;
                }
                if (var12 - 64 > var11.field702 || field527 == 0 || var11.field706 != var7) {
                    if (var11.field704 != null) {
                        Statics.field2008.method883(var11.field704);
                        var11.field704 = null;
                    }
                    if (var11.field709 != null) {
                        Statics.field2008.method883(var11.field709);
                        var11.field709 = null;
                    }
                } else {
                    var12 -= 64;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    int var13 = field527 * (var11.field702 - var12) / var11.field702;
                    class54 var10000;
                    if (var11.field704 != null) {
                        var11.field704.method1178(var13);
                    } else if (var11.field703 >= 0) {
                        var10000 = (class54) null;
                        class54 var14 = class54.method943(Statics.field2037, var11.field703, 0);
                        if (var14 != null) {
                            class56 var15 = var14.method937().method987(Statics.field36);
                            class67 var16 = class67.method1122(var15, 100, var13);
                            var16.method1138(-1);
                            Statics.field2008.method882(var16);
                            var11.field704 = var16;
                        }
                    }
                    if (var11.field709 != null) {
                        var11.field709.method1178(var13);
                        if (!var11.field709.method2272()) {
                            var11.field709 = null;
                        }
                    } else if (var11.field707 != null && (var11.field708 -= var10) <= 0) {
                        int var17 = (int) (Math.random() * (double) var11.field707.length);
                        var10000 = (class54) null;
                        class54 var18 = class54.method943(Statics.field2037, var11.field707[var17], 0);
                        if (var18 != null) {
                            class56 var19 = var18.method937().method987(Statics.field36);
                            class67 var20 = class67.method1122(var19, 100, var13);
                            var20.method1138(0);
                            Statics.field2008.method882(var20);
                            var11.field709 = var20;
                            var11.field708 = var11.field705 + (int) (Math.random() * (double) (var11.field714 - var11.field705));
                        }
                    }
                }
            }
        }
        field518 = 0;
    }

    @ObfuscatedName("as.aa(Ljava/lang/String;ZI)V")
    public static final void method666(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field46.method3670(arg0, 250);
        int var6 = Statics.field46.method3671(arg0, 250) * 13;
        class220.method3817(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class220.method3799(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field46.method3676(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method808(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method200(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1726.getGraphics();
            Statics.field744.method3777(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1726.repaint();
        }
    }

    @ObfuscatedName("gz.an(IIIII)V")
    public static final void method3253(int arg0, int arg1, int arg2, int arg3) {
        field549++;
        method668(class16.field159);
        boolean var4 = false;
        if (field526 >= 0) {
            int var5 = class46.field898;
            int[] var6 = class46.field903;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field526 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method668(class16.field155);
        }
        method16(true);
        method668(var4 ? class16.field156 : class16.field153);
        method16(false);
        for (class43 var8 = (class43) field511.method2290(); var8 != null; var8 = (class43) field511.method2285()) {
            if (Statics.field2326 != var8.field855 || field295 > var8.field861) {
                var8.method2273();
            } else if (field295 >= var8.field868) {
                if (var8.field864 > 0) {
                    class36 var9 = field461[var8.field864 - 1];
                    if (var9 != null && var9.field648 >= 0 && var9.field648 < 13312 && var9.field597 >= 0 && var9.field597 < 13312) {
                        var8.method791(var9.field648, var9.field597, method162(var9.field648, var9.field597, var8.field855) - var8.field859, field295);
                    }
                }
                if (var8.field864 < 0) {
                    int var10 = -var8.field864 - 1;
                    class24 var11;
                    if (field410 == var10) {
                        var11 = Statics.field810;
                    } else {
                        var11 = field409[var10];
                    }
                    if (var11 != null && var11.field648 >= 0 && var11.field648 < 13312 && var11.field597 >= 0 && var11.field597 < 13312) {
                        var8.method791(var11.field648, var11.field597, method162(var11.field648, var11.field597, var8.field855) - var8.field859, field295);
                    }
                }
                var8.method792(field518);
                Statics.field2244.method1661(Statics.field2326, (int) var8.field866, (int) var8.field867, (int) var8.field874, 60, var8, var8.field875, -1, false);
            }
        }
        method734();
        method202(arg0, arg1, arg2, arg3, true);
        int var12 = field548;
        int var13 = field524;
        int var14 = field539;
        int var15 = field287;
        class220.method3787(var12, var13, var12 + var14, var13 + var15);
        class85.method1576();
        if (!field534) {
            int var16 = field535;
            if (field381 / 256 > var16) {
                var16 = field381 / 256;
            }
            if (field430[4] && field537[4] + 128 > var16) {
                var16 = field537[4] + 128;
            }
            int var17 = field373 + field356 & 0x7FF;
            method4040(Statics.field927, method162(Statics.field810.field648, Statics.field810.field597, Statics.field2326) - field378, Statics.field224, var16, var17, var16 * 3 + 600);
        }
        int var18;
        if (field534) {
            var18 = method610();
        } else {
            var18 = method32();
        }
        int var19 = Statics.field42;
        int var20 = Statics.field360;
        int var21 = Statics.field568;
        int var22 = Statics.field813;
        int var23 = Statics.field1691;
        for (int var24 = 0; var24 < 5; var24++) {
            if (field430[var24]) {
                int var25 = (int) (Math.random() * (double) (field536[var24] * 2 + 1) - (double) field536[var24] + Math.sin((double) field538[var24] / 100.0D * (double) field472[var24]) * (double) field537[var24]);
                if (var24 == 0) {
                    Statics.field42 += var25;
                }
                if (var24 == 1) {
                    Statics.field360 += var25;
                }
                if (var24 == 2) {
                    Statics.field568 += var25;
                }
                if (var24 == 3) {
                    Statics.field1691 = Statics.field1691 + var25 & 0x7FF;
                }
                if (var24 == 4) {
                    Statics.field813 += var25;
                    if (Statics.field813 < 128) {
                        Statics.field813 = 128;
                    }
                    if (Statics.field813 > 383) {
                        Statics.field813 = 383;
                    }
                }
            }
        }
        int var26 = class116.field1812;
        int var27 = class116.field1811 * 853340747;
        if (class116.field1809 != 0) {
            var26 = class116.field1810;
            var27 = class116.field1807;
        }
        if (var26 >= var12 && var26 < var12 + var14 && var27 >= var13 && var27 < var13 + var15) {
            class83.field1349 = true;
            class83.field1408 = 0;
            class83.field1414 = var26 - var12;
            class83.field1405 = var27 - var13;
        } else {
            class83.field1349 = false;
            class83.field1408 = 0;
        }
        method186();
        class220.method3817(var12, var13, var14, var15, 0);
        method186();
        int var28 = class85.field1431;
        class85.field1431 = field448;
        Statics.field2244.method1688(Statics.field42, Statics.field360, Statics.field568, Statics.field813, Statics.field1691, var18);
        class85.field1431 = var28;
        method186();
        Statics.field2244.method1664();
        field382 = 0;
        boolean var29 = false;
        int var30 = -1;
        int var31 = class46.field898;
        int[] var32 = class46.field903;
        for (int var33 = 0; var33 < field327 + var31; var33++) {
            class28 var34;
            if (var33 < var31) {
                var34 = field409[var32[var33]];
                if (field526 == var32[var33]) {
                    var29 = true;
                    var30 = var33;
                    continue;
                }
            } else {
                var34 = field461[field560[var33 - var31]];
            }
            method79(var34, var33, var12, var13, var14, var15);
        }
        if (var29) {
            method79(field409[field526], var30, var12, var13, var14, var15);
        }
        for (int var35 = 0; var35 < field382; var35++) {
            int var36 = field531[var35];
            int var37 = field385[var35];
            int var38 = field387[var35];
            int var39 = field386[var35];
            boolean var40 = true;
            while (var40) {
                var40 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if (var37 + 2 > field385[var41] - field386[var41] && var37 - var39 < field385[var41] + 2 && var36 - var38 < field531[var41] + field387[var41] && var36 + var38 > field531[var41] - field387[var41] && field385[var41] - field386[var41] < var37) {
                        var37 = field385[var41] - field386[var41];
                        var40 = true;
                    }
                }
            }
            field348 = field531[var35];
            field395 = field385[var35] = var37;
            String var42 = field308[var35];
            if (field374 == 0) {
                int var43 = 16776960;
                if (field388[var35] < 6) {
                    var43 = field322[field388[var35]];
                }
                if (field388[var35] == 6) {
                    var43 = field549 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field388[var35] == 7) {
                    var43 = field549 % 20 < 10 ? 255 : 65535;
                }
                if (field388[var35] == 8) {
                    var43 = field549 % 20 < 10 ? 45056 : 8454016;
                }
                if (field388[var35] == 9) {
                    int var44 = 150 - field390[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16776960 - (var44 - 50) * 327680;
                    } else if (var44 < 150) {
                        var43 = (var44 - 100) * 5 + 65280;
                    }
                }
                if (field388[var35] == 10) {
                    int var45 = 150 - field390[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16711935 - (var45 - 50) * 327680;
                    } else if (var45 < 150) {
                        var43 = (var45 - 100) * 327680 + 255 - (var45 - 100) * 5;
                    }
                }
                if (field388[var35] == 11) {
                    int var46 = 150 - field390[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - var46 * 327685;
                    } else if (var46 < 100) {
                        var43 = (var46 - 50) * 327685 + 65280;
                    } else if (var46 < 150) {
                        var43 = 16777215 - (var46 - 100) * 327680;
                    }
                }
                if (field294[var35] == 0) {
                    Statics.field2237.method3663(var42, field348 + var12, field395 + var13, var43, 0);
                }
                if (field294[var35] == 1) {
                    Statics.field2237.method3677(var42, field348 + var12, field395 + var13, var43, 0, field549);
                }
                if (field294[var35] == 2) {
                    Statics.field2237.method3678(var42, field348 + var12, field395 + var13, var43, 0, field549);
                }
                if (field294[var35] == 3) {
                    Statics.field2237.method3679(var42, field348 + var12, field395 + var13, var43, 0, field549, 150 - field390[var35]);
                }
                if (field294[var35] == 4) {
                    int var47 = (150 - field390[var35]) * (Statics.field2237.method3668(var42) + 100) / 150;
                    class220.method3814(field348 + var12 - 50, var13, field348 + var12 + 50, var13 + var15);
                    Statics.field2237.method3675(var42, field348 + var12 + 50 - var47, field395 + var13, var43, 0);
                    class220.method3787(var12, var13, var12 + var14, var13 + var15);
                }
                if (field294[var35] == 5) {
                    int var48 = 150 - field390[var35];
                    int var49 = 0;
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class220.method3814(var12, field395 + var13 - Statics.field2237.field3092 - 1, var12 + var14, field395 + var13 + 5);
                    Statics.field2237.method3663(var42, field348 + var12, field395 + var13 + var49, var43, 0);
                    class220.method3787(var12, var13, var12 + var14, var13 + var15);
                }
            } else {
                Statics.field2237.method3663(var42, field348 + var12, field395 + var13, 16776960, 0);
            }
        }
        method227(var12, var13);
        ((class75) Statics.field1442).method1392(field518);
        method263(var12, var13, var14, var15);
        Statics.field42 = var19;
        Statics.field360 = var20;
        Statics.field568 = var21;
        Statics.field813 = var22;
        Statics.field1691 = var23;
        if (field281) {
            byte var50 = 0;
            int var51 = class186.field2750 + class186.field2746 + var50;
            if (var51 == 0) {
                field281 = false;
            }
        }
        if (field281) {
            class220.method3817(var12, var13, var14, var15, 0);
            method666(class174.field2379, false);
        }
    }

    @ObfuscatedName("o.at(IIIIZI)V")
    public static final void method202(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field457 - field540) * var5 / 100 + field540;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field546) {
            short var8 = field546;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field541) {
                var6 = field541;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class220.method3786();
                    class220.method3817(arg0, arg1, var10, arg3, -16777216);
                    class220.method3817(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field547) {
            short var11 = field547;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field544) {
                var6 = field544;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class220.method3786();
                    class220.method3817(arg0, arg1, arg2, var13, -16777216);
                    class220.method3817(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field459 - field542) * var5 / 100 + field542;
        field448 = arg3 * var6 * var14 / 85504 << 1;
        if (field539 != arg2 || field287 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class85.field1445[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class88.method1685(var15, 500, 800, arg2, arg3);
        }
        field548 = arg0;
        field524 = arg1;
        field539 = arg2;
        field287 = arg3;
    }

    @ObfuscatedName("as.au(Lf;B)V")
    public static final void method668(class16 arg0) {
        if (Statics.field810.field648 >> 7 == field520 && Statics.field810.field597 >> 7 == field312) {
            field520 = 0;
        }
        int var1 = class46.field898;
        int[] var2 = class46.field903;
        int var3 = var1;
        if (class16.field159 == arg0 || class16.field155 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class24 var5;
            int var6;
            if (class16.field159 == arg0) {
                var5 = Statics.field810;
                var6 = Statics.field810.field266 << 14;
            } else if (class16.field155 == arg0) {
                var5 = field409[field526];
                var6 = field526 << 14;
            } else {
                var5 = field409[var2[var4]];
                var6 = var2[var4] << 14;
                if (class16.field156 == arg0 && field526 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method237() && !var5.field264) {
                var5.field262 = false;
                if ((field289 && var1 > 50 || var1 > 200) && class16.field159 != arg0 && var5.field625 == var5.field601) {
                    var5.field262 = true;
                }
                int var7 = var5.field648 >> 7;
                int var8 = var5.field597 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field256 == null || field295 < var5.field252 || field295 >= var5.field253) {
                        if ((var5.field648 & 0x7F) == 64 && (var5.field597 & 0x7F) == 64) {
                            if (field549 == field392[var7][var8]) {
                                continue;
                            }
                            field392[var7][var8] = field549;
                        }
                        var5.field244 = method162(var5.field648, var5.field597, Statics.field2326);
                        Statics.field2244.method1661(Statics.field2326, var5.field648, var5.field597, var5.field244, 60, var5, var5.field598, var6, var5.field599);
                    } else {
                        var5.field262 = false;
                        var5.field244 = method162(var5.field648, var5.field597, Statics.field2326);
                        Statics.field2244.method1662(Statics.field2326, var5.field648, var5.field597, var5.field244, 60, var5, var5.field598, var6, var5.field246, var5.field259, var5.field267, var5.field261);
                    }
                }
            }
        }
    }

    @ObfuscatedName("d.ak(ZB)V")
    public static final void method16(boolean arg0) {
        for (int var1 = 0; var1 < field327; var1++) {
            class36 var2 = field461[field560[var1]];
            int var3 = (field560[var1] << 14) + 536870912;
            if (var2 != null && var2.method237() && var2.field757.field3018 == arg0 && var2.field757.method3506()) {
                int var4 = var2.field648 >> 7;
                int var5 = var2.field597 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field600 == 1 && (var2.field648 & 0x7F) == 64 && (var2.field597 & 0x7F) == 64) {
                        if (field549 == field392[var4][var5]) {
                            continue;
                        }
                        field392[var4][var5] = field549;
                    }
                    if (!var2.field757.field3025) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2244.method1661(Statics.field2326, var2.field648, var2.field597, method162(var2.field648 + (var2.field600 * 64 - 64), var2.field597 + (var2.field600 * 64 - 64), Statics.field2326), var2.field600 * 64 - 64 + 60, var2, var2.field598, var3, var2.field599);
                }
            }
        }
    }

    @ObfuscatedName("af.ar(I)V")
    public static final void method734() {
        for (class34 var0 = (class34) field422.method2290(); var0 != null; var0 = (class34) field422.method2285()) {
            if (Statics.field2326 != var0.field734 || var0.field741) {
                var0.method2273();
            } else if (field295 >= var0.field733) {
                var0.method703(field518);
                if (var0.field741) {
                    var0.method2273();
                } else {
                    Statics.field2244.method1661(var0.field734, var0.field735, var0.field732, var0.field737, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("m.aj(I)I")
    public static final int method32() {
        if (Statics.field1344.field692) {
            return Statics.field2326;
        }
        int var0 = 3;
        if (Statics.field813 < 310) {
            int var1 = Statics.field42 >> 7;
            int var2 = Statics.field568 >> 7;
            int var3 = Statics.field810.field648 >> 7;
            int var4 = Statics.field810.field597 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field2326;
            }
            if ((class12.field104[Statics.field2326][var1][var2] & 0x4) != 0) {
                var0 = Statics.field2326;
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
                    if ((class12.field104[Statics.field2326][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field2326;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class12.field104[Statics.field2326][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field2326;
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
                    if ((class12.field104[Statics.field2326][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field2326;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class12.field104[Statics.field2326][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field2326;
                        }
                    }
                }
            }
        }
        if (Statics.field810.field648 >= 0 && Statics.field810.field597 >= 0 && Statics.field810.field648 < 13312 && Statics.field810.field597 < 13312) {
            if ((class12.field104[Statics.field2326][Statics.field810.field648 >> 7][Statics.field810.field597 >> 7] & 0x4) != 0) {
                var0 = Statics.field2326;
            }
            return var0;
        } else {
            return Statics.field2326;
        }
    }

    @ObfuscatedName("av.ao(I)I")
    public static final int method610() {
        if (Statics.field1344.field692) {
            return Statics.field2326;
        } else {
            int var0 = method162(Statics.field42, Statics.field568, Statics.field2326);
            return var0 - Statics.field360 >= 800 || (class12.field104[Statics.field2326][Statics.field42 >> 7][Statics.field568 >> 7] & 0x4) == 0 ? 3 : Statics.field2326;
        }
    }

    @ObfuscatedName("k.bn(III)V")
    public static final void method227(int arg0, int arg1) {
        if (field303 == 2) {
            method42((field306 - Statics.field171 << 7) + field309, (field307 - Statics.field464 << 7) + field310, field454 * 2);
            if (field348 > -1 && field295 % 20 < 10) {
                Statics.field38[0].method3914(field348 + arg0 - 12, field395 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("r.bt(Law;IIIIII)V")
    public static final void method79(class28 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method237()) {
            return;
        }
        if (arg0 instanceof class36) {
            class200 var6 = ((class36) arg0).field757;
            if (var6.field3023 != null) {
                var6 = var6.method3526();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class46.field898;
        int[] var8 = class46.field903;
        int var9 = 3;
        if (!arg0.field612.method2251()) {
            method35(arg0, arg0.field622 + 15);
            for (class35 var10 = (class35) arg0.field612.method2252(); var10 != null; var10 = (class35) arg0.field612.method2244()) {
                class29 var11 = var10.method710(field295);
                if (var11 != null) {
                    class194 var12 = var10.field745;
                    class225 var13 = var12.method3343();
                    class225 var14 = var12.method3328();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field2845;
                    } else {
                        if (var12.field2846 * 2 < var14.field3200) {
                            var15 = var12.field2846;
                        }
                        var16 = var14.field3200 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field295 - var11.field661;
                    int var20 = var11.field659 * var16 / var12.field2845;
                    int var23;
                    if (var11.field662 > var19) {
                        int var21 = var12.field2840 == 0 ? 0 : var19 / var12.field2840 * var12.field2840;
                        int var22 = var11.field663 * var16 / var12.field2845;
                        var23 = (var20 - var22) * var21 / var11.field662 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field662 + var12.field2842 - var19;
                        if (var12.field2838 >= 0) {
                            var17 = (var24 << 8) / (var12.field2842 - var12.field2838);
                        }
                    }
                    if (var11.field659 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field348 + arg2 - (var16 >> 1);
                    int var26 = field395 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field348 > -1) {
                            class220.method3817(var25, var26, var23, 5, 65280);
                            class220.method3817(var23 + var25, var26, var16 - var23, 5, 16711680);
                        }
                        var9 += 7;
                    } else {
                        int var27 = var25 - var15;
                        int var28;
                        if (var16 == var23) {
                            var28 = var15 * 2 + var23;
                        } else {
                            var28 = var15 + var23;
                        }
                        int var29 = var13.field3201;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method3920(var27, var26, var17);
                            class220.method3814(var27, var26, var27 + var28, var26 + var29);
                            var14.method3920(var27, var26, var17);
                        } else {
                            var13.method3914(var27, var26);
                            class220.method3814(var27, var26, var27 + var28, var26 + var29);
                            var14.method3914(var27, var26);
                        }
                        class220.method3787(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method711()) {
                    var10.method2273();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class24 var30 = (class24) arg0;
            if (var30.field264) {
                return;
            }
            if (var30.field260 != -1 || var30.field247 != -1) {
                method35(arg0, arg0.field622 + 15);
                if (field348 > -1) {
                    if (var30.field260 != -1) {
                        Statics.field658[var30.field260].method3914(field348 + arg2 - 12, field395 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field247 != -1) {
                        Statics.field168[var30.field247].method3914(field348 + arg2 - 12, field395 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field303 == 10 && field305 == var8[arg1]) {
                method35(arg0, arg0.field622 + 15);
                if (field348 > -1) {
                    Statics.field38[1].method3914(field348 + arg2 - 12, field395 + arg3 - var9);
                }
            }
        } else {
            class200 var31 = ((class36) arg0).field757;
            if (var31.field3023 != null) {
                var31 = var31.method3526();
            }
            if (var31.field3021 >= 0 && var31.field3021 < Statics.field168.length) {
                method35(arg0, arg0.field622 + 15);
                if (field348 > -1) {
                    Statics.field168[var31.field3021].method3914(field348 + arg2 - 12, field395 + arg3 - 30);
                }
            }
            if (field303 == 1 && field304 == field560[arg1 - var7] && field295 % 20 < 10) {
                method35(arg0, arg0.field622 + 15);
                if (field348 > -1) {
                    Statics.field38[0].method3914(field348 + arg2 - 12, field395 + arg3 - 28);
                }
            }
        }
        if (arg0.field603 != null && (arg1 >= var7 || !arg0.field611 && (field365 == 4 || !arg0.field610 && (field365 == 0 || field365 == 3 || field365 == 1 && method222(((class24) arg0).field257, false))))) {
            method35(arg0, arg0.field622);
            if (field348 > -1 && field382 < field383) {
                field387[field382] = Statics.field2237.method3668(arg0.field603) / 2;
                field386[field382] = Statics.field2237.field3092;
                field531[field382] = field348;
                field385[field382] = field395;
                field388[field382] = arg0.field613;
                field294[field382] = arg0.field614;
                field390[field382] = arg0.field608;
                field308[field382] = arg0.field603;
                field382++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field618[var32];
            int var34 = arg0.field616[var32];
            class197 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field295) {
                    continue;
                }
                var35 = class197.method93(arg0.field616[var32]);
                var36 = var35.field2868;
                if (var35 != null && var35.field2886 != null) {
                    var35 = var35.method3375();
                    if (var35 == null) {
                        arg0.field618[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field619[var32];
            class197 var38 = null;
            if (var37 >= 0) {
                var38 = class197.method93(var37);
                if (var38 != null && var38.field2886 != null) {
                    var38 = var38.method3375();
                }
            }
            if (var33 - var36 <= field295) {
                if (var35 == null) {
                    arg0.field618[var32] = -1;
                } else {
                    method35(arg0, arg0.field622 / 2);
                    if (field348 > -1) {
                        if (var32 == 1) {
                            field395 -= 20;
                        }
                        if (var32 == 2) {
                            field348 -= 15;
                            field395 -= 10;
                        }
                        if (var32 == 3) {
                            field348 += 15;
                            field395 -= 10;
                        }
                        Object var39 = null;
                        Object var40 = null;
                        Object var41 = null;
                        Object var42 = null;
                        int var43 = 0;
                        int var44 = 0;
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        int var48 = 0;
                        int var49 = 0;
                        int var50 = 0;
                        class225 var51 = null;
                        class225 var52 = null;
                        class225 var53 = null;
                        class225 var54 = null;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        class225 var64 = var35.method3377();
                        if (var64 != null) {
                            var43 = var64.field3200;
                            int var65 = var64.field3201;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3202;
                        }
                        class225 var66 = var35.method3378();
                        if (var66 != null) {
                            var44 = var66.field3200;
                            int var67 = var66.field3201;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3202;
                        }
                        class225 var68 = var35.method3379();
                        if (var68 != null) {
                            var45 = var68.field3200;
                            int var69 = var68.field3201;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3202;
                        }
                        class225 var70 = var35.method3390();
                        if (var70 != null) {
                            var46 = var70.field3200;
                            int var71 = var70.field3201;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3202;
                        }
                        if (var38 != null) {
                            var51 = var38.method3377();
                            if (var51 != null) {
                                var55 = var51.field3200;
                                int var72 = var51.field3201;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3202;
                            }
                            var52 = var38.method3378();
                            if (var52 != null) {
                                var56 = var52.field3200;
                                int var73 = var52.field3201;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3202;
                            }
                            var53 = var38.method3379();
                            if (var53 != null) {
                                var57 = var53.field3200;
                                int var74 = var53.field3201;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3202;
                            }
                            var54 = var38.method3390();
                            if (var54 != null) {
                                var58 = var54.field3200;
                                int var75 = var54.field3201;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3202;
                            }
                        }
                        class209 var76 = var35.method3388();
                        if (var76 == null) {
                            var76 = Statics.field1294;
                        }
                        class209 var77;
                        if (var38 == null) {
                            var77 = Statics.field1294;
                        } else {
                            var77 = var38.method3388();
                            if (var77 == null) {
                                var77 = Statics.field1294;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method3374(arg0.field620[var32]);
                        int var83 = var76.method3668(var82);
                        if (var38 != null) {
                            var79 = var38.method3374(arg0.field656[var32]);
                            var81 = var77.method3668(var79);
                        }
                        int var84 = 0;
                        int var85 = 0;
                        if (var44 > 0) {
                            if (var68 == null && var70 == null) {
                                var84 = 1;
                            } else {
                                var84 = var83 / var44 + 1;
                            }
                        }
                        if (var38 != null && var56 > 0) {
                            if (var53 == null && var54 == null) {
                                var85 = 1;
                            } else {
                                var85 = var81 / var56 + 1;
                            }
                        }
                        int var86 = 0;
                        int var87 = var86;
                        if (var43 > 0) {
                            var86 += var43;
                        }
                        var86 += 2;
                        int var88 = var86;
                        if (var45 > 0) {
                            var86 += var45;
                        }
                        int var89 = var86;
                        int var90 = var86;
                        int var92;
                        if (var44 > 0) {
                            int var91 = var44 * var84;
                            var92 = var86 + var91;
                            var90 = (var91 - var83) / 2 + var86;
                        } else {
                            var92 = var83 + var86;
                        }
                        int var93 = var92;
                        if (var46 > 0) {
                            var92 += var46;
                        }
                        int var94 = 0;
                        int var95 = 0;
                        int var96 = 0;
                        int var97 = 0;
                        int var98 = 0;
                        if (var38 != null) {
                            var92 += 2;
                            var94 = var92;
                            if (var55 > 0) {
                                var92 += var55;
                            }
                            var92 += 2;
                            var95 = var92;
                            if (var57 > 0) {
                                var92 += var57;
                            }
                            var96 = var92;
                            var98 = var92;
                            if (var56 > 0) {
                                int var99 = var56 * var85;
                                var92 += var99;
                                var98 += (var99 - var81) / 2;
                            } else {
                                var92 += var81;
                            }
                            var97 = var92;
                            if (var58 > 0) {
                                var92 += var58;
                            }
                        }
                        int var100 = arg0.field618[var32] - field295;
                        int var101 = var35.field2880 - var35.field2880 * var100 / var35.field2868;
                        int var102 = var35.field2881 * var100 / var35.field2868 + -var35.field2881;
                        int var103 = field348 + arg2 - (var92 >> 1) + var101;
                        int var104 = field395 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field2866 + var104 + 15;
                        int var108 = var107 - var76.field3093;
                        int var109 = var76.field3097 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field2866 + var104 + 15;
                            int var111 = var110 - var77.field3093;
                            int var112 = var77.field3097 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field2875 >= 0) {
                            var115 = (var100 << 8) / (var35.field2868 - var35.field2875);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method3920(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method3920(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method3920(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method3920(var93 + var103 - var50, var104, var115);
                            }
                            var76.method3719(var82, var90 + var103, var107, var35.field2884, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method3920(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method3920(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method3920(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method3920(var97 + var103 - var62, var104, var115);
                                }
                                var77.method3719(var79, var98 + var103, var110, var38.field2884, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method3914(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method3914(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method3914(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method3914(var93 + var103 - var50, var104);
                            }
                            var76.method3675(var82, var90 + var103, var107, var35.field2884 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method3914(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method3914(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method3914(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method3914(var97 + var103 - var62, var104);
                                }
                                var77.method3675(var79, var98 + var103, var110, var38.field2884 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cb.bv(I)V")
    public static final void method1820() {
        field367 = 0;
        int var0 = (Statics.field810.field648 >> 7) + Statics.field171;
        int var1 = (Statics.field810.field597 >> 7) + Statics.field464;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field367 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field367 = 1;
        }
        if (field367 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field367 = 0;
        }
    }

    @ObfuscatedName("u.bd(IIIIB)V")
    public static final void method263(int arg0, int arg1, int arg2, int arg3) {
        if (field502 == 1) {
            Statics.field1746[field398 / 100].method3914(field396 - 8, field397 - 8);
        }
        if (field502 == 2) {
            Statics.field1746[field398 / 100 + 4].method3914(field396 - 8, field397 - 8);
        }
        method1820();
    }

    @ObfuscatedName("h.bm(Law;II)V")
    public static final void method35(class28 arg0, int arg1) {
        method42(arg0.field648, arg0.field597, arg1);
    }

    @ObfuscatedName("h.bl(IIIB)V")
    public static final void method42(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field348 = -1;
            field395 = -1;
            return;
        }
        int var3 = method162(arg0, arg1, Statics.field2326) - arg2;
        int var4 = arg0 - Statics.field42;
        int var5 = var3 - Statics.field360;
        int var6 = arg1 - Statics.field568;
        int var7 = class85.field1445[Statics.field813];
        int var8 = class85.field1446[Statics.field813];
        int var9 = class85.field1445[Statics.field1691];
        int var10 = class85.field1446[Statics.field1691];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field348 = field448 * var11 / var15 + field539 / 2;
            field395 = field448 * var14 / var15 + field287 / 2;
        } else {
            field348 = -1;
            field395 = -1;
        }
    }

    @ObfuscatedName("l.bo(IIII)I")
    public static final int method162(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class12.field104[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class12.field111[var5][var3][var4] + class12.field111[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class12.field111[var5][var3][var4 + 1] + class12.field111[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("hm.by(IIIIIIB)V")
    public static final void method4040(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class85.field1445[var6];
            int var12 = class85.field1446[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class85.field1445[var7];
            int var15 = class85.field1446[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field42 = arg0 - var8;
        Statics.field360 = arg1 - var9;
        Statics.field568 = arg2 - var10;
        Statics.field813 = arg3;
        Statics.field1691 = arg4;
    }

    @ObfuscatedName("z.br(ZI)V")
    public static final void method118(boolean arg0) {
        field349 = arg0;
        if (!field349) {
            int var1 = field371.method2943();
            int var2 = field371.method2887();
            int var3 = field371.method2887();
            Statics.field666 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field666[var4][var5] = field371.method2785();
                }
            }
            Statics.field1469 = new int[var3];
            Statics.field2045 = new int[var3];
            Statics.field729 = new int[var3];
            Statics.field105 = new byte[var3][];
            Statics.field240 = new byte[var3][];
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
                        Statics.field1469[var7] = var10;
                        Statics.field2045[var7] = Statics.field414.method3114("m" + var8 + "_" + var9);
                        Statics.field729[var7] = Statics.field414.method3114("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method3357(var1, var2);
            return;
        }
        int var11 = field371.method2943();
        int var12 = field371.method2816();
        int var13 = field371.method2887();
        field371.method3008();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field371.method3013(1);
                    if (var17 == 1) {
                        field350[var14][var15][var16] = field371.method3013(26);
                    } else {
                        field350[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field371.method3014();
        Statics.field666 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field666[var18][var19] = field371.method2785();
            }
        }
        Statics.field1469 = new int[var13];
        Statics.field2045 = new int[var13];
        Statics.field729 = new int[var13];
        Statics.field105 = new byte[var13][];
        Statics.field240 = new byte[var13][];
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
                            if (Statics.field1469[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field1469[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field2045[var20] = Statics.field414.method3114("m" + var29 + "_" + var30);
                            Statics.field729[var20] = Statics.field414.method3114("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method3357(var12, var11);
    }

    @ObfuscatedName("ga.bi(III)V")
    public static final void method3357(int arg0, int arg1) {
        if (Statics.field808 == arg0 && Statics.field1465 == arg1) {
            return;
        }
        Statics.field808 = arg0;
        Statics.field1465 = arg1;
        method3231(25);
        method666(class174.field2379, true);
        int var2 = Statics.field171;
        int var3 = Statics.field464;
        Statics.field171 = (arg0 - 6) * 8;
        Statics.field464 = (arg1 - 6) * 8;
        int var4 = Statics.field171 - var2;
        int var5 = Statics.field464 - var3;
        int var6 = Statics.field171;
        int var7 = Statics.field464;
        for (int var8 = 0; var8 < 32768; var8++) {
            class36 var9 = field461[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field629[var10] -= var4;
                    var9.field652[var10] -= var5;
                }
                var9.field648 -= var4 * 128;
                var9.field597 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class24 var12 = field409[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field629[var13] -= var4;
                    var12.field652[var13] -= var5;
                }
                var12.field648 -= var4 * 128;
                var12.field597 -= var5 * 128;
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
        for (class26 var25 = (class26) field420.method2290(); var25 != null; var25 = (class26) field420.method2285()) {
            var25.field579 -= var4;
            var25.field575 -= var5;
            if (var25.field579 < 0 || var25.field575 < 0 || var25.field579 >= 104 || var25.field575 >= 104) {
                var25.method2273();
            }
        }
        if (field520 != 0) {
            field520 -= var4;
            field312 -= var5;
        }
        field528 = 0;
        field534 = false;
        field515 = -1;
        field422.method2277();
        field511.method2277();
        for (int var26 = 0; var26 < 4; var26++) {
            field552[var26].method2132();
        }
    }

    @ObfuscatedName("n.be(ZI)V")
    public static final void method11(boolean arg0) {
        method186();
        field337++;
        if (field337 < 50 && !arg0) {
            return;
        }
        field337 = 0;
        if (field426 || Statics.field1184 == null) {
            return;
        }
        field331.method3010(155);
        try {
            Statics.field1184.method1970(field331.field2291, 0, field331.field2285);
            field331.field2285 = 0;
        } catch (IOException var2) {
            field426 = true;
        }
    }

    @ObfuscatedName("b.ba(I)V")
    public static final void method212() {
        method11(false);
        field343 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field105.length; var1++) {
            if (Statics.field2045[var1] != -1 && Statics.field105[var1] == null) {
                Statics.field105[var1] = Statics.field414.method3093(Statics.field2045[var1], 0);
                if (Statics.field105[var1] == null) {
                    var0 = false;
                    field343++;
                }
            }
            if (Statics.field729[var1] != -1 && Statics.field240[var1] == null) {
                Statics.field240[var1] = Statics.field414.method3094(Statics.field729[var1], 0, Statics.field666[var1]);
                if (Statics.field240[var1] == null) {
                    var0 = false;
                    field343++;
                }
            }
        }
        if (!var0) {
            field368 = 1;
            return;
        }
        field345 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field105.length; var3++) {
            byte[] var4 = Statics.field240[var3];
            if (var4 != null) {
                int var5 = (Statics.field1469[var3] >> 8) * 64 - Statics.field171;
                int var6 = (Statics.field1469[var3] & 0xFF) * 64 - Statics.field464;
                if (field349) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class161 var9 = new class161(var4);
                int var10 = -1;
                label483: while (true) {
                    int var11 = var9.method2793();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2793();
                            if (var16 == 0) {
                                continue label483;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2823() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class198 var22 = class198.method197(var10);
                                if (var19 != 22 || !field289 || var22.field2911 != 0 || var22.field2909 == 1 || var22.field2930) {
                                    if (!var22.method3445()) {
                                        field345++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2793();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2823();
                    }
                }
            }
        }
        if (!var2) {
            field368 = 2;
            return;
        }
        if (field368 != 0) {
            method666(class174.field2379 + class38.field780 + class38.field774 + 100 + "%" + class38.field787, true);
        }
        method186();
        method180();
        method186();
        Statics.field2244.method1650();
        method186();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field552[var23].method2132();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class12.field104[var24][var25][var26] = 0;
                }
            }
        }
        method186();
        class12.field103 = 99;
        Statics.field106 = new byte[4][104][104];
        Statics.field107 = new byte[4][104][104];
        Statics.field798 = new byte[4][104][104];
        Statics.field108 = new byte[4][104][104];
        Statics.field2779 = new int[4][105][105];
        Statics.field52 = new byte[4][105][105];
        Statics.field934 = new int[105][105];
        Statics.field2308 = new int[104];
        Statics.field1729 = new int[104];
        Statics.field3076 = new int[104];
        Statics.field1180 = new int[104];
        Statics.field3065 = new int[104];
        int var27 = Statics.field105.length;
        class32.method1821();
        method11(true);
        if (!field349) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field1469[var28] >> 8) * 64 - Statics.field171;
                int var30 = (Statics.field1469[var28] & 0xFF) * 64 - Statics.field464;
                byte[] var31 = Statics.field105[var28];
                if (var31 != null) {
                    method186();
                    int var32 = Statics.field808 * 8 - 48;
                    int var33 = Statics.field1465 * 8 - 48;
                    class118[] var34 = field552;
                    for (int var35 = 0; var35 < 4; var35++) {
                        for (int var36 = 0; var36 < 64; var36++) {
                            for (int var37 = 0; var37 < 64; var37++) {
                                if (var29 + var36 > 0 && var29 + var36 < 103 && var30 + var37 > 0 && var30 + var37 < 103) {
                                    var34[var35].field1834[var29 + var36][var30 + var37] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class161 var38 = new class161(var31);
                    for (int var39 = 0; var39 < 4; var39++) {
                        for (int var40 = 0; var40 < 64; var40++) {
                            for (int var41 = 0; var41 < 64; var41++) {
                                class12.method256(var38, var39, var29 + var40, var30 + var41, var32, var33, 0);
                            }
                        }
                    }
                }
            }
            for (int var42 = 0; var42 < var27; var42++) {
                int var43 = (Statics.field1469[var42] >> 8) * 64 - Statics.field171;
                int var44 = (Statics.field1469[var42] & 0xFF) * 64 - Statics.field464;
                byte[] var45 = Statics.field105[var42];
                if (var45 == null && Statics.field1465 < 800) {
                    method186();
                    class12.method1488(var43, var44, 64, 64);
                }
            }
            method11(true);
            for (int var46 = 0; var46 < var27; var46++) {
                byte[] var47 = Statics.field240[var46];
                if (var47 != null) {
                    int var48 = (Statics.field1469[var46] >> 8) * 64 - Statics.field171;
                    int var49 = (Statics.field1469[var46] & 0xFF) * 64 - Statics.field464;
                    method186();
                    class12.method2082(var47, var48, var49, Statics.field2244, field552);
                }
            }
        }
        if (field349) {
            for (int var50 = 0; var50 < 4; var50++) {
                method186();
                for (int var51 = 0; var51 < 13; var51++) {
                    for (int var52 = 0; var52 < 13; var52++) {
                        boolean var53 = false;
                        int var54 = field350[var50][var51][var52];
                        if (var54 != -1) {
                            int var55 = var54 >> 24 & 0x3;
                            int var56 = var54 >> 1 & 0x3;
                            int var57 = var54 >> 14 & 0x3FF;
                            int var58 = var54 >> 3 & 0x7FF;
                            int var59 = (var57 / 8 << 8) + var58 / 8;
                            for (int var60 = 0; var60 < Statics.field1469.length; var60++) {
                                if (Statics.field1469[var60] == var59 && Statics.field105[var60] != null) {
                                    class12.method2083(Statics.field105[var60], var50, var51 * 8, var52 * 8, var55, (var57 & 0x7) * 8, (var58 & 0x7) * 8, var56, field552);
                                    var53 = true;
                                    break;
                                }
                            }
                        }
                        if (!var53) {
                            int var61 = var50;
                            int var62 = var51 * 8;
                            int var63 = var52 * 8;
                            for (int var64 = 0; var64 < 8; var64++) {
                                for (int var65 = 0; var65 < 8; var65++) {
                                    class12.field111[var61][var62 + var64][var63 + var65] = 0;
                                }
                            }
                            if (var62 > 0) {
                                for (int var66 = 1; var66 < 8; var66++) {
                                    class12.field111[var61][var62][var63 + var66] = class12.field111[var61][var62 - 1][var63 + var66];
                                }
                            }
                            if (var63 > 0) {
                                for (int var67 = 1; var67 < 8; var67++) {
                                    class12.field111[var61][var62 + var67][var63] = class12.field111[var61][var62 + var67][var63 - 1];
                                }
                            }
                            if (var62 > 0 && class12.field111[var61][var62 - 1][var63] != 0) {
                                class12.field111[var61][var62][var63] = class12.field111[var61][var62 - 1][var63];
                            } else if (var63 > 0 && class12.field111[var61][var62][var63 - 1] != 0) {
                                class12.field111[var61][var62][var63] = class12.field111[var61][var62][var63 - 1];
                            } else if (var62 > 0 && var63 > 0 && class12.field111[var61][var62 - 1][var63 - 1] != 0) {
                                class12.field111[var61][var62][var63] = class12.field111[var61][var62 - 1][var63 - 1];
                            }
                        }
                    }
                }
            }
            for (int var68 = 0; var68 < 13; var68++) {
                for (int var69 = 0; var69 < 13; var69++) {
                    int var70 = field350[0][var68][var69];
                    if (var70 == -1) {
                        class12.method1488(var68 * 8, var69 * 8, 8, 8);
                    }
                }
            }
            method11(true);
            for (int var71 = 0; var71 < 4; var71++) {
                method186();
                for (int var72 = 0; var72 < 13; var72++) {
                    for (int var73 = 0; var73 < 13; var73++) {
                        int var74 = field350[var71][var72][var73];
                        if (var74 != -1) {
                            int var75 = var74 >> 24 & 0x3;
                            int var76 = var74 >> 1 & 0x3;
                            int var77 = var74 >> 14 & 0x3FF;
                            int var78 = var74 >> 3 & 0x7FF;
                            int var79 = (var77 / 8 << 8) + var78 / 8;
                            for (int var80 = 0; var80 < Statics.field1469.length; var80++) {
                                if (Statics.field1469[var80] == var79 && Statics.field240[var80] != null) {
                                    class12.method1086(Statics.field240[var80], var71, var72 * 8, var73 * 8, var75, (var77 & 0x7) * 8, (var78 & 0x7) * 8, var76, Statics.field2244, field552);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method11(true);
        method180();
        method186();
        class12.method3083(Statics.field2244, field552);
        method11(true);
        int var81 = class12.field103;
        if (var81 > Statics.field2326) {
            var81 = Statics.field2326;
        }
        if (var81 < Statics.field2326 - 1) {
            int var82 = Statics.field2326 - 1;
        }
        if (field289) {
            Statics.field2244.method1651(class12.field103);
        } else {
            Statics.field2244.method1651(0);
        }
        for (int var83 = 0; var83 < 104; var83++) {
            for (int var84 = 0; var84 < 104; var84++) {
                method879(var83, var84);
            }
        }
        method186();
        method206();
        class198.field2905.method2220();
        if (Statics.field231 != null) {
            field331.method3010(124);
            field331.method2768(1057001181);
        }
        if (!field349) {
            int var85 = (Statics.field808 - 6) / 8;
            int var86 = (Statics.field808 + 6) / 8;
            int var87 = (Statics.field1465 - 6) / 8;
            int var88 = (Statics.field1465 + 6) / 8;
            for (int var89 = var85 - 1; var89 <= var86 + 1; var89++) {
                for (int var90 = var87 - 1; var90 <= var88 + 1; var90++) {
                    if (var89 < var85 || var89 > var86 || var90 < var87 || var90 > var88) {
                        Statics.field414.method3148("m" + var89 + "_" + var90);
                        Statics.field414.method3148("l" + var89 + "_" + var90);
                    }
                }
            }
        }
        method3231(30);
        method186();
        class12.method672();
        field331.method3010(254);
        class114.method605();
    }

    @ObfuscatedName("ai.bj(II)V")
    public static final void method682(int arg0) {
        int[] var1 = Statics.field880.field3207;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class12.field104[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field2244.method1684(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class12.field104[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field2244.method1684(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field880.method3904();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class12.field104[arg0][var10][var9] & 0x18) == 0) {
                    method2564(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class12.field104[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2564(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field516 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field2244.method1654(Statics.field2326, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class198.method197(var14).field2920;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field552[Statics.field2326].field1834;
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
                        field519[field516] = Statics.field97[var15];
                        field394[field516] = var16;
                        field429[field516] = var17;
                        field516++;
                    }
                }
            }
        }
        Statics.field744.method3856();
    }

    @ObfuscatedName("er.bu(IIIIII)V")
    public static final void method2564(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2244.method1676(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2244.method1791(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field880.field3207;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class198 var13 = class198.method197(var12);
            if (var13.field2921 == -1) {
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
                class223 var14 = Statics.field1564[var13.field2921];
                if (var14 != null) {
                    int var15 = (var13.field2904 * 4 - var14.field3187) / 2;
                    int var16 = (var13.field2908 * 4 - var14.field3185) / 2;
                    var14.method3877(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field2908) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2244.method1678(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2244.method1791(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class198 var22 = class198.method197(var21);
            if (var22.field2921 != -1) {
                class223 var23 = Statics.field1564[var22.field2921];
                if (var23 != null) {
                    int var24 = (var22.field2904 * 4 - var23.field3187) / 2;
                    int var25 = (var22.field2908 * 4 - var23.field3185) / 2;
                    var23.method3877(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field2908) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field880.field3207;
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
        int var29 = Statics.field2244.method1654(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class198 var31 = class198.method197(var30);
        if (var31.field2921 == -1) {
            return;
        }
        class223 var32 = Statics.field1564[var31.field2921];
        if (var32 != null) {
            int var33 = (var31.field2904 * 4 - var32.field3187) / 2;
            int var34 = (var31.field2908 * 4 - var32.field3185) / 2;
            var32.method3877(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field2908) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("aw.bk(B)Z")
    public static final boolean method627() {
        if (Statics.field1184 == null) {
            return false;
        }
        try {
            int var0 = Statics.field1184.method1968();
            if (var0 == 0) {
                return false;
            }
            if (field335 == -1) {
                Statics.field1184.method1969(field371.field2291, 0, 1);
                field371.field2285 = 0;
                field335 = field371.method3011();
                field565 = class213.field3118[field335];
                var0--;
            }
            if (field565 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field1184.method1969(field371.field2291, 0, 1);
                field565 = field371.field2291[0] & 0xFF;
                var0--;
            }
            if (field565 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field1184.method1969(field371.field2291, 0, 2);
                field371.field2285 = 0;
                field565 = field371.method2887();
                var0 -= 2;
            }
            if (var0 < field565) {
                return false;
            }
            field371.field2285 = 0;
            Statics.field1184.method1969(field371.field2291, 0, field565);
            field336 = 0;
            field340 = field339;
            field339 = field483;
            field483 = field335;
            if (field335 == 63) {
                int var1 = field371.method2785();
                int var2 = field371.method2887();
                class151 var3 = class151.method80(var1);
                if (var3.field2143 != 2 || var3.field2114 != var2) {
                    var3.field2143 = 2;
                    var3.field2114 = var2;
                    method1487(var3);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 128) {
                field554 = 1;
                field389 = field471;
                field335 = -1;
                return true;
            }
            if (field335 == 70) {
                int var4 = field371.method2823();
                if (field371.method2823() == 0) {
                    field562[var4] = new class5();
                    field371.field2285 += 18;
                } else {
                    field371.field2285--;
                    field562[var4] = new class5(field371, false);
                }
                field481 = field471;
                field335 = -1;
                return true;
            }
            if (field335 == 99) {
                String var5 = field371.method2847();
                long var6 = (long) field371.method2887();
                long var8 = (long) field371.method2784();
                class178 var10 = (class178) Statics.method1856(class178.method1118(), field371.method2823());
                long var11 = (var6 << 32) + var8;
                boolean var13 = false;
                for (int var14 = 0; var14 < 100; var14++) {
                    if (field507[var14] == var11) {
                        var13 = true;
                        break;
                    }
                }
                if (method3228(var5)) {
                    var13 = true;
                }
                if (!var13 && field367 == 0) {
                    field507[field551] = var11;
                    field551 = (field551 + 1) % 100;
                    String var15 = class210.method3726(class208.method2613(class211.method2763(field371)));
                    byte var16;
                    if (var10.field2675) {
                        var16 = 7;
                    } else {
                        var16 = 3;
                    }
                    if (var10.field2678 == -1) {
                        class48.method121(var16, var5, var15);
                    } else {
                        class48.method121(var16, class38.method117(var10.field2678) + var5, var15);
                    }
                }
                field335 = -1;
                return true;
            }
            if (field335 == 179) {
                field520 = field371.method2823();
                if (field520 == 255) {
                    field520 = 0;
                }
                field312 = field371.method2823();
                if (field312 == 255) {
                    field312 = 0;
                }
                field335 = -1;
                return true;
            }
            if (field335 == 124) {
                if (field391 != -1) {
                    method182(field391, 0);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 46) {
                field534 = false;
                for (int var17 = 0; var17 < 5; var17++) {
                    field430[var17] = false;
                }
                field335 = -1;
                return true;
            }
            if (field335 == 114) {
                int var18 = field371.method2823();
                int var19 = field371.method2823();
                int var20 = field371.method2823();
                int var21 = field371.method2823();
                field430[var18] = true;
                field536[var18] = var19;
                field537[var18] = var20;
                field538[var18] = var21;
                field472[var18] = 0;
                field335 = -1;
                return true;
            }
            if (field335 == 156) {
                for (int var22 = 0; var22 < field409.length; var22++) {
                    if (field409[var22] != null) {
                        field409[var22].field628 = -1;
                    }
                }
                for (int var23 = 0; var23 < field461.length; var23++) {
                    if (field461[var23] != null) {
                        field461[var23].field628 = -1;
                    }
                }
                field335 = -1;
                return true;
            }
            if (field335 == 177) {
                int var24 = field371.method2815();
                byte var25 = field371.method2810();
                class147.field2030[var24] = var25;
                if (class147.field2032[var24] != var25) {
                    class147.field2032[var24] = var25;
                }
                method784(var24);
                field401[++field473 - 1 & 0x1F] = var24;
                field335 = -1;
                return true;
            }
            if (field335 == 76) {
                method205(true);
                field335 = -1;
                return true;
            }
            if (field335 == 90) {
                int var26 = field371.method2887();
                int var27 = field371.method2857();
                int var28 = var26 >> 10 & 0x1F;
                int var29 = var26 >> 5 & 0x1F;
                int var30 = var26 & 0x1F;
                int var31 = (var30 << 3) + (var28 << 19) + (var29 << 11);
                class151 var32 = class151.method80(var27);
                if (var32.field2095 != var31) {
                    var32.field2095 = var31;
                    method1487(var32);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 80) {
                field534 = true;
                Statics.field2022 = field371.method2823();
                Statics.field788 = field371.method2823();
                Statics.field2007 = field371.method2887();
                Statics.field129 = field371.method2823();
                Statics.field84 = field371.method2823();
                if (Statics.field84 >= 100) {
                    int var33 = Statics.field2022 * 128 + 64;
                    int var34 = Statics.field788 * 128 + 64;
                    int var35 = method162(var33, var34, Statics.field2326) - Statics.field2007;
                    int var36 = var33 - Statics.field42;
                    int var37 = var35 - Statics.field360;
                    int var38 = var34 - Statics.field568;
                    int var39 = (int) Math.sqrt((double) (var36 * var36 + var38 * var38));
                    Statics.field813 = (int) (Math.atan2((double) var37, (double) var39) * 325.949D) & 0x7FF;
                    Statics.field1691 = (int) (Math.atan2((double) var36, (double) var38) * -325.949D) & 0x7FF;
                    if (Statics.field813 < 128) {
                        Statics.field813 = 128;
                    }
                    if (Statics.field813 > 383) {
                        Statics.field813 = 383;
                    }
                }
                field335 = -1;
                return true;
            }
            if (field335 == 58) {
                int var40 = field371.method2826();
                int var41 = field371.method2815();
                int var42 = field371.method2815();
                int var43 = field371.method2815();
                class151 var44 = class151.method80(var40);
                if (var44.field2189 != var42 || var44.field2122 != var43 || var44.field2135 != var41) {
                    var44.field2189 = var42;
                    var44.field2122 = var43;
                    var44.field2135 = var41;
                    method1487(var44);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 203) {
                Statics.field66 = field371.method2807();
                Statics.field33 = field371.method2809();
                field335 = -1;
                return true;
            }
            if (field335 == 39) {
                method3169();
                field452 = field371.method2783();
                field380 = field471;
                field335 = -1;
                return true;
            }
            if (field335 == 235) {
                for (int var45 = 0; var45 < class147.field2032.length; var45++) {
                    if (class147.field2032[var45] != class147.field2030[var45]) {
                        class147.field2032[var45] = class147.field2030[var45];
                        method784(var45);
                        field401[++field473 - 1 & 0x1F] = var45;
                    }
                }
                field335 = -1;
                return true;
            }
            if (field335 == 119) {
                int var46 = field371.method2943();
                int var47 = field371.method2857();
                class151 var48 = class151.method80(var47);
                if (var48 != null && var48.field2163 == 0) {
                    if (var46 > var48.field2094 - var48.field2086) {
                        var46 = var48.field2094 - var48.field2086;
                    }
                    if (var46 < 0) {
                        var46 = 0;
                    }
                    if (var48.field2092 != var46) {
                        var48.field2092 = var46;
                        method1487(var48);
                    }
                }
                field335 = -1;
                return true;
            }
            if (field335 == 20) {
                String var49 = field371.method2847();
                long var50 = field371.method2908();
                long var52 = (long) field371.method2887();
                long var54 = (long) field371.method2784();
                class178 var56 = (class178) Statics.method1856(class178.method1118(), field371.method2823());
                long var57 = (var52 << 32) + var54;
                boolean var59 = false;
                for (int var60 = 0; var60 < 100; var60++) {
                    if (field507[var60] == var57) {
                        var59 = true;
                        break;
                    }
                }
                if (var56.field2674 && method3228(var49)) {
                    var59 = true;
                }
                if (!var59 && field367 == 0) {
                    field507[field551] = var57;
                    field551 = (field551 + 1) % 100;
                    String var61 = class210.method3726(class208.method2613(class211.method2763(field371)));
                    if (var56.field2678 == -1) {
                        class48.method742(9, var49, var61, class206.method160(var50));
                    } else {
                        class48.method742(9, class38.method117(var56.field2678) + var49, var61, class206.method160(var50));
                    }
                }
                field335 = -1;
                return true;
            }
            if (field335 == 117 || field335 == 16 || field335 == 208 || field335 == 243 || field335 == 209 || field335 == 175 || field335 == 165 || field335 == 50 || field335 == 169 || field335 == 107) {
                method184();
                field335 = -1;
                return true;
            }
            if (field335 == 64) {
                method3169();
                int var62 = field371.method2807();
                int var63 = field371.method2809();
                int var64 = field371.method2857();
                field545[var62] = var64;
                field423[var62] = var63;
                field424[var62] = 1;
                for (int var65 = 0; var65 < 98; var65++) {
                    if (var64 >= class173.field2363[var65]) {
                        field424[var62] = var65 + 2;
                    }
                }
                field476[++field477 - 1 & 0x1F] = var62;
                field335 = -1;
                return true;
            }
            if (field335 == 32) {
                int var66 = field371.method2943();
                int var67 = field371.method2887();
                int var68 = field371.method2785();
                class151 var69 = class151.method80(var68);
                var69.field2113 = (var67 << 16) + var66;
                field335 = -1;
                return true;
            }
            if (field335 == 216) {
                field534 = true;
                Statics.field949 = field371.method2823();
                Statics.field653 = field371.method2823();
                Statics.field1086 = field371.method2887();
                Statics.field1536 = field371.method2823();
                Statics.field1759 = field371.method2823();
                if (Statics.field1759 >= 100) {
                    Statics.field42 = Statics.field949 * 128 + 64;
                    Statics.field568 = Statics.field653 * 128 + 64;
                    Statics.field360 = method162(Statics.field42, Statics.field568, Statics.field2326) - Statics.field1086;
                }
                field335 = -1;
                return true;
            }
            if (field335 == 164) {
                int var70 = field371.method2887();
                field391 = var70;
                method1861(field391, Statics.field170, Statics.field1104, false);
                method604(var70);
                class33.method104(field391);
                for (int var71 = 0; var71 < 100; var71++) {
                    field491[var71] = true;
                }
                field335 = -1;
                return true;
            }
            if (field335 == 87) {
                int var72 = field371.method2823();
                class217[] var73 = new class217[] { class217.field3155, class217.field3157, class217.field3156 };
                class217[] var74 = var73;
                int var75 = 0;
                class217 var77;
                while (true) {
                    if (var75 >= var74.length) {
                        var77 = null;
                        break;
                    }
                    class217 var76 = var74[var75];
                    if (var76.field3154 == var72) {
                        var77 = var76;
                        break;
                    }
                    var75++;
                }
                Statics.field569 = var77;
                field335 = -1;
                return true;
            }
            if (field335 == 45) {
                field480 = field471;
                if (field565 == 0) {
                    field513 = null;
                    field329 = null;
                    Statics.field1073 = 0;
                    Statics.field2321 = null;
                    field335 = -1;
                    return true;
                }
                field329 = field371.method2847();
                long var78 = field371.method2908();
                long var80 = var78;
                String var82;
                if (var78 <= 0L || var78 >= 6582952005840035281L) {
                    var82 = null;
                } else if (var78 % 37L == 0L) {
                    var82 = null;
                } else {
                    int var83 = 0;
                    for (long var84 = var78; var84 != 0L; var84 /= 37L) {
                        var83++;
                    }
                    StringBuilder var86 = new StringBuilder(var83);
                    while (var80 != 0L) {
                        long var87 = var80;
                        var80 /= 37L;
                        var86.append(class206.field3075[(int) (var87 - var80 * 37L)]);
                    }
                    var82 = var86.reverse().toString();
                }
                field513 = var82;
                Statics.field274 = field371.method2837();
                int var89 = field371.method2823();
                if (var89 == 255) {
                    field335 = -1;
                    return true;
                }
                Statics.field1073 = var89;
                class25[] var90 = new class25[100];
                for (int var91 = 0; var91 < Statics.field1073; var91++) {
                    var90[var91] = new class25();
                    var90[var91].field271 = field371.method2847();
                    var90[var91].field278 = class205.method2984(var90[var91].field271, Statics.field1741);
                    var90[var91].field272 = field371.method2887();
                    var90[var91].field273 = field371.method2837();
                    field371.method2847();
                    if (var90[var91].field271.equals(Statics.field810.field257)) {
                        Statics.field176 = var90[var91].field273;
                    }
                }
                boolean var92 = false;
                int var93 = Statics.field1073;
                while (var93 > 0) {
                    boolean var94 = true;
                    var93--;
                    for (int var95 = 0; var95 < var93; var95++) {
                        if (var90[var95].field278.compareTo(var90[var95 + 1].field278) > 0) {
                            class25 var96 = var90[var95];
                            var90[var95] = var90[var95 + 1];
                            var90[var95 + 1] = var96;
                            var94 = false;
                        }
                    }
                    if (var94) {
                        break;
                    }
                }
                Statics.field2321 = var90;
                field335 = -1;
                return true;
            }
            if (field335 == 228) {
                int var97 = field371.method2827();
                boolean var98 = field371.method2809() == 1;
                class151 var99 = class151.method80(var97);
                if (var99.field2085 != var98) {
                    var99.field2085 = var98;
                    method1487(var99);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 192) {
                method3169();
                field451 = field371.method2823();
                field380 = field471;
                field335 = -1;
                return true;
            }
            if (field335 == 214) {
                int var100 = field371.method2793();
                boolean var101 = field371.method2823() == 1;
                String var102 = "";
                boolean var103 = false;
                if (var101) {
                    var102 = field371.method2847();
                    if (method3228(var102)) {
                        var103 = true;
                    }
                }
                String var104 = field371.method2847();
                if (!var103) {
                    class48.method121(var100, var102, var104);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 204) {
                class46.method1836();
                for (int var105 = 0; var105 < 2048; var105++) {
                    field409[var105] = null;
                }
                class46.method702(field371);
                field335 = -1;
                return true;
            }
            if (field335 == 12) {
                field371.field2285 += 28;
                if (field371.method2803()) {
                    class167 var106 = field371;
                    int var107 = field371.field2285 - 28;
                    if (class105.field1690 != null) {
                        try {
                            class105.field1690.method1335(0L);
                            class105.field1690.method1329(var106.field2291, var107, 24);
                        } catch (Exception var452) {
                        }
                    }
                }
                field335 = -1;
                return true;
            }
            if (field335 == 102) {
                String var109 = field371.method2847();
                int var110 = field371.method2823();
                int var111 = field371.method2808();
                if (var110 >= 1 && var110 <= 8) {
                    if (var109.equalsIgnoreCase("null")) {
                        var109 = null;
                    }
                    field415[var110 - 1] = var109;
                    field435[var110 - 1] = var111 == 0;
                }
                field335 = -1;
                return true;
            }
            if (field335 == 2) {
                field522 = field371.method2823();
                field335 = -1;
                return true;
            }
            if (field335 == 18) {
                int var112 = field371.method2815();
                int var113 = field371.method2823();
                int var114 = field371.method2826();
                class18 var115 = (class18) field447.method2229((long) var114);
                if (var115 != null) {
                    method69(var115, var115.field180 != var112);
                }
                class18 var116 = new class18();
                var116.field180 = var112;
                var116.field175 = var113;
                field447.method2230(var116, (long) var114);
                method604(var112);
                class151 var117 = class151.method80(var114);
                method1487(var117);
                if (field450 != null) {
                    method1487(field450);
                    field450 = null;
                }
                method2985();
                method3089(Statics.field2173[var114 >> 16], var117, false);
                class33.method104(var112);
                if (field391 != -1) {
                    method182(field391, 1);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 188) {
                int var118 = field371.method2785();
                int var119 = field371.method2887();
                if (var118 < -70000) {
                    var119 += 32768;
                }
                class151 var120;
                if (var118 >= 0) {
                    var120 = class151.method80(var118);
                } else {
                    var120 = null;
                }
                while (field371.field2285 < field565) {
                    int var121 = field371.method2793();
                    int var122 = field371.method2887();
                    int var123 = 0;
                    if (var122 != 0) {
                        var123 = field371.method2823();
                        if (var123 == 255) {
                            var123 = field371.method2785();
                        }
                    }
                    if (var120 != null && var121 >= 0 && var121 < var120.field2188.length) {
                        var120.field2188[var121] = var122;
                        var120.field2185[var121] = var123;
                    }
                    class13.method20(var119, var121, var122 - 1, var123);
                }
                if (var120 != null) {
                    method1487(var120);
                }
                method3169();
                field474[++field469 - 1 & 0x1F] = var119 & 0x7FFF;
                field335 = -1;
                return true;
            }
            if (field335 == 52) {
                int var124 = field371.method2857();
                Statics.field773 = Statics.field160.method1867(var124);
                field335 = -1;
                return true;
            }
            if (field335 == 13) {
                boolean var125 = field371.method2823() == 1;
                if (var125) {
                    Statics.field22 = class163.method3594() - field371.method2908();
                    Statics.field34 = new class2(field371, true);
                } else {
                    Statics.field34 = null;
                }
                field482 = field471;
                field335 = -1;
                return true;
            }
            if (field335 == 100) {
                int var126 = field371.method2815();
                if (var126 == 65535) {
                    var126 = -1;
                }
                method737(var126);
                field335 = -1;
                return true;
            }
            if (field335 == 38) {
                int var127 = field371.method2887();
                if (var127 == 65535) {
                    var127 = -1;
                }
                int var128 = field371.method2821();
                if (field523 != 0 && var127 != -1) {
                    class139.method2173(Statics.field333, var127, 0, field523, false);
                    field525 = true;
                }
                field335 = -1;
                return true;
            }
            if (field335 == 168) {
                String var129 = field371.method2847();
                Statics.field92 = var129;
                try {
                    String var130 = Statics.field282.getParameter(class215.field3138.field3153);
                    String var131 = Statics.field282.getParameter(class215.field3151.field3153);
                    String var132 = var130 + "settings=" + var129 + "; version=1; path=/; domain=" + var131;
                    String var133;
                    if (var129.length() == 0) {
                        var133 = var132 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        String var134 = var132 + "; Expires=";
                        long var135 = class163.method3594() + 94608000000L;
                        class170.field2344.setTime(new Date(var135));
                        int var137 = class170.field2344.get(7);
                        int var138 = class170.field2344.get(5);
                        int var139 = class170.field2344.get(2);
                        int var140 = class170.field2344.get(1);
                        int var141 = class170.field2344.get(11);
                        int var142 = class170.field2344.get(12);
                        int var143 = class170.field2344.get(13);
                        String var144 = class170.field2345[var137 - 1] + ", " + var138 / 10 + var138 % 10 + "-" + class170.field2346[0][var139] + "-" + var140 + " " + var141 / 10 + var141 % 10 + ":" + var142 / 10 + var142 % 10 + ":" + var143 / 10 + var143 % 10 + " GMT";
                        var133 = var134 + var144 + "; Max-Age=" + 94608000L;
                    }
                    class101.method1850(Statics.field282, "document.cookie=\"" + var133 + "\"");
                } catch (Throwable var451) {
                }
                field335 = -1;
                return true;
            }
            if (field335 == 54) {
                String var146 = field371.method2847();
                Object[] var147 = new Object[var146.length() + 1];
                for (int var148 = var146.length() - 1; var148 >= 0; var148--) {
                    if (var146.charAt(var148) == 's') {
                        var147[var148 + 1] = field371.method2847();
                    } else {
                        var147[var148 + 1] = Integer.valueOf(field371.method2785());
                    }
                }
                var147[0] = Integer.valueOf(field371.method2785());
                class19 var149 = new class19();
                var149.field197 = var147;
                class33.method3007(var149, 200000);
                field335 = -1;
                return true;
            }
            if (field335 == 19) {
                String var150 = field371.method2847();
                int var151 = field371.method2887();
                byte var152 = field371.method2837();
                boolean var153 = false;
                if (var152 == -128) {
                    var153 = true;
                }
                if (var153) {
                    if (Statics.field1073 == 0) {
                        field335 = -1;
                        return true;
                    }
                    boolean var154 = false;
                    int var155;
                    for (var155 = 0; var155 < Statics.field1073 && (!Statics.field2321[var155].field271.equals(var150) || Statics.field2321[var155].field272 != var151); var155++) {
                    }
                    if (var155 < Statics.field1073) {
                        while (var155 < Statics.field1073 - 1) {
                            Statics.field2321[var155] = Statics.field2321[var155 + 1];
                            var155++;
                        }
                        Statics.field1073--;
                        Statics.field2321[Statics.field1073] = null;
                    }
                } else {
                    field371.method2847();
                    class25 var156 = new class25();
                    var156.field271 = var150;
                    var156.field278 = class205.method2984(var156.field271, Statics.field1741);
                    var156.field272 = var151;
                    var156.field273 = var152;
                    int var157;
                    for (var157 = Statics.field1073 - 1; var157 >= 0; var157--) {
                        int var158 = Statics.field2321[var157].field278.compareTo(var156.field278);
                        if (var158 == 0) {
                            Statics.field2321[var157].field272 = var151;
                            Statics.field2321[var157].field273 = var152;
                            if (var150.equals(Statics.field810.field257)) {
                                Statics.field176 = var152;
                            }
                            field480 = field471;
                            field335 = -1;
                            return true;
                        }
                        if (var158 < 0) {
                            break;
                        }
                    }
                    if (Statics.field1073 >= Statics.field2321.length) {
                        field335 = -1;
                        return true;
                    }
                    for (int var159 = Statics.field1073 - 1; var159 > var157; var159--) {
                        Statics.field2321[var159 + 1] = Statics.field2321[var159];
                    }
                    if (Statics.field1073 == 0) {
                        Statics.field2321 = new class25[100];
                    }
                    Statics.field2321[var157 + 1] = var156;
                    Statics.field1073++;
                    if (var150.equals(Statics.field810.field257)) {
                        Statics.field176 = var152;
                    }
                }
                field480 = field471;
                field335 = -1;
                return true;
            }
            if (field335 == 250) {
                int var160 = field371.method2785();
                class18 var161 = (class18) field447.method2229((long) var160);
                if (var161 != null) {
                    method69(var161, true);
                }
                if (field450 != null) {
                    method1487(field450);
                    field450 = null;
                }
                field335 = -1;
                return true;
            }
            if (field335 == 142) {
                int var162 = field371.method2857();
                class151 var163 = class151.method80(var162);
                for (int var164 = 0; var164 < var163.field2188.length; var164++) {
                    var163.field2188[var164] = -1;
                    var163.field2188[var164] = 0;
                }
                method1487(var163);
                field335 = -1;
                return true;
            }
            if (field335 == 41) {
                field365 = field371.method2823();
                field505 = field371.method2823();
                field335 = -1;
                return true;
            }
            if (field335 == 140) {
                class167 var165 = field371;
                int var166 = field565;
                int var167 = var165.field2285;
                class46.field909 = 0;
                int var168 = 0;
                var165.method3008();
                for (int var169 = 0; var169 < class46.field898; var169++) {
                    int var170 = class46.field903[var169];
                    if ((class46.field899[var170] & 0x1) == 0) {
                        if (var168 > 0) {
                            var168--;
                            class46.field899[var170] = (byte) (class46.field899[var170] | 0x2);
                        } else {
                            int var171 = var165.method3013(1);
                            if (var171 == 0) {
                                var168 = class46.method3088(var165);
                                class46.field899[var170] = (byte) (class46.field899[var170] | 0x2);
                            } else {
                                class46.method15(var165, var170);
                            }
                        }
                    }
                }
                var165.method3014();
                if (var168 != 0) {
                    throw new RuntimeException();
                }
                var165.method3008();
                for (int var172 = 0; var172 < class46.field898; var172++) {
                    int var173 = class46.field903[var172];
                    if ((class46.field899[var173] & 0x1) != 0) {
                        if (var168 > 0) {
                            var168--;
                            class46.field899[var173] = (byte) (class46.field899[var173] | 0x2);
                        } else {
                            int var174 = var165.method3013(1);
                            if (var174 == 0) {
                                var168 = class46.method3088(var165);
                                class46.field899[var173] = (byte) (class46.field899[var173] | 0x2);
                            } else {
                                class46.method15(var165, var173);
                            }
                        }
                    }
                }
                var165.method3014();
                if (var168 != 0) {
                    throw new RuntimeException();
                }
                var165.method3008();
                for (int var175 = 0; var175 < class46.field904; var175++) {
                    int var176 = class46.field905[var175];
                    if ((class46.field899[var176] & 0x1) != 0) {
                        if (var168 > 0) {
                            var168--;
                            class46.field899[var176] = (byte) (class46.field899[var176] | 0x2);
                        } else {
                            int var177 = var165.method3013(1);
                            if (var177 == 0) {
                                var168 = class46.method3088(var165);
                                class46.field899[var176] = (byte) (class46.field899[var176] | 0x2);
                            } else if (class46.method797(var165, var176)) {
                                class46.field899[var176] = (byte) (class46.field899[var176] | 0x2);
                            }
                        }
                    }
                }
                var165.method3014();
                if (var168 != 0) {
                    throw new RuntimeException();
                }
                var165.method3008();
                for (int var178 = 0; var178 < class46.field904; var178++) {
                    int var179 = class46.field905[var178];
                    if ((class46.field899[var179] & 0x1) == 0) {
                        if (var168 > 0) {
                            var168--;
                            class46.field899[var179] = (byte) (class46.field899[var179] | 0x2);
                        } else {
                            int var180 = var165.method3013(1);
                            if (var180 == 0) {
                                var168 = class46.method3088(var165);
                                class46.field899[var179] = (byte) (class46.field899[var179] | 0x2);
                            } else if (class46.method797(var165, var179)) {
                                class46.field899[var179] = (byte) (class46.field899[var179] | 0x2);
                            }
                        }
                    }
                }
                var165.method3014();
                if (var168 != 0) {
                    throw new RuntimeException();
                }
                class46.field898 = 0;
                class46.field904 = 0;
                for (int var181 = 1; var181 < 2048; var181++) {
                    class46.field899[var181] = (byte) (class46.field899[var181] >> 1);
                    class24 var182 = field409[var181];
                    if (var182 == null) {
                        class46.field905[++class46.field904 - 1] = var181;
                    } else {
                        class46.field903[++class46.field898 - 1] = var181;
                    }
                }
                for (int var183 = 0; var183 < class46.field909; var183++) {
                    int var184 = class46.field910[var183];
                    class24 var185 = field409[var184];
                    int var186 = var165.method2823();
                    if ((var186 & 0x40) != 0) {
                        var186 += var165.method2823() << 8;
                    }
                    byte var187 = -1;
                    if ((var186 & 0x20) != 0) {
                        int var188 = var165.method2823();
                        byte[] var189 = new byte[var188];
                        class161 var190 = new class161(var189);
                        var165.method2833(var189, 0, var188);
                        class46.field901[var184] = var190;
                        var185.method231(var190);
                    }
                    if ((var186 & 0x80) != 0) {
                        int var191 = var165.method2887();
                        if (var191 == 65535) {
                            var191 = -1;
                        }
                        int var192 = var165.method2823();
                        method739(var185, var191, var192);
                    }
                    if ((var186 & 0x8) != 0) {
                        var185.field642 = var165.method2887();
                        if (var185.field642 == 65535) {
                            var185.field642 = -1;
                        }
                    }
                    if ((var186 & 0x1) != 0) {
                        var185.field603 = var165.method2847();
                        if (var185.field603.charAt(0) == '~') {
                            var185.field603 = var185.field603.substring(1);
                            class48.method121(2, var185.field257, var185.field603);
                        } else if (Statics.field810 == var185) {
                            class48.method121(2, var185.field257, var185.field603);
                        }
                        var185.field610 = false;
                        var185.field613 = 0;
                        var185.field614 = 0;
                        var185.field608 = 150;
                    }
                    if ((var186 & 0x4) != 0) {
                        int var193 = var165.method2823();
                        if (var193 > 0) {
                            for (int var194 = 0; var194 < var193; var194++) {
                                int var195 = -1;
                                int var196 = -1;
                                int var197 = -1;
                                int var198 = var165.method2793();
                                if (var198 == 32767) {
                                    var198 = var165.method2793();
                                    var196 = var165.method2793();
                                    var195 = var165.method2793();
                                    var197 = var165.method2793();
                                } else if (var198 == 32766) {
                                    var198 = -1;
                                } else {
                                    var196 = var165.method2793();
                                }
                                int var199 = var165.method2793();
                                var185.method621(var198, var196, var195, var197, field295, var199);
                            }
                        }
                        int var200 = var165.method2823();
                        if (var200 > 0) {
                            for (int var201 = 0; var201 < var200; var201++) {
                                int var202 = var165.method2793();
                                int var203 = var165.method2793();
                                if (var203 == 32767) {
                                    var185.method620(var202);
                                } else {
                                    int var204 = var165.method2793();
                                    int var205 = var165.method2823();
                                    int var206 = var203 > 0 ? var165.method2823() : var205;
                                    var185.method619(var202, field295, var203, var204, var205, var206);
                                }
                            }
                        }
                    }
                    if ((var186 & 0x10) != 0) {
                        var185.field624 = var165.method2887();
                        if (var185.field650 == 0) {
                            var185.field647 = var185.field624;
                            var185.field624 = -1;
                        }
                    }
                    if ((var186 & 0x2) != 0) {
                        int var207 = var165.method2887();
                        class178 var208 = (class178) Statics.method1856(class178.method1118(), var165.method2823());
                        boolean var209 = var165.method2823() == 1;
                        int var210 = var165.method2823();
                        int var211 = var165.field2285;
                        if (var185.field257 != null && var185.field245 != null) {
                            boolean var212 = false;
                            if (var208.field2674 && method3228(var185.field257)) {
                                var212 = true;
                            }
                            if (!var212 && field367 == 0 && !var185.field264) {
                                class46.field900.field2285 = 0;
                                var165.method2833(class46.field900.field2291, 0, var210);
                                class46.field900.field2285 = 0;
                                String var213 = class210.method3726(class208.method2613(class211.method2763(class46.field900)));
                                var185.field603 = var213.trim();
                                var185.field613 = var207 >> 8;
                                var185.field614 = var207 & 0xFF;
                                var185.field608 = 150;
                                var185.field610 = var209;
                                var185.field611 = Statics.field810 != var185 && var208.field2674 && field506 != "" && var213.toLowerCase().indexOf(field506) == -1;
                                int var214;
                                if (var208.field2675) {
                                    var214 = var209 ? 91 : 1;
                                } else {
                                    var214 = var209 ? 90 : 2;
                                }
                                if (var208.field2678 == -1) {
                                    class48.method121(var214, var185.field257, var213);
                                } else {
                                    class48.method121(var214, class38.method117(var208.field2678) + var185.field257, var213);
                                }
                            }
                        }
                        var165.field2285 = var210 + var211;
                    }
                    if ((var186 & 0x1000) != 0) {
                        var185.field633 = var165.method2887();
                        int var215 = var165.method2785();
                        var185.field637 = var215 >> 16;
                        var185.field609 = (var215 & 0xFFFF) + field295;
                        var185.field634 = 0;
                        var185.field617 = 0;
                        if (var185.field609 > field295) {
                            var185.field634 = -1;
                        }
                        if (var185.field633 == 65535) {
                            var185.field633 = -1;
                        }
                    }
                    if ((var186 & 0x800) != 0) {
                        var185.field638 = var165.method2837();
                        var185.field640 = var165.method2837();
                        var185.field639 = var165.method2837();
                        var185.field641 = var165.method2837();
                        var185.field649 = var165.method2887() + field295;
                        var185.field643 = var165.method2887() + field295;
                        var185.field644 = var165.method2887();
                        if (var185.field265) {
                            var185.field638 += var185.field248;
                            var185.field640 += var185.field269;
                            var185.field639 += var185.field248;
                            var185.field641 += var185.field269;
                            var185.field650 = 0;
                        } else {
                            var185.field638 += var185.field629[0];
                            var185.field640 += var185.field652[0];
                            var185.field639 += var185.field629[0];
                            var185.field641 += var185.field652[0];
                            var185.field650 = 1;
                        }
                        var185.field655 = 0;
                    }
                    if ((var186 & 0x400) != 0) {
                        class46.field902[var184] = var165.method2837();
                    }
                    if ((var186 & 0x100) != 0) {
                        var187 = var165.method2837();
                    }
                    if ((var186 & 0x200) != 0) {
                        for (int var216 = 0; var216 < 3; var216++) {
                            var185.field251[var216] = var165.method2847();
                        }
                    }
                    if (var185.field265) {
                        if (var187 == 127) {
                            var185.method235(var185.field248, var185.field269);
                        } else {
                            byte var217;
                            if (var187 == -1) {
                                var217 = class46.field902[var184];
                            } else {
                                var217 = var187;
                            }
                            var185.method234(var185.field248, var185.field269, var217);
                        }
                    }
                }
                if (var165.field2285 - var167 != var166) {
                    throw new RuntimeException(var165.field2285 - var167 + " " + var166);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 116) {
                String var218 = field371.method2847();
                String var219 = class210.method3726(class208.method2613(class211.method2763(field371)));
                class48.method121(6, var218, var219);
                field335 = -1;
                return true;
            }
            if (field335 == 207) {
                while (field371.field2285 < field565) {
                    int var220 = field371.method2823();
                    boolean var221 = (var220 & 0x1) == 1;
                    String var222 = field371.method2847();
                    String var223 = field371.method2847();
                    field371.method2847();
                    for (int var224 = 0; var224 < field557; var224++) {
                        class20 var225 = field558[var224];
                        if (var221) {
                            if (var223.equals(var225.field205)) {
                                var225.field205 = var222;
                                var225.field211 = var223;
                                var222 = null;
                                break;
                            }
                        } else if (var222.equals(var225.field205)) {
                            var225.field205 = var222;
                            var225.field211 = var223;
                            var222 = null;
                            break;
                        }
                    }
                    if (var222 != null && field557 < 400) {
                        class20 var226 = new class20();
                        field558[field557] = var226;
                        var226.field205 = var222;
                        var226.field211 = var223;
                        field557++;
                    }
                }
                field389 = field471;
                field335 = -1;
                return true;
            }
            if (field335 == 67) {
                int var227 = field371.method2785();
                int var228 = field371.method2887();
                if (var227 < -70000) {
                    var228 += 32768;
                }
                class151 var229;
                if (var227 >= 0) {
                    var229 = class151.method80(var227);
                } else {
                    var229 = null;
                }
                if (var229 != null) {
                    for (int var230 = 0; var230 < var229.field2188.length; var230++) {
                        var229.field2188[var230] = 0;
                        var229.field2185[var230] = 0;
                    }
                }
                class13.method866(var228);
                int var231 = field371.method2887();
                for (int var232 = 0; var232 < var231; var232++) {
                    int var233 = field371.method2816();
                    int var234 = field371.method2823();
                    if (var234 == 255) {
                        var234 = field371.method2826();
                    }
                    if (var229 != null && var232 < var229.field2188.length) {
                        var229.field2188[var232] = var233;
                        var229.field2185[var232] = var234;
                    }
                    class13.method20(var228, var232, var233 - 1, var234);
                }
                if (var229 != null) {
                    method1487(var229);
                }
                method3169();
                field474[++field469 - 1 & 0x1F] = var228 & 0x7FFF;
                field335 = -1;
                return true;
            }
            if (field335 == 158) {
                for (int var235 = 0; var235 < Statics.field2774; var235++) {
                    class188 var236 = class188.method3084(var235);
                    if (var236 != null) {
                        class147.field2030[var235] = 0;
                        class147.field2032[var235] = 0;
                    }
                }
                method3169();
                field473 += 32;
                field335 = -1;
                return true;
            }
            if (field335 == 191) {
                Statics.field33 = field371.method2809();
                Statics.field66 = field371.method2823();
                while (field371.field2285 < field565) {
                    field335 = field371.method2823();
                    method184();
                }
                field335 = -1;
                return true;
            }
            if (field335 == 11) {
                method2056();
                field335 = -1;
                return false;
            }
            if (field335 == 186) {
                int var237 = field371.method2887();
                int var238 = field371.method2823();
                int var239 = field371.method2887();
                if (field479 != 0 && var238 != 0 && field528 < 50) {
                    field529[field528] = var237;
                    field530[field528] = var238;
                    field432[field528] = var239;
                    field533[field528] = null;
                    field300[field528] = 0;
                    field528++;
                }
                field335 = -1;
                return true;
            }
            if (field335 == 28) {
                int var243 = field371.method2826();
                int var244 = field371.method2818();
                class151 var245 = class151.method80(var243);
                if (var245.field2117 != var244 || var244 == -1) {
                    var245.field2117 = var244;
                    var245.field2058 = 0;
                    var245.field2193 = 0;
                    method1487(var245);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 78) {
                class228.method189(field371, field565);
                field335 = -1;
                return true;
            }
            if (field335 == 134) {
                int var246 = field371.method2785();
                int var247 = field371.method2785();
                if (Statics.field1652 == null || !Statics.field1652.isValid()) {
                    try {
                        Iterator var248 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var248.hasNext()) {
                            GarbageCollectorMXBean var249 = (GarbageCollectorMXBean) var248.next();
                            if (var249.isValid()) {
                                Statics.field1652 = var249;
                                field514 = -1L;
                                field563 = -1L;
                            }
                        }
                    } catch (Throwable var453) {
                    }
                }
                long var251 = class163.method3594();
                int var253 = -1;
                if (Statics.field1652 != null) {
                    long var254 = Statics.field1652.getCollectionTime();
                    if (field563 != -1L) {
                        long var256 = var254 - field563;
                        long var258 = var251 - field514;
                        if (var258 != 0L) {
                            var253 = (int) (var256 * 100L / var258);
                        }
                    }
                    field563 = var254;
                    field514 = var251;
                }
                field331.method3010(185);
                field331.method2776(field1776);
                field331.method2768(var246);
                field331.method2801(var247);
                field331.method2776(var253);
                field335 = -1;
                return true;
            }
            if (field335 == 244) {
                method118(true);
                field371.method3011();
                int var260 = field371.method2887();
                class167 var261 = field371;
                int var262 = var261.field2285;
                class46.field909 = 0;
                int var263 = 0;
                var261.method3008();
                for (int var264 = 0; var264 < class46.field898; var264++) {
                    int var265 = class46.field903[var264];
                    if ((class46.field899[var265] & 0x1) == 0) {
                        if (var263 > 0) {
                            var263--;
                            class46.field899[var265] = (byte) (class46.field899[var265] | 0x2);
                        } else {
                            int var266 = var261.method3013(1);
                            if (var266 == 0) {
                                var263 = class46.method3088(var261);
                                class46.field899[var265] = (byte) (class46.field899[var265] | 0x2);
                            } else {
                                class46.method15(var261, var265);
                            }
                        }
                    }
                }
                var261.method3014();
                if (var263 != 0) {
                    throw new RuntimeException();
                }
                var261.method3008();
                for (int var267 = 0; var267 < class46.field898; var267++) {
                    int var268 = class46.field903[var267];
                    if ((class46.field899[var268] & 0x1) != 0) {
                        if (var263 > 0) {
                            var263--;
                            class46.field899[var268] = (byte) (class46.field899[var268] | 0x2);
                        } else {
                            int var269 = var261.method3013(1);
                            if (var269 == 0) {
                                var263 = class46.method3088(var261);
                                class46.field899[var268] = (byte) (class46.field899[var268] | 0x2);
                            } else {
                                class46.method15(var261, var268);
                            }
                        }
                    }
                }
                var261.method3014();
                if (var263 != 0) {
                    throw new RuntimeException();
                }
                var261.method3008();
                for (int var270 = 0; var270 < class46.field904; var270++) {
                    int var271 = class46.field905[var270];
                    if ((class46.field899[var271] & 0x1) != 0) {
                        if (var263 > 0) {
                            var263--;
                            class46.field899[var271] = (byte) (class46.field899[var271] | 0x2);
                        } else {
                            int var272 = var261.method3013(1);
                            if (var272 == 0) {
                                var263 = class46.method3088(var261);
                                class46.field899[var271] = (byte) (class46.field899[var271] | 0x2);
                            } else if (class46.method797(var261, var271)) {
                                class46.field899[var271] = (byte) (class46.field899[var271] | 0x2);
                            }
                        }
                    }
                }
                var261.method3014();
                if (var263 != 0) {
                    throw new RuntimeException();
                }
                var261.method3008();
                for (int var273 = 0; var273 < class46.field904; var273++) {
                    int var274 = class46.field905[var273];
                    if ((class46.field899[var274] & 0x1) == 0) {
                        if (var263 > 0) {
                            var263--;
                            class46.field899[var274] = (byte) (class46.field899[var274] | 0x2);
                        } else {
                            int var275 = var261.method3013(1);
                            if (var275 == 0) {
                                var263 = class46.method3088(var261);
                                class46.field899[var274] = (byte) (class46.field899[var274] | 0x2);
                            } else if (class46.method797(var261, var274)) {
                                class46.field899[var274] = (byte) (class46.field899[var274] | 0x2);
                            }
                        }
                    }
                }
                var261.method3014();
                if (var263 != 0) {
                    throw new RuntimeException();
                }
                class46.field898 = 0;
                class46.field904 = 0;
                for (int var276 = 1; var276 < 2048; var276++) {
                    class46.field899[var276] = (byte) (class46.field899[var276] >> 1);
                    class24 var277 = field409[var276];
                    if (var277 == null) {
                        class46.field905[++class46.field904 - 1] = var276;
                    } else {
                        class46.field903[++class46.field898 - 1] = var276;
                    }
                }
                for (int var278 = 0; var278 < class46.field909; var278++) {
                    int var279 = class46.field910[var278];
                    class24 var280 = field409[var279];
                    int var281 = var261.method2823();
                    if ((var281 & 0x40) != 0) {
                        var281 += var261.method2823() << 8;
                    }
                    byte var282 = -1;
                    if ((var281 & 0x20) != 0) {
                        int var283 = var261.method2823();
                        byte[] var284 = new byte[var283];
                        class161 var285 = new class161(var284);
                        var261.method2833(var284, 0, var283);
                        class46.field901[var279] = var285;
                        var280.method231(var285);
                    }
                    if ((var281 & 0x80) != 0) {
                        int var286 = var261.method2887();
                        if (var286 == 65535) {
                            var286 = -1;
                        }
                        int var287 = var261.method2823();
                        method739(var280, var286, var287);
                    }
                    if ((var281 & 0x8) != 0) {
                        var280.field642 = var261.method2887();
                        if (var280.field642 == 65535) {
                            var280.field642 = -1;
                        }
                    }
                    if ((var281 & 0x1) != 0) {
                        var280.field603 = var261.method2847();
                        if (var280.field603.charAt(0) == '~') {
                            var280.field603 = var280.field603.substring(1);
                            class48.method121(2, var280.field257, var280.field603);
                        } else if (Statics.field810 == var280) {
                            class48.method121(2, var280.field257, var280.field603);
                        }
                        var280.field610 = false;
                        var280.field613 = 0;
                        var280.field614 = 0;
                        var280.field608 = 150;
                    }
                    if ((var281 & 0x4) != 0) {
                        int var288 = var261.method2823();
                        if (var288 > 0) {
                            for (int var289 = 0; var289 < var288; var289++) {
                                int var290 = -1;
                                int var291 = -1;
                                int var292 = -1;
                                int var293 = var261.method2793();
                                if (var293 == 32767) {
                                    var293 = var261.method2793();
                                    var291 = var261.method2793();
                                    var290 = var261.method2793();
                                    var292 = var261.method2793();
                                } else if (var293 == 32766) {
                                    var293 = -1;
                                } else {
                                    var291 = var261.method2793();
                                }
                                int var294 = var261.method2793();
                                var280.method621(var293, var291, var290, var292, field295, var294);
                            }
                        }
                        int var295 = var261.method2823();
                        if (var295 > 0) {
                            for (int var296 = 0; var296 < var295; var296++) {
                                int var297 = var261.method2793();
                                int var298 = var261.method2793();
                                if (var298 == 32767) {
                                    var280.method620(var297);
                                } else {
                                    int var299 = var261.method2793();
                                    int var300 = var261.method2823();
                                    int var301 = var298 > 0 ? var261.method2823() : var300;
                                    var280.method619(var297, field295, var298, var299, var300, var301);
                                }
                            }
                        }
                    }
                    if ((var281 & 0x10) != 0) {
                        var280.field624 = var261.method2887();
                        if (var280.field650 == 0) {
                            var280.field647 = var280.field624;
                            var280.field624 = -1;
                        }
                    }
                    if ((var281 & 0x2) != 0) {
                        int var302 = var261.method2887();
                        class178 var303 = (class178) Statics.method1856(class178.method1118(), var261.method2823());
                        boolean var304 = var261.method2823() == 1;
                        int var305 = var261.method2823();
                        int var306 = var261.field2285;
                        if (var280.field257 != null && var280.field245 != null) {
                            boolean var307 = false;
                            if (var303.field2674 && method3228(var280.field257)) {
                                var307 = true;
                            }
                            if (!var307 && field367 == 0 && !var280.field264) {
                                class46.field900.field2285 = 0;
                                var261.method2833(class46.field900.field2291, 0, var305);
                                class46.field900.field2285 = 0;
                                String var308 = class210.method3726(class208.method2613(class211.method2763(class46.field900)));
                                var280.field603 = var308.trim();
                                var280.field613 = var302 >> 8;
                                var280.field614 = var302 & 0xFF;
                                var280.field608 = 150;
                                var280.field610 = var304;
                                var280.field611 = Statics.field810 != var280 && var303.field2674 && field506 != "" && var308.toLowerCase().indexOf(field506) == -1;
                                int var309;
                                if (var303.field2675) {
                                    var309 = var304 ? 91 : 1;
                                } else {
                                    var309 = var304 ? 90 : 2;
                                }
                                if (var303.field2678 == -1) {
                                    class48.method121(var309, var280.field257, var308);
                                } else {
                                    class48.method121(var309, class38.method117(var303.field2678) + var280.field257, var308);
                                }
                            }
                        }
                        var261.field2285 = var305 + var306;
                    }
                    if ((var281 & 0x1000) != 0) {
                        var280.field633 = var261.method2887();
                        int var310 = var261.method2785();
                        var280.field637 = var310 >> 16;
                        var280.field609 = (var310 & 0xFFFF) + field295;
                        var280.field634 = 0;
                        var280.field617 = 0;
                        if (var280.field609 > field295) {
                            var280.field634 = -1;
                        }
                        if (var280.field633 == 65535) {
                            var280.field633 = -1;
                        }
                    }
                    if ((var281 & 0x800) != 0) {
                        var280.field638 = var261.method2837();
                        var280.field640 = var261.method2837();
                        var280.field639 = var261.method2837();
                        var280.field641 = var261.method2837();
                        var280.field649 = var261.method2887() + field295;
                        var280.field643 = var261.method2887() + field295;
                        var280.field644 = var261.method2887();
                        if (var280.field265) {
                            var280.field638 += var280.field248;
                            var280.field640 += var280.field269;
                            var280.field639 += var280.field248;
                            var280.field641 += var280.field269;
                            var280.field650 = 0;
                        } else {
                            var280.field638 += var280.field629[0];
                            var280.field640 += var280.field652[0];
                            var280.field639 += var280.field629[0];
                            var280.field641 += var280.field652[0];
                            var280.field650 = 1;
                        }
                        var280.field655 = 0;
                    }
                    if ((var281 & 0x400) != 0) {
                        class46.field902[var279] = var261.method2837();
                    }
                    if ((var281 & 0x100) != 0) {
                        var282 = var261.method2837();
                    }
                    if ((var281 & 0x200) != 0) {
                        for (int var311 = 0; var311 < 3; var311++) {
                            var280.field251[var311] = var261.method2847();
                        }
                    }
                    if (var280.field265) {
                        if (var282 == 127) {
                            var280.method235(var280.field248, var280.field269);
                        } else {
                            byte var312;
                            if (var282 == -1) {
                                var312 = class46.field902[var279];
                            } else {
                                var312 = var282;
                            }
                            var280.method234(var280.field248, var280.field269, var312);
                        }
                    }
                }
                if (var261.field2285 - var262 != var260) {
                    throw new RuntimeException(var261.field2285 - var262 + " " + var260);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 49) {
                while (field371.field2285 < field565) {
                    boolean var313 = field371.method2823() == 1;
                    String var314 = field371.method2847();
                    String var315 = field371.method2847();
                    int var316 = field371.method2887();
                    int var317 = field371.method2823();
                    int var318 = field371.method2823();
                    boolean var319 = (var318 & 0x2) != 0;
                    boolean var320 = (var318 & 0x1) != 0;
                    if (var316 > 0) {
                        field371.method2847();
                        field371.method2823();
                        field371.method2785();
                    }
                    field371.method2847();
                    for (int var321 = 0; var321 < field517; var321++) {
                        class15 var322 = field421[var321];
                        if (var313) {
                            if (var315.equals(var322.field150)) {
                                var322.field150 = var314;
                                var322.field145 = var315;
                                var314 = null;
                                break;
                            }
                        } else if (var314.equals(var322.field150)) {
                            if (var322.field146 != var316) {
                                boolean var323 = true;
                                for (class17 var324 = (class17) field556.method2313(); var324 != null; var324 = (class17) field556.method2312()) {
                                    if (var324.field164.equals(var314)) {
                                        if (var316 != 0 && var324.field163 == 0) {
                                            var324.method2325();
                                            var323 = false;
                                        } else if (var316 == 0 && var324.field163 != 0) {
                                            var324.method2325();
                                            var323 = false;
                                        }
                                    }
                                }
                                if (var323) {
                                    field556.method2311(new class17(var314, var316));
                                }
                                var322.field146 = var316;
                            }
                            var322.field145 = var315;
                            var322.field147 = var317;
                            var322.field152 = var319;
                            var322.field149 = var320;
                            var314 = null;
                            break;
                        }
                    }
                    if (var314 != null && field517 < 400) {
                        class15 var325 = new class15();
                        field421[field517] = var325;
                        var325.field150 = var314;
                        var325.field145 = var315;
                        var325.field146 = var316;
                        var325.field147 = var317;
                        var325.field152 = var319;
                        var325.field149 = var320;
                        field517++;
                    }
                }
                field554 = 2;
                field389 = field471;
                boolean var326 = false;
                int var327 = field517;
                while (var327 > 0) {
                    boolean var328 = true;
                    var327--;
                    for (int var329 = 0; var329 < var327; var329++) {
                        boolean var330 = false;
                        class15 var331 = field421[var329];
                        class15 var332 = field421[var329 + 1];
                        if (field284 != var331.field146 && field284 == var332.field146) {
                            var330 = true;
                        }
                        if (!var330 && var331.field146 == 0 && var332.field146 != 0) {
                            var330 = true;
                        }
                        if (!var330 && !var331.field152 && var332.field152) {
                            var330 = true;
                        }
                        if (!var330 && !var331.field149 && var332.field149) {
                            var330 = true;
                        }
                        if (var330) {
                            class15 var333 = field421[var329];
                            field421[var329] = field421[var329 + 1];
                            field421[var329 + 1] = var333;
                            var328 = false;
                        }
                    }
                    if (var328) {
                        break;
                    }
                }
                field335 = -1;
                return true;
            }
            if (field335 == 180) {
                int var334 = field371.method2819();
                int var335 = field371.method2783();
                int var336 = field371.method2785();
                class151 var337 = class151.method80(var336);
                if (var337.field2079 != var334 || var337.field2088 != var335 || var337.field2075 != 0 || var337.field2076 != 0) {
                    var337.field2079 = var334;
                    var337.field2088 = var335;
                    var337.field2075 = 0;
                    var337.field2076 = 0;
                    method1487(var337);
                    method33(var337);
                    if (var337.field2163 == 0) {
                        method3089(Statics.field2173[var336 >> 16], var337, false);
                    }
                }
                field335 = -1;
                return true;
            }
            if (field335 == 69) {
                field302 = field371.method2816() * 30;
                field380 = field471;
                field335 = -1;
                return true;
            }
            if (field335 == 237) {
                class30 var338 = new class30();
                var338.field680 = field371.method2847();
                var338.field677 = field371.method2887();
                int var339 = field371.method2785();
                var338.field678 = var339;
                method3231(45);
                Statics.field1184.method1984();
                Statics.field1184 = null;
                class42.method795(var338);
                field335 = -1;
                return false;
            }
            if (field335 == 144) {
                int var340 = field371.method2815();
                if (var340 == 65535) {
                    var340 = -1;
                }
                int var341 = field371.method2815();
                if (var341 == 65535) {
                    var341 = -1;
                }
                int var342 = field371.method2785();
                int var343 = field371.method2826();
                for (int var344 = var340; var344 <= var341; var344++) {
                    long var345 = ((long) var343 << 32) + (long) var344;
                    class128 var347 = field503.method2229(var345);
                    if (var347 != null) {
                        var347.method2273();
                    }
                    field503.method2230(new class134(var342), var345);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 149) {
                int var348 = field565 + field371.field2285;
                int var349 = field371.method2887();
                int var350 = field371.method2887();
                if (field391 != var349) {
                    field391 = var349;
                    method1861(field391, Statics.field170, Statics.field1104, false);
                    method604(field391);
                    class33.method104(field391);
                    for (int var351 = 0; var351 < 100; var351++) {
                        field491[var351] = true;
                    }
                }
                while (var350-- > 0) {
                    int var352 = field371.method2785();
                    int var353 = field371.method2887();
                    int var354 = field371.method2823();
                    class18 var355 = (class18) field447.method2229((long) var352);
                    if (var355 != null && var355.field180 != var353) {
                        method69(var355, true);
                        var355 = null;
                    }
                    if (var355 == null) {
                        class18 var356 = new class18();
                        var356.field180 = var353;
                        var356.field175 = var354;
                        field447.method2230(var356, (long) var352);
                        method604(var353);
                        class151 var357 = class151.method80(var352);
                        method1487(var357);
                        if (field450 != null) {
                            method1487(field450);
                            field450 = null;
                        }
                        method2985();
                        method3089(Statics.field2173[var352 >> 16], var357, false);
                        class33.method104(var353);
                        if (field391 != -1) {
                            method182(field391, 1);
                        }
                        var355 = var356;
                    }
                    var355.field174 = true;
                }
                for (class18 var359 = (class18) field447.method2238(); var359 != null; var359 = (class18) field447.method2233()) {
                    if (var359.field174) {
                        var359.field174 = false;
                    } else {
                        method69(var359, true);
                    }
                }
                field503 = new class126(512);
                while (field371.field2285 < var348) {
                    int var360 = field371.method2785();
                    int var361 = field371.method2887();
                    int var362 = field371.method2887();
                    int var363 = field371.method2785();
                    for (int var364 = var361; var364 <= var362; var364++) {
                        long var365 = ((long) var360 << 32) + (long) var364;
                        field503.method2230(new class134(var363), var365);
                    }
                }
                field335 = -1;
                return true;
            }
            if (field335 == 40) {
                int var367 = field371.method2826();
                int var368 = field371.method2785();
                class18 var369 = (class18) field447.method2229((long) var368);
                class18 var370 = (class18) field447.method2229((long) var367);
                if (var370 != null) {
                    method69(var370, var369 == null || var369.field180 != var370.field180);
                }
                if (var369 != null) {
                    var369.method2273();
                    field447.method2230(var369, (long) var367);
                }
                class151 var371 = class151.method80(var368);
                if (var371 != null) {
                    method1487(var371);
                }
                class151 var372 = class151.method80(var367);
                if (var372 != null) {
                    method1487(var372);
                    method3089(Statics.field2173[var372.field2070 >>> 16], var372, true);
                }
                if (field391 != -1) {
                    method182(field391, 1);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 238) {
                Statics.field33 = field371.method2823();
                Statics.field66 = field371.method2823();
                for (int var373 = Statics.field66; var373 < Statics.field66 + 8; var373++) {
                    for (int var374 = Statics.field33; var374 < Statics.field33 + 8; var374++) {
                        if (field419[Statics.field2326][var373][var374] != null) {
                            field419[Statics.field2326][var373][var374] = null;
                            method879(var373, var374);
                        }
                    }
                }
                for (class26 var375 = (class26) field420.method2290(); var375 != null; var375 = (class26) field420.method2285()) {
                    if (var375.field579 >= Statics.field66 && var375.field579 < Statics.field66 + 8 && var375.field575 >= Statics.field33 && var375.field575 < Statics.field33 + 8 && Statics.field2326 == var375.field574) {
                        var375.field583 = 0;
                    }
                }
                field335 = -1;
                return true;
            }
            if (field335 == 101) {
                int var376 = field371.method2827();
                int var377 = field371.method2943();
                class151 var378 = class151.method80(var376);
                if (var378.field2143 != 1 || var378.field2114 != var377) {
                    var378.field2143 = 1;
                    var378.field2114 = var377;
                    method1487(var378);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 22) {
                field303 = field371.method2823();
                if (field303 == 1) {
                    field304 = field371.method2887();
                }
                if (field303 >= 2 && field303 <= 6) {
                    if (field303 == 2) {
                        field309 = 64;
                        field310 = 64;
                    }
                    if (field303 == 3) {
                        field309 = 0;
                        field310 = 64;
                    }
                    if (field303 == 4) {
                        field309 = 128;
                        field310 = 64;
                    }
                    if (field303 == 5) {
                        field309 = 64;
                        field310 = 0;
                    }
                    if (field303 == 6) {
                        field309 = 64;
                        field310 = 128;
                    }
                    field303 = 2;
                    field306 = field371.method2887();
                    field307 = field371.method2887();
                    field454 = field371.method2823();
                }
                if (field303 == 10) {
                    field305 = field371.method2887();
                }
                field335 = -1;
                return true;
            }
            if (field335 == 182) {
                method118(false);
                field371.method3011();
                int var379 = field371.method2887();
                class167 var380 = field371;
                int var381 = var380.field2285;
                class46.field909 = 0;
                int var382 = 0;
                var380.method3008();
                for (int var383 = 0; var383 < class46.field898; var383++) {
                    int var384 = class46.field903[var383];
                    if ((class46.field899[var384] & 0x1) == 0) {
                        if (var382 > 0) {
                            var382--;
                            class46.field899[var384] = (byte) (class46.field899[var384] | 0x2);
                        } else {
                            int var385 = var380.method3013(1);
                            if (var385 == 0) {
                                var382 = class46.method3088(var380);
                                class46.field899[var384] = (byte) (class46.field899[var384] | 0x2);
                            } else {
                                class46.method15(var380, var384);
                            }
                        }
                    }
                }
                var380.method3014();
                if (var382 != 0) {
                    throw new RuntimeException();
                }
                var380.method3008();
                for (int var386 = 0; var386 < class46.field898; var386++) {
                    int var387 = class46.field903[var386];
                    if ((class46.field899[var387] & 0x1) != 0) {
                        if (var382 > 0) {
                            var382--;
                            class46.field899[var387] = (byte) (class46.field899[var387] | 0x2);
                        } else {
                            int var388 = var380.method3013(1);
                            if (var388 == 0) {
                                var382 = class46.method3088(var380);
                                class46.field899[var387] = (byte) (class46.field899[var387] | 0x2);
                            } else {
                                class46.method15(var380, var387);
                            }
                        }
                    }
                }
                var380.method3014();
                if (var382 != 0) {
                    throw new RuntimeException();
                }
                var380.method3008();
                for (int var389 = 0; var389 < class46.field904; var389++) {
                    int var390 = class46.field905[var389];
                    if ((class46.field899[var390] & 0x1) != 0) {
                        if (var382 > 0) {
                            var382--;
                            class46.field899[var390] = (byte) (class46.field899[var390] | 0x2);
                        } else {
                            int var391 = var380.method3013(1);
                            if (var391 == 0) {
                                var382 = class46.method3088(var380);
                                class46.field899[var390] = (byte) (class46.field899[var390] | 0x2);
                            } else if (class46.method797(var380, var390)) {
                                class46.field899[var390] = (byte) (class46.field899[var390] | 0x2);
                            }
                        }
                    }
                }
                var380.method3014();
                if (var382 != 0) {
                    throw new RuntimeException();
                }
                var380.method3008();
                for (int var392 = 0; var392 < class46.field904; var392++) {
                    int var393 = class46.field905[var392];
                    if ((class46.field899[var393] & 0x1) == 0) {
                        if (var382 > 0) {
                            var382--;
                            class46.field899[var393] = (byte) (class46.field899[var393] | 0x2);
                        } else {
                            int var394 = var380.method3013(1);
                            if (var394 == 0) {
                                var382 = class46.method3088(var380);
                                class46.field899[var393] = (byte) (class46.field899[var393] | 0x2);
                            } else if (class46.method797(var380, var393)) {
                                class46.field899[var393] = (byte) (class46.field899[var393] | 0x2);
                            }
                        }
                    }
                }
                var380.method3014();
                if (var382 != 0) {
                    throw new RuntimeException();
                }
                class46.field898 = 0;
                class46.field904 = 0;
                for (int var395 = 1; var395 < 2048; var395++) {
                    class46.field899[var395] = (byte) (class46.field899[var395] >> 1);
                    class24 var396 = field409[var395];
                    if (var396 == null) {
                        class46.field905[++class46.field904 - 1] = var395;
                    } else {
                        class46.field903[++class46.field898 - 1] = var395;
                    }
                }
                for (int var397 = 0; var397 < class46.field909; var397++) {
                    int var398 = class46.field910[var397];
                    class24 var399 = field409[var398];
                    int var400 = var380.method2823();
                    if ((var400 & 0x40) != 0) {
                        var400 += var380.method2823() << 8;
                    }
                    byte var401 = -1;
                    if ((var400 & 0x20) != 0) {
                        int var402 = var380.method2823();
                        byte[] var403 = new byte[var402];
                        class161 var404 = new class161(var403);
                        var380.method2833(var403, 0, var402);
                        class46.field901[var398] = var404;
                        var399.method231(var404);
                    }
                    if ((var400 & 0x80) != 0) {
                        int var405 = var380.method2887();
                        if (var405 == 65535) {
                            var405 = -1;
                        }
                        int var406 = var380.method2823();
                        method739(var399, var405, var406);
                    }
                    if ((var400 & 0x8) != 0) {
                        var399.field642 = var380.method2887();
                        if (var399.field642 == 65535) {
                            var399.field642 = -1;
                        }
                    }
                    if ((var400 & 0x1) != 0) {
                        var399.field603 = var380.method2847();
                        if (var399.field603.charAt(0) == '~') {
                            var399.field603 = var399.field603.substring(1);
                            class48.method121(2, var399.field257, var399.field603);
                        } else if (Statics.field810 == var399) {
                            class48.method121(2, var399.field257, var399.field603);
                        }
                        var399.field610 = false;
                        var399.field613 = 0;
                        var399.field614 = 0;
                        var399.field608 = 150;
                    }
                    if ((var400 & 0x4) != 0) {
                        int var407 = var380.method2823();
                        if (var407 > 0) {
                            for (int var408 = 0; var408 < var407; var408++) {
                                int var409 = -1;
                                int var410 = -1;
                                int var411 = -1;
                                int var412 = var380.method2793();
                                if (var412 == 32767) {
                                    var412 = var380.method2793();
                                    var410 = var380.method2793();
                                    var409 = var380.method2793();
                                    var411 = var380.method2793();
                                } else if (var412 == 32766) {
                                    var412 = -1;
                                } else {
                                    var410 = var380.method2793();
                                }
                                int var413 = var380.method2793();
                                var399.method621(var412, var410, var409, var411, field295, var413);
                            }
                        }
                        int var414 = var380.method2823();
                        if (var414 > 0) {
                            for (int var415 = 0; var415 < var414; var415++) {
                                int var416 = var380.method2793();
                                int var417 = var380.method2793();
                                if (var417 == 32767) {
                                    var399.method620(var416);
                                } else {
                                    int var418 = var380.method2793();
                                    int var419 = var380.method2823();
                                    int var420 = var417 > 0 ? var380.method2823() : var419;
                                    var399.method619(var416, field295, var417, var418, var419, var420);
                                }
                            }
                        }
                    }
                    if ((var400 & 0x10) != 0) {
                        var399.field624 = var380.method2887();
                        if (var399.field650 == 0) {
                            var399.field647 = var399.field624;
                            var399.field624 = -1;
                        }
                    }
                    if ((var400 & 0x2) != 0) {
                        int var421 = var380.method2887();
                        class178 var422 = (class178) Statics.method1856(class178.method1118(), var380.method2823());
                        boolean var423 = var380.method2823() == 1;
                        int var424 = var380.method2823();
                        int var425 = var380.field2285;
                        if (var399.field257 != null && var399.field245 != null) {
                            boolean var426 = false;
                            if (var422.field2674 && method3228(var399.field257)) {
                                var426 = true;
                            }
                            if (!var426 && field367 == 0 && !var399.field264) {
                                class46.field900.field2285 = 0;
                                var380.method2833(class46.field900.field2291, 0, var424);
                                class46.field900.field2285 = 0;
                                String var427 = class210.method3726(class208.method2613(class211.method2763(class46.field900)));
                                var399.field603 = var427.trim();
                                var399.field613 = var421 >> 8;
                                var399.field614 = var421 & 0xFF;
                                var399.field608 = 150;
                                var399.field610 = var423;
                                var399.field611 = Statics.field810 != var399 && var422.field2674 && field506 != "" && var427.toLowerCase().indexOf(field506) == -1;
                                int var428;
                                if (var422.field2675) {
                                    var428 = var423 ? 91 : 1;
                                } else {
                                    var428 = var423 ? 90 : 2;
                                }
                                if (var422.field2678 == -1) {
                                    class48.method121(var428, var399.field257, var427);
                                } else {
                                    class48.method121(var428, class38.method117(var422.field2678) + var399.field257, var427);
                                }
                            }
                        }
                        var380.field2285 = var424 + var425;
                    }
                    if ((var400 & 0x1000) != 0) {
                        var399.field633 = var380.method2887();
                        int var429 = var380.method2785();
                        var399.field637 = var429 >> 16;
                        var399.field609 = (var429 & 0xFFFF) + field295;
                        var399.field634 = 0;
                        var399.field617 = 0;
                        if (var399.field609 > field295) {
                            var399.field634 = -1;
                        }
                        if (var399.field633 == 65535) {
                            var399.field633 = -1;
                        }
                    }
                    if ((var400 & 0x800) != 0) {
                        var399.field638 = var380.method2837();
                        var399.field640 = var380.method2837();
                        var399.field639 = var380.method2837();
                        var399.field641 = var380.method2837();
                        var399.field649 = var380.method2887() + field295;
                        var399.field643 = var380.method2887() + field295;
                        var399.field644 = var380.method2887();
                        if (var399.field265) {
                            var399.field638 += var399.field248;
                            var399.field640 += var399.field269;
                            var399.field639 += var399.field248;
                            var399.field641 += var399.field269;
                            var399.field650 = 0;
                        } else {
                            var399.field638 += var399.field629[0];
                            var399.field640 += var399.field652[0];
                            var399.field639 += var399.field629[0];
                            var399.field641 += var399.field652[0];
                            var399.field650 = 1;
                        }
                        var399.field655 = 0;
                    }
                    if ((var400 & 0x400) != 0) {
                        class46.field902[var398] = var380.method2837();
                    }
                    if ((var400 & 0x100) != 0) {
                        var401 = var380.method2837();
                    }
                    if ((var400 & 0x200) != 0) {
                        for (int var430 = 0; var430 < 3; var430++) {
                            var399.field251[var430] = var380.method2847();
                        }
                    }
                    if (var399.field265) {
                        if (var401 == 127) {
                            var399.method235(var399.field248, var399.field269);
                        } else {
                            byte var431;
                            if (var401 == -1) {
                                var431 = class46.field902[var398];
                            } else {
                                var431 = var401;
                            }
                            var399.method234(var399.field248, var399.field269, var431);
                        }
                    }
                }
                if (var380.field2285 - var381 != var379) {
                    throw new RuntimeException(var380.field2285 - var381 + " " + var379);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 145) {
                int var432 = field371.method2816();
                class13 var433 = (class13) class13.field123.method2229((long) var432);
                if (var433 != null) {
                    var433.method2273();
                }
                field474[++field469 - 1 & 0x1F] = var432 & 0x7FFF;
                field335 = -1;
                return true;
            }
            if (field335 == 234) {
                int var434 = field371.method2857();
                class151 var435 = class151.method80(var434);
                var435.field2143 = 3;
                var435.field2114 = Statics.field810.field245.method2591();
                method1487(var435);
                field335 = -1;
                return true;
            }
            if (field335 == 187) {
                int var436 = field371.method2857();
                int var437 = field371.method2815();
                class147.field2030[var437] = var436;
                if (class147.field2032[var437] != var436) {
                    class147.field2032[var437] = var436;
                }
                method784(var437);
                field401[++field473 - 1 & 0x1F] = var437;
                field335 = -1;
                return true;
            }
            if (field335 == 172) {
                int var438 = field371.method2826();
                String var439 = field371.method2847();
                class151 var440 = class151.method80(var438);
                if (!var439.equals(var440.field2186)) {
                    var440.field2186 = var439;
                    method1487(var440);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 240) {
                method205(false);
                field335 = -1;
                return true;
            }
            if (field335 == 21) {
                int var441 = field371.method2857();
                int var442 = field371.method2816();
                if (var442 == 65535) {
                    var442 = -1;
                }
                int var443 = field371.method2827();
                class151 var444 = class151.method80(var441);
                if (var444.field2069) {
                    var444.field2105 = var442;
                    var444.field2196 = var443;
                    class199 var446 = class199.method207(var442);
                    var444.field2189 = var446.field2956;
                    var444.field2122 = var446.field2983;
                    var444.field2123 = var446.field2978;
                    var444.field2132 = var446.field2941;
                    var444.field2120 = var446.field2960;
                    var444.field2135 = var446.field2953;
                    if (var446.field2961 == 1) {
                        var444.field2128 = 1;
                    } else {
                        var444.field2128 = 2;
                    }
                    if (var444.field2125 > 0) {
                        var444.field2135 = var444.field2135 * 32 / var444.field2125;
                    } else if (var444.field2145 > 0) {
                        var444.field2135 = var444.field2135 * 32 / var444.field2145;
                    }
                    method1487(var444);
                } else if (var442 == -1) {
                    var444.field2143 = 0;
                    field335 = -1;
                    return true;
                } else {
                    class199 var445 = class199.method207(var442);
                    var444.field2143 = 4;
                    var444.field2114 = var442;
                    var444.field2189 = var445.field2956;
                    var444.field2122 = var445.field2983;
                    var444.field2135 = var445.field2953 * 100 / var443;
                    method1487(var444);
                }
                field335 = -1;
                return true;
            }
            class102.method755("" + field335 + class38.field775 + field339 + class38.field775 + field340 + class38.field775 + field565, (Throwable) null);
            method2056();
        } catch (IOException var454) {
            if (field406 > 0) {
                method2056();
            } else {
                method3231(40);
                Statics.field177 = Statics.field1184;
                Statics.field1184 = null;
            }
        } catch (Exception var455) {
            String var449 = "" + field335 + class38.field775 + field339 + class38.field775 + field340 + class38.field775 + field565 + class38.field775 + (Statics.field171 + Statics.field810.field629[0]) + class38.field775 + (Statics.field464 + Statics.field810.field652[0]) + class38.field775;
            for (int var450 = 0; var450 < field565 && var450 < 50; var450++) {
                var449 = var449 + field371.field2291[var450] + class38.field775;
            }
            class102.method755(var449, var455);
            method2056();
        }
        return true;
    }

    @ObfuscatedName("e.bh(I)V")
    public static final void method184() {
        if (field335 == 16) {
            int var0 = field371.method2823();
            int var1 = (var0 >> 4 & 0x7) + Statics.field66;
            int var2 = (var0 & 0x7) + Statics.field33;
            int var3 = field371.method2887();
            int var4 = field371.method2887();
            int var5 = field371.method2887();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class129 var6 = field419[Statics.field2326][var1][var2];
                if (var6 != null) {
                    for (class44 var7 = (class44) var6.method2290(); var7 != null; var7 = (class44) var6.method2285()) {
                        if ((var3 & 0x7FFF) == var7.field890 && var7.field884 == var4) {
                            var7.field884 = var5;
                            break;
                        }
                    }
                    method879(var1, var2);
                }
            }
        } else if (field335 == 169) {
            int var8 = field371.method2808();
            int var9 = (var8 >> 4 & 0x7) + Statics.field66;
            int var10 = (var8 & 0x7) + Statics.field33;
            int var11 = field371.method2808();
            int var12 = var11 >> 2;
            int var13 = var11 & 0x3;
            int var14 = field351[var12];
            if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
                method1838(Statics.field2326, var9, var10, var14, -1, var12, var13, 0, -1);
            }
        } else if (field335 == 175) {
            int var15 = field371.method2943();
            int var16 = field371.method2823();
            int var17 = (var16 >> 4 & 0x7) + Statics.field66;
            int var18 = (var16 & 0x7) + Statics.field33;
            if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104) {
                class129 var19 = field419[Statics.field2326][var17][var18];
                if (var19 != null) {
                    for (class44 var20 = (class44) var19.method2290(); var20 != null; var20 = (class44) var19.method2285()) {
                        if ((var15 & 0x7FFF) == var20.field890) {
                            var20.method2273();
                            break;
                        }
                    }
                    if (var19.method2290() == null) {
                        field419[Statics.field2326][var17][var18] = null;
                    }
                    method879(var17, var18);
                }
            }
        } else if (field335 == 209) {
            int var21 = field371.method2823();
            int var22 = (var21 >> 4 & 0x7) + Statics.field66;
            int var23 = (var21 & 0x7) + Statics.field33;
            int var24 = var22 + field371.method2837();
            int var25 = var23 + field371.method2837();
            int var26 = field371.method2783();
            int var27 = field371.method2887();
            int var28 = field371.method2823() * 4;
            int var29 = field371.method2823() * 4;
            int var30 = field371.method2887();
            int var31 = field371.method2887();
            int var32 = field371.method2823();
            int var33 = field371.method2823();
            if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && var27 != 65535) {
                int var34 = var22 * 128 + 64;
                int var35 = var23 * 128 + 64;
                int var36 = var24 * 128 + 64;
                int var37 = var25 * 128 + 64;
                class43 var38 = new class43(var27, Statics.field2326, var34, var35, method162(var34, var35, Statics.field2326) - var28, field295 + var30, field295 + var31, var32, var33, var26, var29);
                var38.method791(var36, var37, method162(var36, var37, Statics.field2326) - var29, field295 + var30);
                field511.method2278(var38);
            }
        } else {
            if (field335 == 208) {
                int var39 = field371.method2943();
                int var40 = field371.method2823();
                int var41 = var40 >> 2;
                int var42 = var40 & 0x3;
                int var43 = field351[var41];
                byte var44 = field371.method2837();
                byte var45 = field371.method2810();
                int var46 = field371.method2815();
                byte var47 = field371.method2896();
                int var48 = field371.method2809();
                int var49 = (var48 >> 4 & 0x7) + Statics.field66;
                int var50 = (var48 & 0x7) + Statics.field33;
                byte var51 = field371.method2896();
                int var52 = field371.method2887();
                int var53 = field371.method2816();
                class24 var54;
                if (field410 == var39) {
                    var54 = Statics.field810;
                } else {
                    var54 = field409[var39];
                }
                if (var54 != null) {
                    class198 var55 = class198.method197(var53);
                    int var56;
                    int var57;
                    if (var42 == 1 || var42 == 3) {
                        var56 = var55.field2908;
                        var57 = var55.field2904;
                    } else {
                        var56 = var55.field2904;
                        var57 = var55.field2908;
                    }
                    int var58 = (var56 >> 1) + var49;
                    int var59 = (var56 + 1 >> 1) + var49;
                    int var60 = (var57 >> 1) + var50;
                    int var61 = (var57 + 1 >> 1) + var50;
                    int[][] var62 = class12.field111[Statics.field2326];
                    int var63 = var62[var58][var60] + var62[var59][var60] + var62[var58][var61] + var62[var59][var61] >> 2;
                    int var64 = (var49 << 7) + (var56 << 6);
                    int var65 = (var50 << 7) + (var57 << 6);
                    class83 var66 = var55.method3408(var41, var42, var62, var64, var63, var65);
                    if (var66 != null) {
                        method1838(Statics.field2326, var49, var50, var43, -1, 0, 0, var52 + 1, var46 + 1);
                        var54.field252 = field295 + var52;
                        var54.field253 = field295 + var46;
                        var54.field256 = var66;
                        var54.field254 = var49 * 128 + var56 * 64;
                        var54.field258 = var50 * 128 + var57 * 64;
                        var54.field255 = var63;
                        if (var47 > var45) {
                            byte var67 = var47;
                            var47 = var45;
                            var45 = var67;
                        }
                        if (var51 > var44) {
                            byte var68 = var51;
                            var51 = var44;
                            var44 = var68;
                        }
                        var54.field246 = var47 + var49;
                        var54.field267 = var45 + var49;
                        var54.field259 = var50 + var51;
                        var54.field261 = var44 + var50;
                    }
                }
            }
            if (field335 == 117) {
                int var69 = field371.method2823();
                int var70 = (var69 >> 4 & 0x7) + Statics.field66;
                int var71 = (var69 & 0x7) + Statics.field33;
                int var72 = field371.method2887();
                int var73 = field371.method2823();
                int var74 = var73 >> 4 & 0xF;
                int var75 = var73 & 0x7;
                int var76 = field371.method2823();
                if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
                    int var77 = var74 + 1;
                    if (Statics.field810.field629[0] >= var70 - var77 && Statics.field810.field629[0] <= var70 + var77 && Statics.field810.field652[0] >= var71 - var77 && Statics.field810.field652[0] <= var71 + var77 && field527 != 0 && var75 > 0 && field528 < 50) {
                        field529[field528] = var72;
                        field530[field528] = var75;
                        field432[field528] = var76;
                        field533[field528] = null;
                        field300[field528] = (var70 << 16) + (var71 << 8) + var74;
                        field528++;
                    }
                }
            }
            if (field335 == 165) {
                int var78 = field371.method2943();
                int var79 = field371.method2807();
                int var80 = (var79 >> 4 & 0x7) + Statics.field66;
                int var81 = (var79 & 0x7) + Statics.field33;
                int var82 = field371.method2816();
                if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104) {
                    class44 var83 = new class44();
                    var83.field890 = var78;
                    var83.field884 = var82;
                    if (field419[Statics.field2326][var80][var81] == null) {
                        field419[Statics.field2326][var80][var81] = new class129();
                    }
                    field419[Statics.field2326][var80][var81].method2278(var83);
                    method879(var80, var81);
                }
            } else if (field335 == 50) {
                int var84 = field371.method2809();
                int var85 = (var84 >> 4 & 0x7) + Statics.field66;
                int var86 = (var84 & 0x7) + Statics.field33;
                int var87 = field371.method2815();
                int var88 = field371.method2808();
                int var89 = var88 >> 2;
                int var90 = var88 & 0x3;
                int var91 = field351[var89];
                if (var85 >= 0 && var86 >= 0 && var85 < 103 && var86 < 103) {
                    if (var91 == 0) {
                        class91 var92 = Statics.field2244.method1672(Statics.field2326, var85, var86);
                        if (var92 != null) {
                            int var93 = var92.field1538 >> 14 & 0x7FFF;
                            if (var89 == 2) {
                                var92.field1543 = new class50(var93, 2, var90 + 4, Statics.field2326, var85, var86, var87, false, var92.field1543);
                                var92.field1550 = new class50(var93, 2, var90 + 1 & 0x3, Statics.field2326, var85, var86, var87, false, var92.field1550);
                            } else {
                                var92.field1543 = new class50(var93, var89, var90, Statics.field2326, var85, var86, var87, false, var92.field1543);
                            }
                        }
                    }
                    if (var91 == 1) {
                        class96 var94 = Statics.field2244.method1771(Statics.field2326, var85, var86);
                        if (var94 != null) {
                            int var95 = var94.field1596 >> 14 & 0x7FFF;
                            if (var89 == 4 || var89 == 5) {
                                var94.field1602 = new class50(var95, 4, var90, Statics.field2326, var85, var86, var87, false, var94.field1602);
                            } else if (var89 == 6) {
                                var94.field1602 = new class50(var95, 4, var90 + 4, Statics.field2326, var85, var86, var87, false, var94.field1602);
                            } else if (var89 == 7) {
                                var94.field1602 = new class50(var95, 4, (var90 + 2 & 0x3) + 4, Statics.field2326, var85, var86, var87, false, var94.field1602);
                            } else if (var89 == 8) {
                                var94.field1602 = new class50(var95, 4, var90 + 4, Statics.field2326, var85, var86, var87, false, var94.field1602);
                                var94.field1598 = new class50(var95, 4, (var90 + 2 & 0x3) + 4, Statics.field2326, var85, var86, var87, false, var94.field1598);
                            }
                        }
                    }
                    if (var91 == 2) {
                        class97 var96 = Statics.field2244.method1721(Statics.field2326, var85, var86);
                        if (var89 == 11) {
                            var89 = 10;
                        }
                        if (var96 != null) {
                            var96.field1610 = new class50(var96.field1609 >> 14 & 0x7FFF, var89, var90, Statics.field2326, var85, var86, var87, false, var96.field1610);
                        }
                    }
                    if (var91 == 3) {
                        class79 var97 = Statics.field2244.method1675(Statics.field2326, var85, var86);
                        if (var97 != null) {
                            var97.field1286 = new class50(var97.field1287 >> 14 & 0x7FFF, 22, var90, Statics.field2326, var85, var86, var87, false, var97.field1286);
                        }
                    }
                }
            } else if (field335 == 107) {
                int var98 = field371.method2809();
                int var99 = (var98 >> 4 & 0x7) + Statics.field66;
                int var100 = (var98 & 0x7) + Statics.field33;
                int var101 = field371.method2887();
                int var102 = field371.method2807();
                int var103 = var102 >> 2;
                int var104 = var102 & 0x3;
                int var105 = field351[var103];
                if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
                    method1838(Statics.field2326, var99, var100, var105, var101, var103, var104, 0, -1);
                }
            } else if (field335 == 243) {
                int var106 = field371.method2823();
                int var107 = (var106 >> 4 & 0x7) + Statics.field66;
                int var108 = (var106 & 0x7) + Statics.field33;
                int var109 = field371.method2887();
                int var110 = field371.method2823();
                int var111 = field371.method2887();
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    int var112 = var107 * 128 + 64;
                    int var113 = var108 * 128 + 64;
                    class34 var114 = new class34(var109, Statics.field2326, var112, var113, method162(var112, var113, Statics.field2326) - var110, var111, field295);
                    field422.method2278(var114);
                }
            }
        }
    }

    @ObfuscatedName("cl.bb(IIIIIIIIII)V")
    public static final void method1838(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class26 var9 = null;
        for (class26 var10 = (class26) field420.method2290(); var10 != null; var10 = (class26) field420.method2285()) {
            if (var10.field574 == arg0 && var10.field579 == arg1 && var10.field575 == arg2 && var10.field578 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class26();
            var9.field574 = arg0;
            var9.field578 = arg3;
            var9.field579 = arg1;
            var9.field575 = arg2;
            method22(var9);
            field420.method2278(var9);
        }
        var9.field580 = arg4;
        var9.field581 = arg5;
        var9.field584 = arg6;
        var9.field582 = arg7;
        var9.field583 = arg8;
    }

    @ObfuscatedName("i.bg(B)V")
    public static final void method206() {
        for (class26 var0 = (class26) field420.method2290(); var0 != null; var0 = (class26) field420.method2285()) {
            if (var0.field583 == -1) {
                var0.field582 = 0;
                method22(var0);
            } else {
                var0.method2273();
            }
        }
    }

    @ObfuscatedName("d.bf(Lt;I)V")
    public static final void method22(class26 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field578 == 0) {
            var1 = Statics.field2244.method1676(arg0.field574, arg0.field579, arg0.field575);
        }
        if (arg0.field578 == 1) {
            var1 = Statics.field2244.method1677(arg0.field574, arg0.field579, arg0.field575);
        }
        if (arg0.field578 == 2) {
            var1 = Statics.field2244.method1678(arg0.field574, arg0.field579, arg0.field575);
        }
        if (arg0.field578 == 3) {
            var1 = Statics.field2244.method1654(arg0.field574, arg0.field579, arg0.field575);
        }
        if (var1 != 0) {
            int var5 = Statics.field2244.method1791(arg0.field574, arg0.field579, arg0.field575, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field576 = var2;
        arg0.field585 = var3;
        arg0.field573 = var4;
    }

    @ObfuscatedName("fg.bp(IIIIIIIB)V")
    public static final void method3078(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field289 && Statics.field2326 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2244.method1676(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2244.method1677(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2244.method1678(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2244.method1654(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2244.method1791(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2244.method1667(arg0, arg2, arg3);
                class198 var15 = class198.method197(var12);
                if (var15.field2909 != 0) {
                    field552[arg0].method2148(arg2, arg3, var13, var14, var15.field2910);
                }
            }
            if (arg1 == 1) {
                Statics.field2244.method1668(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2244.method1669(arg0, arg2, arg3);
                class198 var16 = class198.method197(var12);
                if (var16.field2904 + arg2 > 103 || var16.field2904 + arg3 > 103 || var16.field2908 + arg2 > 103 || var16.field2908 + arg3 > 103) {
                    return;
                }
                if (var16.field2909 != 0) {
                    field552[arg0].method2139(arg2, arg3, var16.field2904, var16.field2908, var14, var16.field2910);
                }
            }
            if (arg1 == 3) {
                Statics.field2244.method1670(arg0, arg2, arg3);
                class198 var17 = class198.method197(var12);
                if (var17.field2909 == 1) {
                    field552[arg0].method2133(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class12.field104[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class88 var19 = Statics.field2244;
        class118 var20 = field552[arg0];
        class198 var21 = class198.method197(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field2908;
            var23 = var21.field2904;
        } else {
            var22 = var21.field2904;
            var23 = var21.field2908;
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
        int[][] var28 = class12.field111[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field2911 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field2932 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class90 var34;
            if (var21.field2915 == -1 && var21.field2918 == null) {
                var34 = var21.method3408(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class50(arg4, 22, arg5, var18, arg2, arg3, var21.field2915, true, (class90) null);
            }
            var19.method1716(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field2909 == 1) {
                var20.method2136(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class90 var57;
            if (var21.field2915 == -1 && var21.field2918 == null) {
                var57 = var21.method3408(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class50(arg4, 10, arg5, var18, arg2, arg3, var21.field2915, true, (class90) null);
            }
            if (var57 != null) {
                var19.method1660(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field2909 != 0) {
                var20.method2163(arg2, arg3, var22, var23, var21.field2910);
            }
        } else if (arg6 >= 12) {
            class90 var35;
            if (var21.field2915 == -1 && var21.field2918 == null) {
                var35 = var21.method3408(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class50(arg4, arg6, arg5, var18, arg2, arg3, var21.field2915, true, (class90) null);
            }
            var19.method1660(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field2909 != 0) {
                var20.method2163(arg2, arg3, var22, var23, var21.field2910);
            }
        } else if (arg6 == 0) {
            class90 var36;
            if (var21.field2915 == -1 && var21.field2918 == null) {
                var36 = var21.method3408(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class50(arg4, 0, arg5, var18, arg2, arg3, var21.field2915, true, (class90) null);
            }
            var19.method1658(arg0, arg2, arg3, var29, var36, (class90) null, class12.field109[arg5], 0, var32, var33);
            if (var21.field2909 != 0) {
                var20.method2156(arg2, arg3, arg6, arg5, var21.field2910);
            }
        } else if (arg6 == 1) {
            class90 var37;
            if (var21.field2915 == -1 && var21.field2918 == null) {
                var37 = var21.method3408(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class50(arg4, 1, arg5, var18, arg2, arg3, var21.field2915, true, (class90) null);
            }
            var19.method1658(arg0, arg2, arg3, var29, var37, (class90) null, class12.field110[arg5], 0, var32, var33);
            if (var21.field2909 != 0) {
                var20.method2156(arg2, arg3, arg6, arg5, var21.field2910);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class90 var39;
            class90 var40;
            if (var21.field2915 == -1 && var21.field2918 == null) {
                var39 = var21.method3408(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method3408(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class50(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field2915, true, (class90) null);
                var40 = new class50(arg4, 2, var38, var18, arg2, arg3, var21.field2915, true, (class90) null);
            }
            var19.method1658(arg0, arg2, arg3, var29, var39, var40, class12.field109[arg5], class12.field109[var38], var32, var33);
            if (var21.field2909 != 0) {
                var20.method2156(arg2, arg3, arg6, arg5, var21.field2910);
            }
        } else if (arg6 == 3) {
            class90 var41;
            if (var21.field2915 == -1 && var21.field2918 == null) {
                var41 = var21.method3408(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class50(arg4, 3, arg5, var18, arg2, arg3, var21.field2915, true, (class90) null);
            }
            var19.method1658(arg0, arg2, arg3, var29, var41, (class90) null, class12.field110[arg5], 0, var32, var33);
            if (var21.field2909 != 0) {
                var20.method2156(arg2, arg3, arg6, arg5, var21.field2910);
            }
        } else if (arg6 == 9) {
            class90 var42;
            if (var21.field2915 == -1 && var21.field2918 == null) {
                var42 = var21.method3408(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class50(arg4, arg6, arg5, var18, arg2, arg3, var21.field2915, true, (class90) null);
            }
            var19.method1660(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field2909 != 0) {
                var20.method2163(arg2, arg3, var22, var23, var21.field2910);
            }
        } else if (arg6 == 4) {
            class90 var43;
            if (var21.field2915 == -1 && var21.field2918 == null) {
                var43 = var21.method3408(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class50(arg4, 4, arg5, var18, arg2, arg3, var21.field2915, true, (class90) null);
            }
            var19.method1659(arg0, arg2, arg3, var29, var43, (class90) null, class12.field109[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1676(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class198.method197(var45 >> 14 & 0x7FFF).field2916;
            }
            class90 var46;
            if (var21.field2915 == -1 && var21.field2918 == null) {
                var46 = var21.method3408(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class50(arg4, 4, arg5, var18, arg2, arg3, var21.field2915, true, (class90) null);
            }
            var19.method1659(arg0, arg2, arg3, var29, var46, (class90) null, class12.field109[arg5], 0, class12.field118[arg5] * var44, class12.field117[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1676(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class198.method197(var48 >> 14 & 0x7FFF).field2916 / 2;
            }
            class90 var49;
            if (var21.field2915 == -1 && var21.field2918 == null) {
                var49 = var21.method3408(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class50(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field2915, true, (class90) null);
            }
            var19.method1659(arg0, arg2, arg3, var29, var49, (class90) null, 256, arg5, class12.field113[arg5] * var47, class12.field114[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class90 var51;
            if (var21.field2915 == -1 && var21.field2918 == null) {
                var51 = var21.method3408(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class50(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field2915, true, (class90) null);
            }
            var19.method1659(arg0, arg2, arg3, var29, var51, (class90) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1676(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class198.method197(var53 >> 14 & 0x7FFF).field2916 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class90 var55;
            class90 var56;
            if (var21.field2915 == -1 && var21.field2918 == null) {
                var55 = var21.method3408(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method3408(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class50(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field2915, true, (class90) null);
                var56 = new class50(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field2915, true, (class90) null);
            }
            var19.method1659(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class12.field113[arg5] * var52, class12.field114[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("aj.bq(III)V")
    public static final void method879(int arg0, int arg1) {
        class129 var2 = field419[Statics.field2326][arg0][arg1];
        if (var2 == null) {
            Statics.field2244.method1690(Statics.field2326, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class44 var5 = null;
        for (class44 var6 = (class44) var2.method2290(); var6 != null; var6 = (class44) var2.method2285()) {
            class199 var7 = class199.method207(var6.field890);
            long var8 = (long) var7.field2962;
            if (var7.field2961 == 1) {
                var8 = (long) (var6.field884 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field2244.method1690(Statics.field2326, arg0, arg1);
            return;
        }
        var2.method2279(var5);
        class44 var10 = null;
        class44 var11 = null;
        for (class44 var12 = (class44) var2.method2290(); var12 != null; var12 = (class44) var2.method2285()) {
            if (var5.field890 != var12.field890) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field890 != var12.field890 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field2244.method1657(Statics.field2326, arg0, arg1, method162(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2326), var5, var13, var10, var11);
    }

    @ObfuscatedName("i.bs(ZI)V")
    public static final void method205(boolean arg0) {
        field412 = 0;
        field338 = 0;
        field371.method3008();
        int var1 = field371.method3013(8);
        if (var1 < field327) {
            for (int var2 = var1; var2 < field327; var2++) {
                field413[++field412 - 1] = field560[var2];
            }
        }
        if (var1 > field327) {
            throw new RuntimeException("");
        }
        field327 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field560[var3];
            class36 var5 = field461[var4];
            int var6 = field371.method3013(1);
            if (var6 == 0) {
                field560[++field327 - 1] = var4;
                var5.field645 = field295;
            } else {
                int var7 = field371.method3013(2);
                if (var7 == 0) {
                    field560[++field327 - 1] = var4;
                    var5.field645 = field295;
                    field330[++field338 - 1] = var4;
                } else if (var7 == 1) {
                    field560[++field327 - 1] = var4;
                    var5.field645 = field295;
                    int var8 = field371.method3013(3);
                    var5.method725(var8, (byte) 1);
                    int var9 = field371.method3013(1);
                    if (var9 == 1) {
                        field330[++field338 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field560[++field327 - 1] = var4;
                    var5.field645 = field295;
                    int var10 = field371.method3013(3);
                    var5.method725(var10, (byte) 2);
                    int var11 = field371.method3013(3);
                    var5.method725(var11, (byte) 2);
                    int var12 = field371.method3013(1);
                    if (var12 == 1) {
                        field330[++field338 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field413[++field412 - 1] = var4;
                }
            }
        }
        method3323(arg0);
        method262();
        for (int var13 = 0; var13 < field412; var13++) {
            int var14 = field413[var13];
            if (field295 != field461[var14].field645) {
                field461[var14].field757 = null;
                field461[var14] = null;
            }
        }
        if (field565 != field371.field2285) {
            throw new RuntimeException(field371.field2285 + class38.field775 + field565);
        }
        for (int var15 = 0; var15 < field327; var15++) {
            if (field461[field560[var15]] == null) {
                throw new RuntimeException(var15 + class38.field775 + field327);
            }
        }
    }

    @ObfuscatedName("gc.bx(ZS)V")
    public static final void method3323(boolean arg0) {
        while (true) {
            if (field371.method3015(field565) >= 27) {
                int var1 = field371.method3013(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field461[var1] == null) {
                        field461[var1] = new class36();
                        var2 = true;
                    }
                    class36 var3 = field461[var1];
                    field560[++field327 - 1] = var1;
                    var3.field645 = field295;
                    int var4 = field371.method3013(1);
                    int var5 = field417[field371.method3013(3)];
                    if (var2) {
                        var3.field647 = var3.field598 = var5;
                    }
                    int var6;
                    if (arg0) {
                        var6 = field371.method3013(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = field371.method3013(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    int var7;
                    if (arg0) {
                        var7 = field371.method3013(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = field371.method3013(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    int var8 = field371.method3013(1);
                    if (var8 == 1) {
                        field330[++field338 - 1] = var1;
                    }
                    var3.field757 = class200.method2713(field371.method3013(14));
                    var3.field600 = var3.field757.field3010;
                    var3.field630 = var3.field757.field3022;
                    if (var3.field630 == 0) {
                        var3.field598 = 0;
                    }
                    var3.field604 = var3.field757.field2999;
                    var3.field651 = var3.field757.field3006;
                    var3.field606 = var3.field757.field3012;
                    var3.field607 = var3.field757.field3008;
                    var3.field601 = var3.field757.field3002;
                    var3.field602 = var3.field757.field3007;
                    var3.field605 = var3.field757.field3004;
                    var3.method727(Statics.field810.field629[0] + var7, Statics.field810.field652[0] + var6, var4 == 1);
                    continue;
                }
            }
            field371.method3014();
            return;
        }
    }

    @ObfuscatedName("u.bc(I)V")
    public static final void method262() {
        for (int var0 = 0; var0 < field338; var0++) {
            int var1 = field330[var0];
            class36 var2 = field461[var1];
            int var3 = field371.method2823();
            if ((var3 & 0x2) != 0) {
                var2.field642 = field371.method2816();
                if (var2.field642 == 65535) {
                    var2.field642 = -1;
                }
            }
            if ((var3 & 0x4) != 0) {
                var2.field633 = field371.method2815();
                int var4 = field371.method2827();
                var2.field637 = var4 >> 16;
                var2.field609 = (var4 & 0xFFFF) + field295;
                var2.field634 = 0;
                var2.field617 = 0;
                if (var2.field609 > field295) {
                    var2.field634 = -1;
                }
                if (var2.field633 == 65535) {
                    var2.field633 = -1;
                }
            }
            if ((var3 & 0x8) != 0) {
                var2.field603 = field371.method2847();
                var2.field608 = 100;
            }
            if ((var3 & 0x20) != 0) {
                int var5 = field371.method2807();
                if (var5 > 0) {
                    for (int var6 = 0; var6 < var5; var6++) {
                        int var7 = -1;
                        int var8 = -1;
                        int var9 = -1;
                        int var10 = field371.method2793();
                        if (var10 == 32767) {
                            var10 = field371.method2793();
                            var8 = field371.method2793();
                            var7 = field371.method2793();
                            var9 = field371.method2793();
                        } else if (var10 == 32766) {
                            var10 = -1;
                        } else {
                            var8 = field371.method2793();
                        }
                        int var11 = field371.method2793();
                        var2.method621(var10, var8, var7, var9, field295, var11);
                    }
                }
                int var12 = field371.method2807();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = field371.method2793();
                        int var15 = field371.method2793();
                        if (var15 == 32767) {
                            var2.method620(var14);
                        } else {
                            int var16 = field371.method2793();
                            int var17 = field371.method2808();
                            int var18 = var15 > 0 ? field371.method2823() : var17;
                            var2.method619(var14, field295, var15, var16, var17, var18);
                        }
                    }
                }
            }
            if ((var3 & 0x10) != 0) {
                int var19 = field371.method2815();
                if (var19 == 65535) {
                    var19 = -1;
                }
                int var20 = field371.method2808();
                if (var2.field628 == var19 && var19 != -1) {
                    int var21 = class202.method119(var19).field3061;
                    if (var21 == 1) {
                        var2.field621 = 0;
                        var2.field596 = 0;
                        var2.field646 = var20;
                        var2.field632 = 0;
                    }
                    if (var21 == 2) {
                        var2.field632 = 0;
                    }
                } else if (var19 == -1 || var2.field628 == -1 || class202.method119(var19).field3055 >= class202.method119(var2.field628).field3055) {
                    var2.field628 = var19;
                    var2.field621 = 0;
                    var2.field596 = 0;
                    var2.field646 = var20;
                    var2.field632 = 0;
                    var2.field655 = var2.field650;
                }
            }
            if ((var3 & 0x1) != 0) {
                int var22 = field371.method2887();
                int var23 = field371.method2943();
                int var24 = var2.field648 - (var22 - Statics.field171 - Statics.field171) * 64;
                int var25 = var2.field597 - (var23 - Statics.field464 - Statics.field464) * 64;
                if (var24 != 0 || var25 != 0) {
                    var2.field624 = (int) (Math.atan2((double) var24, (double) var25) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x40) != 0) {
                var2.field757 = class200.method2713(field371.method2943());
                var2.field600 = var2.field757.field3010;
                var2.field630 = var2.field757.field3022;
                var2.field604 = var2.field757.field2999;
                var2.field651 = var2.field757.field3006;
                var2.field606 = var2.field757.field3012;
                var2.field607 = var2.field757.field3008;
                var2.field601 = var2.field757.field3002;
                var2.field602 = var2.field757.field3007;
                var2.field605 = var2.field757.field3004;
            }
        }
    }

    @ObfuscatedName("cx.bz(Lv;IIBI)V")
    public static final void method1859(class24 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field629[0];
        int var5 = arg0.field652[0];
        int var6 = arg0.method241();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = class119.method3347(var4, var5, arg0.method241(), method115(arg1, arg2), field552[arg0.field268], true, field550, field301);
        if (var7 >= 1) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg0.method236(field550[var8], field301[var8], arg3);
            }
        }
    }

    @ObfuscatedName("z.bw(III)Ldl;")
    public static class120 method115(int arg0, int arg1) {
        field567.field1857 = arg0;
        field567.field1850 = arg1;
        field567.field1852 = 1;
        field567.field1851 = 1;
        return field567;
    }

    @ObfuscatedName("b.ck(S)V")
    public static final void method215() {
        int var0 = Statics.field879;
        int var1 = Statics.field279;
        int var2 = Statics.field782;
        int var3 = Statics.field221;
        int var4 = 6116423;
        class220.method3817(var0, var1, var2, var3, var4);
        class220.method3817(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class220.method3799(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field2237.method3675(class174.field2520, var0 + 3, var1 + 14, var4, -1);
        int var5 = class116.field1812;
        int var6 = class116.field1811 * 853340747;
        for (int var7 = 0; var7 < field428; var7++) {
            int var8 = (field428 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class209 var10 = Statics.field2237;
            String var11;
            if (field358[var7].length() > 0) {
                var11 = field433[var7] + class174.field2527 + field358[var7];
            } else {
                var11 = field433[var7];
            }
            var10.method3675(var11, var0 + 3, var8, var9, 0);
        }
        method200(Statics.field879, Statics.field279, Statics.field782, Statics.field221);
    }

    @ObfuscatedName("an.cd(IIIII)V")
    public static final void method808(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field489; var4++) {
            if (field494[var4] + field369[var4] > arg0 && field494[var4] < arg0 + arg2 && field497[var4] + field495[var4] > arg1 && field495[var4] < arg1 + arg3) {
                field491[var4] = true;
            }
        }
    }

    @ObfuscatedName("s.cg(IIIII)V")
    public static final void method200(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field489; var4++) {
            if (field494[var4] + field369[var4] > arg0 && field494[var4] < arg0 + arg2 && field497[var4] + field495[var4] > arg1 && field495[var4] < arg1 + arg3) {
                field492[var4] = true;
            }
        }
    }

    @ObfuscatedName("bx.cw(III)V")
    public static final void method1395(int arg0, int arg1) {
        int var2 = Statics.field2237.method3668(class174.field2520);
        for (int var3 = 0; var3 < field428; var3++) {
            class209 var4 = Statics.field2237;
            String var5;
            if (field358[var3].length() > 0) {
                var5 = field433[var3] + class174.field2527 + field358[var3];
            } else {
                var5 = field433[var3];
            }
            int var6 = var4.method3668(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field428 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field170) {
            var8 = Statics.field170 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field1104) {
            var9 = Statics.field1104 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field427 = true;
        Statics.field879 = var8;
        Statics.field279 = var9;
        Statics.field782 = var2;
        Statics.field221 = field428 * 15 + 22;
    }

    @ObfuscatedName("ag.ca(II)Z")
    public static final boolean method723(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field431[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("gc.cc(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method3320(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 15) {
            class24 var8 = field409[arg3];
            if (var8 != null) {
                field396 = arg6;
                field397 = arg7;
                field502 = 2;
                field398 = 0;
                field520 = arg0;
                field312 = arg1;
                field331.method3010(162);
                field331.method2766(field442);
                field331.method2914(Statics.field148);
                field331.method2765(class106.field1710[82] ? 1 : 0);
                field331.method2813(arg3);
            }
        }
        if (arg2 == 39) {
            field331.method3010(183);
            field331.method2813(arg3);
            field331.method2812(arg0);
            field331.method2824(arg1);
            field400 = 0;
            Statics.field1615 = class151.method80(arg1);
            field553 = arg0;
        }
        if (arg2 == 21) {
            field396 = arg6;
            field397 = arg7;
            field502 = 2;
            field398 = 0;
            field520 = arg0;
            field312 = arg1;
            field331.method3010(101);
            field331.method2963(class106.field1710[82] ? 1 : 0);
            field331.method2812(Statics.field171 + arg0);
            field331.method2766(Statics.field464 + arg1);
            field331.method2813(arg3);
        }
        if (arg2 == 1005) {
            class151 var9 = class151.method80(arg1);
            if (var9 == null || var9.field2185[arg0] < 100000) {
                field331.method3010(156);
                field331.method2766(arg3);
            } else {
                class48.method121(27, "", var9.field2185[arg0] + " x " + class199.method207(arg3).field2945);
            }
            field400 = 0;
            Statics.field1615 = class151.method80(arg1);
            field553 = arg0;
        }
        if (arg2 == 28) {
            field331.method3010(224);
            field331.method2768(arg1);
            class151 var10 = class151.method80(arg1);
            if (var10.field2170 != null && var10.field2170[0][0] == 5) {
                int var11 = var10.field2170[0][1];
                class147.field2032[var11] = 1 - class147.field2032[var11];
                method784(var11);
            }
        }
        if (arg2 == 4) {
            field396 = arg6;
            field397 = arg7;
            field502 = 2;
            field398 = 0;
            field520 = arg0;
            field312 = arg1;
            field331.method3010(58);
            field331.method2766(arg3 >> 14 & 0x7FFF);
            field331.method2766(Statics.field171 + arg0);
            field331.method2813(Statics.field464 + arg1);
            field331.method2776(class106.field1710[82] ? 1 : 0);
        }
        if (arg2 == 22) {
            field396 = arg6;
            field397 = arg7;
            field502 = 2;
            field398 = 0;
            field520 = arg0;
            field312 = arg1;
            field331.method3010(241);
            field331.method2963(class106.field1710[82] ? 1 : 0);
            field331.method2812(Statics.field171 + arg0);
            field331.method2973(Statics.field464 + arg1);
            field331.method2973(arg3);
        }
        if (arg2 == 25) {
            class151 var12 = class151.method70(arg1, arg0);
            if (var12 != null) {
                method1032();
                int var13 = class152.method1099(method3219(var12));
                int var14 = var12.field2105;
                class151 var15 = class151.method70(arg1, arg0);
                if (var15 != null && var15.field2161 != null) {
                    class19 var16 = new class19();
                    var16.field193 = var15;
                    var16.field197 = var15.field2161;
                    class33.method3007(var16, 200000);
                }
                field443 = var14;
                field441 = true;
                Statics.field148 = arg1;
                field442 = arg0;
                Statics.field1921 = var13;
                method1487(var15);
                field439 = 0;
                String var17;
                if (class152.method1099(method3219(var12)) == 0) {
                    var17 = null;
                } else if (var12.field2149 == null || var12.field2149.trim().length() == 0) {
                    var17 = null;
                } else {
                    var17 = var12.field2149;
                }
                field298 = var17;
                if (field298 == null) {
                    field298 = "Null";
                }
                if (var12.field2069) {
                    field445 = var12.field2151 + class38.method183(16777215);
                } else {
                    field445 = class38.method183(65280) + var12.field2134 + class38.method183(16777215);
                }
            }
            return;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class151 var18 = class151.method70(arg1, arg0);
            if (var18 != null) {
                int var19 = var18.field2105;
                class151 var20 = class151.method70(arg1, arg0);
                if (var20 != null) {
                    if (var20.field2179 != null) {
                        class19 var21 = new class19();
                        var21.field193 = var20;
                        var21.field187 = arg3;
                        var21.field200 = arg5;
                        var21.field197 = var20.field2179;
                        class33.method3007(var21, 200000);
                    }
                    boolean var22 = true;
                    if (var20.field2074 > 0) {
                        var22 = method2711(var20);
                    }
                    if (var22) {
                        int var23 = method3219(var20);
                        int var24 = arg3 - 1;
                        boolean var25 = (var23 >> var24 + 1 & 0x1) != 0;
                        if (var25) {
                            if (arg3 == 1) {
                                field331.method3010(169);
                                field331.method2768(arg1);
                                field331.method2766(arg0);
                                field331.method2766(var19);
                            }
                            if (arg3 == 2) {
                                field331.method3010(151);
                                field331.method2768(arg1);
                                field331.method2766(arg0);
                                field331.method2766(var19);
                            }
                            if (arg3 == 3) {
                                field331.method3010(253);
                                field331.method2768(arg1);
                                field331.method2766(arg0);
                                field331.method2766(var19);
                            }
                            if (arg3 == 4) {
                                field331.method3010(212);
                                field331.method2768(arg1);
                                field331.method2766(arg0);
                                field331.method2766(var19);
                            }
                            if (arg3 == 5) {
                                field331.method3010(96);
                                field331.method2768(arg1);
                                field331.method2766(arg0);
                                field331.method2766(var19);
                            }
                            if (arg3 == 6) {
                                field331.method3010(199);
                                field331.method2768(arg1);
                                field331.method2766(arg0);
                                field331.method2766(var19);
                            }
                            if (arg3 == 7) {
                                field331.method3010(37);
                                field331.method2768(arg1);
                                field331.method2766(arg0);
                                field331.method2766(var19);
                            }
                            if (arg3 == 8) {
                                field331.method3010(53);
                                field331.method2768(arg1);
                                field331.method2766(arg0);
                                field331.method2766(var19);
                            }
                            if (arg3 == 9) {
                                field331.method3010(222);
                                field331.method2768(arg1);
                                field331.method2766(arg0);
                                field331.method2766(var19);
                            }
                            if (arg3 == 10) {
                                field331.method3010(117);
                                field331.method2768(arg1);
                                field331.method2766(arg0);
                                field331.method2766(var19);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 14) {
            class24 var26 = field409[arg3];
            if (var26 != null) {
                field396 = arg6;
                field397 = arg7;
                field502 = 2;
                field398 = 0;
                field520 = arg0;
                field312 = arg1;
                field331.method3010(193);
                field331.method2765(class106.field1710[82] ? 1 : 0);
                field331.method2812(Statics.field758);
                field331.method2812(Statics.field1449);
                field331.method2914(Statics.field2239);
                field331.method2812(arg3);
            }
        }
        if (arg2 == 1003) {
            field396 = arg6;
            field397 = arg7;
            field502 = 2;
            field398 = 0;
            class36 var27 = field461[arg3];
            if (var27 != null) {
                class200 var28 = var27.field757;
                if (var28.field3023 != null) {
                    var28 = var28.method3526();
                }
                if (var28 != null) {
                    field331.method3010(52);
                    field331.method2812(var28.field2997);
                }
            }
        }
        if (arg2 == 6) {
            field396 = arg6;
            field397 = arg7;
            field502 = 2;
            field398 = 0;
            field520 = arg0;
            field312 = arg1;
            field331.method3010(109);
            field331.method2812(Statics.field171 + arg0);
            field331.method2812(arg3 >> 14 & 0x7FFF);
            field331.method2973(Statics.field464 + arg1);
            field331.method2888(class106.field1710[82] ? 1 : 0);
        }
        if (arg2 == 58) {
            class151 var29 = class151.method70(arg1, arg0);
            if (var29 != null) {
                field331.method3010(126);
                field331.method2914(Statics.field148);
                field331.method2813(field442);
                field331.method2813(field443);
                field331.method2766(var29.field2105);
                field331.method2812(arg0);
                field331.method2768(arg1);
            }
        }
        if (arg2 == 43) {
            field331.method3010(152);
            field331.method2914(arg1);
            field331.method2973(arg0);
            field331.method2766(arg3);
            field400 = 0;
            Statics.field1615 = class151.method80(arg1);
            field553 = arg0;
        }
        if (arg2 == 46) {
            class24 var30 = field409[arg3];
            if (var30 != null) {
                field396 = arg6;
                field397 = arg7;
                field502 = 2;
                field398 = 0;
                field520 = arg0;
                field312 = arg1;
                field331.method3010(1);
                field331.method2973(arg3);
                field331.method2765(class106.field1710[82] ? 1 : 0);
            }
        }
        if (arg2 == 29) {
            field331.method3010(224);
            field331.method2768(arg1);
            class151 var31 = class151.method80(arg1);
            if (var31.field2170 != null && var31.field2170[0][0] == 5) {
                int var32 = var31.field2170[0][1];
                if (class147.field2032[var32] != var31.field2184[0]) {
                    class147.field2032[var32] = var31.field2184[0];
                    method784(var32);
                }
            }
        }
        if (arg2 == 45) {
            class24 var33 = field409[arg3];
            if (var33 != null) {
                field396 = arg6;
                field397 = arg7;
                field502 = 2;
                field398 = 0;
                field520 = arg0;
                field312 = arg1;
                field331.method3010(245);
                field331.method2776(class106.field1710[82] ? 1 : 0);
                field331.method2766(arg3);
            }
        }
        if (arg2 == 5) {
            field396 = arg6;
            field397 = arg7;
            field502 = 2;
            field398 = 0;
            field520 = arg0;
            field312 = arg1;
            field331.method3010(165);
            field331.method2812(Statics.field171 + arg0);
            field331.method2813(Statics.field464 + arg1);
            field331.method2776(class106.field1710[82] ? 1 : 0);
            field331.method2973(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 3) {
            field396 = arg6;
            field397 = arg7;
            field502 = 2;
            field398 = 0;
            field520 = arg0;
            field312 = arg1;
            field331.method3010(144);
            field331.method2812(Statics.field171 + arg0);
            field331.method2973(Statics.field464 + arg1);
            field331.method2963(class106.field1710[82] ? 1 : 0);
            field331.method2973(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 8) {
            class36 var34 = field461[arg3];
            if (var34 != null) {
                field396 = arg6;
                field397 = arg7;
                field502 = 2;
                field398 = 0;
                field520 = arg0;
                field312 = arg1;
                field331.method3010(110);
                field331.method2766(field442);
                field331.method2812(arg3);
                field331.method2888(class106.field1710[82] ? 1 : 0);
                field331.method2801(Statics.field148);
            }
        }
        if (arg2 == 1) {
            field396 = arg6;
            field397 = arg7;
            field502 = 2;
            field398 = 0;
            field520 = arg0;
            field312 = arg1;
            field331.method3010(211);
            field331.method2812(arg3 >> 14 & 0x7FFF);
            field331.method2973(Statics.field758);
            field331.method2824(Statics.field2239);
            field331.method2973(Statics.field171 + arg0);
            field331.method2973(Statics.field464 + arg1);
            field331.method2765(class106.field1710[82] ? 1 : 0);
            field331.method2766(Statics.field1449);
        }
        if (arg2 == 41) {
            field331.method3010(217);
            field331.method2824(arg1);
            field331.method2766(arg0);
            field331.method2766(arg3);
            field400 = 0;
            Statics.field1615 = class151.method80(arg1);
            field553 = arg0;
        }
        if (arg2 == 51) {
            class24 var35 = field409[arg3];
            if (var35 != null) {
                field396 = arg6;
                field397 = arg7;
                field502 = 2;
                field398 = 0;
                field520 = arg0;
                field312 = arg1;
                field331.method3010(178);
                field331.method2776(class106.field1710[82] ? 1 : 0);
                field331.method2813(arg3);
            }
        }
        if (arg2 == 16) {
            field396 = arg6;
            field397 = arg7;
            field502 = 2;
            field398 = 0;
            field520 = arg0;
            field312 = arg1;
            field331.method3010(163);
            field331.method2973(Statics.field758);
            field331.method2888(class106.field1710[82] ? 1 : 0);
            field331.method2766(Statics.field1449);
            field331.method2801(Statics.field2239);
            field331.method2813(Statics.field464 + arg1);
            field331.method2813(arg3);
            field331.method2812(Statics.field171 + arg0);
        }
        if (arg2 == 1001) {
            field396 = arg6;
            field397 = arg7;
            field502 = 2;
            field398 = 0;
            field520 = arg0;
            field312 = arg1;
            field331.method3010(195);
            field331.method2813(Statics.field171 + arg0);
            field331.method2813(arg3 >> 14 & 0x7FFF);
            field331.method2766(Statics.field464 + arg1);
            field331.method2765(class106.field1710[82] ? 1 : 0);
        }
        if (arg2 == 10) {
            class36 var36 = field461[arg3];
            if (var36 != null) {
                field396 = arg6;
                field397 = arg7;
                field502 = 2;
                field398 = 0;
                field520 = arg0;
                field312 = arg1;
                field331.method3010(231);
                field331.method2813(arg3);
                field331.method2765(class106.field1710[82] ? 1 : 0);
            }
        }
        if (arg2 == 2) {
            field396 = arg6;
            field397 = arg7;
            field502 = 2;
            field398 = 0;
            field520 = arg0;
            field312 = arg1;
            field331.method3010(28);
            field331.method2766(Statics.field171 + arg0);
            field331.method2768(Statics.field148);
            field331.method2973(Statics.field464 + arg1);
            field331.method2813(field442);
            field331.method2963(class106.field1710[82] ? 1 : 0);
            field331.method2812(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 44) {
            class24 var37 = field409[arg3];
            if (var37 != null) {
                field396 = arg6;
                field397 = arg7;
                field502 = 2;
                field398 = 0;
                field520 = arg0;
                field312 = arg1;
                field331.method3010(25);
                field331.method2776(class106.field1710[82] ? 1 : 0);
                field331.method2812(arg3);
            }
        }
        if (arg2 == 19) {
            field396 = arg6;
            field397 = arg7;
            field502 = 2;
            field398 = 0;
            field520 = arg0;
            field312 = arg1;
            field331.method3010(200);
            field331.method2776(class106.field1710[82] ? 1 : 0);
            field331.method2813(Statics.field464 + arg1);
            field331.method2973(Statics.field171 + arg0);
            field331.method2766(arg3);
        }
        if (arg2 == 7) {
            class36 var38 = field461[arg3];
            if (var38 != null) {
                field396 = arg6;
                field397 = arg7;
                field502 = 2;
                field398 = 0;
                field520 = arg0;
                field312 = arg1;
                field331.method3010(59);
                field331.method2812(Statics.field1449);
                field331.method2801(Statics.field2239);
                field331.method2812(Statics.field758);
                field331.method2766(arg3);
                field331.method2776(class106.field1710[82] ? 1 : 0);
            }
        }
        if (arg2 == 24) {
            class151 var39 = class151.method80(arg1);
            boolean var40 = true;
            if (var39.field2074 > 0) {
                var40 = method2711(var39);
            }
            if (var40) {
                field331.method3010(224);
                field331.method2768(arg1);
            }
        }
        if (arg2 == 32) {
            field331.method3010(128);
            field331.method2973(arg0);
            field331.method2801(arg1);
            field331.method2801(Statics.field148);
            field331.method2766(arg3);
            field331.method2812(field442);
            field400 = 0;
            Statics.field1615 = class151.method80(arg1);
            field553 = arg0;
        }
        if (arg2 == 13) {
            class36 var41 = field461[arg3];
            if (var41 != null) {
                field396 = arg6;
                field397 = arg7;
                field502 = 2;
                field398 = 0;
                field520 = arg0;
                field312 = arg1;
                field331.method3010(191);
                field331.method2776(class106.field1710[82] ? 1 : 0);
                field331.method2766(arg3);
            }
        }
        if (arg2 == 11) {
            class36 var42 = field461[arg3];
            if (var42 != null) {
                field396 = arg6;
                field397 = arg7;
                field502 = 2;
                field398 = 0;
                field520 = arg0;
                field312 = arg1;
                field331.method3010(85);
                field331.method2973(arg3);
                field331.method2888(class106.field1710[82] ? 1 : 0);
            }
        }
        if (arg2 == 47) {
            class24 var43 = field409[arg3];
            if (var43 != null) {
                field396 = arg6;
                field397 = arg7;
                field502 = 2;
                field398 = 0;
                field520 = arg0;
                field312 = arg1;
                field331.method3010(242);
                field331.method2812(arg3);
                field331.method2776(class106.field1710[82] ? 1 : 0);
            }
        }
        if (arg2 == 34) {
            field331.method3010(41);
            field331.method2813(arg3);
            field331.method2812(arg0);
            field331.method2914(arg1);
            field400 = 0;
            Statics.field1615 = class151.method80(arg1);
            field553 = arg0;
        }
        if (arg2 == 42) {
            field331.method3010(204);
            field331.method2768(arg1);
            field331.method2766(arg0);
            field331.method2813(arg3);
            field400 = 0;
            Statics.field1615 = class151.method80(arg1);
            field553 = arg0;
        }
        if (arg2 == 31) {
            field331.method3010(140);
            field331.method2824(Statics.field2239);
            field331.method2813(Statics.field758);
            field331.method2812(Statics.field1449);
            field331.method2813(arg3);
            field331.method2812(arg0);
            field331.method2801(arg1);
            field400 = 0;
            Statics.field1615 = class151.method80(arg1);
            field553 = arg0;
        }
        if (arg2 == 40) {
            field331.method3010(143);
            field331.method2812(arg3);
            field331.method2914(arg1);
            field331.method2812(arg0);
            field400 = 0;
            Statics.field1615 = class151.method80(arg1);
            field553 = arg0;
        }
        if (arg2 == 35) {
            field331.method3010(221);
            field331.method2813(arg3);
            field331.method2914(arg1);
            field331.method2766(arg0);
            field400 = 0;
            Statics.field1615 = class151.method80(arg1);
            field553 = arg0;
        }
        if (arg2 == 17) {
            field396 = arg6;
            field397 = arg7;
            field502 = 2;
            field398 = 0;
            field520 = arg0;
            field312 = arg1;
            field331.method3010(250);
            field331.method2812(Statics.field464 + arg1);
            field331.method2766(arg3);
            field331.method2813(Statics.field171 + arg0);
            field331.method2812(field442);
            field331.method2801(Statics.field148);
            field331.method2963(class106.field1710[82] ? 1 : 0);
        }
        if (arg2 == 1004) {
            field396 = arg6;
            field397 = arg7;
            field502 = 2;
            field398 = 0;
            field331.method3010(156);
            field331.method2766(arg3);
        }
        if (arg2 == 50) {
            class24 var44 = field409[arg3];
            if (var44 != null) {
                field396 = arg6;
                field397 = arg7;
                field502 = 2;
                field398 = 0;
                field520 = arg0;
                field312 = arg1;
                field331.method3010(223);
                field331.method2766(arg3);
                field331.method2776(class106.field1710[82] ? 1 : 0);
            }
        }
        if (arg2 == 9) {
            class36 var45 = field461[arg3];
            if (var45 != null) {
                field396 = arg6;
                field397 = arg7;
                field502 = 2;
                field398 = 0;
                field520 = arg0;
                field312 = arg1;
                field331.method3010(78);
                field331.method2776(class106.field1710[82] ? 1 : 0);
                field331.method2812(arg3);
            }
        }
        if (arg2 == 48) {
            class24 var46 = field409[arg3];
            if (var46 != null) {
                field396 = arg6;
                field397 = arg7;
                field502 = 2;
                field398 = 0;
                field520 = arg0;
                field312 = arg1;
                field331.method3010(9);
                field331.method2813(arg3);
                field331.method2776(class106.field1710[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field331.method3010(170);
            field331.method2813(arg0);
            field331.method2824(arg1);
            field331.method2813(arg3);
            field400 = 0;
            Statics.field1615 = class151.method80(arg1);
            field553 = arg0;
        }
        if (arg2 == 49) {
            class24 var47 = field409[arg3];
            if (var47 != null) {
                field396 = arg6;
                field397 = arg7;
                field502 = 2;
                field398 = 0;
                field520 = arg0;
                field312 = arg1;
                field331.method3010(22);
                field331.method2812(arg3);
                field331.method2888(class106.field1710[82] ? 1 : 0);
            }
        }
        if (arg2 == 37) {
            field331.method3010(98);
            field331.method2812(arg3);
            field331.method2768(arg1);
            field331.method2766(arg0);
            field400 = 0;
            Statics.field1615 = class151.method80(arg1);
            field553 = arg0;
        }
        if (arg2 == 26) {
            method73();
        }
        if (arg2 == 30 && field450 == null) {
            method105(arg1, arg0);
            field450 = class151.method70(arg1, arg0);
            method1487(field450);
        }
        if (arg2 == 12) {
            class36 var48 = field461[arg3];
            if (var48 != null) {
                field396 = arg6;
                field397 = arg7;
                field502 = 2;
                field398 = 0;
                field520 = arg0;
                field312 = arg1;
                field331.method3010(196);
                field331.method2812(arg3);
                field331.method2765(class106.field1710[82] ? 1 : 0);
            }
        }
        if (arg2 == 1002) {
            field396 = arg6;
            field397 = arg7;
            field502 = 2;
            field398 = 0;
            field331.method3010(147);
            field331.method2766(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 23) {
            Statics.field2244.method1700(Statics.field2326, arg0, arg1);
        }
        if (arg2 == 33) {
            field331.method3010(132);
            field331.method2914(arg1);
            field331.method2812(arg3);
            field331.method2766(arg0);
            field400 = 0;
            Statics.field1615 = class151.method80(arg1);
            field553 = arg0;
        }
        if (arg2 == 38) {
            method1032();
            class151 var49 = class151.method80(arg1);
            field439 = 1;
            Statics.field1449 = arg0;
            Statics.field2239 = arg1;
            Statics.field758 = arg3;
            method1487(var49);
            field372 = class38.method183(16748608) + class199.method207(arg3).field2945 + class38.method183(16777215);
            if (field372 == null) {
                field372 = "null";
            }
            return;
        }
        if (arg2 == 18) {
            field396 = arg6;
            field397 = arg7;
            field502 = 2;
            field398 = 0;
            field520 = arg0;
            field312 = arg1;
            field331.method3010(100);
            field331.method2776(class106.field1710[82] ? 1 : 0);
            field331.method2766(arg3);
            field331.method2812(Statics.field171 + arg0);
            field331.method2973(Statics.field464 + arg1);
        }
        if (arg2 == 20) {
            field396 = arg6;
            field397 = arg7;
            field502 = 2;
            field398 = 0;
            field520 = arg0;
            field312 = arg1;
            field331.method3010(113);
            field331.method2813(Statics.field464 + arg1);
            field331.method2963(class106.field1710[82] ? 1 : 0);
            field331.method2813(arg3);
            field331.method2813(Statics.field171 + arg0);
        }
        if (field439 != 0) {
            field439 = 0;
            method1487(class151.method80(Statics.field2239));
        }
        if (field441) {
            method1032();
        }
        if (Statics.field1615 != null && field400 == 0) {
            method1487(Statics.field1615);
        }
    }

    @ObfuscatedName("bl.cs(I)V")
    public static void method1032() {
        if (!field441) {
            return;
        }
        class151 var0 = class151.method70(Statics.field148, field442);
        if (var0 != null && var0.field2162 != null) {
            class19 var1 = new class19();
            var1.field193 = var0;
            var1.field197 = var0.field2162;
            class33.method3007(var1, 200000);
        }
        field441 = false;
        method1487(var0);
    }

    @ObfuscatedName("p.cy(III)V")
    public static void method105(int arg0, int arg1) {
        field331.method3010(127);
        field331.method2812(arg1);
        field331.method2824(arg0);
    }

    @ObfuscatedName("fm.cp(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method3029(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field427 || field428 >= 500) {
            return;
        }
        field433[field428] = arg0;
        field358[field428] = arg1;
        field431[field428] = arg2;
        field399[field428] = arg3;
        field490[field428] = arg4;
        field316[field428] = arg5;
        field428++;
    }

    @ObfuscatedName("fy.cu(I)V")
    public static void method2985() {
        for (int var0 = 0; var0 < field428; var0++) {
            if (method681(field431[var0])) {
                if (var0 < field428 - 1) {
                    for (int var1 = var0; var1 < field428 - 1; var1++) {
                        field433[var1] = field433[var1 + 1];
                        field358[var1] = field358[var1 + 1];
                        field431[var1] = field431[var1 + 1];
                        field399[var1] = field399[var1 + 1];
                        field490[var1] = field490[var1 + 1];
                        field316[var1] = field316[var1 + 1];
                    }
                }
                field428--;
            }
        }
    }

    @ObfuscatedName("ai.ce(IB)Z")
    public static boolean method681(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("ai.cz(Lgg;IIII)V")
    public static final void method680(class200 arg0, int arg1, int arg2, int arg3) {
        if (field428 >= 400) {
            return;
        }
        if (arg0.field3023 != null) {
            arg0 = arg0.method3526();
        }
        if (arg0 == null || !arg0.field3025 || arg0.field3028 && field460 != arg1) {
            return;
        }
        String var4 = arg0.field2998;
        if (arg0.field3001 != 0) {
            int var6 = arg0.field3001;
            int var7 = Statics.field810.field249;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class38.method183(16711680);
            } else if (var8 < -6) {
                var9 = class38.method183(16723968);
            } else if (var8 < -3) {
                var9 = class38.method183(16740352);
            } else if (var8 < 0) {
                var9 = class38.method183(16756736);
            } else if (var8 > 9) {
                var9 = class38.method183(65280);
            } else if (var8 > 6) {
                var9 = class38.method183(4259584);
            } else if (var8 > 3) {
                var9 = class38.method183(8453888);
            } else if (var8 > 0) {
                var9 = class38.method183(12648192);
            } else {
                var9 = class38.method183(16776960);
            }
            var4 = var4 + var9 + " " + class38.field774 + class174.field2452 + arg0.field3001 + class38.field787;
        }
        if (field439 == 1) {
            method3029(class174.field2517, field372 + " " + class38.field779 + " " + class38.method183(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field441) {
            String[] var10 = arg0.field3005;
            if (field347) {
                var10 = method3614(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class174.field2629)) {
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
                        method3029(var10[var11], class38.method183(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class174.field2629)) {
                        short var14 = 0;
                        if (field488 != class41.field807) {
                            if (field488 == class41.field812 || field488 == class41.field815 && arg0.field3001 > Statics.field810.field249) {
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
                            method3029(var10[var13], class38.method183(16776960) + var4, var15, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method3029(class174.field2518, class38.method183(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1921 & 0x2) == 2) {
            method3029(field298, field445 + " " + class38.field779 + " " + class38.method183(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ar.cb(Lv;IIII)V")
    public static final void method867(class24 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field810 == arg0 || field428 >= 400) {
            return;
        }
        String var4;
        if (arg0.field250 == 0) {
            var4 = arg0.field251[0] + arg0.field257 + arg0.field251[1] + method1997(arg0.field249, Statics.field810.field249) + " " + class38.field774 + class174.field2452 + arg0.field249 + class38.field787 + arg0.field251[2];
        } else {
            var4 = arg0.field251[0] + arg0.field257 + arg0.field251[1] + " " + class38.field774 + class174.field2524 + arg0.field250 + class38.field787 + arg0.field251[2];
        }
        if (field439 == 1) {
            method3029(class174.field2517, field372 + " " + class38.field779 + " " + class38.method183(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field441) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field415[var5] != null) {
                    short var6 = 0;
                    if (field415[var5].equalsIgnoreCase(class174.field2629)) {
                        if (field311 == class41.field807) {
                            continue;
                        }
                        if (field311 == class41.field812 || field311 == class41.field815 && arg0.field249 > Statics.field810.field249) {
                            var6 = 2000;
                        }
                        if (Statics.field810.field263 != 0 && arg0.field263 != 0) {
                            if (Statics.field810.field263 == arg0.field263) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field435[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field543[var5] + var6;
                    method3029(field415[var5], class38.method183(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1921 & 0x8) == 8) {
            method3029(field298, field445 + " " + class38.field779 + " " + class38.method183(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field428; var9++) {
            if (field431[var9] == 23) {
                field358[var9] = class38.method183(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("dr.ch(III)Ljava/lang/String;")
    public static final String method1997(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class38.method183(16711680);
        } else if (var2 < -6) {
            return class38.method183(16723968);
        } else if (var2 < -3) {
            return class38.method183(16740352);
        } else if (var2 < 0) {
            return class38.method183(16756736);
        } else if (var2 > 9) {
            return class38.method183(65280);
        } else if (var2 > 6) {
            return class38.method183(4259584);
        } else if (var2 > 3) {
            return class38.method183(8453888);
        } else if (var2 > 0) {
            return class38.method183(12648192);
        } else {
            return class38.method183(16776960);
        }
    }

    @ObfuscatedName("d.cj(IIIIIIIIB)V")
    public static final void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class151.method1075(arg0)) {
            Statics.field964 = null;
            method3086(Statics.field2173[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field964 != null) {
                method3086(Statics.field964, -1412584499, arg1, arg2, arg3, arg4, Statics.field2686, Statics.field577, arg7);
                Statics.field964 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field491[var8] = true;
            }
        } else {
            field491[arg7] = true;
        }
    }

    @ObfuscatedName("fv.cq([Leu;IIIIIIIIB)V")
    public static final void method3086(class151[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class220.method3787(arg2, arg3, arg4, arg5);
        class85.method1576();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class151 var10 = arg0[var9];
            if (var10 != null && (var10.field2089 == arg1 || arg1 == -1412584499 && field384 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field494[field489] = var10.field2100 + arg6;
                    field495[field489] = var10.field2084 + arg7;
                    field369[field489] = var10.field2110;
                    field497[field489] = var10.field2086;
                    var11 = ++field489 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2201 = var11;
                var10.field2202 = field295;
                if (!var10.field2069 || !method707(var10)) {
                    if (var10.field2074 > 0) {
                        int var12 = var10.field2074;
                        if (var12 == 324) {
                            if (field559 == -1) {
                                field559 = var10.field2119;
                                field561 = var10.field2061;
                            }
                            if (field416.field2038) {
                                var10.field2119 = field559;
                            } else {
                                var10.field2119 = field561;
                            }
                        } else if (var12 == 325) {
                            if (field559 == -1) {
                                field559 = var10.field2119;
                                field561 = var10.field2061;
                            }
                            if (field416.field2038) {
                                var10.field2119 = field561;
                            } else {
                                var10.field2119 = field559;
                            }
                        } else if (var12 == 327) {
                            var10.field2189 = 150;
                            var10.field2122 = (int) (Math.sin((double) field295 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2143 = 5;
                            var10.field2114 = 0;
                        } else if (var12 == 328) {
                            var10.field2189 = 150;
                            var10.field2122 = (int) (Math.sin((double) field295 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2143 = 5;
                            var10.field2114 = 1;
                        }
                    }
                    int var13 = var10.field2100 + arg6;
                    int var14 = var10.field2084 + arg7;
                    int var15 = var10.field2127;
                    if (field384 == var10) {
                        if (arg1 != -1412584499 && !var10.field2148) {
                            Statics.field964 = arg0;
                            Statics.field2686 = arg6;
                            Statics.field577 = arg7;
                            continue;
                        }
                        if (field470 && field463) {
                            int var16 = class116.field1812;
                            int var17 = class116.field1811 * 853340747;
                            int var18 = var16 - field508;
                            int var19 = var17 - field462;
                            if (var18 < field465) {
                                var18 = field465;
                            }
                            if (var10.field2110 + var18 > field465 + field341.field2110) {
                                var18 = field465 + field341.field2110 - var10.field2110;
                            }
                            if (var19 < field466) {
                                var19 = field466;
                            }
                            if (var10.field2086 + var19 > field466 + field341.field2086) {
                                var19 = field466 + field341.field2086 - var10.field2086;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2148) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2163 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2163 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2110 + var13;
                        int var27 = var10.field2086 + var14;
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
                        int var30 = var10.field2110 + var13;
                        int var31 = var10.field2086 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2069 || var20 < var22 && var21 < var23) {
                        if (var10.field2074 != 0) {
                            if (var10.field2074 == 1336) {
                                if (field564) {
                                    var14 += 15;
                                    Statics.field46.method3688("Fps:" + field1776, var10.field2110 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field289) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field289) {
                                        var34 = 16711680;
                                    }
                                    Statics.field46.method3688("Mem:" + var33 + "k", var10.field2110 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2074 == 1337) {
                                field408 = var13;
                                field436 = var14;
                                method3253(var13, var14, var10.field2110, var10.field2086);
                                field491[var10.field2201] = true;
                                class220.method3787(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2074 == 1338) {
                                method186();
                                class146 var35 = var10.method2636(false);
                                if (var35 != null) {
                                    class220.method3787(var13, var14, var35.field2029 + var13, var35.field2021 + var14);
                                    if (field522 == 2 || field522 == 5) {
                                        class220.method3806(var13, var14, 0, var35.field2024, var35.field2023);
                                    } else {
                                        int var36 = field373 + field359 & 0x7FF;
                                        int var37 = Statics.field810.field648 / 32 + 48;
                                        int var38 = 464 - Statics.field810.field597 / 32;
                                        Statics.field880.method3938(var13, var14, var35.field2029, var35.field2021, var37, var38, var36, field361 + 256, var35.field2024, var35.field2023);
                                        for (int var39 = 0; var39 < field516; var39++) {
                                            int var40 = field394[var39] * 4 + 2 - Statics.field810.field648 / 32;
                                            int var41 = field429[var39] * 4 + 2 - Statics.field810.field597 / 32;
                                            method768(var13, var14, var40, var41, field519[var39], var35);
                                        }
                                        int var42 = 0;
                                        while (true) {
                                            if (var42 >= 104) {
                                                for (int var47 = 0; var47 < field327; var47++) {
                                                    class36 var48 = field461[field560[var47]];
                                                    if (var48 != null && var48.method237()) {
                                                        class200 var49 = var48.field757;
                                                        if (var49 != null && var49.field3023 != null) {
                                                            var49 = var49.method3526();
                                                        }
                                                        if (var49 != null && var49.field3014 && var49.field3025) {
                                                            int var50 = var48.field648 / 32 - Statics.field810.field648 / 32;
                                                            int var51 = var48.field597 / 32 - Statics.field810.field597 / 32;
                                                            method768(var13, var14, var50, var51, Statics.field88[1], var35);
                                                        }
                                                    }
                                                }
                                                int var52 = class46.field898;
                                                int[] var53 = class46.field903;
                                                for (int var54 = 0; var54 < var52; var54++) {
                                                    class24 var55 = field409[var53[var54]];
                                                    if (var55 != null && var55.method237() && !var55.field264 && Statics.field810 != var55) {
                                                        int var56 = var55.field648 / 32 - Statics.field810.field648 / 32;
                                                        int var57 = var55.field597 / 32 - Statics.field810.field597 / 32;
                                                        boolean var58 = false;
                                                        if (method222(var55.field257, true)) {
                                                            var58 = true;
                                                        }
                                                        boolean var59 = false;
                                                        for (int var60 = 0; var60 < Statics.field1073; var60++) {
                                                            if (var55.field257.equals(Statics.field2321[var60].field271)) {
                                                                var59 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var61 = false;
                                                        if (Statics.field810.field263 != 0 && var55.field263 != 0 && Statics.field810.field263 == var55.field263) {
                                                            var61 = true;
                                                        }
                                                        if (var58) {
                                                            method768(var13, var14, var56, var57, Statics.field88[3], var35);
                                                        } else if (var61) {
                                                            method768(var13, var14, var56, var57, Statics.field88[4], var35);
                                                        } else if (var59) {
                                                            method768(var13, var14, var56, var57, Statics.field88[5], var35);
                                                        } else {
                                                            method768(var13, var14, var56, var57, Statics.field88[2], var35);
                                                        }
                                                    }
                                                }
                                                if (field303 != 0 && field295 % 20 < 10) {
                                                    if (field303 == 1 && field304 >= 0 && field304 < field461.length) {
                                                        class36 var62 = field461[field304];
                                                        if (var62 != null) {
                                                            int var63 = var62.field648 / 32 - Statics.field810.field648 / 32;
                                                            int var64 = var62.field597 / 32 - Statics.field810.field597 / 32;
                                                            method221(var13, var14, var63, var64, Statics.field48[1], var35);
                                                        }
                                                    }
                                                    if (field303 == 2) {
                                                        int var65 = field306 * 4 - Statics.field171 * 4 + 2 - Statics.field810.field648 / 32;
                                                        int var66 = field307 * 4 - Statics.field464 * 4 + 2 - Statics.field810.field597 / 32;
                                                        method221(var13, var14, var65, var66, Statics.field48[1], var35);
                                                    }
                                                    if (field303 == 10 && field305 >= 0 && field305 < field409.length) {
                                                        class24 var67 = field409[field305];
                                                        if (var67 != null) {
                                                            int var68 = var67.field648 / 32 - Statics.field810.field648 / 32;
                                                            int var69 = var67.field597 / 32 - Statics.field810.field597 / 32;
                                                            method221(var13, var14, var68, var69, Statics.field48[1], var35);
                                                        }
                                                    }
                                                }
                                                if (field520 != 0) {
                                                    int var70 = field520 * 4 + 2 - Statics.field810.field648 / 32;
                                                    int var71 = field312 * 4 + 2 - Statics.field810.field597 / 32;
                                                    method768(var13, var14, var70, var71, Statics.field48[0], var35);
                                                }
                                                if (!Statics.field810.field264) {
                                                    class220.method3817(var35.field2029 / 2 + var13 - 1, var35.field2021 / 2 + var14 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var43 = 0; var43 < 104; var43++) {
                                                class129 var44 = field419[Statics.field2326][var42][var43];
                                                if (var44 != null) {
                                                    int var45 = var42 * 4 + 2 - Statics.field810.field648 / 32;
                                                    int var46 = var43 * 4 + 2 - Statics.field810.field597 / 32;
                                                    method768(var13, var14, var45, var46, Statics.field88[0], var35);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                    field492[var11] = true;
                                }
                                class220.method3787(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2074 == 1339) {
                                method3240(var10, var13, var14, var11);
                                class220.method3787(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2163 == 0) {
                            if (!var10.field2069 && method707(var10) && Statics.field803 != var10) {
                                continue;
                            }
                            if (!var10.field2069) {
                                if (var10.field2092 > var10.field2094 - var10.field2086) {
                                    var10.field2092 = var10.field2094 - var10.field2086;
                                }
                                if (var10.field2092 < 0) {
                                    var10.field2092 = 0;
                                }
                            }
                            method3086(arg0, var10.field2070, var20, var21, var22, var23, var13 - var10.field2166, var14 - var10.field2092, var11);
                            if (var10.field2194 != null) {
                                method3086(var10.field2194, var10.field2070, var20, var21, var22, var23, var13 - var10.field2166, var14 - var10.field2092, var11);
                            }
                            class18 var72 = (class18) field447.method2229((long) var10.field2070);
                            if (var72 != null) {
                                method21(var72.field180, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class220.method3787(arg2, arg3, arg4, arg5);
                            class85.method1576();
                        }
                        if (field500 || field493[var11] || field498 > 1) {
                            if (var10.field2163 == 0 && !var10.field2069 && var10.field2094 > var10.field2086) {
                                int var73 = var10.field2110 + var13;
                                int var74 = var10.field2092;
                                int var75 = var10.field2086;
                                int var76 = var10.field2094;
                                Statics.field2358[0].method3877(var73, var14);
                                Statics.field2358[1].method3877(var73, var14 + var75 - 16);
                                class220.method3817(var73, var14 + 16, 16, var75 - 32, field342);
                                int var77 = (var75 - 32) * var75 / var76;
                                if (var77 < 8) {
                                    var77 = 8;
                                }
                                int var78 = (var75 - 32 - var77) * var74 / (var76 - var75);
                                class220.method3817(var73, var14 + 16 + var78, 16, var77, field366);
                                class220.method3837(var73, var14 + 16 + var78, var77, field328);
                                class220.method3837(var73 + 1, var14 + 16 + var78, var77, field328);
                                class220.method3801(var73, var14 + 16 + var78, 16, field328);
                                class220.method3801(var73, var14 + 17 + var78, 16, field328);
                                class220.method3837(var73 + 15, var14 + 16 + var78, var77, field532);
                                class220.method3837(var73 + 14, var14 + 17 + var78, var77 - 1, field532);
                                class220.method3801(var73, var14 + 15 + var78 + var77, 16, field532);
                                class220.method3801(var73 + 1, var14 + 14 + var78 + var77, 15, field532);
                            }
                            if (var10.field2163 != 1) {
                                if (var10.field2163 == 2) {
                                    int var79 = 0;
                                    for (int var80 = 0; var80 < var10.field2082; var80++) {
                                        for (int var81 = 0; var81 < var10.field2145; var81++) {
                                            int var82 = (var10.field2136 + 32) * var81 + var13;
                                            int var83 = (var10.field2137 + 32) * var80 + var14;
                                            if (var79 < 20) {
                                                var82 += var10.field2138[var79];
                                                var83 += var10.field2130[var79];
                                            }
                                            if (var10.field2188[var79] > 0) {
                                                boolean var84 = false;
                                                boolean var85 = false;
                                                int var86 = var10.field2188[var79] - 1;
                                                if (var82 + 32 > arg2 && var82 < arg4 && var83 + 32 > arg3 && var83 < arg5 || Statics.field2314 == var10 && field402 == var79) {
                                                    class225 var87;
                                                    if (field439 == 1 && Statics.field1449 == var79 && Statics.field2239 == var10.field2070) {
                                                        var87 = class199.method81(var86, var10.field2185[var79], 2, 0, 2, false);
                                                    } else {
                                                        var87 = class199.method81(var86, var10.field2185[var79], 1, 3153952, 2, false);
                                                    }
                                                    if (var87 == null) {
                                                        method1487(var10);
                                                    } else if (Statics.field2314 == var10 && field402 == var79) {
                                                        int var88 = class116.field1812 - field403;
                                                        int var89 = class116.field1811 * 853340747 - field404;
                                                        if (var88 < 5 && var88 > -5) {
                                                            var88 = 0;
                                                        }
                                                        if (var89 < 5 && var89 > -5) {
                                                            var89 = 0;
                                                        }
                                                        if (field407 < 5) {
                                                            var88 = 0;
                                                            var89 = 0;
                                                        }
                                                        var87.method3920(var82 + var88, var83 + var89, 128);
                                                        if (arg1 != -1) {
                                                            class151 var90 = arg0[arg1 & 0xFFFF];
                                                            if (var83 + var89 < class220.field3169 && var90.field2092 > 0) {
                                                                int var91 = field518 * (class220.field3169 - var83 - var89) / 3;
                                                                if (var91 > field518 * 10) {
                                                                    var91 = field518 * 10;
                                                                }
                                                                if (var91 > var90.field2092) {
                                                                    var91 = var90.field2092;
                                                                }
                                                                var90.field2092 -= var91;
                                                                field404 += var91;
                                                                method1487(var90);
                                                            }
                                                            if (var83 + var89 + 32 > class220.field3170 && var90.field2092 < var90.field2094 - var90.field2086) {
                                                                int var92 = field518 * (var83 + var89 + 32 - class220.field3170) / 3;
                                                                if (var92 > field518 * 10) {
                                                                    var92 = field518 * 10;
                                                                }
                                                                if (var92 > var90.field2094 - var90.field2086 - var90.field2092) {
                                                                    var92 = var90.field2094 - var90.field2086 - var90.field2092;
                                                                }
                                                                var90.field2092 += var92;
                                                                field404 -= var92;
                                                                method1487(var90);
                                                            }
                                                        }
                                                    } else if (Statics.field1615 == var10 && field553 == var79) {
                                                        var87.method3920(var82, var83, 128);
                                                    } else {
                                                        var87.method3914(var82, var83);
                                                    }
                                                }
                                            } else if (var10.field2140 != null && var79 < 20) {
                                                class225 var93 = var10.method2634(var79);
                                                if (var93 != null) {
                                                    var93.method3914(var82, var83);
                                                } else if (class151.field2068) {
                                                    method1487(var10);
                                                }
                                            }
                                            var79++;
                                        }
                                    }
                                } else if (var10.field2163 == 3) {
                                    int var94;
                                    if (method199(var10)) {
                                        var94 = var10.field2096;
                                        if (Statics.field803 == var10 && var10.field2098 != 0) {
                                            var94 = var10.field2098;
                                        }
                                    } else {
                                        var94 = var10.field2095;
                                        if (Statics.field803 == var10 && var10.field2097 != 0) {
                                            var94 = var10.field2097;
                                        }
                                    }
                                    if (var10.field2099) {
                                        switch(var10.field2066.field3179) {
                                            case 1:
                                                class220.method3794(var13, var14, var10.field2110, var10.field2086, var10.field2095, var10.field2096, 256 - (var10.field2127 & 0xFF), 256 - (var10.field2146 & 0xFF));
                                                break;
                                            case 2:
                                                class220.method3846(var13, var14, var10.field2110, var10.field2086, var10.field2095, var10.field2096, 256 - (var10.field2127 & 0xFF), 256 - (var10.field2146 & 0xFF));
                                                break;
                                            case 3:
                                                class220.method3840(var13, var14, var10.field2110, var10.field2086, var10.field2095, var10.field2096, 256 - (var10.field2127 & 0xFF), 256 - (var10.field2146 & 0xFF));
                                                break;
                                            case 4:
                                                class220.method3797(var13, var14, var10.field2110, var10.field2086, var10.field2095, var10.field2096, 256 - (var10.field2127 & 0xFF), 256 - (var10.field2146 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class220.method3817(var13, var14, var10.field2110, var10.field2086, var94);
                                                } else {
                                                    class220.method3792(var13, var14, var10.field2110, var10.field2086, var94, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class220.method3799(var13, var14, var10.field2110, var10.field2086, var94);
                                    } else {
                                        class220.method3800(var13, var14, var10.field2110, var10.field2086, var94, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2163 == 4) {
                                    class209 var95 = var10.method2633();
                                    if (var95 != null) {
                                        String var96 = var10.field2186;
                                        int var97;
                                        if (method199(var10)) {
                                            var97 = var10.field2096;
                                            if (Statics.field803 == var10 && var10.field2098 != 0) {
                                                var97 = var10.field2098;
                                            }
                                            if (var10.field2131.length() > 0) {
                                                var96 = var10.field2131;
                                            }
                                        } else {
                                            var97 = var10.field2095;
                                            if (Statics.field803 == var10 && var10.field2097 != 0) {
                                                var97 = var10.field2097;
                                            }
                                        }
                                        if (var10.field2069 && var10.field2105 != -1) {
                                            class199 var98 = class199.method207(var10.field2105);
                                            var96 = var98.field2945;
                                            if (var96 == null) {
                                                var96 = "null";
                                            }
                                            if ((var98.field2961 == 1 || var10.field2196 != 1) && var10.field2196 != -1) {
                                                var96 = class38.method183(16748608) + var96 + class38.field777 + " " + 'x' + method2578(var10.field2196);
                                            }
                                        }
                                        if (field450 == var10) {
                                            class174 var10000 = (class174) null;
                                            var96 = class174.field2394;
                                            var97 = var10.field2095;
                                        }
                                        if (!var10.field2069) {
                                            var96 = method1316(var96, var10);
                                        }
                                        var95.method3676(var96, var13, var14, var10.field2110, var10.field2086, var97, var10.field2174 ? 0 : -1, var10.field2133, var10.field2071, var10.field2087);
                                    } else if (class151.field2068) {
                                        method1487(var10);
                                    }
                                } else if (var10.field2163 == 5) {
                                    if (var10.field2069) {
                                        class225 var100;
                                        if (var10.field2105 == -1) {
                                            var100 = var10.method2632(false);
                                        } else {
                                            var100 = class199.method81(var10.field2105, var10.field2196, var10.field2109, var10.field2083, var10.field2128, false);
                                        }
                                        if (var100 != null) {
                                            int var101 = var100.field3206;
                                            int var102 = var100.field3204;
                                            if (var10.field2108) {
                                                class220.method3814(var13, var14, var10.field2110 + var13, var10.field2086 + var14);
                                                int var103 = (var10.field2110 + (var101 - 1)) / var101;
                                                int var104 = (var10.field2086 + (var102 - 1)) / var102;
                                                for (int var105 = 0; var105 < var103; var105++) {
                                                    for (int var106 = 0; var106 < var104; var106++) {
                                                        if (var10.field2107 != 0) {
                                                            var100.method3959(var101 / 2 + var101 * var105 + var13, var102 / 2 + var102 * var106 + var14, var10.field2107, 4096);
                                                        } else if (var15 == 0) {
                                                            var100.method3914(var101 * var105 + var13, var102 * var106 + var14);
                                                        } else {
                                                            var100.method3920(var101 * var105 + var13, var102 * var106 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class220.method3787(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var107 = var10.field2110 * 4096 / var101;
                                                if (var10.field2107 != 0) {
                                                    var100.method3959(var10.field2110 / 2 + var13, var10.field2086 / 2 + var14, var10.field2107, var107);
                                                } else if (var15 != 0) {
                                                    var100.method3922(var13, var14, var10.field2110, var10.field2086, 256 - (var15 & 0xFF));
                                                } else if (var10.field2110 == var101 && var10.field2086 == var102) {
                                                    var100.method3914(var13, var14);
                                                } else {
                                                    var100.method3988(var13, var14, var10.field2110, var10.field2086);
                                                }
                                            }
                                        } else if (class151.field2068) {
                                            method1487(var10);
                                        }
                                    } else {
                                        class225 var99 = var10.method2632(method199(var10));
                                        if (var99 != null) {
                                            var99.method3914(var13, var14);
                                        } else if (class151.field2068) {
                                            method1487(var10);
                                        }
                                    }
                                } else if (var10.field2163 == 6) {
                                    boolean var108 = method199(var10);
                                    int var109;
                                    if (var108) {
                                        var109 = var10.field2118;
                                    } else {
                                        var109 = var10.field2117;
                                    }
                                    class83 var110 = null;
                                    int var111 = 0;
                                    if (var10.field2105 != -1) {
                                        class199 var112 = class199.method207(var10.field2105);
                                        if (var112 != null) {
                                            class199 var113 = var112.method3472(var10.field2196);
                                            var110 = var113.method3462(1);
                                            if (var110 == null) {
                                                method1487(var10);
                                            } else {
                                                var110.method1494();
                                                var111 = var110.field1535 / 2;
                                            }
                                        }
                                    } else if (var10.field2143 == 5) {
                                        if (var10.field2114 == 0) {
                                            var110 = field416.method2589((class202) null, -1, (class202) null, -1);
                                        } else {
                                            var110 = Statics.field810.method233();
                                        }
                                    } else if (var109 == -1) {
                                        var110 = var10.method2635((class202) null, -1, var108, Statics.field810.field245);
                                        if (var110 == null && class151.field2068) {
                                            method1487(var10);
                                        }
                                    } else {
                                        class202 var114 = class202.method119(var109);
                                        var110 = var10.method2635(var114, var10.field2058, var108, Statics.field810.field245);
                                        if (var110 == null && class151.field2068) {
                                            method1487(var10);
                                        }
                                    }
                                    class85.method1579(var10.field2110 / 2 + var13, var10.field2086 / 2 + var14);
                                    int var115 = var10.field2135 * class85.field1445[var10.field2189] >> 16;
                                    int var116 = var10.field2135 * class85.field1446[var10.field2189] >> 16;
                                    if (var110 != null) {
                                        if (var10.field2069) {
                                            var110.method1494();
                                            if (var10.field2141) {
                                                var110.method1507(0, var10.field2122, var10.field2123, var10.field2189, var10.field2132, var10.field2120 + var111 + var115, var10.field2120 + var116, var10.field2135);
                                            } else {
                                                var110.method1506(0, var10.field2122, var10.field2123, var10.field2189, var10.field2132, var10.field2120 + var111 + var115, var10.field2120 + var116);
                                            }
                                        } else {
                                            var110.method1506(0, var10.field2122, 0, var10.field2189, 0, var115, var116);
                                        }
                                    }
                                    class85.method1641();
                                } else {
                                    if (var10.field2163 == 7) {
                                        class209 var117 = var10.method2633();
                                        if (var117 == null) {
                                            if (class151.field2068) {
                                                method1487(var10);
                                            }
                                            continue;
                                        }
                                        int var118 = 0;
                                        for (int var119 = 0; var119 < var10.field2082; var119++) {
                                            for (int var120 = 0; var120 < var10.field2145; var120++) {
                                                if (var10.field2188[var118] > 0) {
                                                    class199 var121 = class199.method207(var10.field2188[var118] - 1);
                                                    String var122;
                                                    if (var121.field2961 != 1 && var10.field2185[var118] == 1) {
                                                        var122 = class38.method183(16748608) + var121.field2945 + class38.field777;
                                                    } else {
                                                        var122 = class38.method183(16748608) + var121.field2945 + class38.field777 + " " + 'x' + method2578(var10.field2185[var118]);
                                                    }
                                                    int var123 = (var10.field2136 + 115) * var120 + var13;
                                                    int var124 = (var10.field2137 + 12) * var119 + var14;
                                                    if (var10.field2133 == 0) {
                                                        var117.method3675(var122, var123, var124, var10.field2095, var10.field2174 ? 0 : -1);
                                                    } else if (var10.field2133 == 1) {
                                                        var117.method3663(var122, var10.field2110 / 2 + var123, var124, var10.field2095, var10.field2174 ? 0 : -1);
                                                    } else {
                                                        var117.method3688(var122, var10.field2110 + var123 - 1, var124, var10.field2095, var10.field2174 ? 0 : -1);
                                                    }
                                                }
                                                var118++;
                                            }
                                        }
                                    }
                                    if (var10.field2163 == 8 && Statics.field1724 == var10 && field437 == field425) {
                                        int var125 = 0;
                                        int var126 = 0;
                                        class209 var127 = Statics.field46;
                                        String var128 = var10.field2186;
                                        String var129 = method1316(var128, var10);
                                        while (var129.length() > 0) {
                                            int var130 = var129.indexOf(class38.field780);
                                            String var131;
                                            if (var130 == -1) {
                                                var131 = var129;
                                                var129 = "";
                                            } else {
                                                var131 = var129.substring(0, var130);
                                                var129 = var129.substring(var130 + 4);
                                            }
                                            int var132 = var127.method3668(var131);
                                            if (var132 > var125) {
                                                var125 = var132;
                                            }
                                            var126 += var127.field3092 + 1;
                                        }
                                        var125 += 6;
                                        var126 += 7;
                                        int var133 = var10.field2110 + var13 - 5 - var125;
                                        int var134 = var10.field2086 + var14 + 5;
                                        if (var133 < var13 + 5) {
                                            var133 = var13 + 5;
                                        }
                                        if (var125 + var133 > arg4) {
                                            var133 = arg4 - var125;
                                        }
                                        if (var126 + var134 > arg5) {
                                            var134 = arg5 - var126;
                                        }
                                        class220.method3817(var133, var134, var125, var126, 16777120);
                                        class220.method3799(var133, var134, var125, var126, 0);
                                        String var135 = var10.field2186;
                                        int var136 = var127.field3092 + var134 + 2;
                                        String var137 = method1316(var135, var10);
                                        while (var137.length() > 0) {
                                            int var138 = var137.indexOf(class38.field780);
                                            String var139;
                                            if (var138 == -1) {
                                                var139 = var137;
                                                var137 = "";
                                            } else {
                                                var139 = var137.substring(0, var138);
                                                var137 = var137.substring(var138 + 4);
                                            }
                                            var127.method3675(var139, var133 + 3, var136, 0, -1);
                                            var136 += var127.field3092 + 1;
                                        }
                                    }
                                    if (var10.field2163 == 9) {
                                        if (var10.field2103 == 1) {
                                            int var140;
                                            int var141;
                                            int var142;
                                            int var143;
                                            if (var10.field2104) {
                                                var140 = var13;
                                                var141 = var10.field2086 + var14;
                                                var142 = var10.field2110 + var13;
                                                var143 = var14;
                                            } else {
                                                var140 = var13;
                                                var141 = var14;
                                                var142 = var10.field2110 + var13;
                                                var143 = var10.field2086 + var14;
                                            }
                                            class220.method3805(var140, var141, var142, var143, var10.field2095);
                                        } else {
                                            int var144 = var10.field2110 >= 0 ? var10.field2110 : -var10.field2110;
                                            int var145 = var10.field2086 >= 0 ? var10.field2086 : -var10.field2086;
                                            int var146 = var144;
                                            if (var144 < var145) {
                                                var146 = var145;
                                            }
                                            if (var146 != 0) {
                                                int var147 = (var10.field2110 << 16) / var146;
                                                int var148 = (var10.field2086 << 16) / var146;
                                                if (var148 <= var147) {
                                                    var147 = -var147;
                                                } else {
                                                    var148 = -var148;
                                                }
                                                int var149 = var10.field2103 * var148 >> 17;
                                                int var150 = var10.field2103 * var148 + 1 >> 17;
                                                int var151 = var10.field2103 * var147 >> 17;
                                                int var152 = var10.field2103 * var147 + 1 >> 17;
                                                int var153 = var13 + var149;
                                                int var154 = var13 - var150;
                                                int var155 = var10.field2110 + var13 - var150;
                                                int var156 = var10.field2110 + var13 + var149;
                                                int var157 = var14 + var151;
                                                int var158 = var14 - var152;
                                                int var159 = var10.field2086 + var14 - var152;
                                                int var160 = var10.field2086 + var14 + var151;
                                                class85.method1584(var153, var154, var155);
                                                class85.method1613(var157, var158, var159, var153, var154, var155, var10.field2095);
                                                class85.method1584(var153, var155, var156);
                                                class85.method1613(var157, var159, var160, var153, var155, var156, var10.field2095);
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

    @ObfuscatedName("bq.cr(Ljava/lang/String;Leu;I)Ljava/lang/String;")
    public static String method1316(String arg0, class151 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method861(method2683(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field773 != null) {
                    var5 = class208.method2558(Statics.field773.field1660);
                    if (Statics.field773.field1664 != null) {
                        var5 = (String) Statics.field773.field1664;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("ek.cv(IS)Ljava/lang/String;")
    public static final String method2578(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class38.field775 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class38.method183(65408) + var1.substring(0, var1.length() - 8) + class174.field2528 + " " + class38.field774 + var1 + class38.field787 + class38.field777;
        } else if (var1.length() > 6) {
            return " " + class38.method183(16777215) + var1.substring(0, var1.length() - 4) + class174.field2530 + " " + class38.field774 + var1 + class38.field787 + class38.field777;
        } else {
            return " " + class38.method183(16776960) + var1 + class38.field777;
        }
    }

    @ObfuscatedName("m.cm(Leu;B)V")
    public static void method33(class151 arg0) {
        class151 var1 = arg0.field2089 == -1 ? null : class151.method80(arg0.field2089);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field170;
            var3 = Statics.field1104;
        } else {
            var2 = var1.field2110;
            var3 = var1.field2086;
        }
        method1889(arg0, var2, var3, false);
        method749(arg0, var2, var3);
    }

    @ObfuscatedName("fp.cl([Leu;Leu;ZI)V")
    public static void method3089(class151[] arg0, class151 arg1, boolean arg2) {
        int var3 = arg1.field2093 == 0 ? arg1.field2110 : arg1.field2093;
        int var4 = arg1.field2094 == 0 ? arg1.field2086 : arg1.field2094;
        method1830(arg0, arg1.field2070, var3, var4, arg2);
        if (arg1.field2194 != null) {
            method1830(arg1.field2194, arg1.field2070, var3, var4, arg2);
        }
        class18 var5 = (class18) field447.method2229((long) arg1.field2070);
        if (var5 != null) {
            method1861(var5.field180, var3, var4, arg2);
        }
        if (arg1.field2074 == 1337) {
        }
    }

    @ObfuscatedName("cx.co(IIIZI)V")
    public static final void method1861(int arg0, int arg1, int arg2, boolean arg3) {
        if (class151.method1075(arg0)) {
            method1830(Statics.field2173[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("cj.ct([Leu;IIIZI)V")
    public static void method1830(class151[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class151 var6 = arg0[var5];
            if (var6 != null && var6.field2089 == arg1) {
                method1889(var6, arg2, arg3, arg4);
                method749(var6, arg2, arg3);
                if (var6.field2166 > var6.field2093 - var6.field2110) {
                    var6.field2166 = var6.field2093 - var6.field2110;
                }
                if (var6.field2166 < 0) {
                    var6.field2166 = 0;
                }
                if (var6.field2092 > var6.field2094 - var6.field2086) {
                    var6.field2092 = var6.field2094 - var6.field2086;
                }
                if (var6.field2092 < 0) {
                    var6.field2092 = 0;
                }
                if (var6.field2163 == 0) {
                    method3089(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ci.cf(Leu;IIZI)V")
    public static void method1889(class151 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2110;
        int var5 = arg0.field2086;
        if (arg0.field2077 == 0) {
            arg0.field2110 = arg0.field2145;
        } else if (arg0.field2077 == 1) {
            arg0.field2110 = arg1 - arg0.field2145;
        } else if (arg0.field2077 == 2) {
            arg0.field2110 = arg0.field2145 * arg1 >> 14;
        }
        if (arg0.field2078 == 0) {
            arg0.field2086 = arg0.field2082;
        } else if (arg0.field2078 == 1) {
            arg0.field2086 = arg2 - arg0.field2082;
        } else if (arg0.field2078 == 2) {
            arg0.field2086 = arg0.field2082 * arg2 >> 14;
        }
        if (arg0.field2077 == 4) {
            arg0.field2110 = arg0.field2086 * arg0.field2062 / arg0.field2139;
        }
        if (arg0.field2078 == 4) {
            arg0.field2086 = arg0.field2139 * arg0.field2110 / arg0.field2062;
        }
        if (field456 && arg0.field2163 == 0) {
            if (arg0.field2086 < 5 && arg0.field2110 < 5) {
                arg0.field2086 = 5;
                arg0.field2110 = 5;
            } else {
                if (arg0.field2086 <= 0) {
                    arg0.field2086 = 5;
                }
                if (arg0.field2110 <= 0) {
                    arg0.field2110 = 5;
                }
            }
        }
        if (arg0.field2074 == 1337) {
            field458 = arg0;
        }
        if (arg3 && arg0.field2101 != null && (arg0.field2110 != var4 || arg0.field2086 != var5)) {
            class19 var6 = new class19();
            var6.field193 = arg0;
            var6.field197 = arg0.field2101;
            field485.method2278(var6);
        }
    }

    @ObfuscatedName("ap.cx(Leu;III)V")
    public static void method749(class151 arg0, int arg1, int arg2) {
        if (arg0.field2075 == 0) {
            arg0.field2100 = arg0.field2079;
        } else if (arg0.field2075 == 1) {
            arg0.field2100 = (arg1 - arg0.field2110) / 2 + arg0.field2079;
        } else if (arg0.field2075 == 2) {
            arg0.field2100 = arg1 - arg0.field2110 - arg0.field2079;
        } else if (arg0.field2075 == 3) {
            arg0.field2100 = arg0.field2079 * arg1 >> 14;
        } else if (arg0.field2075 == 4) {
            arg0.field2100 = (arg0.field2079 * arg1 >> 14) + (arg1 - arg0.field2110) / 2;
        } else {
            arg0.field2100 = arg1 - arg0.field2110 - (arg0.field2079 * arg1 >> 14);
        }
        if (arg0.field2076 == 0) {
            arg0.field2084 = arg0.field2088;
        } else if (arg0.field2076 == 1) {
            arg0.field2084 = (arg2 - arg0.field2086) / 2 + arg0.field2088;
        } else if (arg0.field2076 == 2) {
            arg0.field2084 = arg2 - arg0.field2086 - arg0.field2088;
        } else if (arg0.field2076 == 3) {
            arg0.field2084 = arg0.field2088 * arg2 >> 14;
        } else if (arg0.field2076 == 4) {
            arg0.field2084 = (arg0.field2088 * arg2 >> 14) + (arg2 - arg0.field2086) / 2;
        } else {
            arg0.field2084 = arg2 - arg0.field2086 - (arg0.field2088 * arg2 >> 14);
        }
        if (!field456 || arg0.field2163 != 0) {
            return;
        }
        if (arg0.field2100 < 0) {
            arg0.field2100 = 0;
        } else if (arg0.field2110 + arg0.field2100 > arg1) {
            arg0.field2100 = arg1 - arg0.field2110;
        }
        if (arg0.field2084 < 0) {
            arg0.field2084 = 0;
        } else if (arg0.field2086 + arg0.field2084 > arg2) {
            arg0.field2084 = arg2 - arg0.field2086;
        }
    }

    @ObfuscatedName("ak.cn(II)Ljava/lang/String;")
    public static final String method861(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("s.ci(Leu;I)Z")
    public static final boolean method199(class151 arg0) {
        if (arg0.field2182 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2182.length; var1++) {
            int var2 = method2683(arg0, var1);
            int var3 = arg0.field2184[var1];
            if (arg0.field2182[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2182[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2182[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("eu.de(Leu;IB)I")
    public static final int method2683(class151 arg0, int arg1) {
        if (arg0.field2170 == null || arg1 >= arg0.field2170.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2170[arg1];
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
                    var7 = field545[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class151 var11 = class151.method80(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class199.method207(var12).field2963 || field440)) {
                        for (int var13 = 0; var13 < var11.field2188.length; var13++) {
                            if (var12 + 1 == var11.field2188[var13]) {
                                var7 += var11.field2185[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class147.field2032[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class173.field2363[field424[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class147.field2032[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field810.field249;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class173.field2365[var14]) {
                            var7 += field424[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class151 var17 = class151.method80(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class199.method207(var18).field2963 || field440)) {
                        for (int var19 = 0; var19 < var17.field2188.length; var19++) {
                            if (var18 + 1 == var17.field2188[var19]) {
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
                    int var20 = class147.field2032[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class147.method748(var22);
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
                    var7 = (Statics.field810.field648 >> 7) + Statics.field171;
                }
                if (var6 == 19) {
                    var7 = (Statics.field810.field597 >> 7) + Statics.field464;
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

    @ObfuscatedName("cv.df(Leu;III)V")
    public static final void method1835(class151 arg0, int arg1, int arg2) {
        if (arg0.field2073 == 1) {
            method3029(arg0.field2187, "", 24, 0, 0, arg0.field2070);
        }
        if (arg0.field2073 == 2 && !field441) {
            String var3;
            if (class152.method1099(method3219(arg0)) == 0) {
                var3 = null;
            } else if (arg0.field2149 == null || arg0.field2149.trim().length() == 0) {
                var3 = null;
            } else {
                var3 = arg0.field2149;
            }
            if (var3 != null) {
                method3029(var3, class38.method183(65280) + arg0.field2134, 25, 0, -1, arg0.field2070);
            }
        }
        if (arg0.field2073 == 3) {
            method3029(class174.field2526, "", 26, 0, 0, arg0.field2070);
        }
        if (arg0.field2073 == 4) {
            method3029(arg0.field2187, "", 28, 0, 0, arg0.field2070);
        }
        if (arg0.field2073 == 5) {
            method3029(arg0.field2187, "", 29, 0, 0, arg0.field2070);
        }
        if (arg0.field2073 == 6 && field450 == null) {
            method3029(arg0.field2187, "", 30, 0, -1, arg0.field2070);
        }
        if (arg0.field2163 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2086; var6++) {
                for (int var7 = 0; var7 < arg0.field2110; var7++) {
                    int var8 = (arg0.field2136 + 32) * var7;
                    int var9 = (arg0.field2137 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field2138[var5];
                        var9 += arg0.field2130[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && arg1 < var8 + 32 && arg2 < var9 + 32) {
                        field405 = var5;
                        Statics.field1604 = arg0;
                        if (arg0.field2188[var5] > 0) {
                            class199 var10 = class199.method207(arg0.field2188[var5] - 1);
                            if (field439 == 1 && class152.method1987(method3219(arg0))) {
                                if (Statics.field2239 != arg0.field2070 || Statics.field1449 != var5) {
                                    method3029(class174.field2517, field372 + " " + class38.field779 + " " + class38.method183(16748608) + var10.field2945, 31, var10.field2948, var5, arg0.field2070);
                                }
                            } else if (!field441 || !class152.method1987(method3219(arg0))) {
                                String[] var11 = var10.field2965;
                                if (field347) {
                                    var11 = method3614(var11);
                                }
                                if (class152.method1987(method3219(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 36;
                                            } else {
                                                var13 = 37;
                                            }
                                            method3029(var11[var12], class38.method183(16748608) + var10.field2945, var13, var10.field2948, var5, arg0.field2070);
                                        } else if (var12 == 4) {
                                            method3029(class174.field2503, class38.method183(16748608) + var10.field2945, 37, var10.field2948, var5, arg0.field2070);
                                        }
                                    }
                                }
                                int var14 = method3219(arg0);
                                boolean var15 = (var14 >> 31 & 0x1) != 0;
                                if (var15) {
                                    method3029(class174.field2517, class38.method183(16748608) + var10.field2945, 38, var10.field2948, var5, arg0.field2070);
                                }
                                class152 var10000 = (class152) null;
                                if (class152.method1987(method3219(arg0)) && var11 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var11[var16] != null) {
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
                                            method3029(var11[var16], class38.method183(16748608) + var10.field2945, var17, var10.field2948, var5, arg0.field2070);
                                        }
                                    }
                                }
                                String[] var18 = arg0.field2081;
                                if (field347) {
                                    var18 = method3614(var18);
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
                                            method3029(var18[var19], class38.method183(16748608) + var10.field2945, var20, var10.field2948, var5, arg0.field2070);
                                        }
                                    }
                                }
                                method3029(class174.field2518, class38.method183(16748608) + var10.field2945, 1005, var10.field2948, var5, arg0.field2070);
                            } else if ((Statics.field1921 & 0x10) == 16) {
                                method3029(field298, field445 + " " + class38.field779 + " " + class38.method183(16748608) + var10.field2945, 32, var10.field2948, var5, arg0.field2070);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field2069) {
            return;
        }
        if (!field441) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var22 = method191(arg0, var21);
                if (var22 != null) {
                    method3029(var22, arg0.field2151, 1007, var21 + 1, arg0.field2124, arg0.field2070);
                }
            }
            String var23;
            if (class152.method1099(method3219(arg0)) == 0) {
                var23 = null;
            } else if (arg0.field2149 == null || arg0.field2149.trim().length() == 0) {
                var23 = null;
            } else {
                var23 = arg0.field2149;
            }
            if (var23 != null) {
                method3029(var23, arg0.field2151, 25, 0, arg0.field2124, arg0.field2070);
            }
            for (int var25 = 4; var25 >= 0; var25--) {
                String var26 = method191(arg0, var25);
                if (var26 != null) {
                    method3029(var26, arg0.field2151, 57, var25 + 1, arg0.field2124, arg0.field2070);
                }
            }
            int var27 = method3219(arg0);
            boolean var28 = (var27 & 0x1) != 0;
            if (var28) {
                method3029(class174.field2375, "", 30, 0, arg0.field2124, arg0.field2070);
            }
        } else if (class152.method2618(method3219(arg0)) && (Statics.field1921 & 0x20) == 32) {
            method3029(field298, field445 + " " + class38.field779 + " " + arg0.field2151, 58, 0, arg0.field2124, arg0.field2070);
        }
    }

    @ObfuscatedName("ck.dj([Leu;IIIIIIII)V")
    public static final void method1480(class151[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class151 var9 = arg0[var8];
            if (var9 != null && (!var9.field2069 || var9.field2163 == 0 || var9.field2150 || method3219(var9) != 0 || field341 == var9 || var9.field2074 == 1338) && var9.field2089 == arg1 && (!var9.field2069 || !method707(var9))) {
                int var10 = var9.field2100 + arg6;
                int var11 = var9.field2084 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2163 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2163 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2110 + var10;
                    int var19 = var9.field2086 + var11;
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
                    int var22 = var9.field2110 + var10;
                    int var23 = var9.field2086 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field384 == var9) {
                    field467 = true;
                    field468 = var10;
                    field418 = var11;
                }
                if (!var9.field2069 || var12 < var14 && var13 < var15) {
                    int var24 = class116.field1812;
                    int var25 = class116.field1811 * 853340747;
                    if (class116.field1809 != 0) {
                        var24 = class116.field1810;
                        var25 = class116.field1807;
                    }
                    if (var9.field2074 == 1337) {
                        if (!field281 && !field427 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field439 == 0 && !field441) {
                                method3029(class174.field2617, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class83.field1408; var28++) {
                                int var29 = class83.field1383[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field2244.method1791(Statics.field2326, var30, var31, var29) >= 0) {
                                        class198 var34 = class198.method197(var33);
                                        if (var34.field2918 != null) {
                                            var34 = var34.method3415();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field439 == 1) {
                                            method3029(class174.field2517, field372 + " " + class38.field779 + " " + class38.method183(65535) + var34.field2902, 1, var29, var30, var31);
                                        } else if (!field441) {
                                            String[] var35 = var34.field2895;
                                            if (field347) {
                                                var35 = method3614(var35);
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
                                                        method3029(var35[var36], class38.method183(65535) + var34.field2902, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method3029(class174.field2518, class38.method183(65535) + var34.field2902, 1002, var34.field2919 << 14, var30, var31);
                                        } else if ((Statics.field1921 & 0x4) == 4) {
                                            method3029(field298, field445 + " " + class38.field779 + " " + class38.method183(65535) + var34.field2902, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class36 var38 = field461[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field757.field3010 == 1 && (var38.field648 & 0x7F) == 64 && (var38.field597 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field327; var39++) {
                                                class36 var40 = field461[field560[var39]];
                                                if (var40 != null && var38 != var40 && var40.field757.field3010 == 1 && var38.field648 == var40.field648 && var38.field597 == var40.field597) {
                                                    method680(var40.field757, field560[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class46.field898;
                                            int[] var42 = class46.field903;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class24 var44 = field409[var42[var43]];
                                                if (var44 != null && var38.field648 == var44.field648 && var38.field597 == var44.field597) {
                                                    method867(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method680(var38.field757, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class24 var45 = field409[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field648 & 0x7F) == 64 && (var45.field597 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field327; var46++) {
                                                class36 var47 = field461[field560[var46]];
                                                if (var47 != null && var47.field757.field3010 == 1 && var45.field648 == var47.field648 && var45.field597 == var47.field597) {
                                                    method680(var47.field757, field560[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class46.field898;
                                            int[] var49 = class46.field903;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class24 var51 = field409[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field648 == var51.field648 && var45.field597 == var51.field597) {
                                                    method867(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field526 == var33) {
                                            var26 = var29;
                                        } else {
                                            method867(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class129 var52 = field419[Statics.field2326][var30][var31];
                                        if (var52 != null) {
                                            for (class44 var53 = (class44) var52.method2284(); var53 != null; var53 = (class44) var52.method2286()) {
                                                class199 var54 = class199.method207(var53.field890);
                                                if (field439 == 1) {
                                                    method3029(class174.field2517, field372 + " " + class38.field779 + " " + class38.method183(16748608) + var54.field2945, 16, var53.field890, var30, var31);
                                                } else if (!field441) {
                                                    String[] var55 = var54.field2964;
                                                    if (field347) {
                                                        var55 = method3614(var55);
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
                                                            method3029(var55[var56], class38.method183(16748608) + var54.field2945, var57, var53.field890, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method3029(class174.field2370, class38.method183(16748608) + var54.field2945, 20, var53.field890, var30, var31);
                                                        }
                                                    }
                                                    method3029(class174.field2518, class38.method183(16748608) + var54.field2945, 1004, var53.field890, var30, var31);
                                                } else if ((Statics.field1921 & 0x1) == 1) {
                                                    method3029(field298, field445 + " " + class38.field779 + " " + class38.method183(16748608) + var54.field2945, 17, var53.field890, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class24 var60 = field409[field526];
                                method867(var60, field526, var58, var59);
                            }
                        }
                    } else if (var9.field2074 == 1338) {
                        method2747(var9, var10, var11);
                    } else {
                        if (!field427 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method1835(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2163 == 0) {
                            if (!var9.field2069 && method707(var9) && Statics.field803 != var9) {
                                continue;
                            }
                            method1480(arg0, var9.field2070, var12, var13, var14, var15, var10 - var9.field2166, var11 - var9.field2092);
                            if (var9.field2194 != null) {
                                method1480(var9.field2194, var9.field2070, var12, var13, var14, var15, var10 - var9.field2166, var11 - var9.field2092);
                            }
                            class18 var61 = (class18) field447.method2229((long) var9.field2070);
                            if (var61 != null) {
                                if (var61.field175 == 0 && class116.field1812 >= var12 && class116.field1811 * 853340747 >= var13 && class116.field1812 < var14 && class116.field1811 * 853340747 < var15 && !field427 && !field456) {
                                    for (class19 var62 = (class19) field485.method2290(); var62 != null; var62 = (class19) field485.method2285()) {
                                        if (var62.field183) {
                                            var62.method2273();
                                            var62.field193.field2195 = false;
                                        }
                                    }
                                    if (Statics.field1290 == 0) {
                                        field384 = null;
                                        field341 = null;
                                    }
                                    if (!field427) {
                                        field433[0] = class174.field2606;
                                        field358[0] = "";
                                        field431[0] = 1006;
                                        field428 = 1;
                                    }
                                }
                                int var63 = var61.field180;
                                if (class151.method1075(var63)) {
                                    method1480(Statics.field2173[var63], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2069) {
                            if (var9.field2203) {
                                if (class116.field1812 >= var12 && class116.field1811 * 853340747 >= var13 && class116.field1812 < var14 && class116.field1811 * 853340747 < var15) {
                                    for (class19 var64 = (class19) field485.method2290(); var64 != null; var64 = (class19) field485.method2285()) {
                                        if (var64.field183) {
                                            var64.method2273();
                                            var64.field193.field2195 = false;
                                        }
                                    }
                                    if (Statics.field1290 == 0) {
                                        field384 = null;
                                        field341 = null;
                                    }
                                    if (!field427) {
                                        field433[0] = class174.field2606;
                                        field358[0] = "";
                                        field431[0] = 1006;
                                        field428 = 1;
                                    }
                                }
                            } else if (var9.field2204 && class116.field1812 >= var12 && class116.field1811 * 853340747 >= var13 && class116.field1812 < var14 && class116.field1811 * 853340747 < var15) {
                                for (class19 var65 = (class19) field485.method2290(); var65 != null; var65 = (class19) field485.method2285()) {
                                    if (var65.field183 && var65.field193.field2171 == var65.field197) {
                                        var65.method2273();
                                    }
                                }
                            }
                            boolean var66;
                            if (class116.field1812 >= var12 && class116.field1811 * 853340747 >= var13 && class116.field1812 < var14 && class116.field1811 * 853340747 < var15) {
                                var66 = true;
                            } else {
                                var66 = false;
                            }
                            boolean var67 = false;
                            if ((class116.field1802 == 1 || !Statics.field230 && class116.field1802 == 4) && var66) {
                                var67 = true;
                            }
                            boolean var68 = false;
                            if ((class116.field1809 == 1 || !Statics.field230 && class116.field1809 == 4) && class116.field1810 >= var12 && class116.field1807 >= var13 && class116.field1810 < var14 && class116.field1807 < var15) {
                                var68 = true;
                            }
                            if (var68) {
                                method1959(var9, class116.field1810 - var10, class116.field1807 - var11);
                            }
                            if (field384 != null && field384 != var9 && var66) {
                                int var69 = method3219(var9);
                                boolean var70 = (var69 >> 20 & 0x1) != 0;
                                if (var70) {
                                    field364 = var9;
                                }
                            }
                            if (field341 == var9) {
                                field463 = true;
                                field465 = var10;
                                field466 = var11;
                            }
                            if (var9.field2150) {
                                if (var66 && field484 != 0 && var9.field2171 != null) {
                                    class19 var71 = new class19();
                                    var71.field183 = true;
                                    var71.field193 = var9;
                                    var71.field186 = field484;
                                    var71.field197 = var9.field2171;
                                    field485.method2278(var71);
                                }
                                if (field384 != null || Statics.field2314 != null || field427) {
                                    var68 = false;
                                    var67 = false;
                                    var66 = false;
                                }
                                if (!var9.field2129 && var68) {
                                    var9.field2129 = true;
                                    if (var9.field2152 != null) {
                                        class19 var72 = new class19();
                                        var72.field183 = true;
                                        var72.field193 = var9;
                                        var72.field185 = class116.field1810 - var10;
                                        var72.field186 = class116.field1807 - var11;
                                        var72.field197 = var9.field2152;
                                        field485.method2278(var72);
                                    }
                                }
                                if (var9.field2129 && var67 && var9.field2153 != null) {
                                    class19 var73 = new class19();
                                    var73.field183 = true;
                                    var73.field193 = var9;
                                    var73.field185 = class116.field1812 - var10;
                                    var73.field186 = class116.field1811 * 853340747 - var11;
                                    var73.field197 = var9.field2153;
                                    field485.method2278(var73);
                                }
                                if (var9.field2129 && !var67) {
                                    var9.field2129 = false;
                                    if (var9.field2154 != null) {
                                        class19 var74 = new class19();
                                        var74.field183 = true;
                                        var74.field193 = var9;
                                        var74.field185 = class116.field1812 - var10;
                                        var74.field186 = class116.field1811 * 853340747 - var11;
                                        var74.field197 = var9.field2154;
                                        field570.method2278(var74);
                                    }
                                }
                                if (var67 && var9.field2155 != null) {
                                    class19 var75 = new class19();
                                    var75.field183 = true;
                                    var75.field193 = var9;
                                    var75.field185 = class116.field1812 - var10;
                                    var75.field186 = class116.field1811 * 853340747 - var11;
                                    var75.field197 = var9.field2155;
                                    field485.method2278(var75);
                                }
                                if (!var9.field2195 && var66) {
                                    var9.field2195 = true;
                                    if (var9.field2156 != null) {
                                        class19 var76 = new class19();
                                        var76.field183 = true;
                                        var76.field193 = var9;
                                        var76.field185 = class116.field1812 - var10;
                                        var76.field186 = class116.field1811 * 853340747 - var11;
                                        var76.field197 = var9.field2156;
                                        field485.method2278(var76);
                                    }
                                }
                                if (var9.field2195 && var66 && var9.field2157 != null) {
                                    class19 var77 = new class19();
                                    var77.field183 = true;
                                    var77.field193 = var9;
                                    var77.field185 = class116.field1812 - var10;
                                    var77.field186 = class116.field1811 * 853340747 - var11;
                                    var77.field197 = var9.field2157;
                                    field485.method2278(var77);
                                }
                                if (var9.field2195 && !var66) {
                                    var9.field2195 = false;
                                    if (var9.field2158 != null) {
                                        class19 var78 = new class19();
                                        var78.field183 = true;
                                        var78.field193 = var9;
                                        var78.field185 = class116.field1812 - var10;
                                        var78.field186 = class116.field1811 * 853340747 - var11;
                                        var78.field197 = var9.field2158;
                                        field570.method2278(var78);
                                    }
                                }
                                if (var9.field2169 != null) {
                                    class19 var79 = new class19();
                                    var79.field193 = var9;
                                    var79.field197 = var9.field2169;
                                    field486.method2278(var79);
                                }
                                if (var9.field2190 != null && field473 > var9.field2198) {
                                    if (var9.field2080 == null || field473 - var9.field2198 > 32) {
                                        class19 var84 = new class19();
                                        var84.field193 = var9;
                                        var84.field197 = var9.field2190;
                                        field485.method2278(var84);
                                    } else {
                                        label832: for (int var80 = var9.field2198; var80 < field473; var80++) {
                                            int var81 = field401[var80 & 0x1F];
                                            for (int var82 = 0; var82 < var9.field2080.length; var82++) {
                                                if (var9.field2080[var82] == var81) {
                                                    class19 var83 = new class19();
                                                    var83.field193 = var9;
                                                    var83.field197 = var9.field2190;
                                                    field485.method2278(var83);
                                                    break label832;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2198 = field473;
                                }
                                if (var9.field2165 != null && field469 > var9.field2199) {
                                    if (var9.field2144 == null || field469 - var9.field2199 > 32) {
                                        class19 var89 = new class19();
                                        var89.field193 = var9;
                                        var89.field197 = var9.field2165;
                                        field485.method2278(var89);
                                    } else {
                                        label808: for (int var85 = var9.field2199; var85 < field469; var85++) {
                                            int var86 = field474[var85 & 0x1F];
                                            for (int var87 = 0; var87 < var9.field2144.length; var87++) {
                                                if (var9.field2144[var87] == var86) {
                                                    class19 var88 = new class19();
                                                    var88.field193 = var9;
                                                    var88.field197 = var9.field2165;
                                                    field485.method2278(var88);
                                                    break label808;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2199 = field469;
                                }
                                if (var9.field2167 != null && field477 > var9.field2200) {
                                    if (var9.field2090 == null || field477 - var9.field2200 > 32) {
                                        class19 var94 = new class19();
                                        var94.field193 = var9;
                                        var94.field197 = var9.field2167;
                                        field485.method2278(var94);
                                    } else {
                                        label784: for (int var90 = var9.field2200; var90 < field477; var90++) {
                                            int var91 = field476[var90 & 0x1F];
                                            for (int var92 = 0; var92 < var9.field2090.length; var92++) {
                                                if (var9.field2090[var92] == var91) {
                                                    class19 var93 = new class19();
                                                    var93.field193 = var9;
                                                    var93.field197 = var9.field2167;
                                                    field485.method2278(var93);
                                                    break label784;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2200 = field477;
                                }
                                if (field478 > var9.field2197 && var9.field2172 != null) {
                                    class19 var95 = new class19();
                                    var95.field193 = var9;
                                    var95.field197 = var9.field2172;
                                    field485.method2278(var95);
                                }
                                if (field389 > var9.field2197 && var9.field2168 != null) {
                                    class19 var96 = new class19();
                                    var96.field193 = var9;
                                    var96.field197 = var9.field2168;
                                    field485.method2278(var96);
                                }
                                if (field480 > var9.field2197 && var9.field2175 != null) {
                                    class19 var97 = new class19();
                                    var97.field193 = var9;
                                    var97.field197 = var9.field2175;
                                    field485.method2278(var97);
                                }
                                if (field481 > var9.field2197 && var9.field2106 != null) {
                                    class19 var98 = new class19();
                                    var98.field193 = var9;
                                    var98.field197 = var9.field2106;
                                    field485.method2278(var98);
                                }
                                if (field482 > var9.field2197 && var9.field2181 != null) {
                                    class19 var99 = new class19();
                                    var99.field193 = var9;
                                    var99.field197 = var9.field2181;
                                    field485.method2278(var99);
                                }
                                if (field380 > var9.field2197 && var9.field2176 != null) {
                                    class19 var100 = new class19();
                                    var100.field193 = var9;
                                    var100.field197 = var9.field2176;
                                    field485.method2278(var100);
                                }
                                var9.field2197 = field471;
                                if (var9.field2183 != null) {
                                    for (int var101 = 0; var101 < field509; var101++) {
                                        class19 var102 = new class19();
                                        var102.field193 = var9;
                                        var102.field189 = field353[var101];
                                        var102.field190 = field475[var101];
                                        var102.field197 = var9.field2183;
                                        field485.method2278(var102);
                                    }
                                }
                            }
                        }
                        if (!var9.field2069 && field384 == null && Statics.field2314 == null && !field427) {
                            if ((var9.field2121 >= 0 || var9.field2097 != 0) && class116.field1812 >= var12 && class116.field1811 * 853340747 >= var13 && class116.field1812 < var14 && class116.field1811 * 853340747 < var15) {
                                if (var9.field2121 >= 0) {
                                    Statics.field803 = arg0[var9.field2121];
                                } else {
                                    Statics.field803 = var9;
                                }
                            }
                            if (var9.field2163 == 8 && class116.field1812 >= var12 && class116.field1811 * 853340747 >= var13 && class116.field1812 < var14 && class116.field1811 * 853340747 < var15) {
                                Statics.field1724 = var9;
                            }
                            if (var9.field2094 > var9.field2086) {
                                int var103 = var9.field2110 + var10;
                                int var104 = var9.field2086;
                                int var105 = var9.field2094;
                                int var106 = class116.field1812;
                                int var107 = class116.field1811 * 853340747;
                                if (field326) {
                                    field370 = 32;
                                } else {
                                    field370 = 0;
                                }
                                field326 = false;
                                if (class116.field1802 == 1 || !Statics.field230 && class116.field1802 == 4) {
                                    if (var106 >= var103 && var106 < var103 + 16 && var107 >= var11 && var107 < var11 + 16) {
                                        var9.field2092 -= 4;
                                        method1487(var9);
                                    } else if (var106 >= var103 && var106 < var103 + 16 && var107 >= var11 + var104 - 16 && var107 < var11 + var104) {
                                        var9.field2092 += 4;
                                        method1487(var9);
                                    } else if (var106 >= var103 - field370 && var106 < field370 + var103 + 16 && var107 >= var11 + 16 && var107 < var11 + var104 - 16) {
                                        int var108 = (var104 - 32) * var104 / var105;
                                        if (var108 < 8) {
                                            var108 = 8;
                                        }
                                        int var109 = var107 - var11 - 16 - var108 / 2;
                                        int var110 = var104 - 32 - var108;
                                        var9.field2092 = (var105 - var104) * var109 / var110;
                                        method1487(var9);
                                        field326 = true;
                                    }
                                }
                                if (field484 != 0) {
                                    int var111 = var9.field2110;
                                    if (var106 >= var103 - var111 && var107 >= var11 && var106 < var103 + 16 && var107 <= var11 + var104) {
                                        var9.field2092 += field484 * 45;
                                        method1487(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("y.da(III)V")
    public static final void method182(int arg0, int arg1) {
        if (class151.method1075(arg0)) {
            method192(Statics.field2173[arg0], arg1);
        }
    }

    @ObfuscatedName("f.dt([Leu;IB)V")
    public static final void method192(class151[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class151 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2163 == 0) {
                    if (var3.field2194 != null) {
                        method192(var3.field2194, arg1);
                    }
                    class18 var4 = (class18) field447.method2229((long) var3.field2070);
                    if (var4 != null) {
                        method182(var4.field180, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2177 != null) {
                    class19 var5 = new class19();
                    var5.field193 = var3;
                    var5.field197 = var3.field2177;
                    class33.method3007(var5, 200000);
                }
                if (arg1 == 1 && var3.field2178 != null) {
                    if (var3.field2124 >= 0) {
                        class151 var6 = class151.method80(var3.field2070);
                        if (var6 == null || var6.field2194 == null || var3.field2124 >= var6.field2194.length || var6.field2194[var3.field2124] != var3) {
                            continue;
                        }
                    }
                    class19 var7 = new class19();
                    var7.field193 = var3;
                    var7.field197 = var3.field2178;
                    class33.method3007(var7, 200000);
                }
            }
        }
    }

    @ObfuscatedName("dt.dw(Leu;IIB)V")
    public static final void method1959(class151 arg0, int arg1, int arg2) {
        if (field384 != null || field427 || arg0 == null) {
            return;
        }
        class151 var3 = arg0;
        int var4 = class152.method3342(method3219(arg0));
        class151 var5;
        if (var4 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var3;
                    break;
                }
                var3 = class151.method80(var3.field2089);
                if (var3 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class151 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2091;
        }
        if (var7 == null) {
            return;
        }
        field384 = arg0;
        class151 var9 = arg0;
        int var10 = class152.method3342(method3219(arg0));
        class151 var11;
        if (var10 == 0) {
            var11 = null;
        } else {
            int var12 = 0;
            while (true) {
                if (var12 >= var10) {
                    var11 = var9;
                    break;
                }
                var9 = class151.method80(var9.field2089);
                if (var9 == null) {
                    var11 = null;
                    break;
                }
                var12++;
            }
        }
        class151 var13 = var11;
        if (var11 == null) {
            var13 = arg0.field2091;
        }
        field341 = var13;
        field508 = arg1;
        field462 = arg2;
        Statics.field1290 = 0;
        field470 = false;
        if (field428 > 0) {
            int var15 = field428 - 1;
            Statics.field20 = new class39();
            Statics.field20.field799 = field490[var15];
            Statics.field20.field792 = field316[var15];
            Statics.field20.field793 = field431[var15];
            Statics.field20.field794 = field399[var15];
            Statics.field20.field791 = field433[var15];
        }
        return;
    }

    @ObfuscatedName("t.do(III)V")
    public static void method607(int arg0, int arg1) {
        class39 var2 = Statics.field20;
        method3320(var2.field799, var2.field792, var2.field793, var2.field794, var2.field791, var2.field791, arg0, arg1);
        Statics.field20 = null;
    }

    @ObfuscatedName("cw.dk(Leu;S)V")
    public static void method1487(class151 arg0) {
        if (field555 == arg0.field2202) {
            field491[arg0.field2201] = true;
        }
    }

    @ObfuscatedName("gj.dr(I)V")
    public static void method3169() {
        for (class18 var0 = (class18) field447.method2238(); var0 != null; var0 = (class18) field447.method2233()) {
            int var1 = var0.field180;
            if (class151.method1075(var1)) {
                boolean var2 = true;
                class151[] var3 = Statics.field2173[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2069;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field1879;
                    class151 var6 = class151.method80(var5);
                    if (var6 != null) {
                        method1487(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("gp.dp([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method3614(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("client.db(II)V")
    public static final void method604(int arg0) {
        if (!class151.method1075(arg0)) {
            return;
        }
        class151[] var1 = Statics.field2173[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class151 var3 = var1[var2];
            if (var3 != null) {
                var3.field2058 = 0;
                var3.field2193 = 0;
            }
        }
    }

    @ObfuscatedName("da.dm(IB)V")
    public static final void method1956(int arg0) {
        if (class151.method1075(arg0)) {
            method1914(Statics.field2173[arg0], -1);
        }
    }

    @ObfuscatedName("de.dy([Leu;IB)V")
    public static final void method1914(class151[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class151 var3 = arg0[var2];
            if (var3 != null && var3.field2089 == arg1 && (!var3.field2069 || !method707(var3))) {
                if (var3.field2163 == 0) {
                    if (!var3.field2069 && method707(var3) && Statics.field803 != var3) {
                        continue;
                    }
                    method1914(arg0, var3.field2070);
                    if (var3.field2194 != null) {
                        method1914(var3.field2194, var3.field2070);
                    }
                    class18 var4 = (class18) field447.method2229((long) var3.field2070);
                    if (var4 != null) {
                        method1956(var4.field180);
                    }
                }
                if (var3.field2163 == 6) {
                    if (var3.field2117 != -1 || var3.field2118 != -1) {
                        boolean var5 = method199(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2118;
                        } else {
                            var6 = var3.field2117;
                        }
                        if (var6 != -1) {
                            class202 var7 = class202.method119(var6);
                            var3.field2193 += field518;
                            while (var3.field2193 > var7.field3051[var3.field2058]) {
                                var3.field2193 -= var7.field3051[var3.field2058];
                                var3.field2058++;
                                if (var3.field2058 >= var7.field3048.length) {
                                    var3.field2058 -= var7.field3062;
                                    if (var3.field2058 < 0 || var3.field2058 >= var7.field3048.length) {
                                        var3.field2058 = 0;
                                    }
                                }
                                method1487(var3);
                            }
                        }
                    }
                    if (var3.field2113 != 0 && !var3.field2069) {
                        int var8 = var3.field2113 >> 16;
                        int var9 = var3.field2113 << 16 >> 16;
                        int var10 = field518 * var8;
                        int var11 = field518 * var9;
                        var3.field2189 = var3.field2189 + var10 & 0x7FF;
                        var3.field2122 = var3.field2122 + var11 & 0x7FF;
                        method1487(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ad.ds(II)V")
    public static final void method784(int arg0) {
        method3169();
        class32.method2619();
        int var1 = class188.method3084(arg0).field2773;
        if (var1 == 0) {
            return;
        }
        int var2 = class147.field2032[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class85.method1595(0.9D);
                ((class75) Statics.field1442).method1373(0.9D);
            }
            if (var2 == 2) {
                class85.method1595(0.8D);
                ((class75) Statics.field1442).method1373(0.8D);
            }
            if (var2 == 3) {
                class85.method1595(0.7D);
                ((class75) Statics.field1442).method1373(0.7D);
            }
            if (var2 == 4) {
                class85.method1595(0.6D);
                ((class75) Statics.field1442).method1373(0.6D);
            }
            class199.method1823();
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
            if (field523 != var3) {
                if (field523 == 0 && field319 != -1) {
                    class139.method2173(Statics.field747, field319, 0, var3, false);
                    field525 = false;
                } else if (var3 == 0) {
                    class139.method187();
                    field525 = false;
                } else {
                    class139.method752(var3);
                }
                field523 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field479 = 127;
            }
            if (var2 == 1) {
                field479 = 96;
            }
            if (var2 == 2) {
                field479 = 64;
            }
            if (var2 == 3) {
                field479 = 32;
            }
            if (var2 == 4) {
                field479 = 0;
            }
        }
        if (var1 == 5) {
            field438 = var2;
        }
        if (var1 == 6) {
            field374 = var2;
        }
        if (var1 == 9) {
            field449 = var2;
        }
        if (var1 == 10) {
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
        if (var1 == 17) {
            field460 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field311 = (class41) Statics.method1856(class41.method2986(), var2);
            if (field311 == null) {
                field311 = class41.field815;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field526 = -1;
            } else {
                field526 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field488 = (class41) Statics.method1856(class41.method2986(), var2);
            if (field488 == null) {
                field488 = class41.field815;
            }
        }
    }

    @ObfuscatedName("r.dn(I)V")
    public static final void method73() {
        field331.method3010(130);
        for (class18 var0 = (class18) field447.method2238(); var0 != null; var0 = (class18) field447.method2233()) {
            if (var0.field175 == 0 || var0.field175 == 3) {
                method69(var0, true);
            }
        }
        if (field450 != null) {
            method1487(field450);
            field450 = null;
        }
    }

    @ObfuscatedName("w.dl(Lo;ZB)V")
    public static final void method69(class18 arg0, boolean arg1) {
        int var2 = arg0.field180;
        int var3 = (int) arg0.field1879;
        arg0.method2273();
        if (arg1) {
            class151.method2553(var2);
        }
        for (class134 var4 = (class134) field503.method2238(); var4 != null; var4 = (class134) field503.method2233()) {
            if ((var4.field1879 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method2273();
            }
        }
        class151 var5 = class151.method80(var3);
        if (var5 != null) {
            method1487(var5);
        }
        method2985();
        if (field391 != -1) {
            method182(field391, 1);
        }
    }

    @ObfuscatedName("eq.du(Leu;B)Z")
    public static final boolean method2711(class151 arg0) {
        int var1 = arg0.field2074;
        if (var1 == 205) {
            field406 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field416.method2585(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field416.method2586(var4, var5 == 1);
        }
        if (var1 == 324) {
            field416.method2587(false);
        }
        if (var1 == 325) {
            field416.method2587(true);
        }
        if (var1 == 326) {
            field331.method3010(187);
            field416.method2615(field331);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gt.dz(Leu;IIIS)V")
    public static final void method3240(class151 arg0, int arg1, int arg2, int arg3) {
        class146 var4 = arg0.method2636(false);
        if (var4 == null) {
            return;
        }
        if (field522 < 3) {
            Statics.field214.method3938(arg1, arg2, var4.field2029, var4.field2021, 25, 25, field373, 256, var4.field2024, var4.field2023);
        } else {
            class220.method3806(arg1, arg2, 0, var4.field2024, var4.field2023);
        }
    }

    @ObfuscatedName("j.dg(IIIILhf;Lek;B)V")
    public static final void method221(int arg0, int arg1, int arg2, int arg3, class225 arg4, class146 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method768(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field373 + field359 & 0x7FF;
        int var8 = class85.field1445[var7];
        int var9 = class85.field1446[var7];
        int var10 = var8 * 256 / (field361 + 256);
        int var11 = var9 * 256 / (field361 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field1556.method3926(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("ax.dv(IIIILhf;Lek;S)V")
    public static final void method768(int arg0, int arg1, int arg2, int arg3, class225 arg4, class146 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field373 + field359 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class85.field1445[var6];
        int var9 = class85.field1446[var6];
        int var10 = var8 * 256 / (field361 + 256);
        int var11 = var9 * 256 / (field361 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method3924(arg5.field2029 / 2 + var12 - arg4.field3206 / 2, arg5.field2021 / 2 - var13 - arg4.field3204 / 2, arg0, arg1, arg5.field2029, arg5.field2021, arg5.field2024, arg5.field2023);
        } else {
            arg4.method3914(arg5.field2029 / 2 + arg0 + var12 - arg4.field3206 / 2, arg5.field2021 / 2 + arg1 - var13 - arg4.field3204 / 2);
        }
    }

    @ObfuscatedName("k.dd(Ljava/lang/String;ZB)Z")
    public static boolean method222(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class205.method2984(arg0, Statics.field1741);
        for (int var3 = 0; var3 < field517; var3++) {
            if (var2.equalsIgnoreCase(class205.method2984(field421[var3].field150, Statics.field1741)) && (!arg1 || field421[var3].field146 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class205.method2984(Statics.field810.field257, Statics.field1741))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gx.dc(Ljava/lang/String;B)Z")
    public static boolean method3228(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class205.method2984(arg0, Statics.field1741);
        for (int var2 = 0; var2 < field557; var2++) {
            class20 var3 = field558[var2];
            if (var1.equalsIgnoreCase(class205.method2984(var3.field205, Statics.field1741))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class205.method2984(var3.field211, Statics.field1741))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("a.di(Ljava/lang/String;B)V")
    public static final void method209(String arg0) {
        if (Statics.field2321 != null) {
            field331.method3010(227);
            field331.method2765(class161.method1995(arg0));
            field331.method2771(arg0);
        }
    }

    @ObfuscatedName("t.dq(Ljava/lang/String;I)V")
    public static final void method608(String arg0) {
        if (!arg0.equals("")) {
            field331.method3010(208);
            field331.method2765(class161.method1995(arg0));
            field331.method2771(arg0);
        }
    }

    @ObfuscatedName("dl.dh(B)V")
    public static final void method2174() {
        field331.method3010(208);
        field331.method2765(0);
    }

    @ObfuscatedName("ge.dx(Leu;S)I")
    public static int method3219(class151 arg0) {
        class134 var1 = (class134) field503.method2229(((long) arg0.field2070 << 32) + (long) arg0.field2124);
        return var1 == null ? arg0.field2142 : var1.field1893;
    }

    @ObfuscatedName("ae.ef(Leu;I)Z")
    public static boolean method707(class151 arg0) {
        if (field456) {
            if (method3219(arg0) != 0) {
                return false;
            }
            if (arg0.field2163 == 0) {
                return false;
            }
        }
        return arg0.field2085;
    }

    @ObfuscatedName("f.ec(Leu;II)Ljava/lang/String;")
    public static String method191(class151 arg0, int arg1) {
        int var2 = method3219(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2179 == null) {
            return null;
        } else if (arg0.field2160 == null || arg0.field2160.length <= arg1 || arg0.field2160[arg1] == null || arg0.field2160[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2160[arg1];
        }
    }

    @ObfuscatedName("al.et(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method798(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field444 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field444 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field444 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field444 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field444 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field92 != null) {
            var3 = "/p=" + Statics.field92;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field290 + "/a=" + Statics.field291 + var3 + "/";
    }

    @ObfuscatedName("cr.es(Ljava/lang/String;ZI)V")
    public static void method1833(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1466; var5++) {
            class199 var6 = class199.method207(var5);
            if ((!arg1 || var6.field2988) && var6.field2981 == -1 && var6.field2945.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field126 = -1;
                    Statics.field2660 = null;
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
        Statics.field2660 = var3;
        Statics.field2340 = 0;
        Statics.field126 = var4;
        String[] var9 = new String[Statics.field126];
        for (int var10 = 0; var10 < Statics.field126; var10++) {
            var9[var10] = class199.method207(var3[var10]).field2945;
        }
        class158.method83(var9, Statics.field2660);
    }
}

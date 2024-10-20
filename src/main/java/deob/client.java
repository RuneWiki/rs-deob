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

public final class client extends class114 {

    @ObfuscatedName("client.f")
    public static boolean field284 = true;

    @ObfuscatedName("client.k")
    public static int field500 = 1;

    @ObfuscatedName("client.g")
    public static int field401 = 0;

    @ObfuscatedName("client.a")
    public static int field288 = 0;

    @ObfuscatedName("client.w")
    public static class118[] field377 = new class118[4];

    @ObfuscatedName("client.h")
    public static boolean field289 = false;

    @ObfuscatedName("client.p")
    public static boolean field290 = false;

    @ObfuscatedName("client.l")
    public static int field291 = 0;

    @ObfuscatedName("client.j")
    public static int field292 = 0;

    @ObfuscatedName("client.d")
    public static boolean field293 = true;

    @ObfuscatedName("client.s")
    public static int field294 = 0;

    @ObfuscatedName("client.t")
    public static long field564 = -1L;

    @ObfuscatedName("client.b")
    public static int field296 = -1;

    @ObfuscatedName("client.o")
    public static int field297 = -1;

    @ObfuscatedName("client.ak")
    public static int field298 = -1;

    @ObfuscatedName("client.ai")
    public static boolean field299 = true;

    @ObfuscatedName("client.aq")
    public static boolean field470 = false;

    @ObfuscatedName("client.an")
    public static int field301 = 0;

    @ObfuscatedName("client.ay")
    public static int field490 = 0;

    @ObfuscatedName("client.ap")
    public static int field303 = 0;

    @ObfuscatedName("client.aj")
    public static int field304 = 0;

    @ObfuscatedName("client.aw")
    public static int field305 = 0;

    @ObfuscatedName("client.am")
    public static int field403 = 0;

    @ObfuscatedName("client.av")
    public static int field307 = 0;

    @ObfuscatedName("client.af")
    public static int field336 = 0;

    @ObfuscatedName("client.az")
    public static int field309 = 0;

    @ObfuscatedName("client.ab")
    public static class41 field310 = class41.field816;

    @ObfuscatedName("client.al")
    public static class41 field311 = class41.field816;

    @ObfuscatedName("client.ar")
    public static int field312 = 0;

    @ObfuscatedName("client.ao")
    public static int field390 = 0;

    @ObfuscatedName("client.ah")
    public static int field314 = 0;

    @ObfuscatedName("client.bn")
    public static int field316 = 0;

    @ObfuscatedName("client.bb")
    public static int field317 = 0;

    @ObfuscatedName("client.bg")
    public static int field318 = 0;

    @ObfuscatedName("client.bu")
    public static int field319 = 0;

    @ObfuscatedName("client.bj")
    public static int field387 = 0;

    @ObfuscatedName("client.ca")
    public static class36[] field322 = new class36[32768];

    @ObfuscatedName("client.cz")
    public static int field323 = 0;

    @ObfuscatedName("client.co")
    public static int[] field324 = new int[32768];

    @ObfuscatedName("client.ch")
    public static int field325 = 0;

    @ObfuscatedName("client.cd")
    public static int[] field406 = new int[250];

    @ObfuscatedName("client.cr")
    public static class160 field295 = new class160(5000);

    @ObfuscatedName("client.cw")
    public static class160 field363 = new class160(5000);

    @ObfuscatedName("client.ct")
    public static class160 field545 = new class160(15000);

    @ObfuscatedName("client.cq")
    public static int field486 = 0;

    @ObfuscatedName("client.cb")
    public static int field332 = 0;

    @ObfuscatedName("client.cx")
    public static int field333 = 0;

    @ObfuscatedName("client.cs")
    public static int field334 = 0;

    @ObfuscatedName("client.cf")
    public static int field320 = 0;

    @ObfuscatedName("client.cv")
    public static int field467 = 0;

    @ObfuscatedName("client.cc")
    public static int field337 = 0;

    @ObfuscatedName("client.cg")
    public static int field454 = 0;

    @ObfuscatedName("client.cl")
    public static boolean field412 = false;

    @ObfuscatedName("client.dp")
    public static int field342 = 0;

    @ObfuscatedName("client.dm")
    public static int field343 = 1;

    @ObfuscatedName("client.dh")
    public static int field344 = 0;

    @ObfuscatedName("client.dj")
    public static int field329 = 1;

    @ObfuscatedName("client.dv")
    public static int field346 = 0;

    @ObfuscatedName("client.di")
    public static boolean field350 = false;

    @ObfuscatedName("client.dx")
    public static int[][][] field351 = new int[4][13][13];

    @ObfuscatedName("client.do")
    public static final int[] field492 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dz")
    public static int field353 = 0;

    @ObfuscatedName("client.dr")
    public static int field354 = 2;

    @ObfuscatedName("client.dg")
    public static int field355 = 0;

    @ObfuscatedName("client.ds")
    public static int field356 = 2;

    @ObfuscatedName("client.dk")
    public static int field357 = 0;

    @ObfuscatedName("client.eu")
    public static int field466 = 1;

    @ObfuscatedName("client.ew")
    public static int field352 = 0;

    @ObfuscatedName("client.eb")
    public static int field308 = 0;

    @ObfuscatedName("client.el")
    public static int field361 = 2;

    @ObfuscatedName("client.ea")
    public static int field345 = 0;

    @ObfuscatedName("client.er")
    public static int field302 = 1;

    @ObfuscatedName("client.eo")
    public static int field364 = 0;

    @ObfuscatedName("client.es")
    public static int field365 = 0;

    @ObfuscatedName("client.ed")
    public static int field503 = 2301979;

    @ObfuscatedName("client.ez")
    public static int field508 = 5063219;

    @ObfuscatedName("client.ev")
    public static int field368 = 3353893;

    @ObfuscatedName("client.et")
    public static int field493 = 7759444;

    @ObfuscatedName("client.ey")
    public static boolean field370 = false;

    @ObfuscatedName("client.ej")
    public static int field474 = 0;

    @ObfuscatedName("client.fy")
    public static int field372 = 128;

    @ObfuscatedName("client.fw")
    public static int field373 = 0;

    @ObfuscatedName("client.fb")
    public static int field437 = 0;

    @ObfuscatedName("client.fm")
    public static int field375 = 0;

    @ObfuscatedName("client.fl")
    public static int field338 = 0;

    @ObfuscatedName("client.fe")
    public static int field479 = 0;

    @ObfuscatedName("client.fr")
    public static int field378 = 50;

    @ObfuscatedName("client.fi")
    public static int field379 = 0;

    @ObfuscatedName("client.fu")
    public static boolean field442 = false;

    @ObfuscatedName("client.fj")
    public static int field381 = 0;

    @ObfuscatedName("client.fv")
    public static int field382 = 0;

    @ObfuscatedName("client.fz")
    public static int field453 = 50;

    @ObfuscatedName("client.fp")
    public static int[] field384 = new int[field453];

    @ObfuscatedName("client.fd")
    public static int[] field385 = new int[field453];

    @ObfuscatedName("client.fh")
    public static int[] field386 = new int[field453];

    @ObfuscatedName("client.fs")
    public static int[] field331 = new int[field453];

    @ObfuscatedName("client.fo")
    public static int[] field335 = new int[field453];

    @ObfuscatedName("client.fn")
    public static int[] field531 = new int[field453];

    @ObfuscatedName("client.fc")
    public static int[] field300 = new int[field453];

    @ObfuscatedName("client.gq")
    public static String[] field391 = new String[field453];

    @ObfuscatedName("client.gs")
    public static int[][] field392 = new int[104][104];

    @ObfuscatedName("client.gm")
    public static int field313 = 0;

    @ObfuscatedName("client.gv")
    public static int field388 = -1;

    @ObfuscatedName("client.gc")
    public static int field537 = -1;

    @ObfuscatedName("client.gr")
    public static int field396 = 0;

    @ObfuscatedName("client.gi")
    public static int field397 = 0;

    @ObfuscatedName("client.gb")
    public static int field398 = 0;

    @ObfuscatedName("client.gj")
    public static int field399 = 0;

    @ObfuscatedName("client.gh")
    public static int field400 = 0;

    @ObfuscatedName("client.gn")
    public static int field507 = 0;

    @ObfuscatedName("client.gu")
    public static int field402 = 0;

    @ObfuscatedName("client.gy")
    public static int field485 = 0;

    @ObfuscatedName("client.gx")
    public static int field404 = 0;

    @ObfuscatedName("client.gw")
    public static int field405 = 0;

    @ObfuscatedName("client.ge")
    public static boolean field458 = false;

    @ObfuscatedName("client.gd")
    public static int field407 = 0;

    @ObfuscatedName("client.gp")
    public static int field408 = 0;

    @ObfuscatedName("client.gg")
    public static class24[] field409 = new class24[2048];

    @ObfuscatedName("client.gk")
    public static int field441 = -1;

    @ObfuscatedName("client.gl")
    public static int field411 = 0;

    @ObfuscatedName("client.hk")
    public static int field518 = 0;

    @ObfuscatedName("client.hu")
    public static int[] field413 = new int[1000];

    @ObfuscatedName("client.ho")
    public static final int[] field488 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.he")
    public static String[] field416 = new String[8];

    @ObfuscatedName("client.hz")
    public static boolean[] field417 = new boolean[8];

    @ObfuscatedName("client.hi")
    public static int[] field418 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hy")
    public static int field419 = -1;

    @ObfuscatedName("client.hb")
    public static class129[][][] field420 = new class129[4][104][104];

    @ObfuscatedName("client.hv")
    public static class129 field371 = new class129();

    @ObfuscatedName("client.hn")
    public static class129 field538 = new class129();

    @ObfuscatedName("client.hl")
    public static class129 field423 = new class129();

    @ObfuscatedName("client.hs")
    public static int[] field424 = new int[25];

    @ObfuscatedName("client.hr")
    public static int[] field425 = new int[25];

    @ObfuscatedName("client.hg")
    public static int[] field426 = new int[25];

    @ObfuscatedName("client.hj")
    public static int field427 = 0;

    @ObfuscatedName("client.ht")
    public static boolean field428 = false;

    @ObfuscatedName("client.hp")
    public static int field519 = 0;

    @ObfuscatedName("client.hq")
    public static int[] field430 = new int[500];

    @ObfuscatedName("client.ha")
    public static int[] field431 = new int[500];

    @ObfuscatedName("client.im")
    public static int[] field389 = new int[500];

    @ObfuscatedName("client.ij")
    public static int[] field367 = new int[500];

    @ObfuscatedName("client.id")
    public static String[] field434 = new String[500];

    @ObfuscatedName("client.il")
    public static String[] field435 = new String[500];

    @ObfuscatedName("client.ia")
    public static int field436 = -1;

    @ObfuscatedName("client.ib")
    public static int field341 = -1;

    @ObfuscatedName("client.in")
    public static int field438 = 0;

    @ObfuscatedName("client.ik")
    public static int field494 = 50;

    @ObfuscatedName("client.if")
    public static int field527 = 0;

    @ObfuscatedName("client.it")
    public static String field376 = null;

    @ObfuscatedName("client.ig")
    public static boolean field524 = false;

    @ObfuscatedName("client.iq")
    public static int field443 = -1;

    @ObfuscatedName("client.ih")
    public static int field339 = -1;

    @ObfuscatedName("client.iw")
    public static String field445 = null;

    @ObfuscatedName("client.is")
    public static String field328 = null;

    @ObfuscatedName("client.ix")
    public static int field543 = -1;

    @ObfuscatedName("client.iv")
    public static class126 field448 = new class126(8);

    @ObfuscatedName("client.ii")
    public static int field449 = 0;

    @ObfuscatedName("client.jx")
    public static int field450 = 0;

    @ObfuscatedName("client.ju")
    public static class170 field451 = null;

    @ObfuscatedName("client.jl")
    public static int field429 = 0;

    @ObfuscatedName("client.jn")
    public static int field360 = 0;

    @ObfuscatedName("client.jo")
    public static int field359 = 0;

    @ObfuscatedName("client.ji")
    public static int field455 = -1;

    @ObfuscatedName("client.jg")
    public static boolean field456 = false;

    @ObfuscatedName("client.jm")
    public static boolean field457 = false;

    @ObfuscatedName("client.jz")
    public static boolean field571 = false;

    @ObfuscatedName("client.jy")
    public static class170 field422 = null;

    @ObfuscatedName("client.jh")
    public static class170 field512 = null;

    @ObfuscatedName("client.jw")
    public static class170 field461 = null;

    @ObfuscatedName("client.jb")
    public static int field462 = 0;

    @ObfuscatedName("client.jd")
    public static int field463 = 0;

    @ObfuscatedName("client.jp")
    public static class170 field464 = null;

    @ObfuscatedName("client.jq")
    public static boolean field465 = false;

    @ObfuscatedName("client.jc")
    public static int field495 = -1;

    @ObfuscatedName("client.jj")
    public static int field330 = -1;

    @ObfuscatedName("client.ja")
    public static boolean field468 = false;

    @ObfuscatedName("client.jf")
    public static int field469 = -1;

    @ObfuscatedName("client.jk")
    public static int field326 = -1;

    @ObfuscatedName("client.jr")
    public static boolean field471 = false;

    @ObfuscatedName("client.kp")
    public static int field472 = 1;

    @ObfuscatedName("client.ki")
    public static int[] field473 = new int[32];

    @ObfuscatedName("client.km")
    public static int field433 = 0;

    @ObfuscatedName("client.ky")
    public static int[] field475 = new int[32];

    @ObfuscatedName("client.kc")
    public static int field366 = 0;

    @ObfuscatedName("client.ko")
    public static int[] field286 = new int[32];

    @ObfuscatedName("client.kq")
    public static int field380 = 0;

    @ObfuscatedName("client.ke")
    public static int field362 = 0;

    @ObfuscatedName("client.kt")
    public static int field480 = 0;

    @ObfuscatedName("client.kh")
    public static int field481 = 0;

    @ObfuscatedName("client.kl")
    public static int field482 = 0;

    @ObfuscatedName("client.kv")
    public static int field447 = 0;

    @ObfuscatedName("client.kz")
    public static int field477 = 0;

    @ObfuscatedName("client.kj")
    public static int field395 = 0;

    @ObfuscatedName("client.kx")
    public static class129 field476 = new class129();

    @ObfuscatedName("client.kw")
    public static class129 field487 = new class129();

    @ObfuscatedName("client.kk")
    public static class129 field553 = new class129();

    @ObfuscatedName("client.ka")
    public static class126 field489 = new class126(512);

    @ObfuscatedName("client.kd")
    public static int field282 = 0;

    @ObfuscatedName("client.kn")
    public static int field491 = -2;

    @ObfuscatedName("client.kb")
    public static boolean[] field525 = new boolean[100];

    @ObfuscatedName("client.lb")
    public static boolean[] field561 = new boolean[100];

    @ObfuscatedName("client.ll")
    public static boolean[] field560 = new boolean[100];

    @ObfuscatedName("client.lg")
    public static int[] field572 = new int[100];

    @ObfuscatedName("client.lk")
    public static int[] field496 = new int[100];

    @ObfuscatedName("client.lv")
    public static int[] field497 = new int[100];

    @ObfuscatedName("client.lu")
    public static int[] field498 = new int[100];

    @ObfuscatedName("client.lt")
    public static int field499 = 0;

    @ObfuscatedName("client.ld")
    public static long field563 = 0L;

    @ObfuscatedName("client.ly")
    public static boolean field501 = true;

    @ObfuscatedName("client.lf")
    public static int field502 = 765;

    @ObfuscatedName("client.la")
    public static int field478 = 503;

    @ObfuscatedName("client.lh")
    public static int[] field439 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lz")
    public static int field505 = 0;

    @ObfuscatedName("client.lx")
    public static int field506 = 0;

    @ObfuscatedName("client.ln")
    public static String field533 = "";

    @ObfuscatedName("client.lr")
    public static long[] field444 = new long[100];

    @ObfuscatedName("client.lm")
    public static int field509 = 0;

    @ObfuscatedName("client.lq")
    public static int field510 = 0;

    @ObfuscatedName("client.lw")
    public static int[] field459 = new int[128];

    @ObfuscatedName("client.mj")
    public static int[] field432 = new int[128];

    @ObfuscatedName("client.mf")
    public static long field513 = -1L;

    @ObfuscatedName("client.mh")
    public static String field514 = null;

    @ObfuscatedName("client.mk")
    public static String field515 = null;

    @ObfuscatedName("client.mo")
    public static int field516 = -1;

    @ObfuscatedName("client.mt")
    public static int field517 = 0;

    @ObfuscatedName("client.mw")
    public static int[] field358 = new int[1000];

    @ObfuscatedName("client.mi")
    public static int[] field511 = new int[1000];

    @ObfuscatedName("client.mn")
    public static class225[] field520 = new class225[1000];

    @ObfuscatedName("client.ml")
    public static int field521 = 0;

    @ObfuscatedName("client.me")
    public static int field522 = 0;

    @ObfuscatedName("client.mc")
    public static int field523 = 0;

    @ObfuscatedName("client.md")
    public static int field374 = 255;

    @ObfuscatedName("client.my")
    public static int field415 = -1;

    @ObfuscatedName("client.ms")
    public static boolean field526 = false;

    @ObfuscatedName("client.nf")
    public static int field483 = 127;

    @ObfuscatedName("client.ng")
    public static int field528 = 127;

    @ObfuscatedName("client.nb")
    public static int field529 = 0;

    @ObfuscatedName("client.na")
    public static int[] field530 = new int[50];

    @ObfuscatedName("client.nd")
    public static int[] field410 = new int[50];

    @ObfuscatedName("client.nr")
    public static int[] field440 = new int[50];

    @ObfuscatedName("client.ni")
    public static int[] field484 = new int[50];

    @ObfuscatedName("client.no")
    public static class54[] field534 = new class54[50];

    @ObfuscatedName("client.np")
    public static boolean field535 = false;

    @ObfuscatedName("client.nm")
    public static boolean[] field536 = new boolean[5];

    @ObfuscatedName("client.ox")
    public static int[] field421 = new int[5];

    @ObfuscatedName("client.og")
    public static int[] field394 = new int[5];

    @ObfuscatedName("client.oz")
    public static int[] field539 = new int[5];

    @ObfuscatedName("client.oq")
    public static int[] field540 = new int[5];

    @ObfuscatedName("client.ol")
    public static short field541 = 256;

    @ObfuscatedName("client.ok")
    public static short field542 = 205;

    @ObfuscatedName("client.ot")
    public static short field383 = 256;

    @ObfuscatedName("client.oo")
    public static short field544 = 320;

    @ObfuscatedName("client.oa")
    public static short field393 = 1;

    @ObfuscatedName("client.oi")
    public static short field546 = 32767;

    @ObfuscatedName("client.ou")
    public static short field547 = 1;

    @ObfuscatedName("client.op")
    public static short field548 = 32767;

    @ObfuscatedName("client.od")
    public static int field549 = 0;

    @ObfuscatedName("client.oe")
    public static int field550 = 0;

    @ObfuscatedName("client.of")
    public static int field551 = 0;

    @ObfuscatedName("client.oj")
    public static int field552 = 0;

    @ObfuscatedName("client.oy")
    public static int field452 = 0;

    @ObfuscatedName("client.ov")
    public static int field554 = 0;

    @ObfuscatedName("client.om")
    public static int field555 = 0;

    @ObfuscatedName("client.or")
    public static class15[] field556 = new class15[400];

    @ObfuscatedName("client.ob")
    public static class131 field557 = new class131();

    @ObfuscatedName("client.os")
    public static int field558 = 0;

    @ObfuscatedName("client.ow")
    public static class20[] field349 = new class20[400];

    @ObfuscatedName("client.oc")
    public static class167 field285 = new class167();

    @ObfuscatedName("client.pc")
    public static int field568 = -1;

    @ObfuscatedName("client.pv")
    public static int field562 = -1;

    @ObfuscatedName("client.pg")
    public static class5[] field532 = new class5[8];

    @ObfuscatedName("client.ph")
    public static long field460 = -1L;

    @ObfuscatedName("client.pu")
    public static long field565 = -1L;

    @ObfuscatedName("client.pk")
    public static final class23 field566 = new class23();

    @ObfuscatedName("client.pl")
    public static int[] field567 = new int[50];

    @ObfuscatedName("client.pz")
    public static int[] field306 = new int[50];

    @ObfuscatedName("client.f(I)V")
    public final void method331() {
    }

    public final void init() {
        if (!this.method1943()) {
            return;
        }
        class215[] var1 = new class215[] { class215.field3151, class215.field3154, class215.field3155, class215.field3157, class215.field3150, class215.field3145, class215.field3159, class215.field3147, class215.field3158, class215.field3149, class215.field3156, class215.field3153, class215.field3152, class215.field3146, class215.field3148 };
        class215[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class215 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3160);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3160)) {
                    case 2:
                        Statics.field757 = var5;
                        break;
                    case 3:
                        field500 = Integer.parseInt(var5);
                        break;
                    case 4:
                        field291 = Integer.parseInt(var5);
                    case 5:
                    case 7:
                    default:
                        break;
                    case 6:
                        Statics.field186 = Integer.parseInt(var5);
                        break;
                    case 8:
                        field288 = Integer.parseInt(var5);
                        break;
                    case 9:
                        Statics.field287 = class179.method1097(Integer.parseInt(var5));
                        break;
                    case 10:
                        field401 = Integer.parseInt(var5);
                        break;
                    case 11:
                        if (var5.equalsIgnoreCase(class38.field782)) {
                            field289 = true;
                        } else {
                            field289 = false;
                        }
                        break;
                    case 12:
                        Statics.field34 = var5;
                        break;
                    case 13:
                        Statics.field2189 = Integer.parseInt(var5);
                        break;
                    case 14:
                        class180[] var6 = new class180[] { class180.field2687, class180.field2683, class180.field2690, class180.field2684, class180.field2685, class180.field2682 };
                        Statics.field227 = (class180) class149.method162(var6, Integer.parseInt(var5));
                        if (Statics.field227 == class180.field2687) {
                            Statics.field1725 = class229.field3240;
                        } else {
                            Statics.field1725 = class229.field3238;
                        }
                        break;
                    case 15:
                        if (var5.equalsIgnoreCase(class38.field782)) {
                        }
                }
            }
        }
        method553();
        Statics.field55 = this.getCodeBase().getHost();
        String var7 = Statics.field287.field2677;
        byte var8 = 0;
        try {
            class105.method1862("oldschool", var7, var8, 16);
        } catch (Exception var10) {
            class102.method1780((String) null, var10);
        }
        Statics.field283 = this;
        this.method1997(765, 503, 129);
    }

    @ObfuscatedName("client.a(I)V")
    public static final void method553() {
        class88.field1477 = false;
        field290 = false;
    }

    @ObfuscatedName("client.q(B)V")
    public final void method242() {
        Statics.field88 = field288 == 0 ? 43594 : field500 + 40000;
        Statics.field67 = field288 == 0 ? 443 : field500 + 50000;
        Statics.field2190 = Statics.field88;
        Statics.field1196 = class168.field2191;
        Statics.field3170 = class168.field2186;
        Statics.field5 = class168.field2187;
        Statics.field2184 = class168.field2188;
        if (Statics.field1666.toLowerCase().indexOf("microsoft") == -1) {
            class106.field1688[44] = 71;
            class106.field1688[45] = 26;
            class106.field1688[46] = 72;
            class106.field1688[47] = 73;
            class106.field1688[59] = 57;
            class106.field1688[61] = 27;
            class106.field1688[91] = 42;
            class106.field1688[92] = 74;
            class106.field1688[93] = 43;
            class106.field1688[192] = 28;
            class106.field1688[222] = 58;
            class106.field1688[520] = 59;
        } else {
            class106.field1688[186] = 57;
            class106.field1688[187] = 27;
            class106.field1688[188] = 71;
            class106.field1688[189] = 26;
            class106.field1688[190] = 72;
            class106.field1688[191] = 73;
            class106.field1688[192] = 58;
            class106.field1688[219] = 42;
            class106.field1688[220] = 74;
            class106.field1688[221] = 43;
            class106.field1688[222] = 59;
            class106.field1688[223] = 28;
        }
        class106.method308(Statics.field1748);
        class116.method847(Statics.field1748);
        Statics.field177 = class113.method171();
        if (Statics.field177 != null) {
            Statics.field177.method1887(Statics.field1748);
        }
        Statics.field1959 = new class117(255, class105.field1674, class105.field1667, 500000);
        class74 var1 = null;
        class31 var2 = new class31();
        try {
            var1 = class105.method677("", Statics.field227.field2688, false);
            byte[] var3 = new byte[(int) var1.method1312()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method1314(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class31(new class154(var3));
        } catch (Exception var10) {
        }
        try {
            if (var1 != null) {
                var1.method1311();
            }
        } catch (Exception var9) {
        }
        Statics.field2045 = var2;
        Statics.field1815 = this.getToolkit().getSystemClipboard();
        class115.method697(this, Statics.field893);
        if (field288 != 0) {
            field470 = true;
        }
        method167(Statics.field2045.field692);
    }

    @ObfuscatedName("client.w(I)V")
    public final void method424() {
        field294++;
        this.method246();
        class184.method9();
        class139.method7();
        method2046();
        class106.method1098();
        class116 var1 = class116.field1799;
        synchronized (class116.field1799) {
            class116.field1796 = class116.field1793;
            class116.field1795 = class116.field1794;
            class116.field1798 = class116.field1802;
            class116.field1803 = class116.field1807;
            class116.field1804 = class116.field1792;
            class116.field1805 = class116.field1801;
            class116.field1806 = class116.field1797;
            class116.field1807 = 0;
        }
        if (Statics.field177 != null) {
            int var3 = Statics.field177.method1892();
            field395 = var3;
        }
        if (field292 == 0) {
            method1937();
            class114.method1815();
        } else if (field292 == 5) {
            class42.method1309(this);
            method1937();
            class114.method1815();
        } else if (field292 == 10 || field292 == 11) {
            class42.method1309(this);
        } else if (field292 == 20) {
            class42.method1309(this);
            method83();
        } else if (field292 == 25) {
            method2990();
        }
        if (field292 == 30) {
            if (field301 > 1) {
                field301--;
            }
            if (field454 > 0) {
                field454--;
            }
            if (field412) {
                field412 = false;
                method2998();
            } else {
                if (!field428) {
                    field434[0] = class174.field2600;
                    field435[0] = "";
                    field389[0] = 1006;
                    field519 = 1;
                }
                for (int var4 = 0; var4 < 100; var4++) {
                    boolean var5;
                    if (Statics.field2119 == null) {
                        var5 = false;
                    } else {
                        label3761: {
                            try {
                                int var6 = Statics.field2119.method1908();
                                if (var6 == 0) {
                                    var5 = false;
                                    break label3761;
                                }
                                if (field332 == -1) {
                                    Statics.field2119.method1911(field545.field2094, 0, 1);
                                    field545.field2091 = 0;
                                    field332 = field545.method2782();
                                    field486 = class213.field3133[field332];
                                    var6--;
                                }
                                if (field486 == -1) {
                                    if (var6 <= 0) {
                                        var5 = false;
                                        break label3761;
                                    }
                                    Statics.field2119.method1911(field545.field2094, 0, 1);
                                    field486 = field545.field2094[0] & 0xFF;
                                    var6--;
                                }
                                if (field486 == -2) {
                                    if (var6 <= 1) {
                                        var5 = false;
                                        break label3761;
                                    }
                                    Statics.field2119.method1911(field545.field2094, 0, 2);
                                    field545.field2091 = 0;
                                    field486 = field545.method2575();
                                    var6 -= 2;
                                }
                                if (var6 < field486) {
                                    var5 = false;
                                    break label3761;
                                }
                                field545.field2091 = 0;
                                Statics.field2119.method1911(field545.field2094, 0, field486);
                                field333 = 0;
                                field337 = field467;
                                field467 = field320;
                                field320 = field332;
                                if (field332 == 235) {
                                    int var7 = field545.method2704();
                                    String var8 = field545.method2581();
                                    class170 var9 = class170.method3227(var7);
                                    if (!var8.equals(var9.field2255)) {
                                        var9.field2255 = var8;
                                        method1788(var9);
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 183) {
                                    method2771();
                                    field429 = field545.method2573();
                                    field477 = field472;
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 253) {
                                    Statics.field778 = field545.method2602();
                                    Statics.field1600 = field545.method2737();
                                    while (field545.field2091 < field486) {
                                        field332 = field545.method2573();
                                        method762();
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 187) {
                                    int var10 = field545.method2704();
                                    int var11 = field545.method2611();
                                    if (var11 == 65535) {
                                        var11 = -1;
                                    }
                                    int var12 = field545.method2704();
                                    int var13 = field545.method2575();
                                    if (var13 == 65535) {
                                        var13 = -1;
                                    }
                                    for (int var14 = var11; var14 <= var13; var14++) {
                                        long var15 = ((long) var10 << 32) + (long) var14;
                                        class128 var17 = field489.method2161(var15);
                                        if (var17 != null) {
                                            var17.method2200();
                                        }
                                        field489.method2162(new class134(var12), var15);
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 28) {
                                    field301 = field545.method2564() * 30;
                                    field477 = field472;
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 117) {
                                    field490 = field545.method2573();
                                    if (field490 == 1) {
                                        field303 = field545.method2575();
                                    }
                                    if (field490 >= 2 && field490 <= 6) {
                                        if (field490 == 2) {
                                            field336 = 64;
                                            field309 = 64;
                                        }
                                        if (field490 == 3) {
                                            field336 = 0;
                                            field309 = 64;
                                        }
                                        if (field490 == 4) {
                                            field336 = 128;
                                            field309 = 64;
                                        }
                                        if (field490 == 5) {
                                            field336 = 64;
                                            field309 = 0;
                                        }
                                        if (field490 == 6) {
                                            field336 = 64;
                                            field309 = 128;
                                        }
                                        field490 = 2;
                                        field305 = field545.method2575();
                                        field403 = field545.method2575();
                                        field307 = field545.method2573();
                                    }
                                    if (field490 == 10) {
                                        field304 = field545.method2575();
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 190) {
                                    int var18 = field545.method2564();
                                    if (var18 == 65535) {
                                        var18 = -1;
                                    }
                                    method2907(var18);
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 15) {
                                    int var19 = field545.method2575();
                                    if (var19 == 65535) {
                                        var19 = -1;
                                    }
                                    int var20 = field545.method2614();
                                    if (field374 != 0 && var19 != -1) {
                                        class139.method2051(Statics.field1707, var19, 0, field374, false);
                                        field526 = true;
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 48) {
                                    field535 = false;
                                    for (int var21 = 0; var21 < 5; var21++) {
                                        field536[var21] = false;
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 42) {
                                    int var22 = field545.method2573();
                                    if (field545.method2573() == 0) {
                                        field532[var22] = new class5();
                                        field545.field2091 += 18;
                                    } else {
                                        field545.field2091--;
                                        field532[var22] = new class5(field545, false);
                                    }
                                    field482 = field472;
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 94) {
                                    int var23 = field545.method2704();
                                    int var24 = field545.method2575();
                                    class166.field2170[var24] = var23;
                                    if (class166.field2169[var24] != var23) {
                                        class166.field2169[var24] = var23;
                                    }
                                    method820(var24);
                                    field473[++field433 - 1 & 0x1F] = var24;
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 147) {
                                    field545.field2091 += 28;
                                    if (field545.method2743()) {
                                        class160 var25 = field545;
                                        int var26 = field545.field2091 - 28;
                                        if (class105.field1669 != null) {
                                            try {
                                                class105.field1669.method1278(0L);
                                                class105.field1669.method1288(var25.field2094, var26, 24);
                                            } catch (Exception var594) {
                                            }
                                        }
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 127) {
                                    for (int var28 = 0; var28 < Statics.field2780; var28++) {
                                        class188 var29 = class188.method740(var28);
                                        if (var29 != null) {
                                            class166.field2170[var28] = 0;
                                            class166.field2169[var28] = 0;
                                        }
                                    }
                                    method2771();
                                    field433 += 32;
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 150) {
                                    int var30 = field545.method2658();
                                    class18 var31 = (class18) field448.method2161((long) var30);
                                    if (var31 != null) {
                                        method561(var31, true);
                                    }
                                    if (field451 != null) {
                                        method1788(field451);
                                        field451 = null;
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 200) {
                                    int var32 = field545.method2620();
                                    int var33 = field545.method2612();
                                    class170 var34 = class170.method3227(var32);
                                    if (var34.field2256 != var33 || var33 == -1) {
                                        var34.field2256 = var33;
                                        var34.field2331 = 0;
                                        var34.field2252 = 0;
                                        method1788(var34);
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 138) {
                                    class160 var35 = field545;
                                    int var36 = field486;
                                    int var37 = var35.field2091;
                                    class46.field925 = 0;
                                    class46.method2982(var35);
                                    for (int var38 = 0; var38 < class46.field925; var38++) {
                                        int var39 = class46.field918[var38];
                                        class24 var40 = field409[var39];
                                        int var41 = var35.method2573();
                                        if ((var41 & 0x40) != 0) {
                                            var41 += var35.method2573() << 8;
                                        }
                                        byte var42 = -1;
                                        if ((var41 & 0x2) != 0) {
                                            int var43 = var35.method2573();
                                            byte[] var44 = new byte[var43];
                                            class154 var45 = new class154(var44);
                                            var35.method2584(var44, 0, var43);
                                            class46.field908[var39] = var45;
                                            var40.method209(var45);
                                        }
                                        if ((var41 & 0x20) != 0) {
                                            int var46 = var35.method2575();
                                            if (var46 == 65535) {
                                                var46 = -1;
                                            }
                                            int var47 = var35.method2573();
                                            method39(var40, var46, var47);
                                        }
                                        if ((var41 & 0x4) != 0) {
                                            var40.field625 = var35.method2575();
                                            if (var40.field625 == 65535) {
                                                var40.field625 = -1;
                                            }
                                        }
                                        if ((var41 & 0x1) != 0) {
                                            var40.field649 = var35.method2581();
                                            if (var40.field649.charAt(0) == '~') {
                                                var40.field649 = var40.field649.substring(1);
                                                class48.method3375(2, var40.field241, var40.field649);
                                            } else if (Statics.field810 == var40) {
                                                class48.method3375(2, var40.field241, var40.field649);
                                            }
                                            var40.field613 = false;
                                            var40.field616 = 0;
                                            var40.field617 = 0;
                                            var40.field615 = 150;
                                        }
                                        if ((var41 & 0x80) != 0) {
                                            int var48 = var35.method2573();
                                            if (var48 > 0) {
                                                for (int var49 = 0; var49 < var48; var49++) {
                                                    int var50 = -1;
                                                    int var51 = -1;
                                                    int var52 = -1;
                                                    int var53 = var35.method2586();
                                                    if (var53 == 32767) {
                                                        var53 = var35.method2586();
                                                        var51 = var35.method2586();
                                                        var50 = var35.method2586();
                                                        var52 = var35.method2586();
                                                    } else if (var53 == 32766) {
                                                        var53 = -1;
                                                    } else {
                                                        var51 = var35.method2586();
                                                    }
                                                    int var54 = var35.method2586();
                                                    var40.method565(var53, var51, var50, var52, field294, var54);
                                                }
                                            }
                                            int var55 = var35.method2573();
                                            if (var55 > 0) {
                                                for (int var56 = 0; var56 < var55; var56++) {
                                                    int var57 = var35.method2586();
                                                    int var58 = var35.method2586();
                                                    if (var58 == 32767) {
                                                        var40.method567(var57);
                                                    } else {
                                                        int var59 = var35.method2586();
                                                        int var60 = var35.method2573();
                                                        int var61 = var58 > 0 ? var35.method2573() : var60;
                                                        var40.method566(var57, field294, var58, var59, var60, var61);
                                                    }
                                                }
                                            }
                                        }
                                        if ((var41 & 0x8) != 0) {
                                            var40.field627 = var35.method2575();
                                            if (var40.field653 == 0) {
                                                var40.field650 = var40.field627;
                                                var40.field627 = -1;
                                            }
                                        }
                                        if ((var41 & 0x10) != 0) {
                                            int var62 = var35.method2575();
                                            class178 var63 = (class178) class149.method162(class178.method182(), var35.method2573());
                                            boolean var64 = var35.method2573() == 1;
                                            int var65 = var35.method2573();
                                            int var66 = var35.field2091;
                                            if (var40.field241 != null && var40.field269 != null) {
                                                boolean var67 = false;
                                                if (var63.field2669 && method3193(var40.field241)) {
                                                    var67 = true;
                                                }
                                                if (!var67 && field408 == 0 && !var40.field246) {
                                                    class46.field910.field2091 = 0;
                                                    var35.method2584(class46.field910.field2094, 0, var65);
                                                    class46.field910.field2091 = 0;
                                                    class154 var68 = class46.field910;
                                                    String var72;
                                                    try {
                                                        int var69 = var68.method2586();
                                                        if (var69 > 32767) {
                                                            var69 = 32767;
                                                        }
                                                        byte[] var70 = new byte[var69];
                                                        var68.field2091 += Statics.field3115.method2502(var68.field2094, var68.field2091, var70, 0, var69);
                                                        String var71 = class204.method2362(var70, 0, var69);
                                                        var72 = var71;
                                                    } catch (Exception var593) {
                                                        var72 = "Cabbage";
                                                    }
                                                    String var75 = class210.method3572(class208.method3006(var72));
                                                    var40.field649 = var75.trim();
                                                    var40.field616 = var62 >> 8;
                                                    var40.field617 = var62 & 0xFF;
                                                    var40.field615 = 150;
                                                    var40.field613 = var64;
                                                    var40.field614 = Statics.field810 != var40 && var63.field2669 && field533 != "" && var75.toLowerCase().indexOf(field533) == -1;
                                                    int var76;
                                                    if (var63.field2667) {
                                                        var76 = var64 ? 91 : 1;
                                                    } else {
                                                        var76 = var64 ? 90 : 2;
                                                    }
                                                    if (var63.field2660 == -1) {
                                                        class48.method3375(var76, var40.field241, var75);
                                                    } else {
                                                        class48.method3375(var76, class38.method57(var63.field2660) + var40.field241, var75);
                                                    }
                                                }
                                            }
                                            var35.field2091 = var65 + var66;
                                        }
                                        if ((var41 & 0x1000) != 0) {
                                            var40.field635 = var35.method2575();
                                            int var77 = var35.method2658();
                                            var40.field640 = var77 >> 16;
                                            var40.field639 = (var77 & 0xFFFF) + field294;
                                            var40.field637 = 0;
                                            var40.field638 = 0;
                                            if (var40.field639 > field294) {
                                                var40.field637 = -1;
                                            }
                                            if (var40.field635 == 65535) {
                                                var40.field635 = -1;
                                            }
                                        }
                                        if ((var41 & 0x400) != 0) {
                                            var40.field607 = var35.method2574();
                                            var40.field643 = var35.method2574();
                                            var40.field642 = var35.method2574();
                                            var40.field644 = var35.method2574();
                                            var40.field603 = var35.method2575() + field294;
                                            var40.field646 = var35.method2575() + field294;
                                            var40.field654 = var35.method2575();
                                            if (var40.field264) {
                                                var40.field607 += var40.field265;
                                                var40.field643 += var40.field266;
                                                var40.field642 += var40.field265;
                                                var40.field644 += var40.field266;
                                                var40.field653 = 0;
                                            } else {
                                                var40.field607 += var40.field632[0];
                                                var40.field643 += var40.field655[0];
                                                var40.field642 += var40.field632[0];
                                                var40.field644 += var40.field655[0];
                                                var40.field653 = 1;
                                            }
                                            var40.field608 = 0;
                                        }
                                        if ((var41 & 0x800) != 0) {
                                            class46.field914[var39] = var35.method2574();
                                        }
                                        if ((var41 & 0x200) != 0) {
                                            var42 = var35.method2574();
                                        }
                                        if ((var41 & 0x100) != 0) {
                                            for (int var78 = 0; var78 < 3; var78++) {
                                                var40.field245[var78] = var35.method2581();
                                            }
                                        }
                                        if (var40.field264) {
                                            if (var42 == 127) {
                                                var40.method236(var40.field265, var40.field266);
                                            } else {
                                                byte var79;
                                                if (var42 == -1) {
                                                    var79 = class46.field914[var39];
                                                } else {
                                                    var79 = var42;
                                                }
                                                var40.method222(var40.field265, var40.field266, var79);
                                            }
                                        }
                                    }
                                    if (var35.field2091 - var37 != var36) {
                                        throw new RuntimeException(var35.field2091 - var37 + " " + var36);
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 255) {
                                    int var80 = field545.method2611();
                                    int var81 = field545.method2620();
                                    class170 var82 = class170.method3227(var81);
                                    if (var82.field2306 != 1 || var82.field2253 != var80) {
                                        var82.field2306 = 1;
                                        var82.field2253 = var80;
                                        method1788(var82);
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 211) {
                                    Statics.field1600 = field545.method2573();
                                    Statics.field778 = field545.method2600();
                                    for (int var83 = Statics.field778; var83 < Statics.field778 + 8; var83++) {
                                        for (int var84 = Statics.field1600; var84 < Statics.field1600 + 8; var84++) {
                                            if (field420[Statics.field2355][var83][var84] != null) {
                                                field420[Statics.field2355][var83][var84] = null;
                                                method82(var83, var84);
                                            }
                                        }
                                    }
                                    for (class26 var85 = (class26) field371.method2209(); var85 != null; var85 = (class26) field371.method2211()) {
                                        if (var85.field575 >= Statics.field778 && var85.field575 < Statics.field778 + 8 && var85.field582 >= Statics.field1600 && var85.field582 < Statics.field1600 + 8 && Statics.field2355 == var85.field587) {
                                            var85.field579 = 0;
                                        }
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 71) {
                                    method3655(true);
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 57) {
                                    boolean var86 = field545.method2573() == 1;
                                    if (var86) {
                                        Statics.field3062 = class156.method1307() - field545.method2680();
                                        Statics.field750 = new class2(field545, true);
                                    } else {
                                        Statics.field750 = null;
                                    }
                                    field447 = field472;
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 125) {
                                    class228.method3175(field545, field486);
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 196) {
                                    int var87 = field545.method2586();
                                    boolean var88 = field545.method2573() == 1;
                                    String var89 = "";
                                    boolean var90 = false;
                                    if (var88) {
                                        var89 = field545.method2581();
                                        if (method3193(var89)) {
                                            var90 = true;
                                        }
                                    }
                                    String var91 = field545.method2581();
                                    if (!var90) {
                                        class48.method3375(var87, var89, var91);
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 73) {
                                    field555 = 1;
                                    field480 = field472;
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 45) {
                                    String var92 = field545.method2581();
                                    long var93 = (long) field545.method2575();
                                    long var95 = (long) field545.method2706();
                                    class178 var97 = (class178) class149.method162(class178.method182(), field545.method2573());
                                    long var98 = (var93 << 32) + var95;
                                    boolean var100 = false;
                                    for (int var101 = 0; var101 < 100; var101++) {
                                        if (field444[var101] == var98) {
                                            var100 = true;
                                            break;
                                        }
                                    }
                                    if (method3193(var92)) {
                                        var100 = true;
                                    }
                                    if (!var100 && field408 == 0) {
                                        field444[field509] = var98;
                                        field509 = (field509 + 1) % 100;
                                        class160 var102 = field545;
                                        String var106;
                                        try {
                                            int var103 = var102.method2586();
                                            if (var103 > 32767) {
                                                var103 = 32767;
                                            }
                                            byte[] var104 = new byte[var103];
                                            var102.field2091 += Statics.field3115.method2502(var102.field2094, var102.field2091, var104, 0, var103);
                                            String var105 = class204.method2362(var104, 0, var103);
                                            var106 = var105;
                                        } catch (Exception var592) {
                                            var106 = "Cabbage";
                                        }
                                        String var109 = class210.method3572(class208.method3006(var106));
                                        byte var110;
                                        if (var97.field2667) {
                                            var110 = 7;
                                        } else {
                                            var110 = 3;
                                        }
                                        if (var97.field2660 == -1) {
                                            class48.method3375(var110, var92, var109);
                                        } else {
                                            int var112 = var97.field2660;
                                            String var113 = "<img=" + var112 + ">";
                                            class48.method3375(var110, var113 + var92, var109);
                                        }
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 251) {
                                    method2771();
                                    field360 = field545.method2576();
                                    field477 = field472;
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 19) {
                                    String var114 = field545.method2581();
                                    long var115 = field545.method2680();
                                    long var117 = (long) field545.method2575();
                                    long var119 = (long) field545.method2706();
                                    class178 var121 = (class178) class149.method162(class178.method182(), field545.method2573());
                                    long var122 = (var117 << 32) + var119;
                                    boolean var124 = false;
                                    for (int var125 = 0; var125 < 100; var125++) {
                                        if (field444[var125] == var122) {
                                            var124 = true;
                                            break;
                                        }
                                    }
                                    if (var121.field2669 && method3193(var114)) {
                                        var124 = true;
                                    }
                                    if (!var124 && field408 == 0) {
                                        field444[field509] = var122;
                                        field509 = (field509 + 1) % 100;
                                        class160 var126 = field545;
                                        String var130;
                                        try {
                                            int var127 = var126.method2586();
                                            if (var127 > 32767) {
                                                var127 = 32767;
                                            }
                                            byte[] var128 = new byte[var127];
                                            var126.field2091 += Statics.field3115.method2502(var126.field2094, var126.field2091, var128, 0, var127);
                                            String var129 = class204.method2362(var128, 0, var127);
                                            var130 = var129;
                                        } catch (Exception var591) {
                                            var130 = "Cabbage";
                                        }
                                        String var133 = class210.method3572(class208.method3006(var130));
                                        if (var121.field2660 == -1) {
                                            class48.method164(9, var114, var133, class206.method2984(var115));
                                        } else {
                                            int var134 = var121.field2660;
                                            String var135 = "<img=" + var134 + ">";
                                            class48.method164(9, var135 + var114, var133, class206.method2984(var115));
                                        }
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 33) {
                                    while (field545.field2091 < field486) {
                                        int var136 = field545.method2573();
                                        boolean var137 = (var136 & 0x1) == 1;
                                        String var138 = field545.method2581();
                                        String var139 = field545.method2581();
                                        field545.method2581();
                                        for (int var140 = 0; var140 < field558; var140++) {
                                            class20 var141 = field349[var140];
                                            if (var137) {
                                                if (var139.equals(var141.field208)) {
                                                    var141.field208 = var138;
                                                    var141.field205 = var139;
                                                    var138 = null;
                                                    break;
                                                }
                                            } else if (var138.equals(var141.field208)) {
                                                var141.field208 = var138;
                                                var141.field205 = var139;
                                                var138 = null;
                                                break;
                                            }
                                        }
                                        if (var138 != null && field558 < 400) {
                                            class20 var142 = new class20();
                                            field349[field558] = var142;
                                            var142.field208 = var138;
                                            var142.field205 = var139;
                                            field558++;
                                        }
                                    }
                                    field480 = field472;
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 123) {
                                    int var143 = field545.method2621();
                                    Statics.field61 = Statics.field856.method1816(var143);
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 31) {
                                    int var144 = field545.method2620();
                                    int var145 = field545.method2575();
                                    int var146 = field545.method2573();
                                    class18 var147 = (class18) field448.method2161((long) var144);
                                    if (var147 != null) {
                                        method561(var147, var147.field178 != var145);
                                    }
                                    method235(var144, var145, var146);
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 248) {
                                    Statics.field778 = field545.method2600();
                                    Statics.field1600 = field545.method2573();
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 141) {
                                    class46.method2868();
                                    for (int var148 = 0; var148 < 2048; var148++) {
                                        field409[var148] = null;
                                    }
                                    class46.method440(field545);
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 43) {
                                    int var149 = field545.method2658();
                                    int var150 = field545.method2575();
                                    if (var149 < -70000) {
                                        var150 += 32768;
                                    }
                                    class170 var151;
                                    if (var149 >= 0) {
                                        var151 = class170.method3227(var149);
                                    } else {
                                        var151 = null;
                                    }
                                    if (var151 != null) {
                                        for (int var152 = 0; var152 < var151.field2285.length; var152++) {
                                            var151.field2285[var152] = 0;
                                            var151.field2340[var152] = 0;
                                        }
                                    }
                                    class13 var153 = (class13) class13.field126.method2161((long) var150);
                                    if (var153 != null) {
                                        for (int var154 = 0; var154 < var153.field125.length; var154++) {
                                            var153.field125[var154] = -1;
                                            var153.field127[var154] = 0;
                                        }
                                    }
                                    int var155 = field545.method2575();
                                    for (int var156 = 0; var156 < var155; var156++) {
                                        int var157 = field545.method2600();
                                        if (var157 == 255) {
                                            var157 = field545.method2658();
                                        }
                                        int var158 = field545.method2575();
                                        if (var151 != null && var156 < var151.field2285.length) {
                                            var151.field2285[var156] = var158;
                                            var151.field2340[var156] = var157;
                                        }
                                        class13.method854(var150, var156, var158 - 1, var157);
                                    }
                                    if (var151 != null) {
                                        method1788(var151);
                                    }
                                    method2771();
                                    field475[++field366 - 1 & 0x1F] = var150 & 0x7FFF;
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 177) {
                                    method3655(false);
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 169) {
                                    int var159 = field486 + field545.field2091;
                                    int var160 = field545.method2575();
                                    int var161 = field545.method2575();
                                    if (field543 != var160) {
                                        field543 = var160;
                                        method699(false);
                                        method2284(field543);
                                        class33.method2992(field543);
                                        for (int var162 = 0; var162 < 100; var162++) {
                                            field525[var162] = true;
                                        }
                                    }
                                    while (var161-- > 0) {
                                        int var163 = field545.method2658();
                                        int var164 = field545.method2575();
                                        int var165 = field545.method2573();
                                        class18 var166 = (class18) field448.method2161((long) var163);
                                        if (var166 != null && var166.field178 != var164) {
                                            method561(var166, true);
                                            var166 = null;
                                        }
                                        if (var166 == null) {
                                            var166 = method235(var163, var164, var165);
                                        }
                                        var166.field179 = true;
                                    }
                                    for (class18 var167 = (class18) field448.method2163(); var167 != null; var167 = (class18) field448.method2171()) {
                                        if (var167.field179) {
                                            var167.field179 = false;
                                        } else {
                                            method561(var167, true);
                                        }
                                    }
                                    field489 = new class126(512);
                                    while (field545.field2091 < var159) {
                                        int var168 = field545.method2658();
                                        int var169 = field545.method2575();
                                        int var170 = field545.method2575();
                                        int var171 = field545.method2658();
                                        for (int var172 = var169; var172 <= var170; var172++) {
                                            long var173 = ((long) var168 << 32) + (long) var172;
                                            field489.method2162(new class134(var171), var173);
                                        }
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 112) {
                                    int var175 = field545.method2704();
                                    int var176 = field545.method2575();
                                    class170 var177 = class170.method3227(var175);
                                    if (var177.field2306 != 2 || var177.field2253 != var176) {
                                        var177.field2306 = 2;
                                        var177.field2253 = var176;
                                        method1788(var177);
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 24) {
                                    String var178 = field545.method2581();
                                    class160 var179 = field545;
                                    String var183;
                                    try {
                                        int var180 = var179.method2586();
                                        if (var180 > 32767) {
                                            var180 = 32767;
                                        }
                                        byte[] var181 = new byte[var180];
                                        var179.field2091 += Statics.field3115.method2502(var179.field2094, var179.field2091, var181, 0, var180);
                                        String var182 = class204.method2362(var181, 0, var180);
                                        var183 = var182;
                                    } catch (Exception var590) {
                                        var183 = "Cabbage";
                                    }
                                    String var186 = class210.method3572(class208.method3006(var183));
                                    class48.method3375(6, var178, var186);
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 113) {
                                    field521 = field545.method2573();
                                    if (field521 == 255) {
                                        field521 = 0;
                                    }
                                    field522 = field545.method2573();
                                    if (field522 == 255) {
                                        field522 = 0;
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 35) {
                                    int var187 = field545.method2575();
                                    field543 = var187;
                                    method699(false);
                                    method2284(var187);
                                    class33.method2992(field543);
                                    for (int var188 = 0; var188 < 100; var188++) {
                                        field525[var188] = true;
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 137) {
                                    field505 = field545.method2573();
                                    field506 = field545.method2573();
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 128) {
                                    for (int var189 = 0; var189 < class166.field2169.length; var189++) {
                                        if (class166.field2170[var189] != class166.field2169[var189]) {
                                            class166.field2169[var189] = class166.field2170[var189];
                                            method820(var189);
                                            field473[++field433 - 1 & 0x1F] = var189;
                                        }
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 162) {
                                    int var190 = field545.method2658();
                                    class170 var191 = class170.method3227(var190);
                                    var191.field2306 = 3;
                                    var191.field2253 = Statics.field810.field269.method2894();
                                    method1788(var191);
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 130) {
                                    int var192 = field545.method2658();
                                    int var193 = field545.method2609();
                                    int var194 = var193 >> 10 & 0x1F;
                                    int var195 = var193 >> 5 & 0x1F;
                                    int var196 = var193 & 0x1F;
                                    int var197 = (var196 << 3) + (var194 << 19) + (var195 << 11);
                                    class170 var198 = class170.method3227(var192);
                                    if (var198.field2234 != var197) {
                                        var198.field2234 = var197;
                                        method1788(var198);
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 189) {
                                    int var199 = field545.method2658();
                                    int var200 = field545.method2575();
                                    if (var199 < -70000) {
                                        var200 += 32768;
                                    }
                                    class170 var201;
                                    if (var199 >= 0) {
                                        var201 = class170.method3227(var199);
                                    } else {
                                        var201 = null;
                                    }
                                    while (field545.field2091 < field486) {
                                        int var202 = field545.method2586();
                                        int var203 = field545.method2575();
                                        int var204 = 0;
                                        if (var203 != 0) {
                                            var204 = field545.method2573();
                                            if (var204 == 255) {
                                                var204 = field545.method2658();
                                            }
                                        }
                                        if (var201 != null && var202 >= 0 && var202 < var201.field2285.length) {
                                            var201.field2285[var202] = var203;
                                            var201.field2340[var202] = var204;
                                        }
                                        class13.method854(var200, var202, var203 - 1, var204);
                                    }
                                    if (var201 != null) {
                                        method1788(var201);
                                    }
                                    method2771();
                                    field475[++field366 - 1 & 0x1F] = var200 & 0x7FFF;
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 254) {
                                    int var205 = field545.method2575();
                                    int var206 = field545.method2573();
                                    int var207 = field545.method2575();
                                    if (field483 != 0 && var206 != 0 && field529 < 50) {
                                        field530[field529] = var205;
                                        field410[field529] = var206;
                                        field440[field529] = var207;
                                        field534[field529] = null;
                                        field484[field529] = 0;
                                        field529++;
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 160) {
                                    String var211 = field545.method2581();
                                    Statics.field757 = var211;
                                    try {
                                        String var212 = Statics.field283.getParameter(class215.field3157.field3160);
                                        String var213 = Statics.field283.getParameter(class215.field3148.field3160);
                                        String var214 = var212 + "settings=" + var211 + "; version=1; path=/; domain=" + var213;
                                        String var215;
                                        if (var211.length() == 0) {
                                            var215 = var214 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                                        } else {
                                            var215 = var214 + "; Expires=" + class163.method70(class156.method1307() + 94608000000L) + "; Max-Age=" + 94608000L;
                                        }
                                        Statics.method1803(Statics.field283, "document.cookie=\"" + var215 + "\"");
                                    } catch (Throwable var589) {
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 111) {
                                    field523 = field545.method2573();
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 163) {
                                    field535 = true;
                                    Statics.field1579 = field545.method2573();
                                    Statics.field745 = field545.method2573();
                                    Statics.field2039 = field545.method2575();
                                    Statics.field922 = field545.method2573();
                                    Statics.field35 = field545.method2573();
                                    if (Statics.field35 >= 100) {
                                        Statics.field184 = Statics.field1579 * 128 + 64;
                                        Statics.field30 = Statics.field745 * 128 + 64;
                                        Statics.field234 = method1608(Statics.field184, Statics.field30, Statics.field2355) - Statics.field2039;
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 103) {
                                    int var217 = field545.method2704();
                                    class170 var218 = class170.method3227(var217);
                                    for (int var219 = 0; var219 < var218.field2285.length; var219++) {
                                        var218.field2285[var219] = -1;
                                        var218.field2285[var219] = 0;
                                    }
                                    method1788(var218);
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 250) {
                                    int var220 = field545.method2658();
                                    int var221 = field545.method2658();
                                    if (Statics.field2700 == null || !Statics.field2700.isValid()) {
                                        try {
                                            Iterator var222 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                            while (var222.hasNext()) {
                                                GarbageCollectorMXBean var223 = (GarbageCollectorMXBean) var222.next();
                                                if (var223.isValid()) {
                                                    Statics.field2700 = var223;
                                                    field565 = -1L;
                                                    field460 = -1L;
                                                }
                                            }
                                        } catch (Throwable var597) {
                                        }
                                    }
                                    long var225 = class156.method1307();
                                    int var227 = -1;
                                    if (Statics.field2700 != null) {
                                        long var228 = Statics.field2700.getCollectionTime();
                                        if (field460 != -1L) {
                                            long var230 = var228 - field460;
                                            long var232 = var225 - field565;
                                            if (var232 != 0L) {
                                                var227 = (int) (var230 * 100L / var232);
                                            }
                                        }
                                        field460 = var228;
                                        field565 = var225;
                                    }
                                    field295.method2783(160);
                                    field295.method2707(var220);
                                    field295.method2707(var221);
                                    field295.method2599(field1765);
                                    field295.method2746(var227);
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 133) {
                                    String var234 = field545.method2581();
                                    int var235 = field545.method2737();
                                    int var236 = field545.method2602();
                                    if (var236 >= 1 && var236 <= 8) {
                                        if (var234.equalsIgnoreCase("null")) {
                                            var234 = null;
                                        }
                                        field416[var236 - 1] = var234;
                                        field417[var236 - 1] = var235 == 0;
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 51 || field332 == 203 || field332 == 18 || field332 == 16 || field332 == 215 || field332 == 216 || field332 == 83 || field332 == 155 || field332 == 218 || field332 == 192) {
                                    method762();
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 53) {
                                    int var237 = field545.method2564();
                                    class13 var238 = (class13) class13.field126.method2161((long) var237);
                                    if (var238 != null) {
                                        var238.method2200();
                                    }
                                    field475[++field366 - 1 & 0x1F] = var237 & 0x7FFF;
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 180) {
                                    if (field543 != -1) {
                                        method653(field543, 0);
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 238) {
                                    while (field545.field2091 < field486) {
                                        boolean var239 = field545.method2573() == 1;
                                        String var240 = field545.method2581();
                                        String var241 = field545.method2581();
                                        int var242 = field545.method2575();
                                        int var243 = field545.method2573();
                                        int var244 = field545.method2573();
                                        boolean var245 = (var244 & 0x2) != 0;
                                        boolean var246 = (var244 & 0x1) != 0;
                                        if (var242 > 0) {
                                            field545.method2581();
                                            field545.method2573();
                                            field545.method2658();
                                        }
                                        field545.method2581();
                                        for (int var247 = 0; var247 < field554; var247++) {
                                            class15 var248 = field556[var247];
                                            if (var239) {
                                                if (var241.equals(var248.field156)) {
                                                    var248.field156 = var240;
                                                    var248.field148 = var241;
                                                    var240 = null;
                                                    break;
                                                }
                                            } else if (var240.equals(var248.field156)) {
                                                if (var248.field147 != var242) {
                                                    boolean var249 = true;
                                                    for (class17 var250 = (class17) field557.method2249(); var250 != null; var250 = (class17) field557.method2245()) {
                                                        if (var250.field170.equals(var240)) {
                                                            if (var242 != 0 && var250.field176 == 0) {
                                                                var250.method2256();
                                                                var249 = false;
                                                            } else if (var242 == 0 && var250.field176 != 0) {
                                                                var250.method2256();
                                                                var249 = false;
                                                            }
                                                        }
                                                    }
                                                    if (var249) {
                                                        field557.method2243(new class17(var240, var242));
                                                    }
                                                    var248.field147 = var242;
                                                }
                                                var248.field148 = var241;
                                                var248.field146 = var243;
                                                var248.field158 = var245;
                                                var248.field150 = var246;
                                                var240 = null;
                                                break;
                                            }
                                        }
                                        if (var240 != null && field554 < 400) {
                                            class15 var251 = new class15();
                                            field556[field554] = var251;
                                            var251.field156 = var240;
                                            var251.field148 = var241;
                                            var251.field147 = var242;
                                            var251.field146 = var243;
                                            var251.field158 = var245;
                                            var251.field150 = var246;
                                            field554++;
                                        }
                                    }
                                    field555 = 2;
                                    field480 = field472;
                                    boolean var252 = false;
                                    int var253 = field554;
                                    while (var253 > 0) {
                                        boolean var254 = true;
                                        var253--;
                                        for (int var255 = 0; var255 < var253; var255++) {
                                            boolean var256 = false;
                                            class15 var257 = field556[var255];
                                            class15 var258 = field556[var255 + 1];
                                            if (field500 != var257.field147 && field500 == var258.field147) {
                                                var256 = true;
                                            }
                                            if (!var256 && var257.field147 == 0 && var258.field147 != 0) {
                                                var256 = true;
                                            }
                                            if (!var256 && !var257.field158 && var258.field158) {
                                                var256 = true;
                                            }
                                            if (!var256 && !var257.field150 && var258.field150) {
                                                var256 = true;
                                            }
                                            if (var256) {
                                                class15 var259 = field556[var255];
                                                field556[var255] = field556[var255 + 1];
                                                field556[var255 + 1] = var259;
                                                var254 = false;
                                            }
                                        }
                                        if (var254) {
                                            break;
                                        }
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 142) {
                                    int var260 = field545.method2564();
                                    int var261 = field545.method2575();
                                    int var262 = field545.method2621();
                                    class170 var263 = class170.method3227(var262);
                                    var263.field2245 = (var260 << 16) + var261;
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 32) {
                                    byte var264 = field545.method2734();
                                    int var265 = field545.method2564();
                                    class166.field2170[var265] = var264;
                                    if (class166.field2169[var265] != var264) {
                                        class166.field2169[var265] = var264;
                                    }
                                    method820(var265);
                                    field473[++field433 - 1 & 0x1F] = var265;
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 84) {
                                    field535 = true;
                                    Statics.field3073 = field545.method2573();
                                    Statics.field2681 = field545.method2573();
                                    Statics.field2106 = field545.method2575();
                                    Statics.field1843 = field545.method2573();
                                    Statics.field892 = field545.method2573();
                                    if (Statics.field892 >= 100) {
                                        int var266 = Statics.field3073 * 128 + 64;
                                        int var267 = Statics.field2681 * 128 + 64;
                                        int var268 = method1608(var266, var267, Statics.field2355) - Statics.field2106;
                                        int var269 = var266 - Statics.field184;
                                        int var270 = var268 - Statics.field234;
                                        int var271 = var267 - Statics.field30;
                                        int var272 = (int) Math.sqrt((double) (var269 * var269 + var271 * var271));
                                        Statics.field2098 = (int) (Math.atan2((double) var270, (double) var272) * 325.949D) & 0x7FF;
                                        Statics.field811 = (int) (Math.atan2((double) var269, (double) var271) * -325.949D) & 0x7FF;
                                        if (Statics.field2098 < 128) {
                                            Statics.field2098 = 128;
                                        }
                                        if (Statics.field2098 > 383) {
                                            Statics.field2098 = 383;
                                        }
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 27) {
                                    method2771();
                                    int var273 = field545.method2600();
                                    int var274 = field545.method2600();
                                    int var275 = field545.method2621();
                                    field426[var274] = var275;
                                    field424[var274] = var273;
                                    field425[var274] = 1;
                                    for (int var276 = 0; var276 < 98; var276++) {
                                        if (var275 >= class173.field2358[var276]) {
                                            field425[var274] = var276 + 2;
                                        }
                                    }
                                    field286[++field380 - 1 & 0x1F] = var274;
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 131) {
                                    int var277 = field545.method2658();
                                    int var278 = field545.method2612();
                                    int var279 = field545.method2613();
                                    class170 var280 = class170.method3227(var277);
                                    if (var280.field2289 != var278 || var280.field2219 != var279 || var280.field2214 != 0 || var280.field2215 != 0) {
                                        var280.field2289 = var278;
                                        var280.field2219 = var279;
                                        var280.field2214 = 0;
                                        var280.field2215 = 0;
                                        method1788(var280);
                                        method1609(var280);
                                        if (var280.field2211 == 0) {
                                            method19(Statics.field2298[var277 >> 16], var280, false);
                                        }
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 194) {
                                    method2066(false);
                                    field545.method2782();
                                    int var281 = field545.method2575();
                                    class160 var282 = field545;
                                    int var283 = var282.field2091;
                                    class46.field925 = 0;
                                    class46.method2982(var282);
                                    for (int var284 = 0; var284 < class46.field925; var284++) {
                                        int var285 = class46.field918[var284];
                                        class24 var286 = field409[var285];
                                        int var287 = var282.method2573();
                                        if ((var287 & 0x40) != 0) {
                                            var287 += var282.method2573() << 8;
                                        }
                                        byte var288 = -1;
                                        if ((var287 & 0x2) != 0) {
                                            int var289 = var282.method2573();
                                            byte[] var290 = new byte[var289];
                                            class154 var291 = new class154(var290);
                                            var282.method2584(var290, 0, var289);
                                            class46.field908[var285] = var291;
                                            var286.method209(var291);
                                        }
                                        if ((var287 & 0x20) != 0) {
                                            int var292 = var282.method2575();
                                            if (var292 == 65535) {
                                                var292 = -1;
                                            }
                                            int var293 = var282.method2573();
                                            method39(var286, var292, var293);
                                        }
                                        if ((var287 & 0x4) != 0) {
                                            var286.field625 = var282.method2575();
                                            if (var286.field625 == 65535) {
                                                var286.field625 = -1;
                                            }
                                        }
                                        if ((var287 & 0x1) != 0) {
                                            var286.field649 = var282.method2581();
                                            if (var286.field649.charAt(0) == '~') {
                                                var286.field649 = var286.field649.substring(1);
                                                class48.method3375(2, var286.field241, var286.field649);
                                            } else if (Statics.field810 == var286) {
                                                class48.method3375(2, var286.field241, var286.field649);
                                            }
                                            var286.field613 = false;
                                            var286.field616 = 0;
                                            var286.field617 = 0;
                                            var286.field615 = 150;
                                        }
                                        if ((var287 & 0x80) != 0) {
                                            int var294 = var282.method2573();
                                            if (var294 > 0) {
                                                for (int var295 = 0; var295 < var294; var295++) {
                                                    int var296 = -1;
                                                    int var297 = -1;
                                                    int var298 = -1;
                                                    int var299 = var282.method2586();
                                                    if (var299 == 32767) {
                                                        var299 = var282.method2586();
                                                        var297 = var282.method2586();
                                                        var296 = var282.method2586();
                                                        var298 = var282.method2586();
                                                    } else if (var299 == 32766) {
                                                        var299 = -1;
                                                    } else {
                                                        var297 = var282.method2586();
                                                    }
                                                    int var300 = var282.method2586();
                                                    var286.method565(var299, var297, var296, var298, field294, var300);
                                                }
                                            }
                                            int var301 = var282.method2573();
                                            if (var301 > 0) {
                                                for (int var302 = 0; var302 < var301; var302++) {
                                                    int var303 = var282.method2586();
                                                    int var304 = var282.method2586();
                                                    if (var304 == 32767) {
                                                        var286.method567(var303);
                                                    } else {
                                                        int var305 = var282.method2586();
                                                        int var306 = var282.method2573();
                                                        int var307 = var304 > 0 ? var282.method2573() : var306;
                                                        var286.method566(var303, field294, var304, var305, var306, var307);
                                                    }
                                                }
                                            }
                                        }
                                        if ((var287 & 0x8) != 0) {
                                            var286.field627 = var282.method2575();
                                            if (var286.field653 == 0) {
                                                var286.field650 = var286.field627;
                                                var286.field627 = -1;
                                            }
                                        }
                                        if ((var287 & 0x10) != 0) {
                                            int var308 = var282.method2575();
                                            class178 var309 = (class178) class149.method162(class178.method182(), var282.method2573());
                                            boolean var310 = var282.method2573() == 1;
                                            int var311 = var282.method2573();
                                            int var312 = var282.field2091;
                                            if (var286.field241 != null && var286.field269 != null) {
                                                boolean var313 = false;
                                                if (var309.field2669 && method3193(var286.field241)) {
                                                    var313 = true;
                                                }
                                                if (!var313 && field408 == 0 && !var286.field246) {
                                                    class46.field910.field2091 = 0;
                                                    var282.method2584(class46.field910.field2094, 0, var311);
                                                    class46.field910.field2091 = 0;
                                                    class154 var314 = class46.field910;
                                                    String var318;
                                                    try {
                                                        int var315 = var314.method2586();
                                                        if (var315 > 32767) {
                                                            var315 = 32767;
                                                        }
                                                        byte[] var316 = new byte[var315];
                                                        var314.field2091 += Statics.field3115.method2502(var314.field2094, var314.field2091, var316, 0, var315);
                                                        String var317 = class204.method2362(var316, 0, var315);
                                                        var318 = var317;
                                                    } catch (Exception var588) {
                                                        var318 = "Cabbage";
                                                    }
                                                    String var321 = class210.method3572(class208.method3006(var318));
                                                    var286.field649 = var321.trim();
                                                    var286.field616 = var308 >> 8;
                                                    var286.field617 = var308 & 0xFF;
                                                    var286.field615 = 150;
                                                    var286.field613 = var310;
                                                    var286.field614 = Statics.field810 != var286 && var309.field2669 && field533 != "" && var321.toLowerCase().indexOf(field533) == -1;
                                                    int var322;
                                                    if (var309.field2667) {
                                                        var322 = var310 ? 91 : 1;
                                                    } else {
                                                        var322 = var310 ? 90 : 2;
                                                    }
                                                    if (var309.field2660 == -1) {
                                                        class48.method3375(var322, var286.field241, var321);
                                                    } else {
                                                        class48.method3375(var322, class38.method57(var309.field2660) + var286.field241, var321);
                                                    }
                                                }
                                            }
                                            var282.field2091 = var311 + var312;
                                        }
                                        if ((var287 & 0x1000) != 0) {
                                            var286.field635 = var282.method2575();
                                            int var323 = var282.method2658();
                                            var286.field640 = var323 >> 16;
                                            var286.field639 = (var323 & 0xFFFF) + field294;
                                            var286.field637 = 0;
                                            var286.field638 = 0;
                                            if (var286.field639 > field294) {
                                                var286.field637 = -1;
                                            }
                                            if (var286.field635 == 65535) {
                                                var286.field635 = -1;
                                            }
                                        }
                                        if ((var287 & 0x400) != 0) {
                                            var286.field607 = var282.method2574();
                                            var286.field643 = var282.method2574();
                                            var286.field642 = var282.method2574();
                                            var286.field644 = var282.method2574();
                                            var286.field603 = var282.method2575() + field294;
                                            var286.field646 = var282.method2575() + field294;
                                            var286.field654 = var282.method2575();
                                            if (var286.field264) {
                                                var286.field607 += var286.field265;
                                                var286.field643 += var286.field266;
                                                var286.field642 += var286.field265;
                                                var286.field644 += var286.field266;
                                                var286.field653 = 0;
                                            } else {
                                                var286.field607 += var286.field632[0];
                                                var286.field643 += var286.field655[0];
                                                var286.field642 += var286.field632[0];
                                                var286.field644 += var286.field655[0];
                                                var286.field653 = 1;
                                            }
                                            var286.field608 = 0;
                                        }
                                        if ((var287 & 0x800) != 0) {
                                            class46.field914[var285] = var282.method2574();
                                        }
                                        if ((var287 & 0x200) != 0) {
                                            var288 = var282.method2574();
                                        }
                                        if ((var287 & 0x100) != 0) {
                                            for (int var324 = 0; var324 < 3; var324++) {
                                                var286.field245[var324] = var282.method2581();
                                            }
                                        }
                                        if (var286.field264) {
                                            if (var288 == 127) {
                                                var286.method236(var286.field265, var286.field266);
                                            } else {
                                                byte var325;
                                                if (var288 == -1) {
                                                    var325 = class46.field914[var285];
                                                } else {
                                                    var325 = var288;
                                                }
                                                var286.method222(var286.field265, var286.field266, var325);
                                            }
                                        }
                                    }
                                    if (var282.field2091 - var283 != var281) {
                                        throw new RuntimeException(var282.field2091 - var283 + " " + var281);
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 50) {
                                    int var326 = field545.method2573();
                                    class217[] var327 = class217.method700();
                                    int var328 = 0;
                                    class217 var330;
                                    while (true) {
                                        if (var328 >= var327.length) {
                                            var330 = null;
                                            break;
                                        }
                                        class217 var329 = var327[var328];
                                        if (var329.field3167 == var326) {
                                            var330 = var329;
                                            break;
                                        }
                                        var328++;
                                    }
                                    Statics.field890 = var330;
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 124) {
                                    String var331 = field545.method2581();
                                    int var332 = field545.method2575();
                                    byte var333 = field545.method2574();
                                    boolean var334 = false;
                                    if (var333 == -128) {
                                        var334 = true;
                                    }
                                    if (var334) {
                                        if (Statics.field137 == 0) {
                                            field332 = -1;
                                            var5 = true;
                                            break label3761;
                                        }
                                        boolean var335 = false;
                                        int var336;
                                        for (var336 = 0; var336 < Statics.field137 && (!Statics.field77[var336].field278.equals(var331) || Statics.field77[var336].field270 != var332); var336++) {
                                        }
                                        if (var336 < Statics.field137) {
                                            while (var336 < Statics.field137 - 1) {
                                                Statics.field77[var336] = Statics.field77[var336 + 1];
                                                var336++;
                                            }
                                            Statics.field137--;
                                            Statics.field77[Statics.field137] = null;
                                        }
                                    } else {
                                        field545.method2581();
                                        class25 var337 = new class25();
                                        var337.field278 = var331;
                                        var337.field272 = Statics.method2096(var337.field278, Statics.field1725);
                                        var337.field270 = var332;
                                        var337.field279 = var333;
                                        int var338;
                                        for (var338 = Statics.field137 - 1; var338 >= 0; var338--) {
                                            int var339 = Statics.field77[var338].field272.compareTo(var337.field272);
                                            if (var339 == 0) {
                                                Statics.field77[var338].field270 = var332;
                                                Statics.field77[var338].field279 = var333;
                                                if (var331.equals(Statics.field810.field241)) {
                                                    Statics.field219 = var333;
                                                }
                                                field481 = field472;
                                                field332 = -1;
                                                var5 = true;
                                                break label3761;
                                            }
                                            if (var339 < 0) {
                                                break;
                                            }
                                        }
                                        if (Statics.field137 >= Statics.field77.length) {
                                            field332 = -1;
                                            var5 = true;
                                            break label3761;
                                        }
                                        for (int var340 = Statics.field137 - 1; var340 > var338; var340--) {
                                            Statics.field77[var340 + 1] = Statics.field77[var340];
                                        }
                                        if (Statics.field137 == 0) {
                                            Statics.field77 = new class25[100];
                                        }
                                        Statics.field77[var338 + 1] = var337;
                                        Statics.field137++;
                                        if (var331.equals(Statics.field810.field241)) {
                                            Statics.field219 = var333;
                                        }
                                    }
                                    field481 = field472;
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 237) {
                                    int var341 = field545.method2704();
                                    int var342 = field545.method2564();
                                    class170 var343 = class170.method3227(var341);
                                    if (var343 != null && var343.field2211 == 0) {
                                        if (var342 > var343.field2233 - var343.field2225) {
                                            var342 = var343.field2233 - var343.field2225;
                                        }
                                        if (var342 < 0) {
                                            var342 = 0;
                                        }
                                        if (var343.field2231 != var342) {
                                            var343.field2231 = var342;
                                            method1788(var343);
                                        }
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 75) {
                                    method147();
                                    field332 = -1;
                                    var5 = false;
                                    break label3761;
                                }
                                if (field332 == 167) {
                                    field481 = field472;
                                    if (field486 == 0) {
                                        field514 = null;
                                        field515 = null;
                                        Statics.field137 = 0;
                                        Statics.field77 = null;
                                        field332 = -1;
                                        var5 = true;
                                        break label3761;
                                    }
                                    field515 = field545.method2581();
                                    long var344 = field545.method2680();
                                    field514 = class206.method1779(var344);
                                    Statics.field684 = field545.method2574();
                                    int var346 = field545.method2573();
                                    if (var346 == 255) {
                                        field332 = -1;
                                        var5 = true;
                                        break label3761;
                                    }
                                    Statics.field137 = var346;
                                    class25[] var347 = new class25[100];
                                    for (int var348 = 0; var348 < Statics.field137; var348++) {
                                        var347[var348] = new class25();
                                        var347[var348].field278 = field545.method2581();
                                        var347[var348].field272 = Statics.method2096(var347[var348].field278, Statics.field1725);
                                        var347[var348].field270 = field545.method2575();
                                        var347[var348].field279 = field545.method2574();
                                        field545.method2581();
                                        if (var347[var348].field278.equals(Statics.field810.field241)) {
                                            Statics.field219 = var347[var348].field279;
                                        }
                                    }
                                    boolean var349 = false;
                                    int var350 = Statics.field137;
                                    while (var350 > 0) {
                                        boolean var351 = true;
                                        var350--;
                                        for (int var352 = 0; var352 < var350; var352++) {
                                            if (var347[var352].field272.compareTo(var347[var352 + 1].field272) > 0) {
                                                class25 var353 = var347[var352];
                                                var347[var352] = var347[var352 + 1];
                                                var347[var352 + 1] = var353;
                                                var351 = false;
                                            }
                                        }
                                        if (var351) {
                                            break;
                                        }
                                    }
                                    Statics.field77 = var347;
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 153) {
                                    boolean var354 = field545.method2573() == 1;
                                    int var355 = field545.method2621();
                                    class170 var356 = class170.method3227(var355);
                                    if (var356.field2315 != var354) {
                                        var356.field2315 = var354;
                                        method1788(var356);
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 198) {
                                    int var357 = field545.method2573();
                                    int var358 = field545.method2573();
                                    int var359 = field545.method2573();
                                    int var360 = field545.method2573();
                                    field536[var357] = true;
                                    field421[var357] = var358;
                                    field394[var357] = var359;
                                    field539[var357] = var360;
                                    field540[var357] = 0;
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 82) {
                                    String var361 = field545.method2581();
                                    Object[] var362 = new Object[var361.length() + 1];
                                    for (int var363 = var361.length() - 1; var363 >= 0; var363--) {
                                        if (var361.charAt(var363) == 's') {
                                            var362[var363 + 1] = field545.method2581();
                                        } else {
                                            var362[var363 + 1] = Integer.valueOf(field545.method2658());
                                        }
                                    }
                                    var362[0] = Integer.valueOf(field545.method2658());
                                    class19 var364 = new class19();
                                    var364.field189 = var362;
                                    class33.method192(var364);
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 220) {
                                    int var365 = field545.method2620();
                                    int var366 = field545.method2564();
                                    int var367 = field545.method2564();
                                    int var368 = field545.method2575();
                                    class170 var369 = class170.method3227(var365);
                                    if (var369.field2258 != var368 || var369.field2261 != var366 || var369.field2263 != var367) {
                                        var369.field2258 = var368;
                                        var369.field2261 = var366;
                                        var369.field2263 = var367;
                                        method1788(var369);
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 176) {
                                    class30 var370 = new class30();
                                    var370.field680 = field545.method2581();
                                    var370.field687 = field545.method2575();
                                    int var371 = field545.method2658();
                                    var370.field678 = var371;
                                    method59(45);
                                    Statics.field2119.method1915();
                                    Statics.field2119 = null;
                                    class42.method839(var370);
                                    field332 = -1;
                                    var5 = false;
                                    break label3761;
                                }
                                if (field332 == 170) {
                                    for (int var372 = 0; var372 < field409.length; var372++) {
                                        if (field409[var372] != null) {
                                            field409[var372].field631 = -1;
                                        }
                                    }
                                    for (int var373 = 0; var373 < field322.length; var373++) {
                                        if (field322[var373] != null) {
                                            field322[var373].field631 = -1;
                                        }
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 100) {
                                    int var374 = field545.method2658();
                                    int var375 = field545.method2658();
                                    class18 var376 = (class18) field448.method2161((long) var375);
                                    class18 var377 = (class18) field448.method2161((long) var374);
                                    if (var377 != null) {
                                        method561(var377, var376 == null || var376.field178 != var377.field178);
                                    }
                                    if (var376 != null) {
                                        var376.method2200();
                                        field448.method2162(var376, (long) var374);
                                    }
                                    class170 var378 = class170.method3227(var375);
                                    if (var378 != null) {
                                        method1788(var378);
                                    }
                                    class170 var379 = class170.method3227(var374);
                                    if (var379 != null) {
                                        method1788(var379);
                                        method19(Statics.field2298[var379.field2209 >>> 16], var379, true);
                                    }
                                    if (field543 != -1) {
                                        method653(field543, 1);
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 61) {
                                    method2066(true);
                                    field545.method2782();
                                    int var380 = field545.method2575();
                                    class160 var381 = field545;
                                    int var382 = var381.field2091;
                                    class46.field925 = 0;
                                    class46.method2982(var381);
                                    for (int var383 = 0; var383 < class46.field925; var383++) {
                                        int var384 = class46.field918[var383];
                                        class24 var385 = field409[var384];
                                        int var386 = var381.method2573();
                                        if ((var386 & 0x40) != 0) {
                                            var386 += var381.method2573() << 8;
                                        }
                                        byte var387 = -1;
                                        if ((var386 & 0x2) != 0) {
                                            int var388 = var381.method2573();
                                            byte[] var389 = new byte[var388];
                                            class154 var390 = new class154(var389);
                                            var381.method2584(var389, 0, var388);
                                            class46.field908[var384] = var390;
                                            var385.method209(var390);
                                        }
                                        if ((var386 & 0x20) != 0) {
                                            int var391 = var381.method2575();
                                            if (var391 == 65535) {
                                                var391 = -1;
                                            }
                                            int var392 = var381.method2573();
                                            method39(var385, var391, var392);
                                        }
                                        if ((var386 & 0x4) != 0) {
                                            var385.field625 = var381.method2575();
                                            if (var385.field625 == 65535) {
                                                var385.field625 = -1;
                                            }
                                        }
                                        if ((var386 & 0x1) != 0) {
                                            var385.field649 = var381.method2581();
                                            if (var385.field649.charAt(0) == '~') {
                                                var385.field649 = var385.field649.substring(1);
                                                class48.method3375(2, var385.field241, var385.field649);
                                            } else if (Statics.field810 == var385) {
                                                class48.method3375(2, var385.field241, var385.field649);
                                            }
                                            var385.field613 = false;
                                            var385.field616 = 0;
                                            var385.field617 = 0;
                                            var385.field615 = 150;
                                        }
                                        if ((var386 & 0x80) != 0) {
                                            int var393 = var381.method2573();
                                            if (var393 > 0) {
                                                for (int var394 = 0; var394 < var393; var394++) {
                                                    int var395 = -1;
                                                    int var396 = -1;
                                                    int var397 = -1;
                                                    int var398 = var381.method2586();
                                                    if (var398 == 32767) {
                                                        var398 = var381.method2586();
                                                        var396 = var381.method2586();
                                                        var395 = var381.method2586();
                                                        var397 = var381.method2586();
                                                    } else if (var398 == 32766) {
                                                        var398 = -1;
                                                    } else {
                                                        var396 = var381.method2586();
                                                    }
                                                    int var399 = var381.method2586();
                                                    var385.method565(var398, var396, var395, var397, field294, var399);
                                                }
                                            }
                                            int var400 = var381.method2573();
                                            if (var400 > 0) {
                                                for (int var401 = 0; var401 < var400; var401++) {
                                                    int var402 = var381.method2586();
                                                    int var403 = var381.method2586();
                                                    if (var403 == 32767) {
                                                        var385.method567(var402);
                                                    } else {
                                                        int var404 = var381.method2586();
                                                        int var405 = var381.method2573();
                                                        int var406 = var403 > 0 ? var381.method2573() : var405;
                                                        var385.method566(var402, field294, var403, var404, var405, var406);
                                                    }
                                                }
                                            }
                                        }
                                        if ((var386 & 0x8) != 0) {
                                            var385.field627 = var381.method2575();
                                            if (var385.field653 == 0) {
                                                var385.field650 = var385.field627;
                                                var385.field627 = -1;
                                            }
                                        }
                                        if ((var386 & 0x10) != 0) {
                                            int var407 = var381.method2575();
                                            class178 var408 = (class178) class149.method162(class178.method182(), var381.method2573());
                                            boolean var409 = var381.method2573() == 1;
                                            int var410 = var381.method2573();
                                            int var411 = var381.field2091;
                                            if (var385.field241 != null && var385.field269 != null) {
                                                boolean var412 = false;
                                                if (var408.field2669 && method3193(var385.field241)) {
                                                    var412 = true;
                                                }
                                                if (!var412 && field408 == 0 && !var385.field246) {
                                                    class46.field910.field2091 = 0;
                                                    var381.method2584(class46.field910.field2094, 0, var410);
                                                    class46.field910.field2091 = 0;
                                                    class154 var413 = class46.field910;
                                                    String var417;
                                                    try {
                                                        int var414 = var413.method2586();
                                                        if (var414 > 32767) {
                                                            var414 = 32767;
                                                        }
                                                        byte[] var415 = new byte[var414];
                                                        var413.field2091 += Statics.field3115.method2502(var413.field2094, var413.field2091, var415, 0, var414);
                                                        String var416 = class204.method2362(var415, 0, var414);
                                                        var417 = var416;
                                                    } catch (Exception var587) {
                                                        var417 = "Cabbage";
                                                    }
                                                    String var420 = class210.method3572(class208.method3006(var417));
                                                    var385.field649 = var420.trim();
                                                    var385.field616 = var407 >> 8;
                                                    var385.field617 = var407 & 0xFF;
                                                    var385.field615 = 150;
                                                    var385.field613 = var409;
                                                    var385.field614 = Statics.field810 != var385 && var408.field2669 && field533 != "" && var420.toLowerCase().indexOf(field533) == -1;
                                                    int var421;
                                                    if (var408.field2667) {
                                                        var421 = var409 ? 91 : 1;
                                                    } else {
                                                        var421 = var409 ? 90 : 2;
                                                    }
                                                    if (var408.field2660 == -1) {
                                                        class48.method3375(var421, var385.field241, var420);
                                                    } else {
                                                        class48.method3375(var421, class38.method57(var408.field2660) + var385.field241, var420);
                                                    }
                                                }
                                            }
                                            var381.field2091 = var410 + var411;
                                        }
                                        if ((var386 & 0x1000) != 0) {
                                            var385.field635 = var381.method2575();
                                            int var422 = var381.method2658();
                                            var385.field640 = var422 >> 16;
                                            var385.field639 = (var422 & 0xFFFF) + field294;
                                            var385.field637 = 0;
                                            var385.field638 = 0;
                                            if (var385.field639 > field294) {
                                                var385.field637 = -1;
                                            }
                                            if (var385.field635 == 65535) {
                                                var385.field635 = -1;
                                            }
                                        }
                                        if ((var386 & 0x400) != 0) {
                                            var385.field607 = var381.method2574();
                                            var385.field643 = var381.method2574();
                                            var385.field642 = var381.method2574();
                                            var385.field644 = var381.method2574();
                                            var385.field603 = var381.method2575() + field294;
                                            var385.field646 = var381.method2575() + field294;
                                            var385.field654 = var381.method2575();
                                            if (var385.field264) {
                                                var385.field607 += var385.field265;
                                                var385.field643 += var385.field266;
                                                var385.field642 += var385.field265;
                                                var385.field644 += var385.field266;
                                                var385.field653 = 0;
                                            } else {
                                                var385.field607 += var385.field632[0];
                                                var385.field643 += var385.field655[0];
                                                var385.field642 += var385.field632[0];
                                                var385.field644 += var385.field655[0];
                                                var385.field653 = 1;
                                            }
                                            var385.field608 = 0;
                                        }
                                        if ((var386 & 0x800) != 0) {
                                            class46.field914[var384] = var381.method2574();
                                        }
                                        if ((var386 & 0x200) != 0) {
                                            var387 = var381.method2574();
                                        }
                                        if ((var386 & 0x100) != 0) {
                                            for (int var423 = 0; var423 < 3; var423++) {
                                                var385.field245[var423] = var381.method2581();
                                            }
                                        }
                                        if (var385.field264) {
                                            if (var387 == 127) {
                                                var385.method236(var385.field265, var385.field266);
                                            } else {
                                                byte var424;
                                                if (var387 == -1) {
                                                    var424 = class46.field914[var384];
                                                } else {
                                                    var424 = var387;
                                                }
                                                var385.method222(var385.field265, var385.field266, var424);
                                            }
                                        }
                                    }
                                    if (var381.field2091 - var382 != var380) {
                                        throw new RuntimeException(var381.field2091 - var382 + " " + var380);
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                if (field332 == 197) {
                                    int var425 = field545.method2621();
                                    int var426 = field545.method2564();
                                    if (var426 == 65535) {
                                        var426 = -1;
                                    }
                                    int var427 = field545.method2620();
                                    class170 var428 = class170.method3227(var425);
                                    if (var428.field2199) {
                                        var428.field2329 = var426;
                                        var428.field2294 = var427;
                                        class199 var430 = class199.method96(var426);
                                        var428.field2258 = var430.field2961;
                                        var428.field2261 = var430.field2954;
                                        var428.field2210 = var430.field2963;
                                        var428.field2284 = var430.field2978;
                                        var428.field2259 = var430.field2965;
                                        var428.field2263 = var430.field2960;
                                        if (var430.field2979 == 1) {
                                            var428.field2267 = 1;
                                        } else {
                                            var428.field2267 = 2;
                                        }
                                        if (var428.field2293 > 0) {
                                            var428.field2263 = var428.field2263 * 32 / var428.field2293;
                                        } else if (var428.field2220 > 0) {
                                            var428.field2263 = var428.field2263 * 32 / var428.field2220;
                                        }
                                        method1788(var428);
                                    } else {
                                        if (var426 == -1) {
                                            var428.field2306 = 0;
                                            field332 = -1;
                                            var5 = true;
                                            break label3761;
                                        }
                                        class199 var429 = class199.method96(var426);
                                        var428.field2306 = 4;
                                        var428.field2253 = var426;
                                        var428.field2258 = var429.field2961;
                                        var428.field2261 = var429.field2954;
                                        var428.field2263 = var429.field2960 * 100 / var427;
                                        method1788(var428);
                                    }
                                    field332 = -1;
                                    var5 = true;
                                    break label3761;
                                }
                                class102.method1780("" + field332 + class38.field783 + field467 + class38.field783 + field337 + class38.field783 + field486, (Throwable) null);
                                method147();
                            } catch (IOException var598) {
                                method2998();
                            } catch (Exception var599) {
                                String var433 = "" + field332 + class38.field783 + field467 + class38.field783 + field337 + class38.field783 + field486 + class38.field783 + (Statics.field164 + Statics.field810.field632[0]) + class38.field783 + (Statics.field209 + Statics.field810.field655[0]) + class38.field783;
                                for (int var434 = 0; var434 < field486 && var434 < 50; var434++) {
                                    var433 = var433 + field545.field2094[var434] + class38.field783;
                                }
                                class102.method1780(var433, var599);
                                method147();
                            }
                            var5 = true;
                        }
                    }
                    if (!var5) {
                        break;
                    }
                }
                if (field292 == 30) {
                    while (true) {
                        class227 var435 = (class227) class228.field3229.method2176();
                        boolean var436;
                        if (var435 == null) {
                            var436 = false;
                        } else {
                            var436 = true;
                        }
                        if (!var436) {
                            Object var438 = Statics.field597.field218;
                            synchronized (Statics.field597.field218) {
                                if (!field284) {
                                    Statics.field597.field211 = 0;
                                } else if (class116.field1803 != 0 || Statics.field597.field211 >= 40) {
                                    field295.method2783(90);
                                    field295.method2746(0);
                                    int var439 = field295.field2091;
                                    int var440 = 0;
                                    for (int var441 = 0; var441 < Statics.field597.field211 && field295.field2091 - var439 < 240; var441++) {
                                        var440++;
                                        int var442 = Statics.field597.field220[var441];
                                        if (var442 < 0) {
                                            var442 = 0;
                                        } else if (var442 > 502) {
                                            var442 = 502;
                                        }
                                        int var443 = Statics.field597.field212[var441];
                                        if (var443 < 0) {
                                            var443 = 0;
                                        } else if (var443 > 764) {
                                            var443 = 764;
                                        }
                                        int var444 = var442 * 765 + var443;
                                        if (Statics.field597.field220[var441] == -1 && Statics.field597.field212[var441] == -1) {
                                            var443 = -1;
                                            var442 = -1;
                                            var444 = 524287;
                                        }
                                        if (field296 != var443 || field297 != var442) {
                                            int var445 = var443 - field296;
                                            field296 = var443;
                                            int var446 = var442 - field297;
                                            field297 = var442;
                                            if (field298 < 8 && var445 >= -32 && var445 <= 31 && var446 >= -32 && var446 <= 31) {
                                                var445 += 32;
                                                var446 += 32;
                                                field295.method2560((field298 << 12) + (var445 << 6) + var446);
                                                field298 = 0;
                                            } else if (field298 < 8) {
                                                field295.method2561((field298 << 19) + 8388608 + var444);
                                                field298 = 0;
                                            } else {
                                                field295.method2562((field298 << 19) + -1073741824 + var444);
                                                field298 = 0;
                                            }
                                        } else if (field298 < 2047) {
                                            field298++;
                                        }
                                    }
                                    field295.method2570(field295.field2091 - var439);
                                    if (var440 >= Statics.field597.field211) {
                                        Statics.field597.field211 = 0;
                                    } else {
                                        Statics.field597.field211 -= var440;
                                        for (int var447 = 0; var447 < Statics.field597.field211; var447++) {
                                            Statics.field597.field212[var447] = Statics.field597.field212[var440 + var447];
                                            Statics.field597.field220[var447] = Statics.field597.field220[var440 + var447];
                                        }
                                    }
                                }
                            }
                            if (class116.field1803 == 1 || !Statics.field1663 && class116.field1803 == 4 || class116.field1803 == 2) {
                                long var449 = (class116.field1806 - field564) / 50L;
                                if (var449 > 4095L) {
                                    var449 = 4095L;
                                }
                                field564 = class116.field1806;
                                int var451 = class116.field1805;
                                if (var451 < 0) {
                                    var451 = 0;
                                } else if (var451 > Statics.field1756) {
                                    var451 = Statics.field1756;
                                }
                                int var452 = class116.field1804;
                                if (var452 < 0) {
                                    var452 = 0;
                                } else if (var452 > Statics.field1224) {
                                    var452 = Statics.field1224;
                                }
                                int var453 = (int) var449;
                                field295.method2783(192);
                                field295.method2560((var453 << 1) + (class116.field1803 == 2 ? 1 : 0));
                                field295.method2560(var452);
                                field295.method2560(var451);
                            }
                            if (class106.field1693 > 0) {
                                field295.method2783(187);
                                field295.method2560(0);
                                int var454 = field295.field2091;
                                long var455 = class156.method1307();
                                for (int var457 = 0; var457 < class106.field1693; var457++) {
                                    long var458 = var455 - field513;
                                    if (var458 > 16777215L) {
                                        var458 = 16777215L;
                                    }
                                    field513 = var455;
                                    field295.method2664((int) var458);
                                    field295.method2749(class106.field1700[var457]);
                                }
                                field295.method2569(field295.field2091 - var454);
                            }
                            if (field379 > 0) {
                                field379--;
                            }
                            if (class106.field1694[96] || class106.field1694[97] || class106.field1694[98] || class106.field1694[99]) {
                                field442 = true;
                            }
                            if (field442 && field379 <= 0) {
                                field379 = 20;
                                field442 = false;
                                field295.method2783(94);
                                field295.method2606(field373);
                                field295.method2560(field372);
                            }
                            if (Statics.field84 && !field299) {
                                field299 = true;
                                field295.method2783(65);
                                field295.method2746(1);
                            }
                            if (!Statics.field84 && field299) {
                                field299 = false;
                                field295.method2783(65);
                                field295.method2746(0);
                            }
                            method694();
                            if (field292 == 30) {
                                for (class26 var460 = (class26) field371.method2209(); var460 != null; var460 = (class26) field371.method2211()) {
                                    if (var460.field579 > 0) {
                                        var460.field579--;
                                    }
                                    if (var460.field579 == 0) {
                                        if (var460.field577 >= 0) {
                                            int var461 = var460.field577;
                                            int var462 = var460.field576;
                                            class198 var463 = class198.method1371(var461);
                                            if (var462 == 11) {
                                                var462 = 10;
                                            }
                                            if (var462 >= 5 && var462 <= 8) {
                                                var462 = 4;
                                            }
                                            boolean var464 = var463.method3336(var462);
                                            if (!var464) {
                                                continue;
                                            }
                                        }
                                        method863(var460.field587, var460.field574, var460.field575, var460.field582, var460.field577, var460.field584, var460.field576);
                                        var460.method2200();
                                    } else {
                                        if (var460.field583 > 0) {
                                            var460.field583--;
                                        }
                                        if (var460.field583 == 0 && var460.field575 >= 1 && var460.field582 >= 1 && var460.field575 <= 102 && var460.field582 <= 102) {
                                            if (var460.field580 >= 0) {
                                                int var465 = var460.field580;
                                                int var466 = var460.field573;
                                                class198 var467 = class198.method1371(var465);
                                                if (var466 == 11) {
                                                    var466 = 10;
                                                }
                                                if (var466 >= 5 && var466 <= 8) {
                                                    var466 = 4;
                                                }
                                                boolean var468 = var467.method3336(var466);
                                                if (!var468) {
                                                    continue;
                                                }
                                            }
                                            method863(var460.field587, var460.field574, var460.field575, var460.field582, var460.field580, var460.field581, var460.field573);
                                            var460.field583 = -1;
                                            if (var460.field580 == var460.field577 && var460.field577 == -1) {
                                                var460.method2200();
                                            } else if (var460.field580 == var460.field577 && var460.field584 == var460.field581 && var460.field576 == var460.field573) {
                                                var460.method2200();
                                            }
                                        }
                                    }
                                }
                                int var10002;
                                for (int var469 = 0; var469 < field529; var469++) {
                                    var10002 = field440[var469]--;
                                    if (field440[var469] >= -10) {
                                        class54 var471 = field534[var469];
                                        if (var471 == null) {
                                            class54 var600 = (class54) null;
                                            var471 = class54.method933(Statics.field1426, field530[var469], 0);
                                            if (var471 == null) {
                                                continue;
                                            }
                                            field440[var469] += var471.method929();
                                            field534[var469] = var471;
                                        }
                                        if (field440[var469] < 0) {
                                            int var478;
                                            if (field484[var469] == 0) {
                                                var478 = field483;
                                            } else {
                                                int var472 = (field484[var469] & 0xFF) * 128;
                                                int var473 = field484[var469] >> 16 & 0xFF;
                                                int var474 = var473 * 128 + 64 - Statics.field810.field629;
                                                if (var474 < 0) {
                                                    var474 = -var474;
                                                }
                                                int var475 = field484[var469] >> 8 & 0xFF;
                                                int var476 = var475 * 128 + 64 - Statics.field810.field600;
                                                if (var476 < 0) {
                                                    var476 = -var476;
                                                }
                                                int var477 = var474 + var476 - 128;
                                                if (var477 > var472) {
                                                    field440[var469] = -100;
                                                    continue;
                                                }
                                                if (var477 < 0) {
                                                    var477 = 0;
                                                }
                                                var478 = field528 * (var472 - var477) / var472;
                                            }
                                            if (var478 > 0) {
                                                class56 var479 = var471.method921().method972(Statics.field230);
                                                class67 var480 = class67.method1122(var479, 100, var478);
                                                var480.method1125(field410[var469] - 1);
                                                Statics.field4.method865(var480);
                                            }
                                            field440[var469] = -100;
                                        }
                                    } else {
                                        field529--;
                                        for (int var470 = var469; var470 < field529; var470++) {
                                            field530[var470] = field530[var470 + 1];
                                            field534[var470] = field534[var470 + 1];
                                            field410[var470] = field410[var470 + 1];
                                            field440[var470] = field440[var470 + 1];
                                            field484[var470] = field484[var470 + 1];
                                        }
                                        var469--;
                                    }
                                }
                                if (field526 && !class139.method685()) {
                                    if (field374 != 0 && field415 != -1) {
                                        class139.method2051(Statics.field3080, field415, 0, field374, false);
                                    }
                                    field526 = false;
                                }
                                field333++;
                                if (field333 > 750) {
                                    method2998();
                                } else {
                                    method2906();
                                    for (int var481 = 0; var481 < field323; var481++) {
                                        int var482 = field324[var481];
                                        class36 var483 = field322[var482];
                                        if (var483 != null) {
                                            method818(var483, var483.field765.field3013);
                                        }
                                    }
                                    method1781();
                                    field365++;
                                    if (field399 != 0) {
                                        field398 += 20;
                                        if (field398 >= 400) {
                                            field399 = 0;
                                        }
                                    }
                                    if (Statics.field108 != null) {
                                        field400++;
                                        if (field400 >= 15) {
                                            method1788(Statics.field108);
                                            Statics.field108 = null;
                                        }
                                    }
                                    class170 var484 = Statics.field1559;
                                    class170 var485 = Statics.field106;
                                    Statics.field1559 = null;
                                    Statics.field106 = null;
                                    field464 = null;
                                    field468 = false;
                                    field465 = false;
                                    field510 = 0;
                                    while (true) {
                                        while (class106.method767() && field510 < 128) {
                                            if (field359 >= 2 && class106.field1694[82] && Statics.field1353 == 66) {
                                                String var486 = class48.method1776();
                                                Statics.field1815.setContents(new StringSelection(var486), (ClipboardOwner) null);
                                            } else {
                                                field432[field510] = Statics.field1353;
                                                field459[field510] = Statics.field276;
                                                field510++;
                                            }
                                        }
                                        if (field543 != -1) {
                                            int var487 = field543;
                                            int var488 = Statics.field1224;
                                            int var489 = Statics.field1756;
                                            if (class170.method3657(var487)) {
                                                method87(Statics.field2298[var487], -1, 0, 0, var488, var489, 0, 0);
                                            }
                                        }
                                        field472++;
                                        while (true) {
                                            class19 var490;
                                            class170 var491;
                                            class170 var492;
                                            do {
                                                var490 = (class19) field487.method2207();
                                                if (var490 == null) {
                                                    while (true) {
                                                        class19 var493;
                                                        class170 var494;
                                                        class170 var495;
                                                        do {
                                                            var493 = (class19) field553.method2207();
                                                            if (var493 == null) {
                                                                while (true) {
                                                                    class19 var496;
                                                                    class170 var497;
                                                                    class170 var498;
                                                                    do {
                                                                        var496 = (class19) field476.method2207();
                                                                        if (var496 == null) {
                                                                            boolean var499 = false;
                                                                            while (!var499) {
                                                                                var499 = true;
                                                                                for (int var500 = 0; var500 < field519 - 1; var500++) {
                                                                                    if (field389[var500] < 1000 && field389[var500 + 1] > 1000) {
                                                                                        String var501 = field435[var500];
                                                                                        field435[var500] = field435[var500 + 1];
                                                                                        field435[var500 + 1] = var501;
                                                                                        String var502 = field434[var500];
                                                                                        field434[var500] = field434[var500 + 1];
                                                                                        field434[var500 + 1] = var502;
                                                                                        int var503 = field389[var500];
                                                                                        field389[var500] = field389[var500 + 1];
                                                                                        field389[var500 + 1] = var503;
                                                                                        int var504 = field430[var500];
                                                                                        field430[var500] = field430[var500 + 1];
                                                                                        field430[var500 + 1] = var504;
                                                                                        int var505 = field431[var500];
                                                                                        field431[var500] = field431[var500 + 1];
                                                                                        field431[var500 + 1] = var505;
                                                                                        int var506 = field367[var500];
                                                                                        field367[var500] = field367[var500 + 1];
                                                                                        field367[var500 + 1] = var506;
                                                                                        var499 = false;
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (Statics.field1551 == null && field512 == null) {
                                                                                int var507 = class116.field1803;
                                                                                if (field428) {
                                                                                    if (var507 != 1 && (Statics.field1663 || var507 != 4)) {
                                                                                        int var508 = class116.field1795;
                                                                                        int var509 = class116.field1798;
                                                                                        if (var508 < Statics.field1201 - 10 || var508 > Statics.field215 + Statics.field1201 + 10 || var509 < Statics.field36 - 10 || var509 > Statics.field36 + Statics.field1644 + 10) {
                                                                                            field428 = false;
                                                                                            method2547(Statics.field1201, Statics.field36, Statics.field215, Statics.field1644);
                                                                                        }
                                                                                    }
                                                                                    if (var507 == 1 || !Statics.field1663 && var507 == 4) {
                                                                                        int var510 = Statics.field1201;
                                                                                        int var511 = Statics.field36;
                                                                                        int var512 = Statics.field215;
                                                                                        int var513 = class116.field1804;
                                                                                        int var514 = class116.field1805;
                                                                                        int var515 = -1;
                                                                                        for (int var516 = 0; var516 < field519; var516++) {
                                                                                            int var517 = (field519 - 1 - var516) * 15 + var511 + 31;
                                                                                            if (var513 > var510 && var513 < var510 + var512 && var514 > var517 - 13 && var514 < var517 + 3) {
                                                                                                var515 = var516;
                                                                                            }
                                                                                        }
                                                                                        if (var515 != -1 && var515 >= 0) {
                                                                                            int var518 = field430[var515];
                                                                                            int var519 = field431[var515];
                                                                                            int var520 = field389[var515];
                                                                                            int var521 = field367[var515];
                                                                                            String var522 = field434[var515];
                                                                                            String var523 = field435[var515];
                                                                                            method3152(var518, var519, var520, var521, var522, var523, class116.field1804, class116.field1805);
                                                                                        }
                                                                                        field428 = false;
                                                                                        method2547(Statics.field1201, Statics.field36, Statics.field215, Statics.field1644);
                                                                                    }
                                                                                } else {
                                                                                    label3928: {
                                                                                        if ((var507 == 1 || !Statics.field1663 && var507 == 4) && field519 > 0) {
                                                                                            int var524 = field389[field519 - 1];
                                                                                            if (var524 == 39 || var524 == 40 || var524 == 41 || var524 == 42 || var524 == 43 || var524 == 33 || var524 == 34 || var524 == 35 || var524 == 36 || var524 == 37 || var524 == 38 || var524 == 1005) {
                                                                                                int var525 = field430[field519 - 1];
                                                                                                int var526 = field431[field519 - 1];
                                                                                                class170 var527 = class170.method3227(var526);
                                                                                                if (class171.method708(method2479(var527)) || class171.method2811(method2479(var527))) {
                                                                                                    if (Statics.field1551 != null && !field458 && field427 != 1 && !method95(field519 - 1) && field519 > 0) {
                                                                                                        int var528 = field485;
                                                                                                        int var529 = field404;
                                                                                                        class39 var530 = Statics.field261;
                                                                                                        method3152(var530.field798, var530.field801, var530.field796, var530.field799, var530.field800, var530.field800, var528, var529);
                                                                                                        Statics.field261 = null;
                                                                                                    }
                                                                                                    field458 = false;
                                                                                                    field407 = 0;
                                                                                                    if (Statics.field1551 != null) {
                                                                                                        method1788(Statics.field1551);
                                                                                                    }
                                                                                                    Statics.field1551 = class170.method3227(var526);
                                                                                                    field402 = var525;
                                                                                                    field485 = class116.field1804;
                                                                                                    field404 = class116.field1805;
                                                                                                    if (field519 > 0) {
                                                                                                        int var531 = field519 - 1;
                                                                                                        Statics.field261 = new class39();
                                                                                                        Statics.field261.field798 = field430[var531];
                                                                                                        Statics.field261.field801 = field431[var531];
                                                                                                        Statics.field261.field796 = field389[var531];
                                                                                                        Statics.field261.field799 = field367[var531];
                                                                                                        Statics.field261.field800 = field434[var531];
                                                                                                    }
                                                                                                    method1788(Statics.field1551);
                                                                                                    break label3928;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if ((var507 == 1 || !Statics.field1663 && var507 == 4) && (field427 == 1 && field519 > 2 || method95(field519 - 1))) {
                                                                                            var507 = 2;
                                                                                        }
                                                                                        if ((var507 == 1 || !Statics.field1663 && var507 == 4) && field519 > 0) {
                                                                                            int var532 = field519 - 1;
                                                                                            if (var532 >= 0) {
                                                                                                int var533 = field430[var532];
                                                                                                int var534 = field431[var532];
                                                                                                int var535 = field389[var532];
                                                                                                int var536 = field367[var532];
                                                                                                String var537 = field434[var532];
                                                                                                String var538 = field435[var532];
                                                                                                method3152(var533, var534, var535, var536, var537, var538, class116.field1804, class116.field1805);
                                                                                            }
                                                                                        }
                                                                                        if (var507 == 2 && field519 > 0) {
                                                                                            method2985(class116.field1804, class116.field1805);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (field512 != null) {
                                                                                method198();
                                                                            }
                                                                            if (Statics.field1551 != null) {
                                                                                method1788(Statics.field1551);
                                                                                field407++;
                                                                                if (class116.field1796 == 0) {
                                                                                    if (field458) {
                                                                                        if (Statics.field2120 == Statics.field1551 && field405 != field402) {
                                                                                            class170 var539 = Statics.field1551;
                                                                                            byte var540 = 0;
                                                                                            if (field450 == 1 && var539.field2213 == 206) {
                                                                                                var540 = 1;
                                                                                            }
                                                                                            if (var539.field2285[field405] <= 0) {
                                                                                                var540 = 0;
                                                                                            }
                                                                                            if (class171.method2811(method2479(var539))) {
                                                                                                int var541 = field402;
                                                                                                int var542 = field405;
                                                                                                var539.field2285[var542] = var539.field2285[var541];
                                                                                                var539.field2340[var542] = var539.field2340[var541];
                                                                                                var539.field2285[var541] = -1;
                                                                                                var539.field2340[var541] = 0;
                                                                                            } else if (var540 == 1) {
                                                                                                int var543 = field402;
                                                                                                int var544 = field405;
                                                                                                while (var543 != var544) {
                                                                                                    if (var543 > var544) {
                                                                                                        var539.method2961(var543 - 1, var543);
                                                                                                        var543--;
                                                                                                    } else if (var543 < var544) {
                                                                                                        var539.method2961(var543 + 1, var543);
                                                                                                        var543++;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var539.method2961(field405, field402);
                                                                                            }
                                                                                            field295.method2783(118);
                                                                                            field295.method2598(var540);
                                                                                            field295.method2707(Statics.field1551.field2209);
                                                                                            field295.method2607(field405);
                                                                                            field295.method2607(field402);
                                                                                        }
                                                                                    } else if ((field427 == 1 || method95(field519 - 1)) && field519 > 2) {
                                                                                        method2985(field485, field404);
                                                                                    } else if (field519 > 0) {
                                                                                        int var545 = field485;
                                                                                        int var546 = field404;
                                                                                        class39 var547 = Statics.field261;
                                                                                        method3152(var547.field798, var547.field801, var547.field796, var547.field799, var547.field800, var547.field800, var545, var546);
                                                                                        Statics.field261 = null;
                                                                                    }
                                                                                    field400 = 10;
                                                                                    class116.field1803 = 0;
                                                                                    Statics.field1551 = null;
                                                                                } else if (field407 >= 5 && (class116.field1795 > field485 + 5 || class116.field1795 < field485 - 5 || class116.field1798 > field404 + 5 || class116.field1798 < field404 - 5)) {
                                                                                    field458 = true;
                                                                                }
                                                                            }
                                                                            if (class88.field1475 != -1) {
                                                                                int var548 = class88.field1475;
                                                                                int var549 = class88.field1494;
                                                                                field295.method2783(123);
                                                                                field295.method2746(5);
                                                                                field295.method2746(class106.field1694[82] ? (class106.field1694[81] ? 2 : 1) : 0);
                                                                                field295.method2606(Statics.field209 + var549);
                                                                                field295.method2577(Statics.field164 + var548);
                                                                                class88.field1475 = -1;
                                                                                field396 = class116.field1804;
                                                                                field397 = class116.field1805;
                                                                                field399 = 1;
                                                                                field398 = 0;
                                                                                field521 = var548;
                                                                                field522 = var549;
                                                                            }
                                                                            if (Statics.field1559 != var484) {
                                                                                if (var484 != null) {
                                                                                    method1788(var484);
                                                                                }
                                                                                if (Statics.field1559 != null) {
                                                                                    method1788(Statics.field1559);
                                                                                }
                                                                            }
                                                                            if (Statics.field106 != var485 && field494 == field438) {
                                                                                if (var485 != null) {
                                                                                    method1788(var485);
                                                                                }
                                                                                if (Statics.field106 != null) {
                                                                                    method1788(Statics.field106);
                                                                                }
                                                                            }
                                                                            if (Statics.field106 == null) {
                                                                                if (field438 > 0) {
                                                                                    field438--;
                                                                                }
                                                                            } else if (field438 < field494) {
                                                                                field438++;
                                                                                if (field494 == field438) {
                                                                                    method1788(Statics.field106);
                                                                                }
                                                                            }
                                                                            int var550 = field353 + Statics.field810.field629;
                                                                            int var551 = field355 + Statics.field810.field600;
                                                                            if (Statics.field786 - var550 < -500 || Statics.field786 - var550 > 500 || Statics.field267 - var551 < -500 || Statics.field267 - var551 > 500) {
                                                                                Statics.field786 = var550;
                                                                                Statics.field267 = var551;
                                                                            }
                                                                            if (Statics.field786 != var550) {
                                                                                Statics.field786 += (var550 - Statics.field786) / 16;
                                                                            }
                                                                            if (Statics.field267 != var551) {
                                                                                Statics.field267 += (var551 - Statics.field267) / 16;
                                                                            }
                                                                            if (class116.field1796 == 4 && Statics.field1663) {
                                                                                int var552 = class116.field1798 - field479;
                                                                                field375 = var552 * 2;
                                                                                field479 = var552 == -1 || var552 == 1 ? class116.field1798 : (field479 + class116.field1798) / 2;
                                                                                int var553 = field338 - class116.field1795;
                                                                                field437 = var553 * 2;
                                                                                field338 = var553 == -1 || var553 == 1 ? class116.field1795 : (field338 + class116.field1795) / 2;
                                                                            } else {
                                                                                if (class106.field1694[96]) {
                                                                                    field437 += (-24 - field437) / 2;
                                                                                } else if (class106.field1694[97]) {
                                                                                    field437 += (24 - field437) / 2;
                                                                                } else {
                                                                                    field437 /= 2;
                                                                                }
                                                                                if (class106.field1694[98]) {
                                                                                    field375 += (12 - field375) / 2;
                                                                                } else if (class106.field1694[99]) {
                                                                                    field375 += (-12 - field375) / 2;
                                                                                } else {
                                                                                    field375 /= 2;
                                                                                }
                                                                                field479 = class116.field1798;
                                                                                field338 = class116.field1795;
                                                                            }
                                                                            field373 = field437 / 2 + field373 & 0x7FF;
                                                                            field372 += field375 / 2;
                                                                            if (field372 < 128) {
                                                                                field372 = 128;
                                                                            }
                                                                            if (field372 > 383) {
                                                                                field372 = 383;
                                                                            }
                                                                            int var554 = Statics.field786 >> 7;
                                                                            int var555 = Statics.field267 >> 7;
                                                                            int var556 = method1608(Statics.field786, Statics.field267, Statics.field2355);
                                                                            int var557 = 0;
                                                                            if (var554 > 3 && var555 > 3 && var554 < 100 && var555 < 100) {
                                                                                for (int var558 = var554 - 4; var558 <= var554 + 4; var558++) {
                                                                                    for (int var559 = var555 - 4; var559 <= var555 + 4; var559++) {
                                                                                        int var560 = Statics.field2355;
                                                                                        if (var560 < 3 && (class11.field89[1][var558][var559] & 0x2) == 2) {
                                                                                            var560++;
                                                                                        }
                                                                                        int var561 = var556 - class11.field100[var560][var558][var559];
                                                                                        if (var561 > var557) {
                                                                                            var557 = var561;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            int var562 = var557 * 192;
                                                                            if (var562 > 98048) {
                                                                                var562 = 98048;
                                                                            }
                                                                            if (var562 < 32768) {
                                                                                var562 = 32768;
                                                                            }
                                                                            if (var562 > field381) {
                                                                                field381 += (var562 - field381) / 24;
                                                                            } else if (var562 < field381) {
                                                                                field381 += (var562 - field381) / 80;
                                                                            }
                                                                            if (field535) {
                                                                                int var563 = Statics.field1579 * 128 + 64;
                                                                                int var564 = Statics.field745 * 128 + 64;
                                                                                int var565 = method1608(var563, var564, Statics.field2355) - Statics.field2039;
                                                                                if (Statics.field184 < var563) {
                                                                                    Statics.field184 += Statics.field35 * (var563 - Statics.field184) / 1000 + Statics.field922;
                                                                                    if (Statics.field184 > var563) {
                                                                                        Statics.field184 = var563;
                                                                                    }
                                                                                }
                                                                                if (Statics.field184 > var563) {
                                                                                    Statics.field184 -= Statics.field35 * (Statics.field184 - var563) / 1000 + Statics.field922;
                                                                                    if (Statics.field184 < var563) {
                                                                                        Statics.field184 = var563;
                                                                                    }
                                                                                }
                                                                                if (Statics.field234 < var565) {
                                                                                    Statics.field234 += Statics.field35 * (var565 - Statics.field234) / 1000 + Statics.field922;
                                                                                    if (Statics.field234 > var565) {
                                                                                        Statics.field234 = var565;
                                                                                    }
                                                                                }
                                                                                if (Statics.field234 > var565) {
                                                                                    Statics.field234 -= Statics.field35 * (Statics.field234 - var565) / 1000 + Statics.field922;
                                                                                    if (Statics.field234 < var565) {
                                                                                        Statics.field234 = var565;
                                                                                    }
                                                                                }
                                                                                if (Statics.field30 < var564) {
                                                                                    Statics.field30 += Statics.field35 * (var564 - Statics.field30) / 1000 + Statics.field922;
                                                                                    if (Statics.field30 > var564) {
                                                                                        Statics.field30 = var564;
                                                                                    }
                                                                                }
                                                                                if (Statics.field30 > var564) {
                                                                                    Statics.field30 -= Statics.field35 * (Statics.field30 - var564) / 1000 + Statics.field922;
                                                                                    if (Statics.field30 < var564) {
                                                                                        Statics.field30 = var564;
                                                                                    }
                                                                                }
                                                                                int var566 = Statics.field3073 * 128 + 64;
                                                                                int var567 = Statics.field2681 * 128 + 64;
                                                                                int var568 = method1608(var566, var567, Statics.field2355) - Statics.field2106;
                                                                                int var569 = var566 - Statics.field184;
                                                                                int var570 = var568 - Statics.field234;
                                                                                int var571 = var567 - Statics.field30;
                                                                                int var572 = (int) Math.sqrt((double) (var569 * var569 + var571 * var571));
                                                                                int var573 = (int) (Math.atan2((double) var570, (double) var572) * 325.949D) & 0x7FF;
                                                                                int var574 = (int) (Math.atan2((double) var569, (double) var571) * -325.949D) & 0x7FF;
                                                                                if (var573 < 128) {
                                                                                    var573 = 128;
                                                                                }
                                                                                if (var573 > 383) {
                                                                                    var573 = 383;
                                                                                }
                                                                                if (Statics.field2098 < var573) {
                                                                                    Statics.field2098 += Statics.field892 * (var573 - Statics.field2098) / 1000 + Statics.field1843;
                                                                                    if (Statics.field2098 > var573) {
                                                                                        Statics.field2098 = var573;
                                                                                    }
                                                                                }
                                                                                if (Statics.field2098 > var573) {
                                                                                    Statics.field2098 -= Statics.field892 * (Statics.field2098 - var573) / 1000 + Statics.field1843;
                                                                                    if (Statics.field2098 < var573) {
                                                                                        Statics.field2098 = var573;
                                                                                    }
                                                                                }
                                                                                int var575 = var574 - Statics.field811;
                                                                                if (var575 > 1024) {
                                                                                    var575 -= 2048;
                                                                                }
                                                                                if (var575 < -1024) {
                                                                                    var575 += 2048;
                                                                                }
                                                                                if (var575 > 0) {
                                                                                    Statics.field811 += Statics.field892 * var575 / 1000 + Statics.field1843;
                                                                                    Statics.field811 &= 0x7FF;
                                                                                }
                                                                                if (var575 < 0) {
                                                                                    Statics.field811 -= Statics.field892 * -var575 / 1000 + Statics.field1843;
                                                                                    Statics.field811 &= 0x7FF;
                                                                                }
                                                                                int var576 = var574 - Statics.field811;
                                                                                if (var576 > 1024) {
                                                                                    var576 -= 2048;
                                                                                }
                                                                                if (var576 < -1024) {
                                                                                    var576 += 2048;
                                                                                }
                                                                                if (var576 < 0 && var575 > 0 || var576 > 0 && var575 < 0) {
                                                                                    Statics.field811 = var574;
                                                                                }
                                                                            }
                                                                            for (int var577 = 0; var577 < 5; var577++) {
                                                                                var10002 = field540[var577]++;
                                                                            }
                                                                            Statics.field203.method810();
                                                                            int var578 = ++class116.field1791 - 1;
                                                                            int var580 = class106.field1691;
                                                                            if (var578 > 15000 && var580 > 15000) {
                                                                                field454 = 250;
                                                                                class116.field1791 = 14500;
                                                                                field295.method2783(60);
                                                                            }
                                                                            field352++;
                                                                            if (field352 > 500) {
                                                                                field352 = 0;
                                                                                int var582 = (int) (Math.random() * 8.0D);
                                                                                if ((var582 & 0x1) == 1) {
                                                                                    field353 += field354;
                                                                                }
                                                                                if ((var582 & 0x2) == 2) {
                                                                                    field355 += field356;
                                                                                }
                                                                                if ((var582 & 0x4) == 4) {
                                                                                    field357 += field466;
                                                                                }
                                                                            }
                                                                            if (field353 < -50) {
                                                                                field354 = 2;
                                                                            }
                                                                            if (field353 > 50) {
                                                                                field354 = -2;
                                                                            }
                                                                            if (field355 < -55) {
                                                                                field356 = 2;
                                                                            }
                                                                            if (field355 > 55) {
                                                                                field356 = -2;
                                                                            }
                                                                            if (field357 < -40) {
                                                                                field466 = 1;
                                                                            }
                                                                            if (field357 > 40) {
                                                                                field466 = -1;
                                                                            }
                                                                            field364++;
                                                                            if (field364 > 500) {
                                                                                field364 = 0;
                                                                                int var583 = (int) (Math.random() * 8.0D);
                                                                                if ((var583 & 0x1) == 1) {
                                                                                    field308 += field361;
                                                                                }
                                                                                if ((var583 & 0x2) == 2) {
                                                                                    field345 += field302;
                                                                                }
                                                                            }
                                                                            if (field308 < -60) {
                                                                                field361 = 2;
                                                                            }
                                                                            if (field308 > 60) {
                                                                                field361 = -2;
                                                                            }
                                                                            if (field345 < -20) {
                                                                                field302 = 1;
                                                                            }
                                                                            if (field345 > 10) {
                                                                                field302 = -1;
                                                                            }
                                                                            for (class17 var584 = (class17) field557.method2249(); var584 != null; var584 = (class17) field557.method2245()) {
                                                                                if ((long) var584.field169 < class156.method1307() / 1000L - 5L) {
                                                                                    if (var584.field176 > 0) {
                                                                                        class48.method3375(5, "", var584.field170 + class174.field2379);
                                                                                    }
                                                                                    if (var584.field176 == 0) {
                                                                                        class48.method3375(5, "", var584.field170 + class174.field2551);
                                                                                    }
                                                                                    var584.method2256();
                                                                                }
                                                                            }
                                                                            field334++;
                                                                            if (field334 > 50) {
                                                                                field295.method2783(212);
                                                                            }
                                                                            try {
                                                                                if (Statics.field2119 != null && field295.field2091 > 0) {
                                                                                    Statics.field2119.method1912(field295.field2094, 0, field295.field2091);
                                                                                    field295.field2091 = 0;
                                                                                    field334 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var586) {
                                                                                method2998();
                                                                            }
                                                                            return;
                                                                        }
                                                                        var497 = var496.field188;
                                                                        if (var497.field2334 < 0) {
                                                                            break;
                                                                        }
                                                                        var498 = class170.method3227(var497.field2327);
                                                                    } while (var498 == null || var498.field2333 == null || var497.field2334 >= var498.field2333.length || var498.field2333[var497.field2334] != var497);
                                                                    class33.method192(var496);
                                                                }
                                                            }
                                                            var494 = var493.field188;
                                                            if (var494.field2334 < 0) {
                                                                break;
                                                            }
                                                            var495 = class170.method3227(var494.field2327);
                                                        } while (var495 == null || var495.field2333 == null || var494.field2334 >= var495.field2333.length || var495.field2333[var494.field2334] != var494);
                                                        class33.method192(var493);
                                                    }
                                                }
                                                var491 = var490.field188;
                                                if (var491.field2334 < 0) {
                                                    break;
                                                }
                                                var492 = class170.method3227(var491.field2327);
                                            } while (var492 == null || var492.field2333 == null || var491.field2334 >= var492.field2333.length || var492.field2333[var491.field2334] != var491);
                                            class33.method192(var490);
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        field295.method2783(114);
                        field295.method2746(0);
                        int var437 = field295.field2091;
                        class228.method1939(field295);
                        field295.method2570(field295.field2091 - var437);
                    }
                }
            }
        } else if (field292 == 40 || field292 == 45) {
            method83();
        }
    }

    @ObfuscatedName("client.v(B)V")
    public final void method244() {
        boolean var1;
        label203: {
            try {
                if (class139.field1915 == 2) {
                    if (Statics.field1918 == null) {
                        Statics.field1918 = class145.method2494(Statics.field2015, Statics.field694, Statics.field1916);
                        if (Statics.field1918 == null) {
                            var1 = false;
                            break label203;
                        }
                    }
                    if (Statics.field1761 == null) {
                        Statics.field1761 = new class61(Statics.field1913, Statics.field1919);
                    }
                    if (Statics.field1914.method2312(Statics.field1918, Statics.field1920, Statics.field1761, 22050)) {
                        Statics.field1914.method2317();
                        Statics.field1914.method2319(Statics.field1221);
                        Statics.field1914.method2340(Statics.field1918, Statics.field1222);
                        class139.field1915 = 0;
                        Statics.field1918 = null;
                        Statics.field1761 = null;
                        Statics.field2015 = null;
                        var1 = true;
                        break label203;
                    }
                }
            } catch (Exception var28) {
                var28.printStackTrace();
                Statics.field1914.method2315();
                class139.field1915 = 0;
                Statics.field1918 = null;
                Statics.field1761 = null;
                Statics.field2015 = null;
            }
            var1 = false;
        }
        if (var1 && field526 && Statics.field569 != null) {
            Statics.field569.method1001();
        }
        if (field292 == 10 || field292 == 20 || field292 == 30) {
            if (field563 != 0L && class156.method1307() > field563) {
                method167(method58());
            } else if (field1779) {
                class106.method85(Statics.field1748);
                class116.method2548(Statics.field1748);
                if (Statics.field177 != null) {
                    Statics.field177.method1884(Statics.field1748);
                }
                Statics.field283.method1953();
                Statics.field1748.setBackground(Color.black);
                class106.method308(Statics.field1748);
                class116.method847(Statics.field1748);
                if (Statics.field177 != null) {
                    Statics.field177.method1887(Statics.field1748);
                }
                if (field543 != -1) {
                    method699(false);
                }
                field1778 = true;
            }
        }
        Dimension var4 = this.method1952();
        if (Statics.field1850 != var4.width || Statics.field1680 != var4.height || field1778) {
            method1094();
            field563 = class156.method1307() + 500L;
            field1778 = false;
        }
        boolean var5 = false;
        if (field1776) {
            field1776 = false;
            var5 = true;
            for (int var6 = 0; var6 < 100; var6++) {
                field525[var6] = true;
            }
        }
        if (var5) {
            method1345();
        }
        if (field292 == 0) {
            int var7 = class42.field843;
            String var8 = class42.field844;
            Color var9 = null;
            try {
                Graphics var10 = Statics.field1748.getGraphics();
                if (Statics.field1538 == null) {
                    Statics.field1538 = new Font("Helvetica", 1, 13);
                    Statics.field792 = Statics.field1748.getFontMetrics(Statics.field1538);
                }
                if (var5) {
                    var10.setColor(Color.black);
                    var10.fillRect(0, 0, Statics.field1224, Statics.field1756);
                }
                if (var9 == null) {
                    var9 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field926 == null) {
                        Statics.field926 = Statics.field1748.createImage(304, 34);
                    }
                    Graphics var11 = Statics.field926.getGraphics();
                    var11.setColor(var9);
                    var11.drawRect(0, 0, 303, 33);
                    var11.fillRect(2, 2, var7 * 3, 30);
                    var11.setColor(Color.black);
                    var11.drawRect(1, 1, 301, 31);
                    var11.fillRect(var7 * 3 + 2, 2, 300 - var7 * 3, 30);
                    var11.setFont(Statics.field1538);
                    var11.setColor(Color.white);
                    var11.drawString(var8, (304 - Statics.field792.stringWidth(var8)) / 2, 22);
                    var10.drawImage(Statics.field926, Statics.field1224 / 2 - 152, Statics.field1756 / 2 - 18, (ImageObserver) null);
                } catch (Exception var24) {
                    int var13 = Statics.field1224 / 2 - 152;
                    int var14 = Statics.field1756 / 2 - 18;
                    var10.setColor(var9);
                    var10.drawRect(var13, var14, 303, 33);
                    var10.fillRect(var13 + 2, var14 + 2, var7 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(var13 + 1, var14 + 1, 301, 31);
                    var10.fillRect(var7 * 3 + var13 + 2, var14 + 2, 300 - var7 * 3, 30);
                    var10.setFont(Statics.field1538);
                    var10.setColor(Color.white);
                    var10.drawString(var8, var13 + (304 - Statics.field792.stringWidth(var8)) / 2, var14 + 22);
                }
            } catch (Exception var25) {
                Statics.field1748.repaint();
            }
        } else if (field292 == 5) {
            class42.method846(Statics.field120, Statics.field1754, Statics.field822, var5);
        } else if (field292 == 10 || field292 == 11) {
            class42.method846(Statics.field120, Statics.field1754, Statics.field822, var5);
        } else if (field292 == 20) {
            class42.method846(Statics.field120, Statics.field1754, Statics.field822, var5);
        } else if (field292 == 25) {
            if (field346 == 1) {
                if (field342 > field343) {
                    field343 = field342;
                }
                int var16 = (field343 * 50 - field342 * 50) / field343;
                method1784(class174.field2446 + class38.field788 + class38.field785 + var16 + "%" + class38.field784, false);
            } else if (field346 == 2) {
                if (field344 > field329) {
                    field329 = field344;
                }
                int var17 = (field329 * 50 - field344 * 50) / field329 + 50;
                method1784(class174.field2446 + class38.field788 + class38.field785 + var17 + "%" + class38.field784, false);
            } else {
                method1784(class174.field2446, false);
            }
        } else if (field292 == 30) {
            method1460();
        } else if (field292 == 40) {
            method1784(class174.field2374 + class38.field788 + class174.field2375, false);
        } else if (field292 == 45) {
            method1784(class174.field2519, false);
        }
        if (field292 == 30 && field499 == 0 && !var5) {
            try {
                Graphics var18 = Statics.field1748.getGraphics();
                for (int var19 = 0; var19 < field282; var19++) {
                    if (field561[var19]) {
                        Statics.field935.method3665(var18, field572[var19], field496[var19], field497[var19], field498[var19]);
                        field561[var19] = false;
                    }
                }
            } catch (Exception var27) {
                Statics.field1748.repaint();
            }
        } else if (field292 > 0) {
            try {
                Graphics var21 = Statics.field1748.getGraphics();
                Statics.field935.method3669(var21, 0, 0);
                for (int var22 = 0; var22 < field282; var22++) {
                    field561[var22] = false;
                }
            } catch (Exception var26) {
                Statics.field1748.repaint();
            }
        }
    }

    @ObfuscatedName("client.h(I)V")
    public final void method245() {
        if (Statics.field203.method797()) {
            Statics.field203.method794();
        }
        if (Statics.field597 != null) {
            Statics.field597.field210 = false;
        }
        Statics.field597 = null;
        if (Statics.field2119 != null) {
            Statics.field2119.method1915();
            Statics.field2119 = null;
        }
        if (class106.field1701 != null) {
            class106 var1 = class106.field1701;
            synchronized (class106.field1701) {
                class106.field1701 = null;
            }
        }
        if (class116.field1799 != null) {
            class116 var3 = class116.field1799;
            synchronized (class116.field1799) {
                class116.field1799 = null;
            }
        }
        Statics.field177 = null;
        if (Statics.field569 != null) {
            Statics.field569.method1002();
        }
        if (Statics.field1681 != null) {
            Statics.field1681.method1002();
        }
        if (Statics.field2751 != null) {
            Statics.field2751.method1915();
        }
        Object var5 = class184.field2728;
        synchronized (class184.field2728) {
            if (class184.field2729 != 0) {
                class184.field2729 = 1;
                try {
                    class184.field2728.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        class105.method2283();
    }

    @ObfuscatedName("g.p(IS)V")
    public static void method59(int arg0) {
        if (field292 == arg0) {
            return;
        }
        if (field292 == 0) {
            Statics.field926 = null;
            Statics.field1538 = null;
            Statics.field792 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field317 = 0;
            field318 = 0;
            field319 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field327 != null) {
            Statics.field327.method1915();
            Statics.field327 = null;
        }
        if (field292 == 25) {
            field346 = 0;
            field342 = 0;
            field343 = 1;
            field344 = 0;
            field329 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class42.method181(Statics.field1748, Statics.field1839, Statics.field315, true, 0);
        } else if (arg0 == 20) {
            class42.method181(Statics.field1748, Statics.field1839, Statics.field315, true, field292 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class42.method181(Statics.field1748, Statics.field1839, Statics.field315, false, 4);
        } else if (Statics.field836) {
            Statics.field2121 = null;
            Statics.field827 = null;
            Statics.field828 = null;
            Statics.field173 = null;
            Statics.field862 = null;
            Statics.field1640 = null;
            Statics.field3114 = null;
            Statics.field1997 = null;
            Statics.field149 = null;
            Statics.field861 = null;
            Statics.field3 = null;
            Statics.field2744 = null;
            Statics.field217 = null;
            Statics.field790 = null;
            Statics.field182 = null;
            Statics.field835 = null;
            Statics.field854 = null;
            Statics.field834 = null;
            Statics.field45 = null;
            Statics.field3256 = null;
            Statics.field1614 = null;
            Statics.field1851 = null;
            class139.field1915 = 1;
            Statics.field2015 = null;
            Statics.field694 = -1;
            Statics.field1916 = -1;
            Statics.field1221 = 0;
            Statics.field1222 = false;
            Statics.field1917 = 2;
            class186.method3154(true);
            Statics.field836 = false;
        }
        field292 = arg0;
    }

    @ObfuscatedName("client.l(I)V")
    public void method246() {
        if (field292 == 1000) {
            return;
        }
        long var1 = class156.method1307();
        int var3 = (int) (var1 - Statics.field1639);
        Statics.field1639 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class186.field2747 += var3;
        boolean var4;
        if (class186.field2764 == 0 && class186.field2749 == 0 && class186.field2754 == 0 && class186.field2766 == 0) {
            var4 = true;
        } else if (Statics.field2751 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class186.field2747 > 30000) {
                        throw new IOException();
                    }
                    while (class186.field2749 < 20 && class186.field2766 > 0) {
                        class182 var5 = (class182) class186.field2748.method2163();
                        class154 var6 = new class154(4);
                        var6.method2746(1);
                        var6.method2561((int) var5.field1879);
                        Statics.field2751.method1912(var6.field2094, 0, 4);
                        class186.field2750.method2162(var5, var5.field1879);
                        class186.field2766--;
                        class186.field2749++;
                    }
                    while (class186.field2764 < 20 && class186.field2754 > 0) {
                        class182 var7 = (class182) class186.field2752.method2111();
                        class154 var8 = new class154(4);
                        var8.method2746(0);
                        var8.method2561((int) var7.field1879);
                        Statics.field2751.method1912(var8.field2094, 0, 4);
                        var7.method2238();
                        class186.field2755.method2162(var7, var7.field1879);
                        class186.field2754--;
                        class186.field2764++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2751.method1908();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class186.field2747 = 0;
                        byte var11 = 0;
                        if (Statics.field2150 == null) {
                            var11 = 8;
                        } else if (class186.field2746 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class186.field2753.field2091;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2751.method1911(class186.field2753.field2094, class186.field2753.field2091, var12);
                            if (class186.field2763 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class186.field2753.field2094[class186.field2753.field2091 + var13] ^= class186.field2763;
                                }
                            }
                            class186.field2753.field2091 += var12;
                            if (class186.field2753.field2091 < var11) {
                                break;
                            }
                            if (Statics.field2150 == null) {
                                class186.field2753.field2091 = 0;
                                int var14 = class186.field2753.method2573();
                                int var15 = class186.field2753.method2575();
                                int var16 = class186.field2753.method2573();
                                int var17 = class186.field2753.method2658();
                                long var18 = (long) ((var14 << 16) + var15);
                                class182 var20 = (class182) class186.field2750.method2161(var18);
                                Statics.field2757 = true;
                                if (var20 == null) {
                                    var20 = (class182) class186.field2755.method2161(var18);
                                    Statics.field2757 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2150 = var20;
                                Statics.field2759 = new class154(var17 + var21 + Statics.field2150.field2702);
                                Statics.field2759.method2746(var16);
                                Statics.field2759.method2562(var17);
                                class186.field2746 = 8;
                                class186.field2753.field2091 = 0;
                            } else if (class186.field2746 == 0) {
                                if (class186.field2753.field2094[0] == -1) {
                                    class186.field2746 = 1;
                                    class186.field2753.field2091 = 0;
                                } else {
                                    Statics.field2150 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2759.field2094.length - Statics.field2150.field2702;
                            int var23 = 512 - class186.field2746;
                            if (var23 > var22 - Statics.field2759.field2091) {
                                var23 = var22 - Statics.field2759.field2091;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2751.method1911(Statics.field2759.field2094, Statics.field2759.field2091, var23);
                            if (class186.field2763 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2759.field2094[Statics.field2759.field2091 + var24] ^= class186.field2763;
                                }
                            }
                            Statics.field2759.field2091 += var23;
                            class186.field2746 += var23;
                            if (Statics.field2759.field2091 == var22) {
                                if (Statics.field2150.field1879 == 16711935L) {
                                    Statics.field2001 = Statics.field2759;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class185 var26 = class186.field2762[var25];
                                        if (var26 != null) {
                                            Statics.field2001.field2091 = var25 * 8 + 5;
                                            int var27 = Statics.field2001.method2658();
                                            int var28 = Statics.field2001.method2658();
                                            var26.method3122(var27, var28);
                                        }
                                    }
                                } else {
                                    class186.field2761.reset();
                                    class186.field2761.update(Statics.field2759.field2094, 0, var22);
                                    int var29 = (int) class186.field2761.getValue();
                                    if (Statics.field2150.field2698 != var29) {
                                        try {
                                            Statics.field2751.method1915();
                                        } catch (Exception var35) {
                                        }
                                        class186.field2756++;
                                        Statics.field2751 = null;
                                        class186.field2763 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class186.field2756 = 0;
                                    class186.field2765 = 0;
                                    Statics.field2150.field2699.method3121((int) (Statics.field2150.field1879 & 0xFFFFL), Statics.field2759.field2094, (Statics.field2150.field1879 & 0xFF0000L) == 16711680L, Statics.field2757);
                                }
                                Statics.field2150.method2200();
                                if (Statics.field2757) {
                                    class186.field2749--;
                                } else {
                                    class186.field2764--;
                                }
                                class186.field2746 = 0;
                                Statics.field2150 = null;
                                Statics.field2759 = null;
                            } else {
                                if (class186.field2746 != 512) {
                                    break;
                                }
                                class186.field2746 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2751.method1915();
                } catch (Exception var34) {
                }
                class186.field2765++;
                Statics.field2751 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method393();
        }
    }

    @ObfuscatedName("client.c(S)V")
    public void method393() {
        if (class186.field2756 >= 4) {
            this.method1950("js5crc");
            field292 = 1000;
            return;
        }
        if (class186.field2765 >= 4) {
            if (field292 <= 5) {
                this.method1950("js5io");
                field292 = 1000;
                return;
            }
            field314 = 3000;
            class186.field2765 = 3;
        }
        if (--field314 + 1 > 0) {
            return;
        }
        try {
            if (field390 == 0) {
                Statics.field923 = Statics.field856.method1819(Statics.field55, Statics.field2190);
                field390++;
            }
            if (field390 == 1) {
                if (Statics.field923.field1651 == 2) {
                    this.method248(-1);
                    return;
                }
                if (Statics.field923.field1651 == 1) {
                    field390++;
                }
            }
            if (field390 == 2) {
                Statics.field1537 = new class111((Socket) Statics.field923.field1653, Statics.field856);
                class154 var1 = new class154(5);
                var1.method2746(15);
                var1.method2562(129);
                Statics.field1537.method1912(var1.field2094, 0, 5);
                field390++;
                Statics.field202 = class156.method1307();
            }
            if (field390 == 3) {
                if (field292 <= 5 || Statics.field1537.method1908() > 0) {
                    int var2 = Statics.field1537.method1910();
                    if (var2 != 0) {
                        this.method248(var2);
                        return;
                    }
                    field390++;
                } else if (class156.method1307() - Statics.field202 > 30000L) {
                    this.method248(-2);
                    return;
                }
            }
            if (field390 == 4) {
                class186.method2988(Statics.field1537, field292 > 20);
                Statics.field923 = null;
                Statics.field1537 = null;
                field390 = 0;
                field316 = 0;
            }
        } catch (IOException var4) {
            this.method248(-3);
        }
    }

    @ObfuscatedName("client.m(II)V")
    public void method248(int arg0) {
        Statics.field923 = null;
        Statics.field1537 = null;
        field390 = 0;
        if (Statics.field88 == Statics.field2190) {
            Statics.field2190 = Statics.field67;
        } else {
            Statics.field2190 = Statics.field88;
        }
        field316++;
        if (field316 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field292 <= 5) {
                this.method1950("js5connect_full");
                field292 = 1000;
            } else {
                field314 = 3000;
            }
        } else if (field316 >= 2 && arg0 == 6) {
            this.method1950("js5connect_outofdate");
            field292 = 1000;
        } else if (field316 >= 4) {
            if (field292 <= 5) {
                this.method1950("js5connect");
                field292 = 1000;
            } else {
                field314 = 3000;
            }
        }
    }

    @ObfuscatedName("dv.r(B)V")
    public static void method1937() {
        if (field312 == 0) {
            Statics.field348 = new class88(4, 104, 104, class11.field100);
            for (int var0 = 0; var0 < 4; var0++) {
                field377[var0] = new class118(104, 104);
            }
            Statics.field2132 = new class225(512, 512);
            class42.field844 = class174.field2376;
            class42.field843 = 5;
            field312 = 20;
        } else if (field312 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class85.field1454[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class88.method1648(var1, 500, 800, 512, 334);
            class42.field844 = class174.field2504;
            class42.field843 = 10;
            field312 = 30;
        } else if (field312 == 30) {
            Statics.field1898 = method696(0, false, true, true);
            Statics.field901 = method696(1, false, true, true);
            Statics.field153 = method696(2, true, false, true);
            Statics.field948 = method696(3, false, true, true);
            Statics.field1426 = method696(4, false, true, true);
            Statics.field151 = method696(5, true, true, true);
            Statics.field3080 = method696(6, true, true, false);
            Statics.field1975 = method696(7, false, true, true);
            Statics.field315 = method696(8, false, true, true);
            Statics.field221 = method696(9, false, true, true);
            Statics.field1839 = method696(10, false, true, true);
            Statics.field1707 = method696(11, false, true, true);
            Statics.field1112 = method696(12, false, true, true);
            Statics.field1838 = method696(13, true, false, true);
            Statics.field2697 = method696(14, false, true, false);
            Statics.field8 = method696(15, false, true, true);
            class42.field844 = class174.field2402;
            class42.field843 = 20;
            field312 = 40;
        } else if (field312 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1898.method3119() * 4 / 100;
            int var8 = var7 + Statics.field901.method3119() * 4 / 100;
            int var9 = var8 + Statics.field153.method3119() * 2 / 100;
            int var10 = var9 + Statics.field948.method3119() * 2 / 100;
            int var11 = var10 + Statics.field1426.method3119() * 6 / 100;
            int var12 = var11 + Statics.field151.method3119() * 4 / 100;
            int var13 = var12 + Statics.field3080.method3119() * 2 / 100;
            int var14 = var13 + Statics.field1975.method3119() * 60 / 100;
            int var15 = var14 + Statics.field315.method3119() * 2 / 100;
            int var16 = var15 + Statics.field221.method3119() * 2 / 100;
            int var17 = var16 + Statics.field1839.method3119() * 2 / 100;
            int var18 = var17 + Statics.field1707.method3119() * 2 / 100;
            int var19 = var18 + Statics.field1112.method3119() * 2 / 100;
            int var20 = var19 + Statics.field1838.method3119() * 2 / 100;
            int var21 = var20 + Statics.field2697.method3119() * 2 / 100;
            int var22 = var21 + Statics.field8.method3119() * 2 / 100;
            if (var22 == 100) {
                class42.field844 = class174.field2380;
                class42.field843 = 30;
                field312 = 45;
            } else {
                if (var22 != 0) {
                    class42.field844 = class174.field2518 + var22 + "%";
                }
                class42.field843 = 30;
            }
        } else if (field312 == 45) {
            boolean var23 = !field290;
            Statics.field1054 = 22050;
            Statics.field1063 = var23;
            Statics.field1057 = 2;
            class140 var24 = new class140();
            var24.method2341(9, 128);
            Statics.field569 = class58.method26(Statics.field856, Statics.field1748, 0, 22050);
            Statics.field569.method998(var24);
            class185 var25 = Statics.field8;
            class185 var26 = Statics.field2697;
            class185 var27 = Statics.field1426;
            Statics.field1920 = var25;
            Statics.field1919 = var26;
            Statics.field1913 = var27;
            Statics.field1914 = var24;
            Statics.field1681 = class58.method26(Statics.field856, Statics.field1748, 1, 2048);
            Statics.field4 = new class52();
            Statics.field1681.method998(Statics.field4);
            Statics.field230 = new class66(22050, Statics.field1054);
            class42.field844 = class174.field2381;
            class42.field843 = 35;
            field312 = 50;
        } else if (field312 == 50) {
            int var28 = 0;
            if (Statics.field1754 == null) {
                Statics.field1754 = class226.method237(Statics.field315, Statics.field1838, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field822 == null) {
                Statics.field822 = class226.method237(Statics.field315, Statics.field1838, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field120 == null) {
                Statics.field120 = class226.method237(Statics.field315, Statics.field1838, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class42.field844 = class174.field2382 + var28 * 100 / 3 + "%";
                class42.field843 = 40;
            } else {
                Statics.field2696 = new class231(true);
                class42.field844 = class174.field2445;
                class42.field843 = 40;
                field312 = 60;
            }
        } else if (field312 == 60) {
            class185 var29 = Statics.field1839;
            class185 var30 = Statics.field315;
            int var31 = 0;
            if (var29.method3011("title.jpg", "")) {
                var31++;
            }
            if (var30.method3011("logo", "")) {
                var31++;
            }
            if (var30.method3011("logo_deadman_mode", "")) {
                var31++;
            }
            if (var30.method3011("titlebox", "")) {
                var31++;
            }
            if (var30.method3011("titlebutton", "")) {
                var31++;
            }
            if (var30.method3011("runes", "")) {
                var31++;
            }
            if (var30.method3011("title_mute", "")) {
                var31++;
            }
            if (var30.method3032("options_radio_buttons,0")) {
                var31++;
            }
            if (var30.method3032("options_radio_buttons,2")) {
                var31++;
            }
            var30.method3011("sl_back", "");
            var30.method3011("sl_flags", "");
            var30.method3011("sl_arrows", "");
            var30.method3011("sl_stars", "");
            var30.method3011("sl_button", "");
            int var34 = class42.method1786();
            if (var31 < var34) {
                class42.field844 = class174.field2384 + var31 * 100 / var34 + "%";
                class42.field843 = 50;
            } else {
                class42.field844 = class174.field2385;
                class42.field843 = 50;
                method59(5);
                field312 = 70;
            }
        } else if (field312 == 70) {
            if (Statics.field153.method3018()) {
                class201.method204(Statics.field153);
                class185 var35 = Statics.field153;
                Statics.field2814 = var35;
                class193.method37(Statics.field153, Statics.field1975);
                class185 var36 = Statics.field153;
                class185 var37 = Statics.field1975;
                boolean var38 = field290;
                Statics.field3090 = var36;
                Statics.field2894 = var37;
                class198.field2901 = var38;
                class185 var39 = Statics.field153;
                class185 var40 = Statics.field1975;
                Statics.field3005 = var39;
                Statics.field3000 = var40;
                class199.method1791(Statics.field153, Statics.field1975, field289, Statics.field1754);
                class202.method554(Statics.field153, Statics.field1898, Statics.field901);
                class191.method2862(Statics.field153, Statics.field1975);
                class195.method646(Statics.field153);
                class185 var41 = Statics.field153;
                Statics.field2776 = var41;
                Statics.field2780 = Statics.field2776.method3023(16);
                class185 var42 = Statics.field948;
                class185 var43 = Statics.field1975;
                class185 var44 = Statics.field315;
                class185 var45 = Statics.field1838;
                Statics.field2200 = var42;
                Statics.field2201 = var43;
                Statics.field2202 = var44;
                Statics.field2644 = var45;
                Statics.field2298 = new class170[Statics.field2200.method3024()][];
                Statics.field2230 = new boolean[Statics.field2200.method3024()];
                class185 var46 = Statics.field153;
                Statics.field2775 = var46;
                class185 var47 = Statics.field153;
                Statics.field2862 = var47;
                class189.method29(Statics.field153);
                class185 var48 = Statics.field153;
                Statics.field2788 = var48;
                Statics.field203 = new class47();
                class197.method2896(Statics.field153, Statics.field315, Statics.field1838);
                class185 var49 = Statics.field153;
                class185 var50 = Statics.field315;
                Statics.field2833 = var49;
                Statics.field2832 = var50;
                class42.field844 = class174.field2581;
                class42.field843 = 60;
                field312 = 80;
            } else {
                class42.field844 = class174.field2526 + Statics.field153.method3125() + "%";
                class42.field843 = 60;
            }
        } else if (field312 == 80) {
            int var51 = 0;
            if (Statics.field2679 == null) {
                Statics.field2679 = class226.method2779(Statics.field315, "compass", "");
            } else {
                var51++;
            }
            if (Statics.field1096 == null) {
                Statics.field1096 = class226.method2779(Statics.field315, "mapedge", "");
            } else {
                var51++;
            }
            if (Statics.field2196 == null) {
                Statics.field2196 = class226.method176(Statics.field315, "mapscene", "");
            } else {
                var51++;
            }
            if (Statics.field899 == null) {
                Statics.field899 = class226.method1007(Statics.field315, "mapfunction", "");
            } else {
                var51++;
            }
            if (Statics.field1564 == null) {
                Statics.field1564 = class226.method1007(Statics.field315, "headicons_pk", "");
            } else {
                var51++;
            }
            if (Statics.field274 == null) {
                Statics.field274 = class226.method1007(Statics.field315, "headicons_prayer", "");
            } else {
                var51++;
            }
            if (Statics.field86 == null) {
                Statics.field86 = class226.method1007(Statics.field315, "headicons_hint", "");
            } else {
                var51++;
            }
            if (Statics.field1993 == null) {
                Statics.field1993 = class226.method1007(Statics.field315, "mapmarker", "");
            } else {
                var51++;
            }
            if (Statics.field163 == null) {
                Statics.field163 = class226.method1007(Statics.field315, "cross", "");
            } else {
                var51++;
            }
            if (Statics.field131 == null) {
                Statics.field131 = class226.method1007(Statics.field315, "mapdots", "");
            } else {
                var51++;
            }
            if (Statics.field82 == null) {
                Statics.field82 = class226.method176(Statics.field315, "scrollbar", "");
            } else {
                var51++;
            }
            if (Statics.field129 == null) {
                Statics.field129 = class226.method176(Statics.field315, "mod_icons", "");
            } else {
                var51++;
            }
            if (var51 < 12) {
                class42.field844 = class174.field2388 + var51 * 100 / 12 + "%";
                class42.field843 = 70;
            } else {
                Statics.field3096 = Statics.field129;
                Statics.field1096.method3871();
                int var52 = (int) (Math.random() * 21.0D) - 10;
                int var53 = (int) (Math.random() * 21.0D) - 10;
                int var54 = (int) (Math.random() * 21.0D) - 10;
                int var55 = (int) (Math.random() * 41.0D) - 20;
                for (int var56 = 0; var56 < Statics.field899.length; var56++) {
                    Statics.field899[var56].method3839(var52 + var55, var53 + var55, var54 + var55);
                }
                Statics.field2196[0].method3754(var52 + var55, var53 + var55, var54 + var55);
                class42.field844 = class174.field2389;
                class42.field843 = 70;
                field312 = 90;
            }
        } else if (field312 == 90) {
            if (Statics.field221.method3018()) {
                class75 var57 = new class75(Statics.field221, Statics.field315, 20, 0.8D, field290 ? 64 : 128);
                class85.method1550(var57);
                class85.method1589(0.8D);
                class42.field844 = class174.field2391;
                class42.field843 = 90;
                field312 = 110;
            } else {
                class42.field844 = class174.field2390 + Statics.field221.method3125() + "%";
                class42.field843 = 90;
            }
        } else if (field312 == 110) {
            Statics.field597 = new class21();
            Statics.field856.method1820(Statics.field597, 10);
            class42.field844 = class174.field2392;
            class42.field843 = 94;
            field312 = 120;
        } else if (field312 == 120) {
            if (Statics.field1839.method3011("huffman", "")) {
                class146 var58 = new class146(Statics.field1839.method3031("huffman", ""));
                Statics.field3115 = var58;
                class42.field844 = class174.field2394;
                class42.field843 = 96;
                field312 = 130;
            } else {
                class42.field844 = class174.field2624 + "%";
                class42.field843 = 96;
            }
        } else if (field312 == 130) {
            if (!Statics.field948.method3018()) {
                class42.field844 = class174.field2395 + Statics.field948.method3125() * 4 / 5 + "%";
                class42.field843 = 100;
            } else if (!Statics.field1112.method3018()) {
                class42.field844 = class174.field2395 + (80 + Statics.field1112.method3125() / 6) + "%";
                class42.field843 = 100;
            } else if (Statics.field1838.method3018()) {
                class42.field844 = class174.field2396;
                class42.field843 = 100;
                field312 = 140;
            } else {
                class42.field844 = class174.field2395 + (96 + Statics.field1838.method3125() / 20) + "%";
                class42.field843 = 100;
            }
        } else if (field312 == 140) {
            method59(10);
        }
    }

    @ObfuscatedName("aa.u(IZZZI)Lgm;")
    public static class185 method696(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class117 var4 = null;
        if (class105.field1674 != null) {
            var4 = new class117(arg0, class105.field1674, Statics.field85[arg0], 1000000);
        }
        return new class185(var4, Statics.field1959, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("a.j(B)V")
    public static final void method83() {
        try {
            if (field317 == 0) {
                if (Statics.field2119 != null) {
                    Statics.field2119.method1915();
                    Statics.field2119 = null;
                }
                Statics.field1845 = null;
                field412 = false;
                field318 = 0;
                field317 = 1;
            }
            if (field317 == 1) {
                if (Statics.field1845 == null) {
                    Statics.field1845 = Statics.field856.method1819(Statics.field55, Statics.field2190);
                }
                if (Statics.field1845.field1651 == 2) {
                    throw new IOException();
                }
                if (Statics.field1845.field1651 == 1) {
                    Statics.field2119 = new class111((Socket) Statics.field1845.field1653, Statics.field856);
                    Statics.field1845 = null;
                    field317 = 2;
                }
            }
            if (field317 == 2) {
                field295.field2091 = 0;
                field295.method2746(14);
                Statics.field2119.method1912(field295.field2094, 0, 1);
                field545.field2091 = 0;
                field317 = 3;
            }
            if (field317 == 3) {
                if (Statics.field569 != null) {
                    Statics.field569.method1000();
                }
                if (Statics.field1681 != null) {
                    Statics.field1681.method1000();
                }
                int var0 = Statics.field2119.method1910();
                if (Statics.field569 != null) {
                    Statics.field569.method1000();
                }
                if (Statics.field1681 != null) {
                    Statics.field1681.method1000();
                }
                if (var0 != 0) {
                    method2033(var0);
                    return;
                }
                field545.field2091 = 0;
                field317 = 5;
            }
            if (field317 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field295.field2091 = 0;
                field295.method2746(1);
                field295.method2746(class42.field852.method707());
                field295.method2562(var1[0]);
                field295.method2562(var1[1]);
                field295.method2562(var1[2]);
                field295.method2562(var1[3]);
                switch(class42.field852.field1622) {
                    case 0:
                        field295.field2091 += 8;
                        break;
                    case 1:
                    case 2:
                        field295.method2561(Statics.field3049);
                        field295.field2091 += 5;
                        break;
                    case 3:
                        field295.method2562((Integer) Statics.field2045.field688.get(class208.method1932(class42.field850)));
                        field295.field2091 += 4;
                }
                field295.method2571(class42.field851);
                field295.method2594(class40.field808, class40.field813);
                field363.field2091 = 0;
                if (field292 == 40) {
                    field363.method2746(18);
                } else {
                    field363.method2746(16);
                }
                field363.method2560(0);
                int var2 = field363.field2091;
                field363.method2562(129);
                field363.method2567(field295.field2094, 0, field295.field2091);
                int var3 = field363.field2091;
                field363.method2571(class42.field850);
                field363.method2746((field501 ? 1 : 0) << 1 | (field290 ? 1 : 0));
                field363.method2560(Statics.field1224);
                field363.method2560(Statics.field1756);
                class105.method34(field363);
                field363.method2571(Statics.field757);
                field363.method2562(Statics.field2189);
                class154 var4 = new class154(Statics.field2696.method3924());
                Statics.field2696.method3929(var4);
                field363.method2567(var4.field2094, 0, var4.field2094.length);
                field363.method2746(Statics.field186);
                field363.method2562(Statics.field1898.field2720);
                field363.method2562(Statics.field901.field2720);
                field363.method2562(Statics.field153.field2720);
                field363.method2562(Statics.field948.field2720);
                field363.method2562(Statics.field1426.field2720);
                field363.method2562(Statics.field151.field2720);
                field363.method2562(Statics.field3080.field2720);
                field363.method2562(Statics.field1975.field2720);
                field363.method2562(Statics.field315.field2720);
                field363.method2562(Statics.field221.field2720);
                field363.method2562(Statics.field1839.field2720);
                field363.method2562(Statics.field1707.field2720);
                field363.method2562(Statics.field1112.field2720);
                field363.method2562(Statics.field1838.field2720);
                field363.method2562(Statics.field2697.field2720);
                field363.method2562(Statics.field8.field2720);
                field363.method2713(var1, var3, field363.field2091);
                field363.method2569(field363.field2091 - var2);
                Statics.field2119.method1912(field363.field2094, 0, field363.field2091);
                field295.method2786(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field545.method2786(var1);
                field317 = 6;
            }
            if (field317 == 6 && Statics.field2119.method1908() > 0) {
                int var6 = Statics.field2119.method1910();
                if (var6 == 21 && field292 == 20) {
                    field317 = 7;
                } else if (var6 == 2) {
                    field317 = 9;
                } else if (var6 == 15 && field292 == 40) {
                    field486 = -1;
                    field317 = 13;
                } else if (var6 == 23 && field319 < 1) {
                    field319++;
                    field317 = 0;
                } else if (var6 == 29) {
                    field317 = 11;
                } else {
                    method2033(var6);
                    return;
                }
            }
            if (field317 == 7 && Statics.field2119.method1908() > 0) {
                field387 = (Statics.field2119.method1910() + 3) * 60;
                field317 = 8;
            }
            if (field317 == 8) {
                field318 = 0;
                class42.method205(class174.field2439, class174.field2401, field387 / 60 + class174.field2535);
                if (--field387 <= 0) {
                    field317 = 0;
                }
            } else {
                if (field317 == 9 && Statics.field2119.method1908() >= 13) {
                    boolean var7 = Statics.field2119.method1910() == 1;
                    Statics.field2119.method1911(field545.field2094, 0, 4);
                    field545.field2091 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field545.method2782() << 24;
                        int var10 = var9 | field545.method2782() << 16;
                        int var11 = var10 | field545.method2782() << 8;
                        int var12 = var11 | field545.method2782();
                        int var13 = class208.method1932(class42.field850);
                        if (Statics.field2045.field688.size() >= 10 && !Statics.field2045.field688.containsKey(var13)) {
                            Iterator var14 = Statics.field2045.field688.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field2045.field688.put(var13, var12);
                        class31.method748();
                    }
                    field359 = Statics.field2119.method1910();
                    field456 = Statics.field2119.method1910() == 1;
                    field441 = Statics.field2119.method1910();
                    field441 <<= 0x8;
                    field441 += Statics.field2119.method1910();
                    field411 = Statics.field2119.method1910();
                    Statics.field2119.method1911(field545.field2094, 0, 1);
                    field545.field2091 = 0;
                    field332 = field545.method2782();
                    Statics.field2119.method1911(field545.field2094, 0, 2);
                    field545.field2091 = 0;
                    field486 = field545.method2575();
                    try {
                        client var15 = Statics.field283;
                        JSObject.getWindow(var15).call("zap", (Object[]) null);
                    } catch (Throwable var22) {
                    }
                    field317 = 10;
                }
                if (field317 != 10) {
                    if (field317 == 11 && Statics.field2119.method1908() >= 2) {
                        field545.field2091 = 0;
                        Statics.field2119.method1911(field545.field2094, 0, 2);
                        field545.field2091 = 0;
                        Statics.field321 = field545.method2575();
                        field317 = 12;
                    }
                    if (field317 == 12 && Statics.field2119.method1908() >= Statics.field321) {
                        field545.field2091 = 0;
                        Statics.field2119.method1911(field545.field2094, 0, Statics.field321);
                        field545.field2091 = 0;
                        String var17 = field545.method2581();
                        String var18 = field545.method2581();
                        String var19 = field545.method2581();
                        class42.method205(var17, var18, var19);
                        method59(10);
                    }
                    if (field317 == 13) {
                        if (field486 == -1) {
                            if (Statics.field2119.method1908() < 2) {
                                return;
                            }
                            Statics.field2119.method1911(field545.field2094, 0, 2);
                            field545.field2091 = 0;
                            field486 = field545.method2575();
                        }
                        if (Statics.field2119.method1908() >= field486) {
                            Statics.field2119.method1911(field545.field2094, 0, field486);
                            field545.field2091 = 0;
                            int var20 = field486;
                            method187();
                            class46.method440(field545);
                            if (field545.field2091 != var20) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field318++;
                        if (field318 > 2000) {
                            if (field319 < 1) {
                                if (Statics.field88 == Statics.field2190) {
                                    Statics.field2190 = Statics.field67;
                                } else {
                                    Statics.field2190 = Statics.field88;
                                }
                                field319++;
                                field317 = 0;
                            } else {
                                method2033(-3);
                            }
                        }
                    }
                } else if (Statics.field2119.method1908() >= field486) {
                    field545.field2091 = 0;
                    Statics.field2119.method1911(field545.field2094, 0, field486);
                    method1449();
                    class46.method440(field545);
                    Statics.field228 = -1;
                    method2066(false);
                    field332 = -1;
                }
            }
        } catch (IOException var23) {
            if (field319 < 1) {
                if (Statics.field88 == Statics.field2190) {
                    Statics.field2190 = Statics.field67;
                } else {
                    Statics.field2190 = Statics.field88;
                }
                field319++;
                field317 = 0;
            } else {
                method2033(-2);
            }
        }
    }

    @ObfuscatedName("cn.x(I)V")
    public static void method1449() {
        field564 = -1L;
        field298 = -1;
        Statics.field597.field211 = 0;
        Statics.field84 = true;
        field299 = true;
        field513 = -1L;
        class228.method845();
        field295.field2091 = 0;
        field545.field2091 = 0;
        field332 = -1;
        field320 = -1;
        field467 = -1;
        field337 = -1;
        field333 = 0;
        field301 = 0;
        field454 = 0;
        field490 = 0;
        field519 = 0;
        field428 = false;
        class116.field1791 = 0;
        class48.method2983();
        field527 = 0;
        field524 = false;
        field529 = 0;
        field353 = (int) (Math.random() * 100.0D) - 50;
        field355 = (int) (Math.random() * 110.0D) - 55;
        field357 = (int) (Math.random() * 80.0D) - 40;
        field308 = (int) (Math.random() * 120.0D) - 60;
        field345 = (int) (Math.random() * 30.0D) - 20;
        field373 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field523 = 0;
        field516 = -1;
        field521 = 0;
        field522 = 0;
        field310 = class41.field816;
        field311 = class41.field816;
        field323 = 0;
        class46.method2868();
        for (int var0 = 0; var0 < 2048; var0++) {
            field409[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field322[var1] = null;
        }
        field419 = -1;
        field538.method2203();
        field423.method2203();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field420[var2][var3][var4] = null;
                }
            }
        }
        field371 = new class129();
        field555 = 0;
        field554 = 0;
        field558 = 0;
        for (int var5 = 0; var5 < Statics.field2780; var5++) {
            class188 var6 = class188.method740(var5);
            if (var6 != null) {
                class166.field2170[var5] = 0;
                class166.field2169[var5] = 0;
            }
        }
        Statics.field203.method807();
        field455 = -1;
        if (field543 != -1) {
            class170.method1777(field543);
        }
        for (class18 var7 = (class18) field448.method2163(); var7 != null; var7 = (class18) field448.method2171()) {
            method561(var7, true);
        }
        field543 = -1;
        field448 = new class126(8);
        field451 = null;
        field428 = false;
        field519 = 0;
        field285.method2871((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field416[var8] = null;
            field417[var8] = false;
        }
        class13.method151();
        field293 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field525[var9] = true;
        }
        method1611();
        field514 = null;
        Statics.field137 = 0;
        Statics.field77 = null;
        for (int var10 = 0; var10 < 8; var10++) {
            field532[var10] = new class5();
        }
        Statics.field750 = null;
    }

    @ObfuscatedName("x.d(I)V")
    public static void method187() {
        field295.field2091 = 0;
        field545.field2091 = 0;
        field332 = -1;
        field320 = -1;
        field467 = -1;
        field337 = -1;
        field486 = 0;
        field333 = 0;
        field301 = 0;
        field519 = 0;
        field428 = false;
        field523 = 0;
        field521 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field409[var0] = null;
        }
        Statics.field810 = null;
        for (int var1 = 0; var1 < field322.length; var1++) {
            class36 var2 = field322[var1];
            if (var2 != null) {
                var2.field625 = -1;
                var2.field626 = false;
            }
        }
        class13.method151();
        method59(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field525[var3] = true;
        }
        method1611();
    }

    @ObfuscatedName("dw.y(IB)V")
    public static void method2033(int arg0) {
        if (arg0 == -3) {
            class42.method205(class174.field2403, class174.field2404, class174.field2405);
        } else if (arg0 == -2) {
            class42.method205(class174.field2406, class174.field2407, class174.field2466);
        } else if (arg0 == -1) {
            class42.method205(class174.field2599, class174.field2377, class174.field2558);
        } else if (arg0 == 3) {
            class42.field853 = 3;
        } else if (arg0 == 4) {
            class42.method205(class174.field2412, class174.field2464, class174.field2414);
        } else if (arg0 == 5) {
            class42.method205(class174.field2578, class174.field2637, class174.field2417);
        } else if (arg0 == 6) {
            class42.method205(class174.field2487, class174.field2419, class174.field2420);
        } else if (arg0 == 7) {
            class42.method205(class174.field2421, class174.field2422, class174.field2378);
        } else if (arg0 == 8) {
            class42.method205(class174.field2424, class174.field2425, class174.field2426);
        } else if (arg0 == 9) {
            class42.method205(class174.field2427, class174.field2428, class174.field2429);
        } else if (arg0 == 10) {
            class42.method205(class174.field2550, class174.field2431, class174.field2432);
        } else if (arg0 == 11) {
            class42.method205(class174.field2433, class174.field2434, class174.field2435);
        } else if (arg0 == 12) {
            class42.method205(class174.field2436, class174.field2512, class174.field2438);
        } else if (arg0 == 13) {
            class42.method205(class174.field2542, class174.field2440, class174.field2576);
        } else if (arg0 == 14) {
            class42.method205(class174.field2442, class174.field2443, class174.field2444);
        } else if (arg0 == 16) {
            class42.method205(class174.field2413, class174.field2453, class174.field2447);
        } else if (arg0 == 17) {
            class42.method205(class174.field2448, class174.field2611, class174.field2450);
        } else if (arg0 == 18) {
            class42.method205(class174.field2457, class174.field2452, class174.field2596);
        } else if (arg0 == 19) {
            class42.method205(class174.field2613, class174.field2455, class174.field2456);
        } else if (arg0 == 20) {
            class42.method205(class174.field2517, class174.field2458, class174.field2459);
        } else if (arg0 == 22) {
            class42.method205(class174.field2430, class174.field2461, class174.field2383);
        } else if (arg0 == 23) {
            class42.method205(class174.field2463, class174.field2514, class174.field2365);
        } else if (arg0 == 24) {
            class42.method205(class174.field2471, class174.field2467, class174.field2468);
        } else if (arg0 == 25) {
            class42.method205(class174.field2469, class174.field2475, class174.field2411);
        } else if (arg0 == 26) {
            class42.method205(class174.field2423, class174.field2473, class174.field2592);
        } else if (arg0 == 27) {
            class42.method205(class174.field2629, class174.field2476, class174.field2465);
        } else if (arg0 == 31) {
            class42.method205(class174.field2484, class174.field2485, class174.field2486);
        } else if (arg0 == 32) {
            class42.method205(class174.field2508, class174.field2488, class174.field2489);
        } else if (arg0 == 37) {
            class42.method205(class174.field2490, class174.field2641, class174.field2492);
        } else if (arg0 == 38) {
            class42.method205(class174.field2493, class174.field2494, class174.field2495);
        } else if (arg0 == 55) {
            class42.method205(class174.field2496, class174.field2510, class174.field2498);
        } else if (arg0 == 56) {
            class42.method205(class174.field2418, class174.field2500, class174.field2501);
            method59(11);
            return;
        } else if (arg0 == 57) {
            class42.method205(class174.field2503, class174.field2509, class174.field2366);
            method59(11);
            return;
        } else {
            class42.method205(class174.field2477, class174.field2497, class174.field2507);
        }
        method59(10);
    }

    @ObfuscatedName("h.s(B)V")
    public static final void method147() {
        if (Statics.field2119 != null) {
            Statics.field2119.method1915();
            Statics.field2119 = null;
        }
        method1903();
        Statics.field348.method1620();
        for (int var0 = 0; var0 < 4; var0++) {
            field377[var0].method2062();
        }
        System.gc();
        class139.field1915 = 1;
        Statics.field2015 = null;
        Statics.field694 = -1;
        Statics.field1916 = -1;
        Statics.field1221 = 0;
        Statics.field1222 = false;
        Statics.field1917 = 2;
        field415 = -1;
        field526 = false;
        class32.method3528();
        method59(10);
    }

    @ObfuscatedName("dp.t(B)V")
    public static final void method1903() {
        class201.field3046.method2155();
        class192.field2810.method2155();
        class193.method1882();
        Statics.method173();
        class200.method2103();
        class199.field2950.method2155();
        class199.field2951.method2155();
        class199.field2952.method2155();
        class202.field3051.method2155();
        class202.field3055.method2155();
        class191.field2794.method2155();
        class191.field2804.method2155();
        class195.field2851.method2155();
        class188.method17();
        class197.method2863();
        class194.method2765();
        class167.field2176.method2155();
        class170.field2198.method2155();
        class170.field2282.method2155();
        class170.field2222.method2155();
        class170.field2206.method2155();
        ((class75) Statics.field1451).method1340();
        class49.field954.method2155();
        Statics.field1898.method3026();
        Statics.field901.method3026();
        Statics.field948.method3026();
        Statics.field1426.method3026();
        Statics.field151.method3026();
        Statics.field3080.method3026();
        Statics.field1975.method3026();
        Statics.field315.method3026();
        Statics.field221.method3026();
        Statics.field1839.method3026();
        Statics.field1707.method3026();
        Statics.field1112.method3026();
    }

    @ObfuscatedName("fh.z(I)V")
    public static final void method2998() {
        if (field454 > 0) {
            method147();
        } else {
            method59(40);
            Statics.field327 = Statics.field2119;
            Statics.field2119 = null;
        }
    }

    @ObfuscatedName("dw.b(I)V")
    public static final void method2046() {
        if (Statics.field1681 != null) {
            Statics.field1681.method999();
        }
        if (Statics.field569 != null) {
            Statics.field569.method999();
        }
    }

    @ObfuscatedName("m.o(Lgd;IIII)V")
    public static void method170(class202 arg0, int arg1, int arg2, int arg3) {
        if (field529 >= 50 || field528 == 0 || arg0.field3056 == null || arg1 >= arg0.field3056.length) {
            return;
        }
        int var4 = arg0.field3056[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field530[field529] = var5;
        field410[field529] = var6;
        field440[field529] = 0;
        field534[field529] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field484[field529] = (var8 << 16) + (var9 << 8) + var7;
        field529++;
    }

    @ObfuscatedName("ff.ak(II)V")
    public static void method2907(int arg0) {
        if (arg0 == -1 && !field526) {
            class139.method2987();
        } else if (arg0 != -1 && field415 != arg0 && field374 != 0 && !field526) {
            class185 var1 = Statics.field3080;
            int var2 = field374;
            class139.field1915 = 1;
            Statics.field2015 = var1;
            Statics.field694 = arg0;
            Statics.field1916 = 0;
            Statics.field1221 = var2;
            Statics.field1222 = false;
            Statics.field1917 = 2;
        }
        field415 = arg0;
    }

    @ObfuscatedName("aa.ai(I)V")
    public static final void method694() {
        if (Statics.field2355 == field516) {
            return;
        }
        field516 = Statics.field2355;
        int var0 = Statics.field2355;
        int[] var1 = Statics.field2132.field3210;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class11.field89[var0][var6][var4] & 0x18) == 0) {
                    Statics.field348.method1647(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class11.field89[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field348.method1647(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field2132.method3802();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class11.field89[var0][var10][var9] & 0x18) == 0) {
                    method69(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class11.field89[var0 + 1][var10][var9] & 0x8) != 0) {
                    method69(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field517 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field348.method1642(Statics.field2355, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class198.method1371(var14).field2922;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field377[Statics.field2355].field1822;
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
                        field520[field517] = Statics.field899[var15];
                        field358[field517] = var16;
                        field511[field517] = var17;
                        field517++;
                    }
                }
            }
        }
        Statics.field935.method3740();
    }

    @ObfuscatedName("ar.aq(Lfq;IIB)V")
    public static final void method764(class170 arg0, int arg1, int arg2) {
        if (field523 != 0 && field523 != 3 || class116.field1803 != 1 && Statics.field1663 || class116.field1803 != 4) {
            return;
        }
        class165 var3 = arg0.method2918(true);
        if (var3 == null) {
            return;
        }
        int var4 = class116.field1804 - arg1;
        int var5 = class116.field1805 - arg2;
        if (!var3.method2860(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2160 / 2;
        int var7 = var5 - var3.field2168 / 2;
        int var8 = field373 + field308 & 0x7FF;
        int var9 = class85.field1454[var8];
        int var10 = class85.field1455[var8];
        int var11 = (field345 + 256) * var9 >> 8;
        int var12 = (field345 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field810.field629 + var13 >> 7;
        int var16 = Statics.field810.field600 - var14 >> 7;
        field295.method2783(254);
        field295.method2746(18);
        field295.method2746(class106.field1694[82] ? (class106.field1694[81] ? 2 : 1) : 0);
        field295.method2606(Statics.field209 + var16);
        field295.method2577(Statics.field164 + var15);
        field295.method2746(var6);
        field295.method2746(var7);
        field295.method2560(field373);
        field295.method2746(57);
        field295.method2746(field308);
        field295.method2746(field345);
        field295.method2746(89);
        field295.method2560(Statics.field810.field629);
        field295.method2560(Statics.field810.field600);
        field295.method2746(63);
        field521 = var15;
        field522 = var16;
    }

    @ObfuscatedName("cb.an(I)V")
    public static final void method1781() {
        int[] var0 = class46.field904;
        for (int var1 = 0; var1 < class46.field909; var1++) {
            class24 var2 = field409[var0[var1]];
            if (var2 != null && var2.field615 > 0) {
                var2.field615--;
                if (var2.field615 == 0) {
                    var2.field649 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field323; var3++) {
            int var4 = field324[var3];
            class36 var5 = field322[var4];
            if (var5 != null && var5.field615 > 0) {
                var5.field615--;
                if (var5.field615 == 0) {
                    var5.field649 = null;
                }
            }
        }
    }

    @ObfuscatedName("ff.ay(I)V")
    public static final void method2906() {
        int var0 = class46.field909;
        int[] var1 = class46.field904;
        for (int var2 = 0; var2 < var0; var2++) {
            class24 var3 = field409[var1[var2]];
            if (var3 != null) {
                method818(var3, 1);
            }
        }
    }

    @ObfuscatedName("ao.ap(Lai;IS)V")
    public static final void method818(class28 arg0, int arg1) {
        if (arg0.field603 > field294) {
            method1009(arg0);
        } else if (arg0.field646 >= field294) {
            method571(arg0);
        } else {
            arg0.field628 = arg0.field599;
            if (arg0.field653 == 0) {
                arg0.field604 = 0;
            } else {
                label418: {
                    if (arg0.field631 != -1 && arg0.field634 == 0) {
                        class202 var2 = class202.method2010(arg0.field631);
                        if (arg0.field608 > 0 && var2.field3064 == 0) {
                            arg0.field604++;
                            break label418;
                        }
                        if (arg0.field608 <= 0 && var2.field3065 == 0) {
                            arg0.field604++;
                            break label418;
                        }
                    }
                    int var3 = arg0.field629;
                    int var4 = arg0.field600;
                    int var5 = arg0.field632[arg0.field653 - 1] * 128 + arg0.field641 * 64;
                    int var6 = arg0.field655[arg0.field653 - 1] * 128 + arg0.field641 * 64;
                    if (var3 < var5) {
                        if (var4 < var6) {
                            arg0.field650 = 1280;
                        } else if (var4 > var6) {
                            arg0.field650 = 1792;
                        } else {
                            arg0.field650 = 1536;
                        }
                    } else if (var3 > var5) {
                        if (var4 < var6) {
                            arg0.field650 = 768;
                        } else if (var4 > var6) {
                            arg0.field650 = 256;
                        } else {
                            arg0.field650 = 512;
                        }
                    } else if (var4 < var6) {
                        arg0.field650 = 1024;
                    } else if (var4 > var6) {
                        arg0.field650 = 0;
                    }
                    byte var7 = arg0.field656[arg0.field653 - 1];
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        int var8 = arg0.field650 - arg0.field658 & 0x7FF;
                        if (var8 > 1024) {
                            var8 -= 2048;
                        }
                        int var9 = arg0.field647;
                        if (var8 >= -256 && var8 <= 256) {
                            var9 = arg0.field623;
                        } else if (var8 >= 256 && var8 < 768) {
                            var9 = arg0.field610;
                        } else if (var8 >= -768 && var8 <= -256) {
                            var9 = arg0.field624;
                        }
                        if (var9 == -1) {
                            var9 = arg0.field623;
                        }
                        arg0.field628 = var9;
                        int var10 = 4;
                        boolean var11 = true;
                        if (arg0 instanceof class36) {
                            var11 = ((class36) arg0).field765.field3033;
                        }
                        if (var11) {
                            if (arg0.field658 != arg0.field650 && arg0.field625 == -1 && arg0.field652 != 0) {
                                var10 = 2;
                            }
                            if (arg0.field653 > 2) {
                                var10 = 6;
                            }
                            if (arg0.field653 > 3) {
                                var10 = 8;
                            }
                            if (arg0.field604 > 0 && arg0.field653 > 1) {
                                var10 = 8;
                                arg0.field604--;
                            }
                        } else {
                            if (arg0.field653 > 1) {
                                var10 = 6;
                            }
                            if (arg0.field653 > 2) {
                                var10 = 8;
                            }
                            if (arg0.field604 > 0 && arg0.field653 > 1) {
                                var10 = 8;
                                arg0.field604--;
                            }
                        }
                        if (var7 == 2) {
                            var10 <<= 0x1;
                        }
                        if (var10 >= 8 && arg0.field628 == arg0.field623 && arg0.field601 != -1) {
                            arg0.field628 = arg0.field601;
                        }
                        if (var3 != var5 || var4 != var6) {
                            if (var3 < var5) {
                                arg0.field629 += var10;
                                if (arg0.field629 > var5) {
                                    arg0.field629 = var5;
                                }
                            } else if (var3 > var5) {
                                arg0.field629 -= var10;
                                if (arg0.field629 < var5) {
                                    arg0.field629 = var5;
                                }
                            }
                            if (var4 < var6) {
                                arg0.field600 += var10;
                                if (arg0.field600 > var6) {
                                    arg0.field600 = var6;
                                }
                            } else if (var4 > var6) {
                                arg0.field600 -= var10;
                                if (arg0.field600 < var6) {
                                    arg0.field600 = var6;
                                }
                            }
                        }
                        if (arg0.field629 == var5 && arg0.field600 == var6) {
                            arg0.field653--;
                            if (arg0.field608 > 0) {
                                arg0.field608--;
                            }
                        }
                    } else {
                        arg0.field629 = var5;
                        arg0.field600 = var6;
                        arg0.field653--;
                        if (arg0.field608 > 0) {
                            arg0.field608--;
                        }
                    }
                }
            }
        }
        if (arg0.field629 < 128 || arg0.field600 < 128 || arg0.field629 >= 13184 || arg0.field600 >= 13184) {
            arg0.field631 = -1;
            arg0.field635 = -1;
            arg0.field603 = 0;
            arg0.field646 = 0;
            arg0.field629 = arg0.field632[0] * 128 + arg0.field641 * 64;
            arg0.field600 = arg0.field655[0] * 128 + arg0.field641 * 64;
            arg0.method577();
        }
        if (Statics.field810 == arg0 && (arg0.field629 < 1536 || arg0.field600 < 1536 || arg0.field629 >= 11776 || arg0.field600 >= 11776)) {
            arg0.field631 = -1;
            arg0.field635 = -1;
            arg0.field603 = 0;
            arg0.field646 = 0;
            arg0.field629 = arg0.field632[0] * 128 + arg0.field641 * 64;
            arg0.field600 = arg0.field655[0] * 128 + arg0.field641 * 64;
            arg0.method577();
        }
        if (arg0.field652 != 0) {
            if (arg0.field625 != -1) {
                class28 var12 = null;
                if (arg0.field625 < 32768) {
                    var12 = field322[arg0.field625];
                } else if (arg0.field625 >= 32768) {
                    var12 = field409[arg0.field625 - 32768];
                }
                if (var12 != null) {
                    int var13 = arg0.field629 - var12.field629;
                    int var14 = arg0.field600 - var12.field600;
                    if (var13 != 0 || var14 != 0) {
                        arg0.field650 = (int) (Math.atan2((double) var13, (double) var14) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field626) {
                    arg0.field625 = -1;
                    arg0.field626 = false;
                }
            }
            if (arg0.field627 != -1 && (arg0.field653 == 0 || arg0.field604 > 0)) {
                arg0.field650 = arg0.field627;
                arg0.field627 = -1;
            }
            int var15 = arg0.field650 - arg0.field658 & 0x7FF;
            if (var15 == 0 && arg0.field626) {
                arg0.field625 = -1;
                arg0.field626 = false;
            }
            if (var15 == 0) {
                arg0.field651 = 0;
            } else {
                arg0.field651++;
                if (var15 > 1024) {
                    arg0.field658 -= arg0.field652;
                    boolean var16 = true;
                    if (var15 < arg0.field652 || var15 > 2048 - arg0.field652) {
                        arg0.field658 = arg0.field650;
                        var16 = false;
                    }
                    if (arg0.field628 == arg0.field599 && (arg0.field651 > 25 || var16)) {
                        if (arg0.field657 == -1) {
                            arg0.field628 = arg0.field623;
                        } else {
                            arg0.field628 = arg0.field657;
                        }
                    }
                } else {
                    arg0.field658 += arg0.field652;
                    boolean var17 = true;
                    if (var15 < arg0.field652 || var15 > 2048 - arg0.field652) {
                        arg0.field658 = arg0.field650;
                        var17 = false;
                    }
                    if (arg0.field628 == arg0.field599 && (arg0.field651 > 25 || var17)) {
                        if (arg0.field605 == -1) {
                            arg0.field628 = arg0.field623;
                        } else {
                            arg0.field628 = arg0.field605;
                        }
                    }
                }
                arg0.field658 &= 0x7FF;
            }
        }
        arg0.field606 = false;
        if (arg0.field628 != -1) {
            class202 var19 = class202.method2010(arg0.field628);
            if (var19 == null || var19.field3053 == null) {
                arg0.field628 = -1;
            } else {
                arg0.field630++;
                if (arg0.field609 < var19.field3053.length && arg0.field630 > var19.field3054[arg0.field609]) {
                    arg0.field630 = 1;
                    arg0.field609++;
                    method170(var19, arg0.field609, arg0.field629, arg0.field600);
                }
                if (arg0.field609 >= var19.field3053.length) {
                    arg0.field630 = 0;
                    arg0.field609 = 0;
                    method170(var19, arg0.field609, arg0.field629, arg0.field600);
                }
            }
        }
        if (arg0.field635 != -1 && field294 >= arg0.field639) {
            if (arg0.field637 < 0) {
                arg0.field637 = 0;
            }
            int var20 = class191.method194(arg0.field635).field2798;
            if (var20 == -1) {
                arg0.field635 = -1;
            } else {
                class202 var21 = class202.method2010(var20);
                if (var21 == null || var21.field3053 == null) {
                    arg0.field635 = -1;
                } else {
                    arg0.field638++;
                    if (arg0.field637 < var21.field3053.length && arg0.field638 > var21.field3054[arg0.field637]) {
                        arg0.field638 = 1;
                        arg0.field637++;
                        method170(var21, arg0.field637, arg0.field629, arg0.field600);
                    }
                    if (arg0.field637 >= var21.field3053.length && (arg0.field637 < 0 || arg0.field637 >= var21.field3053.length)) {
                        arg0.field635 = -1;
                    }
                }
            }
        }
        if (arg0.field631 != -1 && arg0.field634 <= 1) {
            class202 var22 = class202.method2010(arg0.field631);
            if (var22.field3064 == 1 && arg0.field608 > 0 && arg0.field603 <= field294 && arg0.field646 < field294) {
                arg0.field634 = 1;
                return;
            }
        }
        if (arg0.field631 != -1 && arg0.field634 == 0) {
            class202 var23 = class202.method2010(arg0.field631);
            if (var23 == null || var23.field3053 == null) {
                arg0.field631 = -1;
            } else {
                arg0.field633++;
                if (arg0.field611 < var23.field3053.length && arg0.field633 > var23.field3054[arg0.field611]) {
                    arg0.field633 = 1;
                    arg0.field611++;
                    method170(var23, arg0.field611, arg0.field629, arg0.field600);
                }
                if (arg0.field611 >= var23.field3053.length) {
                    arg0.field611 -= var23.field3068;
                    arg0.field636++;
                    if (arg0.field636 >= var23.field3063) {
                        arg0.field631 = -1;
                    } else if (arg0.field611 >= 0 && arg0.field611 < var23.field3053.length) {
                        method170(var23, arg0.field611, arg0.field629, arg0.field600);
                    } else {
                        arg0.field631 = -1;
                    }
                }
                arg0.field606 = var23.field3059;
            }
        }
        if (arg0.field634 > 0) {
            arg0.field634--;
        }
    }

    @ObfuscatedName("bx.aj(Lai;I)V")
    public static final void method1009(class28 arg0) {
        int var1 = arg0.field603 - field294;
        int var2 = arg0.field641 * 64 + arg0.field607 * 128;
        int var3 = arg0.field643 * 128 + arg0.field641 * 64;
        arg0.field629 += (var2 - arg0.field629) / var1;
        arg0.field600 += (var3 - arg0.field600) / var1;
        arg0.field604 = 0;
        arg0.field650 = arg0.field654;
    }

    @ObfuscatedName("ai.aw(Lai;B)V")
    public static final void method571(class28 arg0) {
        if (field294 == arg0.field646 || arg0.field631 == -1 || arg0.field634 != 0 || arg0.field633 + 1 > class202.method2010(arg0.field631).field3054[arg0.field611]) {
            int var1 = arg0.field646 - arg0.field603;
            int var2 = field294 - arg0.field603;
            int var3 = arg0.field641 * 64 + arg0.field607 * 128;
            int var4 = arg0.field643 * 128 + arg0.field641 * 64;
            int var5 = arg0.field642 * 128 + arg0.field641 * 64;
            int var6 = arg0.field644 * 128 + arg0.field641 * 64;
            arg0.field629 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field600 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field604 = 0;
        arg0.field650 = arg0.field654;
        arg0.field658 = arg0.field650;
    }

    @ObfuscatedName("g.am(Lz;III)V")
    public static void method39(class24 arg0, int arg1, int arg2) {
        if (arg0.field631 == arg1 && arg1 != -1) {
            int var3 = class202.method2010(arg1).field3060;
            if (var3 == 1) {
                arg0.field611 = 0;
                arg0.field633 = 0;
                arg0.field634 = arg2;
                arg0.field636 = 0;
            }
            if (var3 == 2) {
                arg0.field636 = 0;
            }
        } else if (arg1 == -1 || arg0.field631 == -1 || class202.method2010(arg1).field3057 >= class202.method2010(arg0.field631).field3057) {
            arg0.field631 = arg1;
            arg0.field611 = 0;
            arg0.field633 = 0;
            arg0.field634 = arg2;
            arg0.field636 = 0;
            arg0.field608 = arg0.field653;
        }
    }

    @ObfuscatedName("g.av(B)I")
    public static int method58() {
        return field501 ? 2 : 1;
    }

    @ObfuscatedName("m.af(IB)V")
    public static void method167(int arg0) {
        field563 = 0L;
        if (arg0 >= 2) {
            field501 = true;
        } else {
            field501 = false;
        }
        method1094();
        if (field292 >= 25) {
            method1611();
        }
        field1776 = true;
    }

    @ObfuscatedName("cy.az(B)V")
    public static void method1611() {
        field295.method2783(172);
        field295.method2746(method58());
        field295.method2560(Statics.field1224);
        field295.method2560(Statics.field1756);
    }

    @ObfuscatedName("bp.aa(B)V")
    public static void method1094() {
        client var0 = Statics.field283;
        synchronized (Statics.field283) {
            Container var1 = Statics.field283.method1951();
            if (var1 != null) {
                Statics.field1850 = Math.max(var1.getSize().width, Statics.field1727);
                Statics.field1680 = Math.max(var1.getSize().height, Statics.field897);
                if (Statics.field2163 == var1) {
                    Insets var2 = Statics.field2163.getInsets();
                    Statics.field1850 -= var2.right + var2.left;
                    Statics.field1680 -= var2.top + var2.bottom;
                }
                if (Statics.field1850 <= 0) {
                    Statics.field1850 = 1;
                }
                if (Statics.field1680 <= 0) {
                    Statics.field1680 = 1;
                }
                if (method58() == 1) {
                    Statics.field1224 = field502;
                    Statics.field1756 = field478;
                } else {
                    Statics.field1224 = Math.min(Statics.field1850, 7680);
                    Statics.field1756 = Math.min(Statics.field1680, 2160);
                }
                field1774 = (Statics.field1850 - Statics.field1224) / 2;
                field1775 = 0;
                Statics.field1748.setSize(Statics.field1224, Statics.field1756);
                int var3 = Statics.field1224;
                int var4 = Statics.field1756;
                Canvas var5 = Statics.field1748;
                class221 var7;
                try {
                    class219 var6 = new class219();
                    var6.method3664(var3, var4, var5);
                    var7 = var6;
                } catch (Throwable var12) {
                    class224 var9 = new class224();
                    var9.method3664(var3, var4, var5);
                    var7 = var9;
                }
                Statics.field935 = var7;
                if (Statics.field2163 == var1) {
                    Insets var10 = Statics.field2163.getInsets();
                    Statics.field1748.setLocation(field1774 + var10.left, field1775 + var10.top);
                } else {
                    Statics.field1748.setLocation(field1774, field1775);
                }
                method693();
                if (field543 != -1) {
                    method699(true);
                }
                method1345();
            }
        }
    }

    @ObfuscatedName("aa.ad(B)V")
    public static void method693() {
        int var0 = Statics.field1224;
        int var1 = Statics.field1756;
        if (Statics.field1850 < var0) {
            int var2 = Statics.field1850;
        }
        if (Statics.field1680 < var1) {
            int var3 = Statics.field1680;
        }
        if (Statics.field2045 == null) {
            return;
        }
        try {
            client var4 = Statics.field283;
            Object[] var5 = new Object[] { method58() };
            JSObject.getWindow(var4).call("resize", var5);
        } catch (Throwable var7) {
        }
    }

    @ObfuscatedName("bo.ab(I)V")
    public static void method1345() {
        int var0 = field1774;
        int var1 = field1775;
        int var2 = Statics.field1850 - Statics.field1224 - var0;
        int var3 = Statics.field1680 - Statics.field1756 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field283.method1951();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field2163 == var4) {
                Insets var7 = Statics.field2163.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field1680);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field1850, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field1850 + var5 - var2, var6, var2, Statics.field1680);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field1680 + var6 - var3, Statics.field1850, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("co.al(I)V")
    public static final void method1460() {
        if (field543 != -1) {
            method819(field543);
        }
        for (int var0 = 0; var0 < field282; var0++) {
            if (field525[var0]) {
                field561[var0] = true;
            }
            field560[var0] = field525[var0];
            field525[var0] = false;
        }
        field491 = field294;
        field436 = -1;
        field341 = -1;
        Statics.field2120 = null;
        if (field543 != -1) {
            field282 = 0;
            method1096(field543, 0, 0, Statics.field1224, Statics.field1756, 0, 0, -1);
        }
        class220.method3675();
        if (field428) {
            int var1 = Statics.field1201;
            int var2 = Statics.field36;
            int var3 = Statics.field215;
            int var4 = Statics.field1644;
            int var5 = 6116423;
            class220.method3697(var1, var2, var3, var4, var5);
            class220.method3697(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class220.method3719(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
            Statics.field120.method3573(class174.field2516, var1 + 3, var2 + 14, var5, -1);
            int var6 = class116.field1795;
            int var7 = class116.field1798;
            for (int var8 = 0; var8 < field519; var8++) {
                int var9 = (field519 - 1 - var8) * 15 + var2 + 31;
                int var10 = 16777215;
                if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
                    var10 = 16776960;
                }
                Statics.field120.method3573(method2986(var8), var1 + 3, var9, var10, 0);
            }
            method3008(Statics.field1201, Statics.field36, Statics.field215, Statics.field1644);
        } else if (field436 != -1) {
            method2981(field436, field341);
        }
        if (field499 == 3) {
            for (int var11 = 0; var11 < field282; var11++) {
                if (field560[var11]) {
                    class220.method3681(field572[var11], field496[var11], field497[var11], field498[var11], 16711935, 128);
                } else if (field561[var11]) {
                    class220.method3681(field572[var11], field496[var11], field497[var11], field498[var11], 16711680, 128);
                }
            }
        }
        class32.method1029(Statics.field2355, Statics.field810.field629, Statics.field810.field600, field365);
        field365 = 0;
    }

    @ObfuscatedName("cx.as(Ljava/lang/String;ZI)V")
    public static final void method1784(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field822.method3591(arg0, 250);
        int var6 = Statics.field822.method3589(arg0, 250) * 13;
        class220.method3697(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class220.method3719(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field822.method3567(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2547(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method3008(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1748.getGraphics();
            Statics.field935.method3669(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1748.repaint();
        }
    }

    @ObfuscatedName("cf.ar(IIIIB)V")
    public static final void method1790(int arg0, int arg1, int arg2, int arg3) {
        field313++;
        method203(class16.field159);
        boolean var4 = false;
        if (field419 >= 0) {
            int var5 = class46.field909;
            int[] var6 = class46.field904;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field419 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method203(class16.field160);
        }
        method3007(true);
        method203(var4 ? class16.field162 : class16.field161);
        method3007(false);
        method148();
        for (class34 var8 = (class34) field423.method2209(); var8 != null; var8 = (class34) field423.method2211()) {
            if (Statics.field2355 != var8.field739 || var8.field748) {
                var8.method2200();
            } else if (field294 >= var8.field735) {
                var8.method656(field365);
                if (var8.field748) {
                    var8.method2200();
                } else {
                    Statics.field348.method1661(var8.field739, var8.field737, var8.field738, var8.field749, 60, var8, 0, -1, false);
                }
            }
        }
        method698(arg0, arg1, arg2, arg3, true);
        int var9 = field549;
        int var10 = field550;
        int var11 = field551;
        int var12 = field552;
        class220.method3676(var9, var10, var9 + var11, var10 + var12);
        class85.method1548();
        if (!field535) {
            int var13 = field372;
            if (field381 / 256 > var13) {
                var13 = field381 / 256;
            }
            if (field536[4] && field394[4] + 128 > var13) {
                var13 = field394[4] + 128;
            }
            int var14 = field373 + field357 & 0x7FF;
            int var15 = Statics.field786;
            int var16 = method1608(Statics.field810.field629, Statics.field810.field600, Statics.field2355) - field378;
            int var17 = Statics.field267;
            int var18 = var13 * 3 + 600;
            int var19 = 2048 - var13 & 0x7FF;
            int var20 = 2048 - var14 & 0x7FF;
            int var21 = 0;
            int var22 = 0;
            int var23 = var18;
            if (var19 != 0) {
                int var24 = class85.field1454[var19];
                int var25 = class85.field1455[var19];
                int var26 = var22 * var25 - var18 * var24 >> 16;
                var23 = var22 * var24 + var18 * var25 >> 16;
                var22 = var26;
            }
            if (var20 != 0) {
                int var27 = class85.field1454[var20];
                int var28 = class85.field1455[var20];
                int var29 = var21 * var28 + var23 * var27 >> 16;
                var23 = var23 * var28 - var21 * var27 >> 16;
                var21 = var29;
            }
            Statics.field184 = var15 - var21;
            Statics.field234 = var16 - var22;
            Statics.field30 = var17 - var23;
            Statics.field2098 = var13;
            Statics.field811 = var14;
        }
        int var30;
        if (field535) {
            int var31;
            if (Statics.field2045.field690) {
                var31 = Statics.field2355;
            } else {
                int var32 = method1608(Statics.field184, Statics.field30, Statics.field2355);
                if (var32 - Statics.field234 >= 800 || (class11.field89[Statics.field2355][Statics.field184 >> 7][Statics.field30 >> 7] & 0x4) == 0) {
                    var31 = 3;
                } else {
                    var31 = Statics.field2355;
                }
            }
            var30 = var31;
        } else {
            var30 = method695();
        }
        int var33 = Statics.field184;
        int var34 = Statics.field234;
        int var35 = Statics.field30;
        int var36 = Statics.field2098;
        int var37 = Statics.field811;
        for (int var38 = 0; var38 < 5; var38++) {
            if (field536[var38]) {
                int var39 = (int) (Math.random() * (double) (field421[var38] * 2 + 1) - (double) field421[var38] + Math.sin((double) field539[var38] / 100.0D * (double) field540[var38]) * (double) field394[var38]);
                if (var38 == 0) {
                    Statics.field184 += var39;
                }
                if (var38 == 1) {
                    Statics.field234 += var39;
                }
                if (var38 == 2) {
                    Statics.field30 += var39;
                }
                if (var38 == 3) {
                    Statics.field811 = Statics.field811 + var39 & 0x7FF;
                }
                if (var38 == 4) {
                    Statics.field2098 += var39;
                    if (Statics.field2098 < 128) {
                        Statics.field2098 = 128;
                    }
                    if (Statics.field2098 > 383) {
                        Statics.field2098 = 383;
                    }
                }
            }
        }
        int var40 = class116.field1795;
        int var41 = class116.field1798;
        if (class116.field1803 != 0) {
            var40 = class116.field1804;
            var41 = class116.field1805;
        }
        if (var40 >= var9 && var40 < var9 + var11 && var41 >= var10 && var41 < var10 + var12) {
            class83.field1411 = true;
            class83.field1396 = 0;
            class83.field1393 = var40 - var9;
            class83.field1419 = var41 - var10;
        } else {
            class83.field1411 = false;
            class83.field1396 = 0;
        }
        method2046();
        class220.method3697(var9, var10, var11, var12, 0);
        method2046();
        int var42 = class85.field1440;
        class85.field1440 = field452;
        Statics.field348.method1651(Statics.field184, Statics.field234, Statics.field30, Statics.field2098, Statics.field811, var30);
        class85.field1440 = var42;
        method2046();
        Statics.field348.method1627();
        field382 = 0;
        boolean var43 = false;
        int var44 = -1;
        int var45 = class46.field909;
        int[] var46 = class46.field904;
        for (int var47 = 0; var47 < field323 + var45; var47++) {
            class28 var48;
            if (var47 < var45) {
                var48 = field409[var46[var47]];
                if (field419 == var46[var47]) {
                    var43 = true;
                    var44 = var47;
                    continue;
                }
            } else {
                var48 = field322[field324[var47 - var45]];
            }
            method184(var48, var47, var9, var10, var11, var12);
        }
        if (var43) {
            method184(field409[field419], var44, var9, var10, var11, var12);
        }
        for (int var49 = 0; var49 < field382; var49++) {
            int var50 = field384[var49];
            int var51 = field385[var49];
            int var52 = field331[var49];
            int var53 = field386[var49];
            boolean var54 = true;
            while (var54) {
                var54 = false;
                for (int var55 = 0; var55 < var49; var55++) {
                    if (var51 + 2 > field385[var55] - field386[var55] && var51 - var53 < field385[var55] + 2 && var50 - var52 < field384[var55] + field331[var55] && var50 + var52 > field384[var55] - field331[var55] && field385[var55] - field386[var55] < var51) {
                        var51 = field385[var55] - field386[var55];
                        var54 = true;
                    }
                }
            }
            field388 = field384[var49];
            field537 = field385[var49] = var51;
            String var56 = field391[var49];
            if (field449 == 0) {
                int var57 = 16776960;
                if (field335[var49] < 6) {
                    var57 = field439[field335[var49]];
                }
                if (field335[var49] == 6) {
                    var57 = field313 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field335[var49] == 7) {
                    var57 = field313 % 20 < 10 ? 255 : 65535;
                }
                if (field335[var49] == 8) {
                    var57 = field313 % 20 < 10 ? 45056 : 8454016;
                }
                if (field335[var49] == 9) {
                    int var58 = 150 - field300[var49];
                    if (var58 < 50) {
                        var57 = var58 * 1280 + 16711680;
                    } else if (var58 < 100) {
                        var57 = 16776960 - (var58 - 50) * 327680;
                    } else if (var58 < 150) {
                        var57 = (var58 - 100) * 5 + 65280;
                    }
                }
                if (field335[var49] == 10) {
                    int var59 = 150 - field300[var49];
                    if (var59 < 50) {
                        var57 = var59 * 5 + 16711680;
                    } else if (var59 < 100) {
                        var57 = 16711935 - (var59 - 50) * 327680;
                    } else if (var59 < 150) {
                        var57 = (var59 - 100) * 327680 + 255 - (var59 - 100) * 5;
                    }
                }
                if (field335[var49] == 11) {
                    int var60 = 150 - field300[var49];
                    if (var60 < 50) {
                        var57 = 16777215 - var60 * 327685;
                    } else if (var60 < 100) {
                        var57 = (var60 - 50) * 327685 + 65280;
                    } else if (var60 < 150) {
                        var57 = 16777215 - (var60 - 100) * 327680;
                    }
                }
                if (field531[var49] == 0) {
                    Statics.field120.method3576(var56, field388 + var9, field537 + var10, var57, 0);
                }
                if (field531[var49] == 1) {
                    Statics.field120.method3578(var56, field388 + var9, field537 + var10, var57, 0, field313);
                }
                if (field531[var49] == 2) {
                    Statics.field120.method3636(var56, field388 + var9, field537 + var10, var57, 0, field313);
                }
                if (field531[var49] == 3) {
                    Statics.field120.method3580(var56, field388 + var9, field537 + var10, var57, 0, field313, 150 - field300[var49]);
                }
                if (field531[var49] == 4) {
                    int var61 = (150 - field300[var49]) * (Statics.field120.method3568(var56) + 100) / 150;
                    class220.method3677(field388 + var9 - 50, var10, field388 + var9 + 50, var10 + var12);
                    Statics.field120.method3573(var56, field388 + var9 + 50 - var61, field537 + var10, var57, 0);
                    class220.method3676(var9, var10, var9 + var11, var10 + var12);
                }
                if (field531[var49] == 5) {
                    int var62 = 150 - field300[var49];
                    int var63 = 0;
                    if (var62 < 25) {
                        var63 = var62 - 25;
                    } else if (var62 > 125) {
                        var63 = var62 - 125;
                    }
                    class220.method3677(var9, field537 + var10 - Statics.field120.field3098 - 1, var9 + var11, field537 + var10 + 5);
                    Statics.field120.method3576(var56, field388 + var9, field537 + var10 + var63, var57, 0);
                    class220.method3676(var9, var10, var9 + var11, var10 + var12);
                }
            } else {
                Statics.field120.method3576(var56, field388 + var9, field537 + var10, 16776960, 0);
            }
        }
        if (field490 == 2) {
            method2799((field305 - Statics.field164 << 7) + field336, (field403 - Statics.field209 << 7) + field309, field307 * 2);
            if (field388 > -1 && field294 % 20 < 10) {
                Statics.field86[0].method3795(field388 + var9 - 12, field537 + var10 - 28);
            }
        }
        ((class75) Statics.field1451).method1341(field365);
        method189(var9, var10, var11, var12);
        Statics.field184 = var33;
        Statics.field234 = var34;
        Statics.field30 = var35;
        Statics.field2098 = var36;
        Statics.field811 = var37;
        if (field293) {
            byte var64 = 0;
            int var65 = class186.field2766 + class186.field2749 + var64;
            if (var65 == 0) {
                field293 = false;
            }
        }
        if (field293) {
            class220.method3697(var9, var10, var11, var12, 0);
            method1784(class174.field2446, false);
        }
    }

    @ObfuscatedName("ad.at(IIIIZI)V")
    public static final void method698(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        if (var7 < field547) {
            short var8 = field547;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field546) {
                var6 = field546;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class220.method3675();
                    class220.method3697(arg0, arg1, var10, arg3, -16777216);
                    class220.method3697(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field548) {
            short var11 = field548;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field393) {
                var6 = field393;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class220.method3675();
                    class220.method3697(arg0, arg1, arg2, var13, -16777216);
                    class220.method3697(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field544 - field383) * var5 / 100 + field383;
        field452 = arg3 * var6 * var14 / 85504 << 1;
        if (field551 != arg2 || field552 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class85.field1454[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class88.method1648(var15, 500, 800, arg2, arg3);
        }
        field549 = arg0;
        field550 = arg1;
        field551 = arg2;
        field552 = arg3;
    }

    @ObfuscatedName("s.ax(Lr;B)V")
    public static final void method203(class16 arg0) {
        if (Statics.field810.field629 >> 7 == field521 && Statics.field810.field600 >> 7 == field522) {
            field521 = 0;
        }
        int var1 = class46.field909;
        int[] var2 = class46.field904;
        int var3 = var1;
        if (class16.field159 == arg0 || class16.field160 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class24 var5;
            int var6;
            if (class16.field159 == arg0) {
                var5 = Statics.field810;
                var6 = Statics.field810.field263 << 14;
            } else if (class16.field160 == arg0) {
                var5 = field409[field419];
                var6 = field419 << 14;
            } else {
                var5 = field409[var2[var4]];
                var6 = var2[var4] << 14;
                if (class16.field162 == arg0 && field419 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method215() && !var5.field246) {
                var5.field259 = false;
                if ((field290 && var1 > 50 || var1 > 200) && class16.field159 != arg0 && var5.field628 == var5.field599) {
                    var5.field259 = true;
                }
                int var7 = var5.field629 >> 7;
                int var8 = var5.field600 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field254 == null || field294 < var5.field249 || field294 >= var5.field250) {
                        if ((var5.field629 & 0x7F) == 64 && (var5.field600 & 0x7F) == 64) {
                            if (field313 == field392[var7][var8]) {
                                continue;
                            }
                            field392[var7][var8] = field313;
                        }
                        var5.field248 = method1608(var5.field629, var5.field600, Statics.field2355);
                        Statics.field348.method1661(Statics.field2355, var5.field629, var5.field600, var5.field248, 60, var5, var5.field658, var6, var5.field606);
                    } else {
                        var5.field259 = false;
                        var5.field248 = method1608(var5.field629, var5.field600, Statics.field2355);
                        Statics.field348.method1625(Statics.field2355, var5.field629, var5.field600, var5.field248, 60, var5, var5.field658, var6, var5.field255, var5.field256, var5.field240, var5.field258);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fo.ao(ZI)V")
    public static final void method3007(boolean arg0) {
        for (int var1 = 0; var1 < field323; var1++) {
            class36 var2 = field322[field324[var1]];
            int var3 = (field324[var1] << 14) + 536870912;
            if (var2 != null && var2.method215() && var2.field765.field3009 == arg0 && var2.field765.method3431()) {
                int var4 = var2.field629 >> 7;
                int var5 = var2.field600 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field641 == 1 && (var2.field629 & 0x7F) == 64 && (var2.field600 & 0x7F) == 64) {
                        if (field313 == field392[var4][var5]) {
                            continue;
                        }
                        field392[var4][var5] = field313;
                    }
                    if (!var2.field765.field3010) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field348.method1661(Statics.field2355, var2.field629, var2.field600, method1608(var2.field629 + (var2.field641 * 64 - 64), var2.field600 + (var2.field641 * 64 - 64), Statics.field2355), var2.field641 * 64 - 64 + 60, var2, var2.field658, var3, var2.field606);
                }
            }
        }
    }

    @ObfuscatedName("h.ah(I)V")
    public static final void method148() {
        for (class43 var0 = (class43) field538.method2209(); var0 != null; var0 = (class43) field538.method2211()) {
            if (Statics.field2355 != var0.field885 || field294 > var0.field866) {
                var0.method2200();
            } else if (field294 >= var0.field872) {
                if (var0.field875 > 0) {
                    class36 var1 = field322[var0.field875 - 1];
                    if (var1 != null && var1.field629 >= 0 && var1.field629 < 13312 && var1.field600 >= 0 && var1.field600 < 13312) {
                        var0.method753(var1.field629, var1.field600, method1608(var1.field629, var1.field600, var0.field885) - var0.field870, field294);
                    }
                }
                if (var0.field875 < 0) {
                    int var2 = -var0.field875 - 1;
                    class24 var3;
                    if (field441 == var2) {
                        var3 = Statics.field810;
                    } else {
                        var3 = field409[var2];
                    }
                    if (var3 != null && var3.field629 >= 0 && var3.field629 < 13312 && var3.field600 >= 0 && var3.field600 < 13312) {
                        var0.method753(var3.field629, var3.field600, method1608(var3.field629, var3.field600, var0.field885) - var0.field870, field294);
                    }
                }
                var0.method754(field365);
                Statics.field348.method1661(Statics.field2355, (int) var0.field876, (int) var0.field878, (int) var0.field884, 60, var0, var0.field865, -1, false);
            }
        }
    }

    @ObfuscatedName("aa.ac(B)I")
    public static final int method695() {
        if (Statics.field2045.field690) {
            return Statics.field2355;
        }
        int var0 = 3;
        if (Statics.field2098 < 310) {
            int var1 = Statics.field184 >> 7;
            int var2 = Statics.field30 >> 7;
            int var3 = Statics.field810.field629 >> 7;
            int var4 = Statics.field810.field600 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field2355;
            }
            if ((class11.field89[Statics.field2355][var1][var2] & 0x4) != 0) {
                var0 = Statics.field2355;
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
                    if ((class11.field89[Statics.field2355][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field2355;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class11.field89[Statics.field2355][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field2355;
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
                    if ((class11.field89[Statics.field2355][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field2355;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class11.field89[Statics.field2355][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field2355;
                        }
                    }
                }
            }
        }
        if (Statics.field810.field629 >= 0 && Statics.field810.field600 >= 0 && Statics.field810.field629 < 13312 && Statics.field810.field600 < 13312) {
            if ((class11.field89[Statics.field2355][Statics.field810.field629 >> 7][Statics.field810.field600 >> 7] & 0x4) != 0) {
                var0 = Statics.field2355;
            }
            return var0;
        } else {
            return Statics.field2355;
        }
    }

    @ObfuscatedName("j.ae(Lai;IIIIII)V")
    public static final void method184(class28 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method215()) {
            return;
        }
        if (arg0 instanceof class36) {
            class200 var6 = ((class36) arg0).field765;
            if (var6.field3029 != null) {
                var6 = var6.method3429();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class46.field909;
        int[] var8 = class46.field904;
        int var9 = 3;
        if (!arg0.field612.method2178()) {
            method152(arg0, arg0.field602 + 15);
            for (class35 var10 = (class35) arg0.field612.method2176(); var10 != null; var10 = (class35) arg0.field612.method2177()) {
                class29 var11 = var10.method667(field294);
                if (var11 != null) {
                    class194 var12 = var10.field752;
                    class225 var13 = var12.method3265();
                    class225 var14 = var12.method3264();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field2841;
                    } else {
                        if (var12.field2846 * 2 < var14.field3204) {
                            var15 = var12.field2846;
                        }
                        var16 = var14.field3204 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field294 - var11.field662;
                    int var20 = var11.field667 * var16 / var12.field2841;
                    int var23;
                    if (var11.field665 > var19) {
                        int var21 = var12.field2831 == 0 ? 0 : var19 / var12.field2831 * var12.field2831;
                        int var22 = var11.field660 * var16 / var12.field2841;
                        var23 = (var20 - var22) * var21 / var11.field665 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field665 + var12.field2842 - var19;
                        if (var12.field2839 >= 0) {
                            var17 = (var24 << 8) / (var12.field2842 - var12.field2839);
                        }
                    }
                    if (var11.field667 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field388 + arg2 - (var16 >> 1);
                    int var26 = field537 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field388 > -1) {
                            class220.method3697(var25, var26, var23, 5, 65280);
                            class220.method3697(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3205;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method3801(var27, var26, var17);
                            class220.method3677(var27, var26, var27 + var28, var26 + var29);
                            var14.method3801(var27, var26, var17);
                        } else {
                            var13.method3795(var27, var26);
                            class220.method3677(var27, var26, var27 + var28, var26 + var29);
                            var14.method3795(var27, var26);
                        }
                        class220.method3676(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method662()) {
                    var10.method2200();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class24 var30 = (class24) arg0;
            if (var30.field246) {
                return;
            }
            if (var30.field242 != -1 || var30.field243 != -1) {
                method152(arg0, arg0.field602 + 15);
                if (field388 > -1) {
                    if (var30.field242 != -1) {
                        Statics.field1564[var30.field242].method3795(field388 + arg2 - 12, field537 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field243 != -1) {
                        Statics.field274[var30.field243].method3795(field388 + arg2 - 12, field537 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field490 == 10 && field304 == var8[arg1]) {
                method152(arg0, arg0.field602 + 15);
                if (field388 > -1) {
                    Statics.field86[1].method3795(field388 + arg2 - 12, field537 + arg3 - var9);
                }
            }
        } else {
            class200 var31 = ((class36) arg0).field765;
            if (var31.field3029 != null) {
                var31 = var31.method3429();
            }
            if (var31.field3028 >= 0 && var31.field3028 < Statics.field274.length) {
                method152(arg0, arg0.field602 + 15);
                if (field388 > -1) {
                    Statics.field274[var31.field3028].method3795(field388 + arg2 - 12, field537 + arg3 - 30);
                }
            }
            if (field490 == 1 && field303 == field324[arg1 - var7] && field294 % 20 < 10) {
                method152(arg0, arg0.field602 + 15);
                if (field388 > -1) {
                    Statics.field86[0].method3795(field388 + arg2 - 12, field537 + arg3 - 28);
                }
            }
        }
        if (arg0.field649 != null && (arg1 >= var7 || !arg0.field614 && (field505 == 4 || !arg0.field613 && (field505 == 0 || field505 == 3 || field505 == 1 && method2104(((class24) arg0).field241, false))))) {
            method152(arg0, arg0.field602);
            if (field388 > -1 && field382 < field453) {
                field331[field382] = Statics.field120.method3568(arg0.field649) / 2;
                field386[field382] = Statics.field120.field3098;
                field384[field382] = field388;
                field385[field382] = field537;
                field335[field382] = arg0.field616;
                field531[field382] = arg0.field617;
                field300[field382] = arg0.field615;
                field391[field382] = arg0.field649;
                field382++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field621[var32];
            int var34 = arg0.field619[var32];
            class197 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field294) {
                    continue;
                }
                var35 = class197.method2106(arg0.field619[var32]);
                var36 = var35.field2876;
                if (var35 != null && var35.field2887 != null) {
                    var35 = var35.method3307();
                    if (var35 == null) {
                        arg0.field621[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field622[var32];
            class197 var38 = null;
            if (var37 >= 0) {
                var38 = class197.method2106(var37);
                if (var38 != null && var38.field2887 != null) {
                    var38 = var38.method3307();
                }
            }
            if (var33 - var36 <= field294) {
                if (var35 == null) {
                    arg0.field621[var32] = -1;
                } else {
                    method152(arg0, arg0.field602 / 2);
                    if (field388 > -1) {
                        if (var32 == 1) {
                            field537 -= 20;
                        }
                        if (var32 == 2) {
                            field388 -= 15;
                            field537 -= 10;
                        }
                        if (var32 == 3) {
                            field388 += 15;
                            field537 -= 10;
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
                        class225 var64 = var35.method3328();
                        if (var64 != null) {
                            var43 = var64.field3204;
                            int var65 = var64.field3205;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3208;
                        }
                        class225 var66 = var35.method3308();
                        if (var66 != null) {
                            var44 = var66.field3204;
                            int var67 = var66.field3205;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3208;
                        }
                        class225 var68 = var35.method3309();
                        if (var68 != null) {
                            var45 = var68.field3204;
                            int var69 = var68.field3205;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3208;
                        }
                        class225 var70 = var35.method3327();
                        if (var70 != null) {
                            var46 = var70.field3204;
                            int var71 = var70.field3205;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3208;
                        }
                        if (var38 != null) {
                            var51 = var38.method3328();
                            if (var51 != null) {
                                var55 = var51.field3204;
                                int var72 = var51.field3205;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3208;
                            }
                            var52 = var38.method3308();
                            if (var52 != null) {
                                var56 = var52.field3204;
                                int var73 = var52.field3205;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3208;
                            }
                            var53 = var38.method3309();
                            if (var53 != null) {
                                var57 = var53.field3204;
                                int var74 = var53.field3205;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3208;
                            }
                            var54 = var38.method3327();
                            if (var54 != null) {
                                var58 = var54.field3204;
                                int var75 = var54.field3205;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3208;
                            }
                        }
                        class209 var76 = var35.method3311();
                        if (var76 == null) {
                            var76 = Statics.field1754;
                        }
                        class209 var77;
                        if (var38 == null) {
                            var77 = Statics.field1754;
                        } else {
                            var77 = var38.method3311();
                            if (var77 == null) {
                                var77 = Statics.field1754;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method3306(arg0.field620[var32]);
                        int var83 = var76.method3568(var82);
                        if (var38 != null) {
                            var79 = var38.method3306(arg0.field645[var32]);
                            var81 = var77.method3568(var79);
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
                        int var100 = arg0.field621[var32] - field294;
                        int var101 = var35.field2881 - var35.field2881 * var100 / var35.field2876;
                        int var102 = var35.field2882 * var100 / var35.field2876 + -var35.field2882;
                        int var103 = field388 + arg2 - (var92 >> 1) + var101;
                        int var104 = field537 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field2886 + var104 + 15;
                        int var108 = var107 - var76.field3099;
                        int var109 = var76.field3100 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field2886 + var104 + 15;
                            int var111 = var110 - var77.field3099;
                            int var112 = var77.field3100 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field2872 >= 0) {
                            var115 = (var100 << 8) / (var35.field2876 - var35.field2872);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method3801(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method3801(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method3801(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method3801(var93 + var103 - var50, var104, var115);
                            }
                            var76.method3625(var82, var90 + var103, var107, var35.field2885, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method3801(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method3801(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method3801(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method3801(var97 + var103 - var62, var104, var115);
                                }
                                var77.method3625(var79, var98 + var103, var110, var38.field2885, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method3795(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method3795(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method3795(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method3795(var93 + var103 - var50, var104);
                            }
                            var76.method3573(var82, var90 + var103, var107, var35.field2885 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method3795(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method3795(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method3795(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method3795(var97 + var103 - var62, var104);
                                }
                                var77.method3573(var79, var98 + var103, var110, var38.field2885 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("en.au(B)V")
    public static final void method2550() {
        field408 = 0;
        int var0 = (Statics.field810.field629 >> 7) + Statics.field164;
        int var1 = (Statics.field810.field600 >> 7) + Statics.field209;
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

    @ObfuscatedName("d.ag(IIIII)V")
    public static final void method189(int arg0, int arg1, int arg2, int arg3) {
        if (field399 == 1) {
            Statics.field163[field398 / 100].method3795(field396 - 8, field397 - 8);
        }
        if (field399 == 2) {
            Statics.field163[field398 / 100 + 4].method3795(field396 - 8, field397 - 8);
        }
        method2550();
    }

    @ObfuscatedName("p.bq(Lai;II)V")
    public static final void method152(class28 arg0, int arg1) {
        method2799(arg0.field629, arg0.field600, arg1);
    }

    @ObfuscatedName("fx.bh(IIII)V")
    public static final void method2799(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field388 = -1;
            field537 = -1;
            return;
        }
        int var3 = method1608(arg0, arg1, Statics.field2355) - arg2;
        int var4 = arg0 - Statics.field184;
        int var5 = var3 - Statics.field234;
        int var6 = arg1 - Statics.field30;
        int var7 = class85.field1454[Statics.field2098];
        int var8 = class85.field1455[Statics.field2098];
        int var9 = class85.field1454[Statics.field811];
        int var10 = class85.field1455[Statics.field811];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field388 = field452 * var11 / var15 + field551 / 2;
            field537 = field452 * var14 / var15 + field552 / 2;
        } else {
            field388 = -1;
            field537 = -1;
        }
    }

    @ObfuscatedName("ck.bw(IIIB)I")
    public static final int method1608(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class11.field89[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class11.field100[var5][var3][var4] + class11.field100[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class11.field100[var5][var3][var4 + 1] + class11.field100[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("dl.ba(ZB)V")
    public static final void method2066(boolean arg0) {
        field350 = arg0;
        if (!field350) {
            int var1 = field545.method2609();
            int var2 = field545.method2609();
            int var3 = field545.method2575();
            Statics.field2892 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field2892[var4][var5] = field545.method2658();
                }
            }
            Statics.field347 = new int[var3];
            Statics.field42 = new int[var3];
            Statics.field172 = new int[var3];
            Statics.field2691 = new byte[var3][];
            Statics.field187 = new byte[var3][];
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
                        Statics.field347[var7] = var10;
                        Statics.field42[var7] = Statics.field151.method3028("m" + var8 + "_" + var9);
                        Statics.field172[var7] = Statics.field151.method3028("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method100(var1, var2);
            return;
        }
        int var11 = field545.method2611();
        int var12 = field545.method2575();
        int var13 = field545.method2575();
        field545.method2784();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field545.method2785(1);
                    if (var17 == 1) {
                        field351[var14][var15][var16] = field545.method2785(26);
                    } else {
                        field351[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field545.method2789();
        Statics.field2892 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field2892[var18][var19] = field545.method2658();
            }
        }
        Statics.field347 = new int[var13];
        Statics.field42 = new int[var13];
        Statics.field172 = new int[var13];
        Statics.field2691 = new byte[var13][];
        Statics.field187 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field351[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field347[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field347[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field42[var20] = Statics.field151.method3028("m" + var29 + "_" + var30);
                            Statics.field172[var20] = Statics.field151.method3028("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method100(var11, var12);
    }

    @ObfuscatedName("v.be(IIB)V")
    public static final void method100(int arg0, int arg1) {
        if (Statics.field228 == arg0 && Statics.field504 == arg1) {
            return;
        }
        Statics.field228 = arg0;
        Statics.field504 = arg1;
        method59(25);
        method1784(class174.field2446, true);
        int var2 = Statics.field164;
        int var3 = Statics.field209;
        Statics.field164 = (arg0 - 6) * 8;
        Statics.field209 = (arg1 - 6) * 8;
        int var4 = Statics.field164 - var2;
        int var5 = Statics.field209 - var3;
        int var6 = Statics.field164;
        int var7 = Statics.field209;
        for (int var8 = 0; var8 < 32768; var8++) {
            class36 var9 = field322[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field632[var10] -= var4;
                    var9.field655[var10] -= var5;
                }
                var9.field629 -= var4 * 128;
                var9.field600 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class24 var12 = field409[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field632[var13] -= var4;
                    var12.field655[var13] -= var5;
                }
                var12.field629 -= var4 * 128;
                var12.field600 -= var5 * 128;
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
                        field420[var24][var20][var21] = field420[var24][var22][var23];
                    } else {
                        field420[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class26 var25 = (class26) field371.method2209(); var25 != null; var25 = (class26) field371.method2211()) {
            var25.field575 -= var4;
            var25.field582 -= var5;
            if (var25.field575 < 0 || var25.field582 < 0 || var25.field575 >= 104 || var25.field582 >= 104) {
                var25.method2200();
            }
        }
        if (field521 != 0) {
            field521 -= var4;
            field522 -= var5;
        }
        field529 = 0;
        field535 = false;
        field516 = -1;
        field423.method2203();
        field538.method2203();
        for (int var26 = 0; var26 < 4; var26++) {
            field377[var26].method2062();
        }
    }

    @ObfuscatedName("b.bx(ZI)V")
    public static final void method238(boolean arg0) {
        method2046();
        field334++;
        if (field334 < 50 && !arg0) {
            return;
        }
        field334 = 0;
        if (field412 || Statics.field2119 == null) {
            return;
        }
        field295.method2783(212);
        try {
            Statics.field2119.method1912(field295.field2094, 0, field295.field2091);
            field295.field2091 = 0;
        } catch (IOException var2) {
            field412 = true;
        }
    }

    @ObfuscatedName("fz.bs(I)V")
    public static final void method2990() {
        method238(false);
        field342 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field2691.length; var1++) {
            if (Statics.field42[var1] != -1 && Statics.field2691[var1] == null) {
                Statics.field2691[var1] = Statics.field151.method3014(Statics.field42[var1], 0);
                if (Statics.field2691[var1] == null) {
                    var0 = false;
                    field342++;
                }
            }
            if (Statics.field172[var1] != -1 && Statics.field187[var1] == null) {
                Statics.field187[var1] = Statics.field151.method3022(Statics.field172[var1], 0, Statics.field2892[var1]);
                if (Statics.field187[var1] == null) {
                    var0 = false;
                    field342++;
                }
            }
        }
        if (!var0) {
            field346 = 1;
            return;
        }
        field344 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field2691.length; var3++) {
            byte[] var4 = Statics.field187[var3];
            if (var4 != null) {
                int var5 = (Statics.field347[var3] >> 8) * 64 - Statics.field164;
                int var6 = (Statics.field347[var3] & 0xFF) * 64 - Statics.field209;
                if (field350) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class154 var9 = new class154(var4);
                int var10 = -1;
                label461: while (true) {
                    int var11 = var9.method2586();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2586();
                            if (var16 == 0) {
                                continue label461;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2573() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class198 var22 = class198.method1371(var10);
                                if (var19 != 22 || !field290 || var22.field2912 != 0 || var22.field2910 == 1 || var22.field2931) {
                                    if (!var22.method3337()) {
                                        field344++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2586();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2573();
                    }
                }
            }
        }
        if (!var2) {
            field346 = 2;
            return;
        }
        if (field346 != 0) {
            method1784(class174.field2446 + class38.field788 + class38.field785 + 100 + "%" + class38.field784, true);
        }
        method2046();
        method1903();
        method2046();
        Statics.field348.method1620();
        method2046();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field377[var23].method2062();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class11.field89[var24][var25][var26] = 0;
                }
            }
        }
        method2046();
        class11.method3185();
        int var27 = Statics.field2691.length;
        for (class32 var28 = (class32) class32.field707.method2209(); var28 != null; var28 = (class32) class32.field707.method2211()) {
            if (var28.field710 != null) {
                Statics.field4.method894(var28.field710);
                var28.field710 = null;
            }
            if (var28.field715 != null) {
                Statics.field4.method894(var28.field715);
                var28.field715 = null;
            }
        }
        class32.field707.method2203();
        method238(true);
        if (!field350) {
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = (Statics.field347[var29] >> 8) * 64 - Statics.field164;
                int var31 = (Statics.field347[var29] & 0xFF) * 64 - Statics.field209;
                byte[] var32 = Statics.field2691[var29];
                if (var32 != null) {
                    method2046();
                    class11.method27(var32, var30, var31, Statics.field228 * 8 - 48, Statics.field504 * 8 - 48, field377);
                }
            }
            for (int var33 = 0; var33 < var27; var33++) {
                int var34 = (Statics.field347[var33] >> 8) * 64 - Statics.field164;
                int var35 = (Statics.field347[var33] & 0xFF) * 64 - Statics.field209;
                byte[] var36 = Statics.field2691[var33];
                if (var36 == null && Statics.field504 < 800) {
                    method2046();
                    class11.method1821(var34, var35, 64, 64);
                }
            }
            method238(true);
            for (int var37 = 0; var37 < var27; var37++) {
                byte[] var38 = Statics.field187[var37];
                if (var38 != null) {
                    int var39 = (Statics.field347[var37] >> 8) * 64 - Statics.field164;
                    int var40 = (Statics.field347[var37] & 0xFF) * 64 - Statics.field209;
                    method2046();
                    class11.method1812(var38, var39, var40, Statics.field348, field377);
                }
            }
        }
        if (field350) {
            for (int var41 = 0; var41 < 4; var41++) {
                method2046();
                for (int var42 = 0; var42 < 13; var42++) {
                    for (int var43 = 0; var43 < 13; var43++) {
                        boolean var44 = false;
                        int var45 = field351[var41][var42][var43];
                        if (var45 != -1) {
                            int var46 = var45 >> 24 & 0x3;
                            int var47 = var45 >> 1 & 0x3;
                            int var48 = var45 >> 14 & 0x3FF;
                            int var49 = var45 >> 3 & 0x7FF;
                            int var50 = (var48 / 8 << 8) + var49 / 8;
                            for (int var51 = 0; var51 < Statics.field347.length; var51++) {
                                if (Statics.field347[var51] == var50 && Statics.field2691[var51] != null) {
                                    byte[] var52 = Statics.field2691[var51];
                                    int var53 = var42 * 8;
                                    int var54 = var43 * 8;
                                    int var55 = (var48 & 0x7) * 8;
                                    int var56 = (var49 & 0x7) * 8;
                                    class118[] var57 = field377;
                                    for (int var58 = 0; var58 < 8; var58++) {
                                        for (int var59 = 0; var59 < 8; var59++) {
                                            if (var53 + var58 > 0 && var53 + var58 < 103 && var54 + var59 > 0 && var54 + var59 < 103) {
                                                var57[var41].field1822[var53 + var58][var54 + var59] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class154 var60 = new class154(var52);
                                    for (int var61 = 0; var61 < 4; var61++) {
                                        for (int var62 = 0; var62 < 64; var62++) {
                                            for (int var63 = 0; var63 < 64; var63++) {
                                                if (var46 == var61 && var62 >= var55 && var62 < var55 + 8 && var63 >= var56 && var63 < var56 + 8) {
                                                    Statics.method185(var60, var41, var53 + class169.method840(var62 & 0x7, var63 & 0x7, var47), var54 + class169.method629(var62 & 0x7, var63 & 0x7, var47), 0, 0, var47);
                                                } else {
                                                    Statics.method185(var60, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var44 = true;
                                    break;
                                }
                            }
                        }
                        if (!var44) {
                            class11.method81(var41, var42 * 8, var43 * 8);
                        }
                    }
                }
            }
            for (int var64 = 0; var64 < 13; var64++) {
                for (int var65 = 0; var65 < 13; var65++) {
                    int var66 = field351[0][var64][var65];
                    if (var66 == -1) {
                        class11.method1821(var64 * 8, var65 * 8, 8, 8);
                    }
                }
            }
            method238(true);
            for (int var67 = 0; var67 < 4; var67++) {
                method2046();
                for (int var68 = 0; var68 < 13; var68++) {
                    for (int var69 = 0; var69 < 13; var69++) {
                        int var70 = field351[var67][var68][var69];
                        if (var70 != -1) {
                            int var71 = var70 >> 24 & 0x3;
                            int var72 = var70 >> 1 & 0x3;
                            int var73 = var70 >> 14 & 0x3FF;
                            int var74 = var70 >> 3 & 0x7FF;
                            int var75 = (var73 / 8 << 8) + var74 / 8;
                            for (int var76 = 0; var76 < Statics.field347.length; var76++) {
                                if (Statics.field347[var76] == var75 && Statics.field187[var76] != null) {
                                    class11.method2105(Statics.field187[var76], var67, var68 * 8, var69 * 8, var71, (var73 & 0x7) * 8, (var74 & 0x7) * 8, var72, Statics.field348, field377);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method238(true);
        method1903();
        method2046();
        class11.method199(Statics.field348, field377);
        method238(true);
        int var77 = class11.field103;
        if (var77 > Statics.field2355) {
            var77 = Statics.field2355;
        }
        if (var77 < Statics.field2355 - 1) {
            int var78 = Statics.field2355 - 1;
        }
        if (field290) {
            Statics.field348.method1614(class11.field103);
        } else {
            Statics.field348.method1614(0);
        }
        for (int var79 = 0; var79 < 104; var79++) {
            for (int var80 = 0; var80 < 104; var80++) {
                method82(var79, var80);
            }
        }
        method2046();
        for (class26 var81 = (class26) field371.method2209(); var81 != null; var81 = (class26) field371.method2211()) {
            if (var81.field579 == -1) {
                var81.field583 = 0;
                method1804(var81);
            } else {
                var81.method2200();
            }
        }
        class198.field2896.method2155();
        if (Statics.field2163 != null) {
            field295.method2783(213);
            field295.method2562(1057001181);
        }
        if (!field350) {
            int var82 = (Statics.field228 - 6) / 8;
            int var83 = (Statics.field228 + 6) / 8;
            int var84 = (Statics.field504 - 6) / 8;
            int var85 = (Statics.field504 + 6) / 8;
            for (int var86 = var82 - 1; var86 <= var83 + 1; var86++) {
                for (int var87 = var84 - 1; var87 <= var85 + 1; var87++) {
                    if (var86 < var82 || var86 > var83 || var87 < var84 || var87 > var85) {
                        Statics.field151.method3033("m" + var86 + "_" + var87);
                        Statics.field151.method3033("l" + var86 + "_" + var87);
                    }
                }
            }
        }
        method59(30);
        method2046();
        class11.method2308();
        field295.method2783(115);
        class114.method1815();
    }

    @ObfuscatedName("n.bd(IIIIII)V")
    public static final void method69(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field348.method1639(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field348.method1643(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2132.field3210;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class198 var13 = class198.method1371(var12);
            if (var13.field2940 == -1) {
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
                class223 var14 = Statics.field2196[var13.field2940];
                if (var14 != null) {
                    int var15 = (var13.field2908 * 4 - var14.field3194) / 2;
                    int var16 = (var13.field2909 * 4 - var14.field3198) / 2;
                    var14.method3753(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field2909) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field348.method1641(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field348.method1643(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class198 var22 = class198.method1371(var21);
            if (var22.field2940 != -1) {
                class223 var23 = Statics.field2196[var22.field2940];
                if (var23 != null) {
                    int var24 = (var22.field2908 * 4 - var23.field3194) / 2;
                    int var25 = (var22.field2909 * 4 - var23.field3198) / 2;
                    var23.method3753(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field2909) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2132.field3210;
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
        int var29 = Statics.field348.method1642(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class198 var31 = class198.method1371(var30);
        if (var31.field2940 == -1) {
            return;
        }
        class223 var32 = Statics.field2196[var31.field2940];
        if (var32 != null) {
            int var33 = (var31.field2908 * 4 - var32.field3194) / 2;
            int var34 = (var31.field2909 * 4 - var32.field3198) / 2;
            var32.method3753(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field2909) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("ar.bm(I)V")
    public static final void method762() {
        if (field332 == 51) {
            int var0 = field545.method2573();
            int var1 = (var0 >> 4 & 0x7) + Statics.field778;
            int var2 = (var0 & 0x7) + Statics.field1600;
            int var3 = field545.method2575();
            int var4 = field545.method2573();
            int var5 = var4 >> 4 & 0xF;
            int var6 = var4 & 0x7;
            int var7 = field545.method2573();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                int var8 = var5 + 1;
                if (Statics.field810.field632[0] >= var1 - var8 && Statics.field810.field632[0] <= var1 + var8 && Statics.field810.field655[0] >= var2 - var8 && Statics.field810.field655[0] <= var2 + var8 && field528 != 0 && var6 > 0 && field529 < 50) {
                    field530[field529] = var3;
                    field410[field529] = var6;
                    field440[field529] = var7;
                    field534[field529] = null;
                    field484[field529] = (var1 << 16) + (var2 << 8) + var5;
                    field529++;
                }
            }
        }
        if (field332 == 83) {
            int var9 = field545.method2564();
            int var10 = field545.method2575();
            int var11 = field545.method2600();
            int var12 = (var11 >> 4 & 0x7) + Statics.field778;
            int var13 = (var11 & 0x7) + Statics.field1600;
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                class44 var14 = new class44();
                var14.field894 = var10;
                var14.field891 = var9;
                if (field420[Statics.field2355][var12][var13] == null) {
                    field420[Statics.field2355][var12][var13] = new class129();
                }
                field420[Statics.field2355][var12][var13].method2226(var14);
                method82(var12, var13);
            }
        } else if (field332 == 218) {
            int var15 = field545.method2602();
            int var16 = var15 >> 2;
            int var17 = var15 & 0x3;
            int var18 = field492[var16];
            int var19 = field545.method2737();
            int var20 = (var19 >> 4 & 0x7) + Statics.field778;
            int var21 = (var19 & 0x7) + Statics.field1600;
            if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                Statics.method1077(Statics.field2355, var20, var21, var18, -1, var16, var17, 0, -1);
            }
        } else if (field332 == 203) {
            int var22 = field545.method2573();
            int var23 = (var22 >> 4 & 0x7) + Statics.field778;
            int var24 = (var22 & 0x7) + Statics.field1600;
            int var25 = field545.method2575();
            int var26 = field545.method2575();
            int var27 = field545.method2575();
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                class129 var28 = field420[Statics.field2355][var23][var24];
                if (var28 != null) {
                    for (class44 var29 = (class44) var28.method2209(); var29 != null; var29 = (class44) var28.method2211()) {
                        if ((var25 & 0x7FFF) == var29.field894 && var29.field891 == var26) {
                            var29.field891 = var27;
                            break;
                        }
                    }
                    method82(var23, var24);
                }
            }
        } else if (field332 == 16) {
            int var30 = field545.method2573();
            int var31 = (var30 >> 4 & 0x7) + Statics.field778;
            int var32 = (var30 & 0x7) + Statics.field1600;
            int var33 = field545.method2575();
            int var34 = field545.method2573();
            int var35 = field545.method2575();
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                int var36 = var31 * 128 + 64;
                int var37 = var32 * 128 + 64;
                class34 var38 = new class34(var33, Statics.field2355, var36, var37, method1608(var36, var37, Statics.field2355) - var34, var35, field294);
                field423.method2226(var38);
            }
        } else if (field332 == 216) {
            int var39 = field545.method2564();
            int var40 = field545.method2602();
            int var41 = (var40 >> 4 & 0x7) + Statics.field778;
            int var42 = (var40 & 0x7) + Statics.field1600;
            if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
                class129 var43 = field420[Statics.field2355][var41][var42];
                if (var43 != null) {
                    for (class44 var44 = (class44) var43.method2209(); var44 != null; var44 = (class44) var43.method2211()) {
                        if ((var39 & 0x7FFF) == var44.field894) {
                            var44.method2200();
                            break;
                        }
                    }
                    if (var43.method2209() == null) {
                        field420[Statics.field2355][var41][var42] = null;
                    }
                    method82(var41, var42);
                }
            }
        } else if (field332 == 215) {
            int var45 = field545.method2573();
            int var46 = (var45 >> 4 & 0x7) + Statics.field778;
            int var47 = (var45 & 0x7) + Statics.field1600;
            int var48 = var46 + field545.method2574();
            int var49 = var47 + field545.method2574();
            int var50 = field545.method2576();
            int var51 = field545.method2575();
            int var52 = field545.method2573() * 4;
            int var53 = field545.method2573() * 4;
            int var54 = field545.method2575();
            int var55 = field545.method2575();
            int var56 = field545.method2573();
            int var57 = field545.method2573();
            if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104 && var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104 && var51 != 65535) {
                int var58 = var46 * 128 + 64;
                int var59 = var47 * 128 + 64;
                int var60 = var48 * 128 + 64;
                int var61 = var49 * 128 + 64;
                class43 var62 = new class43(var51, Statics.field2355, var58, var59, method1608(var58, var59, Statics.field2355) - var52, field294 + var54, field294 + var55, var56, var57, var50, var53);
                var62.method753(var60, var61, method1608(var60, var61, Statics.field2355) - var53, field294 + var54);
                field538.method2226(var62);
            }
        } else if (field332 == 192) {
            int var63 = field545.method2737();
            int var64 = var63 >> 2;
            int var65 = var63 & 0x3;
            int var66 = field492[var64];
            int var67 = field545.method2575();
            int var68 = field545.method2602();
            int var69 = (var68 >> 4 & 0x7) + Statics.field778;
            int var70 = (var68 & 0x7) + Statics.field1600;
            if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
                Statics.method1077(Statics.field2355, var69, var70, var66, var67, var64, var65, 0, -1);
            }
        } else if (field332 == 155) {
            int var71 = field545.method2564();
            int var72 = field545.method2600();
            int var73 = var72 >> 2;
            int var74 = var72 & 0x3;
            int var75 = field492[var73];
            int var76 = field545.method2600();
            int var77 = (var76 >> 4 & 0x7) + Statics.field778;
            int var78 = (var76 & 0x7) + Statics.field1600;
            if (var77 >= 0 && var78 >= 0 && var77 < 103 && var78 < 103) {
                if (var75 == 0) {
                    class91 var79 = Statics.field348.method1635(Statics.field2355, var77, var78);
                    if (var79 != null) {
                        int var80 = var79.field1541 >> 14 & 0x7FFF;
                        if (var73 == 2) {
                            var79.field1546 = new class50(var80, 2, var74 + 4, Statics.field2355, var77, var78, var71, false, var79.field1546);
                            var79.field1545 = new class50(var80, 2, var74 + 1 & 0x3, Statics.field2355, var77, var78, var71, false, var79.field1545);
                        } else {
                            var79.field1546 = new class50(var80, var73, var74, Statics.field2355, var77, var78, var71, false, var79.field1546);
                        }
                    }
                }
                if (var75 == 1) {
                    class96 var81 = Statics.field348.method1636(Statics.field2355, var77, var78);
                    if (var81 != null) {
                        int var82 = var81.field1597 >> 14 & 0x7FFF;
                        if (var73 == 4 || var73 == 5) {
                            var81.field1590 = new class50(var82, 4, var74, Statics.field2355, var77, var78, var71, false, var81.field1590);
                        } else if (var73 == 6) {
                            var81.field1590 = new class50(var82, 4, var74 + 4, Statics.field2355, var77, var78, var71, false, var81.field1590);
                        } else if (var73 == 7) {
                            var81.field1590 = new class50(var82, 4, (var74 + 2 & 0x3) + 4, Statics.field2355, var77, var78, var71, false, var81.field1590);
                        } else if (var73 == 8) {
                            var81.field1590 = new class50(var82, 4, var74 + 4, Statics.field2355, var77, var78, var71, false, var81.field1590);
                            var81.field1591 = new class50(var82, 4, (var74 + 2 & 0x3) + 4, Statics.field2355, var77, var78, var71, false, var81.field1591);
                        }
                    }
                }
                if (var75 == 2) {
                    class97 var83 = Statics.field348.method1754(Statics.field2355, var77, var78);
                    if (var73 == 11) {
                        var73 = 10;
                    }
                    if (var83 != null) {
                        var83.field1604 = new class50(var83.field1601 >> 14 & 0x7FFF, var73, var74, Statics.field2355, var77, var78, var71, false, var83.field1604);
                    }
                }
                if (var75 == 3) {
                    class79 var84 = Statics.field348.method1706(Statics.field2355, var77, var78);
                    if (var84 != null) {
                        var84.field1298 = new class50(var84.field1296 >> 14 & 0x7FFF, 22, var74, Statics.field2355, var77, var78, var71, false, var84.field1298);
                    }
                }
            }
        } else if (field332 == 18) {
            byte var85 = field545.method2645();
            int var86 = field545.method2611();
            int var87 = field545.method2564();
            byte var88 = field545.method2574();
            byte var89 = field545.method2734();
            int var90 = field545.method2602();
            int var91 = (var90 >> 4 & 0x7) + Statics.field778;
            int var92 = (var90 & 0x7) + Statics.field1600;
            int var93 = field545.method2575();
            int var94 = field545.method2564();
            byte var95 = field545.method2593();
            int var96 = field545.method2737();
            int var97 = var96 >> 2;
            int var98 = var96 & 0x3;
            int var99 = field492[var97];
            class24 var100;
            if (field441 == var87) {
                var100 = Statics.field810;
            } else {
                var100 = field409[var87];
            }
            if (var100 != null) {
                class198 var101 = class198.method1371(var86);
                int var102;
                int var103;
                if (var98 == 1 || var98 == 3) {
                    var102 = var101.field2909;
                    var103 = var101.field2908;
                } else {
                    var102 = var101.field2908;
                    var103 = var101.field2909;
                }
                int var104 = (var102 >> 1) + var91;
                int var105 = (var102 + 1 >> 1) + var91;
                int var106 = (var103 >> 1) + var92;
                int var107 = (var103 + 1 >> 1) + var92;
                int[][] var108 = class11.field100[Statics.field2355];
                int var109 = var108[var104][var106] + var108[var105][var106] + var108[var104][var107] + var108[var105][var107] >> 2;
                int var110 = (var91 << 7) + (var102 << 6);
                int var111 = (var92 << 7) + (var103 << 6);
                class83 var112 = var101.method3368(var97, var98, var108, var110, var109, var111);
                if (var112 != null) {
                    Statics.method1077(Statics.field2355, var91, var92, var99, -1, 0, 0, var93 + 1, var94 + 1);
                    var100.field249 = field294 + var93;
                    var100.field250 = field294 + var94;
                    var100.field254 = var112;
                    var100.field251 = var91 * 128 + var102 * 64;
                    var100.field253 = var92 * 128 + var103 * 64;
                    var100.field252 = var109;
                    if (var88 > var95) {
                        byte var113 = var88;
                        var88 = var95;
                        var95 = var113;
                    }
                    if (var89 > var85) {
                        byte var114 = var89;
                        var89 = var85;
                        var85 = var114;
                    }
                    var100.field255 = var88 + var91;
                    var100.field240 = var91 + var95;
                    var100.field256 = var89 + var92;
                    var100.field258 = var85 + var92;
                }
            }
        }
    }

    @ObfuscatedName("ce.br(Lo;B)V")
    public static final void method1804(class26 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field574 == 0) {
            var1 = Statics.field348.method1639(arg0.field587, arg0.field575, arg0.field582);
        }
        if (arg0.field574 == 1) {
            var1 = Statics.field348.method1640(arg0.field587, arg0.field575, arg0.field582);
        }
        if (arg0.field574 == 2) {
            var1 = Statics.field348.method1641(arg0.field587, arg0.field575, arg0.field582);
        }
        if (arg0.field574 == 3) {
            var1 = Statics.field348.method1642(arg0.field587, arg0.field575, arg0.field582);
        }
        if (var1 != 0) {
            int var5 = Statics.field348.method1643(arg0.field587, arg0.field575, arg0.field582, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field577 = var2;
        arg0.field576 = var3;
        arg0.field584 = var4;
    }

    @ObfuscatedName("au.bp(IIIIIIII)V")
    public static final void method863(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field290 && Statics.field2355 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field348.method1639(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field348.method1640(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field348.method1641(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field348.method1642(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field348.method1643(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field348.method1630(arg0, arg2, arg3);
                class198 var15 = class198.method1371(var12);
                if (var15.field2910 != 0) {
                    field377[arg0].method2068(arg2, arg3, var13, var14, var15.field2911);
                }
            }
            if (arg1 == 1) {
                Statics.field348.method1696(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field348.method1637(arg0, arg2, arg3);
                class198 var16 = class198.method1371(var12);
                if (var16.field2908 + arg2 > 103 || var16.field2908 + arg3 > 103 || var16.field2909 + arg2 > 103 || var16.field2909 + arg3 > 103) {
                    return;
                }
                if (var16.field2910 != 0) {
                    field377[arg0].method2072(arg2, arg3, var16.field2908, var16.field2909, var14, var16.field2911);
                }
            }
            if (arg1 == 3) {
                Statics.field348.method1763(arg0, arg2, arg3);
                class198 var17 = class198.method1371(var12);
                if (var17.field2910 == 1) {
                    field377[arg0].method2071(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class11.field89[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class88 var19 = Statics.field348;
        class118 var20 = field377[arg0];
        class198 var21 = class198.method1371(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field2909;
            var23 = var21.field2908;
        } else {
            var22 = var21.field2908;
            var23 = var21.field2909;
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
        int[][] var28 = class11.field100[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field2912 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field2933 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class90 var34;
            if (var21.field2914 == -1 && var21.field2934 == null) {
                var34 = var21.method3368(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class50(arg4, 22, arg5, var18, arg2, arg3, var21.field2914, true, (class90) null);
            }
            var19.method1619(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field2910 == 1) {
                var20.method2070(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class90 var57;
            if (var21.field2914 == -1 && var21.field2934 == null) {
                var57 = var21.method3368(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class50(arg4, 10, arg5, var18, arg2, arg3, var21.field2914, true, (class90) null);
            }
            if (var57 != null) {
                var19.method1623(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field2910 != 0) {
                var20.method2064(arg2, arg3, var22, var23, var21.field2911);
            }
        } else if (arg6 >= 12) {
            class90 var35;
            if (var21.field2914 == -1 && var21.field2934 == null) {
                var35 = var21.method3368(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class50(arg4, arg6, arg5, var18, arg2, arg3, var21.field2914, true, (class90) null);
            }
            var19.method1623(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field2910 != 0) {
                var20.method2064(arg2, arg3, var22, var23, var21.field2911);
            }
        } else if (arg6 == 0) {
            class90 var36;
            if (var21.field2914 == -1 && var21.field2934 == null) {
                var36 = var21.method3368(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class50(arg4, 0, arg5, var18, arg2, arg3, var21.field2914, true, (class90) null);
            }
            var19.method1663(arg0, arg2, arg3, var29, var36, (class90) null, class11.field91[arg5], 0, var32, var33);
            if (var21.field2910 != 0) {
                var20.method2063(arg2, arg3, arg6, arg5, var21.field2911);
            }
        } else if (arg6 == 1) {
            class90 var37;
            if (var21.field2914 == -1 && var21.field2934 == null) {
                var37 = var21.method3368(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class50(arg4, 1, arg5, var18, arg2, arg3, var21.field2914, true, (class90) null);
            }
            var19.method1663(arg0, arg2, arg3, var29, var37, (class90) null, class11.field96[arg5], 0, var32, var33);
            if (var21.field2910 != 0) {
                var20.method2063(arg2, arg3, arg6, arg5, var21.field2911);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class90 var39;
            class90 var40;
            if (var21.field2914 == -1 && var21.field2934 == null) {
                var39 = var21.method3368(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method3368(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class50(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field2914, true, (class90) null);
                var40 = new class50(arg4, 2, var38, var18, arg2, arg3, var21.field2914, true, (class90) null);
            }
            var19.method1663(arg0, arg2, arg3, var29, var39, var40, class11.field91[arg5], class11.field91[var38], var32, var33);
            if (var21.field2910 != 0) {
                var20.method2063(arg2, arg3, arg6, arg5, var21.field2911);
            }
        } else if (arg6 == 3) {
            class90 var41;
            if (var21.field2914 == -1 && var21.field2934 == null) {
                var41 = var21.method3368(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class50(arg4, 3, arg5, var18, arg2, arg3, var21.field2914, true, (class90) null);
            }
            var19.method1663(arg0, arg2, arg3, var29, var41, (class90) null, class11.field96[arg5], 0, var32, var33);
            if (var21.field2910 != 0) {
                var20.method2063(arg2, arg3, arg6, arg5, var21.field2911);
            }
        } else if (arg6 == 9) {
            class90 var42;
            if (var21.field2914 == -1 && var21.field2934 == null) {
                var42 = var21.method3368(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class50(arg4, arg6, arg5, var18, arg2, arg3, var21.field2914, true, (class90) null);
            }
            var19.method1623(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field2910 != 0) {
                var20.method2064(arg2, arg3, var22, var23, var21.field2911);
            }
        } else if (arg6 == 4) {
            class90 var43;
            if (var21.field2914 == -1 && var21.field2934 == null) {
                var43 = var21.method3368(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class50(arg4, 4, arg5, var18, arg2, arg3, var21.field2914, true, (class90) null);
            }
            var19.method1622(arg0, arg2, arg3, var29, var43, (class90) null, class11.field91[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1639(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class198.method1371(var45 >> 14 & 0x7FFF).field2893;
            }
            class90 var46;
            if (var21.field2914 == -1 && var21.field2934 == null) {
                var46 = var21.method3368(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class50(arg4, 4, arg5, var18, arg2, arg3, var21.field2914, true, (class90) null);
            }
            var19.method1622(arg0, arg2, arg3, var29, var46, (class90) null, class11.field91[arg5], 0, class11.field97[arg5] * var44, class11.field95[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1639(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class198.method1371(var48 >> 14 & 0x7FFF).field2893 / 2;
            }
            class90 var49;
            if (var21.field2914 == -1 && var21.field2934 == null) {
                var49 = var21.method3368(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class50(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field2914, true, (class90) null);
            }
            var19.method1622(arg0, arg2, arg3, var29, var49, (class90) null, 256, arg5, class11.field99[arg5] * var47, class11.field90[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class90 var51;
            if (var21.field2914 == -1 && var21.field2934 == null) {
                var51 = var21.method3368(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class50(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field2914, true, (class90) null);
            }
            var19.method1622(arg0, arg2, arg3, var29, var51, (class90) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1639(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class198.method1371(var53 >> 14 & 0x7FFF).field2893 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class90 var55;
            class90 var56;
            if (var21.field2914 == -1 && var21.field2934 == null) {
                var55 = var21.method3368(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method3368(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class50(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field2914, true, (class90) null);
                var56 = new class50(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field2914, true, (class90) null);
            }
            var19.method1622(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class11.field99[arg5] * var52, class11.field90[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("a.bl(IIB)V")
    public static final void method82(int arg0, int arg1) {
        class129 var2 = field420[Statics.field2355][arg0][arg1];
        if (var2 == null) {
            Statics.field348.method1634(Statics.field2355, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class44 var5 = null;
        for (class44 var6 = (class44) var2.method2209(); var6 != null; var6 = (class44) var2.method2211()) {
            class199 var7 = class199.method96(var6.field894);
            long var8 = (long) var7.field2967;
            if (var7.field2979 == 1) {
                var8 = (long) (var6.field891 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field348.method1634(Statics.field2355, arg0, arg1);
            return;
        }
        var2.method2205(var5);
        class44 var10 = null;
        class44 var11 = null;
        for (class44 var12 = (class44) var2.method2209(); var12 != null; var12 = (class44) var2.method2211()) {
            if (var5.field894 != var12.field894) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field894 != var12.field894 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field348.method1633(Statics.field2355, arg0, arg1, method1608(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2355), var5, var13, var10, var11);
    }

    @ObfuscatedName("hu.bn(ZS)V")
    public static final void method3655(boolean arg0) {
        field518 = 0;
        field325 = 0;
        field545.method2784();
        int var1 = field545.method2785(8);
        if (var1 < field323) {
            for (int var2 = var1; var2 < field323; var2++) {
                field413[++field518 - 1] = field324[var2];
            }
        }
        if (var1 > field323) {
            throw new RuntimeException("");
        }
        field323 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field324[var3];
            class36 var5 = field322[var4];
            int var6 = field545.method2785(1);
            if (var6 == 0) {
                field324[++field323 - 1] = var4;
                var5.field648 = field294;
            } else {
                int var7 = field545.method2785(2);
                if (var7 == 0) {
                    field324[++field323 - 1] = var4;
                    var5.field648 = field294;
                    field406[++field325 - 1] = var4;
                } else if (var7 == 1) {
                    field324[++field323 - 1] = var4;
                    var5.field648 = field294;
                    int var8 = field545.method2785(3);
                    var5.method675(var8, (byte) 1);
                    int var9 = field545.method2785(1);
                    if (var9 == 1) {
                        field406[++field325 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field324[++field323 - 1] = var4;
                    var5.field648 = field294;
                    int var10 = field545.method2785(3);
                    var5.method675(var10, (byte) 2);
                    int var11 = field545.method2785(3);
                    var5.method675(var11, (byte) 2);
                    int var12 = field545.method2785(1);
                    if (var12 == 1) {
                        field406[++field325 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field413[++field518 - 1] = var4;
                }
            }
        }
        while (field545.method2795(field486) >= 27) {
            int var13 = field545.method2785(15);
            if (var13 == 32767) {
                break;
            }
            boolean var17 = false;
            if (field322[var13] == null) {
                field322[var13] = new class36();
                var17 = true;
            }
            class36 var18 = field322[var13];
            field324[++field323 - 1] = var13;
            var18.field648 = field294;
            int var19 = field545.method2785(1);
            int var20;
            if (arg0) {
                var20 = field545.method2785(8);
                if (var20 > 127) {
                    var20 -= 256;
                }
            } else {
                var20 = field545.method2785(5);
                if (var20 > 15) {
                    var20 -= 32;
                }
            }
            int var21 = field545.method2785(1);
            if (var21 == 1) {
                field406[++field325 - 1] = var13;
            }
            var18.field765 = class200.method1368(field545.method2785(14));
            int var22;
            if (arg0) {
                var22 = field545.method2785(8);
                if (var22 > 127) {
                    var22 -= 256;
                }
            } else {
                var22 = field545.method2785(5);
                if (var22 > 15) {
                    var22 -= 32;
                }
            }
            int var23 = field418[field545.method2785(3)];
            if (var17) {
                var18.field650 = var18.field658 = var23;
            }
            var18.field641 = var18.field765.field3013;
            var18.field652 = var18.field765.field2999;
            if (var18.field652 == 0) {
                var18.field658 = 0;
            }
            var18.field623 = var18.field765.field3004;
            var18.field647 = var18.field765.field3012;
            var18.field624 = var18.field765.field3002;
            var18.field610 = var18.field765.field3014;
            var18.field599 = var18.field765.field3008;
            var18.field657 = var18.field765.field3003;
            var18.field605 = var18.field765.field3011;
            var18.method671(Statics.field810.field632[0] + var20, Statics.field810.field655[0] + var22, var19 == 1);
        }
        field545.method2789();
        method178();
        for (int var14 = 0; var14 < field518; var14++) {
            int var15 = field413[var14];
            if (field294 != field322[var15].field648) {
                field322[var15].field765 = null;
                field322[var15] = null;
            }
        }
        if (field486 != field545.field2091) {
            throw new RuntimeException(field545.field2091 + class38.field783 + field486);
        }
        for (int var16 = 0; var16 < field323; var16++) {
            if (field322[field324[var16]] == null) {
                throw new RuntimeException(var16 + class38.field783 + field323);
            }
        }
    }

    @ObfuscatedName("u.bf(I)V")
    public static final void method178() {
        for (int var0 = 0; var0 < field325; var0++) {
            int var1 = field406[var0];
            class36 var2 = field322[var1];
            int var3 = field545.method2573();
            if ((var3 & 0x10) != 0) {
                var2.field635 = field545.method2564();
                int var4 = field545.method2620();
                var2.field640 = var4 >> 16;
                var2.field639 = (var4 & 0xFFFF) + field294;
                var2.field637 = 0;
                var2.field638 = 0;
                if (var2.field639 > field294) {
                    var2.field637 = -1;
                }
                if (var2.field635 == 65535) {
                    var2.field635 = -1;
                }
            }
            if ((var3 & 0x40) != 0) {
                int var5 = field545.method2611();
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = field545.method2602();
                if (var2.field631 == var5 && var5 != -1) {
                    int var7 = class202.method2010(var5).field3060;
                    if (var7 == 1) {
                        var2.field611 = 0;
                        var2.field633 = 0;
                        var2.field634 = var6;
                        var2.field636 = 0;
                    }
                    if (var7 == 2) {
                        var2.field636 = 0;
                    }
                } else if (var5 == -1 || var2.field631 == -1 || class202.method2010(var5).field3057 >= class202.method2010(var2.field631).field3057) {
                    var2.field631 = var5;
                    var2.field611 = 0;
                    var2.field633 = 0;
                    var2.field634 = var6;
                    var2.field636 = 0;
                    var2.field608 = var2.field653;
                }
            }
            if ((var3 & 0x8) != 0) {
                var2.field765 = class200.method1368(field545.method2611());
                var2.field641 = var2.field765.field3013;
                var2.field652 = var2.field765.field2999;
                var2.field623 = var2.field765.field3004;
                var2.field647 = var2.field765.field3012;
                var2.field624 = var2.field765.field3002;
                var2.field610 = var2.field765.field3014;
                var2.field599 = var2.field765.field3008;
                var2.field657 = var2.field765.field3003;
                var2.field605 = var2.field765.field3011;
            }
            if ((var3 & 0x20) != 0) {
                int var8 = field545.method2600();
                if (var8 > 0) {
                    for (int var9 = 0; var9 < var8; var9++) {
                        int var10 = -1;
                        int var11 = -1;
                        int var12 = -1;
                        int var13 = field545.method2586();
                        if (var13 == 32767) {
                            var13 = field545.method2586();
                            var11 = field545.method2586();
                            var10 = field545.method2586();
                            var12 = field545.method2586();
                        } else if (var13 == 32766) {
                            var13 = -1;
                        } else {
                            var11 = field545.method2586();
                        }
                        int var14 = field545.method2586();
                        var2.method565(var13, var11, var10, var12, field294, var14);
                    }
                }
                int var15 = field545.method2600();
                if (var15 > 0) {
                    for (int var16 = 0; var16 < var15; var16++) {
                        int var17 = field545.method2586();
                        int var18 = field545.method2586();
                        if (var18 == 32767) {
                            var2.method567(var17);
                        } else {
                            int var19 = field545.method2586();
                            int var20 = field545.method2602();
                            int var21 = var18 > 0 ? field545.method2737() : var20;
                            var2.method566(var17, field294, var18, var19, var20, var21);
                        }
                    }
                }
            }
            if ((var3 & 0x2) != 0) {
                var2.field649 = field545.method2581();
                var2.field615 = 100;
            }
            if ((var3 & 0x4) != 0) {
                int var22 = field545.method2609();
                int var23 = field545.method2609();
                int var24 = var2.field629 - (var22 - Statics.field164 - Statics.field164) * 64;
                int var25 = var2.field600 - (var23 - Statics.field209 - Statics.field209) * 64;
                if (var24 != 0 || var25 != 0) {
                    var2.field627 = (int) (Math.atan2((double) var24, (double) var25) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x1) != 0) {
                var2.field625 = field545.method2611();
                if (var2.field625 == 65535) {
                    var2.field625 = -1;
                }
            }
        }
    }

    @ObfuscatedName("fi.bb(III)V")
    public static final void method2981(int arg0, int arg1) {
        if (field519 < 2 && field527 == 0 && !field524) {
            return;
        }
        String var2;
        if (field527 == 1 && field519 < 2) {
            var2 = class174.field2511 + class174.field2521 + field376 + " " + class38.field787;
        } else if (field524 && field519 < 2) {
            var2 = field445 + class174.field2521 + field328 + " " + class38.field787;
        } else {
            var2 = method2986(field519 - 1);
        }
        if (field519 > 2) {
            var2 = var2 + class38.method2763(16777215) + " " + '/' + " " + (field519 - 2) + class174.field2441;
        }
        Statics.field120.method3581(var2, arg0 + 4, arg1 + 15, 16777215, 0, field294 / 1000);
    }

    @ObfuscatedName("ex.bg(IIIII)V")
    public static final void method2547(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field282; var4++) {
            if (field572[var4] + field497[var4] > arg0 && field572[var4] < arg0 + arg2 && field498[var4] + field496[var4] > arg1 && field496[var4] < arg1 + arg3) {
                field525[var4] = true;
            }
        }
    }

    @ObfuscatedName("fo.bu(IIIII)V")
    public static final void method3008(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field282; var4++) {
            if (field572[var4] + field497[var4] > arg0 && field572[var4] < arg0 + arg2 && field498[var4] + field496[var4] > arg1 && field496[var4] < arg1 + arg3) {
                field561[var4] = true;
            }
        }
    }

    @ObfuscatedName("fj.bj(IIB)V")
    public static final void method2985(int arg0, int arg1) {
        int var2 = Statics.field120.method3568(class174.field2516);
        for (int var3 = 0; var3 < field519; var3++) {
            int var4 = Statics.field120.method3568(method2986(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field519 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field1224) {
            var6 = Statics.field1224 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field1756) {
            var7 = Statics.field1756 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field428 = true;
        Statics.field1201 = var6;
        Statics.field36 = var7;
        Statics.field215 = var2;
        Statics.field1644 = field519 * 15 + 22;
    }

    @ObfuscatedName("q.by(II)Z")
    public static final boolean method95(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field389[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("gv.bc(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method3152(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 18) {
            field396 = arg6;
            field397 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field295.method2783(247);
            field295.method2577(Statics.field164 + arg0);
            field295.method2607(arg3);
            field295.method2560(Statics.field209 + arg1);
            field295.method2746(class106.field1694[82] ? 1 : 0);
        }
        if (arg2 == 16) {
            field396 = arg6;
            field397 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field295.method2783(225);
            field295.method2749(class106.field1694[82] ? 1 : 0);
            field295.method2606(Statics.field2133);
            field295.method2577(Statics.field209 + arg1);
            field295.method2607(arg3);
            field295.method2560(Statics.field164 + arg0);
            field295.method2577(Statics.field104);
            field295.method2618(Statics.field2942);
        }
        if (arg2 == 9) {
            class36 var8 = field322[arg3];
            if (var8 != null) {
                field396 = arg6;
                field397 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field295.method2783(96);
                field295.method2577(arg3);
                field295.method2598(class106.field1694[82] ? 1 : 0);
            }
        }
        if (arg2 == 29) {
            field295.method2783(97);
            field295.method2562(arg1);
            class170 var9 = class170.method3227(arg1);
            if (var9.field2321 != null && var9.field2321[0][0] == 5) {
                int var10 = var9.field2321[0][1];
                if (class166.field2169[var10] != var9.field2323[0]) {
                    class166.field2169[var10] = var9.field2323[0];
                    method820(var10);
                }
            }
        }
        if (arg2 == 36) {
            field295.method2783(193);
            field295.method2577(arg0);
            field295.method2707(arg1);
            field295.method2606(arg3);
            field400 = 0;
            Statics.field108 = class170.method3227(arg1);
            field507 = arg0;
        }
        if (arg2 == 35) {
            field295.method2783(9);
            field295.method2560(arg3);
            field295.method2707(arg1);
            field295.method2606(arg0);
            field400 = 0;
            Statics.field108 = class170.method3227(arg1);
            field507 = arg0;
        }
        if (arg2 == 21) {
            field396 = arg6;
            field397 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field295.method2783(113);
            field295.method2607(Statics.field164 + arg0);
            field295.method2606(Statics.field209 + arg1);
            field295.method2560(arg3);
            field295.method2749(class106.field1694[82] ? 1 : 0);
        }
        if (arg2 == 23) {
            Statics.field348.method1650(Statics.field2355, arg0, arg1);
        }
        if (arg2 == 25) {
            class170 var11 = class170.method562(arg1, arg0);
            if (var11 != null) {
                method102();
                int var12 = class171.method1929(method2479(var11));
                int var13 = var11.field2329;
                class170 var14 = class170.method562(arg1, arg0);
                if (var14 != null && var14.field2335 != null) {
                    class19 var15 = new class19();
                    var15.field188 = var14;
                    var15.field189 = var14.field2335;
                    class33.method192(var15);
                }
                field339 = var13;
                field524 = true;
                Statics.field233 = arg1;
                field443 = arg0;
                Statics.field2781 = var12;
                method1788(var14);
                field527 = 0;
                field445 = method2476(var11);
                if (field445 == null) {
                    field445 = "Null";
                }
                if (var11.field2199) {
                    field328 = var11.field2313 + class38.method2763(16777215);
                } else {
                    field328 = class38.method2763(65280) + var11.field2273 + class38.method2763(16777215);
                }
            }
            return;
        }
        if (arg2 == 1004) {
            field396 = arg6;
            field397 = arg7;
            field399 = 2;
            field398 = 0;
            field295.method2783(209);
            field295.method2606(arg3);
        }
        if (arg2 == 6) {
            field396 = arg6;
            field397 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field295.method2783(34);
            field295.method2560(arg3 >> 14 & 0x7FFF);
            field295.method2607(Statics.field209 + arg1);
            field295.method2598(class106.field1694[82] ? 1 : 0);
            field295.method2577(Statics.field164 + arg0);
        }
        if (arg2 == 7) {
            class36 var16 = field322[arg3];
            if (var16 != null) {
                field396 = arg6;
                field397 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field295.method2783(37);
                field295.method2577(arg3);
                field295.method2607(Statics.field104);
                field295.method2598(class106.field1694[82] ? 1 : 0);
                field295.method2562(Statics.field2942);
                field295.method2607(Statics.field2133);
            }
        }
        if (arg2 == 34) {
            field295.method2783(136);
            field295.method2560(arg0);
            field295.method2607(arg3);
            field295.method2562(arg1);
            field400 = 0;
            Statics.field108 = class170.method3227(arg1);
            field507 = arg0;
        }
        if (arg2 == 1003) {
            field396 = arg6;
            field397 = arg7;
            field399 = 2;
            field398 = 0;
            class36 var17 = field322[arg3];
            if (var17 != null) {
                class200 var18 = var17.field765;
                if (var18.field3029 != null) {
                    var18 = var18.method3429();
                }
                if (var18 != null) {
                    field295.method2783(106);
                    field295.method2577(var18.field3027);
                }
            }
        }
        if (arg2 == 26) {
            method669();
        }
        if (arg2 == 1001) {
            field396 = arg6;
            field397 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field295.method2783(92);
            field295.method2560(Statics.field164 + arg0);
            field295.method2606(arg3 >> 14 & 0x7FFF);
            field295.method2606(Statics.field209 + arg1);
            field295.method2746(class106.field1694[82] ? 1 : 0);
        }
        if (arg2 == 20) {
            field396 = arg6;
            field397 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field295.method2783(11);
            field295.method2606(Statics.field164 + arg0);
            field295.method2606(Statics.field209 + arg1);
            field295.method2598(class106.field1694[82] ? 1 : 0);
            field295.method2607(arg3);
        }
        if (arg2 == 5) {
            field396 = arg6;
            field397 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field295.method2783(158);
            field295.method2606(arg3 >> 14 & 0x7FFF);
            field295.method2746(class106.field1694[82] ? 1 : 0);
            field295.method2560(Statics.field209 + arg1);
            field295.method2577(Statics.field164 + arg0);
        }
        if (arg2 == 15) {
            class24 var19 = field409[arg3];
            if (var19 != null) {
                field396 = arg6;
                field397 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field295.method2783(222);
                field295.method2749(class106.field1694[82] ? 1 : 0);
                field295.method2560(field443);
                field295.method2560(arg3);
                field295.method2707(Statics.field233);
            }
        }
        if (arg2 == 10) {
            class36 var20 = field322[arg3];
            if (var20 != null) {
                field396 = arg6;
                field397 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field295.method2783(249);
                field295.method2749(class106.field1694[82] ? 1 : 0);
                field295.method2560(arg3);
            }
        }
        if (arg2 == 37) {
            field295.method2783(33);
            field295.method2607(arg0);
            field295.method2618(arg1);
            field295.method2606(arg3);
            field400 = 0;
            Statics.field108 = class170.method3227(arg1);
            field507 = arg0;
        }
        if (arg2 == 1) {
            field396 = arg6;
            field397 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field295.method2783(185);
            field295.method2707(Statics.field2942);
            field295.method2577(Statics.field164 + arg0);
            field295.method2577(Statics.field209 + arg1);
            field295.method2598(class106.field1694[82] ? 1 : 0);
            field295.method2560(Statics.field104);
            field295.method2607(Statics.field2133);
            field295.method2607(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 12) {
            class36 var21 = field322[arg3];
            if (var21 != null) {
                field396 = arg6;
                field397 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field295.method2783(81);
                field295.method2598(class106.field1694[82] ? 1 : 0);
                field295.method2577(arg3);
            }
        }
        if (arg2 == 50) {
            class24 var22 = field409[arg3];
            if (var22 != null) {
                field396 = arg6;
                field397 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field295.method2783(203);
                field295.method2607(arg3);
                field295.method2599(class106.field1694[82] ? 1 : 0);
            }
        }
        if (arg2 == 31) {
            field295.method2783(218);
            field295.method2606(arg3);
            field295.method2562(Statics.field2942);
            field295.method2606(Statics.field2133);
            field295.method2577(Statics.field104);
            field295.method2562(arg1);
            field295.method2607(arg0);
            field400 = 0;
            Statics.field108 = class170.method3227(arg1);
            field507 = arg0;
        }
        if (arg2 == 49) {
            class24 var23 = field409[arg3];
            if (var23 != null) {
                field396 = arg6;
                field397 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field295.method2783(181);
                field295.method2607(arg3);
                field295.method2599(class106.field1694[82] ? 1 : 0);
            }
        }
        if (arg2 == 22) {
            field396 = arg6;
            field397 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field295.method2783(215);
            field295.method2598(class106.field1694[82] ? 1 : 0);
            field295.method2607(arg3);
            field295.method2577(Statics.field209 + arg1);
            field295.method2560(Statics.field164 + arg0);
        }
        if (arg2 == 42) {
            field295.method2783(70);
            field295.method2560(arg3);
            field295.method2707(arg1);
            field295.method2560(arg0);
            field400 = 0;
            Statics.field108 = class170.method3227(arg1);
            field507 = arg0;
        }
        if (arg2 == 17) {
            field396 = arg6;
            field397 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field295.method2783(71);
            field295.method2607(Statics.field209 + arg1);
            field295.method2599(class106.field1694[82] ? 1 : 0);
            field295.method2606(field443);
            field295.method2606(Statics.field164 + arg0);
            field295.method2606(arg3);
            field295.method2562(Statics.field233);
        }
        if (arg2 == 47) {
            class24 var24 = field409[arg3];
            if (var24 != null) {
                field396 = arg6;
                field397 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field295.method2783(57);
                field295.method2598(class106.field1694[82] ? 1 : 0);
                field295.method2560(arg3);
            }
        }
        if (arg2 == 14) {
            class24 var25 = field409[arg3];
            if (var25 != null) {
                field396 = arg6;
                field397 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field295.method2783(202);
                field295.method2749(class106.field1694[82] ? 1 : 0);
                field295.method2560(Statics.field2133);
                field295.method2618(Statics.field2942);
                field295.method2606(Statics.field104);
                field295.method2607(arg3);
            }
        }
        if (arg2 == 24) {
            class170 var26 = class170.method3227(arg1);
            boolean var27 = true;
            if (var26.field2213 > 0) {
                var27 = method774(var26);
            }
            if (var27) {
                field295.method2783(97);
                field295.method2562(arg1);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class170 var28 = class170.method562(arg1, arg0);
            if (var28 != null) {
                int var29 = var28.field2329;
                class170 var30 = class170.method562(arg1, arg0);
                if (var30 != null) {
                    if (var30.field2309 != null) {
                        class19 var31 = new class19();
                        var31.field188 = var30;
                        var31.field199 = arg3;
                        var31.field195 = arg5;
                        var31.field189 = var30.field2309;
                        class33.method192(var31);
                    }
                    boolean var32 = true;
                    if (var30.field2213 > 0) {
                        var32 = method774(var30);
                    }
                    if (var32) {
                        int var33 = method2479(var30);
                        int var34 = arg3 - 1;
                        boolean var35 = (var33 >> var34 + 1 & 0x1) != 0;
                        if (var35) {
                            if (arg3 == 1) {
                                field295.method2783(48);
                                field295.method2562(arg1);
                                field295.method2560(arg0);
                                field295.method2560(var29);
                            }
                            if (arg3 == 2) {
                                field295.method2783(2);
                                field295.method2562(arg1);
                                field295.method2560(arg0);
                                field295.method2560(var29);
                            }
                            if (arg3 == 3) {
                                field295.method2783(50);
                                field295.method2562(arg1);
                                field295.method2560(arg0);
                                field295.method2560(var29);
                            }
                            if (arg3 == 4) {
                                field295.method2783(155);
                                field295.method2562(arg1);
                                field295.method2560(arg0);
                                field295.method2560(var29);
                            }
                            if (arg3 == 5) {
                                field295.method2783(231);
                                field295.method2562(arg1);
                                field295.method2560(arg0);
                                field295.method2560(var29);
                            }
                            if (arg3 == 6) {
                                field295.method2783(29);
                                field295.method2562(arg1);
                                field295.method2560(arg0);
                                field295.method2560(var29);
                            }
                            if (arg3 == 7) {
                                field295.method2783(84);
                                field295.method2562(arg1);
                                field295.method2560(arg0);
                                field295.method2560(var29);
                            }
                            if (arg3 == 8) {
                                field295.method2783(229);
                                field295.method2562(arg1);
                                field295.method2560(arg0);
                                field295.method2560(var29);
                            }
                            if (arg3 == 9) {
                                field295.method2783(104);
                                field295.method2562(arg1);
                                field295.method2560(arg0);
                                field295.method2560(var29);
                            }
                            if (arg3 == 10) {
                                field295.method2783(128);
                                field295.method2562(arg1);
                                field295.method2560(arg0);
                                field295.method2560(var29);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 28) {
            field295.method2783(97);
            field295.method2562(arg1);
            class170 var36 = class170.method3227(arg1);
            if (var36.field2321 != null && var36.field2321[0][0] == 5) {
                int var37 = var36.field2321[0][1];
                class166.field2169[var37] = 1 - class166.field2169[var37];
                method820(var37);
            }
        }
        if (arg2 == 39) {
            field295.method2783(211);
            field295.method2618(arg1);
            field295.method2606(arg0);
            field295.method2607(arg3);
            field400 = 0;
            Statics.field108 = class170.method3227(arg1);
            field507 = arg0;
        }
        if (arg2 == 2) {
            field396 = arg6;
            field397 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field295.method2783(131);
            field295.method2607(field443);
            field295.method2607(Statics.field164 + arg0);
            field295.method2746(class106.field1694[82] ? 1 : 0);
            field295.method2607(Statics.field209 + arg1);
            field295.method2560(arg3 >> 14 & 0x7FFF);
            field295.method2616(Statics.field233);
        }
        if (arg2 == 38) {
            method102();
            class170 var38 = class170.method3227(arg1);
            field527 = 1;
            Statics.field104 = arg0;
            Statics.field2942 = arg1;
            Statics.field2133 = arg3;
            method1788(var38);
            field376 = class38.method2763(16748608) + class199.method96(arg3).field2946 + class38.method2763(16777215);
            if (field376 == null) {
                field376 = "null";
            }
            return;
        }
        if (arg2 == 33) {
            field295.method2783(40);
            field295.method2560(arg0);
            field295.method2618(arg1);
            field295.method2607(arg3);
            field400 = 0;
            Statics.field108 = class170.method3227(arg1);
            field507 = arg0;
        }
        if (arg2 == 40) {
            field295.method2783(170);
            field295.method2606(arg3);
            field295.method2618(arg1);
            field295.method2606(arg0);
            field400 = 0;
            Statics.field108 = class170.method3227(arg1);
            field507 = arg0;
        }
        if (arg2 == 46) {
            class24 var39 = field409[arg3];
            if (var39 != null) {
                field396 = arg6;
                field397 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field295.method2783(165);
                field295.method2746(class106.field1694[82] ? 1 : 0);
                field295.method2560(arg3);
            }
        }
        if (arg2 == 51) {
            class24 var40 = field409[arg3];
            if (var40 != null) {
                field396 = arg6;
                field397 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field295.method2783(124);
                field295.method2598(class106.field1694[82] ? 1 : 0);
                field295.method2577(arg3);
            }
        }
        if (arg2 == 30 && field451 == null) {
            method557(arg1, arg0);
            field451 = class170.method562(arg1, arg0);
            method1788(field451);
        }
        if (arg2 == 48) {
            class24 var41 = field409[arg3];
            if (var41 != null) {
                field396 = arg6;
                field397 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field295.method2783(228);
                field295.method2598(class106.field1694[82] ? 1 : 0);
                field295.method2606(arg3);
            }
        }
        if (arg2 == 1002) {
            field396 = arg6;
            field397 = arg7;
            field399 = 2;
            field398 = 0;
            field295.method2783(180);
            field295.method2606(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 4) {
            field396 = arg6;
            field397 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field295.method2783(10);
            field295.method2560(Statics.field209 + arg1);
            field295.method2606(arg3 >> 14 & 0x7FFF);
            field295.method2607(Statics.field164 + arg0);
            field295.method2746(class106.field1694[82] ? 1 : 0);
        }
        if (arg2 == 44) {
            class24 var42 = field409[arg3];
            if (var42 != null) {
                field396 = arg6;
                field397 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field295.method2783(197);
                field295.method2599(class106.field1694[82] ? 1 : 0);
                field295.method2606(arg3);
            }
        }
        if (arg2 == 32) {
            field295.method2783(220);
            field295.method2618(arg1);
            field295.method2560(field443);
            field295.method2616(Statics.field233);
            field295.method2577(arg0);
            field295.method2607(arg3);
            field400 = 0;
            Statics.field108 = class170.method3227(arg1);
            field507 = arg0;
        }
        if (arg2 == 41) {
            field295.method2783(12);
            field295.method2607(arg0);
            field295.method2618(arg1);
            field295.method2607(arg3);
            field400 = 0;
            Statics.field108 = class170.method3227(arg1);
            field507 = arg0;
        }
        if (arg2 == 1005) {
            class170 var43 = class170.method3227(arg1);
            if (var43 == null || var43.field2340[arg0] < 100000) {
                field295.method2783(209);
                field295.method2606(arg3);
            } else {
                class48.method3375(27, "", var43.field2340[arg0] + " x " + class199.method96(arg3).field2946);
            }
            field400 = 0;
            Statics.field108 = class170.method3227(arg1);
            field507 = arg0;
        }
        if (arg2 == 3) {
            field396 = arg6;
            field397 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field295.method2783(151);
            field295.method2577(arg3 >> 14 & 0x7FFF);
            field295.method2606(Statics.field209 + arg1);
            field295.method2560(Statics.field164 + arg0);
            field295.method2749(class106.field1694[82] ? 1 : 0);
        }
        if (arg2 == 43) {
            field295.method2783(44);
            field295.method2618(arg1);
            field295.method2560(arg3);
            field295.method2606(arg0);
            field400 = 0;
            Statics.field108 = class170.method3227(arg1);
            field507 = arg0;
        }
        if (arg2 == 8) {
            class36 var44 = field322[arg3];
            if (var44 != null) {
                field396 = arg6;
                field397 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field295.method2783(6);
                field295.method2607(field443);
                field295.method2618(Statics.field233);
                field295.method2599(class106.field1694[82] ? 1 : 0);
                field295.method2560(arg3);
            }
        }
        if (arg2 == 13) {
            class36 var45 = field322[arg3];
            if (var45 != null) {
                field396 = arg6;
                field397 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field295.method2783(69);
                field295.method2598(class106.field1694[82] ? 1 : 0);
                field295.method2577(arg3);
            }
        }
        if (arg2 == 11) {
            class36 var46 = field322[arg3];
            if (var46 != null) {
                field396 = arg6;
                field397 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field295.method2783(82);
                field295.method2746(class106.field1694[82] ? 1 : 0);
                field295.method2560(arg3);
            }
        }
        if (arg2 == 58) {
            class170 var47 = class170.method562(arg1, arg0);
            if (var47 != null) {
                field295.method2783(226);
                field295.method2562(arg1);
                field295.method2606(var47.field2329);
                field295.method2606(field443);
                field295.method2577(arg0);
                field295.method2606(field339);
                field295.method2618(Statics.field233);
            }
        }
        if (arg2 == 19) {
            field396 = arg6;
            field397 = arg7;
            field399 = 2;
            field398 = 0;
            field521 = arg0;
            field522 = arg1;
            field295.method2783(74);
            field295.method2607(arg3);
            field295.method2599(class106.field1694[82] ? 1 : 0);
            field295.method2606(Statics.field209 + arg1);
            field295.method2606(Statics.field164 + arg0);
        }
        if (arg2 == 45) {
            class24 var48 = field409[arg3];
            if (var48 != null) {
                field396 = arg6;
                field397 = arg7;
                field399 = 2;
                field398 = 0;
                field521 = arg0;
                field522 = arg1;
                field295.method2783(42);
                field295.method2577(arg3);
                field295.method2749(class106.field1694[82] ? 1 : 0);
            }
        }
        if (field527 != 0) {
            field527 = 0;
            method1788(class170.method3227(Statics.field2942));
        }
        if (field524) {
            method102();
        }
        if (Statics.field108 != null && field400 == 0) {
            method1788(Statics.field108);
        }
    }

    @ObfuscatedName("d.bz(ILjava/lang/String;B)V")
    public static void method190(int arg0, String arg1) {
        int var2 = class46.field909;
        int[] var3 = class46.field904;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class24 var6 = field409[var3[var5]];
            if (var6 != null && Statics.field810 != var6 && var6.field241 != null && var6.field241.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field295.method2783(197);
                    field295.method2599(0);
                    field295.method2606(var3[var5]);
                } else if (arg0 == 4) {
                    field295.method2783(57);
                    field295.method2598(0);
                    field295.method2560(var3[var5]);
                } else if (arg0 == 6) {
                    field295.method2783(181);
                    field295.method2607(var3[var5]);
                    field295.method2599(0);
                } else if (arg0 == 7) {
                    field295.method2783(203);
                    field295.method2607(var3[var5]);
                    field295.method2599(0);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class48.method3375(4, "", class174.field2415 + arg1);
        }
    }

    @ObfuscatedName("v.bo(B)V")
    public static void method102() {
        if (!field524) {
            return;
        }
        class170 var0 = class170.method562(Statics.field233, field443);
        if (var0 != null && var0.field2297 != null) {
            class19 var1 = new class19();
            var1.field188 = var0;
            var1.field189 = var0.field2297;
            class33.method192(var1);
        }
        field524 = false;
        method1788(var0);
    }

    @ObfuscatedName("ak.bt(III)V")
    public static void method557(int arg0, int arg1) {
        field295.method2783(52);
        field295.method2562(arg0);
        field295.method2577(arg1);
    }

    @ObfuscatedName("gm.bv(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method3140(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field428 || field519 >= 500) {
            return;
        }
        field434[field519] = arg0;
        field435[field519] = arg1;
        field389[field519] = arg2;
        field367[field519] = arg3;
        field430[field519] = arg4;
        field431[field519] = arg5;
        field519++;
    }

    @ObfuscatedName("fy.bi(B)V")
    public static void method2815() {
        for (int var0 = 0; var0 < field519; var0++) {
            if (method555(field389[var0])) {
                if (var0 < field519 - 1) {
                    for (int var1 = var0; var1 < field519 - 1; var1++) {
                        field434[var1] = field434[var1 + 1];
                        field435[var1] = field435[var1 + 1];
                        field389[var1] = field389[var1 + 1];
                        field367[var1] = field367[var1 + 1];
                        field430[var1] = field430[var1 + 1];
                        field431[var1] = field431[var1 + 1];
                    }
                }
                field519--;
            }
        }
    }

    @ObfuscatedName("o.cn(IB)Z")
    public static boolean method555(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("fj.ca(II)Ljava/lang/String;")
    public static String method2986(int arg0) {
        return field435[arg0].length() > 0 ? field434[arg0] + class174.field2521 + field435[arg0] : field434[arg0];
    }

    @ObfuscatedName("fq.cz(Lgw;IIII)V")
    public static final void method2960(class200 arg0, int arg1, int arg2, int arg3) {
        if (field519 >= 400) {
            return;
        }
        if (arg0.field3029 != null) {
            arg0 = arg0.method3429();
        }
        if (arg0 == null || !arg0.field3010 || arg0.field3034 && field455 != arg1) {
            return;
        }
        String var4 = arg0.field3006;
        if (arg0.field3021 != 0) {
            var4 = var4 + method1117(arg0.field3021, Statics.field810.field244) + " " + class38.field785 + class174.field2491 + arg0.field3021 + class38.field784;
        }
        if (field527 == 1) {
            method3140(class174.field2511, field376 + " " + class38.field787 + " " + class38.method2763(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field524) {
            String[] var5 = arg0.field3019;
            if (field571) {
                var5 = method2423(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class174.field2582)) {
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
                        method3140(var5[var6], class38.method2763(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class174.field2582)) {
                        short var9 = 0;
                        if (field311 != class41.field816) {
                            if (field311 == class41.field815 || field311 == class41.field818 && arg0.field3021 > Statics.field810.field244) {
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
                            method3140(var5[var8], class38.method2763(16776960) + var4, var10, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method3140(class174.field2460, class38.method2763(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field2781 & 0x2) == 2) {
            method3140(field445, field328 + " " + class38.field787 + " " + class38.method2763(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bp.co(Lz;IIII)V")
    public static final void method1101(class24 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field810 == arg0 || field519 >= 400) {
            return;
        }
        String var4;
        if (arg0.field257 == 0) {
            var4 = arg0.field245[0] + arg0.field241 + arg0.field245[1] + method1117(arg0.field244, Statics.field810.field244) + " " + class38.field785 + class174.field2491 + arg0.field244 + class38.field784 + arg0.field245[2];
        } else {
            var4 = arg0.field245[0] + arg0.field241 + arg0.field245[1] + " " + class38.field785 + class174.field2399 + arg0.field257 + class38.field784 + arg0.field245[2];
        }
        if (field527 == 1) {
            method3140(class174.field2511, field376 + " " + class38.field787 + " " + class38.method2763(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field524) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field416[var5] != null) {
                    short var6 = 0;
                    if (field416[var5].equalsIgnoreCase(class174.field2582)) {
                        if (field310 == class41.field816) {
                            continue;
                        }
                        if (field310 == class41.field815 || field310 == class41.field818 && arg0.field244 > Statics.field810.field244) {
                            var6 = 2000;
                        }
                        if (Statics.field810.field260 != 0 && arg0.field260 != 0) {
                            if (Statics.field810.field260 == arg0.field260) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field417[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field488[var5] + var6;
                    method3140(field416[var5], class38.method2763(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2781 & 0x8) == 8) {
            method3140(field445, field328 + " " + class38.field787 + " " + class38.method2763(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field519; var9++) {
            if (field389[var9] == 23) {
                field435[var9] = class38.method2763(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("bn.ch(III)Ljava/lang/String;")
    public static final String method1117(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class38.method2763(16711680);
        } else if (var2 < -6) {
            return class38.method2763(16723968);
        } else if (var2 < -3) {
            return class38.method2763(16740352);
        } else if (var2 < 0) {
            return class38.method2763(16756736);
        } else if (var2 > 9) {
            return class38.method2763(65280);
        } else if (var2 > 6) {
            return class38.method2763(4259584);
        } else if (var2 > 3) {
            return class38.method2763(8453888);
        } else if (var2 > 0) {
            return class38.method2763(12648192);
        } else {
            return class38.method2763(16776960);
        }
    }

    @ObfuscatedName("bp.cd(IIIIIIIII)V")
    public static final void method1096(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class170.method3657(arg0)) {
            Statics.field2773 = null;
            method632(Statics.field2298[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2773 != null) {
                method632(Statics.field2773, -1412584499, arg1, arg2, arg3, arg4, Statics.field1816, Statics.field3048, arg7);
                Statics.field2773 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field525[var8] = true;
            }
        } else {
            field525[arg7] = true;
        }
    }

    @ObfuscatedName("ay.ci([Lfq;IIIIIIIII)V")
    public static final void method632(class170[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class220.method3676(arg2, arg3, arg4, arg5);
        class85.method1548();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class170 var10 = arg0[var9];
            if (var10 != null && (var10.field2327 == arg1 || arg1 == -1412584499 && field512 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field572[field282] = var10.field2224 + arg6;
                    field496[field282] = var10.field2223 + arg7;
                    field497[field282] = var10.field2264;
                    field498[field282] = var10.field2225;
                    var11 = ++field282 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2227 = var11;
                var10.field2341 = field294;
                if (!var10.field2199 || !method3749(var10)) {
                    if (var10.field2213 > 0) {
                        method166(var10);
                    }
                    int var12 = var10.field2224 + arg6;
                    int var13 = var10.field2223 + arg7;
                    int var14 = var10.field2241;
                    if (field512 == var10) {
                        if (arg1 != -1412584499 && !var10.field2287) {
                            Statics.field2773 = arg0;
                            Statics.field1816 = arg6;
                            Statics.field3048 = arg7;
                            continue;
                        }
                        if (field471 && field465) {
                            int var15 = class116.field1795;
                            int var16 = class116.field1798;
                            int var17 = var15 - field462;
                            int var18 = var16 - field463;
                            if (var17 < field495) {
                                var17 = field495;
                            }
                            if (var10.field2264 + var17 > field495 + field461.field2264) {
                                var17 = field495 + field461.field2264 - var10.field2264;
                            }
                            if (var18 < field330) {
                                var18 = field330;
                            }
                            if (var10.field2225 + var18 > field330 + field461.field2225) {
                                var18 = field330 + field461.field2225 - var10.field2225;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2287) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2211 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2211 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2264 + var12;
                        int var26 = var10.field2225 + var13;
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
                        int var29 = var10.field2264 + var12;
                        int var30 = var10.field2225 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2199 || var19 < var21 && var20 < var22) {
                        if (var10.field2213 != 0) {
                            if (var10.field2213 == 1336) {
                                if (field470) {
                                    var13 += 15;
                                    Statics.field822.method3575("Fps:" + field1765, var10.field2264 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field290) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field290) {
                                        var33 = 16711680;
                                    }
                                    Statics.field822.method3575("Mem:" + var32 + "k", var10.field2264 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2213 == 1337) {
                                field436 = var12;
                                field341 = var13;
                                method1790(var12, var13, var10.field2264, var10.field2225);
                                field525[var10.field2227] = true;
                                class220.method3676(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2213 == 1338) {
                                method2046();
                                class165 var34 = var10.method2918(false);
                                if (var34 != null) {
                                    class220.method3676(var12, var13, var34.field2160 + var12, var34.field2168 + var13);
                                    if (field523 == 2 || field523 == 5) {
                                        class220.method3695(var12, var13, 0, var34.field2162, var34.field2159);
                                    } else {
                                        int var35 = field373 + field308 & 0x7FF;
                                        int var36 = Statics.field810.field629 / 32 + 48;
                                        int var37 = 464 - Statics.field810.field600 / 32;
                                        Statics.field2132.method3799(var12, var13, var34.field2160, var34.field2168, var36, var37, var35, field345 + 256, var34.field2162, var34.field2159);
                                        for (int var38 = 0; var38 < field517; var38++) {
                                            int var39 = field358[var38] * 4 + 2 - Statics.field810.field629 / 32;
                                            int var40 = field511[var38] * 4 + 2 - Statics.field810.field600 / 32;
                                            method670(var12, var13, var39, var40, field520[var38], var34);
                                        }
                                        int var41 = 0;
                                        while (true) {
                                            if (var41 >= 104) {
                                                for (int var46 = 0; var46 < field323; var46++) {
                                                    class36 var47 = field322[field324[var46]];
                                                    if (var47 != null && var47.method215()) {
                                                        class200 var48 = var47.field765;
                                                        if (var48 != null && var48.field3029 != null) {
                                                            var48 = var48.method3429();
                                                        }
                                                        if (var48 != null && var48.field3020 && var48.field3010) {
                                                            int var49 = var47.field629 / 32 - Statics.field810.field629 / 32;
                                                            int var50 = var47.field600 / 32 - Statics.field810.field600 / 32;
                                                            method670(var12, var13, var49, var50, Statics.field131[1], var34);
                                                        }
                                                    }
                                                }
                                                int var51 = class46.field909;
                                                int[] var52 = class46.field904;
                                                for (int var53 = 0; var53 < var51; var53++) {
                                                    class24 var54 = field409[var52[var53]];
                                                    if (var54 != null && var54.method215() && !var54.field246 && Statics.field810 != var54) {
                                                        int var55 = var54.field629 / 32 - Statics.field810.field629 / 32;
                                                        int var56 = var54.field600 / 32 - Statics.field810.field600 / 32;
                                                        boolean var57 = false;
                                                        if (method2104(var54.field241, true)) {
                                                            var57 = true;
                                                        }
                                                        boolean var58 = false;
                                                        for (int var59 = 0; var59 < Statics.field137; var59++) {
                                                            if (var54.field241.equals(Statics.field77[var59].field278)) {
                                                                var58 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var60 = false;
                                                        if (Statics.field810.field260 != 0 && var54.field260 != 0 && Statics.field810.field260 == var54.field260) {
                                                            var60 = true;
                                                        }
                                                        if (var57) {
                                                            method670(var12, var13, var55, var56, Statics.field131[3], var34);
                                                        } else if (var60) {
                                                            method670(var12, var13, var55, var56, Statics.field131[4], var34);
                                                        } else if (var58) {
                                                            method670(var12, var13, var55, var56, Statics.field131[5], var34);
                                                        } else {
                                                            method670(var12, var13, var55, var56, Statics.field131[2], var34);
                                                        }
                                                    }
                                                }
                                                if (field490 != 0 && field294 % 20 < 10) {
                                                    if (field490 == 1 && field303 >= 0 && field303 < field322.length) {
                                                        class36 var61 = field322[field303];
                                                        if (var61 != null) {
                                                            int var62 = var61.field629 / 32 - Statics.field810.field629 / 32;
                                                            int var63 = var61.field600 / 32 - Statics.field810.field600 / 32;
                                                            method1366(var12, var13, var62, var63, Statics.field1993[1], var34);
                                                        }
                                                    }
                                                    if (field490 == 2) {
                                                        int var64 = field305 * 4 - Statics.field164 * 4 + 2 - Statics.field810.field629 / 32;
                                                        int var65 = field403 * 4 - Statics.field209 * 4 + 2 - Statics.field810.field600 / 32;
                                                        method1366(var12, var13, var64, var65, Statics.field1993[1], var34);
                                                    }
                                                    if (field490 == 10 && field304 >= 0 && field304 < field409.length) {
                                                        class24 var66 = field409[field304];
                                                        if (var66 != null) {
                                                            int var67 = var66.field629 / 32 - Statics.field810.field629 / 32;
                                                            int var68 = var66.field600 / 32 - Statics.field810.field600 / 32;
                                                            method1366(var12, var13, var67, var68, Statics.field1993[1], var34);
                                                        }
                                                    }
                                                }
                                                if (field521 != 0) {
                                                    int var69 = field521 * 4 + 2 - Statics.field810.field629 / 32;
                                                    int var70 = field522 * 4 + 2 - Statics.field810.field600 / 32;
                                                    method670(var12, var13, var69, var70, Statics.field1993[0], var34);
                                                }
                                                if (!Statics.field810.field246) {
                                                    class220.method3697(var34.field2160 / 2 + var12 - 1, var34.field2168 / 2 + var13 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var42 = 0; var42 < 104; var42++) {
                                                class129 var43 = field420[Statics.field2355][var41][var42];
                                                if (var43 != null) {
                                                    int var44 = var41 * 4 + 2 - Statics.field810.field629 / 32;
                                                    int var45 = var42 * 4 + 2 - Statics.field810.field600 / 32;
                                                    method670(var12, var13, var44, var45, Statics.field131[0], var34);
                                                }
                                            }
                                            var41++;
                                        }
                                    }
                                    field561[var11] = true;
                                }
                                class220.method3676(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2213 == 1339) {
                                class165 var71 = var10.method2918(false);
                                if (var71 != null) {
                                    if (field523 < 3) {
                                        Statics.field2679.method3799(var12, var13, var71.field2160, var71.field2168, 25, 25, field373, 256, var71.field2162, var71.field2159);
                                    } else {
                                        class220.method3695(var12, var13, 0, var71.field2162, var71.field2159);
                                    }
                                }
                                class220.method3676(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2211 == 0) {
                            if (!var10.field2199 && method3749(var10) && Statics.field1559 != var10) {
                                continue;
                            }
                            if (!var10.field2199) {
                                if (var10.field2231 > var10.field2233 - var10.field2225) {
                                    var10.field2231 = var10.field2233 - var10.field2225;
                                }
                                if (var10.field2231 < 0) {
                                    var10.field2231 = 0;
                                }
                            }
                            method632(arg0, var10.field2209, var19, var20, var21, var22, var12 - var10.field2268, var13 - var10.field2231, var11);
                            if (var10.field2333 != null) {
                                method632(var10.field2333, var10.field2209, var19, var20, var21, var22, var12 - var10.field2268, var13 - var10.field2231, var11);
                            }
                            class18 var72 = (class18) field448.method2161((long) var10.field2209);
                            if (var72 != null) {
                                method1096(var72.field178, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class220.method3676(arg2, arg3, arg4, arg5);
                            class85.method1548();
                        }
                        if (field501 || field560[var11] || field499 > 1) {
                            if (var10.field2211 == 0 && !var10.field2199 && var10.field2233 > var10.field2225) {
                                int var73 = var10.field2264 + var12;
                                int var74 = var10.field2231;
                                int var75 = var10.field2225;
                                int var76 = var10.field2233;
                                Statics.field82[0].method3753(var73, var13);
                                Statics.field82[1].method3753(var73, var13 + var75 - 16);
                                class220.method3697(var73, var13 + 16, 16, var75 - 32, field503);
                                int var77 = (var75 - 32) * var75 / var76;
                                if (var77 < 8) {
                                    var77 = 8;
                                }
                                int var78 = (var75 - 32 - var77) * var74 / (var76 - var75);
                                class220.method3697(var73, var13 + 16 + var78, 16, var77, field508);
                                class220.method3692(var73, var13 + 16 + var78, var77, field493);
                                class220.method3692(var73 + 1, var13 + 16 + var78, var77, field493);
                                class220.method3673(var73, var13 + 16 + var78, 16, field493);
                                class220.method3673(var73, var13 + 17 + var78, 16, field493);
                                class220.method3692(var73 + 15, var13 + 16 + var78, var77, field368);
                                class220.method3692(var73 + 14, var13 + 17 + var78, var77 - 1, field368);
                                class220.method3673(var73, var13 + 15 + var78 + var77, 16, field368);
                                class220.method3673(var73 + 1, var13 + 14 + var78 + var77, 15, field368);
                            }
                            if (var10.field2211 != 1) {
                                if (var10.field2211 == 2) {
                                    int var79 = 0;
                                    for (int var80 = 0; var80 < var10.field2221; var80++) {
                                        for (int var81 = 0; var81 < var10.field2220; var81++) {
                                            int var82 = (var10.field2275 + 32) * var81 + var12;
                                            int var83 = (var10.field2229 + 32) * var80 + var13;
                                            if (var79 < 20) {
                                                var82 += var10.field2262[var79];
                                                var83 += var10.field2278[var79];
                                            }
                                            if (var10.field2285[var79] > 0) {
                                                boolean var84 = false;
                                                boolean var85 = false;
                                                int var86 = var10.field2285[var79] - 1;
                                                if (var82 + 32 > arg2 && var82 < arg4 && var83 + 32 > arg3 && var83 < arg5 || Statics.field1551 == var10 && field402 == var79) {
                                                    class225 var87;
                                                    if (field527 == 1 && Statics.field104 == var79 && Statics.field2942 == var10.field2209) {
                                                        var87 = class199.method3010(var86, var10.field2340[var79], 2, 0, 2, false);
                                                    } else {
                                                        var87 = class199.method3010(var86, var10.field2340[var79], 1, 3153952, 2, false);
                                                    }
                                                    if (var87 == null) {
                                                        method1788(var10);
                                                    } else if (Statics.field1551 == var10 && field402 == var79) {
                                                        int var88 = class116.field1795 - field485;
                                                        int var89 = class116.field1798 - field404;
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
                                                        var87.method3801(var82 + var88, var83 + var89, 128);
                                                        if (arg1 != -1) {
                                                            class170 var90 = arg0[arg1 & 0xFFFF];
                                                            if (var83 + var89 < class220.field3172 && var90.field2231 > 0) {
                                                                int var91 = field365 * (class220.field3172 - var83 - var89) / 3;
                                                                if (var91 > field365 * 10) {
                                                                    var91 = field365 * 10;
                                                                }
                                                                if (var91 > var90.field2231) {
                                                                    var91 = var90.field2231;
                                                                }
                                                                var90.field2231 -= var91;
                                                                field404 += var91;
                                                                method1788(var90);
                                                            }
                                                            if (var83 + var89 + 32 > class220.field3178 && var90.field2231 < var90.field2233 - var90.field2225) {
                                                                int var92 = field365 * (var83 + var89 + 32 - class220.field3178) / 3;
                                                                if (var92 > field365 * 10) {
                                                                    var92 = field365 * 10;
                                                                }
                                                                if (var92 > var90.field2233 - var90.field2225 - var90.field2231) {
                                                                    var92 = var90.field2233 - var90.field2225 - var90.field2231;
                                                                }
                                                                var90.field2231 += var92;
                                                                field404 -= var92;
                                                                method1788(var90);
                                                            }
                                                        }
                                                    } else if (Statics.field108 == var10 && field507 == var79) {
                                                        var87.method3801(var82, var83, 128);
                                                    } else {
                                                        var87.method3795(var82, var83);
                                                    }
                                                }
                                            } else if (var10.field2279 != null && var79 < 20) {
                                                class225 var93 = var10.method2924(var79);
                                                if (var93 != null) {
                                                    var93.method3795(var82, var83);
                                                } else if (class170.field2207) {
                                                    method1788(var10);
                                                }
                                            }
                                            var79++;
                                        }
                                    }
                                } else if (var10.field2211 == 3) {
                                    int var94;
                                    if (method177(var10)) {
                                        var94 = var10.field2235;
                                        if (Statics.field1559 == var10 && var10.field2237 != 0) {
                                            var94 = var10.field2237;
                                        }
                                    } else {
                                        var94 = var10.field2234;
                                        if (Statics.field1559 == var10 && var10.field2236 != 0) {
                                            var94 = var10.field2236;
                                        }
                                    }
                                    if (var10.field2238) {
                                        switch(var10.field2205.field3188) {
                                            case 1:
                                                class220.method3709(var12, var13, var10.field2264, var10.field2225, var10.field2234, var10.field2235, 256 - (var10.field2241 & 0xFF), 256 - (var10.field2271 & 0xFF));
                                                break;
                                            case 2:
                                                class220.method3689(var12, var13, var10.field2264, var10.field2225, var10.field2234, var10.field2235, 256 - (var10.field2241 & 0xFF), 256 - (var10.field2271 & 0xFF));
                                                break;
                                            case 3:
                                                class220.method3685(var12, var13, var10.field2264, var10.field2225, var10.field2234, var10.field2235, 256 - (var10.field2241 & 0xFF), 256 - (var10.field2271 & 0xFF));
                                                break;
                                            case 4:
                                                class220.method3686(var12, var13, var10.field2264, var10.field2225, var10.field2234, var10.field2235, 256 - (var10.field2241 & 0xFF), 256 - (var10.field2271 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class220.method3697(var12, var13, var10.field2264, var10.field2225, var94);
                                                } else {
                                                    class220.method3681(var12, var13, var10.field2264, var10.field2225, var94, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class220.method3719(var12, var13, var10.field2264, var10.field2225, var94);
                                    } else {
                                        class220.method3733(var12, var13, var10.field2264, var10.field2225, var94, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2211 == 4) {
                                    class209 var95 = var10.method2926();
                                    if (var95 != null) {
                                        String var96 = var10.field2255;
                                        int var97;
                                        if (method177(var10)) {
                                            var97 = var10.field2235;
                                            if (Statics.field1559 == var10 && var10.field2237 != 0) {
                                                var97 = var10.field2237;
                                            }
                                            if (var10.field2270.length() > 0) {
                                                var96 = var10.field2270;
                                            }
                                        } else {
                                            var97 = var10.field2234;
                                            if (Statics.field1559 == var10 && var10.field2236 != 0) {
                                                var97 = var10.field2236;
                                            }
                                        }
                                        if (var10.field2199 && var10.field2329 != -1) {
                                            class199 var98 = class199.method96(var10.field2329);
                                            var96 = var98.field2946;
                                            if (var96 == null) {
                                                var96 = "null";
                                            }
                                            if ((var98.field2979 == 1 || var10.field2294 != 1) && var10.field2294 != -1) {
                                                var96 = class38.method2763(16748608) + var96 + class38.field789 + " " + 'x' + method2047(var10.field2294);
                                            }
                                        }
                                        if (field451 == var10) {
                                            class174 var10000 = (class174) null;
                                            var96 = class174.field2519;
                                            var97 = var10.field2234;
                                        }
                                        if (!var10.field2199) {
                                            var96 = method1610(var96, var10);
                                        }
                                        var95.method3567(var96, var12, var13, var10.field2264, var10.field2225, var97, var10.field2274 ? 0 : -1, var10.field2272, var10.field2203, var10.field2277);
                                    } else if (class170.field2207) {
                                        method1788(var10);
                                    }
                                } else if (var10.field2211 == 5) {
                                    if (var10.field2199) {
                                        class225 var100;
                                        if (var10.field2329 == -1) {
                                            var100 = var10.method2914(false);
                                        } else {
                                            var100 = class199.method3010(var10.field2329, var10.field2294, var10.field2248, var10.field2249, var10.field2267, false);
                                        }
                                        if (var100 != null) {
                                            int var101 = var100.field3211;
                                            int var102 = var100.field3209;
                                            if (var10.field2247) {
                                                class220.method3677(var12, var13, var10.field2264 + var12, var10.field2225 + var13);
                                                int var103 = (var10.field2264 + (var101 - 1)) / var101;
                                                int var104 = (var10.field2225 + (var102 - 1)) / var102;
                                                for (int var105 = 0; var105 < var103; var105++) {
                                                    for (int var106 = 0; var106 < var104; var106++) {
                                                        if (var10.field2246 != 0) {
                                                            var100.method3808(var101 / 2 + var101 * var105 + var12, var102 / 2 + var102 * var106 + var13, var10.field2246, 4096);
                                                        } else if (var14 == 0) {
                                                            var100.method3795(var101 * var105 + var12, var102 * var106 + var13);
                                                        } else {
                                                            var100.method3801(var101 * var105 + var12, var102 * var106 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class220.method3676(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var107 = var10.field2264 * 4096 / var101;
                                                if (var10.field2246 != 0) {
                                                    var100.method3808(var10.field2264 / 2 + var12, var10.field2225 / 2 + var13, var10.field2246, var107);
                                                } else if (var14 != 0) {
                                                    var100.method3847(var12, var13, var10.field2264, var10.field2225, 256 - (var14 & 0xFF));
                                                } else if (var10.field2264 == var101 && var10.field2225 == var102) {
                                                    var100.method3795(var12, var13);
                                                } else {
                                                    var100.method3806(var12, var13, var10.field2264, var10.field2225);
                                                }
                                            }
                                        } else if (class170.field2207) {
                                            method1788(var10);
                                        }
                                    } else {
                                        class225 var99 = var10.method2914(method177(var10));
                                        if (var99 != null) {
                                            var99.method3795(var12, var13);
                                        } else if (class170.field2207) {
                                            method1788(var10);
                                        }
                                    }
                                } else if (var10.field2211 == 6) {
                                    boolean var108 = method177(var10);
                                    int var109;
                                    if (var108) {
                                        var109 = var10.field2257;
                                    } else {
                                        var109 = var10.field2256;
                                    }
                                    class83 var110 = null;
                                    int var111 = 0;
                                    if (var10.field2329 != -1) {
                                        class199 var112 = class199.method96(var10.field2329);
                                        if (var112 != null) {
                                            class199 var113 = var112.method3384(var10.field2294);
                                            var110 = var113.method3383(1);
                                            if (var110 == null) {
                                                method1788(var10);
                                            } else {
                                                var110.method1468();
                                                var111 = var110.field1540 / 2;
                                            }
                                        }
                                    } else if (var10.field2306 == 5) {
                                        if (var10.field2253 == 0) {
                                            var110 = field285.method2870((class202) null, -1, (class202) null, -1);
                                        } else {
                                            var110 = Statics.field810.method227();
                                        }
                                    } else if (var109 == -1) {
                                        var110 = var10.method2917((class202) null, -1, var108, Statics.field810.field269);
                                        if (var110 == null && class170.field2207) {
                                            method1788(var10);
                                        }
                                    } else {
                                        class202 var114 = class202.method2010(var109);
                                        var110 = var10.method2917(var114, var10.field2331, var108, Statics.field810.field269);
                                        if (var110 == null && class170.field2207) {
                                            method1788(var10);
                                        }
                                    }
                                    class85.method1551(var10.field2264 / 2 + var12, var10.field2225 / 2 + var13);
                                    int var115 = var10.field2263 * class85.field1454[var10.field2258] >> 16;
                                    int var116 = var10.field2263 * class85.field1455[var10.field2258] >> 16;
                                    if (var110 != null) {
                                        if (var10.field2199) {
                                            var110.method1468();
                                            if (var10.field2266) {
                                                var110.method1482(0, var10.field2261, var10.field2210, var10.field2258, var10.field2284, var10.field2259 + var111 + var115, var10.field2259 + var116, var10.field2263);
                                            } else {
                                                var110.method1478(0, var10.field2261, var10.field2210, var10.field2258, var10.field2284, var10.field2259 + var111 + var115, var10.field2259 + var116);
                                            }
                                        } else {
                                            var110.method1478(0, var10.field2261, 0, var10.field2258, 0, var115, var116);
                                        }
                                    }
                                    class85.method1592();
                                } else {
                                    if (var10.field2211 == 7) {
                                        class209 var117 = var10.method2926();
                                        if (var117 == null) {
                                            if (class170.field2207) {
                                                method1788(var10);
                                            }
                                            continue;
                                        }
                                        int var118 = 0;
                                        for (int var119 = 0; var119 < var10.field2221; var119++) {
                                            for (int var120 = 0; var120 < var10.field2220; var120++) {
                                                if (var10.field2285[var118] > 0) {
                                                    class199 var121 = class199.method96(var10.field2285[var118] - 1);
                                                    String var122;
                                                    if (var121.field2979 != 1 && var10.field2340[var118] == 1) {
                                                        var122 = class38.method2763(16748608) + var121.field2946 + class38.field789;
                                                    } else {
                                                        var122 = class38.method2763(16748608) + var121.field2946 + class38.field789 + " " + 'x' + method2047(var10.field2340[var118]);
                                                    }
                                                    int var123 = (var10.field2275 + 115) * var120 + var12;
                                                    int var124 = (var10.field2229 + 12) * var119 + var13;
                                                    if (var10.field2272 == 0) {
                                                        var117.method3573(var122, var123, var124, var10.field2234, var10.field2274 ? 0 : -1);
                                                    } else if (var10.field2272 == 1) {
                                                        var117.method3576(var122, var10.field2264 / 2 + var123, var124, var10.field2234, var10.field2274 ? 0 : -1);
                                                    } else {
                                                        var117.method3575(var122, var10.field2264 + var123 - 1, var124, var10.field2234, var10.field2274 ? 0 : -1);
                                                    }
                                                }
                                                var118++;
                                            }
                                        }
                                    }
                                    if (var10.field2211 == 8 && Statics.field106 == var10 && field494 == field438) {
                                        int var125 = 0;
                                        int var126 = 0;
                                        class209 var127 = Statics.field822;
                                        String var128 = var10.field2255;
                                        String var129 = method1610(var128, var10);
                                        while (var129.length() > 0) {
                                            int var130 = var129.indexOf(class38.field788);
                                            String var131;
                                            if (var130 == -1) {
                                                var131 = var129;
                                                var129 = "";
                                            } else {
                                                var131 = var129.substring(0, var130);
                                                var129 = var129.substring(var130 + 4);
                                            }
                                            int var132 = var127.method3568(var131);
                                            if (var132 > var125) {
                                                var125 = var132;
                                            }
                                            var126 += var127.field3098 + 1;
                                        }
                                        var125 += 6;
                                        var126 += 7;
                                        int var133 = var10.field2264 + var12 - 5 - var125;
                                        int var134 = var10.field2225 + var13 + 5;
                                        if (var133 < var12 + 5) {
                                            var133 = var12 + 5;
                                        }
                                        if (var125 + var133 > arg4) {
                                            var133 = arg4 - var125;
                                        }
                                        if (var126 + var134 > arg5) {
                                            var134 = arg5 - var126;
                                        }
                                        class220.method3697(var133, var134, var125, var126, 16777120);
                                        class220.method3719(var133, var134, var125, var126, 0);
                                        String var135 = var10.field2255;
                                        int var136 = var127.field3098 + var134 + 2;
                                        String var137 = method1610(var135, var10);
                                        while (var137.length() > 0) {
                                            int var138 = var137.indexOf(class38.field788);
                                            String var139;
                                            if (var138 == -1) {
                                                var139 = var137;
                                                var137 = "";
                                            } else {
                                                var139 = var137.substring(0, var138);
                                                var137 = var137.substring(var138 + 4);
                                            }
                                            var127.method3573(var139, var133 + 3, var136, 0, -1);
                                            var136 += var127.field3098 + 1;
                                        }
                                    }
                                    if (var10.field2211 == 9) {
                                        if (var10.field2240 == 1) {
                                            int var140;
                                            int var141;
                                            int var142;
                                            int var143;
                                            if (var10.field2243) {
                                                var140 = var12;
                                                var141 = var10.field2225 + var13;
                                                var142 = var10.field2264 + var12;
                                                var143 = var13;
                                            } else {
                                                var140 = var12;
                                                var141 = var13;
                                                var142 = var10.field2264 + var12;
                                                var143 = var10.field2225 + var13;
                                            }
                                            class220.method3694(var140, var141, var142, var143, var10.field2234);
                                        } else {
                                            int var144 = var10.field2264 >= 0 ? var10.field2264 : -var10.field2264;
                                            int var145 = var10.field2225 >= 0 ? var10.field2225 : -var10.field2225;
                                            int var146 = var144;
                                            if (var144 < var145) {
                                                var146 = var145;
                                            }
                                            if (var146 != 0) {
                                                int var147 = (var10.field2264 << 16) / var146;
                                                int var148 = (var10.field2225 << 16) / var146;
                                                if (var148 <= var147) {
                                                    var147 = -var147;
                                                } else {
                                                    var148 = -var148;
                                                }
                                                int var149 = var10.field2240 * var148 >> 17;
                                                int var150 = var10.field2240 * var148 + 1 >> 17;
                                                int var151 = var10.field2240 * var147 >> 17;
                                                int var152 = var10.field2240 * var147 + 1 >> 17;
                                                int var153 = var12 + var149;
                                                int var154 = var12 - var150;
                                                int var155 = var10.field2264 + var12 - var150;
                                                int var156 = var10.field2264 + var12 + var149;
                                                int var157 = var13 + var151;
                                                int var158 = var13 - var152;
                                                int var159 = var10.field2225 + var13 - var152;
                                                int var160 = var10.field2225 + var13 + var151;
                                                class85.method1556(var153, var154, var155);
                                                class85.method1580(var157, var158, var159, var153, var154, var155, var10.field2234);
                                                class85.method1556(var153, var155, var156);
                                                class85.method1580(var157, var159, var160, var153, var155, var156, var10.field2234);
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

    @ObfuscatedName("cy.ck(Ljava/lang/String;Lfq;I)Ljava/lang/String;")
    public static String method1610(String arg0, class170 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method188(method1370(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field61 != null) {
                    int var6 = Statics.field61.field1649;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field61.field1653 != null) {
                        var5 = (String) Statics.field61.field1653;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("dw.cy(II)Ljava/lang/String;")
    public static final String method2047(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class38.field783 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class38.method2763(65408) + var1.substring(0, var1.length() - 8) + class174.field2590 + " " + class38.field785 + var1 + class38.field784 + class38.field789;
        } else if (var1.length() > 6) {
            return " " + class38.method2763(16777215) + var1.substring(0, var1.length() - 4) + class174.field2524 + " " + class38.field785 + var1 + class38.field784 + class38.field789;
        } else {
            return " " + class38.method2763(16776960) + var1 + class38.field789;
        }
    }

    @ObfuscatedName("ad.cr(ZI)V")
    public static final void method699(boolean arg0) {
        int var1 = field543;
        int var2 = Statics.field1224;
        int var3 = Statics.field1756;
        if (class170.method3657(var1)) {
            method651(Statics.field2298[var1], -1, var2, var3, arg0);
        }
    }

    @ObfuscatedName("cy.cw(Lfq;B)V")
    public static void method1609(class170 arg0) {
        class170 var1 = arg0.field2327 == -1 ? null : class170.method3227(arg0.field2327);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field1224;
            var3 = Statics.field1756;
        } else {
            var2 = var1.field2264;
            var3 = var1.field2225;
        }
        method13(arg0, var2, var3, false);
        method168(arg0, var2, var3);
    }

    @ObfuscatedName("f.ct([Lfq;Lfq;ZI)V")
    public static void method19(class170[] arg0, class170 arg1, boolean arg2) {
        int var3 = arg1.field2232 == 0 ? arg1.field2264 : arg1.field2232;
        int var4 = arg1.field2233 == 0 ? arg1.field2225 : arg1.field2233;
        method651(arg0, arg1.field2209, var3, var4, arg2);
        if (arg1.field2333 != null) {
            method651(arg1.field2333, arg1.field2209, var3, var4, arg2);
        }
        class18 var5 = (class18) field448.method2161((long) arg1.field2209);
        if (var5 != null) {
            int var6 = var5.field178;
            if (class170.method3657(var6)) {
                method651(Statics.field2298[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2213 == 1337) {
        }
    }

    @ObfuscatedName("aj.cq([Lfq;IIIZB)V")
    public static void method651(class170[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class170 var6 = arg0[var5];
            if (var6 != null && var6.field2327 == arg1) {
                method13(var6, arg2, arg3, arg4);
                method168(var6, arg2, arg3);
                if (var6.field2268 > var6.field2232 - var6.field2264) {
                    var6.field2268 = var6.field2232 - var6.field2264;
                }
                if (var6.field2268 < 0) {
                    var6.field2268 = 0;
                }
                if (var6.field2231 > var6.field2233 - var6.field2225) {
                    var6.field2231 = var6.field2233 - var6.field2225;
                }
                if (var6.field2231 < 0) {
                    var6.field2231 = 0;
                }
                if (var6.field2211 == 0) {
                    method19(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("e.cb(Lfq;IIZI)V")
    public static void method13(class170 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2264;
        int var5 = arg0.field2225;
        if (arg0.field2216 == 0) {
            arg0.field2264 = arg0.field2220;
        } else if (arg0.field2216 == 1) {
            arg0.field2264 = arg1 - arg0.field2220;
        } else if (arg0.field2216 == 2) {
            arg0.field2264 = arg0.field2220 * arg1 >> 14;
        }
        if (arg0.field2265 == 0) {
            arg0.field2225 = arg0.field2221;
        } else if (arg0.field2265 == 1) {
            arg0.field2225 = arg2 - arg0.field2221;
        } else if (arg0.field2265 == 2) {
            arg0.field2225 = arg0.field2221 * arg2 >> 14;
        }
        if (arg0.field2216 == 4) {
            arg0.field2264 = arg0.field2226 * arg0.field2225 / arg0.field2330;
        }
        if (arg0.field2265 == 4) {
            arg0.field2225 = arg0.field2330 * arg0.field2264 / arg0.field2226;
        }
        if (field457 && arg0.field2211 == 0) {
            if (arg0.field2225 < 5 && arg0.field2264 < 5) {
                arg0.field2225 = 5;
                arg0.field2264 = 5;
            } else {
                if (arg0.field2225 <= 0) {
                    arg0.field2225 = 5;
                }
                if (arg0.field2264 <= 0) {
                    arg0.field2264 = 5;
                }
            }
        }
        if (arg0.field2213 == 1337) {
            field422 = arg0;
        }
        if (arg3 && arg0.field2318 != null && (arg0.field2264 != var4 || arg0.field2225 != var5)) {
            class19 var6 = new class19();
            var6.field188 = arg0;
            var6.field189 = arg0.field2318;
            field476.method2226(var6);
        }
    }

    @ObfuscatedName("m.cx(Lfq;IIS)V")
    public static void method168(class170 arg0, int arg1, int arg2) {
        if (arg0.field2214 == 0) {
            arg0.field2224 = arg0.field2289;
        } else if (arg0.field2214 == 1) {
            arg0.field2224 = (arg1 - arg0.field2264) / 2 + arg0.field2289;
        } else if (arg0.field2214 == 2) {
            arg0.field2224 = arg1 - arg0.field2264 - arg0.field2289;
        } else if (arg0.field2214 == 3) {
            arg0.field2224 = arg0.field2289 * arg1 >> 14;
        } else if (arg0.field2214 == 4) {
            arg0.field2224 = (arg0.field2289 * arg1 >> 14) + (arg1 - arg0.field2264) / 2;
        } else {
            arg0.field2224 = arg1 - arg0.field2264 - (arg0.field2289 * arg1 >> 14);
        }
        if (arg0.field2215 == 0) {
            arg0.field2223 = arg0.field2219;
        } else if (arg0.field2215 == 1) {
            arg0.field2223 = (arg2 - arg0.field2225) / 2 + arg0.field2219;
        } else if (arg0.field2215 == 2) {
            arg0.field2223 = arg2 - arg0.field2225 - arg0.field2219;
        } else if (arg0.field2215 == 3) {
            arg0.field2223 = arg0.field2219 * arg2 >> 14;
        } else if (arg0.field2215 == 4) {
            arg0.field2223 = (arg0.field2219 * arg2 >> 14) + (arg2 - arg0.field2225) / 2;
        } else {
            arg0.field2223 = arg2 - arg0.field2225 - (arg0.field2219 * arg2 >> 14);
        }
        if (!field457 || arg0.field2211 != 0) {
            return;
        }
        if (arg0.field2224 < 0) {
            arg0.field2224 = 0;
        } else if (arg0.field2264 + arg0.field2224 > arg1) {
            arg0.field2224 = arg1 - arg0.field2264;
        }
        if (arg0.field2223 < 0) {
            arg0.field2223 = 0;
        } else if (arg0.field2225 + arg0.field2223 > arg2) {
            arg0.field2223 = arg2 - arg0.field2225;
        }
    }

    @ObfuscatedName("d.cs(II)Ljava/lang/String;")
    public static final String method188(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("u.cf(Lfq;B)Z")
    public static final boolean method177(class170 arg0) {
        if (arg0.field2322 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2322.length; var1++) {
            int var2 = method1370(arg0, var1);
            int var3 = arg0.field2323[var1];
            if (arg0.field2322[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2322[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2322[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("bt.cv(Lfq;IB)I")
    public static final int method1370(class170 arg0, int arg1) {
        if (arg0.field2321 == null || arg1 >= arg0.field2321.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2321[arg1];
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
                    var7 = field424[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field425[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field426[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class170 var11 = class170.method3227(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class199.method96(var12).field2968 || field289)) {
                        for (int var13 = 0; var13 < var11.field2285.length; var13++) {
                            if (var12 + 1 == var11.field2285[var13]) {
                                var7 += var11.field2340[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class166.field2169[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class173.field2358[field425[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class166.field2169[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field810.field244;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class173.field2357[var14]) {
                            var7 += field425[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class170 var17 = class170.method3227(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class199.method96(var18).field2968 || field289)) {
                        for (int var19 = 0; var19 < var17.field2285.length; var19++) {
                            if (var18 + 1 == var17.field2285[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field429;
                }
                if (var6 == 12) {
                    var7 = field360;
                }
                if (var6 == 13) {
                    int var20 = class166.field2169[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class166.method1794(var22);
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
                    var7 = (Statics.field810.field629 >> 7) + Statics.field164;
                }
                if (var6 == 19) {
                    var7 = (Statics.field810.field600 >> 7) + Statics.field209;
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

    @ObfuscatedName("bm.cc(Lfq;IIB)V")
    public static final void method1084(class170 arg0, int arg1, int arg2) {
        if (arg0.field2212 == 1) {
            method3140(arg0.field2326, "", 24, 0, 0, arg0.field2209);
        }
        if (arg0.field2212 == 2 && !field524) {
            String var3 = method2476(arg0);
            if (var3 != null) {
                method3140(var3, class38.method2763(65280) + arg0.field2273, 25, 0, -1, arg0.field2209);
            }
        }
        if (arg0.field2212 == 3) {
            method3140(class174.field2520, "", 26, 0, 0, arg0.field2209);
        }
        if (arg0.field2212 == 4) {
            method3140(arg0.field2326, "", 28, 0, 0, arg0.field2209);
        }
        if (arg0.field2212 == 5) {
            method3140(arg0.field2326, "", 29, 0, 0, arg0.field2209);
        }
        if (arg0.field2212 == 6 && field451 == null) {
            method3140(arg0.field2326, "", 30, 0, -1, arg0.field2209);
        }
        if (arg0.field2211 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2225; var5++) {
                for (int var6 = 0; var6 < arg0.field2264; var6++) {
                    int var7 = (arg0.field2275 + 32) * var6;
                    int var8 = (arg0.field2229 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2262[var4];
                        var8 += arg0.field2278[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field405 = var4;
                        Statics.field2120 = arg0;
                        if (arg0.field2285[var4] > 0) {
                            label282: {
                                class199 var9 = class199.method96(arg0.field2285[var4] - 1);
                                if (field527 == 1) {
                                    int var10 = method2479(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field2942 != arg0.field2209 || Statics.field104 != var4) {
                                            method3140(class174.field2511, field376 + " " + class38.field787 + " " + class38.method2763(16748608) + var9.field2946, 31, var9.field2989, var4, arg0.field2209);
                                        }
                                        break label282;
                                    }
                                }
                                if (field524) {
                                    int var12 = method2479(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field2781 & 0x10) == 16) {
                                            method3140(field445, field328 + " " + class38.field787 + " " + class38.method2763(16748608) + var9.field2946, 32, var9.field2989, var4, arg0.field2209);
                                        }
                                        break label282;
                                    }
                                }
                                String[] var14 = var9.field2970;
                                if (field571) {
                                    var14 = method2423(var14);
                                }
                                int var15 = method2479(arg0);
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
                                            method3140(var14[var17], class38.method2763(16748608) + var9.field2946, var18, var9.field2989, var4, arg0.field2209);
                                        } else if (var17 == 4) {
                                            method3140(class174.field2565, class38.method2763(16748608) + var9.field2946, 37, var9.field2989, var4, arg0.field2209);
                                        }
                                    }
                                }
                                class171 var10000 = (class171) null;
                                if (class171.method2819(method2479(arg0))) {
                                    method3140(class174.field2511, class38.method2763(16748608) + var9.field2946, 38, var9.field2989, var4, arg0.field2209);
                                }
                                int var19 = method2479(arg0);
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
                                            method3140(var14[var21], class38.method2763(16748608) + var9.field2946, var22, var9.field2989, var4, arg0.field2209);
                                        }
                                    }
                                }
                                String[] var23 = arg0.field2280;
                                if (field571) {
                                    var23 = method2423(var23);
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
                                            method3140(var23[var24], class38.method2763(16748608) + var9.field2946, var25, var9.field2989, var4, arg0.field2209);
                                        }
                                    }
                                }
                                method3140(class174.field2460, class38.method2763(16748608) + var9.field2946, 1005, var9.field2989, var4, arg0.field2209);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2199) {
            return;
        }
        if (!field524) {
            for (int var26 = 9; var26 >= 5; var26--) {
                String var27 = method750(arg0, var26);
                if (var27 != null) {
                    method3140(var27, arg0.field2313, 1007, var26 + 1, arg0.field2334, arg0.field2209);
                }
            }
            String var28 = method2476(arg0);
            if (var28 != null) {
                method3140(var28, arg0.field2313, 25, 0, arg0.field2334, arg0.field2209);
            }
            for (int var29 = 4; var29 >= 0; var29--) {
                String var30 = method750(arg0, var29);
                if (var30 != null) {
                    method3140(var30, arg0.field2313, 57, var29 + 1, arg0.field2334, arg0.field2209);
                }
            }
            int var31 = method2479(arg0);
            boolean var32 = (var31 & 0x1) != 0;
            if (var32) {
                method3140(class174.field2369, "", 30, 0, arg0.field2334, arg0.field2209);
            }
        } else if (class171.method777(method2479(arg0)) && (Statics.field2781 & 0x20) == 32) {
            method3140(field445, field328 + " " + class38.field787 + " " + arg0.field2313, 58, 0, arg0.field2334, arg0.field2209);
        }
    }

    @ObfuscatedName("a.cg([Lfq;IIIIIIII)V")
    public static final void method87(class170[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class170 var9 = arg0[var8];
            if (var9 != null && (!var9.field2199 || var9.field2211 == 0 || var9.field2281 || method2479(var9) != 0 || field461 == var9 || var9.field2213 == 1338) && var9.field2327 == arg1 && (!var9.field2199 || !method3749(var9))) {
                int var10 = var9.field2224 + arg6;
                int var11 = var9.field2223 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2211 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2211 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2264 + var10;
                    int var19 = var9.field2225 + var11;
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
                    int var22 = var9.field2264 + var10;
                    int var23 = var9.field2225 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field512 == var9) {
                    field468 = true;
                    field469 = var10;
                    field326 = var11;
                }
                if (!var9.field2199 || var12 < var14 && var13 < var15) {
                    int var24 = class116.field1795;
                    int var25 = class116.field1798;
                    if (class116.field1803 != 0) {
                        var24 = class116.field1804;
                        var25 = class116.field1805;
                    }
                    if (var9.field2213 == 1337) {
                        if (!field293 && !field428 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field527 == 0 && !field524) {
                                method3140(class174.field2620, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class83.field1396; var28++) {
                                int var29 = class83.field1415[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field348.method1643(Statics.field2355, var30, var31, var29) >= 0) {
                                        class198 var34 = class198.method1371(var33);
                                        if (var34.field2934 != null) {
                                            var34 = var34.method3342();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field527 == 1) {
                                            method3140(class174.field2511, field376 + " " + class38.field787 + " " + class38.method2763(65535) + var34.field2917, 1, var29, var30, var31);
                                        } else if (!field524) {
                                            String[] var35 = var34.field2920;
                                            if (field571) {
                                                var35 = method2423(var35);
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
                                                        method3140(var35[var36], class38.method2763(65535) + var34.field2917, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method3140(class174.field2460, class38.method2763(65535) + var34.field2917, 1002, var34.field2924 << 14, var30, var31);
                                        } else if ((Statics.field2781 & 0x4) == 4) {
                                            method3140(field445, field328 + " " + class38.field787 + " " + class38.method2763(65535) + var34.field2917, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class36 var38 = field322[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field765.field3013 == 1 && (var38.field629 & 0x7F) == 64 && (var38.field600 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field323; var39++) {
                                                class36 var40 = field322[field324[var39]];
                                                if (var40 != null && var38 != var40 && var40.field765.field3013 == 1 && var38.field629 == var40.field629 && var38.field600 == var40.field600) {
                                                    method2960(var40.field765, field324[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class46.field909;
                                            int[] var42 = class46.field904;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class24 var44 = field409[var42[var43]];
                                                if (var44 != null && var38.field629 == var44.field629 && var38.field600 == var44.field600) {
                                                    method1101(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method2960(var38.field765, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class24 var45 = field409[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field629 & 0x7F) == 64 && (var45.field600 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field323; var46++) {
                                                class36 var47 = field322[field324[var46]];
                                                if (var47 != null && var47.field765.field3013 == 1 && var45.field629 == var47.field629 && var45.field600 == var47.field600) {
                                                    method2960(var47.field765, field324[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class46.field909;
                                            int[] var49 = class46.field904;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class24 var51 = field409[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field629 == var51.field629 && var45.field600 == var51.field600) {
                                                    method1101(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field419 == var33) {
                                            var26 = var29;
                                        } else {
                                            method1101(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class129 var52 = field420[Statics.field2355][var30][var31];
                                        if (var52 != null) {
                                            for (class44 var53 = (class44) var52.method2210(); var53 != null; var53 = (class44) var52.method2212()) {
                                                class199 var54 = class199.method96(var53.field894);
                                                if (field527 == 1) {
                                                    method3140(class174.field2511, field376 + " " + class38.field787 + " " + class38.method2763(16748608) + var54.field2946, 16, var53.field894, var30, var31);
                                                } else if (!field524) {
                                                    String[] var55 = var54.field2975;
                                                    if (field571) {
                                                        var55 = method2423(var55);
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
                                                            method3140(var55[var56], class38.method2763(16748608) + var54.field2946, var57, var53.field894, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method3140(class174.field2364, class38.method2763(16748608) + var54.field2946, 20, var53.field894, var30, var31);
                                                        }
                                                    }
                                                    method3140(class174.field2460, class38.method2763(16748608) + var54.field2946, 1004, var53.field894, var30, var31);
                                                } else if ((Statics.field2781 & 0x1) == 1) {
                                                    method3140(field445, field328 + " " + class38.field787 + " " + class38.method2763(16748608) + var54.field2946, 17, var53.field894, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class24 var60 = field409[field419];
                                method1101(var60, field419, var58, var59);
                            }
                        }
                    } else if (var9.field2213 == 1338) {
                        method764(var9, var10, var11);
                    } else {
                        if (!field428 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method1084(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2211 == 0) {
                            if (!var9.field2199 && method3749(var9) && Statics.field1559 != var9) {
                                continue;
                            }
                            method87(arg0, var9.field2209, var12, var13, var14, var15, var10 - var9.field2268, var11 - var9.field2231);
                            if (var9.field2333 != null) {
                                method87(var9.field2333, var9.field2209, var12, var13, var14, var15, var10 - var9.field2268, var11 - var9.field2231);
                            }
                            class18 var61 = (class18) field448.method2161((long) var9.field2209);
                            if (var61 != null) {
                                if (var61.field181 == 0 && class116.field1795 >= var12 && class116.field1798 >= var13 && class116.field1795 < var14 && class116.field1798 < var15 && !field428 && !field457) {
                                    for (class19 var62 = (class19) field476.method2209(); var62 != null; var62 = (class19) field476.method2211()) {
                                        if (var62.field192) {
                                            var62.method2200();
                                            var62.field188.field2301 = false;
                                        }
                                    }
                                    if (Statics.field1192 == 0) {
                                        field512 = null;
                                        field461 = null;
                                    }
                                    if (!field428) {
                                        field434[0] = class174.field2600;
                                        field435[0] = "";
                                        field389[0] = 1006;
                                        field519 = 1;
                                    }
                                }
                                int var63 = var61.field178;
                                if (class170.method3657(var63)) {
                                    method87(Statics.field2298[var63], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2199) {
                            if (var9.field2342) {
                                if (class116.field1795 >= var12 && class116.field1798 >= var13 && class116.field1795 < var14 && class116.field1798 < var15) {
                                    for (class19 var64 = (class19) field476.method2209(); var64 != null; var64 = (class19) field476.method2211()) {
                                        if (var64.field192) {
                                            var64.method2200();
                                            var64.field188.field2301 = false;
                                        }
                                    }
                                    if (Statics.field1192 == 0) {
                                        field512 = null;
                                        field461 = null;
                                    }
                                    if (!field428) {
                                        field434[0] = class174.field2600;
                                        field435[0] = "";
                                        field389[0] = 1006;
                                        field519 = 1;
                                    }
                                }
                            } else if (var9.field2343 && class116.field1795 >= var12 && class116.field1798 >= var13 && class116.field1795 < var14 && class116.field1798 < var15) {
                                for (class19 var65 = (class19) field476.method2209(); var65 != null; var65 = (class19) field476.method2211()) {
                                    if (var65.field192 && var65.field188.field2310 == var65.field189) {
                                        var65.method2200();
                                    }
                                }
                            }
                            boolean var66;
                            if (class116.field1795 >= var12 && class116.field1798 >= var13 && class116.field1795 < var14 && class116.field1798 < var15) {
                                var66 = true;
                            } else {
                                var66 = false;
                            }
                            boolean var67 = false;
                            if ((class116.field1796 == 1 || !Statics.field1663 && class116.field1796 == 4) && var66) {
                                var67 = true;
                            }
                            boolean var68 = false;
                            if ((class116.field1803 == 1 || !Statics.field1663 && class116.field1803 == 4) && class116.field1804 >= var12 && class116.field1805 >= var13 && class116.field1804 < var14 && class116.field1805 < var15) {
                                var68 = true;
                            }
                            if (var68) {
                                method1792(var9, class116.field1804 - var10, class116.field1805 - var11);
                            }
                            if (field512 != null && field512 != var9 && var66 && class171.method2766(method2479(var9))) {
                                field464 = var9;
                            }
                            if (field461 == var9) {
                                field465 = true;
                                field495 = var10;
                                field330 = var11;
                            }
                            if (var9.field2281) {
                                if (var66 && field395 != 0 && var9.field2310 != null) {
                                    class19 var69 = new class19();
                                    var69.field192 = true;
                                    var69.field188 = var9;
                                    var69.field190 = field395;
                                    var69.field189 = var9.field2310;
                                    field476.method2226(var69);
                                }
                                if (field512 != null || Statics.field1551 != null || field428) {
                                    var68 = false;
                                    var67 = false;
                                    var66 = false;
                                }
                                if (!var9.field2328 && var68) {
                                    var9.field2328 = true;
                                    if (var9.field2291 != null) {
                                        class19 var70 = new class19();
                                        var70.field192 = true;
                                        var70.field188 = var9;
                                        var70.field193 = class116.field1804 - var10;
                                        var70.field190 = class116.field1805 - var11;
                                        var70.field189 = var9.field2291;
                                        field476.method2226(var70);
                                    }
                                }
                                if (var9.field2328 && var67 && var9.field2292 != null) {
                                    class19 var71 = new class19();
                                    var71.field192 = true;
                                    var71.field188 = var9;
                                    var71.field193 = class116.field1795 - var10;
                                    var71.field190 = class116.field1798 - var11;
                                    var71.field189 = var9.field2292;
                                    field476.method2226(var71);
                                }
                                if (var9.field2328 && !var67) {
                                    var9.field2328 = false;
                                    if (var9.field2208 != null) {
                                        class19 var72 = new class19();
                                        var72.field192 = true;
                                        var72.field188 = var9;
                                        var72.field193 = class116.field1795 - var10;
                                        var72.field190 = class116.field1798 - var11;
                                        var72.field189 = var9.field2208;
                                        field553.method2226(var72);
                                    }
                                }
                                if (var67 && var9.field2228 != null) {
                                    class19 var73 = new class19();
                                    var73.field192 = true;
                                    var73.field188 = var9;
                                    var73.field193 = class116.field1795 - var10;
                                    var73.field190 = class116.field1798 - var11;
                                    var73.field189 = var9.field2228;
                                    field476.method2226(var73);
                                }
                                if (!var9.field2301 && var66) {
                                    var9.field2301 = true;
                                    if (var9.field2295 != null) {
                                        class19 var74 = new class19();
                                        var74.field192 = true;
                                        var74.field188 = var9;
                                        var74.field193 = class116.field1795 - var10;
                                        var74.field190 = class116.field1798 - var11;
                                        var74.field189 = var9.field2295;
                                        field476.method2226(var74);
                                    }
                                }
                                if (var9.field2301 && var66 && var9.field2260 != null) {
                                    class19 var75 = new class19();
                                    var75.field192 = true;
                                    var75.field188 = var9;
                                    var75.field193 = class116.field1795 - var10;
                                    var75.field190 = class116.field1798 - var11;
                                    var75.field189 = var9.field2260;
                                    field476.method2226(var75);
                                }
                                if (var9.field2301 && !var66) {
                                    var9.field2301 = false;
                                    if (var9.field2296 != null) {
                                        class19 var76 = new class19();
                                        var76.field192 = true;
                                        var76.field188 = var9;
                                        var76.field193 = class116.field1795 - var10;
                                        var76.field190 = class116.field1798 - var11;
                                        var76.field189 = var9.field2296;
                                        field553.method2226(var76);
                                    }
                                }
                                if (var9.field2308 != null) {
                                    class19 var77 = new class19();
                                    var77.field188 = var9;
                                    var77.field189 = var9.field2308;
                                    field487.method2226(var77);
                                }
                                if (var9.field2302 != null && field433 > var9.field2337) {
                                    if (var9.field2303 == null || field433 - var9.field2337 > 32) {
                                        class19 var82 = new class19();
                                        var82.field188 = var9;
                                        var82.field189 = var9.field2302;
                                        field476.method2226(var82);
                                    } else {
                                        label827: for (int var78 = var9.field2337; var78 < field433; var78++) {
                                            int var79 = field473[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var9.field2303.length; var80++) {
                                                if (var9.field2303[var80] == var79) {
                                                    class19 var81 = new class19();
                                                    var81.field188 = var9;
                                                    var81.field189 = var9.field2302;
                                                    field476.method2226(var81);
                                                    break label827;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2337 = field433;
                                }
                                if (var9.field2304 != null && field366 > var9.field2300) {
                                    if (var9.field2305 == null || field366 - var9.field2300 > 32) {
                                        class19 var87 = new class19();
                                        var87.field188 = var9;
                                        var87.field189 = var9.field2304;
                                        field476.method2226(var87);
                                    } else {
                                        label803: for (int var83 = var9.field2300; var83 < field366; var83++) {
                                            int var84 = field475[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var9.field2305.length; var85++) {
                                                if (var9.field2305[var85] == var84) {
                                                    class19 var86 = new class19();
                                                    var86.field188 = var9;
                                                    var86.field189 = var9.field2304;
                                                    field476.method2226(var86);
                                                    break label803;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2300 = field366;
                                }
                                if (var9.field2217 != null && field380 > var9.field2339) {
                                    if (var9.field2242 == null || field380 - var9.field2339 > 32) {
                                        class19 var92 = new class19();
                                        var92.field188 = var9;
                                        var92.field189 = var9.field2217;
                                        field476.method2226(var92);
                                    } else {
                                        label779: for (int var88 = var9.field2339; var88 < field380; var88++) {
                                            int var89 = field286[var88 & 0x1F];
                                            for (int var90 = 0; var90 < var9.field2242.length; var90++) {
                                                if (var9.field2242[var90] == var89) {
                                                    class19 var91 = new class19();
                                                    var91.field188 = var9;
                                                    var91.field189 = var9.field2217;
                                                    field476.method2226(var91);
                                                    break label779;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2339 = field380;
                                }
                                if (field362 > var9.field2336 && var9.field2311 != null) {
                                    class19 var93 = new class19();
                                    var93.field188 = var9;
                                    var93.field189 = var9.field2311;
                                    field476.method2226(var93);
                                }
                                if (field480 > var9.field2336 && var9.field2239 != null) {
                                    class19 var94 = new class19();
                                    var94.field188 = var9;
                                    var94.field189 = var9.field2239;
                                    field476.method2226(var94);
                                }
                                if (field481 > var9.field2336 && var9.field2314 != null) {
                                    class19 var95 = new class19();
                                    var95.field188 = var9;
                                    var95.field189 = var9.field2314;
                                    field476.method2226(var95);
                                }
                                if (field482 > var9.field2336 && var9.field2269 != null) {
                                    class19 var96 = new class19();
                                    var96.field188 = var9;
                                    var96.field189 = var9.field2269;
                                    field476.method2226(var96);
                                }
                                if (field447 > var9.field2336 && var9.field2320 != null) {
                                    class19 var97 = new class19();
                                    var97.field188 = var9;
                                    var97.field189 = var9.field2320;
                                    field476.method2226(var97);
                                }
                                if (field477 > var9.field2336 && var9.field2338 != null) {
                                    class19 var98 = new class19();
                                    var98.field188 = var9;
                                    var98.field189 = var9.field2338;
                                    field476.method2226(var98);
                                }
                                var9.field2336 = field472;
                                if (var9.field2312 != null) {
                                    for (int var99 = 0; var99 < field510; var99++) {
                                        class19 var100 = new class19();
                                        var100.field188 = var9;
                                        var100.field191 = field432[var99];
                                        var100.field194 = field459[var99];
                                        var100.field189 = var9.field2312;
                                        field476.method2226(var100);
                                    }
                                }
                            }
                        }
                        if (!var9.field2199 && field512 == null && Statics.field1551 == null && !field428) {
                            if ((var9.field2324 >= 0 || var9.field2236 != 0) && class116.field1795 >= var12 && class116.field1798 >= var13 && class116.field1795 < var14 && class116.field1798 < var15) {
                                if (var9.field2324 >= 0) {
                                    Statics.field1559 = arg0[var9.field2324];
                                } else {
                                    Statics.field1559 = var9;
                                }
                            }
                            if (var9.field2211 == 8 && class116.field1795 >= var12 && class116.field1798 >= var13 && class116.field1795 < var14 && class116.field1798 < var15) {
                                Statics.field106 = var9;
                            }
                            if (var9.field2233 > var9.field2225) {
                                int var101 = var9.field2264 + var10;
                                int var102 = var9.field2225;
                                int var103 = var9.field2233;
                                int var104 = class116.field1795;
                                int var105 = class116.field1798;
                                if (field370) {
                                    field474 = 32;
                                } else {
                                    field474 = 0;
                                }
                                field370 = false;
                                if (class116.field1796 == 1 || !Statics.field1663 && class116.field1796 == 4) {
                                    if (var104 >= var101 && var104 < var101 + 16 && var105 >= var11 && var105 < var11 + 16) {
                                        var9.field2231 -= 4;
                                        method1788(var9);
                                    } else if (var104 >= var101 && var104 < var101 + 16 && var105 >= var11 + var102 - 16 && var105 < var11 + var102) {
                                        var9.field2231 += 4;
                                        method1788(var9);
                                    } else if (var104 >= var101 - field474 && var104 < field474 + var101 + 16 && var105 >= var11 + 16 && var105 < var11 + var102 - 16) {
                                        int var106 = (var102 - 32) * var102 / var103;
                                        if (var106 < 8) {
                                            var106 = 8;
                                        }
                                        int var107 = var105 - var11 - 16 - var106 / 2;
                                        int var108 = var102 - 32 - var106;
                                        var9.field2231 = (var103 - var102) * var107 / var108;
                                        method1788(var9);
                                        field370 = true;
                                    }
                                }
                                if (field395 != 0) {
                                    int var109 = var9.field2264;
                                    if (var104 >= var101 - var109 && var105 >= var11 && var104 < var101 + 16 && var105 <= var11 + var102) {
                                        var9.field2231 += field395 * 45;
                                        method1788(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.cl(IIB)V")
    public static final void method653(int arg0, int arg1) {
        if (class170.method3657(arg0)) {
            method3213(Statics.field2298[arg0], arg1);
        }
    }

    @ObfuscatedName("gj.cu([Lfq;IB)V")
    public static final void method3213(class170[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class170 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2211 == 0) {
                    if (var3.field2333 != null) {
                        method3213(var3.field2333, arg1);
                    }
                    class18 var4 = (class18) field448.method2161((long) var3.field2209);
                    if (var4 != null) {
                        method653(var4.field178, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2316 != null) {
                    class19 var5 = new class19();
                    var5.field188 = var3;
                    var5.field189 = var3.field2316;
                    class33.method192(var5);
                }
                if (arg1 == 1 && var3.field2317 != null) {
                    if (var3.field2334 >= 0) {
                        class170 var6 = class170.method3227(var3.field2209);
                        if (var6 == null || var6.field2333 == null || var3.field2334 >= var6.field2333.length || var6.field2333[var3.field2334] != var3) {
                            continue;
                        }
                    }
                    class19 var7 = new class19();
                    var7.field188 = var3;
                    var7.field189 = var3.field2317;
                    class33.method192(var7);
                }
            }
        }
    }

    @ObfuscatedName("cv.cp(Lfq;III)V")
    public static final void method1792(class170 arg0, int arg1, int arg2) {
        if (field512 != null || field428 || arg0 == null || method172(arg0) == null) {
            return;
        }
        field512 = arg0;
        field461 = method172(arg0);
        field462 = arg1;
        field463 = arg2;
        Statics.field1192 = 0;
        field471 = false;
        if (field519 <= 0) {
            return;
        }
        int var3 = field519 - 1;
        Statics.field261 = new class39();
        Statics.field261.field798 = field430[var3];
        Statics.field261.field801 = field431[var3];
        Statics.field261.field796 = field389[var3];
        Statics.field261.field799 = field367[var3];
        Statics.field261.field800 = field434[var3];
    }

    @ObfuscatedName("y.ce(I)V")
    public static final void method198() {
        method1788(field512);
        Statics.field1192++;
        if (field468 && field465) {
            int var0 = class116.field1795;
            int var1 = class116.field1798;
            int var2 = var0 - field462;
            int var3 = var1 - field463;
            if (var2 < field495) {
                var2 = field495;
            }
            if (field512.field2264 + var2 > field495 + field461.field2264) {
                var2 = field495 + field461.field2264 - field512.field2264;
            }
            if (var3 < field330) {
                var3 = field330;
            }
            if (field512.field2225 + var3 > field330 + field461.field2225) {
                var3 = field330 + field461.field2225 - field512.field2225;
            }
            int var4 = var2 - field469;
            int var5 = var3 - field326;
            int var6 = field512.field2307;
            if (Statics.field1192 > field512.field2286 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field471 = true;
            }
            int var7 = field461.field2268 + (var2 - field495);
            int var8 = field461.field2231 + (var3 - field330);
            if (field512.field2319 != null && field471) {
                class19 var9 = new class19();
                var9.field188 = field512;
                var9.field193 = var7;
                var9.field190 = var8;
                var9.field189 = field512.field2319;
                class33.method192(var9);
            }
            if (class116.field1796 == 0) {
                if (field471) {
                    if (field512.field2299 != null) {
                        class19 var10 = new class19();
                        var10.field188 = field512;
                        var10.field193 = var7;
                        var10.field190 = var8;
                        var10.field197 = field464;
                        var10.field189 = field512.field2299;
                        class33.method192(var10);
                    }
                    if (field464 != null) {
                        class170 var11 = field512;
                        int var12 = class171.method35(method2479(var11));
                        class170 var13;
                        if (var12 == 0) {
                            var13 = null;
                        } else {
                            int var14 = 0;
                            while (true) {
                                if (var14 >= var12) {
                                    var13 = var11;
                                    break;
                                }
                                var11 = class170.method3227(var11.field2327);
                                if (var11 == null) {
                                    var13 = null;
                                    break;
                                }
                                var14++;
                            }
                        }
                        if (var13 != null) {
                            field295.method2783(28);
                            field295.method2618(field512.field2209);
                            field295.method2607(field464.field2334);
                            field295.method2707(field464.field2209);
                            field295.method2577(field464.field2329);
                            field295.method2607(field512.field2329);
                            field295.method2607(field512.field2334);
                        }
                    }
                } else if ((field427 == 1 || method95(field519 - 1)) && field519 > 2) {
                    method2985(field469 + field462, field463 + field326);
                } else if (field519 > 0) {
                    int var15 = field469 + field462;
                    int var16 = field463 + field326;
                    class39 var17 = Statics.field261;
                    method3152(var17.field798, var17.field801, var17.field796, var17.field799, var17.field800, var17.field800, var15, var16);
                    Statics.field261 = null;
                }
                field512 = null;
            }
        } else if (Statics.field1192 > 1) {
            field512 = null;
        }
    }

    @ObfuscatedName("cf.cj(Lfq;B)V")
    public static void method1788(class170 arg0) {
        if (field491 == arg0.field2341) {
            field525[arg0.field2227] = true;
        }
    }

    @ObfuscatedName("ft.cm(B)V")
    public static void method2771() {
        for (class18 var0 = (class18) field448.method2163(); var0 != null; var0 = (class18) field448.method2171()) {
            int var1 = var0.field178;
            if (class170.method3657(var1)) {
                boolean var2 = true;
                class170[] var3 = Statics.field2298[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2199;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field1879;
                    class170 var6 = class170.method3227(var5);
                    if (var6 != null) {
                        method1788(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.dd(Lfq;I)Lfq;")
    public static class170 method172(class170 arg0) {
        class170 var1 = arg0;
        int var2 = class171.method35(method2479(arg0));
        class170 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = class170.method3227(var1.field2327);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class170 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2276;
        }
        return var5;
    }

    @ObfuscatedName("eh.dq([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2423(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("es.dn(II)V")
    public static final void method2284(int arg0) {
        if (!class170.method3657(arg0)) {
            return;
        }
        class170[] var1 = Statics.field2298[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class170 var3 = var1[var2];
            if (var3 != null) {
                var3.field2331 = 0;
                var3.field2252 = 0;
            }
        }
    }

    @ObfuscatedName("ao.de(II)V")
    public static final void method819(int arg0) {
        if (class170.method3657(arg0)) {
            method645(Statics.field2298[arg0], -1);
        }
    }

    @ObfuscatedName("ap.dp([Lfq;II)V")
    public static final void method645(class170[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class170 var3 = arg0[var2];
            if (var3 != null && var3.field2327 == arg1 && (!var3.field2199 || !method3749(var3))) {
                if (var3.field2211 == 0) {
                    if (!var3.field2199 && method3749(var3) && Statics.field1559 != var3) {
                        continue;
                    }
                    method645(arg0, var3.field2209);
                    if (var3.field2333 != null) {
                        method645(var3.field2333, var3.field2209);
                    }
                    class18 var4 = (class18) field448.method2161((long) var3.field2209);
                    if (var4 != null) {
                        method819(var4.field178);
                    }
                }
                if (var3.field2211 == 6) {
                    if (var3.field2256 != -1 || var3.field2257 != -1) {
                        boolean var5 = method177(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2257;
                        } else {
                            var6 = var3.field2256;
                        }
                        if (var6 != -1) {
                            class202 var7 = class202.method2010(var6);
                            var3.field2252 += field365;
                            while (var3.field2252 > var7.field3054[var3.field2331]) {
                                var3.field2252 -= var7.field3054[var3.field2331];
                                var3.field2331++;
                                if (var3.field2331 >= var7.field3053.length) {
                                    var3.field2331 -= var7.field3068;
                                    if (var3.field2331 < 0 || var3.field2331 >= var7.field3053.length) {
                                        var3.field2331 = 0;
                                    }
                                }
                                method1788(var3);
                            }
                        }
                    }
                    if (var3.field2245 != 0 && !var3.field2199) {
                        int var8 = var3.field2245 >> 16;
                        int var9 = var3.field2245 << 16 >> 16;
                        int var10 = field365 * var8;
                        int var11 = field365 * var9;
                        var3.field2258 = var3.field2258 + var10 & 0x7FF;
                        var3.field2261 = var3.field2261 + var11 & 0x7FF;
                        method1788(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ah.dm(II)V")
    public static final void method820(int arg0) {
        method2771();
        for (class32 var1 = (class32) class32.field707.method2209(); var1 != null; var1 = (class32) class32.field707.method2211()) {
            if (var1.field713 != null) {
                var1.method634();
            }
        }
        int var2 = class188.method740(arg0).field2779;
        if (var2 == 0) {
            return;
        }
        int var3 = class166.field2169[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class85.method1589(0.9D);
                ((class75) Statics.field1451).method1336(0.9D);
            }
            if (var3 == 2) {
                class85.method1589(0.8D);
                ((class75) Statics.field1451).method1336(0.8D);
            }
            if (var3 == 3) {
                class85.method1589(0.7D);
                ((class75) Statics.field1451).method1336(0.7D);
            }
            if (var3 == 4) {
                class85.method1589(0.6D);
                ((class75) Statics.field1451).method1336(0.6D);
            }
            class199.field2952.method2155();
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
            if (field374 != var4) {
                if (field374 == 0 && field415 != -1) {
                    class139.method2051(Statics.field3080, field415, 0, var4, false);
                    field526 = false;
                } else if (var4 == 0) {
                    class139.method2987();
                    field526 = false;
                } else {
                    class139.method2867(var4);
                }
                field374 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field483 = 127;
            }
            if (var3 == 1) {
                field483 = 96;
            }
            if (var3 == 2) {
                field483 = 64;
            }
            if (var3 == 3) {
                field483 = 32;
            }
            if (var3 == 4) {
                field483 = 0;
            }
        }
        if (var2 == 5) {
            field427 = var3;
        }
        if (var2 == 6) {
            field449 = var3;
        }
        if (var2 == 9) {
            field450 = var3;
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
            field455 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field310 = (class41) class149.method162(class41.method3469(), var3);
            if (field310 == null) {
                field310 = class41.field818;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field419 = -1;
            } else {
                field419 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field311 = (class41) class149.method162(class41.method3469(), var3);
            if (field311 == null) {
                field311 = class41.field818;
            }
        }
    }

    @ObfuscatedName("c.dh(Lfq;I)V")
    public static final void method166(class170 arg0) {
        int var1 = arg0.field2213;
        if (var1 == 324) {
            if (field568 == -1) {
                field568 = arg0.field2244;
                field562 = arg0.field2332;
            }
            if (field285.field2174) {
                arg0.field2244 = field568;
            } else {
                arg0.field2244 = field562;
            }
        } else if (var1 == 325) {
            if (field568 == -1) {
                field568 = arg0.field2244;
                field562 = arg0.field2332;
            }
            if (field285.field2174) {
                arg0.field2244 = field562;
            } else {
                arg0.field2244 = field568;
            }
        } else if (var1 == 327) {
            arg0.field2258 = 150;
            arg0.field2261 = (int) (Math.sin((double) field294 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2306 = 5;
            arg0.field2253 = 0;
        } else if (var1 == 328) {
            arg0.field2258 = 150;
            arg0.field2261 = (int) (Math.sin((double) field294 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2306 = 5;
            arg0.field2253 = 1;
        }
    }

    @ObfuscatedName("am.dj(S)V")
    public static final void method669() {
        field295.method2783(105);
        for (class18 var0 = (class18) field448.method2163(); var0 != null; var0 = (class18) field448.method2171()) {
            if (var0.field181 == 0 || var0.field181 == 3) {
                method561(var0, true);
            }
        }
        if (field451 != null) {
            method1788(field451);
            field451 = null;
        }
    }

    @ObfuscatedName("z.dv(IIII)Lj;")
    public static final class18 method235(int arg0, int arg1, int arg2) {
        class18 var3 = new class18();
        var3.field178 = arg1;
        var3.field181 = arg2;
        field448.method2162(var3, (long) arg0);
        method2284(arg1);
        class170 var4 = class170.method3227(arg0);
        method1788(var4);
        if (field451 != null) {
            method1788(field451);
            field451 = null;
        }
        method2815();
        method19(Statics.field2298[arg0 >> 16], var4, false);
        class33.method2992(arg1);
        if (field543 != -1) {
            method653(field543, 1);
        }
        return var3;
    }

    @ObfuscatedName("ak.dc(Lj;ZI)V")
    public static final void method561(class18 arg0, boolean arg1) {
        int var2 = arg0.field178;
        int var3 = (int) arg0.field1879;
        arg0.method2200();
        if (arg1) {
            class170.method1777(var2);
        }
        for (class134 var4 = (class134) field489.method2163(); var4 != null; var4 = (class134) field489.method2171()) {
            if ((long) var2 == (var4.field1879 >> 48 & 0xFFFFL)) {
                var4.method2200();
            }
        }
        class170 var5 = class170.method3227(var3);
        if (var5 != null) {
            method1788(var5);
        }
        method2815();
        if (field543 != -1) {
            method653(field543, 1);
        }
    }

    @ObfuscatedName("at.dt(Lfq;I)Z")
    public static final boolean method774(class170 arg0) {
        int var1 = arg0.field2213;
        if (var1 == 205) {
            field454 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field285.method2872(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field285.method2873(var4, var5 == 1);
        }
        if (var1 == 324) {
            field285.method2874(false);
        }
        if (var1 == 325) {
            field285.method2874(true);
        }
        if (var1 == 326) {
            field295.method2783(140);
            field285.method2875(field295);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bo.dw(IIIILhj;Lfm;I)V")
    public static final void method1366(int arg0, int arg1, int arg2, int arg3, class225 arg4, class165 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method670(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field373 + field308 & 0x7FF;
        int var8 = class85.field1454[var7];
        int var9 = class85.field1455[var7];
        int var10 = var8 * 256 / (field345 + 256);
        int var11 = var9 * 256 / (field345 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field1096.method3786(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("av.db(IIIILhj;Lfm;B)V")
    public static final void method670(int arg0, int arg1, int arg2, int arg3, class225 arg4, class165 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field373 + field308 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class85.field1454[var6];
        int var9 = class85.field1455[var6];
        int var10 = var8 * 256 / (field345 + 256);
        int var11 = var9 * 256 / (field345 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method3785(arg5.field2160 / 2 + var12 - arg4.field3211 / 2, arg5.field2168 / 2 - var13 - arg4.field3209 / 2, arg0, arg1, arg5.field2160, arg5.field2168, arg5.field2162, arg5.field2159);
        } else {
            arg4.method3795(arg5.field2160 / 2 + arg0 + var12 - arg4.field3211 / 2, arg5.field2168 / 2 + arg1 - var13 - arg4.field3209 / 2);
        }
    }

    @ObfuscatedName("dy.dl(Ljava/lang/String;ZI)Z")
    public static boolean method2104(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = Statics.method2096(arg0, Statics.field1725);
        for (int var3 = 0; var3 < field554; var3++) {
            if (var2.equalsIgnoreCase(Statics.method2096(field556[var3].field156, Statics.field1725)) && (!arg1 || field556[var3].field147 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(Statics.method2096(Statics.field810.field241, Statics.field1725))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gb.df(Ljava/lang/String;I)Z")
    public static boolean method3193(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = Statics.method2096(arg0, Statics.field1725);
        for (int var2 = 0; var2 < field558; var2++) {
            class20 var3 = field349[var2];
            if (var1.equalsIgnoreCase(Statics.method2096(var3.field208, Statics.field1725))) {
                return true;
            }
            if (var1.equalsIgnoreCase(Statics.method2096(var3.field205, Statics.field1725))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("h.dy(Ljava/lang/String;I)V")
    public static final void method135(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field554 < 200 || field411 == 1) || field554 >= 400) {
            class48.method3375(30, "", class174.field2527);
            return;
        }
        String var1 = Statics.method2096(arg0, Statics.field1725);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field554; var2++) {
            class15 var3 = field556[var2];
            String var4 = Statics.method2096(var3.field156, Statics.field1725);
            if (var4 != null && var4.equals(var1)) {
                class48.method3375(30, "", arg0 + class174.field2528);
                return;
            }
            if (var3.field148 != null) {
                String var5 = Statics.method2096(var3.field148, Statics.field1725);
                if (var5 != null && var5.equals(var1)) {
                    class48.method3375(30, "", arg0 + class174.field2528);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field558; var6++) {
            class20 var7 = field349[var6];
            String var8 = Statics.method2096(var7.field208, Statics.field1725);
            if (var8 != null && var8.equals(var1)) {
                class48.method3375(30, "", class174.field2533 + arg0 + class174.field2373);
                return;
            }
            if (var7.field205 != null) {
                String var9 = Statics.method2096(var7.field205, Statics.field1725);
                if (var9 != null && var9.equals(var1)) {
                    class48.method3375(30, "", class174.field2533 + arg0 + class174.field2373);
                    return;
                }
            }
        }
        if (Statics.method2096(Statics.field810.field241, Statics.field1725).equals(var1)) {
            class48.method3375(30, "", class174.field2531);
        } else {
            field295.method2783(49);
            field295.method2746(Statics.method1050(arg0));
            field295.method2571(arg0);
        }
    }

    @ObfuscatedName("em.dx(Lfq;I)I")
    public static int method2479(class170 arg0) {
        class134 var1 = (class134) field489.method2161(((long) arg0.field2209 << 32) + (long) arg0.field2334);
        return var1 == null ? arg0.field2325 : var1.field1892;
    }

    @ObfuscatedName("hs.do(Lfq;I)Z")
    public static boolean method3749(class170 arg0) {
        if (field457) {
            if (method2479(arg0) != 0) {
                return false;
            }
            if (arg0.field2211 == 0) {
                return false;
            }
        }
        return arg0.field2315;
    }

    @ObfuscatedName("al.du(Lfq;II)Ljava/lang/String;")
    public static String method750(class170 arg0, int arg1) {
        int var2 = method2479(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2309 == null) {
            return null;
        } else if (arg0.field2283 == null || arg0.field2283.length <= arg1 || arg0.field2283[arg1] == null || arg0.field2283[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2283[arg1];
        }
    }

    @ObfuscatedName("ep.da(Lfq;B)Ljava/lang/String;")
    public static String method2476(class170 arg0) {
        if (class171.method1929(method2479(arg0)) == 0) {
            return null;
        } else if (arg0.field2288 == null || arg0.field2288.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2288;
        }
    }

    @ObfuscatedName("a.dz(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method86(String arg0, boolean arg1) {
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
        if (Statics.field757 != null) {
            var3 = "/p=" + Statics.field757;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field291 + "/a=" + Statics.field2189 + var3 + "/";
    }
}

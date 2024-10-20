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
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.util.Date;
import java.util.Iterator;

public final class client extends class114 {

    @ObfuscatedName("client.f")
    public static boolean field294 = true;

    @ObfuscatedName("client.h")
    public static int field512 = 1;

    @ObfuscatedName("client.a")
    public static int field376 = 0;

    @ObfuscatedName("client.k")
    public static int field298 = 0;

    @ObfuscatedName("client.r")
    public static boolean field299 = false;

    @ObfuscatedName("client.n")
    public static boolean field300 = false;

    @ObfuscatedName("client.m")
    public static int field301 = 0;

    @ObfuscatedName("client.w")
    public static class118[] field354 = new class118[4];

    @ObfuscatedName("client.z")
    public static int field302 = 0;

    @ObfuscatedName("client.e")
    public static boolean field303 = true;

    @ObfuscatedName("client.d")
    public static int field304 = 0;

    @ObfuscatedName("client.t")
    public static long field305 = 1L;

    @ObfuscatedName("client.l")
    public static int field446 = -1;

    @ObfuscatedName("client.v")
    public static int field307 = -1;

    @ObfuscatedName("client.az")
    public static int field308 = -1;

    @ObfuscatedName("client.ai")
    public static boolean field309 = true;

    @ObfuscatedName("client.ad")
    public static boolean field310 = false;

    @ObfuscatedName("client.aa")
    public static int field535 = 0;

    @ObfuscatedName("client.ao")
    public static int field312 = 0;

    @ObfuscatedName("client.ax")
    public static int field313 = 0;

    @ObfuscatedName("client.ae")
    public static int field314 = 0;

    @ObfuscatedName("client.al")
    public static int field315 = 0;

    @ObfuscatedName("client.an")
    public static int field316 = 0;

    @ObfuscatedName("client.aw")
    public static int field317 = 0;

    @ObfuscatedName("client.ah")
    public static int field318 = 0;

    @ObfuscatedName("client.ar")
    public static int field319 = 0;

    @ObfuscatedName("client.aq")
    public static class41 field320 = class41.field807;

    @ObfuscatedName("client.af")
    public static class41 field321 = class41.field807;

    @ObfuscatedName("client.ap")
    public static int field322 = 0;

    @ObfuscatedName("client.av")
    public static int field508 = 0;

    @ObfuscatedName("client.am")
    public static int field324 = 0;

    @ObfuscatedName("client.ba")
    public static int field327 = 0;

    @ObfuscatedName("client.bi")
    public static int field328 = 0;

    @ObfuscatedName("client.bc")
    public static int field329 = 0;

    @ObfuscatedName("client.by")
    public static int field330 = 0;

    @ObfuscatedName("client.bz")
    public static int field331 = 0;

    @ObfuscatedName("client.cg")
    public static class36[] field492 = new class36[32768];

    @ObfuscatedName("client.cc")
    public static int field333 = 0;

    @ObfuscatedName("client.cb")
    public static int[] field334 = new int[32768];

    @ObfuscatedName("client.cz")
    public static int field335 = 0;

    @ObfuscatedName("client.ca")
    public static int[] field336 = new int[250];

    @ObfuscatedName("client.cs")
    public static class160 field337 = new class160(5000);

    @ObfuscatedName("client.cv")
    public static class160 field571 = new class160(5000);

    @ObfuscatedName("client.cm")
    public static class160 field353 = new class160(15000);

    @ObfuscatedName("client.cf")
    public static int field340 = 0;

    @ObfuscatedName("client.cq")
    public static int field338 = 0;

    @ObfuscatedName("client.cp")
    public static int field518 = 0;

    @ObfuscatedName("client.cj")
    public static int field343 = 0;

    @ObfuscatedName("client.cl")
    public static int field481 = 0;

    @ObfuscatedName("client.ce")
    public static int field553 = 0;

    @ObfuscatedName("client.cd")
    public static int field346 = 0;

    @ObfuscatedName("client.cu")
    public static int field347 = 0;

    @ObfuscatedName("client.cw")
    public static boolean field474 = false;

    @ObfuscatedName("client.dh")
    public static int field349 = 0;

    @ObfuscatedName("client.dp")
    public static int field350 = 1;

    @ObfuscatedName("client.dm")
    public static int field351 = 0;

    @ObfuscatedName("client.df")
    public static int field352 = 1;

    @ObfuscatedName("client.dn")
    public static int field529 = 0;

    @ObfuscatedName("client.di")
    public static boolean field355 = false;

    @ObfuscatedName("client.dl")
    public static int[][][] field549 = new int[4][13][13];

    @ObfuscatedName("client.dk")
    public static final int[] field357 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dd")
    public static int field561 = 0;

    @ObfuscatedName("client.ds")
    public static int field523 = 2;

    @ObfuscatedName("client.dx")
    public static int field537 = 0;

    @ObfuscatedName("client.dc")
    public static int field361 = 2;

    @ObfuscatedName("client.dt")
    public static int field383 = 0;

    @ObfuscatedName("client.ei")
    public static int field363 = 1;

    @ObfuscatedName("client.ef")
    public static int field364 = 0;

    @ObfuscatedName("client.eh")
    public static int field365 = 0;

    @ObfuscatedName("client.ew")
    public static int field366 = 2;

    @ObfuscatedName("client.ez")
    public static int field519 = 0;

    @ObfuscatedName("client.en")
    public static int field368 = 1;

    @ObfuscatedName("client.ed")
    public static int field369 = 0;

    @ObfuscatedName("client.ev")
    public static int field534 = 0;

    @ObfuscatedName("client.ee")
    public static int field371 = 2301979;

    @ObfuscatedName("client.eu")
    public static int field372 = 5063219;

    @ObfuscatedName("client.ey")
    public static int field373 = 3353893;

    @ObfuscatedName("client.ea")
    public static int field374 = 7759444;

    @ObfuscatedName("client.ex")
    public static boolean field501 = false;

    @ObfuscatedName("client.em")
    public static int field502 = 0;

    @ObfuscatedName("client.fo")
    public static int field420 = 128;

    @ObfuscatedName("client.fl")
    public static int field378 = 0;

    @ObfuscatedName("client.fp")
    public static int field296 = 0;

    @ObfuscatedName("client.fn")
    public static int field380 = 0;

    @ObfuscatedName("client.fe")
    public static int field540 = 0;

    @ObfuscatedName("client.fz")
    public static int field382 = 0;

    @ObfuscatedName("client.fb")
    public static int field367 = 50;

    @ObfuscatedName("client.ft")
    public static int field572 = 0;

    @ObfuscatedName("client.fw")
    public static boolean field386 = false;

    @ObfuscatedName("client.fd")
    public static int field377 = 0;

    @ObfuscatedName("client.fu")
    public static int field387 = 0;

    @ObfuscatedName("client.fy")
    public static int field388 = 50;

    @ObfuscatedName("client.fi")
    public static int[] field339 = new int[field388];

    @ObfuscatedName("client.fc")
    public static int[] field390 = new int[field388];

    @ObfuscatedName("client.fv")
    public static int[] field342 = new int[field388];

    @ObfuscatedName("client.fg")
    public static int[] field392 = new int[field388];

    @ObfuscatedName("client.fs")
    public static int[] field393 = new int[field388];

    @ObfuscatedName("client.fa")
    public static int[] field394 = new int[field388];

    @ObfuscatedName("client.fh")
    public static int[] field395 = new int[field388];

    @ObfuscatedName("client.gp")
    public static String[] field396 = new String[field388];

    @ObfuscatedName("client.gl")
    public static int[][] field560 = new int[104][104];

    @ObfuscatedName("client.go")
    public static int field398 = 0;

    @ObfuscatedName("client.gh")
    public static int field399 = -1;

    @ObfuscatedName("client.gc")
    public static int field400 = -1;

    @ObfuscatedName("client.gi")
    public static int field541 = 0;

    @ObfuscatedName("client.gk")
    public static int field487 = 0;

    @ObfuscatedName("client.gn")
    public static int field402 = 0;

    @ObfuscatedName("client.gb")
    public static int field391 = 0;

    @ObfuscatedName("client.gd")
    public static int field445 = 0;

    @ObfuscatedName("client.gf")
    public static int field406 = 0;

    @ObfuscatedName("client.gz")
    public static int field407 = 0;

    @ObfuscatedName("client.gg")
    public static int field408 = 0;

    @ObfuscatedName("client.gs")
    public static int field345 = 0;

    @ObfuscatedName("client.ga")
    public static int field410 = 0;

    @ObfuscatedName("client.gv")
    public static boolean field411 = false;

    @ObfuscatedName("client.gx")
    public static int field423 = 0;

    @ObfuscatedName("client.gr")
    public static int field384 = 0;

    @ObfuscatedName("client.ge")
    public static class24[] field414 = new class24[2048];

    @ObfuscatedName("client.gw")
    public static int field415 = -1;

    @ObfuscatedName("client.gt")
    public static int field416 = 0;

    @ObfuscatedName("client.ho")
    public static int field417 = 0;

    @ObfuscatedName("client.hv")
    public static int[] field522 = new int[1000];

    @ObfuscatedName("client.hb")
    public static final int[] field419 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hc")
    public static String[] field412 = new String[8];

    @ObfuscatedName("client.hn")
    public static boolean[] field438 = new boolean[8];

    @ObfuscatedName("client.hp")
    public static int[] field422 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hr")
    public static int field293 = -1;

    @ObfuscatedName("client.hh")
    public static class129[][][] field424 = new class129[4][104][104];

    @ObfuscatedName("client.hf")
    public static class129 field360 = new class129();

    @ObfuscatedName("client.hd")
    public static class129 field426 = new class129();

    @ObfuscatedName("client.hx")
    public static class129 field427 = new class129();

    @ObfuscatedName("client.ht")
    public static int[] field510 = new int[25];

    @ObfuscatedName("client.hl")
    public static int[] field429 = new int[25];

    @ObfuscatedName("client.hm")
    public static int[] field403 = new int[25];

    @ObfuscatedName("client.hk")
    public static int field431 = 0;

    @ObfuscatedName("client.hj")
    public static boolean field432 = false;

    @ObfuscatedName("client.hy")
    public static int field434 = 0;

    @ObfuscatedName("client.hg")
    public static int[] field435 = new int[500];

    @ObfuscatedName("client.hz")
    public static int[] field401 = new int[500];

    @ObfuscatedName("client.ib")
    public static int[] field437 = new int[500];

    @ObfuscatedName("client.im")
    public static int[] field555 = new int[500];

    @ObfuscatedName("client.iw")
    public static String[] field439 = new String[500];

    @ObfuscatedName("client.ik")
    public static String[] field440 = new String[500];

    @ObfuscatedName("client.io")
    public static int field441 = -1;

    @ObfuscatedName("client.iy")
    public static int field442 = -1;

    @ObfuscatedName("client.ir")
    public static int field443 = 0;

    @ObfuscatedName("client.il")
    public static int field444 = 50;

    @ObfuscatedName("client.is")
    public static int field413 = 0;

    @ObfuscatedName("client.id")
    public static String field323 = null;

    @ObfuscatedName("client.ih")
    public static boolean field447 = false;

    @ObfuscatedName("client.it")
    public static int field448 = -1;

    @ObfuscatedName("client.ia")
    public static int field449 = -1;

    @ObfuscatedName("client.iz")
    public static String field450 = null;

    @ObfuscatedName("client.ig")
    public static String field451 = null;

    @ObfuscatedName("client.ie")
    public static int field452 = -1;

    @ObfuscatedName("client.ij")
    public static class126 field453 = new class126(8);

    @ObfuscatedName("client.iq")
    public static int field494 = 0;

    @ObfuscatedName("client.jb")
    public static int field455 = 0;

    @ObfuscatedName("client.jd")
    public static class170 field456 = null;

    @ObfuscatedName("client.jl")
    public static int field457 = 0;

    @ObfuscatedName("client.jf")
    public static int field477 = 0;

    @ObfuscatedName("client.jm")
    public static int field459 = 0;

    @ObfuscatedName("client.jc")
    public static int field460 = -1;

    @ObfuscatedName("client.jp")
    public static boolean field461 = false;

    @ObfuscatedName("client.jn")
    public static boolean field462 = false;

    @ObfuscatedName("client.jr")
    public static boolean field463 = false;

    @ObfuscatedName("client.jt")
    public static class170 field464 = null;

    @ObfuscatedName("client.je")
    public static class170 field465 = null;

    @ObfuscatedName("client.jx")
    public static class170 field466 = null;

    @ObfuscatedName("client.ja")
    public static int field467 = 0;

    @ObfuscatedName("client.js")
    public static int field468 = 0;

    @ObfuscatedName("client.jk")
    public static class170 field469 = null;

    @ObfuscatedName("client.ju")
    public static boolean field430 = false;

    @ObfuscatedName("client.jz")
    public static int field409 = -1;

    @ObfuscatedName("client.jg")
    public static int field311 = -1;

    @ObfuscatedName("client.jy")
    public static boolean field473 = false;

    @ObfuscatedName("client.jw")
    public static int field577 = -1;

    @ObfuscatedName("client.jv")
    public static int field475 = -1;

    @ObfuscatedName("client.jh")
    public static boolean field476 = false;

    @ObfuscatedName("client.ke")
    public static int field359 = 1;

    @ObfuscatedName("client.kp")
    public static int[] field478 = new int[32];

    @ObfuscatedName("client.kv")
    public static int field479 = 0;

    @ObfuscatedName("client.ki")
    public static int[] field480 = new int[32];

    @ObfuscatedName("client.kk")
    public static int field458 = 0;

    @ObfuscatedName("client.kt")
    public static int[] field482 = new int[32];

    @ObfuscatedName("client.kl")
    public static int field483 = 0;

    @ObfuscatedName("client.kg")
    public static int field358 = 0;

    @ObfuscatedName("client.kq")
    public static int field485 = 0;

    @ObfuscatedName("client.ky")
    public static int field486 = 0;

    @ObfuscatedName("client.kn")
    public static int field428 = 0;

    @ObfuscatedName("client.kz")
    public static int field488 = 0;

    @ObfuscatedName("client.ks")
    public static int field489 = 0;

    @ObfuscatedName("client.kj")
    public static int field381 = 0;

    @ObfuscatedName("client.kx")
    public static class129 field418 = new class129();

    @ObfuscatedName("client.kh")
    public static class129 field493 = new class129();

    @ObfuscatedName("client.kb")
    public static class129 field389 = new class129();

    @ObfuscatedName("client.kd")
    public static class126 field341 = new class126(512);

    @ObfuscatedName("client.km")
    public static int field405 = 0;

    @ObfuscatedName("client.ka")
    public static int field497 = -2;

    @ObfuscatedName("client.ko")
    public static boolean[] field498 = new boolean[100];

    @ObfuscatedName("client.le")
    public static boolean[] field295 = new boolean[100];

    @ObfuscatedName("client.ls")
    public static boolean[] field562 = new boolean[100];

    @ObfuscatedName("client.lj")
    public static int[] field543 = new int[100];

    @ObfuscatedName("client.lo")
    public static int[] field362 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field491 = new int[100];

    @ObfuscatedName("client.lz")
    public static int[] field504 = new int[100];

    @ObfuscatedName("client.ll")
    public static int field505 = 0;

    @ObfuscatedName("client.ld")
    public static long field558 = 0L;

    @ObfuscatedName("client.lu")
    public static boolean field436 = true;

    @ObfuscatedName("client.lf")
    public static int field356 = 1;

    @ObfuscatedName("client.lw")
    public static int field509 = 503;

    @ObfuscatedName("client.li")
    public static int[] field404 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lq")
    public static int field511 = 0;

    @ObfuscatedName("client.lv")
    public static int field515 = 0;

    @ObfuscatedName("client.ly")
    public static String field513 = "";

    @ObfuscatedName("client.ln")
    public static long[] field514 = new long[100];

    @ObfuscatedName("client.lm")
    public static int field454 = 0;

    @ObfuscatedName("client.lr")
    public static int field516 = 0;

    @ObfuscatedName("client.lc")
    public static int[] field517 = new int[128];

    @ObfuscatedName("client.mp")
    public static int[] field495 = new int[128];

    @ObfuscatedName("client.mv")
    public static long field397 = -1L;

    @ObfuscatedName("client.mx")
    public static String field520 = null;

    @ObfuscatedName("client.mw")
    public static String field521 = null;

    @ObfuscatedName("client.mu")
    public static int field370 = -1;

    @ObfuscatedName("client.mn")
    public static int field332 = 0;

    @ObfuscatedName("client.mj")
    public static int[] field524 = new int[1000];

    @ObfuscatedName("client.ma")
    public static int[] field525 = new int[1000];

    @ObfuscatedName("client.mt")
    public static class225[] field526 = new class225[1000];

    @ObfuscatedName("client.mk")
    public static int field527 = 0;

    @ObfuscatedName("client.mo")
    public static int field433 = 0;

    @ObfuscatedName("client.mr")
    public static int field348 = 0;

    @ObfuscatedName("client.mf")
    public static int field530 = 255;

    @ObfuscatedName("client.my")
    public static int field531 = -1;

    @ObfuscatedName("client.me")
    public static boolean field532 = false;

    @ObfuscatedName("client.nl")
    public static int field533 = 127;

    @ObfuscatedName("client.np")
    public static int field552 = 127;

    @ObfuscatedName("client.na")
    public static int field506 = 0;

    @ObfuscatedName("client.nd")
    public static int[] field566 = new int[50];

    @ObfuscatedName("client.nt")
    public static int[] field503 = new int[50];

    @ObfuscatedName("client.ni")
    public static int[] field538 = new int[50];

    @ObfuscatedName("client.ny")
    public static int[] field539 = new int[50];

    @ObfuscatedName("client.ne")
    public static class54[] field421 = new class54[50];

    @ObfuscatedName("client.nm")
    public static boolean field500 = false;

    @ObfuscatedName("client.nq")
    public static boolean[] field542 = new boolean[5];

    @ObfuscatedName("client.oj")
    public static int[] field496 = new int[5];

    @ObfuscatedName("client.ov")
    public static int[] field544 = new int[5];

    @ObfuscatedName("client.ox")
    public static int[] field545 = new int[5];

    @ObfuscatedName("client.oh")
    public static int[] field546 = new int[5];

    @ObfuscatedName("client.ol")
    public static short field547 = 256;

    @ObfuscatedName("client.oy")
    public static short field548 = 205;

    @ObfuscatedName("client.op")
    public static short field536 = 256;

    @ObfuscatedName("client.ot")
    public static short field550 = 320;

    @ObfuscatedName("client.oi")
    public static short field551 = 1;

    @ObfuscatedName("client.oc")
    public static short field385 = 32767;

    @ObfuscatedName("client.oe")
    public static short field375 = 1;

    @ObfuscatedName("client.or")
    public static short field554 = 32767;

    @ObfuscatedName("client.og")
    public static int field379 = 0;

    @ObfuscatedName("client.ou")
    public static int field556 = 0;

    @ObfuscatedName("client.oa")
    public static int field557 = 0;

    @ObfuscatedName("client.os")
    public static int field306 = 0;

    @ObfuscatedName("client.ow")
    public static int field559 = 0;

    @ObfuscatedName("client.om")
    public static int field472 = 0;

    @ObfuscatedName("client.oq")
    public static int field507 = 0;

    @ObfuscatedName("client.oz")
    public static class15[] field470 = new class15[400];

    @ObfuscatedName("client.of")
    public static class131 field563 = new class131();

    @ObfuscatedName("client.ok")
    public static int field564 = 0;

    @ObfuscatedName("client.on")
    public static class20[] field565 = new class20[400];

    @ObfuscatedName("client.ob")
    public static class167 field471 = new class167();

    @ObfuscatedName("client.pw")
    public static int field567 = -1;

    @ObfuscatedName("client.pe")
    public static int field568 = -1;

    @ObfuscatedName("client.pn")
    public static class5[] field569 = new class5[8];

    @ObfuscatedName("client.po")
    public static long field570 = -1L;

    @ObfuscatedName("client.pp")
    public static long field425 = -1L;

    @ObfuscatedName("client.pb")
    public static final class23 field499 = new class23();

    @ObfuscatedName("client.pi")
    public static int[] field573 = new int[50];

    @ObfuscatedName("client.pa")
    public static int[] field574 = new int[50];

    @ObfuscatedName("client.k(I)V")
    public final void method229() {
    }

    public final void init() {
        if (!this.method1928()) {
            return;
        }
        class215[] var1 = Statics.method3409();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class215 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3153);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3153)) {
                    case 1:
                        field301 = Integer.parseInt(var4);
                        break;
                    case 2:
                        Statics.field1108 = Integer.parseInt(var4);
                        break;
                    case 3:
                        if (var4.equalsIgnoreCase(class38.field780)) {
                            field299 = true;
                        } else {
                            field299 = false;
                        }
                        break;
                    case 4:
                        Statics.field297 = class179.method2962(Integer.parseInt(var4));
                        break;
                    case 5:
                        Statics.field2117 = var4;
                    case 6:
                    case 7:
                    case 14:
                    default:
                        break;
                    case 8:
                        field376 = Integer.parseInt(var4);
                        break;
                    case 9:
                        Statics.field1679 = Integer.parseInt(var4);
                        break;
                    case 10:
                        Statics.field55 = var4;
                        break;
                    case 11:
                        class180[] var5 = new class180[] { class180.field2690, class180.field2692, class180.field2697, class180.field2693, class180.field2691, class180.field2694 };
                        Statics.field2730 = (class180) class149.method1293(var5, Integer.parseInt(var4));
                        if (Statics.field2730 == class180.field2694) {
                            Statics.field16 = class229.field3236;
                        } else {
                            Statics.field16 = class229.field3235;
                        }
                        break;
                    case 12:
                        if (var4.equalsIgnoreCase(class38.field780)) {
                        }
                        break;
                    case 13:
                        field512 = Integer.parseInt(var4);
                        break;
                    case 15:
                        field298 = Integer.parseInt(var4);
                }
            }
        }
        method2005();
        Statics.field2688 = this.getCodeBase().getHost();
        String var6 = Statics.field297.field2686;
        byte var7 = 0;
        try {
            Statics.field1729 = 16;
            Statics.field2348 = var7;
            try {
                Statics.field1813 = System.getProperty("os.name");
            } catch (Exception var67) {
                Statics.field1813 = "Unknown";
            }
            Statics.field2870 = Statics.field1813.toLowerCase();
            try {
                Statics.field1693 = System.getProperty("user.home");
                if (Statics.field1693 != null) {
                    Statics.field1693 = Statics.field1693 + "/";
                }
            } catch (Exception var66) {
            }
            try {
                if (Statics.field2870.startsWith("win")) {
                    if (Statics.field1693 == null) {
                        Statics.field1693 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1693 == null) {
                    Statics.field1693 = System.getenv("HOME");
                }
                if (Statics.field1693 != null) {
                    Statics.field1693 = Statics.field1693 + "/";
                }
            } catch (Exception var65) {
            }
            if (Statics.field1693 == null) {
                Statics.field1693 = "~/";
            }
            Statics.field1211 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1693, "/tmp/", "" };
            Statics.field1691 = new String[] { ".jagex_cache_" + Statics.field2348, ".file_store_" + Statics.field2348 };
            int var11 = 0;
            label279: while (var11 < 4) {
                String var12 = var11 == 0 ? "" : "" + var11;
                Statics.field1686 = new File(Statics.field1693, "jagex_cl_oldschool_" + var6 + var12 + ".dat");
                String var13 = null;
                String var14 = null;
                boolean var15 = false;
                if (Statics.field1686.exists()) {
                    try {
                        class74 var16 = new class74(Statics.field1686, "rw", 10000L);
                        class154 var17 = new class154((int) var16.method1304());
                        while (var17.field2098 < var17.field2100.length) {
                            int var18 = var16.method1305(var17.field2100, var17.field2098, var17.field2100.length - var17.field2098);
                            if (var18 == -1) {
                                throw new IOException();
                            }
                            var17.field2098 += var18;
                        }
                        var17.field2098 = 0;
                        int var19 = var17.method2545();
                        if (var19 < 1 || var19 > 3) {
                            throw new IOException("" + var19);
                        }
                        int var20 = 0;
                        if (var19 > 1) {
                            var20 = var17.method2545();
                        }
                        if (var19 <= 2) {
                            var13 = var17.method2675();
                            if (var20 == 1) {
                                var14 = var17.method2675();
                            }
                        } else {
                            var13 = var17.method2608();
                            if (var20 == 1) {
                                var14 = var17.method2608();
                            }
                        }
                        var16.method1303();
                    } catch (IOException var69) {
                        var69.printStackTrace();
                    }
                    if (var13 != null) {
                        File var22 = new File(var13);
                        if (!var22.exists()) {
                            var13 = null;
                        }
                    }
                    if (var13 != null) {
                        File var23 = new File(var13, "test.dat");
                        boolean var26;
                        try {
                            RandomAccessFile var24 = new RandomAccessFile(var23, "rw");
                            int var25 = var24.read();
                            var24.seek(0L);
                            var24.write(var25);
                            var24.seek(0L);
                            var24.close();
                            var23.delete();
                            var26 = true;
                        } catch (Exception var64) {
                            var26 = false;
                        }
                        if (!var26) {
                            var13 = null;
                        }
                    }
                }
                if (var13 == null && var11 == 0) {
                    label254: for (int var28 = 0; var28 < Statics.field1691.length; var28++) {
                        for (int var29 = 0; var29 < Statics.field1211.length; var29++) {
                            File var30 = new File(Statics.field1211[var29] + Statics.field1691[var28] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var30.exists()) {
                                File var31 = new File(var30, "test.dat");
                                boolean var34;
                                try {
                                    RandomAccessFile var32 = new RandomAccessFile(var31, "rw");
                                    int var33 = var32.read();
                                    var32.seek(0L);
                                    var32.write(var33);
                                    var32.seek(0L);
                                    var32.close();
                                    var31.delete();
                                    var34 = true;
                                } catch (Exception var63) {
                                    var34 = false;
                                }
                                if (var34) {
                                    var13 = var30.toString();
                                    var15 = true;
                                    break label254;
                                }
                            }
                        }
                    }
                }
                if (var13 == null) {
                    var13 = Statics.field1693 + File.separatorChar + "jagexcache" + var12 + File.separatorChar + "oldschool" + File.separatorChar + var6 + File.separatorChar;
                    var15 = true;
                }
                if (var14 != null) {
                    File var36 = new File(var14);
                    File var37 = new File(var13);
                    try {
                        File[] var38 = var36.listFiles();
                        File[] var39 = var38;
                        for (int var40 = 0; var40 < var39.length; var40++) {
                            File var41 = var39[var40];
                            File var42 = new File(var37, var41.getName());
                            boolean var43 = var41.renameTo(var42);
                            if (!var43) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var68) {
                        var68.printStackTrace();
                    }
                    var15 = true;
                }
                if (var15) {
                    File var45 = new File(var13);
                    Object var46 = null;
                    try {
                        class74 var47 = new class74(Statics.field1686, "rw", 10000L);
                        class154 var48 = new class154(500);
                        var48.method2531(3);
                        var48.method2531(var46 == null ? 0 : 1);
                        var48.method2539(var45.getPath());
                        if (var46 != null) {
                            var48.method2539(((File) var46).getPath());
                        }
                        var47.method1321(var48.field2100, 0, var48.field2098);
                        var47.method1303();
                    } catch (IOException var62) {
                        var62.printStackTrace();
                    }
                }
                File var50 = new File(var13);
                Statics.field1767 = var50;
                if (!Statics.field1767.exists()) {
                    Statics.field1767.mkdirs();
                }
                File[] var51 = Statics.field1767.listFiles();
                if (var51 == null) {
                    break;
                }
                File[] var52 = var51;
                int var53 = 0;
                while (true) {
                    if (var53 >= var52.length) {
                        break label279;
                    }
                    File var54 = var52[var53];
                    boolean var57;
                    try {
                        RandomAccessFile var55 = new RandomAccessFile(var54, "rw");
                        int var56 = var55.read();
                        var55.seek(0L);
                        var55.write(var56);
                        var55.seek(0L);
                        var55.close();
                        var57 = true;
                    } catch (Exception var61) {
                        var57 = false;
                    }
                    if (!var57) {
                        var11++;
                        break;
                    }
                    var53++;
                }
            }
            class108.method1764(Statics.field1767);
            class105.method1428();
            class105.field1689 = new class73(new class74(class108.method223("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class105.field1683 = new class73(new class74(class108.method223("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1561 = new class73[Statics.field1729];
            for (int var59 = 0; var59 < Statics.field1729; var59++) {
                Statics.field1561[var59] = new class73(new class74(class108.method223("main_file_cache.idx" + var59), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var70) {
            class102.method690((String) null, var70);
        }
        Statics.field3231 = this;
        this.method1925(765, 503, 131);
    }

    @ObfuscatedName("dr.b(I)V")
    public static final void method2005() {
        class88.field1496 = false;
        field300 = false;
    }

    @ObfuscatedName("client.x(B)V")
    public final void method535() {
        Statics.field7 = field298 == 0 ? 43594 : field512 + 40000;
        Statics.field2844 = field298 == 0 ? 443 : field512 + 50000;
        Statics.field603 = Statics.field7;
        Statics.field964 = class168.field2190;
        Statics.field1817 = class168.field2193;
        Statics.field2184 = class168.field2189;
        Statics.field794 = class168.field2188;
        if (Statics.field1671.toLowerCase().indexOf("microsoft") == -1) {
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
        Canvas var1 = Statics.field578;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class106.field1698);
        var1.addFocusListener(class106.field1698);
        class116.method2384(Statics.field578);
        class107 var2;
        try {
            var2 = new class107();
        } catch (Throwable var13) {
            var2 = null;
        }
        Statics.field2747 = var2;
        if (Statics.field2747 != null) {
            Statics.field2747.method1862(Statics.field578);
        }
        Statics.field1756 = new class117(255, class105.field1689, class105.field1683, 500000);
        class74 var4 = null;
        class31 var5 = new class31();
        try {
            var4 = class105.method665("", Statics.field2730.field2689, false);
            byte[] var6 = new byte[(int) var4.method1304()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method1305(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class31(new class154(var6));
        } catch (Exception var14) {
        }
        try {
            if (var4 != null) {
                var4.method1303();
            }
        } catch (Exception var12) {
        }
        Statics.field795 = var5;
        Statics.field1542 = this.getToolkit().getSystemClipboard();
        class115.method82(this, Statics.field878);
        if (field298 != 0) {
            field310 = true;
        }
        method2979(Statics.field795.field697);
    }

    @ObfuscatedName("client.r(I)V")
    public final void method233() {
        field304++;
        this.method236();
        Statics.method2750();
        try {
            if (class139.field1934 == 1) {
                int var1 = Statics.field1924.method2271();
                if (var1 > 0 && Statics.field1924.method2277()) {
                    int var2 = var1 - Statics.field1927;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field1924.method2373(var2);
                } else {
                    Statics.field1924.method2346();
                    Statics.field1924.method2274();
                    if (Statics.field968 == null) {
                        class139.field1934 = 0;
                    } else {
                        class139.field1934 = 2;
                    }
                    Statics.field1929 = null;
                    Statics.field1473 = null;
                }
            }
        } catch (Exception var17) {
            var17.printStackTrace();
            Statics.field1924.method2346();
            class139.field1934 = 0;
            Statics.field1929 = null;
            Statics.field1473 = null;
            Statics.field968 = null;
        }
        method813();
        class106 var4 = class106.field1698;
        synchronized (class106.field1698) {
            class106.field1721++;
            class106.field1696 = class106.field1697;
            class106.field1723 = 0;
            if (class106.field1713 >= 0) {
                while (class106.field1713 != class106.field1712) {
                    int var6 = class106.field1711[class106.field1712];
                    class106.field1712 = class106.field1712 + 1 & 0x7F;
                    if (var6 < 0) {
                        class106.field1710[~var6] = false;
                    } else {
                        if (!class106.field1710[var6] && class106.field1723 < class106.field1716.length - 1) {
                            class106.field1716[++class106.field1723 - 1] = var6;
                        }
                        class106.field1710[var6] = true;
                    }
                }
            } else {
                for (int var5 = 0; var5 < 112; var5++) {
                    class106.field1710[var5] = false;
                }
                class106.field1713 = class106.field1712;
            }
            class106.field1697 = class106.field1714;
        }
        class116 var8 = class116.field1798;
        synchronized (class116.field1798) {
            class116.field1802 = class116.field1799;
            class116.field1811 = class116.field1800;
            class116.field1804 = class116.field1801;
            class116.field1808 = class116.field1805;
            class116.field1810 = class116.field1809;
            class116.field1797 = class116.field1807;
            class116.field1812 = class116.field1806;
            class116.field1805 = 0;
        }
        if (Statics.field2747 != null) {
            int var10 = Statics.field2747.method1865();
            field381 = var10;
        }
        if (field302 == 0) {
            Statics.method227();
            Statics.field1655.method1775();
            for (int var11 = 0; var11 < 32; var11++) {
                field1779[var11] = 0L;
            }
            for (int var12 = 0; var12 < 32; var12++) {
                field1780[var12] = 0L;
            }
            Statics.field896 = 0;
        } else if (field302 == 5) {
            Statics.method68(this);
            Statics.method227();
            Statics.field1655.method1775();
            for (int var13 = 0; var13 < 32; var13++) {
                field1779[var13] = 0L;
            }
            for (int var14 = 0; var14 < 32; var14++) {
                field1780[var14] = 0L;
            }
            Statics.field896 = 0;
        } else if (field302 == 10 || field302 == 11) {
            Statics.method68(this);
        } else if (field302 == 20) {
            Statics.method68(this);
            method682();
        } else if (field302 == 25) {
            method2973();
        }
        if (field302 == 30) {
            method226();
        } else if (field302 == 40 || field302 == 45) {
            method682();
        }
    }

    @ObfuscatedName("client.n(I)V")
    public final void method234() {
        boolean var1;
        label191: {
            try {
                if (class139.field1934 == 2) {
                    if (Statics.field1929 == null) {
                        Statics.field1929 = class145.method2460(Statics.field968, Statics.field1299, Statics.field3098);
                        if (Statics.field1929 == null) {
                            var1 = false;
                            break label191;
                        }
                    }
                    if (Statics.field1473 == null) {
                        Statics.field1473 = new class61(Statics.field1923, Statics.field6);
                    }
                    if (Statics.field1924.method2272(Statics.field1929, Statics.field1932, Statics.field1473, 22050)) {
                        Statics.field1924.method2303();
                        Statics.field1924.method2373(Statics.field1922);
                        Statics.field1924.method2275(Statics.field1929, Statics.field1928);
                        class139.field1934 = 0;
                        Statics.field1929 = null;
                        Statics.field1473 = null;
                        Statics.field968 = null;
                        var1 = true;
                        break label191;
                    }
                }
            } catch (Exception var28) {
                var28.printStackTrace();
                Statics.field1924.method2346();
                class139.field1934 = 0;
                Statics.field1929 = null;
                Statics.field1473 = null;
                Statics.field968 = null;
            }
            var1 = false;
        }
        if (var1 && field532 && Statics.field1627 != null) {
            Statics.field1627.method997();
        }
        if (field302 == 10 || field302 == 20 || field302 == 30) {
            if (field558 != 0L && Statics.method28() > field558) {
                method2979(method1440());
            } else if (field1787) {
                method2392();
            }
        }
        Dimension var4 = this.method1946();
        if (Statics.field181 != var4.width || Statics.field591 != var4.height || field1771) {
            Statics.method772();
            field558 = Statics.method28() + 500L;
            field1771 = false;
        }
        boolean var5 = false;
        if (field1784) {
            field1784 = false;
            var5 = true;
            for (int var6 = 0; var6 < 100; var6++) {
                field498[var6] = true;
            }
        }
        if (var5) {
            method702();
        }
        if (field302 == 0) {
            int var7 = class42.field829;
            String var8 = class42.field823;
            Color var9 = null;
            try {
                Graphics var10 = Statics.field578.getGraphics();
                if (Statics.field165 == null) {
                    Statics.field165 = new Font("Helvetica", 1, 13);
                    Statics.field1788 = Statics.field578.getFontMetrics(Statics.field165);
                }
                if (var5) {
                    var10.setColor(Color.black);
                    var10.fillRect(0, 0, Statics.field187, Statics.field908);
                }
                if (var9 == null) {
                    var9 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field2195 == null) {
                        Statics.field2195 = Statics.field578.createImage(304, 34);
                    }
                    Graphics var11 = Statics.field2195.getGraphics();
                    var11.setColor(var9);
                    var11.drawRect(0, 0, 303, 33);
                    var11.fillRect(2, 2, var7 * 3, 30);
                    var11.setColor(Color.black);
                    var11.drawRect(1, 1, 301, 31);
                    var11.fillRect(var7 * 3 + 2, 2, 300 - var7 * 3, 30);
                    var11.setFont(Statics.field165);
                    var11.setColor(Color.white);
                    var11.drawString(var8, (304 - Statics.field1788.stringWidth(var8)) / 2, 22);
                    var10.drawImage(Statics.field2195, Statics.field187 / 2 - 152, Statics.field908 / 2 - 18, (ImageObserver) null);
                } catch (Exception var24) {
                    int var13 = Statics.field187 / 2 - 152;
                    int var14 = Statics.field908 / 2 - 18;
                    var10.setColor(var9);
                    var10.drawRect(var13, var14, 303, 33);
                    var10.fillRect(var13 + 2, var14 + 2, var7 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(var13 + 1, var14 + 1, 301, 31);
                    var10.fillRect(var7 * 3 + var13 + 2, var14 + 2, 300 - var7 * 3, 30);
                    var10.setFont(Statics.field165);
                    var10.setColor(Color.white);
                    var10.drawString(var8, var13 + (304 - Statics.field1788.stringWidth(var8)) / 2, var14 + 22);
                }
            } catch (Exception var25) {
                Statics.field578.repaint();
            }
        } else if (field302 == 5) {
            class42.method1576(Statics.field188, Statics.field1910, Statics.field235, var5);
        } else if (field302 == 10 || field302 == 11) {
            class42.method1576(Statics.field188, Statics.field1910, Statics.field235, var5);
        } else if (field302 == 20) {
            class42.method1576(Statics.field188, Statics.field1910, Statics.field235, var5);
        } else if (field302 == 25) {
            if (field529 == 1) {
                if (field349 > field350) {
                    field350 = field349;
                }
                int var16 = (field350 * 50 - field349 * 50) / field350;
                method703(class174.field2368 + class38.field775 + class38.field778 + var16 + "%" + class38.field779, false);
            } else if (field529 == 2) {
                if (field351 > field352) {
                    field352 = field351;
                }
                int var17 = (field352 * 50 - field351 * 50) / field352 + 50;
                method703(class174.field2368 + class38.field775 + class38.field778 + var17 + "%" + class38.field779, false);
            } else {
                method703(class174.field2368, false);
            }
        } else if (field302 == 30) {
            method144();
        } else if (field302 == 40) {
            method703(class174.field2378 + class38.field775 + class174.field2421, false);
        } else if (field302 == 45) {
            method703(class174.field2523, false);
        }
        if (field302 == 30 && field505 == 0 && !var5) {
            try {
                Graphics var18 = Statics.field578.getGraphics();
                for (int var19 = 0; var19 < field405; var19++) {
                    if (field295[var19]) {
                        Statics.field1059.method3628(var18, field543[var19], field362[var19], field491[var19], field504[var19]);
                        field295[var19] = false;
                    }
                }
            } catch (Exception var27) {
                Statics.field578.repaint();
            }
        } else if (field302 > 0) {
            try {
                Graphics var21 = Statics.field578.getGraphics();
                Statics.field1059.method3625(var21, 0, 0);
                for (int var22 = 0; var22 < field405; var22++) {
                    field295[var22] = false;
                }
            } catch (Exception var26) {
                Statics.field578.repaint();
            }
        }
    }

    @ObfuscatedName("client.m(I)V")
    public final void method391() {
        if (Statics.field490.method795()) {
            Statics.field490.method789();
        }
        if (Statics.field803 != null) {
            Statics.field803.field232 = false;
        }
        Statics.field803 = null;
        if (Statics.field699 != null) {
            Statics.field699.method1893();
            Statics.field699 = null;
        }
        if (class106.field1698 != null) {
            class106 var1 = class106.field1698;
            synchronized (class106.field1698) {
                class106.field1698 = null;
            }
        }
        if (class116.field1798 != null) {
            class116 var3 = class116.field1798;
            synchronized (class116.field1798) {
                class116.field1798 = null;
            }
        }
        Statics.field2747 = null;
        if (Statics.field1627 != null) {
            Statics.field1627.method976();
        }
        if (Statics.field930 != null) {
            Statics.field930.method976();
        }
        class186.method710();
        Object var5 = class184.field2733;
        synchronized (class184.field2733) {
            if (class184.field2732 != 0) {
                class184.field2732 = 1;
                try {
                    class184.field2733.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        class105.method745();
    }

    @ObfuscatedName("ci.j(IB)V")
    public static void method1803(int arg0) {
        if (field302 == arg0) {
            return;
        }
        if (field302 == 0) {
            Statics.field2195 = null;
            Statics.field165 = null;
            Statics.field1788 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field328 = 0;
            field329 = 0;
            field330 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field3004 != null) {
            Statics.field3004.method1893();
            Statics.field3004 = null;
        }
        if (field302 == 25) {
            field529 = 0;
            field349 = 0;
            field350 = 1;
            field351 = 0;
            field352 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class42.method645(Statics.field578, Statics.field1737, Statics.field808, true, 0);
        } else if (arg0 == 20) {
            class42.method645(Statics.field578, Statics.field1737, Statics.field808, true, field302 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class42.method645(Statics.field578, Statics.field1737, Statics.field808, false, 4);
        } else {
            class42.method647();
        }
        field302 = arg0;
    }

    @ObfuscatedName("client.w(I)V")
    public void method236() {
        if (field302 != 1000) {
            boolean var1 = class186.method1310();
            if (!var1) {
                this.method526();
            }
        }
    }

    @ObfuscatedName("client.p(I)V")
    public void method526() {
        if (class186.field2749 >= 4) {
            this.method1935("js5crc");
            field302 = 1000;
            return;
        }
        if (class186.field2757 >= 4) {
            if (field302 <= 5) {
                this.method1935("js5io");
                field302 = 1000;
                return;
            }
            field324 = 3000;
            class186.field2757 = 3;
        }
        if (--field324 + 1 > 0) {
            return;
        }
        try {
            if (field508 == 0) {
                Statics.field255 = Statics.field253.method1805(Statics.field2688, Statics.field603);
                field508++;
            }
            if (field508 == 1) {
                if (Statics.field255.field1664 == 2) {
                    this.method384(-1);
                    return;
                }
                if (Statics.field255.field1664 == 1) {
                    field508++;
                }
            }
            if (field508 == 2) {
                Statics.field774 = new class111((Socket) Statics.field255.field1667, Statics.field253);
                class154 var1 = new class154(5);
                var1.method2531(15);
                var1.method2534(131);
                Statics.field774.method1902(var1.field2100, 0, 5);
                field508++;
                Statics.field942 = Statics.method28();
            }
            if (field508 == 3) {
                if (field302 <= 5 || Statics.field774.method1894() > 0) {
                    int var2 = Statics.field774.method1891();
                    if (var2 != 0) {
                        this.method384(var2);
                        return;
                    }
                    field508++;
                } else if (Statics.method28() - Statics.field942 > 30000L) {
                    this.method384(-2);
                    return;
                }
            }
            if (field508 == 4) {
                class111 var3 = Statics.field774;
                boolean var4 = field302 > 20;
                if (Statics.field2756 != null) {
                    try {
                        Statics.field2756.method1893();
                    } catch (Exception var14) {
                    }
                    Statics.field2756 = null;
                }
                Statics.field2756 = var3;
                class186.method3070(var4);
                class186.field2760.field2098 = 0;
                Statics.field1926 = null;
                Statics.field237 = null;
                class186.field2768 = 0;
                while (true) {
                    class182 var6 = (class182) class186.field2753.method2140();
                    if (var6 == null) {
                        while (true) {
                            class182 var7 = (class182) class186.field2758.method2140();
                            if (var7 == null) {
                                if (class186.field2764 != 0) {
                                    try {
                                        class154 var8 = new class154(4);
                                        var8.method2531(4);
                                        var8.method2531(class186.field2764);
                                        var8.method2532(0);
                                        Statics.field2756.method1902(var8.field2100, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2756.method1893();
                                        } catch (Exception var12) {
                                        }
                                        class186.field2757++;
                                        Statics.field2756 = null;
                                    }
                                }
                                class186.field2761 = 0;
                                Statics.field2750 = Statics.method28();
                                Statics.field255 = null;
                                Statics.field774 = null;
                                field508 = 0;
                                field327 = 0;
                                return;
                            }
                            class186.field2755.method2084(var7);
                            class186.field2766.method2139(var7, var7.field1889);
                            class186.field2748++;
                            class186.field2759--;
                        }
                    }
                    class186.field2751.method2139(var6, var6.field1889);
                    class186.field2752++;
                    class186.field2754--;
                }
            }
        } catch (IOException var15) {
            this.method384(-3);
        }
    }

    @ObfuscatedName("client.o(II)V")
    public void method384(int arg0) {
        Statics.field255 = null;
        Statics.field774 = null;
        field508 = 0;
        if (Statics.field7 == Statics.field603) {
            Statics.field603 = Statics.field2844;
        } else {
            Statics.field603 = Statics.field7;
        }
        field327++;
        if (field327 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field302 <= 5) {
                this.method1935("js5connect_full");
                field302 = 1000;
            } else {
                field324 = 3000;
            }
        } else if (field327 >= 2 && arg0 == 6) {
            this.method1935("js5connect_outofdate");
            field302 = 1000;
        } else if (field327 >= 4) {
            if (field302 <= 5) {
                this.method1935("js5connect");
                field302 = 1000;
            } else {
                field324 = 3000;
            }
        }
    }

    @ObfuscatedName("f.z(IZZZI)Lgo;")
    public static class185 method26(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class117 var4 = null;
        if (class105.field1689 != null) {
            var4 = new class117(arg0, class105.field1689, Statics.field1561[arg0], 1000000);
        }
        return new class185(var4, Statics.field1756, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("an.e(B)V")
    public static final void method682() {
        try {
            if (field328 == 0) {
                if (Statics.field699 != null) {
                    Statics.field699.method1893();
                    Statics.field699 = null;
                }
                Statics.field757 = null;
                field474 = false;
                field329 = 0;
                field328 = 1;
            }
            if (field328 == 1) {
                if (Statics.field757 == null) {
                    Statics.field757 = Statics.field253.method1805(Statics.field2688, Statics.field603);
                }
                if (Statics.field757.field1664 == 2) {
                    throw new IOException();
                }
                if (Statics.field757.field1664 == 1) {
                    Statics.field699 = new class111((Socket) Statics.field757.field1667, Statics.field253);
                    Statics.field757 = null;
                    field328 = 2;
                }
            }
            if (field328 == 2) {
                field337.field2098 = 0;
                field337.method2531(14);
                Statics.field699.method1902(field337.field2100, 0, 1);
                field353.field2098 = 0;
                field328 = 3;
            }
            if (field328 == 3) {
                if (Statics.field1627 != null) {
                    Statics.field1627.method999();
                }
                if (Statics.field930 != null) {
                    Statics.field930.method999();
                }
                int var0 = Statics.field699.method1891();
                if (Statics.field1627 != null) {
                    Statics.field1627.method999();
                }
                if (Statics.field930 != null) {
                    Statics.field930.method999();
                }
                if (var0 != 0) {
                    method162(var0);
                    return;
                }
                field353.field2098 = 0;
                field328 = 5;
            }
            if (field328 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field337.field2098 = 0;
                field337.method2531(1);
                field337.method2531(class42.field848.method713());
                field337.method2534(var1[0]);
                field337.method2534(var1[1]);
                field337.method2534(var1[2]);
                field337.method2534(var1[3]);
                switch(class42.field848.field1634) {
                    case 0:
                    case 3:
                        field337.method2533(Statics.field109);
                        field337.field2098 += 5;
                        break;
                    case 1:
                        field337.field2098 += 8;
                        break;
                    case 2:
                        field337.method2534((Integer) Statics.field795.field698.get(class208.method2980(class42.field836)));
                        field337.field2098 += 4;
                }
                field337.method2537(class42.field811);
                field337.method2566(class40.field797, class40.field798);
                field571.field2098 = 0;
                if (field302 == 40) {
                    field571.method2531(18);
                } else {
                    field571.method2531(16);
                }
                field571.method2532(0);
                int var2 = field571.field2098;
                field571.method2534(131);
                field571.method2570(field337.field2100, 0, field337.field2098);
                int var3 = field571.field2098;
                field571.method2537(class42.field836);
                field571.method2531((field436 ? 1 : 0) << 1 | (field300 ? 1 : 0));
                field571.method2532(Statics.field187);
                field571.method2532(Statics.field908);
                class160 var4 = field571;
                byte[] var5 = new byte[24];
                try {
                    class105.field1685.method1273(0L);
                    class105.field1685.method1272(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var43) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2570(var5, 0, 24);
                field571.method2537(Statics.field2117);
                field571.method2534(Statics.field1108);
                class154 var9 = new class154(Statics.field1605.method3884());
                Statics.field1605.method3876(var9);
                field571.method2570(var9.field2100, 0, var9.field2100.length);
                field571.method2531(Statics.field1679);
                field571.method2534(Statics.field87.field2718);
                field571.method2534(Statics.field781.field2718);
                field571.method2534(Statics.field920.field2718);
                field571.method2534(Statics.field289.field2718);
                field571.method2534(Statics.field61.field2718);
                field571.method2534(Statics.field17.field2718);
                field571.method2534(Statics.field2171.field2718);
                field571.method2534(Statics.field1640.field2718);
                field571.method2534(Statics.field808.field2718);
                field571.method2534(Statics.field325.field2718);
                field571.method2534(Statics.field1737.field2718);
                field571.method2534(Statics.field326.field2718);
                field571.method2534(Statics.field202.field2718);
                field571.method2534(Statics.field69.field2718);
                field571.method2534(Statics.field1594.field2718);
                field571.method2534(Statics.field925.field2718);
                field571.method2564(var1, var3, field571.field2098);
                field571.method2708(field571.field2098 - var2);
                Statics.field699.method1902(field571.field2100, 0, field571.field2098);
                field337.method2774(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field353.method2774(var1);
                field328 = 6;
            }
            if (field328 == 6 && Statics.field699.method1894() > 0) {
                int var11 = Statics.field699.method1891();
                if (var11 == 21 && field302 == 20) {
                    field328 = 7;
                } else if (var11 == 2) {
                    field328 = 9;
                } else if (var11 == 15 && field302 == 40) {
                    field340 = -1;
                    field328 = 13;
                } else if (var11 == 23 && field330 < 1) {
                    field330++;
                    field328 = 0;
                } else if (var11 == 29) {
                    field328 = 11;
                } else {
                    method162(var11);
                    return;
                }
            }
            if (field328 == 7 && Statics.field699.method1894() > 0) {
                field331 = (Statics.field699.method1891() + 3) * 60;
                field328 = 8;
            }
            if (field328 == 8) {
                field329 = 0;
                class42.method9(class174.field2404, class174.field2405, field331 / 60 + class174.field2406);
                if (--field331 <= 0) {
                    field328 = 0;
                }
            } else {
                if (field328 == 9 && Statics.field699.method1894() >= 13) {
                    boolean var12 = Statics.field699.method1891() == 1;
                    Statics.field699.method1892(field353.field2100, 0, 4);
                    field353.field2098 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field353.method2776() << 24;
                        int var15 = var14 | field353.method2776() << 16;
                        int var16 = var15 | field353.method2776() << 8;
                        int var17 = var16 | field353.method2776();
                        int var18 = class208.method2980(class42.field836);
                        if (Statics.field795.field698.size() >= 10 && !Statics.field795.field698.containsKey(var18)) {
                            Iterator var19 = Statics.field795.field698.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field795.field698.put(var18, var17);
                        class31.method2869();
                    }
                    field459 = Statics.field699.method1891();
                    field461 = Statics.field699.method1891() == 1;
                    field415 = Statics.field699.method1891();
                    field415 <<= 0x8;
                    field415 += Statics.field699.method1891();
                    field416 = Statics.field699.method1891();
                    Statics.field699.method1892(field353.field2100, 0, 1);
                    field353.field2098 = 0;
                    field338 = field353.method2776();
                    Statics.field699.method1892(field353.field2100, 0, 2);
                    field353.field2098 = 0;
                    field340 = field353.method2541();
                    try {
                        class101.method1787(Statics.field3231, "zap");
                    } catch (Throwable var42) {
                    }
                    field328 = 10;
                }
                if (field328 != 10) {
                    if (field328 == 11 && Statics.field699.method1894() >= 2) {
                        field353.field2098 = 0;
                        Statics.field699.method1892(field353.field2100, 0, 2);
                        field353.field2098 = 0;
                        Statics.field2774 = field353.method2541();
                        field328 = 12;
                    }
                    if (field328 == 12 && Statics.field699.method1894() >= Statics.field2774) {
                        field353.field2098 = 0;
                        Statics.field699.method1892(field353.field2100, 0, Statics.field2774);
                        field353.field2098 = 0;
                        String var37 = field353.method2734();
                        String var38 = field353.method2734();
                        String var39 = field353.method2734();
                        class42.method9(var37, var38, var39);
                        method1803(10);
                    }
                    if (field328 == 13) {
                        if (field340 == -1) {
                            if (Statics.field699.method1894() < 2) {
                                return;
                            }
                            Statics.field699.method1892(field353.field2100, 0, 2);
                            field353.field2098 = 0;
                            field340 = field353.method2541();
                        }
                        if (Statics.field699.method1894() >= field340) {
                            Statics.field699.method1892(field353.field2100, 0, field340);
                            field353.field2098 = 0;
                            int var40 = field340;
                            method159();
                            class46.method1827(field353);
                            if (field353.field2098 != var40) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field329++;
                        if (field329 > 2000) {
                            if (field330 < 1) {
                                if (Statics.field7 == Statics.field603) {
                                    Statics.field603 = Statics.field2844;
                                } else {
                                    Statics.field603 = Statics.field7;
                                }
                                field330++;
                                field328 = 0;
                            } else {
                                method162(-3);
                            }
                        }
                    }
                } else if (Statics.field699.method1894() >= field340) {
                    field353.field2098 = 0;
                    Statics.field699.method1892(field353.field2100, 0, field340);
                    field305 = 1L;
                    field308 = -1;
                    Statics.field803.field231 = 0;
                    Statics.field957 = true;
                    field309 = true;
                    field397 = -1L;
                    class228.field3232 = new class127();
                    field337.field2098 = 0;
                    field353.field2098 = 0;
                    field338 = -1;
                    field481 = -1;
                    field553 = -1;
                    field346 = -1;
                    field518 = 0;
                    field535 = 0;
                    field347 = 0;
                    field312 = 0;
                    field434 = 0;
                    field432 = false;
                    class116.field1803 = 0;
                    class48.field924.clear();
                    class48.field928.method2101();
                    class48.field923.method2251();
                    class48.field922 = 0;
                    field413 = 0;
                    field447 = false;
                    field506 = 0;
                    field561 = (int) (Math.random() * 100.0D) - 50;
                    field537 = (int) (Math.random() * 110.0D) - 55;
                    field383 = (int) (Math.random() * 80.0D) - 40;
                    field365 = (int) (Math.random() * 120.0D) - 60;
                    field519 = (int) (Math.random() * 30.0D) - 20;
                    field378 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field348 = 0;
                    field370 = -1;
                    field527 = 0;
                    field433 = 0;
                    field320 = class41.field807;
                    field321 = class41.field807;
                    field333 = 0;
                    class46.field895 = 0;
                    for (int var21 = 0; var21 < 2048; var21++) {
                        class46.field894[var21] = null;
                        class46.field893[var21] = 1;
                    }
                    for (int var22 = 0; var22 < 2048; var22++) {
                        field414[var22] = null;
                    }
                    for (int var23 = 0; var23 < 32768; var23++) {
                        field492[var23] = null;
                    }
                    field293 = -1;
                    field426.method2181();
                    field427.method2181();
                    for (int var24 = 0; var24 < 4; var24++) {
                        for (int var25 = 0; var25 < 104; var25++) {
                            for (int var26 = 0; var26 < 104; var26++) {
                                field424[var24][var25][var26] = null;
                            }
                        }
                    }
                    field360 = new class129();
                    field507 = 0;
                    field472 = 0;
                    field564 = 0;
                    for (int var27 = 0; var27 < Statics.field2347; var27++) {
                        class188 var28 = (class188) class188.field2781.method2121((long) var27);
                        class188 var29;
                        if (var28 == null) {
                            byte[] var30 = Statics.field2778.method2986(16, var27);
                            class188 var31 = new class188();
                            if (var30 != null) {
                                var31.method3131(new class154(var30));
                            }
                            class188.field2781.method2123(var31, (long) var27);
                            var29 = var31;
                        } else {
                            var29 = var28;
                        }
                        if (var29 != null) {
                            class166.field2175[var27] = 0;
                            class166.field2176[var27] = 0;
                        }
                    }
                    Statics.field490.method787();
                    field460 = -1;
                    if (field452 != -1) {
                        Statics.method1770(field452);
                    }
                    for (class18 var33 = (class18) field453.method2140(); var33 != null; var33 = (class18) field453.method2134()) {
                        method1750(var33, true);
                    }
                    field452 = -1;
                    field453 = new class126(8);
                    field456 = null;
                    field432 = false;
                    field434 = 0;
                    field471.method2852((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var34 = 0; var34 < 8; var34++) {
                        field412[var34] = null;
                        field438[var34] = false;
                    }
                    class13.field126 = new class126(32);
                    field303 = true;
                    for (int var35 = 0; var35 < 100; var35++) {
                        field498[var35] = true;
                    }
                    field337.method2775(104);
                    field337.method2531(method1440());
                    field337.method2532(Statics.field187);
                    field337.method2532(Statics.field908);
                    field520 = null;
                    Statics.field2157 = 0;
                    Statics.field1037 = null;
                    for (int var36 = 0; var36 < 8; var36++) {
                        field569[var36] = new class5();
                    }
                    Statics.field168 = null;
                    class46.method1827(field353);
                    Statics.field1302 = -1;
                    method625(false);
                    field338 = -1;
                }
            }
        } catch (IOException var44) {
            if (field330 < 1) {
                if (Statics.field7 == Statics.field603) {
                    Statics.field603 = Statics.field2844;
                } else {
                    Statics.field603 = Statics.field7;
                }
                field330++;
                field328 = 0;
            } else {
                method162(-2);
            }
        }
    }

    @ObfuscatedName("i.d(I)V")
    public static void method159() {
        field337.field2098 = 0;
        field353.field2098 = 0;
        field338 = -1;
        field481 = -1;
        field553 = -1;
        field346 = -1;
        field340 = 0;
        field518 = 0;
        field535 = 0;
        field434 = 0;
        field432 = false;
        field348 = 0;
        field527 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field414[var0] = null;
        }
        Statics.field129 = null;
        for (int var1 = 0; var1 < field492.length; var1++) {
            class36 var2 = field492[var1];
            if (var2 != null) {
                var2.field645 = -1;
                var2.field665 = false;
            }
        }
        class13.field126 = new class126(32);
        method1803(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field498[var3] = true;
        }
        field337.method2775(104);
        field337.method2531(method1440());
        field337.method2532(Statics.field187);
        field337.method2532(Statics.field908);
    }

    @ObfuscatedName("z.t(II)V")
    public static void method162(int arg0) {
        if (arg0 == -3) {
            class42.method9(class174.field2407, class174.field2519, class174.field2527);
        } else if (arg0 == -2) {
            class42.method9(class174.field2493, class174.field2534, class174.field2412);
        } else if (arg0 == -1) {
            class42.method9(class174.field2413, class174.field2475, class174.field2415);
        } else if (arg0 == 3) {
            class42.field831 = 3;
        } else if (arg0 == 4) {
            class42.method9(class174.field2416, class174.field2417, class174.field2418);
        } else if (arg0 == 5) {
            class42.method9(class174.field2419, class174.field2420, class174.field2622);
        } else if (arg0 == 6) {
            class42.method9(class174.field2422, class174.field2423, class174.field2424);
        } else if (arg0 == 7) {
            class42.method9(class174.field2425, class174.field2426, class174.field2427);
        } else if (arg0 == 8) {
            class42.method9(class174.field2428, class174.field2549, class174.field2430);
        } else if (arg0 == 9) {
            class42.method9(class174.field2553, class174.field2432, class174.field2505);
        } else if (arg0 == 10) {
            class42.method9(class174.field2434, class174.field2435, class174.field2436);
        } else if (arg0 == 11) {
            class42.method9(class174.field2593, class174.field2619, class174.field2439);
        } else if (arg0 == 12) {
            class42.method9(class174.field2409, class174.field2441, class174.field2575);
        } else if (arg0 == 13) {
            class42.method9(class174.field2443, class174.field2444, class174.field2445);
        } else if (arg0 == 14) {
            class42.method9(class174.field2502, class174.field2447, class174.field2471);
        } else if (arg0 == 16) {
            class42.method9(class174.field2482, class174.field2389, class174.field2625);
        } else if (arg0 == 17) {
            class42.method9(class174.field2602, class174.field2453, class174.field2454);
        } else if (arg0 == 18) {
            class42.method9(class174.field2455, class174.field2456, class174.field2457);
        } else if (arg0 == 19) {
            class42.method9(class174.field2458, class174.field2459, class174.field2460);
        } else if (arg0 == 20) {
            class42.method9(class174.field2461, class174.field2462, class174.field2629);
        } else if (arg0 == 22) {
            class42.method9(class174.field2464, class174.field2465, class174.field2531);
        } else if (arg0 == 23) {
            class42.method9(class174.field2467, class174.field2411, class174.field2469);
        } else if (arg0 == 24) {
            class42.method9(class174.field2470, class174.field2496, class174.field2605);
        } else if (arg0 == 25) {
            class42.method9(class174.field2414, class174.field2474, class174.field2401);
        } else if (arg0 == 26) {
            class42.method9(class174.field2518, class174.field2477, class174.field2478);
        } else if (arg0 == 27) {
            class42.method9(class174.field2560, class174.field2480, class174.field2601);
        } else if (arg0 == 31) {
            class42.method9(class174.field2630, class174.field2583, class174.field2509);
        } else if (arg0 == 32) {
            class42.method9(class174.field2489, class174.field2492, class174.field2448);
        } else if (arg0 == 37) {
            class42.method9(class174.field2395, class174.field2495, class174.field2555);
        } else if (arg0 == 38) {
            class42.method9(class174.field2579, class174.field2498, class174.field2499);
        } else if (arg0 == 55) {
            class42.method9(class174.field2500, class174.field2501, class174.field2386);
        } else if (arg0 == 56) {
            class42.method9(class174.field2503, class174.field2504, class174.field2437);
            method1803(11);
            return;
        } else if (arg0 == 57) {
            class42.method9(class174.field2506, class174.field2507, class174.field2508);
            method1803(11);
            return;
        } else {
            class42.method9(class174.field2451, class174.field2510, class174.field2408);
        }
        method1803(10);
    }

    @ObfuscatedName("an.q(I)V")
    public static final void method687() {
        if (Statics.field699 != null) {
            Statics.field699.method1893();
            Statics.field699 = null;
        }
        method2751();
        Statics.field5.method1583();
        for (int var0 = 0; var0 < 4; var0++) {
            field354[var0].method2040();
        }
        System.gc();
        class139.method1747(2);
        field531 = -1;
        field532 = false;
        class32.method97();
        method1803(10);
    }

    @ObfuscatedName("fj.y(I)V")
    public static final void method2751() {
        class201.method3116();
        class192.method2849();
        class193.method2481();
        class198.field2932.method2124();
        class198.field2903.method2124();
        class198.field2904.method2124();
        class198.field2941.method2124();
        class200.field3007.method2124();
        class200.field3008.method2124();
        class199.field2987.method2124();
        class199.field2956.method2124();
        class199.field2957.method2124();
        class202.method3178();
        class191.method161();
        class195.method1441();
        class188.method2742();
        class197.field2876.method2124();
        class197.field2877.method2124();
        class197.field2878.method2124();
        class194.method663();
        class167.method2766();
        class170.method1796();
        ((class75) Statics.field1439).method1329();
        class49.field939.method2124();
        Statics.field87.method2999();
        Statics.field781.method2999();
        Statics.field289.method2999();
        Statics.field61.method2999();
        Statics.field17.method2999();
        Statics.field2171.method2999();
        Statics.field1640.method2999();
        Statics.field808.method2999();
        Statics.field325.method2999();
        Statics.field1737.method2999();
        Statics.field326.method2999();
        Statics.field202.method2999();
    }

    @ObfuscatedName("db.l(I)V")
    public static final void method1855() {
        if (field347 > 0) {
            method687();
        } else {
            method1803(40);
            Statics.field3004 = Statics.field699;
            Statics.field699 = null;
        }
    }

    @ObfuscatedName("l.v(I)V")
    public static final void method226() {
        if (field535 > 1) {
            field535--;
        }
        if (field347 > 0) {
            field347--;
        }
        if (field474) {
            field474 = false;
            method1855();
            return;
        }
        if (!field432) {
            field439[0] = class174.field2604;
            field440[0] = "";
            field437[0] = 1006;
            field434 = 1;
        }
        for (int var0 = 0; var0 < 100 && method2807(); var0++) {
        }
        if (field302 != 30) {
            return;
        }
        while (class228.method135()) {
            field337.method2775(54);
            field337.method2531(0);
            int var1 = field337.field2098;
            class228.method3446(field337);
            field337.method2591(field337.field2098 - var1);
        }
        Object var2 = Statics.field803.field236;
        synchronized (Statics.field803.field236) {
            if (!field294) {
                Statics.field803.field231 = 0;
            } else if (class116.field1808 != 0 || Statics.field803.field231 >= 40) {
                field337.method2775(121);
                field337.method2531(0);
                int var3 = field337.field2098;
                int var4 = 0;
                for (int var5 = 0; var5 < Statics.field803.field231 && field337.field2098 - var3 < 240; var5++) {
                    var4++;
                    int var6 = Statics.field803.field233[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    int var7 = Statics.field803.field234[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = var6 * 765 + var7;
                    if (Statics.field803.field233[var5] == -1 && Statics.field803.field234[var5] == -1) {
                        var7 = -1;
                        var6 = -1;
                        var8 = 524287;
                    }
                    if (field446 != var7 || field307 != var6) {
                        int var9 = var7 - field446;
                        field446 = var7;
                        int var10 = var6 - field307;
                        field307 = var6;
                        if (field308 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            field337.method2532((field308 << 12) + (var9 << 6) + var10);
                            field308 = 0;
                        } else if (field308 < 8) {
                            field337.method2533((field308 << 19) + 8388608 + var8);
                            field308 = 0;
                        } else {
                            field337.method2534((field308 << 19) + -1073741824 + var8);
                            field308 = 0;
                        }
                    } else if (field308 < 2047) {
                        field308++;
                    }
                }
                field337.method2591(field337.field2098 - var3);
                if (var4 >= Statics.field803.field231) {
                    Statics.field803.field231 = 0;
                } else {
                    Statics.field803.field231 -= var4;
                    for (int var11 = 0; var11 < Statics.field803.field231; var11++) {
                        Statics.field803.field234[var11] = Statics.field803.field234[var4 + var11];
                        Statics.field803.field233[var11] = Statics.field803.field233[var4 + var11];
                    }
                }
            }
        }
        if (class116.field1808 == 1 || !Statics.field111 && class116.field1808 == 4 || class116.field1808 == 2) {
            long var13 = (class116.field1812 - field305 * -1L) / 50L;
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            field305 = class116.field1812 * -1L;
            int var15 = class116.field1797;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > Statics.field908) {
                var15 = Statics.field908;
            }
            int var16 = class116.field1810;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > Statics.field187) {
                var16 = Statics.field187;
            }
            int var17 = (int) var13;
            field337.method2775(162);
            field337.method2532((var17 << 1) + (class116.field1808 == 2 ? 1 : 0));
            field337.method2532(var16);
            field337.method2532(var15);
        }
        if (class106.field1723 > 0) {
            field337.method2775(95);
            field337.method2532(0);
            int var18 = field337.field2098;
            long var19 = Statics.method28();
            for (int var21 = 0; var21 < class106.field1723; var21++) {
                long var22 = var19 - field397;
                if (var22 > 16777215L) {
                    var22 = 16777215L;
                }
                field397 = var19;
                field337.method2656(class106.field1716[var21]);
                field337.method2585((int) var22);
            }
            field337.method2708(field337.field2098 - var18);
        }
        if (field572 > 0) {
            field572--;
        }
        if (class106.field1710[96] || class106.field1710[97] || class106.field1710[98] || class106.field1710[99]) {
            field386 = true;
        }
        if (field386 && field572 <= 0) {
            field572 = 20;
            field386 = false;
            field337.method2775(45);
            field337.method2578(field420);
            field337.method2578(field378);
        }
        if (Statics.field957 && !field309) {
            field309 = true;
            field337.method2775(62);
            field337.method2531(1);
        }
        if (!Statics.field957 && field309) {
            field309 = false;
            field337.method2775(62);
            field337.method2531(0);
        }
        if (Statics.field1853 != field370) {
            field370 = Statics.field1853;
            method1083(Statics.field1853);
        }
        if (field302 != 30) {
            return;
        }
        Statics.method168();
        int var10002;
        for (int var24 = 0; var24 < field506; var24++) {
            var10002 = field538[var24]--;
            if (field538[var24] >= -10) {
                class54 var26 = field421[var24];
                if (var26 == null) {
                    class54 var10000 = (class54) null;
                    var26 = class54.method901(Statics.field61, field566[var24], 0);
                    if (var26 == null) {
                        continue;
                    }
                    field538[var24] += var26.method899();
                    field421[var24] = var26;
                }
                if (field538[var24] < 0) {
                    int var33;
                    if (field539[var24] == 0) {
                        var33 = field533;
                    } else {
                        int var27 = (field539[var24] & 0xFF) * 128;
                        int var28 = field539[var24] >> 16 & 0xFF;
                        int var29 = var28 * 128 + 64 - Statics.field129.field609;
                        if (var29 < 0) {
                            var29 = -var29;
                        }
                        int var30 = field539[var24] >> 8 & 0xFF;
                        int var31 = var30 * 128 + 64 - Statics.field129.field606;
                        if (var31 < 0) {
                            var31 = -var31;
                        }
                        int var32 = var29 + var31 - 128;
                        if (var32 > var27) {
                            field538[var24] = -100;
                            continue;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        }
                        var33 = field552 * (var27 - var32) / var27;
                    }
                    if (var33 > 0) {
                        class56 var34 = var26.method898().method943(Statics.field268);
                        class67 var35 = class67.method1088(var34, 100, var33);
                        var35.method1121(field503[var24] - 1);
                        Statics.field759.method848(var35);
                    }
                    field538[var24] = -100;
                }
            } else {
                field506--;
                for (int var25 = var24; var25 < field506; var25++) {
                    field566[var25] = field566[var25 + 1];
                    field421[var25] = field421[var25 + 1];
                    field503[var25] = field503[var25 + 1];
                    field538[var25] = field538[var25 + 1];
                    field539[var25] = field539[var25 + 1];
                }
                var24--;
            }
        }
        if (field532) {
            boolean var36;
            if (class139.field1934 == 0) {
                var36 = Statics.field1924.method2277();
            } else {
                var36 = true;
            }
            if (!var36) {
                if (field530 != 0 && field531 != -1) {
                    class139.method1751(Statics.field2171, field531, 0, field530, false);
                }
                field532 = false;
            }
        }
        field518++;
        if (field518 > 750) {
            method1855();
            return;
        }
        method1759();
        for (int var37 = 0; var37 < field333; var37++) {
            int var38 = field334[var37];
            class36 var39 = field492[var38];
            if (var39 != null) {
                method88(var39, var39.field760.field3011);
            }
        }
        method167();
        field534++;
        if (field391 != 0) {
            field402 += 20;
            if (field402 >= 400) {
                field391 = 0;
            }
        }
        if (Statics.field2346 != null) {
            field445++;
            if (field445 >= 15) {
                method3468(Statics.field2346);
                Statics.field2346 = null;
            }
        }
        class170 var40 = Statics.field3164;
        class170 var41 = Statics.field131;
        Statics.field3164 = null;
        Statics.field131 = null;
        field469 = null;
        field473 = false;
        field430 = false;
        field516 = 0;
        while (class106.method1768() && field516 < 128) {
            if (field459 >= 2 && class106.field1710[82] && Statics.field176 == 66) {
                String var42 = "";
                Iterator var43 = class48.field928.iterator();
                while (var43.hasNext()) {
                    class22 var44 = (class22) var43.next();
                    var42 = var42 + var44.field240 + ':' + var44.field244 + '\n';
                }
                Statics.field1542.setContents(new StringSelection(var42), (ClipboardOwner) null);
            } else {
                field495[field516] = Statics.field176;
                field517[field516] = Statics.field881;
                field516++;
            }
        }
        if (field452 != -1) {
            method757(field452, 0, 0, Statics.field187, Statics.field908, 0, 0);
        }
        field359++;
        while (true) {
            class19 var47;
            class170 var48;
            class170 var49;
            do {
                var47 = (class19) field493.method2189();
                if (var47 == null) {
                    while (true) {
                        class19 var50;
                        class170 var51;
                        class170 var52;
                        do {
                            var50 = (class19) field389.method2189();
                            if (var50 == null) {
                                while (true) {
                                    class19 var53;
                                    class170 var54;
                                    class170 var55;
                                    do {
                                        var53 = (class19) field418.method2189();
                                        if (var53 == null) {
                                            method2806();
                                            if (Statics.field787 == null && field465 == null) {
                                                int var56 = class116.field1808;
                                                if (field432) {
                                                    if (var56 != 1 && (Statics.field111 || var56 != 4)) {
                                                        int var57 = class116.field1811;
                                                        int var58 = class116.field1804;
                                                        if (var57 < Statics.field484 - 10 || var57 > Statics.field54 + Statics.field484 + 10 || var58 < Statics.field71 - 10 || var58 > Statics.field916 + Statics.field71 + 10) {
                                                            field432 = false;
                                                            Statics.method657(Statics.field484, Statics.field71, Statics.field54, Statics.field916);
                                                        }
                                                    }
                                                    if (var56 == 1 || !Statics.field111 && var56 == 4) {
                                                        int var59 = Statics.field484;
                                                        int var60 = Statics.field71;
                                                        int var61 = Statics.field54;
                                                        int var62 = class116.field1810;
                                                        int var63 = class116.field1797;
                                                        int var64 = -1;
                                                        for (int var65 = 0; var65 < field434; var65++) {
                                                            int var66 = (field434 - 1 - var65) * 15 + var60 + 31;
                                                            if (var62 > var59 && var62 < var59 + var61 && var63 > var66 - 13 && var63 < var66 + 3) {
                                                                var64 = var65;
                                                            }
                                                        }
                                                        if (var64 != -1 && var64 >= 0) {
                                                            int var67 = field435[var64];
                                                            int var68 = field401[var64];
                                                            int var69 = field437[var64];
                                                            int var70 = field555[var64];
                                                            String var71 = field439[var64];
                                                            String var72 = field440[var64];
                                                            method207(var67, var68, var69, var70, var71, var72, class116.field1810, class116.field1797);
                                                        }
                                                        field432 = false;
                                                        Statics.method657(Statics.field484, Statics.field71, Statics.field54, Statics.field916);
                                                    }
                                                } else {
                                                    label1218: {
                                                        if ((var56 == 1 || !Statics.field111 && var56 == 4) && field434 > 0) {
                                                            int var73 = field437[field434 - 1];
                                                            if (var73 == 39 || var73 == 40 || var73 == 41 || var73 == 42 || var73 == 43 || var73 == 33 || var73 == 34 || var73 == 35 || var73 == 36 || var73 == 37 || var73 == 38 || var73 == 1005) {
                                                                label1199: {
                                                                    int var74 = field435[field434 - 1];
                                                                    int var75 = field401[field434 - 1];
                                                                    class170 var76 = class170.method1882(var75);
                                                                    int var77 = method2959(var76);
                                                                    boolean var78 = (var77 >> 28 & 0x1) != 0;
                                                                    if (!var78) {
                                                                        int var79 = method2959(var76);
                                                                        boolean var80 = (var79 >> 29 & 0x1) != 0;
                                                                        if (!var80) {
                                                                            break label1199;
                                                                        }
                                                                    }
                                                                    if (Statics.field787 != null && !field411 && field431 != 1) {
                                                                        int var81 = field434 - 1;
                                                                        boolean var82;
                                                                        if (var81 < 0) {
                                                                            var82 = false;
                                                                        } else {
                                                                            int var83 = field437[var81];
                                                                            if (var83 >= 2000) {
                                                                                var83 -= 2000;
                                                                            }
                                                                            if (var83 == 1007) {
                                                                                var82 = true;
                                                                            } else {
                                                                                var82 = false;
                                                                            }
                                                                        }
                                                                        if (!var82 && field434 > 0) {
                                                                            method2744(field408, field345);
                                                                        }
                                                                    }
                                                                    field411 = false;
                                                                    field423 = 0;
                                                                    if (Statics.field787 != null) {
                                                                        method3468(Statics.field787);
                                                                    }
                                                                    Statics.field787 = class170.method1882(var75);
                                                                    field407 = var74;
                                                                    field408 = class116.field1810;
                                                                    field345 = class116.field1797;
                                                                    if (field434 > 0) {
                                                                        method824(field434 - 1);
                                                                    }
                                                                    method3468(Statics.field787);
                                                                    break label1218;
                                                                }
                                                            }
                                                        }
                                                        if (var56 == 1 || !Statics.field111 && var56 == 4) {
                                                            label1211: {
                                                                if (field431 != 1 || field434 <= 2) {
                                                                    int var84 = field434 - 1;
                                                                    boolean var85;
                                                                    if (var84 < 0) {
                                                                        var85 = false;
                                                                    } else {
                                                                        int var86 = field437[var84];
                                                                        if (var86 >= 2000) {
                                                                            var86 -= 2000;
                                                                        }
                                                                        if (var86 == 1007) {
                                                                            var85 = true;
                                                                        } else {
                                                                            var85 = false;
                                                                        }
                                                                    }
                                                                    if (!var85) {
                                                                        break label1211;
                                                                    }
                                                                }
                                                                var56 = 2;
                                                            }
                                                        }
                                                        if ((var56 == 1 || !Statics.field111 && var56 == 4) && field434 > 0) {
                                                            int var87 = field434 - 1;
                                                            if (var87 >= 0) {
                                                                int var88 = field435[var87];
                                                                int var89 = field401[var87];
                                                                int var90 = field437[var87];
                                                                int var91 = field555[var87];
                                                                String var92 = field439[var87];
                                                                String var93 = field440[var87];
                                                                method207(var88, var89, var90, var91, var92, var93, class116.field1810, class116.field1797);
                                                            }
                                                        }
                                                        if (var56 == 2 && field434 > 0) {
                                                            method2960(class116.field1810, class116.field1797);
                                                        }
                                                    }
                                                }
                                            }
                                            if (field465 != null) {
                                                method3468(field465);
                                                Statics.field73++;
                                                if (field473 && field430) {
                                                    int var94 = class116.field1811;
                                                    int var95 = class116.field1804;
                                                    int var96 = var94 - field467;
                                                    int var97 = var95 - field468;
                                                    if (var96 < field409) {
                                                        var96 = field409;
                                                    }
                                                    if (field465.field2225 + var96 > field409 + field466.field2225) {
                                                        var96 = field409 + field466.field2225 - field465.field2225;
                                                    }
                                                    if (var97 < field311) {
                                                        var97 = field311;
                                                    }
                                                    if (field465.field2226 + var97 > field311 + field466.field2226) {
                                                        var97 = field311 + field466.field2226 - field465.field2226;
                                                    }
                                                    int var98 = var96 - field577;
                                                    int var99 = var97 - field475;
                                                    int var100 = field465.field2286;
                                                    if (Statics.field73 > field465.field2232 && (var98 > var100 || var98 < -var100 || var99 > var100 || var99 < -var100)) {
                                                        field476 = true;
                                                    }
                                                    int var101 = field466.field2231 + (var96 - field409);
                                                    int var102 = field466.field2305 + (var97 - field311);
                                                    if (field465.field2234 != null && field476) {
                                                        class19 var103 = new class19();
                                                        var103.field205 = field465;
                                                        var103.field210 = var101;
                                                        var103.field207 = var102;
                                                        var103.field206 = field465.field2234;
                                                        class33.method592(var103);
                                                    }
                                                    if (class116.field1802 == 0) {
                                                        if (field476) {
                                                            if (field465.field2255 != null) {
                                                                class19 var104 = new class19();
                                                                var104.field205 = field465;
                                                                var104.field210 = var101;
                                                                var104.field207 = var102;
                                                                var104.field217 = field469;
                                                                var104.field206 = field465.field2255;
                                                                class33.method592(var104);
                                                            }
                                                            if (field469 != null && method98(field465) != null) {
                                                                field337.method2775(34);
                                                                field337.method2595(field465.field2210);
                                                                field337.method2532(field465.field2211);
                                                                field337.method2532(field469.field2285);
                                                                field337.method2534(field469.field2210);
                                                                field337.method2577(field465.field2285);
                                                                field337.method2578(field469.field2211);
                                                            }
                                                        } else {
                                                            label1174: {
                                                                label843: {
                                                                    if (field431 != 1) {
                                                                        int var105 = field434 - 1;
                                                                        boolean var106;
                                                                        if (var105 < 0) {
                                                                            var106 = false;
                                                                        } else {
                                                                            int var107 = field437[var105];
                                                                            if (var107 >= 2000) {
                                                                                var107 -= 2000;
                                                                            }
                                                                            if (var107 == 1007) {
                                                                                var106 = true;
                                                                            } else {
                                                                                var106 = false;
                                                                            }
                                                                        }
                                                                        if (!var106) {
                                                                            break label843;
                                                                        }
                                                                    }
                                                                    if (field434 > 2) {
                                                                        method2960(field577 + field467, field475 + field468);
                                                                        break label1174;
                                                                    }
                                                                }
                                                                if (field434 > 0) {
                                                                    method2744(field577 + field467, field475 + field468);
                                                                }
                                                            }
                                                        }
                                                        field465 = null;
                                                    }
                                                } else if (Statics.field73 > 1) {
                                                    field465 = null;
                                                }
                                            }
                                            if (Statics.field787 != null) {
                                                method3468(Statics.field787);
                                                field423++;
                                                if (class116.field1802 == 0) {
                                                    if (!field411) {
                                                        label1177: {
                                                            label829: {
                                                                if (field431 != 1) {
                                                                    int var116 = field434 - 1;
                                                                    boolean var117;
                                                                    if (var116 < 0) {
                                                                        var117 = false;
                                                                    } else {
                                                                        int var118 = field437[var116];
                                                                        if (var118 >= 2000) {
                                                                            var118 -= 2000;
                                                                        }
                                                                        if (var118 == 1007) {
                                                                            var117 = true;
                                                                        } else {
                                                                            var117 = false;
                                                                        }
                                                                    }
                                                                    if (!var117) {
                                                                        break label829;
                                                                    }
                                                                }
                                                                if (field434 > 2) {
                                                                    method2960(field408, field345);
                                                                    break label1177;
                                                                }
                                                            }
                                                            if (field434 > 0) {
                                                                method2744(field408, field345);
                                                            }
                                                        }
                                                    } else if (Statics.field787 == Statics.field2695 && field410 != field407) {
                                                        class170 var108 = Statics.field787;
                                                        byte var109 = 0;
                                                        if (field455 == 1 && var108.field2214 == 206) {
                                                            var109 = 1;
                                                        }
                                                        if (var108.field2243[field410] <= 0) {
                                                            var109 = 0;
                                                        }
                                                        int var110 = method2959(var108);
                                                        boolean var111 = (var110 >> 29 & 0x1) != 0;
                                                        if (var111) {
                                                            int var112 = field407;
                                                            int var113 = field410;
                                                            var108.field2243[var113] = var108.field2243[var112];
                                                            var108.field2292[var113] = var108.field2292[var112];
                                                            var108.field2243[var112] = -1;
                                                            var108.field2292[var112] = 0;
                                                        } else if (var109 == 1) {
                                                            int var114 = field407;
                                                            int var115 = field410;
                                                            while (var114 != var115) {
                                                                if (var114 > var115) {
                                                                    var108.method2944(var114 - 1, var114);
                                                                    var114--;
                                                                } else if (var114 < var115) {
                                                                    var108.method2944(var114 + 1, var114);
                                                                    var114++;
                                                                }
                                                            }
                                                        } else {
                                                            var108.method2944(field410, field407);
                                                        }
                                                        field337.method2775(117);
                                                        field337.method2531(var109);
                                                        field337.method2579(field410);
                                                        field337.method2579(field407);
                                                        field337.method2534(Statics.field787.field2210);
                                                    }
                                                    field445 = 10;
                                                    class116.field1808 = 0;
                                                    Statics.field787 = null;
                                                } else if (field423 >= 5 && (class116.field1811 > field408 + 5 || class116.field1811 < field408 - 5 || class116.field1804 > field345 + 5 || class116.field1804 < field345 - 5)) {
                                                    field411 = true;
                                                }
                                            }
                                            if (class88.field1511 != -1) {
                                                int var119 = class88.field1511;
                                                int var120 = class88.field1514;
                                                field337.method2775(148);
                                                field337.method2531(5);
                                                field337.method2579(Statics.field1680 + var120);
                                                field337.method2556(class106.field1710[82] ? (class106.field1710[81] ? 2 : 1) : 0);
                                                field337.method2579(Statics.field254 + var119);
                                                class88.field1511 = -1;
                                                field541 = class116.field1810;
                                                field487 = class116.field1797;
                                                field391 = 1;
                                                field402 = 0;
                                                field527 = var119;
                                                field433 = var120;
                                            }
                                            if (Statics.field3164 != var40) {
                                                if (var40 != null) {
                                                    method3468(var40);
                                                }
                                                if (Statics.field3164 != null) {
                                                    method3468(Statics.field3164);
                                                }
                                            }
                                            if (Statics.field131 != var41 && field444 == field443) {
                                                if (var41 != null) {
                                                    method3468(var41);
                                                }
                                                if (Statics.field131 != null) {
                                                    method3468(Statics.field131);
                                                }
                                            }
                                            if (Statics.field131 == null) {
                                                if (field443 > 0) {
                                                    field443--;
                                                }
                                            } else if (field443 < field444) {
                                                field443++;
                                                if (field444 == field443) {
                                                    method3468(Statics.field131);
                                                }
                                            }
                                            int var121 = field561 + Statics.field129.field609;
                                            int var122 = field537 + Statics.field129.field606;
                                            if (Statics.field8 - var121 < -500 || Statics.field8 - var121 > 500 || Statics.field12 - var122 < -500 || Statics.field12 - var122 > 500) {
                                                Statics.field8 = var121;
                                                Statics.field12 = var122;
                                            }
                                            if (Statics.field8 != var121) {
                                                Statics.field8 += (var121 - Statics.field8) / 16;
                                            }
                                            if (Statics.field12 != var122) {
                                                Statics.field12 += (var122 - Statics.field12) / 16;
                                            }
                                            if (class116.field1802 == 4 && Statics.field111) {
                                                int var123 = class116.field1804 - field382;
                                                field380 = var123 * 2;
                                                field382 = var123 == -1 || var123 == 1 ? class116.field1804 : (field382 + class116.field1804) / 2;
                                                int var124 = field540 - class116.field1811;
                                                field296 = var124 * 2;
                                                field540 = var124 == -1 || var124 == 1 ? class116.field1811 : (field540 + class116.field1811) / 2;
                                            } else {
                                                if (class106.field1710[96]) {
                                                    field296 += (-24 - field296) / 2;
                                                } else if (class106.field1710[97]) {
                                                    field296 += (24 - field296) / 2;
                                                } else {
                                                    field296 /= 2;
                                                }
                                                if (class106.field1710[98]) {
                                                    field380 += (12 - field380) / 2;
                                                } else if (class106.field1710[99]) {
                                                    field380 += (-12 - field380) / 2;
                                                } else {
                                                    field380 /= 2;
                                                }
                                                field382 = class116.field1804;
                                                field540 = class116.field1811;
                                            }
                                            field378 = field296 / 2 + field378 & 0x7FF;
                                            field420 += field380 / 2;
                                            if (field420 < 128) {
                                                field420 = 128;
                                            }
                                            if (field420 > 383) {
                                                field420 = 383;
                                            }
                                            int var125 = Statics.field8 >> 7;
                                            int var126 = Statics.field12 >> 7;
                                            int var127 = method224(Statics.field8, Statics.field12, Statics.field1853);
                                            int var128 = 0;
                                            if (var125 > 3 && var126 > 3 && var125 < 100 && var126 < 100) {
                                                for (int var129 = var125 - 4; var129 <= var125 + 4; var129++) {
                                                    for (int var130 = var126 - 4; var130 <= var126 + 4; var130++) {
                                                        int var131 = Statics.field1853;
                                                        if (var131 < 3 && (class11.field112[1][var129][var130] & 0x2) == 2) {
                                                            var131++;
                                                        }
                                                        int var132 = var127 - class11.field93[var131][var129][var130];
                                                        if (var132 > var128) {
                                                            var128 = var132;
                                                        }
                                                    }
                                                }
                                            }
                                            int var133 = var128 * 192;
                                            if (var133 > 98048) {
                                                var133 = 98048;
                                            }
                                            if (var133 < 32768) {
                                                var133 = 32768;
                                            }
                                            if (var133 > field377) {
                                                field377 += (var133 - field377) / 24;
                                            } else if (var133 < field377) {
                                                field377 += (var133 - field377) / 80;
                                            }
                                            if (field500) {
                                                method155();
                                            }
                                            for (int var134 = 0; var134 < 5; var134++) {
                                                var10002 = field546[var134]++;
                                            }
                                            Statics.field490.method791();
                                            int var135 = class116.method975();
                                            int var136 = class106.method812();
                                            if (var135 > 15000 && var136 > 15000) {
                                                field347 = 250;
                                                class116.field1803 = 14500;
                                                field337.method2775(60);
                                            }
                                            field364++;
                                            if (field364 > 500) {
                                                field364 = 0;
                                                int var137 = (int) (Math.random() * 8.0D);
                                                if ((var137 & 0x1) == 1) {
                                                    field561 += field523;
                                                }
                                                if ((var137 & 0x2) == 2) {
                                                    field537 += field361;
                                                }
                                                if ((var137 & 0x4) == 4) {
                                                    field383 += field363;
                                                }
                                            }
                                            if (field561 < -50) {
                                                field523 = 2;
                                            }
                                            if (field561 > 50) {
                                                field523 = -2;
                                            }
                                            if (field537 < -55) {
                                                field361 = 2;
                                            }
                                            if (field537 > 55) {
                                                field361 = -2;
                                            }
                                            if (field383 < -40) {
                                                field363 = 1;
                                            }
                                            if (field383 > 40) {
                                                field363 = -1;
                                            }
                                            field369++;
                                            if (field369 > 500) {
                                                field369 = 0;
                                                int var138 = (int) (Math.random() * 8.0D);
                                                if ((var138 & 0x1) == 1) {
                                                    field365 += field366;
                                                }
                                                if ((var138 & 0x2) == 2) {
                                                    field519 += field368;
                                                }
                                            }
                                            if (field365 < -60) {
                                                field366 = 2;
                                            }
                                            if (field365 > 60) {
                                                field366 = -2;
                                            }
                                            if (field519 < -20) {
                                                field368 = 1;
                                            }
                                            if (field519 > 10) {
                                                field368 = -1;
                                            }
                                            for (class17 var139 = (class17) field563.method2224(); var139 != null; var139 = (class17) field563.method2225()) {
                                                if ((long) var139.field192 < Statics.method28() / 1000L - 5L) {
                                                    if (var139.field184 > 0) {
                                                        class48.method221(5, "", var139.field183 + class174.field2512);
                                                    }
                                                    if (var139.field184 == 0) {
                                                        class48.method221(5, "", var139.field183 + class174.field2513);
                                                    }
                                                    var139.method2230();
                                                }
                                            }
                                            field343++;
                                            if (field343 > 50) {
                                                field337.method2775(71);
                                            }
                                            try {
                                                if (Statics.field699 != null && field337.field2098 > 0) {
                                                    Statics.field699.method1902(field337.field2100, 0, field337.field2098);
                                                    field337.field2098 = 0;
                                                    field343 = 0;
                                                }
                                            } catch (IOException var141) {
                                                method1855();
                                            }
                                            return;
                                        }
                                        var54 = var53.field205;
                                        if (var54.field2211 < 0) {
                                            break;
                                        }
                                        var55 = class170.method1882(var54.field2229);
                                    } while (var55 == null || var55.field2237 == null || var54.field2211 >= var55.field2237.length || var55.field2237[var54.field2211] != var54);
                                    class33.method592(var53);
                                }
                            }
                            var51 = var50.field205;
                            if (var51.field2211 < 0) {
                                break;
                            }
                            var52 = class170.method1882(var51.field2229);
                        } while (var52 == null || var52.field2237 == null || var51.field2211 >= var52.field2237.length || var52.field2237[var51.field2211] != var51);
                        class33.method592(var50);
                    }
                }
                var48 = var47.field205;
                if (var48.field2211 < 0) {
                    break;
                }
                var49 = class170.method1882(var48.field2229);
            } while (var49 == null || var49.field2237 == null || var48.field2211 >= var49.field2237.length || var49.field2237[var48.field2211] != var48);
            class33.method592(var47);
        }
    }

    @ObfuscatedName("av.az(I)V")
    public static final void method813() {
        if (Statics.field930 != null) {
            Statics.field930.method1013();
        }
        if (Statics.field1627 != null) {
            Statics.field1627.method1013();
        }
    }

    @ObfuscatedName("aa.ai(Lgx;IIII)V")
    public static void method633(class202 arg0, int arg1, int arg2, int arg3) {
        if (field506 >= 50 || field552 == 0 || arg0.field3065 == null || arg1 >= arg0.field3065.length) {
            return;
        }
        int var4 = arg0.field3065[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field566[field506] = var5;
        field503[field506] = var6;
        field538[field506] = 0;
        field421[field506] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field539[field506] = (var8 << 16) + (var9 << 8) + var7;
        field506++;
    }

    @ObfuscatedName("h.ad(IIII)V")
    public static void method38(int arg0, int arg1, int arg2) {
        if (field533 == 0 || arg1 == 0 || field506 >= 50) {
            return;
        }
        field566[field506] = arg0;
        field503[field506] = arg1;
        field538[field506] = arg2;
        field421[field506] = null;
        field539[field506] = 0;
        field506++;
    }

    @ObfuscatedName("o.aa(II)V")
    public static void method157(int arg0) {
        if (arg0 == -1 && !field532) {
            class139.method3616();
        } else if (arg0 != -1 && field531 != arg0 && field530 != 0 && !field532) {
            class185 var1 = Statics.field2171;
            int var2 = field530;
            class139.field1934 = 1;
            Statics.field968 = var1;
            Statics.field1299 = arg0;
            Statics.field3098 = 0;
            Statics.field1922 = var2;
            Statics.field1928 = false;
            Statics.field1927 = 2;
        }
        field531 = arg0;
    }

    @ObfuscatedName("an.ao(Lfx;III)V")
    public static final void method686(class170 arg0, int arg1, int arg2) {
        if (field348 != 0 && field348 != 3 || class116.field1808 != 1 && Statics.field111 || class116.field1808 != 4) {
            return;
        }
        class165 var3 = arg0.method2912(true);
        if (var3 == null) {
            return;
        }
        int var4 = class116.field1810 - arg1;
        int var5 = class116.field1797 - arg2;
        if (!var3.method2842(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2165 / 2;
        int var7 = var5 - var3.field2166 / 2;
        int var8 = field378 + field365 & 0x7FF;
        int var9 = class85.field1445[var8];
        int var10 = class85.field1454[var8];
        int var11 = (field519 + 256) * var9 >> 8;
        int var12 = (field519 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field129.field609 + var13 >> 7;
        int var16 = Statics.field129.field606 - var14 >> 7;
        field337.method2775(234);
        field337.method2531(18);
        field337.method2579(Statics.field1680 + var16);
        field337.method2556(class106.field1710[82] ? (class106.field1710[81] ? 2 : 1) : 0);
        field337.method2579(Statics.field254 + var15);
        field337.method2531(var6);
        field337.method2531(var7);
        field337.method2532(field378);
        field337.method2531(57);
        field337.method2531(field365);
        field337.method2531(field519);
        field337.method2531(89);
        field337.method2532(Statics.field129.field609);
        field337.method2532(Statics.field129.field606);
        field337.method2531(63);
        field527 = var15;
        field433 = var16;
    }

    @ObfuscatedName("e.ax(B)V")
    public static final void method167() {
        int[] var0 = class46.field897;
        for (int var1 = 0; var1 < class46.field895; var1++) {
            class24 var2 = field414[var0[var1]];
            if (var2 != null && var2.field650 > 0) {
                var2.field650--;
                if (var2.field650 == 0) {
                    var2.field618 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field333; var3++) {
            int var4 = field334[var3];
            class36 var5 = field492[var4];
            if (var5 != null && var5.field650 > 0) {
                var5.field650--;
                if (var5.field650 == 0) {
                    var5.field618 = null;
                }
            }
        }
    }

    @ObfuscatedName("ci.ae(Ljava/lang/String;I)V")
    public static final void method1821(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field795.field700 = !Statics.field795.field700;
            class31.method2869();
            if (Statics.field795.field700) {
                class48.method221(99, "", "Roofs are now all hidden");
            } else {
                class48.method221(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field310 = !field310;
        }
        if (field459 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field310 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field310 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method1855();
            }
            if (arg0.equalsIgnoreCase("errortest") && field298 == 2) {
                throw new RuntimeException();
            }
        }
        field337.method2775(11);
        field337.method2531(arg0.length() + 1);
        field337.method2537(arg0);
    }

    @ObfuscatedName("w.al(B)V")
    public static final void method155() {
        int var0 = Statics.field2794 * 128 + 64;
        int var1 = Statics.field58 * 128 + 64;
        int var2 = method224(var0, var1, Statics.field1853) - Statics.field1545;
        if (Statics.field135 < var0) {
            Statics.field135 += Statics.field4 * (var0 - Statics.field135) / 1000 + Statics.field60;
            if (Statics.field135 > var0) {
                Statics.field135 = var0;
            }
        }
        if (Statics.field135 > var0) {
            Statics.field135 -= Statics.field4 * (Statics.field135 - var0) / 1000 + Statics.field60;
            if (Statics.field135 < var0) {
                Statics.field135 = var0;
            }
        }
        if (Statics.field113 < var2) {
            Statics.field113 += Statics.field4 * (var2 - Statics.field113) / 1000 + Statics.field60;
            if (Statics.field113 > var2) {
                Statics.field113 = var2;
            }
        }
        if (Statics.field113 > var2) {
            Statics.field113 -= Statics.field4 * (Statics.field113 - var2) / 1000 + Statics.field60;
            if (Statics.field113 < var2) {
                Statics.field113 = var2;
            }
        }
        if (Statics.field230 < var1) {
            Statics.field230 += Statics.field4 * (var1 - Statics.field230) / 1000 + Statics.field60;
            if (Statics.field230 > var1) {
                Statics.field230 = var1;
            }
        }
        if (Statics.field230 > var1) {
            Statics.field230 -= Statics.field4 * (Statics.field230 - var1) / 1000 + Statics.field60;
            if (Statics.field230 < var1) {
                Statics.field230 = var1;
            }
        }
        int var3 = Statics.field2172 * 128 + 64;
        int var4 = Statics.field2706 * 128 + 64;
        int var5 = method224(var3, var4, Statics.field1853) - Statics.field943;
        int var6 = var3 - Statics.field135;
        int var7 = var5 - Statics.field113;
        int var8 = var4 - Statics.field230;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field156 < var10) {
            Statics.field156 += Statics.field2736 * (var10 - Statics.field156) / 1000 + Statics.field70;
            if (Statics.field156 > var10) {
                Statics.field156 = var10;
            }
        }
        if (Statics.field156 > var10) {
            Statics.field156 -= Statics.field2736 * (Statics.field156 - var10) / 1000 + Statics.field70;
            if (Statics.field156 < var10) {
                Statics.field156 = var10;
            }
        }
        int var12 = var11 - Statics.field1705;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1705 += Statics.field2736 * var12 / 1000 + Statics.field70;
            Statics.field1705 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1705 -= Statics.field2736 * -var12 / 1000 + Statics.field70;
            Statics.field1705 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1705;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1705 = var11;
        }
    }

    @ObfuscatedName("cp.an(I)V")
    public static final void method1759() {
        int var0 = class46.field895;
        int[] var1 = class46.field897;
        for (int var2 = 0; var2 < var0; var2++) {
            class24 var3 = field414[var1[var2]];
            if (var3 != null) {
                method88(var3, 1);
            }
        }
    }

    @ObfuscatedName("u.aw(Lai;IB)V")
    public static final void method88(class28 arg0, int arg1) {
        if (arg0.field662 > field304) {
            int var2 = arg0.field662 - field304;
            int var3 = arg0.field646 * 64 + arg0.field607 * 128;
            int var4 = arg0.field651 * 128 + arg0.field646 * 64;
            arg0.field609 += (var3 - arg0.field609) / var2;
            arg0.field606 += (var4 - arg0.field606) / var2;
            arg0.field648 = 0;
            arg0.field656 = arg0.field653;
        } else if (arg0.field652 >= field304) {
            method165(arg0);
        } else {
            method1429(arg0);
        }
        if (arg0.field609 < 128 || arg0.field606 < 128 || arg0.field609 >= 13184 || arg0.field606 >= 13184) {
            arg0.field631 = -1;
            arg0.field613 = -1;
            arg0.field662 = 0;
            arg0.field652 = 0;
            arg0.field609 = arg0.field663[0] * 128 + arg0.field646 * 64;
            arg0.field606 = arg0.field661[0] * 128 + arg0.field646 * 64;
            arg0.method576();
        }
        if (Statics.field129 == arg0 && (arg0.field609 < 1536 || arg0.field606 < 1536 || arg0.field609 >= 11776 || arg0.field606 >= 11776)) {
            arg0.field631 = -1;
            arg0.field613 = -1;
            arg0.field662 = 0;
            arg0.field652 = 0;
            arg0.field609 = arg0.field663[0] * 128 + arg0.field646 * 64;
            arg0.field606 = arg0.field661[0] * 128 + arg0.field646 * 64;
            arg0.method576();
        }
        if (arg0.field647 != 0) {
            if (arg0.field645 != -1) {
                class28 var5 = null;
                if (arg0.field645 < 32768) {
                    var5 = field492[arg0.field645];
                } else if (arg0.field645 >= 32768) {
                    var5 = field414[arg0.field645 - 32768];
                }
                if (var5 != null) {
                    int var6 = arg0.field609 - var5.field609;
                    int var7 = arg0.field606 - var5.field606;
                    if (var6 != 0 || var7 != 0) {
                        arg0.field656 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field665) {
                    arg0.field645 = -1;
                    arg0.field665 = false;
                }
            }
            if (arg0.field633 != -1 && (arg0.field659 == 0 || arg0.field648 > 0)) {
                arg0.field656 = arg0.field633;
                arg0.field633 = -1;
            }
            int var8 = arg0.field656 - arg0.field624 & 0x7FF;
            if (var8 == 0 && arg0.field665) {
                arg0.field645 = -1;
                arg0.field665 = false;
            }
            if (var8 == 0) {
                arg0.field657 = 0;
            } else {
                arg0.field657++;
                if (var8 > 1024) {
                    arg0.field624 -= arg0.field647;
                    boolean var9 = true;
                    if (var8 < arg0.field647 || var8 > 2048 - arg0.field647) {
                        arg0.field624 = arg0.field656;
                        var9 = false;
                    }
                    if (arg0.field634 == arg0.field610 && (arg0.field657 > 25 || var9)) {
                        if (arg0.field611 == -1) {
                            arg0.field634 = arg0.field637;
                        } else {
                            arg0.field634 = arg0.field611;
                        }
                    }
                } else {
                    arg0.field624 += arg0.field647;
                    boolean var10 = true;
                    if (var8 < arg0.field647 || var8 > 2048 - arg0.field647) {
                        arg0.field624 = arg0.field656;
                        var10 = false;
                    }
                    if (arg0.field634 == arg0.field610 && (arg0.field657 > 25 || var10)) {
                        if (arg0.field612 == -1) {
                            arg0.field634 = arg0.field637;
                        } else {
                            arg0.field634 = arg0.field612;
                        }
                    }
                }
                arg0.field624 &= 0x7FF;
            }
        }
        method77(arg0);
    }

    @ObfuscatedName("z.ah(Lai;I)V")
    public static final void method165(class28 arg0) {
        if (field304 == arg0.field652 || arg0.field631 == -1 || arg0.field617 != 0 || arg0.field639 + 1 > class202.method1914(arg0.field631).field3064[arg0.field638]) {
            int var1 = arg0.field652 - arg0.field662;
            int var2 = field304 - arg0.field662;
            int var3 = arg0.field646 * 64 + arg0.field607 * 128;
            int var4 = arg0.field651 * 128 + arg0.field646 * 64;
            int var5 = arg0.field658 * 128 + arg0.field646 * 64;
            int var6 = arg0.field646 * 64 + arg0.field621 * 128;
            arg0.field609 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field606 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field648 = 0;
        arg0.field656 = arg0.field653;
        arg0.field624 = arg0.field656;
    }

    @ObfuscatedName("cy.ar(Lai;I)V")
    public static final void method1429(class28 arg0) {
        arg0.field634 = arg0.field610;
        if (arg0.field659 == 0) {
            arg0.field648 = 0;
            return;
        }
        if (arg0.field631 != -1 && arg0.field617 == 0) {
            class202 var1 = class202.method1914(arg0.field631);
            if (arg0.field664 > 0 && var1.field3073 == 0) {
                arg0.field648++;
                return;
            }
            if (arg0.field664 <= 0 && var1.field3069 == 0) {
                arg0.field648++;
                return;
            }
        }
        int var2 = arg0.field609;
        int var3 = arg0.field606;
        int var4 = arg0.field663[arg0.field659 - 1] * 128 + arg0.field646 * 64;
        int var5 = arg0.field661[arg0.field659 - 1] * 128 + arg0.field646 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field656 = 1280;
            } else if (var3 > var5) {
                arg0.field656 = 1792;
            } else {
                arg0.field656 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field656 = 768;
            } else if (var3 > var5) {
                arg0.field656 = 256;
            } else {
                arg0.field656 = 512;
            }
        } else if (var3 < var5) {
            arg0.field656 = 1024;
        } else if (var3 > var5) {
            arg0.field656 = 0;
        }
        byte var6 = arg0.field625[arg0.field659 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field609 = var4;
            arg0.field606 = var5;
            arg0.field659--;
            if (arg0.field664 > 0) {
                arg0.field664--;
            }
            return;
        }
        int var7 = arg0.field656 - arg0.field624 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field614;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field637;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field616;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field615;
        }
        if (var8 == -1) {
            var8 = arg0.field637;
        }
        arg0.field634 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class36) {
            var10 = ((class36) arg0).field760.field3039;
        }
        if (var10) {
            if (arg0.field656 != arg0.field624 && arg0.field645 == -1 && arg0.field647 != 0) {
                var9 = 2;
            }
            if (arg0.field659 > 2) {
                var9 = 6;
            }
            if (arg0.field659 > 3) {
                var9 = 8;
            }
            if (arg0.field648 > 0 && arg0.field659 > 1) {
                var9 = 8;
                arg0.field648--;
            }
        } else {
            if (arg0.field659 > 1) {
                var9 = 6;
            }
            if (arg0.field659 > 2) {
                var9 = 8;
            }
            if (arg0.field648 > 0 && arg0.field659 > 1) {
                var9 = 8;
                arg0.field648--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field637 == arg0.field634 && arg0.field640 != -1) {
            arg0.field634 = arg0.field640;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field609 += var9;
                if (arg0.field609 > var4) {
                    arg0.field609 = var4;
                }
            } else if (var2 > var4) {
                arg0.field609 -= var9;
                if (arg0.field609 < var4) {
                    arg0.field609 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field606 += var9;
                if (arg0.field606 > var5) {
                    arg0.field606 = var5;
                }
            } else if (var3 > var5) {
                arg0.field606 -= var9;
                if (arg0.field606 < var5) {
                    arg0.field606 = var5;
                }
            }
        }
        if (arg0.field609 == var4 && arg0.field606 == var5) {
            arg0.field659--;
            if (arg0.field664 > 0) {
                arg0.field664--;
            }
        }
    }

    @ObfuscatedName("k.ay(Lai;I)V")
    public static final void method77(class28 arg0) {
        arg0.field608 = false;
        if (arg0.field634 != -1) {
            class202 var1 = class202.method1914(arg0.field634);
            if (var1 == null || var1.field3076 == null) {
                arg0.field634 = -1;
            } else {
                arg0.field636++;
                if (arg0.field635 < var1.field3076.length && arg0.field636 > var1.field3064[arg0.field635]) {
                    arg0.field636 = 1;
                    arg0.field635++;
                    method633(var1, arg0.field635, arg0.field609, arg0.field606);
                }
                if (arg0.field635 >= var1.field3076.length) {
                    arg0.field636 = 0;
                    arg0.field635 = 0;
                    method633(var1, arg0.field635, arg0.field609, arg0.field606);
                }
            }
        }
        if (arg0.field613 != -1 && field304 >= arg0.field605) {
            if (arg0.field643 < 0) {
                arg0.field643 = 0;
            }
            int var2 = class191.method827(arg0.field613).field2802;
            if (var2 == -1) {
                arg0.field613 = -1;
            } else {
                class202 var3 = class202.method1914(var2);
                if (var3 == null || var3.field3076 == null) {
                    arg0.field613 = -1;
                } else {
                    arg0.field644++;
                    if (arg0.field643 < var3.field3076.length && arg0.field644 > var3.field3064[arg0.field643]) {
                        arg0.field644 = 1;
                        arg0.field643++;
                        method633(var3, arg0.field643, arg0.field609, arg0.field606);
                    }
                    if (arg0.field643 >= var3.field3076.length && (arg0.field643 < 0 || arg0.field643 >= var3.field3076.length)) {
                        arg0.field613 = -1;
                    }
                }
            }
        }
        if (arg0.field631 != -1 && arg0.field617 <= 1) {
            class202 var4 = class202.method1914(arg0.field631);
            if (var4.field3073 == 1 && arg0.field664 > 0 && arg0.field662 <= field304 && arg0.field652 < field304) {
                arg0.field617 = 1;
                return;
            }
        }
        if (arg0.field631 != -1 && arg0.field617 == 0) {
            class202 var5 = class202.method1914(arg0.field631);
            if (var5 == null || var5.field3076 == null) {
                arg0.field631 = -1;
            } else {
                arg0.field639++;
                if (arg0.field638 < var5.field3076.length && arg0.field639 > var5.field3064[arg0.field638]) {
                    arg0.field639 = 1;
                    arg0.field638++;
                    method633(var5, arg0.field638, arg0.field609, arg0.field606);
                }
                if (arg0.field638 >= var5.field3076.length) {
                    arg0.field638 -= var5.field3066;
                    arg0.field641++;
                    if (arg0.field641 >= var5.field3072) {
                        arg0.field631 = -1;
                    } else if (arg0.field638 >= 0 && arg0.field638 < var5.field3076.length) {
                        method633(var5, arg0.field638, arg0.field609, arg0.field606);
                    } else {
                        arg0.field631 = -1;
                    }
                }
                arg0.field608 = var5.field3068;
            }
        }
        if (arg0.field617 > 0) {
            arg0.field617--;
        }
    }

    @ObfuscatedName("d.as(Ly;III)V")
    public static void method173(class24 arg0, int arg1, int arg2) {
        if (arg0.field631 == arg1 && arg1 != -1) {
            int var3 = class202.method1914(arg1).field3070;
            if (var3 == 1) {
                arg0.field638 = 0;
                arg0.field639 = 0;
                arg0.field617 = arg2;
                arg0.field641 = 0;
            }
            if (var3 == 2) {
                arg0.field641 = 0;
            }
        } else if (arg1 == -1 || arg0.field631 == -1 || class202.method1914(arg1).field3075 >= class202.method1914(arg0.field631).field3075) {
            arg0.field631 = arg1;
            arg0.field638 = 0;
            arg0.field639 = 0;
            arg0.field617 = arg2;
            arg0.field641 = 0;
            arg0.field664 = arg0.field659;
        }
    }

    @ObfuscatedName("cb.aq(I)I")
    public static int method1440() {
        return field436 ? 2 : 1;
    }

    @ObfuscatedName("fa.af(IB)V")
    public static void method2979(int arg0) {
        field558 = 0L;
        if (arg0 >= 2) {
            field436 = true;
        } else {
            field436 = false;
        }
        Statics.method772();
        if (field302 >= 25) {
            field337.method2775(104);
            field337.method2531(method1440());
            field337.method2532(Statics.field187);
            field337.method2532(Statics.field908);
        }
        field1784 = true;
    }

    @ObfuscatedName("el.aj(I)V")
    public static void method2392() {
        Canvas var0 = Statics.field578;
        var0.removeKeyListener(class106.field1698);
        var0.removeFocusListener(class106.field1698);
        class106.field1713 = -1;
        class116.method689(Statics.field578);
        if (Statics.field2747 != null) {
            Statics.field2747.method1863(Statics.field578);
        }
        Statics.field3231.method1927();
        Statics.field578.setBackground(Color.black);
        class106.method3071(Statics.field578);
        class116.method2384(Statics.field578);
        if (Statics.field2747 != null) {
            Statics.field2747.method1862(Statics.field578);
        }
        if (field452 != -1) {
            method756(false);
        }
        field1771 = true;
    }

    @ObfuscatedName("c.ac(I)V")
    public static void method16() {
        int var0 = Statics.field187;
        int var1 = Statics.field908;
        if (Statics.field181 < var0) {
            int var2 = Statics.field181;
        }
        if (Statics.field591 < var1) {
            int var3 = Statics.field591;
        }
        if (Statics.field795 != null) {
            try {
                class101.method1788(Statics.field3231, "resize", new Object[] { method1440() });
            } catch (Throwable var5) {
            }
        }
    }

    @ObfuscatedName("ah.at(I)V")
    public static void method702() {
        int var0 = field1781;
        int var1 = field1782;
        int var2 = Statics.field181 - Statics.field187 - var0;
        int var3 = Statics.field591 - Statics.field908 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field3231.method1951();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1856 == var4) {
                Insets var7 = Statics.field1856.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field591);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field181, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field181 + var5 - var2, var6, var2, Statics.field591);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field591 + var6 - var3, Statics.field181, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("m.av(I)V")
    public static final void method144() {
        if (field452 != -1) {
            method186(field452);
        }
        for (int var0 = 0; var0 < field405; var0++) {
            if (field498[var0]) {
                field295[var0] = true;
            }
            field562[var0] = field498[var0];
            field498[var0] = false;
        }
        field497 = field304;
        field441 = -1;
        field442 = -1;
        Statics.field2695 = null;
        if (field452 != -1) {
            field405 = 0;
            int var1 = field452;
            int var2 = Statics.field187;
            int var3 = Statics.field908;
            if (class170.method1886(var1)) {
                Statics.field1582 = null;
                method7(Statics.field2334[var1], -1, 0, 0, var2, var3, 0, 0, -1);
                if (Statics.field1582 != null) {
                    method7(Statics.field1582, -1412584499, 0, 0, var2, var3, Statics.field1474, Statics.field9, -1);
                    Statics.field1582 = null;
                }
            } else {
                for (int var4 = 0; var4 < 100; var4++) {
                    field498[var4] = true;
                }
            }
        }
        class220.method3634();
        if (field432) {
            int var5 = Statics.field484;
            int var6 = Statics.field71;
            int var7 = Statics.field54;
            int var8 = Statics.field916;
            int var9 = 6116423;
            class220.method3667(var5, var6, var7, var8, var9);
            class220.method3667(var5 + 1, var6 + 1, var7 - 2, 16, 0);
            class220.method3654(var5 + 1, var6 + 18, var7 - 2, var8 - 19, 0);
            Statics.field188.method3523(class174.field2438, var5 + 3, var6 + 14, var9, -1);
            int var10 = class116.field1811;
            int var11 = class116.field1804;
            for (int var12 = 0; var12 < field434; var12++) {
                int var13 = (field434 - 1 - var12) * 15 + var6 + 31;
                int var14 = 16777215;
                if (var10 > var5 && var10 < var5 + var7 && var11 > var13 - 13 && var11 < var13 + 3) {
                    var14 = 16776960;
                }
                Statics.field188.method3523(method39(var12), var5 + 3, var13, var14, 0);
            }
            method151(Statics.field484, Statics.field71, Statics.field54, Statics.field916);
        } else if (field441 != -1) {
            method1767(field441, field442);
        }
        if (field505 == 3) {
            for (int var15 = 0; var15 < field405; var15++) {
                if (field562[var15]) {
                    class220.method3640(field543[var15], field362[var15], field491[var15], field504[var15], 16711935, 128);
                } else if (field295[var15]) {
                    class220.method3640(field543[var15], field362[var15], field491[var15], field504[var15], 16711680, 128);
                }
            }
        }
        Statics.method85(Statics.field1853, Statics.field129.field609, Statics.field129.field606, field534);
        field534 = 0;
    }

    @ObfuscatedName("ah.am(Ljava/lang/String;ZI)V")
    public static final void method703(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field235.method3520(arg0, 250);
        int var6 = Statics.field235.method3538(arg0, 250) * 13;
        class220.method3667(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class220.method3654(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field235.method3527(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        Statics.method657(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method151(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field578.getGraphics();
            Statics.field1059.method3625(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field578.repaint();
        }
    }

    @ObfuscatedName("gb.ak(IIIIB)V")
    public static final void method3163(int arg0, int arg1, int arg2, int arg3) {
        field398++;
        Statics.method1579(class16.field174);
        boolean var4 = false;
        if (field293 >= 0) {
            int var5 = class46.field895;
            int[] var6 = class46.field897;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field293 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            Statics.method1579(class16.field169);
        }
        method3448(true);
        Statics.method1579(var4 ? class16.field171 : class16.field170);
        method3448(false);
        method2967();
        method1348();
        method12(arg0, arg1, arg2, arg3, true);
        int var8 = field379;
        int var9 = field556;
        int var10 = field557;
        int var11 = field306;
        class220.method3635(var8, var9, var8 + var10, var9 + var11);
        class85.method1558();
        if (!field500) {
            int var12 = field420;
            if (field377 / 256 > var12) {
                var12 = field377 / 256;
            }
            if (field542[4] && field544[4] + 128 > var12) {
                var12 = field544[4] + 128;
            }
            int var13 = field383 + field378 & 0x7FF;
            method1974(Statics.field8, method224(Statics.field129.field609, Statics.field129.field606, Statics.field1853) - field367, Statics.field12, var12, var13, var12 * 3 + 600);
        }
        int var26;
        if (field500) {
            var26 = method13();
        } else {
            int var14;
            if (Statics.field795.field700) {
                var14 = Statics.field1853;
            } else {
                label424: {
                    int var15 = 3;
                    if (Statics.field156 < 310) {
                        int var16 = Statics.field135 >> 7;
                        int var17 = Statics.field230 >> 7;
                        int var18 = Statics.field129.field609 >> 7;
                        int var19 = Statics.field129.field606 >> 7;
                        if (var16 < 0 || var17 < 0 || var16 >= 104 || var17 >= 104) {
                            var14 = Statics.field1853;
                            break label424;
                        }
                        if ((class11.field112[Statics.field1853][var16][var17] & 0x4) != 0) {
                            var15 = Statics.field1853;
                        }
                        int var20;
                        if (var18 > var16) {
                            var20 = var18 - var16;
                        } else {
                            var20 = var16 - var18;
                        }
                        int var21;
                        if (var19 > var17) {
                            var21 = var19 - var17;
                        } else {
                            var21 = var17 - var19;
                        }
                        if (var20 > var21) {
                            int var22 = var21 * 65536 / var20;
                            int var23 = 32768;
                            while (var16 != var18) {
                                if (var16 < var18) {
                                    var16++;
                                } else if (var16 > var18) {
                                    var16--;
                                }
                                if ((class11.field112[Statics.field1853][var16][var17] & 0x4) != 0) {
                                    var15 = Statics.field1853;
                                }
                                var23 += var22;
                                if (var23 >= 65536) {
                                    var23 -= 65536;
                                    if (var17 < var19) {
                                        var17++;
                                    } else if (var17 > var19) {
                                        var17--;
                                    }
                                    if ((class11.field112[Statics.field1853][var16][var17] & 0x4) != 0) {
                                        var15 = Statics.field1853;
                                    }
                                }
                            }
                        } else {
                            int var24 = var20 * 65536 / var21;
                            int var25 = 32768;
                            while (var17 != var19) {
                                if (var17 < var19) {
                                    var17++;
                                } else if (var17 > var19) {
                                    var17--;
                                }
                                if ((class11.field112[Statics.field1853][var16][var17] & 0x4) != 0) {
                                    var15 = Statics.field1853;
                                }
                                var25 += var24;
                                if (var25 >= 65536) {
                                    var25 -= 65536;
                                    if (var16 < var18) {
                                        var16++;
                                    } else if (var16 > var18) {
                                        var16--;
                                    }
                                    if ((class11.field112[Statics.field1853][var16][var17] & 0x4) != 0) {
                                        var15 = Statics.field1853;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field129.field609 >= 0 && Statics.field129.field606 >= 0 && Statics.field129.field609 < 13312 && Statics.field129.field606 < 13312) {
                        if ((class11.field112[Statics.field1853][Statics.field129.field609 >> 7][Statics.field129.field606 >> 7] & 0x4) != 0) {
                            var15 = Statics.field1853;
                        }
                        var14 = var15;
                    } else {
                        var14 = Statics.field1853;
                    }
                }
            }
            var26 = var14;
        }
        int var27 = Statics.field135;
        int var28 = Statics.field113;
        int var29 = Statics.field230;
        int var30 = Statics.field156;
        int var31 = Statics.field1705;
        for (int var32 = 0; var32 < 5; var32++) {
            if (field542[var32]) {
                int var33 = (int) (Math.random() * (double) (field496[var32] * 2 + 1) - (double) field496[var32] + Math.sin((double) field545[var32] / 100.0D * (double) field546[var32]) * (double) field544[var32]);
                if (var32 == 0) {
                    Statics.field135 += var33;
                }
                if (var32 == 1) {
                    Statics.field113 += var33;
                }
                if (var32 == 2) {
                    Statics.field230 += var33;
                }
                if (var32 == 3) {
                    Statics.field1705 = Statics.field1705 + var33 & 0x7FF;
                }
                if (var32 == 4) {
                    Statics.field156 += var33;
                    if (Statics.field156 < 128) {
                        Statics.field156 = 128;
                    }
                    if (Statics.field156 > 383) {
                        Statics.field156 = 383;
                    }
                }
            }
        }
        int var34 = class116.field1811;
        int var35 = class116.field1804;
        if (class116.field1808 != 0) {
            var34 = class116.field1810;
            var35 = class116.field1797;
        }
        if (var34 >= var8 && var34 < var8 + var10 && var35 >= var9 && var35 < var9 + var11) {
            class83.field1412 = true;
            class83.field1415 = 0;
            class83.field1413 = var34 - var8;
            class83.field1414 = var35 - var9;
        } else {
            class83.field1412 = false;
            class83.field1415 = 0;
        }
        method813();
        class220.method3667(var8, var9, var10, var11, 0);
        method813();
        int var36 = class85.field1436;
        class85.field1436 = field559;
        Statics.field5.method1621(Statics.field135, Statics.field113, Statics.field230, Statics.field156, Statics.field1705, var26);
        class85.field1436 = var36;
        method813();
        Statics.field5.method1705();
        field387 = 0;
        boolean var37 = false;
        int var38 = -1;
        int var39 = class46.field895;
        int[] var40 = class46.field897;
        for (int var41 = 0; var41 < field333 + var39; var41++) {
            class28 var42;
            if (var41 < var39) {
                var42 = field414[var40[var41]];
                if (field293 == var40[var41]) {
                    var37 = true;
                    var38 = var41;
                    continue;
                }
            } else {
                var42 = field492[field334[var41 - var39]];
            }
            method835(var42, var41, var8, var9, var10, var11);
        }
        if (var37) {
            method835(field414[field293], var38, var8, var9, var10, var11);
        }
        for (int var43 = 0; var43 < field387; var43++) {
            int var44 = field339[var43];
            int var45 = field390[var43];
            int var46 = field392[var43];
            int var47 = field342[var43];
            boolean var48 = true;
            while (var48) {
                var48 = false;
                for (int var49 = 0; var49 < var43; var49++) {
                    if (var45 + 2 > field390[var49] - field342[var49] && var45 - var47 < field390[var49] + 2 && var44 - var46 < field392[var49] + field339[var49] && var44 + var46 > field339[var49] - field392[var49] && field390[var49] - field342[var49] < var45) {
                        var45 = field390[var49] - field342[var49];
                        var48 = true;
                    }
                }
            }
            field399 = field339[var43];
            field400 = field390[var43] = var45;
            String var50 = field396[var43];
            if (field494 == 0) {
                int var51 = 16776960;
                if (field393[var43] < 6) {
                    var51 = field404[field393[var43]];
                }
                if (field393[var43] == 6) {
                    var51 = field398 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field393[var43] == 7) {
                    var51 = field398 % 20 < 10 ? 255 : 65535;
                }
                if (field393[var43] == 8) {
                    var51 = field398 % 20 < 10 ? 45056 : 8454016;
                }
                if (field393[var43] == 9) {
                    int var52 = 150 - field395[var43];
                    if (var52 < 50) {
                        var51 = var52 * 1280 + 16711680;
                    } else if (var52 < 100) {
                        var51 = 16776960 - (var52 - 50) * 327680;
                    } else if (var52 < 150) {
                        var51 = (var52 - 100) * 5 + 65280;
                    }
                }
                if (field393[var43] == 10) {
                    int var53 = 150 - field395[var43];
                    if (var53 < 50) {
                        var51 = var53 * 5 + 16711680;
                    } else if (var53 < 100) {
                        var51 = 16711935 - (var53 - 50) * 327680;
                    } else if (var53 < 150) {
                        var51 = (var53 - 100) * 327680 + 255 - (var53 - 100) * 5;
                    }
                }
                if (field393[var43] == 11) {
                    int var54 = 150 - field395[var43];
                    if (var54 < 50) {
                        var51 = 16777215 - var54 * 327685;
                    } else if (var54 < 100) {
                        var51 = (var54 - 50) * 327685 + 65280;
                    } else if (var54 < 150) {
                        var51 = 16777215 - (var54 - 100) * 327680;
                    }
                }
                if (field394[var43] == 0) {
                    Statics.field188.method3534(var50, field399 + var8, field400 + var9, var51, 0);
                }
                if (field394[var43] == 1) {
                    Statics.field188.method3583(var50, field399 + var8, field400 + var9, var51, 0, field398);
                }
                if (field394[var43] == 2) {
                    Statics.field188.method3528(var50, field399 + var8, field400 + var9, var51, 0, field398);
                }
                if (field394[var43] == 3) {
                    Statics.field188.method3529(var50, field399 + var8, field400 + var9, var51, 0, field398, 150 - field395[var43]);
                }
                if (field394[var43] == 4) {
                    int var55 = (150 - field395[var43]) * (Statics.field188.method3518(var50) + 100) / 150;
                    class220.method3636(field399 + var8 - 50, var9, field399 + var8 + 50, var9 + var11);
                    Statics.field188.method3523(var50, field399 + var8 + 50 - var55, field400 + var9, var51, 0);
                    class220.method3635(var8, var9, var8 + var10, var9 + var11);
                }
                if (field394[var43] == 5) {
                    int var56 = 150 - field395[var43];
                    int var57 = 0;
                    if (var56 < 25) {
                        var57 = var56 - 25;
                    } else if (var56 > 125) {
                        var57 = var56 - 125;
                    }
                    class220.method3636(var8, field400 + var9 - Statics.field188.field3103 - 1, var8 + var10, field400 + var9 + 5);
                    Statics.field188.method3534(var50, field399 + var8, field400 + var9 + var57, var51, 0);
                    class220.method3635(var8, var9, var8 + var10, var9 + var11);
                }
            } else {
                Statics.field188.method3534(var50, field399 + var8, field400 + var9, 16776960, 0);
            }
        }
        if (field312 == 2) {
            method30((field315 - Statics.field254 << 7) + field318, (field316 - Statics.field1680 << 7) + field319, field317 * 2);
            if (field399 > -1 && field304 % 20 < 10) {
                Statics.field1659[0].method3744(field399 + var8 - 12, field400 + var9 - 28);
            }
        }
        ((class75) Statics.field1439).method1330(field534);
        method631(var8, var9, var10, var11);
        Statics.field135 = var27;
        Statics.field113 = var28;
        Statics.field230 = var29;
        Statics.field156 = var30;
        Statics.field1705 = var31;
        if (field303 && class186.method2966(true, false) == 0) {
            field303 = false;
        }
        if (field303) {
            class220.method3667(var8, var9, var10, var11, 0);
            method703(class174.field2368, false);
        }
    }

    @ObfuscatedName("c.au(IIIIZI)V")
    public static final void method12(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field548 - field547) * var5 / 100 + field547;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field375) {
            short var8 = field375;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field385) {
                var6 = field385;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class220.method3634();
                    class220.method3667(arg0, arg1, var10, arg3, -16777216);
                    class220.method3667(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field554) {
            short var11 = field554;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field551) {
                var6 = field551;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class220.method3634();
                    class220.method3667(arg0, arg1, arg2, var13, -16777216);
                    class220.method3667(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field550 - field536) * var5 / 100 + field536;
        field559 = arg3 * var6 * var14 / 85504 << 1;
        if (field557 != arg2 || field306 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class85.field1445[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class88.method1648(var15, 500, 800, arg2, arg3);
        }
        field379 = arg0;
        field556 = arg1;
        field557 = arg2;
        field306 = arg3;
    }

    @ObfuscatedName("gr.ab(ZI)V")
    public static final void method3448(boolean arg0) {
        for (int var1 = 0; var1 < field333; var1++) {
            class36 var2 = field492[field334[var1]];
            int var3 = (field334[var1] << 14) + 536870912;
            if (var2 != null && var2.method201() && var2.field760.field3030 == arg0 && var2.field760.method3370()) {
                int var4 = var2.field609 >> 7;
                int var5 = var2.field606 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field646 == 1 && (var2.field609 & 0x7F) == 64 && (var2.field606 & 0x7F) == 64) {
                        if (field398 == field560[var4][var5]) {
                            continue;
                        }
                        field560[var4][var5] = field398;
                    }
                    if (!var2.field760.field3038) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field5.method1638(Statics.field1853, var2.field609, var2.field606, method224(var2.field609 + (var2.field646 * 64 - 64), var2.field606 + (var2.field646 * 64 - 64), Statics.field1853), var2.field646 * 64 - 64 + 60, var2, var2.field624, var3, var2.field608);
                }
            }
        }
    }

    @ObfuscatedName("fc.bt(B)V")
    public static final void method2967() {
        for (class43 var0 = (class43) field426.method2187(); var0 != null; var0 = (class43) field426.method2203()) {
            if (Statics.field1853 != var0.field853 || field304 > var0.field873) {
                var0.method2179();
            } else if (field304 >= var0.field866) {
                if (var0.field862 > 0) {
                    class36 var1 = field492[var0.field862 - 1];
                    if (var1 != null && var1.field609 >= 0 && var1.field609 < 13312 && var1.field606 >= 0 && var1.field606 < 13312) {
                        var0.method748(var1.field609, var1.field606, method224(var1.field609, var1.field606, var0.field853) - var0.field857, field304);
                    }
                }
                if (var0.field862 < 0) {
                    int var2 = -var0.field862 - 1;
                    class24 var3;
                    if (field415 == var2) {
                        var3 = Statics.field129;
                    } else {
                        var3 = field414[var2];
                    }
                    if (var3 != null && var3.field609 >= 0 && var3.field609 < 13312 && var3.field606 >= 0 && var3.field606 < 13312) {
                        var0.method748(var3.field609, var3.field606, method224(var3.field609, var3.field606, var0.field853) - var0.field857, field304);
                    }
                }
                var0.method747(field534);
                Statics.field5.method1638(Statics.field1853, (int) var0.field864, (int) var0.field859, (int) var0.field855, 60, var0, var0.field872, -1, false);
            }
        }
    }

    @ObfuscatedName("bn.bw(I)V")
    public static final void method1348() {
        for (class34 var0 = (class34) field427.method2187(); var0 != null; var0 = (class34) field427.method2203()) {
            if (Statics.field1853 != var0.field743 || var0.field750) {
                var0.method2179();
            } else if (field304 >= var0.field749) {
                var0.method667(field534);
                if (var0.field750) {
                    var0.method2179();
                } else {
                    Statics.field5.method1638(var0.field743, var0.field742, var0.field745, var0.field746, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("c.bd(I)I")
    public static final int method13() {
        if (Statics.field795.field700) {
            return Statics.field1853;
        } else {
            int var0 = method224(Statics.field135, Statics.field230, Statics.field1853);
            return var0 - Statics.field113 >= 800 || (class11.field112[Statics.field1853][Statics.field135 >> 7][Statics.field230 >> 7] & 0x4) == 0 ? 3 : Statics.field1853;
        }
    }

    @ObfuscatedName("au.bs(Lai;IIIIIB)V")
    public static final void method835(class28 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method201()) {
            return;
        }
        if (arg0 instanceof class36) {
            class200 var6 = ((class36) arg0).field760;
            if (var6.field3005 != null) {
                var6 = var6.method3373();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class46.field895;
        int[] var8 = class46.field897;
        int var9 = 3;
        if (!arg0.field630.method2155()) {
            method3612(arg0, arg0.field655 + 15);
            for (class35 var10 = (class35) arg0.field630.method2152(); var10 != null; var10 = (class35) arg0.field630.method2148()) {
                class29 var11 = var10.method675(field304);
                if (var11 != null) {
                    class194 var12 = var10.field755;
                    class225 var13 = var12.method3208();
                    class225 var14 = var12.method3207();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field2842;
                    } else {
                        if (var12.field2849 * 2 < var14.field3210) {
                            var15 = var12.field2849;
                        }
                        var16 = var14.field3210 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field304 - var11.field671;
                    int var20 = var11.field668 * var16 / var12.field2842;
                    int var23;
                    if (var11.field670 > var19) {
                        int var21 = var12.field2847 == 0 ? 0 : var19 / var12.field2847 * var12.field2847;
                        int var22 = var11.field669 * var16 / var12.field2842;
                        var23 = (var20 - var22) * var21 / var11.field670 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field670 + var12.field2850 - var19;
                        if (var12.field2843 >= 0) {
                            var17 = (var24 << 8) / (var12.field2850 - var12.field2843);
                        }
                    }
                    if (var11.field668 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field399 + arg2 - (var16 >> 1);
                    int var26 = field400 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field399 > -1) {
                            class220.method3667(var25, var26, var23, 5, 65280);
                            class220.method3667(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3208;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method3750(var27, var26, var17);
                            class220.method3636(var27, var26, var27 + var28, var26 + var29);
                            var14.method3750(var27, var26, var17);
                        } else {
                            var13.method3744(var27, var26);
                            class220.method3636(var27, var26, var27 + var28, var26 + var29);
                            var14.method3744(var27, var26);
                        }
                        class220.method3635(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method673()) {
                    var10.method2179();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class24 var30 = (class24) arg0;
            if (var30.field258) {
                return;
            }
            if (var30.field283 != -1 || var30.field260 != -1) {
                method3612(arg0, arg0.field655 + 15);
                if (field399 > -1) {
                    if (var30.field283 != -1) {
                        Statics.field849[var30.field283].method3744(field399 + arg2 - 12, field400 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field260 != -1) {
                        Statics.field2054[var30.field260].method3744(field399 + arg2 - 12, field400 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field312 == 10 && field314 == var8[arg1]) {
                method3612(arg0, arg0.field655 + 15);
                if (field399 > -1) {
                    Statics.field1659[1].method3744(field399 + arg2 - 12, field400 + arg3 - var9);
                }
            }
        } else {
            class200 var31 = ((class36) arg0).field760;
            if (var31.field3005 != null) {
                var31 = var31.method3373();
            }
            if (var31.field3022 >= 0 && var31.field3022 < Statics.field2054.length) {
                method3612(arg0, arg0.field655 + 15);
                if (field399 > -1) {
                    Statics.field2054[var31.field3022].method3744(field399 + arg2 - 12, field400 + arg3 - 30);
                }
            }
            if (field312 == 1 && field313 == field334[arg1 - var7] && field304 % 20 < 10) {
                method3612(arg0, arg0.field655 + 15);
                if (field399 > -1) {
                    Statics.field1659[0].method3744(field399 + arg2 - 12, field400 + arg3 - 28);
                }
            }
        }
        if (arg0.field618 != null && (arg1 >= var7 || !arg0.field620 && (field511 == 4 || !arg0.field626 && (field511 == 0 || field511 == 3 || field511 == 1 && method834(((class24) arg0).field259, false))))) {
            method3612(arg0, arg0.field655);
            if (field399 > -1 && field387 < field388) {
                field392[field387] = Statics.field188.method3518(arg0.field618) / 2;
                field342[field387] = Statics.field188.field3103;
                field339[field387] = field399;
                field390[field387] = field400;
                field393[field387] = arg0.field622;
                field394[field387] = arg0.field623;
                field395[field387] = arg0.field650;
                field396[field387] = arg0.field618;
                field387++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field627[var32];
            int var34 = arg0.field642[var32];
            class197 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field304) {
                    continue;
                }
                var35 = class197.method1772(arg0.field642[var32]);
                var36 = var35.field2883;
                if (var35 != null && var35.field2894 != null) {
                    var35 = var35.method3252();
                    if (var35 == null) {
                        arg0.field627[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field628[var32];
            class197 var38 = null;
            if (var37 >= 0) {
                var38 = class197.method1772(var37);
                if (var38 != null && var38.field2894 != null) {
                    var38 = var38.method3252();
                }
            }
            if (var33 - var36 <= field304) {
                if (var35 == null) {
                    arg0.field627[var32] = -1;
                } else {
                    method3612(arg0, arg0.field655 / 2);
                    if (field399 > -1) {
                        if (var32 == 1) {
                            field400 -= 20;
                        }
                        if (var32 == 2) {
                            field399 -= 15;
                            field400 -= 10;
                        }
                        if (var32 == 3) {
                            field399 += 15;
                            field400 -= 10;
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
                        class225 var64 = var35.method3253();
                        if (var64 != null) {
                            var43 = var64.field3210;
                            int var65 = var64.field3208;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3209;
                        }
                        class225 var66 = var35.method3254();
                        if (var66 != null) {
                            var44 = var66.field3210;
                            int var67 = var66.field3208;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3209;
                        }
                        class225 var68 = var35.method3255();
                        if (var68 != null) {
                            var45 = var68.field3210;
                            int var69 = var68.field3208;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3209;
                        }
                        class225 var70 = var35.method3256();
                        if (var70 != null) {
                            var46 = var70.field3210;
                            int var71 = var70.field3208;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3209;
                        }
                        if (var38 != null) {
                            var51 = var38.method3253();
                            if (var51 != null) {
                                var55 = var51.field3210;
                                int var72 = var51.field3208;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3209;
                            }
                            var52 = var38.method3254();
                            if (var52 != null) {
                                var56 = var52.field3210;
                                int var73 = var52.field3208;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3209;
                            }
                            var53 = var38.method3255();
                            if (var53 != null) {
                                var57 = var53.field3210;
                                int var74 = var53.field3208;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3209;
                            }
                            var54 = var38.method3256();
                            if (var54 != null) {
                                var58 = var54.field3210;
                                int var75 = var54.field3208;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3209;
                            }
                        }
                        class209 var76 = var35.method3270();
                        if (var76 == null) {
                            var76 = Statics.field1910;
                        }
                        class209 var77;
                        if (var38 == null) {
                            var77 = Statics.field1910;
                        } else {
                            var77 = var38.method3270();
                            if (var77 == null) {
                                var77 = Statics.field1910;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method3258(arg0.field619[var32]);
                        int var83 = var76.method3518(var82);
                        if (var38 != null) {
                            var79 = var38.method3258(arg0.field629[var32]);
                            var81 = var77.method3518(var79);
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
                        int var100 = arg0.field627[var32] - field304;
                        int var101 = var35.field2896 - var35.field2896 * var100 / var35.field2883;
                        int var102 = var35.field2889 * var100 / var35.field2883 + -var35.field2889;
                        int var103 = field399 + arg2 - (var92 >> 1) + var101;
                        int var104 = field400 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field2888 + var104 + 15;
                        int var108 = var107 - var76.field3108;
                        int var109 = var76.field3109 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field2888 + var104 + 15;
                            int var111 = var110 - var77.field3108;
                            int var112 = var77.field3109 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field2890 >= 0) {
                            var115 = (var100 << 8) / (var35.field2883 - var35.field2890);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method3750(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method3750(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method3750(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method3750(var93 + var103 - var50, var104, var115);
                            }
                            var76.method3524(var82, var90 + var103, var107, var35.field2882, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method3750(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method3750(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method3750(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method3750(var97 + var103 - var62, var104, var115);
                                }
                                var77.method3524(var79, var98 + var103, var110, var38.field2882, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method3744(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method3744(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method3744(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method3744(var93 + var103 - var50, var104);
                            }
                            var76.method3523(var82, var90 + var103, var107, var35.field2882 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method3744(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method3744(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method3744(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method3744(var97 + var103 - var62, var104);
                                }
                                var77.method3523(var79, var98 + var103, var110, var38.field2882 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aa.bm(IIIII)V")
    public static final void method631(int arg0, int arg1, int arg2, int arg3) {
        if (field391 == 1) {
            Statics.field251[field402 / 100].method3744(field541 - 8, field487 - 8);
        }
        if (field391 == 2) {
            Statics.field251[field402 / 100 + 4].method3744(field541 - 8, field487 - 8);
        }
        field384 = 0;
        int var4 = (Statics.field129.field609 >> 7) + Statics.field254;
        int var5 = (Statics.field129.field606 >> 7) + Statics.field1680;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field384 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field384 = 1;
        }
        if (field384 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field384 = 0;
        }
    }

    @ObfuscatedName("hv.bb(Lai;IB)V")
    public static final void method3612(class28 arg0, int arg1) {
        method30(arg0.field609, arg0.field606, arg1);
    }

    @ObfuscatedName("f.bl(IIIB)V")
    public static final void method30(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field399 = -1;
            field400 = -1;
            return;
        }
        int var3 = method224(arg0, arg1, Statics.field1853) - arg2;
        int var4 = arg0 - Statics.field135;
        int var5 = var3 - Statics.field113;
        int var6 = arg1 - Statics.field230;
        int var7 = class85.field1445[Statics.field156];
        int var8 = class85.field1454[Statics.field156];
        int var9 = class85.field1445[Statics.field1705];
        int var10 = class85.field1454[Statics.field1705];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field399 = field559 * var11 / var15 + field557 / 2;
            field400 = field559 * var14 / var15 + field306 / 2;
        } else {
            field399 = -1;
            field400 = -1;
        }
    }

    @ObfuscatedName("l.bp(IIII)I")
    public static final int method224(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class11.field112[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class11.field93[var5][var3][var4] + class11.field93[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class11.field93[var5][var3][var4 + 1] + class11.field93[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("de.bh(IIIIIII)V")
    public static final void method1974(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class85.field1445[var6];
            int var12 = class85.field1454[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class85.field1445[var7];
            int var15 = class85.field1454[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field135 = arg0 - var8;
        Statics.field113 = arg1 - var9;
        Statics.field230 = arg2 - var10;
        Statics.field156 = arg3;
        Statics.field1705 = arg4;
    }

    @ObfuscatedName("aa.bo(ZI)V")
    public static final void method625(boolean arg0) {
        field355 = arg0;
        if (!field355) {
            int var1 = field353.method2582();
            int var2 = field353.method2580();
            int var3 = field353.method2541();
            Statics.field956 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field956[var4][var5] = field353.method2550();
                }
            }
            Statics.field2014 = new int[var3];
            Statics.field1770 = new int[var3];
            Statics.field1760 = new int[var3];
            Statics.field1919 = new byte[var3][];
            Statics.field1195 = new byte[var3][];
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
                        Statics.field2014[var7] = var10;
                        Statics.field1770[var7] = Statics.field17.method3001("m" + var8 + "_" + var9);
                        Statics.field1760[var7] = Statics.field17.method3001("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method178(var2, var1);
            return;
        }
        int var11 = field353.method2541();
        int var12 = field353.method2581();
        int var13 = field353.method2541();
        field353.method2794();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field353.method2785(1);
                    if (var17 == 1) {
                        field549[var14][var15][var16] = field353.method2785(26);
                    } else {
                        field549[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field353.method2779();
        Statics.field956 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field956[var18][var19] = field353.method2550();
            }
        }
        Statics.field2014 = new int[var13];
        Statics.field1770 = new int[var13];
        Statics.field1760 = new int[var13];
        Statics.field1919 = new byte[var13][];
        Statics.field1195 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field549[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field2014[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field2014[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field1770[var20] = Statics.field17.method3001("m" + var29 + "_" + var30);
                            Statics.field1760[var20] = Statics.field17.method3001("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method178(var11, var12);
    }

    @ObfuscatedName("t.bx(III)V")
    public static final void method178(int arg0, int arg1) {
        if (Statics.field1302 == arg0 && Statics.field201 == arg1) {
            return;
        }
        Statics.field1302 = arg0;
        Statics.field201 = arg1;
        method1803(25);
        method703(class174.field2368, true);
        int var2 = Statics.field254;
        int var3 = Statics.field1680;
        Statics.field254 = (arg0 - 6) * 8;
        Statics.field1680 = (arg1 - 6) * 8;
        int var4 = Statics.field254 - var2;
        int var5 = Statics.field1680 - var3;
        int var6 = Statics.field254;
        int var7 = Statics.field1680;
        for (int var8 = 0; var8 < 32768; var8++) {
            class36 var9 = field492[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field663[var10] -= var4;
                    var9.field661[var10] -= var5;
                }
                var9.field609 -= var4 * 128;
                var9.field606 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class24 var12 = field414[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field663[var13] -= var4;
                    var12.field661[var13] -= var5;
                }
                var12.field609 -= var4 * 128;
                var12.field606 -= var5 * 128;
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
                        field424[var24][var20][var21] = field424[var24][var22][var23];
                    } else {
                        field424[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class26 var25 = (class26) field360.method2187(); var25 != null; var25 = (class26) field360.method2203()) {
            var25.field580 -= var4;
            var25.field584 -= var5;
            if (var25.field580 < 0 || var25.field584 < 0 || var25.field580 >= 104 || var25.field584 >= 104) {
                var25.method2179();
            }
        }
        if (field527 != 0) {
            field527 -= var4;
            field433 -= var5;
        }
        field506 = 0;
        field500 = false;
        field370 = -1;
        field427.method2181();
        field426.method2181();
        for (int var26 = 0; var26 < 4; var26++) {
            field354[var26].method2040();
        }
    }

    @ObfuscatedName("hb.bj(ZI)V")
    public static final void method3617(boolean arg0) {
        method813();
        field343++;
        if (field343 < 50 && !arg0) {
            return;
        }
        field343 = 0;
        if (field474 || Statics.field699 == null) {
            return;
        }
        field337.method2775(71);
        try {
            Statics.field699.method1902(field337.field2100, 0, field337.field2098);
            field337.field2098 = 0;
        } catch (IOException var2) {
            field474 = true;
        }
    }

    @ObfuscatedName("fg.bq(I)V")
    public static final void method2973() {
        method3617(false);
        field349 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1919.length; var1++) {
            if (Statics.field1770[var1] != -1 && Statics.field1919[var1] == null) {
                Statics.field1919[var1] = Statics.field17.method2986(Statics.field1770[var1], 0);
                if (Statics.field1919[var1] == null) {
                    var0 = false;
                    field349++;
                }
            }
            if (Statics.field1760[var1] != -1 && Statics.field1195[var1] == null) {
                Statics.field1195[var1] = Statics.field17.method2987(Statics.field1760[var1], 0, Statics.field956[var1]);
                if (Statics.field1195[var1] == null) {
                    var0 = false;
                    field349++;
                }
            }
        }
        if (!var0) {
            field529 = 1;
            return;
        }
        field351 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1919.length; var3++) {
            byte[] var4 = Statics.field1195[var3];
            if (var4 != null) {
                int var5 = (Statics.field2014[var3] >> 8) * 64 - Statics.field254;
                int var6 = (Statics.field2014[var3] & 0xFF) * 64 - Statics.field1680;
                if (field355) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class11.method709(var4, var5, var6);
            }
        }
        if (!var2) {
            field529 = 2;
            return;
        }
        if (field529 != 0) {
            method703(class174.field2368 + class38.field775 + class38.field778 + 100 + "%" + class38.field779, true);
        }
        method813();
        method2751();
        method813();
        Statics.field5.method1583();
        method813();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field354[var7].method2040();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class11.field112[var8][var9][var10] = 0;
                }
            }
        }
        method813();
        class11.method61();
        int var11 = Statics.field1919.length;
        class32.method97();
        method3617(true);
        if (!field355) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field2014[var12] >> 8) * 64 - Statics.field254;
                int var14 = (Statics.field2014[var12] & 0xFF) * 64 - Statics.field1680;
                byte[] var15 = Statics.field1919[var12];
                if (var15 != null) {
                    method813();
                    int var16 = Statics.field1302 * 8 - 48;
                    int var17 = Statics.field201 * 8 - 48;
                    class118[] var18 = field354;
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 64; var20++) {
                            for (int var21 = 0; var21 < 64; var21++) {
                                if (var13 + var20 > 0 && var13 + var20 < 103 && var14 + var21 > 0 && var14 + var21 < 103) {
                                    var18[var19].field1841[var13 + var20][var14 + var21] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class154 var22 = new class154(var15);
                    for (int var23 = 0; var23 < 4; var23++) {
                        for (int var24 = 0; var24 < 64; var24++) {
                            for (int var25 = 0; var25 < 64; var25++) {
                                class11.method2255(var22, var23, var13 + var24, var14 + var25, var16, var17, 0);
                            }
                        }
                    }
                }
            }
            for (int var26 = 0; var26 < var11; var26++) {
                int var27 = (Statics.field2014[var26] >> 8) * 64 - Statics.field254;
                int var28 = (Statics.field2014[var26] & 0xFF) * 64 - Statics.field1680;
                byte[] var29 = Statics.field1919[var26];
                if (var29 == null && Statics.field201 < 800) {
                    method813();
                    class11.method775(var27, var28, 64, 64);
                }
            }
            method3617(true);
            for (int var30 = 0; var30 < var11; var30++) {
                byte[] var31 = Statics.field1195[var30];
                if (var31 != null) {
                    int var32 = (Statics.field2014[var30] >> 8) * 64 - Statics.field254;
                    int var33 = (Statics.field2014[var30] & 0xFF) * 64 - Statics.field1680;
                    method813();
                    class88 var34 = Statics.field5;
                    class118[] var35 = field354;
                    class154 var36 = new class154(var31);
                    int var37 = -1;
                    while (true) {
                        int var38 = var36.method2558();
                        if (var38 == 0) {
                            break;
                        }
                        var37 += var38;
                        int var39 = 0;
                        while (true) {
                            int var40 = var36.method2558();
                            if (var40 == 0) {
                                break;
                            }
                            var39 += var40 - 1;
                            int var41 = var39 & 0x3F;
                            int var42 = var39 >> 6 & 0x3F;
                            int var43 = var39 >> 12;
                            int var44 = var36.method2545();
                            int var45 = var44 >> 2;
                            int var46 = var44 & 0x3;
                            int var47 = var32 + var42;
                            int var48 = var33 + var41;
                            if (var47 > 0 && var48 > 0 && var47 < 103 && var48 < 103) {
                                int var49 = var43;
                                if ((class11.field112[1][var47][var48] & 0x2) == 2) {
                                    var49 = var43 - 1;
                                }
                                class118 var50 = null;
                                if (var49 >= 0) {
                                    var50 = var35[var49];
                                }
                                class11.method1067(var43, var47, var48, var37, var46, var45, var34, var50);
                            }
                        }
                    }
                }
            }
        }
        if (field355) {
            for (int var51 = 0; var51 < 4; var51++) {
                method813();
                for (int var52 = 0; var52 < 13; var52++) {
                    for (int var53 = 0; var53 < 13; var53++) {
                        boolean var54 = false;
                        int var55 = field549[var51][var52][var53];
                        if (var55 != -1) {
                            int var56 = var55 >> 24 & 0x3;
                            int var57 = var55 >> 1 & 0x3;
                            int var58 = var55 >> 14 & 0x3FF;
                            int var59 = var55 >> 3 & 0x7FF;
                            int var60 = (var58 / 8 << 8) + var59 / 8;
                            for (int var61 = 0; var61 < Statics.field2014.length; var61++) {
                                if (Statics.field2014[var61] == var60 && Statics.field1919[var61] != null) {
                                    class11.method2793(Statics.field1919[var61], var51, var52 * 8, var53 * 8, var56, (var58 & 0x7) * 8, (var59 & 0x7) * 8, var57, field354);
                                    var54 = true;
                                    break;
                                }
                            }
                        }
                        if (!var54) {
                            int var62 = var51;
                            int var63 = var52 * 8;
                            int var64 = var53 * 8;
                            for (int var65 = 0; var65 < 8; var65++) {
                                for (int var66 = 0; var66 < 8; var66++) {
                                    class11.field93[var62][var63 + var65][var64 + var66] = 0;
                                }
                            }
                            if (var63 > 0) {
                                for (int var67 = 1; var67 < 8; var67++) {
                                    class11.field93[var62][var63][var64 + var67] = class11.field93[var62][var63 - 1][var64 + var67];
                                }
                            }
                            if (var64 > 0) {
                                for (int var68 = 1; var68 < 8; var68++) {
                                    class11.field93[var62][var63 + var68][var64] = class11.field93[var62][var63 + var68][var64 - 1];
                                }
                            }
                            if (var63 > 0 && class11.field93[var62][var63 - 1][var64] != 0) {
                                class11.field93[var62][var63][var64] = class11.field93[var62][var63 - 1][var64];
                            } else if (var64 > 0 && class11.field93[var62][var63][var64 - 1] != 0) {
                                class11.field93[var62][var63][var64] = class11.field93[var62][var63][var64 - 1];
                            } else if (var63 > 0 && var64 > 0 && class11.field93[var62][var63 - 1][var64 - 1] != 0) {
                                class11.field93[var62][var63][var64] = class11.field93[var62][var63 - 1][var64 - 1];
                            }
                        }
                    }
                }
            }
            for (int var69 = 0; var69 < 13; var69++) {
                for (int var70 = 0; var70 < 13; var70++) {
                    int var71 = field549[0][var69][var70];
                    if (var71 == -1) {
                        class11.method775(var69 * 8, var70 * 8, 8, 8);
                    }
                }
            }
            method3617(true);
            for (int var72 = 0; var72 < 4; var72++) {
                method813();
                for (int var73 = 0; var73 < 13; var73++) {
                    for (int var74 = 0; var74 < 13; var74++) {
                        int var75 = field549[var72][var73][var74];
                        if (var75 != -1) {
                            int var76 = var75 >> 24 & 0x3;
                            int var77 = var75 >> 1 & 0x3;
                            int var78 = var75 >> 14 & 0x3FF;
                            int var79 = var75 >> 3 & 0x7FF;
                            int var80 = (var78 / 8 << 8) + var79 / 8;
                            for (int var81 = 0; var81 < Statics.field2014.length; var81++) {
                                if (Statics.field2014[var81] == var80 && Statics.field1195[var81] != null) {
                                    class11.method1989(Statics.field1195[var81], var72, var73 * 8, var74 * 8, var76, (var78 & 0x7) * 8, (var79 & 0x7) * 8, var77, Statics.field5, field354);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method3617(true);
        method2751();
        method813();
        class11.method2269(Statics.field5, field354);
        method3617(true);
        int var82 = class11.field92;
        if (var82 > Statics.field1853) {
            var82 = Statics.field1853;
        }
        if (var82 < Statics.field1853 - 1) {
            int var83 = Statics.field1853 - 1;
        }
        if (field300) {
            Statics.field5.method1584(class11.field92);
        } else {
            Statics.field5.method1584(0);
        }
        for (int var84 = 0; var84 < 104; var84++) {
            for (int var85 = 0; var85 < 104; var85++) {
                method3365(var84, var85);
            }
        }
        method813();
        method11();
        class198.field2903.method2124();
        if (Statics.field1856 != null) {
            field337.method2775(56);
            field337.method2534(1057001181);
        }
        if (!field355) {
            int var86 = (Statics.field1302 - 6) / 8;
            int var87 = (Statics.field1302 + 6) / 8;
            int var88 = (Statics.field201 - 6) / 8;
            int var89 = (Statics.field201 + 6) / 8;
            for (int var90 = var86 - 1; var90 <= var87 + 1; var90++) {
                for (int var91 = var88 - 1; var91 <= var89 + 1; var91++) {
                    if (var90 < var86 || var90 > var87 || var91 < var88 || var91 > var89) {
                        Statics.field17.method2983("m" + var90 + "_" + var91);
                        Statics.field17.method2983("l" + var90 + "_" + var91);
                    }
                }
            }
        }
        method1803(30);
        method813();
        Statics.field966 = (byte[][][]) null;
        Statics.field95 = (byte[][][]) null;
        Statics.field229 = (byte[][][]) null;
        Statics.field96 = (byte[][][]) null;
        Statics.field2153 = (int[][][]) null;
        Statics.field2158 = (byte[][][]) null;
        Statics.field94 = (int[][]) null;
        Statics.field185 = null;
        Statics.field117 = null;
        Statics.field785 = null;
        Statics.field98 = null;
        Statics.field2350 = null;
        field337.method2775(179);
        Statics.field1655.method1775();
        for (int var92 = 0; var92 < 32; var92++) {
            field1779[var92] = 0L;
        }
        for (int var93 = 0; var93 < 32; var93++) {
            field1780[var93] = 0L;
        }
        Statics.field896 = 0;
    }

    @ObfuscatedName("ba.ba(II)V")
    public static final void method1083(int arg0) {
        int[] var1 = Statics.field1095.field3207;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class11.field112[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field5.method1598(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class11.field112[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field5.method1598(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1095.method3734();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class11.field112[arg0][var10][var9] & 0x18) == 0) {
                    method1912(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class11.field112[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method1912(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field332 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field5.method1593(Statics.field1853, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class198.method2454(var14).field2907;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field354[Statics.field1853].field1841;
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
                        field526[field332] = Statics.field2132[var15];
                        field524[field332] = var16;
                        field525[field332] = var17;
                        field332++;
                    }
                }
            }
        }
        Statics.field1059.method3695();
    }

    @ObfuscatedName("dm.bi(IIIIIB)V")
    public static final void method1912(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field5.method1609(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field5.method1655(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1095.field3207;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class198 var13 = class198.method2454(var12);
            if (var13.field2908 == -1) {
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
                class223 var14 = Statics.field2081[var13.field2908];
                if (var14 != null) {
                    int var15 = (var13.field2915 * 4 - var14.field3198) / 2;
                    int var16 = (var13.field2916 * 4 - var14.field3199) / 2;
                    var14.method3699(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field2916) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field5.method1611(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field5.method1655(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class198 var22 = class198.method2454(var21);
            if (var22.field2908 != -1) {
                class223 var23 = Statics.field2081[var22.field2908];
                if (var23 != null) {
                    int var24 = (var22.field2915 * 4 - var23.field3198) / 2;
                    int var25 = (var22.field2916 * 4 - var23.field3199) / 2;
                    var23.method3699(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field2916) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1095.field3207;
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
        int var29 = Statics.field5.method1593(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class198 var31 = class198.method2454(var30);
        if (var31.field2908 == -1) {
            return;
        }
        class223 var32 = Statics.field2081[var31.field2908];
        if (var32 != null) {
            int var33 = (var31.field2915 * 4 - var32.field3198) / 2;
            int var34 = (var31.field2916 * 4 - var32.field3199) / 2;
            var32.method3699(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field2916) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("fk.bc(I)Z")
    public static final boolean method2807() {
        if (Statics.field699 == null) {
            return false;
        }
        try {
            int var0 = Statics.field699.method1894();
            if (var0 == 0) {
                return false;
            }
            if (field338 == -1) {
                Statics.field699.method1892(field353.field2100, 0, 1);
                field353.field2098 = 0;
                field338 = field353.method2776();
                field340 = class213.field3140[field338];
                var0--;
            }
            if (field340 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field699.method1892(field353.field2100, 0, 1);
                field340 = field353.field2100[0] & 0xFF;
                var0--;
            }
            if (field340 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field699.method1892(field353.field2100, 0, 2);
                field353.field2098 = 0;
                field340 = field353.method2541();
                var0 -= 2;
            }
            if (var0 < field340) {
                return false;
            }
            field353.field2098 = 0;
            Statics.field699.method1892(field353.field2100, 0, field340);
            field518 = 0;
            field346 = field553;
            field553 = field481;
            field481 = field338;
            if (field338 == 159) {
                int var1 = field353.method2582();
                byte var2 = field353.method2657();
                class166.field2175[var1] = var2;
                if (class166.field2176[var1] != var2) {
                    class166.field2176[var1] = var2;
                }
                method27(var1);
                field478[++field479 - 1 & 0x1F] = var1;
                field338 = -1;
                return true;
            }
            if (field338 == 102) {
                class228.method137(field353, field340);
                field338 = -1;
                return true;
            }
            if (field338 == 212) {
                field486 = field359;
                if (field340 == 0) {
                    field520 = null;
                    field521 = null;
                    Statics.field2157 = 0;
                    Statics.field1037 = null;
                    field338 = -1;
                    return true;
                }
                field521 = field353.method2734();
                long var3 = field353.method2551();
                field520 = Statics.method3451(var3);
                Statics.field2047 = field353.method2657();
                int var5 = field353.method2545();
                if (var5 == 255) {
                    field338 = -1;
                    return true;
                }
                Statics.field2157 = var5;
                class25[] var6 = new class25[100];
                for (int var7 = 0; var7 < Statics.field2157; var7++) {
                    var6[var7] = new class25();
                    var6[var7].field291 = field353.method2734();
                    var6[var7].field285 = class205.method2254(var6[var7].field291, Statics.field16);
                    var6[var7].field286 = field353.method2541();
                    var6[var7].field287 = field353.method2657();
                    field353.method2734();
                    if (var6[var7].field291.equals(Statics.field129.field259)) {
                        Statics.field110 = var6[var7].field287;
                    }
                }
                boolean var8 = false;
                int var9 = Statics.field2157;
                while (var9 > 0) {
                    boolean var10 = true;
                    var9--;
                    for (int var11 = 0; var11 < var9; var11++) {
                        if (var6[var11].field285.compareTo(var6[var11 + 1].field285) > 0) {
                            class25 var12 = var6[var11];
                            var6[var11] = var6[var11 + 1];
                            var6[var11 + 1] = var12;
                            var10 = false;
                        }
                    }
                    if (var10) {
                        break;
                    }
                }
                Statics.field1037 = var6;
                field338 = -1;
                return true;
            }
            if (field338 == 189) {
                int var13 = field353.method2545();
                class217[] var14 = class217.method32();
                int var15 = 0;
                class217 var17;
                while (true) {
                    if (var15 >= var14.length) {
                        var17 = null;
                        break;
                    }
                    class217 var16 = var14[var15];
                    if (var16.field3169 == var13) {
                        var17 = var16;
                        break;
                    }
                    var15++;
                }
                Statics.field732 = var17;
                field338 = -1;
                return true;
            }
            if (field338 == 110) {
                int var18 = field353.method2580();
                int var19 = field353.method2550();
                class170 var20 = class170.method1882(var19);
                if (var20.field2233 != 1 || var20.field2252 != var18) {
                    var20.field2233 = 1;
                    var20.field2252 = var18;
                    method3468(var20);
                }
                field338 = -1;
                return true;
            }
            if (field338 == 220) {
                Statics.field588 = field353.method2574();
                Statics.field1925 = field353.method2738();
                field338 = -1;
                return true;
            }
            if (field338 == 137) {
                int var21 = field353.method2649();
                class170 var22 = class170.method1882(var21);
                var22.field2233 = 3;
                var22.field2252 = Statics.field129.field272.method2861();
                method3468(var22);
                field338 = -1;
                return true;
            }
            if (field338 == 12) {
                boolean var23 = field353.method2545() == 1;
                if (var23) {
                    Statics.field134 = Statics.method28() - field353.method2551();
                    Statics.field168 = new class2(field353, true);
                } else {
                    Statics.field168 = null;
                }
                field488 = field359;
                field338 = -1;
                return true;
            }
            if (field338 == 154) {
                while (field353.field2098 < field340) {
                    int var24 = field353.method2545();
                    boolean var25 = (var24 & 0x1) == 1;
                    String var26 = field353.method2734();
                    String var27 = field353.method2734();
                    field353.method2734();
                    for (int var28 = 0; var28 < field564; var28++) {
                        class20 var29 = field565[var28];
                        if (var25) {
                            if (var27.equals(var29.field228)) {
                                var29.field228 = var26;
                                var29.field222 = var27;
                                var26 = null;
                                break;
                            }
                        } else if (var26.equals(var29.field228)) {
                            var29.field228 = var26;
                            var29.field222 = var27;
                            var26 = null;
                            break;
                        }
                    }
                    if (var26 != null && field564 < 400) {
                        class20 var30 = new class20();
                        field565[field564] = var30;
                        var30.field228 = var26;
                        var30.field222 = var27;
                        field564++;
                    }
                }
                field485 = field359;
                field338 = -1;
                return true;
            }
            if (field338 == 199) {
                class30 var31 = new class30();
                var31.field686 = field353.method2734();
                var31.field682 = field353.method2541();
                int var32 = field353.method2550();
                var31.field684 = var32;
                method1803(45);
                Statics.field699.method1893();
                Statics.field699 = null;
                if (var31.method619() != field299) {
                    field299 = var31.method619();
                    boolean var33 = var31.method619();
                    if (Statics.field2989 != var33) {
                        class199.field2987.method2124();
                        class199.field2956.method2124();
                        class199.field2957.method2124();
                        Statics.field2989 = var33;
                    }
                }
                Statics.field2688 = var31.field686;
                field512 = var31.field682;
                field376 = var31.field684;
                Statics.field7 = field298 == 0 ? 43594 : var31.field682 + 40000;
                Statics.field2844 = field298 == 0 ? 443 : var31.field682 + 50000;
                Statics.field603 = Statics.field7;
                field338 = -1;
                return false;
            }
            if (field338 == 247) {
                int var34 = field353.method2581();
                if (var34 == 65535) {
                    var34 = -1;
                }
                int var35 = field353.method2582();
                if (var35 == 65535) {
                    var35 = -1;
                }
                int var36 = field353.method2563();
                int var37 = field353.method2649();
                for (int var38 = var35; var38 <= var34; var38++) {
                    long var39 = ((long) var36 << 32) + (long) var38;
                    class128 var41 = field341.method2131(var39);
                    if (var41 != null) {
                        var41.method2179();
                    }
                    field341.method2139(new class134(var37), var39);
                }
                field338 = -1;
                return true;
            }
            if (field338 == 71) {
                int var42 = field353.method2550();
                int var43 = field353.method2550();
                if (Statics.field1949 == null || !Statics.field1949.isValid()) {
                    try {
                        Iterator var44 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var44.hasNext()) {
                            GarbageCollectorMXBean var45 = (GarbageCollectorMXBean) var44.next();
                            if (var45.isValid()) {
                                Statics.field1949 = var45;
                                field425 = -1L;
                                field570 = -1L;
                            }
                        }
                    } catch (Throwable var344) {
                    }
                }
                long var47 = Statics.method28();
                int var49 = -1;
                if (Statics.field1949 != null) {
                    long var50 = Statics.field1949.getCollectionTime();
                    if (field570 != -1L) {
                        long var52 = var50 - field570;
                        long var54 = var47 - field425;
                        if (var54 != 0L) {
                            var49 = (int) (var52 * 100L / var54);
                        }
                    }
                    field570 = var50;
                    field425 = var47;
                }
                field337.method2775(50);
                field337.method2589(var42);
                field337.method2587(var43);
                field337.method2656(var49);
                field337.method2531(field1776);
                field338 = -1;
                return true;
            }
            if (field338 == 5) {
                field500 = true;
                Statics.field2172 = field353.method2545();
                Statics.field2706 = field353.method2545();
                Statics.field943 = field353.method2541();
                Statics.field70 = field353.method2545();
                Statics.field2736 = field353.method2545();
                if (Statics.field2736 >= 100) {
                    int var56 = Statics.field2172 * 128 + 64;
                    int var57 = Statics.field2706 * 128 + 64;
                    int var58 = method224(var56, var57, Statics.field1853) - Statics.field943;
                    int var59 = var56 - Statics.field135;
                    int var60 = var58 - Statics.field113;
                    int var61 = var57 - Statics.field230;
                    int var62 = (int) Math.sqrt((double) (var59 * var59 + var61 * var61));
                    Statics.field156 = (int) (Math.atan2((double) var60, (double) var62) * 325.949D) & 0x7FF;
                    Statics.field1705 = (int) (Math.atan2((double) var59, (double) var61) * -325.949D) & 0x7FF;
                    if (Statics.field156 < 128) {
                        Statics.field156 = 128;
                    }
                    if (Statics.field156 > 383) {
                        Statics.field156 = 383;
                    }
                }
                field338 = -1;
                return true;
            }
            if (field338 == 83) {
                String var63 = field353.method2734();
                Object[] var64 = new Object[var63.length() + 1];
                for (int var65 = var63.length() - 1; var65 >= 0; var65--) {
                    if (var63.charAt(var65) == 's') {
                        var64[var65 + 1] = field353.method2734();
                    } else {
                        var64[var65 + 1] = Integer.valueOf(field353.method2550());
                    }
                }
                var64[0] = Integer.valueOf(field353.method2550());
                class19 var66 = new class19();
                var66.field206 = var64;
                class33.method592(var66);
                field338 = -1;
                return true;
            }
            if (field338 == 80) {
                int var67 = field353.method2649();
                int var68 = field353.method2550();
                class18 var69 = (class18) field453.method2131((long) var68);
                class18 var70 = (class18) field453.method2131((long) var67);
                if (var70 != null) {
                    method1750(var70, var69 == null || var69.field196 != var70.field196);
                }
                if (var69 != null) {
                    var69.method2179();
                    field453.method2139(var69, (long) var67);
                }
                class170 var71 = class170.method1882(var68);
                if (var71 != null) {
                    method3468(var71);
                }
                class170 var72 = class170.method1882(var67);
                if (var72 != null) {
                    method3468(var72);
                    method15(Statics.field2334[var72.field2210 >>> 16], var72, true);
                }
                if (field452 != -1) {
                    method96(field452, 1);
                }
                field338 = -1;
                return true;
            }
            if (field338 == 10) {
                class46.field895 = 0;
                for (int var73 = 0; var73 < 2048; var73++) {
                    class46.field894[var73] = null;
                    class46.field893[var73] = 1;
                }
                for (int var74 = 0; var74 < 2048; var74++) {
                    field414[var74] = null;
                }
                class46.method1827(field353);
                field338 = -1;
                return true;
            }
            if (field338 == 119) {
                for (int var75 = 0; var75 < field414.length; var75++) {
                    if (field414[var75] != null) {
                        field414[var75].field631 = -1;
                    }
                }
                for (int var76 = 0; var76 < field492.length; var76++) {
                    if (field492[var76] != null) {
                        field492[var76].field631 = -1;
                    }
                }
                field338 = -1;
                return true;
            }
            if (field338 == 204) {
                int var77 = field353.method2581();
                if (var77 == 65535) {
                    var77 = -1;
                }
                method157(var77);
                field338 = -1;
                return true;
            }
            if (field338 == 134) {
                int var78 = field353.method2680();
                int var79 = field353.method2580();
                if (var79 == 65535) {
                    var79 = -1;
                }
                if (field530 != 0 && var79 != -1) {
                    class139.method1751(Statics.field326, var79, 0, field530, false);
                    field532 = true;
                }
                field338 = -1;
                return true;
            }
            if (field338 == 195) {
                field507 = 1;
                field485 = field359;
                field338 = -1;
                return true;
            }
            if (field338 == 78) {
                int var80 = field353.method2545();
                int var81 = field353.method2545();
                int var82 = field353.method2545();
                int var83 = field353.method2545();
                field542[var80] = true;
                field496[var80] = var81;
                field544[var80] = var82;
                field545[var80] = var83;
                field546[var80] = 0;
                field338 = -1;
                return true;
            }
            if (field338 == 227) {
                int var84 = field353.method2545();
                if (field353.method2545() == 0) {
                    field569[var84] = new class5();
                    field353.field2098 += 18;
                } else {
                    field353.field2098--;
                    field569[var84] = new class5(field353, false);
                }
                field428 = field359;
                field338 = -1;
                return true;
            }
            if (field338 == 216) {
                String var85 = field353.method2734();
                Statics.field2117 = var85;
                try {
                    String var86 = Statics.field3231.getParameter(class215.field3159.field3153);
                    String var87 = Statics.field3231.getParameter(class215.field3160.field3153);
                    String var88 = var86 + "settings=" + var85 + "; version=1; path=/; domain=" + var87;
                    String var89;
                    if (var85.length() == 0) {
                        var89 = var88 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        String var90 = var88 + "; Expires=";
                        long var91 = Statics.method28() + 94608000000L;
                        class163.field2159.setTime(new Date(var91));
                        int var93 = class163.field2159.get(7);
                        int var94 = class163.field2159.get(5);
                        int var95 = class163.field2159.get(2);
                        int var96 = class163.field2159.get(1);
                        int var97 = class163.field2159.get(11);
                        int var98 = class163.field2159.get(12);
                        int var99 = class163.field2159.get(13);
                        String var100 = class163.field2160[var93 - 1] + ", " + var94 / 10 + var94 % 10 + "-" + class163.field2161[0][var95] + "-" + var96 + " " + var97 / 10 + var97 % 10 + ":" + var98 / 10 + var98 % 10 + ":" + var99 / 10 + var99 % 10 + " GMT";
                        var89 = var90 + var100 + "; Max-Age=" + 94608000L;
                    }
                    class101.method1783(Statics.field3231, "document.cookie=\"" + var89 + "\"");
                } catch (Throwable var343) {
                }
                field338 = -1;
                return true;
            }
            if (field338 == 163) {
                int var102 = field353.method2583();
                int var103 = field353.method2584();
                int var104 = field353.method2550();
                class170 var105 = class170.method1882(var104);
                if (var105.field2219 != var102 || var105.field2220 != var103 || var105.field2215 != 0 || var105.field2216 != 0) {
                    var105.field2219 = var102;
                    var105.field2220 = var103;
                    var105.field2215 = 0;
                    var105.field2216 = 0;
                    method3468(var105);
                    method1797(var105);
                    if (var105.field2272 == 0) {
                        method15(Statics.field2334[var104 >> 16], var105, false);
                    }
                }
                field338 = -1;
                return true;
            }
            if (field338 == 245) {
                int var106 = field353.method2550();
                class18 var107 = (class18) field453.method2131((long) var106);
                if (var107 != null) {
                    method1750(var107, true);
                }
                if (field456 != null) {
                    method3468(field456);
                    field456 = null;
                }
                field338 = -1;
                return true;
            }
            if (field338 == 27) {
                field500 = true;
                Statics.field2794 = field353.method2545();
                Statics.field58 = field353.method2545();
                Statics.field1545 = field353.method2541();
                Statics.field60 = field353.method2545();
                Statics.field4 = field353.method2545();
                if (Statics.field4 >= 100) {
                    Statics.field135 = Statics.field2794 * 128 + 64;
                    Statics.field230 = Statics.field58 * 128 + 64;
                    Statics.field113 = method224(Statics.field135, Statics.field230, Statics.field1853) - Statics.field1545;
                }
                field338 = -1;
                return true;
            }
            if (field338 == 120) {
                int var108 = field340 + field353.field2098;
                int var109 = field353.method2541();
                int var110 = field353.method2541();
                if (field452 != var109) {
                    field452 = var109;
                    method756(false);
                    int var111 = field452;
                    if (class170.method1886(var111)) {
                        class170[] var112 = Statics.field2334[var111];
                        for (int var113 = 0; var113 < var112.length; var113++) {
                            class170 var114 = var112[var113];
                            if (var114 != null) {
                                var114.field2332 = 0;
                                var114.field2333 = 0;
                            }
                        }
                    }
                    class33.method2385(field452);
                    for (int var115 = 0; var115 < 100; var115++) {
                        field498[var115] = true;
                    }
                }
                while (var110-- > 0) {
                    int var116 = field353.method2550();
                    int var117 = field353.method2541();
                    int var118 = field353.method2545();
                    class18 var119 = (class18) field453.method2131((long) var116);
                    if (var119 != null && var119.field196 != var117) {
                        method1750(var119, true);
                        var119 = null;
                    }
                    if (var119 == null) {
                        class18 var120 = new class18();
                        var120.field196 = var117;
                        var120.field194 = var118;
                        field453.method2139(var120, (long) var116);
                        if (class170.method1886(var117)) {
                            class170[] var121 = Statics.field2334[var117];
                            for (int var122 = 0; var122 < var121.length; var122++) {
                                class170 var123 = var121[var122];
                                if (var123 != null) {
                                    var123.field2332 = 0;
                                    var123.field2333 = 0;
                                }
                            }
                        }
                        class170 var124 = class170.method1882(var116);
                        method3468(var124);
                        if (field456 != null) {
                            method3468(field456);
                            field456 = null;
                        }
                        method1069();
                        method15(Statics.field2334[var116 >> 16], var124, false);
                        class33.method2385(var117);
                        if (field452 != -1) {
                            method96(field452, 1);
                        }
                        var119 = var120;
                    }
                    var119.field195 = true;
                }
                for (class18 var126 = (class18) field453.method2140(); var126 != null; var126 = (class18) field453.method2134()) {
                    if (var126.field195) {
                        var126.field195 = false;
                    } else {
                        method1750(var126, true);
                    }
                }
                field341 = new class126(512);
                while (field353.field2098 < var108) {
                    int var127 = field353.method2550();
                    int var128 = field353.method2541();
                    int var129 = field353.method2541();
                    int var130 = field353.method2550();
                    for (int var131 = var128; var131 <= var129; var131++) {
                        long var132 = ((long) var127 << 32) + (long) var131;
                        field341.method2139(new class134(var130), var132);
                    }
                }
                field338 = -1;
                return true;
            }
            if (field338 == 166) {
                int var134 = field353.method2550();
                Statics.field1458 = Statics.field253.method1807(var134);
                field338 = -1;
                return true;
            }
            if (field338 == 217) {
                int var135 = field353.method2550();
                class170 var136 = class170.method1882(var135);
                for (int var137 = 0; var137 < var136.field2243.length; var137++) {
                    var136.field2243[var137] = -1;
                    var136.field2243[var137] = 0;
                }
                method3468(var136);
                field338 = -1;
                return true;
            }
            if (field338 == 135) {
                method3380();
                field477 = field353.method2672();
                field489 = field359;
                field338 = -1;
                return true;
            }
            if (field338 == 32) {
                int var138 = field353.method2558();
                boolean var139 = field353.method2545() == 1;
                String var140 = "";
                boolean var141 = false;
                if (var139) {
                    var140 = field353.method2734();
                    if (method2080(var140)) {
                        var141 = true;
                    }
                }
                String var142 = field353.method2734();
                if (!var141) {
                    class48.method221(var138, var140, var142);
                }
                field338 = -1;
                return true;
            }
            if (field338 == 186) {
                for (int var143 = 0; var143 < class166.field2176.length; var143++) {
                    if (class166.field2176[var143] != class166.field2175[var143]) {
                        class166.field2176[var143] = class166.field2175[var143];
                        method27(var143);
                        field478[++field479 - 1 & 0x1F] = var143;
                    }
                }
                field338 = -1;
                return true;
            }
            if (field338 == 191) {
                String var144 = field353.method2734();
                int var145 = field353.method2541();
                byte var146 = field353.method2657();
                boolean var147 = false;
                if (var146 == -128) {
                    var147 = true;
                }
                if (var147) {
                    if (Statics.field2157 == 0) {
                        field338 = -1;
                        return true;
                    }
                    boolean var148 = false;
                    int var149;
                    for (var149 = 0; var149 < Statics.field2157 && (!Statics.field1037[var149].field291.equals(var144) || Statics.field1037[var149].field286 != var145); var149++) {
                    }
                    if (var149 < Statics.field2157) {
                        while (var149 < Statics.field2157 - 1) {
                            Statics.field1037[var149] = Statics.field1037[var149 + 1];
                            var149++;
                        }
                        Statics.field2157--;
                        Statics.field1037[Statics.field2157] = null;
                    }
                } else {
                    field353.method2734();
                    class25 var150 = new class25();
                    var150.field291 = var144;
                    var150.field285 = class205.method2254(var150.field291, Statics.field16);
                    var150.field286 = var145;
                    var150.field287 = var146;
                    int var151;
                    for (var151 = Statics.field2157 - 1; var151 >= 0; var151--) {
                        int var152 = Statics.field1037[var151].field285.compareTo(var150.field285);
                        if (var152 == 0) {
                            Statics.field1037[var151].field286 = var145;
                            Statics.field1037[var151].field287 = var146;
                            if (var144.equals(Statics.field129.field259)) {
                                Statics.field110 = var146;
                            }
                            field486 = field359;
                            field338 = -1;
                            return true;
                        }
                        if (var152 < 0) {
                            break;
                        }
                    }
                    if (Statics.field2157 >= Statics.field1037.length) {
                        field338 = -1;
                        return true;
                    }
                    for (int var153 = Statics.field2157 - 1; var153 > var151; var153--) {
                        Statics.field1037[var153 + 1] = Statics.field1037[var153];
                    }
                    if (Statics.field2157 == 0) {
                        Statics.field1037 = new class25[100];
                    }
                    Statics.field1037[var151 + 1] = var150;
                    Statics.field2157++;
                    if (var144.equals(Statics.field129.field259)) {
                        Statics.field110 = var146;
                    }
                }
                field486 = field359;
                field338 = -1;
                return true;
            }
            if (field338 == 202) {
                String var154 = field353.method2734();
                long var155 = field353.method2551();
                long var157 = (long) field353.method2541();
                long var159 = (long) field353.method2549();
                class178 var161 = (class178) class149.method1293(class178.method92(), field353.method2545());
                long var162 = (var157 << 32) + var159;
                boolean var164 = false;
                for (int var165 = 0; var165 < 100; var165++) {
                    if (field514[var165] == var162) {
                        var164 = true;
                        break;
                    }
                }
                if (var161.field2678 && method2080(var154)) {
                    var164 = true;
                }
                if (!var164 && field384 == 0) {
                    field514[field454] = var162;
                    field454 = (field454 + 1) % 100;
                    class160 var166 = field353;
                    String var170;
                    try {
                        int var167 = var166.method2558();
                        if (var167 > 32767) {
                            var167 = 32767;
                        }
                        byte[] var168 = new byte[var167];
                        var166.field2098 += Statics.field3122.method2471(var166.field2100, var166.field2098, var168, 0, var167);
                        String var169 = class204.method153(var168, 0, var167);
                        var170 = var169;
                    } catch (Exception var342) {
                        var170 = "Cabbage";
                    }
                    String var173 = class210.method3522(class208.method2030(var170));
                    if (var161.field2676 == -1) {
                        class48.method3447(9, var154, var173, class206.method2449(var155));
                    } else {
                        int var174 = var161.field2676;
                        String var175 = "<img=" + var174 + ">";
                        class48.method3447(9, var175 + var154, var173, class206.method2449(var155));
                    }
                }
                field338 = -1;
                return true;
            }
            if (field338 == 127) {
                String var176 = field353.method2734();
                int var177 = field353.method2586();
                int var178 = field353.method2586();
                if (var178 >= 1 && var178 <= 8) {
                    if (var176.equalsIgnoreCase("null")) {
                        var176 = null;
                    }
                    field412[var178 - 1] = var176;
                    field438[var178 - 1] = var177 == 0;
                }
                field338 = -1;
                return true;
            }
            if (field338 == 193) {
                int var179 = field353.method2590();
                int var180 = field353.method2581();
                int var181 = var180 >> 10 & 0x1F;
                int var182 = var180 >> 5 & 0x1F;
                int var183 = var180 & 0x1F;
                int var184 = (var183 << 3) + (var181 << 19) + (var182 << 11);
                class170 var185 = class170.method1882(var179);
                if (var185.field2287 != var184) {
                    var185.field2287 = var184;
                    method3468(var185);
                }
                field338 = -1;
                return true;
            }
            if (field338 == 48) {
                method687();
                field338 = -1;
                return false;
            }
            if (field338 == 143) {
                int var186 = field353.method2541();
                int var187 = field353.method2563();
                class170 var188 = class170.method1882(var187);
                if (var188 != null && var188.field2272 == 0) {
                    if (var186 > var188.field2300 - var188.field2226) {
                        var186 = var188.field2300 - var188.field2226;
                    }
                    if (var186 < 0) {
                        var186 = 0;
                    }
                    if (var188.field2305 != var186) {
                        var188.field2305 = var186;
                        method3468(var188);
                    }
                }
                field338 = -1;
                return true;
            }
            if (field338 == 17) {
                method625(false);
                field353.method2776();
                int var189 = field353.method2541();
                class46.method823(field353, var189);
                field338 = -1;
                return true;
            }
            if (field338 == 96) {
                method625(true);
                field353.method2776();
                int var190 = field353.method2541();
                class46.method823(field353, var190);
                field338 = -1;
                return true;
            }
            if (field338 == 187) {
                int var191 = field353.method2581();
                class13.method1798(var191);
                field480[++field458 - 1 & 0x1F] = var191 & 0x7FFF;
                field338 = -1;
                return true;
            }
            if (field338 == 87) {
                field353.field2098 += 28;
                if (field353.method2568()) {
                    class160 var192 = field353;
                    int var193 = field353.field2098 - 28;
                    if (class105.field1685 != null) {
                        try {
                            class105.field1685.method1273(0L);
                            class105.field1685.method1275(var192.field2100, var193, 24);
                        } catch (Exception var341) {
                        }
                    }
                }
                field338 = -1;
                return true;
            }
            if (field338 == 60) {
                Statics.field588 = field353.method2738();
                Statics.field1925 = field353.method2738();
                for (int var195 = Statics.field588; var195 < Statics.field588 + 8; var195++) {
                    for (int var196 = Statics.field1925; var196 < Statics.field1925 + 8; var196++) {
                        if (field424[Statics.field1853][var195][var196] != null) {
                            field424[Statics.field1853][var195][var196] = null;
                            method3365(var195, var196);
                        }
                    }
                }
                for (class26 var197 = (class26) field360.method2187(); var197 != null; var197 = (class26) field360.method2203()) {
                    if (var197.field580 >= Statics.field588 && var197.field580 < Statics.field588 + 8 && var197.field584 >= Statics.field1925 && var197.field584 < Statics.field1925 + 8 && Statics.field1853 == var197.field585) {
                        var197.field589 = 0;
                    }
                }
                field338 = -1;
                return true;
            }
            if (field338 == 98) {
                int var198 = field353.method2583();
                int var199 = field353.method2550();
                class170 var200 = class170.method1882(var199);
                if (var200.field2257 != var198 || var198 == -1) {
                    var200.field2257 = var198;
                    var200.field2332 = 0;
                    var200.field2333 = 0;
                    method3468(var200);
                }
                field338 = -1;
                return true;
            }
            if (field338 == 88) {
                Statics.field1925 = field353.method2738();
                Statics.field588 = field353.method2574();
                while (field353.field2098 < field340) {
                    field338 = field353.method2545();
                    method1040();
                }
                field338 = -1;
                return true;
            }
            if (field338 == 103) {
                int var201 = field353.method2582();
                int var202 = field353.method2550();
                class170 var203 = class170.method1882(var202);
                if (var203.field2233 != 2 || var203.field2252 != var201) {
                    var203.field2233 = 2;
                    var203.field2252 = var201;
                    method3468(var203);
                }
                field338 = -1;
                return true;
            }
            if (field338 == 157) {
                field527 = field353.method2545();
                if (field527 == 255) {
                    field527 = 0;
                }
                field433 = field353.method2545();
                if (field433 == 255) {
                    field433 = 0;
                }
                field338 = -1;
                return true;
            }
            if (field338 == 14) {
                method3380();
                field457 = field353.method2545();
                field489 = field359;
                field338 = -1;
                return true;
            }
            if (field338 == 13) {
                int var204 = field353.method2550();
                int var205 = field353.method2541();
                if (var204 < -70000) {
                    var205 += 32768;
                }
                class170 var206;
                if (var204 >= 0) {
                    var206 = class170.method1882(var204);
                } else {
                    var206 = null;
                }
                if (var206 != null) {
                    for (int var207 = 0; var207 < var206.field2243.length; var207++) {
                        var206.field2243[var207] = 0;
                        var206.field2292[var207] = 0;
                    }
                }
                class13 var208 = (class13) class13.field126.method2131((long) var205);
                if (var208 != null) {
                    for (int var209 = 0; var209 < var208.field127.length; var209++) {
                        var208.field127[var209] = -1;
                        var208.field130[var209] = 0;
                    }
                }
                int var210 = field353.method2541();
                for (int var211 = 0; var211 < var210; var211++) {
                    int var212 = field353.method2581();
                    int var213 = field353.method2574();
                    if (var213 == 255) {
                        var213 = field353.method2649();
                    }
                    if (var206 != null && var211 < var206.field2243.length) {
                        var206.field2243[var211] = var212;
                        var206.field2292[var211] = var213;
                    }
                    int var214 = var212 - 1;
                    class13 var215 = (class13) class13.field126.method2131((long) var205);
                    if (var215 == null) {
                        var215 = new class13();
                        class13.field126.method2139(var215, (long) var205);
                    }
                    if (var215.field127.length <= var211) {
                        int[] var216 = new int[var211 + 1];
                        int[] var217 = new int[var211 + 1];
                        for (int var218 = 0; var218 < var215.field127.length; var218++) {
                            var216[var218] = var215.field127[var218];
                            var217[var218] = var215.field130[var218];
                        }
                        for (int var219 = var215.field127.length; var219 < var211; var219++) {
                            var216[var219] = -1;
                            var217[var219] = 0;
                        }
                        var215.field127 = var216;
                        var215.field130 = var217;
                    }
                    var215.field127[var211] = var214;
                    var215.field130[var211] = var213;
                }
                if (var206 != null) {
                    method3468(var206);
                }
                method3380();
                field480[++field458 - 1 & 0x1F] = var205 & 0x7FFF;
                field338 = -1;
                return true;
            }
            if (field338 == 30) {
                class46.method823(field353, field340);
                field338 = -1;
                return true;
            }
            if (field338 == 70) {
                method158(true);
                field338 = -1;
                return true;
            }
            if (field338 == 144) {
                int var220 = field353.method2580();
                int var221 = field353.method2563();
                int var222 = field353.method2582();
                class170 var223 = class170.method1882(var221);
                var223.field2313 = (var222 << 16) + var220;
                field338 = -1;
                return true;
            }
            if (field338 == 215) {
                method3380();
                int var224 = field353.method2586();
                int var225 = field353.method2574();
                int var226 = field353.method2590();
                field403[var225] = var226;
                field510[var225] = var224;
                field429[var225] = 1;
                for (int var227 = 0; var227 < 98; var227++) {
                    if (var226 >= class173.field2360[var227]) {
                        field429[var225] = var227 + 2;
                    }
                }
                field482[++field483 - 1 & 0x1F] = var225;
                field338 = -1;
                return true;
            }
            if (field338 == 82) {
                int var228 = field353.method2541();
                int var229 = field353.method2574();
                int var230 = field353.method2550();
                class18 var231 = (class18) field453.method2131((long) var230);
                if (var231 != null) {
                    method1750(var231, var231.field196 != var228);
                }
                class18 var232 = new class18();
                var232.field196 = var228;
                var232.field194 = var229;
                field453.method2139(var232, (long) var230);
                if (class170.method1886(var228)) {
                    class170[] var233 = Statics.field2334[var228];
                    for (int var234 = 0; var234 < var233.length; var234++) {
                        class170 var235 = var233[var234];
                        if (var235 != null) {
                            var235.field2332 = 0;
                            var235.field2333 = 0;
                        }
                    }
                }
                class170 var236 = class170.method1882(var230);
                method3468(var236);
                if (field456 != null) {
                    method3468(field456);
                    field456 = null;
                }
                method1069();
                method15(Statics.field2334[var230 >> 16], var236, false);
                class33.method2385(var228);
                if (field452 != -1) {
                    method96(field452, 1);
                }
                field338 = -1;
                return true;
            }
            if (field338 == 229) {
                field535 = field353.method2581() * 30;
                field489 = field359;
                field338 = -1;
                return true;
            }
            if (field338 == 241) {
                int var237 = field353.method2550();
                int var238 = field353.method2582();
                class166.field2175[var238] = var237;
                if (class166.field2176[var238] != var237) {
                    class166.field2176[var238] = var237;
                }
                method27(var238);
                field478[++field479 - 1 & 0x1F] = var238;
                field338 = -1;
                return true;
            }
            if (field338 == 73) {
                String var239 = field353.method2734();
                int var240 = field353.method2563();
                class170 var241 = class170.method1882(var240);
                if (!var239.equals(var241.field2270)) {
                    var241.field2270 = var239;
                    method3468(var241);
                }
                field338 = -1;
                return true;
            }
            if (field338 == 54) {
                int var242 = field353.method2541();
                int var243 = field353.method2582();
                int var244 = field353.method2563();
                int var245 = field353.method2580();
                class170 var246 = class170.method1882(var244);
                if (var246.field2261 != var242 || var246.field2262 != var243 || var246.field2264 != var245) {
                    var246.field2261 = var242;
                    var246.field2262 = var243;
                    var246.field2264 = var245;
                    method3468(var246);
                }
                field338 = -1;
                return true;
            }
            if (field338 == 138) {
                field312 = field353.method2545();
                if (field312 == 1) {
                    field313 = field353.method2541();
                }
                if (field312 >= 2 && field312 <= 6) {
                    if (field312 == 2) {
                        field318 = 64;
                        field319 = 64;
                    }
                    if (field312 == 3) {
                        field318 = 0;
                        field319 = 64;
                    }
                    if (field312 == 4) {
                        field318 = 128;
                        field319 = 64;
                    }
                    if (field312 == 5) {
                        field318 = 64;
                        field319 = 0;
                    }
                    if (field312 == 6) {
                        field318 = 64;
                        field319 = 128;
                    }
                    field312 = 2;
                    field315 = field353.method2541();
                    field316 = field353.method2541();
                    field317 = field353.method2545();
                }
                if (field312 == 10) {
                    field314 = field353.method2541();
                }
                field338 = -1;
                return true;
            }
            if (field338 == 21 || field338 == 100 || field338 == 233 || field338 == 207 || field338 == 69 || field338 == 167 || field338 == 52 || field338 == 169 || field338 == 198 || field338 == 94) {
                method1040();
                field338 = -1;
                return true;
            }
            if (field338 == 20) {
                field511 = field353.method2545();
                field515 = field353.method2545();
                field338 = -1;
                return true;
            }
            if (field338 == 112) {
                field348 = field353.method2545();
                field338 = -1;
                return true;
            }
            if (field338 == 86) {
                int var247 = field353.method2563();
                boolean var248 = field353.method2586() == 1;
                class170 var249 = class170.method1882(var247);
                if (var249.field2230 != var248) {
                    var249.field2230 = var248;
                    method3468(var249);
                }
                field338 = -1;
                return true;
            }
            if (field338 == 246) {
                method158(false);
                field338 = -1;
                return true;
            }
            if (field338 == 145) {
                String var250 = field353.method2734();
                long var251 = (long) field353.method2541();
                long var253 = (long) field353.method2549();
                class178 var255 = (class178) class149.method1293(class178.method92(), field353.method2545());
                long var256 = (var251 << 32) + var253;
                boolean var258 = false;
                for (int var259 = 0; var259 < 100; var259++) {
                    if (field514[var259] == var256) {
                        var258 = true;
                        break;
                    }
                }
                if (method2080(var250)) {
                    var258 = true;
                }
                if (!var258 && field384 == 0) {
                    field514[field454] = var256;
                    field454 = (field454 + 1) % 100;
                    class160 var260 = field353;
                    String var264;
                    try {
                        int var261 = var260.method2558();
                        if (var261 > 32767) {
                            var261 = 32767;
                        }
                        byte[] var262 = new byte[var261];
                        var260.field2098 += Statics.field3122.method2471(var260.field2100, var260.field2098, var262, 0, var261);
                        String var263 = class204.method153(var262, 0, var261);
                        var264 = var263;
                    } catch (Exception var340) {
                        var264 = "Cabbage";
                    }
                    String var267 = class210.method3522(class208.method2030(var264));
                    byte var268;
                    if (var255.field2677) {
                        var268 = 7;
                    } else {
                        var268 = 3;
                    }
                    if (var255.field2676 == -1) {
                        class48.method221(var268, var250, var267);
                    } else {
                        int var270 = var255.field2676;
                        String var271 = "<img=" + var270 + ">";
                        class48.method221(var268, var271 + var250, var267);
                    }
                }
                field338 = -1;
                return true;
            }
            if (field338 == 139) {
                int var272 = field353.method2550();
                int var273 = field353.method2541();
                if (var272 < -70000) {
                    var273 += 32768;
                }
                class170 var274;
                if (var272 >= 0) {
                    var274 = class170.method1882(var272);
                } else {
                    var274 = null;
                }
                while (field353.field2098 < field340) {
                    int var275 = field353.method2558();
                    int var276 = field353.method2541();
                    int var277 = 0;
                    if (var276 != 0) {
                        var277 = field353.method2545();
                        if (var277 == 255) {
                            var277 = field353.method2550();
                        }
                    }
                    if (var274 != null && var275 >= 0 && var275 < var274.field2243.length) {
                        var274.field2243[var275] = var276;
                        var274.field2292[var275] = var277;
                    }
                    int var278 = var276 - 1;
                    class13 var279 = (class13) class13.field126.method2131((long) var273);
                    if (var279 == null) {
                        var279 = new class13();
                        class13.field126.method2139(var279, (long) var273);
                    }
                    if (var279.field127.length <= var275) {
                        int[] var280 = new int[var275 + 1];
                        int[] var281 = new int[var275 + 1];
                        for (int var282 = 0; var282 < var279.field127.length; var282++) {
                            var280[var282] = var279.field127[var282];
                            var281[var282] = var279.field130[var282];
                        }
                        for (int var283 = var279.field127.length; var283 < var275; var283++) {
                            var280[var283] = -1;
                            var281[var283] = 0;
                        }
                        var279.field127 = var280;
                        var279.field130 = var281;
                    }
                    var279.field127[var275] = var278;
                    var279.field130[var275] = var277;
                }
                if (var274 != null) {
                    method3468(var274);
                }
                method3380();
                field480[++field458 - 1 & 0x1F] = var273 & 0x7FFF;
                field338 = -1;
                return true;
            }
            if (field338 == 225) {
                field500 = false;
                for (int var284 = 0; var284 < 5; var284++) {
                    field542[var284] = false;
                }
                field338 = -1;
                return true;
            }
            if (field338 == 176) {
                int var285 = field353.method2541();
                int var286 = field353.method2545();
                int var287 = field353.method2541();
                method38(var285, var286, var287);
                field338 = -1;
                return true;
            }
            if (field338 == 92) {
                int var288 = field353.method2580();
                field452 = var288;
                method756(false);
                if (class170.method1886(var288)) {
                    class170[] var289 = Statics.field2334[var288];
                    for (int var290 = 0; var290 < var289.length; var290++) {
                        class170 var291 = var289[var290];
                        if (var291 != null) {
                            var291.field2332 = 0;
                            var291.field2333 = 0;
                        }
                    }
                }
                class33.method2385(field452);
                for (int var292 = 0; var292 < 100; var292++) {
                    field498[var292] = true;
                }
                field338 = -1;
                return true;
            }
            if (field338 == 11) {
                for (int var293 = 0; var293 < Statics.field2347; var293++) {
                    class188 var294 = (class188) class188.field2781.method2121((long) var293);
                    class188 var295;
                    if (var294 == null) {
                        byte[] var296 = Statics.field2778.method2986(16, var293);
                        class188 var297 = new class188();
                        if (var296 != null) {
                            var297.method3131(new class154(var296));
                        }
                        class188.field2781.method2123(var297, (long) var293);
                        var295 = var297;
                    } else {
                        var295 = var294;
                    }
                    if (var295 != null) {
                        class166.field2175[var293] = 0;
                        class166.field2176[var293] = 0;
                    }
                }
                method3380();
                field479 += 32;
                field338 = -1;
                return true;
            }
            if (field338 == 75) {
                String var299 = field353.method2734();
                class160 var300 = field353;
                String var304;
                try {
                    int var301 = var300.method2558();
                    if (var301 > 32767) {
                        var301 = 32767;
                    }
                    byte[] var302 = new byte[var301];
                    var300.field2098 += Statics.field3122.method2471(var300.field2100, var300.field2098, var302, 0, var301);
                    String var303 = class204.method153(var302, 0, var301);
                    var304 = var303;
                } catch (Exception var339) {
                    var304 = "Cabbage";
                }
                String var307 = class210.method3522(class208.method2030(var304));
                class48.method221(6, var299, var307);
                field338 = -1;
                return true;
            }
            if (field338 == 7) {
                if (field452 != -1) {
                    method96(field452, 0);
                }
                field338 = -1;
                return true;
            }
            if (field338 == 183) {
                int var308 = field353.method2590();
                int var309 = field353.method2563();
                int var310 = field353.method2581();
                if (var310 == 65535) {
                    var310 = -1;
                }
                class170 var311 = class170.method1882(var308);
                if (var311.field2209) {
                    var311.field2285 = var310;
                    var311.field2331 = var309;
                    class199 var313 = class199.method699(var310);
                    var311.field2261 = var313.field2967;
                    var311.field2262 = var313.field2962;
                    var311.field2263 = var313.field2969;
                    var311.field2298 = var313.field2985;
                    var311.field2260 = var313.field2968;
                    var311.field2264 = var313.field2966;
                    if (var313.field2990 == 1) {
                        var311.field2268 = 1;
                    } else {
                        var311.field2268 = 2;
                    }
                    if (var311.field2266 > 0) {
                        var311.field2264 = var311.field2264 * 32 / var311.field2266;
                    } else if (var311.field2245 > 0) {
                        var311.field2264 = var311.field2264 * 32 / var311.field2245;
                    }
                    method3468(var311);
                } else if (var310 == -1) {
                    var311.field2233 = 0;
                    field338 = -1;
                    return true;
                } else {
                    class199 var312 = class199.method699(var310);
                    var311.field2233 = 4;
                    var311.field2252 = var310;
                    var311.field2261 = var312.field2967;
                    var311.field2262 = var312.field2962;
                    var311.field2264 = var312.field2966 * 100 / var309;
                    method3468(var311);
                }
                field338 = -1;
                return true;
            }
            if (field338 == 35) {
                while (field353.field2098 < field340) {
                    boolean var314 = field353.method2545() == 1;
                    String var315 = field353.method2734();
                    String var316 = field353.method2734();
                    int var317 = field353.method2541();
                    int var318 = field353.method2545();
                    int var319 = field353.method2545();
                    boolean var320 = (var319 & 0x2) != 0;
                    boolean var321 = (var319 & 0x1) != 0;
                    if (var317 > 0) {
                        field353.method2734();
                        field353.method2545();
                        field353.method2550();
                    }
                    field353.method2734();
                    for (int var322 = 0; var322 < field472; var322++) {
                        class15 var323 = field470[var322];
                        if (var314) {
                            if (var316.equals(var323.field161)) {
                                var323.field161 = var315;
                                var323.field159 = var316;
                                var315 = null;
                                break;
                            }
                        } else if (var315.equals(var323.field161)) {
                            if (var323.field160 != var317) {
                                boolean var324 = true;
                                for (class17 var325 = (class17) field563.method2224(); var325 != null; var325 = (class17) field563.method2225()) {
                                    if (var325.field183.equals(var315)) {
                                        if (var317 != 0 && var325.field184 == 0) {
                                            var325.method2230();
                                            var324 = false;
                                        } else if (var317 == 0 && var325.field184 != 0) {
                                            var325.method2230();
                                            var324 = false;
                                        }
                                    }
                                }
                                if (var324) {
                                    field563.method2223(new class17(var315, var317));
                                }
                                var323.field160 = var317;
                            }
                            var323.field159 = var316;
                            var323.field164 = var318;
                            var323.field162 = var320;
                            var323.field167 = var321;
                            var315 = null;
                            break;
                        }
                    }
                    if (var315 != null && field472 < 400) {
                        class15 var326 = new class15();
                        field470[field472] = var326;
                        var326.field161 = var315;
                        var326.field159 = var316;
                        var326.field160 = var317;
                        var326.field164 = var318;
                        var326.field162 = var320;
                        var326.field167 = var321;
                        field472++;
                    }
                }
                field507 = 2;
                field485 = field359;
                boolean var327 = false;
                int var328 = field472;
                while (var328 > 0) {
                    boolean var329 = true;
                    var328--;
                    for (int var330 = 0; var330 < var328; var330++) {
                        boolean var331 = false;
                        class15 var332 = field470[var330];
                        class15 var333 = field470[var330 + 1];
                        if (field512 != var332.field160 && field512 == var333.field160) {
                            var331 = true;
                        }
                        if (!var331 && var332.field160 == 0 && var333.field160 != 0) {
                            var331 = true;
                        }
                        if (!var331 && !var332.field162 && var333.field162) {
                            var331 = true;
                        }
                        if (!var331 && !var332.field167 && var333.field167) {
                            var331 = true;
                        }
                        if (var331) {
                            class15 var334 = field470[var330];
                            field470[var330] = field470[var330 + 1];
                            field470[var330 + 1] = var334;
                            var329 = false;
                        }
                    }
                    if (var329) {
                        break;
                    }
                }
                field338 = -1;
                return true;
            }
            class102.method690("" + field338 + class38.field782 + field553 + class38.field782 + field346 + class38.field782 + field340, (Throwable) null);
            method687();
        } catch (IOException var345) {
            method1855();
        } catch (Exception var346) {
            String var337 = "" + field338 + class38.field782 + field553 + class38.field782 + field346 + class38.field782 + field340 + class38.field782 + (Statics.field254 + Statics.field129.field663[0]) + class38.field782 + (Statics.field1680 + Statics.field129.field661[0]) + class38.field782;
            for (int var338 = 0; var338 < field340 && var338 < 50; var338++) {
                var337 = var337 + field353.field2100[var338] + class38.field782;
            }
            class102.method690(var337, var346);
            method687();
        }
        return true;
    }

    @ObfuscatedName("bh.by(I)V")
    public static final void method1040() {
        if (field338 == 52) {
            int var0 = field353.method2545();
            int var1 = (var0 >> 4 & 0x7) + Statics.field588;
            int var2 = (var0 & 0x7) + Statics.field1925;
            int var3 = field353.method2580();
            int var4 = field353.method2541();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class44 var5 = new class44();
                var5.field882 = var3;
                var5.field880 = var4;
                if (field424[Statics.field1853][var1][var2] == null) {
                    field424[Statics.field1853][var1][var2] = new class129();
                }
                field424[Statics.field1853][var1][var2].method2190(var5);
                method3365(var1, var2);
            }
        } else if (field338 == 169) {
            int var6 = field353.method2545();
            int var7 = var6 >> 2;
            int var8 = var6 & 0x3;
            int var9 = field357[var7];
            int var10 = field353.method2580();
            int var11 = field353.method2738();
            int var12 = (var11 >> 4 & 0x7) + Statics.field588;
            int var13 = (var11 & 0x7) + Statics.field1925;
            if (var12 >= 0 && var13 >= 0 && var12 < 103 && var13 < 103) {
                if (var9 == 0) {
                    class91 var14 = Statics.field5.method1605(Statics.field1853, var12, var13);
                    if (var14 != null) {
                        int var15 = var14.field1554 >> 14 & 0x7FFF;
                        if (var7 == 2) {
                            var14.field1552 = new class50(var15, 2, var8 + 4, Statics.field1853, var12, var13, var10, false, var14.field1552);
                            var14.field1553 = new class50(var15, 2, var8 + 1 & 0x3, Statics.field1853, var12, var13, var10, false, var14.field1553);
                        } else {
                            var14.field1552 = new class50(var15, var7, var8, Statics.field1853, var12, var13, var10, false, var14.field1552);
                        }
                    }
                }
                if (var9 == 1) {
                    class96 var16 = Statics.field5.method1606(Statics.field1853, var12, var13);
                    if (var16 != null) {
                        int var17 = var16.field1604 >> 14 & 0x7FFF;
                        if (var7 == 4 || var7 == 5) {
                            var16.field1602 = new class50(var17, 4, var8, Statics.field1853, var12, var13, var10, false, var16.field1602);
                        } else if (var7 == 6) {
                            var16.field1602 = new class50(var17, 4, var8 + 4, Statics.field1853, var12, var13, var10, false, var16.field1602);
                        } else if (var7 == 7) {
                            var16.field1602 = new class50(var17, 4, (var8 + 2 & 0x3) + 4, Statics.field1853, var12, var13, var10, false, var16.field1602);
                        } else if (var7 == 8) {
                            var16.field1602 = new class50(var17, 4, var8 + 4, Statics.field1853, var12, var13, var10, false, var16.field1602);
                            var16.field1595 = new class50(var17, 4, (var8 + 2 & 0x3) + 4, Statics.field1853, var12, var13, var10, false, var16.field1595);
                        }
                    }
                }
                if (var9 == 2) {
                    class97 var18 = Statics.field5.method1716(Statics.field1853, var12, var13);
                    if (var7 == 11) {
                        var7 = 10;
                    }
                    if (var18 != null) {
                        var18.field1616 = new class50(var18.field1618 >> 14 & 0x7FFF, var7, var8, Statics.field1853, var12, var13, var10, false, var18.field1616);
                    }
                }
                if (var9 == 3) {
                    class79 var19 = Statics.field5.method1608(Statics.field1853, var12, var13);
                    if (var19 != null) {
                        var19.field1295 = new class50(var19.field1292 >> 14 & 0x7FFF, 22, var8, Statics.field1853, var12, var13, var10, false, var19.field1295);
                    }
                }
            }
        } else {
            if (field338 == 233) {
                byte var20 = field353.method2575();
                int var21 = field353.method2580();
                byte var22 = field353.method2575();
                int var23 = field353.method2586();
                int var24 = var23 >> 2;
                int var25 = var23 & 0x3;
                int var26 = field357[var24];
                byte var27 = field353.method2657();
                int var28 = field353.method2580();
                int var29 = field353.method2586();
                int var30 = (var29 >> 4 & 0x7) + Statics.field588;
                int var31 = (var29 & 0x7) + Statics.field1925;
                int var32 = field353.method2541();
                byte var33 = field353.method2548();
                int var34 = field353.method2580();
                class24 var35;
                if (field415 == var28) {
                    var35 = Statics.field129;
                } else {
                    var35 = field414[var28];
                }
                if (var35 != null) {
                    class198 var36 = class198.method2454(var32);
                    int var37;
                    int var38;
                    if (var25 == 1 || var25 == 3) {
                        var37 = var36.field2916;
                        var38 = var36.field2915;
                    } else {
                        var37 = var36.field2915;
                        var38 = var36.field2916;
                    }
                    int var39 = (var37 >> 1) + var30;
                    int var40 = (var37 + 1 >> 1) + var30;
                    int var41 = (var38 >> 1) + var31;
                    int var42 = (var38 + 1 >> 1) + var31;
                    int[][] var43 = class11.field93[Statics.field1853];
                    int var44 = var43[var39][var41] + var43[var40][var41] + var43[var39][var42] + var43[var40][var42] >> 2;
                    int var45 = (var30 << 7) + (var37 << 6);
                    int var46 = (var31 << 7) + (var38 << 6);
                    class83 var47 = var36.method3285(var24, var25, var43, var45, var44, var46);
                    if (var47 != null) {
                        method2039(Statics.field1853, var30, var31, var26, -1, 0, 0, var34 + 1, var21 + 1);
                        var35.field265 = field304 + var34;
                        var35.field266 = field304 + var21;
                        var35.field273 = var47;
                        var35.field257 = var30 * 128 + var37 * 64;
                        var35.field269 = var31 * 128 + var38 * 64;
                        var35.field277 = var44;
                        if (var33 > var20) {
                            byte var48 = var33;
                            var33 = var20;
                            var20 = var48;
                        }
                        if (var27 > var22) {
                            byte var49 = var27;
                            var27 = var22;
                            var22 = var49;
                        }
                        var35.field276 = var30 + var33;
                        var35.field270 = var20 + var30;
                        var35.field264 = var27 + var31;
                        var35.field274 = var22 + var31;
                    }
                }
            }
            if (field338 == 198) {
                int var50 = field353.method2574();
                int var51 = (var50 >> 4 & 0x7) + Statics.field588;
                int var52 = (var50 & 0x7) + Statics.field1925;
                int var53 = field353.method2738();
                int var54 = var53 >> 2;
                int var55 = var53 & 0x3;
                int var56 = field357[var54];
                if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104) {
                    method2039(Statics.field1853, var51, var52, var56, -1, var54, var55, 0, -1);
                }
            } else if (field338 == 100) {
                int var57 = field353.method2545();
                int var58 = (var57 >> 4 & 0x7) + Statics.field588;
                int var59 = (var57 & 0x7) + Statics.field1925;
                int var60 = field353.method2541();
                int var61 = field353.method2541();
                int var62 = field353.method2541();
                if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                    class129 var63 = field424[Statics.field1853][var58][var59];
                    if (var63 != null) {
                        for (class44 var64 = (class44) var63.method2187(); var64 != null; var64 = (class44) var63.method2203()) {
                            if ((var60 & 0x7FFF) == var64.field882 && var64.field880 == var61) {
                                var64.field880 = var62;
                                break;
                            }
                        }
                        method3365(var58, var59);
                    }
                }
            } else if (field338 == 69) {
                int var65 = field353.method2545();
                int var66 = (var65 >> 4 & 0x7) + Statics.field588;
                int var67 = (var65 & 0x7) + Statics.field1925;
                int var68 = var66 + field353.method2657();
                int var69 = var67 + field353.method2657();
                int var70 = field353.method2672();
                int var71 = field353.method2541();
                int var72 = field353.method2545() * 4;
                int var73 = field353.method2545() * 4;
                int var74 = field353.method2541();
                int var75 = field353.method2541();
                int var76 = field353.method2545();
                int var77 = field353.method2545();
                if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104 && var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104 && var71 != 65535) {
                    int var78 = var66 * 128 + 64;
                    int var79 = var67 * 128 + 64;
                    int var80 = var68 * 128 + 64;
                    int var81 = var69 * 128 + 64;
                    class43 var82 = new class43(var71, Statics.field1853, var78, var79, method224(var78, var79, Statics.field1853) - var72, field304 + var74, field304 + var75, var76, var77, var70, var73);
                    var82.method748(var80, var81, method224(var80, var81, Statics.field1853) - var73, field304 + var74);
                    field426.method2190(var82);
                }
            } else if (field338 == 207) {
                int var83 = field353.method2545();
                int var84 = (var83 >> 4 & 0x7) + Statics.field588;
                int var85 = (var83 & 0x7) + Statics.field1925;
                int var86 = field353.method2541();
                int var87 = field353.method2545();
                int var88 = field353.method2541();
                if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104) {
                    int var89 = var84 * 128 + 64;
                    int var90 = var85 * 128 + 64;
                    class34 var91 = new class34(var86, Statics.field1853, var89, var90, method224(var89, var90, Statics.field1853) - var87, var88, field304);
                    field427.method2190(var91);
                }
            } else {
                if (field338 == 21) {
                    int var92 = field353.method2545();
                    int var93 = (var92 >> 4 & 0x7) + Statics.field588;
                    int var94 = (var92 & 0x7) + Statics.field1925;
                    int var95 = field353.method2541();
                    int var96 = field353.method2545();
                    int var97 = var96 >> 4 & 0xF;
                    int var98 = var96 & 0x7;
                    int var99 = field353.method2545();
                    if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
                        int var100 = var97 + 1;
                        if (Statics.field129.field663[0] >= var93 - var100 && Statics.field129.field663[0] <= var93 + var100 && Statics.field129.field661[0] >= var94 - var100 && Statics.field129.field661[0] <= var94 + var100 && field552 != 0 && var98 > 0 && field506 < 50) {
                            field566[field506] = var95;
                            field503[field506] = var98;
                            field538[field506] = var99;
                            field421[field506] = null;
                            field539[field506] = (var93 << 16) + (var94 << 8) + var97;
                            field506++;
                        }
                    }
                }
                if (field338 == 167) {
                    int var101 = field353.method2541();
                    int var102 = field353.method2574();
                    int var103 = (var102 >> 4 & 0x7) + Statics.field588;
                    int var104 = (var102 & 0x7) + Statics.field1925;
                    if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
                        class129 var105 = field424[Statics.field1853][var103][var104];
                        if (var105 != null) {
                            for (class44 var106 = (class44) var105.method2187(); var106 != null; var106 = (class44) var105.method2203()) {
                                if ((var101 & 0x7FFF) == var106.field882) {
                                    var106.method2179();
                                    break;
                                }
                            }
                            if (var105.method2187() == null) {
                                field424[Statics.field1853][var103][var104] = null;
                            }
                            method3365(var103, var104);
                        }
                    }
                } else if (field338 == 94) {
                    int var107 = field353.method2581();
                    int var108 = field353.method2738();
                    int var109 = (var108 >> 4 & 0x7) + Statics.field588;
                    int var110 = (var108 & 0x7) + Statics.field1925;
                    int var111 = field353.method2574();
                    int var112 = var111 >> 2;
                    int var113 = var111 & 0x3;
                    int var114 = field357[var112];
                    if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
                        method2039(Statics.field1853, var109, var110, var114, var107, var112, var113, 0, -1);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dg.bz(IIIIIIIIII)V")
    public static final void method2039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class26 var9 = null;
        for (class26 var10 = (class26) field360.method2187(); var10 != null; var10 = (class26) field360.method2203()) {
            if (var10.field585 == arg0 && var10.field580 == arg1 && var10.field584 == arg2 && var10.field579 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class26();
            var9.field585 = arg0;
            var9.field579 = arg3;
            var9.field580 = arg1;
            var9.field584 = arg2;
            method222(var9);
            field360.method2190(var9);
        }
        var9.field582 = arg4;
        var9.field593 = arg5;
        var9.field586 = arg6;
        var9.field587 = arg7;
        var9.field589 = arg8;
    }

    @ObfuscatedName("c.bg(I)V")
    public static final void method11() {
        for (class26 var0 = (class26) field360.method2187(); var0 != null; var0 = (class26) field360.method2203()) {
            if (var0.field589 == -1) {
                var0.field587 = 0;
                method222(var0);
            } else {
                var0.method2179();
            }
        }
    }

    @ObfuscatedName("y.br(Lv;I)V")
    public static final void method222(class26 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field579 == 0) {
            var1 = Statics.field5.method1609(arg0.field585, arg0.field580, arg0.field584);
        }
        if (arg0.field579 == 1) {
            var1 = Statics.field5.method1610(arg0.field585, arg0.field580, arg0.field584);
        }
        if (arg0.field579 == 2) {
            var1 = Statics.field5.method1611(arg0.field585, arg0.field580, arg0.field584);
        }
        if (arg0.field579 == 3) {
            var1 = Statics.field5.method1593(arg0.field585, arg0.field580, arg0.field584);
        }
        if (var1 != 0) {
            int var5 = Statics.field5.method1655(arg0.field585, arg0.field580, arg0.field584, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field581 = var2;
        arg0.field592 = var3;
        arg0.field583 = var4;
    }

    @ObfuscatedName("i.bf(IIIIIIIB)V")
    public static final void method160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field300 && Statics.field1853 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field5.method1609(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field5.method1610(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field5.method1611(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field5.method1593(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field5.method1655(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field5.method1600(arg0, arg2, arg3);
                class198 var15 = class198.method2454(var12);
                if (var15.field2917 != 0) {
                    field354[arg0].method2074(arg2, arg3, var13, var14, var15.field2934);
                }
            }
            if (arg1 == 1) {
                Statics.field5.method1597(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field5.method1602(arg0, arg2, arg3);
                class198 var16 = class198.method2454(var12);
                if (var16.field2915 + arg2 > 103 || var16.field2915 + arg3 > 103 || var16.field2916 + arg2 > 103 || var16.field2916 + arg3 > 103) {
                    return;
                }
                if (var16.field2917 != 0) {
                    field354[arg0].method2047(arg2, arg3, var16.field2915, var16.field2916, var14, var16.field2934);
                }
            }
            if (arg1 == 3) {
                Statics.field5.method1647(arg0, arg2, arg3);
                class198 var17 = class198.method2454(var12);
                if (var17.field2917 == 1) {
                    field354[arg0].method2043(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class11.field112[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class88 var19 = Statics.field5;
        class118 var20 = field354[arg0];
        class198 var21 = class198.method2454(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field2916;
            var23 = var21.field2915;
        } else {
            var22 = var21.field2915;
            var23 = var21.field2916;
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
        int[][] var28 = class11.field93[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field2911 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field2940 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class90 var34;
            if (var21.field2923 == -1 && var21.field2939 == null) {
                var34 = var21.method3285(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class50(arg4, 22, arg5, var18, arg2, arg3, var21.field2923, true, (class90) null);
            }
            var19.method1601(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field2917 == 1) {
                var20.method2041(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class90 var57;
            if (var21.field2923 == -1 && var21.field2939 == null) {
                var57 = var21.method3285(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class50(arg4, 10, arg5, var18, arg2, arg3, var21.field2923, true, (class90) null);
            }
            if (var57 != null) {
                var19.method1735(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field2917 != 0) {
                var20.method2042(arg2, arg3, var22, var23, var21.field2934);
            }
        } else if (arg6 >= 12) {
            class90 var35;
            if (var21.field2923 == -1 && var21.field2939 == null) {
                var35 = var21.method3285(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class50(arg4, arg6, arg5, var18, arg2, arg3, var21.field2923, true, (class90) null);
            }
            var19.method1735(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field2917 != 0) {
                var20.method2042(arg2, arg3, var22, var23, var21.field2934);
            }
        } else if (arg6 == 0) {
            class90 var36;
            if (var21.field2923 == -1 && var21.field2939 == null) {
                var36 = var21.method3285(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class50(arg4, 0, arg5, var18, arg2, arg3, var21.field2923, true, (class90) null);
            }
            var19.method1625(arg0, arg2, arg3, var29, var36, (class90) null, class11.field101[arg5], 0, var32, var33);
            if (var21.field2917 != 0) {
                var20.method2046(arg2, arg3, arg6, arg5, var21.field2934);
            }
        } else if (arg6 == 1) {
            class90 var37;
            if (var21.field2923 == -1 && var21.field2939 == null) {
                var37 = var21.method3285(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class50(arg4, 1, arg5, var18, arg2, arg3, var21.field2923, true, (class90) null);
            }
            var19.method1625(arg0, arg2, arg3, var29, var37, (class90) null, class11.field102[arg5], 0, var32, var33);
            if (var21.field2917 != 0) {
                var20.method2046(arg2, arg3, arg6, arg5, var21.field2934);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class90 var39;
            class90 var40;
            if (var21.field2923 == -1 && var21.field2939 == null) {
                var39 = var21.method3285(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method3285(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class50(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field2923, true, (class90) null);
                var40 = new class50(arg4, 2, var38, var18, arg2, arg3, var21.field2923, true, (class90) null);
            }
            var19.method1625(arg0, arg2, arg3, var29, var39, var40, class11.field101[arg5], class11.field101[var38], var32, var33);
            if (var21.field2917 != 0) {
                var20.method2046(arg2, arg3, arg6, arg5, var21.field2934);
            }
        } else if (arg6 == 3) {
            class90 var41;
            if (var21.field2923 == -1 && var21.field2939 == null) {
                var41 = var21.method3285(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class50(arg4, 3, arg5, var18, arg2, arg3, var21.field2923, true, (class90) null);
            }
            var19.method1625(arg0, arg2, arg3, var29, var41, (class90) null, class11.field102[arg5], 0, var32, var33);
            if (var21.field2917 != 0) {
                var20.method2046(arg2, arg3, arg6, arg5, var21.field2934);
            }
        } else if (arg6 == 9) {
            class90 var42;
            if (var21.field2923 == -1 && var21.field2939 == null) {
                var42 = var21.method3285(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class50(arg4, arg6, arg5, var18, arg2, arg3, var21.field2923, true, (class90) null);
            }
            var19.method1735(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field2917 != 0) {
                var20.method2042(arg2, arg3, var22, var23, var21.field2934);
            }
        } else if (arg6 == 4) {
            class90 var43;
            if (var21.field2923 == -1 && var21.field2939 == null) {
                var43 = var21.method3285(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class50(arg4, 4, arg5, var18, arg2, arg3, var21.field2923, true, (class90) null);
            }
            var19.method1592(arg0, arg2, arg3, var29, var43, (class90) null, class11.field101[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1609(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class198.method2454(var45 >> 14 & 0x7FFF).field2924;
            }
            class90 var46;
            if (var21.field2923 == -1 && var21.field2939 == null) {
                var46 = var21.method3285(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class50(arg4, 4, arg5, var18, arg2, arg3, var21.field2923, true, (class90) null);
            }
            var19.method1592(arg0, arg2, arg3, var29, var46, (class90) null, class11.field101[arg5], 0, class11.field103[arg5] * var44, class11.field104[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1609(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class198.method2454(var48 >> 14 & 0x7FFF).field2924 / 2;
            }
            class90 var49;
            if (var21.field2923 == -1 && var21.field2939 == null) {
                var49 = var21.method3285(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class50(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field2923, true, (class90) null);
            }
            var19.method1592(arg0, arg2, arg3, var29, var49, (class90) null, 256, arg5, class11.field105[arg5] * var47, class11.field99[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class90 var51;
            if (var21.field2923 == -1 && var21.field2939 == null) {
                var51 = var21.method3285(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class50(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field2923, true, (class90) null);
            }
            var19.method1592(arg0, arg2, arg3, var29, var51, (class90) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1609(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class198.method2454(var53 >> 14 & 0x7FFF).field2924 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class90 var55;
            class90 var56;
            if (var21.field2923 == -1 && var21.field2939 == null) {
                var55 = var21.method3285(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method3285(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class50(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field2923, true, (class90) null);
                var56 = new class50(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field2923, true, (class90) null);
            }
            var19.method1592(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class11.field105[arg5] * var52, class11.field99[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("gs.bk(IIB)V")
    public static final void method3365(int arg0, int arg1) {
        class129 var2 = field424[Statics.field1853][arg0][arg1];
        if (var2 == null) {
            Statics.field5.method1604(Statics.field1853, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class44 var5 = null;
        for (class44 var6 = (class44) var2.method2187(); var6 != null; var6 = (class44) var2.method2203()) {
            class199 var7 = class199.method699(var6.field882);
            long var8 = (long) var7.field2973;
            if (var7.field2990 == 1) {
                var8 = (long) (var6.field880 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field5.method1604(Statics.field1853, arg0, arg1);
            return;
        }
        var2.method2183(var5);
        class44 var10 = null;
        class44 var11 = null;
        for (class44 var12 = (class44) var2.method2187(); var12 != null; var12 = (class44) var2.method2203()) {
            if (var5.field882 != var12.field882) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field882 != var12.field882 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field5.method1726(Statics.field1853, arg0, arg1, method224(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1853), var5, var13, var10, var11);
    }

    @ObfuscatedName("o.bn(ZI)V")
    public static final void method158(boolean arg0) {
        field417 = 0;
        field335 = 0;
        field353.method2794();
        int var1 = field353.method2785(8);
        if (var1 < field333) {
            for (int var2 = var1; var2 < field333; var2++) {
                field522[++field417 - 1] = field334[var2];
            }
        }
        if (var1 > field333) {
            throw new RuntimeException("");
        }
        field333 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field334[var3];
            class36 var5 = field492[var4];
            int var6 = field353.method2785(1);
            if (var6 == 0) {
                field334[++field333 - 1] = var4;
                var5.field654 = field304;
            } else {
                int var7 = field353.method2785(2);
                if (var7 == 0) {
                    field334[++field333 - 1] = var4;
                    var5.field654 = field304;
                    field336[++field335 - 1] = var4;
                } else if (var7 == 1) {
                    field334[++field333 - 1] = var4;
                    var5.field654 = field304;
                    int var8 = field353.method2785(3);
                    var5.method691(var8, (byte) 1);
                    int var9 = field353.method2785(1);
                    if (var9 == 1) {
                        field336[++field335 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field334[++field333 - 1] = var4;
                    var5.field654 = field304;
                    int var10 = field353.method2785(3);
                    var5.method691(var10, (byte) 2);
                    int var11 = field353.method2785(3);
                    var5.method691(var11, (byte) 2);
                    int var12 = field353.method2785(1);
                    if (var12 == 1) {
                        field336[++field335 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field522[++field417 - 1] = var4;
                }
            }
        }
        method70(arg0);
        for (int var13 = 0; var13 < field335; var13++) {
            int var14 = field336[var13];
            class36 var15 = field492[var14];
            int var16 = field353.method2545();
            if ((var16 & 0x40) != 0) {
                int var17 = field353.method2582();
                int var18 = field353.method2582();
                int var19 = var15.field609 - (var17 - Statics.field254 - Statics.field254) * 64;
                int var20 = var15.field606 - (var18 - Statics.field1680 - Statics.field1680) * 64;
                if (var19 != 0 || var20 != 0) {
                    var15.field633 = (int) (Math.atan2((double) var19, (double) var20) * 325.949D) & 0x7FF;
                }
            }
            if ((var16 & 0x1) != 0) {
                var15.field618 = field353.method2734();
                var15.field650 = 100;
            }
            if ((var16 & 0x20) != 0) {
                var15.field645 = field353.method2580();
                if (var15.field645 == 65535) {
                    var15.field645 = -1;
                }
            }
            if ((var16 & 0x2) != 0) {
                var15.field613 = field353.method2580();
                int var21 = field353.method2649();
                var15.field632 = var21 >> 16;
                var15.field605 = (var21 & 0xFFFF) + field304;
                var15.field643 = 0;
                var15.field644 = 0;
                if (var15.field605 > field304) {
                    var15.field643 = -1;
                }
                if (var15.field613 == 65535) {
                    var15.field613 = -1;
                }
            }
            if ((var16 & 0x4) != 0) {
                int var22 = field353.method2545();
                if (var22 > 0) {
                    for (int var23 = 0; var23 < var22; var23++) {
                        int var24 = -1;
                        int var25 = -1;
                        int var26 = -1;
                        int var27 = field353.method2558();
                        if (var27 == 32767) {
                            var27 = field353.method2558();
                            var25 = field353.method2558();
                            var24 = field353.method2558();
                            var26 = field353.method2558();
                        } else if (var27 == 32766) {
                            var27 = -1;
                        } else {
                            var25 = field353.method2558();
                        }
                        int var28 = field353.method2558();
                        var15.method577(var27, var25, var24, var26, field304, var28);
                    }
                }
                int var29 = field353.method2545();
                if (var29 > 0) {
                    for (int var30 = 0; var30 < var29; var30++) {
                        int var31 = field353.method2558();
                        int var32 = field353.method2558();
                        if (var32 == 32767) {
                            var15.method580(var31);
                        } else {
                            int var33 = field353.method2558();
                            int var34 = field353.method2586();
                            int var35 = var32 > 0 ? field353.method2586() : var34;
                            var15.method578(var31, field304, var32, var33, var34, var35);
                        }
                    }
                }
            }
            if ((var16 & 0x8) != 0) {
                var15.field760 = Statics.method2743(field353.method2580());
                var15.field646 = var15.field760.field3011;
                var15.field647 = var15.field760.field3015;
                var15.field637 = var15.field760.field3017;
                var15.field614 = var15.field760.field3018;
                var15.field615 = var15.field760.field3019;
                var15.field616 = var15.field760.field3020;
                var15.field610 = var15.field760.field3014;
                var15.field611 = var15.field760.field3037;
                var15.field612 = var15.field760.field3034;
            }
            if ((var16 & 0x10) != 0) {
                int var36 = field353.method2582();
                if (var36 == 65535) {
                    var36 = -1;
                }
                int var37 = field353.method2545();
                if (var15.field631 == var36 && var36 != -1) {
                    int var38 = class202.method1914(var36).field3070;
                    if (var38 == 1) {
                        var15.field638 = 0;
                        var15.field639 = 0;
                        var15.field617 = var37;
                        var15.field641 = 0;
                    }
                    if (var38 == 2) {
                        var15.field641 = 0;
                    }
                } else if (var36 == -1 || var15.field631 == -1 || class202.method1914(var36).field3075 >= class202.method1914(var15.field631).field3075) {
                    var15.field631 = var36;
                    var15.field638 = 0;
                    var15.field639 = 0;
                    var15.field617 = var37;
                    var15.field641 = 0;
                    var15.field664 = var15.field659;
                }
            }
        }
        for (int var39 = 0; var39 < field417; var39++) {
            int var40 = field522[var39];
            if (field304 != field492[var40].field654) {
                field492[var40].field760 = null;
                field492[var40] = null;
            }
        }
        if (field340 != field353.field2098) {
            throw new RuntimeException(field353.field2098 + class38.field782 + field340);
        }
        for (int var41 = 0; var41 < field333; var41++) {
            if (field492[field334[var41]] == null) {
                throw new RuntimeException(var41 + class38.field782 + field333);
            }
        }
    }

    @ObfuscatedName("g.bu(ZI)V")
    public static final void method70(boolean arg0) {
        while (true) {
            if (field353.method2780(field340) >= 27) {
                int var1 = field353.method2785(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field492[var1] == null) {
                        field492[var1] = new class36();
                        var2 = true;
                    }
                    class36 var3 = field492[var1];
                    field334[++field333 - 1] = var1;
                    var3.field654 = field304;
                    var3.field760 = Statics.method2743(field353.method2785(14));
                    int var4 = field422[field353.method2785(3)];
                    if (var2) {
                        var3.field656 = var3.field624 = var4;
                    }
                    int var5 = field353.method2785(1);
                    int var6;
                    if (arg0) {
                        var6 = field353.method2785(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = field353.method2785(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    int var7;
                    if (arg0) {
                        var7 = field353.method2785(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = field353.method2785(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    int var8 = field353.method2785(1);
                    if (var8 == 1) {
                        field336[++field335 - 1] = var1;
                    }
                    var3.field646 = var3.field760.field3011;
                    var3.field647 = var3.field760.field3015;
                    if (var3.field647 == 0) {
                        var3.field624 = 0;
                    }
                    var3.field637 = var3.field760.field3017;
                    var3.field614 = var3.field760.field3018;
                    var3.field615 = var3.field760.field3019;
                    var3.field616 = var3.field760.field3020;
                    var3.field610 = var3.field760.field3014;
                    var3.field611 = var3.field760.field3037;
                    var3.field612 = var3.field760.field3034;
                    var3.method694(Statics.field129.field663[0] + var7, Statics.field129.field661[0] + var6, var5 == 1);
                    continue;
                }
            }
            field353.method2779();
            return;
        }
    }

    @ObfuscatedName("ce.bv(III)V")
    public static final void method1767(int arg0, int arg1) {
        if (field434 < 2 && field413 == 0 && !field447) {
            return;
        }
        String var2;
        if (field413 == 1 && field434 < 2) {
            var2 = class174.field2515 + class174.field2525 + field323 + " " + class38.field776;
        } else if (field447 && field434 < 2) {
            var2 = field450 + class174.field2525 + field451 + " " + class38.field776;
        } else {
            var2 = method39(field434 - 1);
        }
        if (field434 > 2) {
            var2 = var2 + class38.method575(16777215) + " " + '/' + " " + (field434 - 2) + class174.field2637;
        }
        Statics.field188.method3544(var2, arg0 + 4, arg1 + 15, 16777215, 0, field304 / 1000);
    }

    @ObfuscatedName("j.cg(IIIII)V")
    public static final void method151(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field405; var4++) {
            if (field543[var4] + field491[var4] > arg0 && field543[var4] < arg0 + arg2 && field504[var4] + field362[var4] > arg1 && field362[var4] < arg1 + arg3) {
                field295[var4] = true;
            }
        }
    }

    @ObfuscatedName("fw.cc(IIB)V")
    public static final void method2960(int arg0, int arg1) {
        int var2 = Statics.field188.method3518(class174.field2438);
        for (int var3 = 0; var3 < field434; var3++) {
            int var4 = Statics.field188.method3518(method39(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field434 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field187) {
            var6 = Statics.field187 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field908) {
            var7 = Statics.field908 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field432 = true;
        Statics.field484 = var6;
        Statics.field71 = var7;
        Statics.field54 = var2;
        Statics.field916 = field434 * 15 + 22;
    }

    @ObfuscatedName("ey.cb(Lay;III)V")
    public static final void method2527(class39 arg0, int arg1, int arg2) {
        method207(arg0.field792, arg0.field788, arg0.field789, arg0.field790, arg0.field791, arg0.field791, arg1, arg2);
    }

    @ObfuscatedName("y.cz(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method207(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 50) {
            class24 var8 = field414[arg3];
            if (var8 != null) {
                field541 = arg6;
                field487 = arg7;
                field391 = 2;
                field402 = 0;
                field527 = arg0;
                field433 = arg1;
                field337.method2775(25);
                field337.method2556(class106.field1710[82] ? 1 : 0);
                field337.method2579(arg3);
            }
        }
        if (arg2 == 1) {
            field541 = arg6;
            field487 = arg7;
            field391 = 2;
            field402 = 0;
            field527 = arg0;
            field433 = arg1;
            field337.method2775(52);
            field337.method2532(Statics.field801);
            field337.method2578(Statics.field254 + arg0);
            field337.method2577(Statics.field1680 + arg1);
            field337.method2532(arg3 >> 14 & 0x7FFF);
            field337.method2667(class106.field1710[82] ? 1 : 0);
            field337.method2589(Statics.field1735);
            field337.method2578(Statics.field1217);
        }
        if (arg2 == 42) {
            field337.method2775(196);
            field337.method2578(arg3);
            field337.method2577(arg0);
            field337.method2589(arg1);
            field445 = 0;
            Statics.field2346 = class170.method1882(arg1);
            field406 = arg0;
        }
        if (arg2 == 4) {
            field541 = arg6;
            field487 = arg7;
            field391 = 2;
            field402 = 0;
            field527 = arg0;
            field433 = arg1;
            field337.method2775(204);
            field337.method2532(Statics.field254 + arg0);
            field337.method2577(Statics.field1680 + arg1);
            field337.method2532(arg3 >> 14 & 0x7FFF);
            field337.method2531(class106.field1710[82] ? 1 : 0);
        }
        if (arg2 == 26) {
            method1745();
        }
        if (arg2 == 1004) {
            field541 = arg6;
            field487 = arg7;
            field391 = 2;
            field402 = 0;
            field337.method2775(173);
            field337.method2577(arg3);
        }
        if (arg2 == 14) {
            class24 var9 = field414[arg3];
            if (var9 != null) {
                field541 = arg6;
                field487 = arg7;
                field391 = 2;
                field402 = 0;
                field527 = arg0;
                field433 = arg1;
                field337.method2775(165);
                field337.method2532(Statics.field801);
                field337.method2532(Statics.field1217);
                field337.method2532(arg3);
                field337.method2589(Statics.field1735);
                field337.method2667(class106.field1710[82] ? 1 : 0);
            }
        }
        if (arg2 == 48) {
            class24 var10 = field414[arg3];
            if (var10 != null) {
                field541 = arg6;
                field487 = arg7;
                field391 = 2;
                field402 = 0;
                field527 = arg0;
                field433 = arg1;
                field337.method2775(119);
                field337.method2531(class106.field1710[82] ? 1 : 0);
                field337.method2578(arg3);
            }
        }
        if (arg2 == 1001) {
            field541 = arg6;
            field487 = arg7;
            field391 = 2;
            field402 = 0;
            field527 = arg0;
            field433 = arg1;
            field337.method2775(186);
            field337.method2579(Statics.field254 + arg0);
            field337.method2577(Statics.field1680 + arg1);
            field337.method2667(class106.field1710[82] ? 1 : 0);
            field337.method2579(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 51) {
            class24 var11 = field414[arg3];
            if (var11 != null) {
                field541 = arg6;
                field487 = arg7;
                field391 = 2;
                field402 = 0;
                field527 = arg0;
                field433 = arg1;
                field337.method2775(150);
                field337.method2656(class106.field1710[82] ? 1 : 0);
                field337.method2577(arg3);
            }
        }
        if (arg2 == 12) {
            class36 var12 = field492[arg3];
            if (var12 != null) {
                field541 = arg6;
                field487 = arg7;
                field391 = 2;
                field402 = 0;
                field527 = arg0;
                field433 = arg1;
                field337.method2775(49);
                field337.method2656(class106.field1710[82] ? 1 : 0);
                field337.method2578(arg3);
            }
        }
        if (arg2 == 6) {
            field541 = arg6;
            field487 = arg7;
            field391 = 2;
            field402 = 0;
            field527 = arg0;
            field433 = arg1;
            field337.method2775(215);
            field337.method2578(Statics.field1680 + arg1);
            field337.method2579(Statics.field254 + arg0);
            field337.method2531(class106.field1710[82] ? 1 : 0);
            field337.method2578(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 44) {
            class24 var13 = field414[arg3];
            if (var13 != null) {
                field541 = arg6;
                field487 = arg7;
                field391 = 2;
                field402 = 0;
                field527 = arg0;
                field433 = arg1;
                field337.method2775(252);
                field337.method2667(class106.field1710[82] ? 1 : 0);
                field337.method2578(arg3);
            }
        }
        if (arg2 == 1005) {
            class170 var14 = class170.method1882(arg1);
            if (var14 == null || var14.field2292[arg0] < 100000) {
                field337.method2775(173);
                field337.method2577(arg3);
            } else {
                class48.method221(27, "", var14.field2292[arg0] + " x " + class199.method699(arg3).field2961);
            }
            field445 = 0;
            Statics.field2346 = class170.method1882(arg1);
            field406 = arg0;
        }
        if (arg2 == 20) {
            field541 = arg6;
            field487 = arg7;
            field391 = 2;
            field402 = 0;
            field527 = arg0;
            field433 = arg1;
            field337.method2775(207);
            field337.method2578(Statics.field254 + arg0);
            field337.method2531(class106.field1710[82] ? 1 : 0);
            field337.method2532(Statics.field1680 + arg1);
            field337.method2532(arg3);
        }
        if (arg2 == 36) {
            field337.method2775(146);
            field337.method2587(arg1);
            field337.method2577(arg3);
            field337.method2579(arg0);
            field445 = 0;
            Statics.field2346 = class170.method1882(arg1);
            field406 = arg0;
        }
        if (arg2 == 32) {
            field337.method2775(167);
            field337.method2578(arg0);
            field337.method2577(field448);
            field337.method2589(Statics.field44);
            field337.method2595(arg1);
            field337.method2577(arg3);
            field445 = 0;
            Statics.field2346 = class170.method1882(arg1);
            field406 = arg0;
        }
        if (arg2 == 10) {
            class36 var15 = field492[arg3];
            if (var15 != null) {
                field541 = arg6;
                field487 = arg7;
                field391 = 2;
                field402 = 0;
                field527 = arg0;
                field433 = arg1;
                field337.method2775(136);
                field337.method2556(class106.field1710[82] ? 1 : 0);
                field337.method2578(arg3);
            }
        }
        if (arg2 == 8) {
            class36 var16 = field492[arg3];
            if (var16 != null) {
                field541 = arg6;
                field487 = arg7;
                field391 = 2;
                field402 = 0;
                field527 = arg0;
                field433 = arg1;
                field337.method2775(193);
                field337.method2577(field448);
                field337.method2595(Statics.field44);
                field337.method2556(class106.field1710[82] ? 1 : 0);
                field337.method2577(arg3);
            }
        }
        if (arg2 == 40) {
            field337.method2775(159);
            field337.method2534(arg1);
            field337.method2577(arg0);
            field337.method2579(arg3);
            field445 = 0;
            Statics.field2346 = class170.method1882(arg1);
            field406 = arg0;
        }
        if (arg2 == 37) {
            field337.method2775(172);
            field337.method2579(arg0);
            field337.method2534(arg1);
            field337.method2577(arg3);
            field445 = 0;
            Statics.field2346 = class170.method1882(arg1);
            field406 = arg0;
        }
        if (arg2 == 17) {
            field541 = arg6;
            field487 = arg7;
            field391 = 2;
            field402 = 0;
            field527 = arg0;
            field433 = arg1;
            field337.method2775(43);
            field337.method2532(field448);
            field337.method2587(Statics.field44);
            field337.method2577(arg3);
            field337.method2531(class106.field1710[82] ? 1 : 0);
            field337.method2532(Statics.field1680 + arg1);
            field337.method2578(Statics.field254 + arg0);
        }
        if (arg2 == 43) {
            field337.method2775(236);
            field337.method2534(arg1);
            field337.method2532(arg3);
            field337.method2532(arg0);
            field445 = 0;
            Statics.field2346 = class170.method1882(arg1);
            field406 = arg0;
        }
        if (arg2 == 1002) {
            field541 = arg6;
            field487 = arg7;
            field391 = 2;
            field402 = 0;
            field337.method2775(85);
            field337.method2578(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 3) {
            field541 = arg6;
            field487 = arg7;
            field391 = 2;
            field402 = 0;
            field527 = arg0;
            field433 = arg1;
            field337.method2775(218);
            field337.method2579(Statics.field1680 + arg1);
            field337.method2531(class106.field1710[82] ? 1 : 0);
            field337.method2532(Statics.field254 + arg0);
            field337.method2578(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 58) {
            class170 var17 = class170.method1922(arg1, arg0);
            if (var17 != null) {
                field337.method2775(233);
                field337.method2532(field448);
                field337.method2595(Statics.field44);
                field337.method2577(arg0);
                field337.method2532(field449);
                field337.method2579(var17.field2285);
                field337.method2534(arg1);
            }
        }
        if (arg2 == 19) {
            field541 = arg6;
            field487 = arg7;
            field391 = 2;
            field402 = 0;
            field527 = arg0;
            field433 = arg1;
            field337.method2775(171);
            field337.method2577(Statics.field1680 + arg1);
            field337.method2556(class106.field1710[82] ? 1 : 0);
            field337.method2577(Statics.field254 + arg0);
            field337.method2577(arg3);
        }
        if (arg2 == 39) {
            field337.method2775(74);
            field337.method2532(arg3);
            field337.method2532(arg0);
            field337.method2595(arg1);
            field445 = 0;
            Statics.field2346 = class170.method1882(arg1);
            field406 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class170 var18 = class170.method1922(arg1, arg0);
            if (var18 != null) {
                method1752(arg3, arg1, arg0, var18.field2285, arg5);
            }
        }
        if (arg2 == 38) {
            method78();
            class170 var19 = class170.method1882(arg1);
            field413 = 1;
            Statics.field1217 = arg0;
            Statics.field1735 = arg1;
            Statics.field801 = arg3;
            method3468(var19);
            field323 = class38.method575(16748608) + class199.method699(arg3).field2961 + class38.method575(16777215);
            if (field323 == null) {
                field323 = "null";
            }
            return;
        }
        if (arg2 == 23) {
            Statics.field5.method1620(Statics.field1853, arg0, arg1);
        }
        if (arg2 == 21) {
            field541 = arg6;
            field487 = arg7;
            field391 = 2;
            field402 = 0;
            field527 = arg0;
            field433 = arg1;
            field337.method2775(209);
            field337.method2667(class106.field1710[82] ? 1 : 0);
            field337.method2578(arg3);
            field337.method2532(Statics.field1680 + arg1);
            field337.method2578(Statics.field254 + arg0);
        }
        if (arg2 == 15) {
            class24 var20 = field414[arg3];
            if (var20 != null) {
                field541 = arg6;
                field487 = arg7;
                field391 = 2;
                field402 = 0;
                field527 = arg0;
                field433 = arg1;
                field337.method2775(53);
                field337.method2531(class106.field1710[82] ? 1 : 0);
                field337.method2577(field448);
                field337.method2534(Statics.field44);
                field337.method2578(arg3);
            }
        }
        if (arg2 == 13) {
            class36 var21 = field492[arg3];
            if (var21 != null) {
                field541 = arg6;
                field487 = arg7;
                field391 = 2;
                field402 = 0;
                field527 = arg0;
                field433 = arg1;
                field337.method2775(133);
                field337.method2667(class106.field1710[82] ? 1 : 0);
                field337.method2577(arg3);
            }
        }
        if (arg2 == 30 && field456 == null) {
            field337.method2775(115);
            field337.method2587(arg1);
            field337.method2532(arg0);
            field456 = class170.method1922(arg1, arg0);
            method3468(field456);
        }
        if (arg2 == 11) {
            class36 var22 = field492[arg3];
            if (var22 != null) {
                field541 = arg6;
                field487 = arg7;
                field391 = 2;
                field402 = 0;
                field527 = arg0;
                field433 = arg1;
                field337.method2775(127);
                field337.method2577(arg3);
                field337.method2556(class106.field1710[82] ? 1 : 0);
            }
        }
        if (arg2 == 46) {
            class24 var23 = field414[arg3];
            if (var23 != null) {
                field541 = arg6;
                field487 = arg7;
                field391 = 2;
                field402 = 0;
                field527 = arg0;
                field433 = arg1;
                field337.method2775(23);
                field337.method2577(arg3);
                field337.method2531(class106.field1710[82] ? 1 : 0);
            }
        }
        if (arg2 == 31) {
            field337.method2775(58);
            field337.method2587(arg1);
            field337.method2579(Statics.field1217);
            field337.method2595(Statics.field1735);
            field337.method2579(arg0);
            field337.method2578(Statics.field801);
            field337.method2579(arg3);
            field445 = 0;
            Statics.field2346 = class170.method1882(arg1);
            field406 = arg0;
        }
        if (arg2 == 33) {
            field337.method2775(163);
            field337.method2534(arg1);
            field337.method2578(arg0);
            field337.method2578(arg3);
            field445 = 0;
            Statics.field2346 = class170.method1882(arg1);
            field406 = arg0;
        }
        if (arg2 == 29) {
            field337.method2775(205);
            field337.method2534(arg1);
            class170 var24 = class170.method1882(arg1);
            if (var24.field2322 != null && var24.field2322[0][0] == 5) {
                int var25 = var24.field2322[0][1];
                if (class166.field2176[var25] != var24.field2311[0]) {
                    class166.field2176[var25] = var24.field2311[0];
                    method27(var25);
                }
            }
        }
        if (arg2 == 35) {
            field337.method2775(98);
            field337.method2577(arg3);
            field337.method2577(arg0);
            field337.method2534(arg1);
            field445 = 0;
            Statics.field2346 = class170.method1882(arg1);
            field406 = arg0;
        }
        if (arg2 == 45) {
            class24 var26 = field414[arg3];
            if (var26 != null) {
                field541 = arg6;
                field487 = arg7;
                field391 = 2;
                field402 = 0;
                field527 = arg0;
                field433 = arg1;
                field337.method2775(199);
                field337.method2532(arg3);
                field337.method2556(class106.field1710[82] ? 1 : 0);
            }
        }
        if (arg2 == 16) {
            field541 = arg6;
            field487 = arg7;
            field391 = 2;
            field402 = 0;
            field527 = arg0;
            field433 = arg1;
            field337.method2775(22);
            field337.method2532(Statics.field801);
            field337.method2532(Statics.field254 + arg0);
            field337.method2577(arg3);
            field337.method2587(Statics.field1735);
            field337.method2656(class106.field1710[82] ? 1 : 0);
            field337.method2578(Statics.field1680 + arg1);
            field337.method2532(Statics.field1217);
        }
        if (arg2 == 2) {
            field541 = arg6;
            field487 = arg7;
            field391 = 2;
            field402 = 0;
            field527 = arg0;
            field433 = arg1;
            field337.method2775(185);
            field337.method2532(field448);
            field337.method2656(class106.field1710[82] ? 1 : 0);
            field337.method2595(Statics.field44);
            field337.method2579(arg3 >> 14 & 0x7FFF);
            field337.method2577(Statics.field254 + arg0);
            field337.method2577(Statics.field1680 + arg1);
        }
        if (arg2 == 9) {
            class36 var27 = field492[arg3];
            if (var27 != null) {
                field541 = arg6;
                field487 = arg7;
                field391 = 2;
                field402 = 0;
                field527 = arg0;
                field433 = arg1;
                field337.method2775(87);
                field337.method2531(class106.field1710[82] ? 1 : 0);
                field337.method2577(arg3);
            }
        }
        if (arg2 == 22) {
            field541 = arg6;
            field487 = arg7;
            field391 = 2;
            field402 = 0;
            field527 = arg0;
            field433 = arg1;
            field337.method2775(230);
            field337.method2577(Statics.field254 + arg0);
            field337.method2578(arg3);
            field337.method2579(Statics.field1680 + arg1);
            field337.method2667(class106.field1710[82] ? 1 : 0);
        }
        if (arg2 == 47) {
            class24 var28 = field414[arg3];
            if (var28 != null) {
                field541 = arg6;
                field487 = arg7;
                field391 = 2;
                field402 = 0;
                field527 = arg0;
                field433 = arg1;
                field337.method2775(190);
                field337.method2577(arg3);
                field337.method2656(class106.field1710[82] ? 1 : 0);
            }
        }
        if (arg2 == 1003) {
            field541 = arg6;
            field487 = arg7;
            field391 = 2;
            field402 = 0;
            class36 var29 = field492[arg3];
            if (var29 != null) {
                class200 var30 = var29.field760;
                if (var30.field3005 != null) {
                    var30 = var30.method3373();
                }
                if (var30 != null) {
                    field337.method2775(2);
                    field337.method2578(var30.field3009);
                }
            }
        }
        if (arg2 == 34) {
            field337.method2775(29);
            field337.method2579(arg0);
            field337.method2589(arg1);
            field337.method2577(arg3);
            field445 = 0;
            Statics.field2346 = class170.method1882(arg1);
            field406 = arg0;
        }
        if (arg2 == 24) {
            class170 var31 = class170.method1882(arg1);
            boolean var32 = true;
            if (var31.field2214 > 0) {
                var32 = method225(var31);
            }
            if (var32) {
                field337.method2775(205);
                field337.method2534(arg1);
            }
        }
        if (arg2 == 49) {
            class24 var33 = field414[arg3];
            if (var33 != null) {
                field541 = arg6;
                field487 = arg7;
                field391 = 2;
                field402 = 0;
                field527 = arg0;
                field433 = arg1;
                field337.method2775(219);
                field337.method2531(class106.field1710[82] ? 1 : 0);
                field337.method2577(arg3);
            }
        }
        if (arg2 == 25) {
            class170 var34 = class170.method1922(arg1, arg0);
            if (var34 != null) {
                if (field447) {
                    class170 var35 = class170.method1922(Statics.field44, field448);
                    if (var35 != null && var35.field2302 != null) {
                        class19 var36 = new class19();
                        var36.field205 = var35;
                        var36.field206 = var35.field2302;
                        class33.method592(var36);
                    }
                    field447 = false;
                    method3468(var35);
                }
                int var37 = class171.method1762(method2959(var34));
                int var38 = var34.field2285;
                class170 var39 = class170.method1922(arg1, arg0);
                if (var39 != null && var39.field2301 != null) {
                    class19 var40 = new class19();
                    var40.field205 = var39;
                    var40.field206 = var39.field2301;
                    class33.method592(var40);
                }
                field449 = var38;
                field447 = true;
                Statics.field44 = arg1;
                field448 = arg0;
                Statics.field761 = var37;
                method3468(var39);
                field413 = 0;
                String var41;
                if (class171.method1762(method2959(var34)) == 0) {
                    var41 = null;
                } else if (var34.field2324 == null || var34.field2324.trim().length() == 0) {
                    var41 = null;
                } else {
                    var41 = var34.field2324;
                }
                field450 = var41;
                if (field450 == null) {
                    field450 = "Null";
                }
                if (var34.field2209) {
                    field451 = var34.field2304 + class38.method575(16777215);
                } else {
                    field451 = class38.method575(65280) + var34.field2326 + class38.method575(16777215);
                }
            }
            return;
        }
        if (arg2 == 18) {
            field541 = arg6;
            field487 = arg7;
            field391 = 2;
            field402 = 0;
            field527 = arg0;
            field433 = arg1;
            field337.method2775(86);
            field337.method2556(class106.field1710[82] ? 1 : 0);
            field337.method2579(Statics.field1680 + arg1);
            field337.method2579(Statics.field254 + arg0);
            field337.method2577(arg3);
        }
        if (arg2 == 7) {
            class36 var42 = field492[arg3];
            if (var42 != null) {
                field541 = arg6;
                field487 = arg7;
                field391 = 2;
                field402 = 0;
                field527 = arg0;
                field433 = arg1;
                field337.method2775(156);
                field337.method2667(class106.field1710[82] ? 1 : 0);
                field337.method2587(Statics.field1735);
                field337.method2578(Statics.field1217);
                field337.method2578(Statics.field801);
                field337.method2577(arg3);
            }
        }
        if (arg2 == 5) {
            field541 = arg6;
            field487 = arg7;
            field391 = 2;
            field402 = 0;
            field527 = arg0;
            field433 = arg1;
            field337.method2775(66);
            field337.method2656(class106.field1710[82] ? 1 : 0);
            field337.method2532(arg3 >> 14 & 0x7FFF);
            field337.method2532(Statics.field254 + arg0);
            field337.method2532(Statics.field1680 + arg1);
        }
        if (arg2 == 41) {
            field337.method2775(240);
            field337.method2589(arg1);
            field337.method2578(arg3);
            field337.method2577(arg0);
            field445 = 0;
            Statics.field2346 = class170.method1882(arg1);
            field406 = arg0;
        }
        if (arg2 == 28) {
            field337.method2775(205);
            field337.method2534(arg1);
            class170 var43 = class170.method1882(arg1);
            if (var43.field2322 != null && var43.field2322[0][0] == 5) {
                int var44 = var43.field2322[0][1];
                class166.field2176[var44] = 1 - class166.field2176[var44];
                method27(var44);
            }
        }
        if (field413 != 0) {
            field413 = 0;
            method3468(class170.method1882(Statics.field1735));
        }
        if (field447) {
            method78();
        }
        if (Statics.field2346 != null && field445 == 0) {
            method3468(Statics.field2346);
        }
    }

    @ObfuscatedName("k.ca(I)V")
    public static void method78() {
        if (!field447) {
            return;
        }
        class170 var0 = class170.method1922(Statics.field44, field448);
        if (var0 != null && var0.field2302 != null) {
            class19 var1 = new class19();
            var1.field205 = var0;
            var1.field206 = var0.field2302;
            class33.method592(var1);
        }
        field447 = false;
        method3468(var0);
    }

    @ObfuscatedName("cf.ch(IIIILjava/lang/String;I)V")
    public static void method1752(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class170 var5 = class170.method1922(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2310 != null) {
            class19 var6 = new class19();
            var6.field205 = var5;
            var6.field209 = arg0;
            var6.field203 = arg4;
            var6.field206 = var5.field2310;
            class33.method592(var6);
        }
        boolean var7 = true;
        if (var5.field2214 > 0) {
            var7 = method225(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method2959(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            field337.method2775(44);
            field337.method2534(arg1);
            field337.method2532(arg2);
            field337.method2532(arg3);
        }
        if (arg0 == 2) {
            field337.method2775(221);
            field337.method2534(arg1);
            field337.method2532(arg2);
            field337.method2532(arg3);
        }
        if (arg0 == 3) {
            field337.method2775(1);
            field337.method2534(arg1);
            field337.method2532(arg2);
            field337.method2532(arg3);
        }
        if (arg0 == 4) {
            field337.method2775(217);
            field337.method2534(arg1);
            field337.method2532(arg2);
            field337.method2532(arg3);
        }
        if (arg0 == 5) {
            field337.method2775(161);
            field337.method2534(arg1);
            field337.method2532(arg2);
            field337.method2532(arg3);
        }
        if (arg0 == 6) {
            field337.method2775(243);
            field337.method2534(arg1);
            field337.method2532(arg2);
            field337.method2532(arg3);
        }
        if (arg0 == 7) {
            field337.method2775(134);
            field337.method2534(arg1);
            field337.method2532(arg2);
            field337.method2532(arg3);
        }
        if (arg0 == 8) {
            field337.method2775(177);
            field337.method2534(arg1);
            field337.method2532(arg2);
            field337.method2532(arg3);
        }
        if (arg0 == 9) {
            field337.method2775(24);
            field337.method2534(arg1);
            field337.method2532(arg2);
            field337.method2532(arg3);
        }
        if (arg0 == 10) {
            field337.method2775(255);
            field337.method2534(arg1);
            field337.method2532(arg2);
            field337.method2532(arg3);
        }
    }

    @ObfuscatedName("fk.ct(I)V")
    public static final void method2806() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field434 - 1; var1++) {
                if (field437[var1] < 1000 && field437[var1 + 1] > 1000) {
                    String var2 = field440[var1];
                    field440[var1] = field440[var1 + 1];
                    field440[var1 + 1] = var2;
                    String var3 = field439[var1];
                    field439[var1] = field439[var1 + 1];
                    field439[var1 + 1] = var3;
                    int var4 = field437[var1];
                    field437[var1] = field437[var1 + 1];
                    field437[var1 + 1] = var4;
                    int var5 = field435[var1];
                    field435[var1] = field435[var1 + 1];
                    field435[var1 + 1] = var5;
                    int var6 = field401[var1];
                    field401[var1] = field401[var1 + 1];
                    field401[var1 + 1] = var6;
                    int var7 = field555[var1];
                    field555[var1] = field555[var1 + 1];
                    field555[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("hn.cn(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method3619(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field432 || field434 >= 500) {
            return;
        }
        field439[field434] = arg0;
        field440[field434] = arg1;
        field437[field434] = arg2;
        field555[field434] = arg3;
        field435[field434] = arg4;
        field401[field434] = arg5;
        field434++;
    }

    @ObfuscatedName("bj.cs(S)V")
    public static void method1069() {
        for (int var0 = 0; var0 < field434; var0++) {
            if (method383(field437[var0])) {
                if (var0 < field434 - 1) {
                    for (int var1 = var0; var1 < field434 - 1; var1++) {
                        field439[var1] = field439[var1 + 1];
                        field440[var1] = field440[var1 + 1];
                        field437[var1] = field437[var1 + 1];
                        field555[var1] = field555[var1 + 1];
                        field435[var1] = field435[var1 + 1];
                        field401[var1] = field401[var1 + 1];
                    }
                }
                field434--;
            }
        }
    }

    @ObfuscatedName("client.cv(II)Z")
    public static boolean method383(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("h.cm(IB)Ljava/lang/String;")
    public static String method39(int arg0) {
        return field440[arg0].length() > 0 ? field439[arg0] + class174.field2525 + field440[arg0] : field439[arg0];
    }

    @ObfuscatedName("fy.cf(Lga;IIII)V")
    public static final void method2964(class200 arg0, int arg1, int arg2, int arg3) {
        if (field434 >= 400) {
            return;
        }
        if (arg0.field3005 != null) {
            arg0 = arg0.method3373();
        }
        if (arg0 == null || !arg0.field3038 || arg0.field3040 && field460 != arg1) {
            return;
        }
        String var4 = arg0.field3010;
        if (arg0.field3027 != 0) {
            var4 = var4 + method1887(arg0.field3027, Statics.field129.field262) + " " + class38.field778 + class174.field2521 + arg0.field3027 + class38.field779;
        }
        if (field413 == 1) {
            method3619(class174.field2515, field323 + " " + class38.field776 + " " + class38.method575(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field447) {
            String[] var5 = arg0.field3025;
            if (field463) {
                var5 = method134(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class174.field2517)) {
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
                        method3619(var5[var6], class38.method575(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class174.field2517)) {
                        short var9 = 0;
                        if (field321 != class41.field807) {
                            if (field321 == class41.field804 || field321 == class41.field806 && arg0.field3027 > Statics.field129.field262) {
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
                            method3619(var5[var8], class38.method575(16776960) + var4, var10, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method3619(class174.field2466, class38.method575(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field761 & 0x2) == 2) {
            method3619(field450, field451 + " " + class38.field776 + " " + class38.method575(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("f.cq(Ly;IIII)V")
    public static final void method25(class24 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field129 == arg0 || field434 >= 400) {
            return;
        }
        String var4;
        if (arg0.field263 == 0) {
            var4 = arg0.field261[0] + arg0.field259 + arg0.field261[1] + method1887(arg0.field262, Statics.field129.field262) + " " + class38.field778 + class174.field2521 + arg0.field262 + class38.field779 + arg0.field261[2];
        } else {
            var4 = arg0.field261[0] + arg0.field259 + arg0.field261[1] + " " + class38.field778 + class174.field2522 + arg0.field263 + class38.field779 + arg0.field261[2];
        }
        if (field413 == 1) {
            method3619(class174.field2515, field323 + " " + class38.field776 + " " + class38.method575(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field447) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field412[var5] != null) {
                    short var6 = 0;
                    if (field412[var5].equalsIgnoreCase(class174.field2517)) {
                        if (field320 == class41.field807) {
                            continue;
                        }
                        if (field320 == class41.field804 || field320 == class41.field806 && arg0.field262 > Statics.field129.field262) {
                            var6 = 2000;
                        }
                        if (Statics.field129.field267 != 0 && arg0.field267 != 0) {
                            if (Statics.field129.field267 == arg0.field267) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field438[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field419[var5] + var6;
                    method3619(field412[var5], class38.method575(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field761 & 0x8) == 8) {
            method3619(field450, field451 + " " + class38.field776 + " " + class38.method575(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field434; var9++) {
            if (field437[var9] == 23) {
                field440[var9] = class38.method575(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("dp.cp(IIS)Ljava/lang/String;")
    public static final String method1887(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class38.method575(16711680);
        } else if (var2 < -6) {
            return class38.method575(16723968);
        } else if (var2 < -3) {
            return class38.method575(16740352);
        } else if (var2 < 0) {
            return class38.method575(16756736);
        } else if (var2 > 9) {
            return class38.method575(65280);
        } else if (var2 > 6) {
            return class38.method575(4259584);
        } else if (var2 > 3) {
            return class38.method575(8453888);
        } else if (var2 > 0) {
            return class38.method575(12648192);
        } else {
            return class38.method575(16776960);
        }
    }

    @ObfuscatedName("s.cj([Lfx;IIIIIIIII)V")
    public static final void method7(class170[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class220.method3635(arg2, arg3, arg4, arg5);
        class85.method1558();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class170 var10 = arg0[var9];
            if (var10 != null && (var10.field2229 == arg1 || arg1 == -1412584499 && field465 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field543[field405] = var10.field2223 + arg6;
                    field362[field405] = var10.field2224 + arg7;
                    field491[field405] = var10.field2225;
                    field504[field405] = var10.field2226;
                    var11 = ++field405 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2341 = var11;
                var10.field2288 = field304;
                if (!var10.field2209 || !method150(var10)) {
                    if (var10.field2214 > 0) {
                        method94(var10);
                    }
                    int var12 = var10.field2223 + arg6;
                    int var13 = var10.field2224 + arg7;
                    int var14 = var10.field2254;
                    if (field465 == var10) {
                        if (arg1 != -1412584499 && !var10.field2267) {
                            Statics.field1582 = arg0;
                            Statics.field1474 = arg6;
                            Statics.field9 = arg7;
                            continue;
                        }
                        if (field476 && field430) {
                            int var15 = class116.field1811;
                            int var16 = class116.field1804;
                            int var17 = var15 - field467;
                            int var18 = var16 - field468;
                            if (var17 < field409) {
                                var17 = field409;
                            }
                            if (var10.field2225 + var17 > field409 + field466.field2225) {
                                var17 = field409 + field466.field2225 - var10.field2225;
                            }
                            if (var18 < field311) {
                                var18 = field311;
                            }
                            if (var10.field2226 + var18 > field311 + field466.field2226) {
                                var18 = field311 + field466.field2226 - var10.field2226;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2267) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2272 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2272 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2225 + var12;
                        int var26 = var10.field2226 + var13;
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
                        int var29 = var10.field2225 + var12;
                        int var30 = var10.field2226 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2209 || var19 < var21 && var20 < var22) {
                        if (var10.field2214 != 0) {
                            if (var10.field2214 == 1336) {
                                if (field310) {
                                    var13 += 15;
                                    Statics.field235.method3561("Fps:" + field1776, var10.field2225 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field300) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field300) {
                                        var33 = 16711680;
                                    }
                                    Statics.field235.method3561("Mem:" + var32 + "k", var10.field2225 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2214 == 1337) {
                                field441 = var12;
                                field442 = var13;
                                method3163(var12, var13, var10.field2225, var10.field2226);
                                field498[var10.field2341] = true;
                                class220.method3635(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2214 == 1338) {
                                method174(var10, var12, var13, var11);
                                class220.method3635(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2214 == 1339) {
                                method2773(var10, var12, var13, var11);
                                class220.method3635(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2272 == 0) {
                            if (!var10.field2209 && method150(var10) && Statics.field3164 != var10) {
                                continue;
                            }
                            if (!var10.field2209) {
                                if (var10.field2305 > var10.field2300 - var10.field2226) {
                                    var10.field2305 = var10.field2300 - var10.field2226;
                                }
                                if (var10.field2305 < 0) {
                                    var10.field2305 = 0;
                                }
                            }
                            method7(arg0, var10.field2210, var19, var20, var21, var22, var12 - var10.field2231, var13 - var10.field2305, var11);
                            if (var10.field2237 != null) {
                                method7(var10.field2237, var10.field2210, var19, var20, var21, var22, var12 - var10.field2231, var13 - var10.field2305, var11);
                            }
                            class18 var34 = (class18) field453.method2131((long) var10.field2210);
                            if (var34 != null) {
                                int var35 = var34.field196;
                                if (class170.method1886(var35)) {
                                    Statics.field1582 = null;
                                    method7(Statics.field2334[var35], -1, var19, var20, var21, var22, var12, var13, var11);
                                    if (Statics.field1582 != null) {
                                        method7(Statics.field1582, -1412584499, var19, var20, var21, var22, Statics.field1474, Statics.field9, var11);
                                        Statics.field1582 = null;
                                    }
                                } else if (var11 == -1) {
                                    for (int var36 = 0; var36 < 100; var36++) {
                                        field498[var36] = true;
                                    }
                                } else {
                                    field498[var11] = true;
                                }
                            }
                            class220.method3635(arg2, arg3, arg4, arg5);
                            class85.method1558();
                        }
                        if (field436 || field562[var11] || field505 > 1) {
                            if (var10.field2272 == 0 && !var10.field2209 && var10.field2300 > var10.field2226) {
                                method759(var10.field2225 + var12, var13, var10.field2305, var10.field2226, var10.field2300);
                            }
                            if (var10.field2272 != 1) {
                                if (var10.field2272 == 2) {
                                    int var37 = 0;
                                    for (int var38 = 0; var38 < var10.field2222; var38++) {
                                        for (int var39 = 0; var39 < var10.field2245; var39++) {
                                            int var40 = (var10.field2276 + 32) * var39 + var12;
                                            int var41 = (var10.field2277 + 32) * var38 + var13;
                                            if (var37 < 20) {
                                                var40 += var10.field2278[var37];
                                                var41 += var10.field2279[var37];
                                            }
                                            if (var10.field2243[var37] > 0) {
                                                boolean var42 = false;
                                                boolean var43 = false;
                                                int var44 = var10.field2243[var37] - 1;
                                                if (var40 + 32 > arg2 && var40 < arg4 && var41 + 32 > arg3 && var41 < arg5 || Statics.field787 == var10 && field407 == var37) {
                                                    class225 var45;
                                                    if (field413 == 1 && Statics.field1217 == var37 && Statics.field1735 == var10.field2210) {
                                                        var45 = class199.method1347(var44, var10.field2292[var37], 2, 0, 2, false);
                                                    } else {
                                                        var45 = class199.method1347(var44, var10.field2292[var37], 1, 3153952, 2, false);
                                                    }
                                                    if (var45 == null) {
                                                        method3468(var10);
                                                    } else if (Statics.field787 == var10 && field407 == var37) {
                                                        int var46 = class116.field1811 - field408;
                                                        int var47 = class116.field1804 - field345;
                                                        if (var46 < 5 && var46 > -5) {
                                                            var46 = 0;
                                                        }
                                                        if (var47 < 5 && var47 > -5) {
                                                            var47 = 0;
                                                        }
                                                        if (field423 < 5) {
                                                            var46 = 0;
                                                            var47 = 0;
                                                        }
                                                        var45.method3750(var40 + var46, var41 + var47, 128);
                                                        if (arg1 != -1) {
                                                            class170 var48 = arg0[arg1 & 0xFFFF];
                                                            if (var41 + var47 < class220.field3178 && var48.field2305 > 0) {
                                                                int var49 = field534 * (class220.field3178 - var41 - var47) / 3;
                                                                if (var49 > field534 * 10) {
                                                                    var49 = field534 * 10;
                                                                }
                                                                if (var49 > var48.field2305) {
                                                                    var49 = var48.field2305;
                                                                }
                                                                var48.field2305 -= var49;
                                                                field345 += var49;
                                                                method3468(var48);
                                                            }
                                                            if (var41 + var47 + 32 > class220.field3179 && var48.field2305 < var48.field2300 - var48.field2226) {
                                                                int var50 = field534 * (var41 + var47 + 32 - class220.field3179) / 3;
                                                                if (var50 > field534 * 10) {
                                                                    var50 = field534 * 10;
                                                                }
                                                                if (var50 > var48.field2300 - var48.field2226 - var48.field2305) {
                                                                    var50 = var48.field2300 - var48.field2226 - var48.field2305;
                                                                }
                                                                var48.field2305 += var50;
                                                                field345 -= var50;
                                                                method3468(var48);
                                                            }
                                                        }
                                                    } else if (Statics.field2346 == var10 && field406 == var37) {
                                                        var45.method3750(var40, var41, 128);
                                                    } else {
                                                        var45.method3744(var40, var41);
                                                    }
                                                }
                                            } else if (var10.field2280 != null && var37 < 20) {
                                                class225 var51 = var10.method2935(var37);
                                                if (var51 != null) {
                                                    var51.method3744(var40, var41);
                                                } else if (class170.field2208) {
                                                    method3468(var10);
                                                }
                                            }
                                            var37++;
                                        }
                                    }
                                } else if (var10.field2272 == 3) {
                                    int var52;
                                    if (method79(var10)) {
                                        var52 = var10.field2236;
                                        if (Statics.field3164 == var10 && var10.field2238 != 0) {
                                            var52 = var10.field2238;
                                        }
                                    } else {
                                        var52 = var10.field2287;
                                        if (Statics.field3164 == var10 && var10.field2342 != 0) {
                                            var52 = var10.field2342;
                                        }
                                    }
                                    if (var10.field2239) {
                                        switch(var10.field2289.field3192) {
                                            case 1:
                                                class220.method3642(var12, var13, var10.field2225, var10.field2226, var10.field2287, var10.field2236, 256 - (var10.field2254 & 0xFF), 256 - (var10.field2242 & 0xFF));
                                                break;
                                            case 2:
                                                class220.method3643(var12, var13, var10.field2225, var10.field2226, var10.field2287, var10.field2236, 256 - (var10.field2254 & 0xFF), 256 - (var10.field2242 & 0xFF));
                                                break;
                                            case 3:
                                                class220.method3644(var12, var13, var10.field2225, var10.field2226, var10.field2287, var10.field2236, 256 - (var10.field2254 & 0xFF), 256 - (var10.field2242 & 0xFF));
                                                break;
                                            case 4:
                                                class220.method3645(var12, var13, var10.field2225, var10.field2226, var10.field2287, var10.field2236, 256 - (var10.field2254 & 0xFF), 256 - (var10.field2242 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class220.method3667(var12, var13, var10.field2225, var10.field2226, var52);
                                                } else {
                                                    class220.method3640(var12, var13, var10.field2225, var10.field2226, var52, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class220.method3654(var12, var13, var10.field2225, var10.field2226, var52);
                                    } else {
                                        class220.method3650(var12, var13, var10.field2225, var10.field2226, var52, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2272 == 4) {
                                    class209 var53 = var10.method2903();
                                    if (var53 != null) {
                                        String var54 = var10.field2270;
                                        int var55;
                                        if (method79(var10)) {
                                            var55 = var10.field2236;
                                            if (Statics.field3164 == var10 && var10.field2238 != 0) {
                                                var55 = var10.field2238;
                                            }
                                            if (var10.field2265.length() > 0) {
                                                var54 = var10.field2265;
                                            }
                                        } else {
                                            var55 = var10.field2287;
                                            if (Statics.field3164 == var10 && var10.field2342 != 0) {
                                                var55 = var10.field2342;
                                            }
                                        }
                                        if (var10.field2209 && var10.field2285 != -1) {
                                            class199 var56 = class199.method699(var10.field2285);
                                            var54 = var56.field2961;
                                            if (var54 == null) {
                                                var54 = "null";
                                            }
                                            if ((var56.field2990 == 1 || var10.field2331 != 1) && var10.field2331 != -1) {
                                                var54 = class38.method575(16748608) + var54 + class38.field777 + " " + 'x' + method182(var10.field2331);
                                            }
                                        }
                                        if (field456 == var10) {
                                            class174 var10000 = (class174) null;
                                            var54 = class174.field2523;
                                            var55 = var10.field2287;
                                        }
                                        if (!var10.field2209) {
                                            var54 = Statics.method185(var54, var10);
                                        }
                                        var53.method3527(var54, var12, var13, var10.field2225, var10.field2226, var55, var10.field2275 ? 0 : -1, var10.field2273, var10.field2274, var10.field2235);
                                    } else if (class170.field2208) {
                                        method3468(var10);
                                    }
                                } else if (var10.field2272 == 5) {
                                    if (var10.field2209) {
                                        class225 var58;
                                        if (var10.field2285 == -1) {
                                            var58 = var10.method2908(false);
                                        } else {
                                            var58 = class199.method1347(var10.field2285, var10.field2331, var10.field2218, var10.field2250, var10.field2268, false);
                                        }
                                        if (var58 != null) {
                                            int var59 = var58.field3206;
                                            int var60 = var58.field3212;
                                            if (var10.field2248) {
                                                class220.method3636(var12, var13, var10.field2225 + var12, var10.field2226 + var13);
                                                int var61 = (var10.field2225 + (var59 - 1)) / var59;
                                                int var62 = (var10.field2226 + (var60 - 1)) / var60;
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    for (int var64 = 0; var64 < var62; var64++) {
                                                        if (var10.field2247 != 0) {
                                                            var58.method3757(var59 / 2 + var59 * var63 + var12, var60 / 2 + var60 * var64 + var13, var10.field2247, 4096);
                                                        } else if (var14 == 0) {
                                                            var58.method3744(var59 * var63 + var12, var60 * var64 + var13);
                                                        } else {
                                                            var58.method3750(var59 * var63 + var12, var60 * var64 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class220.method3635(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var65 = var10.field2225 * 4096 / var59;
                                                if (var10.field2247 != 0) {
                                                    var58.method3757(var10.field2225 / 2 + var12, var10.field2226 / 2 + var13, var10.field2247, var65);
                                                } else if (var14 != 0) {
                                                    var58.method3732(var12, var13, var10.field2225, var10.field2226, 256 - (var14 & 0xFF));
                                                } else if (var10.field2225 == var59 && var10.field2226 == var60) {
                                                    var58.method3744(var12, var13);
                                                } else {
                                                    var58.method3746(var12, var13, var10.field2225, var10.field2226);
                                                }
                                            }
                                        } else if (class170.field2208) {
                                            method3468(var10);
                                        }
                                    } else {
                                        class225 var57 = var10.method2908(method79(var10));
                                        if (var57 != null) {
                                            var57.method3744(var12, var13);
                                        } else if (class170.field2208) {
                                            method3468(var10);
                                        }
                                    }
                                } else if (var10.field2272 == 6) {
                                    boolean var66 = method79(var10);
                                    int var67;
                                    if (var66) {
                                        var67 = var10.field2201;
                                    } else {
                                        var67 = var10.field2257;
                                    }
                                    class83 var68 = null;
                                    int var69 = 0;
                                    if (var10.field2285 != -1) {
                                        class199 var70 = class199.method699(var10.field2285);
                                        if (var70 != null) {
                                            class199 var71 = var70.method3350(var10.field2331);
                                            var68 = var71.method3364(1);
                                            if (var68 == null) {
                                                method3468(var10);
                                            } else {
                                                var68.method1443();
                                                var69 = var68.field1546 / 2;
                                            }
                                        }
                                    } else if (var10.field2233 == 5) {
                                        if (var10.field2252 == 0) {
                                            var68 = field471.method2858((class202) null, -1, (class202) null, -1);
                                        } else {
                                            var68 = Statics.field129.method195();
                                        }
                                    } else if (var67 == -1) {
                                        var68 = var10.method2911((class202) null, -1, var66, Statics.field129.field272);
                                        if (var68 == null && class170.field2208) {
                                            method3468(var10);
                                        }
                                    } else {
                                        class202 var72 = class202.method1914(var67);
                                        var68 = var10.method2911(var72, var10.field2332, var66, Statics.field129.field272);
                                        if (var68 == null && class170.field2208) {
                                            method3468(var10);
                                        }
                                    }
                                    class85.method1521(var10.field2225 / 2 + var12, var10.field2226 / 2 + var13);
                                    int var73 = var10.field2264 * class85.field1445[var10.field2261] >> 16;
                                    int var74 = var10.field2264 * class85.field1454[var10.field2261] >> 16;
                                    if (var68 != null) {
                                        if (var10.field2209) {
                                            var68.method1443();
                                            if (var10.field2269) {
                                                var68.method1460(0, var10.field2262, var10.field2263, var10.field2261, var10.field2298, var10.field2260 + var69 + var73, var10.field2260 + var74, var10.field2264);
                                            } else {
                                                var68.method1459(0, var10.field2262, var10.field2263, var10.field2261, var10.field2298, var10.field2260 + var69 + var73, var10.field2260 + var74);
                                            }
                                        } else {
                                            var68.method1459(0, var10.field2262, 0, var10.field2261, 0, var73, var74);
                                        }
                                    }
                                    class85.method1520();
                                } else {
                                    if (var10.field2272 == 7) {
                                        class209 var75 = var10.method2903();
                                        if (var75 == null) {
                                            if (class170.field2208) {
                                                method3468(var10);
                                            }
                                            continue;
                                        }
                                        int var76 = 0;
                                        for (int var77 = 0; var77 < var10.field2222; var77++) {
                                            for (int var78 = 0; var78 < var10.field2245; var78++) {
                                                if (var10.field2243[var76] > 0) {
                                                    class199 var79 = class199.method699(var10.field2243[var76] - 1);
                                                    String var80;
                                                    if (var79.field2990 != 1 && var10.field2292[var76] == 1) {
                                                        var80 = class38.method575(16748608) + var79.field2961 + class38.field777;
                                                    } else {
                                                        var80 = class38.method575(16748608) + var79.field2961 + class38.field777 + " " + 'x' + method182(var10.field2292[var76]);
                                                    }
                                                    int var81 = (var10.field2276 + 115) * var78 + var12;
                                                    int var82 = (var10.field2277 + 12) * var77 + var13;
                                                    if (var10.field2273 == 0) {
                                                        var75.method3523(var80, var81, var82, var10.field2287, var10.field2275 ? 0 : -1);
                                                    } else if (var10.field2273 == 1) {
                                                        var75.method3534(var80, var10.field2225 / 2 + var81, var82, var10.field2287, var10.field2275 ? 0 : -1);
                                                    } else {
                                                        var75.method3561(var80, var10.field2225 + var81 - 1, var82, var10.field2287, var10.field2275 ? 0 : -1);
                                                    }
                                                }
                                                var76++;
                                            }
                                        }
                                    }
                                    if (var10.field2272 == 8 && Statics.field131 == var10 && field444 == field443) {
                                        int var83 = 0;
                                        int var84 = 0;
                                        class209 var85 = Statics.field235;
                                        String var86 = var10.field2270;
                                        String var87 = Statics.method185(var86, var10);
                                        while (var87.length() > 0) {
                                            int var88 = var87.indexOf(class38.field775);
                                            String var89;
                                            if (var88 == -1) {
                                                var89 = var87;
                                                var87 = "";
                                            } else {
                                                var89 = var87.substring(0, var88);
                                                var87 = var87.substring(var88 + 4);
                                            }
                                            int var90 = var85.method3518(var89);
                                            if (var90 > var83) {
                                                var83 = var90;
                                            }
                                            var84 += var85.field3103 + 1;
                                        }
                                        var83 += 6;
                                        var84 += 7;
                                        int var91 = var10.field2225 + var12 - 5 - var83;
                                        int var92 = var10.field2226 + var13 + 5;
                                        if (var91 < var12 + 5) {
                                            var91 = var12 + 5;
                                        }
                                        if (var83 + var91 > arg4) {
                                            var91 = arg4 - var83;
                                        }
                                        if (var84 + var92 > arg5) {
                                            var92 = arg5 - var84;
                                        }
                                        class220.method3667(var91, var92, var83, var84, 16777120);
                                        class220.method3654(var91, var92, var83, var84, 0);
                                        String var93 = var10.field2270;
                                        int var94 = var85.field3103 + var92 + 2;
                                        String var95 = Statics.method185(var93, var10);
                                        while (var95.length() > 0) {
                                            int var96 = var95.indexOf(class38.field775);
                                            String var97;
                                            if (var96 == -1) {
                                                var97 = var95;
                                                var95 = "";
                                            } else {
                                                var97 = var95.substring(0, var96);
                                                var95 = var95.substring(var96 + 4);
                                            }
                                            var85.method3523(var97, var91 + 3, var94, 0, -1);
                                            var94 += var85.field3103 + 1;
                                        }
                                    }
                                    if (var10.field2272 == 9) {
                                        if (var10.field2299 == 1) {
                                            int var98;
                                            int var99;
                                            int var100;
                                            int var101;
                                            if (var10.field2244) {
                                                var98 = var12;
                                                var99 = var10.field2226 + var13;
                                                var100 = var10.field2225 + var12;
                                                var101 = var13;
                                            } else {
                                                var98 = var12;
                                                var99 = var13;
                                                var100 = var10.field2225 + var12;
                                                var101 = var10.field2226 + var13;
                                            }
                                            class220.method3639(var98, var99, var100, var101, var10.field2287);
                                        } else {
                                            int var102 = var10.field2225 >= 0 ? var10.field2225 : -var10.field2225;
                                            int var103 = var10.field2226 >= 0 ? var10.field2226 : -var10.field2226;
                                            int var104 = var102;
                                            if (var102 < var103) {
                                                var104 = var103;
                                            }
                                            if (var104 != 0) {
                                                int var105 = (var10.field2225 << 16) / var104;
                                                int var106 = (var10.field2226 << 16) / var104;
                                                if (var106 <= var105) {
                                                    var105 = -var105;
                                                } else {
                                                    var106 = -var106;
                                                }
                                                int var107 = var10.field2299 * var106 >> 17;
                                                int var108 = var10.field2299 * var106 + 1 >> 17;
                                                int var109 = var10.field2299 * var105 >> 17;
                                                int var110 = var10.field2299 * var105 + 1 >> 17;
                                                int var111 = var12 + var107;
                                                int var112 = var12 - var108;
                                                int var113 = var10.field2225 + var12 - var108;
                                                int var114 = var10.field2225 + var12 + var107;
                                                int var115 = var13 + var109;
                                                int var116 = var13 - var110;
                                                int var117 = var10.field2226 + var13 - var110;
                                                int var118 = var10.field2226 + var13 + var109;
                                                class85.method1526(var111, var112, var113);
                                                class85.method1562(var115, var116, var117, var111, var112, var113, var10.field2287);
                                                class85.method1526(var111, var113, var114);
                                                class85.method1562(var115, var117, var118, var111, var113, var114, var10.field2287);
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

    @ObfuscatedName("t.ce(II)Ljava/lang/String;")
    public static final String method182(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class38.field782 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class38.method575(65408) + var1.substring(0, var1.length() - 8) + class174.field2595 + " " + class38.field778 + var1 + class38.field779 + class38.field777;
        } else if (var1.length() > 6) {
            return " " + class38.method575(16777215) + var1.substring(0, var1.length() - 4) + class174.field2528 + " " + class38.field778 + var1 + class38.field779 + class38.field777;
        } else {
            return " " + class38.method575(16776960) + var1 + class38.field777;
        }
    }

    @ObfuscatedName("ap.cd(ZI)V")
    public static final void method756(boolean arg0) {
        method2082(field452, Statics.field187, Statics.field908, arg0);
    }

    @ObfuscatedName("ck.cu(Lfx;I)V")
    public static void method1797(class170 arg0) {
        class170 var1 = arg0.field2229 == -1 ? null : class170.method1882(arg0.field2229);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field187;
            var3 = Statics.field908;
        } else {
            var2 = var1.field2225;
            var3 = var1.field2226;
        }
        method1766(arg0, var2, var3, false);
        method100(arg0, var2, var3);
    }

    @ObfuscatedName("c.cw([Lfx;Lfx;ZI)V")
    public static void method15(class170[] arg0, class170 arg1, boolean arg2) {
        int var3 = arg1.field2330 == 0 ? arg1.field2225 : arg1.field2330;
        int var4 = arg1.field2300 == 0 ? arg1.field2226 : arg1.field2300;
        method743(arg0, arg1.field2210, var3, var4, arg2);
        if (arg1.field2237 != null) {
            method743(arg1.field2237, arg1.field2210, var3, var4, arg2);
        }
        class18 var5 = (class18) field453.method2131((long) arg1.field2210);
        if (var5 != null) {
            method2082(var5.field196, var3, var4, arg2);
        }
        if (arg1.field2214 == 1337) {
        }
    }

    @ObfuscatedName("dv.cr(IIIZB)V")
    public static final void method2082(int arg0, int arg1, int arg2, boolean arg3) {
        if (class170.method1886(arg0)) {
            method743(Statics.field2334[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("af.cx([Lfx;IIIZI)V")
    public static void method743(class170[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class170 var6 = arg0[var5];
            if (var6 != null && var6.field2229 == arg1) {
                method1766(var6, arg2, arg3, arg4);
                method100(var6, arg2, arg3);
                if (var6.field2231 > var6.field2330 - var6.field2225) {
                    var6.field2231 = var6.field2330 - var6.field2225;
                }
                if (var6.field2231 < 0) {
                    var6.field2231 = 0;
                }
                if (var6.field2305 > var6.field2300 - var6.field2226) {
                    var6.field2305 = var6.field2300 - var6.field2226;
                }
                if (var6.field2305 < 0) {
                    var6.field2305 = 0;
                }
                if (var6.field2272 == 0) {
                    method15(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("cl.ck(Lfx;IIZI)V")
    public static void method1766(class170 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2225;
        int var5 = arg0.field2226;
        if (arg0.field2217 == 0) {
            arg0.field2225 = arg0.field2245;
        } else if (arg0.field2217 == 1) {
            arg0.field2225 = arg1 - arg0.field2245;
        } else if (arg0.field2217 == 2) {
            arg0.field2225 = arg0.field2245 * arg1 >> 14;
        }
        if (arg0.field2327 == 0) {
            arg0.field2226 = arg0.field2222;
        } else if (arg0.field2327 == 1) {
            arg0.field2226 = arg2 - arg0.field2222;
        } else if (arg0.field2327 == 2) {
            arg0.field2226 = arg0.field2222 * arg2 >> 14;
        }
        if (arg0.field2217 == 4) {
            arg0.field2225 = arg0.field2227 * arg0.field2226 / arg0.field2228;
        }
        if (arg0.field2327 == 4) {
            arg0.field2226 = arg0.field2228 * arg0.field2225 / arg0.field2227;
        }
        if (field462 && arg0.field2272 == 0) {
            if (arg0.field2226 < 5 && arg0.field2225 < 5) {
                arg0.field2226 = 5;
                arg0.field2225 = 5;
            } else {
                if (arg0.field2226 <= 0) {
                    arg0.field2226 = 5;
                }
                if (arg0.field2225 <= 0) {
                    arg0.field2225 = 5;
                }
            }
        }
        if (arg0.field2214 == 1337) {
            field464 = arg0;
        }
        if (arg3 && arg0.field2319 != null && (arg0.field2225 != var4 || arg0.field2226 != var5)) {
            class19 var6 = new class19();
            var6.field205 = arg0;
            var6.field206 = arg0.field2319;
            field418.method2190(var6);
        }
    }

    @ObfuscatedName("r.co(Lfx;IIB)V")
    public static void method100(class170 arg0, int arg1, int arg2) {
        if (arg0.field2215 == 0) {
            arg0.field2223 = arg0.field2219;
        } else if (arg0.field2215 == 1) {
            arg0.field2223 = (arg1 - arg0.field2225) / 2 + arg0.field2219;
        } else if (arg0.field2215 == 2) {
            arg0.field2223 = arg1 - arg0.field2225 - arg0.field2219;
        } else if (arg0.field2215 == 3) {
            arg0.field2223 = arg0.field2219 * arg1 >> 14;
        } else if (arg0.field2215 == 4) {
            arg0.field2223 = (arg0.field2219 * arg1 >> 14) + (arg1 - arg0.field2225) / 2;
        } else {
            arg0.field2223 = arg1 - arg0.field2225 - (arg0.field2219 * arg1 >> 14);
        }
        if (arg0.field2216 == 0) {
            arg0.field2224 = arg0.field2220;
        } else if (arg0.field2216 == 1) {
            arg0.field2224 = (arg2 - arg0.field2226) / 2 + arg0.field2220;
        } else if (arg0.field2216 == 2) {
            arg0.field2224 = arg2 - arg0.field2226 - arg0.field2220;
        } else if (arg0.field2216 == 3) {
            arg0.field2224 = arg0.field2220 * arg2 >> 14;
        } else if (arg0.field2216 == 4) {
            arg0.field2224 = (arg0.field2220 * arg2 >> 14) + (arg2 - arg0.field2226) / 2;
        } else {
            arg0.field2224 = arg2 - arg0.field2226 - (arg0.field2220 * arg2 >> 14);
        }
        if (!field462 || arg0.field2272 != 0) {
            return;
        }
        if (arg0.field2223 < 0) {
            arg0.field2223 = 0;
        } else if (arg0.field2225 + arg0.field2223 > arg1) {
            arg0.field2223 = arg1 - arg0.field2225;
        }
        if (arg0.field2224 < 0) {
            arg0.field2224 = 0;
        } else if (arg0.field2226 + arg0.field2224 > arg2) {
            arg0.field2224 = arg2 - arg0.field2226;
        }
    }

    @ObfuscatedName("s.ci(Lfx;IIIIIII)V")
    public static final void method6(class170 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field501) {
            field502 = 32;
        } else {
            field502 = 0;
        }
        field501 = false;
        if (class116.field1802 == 1 || !Statics.field111 && class116.field1802 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2305 -= 4;
                method3468(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2305 += 4;
                method3468(arg0);
            } else if (arg5 >= arg1 - field502 && arg5 < field502 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2305 = (arg4 - arg3) * var8 / var9;
                method3468(arg0);
                field501 = true;
            }
        }
        if (field381 == 0) {
            return;
        }
        int var10 = arg0.field2225;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2305 += field381 * 45;
            method3468(arg0);
        }
    }

    @ObfuscatedName("ap.da(IIIIIB)V")
    public static final void method759(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field292[0].method3699(arg0, arg1);
        Statics.field292[1].method3699(arg0, arg1 + arg3 - 16);
        class220.method3667(arg0, arg1 + 16, 16, arg3 - 32, field371);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class220.method3667(arg0, arg1 + 16 + var6, 16, var5, field372);
        class220.method3651(arg0, arg1 + 16 + var6, var5, field374);
        class220.method3651(arg0 + 1, arg1 + 16 + var6, var5, field374);
        class220.method3632(arg0, arg1 + 16 + var6, 16, field374);
        class220.method3632(arg0, arg1 + 17 + var6, 16, field374);
        class220.method3651(arg0 + 15, arg1 + 16 + var6, var5, field373);
        class220.method3651(arg0 + 14, arg1 + 17 + var6, var5 - 1, field373);
        class220.method3632(arg0, arg1 + 15 + var6 + var5, 16, field373);
        class220.method3632(arg0 + 1, arg1 + 14 + var6 + var5, 15, field373);
    }

    @ObfuscatedName("k.db(Lfx;I)Z")
    public static final boolean method79(class170 arg0) {
        if (arg0.field2323 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2323.length; var1++) {
            int var2 = method133(arg0, var1);
            int var3 = arg0.field2311[var1];
            if (arg0.field2323[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2323[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2323[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("n.dj(Lfx;II)I")
    public static final int method133(class170 arg0, int arg1) {
        if (arg0.field2322 == null || arg1 >= arg0.field2322.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2322[arg1];
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
                    var7 = field510[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field429[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field403[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class170 var11 = class170.method1882(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class199.method699(var12).field2974 || field299)) {
                        for (int var13 = 0; var13 < var11.field2243.length; var13++) {
                            if (var12 + 1 == var11.field2243[var13]) {
                                var7 += var11.field2292[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class166.field2176[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class173.field2360[field429[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class166.field2176[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field129.field262;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class173.field2361[var14]) {
                            var7 += field429[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class170 var17 = class170.method1882(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class199.method699(var18).field2974 || field299)) {
                        for (int var19 = 0; var19 < var17.field2243.length; var19++) {
                            if (var18 + 1 == var17.field2243[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field457;
                }
                if (var6 == 12) {
                    var7 = field477;
                }
                if (var6 == 13) {
                    int var20 = class166.field2176[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class166.method175(var22);
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
                    var7 = (Statics.field129.field609 >> 7) + Statics.field254;
                }
                if (var6 == 19) {
                    var7 = (Statics.field129.field606 >> 7) + Statics.field1680;
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

    @ObfuscatedName("ap.dz(IIIIIIII)V")
    public static final void method757(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class170.method1886(arg0)) {
            method183(Statics.field2334[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("t.dh([Lfx;IIIIIIII)V")
    public static final void method183(class170[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class170 var9 = arg0[var8];
            if (var9 != null && (!var9.field2209 || var9.field2272 == 0 || var9.field2290 || method2959(var9) != 0 || field466 == var9 || var9.field2214 == 1338) && var9.field2229 == arg1 && (!var9.field2209 || !method150(var9))) {
                int var10 = var9.field2223 + arg6;
                int var11 = var9.field2224 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2272 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2272 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2225 + var10;
                    int var19 = var9.field2226 + var11;
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
                    int var22 = var9.field2225 + var10;
                    int var23 = var9.field2226 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field465 == var9) {
                    field473 = true;
                    field577 = var10;
                    field475 = var11;
                }
                if (!var9.field2209 || var12 < var14 && var13 < var15) {
                    int var24 = class116.field1811;
                    int var25 = class116.field1804;
                    if (class116.field1808 != 0) {
                        var24 = class116.field1810;
                        var25 = class116.field1797;
                    }
                    if (var9.field2214 == 1337) {
                        if (!field303 && !field432 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field413 == 0 && !field447) {
                                method3619(class174.field2520, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class83.field1415; var28++) {
                                int var29 = class83.field1387[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field5.method1655(Statics.field1853, var30, var31, var29) >= 0) {
                                        class198 var34 = class198.method2454(var33);
                                        if (var34.field2939 != null) {
                                            var34 = var34.method3288();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field413 == 1) {
                                            method3619(class174.field2515, field323 + " " + class38.field776 + " " + class38.method575(65535) + var34.field2910, 1, var29, var30, var31);
                                        } else if (!field447) {
                                            String[] var35 = var34.field2927;
                                            if (field463) {
                                                var35 = method134(var35);
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
                                                        method3619(var35[var36], class38.method575(65535) + var34.field2910, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method3619(class174.field2466, class38.method575(65535) + var34.field2910, 1002, var34.field2943 << 14, var30, var31);
                                        } else if ((Statics.field761 & 0x4) == 4) {
                                            method3619(field450, field451 + " " + class38.field776 + " " + class38.method575(65535) + var34.field2910, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class36 var38 = field492[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field760.field3011 == 1 && (var38.field609 & 0x7F) == 64 && (var38.field606 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field333; var39++) {
                                                class36 var40 = field492[field334[var39]];
                                                if (var40 != null && var38 != var40 && var40.field760.field3011 == 1 && var38.field609 == var40.field609 && var38.field606 == var40.field606) {
                                                    method2964(var40.field760, field334[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class46.field895;
                                            int[] var42 = class46.field897;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class24 var44 = field414[var42[var43]];
                                                if (var44 != null && var38.field609 == var44.field609 && var38.field606 == var44.field606) {
                                                    method25(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method2964(var38.field760, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class24 var45 = field414[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field609 & 0x7F) == 64 && (var45.field606 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field333; var46++) {
                                                class36 var47 = field492[field334[var46]];
                                                if (var47 != null && var47.field760.field3011 == 1 && var45.field609 == var47.field609 && var45.field606 == var47.field606) {
                                                    method2964(var47.field760, field334[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class46.field895;
                                            int[] var49 = class46.field897;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class24 var51 = field414[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field609 == var51.field609 && var45.field606 == var51.field606) {
                                                    method25(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field293 == var33) {
                                            var26 = var29;
                                        } else {
                                            method25(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class129 var52 = field424[Statics.field1853][var30][var31];
                                        if (var52 != null) {
                                            for (class44 var53 = (class44) var52.method2188(); var53 != null; var53 = (class44) var52.method2192()) {
                                                class199 var54 = class199.method699(var53.field882);
                                                if (field413 == 1) {
                                                    method3619(class174.field2515, field323 + " " + class38.field776 + " " + class38.method575(16748608) + var54.field2961, 16, var53.field882, var30, var31);
                                                } else if (!field447) {
                                                    String[] var55 = var54.field3001;
                                                    if (field463) {
                                                        var55 = method134(var55);
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
                                                            method3619(var55[var56], class38.method575(16748608) + var54.field2961, var57, var53.field882, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method3619(class174.field2379, class38.method575(16748608) + var54.field2961, 20, var53.field882, var30, var31);
                                                        }
                                                    }
                                                    method3619(class174.field2466, class38.method575(16748608) + var54.field2961, 1004, var53.field882, var30, var31);
                                                } else if ((Statics.field761 & 0x1) == 1) {
                                                    method3619(field450, field451 + " " + class38.field776 + " " + class38.method575(16748608) + var54.field2961, 17, var53.field882, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class24 var60 = field414[field293];
                                method25(var60, field293, var58, var59);
                            }
                        }
                    } else if (var9.field2214 == 1338) {
                        method686(var9, var10, var11);
                    } else {
                        if (!field432 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var61 = var24 - var10;
                            int var62 = var25 - var11;
                            if (var9.field2213 == 1) {
                                method3619(var9.field2206, "", 24, 0, 0, var9.field2210);
                            }
                            if (var9.field2213 == 2 && !field447) {
                                String var63;
                                if (class171.method1762(method2959(var9)) == 0) {
                                    var63 = null;
                                } else if (var9.field2324 == null || var9.field2324.trim().length() == 0) {
                                    var63 = null;
                                } else {
                                    var63 = var9.field2324;
                                }
                                if (var63 != null) {
                                    method3619(var63, class38.method575(65280) + var9.field2326, 25, 0, -1, var9.field2210);
                                }
                            }
                            if (var9.field2213 == 3) {
                                method3619(class174.field2524, "", 26, 0, 0, var9.field2210);
                            }
                            if (var9.field2213 == 4) {
                                method3619(var9.field2206, "", 28, 0, 0, var9.field2210);
                            }
                            if (var9.field2213 == 5) {
                                method3619(var9.field2206, "", 29, 0, 0, var9.field2210);
                            }
                            if (var9.field2213 == 6 && field456 == null) {
                                method3619(var9.field2206, "", 30, 0, -1, var9.field2210);
                            }
                            if (var9.field2272 == 2) {
                                int var65 = 0;
                                for (int var66 = 0; var66 < var9.field2226; var66++) {
                                    for (int var67 = 0; var67 < var9.field2225; var67++) {
                                        int var68 = (var9.field2276 + 32) * var67;
                                        int var69 = (var9.field2277 + 32) * var66;
                                        if (var65 < 20) {
                                            var68 += var9.field2278[var65];
                                            var69 += var9.field2279[var65];
                                        }
                                        if (var61 >= var68 && var62 >= var69 && var61 < var68 + 32 && var62 < var69 + 32) {
                                            field410 = var65;
                                            Statics.field2695 = var9;
                                            if (var9.field2243[var65] > 0) {
                                                class199 var70 = class199.method699(var9.field2243[var65] - 1);
                                                if (field413 == 1 && class171.method93(method2959(var9))) {
                                                    if (Statics.field1735 != var9.field2210 || Statics.field1217 != var65) {
                                                        method3619(class174.field2515, field323 + " " + class38.field776 + " " + class38.method575(16748608) + var70.field2961, 31, var70.field2959, var65, var9.field2210);
                                                    }
                                                } else if (!field447 || !class171.method93(method2959(var9))) {
                                                    String[] var71 = var70.field2976;
                                                    if (field463) {
                                                        var71 = method134(var71);
                                                    }
                                                    if (class171.method93(method2959(var9))) {
                                                        for (int var72 = 4; var72 >= 3; var72--) {
                                                            if (var71 != null && var71[var72] != null) {
                                                                byte var73;
                                                                if (var72 == 3) {
                                                                    var73 = 36;
                                                                } else {
                                                                    var73 = 37;
                                                                }
                                                                method3619(var71[var72], class38.method575(16748608) + var70.field2961, var73, var70.field2959, var65, var9.field2210);
                                                            } else if (var72 == 4) {
                                                                method3619(class174.field2369, class38.method575(16748608) + var70.field2961, 37, var70.field2959, var65, var9.field2210);
                                                            }
                                                        }
                                                    }
                                                    int var74 = method2959(var9);
                                                    boolean var75 = (var74 >> 31 & 0x1) != 0;
                                                    if (var75) {
                                                        method3619(class174.field2515, class38.method575(16748608) + var70.field2961, 38, var70.field2959, var65, var9.field2210);
                                                    }
                                                    class171 var10000 = (class171) null;
                                                    if (class171.method93(method2959(var9)) && var71 != null) {
                                                        for (int var76 = 2; var76 >= 0; var76--) {
                                                            if (var71[var76] != null) {
                                                                byte var77 = 0;
                                                                if (var76 == 0) {
                                                                    var77 = 33;
                                                                }
                                                                if (var76 == 1) {
                                                                    var77 = 34;
                                                                }
                                                                if (var76 == 2) {
                                                                    var77 = 35;
                                                                }
                                                                method3619(var71[var76], class38.method575(16748608) + var70.field2961, var77, var70.field2959, var65, var9.field2210);
                                                            }
                                                        }
                                                    }
                                                    String[] var78 = var9.field2336;
                                                    if (field463) {
                                                        var78 = method134(var78);
                                                    }
                                                    if (var78 != null) {
                                                        for (int var79 = 4; var79 >= 0; var79--) {
                                                            if (var78[var79] != null) {
                                                                byte var80 = 0;
                                                                if (var79 == 0) {
                                                                    var80 = 39;
                                                                }
                                                                if (var79 == 1) {
                                                                    var80 = 40;
                                                                }
                                                                if (var79 == 2) {
                                                                    var80 = 41;
                                                                }
                                                                if (var79 == 3) {
                                                                    var80 = 42;
                                                                }
                                                                if (var79 == 4) {
                                                                    var80 = 43;
                                                                }
                                                                method3619(var78[var79], class38.method575(16748608) + var70.field2961, var80, var70.field2959, var65, var9.field2210);
                                                            }
                                                        }
                                                    }
                                                    method3619(class174.field2466, class38.method575(16748608) + var70.field2961, 1005, var70.field2959, var65, var9.field2210);
                                                } else if ((Statics.field761 & 0x10) == 16) {
                                                    method3619(field450, field451 + " " + class38.field776 + " " + class38.method575(16748608) + var70.field2961, 32, var70.field2959, var65, var9.field2210);
                                                }
                                            }
                                        }
                                        var65++;
                                    }
                                }
                            }
                            if (var9.field2209) {
                                if (!field447) {
                                    for (int var81 = 9; var81 >= 5; var81--) {
                                        int var82 = method2959(var9);
                                        boolean var83 = (var82 >> var81 + 1 & 0x1) != 0;
                                        String var84;
                                        if (!var83 && var9.field2310 == null) {
                                            var84 = null;
                                        } else if (var9.field2284 == null || var9.field2284.length <= var81 || var9.field2284[var81] == null || var9.field2284[var81].trim().length() == 0) {
                                            var84 = null;
                                        } else {
                                            var84 = var9.field2284[var81];
                                        }
                                        if (var84 != null) {
                                            method3619(var84, var9.field2304, 1007, var81 + 1, var9.field2211, var9.field2210);
                                        }
                                    }
                                    String var86;
                                    if (class171.method1762(method2959(var9)) == 0) {
                                        var86 = null;
                                    } else if (var9.field2324 == null || var9.field2324.trim().length() == 0) {
                                        var86 = null;
                                    } else {
                                        var86 = var9.field2324;
                                    }
                                    if (var86 != null) {
                                        method3619(var86, var9.field2304, 25, 0, var9.field2211, var9.field2210);
                                    }
                                    for (int var88 = 4; var88 >= 0; var88--) {
                                        int var89 = method2959(var9);
                                        boolean var90 = (var89 >> var88 + 1 & 0x1) != 0;
                                        String var91;
                                        if (!var90 && var9.field2310 == null) {
                                            var91 = null;
                                        } else if (var9.field2284 == null || var9.field2284.length <= var88 || var9.field2284[var88] == null || var9.field2284[var88].trim().length() == 0) {
                                            var91 = null;
                                        } else {
                                            var91 = var9.field2284[var88];
                                        }
                                        if (var91 != null) {
                                            method3619(var91, var9.field2304, 57, var88 + 1, var9.field2211, var9.field2210);
                                        }
                                    }
                                    if (class171.method634(method2959(var9))) {
                                        method3619(class174.field2373, "", 30, 0, var9.field2211, var9.field2210);
                                    }
                                } else if (class171.method1799(method2959(var9)) && (Statics.field761 & 0x20) == 32) {
                                    method3619(field450, field451 + " " + class38.field776 + " " + var9.field2304, 58, 0, var9.field2211, var9.field2210);
                                }
                            }
                        }
                        if (var9.field2272 == 0) {
                            if (!var9.field2209 && method150(var9) && Statics.field3164 != var9) {
                                continue;
                            }
                            method183(arg0, var9.field2210, var12, var13, var14, var15, var10 - var9.field2231, var11 - var9.field2305);
                            if (var9.field2237 != null) {
                                method183(var9.field2237, var9.field2210, var12, var13, var14, var15, var10 - var9.field2231, var11 - var9.field2305);
                            }
                            class18 var93 = (class18) field453.method2131((long) var9.field2210);
                            if (var93 != null) {
                                if (var93.field194 == 0 && class116.field1811 >= var12 && class116.field1804 >= var13 && class116.field1811 < var14 && class116.field1804 < var15 && !field432 && !field462) {
                                    for (class19 var94 = (class19) field418.method2187(); var94 != null; var94 = (class19) field418.method2203()) {
                                        if (var94.field204) {
                                            var94.method2179();
                                            var94.field205.field2335 = false;
                                        }
                                    }
                                    if (Statics.field73 == 0) {
                                        field465 = null;
                                        field466 = null;
                                    }
                                    if (!field432) {
                                        field439[0] = class174.field2604;
                                        field440[0] = "";
                                        field437[0] = 1006;
                                        field434 = 1;
                                    }
                                }
                                method757(var93.field196, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2209) {
                            if (var9.field2343) {
                                if (class116.field1811 >= var12 && class116.field1804 >= var13 && class116.field1811 < var14 && class116.field1804 < var15) {
                                    for (class19 var95 = (class19) field418.method2187(); var95 != null; var95 = (class19) field418.method2203()) {
                                        if (var95.field204) {
                                            var95.method2179();
                                            var95.field205.field2335 = false;
                                        }
                                    }
                                    if (Statics.field73 == 0) {
                                        field465 = null;
                                        field466 = null;
                                    }
                                    if (!field432) {
                                        field439[0] = class174.field2604;
                                        field440[0] = "";
                                        field437[0] = 1006;
                                        field434 = 1;
                                    }
                                }
                            } else if (var9.field2221 && class116.field1811 >= var12 && class116.field1804 >= var13 && class116.field1811 < var14 && class116.field1804 < var15) {
                                for (class19 var96 = (class19) field418.method2187(); var96 != null; var96 = (class19) field418.method2203()) {
                                    if (var96.field204 && var96.field205.field2344 == var96.field206) {
                                        var96.method2179();
                                    }
                                }
                            }
                            boolean var97;
                            if (class116.field1811 >= var12 && class116.field1804 >= var13 && class116.field1811 < var14 && class116.field1804 < var15) {
                                var97 = true;
                            } else {
                                var97 = false;
                            }
                            boolean var98 = false;
                            if ((class116.field1802 == 1 || !Statics.field111 && class116.field1802 == 4) && var97) {
                                var98 = true;
                            }
                            boolean var99 = false;
                            if ((class116.field1808 == 1 || !Statics.field111 && class116.field1808 == 4) && class116.field1810 >= var12 && class116.field1797 >= var13 && class116.field1810 < var14 && class116.field1797 < var15) {
                                var99 = true;
                            }
                            if (var99) {
                                method3094(var9, class116.field1810 - var10, class116.field1797 - var11);
                            }
                            if (field465 != null && field465 != var9 && var97 && class171.method1578(method2959(var9))) {
                                field469 = var9;
                            }
                            if (field466 == var9) {
                                field430 = true;
                                field409 = var10;
                                field311 = var11;
                            }
                            if (var9.field2290) {
                                if (var97 && field381 != 0 && var9.field2344 != null) {
                                    class19 var100 = new class19();
                                    var100.field204 = true;
                                    var100.field205 = var9;
                                    var100.field207 = field381;
                                    var100.field206 = var9.field2344;
                                    field418.method2190(var100);
                                }
                                if (field465 != null || Statics.field787 != null || field432) {
                                    var99 = false;
                                    var98 = false;
                                    var97 = false;
                                }
                                if (!var9.field2240 && var99) {
                                    var9.field2240 = true;
                                    if (var9.field2259 != null) {
                                        class19 var101 = new class19();
                                        var101.field204 = true;
                                        var101.field205 = var9;
                                        var101.field210 = class116.field1810 - var10;
                                        var101.field207 = class116.field1797 - var11;
                                        var101.field206 = var9.field2259;
                                        field418.method2190(var101);
                                    }
                                }
                                if (var9.field2240 && var98 && var9.field2293 != null) {
                                    class19 var102 = new class19();
                                    var102.field204 = true;
                                    var102.field205 = var9;
                                    var102.field210 = class116.field1811 - var10;
                                    var102.field207 = class116.field1804 - var11;
                                    var102.field206 = var9.field2293;
                                    field418.method2190(var102);
                                }
                                if (var9.field2240 && !var98) {
                                    var9.field2240 = false;
                                    if (var9.field2253 != null) {
                                        class19 var103 = new class19();
                                        var103.field204 = true;
                                        var103.field205 = var9;
                                        var103.field210 = class116.field1811 - var10;
                                        var103.field207 = class116.field1804 - var11;
                                        var103.field206 = var9.field2253;
                                        field389.method2190(var103);
                                    }
                                }
                                if (var98 && var9.field2295 != null) {
                                    class19 var104 = new class19();
                                    var104.field204 = true;
                                    var104.field205 = var9;
                                    var104.field210 = class116.field1811 - var10;
                                    var104.field207 = class116.field1804 - var11;
                                    var104.field206 = var9.field2295;
                                    field418.method2190(var104);
                                }
                                if (!var9.field2335 && var97) {
                                    var9.field2335 = true;
                                    if (var9.field2296 != null) {
                                        class19 var105 = new class19();
                                        var105.field204 = true;
                                        var105.field205 = var9;
                                        var105.field210 = class116.field1811 - var10;
                                        var105.field207 = class116.field1804 - var11;
                                        var105.field206 = var9.field2296;
                                        field418.method2190(var105);
                                    }
                                }
                                if (var9.field2335 && var97 && var9.field2297 != null) {
                                    class19 var106 = new class19();
                                    var106.field204 = true;
                                    var106.field205 = var9;
                                    var106.field210 = class116.field1811 - var10;
                                    var106.field207 = class116.field1804 - var11;
                                    var106.field206 = var9.field2297;
                                    field418.method2190(var106);
                                }
                                if (var9.field2335 && !var97) {
                                    var9.field2335 = false;
                                    if (var9.field2329 != null) {
                                        class19 var107 = new class19();
                                        var107.field204 = true;
                                        var107.field205 = var9;
                                        var107.field210 = class116.field1811 - var10;
                                        var107.field207 = class116.field1804 - var11;
                                        var107.field206 = var9.field2329;
                                        field389.method2190(var107);
                                    }
                                }
                                if (var9.field2309 != null) {
                                    class19 var108 = new class19();
                                    var108.field205 = var9;
                                    var108.field206 = var9.field2309;
                                    field493.method2190(var108);
                                }
                                if (var9.field2303 != null && field479 > var9.field2212) {
                                    if (var9.field2294 == null || field479 - var9.field2212 > 32) {
                                        class19 var113 = new class19();
                                        var113.field205 = var9;
                                        var113.field206 = var9.field2303;
                                        field418.method2190(var113);
                                    } else {
                                        label950: for (int var109 = var9.field2212; var109 < field479; var109++) {
                                            int var110 = field478[var109 & 0x1F];
                                            for (int var111 = 0; var111 < var9.field2294.length; var111++) {
                                                if (var9.field2294[var111] == var110) {
                                                    class19 var112 = new class19();
                                                    var112.field205 = var9;
                                                    var112.field206 = var9.field2303;
                                                    field418.method2190(var112);
                                                    break label950;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2212 = field479;
                                }
                                if (var9.field2249 != null && field458 > var9.field2339) {
                                    if (var9.field2306 == null || field458 - var9.field2339 > 32) {
                                        class19 var118 = new class19();
                                        var118.field205 = var9;
                                        var118.field206 = var9.field2249;
                                        field418.method2190(var118);
                                    } else {
                                        label926: for (int var114 = var9.field2339; var114 < field458; var114++) {
                                            int var115 = field480[var114 & 0x1F];
                                            for (int var116 = 0; var116 < var9.field2306.length; var116++) {
                                                if (var9.field2306[var116] == var115) {
                                                    class19 var117 = new class19();
                                                    var117.field205 = var9;
                                                    var117.field206 = var9.field2249;
                                                    field418.method2190(var117);
                                                    break label926;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2339 = field458;
                                }
                                if (var9.field2307 != null && field483 > var9.field2340) {
                                    if (var9.field2308 == null || field483 - var9.field2340 > 32) {
                                        class19 var123 = new class19();
                                        var123.field205 = var9;
                                        var123.field206 = var9.field2307;
                                        field418.method2190(var123);
                                    } else {
                                        label902: for (int var119 = var9.field2340; var119 < field483; var119++) {
                                            int var120 = field482[var119 & 0x1F];
                                            for (int var121 = 0; var121 < var9.field2308.length; var121++) {
                                                if (var9.field2308[var121] == var120) {
                                                    class19 var122 = new class19();
                                                    var122.field205 = var9;
                                                    var122.field206 = var9.field2307;
                                                    field418.method2190(var122);
                                                    break label902;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2340 = field483;
                                }
                                if (field358 > var9.field2337 && var9.field2312 != null) {
                                    class19 var124 = new class19();
                                    var124.field205 = var9;
                                    var124.field206 = var9.field2312;
                                    field418.method2190(var124);
                                }
                                if (field485 > var9.field2337 && var9.field2338 != null) {
                                    class19 var125 = new class19();
                                    var125.field205 = var9;
                                    var125.field206 = var9.field2338;
                                    field418.method2190(var125);
                                }
                                if (field486 > var9.field2337 && var9.field2315 != null) {
                                    class19 var126 = new class19();
                                    var126.field205 = var9;
                                    var126.field206 = var9.field2315;
                                    field418.method2190(var126);
                                }
                                if (field428 > var9.field2337 && var9.field2320 != null) {
                                    class19 var127 = new class19();
                                    var127.field205 = var9;
                                    var127.field206 = var9.field2320;
                                    field418.method2190(var127);
                                }
                                if (field488 > var9.field2337 && var9.field2321 != null) {
                                    class19 var128 = new class19();
                                    var128.field205 = var9;
                                    var128.field206 = var9.field2321;
                                    field418.method2190(var128);
                                }
                                if (field489 > var9.field2337 && var9.field2316 != null) {
                                    class19 var129 = new class19();
                                    var129.field205 = var9;
                                    var129.field206 = var9.field2316;
                                    field418.method2190(var129);
                                }
                                var9.field2337 = field359;
                                if (var9.field2202 != null) {
                                    for (int var130 = 0; var130 < field516; var130++) {
                                        class19 var131 = new class19();
                                        var131.field205 = var9;
                                        var131.field215 = field495[var130];
                                        var131.field208 = field517[var130];
                                        var131.field206 = var9.field2202;
                                        field418.method2190(var131);
                                    }
                                }
                            }
                        }
                        if (!var9.field2209 && field465 == null && Statics.field787 == null && !field432) {
                            if ((var9.field2256 >= 0 || var9.field2342 != 0) && class116.field1811 >= var12 && class116.field1804 >= var13 && class116.field1811 < var14 && class116.field1804 < var15) {
                                if (var9.field2256 >= 0) {
                                    Statics.field3164 = arg0[var9.field2256];
                                } else {
                                    Statics.field3164 = var9;
                                }
                            }
                            if (var9.field2272 == 8 && class116.field1811 >= var12 && class116.field1804 >= var13 && class116.field1811 < var14 && class116.field1804 < var15) {
                                Statics.field131 = var9;
                            }
                            if (var9.field2300 > var9.field2226) {
                                method6(var9, var9.field2225 + var10, var11, var9.field2226, var9.field2300, class116.field1811, class116.field1804);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("x.dp(III)V")
    public static final void method96(int arg0, int arg1) {
        if (class170.method1886(arg0)) {
            method1879(Statics.field2334[arg0], arg1);
        }
    }

    @ObfuscatedName("dz.dm([Lfx;II)V")
    public static final void method1879(class170[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class170 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2272 == 0) {
                    if (var3.field2237 != null) {
                        method1879(var3.field2237, arg1);
                    }
                    class18 var4 = (class18) field453.method2131((long) var3.field2210);
                    if (var4 != null) {
                        method96(var4.field196, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2317 != null) {
                    class19 var5 = new class19();
                    var5.field205 = var3;
                    var5.field206 = var3.field2317;
                    class33.method592(var5);
                }
                if (arg1 == 1 && var3.field2318 != null) {
                    if (var3.field2211 >= 0) {
                        class170 var6 = class170.method1882(var3.field2210);
                        if (var6 == null || var6.field2237 == null || var3.field2211 >= var6.field2237.length || var6.field2237[var3.field2211] != var3) {
                            continue;
                        }
                    }
                    class19 var7 = new class19();
                    var7.field205 = var3;
                    var7.field206 = var3.field2318;
                    class33.method592(var7);
                }
            }
        }
    }

    @ObfuscatedName("go.df(Lfx;III)V")
    public static final void method3094(class170 arg0, int arg1, int arg2) {
        if (field465 != null || field432 || arg0 == null) {
            return;
        }
        class170 var3 = method98(arg0);
        if (var3 == null) {
            var3 = arg0.field2258;
        }
        if (var3 == null) {
            return;
        }
        field465 = arg0;
        class170 var5 = method98(arg0);
        if (var5 == null) {
            var5 = arg0.field2258;
        }
        field466 = var5;
        field467 = arg1;
        field468 = arg2;
        Statics.field73 = 0;
        field476 = false;
        if (field434 > 0) {
            method824(field434 - 1);
        }
        return;
    }

    @ObfuscatedName("am.dn(II)V")
    public static void method824(int arg0) {
        Statics.field32 = new class39();
        Statics.field32.field792 = field435[arg0];
        Statics.field32.field788 = field401[arg0];
        Statics.field32.field789 = field437[arg0];
        Statics.field32.field790 = field555[arg0];
        Statics.field32.field791 = field439[arg0];
    }

    @ObfuscatedName("ea.de(IIB)V")
    public static void method2744(int arg0, int arg1) {
        method2527(Statics.field32, arg0, arg1);
        Statics.field32 = null;
    }

    @ObfuscatedName("ge.dr(Lfx;I)V")
    public static void method3468(class170 arg0) {
        if (field497 == arg0.field2288) {
            field498[arg0.field2341] = true;
        }
    }

    @ObfuscatedName("ga.du(I)V")
    public static void method3380() {
        for (class18 var0 = (class18) field453.method2140(); var0 != null; var0 = (class18) field453.method2134()) {
            int var1 = var0.field196;
            if (class170.method1886(var1)) {
                boolean var2 = true;
                class170[] var3 = Statics.field2334[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2209;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field1889;
                    class170 var6 = class170.method1882(var5);
                    if (var6 != null) {
                        method3468(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("n.dw([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method134(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("t.dg(II)V")
    public static final void method186(int arg0) {
        if (class170.method1886(arg0)) {
            method1769(Statics.field2334[arg0], -1);
        }
    }

    @ObfuscatedName("cd.dy([Lfx;II)V")
    public static final void method1769(class170[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class170 var3 = arg0[var2];
            if (var3 != null && var3.field2229 == arg1 && (!var3.field2209 || !method150(var3))) {
                if (var3.field2272 == 0) {
                    if (!var3.field2209 && method150(var3) && Statics.field3164 != var3) {
                        continue;
                    }
                    method1769(arg0, var3.field2210);
                    if (var3.field2237 != null) {
                        method1769(var3.field2237, var3.field2210);
                    }
                    class18 var4 = (class18) field453.method2131((long) var3.field2210);
                    if (var4 != null) {
                        method186(var4.field196);
                    }
                }
                if (var3.field2272 == 6) {
                    if (var3.field2257 != -1 || var3.field2201 != -1) {
                        boolean var5 = method79(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2201;
                        } else {
                            var6 = var3.field2257;
                        }
                        if (var6 != -1) {
                            class202 var7 = class202.method1914(var6);
                            var3.field2333 += field534;
                            while (var3.field2333 > var7.field3064[var3.field2332]) {
                                var3.field2333 -= var7.field3064[var3.field2332];
                                var3.field2332++;
                                if (var3.field2332 >= var7.field3076.length) {
                                    var3.field2332 -= var7.field3066;
                                    if (var3.field2332 < 0 || var3.field2332 >= var7.field3076.length) {
                                        var3.field2332 = 0;
                                    }
                                }
                                method3468(var3);
                            }
                        }
                    }
                    if (var3.field2313 != 0 && !var3.field2209) {
                        int var8 = var3.field2313 >> 16;
                        int var9 = var3.field2313 << 16 >> 16;
                        int var10 = field534 * var8;
                        int var11 = field534 * var9;
                        var3.field2261 = var3.field2261 + var10 & 0x7FF;
                        var3.field2262 = var3.field2262 + var11 & 0x7FF;
                        method3468(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.dv(IB)V")
    public static final void method27(int arg0) {
        method3380();
        for (class32 var1 = (class32) class32.field704.method2187(); var1 != null; var1 = (class32) class32.field704.method2203()) {
            if (var1.field718 != null) {
                var1.method651();
            }
        }
        class188 var2 = (class188) class188.field2781.method2121((long) arg0);
        class188 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field2778.method2986(16, arg0);
            class188 var5 = new class188();
            if (var4 != null) {
                var5.method3131(new class154(var4));
            }
            class188.field2781.method2123(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var6 = var3.field2779;
        if (var6 == 0) {
            return;
        }
        int var7 = class166.field2176[arg0];
        if (var6 == 1) {
            if (var7 == 1) {
                class85.method1528(0.9D);
                ((class75) Statics.field1439).method1325(0.9D);
            }
            if (var7 == 2) {
                class85.method1528(0.8D);
                ((class75) Statics.field1439).method1325(0.8D);
            }
            if (var7 == 3) {
                class85.method1528(0.7D);
                ((class75) Statics.field1439).method1325(0.7D);
            }
            if (var7 == 4) {
                class85.method1528(0.6D);
                ((class75) Statics.field1439).method1325(0.6D);
            }
            class199.field2957.method2124();
        }
        if (var6 == 3) {
            short var8 = 0;
            if (var7 == 0) {
                var8 = 255;
            }
            if (var7 == 1) {
                var8 = 192;
            }
            if (var7 == 2) {
                var8 = 128;
            }
            if (var7 == 3) {
                var8 = 64;
            }
            if (var7 == 4) {
                var8 = 0;
            }
            if (field530 != var8) {
                if (field530 == 0 && field531 != -1) {
                    class139.method1751(Statics.field2171, field531, 0, var8, false);
                    field532 = false;
                } else if (var8 == 0) {
                    class139.method3616();
                    field532 = false;
                } else if (class139.field1934 == 0) {
                    Statics.field1924.method2373(var8);
                } else {
                    Statics.field1922 = var8;
                }
                field530 = var8;
            }
        }
        if (var6 == 4) {
            if (var7 == 0) {
                field533 = 127;
            }
            if (var7 == 1) {
                field533 = 96;
            }
            if (var7 == 2) {
                field533 = 64;
            }
            if (var7 == 3) {
                field533 = 32;
            }
            if (var7 == 4) {
                field533 = 0;
            }
        }
        if (var6 == 5) {
            field431 = var7;
        }
        if (var6 == 6) {
            field494 = var7;
        }
        if (var6 == 9) {
            field455 = var7;
        }
        if (var6 == 10) {
            if (var7 == 0) {
                field552 = 127;
            }
            if (var7 == 1) {
                field552 = 96;
            }
            if (var7 == 2) {
                field552 = 64;
            }
            if (var7 == 3) {
                field552 = 32;
            }
            if (var7 == 4) {
                field552 = 0;
            }
        }
        if (var6 == 17) {
            field460 = var7 & 0xFFFF;
        }
        if (var6 == 18) {
            class41[] var9 = new class41[] { class41.field806, class41.field804, class41.field807, class41.field810 };
            field320 = (class41) class149.method1293(var9, var7);
            if (field320 == null) {
                field320 = class41.field806;
            }
        }
        if (var6 == 19) {
            if (var7 == -1) {
                field293 = -1;
            } else {
                field293 = var7 & 0x7FF;
            }
        }
        if (var6 != 22) {
            return;
        }
        class41[] var10 = new class41[] { class41.field806, class41.field804, class41.field807, class41.field810 };
        field321 = (class41) class149.method1293(var10, var7);
        if (field321 == null) {
            field321 = class41.field806;
        }
    }

    @ObfuscatedName("u.di(Lfx;B)V")
    public static final void method94(class170 arg0) {
        int var1 = arg0.field2214;
        if (var1 == 324) {
            if (field567 == -1) {
                field567 = arg0.field2325;
                field568 = arg0.field2246;
            }
            if (field471.field2180) {
                arg0.field2325 = field567;
            } else {
                arg0.field2325 = field568;
            }
        } else if (var1 == 325) {
            if (field567 == -1) {
                field567 = arg0.field2325;
                field568 = arg0.field2246;
            }
            if (field471.field2180) {
                arg0.field2325 = field568;
            } else {
                arg0.field2325 = field567;
            }
        } else if (var1 == 327) {
            arg0.field2261 = 150;
            arg0.field2262 = (int) (Math.sin((double) field304 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2233 = 5;
            arg0.field2252 = 0;
        } else if (var1 == 328) {
            arg0.field2261 = 150;
            arg0.field2262 = (int) (Math.sin((double) field304 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2233 = 5;
            arg0.field2252 = 1;
        }
    }

    @ObfuscatedName("cv.dl(I)V")
    public static final void method1745() {
        field337.method2775(180);
        for (class18 var0 = (class18) field453.method2140(); var0 != null; var0 = (class18) field453.method2134()) {
            if (var0.field194 == 0 || var0.field194 == 3) {
                method1750(var0, true);
            }
        }
        if (field456 != null) {
            method3468(field456);
            field456 = null;
        }
    }

    @ObfuscatedName("cf.dk(Li;ZI)V")
    public static final void method1750(class18 arg0, boolean arg1) {
        int var2 = arg0.field196;
        int var3 = (int) arg0.field1889;
        arg0.method2179();
        if (arg1) {
            Statics.method1770(var2);
        }
        method145(var2);
        class170 var4 = class170.method1882(var3);
        if (var4 != null) {
            method3468(var4);
        }
        method1069();
        if (field452 != -1) {
            method96(field452, 1);
        }
    }

    @ObfuscatedName("l.do(Lfx;B)Z")
    public static final boolean method225(class170 arg0) {
        int var1 = arg0.field2214;
        if (var1 == 205) {
            field347 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field471.method2853(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field471.method2854(var4, var5 == 1);
        }
        if (var1 == 324) {
            field471.method2855(false);
        }
        if (var1 == 325) {
            field471.method2855(true);
        }
        if (var1 == 326) {
            field337.method2775(103);
            field471.method2856(field337);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("d.dq(Lfx;IIII)V")
    public static final void method174(class170 arg0, int arg1, int arg2, int arg3) {
        method813();
        class165 var4 = arg0.method2912(false);
        if (var4 == null) {
            return;
        }
        class220.method3635(arg1, arg2, var4.field2165 + arg1, var4.field2166 + arg2);
        if (field348 == 2 || field348 == 5) {
            class220.method3647(arg1, arg2, 0, var4.field2173, var4.field2167);
        } else {
            int var5 = field378 + field365 & 0x7FF;
            int var6 = Statics.field129.field609 / 32 + 48;
            int var7 = 464 - Statics.field129.field606 / 32;
            Statics.field1095.method3755(arg1, arg2, var4.field2165, var4.field2166, var6, var7, var5, field519 + 256, var4.field2173, var4.field2167);
            for (int var8 = 0; var8 < field332; var8++) {
                int var9 = field524[var8] * 4 + 2 - Statics.field129.field609 / 32;
                int var10 = field525[var8] * 4 + 2 - Statics.field129.field606 / 32;
                method696(arg1, arg2, var9, var10, field526[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class129 var13 = field424[Statics.field1853][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field129.field609 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field129.field606 / 32;
                        method696(arg1, arg2, var14, var15, Statics.field1822[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field333; var16++) {
                class36 var17 = field492[field334[var16]];
                if (var17 != null && var17.method201()) {
                    class200 var18 = var17.field760;
                    if (var18 != null && var18.field3005 != null) {
                        var18 = var18.method3373();
                    }
                    if (var18 != null && var18.field3036 && var18.field3038) {
                        int var19 = var17.field609 / 32 - Statics.field129.field609 / 32;
                        int var20 = var17.field606 / 32 - Statics.field129.field606 / 32;
                        method696(arg1, arg2, var19, var20, Statics.field1822[1], var4);
                    }
                }
            }
            int var21 = class46.field895;
            int[] var22 = class46.field897;
            for (int var23 = 0; var23 < var21; var23++) {
                class24 var24 = field414[var22[var23]];
                if (var24 != null && var24.method201() && !var24.field258 && Statics.field129 != var24) {
                    int var25 = var24.field609 / 32 - Statics.field129.field609 / 32;
                    int var26 = var24.field606 / 32 - Statics.field129.field606 / 32;
                    boolean var27 = false;
                    if (method834(var24.field259, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field2157; var29++) {
                        if (var24.field259.equals(Statics.field1037[var29].field291)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field129.field267 != 0 && var24.field267 != 0 && Statics.field129.field267 == var24.field267) {
                        var30 = true;
                    }
                    if (var27) {
                        method696(arg1, arg2, var25, var26, Statics.field1822[3], var4);
                    } else if (var30) {
                        method696(arg1, arg2, var25, var26, Statics.field1822[4], var4);
                    } else if (var28) {
                        method696(arg1, arg2, var25, var26, Statics.field1822[5], var4);
                    } else {
                        method696(arg1, arg2, var25, var26, Statics.field1822[2], var4);
                    }
                }
            }
            if (field312 != 0 && field304 % 20 < 10) {
                if (field312 == 1 && field313 >= 0 && field313 < field492.length) {
                    class36 var31 = field492[field313];
                    if (var31 != null) {
                        int var32 = var31.field609 / 32 - Statics.field129.field609 / 32;
                        int var33 = var31.field606 / 32 - Statics.field129.field606 / 32;
                        method131(arg1, arg2, var32, var33, Statics.field594[1], var4);
                    }
                }
                if (field312 == 2) {
                    int var34 = field315 * 4 - Statics.field254 * 4 + 2 - Statics.field129.field609 / 32;
                    int var35 = field316 * 4 - Statics.field1680 * 4 + 2 - Statics.field129.field606 / 32;
                    method131(arg1, arg2, var34, var35, Statics.field594[1], var4);
                }
                if (field312 == 10 && field314 >= 0 && field314 < field414.length) {
                    class24 var36 = field414[field314];
                    if (var36 != null) {
                        int var37 = var36.field609 / 32 - Statics.field129.field609 / 32;
                        int var38 = var36.field606 / 32 - Statics.field129.field606 / 32;
                        method131(arg1, arg2, var37, var38, Statics.field594[1], var4);
                    }
                }
            }
            if (field527 != 0) {
                int var39 = field527 * 4 + 2 - Statics.field129.field609 / 32;
                int var40 = field433 * 4 + 2 - Statics.field129.field606 / 32;
                method696(arg1, arg2, var39, var40, Statics.field594[0], var4);
            }
            if (!Statics.field129.field258) {
                class220.method3667(var4.field2165 / 2 + arg1 - 1, var4.field2166 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field295[arg3] = true;
    }

    @ObfuscatedName("fr.dd(Lfx;IIIB)V")
    public static final void method2773(class170 arg0, int arg1, int arg2, int arg3) {
        class165 var4 = arg0.method2912(false);
        if (var4 == null) {
            return;
        }
        if (field348 < 3) {
            Statics.field1181.method3755(arg1, arg2, var4.field2165, var4.field2166, 25, 25, field378, 256, var4.field2173, var4.field2167);
        } else {
            class220.method3647(arg1, arg2, 0, var4.field2173, var4.field2167);
        }
    }

    @ObfuscatedName("r.ds(IIIILhk;Lfn;I)V")
    public static final void method131(int arg0, int arg1, int arg2, int arg3, class225 arg4, class165 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method696(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field378 + field365 & 0x7FF;
        int var8 = class85.field1445[var7];
        int var9 = class85.field1454[var7];
        int var10 = var8 * 256 / (field519 + 256);
        int var11 = var9 * 256 / (field519 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field1695.method3738(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("aw.dx(IIIILhk;Lfn;I)V")
    public static final void method696(int arg0, int arg1, int arg2, int arg3, class225 arg4, class165 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field378 + field365 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class85.field1445[var6];
        int var9 = class85.field1454[var6];
        int var10 = var8 * 256 / (field519 + 256);
        int var11 = var9 * 256 / (field519 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method3740(arg5.field2165 / 2 + var12 - arg4.field3206 / 2, arg5.field2166 / 2 - var13 - arg4.field3212 / 2, arg0, arg1, arg5.field2165, arg5.field2166, arg5.field2173, arg5.field2167);
        } else {
            arg4.method3744(arg5.field2165 / 2 + arg0 + var12 - arg4.field3206 / 2, arg5.field2166 / 2 + arg1 - var13 - arg4.field3212 / 2);
        }
    }

    @ObfuscatedName("au.dc(Ljava/lang/String;ZI)Z")
    public static boolean method834(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class205.method2254(arg0, Statics.field16);
        for (int var3 = 0; var3 < field472; var3++) {
            if (var2.equalsIgnoreCase(class205.method2254(field470[var3].field161, Statics.field16)) && (!arg1 || field470[var3].field160 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class205.method2254(Statics.field129.field259, Statics.field16))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("dv.dt(Ljava/lang/String;I)Z")
    public static boolean method2080(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class205.method2254(arg0, Statics.field16);
        for (int var2 = 0; var2 < field564; var2++) {
            class20 var3 = field565[var2];
            if (var1.equalsIgnoreCase(class205.method2254(var3.field228, Statics.field16))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class205.method2254(var3.field222, Statics.field16))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ct.ef(Ljava/lang/String;IB)V")
    public static final void method1577(String arg0, int arg1) {
        field337.method2775(237);
        class160 var2 = field337;
        int var3 = arg0.length() + 1;
        var2.method2531(var3 + 1);
        field337.method2667(arg1);
        field337.method2537(arg0);
    }

    @ObfuscatedName("cl.eh(Ljava/lang/String;B)V")
    public static final void method1761(String arg0) {
        if (Statics.field1037 == null) {
            return;
        }
        field337.method2775(223);
        class160 var1 = field337;
        int var2 = arg0.length() + 1;
        var1.method2531(var2);
        field337.method2537(arg0);
    }

    @ObfuscatedName("k.ew(Ljava/lang/String;I)V")
    public static final void method80(String arg0) {
        if (arg0.equals("")) {
            return;
        }
        field337.method2775(144);
        class160 var1 = field337;
        int var2 = arg0.length() + 1;
        var1.method2531(var2);
        field337.method2537(arg0);
    }

    @ObfuscatedName("r.ez(I)V")
    public static final void method103() {
        field337.method2775(144);
        field337.method2531(0);
    }

    @ObfuscatedName("m.en(II)V")
    public static void method145(int arg0) {
        for (class134 var1 = (class134) field341.method2140(); var1 != null; var1 = (class134) field341.method2134()) {
            if ((var1.field1889 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method2179();
            }
        }
    }

    @ObfuscatedName("ft.ed(Lfx;I)I")
    public static int method2959(class170 arg0) {
        class134 var1 = (class134) field341.method2131(((long) arg0.field2210 << 32) + (long) arg0.field2211);
        return var1 == null ? arg0.field2282 : var1.field1902;
    }

    @ObfuscatedName("x.ev(Lfx;B)Lfx;")
    public static class170 method98(class170 arg0) {
        int var1 = class171.method648(method2959(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class170.method1882(arg0.field2229);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("j.ep(Lfx;B)Z")
    public static boolean method150(class170 arg0) {
        if (field462) {
            if (method2959(arg0) != 0) {
                return false;
            }
            if (arg0.field2272 == 0) {
                return false;
            }
        }
        return arg0.field2230;
    }

    @ObfuscatedName("ej.eq(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method2483(String arg0, boolean arg1) {
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
        if (Statics.field2117 != null) {
            var3 = "/p=" + Statics.field2117;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field301 + "/a=" + Statics.field1108 + var3 + "/";
    }

    @ObfuscatedName("fh.el(Ljava/lang/String;ZI)V")
    public static void method2982(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field2963; var5++) {
            class199 var6 = class199.method699(var5);
            if ((!arg1 || var6.field2999) && var6.field2992 == -1 && var6.field2961.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field2198 = -1;
                    Statics.field250 = null;
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
        Statics.field250 = var3;
        Statics.field919 = 0;
        Statics.field2198 = var4;
        String[] var9 = new String[Statics.field2198];
        for (int var10 = 0; var10 < Statics.field2198; var10++) {
            var9[var10] = class199.method699(var3[var10]).field2961;
        }
        short[] var11 = Statics.field250;
        class151.method192(var9, var11, 0, var9.length - 1);
    }
}

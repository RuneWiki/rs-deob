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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Date;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class114 {

    @ObfuscatedName("client.c")
    public static boolean field286 = true;

    @ObfuscatedName("client.l")
    public static int field287 = 1;

    @ObfuscatedName("client.j")
    public static int field288 = 0;

    @ObfuscatedName("client.s")
    public static int field562 = 0;

    @ObfuscatedName("client.k")
    public static boolean field356 = false;

    @ObfuscatedName("client.f")
    public static boolean field569 = false;

    @ObfuscatedName("client.a")
    public static int field314 = 0;

    @ObfuscatedName("client.i")
    public static int field295 = 0;

    @ObfuscatedName("client.z")
    public static boolean field296 = true;

    @ObfuscatedName("client.n")
    public static int field489 = 0;

    @ObfuscatedName("client.w")
    public static class118[] field348 = new class118[4];

    @ObfuscatedName("client.h")
    public static long field477 = -1L;

    @ObfuscatedName("client.m")
    public static int field299 = -1;

    @ObfuscatedName("client.p")
    public static int field300 = -1;

    @ObfuscatedName("client.aq")
    public static int field534 = -1;

    @ObfuscatedName("client.aj")
    public static boolean field385 = true;

    @ObfuscatedName("client.ae")
    public static boolean field303 = false;

    @ObfuscatedName("client.au")
    public static int field304 = 0;

    @ObfuscatedName("client.aa")
    public static int field285 = 0;

    @ObfuscatedName("client.af")
    public static int field306 = 0;

    @ObfuscatedName("client.at")
    public static int field503 = 0;

    @ObfuscatedName("client.ap")
    public static int field308 = 0;

    @ObfuscatedName("client.aw")
    public static int field309 = 0;

    @ObfuscatedName("client.ah")
    public static int field310 = 0;

    @ObfuscatedName("client.ao")
    public static int field311 = 0;

    @ObfuscatedName("client.ag")
    public static int field312 = 0;

    @ObfuscatedName("client.as")
    public static class41 field313 = class41.field811;

    @ObfuscatedName("client.ak")
    public static class41 field377 = class41.field811;

    @ObfuscatedName("client.av")
    public static int field353 = 0;

    @ObfuscatedName("client.am")
    public static int field316 = 0;

    @ObfuscatedName("client.ar")
    public static int field317 = 0;

    @ObfuscatedName("client.bb")
    public static int field490 = 0;

    @ObfuscatedName("client.bl")
    public static int field319 = 0;

    @ObfuscatedName("client.bm")
    public static int field320 = 0;

    @ObfuscatedName("client.bw")
    public static int field560 = 0;

    @ObfuscatedName("client.bs")
    public static int field478 = 0;

    @ObfuscatedName("client.cp")
    public static class36[] field324 = new class36[32768];

    @ObfuscatedName("client.cf")
    public static int field325 = 0;

    @ObfuscatedName("client.ct")
    public static int[] field326 = new int[32768];

    @ObfuscatedName("client.co")
    public static int field403 = 0;

    @ObfuscatedName("client.cl")
    public static int[] field378 = new int[250];

    @ObfuscatedName("client.ci")
    public static class160 field417 = new class160(5000);

    @ObfuscatedName("client.cv")
    public static class160 field401 = new class160(5000);

    @ObfuscatedName("client.cq")
    public static class160 field331 = new class160(15000);

    @ObfuscatedName("client.cx")
    public static int field332 = 0;

    @ObfuscatedName("client.ck")
    public static int field419 = 0;

    @ObfuscatedName("client.cm")
    public static int field334 = 0;

    @ObfuscatedName("client.ce")
    public static int field335 = 0;

    @ObfuscatedName("client.cz")
    public static int field336 = 0;

    @ObfuscatedName("client.cu")
    public static int field322 = 0;

    @ObfuscatedName("client.cs")
    public static int field338 = 0;

    @ObfuscatedName("client.cr")
    public static int field483 = 0;

    @ObfuscatedName("client.cd")
    public static boolean field340 = false;

    @ObfuscatedName("client.db")
    public static int field342 = 0;

    @ObfuscatedName("client.dl")
    public static int field343 = 1;

    @ObfuscatedName("client.dx")
    public static int field344 = 0;

    @ObfuscatedName("client.dm")
    public static int field345 = 1;

    @ObfuscatedName("client.dt")
    public static int field346 = 0;

    @ObfuscatedName("client.di")
    public static boolean field496 = false;

    @ObfuscatedName("client.dv")
    public static int[][][] field330 = new int[4][13][13];

    @ObfuscatedName("client.dp")
    public static final int[] field351 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dr")
    public static int field467 = 0;

    @ObfuscatedName("client.dq")
    public static int field412 = 2;

    @ObfuscatedName("client.dz")
    public static int field354 = 0;

    @ObfuscatedName("client.da")
    public static int field355 = 2;

    @ObfuscatedName("client.dh")
    public static int field352 = 0;

    @ObfuscatedName("client.eg")
    public static int field357 = 1;

    @ObfuscatedName("client.ef")
    public static int field358 = 0;

    @ObfuscatedName("client.er")
    public static int field359 = 0;

    @ObfuscatedName("client.ed")
    public static int field435 = 2;

    @ObfuscatedName("client.ez")
    public static int field315 = 0;

    @ObfuscatedName("client.en")
    public static int field362 = 1;

    @ObfuscatedName("client.ej")
    public static int field363 = 0;

    @ObfuscatedName("client.ew")
    public static int field361 = 0;

    @ObfuscatedName("client.es")
    public static int field365 = 2301979;

    @ObfuscatedName("client.el")
    public static int field366 = 5063219;

    @ObfuscatedName("client.ek")
    public static int field484 = 3353893;

    @ObfuscatedName("client.ec")
    public static int field368 = 7759444;

    @ObfuscatedName("client.ee")
    public static boolean field369 = false;

    @ObfuscatedName("client.ep")
    public static int field370 = 0;

    @ObfuscatedName("client.fg")
    public static int field371 = 128;

    @ObfuscatedName("client.fr")
    public static int field468 = 0;

    @ObfuscatedName("client.fz")
    public static int field373 = 0;

    @ObfuscatedName("client.fk")
    public static int field374 = 0;

    @ObfuscatedName("client.fl")
    public static int field376 = 0;

    @ObfuscatedName("client.fp")
    public static int field307 = 0;

    @ObfuscatedName("client.fe")
    public static int field450 = 50;

    @ObfuscatedName("client.fq")
    public static int field367 = 0;

    @ObfuscatedName("client.fi")
    public static boolean field379 = false;

    @ObfuscatedName("client.fu")
    public static int field380 = 0;

    @ObfuscatedName("client.fo")
    public static int field360 = 0;

    @ObfuscatedName("client.fc")
    public static int field382 = 50;

    @ObfuscatedName("client.fb")
    public static int[] field383 = new int[field382];

    @ObfuscatedName("client.fv")
    public static int[] field384 = new int[field382];

    @ObfuscatedName("client.fd")
    public static int[] field543 = new int[field382];

    @ObfuscatedName("client.fx")
    public static int[] field386 = new int[field382];

    @ObfuscatedName("client.fy")
    public static int[] field460 = new int[field382];

    @ObfuscatedName("client.fm")
    public static int[] field388 = new int[field382];

    @ObfuscatedName("client.fs")
    public static int[] field389 = new int[field382];

    @ObfuscatedName("client.gv")
    public static String[] field390 = new String[field382];

    @ObfuscatedName("client.gr")
    public static int[][] field391 = new int[104][104];

    @ObfuscatedName("client.gz")
    public static int field392 = 0;

    @ObfuscatedName("client.gq")
    public static int field439 = -1;

    @ObfuscatedName("client.gm")
    public static int field284 = -1;

    @ObfuscatedName("client.gh")
    public static int field395 = 0;

    @ObfuscatedName("client.gf")
    public static int field396 = 0;

    @ObfuscatedName("client.gk")
    public static int field350 = 0;

    @ObfuscatedName("client.gp")
    public static int field333 = 0;

    @ObfuscatedName("client.gj")
    public static int field399 = 0;

    @ObfuscatedName("client.gb")
    public static int field400 = 0;

    @ObfuscatedName("client.gu")
    public static int field387 = 0;

    @ObfuscatedName("client.ga")
    public static int field402 = 0;

    @ObfuscatedName("client.gt")
    public static int field321 = 0;

    @ObfuscatedName("client.gl")
    public static int field398 = 0;

    @ObfuscatedName("client.gx")
    public static boolean field405 = false;

    @ObfuscatedName("client.gn")
    public static int field406 = 0;

    @ObfuscatedName("client.gd")
    public static int field407 = 0;

    @ObfuscatedName("client.gg")
    public static class24[] field408 = new class24[2048];

    @ObfuscatedName("client.gc")
    public static int field431 = -1;

    @ObfuscatedName("client.gy")
    public static int field482 = 0;

    @ObfuscatedName("client.hn")
    public static int field422 = 0;

    @ObfuscatedName("client.hr")
    public static int[] field476 = new int[1000];

    @ObfuscatedName("client.hd")
    public static final int[] field323 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hb")
    public static String[] field414 = new String[8];

    @ObfuscatedName("client.hs")
    public static boolean[] field415 = new boolean[8];

    @ObfuscatedName("client.hc")
    public static int[] field416 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ha")
    public static int field375 = -1;

    @ObfuscatedName("client.hm")
    public static class129[][][] field418 = new class129[4][104][104];

    @ObfuscatedName("client.he")
    public static class129 field302 = new class129();

    @ObfuscatedName("client.ho")
    public static class129 field420 = new class129();

    @ObfuscatedName("client.hk")
    public static class129 field421 = new class129();

    @ObfuscatedName("client.hv")
    public static int[] field546 = new int[25];

    @ObfuscatedName("client.hw")
    public static int[] field508 = new int[25];

    @ObfuscatedName("client.hf")
    public static int[] field424 = new int[25];

    @ObfuscatedName("client.hg")
    public static int field425 = 0;

    @ObfuscatedName("client.hp")
    public static boolean field426 = false;

    @ObfuscatedName("client.ht")
    public static int field427 = 0;

    @ObfuscatedName("client.hh")
    public static int[] field428 = new int[500];

    @ObfuscatedName("client.hy")
    public static int[] field404 = new int[500];

    @ObfuscatedName("client.iq")
    public static int[] field301 = new int[500];

    @ObfuscatedName("client.ik")
    public static int[] field451 = new int[500];

    @ObfuscatedName("client.il")
    public static String[] field432 = new String[500];

    @ObfuscatedName("client.ih")
    public static String[] field567 = new String[500];

    @ObfuscatedName("client.ie")
    public static boolean field434 = false;

    @ObfuscatedName("client.im")
    public static int field458 = -1;

    @ObfuscatedName("client.is")
    public static boolean field436 = false;

    @ObfuscatedName("client.io")
    public static int field437 = -1;

    @ObfuscatedName("client.id")
    public static int field438 = -1;

    @ObfuscatedName("client.ip")
    public static int field531 = 0;

    @ObfuscatedName("client.iu")
    public static int field410 = 50;

    @ObfuscatedName("client.iw")
    public static int field441 = 0;

    @ObfuscatedName("client.it")
    public static String field337 = null;

    @ObfuscatedName("client.iy")
    public static boolean field443 = false;

    @ObfuscatedName("client.ig")
    public static int field444 = -1;

    @ObfuscatedName("client.ic")
    public static int field445 = -1;

    @ObfuscatedName("client.if")
    public static String field446 = null;

    @ObfuscatedName("client.jt")
    public static String field447 = null;

    @ObfuscatedName("client.jk")
    public static int field448 = -1;

    @ObfuscatedName("client.jr")
    public static class126 field449 = new class126(8);

    @ObfuscatedName("client.ji")
    public static int field429 = 0;

    @ObfuscatedName("client.jg")
    public static int field327 = 0;

    @ObfuscatedName("client.jm")
    public static class170 field452 = null;

    @ObfuscatedName("client.jz")
    public static int field453 = 0;

    @ObfuscatedName("client.jf")
    public static int field454 = 0;

    @ObfuscatedName("client.jx")
    public static int field507 = 0;

    @ObfuscatedName("client.jh")
    public static int field456 = -1;

    @ObfuscatedName("client.jp")
    public static boolean field440 = false;

    @ObfuscatedName("client.jn")
    public static boolean field290 = false;

    @ObfuscatedName("client.jd")
    public static boolean field459 = false;

    @ObfuscatedName("client.jo")
    public static class170 field455 = null;

    @ObfuscatedName("client.js")
    public static class170 field461 = null;

    @ObfuscatedName("client.jw")
    public static class170 field328 = null;

    @ObfuscatedName("client.jj")
    public static int field463 = 0;

    @ObfuscatedName("client.ja")
    public static int field464 = 0;

    @ObfuscatedName("client.ju")
    public static class170 field465 = null;

    @ObfuscatedName("client.jb")
    public static boolean field466 = false;

    @ObfuscatedName("client.jv")
    public static int field501 = -1;

    @ObfuscatedName("client.jc")
    public static int field497 = -1;

    @ObfuscatedName("client.jq")
    public static boolean field469 = false;

    @ObfuscatedName("client.jl")
    public static int field571 = -1;

    @ObfuscatedName("client.jy")
    public static int field471 = -1;

    @ObfuscatedName("client.je")
    public static boolean field472 = false;

    @ObfuscatedName("client.kl")
    public static int field293 = 1;

    @ObfuscatedName("client.ku")
    public static int[] field474 = new int[32];

    @ObfuscatedName("client.kn")
    public static int field475 = 0;

    @ObfuscatedName("client.ko")
    public static int[] field409 = new int[32];

    @ObfuscatedName("client.kf")
    public static int field522 = 0;

    @ObfuscatedName("client.ki")
    public static int[] field523 = new int[32];

    @ObfuscatedName("client.kw")
    public static int field519 = 0;

    @ObfuscatedName("client.kk")
    public static int field381 = 0;

    @ObfuscatedName("client.kg")
    public static int field481 = 0;

    @ObfuscatedName("client.ka")
    public static int field563 = 0;

    @ObfuscatedName("client.kr")
    public static int field442 = 0;

    @ObfuscatedName("client.kp")
    public static int field488 = 0;

    @ObfuscatedName("client.kq")
    public static int field485 = 0;

    @ObfuscatedName("client.km")
    public static int field486 = 0;

    @ObfuscatedName("client.kx")
    public static class129 field487 = new class129();

    @ObfuscatedName("client.ks")
    public static class129 field411 = new class129();

    @ObfuscatedName("client.kj")
    public static class129 field551 = new class129();

    @ObfuscatedName("client.kb")
    public static class126 field298 = new class126(512);

    @ObfuscatedName("client.lz")
    public static int field491 = 0;

    @ObfuscatedName("client.lc")
    public static int field512 = -2;

    @ObfuscatedName("client.ly")
    public static boolean[] field493 = new boolean[100];

    @ObfuscatedName("client.le")
    public static boolean[] field494 = new boolean[100];

    @ObfuscatedName("client.lx")
    public static boolean[] field495 = new boolean[100];

    @ObfuscatedName("client.ln")
    public static int[] field470 = new int[100];

    @ObfuscatedName("client.lw")
    public static int[] field372 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field498 = new int[100];

    @ObfuscatedName("client.lh")
    public static int[] field499 = new int[100];

    @ObfuscatedName("client.lg")
    public static int field500 = 0;

    @ObfuscatedName("client.lj")
    public static long field433 = 0L;

    @ObfuscatedName("client.lv")
    public static boolean field502 = true;

    @ObfuscatedName("client.ld")
    public static int field566 = 765;

    @ObfuscatedName("client.lq")
    public static int field504 = 503;

    @ObfuscatedName("client.lo")
    public static int[] field505 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ll")
    public static int field506 = 0;

    @ObfuscatedName("client.lb")
    public static int field473 = 0;

    @ObfuscatedName("client.lp")
    public static String field413 = "";

    @ObfuscatedName("client.lf")
    public static long[] field509 = new long[100];

    @ObfuscatedName("client.mk")
    public static int field510 = 0;

    @ObfuscatedName("client.ml")
    public static int field511 = 0;

    @ObfuscatedName("client.mw")
    public static int[] field513 = new int[128];

    @ObfuscatedName("client.mi")
    public static int[] field462 = new int[128];

    @ObfuscatedName("client.mg")
    public static long field514 = -1L;

    @ObfuscatedName("client.ma")
    public static String field515 = null;

    @ObfuscatedName("client.ms")
    public static String field516 = null;

    @ObfuscatedName("client.mr")
    public static int field517 = -1;

    @ObfuscatedName("client.mf")
    public static int field518 = 0;

    @ObfuscatedName("client.mz")
    public static int[] field492 = new int[1000];

    @ObfuscatedName("client.mj")
    public static int[] field520 = new int[1000];

    @ObfuscatedName("client.my")
    public static class225[] field521 = new class225[1000];

    @ObfuscatedName("client.mo")
    public static int field292 = 0;

    @ObfuscatedName("client.me")
    public static int field305 = 0;

    @ObfuscatedName("client.mt")
    public static int field524 = 0;

    @ObfuscatedName("client.nm")
    public static int field525 = 255;

    @ObfuscatedName("client.nr")
    public static int field526 = -1;

    @ObfuscatedName("client.nl")
    public static boolean field527 = false;

    @ObfuscatedName("client.nd")
    public static int field528 = 127;

    @ObfuscatedName("client.np")
    public static int field393 = 127;

    @ObfuscatedName("client.nn")
    public static int field530 = 0;

    @ObfuscatedName("client.nx")
    public static int[] field536 = new int[50];

    @ObfuscatedName("client.ng")
    public static int[] field532 = new int[50];

    @ObfuscatedName("client.nw")
    public static int[] field533 = new int[50];

    @ObfuscatedName("client.nf")
    public static int[] field529 = new int[50];

    @ObfuscatedName("client.ne")
    public static class54[] field535 = new class54[50];

    @ObfuscatedName("client.ns")
    public static boolean field565 = false;

    @ObfuscatedName("client.oz")
    public static boolean[] field537 = new boolean[5];

    @ObfuscatedName("client.oh")
    public static int[] field538 = new int[5];

    @ObfuscatedName("client.oq")
    public static int[] field539 = new int[5];

    @ObfuscatedName("client.of")
    public static int[] field540 = new int[5];

    @ObfuscatedName("client.oe")
    public static int[] field541 = new int[5];

    @ObfuscatedName("client.on")
    public static short field542 = 256;

    @ObfuscatedName("client.oj")
    public static short field397 = 205;

    @ObfuscatedName("client.oy")
    public static short field544 = 256;

    @ObfuscatedName("client.od")
    public static short field545 = 320;

    @ObfuscatedName("client.op")
    public static short field457 = 1;

    @ObfuscatedName("client.or")
    public static short field547 = 32767;

    @ObfuscatedName("client.os")
    public static short field548 = 1;

    @ObfuscatedName("client.ol")
    public static short field549 = 32767;

    @ObfuscatedName("client.ox")
    public static int field550 = 0;

    @ObfuscatedName("client.ow")
    public static int field291 = 0;

    @ObfuscatedName("client.om")
    public static int field552 = 0;

    @ObfuscatedName("client.ok")
    public static int field553 = 0;

    @ObfuscatedName("client.oc")
    public static int field554 = 0;

    @ObfuscatedName("client.oi")
    public static int field555 = 0;

    @ObfuscatedName("client.ov")
    public static int field556 = 0;

    @ObfuscatedName("client.og")
    public static class15[] field557 = new class15[400];

    @ObfuscatedName("client.ou")
    public static class131 field558 = new class131();

    @ObfuscatedName("client.pz")
    public static int field329 = 0;

    @ObfuscatedName("client.pr")
    public static class20[] field423 = new class20[400];

    @ObfuscatedName("client.po")
    public static class167 field561 = new class167();

    @ObfuscatedName("client.pw")
    public static int field364 = -1;

    @ObfuscatedName("client.pm")
    public static int field559 = -1;

    @ObfuscatedName("client.px")
    public static class5[] field564 = new class5[8];

    @ObfuscatedName("client.pi")
    public static long field480 = -1L;

    @ObfuscatedName("client.py")
    public static long field430 = -1L;

    @ObfuscatedName("client.pl")
    public static final class23 field394 = new class23();

    @ObfuscatedName("client.pv")
    public static int[] field568 = new int[50];

    @ObfuscatedName("client.pe")
    public static int[] field349 = new int[50];

    @ObfuscatedName("client.l(I)V")
    public final void method513() {
    }

    public final void init() {
        if (!this.method2079()) {
            return;
        }
        class215[] var1 = class215.method1401();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class215 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3162);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3162)) {
                    case 2:
                        class180[] var5 = new class180[] { class180.field2696, class180.field2693, class180.field2692, class180.field2700, class180.field2694, class180.field2690 };
                        Statics.field77 = (class180) class149.method1841(var5, Integer.parseInt(var4));
                        if (Statics.field77 == class180.field2696) {
                            Statics.field2108 = class229.field3251;
                        } else {
                            Statics.field2108 = class229.field3259;
                        }
                        break;
                    case 3:
                        field287 = Integer.parseInt(var4);
                        break;
                    case 4:
                        Statics.field27 = Integer.parseInt(var4);
                        break;
                    case 5:
                        Statics.field289 = class179.method2992(Integer.parseInt(var4));
                        break;
                    case 6:
                        if (var4.equalsIgnoreCase(class38.field778)) {
                        }
                        break;
                    case 7:
                        field562 = Integer.parseInt(var4);
                    case 8:
                    default:
                        break;
                    case 9:
                        Statics.field182 = var4;
                        break;
                    case 10:
                        field288 = Integer.parseInt(var4);
                        break;
                    case 11:
                        if (var4.equalsIgnoreCase(class38.field778)) {
                            field356 = true;
                        } else {
                            field356 = false;
                        }
                        break;
                    case 12:
                        field314 = Integer.parseInt(var4);
                        break;
                    case 13:
                        Statics.field16 = var4;
                        break;
                    case 14:
                        Statics.field294 = Integer.parseInt(var4);
                }
            }
        }
        class88.field1510 = false;
        field569 = false;
        Statics.field2030 = this.getCodeBase().getHost();
        String var6 = Statics.field289.field2681;
        byte var7 = 0;
        try {
            Statics.field106 = 16;
            Statics.field1670 = var7;
            try {
                Statics.field1427 = System.getProperty("os.name");
            } catch (Exception var53) {
                Statics.field1427 = "Unknown";
            }
            Statics.field95 = Statics.field1427.toLowerCase();
            try {
                Statics.field3266 = System.getProperty("user.home");
                if (Statics.field3266 != null) {
                    Statics.field3266 = Statics.field3266 + "/";
                }
            } catch (Exception var52) {
            }
            try {
                if (Statics.field95.startsWith("win")) {
                    if (Statics.field3266 == null) {
                        Statics.field3266 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field3266 == null) {
                    Statics.field3266 = System.getenv("HOME");
                }
                if (Statics.field3266 != null) {
                    Statics.field3266 = Statics.field3266 + "/";
                }
            } catch (Exception var51) {
            }
            if (Statics.field3266 == null) {
                Statics.field3266 = "~/";
            }
            Statics.field1996 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field3266, "/tmp/", "" };
            Statics.field937 = new String[] { ".jagex_cache_" + Statics.field1670, ".file_store_" + Statics.field1670 };
            int var11 = 0;
            label285: while (var11 < 4) {
                String var12 = var11 == 0 ? "" : "" + var11;
                Statics.field1684 = new File(Statics.field3266, "jagex_cl_oldschool_" + var6 + var12 + ".dat");
                String var13 = null;
                String var14 = null;
                boolean var15 = false;
                if (Statics.field1684.exists()) {
                    try {
                        class74 var16 = new class74(Statics.field1684, "rw", 10000L);
                        class154 var17 = new class154((int) var16.method1362());
                        while (var17.field2079 < var17.field2084.length) {
                            int var18 = var16.method1375(var17.field2084, var17.field2079, var17.field2084.length - var17.field2079);
                            if (var18 == -1) {
                                throw new IOException();
                            }
                            var17.field2079 += var18;
                        }
                        var17.field2079 = 0;
                        int var19 = var17.method2669();
                        if (var19 < 1 || var19 > 3) {
                            throw new IOException("" + var19);
                        }
                        int var20 = 0;
                        if (var19 > 1) {
                            var20 = var17.method2669();
                        }
                        if (var19 <= 2) {
                            var13 = var17.method2678();
                            if (var20 == 1) {
                                var14 = var17.method2678();
                            }
                        } else {
                            var13 = var17.method2736();
                            if (var20 == 1) {
                                var14 = var17.method2736();
                            }
                        }
                        var16.method1356();
                    } catch (IOException var56) {
                        var56.printStackTrace();
                    }
                    if (var13 != null) {
                        File var22 = new File(var13);
                        if (!var22.exists()) {
                            var13 = null;
                        }
                    }
                    if (var13 != null) {
                        File var23 = new File(var13, "test.dat");
                        if (!class105.method2904(var23, true)) {
                            var13 = null;
                        }
                    }
                }
                if (var13 == null && var11 == 0) {
                    label259: for (int var24 = 0; var24 < Statics.field937.length; var24++) {
                        for (int var25 = 0; var25 < Statics.field1996.length; var25++) {
                            File var26 = new File(Statics.field1996[var25] + Statics.field937[var24] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var26.exists() && class105.method2904(new File(var26, "test.dat"), true)) {
                                var13 = var26.toString();
                                var15 = true;
                                break label259;
                            }
                        }
                    }
                }
                if (var13 == null) {
                    var13 = Statics.field3266 + File.separatorChar + "jagexcache" + var12 + File.separatorChar + "oldschool" + File.separatorChar + var6 + File.separatorChar;
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
                    } catch (Exception var55) {
                        var55.printStackTrace();
                    }
                    var15 = true;
                }
                if (var15) {
                    class105.method723(new File(var13), (File) null);
                }
                File var36 = new File(var13);
                Statics.field1681 = var36;
                if (!Statics.field1681.exists()) {
                    Statics.field1681.mkdirs();
                }
                File[] var37 = Statics.field1681.listFiles();
                if (var37 != null) {
                    File[] var38 = var37;
                    for (int var39 = 0; var39 < var38.length; var39++) {
                        File var40 = var38[var39];
                        if (!class105.method2904(var40, false)) {
                            var11++;
                            continue label285;
                        }
                    }
                }
                break;
            }
            File var41 = Statics.field1681;
            Statics.field3086 = var41;
            if (!Statics.field3086.exists()) {
                throw new RuntimeException("");
            }
            class108.field1719 = true;
            try {
                File var42 = new File(Statics.field3266, "random.dat");
                if (var42.exists()) {
                    class105.field1678 = new class73(new class74(var42, "rw", 25L), 24, 0);
                } else {
                    label208: for (int var43 = 0; var43 < Statics.field937.length; var43++) {
                        for (int var44 = 0; var44 < Statics.field1996.length; var44++) {
                            File var45 = new File(Statics.field1996[var44] + Statics.field937[var43] + File.separatorChar + "random.dat");
                            if (var45.exists()) {
                                class105.field1678 = new class73(new class74(var45, "rw", 25L), 24, 0);
                                break label208;
                            }
                        }
                    }
                }
                if (class105.field1678 == null) {
                    RandomAccessFile var46 = new RandomAccessFile(var42, "rw");
                    int var47 = var46.read();
                    var46.seek(0L);
                    var46.write(var47);
                    var46.seek(0L);
                    var46.close();
                    class105.field1678 = new class73(new class74(var42, "rw", 25L), 24, 0);
                }
            } catch (IOException var54) {
            }
            class105.field1679 = new class73(new class74(class108.method16("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class105.field1680 = new class73(new class74(class108.method16("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1674 = new class73[Statics.field106];
            for (int var49 = 0; var49 < Statics.field106; var49++) {
                Statics.field1674[var49] = new class73(new class74(class108.method16("main_file_cache.idx" + var49), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var57) {
            class102.method24((String) null, var57);
        }
        Statics.field297 = this;
        this.method2025(765, 503, 134);
    }

    @ObfuscatedName("client.j(I)V")
    public final void method407() {
        Statics.field2688 = field562 == 0 ? 43594 : field287 + 40000;
        Statics.field183 = field562 == 0 ? 443 : field287 + 50000;
        Statics.field901 = Statics.field2688;
        Statics.field2166 = class168.field2183;
        Statics.field2168 = class168.field2181;
        Statics.field142 = class168.field2180;
        Statics.field1303 = class168.field2178;
        class106.method2206();
        Canvas var1 = Statics.field1995;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class106.field1691);
        var1.addFocusListener(class106.field1691);
        Canvas var2 = Statics.field1995;
        var2.addMouseListener(class116.field1799);
        var2.addMouseMotionListener(class116.field1799);
        var2.addFocusListener(class116.field1799);
        class107 var3;
        try {
            var3 = new class107();
        } catch (Throwable var7) {
            var3 = null;
        }
        Statics.field1989 = var3;
        if (Statics.field1989 != null) {
            Statics.field1989.method1970(Statics.field1995);
        }
        Statics.field98 = new class117(255, class105.field1679, class105.field1680, 500000);
        Statics.field2073 = class31.method569();
        Statics.field1217 = this.getToolkit().getSystemClipboard();
        String var6 = Statics.field1212;
        class115.field1779 = this;
        class115.field1773 = var6;
        if (field562 != 0) {
            field303 = true;
        }
        method2949(Statics.field2073.field698);
    }

    @ObfuscatedName("client.t(S)V")
    public final void method276() {
        field489++;
        this.method505();
        while (true) {
            class129 var1 = class184.field2735;
            class181 var2;
            synchronized (class184.field2735) {
                var2 = (class181) class184.field2739.method2311();
            }
            if (var2 == null) {
                class139.method901();
                method918();
                class106.method811();
                class116.method1055();
                if (Statics.field1989 != null) {
                    int var4 = Statics.field1989.method1972();
                    field486 = var4;
                }
                if (field295 == 0) {
                    method646();
                    class114.method1350();
                } else if (field295 == 5) {
                    class42.method2919(this);
                    method646();
                    class114.method1350();
                } else if (field295 == 10 || field295 == 11) {
                    class42.method2919(this);
                } else if (field295 == 20) {
                    class42.method2919(this);
                    Statics.method181();
                } else if (field295 == 25) {
                    method2109();
                }
                if (field295 == 30) {
                    if (field304 > 1) {
                        field304--;
                    }
                    if (field483 > 0) {
                        field483--;
                    }
                    if (field340) {
                        field340 = false;
                        method3631();
                    } else {
                        if (!field426) {
                            method812();
                        }
                        for (int var5 = 0; var5 < 100 && method770(); var5++) {
                        }
                        if (field295 == 30) {
                            while (true) {
                                class227 var6 = (class227) class228.field3246.method2277();
                                boolean var7;
                                if (var6 == null) {
                                    var7 = false;
                                } else {
                                    var7 = true;
                                }
                                if (!var7) {
                                    Object var9 = Statics.field697.field222;
                                    synchronized (Statics.field697.field222) {
                                        if (!field286) {
                                            Statics.field697.field223 = 0;
                                        } else if (class116.field1793 != 0 || Statics.field697.field223 >= 40) {
                                            field417.method2920(69);
                                            field417.method2780(0);
                                            int var10 = field417.field2079;
                                            int var11 = 0;
                                            for (int var12 = 0; var12 < Statics.field697.field223 && field417.field2079 - var10 < 240; var12++) {
                                                var11++;
                                                int var13 = Statics.field697.field225[var12];
                                                if (var13 < 0) {
                                                    var13 = 0;
                                                } else if (var13 > 502) {
                                                    var13 = 502;
                                                }
                                                int var14 = Statics.field697.field229[var12];
                                                if (var14 < 0) {
                                                    var14 = 0;
                                                } else if (var14 > 764) {
                                                    var14 = 764;
                                                }
                                                int var15 = var13 * 765 + var14;
                                                if (Statics.field697.field225[var12] == -1 && Statics.field697.field229[var12] == -1) {
                                                    var14 = -1;
                                                    var13 = -1;
                                                    var15 = 524287;
                                                }
                                                if (field299 != var14 || field300 != var13) {
                                                    int var16 = var14 - field299;
                                                    field299 = var14;
                                                    int var17 = var13 - field300;
                                                    field300 = var13;
                                                    if (field534 < 8 && var16 >= -32 && var16 <= 31 && var17 >= -32 && var17 <= 31) {
                                                        var16 += 32;
                                                        var17 += 32;
                                                        field417.method2793((field534 << 12) + (var16 << 6) + var17);
                                                        field534 = 0;
                                                    } else if (field534 < 8) {
                                                        field417.method2656((field534 << 19) + 8388608 + var15);
                                                        field534 = 0;
                                                    } else {
                                                        field417.method2658((field534 << 19) + -1073741824 + var15);
                                                        field534 = 0;
                                                    }
                                                } else if (field534 < 2047) {
                                                    field534++;
                                                }
                                            }
                                            field417.method2657(field417.field2079 - var10);
                                            if (var11 >= Statics.field697.field223) {
                                                Statics.field697.field223 = 0;
                                            } else {
                                                Statics.field697.field223 -= var11;
                                                for (int var18 = 0; var18 < Statics.field697.field223; var18++) {
                                                    Statics.field697.field229[var18] = Statics.field697.field229[var11 + var18];
                                                    Statics.field697.field225[var18] = Statics.field697.field225[var11 + var18];
                                                }
                                            }
                                        }
                                    }
                                    if (class116.field1793 == 1 || !Statics.field1832 && class116.field1793 == 4 || class116.field1793 == 2) {
                                        long var20 = (class116.field1796 - field477) / 50L;
                                        if (var20 > 4095L) {
                                            var20 = 4095L;
                                        }
                                        field477 = class116.field1796;
                                        int var22 = class116.field1781;
                                        if (var22 < 0) {
                                            var22 = 0;
                                        } else if (var22 > Statics.field2788) {
                                            var22 = Statics.field2788;
                                        }
                                        int var23 = class116.field1782;
                                        if (var23 < 0) {
                                            var23 = 0;
                                        } else if (var23 > Statics.field1559) {
                                            var23 = Statics.field1559;
                                        }
                                        int var24 = (int) var20;
                                        field417.method2920(112);
                                        field417.method2793((class116.field1793 == 2 ? 1 : 0) + (var24 << 1));
                                        field417.method2793(var23);
                                        field417.method2793(var22);
                                    }
                                    if (class106.field1705 > 0) {
                                        field417.method2920(139);
                                        field417.method2793(0);
                                        int var25 = field417.field2079;
                                        long var26 = class156.method81();
                                        for (int var28 = 0; var28 < class106.field1705; var28++) {
                                            long var29 = var26 - field514;
                                            if (var29 > 16777215L) {
                                                var29 = 16777215L;
                                            }
                                            field514 = var26;
                                            field417.method2780(class106.field1703[var28]);
                                            field417.method2710((int) var29);
                                        }
                                        field417.method2665(field417.field2079 - var25);
                                    }
                                    if (field367 > 0) {
                                        field367--;
                                    }
                                    if (class106.field1711[96] || class106.field1711[97] || class106.field1711[98] || class106.field1711[99]) {
                                        field379 = true;
                                    }
                                    if (field379 && field367 <= 0) {
                                        field367 = 20;
                                        field379 = false;
                                        field417.method2920(214);
                                        field417.method2702(field468);
                                        field417.method2702(field371);
                                    }
                                    if (Statics.field1469 && !field385) {
                                        field385 = true;
                                        field417.method2920(182);
                                        field417.method2780(1);
                                    }
                                    if (!Statics.field1469 && field385) {
                                        field385 = false;
                                        field417.method2920(182);
                                        field417.method2780(0);
                                    }
                                    if (Statics.field967 != field517) {
                                        field517 = Statics.field967;
                                        method3106(Statics.field967);
                                    }
                                    if (field295 == 30) {
                                        for (class26 var31 = (class26) field302.method2315(); var31 != null; var31 = (class26) field302.method2332()) {
                                            if (var31.field572 > 0) {
                                                var31.field572--;
                                            }
                                            if (var31.field572 != 0) {
                                                if (var31.field578 > 0) {
                                                    var31.field578--;
                                                }
                                                if (var31.field578 == 0 && var31.field574 >= 1 && var31.field575 >= 1 && var31.field574 <= 102 && var31.field575 <= 102 && (var31.field579 < 0 || class11.method1847(var31.field579, var31.field581))) {
                                                    method169(var31.field585, var31.field583, var31.field574, var31.field575, var31.field579, var31.field580, var31.field581);
                                                    var31.field578 = -1;
                                                    if (var31.field579 == var31.field573 && var31.field573 == -1) {
                                                        var31.method2298();
                                                    } else if (var31.field579 == var31.field573 && var31.field580 == var31.field576 && var31.field582 == var31.field581) {
                                                        var31.method2298();
                                                    }
                                                }
                                            } else if (var31.field573 < 0 || class11.method1847(var31.field573, var31.field582)) {
                                                method169(var31.field585, var31.field583, var31.field574, var31.field575, var31.field573, var31.field576, var31.field582);
                                                var31.method2298();
                                            }
                                        }
                                        method88();
                                        field334++;
                                        if (field334 > 750) {
                                            method3631();
                                        } else {
                                            int var32 = class46.field913;
                                            int[] var33 = class46.field921;
                                            for (int var34 = 0; var34 < var32; var34++) {
                                                class24 var35 = field408[var33[var34]];
                                                if (var35 != null) {
                                                    method184(var35, 1);
                                                }
                                            }
                                            method650();
                                            method231();
                                            field361++;
                                            if (field333 != 0) {
                                                field350 += 20;
                                                if (field350 >= 400) {
                                                    field333 = 0;
                                                }
                                            }
                                            if (Statics.field598 != null) {
                                                field399++;
                                                if (field399 >= 15) {
                                                    method1858(Statics.field598);
                                                    Statics.field598 = null;
                                                }
                                            }
                                            class170 var36 = Statics.field3214;
                                            class170 var37 = Statics.field1993;
                                            Statics.field3214 = null;
                                            Statics.field1993 = null;
                                            field465 = null;
                                            field469 = false;
                                            field466 = false;
                                            field511 = 0;
                                            while (true) {
                                                while (class106.method1136() && field511 < 128) {
                                                    if (field507 >= 2 && class106.field1711[82] && Statics.field1101 == 66) {
                                                        String var38 = "";
                                                        Iterator var39 = class48.field942.iterator();
                                                        while (var39.hasNext()) {
                                                            class22 var40 = (class22) var39.next();
                                                            var38 = var38 + var40.field233 + ':' + var40.field235 + '\n';
                                                        }
                                                        Statics.field1217.setContents(new StringSelection(var38), (ClipboardOwner) null);
                                                    } else {
                                                        field462[field511] = Statics.field1101;
                                                        field513[field511] = Statics.field1359;
                                                        field511++;
                                                    }
                                                }
                                                if (field448 != -1) {
                                                    int var43 = field448;
                                                    int var44 = Statics.field1559;
                                                    int var45 = Statics.field2788;
                                                    if (class170.method1498(var43)) {
                                                        method2890(Statics.field2329[var43], -1, 0, 0, var44, var45, 0, 0);
                                                    }
                                                }
                                                field293++;
                                                while (true) {
                                                    class19 var46;
                                                    class170 var47;
                                                    class170 var48;
                                                    do {
                                                        var46 = (class19) field411.method2311();
                                                        if (var46 == null) {
                                                            while (true) {
                                                                class19 var49;
                                                                class170 var50;
                                                                class170 var51;
                                                                do {
                                                                    var49 = (class19) field551.method2311();
                                                                    if (var49 == null) {
                                                                        while (true) {
                                                                            class19 var52;
                                                                            class170 var53;
                                                                            class170 var54;
                                                                            do {
                                                                                var52 = (class19) field487.method2311();
                                                                                if (var52 == null) {
                                                                                    method715();
                                                                                    if (Statics.field2029 == null && field461 == null) {
                                                                                        int var55 = class116.field1793;
                                                                                        if (field426) {
                                                                                            if (var55 != 1 && (Statics.field1832 || var55 != 4)) {
                                                                                                int var56 = class116.field1787;
                                                                                                int var57 = class116.field1783 * -667823397;
                                                                                                if (var56 < Statics.field1807 - 10 || var56 > Statics.field1807 + Statics.field1720 + 10 || var57 < Statics.field1543 - 10 || var57 > Statics.field847 + Statics.field1543 + 10) {
                                                                                                    field426 = false;
                                                                                                    method1866(Statics.field1807, Statics.field1543, Statics.field1720, Statics.field847);
                                                                                                }
                                                                                            }
                                                                                            if (var55 == 1 || !Statics.field1832 && var55 == 4) {
                                                                                                int var58 = Statics.field1807;
                                                                                                int var59 = Statics.field1543;
                                                                                                int var60 = Statics.field1720;
                                                                                                int var61 = class116.field1782;
                                                                                                int var62 = class116.field1781;
                                                                                                int var63 = -1;
                                                                                                for (int var64 = 0; var64 < field427; var64++) {
                                                                                                    int var65 = (field427 - 1 - var64) * 15 + var59 + 31;
                                                                                                    if (var61 > var58 && var61 < var58 + var60 && var62 > var65 - 13 && var62 < var65 + 3) {
                                                                                                        var63 = var64;
                                                                                                    }
                                                                                                }
                                                                                                if (var63 != -1 && var63 >= 0) {
                                                                                                    int var66 = field428[var63];
                                                                                                    int var67 = field404[var63];
                                                                                                    int var68 = field301[var63];
                                                                                                    int var69 = field451[var63];
                                                                                                    String var70 = field432[var63];
                                                                                                    String var71 = field567[var63];
                                                                                                    method798(var66, var67, var68, var69, var70, var71, class116.field1782, class116.field1781);
                                                                                                }
                                                                                                field426 = false;
                                                                                                method1866(Statics.field1807, Statics.field1543, Statics.field1720, Statics.field847);
                                                                                            }
                                                                                        } else {
                                                                                            label1261: {
                                                                                                int var72 = method2388();
                                                                                                if ((var55 == 1 || !Statics.field1832 && var55 == 4) && var72 >= 0) {
                                                                                                    int var73 = field301[var72];
                                                                                                    if (var73 == 39 || var73 == 40 || var73 == 41 || var73 == 42 || var73 == 43 || var73 == 33 || var73 == 34 || var73 == 35 || var73 == 36 || var73 == 37 || var73 == 38 || var73 == 1005) {
                                                                                                        int var74 = field428[var72];
                                                                                                        int var75 = field404[var72];
                                                                                                        class170 var76 = Statics.method211(var75);
                                                                                                        if (class171.method2642(method2885(var76)) || class171.method917(method2885(var76))) {
                                                                                                            if (Statics.field2029 != null && !field405) {
                                                                                                                int var77 = method2388();
                                                                                                                if (field425 != 1 && !method1981(var77) && field427 > 0) {
                                                                                                                    int var78 = field402;
                                                                                                                    int var79 = field321;
                                                                                                                    method2157(Statics.field1070, var78, var79);
                                                                                                                    Statics.field1070 = null;
                                                                                                                }
                                                                                                            }
                                                                                                            field405 = false;
                                                                                                            field406 = 0;
                                                                                                            if (Statics.field2029 != null) {
                                                                                                                method1858(Statics.field2029);
                                                                                                            }
                                                                                                            Statics.field2029 = Statics.method211(var75);
                                                                                                            field387 = var74;
                                                                                                            field402 = class116.field1782;
                                                                                                            field321 = class116.field1781;
                                                                                                            if (var72 >= 0) {
                                                                                                                Statics.field1070 = new class39();
                                                                                                                Statics.field1070.field791 = field428[var72];
                                                                                                                Statics.field1070.field790 = field404[var72];
                                                                                                                Statics.field1070.field793 = field301[var72];
                                                                                                                Statics.field1070.field792 = field451[var72];
                                                                                                                Statics.field1070.field795 = field432[var72];
                                                                                                            }
                                                                                                            method1858(Statics.field2029);
                                                                                                            break label1261;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if ((var55 == 1 || !Statics.field1832 && var55 == 4) && (field425 == 1 && field427 > 2 && !method753() || method1981(var72))) {
                                                                                                    var55 = 2;
                                                                                                }
                                                                                                if ((var55 == 1 || !Statics.field1832 && var55 == 4) && field427 > 0 && var72 >= 0) {
                                                                                                    int var80 = field428[var72];
                                                                                                    int var81 = field404[var72];
                                                                                                    int var82 = field301[var72];
                                                                                                    int var83 = field451[var72];
                                                                                                    String var84 = field432[var72];
                                                                                                    String var85 = field567[var72];
                                                                                                    method798(var80, var81, var82, var83, var84, var85, class116.field1782, class116.field1781);
                                                                                                }
                                                                                                if (var55 == 2 && field427 > 0) {
                                                                                                    method1861(class116.field1782, class116.field1781);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (field461 != null) {
                                                                                        method1858(field461);
                                                                                        Statics.field2738++;
                                                                                        if (field469 && field466) {
                                                                                            int var86 = class116.field1787;
                                                                                            int var87 = class116.field1783 * -667823397;
                                                                                            int var88 = var86 - field463;
                                                                                            int var89 = var87 - field464;
                                                                                            if (var88 < field501) {
                                                                                                var88 = field501;
                                                                                            }
                                                                                            if (field461.field2216 + var88 > field501 + field328.field2216) {
                                                                                                var88 = field501 + field328.field2216 - field461.field2216;
                                                                                            }
                                                                                            if (var89 < field497) {
                                                                                                var89 = field497;
                                                                                            }
                                                                                            if (field461.field2217 + var89 > field497 + field328.field2217) {
                                                                                                var89 = field497 + field328.field2217 - field461.field2217;
                                                                                            }
                                                                                            int var90 = var88 - field571;
                                                                                            int var91 = var89 - field471;
                                                                                            int var92 = field461.field2259;
                                                                                            if (Statics.field2738 > field461.field2267 && (var90 > var92 || var90 < -var92 || var91 > var92 || var91 < -var92)) {
                                                                                                field472 = true;
                                                                                            }
                                                                                            int var93 = field328.field2265 + (var88 - field501);
                                                                                            int var94 = field328.field2223 + (var89 - field497);
                                                                                            if (field461.field2290 != null && field472) {
                                                                                                class19 var95 = new class19();
                                                                                                var95.field214 = field461;
                                                                                                var95.field199 = var93;
                                                                                                var95.field211 = var94;
                                                                                                var95.field203 = field461.field2290;
                                                                                                class33.method2511(var95);
                                                                                            }
                                                                                            if (class116.field1786 == 0) {
                                                                                                if (field472) {
                                                                                                    if (field461.field2291 != null) {
                                                                                                        class19 var96 = new class19();
                                                                                                        var96.field214 = field461;
                                                                                                        var96.field199 = var93;
                                                                                                        var96.field211 = var94;
                                                                                                        var96.field205 = field465;
                                                                                                        var96.field203 = field461.field2291;
                                                                                                        class33.method2511(var96);
                                                                                                    }
                                                                                                    if (field465 != null) {
                                                                                                        class170 var97 = field461;
                                                                                                        int var98 = class171.method269(method2885(var97));
                                                                                                        class170 var99;
                                                                                                        if (var98 == 0) {
                                                                                                            var99 = null;
                                                                                                        } else {
                                                                                                            int var100 = 0;
                                                                                                            while (true) {
                                                                                                                if (var100 >= var98) {
                                                                                                                    var99 = var97;
                                                                                                                    break;
                                                                                                                }
                                                                                                                var97 = Statics.method211(var97.field2220);
                                                                                                                if (var97 == null) {
                                                                                                                    var99 = null;
                                                                                                                    break;
                                                                                                                }
                                                                                                                var100++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (var99 != null) {
                                                                                                            field417.method2920(152);
                                                                                                            field417.method2701(field461.field2202);
                                                                                                            field417.method2701(field465.field2278);
                                                                                                            field417.method2702(field461.field2278);
                                                                                                            field417.method2658(field465.field2201);
                                                                                                            field417.method2701(field465.field2202);
                                                                                                            field417.method2712(field461.field2201);
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    int var101 = method2388();
                                                                                                    if (field427 > 2 && (field425 == 1 && !method753() || method1981(var101))) {
                                                                                                        method1861(field571 + field463, field471 + field464);
                                                                                                    } else if (field427 > 0) {
                                                                                                        int var102 = field571 + field463;
                                                                                                        int var103 = field471 + field464;
                                                                                                        method2157(Statics.field1070, var102, var103);
                                                                                                        Statics.field1070 = null;
                                                                                                    }
                                                                                                }
                                                                                                field461 = null;
                                                                                            }
                                                                                        } else if (Statics.field2738 > 1) {
                                                                                            field461 = null;
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field2029 != null) {
                                                                                        method1858(Statics.field2029);
                                                                                        field406++;
                                                                                        if (class116.field1786 == 0) {
                                                                                            if (!field405) {
                                                                                                int var110 = method2388();
                                                                                                if (field427 > 2 && !(field425 != 1 || method753()) || method1981(var110)) {
                                                                                                    method1861(field402, field321);
                                                                                                } else if (field427 > 0) {
                                                                                                    int var111 = field402;
                                                                                                    int var112 = field321;
                                                                                                    method2157(Statics.field1070, var111, var112);
                                                                                                    Statics.field1070 = null;
                                                                                                }
                                                                                            } else if (Statics.field24 == Statics.field2029 && field398 != field387) {
                                                                                                class170 var104 = Statics.field2029;
                                                                                                byte var105 = 0;
                                                                                                if (field327 == 1 && var104.field2205 == 206) {
                                                                                                    var105 = 1;
                                                                                                }
                                                                                                if (var104.field2284[field398] <= 0) {
                                                                                                    var105 = 0;
                                                                                                }
                                                                                                if (class171.method917(method2885(var104))) {
                                                                                                    int var106 = field387;
                                                                                                    int var107 = field398;
                                                                                                    var104.field2284[var107] = var104.field2284[var106];
                                                                                                    var104.field2320[var107] = var104.field2320[var106];
                                                                                                    var104.field2284[var106] = -1;
                                                                                                    var104.field2320[var106] = 0;
                                                                                                } else if (var105 == 1) {
                                                                                                    int var108 = field387;
                                                                                                    int var109 = field398;
                                                                                                    while (var108 != var109) {
                                                                                                        if (var108 > var109) {
                                                                                                            var104.method3047(var108 - 1, var108);
                                                                                                            var108--;
                                                                                                        } else if (var108 < var109) {
                                                                                                            var104.method3047(var108 + 1, var108);
                                                                                                            var108++;
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    var104.method3047(field398, field387);
                                                                                                }
                                                                                                field417.method2920(226);
                                                                                                field417.method2712(Statics.field2029.field2201);
                                                                                                field417.method2702(field387);
                                                                                                field417.method2702(field398);
                                                                                                field417.method2660(var105);
                                                                                            }
                                                                                            field399 = 10;
                                                                                            class116.field1793 = 0;
                                                                                            Statics.field2029 = null;
                                                                                        } else if (field406 >= 5 && (class116.field1787 > field402 + 5 || class116.field1787 < field402 - 5 || class116.field1783 * -667823397 > field321 + 5 || class116.field1783 * -667823397 < field321 - 5)) {
                                                                                            field405 = true;
                                                                                        }
                                                                                    }
                                                                                    if (class88.method1686()) {
                                                                                        int var113 = class88.field1512;
                                                                                        int var114 = class88.field1516;
                                                                                        field417.method2920(168);
                                                                                        field417.method2780(5);
                                                                                        field417.method2702(Statics.field341 + var114);
                                                                                        field417.method2793(Statics.field19 + var113);
                                                                                        field417.method2660(class106.field1711[82] ? (class106.field1711[81] ? 2 : 1) : 0);
                                                                                        class88.method1780();
                                                                                        field395 = class116.field1782;
                                                                                        field396 = class116.field1781;
                                                                                        field333 = 1;
                                                                                        field350 = 0;
                                                                                        field292 = var113;
                                                                                        field305 = var114;
                                                                                    }
                                                                                    if (Statics.field3214 != var36) {
                                                                                        if (var36 != null) {
                                                                                            method1858(var36);
                                                                                        }
                                                                                        if (Statics.field3214 != null) {
                                                                                            method1858(Statics.field3214);
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field1993 != var37 && field531 == field410) {
                                                                                        if (var37 != null) {
                                                                                            method1858(var37);
                                                                                        }
                                                                                        if (Statics.field1993 != null) {
                                                                                            method1858(Statics.field1993);
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field1993 == null) {
                                                                                        if (field531 > 0) {
                                                                                            field531--;
                                                                                        }
                                                                                    } else if (field531 < field410) {
                                                                                        field531++;
                                                                                        if (field531 == field410) {
                                                                                            method1858(Statics.field1993);
                                                                                        }
                                                                                    }
                                                                                    int var115 = field467 + Statics.field685.field610;
                                                                                    int var116 = field354 + Statics.field685.field609;
                                                                                    if (Statics.field2113 - var115 < -500 || Statics.field2113 - var115 > 500 || Statics.field60 - var116 < -500 || Statics.field60 - var116 > 500) {
                                                                                        Statics.field2113 = var115;
                                                                                        Statics.field60 = var116;
                                                                                    }
                                                                                    if (Statics.field2113 != var115) {
                                                                                        Statics.field2113 += (var115 - Statics.field2113) / 16;
                                                                                    }
                                                                                    if (Statics.field60 != var116) {
                                                                                        Statics.field60 += (var116 - Statics.field60) / 16;
                                                                                    }
                                                                                    if (class116.field1786 == 4 && Statics.field1832) {
                                                                                        int var117 = class116.field1783 * -667823397 - field307 * -667823397;
                                                                                        field374 = var117 * 2;
                                                                                        field307 = (var117 == -1 || var117 == 1 ? class116.field1783 * -667823397 : (field307 * -667823397 + class116.field1783 * -667823397) / 2) * 1650973011;
                                                                                        int var118 = field376 - class116.field1787;
                                                                                        field373 = var118 * 2;
                                                                                        field376 = var118 == -1 || var118 == 1 ? class116.field1787 : (field376 + class116.field1787) / 2;
                                                                                    } else {
                                                                                        if (class106.field1711[96]) {
                                                                                            field373 += (-24 - field373) / 2;
                                                                                        } else if (class106.field1711[97]) {
                                                                                            field373 += (24 - field373) / 2;
                                                                                        } else {
                                                                                            field373 /= 2;
                                                                                        }
                                                                                        if (class106.field1711[98]) {
                                                                                            field374 += (12 - field374) / 2;
                                                                                        } else if (class106.field1711[99]) {
                                                                                            field374 += (-12 - field374) / 2;
                                                                                        } else {
                                                                                            field374 /= 2;
                                                                                        }
                                                                                        field307 = class116.field1783;
                                                                                        field376 = class116.field1787;
                                                                                    }
                                                                                    field468 = field373 / 2 + field468 & 0x7FF;
                                                                                    field371 += field374 / 2;
                                                                                    if (field371 < 128) {
                                                                                        field371 = 128;
                                                                                    }
                                                                                    if (field371 > 383) {
                                                                                        field371 = 383;
                                                                                    }
                                                                                    int var119 = Statics.field2113 >> 7;
                                                                                    int var120 = Statics.field60 >> 7;
                                                                                    int var121 = method754(Statics.field2113, Statics.field60, Statics.field967);
                                                                                    int var122 = 0;
                                                                                    if (var119 > 3 && var120 > 3 && var119 < 100 && var120 < 100) {
                                                                                        for (int var123 = var119 - 4; var123 <= var119 + 4; var123++) {
                                                                                            for (int var124 = var120 - 4; var124 <= var120 + 4; var124++) {
                                                                                                int var125 = Statics.field967;
                                                                                                if (var125 < 3 && (class11.field104[1][var123][var124] & 0x2) == 2) {
                                                                                                    var125++;
                                                                                                }
                                                                                                int var126 = var121 - class11.field121[var125][var123][var124];
                                                                                                if (var126 > var122) {
                                                                                                    var122 = var126;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    int var127 = var122 * 192;
                                                                                    if (var127 > 98048) {
                                                                                        var127 = 98048;
                                                                                    }
                                                                                    if (var127 < 32768) {
                                                                                        var127 = 32768;
                                                                                    }
                                                                                    if (var127 > field380) {
                                                                                        field380 += (var127 - field380) / 24;
                                                                                    } else if (var127 < field380) {
                                                                                        field380 += (var127 - field380) / 80;
                                                                                    }
                                                                                    if (field565) {
                                                                                        method111();
                                                                                    }
                                                                                    for (int var128 = 0; var128 < 5; var128++) {
                                                                                        int var10002 = field541[var128]++;
                                                                                    }
                                                                                    Statics.field128.method854();
                                                                                    int var129 = ++class116.field1790 - 1;
                                                                                    int var131 = class106.field1709;
                                                                                    if (var129 > 15000 && var131 > 15000) {
                                                                                        field483 = 250;
                                                                                        class116.field1790 = 14500;
                                                                                        field417.method2920(60);
                                                                                    }
                                                                                    field358++;
                                                                                    if (field358 > 500) {
                                                                                        field358 = 0;
                                                                                        int var133 = (int) (Math.random() * 8.0D);
                                                                                        if ((var133 & 0x1) == 1) {
                                                                                            field467 += field412;
                                                                                        }
                                                                                        if ((var133 & 0x2) == 2) {
                                                                                            field354 += field355;
                                                                                        }
                                                                                        if ((var133 & 0x4) == 4) {
                                                                                            field352 += field357;
                                                                                        }
                                                                                    }
                                                                                    if (field467 < -50) {
                                                                                        field412 = 2;
                                                                                    }
                                                                                    if (field467 > 50) {
                                                                                        field412 = -2;
                                                                                    }
                                                                                    if (field354 < -55) {
                                                                                        field355 = 2;
                                                                                    }
                                                                                    if (field354 > 55) {
                                                                                        field355 = -2;
                                                                                    }
                                                                                    if (field352 < -40) {
                                                                                        field357 = 1;
                                                                                    }
                                                                                    if (field352 > 40) {
                                                                                        field357 = -1;
                                                                                    }
                                                                                    field363++;
                                                                                    if (field363 > 500) {
                                                                                        field363 = 0;
                                                                                        int var134 = (int) (Math.random() * 8.0D);
                                                                                        if ((var134 & 0x1) == 1) {
                                                                                            field359 += field435;
                                                                                        }
                                                                                        if ((var134 & 0x2) == 2) {
                                                                                            field315 += field362;
                                                                                        }
                                                                                    }
                                                                                    if (field359 < -60) {
                                                                                        field435 = 2;
                                                                                    }
                                                                                    if (field359 > 60) {
                                                                                        field435 = -2;
                                                                                    }
                                                                                    if (field315 < -20) {
                                                                                        field362 = 1;
                                                                                    }
                                                                                    if (field315 > 10) {
                                                                                        field362 = -1;
                                                                                    }
                                                                                    for (class17 var135 = (class17) field558.method2346(); var135 != null; var135 = (class17) field558.method2349()) {
                                                                                        if ((long) var135.field184 < class156.method81() / 1000L - 5L) {
                                                                                            if (var135.field181 > 0) {
                                                                                                class48.method3031(5, "", var135.field186 + class174.field2505);
                                                                                            }
                                                                                            if (var135.field181 == 0) {
                                                                                                class48.method3031(5, "", var135.field186 + class174.field2506);
                                                                                            }
                                                                                            var135.method2358();
                                                                                        }
                                                                                    }
                                                                                    field335++;
                                                                                    if (field335 > 50) {
                                                                                        field417.method2920(110);
                                                                                    }
                                                                                    try {
                                                                                        if (Statics.field210 != null && field417.field2079 > 0) {
                                                                                            Statics.field210.method1996(field417.field2084, 0, field417.field2079);
                                                                                            field417.field2079 = 0;
                                                                                            field335 = 0;
                                                                                            return;
                                                                                        }
                                                                                    } catch (IOException var137) {
                                                                                        method3631();
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                var53 = var52.field214;
                                                                                if (var53.field2278 < 0) {
                                                                                    break;
                                                                                }
                                                                                var54 = Statics.method211(var53.field2220);
                                                                            } while (var54 == null || var54.field2312 == null || var53.field2278 >= var54.field2312.length || var54.field2312[var53.field2278] != var53);
                                                                            class33.method2511(var52);
                                                                        }
                                                                    }
                                                                    var50 = var49.field214;
                                                                    if (var50.field2278 < 0) {
                                                                        break;
                                                                    }
                                                                    var51 = Statics.method211(var50.field2220);
                                                                } while (var51 == null || var51.field2312 == null || var50.field2278 >= var51.field2312.length || var51.field2312[var50.field2278] != var50);
                                                                class33.method2511(var49);
                                                            }
                                                        }
                                                        var47 = var46.field214;
                                                        if (var47.field2278 < 0) {
                                                            break;
                                                        }
                                                        var48 = Statics.method211(var47.field2220);
                                                    } while (var48 == null || var48.field2312 == null || var47.field2278 >= var48.field2312.length || var48.field2312[var47.field2278] != var47);
                                                    class33.method2511(var46);
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                                field417.method2920(50);
                                field417.method2780(0);
                                int var8 = field417.field2079;
                                class228.method89(field417);
                                field417.method2657(field417.field2079 - var8);
                            }
                        }
                    }
                } else if (field295 == 40 || field295 == 45) {
                    Statics.method181();
                }
                return;
            }
            var2.field2702.method3221(var2.field2703, (int) var2.field1864, var2.field2704, false);
        }
    }

    @ObfuscatedName("client.k(I)V")
    public final void method277() {
        boolean var1;
        label203: {
            try {
                if (class139.field1903 == 2) {
                    if (Statics.field944 == null) {
                        Statics.field944 = class145.method2582(Statics.field889, Statics.field1906, Statics.field1899);
                        if (Statics.field944 == null) {
                            var1 = false;
                            break label203;
                        }
                    }
                    if (Statics.field1200 == null) {
                        Statics.field1200 = new class61(Statics.field1910, Statics.field1900);
                    }
                    if (Statics.field1902.method2484(Statics.field944, Statics.field1907, Statics.field1200, 22050)) {
                        Statics.field1902.method2411();
                        Statics.field1902.method2409(Statics.field1909);
                        Statics.field1902.method2413(Statics.field944, Statics.field135);
                        class139.field1903 = 0;
                        Statics.field944 = null;
                        Statics.field1200 = null;
                        Statics.field889 = null;
                        var1 = true;
                        break label203;
                    }
                }
            } catch (Exception var31) {
                var31.printStackTrace();
                Statics.field1902.method2414();
                class139.field1903 = 0;
                Statics.field944 = null;
                Statics.field1200 = null;
                Statics.field889 = null;
            }
            var1 = false;
        }
        if (var1 && field527 && Statics.field74 != null) {
            Statics.field74.method1040();
        }
        if (field295 == 10 || field295 == 20 || field295 == 30) {
            if (field433 != 0L && class156.method81() > field433) {
                method2949(method3091());
            } else if (field1766) {
                class106.method255(Statics.field1995);
                Canvas var4 = Statics.field1995;
                var4.removeMouseListener(class116.field1799);
                var4.removeMouseMotionListener(class116.field1799);
                var4.removeFocusListener(class116.field1799);
                class116.field1795 = 0;
                if (Statics.field1989 != null) {
                    Statics.field1989.method1974(Statics.field1995);
                }
                Statics.field297.method2026();
                Statics.field1995.setBackground(Color.black);
                Canvas var5 = Statics.field1995;
                var5.setFocusTraversalKeysEnabled(false);
                var5.addKeyListener(class106.field1691);
                var5.addFocusListener(class106.field1691);
                Canvas var6 = Statics.field1995;
                var6.addMouseListener(class116.field1799);
                var6.addMouseMotionListener(class116.field1799);
                var6.addFocusListener(class116.field1799);
                if (Statics.field1989 != null) {
                    Statics.field1989.method1970(Statics.field1995);
                }
                if (field448 != -1) {
                    method23(false);
                }
                field1756 = true;
            }
        }
        Dimension var7 = this.method2037();
        if (Statics.field887 != var7.width || Statics.field155 != var7.height || field1756) {
            method2884();
            field433 = class156.method81() + 500L;
            field1756 = false;
        }
        boolean var8 = false;
        if (field1763) {
            field1763 = false;
            var8 = true;
            for (int var9 = 0; var9 < 100; var9++) {
                field493[var9] = true;
            }
        }
        if (var8) {
            method624();
        }
        if (field295 == 0) {
            int var10 = class42.field827;
            String var11 = class42.field846;
            Color var12 = null;
            try {
                Graphics var13 = Statics.field1995.getGraphics();
                if (Statics.field80 == null) {
                    Statics.field80 = new Font("Helvetica", 1, 13);
                    Statics.field2853 = Statics.field1995.getFontMetrics(Statics.field80);
                }
                if (var8) {
                    var13.setColor(Color.black);
                    var13.fillRect(0, 0, Statics.field1559, Statics.field2788);
                }
                if (var12 == null) {
                    var12 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1840 == null) {
                        Statics.field1840 = Statics.field1995.createImage(304, 34);
                    }
                    Graphics var14 = Statics.field1840.getGraphics();
                    var14.setColor(var12);
                    var14.drawRect(0, 0, 303, 33);
                    var14.fillRect(2, 2, var10 * 3, 30);
                    var14.setColor(Color.black);
                    var14.drawRect(1, 1, 301, 31);
                    var14.fillRect(var10 * 3 + 2, 2, 300 - var10 * 3, 30);
                    var14.setFont(Statics.field80);
                    var14.setColor(Color.white);
                    var14.drawString(var11, (304 - Statics.field2853.stringWidth(var11)) / 2, 22);
                    var13.drawImage(Statics.field1840, Statics.field1559 / 2 - 152, Statics.field2788 / 2 - 18, (ImageObserver) null);
                } catch (Exception var27) {
                    int var16 = Statics.field1559 / 2 - 152;
                    int var17 = Statics.field2788 / 2 - 18;
                    var13.setColor(var12);
                    var13.drawRect(var16, var17, 303, 33);
                    var13.fillRect(var16 + 2, var17 + 2, var10 * 3, 30);
                    var13.setColor(Color.black);
                    var13.drawRect(var16 + 1, var17 + 1, 301, 31);
                    var13.fillRect(var10 * 3 + var16 + 2, var17 + 2, 300 - var10 * 3, 30);
                    var13.setFont(Statics.field80);
                    var13.setColor(Color.white);
                    var13.drawString(var11, var16 + (304 - Statics.field2853.stringWidth(var11)) / 2, var17 + 22);
                }
            } catch (Exception var28) {
                Statics.field1995.repaint();
            }
        } else if (field295 == 5) {
            class42.method1376(Statics.field283, Statics.field1567, Statics.field940, var8);
        } else if (field295 == 10 || field295 == 11) {
            class42.method1376(Statics.field283, Statics.field1567, Statics.field940, var8);
        } else if (field295 == 20) {
            class42.method1376(Statics.field283, Statics.field1567, Statics.field940, var8);
        } else if (field295 == 25) {
            if (field346 == 1) {
                if (field342 > field343) {
                    field343 = field342;
                }
                int var19 = (field343 * 50 - field342 * 50) / field343;
                method3121(class174.field2370 + class38.field782 + class38.field779 + var19 + "%" + class38.field777, false);
            } else if (field346 == 2) {
                if (field344 > field345) {
                    field345 = field344;
                }
                int var20 = (field345 * 50 - field344 * 50) / field345 + 50;
                method3121(class174.field2370 + class38.field782 + class38.field779 + var20 + "%" + class38.field777, false);
            } else {
                method3121(class174.field2370, false);
            }
        } else if (field295 == 30) {
            method203();
        } else if (field295 == 40) {
            method3121(class174.field2371 + class38.field782 + class174.field2541, false);
        } else if (field295 == 45) {
            method3121(class174.field2516, false);
        }
        if (field295 == 30 && field500 == 0 && !var8) {
            try {
                Graphics var21 = Statics.field1995.getGraphics();
                for (int var22 = 0; var22 < field491; var22++) {
                    if (field494[var22]) {
                        Statics.field2010.method3801(var21, field470[var22], field372[var22], field498[var22], field499[var22]);
                        field494[var22] = false;
                    }
                }
            } catch (Exception var30) {
                Statics.field1995.repaint();
            }
        } else if (field295 > 0) {
            try {
                Graphics var24 = Statics.field1995.getGraphics();
                Statics.field2010.method3798(var24, 0, 0);
                for (int var25 = 0; var25 < field491; var25++) {
                    field494[var25] = false;
                }
            } catch (Exception var29) {
                Statics.field1995.repaint();
            }
        }
    }

    @ObfuscatedName("client.f(I)V")
    public final void method278() {
        if (Statics.field128.method855()) {
            Statics.field128.method852();
        }
        if (Statics.field697 != null) {
            Statics.field697.field227 = false;
        }
        Statics.field697 = null;
        if (Statics.field210 != null) {
            Statics.field210.method2006();
            Statics.field210 = null;
        }
        class106.method570();
        if (class116.field1799 != null) {
            class116 var1 = class116.field1799;
            synchronized (class116.field1799) {
                class116.field1799 = null;
            }
        }
        Statics.field1989 = null;
        if (Statics.field74 != null) {
            Statics.field74.method1096();
        }
        if (Statics.field1563 != null) {
            Statics.field1563.method1096();
        }
        class186.method1039();
        Object var3 = class184.field2734;
        synchronized (class184.field2734) {
            if (class184.field2736 != 0) {
                class184.field2736 = 1;
                try {
                    class184.field2734.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        class105.method1154();
    }

    @ObfuscatedName("fr.a(II)V")
    public static void method2950(int arg0) {
        if (field295 == arg0) {
            return;
        }
        if (field295 == 0) {
            class114.method1842();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field319 = 0;
            field320 = 0;
            field560 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field948 != null) {
            Statics.field948.method2006();
            Statics.field948 = null;
        }
        if (field295 == 25) {
            field346 = 0;
            field342 = 0;
            field343 = 1;
            field344 = 0;
            field345 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class42.method1155(Statics.field1995, Statics.field176, Statics.field852, true, 0);
        } else if (arg0 == 20) {
            class42.method1155(Statics.field1995, Statics.field176, Statics.field852, true, field295 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class42.method1155(Statics.field1995, Statics.field176, Statics.field852, false, 4);
        } else {
            class42.method842();
        }
        field295 = arg0;
    }

    @ObfuscatedName("client.v(I)V")
    public void method505() {
        if (field295 == 1000) {
            return;
        }
        long var1 = class156.method81();
        int var3 = (int) (var1 - Statics.field2753);
        Statics.field2753 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class186.field2752 += var3;
        boolean var4;
        if (class186.field2764 == 0 && class186.field2757 == 0 && class186.field2760 == 0 && class186.field2751 == 0) {
            var4 = true;
        } else if (Statics.field2763 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class186.field2752 > 30000) {
                        throw new IOException();
                    }
                    while (class186.field2757 < 20 && class186.field2751 > 0) {
                        class182 var5 = (class182) class186.field2754.method2262();
                        class154 var6 = new class154(4);
                        var6.method2780(1);
                        var6.method2656((int) var5.field1864);
                        Statics.field2763.method1996(var6.field2084, 0, 4);
                        class186.field2759.method2267(var5, var5.field1864);
                        class186.field2751--;
                        class186.field2757++;
                    }
                    while (class186.field2764 < 20 && class186.field2760 > 0) {
                        class182 var7 = (class182) class186.field2758.method2212();
                        class154 var8 = new class154(4);
                        var8.method2780(0);
                        var8.method2656((int) var7.field1864);
                        Statics.field2763.method1996(var8.field2084, 0, 4);
                        var7.method2343();
                        class186.field2767.method2267(var7, var7.field1864);
                        class186.field2760--;
                        class186.field2764++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2763.method2001();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class186.field2752 = 0;
                        byte var11 = 0;
                        if (Statics.field2761 == null) {
                            var11 = 8;
                        } else if (class186.field2765 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class186.field2769.field2079;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2763.method2000(class186.field2769.field2084, class186.field2769.field2079, var12);
                            if (class186.field2768 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class186.field2769.field2084[class186.field2769.field2079 + var13] ^= class186.field2768;
                                }
                            }
                            class186.field2769.field2079 += var12;
                            if (class186.field2769.field2079 < var11) {
                                break;
                            }
                            if (Statics.field2761 == null) {
                                class186.field2769.field2079 = 0;
                                int var14 = class186.field2769.method2669();
                                int var15 = class186.field2769.method2671();
                                int var16 = class186.field2769.method2669();
                                int var17 = class186.field2769.method2815();
                                long var18 = (long) ((var14 << 16) + var15);
                                class182 var20 = (class182) class186.field2759.method2259(var18);
                                Statics.field1473 = true;
                                if (var20 == null) {
                                    var20 = (class182) class186.field2767.method2259(var18);
                                    Statics.field1473 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2761 = var20;
                                Statics.field794 = new class154(var17 + var21 + Statics.field2761.field2708);
                                Statics.field794.method2780(var16);
                                Statics.field794.method2658(var17);
                                class186.field2765 = 8;
                                class186.field2769.field2079 = 0;
                            } else if (class186.field2765 == 0) {
                                if (class186.field2769.field2084[0] == -1) {
                                    class186.field2765 = 1;
                                    class186.field2769.field2079 = 0;
                                } else {
                                    Statics.field2761 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field794.field2084.length - Statics.field2761.field2708;
                            int var23 = 512 - class186.field2765;
                            if (var23 > var22 - Statics.field794.field2079) {
                                var23 = var22 - Statics.field794.field2079;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2763.method2000(Statics.field794.field2084, Statics.field794.field2079, var23);
                            if (class186.field2768 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field794.field2084[Statics.field794.field2079 + var24] ^= class186.field2768;
                                }
                            }
                            Statics.field794.field2079 += var23;
                            class186.field2765 += var23;
                            if (Statics.field794.field2079 == var22) {
                                if (Statics.field2761.field1864 == 16711935L) {
                                    Statics.field772 = Statics.field794;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class185 var26 = class186.field2756[var25];
                                        if (var26 != null) {
                                            Statics.field772.field2079 = var25 * 8 + 5;
                                            int var27 = Statics.field772.method2815();
                                            int var28 = Statics.field772.method2815();
                                            var26.method3219(var27, var28);
                                        }
                                    }
                                } else {
                                    class186.field2766.reset();
                                    class186.field2766.update(Statics.field794.field2084, 0, var22);
                                    int var29 = (int) class186.field2766.getValue();
                                    if (Statics.field2761.field2707 != var29) {
                                        try {
                                            Statics.field2763.method2006();
                                        } catch (Exception var35) {
                                        }
                                        class186.field2762++;
                                        Statics.field2763 = null;
                                        class186.field2768 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class186.field2762 = 0;
                                    class186.field2755 = 0;
                                    Statics.field2761.field2711.method3220((int) (Statics.field2761.field1864 & 0xFFFFL), Statics.field794.field2084, (Statics.field2761.field1864 & 0xFF0000L) == 16711680L, Statics.field1473);
                                }
                                Statics.field2761.method2298();
                                if (Statics.field1473) {
                                    class186.field2757--;
                                } else {
                                    class186.field2764--;
                                }
                                class186.field2765 = 0;
                                Statics.field2761 = null;
                                Statics.field794 = null;
                            } else {
                                if (class186.field2765 != 512) {
                                    break;
                                }
                                class186.field2765 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2763.method2006();
                } catch (Exception var34) {
                }
                class186.field2755++;
                Statics.field2763 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method280();
        }
    }

    @ObfuscatedName("client.d(B)V")
    public void method280() {
        if (class186.field2762 >= 4) {
            this.method2035("js5crc");
            field295 = 1000;
            return;
        }
        if (class186.field2755 >= 4) {
            if (field295 <= 5) {
                this.method2035("js5io");
                field295 = 1000;
                return;
            }
            field317 = 3000;
            class186.field2755 = 3;
        }
        if (--field317 + 1 > 0) {
            return;
        }
        try {
            if (field316 == 0) {
                Statics.field2779 = Statics.field2640.method1908(Statics.field2030, Statics.field901);
                field316++;
            }
            if (field316 == 1) {
                if (Statics.field2779.field1652 == 2) {
                    this.method281(-1);
                    return;
                }
                if (Statics.field2779.field1652 == 1) {
                    field316++;
                }
            }
            if (field316 == 2) {
                Statics.field1205 = new class111((Socket) Statics.field2779.field1656, Statics.field2640);
                class154 var1 = new class154(5);
                var1.method2780(15);
                var1.method2658(134);
                Statics.field1205.method1996(var1.field2084, 0, 5);
                field316++;
                Statics.field234 = class156.method81();
            }
            if (field316 == 3) {
                if (field295 <= 5 || Statics.field1205.method2001() > 0) {
                    int var2 = Statics.field1205.method1993();
                    if (var2 != 0) {
                        this.method281(var2);
                        return;
                    }
                    field316++;
                } else if (class156.method81() - Statics.field234 > 30000L) {
                    this.method281(-2);
                    return;
                }
            }
            if (field316 == 4) {
                class186.method671(Statics.field1205, field295 > 20);
                Statics.field2779 = null;
                Statics.field1205 = null;
                field316 = 0;
                field490 = 0;
            }
        } catch (IOException var4) {
            this.method281(-3);
        }
    }

    @ObfuscatedName("client.o(IB)V")
    public void method281(int arg0) {
        Statics.field2779 = null;
        Statics.field1205 = null;
        field316 = 0;
        if (Statics.field901 == Statics.field2688) {
            Statics.field901 = Statics.field183;
        } else {
            Statics.field901 = Statics.field2688;
        }
        field490++;
        if (field490 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field295 <= 5) {
                this.method2035("js5connect_full");
                field295 = 1000;
            } else {
                field317 = 3000;
            }
        } else if (field490 >= 2 && arg0 == 6) {
            this.method2035("js5connect_outofdate");
            field295 = 1000;
        } else if (field490 >= 4) {
            if (field295 <= 5) {
                this.method2035("js5connect");
                field295 = 1000;
            } else {
                field317 = 3000;
            }
        }
    }

    @ObfuscatedName("au.q(I)V")
    public static void method646() {
        if (field353 == 0) {
            Statics.field2110 = new class88(4, 104, 104, class11.field121);
            for (int var0 = 0; var0 < 4; var0++) {
                field348[var0] = new class118(104, 104);
            }
            Statics.field243 = new class225(512, 512);
            class42.field846 = class174.field2568;
            class42.field827 = 5;
            field353 = 20;
        } else if (field353 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class85.field1460[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class88.method1682(var1, 500, 800, 512, 334);
            class42.field846 = class174.field2418;
            class42.field827 = 10;
            field353 = 30;
        } else if (field353 == 30) {
            Statics.field71 = method64(0, false, true, true);
            Statics.field799 = method64(1, false, true, true);
            Statics.field1069 = method64(2, true, false, true);
            Statics.field2182 = method64(3, false, true, true);
            Statics.field2111 = method64(4, false, true, true);
            Statics.field2150 = method64(5, true, true, true);
            Statics.field931 = method64(6, true, true, false);
            Statics.field160 = method64(7, false, true, true);
            Statics.field852 = method64(8, false, true, true);
            Statics.field751 = method64(9, false, true, true);
            Statics.field176 = method64(10, false, true, true);
            Statics.field131 = method64(11, false, true, true);
            Statics.field1644 = method64(12, false, true, true);
            Statics.field979 = method64(13, true, false, true);
            Statics.field282 = method64(14, false, true, false);
            Statics.field139 = method64(15, false, true, true);
            class42.field846 = class174.field2375;
            class42.field827 = 20;
            field353 = 40;
        } else if (field353 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field71.method3218() * 4 / 100;
            int var8 = var7 + Statics.field799.method3218() * 4 / 100;
            int var9 = var8 + Statics.field1069.method3218() * 2 / 100;
            int var10 = var9 + Statics.field2182.method3218() * 2 / 100;
            int var11 = var10 + Statics.field2111.method3218() * 6 / 100;
            int var12 = var11 + Statics.field2150.method3218() * 4 / 100;
            int var13 = var12 + Statics.field931.method3218() * 2 / 100;
            int var14 = var13 + Statics.field160.method3218() * 60 / 100;
            int var15 = var14 + Statics.field852.method3218() * 2 / 100;
            int var16 = var15 + Statics.field751.method3218() * 2 / 100;
            int var17 = var16 + Statics.field176.method3218() * 2 / 100;
            int var18 = var17 + Statics.field131.method3218() * 2 / 100;
            int var19 = var18 + Statics.field1644.method3218() * 2 / 100;
            int var20 = var19 + Statics.field979.method3218() * 2 / 100;
            int var21 = var20 + Statics.field282.method3218() * 2 / 100;
            int var22 = var21 + Statics.field139.method3218() * 2 / 100;
            if (var22 == 100) {
                class42.field846 = class174.field2377;
                class42.field827 = 30;
                field353 = 45;
            } else {
                if (var22 != 0) {
                    class42.field846 = class174.field2376 + var22 + "%";
                }
                class42.field827 = 30;
            }
        } else if (field353 == 45) {
            boolean var23 = !field569;
            Statics.field1072 = 22050;
            Statics.field1047 = var23;
            Statics.field1059 = 2;
            class140 var24 = new class140();
            var24.method2416(9, 128);
            Statics.field74 = class58.method1863(Statics.field2640, Statics.field1995, 0, 22050);
            Statics.field74.method1045(var24);
            class185 var25 = Statics.field139;
            class185 var26 = Statics.field282;
            class185 var27 = Statics.field2111;
            Statics.field1907 = var25;
            Statics.field1900 = var26;
            Statics.field1910 = var27;
            Statics.field1902 = var24;
            Statics.field1563 = class58.method1863(Statics.field2640, Statics.field1995, 1, 2048);
            Statics.field1431 = new class52();
            Statics.field1563.method1045(Statics.field1431);
            Statics.field2352 = new class66(22050, Statics.field1072);
            class42.field846 = class174.field2513;
            class42.field827 = 35;
            field353 = 50;
        } else if (field353 == 50) {
            int var28 = 0;
            if (Statics.field1567 == null) {
                class185 var29 = Statics.field852;
                class185 var30 = Statics.field979;
                int var31 = var29.method3141("p11_full");
                int var32 = var29.method3138(var31, "");
                class209 var33;
                if (class226.method196(var29, var31, var32)) {
                    var33 = class226.method2570(var30.method3126(var31, var32));
                } else {
                    var33 = null;
                }
                Statics.field1567 = var33;
            } else {
                var28++;
            }
            if (Statics.field940 == null) {
                class185 var35 = Statics.field852;
                class185 var36 = Statics.field979;
                int var37 = var35.method3141("p12_full");
                int var38 = var35.method3138(var37, "");
                class209 var39;
                if (class226.method196(var35, var37, var38)) {
                    var39 = class226.method2570(var36.method3126(var37, var38));
                } else {
                    var39 = null;
                }
                Statics.field940 = var39;
            } else {
                var28++;
            }
            if (Statics.field283 == null) {
                class185 var41 = Statics.field852;
                class185 var42 = Statics.field979;
                int var43 = var41.method3141("b12_full");
                int var44 = var41.method3138(var43, "");
                class209 var45;
                if (class226.method196(var41, var43, var44)) {
                    var45 = class226.method2570(var42.method3126(var43, var44));
                } else {
                    var45 = null;
                }
                Statics.field283 = var45;
            } else {
                var28++;
            }
            if (var28 < 3) {
                class42.field846 = class174.field2540 + var28 * 100 / 3 + "%";
                class42.field827 = 40;
            } else {
                Statics.field587 = new class231(true);
                class42.field846 = class174.field2464;
                class42.field827 = 40;
                field353 = 60;
            }
        } else if (field353 == 60) {
            class185 var47 = Statics.field176;
            class185 var48 = Statics.field852;
            int var49 = 0;
            if (var47.method3144("title.jpg", "")) {
                var49++;
            }
            if (var48.method3144("logo", "")) {
                var49++;
            }
            if (var48.method3144("logo_deadman_mode", "")) {
                var49++;
            }
            if (var48.method3144("titlebox", "")) {
                var49++;
            }
            if (var48.method3144("titlebutton", "")) {
                var49++;
            }
            if (var48.method3144("runes", "")) {
                var49++;
            }
            if (var48.method3144("title_mute", "")) {
                var49++;
            }
            if (var48.method3145("options_radio_buttons,0")) {
                var49++;
            }
            if (var48.method3145("options_radio_buttons,2")) {
                var49++;
            }
            var48.method3144("sl_back", "");
            var48.method3144("sl_flags", "");
            var48.method3144("sl_arrows", "");
            var48.method3144("sl_stars", "");
            var48.method3144("sl_button", "");
            byte var52 = 9;
            if (var49 < var52) {
                class42.field846 = class174.field2381 + var49 * 100 / var52 + "%";
                class42.field827 = 50;
            } else {
                class42.field846 = class174.field2372;
                class42.field827 = 50;
                method2950(5);
                field353 = 70;
            }
        } else if (field353 == 70) {
            if (Statics.field1069.method3130()) {
                class201.method1645(Statics.field1069);
                class185 var54 = Statics.field1069;
                Statics.field2820 = var54;
                class185 var55 = Statics.field1069;
                class185 var56 = Statics.field160;
                Statics.field2837 = var55;
                Statics.field2826 = var56;
                Statics.field3109 = Statics.field2837.method3136(3);
                class185 var57 = Statics.field1069;
                class185 var58 = Statics.field160;
                boolean var59 = field569;
                Statics.field2112 = var57;
                Statics.field2921 = var58;
                class198.field2948 = var59;
                class200.method209(Statics.field1069, Statics.field160);
                class199.method1989(Statics.field1069, Statics.field160, field356, Statics.field1567);
                class185 var60 = Statics.field1069;
                class185 var61 = Statics.field71;
                class185 var62 = Statics.field799;
                Statics.field3071 = var60;
                Statics.field3061 = var61;
                Statics.field3077 = var62;
                class191.method1867(Statics.field1069, Statics.field160);
                class185 var63 = Statics.field1069;
                Statics.field2860 = var63;
                class185 var64 = Statics.field1069;
                Statics.field2783 = var64;
                Statics.field2780 = Statics.field2783.method3136(16);
                class185 var65 = Statics.field2182;
                class185 var66 = Statics.field160;
                class185 var67 = Statics.field852;
                class185 var68 = Statics.field979;
                Statics.field2275 = var65;
                Statics.field2253 = var66;
                Statics.field2194 = var67;
                Statics.field3089 = var68;
                Statics.field2329 = new class170[Statics.field2275.method3137()][];
                Statics.field2302 = new boolean[Statics.field2275.method3137()];
                class185 var69 = Statics.field1069;
                Statics.field2778 = var69;
                class185 var70 = Statics.field1069;
                Statics.field2870 = var70;
                class185 var71 = Statics.field1069;
                Statics.field2790 = var71;
                class185 var72 = Statics.field1069;
                Statics.field2792 = var72;
                Statics.field128 = new class47();
                class185 var73 = Statics.field1069;
                class185 var74 = Statics.field852;
                class185 var75 = Statics.field979;
                Statics.field2887 = var73;
                Statics.field2878 = var74;
                Statics.field2879 = var75;
                class194.method3795(Statics.field1069, Statics.field852);
                class42.field846 = class174.field2593;
                class42.field827 = 60;
                field353 = 80;
            } else {
                class42.field846 = class174.field2393 + Statics.field1069.method3224() + "%";
                class42.field827 = 60;
            }
        } else if (field353 == 80) {
            int var76 = 0;
            if (Statics.field1758 == null) {
                Statics.field1758 = class226.method2986(Statics.field852, "compass", "");
            } else {
                var76++;
            }
            if (Statics.field46 == null) {
                Statics.field46 = class226.method2986(Statics.field852, "mapedge", "");
            } else {
                var76++;
            }
            if (Statics.field9 == null) {
                Statics.field9 = class226.method1899(Statics.field852, "mapscene", "");
            } else {
                var76++;
            }
            if (Statics.field32 == null) {
                Statics.field32 = class226.method663(Statics.field852, "mapfunction", "");
            } else {
                var76++;
            }
            if (Statics.field1209 == null) {
                Statics.field1209 = class226.method663(Statics.field852, "headicons_pk", "");
            } else {
                var76++;
            }
            if (Statics.field599 == null) {
                Statics.field599 = class226.method663(Statics.field852, "headicons_prayer", "");
            } else {
                var76++;
            }
            if (Statics.field2874 == null) {
                Statics.field2874 = class226.method663(Statics.field852, "headicons_hint", "");
            } else {
                var76++;
            }
            if (Statics.field241 == null) {
                Statics.field241 = class226.method663(Statics.field852, "mapmarker", "");
            } else {
                var76++;
            }
            if (Statics.field281 == null) {
                Statics.field281 = class226.method663(Statics.field852, "cross", "");
            } else {
                var76++;
            }
            if (Statics.field1841 == null) {
                Statics.field1841 = class226.method663(Statics.field852, "mapdots", "");
            } else {
                var76++;
            }
            if (Statics.field2682 == null) {
                Statics.field2682 = class226.method1899(Statics.field852, "scrollbar", "");
            } else {
                var76++;
            }
            if (Statics.field1897 == null) {
                Statics.field1897 = class226.method1899(Statics.field852, "mod_icons", "");
            } else {
                var76++;
            }
            if (var76 < 12) {
                class42.field846 = class174.field2385 + var76 * 100 / 12 + "%";
                class42.field827 = 70;
            } else {
                Statics.field3115 = Statics.field1897;
                Statics.field46.method3929();
                int var77 = (int) (Math.random() * 21.0D) - 10;
                int var78 = (int) (Math.random() * 21.0D) - 10;
                int var79 = (int) (Math.random() * 21.0D) - 10;
                int var80 = (int) (Math.random() * 41.0D) - 20;
                for (int var81 = 0; var81 < Statics.field32.length; var81++) {
                    Statics.field32[var81].method3928(var77 + var80, var78 + var80, var79 + var80);
                }
                Statics.field9[0].method3894(var77 + var80, var78 + var80, var79 + var80);
                class42.field846 = class174.field2386;
                class42.field827 = 70;
                field353 = 90;
            }
        } else if (field353 == 90) {
            if (Statics.field751.method3130()) {
                class75 var82 = new class75(Statics.field751, Statics.field852, 20, 0.8D, field569 ? 64 : 128);
                class85.method1583(var82);
                class85.method1587(0.8D);
                class42.field846 = class174.field2383;
                class42.field827 = 90;
                field353 = 110;
            } else {
                class42.field846 = class174.field2387 + Statics.field751.method3224() + "%";
                class42.field827 = 90;
            }
        } else if (field353 == 110) {
            Statics.field697 = new class21();
            Statics.field2640.method1905(Statics.field697, 10);
            class42.field846 = class174.field2389;
            class42.field827 = 94;
            field353 = 120;
        } else if (field353 == 120) {
            if (Statics.field176.method3144("huffman", "")) {
                class146 var83 = new class146(Statics.field176.method3142("huffman", ""));
                class211.method1852(var83);
                class42.field846 = class174.field2391;
                class42.field827 = 96;
                field353 = 130;
            } else {
                class42.field846 = class174.field2596 + "%";
                class42.field827 = 96;
            }
        } else if (field353 == 130) {
            if (!Statics.field2182.method3130()) {
                class42.field846 = class174.field2392 + Statics.field2182.method3224() * 4 / 5 + "%";
                class42.field827 = 100;
            } else if (!Statics.field1644.method3130()) {
                class42.field846 = class174.field2392 + (80 + Statics.field1644.method3224() / 6) + "%";
                class42.field827 = 100;
            } else if (Statics.field979.method3130()) {
                class42.field846 = class174.field2461;
                class42.field827 = 100;
                field353 = 140;
            } else {
                class42.field846 = class174.field2392 + (96 + Statics.field979.method3224() / 20) + "%";
                class42.field827 = 100;
            }
        } else if (field353 == 140) {
            method2950(10);
        }
    }

    @ObfuscatedName("y.i(IZZZB)Lgz;")
    public static class185 method64(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class117 var4 = null;
        if (class105.field1679 != null) {
            var4 = new class117(arg0, class105.field1679, Statics.field1674[arg0], 1000000);
        }
        return new class185(var4, Statics.field98, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("aq.z(B)V")
    public static void method582() {
        field477 = -1L;
        field534 = -1;
        Statics.field697.field223 = 0;
        Statics.field1469 = true;
        field385 = true;
        field514 = -1L;
        class228.field3246 = new class127();
        field417.field2079 = 0;
        field331.field2079 = 0;
        field419 = -1;
        field336 = -1;
        field322 = -1;
        field338 = -1;
        field334 = 0;
        field304 = 0;
        field483 = 0;
        field285 = 0;
        field427 = 0;
        field458 = -1;
        field426 = false;
        class116.field1790 = 0;
        class48.method115();
        field441 = 0;
        field443 = false;
        field530 = 0;
        field467 = (int) (Math.random() * 100.0D) - 50;
        field354 = (int) (Math.random() * 110.0D) - 55;
        field352 = (int) (Math.random() * 80.0D) - 40;
        field359 = (int) (Math.random() * 120.0D) - 60;
        field315 = (int) (Math.random() * 30.0D) - 20;
        field468 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field524 = 0;
        field517 = -1;
        field292 = 0;
        field305 = 0;
        field313 = class41.field811;
        field377 = class41.field811;
        field325 = 0;
        class46.method2606();
        for (int var0 = 0; var0 < 2048; var0++) {
            field408[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field324[var1] = null;
        }
        field375 = -1;
        field420.method2307();
        field421.method2307();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field418[var2][var3][var4] = null;
                }
            }
        }
        field302 = new class129();
        field556 = 0;
        field555 = 0;
        field329 = 0;
        for (int var5 = 0; var5 < Statics.field2780; var5++) {
            class188 var6 = class188.method601(var5);
            if (var6 != null) {
                class166.field2157[var5] = 0;
                class166.field2158[var5] = 0;
            }
        }
        Statics.field128.method850();
        field456 = -1;
        if (field448 != -1) {
            class170.method2572(field448);
        }
        for (class18 var7 = (class18) field449.method2262(); var7 != null; var7 = (class18) field449.method2260()) {
            method213(var7, true);
        }
        field448 = -1;
        field449 = new class126(8);
        field452 = null;
        field427 = 0;
        field458 = -1;
        field426 = false;
        field561.method2996((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field414[var8] = null;
            field415[var8] = false;
        }
        class13.field137 = new class126(32);
        field296 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field493[var9] = true;
        }
        field417.method2920(175);
        field417.method2780(method3091());
        field417.method2793(Statics.field1559);
        field417.method2793(Statics.field2788);
        field515 = null;
        Statics.field883 = 0;
        Statics.field900 = null;
        for (int var10 = 0; var10 < 8; var10++) {
            field564[var10] = new class5();
        }
        Statics.field190 = null;
    }

    @ObfuscatedName("n.n(IB)V")
    public static void method221(int arg0) {
        if (arg0 == -3) {
            class42.method1845(class174.field2400, class174.field2401, class174.field2570);
        } else if (arg0 == -2) {
            class42.method1845(class174.field2547, class174.field2404, class174.field2405);
        } else if (arg0 == -1) {
            class42.method1845(class174.field2406, class174.field2407, class174.field2408);
        } else if (arg0 == 3) {
            class42.field831 = 3;
        } else if (arg0 == 4) {
            class42.method1845(class174.field2409, class174.field2534, class174.field2503);
        } else if (arg0 == 5) {
            class42.method1845(class174.field2412, class174.field2515, class174.field2519);
        } else if (arg0 == 6) {
            class42.method1845(class174.field2501, class174.field2598, class174.field2417);
        } else if (arg0 == 7) {
            class42.method1845(class174.field2413, class174.field2419, class174.field2420);
        } else if (arg0 == 8) {
            class42.method1845(class174.field2390, class174.field2422, class174.field2423);
        } else if (arg0 == 9) {
            class42.method1845(class174.field2424, class174.field2425, class174.field2426);
        } else if (arg0 == 10) {
            class42.method1845(class174.field2378, class174.field2428, class174.field2429);
        } else if (arg0 == 11) {
            class42.method1845(class174.field2374, class174.field2431, class174.field2432);
        } else if (arg0 == 12) {
            class42.method1845(class174.field2433, class174.field2434, class174.field2373);
        } else if (arg0 == 13) {
            class42.method1845(class174.field2360, class174.field2437, class174.field2438);
        } else if (arg0 == 14) {
            class42.method1845(class174.field2439, class174.field2440, class174.field2441);
        } else if (arg0 == 16) {
            class42.method1845(class174.field2442, class174.field2556, class174.field2444);
        } else if (arg0 == 17) {
            class42.method1845(class174.field2445, class174.field2446, class174.field2530);
        } else if (arg0 == 18) {
            class42.method1845(class174.field2448, class174.field2449, class174.field2403);
        } else if (arg0 == 19) {
            class42.method1845(class174.field2451, class174.field2452, class174.field2454);
        } else if (arg0 == 20) {
            class42.method1845(class174.field2474, class174.field2490, class174.field2544);
        } else if (arg0 == 22) {
            class42.method1845(class174.field2457, class174.field2410, class174.field2459);
        } else if (arg0 == 23) {
            class42.method1845(class174.field2460, class174.field2443, class174.field2396);
        } else if (arg0 == 24) {
            class42.method1845(class174.field2415, class174.field2621, class174.field2465);
        } else if (arg0 == 25) {
            class42.method1845(class174.field2361, class174.field2569, class174.field2603);
        } else if (arg0 == 26) {
            class42.method1845(class174.field2469, class174.field2470, class174.field2471);
        } else if (arg0 == 27) {
            class42.method1845(class174.field2472, class174.field2473, class174.field2525);
        } else if (arg0 == 31) {
            class42.method1845(class174.field2481, class174.field2482, class174.field2483);
        } else if (arg0 == 32) {
            class42.method1845(class174.field2484, class174.field2485, class174.field2486);
        } else if (arg0 == 37) {
            class42.method1845(class174.field2607, class174.field2411, class174.field2489);
        } else if (arg0 == 38) {
            class42.method1845(class174.field2526, class174.field2388, class174.field2492);
        } else if (arg0 == 55) {
            class42.method1845(class174.field2493, class174.field2494, class174.field2495);
        } else if (arg0 == 56) {
            class42.method1845(class174.field2496, class174.field2497, class174.field2498);
            method2950(11);
            return;
        } else if (arg0 == 57) {
            class42.method1845(class174.field2499, class174.field2500, class174.field2382);
            method2950(11);
            return;
        } else {
            class42.method1845(class174.field2502, class174.field2455, class174.field2462);
        }
        method2950(10);
    }

    @ObfuscatedName("p.h(B)V")
    public static final void method576() {
        class201.method2607();
        class192.field2814.method2249();
        class193.method716();
        class198.method214();
        Statics.method3108();
        class199.field2958.method2249();
        class199.field2966.method2249();
        class199.field2960.method2249();
        class202.field3063.method2249();
        class202.field3064.method2249();
        class191.field2806.method2249();
        class191.field2799.method2249();
        Statics.method1988();
        class188.field2781.method2249();
        class197.method1898();
        class194.field2843.method2249();
        class194.field2842.method2249();
        class167.field2173.method2249();
        class170.field2231.method2249();
        class170.field2246.method2249();
        class170.field2197.method2249();
        class170.field2198.method2249();
        ((class75) Statics.field1457).method1382();
        class49.field958.method2249();
        Statics.field71.method3139();
        Statics.field799.method3139();
        Statics.field2182.method3139();
        Statics.field2111.method3139();
        Statics.field2150.method3139();
        Statics.field931.method3139();
        Statics.field160.method3139();
        Statics.field852.method3139();
        Statics.field751.method3139();
        Statics.field176.method3139();
        Statics.field131.method3139();
        Statics.field1644.method3139();
    }

    @ObfuscatedName("gw.u(B)V")
    public static final void method3631() {
        if (field483 > 0) {
            Statics.method3271();
        } else {
            method2950(40);
            Statics.field948 = Statics.field210;
            Statics.field210 = null;
        }
    }

    @ObfuscatedName("ac.m(I)V")
    public static final void method918() {
        if (Statics.field1563 != null) {
            Statics.field1563.method1038();
        }
        if (Statics.field74 != null) {
            Statics.field74.method1038();
        }
    }

    @ObfuscatedName("g.p(I)V")
    public static final void method88() {
        for (int var0 = 0; var0 < field530; var0++) {
            int var10002 = field533[var0]--;
            if (field533[var0] >= -10) {
                class54 var2 = field535[var0];
                if (var2 == null) {
                    class54 var10000 = (class54) null;
                    var2 = class54.method969(Statics.field2111, field536[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field533[var0] += var2.method968();
                    field535[var0] = var2;
                }
                if (field533[var0] < 0) {
                    int var9;
                    if (field529[var0] == 0) {
                        var9 = field528;
                    } else {
                        int var3 = (field529[var0] & 0xFF) * 128;
                        int var4 = field529[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field685.field610;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field529[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field685.field609;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field533[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field393 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class56 var10 = var2.method974().method1010(Statics.field2352);
                        class67 var11 = class67.method1171(var10, 100, var9);
                        var11.method1174(field532[var0] - 1);
                        Statics.field1431.method930(var11);
                    }
                    field533[var0] = -100;
                }
            } else {
                field530--;
                for (int var1 = var0; var1 < field530; var1++) {
                    field536[var1] = field536[var1 + 1];
                    field535[var1] = field535[var1 + 1];
                    field532[var1] = field532[var1 + 1];
                    field533[var1] = field533[var1 + 1];
                    field529[var1] = field529[var1 + 1];
                }
                var0--;
            }
        }
        if (field527 && !class139.method31()) {
            if (field525 != 0 && field526 != -1) {
                class139.method1859(Statics.field931, field526, 0, field525, false);
            }
            field527 = false;
        }
    }

    @ObfuscatedName("cr.aq(Lgn;IIII)V")
    public static void method1869(class202 arg0, int arg1, int arg2, int arg3) {
        if (field530 >= 50 || field393 == 0 || arg0.field3068 == null || arg1 >= arg0.field3068.length) {
            return;
        }
        int var4 = arg0.field3068[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field536[field530] = var5;
        field532[field530] = var6;
        field533[field530] = 0;
        field535[field530] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field529[field530] = (var8 << 16) + (var9 << 8) + var7;
        field530++;
    }

    @ObfuscatedName("w.aj(B)V")
    public static final void method231() {
        int[] var0 = class46.field921;
        for (int var1 = 0; var1 < class46.field913; var1++) {
            class24 var2 = field408[var0[var1]];
            if (var2 != null && var2.field627 > 0) {
                var2.field627--;
                if (var2.field627 == 0) {
                    var2.field614 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field325; var3++) {
            int var4 = field326[var3];
            class36 var5 = field324[var4];
            if (var5 != null && var5.field627 > 0) {
                var5.field627--;
                if (var5.field627 == 0) {
                    var5.field614 = null;
                }
            }
        }
    }

    @ObfuscatedName("t.ae(I)V")
    public static final void method111() {
        int var0 = Statics.field2685 * 128 + 64;
        int var1 = Statics.field88 * 128 + 64;
        int var2 = method754(var0, var1, Statics.field967) - Statics.field2822;
        if (Statics.field2896 < var0) {
            Statics.field2896 += Statics.field191 * (var0 - Statics.field2896) / 1000 + Statics.field787;
            if (Statics.field2896 > var0) {
                Statics.field2896 = var0;
            }
        }
        if (Statics.field2896 > var0) {
            Statics.field2896 -= Statics.field191 * (Statics.field2896 - var0) / 1000 + Statics.field787;
            if (Statics.field2896 < var0) {
                Statics.field2896 = var0;
            }
        }
        if (Statics.field277 < var2) {
            Statics.field277 += Statics.field191 * (var2 - Statics.field277) / 1000 + Statics.field787;
            if (Statics.field277 > var2) {
                Statics.field277 = var2;
            }
        }
        if (Statics.field277 > var2) {
            Statics.field277 -= Statics.field191 * (Statics.field277 - var2) / 1000 + Statics.field787;
            if (Statics.field277 < var2) {
                Statics.field277 = var2;
            }
        }
        if (Statics.field741 < var1) {
            Statics.field741 += Statics.field191 * (var1 - Statics.field741) / 1000 + Statics.field787;
            if (Statics.field741 > var1) {
                Statics.field741 = var1;
            }
        }
        if (Statics.field741 > var1) {
            Statics.field741 -= Statics.field191 * (Statics.field741 - var1) / 1000 + Statics.field787;
            if (Statics.field741 < var1) {
                Statics.field741 = var1;
            }
        }
        int var3 = Statics.field1630 * 128 + 64;
        int var4 = Statics.field1620 * 128 + 64;
        int var5 = method754(var3, var4, Statics.field967) - Statics.field3079;
        int var6 = var3 - Statics.field2896;
        int var7 = var5 - Statics.field277;
        int var8 = var4 - Statics.field741;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field110 < var10) {
            Statics.field110 += Statics.field163 * (var10 - Statics.field110) / 1000 + Statics.field1113;
            if (Statics.field110 > var10) {
                Statics.field110 = var10;
            }
        }
        if (Statics.field110 > var10) {
            Statics.field110 -= Statics.field163 * (Statics.field110 - var10) / 1000 + Statics.field1113;
            if (Statics.field110 < var10) {
                Statics.field110 = var10;
            }
        }
        int var12 = var11 - Statics.field2731;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field2731 += Statics.field163 * var12 / 1000 + Statics.field1113;
            Statics.field2731 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field2731 -= Statics.field163 * -var12 / 1000 + Statics.field1113;
            Statics.field2731 &= 0x7FF;
        }
        int var13 = var11 - Statics.field2731;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field2731 = var11;
        }
    }

    @ObfuscatedName("au.au(B)V")
    public static final void method650() {
        for (int var0 = 0; var0 < field325; var0++) {
            int var1 = field326[var0];
            class36 var2 = field324[var1];
            if (var2 != null) {
                method184(var2, var2.field756.field3042);
            }
        }
    }

    @ObfuscatedName("a.aa(Laj;IS)V")
    public static final void method184(class28 arg0, int arg1) {
        if (arg0.field641 > field489) {
            int var2 = arg0.field641 - field489;
            int var3 = arg0.field643 * 128 + arg0.field605 * 64;
            int var4 = arg0.field645 * 128 + arg0.field605 * 64;
            arg0.field610 += (var3 - arg0.field610) / var2;
            arg0.field609 += (var4 - arg0.field609) / var2;
            arg0.field659 = 0;
            arg0.field652 = arg0.field649;
        } else if (arg0.field648 >= field489) {
            method236(arg0);
        } else {
            method1644(arg0);
        }
        if (arg0.field610 < 128 || arg0.field609 < 128 || arg0.field610 >= 13184 || arg0.field609 >= 13184) {
            arg0.field633 = -1;
            arg0.field638 = -1;
            arg0.field641 = 0;
            arg0.field648 = 0;
            arg0.field610 = arg0.field656[0] * 128 + arg0.field605 * 64;
            arg0.field609 = arg0.field657[0] * 128 + arg0.field605 * 64;
            arg0.method584();
        }
        if (Statics.field685 == arg0 && (arg0.field610 < 1536 || arg0.field609 < 1536 || arg0.field610 >= 11776 || arg0.field609 >= 11776)) {
            arg0.field633 = -1;
            arg0.field638 = -1;
            arg0.field641 = 0;
            arg0.field648 = 0;
            arg0.field610 = arg0.field656[0] * 128 + arg0.field605 * 64;
            arg0.field609 = arg0.field657[0] * 128 + arg0.field605 * 64;
            arg0.method584();
        }
        if (arg0.field617 != 0) {
            if (arg0.field647 != -1) {
                class28 var5 = null;
                if (arg0.field647 < 32768) {
                    var5 = field324[arg0.field647];
                } else if (arg0.field647 >= 32768) {
                    var5 = field408[arg0.field647 - 32768];
                }
                if (var5 != null) {
                    int var6 = arg0.field610 - var5.field610;
                    int var7 = arg0.field609 - var5.field609;
                    if (var6 != 0 || var7 != 0) {
                        arg0.field652 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field628) {
                    arg0.field647 = -1;
                    arg0.field628 = false;
                }
            }
            if (arg0.field629 != -1 && (arg0.field655 == 0 || arg0.field659 > 0)) {
                arg0.field652 = arg0.field629;
                arg0.field629 = -1;
            }
            int var8 = arg0.field652 - arg0.field602 & 0x7FF;
            if (var8 == 0 && arg0.field628) {
                arg0.field647 = -1;
                arg0.field628 = false;
            }
            if (var8 == 0) {
                arg0.field653 = 0;
            } else {
                arg0.field653++;
                if (var8 > 1024) {
                    arg0.field602 -= arg0.field617;
                    boolean var9 = true;
                    if (var8 < arg0.field617 || var8 > 2048 - arg0.field617) {
                        arg0.field602 = arg0.field652;
                        var9 = false;
                    }
                    if (arg0.field630 == arg0.field604 && (arg0.field653 > 25 || var9)) {
                        if (arg0.field621 == -1) {
                            arg0.field630 = arg0.field622;
                        } else {
                            arg0.field630 = arg0.field621;
                        }
                    }
                } else {
                    arg0.field602 += arg0.field617;
                    boolean var10 = true;
                    if (var8 < arg0.field617 || var8 > 2048 - arg0.field617) {
                        arg0.field602 = arg0.field652;
                        var10 = false;
                    }
                    if (arg0.field630 == arg0.field604 && (arg0.field653 > 25 || var10)) {
                        if (arg0.field608 == -1) {
                            arg0.field630 = arg0.field622;
                        } else {
                            arg0.field630 = arg0.field608;
                        }
                    }
                }
                arg0.field602 &= 0x7FF;
            }
        }
        method228(arg0);
    }

    @ObfuscatedName("h.af(Laj;I)V")
    public static final void method236(class28 arg0) {
        if (field489 == arg0.field648 || arg0.field633 == -1 || arg0.field636 != 0 || arg0.field624 + 1 > class202.method17(arg0.field633).field3067[arg0.field650]) {
            int var1 = arg0.field648 - arg0.field641;
            int var2 = field489 - arg0.field641;
            int var3 = arg0.field643 * 128 + arg0.field605 * 64;
            int var4 = arg0.field645 * 128 + arg0.field605 * 64;
            int var5 = arg0.field644 * 128 + arg0.field605 * 64;
            int var6 = arg0.field635 * 128 + arg0.field605 * 64;
            arg0.field610 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field609 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field659 = 0;
        arg0.field652 = arg0.field649;
        arg0.field602 = arg0.field652;
    }

    @ObfuscatedName("cb.at(Laj;I)V")
    public static final void method1644(class28 arg0) {
        arg0.field630 = arg0.field604;
        if (arg0.field655 == 0) {
            arg0.field659 = 0;
            return;
        }
        if (arg0.field633 != -1 && arg0.field636 == 0) {
            class202 var1 = class202.method17(arg0.field633);
            if (arg0.field660 > 0 && var1.field3076 == 0) {
                arg0.field659++;
                return;
            }
            if (arg0.field660 <= 0 && var1.field3075 == 0) {
                arg0.field659++;
                return;
            }
        }
        int var2 = arg0.field610;
        int var3 = arg0.field609;
        int var4 = arg0.field656[arg0.field655 - 1] * 128 + arg0.field605 * 64;
        int var5 = arg0.field657[arg0.field655 - 1] * 128 + arg0.field605 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field652 = 1280;
            } else if (var3 > var5) {
                arg0.field652 = 1792;
            } else {
                arg0.field652 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field652 = 768;
            } else if (var3 > var5) {
                arg0.field652 = 256;
            } else {
                arg0.field652 = 512;
            }
        } else if (var3 < var5) {
            arg0.field652 = 1024;
        } else if (var3 > var5) {
            arg0.field652 = 0;
        }
        byte var6 = arg0.field658[arg0.field655 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field610 = var4;
            arg0.field609 = var5;
            arg0.field655--;
            if (arg0.field660 > 0) {
                arg0.field660--;
            }
            return;
        }
        int var7 = arg0.field652 - arg0.field602 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field634;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field622;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field612;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field611;
        }
        if (var8 == -1) {
            var8 = arg0.field622;
        }
        arg0.field630 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class36) {
            var10 = ((class36) arg0).field756.field3012;
        }
        if (var10) {
            if (arg0.field652 != arg0.field602 && arg0.field647 == -1 && arg0.field617 != 0) {
                var9 = 2;
            }
            if (arg0.field655 > 2) {
                var9 = 6;
            }
            if (arg0.field655 > 3) {
                var9 = 8;
            }
            if (arg0.field659 > 0 && arg0.field655 > 1) {
                var9 = 8;
                arg0.field659--;
            }
        } else {
            if (arg0.field655 > 1) {
                var9 = 6;
            }
            if (arg0.field655 > 2) {
                var9 = 8;
            }
            if (arg0.field659 > 0 && arg0.field655 > 1) {
                var9 = 8;
                arg0.field659--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field630 == arg0.field622 && arg0.field613 != -1) {
            arg0.field630 = arg0.field613;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field610 += var9;
                if (arg0.field610 > var4) {
                    arg0.field610 = var4;
                }
            } else if (var2 > var4) {
                arg0.field610 -= var9;
                if (arg0.field610 < var4) {
                    arg0.field610 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field609 += var9;
                if (arg0.field609 > var5) {
                    arg0.field609 = var5;
                }
            } else if (var3 > var5) {
                arg0.field609 -= var9;
                if (arg0.field609 < var5) {
                    arg0.field609 = var5;
                }
            }
        }
        if (arg0.field610 == var4 && arg0.field609 == var5) {
            arg0.field655--;
            if (arg0.field660 > 0) {
                arg0.field660--;
            }
        }
    }

    @ObfuscatedName("w.ap(Laj;I)V")
    public static final void method228(class28 arg0) {
        arg0.field603 = false;
        if (arg0.field630 != -1) {
            class202 var1 = class202.method17(arg0.field630);
            if (var1 == null || var1.field3062 == null) {
                arg0.field630 = -1;
            } else {
                arg0.field619++;
                if (arg0.field615 < var1.field3062.length && arg0.field619 > var1.field3067[arg0.field615]) {
                    arg0.field619 = 1;
                    arg0.field615++;
                    method1869(var1, arg0.field615, arg0.field610, arg0.field609);
                }
                if (arg0.field615 >= var1.field3062.length) {
                    arg0.field619 = 0;
                    arg0.field615 = 0;
                    method1869(var1, arg0.field615, arg0.field610, arg0.field609);
                }
            }
        }
        if (arg0.field638 != -1 && field489 >= arg0.field640) {
            if (arg0.field639 < 0) {
                arg0.field639 = 0;
            }
            int var2 = class191.method3117(arg0.field638).field2802;
            if (var2 == -1) {
                arg0.field638 = -1;
            } else {
                class202 var3 = class202.method17(var2);
                if (var3 == null || var3.field3062 == null) {
                    arg0.field638 = -1;
                } else {
                    arg0.field601++;
                    if (arg0.field639 < var3.field3062.length && arg0.field601 > var3.field3067[arg0.field639]) {
                        arg0.field601 = 1;
                        arg0.field639++;
                        method1869(var3, arg0.field639, arg0.field610, arg0.field609);
                    }
                    if (arg0.field639 >= var3.field3062.length && (arg0.field639 < 0 || arg0.field639 >= var3.field3062.length)) {
                        arg0.field638 = -1;
                    }
                }
            }
        }
        if (arg0.field633 != -1 && arg0.field636 <= 1) {
            class202 var4 = class202.method17(arg0.field633);
            if (var4.field3076 == 1 && arg0.field660 > 0 && arg0.field641 <= field489 && arg0.field648 < field489) {
                arg0.field636 = 1;
                return;
            }
        }
        if (arg0.field633 != -1 && arg0.field636 == 0) {
            class202 var5 = class202.method17(arg0.field633);
            if (var5 == null || var5.field3062 == null) {
                arg0.field633 = -1;
            } else {
                arg0.field624++;
                if (arg0.field650 < var5.field3062.length && arg0.field624 > var5.field3067[arg0.field650]) {
                    arg0.field624 = 1;
                    arg0.field650++;
                    method1869(var5, arg0.field650, arg0.field610, arg0.field609);
                }
                if (arg0.field650 >= var5.field3062.length) {
                    arg0.field650 -= var5.field3065;
                    arg0.field632++;
                    if (arg0.field632 >= var5.field3060) {
                        arg0.field633 = -1;
                    } else if (arg0.field650 >= 0 && arg0.field650 < var5.field3062.length) {
                        method1869(var5, arg0.field650, arg0.field610, arg0.field609);
                    } else {
                        arg0.field633 = -1;
                    }
                }
                arg0.field603 = var5.field3078;
            }
        }
        if (arg0.field636 > 0) {
            arg0.field636--;
        }
    }

    @ObfuscatedName("j.aw(Lu;III)V")
    public static void method69(class24 arg0, int arg1, int arg2) {
        if (arg0.field633 == arg1 && arg1 != -1) {
            int var3 = class202.method17(arg1).field3069;
            if (var3 == 1) {
                arg0.field650 = 0;
                arg0.field624 = 0;
                arg0.field636 = arg2;
                arg0.field632 = 0;
            }
            if (var3 == 2) {
                arg0.field632 = 0;
            }
        } else if (arg1 == -1 || arg0.field633 == -1 || class202.method17(arg1).field3072 >= class202.method17(arg0.field633).field3072) {
            arg0.field633 = arg1;
            arg0.field650 = 0;
            arg0.field624 = 0;
            arg0.field636 = arg2;
            arg0.field632 = 0;
            arg0.field660 = arg0.field655;
        }
    }

    @ObfuscatedName("fh.ah(I)I")
    public static int method3091() {
        return field502 ? 2 : 1;
    }

    @ObfuscatedName("fg.ao(II)V")
    public static void method2949(int arg0) {
        field433 = 0L;
        if (arg0 >= 2) {
            field502 = true;
        } else {
            field502 = false;
        }
        method2884();
        if (field295 >= 25) {
            field417.method2920(175);
            field417.method2780(method3091());
            field417.method2793(Statics.field1559);
            field417.method2793(Statics.field2788);
        }
        field1763 = true;
    }

    @ObfuscatedName("ec.ag(I)V")
    public static void method2884() {
        client var0 = Statics.field297;
        synchronized (Statics.field297) {
            Container var1 = Statics.field297.method2036();
            if (var1 != null) {
                Statics.field887 = Math.max(var1.getSize().width, Statics.field896);
                Statics.field155 = Math.max(var1.getSize().height, Statics.field891);
                if (Statics.field597 == var1) {
                    Insets var2 = Statics.field597.getInsets();
                    Statics.field887 -= var2.right + var2.left;
                    Statics.field155 -= var2.top + var2.bottom;
                }
                if (Statics.field887 <= 0) {
                    Statics.field887 = 1;
                }
                if (Statics.field155 <= 0) {
                    Statics.field155 = 1;
                }
                if (method3091() == 1) {
                    Statics.field1559 = field566;
                    Statics.field2788 = field504;
                } else {
                    Statics.field1559 = Math.min(Statics.field887, 7680);
                    Statics.field2788 = Math.min(Statics.field155, 2160);
                }
                field1760 = (Statics.field887 - Statics.field1559) / 2;
                field1762 = 0;
                Statics.field1995.setSize(Statics.field1559, Statics.field2788);
                Statics.field2010 = class221.method271(Statics.field1559, Statics.field2788, Statics.field1995);
                if (Statics.field597 == var1) {
                    Insets var3 = Statics.field597.getInsets();
                    Statics.field1995.setLocation(field1760 + var3.left, field1762 + var3.top);
                } else {
                    Statics.field1995.setLocation(field1760, field1762);
                }
                int var4 = Statics.field1559;
                int var5 = Statics.field2788;
                if (Statics.field887 < var4) {
                    int var6 = Statics.field887;
                }
                if (Statics.field155 < var5) {
                    int var7 = Statics.field155;
                }
                if (Statics.field2073 != null) {
                    try {
                        client var8 = Statics.field297;
                        Object[] var9 = new Object[] { method3091() };
                        JSObject.getWindow(var8).call("resize", var9);
                    } catch (Throwable var12) {
                    }
                }
                if (field448 != -1) {
                    method23(true);
                }
                method624();
            }
        }
    }

    @ObfuscatedName("au.az(I)V")
    public static void method624() {
        int var0 = field1760;
        int var1 = field1762;
        int var2 = Statics.field887 - Statics.field1559 - var0;
        int var3 = Statics.field155 - Statics.field2788 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field297.method2036();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field597 == var4) {
                Insets var7 = Statics.field597.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field155);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field887, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field887 + var5 - var2, var6, var2, Statics.field155);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field155 + var6 - var3, Statics.field887, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("i.ai(B)V")
    public static final void method203() {
        if (field448 != -1) {
            int var0 = field448;
            if (class170.method1498(var0)) {
                method2994(Statics.field2329[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field491; var1++) {
            if (field493[var1]) {
                field494[var1] = true;
            }
            field495[var1] = field493[var1];
            field493[var1] = false;
        }
        field512 = field489;
        field437 = -1;
        field438 = -1;
        Statics.field24 = null;
        if (field448 != -1) {
            field491 = 0;
            method2951(field448, 0, 0, Statics.field1559, Statics.field2788, 0, 0, -1);
        }
        class220.method3850();
        if (field426) {
            int var6 = Statics.field1807;
            int var7 = Statics.field1543;
            int var8 = Statics.field1720;
            int var9 = Statics.field847;
            int var10 = 6116423;
            class220.method3815(var6, var7, var8, var9, var10);
            class220.method3815(var6 + 1, var7 + 1, var8 - 2, 16, 0);
            class220.method3821(var6 + 1, var7 + 18, var8 - 2, var9 - 19, 0);
            Statics.field283.method3701(class174.field2511, var6 + 3, var7 + 14, var10, -1);
            int var11 = class116.field1787;
            int var12 = class116.field1783 * -667823397;
            for (int var13 = 0; var13 < field427; var13++) {
                int var14 = (field427 - 1 - var13) * 15 + var7 + 31;
                int var15 = 16777215;
                if (var11 > var6 && var11 < var6 + var8 && var12 > var14 - 13 && var12 < var14 + 3) {
                    var15 = 16776960;
                }
                Statics.field283.method3701(method3435(var13), var6 + 3, var14, var15, 0);
            }
            int var16 = Statics.field1807;
            int var17 = Statics.field1543;
            int var18 = Statics.field1720;
            int var19 = Statics.field847;
            for (int var20 = 0; var20 < field491; var20++) {
                if (field498[var20] + field470[var20] > var16 && field470[var20] < var16 + var18 && field499[var20] + field372[var20] > var17 && field372[var20] < var17 + var19) {
                    field494[var20] = true;
                }
            }
        } else if (field437 != -1) {
            int var2 = field437;
            int var3 = field438;
            if (field427 >= 2 || field441 != 0 || field443) {
                int var4 = method2388();
                String var5;
                if (field441 == 1 && field427 < 2) {
                    var5 = class174.field2508 + class174.field2602 + field337 + " " + class38.field776;
                } else if (field443 && field427 < 2) {
                    var5 = field446 + class174.field2602 + field447 + " " + class38.field776;
                } else {
                    var5 = method3435(var4);
                }
                if (field427 > 2) {
                    var5 = var5 + class38.method3030(16777215) + " " + '/' + " " + (field427 - 2) + class174.field2606;
                }
                Statics.field283.method3746(var5, var2 + 4, var3 + 15, 16777215, 0, field489 / 1000);
            }
        }
        if (field500 == 3) {
            for (int var21 = 0; var21 < field491; var21++) {
                if (field495[var21]) {
                    class220.method3814(field470[var21], field372[var21], field498[var21], field499[var21], 16711935, 128);
                } else if (field494[var21]) {
                    class220.method3814(field470[var21], field372[var21], field498[var21], field499[var21], 16711680, 128);
                }
            }
        }
        int var22 = Statics.field967;
        int var23 = Statics.field685.field610;
        int var24 = Statics.field685.field609;
        int var25 = field361;
        for (class32 var26 = (class32) class32.field712.method2315(); var26 != null; var26 = (class32) class32.field712.method2332()) {
            if (var26.field707 != -1 || var26.field705 != null) {
                int var27 = 0;
                if (var23 > var26.field704) {
                    var27 += var23 - var26.field704;
                } else if (var23 < var26.field708) {
                    var27 += var26.field708 - var23;
                }
                if (var24 > var26.field717) {
                    var27 += var24 - var26.field717;
                } else if (var24 < var26.field703) {
                    var27 += var26.field703 - var24;
                }
                if (var27 - 64 > var26.field706 || field393 == 0 || var26.field700 != var22) {
                    if (var26.field701 != null) {
                        Statics.field1431.method921(var26.field701);
                        var26.field701 = null;
                    }
                    if (var26.field702 != null) {
                        Statics.field1431.method921(var26.field702);
                        var26.field702 = null;
                    }
                } else {
                    var27 -= 64;
                    if (var27 < 0) {
                        var27 = 0;
                    }
                    int var28 = field393 * (var26.field706 - var27) / var26.field706;
                    class54 var10000;
                    if (var26.field701 != null) {
                        var26.field701.method1175(var28);
                    } else if (var26.field707 >= 0) {
                        var10000 = (class54) null;
                        class54 var29 = class54.method969(Statics.field2111, var26.field707, 0);
                        if (var29 != null) {
                            class56 var30 = var29.method974().method1010(Statics.field2352);
                            class67 var31 = class67.method1171(var30, 100, var28);
                            var31.method1174(-1);
                            Statics.field1431.method930(var31);
                            var26.field701 = var31;
                        }
                    }
                    if (var26.field702 != null) {
                        var26.field702.method1175(var28);
                        if (!var26.field702.method2299()) {
                            var26.field702 = null;
                        }
                    } else if (var26.field705 != null && (var26.field711 -= var25) <= 0) {
                        int var32 = (int) (Math.random() * (double) var26.field705.length);
                        var10000 = (class54) null;
                        class54 var33 = class54.method969(Statics.field2111, var26.field705[var32], 0);
                        if (var33 != null) {
                            class56 var34 = var33.method974().method1010(Statics.field2352);
                            class67 var35 = class67.method1171(var34, 100, var28);
                            var35.method1174(0);
                            Statics.field1431.method930(var35);
                            var26.field702 = var35;
                            var26.field711 = var26.field709 + (int) (Math.random() * (double) (var26.field710 - var26.field709));
                        }
                    }
                }
            }
        }
        field361 = 0;
    }

    @ObfuscatedName("fm.as(Ljava/lang/String;ZI)V")
    public static final void method3121(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field940.method3704(arg0, 250);
        int var6 = Statics.field940.method3705(arg0, 250) * 13;
        class220.method3815(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class220.method3821(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field940.method3711(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method1866(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field1995.getGraphics();
                Statics.field2010.method3798(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field1995.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field491; var13++) {
            if (field498[var13] + field470[var13] > var9 && field470[var13] < var9 + var11 && field499[var13] + field372[var13] > var10 && field372[var13] < var10 + var12) {
                field494[var13] = true;
            }
        }
    }

    @ObfuscatedName("ay.ak(IIIIZI)V")
    public static final void method840(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field397 - field542) * var5 / 100 + field542;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field548) {
            short var8 = field548;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field547) {
                var6 = field547;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class220.method3850();
                    class220.method3815(arg0, arg1, var10, arg3, -16777216);
                    class220.method3815(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field549) {
            short var11 = field549;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field457) {
                var6 = field457;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class220.method3850();
                    class220.method3815(arg0, arg1, arg2, var13, -16777216);
                    class220.method3815(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field545 - field544) * var5 / 100 + field544;
        field554 = arg3 * var6 * var14 / 85504 << 1;
        if (field552 != arg2 || field553 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class85.field1460[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class88.method1682(var15, 500, 800, arg2, arg3);
        }
        field550 = arg0;
        field291 = arg1;
        field552 = arg2;
        field553 = arg3;
    }

    @ObfuscatedName("ae.an(Lo;B)V")
    public static final void method606(class16 arg0) {
        if (Statics.field685.field610 >> 7 == field292 && Statics.field685.field609 >> 7 == field305) {
            field292 = 0;
        }
        int var1 = class46.field913;
        int[] var2 = class46.field921;
        int var3 = var1;
        if (class16.field177 == arg0 || class16.field172 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class24 var5;
            int var6;
            if (class16.field177 == arg0) {
                var5 = Statics.field685;
                var6 = Statics.field685.field268 << 14;
            } else if (class16.field172 == arg0) {
                var5 = field408[field375];
                var6 = field375 << 14;
            } else {
                var5 = field408[var2[var4]];
                var6 = var2[var4] << 14;
                if (class16.field175 == arg0 && field375 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method245() && !var5.field266) {
                var5.field256 = false;
                if ((field569 && var1 > 50 || var1 > 200) && class16.field177 != arg0 && var5.field630 == var5.field604) {
                    var5.field256 = true;
                }
                int var7 = var5.field610 >> 7;
                int var8 = var5.field609 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field259 == null || field489 < var5.field269 || field489 >= var5.field247) {
                        if ((var5.field610 & 0x7F) == 64 && (var5.field609 & 0x7F) == 64) {
                            if (field392 == field391[var7][var8]) {
                                continue;
                            }
                            field391[var7][var8] = field392;
                        }
                        var5.field254 = method754(var5.field610, var5.field609, Statics.field967);
                        Statics.field2110.method1658(Statics.field967, var5.field610, var5.field609, var5.field254, 60, var5, var5.field602, var6, var5.field603);
                    } else {
                        var5.field256 = false;
                        var5.field254 = method754(var5.field610, var5.field609, Statics.field967);
                        Statics.field2110.method1659(Statics.field967, var5.field610, var5.field609, var5.field254, 60, var5, var5.field602, var6, var5.field260, var5.field261, var5.field264, var5.field263);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ge.av(ZI)V")
    public static final void method3396(boolean arg0) {
        for (int var1 = 0; var1 < field325; var1++) {
            class36 var2 = field324[field326[var1]];
            int var3 = (field326[var1] << 14) + 536870912;
            if (var2 != null && var2.method245() && var2.field756.field3033 == arg0 && var2.field756.method3544()) {
                int var4 = var2.field610 >> 7;
                int var5 = var2.field609 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field605 == 1 && (var2.field610 & 0x7F) == 64 && (var2.field609 & 0x7F) == 64) {
                        if (field392 == field391[var4][var5]) {
                            continue;
                        }
                        field391[var4][var5] = field392;
                    }
                    if (!var2.field756.field3041) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2110.method1658(Statics.field967, var2.field610, var2.field609, method754(var2.field610 + (var2.field605 * 64 - 64), var2.field609 + (var2.field605 * 64 - 64), Statics.field967), var2.field605 * 64 - 64 + 60, var2, var2.field602, var3, var2.field603);
                }
            }
        }
    }

    @ObfuscatedName("m.ab(I)V")
    public static final void method266() {
        for (class43 var0 = (class43) field420.method2315(); var0 != null; var0 = (class43) field420.method2332()) {
            if (Statics.field967 != var0.field870 || field489 > var0.field864) {
                var0.method2298();
            } else if (field489 >= var0.field863) {
                if (var0.field878 > 0) {
                    class36 var1 = field324[var0.field878 - 1];
                    if (var1 != null && var1.field610 >= 0 && var1.field610 < 13312 && var1.field609 >= 0 && var1.field609 < 13312) {
                        var0.method807(var1.field610, var1.field609, method754(var1.field610, var1.field609, var0.field870) - var0.field873, field489);
                    }
                }
                if (var0.field878 < 0) {
                    int var2 = -var0.field878 - 1;
                    class24 var3;
                    if (field431 == var2) {
                        var3 = Statics.field685;
                    } else {
                        var3 = field408[var2];
                    }
                    if (var3 != null && var3.field610 >= 0 && var3.field610 < 13312 && var3.field609 >= 0 && var3.field609 < 13312) {
                        var0.method807(var3.field610, var3.field609, method754(var3.field610, var3.field609, var0.field870) - var0.field873, field489);
                    }
                }
                var0.method801(field361);
                Statics.field2110.method1658(Statics.field967, (int) var0.field869, (int) var0.field861, (int) var0.field871, 60, var0, var0.field877, -1, false);
            }
        }
    }

    @ObfuscatedName("m.ay(I)V")
    public static final void method265() {
        for (class34 var0 = (class34) field421.method2315(); var0 != null; var0 = (class34) field421.method2332()) {
            if (Statics.field967 != var0.field738 || var0.field745) {
                var0.method2298();
            } else if (field489 >= var0.field737) {
                var0.method718(field361);
                if (var0.field745) {
                    var0.method2298();
                } else {
                    Statics.field2110.method1658(var0.field738, var0.field739, var0.field740, var0.field744, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("v.am(I)I")
    public static final int method189() {
        if (Statics.field2073.field687) {
            return Statics.field967;
        } else {
            int var0 = method754(Statics.field2896, Statics.field741, Statics.field967);
            return var0 - Statics.field277 >= 800 || (class11.field104[Statics.field967][Statics.field2896 >> 7][Statics.field741 >> 7] & 0x4) == 0 ? 3 : Statics.field967;
        }
    }

    @ObfuscatedName("ds.ar(Laj;IIIIII)V")
    public static final void method2114(class28 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method245()) {
            return;
        }
        if (arg0 instanceof class36) {
            class200 var6 = ((class36) arg0).field756;
            if (var6.field3035 != null) {
                var6 = var6.method3552();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class46.field913;
        int[] var8 = class46.field921;
        int var9 = 3;
        if (!arg0.field626.method2282()) {
            method185(arg0, arg0.field651 + 15);
            for (class35 var10 = (class35) arg0.field626.method2277(); var10 != null; var10 = (class35) arg0.field626.method2280()) {
                class29 var11 = var10.method726(field489);
                if (var11 != null) {
                    class194 var12 = var10.field747;
                    class225 var13 = var12.method3362();
                    class225 var14 = var12.method3361();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field2851;
                    } else {
                        if (var12.field2852 * 2 < var14.field3217) {
                            var15 = var12.field2852;
                        }
                        var16 = var14.field3217 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field489 - var11.field665;
                    int var20 = var11.field667 * var16 / var12.field2851;
                    int var23;
                    if (var11.field663 > var19) {
                        int var21 = var12.field2847 == 0 ? 0 : var19 / var12.field2847 * var12.field2847;
                        int var22 = var11.field664 * var16 / var12.field2851;
                        var23 = (var20 - var22) * var21 / var11.field663 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field663 + var12.field2848 - var19;
                        if (var12.field2845 >= 0) {
                            var17 = (var24 << 8) / (var12.field2848 - var12.field2845);
                        }
                    }
                    if (var11.field667 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field439 + arg2 - (var16 >> 1);
                    int var26 = field284 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field439 > -1) {
                            class220.method3815(var25, var26, var23, 5, 65280);
                            class220.method3815(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3219;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method3943(var27, var26, var17);
                            class220.method3839(var27, var26, var27 + var28, var26 + var29);
                            var14.method3943(var27, var26, var17);
                        } else {
                            var13.method3937(var27, var26);
                            class220.method3839(var27, var26, var27 + var28, var26 + var29);
                            var14.method3937(var27, var26);
                        }
                        class220.method3809(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method727()) {
                    var10.method2298();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class24 var30 = (class24) arg0;
            if (var30.field266) {
                return;
            }
            if (var30.field245 != -1 || var30.field248 != -1) {
                method185(arg0, arg0.field651 + 15);
                if (field439 > -1) {
                    if (var30.field245 != -1) {
                        Statics.field1209[var30.field245].method3937(field439 + arg2 - 12, field284 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field248 != -1) {
                        Statics.field599[var30.field248].method3937(field439 + arg2 - 12, field284 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field285 == 10 && field503 == var8[arg1]) {
                method185(arg0, arg0.field651 + 15);
                if (field439 > -1) {
                    Statics.field2874[1].method3937(field439 + arg2 - 12, field284 + arg3 - var9);
                }
            }
        } else {
            class200 var31 = ((class36) arg0).field756;
            if (var31.field3035 != null) {
                var31 = var31.method3552();
            }
            if (var31.field3036 >= 0 && var31.field3036 < Statics.field599.length) {
                method185(arg0, arg0.field651 + 15);
                if (field439 > -1) {
                    Statics.field599[var31.field3036].method3937(field439 + arg2 - 12, field284 + arg3 - 30);
                }
            }
            if (field285 == 1 && field306 == field326[arg1 - var7] && field489 % 20 < 10) {
                method185(arg0, arg0.field651 + 15);
                if (field439 > -1) {
                    Statics.field2874[0].method3937(field439 + arg2 - 12, field284 + arg3 - 28);
                }
            }
        }
        if (arg0.field614 != null && (arg1 >= var7 || !arg0.field616 && (field506 == 4 || !arg0.field646 && (field506 == 0 || field506 == 3 || field506 == 1 && method1352(((class24) arg0).field267, false))))) {
            method185(arg0, arg0.field651);
            if (field439 > -1 && field360 < field382) {
                field386[field360] = Statics.field283.method3727(arg0.field614) / 2;
                field543[field360] = Statics.field283.field3118;
                field383[field360] = field439;
                field384[field360] = field284;
                field460[field360] = arg0.field618;
                field388[field360] = arg0.field631;
                field389[field360] = arg0.field627;
                field390[field360] = arg0.field614;
                field360++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field623[var32];
            int var34 = arg0.field654[var32];
            class197 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field489) {
                    continue;
                }
                var35 = class197.method2512(arg0.field654[var32]);
                var36 = var35.field2886;
                if (var35 != null && var35.field2877 != null) {
                    var35 = var35.method3400();
                    if (var35 == null) {
                        arg0.field623[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field606[var32];
            class197 var38 = null;
            if (var37 >= 0) {
                var38 = class197.method2512(var37);
                if (var38 != null && var38.field2877 != null) {
                    var38 = var38.method3400();
                }
            }
            if (var33 - var36 <= field489) {
                if (var35 == null) {
                    arg0.field623[var32] = -1;
                } else {
                    method185(arg0, arg0.field651 / 2);
                    if (field439 > -1) {
                        if (var32 == 1) {
                            field284 -= 20;
                        }
                        if (var32 == 2) {
                            field439 -= 15;
                            field284 -= 10;
                        }
                        if (var32 == 3) {
                            field439 += 15;
                            field284 -= 10;
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
                        class225 var64 = var35.method3417();
                        if (var64 != null) {
                            var43 = var64.field3217;
                            int var65 = var64.field3219;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3226;
                        }
                        class225 var66 = var35.method3403();
                        if (var66 != null) {
                            var44 = var66.field3217;
                            int var67 = var66.field3219;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3226;
                        }
                        class225 var68 = var35.method3401();
                        if (var68 != null) {
                            var45 = var68.field3217;
                            int var69 = var68.field3219;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3226;
                        }
                        class225 var70 = var35.method3405();
                        if (var70 != null) {
                            var46 = var70.field3217;
                            int var71 = var70.field3219;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3226;
                        }
                        if (var38 != null) {
                            var51 = var38.method3417();
                            if (var51 != null) {
                                var55 = var51.field3217;
                                int var72 = var51.field3219;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3226;
                            }
                            var52 = var38.method3403();
                            if (var52 != null) {
                                var56 = var52.field3217;
                                int var73 = var52.field3219;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3226;
                            }
                            var53 = var38.method3401();
                            if (var53 != null) {
                                var57 = var53.field3217;
                                int var74 = var53.field3219;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3226;
                            }
                            var54 = var38.method3405();
                            if (var54 != null) {
                                var58 = var54.field3217;
                                int var75 = var54.field3219;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3226;
                            }
                        }
                        class209 var76 = var35.method3406();
                        if (var76 == null) {
                            var76 = Statics.field1567;
                        }
                        class209 var77;
                        if (var38 == null) {
                            var77 = Statics.field1567;
                        } else {
                            var77 = var38.method3406();
                            if (var77 == null) {
                                var77 = Statics.field1567;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method3429(arg0.field607[var32]);
                        int var83 = var76.method3727(var82);
                        if (var38 != null) {
                            var79 = var38.method3429(arg0.field625[var32]);
                            var81 = var77.method3727(var79);
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
                        int var100 = arg0.field623[var32] - field489;
                        int var101 = var35.field2891 - var35.field2891 * var100 / var35.field2886;
                        int var102 = var35.field2892 * var100 / var35.field2886 + -var35.field2892;
                        int var103 = field439 + arg2 - (var92 >> 1) + var101;
                        int var104 = field284 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field2888 + var104 + 15;
                        int var108 = var107 - var76.field3125;
                        int var109 = var76.field3120 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field2888 + var104 + 15;
                            int var111 = var110 - var77.field3125;
                            int var112 = var77.field3120 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field2893 >= 0) {
                            var115 = (var100 << 8) / (var35.field2886 - var35.field2893);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method3943(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method3943(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method3943(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method3943(var93 + var103 - var50, var104, var115);
                            }
                            var76.method3708(var82, var90 + var103, var107, var35.field2899, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method3943(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method3943(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method3943(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method3943(var97 + var103 - var62, var104, var115);
                                }
                                var77.method3708(var79, var98 + var103, var110, var38.field2899, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method3937(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method3937(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method3937(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method3937(var93 + var103 - var50, var104);
                            }
                            var76.method3701(var82, var90 + var103, var107, var35.field2899 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method3937(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method3937(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method3937(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method3937(var97 + var103 - var62, var104);
                                }
                                var77.method3701(var79, var98 + var103, var110, var38.field2899 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("t.ad(IIIIB)V")
    public static final void method113(int arg0, int arg1, int arg2, int arg3) {
        field360 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class46.field913;
        int[] var7 = class46.field921;
        for (int var8 = 0; var8 < field325 + var6; var8++) {
            class28 var9;
            if (var8 < var6) {
                var9 = field408[var7[var8]];
                if (field375 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field324[field326[var8 - var6]];
            }
            method2114(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method2114(field408[field375], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field360; var10++) {
            int var11 = field383[var10];
            int var12 = field384[var10];
            int var13 = field386[var10];
            int var14 = field543[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field384[var16] - field543[var16] && var12 - var14 < field384[var16] + 2 && var11 - var13 < field386[var16] + field383[var16] && var11 + var13 > field383[var16] - field386[var16] && field384[var16] - field543[var16] < var12) {
                        var12 = field384[var16] - field543[var16];
                        var15 = true;
                    }
                }
            }
            field439 = field383[var10];
            field284 = field384[var10] = var12;
            String var17 = field390[var10];
            if (field429 == 0) {
                int var18 = 16776960;
                if (field460[var10] < 6) {
                    var18 = field505[field460[var10]];
                }
                if (field460[var10] == 6) {
                    var18 = field392 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field460[var10] == 7) {
                    var18 = field392 % 20 < 10 ? 255 : 65535;
                }
                if (field460[var10] == 8) {
                    var18 = field392 % 20 < 10 ? 45056 : 8454016;
                }
                if (field460[var10] == 9) {
                    int var19 = 150 - field389[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field460[var10] == 10) {
                    int var20 = 150 - field389[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field460[var10] == 11) {
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
                    Statics.field283.method3710(var17, field439 + arg0, field284 + arg1, var18, 0);
                }
                if (field388[var10] == 1) {
                    Statics.field283.method3712(var17, field439 + arg0, field284 + arg1, var18, 0, field392);
                }
                if (field388[var10] == 2) {
                    Statics.field283.method3738(var17, field439 + arg0, field284 + arg1, var18, 0, field392);
                }
                if (field388[var10] == 3) {
                    Statics.field283.method3714(var17, field439 + arg0, field284 + arg1, var18, 0, field392, 150 - field389[var10]);
                }
                if (field388[var10] == 4) {
                    int var22 = (150 - field389[var10]) * (Statics.field283.method3727(var17) + 100) / 150;
                    class220.method3839(field439 + arg0 - 50, arg1, field439 + arg0 + 50, arg1 + arg3);
                    Statics.field283.method3701(var17, field439 + arg0 + 50 - var22, field284 + arg1, var18, 0);
                    class220.method3809(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field388[var10] == 5) {
                    int var23 = 150 - field389[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class220.method3839(arg0, field284 + arg1 - Statics.field283.field3118 - 1, arg0 + arg2, field284 + arg1 + 5);
                    Statics.field283.method3710(var17, field439 + arg0, field284 + arg1 + var24, var18, 0);
                    class220.method3809(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field283.method3710(var17, field439 + arg0, field284 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("fk.ax(B)V")
    public static final void method2987() {
        field407 = 0;
        int var0 = (Statics.field685.field610 >> 7) + Statics.field19;
        int var1 = (Statics.field685.field609 >> 7) + Statics.field341;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field407 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field407 = 1;
        }
        if (field407 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field407 = 0;
        }
    }

    @ObfuscatedName("eh.ac(IIIII)V")
    public static final void method2402(int arg0, int arg1, int arg2, int arg3) {
        if (field333 == 1) {
            Statics.field281[field350 / 100].method3937(field395 - 8, field396 - 8);
        }
        if (field333 == 2) {
            Statics.field281[field350 / 100 + 4].method3937(field395 - 8, field396 - 8);
        }
        method2987();
    }

    @ObfuscatedName("a.al(Laj;II)V")
    public static final void method185(class28 arg0, int arg1) {
        method1485(arg0.field610, arg0.field609, arg1);
    }

    @ObfuscatedName("ch.bu(IIIB)V")
    public static final void method1485(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field439 = -1;
            field284 = -1;
            return;
        }
        int var3 = method754(arg0, arg1, Statics.field967) - arg2;
        int var4 = arg0 - Statics.field2896;
        int var5 = var3 - Statics.field277;
        int var6 = arg1 - Statics.field741;
        int var7 = class85.field1460[Statics.field110];
        int var8 = class85.field1461[Statics.field110];
        int var9 = class85.field1460[Statics.field2731];
        int var10 = class85.field1461[Statics.field2731];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field439 = field554 * var11 / var15 + field552 / 2;
            field284 = field554 * var14 / var15 + field553 / 2;
        } else {
            field439 = -1;
            field284 = -1;
        }
    }

    @ObfuscatedName("ag.bd(IIII)I")
    public static final int method754(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class11.field104[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class11.field121[var5][var3][var4] + class11.field121[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class11.field121[var5][var3][var4 + 1] + class11.field121[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("as.bo(III)V")
    public static final void method769(int arg0, int arg1) {
        if (Statics.field771 == arg0 && Statics.field1088 == arg1) {
            return;
        }
        Statics.field771 = arg0;
        Statics.field1088 = arg1;
        method2950(25);
        method3121(class174.field2370, true);
        int var2 = Statics.field19;
        int var3 = Statics.field341;
        Statics.field19 = (arg0 - 6) * 8;
        Statics.field341 = (arg1 - 6) * 8;
        int var4 = Statics.field19 - var2;
        int var5 = Statics.field341 - var3;
        int var6 = Statics.field19;
        int var7 = Statics.field341;
        for (int var8 = 0; var8 < 32768; var8++) {
            class36 var9 = field324[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field656[var10] -= var4;
                    var9.field657[var10] -= var5;
                }
                var9.field610 -= var4 * 128;
                var9.field609 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class24 var12 = field408[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field656[var13] -= var4;
                    var12.field657[var13] -= var5;
                }
                var12.field610 -= var4 * 128;
                var12.field609 -= var5 * 128;
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
                        field418[var24][var20][var21] = field418[var24][var22][var23];
                    } else {
                        field418[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class26 var25 = (class26) field302.method2315(); var25 != null; var25 = (class26) field302.method2332()) {
            var25.field574 -= var4;
            var25.field575 -= var5;
            if (var25.field574 < 0 || var25.field575 < 0 || var25.field574 >= 104 || var25.field575 >= 104) {
                var25.method2298();
            }
        }
        if (field292 != 0) {
            field292 -= var4;
            field305 -= var5;
        }
        field530 = 0;
        field565 = false;
        field517 = -1;
        field421.method2307();
        field420.method2307();
        for (int var26 = 0; var26 < 4; var26++) {
            field348[var26].method2177();
        }
    }

    @ObfuscatedName("p.ba(ZI)V")
    public static final void method575(boolean arg0) {
        method918();
        field335++;
        if (field335 < 50 && !arg0) {
            return;
        }
        field335 = 0;
        if (field340 || Statics.field210 == null) {
            return;
        }
        field417.method2920(110);
        try {
            Statics.field210.method1996(field417.field2084, 0, field417.field2079);
            field417.field2079 = 0;
        } catch (IOException var2) {
            field340 = true;
        }
    }

    @ObfuscatedName("du.bf(I)V")
    public static final void method2109() {
        method575(false);
        field342 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1843.length; var1++) {
            if (Statics.field347[var1] != -1 && Statics.field1843[var1] == null) {
                Statics.field1843[var1] = Statics.field2150.method3126(Statics.field347[var1], 0);
                if (Statics.field1843[var1] == null) {
                    var0 = false;
                    field342++;
                }
            }
            if (Statics.field2336[var1] != -1 && Statics.field692[var1] == null) {
                Statics.field692[var1] = Statics.field2150.method3127(Statics.field2336[var1], 0, Statics.field279[var1]);
                if (Statics.field692[var1] == null) {
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
        for (int var3 = 0; var3 < Statics.field1843.length; var3++) {
            byte[] var4 = Statics.field692[var3];
            if (var4 != null) {
                int var5 = (Statics.field2176[var3] >> 8) * 64 - Statics.field19;
                int var6 = (Statics.field2176[var3] & 0xFF) * 64 - Statics.field341;
                if (field496) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class11.method172(var4, var5, var6);
            }
        }
        if (!var2) {
            field346 = 2;
            return;
        }
        if (field346 != 0) {
            method3121(class174.field2370 + class38.field782 + class38.field779 + 100 + "%" + class38.field777, true);
        }
        method918();
        method576();
        method918();
        Statics.field2110.method1647();
        method918();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field348[var7].method2177();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class11.field104[var8][var9][var10] = 0;
                }
            }
        }
        method918();
        class11.method285();
        int var11 = Statics.field1843.length;
        class32.method208();
        method575(true);
        if (!field496) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field2176[var12] >> 8) * 64 - Statics.field19;
                int var14 = (Statics.field2176[var12] & 0xFF) * 64 - Statics.field341;
                byte[] var15 = Statics.field1843[var12];
                if (var15 != null) {
                    method918();
                    int var16 = Statics.field771 * 8 - 48;
                    int var17 = Statics.field1088 * 8 - 48;
                    class118[] var18 = field348;
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 64; var20++) {
                            for (int var21 = 0; var21 < 64; var21++) {
                                if (var13 + var20 > 0 && var13 + var20 < 103 && var14 + var21 > 0 && var14 + var21 < 103) {
                                    var18[var19].field1808[var13 + var20][var14 + var21] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class154 var22 = new class154(var15);
                    for (int var23 = 0; var23 < 4; var23++) {
                        for (int var24 = 0; var24 < 64; var24++) {
                            for (int var25 = 0; var25 < 64; var25++) {
                                class11.method886(var22, var23, var13 + var24, var14 + var25, var16, var17, 0);
                            }
                        }
                    }
                }
            }
            for (int var26 = 0; var26 < var11; var26++) {
                int var27 = (Statics.field2176[var26] >> 8) * 64 - Statics.field19;
                int var28 = (Statics.field2176[var26] & 0xFF) * 64 - Statics.field341;
                byte[] var29 = Statics.field1843[var26];
                if (var29 == null && Statics.field1088 < 800) {
                    method918();
                    class11.method2947(var27, var28, 64, 64);
                }
            }
            method575(true);
            for (int var30 = 0; var30 < var11; var30++) {
                byte[] var31 = Statics.field692[var30];
                if (var31 != null) {
                    int var32 = (Statics.field2176[var30] >> 8) * 64 - Statics.field19;
                    int var33 = (Statics.field2176[var30] & 0xFF) * 64 - Statics.field341;
                    method918();
                    class11.method18(var31, var32, var33, Statics.field2110, field348);
                }
            }
        }
        if (field496) {
            for (int var34 = 0; var34 < 4; var34++) {
                method918();
                for (int var35 = 0; var35 < 13; var35++) {
                    for (int var36 = 0; var36 < 13; var36++) {
                        boolean var37 = false;
                        int var38 = field330[var34][var35][var36];
                        if (var38 != -1) {
                            int var39 = var38 >> 24 & 0x3;
                            int var40 = var38 >> 1 & 0x3;
                            int var41 = var38 >> 14 & 0x3FF;
                            int var42 = var38 >> 3 & 0x7FF;
                            int var43 = (var41 / 8 << 8) + var42 / 8;
                            for (int var44 = 0; var44 < Statics.field2176.length; var44++) {
                                if (Statics.field2176[var44] == var43 && Statics.field1843[var44] != null) {
                                    byte[] var45 = Statics.field1843[var44];
                                    int var46 = var35 * 8;
                                    int var47 = var36 * 8;
                                    int var48 = (var41 & 0x7) * 8;
                                    int var49 = (var42 & 0x7) * 8;
                                    class118[] var50 = field348;
                                    for (int var51 = 0; var51 < 8; var51++) {
                                        for (int var52 = 0; var52 < 8; var52++) {
                                            if (var46 + var51 > 0 && var46 + var51 < 103 && var47 + var52 > 0 && var47 + var52 < 103) {
                                                var50[var34].field1808[var46 + var51][var47 + var52] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class154 var53 = new class154(var45);
                                    for (int var54 = 0; var54 < 4; var54++) {
                                        for (int var55 = 0; var55 < 64; var55++) {
                                            for (int var56 = 0; var56 < 64; var56++) {
                                                if (var39 == var54 && var55 >= var48 && var55 < var48 + 8 && var56 >= var49 && var56 < var49 + 8) {
                                                    int var60 = var55 & 0x7;
                                                    int var61 = var56 & 0x7;
                                                    int var63 = var40 & 0x3;
                                                    int var64;
                                                    if (var63 == 0) {
                                                        var64 = var60;
                                                    } else if (var63 == 1) {
                                                        var64 = var61;
                                                    } else if (var63 == 2) {
                                                        var64 = 7 - var60;
                                                    } else {
                                                        var64 = 7 - var61;
                                                    }
                                                    class11.method886(var53, var34, var46 + var64, var47 + class169.method1484(var55 & 0x7, var56 & 0x7, var40), 0, 0, var40);
                                                } else {
                                                    class11.method886(var53, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var37 = true;
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            class11.method568(var34, var35 * 8, var36 * 8);
                        }
                    }
                }
            }
            for (int var65 = 0; var65 < 13; var65++) {
                for (int var66 = 0; var66 < 13; var66++) {
                    int var67 = field330[0][var65][var66];
                    if (var67 == -1) {
                        class11.method2947(var65 * 8, var66 * 8, 8, 8);
                    }
                }
            }
            method575(true);
            for (int var68 = 0; var68 < 4; var68++) {
                method918();
                for (int var69 = 0; var69 < 13; var69++) {
                    label340: for (int var70 = 0; var70 < 13; var70++) {
                        int var71 = field330[var68][var69][var70];
                        if (var71 != -1) {
                            int var72 = var71 >> 24 & 0x3;
                            int var73 = var71 >> 1 & 0x3;
                            int var74 = var71 >> 14 & 0x3FF;
                            int var75 = var71 >> 3 & 0x7FF;
                            int var76 = (var74 / 8 << 8) + var75 / 8;
                            for (int var77 = 0; var77 < Statics.field2176.length; var77++) {
                                if (Statics.field2176[var77] == var76 && Statics.field692[var77] != null) {
                                    byte[] var78 = Statics.field692[var77];
                                    int var79 = var69 * 8;
                                    int var80 = var70 * 8;
                                    int var81 = (var74 & 0x7) * 8;
                                    int var82 = (var75 & 0x7) * 8;
                                    class88 var83 = Statics.field2110;
                                    class118[] var84 = field348;
                                    class154 var85 = new class154(var78);
                                    int var86 = -1;
                                    while (true) {
                                        int var87 = var85.method2682();
                                        if (var87 == 0) {
                                            continue label340;
                                        }
                                        var86 += var87;
                                        int var88 = 0;
                                        while (true) {
                                            int var89 = var85.method2682();
                                            if (var89 == 0) {
                                                break;
                                            }
                                            var88 += var89 - 1;
                                            int var90 = var88 & 0x3F;
                                            int var91 = var88 >> 6 & 0x3F;
                                            int var92 = var88 >> 12;
                                            int var93 = var85.method2669();
                                            int var94 = var93 >> 2;
                                            int var95 = var93 & 0x3;
                                            if (var72 == var92 && var91 >= var81 && var91 < var81 + 8 && var90 >= var82 && var90 < var82 + 8) {
                                                class198 var96 = class198.method1865(var86);
                                                int var97 = var79 + class169.method2405(var91 & 0x7, var90 & 0x7, var73, var96.field2903, var96.field2918, var95);
                                                int var98 = var80 + class169.method761(var91 & 0x7, var90 & 0x7, var73, var96.field2903, var96.field2918, var95);
                                                if (var97 > 0 && var98 > 0 && var97 < 103 && var98 < 103) {
                                                    int var99 = var68;
                                                    if ((class11.field104[1][var97][var98] & 0x2) == 2) {
                                                        var99 = var68 - 1;
                                                    }
                                                    class118 var100 = null;
                                                    if (var99 >= 0) {
                                                        var100 = var84[var99];
                                                    }
                                                    class11.method268(var68, var97, var98, var86, var73 + var95 & 0x3, var94, var83, var100);
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
        method575(true);
        method576();
        method918();
        class11.method1138(Statics.field2110, field348);
        method575(true);
        int var101 = class11.field105;
        if (var101 > Statics.field967) {
            var101 = Statics.field967;
        }
        if (var101 < Statics.field967 - 1) {
            int var102 = Statics.field967 - 1;
        }
        if (field569) {
            Statics.field2110.method1648(class11.field105);
        } else {
            Statics.field2110.method1648(0);
        }
        for (int var103 = 0; var103 < 104; var103++) {
            for (int var104 = 0; var104 < 104; var104++) {
                method188(var103, var104);
            }
        }
        method918();
        for (class26 var105 = (class26) field302.method2315(); var105 != null; var105 = (class26) field302.method2332()) {
            if (var105.field572 == -1) {
                var105.field578 = 0;
                method105(var105);
            } else {
                var105.method2298();
            }
        }
        class198.field2905.method2249();
        if (Statics.field597 != null) {
            field417.method2920(189);
            field417.method2658(1057001181);
        }
        if (!field496) {
            int var106 = (Statics.field771 - 6) / 8;
            int var107 = (Statics.field771 + 6) / 8;
            int var108 = (Statics.field1088 - 6) / 8;
            int var109 = (Statics.field1088 + 6) / 8;
            for (int var110 = var106 - 1; var110 <= var107 + 1; var110++) {
                for (int var111 = var108 - 1; var111 <= var109 + 1; var111++) {
                    if (var110 < var106 || var110 > var107 || var111 < var108 || var111 > var109) {
                        Statics.field2150.method3166("m" + var110 + "_" + var111);
                        Statics.field2150.method3166("l" + var110 + "_" + var111);
                    }
                }
            }
        }
        method2950(30);
        method918();
        Statics.field109 = (byte[][][]) null;
        Statics.field2154 = (byte[][][]) null;
        Statics.field2024 = (byte[][][]) null;
        Statics.field1545 = (byte[][][]) null;
        Statics.field2160 = (int[][][]) null;
        Statics.field127 = (byte[][][]) null;
        Statics.field2102 = (int[][]) null;
        Statics.field754 = null;
        Statics.field757 = null;
        Statics.field107 = null;
        Statics.field103 = null;
        Statics.field108 = null;
        field417.method2920(122);
        class114.method1350();
    }

    @ObfuscatedName("fi.be(II)V")
    public static final void method3106(int arg0) {
        int[] var1 = Statics.field243.field3220;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class11.field104[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field2110.method1681(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class11.field104[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field2110.method1681(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field243.method3927();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class11.field104[arg0][var10][var9] & 0x18) == 0) {
                    Statics.method1923(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class11.field104[arg0 + 1][var10][var9] & 0x8) != 0) {
                    Statics.method1923(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field518 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field2110.method1676(Statics.field967, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class198.method1865(var14).field2930;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field348[Statics.field967].field1808;
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
                        field521[field518] = Statics.field32[var15];
                        field492[field518] = var16;
                        field520[field518] = var17;
                        field518++;
                    }
                }
            }
        }
        Statics.field2010.method3880();
    }

    @ObfuscatedName("as.bv(B)Z")
    public static final boolean method770() {
        if (Statics.field210 == null) {
            return false;
        }
        try {
            int var0 = Statics.field210.method2001();
            if (var0 == 0) {
                return false;
            }
            if (field419 == -1) {
                Statics.field210.method2000(field331.field2084, 0, 1);
                field331.field2079 = 0;
                field419 = field331.method2914();
                field332 = class213.field3151[field419];
                var0--;
            }
            if (field332 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field210.method2000(field331.field2084, 0, 1);
                field332 = field331.field2084[0] & 0xFF;
                var0--;
            }
            if (field332 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field210.method2000(field331.field2084, 0, 2);
                field331.field2079 = 0;
                field332 = field331.method2671();
                var0 -= 2;
            }
            if (var0 < field332) {
                return false;
            }
            field331.field2079 = 0;
            Statics.field210.method2000(field331.field2084, 0, field332);
            field334 = 0;
            field338 = field322;
            field322 = field336;
            field336 = field419;
            if (field419 == 239) {
                int var1 = field331.method2692();
                class170 var2 = Statics.method211(var1);
                for (int var3 = 0; var3 < var2.field2284.length; var3++) {
                    var2.field2284[var3] = -1;
                    var2.field2284[var3] = 0;
                }
                method1858(var2);
                field419 = -1;
                return true;
            }
            if (field419 == 160) {
                int var4 = field331.method2815();
                int var5 = field331.method2671();
                if (var4 < -70000) {
                    var5 += 32768;
                }
                class170 var6;
                if (var4 >= 0) {
                    var6 = Statics.method211(var4);
                } else {
                    var6 = null;
                }
                while (field331.field2079 < field332) {
                    int var7 = field331.method2682();
                    int var8 = field331.method2671();
                    int var9 = 0;
                    if (var8 != 0) {
                        var9 = field331.method2669();
                        if (var9 == 255) {
                            var9 = field331.method2815();
                        }
                    }
                    if (var6 != null && var7 >= 0 && var7 < var6.field2284.length) {
                        var6.field2284[var7] = var8;
                        var6.field2320[var7] = var9;
                    }
                    class13.method217(var5, var7, var8 - 1, var9);
                }
                if (var6 != null) {
                    method1858(var6);
                }
                method222();
                field409[++field522 - 1 & 0x1F] = var5 & 0x7FFF;
                field419 = -1;
                return true;
            }
            if (field419 == 255) {
                class46.method2606();
                for (int var10 = 0; var10 < 2048; var10++) {
                    field408[var10] = null;
                }
                class46.method204(field331);
                field419 = -1;
                return true;
            }
            if (field419 == 151) {
                field285 = field331.method2669();
                if (field285 == 1) {
                    field306 = field331.method2671();
                }
                if (field285 >= 2 && field285 <= 6) {
                    if (field285 == 2) {
                        field311 = 64;
                        field312 = 64;
                    }
                    if (field285 == 3) {
                        field311 = 0;
                        field312 = 64;
                    }
                    if (field285 == 4) {
                        field311 = 128;
                        field312 = 64;
                    }
                    if (field285 == 5) {
                        field311 = 64;
                        field312 = 0;
                    }
                    if (field285 == 6) {
                        field311 = 64;
                        field312 = 128;
                    }
                    field285 = 2;
                    field308 = field331.method2671();
                    field309 = field331.method2671();
                    field310 = field331.method2669();
                }
                if (field285 == 10) {
                    field503 = field331.method2671();
                }
                field419 = -1;
                return true;
            }
            if (field419 == 244) {
                method526(false);
                field419 = -1;
                return true;
            }
            if (field419 == 56) {
                field292 = field331.method2669();
                if (field292 == 255) {
                    field292 = 0;
                }
                field305 = field331.method2669();
                if (field305 == 255) {
                    field305 = 0;
                }
                field419 = -1;
                return true;
            }
            if (field419 == 174) {
                int var11 = field331.method2692();
                Statics.field2105 = Statics.field2640.method1906(var11);
                field419 = -1;
                return true;
            }
            if (field419 == 178) {
                field565 = true;
                Statics.field1630 = field331.method2669();
                Statics.field1620 = field331.method2669();
                Statics.field3079 = field331.method2671();
                Statics.field1113 = field331.method2669();
                Statics.field163 = field331.method2669();
                if (Statics.field163 >= 100) {
                    int var12 = Statics.field1630 * 128 + 64;
                    int var13 = Statics.field1620 * 128 + 64;
                    int var14 = method754(var12, var13, Statics.field967) - Statics.field3079;
                    int var15 = var12 - Statics.field2896;
                    int var16 = var14 - Statics.field277;
                    int var17 = var13 - Statics.field741;
                    int var18 = (int) Math.sqrt((double) (var15 * var15 + var17 * var17));
                    Statics.field110 = (int) (Math.atan2((double) var16, (double) var18) * 325.949D) & 0x7FF;
                    Statics.field2731 = (int) (Math.atan2((double) var15, (double) var17) * -325.949D) & 0x7FF;
                    if (Statics.field110 < 128) {
                        Statics.field110 = 128;
                    }
                    if (Statics.field110 > 383) {
                        Statics.field110 = 383;
                    }
                }
                field419 = -1;
                return true;
            }
            if (field419 == 16) {
                int var19 = field331.method2706();
                if (var19 == 65535) {
                    var19 = -1;
                }
                if (var19 == -1 && !field527) {
                    Statics.field1902.method2414();
                    class139.field1903 = 1;
                    Statics.field889 = null;
                } else if (var19 != -1 && field526 != var19 && field525 != 0 && !field527) {
                    class139.method2002(2, Statics.field931, var19, 0, field525, false);
                }
                field526 = var19;
                field419 = -1;
                return true;
            }
            if (field419 == 18) {
                int var20 = field331.method2706();
                if (var20 == 65535) {
                    var20 = -1;
                }
                int var21 = field331.method2711();
                if (field525 != 0 && var20 != -1) {
                    class139.method1859(Statics.field131, var20, 0, field525, false);
                    field527 = true;
                }
                field419 = -1;
                return true;
            }
            if (field419 == 55) {
                Statics.field30 = class217.method799(field331.method2669());
                field419 = -1;
                return true;
            }
            if (field419 == 107) {
                int var22 = field331.method2682();
                boolean var23 = field331.method2669() == 1;
                String var24 = "";
                boolean var25 = false;
                if (var23) {
                    var24 = field331.method2677();
                    if (method2208(var24)) {
                        var25 = true;
                    }
                }
                String var26 = field331.method2677();
                if (!var25) {
                    class48.method3031(var22, var24, var26);
                }
                field419 = -1;
                return true;
            }
            if (field419 == 150) {
                for (int var27 = 0; var27 < field408.length; var27++) {
                    if (field408[var27] != null) {
                        field408[var27].field633 = -1;
                    }
                }
                for (int var28 = 0; var28 < field324.length; var28++) {
                    if (field324[var28] != null) {
                        field324[var28].field633 = -1;
                    }
                }
                field419 = -1;
                return true;
            }
            if (field419 == 181) {
                int var29 = field331.method2717();
                int var30 = field331.method2706();
                int var31 = var30 >> 10 & 0x1F;
                int var32 = var30 >> 5 & 0x1F;
                int var33 = var30 & 0x1F;
                int var34 = (var33 << 3) + (var31 << 19) + (var32 << 11);
                class170 var35 = Statics.method211(var29);
                if (var35.field2226 != var34) {
                    var35.field2226 = var34;
                    method1858(var35);
                }
                field419 = -1;
                return true;
            }
            if (field419 == 237) {
                int var36 = field331.method2815();
                class170 var37 = Statics.method211(var36);
                var37.field2244 = 3;
                var37.field2332 = Statics.field685.field246.method3012();
                method1858(var37);
                field419 = -1;
                return true;
            }
            if (field419 == 204) {
                boolean var38 = field331.method2669() == 1;
                if (var38) {
                    Statics.field1560 = class156.method81() - field331.method2675();
                    Statics.field190 = new class2(field331, true);
                } else {
                    Statics.field190 = null;
                }
                field488 = field293;
                field419 = -1;
                return true;
            }
            if (field419 == 37) {
                int var39 = field331.method2671();
                int var40 = field331.method2669();
                int var41 = field331.method2671();
                if (field528 != 0 && var40 != 0 && field530 < 50) {
                    field536[field530] = var39;
                    field532[field530] = var40;
                    field533[field530] = var41;
                    field535[field530] = null;
                    field529[field530] = 0;
                    field530++;
                }
                field419 = -1;
                return true;
            }
            if (field419 == 183) {
                Statics.field28 = field331.method2808();
                Statics.field1 = field331.method2757();
                while (field331.field2079 < field332) {
                    field419 = field331.method2669();
                    method216();
                }
                field419 = -1;
                return true;
            }
            if (field419 == 42) {
                int var45 = field331.method2808();
                String var46 = field331.method2677();
                int var47 = field331.method2696();
                if (var47 >= 1 && var47 <= 8) {
                    if (var46.equalsIgnoreCase("null")) {
                        var46 = null;
                    }
                    field414[var47 - 1] = var46;
                    field415[var47 - 1] = var45 == 0;
                }
                field419 = -1;
                return true;
            }
            if (field419 == 226) {
                class160 var48 = field331;
                int var49 = field332;
                class227 var50 = new class227();
                var50.field3236 = var48.method2669();
                var50.field3242 = var48.method2815();
                var50.field3239 = new int[var50.field3236];
                var50.field3238 = new int[var50.field3236];
                var50.field3235 = new Field[var50.field3236];
                var50.field3240 = new int[var50.field3236];
                var50.field3241 = new Method[var50.field3236];
                var50.field3237 = new byte[var50.field3236][][];
                for (int var51 = 0; var51 < var50.field3236; var51++) {
                    try {
                        int var52 = var48.method2669();
                        if (var52 == 0 || var52 == 1 || var52 == 2) {
                            String var53 = var48.method2677();
                            String var54 = var48.method2677();
                            int var55 = 0;
                            if (var52 == 1) {
                                var55 = var48.method2815();
                            }
                            var50.field3239[var51] = var52;
                            var50.field3240[var51] = var55;
                            if (class228.method3320(var53).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var50.field3235[var51] = class228.method3320(var53).getDeclaredField(var54);
                        } else if (var52 == 3 || var52 == 4) {
                            String var56 = var48.method2677();
                            String var57 = var48.method2677();
                            int var58 = var48.method2669();
                            String[] var59 = new String[var58];
                            for (int var60 = 0; var60 < var58; var60++) {
                                var59[var60] = var48.method2677();
                            }
                            String var61 = var48.method2677();
                            byte[][] var62 = new byte[var58][];
                            if (var52 == 3) {
                                for (int var63 = 0; var63 < var58; var63++) {
                                    int var64 = var48.method2815();
                                    var62[var63] = new byte[var64];
                                    var48.method2680(var62[var63], 0, var64);
                                }
                            }
                            var50.field3239[var51] = var52;
                            Class[] var65 = new Class[var58];
                            for (int var66 = 0; var66 < var58; var66++) {
                                var65[var66] = class228.method3320(var59[var66]);
                            }
                            Class var67 = class228.method3320(var61);
                            if (class228.method3320(var56).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var68 = class228.method3320(var56).getDeclaredMethods();
                            Method[] var69 = var68;
                            for (int var70 = 0; var70 < var69.length; var70++) {
                                Method var71 = var69[var70];
                                if (var71.getName().equals(var57)) {
                                    Class[] var72 = var71.getParameterTypes();
                                    if (var65.length == var72.length) {
                                        boolean var73 = true;
                                        for (int var74 = 0; var74 < var65.length; var74++) {
                                            if (var65[var74] != var72[var74]) {
                                                var73 = false;
                                                break;
                                            }
                                        }
                                        if (var73 && var67 == var71.getReturnType()) {
                                            var50.field3241[var51] = var71;
                                        }
                                    }
                                }
                            }
                            var50.field3237[var51] = var62;
                        }
                    } catch (ClassNotFoundException var314) {
                        var50.field3238[var51] = -1;
                    } catch (SecurityException var315) {
                        var50.field3238[var51] = -2;
                    } catch (NullPointerException var316) {
                        var50.field3238[var51] = -3;
                    } catch (Exception var317) {
                        var50.field3238[var51] = -4;
                    } catch (Throwable var318) {
                        var50.field3238[var51] = -5;
                    }
                }
                class228.field3246.method2275(var50);
                field419 = -1;
                return true;
            }
            if (field419 == 122) {
                method222();
                field453 = field331.method2669();
                field485 = field293;
                field419 = -1;
                return true;
            }
            if (field419 == 238) {
                while (field331.field2079 < field332) {
                    int var80 = field331.method2669();
                    boolean var81 = (var80 & 0x1) == 1;
                    String var82 = field331.method2677();
                    String var83 = field331.method2677();
                    field331.method2677();
                    for (int var84 = 0; var84 < field329; var84++) {
                        class20 var85 = field423[var84];
                        if (var81) {
                            if (var83.equals(var85.field217)) {
                                var85.field217 = var82;
                                var85.field216 = var83;
                                var82 = null;
                                break;
                            }
                        } else if (var82.equals(var85.field217)) {
                            var85.field217 = var82;
                            var85.field216 = var83;
                            var82 = null;
                            break;
                        }
                    }
                    if (var82 != null && field329 < 400) {
                        class20 var86 = new class20();
                        field423[field329] = var86;
                        var86.field217 = var82;
                        var86.field216 = var83;
                        field329++;
                    }
                }
                field481 = field293;
                field419 = -1;
                return true;
            }
            if (field419 == 88) {
                field565 = false;
                for (int var87 = 0; var87 < 5; var87++) {
                    field537[var87] = false;
                }
                field419 = -1;
                return true;
            }
            if (field419 == 206) {
                String var88 = field331.method2677();
                long var89 = field331.method2675();
                long var91 = (long) field331.method2671();
                long var93 = (long) field331.method2689();
                class178 var95 = (class178) class149.method1841(class178.method762(), field331.method2669());
                long var96 = (var91 << 32) + var93;
                boolean var98 = false;
                for (int var99 = 0; var99 < 100; var99++) {
                    if (field509[var99] == var96) {
                        var98 = true;
                        break;
                    }
                }
                if (var95.field2665 && method2208(var88)) {
                    var98 = true;
                }
                if (!var98 && field407 == 0) {
                    field509[field510] = var96;
                    field510 = (field510 + 1) % 100;
                    String var100 = class210.method3706(class208.method809(class211.method3216(field331)));
                    if (var95.field2672 == -1) {
                        class48.method759(9, var88, var100, class206.method1983(var89));
                    } else {
                        class48.method759(9, class38.method267(var95.field2672) + var88, var100, class206.method1983(var89));
                    }
                }
                field419 = -1;
                return true;
            }
            if (field419 == 219) {
                for (int var101 = 0; var101 < class166.field2158.length; var101++) {
                    if (class166.field2158[var101] != class166.field2157[var101]) {
                        class166.field2158[var101] = class166.field2157[var101];
                        method1843(var101);
                        field474[++field475 - 1 & 0x1F] = var101;
                    }
                }
                field419 = -1;
                return true;
            }
            if (field419 == 103) {
                int var102 = field331.method2815();
                int var103 = field331.method2815();
                if (Statics.field73 == null || !Statics.field73.isValid()) {
                    try {
                        Iterator var104 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var104.hasNext()) {
                            GarbageCollectorMXBean var105 = (GarbageCollectorMXBean) var104.next();
                            if (var105.isValid()) {
                                Statics.field73 = var105;
                                field430 = -1L;
                                field480 = -1L;
                            }
                        }
                    } catch (Throwable var313) {
                    }
                }
                long var107 = class156.method81();
                int var109 = -1;
                if (Statics.field73 != null) {
                    long var110 = Statics.field73.getCollectionTime();
                    if (field480 != -1L) {
                        long var112 = var110 - field480;
                        long var114 = var107 - field430;
                        if (var114 != 0L) {
                            var109 = (int) (var112 * 100L / var114);
                        }
                    }
                    field480 = var110;
                    field430 = var107;
                }
                field417.method2920(126);
                field417.method2754(var102);
                field417.method2832(var103);
                field417.method2780(var109);
                field417.method2718(field1757);
                field419 = -1;
                return true;
            }
            if (field419 == 5) {
                int var116 = field331.method2708();
                int var117 = field331.method2717();
                int var118 = field331.method2723();
                class170 var119 = Statics.method211(var117);
                if (var119.field2315 != var118 || var119.field2211 != var116 || var119.field2206 != 0 || var119.field2207 != 0) {
                    var119.field2315 = var118;
                    var119.field2211 = var116;
                    var119.field2206 = 0;
                    var119.field2207 = 0;
                    method1858(var119);
                    Statics.method195(var119);
                    if (var119.field2203 == 0) {
                        method61(Statics.field2329[var117 >> 16], var119, false);
                    }
                }
                field419 = -1;
                return true;
            }
            if (field419 == 105) {
                field304 = field331.method2671() * 30;
                field485 = field293;
                field419 = -1;
                return true;
            }
            if (field419 == 159) {
                Statics.method2597(false);
                field331.method2914();
                int var120 = field331.method2671();
                class46.method232(field331, var120);
                field419 = -1;
                return true;
            }
            if (field419 == 41) {
                String var121 = field331.method2677();
                class160 var122 = field331;
                String var126;
                try {
                    int var123 = var122.method2682();
                    if (var123 > 32767) {
                        var123 = 32767;
                    }
                    byte[] var124 = new byte[var123];
                    var122.field2079 += Statics.field2185.method2591(var122.field2084, var122.field2079, var124, 0, var123);
                    String var125 = class204.method3105(var124, 0, var123);
                    var126 = var125;
                } catch (Exception var312) {
                    var126 = "Cabbage";
                }
                String var129 = class210.method3706(class208.method809(var126));
                class48.method3031(6, var121, var129);
                field419 = -1;
                return true;
            }
            if (field419 == 220) {
                int var130 = field331.method2716();
                int var131 = field331.method2671();
                int var132 = field331.method2706();
                class170 var133 = Statics.method211(var130);
                var133.field2257 = (var132 << 16) + var131;
                field419 = -1;
                return true;
            }
            if (field419 == 82) {
                for (int var134 = 0; var134 < Statics.field2780; var134++) {
                    class188 var135 = class188.method601(var134);
                    if (var135 != null) {
                        class166.field2157[var134] = 0;
                        class166.field2158[var134] = 0;
                    }
                }
                method222();
                field475 += 32;
                field419 = -1;
                return true;
            }
            if (field419 == 169) {
                field524 = field331.method2669();
                field419 = -1;
                return true;
            }
            if (field419 == 111) {
                field556 = 1;
                field481 = field293;
                field419 = -1;
                return true;
            }
            if (field419 == 217 || field419 == 144 || field419 == 60 || field419 == 66 || field419 == 50 || field419 == 90 || field419 == 11 || field419 == 134 || field419 == 225 || field419 == 216) {
                method216();
                field419 = -1;
                return true;
            }
            if (field419 == 234) {
                method222();
                field454 = field331.method2699();
                field485 = field293;
                field419 = -1;
                return true;
            }
            if (field419 == 28) {
                int var136 = field331.method2706();
                class13.method104(var136);
                field409[++field522 - 1 & 0x1F] = var136 & 0x7FFF;
                field419 = -1;
                return true;
            }
            if (field419 == 108) {
                method526(true);
                field419 = -1;
                return true;
            }
            if (field419 == 9) {
                field331.field2079 += 28;
                if (field331.method2725()) {
                    class105.method225(field331, field331.field2079 - 28);
                }
                field419 = -1;
                return true;
            }
            if (field419 == 218) {
                method222();
                int var137 = field331.method2808();
                int var138 = field331.method2808();
                int var139 = field331.method2717();
                field424[var137] = var139;
                field546[var137] = var138;
                field508[var137] = 1;
                for (int var140 = 0; var140 < 98; var140++) {
                    if (var139 >= class173.field2355[var140]) {
                        field508[var137] = var140 + 2;
                    }
                }
                field523[++field519 - 1 & 0x1F] = var137;
                field419 = -1;
                return true;
            }
            if (field419 == 10) {
                int var141 = field331.method2808();
                int var142 = field331.method2671();
                int var143 = field331.method2716();
                class18 var144 = (class18) field449.method2259((long) var143);
                if (var144 != null) {
                    method213(var144, var144.field195 != var142);
                }
                method1969(var143, var142, var141);
                field419 = -1;
                return true;
            }
            if (field419 == 147) {
                if (field448 != -1) {
                    method1868(field448, 0);
                }
                field419 = -1;
                return true;
            }
            if (field419 == 191) {
                while (field331.field2079 < field332) {
                    boolean var145 = field331.method2669() == 1;
                    String var146 = field331.method2677();
                    String var147 = field331.method2677();
                    int var148 = field331.method2671();
                    int var149 = field331.method2669();
                    int var150 = field331.method2669();
                    boolean var151 = (var150 & 0x2) != 0;
                    boolean var152 = (var150 & 0x1) != 0;
                    if (var148 > 0) {
                        field331.method2677();
                        field331.method2669();
                        field331.method2815();
                    }
                    field331.method2677();
                    for (int var153 = 0; var153 < field555; var153++) {
                        class15 var154 = field557[var153];
                        if (var145) {
                            if (var147.equals(var154.field170)) {
                                var154.field170 = var146;
                                var154.field161 = var147;
                                var146 = null;
                                break;
                            }
                        } else if (var146.equals(var154.field170)) {
                            if (var154.field167 != var148) {
                                boolean var155 = true;
                                for (class17 var156 = (class17) field558.method2346(); var156 != null; var156 = (class17) field558.method2349()) {
                                    if (var156.field186.equals(var146)) {
                                        if (var148 != 0 && var156.field181 == 0) {
                                            var156.method2358();
                                            var155 = false;
                                        } else if (var148 == 0 && var156.field181 != 0) {
                                            var156.method2358();
                                            var155 = false;
                                        }
                                    }
                                }
                                if (var155) {
                                    field558.method2347(new class17(var146, var148));
                                }
                                var154.field167 = var148;
                            }
                            var154.field161 = var147;
                            var154.field162 = var149;
                            var154.field164 = var151;
                            var154.field165 = var152;
                            var146 = null;
                            break;
                        }
                    }
                    if (var146 != null && field555 < 400) {
                        class15 var157 = new class15();
                        field557[field555] = var157;
                        var157.field170 = var146;
                        var157.field161 = var147;
                        var157.field167 = var148;
                        var157.field162 = var149;
                        var157.field164 = var151;
                        var157.field165 = var152;
                        field555++;
                    }
                }
                field556 = 2;
                field481 = field293;
                boolean var158 = false;
                int var159 = field555;
                while (var159 > 0) {
                    boolean var160 = true;
                    var159--;
                    for (int var161 = 0; var161 < var159; var161++) {
                        boolean var162 = false;
                        class15 var163 = field557[var161];
                        class15 var164 = field557[var161 + 1];
                        if (field287 != var163.field167 && field287 == var164.field167) {
                            var162 = true;
                        }
                        if (!var162 && var163.field167 == 0 && var164.field167 != 0) {
                            var162 = true;
                        }
                        if (!var162 && !var163.field164 && var164.field164) {
                            var162 = true;
                        }
                        if (!var162 && !var163.field165 && var164.field165) {
                            var162 = true;
                        }
                        if (var162) {
                            class15 var165 = field557[var161];
                            field557[var161] = field557[var161 + 1];
                            field557[var161 + 1] = var165;
                            var160 = false;
                        }
                    }
                    if (var160) {
                        break;
                    }
                }
                field419 = -1;
                return true;
            }
            if (field419 == 44) {
                int var166 = field331.method2717();
                int var167 = field331.method2707();
                class170 var168 = Statics.method211(var166);
                if (var168.field2248 != var167 || var167 == -1) {
                    var168.field2248 = var167;
                    var168.field2192 = 0;
                    var168.field2195 = 0;
                    method1858(var168);
                }
                field419 = -1;
                return true;
            }
            if (field419 == 125) {
                int var169 = field331.method2705();
                field448 = var169;
                method23(false);
                method212(var169);
                class33.method75(field448);
                for (int var170 = 0; var170 < 100; var170++) {
                    field493[var170] = true;
                }
                field419 = -1;
                return true;
            }
            if (field419 == 68) {
                field506 = field331.method2669();
                field473 = field331.method2669();
                field419 = -1;
                return true;
            }
            if (field419 == 247) {
                int var171 = field331.method2706();
                if (var171 == 65535) {
                    var171 = -1;
                }
                int var172 = field331.method2692();
                int var173 = field331.method2717();
                int var174 = field331.method2704();
                if (var174 == 65535) {
                    var174 = -1;
                }
                for (int var175 = var174; var175 <= var171; var175++) {
                    long var176 = ((long) var173 << 32) + (long) var175;
                    class128 var178 = field298.method2259(var176);
                    if (var178 != null) {
                        var178.method2298();
                    }
                    field298.method2267(new class134(var172), var176);
                }
                field419 = -1;
                return true;
            }
            if (field419 == 201) {
                Statics.method3271();
                field419 = -1;
                return false;
            }
            if (field419 == 165) {
                byte var179 = field331.method2700();
                int var180 = field331.method2705();
                class166.field2157[var180] = var179;
                if (class166.field2158[var180] != var179) {
                    class166.field2158[var180] = var179;
                }
                method1843(var180);
                field474[++field475 - 1 & 0x1F] = var180;
                field419 = -1;
                return true;
            }
            if (field419 == 15) {
                int var181 = field331.method2815();
                class18 var182 = (class18) field449.method2259((long) var181);
                if (var182 != null) {
                    method213(var182, true);
                }
                if (field452 != null) {
                    method1858(field452);
                    field452 = null;
                }
                field419 = -1;
                return true;
            }
            if (field419 == 132) {
                int var183 = field331.method2704();
                if (var183 == 65535) {
                    var183 = -1;
                }
                int var184 = field331.method2815();
                int var185 = field331.method2692();
                class170 var186 = Statics.method211(var185);
                if (var186.field2200) {
                    var186.field2202 = var183;
                    var186.field2322 = var184;
                    class199 var188 = class199.method751(var183);
                    var186.field2305 = var188.field2993;
                    var186.field2277 = var188.field2975;
                    var186.field2199 = var188.field3002;
                    var186.field2250 = var188.field2972;
                    var186.field2251 = var188.field2973;
                    var186.field2255 = var188.field2971;
                    if (var188.field2974 == 1) {
                        var186.field2288 = 1;
                    } else {
                        var186.field2288 = 2;
                    }
                    if (var186.field2256 > 0) {
                        var186.field2255 = var186.field2255 * 32 / var186.field2256;
                    } else if (var186.field2212 > 0) {
                        var186.field2255 = var186.field2255 * 32 / var186.field2212;
                    }
                    method1858(var186);
                } else if (var183 == -1) {
                    var186.field2244 = 0;
                    field419 = -1;
                    return true;
                } else {
                    class199 var187 = class199.method751(var183);
                    var186.field2244 = 4;
                    var186.field2332 = var183;
                    var186.field2305 = var187.field2993;
                    var186.field2277 = var187.field2975;
                    var186.field2255 = var187.field2971 * 100 / var184;
                    method1858(var186);
                }
                field419 = -1;
                return true;
            }
            if (field419 == 146) {
                int var189 = field331.method2815();
                int var190 = field331.method2671();
                if (var189 < -70000) {
                    var190 += 32768;
                }
                class170 var191;
                if (var189 >= 0) {
                    var191 = Statics.method211(var189);
                } else {
                    var191 = null;
                }
                if (var191 != null) {
                    for (int var192 = 0; var192 < var191.field2284.length; var192++) {
                        var191.field2284[var192] = 0;
                        var191.field2320[var192] = 0;
                    }
                }
                class13 var193 = (class13) class13.field137.method2259((long) var190);
                if (var193 != null) {
                    for (int var194 = 0; var194 < var193.field141.length; var194++) {
                        var193.field141[var194] = -1;
                        var193.field136[var194] = 0;
                    }
                }
                int var195 = field331.method2671();
                for (int var196 = 0; var196 < var195; var196++) {
                    int var197 = field331.method2706();
                    int var198 = field331.method2808();
                    if (var198 == 255) {
                        var198 = field331.method2815();
                    }
                    if (var191 != null && var196 < var191.field2284.length) {
                        var191.field2284[var196] = var197;
                        var191.field2320[var196] = var198;
                    }
                    class13.method217(var190, var196, var197 - 1, var198);
                }
                if (var191 != null) {
                    method1858(var191);
                }
                method222();
                field409[++field522 - 1 & 0x1F] = var190 & 0x7FFF;
                field419 = -1;
                return true;
            }
            if (field419 == 26) {
                String var199 = field331.method2677();
                long var200 = (long) field331.method2671();
                long var202 = (long) field331.method2689();
                class178 var204 = (class178) class149.method1841(class178.method762(), field331.method2669());
                long var205 = (var200 << 32) + var202;
                boolean var207 = false;
                for (int var208 = 0; var208 < 100; var208++) {
                    if (field509[var208] == var205) {
                        var207 = true;
                        break;
                    }
                }
                if (method2208(var199)) {
                    var207 = true;
                }
                if (!var207 && field407 == 0) {
                    field509[field510] = var205;
                    field510 = (field510 + 1) % 100;
                    String var209 = class210.method3706(class208.method809(class211.method3216(field331)));
                    byte var210;
                    if (var204.field2673) {
                        var210 = 7;
                    } else {
                        var210 = 3;
                    }
                    if (var204.field2672 == -1) {
                        class48.method3031(var210, var199, var209);
                    } else {
                        class48.method3031(var210, class38.method267(var204.field2672) + var199, var209);
                    }
                }
                field419 = -1;
                return true;
            }
            if (field419 == 176) {
                int var211 = field332 + field331.field2079;
                int var212 = field331.method2671();
                int var213 = field331.method2671();
                if (field448 != var212) {
                    field448 = var212;
                    method23(false);
                    method212(field448);
                    class33.method75(field448);
                    for (int var214 = 0; var214 < 100; var214++) {
                        field493[var214] = true;
                    }
                }
                while (var213-- > 0) {
                    int var215 = field331.method2815();
                    int var216 = field331.method2671();
                    int var217 = field331.method2669();
                    class18 var218 = (class18) field449.method2259((long) var215);
                    if (var218 != null && var218.field195 != var216) {
                        method213(var218, true);
                        var218 = null;
                    }
                    if (var218 == null) {
                        var218 = method1969(var215, var216, var217);
                    }
                    var218.field193 = true;
                }
                for (class18 var219 = (class18) field449.method2262(); var219 != null; var219 = (class18) field449.method2260()) {
                    if (var219.field193) {
                        var219.field193 = false;
                    } else {
                        method213(var219, true);
                    }
                }
                field298 = new class126(512);
                while (field331.field2079 < var211) {
                    int var220 = field331.method2815();
                    int var221 = field331.method2671();
                    int var222 = field331.method2671();
                    int var223 = field331.method2815();
                    for (int var224 = var221; var224 <= var222; var224++) {
                        long var225 = ((long) var220 << 32) + (long) var224;
                        field298.method2267(new class134(var223), var225);
                    }
                }
                field419 = -1;
                return true;
            }
            if (field419 == 230) {
                int var227 = field331.method2717();
                int var228 = field331.method2716();
                class18 var229 = (class18) field449.method2259((long) var227);
                class18 var230 = (class18) field449.method2259((long) var228);
                if (var230 != null) {
                    method213(var230, var229 == null || var229.field195 != var230.field195);
                }
                if (var229 != null) {
                    var229.method2298();
                    field449.method2267(var229, (long) var228);
                }
                class170 var231 = Statics.method211(var227);
                if (var231 != null) {
                    method1858(var231);
                }
                class170 var232 = Statics.method211(var228);
                if (var232 != null) {
                    method1858(var232);
                    method61(Statics.field2329[var232.field2201 >>> 16], var232, true);
                }
                if (field448 != -1) {
                    method1868(field448, 1);
                }
                field419 = -1;
                return true;
            }
            if (field419 == 224) {
                int var233 = field331.method2669();
                if (field331.method2669() == 0) {
                    field564[var233] = new class5();
                    field331.field2079 += 18;
                } else {
                    field331.field2079--;
                    field564[var233] = new class5(field331, false);
                }
                field442 = field293;
                field419 = -1;
                return true;
            }
            if (field419 == 19) {
                Statics.field28 = field331.method2757();
                Statics.field1 = field331.method2696();
                for (int var234 = Statics.field28; var234 < Statics.field28 + 8; var234++) {
                    for (int var235 = Statics.field1; var235 < Statics.field1 + 8; var235++) {
                        if (field418[Statics.field967][var234][var235] != null) {
                            field418[Statics.field967][var234][var235] = null;
                            method188(var234, var235);
                        }
                    }
                }
                for (class26 var236 = (class26) field302.method2315(); var236 != null; var236 = (class26) field302.method2332()) {
                    if (var236.field574 >= Statics.field28 && var236.field574 < Statics.field28 + 8 && var236.field575 >= Statics.field1 && var236.field575 < Statics.field1 + 8 && Statics.field967 == var236.field585) {
                        var236.field572 = 0;
                    }
                }
                field419 = -1;
                return true;
            }
            if (field419 == 72) {
                int var237 = field331.method2815();
                int var238 = field331.method2704();
                class166.field2157[var238] = var237;
                if (class166.field2158[var238] != var237) {
                    class166.field2158[var238] = var237;
                }
                method1843(var238);
                field474[++field475 - 1 & 0x1F] = var238;
                field419 = -1;
                return true;
            }
            if (field419 == 173) {
                Statics.method2597(true);
                field331.method2914();
                int var239 = field331.method2671();
                class46.method232(field331, var239);
                field419 = -1;
                return true;
            }
            if (field419 == 8) {
                String var240 = field331.method2677();
                int var241 = field331.method2671();
                byte var242 = field331.method2670();
                boolean var243 = false;
                if (var242 == -128) {
                    var243 = true;
                }
                if (var243) {
                    if (Statics.field883 == 0) {
                        field419 = -1;
                        return true;
                    }
                    boolean var244 = false;
                    int var245;
                    for (var245 = 0; var245 < Statics.field883 && (!Statics.field900[var245].field278.equals(var240) || Statics.field900[var245].field273 != var241); var245++) {
                    }
                    if (var245 < Statics.field883) {
                        while (var245 < Statics.field883 - 1) {
                            Statics.field900[var245] = Statics.field900[var245 + 1];
                            var245++;
                        }
                        Statics.field883--;
                        Statics.field900[Statics.field883] = null;
                    }
                } else {
                    field331.method2677();
                    class25 var246 = new class25();
                    var246.field278 = var240;
                    var246.field274 = class205.method168(var246.field278, Statics.field2108);
                    var246.field273 = var241;
                    var246.field276 = var242;
                    int var247;
                    for (var247 = Statics.field883 - 1; var247 >= 0; var247--) {
                        int var248 = Statics.field900[var247].field274.compareTo(var246.field274);
                        if (var248 == 0) {
                            Statics.field900[var247].field273 = var241;
                            Statics.field900[var247].field276 = var242;
                            if (var240.equals(Statics.field685.field267)) {
                                Statics.field758 = var242;
                            }
                            field563 = field293;
                            field419 = -1;
                            return true;
                        }
                        if (var248 < 0) {
                            break;
                        }
                    }
                    if (Statics.field883 >= Statics.field900.length) {
                        field419 = -1;
                        return true;
                    }
                    for (int var249 = Statics.field883 - 1; var249 > var247; var249--) {
                        Statics.field900[var249 + 1] = Statics.field900[var249];
                    }
                    if (Statics.field883 == 0) {
                        Statics.field900 = new class25[100];
                    }
                    Statics.field900[var247 + 1] = var246;
                    Statics.field883++;
                    if (var240.equals(Statics.field685.field267)) {
                        Statics.field758 = var242;
                    }
                }
                field563 = field293;
                field419 = -1;
                return true;
            }
            if (field419 == 4) {
                int var250 = field331.method2671();
                int var251 = field331.method2717();
                class170 var252 = Statics.method211(var251);
                if (var252.field2244 != 1 || var252.field2332 != var250) {
                    var252.field2244 = 1;
                    var252.field2332 = var250;
                    method1858(var252);
                }
                field419 = -1;
                return true;
            }
            if (field419 == 63) {
                String var253 = field331.method2677();
                Statics.field182 = var253;
                try {
                    String var254 = Statics.field297.getParameter(class215.field3174.field3162);
                    String var255 = Statics.field297.getParameter(class215.field3172.field3162);
                    String var256 = var254 + "settings=" + var253 + "; version=1; path=/; domain=" + var255;
                    String var257;
                    if (var253.length() == 0) {
                        var257 = var256 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        String var258 = var256 + "; Expires=";
                        long var259 = class156.method81() + 94608000000L;
                        class163.field2139.setTime(new Date(var259));
                        int var261 = class163.field2139.get(7);
                        int var262 = class163.field2139.get(5);
                        int var263 = class163.field2139.get(2);
                        int var264 = class163.field2139.get(1);
                        int var265 = class163.field2139.get(11);
                        int var266 = class163.field2139.get(12);
                        int var267 = class163.field2139.get(13);
                        String var268 = class163.field2138[var261 - 1] + ", " + var262 / 10 + var262 % 10 + "-" + class163.field2145[0][var263] + "-" + var264 + " " + var265 / 10 + var265 % 10 + ":" + var266 / 10 + var266 % 10 + ":" + var267 / 10 + var267 % 10 + " GMT";
                        var257 = var258 + var268 + "; Max-Age=" + 94608000L;
                    }
                    class101.method1884(Statics.field297, "document.cookie=\"" + var257 + "\"");
                } catch (Throwable var311) {
                }
                field419 = -1;
                return true;
            }
            if (field419 == 186) {
                int var270 = field331.method2717();
                boolean var271 = field331.method2696() == 1;
                class170 var272 = Statics.method211(var270);
                if (var272.field2221 != var271) {
                    var272.field2221 = var271;
                    method1858(var272);
                }
                field419 = -1;
                return true;
            }
            if (field419 == 23) {
                Statics.field1 = field331.method2669();
                Statics.field28 = field331.method2696();
                field419 = -1;
                return true;
            }
            if (field419 == 69) {
                field565 = true;
                Statics.field2685 = field331.method2669();
                Statics.field88 = field331.method2669();
                Statics.field2822 = field331.method2671();
                Statics.field787 = field331.method2669();
                Statics.field191 = field331.method2669();
                if (Statics.field191 >= 100) {
                    Statics.field2896 = Statics.field2685 * 128 + 64;
                    Statics.field741 = Statics.field88 * 128 + 64;
                    Statics.field277 = method754(Statics.field2896, Statics.field741, Statics.field967) - Statics.field2822;
                }
                field419 = -1;
                return true;
            }
            if (field419 == 188) {
                String var273 = field331.method2677();
                int var274 = field331.method2716();
                class170 var275 = Statics.method211(var274);
                if (!var273.equals(var275.field2261)) {
                    var275.field2261 = var273;
                    method1858(var275);
                }
                field419 = -1;
                return true;
            }
            if (field419 == 155) {
                class30 var276 = new class30();
                var276.field679 = field331.method2677();
                var276.field676 = field331.method2671();
                int var277 = field331.method2815();
                var276.field677 = var277;
                method2950(45);
                Statics.field210.method2006();
                Statics.field210 = null;
                class42.method33(var276);
                field419 = -1;
                return false;
            }
            if (field419 == 242) {
                int var278 = field331.method2669();
                int var279 = field331.method2669();
                int var280 = field331.method2669();
                int var281 = field331.method2669();
                field537[var278] = true;
                field538[var278] = var279;
                field539[var278] = var280;
                field540[var278] = var281;
                field541[var278] = 0;
                field419 = -1;
                return true;
            }
            if (field419 == 198) {
                field563 = field293;
                if (field332 == 0) {
                    field515 = null;
                    field516 = null;
                    Statics.field883 = 0;
                    Statics.field900 = null;
                    field419 = -1;
                    return true;
                }
                field516 = field331.method2677();
                long var282 = field331.method2675();
                field515 = class206.method2207(var282);
                Statics.field1119 = field331.method2670();
                int var284 = field331.method2669();
                if (var284 == 255) {
                    field419 = -1;
                    return true;
                }
                Statics.field883 = var284;
                class25[] var285 = new class25[100];
                for (int var286 = 0; var286 < Statics.field883; var286++) {
                    var285[var286] = new class25();
                    var285[var286].field278 = field331.method2677();
                    var285[var286].field274 = class205.method168(var285[var286].field278, Statics.field2108);
                    var285[var286].field273 = field331.method2671();
                    var285[var286].field276 = field331.method2670();
                    field331.method2677();
                    if (var285[var286].field278.equals(Statics.field685.field267)) {
                        Statics.field758 = var285[var286].field276;
                    }
                }
                boolean var287 = false;
                int var288 = Statics.field883;
                while (var288 > 0) {
                    boolean var289 = true;
                    var288--;
                    for (int var290 = 0; var290 < var288; var290++) {
                        if (var285[var290].field274.compareTo(var285[var290 + 1].field274) > 0) {
                            class25 var291 = var285[var290];
                            var285[var290] = var285[var290 + 1];
                            var285[var290 + 1] = var291;
                            var289 = false;
                        }
                    }
                    if (var289) {
                        break;
                    }
                }
                Statics.field900 = var285;
                field419 = -1;
                return true;
            }
            if (field419 == 194) {
                int var292 = field331.method2692();
                int var293 = field331.method2671();
                class170 var294 = Statics.method211(var292);
                if (var294 != null && var294.field2203 == 0) {
                    if (var293 > var294.field2225 - var294.field2217) {
                        var293 = var294.field2225 - var294.field2217;
                    }
                    if (var293 < 0) {
                        var293 = 0;
                    }
                    if (var294.field2223 != var293) {
                        var294.field2223 = var293;
                        method1858(var294);
                    }
                }
                field419 = -1;
                return true;
            }
            if (field419 == 127) {
                int var295 = field331.method2704();
                int var296 = field331.method2692();
                class170 var297 = Statics.method211(var296);
                if (var297.field2244 != 2 || var297.field2332 != var295) {
                    var297.field2244 = 2;
                    var297.field2332 = var295;
                    method1858(var297);
                }
                field419 = -1;
                return true;
            }
            if (field419 == 164) {
                int var298 = field331.method2716();
                int var299 = field331.method2706();
                int var300 = field331.method2706();
                int var301 = field331.method2671();
                class170 var302 = Statics.method211(var298);
                if (var302.field2305 != var301 || var302.field2277 != var300 || var302.field2255 != var299) {
                    var302.field2305 = var301;
                    var302.field2277 = var300;
                    var302.field2255 = var299;
                    method1858(var302);
                }
                field419 = -1;
                return true;
            }
            if (field419 == 131) {
                class46.method232(field331, field332);
                field419 = -1;
                return true;
            }
            if (field419 == 24) {
                String var303 = field331.method2677();
                Object[] var304 = new Object[var303.length() + 1];
                for (int var305 = var303.length() - 1; var305 >= 0; var305--) {
                    if (var303.charAt(var305) == 's') {
                        var304[var305 + 1] = field331.method2677();
                    } else {
                        var304[var305 + 1] = Integer.valueOf(field331.method2815());
                    }
                }
                var304[0] = Integer.valueOf(field331.method2815());
                class19 var306 = new class19();
                var306.field203 = var304;
                class33.method2511(var306);
                field419 = -1;
                return true;
            }
            class102.method24("" + field419 + class38.field781 + field322 + class38.field781 + field338 + class38.field781 + field332, (Throwable) null);
            Statics.method3271();
        } catch (IOException var319) {
            method3631();
        } catch (Exception var320) {
            String var309 = "" + field419 + class38.field781 + field322 + class38.field781 + field338 + class38.field781 + field332 + class38.field781 + (Statics.field19 + Statics.field685.field656[0]) + class38.field781 + (Statics.field341 + Statics.field685.field657[0]) + class38.field781;
            for (int var310 = 0; var310 < field332 && var310 < 50; var310++) {
                var309 = var309 + field331.field2084[var310] + class38.field781;
            }
            class102.method24(var309, var320);
            Statics.method3271();
        }
        return true;
    }

    @ObfuscatedName("n.bc(I)V")
    public static final void method216() {
        if (field419 == 50) {
            int var0 = field331.method2669();
            int var1 = (var0 >> 4 & 0x7) + Statics.field28;
            int var2 = (var0 & 0x7) + Statics.field1;
            int var3 = var1 + field331.method2670();
            int var4 = var2 + field331.method2670();
            int var5 = field331.method2699();
            int var6 = field331.method2671();
            int var7 = field331.method2669() * 4;
            int var8 = field331.method2669() * 4;
            int var9 = field331.method2671();
            int var10 = field331.method2671();
            int var11 = field331.method2669();
            int var12 = field331.method2669();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104 && var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104 && var6 != 65535) {
                int var13 = var1 * 128 + 64;
                int var14 = var2 * 128 + 64;
                int var15 = var3 * 128 + 64;
                int var16 = var4 * 128 + 64;
                class43 var17 = new class43(var6, Statics.field967, var13, var14, method754(var13, var14, Statics.field967) - var7, field489 + var9, field489 + var10, var11, var12, var5, var8);
                var17.method807(var15, var16, method754(var15, var16, Statics.field967) - var8, field489 + var9);
                field420.method2308(var17);
            }
        } else if (field419 == 134) {
            int var18 = field331.method2705();
            int var19 = field331.method2757();
            int var20 = var19 >> 2;
            int var21 = var19 & 0x3;
            int var22 = field351[var20];
            int var23 = field331.method2696();
            int var24 = (var23 >> 4 & 0x7) + Statics.field28;
            int var25 = (var23 & 0x7) + Statics.field1;
            if (var24 >= 0 && var25 >= 0 && var24 < 103 && var25 < 103) {
                if (var22 == 0) {
                    class91 var26 = Statics.field2110.method1660(Statics.field967, var24, var25);
                    if (var26 != null) {
                        int var27 = var26.field1556 >> 14 & 0x7FFF;
                        if (var20 == 2) {
                            var26.field1551 = new class50(var27, 2, var21 + 4, Statics.field967, var24, var25, var18, false, var26.field1551);
                            var26.field1552 = new class50(var27, 2, var21 + 1 & 0x3, Statics.field967, var24, var25, var18, false, var26.field1552);
                        } else {
                            var26.field1551 = new class50(var27, var20, var21, Statics.field967, var24, var25, var18, false, var26.field1551);
                        }
                    }
                }
                if (var22 == 1) {
                    class96 var28 = Statics.field2110.method1823(Statics.field967, var24, var25);
                    if (var28 != null) {
                        int var29 = var28.field1594 >> 14 & 0x7FFF;
                        if (var20 == 4 || var20 == 5) {
                            var28.field1601 = new class50(var29, 4, var21, Statics.field967, var24, var25, var18, false, var28.field1601);
                        } else if (var20 == 6) {
                            var28.field1601 = new class50(var29, 4, var21 + 4, Statics.field967, var24, var25, var18, false, var28.field1601);
                        } else if (var20 == 7) {
                            var28.field1601 = new class50(var29, 4, (var21 + 2 & 0x3) + 4, Statics.field967, var24, var25, var18, false, var28.field1601);
                        } else if (var20 == 8) {
                            var28.field1601 = new class50(var29, 4, var21 + 4, Statics.field967, var24, var25, var18, false, var28.field1601);
                            var28.field1602 = new class50(var29, 4, (var21 + 2 & 0x3) + 4, Statics.field967, var24, var25, var18, false, var28.field1602);
                        }
                    }
                }
                if (var22 == 2) {
                    class97 var30 = Statics.field2110.method1671(Statics.field967, var24, var25);
                    if (var20 == 11) {
                        var20 = 10;
                    }
                    if (var30 != null) {
                        var30.field1610 = new class50(var30.field1618 >> 14 & 0x7FFF, var20, var21, Statics.field967, var24, var25, var18, false, var30.field1610);
                    }
                }
                if (var22 == 3) {
                    class79 var31 = Statics.field2110.method1672(Statics.field967, var24, var25);
                    if (var31 != null) {
                        var31.field1299 = new class50(var31.field1302 >> 14 & 0x7FFF, 22, var21, Statics.field967, var24, var25, var18, false, var31.field1299);
                    }
                }
            }
        } else if (field419 == 11) {
            int var32 = field331.method2706();
            int var33 = field331.method2704();
            int var34 = field331.method2808();
            int var35 = (var34 >> 4 & 0x7) + Statics.field28;
            int var36 = (var34 & 0x7) + Statics.field1;
            if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
                class44 var37 = new class44();
                var37.field892 = var33;
                var37.field888 = var32;
                if (field418[Statics.field967][var35][var36] == null) {
                    field418[Statics.field967][var35][var36] = new class129();
                }
                field418[Statics.field967][var35][var36].method2308(var37);
                method188(var35, var36);
            }
        } else if (field419 == 90) {
            int var38 = field331.method2757();
            int var39 = (var38 >> 4 & 0x7) + Statics.field28;
            int var40 = (var38 & 0x7) + Statics.field1;
            int var41 = field331.method2706();
            if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                class129 var42 = field418[Statics.field967][var39][var40];
                if (var42 != null) {
                    for (class44 var43 = (class44) var42.method2315(); var43 != null; var43 = (class44) var42.method2332()) {
                        if ((var41 & 0x7FFF) == var43.field892) {
                            var43.method2298();
                            break;
                        }
                    }
                    if (var42.method2315() == null) {
                        field418[Statics.field967][var39][var40] = null;
                    }
                    method188(var39, var40);
                }
            }
        } else if (field419 == 144) {
            int var44 = field331.method2669();
            int var45 = (var44 >> 4 & 0x7) + Statics.field28;
            int var46 = (var44 & 0x7) + Statics.field1;
            int var47 = field331.method2671();
            int var48 = field331.method2671();
            int var49 = field331.method2671();
            if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                class129 var50 = field418[Statics.field967][var45][var46];
                if (var50 != null) {
                    for (class44 var51 = (class44) var50.method2315(); var51 != null; var51 = (class44) var50.method2332()) {
                        if ((var47 & 0x7FFF) == var51.field892 && var51.field888 == var48) {
                            var51.field888 = var49;
                            break;
                        }
                    }
                    method188(var45, var46);
                }
            }
        } else if (field419 == 225) {
            int var52 = field331.method2757();
            int var53 = var52 >> 2;
            int var54 = var52 & 0x3;
            int var55 = field351[var53];
            int var56 = field331.method2696();
            int var57 = (var56 >> 4 & 0x7) + Statics.field28;
            int var58 = (var56 & 0x7) + Statics.field1;
            if (var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104) {
                method574(Statics.field967, var57, var58, var55, -1, var53, var54, 0, -1);
            }
        } else {
            if (field419 == 217) {
                int var59 = field331.method2669();
                int var60 = (var59 >> 4 & 0x7) + Statics.field28;
                int var61 = (var59 & 0x7) + Statics.field1;
                int var62 = field331.method2671();
                int var63 = field331.method2669();
                int var64 = var63 >> 4 & 0xF;
                int var65 = var63 & 0x7;
                int var66 = field331.method2669();
                if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                    int var67 = var64 + 1;
                    if (Statics.field685.field656[0] >= var60 - var67 && Statics.field685.field656[0] <= var60 + var67 && Statics.field685.field657[0] >= var61 - var67 && Statics.field685.field657[0] <= var61 + var67 && field393 != 0 && var65 > 0 && field530 < 50) {
                        field536[field530] = var62;
                        field532[field530] = var65;
                        field533[field530] = var66;
                        field535[field530] = null;
                        field529[field530] = (var60 << 16) + (var61 << 8) + var64;
                        field530++;
                    }
                }
            }
            if (field419 == 66) {
                int var68 = field331.method2669();
                int var69 = (var68 >> 4 & 0x7) + Statics.field28;
                int var70 = (var68 & 0x7) + Statics.field1;
                int var71 = field331.method2671();
                int var72 = field331.method2669();
                int var73 = field331.method2671();
                if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
                    int var74 = var69 * 128 + 64;
                    int var75 = var70 * 128 + 64;
                    class34 var76 = new class34(var71, Statics.field967, var74, var75, method754(var74, var75, Statics.field967) - var72, var73, field489);
                    field421.method2308(var76);
                }
            } else {
                if (field419 == 60) {
                    int var77 = field331.method2808();
                    int var78 = (var77 >> 4 & 0x7) + Statics.field28;
                    int var79 = (var77 & 0x7) + Statics.field1;
                    byte var80 = field331.method2871();
                    byte var81 = field331.method2670();
                    int var82 = field331.method2808();
                    int var83 = var82 >> 2;
                    int var84 = var82 & 0x3;
                    int var85 = field351[var83];
                    byte var86 = field331.method2700();
                    int var87 = field331.method2704();
                    int var88 = field331.method2706();
                    byte var89 = field331.method2670();
                    int var90 = field331.method2706();
                    int var91 = field331.method2706();
                    class24 var92;
                    if (field431 == var90) {
                        var92 = Statics.field685;
                    } else {
                        var92 = field408[var90];
                    }
                    if (var92 != null) {
                        class198 var93 = class198.method1865(var91);
                        int var94;
                        int var95;
                        if (var84 == 1 || var84 == 3) {
                            var94 = var93.field2918;
                            var95 = var93.field2903;
                        } else {
                            var94 = var93.field2903;
                            var95 = var93.field2918;
                        }
                        int var96 = (var94 >> 1) + var78;
                        int var97 = (var94 + 1 >> 1) + var78;
                        int var98 = (var95 >> 1) + var79;
                        int var99 = (var95 + 1 >> 1) + var79;
                        int[][] var100 = class11.field121[Statics.field967];
                        int var101 = var100[var96][var98] + var100[var97][var98] + var100[var96][var99] + var100[var97][var99] >> 2;
                        int var102 = (var78 << 7) + (var94 << 6);
                        int var103 = (var79 << 7) + (var95 << 6);
                        class83 var104 = var93.method3465(var83, var84, var100, var102, var101, var103);
                        if (var104 != null) {
                            method574(Statics.field967, var78, var79, var85, -1, 0, 0, var88 + 1, var87 + 1);
                            var92.field269 = field489 + var88;
                            var92.field247 = field489 + var87;
                            var92.field259 = var104;
                            var92.field258 = var78 * 128 + var94 * 64;
                            var92.field251 = var79 * 128 + var95 * 64;
                            var92.field257 = var101;
                            if (var89 > var80) {
                                byte var105 = var89;
                                var89 = var80;
                                var80 = var105;
                            }
                            if (var86 > var81) {
                                byte var106 = var86;
                                var86 = var81;
                                var81 = var106;
                            }
                            var92.field260 = var78 + var89;
                            var92.field264 = var78 + var80;
                            var92.field261 = var79 + var86;
                            var92.field263 = var79 + var81;
                        }
                    }
                }
                if (field419 == 216) {
                    int var107 = field331.method2808();
                    int var108 = (var107 >> 4 & 0x7) + Statics.field28;
                    int var109 = (var107 & 0x7) + Statics.field1;
                    int var110 = field331.method2808();
                    int var111 = var110 >> 2;
                    int var112 = var110 & 0x3;
                    int var113 = field351[var111];
                    int var114 = field331.method2671();
                    if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                        method574(Statics.field967, var108, var109, var113, var114, var111, var112, 0, -1);
                    }
                }
            }
        }
    }

    @ObfuscatedName("p.bh(IIIIIIIIII)V")
    public static final void method574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class26 var9 = null;
        for (class26 var10 = (class26) field302.method2315(); var10 != null; var10 = (class26) field302.method2332()) {
            if (var10.field585 == arg0 && var10.field574 == arg1 && var10.field575 == arg2 && var10.field583 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class26();
            var9.field585 = arg0;
            var9.field583 = arg3;
            var9.field574 = arg1;
            var9.field575 = arg2;
            method105(var9);
            field302.method2308(var9);
        }
        var9.field579 = arg4;
        var9.field581 = arg5;
        var9.field580 = arg6;
        var9.field578 = arg7;
        var9.field572 = arg8;
    }

    @ObfuscatedName("t.bg(Lp;I)V")
    public static final void method105(class26 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field583 == 0) {
            var1 = Statics.field2110.method1670(arg0.field585, arg0.field574, arg0.field575);
        }
        if (arg0.field583 == 1) {
            var1 = Statics.field2110.method1674(arg0.field585, arg0.field574, arg0.field575);
        }
        if (arg0.field583 == 2) {
            var1 = Statics.field2110.method1675(arg0.field585, arg0.field574, arg0.field575);
        }
        if (arg0.field583 == 3) {
            var1 = Statics.field2110.method1676(arg0.field585, arg0.field574, arg0.field575);
        }
        if (var1 != 0) {
            int var5 = Statics.field2110.method1729(arg0.field585, arg0.field574, arg0.field575, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field573 = var2;
        arg0.field582 = var3;
        arg0.field576 = var4;
    }

    @ObfuscatedName("f.bi(IIIIIIII)V")
    public static final void method169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field569 && Statics.field967 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2110.method1670(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2110.method1674(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2110.method1675(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2110.method1676(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2110.method1729(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2110.method1762(arg0, arg2, arg3);
                class198 var15 = class198.method1865(var12);
                if (var15.field2919 != 0) {
                    field348[arg0].method2165(arg2, arg3, var13, var14, var15.field2920);
                }
            }
            if (arg1 == 1) {
                Statics.field2110.method1665(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2110.method1666(arg0, arg2, arg3);
                class198 var16 = class198.method1865(var12);
                if (var16.field2903 + arg2 > 103 || var16.field2903 + arg3 > 103 || var16.field2918 + arg2 > 103 || var16.field2918 + arg3 > 103) {
                    return;
                }
                if (var16.field2919 != 0) {
                    field348[arg0].method2159(arg2, arg3, var16.field2903, var16.field2918, var14, var16.field2920);
                }
            }
            if (arg1 == 3) {
                Statics.field2110.method1817(arg0, arg2, arg3);
                class198 var17 = class198.method1865(var12);
                if (var17.field2919 == 1) {
                    field348[arg0].method2168(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class11.field104[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class88 var19 = Statics.field2110;
        class118 var20 = field348[arg0];
        class198 var21 = class198.method1865(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field2918;
            var23 = var21.field2903;
        } else {
            var22 = var21.field2903;
            var23 = var21.field2918;
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
        int[][] var28 = class11.field121[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field2928 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field2932 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class90 var34;
            if (var21.field2925 == -1 && var21.field2943 == null) {
                var34 = var21.method3465(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class50(arg4, 22, arg5, var18, arg2, arg3, var21.field2925, true, (class90) null);
            }
            var19.method1653(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field2919 == 1) {
                var20.method2163(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class90 var57;
            if (var21.field2925 == -1 && var21.field2943 == null) {
                var57 = var21.method3465(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class50(arg4, 10, arg5, var18, arg2, arg3, var21.field2925, true, (class90) null);
            }
            if (var57 != null) {
                var19.method1657(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field2919 != 0) {
                var20.method2161(arg2, arg3, var22, var23, var21.field2920);
            }
        } else if (arg6 >= 12) {
            class90 var35;
            if (var21.field2925 == -1 && var21.field2943 == null) {
                var35 = var21.method3465(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class50(arg4, arg6, arg5, var18, arg2, arg3, var21.field2925, true, (class90) null);
            }
            var19.method1657(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field2919 != 0) {
                var20.method2161(arg2, arg3, var22, var23, var21.field2920);
            }
        } else if (arg6 == 0) {
            class90 var36;
            if (var21.field2925 == -1 && var21.field2943 == null) {
                var36 = var21.method3465(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class50(arg4, 0, arg5, var18, arg2, arg3, var21.field2925, true, (class90) null);
            }
            var19.method1818(arg0, arg2, arg3, var29, var36, (class90) null, class11.field113[arg5], 0, var32, var33);
            if (var21.field2919 != 0) {
                var20.method2193(arg2, arg3, arg6, arg5, var21.field2920);
            }
        } else if (arg6 == 1) {
            class90 var37;
            if (var21.field2925 == -1 && var21.field2943 == null) {
                var37 = var21.method3465(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class50(arg4, 1, arg5, var18, arg2, arg3, var21.field2925, true, (class90) null);
            }
            var19.method1818(arg0, arg2, arg3, var29, var37, (class90) null, class11.field111[arg5], 0, var32, var33);
            if (var21.field2919 != 0) {
                var20.method2193(arg2, arg3, arg6, arg5, var21.field2920);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class90 var39;
            class90 var40;
            if (var21.field2925 == -1 && var21.field2943 == null) {
                var39 = var21.method3465(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method3465(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class50(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field2925, true, (class90) null);
                var40 = new class50(arg4, 2, var38, var18, arg2, arg3, var21.field2925, true, (class90) null);
            }
            var19.method1818(arg0, arg2, arg3, var29, var39, var40, class11.field113[arg5], class11.field113[var38], var32, var33);
            if (var21.field2919 != 0) {
                var20.method2193(arg2, arg3, arg6, arg5, var21.field2920);
            }
        } else if (arg6 == 3) {
            class90 var41;
            if (var21.field2925 == -1 && var21.field2943 == null) {
                var41 = var21.method3465(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class50(arg4, 3, arg5, var18, arg2, arg3, var21.field2925, true, (class90) null);
            }
            var19.method1818(arg0, arg2, arg3, var29, var41, (class90) null, class11.field111[arg5], 0, var32, var33);
            if (var21.field2919 != 0) {
                var20.method2193(arg2, arg3, arg6, arg5, var21.field2920);
            }
        } else if (arg6 == 9) {
            class90 var42;
            if (var21.field2925 == -1 && var21.field2943 == null) {
                var42 = var21.method3465(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class50(arg4, arg6, arg5, var18, arg2, arg3, var21.field2925, true, (class90) null);
            }
            var19.method1657(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field2919 != 0) {
                var20.method2161(arg2, arg3, var22, var23, var21.field2920);
            }
        } else if (arg6 == 4) {
            class90 var43;
            if (var21.field2925 == -1 && var21.field2943 == null) {
                var43 = var21.method3465(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class50(arg4, 4, arg5, var18, arg2, arg3, var21.field2925, true, (class90) null);
            }
            var19.method1656(arg0, arg2, arg3, var29, var43, (class90) null, class11.field113[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1670(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class198.method1865(var45 >> 14 & 0x7FFF).field2926;
            }
            class90 var46;
            if (var21.field2925 == -1 && var21.field2943 == null) {
                var46 = var21.method3465(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class50(arg4, 4, arg5, var18, arg2, arg3, var21.field2925, true, (class90) null);
            }
            var19.method1656(arg0, arg2, arg3, var29, var46, (class90) null, class11.field113[arg5], 0, class11.field112[arg5] * var44, class11.field119[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1670(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class198.method1865(var48 >> 14 & 0x7FFF).field2926 / 2;
            }
            class90 var49;
            if (var21.field2925 == -1 && var21.field2943 == null) {
                var49 = var21.method3465(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class50(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field2925, true, (class90) null);
            }
            var19.method1656(arg0, arg2, arg3, var29, var49, (class90) null, 256, arg5, class11.field114[arg5] * var47, class11.field118[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class90 var51;
            if (var21.field2925 == -1 && var21.field2943 == null) {
                var51 = var21.method3465(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class50(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field2925, true, (class90) null);
            }
            var19.method1656(arg0, arg2, arg3, var29, var51, (class90) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1670(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class198.method1865(var53 >> 14 & 0x7FFF).field2926 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class90 var55;
            class90 var56;
            if (var21.field2925 == -1 && var21.field2943 == null) {
                var55 = var21.method3465(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method3465(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class50(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field2925, true, (class90) null);
                var56 = new class50(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field2925, true, (class90) null);
            }
            var19.method1656(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class11.field114[arg5] * var52, class11.field118[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("v.bp(III)V")
    public static final void method188(int arg0, int arg1) {
        class129 var2 = field418[Statics.field967][arg0][arg1];
        if (var2 == null) {
            Statics.field2110.method1809(Statics.field967, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class44 var5 = null;
        for (class44 var6 = (class44) var2.method2315(); var6 != null; var6 = (class44) var2.method2332()) {
            class199 var7 = class199.method751(var6.field892);
            long var8 = (long) var7.field2968;
            if (var7.field2974 == 1) {
                var8 = (long) (var6.field888 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field2110.method1809(Statics.field967, arg0, arg1);
            return;
        }
        var2.method2309(var5);
        class44 var10 = null;
        class44 var11 = null;
        for (class44 var12 = (class44) var2.method2315(); var12 != null; var12 = (class44) var2.method2332()) {
            if (var5.field892 != var12.field892) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field892 != var12.field892 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field2110.method1836(Statics.field967, arg0, arg1, method754(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field967), var5, var13, var10, var11);
    }

    @ObfuscatedName("client.bb(ZI)V")
    public static final void method526(boolean arg0) {
        field422 = 0;
        field403 = 0;
        method2651();
        while (field331.method2918(field332) >= 27) {
            int var1 = field331.method2927(15);
            if (var1 == 32767) {
                break;
            }
            boolean var5 = false;
            if (field324[var1] == null) {
                field324[var1] = new class36();
                var5 = true;
            }
            class36 var6 = field324[var1];
            field326[++field325 - 1] = var1;
            var6.field637 = field489;
            int var7;
            if (arg0) {
                var7 = field331.method2927(8);
                if (var7 > 127) {
                    var7 -= 256;
                }
            } else {
                var7 = field331.method2927(5);
                if (var7 > 15) {
                    var7 -= 32;
                }
            }
            int var8 = field416[field331.method2927(3)];
            if (var5) {
                var6.field652 = var6.field602 = var8;
            }
            int var9 = field331.method2927(1);
            if (var9 == 1) {
                field378[++field403 - 1] = var1;
            }
            int var10;
            if (arg0) {
                var10 = field331.method2927(8);
                if (var10 > 127) {
                    var10 -= 256;
                }
            } else {
                var10 = field331.method2927(5);
                if (var10 > 15) {
                    var10 -= 32;
                }
            }
            var6.field756 = class200.method3376(field331.method2927(14));
            int var11 = field331.method2927(1);
            var6.field605 = var6.field756.field3042;
            var6.field617 = var6.field756.field3037;
            if (var6.field617 == 0) {
                var6.field602 = 0;
            }
            var6.field622 = var6.field756.field3020;
            var6.field634 = var6.field756.field3021;
            var6.field611 = var6.field756.field3022;
            var6.field612 = var6.field756.field3023;
            var6.field604 = var6.field756.field3017;
            var6.field621 = var6.field756.field3038;
            var6.field608 = var6.field756.field3025;
            var6.method744(Statics.field685.field656[0] + var10, Statics.field685.field657[0] + var7, var11 == 1);
        }
        field331.method2917();
        method190();
        for (int var2 = 0; var2 < field422; var2++) {
            int var3 = field476[var2];
            if (field489 != field324[var3].field637) {
                field324[var3].field756 = null;
                field324[var3] = null;
            }
        }
        if (field332 != field331.field2079) {
            throw new RuntimeException(field331.field2079 + class38.field781 + field332);
        }
        for (int var4 = 0; var4 < field325; var4++) {
            if (field324[field326[var4]] == null) {
                throw new RuntimeException(var4 + class38.field781 + field325);
            }
        }
    }

    @ObfuscatedName("ek.bl(B)V")
    public static final void method2651() {
        field331.method2915();
        int var0 = field331.method2927(8);
        if (var0 < field325) {
            for (int var1 = var0; var1 < field325; var1++) {
                field476[++field422 - 1] = field326[var1];
            }
        }
        if (var0 > field325) {
            throw new RuntimeException("");
        }
        field325 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field326[var2];
            class36 var4 = field324[var3];
            int var5 = field331.method2927(1);
            if (var5 == 0) {
                field326[++field325 - 1] = var3;
                var4.field637 = field489;
            } else {
                int var6 = field331.method2927(2);
                if (var6 == 0) {
                    field326[++field325 - 1] = var3;
                    var4.field637 = field489;
                    field378[++field403 - 1] = var3;
                } else if (var6 == 1) {
                    field326[++field325 - 1] = var3;
                    var4.field637 = field489;
                    int var7 = field331.method2927(3);
                    var4.method740(var7, (byte) 1);
                    int var8 = field331.method2927(1);
                    if (var8 == 1) {
                        field378[++field403 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field326[++field325 - 1] = var3;
                    var4.field637 = field489;
                    int var9 = field331.method2927(3);
                    var4.method740(var9, (byte) 2);
                    int var10 = field331.method2927(3);
                    var4.method740(var10, (byte) 2);
                    int var11 = field331.method2927(1);
                    if (var11 == 1) {
                        field378[++field403 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field476[++field422 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("v.bm(B)V")
    public static final void method190() {
        for (int var0 = 0; var0 < field403; var0++) {
            int var1 = field378[var0];
            class36 var2 = field324[var1];
            int var3 = field331.method2669();
            if ((var3 & 0x1) != 0) {
                int var4 = field331.method2704();
                if (var4 == 65535) {
                    var4 = -1;
                }
                int var5 = field331.method2808();
                if (var2.field633 == var4 && var4 != -1) {
                    int var6 = class202.method17(var4).field3069;
                    if (var6 == 1) {
                        var2.field650 = 0;
                        var2.field624 = 0;
                        var2.field636 = var5;
                        var2.field632 = 0;
                    }
                    if (var6 == 2) {
                        var2.field632 = 0;
                    }
                } else if (var4 == -1 || var2.field633 == -1 || class202.method17(var4).field3072 >= class202.method17(var2.field633).field3072) {
                    var2.field633 = var4;
                    var2.field650 = 0;
                    var2.field624 = 0;
                    var2.field636 = var5;
                    var2.field632 = 0;
                    var2.field660 = var2.field655;
                }
            }
            if ((var3 & 0x8) != 0) {
                var2.field647 = field331.method2706();
                if (var2.field647 == 65535) {
                    var2.field647 = -1;
                }
            }
            if ((var3 & 0x2) != 0) {
                var2.field756 = class200.method3376(field331.method2704());
                var2.field605 = var2.field756.field3042;
                var2.field617 = var2.field756.field3037;
                var2.field622 = var2.field756.field3020;
                var2.field634 = var2.field756.field3021;
                var2.field611 = var2.field756.field3022;
                var2.field612 = var2.field756.field3023;
                var2.field604 = var2.field756.field3017;
                var2.field621 = var2.field756.field3038;
                var2.field608 = var2.field756.field3025;
            }
            if ((var3 & 0x10) != 0) {
                var2.field614 = field331.method2677();
                var2.field627 = 100;
            }
            if ((var3 & 0x40) != 0) {
                var2.field638 = field331.method2704();
                int var7 = field331.method2815();
                var2.field642 = var7 >> 16;
                var2.field640 = (var7 & 0xFFFF) + field489;
                var2.field639 = 0;
                var2.field601 = 0;
                if (var2.field640 > field489) {
                    var2.field639 = -1;
                }
                if (var2.field638 == 65535) {
                    var2.field638 = -1;
                }
            }
            if ((var3 & 0x4) != 0) {
                int var8 = field331.method2704();
                int var9 = field331.method2706();
                int var10 = var2.field610 - (var8 - Statics.field19 - Statics.field19) * 64;
                int var11 = var2.field609 - (var9 - Statics.field341 - Statics.field341) * 64;
                if (var10 != 0 || var11 != 0) {
                    var2.field629 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x20) != 0) {
                int var12 = field331.method2757();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = field331.method2682();
                        if (var17 == 32767) {
                            var17 = field331.method2682();
                            var15 = field331.method2682();
                            var14 = field331.method2682();
                            var16 = field331.method2682();
                        } else if (var17 == 32766) {
                            var17 = -1;
                        } else {
                            var15 = field331.method2682();
                        }
                        int var18 = field331.method2682();
                        var2.method597(var17, var15, var14, var16, field489, var18);
                    }
                }
                int var19 = field331.method2808();
                if (var19 > 0) {
                    for (int var20 = 0; var20 < var19; var20++) {
                        int var21 = field331.method2682();
                        int var22 = field331.method2682();
                        if (var22 == 32767) {
                            var2.method587(var21);
                        } else {
                            int var23 = field331.method2682();
                            int var24 = field331.method2757();
                            int var25 = var22 > 0 ? field331.method2696() : var24;
                            var2.method586(var21, field489, var22, var23, var24, var25);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.bw(B)V")
    public static void method812() {
        field427 = 0;
        field458 = -1;
        field426 = false;
        field432[0] = class174.field2468;
        field567[0] = "";
        field301[0] = 1006;
        field427 = 1;
    }

    @ObfuscatedName("cs.bs(IIIIB)V")
    public static final void method1866(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field491; var4++) {
            if (field498[var4] + field470[var4] > arg0 && field470[var4] < arg0 + arg2 && field499[var4] + field372[var4] > arg1 && field372[var4] < arg1 + arg3) {
                field493[var4] = true;
            }
        }
    }

    @ObfuscatedName("cz.bt(IIB)V")
    public static final void method1861(int arg0, int arg1) {
        int var2 = Statics.field283.method3727(class174.field2511);
        for (int var3 = 0; var3 < field427; var3++) {
            int var4 = Statics.field283.method3727(method3435(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field427 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field1559) {
            var6 = Statics.field1559 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field2788) {
            var7 = Statics.field2788 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field2110.method1684(Statics.field967, arg0, arg1, false);
        field426 = true;
        Statics.field1807 = var6;
        Statics.field1543 = var7;
        Statics.field1720 = var2;
        Statics.field847 = field427 * 15 + 22;
    }

    @ObfuscatedName("db.bj(IB)Z")
    public static final boolean method1981(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field301[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("dg.by(Laz;IIB)V")
    public static final void method2157(class39 arg0, int arg1, int arg2) {
        method798(arg0.field791, arg0.field790, arg0.field793, arg0.field792, arg0.field795, arg0.field795, arg1, arg2);
    }

    @ObfuscatedName("ak.bx(IIIILjava/lang/String;Ljava/lang/String;IIS)V")
    public static final void method798(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 18) {
            field395 = arg6;
            field396 = arg7;
            field333 = 2;
            field350 = 0;
            field292 = arg0;
            field305 = arg1;
            field417.method2920(216);
            field417.method2793(Statics.field19 + arg0);
            field417.method2793(arg3);
            field417.method2703(Statics.field341 + arg1);
            field417.method2718(class106.field1711[82] ? 1 : 0);
        }
        if (arg2 == 38) {
            method76();
            class170 var8 = Statics.method211(arg1);
            field441 = 1;
            Statics.field62 = arg0;
            Statics.field1187 = arg1;
            Statics.field47 = arg3;
            method1858(var8);
            field337 = class38.method3030(16748608) + class199.method751(arg3).field2963 + class38.method3030(16777215);
            if (field337 == null) {
                field337 = "null";
            }
            return;
        }
        if (arg2 == 22) {
            field395 = arg6;
            field396 = arg7;
            field333 = 2;
            field350 = 0;
            field292 = arg0;
            field305 = arg1;
            field417.method2920(239);
            field417.method2702(Statics.field341 + arg1);
            field417.method2780(class106.field1711[82] ? 1 : 0);
            field417.method2702(arg3);
            field417.method2701(Statics.field19 + arg0);
        }
        if (arg2 == 1001) {
            field395 = arg6;
            field396 = arg7;
            field333 = 2;
            field350 = 0;
            field292 = arg0;
            field305 = arg1;
            field417.method2920(204);
            field417.method2793(Statics.field19 + arg0);
            field417.method2718(class106.field1711[82] ? 1 : 0);
            field417.method2702(Statics.field341 + arg1);
            field417.method2702(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 13) {
            class36 var9 = field324[arg3];
            if (var9 != null) {
                field395 = arg6;
                field396 = arg7;
                field333 = 2;
                field350 = 0;
                field292 = arg0;
                field305 = arg1;
                field417.method2920(243);
                field417.method2718(class106.field1711[82] ? 1 : 0);
                field417.method2701(arg3);
            }
        }
        if (arg2 == 44) {
            class24 var10 = field408[arg3];
            if (var10 != null) {
                field395 = arg6;
                field396 = arg7;
                field333 = 2;
                field350 = 0;
                field292 = arg0;
                field305 = arg1;
                field417.method2920(68);
                field417.method2703(arg3);
                field417.method2660(class106.field1711[82] ? 1 : 0);
            }
        }
        if (arg2 == 1002) {
            field395 = arg6;
            field396 = arg7;
            field333 = 2;
            field350 = 0;
            field417.method2920(134);
            field417.method2703(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1004) {
            field395 = arg6;
            field396 = arg7;
            field333 = 2;
            field350 = 0;
            field417.method2920(158);
            field417.method2701(arg3);
        }
        if (arg2 == 17) {
            field395 = arg6;
            field396 = arg7;
            field333 = 2;
            field350 = 0;
            field292 = arg0;
            field305 = arg1;
            field417.method2920(109);
            field417.method2793(Statics.field19 + arg0);
            field417.method2660(class106.field1711[82] ? 1 : 0);
            field417.method2702(field444);
            field417.method2832(Statics.field120);
            field417.method2703(Statics.field341 + arg1);
            field417.method2702(arg3);
        }
        if (arg2 == 41) {
            field417.method2920(66);
            field417.method2701(arg3);
            field417.method2754(arg1);
            field417.method2703(arg0);
            field399 = 0;
            Statics.field598 = Statics.method211(arg1);
            field400 = arg0;
        }
        if (arg2 == 28) {
            field417.method2920(56);
            field417.method2658(arg1);
            class170 var11 = Statics.method211(arg1);
            if (var11.field2313 != null && var11.field2313[0][0] == 5) {
                int var12 = var11.field2313[0][1];
                class166.field2158[var12] = 1 - class166.field2158[var12];
                method1843(var12);
            }
        }
        if (arg2 == 7) {
            class36 var13 = field324[arg3];
            if (var13 != null) {
                field395 = arg6;
                field396 = arg7;
                field333 = 2;
                field350 = 0;
                field292 = arg0;
                field305 = arg1;
                field417.method2920(217);
                field417.method2754(Statics.field1187);
                field417.method2701(Statics.field47);
                field417.method2701(Statics.field62);
                field417.method2703(arg3);
                field417.method2695(class106.field1711[82] ? 1 : 0);
            }
        }
        if (arg2 == 9) {
            class36 var14 = field324[arg3];
            if (var14 != null) {
                field395 = arg6;
                field396 = arg7;
                field333 = 2;
                field350 = 0;
                field292 = arg0;
                field305 = arg1;
                field417.method2920(77);
                field417.method2718(class106.field1711[82] ? 1 : 0);
                field417.method2701(arg3);
            }
        }
        if (arg2 == 58) {
            class170 var15 = class170.method1407(arg1, arg0);
            if (var15 != null) {
                field417.method2920(170);
                field417.method2658(arg1);
                field417.method2702(var15.field2202);
                field417.method2701(field445);
                field417.method2793(arg0);
                field417.method2701(field444);
                field417.method2754(Statics.field120);
            }
        }
        if (arg2 == 42) {
            field417.method2920(197);
            field417.method2702(arg0);
            field417.method2703(arg3);
            field417.method2658(arg1);
            field399 = 0;
            Statics.field598 = Statics.method211(arg1);
            field400 = arg0;
        }
        if (arg2 == 2) {
            field395 = arg6;
            field396 = arg7;
            field333 = 2;
            field350 = 0;
            field292 = arg0;
            field305 = arg1;
            field417.method2920(62);
            field417.method2702(Statics.field19 + arg0);
            field417.method2702(field444);
            field417.method2754(Statics.field120);
            field417.method2793(arg3 >> 14 & 0x7FFF);
            field417.method2793(Statics.field341 + arg1);
            field417.method2718(class106.field1711[82] ? 1 : 0);
        }
        if (arg2 == 39) {
            field417.method2920(150);
            field417.method2703(arg0);
            field417.method2703(arg3);
            field417.method2658(arg1);
            field399 = 0;
            Statics.field598 = Statics.method211(arg1);
            field400 = arg0;
        }
        if (arg2 == 3) {
            field395 = arg6;
            field396 = arg7;
            field333 = 2;
            field350 = 0;
            field292 = arg0;
            field305 = arg1;
            field417.method2920(124);
            field417.method2793(arg3 >> 14 & 0x7FFF);
            field417.method2660(class106.field1711[82] ? 1 : 0);
            field417.method2701(Statics.field19 + arg0);
            field417.method2702(Statics.field341 + arg1);
        }
        if (arg2 == 4) {
            field395 = arg6;
            field396 = arg7;
            field333 = 2;
            field350 = 0;
            field292 = arg0;
            field305 = arg1;
            field417.method2920(205);
            field417.method2660(class106.field1711[82] ? 1 : 0);
            field417.method2793(Statics.field341 + arg1);
            field417.method2701(arg3 >> 14 & 0x7FFF);
            field417.method2703(Statics.field19 + arg0);
        }
        if (arg2 == 23) {
            if (field426) {
                Statics.field2110.method1685();
            } else {
                Statics.field2110.method1684(Statics.field967, arg0, arg1, true);
            }
        }
        if (arg2 == 6) {
            field395 = arg6;
            field396 = arg7;
            field333 = 2;
            field350 = 0;
            field292 = arg0;
            field305 = arg1;
            field417.method2920(247);
            field417.method2793(arg3 >> 14 & 0x7FFF);
            field417.method2702(Statics.field19 + arg0);
            field417.method2701(Statics.field341 + arg1);
            field417.method2695(class106.field1711[82] ? 1 : 0);
        }
        if (arg2 == 20) {
            field395 = arg6;
            field396 = arg7;
            field333 = 2;
            field350 = 0;
            field292 = arg0;
            field305 = arg1;
            field417.method2920(149);
            field417.method2780(class106.field1711[82] ? 1 : 0);
            field417.method2702(Statics.field19 + arg0);
            field417.method2793(arg3);
            field417.method2701(Statics.field341 + arg1);
        }
        if (arg2 == 1003) {
            field395 = arg6;
            field396 = arg7;
            field333 = 2;
            field350 = 0;
            class36 var16 = field324[arg3];
            if (var16 != null) {
                class200 var17 = var16.field756;
                if (var17.field3035 != null) {
                    var17 = var17.method3552();
                }
                if (var17 != null) {
                    field417.method2920(27);
                    field417.method2701(var17.field3028);
                }
            }
        }
        if (arg2 == 14) {
            class24 var18 = field408[arg3];
            if (var18 != null) {
                field395 = arg6;
                field396 = arg7;
                field333 = 2;
                field350 = 0;
                field292 = arg0;
                field305 = arg1;
                field417.method2920(249);
                field417.method2701(Statics.field62);
                field417.method2703(Statics.field47);
                field417.method2793(arg3);
                field417.method2660(class106.field1711[82] ? 1 : 0);
                field417.method2712(Statics.field1187);
            }
        }
        if (arg2 == 15) {
            class24 var19 = field408[arg3];
            if (var19 != null) {
                field395 = arg6;
                field396 = arg7;
                field333 = 2;
                field350 = 0;
                field292 = arg0;
                field305 = arg1;
                field417.method2920(96);
                field417.method2658(Statics.field120);
                field417.method2703(arg3);
                field417.method2701(field444);
                field417.method2695(class106.field1711[82] ? 1 : 0);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class170 var20 = class170.method1407(arg1, arg0);
            if (var20 != null) {
                method724(arg3, arg1, arg0, var20.field2202, arg5);
            }
        }
        if (arg2 == 1005) {
            class170 var21 = Statics.method211(arg1);
            if (var21 == null || var21.field2320[arg0] < 100000) {
                field417.method2920(158);
                field417.method2701(arg3);
            } else {
                class48.method3031(27, "", var21.field2320[arg0] + " x " + class199.method751(arg3).field2963);
            }
            field399 = 0;
            Statics.field598 = Statics.method211(arg1);
            field400 = arg0;
        }
        if (arg2 == 12) {
            class36 var22 = field324[arg3];
            if (var22 != null) {
                field395 = arg6;
                field396 = arg7;
                field333 = 2;
                field350 = 0;
                field292 = arg0;
                field305 = arg1;
                field417.method2920(198);
                field417.method2703(arg3);
                field417.method2660(class106.field1711[82] ? 1 : 0);
            }
        }
        if (arg2 == 26) {
            field417.method2920(196);
            for (class18 var23 = (class18) field449.method2262(); var23 != null; var23 = (class18) field449.method2260()) {
                if (var23.field188 == 0 || var23.field188 == 3) {
                    method213(var23, true);
                }
            }
            if (field452 != null) {
                method1858(field452);
                field452 = null;
            }
        }
        if (arg2 == 34) {
            field417.method2920(79);
            field417.method2703(arg3);
            field417.method2793(arg0);
            field417.method2754(arg1);
            field399 = 0;
            Statics.field598 = Statics.method211(arg1);
            field400 = arg0;
        }
        if (arg2 == 33) {
            field417.method2920(211);
            field417.method2832(arg1);
            field417.method2793(arg3);
            field417.method2702(arg0);
            field399 = 0;
            Statics.field598 = Statics.method211(arg1);
            field400 = arg0;
        }
        if (arg2 == 36) {
            field417.method2920(103);
            field417.method2754(arg1);
            field417.method2793(arg0);
            field417.method2701(arg3);
            field399 = 0;
            Statics.field598 = Statics.method211(arg1);
            field400 = arg0;
        }
        if (arg2 == 48) {
            class24 var24 = field408[arg3];
            if (var24 != null) {
                field395 = arg6;
                field396 = arg7;
                field333 = 2;
                field350 = 0;
                field292 = arg0;
                field305 = arg1;
                field417.method2920(40);
                field417.method2660(class106.field1711[82] ? 1 : 0);
                field417.method2793(arg3);
            }
        }
        if (arg2 == 47) {
            class24 var25 = field408[arg3];
            if (var25 != null) {
                field395 = arg6;
                field396 = arg7;
                field333 = 2;
                field350 = 0;
                field292 = arg0;
                field305 = arg1;
                field417.method2920(94);
                field417.method2703(arg3);
                field417.method2718(class106.field1711[82] ? 1 : 0);
            }
        }
        if (arg2 == 43) {
            field417.method2920(98);
            field417.method2703(arg3);
            field417.method2754(arg1);
            field417.method2703(arg0);
            field399 = 0;
            Statics.field598 = Statics.method211(arg1);
            field400 = arg0;
        }
        if (arg2 == 8) {
            class36 var26 = field324[arg3];
            if (var26 != null) {
                field395 = arg6;
                field396 = arg7;
                field333 = 2;
                field350 = 0;
                field292 = arg0;
                field305 = arg1;
                field417.method2920(140);
                field417.method2793(arg3);
                field417.method2703(field444);
                field417.method2754(Statics.field120);
                field417.method2780(class106.field1711[82] ? 1 : 0);
            }
        }
        if (arg2 == 24) {
            class170 var27 = Statics.method211(arg1);
            boolean var28 = true;
            if (var27.field2205 > 0) {
                var28 = method3020(var27);
            }
            if (var28) {
                field417.method2920(56);
                field417.method2658(arg1);
            }
        }
        if (arg2 == 5) {
            field395 = arg6;
            field396 = arg7;
            field333 = 2;
            field350 = 0;
            field292 = arg0;
            field305 = arg1;
            field417.method2920(145);
            field417.method2703(arg3 >> 14 & 0x7FFF);
            field417.method2702(Statics.field19 + arg0);
            field417.method2660(class106.field1711[82] ? 1 : 0);
            field417.method2793(Statics.field341 + arg1);
        }
        if (arg2 == 11) {
            class36 var29 = field324[arg3];
            if (var29 != null) {
                field395 = arg6;
                field396 = arg7;
                field333 = 2;
                field350 = 0;
                field292 = arg0;
                field305 = arg1;
                field417.method2920(38);
                field417.method2793(arg3);
                field417.method2718(class106.field1711[82] ? 1 : 0);
            }
        }
        if (arg2 == 40) {
            field417.method2920(184);
            field417.method2703(arg0);
            field417.method2701(arg3);
            field417.method2754(arg1);
            field399 = 0;
            Statics.field598 = Statics.method211(arg1);
            field400 = arg0;
        }
        if (arg2 == 29) {
            field417.method2920(56);
            field417.method2658(arg1);
            class170 var30 = Statics.method211(arg1);
            if (var30.field2313 != null && var30.field2313[0][0] == 5) {
                int var31 = var30.field2313[0][1];
                if (class166.field2158[var31] != var30.field2331[0]) {
                    class166.field2158[var31] = var30.field2331[0];
                    method1843(var31);
                }
            }
        }
        if (arg2 == 30 && field452 == null) {
            field417.method2920(3);
            field417.method2703(arg0);
            field417.method2832(arg1);
            field452 = class170.method1407(arg1, arg0);
            method1858(field452);
        }
        if (arg2 == 35) {
            field417.method2920(143);
            field417.method2754(arg1);
            field417.method2703(arg0);
            field417.method2702(arg3);
            field399 = 0;
            Statics.field598 = Statics.method211(arg1);
            field400 = arg0;
        }
        if (arg2 == 21) {
            field395 = arg6;
            field396 = arg7;
            field333 = 2;
            field350 = 0;
            field292 = arg0;
            field305 = arg1;
            field417.method2920(241);
            field417.method2793(Statics.field341 + arg1);
            field417.method2702(arg3);
            field417.method2793(Statics.field19 + arg0);
            field417.method2718(class106.field1711[82] ? 1 : 0);
        }
        if (arg2 == 32) {
            field417.method2920(6);
            field417.method2703(arg0);
            field417.method2712(Statics.field120);
            field417.method2702(field444);
            field417.method2658(arg1);
            field417.method2793(arg3);
            field399 = 0;
            Statics.field598 = Statics.method211(arg1);
            field400 = arg0;
        }
        if (arg2 == 51) {
            class24 var32 = field408[arg3];
            if (var32 != null) {
                field395 = arg6;
                field396 = arg7;
                field333 = 2;
                field350 = 0;
                field292 = arg0;
                field305 = arg1;
                field417.method2920(188);
                field417.method2702(arg3);
                field417.method2660(class106.field1711[82] ? 1 : 0);
            }
        }
        if (arg2 == 45) {
            class24 var33 = field408[arg3];
            if (var33 != null) {
                field395 = arg6;
                field396 = arg7;
                field333 = 2;
                field350 = 0;
                field292 = arg0;
                field305 = arg1;
                field417.method2920(253);
                field417.method2703(arg3);
                field417.method2660(class106.field1711[82] ? 1 : 0);
            }
        }
        if (arg2 == 10) {
            class36 var34 = field324[arg3];
            if (var34 != null) {
                field395 = arg6;
                field396 = arg7;
                field333 = 2;
                field350 = 0;
                field292 = arg0;
                field305 = arg1;
                field417.method2920(99);
                field417.method2793(arg3);
                field417.method2660(class106.field1711[82] ? 1 : 0);
            }
        }
        if (arg2 == 25) {
            class170 var35 = class170.method1407(arg1, arg0);
            if (var35 != null) {
                method76();
                method2636(arg1, arg0, class171.method1870(method2885(var35)), var35.field2202);
                field441 = 0;
                field446 = method223(var35);
                if (field446 == null) {
                    field446 = "Null";
                }
                if (var35.field2200) {
                    field447 = var35.field2274 + class38.method3030(16777215);
                } else {
                    field447 = class38.method3030(65280) + var35.field2317 + class38.method3030(16777215);
                }
            }
            return;
        }
        if (arg2 == 50) {
            class24 var36 = field408[arg3];
            if (var36 != null) {
                field395 = arg6;
                field396 = arg7;
                field333 = 2;
                field350 = 0;
                field292 = arg0;
                field305 = arg1;
                field417.method2920(46);
                field417.method2780(class106.field1711[82] ? 1 : 0);
                field417.method2793(arg3);
            }
        }
        if (arg2 == 37) {
            field417.method2920(55);
            field417.method2703(arg0);
            field417.method2658(arg1);
            field417.method2703(arg3);
            field399 = 0;
            Statics.field598 = Statics.method211(arg1);
            field400 = arg0;
        }
        if (arg2 == 16) {
            field395 = arg6;
            field396 = arg7;
            field333 = 2;
            field350 = 0;
            field292 = arg0;
            field305 = arg1;
            field417.method2920(0);
            field417.method2660(class106.field1711[82] ? 1 : 0);
            field417.method2793(Statics.field47);
            field417.method2703(Statics.field19 + arg0);
            field417.method2832(Statics.field1187);
            field417.method2702(arg3);
            field417.method2701(Statics.field62);
            field417.method2701(Statics.field341 + arg1);
        }
        if (arg2 == 49) {
            class24 var37 = field408[arg3];
            if (var37 != null) {
                field395 = arg6;
                field396 = arg7;
                field333 = 2;
                field350 = 0;
                field292 = arg0;
                field305 = arg1;
                field417.method2920(32);
                field417.method2793(arg3);
                field417.method2660(class106.field1711[82] ? 1 : 0);
            }
        }
        if (arg2 == 19) {
            field395 = arg6;
            field396 = arg7;
            field333 = 2;
            field350 = 0;
            field292 = arg0;
            field305 = arg1;
            field417.method2920(169);
            field417.method2695(class106.field1711[82] ? 1 : 0);
            field417.method2703(Statics.field341 + arg1);
            field417.method2701(Statics.field19 + arg0);
            field417.method2702(arg3);
        }
        if (arg2 == 1) {
            field395 = arg6;
            field396 = arg7;
            field333 = 2;
            field350 = 0;
            field292 = arg0;
            field305 = arg1;
            field417.method2920(151);
            field417.method2703(Statics.field47);
            field417.method2703(Statics.field341 + arg1);
            field417.method2701(arg3 >> 14 & 0x7FFF);
            field417.method2703(Statics.field19 + arg0);
            field417.method2718(class106.field1711[82] ? 1 : 0);
            field417.method2793(Statics.field62);
            field417.method2658(Statics.field1187);
        }
        if (arg2 == 46) {
            class24 var38 = field408[arg3];
            if (var38 != null) {
                field395 = arg6;
                field396 = arg7;
                field333 = 2;
                field350 = 0;
                field292 = arg0;
                field305 = arg1;
                field417.method2920(48);
                field417.method2695(class106.field1711[82] ? 1 : 0);
                field417.method2703(arg3);
            }
        }
        if (arg2 == 31) {
            field417.method2920(84);
            field417.method2702(Statics.field62);
            field417.method2702(arg3);
            field417.method2754(arg1);
            field417.method2793(arg0);
            field417.method2703(Statics.field47);
            field417.method2712(Statics.field1187);
            field399 = 0;
            Statics.field598 = Statics.method211(arg1);
            field400 = arg0;
        }
        if (field441 != 0) {
            field441 = 0;
            method1858(Statics.method211(Statics.field1187));
        }
        if (field443) {
            method76();
        }
        if (Statics.field598 != null && field399 == 0) {
            method1858(Statics.field598);
        }
    }

    @ObfuscatedName("eu.bn(ILjava/lang/String;B)V")
    public static void method2602(int arg0, String arg1) {
        int var2 = class46.field913;
        int[] var3 = class46.field921;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class24 var6 = field408[var3[var5]];
            if (var6 != null && Statics.field685 != var6 && var6.field267 != null && var6.field267.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field417.method2920(68);
                    field417.method2703(var3[var5]);
                    field417.method2660(0);
                } else if (arg0 == 4) {
                    field417.method2920(94);
                    field417.method2703(var3[var5]);
                    field417.method2718(0);
                } else if (arg0 == 6) {
                    field417.method2920(32);
                    field417.method2793(var3[var5]);
                    field417.method2660(0);
                } else if (arg0 == 7) {
                    field417.method2920(46);
                    field417.method2780(0);
                    field417.method2793(var3[var5]);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class48.method3031(4, "", class174.field2507 + arg1);
        }
    }

    @ObfuscatedName("ev.br(IIIII)V")
    public static void method2636(int arg0, int arg1, int arg2, int arg3) {
        class170 var4 = class170.method1407(arg0, arg1);
        if (var4 != null && var4.field2292 != null) {
            class19 var5 = new class19();
            var5.field214 = var4;
            var5.field203 = var4.field2292;
            class33.method2511(var5);
        }
        field445 = arg3;
        field443 = true;
        Statics.field120 = arg0;
        field444 = arg1;
        Statics.field2 = arg2;
        method1858(var4);
    }

    @ObfuscatedName("j.bk(I)V")
    public static void method76() {
        if (!field443) {
            return;
        }
        class170 var0 = class170.method1407(Statics.field120, field444);
        if (var0 != null && var0.field2258 != null) {
            class19 var1 = new class19();
            var1.field214 = var0;
            var1.field203 = var0.field2258;
            class33.method2511(var1);
        }
        field443 = false;
        method1858(var0);
    }

    @ObfuscatedName("ap.ch(IIIILjava/lang/String;B)V")
    public static void method724(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class170 var5 = class170.method1407(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2301 != null) {
            class19 var6 = new class19();
            var6.field214 = var5;
            var6.field212 = arg0;
            var6.field208 = arg4;
            var6.field203 = var5.field2301;
            class33.method2511(var6);
        }
        boolean var7 = true;
        if (var5.field2205 > 0) {
            var7 = method3020(var5);
        }
        if (!var7 || !class171.method1097(method2885(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field417.method2920(118);
            field417.method2658(arg1);
            field417.method2793(arg2);
            field417.method2793(arg3);
        }
        if (arg0 == 2) {
            field417.method2920(113);
            field417.method2658(arg1);
            field417.method2793(arg2);
            field417.method2793(arg3);
        }
        if (arg0 == 3) {
            field417.method2920(194);
            field417.method2658(arg1);
            field417.method2793(arg2);
            field417.method2793(arg3);
        }
        if (arg0 == 4) {
            field417.method2920(111);
            field417.method2658(arg1);
            field417.method2793(arg2);
            field417.method2793(arg3);
        }
        if (arg0 == 5) {
            field417.method2920(102);
            field417.method2658(arg1);
            field417.method2793(arg2);
            field417.method2793(arg3);
        }
        if (arg0 == 6) {
            field417.method2920(142);
            field417.method2658(arg1);
            field417.method2793(arg2);
            field417.method2793(arg3);
        }
        if (arg0 == 7) {
            field417.method2920(155);
            field417.method2658(arg1);
            field417.method2793(arg2);
            field417.method2793(arg3);
        }
        if (arg0 == 8) {
            field417.method2920(76);
            field417.method2658(arg1);
            field417.method2793(arg2);
            field417.method2793(arg3);
        }
        if (arg0 == 9) {
            field417.method2920(186);
            field417.method2658(arg1);
            field417.method2793(arg2);
            field417.method2793(arg3);
        }
        if (arg0 == 10) {
            field417.method2920(107);
            field417.method2658(arg1);
            field417.method2793(arg2);
            field417.method2793(arg3);
        }
    }

    @ObfuscatedName("at.cp(I)V")
    public static final void method715() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field427 - 1; var1++) {
                if (field301[var1] < 1000 && field301[var1 + 1] > 1000) {
                    String var2 = field567[var1];
                    field567[var1] = field567[var1 + 1];
                    field567[var1 + 1] = var2;
                    String var3 = field432[var1];
                    field432[var1] = field432[var1 + 1];
                    field432[var1 + 1] = var3;
                    int var4 = field301[var1];
                    field301[var1] = field301[var1 + 1];
                    field301[var1 + 1] = var4;
                    int var5 = field428[var1];
                    field428[var1] = field428[var1 + 1];
                    field428[var1 + 1] = var5;
                    int var6 = field404[var1];
                    field404[var1] = field404[var1 + 1];
                    field404[var1 + 1] = var6;
                    int var7 = field451[var1];
                    field451[var1] = field451[var1 + 1];
                    field451[var1 + 1] = var7;
                    if (field458 != -1) {
                        if (field458 == var1) {
                            field458 = var1 + 1;
                        } else if (field458 == var1 + 1) {
                            field458 = var1;
                        }
                    }
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("aj.cf(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method583(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method571(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("client.ct(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method571(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field426 || field427 >= 500) {
            return;
        }
        field432[field427] = arg0;
        field567[field427] = arg1;
        field301[field427] = arg2;
        field451[field427] = arg3;
        field428[field427] = arg4;
        field404[field427] = arg5;
        if (arg6) {
            field458 = field427;
        }
        field427++;
    }

    @ObfuscatedName("ew.co(I)I")
    public static final int method2388() {
        if (field427 <= 0) {
            return -1;
        } else if (field436 && class106.field1711[81] && field458 != -1) {
            return field458;
        } else {
            return field427 - 1;
        }
    }

    @ObfuscatedName("ao.cl(I)Z")
    public static final boolean method753() {
        if (field427 <= 0) {
            return false;
        } else {
            return field436 && class106.field1711[81] && field458 != -1;
        }
    }

    @ObfuscatedName("q.cn(I)V")
    public static void method198() {
        for (int var0 = 0; var0 < field427; var0++) {
            int var1 = field301[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field427 - 1) {
                    for (int var3 = var0; var3 < field427 - 1; var3++) {
                        field432[var3] = field432[var3 + 1];
                        field567[var3] = field567[var3 + 1];
                        field301[var3] = field301[var3 + 1];
                        field451[var3] = field451[var3 + 1];
                        field428[var3] = field428[var3 + 1];
                        field404[var3] = field404[var3 + 1];
                    }
                }
                field427--;
            }
        }
    }

    @ObfuscatedName("gu.ca(IB)Ljava/lang/String;")
    public static String method3435(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field567[arg0].length() > 0) {
            return field432[arg0] + class174.field2602 + field567[arg0];
        } else {
            return field432[arg0];
        }
    }

    @ObfuscatedName("n.ci(Lu;IIII)V")
    public static final void method224(class24 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field685 == arg0 || field427 >= 400) {
            return;
        }
        String var9;
        if (arg0.field270 == 0) {
            String var4 = arg0.field250[0] + arg0.field267 + arg0.field250[1];
            int var5 = arg0.field255;
            int var6 = Statics.field685.field255;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class38.method3030(16711680);
            } else if (var7 < -6) {
                var8 = class38.method3030(16723968);
            } else if (var7 < -3) {
                var8 = class38.method3030(16740352);
            } else if (var7 < 0) {
                var8 = class38.method3030(16756736);
            } else if (var7 > 9) {
                var8 = class38.method3030(65280);
            } else if (var7 > 6) {
                var8 = class38.method3030(4259584);
            } else if (var7 > 3) {
                var8 = class38.method3030(8453888);
            } else if (var7 > 0) {
                var8 = class38.method3030(12648192);
            } else {
                var8 = class38.method3030(16776960);
            }
            var9 = var4 + var8 + " " + class38.field779 + class174.field2514 + arg0.field255 + class38.field777 + arg0.field250[2];
        } else {
            var9 = arg0.field250[0] + arg0.field267 + arg0.field250[1] + " " + class38.field779 + class174.field2517 + arg0.field270 + class38.field777 + arg0.field250[2];
        }
        if (field441 == 1) {
            method583(class174.field2508, field337 + " " + class38.field776 + " " + class38.method3030(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field443) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field414[var10] != null) {
                    short var11 = 0;
                    if (field414[var10].equalsIgnoreCase(class174.field2510)) {
                        if (field313 == class41.field811) {
                            continue;
                        }
                        if (field313 == class41.field807 || field313 == class41.field810 && arg0.field255 > Statics.field685.field255) {
                            var11 = 2000;
                        }
                        if (Statics.field685.field265 != 0 && arg0.field265 != 0) {
                            if (Statics.field685.field265 == arg0.field265) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field415[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field323[var10] + var11;
                    method583(field414[var10], class38.method3030(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2 & 0x8) == 8) {
            method583(field446, field447 + " " + class38.field776 + " " + class38.method3030(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field427; var14++) {
            if (field301[var14] == 23) {
                field567[var14] = class38.method3030(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("fr.cv(IIIIIIIII)V")
    public static final void method2951(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class170.method1498(arg0)) {
            Statics.field806 = null;
            method2390(Statics.field2329[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field806 != null) {
                method2390(Statics.field806, -1412584499, arg1, arg2, arg3, arg4, Statics.field956, Statics.field2876, arg7);
                Statics.field806 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field493[var8] = true;
            }
        } else {
            field493[arg7] = true;
        }
    }

    @ObfuscatedName("eh.cq([Lfh;IIIIIIIII)V")
    public static final void method2390(class170[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class220.method3809(arg2, arg3, arg4, arg5);
        class85.method1579();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class170 var10 = arg0[var9];
            if (var10 != null && (var10.field2220 == arg1 || arg1 == -1412584499 && field461 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field470[field491] = var10.field2229 + arg6;
                    field372[field491] = var10.field2300 + arg7;
                    field498[field491] = var10.field2216;
                    field499[field491] = var10.field2217;
                    var11 = ++field491 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2215 = var11;
                var10.field2333 = field489;
                if (!var10.field2200 || !method199(var10)) {
                    if (var10.field2205 > 0) {
                        int var12 = var10.field2205;
                        if (var12 == 324) {
                            if (field364 == -1) {
                                field364 = var10.field2236;
                                field559 = var10.field2237;
                            }
                            if (field561.field2167) {
                                var10.field2236 = field364;
                            } else {
                                var10.field2236 = field559;
                            }
                        } else if (var12 == 325) {
                            if (field364 == -1) {
                                field364 = var10.field2236;
                                field559 = var10.field2237;
                            }
                            if (field561.field2167) {
                                var10.field2236 = field559;
                            } else {
                                var10.field2236 = field364;
                            }
                        } else if (var12 == 327) {
                            var10.field2305 = 150;
                            var10.field2277 = (int) (Math.sin((double) field489 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2244 = 5;
                            var10.field2332 = 0;
                        } else if (var12 == 328) {
                            var10.field2305 = 150;
                            var10.field2277 = (int) (Math.sin((double) field489 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2244 = 5;
                            var10.field2332 = 1;
                        }
                    }
                    int var13 = var10.field2229 + arg6;
                    int var14 = var10.field2300 + arg7;
                    int var15 = var10.field2222;
                    if (field461 == var10) {
                        if (arg1 != -1412584499 && !var10.field2279) {
                            Statics.field806 = arg0;
                            Statics.field956 = arg6;
                            Statics.field2876 = arg7;
                            continue;
                        }
                        if (field472 && field466) {
                            int var16 = class116.field1787;
                            int var17 = class116.field1783 * -667823397;
                            int var18 = var16 - field463;
                            int var19 = var17 - field464;
                            if (var18 < field501) {
                                var18 = field501;
                            }
                            if (var10.field2216 + var18 > field501 + field328.field2216) {
                                var18 = field501 + field328.field2216 - var10.field2216;
                            }
                            if (var19 < field497) {
                                var19 = field497;
                            }
                            if (var10.field2217 + var19 > field497 + field328.field2217) {
                                var19 = field497 + field328.field2217 - var10.field2217;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2279) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2203 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2203 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2216 + var13;
                        int var27 = var10.field2217 + var14;
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
                        int var30 = var10.field2216 + var13;
                        int var31 = var10.field2217 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2200 || var20 < var22 && var21 < var23) {
                        if (var10.field2205 != 0) {
                            if (var10.field2205 == 1336) {
                                if (field303) {
                                    var14 += 15;
                                    Statics.field940.method3709("Fps:" + field1757, var10.field2216 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field569) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field569) {
                                        var34 = 16711680;
                                    }
                                    Statics.field940.method3709("Mem:" + var33 + "k", var10.field2216 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2205 == 1337) {
                                field437 = var13;
                                field438 = var14;
                                int var37 = var10.field2216;
                                int var38 = var10.field2217;
                                field392++;
                                method606(class16.field177);
                                boolean var39 = false;
                                if (field375 >= 0) {
                                    int var40 = class46.field913;
                                    int[] var41 = class46.field921;
                                    for (int var42 = 0; var42 < var40; var42++) {
                                        if (field375 == var41[var42]) {
                                            var39 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var39) {
                                    method606(class16.field172);
                                }
                                method3396(true);
                                method606(var39 ? class16.field175 : class16.field173);
                                method3396(false);
                                method266();
                                method265();
                                method840(var13, var14, var37, var38, true);
                                int var43 = field550;
                                int var44 = field291;
                                int var45 = field552;
                                int var46 = field553;
                                class220.method3809(var43, var44, var43 + var45, var44 + var46);
                                class85.method1579();
                                if (!field565) {
                                    int var47 = field371;
                                    if (field380 / 256 > var47) {
                                        var47 = field380 / 256;
                                    }
                                    if (field537[4] && field539[4] + 128 > var47) {
                                        var47 = field539[4] + 128;
                                    }
                                    int var48 = field468 + field352 & 0x7FF;
                                    int var49 = Statics.field2113;
                                    int var50 = method754(Statics.field685.field610, Statics.field685.field609, Statics.field967) - field450;
                                    int var51 = Statics.field60;
                                    int var52 = var47 * 3 + 600;
                                    int var53 = 2048 - var47 & 0x7FF;
                                    int var54 = 2048 - var48 & 0x7FF;
                                    int var55 = 0;
                                    int var56 = 0;
                                    int var57 = var52;
                                    if (var53 != 0) {
                                        int var58 = class85.field1460[var53];
                                        int var59 = class85.field1461[var53];
                                        int var60 = var56 * var59 - var52 * var58 >> 16;
                                        var57 = var56 * var58 + var52 * var59 >> 16;
                                        var56 = var60;
                                    }
                                    if (var54 != 0) {
                                        int var61 = class85.field1460[var54];
                                        int var62 = class85.field1461[var54];
                                        int var63 = var55 * var62 + var57 * var61 >> 16;
                                        var57 = var57 * var62 - var55 * var61 >> 16;
                                        var55 = var63;
                                    }
                                    Statics.field2896 = var49 - var55;
                                    Statics.field277 = var50 - var56;
                                    Statics.field741 = var51 - var57;
                                    Statics.field110 = var47;
                                    Statics.field2731 = var48;
                                }
                                int var76;
                                if (field565) {
                                    var76 = method189();
                                } else {
                                    int var64;
                                    if (Statics.field2073.field687) {
                                        var64 = Statics.field967;
                                    } else {
                                        label1085: {
                                            int var65 = 3;
                                            if (Statics.field110 < 310) {
                                                int var66 = Statics.field2896 >> 7;
                                                int var67 = Statics.field741 >> 7;
                                                int var68 = Statics.field685.field610 >> 7;
                                                int var69 = Statics.field685.field609 >> 7;
                                                if (var66 < 0 || var67 < 0 || var66 >= 104 || var67 >= 104) {
                                                    var64 = Statics.field967;
                                                    break label1085;
                                                }
                                                if ((class11.field104[Statics.field967][var66][var67] & 0x4) != 0) {
                                                    var65 = Statics.field967;
                                                }
                                                int var70;
                                                if (var68 > var66) {
                                                    var70 = var68 - var66;
                                                } else {
                                                    var70 = var66 - var68;
                                                }
                                                int var71;
                                                if (var69 > var67) {
                                                    var71 = var69 - var67;
                                                } else {
                                                    var71 = var67 - var69;
                                                }
                                                if (var70 > var71) {
                                                    int var72 = var71 * 65536 / var70;
                                                    int var73 = 32768;
                                                    while (var66 != var68) {
                                                        if (var66 < var68) {
                                                            var66++;
                                                        } else if (var66 > var68) {
                                                            var66--;
                                                        }
                                                        if ((class11.field104[Statics.field967][var66][var67] & 0x4) != 0) {
                                                            var65 = Statics.field967;
                                                        }
                                                        var73 += var72;
                                                        if (var73 >= 65536) {
                                                            var73 -= 65536;
                                                            if (var67 < var69) {
                                                                var67++;
                                                            } else if (var67 > var69) {
                                                                var67--;
                                                            }
                                                            if ((class11.field104[Statics.field967][var66][var67] & 0x4) != 0) {
                                                                var65 = Statics.field967;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int var74 = var70 * 65536 / var71;
                                                    int var75 = 32768;
                                                    while (var67 != var69) {
                                                        if (var67 < var69) {
                                                            var67++;
                                                        } else if (var67 > var69) {
                                                            var67--;
                                                        }
                                                        if ((class11.field104[Statics.field967][var66][var67] & 0x4) != 0) {
                                                            var65 = Statics.field967;
                                                        }
                                                        var75 += var74;
                                                        if (var75 >= 65536) {
                                                            var75 -= 65536;
                                                            if (var66 < var68) {
                                                                var66++;
                                                            } else if (var66 > var68) {
                                                                var66--;
                                                            }
                                                            if ((class11.field104[Statics.field967][var66][var67] & 0x4) != 0) {
                                                                var65 = Statics.field967;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (Statics.field685.field610 >= 0 && Statics.field685.field609 >= 0 && Statics.field685.field610 < 13312 && Statics.field685.field609 < 13312) {
                                                if ((class11.field104[Statics.field967][Statics.field685.field610 >> 7][Statics.field685.field609 >> 7] & 0x4) != 0) {
                                                    var65 = Statics.field967;
                                                }
                                                var64 = var65;
                                            } else {
                                                var64 = Statics.field967;
                                            }
                                        }
                                    }
                                    var76 = var64;
                                }
                                int var77 = Statics.field2896;
                                int var78 = Statics.field277;
                                int var79 = Statics.field741;
                                int var80 = Statics.field110;
                                int var81 = Statics.field2731;
                                for (int var82 = 0; var82 < 5; var82++) {
                                    if (field537[var82]) {
                                        int var83 = (int) (Math.random() * (double) (field538[var82] * 2 + 1) - (double) field538[var82] + Math.sin((double) field540[var82] / 100.0D * (double) field541[var82]) * (double) field539[var82]);
                                        if (var82 == 0) {
                                            Statics.field2896 += var83;
                                        }
                                        if (var82 == 1) {
                                            Statics.field277 += var83;
                                        }
                                        if (var82 == 2) {
                                            Statics.field741 += var83;
                                        }
                                        if (var82 == 3) {
                                            Statics.field2731 = Statics.field2731 + var83 & 0x7FF;
                                        }
                                        if (var82 == 4) {
                                            Statics.field110 += var83;
                                            if (Statics.field110 < 128) {
                                                Statics.field110 = 128;
                                            }
                                            if (Statics.field110 > 383) {
                                                Statics.field110 = 383;
                                            }
                                        }
                                    }
                                }
                                int var84 = class116.field1787;
                                int var85 = class116.field1783 * -667823397;
                                if (class116.field1793 != 0) {
                                    var84 = class116.field1782;
                                    var85 = class116.field1781;
                                }
                                if (var84 >= var43 && var84 < var43 + var45 && var85 >= var44 && var85 < var44 + var46) {
                                    class83.field1416 = true;
                                    class83.field1426 = 0;
                                    class83.field1417 = var84 - var43;
                                    class83.field1421 = var85 - var44;
                                } else {
                                    class83.field1416 = false;
                                    class83.field1426 = 0;
                                }
                                method918();
                                class220.method3815(var43, var44, var45, var46, 0);
                                method918();
                                int var86 = class85.field1446;
                                class85.field1446 = field554;
                                Statics.field2110.method1808(Statics.field2896, Statics.field277, Statics.field741, Statics.field110, Statics.field2731, var76);
                                class85.field1446 = var86;
                                method918();
                                Statics.field2110.method1661();
                                method113(var43, var44, var45, var46);
                                if (field285 == 2) {
                                    method1485((field308 - Statics.field19 << 7) + field311, (field309 - Statics.field341 << 7) + field312, field310 * 2);
                                    if (field439 > -1 && field489 % 20 < 10) {
                                        Statics.field2874[0].method3937(field439 + var43 - 12, field284 + var44 - 28);
                                    }
                                }
                                ((class75) Statics.field1457).method1391(field361);
                                method2402(var43, var44, var45, var46);
                                Statics.field2896 = var77;
                                Statics.field277 = var78;
                                Statics.field741 = var79;
                                Statics.field110 = var80;
                                Statics.field2731 = var81;
                                if (field296 && class186.method173(true, false) == 0) {
                                    field296 = false;
                                }
                                if (field296) {
                                    class220.method3815(var43, var44, var45, var46, 0);
                                    method3121(class174.field2370, false);
                                }
                                field493[var10.field2215] = true;
                                class220.method3809(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2205 == 1338) {
                                method817(var10, var13, var14, var11);
                                class220.method3809(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2205 == 1339) {
                                class165 var87 = var10.method3052(false);
                                if (var87 != null) {
                                    if (field524 < 3) {
                                        Statics.field1758.method3948(var13, var14, var87.field2152, var87.field2147, 25, 25, field468, 256, var87.field2155, var87.field2148);
                                    } else {
                                        class220.method3828(var13, var14, 0, var87.field2155, var87.field2148);
                                    }
                                }
                                class220.method3809(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2203 == 0) {
                            if (!var10.field2200 && method199(var10) && Statics.field3214 != var10) {
                                continue;
                            }
                            if (!var10.field2200) {
                                if (var10.field2223 > var10.field2225 - var10.field2217) {
                                    var10.field2223 = var10.field2225 - var10.field2217;
                                }
                                if (var10.field2223 < 0) {
                                    var10.field2223 = 0;
                                }
                            }
                            method2390(arg0, var10.field2201, var20, var21, var22, var23, var13 - var10.field2265, var14 - var10.field2223, var11);
                            if (var10.field2312 != null) {
                                method2390(var10.field2312, var10.field2201, var20, var21, var22, var23, var13 - var10.field2265, var14 - var10.field2223, var11);
                            }
                            class18 var88 = (class18) field449.method2259((long) var10.field2201);
                            if (var88 != null) {
                                method2951(var88.field195, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class220.method3809(arg2, arg3, arg4, arg5);
                            class85.method1579();
                        }
                        if (field502 || field495[var11] || field500 > 1) {
                            if (var10.field2203 == 0 && !var10.field2200 && var10.field2225 > var10.field2217) {
                                method768(var10.field2216 + var13, var14, var10.field2223, var10.field2217, var10.field2225);
                            }
                            if (var10.field2203 != 1) {
                                if (var10.field2203 == 2) {
                                    int var89 = 0;
                                    for (int var90 = 0; var90 < var10.field2213; var90++) {
                                        for (int var91 = 0; var91 < var10.field2212; var91++) {
                                            int var92 = (var10.field2191 + 32) * var91 + var13;
                                            int var93 = (var10.field2268 + 32) * var90 + var14;
                                            if (var89 < 20) {
                                                var92 += var10.field2269[var89];
                                                var93 += var10.field2270[var89];
                                            }
                                            if (var10.field2284[var89] > 0) {
                                                boolean var94 = false;
                                                boolean var95 = false;
                                                int var96 = var10.field2284[var89] - 1;
                                                if (var92 + 32 > arg2 && var92 < arg4 && var93 + 32 > arg3 && var93 < arg5 || Statics.field2029 == var10 && field387 == var89) {
                                                    class225 var97;
                                                    if (field441 == 1 && Statics.field62 == var89 && Statics.field1187 == var10.field2201) {
                                                        var97 = class199.method43(var96, var10.field2320[var89], 2, 0, 2, false);
                                                    } else {
                                                        var97 = class199.method43(var96, var10.field2320[var89], 1, 3153952, 2, false);
                                                    }
                                                    if (var97 == null) {
                                                        method1858(var10);
                                                    } else if (Statics.field2029 == var10 && field387 == var89) {
                                                        int var98 = class116.field1787 - field402;
                                                        int var99 = class116.field1783 * -667823397 - field321;
                                                        if (var98 < 5 && var98 > -5) {
                                                            var98 = 0;
                                                        }
                                                        if (var99 < 5 && var99 > -5) {
                                                            var99 = 0;
                                                        }
                                                        if (field406 < 5) {
                                                            var98 = 0;
                                                            var99 = 0;
                                                        }
                                                        var97.method3943(var92 + var98, var93 + var99, 128);
                                                        if (arg1 != -1) {
                                                            class170 var100 = arg0[arg1 & 0xFFFF];
                                                            if (var93 + var99 < class220.field3189 && var100.field2223 > 0) {
                                                                int var101 = field361 * (class220.field3189 - var93 - var99) / 3;
                                                                if (var101 > field361 * 10) {
                                                                    var101 = field361 * 10;
                                                                }
                                                                if (var101 > var100.field2223) {
                                                                    var101 = var100.field2223;
                                                                }
                                                                var100.field2223 -= var101;
                                                                field321 += var101;
                                                                method1858(var100);
                                                            }
                                                            if (var93 + var99 + 32 > class220.field3190 && var100.field2223 < var100.field2225 - var100.field2217) {
                                                                int var102 = field361 * (var93 + var99 + 32 - class220.field3190) / 3;
                                                                if (var102 > field361 * 10) {
                                                                    var102 = field361 * 10;
                                                                }
                                                                if (var102 > var100.field2225 - var100.field2217 - var100.field2223) {
                                                                    var102 = var100.field2225 - var100.field2217 - var100.field2223;
                                                                }
                                                                var100.field2223 += var102;
                                                                field321 -= var102;
                                                                method1858(var100);
                                                            }
                                                        }
                                                    } else if (Statics.field598 == var10 && field400 == var89) {
                                                        var97.method3943(var92, var93, 128);
                                                    } else {
                                                        var97.method3937(var92, var93);
                                                    }
                                                }
                                            } else if (var10.field2271 != null && var89 < 20) {
                                                class225 var103 = var10.method3049(var89);
                                                if (var103 != null) {
                                                    var103.method3937(var92, var93);
                                                } else if (class170.field2209) {
                                                    method1858(var10);
                                                }
                                            }
                                            var89++;
                                        }
                                    }
                                } else if (var10.field2203 == 3) {
                                    int var104;
                                    if (method2404(var10)) {
                                        var104 = var10.field2227;
                                        if (Statics.field3214 == var10 && var10.field2276 != 0) {
                                            var104 = var10.field2276;
                                        }
                                    } else {
                                        var104 = var10.field2226;
                                        if (Statics.field3214 == var10 && var10.field2228 != 0) {
                                            var104 = var10.field2228;
                                        }
                                    }
                                    if (var10.field2230) {
                                        switch(var10.field2335.field3205) {
                                            case 1:
                                                class220.method3816(var13, var14, var10.field2216, var10.field2217, var10.field2226, var10.field2227, 256 - (var10.field2222 & 0xFF), 256 - (var10.field2233 & 0xFF));
                                                break;
                                            case 2:
                                                class220.method3817(var13, var14, var10.field2216, var10.field2217, var10.field2226, var10.field2227, 256 - (var10.field2222 & 0xFF), 256 - (var10.field2233 & 0xFF));
                                                break;
                                            case 3:
                                                class220.method3818(var13, var14, var10.field2216, var10.field2217, var10.field2226, var10.field2227, 256 - (var10.field2222 & 0xFF), 256 - (var10.field2233 & 0xFF));
                                                break;
                                            case 4:
                                                class220.method3842(var13, var14, var10.field2216, var10.field2217, var10.field2226, var10.field2227, 256 - (var10.field2222 & 0xFF), 256 - (var10.field2233 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class220.method3815(var13, var14, var10.field2216, var10.field2217, var104);
                                                } else {
                                                    class220.method3814(var13, var14, var10.field2216, var10.field2217, var104, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class220.method3821(var13, var14, var10.field2216, var10.field2217, var104);
                                    } else {
                                        class220.method3822(var13, var14, var10.field2216, var10.field2217, var104, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2203 == 4) {
                                    class209 var105 = var10.method3056();
                                    if (var105 != null) {
                                        String var106 = var10.field2261;
                                        int var107;
                                        if (method2404(var10)) {
                                            var107 = var10.field2227;
                                            if (Statics.field3214 == var10 && var10.field2276 != 0) {
                                                var107 = var10.field2276;
                                            }
                                            if (var10.field2262.length() > 0) {
                                                var106 = var10.field2262;
                                            }
                                        } else {
                                            var107 = var10.field2226;
                                            if (Statics.field3214 == var10 && var10.field2228 != 0) {
                                                var107 = var10.field2228;
                                            }
                                        }
                                        if (var10.field2200 && var10.field2202 != -1) {
                                            class199 var108 = class199.method751(var10.field2202);
                                            var106 = var108.field2963;
                                            if (var106 == null) {
                                                var106 = "null";
                                            }
                                            if ((var108.field2974 == 1 || var10.field2322 != 1) && var10.field2322 != -1) {
                                                var106 = class38.method3030(16748608) + var106 + class38.field783 + " " + 'x' + method1840(var10.field2322);
                                            }
                                        }
                                        if (field452 == var10) {
                                            class174 var10000 = (class174) null;
                                            var106 = class174.field2516;
                                            var107 = var10.field2226;
                                        }
                                        if (!var10.field2200) {
                                            var106 = method12(var106, var10);
                                        }
                                        var105.method3711(var106, var13, var14, var10.field2216, var10.field2217, var107, var10.field2266 ? 0 : -1, var10.field2264, var10.field2328, var10.field2263);
                                    } else if (class170.field2209) {
                                        method1858(var10);
                                    }
                                } else if (var10.field2203 == 5) {
                                    if (var10.field2200) {
                                        class225 var110;
                                        if (var10.field2202 == -1) {
                                            var110 = var10.method3058(false);
                                        } else {
                                            var110 = class199.method43(var10.field2202, var10.field2322, var10.field2240, var10.field2241, var10.field2288, false);
                                        }
                                        if (var110 != null) {
                                            int var111 = var110.field3222;
                                            int var112 = var110.field3223;
                                            if (var10.field2239) {
                                                class220.method3839(var13, var14, var10.field2216 + var13, var10.field2217 + var14);
                                                int var113 = (var10.field2216 + (var111 - 1)) / var111;
                                                int var114 = (var10.field2217 + (var112 - 1)) / var112;
                                                for (int var115 = 0; var115 < var113; var115++) {
                                                    for (int var116 = 0; var116 < var114; var116++) {
                                                        if (var10.field2210 != 0) {
                                                            var110.method4021(var111 / 2 + var111 * var115 + var13, var112 / 2 + var112 * var116 + var14, var10.field2210, 4096);
                                                        } else if (var15 == 0) {
                                                            var110.method3937(var111 * var115 + var13, var112 * var116 + var14);
                                                        } else {
                                                            var110.method3943(var111 * var115 + var13, var112 * var116 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class220.method3809(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var117 = var10.field2216 * 4096 / var111;
                                                if (var10.field2210 != 0) {
                                                    var110.method4021(var10.field2216 / 2 + var13, var10.field2217 / 2 + var14, var10.field2210, var117);
                                                } else if (var15 != 0) {
                                                    var110.method3945(var13, var14, var10.field2216, var10.field2217, 256 - (var15 & 0xFF));
                                                } else if (var10.field2216 == var111 && var10.field2217 == var112) {
                                                    var110.method3937(var13, var14);
                                                } else {
                                                    var110.method3979(var13, var14, var10.field2216, var10.field2217);
                                                }
                                            }
                                        } else if (class170.field2209) {
                                            method1858(var10);
                                        }
                                    } else {
                                        class225 var109 = var10.method3058(method2404(var10));
                                        if (var109 != null) {
                                            var109.method3937(var13, var14);
                                        } else if (class170.field2209) {
                                            method1858(var10);
                                        }
                                    }
                                } else if (var10.field2203 == 6) {
                                    boolean var118 = method2404(var10);
                                    int var119;
                                    if (var118) {
                                        var119 = var10.field2249;
                                    } else {
                                        var119 = var10.field2248;
                                    }
                                    class83 var120 = null;
                                    int var121 = 0;
                                    if (var10.field2202 != -1) {
                                        class199 var122 = class199.method751(var10.field2202);
                                        if (var122 != null) {
                                            class199 var123 = var122.method3492(var10.field2322);
                                            var120 = var123.method3491(1);
                                            if (var120 == null) {
                                                method1858(var10);
                                            } else {
                                                var120.method1505();
                                                var121 = var120.field1548 / 2;
                                            }
                                        }
                                    } else if (var10.field2244 == 5) {
                                        if (var10.field2332 == 0) {
                                            var120 = field561.method3021((class202) null, -1, (class202) null, -1);
                                        } else {
                                            var120 = Statics.field685.method241();
                                        }
                                    } else if (var119 == -1) {
                                        var120 = var10.method3063((class202) null, -1, var118, Statics.field685.field246);
                                        if (var120 == null && class170.field2209) {
                                            method1858(var10);
                                        }
                                    } else {
                                        class202 var124 = class202.method17(var119);
                                        var120 = var10.method3063(var124, var10.field2192, var118, Statics.field685.field246);
                                        if (var120 == null && class170.field2209) {
                                            method1858(var10);
                                        }
                                    }
                                    class85.method1582(var10.field2216 / 2 + var13, var10.field2217 / 2 + var14);
                                    int var125 = var10.field2255 * class85.field1460[var10.field2305] >> 16;
                                    int var126 = var10.field2255 * class85.field1461[var10.field2305] >> 16;
                                    if (var120 != null) {
                                        if (var10.field2200) {
                                            var120.method1505();
                                            if (var10.field2316) {
                                                var120.method1516(0, var10.field2277, var10.field2199, var10.field2305, var10.field2250, var10.field2251 + var121 + var125, var10.field2251 + var126, var10.field2255);
                                            } else {
                                                var120.method1558(0, var10.field2277, var10.field2199, var10.field2305, var10.field2250, var10.field2251 + var121 + var125, var10.field2251 + var126);
                                            }
                                        } else {
                                            var120.method1558(0, var10.field2277, 0, var10.field2305, 0, var125, var126);
                                        }
                                    }
                                    class85.method1617();
                                } else {
                                    if (var10.field2203 == 7) {
                                        class209 var127 = var10.method3056();
                                        if (var127 == null) {
                                            if (class170.field2209) {
                                                method1858(var10);
                                            }
                                            continue;
                                        }
                                        int var128 = 0;
                                        for (int var129 = 0; var129 < var10.field2213; var129++) {
                                            for (int var130 = 0; var130 < var10.field2212; var130++) {
                                                if (var10.field2284[var128] > 0) {
                                                    class199 var131 = class199.method751(var10.field2284[var128] - 1);
                                                    String var132;
                                                    if (var131.field2974 != 1 && var10.field2320[var128] == 1) {
                                                        var132 = class38.method3030(16748608) + var131.field2963 + class38.field783;
                                                    } else {
                                                        var132 = class38.method3030(16748608) + var131.field2963 + class38.field783 + " " + 'x' + method1840(var10.field2320[var128]);
                                                    }
                                                    int var133 = (var10.field2191 + 115) * var130 + var13;
                                                    int var134 = (var10.field2268 + 12) * var129 + var14;
                                                    if (var10.field2264 == 0) {
                                                        var127.method3701(var132, var133, var134, var10.field2226, var10.field2266 ? 0 : -1);
                                                    } else if (var10.field2264 == 1) {
                                                        var127.method3710(var132, var10.field2216 / 2 + var133, var134, var10.field2226, var10.field2266 ? 0 : -1);
                                                    } else {
                                                        var127.method3709(var132, var10.field2216 + var133 - 1, var134, var10.field2226, var10.field2266 ? 0 : -1);
                                                    }
                                                }
                                                var128++;
                                            }
                                        }
                                    }
                                    if (var10.field2203 == 8 && Statics.field1993 == var10 && field531 == field410) {
                                        int var135 = 0;
                                        int var136 = 0;
                                        class209 var137 = Statics.field940;
                                        String var138 = var10.field2261;
                                        String var139 = method12(var138, var10);
                                        while (var139.length() > 0) {
                                            int var140 = var139.indexOf(class38.field782);
                                            String var141;
                                            if (var140 == -1) {
                                                var141 = var139;
                                                var139 = "";
                                            } else {
                                                var141 = var139.substring(0, var140);
                                                var139 = var139.substring(var140 + 4);
                                            }
                                            int var142 = var137.method3727(var141);
                                            if (var142 > var135) {
                                                var135 = var142;
                                            }
                                            var136 += var137.field3118 + 1;
                                        }
                                        var135 += 6;
                                        var136 += 7;
                                        int var143 = var10.field2216 + var13 - 5 - var135;
                                        int var144 = var10.field2217 + var14 + 5;
                                        if (var143 < var13 + 5) {
                                            var143 = var13 + 5;
                                        }
                                        if (var135 + var143 > arg4) {
                                            var143 = arg4 - var135;
                                        }
                                        if (var136 + var144 > arg5) {
                                            var144 = arg5 - var136;
                                        }
                                        class220.method3815(var143, var144, var135, var136, 16777120);
                                        class220.method3821(var143, var144, var135, var136, 0);
                                        String var145 = var10.field2261;
                                        int var146 = var137.field3118 + var144 + 2;
                                        String var147 = method12(var145, var10);
                                        while (var147.length() > 0) {
                                            int var148 = var147.indexOf(class38.field782);
                                            String var149;
                                            if (var148 == -1) {
                                                var149 = var147;
                                                var147 = "";
                                            } else {
                                                var149 = var147.substring(0, var148);
                                                var147 = var147.substring(var148 + 4);
                                            }
                                            var137.method3701(var149, var143 + 3, var146, 0, -1);
                                            var146 += var137.field3118 + 1;
                                        }
                                    }
                                    if (var10.field2203 == 9) {
                                        if (var10.field2234 == 1) {
                                            int var150;
                                            int var151;
                                            int var152;
                                            int var153;
                                            if (var10.field2235) {
                                                var150 = var13;
                                                var151 = var10.field2217 + var14;
                                                var152 = var10.field2216 + var13;
                                                var153 = var14;
                                            } else {
                                                var150 = var13;
                                                var151 = var14;
                                                var152 = var10.field2216 + var13;
                                                var153 = var10.field2217 + var14;
                                            }
                                            class220.method3862(var150, var151, var152, var153, var10.field2226);
                                        } else {
                                            int var154 = var10.field2216 >= 0 ? var10.field2216 : -var10.field2216;
                                            int var155 = var10.field2217 >= 0 ? var10.field2217 : -var10.field2217;
                                            int var156 = var154;
                                            if (var154 < var155) {
                                                var156 = var155;
                                            }
                                            if (var156 != 0) {
                                                int var157 = (var10.field2216 << 16) / var156;
                                                int var158 = (var10.field2217 << 16) / var156;
                                                if (var158 <= var157) {
                                                    var157 = -var157;
                                                } else {
                                                    var158 = -var158;
                                                }
                                                int var159 = var10.field2234 * var158 >> 17;
                                                int var160 = var10.field2234 * var158 + 1 >> 17;
                                                int var161 = var10.field2234 * var157 >> 17;
                                                int var162 = var10.field2234 * var157 + 1 >> 17;
                                                int var163 = var13 + var159;
                                                int var164 = var13 - var160;
                                                int var165 = var10.field2216 + var13 - var160;
                                                int var166 = var10.field2216 + var13 + var159;
                                                int var167 = var14 + var161;
                                                int var168 = var14 - var162;
                                                int var169 = var10.field2217 + var14 - var162;
                                                int var170 = var10.field2217 + var14 + var161;
                                                class85.method1581(var163, var164, var165);
                                                class85.method1603(var167, var168, var169, var163, var164, var165, var10.field2226);
                                                class85.method1581(var163, var165, var166);
                                                class85.method1603(var167, var169, var170, var163, var165, var166, var10.field2226);
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

    @ObfuscatedName("e.cx(Ljava/lang/String;Lfh;B)Ljava/lang/String;")
    public static String method12(String arg0, class170 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method738(arg1, var2 - 1);
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
                if (Statics.field2105 != null) {
                    var8 = class208.method1897(Statics.field2105.field1653);
                    if (Statics.field2105.field1656 != null) {
                        var8 = (String) Statics.field2105.field1656;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("cq.ck(IS)Ljava/lang/String;")
    public static final String method1840(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class38.field781 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class38.method3030(65408) + var1.substring(0, var1.length() - 8) + class174.field2597 + " " + class38.field779 + var1 + class38.field777 + class38.field783;
        } else if (var1.length() > 6) {
            return " " + class38.method3030(16777215) + var1.substring(0, var1.length() - 4) + class174.field2521 + " " + class38.field779 + var1 + class38.field777 + class38.field783;
        } else {
            return " " + class38.method3030(16776960) + var1 + class38.field783;
        }
    }

    @ObfuscatedName("c.cm(ZI)V")
    public static final void method23(boolean arg0) {
        int var1 = field448;
        int var2 = Statics.field1559;
        int var3 = Statics.field2788;
        if (class170.method1498(var1)) {
            method2882(Statics.field2329[var1], -1, var2, var3, arg0);
        }
    }

    @ObfuscatedName("y.cz([Lfh;Lfh;ZI)V")
    public static void method61(class170[] arg0, class170 arg1, boolean arg2) {
        int var3 = arg1.field2224 == 0 ? arg1.field2216 : arg1.field2224;
        int var4 = arg1.field2225 == 0 ? arg1.field2217 : arg1.field2225;
        method2882(arg0, arg1.field2201, var3, var4, arg2);
        if (arg1.field2312 != null) {
            method2882(arg1.field2312, arg1.field2201, var3, var4, arg2);
        }
        class18 var5 = (class18) field449.method2259((long) arg1.field2201);
        if (var5 != null) {
            method2608(var5.field195, var3, var4, arg2);
        }
        if (arg1.field2205 == 1337) {
        }
    }

    @ObfuscatedName("ea.cu(IIIZS)V")
    public static final void method2608(int arg0, int arg1, int arg2, boolean arg3) {
        if (class170.method1498(arg0)) {
            method2882(Statics.field2329[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ec.cs([Lfh;IIIZI)V")
    public static void method2882(class170[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class170 var6 = arg0[var5];
            if (var6 != null && var6.field2220 == arg1) {
                method205(var6, arg2, arg3, arg4);
                method1982(var6, arg2, arg3);
                if (var6.field2265 > var6.field2224 - var6.field2216) {
                    var6.field2265 = var6.field2224 - var6.field2216;
                }
                if (var6.field2265 < 0) {
                    var6.field2265 = 0;
                }
                if (var6.field2223 > var6.field2225 - var6.field2217) {
                    var6.field2223 = var6.field2225 - var6.field2217;
                }
                if (var6.field2223 < 0) {
                    var6.field2223 = 0;
                }
                if (var6.field2203 == 0) {
                    method61(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("i.cr(Lfh;IIZI)V")
    public static void method205(class170 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2216;
        int var5 = arg0.field2217;
        if (arg0.field2319 == 0) {
            arg0.field2216 = arg0.field2212;
        } else if (arg0.field2319 == 1) {
            arg0.field2216 = arg1 - arg0.field2212;
        } else if (arg0.field2319 == 2) {
            arg0.field2216 = arg0.field2212 * arg1 >> 14;
        }
        if (arg0.field2323 == 0) {
            arg0.field2217 = arg0.field2213;
        } else if (arg0.field2323 == 1) {
            arg0.field2217 = arg2 - arg0.field2213;
        } else if (arg0.field2323 == 2) {
            arg0.field2217 = arg0.field2213 * arg2 >> 14;
        }
        if (arg0.field2319 == 4) {
            arg0.field2216 = arg0.field2218 * arg0.field2217 / arg0.field2219;
        }
        if (arg0.field2323 == 4) {
            arg0.field2217 = arg0.field2219 * arg0.field2216 / arg0.field2218;
        }
        if (field290 && arg0.field2203 == 0) {
            if (arg0.field2217 < 5 && arg0.field2216 < 5) {
                arg0.field2217 = 5;
                arg0.field2216 = 5;
            } else {
                if (arg0.field2217 <= 0) {
                    arg0.field2217 = 5;
                }
                if (arg0.field2216 <= 0) {
                    arg0.field2216 = 5;
                }
            }
        }
        if (arg0.field2205 == 1337) {
            field455 = arg0;
        }
        if (arg3 && arg0.field2310 != null && (arg0.field2216 != var4 || arg0.field2217 != var5)) {
            class19 var6 = new class19();
            var6.field214 = arg0;
            var6.field203 = arg0.field2310;
            field487.method2308(var6);
        }
    }

    @ObfuscatedName("db.cd(Lfh;III)V")
    public static void method1982(class170 arg0, int arg1, int arg2) {
        if (arg0.field2206 == 0) {
            arg0.field2229 = arg0.field2315;
        } else if (arg0.field2206 == 1) {
            arg0.field2229 = (arg1 - arg0.field2216) / 2 + arg0.field2315;
        } else if (arg0.field2206 == 2) {
            arg0.field2229 = arg1 - arg0.field2216 - arg0.field2315;
        } else if (arg0.field2206 == 3) {
            arg0.field2229 = arg0.field2315 * arg1 >> 14;
        } else if (arg0.field2206 == 4) {
            arg0.field2229 = (arg0.field2315 * arg1 >> 14) + (arg1 - arg0.field2216) / 2;
        } else {
            arg0.field2229 = arg1 - arg0.field2216 - (arg0.field2315 * arg1 >> 14);
        }
        if (arg0.field2207 == 0) {
            arg0.field2300 = arg0.field2211;
        } else if (arg0.field2207 == 1) {
            arg0.field2300 = (arg2 - arg0.field2217) / 2 + arg0.field2211;
        } else if (arg0.field2207 == 2) {
            arg0.field2300 = arg2 - arg0.field2217 - arg0.field2211;
        } else if (arg0.field2207 == 3) {
            arg0.field2300 = arg0.field2211 * arg2 >> 14;
        } else if (arg0.field2207 == 4) {
            arg0.field2300 = (arg0.field2211 * arg2 >> 14) + (arg2 - arg0.field2217) / 2;
        } else {
            arg0.field2300 = arg2 - arg0.field2217 - (arg0.field2211 * arg2 >> 14);
        }
        if (!field290 || arg0.field2203 != 0) {
            return;
        }
        if (arg0.field2229 < 0) {
            arg0.field2229 = 0;
        } else if (arg0.field2229 + arg0.field2216 > arg1) {
            arg0.field2229 = arg1 - arg0.field2216;
        }
        if (arg0.field2300 < 0) {
            arg0.field2300 = 0;
        } else if (arg0.field2300 + arg0.field2217 > arg2) {
            arg0.field2300 = arg2 - arg0.field2217;
        }
    }

    @ObfuscatedName("as.cw(IIIIII)V")
    public static final void method768(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field2682[0].method3895(arg0, arg1);
        Statics.field2682[1].method3895(arg0, arg1 + arg3 - 16);
        class220.method3815(arg0, arg1 + 16, 16, arg3 - 32, field365);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class220.method3815(arg0, arg1 + 16 + var6, 16, var5, field366);
        class220.method3825(arg0, arg1 + 16 + var6, var5, field368);
        class220.method3825(arg0 + 1, arg1 + 16 + var6, var5, field368);
        class220.method3823(arg0, arg1 + 16 + var6, 16, field368);
        class220.method3823(arg0, arg1 + 17 + var6, 16, field368);
        class220.method3825(arg0 + 15, arg1 + 16 + var6, var5, field484);
        class220.method3825(arg0 + 14, arg1 + 17 + var6, var5 - 1, field484);
        class220.method3823(arg0, arg1 + 15 + var6 + var5, 16, field484);
        class220.method3823(arg0 + 1, arg1 + 14 + var6 + var5, 15, field484);
    }

    @ObfuscatedName("eh.cy(Lfh;I)Z")
    public static final boolean method2404(class170 arg0) {
        if (arg0.field2314 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2314.length; var1++) {
            int var2 = method738(arg0, var1);
            int var3 = arg0.field2331[var1];
            if (arg0.field2314[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2314[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2314[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("aw.cg(Lfh;II)I")
    public static final int method738(class170 arg0, int arg1) {
        if (arg0.field2313 == null || arg1 >= arg0.field2313.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2313[arg1];
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
                    var7 = field546[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field508[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field424[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class170 var11 = Statics.method211(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class199.method751(var12).field2976 || field356)) {
                        for (int var13 = 0; var13 < var11.field2284.length; var13++) {
                            if (var12 + 1 == var11.field2284[var13]) {
                                var7 += var11.field2320[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class166.field2158[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class173.field2355[field508[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class166.field2158[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field685.field255;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class173.field2353[var14]) {
                            var7 += field508[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class170 var17 = Statics.method211(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class199.method751(var18).field2976 || field356)) {
                        for (int var19 = 0; var19 < var17.field2284.length; var19++) {
                            if (var18 + 1 == var17.field2284[var19]) {
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
                    int var20 = class166.field2158[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class166.method916(var22);
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
                    var7 = (Statics.field685.field610 >> 7) + Statics.field19;
                }
                if (var6 == 19) {
                    var7 = (Statics.field685.field609 >> 7) + Statics.field341;
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

    @ObfuscatedName("ee.cc([Lfh;IIIIIIII)V")
    public static final void method2890(class170[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class170 var9 = arg0[var8];
            if (var9 != null && (!var9.field2200 || var9.field2203 == 0 || var9.field2281 || method2885(var9) != 0 || field328 == var9 || var9.field2205 == 1338) && var9.field2220 == arg1 && (!var9.field2200 || !method199(var9))) {
                int var10 = var9.field2229 + arg6;
                int var11 = var9.field2300 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2203 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2203 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2216 + var10;
                    int var19 = var9.field2217 + var11;
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
                    int var22 = var9.field2216 + var10;
                    int var23 = var9.field2217 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field461 == var9) {
                    field469 = true;
                    field571 = var10;
                    field471 = var11;
                }
                if (!var9.field2200 || var12 < var14 && var13 < var15) {
                    int var24 = class116.field1787;
                    int var25 = class116.field1783 * -667823397;
                    if (class116.field1793 != 0) {
                        var24 = class116.field1782;
                        var25 = class116.field1781;
                    }
                    if (var9.field2205 == 1337) {
                        if (!field296 && !field426 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field441 == 0 && !field443) {
                                method583(class174.field2456, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class83.field1426; var28++) {
                                int var29 = class83.field1425[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field2110.method1729(Statics.field967, var30, var31, var29) >= 0) {
                                        class198 var34 = class198.method1865(var33);
                                        if (var34.field2943 != null) {
                                            var34 = var34.method3445();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field441 == 1) {
                                            method583(class174.field2508, field337 + " " + class38.field776 + " " + class38.method3030(65535) + var34.field2922, 1, var29, var30, var31);
                                        } else if (!field443) {
                                            String[] var35 = var34.field2929;
                                            if (field459) {
                                                var35 = method11(var35);
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
                                                        method583(var35[var36], class38.method3030(65535) + var34.field2922, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method583(class174.field2509, class38.method3030(65535) + var34.field2922, 1002, var34.field2935 << 14, var30, var31);
                                        } else if ((Statics.field2 & 0x4) == 4) {
                                            method583(field446, field447 + " " + class38.field776 + " " + class38.method3030(65535) + var34.field2922, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class36 var38 = field324[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field756.field3042 == 1 && (var38.field610 & 0x7F) == 64 && (var38.field609 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field325; var39++) {
                                                class36 var40 = field324[field326[var39]];
                                                if (var40 != null && var38 != var40 && var40.field756.field3042 == 1 && var38.field610 == var40.field610 && var38.field609 == var40.field609) {
                                                    Statics.method3648(var40.field756, field326[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class46.field913;
                                            int[] var42 = class46.field921;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class24 var44 = field408[var42[var43]];
                                                if (var44 != null && var38.field610 == var44.field610 && var38.field609 == var44.field609) {
                                                    method224(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        Statics.method3648(var38.field756, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class24 var45 = field408[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field610 & 0x7F) == 64 && (var45.field609 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field325; var46++) {
                                                class36 var47 = field324[field326[var46]];
                                                if (var47 != null && var47.field756.field3042 == 1 && var45.field610 == var47.field610 && var45.field609 == var47.field609) {
                                                    Statics.method3648(var47.field756, field326[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class46.field913;
                                            int[] var49 = class46.field921;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class24 var51 = field408[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field610 == var51.field610 && var45.field609 == var51.field609) {
                                                    method224(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field375 == var33) {
                                            var26 = var29;
                                        } else {
                                            method224(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class129 var52 = field418[Statics.field967][var30][var31];
                                        if (var52 != null) {
                                            for (class44 var53 = (class44) var52.method2314(); var53 != null; var53 = (class44) var52.method2316()) {
                                                class199 var54 = class199.method751(var53.field892);
                                                if (field441 == 1) {
                                                    method583(class174.field2508, field337 + " " + class38.field776 + " " + class38.method3030(16748608) + var54.field2963, 16, var53.field892, var30, var31);
                                                } else if (!field443) {
                                                    String[] var55 = var54.field2977;
                                                    if (field459) {
                                                        var55 = method11(var55);
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
                                                            method583(var55[var56], class38.method3030(16748608) + var54.field2963, var57, var53.field892, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method583(class174.field2395, class38.method3030(16748608) + var54.field2963, 20, var53.field892, var30, var31);
                                                        }
                                                    }
                                                    method583(class174.field2509, class38.method3030(16748608) + var54.field2963, 1004, var53.field892, var30, var31);
                                                } else if ((Statics.field2 & 0x1) == 1) {
                                                    method583(field446, field447 + " " + class38.field776 + " " + class38.method3030(16748608) + var54.field2963, 17, var53.field892, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class24 var60 = field408[field375];
                                method224(var60, field375, var58, var59);
                            }
                        }
                    } else if (var9.field2205 != 1338) {
                        if (!field426 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var75 = var24 - var10;
                            int var76 = var25 - var11;
                            if (var9.field2204 == 1) {
                                method583(var9.field2318, "", 24, 0, 0, var9.field2201);
                            }
                            if (var9.field2204 == 2 && !field443) {
                                String var77 = method223(var9);
                                if (var77 != null) {
                                    method583(var77, class38.method3030(65280) + var9.field2317, 25, 0, -1, var9.field2201);
                                }
                            }
                            if (var9.field2204 == 3) {
                                method583(class174.field2487, "", 26, 0, 0, var9.field2201);
                            }
                            if (var9.field2204 == 4) {
                                method583(var9.field2318, "", 28, 0, 0, var9.field2201);
                            }
                            if (var9.field2204 == 5) {
                                method583(var9.field2318, "", 29, 0, 0, var9.field2201);
                            }
                            if (var9.field2204 == 6 && field452 == null) {
                                method583(var9.field2318, "", 30, 0, -1, var9.field2201);
                            }
                            if (var9.field2203 == 2) {
                                int var78 = 0;
                                for (int var79 = 0; var79 < var9.field2217; var79++) {
                                    for (int var80 = 0; var80 < var9.field2216; var80++) {
                                        int var81 = (var9.field2191 + 32) * var80;
                                        int var82 = (var9.field2268 + 32) * var79;
                                        if (var78 < 20) {
                                            var81 += var9.field2269[var78];
                                            var82 += var9.field2270[var78];
                                        }
                                        if (var75 >= var81 && var76 >= var82 && var75 < var81 + 32 && var76 < var82 + 32) {
                                            field398 = var78;
                                            Statics.field24 = var9;
                                            if (var9.field2284[var78] > 0) {
                                                class199 var83 = class199.method751(var9.field2284[var78] - 1);
                                                if (field441 == 1 && class171.method810(method2885(var9))) {
                                                    if (Statics.field1187 != var9.field2201 || Statics.field62 != var78) {
                                                        method583(class174.field2508, field337 + " " + class38.field776 + " " + class38.method3030(16748608) + var83.field2963, 31, var83.field2961, var78, var9.field2201);
                                                    }
                                                } else if (!field443 || !class171.method810(method2885(var9))) {
                                                    String[] var84 = var83.field2995;
                                                    if (field459) {
                                                        var84 = method11(var84);
                                                    }
                                                    int var85 = var83.method3497();
                                                    if (class171.method810(method2885(var9))) {
                                                        for (int var86 = 4; var86 >= 3; var86--) {
                                                            boolean var87 = var85 == var86;
                                                            if (var84 != null && var84[var86] != null) {
                                                                byte var88;
                                                                if (var86 == 3) {
                                                                    var88 = 36;
                                                                } else {
                                                                    var88 = 37;
                                                                }
                                                                method571(var84[var86], class38.method3030(16748608) + var83.field2963, var88, var83.field2961, var78, var9.field2201, var87);
                                                            } else if (var86 == 4) {
                                                                method571(class174.field2362, class38.method3030(16748608) + var83.field2963, 37, var83.field2961, var78, var9.field2201, var87);
                                                            }
                                                        }
                                                    }
                                                    int var89 = method2885(var9);
                                                    boolean var90 = (var89 >> 31 & 0x1) != 0;
                                                    if (var90) {
                                                        method583(class174.field2508, class38.method3030(16748608) + var83.field2963, 38, var83.field2961, var78, var9.field2201);
                                                    }
                                                    class171 var10000 = (class171) null;
                                                    if (class171.method810(method2885(var9)) && var84 != null) {
                                                        for (int var91 = 2; var91 >= 0; var91--) {
                                                            boolean var92 = var85 == var91;
                                                            if (var84[var91] != null) {
                                                                byte var93 = 0;
                                                                if (var91 == 0) {
                                                                    var93 = 33;
                                                                }
                                                                if (var91 == 1) {
                                                                    var93 = 34;
                                                                }
                                                                if (var91 == 2) {
                                                                    var93 = 35;
                                                                }
                                                                method571(var84[var91], class38.method3030(16748608) + var83.field2963, var93, var83.field2961, var78, var9.field2201, var92);
                                                            }
                                                        }
                                                    }
                                                    String[] var94 = var9.field2272;
                                                    if (field459) {
                                                        var94 = method11(var94);
                                                    }
                                                    if (var94 != null) {
                                                        for (int var95 = 4; var95 >= 0; var95--) {
                                                            if (var94[var95] != null) {
                                                                byte var96 = 0;
                                                                if (var95 == 0) {
                                                                    var96 = 39;
                                                                }
                                                                if (var95 == 1) {
                                                                    var96 = 40;
                                                                }
                                                                if (var95 == 2) {
                                                                    var96 = 41;
                                                                }
                                                                if (var95 == 3) {
                                                                    var96 = 42;
                                                                }
                                                                if (var95 == 4) {
                                                                    var96 = 43;
                                                                }
                                                                method583(var94[var95], class38.method3030(16748608) + var83.field2963, var96, var83.field2961, var78, var9.field2201);
                                                            }
                                                        }
                                                    }
                                                    method583(class174.field2509, class38.method3030(16748608) + var83.field2963, 1005, var83.field2961, var78, var9.field2201);
                                                } else if ((Statics.field2 & 0x10) == 16) {
                                                    method583(field446, field447 + " " + class38.field776 + " " + class38.method3030(16748608) + var83.field2963, 32, var83.field2961, var78, var9.field2201);
                                                }
                                            }
                                        }
                                        var78++;
                                    }
                                }
                            }
                            if (var9.field2200) {
                                if (!field443) {
                                    for (int var97 = 9; var97 >= 5; var97--) {
                                        String var98;
                                        if (!class171.method1097(method2885(var9), var97) && var9.field2301 == null) {
                                            var98 = null;
                                        } else if (var9.field2311 == null || var9.field2311.length <= var97 || var9.field2311[var97] == null || var9.field2311[var97].trim().length() == 0) {
                                            var98 = null;
                                        } else {
                                            var98 = var9.field2311[var97];
                                        }
                                        if (var98 != null) {
                                            method583(var98, var9.field2274, 1007, var97 + 1, var9.field2278, var9.field2201);
                                        }
                                    }
                                    String var100 = method223(var9);
                                    if (var100 != null) {
                                        method583(var100, var9.field2274, 25, 0, var9.field2278, var9.field2201);
                                    }
                                    for (int var101 = 4; var101 >= 0; var101--) {
                                        String var102;
                                        if (!class171.method1097(method2885(var9), var101) && var9.field2301 == null) {
                                            var102 = null;
                                        } else if (var9.field2311 == null || var9.field2311.length <= var101 || var9.field2311[var101] == null || var9.field2311[var101].trim().length() == 0) {
                                            var102 = null;
                                        } else {
                                            var102 = var9.field2311[var101];
                                        }
                                        if (var102 != null) {
                                            method583(var102, var9.field2274, 57, var101 + 1, var9.field2278, var9.field2201);
                                        }
                                    }
                                    int var104 = method2885(var9);
                                    boolean var105 = (var104 & 0x1) != 0;
                                    if (var105) {
                                        method583(class174.field2548, "", 30, 0, var9.field2278, var9.field2201);
                                    }
                                } else if (class171.method244(method2885(var9)) && (Statics.field2 & 0x20) == 32) {
                                    method583(field446, field447 + " " + class38.field776 + " " + var9.field2274, 58, 0, var9.field2278, var9.field2201);
                                }
                            }
                        }
                        if (var9.field2203 == 0) {
                            if (!var9.field2200 && method199(var9) && Statics.field3214 != var9) {
                                continue;
                            }
                            method2890(arg0, var9.field2201, var12, var13, var14, var15, var10 - var9.field2265, var11 - var9.field2223);
                            if (var9.field2312 != null) {
                                method2890(var9.field2312, var9.field2201, var12, var13, var14, var15, var10 - var9.field2265, var11 - var9.field2223);
                            }
                            class18 var106 = (class18) field449.method2259((long) var9.field2201);
                            if (var106 != null) {
                                if (var106.field188 == 0 && class116.field1787 >= var12 && class116.field1783 * -667823397 >= var13 && class116.field1787 < var14 && class116.field1783 * -667823397 < var15 && !field426 && !field290) {
                                    for (class19 var107 = (class19) field487.method2315(); var107 != null; var107 = (class19) field487.method2332()) {
                                        if (var107.field200) {
                                            var107.method2298();
                                            var107.field214.field2326 = false;
                                        }
                                    }
                                    if (Statics.field2738 == 0) {
                                        field461 = null;
                                        field328 = null;
                                    }
                                    if (!field426) {
                                        method812();
                                    }
                                }
                                int var108 = var106.field195;
                                if (class170.method1498(var108)) {
                                    method2890(Statics.field2329[var108], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2200) {
                            if (var9.field2293) {
                                if (class116.field1787 >= var12 && class116.field1783 * -667823397 >= var13 && class116.field1787 < var14 && class116.field1783 * -667823397 < var15) {
                                    for (class19 var109 = (class19) field487.method2315(); var109 != null; var109 = (class19) field487.method2332()) {
                                        if (var109.field200) {
                                            var109.method2298();
                                            var109.field214.field2326 = false;
                                        }
                                    }
                                    if (Statics.field2738 == 0) {
                                        field461 = null;
                                        field328 = null;
                                    }
                                    if (!field426) {
                                        field432[0] = class174.field2468;
                                        field567[0] = "";
                                        field301[0] = 1006;
                                        field427 = 1;
                                    }
                                }
                            } else if (var9.field2334 && class116.field1787 >= var12 && class116.field1783 * -667823397 >= var13 && class116.field1787 < var14 && class116.field1783 * -667823397 < var15) {
                                for (class19 var110 = (class19) field487.method2315(); var110 != null; var110 = (class19) field487.method2332()) {
                                    if (var110.field200 && var110.field214.field2325 == var110.field203) {
                                        var110.method2298();
                                    }
                                }
                            }
                            boolean var111;
                            if (class116.field1787 >= var12 && class116.field1783 * -667823397 >= var13 && class116.field1787 < var14 && class116.field1783 * -667823397 < var15) {
                                var111 = true;
                            } else {
                                var111 = false;
                            }
                            boolean var112 = false;
                            if ((class116.field1786 == 1 || !Statics.field1832 && class116.field1786 == 4) && var111) {
                                var112 = true;
                            }
                            boolean var113 = false;
                            if ((class116.field1793 == 1 || !Statics.field1832 && class116.field1793 == 4) && class116.field1782 >= var12 && class116.field1781 >= var13 && class116.field1782 < var14 && class116.field1781 < var15) {
                                var113 = true;
                            }
                            if (var113) {
                                method2513(var9, class116.field1782 - var10, class116.field1781 - var11);
                            }
                            if (field461 != null && field461 != var9 && var111) {
                                int var114 = method2885(var9);
                                boolean var115 = (var114 >> 20 & 0x1) != 0;
                                if (var115) {
                                    field465 = var9;
                                }
                            }
                            if (field328 == var9) {
                                field466 = true;
                                field501 = var10;
                                field497 = var11;
                            }
                            if (var9.field2281) {
                                if (var111 && field486 != 0 && var9.field2325 != null) {
                                    class19 var116 = new class19();
                                    var116.field200 = true;
                                    var116.field214 = var9;
                                    var116.field211 = field486;
                                    var116.field203 = var9.field2325;
                                    field487.method2308(var116);
                                }
                                if (field461 != null || Statics.field2029 != null || field426) {
                                    var113 = false;
                                    var112 = false;
                                    var111 = false;
                                }
                                if (!var9.field2327 && var113) {
                                    var9.field2327 = true;
                                    if (var9.field2283 != null) {
                                        class19 var117 = new class19();
                                        var117.field200 = true;
                                        var117.field214 = var9;
                                        var117.field199 = class116.field1782 - var10;
                                        var117.field211 = class116.field1781 - var11;
                                        var117.field203 = var9.field2283;
                                        field487.method2308(var117);
                                    }
                                }
                                if (var9.field2327 && var112 && var9.field2260 != null) {
                                    class19 var118 = new class19();
                                    var118.field200 = true;
                                    var118.field214 = var9;
                                    var118.field199 = class116.field1787 - var10;
                                    var118.field211 = class116.field1783 * -667823397 - var11;
                                    var118.field203 = var9.field2260;
                                    field487.method2308(var118);
                                }
                                if (var9.field2327 && !var112) {
                                    var9.field2327 = false;
                                    if (var9.field2285 != null) {
                                        class19 var119 = new class19();
                                        var119.field200 = true;
                                        var119.field214 = var9;
                                        var119.field199 = class116.field1787 - var10;
                                        var119.field211 = class116.field1783 * -667823397 - var11;
                                        var119.field203 = var9.field2285;
                                        field551.method2308(var119);
                                    }
                                }
                                if (var112 && var9.field2286 != null) {
                                    class19 var120 = new class19();
                                    var120.field200 = true;
                                    var120.field214 = var9;
                                    var120.field199 = class116.field1787 - var10;
                                    var120.field211 = class116.field1783 * -667823397 - var11;
                                    var120.field203 = var9.field2286;
                                    field487.method2308(var120);
                                }
                                if (!var9.field2326 && var111) {
                                    var9.field2326 = true;
                                    if (var9.field2287 != null) {
                                        class19 var121 = new class19();
                                        var121.field200 = true;
                                        var121.field214 = var9;
                                        var121.field199 = class116.field1787 - var10;
                                        var121.field211 = class116.field1783 * -667823397 - var11;
                                        var121.field203 = var9.field2287;
                                        field487.method2308(var121);
                                    }
                                }
                                if (var9.field2326 && var111 && var9.field2214 != null) {
                                    class19 var122 = new class19();
                                    var122.field200 = true;
                                    var122.field214 = var9;
                                    var122.field199 = class116.field1787 - var10;
                                    var122.field211 = class116.field1783 * -667823397 - var11;
                                    var122.field203 = var9.field2214;
                                    field487.method2308(var122);
                                }
                                if (var9.field2326 && !var111) {
                                    var9.field2326 = false;
                                    if (var9.field2289 != null) {
                                        class19 var123 = new class19();
                                        var123.field200 = true;
                                        var123.field214 = var9;
                                        var123.field199 = class116.field1787 - var10;
                                        var123.field211 = class116.field1783 * -667823397 - var11;
                                        var123.field203 = var9.field2289;
                                        field551.method2308(var123);
                                    }
                                }
                                if (var9.field2294 != null) {
                                    class19 var124 = new class19();
                                    var124.field214 = var9;
                                    var124.field203 = var9.field2294;
                                    field411.method2308(var124);
                                }
                                if (var9.field2190 != null && field475 > var9.field2245) {
                                    if (var9.field2295 == null || field475 - var9.field2245 > 32) {
                                        class19 var129 = new class19();
                                        var129.field214 = var9;
                                        var129.field203 = var9.field2190;
                                        field487.method2308(var129);
                                    } else {
                                        label1040: for (int var125 = var9.field2245; var125 < field475; var125++) {
                                            int var126 = field474[var125 & 0x1F];
                                            for (int var127 = 0; var127 < var9.field2295.length; var127++) {
                                                if (var9.field2295[var127] == var126) {
                                                    class19 var128 = new class19();
                                                    var128.field214 = var9;
                                                    var128.field203 = var9.field2190;
                                                    field487.method2308(var128);
                                                    break label1040;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2245 = field475;
                                }
                                if (var9.field2296 != null && field522 > var9.field2330) {
                                    if (var9.field2297 == null || field522 - var9.field2330 > 32) {
                                        class19 var134 = new class19();
                                        var134.field214 = var9;
                                        var134.field203 = var9.field2296;
                                        field487.method2308(var134);
                                    } else {
                                        label1016: for (int var130 = var9.field2330; var130 < field522; var130++) {
                                            int var131 = field409[var130 & 0x1F];
                                            for (int var132 = 0; var132 < var9.field2297.length; var132++) {
                                                if (var9.field2297[var132] == var131) {
                                                    class19 var133 = new class19();
                                                    var133.field214 = var9;
                                                    var133.field203 = var9.field2296;
                                                    field487.method2308(var133);
                                                    break label1016;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2330 = field522;
                                }
                                if (var9.field2238 != null && field519 > var9.field2208) {
                                    if (var9.field2299 == null || field519 - var9.field2208 > 32) {
                                        class19 var139 = new class19();
                                        var139.field214 = var9;
                                        var139.field203 = var9.field2238;
                                        field487.method2308(var139);
                                    } else {
                                        label992: for (int var135 = var9.field2208; var135 < field519; var135++) {
                                            int var136 = field523[var135 & 0x1F];
                                            for (int var137 = 0; var137 < var9.field2299.length; var137++) {
                                                if (var9.field2299[var137] == var136) {
                                                    class19 var138 = new class19();
                                                    var138.field214 = var9;
                                                    var138.field203 = var9.field2238;
                                                    field487.method2308(var138);
                                                    break label992;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2208 = field519;
                                }
                                if (field381 > var9.field2298 && var9.field2303 != null) {
                                    class19 var140 = new class19();
                                    var140.field214 = var9;
                                    var140.field203 = var9.field2303;
                                    field487.method2308(var140);
                                }
                                if (field481 > var9.field2298 && var9.field2321 != null) {
                                    class19 var141 = new class19();
                                    var141.field214 = var9;
                                    var141.field203 = var9.field2321;
                                    field487.method2308(var141);
                                }
                                if (field563 > var9.field2298 && var9.field2306 != null) {
                                    class19 var142 = new class19();
                                    var142.field214 = var9;
                                    var142.field203 = var9.field2306;
                                    field487.method2308(var142);
                                }
                                if (field442 > var9.field2298 && var9.field2254 != null) {
                                    class19 var143 = new class19();
                                    var143.field214 = var9;
                                    var143.field203 = var9.field2254;
                                    field487.method2308(var143);
                                }
                                if (field488 > var9.field2298 && var9.field2196 != null) {
                                    class19 var144 = new class19();
                                    var144.field214 = var9;
                                    var144.field203 = var9.field2196;
                                    field487.method2308(var144);
                                }
                                if (field485 > var9.field2298 && var9.field2307 != null) {
                                    class19 var145 = new class19();
                                    var145.field214 = var9;
                                    var145.field203 = var9.field2307;
                                    field487.method2308(var145);
                                }
                                var9.field2298 = field293;
                                if (var9.field2304 != null) {
                                    for (int var146 = 0; var146 < field511; var146++) {
                                        class19 var147 = new class19();
                                        var147.field214 = var9;
                                        var147.field206 = field462[var146];
                                        var147.field207 = field513[var146];
                                        var147.field203 = var9.field2304;
                                        field487.method2308(var147);
                                    }
                                }
                            }
                        }
                        if (!var9.field2200 && field461 == null && Statics.field2029 == null && !field426) {
                            if ((var9.field2324 >= 0 || var9.field2228 != 0) && class116.field1787 >= var12 && class116.field1783 * -667823397 >= var13 && class116.field1787 < var14 && class116.field1783 * -667823397 < var15) {
                                if (var9.field2324 >= 0) {
                                    Statics.field3214 = arg0[var9.field2324];
                                } else {
                                    Statics.field3214 = var9;
                                }
                            }
                            if (var9.field2203 == 8 && class116.field1787 >= var12 && class116.field1783 * -667823397 >= var13 && class116.field1787 < var14 && class116.field1783 * -667823397 < var15) {
                                Statics.field1993 = var9;
                            }
                            if (var9.field2225 > var9.field2217) {
                                int var148 = var9.field2216 + var10;
                                int var149 = var9.field2217;
                                int var150 = var9.field2225;
                                int var151 = class116.field1787;
                                int var152 = class116.field1783 * -667823397;
                                if (field369) {
                                    field370 = 32;
                                } else {
                                    field370 = 0;
                                }
                                field369 = false;
                                if (class116.field1786 == 1 || !Statics.field1832 && class116.field1786 == 4) {
                                    if (var151 >= var148 && var151 < var148 + 16 && var152 >= var11 && var152 < var11 + 16) {
                                        var9.field2223 -= 4;
                                        method1858(var9);
                                    } else if (var151 >= var148 && var151 < var148 + 16 && var152 >= var11 + var149 - 16 && var152 < var11 + var149) {
                                        var9.field2223 += 4;
                                        method1858(var9);
                                    } else if (var151 >= var148 - field370 && var151 < field370 + var148 + 16 && var152 >= var11 + 16 && var152 < var11 + var149 - 16) {
                                        int var153 = (var149 - 32) * var149 / var150;
                                        if (var153 < 8) {
                                            var153 = 8;
                                        }
                                        int var154 = var152 - var11 - 16 - var153 / 2;
                                        int var155 = var149 - 32 - var153;
                                        var9.field2223 = (var150 - var149) * var154 / var155;
                                        method1858(var9);
                                        field369 = true;
                                    }
                                }
                                if (field486 != 0) {
                                    int var156 = var9.field2216;
                                    if (var151 >= var148 - var156 && var152 >= var11 && var151 < var148 + 16 && var152 <= var11 + var149) {
                                        var9.field2223 += field486 * 45;
                                        method1858(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field524 == 0 || field524 == 3) && (class116.field1793 == 1 || !Statics.field1832 && class116.field1793 == 4)) {
                        class165 var61 = var9.method3052(true);
                        if (var61 != null) {
                            int var62 = class116.field1782 - var10;
                            int var63 = class116.field1781 - var11;
                            if (var61.method2984(var62, var63)) {
                                int var64 = var62 - var61.field2152 / 2;
                                int var65 = var63 - var61.field2147 / 2;
                                int var66 = field468 + field359 & 0x7FF;
                                int var67 = class85.field1460[var66];
                                int var68 = class85.field1461[var66];
                                int var69 = (field315 + 256) * var67 >> 8;
                                int var70 = (field315 + 256) * var68 >> 8;
                                int var71 = var64 * var70 + var65 * var69 >> 11;
                                int var72 = var65 * var70 - var64 * var69 >> 11;
                                int var73 = Statics.field685.field610 + var71 >> 7;
                                int var74 = Statics.field685.field609 - var72 >> 7;
                                field417.method2920(70);
                                field417.method2780(18);
                                field417.method2702(Statics.field341 + var74);
                                field417.method2793(Statics.field19 + var73);
                                field417.method2660(class106.field1711[82] ? (class106.field1711[81] ? 2 : 1) : 0);
                                field417.method2780(var64);
                                field417.method2780(var65);
                                field417.method2793(field468);
                                field417.method2780(57);
                                field417.method2780(field359);
                                field417.method2780(field315);
                                field417.method2780(89);
                                field417.method2793(Statics.field685.field610);
                                field417.method2793(Statics.field685.field609);
                                field417.method2780(63);
                                field292 = var73;
                                field305 = var74;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cs.cj(III)V")
    public static final void method1868(int arg0, int arg1) {
        if (class170.method1498(arg0)) {
            method2652(Statics.field2329[arg0], arg1);
        }
    }

    @ObfuscatedName("ek.de([Lfh;II)V")
    public static final void method2652(class170[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class170 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2203 == 0) {
                    if (var3.field2312 != null) {
                        method2652(var3.field2312, arg1);
                    }
                    class18 var4 = (class18) field449.method2259((long) var3.field2201);
                    if (var4 != null) {
                        int var5 = var4.field195;
                        if (class170.method1498(var5)) {
                            method2652(Statics.field2329[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2308 != null) {
                    class19 var6 = new class19();
                    var6.field214 = var3;
                    var6.field203 = var3.field2308;
                    class33.method2511(var6);
                }
                if (arg1 == 1 && var3.field2309 != null) {
                    if (var3.field2278 >= 0) {
                        class170 var7 = Statics.method211(var3.field2201);
                        if (var7 == null || var7.field2312 == null || var3.field2278 >= var7.field2312.length || var7.field2312[var3.field2278] != var3) {
                            continue;
                        }
                    }
                    class19 var8 = new class19();
                    var8.field214 = var3;
                    var8.field203 = var3.field2309;
                    class33.method2511(var8);
                }
            }
        }
    }

    @ObfuscatedName("eb.dn(Lfh;IIB)V")
    public static final void method2513(class170 arg0, int arg1, int arg2) {
        if (field461 != null || field426 || arg0 == null) {
            return;
        }
        class170 var3 = arg0;
        int var4 = class171.method269(method2885(arg0));
        class170 var5;
        if (var4 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var3;
                    break;
                }
                var3 = Statics.method211(var3.field2220);
                if (var3 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class170 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2242;
        }
        if (var7 == null) {
            return;
        }
        field461 = arg0;
        class170 var9 = arg0;
        int var10 = class171.method269(method2885(arg0));
        class170 var11;
        if (var10 == 0) {
            var11 = null;
        } else {
            int var12 = 0;
            while (true) {
                if (var12 >= var10) {
                    var11 = var9;
                    break;
                }
                var9 = Statics.method211(var9.field2220);
                if (var9 == null) {
                    var11 = null;
                    break;
                }
                var12++;
            }
        }
        class170 var13 = var11;
        if (var11 == null) {
            var13 = arg0.field2242;
        }
        field328 = var13;
        field463 = arg1;
        field464 = arg2;
        Statics.field2738 = 0;
        field472 = false;
        int var15 = method2388();
        if (var15 != -1) {
            Statics.field1070 = new class39();
            Statics.field1070.field791 = field428[var15];
            Statics.field1070.field790 = field404[var15];
            Statics.field1070.field793 = field301[var15];
            Statics.field1070.field792 = field451[var15];
            Statics.field1070.field795 = field432[var15];
        }
        return;
    }

    @ObfuscatedName("cz.dd(Lfh;I)V")
    public static void method1858(class170 arg0) {
        if (field512 == arg0.field2333) {
            field493[arg0.field2215] = true;
        }
    }

    @ObfuscatedName("n.dy(I)V")
    public static void method222() {
        for (class18 var0 = (class18) field449.method2262(); var0 != null; var0 = (class18) field449.method2260()) {
            int var1 = var0.field195;
            if (class170.method1498(var1)) {
                boolean var2 = true;
                class170[] var3 = Statics.field2329[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2200;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field1864;
                    class170 var6 = Statics.method211(var5);
                    if (var6 != null) {
                        method1858(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("b.db([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method11(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("z.dl(II)V")
    public static final void method212(int arg0) {
        if (!class170.method1498(arg0)) {
            return;
        }
        class170[] var1 = Statics.field2329[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class170 var3 = var1[var2];
            if (var3 != null) {
                var3.field2192 = 0;
                var3.field2195 = 0;
            }
        }
    }

    @ObfuscatedName("fl.dx([Lfh;II)V")
    public static final void method2994(class170[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class170 var3 = arg0[var2];
            if (var3 != null && var3.field2220 == arg1 && (!var3.field2200 || !method199(var3))) {
                if (var3.field2203 == 0) {
                    if (!var3.field2200 && method199(var3) && Statics.field3214 != var3) {
                        continue;
                    }
                    method2994(arg0, var3.field2201);
                    if (var3.field2312 != null) {
                        method2994(var3.field2312, var3.field2201);
                    }
                    class18 var4 = (class18) field449.method2259((long) var3.field2201);
                    if (var4 != null) {
                        int var5 = var4.field195;
                        if (class170.method1498(var5)) {
                            method2994(Statics.field2329[var5], -1);
                        }
                    }
                }
                if (var3.field2203 == 6) {
                    if (var3.field2248 != -1 || var3.field2249 != -1) {
                        boolean var6 = method2404(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2249;
                        } else {
                            var7 = var3.field2248;
                        }
                        if (var7 != -1) {
                            class202 var8 = class202.method17(var7);
                            var3.field2195 += field361;
                            while (var3.field2195 > var8.field3067[var3.field2192]) {
                                var3.field2195 -= var8.field3067[var3.field2192];
                                var3.field2192++;
                                if (var3.field2192 >= var8.field3062.length) {
                                    var3.field2192 -= var8.field3065;
                                    if (var3.field2192 < 0 || var3.field2192 >= var8.field3062.length) {
                                        var3.field2192 = 0;
                                    }
                                }
                                method1858(var3);
                            }
                        }
                    }
                    if (var3.field2257 != 0 && !var3.field2200) {
                        int var9 = var3.field2257 >> 16;
                        int var10 = var3.field2257 << 16 >> 16;
                        int var11 = field361 * var9;
                        int var12 = field361 * var10;
                        var3.field2305 = var3.field2305 + var11 & 0x7FF;
                        var3.field2277 = var3.field2277 + var12 & 0x7FF;
                        method1858(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cx.dm(II)V")
    public static final void method1843(int arg0) {
        method222();
        for (class32 var1 = (class32) class32.field712.method2315(); var1 != null; var1 = (class32) class32.field712.method2332()) {
            if (var1.field714 != null) {
                var1.method665();
            }
        }
        int var2 = class188.method601(arg0).field2782;
        if (var2 == 0) {
            return;
        }
        int var3 = class166.field2158[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class85.method1587(0.9D);
                ((class75) Statics.field1457).method1377(0.9D);
            }
            if (var3 == 2) {
                class85.method1587(0.8D);
                ((class75) Statics.field1457).method1377(0.8D);
            }
            if (var3 == 3) {
                class85.method1587(0.7D);
                ((class75) Statics.field1457).method1377(0.7D);
            }
            if (var3 == 4) {
                class85.method1587(0.6D);
                ((class75) Statics.field1457).method1377(0.6D);
            }
            class199.field2960.method2249();
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
                if (field525 == 0 && field526 != -1) {
                    class139.method1859(Statics.field931, field526, 0, var4, false);
                    field527 = false;
                } else if (var4 == 0) {
                    Statics.field1902.method2414();
                    class139.field1903 = 1;
                    Statics.field889 = null;
                    field527 = false;
                } else {
                    class139.method3214(var4);
                }
                field525 = var4;
            }
        }
        if (var2 == 4) {
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
        if (var2 == 5) {
            field425 = var3;
        }
        if (var2 == 6) {
            field429 = var3;
        }
        if (var2 == 9) {
            field327 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field393 = 127;
            }
            if (var3 == 1) {
                field393 = 96;
            }
            if (var3 == 2) {
                field393 = 64;
            }
            if (var3 == 3) {
                field393 = 32;
            }
            if (var3 == 4) {
                field393 = 0;
            }
        }
        if (var2 == 17) {
            field456 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class41[] var5 = new class41[] { class41.field811, class41.field812, class41.field810, class41.field807 };
            field313 = (class41) class149.method1841(var5, var3);
            if (field313 == null) {
                field313 = class41.field810;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field375 = -1;
            } else {
                field375 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class41[] var6 = new class41[] { class41.field811, class41.field812, class41.field810, class41.field807 };
        field377 = (class41) class149.method1841(var6, var3);
        if (field377 == null) {
            field377 = class41.field810;
        }
    }

    @ObfuscatedName("dn.dt(IIII)Li;")
    public static final class18 method1969(int arg0, int arg1, int arg2) {
        class18 var3 = new class18();
        var3.field195 = arg1;
        var3.field188 = arg2;
        field449.method2267(var3, (long) arg0);
        method212(arg1);
        class170 var4 = Statics.method211(arg0);
        method1858(var4);
        if (field452 != null) {
            method1858(field452);
            field452 = null;
        }
        method198();
        method61(Statics.field2329[arg0 >> 16], var4, false);
        class33.method75(arg1);
        if (field448 != -1) {
            method1868(field448, 1);
        }
        return var3;
    }

    @ObfuscatedName("z.du(Li;ZI)V")
    public static final void method213(class18 arg0, boolean arg1) {
        int var2 = arg0.field195;
        int var3 = (int) arg0.field1864;
        arg0.method2298();
        if (arg1) {
            class170.method2572(var2);
        }
        method1857(var2);
        class170 var4 = Statics.method211(var3);
        if (var4 != null) {
            method1858(var4);
        }
        method198();
        if (field448 != -1) {
            method1868(field448, 1);
        }
    }

    @ObfuscatedName("fp.ds(Lfh;B)Z")
    public static final boolean method3020(class170 arg0) {
        int var1 = arg0.field2205;
        if (var1 == 205) {
            field483 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field561.method3005(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field561.method2998(var4, var5 == 1);
        }
        if (var1 == 324) {
            field561.method2999(false);
        }
        if (var1 == 325) {
            field561.method2999(true);
        }
        if (var1 == 326) {
            field417.method2920(245);
            field561.method3000(field417);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ab.dk(Lfh;IIIB)V")
    public static final void method817(class170 arg0, int arg1, int arg2, int arg3) {
        method918();
        class165 var4 = arg0.method3052(false);
        if (var4 == null) {
            return;
        }
        class220.method3809(arg1, arg2, var4.field2152 + arg1, var4.field2147 + arg2);
        if (field524 == 2 || field524 == 5) {
            class220.method3828(arg1, arg2, 0, var4.field2155, var4.field2148);
        } else {
            int var5 = field468 + field359 & 0x7FF;
            int var6 = Statics.field685.field610 / 32 + 48;
            int var7 = 464 - Statics.field685.field609 / 32;
            Statics.field243.method3948(arg1, arg2, var4.field2152, var4.field2147, var6, var7, var5, field315 + 256, var4.field2155, var4.field2148);
            for (int var8 = 0; var8 < field518; var8++) {
                int var9 = field492[var8] * 4 + 2 - Statics.field685.field610 / 32;
                int var10 = field520[var8] * 4 + 2 - Statics.field685.field609 / 32;
                method262(arg1, arg2, var9, var10, field521[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class129 var13 = field418[Statics.field967][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field685.field610 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field685.field609 / 32;
                        method262(arg1, arg2, var14, var15, Statics.field1841[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field325; var16++) {
                class36 var17 = field324[field326[var16]];
                if (var17 != null && var17.method245()) {
                    class200 var18 = var17.field756;
                    if (var18 != null && var18.field3035 != null) {
                        var18 = var18.method3552();
                    }
                    if (var18 != null && var18.field3029 && var18.field3041) {
                        int var19 = var17.field610 / 32 - Statics.field685.field610 / 32;
                        int var20 = var17.field609 / 32 - Statics.field685.field609 / 32;
                        method262(arg1, arg2, var19, var20, Statics.field1841[1], var4);
                    }
                }
            }
            int var21 = class46.field913;
            int[] var22 = class46.field921;
            for (int var23 = 0; var23 < var21; var23++) {
                class24 var24 = field408[var22[var23]];
                if (var24 != null && var24.method245() && !var24.field266 && Statics.field685 != var24) {
                    int var25 = var24.field610 / 32 - Statics.field685.field610 / 32;
                    int var26 = var24.field609 / 32 - Statics.field685.field609 / 32;
                    boolean var27 = false;
                    if (method1352(var24.field267, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field883; var29++) {
                        if (var24.field267.equals(Statics.field900[var29].field278)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field685.field265 != 0 && var24.field265 != 0 && Statics.field685.field265 == var24.field265) {
                        var30 = true;
                    }
                    if (var27) {
                        method262(arg1, arg2, var25, var26, Statics.field1841[3], var4);
                    } else if (var30) {
                        method262(arg1, arg2, var25, var26, Statics.field1841[4], var4);
                    } else if (var28) {
                        method262(arg1, arg2, var25, var26, Statics.field1841[5], var4);
                    } else {
                        method262(arg1, arg2, var25, var26, Statics.field1841[2], var4);
                    }
                }
            }
            if (field285 != 0 && field489 % 20 < 10) {
                if (field285 == 1 && field306 >= 0 && field306 < field324.length) {
                    class36 var31 = field324[field306];
                    if (var31 != null) {
                        int var32 = var31.field610 / 32 - Statics.field685.field610 / 32;
                        int var33 = var31.field609 / 32 - Statics.field685.field609 / 32;
                        method1862(arg1, arg2, var32, var33, Statics.field241[1], var4);
                    }
                }
                if (field285 == 2) {
                    int var34 = field308 * 4 - Statics.field19 * 4 + 2 - Statics.field685.field610 / 32;
                    int var35 = field309 * 4 - Statics.field341 * 4 + 2 - Statics.field685.field609 / 32;
                    method1862(arg1, arg2, var34, var35, Statics.field241[1], var4);
                }
                if (field285 == 10 && field503 >= 0 && field503 < field408.length) {
                    class24 var36 = field408[field503];
                    if (var36 != null) {
                        int var37 = var36.field610 / 32 - Statics.field685.field610 / 32;
                        int var38 = var36.field609 / 32 - Statics.field685.field609 / 32;
                        method1862(arg1, arg2, var37, var38, Statics.field241[1], var4);
                    }
                }
            }
            if (field292 != 0) {
                int var39 = field292 * 4 + 2 - Statics.field685.field610 / 32;
                int var40 = field305 * 4 + 2 - Statics.field685.field609 / 32;
                method262(arg1, arg2, var39, var40, Statics.field241[0], var4);
            }
            if (!Statics.field685.field266) {
                class220.method3815(var4.field2152 / 2 + arg1 - 1, var4.field2147 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field494[arg3] = true;
    }

    @ObfuscatedName("cu.dg(IIIILhg;Lfk;I)V")
    public static final void method1862(int arg0, int arg1, int arg2, int arg3, class225 arg4, class165 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method262(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field468 + field359 & 0x7FF;
        int var8 = class85.field1460[var7];
        int var9 = class85.field1461[var7];
        int var10 = var8 * 256 / (field315 + 256);
        int var11 = var9 * 256 / (field315 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field46.method3949(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("u.dj(IIIILhg;Lfk;S)V")
    public static final void method262(int arg0, int arg1, int arg2, int arg3, class225 arg4, class165 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field468 + field359 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class85.field1460[var6];
        int var9 = class85.field1461[var6];
        int var10 = var8 * 256 / (field315 + 256);
        int var11 = var9 * 256 / (field315 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method3947(arg5.field2152 / 2 + var12 - arg4.field3222 / 2, arg5.field2147 / 2 - var13 - arg4.field3223 / 2, arg0, arg1, arg5.field2152, arg5.field2147, arg5.field2155, arg5.field2148);
        } else {
            arg4.method3937(arg5.field2152 / 2 + arg0 + var12 - arg4.field3222 / 2, arg5.field2147 / 2 + arg1 - var13 - arg4.field3223 / 2);
        }
    }

    @ObfuscatedName("bj.dw(Ljava/lang/String;ZI)Z")
    public static boolean method1352(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class205.method168(arg0, Statics.field2108);
        for (int var3 = 0; var3 < field555; var3++) {
            if (var2.equalsIgnoreCase(class205.method168(field557[var3].field170, Statics.field2108)) && (!arg1 || field557[var3].field167 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class205.method168(Statics.field685.field267, Statics.field2108))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("dw.do(Ljava/lang/String;B)Z")
    public static boolean method2208(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class205.method168(arg0, Statics.field2108);
        for (int var2 = 0; var2 < field329; var2++) {
            class20 var3 = field423[var2];
            if (var1.equalsIgnoreCase(class205.method168(var3.field217, Statics.field2108))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class205.method168(var3.field216, Statics.field2108))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("cl.di(Ljava/lang/String;I)V")
    public static final void method1577(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field555 < 200 || field482 == 1) || field555 >= 400) {
            class48.method3031(30, "", class174.field2524);
            return;
        }
        String var1 = class205.method168(arg0, Statics.field2108);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field555; var2++) {
            class15 var3 = field557[var2];
            String var4 = class205.method168(var3.field170, Statics.field2108);
            if (var4 != null && var4.equals(var1)) {
                class48.method3031(30, "", arg0 + class174.field2402);
                return;
            }
            if (var3.field161 != null) {
                String var5 = class205.method168(var3.field161, Statics.field2108);
                if (var5 != null && var5.equals(var1)) {
                    class48.method3031(30, "", arg0 + class174.field2402);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field329; var6++) {
            class20 var7 = field423[var6];
            String var8 = class205.method168(var7.field217, Statics.field2108);
            if (var8 != null && var8.equals(var1)) {
                class48.method3031(30, "", class174.field2430 + arg0 + class174.field2414);
                return;
            }
            if (var7.field216 != null) {
                String var9 = class205.method168(var7.field216, Statics.field2108);
                if (var9 != null && var9.equals(var1)) {
                    class48.method3031(30, "", class174.field2430 + arg0 + class174.field2414);
                    return;
                }
            }
        }
        if (class205.method168(Statics.field685.field267, Statics.field2108).equals(var1)) {
            class48.method3031(30, "", class174.field2528);
        } else {
            field417.method2920(47);
            field417.method2780(class154.method2198(arg0));
            field417.method2764(arg0);
        }
    }

    @ObfuscatedName("ck.dv(Ljava/lang/String;ZI)V")
    public static final void method1846(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field329 < 100 || field482 == 1) || field329 >= 400) {
            class48.method3031(31, "", class174.field2589);
            return;
        }
        String var2 = class205.method168(arg0, Statics.field2108);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field329; var3++) {
            class20 var4 = field423[var3];
            String var5 = class205.method168(var4.field217, Statics.field2108);
            if (var5 != null && var5.equals(var2)) {
                class48.method3031(31, "", arg0 + class174.field2527);
                return;
            }
            if (var4.field216 != null) {
                String var6 = class205.method168(var4.field216, Statics.field2108);
                if (var6 != null && var6.equals(var2)) {
                    class48.method3031(31, "", arg0 + class174.field2527);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field555; var7++) {
            class15 var8 = field557[var7];
            String var9 = class205.method168(var8.field170, Statics.field2108);
            if (var9 != null && var9.equals(var2)) {
                class48.method3031(31, "", class174.field2427 + arg0 + class174.field2533);
                return;
            }
            if (var8.field161 != null) {
                String var10 = class205.method168(var8.field161, Statics.field2108);
                if (var10 != null && var10.equals(var2)) {
                    class48.method3031(31, "", class174.field2427 + arg0 + class174.field2533);
                    return;
                }
            }
        }
        if (class205.method168(Statics.field685.field267, Statics.field2108).equals(var2)) {
            class48.method3031(31, "", class174.field2529);
        } else {
            field417.method2920(87);
            field417.method2780(class154.method2198(arg0));
            field417.method2764(arg0);
        }
    }

    @ObfuscatedName("g.dp(Ljava/lang/String;I)V")
    public static final void method91(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class205.method168(arg0, Statics.field2108);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field555; var2++) {
            class15 var3 = field557[var2];
            String var4 = var3.field170;
            String var5 = class205.method168(var4, Statics.field2108);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field555--;
                for (int var7 = var2; var7 < field555; var7++) {
                    field557[var7] = field557[var7 + 1];
                }
                field481 = field293;
                field417.method2920(179);
                field417.method2780(class154.method2198(arg0));
                field417.method2764(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("fe.df(Ljava/lang/String;B)V")
    public static final void method3032(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class205.method168(arg0, Statics.field2108);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field329; var2++) {
            class20 var3 = field423[var2];
            String var4 = var3.field217;
            String var5 = class205.method168(var4, Statics.field2108);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field329--;
                for (int var7 = var2; var7 < field329; var7++) {
                    field423[var7] = field423[var7 + 1];
                }
                field481 = field293;
                field417.method2920(116);
                field417.method2780(class154.method2198(arg0));
                field417.method2764(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("f.dc(Ljava/lang/String;I)V")
    public static final void method170(String arg0) {
        if (Statics.field900 != null) {
            field417.method2920(19);
            field417.method2780(class154.method2198(arg0));
            field417.method2764(arg0);
        }
    }

    @ObfuscatedName("gv.dr(Ljava/lang/String;B)V")
    public static final void method3204(String arg0) {
        if (!arg0.equals("")) {
            field417.method2920(33);
            field417.method2780(class154.method2198(arg0));
            field417.method2764(arg0);
        }
    }

    @ObfuscatedName("y.dq(I)V")
    public static final void method62() {
        field417.method2920(33);
        field417.method2780(0);
    }

    @ObfuscatedName("cz.dz(II)V")
    public static void method1857(int arg0) {
        for (class134 var1 = (class134) field298.method2262(); var1 != null; var1 = (class134) field298.method2260()) {
            if ((var1.field1864 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method2298();
            }
        }
    }

    @ObfuscatedName("ee.da(Lfh;B)I")
    public static int method2885(class170 arg0) {
        class134 var1 = (class134) field298.method2259(((long) arg0.field2201 << 32) + (long) arg0.field2278);
        return var1 == null ? arg0.field2273 : var1.field1879;
    }

    @ObfuscatedName("q.dh(Lfh;I)Z")
    public static boolean method199(class170 arg0) {
        if (field290) {
            if (method2885(arg0) != 0) {
                return false;
            }
            if (arg0.field2203 == 0) {
                return false;
            }
        }
        return arg0.field2221;
    }

    @ObfuscatedName("n.eg(Lfh;I)Ljava/lang/String;")
    public static String method223(class170 arg0) {
        if (class171.method1870(method2885(arg0)) == 0) {
            return null;
        } else if (arg0.field2280 == null || arg0.field2280.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2280;
        }
    }

    @ObfuscatedName("cm.ef(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method1856(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field562 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field562 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field562 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field562 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field562 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field182 != null) {
            var3 = "/p=" + Statics.field182;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field314 + "/a=" + Statics.field27 + var3 + "/";
    }

    @ObfuscatedName("ew.er(Ljava/lang/String;ZI)V")
    public static void method2389(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field58; var5++) {
            class199 var6 = class199.method751(var5);
            if ((!arg1 || var6.field3001) && var6.field2952 == -1 && var6.field2963.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1964 = -1;
                    Statics.field1772 = null;
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
        Statics.field1772 = var3;
        Statics.field2676 = 0;
        Statics.field1964 = var4;
        String[] var9 = new String[Statics.field1964];
        for (int var10 = 0; var10 < Statics.field1964; var10++) {
            var9[var10] = class199.method751(var3[var10]).field2963;
        }
        short[] var11 = Statics.field1772;
        class151.method197(var9, var11, 0, var9.length - 1);
    }
}

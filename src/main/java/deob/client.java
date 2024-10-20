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

public final class client extends class114 {

    @ObfuscatedName("client.v")
    public static boolean field285 = true;

    @ObfuscatedName("client.p")
    public static int field562 = 1;

    @ObfuscatedName("client.j")
    public static int field288 = 0;

    @ObfuscatedName("client.a")
    public static int field310 = 0;

    @ObfuscatedName("client.k")
    public static boolean field290 = false;

    @ObfuscatedName("client.f")
    public static boolean field291 = false;

    @ObfuscatedName("client.o")
    public static int field429 = 0;

    @ObfuscatedName("client.w")
    public static class118[] field350 = new class118[4];

    @ObfuscatedName("client.r")
    public static int field294 = 0;

    @ObfuscatedName("client.u")
    public static boolean field295 = true;

    @ObfuscatedName("client.e")
    public static int field432 = 0;

    @ObfuscatedName("client.h")
    public static long field297 = -1L;

    @ObfuscatedName("client.z")
    public static int field390 = -1;

    @ObfuscatedName("client.t")
    public static int field300 = -1;

    @ObfuscatedName("client.ab")
    public static int field301 = -1;

    @ObfuscatedName("client.ac")
    public static boolean field523 = true;

    @ObfuscatedName("client.au")
    public static boolean field303 = false;

    @ObfuscatedName("client.al")
    public static int field499 = 0;

    @ObfuscatedName("client.ae")
    public static int field305 = 0;

    @ObfuscatedName("client.ad")
    public static int field306 = 0;

    @ObfuscatedName("client.aq")
    public static int field563 = 0;

    @ObfuscatedName("client.aa")
    public static int field296 = 0;

    @ObfuscatedName("client.af")
    public static int field383 = 0;

    @ObfuscatedName("client.as")
    public static int field347 = 0;

    @ObfuscatedName("client.ao")
    public static int field311 = 0;

    @ObfuscatedName("client.ax")
    public static int field312 = 0;

    @ObfuscatedName("client.aj")
    public static class41 field314 = class41.field815;

    @ObfuscatedName("client.ar")
    public static class41 field315 = class41.field815;

    @ObfuscatedName("client.av")
    public static int field316 = 0;

    @ObfuscatedName("client.ay")
    public static int field317 = 0;

    @ObfuscatedName("client.ai")
    public static int field318 = 0;

    @ObfuscatedName("client.ba")
    public static int field321 = 0;

    @ObfuscatedName("client.bk")
    public static int field322 = 0;

    @ObfuscatedName("client.bs")
    public static int field323 = 0;

    @ObfuscatedName("client.bg")
    public static int field324 = 0;

    @ObfuscatedName("client.bw")
    public static int field325 = 0;

    @ObfuscatedName("client.bc")
    public static byte[] field327 = null;

    @ObfuscatedName("client.ck")
    public static class36[] field328 = new class36[32768];

    @ObfuscatedName("client.cn")
    public static int field329 = 0;

    @ObfuscatedName("client.cj")
    public static int[] field286 = new int[32768];

    @ObfuscatedName("client.co")
    public static int field514 = 0;

    @ObfuscatedName("client.cm")
    public static int[] field332 = new int[250];

    @ObfuscatedName("client.cq")
    public static class160 field333 = new class160(5000);

    @ObfuscatedName("client.cl")
    public static class160 field334 = new class160(5000);

    @ObfuscatedName("client.cb")
    public static class160 field335 = new class160(15000);

    @ObfuscatedName("client.cz")
    public static int field336 = 0;

    @ObfuscatedName("client.cs")
    public static int field337 = 0;

    @ObfuscatedName("client.ch")
    public static int field338 = 0;

    @ObfuscatedName("client.cg")
    public static int field339 = 0;

    @ObfuscatedName("client.ct")
    public static int field346 = 0;

    @ObfuscatedName("client.ce")
    public static int field341 = 0;

    @ObfuscatedName("client.cv")
    public static int field342 = 0;

    @ObfuscatedName("client.cx")
    public static int field343 = 0;

    @ObfuscatedName("client.cy")
    public static boolean field344 = false;

    @ObfuscatedName("client.dx")
    public static int field388 = 0;

    @ObfuscatedName("client.dp")
    public static int field475 = 1;

    @ObfuscatedName("client.de")
    public static int field353 = 0;

    @ObfuscatedName("client.df")
    public static int field509 = 1;

    @ObfuscatedName("client.dg")
    public static int field349 = 0;

    @ObfuscatedName("client.dy")
    public static boolean field351 = false;

    @ObfuscatedName("client.do")
    public static int[][][] field352 = new int[4][13][13];

    @ObfuscatedName("client.du")
    public static final int[] field330 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dl")
    public static int field431 = 0;

    @ObfuscatedName("client.dn")
    public static int field355 = 2;

    @ObfuscatedName("client.dq")
    public static int field399 = 0;

    @ObfuscatedName("client.di")
    public static int field357 = 2;

    @ObfuscatedName("client.eh")
    public static int field358 = 0;

    @ObfuscatedName("client.ex")
    public static int field396 = 1;

    @ObfuscatedName("client.eu")
    public static int field394 = 0;

    @ObfuscatedName("client.et")
    public static int field395 = 0;

    @ObfuscatedName("client.ed")
    public static int field362 = 2;

    @ObfuscatedName("client.ea")
    public static int field340 = 0;

    @ObfuscatedName("client.ez")
    public static int field298 = 1;

    @ObfuscatedName("client.er")
    public static int field424 = 0;

    @ObfuscatedName("client.ee")
    public static int field366 = 0;

    @ObfuscatedName("client.es")
    public static int field367 = 2301979;

    @ObfuscatedName("client.ec")
    public static int field368 = 5063219;

    @ObfuscatedName("client.eq")
    public static int field369 = 3353893;

    @ObfuscatedName("client.ef")
    public static int field370 = 7759444;

    @ObfuscatedName("client.el")
    public static boolean field371 = false;

    @ObfuscatedName("client.fu")
    public static int field372 = 0;

    @ObfuscatedName("client.fk")
    public static int field373 = 128;

    @ObfuscatedName("client.fp")
    public static int field374 = 0;

    @ObfuscatedName("client.fm")
    public static int field375 = 0;

    @ObfuscatedName("client.fj")
    public static int field376 = 0;

    @ObfuscatedName("client.fv")
    public static int field539 = 0;

    @ObfuscatedName("client.fz")
    public static int field378 = 0;

    @ObfuscatedName("client.fs")
    public static int field379 = 50;

    @ObfuscatedName("client.fc")
    public static int field380 = 0;

    @ObfuscatedName("client.fy")
    public static boolean field377 = false;

    @ObfuscatedName("client.fe")
    public static int field382 = 0;

    @ObfuscatedName("client.fo")
    public static int field485 = 0;

    @ObfuscatedName("client.fg")
    public static int field384 = 50;

    @ObfuscatedName("client.fa")
    public static int[] field385 = new int[field384];

    @ObfuscatedName("client.fx")
    public static int[] field386 = new int[field384];

    @ObfuscatedName("client.fn")
    public static int[] field387 = new int[field384];

    @ObfuscatedName("client.ft")
    public static int[] field435 = new int[field384];

    @ObfuscatedName("client.fb")
    public static int[] field389 = new int[field384];

    @ObfuscatedName("client.fr")
    public static int[] field501 = new int[field384];

    @ObfuscatedName("client.go")
    public static int[] field391 = new int[field384];

    @ObfuscatedName("client.gz")
    public static String[] field392 = new String[field384];

    @ObfuscatedName("client.gj")
    public static int[][] field454 = new int[104][104];

    @ObfuscatedName("client.ge")
    public static int field503 = 0;

    @ObfuscatedName("client.gn")
    public static int field448 = -1;

    @ObfuscatedName("client.gb")
    public static int field470 = -1;

    @ObfuscatedName("client.gx")
    public static int field490 = 0;

    @ObfuscatedName("client.ga")
    public static int field491 = 0;

    @ObfuscatedName("client.gw")
    public static int field427 = 0;

    @ObfuscatedName("client.gi")
    public static int field400 = 0;

    @ObfuscatedName("client.gp")
    public static int field401 = 0;

    @ObfuscatedName("client.gv")
    public static int field402 = 0;

    @ObfuscatedName("client.gt")
    public static int field403 = 0;

    @ObfuscatedName("client.gr")
    public static int field404 = 0;

    @ObfuscatedName("client.gf")
    public static int field443 = 0;

    @ObfuscatedName("client.gu")
    public static int field406 = 0;

    @ObfuscatedName("client.gk")
    public static boolean field407 = false;

    @ObfuscatedName("client.gm")
    public static int field408 = 0;

    @ObfuscatedName("client.gl")
    public static int field409 = 0;

    @ObfuscatedName("client.gq")
    public static class24[] field365 = new class24[2048];

    @ObfuscatedName("client.gc")
    public static int field411 = -1;

    @ObfuscatedName("client.hi")
    public static int field412 = 0;

    @ObfuscatedName("client.hu")
    public static int field558 = 0;

    @ObfuscatedName("client.hy")
    public static int[] field319 = new int[1000];

    @ObfuscatedName("client.hc")
    public static final int[] field415 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hm")
    public static String[] field416 = new String[8];

    @ObfuscatedName("client.hk")
    public static boolean[] field528 = new boolean[8];

    @ObfuscatedName("client.hd")
    public static int[] field418 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hn")
    public static int field419 = -1;

    @ObfuscatedName("client.hw")
    public static class129[][][] field420 = new class129[4][104][104];

    @ObfuscatedName("client.hf")
    public static class129 field393 = new class129();

    @ObfuscatedName("client.hr")
    public static class129 field422 = new class129();

    @ObfuscatedName("client.hs")
    public static class129 field423 = new class129();

    @ObfuscatedName("client.ht")
    public static int[] field284 = new int[25];

    @ObfuscatedName("client.hj")
    public static int[] field425 = new int[25];

    @ObfuscatedName("client.he")
    public static int[] field364 = new int[25];

    @ObfuscatedName("client.ho")
    public static int field361 = 0;

    @ObfuscatedName("client.hz")
    public static boolean field428 = false;

    @ObfuscatedName("client.hg")
    public static int field515 = 0;

    @ObfuscatedName("client.hl")
    public static int[] field430 = new int[500];

    @ObfuscatedName("client.ia")
    public static int[] field574 = new int[500];

    @ObfuscatedName("client.is")
    public static int[] field498 = new int[500];

    @ObfuscatedName("client.ik")
    public static int[] field433 = new int[500];

    @ObfuscatedName("client.if")
    public static String[] field434 = new String[500];

    @ObfuscatedName("client.ip")
    public static String[] field410 = new String[500];

    @ObfuscatedName("client.in")
    public static boolean field547 = false;

    @ObfuscatedName("client.ic")
    public static int field437 = -1;

    @ObfuscatedName("client.iq")
    public static boolean field438 = false;

    @ObfuscatedName("client.io")
    public static int field439 = -1;

    @ObfuscatedName("client.iy")
    public static int field466 = -1;

    @ObfuscatedName("client.ir")
    public static int field441 = 0;

    @ObfuscatedName("client.ig")
    public static int field442 = 50;

    @ObfuscatedName("client.iw")
    public static int field417 = 0;

    @ObfuscatedName("client.it")
    public static String field444 = null;

    @ObfuscatedName("client.id")
    public static boolean field445 = false;

    @ObfuscatedName("client.iu")
    public static int field530 = -1;

    @ObfuscatedName("client.ix")
    public static int field447 = -1;

    @ObfuscatedName("client.jn")
    public static String field354 = null;

    @ObfuscatedName("client.ji")
    public static String field449 = null;

    @ObfuscatedName("client.jt")
    public static int field450 = -1;

    @ObfuscatedName("client.jz")
    public static class126 field302 = new class126(8);

    @ObfuscatedName("client.jr")
    public static int field452 = 0;

    @ObfuscatedName("client.jh")
    public static int field453 = 0;

    @ObfuscatedName("client.ja")
    public static class170 field544 = null;

    @ObfuscatedName("client.jf")
    public static int field455 = 0;

    @ObfuscatedName("client.ju")
    public static int field456 = 0;

    @ObfuscatedName("client.jx")
    public static int field426 = 0;

    @ObfuscatedName("client.jb")
    public static int field458 = -1;

    @ObfuscatedName("client.jm")
    public static boolean field459 = false;

    @ObfuscatedName("client.jc")
    public static boolean field471 = false;

    @ObfuscatedName("client.jp")
    public static boolean field461 = false;

    @ObfuscatedName("client.jg")
    public static class170 field462 = null;

    @ObfuscatedName("client.jk")
    public static class170 field463 = null;

    @ObfuscatedName("client.jy")
    public static class170 field464 = null;

    @ObfuscatedName("client.jw")
    public static int field465 = 0;

    @ObfuscatedName("client.jd")
    public static int field467 = 0;

    @ObfuscatedName("client.jj")
    public static class170 field564 = null;

    @ObfuscatedName("client.jo")
    public static boolean field468 = false;

    @ObfuscatedName("client.je")
    public static int field524 = -1;

    @ObfuscatedName("client.jl")
    public static int field308 = -1;

    @ObfuscatedName("client.jq")
    public static boolean field414 = false;

    @ObfuscatedName("client.jv")
    public static int field472 = -1;

    @ObfuscatedName("client.js")
    public static int field345 = -1;

    @ObfuscatedName("client.kd")
    public static boolean field474 = false;

    @ObfuscatedName("client.ko")
    public static int field506 = 1;

    @ObfuscatedName("client.kh")
    public static int[] field497 = new int[32];

    @ObfuscatedName("client.kk")
    public static int field477 = 0;

    @ObfuscatedName("client.kb")
    public static int[] field478 = new int[32];

    @ObfuscatedName("client.kn")
    public static int field479 = 0;

    @ObfuscatedName("client.kx")
    public static int[] field480 = new int[32];

    @ObfuscatedName("client.km")
    public static int field481 = 0;

    @ObfuscatedName("client.ky")
    public static int field482 = 0;

    @ObfuscatedName("client.kj")
    public static int field483 = 0;

    @ObfuscatedName("client.kr")
    public static int field484 = 0;

    @ObfuscatedName("client.kp")
    public static int field289 = 0;

    @ObfuscatedName("client.kg")
    public static int field486 = 0;

    @ObfuscatedName("client.ks")
    public static int field487 = 0;

    @ObfuscatedName("client.kz")
    public static int field488 = 0;

    @ObfuscatedName("client.kq")
    public static class129 field489 = new class129();

    @ObfuscatedName("client.ki")
    public static class129 field532 = new class129();

    @ObfuscatedName("client.kt")
    public static class129 field360 = new class129();

    @ObfuscatedName("client.ln")
    public static class126 field492 = new class126(512);

    @ObfuscatedName("client.ll")
    public static int field469 = 0;

    @ObfuscatedName("client.lk")
    public static int field494 = -2;

    @ObfuscatedName("client.le")
    public static boolean[] field495 = new boolean[100];

    @ObfuscatedName("client.lg")
    public static boolean[] field496 = new boolean[100];

    @ObfuscatedName("client.lc")
    public static boolean[] field436 = new boolean[100];

    @ObfuscatedName("client.lq")
    public static int[] field457 = new int[100];

    @ObfuscatedName("client.lx")
    public static int[] field513 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field493 = new int[100];

    @ObfuscatedName("client.lr")
    public static int[] field309 = new int[100];

    @ObfuscatedName("client.li")
    public static int field502 = 0;

    @ObfuscatedName("client.lp")
    public static long field331 = 0L;

    @ObfuscatedName("client.ld")
    public static boolean field504 = true;

    @ObfuscatedName("client.lv")
    public static int field505 = 1;

    @ObfuscatedName("client.lh")
    public static int field363 = 503;

    @ObfuscatedName("client.lz")
    public static int[] field507 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lt")
    public static int field508 = 0;

    @ObfuscatedName("client.lb")
    public static int field446 = 0;

    @ObfuscatedName("client.lj")
    public static String field510 = "";

    @ObfuscatedName("client.mk")
    public static long[] field511 = new long[100];

    @ObfuscatedName("client.mx")
    public static int field512 = 0;

    @ObfuscatedName("client.mf")
    public static int field421 = 0;

    @ObfuscatedName("client.md")
    public static int[] field299 = new int[128];

    @ObfuscatedName("client.mt")
    public static int[] field522 = new int[128];

    @ObfuscatedName("client.mp")
    public static long field516 = -1L;

    @ObfuscatedName("client.mn")
    public static String field517 = null;

    @ObfuscatedName("client.ml")
    public static String field518 = null;

    @ObfuscatedName("client.mv")
    public static int field520 = -1;

    @ObfuscatedName("client.me")
    public static int field521 = 0;

    @ObfuscatedName("client.mh")
    public static int[] field476 = new int[1000];

    @ObfuscatedName("client.mj")
    public static int[] field397 = new int[1000];

    @ObfuscatedName("client.mg")
    public static class225[] field359 = new class225[1000];

    @ObfuscatedName("client.mw")
    public static int field381 = 0;

    @ObfuscatedName("client.mc")
    public static int field526 = 0;

    @ObfuscatedName("client.nd")
    public static int field527 = 0;

    @ObfuscatedName("client.nk")
    public static int field545 = 255;

    @ObfuscatedName("client.np")
    public static int field529 = -1;

    @ObfuscatedName("client.ns")
    public static boolean field440 = false;

    @ObfuscatedName("client.nz")
    public static int field531 = 127;

    @ObfuscatedName("client.ne")
    public static int field398 = 127;

    @ObfuscatedName("client.nf")
    public static int field533 = 0;

    @ObfuscatedName("client.nj")
    public static int[] field534 = new int[50];

    @ObfuscatedName("client.nt")
    public static int[] field535 = new int[50];

    @ObfuscatedName("client.ni")
    public static int[] field536 = new int[50];

    @ObfuscatedName("client.nx")
    public static int[] field537 = new int[50];

    @ObfuscatedName("client.nl")
    public static class54[] field538 = new class54[50];

    @ObfuscatedName("client.ny")
    public static boolean field460 = false;

    @ObfuscatedName("client.ou")
    public static boolean[] field540 = new boolean[5];

    @ObfuscatedName("client.om")
    public static int[] field541 = new int[5];

    @ObfuscatedName("client.op")
    public static int[] field542 = new int[5];

    @ObfuscatedName("client.ow")
    public static int[] field543 = new int[5];

    @ObfuscatedName("client.ol")
    public static int[] field293 = new int[5];

    @ObfuscatedName("client.oa")
    public static short field473 = 256;

    @ObfuscatedName("client.ok")
    public static short field546 = 205;

    @ObfuscatedName("client.og")
    public static short field572 = 256;

    @ObfuscatedName("client.of")
    public static short field548 = 320;

    @ObfuscatedName("client.oh")
    public static short field549 = 1;

    @ObfuscatedName("client.oz")
    public static short field550 = 32767;

    @ObfuscatedName("client.oi")
    public static short field551 = 1;

    @ObfuscatedName("client.on")
    public static short field552 = 32767;

    @ObfuscatedName("client.ox")
    public static int field553 = 0;

    @ObfuscatedName("client.oo")
    public static int field554 = 0;

    @ObfuscatedName("client.or")
    public static int field555 = 0;

    @ObfuscatedName("client.od")
    public static int field556 = 0;

    @ObfuscatedName("client.oj")
    public static int field320 = 0;

    @ObfuscatedName("client.oy")
    public static int field348 = 0;

    @ObfuscatedName("client.os")
    public static int field559 = 0;

    @ObfuscatedName("client.ov")
    public static class15[] field560 = new class15[400];

    @ObfuscatedName("client.pz")
    public static class131 field561 = new class131();

    @ObfuscatedName("client.pd")
    public static int field567 = 0;

    @ObfuscatedName("client.pq")
    public static class20[] field525 = new class20[400];

    @ObfuscatedName("client.pi")
    public static class167 field413 = new class167();

    @ObfuscatedName("client.pm")
    public static int field565 = -1;

    @ObfuscatedName("client.pc")
    public static int field566 = -1;

    @ObfuscatedName("client.pr")
    public static class5[] field356 = new class5[8];

    @ObfuscatedName("client.pt")
    public static long field568 = -1L;

    @ObfuscatedName("client.pw")
    public static long field569 = -1L;

    @ObfuscatedName("client.pl")
    public static final class23 field570 = new class23();

    @ObfuscatedName("client.po")
    public static int[] field571 = new int[50];

    @ObfuscatedName("client.pu")
    public static int[] field451 = new int[50];

    @ObfuscatedName("client.v(B)V")
    public final void method612() {
    }

    public final void init() {
        if (!this.method2070()) {
            return;
        }
        class215[] var1 = new class215[] { class215.field3163, class215.field3174, class215.field3165, class215.field3167, class215.field3175, class215.field3173, class215.field3168, class215.field3166, class215.field3177, class215.field3164, class215.field3171, class215.field3169, class215.field3172, class215.field3176, class215.field3170 };
        class215[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class215 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3178);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3178)) {
                    case 1:
                        Statics.field45 = Integer.parseInt(var5);
                    case 2:
                    case 6:
                    case 8:
                    default:
                        break;
                    case 3:
                        field429 = Integer.parseInt(var5);
                        break;
                    case 4:
                        Statics.field279 = var5;
                        break;
                    case 5:
                        int var6 = Integer.parseInt(var5);
                        class179[] var7 = class179.method2232();
                        int var8 = 0;
                        class179 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class179 var9 = var7[var8];
                            if (var9.field2673 == var6) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field3100 = var10;
                        break;
                    case 7:
                        Statics.field1791 = Integer.parseInt(var5);
                        break;
                    case 9:
                        Statics.field313 = (class180) class149.method208(class180.method614(), Integer.parseInt(var5));
                        if (Statics.field313 == class180.field2687) {
                            Statics.field2038 = class229.field3257;
                        } else {
                            Statics.field2038 = class229.field3256;
                        }
                        break;
                    case 10:
                        field288 = Integer.parseInt(var5);
                        break;
                    case 11:
                        field562 = Integer.parseInt(var5);
                        break;
                    case 12:
                        field310 = Integer.parseInt(var5);
                        break;
                    case 13:
                        if (var5.equalsIgnoreCase(class38.field784)) {
                        }
                        break;
                    case 14:
                        if (var5.equalsIgnoreCase(class38.field784)) {
                            field290 = true;
                        } else {
                            field290 = false;
                        }
                        break;
                    case 15:
                        Statics.field304 = var5;
                }
            }
        }
        Statics.method2146();
        Statics.field3200 = this.getCodeBase().getHost();
        String var11 = Statics.field3100.field2674;
        byte var12 = 0;
        try {
            Statics.field1548 = 16;
            Statics.field2348 = var12;
            try {
                Statics.field805 = System.getProperty("os.name");
            } catch (Exception var26) {
                Statics.field805 = "Unknown";
            }
            Statics.field739 = Statics.field805.toLowerCase();
            try {
                Statics.field230 = System.getProperty("user.home");
                if (Statics.field230 != null) {
                    Statics.field230 = Statics.field230 + "/";
                }
            } catch (Exception var25) {
            }
            try {
                if (Statics.field739.startsWith("win")) {
                    if (Statics.field230 == null) {
                        Statics.field230 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field230 == null) {
                    Statics.field230 = System.getenv("HOME");
                }
                if (Statics.field230 != null) {
                    Statics.field230 = Statics.field230 + "/";
                }
            } catch (Exception var24) {
            }
            if (Statics.field230 == null) {
                Statics.field230 = "~/";
            }
            Statics.field2656 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field230, "/tmp/", "" };
            Statics.field78 = new String[] { ".jagex_cache_" + Statics.field2348, ".file_store_" + Statics.field2348 };
            label122: for (int var16 = 0; var16 < 4; var16++) {
                Statics.field3101 = class105.method1157("oldschool", var11, var16);
                if (!Statics.field3101.exists()) {
                    Statics.field3101.mkdirs();
                }
                File[] var17 = Statics.field3101.listFiles();
                if (var17 == null) {
                    break;
                }
                File[] var18 = var17;
                int var19 = 0;
                while (true) {
                    if (var19 >= var18.length) {
                        break label122;
                    }
                    File var20 = var18[var19];
                    if (!class105.method256(var20, false)) {
                        break;
                    }
                    var19++;
                }
            }
            File var21 = Statics.field3101;
            Statics.field1734 = var21;
            if (!Statics.field1734.exists()) {
                throw new RuntimeException("");
            }
            class108.field1735 = true;
            Statics.method93();
            class105.field1700 = new class73(new class74(class108.method33("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class105.field1696 = new class73(new class74(class108.method33("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field183 = new class73[Statics.field1548];
            for (int var22 = 0; var22 < Statics.field1548; var22++) {
                Statics.field183[var22] = new class73(new class74(class108.method33("main_file_cache.idx" + var22), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var27) {
            class102.method1916((String) null, var27);
        }
        Statics.field557 = this;
        this.method2063(765, 503, 136);
    }

    @ObfuscatedName("client.j(I)V")
    public final void method266() {
        Statics.field3146 = field310 == 0 ? 43594 : field562 + 40000;
        Statics.field218 = field310 == 0 ? 443 : field562 + 50000;
        Statics.field326 = Statics.field3146;
        Statics.field2175 = class168.field2184;
        Statics.field2160 = class168.field2189;
        Statics.field2034 = class168.field2185;
        Statics.field1125 = class168.field2186;
        if (Statics.field1678.toLowerCase().indexOf("microsoft") == -1) {
            class106.field1731[44] = 71;
            class106.field1731[45] = 26;
            class106.field1731[46] = 72;
            class106.field1731[47] = 73;
            class106.field1731[59] = 57;
            class106.field1731[61] = 27;
            class106.field1731[91] = 42;
            class106.field1731[92] = 74;
            class106.field1731[93] = 43;
            class106.field1731[192] = 28;
            class106.field1731[222] = 58;
            class106.field1731[520] = 59;
        } else {
            class106.field1731[186] = 57;
            class106.field1731[187] = 27;
            class106.field1731[188] = 71;
            class106.field1731[189] = 26;
            class106.field1731[190] = 72;
            class106.field1731[191] = 73;
            class106.field1731[192] = 58;
            class106.field1731[219] = 42;
            class106.field1731[220] = 74;
            class106.field1731[221] = 43;
            class106.field1731[222] = 59;
            class106.field1731[223] = 28;
        }
        Canvas var1 = Statics.field1745;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class106.field1703);
        var1.addFocusListener(class106.field1703);
        class116.method1979(Statics.field1745);
        Statics.field949 = class113.method34();
        if (Statics.field949 != null) {
            Statics.field949.method2004(Statics.field1745);
        }
        Statics.field201 = new class117(255, class105.field1700, class105.field1696, 500000);
        class74 var2 = null;
        class31 var3 = new class31();
        try {
            var2 = class105.method3399("", Statics.field313.field2688, false);
            byte[] var4 = new byte[(int) var2.method1411()];
            int var6;
            for (int var5 = 0; var5 < var4.length; var5 += var6) {
                var6 = var2.method1412(var4, var5, var4.length - var5);
                if (var6 == -1) {
                    throw new IOException();
                }
            }
            var3 = new class31(new class154(var4));
        } catch (Exception var14) {
        }
        try {
            if (var2 != null) {
                var2.method1410();
            }
        } catch (Exception var13) {
        }
        Statics.field2945 = var3;
        Statics.field1656 = this.getToolkit().getSystemClipboard();
        String var11 = Statics.field1617;
        class115.field1788 = this;
        class115.field1787 = var11;
        if (field310 != 0) {
            field303 = true;
        }
        int var12 = Statics.field2945.field698;
        field331 = 0L;
        if (var12 >= 2) {
            field504 = true;
        } else {
            field504 = false;
        }
        method1901();
        if (field294 >= 25) {
            method2537();
        }
        field1779 = true;
    }

    @ObfuscatedName("client.s(B)V")
    public final void method335() {
        field432++;
        this.method270();
        while (true) {
            class129 var1 = class184.field2732;
            class181 var2;
            synchronized (class184.field2732) {
                var2 = (class181) class184.field2729.method2337();
            }
            if (var2 == null) {
                class139.method2045();
                method2056();
                class106 var4 = class106.field1703;
                synchronized (class106.field1703) {
                    class106.field1730++;
                    class106.field1701 = class106.field1729;
                    class106.field1728 = 0;
                    if (class106.field1707 >= 0) {
                        while (class106.field1721 != class106.field1707) {
                            int var6 = class106.field1720[class106.field1721];
                            class106.field1721 = class106.field1721 + 1 & 0x7F;
                            if (var6 < 0) {
                                class106.field1719[~var6] = false;
                            } else {
                                if (!class106.field1719[var6] && class106.field1728 < class106.field1725.length - 1) {
                                    class106.field1725[++class106.field1728 - 1] = var6;
                                }
                                class106.field1719[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class106.field1719[var5] = false;
                        }
                        class106.field1707 = class106.field1721;
                    }
                    class106.field1729 = class106.field1727;
                }
                class116 var8 = class116.field1804;
                synchronized (class116.field1804) {
                    class116.field1803 = class116.field1802;
                    class116.field1806 = class116.field1800;
                    class116.field1807 = class116.field1808;
                    class116.field1812 = class116.field1805;
                    class116.field1813 = class116.field1809;
                    class116.field1814 = class116.field1810;
                    class116.field1815 = class116.field1811;
                    class116.field1805 = 0;
                }
                if (Statics.field949 != null) {
                    int var10 = Statics.field949.method2003();
                    field488 = var10;
                }
                int var10002;
                if (field294 == 0) {
                    method213();
                    class114.method2237();
                } else if (field294 == 5) {
                    class42.method3149(this);
                    method213();
                    class114.method2237();
                } else if (field294 == 10 || field294 == 11) {
                    class42.method3149(this);
                } else if (field294 == 20) {
                    class42.method3149(this);
                    method3332();
                } else if (field294 == 25) {
                    method3148(false);
                    field388 = 0;
                    boolean var11 = true;
                    for (int var12 = 0; var12 < Statics.field2010.length; var12++) {
                        if (Statics.field960[var12] != -1 && Statics.field2010[var12] == null) {
                            Statics.field2010[var12] = Statics.field2095.method3153(Statics.field960[var12], 0);
                            if (Statics.field2010[var12] == null) {
                                var11 = false;
                                field388++;
                            }
                        }
                        if (Statics.field1848[var12] != -1 && Statics.field268[var12] == null) {
                            Statics.field268[var12] = Statics.field2095.method3213(Statics.field1848[var12], 0, Statics.field111[var12]);
                            if (Statics.field268[var12] == null) {
                                var11 = false;
                                field388++;
                            }
                        }
                    }
                    if (var11) {
                        field353 = 0;
                        boolean var13 = true;
                        for (int var14 = 0; var14 < Statics.field2010.length; var14++) {
                            byte[] var15 = Statics.field268[var14];
                            if (var15 != null) {
                                int var16 = (Statics.field2094[var14] >> 8) * 64 - Statics.field267;
                                int var17 = (Statics.field2094[var14] & 0xFF) * 64 - Statics.field3221;
                                if (field351) {
                                    var16 = 10;
                                    var17 = 10;
                                }
                                var13 &= class11.method1943(var15, var16, var17);
                            }
                        }
                        if (var13) {
                            if (field349 != 0) {
                                method70(class174.field2580 + class38.field785 + class38.field788 + 100 + "%" + class38.field783, true);
                            }
                            method2056();
                            method38();
                            method2056();
                            Statics.field144.method1712();
                            method2056();
                            System.gc();
                            for (int var18 = 0; var18 < 4; var18++) {
                                field350[var18].method2195();
                            }
                            for (int var19 = 0; var19 < 4; var19++) {
                                for (int var20 = 0; var20 < 104; var20++) {
                                    for (int var21 = 0; var21 < 104; var21++) {
                                        class11.field81[var19][var20][var21] = 0;
                                    }
                                }
                            }
                            method2056();
                            class11.method1209();
                            int var22 = Statics.field2010.length;
                            class32.method690();
                            method3148(true);
                            if (!field351) {
                                int var23 = 0;
                                label2511: while (true) {
                                    if (var23 >= var22) {
                                        for (int var37 = 0; var37 < var22; var37++) {
                                            int var38 = (Statics.field2094[var37] >> 8) * 64 - Statics.field267;
                                            int var39 = (Statics.field2094[var37] & 0xFF) * 64 - Statics.field3221;
                                            byte[] var40 = Statics.field2010[var37];
                                            if (var40 == null && Statics.field85 < 800) {
                                                method2056();
                                                class11.method165(var38, var39, 64, 64);
                                            }
                                        }
                                        method3148(true);
                                        int var41 = 0;
                                        while (true) {
                                            if (var41 >= var22) {
                                                break label2511;
                                            }
                                            byte[] var42 = Statics.field268[var41];
                                            if (var42 != null) {
                                                int var43 = (Statics.field2094[var41] >> 8) * 64 - Statics.field267;
                                                int var44 = (Statics.field2094[var41] & 0xFF) * 64 - Statics.field3221;
                                                method2056();
                                                class88 var45 = Statics.field144;
                                                class118[] var46 = field350;
                                                class154 var47 = new class154(var42);
                                                int var48 = -1;
                                                while (true) {
                                                    int var49 = var47.method2854();
                                                    if (var49 == 0) {
                                                        break;
                                                    }
                                                    var48 += var49;
                                                    int var50 = 0;
                                                    while (true) {
                                                        int var51 = var47.method2854();
                                                        if (var51 == 0) {
                                                            break;
                                                        }
                                                        var50 += var51 - 1;
                                                        int var52 = var50 & 0x3F;
                                                        int var53 = var50 >> 6 & 0x3F;
                                                        int var54 = var50 >> 12;
                                                        int var55 = var47.method2878();
                                                        int var56 = var55 >> 2;
                                                        int var57 = var55 & 0x3;
                                                        int var58 = var43 + var53;
                                                        int var59 = var44 + var52;
                                                        if (var58 > 0 && var59 > 0 && var58 < 103 && var59 < 103) {
                                                            int var60 = var54;
                                                            if ((class11.field81[1][var58][var59] & 0x2) == 2) {
                                                                var60 = var54 - 1;
                                                            }
                                                            class118 var61 = null;
                                                            if (var60 >= 0) {
                                                                var61 = var46[var60];
                                                            }
                                                            class11.method185(var54, var58, var59, var48, var57, var56, var45, var61);
                                                        }
                                                    }
                                                }
                                            }
                                            var41++;
                                        }
                                    }
                                    int var24 = (Statics.field2094[var23] >> 8) * 64 - Statics.field267;
                                    int var25 = (Statics.field2094[var23] & 0xFF) * 64 - Statics.field3221;
                                    byte[] var26 = Statics.field2010[var23];
                                    if (var26 != null) {
                                        method2056();
                                        int var27 = Statics.field76 * 8 - 48;
                                        int var28 = Statics.field85 * 8 - 48;
                                        class118[] var29 = field350;
                                        int var30 = 0;
                                        label2508: while (true) {
                                            if (var30 >= 4) {
                                                class154 var33 = new class154(var26);
                                                int var34 = 0;
                                                while (true) {
                                                    if (var34 >= 4) {
                                                        break label2508;
                                                    }
                                                    for (int var35 = 0; var35 < 64; var35++) {
                                                        for (int var36 = 0; var36 < 64; var36++) {
                                                            class11.method22(var33, var34, var24 + var35, var25 + var36, var27, var28, 0);
                                                        }
                                                    }
                                                    var34++;
                                                }
                                            }
                                            for (int var31 = 0; var31 < 64; var31++) {
                                                for (int var32 = 0; var32 < 64; var32++) {
                                                    if (var24 + var31 > 0 && var24 + var31 < 103 && var25 + var32 > 0 && var25 + var32 < 103) {
                                                        var29[var30].field1837[var24 + var31][var25 + var32] &= 0xFEFFFFFF;
                                                    }
                                                }
                                            }
                                            var30++;
                                        }
                                    }
                                    var23++;
                                }
                            }
                            if (field351) {
                                int var62 = 0;
                                label2444: while (true) {
                                    if (var62 >= 4) {
                                        for (int var93 = 0; var93 < 13; var93++) {
                                            for (int var94 = 0; var94 < 13; var94++) {
                                                int var95 = field352[0][var93][var94];
                                                if (var95 == -1) {
                                                    class11.method165(var93 * 8, var94 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method3148(true);
                                        int var96 = 0;
                                        while (true) {
                                            if (var96 >= 4) {
                                                break label2444;
                                            }
                                            method2056();
                                            for (int var97 = 0; var97 < 13; var97++) {
                                                label2367: for (int var98 = 0; var98 < 13; var98++) {
                                                    int var99 = field352[var96][var97][var98];
                                                    if (var99 != -1) {
                                                        int var100 = var99 >> 24 & 0x3;
                                                        int var101 = var99 >> 1 & 0x3;
                                                        int var102 = var99 >> 14 & 0x3FF;
                                                        int var103 = var99 >> 3 & 0x7FF;
                                                        int var104 = (var102 / 8 << 8) + var103 / 8;
                                                        for (int var105 = 0; var105 < Statics.field2094.length; var105++) {
                                                            if (Statics.field2094[var105] == var104 && Statics.field268[var105] != null) {
                                                                byte[] var106 = Statics.field268[var105];
                                                                int var107 = var97 * 8;
                                                                int var108 = var98 * 8;
                                                                int var109 = (var102 & 0x7) * 8;
                                                                int var110 = (var103 & 0x7) * 8;
                                                                class88 var111 = Statics.field144;
                                                                class118[] var112 = field350;
                                                                class154 var113 = new class154(var106);
                                                                int var114 = -1;
                                                                while (true) {
                                                                    int var115 = var113.method2854();
                                                                    if (var115 == 0) {
                                                                        continue label2367;
                                                                    }
                                                                    var114 += var115;
                                                                    int var116 = 0;
                                                                    while (true) {
                                                                        int var117 = var113.method2854();
                                                                        if (var117 == 0) {
                                                                            break;
                                                                        }
                                                                        var116 += var117 - 1;
                                                                        int var118 = var116 & 0x3F;
                                                                        int var119 = var116 >> 6 & 0x3F;
                                                                        int var120 = var116 >> 12;
                                                                        int var121 = var113.method2878();
                                                                        int var122 = var121 >> 2;
                                                                        int var123 = var121 & 0x3;
                                                                        if (var100 == var120 && var119 >= var109 && var119 < var109 + 8 && var118 >= var110 && var118 < var110 + 8) {
                                                                            class198 var124 = Statics.method935(var114);
                                                                            int var125 = var107 + class169.method781(var119 & 0x7, var118 & 0x7, var101, var124.field2914, var124.field2933, var123);
                                                                            int var127 = var119 & 0x7;
                                                                            int var128 = var118 & 0x7;
                                                                            int var130 = var124.field2914;
                                                                            int var131 = var124.field2933;
                                                                            if ((var123 & 0x1) == 1) {
                                                                                int var132 = var130;
                                                                                var130 = var131;
                                                                                var131 = var132;
                                                                            }
                                                                            int var133 = var101 & 0x3;
                                                                            int var134;
                                                                            if (var133 == 0) {
                                                                                var134 = var128;
                                                                            } else if (var133 == 1) {
                                                                                var134 = 7 - var127 - (var130 - 1);
                                                                            } else if (var133 == 2) {
                                                                                var134 = 7 - var128 - (var131 - 1);
                                                                            } else {
                                                                                var134 = var127;
                                                                            }
                                                                            int var135 = var108 + var134;
                                                                            if (var125 > 0 && var135 > 0 && var125 < 103 && var135 < 103) {
                                                                                int var136 = var96;
                                                                                if ((class11.field81[1][var125][var135] & 0x2) == 2) {
                                                                                    var136 = var96 - 1;
                                                                                }
                                                                                class118 var137 = null;
                                                                                if (var136 >= 0) {
                                                                                    var137 = var112[var136];
                                                                                }
                                                                                class11.method185(var96, var125, var135, var114, var101 + var123 & 0x3, var122, var111, var137);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var96++;
                                        }
                                    }
                                    method2056();
                                    for (int var63 = 0; var63 < 13; var63++) {
                                        for (int var64 = 0; var64 < 13; var64++) {
                                            boolean var65 = false;
                                            int var66 = field352[var62][var63][var64];
                                            if (var66 != -1) {
                                                int var67 = var66 >> 24 & 0x3;
                                                int var68 = var66 >> 1 & 0x3;
                                                int var69 = var66 >> 14 & 0x3FF;
                                                int var70 = var66 >> 3 & 0x7FF;
                                                int var71 = (var69 / 8 << 8) + var70 / 8;
                                                for (int var72 = 0; var72 < Statics.field2094.length; var72++) {
                                                    if (Statics.field2094[var72] == var71 && Statics.field2010[var72] != null) {
                                                        byte[] var73 = Statics.field2010[var72];
                                                        int var74 = var63 * 8;
                                                        int var75 = var64 * 8;
                                                        int var76 = (var69 & 0x7) * 8;
                                                        int var77 = (var70 & 0x7) * 8;
                                                        class118[] var78 = field350;
                                                        for (int var79 = 0; var79 < 8; var79++) {
                                                            for (int var80 = 0; var80 < 8; var80++) {
                                                                if (var74 + var79 > 0 && var74 + var79 < 103 && var75 + var80 > 0 && var75 + var80 < 103) {
                                                                    var78[var62].field1837[var74 + var79][var75 + var80] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class154 var81 = new class154(var73);
                                                        for (int var82 = 0; var82 < 4; var82++) {
                                                            for (int var83 = 0; var83 < 64; var83++) {
                                                                for (int var84 = 0; var84 < 64; var84++) {
                                                                    if (var67 == var82 && var83 >= var76 && var83 < var76 + 8 && var84 >= var77 && var84 < var77 + 8) {
                                                                        int var88 = var83 & 0x7;
                                                                        int var89 = var84 & 0x7;
                                                                        int var91 = var68 & 0x3;
                                                                        int var92;
                                                                        if (var91 == 0) {
                                                                            var92 = var88;
                                                                        } else if (var91 == 1) {
                                                                            var92 = var89;
                                                                        } else if (var91 == 2) {
                                                                            var92 = 7 - var88;
                                                                        } else {
                                                                            var92 = 7 - var89;
                                                                        }
                                                                        class11.method22(var81, var62, var74 + var92, var75 + class169.method2238(var83 & 0x7, var84 & 0x7, var68), 0, 0, var68);
                                                                    } else {
                                                                        class11.method22(var81, 0, -1, -1, 0, 0, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var65 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var65) {
                                                class11.method2925(var62, var63 * 8, var64 * 8);
                                            }
                                        }
                                    }
                                    var62++;
                                }
                            }
                            method3148(true);
                            method38();
                            method2056();
                            class88 var138 = Statics.field144;
                            class118[] var139 = field350;
                            for (int var140 = 0; var140 < 4; var140++) {
                                for (int var141 = 0; var141 < 104; var141++) {
                                    for (int var142 = 0; var142 < 104; var142++) {
                                        if ((class11.field81[var140][var141][var142] & 0x1) == 1) {
                                            int var143 = var140;
                                            if ((class11.field81[1][var141][var142] & 0x2) == 2) {
                                                var143 = var140 - 1;
                                            }
                                            if (var143 >= 0) {
                                                var139[var143].method2199(var141, var142);
                                            }
                                        }
                                    }
                                }
                            }
                            class11.field92 += (int) (Math.random() * 5.0D) - 2;
                            if (class11.field92 < -8) {
                                class11.field92 = -8;
                            }
                            if (class11.field92 > 8) {
                                class11.field92 = 8;
                            }
                            class11.field93 += (int) (Math.random() * 5.0D) - 2;
                            if (class11.field93 < -16) {
                                class11.field93 = -16;
                            }
                            if (class11.field93 > 16) {
                                class11.field93 = 16;
                            }
                            for (int var144 = 0; var144 < 4; var144++) {
                                byte[][] var145 = Statics.field84[var144];
                                int var146 = (int) Math.sqrt(5100.0D);
                                int var147 = var146 * 768 >> 8;
                                for (int var148 = 1; var148 < 103; var148++) {
                                    for (int var149 = 1; var149 < 103; var149++) {
                                        int var150 = class11.field87[var144][var149 + 1][var148] - class11.field87[var144][var149 - 1][var148];
                                        int var151 = class11.field87[var144][var149][var148 + 1] - class11.field87[var144][var149][var148 - 1];
                                        int var152 = (int) Math.sqrt((double) (var151 * var151 + var150 * var150 + 65536));
                                        int var153 = (var150 << 8) / var152;
                                        int var154 = 65536 / var152;
                                        int var155 = (var151 << 8) / var152;
                                        int var156 = (var155 * -50 + var153 * -50 + var154 * -10) / var147 + 96;
                                        int var157 = (var145[var149][var148] >> 1) + (var145[var149][var148 + 1] >> 3) + (var145[var149][var148 - 1] >> 2) + (var145[var149 - 1][var148] >> 2) + (var145[var149 + 1][var148] >> 3);
                                        Statics.field231[var149][var148] = var156 - var157;
                                    }
                                }
                                for (int var158 = 0; var158 < 104; var158++) {
                                    Statics.field90[var158] = 0;
                                    Statics.field57[var158] = 0;
                                    Statics.field1128[var158] = 0;
                                    Statics.field2702[var158] = 0;
                                    Statics.field62[var158] = 0;
                                }
                                for (int var159 = -5; var159 < 109; var159++) {
                                    for (int var160 = 0; var160 < 104; var160++) {
                                        int var161 = var159 + 5;
                                        if (var161 >= 0 && var161 < 104) {
                                            int var162 = Statics.field3080[var144][var161][var160] & 0xFF;
                                            if (var162 > 0) {
                                                int var163 = var162 - 1;
                                                class192 var164 = (class192) class192.field2817.method2275((long) var163);
                                                class192 var165;
                                                if (var164 == null) {
                                                    byte[] var166 = Statics.field2813.method3153(1, var163);
                                                    class192 var167 = new class192();
                                                    if (var166 != null) {
                                                        var167.method3339(new class154(var166), var163);
                                                    }
                                                    var167.method3344();
                                                    class192.field2817.method2282(var167, (long) var163);
                                                    var165 = var167;
                                                } else {
                                                    var165 = var164;
                                                }
                                                Statics.field90[var160] += var165.field2816;
                                                Statics.field57[var160] += var165.field2812;
                                                Statics.field1128[var160] += var165.field2815;
                                                Statics.field2702[var160] += var165.field2818;
                                                var10002 = Statics.field62[var160]++;
                                            }
                                        }
                                        int var169 = var159 - 5;
                                        if (var169 >= 0 && var169 < 104) {
                                            int var170 = Statics.field3080[var144][var169][var160] & 0xFF;
                                            if (var170 > 0) {
                                                int var171 = var170 - 1;
                                                class192 var172 = (class192) class192.field2817.method2275((long) var171);
                                                class192 var173;
                                                if (var172 == null) {
                                                    byte[] var174 = Statics.field2813.method3153(1, var171);
                                                    class192 var175 = new class192();
                                                    if (var174 != null) {
                                                        var175.method3339(new class154(var174), var171);
                                                    }
                                                    var175.method3344();
                                                    class192.field2817.method2282(var175, (long) var171);
                                                    var173 = var175;
                                                } else {
                                                    var173 = var172;
                                                }
                                                Statics.field90[var160] -= var173.field2816;
                                                Statics.field57[var160] -= var173.field2812;
                                                Statics.field1128[var160] -= var173.field2815;
                                                Statics.field2702[var160] -= var173.field2818;
                                                var10002 = Statics.field62[var160]--;
                                            }
                                        }
                                    }
                                    if (var159 >= 1 && var159 < 103) {
                                        int var177 = 0;
                                        int var178 = 0;
                                        int var179 = 0;
                                        int var180 = 0;
                                        int var181 = 0;
                                        for (int var182 = -5; var182 < 109; var182++) {
                                            int var183 = var182 + 5;
                                            if (var183 >= 0 && var183 < 104) {
                                                var177 += Statics.field90[var183];
                                                var178 += Statics.field57[var183];
                                                var179 += Statics.field1128[var183];
                                                var180 += Statics.field2702[var183];
                                                var181 += Statics.field62[var183];
                                            }
                                            int var184 = var182 - 5;
                                            if (var184 >= 0 && var184 < 104) {
                                                var177 -= Statics.field90[var184];
                                                var178 -= Statics.field57[var184];
                                                var179 -= Statics.field1128[var184];
                                                var180 -= Statics.field2702[var184];
                                                var181 -= Statics.field62[var184];
                                            }
                                            if (var182 >= 1 && var182 < 103 && (!field291 || (class11.field81[0][var159][var182] & 0x2) != 0 || (class11.field81[var144][var159][var182] & 0x10) == 0)) {
                                                if (var144 < class11.field83) {
                                                    class11.field83 = var144;
                                                }
                                                int var185 = Statics.field3080[var144][var159][var182] & 0xFF;
                                                int var186 = Statics.field88[var144][var159][var182] & 0xFF;
                                                if (var185 > 0 || var186 > 0) {
                                                    int var187 = class11.field87[var144][var159][var182];
                                                    int var188 = class11.field87[var144][var159 + 1][var182];
                                                    int var189 = class11.field87[var144][var159 + 1][var182 + 1];
                                                    int var190 = class11.field87[var144][var159][var182 + 1];
                                                    int var191 = Statics.field231[var159][var182];
                                                    int var192 = Statics.field231[var159 + 1][var182];
                                                    int var193 = Statics.field231[var159 + 1][var182 + 1];
                                                    int var194 = Statics.field231[var159][var182 + 1];
                                                    int var195 = -1;
                                                    int var196 = -1;
                                                    if (var185 > 0) {
                                                        int var197 = var177 * 256 / var180;
                                                        int var198 = var178 / var181;
                                                        int var199 = var179 / var181;
                                                        var195 = class11.method2924(var197, var198, var199);
                                                        int var200 = class11.field92 + var197 & 0xFF;
                                                        int var201 = class11.field93 + var199;
                                                        if (var201 < 0) {
                                                            var201 = 0;
                                                        } else if (var201 > 255) {
                                                            var201 = 255;
                                                        }
                                                        var196 = class11.method2924(var200, var198, var201);
                                                    }
                                                    if (var144 > 0) {
                                                        boolean var202 = true;
                                                        if (var185 == 0 && Statics.field19[var144][var159][var182] != 0) {
                                                            var202 = false;
                                                        }
                                                        if (var186 > 0) {
                                                            int var203 = var186 - 1;
                                                            class201 var204 = (class201) class201.field3048.method2275((long) var203);
                                                            class201 var205;
                                                            if (var204 == null) {
                                                                byte[] var206 = Statics.field37.method3153(4, var203);
                                                                class201 var207 = new class201();
                                                                if (var206 != null) {
                                                                    var207.method3592(new class154(var206), var203);
                                                                }
                                                                var207.method3591();
                                                                class201.field3048.method2282(var207, (long) var203);
                                                                var205 = var207;
                                                            } else {
                                                                var205 = var204;
                                                            }
                                                            if (!var205.field3058) {
                                                                var202 = false;
                                                            }
                                                        }
                                                        if (var202 && var187 == var188 && var187 == var189 && var187 == var190) {
                                                            Statics.field2123[var144][var159][var182] |= 0x924;
                                                        }
                                                    }
                                                    int var208 = 0;
                                                    if (var196 != -1) {
                                                        var208 = class85.field1462[class11.method1710(var196, 96)];
                                                    }
                                                    if (var186 == 0) {
                                                        var138.method1717(var144, var159, var182, 0, 0, -1, var187, var188, var189, var190, class11.method1710(var195, var191), class11.method1710(var195, var192), class11.method1710(var195, var193), class11.method1710(var195, var194), 0, 0, 0, 0, var208, 0);
                                                    } else {
                                                        int var209 = Statics.field19[var144][var159][var182] + 1;
                                                        byte var210 = Statics.field43[var144][var159][var182];
                                                        int var211 = var186 - 1;
                                                        class201 var212 = (class201) class201.field3048.method2275((long) var211);
                                                        class201 var213;
                                                        if (var212 == null) {
                                                            byte[] var214 = Statics.field37.method3153(4, var211);
                                                            class201 var215 = new class201();
                                                            if (var214 != null) {
                                                                var215.method3592(new class154(var214), var211);
                                                            }
                                                            var215.method3591();
                                                            class201.field3048.method2282(var215, (long) var211);
                                                            var213 = var215;
                                                        } else {
                                                            var213 = var212;
                                                        }
                                                        int var217 = var213.field3047;
                                                        int var218;
                                                        int var219;
                                                        if (var217 >= 0) {
                                                            var218 = Statics.field1458.method1432(var217);
                                                            var219 = -1;
                                                        } else if (var213.field3046 == 16711935) {
                                                            var219 = -2;
                                                            var217 = -1;
                                                            var218 = -2;
                                                        } else {
                                                            var219 = class11.method2924(var213.field3045, var213.field3051, var213.field3050);
                                                            int var220 = class11.field92 + var213.field3045 & 0xFF;
                                                            int var221 = class11.field93 + var213.field3050;
                                                            if (var221 < 0) {
                                                                var221 = 0;
                                                            } else if (var221 > 255) {
                                                                var221 = 255;
                                                            }
                                                            var218 = class11.method2924(var220, var213.field3051, var221);
                                                        }
                                                        int var222 = 0;
                                                        if (var218 != -2) {
                                                            var222 = class85.field1462[class11.method87(var218, 96)];
                                                        }
                                                        if (var213.field3049 != -1) {
                                                            int var223 = class11.field92 + var213.field3057 & 0xFF;
                                                            int var224 = class11.field93 + var213.field3055;
                                                            if (var224 < 0) {
                                                                var224 = 0;
                                                            } else if (var224 > 255) {
                                                                var224 = 255;
                                                            }
                                                            int var225 = class11.method2924(var223, var213.field3054, var224);
                                                            var222 = class85.field1462[class11.method87(var225, 96)];
                                                        }
                                                        var138.method1717(var144, var159, var182, var209, var210, var217, var187, var188, var189, var190, class11.method1710(var195, var191), class11.method1710(var195, var192), class11.method1710(var195, var193), class11.method1710(var195, var194), class11.method87(var219, var191), class11.method87(var219, var192), class11.method87(var219, var193), class11.method87(var219, var194), var208, var222);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var226 = 1; var226 < 103; var226++) {
                                    for (int var227 = 1; var227 < 103; var227++) {
                                        var138.method1716(var144, var227, var226, Statics.method808(var144, var227, var226));
                                    }
                                }
                                Statics.field3080[var144] = (byte[][]) null;
                                Statics.field88[var144] = (byte[][]) null;
                                Statics.field19[var144] = (byte[][]) null;
                                Statics.field43[var144] = (byte[][]) null;
                                Statics.field84[var144] = (byte[][]) null;
                            }
                            var138.method1742(-50, -10, -50);
                            for (int var228 = 0; var228 < 104; var228++) {
                                for (int var229 = 0; var229 < 104; var229++) {
                                    if ((class11.field81[1][var228][var229] & 0x2) == 2) {
                                        var138.method1839(var228, var229);
                                    }
                                }
                            }
                            int var230 = 1;
                            int var231 = 2;
                            int var232 = 4;
                            for (int var233 = 0; var233 < 4; var233++) {
                                if (var233 > 0) {
                                    var230 <<= 0x3;
                                    var231 <<= 0x3;
                                    var232 <<= 0x3;
                                }
                                for (int var234 = 0; var234 <= var233; var234++) {
                                    for (int var235 = 0; var235 <= 104; var235++) {
                                        for (int var236 = 0; var236 <= 104; var236++) {
                                            if ((Statics.field2123[var234][var236][var235] & var230) != 0) {
                                                int var237 = var235;
                                                int var238 = var235;
                                                int var239 = var234;
                                                int var240 = var234;
                                                while (var237 > 0 && (Statics.field2123[var234][var236][var237 - 1] & var230) != 0) {
                                                    var237--;
                                                }
                                                while (var238 < 104 && (Statics.field2123[var234][var236][var238 + 1] & var230) != 0) {
                                                    var238++;
                                                }
                                                label2093: while (var239 > 0) {
                                                    for (int var241 = var237; var241 <= var238; var241++) {
                                                        if ((Statics.field2123[var239 - 1][var236][var241] & var230) == 0) {
                                                            break label2093;
                                                        }
                                                    }
                                                    var239--;
                                                }
                                                label2082: while (var240 < var233) {
                                                    for (int var242 = var237; var242 <= var238; var242++) {
                                                        if ((Statics.field2123[var240 + 1][var236][var242] & var230) == 0) {
                                                            break label2082;
                                                        }
                                                    }
                                                    var240++;
                                                }
                                                int var243 = (var240 + 1 - var239) * (var238 - var237 + 1);
                                                if (var243 >= 8) {
                                                    short var244 = 240;
                                                    int var245 = class11.field87[var240][var236][var237] - var244;
                                                    int var246 = class11.field87[var239][var236][var237];
                                                    class88.method1715(var233, 1, var236 * 128, var236 * 128, var237 * 128, var238 * 128 + 128, var245, var246);
                                                    for (int var247 = var239; var247 <= var240; var247++) {
                                                        for (int var248 = var237; var248 <= var238; var248++) {
                                                            Statics.field2123[var247][var236][var248] &= ~var230;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field2123[var234][var236][var235] & var231) != 0) {
                                                int var249 = var236;
                                                int var250 = var236;
                                                int var251 = var234;
                                                int var252 = var234;
                                                while (var249 > 0 && (Statics.field2123[var234][var249 - 1][var235] & var231) != 0) {
                                                    var249--;
                                                }
                                                while (var250 < 104 && (Statics.field2123[var234][var250 + 1][var235] & var231) != 0) {
                                                    var250++;
                                                }
                                                label2146: while (var251 > 0) {
                                                    for (int var253 = var249; var253 <= var250; var253++) {
                                                        if ((Statics.field2123[var251 - 1][var253][var235] & var231) == 0) {
                                                            break label2146;
                                                        }
                                                    }
                                                    var251--;
                                                }
                                                label2135: while (var252 < var233) {
                                                    for (int var254 = var249; var254 <= var250; var254++) {
                                                        if ((Statics.field2123[var252 + 1][var254][var235] & var231) == 0) {
                                                            break label2135;
                                                        }
                                                    }
                                                    var252++;
                                                }
                                                int var255 = (var252 + 1 - var251) * (var250 - var249 + 1);
                                                if (var255 >= 8) {
                                                    short var256 = 240;
                                                    int var257 = class11.field87[var252][var249][var235] - var256;
                                                    int var258 = class11.field87[var251][var249][var235];
                                                    class88.method1715(var233, 2, var249 * 128, var250 * 128 + 128, var235 * 128, var235 * 128, var257, var258);
                                                    for (int var259 = var251; var259 <= var252; var259++) {
                                                        for (int var260 = var249; var260 <= var250; var260++) {
                                                            Statics.field2123[var259][var260][var235] &= ~var231;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field2123[var234][var236][var235] & var232) != 0) {
                                                int var261 = var236;
                                                int var262 = var236;
                                                int var263 = var235;
                                                int var264 = var235;
                                                while (var263 > 0 && (Statics.field2123[var234][var236][var263 - 1] & var232) != 0) {
                                                    var263--;
                                                }
                                                while (var264 < 104 && (Statics.field2123[var234][var236][var264 + 1] & var232) != 0) {
                                                    var264++;
                                                }
                                                label2199: while (var261 > 0) {
                                                    for (int var265 = var263; var265 <= var264; var265++) {
                                                        if ((Statics.field2123[var234][var261 - 1][var265] & var232) == 0) {
                                                            break label2199;
                                                        }
                                                    }
                                                    var261--;
                                                }
                                                label2188: while (var262 < 104) {
                                                    for (int var266 = var263; var266 <= var264; var266++) {
                                                        if ((Statics.field2123[var234][var262 + 1][var266] & var232) == 0) {
                                                            break label2188;
                                                        }
                                                    }
                                                    var262++;
                                                }
                                                if ((var262 - var261 + 1) * (var264 - var263 + 1) >= 4) {
                                                    int var267 = class11.field87[var234][var261][var263];
                                                    class88.method1715(var233, 4, var261 * 128, var262 * 128 + 128, var263 * 128, var264 * 128 + 128, var267, var267);
                                                    for (int var268 = var261; var268 <= var262; var268++) {
                                                        for (int var269 = var263; var269 <= var264; var269++) {
                                                            Statics.field2123[var234][var268][var269] &= ~var232;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            method3148(true);
                            int var270 = class11.field83;
                            if (var270 > Statics.field1834) {
                                var270 = Statics.field1834;
                            }
                            if (var270 < Statics.field1834 - 1) {
                                int var271 = Statics.field1834 - 1;
                            }
                            if (field291) {
                                Statics.field144.method1713(class11.field83);
                            } else {
                                Statics.field144.method1713(0);
                            }
                            for (int var272 = 0; var272 < 104; var272++) {
                                for (int var273 = 0; var273 < 104; var273++) {
                                    method2046(var272, var273);
                                }
                            }
                            method2056();
                            method2624();
                            class198.field2925.method2277();
                            if (Statics.field1836 != null) {
                                field333.method2948(238);
                                field333.method2689(1057001181);
                            }
                            if (!field351) {
                                int var274 = (Statics.field76 - 6) / 8;
                                int var275 = (Statics.field76 + 6) / 8;
                                int var276 = (Statics.field85 - 6) / 8;
                                int var277 = (Statics.field85 + 6) / 8;
                                for (int var278 = var274 - 1; var278 <= var275 + 1; var278++) {
                                    for (int var279 = var276 - 1; var279 <= var277 + 1; var279++) {
                                        if (var278 < var274 || var278 > var275 || var279 < var276 || var279 > var277) {
                                            Statics.field2095.method3172("m" + var278 + "_" + var279);
                                            Statics.field2095.method3172("l" + var278 + "_" + var279);
                                        }
                                    }
                                }
                            }
                            method691(30);
                            method2056();
                            class11.method863();
                            field333.method2948(88);
                            class114.method2237();
                        } else {
                            field349 = 2;
                        }
                    } else {
                        field349 = 1;
                    }
                }
                if (field294 == 30) {
                    if (field499 > 1) {
                        field499--;
                    }
                    if (field343 > 0) {
                        field343--;
                    }
                    if (field344) {
                        field344 = false;
                        if (field343 > 0) {
                            method768();
                        } else {
                            method691(40);
                            Statics.field237 = Statics.field31;
                            Statics.field31 = null;
                        }
                    } else {
                        if (!field428) {
                            method2018();
                            field434[0] = class174.field2595;
                            field410[0] = "";
                            field498[0] = 1006;
                            field515 = 1;
                        }
                        for (int var280 = 0; var280 < 100 && method2019(); var280++) {
                        }
                        if (field294 == 30) {
                            while (class228.method783()) {
                                field333.method2948(34);
                                field333.method2688(0);
                                int var281 = field333.field2087;
                                class228.method3647(field333);
                                field333.method2698(field333.field2087 - var281);
                            }
                            Object var282 = Statics.field287.field214;
                            synchronized (Statics.field287.field214) {
                                if (!field285) {
                                    Statics.field287.field222 = 0;
                                } else if (class116.field1812 != 0 || Statics.field287.field222 >= 40) {
                                    field333.method2948(106);
                                    field333.method2688(0);
                                    int var283 = field333.field2087;
                                    int var284 = 0;
                                    for (int var285 = 0; var285 < Statics.field287.field222 && field333.field2087 - var283 < 240; var285++) {
                                        var284++;
                                        int var286 = Statics.field287.field213[var285];
                                        if (var286 < 0) {
                                            var286 = 0;
                                        } else if (var286 > 502) {
                                            var286 = 502;
                                        }
                                        int var287 = Statics.field287.field216[var285];
                                        if (var287 < 0) {
                                            var287 = 0;
                                        } else if (var287 > 764) {
                                            var287 = 764;
                                        }
                                        int var288 = var286 * 765 + var287;
                                        if (Statics.field287.field213[var285] == -1 && Statics.field287.field216[var285] == -1) {
                                            var287 = -1;
                                            var286 = -1;
                                            var288 = 524287;
                                        }
                                        if (field390 != var287 || field300 != var286) {
                                            int var289 = var287 - field390;
                                            field390 = var287;
                                            int var290 = var286 - field300;
                                            field300 = var286;
                                            if (field301 < 8 && var289 >= -32 && var289 <= 31 && var290 >= -32 && var290 <= 31) {
                                                var289 += 32;
                                                var290 += 32;
                                                field333.method2687((field301 << 12) + (var289 << 6) + var290);
                                                field301 = 0;
                                            } else if (field301 < 8) {
                                                field333.method2686((field301 << 19) + 8388608 + var288);
                                                field301 = 0;
                                            } else {
                                                field333.method2689((field301 << 19) + -1073741824 + var288);
                                                field301 = 0;
                                            }
                                        } else if (field301 < 2047) {
                                            field301++;
                                        }
                                    }
                                    field333.method2698(field333.field2087 - var283);
                                    if (var284 >= Statics.field287.field222) {
                                        Statics.field287.field222 = 0;
                                    } else {
                                        Statics.field287.field222 -= var284;
                                        for (int var291 = 0; var291 < Statics.field287.field222; var291++) {
                                            Statics.field287.field216[var291] = Statics.field287.field216[var284 + var291];
                                            Statics.field287.field213[var291] = Statics.field287.field213[var284 + var291];
                                        }
                                    }
                                }
                            }
                            if (class116.field1812 == 1 || !Statics.field292 && class116.field1812 == 4 || class116.field1812 == 2) {
                                long var293 = (class116.field1815 - field297) / 50L;
                                if (var293 > 4095L) {
                                    var293 = 4095L;
                                }
                                field297 = class116.field1815;
                                int var295 = class116.field1814;
                                if (var295 < 0) {
                                    var295 = 0;
                                } else if (var295 > Statics.field1129) {
                                    var295 = Statics.field1129;
                                }
                                int var296 = class116.field1813;
                                if (var296 < 0) {
                                    var296 = 0;
                                } else if (var296 > Statics.field1757) {
                                    var296 = Statics.field1757;
                                }
                                int var297 = (int) var293;
                                field333.method2948(0);
                                field333.method2687((var297 << 1) + (class116.field1812 == 2 ? 1 : 0));
                                field333.method2687(var296);
                                field333.method2687(var295);
                            }
                            if (class106.field1728 > 0) {
                                field333.method2948(26);
                                field333.method2687(0);
                                int var298 = field333.field2087;
                                long var299 = class156.method1898();
                                for (int var301 = 0; var301 < class106.field1728; var301++) {
                                    long var302 = var299 - field516;
                                    if (var302 > 16777215L) {
                                        var302 = 16777215L;
                                    }
                                    field516 = var299;
                                    field333.method2686((int) var302);
                                    field333.method2688(class106.field1725[var301]);
                                }
                                field333.method2697(field333.field2087 - var298);
                            }
                            if (field380 > 0) {
                                field380--;
                            }
                            if (class106.field1719[96] || class106.field1719[97] || class106.field1719[98] || class106.field1719[99]) {
                                field377 = true;
                            }
                            if (field377 && field380 <= 0) {
                                field380 = 20;
                                field377 = false;
                                field333.method2948(96);
                                field333.method2725(field373);
                                field333.method2736(field374);
                            }
                            if (Statics.field134 && !field523) {
                                field523 = true;
                                field333.method2948(171);
                                field333.method2688(1);
                            }
                            if (!Statics.field134 && field523) {
                                field523 = false;
                                field333.method2948(171);
                                field333.method2688(0);
                            }
                            if (Statics.field1834 != field520) {
                                field520 = Statics.field1834;
                                int var304 = Statics.field1834;
                                int[] var305 = Statics.field596.field3227;
                                int var306 = var305.length;
                                for (int var307 = 0; var307 < var306; var307++) {
                                    var305[var307] = 0;
                                }
                                int var308 = 1;
                                while (true) {
                                    if (var308 >= 103) {
                                        int var311 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                                        int var312 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                                        Statics.field596.method3927();
                                        for (int var313 = 1; var313 < 103; var313++) {
                                            for (int var314 = 1; var314 < 103; var314++) {
                                                if ((class11.field81[var304][var314][var313] & 0x18) == 0) {
                                                    method2012(var304, var314, var313, var311, var312);
                                                }
                                                if (var304 < 3 && (class11.field81[var304 + 1][var314][var313] & 0x8) != 0) {
                                                    method2012(var304 + 1, var314, var313, var311, var312);
                                                }
                                            }
                                        }
                                        field521 = 0;
                                        for (int var315 = 0; var315 < 104; var315++) {
                                            for (int var316 = 0; var316 < 104; var316++) {
                                                int var317 = Statics.field144.method1753(Statics.field1834, var315, var316);
                                                if (var317 != 0) {
                                                    int var318 = var317 >> 14 & 0x7FFF;
                                                    int var319 = Statics.method935(var318).field2927;
                                                    if (var319 >= 0) {
                                                        int var320 = var315;
                                                        int var321 = var316;
                                                        if (var319 != 22 && var319 != 29 && var319 != 34 && var319 != 36 && var319 != 46 && var319 != 47 && var319 != 48) {
                                                            int[][] var322 = field350[Statics.field1834].field1837;
                                                            for (int var323 = 0; var323 < 10; var323++) {
                                                                int var324 = (int) (Math.random() * 4.0D);
                                                                if (var324 == 0 && var320 > 0 && var320 > var315 - 3 && (var322[var320 - 1][var321] & 0x1240108) == 0) {
                                                                    var320--;
                                                                }
                                                                if (var324 == 1 && var320 < 103 && var320 < var315 + 3 && (var322[var320 + 1][var321] & 0x1240180) == 0) {
                                                                    var320++;
                                                                }
                                                                if (var324 == 2 && var321 > 0 && var321 > var316 - 3 && (var322[var320][var321 - 1] & 0x1240102) == 0) {
                                                                    var321--;
                                                                }
                                                                if (var324 == 3 && var321 < 103 && var321 < var316 + 3 && (var322[var320][var321 + 1] & 0x1240120) == 0) {
                                                                    var321++;
                                                                }
                                                            }
                                                        }
                                                        field359[field521] = Statics.field3103[var319];
                                                        field476[field521] = var320;
                                                        field397[field521] = var321;
                                                        field521++;
                                                    }
                                                }
                                            }
                                        }
                                        Statics.field1074.method3882();
                                        break;
                                    }
                                    int var309 = (103 - var308) * 2048 + 24628;
                                    for (int var310 = 1; var310 < 103; var310++) {
                                        if ((class11.field81[var304][var310][var308] & 0x18) == 0) {
                                            Statics.field144.method1745(var305, var309, 512, var304, var310, var308);
                                        }
                                        if (var304 < 3 && (class11.field81[var304 + 1][var310][var308] & 0x8) != 0) {
                                            Statics.field144.method1745(var305, var309, 512, var304 + 1, var310, var308);
                                        }
                                        var309 += 4;
                                    }
                                    var308++;
                                }
                            }
                            if (field294 == 30) {
                                method20();
                                method2622();
                                field338++;
                                if (field338 <= 750) {
                                    int var325 = class46.field917;
                                    int[] var326 = class46.field914;
                                    for (int var327 = 0; var327 < var325; var327++) {
                                        class24 var328 = field365[var326[var327]];
                                        if (var328 != null) {
                                            method2422(var328, 1);
                                        }
                                    }
                                    method189();
                                    int[] var329 = class46.field914;
                                    for (int var330 = 0; var330 < class46.field917; var330++) {
                                        class24 var331 = field365[var329[var330]];
                                        if (var331 != null && var331.field638 > 0) {
                                            var331.field638--;
                                            if (var331.field638 == 0) {
                                                var331.field652 = null;
                                            }
                                        }
                                    }
                                    for (int var332 = 0; var332 < field329; var332++) {
                                        int var333 = field286[var332];
                                        class36 var334 = field328[var333];
                                        if (var334 != null && var334.field638 > 0) {
                                            var334.field638--;
                                            if (var334.field638 == 0) {
                                                var334.field652 = null;
                                            }
                                        }
                                    }
                                    field366++;
                                    if (field400 != 0) {
                                        field427 += 20;
                                        if (field427 >= 400) {
                                            field400 = 0;
                                        }
                                    }
                                    if (Statics.field2774 != null) {
                                        field401++;
                                        if (field401 >= 15) {
                                            method974(Statics.field2774);
                                            Statics.field2774 = null;
                                        }
                                    }
                                    class170 var335 = Statics.field925;
                                    class170 var336 = Statics.field41;
                                    Statics.field925 = null;
                                    Statics.field41 = null;
                                    field564 = null;
                                    field414 = false;
                                    field468 = false;
                                    field421 = 0;
                                    while (true) {
                                        while (class106.method197() && field421 < 128) {
                                            if (field426 >= 2 && class106.field1719[82] && Statics.field132 == 66) {
                                                String var337 = class48.method3145();
                                                Statics.field1656.setContents(new StringSelection(var337), (ClipboardOwner) null);
                                            } else {
                                                field522[field421] = Statics.field132;
                                                field299[field421] = Statics.field9;
                                                field421++;
                                            }
                                        }
                                        if (field450 != -1) {
                                            int var338 = field450;
                                            int var339 = Statics.field1757;
                                            int var340 = Statics.field1129;
                                            if (class170.method859(var338)) {
                                                method3571(Statics.field3297[var338], -1, 0, 0, var339, var340, 0, 0);
                                            }
                                        }
                                        field506++;
                                        while (true) {
                                            class19 var341;
                                            class170 var342;
                                            class170 var343;
                                            do {
                                                var341 = (class19) field532.method2337();
                                                if (var341 == null) {
                                                    while (true) {
                                                        class19 var344;
                                                        class170 var345;
                                                        class170 var346;
                                                        do {
                                                            var344 = (class19) field360.method2337();
                                                            if (var344 == null) {
                                                                while (true) {
                                                                    class19 var347;
                                                                    class170 var348;
                                                                    class170 var349;
                                                                    do {
                                                                        var347 = (class19) field489.method2337();
                                                                        if (var347 == null) {
                                                                            Statics.method173();
                                                                            if (Statics.field160 == null && field463 == null) {
                                                                                int var350 = class116.field1812;
                                                                                if (field428) {
                                                                                    if (var350 != 1 && (Statics.field292 || var350 != 4)) {
                                                                                        int var351 = class116.field1806;
                                                                                        int var352 = class116.field1807;
                                                                                        if (var351 < Statics.field2147 - 10 || var351 > Statics.field838 + Statics.field2147 + 10 || var352 < Statics.field2131 - 10 || var352 > Statics.field2131 + Statics.field110 + 10) {
                                                                                            field428 = false;
                                                                                            method862(Statics.field2147, Statics.field2131, Statics.field838, Statics.field110);
                                                                                        }
                                                                                    }
                                                                                    if (var350 == 1 || !Statics.field292 && var350 == 4) {
                                                                                        int var353 = Statics.field2147;
                                                                                        int var354 = Statics.field2131;
                                                                                        int var355 = Statics.field838;
                                                                                        int var356 = class116.field1813;
                                                                                        int var357 = class116.field1814;
                                                                                        int var358 = -1;
                                                                                        for (int var359 = 0; var359 < field515; var359++) {
                                                                                            int var360 = (field515 - 1 - var359) * 15 + var354 + 31;
                                                                                            if (var356 > var353 && var356 < var353 + var355 && var357 > var360 - 13 && var357 < var360 + 3) {
                                                                                                var358 = var359;
                                                                                            }
                                                                                        }
                                                                                        if (var358 != -1 && var358 >= 0) {
                                                                                            int var361 = field430[var358];
                                                                                            int var362 = field574[var358];
                                                                                            int var363 = field498[var358];
                                                                                            int var364 = field433[var358];
                                                                                            String var365 = field434[var358];
                                                                                            String var366 = field410[var358];
                                                                                            method802(var361, var362, var363, var364, var365, var366, class116.field1813, class116.field1814);
                                                                                        }
                                                                                        field428 = false;
                                                                                        method862(Statics.field2147, Statics.field2131, Statics.field838, Statics.field110);
                                                                                    }
                                                                                } else {
                                                                                    label2821: {
                                                                                        int var367 = method24();
                                                                                        if ((var350 == 1 || !Statics.field292 && var350 == 4) && var367 >= 0) {
                                                                                            int var368 = field498[var367];
                                                                                            if (var368 == 39 || var368 == 40 || var368 == 41 || var368 == 42 || var368 == 43 || var368 == 33 || var368 == 34 || var368 == 35 || var368 == 36 || var368 == 37 || var368 == 38 || var368 == 1005) {
                                                                                                label2798: {
                                                                                                    int var369 = field430[var367];
                                                                                                    int var370 = field574[var367];
                                                                                                    class170 var371 = class170.method971(var370);
                                                                                                    int var372 = method221(var371);
                                                                                                    boolean var373 = (var372 >> 28 & 0x1) != 0;
                                                                                                    if (!var373) {
                                                                                                        int var374 = method221(var371);
                                                                                                        boolean var375 = (var374 >> 29 & 0x1) != 0;
                                                                                                        if (!var375) {
                                                                                                            break label2798;
                                                                                                        }
                                                                                                    }
                                                                                                    if (Statics.field160 != null && !field407) {
                                                                                                        int var376 = method24();
                                                                                                        if (field361 != 1 && !method102(var376) && field515 > 0) {
                                                                                                            int var377 = field404;
                                                                                                            int var378 = field443;
                                                                                                            method39(Statics.field158, var377, var378);
                                                                                                            Statics.field158 = null;
                                                                                                        }
                                                                                                    }
                                                                                                    field407 = false;
                                                                                                    field408 = 0;
                                                                                                    if (Statics.field160 != null) {
                                                                                                        method974(Statics.field160);
                                                                                                    }
                                                                                                    Statics.field160 = class170.method971(var370);
                                                                                                    field403 = var369;
                                                                                                    field404 = class116.field1813;
                                                                                                    field443 = class116.field1814;
                                                                                                    if (var367 >= 0) {
                                                                                                        method957(var367);
                                                                                                    }
                                                                                                    method974(Statics.field160);
                                                                                                    break label2821;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if ((var350 == 1 || !Statics.field292 && var350 == 4) && (field361 == 1 && field515 > 2 && !method3076() || method102(var367))) {
                                                                                            var350 = 2;
                                                                                        }
                                                                                        if ((var350 == 1 || !Statics.field292 && var350 == 4) && field515 > 0 && var367 >= 0) {
                                                                                            int var379 = field430[var367];
                                                                                            int var380 = field574[var367];
                                                                                            int var381 = field498[var367];
                                                                                            int var382 = field433[var367];
                                                                                            String var383 = field434[var367];
                                                                                            String var384 = field410[var367];
                                                                                            method802(var379, var380, var381, var382, var383, var384, class116.field1813, class116.field1814);
                                                                                        }
                                                                                        if (var350 == 2 && field515 > 0) {
                                                                                            method114(class116.field1813, class116.field1814);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (field463 != null) {
                                                                                method974(field463);
                                                                                Statics.field816++;
                                                                                if (field414 && field468) {
                                                                                    int var385 = class116.field1806;
                                                                                    int var386 = class116.field1807;
                                                                                    int var387 = var385 - field465;
                                                                                    int var388 = var386 - field467;
                                                                                    if (var387 < field524) {
                                                                                        var387 = field524;
                                                                                    }
                                                                                    if (field463.field2249 + var387 > field524 + field464.field2249) {
                                                                                        var387 = field524 + field464.field2249 - field463.field2249;
                                                                                    }
                                                                                    if (var388 < field308) {
                                                                                        var388 = field308;
                                                                                    }
                                                                                    if (field463.field2223 + var388 > field308 + field464.field2223) {
                                                                                        var388 = field308 + field464.field2223 - field463.field2223;
                                                                                    }
                                                                                    int var389 = var387 - field472;
                                                                                    int var390 = var388 - field345;
                                                                                    int var391 = field463.field2327;
                                                                                    if (Statics.field816 > field463.field2227 && (var389 > var391 || var389 < -var391 || var390 > var391 || var390 < -var391)) {
                                                                                        field474 = true;
                                                                                    }
                                                                                    int var392 = field464.field2228 + (var387 - field524);
                                                                                    int var393 = field464.field2229 + (var388 - field308);
                                                                                    if (field463.field2312 != null && field474) {
                                                                                        class19 var394 = new class19();
                                                                                        var394.field189 = field463;
                                                                                        var394.field190 = var392;
                                                                                        var394.field191 = var393;
                                                                                        var394.field197 = field463.field2312;
                                                                                        class33.method815(var394);
                                                                                    }
                                                                                    if (class116.field1803 == 0) {
                                                                                        if (field474) {
                                                                                            if (field463.field2297 != null) {
                                                                                                class19 var395 = new class19();
                                                                                                var395.field189 = field463;
                                                                                                var395.field190 = var392;
                                                                                                var395.field191 = var393;
                                                                                                var395.field193 = field564;
                                                                                                var395.field197 = field463.field2297;
                                                                                                class33.method815(var395);
                                                                                            }
                                                                                            if (field564 != null) {
                                                                                                class170 var396 = field463;
                                                                                                int var397 = method221(var396);
                                                                                                int var398 = var397 >> 17 & 0x7;
                                                                                                int var399 = var398;
                                                                                                class170 var400;
                                                                                                if (var398 == 0) {
                                                                                                    var400 = null;
                                                                                                } else {
                                                                                                    int var401 = 0;
                                                                                                    while (true) {
                                                                                                        if (var401 >= var399) {
                                                                                                            var400 = var396;
                                                                                                            break;
                                                                                                        }
                                                                                                        var396 = class170.method971(var396.field2226);
                                                                                                        if (var396 == null) {
                                                                                                            var400 = null;
                                                                                                            break;
                                                                                                        }
                                                                                                        var401++;
                                                                                                    }
                                                                                                }
                                                                                                if (var400 != null) {
                                                                                                    field333.method2948(22);
                                                                                                    field333.method2689(field564.field2207);
                                                                                                    field333.method2687(field463.field2219);
                                                                                                    field333.method2714(field463.field2207);
                                                                                                    field333.method2687(field564.field2291);
                                                                                                    field333.method2725(field463.field2291);
                                                                                                    field333.method2755(field564.field2219);
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            int var402 = method24();
                                                                                            if (field515 > 2 && !(field361 != 1 || method3076()) || method102(var402)) {
                                                                                                method114(field472 + field465, field467 + field345);
                                                                                            } else if (field515 > 0) {
                                                                                                int var403 = field472 + field465;
                                                                                                int var404 = field467 + field345;
                                                                                                method39(Statics.field158, var403, var404);
                                                                                                Statics.field158 = null;
                                                                                            }
                                                                                        }
                                                                                        field463 = null;
                                                                                    }
                                                                                } else if (Statics.field816 > 1) {
                                                                                    field463 = null;
                                                                                }
                                                                            }
                                                                            if (Statics.field160 != null) {
                                                                                method974(Statics.field160);
                                                                                field408++;
                                                                                if (class116.field1803 == 0) {
                                                                                    if (!field407) {
                                                                                        int var413 = method24();
                                                                                        if (field515 > 2 && !(field361 != 1 || method3076()) || method102(var413)) {
                                                                                            method114(field404, field443);
                                                                                        } else if (field515 > 0) {
                                                                                            int var414 = field404;
                                                                                            int var415 = field443;
                                                                                            method39(Statics.field158, var414, var415);
                                                                                            Statics.field158 = null;
                                                                                        }
                                                                                    } else if (Statics.field238 == Statics.field160 && field406 != field403) {
                                                                                        class170 var405 = Statics.field160;
                                                                                        byte var406 = 0;
                                                                                        if (field453 == 1 && var405.field2211 == 206) {
                                                                                            var406 = 1;
                                                                                        }
                                                                                        if (var405.field2298[field406] <= 0) {
                                                                                            var406 = 0;
                                                                                        }
                                                                                        int var407 = method221(var405);
                                                                                        boolean var408 = (var407 >> 29 & 0x1) != 0;
                                                                                        if (var408) {
                                                                                            int var409 = field403;
                                                                                            int var410 = field406;
                                                                                            var405.field2298[var410] = var405.field2298[var409];
                                                                                            var405.field2326[var410] = var405.field2326[var409];
                                                                                            var405.field2298[var409] = -1;
                                                                                            var405.field2326[var409] = 0;
                                                                                        } else if (var406 == 1) {
                                                                                            int var411 = field403;
                                                                                            int var412 = field406;
                                                                                            while (var411 != var412) {
                                                                                                if (var411 > var412) {
                                                                                                    var405.method3126(var411 - 1, var411);
                                                                                                    var411--;
                                                                                                } else if (var411 < var412) {
                                                                                                    var405.method3126(var411 + 1, var411);
                                                                                                    var411++;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            var405.method3126(field406, field403);
                                                                                        }
                                                                                        field333.method2948(193);
                                                                                        field333.method2755(field406);
                                                                                        field333.method2714(Statics.field160.field2207);
                                                                                        field333.method2688(var406);
                                                                                        field333.method2687(field403);
                                                                                    }
                                                                                    field401 = 10;
                                                                                    class116.field1812 = 0;
                                                                                    Statics.field160 = null;
                                                                                } else if (field408 >= 5 && (class116.field1806 > field404 + 5 || class116.field1806 < field404 - 5 || class116.field1807 > field443 + 5 || class116.field1807 < field443 - 5)) {
                                                                                    field407 = true;
                                                                                }
                                                                            }
                                                                            if (class88.method1881()) {
                                                                                int var416 = class88.field1514;
                                                                                int var417 = class88.field1502;
                                                                                field333.method2948(105);
                                                                                field333.method2688(5);
                                                                                field333.method2687(Statics.field267 + var416);
                                                                                field333.method2736(Statics.field3221 + var417);
                                                                                field333.method2898(class106.field1719[82] ? (class106.field1719[81] ? 2 : 1) : 0);
                                                                                class88.method1851();
                                                                                field490 = class116.field1813;
                                                                                field491 = class116.field1814;
                                                                                field400 = 1;
                                                                                field427 = 0;
                                                                                field381 = var416;
                                                                                field526 = var417;
                                                                            }
                                                                            if (Statics.field925 != var335) {
                                                                                if (var335 != null) {
                                                                                    method974(var335);
                                                                                }
                                                                                if (Statics.field925 != null) {
                                                                                    method974(Statics.field925);
                                                                                }
                                                                            }
                                                                            if (Statics.field41 != var336 && field442 == field441) {
                                                                                if (var336 != null) {
                                                                                    method974(var336);
                                                                                }
                                                                                if (Statics.field41 != null) {
                                                                                    method974(Statics.field41);
                                                                                }
                                                                            }
                                                                            if (Statics.field41 == null) {
                                                                                if (field441 > 0) {
                                                                                    field441--;
                                                                                }
                                                                            } else if (field441 < field442) {
                                                                                field441++;
                                                                                if (field442 == field441) {
                                                                                    method974(Statics.field41);
                                                                                }
                                                                            }
                                                                            int var418 = field431 + Statics.field186.field636;
                                                                            int var419 = field399 + Statics.field186.field605;
                                                                            if (Statics.field975 - var418 < -500 || Statics.field975 - var418 > 500 || Statics.field2792 - var419 < -500 || Statics.field2792 - var419 > 500) {
                                                                                Statics.field975 = var418;
                                                                                Statics.field2792 = var419;
                                                                            }
                                                                            if (Statics.field975 != var418) {
                                                                                Statics.field975 += (var418 - Statics.field975) / 16;
                                                                            }
                                                                            if (Statics.field2792 != var419) {
                                                                                Statics.field2792 += (var419 - Statics.field2792) / 16;
                                                                            }
                                                                            if (class116.field1803 == 4 && Statics.field292) {
                                                                                int var420 = class116.field1807 - field378;
                                                                                field376 = var420 * 2;
                                                                                field378 = var420 == -1 || var420 == 1 ? class116.field1807 : (field378 + class116.field1807) / 2;
                                                                                int var421 = field539 - class116.field1806;
                                                                                field375 = var421 * 2;
                                                                                field539 = var421 == -1 || var421 == 1 ? class116.field1806 : (field539 + class116.field1806) / 2;
                                                                            } else {
                                                                                if (class106.field1719[96]) {
                                                                                    field375 += (-24 - field375) / 2;
                                                                                } else if (class106.field1719[97]) {
                                                                                    field375 += (24 - field375) / 2;
                                                                                } else {
                                                                                    field375 /= 2;
                                                                                }
                                                                                if (class106.field1719[98]) {
                                                                                    field376 += (12 - field376) / 2;
                                                                                } else if (class106.field1719[99]) {
                                                                                    field376 += (-12 - field376) / 2;
                                                                                } else {
                                                                                    field376 /= 2;
                                                                                }
                                                                                field378 = class116.field1807;
                                                                                field539 = class116.field1806;
                                                                            }
                                                                            field374 = field375 / 2 + field374 & 0x7FF;
                                                                            field373 += field376 / 2;
                                                                            if (field373 < 128) {
                                                                                field373 = 128;
                                                                            }
                                                                            if (field373 > 383) {
                                                                                field373 = 383;
                                                                            }
                                                                            int var422 = Statics.field975 >> 7;
                                                                            int var423 = Statics.field2792 >> 7;
                                                                            int var424 = method616(Statics.field975, Statics.field2792, Statics.field1834);
                                                                            int var425 = 0;
                                                                            if (var422 > 3 && var423 > 3 && var422 < 100 && var423 < 100) {
                                                                                for (int var426 = var422 - 4; var426 <= var422 + 4; var426++) {
                                                                                    for (int var427 = var423 - 4; var427 <= var423 + 4; var427++) {
                                                                                        int var428 = Statics.field1834;
                                                                                        if (var428 < 3 && (class11.field81[1][var426][var427] & 0x2) == 2) {
                                                                                            var428++;
                                                                                        }
                                                                                        int var429 = var424 - class11.field87[var428][var426][var427];
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
                                                                            if (var430 > field382) {
                                                                                field382 += (var430 - field382) / 24;
                                                                            } else if (var430 < field382) {
                                                                                field382 += (var430 - field382) / 80;
                                                                            }
                                                                            if (field460) {
                                                                                int var431 = Statics.field2117 * 128 + 64;
                                                                                int var432 = Statics.field1850 * 128 + 64;
                                                                                int var433 = method616(var431, var432, Statics.field1834) - Statics.field44;
                                                                                if (Statics.field1570 < var431) {
                                                                                    Statics.field1570 += Statics.field3053 * (var431 - Statics.field1570) / 1000 + Statics.field131;
                                                                                    if (Statics.field1570 > var431) {
                                                                                        Statics.field1570 = var431;
                                                                                    }
                                                                                }
                                                                                if (Statics.field1570 > var431) {
                                                                                    Statics.field1570 -= Statics.field3053 * (Statics.field1570 - var431) / 1000 + Statics.field131;
                                                                                    if (Statics.field1570 < var431) {
                                                                                        Statics.field1570 = var431;
                                                                                    }
                                                                                }
                                                                                if (Statics.field908 < var433) {
                                                                                    Statics.field908 += Statics.field3053 * (var433 - Statics.field908) / 1000 + Statics.field131;
                                                                                    if (Statics.field908 > var433) {
                                                                                        Statics.field908 = var433;
                                                                                    }
                                                                                }
                                                                                if (Statics.field908 > var433) {
                                                                                    Statics.field908 -= Statics.field3053 * (Statics.field908 - var433) / 1000 + Statics.field131;
                                                                                    if (Statics.field908 < var433) {
                                                                                        Statics.field908 = var433;
                                                                                    }
                                                                                }
                                                                                if (Statics.field977 < var432) {
                                                                                    Statics.field977 += Statics.field3053 * (var432 - Statics.field977) / 1000 + Statics.field131;
                                                                                    if (Statics.field977 > var432) {
                                                                                        Statics.field977 = var432;
                                                                                    }
                                                                                }
                                                                                if (Statics.field977 > var432) {
                                                                                    Statics.field977 -= Statics.field3053 * (Statics.field977 - var432) / 1000 + Statics.field131;
                                                                                    if (Statics.field977 < var432) {
                                                                                        Statics.field977 = var432;
                                                                                    }
                                                                                }
                                                                                int var434 = Statics.field2183 * 128 + 64;
                                                                                int var435 = Statics.field2871 * 128 + 64;
                                                                                int var436 = method616(var434, var435, Statics.field1834) - Statics.field894;
                                                                                int var437 = var434 - Statics.field1570;
                                                                                int var438 = var436 - Statics.field908;
                                                                                int var439 = var435 - Statics.field977;
                                                                                int var440 = (int) Math.sqrt((double) (var437 * var437 + var439 * var439));
                                                                                int var441 = (int) (Math.atan2((double) var438, (double) var440) * 325.949D) & 0x7FF;
                                                                                int var442 = (int) (Math.atan2((double) var437, (double) var439) * -325.949D) & 0x7FF;
                                                                                if (var441 < 128) {
                                                                                    var441 = 128;
                                                                                }
                                                                                if (var441 > 383) {
                                                                                    var441 = 383;
                                                                                }
                                                                                if (Statics.field95 < var441) {
                                                                                    Statics.field95 += Statics.field802 * (var441 - Statics.field95) / 1000 + Statics.field204;
                                                                                    if (Statics.field95 > var441) {
                                                                                        Statics.field95 = var441;
                                                                                    }
                                                                                }
                                                                                if (Statics.field95 > var441) {
                                                                                    Statics.field95 -= Statics.field802 * (Statics.field95 - var441) / 1000 + Statics.field204;
                                                                                    if (Statics.field95 < var441) {
                                                                                        Statics.field95 = var441;
                                                                                    }
                                                                                }
                                                                                int var443 = var442 - Statics.field887;
                                                                                if (var443 > 1024) {
                                                                                    var443 -= 2048;
                                                                                }
                                                                                if (var443 < -1024) {
                                                                                    var443 += 2048;
                                                                                }
                                                                                if (var443 > 0) {
                                                                                    Statics.field887 += Statics.field802 * var443 / 1000 + Statics.field204;
                                                                                    Statics.field887 &= 0x7FF;
                                                                                }
                                                                                if (var443 < 0) {
                                                                                    Statics.field887 -= Statics.field802 * -var443 / 1000 + Statics.field204;
                                                                                    Statics.field887 &= 0x7FF;
                                                                                }
                                                                                int var444 = var442 - Statics.field887;
                                                                                if (var444 > 1024) {
                                                                                    var444 -= 2048;
                                                                                }
                                                                                if (var444 < -1024) {
                                                                                    var444 += 2048;
                                                                                }
                                                                                if (var444 < 0 && var443 > 0 || var444 > 0 && var443 < 0) {
                                                                                    Statics.field887 = var442;
                                                                                }
                                                                            }
                                                                            for (int var445 = 0; var445 < 5; var445++) {
                                                                                var10002 = field293[var445]++;
                                                                            }
                                                                            Statics.field239.method899();
                                                                            int var446 = class116.method1139();
                                                                            int var447 = class106.method3042();
                                                                            if (var446 > 15000 && var447 > 15000) {
                                                                                field343 = 250;
                                                                                class116.field1801 = 14500;
                                                                                field333.method2948(241);
                                                                            }
                                                                            field394++;
                                                                            if (field394 > 500) {
                                                                                field394 = 0;
                                                                                int var448 = (int) (Math.random() * 8.0D);
                                                                                if ((var448 & 0x1) == 1) {
                                                                                    field431 += field355;
                                                                                }
                                                                                if ((var448 & 0x2) == 2) {
                                                                                    field399 += field357;
                                                                                }
                                                                                if ((var448 & 0x4) == 4) {
                                                                                    field358 += field396;
                                                                                }
                                                                            }
                                                                            if (field431 < -50) {
                                                                                field355 = 2;
                                                                            }
                                                                            if (field431 > 50) {
                                                                                field355 = -2;
                                                                            }
                                                                            if (field399 < -55) {
                                                                                field357 = 2;
                                                                            }
                                                                            if (field399 > 55) {
                                                                                field357 = -2;
                                                                            }
                                                                            if (field358 < -40) {
                                                                                field396 = 1;
                                                                            }
                                                                            if (field358 > 40) {
                                                                                field396 = -1;
                                                                            }
                                                                            field424++;
                                                                            if (field424 > 500) {
                                                                                field424 = 0;
                                                                                int var449 = (int) (Math.random() * 8.0D);
                                                                                if ((var449 & 0x1) == 1) {
                                                                                    field395 += field362;
                                                                                }
                                                                                if ((var449 & 0x2) == 2) {
                                                                                    field340 += field298;
                                                                                }
                                                                            }
                                                                            if (field395 < -60) {
                                                                                field362 = 2;
                                                                            }
                                                                            if (field395 > 60) {
                                                                                field362 = -2;
                                                                            }
                                                                            if (field340 < -20) {
                                                                                field298 = 1;
                                                                            }
                                                                            if (field340 > 10) {
                                                                                field298 = -1;
                                                                            }
                                                                            for (class17 var450 = (class17) field561.method2365(); var450 != null; var450 = (class17) field561.method2369()) {
                                                                                if ((long) var450.field170 < class156.method1898() / 1000L - 5L) {
                                                                                    if (var450.field174 > 0) {
                                                                                        class48.method1892(5, "", var450.field167 + class174.field2543);
                                                                                    }
                                                                                    if (var450.field174 == 0) {
                                                                                        class48.method1892(5, "", var450.field167 + class174.field2378);
                                                                                    }
                                                                                    var450.method2374();
                                                                                }
                                                                            }
                                                                            field339++;
                                                                            if (field339 > 50) {
                                                                                field333.method2948(25);
                                                                            }
                                                                            try {
                                                                                if (Statics.field31 != null && field333.field2087 > 0) {
                                                                                    Statics.field31.method2031(field333.field2086, 0, field333.field2087);
                                                                                    field333.field2087 = 0;
                                                                                    field339 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var454) {
                                                                                if (field343 > 0) {
                                                                                    method768();
                                                                                } else {
                                                                                    method691(40);
                                                                                    Statics.field237 = Statics.field31;
                                                                                    Statics.field31 = null;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        var348 = var347.field189;
                                                                        if (var348.field2291 < 0) {
                                                                            break;
                                                                        }
                                                                        var349 = class170.method971(var348.field2226);
                                                                    } while (var349 == null || var349.field2340 == null || var348.field2291 >= var349.field2340.length || var349.field2340[var348.field2291] != var348);
                                                                    class33.method815(var347);
                                                                }
                                                            }
                                                            var345 = var344.field189;
                                                            if (var345.field2291 < 0) {
                                                                break;
                                                            }
                                                            var346 = class170.method971(var345.field2226);
                                                        } while (var346 == null || var346.field2340 == null || var345.field2291 >= var346.field2340.length || var346.field2340[var345.field2291] != var345);
                                                        class33.method815(var344);
                                                    }
                                                }
                                                var342 = var341.field189;
                                                if (var342.field2291 < 0) {
                                                    break;
                                                }
                                                var343 = class170.method971(var342.field2226);
                                            } while (var343 == null || var343.field2340 == null || var342.field2291 >= var343.field2340.length || var343.field2340[var342.field2291] != var342);
                                            class33.method815(var341);
                                        }
                                    }
                                } else if (field343 > 0) {
                                    method768();
                                } else {
                                    method691(40);
                                    Statics.field237 = Statics.field31;
                                    Statics.field31 = null;
                                }
                            }
                        }
                    }
                } else if (field294 == 40 || field294 == 45) {
                    method3332();
                }
                return;
            }
            var2.field2693.method3244(var2.field2692, (int) var2.field1884, var2.field2691, false);
        }
    }

    @ObfuscatedName("client.k(I)V")
    public final void method380() {
        boolean var1 = class139.method2930();
        if (var1 && field440 && Statics.field773 != null) {
            Statics.field773.method1103();
        }
        if (field294 == 10 || field294 == 20 || field294 == 30) {
            if (field331 != 0L && class156.method1898() > field331) {
                int var2 = field504 ? 2 : 1;
                field331 = 0L;
                if (var2 >= 2) {
                    field504 = true;
                } else {
                    field504 = false;
                }
                method1901();
                if (field294 >= 25) {
                    method2537();
                }
                field1779 = true;
            } else if (field1769) {
                Canvas var3 = Statics.field1745;
                var3.removeKeyListener(class106.field1703);
                var3.removeFocusListener(class106.field1703);
                class106.field1707 = -1;
                Canvas var4 = Statics.field1745;
                var4.removeMouseListener(class116.field1804);
                var4.removeMouseMotionListener(class116.field1804);
                var4.removeFocusListener(class116.field1804);
                class116.field1802 = 0;
                if (Statics.field949 != null) {
                    Statics.field949.method2009(Statics.field1745);
                }
                Statics.field557.method2064();
                Statics.field1745.setBackground(Color.black);
                Canvas var5 = Statics.field1745;
                var5.setFocusTraversalKeysEnabled(false);
                var5.addKeyListener(class106.field1703);
                var5.addFocusListener(class106.field1703);
                class116.method1979(Statics.field1745);
                if (Statics.field949 != null) {
                    Statics.field949.method2004(Statics.field1745);
                }
                if (field450 != -1) {
                    method2604(field450, Statics.field1757, Statics.field1129, false);
                }
                field1781 = true;
            }
        }
        Dimension var6 = this.method2074();
        if (Statics.field1107 != var6.width || Statics.field150 != var6.height || field1781) {
            method1901();
            field331 = class156.method1898() + 500L;
            field1781 = false;
        }
        boolean var7 = false;
        if (field1779) {
            field1779 = false;
            var7 = true;
            for (int var8 = 0; var8 < 100; var8++) {
                field495[var8] = true;
            }
        }
        if (var7) {
            method112();
        }
        if (field294 == 0) {
            class114.method48(class42.field854, class42.field856, (Color) null, var7);
        } else if (field294 == 5) {
            class42.method2148(Statics.field3189, Statics.field152, Statics.field163, var7);
        } else if (field294 == 10 || field294 == 11) {
            class42.method2148(Statics.field3189, Statics.field152, Statics.field163, var7);
        } else if (field294 == 20) {
            class42.method2148(Statics.field3189, Statics.field152, Statics.field163, var7);
        } else if (field294 == 25) {
            if (field349 == 1) {
                if (field388 > field475) {
                    field475 = field388;
                }
                int var9 = (field475 * 50 - field388 * 50) / field475;
                method70(class174.field2580 + class38.field785 + class38.field788 + var9 + "%" + class38.field783, false);
            } else if (field349 == 2) {
                if (field353 > field509) {
                    field509 = field353;
                }
                int var10 = (field509 * 50 - field353 * 50) / field509 + 50;
                method70(class174.field2580 + class38.field785 + class38.field788 + var10 + "%" + class38.field783, false);
            } else {
                method70(class174.field2580, false);
            }
        } else if (field294 == 30) {
            method3282();
        } else if (field294 == 40) {
            method70(class174.field2369 + class38.field785 + class174.field2507, false);
        } else if (field294 == 45) {
            method70(class174.field2514, false);
        }
        if (field294 == 30 && field502 == 0 && !var7) {
            try {
                Graphics var11 = Statics.field1745.getGraphics();
                for (int var12 = 0; var12 < field469; var12++) {
                    if (field496[var12]) {
                        Statics.field1074.method3788(var11, field457[var12], field513[var12], field493[var12], field309[var12]);
                        field496[var12] = false;
                    }
                }
            } catch (Exception var18) {
                Statics.field1745.repaint();
            }
        } else if (field294 > 0) {
            try {
                Graphics var14 = Statics.field1745.getGraphics();
                Statics.field1074.method3795(var14, 0, 0);
                for (int var15 = 0; var15 < field469; var15++) {
                    field496[var15] = false;
                }
            } catch (Exception var17) {
                Statics.field1745.repaint();
            }
        }
    }

    @ObfuscatedName("client.f(I)V")
    public final void method515() {
        if (Statics.field239.method908()) {
            Statics.field239.method906();
        }
        if (Statics.field287 != null) {
            Statics.field287.field215 = false;
        }
        Statics.field287 = null;
        if (Statics.field31 != null) {
            Statics.field31.method2022();
            Statics.field31 = null;
        }
        class106.method3589();
        if (class116.field1804 != null) {
            class116 var1 = class116.field1804;
            synchronized (class116.field1804) {
                class116.field1804 = null;
            }
        }
        Statics.field949 = null;
        if (Statics.field773 != null) {
            Statics.field773.method1104();
        }
        if (Statics.field1571 != null) {
            Statics.field1571.method1104();
        }
        if (Statics.field2758 != null) {
            Statics.field2758.method2022();
        }
        class184.method109();
        class105.method635();
    }

    @ObfuscatedName("al.o(II)V")
    public static void method691(int arg0) {
        if (field294 == arg0) {
            return;
        }
        if (field294 == 0) {
            class114.method861();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field322 = 0;
            field323 = 0;
            field324 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field237 != null) {
            Statics.field237.method2022();
            Statics.field237 = null;
        }
        if (field294 == 25) {
            field349 = 0;
            field388 = 0;
            field475 = 1;
            field353 = 0;
            field509 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class42.method131(Statics.field1745, Statics.field147, Statics.field809, true, 0);
        } else if (arg0 == 20) {
            class42.method131(Statics.field1745, Statics.field147, Statics.field809, true, field294 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class42.method131(Statics.field1745, Statics.field147, Statics.field809, false, 4);
        } else if (Statics.field859) {
            Statics.field822 = null;
            Statics.field827 = null;
            Statics.field96 = null;
            Statics.field825 = null;
            Statics.field826 = null;
            Statics.field2192 = null;
            Statics.field2790 = null;
            Statics.field1569 = null;
            Statics.field836 = null;
            Statics.field2115 = null;
            Statics.field961 = null;
            Statics.field807 = null;
            Statics.field1956 = null;
            Statics.field853 = null;
            Statics.field831 = null;
            Statics.field766 = null;
            Statics.field2179 = null;
            Statics.field3133 = null;
            Statics.field2769 = null;
            Statics.field35 = null;
            Statics.field947 = null;
            Statics.field689 = null;
            class139.method1895(2);
            class186.method3135(true);
            Statics.field859 = false;
        }
        field294 = arg0;
    }

    @ObfuscatedName("client.q(B)V")
    public void method270() {
        if (field294 != 1000) {
            boolean var1 = class186.method235();
            if (!var1) {
                this.method271();
            }
        }
    }

    @ObfuscatedName("client.c(I)V")
    public void method271() {
        if (class186.field2766 >= 4) {
            this.method2072("js5crc");
            field294 = 1000;
            return;
        }
        if (class186.field2748 >= 4) {
            if (field294 <= 5) {
                this.method2072("js5io");
                field294 = 1000;
                return;
            }
            field318 = 3000;
            class186.field2748 = 3;
        }
        if (--field318 + 1 > 0) {
            return;
        }
        try {
            if (field317 == 0) {
                Statics.field2159 = Statics.field1794.method1942(Statics.field3200, Statics.field326);
                field317++;
            }
            if (field317 == 1) {
                if (Statics.field2159.field1671 == 2) {
                    this.method497(-1);
                    return;
                }
                if (Statics.field2159.field1671 == 1) {
                    field317++;
                }
            }
            if (field317 == 2) {
                Statics.field948 = new class111((Socket) Statics.field2159.field1675, Statics.field1794);
                class154 var1 = new class154(5);
                var1.method2688(15);
                var1.method2689(136);
                Statics.field948.method2031(var1.field2086, 0, 5);
                field317++;
                Statics.field2643 = class156.method1898();
            }
            if (field317 == 3) {
                if (field294 <= 5 || Statics.field948.method2021() > 0) {
                    int var2 = Statics.field948.method2024();
                    if (var2 != 0) {
                        this.method497(var2);
                        return;
                    }
                    field317++;
                } else if (class156.method1898() - Statics.field2643 > 30000L) {
                    this.method497(-2);
                    return;
                }
            }
            if (field317 == 4) {
                class186.method2987(Statics.field948, field294 > 20);
                Statics.field2159 = null;
                Statics.field948 = null;
                field317 = 0;
                field321 = 0;
            }
        } catch (IOException var4) {
            this.method497(-3);
        }
    }

    @ObfuscatedName("client.b(II)V")
    public void method497(int arg0) {
        Statics.field2159 = null;
        Statics.field948 = null;
        field317 = 0;
        if (Statics.field326 == Statics.field3146) {
            Statics.field326 = Statics.field218;
        } else {
            Statics.field326 = Statics.field3146;
        }
        field321++;
        if (field321 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field294 <= 5) {
                this.method2072("js5connect_full");
                field294 = 1000;
            } else {
                field318 = 3000;
            }
        } else if (field321 >= 2 && arg0 == 6) {
            this.method2072("js5connect_outofdate");
            field294 = 1000;
        } else if (field321 >= 4) {
            if (field294 <= 5) {
                this.method2072("js5connect");
                field294 = 1000;
            } else {
                field318 = 3000;
            }
        }
    }

    @ObfuscatedName("u.w(I)V")
    public static void method213() {
        if (field316 == 0) {
            Statics.field144 = new class88(4, 104, 104, class11.field87);
            for (int var0 = 0; var0 < 4; var0++) {
                field350[var0] = new class118(104, 104);
            }
            Statics.field596 = new class225(512, 512);
            class42.field856 = class174.field2635;
            class42.field854 = 5;
            field316 = 20;
        } else if (field316 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class85.field1461[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class88.method1746(var1, 500, 800, 512, 334);
            class42.field856 = class174.field2372;
            class42.field854 = 10;
            field316 = 30;
        } else if (field316 == 30) {
            Statics.field39 = method149(0, false, true, true);
            Statics.field1 = method149(1, false, true, true);
            Statics.field500 = method149(2, true, false, true);
            Statics.field819 = method149(3, false, true, true);
            Statics.field2042 = method149(4, false, true, true);
            Statics.field2095 = method149(5, true, true, true);
            Statics.field307 = method149(6, true, true, false);
            Statics.field75 = method149(7, false, true, true);
            Statics.field809 = method149(8, false, true, true);
            Statics.field69 = method149(9, false, true, true);
            Statics.field147 = method149(10, false, true, true);
            Statics.field176 = method149(11, false, true, true);
            Statics.field1359 = method149(12, false, true, true);
            Statics.field1309 = method149(13, true, false, true);
            Statics.field181 = method149(14, false, true, false);
            Statics.field2744 = method149(15, false, true, true);
            class42.field856 = class174.field2630;
            class42.field854 = 20;
            field316 = 40;
        } else if (field316 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field39.method3253() * 4 / 100;
            int var8 = var7 + Statics.field1.method3253() * 4 / 100;
            int var9 = var8 + Statics.field500.method3253() * 2 / 100;
            int var10 = var9 + Statics.field819.method3253() * 2 / 100;
            int var11 = var10 + Statics.field2042.method3253() * 6 / 100;
            int var12 = var11 + Statics.field2095.method3253() * 4 / 100;
            int var13 = var12 + Statics.field307.method3253() * 2 / 100;
            int var14 = var13 + Statics.field75.method3253() * 60 / 100;
            int var15 = var14 + Statics.field809.method3253() * 2 / 100;
            int var16 = var15 + Statics.field69.method3253() * 2 / 100;
            int var17 = var16 + Statics.field147.method3253() * 2 / 100;
            int var18 = var17 + Statics.field176.method3253() * 2 / 100;
            int var19 = var18 + Statics.field1359.method3253() * 2 / 100;
            int var20 = var19 + Statics.field1309.method3253() * 2 / 100;
            int var21 = var20 + Statics.field181.method3253() * 2 / 100;
            int var22 = var21 + Statics.field2744.method3253() * 2 / 100;
            if (var22 == 100) {
                class42.field856 = class174.field2375;
                class42.field854 = 30;
                field316 = 45;
            } else {
                if (var22 != 0) {
                    class42.field856 = class174.field2374 + var22 + "%";
                }
                class42.field854 = 30;
            }
        } else if (field316 == 45) {
            boolean var23 = !field291;
            Statics.field1054 = 22050;
            Statics.field1060 = var23;
            Statics.field1053 = 2;
            class140 var24 = new class140();
            var24.method2431(9, 128);
            Statics.field773 = class58.method103(Statics.field1794, Statics.field1745, 0, 22050);
            Statics.field773.method1100(var24);
            Statics.method644(Statics.field2744, Statics.field181, Statics.field2042, var24);
            Statics.field1571 = class58.method103(Statics.field1794, Statics.field1745, 1, 2048);
            Statics.field573 = new class52();
            Statics.field1571.method1100(Statics.field573);
            Statics.field1603 = new class66(22050, Statics.field1054);
            class42.field856 = class174.field2406;
            class42.field854 = 35;
            field316 = 50;
        } else if (field316 == 50) {
            int var25 = 0;
            if (Statics.field152 == null) {
                Statics.field152 = class226.method1904(Statics.field809, Statics.field1309, "p11_full", "");
            } else {
                var25++;
            }
            if (Statics.field163 == null) {
                Statics.field163 = class226.method1904(Statics.field809, Statics.field1309, "p12_full", "");
            } else {
                var25++;
            }
            if (Statics.field3189 == null) {
                Statics.field3189 = class226.method1904(Statics.field809, Statics.field1309, "b12_full", "");
            } else {
                var25++;
            }
            if (var25 < 3) {
                class42.field856 = class174.field2377 + var25 * 100 / 3 + "%";
                class42.field854 = 40;
            } else {
                Statics.field1546 = new class231(true);
                class42.field856 = class174.field2518;
                class42.field854 = 40;
                field316 = 60;
            }
        } else if (field316 == 60) {
            int var26 = class42.method2970(Statics.field147, Statics.field809);
            byte var27 = 9;
            if (var26 < var27) {
                class42.field856 = class174.field2379 + var26 * 100 / var27 + "%";
                class42.field854 = 50;
            } else {
                class42.field856 = class174.field2632;
                class42.field854 = 50;
                method691(5);
                field316 = 70;
            }
        } else if (field316 == 70) {
            if (Statics.field500.method3163()) {
                class201.method3397(Statics.field500);
                class185 var29 = Statics.field500;
                Statics.field2813 = var29;
                class193.method91(Statics.field500, Statics.field75);
                Statics.method1962(Statics.field500, Statics.field75, field291);
                class200.method1976(Statics.field500, Statics.field75);
                class185 var30 = Statics.field500;
                class185 var31 = Statics.field75;
                boolean var32 = field290;
                class209 var33 = Statics.field152;
                Statics.field2979 = var30;
                Statics.field2956 = var31;
                Statics.field896 = var32;
                Statics.field3218 = Statics.field2979.method3150(10);
                Statics.field236 = var33;
                class185 var34 = Statics.field500;
                class185 var35 = Statics.field39;
                class185 var36 = Statics.field1;
                Statics.field3073 = var34;
                Statics.field3086 = var35;
                Statics.field3060 = var36;
                class185 var37 = Statics.field500;
                class185 var38 = Statics.field75;
                Statics.field2799 = var37;
                Statics.field3082 = var38;
                class185 var39 = Statics.field500;
                Statics.field2855 = var39;
                Statics.method21(Statics.field500);
                class170.method259(Statics.field819, Statics.field75, Statics.field809, Statics.field1309);
                class185 var40 = Statics.field500;
                Statics.field2771 = var40;
                class185 var41 = Statics.field500;
                Statics.field2861 = var41;
                class189.method2194(Statics.field500);
                class190.method14(Statics.field500);
                Statics.field239 = new class47();
                class197.method1548(Statics.field500, Statics.field809, Statics.field1309);
                Statics.method637(Statics.field500, Statics.field809);
                class42.field856 = class174.field2382;
                class42.field854 = 60;
                field316 = 80;
            } else {
                class42.field856 = class174.field2381 + Statics.field500.method3247() + "%";
                class42.field854 = 60;
            }
        } else if (field316 == 80) {
            int var42 = 0;
            if (Statics.field885 == null) {
                class185 var43 = Statics.field809;
                int var44 = var43.method3224("compass");
                int var45 = var43.method3168(var44, "");
                class225 var46 = class226.method2149(var43, var44, var45);
                Statics.field885 = var46;
            } else {
                var42++;
            }
            if (Statics.field798 == null) {
                class185 var47 = Statics.field809;
                int var48 = var47.method3224("mapedge");
                int var49 = var47.method3168(var48, "");
                class225 var50 = class226.method2149(var47, var48, var49);
                Statics.field798 = var50;
            } else {
                var42++;
            }
            if (Statics.field2003 == null) {
                Statics.field2003 = class226.method170(Statics.field809, "mapscene", "");
            } else {
                var42++;
            }
            if (Statics.field3103 == null) {
                Statics.field3103 = class226.method2664(Statics.field809, "mapfunction", "");
            } else {
                var42++;
            }
            if (Statics.field2151 == null) {
                Statics.field2151 = class226.method2664(Statics.field809, "headicons_pk", "");
            } else {
                var42++;
            }
            if (Statics.field870 == null) {
                Statics.field870 = class226.method2664(Statics.field809, "headicons_prayer", "");
            } else {
                var42++;
            }
            if (Statics.field759 == null) {
                Statics.field759 = class226.method2664(Statics.field809, "headicons_hint", "");
            } else {
                var42++;
            }
            if (Statics.field171 == null) {
                Statics.field171 = class226.method2664(Statics.field809, "mapmarker", "");
            } else {
                var42++;
            }
            if (Statics.field58 == null) {
                Statics.field58 = class226.method2664(Statics.field809, "cross", "");
            } else {
                var42++;
            }
            if (Statics.field903 == null) {
                Statics.field903 = class226.method2664(Statics.field809, "mapdots", "");
            } else {
                var42++;
            }
            if (Statics.field74 == null) {
                Statics.field74 = class226.method170(Statics.field809, "scrollbar", "");
            } else {
                var42++;
            }
            if (Statics.field1839 == null) {
                Statics.field1839 = class226.method170(Statics.field809, "mod_icons", "");
            } else {
                var42++;
            }
            if (var42 < 12) {
                class42.field856 = class174.field2598 + var42 * 100 / 12 + "%";
                class42.field854 = 70;
            } else {
                Statics.field3116 = Statics.field1839;
                Statics.field798.method3929();
                int var51 = (int) (Math.random() * 21.0D) - 10;
                int var52 = (int) (Math.random() * 21.0D) - 10;
                int var53 = (int) (Math.random() * 21.0D) - 10;
                int var54 = (int) (Math.random() * 41.0D) - 20;
                for (int var55 = 0; var55 < Statics.field3103.length; var55++) {
                    Statics.field3103[var55].method3928(var51 + var54, var52 + var54, var53 + var54);
                }
                Statics.field2003[0].method3887(var51 + var54, var52 + var54, var53 + var54);
                class42.field856 = class174.field2540;
                class42.field854 = 70;
                field316 = 90;
            }
        } else if (field316 == 90) {
            if (Statics.field69.method3163()) {
                class75 var56 = new class75(Statics.field69, Statics.field809, 20, 0.8D, field291 ? 64 : 128);
                class85.method1661(var56);
                class85.method1650(0.8D);
                class42.field856 = class174.field2386;
                class42.field854 = 90;
                field316 = 110;
            } else {
                class42.field856 = class174.field2385 + Statics.field69.method3247() + "%";
                class42.field854 = 90;
            }
        } else if (field316 == 110) {
            Statics.field287 = new class21();
            Statics.field1794.method1954(Statics.field287, 10);
            class42.field856 = class174.field2592;
            class42.field854 = 94;
            field316 = 120;
        } else if (field316 == 120) {
            if (Statics.field147.method3170("huffman", "")) {
                class146 var57 = new class146(Statics.field147.method3169("huffman", ""));
                class211.method3296(var57);
                class42.field856 = class174.field2373;
                class42.field854 = 96;
                field316 = 130;
            } else {
                class42.field856 = class174.field2410 + "%";
                class42.field854 = 96;
            }
        } else if (field316 == 130) {
            if (!Statics.field819.method3163()) {
                class42.field856 = class174.field2390 + Statics.field819.method3247() * 4 / 5 + "%";
                class42.field854 = 100;
            } else if (!Statics.field1359.method3163()) {
                class42.field856 = class174.field2390 + (80 + Statics.field1359.method3247() / 6) + "%";
                class42.field854 = 100;
            } else if (Statics.field1309.method3163()) {
                class42.field856 = class174.field2391;
                class42.field854 = 100;
                field316 = 140;
            } else {
                class42.field856 = class174.field2390 + (96 + Statics.field1309.method3247() / 20) + "%";
                class42.field854 = 100;
            }
        } else if (field316 == 140) {
            method691(10);
        }
    }

    @ObfuscatedName("s.l(IZZZI)Lgj;")
    public static class185 method149(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class117 var4 = null;
        if (class105.field1700 != null) {
            var4 = new class117(arg0, class105.field1700, Statics.field183[arg0], 1000000);
        }
        return new class185(var4, Statics.field201, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("gw.r(B)V")
    public static final void method3332() {
        try {
            if (field322 == 0) {
                if (Statics.field31 != null) {
                    Statics.field31.method2022();
                    Statics.field31 = null;
                }
                Statics.field801 = null;
                field344 = false;
                field323 = 0;
                field322 = 1;
            }
            if (field322 == 1) {
                if (Statics.field801 == null) {
                    Statics.field801 = Statics.field1794.method1942(Statics.field3200, Statics.field326);
                }
                if (Statics.field801.field1671 == 2) {
                    throw new IOException();
                }
                if (Statics.field801.field1671 == 1) {
                    Statics.field31 = new class111((Socket) Statics.field801.field1675, Statics.field1794);
                    Statics.field801 = null;
                    field322 = 2;
                }
            }
            if (field322 == 2) {
                field333.field2087 = 0;
                field333.method2688(14);
                Statics.field31.method2031(field333.field2086, 0, 1);
                field335.field2087 = 0;
                field322 = 3;
            }
            if (field322 == 3) {
                if (Statics.field773 != null) {
                    Statics.field773.method1131();
                }
                if (Statics.field1571 != null) {
                    Statics.field1571.method1131();
                }
                int var0 = Statics.field31.method2024();
                if (Statics.field773 != null) {
                    Statics.field773.method1131();
                }
                if (Statics.field1571 != null) {
                    Statics.field1571.method1131();
                }
                if (var0 != 0) {
                    method3133(var0);
                    return;
                }
                field335.field2087 = 0;
                field322 = 5;
            }
            if (field322 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field333.field2087 = 0;
                field333.method2688(1);
                field333.method2688(class42.field847.method811());
                field333.method2689(var1[0]);
                field333.method2689(var1[1]);
                field333.method2689(var1[2]);
                field333.method2689(var1[3]);
                switch(class42.field847.field1639) {
                    case 0:
                    case 3:
                        field333.method2686(Statics.field55);
                        field333.field2087 += 5;
                        break;
                    case 1:
                        field333.method2689((Integer) Statics.field2945.field693.get(class208.method1562(class42.field845)));
                        field333.field2087 += 4;
                        break;
                    case 2:
                        field333.field2087 += 8;
                }
                field333.method2730(class42.field846);
                field333.method2722(class40.field806, class40.field804);
                field334.field2087 = 0;
                if (field294 == 40) {
                    field334.method2688(18);
                } else {
                    field334.method2688(16);
                }
                field334.method2687(0);
                int var2 = field334.field2087;
                field334.method2689(136);
                field334.method2695(field333.field2086, 0, field333.field2087);
                int var3 = field334.field2087;
                field334.method2730(class42.field845);
                field334.method2688((field504 ? 1 : 0) << 1 | (field291 ? 1 : 0));
                field334.method2687(Statics.field1757);
                field334.method2687(Statics.field1129);
                method2054(field334);
                field334.method2730(Statics.field304);
                field334.method2689(Statics.field45);
                class154 var4 = new class154(Statics.field1546.method4061());
                Statics.field1546.method4060(var4);
                field334.method2695(var4.field2086, 0, var4.field2086.length);
                field334.method2688(Statics.field1791);
                field334.method2689(0);
                field334.method2689(Statics.field39.field2723);
                field334.method2689(Statics.field1.field2723);
                field334.method2689(Statics.field500.field2723);
                field334.method2689(Statics.field819.field2723);
                field334.method2689(Statics.field2042.field2723);
                field334.method2689(Statics.field2095.field2723);
                field334.method2689(Statics.field307.field2723);
                field334.method2689(Statics.field75.field2723);
                field334.method2689(Statics.field809.field2723);
                field334.method2689(Statics.field69.field2723);
                field334.method2689(Statics.field147.field2723);
                field334.method2689(Statics.field176.field2723);
                field334.method2689(Statics.field1359.field2723);
                field334.method2689(Statics.field1309.field2723);
                field334.method2689(Statics.field181.field2723);
                field334.method2689(Statics.field2744.field2723);
                field334.method2720(var1, var3, field334.field2087);
                field334.method2697(field334.field2087 - var2);
                Statics.field31.method2031(field334.field2086, 0, field334.field2087);
                field333.method2947(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field335.method2947(var1);
                field322 = 6;
            }
            if (field322 == 6 && Statics.field31.method2021() > 0) {
                int var6 = Statics.field31.method2024();
                if (var6 == 21 && field294 == 20) {
                    field322 = 7;
                } else if (var6 == 2) {
                    field322 = 9;
                } else if (var6 == 15 && field294 == 40) {
                    field336 = -1;
                    field322 = 13;
                } else if (var6 == 23 && field324 < 1) {
                    field324++;
                    field322 = 0;
                } else if (var6 == 29) {
                    field322 = 11;
                } else {
                    method3133(var6);
                    return;
                }
            }
            if (field322 == 7 && Statics.field31.method2021() > 0) {
                field325 = (Statics.field31.method2024() + 3) * 60;
                field322 = 8;
            }
            if (field322 == 8) {
                field323 = 0;
                class42.method851(class174.field2395, class174.field2396, field325 / 60 + class174.field2409);
                if (--field325 <= 0) {
                    field322 = 0;
                }
            } else {
                if (field322 == 9 && Statics.field31.method2021() >= 13) {
                    boolean var7 = Statics.field31.method2024() == 1;
                    Statics.field31.method2026(field335.field2086, 0, 4);
                    field335.field2087 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field335.method2962() << 24;
                        int var10 = var9 | field335.method2962() << 16;
                        int var11 = var10 | field335.method2962() << 8;
                        int var12 = var11 | field335.method2962();
                        int var13 = class208.method1562(class42.field845);
                        if (Statics.field2945.field693.size() >= 10 && !Statics.field2945.field693.containsKey(var13)) {
                            Iterator var14 = Statics.field2945.field693.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field2945.field693.put(var13, var12);
                        class31.method2626();
                    }
                    field426 = Statics.field31.method2024();
                    field459 = Statics.field31.method2024() == 1;
                    field411 = Statics.field31.method2024();
                    field411 <<= 0x8;
                    field411 += Statics.field31.method2024();
                    field412 = Statics.field31.method2024();
                    Statics.field31.method2026(field335.field2086, 0, 1);
                    field335.field2087 = 0;
                    field337 = field335.method2962();
                    Statics.field31.method2026(field335.field2086, 0, 2);
                    field335.field2087 = 0;
                    field336 = field335.method2833();
                    try {
                        class101.method1926(Statics.field557, "zap");
                    } catch (Throwable var25) {
                    }
                    field322 = 10;
                }
                if (field322 != 10) {
                    if (field322 == 11 && Statics.field31.method2021() >= 2) {
                        field335.field2087 = 0;
                        Statics.field31.method2026(field335.field2086, 0, 2);
                        field335.field2087 = 0;
                        Statics.field1206 = field335.method2833();
                        field322 = 12;
                    }
                    if (field322 == 12 && Statics.field31.method2021() >= Statics.field1206) {
                        field335.field2087 = 0;
                        Statics.field31.method2026(field335.field2086, 0, Statics.field1206);
                        field335.field2087 = 0;
                        String var16 = field335.method2709();
                        String var17 = field335.method2709();
                        String var18 = field335.method2709();
                        class42.method851(var16, var17, var18);
                        method691(10);
                    }
                    if (field322 == 13) {
                        if (field336 == -1) {
                            if (Statics.field31.method2021() < 2) {
                                return;
                            }
                            Statics.field31.method2026(field335.field2086, 0, 2);
                            field335.field2087 = 0;
                            field336 = field335.method2833();
                        }
                        if (Statics.field31.method2021() >= field336) {
                            Statics.field31.method2026(field335.field2086, 0, field336);
                            field335.field2087 = 0;
                            int var19 = field336;
                            field333.field2087 = 0;
                            field335.field2087 = 0;
                            field337 = -1;
                            field346 = -1;
                            field341 = -1;
                            field342 = -1;
                            field336 = 0;
                            field338 = 0;
                            field499 = 0;
                            method2018();
                            field527 = 0;
                            field381 = 0;
                            for (int var20 = 0; var20 < 2048; var20++) {
                                field365[var20] = null;
                            }
                            Statics.field186 = null;
                            for (int var21 = 0; var21 < field328.length; var21++) {
                                class36 var22 = field328[var21];
                                if (var22 != null) {
                                    var22.field620 = -1;
                                    var22.field631 = false;
                                }
                            }
                            class13.field113 = new class126(32);
                            method691(30);
                            for (int var23 = 0; var23 < 100; var23++) {
                                field495[var23] = true;
                            }
                            method2537();
                            class46.method772(field335);
                            if (field335.field2087 != var19) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field323++;
                        if (field323 > 2000) {
                            if (field324 < 1) {
                                if (Statics.field326 == Statics.field3146) {
                                    Statics.field326 = Statics.field218;
                                } else {
                                    Statics.field326 = Statics.field3146;
                                }
                                field324++;
                                field322 = 0;
                            } else {
                                method3133(-3);
                            }
                        }
                    }
                } else if (Statics.field31.method2021() >= field336) {
                    field335.field2087 = 0;
                    Statics.field31.method2026(field335.field2086, 0, field336);
                    method200();
                    class46.method772(field335);
                    Statics.field76 = -1;
                    method794(false);
                    field337 = -1;
                }
            }
        } catch (IOException var26) {
            if (field324 < 1) {
                if (Statics.field326 == Statics.field3146) {
                    Statics.field326 = Statics.field218;
                } else {
                    Statics.field326 = Statics.field3146;
                }
                field324++;
                field322 = 0;
            } else {
                method3133(-2);
            }
        }
    }

    @ObfuscatedName("w.u(I)V")
    public static void method200() {
        field297 = -1L;
        field301 = -1;
        Statics.field287.field222 = 0;
        Statics.field134 = true;
        field523 = true;
        field516 = -1L;
        class228.field3247 = new class127();
        field333.field2087 = 0;
        field335.field2087 = 0;
        field337 = -1;
        field346 = -1;
        field341 = -1;
        field342 = -1;
        field338 = 0;
        field499 = 0;
        field343 = 0;
        field305 = 0;
        method2018();
        class116.field1801 = 0;
        class48.method194();
        field417 = 0;
        field445 = false;
        field533 = 0;
        field431 = (int) (Math.random() * 100.0D) - 50;
        field399 = (int) (Math.random() * 110.0D) - 55;
        field358 = (int) (Math.random() * 80.0D) - 40;
        field395 = (int) (Math.random() * 120.0D) - 60;
        field340 = (int) (Math.random() * 30.0D) - 20;
        field374 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field527 = 0;
        field520 = -1;
        field381 = 0;
        field526 = 0;
        field314 = class41.field815;
        field315 = class41.field815;
        field329 = 0;
        class46.method611();
        for (int var0 = 0; var0 < 2048; var0++) {
            field365[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field328[var1] = null;
        }
        field419 = -1;
        field422.method2356();
        field423.method2356();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field420[var2][var3][var4] = null;
                }
            }
        }
        field393 = new class129();
        field559 = 0;
        field348 = 0;
        field567 = 0;
        for (int var5 = 0; var5 < Statics.field2781; var5++) {
            class188 var6 = class188.method2594(var5);
            if (var6 != null) {
                class166.field2165[var5] = 0;
                class166.field2166[var5] = 0;
            }
        }
        Statics.field239.method911();
        field458 = -1;
        if (field450 != -1) {
            class170.method895(field450);
        }
        for (class18 var7 = (class18) field302.method2289(); var7 != null; var7 = (class18) field302.method2290()) {
            method204(var7, true);
        }
        field450 = -1;
        field302 = new class126(8);
        field544 = null;
        method2018();
        field413.method3074((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field416[var8] = null;
            field528[var8] = false;
        }
        class13.field113 = new class126(32);
        field295 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field495[var9] = true;
        }
        method2537();
        field517 = null;
        Statics.field1861 = 0;
        Statics.field146 = null;
        for (int var10 = 0; var10 < 8; var10++) {
            field356[var10] = new class5();
        }
        Statics.field1550 = null;
    }

    @ObfuscatedName("fl.e(II)V")
    public static void method3133(int arg0) {
        if (arg0 == -3) {
            class42.method851(class174.field2398, class174.field2399, class174.field2400);
        } else if (arg0 == -2) {
            class42.method851(class174.field2401, class174.field2402, class174.field2403);
        } else if (arg0 == -1) {
            class42.method851(class174.field2404, class174.field2405, class174.field2384);
        } else if (arg0 == 3) {
            class42.field833 = 3;
        } else if (arg0 == 4) {
            class42.method851(class174.field2407, class174.field2408, class174.field2558);
        } else if (arg0 == 5) {
            class42.method851(class174.field2493, class174.field2609, class174.field2412);
        } else if (arg0 == 6) {
            class42.method851(class174.field2413, class174.field2414, class174.field2578);
        } else if (arg0 == 7) {
            class42.method851(class174.field2416, class174.field2417, class174.field2418);
        } else if (arg0 == 8) {
            class42.method851(class174.field2419, class174.field2420, class174.field2529);
        } else if (arg0 == 9) {
            class42.method851(class174.field2422, class174.field2423, class174.field2424);
        } else if (arg0 == 10) {
            class42.method851(class174.field2425, class174.field2426, class174.field2427);
        } else if (arg0 == 11) {
            class42.method851(class174.field2428, class174.field2429, class174.field2389);
        } else if (arg0 == 12) {
            class42.method851(class174.field2431, class174.field2432, class174.field2371);
        } else if (arg0 == 13) {
            class42.method851(class174.field2434, class174.field2435, class174.field2450);
        } else if (arg0 == 14) {
            class42.method851(class174.field2437, class174.field2438, class174.field2439);
        } else if (arg0 == 16) {
            class42.method851(class174.field2383, class174.field2441, class174.field2442);
        } else if (arg0 == 17) {
            class42.method851(class174.field2443, class174.field2444, class174.field2527);
        } else if (arg0 == 18) {
            class42.method851(class174.field2446, class174.field2447, class174.field2448);
        } else if (arg0 == 19) {
            class42.method851(class174.field2581, class174.field2551, class174.field2615);
        } else if (arg0 == 20) {
            class42.method851(class174.field2452, class174.field2453, class174.field2454);
        } else if (arg0 == 22) {
            class42.method851(class174.field2455, class174.field2504, class174.field2388);
        } else if (arg0 == 23) {
            class42.method851(class174.field2458, class174.field2459, class174.field2460);
        } else if (arg0 == 24) {
            class42.method851(class174.field2461, class174.field2436, class174.field2463);
        } else if (arg0 == 25) {
            class42.method851(class174.field2612, class174.field2465, class174.field2466);
        } else if (arg0 == 26) {
            class42.method851(class174.field2358, class174.field2468, class174.field2469);
        } else if (arg0 == 27) {
            class42.method851(class174.field2470, class174.field2471, class174.field2472);
        } else if (arg0 == 31) {
            class42.method851(class174.field2596, class174.field2480, class174.field2481);
        } else if (arg0 == 32) {
            class42.method851(class174.field2397, class174.field2483, class174.field2603);
        } else if (arg0 == 37) {
            class42.method851(class174.field2485, class174.field2486, class174.field2487);
        } else if (arg0 == 38) {
            class42.method851(class174.field2488, class174.field2489, class174.field2490);
        } else if (arg0 == 55) {
            class42.method851(class174.field2491, class174.field2492, class174.field2590);
        } else if (arg0 == 56) {
            class42.method851(class174.field2629, class174.field2495, class174.field2496);
            method691(11);
            return;
        } else if (arg0 == 57) {
            class42.method851(class174.field2497, class174.field2498, class174.field2499);
            method691(11);
            return;
        } else {
            class42.method851(class174.field2622, class174.field2501, class174.field2502);
        }
        method691(10);
    }

    @ObfuscatedName("aa.h(B)V")
    public static final void method768() {
        if (Statics.field31 != null) {
            Statics.field31.method2022();
            Statics.field31 = null;
        }
        method38();
        Statics.field144.method1712();
        for (int var0 = 0; var0 < 4; var0++) {
            field350[var0].method2195();
        }
        System.gc();
        class139.method1895(2);
        field529 = -1;
        field440 = false;
        class32.method690();
        method691(10);
    }

    @ObfuscatedName("v.d(B)V")
    public static final void method38() {
        class201.method3349();
        class192.field2817.method2277();
        class193.field2831.method2277();
        class198.method2131();
        class200.field3009.method2277();
        class200.field3031.method2277();
        class199.method1908();
        class202.field3079.method2277();
        class202.field3065.method2277();
        class191.method3116();
        class195.method2968();
        class188.field2779.method2277();
        class197.field2875.method2277();
        class197.field2888.method2277();
        class197.field2877.method2277();
        class194.method818();
        class167.field2177.method2277();
        class170.method1937();
        ((class75) Statics.field1458).method1461();
        class49.field952.method2277();
        Statics.field39.method3165();
        Statics.field1.method3165();
        Statics.field819.method3165();
        Statics.field2042.method3165();
        Statics.field2095.method3165();
        Statics.field307.method3165();
        Statics.field75.method3165();
        Statics.field809.method3165();
        Statics.field69.method3165();
        Statics.field147.method3165();
        Statics.field176.method3165();
        Statics.field1359.method3165();
    }

    @ObfuscatedName("ce.z(I)V")
    public static final void method1915() {
        if (field343 > 0) {
            method768();
        } else {
            method691(40);
            Statics.field237 = Statics.field31;
            Statics.field31 = null;
        }
    }

    @ObfuscatedName("df.t(I)V")
    public static final void method2056() {
        if (Statics.field1571 != null) {
            Statics.field1571.method1101();
        }
        if (Statics.field773 != null) {
            Statics.field773.method1101();
        }
    }

    @ObfuscatedName("em.ab(I)V")
    public static final void method2622() {
        for (int var0 = 0; var0 < field533; var0++) {
            int var10002 = field536[var0]--;
            if (field536[var0] >= -10) {
                class54 var2 = field538[var0];
                if (var2 == null) {
                    class54 var10000 = (class54) null;
                    var2 = class54.method1042(Statics.field2042, field534[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field536[var0] += var2.method1037();
                    field538[var0] = var2;
                }
                if (field536[var0] < 0) {
                    int var9;
                    if (field537[var0] == 0) {
                        var9 = field531;
                    } else {
                        int var3 = (field537[var0] & 0xFF) * 128;
                        int var4 = field537[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field186.field636;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field537[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field186.field605;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field536[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field398 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class56 var10 = var2.method1036().method1075(Statics.field1603);
                        class67 var11 = class67.method1215(var10, 100, var9);
                        var11.method1218(field535[var0] - 1);
                        Statics.field573.method1002(var11);
                    }
                    field536[var0] = -100;
                }
            } else {
                field533--;
                for (int var1 = var0; var1 < field533; var1++) {
                    field534[var1] = field534[var1 + 1];
                    field538[var1] = field538[var1 + 1];
                    field535[var1] = field535[var1 + 1];
                    field536[var1] = field536[var1 + 1];
                    field537[var1] = field537[var1 + 1];
                }
                var0--;
            }
        }
        if (!field440) {
            return;
        }
        boolean var12;
        if (class139.field1922 == 0) {
            var12 = Statics.field1920.method2430();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field545 != 0 && field529 != -1) {
                class139.method873(Statics.field307, field529, 0, field545, false);
            }
            field440 = false;
        }
    }

    @ObfuscatedName("az.ac(Lgk;IIII)V")
    public static void method852(class202 arg0, int arg1, int arg2, int arg3) {
        if (field533 >= 50 || field398 == 0 || arg0.field3066 == null || arg1 >= arg0.field3066.length) {
            return;
        }
        int var4 = arg0.field3066[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field534[field533] = var5;
        field535[field533] = var6;
        field536[field533] = 0;
        field538[field533] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field537[field533] = (var8 << 16) + (var9 << 8) + var7;
        field533++;
    }

    @ObfuscatedName("an.al(Lfi;III)V")
    public static final void method807(class170 arg0, int arg1, int arg2) {
        if (field527 != 0 && field527 != 3 || class116.field1812 != 1 && Statics.field292 || class116.field1812 != 4) {
            return;
        }
        class165 var3 = arg0.method3093(true);
        if (var3 == null) {
            return;
        }
        int var4 = class116.field1813 - arg1;
        int var5 = class116.field1814 - arg2;
        if (!var3.method3029(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2161 / 2;
        int var7 = var5 - var3.field2156 / 2;
        int var8 = field395 + field374 & 0x7FF;
        int var9 = class85.field1461[var8];
        int var10 = class85.field1447[var8];
        int var11 = (field340 + 256) * var9 >> 8;
        int var12 = (field340 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field186.field636 + var13 >> 7;
        int var16 = Statics.field186.field605 - var14 >> 7;
        field333.method2948(163);
        field333.method2688(18);
        field333.method2687(Statics.field267 + var15);
        field333.method2736(Statics.field3221 + var16);
        field333.method2898(class106.field1719[82] ? (class106.field1719[81] ? 2 : 1) : 0);
        field333.method2688(var6);
        field333.method2688(var7);
        field333.method2687(field374);
        field333.method2688(57);
        field333.method2688(field395);
        field333.method2688(field340);
        field333.method2688(89);
        field333.method2687(Statics.field186.field636);
        field333.method2687(Statics.field186.field605);
        field333.method2688(63);
        field381 = var15;
        field526 = var16;
    }

    @ObfuscatedName("ge.ae(Ljava/lang/String;I)V")
    public static final void method3273(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field2945.field691 = !Statics.field2945.field691;
            class31.method2626();
            if (Statics.field2945.field691) {
                class48.method1892(99, "", "Roofs are now all hidden");
            } else {
                class48.method1892(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field303 = !field303;
        }
        if (field426 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field303 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field303 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method1915();
            }
            if (arg0.equalsIgnoreCase("errortest") && field310 == 2) {
                throw new RuntimeException();
            }
        }
        field333.method2948(13);
        field333.method2688(arg0.length() + 1);
        field333.method2730(arg0);
    }

    @ObfuscatedName("o.ad(I)V")
    public static final void method189() {
        for (int var0 = 0; var0 < field329; var0++) {
            int var1 = field286[var0];
            class36 var2 = field328[var1];
            if (var2 != null) {
                method2422(var2, var2.field765.field3041);
            }
        }
    }

    @ObfuscatedName("ee.aq(Lac;II)V")
    public static final void method2422(class28 arg0, int arg1) {
        if (arg0.field645 > field432) {
            method202(arg0);
        } else if (arg0.field651 >= field432) {
            if (field432 == arg0.field651 || arg0.field641 == -1 || arg0.field639 != 0 || arg0.field630 + 1 > Statics.method1464(arg0.field641).field3064[arg0.field637]) {
                int var2 = arg0.field651 - arg0.field645;
                int var3 = field432 - arg0.field645;
                int var4 = arg0.field646 * 128 + arg0.field608 * 64;
                int var5 = arg0.field648 * 128 + arg0.field608 * 64;
                int var6 = arg0.field647 * 128 + arg0.field608 * 64;
                int var7 = arg0.field608 * 64 + arg0.field607 * 128;
                arg0.field636 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field605 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field662 = 0;
            arg0.field655 = arg0.field627;
            arg0.field606 = arg0.field655;
        } else {
            arg0.field650 = arg0.field609;
            if (arg0.field658 == 0) {
                arg0.field662 = 0;
            } else {
                label334: {
                    if (arg0.field641 != -1 && arg0.field639 == 0) {
                        class202 var8 = Statics.method1464(arg0.field641);
                        if (arg0.field663 > 0 && var8.field3074 == 0) {
                            arg0.field662++;
                            break label334;
                        }
                        if (arg0.field663 <= 0 && var8.field3075 == 0) {
                            arg0.field662++;
                            break label334;
                        }
                    }
                    int var9 = arg0.field636;
                    int var10 = arg0.field605;
                    int var11 = arg0.field659[arg0.field658 - 1] * 128 + arg0.field608 * 64;
                    int var12 = arg0.field660[arg0.field658 - 1] * 128 + arg0.field608 * 64;
                    if (var9 < var11) {
                        if (var10 < var12) {
                            arg0.field655 = 1280;
                        } else if (var10 > var12) {
                            arg0.field655 = 1792;
                        } else {
                            arg0.field655 = 1536;
                        }
                    } else if (var9 > var11) {
                        if (var10 < var12) {
                            arg0.field655 = 768;
                        } else if (var10 > var12) {
                            arg0.field655 = 256;
                        } else {
                            arg0.field655 = 512;
                        }
                    } else if (var10 < var12) {
                        arg0.field655 = 1024;
                    } else if (var10 > var12) {
                        arg0.field655 = 0;
                    }
                    byte var13 = arg0.field610[arg0.field658 - 1];
                    if (var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                        int var14 = arg0.field655 - arg0.field606 & 0x7FF;
                        if (var14 > 1024) {
                            var14 -= 2048;
                        }
                        int var15 = arg0.field613;
                        if (var14 >= -256 && var14 <= 256) {
                            var15 = arg0.field633;
                        } else if (var14 >= 256 && var14 < 768) {
                            var15 = arg0.field615;
                        } else if (var14 >= -768 && var14 <= -256) {
                            var15 = arg0.field604;
                        }
                        if (var15 == -1) {
                            var15 = arg0.field633;
                        }
                        arg0.field650 = var15;
                        int var16 = 4;
                        boolean var17 = true;
                        if (arg0 instanceof class36) {
                            var17 = ((class36) arg0).field765.field3010;
                        }
                        if (var17) {
                            if (arg0.field655 != arg0.field606 && arg0.field620 == -1 && arg0.field657 != 0) {
                                var16 = 2;
                            }
                            if (arg0.field658 > 2) {
                                var16 = 6;
                            }
                            if (arg0.field658 > 3) {
                                var16 = 8;
                            }
                            if (arg0.field662 > 0 && arg0.field658 > 1) {
                                var16 = 8;
                                arg0.field662--;
                            }
                        } else {
                            if (arg0.field658 > 1) {
                                var16 = 6;
                            }
                            if (arg0.field658 > 2) {
                                var16 = 8;
                            }
                            if (arg0.field662 > 0 && arg0.field658 > 1) {
                                var16 = 8;
                                arg0.field662--;
                            }
                        }
                        if (var13 == 2) {
                            var16 <<= 0x1;
                        }
                        if (var16 >= 8 && arg0.field650 == arg0.field633 && arg0.field616 != -1) {
                            arg0.field650 = arg0.field616;
                        }
                        if (var9 != var11 || var10 != var12) {
                            if (var9 < var11) {
                                arg0.field636 += var16;
                                if (arg0.field636 > var11) {
                                    arg0.field636 = var11;
                                }
                            } else if (var9 > var11) {
                                arg0.field636 -= var16;
                                if (arg0.field636 < var11) {
                                    arg0.field636 = var11;
                                }
                            }
                            if (var10 < var12) {
                                arg0.field605 += var16;
                                if (arg0.field605 > var12) {
                                    arg0.field605 = var12;
                                }
                            } else if (var10 > var12) {
                                arg0.field605 -= var16;
                                if (arg0.field605 < var12) {
                                    arg0.field605 = var12;
                                }
                            }
                        }
                        if (arg0.field636 == var11 && arg0.field605 == var12) {
                            arg0.field658--;
                            if (arg0.field663 > 0) {
                                arg0.field663--;
                            }
                        }
                    } else {
                        arg0.field636 = var11;
                        arg0.field605 = var12;
                        arg0.field658--;
                        if (arg0.field663 > 0) {
                            arg0.field663--;
                        }
                    }
                }
            }
        }
        if (arg0.field636 < 128 || arg0.field605 < 128 || arg0.field636 >= 13184 || arg0.field605 >= 13184) {
            arg0.field641 = -1;
            arg0.field653 = -1;
            arg0.field645 = 0;
            arg0.field651 = 0;
            arg0.field636 = arg0.field659[0] * 128 + arg0.field608 * 64;
            arg0.field605 = arg0.field660[0] * 128 + arg0.field608 * 64;
            arg0.method636();
        }
        if (Statics.field186 == arg0 && (arg0.field636 < 1536 || arg0.field605 < 1536 || arg0.field636 >= 11776 || arg0.field605 >= 11776)) {
            arg0.field641 = -1;
            arg0.field653 = -1;
            arg0.field645 = 0;
            arg0.field651 = 0;
            arg0.field636 = arg0.field659[0] * 128 + arg0.field608 * 64;
            arg0.field605 = arg0.field660[0] * 128 + arg0.field608 * 64;
            arg0.method636();
        }
        method2672(arg0);
        arg0.field656 = false;
        if (arg0.field650 != -1) {
            class202 var18 = Statics.method1464(arg0.field650);
            if (var18 == null || var18.field3063 == null) {
                arg0.field650 = -1;
            } else {
                arg0.field635++;
                if (arg0.field634 < var18.field3063.length && arg0.field635 > var18.field3064[arg0.field634]) {
                    arg0.field635 = 1;
                    arg0.field634++;
                    method852(var18, arg0.field634, arg0.field636, arg0.field605);
                }
                if (arg0.field634 >= var18.field3063.length) {
                    arg0.field635 = 0;
                    arg0.field634 = 0;
                    method852(var18, arg0.field634, arg0.field636, arg0.field605);
                }
            }
        }
        if (arg0.field653 != -1 && field432 >= arg0.field644) {
            if (arg0.field649 < 0) {
                arg0.field649 = 0;
            }
            int var19 = class191.method2936(arg0.field653).field2798;
            if (var19 == -1) {
                arg0.field653 = -1;
            } else {
                class202 var20 = Statics.method1464(var19);
                if (var20 == null || var20.field3063 == null) {
                    arg0.field653 = -1;
                } else {
                    arg0.field643++;
                    if (arg0.field649 < var20.field3063.length && arg0.field643 > var20.field3064[arg0.field649]) {
                        arg0.field643 = 1;
                        arg0.field649++;
                        method852(var20, arg0.field649, arg0.field636, arg0.field605);
                    }
                    if (arg0.field649 >= var20.field3063.length && (arg0.field649 < 0 || arg0.field649 >= var20.field3063.length)) {
                        arg0.field653 = -1;
                    }
                }
            }
        }
        if (arg0.field641 != -1 && arg0.field639 <= 1) {
            class202 var21 = Statics.method1464(arg0.field641);
            if (var21.field3074 == 1 && arg0.field663 > 0 && arg0.field645 <= field432 && arg0.field651 < field432) {
                arg0.field639 = 1;
                return;
            }
        }
        if (arg0.field641 != -1 && arg0.field639 == 0) {
            class202 var22 = Statics.method1464(arg0.field641);
            if (var22 == null || var22.field3063 == null) {
                arg0.field641 = -1;
            } else {
                arg0.field630++;
                if (arg0.field637 < var22.field3063.length && arg0.field630 > var22.field3064[arg0.field637]) {
                    arg0.field630 = 1;
                    arg0.field637++;
                    method852(var22, arg0.field637, arg0.field636, arg0.field605);
                }
                if (arg0.field637 >= var22.field3063.length) {
                    arg0.field637 -= var22.field3067;
                    arg0.field640++;
                    if (arg0.field640 >= var22.field3068) {
                        arg0.field641 = -1;
                    } else if (arg0.field637 >= 0 && arg0.field637 < var22.field3063.length) {
                        method852(var22, arg0.field637, arg0.field636, arg0.field605);
                    } else {
                        arg0.field641 = -1;
                    }
                }
                arg0.field656 = var22.field3069;
            }
        }
        if (arg0.field639 > 0) {
            arg0.field639--;
        }
    }

    @ObfuscatedName("l.aa(Lac;S)V")
    public static final void method202(class28 arg0) {
        int var1 = arg0.field645 - field432;
        int var2 = arg0.field646 * 128 + arg0.field608 * 64;
        int var3 = arg0.field648 * 128 + arg0.field608 * 64;
        arg0.field636 += (var2 - arg0.field636) / var1;
        arg0.field605 += (var3 - arg0.field605) / var1;
        arg0.field662 = 0;
        arg0.field655 = arg0.field627;
    }

    @ObfuscatedName("ew.af(Lac;I)V")
    public static final void method2672(class28 arg0) {
        if (arg0.field657 == 0) {
            return;
        }
        if (arg0.field620 != -1) {
            class28 var1 = null;
            if (arg0.field620 < 32768) {
                var1 = field328[arg0.field620];
            } else if (arg0.field620 >= 32768) {
                var1 = field365[arg0.field620 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field636 - var1.field636;
                int var3 = arg0.field605 - var1.field605;
                if (var2 != 0 || var3 != 0) {
                    arg0.field655 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field631) {
                arg0.field620 = -1;
                arg0.field631 = false;
            }
        }
        if (arg0.field632 != -1 && (arg0.field658 == 0 || arg0.field662 > 0)) {
            arg0.field655 = arg0.field632;
            arg0.field632 = -1;
        }
        int var4 = arg0.field655 - arg0.field606 & 0x7FF;
        if (var4 == 0 && arg0.field631) {
            arg0.field620 = -1;
            arg0.field631 = false;
        }
        if (var4 == 0) {
            arg0.field661 = 0;
            return;
        }
        arg0.field661++;
        if (var4 > 1024) {
            arg0.field606 -= arg0.field657;
            boolean var5 = true;
            if (var4 < arg0.field657 || var4 > 2048 - arg0.field657) {
                arg0.field606 = arg0.field655;
                var5 = false;
            }
            if (arg0.field650 == arg0.field609 && (arg0.field661 > 25 || var5)) {
                if (arg0.field611 == -1) {
                    arg0.field650 = arg0.field633;
                } else {
                    arg0.field650 = arg0.field611;
                }
            }
        } else {
            arg0.field606 += arg0.field657;
            boolean var6 = true;
            if (var4 < arg0.field657 || var4 > 2048 - arg0.field657) {
                arg0.field606 = arg0.field655;
                var6 = false;
            }
            if (arg0.field650 == arg0.field609 && (arg0.field661 > 25 || var6)) {
                if (arg0.field622 == -1) {
                    arg0.field650 = arg0.field633;
                } else {
                    arg0.field650 = arg0.field622;
                }
            }
        }
        arg0.field606 &= 0x7FF;
    }

    @ObfuscatedName("ax.as(Ld;IIB)V")
    public static void method803(class24 arg0, int arg1, int arg2) {
        if (arg0.field641 == arg1 && arg1 != -1) {
            int var3 = Statics.method1464(arg1).field3076;
            if (var3 == 1) {
                arg0.field637 = 0;
                arg0.field630 = 0;
                arg0.field639 = arg2;
                arg0.field640 = 0;
            }
            if (var3 == 2) {
                arg0.field640 = 0;
            }
        } else if (arg1 == -1 || arg0.field641 == -1 || Statics.method1464(arg1).field3070 >= Statics.method1464(arg0.field641).field3070) {
            arg0.field641 = arg1;
            arg0.field637 = 0;
            arg0.field630 = 0;
            arg0.field639 = arg2;
            arg0.field640 = 0;
            arg0.field663 = arg0.field658;
        }
    }

    @ObfuscatedName("ey.ao(I)V")
    public static void method2537() {
        field333.method2948(187);
        class160 var0 = field333;
        int var1 = field504 ? 2 : 1;
        var0.method2688(var1);
        field333.method2687(Statics.field1757);
        field333.method2687(Statics.field1129);
    }

    @ObfuscatedName("cz.ax(I)V")
    public static void method1901() {
        client var0 = Statics.field557;
        synchronized (Statics.field557) {
            Container var1 = Statics.field557.method2073();
            if (var1 != null) {
                Statics.field1107 = Math.max(var1.getSize().width, Statics.field1194);
                Statics.field150 = Math.max(var1.getSize().height, Statics.field1699);
                if (Statics.field1836 == var1) {
                    Insets var2 = Statics.field1836.getInsets();
                    Statics.field1107 -= var2.right + var2.left;
                    Statics.field150 -= var2.top + var2.bottom;
                }
                if (Statics.field1107 <= 0) {
                    Statics.field1107 = 1;
                }
                if (Statics.field150 <= 0) {
                    Statics.field150 = 1;
                }
                int var3 = field504 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field1757 = field505 * 765;
                    Statics.field1129 = field363;
                } else {
                    Statics.field1757 = Math.min(Statics.field1107, 7680);
                    Statics.field1129 = Math.min(Statics.field150, 2160);
                }
                field1777 = (Statics.field1107 - Statics.field1757) / 2;
                field1778 = 0;
                Statics.field1745.setSize(Statics.field1757, Statics.field1129);
                int var4 = Statics.field1757;
                int var5 = Statics.field1129;
                Canvas var6 = Statics.field1745;
                class221 var8;
                try {
                    class219 var7 = new class219();
                    var7.method3787(var4, var5, var6);
                    var8 = var7;
                } catch (Throwable var21) {
                    class224 var10 = new class224();
                    var10.method3787(var4, var5, var6);
                    var8 = var10;
                }
                Statics.field1074 = var8;
                if (Statics.field1836 == var1) {
                    Insets var11 = Statics.field1836.getInsets();
                    Statics.field1745.setLocation(field1777 + var11.left, field1778 + var11.top);
                } else {
                    Statics.field1745.setLocation(field1777, field1778);
                }
                int var12 = Statics.field1757;
                int var13 = Statics.field1129;
                if (Statics.field1107 < var12) {
                    int var14 = Statics.field1107;
                }
                if (Statics.field150 < var13) {
                    int var15 = Statics.field150;
                }
                if (Statics.field2945 != null) {
                    try {
                        client var16 = Statics.field557;
                        int var17 = field504 ? 2 : 1;
                        class101.method1927(var16, "resize", new Object[] { var17 });
                    } catch (Throwable var20) {
                    }
                }
                if (field450 != -1) {
                    method2604(field450, Statics.field1757, Statics.field1129, true);
                }
                method112();
            }
        }
    }

    @ObfuscatedName("i.an(B)V")
    public static void method112() {
        int var0 = field1777;
        int var1 = field1778;
        int var2 = Statics.field1107 - Statics.field1757 - var0;
        int var3 = Statics.field150 - Statics.field1129 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field557.method2073();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1836 == var4) {
                Insets var7 = Statics.field1836.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field150);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field1107, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field1107 + var5 - var2, var6, var2, Statics.field150);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field150 + var6 - var3, Statics.field1107, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("ge.ag(S)V")
    public static final void method3282() {
        if (field450 != -1) {
            method1564(field450);
        }
        for (int var0 = 0; var0 < field469; var0++) {
            if (field495[var0]) {
                field496[var0] = true;
            }
            field436[var0] = field495[var0];
            field495[var0] = false;
        }
        field494 = field432;
        field439 = -1;
        field466 = -1;
        Statics.field238 = null;
        if (field450 != -1) {
            field469 = 0;
            method19(field450, 0, 0, Statics.field1757, Statics.field1129, 0, 0, -1);
        }
        class220.method3804();
        if (field428) {
            method1894();
        } else if (field439 != -1) {
            method3422(field439, field466);
        }
        if (field502 == 3) {
            for (int var1 = 0; var1 < field469; var1++) {
                if (field436[var1]) {
                    class220.method3820(field457[var1], field513[var1], field493[var1], field309[var1], 16711935, 128);
                } else if (field496[var1]) {
                    class220.method3820(field457[var1], field513[var1], field493[var1], field309[var1], 16711680, 128);
                }
            }
        }
        int var2 = Statics.field1834;
        int var3 = Statics.field186.field636;
        int var4 = Statics.field186.field605;
        int var5 = field366;
        for (class32 var6 = (class32) class32.field704.method2352(); var6 != null; var6 = (class32) class32.field704.method2341()) {
            if (var6.field709 != -1 || var6.field715 != null) {
                int var7 = 0;
                if (var3 > var6.field706) {
                    var7 += var3 - var6.field706;
                } else if (var3 < var6.field705) {
                    var7 += var6.field705 - var3;
                }
                if (var4 > var6.field707) {
                    var7 += var4 - var6.field707;
                } else if (var4 < var6.field717) {
                    var7 += var6.field717 - var4;
                }
                if (var7 - 64 > var6.field713 || field398 == 0 || var6.field703 != var2) {
                    if (var6.field710 != null) {
                        Statics.field573.method978(var6.field710);
                        var6.field710 = null;
                    }
                    if (var6.field702 != null) {
                        Statics.field573.method978(var6.field702);
                        var6.field702 = null;
                    }
                } else {
                    var7 -= 64;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = field398 * (var6.field713 - var7) / var6.field713;
                    class54 var10000;
                    if (var6.field710 != null) {
                        var6.field710.method1219(var8);
                    } else if (var6.field709 >= 0) {
                        var10000 = (class54) null;
                        class54 var9 = class54.method1042(Statics.field2042, var6.field709, 0);
                        if (var9 != null) {
                            class56 var10 = var9.method1036().method1075(Statics.field1603);
                            class67 var11 = class67.method1215(var10, 100, var8);
                            var11.method1218(-1);
                            Statics.field573.method1002(var11);
                            var6.field710 = var11;
                        }
                    }
                    if (var6.field702 != null) {
                        var6.field702.method1219(var8);
                        if (!var6.field702.method2328()) {
                            var6.field702 = null;
                        }
                    } else if (var6.field715 != null && (var6.field714 -= var5) <= 0) {
                        int var12 = (int) (Math.random() * (double) var6.field715.length);
                        var10000 = (class54) null;
                        class54 var13 = class54.method1042(Statics.field2042, var6.field715[var12], 0);
                        if (var13 != null) {
                            class56 var14 = var13.method1036().method1075(Statics.field1603);
                            class67 var15 = class67.method1215(var14, 100, var8);
                            var15.method1218(0);
                            Statics.field573.method1002(var15);
                            var6.field702 = var15;
                            var6.field714 = var6.field711 + (int) (Math.random() * (double) (var6.field712 - var6.field711));
                        }
                    }
                }
            }
        }
        field366 = 0;
    }

    @ObfuscatedName("y.aj(Ljava/lang/String;ZI)V")
    public static final void method70(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field163.method3725(arg0, 250);
        int var6 = Statics.field163.method3698(arg0, 250) * 13;
        class220.method3842(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class220.method3798(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field163.method3704(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method862(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method188(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1745.getGraphics();
            Statics.field1074.method3795(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1745.repaint();
        }
    }

    @ObfuscatedName("cn.ar(IIIII)V")
    public static final void method1561(int arg0, int arg1, int arg2, int arg3) {
        field503++;
        method894(class16.field161);
        boolean var4 = false;
        if (field419 >= 0) {
            int var5 = class46.field917;
            int[] var6 = class46.field914;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field419 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method894(class16.field154);
        }
        method1906(true);
        method894(var4 ? class16.field155 : class16.field156);
        method1906(false);
        for (class43 var8 = (class43) field422.method2352(); var8 != null; var8 = (class43) field422.method2341()) {
            if (Statics.field1834 != var8.field861 || field432 > var8.field867) {
                var8.method2327();
            } else if (field432 >= var8.field866) {
                if (var8.field869 > 0) {
                    class36 var9 = field328[var8.field869 - 1];
                    if (var9 != null && var9.field636 >= 0 && var9.field636 < 13312 && var9.field605 >= 0 && var9.field605 < 13312) {
                        var8.method853(var9.field636, var9.field605, method616(var9.field636, var9.field605, var8.field861) - var8.field865, field432);
                    }
                }
                if (var8.field869 < 0) {
                    int var10 = -var8.field869 - 1;
                    class24 var11;
                    if (field411 == var10) {
                        var11 = Statics.field186;
                    } else {
                        var11 = field365[var10];
                    }
                    if (var11 != null && var11.field636 >= 0 && var11.field636 < 13312 && var11.field605 >= 0 && var11.field605 < 13312) {
                        var8.method853(var11.field636, var11.field605, method616(var11.field636, var11.field605, var8.field861) - var8.field865, field432);
                    }
                }
                var8.method854(field366);
                Statics.field144.method1800(Statics.field1834, (int) var8.field872, (int) var8.field889, (int) var8.field874, 60, var8, var8.field880, -1, false);
            }
        }
        for (class34 var12 = (class34) field423.method2352(); var12 != null; var12 = (class34) field423.method2341()) {
            if (Statics.field1834 != var12.field752 || var12.field750) {
                var12.method2327();
            } else if (field432 >= var12.field742) {
                var12.method767(field366);
                if (var12.field750) {
                    var12.method2327();
                } else {
                    Statics.field144.method1800(var12.field752, var12.field744, var12.field745, var12.field746, 60, var12, 0, -1, false);
                }
            }
        }
        method1902(arg0, arg1, arg2, arg3, true);
        int var13 = field553;
        int var14 = field554;
        int var15 = field555;
        int var16 = field556;
        class220.method3877(var13, var14, var13 + var15, var14 + var16);
        class85.method1669();
        if (!field460) {
            int var17 = field373;
            if (field382 / 256 > var17) {
                var17 = field382 / 256;
            }
            if (field540[4] && field542[4] + 128 > var17) {
                var17 = field542[4] + 128;
            }
            int var18 = field374 + field358 & 0x7FF;
            int var19 = Statics.field975;
            int var20 = method616(Statics.field186.field636, Statics.field186.field605, Statics.field1834) - field379;
            int var21 = Statics.field2792;
            int var22 = var17 * 3 + 600;
            int var23 = 2048 - var17 & 0x7FF;
            int var24 = 2048 - var18 & 0x7FF;
            int var25 = 0;
            int var26 = 0;
            int var27 = var22;
            if (var23 != 0) {
                int var28 = class85.field1461[var23];
                int var29 = class85.field1447[var23];
                int var30 = var26 * var29 - var22 * var28 >> 16;
                var27 = var26 * var28 + var22 * var29 >> 16;
                var26 = var30;
            }
            if (var24 != 0) {
                int var31 = class85.field1461[var24];
                int var32 = class85.field1447[var24];
                int var33 = var25 * var32 + var27 * var31 >> 16;
                var27 = var27 * var32 - var25 * var31 >> 16;
                var25 = var33;
            }
            Statics.field1570 = var19 - var25;
            Statics.field908 = var20 - var26;
            Statics.field977 = var21 - var27;
            Statics.field95 = var17;
            Statics.field887 = var18;
        }
        int var46;
        if (field460) {
            int var47;
            if (Statics.field2945.field691) {
                var47 = Statics.field1834;
            } else {
                int var48 = method616(Statics.field1570, Statics.field977, Statics.field1834);
                if (var48 - Statics.field908 >= 800 || (class11.field81[Statics.field1834][Statics.field1570 >> 7][Statics.field977 >> 7] & 0x4) == 0) {
                    var47 = 3;
                } else {
                    var47 = Statics.field1834;
                }
            }
            var46 = var47;
        } else {
            int var34;
            if (Statics.field2945.field691) {
                var34 = Statics.field1834;
            } else {
                label344: {
                    int var35 = 3;
                    if (Statics.field95 < 310) {
                        int var36 = Statics.field1570 >> 7;
                        int var37 = Statics.field977 >> 7;
                        int var38 = Statics.field186.field636 >> 7;
                        int var39 = Statics.field186.field605 >> 7;
                        if (var36 < 0 || var37 < 0 || var36 >= 104 || var37 >= 104) {
                            var34 = Statics.field1834;
                            break label344;
                        }
                        if ((class11.field81[Statics.field1834][var36][var37] & 0x4) != 0) {
                            var35 = Statics.field1834;
                        }
                        int var40;
                        if (var38 > var36) {
                            var40 = var38 - var36;
                        } else {
                            var40 = var36 - var38;
                        }
                        int var41;
                        if (var39 > var37) {
                            var41 = var39 - var37;
                        } else {
                            var41 = var37 - var39;
                        }
                        if (var40 > var41) {
                            int var42 = var41 * 65536 / var40;
                            int var43 = 32768;
                            while (var36 != var38) {
                                if (var36 < var38) {
                                    var36++;
                                } else if (var36 > var38) {
                                    var36--;
                                }
                                if ((class11.field81[Statics.field1834][var36][var37] & 0x4) != 0) {
                                    var35 = Statics.field1834;
                                }
                                var43 += var42;
                                if (var43 >= 65536) {
                                    var43 -= 65536;
                                    if (var37 < var39) {
                                        var37++;
                                    } else if (var37 > var39) {
                                        var37--;
                                    }
                                    if ((class11.field81[Statics.field1834][var36][var37] & 0x4) != 0) {
                                        var35 = Statics.field1834;
                                    }
                                }
                            }
                        } else {
                            int var44 = var40 * 65536 / var41;
                            int var45 = 32768;
                            while (var37 != var39) {
                                if (var37 < var39) {
                                    var37++;
                                } else if (var37 > var39) {
                                    var37--;
                                }
                                if ((class11.field81[Statics.field1834][var36][var37] & 0x4) != 0) {
                                    var35 = Statics.field1834;
                                }
                                var45 += var44;
                                if (var45 >= 65536) {
                                    var45 -= 65536;
                                    if (var36 < var38) {
                                        var36++;
                                    } else if (var36 > var38) {
                                        var36--;
                                    }
                                    if ((class11.field81[Statics.field1834][var36][var37] & 0x4) != 0) {
                                        var35 = Statics.field1834;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field186.field636 >= 0 && Statics.field186.field605 >= 0 && Statics.field186.field636 < 13312 && Statics.field186.field605 < 13312) {
                        if ((class11.field81[Statics.field1834][Statics.field186.field636 >> 7][Statics.field186.field605 >> 7] & 0x4) != 0) {
                            var35 = Statics.field1834;
                        }
                        var34 = var35;
                    } else {
                        var34 = Statics.field1834;
                    }
                }
            }
            var46 = var34;
        }
        int var49 = Statics.field1570;
        int var50 = Statics.field908;
        int var51 = Statics.field977;
        int var52 = Statics.field95;
        int var53 = Statics.field887;
        for (int var54 = 0; var54 < 5; var54++) {
            if (field540[var54]) {
                int var55 = (int) (Math.random() * (double) (field541[var54] * 2 + 1) - (double) field541[var54] + Math.sin((double) field543[var54] / 100.0D * (double) field293[var54]) * (double) field542[var54]);
                if (var54 == 0) {
                    Statics.field1570 += var55;
                }
                if (var54 == 1) {
                    Statics.field908 += var55;
                }
                if (var54 == 2) {
                    Statics.field977 += var55;
                }
                if (var54 == 3) {
                    Statics.field887 = Statics.field887 + var55 & 0x7FF;
                }
                if (var54 == 4) {
                    Statics.field95 += var55;
                    if (Statics.field95 < 128) {
                        Statics.field95 = 128;
                    }
                    if (Statics.field95 > 383) {
                        Statics.field95 = 383;
                    }
                }
            }
        }
        int var56 = class116.field1806;
        int var57 = class116.field1807;
        if (class116.field1812 != 0) {
            var56 = class116.field1813;
            var57 = class116.field1814;
        }
        if (var56 >= var13 && var56 < var13 + var15 && var57 >= var14 && var57 < var14 + var16) {
            class83.field1374 = true;
            class83.field1424 = 0;
            class83.field1411 = var56 - var13;
            class83.field1369 = var57 - var14;
        } else {
            class83.field1374 = false;
            class83.field1424 = 0;
        }
        method2056();
        class220.method3842(var13, var14, var15, var16, 0);
        method2056();
        int var58 = class85.field1454;
        class85.field1454 = field320;
        Statics.field144.method1752(Statics.field1570, Statics.field908, Statics.field977, Statics.field95, Statics.field887, var46);
        class85.field1454 = var58;
        method2056();
        Statics.field144.method1726();
        method2625(var13, var14, var15, var16);
        method3304(var13, var14);
        ((class75) Statics.field1458).method1436(field366);
        method617(var13, var14, var15, var16);
        Statics.field1570 = var49;
        Statics.field908 = var50;
        Statics.field977 = var51;
        Statics.field95 = var52;
        Statics.field887 = var53;
        if (field295 && class186.method1707(true, false) == 0) {
            field295 = false;
        }
        if (field295) {
            class220.method3842(var13, var14, var15, var16, 0);
            method70(class174.field2580, false);
        }
    }

    @ObfuscatedName("cz.az(IIIIZI)V")
    public static final void method1902(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field546 - field473) * var5 / 100 + field473;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field551) {
            short var8 = field551;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field550) {
                var6 = field550;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class220.method3804();
                    class220.method3842(arg0, arg1, var10, arg3, -16777216);
                    class220.method3842(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field552) {
            short var11 = field552;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field549) {
                var6 = field549;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class220.method3804();
                    class220.method3842(arg0, arg1, arg2, var13, -16777216);
                    class220.method3842(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field548 - field572) * var5 / 100 + field572;
        field320 = arg3 * var6 * var14 / 85504 << 1;
        if (field555 != arg2 || field556 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class85.field1461[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class88.method1746(var15, 500, 800, arg2, arg3);
        }
        field553 = arg0;
        field554 = arg1;
        field555 = arg2;
        field556 = arg3;
    }

    @ObfuscatedName("aw.av(Lc;B)V")
    public static final void method894(class16 arg0) {
        if (Statics.field186.field636 >> 7 == field381 && Statics.field186.field605 >> 7 == field526) {
            field381 = 0;
        }
        int var1 = class46.field917;
        int[] var2 = class46.field914;
        int var3 = var1;
        if (class16.field161 == arg0 || class16.field154 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class24 var5;
            int var6;
            if (class16.field161 == arg0) {
                var5 = Statics.field186;
                var6 = Statics.field186.field251 << 14;
            } else if (class16.field154 == arg0) {
                var5 = field365[field419];
                var6 = field419 << 14;
            } else {
                var5 = field365[var2[var4]];
                var6 = var2[var4] << 14;
                if (class16.field155 == arg0 && field419 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method250() && !var5.field261) {
                var5.field259 = false;
                if ((field291 && var1 > 50 || var1 > 200) && class16.field161 != arg0 && var5.field650 == var5.field609) {
                    var5.field259 = true;
                }
                int var7 = var5.field636 >> 7;
                int var8 = var5.field605 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field254 == null || field432 < var5.field249 || field432 >= var5.field250) {
                        if ((var5.field636 & 0x7F) == 64 && (var5.field605 & 0x7F) == 64) {
                            if (field503 == field454[var7][var8]) {
                                continue;
                            }
                            field454[var7][var8] = field503;
                        }
                        var5.field248 = method616(var5.field636, var5.field605, Statics.field1834);
                        Statics.field144.method1800(Statics.field1834, var5.field636, var5.field605, var5.field248, 60, var5, var5.field606, var6, var5.field656);
                    } else {
                        var5.field259 = false;
                        var5.field248 = method616(var5.field636, var5.field605, Statics.field1834);
                        Statics.field144.method1724(Statics.field1834, var5.field636, var5.field605, var5.field248, 60, var5, var5.field606, var6, var5.field252, var5.field256, var5.field257, var5.field263);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cs.ap(ZB)V")
    public static final void method1906(boolean arg0) {
        for (int var1 = 0; var1 < field329; var1++) {
            class36 var2 = field328[field286[var1]];
            int var3 = (field286[var1] << 14) + 536870912;
            if (var2 != null && var2.method250() && var2.field765.field3032 == arg0 && var2.field765.method3575()) {
                int var4 = var2.field636 >> 7;
                int var5 = var2.field605 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field608 == 1 && (var2.field636 & 0x7F) == 64 && (var2.field605 & 0x7F) == 64) {
                        if (field503 == field454[var4][var5]) {
                            continue;
                        }
                        field454[var4][var5] = field503;
                    }
                    if (!var2.field765.field3040) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field144.method1800(Statics.field1834, var2.field636, var2.field605, method616(var2.field636 + (var2.field608 * 64 - 64), var2.field605 + (var2.field608 * 64 - 64), Statics.field1834), var2.field608 * 64 - 64 + 60, var2, var2.field606, var3, var2.field656);
                }
            }
        }
    }

    @ObfuscatedName("gx.aw(IIS)V")
    public static final void method3304(int arg0, int arg1) {
        if (field305 == 2) {
            method810((field296 - Statics.field267 << 7) + field311, (field383 - Statics.field3221 << 7) + field312, field347 * 2);
            if (field448 > -1 && field432 % 20 < 10) {
                Statics.field759[0].method3937(field448 + arg0 - 12, field470 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("fc.ay(Lac;IIIIIB)V")
    public static final void method3134(class28 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method250()) {
            return;
        }
        if (arg0 instanceof class36) {
            class200 var6 = ((class36) arg0).field765;
            if (var6.field3019 != null) {
                var6 = var6.method3570();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class46.field917;
        int[] var8 = class46.field914;
        int var9 = 3;
        if (!arg0.field629.method2309()) {
            method164(arg0, arg0.field654 + 15);
            for (class35 var10 = (class35) arg0.field629.method2302(); var10 != null; var10 = (class35) arg0.field629.method2317()) {
                class29 var11 = var10.method779(field432);
                if (var11 != null) {
                    class194 var12 = var10.field762;
                    class225 var13 = var12.method3382();
                    class225 var14 = var12.method3378();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field2848;
                    } else {
                        if (var12.field2844 * 2 < var14.field3223) {
                            var15 = var12.field2844;
                        }
                        var16 = var14.field3223 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field432 - var11.field670;
                    int var20 = var11.field666 * var16 / var12.field2848;
                    int var23;
                    if (var11.field669 > var19) {
                        int var21 = var12.field2843 == 0 ? 0 : var19 / var12.field2843 * var12.field2843;
                        int var22 = var11.field665 * var16 / var12.field2848;
                        var23 = (var20 - var22) * var21 / var11.field669 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field669 + var12.field2849 - var19;
                        if (var12.field2835 >= 0) {
                            var17 = (var24 << 8) / (var12.field2849 - var12.field2835);
                        }
                    }
                    if (var11.field666 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field448 + arg2 - (var16 >> 1);
                    int var26 = field470 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field448 > -1) {
                            class220.method3842(var25, var26, var23, 5, 65280);
                            class220.method3842(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3224;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method3943(var27, var26, var17);
                            class220.method3800(var27, var26, var27 + var28, var26 + var29);
                            var14.method3943(var27, var26, var17);
                        } else {
                            var13.method3937(var27, var26);
                            class220.method3800(var27, var26, var27 + var28, var26 + var29);
                            var14.method3937(var27, var26);
                        }
                        class220.method3877(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method773()) {
                    var10.method2327();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class24 var30 = (class24) arg0;
            if (var30.field261) {
                return;
            }
            if (var30.field258 != -1 || var30.field255 != -1) {
                method164(arg0, arg0.field654 + 15);
                if (field448 > -1) {
                    if (var30.field258 != -1) {
                        Statics.field2151[var30.field258].method3937(field448 + arg2 - 12, field470 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field255 != -1) {
                        Statics.field870[var30.field255].method3937(field448 + arg2 - 12, field470 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field305 == 10 && field563 == var8[arg1]) {
                method164(arg0, arg0.field654 + 15);
                if (field448 > -1) {
                    Statics.field759[1].method3937(field448 + arg2 - 12, field470 + arg3 - var9);
                }
            }
        } else {
            class200 var31 = ((class36) arg0).field765;
            if (var31.field3019 != null) {
                var31 = var31.method3570();
            }
            if (var31.field3035 >= 0 && var31.field3035 < Statics.field870.length) {
                method164(arg0, arg0.field654 + 15);
                if (field448 > -1) {
                    Statics.field870[var31.field3035].method3937(field448 + arg2 - 12, field470 + arg3 - 30);
                }
            }
            if (field305 == 1 && field306 == field286[arg1 - var7] && field432 % 20 < 10) {
                method164(arg0, arg0.field654 + 15);
                if (field448 > -1) {
                    Statics.field759[0].method3937(field448 + arg2 - 12, field470 + arg3 - 28);
                }
            }
        }
        if (arg0.field652 != null && (arg1 >= var7 || !arg0.field619 && (field508 == 4 || !arg0.field614 && (field508 == 0 || field508 == 3 || field508 == 1 && method216(((class24) arg0).field244, false))))) {
            method164(arg0, arg0.field654);
            if (field448 > -1 && field485 < field384) {
                field435[field485] = Statics.field3189.method3695(arg0.field652) / 2;
                field387[field485] = Statics.field3189.field3113;
                field385[field485] = field448;
                field386[field485] = field470;
                field389[field485] = arg0.field621;
                field501[field485] = arg0.field642;
                field391[field485] = arg0.field638;
                field392[field485] = arg0.field652;
                field485++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field626[var32];
            int var34 = arg0.field624[var32];
            class197 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field432) {
                    continue;
                }
                var35 = class197.method952(arg0.field624[var32]);
                var36 = var35.field2883;
                if (var35 != null && var35.field2894 != null) {
                    var35 = var35.method3433();
                    if (var35 == null) {
                        arg0.field626[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field612[var32];
            class197 var38 = null;
            if (var37 >= 0) {
                var38 = class197.method952(var37);
                if (var38 != null && var38.field2894 != null) {
                    var38 = var38.method3433();
                }
            }
            if (var33 - var36 <= field432) {
                if (var35 == null) {
                    arg0.field626[var32] = -1;
                } else {
                    method164(arg0, arg0.field654 / 2);
                    if (field448 > -1) {
                        if (var32 == 1) {
                            field470 -= 20;
                        }
                        if (var32 == 2) {
                            field448 -= 15;
                            field470 -= 10;
                        }
                        if (var32 == 3) {
                            field448 += 15;
                            field470 -= 10;
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
                        class225 var64 = var35.method3418();
                        if (var64 != null) {
                            var43 = var64.field3223;
                            int var65 = var64.field3224;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3229;
                        }
                        class225 var66 = var35.method3419();
                        if (var66 != null) {
                            var44 = var66.field3223;
                            int var67 = var66.field3224;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3229;
                        }
                        class225 var68 = var35.method3420();
                        if (var68 != null) {
                            var45 = var68.field3223;
                            int var69 = var68.field3224;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3229;
                        }
                        class225 var70 = var35.method3421();
                        if (var70 != null) {
                            var46 = var70.field3223;
                            int var71 = var70.field3224;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3229;
                        }
                        if (var38 != null) {
                            var51 = var38.method3418();
                            if (var51 != null) {
                                var55 = var51.field3223;
                                int var72 = var51.field3224;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3229;
                            }
                            var52 = var38.method3419();
                            if (var52 != null) {
                                var56 = var52.field3223;
                                int var73 = var52.field3224;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3229;
                            }
                            var53 = var38.method3420();
                            if (var53 != null) {
                                var57 = var53.field3223;
                                int var74 = var53.field3224;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3229;
                            }
                            var54 = var38.method3421();
                            if (var54 != null) {
                                var58 = var54.field3223;
                                int var75 = var54.field3224;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3229;
                            }
                        }
                        class209 var76 = var35.method3450();
                        if (var76 == null) {
                            var76 = Statics.field152;
                        }
                        class209 var77;
                        if (var38 == null) {
                            var77 = Statics.field152;
                        } else {
                            var77 = var38.method3450();
                            if (var77 == null) {
                                var77 = Statics.field152;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method3439(arg0.field625[var32]);
                        int var83 = var76.method3695(var82);
                        if (var38 != null) {
                            var79 = var38.method3439(arg0.field628[var32]);
                            var81 = var77.method3695(var79);
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
                        int var100 = arg0.field626[var32] - field432;
                        int var101 = var35.field2872 - var35.field2872 * var100 / var35.field2883;
                        int var102 = var35.field2881 * var100 / var35.field2883 + -var35.field2881;
                        int var103 = field448 + arg2 - (var92 >> 1) + var101;
                        int var104 = field470 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field2893 + var104 + 15;
                        int var108 = var107 - var76.field3114;
                        int var109 = var76.field3115 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field2893 + var104 + 15;
                            int var111 = var110 - var77.field3114;
                            int var112 = var77.field3115 + var110;
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
                            var76.method3701(var82, var90 + var103, var107, var35.field2882, 0, var115);
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
                                var77.method3701(var79, var98 + var103, var110, var38.field2882, 0, var115);
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
                            var76.method3759(var82, var90 + var103, var107, var35.field2882 | 0xFF000000, 0);
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
                                var77.method3759(var79, var98 + var103, var110, var38.field2882 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("em.ai(IIIIB)V")
    public static final void method2625(int arg0, int arg1, int arg2, int arg3) {
        field485 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class46.field917;
        int[] var7 = class46.field914;
        for (int var8 = 0; var8 < field329 + var6; var8++) {
            class28 var9;
            if (var8 < var6) {
                var9 = field365[var7[var8]];
                if (field419 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field328[field286[var8 - var6]];
            }
            method3134(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method3134(field365[field419], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field485; var10++) {
            int var11 = field385[var10];
            int var12 = field386[var10];
            int var13 = field435[var10];
            int var14 = field387[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field386[var16] - field387[var16] && var12 - var14 < field386[var16] + 2 && var11 - var13 < field435[var16] + field385[var16] && var11 + var13 > field385[var16] - field435[var16] && field386[var16] - field387[var16] < var12) {
                        var12 = field386[var16] - field387[var16];
                        var15 = true;
                    }
                }
            }
            field448 = field385[var10];
            field470 = field386[var10] = var12;
            String var17 = field392[var10];
            if (field452 == 0) {
                int var18 = 16776960;
                if (field389[var10] < 6) {
                    var18 = field507[field389[var10]];
                }
                if (field389[var10] == 6) {
                    var18 = field503 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field389[var10] == 7) {
                    var18 = field503 % 20 < 10 ? 255 : 65535;
                }
                if (field389[var10] == 8) {
                    var18 = field503 % 20 < 10 ? 45056 : 8454016;
                }
                if (field389[var10] == 9) {
                    int var19 = 150 - field391[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field389[var10] == 10) {
                    int var20 = 150 - field391[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field389[var10] == 11) {
                    int var21 = 150 - field391[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field501[var10] == 0) {
                    Statics.field3189.method3703(var17, field448 + arg0, field470 + arg1, var18, 0);
                }
                if (field501[var10] == 1) {
                    Statics.field3189.method3737(var17, field448 + arg0, field470 + arg1, var18, 0, field503);
                }
                if (field501[var10] == 2) {
                    Statics.field3189.method3706(var17, field448 + arg0, field470 + arg1, var18, 0, field503);
                }
                if (field501[var10] == 3) {
                    Statics.field3189.method3707(var17, field448 + arg0, field470 + arg1, var18, 0, field503, 150 - field391[var10]);
                }
                if (field501[var10] == 4) {
                    int var22 = (150 - field391[var10]) * (Statics.field3189.method3695(var17) + 100) / 150;
                    class220.method3800(field448 + arg0 - 50, arg1, field448 + arg0 + 50, arg1 + arg3);
                    Statics.field3189.method3759(var17, field448 + arg0 + 50 - var22, field470 + arg1, var18, 0);
                    class220.method3877(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field501[var10] == 5) {
                    int var23 = 150 - field391[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class220.method3800(arg0, field470 + arg1 - Statics.field3189.field3113 - 1, arg0 + arg2, field470 + arg1 + 5);
                    Statics.field3189.method3703(var17, field448 + arg0, field470 + arg1 + var24, var18, 0);
                    class220.method3877(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field3189.method3703(var17, field448 + arg0, field470 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("ab.at(IIIII)V")
    public static final void method617(int arg0, int arg1, int arg2, int arg3) {
        if (field400 == 1) {
            Statics.field58[field427 / 100].method3937(field490 - 8, field491 - 8);
        }
        if (field400 == 2) {
            Statics.field58[field427 / 100 + 4].method3937(field490 - 8, field491 - 8);
        }
        field409 = 0;
        int var4 = (Statics.field186.field636 >> 7) + Statics.field267;
        int var5 = (Statics.field186.field605 >> 7) + Statics.field3221;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field409 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field409 = 1;
        }
        if (field409 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field409 = 0;
        }
    }

    @ObfuscatedName("k.ah(Lac;II)V")
    public static final void method164(class28 arg0, int arg1) {
        method810(arg0.field636, arg0.field605, arg1);
    }

    @ObfuscatedName("ag.am(IIII)V")
    public static final void method810(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field448 = -1;
            field470 = -1;
            return;
        }
        int var3 = method616(arg0, arg1, Statics.field1834) - arg2;
        int var4 = arg0 - Statics.field1570;
        int var5 = var3 - Statics.field908;
        int var6 = arg1 - Statics.field977;
        int var7 = class85.field1461[Statics.field95];
        int var8 = class85.field1447[Statics.field95];
        int var9 = class85.field1461[Statics.field887];
        int var10 = class85.field1447[Statics.field887];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field448 = field320 * var11 / var15 + field555 / 2;
            field470 = field320 * var14 / var15 + field556 / 2;
        } else {
            field448 = -1;
            field470 = -1;
        }
    }

    @ObfuscatedName("t.ak(IIII)I")
    public static final int method616(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class11.field81[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class11.field87[var5][var3][var4] + class11.field87[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class11.field87[var5][var3][var4 + 1] + class11.field87[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ao.by(ZS)V")
    public static final void method794(boolean arg0) {
        field351 = arg0;
        if (!field351) {
            int var1 = field335.method2833();
            int var2 = field335.method2737();
            int var3 = field335.method2833();
            Statics.field111 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field111[var4][var5] = field335.method2803();
                }
            }
            Statics.field2094 = new int[var3];
            Statics.field960 = new int[var3];
            Statics.field1848 = new int[var3];
            Statics.field2010 = new byte[var3][];
            Statics.field268 = new byte[var3][];
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
                        Statics.field2094[var7] = var10;
                        Statics.field960[var7] = Statics.field2095.method3224("m" + var8 + "_" + var9);
                        Statics.field1848[var7] = Statics.field2095.method3224("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            Statics.method3146(var1, var2);
            return;
        }
        int var11 = field335.method2833();
        int var12 = field335.method2739();
        int var13 = field335.method2833();
        field335.method2969();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field335.method2951(1);
                    if (var17 == 1) {
                        field352[var14][var15][var16] = field335.method2951(26);
                    } else {
                        field352[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field335.method2952();
        Statics.field111 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field111[var18][var19] = field335.method2803();
            }
        }
        Statics.field2094 = new int[var13];
        Statics.field960 = new int[var13];
        Statics.field1848 = new int[var13];
        Statics.field2010 = new byte[var13][];
        Statics.field268 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field352[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field2094[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field2094[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field960[var20] = Statics.field2095.method3224("m" + var29 + "_" + var30);
                            Statics.field1848[var20] = Statics.field2095.method3224("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        Statics.method3146(var12, var11);
    }

    @ObfuscatedName("fr.bj(ZI)V")
    public static final void method3148(boolean arg0) {
        method2056();
        field339++;
        if (field339 < 50 && !arg0) {
            return;
        }
        field339 = 0;
        if (field344 || Statics.field31 == null) {
            return;
        }
        field333.method2948(25);
        try {
            Statics.field31.method2031(field333.field2086, 0, field333.field2087);
            field333.field2087 = 0;
        } catch (IOException var2) {
            field344 = true;
        }
    }

    @ObfuscatedName("dj.bi(IIIIII)V")
    public static final void method2012(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field144.method1737(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field144.method1846(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field596.field3227;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class198 var13 = Statics.method935(var12);
            if (var13.field2928 == -1) {
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
                class223 var14 = Statics.field2003[var13.field2928];
                if (var14 != null) {
                    int var15 = (var13.field2914 * 4 - var14.field3217) / 2;
                    int var16 = (var13.field2933 * 4 - var14.field3213) / 2;
                    var14.method3888(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field2933) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field144.method1847(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field144.method1846(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class198 var22 = Statics.method935(var21);
            if (var22.field2928 != -1) {
                class223 var23 = Statics.field2003[var22.field2928];
                if (var23 != null) {
                    int var24 = (var22.field2914 * 4 - var23.field3217) / 2;
                    int var25 = (var22.field2933 * 4 - var23.field3213) / 2;
                    var23.method3888(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field2933) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field596.field3227;
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
        int var29 = Statics.field144.method1753(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class198 var31 = Statics.method935(var30);
        if (var31.field2928 == -1) {
            return;
        }
        class223 var32 = Statics.field2003[var31.field2928];
        if (var32 != null) {
            int var33 = (var31.field2914 * 4 - var32.field3217) / 2;
            int var34 = (var31.field2933 * 4 - var32.field3213) / 2;
            var32.method3888(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field2933) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("dx.br(B)Z")
    public static final boolean method2019() {
        if (Statics.field31 == null) {
            return false;
        }
        try {
            int var0 = Statics.field31.method2021();
            if (var0 == 0) {
                return false;
            }
            if (field337 == -1) {
                Statics.field31.method2026(field335.field2086, 0, 1);
                field335.field2087 = 0;
                field337 = field335.method2962();
                field336 = class213.field3152[field337];
                var0--;
            }
            if (field336 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field31.method2026(field335.field2086, 0, 1);
                field336 = field335.field2086[0] & 0xFF;
                var0--;
            }
            if (field336 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field31.method2026(field335.field2086, 0, 2);
                field335.field2087 = 0;
                field336 = field335.method2833();
                var0 -= 2;
            }
            if (var0 < field336) {
                return false;
            }
            field335.field2087 = 0;
            Statics.field31.method2026(field335.field2086, 0, field336);
            field338 = 0;
            field342 = field341;
            field341 = field346;
            field346 = field337;
            if (field337 == 224) {
                int var1 = field335.method2860();
                int var2 = field335.method2737();
                class170 var3 = class170.method971(var1);
                if (var3.field2250 != 1 || var3.field2331 != var2) {
                    var3.field2250 = 1;
                    var3.field2331 = var2;
                    method974(var3);
                }
                field337 = -1;
                return true;
            }
            if (field337 == 164) {
                field381 = field335.method2878();
                if (field381 == 255) {
                    field381 = 0;
                }
                field526 = field335.method2878();
                if (field526 == 255) {
                    field526 = 0;
                }
                field337 = -1;
                return true;
            }
            if (field337 == 3) {
                int var4 = field335.method2803();
                int var5 = field335.method2833();
                if (var4 < -70000) {
                    var5 += 32768;
                }
                class170 var6;
                if (var4 >= 0) {
                    var6 = class170.method971(var4);
                } else {
                    var6 = null;
                }
                if (var6 != null) {
                    for (int var7 = 0; var7 < var6.field2298.length; var7++) {
                        var6.field2298[var7] = 0;
                        var6.field2326[var7] = 0;
                    }
                }
                class13.method3142(var5);
                int var8 = field335.method2833();
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10 = field335.method2738();
                    int var11 = field335.method2807();
                    if (var11 == 255) {
                        var11 = field335.method2746();
                    }
                    if (var6 != null && var9 < var6.field2298.length) {
                        var6.field2298[var9] = var10;
                        var6.field2326[var9] = var11;
                    }
                    class13.method113(var5, var9, var10 - 1, var11);
                }
                if (var6 != null) {
                    method974(var6);
                }
                method2630();
                field478[++field479 - 1 & 0x1F] = var5 & 0x7FFF;
                field337 = -1;
                return true;
            }
            if (field337 == 42) {
                Statics.field597 = field335.method2728();
                Statics.field61 = field335.method2728();
                field337 = -1;
                return true;
            }
            if (field337 == 97) {
                method2630();
                field456 = field335.method2704();
                field487 = field506;
                field337 = -1;
                return true;
            }
            if (field337 == 120) {
                boolean var12 = field335.method2878() == 1;
                if (var12) {
                    Statics.field1543 = class156.method1898() - field335.method2707();
                    Statics.field1550 = new class2(field335, true);
                } else {
                    Statics.field1550 = null;
                }
                field486 = field506;
                field337 = -1;
                return true;
            }
            if (field337 == 107) {
                method770(true);
                field337 = -1;
                return true;
            }
            if (field337 == 115) {
                int var13 = field335.method2739();
                byte var14 = field335.method2787();
                class166.field2165[var13] = var14;
                if (class166.field2166[var13] != var14) {
                    class166.field2166[var13] = var14;
                }
                method2425(var13);
                field497[++field477 - 1 & 0x1F] = var13;
                field337 = -1;
                return true;
            }
            if (field337 == 90) {
                int var15 = field335.method2737();
                class13.method193(var15);
                field478[++field479 - 1 & 0x1F] = var15 & 0x7FFF;
                field337 = -1;
                return true;
            }
            if (field337 == 177) {
                String var16 = field335.method2709();
                Object[] var17 = new Object[var16.length() + 1];
                for (int var18 = var16.length() - 1; var18 >= 0; var18--) {
                    if (var16.charAt(var18) == 's') {
                        var17[var18 + 1] = field335.method2709();
                    } else {
                        var17[var18 + 1] = Integer.valueOf(field335.method2803());
                    }
                }
                var17[0] = Integer.valueOf(field335.method2803());
                class19 var19 = new class19();
                var19.field197 = var17;
                class33.method815(var19);
                field337 = -1;
                return true;
            }
            if (field337 == 69) {
                for (int var20 = 0; var20 < class166.field2166.length; var20++) {
                    if (class166.field2166[var20] != class166.field2165[var20]) {
                        class166.field2166[var20] = class166.field2165[var20];
                        method2425(var20);
                        field497[++field477 - 1 & 0x1F] = var20;
                    }
                }
                field337 = -1;
                return true;
            }
            if (field337 == 173) {
                Statics.field597 = field335.method2807();
                Statics.field61 = field335.method2807();
                for (int var21 = Statics.field61; var21 < Statics.field61 + 8; var21++) {
                    for (int var22 = Statics.field597; var22 < Statics.field597 + 8; var22++) {
                        if (field420[Statics.field1834][var21][var22] != null) {
                            field420[Statics.field1834][var21][var22] = null;
                            method2046(var21, var22);
                        }
                    }
                }
                for (class26 var23 = (class26) field393.method2352(); var23 != null; var23 = (class26) field393.method2341()) {
                    if (var23.field578 >= Statics.field61 && var23.field578 < Statics.field61 + 8 && var23.field579 >= Statics.field597 && var23.field579 < Statics.field597 + 8 && Statics.field1834 == var23.field582) {
                        var23.field576 = 0;
                    }
                }
                field337 = -1;
                return true;
            }
            if (field337 == 27 || field337 == 19 || field337 == 232 || field337 == 22 || field337 == 200 || field337 == 78 || field337 == 137 || field337 == 37 || field337 == 151 || field337 == 13) {
                method1463();
                field337 = -1;
                return true;
            }
            if (field337 == 134) {
                method2630();
                int var24 = field335.method2729();
                int var25 = field335.method2729();
                int var26 = field335.method2803();
                field364[var25] = var26;
                field284[var25] = var24;
                field425[var25] = 1;
                for (int var27 = 0; var27 < 98; var27++) {
                    if (var26 >= class173.field2355[var27]) {
                        field425[var25] = var27 + 2;
                    }
                }
                field480[++field481 - 1 & 0x1F] = var25;
                field337 = -1;
                return true;
            }
            if (field337 == 241) {
                field460 = true;
                Statics.field2183 = field335.method2878();
                Statics.field2871 = field335.method2878();
                Statics.field894 = field335.method2833();
                Statics.field204 = field335.method2878();
                Statics.field802 = field335.method2878();
                if (Statics.field802 >= 100) {
                    int var28 = Statics.field2183 * 128 + 64;
                    int var29 = Statics.field2871 * 128 + 64;
                    int var30 = method616(var28, var29, Statics.field1834) - Statics.field894;
                    int var31 = var28 - Statics.field1570;
                    int var32 = var30 - Statics.field908;
                    int var33 = var29 - Statics.field977;
                    int var34 = (int) Math.sqrt((double) (var31 * var31 + var33 * var33));
                    Statics.field95 = (int) (Math.atan2((double) var32, (double) var34) * 325.949D) & 0x7FF;
                    Statics.field887 = (int) (Math.atan2((double) var31, (double) var33) * -325.949D) & 0x7FF;
                    if (Statics.field95 < 128) {
                        Statics.field95 = 128;
                    }
                    if (Statics.field95 > 383) {
                        Statics.field95 = 383;
                    }
                }
                field337 = -1;
                return true;
            }
            if (field337 == 99) {
                int var35 = field335.method2860();
                int var36 = field335.method2739();
                int var37 = var36 >> 10 & 0x1F;
                int var38 = var36 >> 5 & 0x1F;
                int var39 = var36 & 0x1F;
                int var40 = (var39 << 3) + (var37 << 19) + (var38 << 11);
                class170 var41 = class170.method971(var35);
                if (var41.field2324 != var40) {
                    var41.field2324 = var40;
                    method974(var41);
                }
                field337 = -1;
                return true;
            }
            if (field337 == 254) {
                String var42 = field335.method2709();
                int var43 = field335.method2833();
                byte var44 = field335.method2788();
                boolean var45 = false;
                if (var44 == -128) {
                    var45 = true;
                }
                if (var45) {
                    if (Statics.field1861 == 0) {
                        field337 = -1;
                        return true;
                    }
                    boolean var46 = false;
                    int var47;
                    for (var47 = 0; var47 < Statics.field1861 && (!Statics.field146[var47].field272.equals(var42) || Statics.field146[var47].field274 != var43); var47++) {
                    }
                    if (var47 < Statics.field1861) {
                        while (var47 < Statics.field1861 - 1) {
                            Statics.field146[var47] = Statics.field146[var47 + 1];
                            var47++;
                        }
                        Statics.field1861--;
                        Statics.field146[Statics.field1861] = null;
                    }
                } else {
                    field335.method2709();
                    class25 var48 = new class25();
                    var48.field272 = var42;
                    var48.field276 = class205.method1188(var48.field272, Statics.field2038);
                    var48.field274 = var43;
                    var48.field278 = var44;
                    int var49;
                    for (var49 = Statics.field1861 - 1; var49 >= 0; var49--) {
                        int var50 = Statics.field146[var49].field276.compareTo(var48.field276);
                        if (var50 == 0) {
                            Statics.field146[var49].field274 = var43;
                            Statics.field146[var49].field278 = var44;
                            if (var42.equals(Statics.field186.field244)) {
                                Statics.field519 = var44;
                            }
                            field484 = field506;
                            field337 = -1;
                            return true;
                        }
                        if (var50 < 0) {
                            break;
                        }
                    }
                    if (Statics.field1861 >= Statics.field146.length) {
                        field337 = -1;
                        return true;
                    }
                    for (int var51 = Statics.field1861 - 1; var51 > var49; var51--) {
                        Statics.field146[var51 + 1] = Statics.field146[var51];
                    }
                    if (Statics.field1861 == 0) {
                        Statics.field146 = new class25[100];
                    }
                    Statics.field146[var49 + 1] = var48;
                    Statics.field1861++;
                    if (var42.equals(Statics.field186.field244)) {
                        Statics.field519 = var44;
                    }
                }
                field484 = field506;
                field337 = -1;
                return true;
            }
            if (field337 == 88) {
                int var52 = field335.method2878();
                int var53 = field335.method2737();
                int var54 = field335.method2746();
                class18 var55 = (class18) field302.method2286((long) var54);
                if (var55 != null) {
                    method204(var55, var55.field178 != var53);
                }
                class18 var56 = new class18();
                var56.field178 = var53;
                var56.field177 = var52;
                field302.method2287(var56, (long) var54);
                method1890(var53);
                class170 var57 = class170.method971(var54);
                method974(var57);
                if (field544 != null) {
                    method974(field544);
                    field544 = null;
                }
                method1198();
                Statics.method954(Statics.field3297[var54 >> 16], var57, false);
                class33.method2152(var53);
                if (field450 != -1) {
                    method1977(field450, 1);
                }
                field337 = -1;
                return true;
            }
            if (field337 == 102) {
                for (int var58 = 0; var58 < field365.length; var58++) {
                    if (field365[var58] != null) {
                        field365[var58].field641 = -1;
                    }
                }
                for (int var59 = 0; var59 < field328.length; var59++) {
                    if (field328[var59] != null) {
                        field328[var59].field641 = -1;
                    }
                }
                field337 = -1;
                return true;
            }
            if (field337 == 233) {
                String var60 = field335.method2709();
                String var61 = class210.method3735(class208.method3406(class211.method936(field335)));
                class48.method1892(6, var60, var61);
                field337 = -1;
                return true;
            }
            if (field337 == 160) {
                int var62 = field335.method2739();
                field450 = var62;
                method2604(field450, Statics.field1757, Statics.field1129, false);
                method1890(var62);
                class33.method2152(field450);
                for (int var63 = 0; var63 < 100; var63++) {
                    field495[var63] = true;
                }
                field337 = -1;
                return true;
            }
            if (field337 == 24) {
                for (int var64 = 0; var64 < Statics.field2781; var64++) {
                    class188 var65 = class188.method2594(var64);
                    if (var65 != null) {
                        class166.field2165[var64] = 0;
                        class166.field2166[var64] = 0;
                    }
                }
                method2630();
                field477 += 32;
                field337 = -1;
                return true;
            }
            if (field337 == 248) {
                class46.method201(field335, field336);
                field337 = -1;
                return true;
            }
            if (field337 == 207) {
                field499 = field335.method2739() * 30;
                field487 = field506;
                field337 = -1;
                return true;
            }
            if (field337 == 155) {
                if (field450 != -1) {
                    method1977(field450, 0);
                }
                field337 = -1;
                return true;
            }
            if (field337 == 237) {
                int var66 = field335.method2860();
                int var67 = field335.method2803();
                int var68 = field335.method2833();
                if (var68 == 65535) {
                    var68 = -1;
                }
                class170 var69 = class170.method971(var67);
                if (var69.field2231) {
                    var69.field2219 = var68;
                    var69.field2311 = var66;
                    class199 var71 = class199.method973(var68);
                    var69.field2258 = var71.field2966;
                    var69.field2332 = var71.field2967;
                    var69.field2260 = var71.field2955;
                    var69.field2256 = var71.field2969;
                    var69.field2257 = var71.field2970;
                    var69.field2261 = var71.field2965;
                    if (var71.field2971 == 1) {
                        var69.field2230 = 1;
                    } else {
                        var69.field2230 = 2;
                    }
                    if (var69.field2319 > 0) {
                        var69.field2261 = var69.field2261 * 32 / var69.field2319;
                    } else if (var69.field2218 > 0) {
                        var69.field2261 = var69.field2261 * 32 / var69.field2218;
                    }
                    method974(var69);
                } else if (var68 == -1) {
                    var69.field2250 = 0;
                    field337 = -1;
                    return true;
                } else {
                    class199 var70 = class199.method973(var68);
                    var69.field2250 = 4;
                    var69.field2331 = var68;
                    var69.field2258 = var70.field2966;
                    var69.field2332 = var70.field2967;
                    var69.field2261 = var70.field2965 * 100 / var66;
                    method974(var69);
                }
                field337 = -1;
                return true;
            }
            if (field337 == 198) {
                int var72 = field335.method2803();
                class18 var73 = (class18) field302.method2286((long) var72);
                if (var73 != null) {
                    method204(var73, true);
                }
                if (field544 != null) {
                    method974(field544);
                    field544 = null;
                }
                field337 = -1;
                return true;
            }
            if (field337 == 253) {
                field527 = field335.method2878();
                field337 = -1;
                return true;
            }
            if (field337 == 41) {
                class228.method3782(field335, field336);
                field337 = -1;
                return true;
            }
            if (field337 == 18) {
                field508 = field335.method2878();
                field446 = field335.method2878();
                field337 = -1;
                return true;
            }
            if (field337 == 188) {
                method768();
                field337 = -1;
                return false;
            }
            if (field337 == 70) {
                int var74 = field335.method2860();
                int var75 = field335.method2737();
                if (var75 == 65535) {
                    var75 = -1;
                }
                int var76 = field335.method2738();
                if (var76 == 65535) {
                    var76 = -1;
                }
                int var77 = field335.method2747();
                for (int var78 = var76; var78 <= var75; var78++) {
                    long var79 = ((long) var77 << 32) + (long) var78;
                    class128 var81 = field492.method2286(var79);
                    if (var81 != null) {
                        var81.method2327();
                    }
                    field492.method2287(new class134(var74), var79);
                }
                field337 = -1;
                return true;
            }
            if (field337 == 216) {
                int var82 = field335.method2878();
                String var83 = field335.method2709();
                int var84 = field335.method2729();
                if (var82 >= 1 && var82 <= 8) {
                    if (var83.equalsIgnoreCase("null")) {
                        var83 = null;
                    }
                    field416[var82 - 1] = var83;
                    field528[var82 - 1] = var84 == 0;
                }
                field337 = -1;
                return true;
            }
            if (field337 == 53) {
                method196(field335.method2709());
                field337 = -1;
                return true;
            }
            if (field337 == 28) {
                int var85 = field335.method2747();
                boolean var86 = field335.method2807() == 1;
                class170 var87 = class170.method971(var85);
                if (var87.field2225 != var86) {
                    var87.field2225 = var86;
                    method974(var87);
                }
                field337 = -1;
                return true;
            }
            if (field337 == 235) {
                class30 var88 = new class30();
                var88.field683 = field335.method2709();
                var88.field673 = field335.method2833();
                int var89 = field335.method2803();
                var88.field681 = var89;
                method691(45);
                Statics.field31.method2022();
                Statics.field31 = null;
                class42.method1907(var88);
                field337 = -1;
                return false;
            }
            if (field337 == 239) {
                int var90 = field335.method2737();
                int var91 = field335.method2746();
                int var92 = field335.method2738();
                int var93 = field335.method2833();
                class170 var94 = class170.method971(var91);
                if (var94.field2258 != var92 || var94.field2332 != var90 || var94.field2261 != var93) {
                    var94.field2258 = var92;
                    var94.field2332 = var90;
                    var94.field2261 = var93;
                    method974(var94);
                }
                field337 = -1;
                return true;
            }
            if (field337 == 68) {
                field559 = 1;
                field483 = field506;
                field337 = -1;
                return true;
            }
            if (field337 == 210) {
                int var95 = field335.method2803();
                int var96 = field335.method2704();
                class170 var97 = class170.method971(var95);
                if (var97.field2234 != var96 || var96 == -1) {
                    var97.field2234 = var96;
                    var97.field2329 = 0;
                    var97.field2330 = 0;
                    method974(var97);
                }
                field337 = -1;
                return true;
            }
            if (field337 == 108) {
                int var98 = field336 + field335.field2087;
                int var99 = field335.method2833();
                int var100 = field335.method2833();
                if (field450 != var99) {
                    field450 = var99;
                    method2604(field450, Statics.field1757, Statics.field1129, false);
                    method1890(field450);
                    class33.method2152(field450);
                    for (int var101 = 0; var101 < 100; var101++) {
                        field495[var101] = true;
                    }
                }
                while (var100-- > 0) {
                    int var102 = field335.method2803();
                    int var103 = field335.method2833();
                    int var104 = field335.method2878();
                    class18 var105 = (class18) field302.method2286((long) var102);
                    if (var105 != null && var105.field178 != var103) {
                        method204(var105, true);
                        var105 = null;
                    }
                    if (var105 == null) {
                        class18 var106 = new class18();
                        var106.field178 = var103;
                        var106.field177 = var104;
                        field302.method2287(var106, (long) var102);
                        method1890(var103);
                        class170 var107 = class170.method971(var102);
                        method974(var107);
                        if (field544 != null) {
                            method974(field544);
                            field544 = null;
                        }
                        method1198();
                        Statics.method954(Statics.field3297[var102 >> 16], var107, false);
                        class33.method2152(var103);
                        if (field450 != -1) {
                            method1977(field450, 1);
                        }
                        var105 = var106;
                    }
                    var105.field180 = true;
                }
                for (class18 var109 = (class18) field302.method2289(); var109 != null; var109 = (class18) field302.method2290()) {
                    if (var109.field180) {
                        var109.field180 = false;
                    } else {
                        method204(var109, true);
                    }
                }
                field492 = new class126(512);
                while (field335.field2087 < var98) {
                    int var110 = field335.method2803();
                    int var111 = field335.method2833();
                    int var112 = field335.method2833();
                    int var113 = field335.method2803();
                    for (int var114 = var111; var114 <= var112; var114++) {
                        long var115 = ((long) var110 << 32) + (long) var114;
                        field492.method2287(new class134(var113), var115);
                    }
                }
                field337 = -1;
                return true;
            }
            if (field337 == 29) {
                int var117 = field335.method2803();
                int var118 = field335.method2803();
                class18 var119 = (class18) field302.method2286((long) var118);
                class18 var120 = (class18) field302.method2286((long) var117);
                if (var120 != null) {
                    method204(var120, var119 == null || var119.field178 != var120.field178);
                }
                if (var119 != null) {
                    var119.method2327();
                    field302.method2287(var119, (long) var117);
                }
                class170 var121 = class170.method971(var118);
                if (var121 != null) {
                    method974(var121);
                }
                class170 var122 = class170.method971(var117);
                if (var122 != null) {
                    method974(var122);
                    Statics.method954(Statics.field3297[var122.field2207 >>> 16], var122, true);
                }
                if (field450 != -1) {
                    method1977(field450, 1);
                }
                field337 = -1;
                return true;
            }
            if (field337 == 221) {
                int var123 = field335.method2833();
                int var124 = field335.method2878();
                int var125 = field335.method2833();
                if (field531 != 0 && var124 != 0 && field533 < 50) {
                    field534[field533] = var123;
                    field535[field533] = var124;
                    field536[field533] = var125;
                    field538[field533] = null;
                    field537[field533] = 0;
                    field533++;
                }
                field337 = -1;
                return true;
            }
            if (field337 == 75) {
                method2630();
                field455 = field335.method2878();
                field487 = field506;
                field337 = -1;
                return true;
            }
            if (field337 == 179) {
                int var129 = field335.method2738();
                int var130 = field335.method2803();
                class170 var131 = class170.method971(var130);
                if (var131.field2250 != 2 || var131.field2331 != var129) {
                    var131.field2250 = 2;
                    var131.field2331 = var129;
                    method974(var131);
                }
                field337 = -1;
                return true;
            }
            if (field337 == 132) {
                int var132 = field335.method2746();
                Statics.field1467 = Statics.field1794.method1944(var132);
                field337 = -1;
                return true;
            }
            if (field337 == 215) {
                int var133 = field335.method2747();
                class170 var134 = class170.method971(var133);
                for (int var135 = 0; var135 < var134.field2298.length; var135++) {
                    var134.field2298[var135] = -1;
                    var134.field2298[var135] = 0;
                }
                method974(var134);
                field337 = -1;
                return true;
            }
            if (field337 == 161) {
                class46.method611();
                for (int var136 = 0; var136 < 2048; var136++) {
                    field365[var136] = null;
                }
                class46.method772(field335);
                field337 = -1;
                return true;
            }
            if (field337 == 193) {
                method794(false);
                field335.method2962();
                int var137 = field335.method2833();
                class46.method201(field335, var137);
                field337 = -1;
                return true;
            }
            if (field337 == 110) {
                int var138 = field335.method2747();
                class170 var139 = class170.method971(var138);
                var139.field2250 = 3;
                var139.field2331 = Statics.field186.field242.method3048();
                method974(var139);
                field337 = -1;
                return true;
            }
            if (field337 == 190) {
                int var140 = field335.method2878();
                int var141 = field335.method2878();
                int var142 = field335.method2878();
                int var143 = field335.method2878();
                field540[var140] = true;
                field541[var140] = var141;
                field542[var140] = var142;
                field543[var140] = var143;
                field293[var140] = 0;
                field337 = -1;
                return true;
            }
            if (field337 == 73) {
                Statics.field597 = field335.method2729();
                Statics.field61 = field335.method2807();
                while (field335.field2087 < field336) {
                    field337 = field335.method2878();
                    method1463();
                }
                field337 = -1;
                return true;
            }
            if (field337 == 106) {
                int var144 = field335.method2746();
                int var145 = field335.method2739();
                class166.field2165[var145] = var144;
                if (class166.field2166[var145] != var144) {
                    class166.field2166[var145] = var144;
                }
                method2425(var145);
                field497[++field477 - 1 & 0x1F] = var145;
                field337 = -1;
                return true;
            }
            if (field337 == 159) {
                int var146 = field335.method2860();
                String var147 = field335.method2709();
                class170 var148 = class170.method971(var146);
                if (!var147.equals(var148.field2267)) {
                    var148.field2267 = var147;
                    method974(var148);
                }
                field337 = -1;
                return true;
            }
            if (field337 == 45) {
                int var149 = field335.method2878();
                if (field335.method2878() == 0) {
                    field356[var149] = new class5();
                    field335.field2087 += 18;
                } else {
                    field335.field2087--;
                    field356[var149] = new class5(field335, false);
                }
                field289 = field506;
                field337 = -1;
                return true;
            }
            if (field337 == 62) {
                int var150 = field335.method2747();
                int var151 = field335.method2754();
                int var152 = field335.method2740();
                class170 var153 = class170.method971(var150);
                if (var153.field2216 != var152 || var153.field2217 != var151 || var153.field2212 != 0 || var153.field2213 != 0) {
                    var153.field2216 = var152;
                    var153.field2217 = var151;
                    var153.field2212 = 0;
                    var153.field2213 = 0;
                    method974(var153);
                    method3136(var153);
                    if (var153.field2209 == 0) {
                        Statics.method954(Statics.field3297[var150 >> 16], var153, false);
                    }
                }
                field337 = -1;
                return true;
            }
            if (field337 == 243) {
                String var154 = field335.method2709();
                long var155 = (long) field335.method2833();
                long var157 = (long) field335.method2705();
                class178 var159 = (class178) class149.method208(class178.method13(), field335.method2878());
                long var160 = (var155 << 32) + var157;
                boolean var162 = false;
                for (int var163 = 0; var163 < 100; var163++) {
                    if (field511[var163] == var160) {
                        var162 = true;
                        break;
                    }
                }
                if (Statics.method190(var154)) {
                    var162 = true;
                }
                if (!var162 && field409 == 0) {
                    field511[field512] = var160;
                    field512 = (field512 + 1) % 100;
                    String var164 = class210.method3735(class208.method3406(class211.method936(field335)));
                    byte var165;
                    if (var159.field2670) {
                        var165 = 7;
                    } else {
                        var165 = 3;
                    }
                    if (var159.field2666 == -1) {
                        class48.method1892(var165, var154, var164);
                    } else {
                        int var167 = var159.field2666;
                        String var168 = "<img=" + var167 + ">";
                        class48.method1892(var165, var168 + var154, var164);
                    }
                }
                field337 = -1;
                return true;
            }
            if (field337 == 153) {
                String var169 = field335.method2709();
                long var170 = field335.method2707();
                long var172 = (long) field335.method2833();
                long var174 = (long) field335.method2705();
                class178 var176 = (class178) class149.method208(class178.method13(), field335.method2878());
                long var177 = (var172 << 32) + var174;
                boolean var179 = false;
                for (int var180 = 0; var180 < 100; var180++) {
                    if (field511[var180] == var177) {
                        var179 = true;
                        break;
                    }
                }
                if (var176.field2671 && Statics.method190(var169)) {
                    var179 = true;
                }
                if (!var179 && field409 == 0) {
                    field511[field512] = var177;
                    field512 = (field512 + 1) % 100;
                    String var181 = class210.method3735(class208.method3406(class211.method936(field335)));
                    if (var176.field2666 == -1) {
                        class48.method639(9, var169, var181, class206.method1924(var170));
                    } else {
                        int var182 = var176.field2666;
                        String var183 = "<img=" + var182 + ">";
                        class48.method639(9, var183 + var169, var181, class206.method1924(var170));
                    }
                }
                field337 = -1;
                return true;
            }
            if (field337 == 146) {
                field460 = true;
                Statics.field2117 = field335.method2878();
                Statics.field1850 = field335.method2878();
                Statics.field44 = field335.method2833();
                Statics.field131 = field335.method2878();
                Statics.field3053 = field335.method2878();
                if (Statics.field3053 >= 100) {
                    Statics.field1570 = Statics.field2117 * 128 + 64;
                    Statics.field977 = Statics.field1850 * 128 + 64;
                    Statics.field908 = method616(Statics.field1570, Statics.field977, Statics.field1834) - Statics.field44;
                }
                field337 = -1;
                return true;
            }
            if (field337 == 175) {
                Statics.field3004 = class217.method816(field335.method2878());
                field337 = -1;
                return true;
            }
            if (field337 == 6) {
                int var184 = field335.method2738();
                int var185 = field335.method2833();
                int var186 = field335.method2747();
                class170 var187 = class170.method971(var186);
                var187.field2325 = (var185 << 16) + var184;
                field337 = -1;
                return true;
            }
            if (field337 == 114) {
                method794(true);
                field335.method2962();
                int var188 = field335.method2833();
                class46.method201(field335, var188);
                field337 = -1;
                return true;
            }
            if (field337 == 138) {
                int var189 = field335.method2803();
                int var190 = field335.method2833();
                if (var189 < -70000) {
                    var190 += 32768;
                }
                class170 var191;
                if (var189 >= 0) {
                    var191 = class170.method971(var189);
                } else {
                    var191 = null;
                }
                while (field335.field2087 < field336) {
                    int var192 = field335.method2854();
                    int var193 = field335.method2833();
                    int var194 = 0;
                    if (var193 != 0) {
                        var194 = field335.method2878();
                        if (var194 == 255) {
                            var194 = field335.method2803();
                        }
                    }
                    if (var191 != null && var192 >= 0 && var192 < var191.field2298.length) {
                        var191.field2298[var192] = var193;
                        var191.field2326[var192] = var194;
                    }
                    class13.method113(var190, var192, var193 - 1, var194);
                }
                if (var191 != null) {
                    method974(var191);
                }
                method2630();
                field478[++field479 - 1 & 0x1F] = var190 & 0x7FFF;
                field337 = -1;
                return true;
            }
            if (field337 == 63) {
                method770(false);
                field337 = -1;
                return true;
            }
            if (field337 == 180) {
                int var195 = field335.method2803();
                int var196 = field335.method2803();
                if (Statics.field1653 == null || !Statics.field1653.isValid()) {
                    try {
                        Iterator var197 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var197.hasNext()) {
                            GarbageCollectorMXBean var198 = (GarbageCollectorMXBean) var197.next();
                            if (var198.isValid()) {
                                Statics.field1653 = var198;
                                field569 = -1L;
                                field568 = -1L;
                            }
                        }
                    } catch (Throwable var276) {
                    }
                }
                long var200 = class156.method1898();
                int var202 = -1;
                if (Statics.field1653 != null) {
                    long var203 = Statics.field1653.getCollectionTime();
                    if (field568 != -1L) {
                        long var205 = var203 - field568;
                        long var207 = var200 - field569;
                        if (var207 != 0L) {
                            var202 = (int) (var205 * 100L / var207);
                        }
                    }
                    field568 = var203;
                    field569 = var200;
                }
                field333.method2948(59);
                field333.method2745(var195);
                field333.method2714(var196);
                field333.method2906(var202);
                field333.method2906(field1774);
                field337 = -1;
                return true;
            }
            if (field337 == 240) {
                while (field335.field2087 < field336) {
                    boolean var209 = field335.method2878() == 1;
                    String var210 = field335.method2709();
                    String var211 = field335.method2709();
                    int var212 = field335.method2833();
                    int var213 = field335.method2878();
                    int var214 = field335.method2878();
                    boolean var215 = (var214 & 0x2) != 0;
                    boolean var216 = (var214 & 0x1) != 0;
                    if (var212 > 0) {
                        field335.method2709();
                        field335.method2878();
                        field335.method2803();
                    }
                    field335.method2709();
                    for (int var217 = 0; var217 < field348; var217++) {
                        class15 var218 = field560[var217];
                        if (var209) {
                            if (var211.equals(var218.field138)) {
                                var218.field138 = var210;
                                var218.field139 = var211;
                                var210 = null;
                                break;
                            }
                        } else if (var210.equals(var218.field138)) {
                            if (var218.field140 != var212) {
                                boolean var219 = true;
                                for (class17 var220 = (class17) field561.method2365(); var220 != null; var220 = (class17) field561.method2369()) {
                                    if (var220.field167.equals(var210)) {
                                        if (var212 != 0 && var220.field174 == 0) {
                                            var220.method2374();
                                            var219 = false;
                                        } else if (var212 == 0 && var220.field174 != 0) {
                                            var220.method2374();
                                            var219 = false;
                                        }
                                    }
                                }
                                if (var219) {
                                    field561.method2364(new class17(var210, var212));
                                }
                                var218.field140 = var212;
                            }
                            var218.field139 = var211;
                            var218.field145 = var213;
                            var218.field142 = var215;
                            var218.field143 = var216;
                            var210 = null;
                            break;
                        }
                    }
                    if (var210 != null && field348 < 400) {
                        class15 var221 = new class15();
                        field560[field348] = var221;
                        var221.field138 = var210;
                        var221.field139 = var211;
                        var221.field140 = var212;
                        var221.field145 = var213;
                        var221.field142 = var215;
                        var221.field143 = var216;
                        field348++;
                    }
                }
                field559 = 2;
                field483 = field506;
                boolean var222 = false;
                int var223 = field348;
                while (var223 > 0) {
                    boolean var224 = true;
                    var223--;
                    for (int var225 = 0; var225 < var223; var225++) {
                        boolean var226 = false;
                        class15 var227 = field560[var225];
                        class15 var228 = field560[var225 + 1];
                        if (field562 != var227.field140 && field562 == var228.field140) {
                            var226 = true;
                        }
                        if (!var226 && var227.field140 == 0 && var228.field140 != 0) {
                            var226 = true;
                        }
                        if (!var226 && !var227.field142 && var228.field142) {
                            var226 = true;
                        }
                        if (!var226 && !var227.field143 && var228.field143) {
                            var226 = true;
                        }
                        if (var226) {
                            class15 var229 = field560[var225];
                            field560[var225] = field560[var225 + 1];
                            field560[var225 + 1] = var229;
                            var224 = false;
                        }
                    }
                    if (var224) {
                        break;
                    }
                }
                field337 = -1;
                return true;
            }
            if (field337 == 71) {
                field305 = field335.method2878();
                if (field305 == 1) {
                    field306 = field335.method2833();
                }
                if (field305 >= 2 && field305 <= 6) {
                    if (field305 == 2) {
                        field311 = 64;
                        field312 = 64;
                    }
                    if (field305 == 3) {
                        field311 = 0;
                        field312 = 64;
                    }
                    if (field305 == 4) {
                        field311 = 128;
                        field312 = 64;
                    }
                    if (field305 == 5) {
                        field311 = 64;
                        field312 = 0;
                    }
                    if (field305 == 6) {
                        field311 = 64;
                        field312 = 128;
                    }
                    field305 = 2;
                    field296 = field335.method2833();
                    field383 = field335.method2833();
                    field347 = field335.method2878();
                }
                if (field305 == 10) {
                    field563 = field335.method2833();
                }
                field337 = -1;
                return true;
            }
            if (field337 == 57) {
                while (field335.field2087 < field336) {
                    int var230 = field335.method2878();
                    boolean var231 = (var230 & 0x1) == 1;
                    String var232 = field335.method2709();
                    String var233 = field335.method2709();
                    field335.method2709();
                    for (int var234 = 0; var234 < field567; var234++) {
                        class20 var235 = field525[var234];
                        if (var231) {
                            if (var233.equals(var235.field205)) {
                                var235.field205 = var232;
                                var235.field207 = var233;
                                var232 = null;
                                break;
                            }
                        } else if (var232.equals(var235.field205)) {
                            var235.field205 = var232;
                            var235.field207 = var233;
                            var232 = null;
                            break;
                        }
                    }
                    if (var232 != null && field567 < 400) {
                        class20 var236 = new class20();
                        field525[field567] = var236;
                        var236.field205 = var232;
                        var236.field207 = var233;
                        field567++;
                    }
                }
                field483 = field506;
                field337 = -1;
                return true;
            }
            if (field337 == 208) {
                int var237 = field335.method2854();
                boolean var238 = field335.method2878() == 1;
                String var239 = "";
                boolean var240 = false;
                if (var238) {
                    var239 = field335.method2709();
                    if (Statics.method190(var239)) {
                        var240 = true;
                    }
                }
                String var241 = field335.method2709();
                if (!var240) {
                    class48.method1892(var237, var239, var241);
                }
                field337 = -1;
                return true;
            }
            if (field337 == 234) {
                int var242 = field335.method2738();
                if (var242 == 65535) {
                    var242 = -1;
                }
                Statics.method2982(var242);
                field337 = -1;
                return true;
            }
            if (field337 == 33) {
                int var243 = field335.method2833();
                if (var243 == 65535) {
                    var243 = -1;
                }
                int var244 = field335.method2742();
                if (field545 != 0 && var243 != -1) {
                    class139.method873(Statics.field176, var243, 0, field545, false);
                    field440 = true;
                }
                field337 = -1;
                return true;
            }
            if (field337 == 124) {
                field335.field2087 += 28;
                if (field335.method2724()) {
                    class160 var245 = field335;
                    int var246 = field335.field2087 - 28;
                    method1917(var245.field2086, var246);
                    if (class105.field1690 != null) {
                        try {
                            class105.field1690.method1386(0L);
                            class105.field1690.method1403(var245.field2086, var246, 24);
                        } catch (Exception var275) {
                        }
                    }
                }
                field337 = -1;
                return true;
            }
            if (field337 == 55) {
                field484 = field506;
                if (field336 == 0) {
                    field517 = null;
                    field518 = null;
                    Statics.field1861 = 0;
                    Statics.field146 = null;
                    field337 = -1;
                    return true;
                }
                field518 = field335.method2709();
                long var248 = field335.method2707();
                long var250 = var248;
                String var252;
                if (var248 <= 0L || var248 >= 6582952005840035281L) {
                    var252 = null;
                } else if (var248 % 37L == 0L) {
                    var252 = null;
                } else {
                    int var253 = 0;
                    for (long var254 = var248; var254 != 0L; var254 /= 37L) {
                        var253++;
                    }
                    StringBuilder var256 = new StringBuilder(var253);
                    while (var250 != 0L) {
                        long var257 = var250;
                        var250 /= 37L;
                        var256.append(class206.field3096[(int) (var257 - var250 * 37L)]);
                    }
                    var252 = var256.reverse().toString();
                }
                field517 = var252;
                Statics.field738 = field335.method2788();
                int var259 = field335.method2878();
                if (var259 == 255) {
                    field337 = -1;
                    return true;
                }
                Statics.field1861 = var259;
                class25[] var260 = new class25[100];
                for (int var261 = 0; var261 < Statics.field1861; var261++) {
                    var260[var261] = new class25();
                    var260[var261].field272 = field335.method2709();
                    var260[var261].field276 = class205.method1188(var260[var261].field272, Statics.field2038);
                    var260[var261].field274 = field335.method2833();
                    var260[var261].field278 = field335.method2788();
                    field335.method2709();
                    if (var260[var261].field272.equals(Statics.field186.field244)) {
                        Statics.field519 = var260[var261].field278;
                    }
                }
                boolean var262 = false;
                int var263 = Statics.field1861;
                while (var263 > 0) {
                    boolean var264 = true;
                    var263--;
                    for (int var265 = 0; var265 < var263; var265++) {
                        if (var260[var265].field276.compareTo(var260[var265 + 1].field276) > 0) {
                            class25 var266 = var260[var265];
                            var260[var265] = var260[var265 + 1];
                            var260[var265 + 1] = var266;
                            var264 = false;
                        }
                    }
                    if (var264) {
                        break;
                    }
                }
                Statics.field146 = var260;
                field337 = -1;
                return true;
            }
            if (field337 == 219) {
                field460 = false;
                for (int var267 = 0; var267 < 5; var267++) {
                    field540[var267] = false;
                }
                field337 = -1;
                return true;
            }
            if (field337 == 34) {
                int var268 = field335.method2747();
                int var269 = field335.method2737();
                class170 var270 = class170.method971(var268);
                if (var270 != null && var270.field2209 == 0) {
                    if (var269 > var270.field2206 - var270.field2223) {
                        var269 = var270.field2206 - var270.field2223;
                    }
                    if (var269 < 0) {
                        var269 = 0;
                    }
                    if (var270.field2229 != var269) {
                        var270.field2229 = var269;
                        method974(var270);
                    }
                }
                field337 = -1;
                return true;
            }
            class102.method1916("" + field337 + class38.field779 + field341 + class38.field779 + field342 + class38.field779 + field336, (Throwable) null);
            method768();
        } catch (IOException var277) {
            if (field343 > 0) {
                method768();
            } else {
                method691(40);
                Statics.field237 = Statics.field31;
                Statics.field31 = null;
            }
        } catch (Exception var278) {
            String var273 = "" + field337 + class38.field779 + field341 + class38.field779 + field342 + class38.field779 + field336 + class38.field779 + (Statics.field267 + Statics.field186.field659[0]) + class38.field779 + (Statics.field3221 + Statics.field186.field660[0]) + class38.field779;
            for (int var274 = 0; var274 < field336 && var274 < 50; var274++) {
                var273 = var273 + field335.field2086[var274] + class38.field779;
            }
            class102.method1916(var273, var278);
            method768();
        }
        return true;
    }

    @ObfuscatedName("bh.bn(I)V")
    public static final void method1463() {
        if (field337 == 78) {
            int var0 = field335.method2737();
            int var1 = field335.method2878();
            int var2 = (var1 >> 4 & 0x7) + Statics.field61;
            int var3 = (var1 & 0x7) + Statics.field597;
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class129 var4 = field420[Statics.field1834][var2][var3];
                if (var4 != null) {
                    for (class44 var5 = (class44) var4.method2352(); var5 != null; var5 = (class44) var4.method2341()) {
                        if ((var0 & 0x7FFF) == var5.field899) {
                            var5.method2327();
                            break;
                        }
                    }
                    if (var4.method2352() == null) {
                        field420[Statics.field1834][var2][var3] = null;
                    }
                    method2046(var2, var3);
                }
            }
        } else if (field337 == 151) {
            int var6 = field335.method2729();
            int var7 = (var6 >> 4 & 0x7) + Statics.field61;
            int var8 = (var6 & 0x7) + Statics.field597;
            int var9 = field335.method2807();
            int var10 = var9 >> 2;
            int var11 = var9 & 0x3;
            int var12 = field330[var10];
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                method195(Statics.field1834, var7, var8, var12, -1, var10, var11, 0, -1);
            }
        } else if (field337 == 37) {
            int var13 = field335.method2737();
            int var14 = field335.method2878();
            int var15 = var14 >> 2;
            int var16 = var14 & 0x3;
            int var17 = field330[var15];
            int var18 = field335.method2878();
            int var19 = (var18 >> 4 & 0x7) + Statics.field61;
            int var20 = (var18 & 0x7) + Statics.field597;
            if (var19 >= 0 && var20 >= 0 && var19 < 103 && var20 < 103) {
                if (var17 == 0) {
                    class91 var21 = Statics.field144.method1733(Statics.field1834, var19, var20);
                    if (var21 != null) {
                        int var22 = var21.field1559 >> 14 & 0x7FFF;
                        if (var15 == 2) {
                            var21.field1557 = new class50(var22, 2, var16 + 4, Statics.field1834, var19, var20, var13, false, var21.field1557);
                            var21.field1554 = new class50(var22, 2, var16 + 1 & 0x3, Statics.field1834, var19, var20, var13, false, var21.field1554);
                        } else {
                            var21.field1557 = new class50(var22, var15, var16, Statics.field1834, var19, var20, var13, false, var21.field1557);
                        }
                    }
                }
                if (var17 == 1) {
                    class96 var23 = Statics.field144.method1889(Statics.field1834, var19, var20);
                    if (var23 != null) {
                        int var24 = var23.field1611 >> 14 & 0x7FFF;
                        if (var15 == 4 || var15 == 5) {
                            var23.field1610 = new class50(var24, 4, var16, Statics.field1834, var19, var20, var13, false, var23.field1610);
                        } else if (var15 == 6) {
                            var23.field1610 = new class50(var24, 4, var16 + 4, Statics.field1834, var19, var20, var13, false, var23.field1610);
                        } else if (var15 == 7) {
                            var23.field1610 = new class50(var24, 4, (var16 + 2 & 0x3) + 4, Statics.field1834, var19, var20, var13, false, var23.field1610);
                        } else if (var15 == 8) {
                            var23.field1610 = new class50(var24, 4, var16 + 4, Statics.field1834, var19, var20, var13, false, var23.field1610);
                            var23.field1609 = new class50(var24, 4, (var16 + 2 & 0x3) + 4, Statics.field1834, var19, var20, var13, false, var23.field1609);
                        }
                    }
                }
                if (var17 == 2) {
                    class97 var25 = Statics.field144.method1866(Statics.field1834, var19, var20);
                    if (var15 == 11) {
                        var15 = 10;
                    }
                    if (var25 != null) {
                        var25.field1619 = new class50(var25.field1630 >> 14 & 0x7FFF, var15, var16, Statics.field1834, var19, var20, var13, false, var25.field1619);
                    }
                }
                if (var17 == 3) {
                    class79 var26 = Statics.field144.method1736(Statics.field1834, var19, var20);
                    if (var26 != null) {
                        var26.field1306 = new class50(var26.field1304 >> 14 & 0x7FFF, 22, var16, Statics.field1834, var19, var20, var13, false, var26.field1306);
                    }
                }
            }
        } else {
            if (field337 == 232) {
                int var27 = field335.method2878();
                int var28 = (var27 >> 4 & 0x7) + Statics.field61;
                int var29 = (var27 & 0x7) + Statics.field597;
                byte var30 = field335.method2787();
                byte var31 = field335.method2733();
                int var32 = field335.method2728();
                int var33 = var32 >> 2;
                int var34 = var32 & 0x3;
                int var35 = field330[var33];
                byte var36 = field335.method2851();
                int var37 = field335.method2833();
                byte var38 = field335.method2733();
                int var39 = field335.method2833();
                int var40 = field335.method2737();
                int var41 = field335.method2738();
                class24 var42;
                if (field411 == var37) {
                    var42 = Statics.field186;
                } else {
                    var42 = field365[var37];
                }
                if (var42 != null) {
                    class198 var43 = Statics.method935(var39);
                    int var44;
                    int var45;
                    if (var34 == 1 || var34 == 3) {
                        var44 = var43.field2933;
                        var45 = var43.field2914;
                    } else {
                        var44 = var43.field2914;
                        var45 = var43.field2933;
                    }
                    int var46 = (var44 >> 1) + var28;
                    int var47 = (var44 + 1 >> 1) + var28;
                    int var48 = (var45 >> 1) + var29;
                    int var49 = (var45 + 1 >> 1) + var29;
                    int[][] var50 = class11.field87[Statics.field1834];
                    int var51 = var50[var46][var48] + var50[var47][var48] + var50[var46][var49] + var50[var47][var49] >> 2;
                    int var52 = (var28 << 7) + (var44 << 6);
                    int var53 = (var29 << 7) + (var45 << 6);
                    class83 var54 = var43.method3483(var33, var34, var50, var52, var51, var53);
                    if (var54 != null) {
                        method195(Statics.field1834, var28, var29, var35, -1, 0, 0, var40 + 1, var41 + 1);
                        var42.field249 = field432 + var40;
                        var42.field250 = field432 + var41;
                        var42.field254 = var54;
                        var42.field247 = var28 * 128 + var44 * 64;
                        var42.field253 = var29 * 128 + var45 * 64;
                        var42.field269 = var51;
                        if (var36 > var30) {
                            byte var55 = var36;
                            var36 = var30;
                            var30 = var55;
                        }
                        if (var31 > var38) {
                            byte var56 = var31;
                            var31 = var38;
                            var38 = var56;
                        }
                        var42.field252 = var28 + var36;
                        var42.field257 = var28 + var30;
                        var42.field256 = var29 + var31;
                        var42.field263 = var29 + var38;
                    }
                }
            }
            if (field337 == 27) {
                int var57 = field335.method2878();
                int var58 = (var57 >> 4 & 0x7) + Statics.field61;
                int var59 = (var57 & 0x7) + Statics.field597;
                int var60 = field335.method2833();
                int var61 = field335.method2878();
                int var62 = var61 >> 4 & 0xF;
                int var63 = var61 & 0x7;
                int var64 = field335.method2878();
                if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                    int var65 = var62 + 1;
                    if (Statics.field186.field659[0] >= var58 - var65 && Statics.field186.field659[0] <= var58 + var65 && Statics.field186.field660[0] >= var59 - var65 && Statics.field186.field660[0] <= var59 + var65 && field398 != 0 && var63 > 0 && field533 < 50) {
                        field534[field533] = var60;
                        field535[field533] = var63;
                        field536[field533] = var64;
                        field538[field533] = null;
                        field537[field533] = (var58 << 16) + (var59 << 8) + var62;
                        field533++;
                    }
                }
            }
            if (field337 == 22) {
                int var66 = field335.method2878();
                int var67 = (var66 >> 4 & 0x7) + Statics.field61;
                int var68 = (var66 & 0x7) + Statics.field597;
                int var69 = field335.method2833();
                int var70 = field335.method2878();
                int var71 = field335.method2833();
                if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104) {
                    int var72 = var67 * 128 + 64;
                    int var73 = var68 * 128 + 64;
                    class34 var74 = new class34(var69, Statics.field1834, var72, var73, method616(var72, var73, Statics.field1834) - var70, var71, field432);
                    field423.method2360(var74);
                }
            } else if (field337 == 200) {
                int var75 = field335.method2878();
                int var76 = (var75 >> 4 & 0x7) + Statics.field61;
                int var77 = (var75 & 0x7) + Statics.field597;
                int var78 = var76 + field335.method2788();
                int var79 = var77 + field335.method2788();
                int var80 = field335.method2704();
                int var81 = field335.method2833();
                int var82 = field335.method2878() * 4;
                int var83 = field335.method2878() * 4;
                int var84 = field335.method2833();
                int var85 = field335.method2833();
                int var86 = field335.method2878();
                int var87 = field335.method2878();
                if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104 && var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104 && var81 != 65535) {
                    int var88 = var76 * 128 + 64;
                    int var89 = var77 * 128 + 64;
                    int var90 = var78 * 128 + 64;
                    int var91 = var79 * 128 + 64;
                    class43 var92 = new class43(var81, Statics.field1834, var88, var89, method616(var88, var89, Statics.field1834) - var82, field432 + var84, field432 + var85, var86, var87, var80, var83);
                    var92.method853(var90, var91, method616(var90, var91, Statics.field1834) - var83, field432 + var84);
                    field422.method2360(var92);
                }
            } else if (field337 == 19) {
                int var93 = field335.method2878();
                int var94 = (var93 >> 4 & 0x7) + Statics.field61;
                int var95 = (var93 & 0x7) + Statics.field597;
                int var96 = field335.method2833();
                int var97 = field335.method2833();
                int var98 = field335.method2833();
                if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                    class129 var99 = field420[Statics.field1834][var94][var95];
                    if (var99 != null) {
                        for (class44 var100 = (class44) var99.method2352(); var100 != null; var100 = (class44) var99.method2341()) {
                            if ((var96 & 0x7FFF) == var100.field899 && var100.field892 == var97) {
                                var100.field892 = var98;
                                break;
                            }
                        }
                        method2046(var94, var95);
                    }
                }
            } else if (field337 == 13) {
                int var101 = field335.method2728();
                int var102 = (var101 >> 4 & 0x7) + Statics.field61;
                int var103 = (var101 & 0x7) + Statics.field597;
                int var104 = field335.method2878();
                int var105 = var104 >> 2;
                int var106 = var104 & 0x3;
                int var107 = field330[var105];
                int var108 = field335.method2738();
                if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                    method195(Statics.field1834, var102, var103, var107, var108, var105, var106, 0, -1);
                }
            } else if (field337 == 137) {
                int var109 = field335.method2738();
                int var110 = field335.method2737();
                int var111 = field335.method2728();
                int var112 = (var111 >> 4 & 0x7) + Statics.field61;
                int var113 = (var111 & 0x7) + Statics.field597;
                if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104) {
                    class44 var114 = new class44();
                    var114.field899 = var109;
                    var114.field892 = var110;
                    if (field420[Statics.field1834][var112][var113] == null) {
                        field420[Statics.field1834][var112][var113] = new class129();
                    }
                    field420[Statics.field1834][var112][var113].method2360(var114);
                    method2046(var112, var113);
                }
            }
        }
    }

    @ObfuscatedName("b.bx(IIIIIIIIII)V")
    public static final void method195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class26 var9 = null;
        for (class26 var10 = (class26) field393.method2352(); var10 != null; var10 = (class26) field393.method2341()) {
            if (var10.field582 == arg0 && var10.field578 == arg1 && var10.field579 == arg2 && var10.field586 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class26();
            var9.field582 = arg0;
            var9.field586 = arg3;
            var9.field578 = arg1;
            var9.field579 = arg2;
            method261(var9);
            field393.method2360(var9);
        }
        var9.field583 = arg4;
        var9.field585 = arg5;
        var9.field584 = arg6;
        var9.field587 = arg7;
        var9.field576 = arg8;
    }

    @ObfuscatedName("em.bl(B)V")
    public static final void method2624() {
        for (class26 var0 = (class26) field393.method2352(); var0 != null; var0 = (class26) field393.method2341()) {
            if (var0.field576 == -1) {
                var0.field587 = 0;
                method261(var0);
            } else {
                var0.method2327();
            }
        }
    }

    @ObfuscatedName("z.be(Lt;I)V")
    public static final void method261(class26 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field586 == 0) {
            var1 = Statics.field144.method1737(arg0.field582, arg0.field578, arg0.field579);
        }
        if (arg0.field586 == 1) {
            var1 = Statics.field144.method1888(arg0.field582, arg0.field578, arg0.field579);
        }
        if (arg0.field586 == 2) {
            var1 = Statics.field144.method1847(arg0.field582, arg0.field578, arg0.field579);
        }
        if (arg0.field586 == 3) {
            var1 = Statics.field144.method1753(arg0.field582, arg0.field578, arg0.field579);
        }
        if (var1 != 0) {
            int var5 = Statics.field144.method1846(arg0.field582, arg0.field578, arg0.field579, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field580 = var2;
        arg0.field577 = var3;
        arg0.field581 = var4;
    }

    @ObfuscatedName("n.bv(I)V")
    public static final void method20() {
        for (class26 var0 = (class26) field393.method2352(); var0 != null; var0 = (class26) field393.method2341()) {
            if (var0.field576 > 0) {
                var0.field576--;
            }
            if (var0.field576 != 0) {
                if (var0.field587 > 0) {
                    var0.field587--;
                }
                if (var0.field587 == 0 && var0.field578 >= 1 && var0.field579 >= 1 && var0.field578 <= 102 && var0.field579 <= 102 && (var0.field583 < 0 || class11.method262(var0.field583, var0.field585))) {
                    method18(var0.field582, var0.field586, var0.field578, var0.field579, var0.field583, var0.field584, var0.field585);
                    var0.field587 = -1;
                    if (var0.field583 == var0.field580 && var0.field580 == -1) {
                        var0.method2327();
                    } else if (var0.field583 == var0.field580 && var0.field584 == var0.field581 && var0.field585 == var0.field577) {
                        var0.method2327();
                    }
                }
            } else if (var0.field580 < 0 || class11.method262(var0.field580, var0.field577)) {
                method18(var0.field582, var0.field586, var0.field578, var0.field579, var0.field580, var0.field581, var0.field577);
                var0.method2327();
            }
        }
    }

    @ObfuscatedName("n.bu(IIIIIIII)V")
    public static final void method18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field291 && Statics.field1834 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field144.method1737(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field144.method1888(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field144.method1847(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field144.method1753(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field144.method1846(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field144.method1729(arg0, arg2, arg3);
                class198 var15 = Statics.method935(var12);
                if (var15.field2916 != 0) {
                    field350[arg0].method2202(arg2, arg3, var13, var14, var15.field2937);
                }
            }
            if (arg1 == 1) {
                Statics.field144.method1719(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field144.method1834(arg0, arg2, arg3);
                class198 var16 = Statics.method935(var12);
                if (var16.field2914 + arg2 > 103 || var16.field2914 + arg3 > 103 || var16.field2933 + arg2 > 103 || var16.field2933 + arg3 > 103) {
                    return;
                }
                if (var16.field2916 != 0) {
                    field350[arg0].method2208(arg2, arg3, var16.field2914, var16.field2933, var14, var16.field2937);
                }
            }
            if (arg1 == 3) {
                Statics.field144.method1878(arg0, arg2, arg3);
                class198 var17 = Statics.method935(var12);
                if (var17.field2916 == 1) {
                    field350[arg0].method2229(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class11.field81[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class11.method1896(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field144, field350[arg0]);
    }

    @ObfuscatedName("dp.bb(III)V")
    public static final void method2046(int arg0, int arg1) {
        class129 var2 = field420[Statics.field1834][arg0][arg1];
        if (var2 == null) {
            Statics.field144.method1732(Statics.field1834, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class44 var5 = null;
        for (class44 var6 = (class44) var2.method2352(); var6 != null; var6 = (class44) var2.method2341()) {
            class199 var7 = class199.method973(var6.field899);
            long var8 = (long) var7.field2972;
            if (var7.field2971 == 1) {
                var8 = (long) (var6.field892 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field144.method1732(Statics.field1834, arg0, arg1);
            return;
        }
        var2.method2349(var5);
        class44 var10 = null;
        class44 var11 = null;
        for (class44 var12 = (class44) var2.method2352(); var12 != null; var12 = (class44) var2.method2341()) {
            if (var5.field899 != var12.field899) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field899 != var12.field899 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field144.method1730(Statics.field1834, arg0, arg1, method616(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1834), var5, var13, var10, var11);
    }

    @ObfuscatedName("aa.bz(ZI)V")
    public static final void method770(boolean arg0) {
        field558 = 0;
        field514 = 0;
        method214();
        method2984(arg0);
        for (int var1 = 0; var1 < field514; var1++) {
            int var2 = field332[var1];
            class36 var3 = field328[var2];
            int var4 = field335.method2878();
            if ((var4 & 0x1) != 0) {
                int var5 = field335.method2739();
                int var6 = field335.method2739();
                int var7 = var3.field636 - (var5 - Statics.field267 - Statics.field267) * 64;
                int var8 = var3.field605 - (var6 - Statics.field3221 - Statics.field3221) * 64;
                if (var7 != 0 || var8 != 0) {
                    var3.field632 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field653 = field335.method2738();
                int var9 = field335.method2746();
                var3.field617 = var9 >> 16;
                var3.field644 = (var9 & 0xFFFF) + field432;
                var3.field649 = 0;
                var3.field643 = 0;
                if (var3.field644 > field432) {
                    var3.field649 = -1;
                }
                if (var3.field653 == 65535) {
                    var3.field653 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field620 = field335.method2737();
                if (var3.field620 == 65535) {
                    var3.field620 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                int var10 = field335.method2807();
                if (var10 > 0) {
                    for (int var11 = 0; var11 < var10; var11++) {
                        int var12 = -1;
                        int var13 = -1;
                        int var14 = -1;
                        int var15 = field335.method2854();
                        if (var15 == 32767) {
                            var15 = field335.method2854();
                            var13 = field335.method2854();
                            var12 = field335.method2854();
                            var14 = field335.method2854();
                        } else if (var15 == 32766) {
                            var15 = -1;
                        } else {
                            var13 = field335.method2854();
                        }
                        int var16 = field335.method2854();
                        var3.method623(var15, var13, var12, var14, field432, var16);
                    }
                }
                int var17 = field335.method2728();
                if (var17 > 0) {
                    for (int var18 = 0; var18 < var17; var18++) {
                        int var19 = field335.method2854();
                        int var20 = field335.method2854();
                        if (var20 == 32767) {
                            var3.method625(var19);
                        } else {
                            int var21 = field335.method2854();
                            int var22 = field335.method2728();
                            int var23 = var20 > 0 ? field335.method2878() : var22;
                            var3.method622(var19, field432, var20, var21, var22, var23);
                        }
                    }
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field765 = class200.method2965(field335.method2737());
                var3.field608 = var3.field765.field3041;
                var3.field657 = var3.field765.field3036;
                var3.field633 = var3.field765.field3012;
                var3.field613 = var3.field765.field3020;
                var3.field604 = var3.field765.field3030;
                var3.field615 = var3.field765.field3022;
                var3.field609 = var3.field765.field3016;
                var3.field611 = var3.field765.field3017;
                var3.field622 = var3.field765.field3018;
            }
            if ((var4 & 0x4) != 0) {
                int var24 = field335.method2738();
                if (var24 == 65535) {
                    var24 = -1;
                }
                int var25 = field335.method2729();
                if (var3.field641 == var24 && var24 != -1) {
                    int var26 = Statics.method1464(var24).field3076;
                    if (var26 == 1) {
                        var3.field637 = 0;
                        var3.field630 = 0;
                        var3.field639 = var25;
                        var3.field640 = 0;
                    }
                    if (var26 == 2) {
                        var3.field640 = 0;
                    }
                } else if (var24 == -1 || var3.field641 == -1 || Statics.method1464(var24).field3070 >= Statics.method1464(var3.field641).field3070) {
                    var3.field641 = var24;
                    var3.field637 = 0;
                    var3.field630 = 0;
                    var3.field639 = var25;
                    var3.field640 = 0;
                    var3.field663 = var3.field658;
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field652 = field335.method2709();
                var3.field638 = 100;
            }
        }
        for (int var27 = 0; var27 < field558; var27++) {
            int var28 = field319[var27];
            if (field432 != field328[var28].field623) {
                field328[var28].field765 = null;
                field328[var28] = null;
            }
        }
        if (field336 != field335.field2087) {
            throw new RuntimeException(field335.field2087 + class38.field779 + field336);
        }
        for (int var29 = 0; var29 < field329; var29++) {
            if (field328[field286[var29]] == null) {
                throw new RuntimeException(var29 + class38.field779 + field329);
            }
        }
    }

    @ObfuscatedName("u.bm(I)V")
    public static final void method214() {
        field335.method2969();
        int var0 = field335.method2951(8);
        if (var0 < field329) {
            for (int var1 = var0; var1 < field329; var1++) {
                field319[++field558 - 1] = field286[var1];
            }
        }
        if (var0 > field329) {
            throw new RuntimeException("");
        }
        field329 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field286[var2];
            class36 var4 = field328[var3];
            int var5 = field335.method2951(1);
            if (var5 == 0) {
                field286[++field329 - 1] = var3;
                var4.field623 = field432;
            } else {
                int var6 = field335.method2951(2);
                if (var6 == 0) {
                    field286[++field329 - 1] = var3;
                    var4.field623 = field432;
                    field332[++field514 - 1] = var3;
                } else if (var6 == 1) {
                    field286[++field329 - 1] = var3;
                    var4.field623 = field432;
                    int var7 = field335.method2951(3);
                    var4.method786(var7, (byte) 1);
                    int var8 = field335.method2951(1);
                    if (var8 == 1) {
                        field332[++field514 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field286[++field329 - 1] = var3;
                    var4.field623 = field432;
                    int var9 = field335.method2951(3);
                    var4.method786(var9, (byte) 2);
                    int var10 = field335.method2951(3);
                    var4.method786(var10, (byte) 2);
                    int var11 = field335.method2951(1);
                    if (var11 == 1) {
                        field332[++field514 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field319[++field558 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("fk.ba(ZI)V")
    public static final void method2984(boolean arg0) {
        while (true) {
            if (field335.method2953(field336) >= 27) {
                int var1 = field335.method2951(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field328[var1] == null) {
                        field328[var1] = new class36();
                        var2 = true;
                    }
                    class36 var3 = field328[var1];
                    field286[++field329 - 1] = var1;
                    var3.field623 = field432;
                    int var4 = field335.method2951(1);
                    if (var4 == 1) {
                        field332[++field514 - 1] = var1;
                    }
                    int var5;
                    if (arg0) {
                        var5 = field335.method2951(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = field335.method2951(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6;
                    if (arg0) {
                        var6 = field335.method2951(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = field335.method2951(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    var3.field765 = class200.method2965(field335.method2951(14));
                    int var7 = field335.method2951(1);
                    int var8 = field418[field335.method2951(3)];
                    if (var2) {
                        var3.field655 = var3.field606 = var8;
                    }
                    var3.field608 = var3.field765.field3041;
                    var3.field657 = var3.field765.field3036;
                    if (var3.field657 == 0) {
                        var3.field606 = 0;
                    }
                    var3.field633 = var3.field765.field3012;
                    var3.field613 = var3.field765.field3020;
                    var3.field604 = var3.field765.field3030;
                    var3.field615 = var3.field765.field3022;
                    var3.field609 = var3.field765.field3016;
                    var3.field611 = var3.field765.field3017;
                    var3.field622 = var3.field765.field3018;
                    var3.method787(Statics.field186.field659[0] + var5, Statics.field186.field660[0] + var6, var7 == 1);
                    continue;
                }
            }
            field335.method2952();
            return;
        }
    }

    @ObfuscatedName("cw.bk(Ld;IIBI)V")
    public static final void method1547(class24 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field659[0];
        int var5 = arg0.field660[0];
        int var6 = arg0.method233();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method233();
        class120 var8 = method765(arg1, arg2);
        class118 var9 = field350[arg0.field262];
        int[] var10 = field571;
        int[] var11 = field451;
        for (int var12 = 0; var12 < 128; var12++) {
            for (int var13 = 0; var13 < 128; var13++) {
                class119.field1852[var12][var13] = 0;
                class119.field1845[var12][var13] = 99999999;
            }
        }
        boolean var29;
        if (var7 == 1) {
            int var14 = var4;
            int var15 = var5;
            byte var16 = 64;
            byte var17 = 64;
            int var18 = var4 - var16;
            int var19 = var5 - var17;
            class119.field1852[var16][var17] = 99;
            class119.field1845[var16][var17] = 0;
            byte var20 = 0;
            int var21 = 0;
            class119.field1844[var20] = var4;
            int var78 = var20 + 1;
            class119.field1846[var20] = var5;
            int[][] var22 = var9.field1837;
            boolean var27;
            while (true) {
                if (var78 == var21) {
                    Statics.field1843 = var14;
                    Statics.field1847 = var15;
                    var27 = false;
                    break;
                }
                var14 = class119.field1844[var21];
                var15 = class119.field1846[var21];
                var21 = var21 + 1 & 0xFFF;
                int var23 = var14 - var18;
                int var24 = var15 - var19;
                int var25 = var14 - var9.field1831;
                int var26 = var15 - var9.field1832;
                if (var8.method223(1, var14, var15, var9)) {
                    Statics.field1843 = var14;
                    Statics.field1847 = var15;
                    var27 = true;
                    break;
                }
                int var28 = class119.field1845[var23][var24] + 1;
                if (var23 > 0 && class119.field1852[var23 - 1][var24] == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0) {
                    class119.field1844[var78] = var14 - 1;
                    class119.field1846[var78] = var15;
                    var78 = var78 + 1 & 0xFFF;
                    class119.field1852[var23 - 1][var24] = 2;
                    class119.field1845[var23 - 1][var24] = var28;
                }
                if (var23 < 127 && class119.field1852[var23 + 1][var24] == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0) {
                    class119.field1844[var78] = var14 + 1;
                    class119.field1846[var78] = var15;
                    var78 = var78 + 1 & 0xFFF;
                    class119.field1852[var23 + 1][var24] = 8;
                    class119.field1845[var23 + 1][var24] = var28;
                }
                if (var24 > 0 && class119.field1852[var23][var24 - 1] == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class119.field1844[var78] = var14;
                    class119.field1846[var78] = var15 - 1;
                    var78 = var78 + 1 & 0xFFF;
                    class119.field1852[var23][var24 - 1] = 1;
                    class119.field1845[var23][var24 - 1] = var28;
                }
                if (var24 < 127 && class119.field1852[var23][var24 + 1] == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class119.field1844[var78] = var14;
                    class119.field1846[var78] = var15 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class119.field1852[var23][var24 + 1] = 4;
                    class119.field1845[var23][var24 + 1] = var28;
                }
                if (var23 > 0 && var24 > 0 && class119.field1852[var23 - 1][var24 - 1] == 0 && (var22[var25 - 1][var26 - 1] & 0x124010E) == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class119.field1844[var78] = var14 - 1;
                    class119.field1846[var78] = var15 - 1;
                    var78 = var78 + 1 & 0xFFF;
                    class119.field1852[var23 - 1][var24 - 1] = 3;
                    class119.field1845[var23 - 1][var24 - 1] = var28;
                }
                if (var23 < 127 && var24 > 0 && class119.field1852[var23 + 1][var24 - 1] == 0 && (var22[var25 + 1][var26 - 1] & 0x1240183) == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class119.field1844[var78] = var14 + 1;
                    class119.field1846[var78] = var15 - 1;
                    var78 = var78 + 1 & 0xFFF;
                    class119.field1852[var23 + 1][var24 - 1] = 9;
                    class119.field1845[var23 + 1][var24 - 1] = var28;
                }
                if (var23 > 0 && var24 < 127 && class119.field1852[var23 - 1][var24 + 1] == 0 && (var22[var25 - 1][var26 + 1] & 0x1240138) == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class119.field1844[var78] = var14 - 1;
                    class119.field1846[var78] = var15 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class119.field1852[var23 - 1][var24 + 1] = 6;
                    class119.field1845[var23 - 1][var24 + 1] = var28;
                }
                if (var23 < 127 && var24 < 127 && class119.field1852[var23 + 1][var24 + 1] == 0 && (var22[var25 + 1][var26 + 1] & 0x12401E0) == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class119.field1844[var78] = var14 + 1;
                    class119.field1846[var78] = var15 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class119.field1852[var23 + 1][var24 + 1] = 12;
                    class119.field1845[var23 + 1][var24 + 1] = var28;
                }
            }
            var29 = var27;
        } else if (var7 == 2) {
            var29 = class119.method198(var4, var5, var8, var9);
        } else {
            int var30 = var4;
            int var31 = var5;
            byte var32 = 64;
            byte var33 = 64;
            int var34 = var4 - var32;
            int var35 = var5 - var33;
            class119.field1852[var32][var33] = 99;
            class119.field1845[var32][var33] = 0;
            byte var36 = 0;
            int var37 = 0;
            class119.field1844[var36] = var4;
            int var79 = var36 + 1;
            class119.field1846[var36] = var5;
            int[][] var38 = var9.field1837;
            boolean var43;
            label514: while (true) {
                label512: while (true) {
                    int var39;
                    int var40;
                    int var41;
                    int var42;
                    int var44;
                    do {
                        do {
                            do {
                                label489: do {
                                    if (var79 == var37) {
                                        Statics.field1843 = var30;
                                        Statics.field1847 = var31;
                                        var43 = false;
                                        break label514;
                                    }
                                    var30 = class119.field1844[var37];
                                    var31 = class119.field1846[var37];
                                    var37 = var37 + 1 & 0xFFF;
                                    var39 = var30 - var34;
                                    var40 = var31 - var35;
                                    var41 = var30 - var9.field1831;
                                    var42 = var31 - var9.field1832;
                                    if (var8.method223(var7, var30, var31, var9)) {
                                        Statics.field1843 = var30;
                                        Statics.field1847 = var31;
                                        var43 = true;
                                        break label514;
                                    }
                                    var44 = class119.field1845[var39][var40] + 1;
                                    if (var39 > 0 && class119.field1852[var39 - 1][var40] == 0 && (var38[var41 - 1][var42] & 0x124010E) == 0 && (var38[var41 - 1][var7 + var42 - 1] & 0x1240138) == 0) {
                                        int var45 = 1;
                                        while (true) {
                                            if (var45 >= var7 - 1) {
                                                class119.field1844[var79] = var30 - 1;
                                                class119.field1846[var79] = var31;
                                                var79 = var79 + 1 & 0xFFF;
                                                class119.field1852[var39 - 1][var40] = 2;
                                                class119.field1845[var39 - 1][var40] = var44;
                                                break;
                                            }
                                            if ((var38[var41 - 1][var42 + var45] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var45++;
                                        }
                                    }
                                    if (var39 < 128 - var7 && class119.field1852[var39 + 1][var40] == 0 && (var38[var7 + var41][var42] & 0x1240183) == 0 && (var38[var7 + var41][var7 + var42 - 1] & 0x12401E0) == 0) {
                                        int var46 = 1;
                                        while (true) {
                                            if (var46 >= var7 - 1) {
                                                class119.field1844[var79] = var30 + 1;
                                                class119.field1846[var79] = var31;
                                                var79 = var79 + 1 & 0xFFF;
                                                class119.field1852[var39 + 1][var40] = 8;
                                                class119.field1845[var39 + 1][var40] = var44;
                                                break;
                                            }
                                            if ((var38[var7 + var41][var42 + var46] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var46++;
                                        }
                                    }
                                    if (var40 > 0 && class119.field1852[var39][var40 - 1] == 0 && (var38[var41][var42 - 1] & 0x124010E) == 0 && (var38[var7 + var41 - 1][var42 - 1] & 0x1240183) == 0) {
                                        int var47 = 1;
                                        while (true) {
                                            if (var47 >= var7 - 1) {
                                                class119.field1844[var79] = var30;
                                                class119.field1846[var79] = var31 - 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class119.field1852[var39][var40 - 1] = 1;
                                                class119.field1845[var39][var40 - 1] = var44;
                                                break;
                                            }
                                            if ((var38[var41 + var47][var42 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var47++;
                                        }
                                    }
                                    if (var40 < 128 - var7 && class119.field1852[var39][var40 + 1] == 0 && (var38[var41][var7 + var42] & 0x1240138) == 0 && (var38[var7 + var41 - 1][var7 + var42] & 0x12401E0) == 0) {
                                        int var48 = 1;
                                        while (true) {
                                            if (var48 >= var7 - 1) {
                                                class119.field1844[var79] = var30;
                                                class119.field1846[var79] = var31 + 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class119.field1852[var39][var40 + 1] = 4;
                                                class119.field1845[var39][var40 + 1] = var44;
                                                break;
                                            }
                                            if ((var38[var41 + var48][var7 + var42] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var48++;
                                        }
                                    }
                                    if (var39 > 0 && var40 > 0 && class119.field1852[var39 - 1][var40 - 1] == 0 && (var38[var41 - 1][var42 - 1] & 0x124010E) == 0) {
                                        int var49 = 1;
                                        while (true) {
                                            if (var49 >= var7) {
                                                class119.field1844[var79] = var30 - 1;
                                                class119.field1846[var79] = var31 - 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class119.field1852[var39 - 1][var40 - 1] = 3;
                                                class119.field1845[var39 - 1][var40 - 1] = var44;
                                                break;
                                            }
                                            if ((var38[var41 - 1][var42 - 1 + var49] & 0x124013E) != 0 || (var38[var41 - 1 + var49][var42 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var49++;
                                        }
                                    }
                                    if (var39 < 128 - var7 && var40 > 0 && class119.field1852[var39 + 1][var40 - 1] == 0 && (var38[var7 + var41][var42 - 1] & 0x1240183) == 0) {
                                        int var50 = 1;
                                        while (true) {
                                            if (var50 >= var7) {
                                                class119.field1844[var79] = var30 + 1;
                                                class119.field1846[var79] = var31 - 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class119.field1852[var39 + 1][var40 - 1] = 9;
                                                class119.field1845[var39 + 1][var40 - 1] = var44;
                                                break;
                                            }
                                            if ((var38[var7 + var41][var42 - 1 + var50] & 0x12401E3) != 0 || (var38[var41 + var50][var42 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var50++;
                                        }
                                    }
                                    if (var39 > 0 && var40 < 128 - var7 && class119.field1852[var39 - 1][var40 + 1] == 0 && (var38[var41 - 1][var7 + var42] & 0x1240138) == 0) {
                                        for (int var51 = 1; var51 < var7; var51++) {
                                            if ((var38[var41 - 1][var42 + var51] & 0x124013E) != 0 || (var38[var41 - 1 + var51][var7 + var42] & 0x12401F8) != 0) {
                                                continue label489;
                                            }
                                        }
                                        class119.field1844[var79] = var30 - 1;
                                        class119.field1846[var79] = var31 + 1;
                                        var79 = var79 + 1 & 0xFFF;
                                        class119.field1852[var39 - 1][var40 + 1] = 6;
                                        class119.field1845[var39 - 1][var40 + 1] = var44;
                                    }
                                } while (var39 >= 128 - var7);
                            } while (var40 >= 128 - var7);
                        } while (class119.field1852[var39 + 1][var40 + 1] != 0);
                    } while ((var38[var7 + var41][var7 + var42] & 0x12401E0) != 0);
                    for (int var52 = 1; var52 < var7; var52++) {
                        if ((var38[var41 + var52][var7 + var42] & 0x12401F8) != 0 || (var38[var7 + var41][var42 + var52] & 0x12401E3) != 0) {
                            continue label512;
                        }
                    }
                    class119.field1844[var79] = var30 + 1;
                    class119.field1846[var79] = var31 + 1;
                    var79 = var79 + 1 & 0xFFF;
                    class119.field1852[var39 + 1][var40 + 1] = 12;
                    class119.field1845[var39 + 1][var40 + 1] = var44;
                }
            }
            var29 = var43;
        }
        int var71;
        label570: {
            int var53 = var4 - 64;
            int var54 = var5 - 64;
            int var55 = Statics.field1843;
            int var56 = Statics.field1847;
            if (!var29) {
                int var57 = Integer.MAX_VALUE;
                int var58 = Integer.MAX_VALUE;
                byte var59 = 10;
                int var60 = var8.field1859;
                int var61 = var8.field1858;
                int var62 = var8.field1862;
                int var63 = var8.field1857;
                for (int var64 = var60 - var59; var64 <= var59 + var60; var64++) {
                    for (int var65 = var61 - var59; var65 <= var59 + var61; var65++) {
                        int var66 = var64 - var53;
                        int var67 = var65 - var54;
                        if (var66 >= 0 && var67 >= 0 && var66 < 128 && var67 < 128 && class119.field1845[var66][var67] < 100) {
                            int var68 = 0;
                            if (var64 < var60) {
                                var68 = var60 - var64;
                            } else if (var64 > var60 + var62 - 1) {
                                var68 = var64 - (var60 + var62 - 1);
                            }
                            int var69 = 0;
                            if (var65 < var61) {
                                var69 = var61 - var65;
                            } else if (var65 > var61 + var63 - 1) {
                                var69 = var65 - (var61 + var63 - 1);
                            }
                            int var70 = var68 * var68 + var69 * var69;
                            if (var70 < var57 || var57 == var70 && class119.field1845[var66][var67] < var58) {
                                var57 = var70;
                                var58 = class119.field1845[var66][var67];
                                var55 = var64;
                                var56 = var65;
                            }
                        }
                    }
                }
                if (var57 == Integer.MAX_VALUE) {
                    var71 = -1;
                    break label570;
                }
            }
            if (var4 == var55 && var5 == var56) {
                var71 = 0;
            } else {
                byte var72 = 0;
                class119.field1844[var72] = var55;
                int var80 = var72 + 1;
                class119.field1846[var72] = var56;
                int var73;
                int var74 = var73 = class119.field1852[var55 - var53][var56 - var54];
                while (var4 != var55 || var5 != var56) {
                    if (var73 != var74) {
                        var73 = var74;
                        class119.field1844[var80] = var55;
                        class119.field1846[var80++] = var56;
                    }
                    if ((var74 & 0x2) != 0) {
                        var55++;
                    } else if ((var74 & 0x8) != 0) {
                        var55--;
                    }
                    if ((var74 & 0x1) != 0) {
                        var56++;
                    } else if ((var74 & 0x4) != 0) {
                        var56--;
                    }
                    var74 = class119.field1852[var55 - var53][var56 - var54];
                }
                int var75 = 0;
                while (var80-- > 0) {
                    var10[var75] = class119.field1844[var80];
                    var11[var75++] = class119.field1846[var80];
                    if (var75 >= var10.length) {
                        break;
                    }
                }
                var71 = var75;
            }
        }
        int var76 = var71;
        if (var71 >= 1) {
            for (int var77 = 0; var77 < var76 - 1; var77++) {
                arg0.method246(field571[var77], field451[var77], arg3);
            }
        }
    }

    @ObfuscatedName("aq.bs(IIB)Ldv;")
    public static class120 method765(int arg0, int arg1) {
        field570.field1859 = arg0;
        field570.field1858 = arg1;
        field570.field1862 = 1;
        field570.field1857 = 1;
        return field570;
    }

    @ObfuscatedName("dt.bg(I)V")
    public static void method2018() {
        field515 = 0;
        field437 = -1;
        field428 = false;
    }

    @ObfuscatedName("gd.bw(III)V")
    public static final void method3422(int arg0, int arg1) {
        if (field515 < 2 && field417 == 0 && !field445) {
            return;
        }
        int var2 = method24();
        String var3;
        if (field417 == 1 && field515 < 2) {
            var3 = class174.field2506 + class174.field2516 + field444 + " " + class38.field782;
        } else if (field445 && field515 < 2) {
            var3 = field354 + class174.field2516 + field449 + " " + class38.field782;
        } else {
            String var4;
            if (var2 < 0) {
                var4 = "";
            } else if (field410[var2].length() > 0) {
                var4 = field434[var2] + class174.field2516 + field410[var2];
            } else {
                var4 = field434[var2];
            }
            var3 = var4;
        }
        if (field515 > 2) {
            var3 = var3 + class38.method800(16777215) + " " + '/' + " " + (field515 - 2) + class174.field2510;
        }
        Statics.field3189.method3708(var3, arg0 + 4, arg1 + 15, 16777215, 0, field432 / 1000);
    }

    @ObfuscatedName("cb.bt(B)V")
    public static final void method1894() {
        int var0 = Statics.field2147;
        int var1 = Statics.field2131;
        int var2 = Statics.field838;
        int var3 = Statics.field110;
        int var4 = 6116423;
        class220.method3842(var0, var1, var2, var3, var4);
        class220.method3842(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class220.method3798(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field3189.method3759(class174.field2613, var0 + 3, var1 + 14, var4, -1);
        int var5 = class116.field1806;
        int var6 = class116.field1807;
        for (int var7 = 0; var7 < field515; var7++) {
            int var8 = (field515 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class209 var10 = Statics.field3189;
            String var11;
            if (var7 < 0) {
                var11 = "";
            } else if (field410[var7].length() > 0) {
                var11 = field434[var7] + class174.field2516 + field410[var7];
            } else {
                var11 = field434[var7];
            }
            var10.method3759(var11, var0 + 3, var8, var9, 0);
        }
        method188(Statics.field2147, Statics.field2131, Statics.field838, Statics.field110);
    }

    @ObfuscatedName("av.bo(IIIIB)V")
    public static final void method862(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field469; var4++) {
            if (field493[var4] + field457[var4] > arg0 && field457[var4] < arg0 + arg2 && field513[var4] + field309[var4] > arg1 && field513[var4] < arg1 + arg3) {
                field495[var4] = true;
            }
        }
    }

    @ObfuscatedName("o.bp(IIIIB)V")
    public static final void method188(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field469; var4++) {
            if (field493[var4] + field457[var4] > arg0 && field457[var4] < arg0 + arg2 && field513[var4] + field309[var4] > arg1 && field513[var4] < arg1 + arg3) {
                field496[var4] = true;
            }
        }
    }

    @ObfuscatedName("i.bh(IIS)V")
    public static final void method114(int arg0, int arg1) {
        int var2 = Statics.field3189.method3695(class174.field2613);
        for (int var3 = 0; var3 < field515; var3++) {
            class209 var4 = Statics.field3189;
            String var5;
            if (var3 < 0) {
                var5 = "";
            } else if (field410[var3].length() > 0) {
                var5 = field434[var3] + class174.field2516 + field410[var3];
            } else {
                var5 = field434[var3];
            }
            int var6 = var4.method3695(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field515 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field1757) {
            var8 = Statics.field1757 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field1129) {
            var9 = Statics.field1129 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        Statics.field144.method1748(Statics.field1834, arg0, arg1, false);
        field428 = true;
        Statics.field2147 = var8;
        Statics.field2131 = var9;
        Statics.field838 = var2;
        Statics.field110 = field515 * 15 + 22;
    }

    @ObfuscatedName("m.bq(II)Z")
    public static final boolean method102(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field498[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("v.bc(Lan;III)V")
    public static final void method39(class39 arg0, int arg1, int arg2) {
        method802(arg0.field796, arg0.field792, arg0.field793, arg0.field799, arg0.field795, arg0.field795, arg1, arg2);
    }

    @ObfuscatedName("ax.bd(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method802(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class170 var8 = class170.method769(arg1, arg0);
            if (var8 != null) {
                int var9 = var8.field2219;
                class170 var10 = class170.method769(arg1, arg0);
                if (var10 != null) {
                    if (var10.field2307 != null) {
                        class19 var11 = new class19();
                        var11.field189 = var10;
                        var11.field192 = arg3;
                        var11.field196 = arg5;
                        var11.field197 = var10.field2307;
                        class33.method815(var11);
                    }
                    boolean var12 = true;
                    if (var10.field2211 > 0) {
                        var12 = method1912(var10);
                    }
                    if (var12) {
                        int var13 = method221(var10);
                        int var14 = arg3 - 1;
                        boolean var15 = (var13 >> var14 + 1 & 0x1) != 0;
                        if (var15) {
                            if (arg3 == 1) {
                                field333.method2948(215);
                                field333.method2689(arg1);
                                field333.method2687(arg0);
                                field333.method2687(var9);
                            }
                            if (arg3 == 2) {
                                field333.method2948(191);
                                field333.method2689(arg1);
                                field333.method2687(arg0);
                                field333.method2687(var9);
                            }
                            if (arg3 == 3) {
                                field333.method2948(245);
                                field333.method2689(arg1);
                                field333.method2687(arg0);
                                field333.method2687(var9);
                            }
                            if (arg3 == 4) {
                                field333.method2948(184);
                                field333.method2689(arg1);
                                field333.method2687(arg0);
                                field333.method2687(var9);
                            }
                            if (arg3 == 5) {
                                field333.method2948(162);
                                field333.method2689(arg1);
                                field333.method2687(arg0);
                                field333.method2687(var9);
                            }
                            if (arg3 == 6) {
                                field333.method2948(236);
                                field333.method2689(arg1);
                                field333.method2687(arg0);
                                field333.method2687(var9);
                            }
                            if (arg3 == 7) {
                                field333.method2948(153);
                                field333.method2689(arg1);
                                field333.method2687(arg0);
                                field333.method2687(var9);
                            }
                            if (arg3 == 8) {
                                field333.method2948(160);
                                field333.method2689(arg1);
                                field333.method2687(arg0);
                                field333.method2687(var9);
                            }
                            if (arg3 == 9) {
                                field333.method2948(75);
                                field333.method2689(arg1);
                                field333.method2687(arg0);
                                field333.method2687(var9);
                            }
                            if (arg3 == 10) {
                                field333.method2948(231);
                                field333.method2689(arg1);
                                field333.method2687(arg0);
                                field333.method2687(var9);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 51) {
            class24 var16 = field365[arg3];
            if (var16 != null) {
                field490 = arg6;
                field491 = arg7;
                field400 = 2;
                field427 = 0;
                field381 = arg0;
                field526 = arg1;
                field333.method2948(19);
                field333.method2688(class106.field1719[82] ? 1 : 0);
                field333.method2755(arg3);
            }
        }
        if (arg2 == 10) {
            class36 var17 = field328[arg3];
            if (var17 != null) {
                field490 = arg6;
                field491 = arg7;
                field400 = 2;
                field427 = 0;
                field381 = arg0;
                field526 = arg1;
                field333.method2948(128);
                field333.method2725(arg3);
                field333.method2726(class106.field1719[82] ? 1 : 0);
            }
        }
        if (arg2 == 50) {
            class24 var18 = field365[arg3];
            if (var18 != null) {
                field490 = arg6;
                field491 = arg7;
                field400 = 2;
                field427 = 0;
                field381 = arg0;
                field526 = arg1;
                field333.method2948(108);
                field333.method2726(class106.field1719[82] ? 1 : 0);
                field333.method2687(arg3);
            }
        }
        if (arg2 == 1002) {
            field490 = arg6;
            field491 = arg7;
            field400 = 2;
            field427 = 0;
            field333.method2948(9);
            field333.method2755(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 48) {
            class24 var19 = field365[arg3];
            if (var19 != null) {
                field490 = arg6;
                field491 = arg7;
                field400 = 2;
                field427 = 0;
                field381 = arg0;
                field526 = arg1;
                field333.method2948(71);
                field333.method2726(class106.field1719[82] ? 1 : 0);
                field333.method2736(arg3);
            }
        }
        if (arg2 == 2) {
            field490 = arg6;
            field491 = arg7;
            field400 = 2;
            field427 = 0;
            field381 = arg0;
            field526 = arg1;
            field333.method2948(110);
            field333.method2687(Statics.field3221 + arg1);
            field333.method2687(Statics.field267 + arg0);
            field333.method2726(class106.field1719[82] ? 1 : 0);
            field333.method2725(field530);
            field333.method2687(arg3 >> 14 & 0x7FFF);
            field333.method2714(Statics.field270);
        }
        if (arg2 == 1) {
            field490 = arg6;
            field491 = arg7;
            field400 = 2;
            field427 = 0;
            field381 = arg0;
            field526 = arg1;
            field333.method2948(172);
            field333.method2689(Statics.field751);
            field333.method2736(Statics.field3221 + arg1);
            field333.method2755(Statics.field169);
            field333.method2755(arg3 >> 14 & 0x7FFF);
            field333.method2688(class106.field1719[82] ? 1 : 0);
            field333.method2755(Statics.field267 + arg0);
            field333.method2687(Statics.field42);
        }
        if (arg2 == 43) {
            field333.method2948(28);
            field333.method2755(arg0);
            field333.method2745(arg1);
            field333.method2736(arg3);
            field401 = 0;
            Statics.field2774 = class170.method971(arg1);
            field402 = arg0;
        }
        if (arg2 == 42) {
            field333.method2948(90);
            field333.method2745(arg1);
            field333.method2687(arg0);
            field333.method2755(arg3);
            field401 = 0;
            Statics.field2774 = class170.method971(arg1);
            field402 = arg0;
        }
        if (arg2 == 45) {
            class24 var20 = field365[arg3];
            if (var20 != null) {
                field490 = arg6;
                field491 = arg7;
                field400 = 2;
                field427 = 0;
                field381 = arg0;
                field526 = arg1;
                field333.method2948(203);
                field333.method2687(arg3);
                field333.method2726(class106.field1719[82] ? 1 : 0);
            }
        }
        if (arg2 == 11) {
            class36 var21 = field328[arg3];
            if (var21 != null) {
                field490 = arg6;
                field491 = arg7;
                field400 = 2;
                field427 = 0;
                field381 = arg0;
                field526 = arg1;
                field333.method2948(57);
                field333.method2755(arg3);
                field333.method2906(class106.field1719[82] ? 1 : 0);
            }
        }
        if (arg2 == 13) {
            class36 var22 = field328[arg3];
            if (var22 != null) {
                field490 = arg6;
                field491 = arg7;
                field400 = 2;
                field427 = 0;
                field381 = arg0;
                field526 = arg1;
                field333.method2948(219);
                field333.method2906(class106.field1719[82] ? 1 : 0);
                field333.method2736(arg3);
            }
        }
        if (arg2 == 20) {
            field490 = arg6;
            field491 = arg7;
            field400 = 2;
            field427 = 0;
            field381 = arg0;
            field526 = arg1;
            field333.method2948(246);
            field333.method2687(Statics.field3221 + arg1);
            field333.method2736(arg3);
            field333.method2726(class106.field1719[82] ? 1 : 0);
            field333.method2725(Statics.field267 + arg0);
        }
        if (arg2 == 44) {
            class24 var23 = field365[arg3];
            if (var23 != null) {
                field490 = arg6;
                field491 = arg7;
                field400 = 2;
                field427 = 0;
                field381 = arg0;
                field526 = arg1;
                field333.method2948(100);
                field333.method2725(arg3);
                field333.method2688(class106.field1719[82] ? 1 : 0);
            }
        }
        if (arg2 == 15) {
            class24 var24 = field365[arg3];
            if (var24 != null) {
                field490 = arg6;
                field491 = arg7;
                field400 = 2;
                field427 = 0;
                field381 = arg0;
                field526 = arg1;
                field333.method2948(149);
                field333.method2755(field530);
                field333.method2688(class106.field1719[82] ? 1 : 0);
                field333.method2687(arg3);
                field333.method2745(Statics.field270);
            }
        }
        if (arg2 == 46) {
            class24 var25 = field365[arg3];
            if (var25 != null) {
                field490 = arg6;
                field491 = arg7;
                field400 = 2;
                field427 = 0;
                field381 = arg0;
                field526 = arg1;
                field333.method2948(120);
                field333.method2755(arg3);
                field333.method2906(class106.field1719[82] ? 1 : 0);
            }
        }
        if (arg2 == 34) {
            field333.method2948(145);
            field333.method2725(arg3);
            field333.method2687(arg0);
            field333.method2744(arg1);
            field401 = 0;
            Statics.field2774 = class170.method971(arg1);
            field402 = arg0;
        }
        if (arg2 == 30 && field544 == null) {
            method2014(arg1, arg0);
            field544 = class170.method769(arg1, arg0);
            method974(field544);
        }
        if (arg2 == 4) {
            field490 = arg6;
            field491 = arg7;
            field400 = 2;
            field427 = 0;
            field381 = arg0;
            field526 = arg1;
            field333.method2948(82);
            field333.method2726(class106.field1719[82] ? 1 : 0);
            field333.method2736(arg3 >> 14 & 0x7FFF);
            field333.method2725(Statics.field267 + arg0);
            field333.method2687(Statics.field3221 + arg1);
        }
        if (arg2 == 8) {
            class36 var26 = field328[arg3];
            if (var26 != null) {
                field490 = arg6;
                field491 = arg7;
                field400 = 2;
                field427 = 0;
                field381 = arg0;
                field526 = arg1;
                field333.method2948(251);
                field333.method2725(field530);
                field333.method2725(arg3);
                field333.method2745(Statics.field270);
                field333.method2726(class106.field1719[82] ? 1 : 0);
            }
        }
        if (arg2 == 37) {
            field333.method2948(68);
            field333.method2755(arg0);
            field333.method2714(arg1);
            field333.method2725(arg3);
            field401 = 0;
            Statics.field2774 = class170.method971(arg1);
            field402 = arg0;
        }
        if (arg2 == 47) {
            class24 var27 = field365[arg3];
            if (var27 != null) {
                field490 = arg6;
                field491 = arg7;
                field400 = 2;
                field427 = 0;
                field381 = arg0;
                field526 = arg1;
                field333.method2948(202);
                field333.method2736(arg3);
                field333.method2726(class106.field1719[82] ? 1 : 0);
            }
        }
        if (arg2 == 22) {
            field490 = arg6;
            field491 = arg7;
            field400 = 2;
            field427 = 0;
            field381 = arg0;
            field526 = arg1;
            field333.method2948(209);
            field333.method2906(class106.field1719[82] ? 1 : 0);
            field333.method2736(Statics.field267 + arg0);
            field333.method2755(arg3);
            field333.method2736(Statics.field3221 + arg1);
        }
        if (arg2 == 31) {
            field333.method2948(62);
            field333.method2736(arg3);
            field333.method2744(arg1);
            field333.method2725(Statics.field169);
            field333.method2736(arg0);
            field333.method2689(Statics.field751);
            field333.method2755(Statics.field42);
            field401 = 0;
            Statics.field2774 = class170.method971(arg1);
            field402 = arg0;
        }
        if (arg2 == 6) {
            field490 = arg6;
            field491 = arg7;
            field400 = 2;
            field427 = 0;
            field381 = arg0;
            field526 = arg1;
            field333.method2948(116);
            field333.method2725(Statics.field3221 + arg1);
            field333.method2906(class106.field1719[82] ? 1 : 0);
            field333.method2725(arg3 >> 14 & 0x7FFF);
            field333.method2736(Statics.field267 + arg0);
        }
        if (arg2 == 16) {
            field490 = arg6;
            field491 = arg7;
            field400 = 2;
            field427 = 0;
            field381 = arg0;
            field526 = arg1;
            field333.method2948(99);
            field333.method2744(Statics.field751);
            field333.method2736(Statics.field42);
            field333.method2755(Statics.field267 + arg0);
            field333.method2688(class106.field1719[82] ? 1 : 0);
            field333.method2755(Statics.field169);
            field333.method2687(Statics.field3221 + arg1);
            field333.method2736(arg3);
        }
        if (arg2 == 18) {
            field490 = arg6;
            field491 = arg7;
            field400 = 2;
            field427 = 0;
            field381 = arg0;
            field526 = arg1;
            field333.method2948(72);
            field333.method2906(class106.field1719[82] ? 1 : 0);
            field333.method2736(Statics.field3221 + arg1);
            field333.method2725(Statics.field267 + arg0);
            field333.method2755(arg3);
        }
        if (arg2 == 1001) {
            field490 = arg6;
            field491 = arg7;
            field400 = 2;
            field427 = 0;
            field381 = arg0;
            field526 = arg1;
            field333.method2948(4);
            field333.method2736(Statics.field267 + arg0);
            field333.method2688(class106.field1719[82] ? 1 : 0);
            field333.method2687(arg3 >> 14 & 0x7FFF);
            field333.method2725(Statics.field3221 + arg1);
        }
        if (arg2 == 1005) {
            class170 var28 = class170.method971(arg1);
            if (var28 == null || var28.field2326[arg0] < 100000) {
                field333.method2948(233);
                field333.method2755(arg3);
            } else {
                class48.method1892(27, "", var28.field2326[arg0] + " x " + class199.method973(arg3).field2960);
            }
            field401 = 0;
            Statics.field2774 = class170.method971(arg1);
            field402 = arg0;
        }
        if (arg2 == 1004) {
            field490 = arg6;
            field491 = arg7;
            field400 = 2;
            field427 = 0;
            field333.method2948(233);
            field333.method2755(arg3);
        }
        if (arg2 == 7) {
            class36 var29 = field328[arg3];
            if (var29 != null) {
                field490 = arg6;
                field491 = arg7;
                field400 = 2;
                field427 = 0;
                field381 = arg0;
                field526 = arg1;
                field333.method2948(222);
                field333.method2745(Statics.field751);
                field333.method2726(class106.field1719[82] ? 1 : 0);
                field333.method2725(Statics.field42);
                field333.method2687(Statics.field169);
                field333.method2755(arg3);
            }
        }
        if (arg2 == 39) {
            field333.method2948(118);
            field333.method2745(arg1);
            field333.method2687(arg3);
            field333.method2755(arg0);
            field401 = 0;
            Statics.field2774 = class170.method971(arg1);
            field402 = arg0;
        }
        if (arg2 == 41) {
            field333.method2948(101);
            field333.method2755(arg0);
            field333.method2714(arg1);
            field333.method2736(arg3);
            field401 = 0;
            Statics.field2774 = class170.method971(arg1);
            field402 = arg0;
        }
        if (arg2 == 36) {
            field333.method2948(147);
            field333.method2689(arg1);
            field333.method2687(arg3);
            field333.method2725(arg0);
            field401 = 0;
            Statics.field2774 = class170.method971(arg1);
            field402 = arg0;
        }
        if (arg2 == 17) {
            field490 = arg6;
            field491 = arg7;
            field400 = 2;
            field427 = 0;
            field381 = arg0;
            field526 = arg1;
            field333.method2948(134);
            field333.method2745(Statics.field270);
            field333.method2687(Statics.field3221 + arg1);
            field333.method2736(arg3);
            field333.method2725(field530);
            field333.method2736(Statics.field267 + arg0);
            field333.method2898(class106.field1719[82] ? 1 : 0);
        }
        if (arg2 == 32) {
            field333.method2948(150);
            field333.method2689(Statics.field270);
            field333.method2689(arg1);
            field333.method2736(field530);
            field333.method2725(arg3);
            field333.method2687(arg0);
            field401 = 0;
            Statics.field2774 = class170.method971(arg1);
            field402 = arg0;
        }
        if (arg2 == 14) {
            class24 var30 = field365[arg3];
            if (var30 != null) {
                field490 = arg6;
                field491 = arg7;
                field400 = 2;
                field427 = 0;
                field381 = arg0;
                field526 = arg1;
                field333.method2948(142);
                field333.method2725(Statics.field42);
                field333.method2755(arg3);
                field333.method2745(Statics.field751);
                field333.method2687(Statics.field169);
                field333.method2898(class106.field1719[82] ? 1 : 0);
            }
        }
        if (arg2 == 33) {
            field333.method2948(67);
            field333.method2736(arg3);
            field333.method2755(arg0);
            field333.method2689(arg1);
            field401 = 0;
            Statics.field2774 = class170.method971(arg1);
            field402 = arg0;
        }
        if (arg2 == 23) {
            if (field428) {
                Statics.field144.method1734();
            } else {
                Statics.field144.method1748(Statics.field1834, arg0, arg1, true);
            }
        }
        if (arg2 == 1003) {
            field490 = arg6;
            field491 = arg7;
            field400 = 2;
            field427 = 0;
            class36 var31 = field328[arg3];
            if (var31 != null) {
                class200 var32 = var31.field765;
                if (var32.field3019 != null) {
                    var32 = var32.method3570();
                }
                if (var32 != null) {
                    field333.method2948(81);
                    field333.method2725(var32.field3011);
                }
            }
        }
        if (arg2 == 3) {
            field490 = arg6;
            field491 = arg7;
            field400 = 2;
            field427 = 0;
            field381 = arg0;
            field526 = arg1;
            field333.method2948(201);
            field333.method2755(Statics.field3221 + arg1);
            field333.method2736(Statics.field267 + arg0);
            field333.method2687(arg3 >> 14 & 0x7FFF);
            field333.method2898(class106.field1719[82] ? 1 : 0);
        }
        if (arg2 == 24) {
            class170 var33 = class170.method971(arg1);
            boolean var34 = true;
            if (var33.field2211 > 0) {
                var34 = method1912(var33);
            }
            if (var34) {
                field333.method2948(131);
                field333.method2689(arg1);
            }
        }
        if (arg2 == 12) {
            class36 var35 = field328[arg3];
            if (var35 != null) {
                field490 = arg6;
                field491 = arg7;
                field400 = 2;
                field427 = 0;
                field381 = arg0;
                field526 = arg1;
                field333.method2948(55);
                field333.method2725(arg3);
                field333.method2688(class106.field1719[82] ? 1 : 0);
            }
        }
        if (arg2 == 21) {
            field490 = arg6;
            field491 = arg7;
            field400 = 2;
            field427 = 0;
            field381 = arg0;
            field526 = arg1;
            field333.method2948(170);
            field333.method2755(Statics.field3221 + arg1);
            field333.method2725(arg3);
            field333.method2755(Statics.field267 + arg0);
            field333.method2688(class106.field1719[82] ? 1 : 0);
        }
        if (arg2 == 49) {
            class24 var36 = field365[arg3];
            if (var36 != null) {
                field490 = arg6;
                field491 = arg7;
                field400 = 2;
                field427 = 0;
                field381 = arg0;
                field526 = arg1;
                field333.method2948(124);
                field333.method2687(arg3);
                field333.method2898(class106.field1719[82] ? 1 : 0);
            }
        }
        if (arg2 == 38) {
            method1909();
            class170 var37 = class170.method971(arg1);
            field417 = 1;
            Statics.field42 = arg0;
            Statics.field751 = arg1;
            Statics.field169 = arg3;
            method974(var37);
            field444 = class38.method800(16748608) + class199.method973(arg3).field2960 + class38.method800(16777215);
            if (field444 == null) {
                field444 = "null";
            }
            return;
        }
        if (arg2 == 26) {
            field333.method2948(200);
            for (class18 var38 = (class18) field302.method2289(); var38 != null; var38 = (class18) field302.method2290()) {
                if (var38.field177 == 0 || var38.field177 == 3) {
                    method204(var38, true);
                }
            }
            if (field544 != null) {
                method974(field544);
                field544 = null;
            }
        }
        if (arg2 == 25) {
            class170 var39 = class170.method769(arg1, arg0);
            if (var39 != null) {
                method1909();
                int var40 = method221(var39);
                int var41 = var40 >> 11 & 0x3F;
                int var43 = var39.field2219;
                class170 var44 = class170.method769(arg1, arg0);
                if (var44 != null && var44.field2253 != null) {
                    class19 var45 = new class19();
                    var45.field189 = var44;
                    var45.field197 = var44.field2253;
                    class33.method815(var45);
                }
                field447 = var43;
                field445 = true;
                Statics.field270 = arg1;
                field530 = arg0;
                Statics.field760 = var41;
                method974(var44);
                field417 = 0;
                int var46 = method221(var39);
                int var47 = var46 >> 11 & 0x3F;
                String var48;
                if (var47 == 0) {
                    var48 = null;
                } else if (var39.field2252 == null || var39.field2252.trim().length() == 0) {
                    var48 = null;
                } else {
                    var48 = var39.field2252;
                }
                field354 = var48;
                if (field354 == null) {
                    field354 = "Null";
                }
                if (var39.field2231) {
                    field449 = var39.field2280 + class38.method800(16777215);
                } else {
                    field449 = class38.method800(65280) + var39.field2259 + class38.method800(16777215);
                }
            }
            return;
        }
        if (arg2 == 28) {
            field333.method2948(131);
            field333.method2689(arg1);
            class170 var49 = class170.method971(arg1);
            if (var49.field2248 != null && var49.field2248[0][0] == 5) {
                int var50 = var49.field2248[0][1];
                class166.field2166[var50] = 1 - class166.field2166[var50];
                method2425(var50);
            }
        }
        if (arg2 == 35) {
            field333.method2948(32);
            field333.method2736(arg3);
            field333.method2755(arg0);
            field333.method2745(arg1);
            field401 = 0;
            Statics.field2774 = class170.method971(arg1);
            field402 = arg0;
        }
        if (arg2 == 58) {
            class170 var51 = class170.method769(arg1, arg0);
            if (var51 != null) {
                field333.method2948(78);
                field333.method2725(var51.field2219);
                field333.method2714(arg1);
                field333.method2725(field530);
                field333.method2755(arg0);
                field333.method2687(field447);
                field333.method2744(Statics.field270);
            }
        }
        if (arg2 == 5) {
            field490 = arg6;
            field491 = arg7;
            field400 = 2;
            field427 = 0;
            field381 = arg0;
            field526 = arg1;
            field333.method2948(107);
            field333.method2906(class106.field1719[82] ? 1 : 0);
            field333.method2755(arg3 >> 14 & 0x7FFF);
            field333.method2687(Statics.field267 + arg0);
            field333.method2736(Statics.field3221 + arg1);
        }
        if (arg2 == 19) {
            field490 = arg6;
            field491 = arg7;
            field400 = 2;
            field427 = 0;
            field381 = arg0;
            field526 = arg1;
            field333.method2948(112);
            field333.method2688(class106.field1719[82] ? 1 : 0);
            field333.method2736(Statics.field3221 + arg1);
            field333.method2736(arg3);
            field333.method2755(Statics.field267 + arg0);
        }
        if (arg2 == 29) {
            field333.method2948(131);
            field333.method2689(arg1);
            class170 var52 = class170.method971(arg1);
            if (var52.field2248 != null && var52.field2248[0][0] == 5) {
                int var53 = var52.field2248[0][1];
                if (class166.field2166[var53] != var52.field2263[0]) {
                    class166.field2166[var53] = var52.field2263[0];
                    method2425(var53);
                }
            }
        }
        if (arg2 == 9) {
            class36 var54 = field328[arg3];
            if (var54 != null) {
                field490 = arg6;
                field491 = arg7;
                field400 = 2;
                field427 = 0;
                field381 = arg0;
                field526 = arg1;
                field333.method2948(114);
                field333.method2726(class106.field1719[82] ? 1 : 0);
                field333.method2687(arg3);
            }
        }
        if (arg2 == 40) {
            field333.method2948(252);
            field333.method2755(arg3);
            field333.method2725(arg0);
            field333.method2744(arg1);
            field401 = 0;
            Statics.field2774 = class170.method971(arg1);
            field402 = arg0;
        }
        if (field417 != 0) {
            field417 = 0;
            method974(class170.method971(Statics.field751));
        }
        if (field445) {
            method1909();
        }
        if (Statics.field2774 != null && field401 == 0) {
            method974(Statics.field2774);
        }
    }

    @ObfuscatedName("m.cw(ILjava/lang/String;I)V")
    public static void method97(int arg0, String arg1) {
        int var2 = class46.field917;
        int[] var3 = class46.field914;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class24 var6 = field365[var3[var5]];
            if (var6 != null && Statics.field186 != var6 && var6.field244 != null && var6.field244.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field333.method2948(100);
                    field333.method2725(var3[var5]);
                    field333.method2688(0);
                } else if (arg0 == 4) {
                    field333.method2948(202);
                    field333.method2736(var3[var5]);
                    field333.method2726(0);
                } else if (arg0 == 6) {
                    field333.method2948(124);
                    field333.method2687(var3[var5]);
                    field333.method2898(0);
                } else if (arg0 == 7) {
                    field333.method2948(108);
                    field333.method2726(0);
                    field333.method2687(var3[var5]);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class48.method1892(4, "", class174.field2547 + arg1);
        }
    }

    @ObfuscatedName("cs.ci(B)V")
    public static void method1909() {
        if (!field445) {
            return;
        }
        class170 var0 = class170.method769(Statics.field270, field530);
        if (var0 != null && var0.field2299 != null) {
            class19 var1 = new class19();
            var1.field189 = var0;
            var1.field197 = var0.field2299;
            class33.method815(var1);
        }
        field445 = false;
        method974(var0);
    }

    @ObfuscatedName("dj.ck(III)V")
    public static void method2014(int arg0, int arg1) {
        field333.method2948(2);
        field333.method2755(arg1);
        field333.method2745(arg0);
    }

    @ObfuscatedName("j.cj(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method86(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method3311(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("gx.co(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method3311(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field428 || field515 >= 500) {
            return;
        }
        field434[field515] = arg0;
        field410[field515] = arg1;
        field498[field515] = arg2;
        field433[field515] = arg3;
        field430[field515] = arg4;
        field574[field515] = arg5;
        if (arg6) {
            field437 = field515;
        }
        field515++;
    }

    @ObfuscatedName("g.cm(I)I")
    public static final int method24() {
        if (field515 <= 0) {
            return -1;
        } else if (field438 && class106.field1719[81] && field437 != -1) {
            return field437;
        } else {
            return field515 - 1;
        }
    }

    @ObfuscatedName("fz.ca(I)Z")
    public static final boolean method3076() {
        if (field515 <= 0) {
            return false;
        } else {
            return field438 && class106.field1719[81] && field437 != -1;
        }
    }

    @ObfuscatedName("bb.cp(I)V")
    public static void method1198() {
        for (int var0 = 0; var0 < field515; var0++) {
            int var1 = field498[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field515 - 1) {
                    for (int var3 = var0; var3 < field515 - 1; var3++) {
                        field434[var3] = field434[var3 + 1];
                        field410[var3] = field410[var3 + 1];
                        field498[var3] = field498[var3 + 1];
                        field433[var3] = field433[var3 + 1];
                        field430[var3] = field430[var3 + 1];
                        field574[var3] = field574[var3 + 1];
                    }
                }
                field515--;
            }
        }
    }

    @ObfuscatedName("ax.cc(IIIII)V")
    public static final void method795(int arg0, int arg1, int arg2, int arg3) {
        if (field417 == 0 && !field445) {
            method86(class174.field2511, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class83.field1424; var6++) {
            int var7 = class83.field1421[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field144.method1846(Statics.field1834, var8, var9, var7) >= 0) {
                    class198 var12 = Statics.method935(var11);
                    if (var12.field2940 != null) {
                        var12 = var12.method3493();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field417 == 1) {
                        method86(class174.field2506, field444 + " " + class38.field782 + " " + class38.method800(65535) + var12.field2913, 1, var7, var8, var9);
                    } else if (!field445) {
                        String[] var13 = var12.field2898;
                        if (field461) {
                            var13 = method2615(var13);
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
                                    method86(var13[var14], class38.method800(65535) + var12.field2913, var15, var7, var8, var9);
                                }
                            }
                        }
                        method86(class174.field2445, class38.method800(65535) + var12.field2913, 1002, var12.field2922 << 14, var8, var9);
                    } else if ((Statics.field760 & 0x4) == 4) {
                        method86(field354, field449 + " " + class38.field782 + " " + class38.method800(65535) + var12.field2913, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class36 var16 = field328[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field765.field3041 == 1 && (var16.field636 & 0x7F) == 64 && (var16.field605 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field329; var17++) {
                            class36 var18 = field328[field286[var17]];
                            if (var18 != null && var16 != var18 && var18.field765.field3041 == 1 && var16.field636 == var18.field636 && var16.field605 == var18.field605) {
                                method206(var18.field765, field286[var17], var8, var9);
                            }
                        }
                        int var19 = class46.field917;
                        int[] var20 = class46.field914;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class24 var22 = field365[var20[var21]];
                            if (var22 != null && var16.field636 == var22.field636 && var16.field605 == var22.field605) {
                                method1900(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method206(var16.field765, var11, var8, var9);
                }
                if (var10 == 0) {
                    class24 var23 = field365[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field636 & 0x7F) == 64 && (var23.field605 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field329; var24++) {
                            class36 var25 = field328[field286[var24]];
                            if (var25 != null && var25.field765.field3041 == 1 && var23.field636 == var25.field636 && var23.field605 == var25.field605) {
                                method206(var25.field765, field286[var24], var8, var9);
                            }
                        }
                        int var26 = class46.field917;
                        int[] var27 = class46.field914;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class24 var29 = field365[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field636 == var29.field636 && var23.field605 == var29.field605) {
                                method1900(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field419 == var11) {
                        var4 = var7;
                    } else {
                        method1900(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class129 var30 = field420[Statics.field1834][var8][var9];
                    if (var30 != null) {
                        for (class44 var31 = (class44) var30.method2342(); var31 != null; var31 = (class44) var30.method2339()) {
                            class199 var32 = class199.method973(var31.field899);
                            if (field417 == 1) {
                                method86(class174.field2506, field444 + " " + class38.field782 + " " + class38.method800(16748608) + var32.field2960, 16, var31.field899, var8, var9);
                            } else if (!field445) {
                                String[] var33 = var32.field2987;
                                if (field461) {
                                    var33 = method2615(var33);
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
                                        method86(var33[var34], class38.method800(16748608) + var32.field2960, var35, var31.field899, var8, var9);
                                    } else if (var34 == 2) {
                                        method86(class174.field2359, class38.method800(16748608) + var32.field2960, 20, var31.field899, var8, var9);
                                    }
                                }
                                method86(class174.field2445, class38.method800(16748608) + var32.field2960, 1004, var31.field899, var8, var9);
                            } else if ((Statics.field760 & 0x1) == 1) {
                                method86(field354, field449 + " " + class38.field782 + " " + class38.method800(16748608) + var32.field2960, 17, var31.field899, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class24 var38 = field365[field419];
            method1900(var38, field419, var36, var37);
        }
    }

    @ObfuscatedName("r.cq(Lgf;IIII)V")
    public static final void method206(class200 arg0, int arg1, int arg2, int arg3) {
        if (field515 >= 400) {
            return;
        }
        if (arg0.field3019 != null) {
            arg0 = arg0.method3570();
        }
        if (arg0 == null || !arg0.field3040 || arg0.field3042 && field458 != arg1) {
            return;
        }
        String var4 = arg0.field3021;
        if (arg0.field3029 != 0) {
            var4 = var4 + method3078(arg0.field3029, Statics.field186.field246) + " " + class38.field788 + class174.field2606 + arg0.field3029 + class38.field783;
        }
        if (arg0.field3042 && field547) {
            method86(class174.field2445, class38.method800(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field417 == 1) {
            method86(class174.field2506, field444 + " " + class38.field782 + " " + class38.method800(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field445) {
            int var5 = arg0.field3042 && field547 ? 2000 : 0;
            String[] var6 = arg0.field3026;
            if (field461) {
                var6 = method2615(var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class174.field2473)) {
                        int var8 = 0;
                        if (var7 == 0) {
                            var8 = var5 + 9;
                        }
                        if (var7 == 1) {
                            var8 = var5 + 10;
                        }
                        if (var7 == 2) {
                            var8 = var5 + 11;
                        }
                        if (var7 == 3) {
                            var8 = var5 + 12;
                        }
                        if (var7 == 4) {
                            var8 = var5 + 13;
                        }
                        method86(var6[var7], class38.method800(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class174.field2473)) {
                        short var10 = 0;
                        if (field315 != class41.field815) {
                            if (field315 == class41.field813 || field315 == class41.field817 && arg0.field3029 > Statics.field186.field246) {
                                var10 = 2000;
                            }
                            int var11 = 0;
                            if (var9 == 0) {
                                var11 = var10 + 9;
                            }
                            if (var9 == 1) {
                                var11 = var10 + 10;
                            }
                            if (var9 == 2) {
                                var11 = var10 + 11;
                            }
                            if (var9 == 3) {
                                var11 = var10 + 12;
                            }
                            if (var9 == 4) {
                                var11 = var10 + 13;
                            }
                            method86(var6[var9], class38.method800(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3042 || !field547) {
                method86(class174.field2445, class38.method800(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field760 & 0x2) == 2) {
            method86(field354, field449 + " " + class38.field782 + " " + class38.method800(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("cz.cl(Ld;IIII)V")
    public static final void method1900(class24 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field186 == arg0 || field515 >= 400) {
            return;
        }
        String var4;
        if (arg0.field241 == 0) {
            var4 = arg0.field265[0] + arg0.field244 + arg0.field265[1] + method3078(arg0.field246, Statics.field186.field246) + " " + class38.field788 + class174.field2606 + arg0.field246 + class38.field783 + arg0.field265[2];
        } else {
            var4 = arg0.field265[0] + arg0.field244 + arg0.field265[1] + " " + class38.field788 + class174.field2513 + arg0.field241 + class38.field783 + arg0.field265[2];
        }
        if (field417 == 1) {
            method86(class174.field2506, field444 + " " + class38.field782 + " " + class38.method800(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field445) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field416[var5] != null) {
                    short var6 = 0;
                    if (field416[var5].equalsIgnoreCase(class174.field2473)) {
                        if (field314 == class41.field815) {
                            continue;
                        }
                        if (field314 == class41.field813 || field314 == class41.field817 && arg0.field246 > Statics.field186.field246) {
                            var6 = 2000;
                        }
                        if (Statics.field186.field260 != 0 && arg0.field260 != 0) {
                            if (Statics.field186.field260 == arg0.field260) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field528[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field415[var5] + var6;
                    method86(field416[var5], class38.method800(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field760 & 0x8) == 8) {
            method86(field354, field449 + " " + class38.field782 + " " + class38.method800(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field515; var9++) {
            if (field498[var9] == 23) {
                field410[var9] = class38.method800(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("fs.cb(III)Ljava/lang/String;")
    public static final String method3078(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class38.method800(16711680);
        } else if (var2 < -6) {
            return class38.method800(16723968);
        } else if (var2 < -3) {
            return class38.method800(16740352);
        } else if (var2 < 0) {
            return class38.method800(16756736);
        } else if (var2 > 9) {
            return class38.method800(65280);
        } else if (var2 > 6) {
            return class38.method800(4259584);
        } else if (var2 > 3) {
            return class38.method800(8453888);
        } else if (var2 > 0) {
            return class38.method800(12648192);
        } else {
            return class38.method800(16776960);
        }
    }

    @ObfuscatedName("n.cz(IIIIIIIIB)V")
    public static final void method19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class170.method859(arg0)) {
            Statics.field1213 = null;
            Statics.method959(Statics.field3297[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1213 != null) {
                Statics.method959(Statics.field1213, -1412584499, arg1, arg2, arg3, arg4, Statics.field767, Statics.field264, arg7);
                Statics.field1213 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field495[var8] = true;
            }
        } else {
            field495[arg7] = true;
        }
    }

    @ObfuscatedName("k.ch(Ljava/lang/String;Lfi;I)Ljava/lang/String;")
    public static String method161(String arg0, class170 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method2060(Statics.method3300(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field1467 != null) {
                    int var6 = Statics.field1467.field1672;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field1467.field1675 != null) {
                        var5 = (String) Statics.field1467.field1675;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("o.cg(II)Ljava/lang/String;")
    public static final String method187(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class38.field779 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class38.method800(65408) + var1.substring(0, var1.length() - 8) + class174.field2517 + " " + class38.field788 + var1 + class38.field783 + class38.field786;
        } else if (var1.length() > 6) {
            return " " + class38.method800(16777215) + var1.substring(0, var1.length() - 4) + class174.field2519 + " " + class38.field788 + var1 + class38.field783 + class38.field786;
        } else {
            return " " + class38.method800(16776960) + var1 + class38.field786;
        }
    }

    @ObfuscatedName("fg.ct(Lfi;B)V")
    public static void method3136(class170 arg0) {
        class170 var1 = arg0.field2226 == -1 ? null : class170.method971(arg0.field2226);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field1757;
            var3 = Statics.field1129;
        } else {
            var2 = var1.field2249;
            var3 = var1.field2223;
        }
        method191(arg0, var2, var3, false);
        method928(arg0, var2, var3);
    }

    @ObfuscatedName("ek.cv(IIIZB)V")
    public static final void method2604(int arg0, int arg1, int arg2, boolean arg3) {
        if (class170.method859(arg0)) {
            method72(Statics.field3297[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("p.cx([Lfi;IIIZB)V")
    public static void method72(class170[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class170 var6 = arg0[var5];
            if (var6 != null && var6.field2226 == arg1) {
                method191(var6, arg2, arg3, arg4);
                method928(var6, arg2, arg3);
                if (var6.field2228 > var6.field2251 - var6.field2249) {
                    var6.field2228 = var6.field2251 - var6.field2249;
                }
                if (var6.field2228 < 0) {
                    var6.field2228 = 0;
                }
                if (var6.field2229 > var6.field2206 - var6.field2223) {
                    var6.field2229 = var6.field2206 - var6.field2223;
                }
                if (var6.field2229 < 0) {
                    var6.field2229 = 0;
                }
                if (var6.field2209 == 0) {
                    Statics.method954(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("q.cy(Lfi;IIZI)V")
    public static void method191(class170 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2249;
        int var5 = arg0.field2223;
        if (arg0.field2214 == 0) {
            arg0.field2249 = arg0.field2218;
        } else if (arg0.field2214 == 1) {
            arg0.field2249 = arg1 - arg0.field2218;
        } else if (arg0.field2214 == 2) {
            arg0.field2249 = arg0.field2218 * arg1 >> 14;
        }
        if (arg0.field2215 == 0) {
            arg0.field2223 = arg0.field2200;
        } else if (arg0.field2215 == 1) {
            arg0.field2223 = arg2 - arg0.field2200;
        } else if (arg0.field2215 == 2) {
            arg0.field2223 = arg0.field2200 * arg2 >> 14;
        }
        if (arg0.field2214 == 4) {
            arg0.field2249 = arg0.field2334 * arg0.field2223 / arg0.field2244;
        }
        if (arg0.field2215 == 4) {
            arg0.field2223 = arg0.field2249 * arg0.field2244 / arg0.field2334;
        }
        if (field471 && arg0.field2209 == 0) {
            if (arg0.field2223 < 5 && arg0.field2249 < 5) {
                arg0.field2223 = 5;
                arg0.field2249 = 5;
            } else {
                if (arg0.field2223 <= 0) {
                    arg0.field2223 = 5;
                }
                if (arg0.field2249 <= 0) {
                    arg0.field2249 = 5;
                }
            }
        }
        if (arg0.field2211 == 1337) {
            field462 = arg0;
        }
        if (arg3 && arg0.field2316 != null && (arg0.field2249 != var4 || arg0.field2223 != var5)) {
            class19 var6 = new class19();
            var6.field189 = arg0;
            var6.field197 = arg0.field2316;
            field489.method2360(var6);
        }
    }

    @ObfuscatedName("ay.cf(Lfi;III)V")
    public static void method928(class170 arg0, int arg1, int arg2) {
        if (arg0.field2212 == 0) {
            arg0.field2220 = arg0.field2216;
        } else if (arg0.field2212 == 1) {
            arg0.field2220 = (arg1 - arg0.field2249) / 2 + arg0.field2216;
        } else if (arg0.field2212 == 2) {
            arg0.field2220 = arg1 - arg0.field2249 - arg0.field2216;
        } else if (arg0.field2212 == 3) {
            arg0.field2220 = arg0.field2216 * arg1 >> 14;
        } else if (arg0.field2212 == 4) {
            arg0.field2220 = (arg0.field2216 * arg1 >> 14) + (arg1 - arg0.field2249) / 2;
        } else {
            arg0.field2220 = arg1 - arg0.field2249 - (arg0.field2216 * arg1 >> 14);
        }
        if (arg0.field2213 == 0) {
            arg0.field2221 = arg0.field2217;
        } else if (arg0.field2213 == 1) {
            arg0.field2221 = (arg2 - arg0.field2223) / 2 + arg0.field2217;
        } else if (arg0.field2213 == 2) {
            arg0.field2221 = arg2 - arg0.field2223 - arg0.field2217;
        } else if (arg0.field2213 == 3) {
            arg0.field2221 = arg0.field2217 * arg2 >> 14;
        } else if (arg0.field2213 == 4) {
            arg0.field2221 = (arg0.field2217 * arg2 >> 14) + (arg2 - arg0.field2223) / 2;
        } else {
            arg0.field2221 = arg2 - arg0.field2223 - (arg0.field2217 * arg2 >> 14);
        }
        if (!field471 || arg0.field2209 != 0) {
            return;
        }
        if (arg0.field2220 < 0) {
            arg0.field2220 = 0;
        } else if (arg0.field2249 + arg0.field2220 > arg1) {
            arg0.field2220 = arg1 - arg0.field2249;
        }
        if (arg0.field2221 < 0) {
            arg0.field2221 = 0;
        } else if (arg0.field2223 + arg0.field2221 > arg2) {
            arg0.field2221 = arg2 - arg0.field2223;
        }
    }

    @ObfuscatedName("df.cr(II)Ljava/lang/String;")
    public static final String method2060(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("gz.cu(Lfi;B)Z")
    public static final boolean method3240(class170 arg0) {
        if (arg0.field2320 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2320.length; var1++) {
            int var2 = Statics.method3300(arg0, var1);
            int var3 = arg0.field2263[var1];
            if (arg0.field2320[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2320[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2320[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gf.dh([Lfi;IIIIIIII)V")
    public static final void method3571(class170[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class170 var9 = arg0[var8];
            if (var9 != null && (!var9.field2231 || var9.field2209 == 0 || var9.field2222 || method221(var9) != 0 || field464 == var9 || var9.field2211 == 1338) && var9.field2226 == arg1 && (!var9.field2231 || !method115(var9))) {
                int var10 = var9.field2220 + arg6;
                int var11 = var9.field2221 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2209 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2209 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2249 + var10;
                    int var19 = var9.field2223 + var11;
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
                    int var22 = var9.field2249 + var10;
                    int var23 = var9.field2223 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field463 == var9) {
                    field414 = true;
                    field472 = var10;
                    field345 = var11;
                }
                if (!var9.field2231 || var12 < var14 && var13 < var15) {
                    int var24 = class116.field1806;
                    int var25 = class116.field1807;
                    if (class116.field1812 != 0) {
                        var24 = class116.field1813;
                        var25 = class116.field1814;
                    }
                    if (var9.field2211 == 1337) {
                        if (!field295 && !field428 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method795(var24, var25, var12, var13);
                        }
                    } else if (var9.field2211 == 1338) {
                        method807(var9, var10, var11);
                    } else {
                        if (!field428 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var26 = var24 - var10;
                            int var27 = var25 - var11;
                            if (var9.field2210 == 1) {
                                method86(var9.field2296, "", 24, 0, 0, var9.field2207);
                            }
                            if (var9.field2210 == 2 && !field445) {
                                int var28 = method221(var9);
                                int var29 = var28 >> 11 & 0x3F;
                                String var30;
                                if (var29 == 0) {
                                    var30 = null;
                                } else if (var9.field2252 == null || var9.field2252.trim().length() == 0) {
                                    var30 = null;
                                } else {
                                    var30 = var9.field2252;
                                }
                                if (var30 != null) {
                                    method86(var30, class38.method800(65280) + var9.field2259, 25, 0, -1, var9.field2207);
                                }
                            }
                            if (var9.field2210 == 3) {
                                method86(class174.field2515, "", 26, 0, 0, var9.field2207);
                            }
                            if (var9.field2210 == 4) {
                                method86(var9.field2296, "", 28, 0, 0, var9.field2207);
                            }
                            if (var9.field2210 == 5) {
                                method86(var9.field2296, "", 29, 0, 0, var9.field2207);
                            }
                            if (var9.field2210 == 6 && field544 == null) {
                                method86(var9.field2296, "", 30, 0, -1, var9.field2207);
                            }
                            if (var9.field2209 == 2) {
                                int var32 = 0;
                                for (int var33 = 0; var33 < var9.field2223; var33++) {
                                    for (int var34 = 0; var34 < var9.field2249; var34++) {
                                        int var35 = (var9.field2273 + 32) * var34;
                                        int var36 = (var9.field2274 + 32) * var33;
                                        if (var32 < 20) {
                                            var35 += var9.field2317[var32];
                                            var36 += var9.field2276[var32];
                                        }
                                        if (var26 >= var35 && var27 >= var36 && var26 < var35 + 32 && var27 < var36 + 32) {
                                            field406 = var32;
                                            Statics.field238 = var9;
                                            if (var9.field2298[var32] > 0) {
                                                class199 var37 = class199.method973(var9.field2298[var32] - 1);
                                                if (field417 == 1 && class171.method2020(method221(var9))) {
                                                    if (Statics.field751 != var9.field2207 || Statics.field42 != var32) {
                                                        method86(class174.field2506, field444 + " " + class38.field782 + " " + class38.method800(16748608) + var37.field2960, 31, var37.field2949, var32, var9.field2207);
                                                    }
                                                } else if (!field445 || !class171.method2020(method221(var9))) {
                                                    String[] var38 = var37.field2975;
                                                    if (field461) {
                                                        var38 = method2615(var38);
                                                    }
                                                    int var39 = var37.method3545();
                                                    if (class171.method2020(method221(var9))) {
                                                        for (int var40 = 4; var40 >= 3; var40--) {
                                                            boolean var41 = var39 == var40;
                                                            if (var38 != null && var38[var40] != null) {
                                                                byte var42;
                                                                if (var40 == 3) {
                                                                    var42 = 36;
                                                                } else {
                                                                    var42 = 37;
                                                                }
                                                                method3311(var38[var40], class38.method800(16748608) + var37.field2960, var42, var37.field2949, var32, var9.field2207, var41);
                                                            } else if (var40 == 4) {
                                                                method3311(class174.field2566, class38.method800(16748608) + var37.field2960, 37, var37.field2949, var32, var9.field2207, var41);
                                                            }
                                                        }
                                                    }
                                                    int var43 = method221(var9);
                                                    boolean var44 = (var43 >> 31 & 0x1) != 0;
                                                    if (var44) {
                                                        method86(class174.field2506, class38.method800(16748608) + var37.field2960, 38, var37.field2949, var32, var9.field2207);
                                                    }
                                                    class171 var10000 = (class171) null;
                                                    if (class171.method2020(method221(var9)) && var38 != null) {
                                                        for (int var45 = 2; var45 >= 0; var45--) {
                                                            boolean var46 = var39 == var45;
                                                            if (var38[var45] != null) {
                                                                byte var47 = 0;
                                                                if (var45 == 0) {
                                                                    var47 = 33;
                                                                }
                                                                if (var45 == 1) {
                                                                    var47 = 34;
                                                                }
                                                                if (var45 == 2) {
                                                                    var47 = 35;
                                                                }
                                                                method3311(var38[var45], class38.method800(16748608) + var37.field2960, var47, var37.field2949, var32, var9.field2207, var46);
                                                            }
                                                        }
                                                    }
                                                    String[] var48 = var9.field2278;
                                                    if (field461) {
                                                        var48 = method2615(var48);
                                                    }
                                                    if (var48 != null) {
                                                        for (int var49 = 4; var49 >= 0; var49--) {
                                                            if (var48[var49] != null) {
                                                                byte var50 = 0;
                                                                if (var49 == 0) {
                                                                    var50 = 39;
                                                                }
                                                                if (var49 == 1) {
                                                                    var50 = 40;
                                                                }
                                                                if (var49 == 2) {
                                                                    var50 = 41;
                                                                }
                                                                if (var49 == 3) {
                                                                    var50 = 42;
                                                                }
                                                                if (var49 == 4) {
                                                                    var50 = 43;
                                                                }
                                                                method86(var48[var49], class38.method800(16748608) + var37.field2960, var50, var37.field2949, var32, var9.field2207);
                                                            }
                                                        }
                                                    }
                                                    method86(class174.field2445, class38.method800(16748608) + var37.field2960, 1005, var37.field2949, var32, var9.field2207);
                                                } else if ((Statics.field760 & 0x10) == 16) {
                                                    method86(field354, field449 + " " + class38.field782 + " " + class38.method800(16748608) + var37.field2960, 32, var37.field2949, var32, var9.field2207);
                                                }
                                            }
                                        }
                                        var32++;
                                    }
                                }
                            }
                            if (var9.field2231) {
                                if (field445) {
                                    int var51 = method221(var9);
                                    boolean var52 = (var51 >> 21 & 0x1) != 0;
                                    if (var52 && (Statics.field760 & 0x20) == 32) {
                                        method86(field354, field449 + " " + class38.field782 + " " + var9.field2280, 58, 0, var9.field2291, var9.field2207);
                                    }
                                } else {
                                    for (int var53 = 9; var53 >= 5; var53--) {
                                        String var54 = method192(var9, var53);
                                        if (var54 != null) {
                                            method86(var54, var9.field2280, 1007, var53 + 1, var9.field2291, var9.field2207);
                                        }
                                    }
                                    int var55 = method221(var9);
                                    int var56 = var55 >> 11 & 0x3F;
                                    String var57;
                                    if (var56 == 0) {
                                        var57 = null;
                                    } else if (var9.field2252 == null || var9.field2252.trim().length() == 0) {
                                        var57 = null;
                                    } else {
                                        var57 = var9.field2252;
                                    }
                                    if (var57 != null) {
                                        method86(var57, var9.field2280, 25, 0, var9.field2291, var9.field2207);
                                    }
                                    for (int var59 = 4; var59 >= 0; var59--) {
                                        String var60 = method192(var9, var59);
                                        if (var60 != null) {
                                            method86(var60, var9.field2280, 57, var59 + 1, var9.field2291, var9.field2207);
                                        }
                                    }
                                    int var61 = method221(var9);
                                    boolean var62 = (var61 & 0x1) != 0;
                                    if (var62) {
                                        method86(class174.field2364, "", 30, 0, var9.field2291, var9.field2207);
                                    }
                                }
                            }
                        }
                        if (var9.field2209 == 0) {
                            if (!var9.field2231 && method115(var9) && Statics.field925 != var9) {
                                continue;
                            }
                            method3571(arg0, var9.field2207, var12, var13, var14, var15, var10 - var9.field2228, var11 - var9.field2229);
                            if (var9.field2340 != null) {
                                method3571(var9.field2340, var9.field2207, var12, var13, var14, var15, var10 - var9.field2228, var11 - var9.field2229);
                            }
                            class18 var63 = (class18) field302.method2286((long) var9.field2207);
                            if (var63 != null) {
                                if (var63.field177 == 0 && class116.field1806 >= var12 && class116.field1807 >= var13 && class116.field1806 < var14 && class116.field1807 < var15 && !field428 && !field471) {
                                    for (class19 var64 = (class19) field489.method2352(); var64 != null; var64 = (class19) field489.method2341()) {
                                        if (var64.field202) {
                                            var64.method2327();
                                            var64.field189.field2301 = false;
                                        }
                                    }
                                    if (Statics.field816 == 0) {
                                        field463 = null;
                                        field464 = null;
                                    }
                                    if (!field428) {
                                        method2018();
                                        field434[0] = class174.field2595;
                                        field410[0] = "";
                                        field498[0] = 1006;
                                        field515 = 1;
                                    }
                                }
                                int var65 = var63.field178;
                                if (class170.method859(var65)) {
                                    method3571(Statics.field3297[var65], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2231) {
                            if (var9.field2236) {
                                if (class116.field1806 >= var12 && class116.field1807 >= var13 && class116.field1806 < var14 && class116.field1807 < var15) {
                                    for (class19 var66 = (class19) field489.method2352(); var66 != null; var66 = (class19) field489.method2341()) {
                                        if (var66.field202) {
                                            var66.method2327();
                                            var66.field189.field2301 = false;
                                        }
                                    }
                                    if (Statics.field816 == 0) {
                                        field463 = null;
                                        field464 = null;
                                    }
                                    if (!field428) {
                                        field434[0] = class174.field2595;
                                        field410[0] = "";
                                        field498[0] = 1006;
                                        field515 = 1;
                                    }
                                }
                            } else if (var9.field2341 && class116.field1806 >= var12 && class116.field1807 >= var13 && class116.field1806 < var14 && class116.field1807 < var15) {
                                for (class19 var67 = (class19) field489.method2352(); var67 != null; var67 = (class19) field489.method2341()) {
                                    if (var67.field202 && var67.field189.field2308 == var67.field197) {
                                        var67.method2327();
                                    }
                                }
                            }
                            boolean var68;
                            if (class116.field1806 >= var12 && class116.field1807 >= var13 && class116.field1806 < var14 && class116.field1807 < var15) {
                                var68 = true;
                            } else {
                                var68 = false;
                            }
                            boolean var69 = false;
                            if ((class116.field1803 == 1 || !Statics.field292 && class116.field1803 == 4) && var68) {
                                var69 = true;
                            }
                            boolean var70 = false;
                            if ((class116.field1812 == 1 || !Statics.field292 && class116.field1812 == 4) && class116.field1813 >= var12 && class116.field1814 >= var13 && class116.field1813 < var14 && class116.field1814 < var15) {
                                var70 = true;
                            }
                            if (var70) {
                                method1925(var9, class116.field1813 - var10, class116.field1814 - var11);
                            }
                            if (field463 != null && field463 != var9 && var68) {
                                int var71 = method221(var9);
                                boolean var72 = (var71 >> 20 & 0x1) != 0;
                                if (var72) {
                                    field564 = var9;
                                }
                            }
                            if (field464 == var9) {
                                field468 = true;
                                field524 = var10;
                                field308 = var11;
                            }
                            if (var9.field2222) {
                                if (var68 && field488 != 0 && var9.field2308 != null) {
                                    class19 var73 = new class19();
                                    var73.field202 = true;
                                    var73.field189 = var9;
                                    var73.field191 = field488;
                                    var73.field197 = var9.field2308;
                                    field489.method2360(var73);
                                }
                                if (field463 != null || Statics.field160 != null || field428) {
                                    var70 = false;
                                    var69 = false;
                                    var68 = false;
                                }
                                if (!var9.field2333 && var70) {
                                    var9.field2333 = true;
                                    if (var9.field2289 != null) {
                                        class19 var74 = new class19();
                                        var74.field202 = true;
                                        var74.field189 = var9;
                                        var74.field190 = class116.field1813 - var10;
                                        var74.field191 = class116.field1814 - var11;
                                        var74.field197 = var9.field2289;
                                        field489.method2360(var74);
                                    }
                                }
                                if (var9.field2333 && var69 && var9.field2208 != null) {
                                    class19 var75 = new class19();
                                    var75.field202 = true;
                                    var75.field189 = var9;
                                    var75.field190 = class116.field1806 - var10;
                                    var75.field191 = class116.field1807 - var11;
                                    var75.field197 = var9.field2208;
                                    field489.method2360(var75);
                                }
                                if (var9.field2333 && !var69) {
                                    var9.field2333 = false;
                                    if (var9.field2275 != null) {
                                        class19 var76 = new class19();
                                        var76.field202 = true;
                                        var76.field189 = var9;
                                        var76.field190 = class116.field1806 - var10;
                                        var76.field191 = class116.field1807 - var11;
                                        var76.field197 = var9.field2275;
                                        field360.method2360(var76);
                                    }
                                }
                                if (var69 && var9.field2204 != null) {
                                    class19 var77 = new class19();
                                    var77.field202 = true;
                                    var77.field189 = var9;
                                    var77.field190 = class116.field1806 - var10;
                                    var77.field191 = class116.field1807 - var11;
                                    var77.field197 = var9.field2204;
                                    field489.method2360(var77);
                                }
                                if (!var9.field2301 && var68) {
                                    var9.field2301 = true;
                                    if (var9.field2293 != null) {
                                        class19 var78 = new class19();
                                        var78.field202 = true;
                                        var78.field189 = var9;
                                        var78.field190 = class116.field1806 - var10;
                                        var78.field191 = class116.field1807 - var11;
                                        var78.field197 = var9.field2293;
                                        field489.method2360(var78);
                                    }
                                }
                                if (var9.field2301 && var68 && var9.field2294 != null) {
                                    class19 var79 = new class19();
                                    var79.field202 = true;
                                    var79.field189 = var9;
                                    var79.field190 = class116.field1806 - var10;
                                    var79.field191 = class116.field1807 - var11;
                                    var79.field197 = var9.field2294;
                                    field489.method2360(var79);
                                }
                                if (var9.field2301 && !var68) {
                                    var9.field2301 = false;
                                    if (var9.field2295 != null) {
                                        class19 var80 = new class19();
                                        var80.field202 = true;
                                        var80.field189 = var9;
                                        var80.field190 = class116.field1806 - var10;
                                        var80.field191 = class116.field1807 - var11;
                                        var80.field197 = var9.field2295;
                                        field360.method2360(var80);
                                    }
                                }
                                if (var9.field2306 != null) {
                                    class19 var81 = new class19();
                                    var81.field189 = var9;
                                    var81.field197 = var9.field2306;
                                    field532.method2360(var81);
                                }
                                if (var9.field2300 != null && field477 > var9.field2335) {
                                    if (var9.field2254 == null || field477 - var9.field2335 > 32) {
                                        class19 var86 = new class19();
                                        var86.field189 = var9;
                                        var86.field197 = var9.field2300;
                                        field489.method2360(var86);
                                    } else {
                                        label743: for (int var82 = var9.field2335; var82 < field477; var82++) {
                                            int var83 = field497[var82 & 0x1F];
                                            for (int var84 = 0; var84 < var9.field2254.length; var84++) {
                                                if (var9.field2254[var84] == var83) {
                                                    class19 var85 = new class19();
                                                    var85.field189 = var9;
                                                    var85.field197 = var9.field2300;
                                                    field489.method2360(var85);
                                                    break label743;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2335 = field477;
                                }
                                if (var9.field2302 != null && field479 > var9.field2336) {
                                    if (var9.field2303 == null || field479 - var9.field2336 > 32) {
                                        class19 var91 = new class19();
                                        var91.field189 = var9;
                                        var91.field197 = var9.field2302;
                                        field489.method2360(var91);
                                    } else {
                                        label719: for (int var87 = var9.field2336; var87 < field479; var87++) {
                                            int var88 = field478[var87 & 0x1F];
                                            for (int var89 = 0; var89 < var9.field2303.length; var89++) {
                                                if (var9.field2303[var89] == var88) {
                                                    class19 var90 = new class19();
                                                    var90.field189 = var9;
                                                    var90.field197 = var9.field2302;
                                                    field489.method2360(var90);
                                                    break label719;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2336 = field479;
                                }
                                if (var9.field2304 != null && field481 > var9.field2337) {
                                    if (var9.field2305 == null || field481 - var9.field2337 > 32) {
                                        class19 var96 = new class19();
                                        var96.field189 = var9;
                                        var96.field197 = var9.field2304;
                                        field489.method2360(var96);
                                    } else {
                                        label695: for (int var92 = var9.field2337; var92 < field481; var92++) {
                                            int var93 = field480[var92 & 0x1F];
                                            for (int var94 = 0; var94 < var9.field2305.length; var94++) {
                                                if (var9.field2305[var94] == var93) {
                                                    class19 var95 = new class19();
                                                    var95.field189 = var9;
                                                    var95.field197 = var9.field2304;
                                                    field489.method2360(var95);
                                                    break label695;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2337 = field481;
                                }
                                if (field482 > var9.field2239 && var9.field2309 != null) {
                                    class19 var97 = new class19();
                                    var97.field189 = var9;
                                    var97.field197 = var9.field2309;
                                    field489.method2360(var97);
                                }
                                if (field483 > var9.field2239 && var9.field2287 != null) {
                                    class19 var98 = new class19();
                                    var98.field189 = var9;
                                    var98.field197 = var9.field2287;
                                    field489.method2360(var98);
                                }
                                if (field484 > var9.field2239 && var9.field2323 != null) {
                                    class19 var99 = new class19();
                                    var99.field189 = var9;
                                    var99.field197 = var9.field2323;
                                    field489.method2360(var99);
                                }
                                if (field289 > var9.field2239 && var9.field2277 != null) {
                                    class19 var100 = new class19();
                                    var100.field189 = var9;
                                    var100.field197 = var9.field2277;
                                    field489.method2360(var100);
                                }
                                if (field486 > var9.field2239 && var9.field2318 != null) {
                                    class19 var101 = new class19();
                                    var101.field189 = var9;
                                    var101.field197 = var9.field2318;
                                    field489.method2360(var101);
                                }
                                if (field487 > var9.field2239 && var9.field2313 != null) {
                                    class19 var102 = new class19();
                                    var102.field189 = var9;
                                    var102.field197 = var9.field2313;
                                    field489.method2360(var102);
                                }
                                var9.field2239 = field506;
                                if (var9.field2310 != null) {
                                    for (int var103 = 0; var103 < field421; var103++) {
                                        class19 var104 = new class19();
                                        var104.field189 = var9;
                                        var104.field194 = field522[var103];
                                        var104.field195 = field299[var103];
                                        var104.field197 = var9.field2310;
                                        field489.method2360(var104);
                                    }
                                }
                            }
                        }
                        if (!var9.field2231 && field463 == null && Statics.field160 == null && !field428) {
                            if ((var9.field2322 >= 0 || var9.field2286 != 0) && class116.field1806 >= var12 && class116.field1807 >= var13 && class116.field1806 < var14 && class116.field1807 < var15) {
                                if (var9.field2322 >= 0) {
                                    Statics.field925 = arg0[var9.field2322];
                                } else {
                                    Statics.field925 = var9;
                                }
                            }
                            if (var9.field2209 == 8 && class116.field1806 >= var12 && class116.field1807 >= var13 && class116.field1806 < var14 && class116.field1807 < var15) {
                                Statics.field41 = var9;
                            }
                            if (var9.field2206 > var9.field2223) {
                                int var105 = var9.field2249 + var10;
                                int var106 = var9.field2223;
                                int var107 = var9.field2206;
                                int var108 = class116.field1806;
                                int var109 = class116.field1807;
                                if (field371) {
                                    field372 = 32;
                                } else {
                                    field372 = 0;
                                }
                                field371 = false;
                                if (class116.field1803 == 1 || !Statics.field292 && class116.field1803 == 4) {
                                    if (var108 >= var105 && var108 < var105 + 16 && var109 >= var11 && var109 < var11 + 16) {
                                        var9.field2229 -= 4;
                                        method974(var9);
                                    } else if (var108 >= var105 && var108 < var105 + 16 && var109 >= var11 + var106 - 16 && var109 < var11 + var106) {
                                        var9.field2229 += 4;
                                        method974(var9);
                                    } else if (var108 >= var105 - field372 && var108 < field372 + var105 + 16 && var109 >= var11 + 16 && var109 < var11 + var106 - 16) {
                                        int var110 = (var106 - 32) * var106 / var107;
                                        if (var110 < 8) {
                                            var110 = 8;
                                        }
                                        int var111 = var109 - var11 - 16 - var110 / 2;
                                        int var112 = var106 - 32 - var110;
                                        var9.field2229 = (var107 - var106) * var111 / var112;
                                        method974(var9);
                                        field371 = true;
                                    }
                                }
                                if (field488 != 0) {
                                    int var113 = var9.field2249;
                                    if (var108 >= var105 - var113 && var109 >= var11 && var108 < var105 + 16 && var109 <= var11 + var106) {
                                        var9.field2229 += field488 * 45;
                                        method974(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dh.dc(IIB)V")
    public static final void method1977(int arg0, int arg1) {
        if (class170.method859(arg0)) {
            Statics.method1919(Statics.field3297[arg0], arg1);
        }
    }

    @ObfuscatedName("cy.dj(Lfi;III)V")
    public static final void method1925(class170 arg0, int arg1, int arg2) {
        if (field463 != null || field428 || arg0 == null || method1142(arg0) == null) {
            return;
        }
        field463 = arg0;
        field464 = method1142(arg0);
        field465 = arg1;
        field467 = arg2;
        Statics.field816 = 0;
        field474 = false;
        int var3 = method24();
        if (var3 != -1) {
            method957(var3);
        }
    }

    @ObfuscatedName("ah.dt(II)V")
    public static void method957(int arg0) {
        Statics.field158 = new class39();
        Statics.field158.field796 = field430[arg0];
        Statics.field158.field792 = field574[arg0];
        Statics.field158.field793 = field498[arg0];
        Statics.field158.field799 = field433[arg0];
        Statics.field158.field795 = field434[arg0];
    }

    @ObfuscatedName("am.dx(Lfi;I)V")
    public static void method974(class170 arg0) {
        if (field494 == arg0.field2339) {
            field495[arg0.field2338] = true;
        }
    }

    @ObfuscatedName("eb.dp(B)V")
    public static void method2630() {
        for (class18 var0 = (class18) field302.method2289(); var0 != null; var0 = (class18) field302.method2290()) {
            int var1 = var0.field178;
            if (class170.method859(var1)) {
                boolean var2 = true;
                class170[] var3 = Statics.field3297[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2231;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field1884;
                    class170 var6 = class170.method971(var5);
                    if (var6 != null) {
                        method974(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bn.de(Lfi;B)Lfi;")
    public static class170 method1142(class170 arg0) {
        class170 var1 = arg0;
        int var2 = method221(arg0);
        int var3 = var2 >> 17 & 0x7;
        int var4 = var3;
        class170 var5;
        if (var3 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var1;
                    break;
                }
                var1 = class170.method971(var1.field2226);
                if (var1 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class170 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2282;
        }
        return var7;
    }

    @ObfuscatedName("em.df([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2615(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("cq.dg(II)V")
    public static final void method1890(int arg0) {
        if (!class170.method859(arg0)) {
            return;
        }
        class170[] var1 = Statics.field3297[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class170 var3 = var1[var2];
            if (var3 != null) {
                var3.field2329 = 0;
                var3.field2330 = 0;
            }
        }
    }

    @ObfuscatedName("cn.dr(II)V")
    public static final void method1564(int arg0) {
        if (class170.method859(arg0)) {
            method260(Statics.field3297[arg0], -1);
        }
    }

    @ObfuscatedName("z.dk([Lfi;II)V")
    public static final void method260(class170[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class170 var3 = arg0[var2];
            if (var3 != null && var3.field2226 == arg1 && (!var3.field2231 || !method115(var3))) {
                if (var3.field2209 == 0) {
                    if (!var3.field2231 && method115(var3) && Statics.field925 != var3) {
                        continue;
                    }
                    method260(arg0, var3.field2207);
                    if (var3.field2340 != null) {
                        method260(var3.field2340, var3.field2207);
                    }
                    class18 var4 = (class18) field302.method2286((long) var3.field2207);
                    if (var4 != null) {
                        method1564(var4.field178);
                    }
                }
                if (var3.field2209 == 6) {
                    if (var3.field2234 != -1 || var3.field2255 != -1) {
                        boolean var5 = method3240(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2255;
                        } else {
                            var6 = var3.field2234;
                        }
                        if (var6 != -1) {
                            class202 var7 = Statics.method1464(var6);
                            var3.field2330 += field366;
                            while (var3.field2330 > var7.field3064[var3.field2329]) {
                                var3.field2330 -= var7.field3064[var3.field2329];
                                var3.field2329++;
                                if (var3.field2329 >= var7.field3063.length) {
                                    var3.field2329 -= var7.field3067;
                                    if (var3.field2329 < 0 || var3.field2329 >= var7.field3063.length) {
                                        var3.field2329 = 0;
                                    }
                                }
                                method974(var3);
                            }
                        }
                    }
                    if (var3.field2325 != 0 && !var3.field2231) {
                        int var8 = var3.field2325 >> 16;
                        int var9 = var3.field2325 << 16 >> 16;
                        int var10 = field366 * var8;
                        int var11 = field366 * var9;
                        var3.field2258 = var3.field2258 + var10 & 0x7FF;
                        var3.field2332 = var3.field2332 + var11 & 0x7FF;
                        method974(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ej.db(II)V")
    public static final void method2425(int arg0) {
        method2630();
        class32.method1429();
        int var1 = class188.method2594(arg0).field2778;
        if (var1 == 0) {
            return;
        }
        int var2 = class166.field2166[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class85.method1650(0.9D);
                ((class75) Statics.field1458).method1465(0.9D);
            }
            if (var2 == 2) {
                class85.method1650(0.8D);
                ((class75) Statics.field1458).method1465(0.8D);
            }
            if (var2 == 3) {
                class85.method1650(0.7D);
                ((class75) Statics.field1458).method1465(0.7D);
            }
            if (var2 == 4) {
                class85.method1650(0.6D);
                ((class75) Statics.field1458).method1465(0.6D);
            }
            class199.field2957.method2277();
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
            if (field545 != var3) {
                if (field545 == 0 && field529 != -1) {
                    class139.method873(Statics.field307, field529, 0, var3, false);
                    field440 = false;
                } else if (var3 == 0) {
                    Statics.field1920.method2507();
                    class139.field1922 = 1;
                    Statics.field1925 = null;
                    field440 = false;
                } else if (class139.field1922 == 0) {
                    Statics.field1920.method2423(var3);
                } else {
                    Statics.field1662 = var3;
                }
                field545 = var3;
            }
        }
        if (var1 == 4) {
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
        if (var1 == 5) {
            field361 = var2;
        }
        if (var1 == 6) {
            field452 = var2;
        }
        if (var1 == 9) {
            field453 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field398 = 127;
            }
            if (var2 == 1) {
                field398 = 96;
            }
            if (var2 == 2) {
                field398 = 64;
            }
            if (var2 == 3) {
                field398 = 32;
            }
            if (var2 == 4) {
                field398 = 0;
            }
        }
        if (var1 == 17) {
            field458 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field314 = (class41) class149.method208(class41.method297(), var2);
            if (field314 == null) {
                field314 = class41.field817;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field419 = -1;
            } else {
                field419 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field315 = (class41) class149.method208(class41.method297(), var2);
            if (field315 == null) {
                field315 = class41.field817;
            }
        }
    }

    @ObfuscatedName("l.dd(Lw;ZB)V")
    public static final void method204(class18 arg0, boolean arg1) {
        int var2 = arg0.field178;
        int var3 = (int) arg0.field1884;
        arg0.method2327();
        if (arg1) {
            class170.method895(var2);
        }
        for (class134 var4 = (class134) field492.method2289(); var4 != null; var4 = (class134) field492.method2290()) {
            if ((long) var2 == (var4.field1884 >> 48 & 0xFFFFL)) {
                var4.method2327();
            }
        }
        class170 var5 = class170.method971(var3);
        if (var5 != null) {
            method974(var5);
        }
        method1198();
        if (field450 != -1) {
            method1977(field450, 1);
        }
    }

    @ObfuscatedName("ct.dw(Lfi;I)Z")
    public static final boolean method1912(class170 arg0) {
        int var1 = arg0.field2211;
        if (var1 == 205) {
            field343 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field413.method3070(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field413.method3067(var4, var5 == 1);
        }
        if (var1 == 324) {
            field413.method3041(false);
        }
        if (var1 == 325) {
            field413.method3041(true);
        }
        if (var1 == 326) {
            field333.method2948(54);
            field413.method3039(field333);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fk.dv(Lfi;IIIB)V")
    public static final void method2988(class170 arg0, int arg1, int arg2, int arg3) {
        class165 var4 = arg0.method3093(false);
        if (var4 == null) {
            return;
        }
        if (field527 < 3) {
            Statics.field885.method3983(arg1, arg2, var4.field2161, var4.field2156, 25, 25, field374, 256, var4.field2158, var4.field2157);
        } else {
            class220.method3817(arg1, arg2, 0, var4.field2158, var4.field2157);
        }
    }

    @ObfuscatedName("aw.ds(IIIILhe;Lfm;S)V")
    public static final void method889(int arg0, int arg1, int arg2, int arg3, class225 arg4, class165 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method1155(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field395 + field374 & 0x7FF;
        int var8 = class85.field1461[var7];
        int var9 = class85.field1447[var7];
        int var10 = var8 * 256 / (field340 + 256);
        int var11 = var9 * 256 / (field340 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field798.method4003(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("bn.dy(IIIILhe;Lfm;I)V")
    public static final void method1155(int arg0, int arg1, int arg2, int arg3, class225 arg4, class165 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field395 + field374 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class85.field1461[var6];
        int var9 = class85.field1447[var6];
        int var10 = var8 * 256 / (field340 + 256);
        int var11 = var9 * 256 / (field340 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method4009(arg5.field2161 / 2 + var12 - arg4.field3232 / 2, arg5.field2156 / 2 - var13 - arg4.field3228 / 2, arg0, arg1, arg5.field2161, arg5.field2156, arg5.field2158, arg5.field2157);
        } else {
            arg4.method3937(arg5.field2161 / 2 + arg0 + var12 - arg4.field3232 / 2, arg5.field2156 / 2 + arg1 - var13 - arg4.field3228 / 2);
        }
    }

    @ObfuscatedName("u.do(Ljava/lang/String;ZS)Z")
    public static boolean method216(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class205.method1188(arg0, Statics.field2038);
        for (int var3 = 0; var3 < field348; var3++) {
            if (var2.equalsIgnoreCase(class205.method1188(field560[var3].field138, Statics.field2038)) && (!arg1 || field560[var3].field140 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class205.method1188(Statics.field186.field244, Statics.field2038))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("client.dm(Ljava/lang/String;I)V")
    public static final void method572(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field348 < 200 || field412 == 1) || field348 >= 400) {
            class48.method1892(30, "", class174.field2522);
            return;
        }
        String var1 = class205.method1188(arg0, Statics.field2038);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field348; var2++) {
            class15 var3 = field560[var2];
            String var4 = class205.method1188(var3.field138, Statics.field2038);
            if (var4 != null && var4.equals(var1)) {
                class48.method1892(30, "", arg0 + class174.field2523);
                return;
            }
            if (var3.field139 != null) {
                String var5 = class205.method1188(var3.field139, Statics.field2038);
                if (var5 != null && var5.equals(var1)) {
                    class48.method1892(30, "", arg0 + class174.field2523);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field567; var6++) {
            class20 var7 = field525[var6];
            String var8 = class205.method1188(var7.field205, Statics.field2038);
            if (var8 != null && var8.equals(var1)) {
                class48.method1892(30, "", class174.field2528 + arg0 + class174.field2433);
                return;
            }
            if (var7.field207 != null) {
                String var9 = class205.method1188(var7.field207, Statics.field2038);
                if (var9 != null && var9.equals(var1)) {
                    class48.method1892(30, "", class174.field2528 + arg0 + class174.field2433);
                    return;
                }
            }
        }
        if (class205.method1188(Statics.field186.field244, Statics.field2038).equals(var1)) {
            class48.method1892(30, "", class174.field2536);
        } else {
            field333.method2948(45);
            field333.method2688(class154.method3037(arg0));
            field333.method2730(arg0);
        }
    }

    @ObfuscatedName("ax.dz(Ljava/lang/String;ZI)V")
    public static final void method796(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field567 < 100 || field412 == 1) || field567 >= 400) {
            class48.method1892(31, "", class174.field2556);
            return;
        }
        String var2 = class205.method1188(arg0, Statics.field2038);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field567; var3++) {
            class20 var4 = field525[var3];
            String var5 = class205.method1188(var4.field205, Statics.field2038);
            if (var5 != null && var5.equals(var2)) {
                class48.method1892(31, "", arg0 + class174.field2525);
                return;
            }
            if (var4.field207 != null) {
                String var6 = class205.method1188(var4.field207, Statics.field2038);
                if (var6 != null && var6.equals(var2)) {
                    class48.method1892(31, "", arg0 + class174.field2525);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field348; var7++) {
            class15 var8 = field560[var7];
            String var9 = class205.method1188(var8.field138, Statics.field2038);
            if (var9 != null && var9.equals(var2)) {
                class48.method1892(31, "", class174.field2530 + arg0 + class174.field2531);
                return;
            }
            if (var8.field139 != null) {
                String var10 = class205.method1188(var8.field139, Statics.field2038);
                if (var10 != null && var10.equals(var2)) {
                    class48.method1892(31, "", class174.field2530 + arg0 + class174.field2531);
                    return;
                }
            }
        }
        if (class205.method1188(Statics.field186.field244, Statics.field2038).equals(var2)) {
            class48.method1892(31, "", class174.field2560);
        } else {
            field333.method2948(111);
            field333.method2688(class154.method3037(arg0));
            field333.method2730(arg0);
        }
    }

    @ObfuscatedName("l.dl(Ljava/lang/String;I)V")
    public static final void method205(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class205.method1188(arg0, Statics.field2038);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field348; var2++) {
            class15 var3 = field560[var2];
            String var4 = var3.field138;
            String var5 = class205.method1188(var4, Statics.field2038);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field348--;
                for (int var7 = var2; var7 < field348; var7++) {
                    field560[var7] = field560[var7 + 1];
                }
                field483 = field506;
                field333.method2948(11);
                field333.method2688(class154.method3037(arg0));
                field333.method2730(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("ax.dn(Ljava/lang/String;I)V")
    public static final void method804(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class205.method1188(arg0, Statics.field2038);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field567; var2++) {
            class20 var3 = field525[var2];
            String var4 = var3.field205;
            String var5 = class205.method1188(var4, Statics.field2038);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field567--;
                for (int var7 = var2; var7 < field567; var7++) {
                    field525[var7] = field525[var7 + 1];
                }
                field483 = field506;
                field333.method2948(143);
                field333.method2688(class154.method3037(arg0));
                field333.method2730(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("gl.dq(Ljava/lang/String;I)V")
    public static final void method3638(String arg0) {
        if (Statics.field146 != null) {
            field333.method2948(181);
            field333.method2688(class154.method3037(arg0));
            field333.method2730(arg0);
        }
    }

    @ObfuscatedName("g.di(Ljava/lang/String;I)V")
    public static final void method36(String arg0) {
        if (!arg0.equals("")) {
            field333.method2948(194);
            field333.method2688(class154.method3037(arg0));
            field333.method2730(arg0);
        }
    }

    @ObfuscatedName("e.eh(Lfi;I)I")
    public static int method221(class170 arg0) {
        class134 var1 = (class134) field492.method2286(((long) arg0.field2207 << 32) + (long) arg0.field2291);
        return var1 == null ? arg0.field2279 : var1.field1899;
    }

    @ObfuscatedName("i.ex(Lfi;I)Z")
    public static boolean method115(class170 arg0) {
        if (field471) {
            if (method221(arg0) != 0) {
                return false;
            }
            if (arg0.field2209 == 0) {
                return false;
            }
        }
        return arg0.field2225;
    }

    @ObfuscatedName("q.eu(Lfi;IB)Ljava/lang/String;")
    public static String method192(class170 arg0, int arg1) {
        int var2 = method221(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2307 == null) {
            return null;
        } else if (arg0.field2281 == null || arg0.field2281.length <= arg1 || arg0.field2281[arg1] == null || arg0.field2281[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2281[arg1];
        }
    }

    @ObfuscatedName("x.et(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method12(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field310 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field310 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field310 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field310 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field310 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field304 != null) {
            var3 = "/p=" + Statics.field304;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field429 + "/a=" + Statics.field45 + var3 + "/";
    }

    @ObfuscatedName("b.ed(Ljava/lang/String;I)V")
    public static void method196(String arg0) {
        Statics.field304 = arg0;
        try {
            String var1 = Statics.field557.getParameter(class215.field3166.field3178);
            String var2 = Statics.field557.getParameter(class215.field3176.field3178);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class163.method1918(class156.method1898() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field557;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("dt.ea(Ljava/lang/String;ZI)V")
    public static void method2017(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3218; var5++) {
            class199 var6 = class199.method973(var5);
            if ((!arg1 || var6.field2999) && var6.field2992 == -1 && var6.field2960.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1856 = -1;
                    Statics.field839 = null;
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
        Statics.field839 = var3;
        Statics.field2768 = 0;
        Statics.field1856 = var4;
        String[] var9 = new String[Statics.field1856];
        for (int var10 = 0; var10 < Statics.field1856; var10++) {
            var9[var10] = class199.method973(var3[var10]).field2960;
        }
        class151.method1440(var9, Statics.field839);
    }

    @ObfuscatedName("cv.ez([BII)V")
    public static void method1917(byte[] arg0, int arg1) {
        if (field327 == null) {
            field327 = new byte[24];
        }
        class164.method3019(arg0, arg1, field327, 0, 24);
    }

    @ObfuscatedName("de.er(Leq;I)V")
    public static void method2054(class154 arg0) {
        if (field327 != null) {
            arg0.method2695(field327, 0, field327.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class105.field1690.method1386(0L);
            class105.field1690.method1388(var1);
            int var2;
            for (var2 = 0; var2 < 24 && var1[var2] == 0; var2++) {
            }
            if (var2 >= 24) {
                throw new IOException();
            }
        } catch (Exception var7) {
            for (int var4 = 0; var4 < 24; var4++) {
                var1[var4] = -1;
            }
        }
        arg0.method2695(var1, 0, var1.length);
    }
}

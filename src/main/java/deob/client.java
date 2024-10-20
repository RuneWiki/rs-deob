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

public final class client extends class139 {

    @ObfuscatedName("client.l")
    public static boolean field493 = true;

    @ObfuscatedName("client.w")
    public static class223[] field511 = new class223[4];

    @ObfuscatedName("client.d")
    public static int field397 = 1;

    @ObfuscatedName("client.f")
    public static int field302 = 0;

    @ObfuscatedName("client.a")
    public static int field398 = 0;

    @ObfuscatedName("client.m")
    public static boolean field306 = false;

    @ObfuscatedName("client.e")
    public static boolean field307 = false;

    @ObfuscatedName("client.v")
    public static int field376 = 0;

    @ObfuscatedName("client.n")
    public static int field310 = 0;

    @ObfuscatedName("client.h")
    public static boolean field311 = true;

    @ObfuscatedName("client.p")
    public static int field477 = 0;

    @ObfuscatedName("client.c")
    public static long field313 = 1L;

    @ObfuscatedName("client.b")
    public static int field314 = -1;

    @ObfuscatedName("client.k")
    public static int field315 = -1;

    @ObfuscatedName("client.at")
    public static int field316 = -1;

    @ObfuscatedName("client.au")
    public static boolean field531 = true;

    @ObfuscatedName("client.aa")
    public static boolean field318 = false;

    @ObfuscatedName("client.ak")
    public static int field319 = 0;

    @ObfuscatedName("client.an")
    public static int field490 = 0;

    @ObfuscatedName("client.ad")
    public static int field321 = 0;

    @ObfuscatedName("client.ap")
    public static int field322 = 0;

    @ObfuscatedName("client.ag")
    public static int field505 = 0;

    @ObfuscatedName("client.aj")
    public static int field463 = 0;

    @ObfuscatedName("client.av")
    public static int field510 = 0;

    @ObfuscatedName("client.ar")
    public static int field326 = 0;

    @ObfuscatedName("client.ab")
    public static int field327 = 0;

    @ObfuscatedName("client.ai")
    public static class114 field465 = new class114(new byte[5000]);

    @ObfuscatedName("client.aw")
    public static class20 field329 = class20.field584;

    @ObfuscatedName("client.al")
    public static int field330 = 0;

    @ObfuscatedName("client.am")
    public static int field331 = 0;

    @ObfuscatedName("client.ay")
    public static int field332 = 0;

    @ObfuscatedName("client.bn")
    public static int field333 = 0;

    @ObfuscatedName("client.bb")
    public static int field334 = 0;

    @ObfuscatedName("client.bu")
    public static int field317 = 0;

    @ObfuscatedName("client.by")
    public static int field336 = 0;

    @ObfuscatedName("client.bt")
    public static int field337 = 0;

    @ObfuscatedName("client.cl")
    public static class33[] field573 = new class33[32768];

    @ObfuscatedName("client.cs")
    public static int field340 = 0;

    @ObfuscatedName("client.ca")
    public static int[] field341 = new int[32768];

    @ObfuscatedName("client.ce")
    public static class117 field342 = new class117(5000);

    @ObfuscatedName("client.ch")
    public static class117 field486 = new class117(5000);

    @ObfuscatedName("client.cq")
    public static class117 field344 = new class117(5000);

    @ObfuscatedName("client.cu")
    public static int field345 = 0;

    @ObfuscatedName("client.cv")
    public static int field346 = 0;

    @ObfuscatedName("client.ct")
    public static int field512 = 0;

    @ObfuscatedName("client.cn")
    public static int field343 = 0;

    @ObfuscatedName("client.cj")
    public static int field335 = 0;

    @ObfuscatedName("client.cf")
    public static int field350 = 0;

    @ObfuscatedName("client.ck")
    public static int field405 = 0;

    @ObfuscatedName("client.cx")
    public static int field352 = 0;

    @ObfuscatedName("client.co")
    public static boolean field434 = false;

    @ObfuscatedName("client.dd")
    public static int field324 = 0;

    @ObfuscatedName("client.dn")
    public static int field355 = 0;

    @ObfuscatedName("client.da")
    public static int field356 = 1;

    @ObfuscatedName("client.dh")
    public static int field357 = 0;

    @ObfuscatedName("client.dp")
    public static int field358 = 1;

    @ObfuscatedName("client.db")
    public static int field432 = 0;

    @ObfuscatedName("client.df")
    public static boolean field361 = false;

    @ObfuscatedName("client.dz")
    public static int[][][] field312 = new int[4][13][13];

    @ObfuscatedName("client.di")
    public static final int[] field363 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dc")
    public static int field364 = 0;

    @ObfuscatedName("client.dt")
    public static int field365 = 2;

    @ObfuscatedName("client.dx")
    public static int field366 = 0;

    @ObfuscatedName("client.dg")
    public static int field367 = 2;

    @ObfuscatedName("client.dw")
    public static int field368 = 0;

    @ObfuscatedName("client.dk")
    public static int field369 = 1;

    @ObfuscatedName("client.eq")
    public static int field370 = 0;

    @ObfuscatedName("client.es")
    public static int field371 = 0;

    @ObfuscatedName("client.ew")
    public static int field483 = 2;

    @ObfuscatedName("client.ea")
    public static int field373 = 0;

    @ObfuscatedName("client.ep")
    public static int field526 = 1;

    @ObfuscatedName("client.ef")
    public static int field375 = 0;

    @ObfuscatedName("client.eo")
    public static int field430 = 0;

    @ObfuscatedName("client.ev")
    public static int field583 = 2301979;

    @ObfuscatedName("client.ei")
    public static int field421 = 5063219;

    @ObfuscatedName("client.ee")
    public static int field424 = 3353893;

    @ObfuscatedName("client.ey")
    public static int field380 = 7759444;

    @ObfuscatedName("client.ek")
    public static boolean field475 = false;

    @ObfuscatedName("client.eu")
    public static int field382 = 0;

    @ObfuscatedName("client.fc")
    public static int field394 = 128;

    @ObfuscatedName("client.fu")
    public static int field574 = 0;

    @ObfuscatedName("client.fm")
    public static int field516 = 0;

    @ObfuscatedName("client.ff")
    public static int field386 = 0;

    @ObfuscatedName("client.fy")
    public static int field387 = 0;

    @ObfuscatedName("client.fo")
    public static int field388 = 0;

    @ObfuscatedName("client.fd")
    public static int field420 = 0;

    @ObfuscatedName("client.fr")
    public static boolean field362 = false;

    @ObfuscatedName("client.fl")
    public static int field506 = 0;

    @ObfuscatedName("client.fp")
    public static int field392 = 0;

    @ObfuscatedName("client.fx")
    public static int field435 = 50;

    @ObfuscatedName("client.fq")
    public static int[] field351 = new int[field435];

    @ObfuscatedName("client.fg")
    public static int[] field395 = new int[field435];

    @ObfuscatedName("client.fj")
    public static int[] field396 = new int[field435];

    @ObfuscatedName("client.fa")
    public static int[] field422 = new int[field435];

    @ObfuscatedName("client.ft")
    public static int[] field438 = new int[field435];

    @ObfuscatedName("client.fe")
    public static int[] field399 = new int[field435];

    @ObfuscatedName("client.fn")
    public static int[] field300 = new int[field435];

    @ObfuscatedName("client.fs")
    public static String[] field562 = new String[field435];

    @ObfuscatedName("client.gf")
    public static int[][] field402 = new int[104][104];

    @ObfuscatedName("client.gw")
    public static int field403 = 0;

    @ObfuscatedName("client.gh")
    public static int field404 = -1;

    @ObfuscatedName("client.gd")
    public static int field471 = -1;

    @ObfuscatedName("client.gk")
    public static int field406 = 0;

    @ObfuscatedName("client.gp")
    public static int field407 = 0;

    @ObfuscatedName("client.ga")
    public static int field408 = 0;

    @ObfuscatedName("client.gb")
    public static int field460 = 0;

    @ObfuscatedName("client.gn")
    public static int field328 = 0;

    @ObfuscatedName("client.gg")
    public static int field411 = 0;

    @ObfuscatedName("client.ge")
    public static int field412 = 0;

    @ObfuscatedName("client.gc")
    public static int field413 = 0;

    @ObfuscatedName("client.gt")
    public static int field414 = 0;

    @ObfuscatedName("client.gm")
    public static int field393 = 0;

    @ObfuscatedName("client.gy")
    public static boolean field303 = false;

    @ObfuscatedName("client.gv")
    public static int field452 = 0;

    @ObfuscatedName("client.gz")
    public static int field418 = 0;

    @ObfuscatedName("client.gl")
    public static class3[] field419 = new class3[2048];

    @ObfuscatedName("client.go")
    public static int field409 = 0;

    @ObfuscatedName("client.gj")
    public static int[] field447 = new int[2048];

    @ObfuscatedName("client.gs")
    public static int field347 = 0;

    @ObfuscatedName("client.ht")
    public static int[] field423 = new int[2048];

    @ObfuscatedName("client.hc")
    public static class114[] field575 = new class114[2048];

    @ObfuscatedName("client.hf")
    public static int field425 = -1;

    @ObfuscatedName("client.hp")
    public static int field426 = 0;

    @ObfuscatedName("client.hr")
    public static int field427 = 0;

    @ObfuscatedName("client.hh")
    public static int[] field428 = new int[1000];

    @ObfuscatedName("client.hy")
    public static final int[] field429 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hg")
    public static String[] field485 = new String[8];

    @ObfuscatedName("client.hz")
    public static boolean[] field431 = new boolean[8];

    @ObfuscatedName("client.hd")
    public static int[] field487 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hl")
    public static int field433 = -1;

    @ObfuscatedName("client.hi")
    public static class193[][][] field391 = new class193[4][104][104];

    @ObfuscatedName("client.hs")
    public static class193 field581 = new class193();

    @ObfuscatedName("client.ho")
    public static class193 field436 = new class193();

    @ObfuscatedName("client.hj")
    public static class193 field437 = new class193();

    @ObfuscatedName("client.hn")
    public static int[] field445 = new int[25];

    @ObfuscatedName("client.hv")
    public static int[] field348 = new int[25];

    @ObfuscatedName("client.hm")
    public static int[] field440 = new int[25];

    @ObfuscatedName("client.hq")
    public static int field441 = 0;

    @ObfuscatedName("client.hu")
    public static boolean field559 = false;

    @ObfuscatedName("client.in")
    public static int field443 = 0;

    @ObfuscatedName("client.iy")
    public static int[] field444 = new int[500];

    @ObfuscatedName("client.il")
    public static int[] field381 = new int[500];

    @ObfuscatedName("client.if")
    public static int[] field446 = new int[500];

    @ObfuscatedName("client.ij")
    public static int[] field459 = new int[500];

    @ObfuscatedName("client.ia")
    public static String[] field448 = new String[500];

    @ObfuscatedName("client.id")
    public static String[] field449 = new String[500];

    @ObfuscatedName("client.ig")
    public static int field491 = -1;

    @ObfuscatedName("client.iq")
    public static int field451 = -1;

    @ObfuscatedName("client.ie")
    public static int field359 = 0;

    @ObfuscatedName("client.io")
    public static int field453 = 50;

    @ObfuscatedName("client.iu")
    public static int field454 = 0;

    @ObfuscatedName("client.it")
    public static String field455 = null;

    @ObfuscatedName("client.iv")
    public static boolean field456 = false;

    @ObfuscatedName("client.ii")
    public static int field457 = -1;

    @ObfuscatedName("client.ik")
    public static int field400 = -1;

    @ObfuscatedName("client.jo")
    public static String field301 = null;

    @ObfuscatedName("client.jc")
    public static String field353 = null;

    @ObfuscatedName("client.jj")
    public static int field461 = -1;

    @ObfuscatedName("client.jz")
    public static class190 field462 = new class190(8);

    @ObfuscatedName("client.js")
    public static int field450 = 0;

    @ObfuscatedName("client.jy")
    public static int field354 = 0;

    @ObfuscatedName("client.jk")
    public static class167 field360 = null;

    @ObfuscatedName("client.jf")
    public static int field466 = 0;

    @ObfuscatedName("client.jv")
    public static int field467 = 0;

    @ObfuscatedName("client.jd")
    public static int field468 = 0;

    @ObfuscatedName("client.jq")
    public static int field469 = -1;

    @ObfuscatedName("client.jt")
    public static boolean field470 = false;

    @ObfuscatedName("client.jr")
    public static boolean field339 = false;

    @ObfuscatedName("client.jl")
    public static boolean field472 = false;

    @ObfuscatedName("client.ji")
    public static class167 field473 = null;

    @ObfuscatedName("client.ju")
    public static class167 field474 = null;

    @ObfuscatedName("client.ja")
    public static class167 field518 = null;

    @ObfuscatedName("client.jp")
    public static int field476 = 0;

    @ObfuscatedName("client.jh")
    public static int field464 = 0;

    @ObfuscatedName("client.jn")
    public static class167 field478 = null;

    @ObfuscatedName("client.jb")
    public static boolean field479 = false;

    @ObfuscatedName("client.jx")
    public static int field480 = -1;

    @ObfuscatedName("client.jg")
    public static int field481 = -1;

    @ObfuscatedName("client.jw")
    public static boolean field482 = false;

    @ObfuscatedName("client.jm")
    public static int field519 = -1;

    @ObfuscatedName("client.je")
    public static int field484 = -1;

    @ObfuscatedName("client.kt")
    public static boolean field552 = false;

    @ObfuscatedName("client.ka")
    public static int field385 = 1;

    @ObfuscatedName("client.kn")
    public static int[] field565 = new int[32];

    @ObfuscatedName("client.kz")
    public static int field488 = 0;

    @ObfuscatedName("client.ky")
    public static int[] field489 = new int[32];

    @ObfuscatedName("client.kr")
    public static int field378 = 0;

    @ObfuscatedName("client.ks")
    public static int[] field390 = new int[32];

    @ObfuscatedName("client.kd")
    public static int field492 = 0;

    @ObfuscatedName("client.kk")
    public static int field416 = 0;

    @ObfuscatedName("client.kh")
    public static int field494 = 0;

    @ObfuscatedName("client.ko")
    public static int field495 = 0;

    @ObfuscatedName("client.kp")
    public static int field496 = 0;

    @ObfuscatedName("client.ke")
    public static int field497 = 0;

    @ObfuscatedName("client.kq")
    public static int field498 = 0;

    @ObfuscatedName("client.kl")
    public static int field502 = 0;

    @ObfuscatedName("client.ki")
    public static class193 field500 = new class193();

    @ObfuscatedName("client.kc")
    public static class193 field501 = new class193();

    @ObfuscatedName("client.kx")
    public static class193 field458 = new class193();

    @ObfuscatedName("client.ly")
    public static class190 field503 = new class190(512);

    @ObfuscatedName("client.lh")
    public static int field504 = 0;

    @ObfuscatedName("client.le")
    public static int field535 = -2;

    @ObfuscatedName("client.lq")
    public static boolean[] field379 = new boolean[100];

    @ObfuscatedName("client.ld")
    public static boolean[] field507 = new boolean[100];

    @ObfuscatedName("client.lx")
    public static boolean[] field508 = new boolean[100];

    @ObfuscatedName("client.lv")
    public static int[] field509 = new int[100];

    @ObfuscatedName("client.lr")
    public static int[] field542 = new int[100];

    @ObfuscatedName("client.lw")
    public static int[] field528 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field541 = new int[100];

    @ObfuscatedName("client.ls")
    public static int field308 = 0;

    @ObfuscatedName("client.lp")
    public static long field514 = 0L;

    @ObfuscatedName("client.lt")
    public static boolean field515 = true;

    @ObfuscatedName("client.lm")
    public static int field389 = 1;

    @ObfuscatedName("client.ll")
    public static int field517 = 503;

    @ObfuscatedName("client.lu")
    public static int[] field415 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lf")
    public static int field384 = 0;

    @ObfuscatedName("client.lo")
    public static int field520 = 0;

    @ObfuscatedName("client.lk")
    public static String field521 = "";

    @ObfuscatedName("client.my")
    public static long[] field522 = new long[100];

    @ObfuscatedName("client.mh")
    public static int field523 = 0;

    @ObfuscatedName("client.mg")
    public static int field524 = 0;

    @ObfuscatedName("client.mj")
    public static int[] field377 = new int[128];

    @ObfuscatedName("client.mq")
    public static int[] field560 = new int[128];

    @ObfuscatedName("client.mm")
    public static long field527 = -1L;

    @ObfuscatedName("client.md")
    public static String field439 = null;

    @ObfuscatedName("client.me")
    public static String field529 = null;

    @ObfuscatedName("client.mt")
    public static int field530 = -1;

    @ObfuscatedName("client.ms")
    public static int field383 = 0;

    @ObfuscatedName("client.ma")
    public static int[] field532 = new int[1000];

    @ObfuscatedName("client.mv")
    public static int[] field533 = new int[1000];

    @ObfuscatedName("client.mi")
    public static class77[] field563 = new class77[1000];

    @ObfuscatedName("client.mz")
    public static int field513 = 0;

    @ObfuscatedName("client.ml")
    public static int field536 = 0;

    @ObfuscatedName("client.np")
    public static int field537 = 0;

    @ObfuscatedName("client.nv")
    public static int field538 = 255;

    @ObfuscatedName("client.nj")
    public static int field539 = -1;

    @ObfuscatedName("client.nk")
    public static boolean field540 = false;

    @ObfuscatedName("client.nu")
    public static int field558 = 127;

    @ObfuscatedName("client.ns")
    public static int field525 = 127;

    @ObfuscatedName("client.nf")
    public static int field544 = 0;

    @ObfuscatedName("client.nw")
    public static int[] field545 = new int[50];

    @ObfuscatedName("client.nb")
    public static int[] field546 = new int[50];

    @ObfuscatedName("client.nz")
    public static int[] field547 = new int[50];

    @ObfuscatedName("client.nn")
    public static int[] field548 = new int[50];

    @ObfuscatedName("client.nc")
    public static class57[] field549 = new class57[50];

    @ObfuscatedName("client.ny")
    public static boolean field550 = false;

    @ObfuscatedName("client.oz")
    public static boolean[] field551 = new boolean[5];

    @ObfuscatedName("client.oo")
    public static int[] field442 = new int[5];

    @ObfuscatedName("client.oe")
    public static int[] field372 = new int[5];

    @ObfuscatedName("client.oc")
    public static int[] field554 = new int[5];

    @ObfuscatedName("client.ov")
    public static int[] field555 = new int[5];

    @ObfuscatedName("client.oj")
    public static short field556 = 256;

    @ObfuscatedName("client.ok")
    public static short field349 = 205;

    @ObfuscatedName("client.oq")
    public static short field499 = 256;

    @ObfuscatedName("client.oi")
    public static short field410 = 320;

    @ObfuscatedName("client.od")
    public static short field570 = 1;

    @ObfuscatedName("client.ot")
    public static short field561 = 32767;

    @ObfuscatedName("client.ou")
    public static short field553 = 1;

    @ObfuscatedName("client.of")
    public static short field325 = 32767;

    @ObfuscatedName("client.op")
    public static int field564 = 0;

    @ObfuscatedName("client.oy")
    public static int field557 = 0;

    @ObfuscatedName("client.oh")
    public static int field566 = 0;

    @ObfuscatedName("client.ob")
    public static int field567 = 0;

    @ObfuscatedName("client.ox")
    public static int field568 = 0;

    @ObfuscatedName("client.ow")
    public static int field374 = 0;

    @ObfuscatedName("client.os")
    public static int field534 = 0;

    @ObfuscatedName("client.og")
    public static class17[] field417 = new class17[400];

    @ObfuscatedName("client.px")
    public static class189 field572 = new class189();

    @ObfuscatedName("client.ph")
    public static int field571 = 0;

    @ObfuscatedName("client.pa")
    public static class8[] field304 = new class8[400];

    @ObfuscatedName("client.po")
    public static class173 field569 = new class173();

    @ObfuscatedName("client.pm")
    public static int field576 = -1;

    @ObfuscatedName("client.pn")
    public static int field577 = -1;

    @ObfuscatedName("client.pw")
    public static class214[] field578 = new class214[8];

    @ObfuscatedName("client.pz")
    public static long field579 = -1L;

    @ObfuscatedName("client.pv")
    public static long field580 = -1L;

    @ObfuscatedName("client.y(I)V")
    public final void method391() {
    }

    public final void init() {
        if (!this.method2792()) {
            return;
        }
        class184[] var1 = class184.method2909();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class184 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2982);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2982)) {
                    case 2:
                        Statics.field217 = var4;
                        break;
                    case 3:
                        Statics.field305 = (class148) class104.method631(class148.method2269(), Integer.parseInt(var4));
                        if (Statics.field305 == class148.field2197) {
                            Statics.field87 = class206.field3068;
                        } else {
                            Statics.field87 = class206.field3067;
                        }
                    case 4:
                    case 12:
                    default:
                        break;
                    case 5:
                        int var5 = Integer.parseInt(var4);
                        class147[] var6 = new class147[] { class147.field2188, class147.field2181, class147.field2182, class147.field2186 };
                        class147[] var7 = var6;
                        int var8 = 0;
                        class147 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class147 var9 = var7[var8];
                            if (var9.field2185 == var5) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field323 = var10;
                        break;
                    case 6:
                        Statics.field1930 = Integer.parseInt(var4);
                        break;
                    case 7:
                        field397 = Integer.parseInt(var4);
                        break;
                    case 8:
                        if (var4.equalsIgnoreCase(class2.field36)) {
                            field306 = true;
                        } else {
                            field306 = false;
                        }
                        break;
                    case 9:
                        Statics.field309 = var4;
                        break;
                    case 10:
                        if (var4.equalsIgnoreCase(class2.field36)) {
                        }
                        break;
                    case 11:
                        field398 = Integer.parseInt(var4);
                        break;
                    case 13:
                        field302 = Integer.parseInt(var4);
                        break;
                    case 14:
                        field376 = Integer.parseInt(var4);
                        break;
                    case 15:
                        Statics.field2223 = Integer.parseInt(var4);
                }
            }
        }
        method84();
        Statics.field1060 = this.getCodeBase().getHost();
        String var11 = Statics.field323.field2184;
        byte var12 = 0;
        try {
            class144.method127("oldschool", var11, var12, 16);
        } catch (Exception var14) {
            class143.method1973((String) null, var14);
        }
        Statics.field2072 = this;
        this.method2790(765, 503, 88);
    }

    @ObfuscatedName("d.l(I)V")
    public static final void method84() {
        class84.field1422 = false;
        field307 = false;
    }

    @ObfuscatedName("client.w(B)V")
    public final void method347() {
        Statics.field338 = field398 == 0 ? 43594 : field397 + 40000;
        Statics.field2547 = field398 == 0 ? 443 : field397 + 50000;
        Statics.field771 = Statics.field338;
        Statics.field2844 = class168.field2809;
        Statics.field2845 = class168.field2811;
        Statics.field2068 = class168.field2810;
        Statics.field2846 = class168.field2812;
        if (Statics.field2829.toLowerCase().indexOf("microsoft") == -1) {
            class132.field2016[44] = 71;
            class132.field2016[45] = 26;
            class132.field2016[46] = 72;
            class132.field2016[47] = 73;
            class132.field2016[59] = 57;
            class132.field2016[61] = 27;
            class132.field2016[91] = 42;
            class132.field2016[92] = 74;
            class132.field2016[93] = 43;
            class132.field2016[192] = 28;
            class132.field2016[222] = 58;
            class132.field2016[520] = 59;
        } else {
            class132.field2016[186] = 57;
            class132.field2016[187] = 27;
            class132.field2016[188] = 71;
            class132.field2016[189] = 26;
            class132.field2016[190] = 72;
            class132.field2016[191] = 73;
            class132.field2016[192] = 58;
            class132.field2016[219] = 42;
            class132.field2016[220] = 74;
            class132.field2016[221] = 43;
            class132.field2016[222] = 59;
            class132.field2016[223] = 28;
        }
        Canvas var1 = Statics.field1706;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class132.field2013);
        var1.addFocusListener(class132.field2013);
        class135.method2688(Statics.field1706);
        Statics.field175 = class126.method841();
        if (Statics.field175 != null) {
            Statics.field175.method2652(Statics.field1706);
        }
        Statics.field2815 = new class129(255, class144.field2145, class144.field2138, 500000);
        Statics.field1870 = class9.method2570();
        Statics.field320 = this.getToolkit().getSystemClipboard();
        String var3 = Statics.field2092;
        class133.field2030 = this;
        class133.field2021 = var3;
        if (field398 != 0) {
            field318 = true;
        }
        method901(Statics.field1870.field148);
    }

    @ObfuscatedName("client.d(I)V")
    public final void method234() {
        field477++;
        this.method237();
        while (true) {
            class193 var1 = class164.field2634;
            class163 var2;
            synchronized (class164.field2634) {
                var2 = (class163) class164.field2633.method3488();
            }
            if (var2 == null) {
                try {
                    if (class177.field2885 == 1) {
                        int var4 = Statics.field2563.method3362();
                        if (var4 > 0 && Statics.field2563.method3318()) {
                            int var5 = var4 - Statics.field2881;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2563.method3311(var5);
                        } else {
                            Statics.field2563.method3350();
                            Statics.field2563.method3326();
                            if (Statics.field2882 == null) {
                                class177.field2885 = 0;
                            } else {
                                class177.field2885 = 2;
                            }
                            Statics.field2884 = null;
                            Statics.field1922 = null;
                        }
                    }
                } catch (Exception var9) {
                    var9.printStackTrace();
                    Statics.field2563.method3350();
                    class177.field2885 = 0;
                    Statics.field2884 = null;
                    Statics.field1922 = null;
                    Statics.field2882 = null;
                }
                method1017();
                class132.method2272();
                Statics.method152();
                if (Statics.field175 != null) {
                    int var7 = Statics.field175.method2647();
                    field502 = var7;
                }
                if (field310 == 0) {
                    method2892();
                    class139.method2163();
                } else if (field310 == 5) {
                    class31.method2569(this);
                    method2892();
                    class139.method2163();
                } else if (field310 == 10 || field310 == 11) {
                    class31.method2569(this);
                } else if (field310 == 20) {
                    class31.method2569(this);
                    method34();
                } else if (field310 == 25) {
                    method1585();
                }
                if (field310 == 30) {
                    method569();
                } else if (field310 == 40 || field310 == 45) {
                    method34();
                }
                return;
            }
            var2.field2626.method3060(var2.field2625, (int) var2.field3043, var2.field2627, false);
        }
    }

    @ObfuscatedName("client.f(B)V")
    public final void method235() {
        boolean var1 = Statics.method1102();
        if (var1 && field540 && Statics.field543 != null) {
            Statics.field543.method1193();
        }
        if (field310 == 10 || field310 == 20 || field310 == 30) {
            if (field514 != 0L && Statics.method2875() > field514) {
                method901(method563());
            } else if (field2096) {
                method2519();
            }
        }
        Dimension var2 = this.method2802();
        if (Statics.field1705 != var2.width || Statics.field698 != var2.height || field2110) {
            method591();
            field514 = Statics.method2875() + 500L;
            field2110 = false;
        }
        boolean var3 = false;
        if (field2101) {
            field2101 = false;
            var3 = true;
            for (int var4 = 0; var4 < 100; var4++) {
                field379[var4] = true;
            }
        }
        if (var3) {
            method646();
        }
        if (field310 == 0) {
            int var5 = class31.field736;
            String var6 = class31.field737;
            Color var7 = null;
            try {
                Graphics var8 = Statics.field1706.getGraphics();
                if (Statics.field296 == null) {
                    Statics.field296 = new Font("Helvetica", 1, 13);
                    Statics.field752 = Statics.field1706.getFontMetrics(Statics.field296);
                }
                if (var3) {
                    var8.setColor(Color.black);
                    var8.fillRect(0, 0, Statics.field2066, Statics.field2056);
                }
                if (var7 == null) {
                    var7 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1614 == null) {
                        Statics.field1614 = Statics.field1706.createImage(304, 34);
                    }
                    Graphics var9 = Statics.field1614.getGraphics();
                    var9.setColor(var7);
                    var9.drawRect(0, 0, 303, 33);
                    var9.fillRect(2, 2, var5 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(1, 1, 301, 31);
                    var9.fillRect(var5 * 3 + 2, 2, 300 - var5 * 3, 30);
                    var9.setFont(Statics.field296);
                    var9.setColor(Color.white);
                    var9.drawString(var6, (304 - Statics.field752.stringWidth(var6)) / 2, 22);
                    var8.drawImage(Statics.field1614, Statics.field2066 / 2 - 152, Statics.field2056 / 2 - 18, (ImageObserver) null);
                } catch (Exception var29) {
                    int var11 = Statics.field2066 / 2 - 152;
                    int var12 = Statics.field2056 / 2 - 18;
                    var8.setColor(var7);
                    var8.drawRect(var11, var12, 303, 33);
                    var8.fillRect(var11 + 2, var12 + 2, var5 * 3, 30);
                    var8.setColor(Color.black);
                    var8.drawRect(var11 + 1, var12 + 1, 301, 31);
                    var8.fillRect(var5 * 3 + var11 + 2, var12 + 2, 300 - var5 * 3, 30);
                    var8.setFont(Statics.field296);
                    var8.setColor(Color.white);
                    var8.drawString(var6, var11 + (304 - Statics.field752.stringWidth(var6)) / 2, var12 + 22);
                }
            } catch (Exception var30) {
                Statics.field1706.repaint();
            }
        } else if (field310 == 5) {
            class31.method2274(Statics.field299, Statics.field647, Statics.field2826, var3);
        } else if (field310 == 10 || field310 == 11) {
            class31.method2274(Statics.field299, Statics.field647, Statics.field2826, var3);
        } else if (field310 == 20) {
            class31.method2274(Statics.field299, Statics.field647, Statics.field2826, var3);
        } else if (field310 == 25) {
            if (field432 == 1) {
                if (field355 > field356) {
                    field356 = field355;
                }
                int var14 = (field356 * 50 - field355 * 50) / field356;
                Statics.method28(class151.field2497 + class2.field26 + class2.field20 + var14 + "%" + class2.field37, false);
            } else if (field432 == 2) {
                if (field357 > field358) {
                    field358 = field357;
                }
                int var15 = (field358 * 50 - field357 * 50) / field358 + 50;
                Statics.method28(class151.field2497 + class2.field26 + class2.field20 + var15 + "%" + class2.field37, false);
            } else {
                Statics.method28(class151.field2497, false);
            }
        } else if (field310 == 30) {
            if (field461 != -1) {
                method170(field461);
            }
            for (int var16 = 0; var16 < field504; var16++) {
                if (field379[var16]) {
                    field507[var16] = true;
                }
                field508[var16] = field379[var16];
                field379[var16] = false;
            }
            field535 = field477;
            field491 = -1;
            field451 = -1;
            Statics.field901 = null;
            if (field461 != -1) {
                field504 = 0;
                method812(field461, 0, 0, Statics.field2066, Statics.field2056, 0, 0, -1);
            }
            class78.method1710();
            if (field559) {
                method2052();
            } else if (field491 != -1) {
                int var17 = field491;
                int var18 = field451;
                if (field443 >= 2 || field454 != 0 || field456) {
                    String var19;
                    if (field454 == 1 && field443 < 2) {
                        var19 = class151.field2379 + class151.field2389 + field455 + " " + class2.field25;
                    } else if (field456 && field443 < 2) {
                        var19 = field301 + class151.field2389 + field353 + " " + class2.field25;
                    } else {
                        int var20 = field443 - 1;
                        String var21;
                        if (field449[var20].length() > 0) {
                            var21 = field448[var20] + class151.field2389 + field449[var20];
                        } else {
                            var21 = field448[var20];
                        }
                        var19 = var21;
                    }
                    if (field443 > 2) {
                        var19 = var19 + class2.method3393(16777215) + " " + '/' + " " + (field443 - 2) + class151.field2383;
                    }
                    Statics.field299.method3672(var19, var17 + 4, var18 + 15, 16777215, 0, field477 / 1000);
                }
            }
            if (field308 == 3) {
                for (int var22 = 0; var22 < field504; var22++) {
                    if (field508[var22]) {
                        class78.method1716(field509[var22], field542[var22], field528[var22], field541[var22], 16711935, 128);
                    } else if (field507[var22]) {
                        class78.method1716(field509[var22], field542[var22], field528[var22], field541[var22], 16711680, 128);
                    }
                }
            }
            class23.method24(Statics.field3101, Statics.field143.field814, Statics.field143.field821, field430);
            field430 = 0;
        } else if (field310 == 40) {
            Statics.method28(class151.field2302 + class2.field26 + class151.field2240, false);
        } else if (field310 == 45) {
            Statics.method28(class151.field2387, false);
        }
        if (field310 == 30 && field308 == 0 && !var3) {
            try {
                Graphics var23 = Statics.field1706.getGraphics();
                for (int var24 = 0; var24 < field504; var24++) {
                    if (field507[var24]) {
                        Statics.field1877.method1553(var23, field509[var24], field542[var24], field528[var24], field541[var24]);
                        field507[var24] = false;
                    }
                }
            } catch (Exception var32) {
                Statics.field1706.repaint();
            }
        } else if (field310 > 0) {
            try {
                Graphics var26 = Statics.field1706.getGraphics();
                Statics.field1877.method1552(var26, 0, 0);
                for (int var27 = 0; var27 < field504; var27++) {
                    field507[var27] = false;
                }
            } catch (Exception var31) {
                Statics.field1706.repaint();
            }
        }
    }

    @ObfuscatedName("client.i(I)V")
    public final void method236() {
        if (Statics.field15.method213()) {
            Statics.field15.method195();
        }
        if (Statics.field167 != null) {
            Statics.field167.field203 = false;
        }
        Statics.field167 = null;
        if (Statics.field2150 != null) {
            Statics.field2150.method2781();
            Statics.field2150 = null;
        }
        if (class132.field2013 != null) {
            class132 var1 = class132.field2013;
            synchronized (class132.field2013) {
                class132.field2013 = null;
            }
        }
        class135.method15();
        Statics.field175 = null;
        if (Statics.field543 != null) {
            Statics.field543.method1211();
        }
        if (Statics.field682 != null) {
            Statics.field682.method1211();
        }
        class165.method694();
        Object var3 = class164.field2632;
        synchronized (class164.field2632) {
            if (class164.field2630 != 0) {
                class164.field2630 = 1;
                try {
                    class164.field2632.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        try {
            class144.field2145.method3777();
            for (int var6 = 0; var6 < Statics.field2139; var6++) {
                Statics.field2143[var6].method3777();
            }
            class144.field2138.method3777();
            class144.field2136.method3777();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("cg.a(IB)V")
    public static void method2157(int arg0) {
        if (field310 == arg0) {
            return;
        }
        if (field310 == 0) {
            Statics.field1614 = null;
            Statics.field296 = null;
            Statics.field752 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field334 = 0;
            field317 = 0;
            field336 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field696 != null) {
            Statics.field696.method2781();
            Statics.field696 = null;
        }
        if (field310 == 25) {
            field432 = 0;
            field355 = 0;
            field356 = 1;
            field357 = 0;
            field358 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class31.method916(Statics.field1706, Statics.field2822, Statics.field246, true, 0);
        } else if (arg0 == 20) {
            class31.method916(Statics.field1706, Statics.field2822, Statics.field246, true, field310 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class31.method916(Statics.field1706, Statics.field2822, Statics.field246, false, 4);
        } else if (Statics.field754) {
            Statics.field740 = null;
            Statics.field717 = null;
            Statics.field718 = null;
            Statics.field738 = null;
            Statics.field720 = null;
            Statics.field721 = null;
            Statics.field679 = null;
            Statics.field2208 = null;
            Statics.field722 = null;
            Statics.field279 = null;
            Statics.field750 = null;
            Statics.field2090 = null;
            Statics.field1188 = null;
            Statics.field2611 = null;
            Statics.field744 = null;
            Statics.field71 = null;
            Statics.field1070 = null;
            Statics.field1738 = null;
            Statics.field695 = null;
            Statics.field163 = null;
            Statics.field225 = null;
            Statics.field731 = null;
            class177.method2886(2);
            class165.method2766(true);
            Statics.field754 = false;
        }
        field310 = arg0;
    }

    @ObfuscatedName("client.o(I)V")
    public void method237() {
        if (field310 == 1000) {
            return;
        }
        long var1 = Statics.method2875();
        int var3 = (int) (var1 - Statics.field2639);
        Statics.field2639 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class165.field2637 += var3;
        boolean var4;
        if (class165.field2648 == 0 && class165.field2638 == 0 && class165.field2646 == 0 && class165.field2641 == 0) {
            var4 = true;
        } else if (Statics.field2655 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class165.field2637 > 30000) {
                        throw new IOException();
                    }
                    while (class165.field2638 < 20 && class165.field2641 > 0) {
                        class166 var5 = (class166) class165.field2640.method3462();
                        class114 var6 = new class114(4);
                        var6.method2307(1);
                        var6.method2309((int) var5.field3043);
                        Statics.field2655.method2779(var6.field1891, 0, 4);
                        class165.field2653.method3463(var5, var5.field3043);
                        class165.field2641--;
                        class165.field2638++;
                    }
                    while (class165.field2648 < 20 && class165.field2646 > 0) {
                        class166 var7 = (class166) class165.field2644.method3536();
                        class114 var8 = new class114(4);
                        var8.method2307(0);
                        var8.method2309((int) var7.field3043);
                        Statics.field2655.method2779(var8.field1891, 0, 4);
                        var7.method3552();
                        class165.field2647.method3463(var7, var7.field3043);
                        class165.field2646--;
                        class165.field2648++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2655.method2776();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class165.field2637 = 0;
                        byte var11 = 0;
                        if (Statics.field1509 == null) {
                            var11 = 8;
                        } else if (class165.field2650 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class165.field2649.field1894;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2655.method2773(class165.field2649.field1891, class165.field2649.field1894, var12);
                            if (class165.field2656 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class165.field2649.field1891[class165.field2649.field1894 + var13] ^= class165.field2656;
                                }
                            }
                            class165.field2649.field1894 += var12;
                            if (class165.field2649.field1894 < var11) {
                                break;
                            }
                            if (Statics.field1509 == null) {
                                class165.field2649.field1894 = 0;
                                int var14 = class165.field2649.method2322();
                                int var15 = class165.field2649.method2324();
                                int var16 = class165.field2649.method2322();
                                int var17 = class165.field2649.method2327();
                                long var18 = (long) ((var14 << 16) + var15);
                                class166 var20 = (class166) class165.field2653.method3459(var18);
                                Statics.field278 = true;
                                if (var20 == null) {
                                    var20 = (class166) class165.field2647.method3459(var18);
                                    Statics.field278 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1509 = var20;
                                Statics.field1921 = new class114(var17 + var21 + Statics.field1509.field2662);
                                Statics.field1921.method2307(var16);
                                Statics.field1921.method2310(var17);
                                class165.field2650 = 8;
                                class165.field2649.field1894 = 0;
                            } else if (class165.field2650 == 0) {
                                if (class165.field2649.field1891[0] == -1) {
                                    class165.field2650 = 1;
                                    class165.field2649.field1894 = 0;
                                } else {
                                    Statics.field1509 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field1921.field1891.length - Statics.field1509.field2662;
                            int var23 = 512 - class165.field2650;
                            if (var23 > var22 - Statics.field1921.field1894) {
                                var23 = var22 - Statics.field1921.field1894;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2655.method2773(Statics.field1921.field1891, Statics.field1921.field1894, var23);
                            if (class165.field2656 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field1921.field1891[Statics.field1921.field1894 + var24] ^= class165.field2656;
                                }
                            }
                            Statics.field1921.field1894 += var23;
                            class165.field2650 += var23;
                            if (Statics.field1921.field1894 == var22) {
                                if (Statics.field1509.field3043 == 16711935L) {
                                    Statics.field19 = Statics.field1921;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class162 var26 = class165.field2652[var25];
                                        if (var26 != null) {
                                            Statics.field19.field1894 = var25 * 8 + 5;
                                            int var27 = Statics.field19.method2327();
                                            int var28 = Statics.field19.method2327();
                                            var26.method3063(var27, var28);
                                        }
                                    }
                                } else {
                                    class165.field2642.reset();
                                    class165.field2642.update(Statics.field1921.field1891, 0, var22);
                                    int var29 = (int) class165.field2642.getValue();
                                    if (Statics.field1509.field2658 != var29) {
                                        try {
                                            Statics.field2655.method2781();
                                        } catch (Exception var35) {
                                        }
                                        class165.field2654++;
                                        Statics.field2655 = null;
                                        class165.field2656 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class165.field2654 = 0;
                                    class165.field2643 = 0;
                                    Statics.field1509.field2663.method3065((int) (Statics.field1509.field3043 & 0xFFFFL), Statics.field1921.field1891, (Statics.field1509.field3043 & 0xFF0000L) == 16711680L, Statics.field278);
                                }
                                Statics.field1509.method3563();
                                if (Statics.field278) {
                                    class165.field2638--;
                                } else {
                                    class165.field2648--;
                                }
                                class165.field2650 = 0;
                                Statics.field1509 = null;
                                Statics.field1921 = null;
                            } else {
                                if (class165.field2650 != 512) {
                                    break;
                                }
                                class165.field2650 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2655.method2781();
                } catch (Exception var34) {
                }
                class165.field2643++;
                Statics.field2655 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method238();
        }
    }

    @ObfuscatedName("client.u(B)V")
    public void method238() {
        if (class165.field2654 >= 4) {
            this.method2800("js5crc");
            field310 = 1000;
            return;
        }
        if (class165.field2643 >= 4) {
            if (field310 <= 5) {
                this.method2800("js5io");
                field310 = 1000;
                return;
            }
            field332 = 3000;
            class165.field2643 = 3;
        }
        if (--field332 + 1 > 0) {
            return;
        }
        try {
            if (field331 == 0) {
                Statics.field64 = Statics.field109.method2691(Statics.field1060, Statics.field771);
                field331++;
            }
            if (field331 == 1) {
                if (Statics.field64.field2124 == 2) {
                    this.method304(-1);
                    return;
                }
                if (Statics.field64.field2124 == 1) {
                    field331++;
                }
            }
            if (field331 == 2) {
                Statics.field2584 = new class138((Socket) Statics.field64.field2118, Statics.field109);
                class114 var1 = new class114(5);
                var1.method2307(15);
                var1.method2310(88);
                Statics.field2584.method2779(var1.field1891, 0, 5);
                field331++;
                Statics.field692 = Statics.method2875();
            }
            if (field331 == 3) {
                if (field310 <= 5 || Statics.field2584.method2776() > 0) {
                    int var2 = Statics.field2584.method2771();
                    if (var2 != 0) {
                        this.method304(var2);
                        return;
                    }
                    field331++;
                } else if (Statics.method2875() - Statics.field692 > 30000L) {
                    this.method304(-2);
                    return;
                }
            }
            if (field331 == 4) {
                class165.method697(Statics.field2584, field310 > 20);
                Statics.field64 = null;
                Statics.field2584 = null;
                field331 = 0;
                field333 = 0;
            }
        } catch (IOException var4) {
            this.method304(-3);
        }
    }

    @ObfuscatedName("client.m(II)V")
    public void method304(int arg0) {
        Statics.field64 = null;
        Statics.field2584 = null;
        field331 = 0;
        if (Statics.field771 == Statics.field338) {
            Statics.field771 = Statics.field2547;
        } else {
            Statics.field771 = Statics.field338;
        }
        field333++;
        if (field333 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field310 <= 5) {
                this.method2800("js5connect_full");
                field310 = 1000;
            } else {
                field332 = 3000;
            }
        } else if (field333 >= 2 && arg0 == 6) {
            this.method2800("js5connect_outofdate");
            field310 = 1000;
        } else if (field333 >= 4) {
            if (field310 <= 5) {
                this.method2800("js5connect");
                field310 = 1000;
            } else {
                field332 = 3000;
            }
        }
    }

    @ObfuscatedName("ee.e(I)V")
    public static void method2892() {
        if (field330 == 0) {
            Statics.field1555 = new class84(4, 104, 104, class6.field88);
            for (int var0 = 0; var0 < 4; var0++) {
                field511[var0] = new class223(104, 104);
            }
            Statics.field51 = new class77(512, 512);
            class31.field737 = class151.field2291;
            class31.field736 = 5;
            field330 = 20;
        } else if (field330 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class89.field1542[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class84.method1865(var1, 500, 800, 512, 334);
            class31.field737 = class151.field2242;
            class31.field736 = 10;
            field330 = 30;
        } else if (field330 == 30) {
            Statics.field1989 = method104(0, false, true, true);
            Statics.field282 = method104(1, false, true, true);
            Statics.field161 = method104(2, true, false, true);
            Statics.field1364 = method104(3, false, true, true);
            Statics.field1807 = method104(4, false, true, true);
            Statics.field3099 = method104(5, true, true, true);
            Statics.field677 = method104(6, true, true, false);
            Statics.field1957 = method104(7, false, true, true);
            Statics.field246 = method104(8, false, true, true);
            Statics.field1947 = method104(9, false, true, true);
            Statics.field2822 = method104(10, false, true, true);
            Statics.field1848 = method104(11, false, true, true);
            Statics.field2193 = method104(12, false, true, true);
            Statics.field607 = method104(13, true, false, true);
            Statics.field1940 = method104(14, false, true, false);
            Statics.field599 = method104(15, false, true, true);
            class31.field737 = class151.field2305;
            class31.field736 = 20;
            field330 = 40;
        } else if (field330 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1989.method3057() * 4 / 100;
            int var8 = var7 + Statics.field282.method3057() * 4 / 100;
            int var9 = var8 + Statics.field161.method3057() * 2 / 100;
            int var10 = var9 + Statics.field1364.method3057() * 2 / 100;
            int var11 = var10 + Statics.field1807.method3057() * 6 / 100;
            int var12 = var11 + Statics.field3099.method3057() * 4 / 100;
            int var13 = var12 + Statics.field677.method3057() * 2 / 100;
            int var14 = var13 + Statics.field1957.method3057() * 60 / 100;
            int var15 = var14 + Statics.field246.method3057() * 2 / 100;
            int var16 = var15 + Statics.field1947.method3057() * 2 / 100;
            int var17 = var16 + Statics.field2822.method3057() * 2 / 100;
            int var18 = var17 + Statics.field1848.method3057() * 2 / 100;
            int var19 = var18 + Statics.field2193.method3057() * 2 / 100;
            int var20 = var19 + Statics.field607.method3057() * 2 / 100;
            int var21 = var20 + Statics.field1940.method3057() * 2 / 100;
            int var22 = var21 + Statics.field599.method3057() * 2 / 100;
            if (var22 == 100) {
                class31.field737 = class151.field2353;
                class31.field736 = 30;
                field330 = 45;
            } else {
                if (var22 != 0) {
                    class31.field737 = class151.field2244 + var22 + "%";
                }
                class31.field736 = 30;
            }
        } else if (field330 == 45) {
            class55.method2879(22050, !field307, 2);
            class178 var23 = new class178();
            var23.method3319(9, 128);
            Statics.field543 = class55.method1018(Statics.field109, Statics.field1706, 0, 22050);
            Statics.field543.method1191(var23);
            class177.method2767(Statics.field599, Statics.field1940, Statics.field1807, var23);
            Statics.field682 = class55.method1018(Statics.field109, Statics.field1706, 1, 2048);
            Statics.field2060 = new class54();
            Statics.field682.method1191(Statics.field2060);
            Statics.field107 = new class73(22050, Statics.field1163);
            class31.field737 = class151.field2268;
            class31.field736 = 35;
            field330 = 50;
        } else if (field330 == 50) {
            int var24 = 0;
            if (Statics.field647 == null) {
                Statics.field647 = class75.method118(Statics.field246, Statics.field607, "p11_full", "");
            } else {
                var24++;
            }
            if (Statics.field2826 == null) {
                Statics.field2826 = class75.method118(Statics.field246, Statics.field607, "p12_full", "");
            } else {
                var24++;
            }
            if (Statics.field299 == null) {
                Statics.field299 = class75.method118(Statics.field246, Statics.field607, "b12_full", "");
            } else {
                var24++;
            }
            if (var24 < 3) {
                class31.field737 = class151.field2325 + var24 * 100 / 3 + "%";
                class31.field736 = 40;
            } else {
                Statics.field79 = new class154(true);
                class31.field737 = class151.field2248;
                class31.field736 = 40;
                field330 = 60;
            }
        } else if (field330 == 60) {
            class162 var25 = Statics.field2822;
            class162 var26 = Statics.field246;
            int var27 = 0;
            if (var25.method2997("title.jpg", "")) {
                var27++;
            }
            if (var26.method2997("logo", "")) {
                var27++;
            }
            if (var26.method2997("titlebox", "")) {
                var27++;
            }
            if (var26.method2997("titlebutton", "")) {
                var27++;
            }
            if (var26.method2997("runes", "")) {
                var27++;
            }
            if (var26.method2997("title_mute", "")) {
                var27++;
            }
            if (var26.method2979("options_radio_buttons,0")) {
                var27++;
            }
            if (var26.method2979("options_radio_buttons,2")) {
                var27++;
            }
            var26.method2997("sl_back", "");
            var26.method2997("sl_flags", "");
            var26.method2997("sl_arrows", "");
            var26.method2997("sl_stars", "");
            var26.method2997("sl_button", "");
            int var30 = class31.method1019();
            if (var27 < var30) {
                class31.field737 = class151.field2437 + var27 * 100 / var30 + "%";
                class31.field736 = 50;
            } else {
                class31.field737 = class151.field2250;
                class31.field736 = 50;
                method2157(5);
                field330 = 70;
            }
        } else if (field330 == 70) {
            if (Statics.field161.method2983()) {
                class162 var31 = Statics.field161;
                Statics.field1036 = var31;
                class40.method883(Statics.field161);
                class162 var32 = Statics.field161;
                class162 var33 = Statics.field1957;
                Statics.field1014 = var32;
                Statics.field3090 = var33;
                Statics.field2114 = Statics.field1014.method3008(3);
                class39.method2601(Statics.field161, Statics.field1957, field307);
                class38.method138(Statics.field161, Statics.field1957);
                class162 var34 = Statics.field161;
                class162 var35 = Statics.field1957;
                boolean var36 = field306;
                class218 var37 = Statics.field647;
                Statics.field1080 = var34;
                Statics.field1081 = var35;
                Statics.field2661 = var36;
                Statics.field2132 = Statics.field1080.method3008(10);
                Statics.field2585 = var37;
                class162 var38 = Statics.field161;
                class162 var39 = Statics.field1989;
                class162 var40 = Statics.field282;
                Statics.field980 = var38;
                Statics.field964 = var39;
                Statics.field967 = var40;
                class42.method691(Statics.field161, Statics.field1957);
                class162 var41 = Statics.field161;
                Statics.field1040 = var41;
                class162 var42 = Statics.field161;
                Statics.field1135 = var42;
                Statics.field1132 = Statics.field1135.method3008(16);
                class162 var43 = Statics.field1364;
                class162 var44 = Statics.field1957;
                class162 var45 = Statics.field246;
                class162 var46 = Statics.field607;
                Statics.field2668 = var43;
                Statics.field73 = var44;
                Statics.field2669 = var45;
                Statics.field1969 = var46;
                Statics.field1130 = new class167[Statics.field2668.method2990()][];
                Statics.field2790 = new boolean[Statics.field2668.method2990()];
                class162 var47 = Statics.field161;
                Statics.field1073 = var47;
                class47.method655(Statics.field161);
                class44.method36(Statics.field161);
                class48.method594(Statics.field161);
                Statics.field15 = new class19();
                class31.field737 = class151.field2252;
                class31.field736 = 60;
                field330 = 80;
            } else {
                class31.field737 = class151.field2251 + Statics.field161.method3059() + "%";
                class31.field736 = 60;
            }
        } else if (field330 == 80) {
            int var48 = 0;
            if (Statics.field172 == null) {
                class162 var49 = Statics.field246;
                int var50 = var49.method2994("compass");
                int var51 = var49.method3011(var50, "");
                class77 var52 = class75.method146(var49, var50, var51);
                Statics.field172 = var52;
            } else {
                var48++;
            }
            if (Statics.field2187 == null) {
                class162 var53 = Statics.field246;
                int var54 = var53.method2994("mapedge");
                int var55 = var53.method3011(var54, "");
                class77 var56 = class75.method146(var53, var54, var55);
                Statics.field2187 = var56;
            } else {
                var48++;
            }
            if (Statics.field952 == null) {
                Statics.field952 = class75.method172(Statics.field246, "mapscene", "");
            } else {
                var48++;
            }
            if (Statics.field2834 == null) {
                Statics.field2834 = class75.method976(Statics.field246, "mapfunction", "");
            } else {
                var48++;
            }
            if (Statics.field2510 == null) {
                Statics.field2510 = class75.method976(Statics.field246, "hitmarks", "");
            } else {
                var48++;
            }
            if (Statics.field1365 == null) {
                Statics.field1365 = class75.method976(Statics.field246, "headicons_pk", "");
            } else {
                var48++;
            }
            if (Statics.field982 == null) {
                Statics.field982 = class75.method976(Statics.field246, "headicons_prayer", "");
            } else {
                var48++;
            }
            if (Statics.field1015 == null) {
                Statics.field1015 = class75.method976(Statics.field246, "headicons_hint", "");
            } else {
                var48++;
            }
            if (Statics.field1353 == null) {
                Statics.field1353 = class75.method976(Statics.field246, "mapmarker", "");
            } else {
                var48++;
            }
            if (Statics.field3164 == null) {
                Statics.field3164 = class75.method976(Statics.field246, "cross", "");
            } else {
                var48++;
            }
            if (Statics.field270 == null) {
                Statics.field270 = class75.method976(Statics.field246, "mapdots", "");
            } else {
                var48++;
            }
            if (Statics.field3053 == null) {
                Statics.field3053 = class75.method172(Statics.field246, "scrollbar", "");
            } else {
                var48++;
            }
            if (Statics.field766 == null) {
                Statics.field766 = class75.method172(Statics.field246, "mod_icons", "");
            } else {
                var48++;
            }
            if (var48 < 13) {
                class31.field737 = class151.field2253 + var48 * 100 / 13 + "%";
                class31.field736 = 70;
            } else {
                Statics.field3115 = Statics.field766;
                Statics.field2187.method1632();
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 21.0D) - 10;
                int var59 = (int) (Math.random() * 21.0D) - 10;
                int var60 = (int) (Math.random() * 41.0D) - 20;
                for (int var61 = 0; var61 < Statics.field2834.length; var61++) {
                    Statics.field2834[var61].method1631(var57 + var60, var58 + var60, var59 + var60);
                }
                Statics.field952[0].method1773(var57 + var60, var58 + var60, var59 + var60);
                class31.field737 = class151.field2245;
                class31.field736 = 70;
                field330 = 90;
            }
        } else if (field330 == 90) {
            if (Statics.field1947.method2983()) {
                class93 var62 = new class93(Statics.field1947, Statics.field246, 20, 0.8D, field307 ? 64 : 128);
                class89.method1982(var62);
                class89.method2030(0.8D);
                class31.field737 = class151.field2256;
                class31.field736 = 90;
                field330 = 110;
            } else {
                class31.field737 = class151.field2255 + Statics.field1947.method3059() + "%";
                class31.field736 = 90;
            }
        } else if (field330 == 110) {
            Statics.field167 = new class13();
            Statics.field109.method2697(Statics.field167, 10);
            class31.field737 = class151.field2270;
            class31.field736 = 94;
            field330 = 120;
        } else if (field330 == 120) {
            if (Statics.field2822.method2997("huffman", "")) {
                class108 var63 = new class108(Statics.field2822.method2996("huffman", ""));
                Statics.field3109 = var63;
                class31.field737 = class151.field2273;
                class31.field736 = 96;
                field330 = 130;
            } else {
                class31.field737 = class151.field2491 + "%";
                class31.field736 = 96;
            }
        } else if (field330 == 130) {
            if (!Statics.field1364.method2983()) {
                class31.field737 = class151.field2310 + Statics.field1364.method3059() * 4 / 5 + "%";
                class31.field736 = 100;
            } else if (!Statics.field2193.method2983()) {
                class31.field737 = class151.field2310 + (80 + Statics.field2193.method3059() / 6) + "%";
                class31.field736 = 100;
            } else if (Statics.field607.method2983()) {
                class31.field737 = class151.field2443;
                class31.field736 = 100;
                field330 = 140;
            } else {
                class31.field737 = class151.field2310 + (96 + Statics.field607.method3059() / 20) + "%";
                class31.field736 = 100;
            }
        } else if (field330 == 140) {
            method2157(10);
        }
    }

    @ObfuscatedName("i.v(IZZZB)Lfc;")
    public static class162 method104(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class129 var4 = null;
        if (class144.field2145 != null) {
            var4 = new class129(arg0, class144.field2145, Statics.field2143[arg0], 1000000);
        }
        return new class162(var4, Statics.field2815, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("w.r(B)V")
    public static final void method34() {
        try {
            if (field334 == 0) {
                if (Statics.field2150 != null) {
                    Statics.field2150.method2781();
                    Statics.field2150 = null;
                }
                Statics.field263 = null;
                field434 = false;
                field317 = 0;
                field334 = 1;
            }
            if (field334 == 1) {
                if (Statics.field263 == null) {
                    Statics.field263 = Statics.field109.method2691(Statics.field1060, Statics.field771);
                }
                if (Statics.field263.field2124 == 2) {
                    throw new IOException();
                }
                if (Statics.field263.field2124 == 1) {
                    Statics.field2150 = new class138((Socket) Statics.field263.field2118, Statics.field109);
                    Statics.field263 = null;
                    field334 = 2;
                }
            }
            if (field334 == 2) {
                field342.field1894 = 0;
                field342.method2307(14);
                Statics.field2150.method2779(field342.field1891, 0, 1);
                field344.field1894 = 0;
                field334 = 3;
            }
            if (field334 == 3) {
                if (Statics.field543 != null) {
                    Statics.field543.method1210();
                }
                if (Statics.field682 != null) {
                    Statics.field682.method1210();
                }
                int var0 = Statics.field2150.method2771();
                if (Statics.field543 != null) {
                    Statics.field543.method1210();
                }
                if (Statics.field682 != null) {
                    Statics.field682.method1210();
                }
                if (var0 != 0) {
                    method3587(var0);
                    return;
                }
                field344.field1894 = 0;
                field334 = 5;
            }
            if (field334 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field342.field1894 = 0;
                field342.method2307(1);
                field342.method2307(class31.field746.method565());
                field342.method2310(var1[0]);
                field342.method2310(var1[1]);
                field342.method2310(var1[2]);
                field342.method2310(var1[3]);
                switch(class31.field746.field2515) {
                    case 0:
                    case 1:
                        field342.method2309(Statics.field1995);
                        field342.field1894 += 5;
                        break;
                    case 2:
                        field342.method2310((Integer) Statics.field1870.field150.get(class157.method144(class31.field742)));
                        field342.field1894 += 4;
                        break;
                    case 3:
                        field342.field1894 += 8;
                }
                field342.method2313(class31.field743);
                field342.method2316(class5.field85, class5.field78);
                field486.field1894 = 0;
                if (field310 == 40) {
                    field486.method2307(18);
                } else {
                    field486.method2307(16);
                }
                field486.method2367(0);
                int var2 = field486.field1894;
                field486.method2310(88);
                field486.method2334(field342.field1891, 0, field342.field1894);
                int var3 = field486.field1894;
                field486.method2313(class31.field742);
                field486.method2307((field515 ? 1 : 0) << 1 | (field307 ? 1 : 0));
                field486.method2367(Statics.field2066);
                field486.method2367(Statics.field2056);
                class117 var4 = field486;
                byte[] var5 = new byte[24];
                try {
                    class144.field2136.method3772(0L);
                    class144.field2136.method3774(var5);
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
                var4.method2334(var5, 0, 24);
                field486.method2313(Statics.field309);
                field486.method2310(Statics.field1930);
                class114 var9 = new class114(Statics.field79.method2897());
                Statics.field79.method2898(var9);
                field486.method2334(var9.field1891, 0, var9.field1891.length);
                field486.method2307(Statics.field2223);
                field486.method2310(Statics.field1989.field2607);
                field486.method2310(Statics.field282.field2607);
                field486.method2310(Statics.field161.field2607);
                field486.method2310(Statics.field1364.field2607);
                field486.method2310(Statics.field1807.field2607);
                field486.method2310(Statics.field3099.field2607);
                field486.method2310(Statics.field677.field2607);
                field486.method2310(Statics.field1957.field2607);
                field486.method2310(Statics.field246.field2607);
                field486.method2310(Statics.field1947.field2607);
                field486.method2310(Statics.field2822.field2607);
                field486.method2310(Statics.field1848.field2607);
                field486.method2310(Statics.field2193.field2607);
                field486.method2310(Statics.field607.field2607);
                field486.method2310(Statics.field1940.field2607);
                field486.method2310(Statics.field599.field2607);
                field486.method2339(var1, var3, field486.field1894);
                field486.method2318(field486.field1894 - var2);
                Statics.field2150.method2779(field486.field1891, 0, field486.field1894);
                field342.method2573(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field344.method2573(var1);
                field334 = 6;
            }
            if (field334 == 6 && Statics.field2150.method2776() > 0) {
                int var11 = Statics.field2150.method2771();
                if (var11 == 21 && field310 == 20) {
                    field334 = 7;
                } else if (var11 == 2) {
                    field334 = 9;
                } else if (var11 == 15 && field310 == 40) {
                    field342.field1894 = 0;
                    field344.field1894 = 0;
                    field346 = -1;
                    field335 = -1;
                    field350 = -1;
                    field405 = -1;
                    field345 = 0;
                    field512 = 0;
                    field319 = 0;
                    field443 = 0;
                    field559 = false;
                    field537 = 0;
                    field513 = 0;
                    for (int var12 = 0; var12 < field419.length; var12++) {
                        if (field419[var12] != null) {
                            field419[var12].field818 = -1;
                        }
                    }
                    for (int var13 = 0; var13 < field573.length; var13++) {
                        if (field573[var13] != null) {
                            field573[var13].field818 = -1;
                        }
                    }
                    class15.method40();
                    method2157(30);
                    for (int var14 = 0; var14 < 100; var14++) {
                        field379[var14] = true;
                    }
                    method980();
                    return;
                } else if (var11 == 23 && field336 < 1) {
                    field336++;
                    field334 = 0;
                } else if (var11 == 29) {
                    field334 = 11;
                } else {
                    method3587(var11);
                    return;
                }
            }
            if (field334 == 7 && Statics.field2150.method2776() > 0) {
                field337 = (Statics.field2150.method2771() + 3) * 60;
                field334 = 8;
            }
            if (field334 == 8) {
                field317 = 0;
                class31.method894(class151.field2333, class151.field2335, field337 / 60 + class151.field2267);
                if (--field337 <= 0) {
                    field334 = 0;
                }
            } else {
                if (field334 == 9 && Statics.field2150.method2776() >= 13) {
                    boolean var15 = Statics.field2150.method2771() == 1;
                    Statics.field2150.method2773(field344.field1891, 0, 4);
                    field344.field1894 = 0;
                    boolean var16 = false;
                    if (var15) {
                        int var17 = field344.method2575() << 24;
                        int var18 = var17 | field344.method2575() << 16;
                        int var19 = var18 | field344.method2575() << 8;
                        int var20 = var19 | field344.method2575();
                        int var21 = class157.method144(class31.field742);
                        if (Statics.field1870.field150.size() >= 10 && !Statics.field1870.field150.containsKey(var21)) {
                            Iterator var22 = Statics.field1870.field150.entrySet().iterator();
                            var22.next();
                            var22.remove();
                        }
                        Statics.field1870.field150.put(var21, var20);
                        Statics.method2571();
                    }
                    field468 = Statics.field2150.method2771();
                    field470 = Statics.field2150.method2771() == 1;
                    field425 = Statics.field2150.method2771();
                    field425 <<= 0x8;
                    field425 += Statics.field2150.method2771();
                    field426 = Statics.field2150.method2771();
                    Statics.field2150.method2773(field344.field1891, 0, 1);
                    field344.field1894 = 0;
                    field346 = field344.method2575();
                    Statics.field2150.method2773(field344.field1891, 0, 2);
                    field344.field1894 = 0;
                    field345 = field344.method2324();
                    if (field426 == 1) {
                        try {
                            client var23 = Statics.field2072;
                            JSObject.getWindow(var23).call("zap", (Object[]) null);
                        } catch (Throwable var32) {
                        }
                    } else {
                        try {
                            client var25 = Statics.field2072;
                            JSObject.getWindow(var25).call("unzap", (Object[]) null);
                        } catch (Throwable var31) {
                        }
                    }
                    field334 = 10;
                }
                if (field334 != 10) {
                    if (field334 == 11 && Statics.field2150.method2776() >= 2) {
                        field344.field1894 = 0;
                        Statics.field2150.method2773(field344.field1891, 0, 2);
                        field344.field1894 = 0;
                        Statics.field1817 = field344.method2324();
                        field334 = 12;
                    }
                    if (field334 == 12 && Statics.field2150.method2776() >= Statics.field1817) {
                        field344.field1894 = 0;
                        Statics.field2150.method2773(field344.field1891, 0, Statics.field1817);
                        field344.field1894 = 0;
                        String var27 = field344.method2440();
                        String var28 = field344.method2440();
                        String var29 = field344.method2440();
                        class31.method894(var27, var28, var29);
                        method2157(10);
                    }
                    field317++;
                    if (field317 > 2000) {
                        if (field336 < 1) {
                            if (Statics.field771 == Statics.field338) {
                                Statics.field771 = Statics.field2547;
                            } else {
                                Statics.field771 = Statics.field338;
                            }
                            field336++;
                            field334 = 0;
                        } else {
                            method3587(-3);
                        }
                    }
                } else if (Statics.field2150.method2776() >= field345) {
                    field344.field1894 = 0;
                    Statics.field2150.method2773(field344.field1891, 0, field345);
                    method2564();
                    Statics.field625 = -1;
                    method2156(false);
                    field346 = -1;
                }
            }
        } catch (IOException var34) {
            if (field336 < 1) {
                if (Statics.field771 == Statics.field338) {
                    Statics.field771 = Statics.field2547;
                } else {
                    Statics.field771 = Statics.field338;
                }
                field336++;
                field334 = 0;
            } else {
                method3587(-2);
            }
        }
    }

    @ObfuscatedName("dm.t(I)V")
    public static void method2564() {
        field313 = 1L;
        field316 = -1;
        Statics.field167.field200 = 0;
        Statics.field2201 = true;
        field531 = true;
        field527 = -1L;
        class205.field3058 = new class196();
        field342.field1894 = 0;
        field344.field1894 = 0;
        field346 = -1;
        field335 = -1;
        field350 = -1;
        field405 = -1;
        field512 = 0;
        field319 = 0;
        field352 = 0;
        field490 = 0;
        field443 = 0;
        field559 = false;
        class135.field2040 = 0;
        class11.field171.clear();
        class11.field177.method3475();
        class11.field169.method3518();
        class11.field170 = 0;
        field454 = 0;
        field456 = false;
        field544 = 0;
        field364 = (int) (Math.random() * 100.0D) - 50;
        field366 = (int) (Math.random() * 110.0D) - 55;
        field368 = (int) (Math.random() * 80.0D) - 40;
        field371 = (int) (Math.random() * 120.0D) - 60;
        field373 = (int) (Math.random() * 30.0D) - 20;
        field574 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field537 = 0;
        field530 = -1;
        field513 = 0;
        field536 = 0;
        field329 = class20.field584;
        field409 = 0;
        field340 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field419[var0] = null;
            field575[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field573[var1] = null;
        }
        Statics.field143 = field419[2047] = new class3();
        field433 = -1;
        field436.method3509();
        field437.method3509();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field391[var2][var3][var4] = null;
                }
            }
        }
        field581 = new class193();
        field534 = 0;
        field374 = 0;
        field571 = 0;
        for (int var5 = 0; var5 < Statics.field1132; var5++) {
            class51 var6 = class51.method810(var5);
            if (var6 != null) {
                class170.field2824[var5] = 0;
                class170.field2823[var5] = 0;
            }
        }
        Statics.field15.method186();
        field469 = -1;
        if (field461 != -1) {
            class167.method2153(field461);
        }
        for (class4 var7 = (class4) field462.method3462(); var7 != null; var7 = (class4) field462.method3468()) {
            Statics.method962(var7, true);
        }
        field461 = -1;
        field462 = new class190(8);
        field360 = null;
        field559 = false;
        field443 = 0;
        field569.method3192((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field485[var8] = null;
            field431[var8] = false;
        }
        class15.method40();
        field311 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field379[var9] = true;
        }
        method980();
        field439 = null;
        Statics.field2918 = 0;
        Statics.field1912 = null;
        for (int var10 = 0; var10 < 8; var10++) {
            field578[var10] = new class214();
        }
        Statics.field667 = null;
    }

    @ObfuscatedName("go.g(IS)V")
    public static void method3587(int arg0) {
        if (arg0 == -3) {
            class31.method894(class151.field2367, class151.field2269, class151.field2314);
        } else if (arg0 == -2) {
            class31.method894(class151.field2271, class151.field2272, class151.field2257);
        } else if (arg0 == -1) {
            class31.method894(class151.field2274, class151.field2275, class151.field2276);
        } else if (arg0 == 3) {
            class31.method894(class151.field2243, class151.field2278, class151.field2279);
        } else if (arg0 == 4) {
            class31.method894(class151.field2280, class151.field2281, class151.field2282);
        } else if (arg0 == 5) {
            class31.method894(class151.field2431, class151.field2328, class151.field2285);
        } else if (arg0 == 6) {
            class31.method894(class151.field2286, class151.field2287, class151.field2288);
        } else if (arg0 == 7) {
            class31.method894(class151.field2289, class151.field2290, class151.field2451);
        } else if (arg0 == 8) {
            class31.method894(class151.field2357, class151.field2293, class151.field2294);
        } else if (arg0 == 9) {
            class31.method894(class151.field2295, class151.field2262, class151.field2330);
        } else if (arg0 == 10) {
            class31.method894(class151.field2298, class151.field2299, class151.field2300);
        } else if (arg0 == 11) {
            class31.method894(class151.field2301, class151.field2296, class151.field2303);
        } else if (arg0 == 12) {
            class31.method894(class151.field2304, class151.field2452, class151.field2368);
        } else if (arg0 == 13) {
            class31.method894(class151.field2307, class151.field2308, class151.field2309);
        } else if (arg0 == 14) {
            class31.method894(class151.field2477, class151.field2311, class151.field2312);
        } else if (arg0 == 16) {
            class31.method894(class151.field2313, class151.field2324, class151.field2315);
        } else if (arg0 == 17) {
            class31.method894(class151.field2457, class151.field2317, class151.field2318);
        } else if (arg0 == 18) {
            class31.method894(class151.field2375, class151.field2320, class151.field2484);
        } else if (arg0 == 19) {
            class31.method894(class151.field2322, class151.field2323, class151.field2456);
        } else if (arg0 == 20) {
            class31.method894(class151.field2232, class151.field2265, class151.field2327);
        } else if (arg0 == 22) {
            class31.method894(class151.field2261, class151.field2329, class151.field2409);
        } else if (arg0 == 23) {
            class31.method894(class151.field2369, class151.field2493, class151.field2258);
        } else if (arg0 == 24) {
            class31.method894(class151.field2266, class151.field2442, class151.field2336);
        } else if (arg0 == 25) {
            class31.method894(class151.field2337, class151.field2338, class151.field2260);
        } else if (arg0 == 26) {
            class31.method894(class151.field2340, class151.field2341, class151.field2342);
        } else if (arg0 == 27) {
            class31.method894(class151.field2326, class151.field2344, class151.field2345);
        } else if (arg0 == 31) {
            class31.method894(class151.field2352, class151.field2246, class151.field2374);
        } else if (arg0 == 32) {
            class31.method894(class151.field2355, class151.field2356, class151.field2343);
        } else if (arg0 == 37) {
            class31.method894(class151.field2316, class151.field2359, class151.field2365);
        } else if (arg0 == 38) {
            class31.method894(class151.field2361, class151.field2397, class151.field2363);
        } else if (arg0 == 55) {
            class31.method894(class151.field2364, class151.field2229, class151.field2366);
        } else if (arg0 == 56) {
            class31.method894(class151.field2430, class151.field2332, class151.field2492);
            method2157(11);
            return;
        } else if (arg0 == 57) {
            class31.method894(class151.field2395, class151.field2371, class151.field2372);
            method2157(11);
            return;
        } else {
            class31.method894(class151.field2373, class151.field2471, class151.field2339);
        }
        method2157(10);
    }

    @ObfuscatedName("ci.s(I)V")
    public static final void method1971() {
        if (Statics.field2150 != null) {
            Statics.field2150.method2781();
            Statics.field2150 = null;
        }
        method734();
        Statics.field1555.method1800();
        for (int var0 = 0; var0 < 4; var0++) {
            field511[var0].method3799();
        }
        System.gc();
        class177.method2886(2);
        field539 = -1;
        field540 = false;
        class23.method32();
        method2157(10);
    }

    @ObfuscatedName("ab.n(I)V")
    public static final void method734() {
        class45.field1028.method3435();
        class40.method106();
        class43.field1004.method3435();
        class39.method2562();
        Statics.method2859();
        class50.method2878();
        class41.field966.method3435();
        class41.field975.method3435();
        class42.field987.method3435();
        class42.field990.method3435();
        class46.method1975();
        class51.field1133.method3435();
        class173.method728();
        class167.field2670.method3435();
        class167.field2687.method3435();
        class167.field2672.method3435();
        class167.field2673.method3435();
        ((class93) Statics.field1519).method2055();
        class21.field594.method3435();
        Statics.field1989.method2985();
        Statics.field282.method2985();
        Statics.field1364.method2985();
        Statics.field1807.method2985();
        Statics.field3099.method2985();
        Statics.field677.method2985();
        Statics.field1957.method2985();
        Statics.field246.method2985();
        Statics.field1947.method2985();
        Statics.field2822.method2985();
        Statics.field1848.method2985();
        Statics.field2193.method2985();
    }

    @ObfuscatedName("bf.h(I)V")
    public static final void method1270() {
        if (field352 > 0) {
            method1971();
        } else {
            method2157(40);
            Statics.field696 = Statics.field2150;
            Statics.field2150 = null;
        }
    }

    @ObfuscatedName("p.p(B)V")
    public static final void method569() {
        if (field319 > 1) {
            field319--;
        }
        if (field352 > 0) {
            field352--;
        }
        if (field434) {
            field434 = false;
            method1270();
            return;
        }
        if (!field559) {
            field448[0] = class151.field2388;
            field449[0] = "";
            field446[0] = 1006;
            field443 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field2150 == null) {
                var1 = false;
            } else {
                label2774: {
                    try {
                        int var2 = Statics.field2150.method2776();
                        if (var2 == 0) {
                            var1 = false;
                            break label2774;
                        }
                        if (field346 == -1) {
                            Statics.field2150.method2773(field344.field1891, 0, 1);
                            field344.field1894 = 0;
                            field346 = field344.method2575();
                            field345 = class182.field2977[field346];
                            var2--;
                        }
                        if (field345 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2774;
                            }
                            Statics.field2150.method2773(field344.field1891, 0, 1);
                            field345 = field344.field1891[0] & 0xFF;
                            var2--;
                        }
                        if (field345 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2774;
                            }
                            Statics.field2150.method2773(field344.field1891, 0, 2);
                            field344.field1894 = 0;
                            field345 = field344.method2324();
                            var2 -= 2;
                        }
                        if (var2 < field345) {
                            var1 = false;
                            break label2774;
                        }
                        field344.field1894 = 0;
                        Statics.field2150.method2773(field344.field1891, 0, field345);
                        field512 = 0;
                        field405 = field350;
                        field350 = field335;
                        field335 = field346;
                        if (field346 == 63) {
                            Statics.field1023 = field344.method2480();
                            Statics.field1022 = field344.method2480();
                            while (field344.field1894 < field345) {
                                field346 = field344.method2322();
                                Statics.method150();
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 41) {
                            String var3 = field344.method2440();
                            int var4 = field344.method2324();
                            byte var5 = field344.method2323();
                            boolean var6 = false;
                            if (var5 == -128) {
                                var6 = true;
                            }
                            if (var6) {
                                if (Statics.field2918 == 0) {
                                    field346 = -1;
                                    var1 = true;
                                    break label2774;
                                }
                                boolean var7 = false;
                                int var8;
                                for (var8 = 0; var8 < Statics.field2918 && (!Statics.field1912[var8].field632.equals(var3) || Statics.field1912[var8].field630 != var4); var8++) {
                                }
                                if (var8 < Statics.field2918) {
                                    while (var8 < Statics.field2918 - 1) {
                                        Statics.field1912[var8] = Statics.field1912[var8 + 1];
                                        var8++;
                                    }
                                    Statics.field2918--;
                                    Statics.field1912[Statics.field2918] = null;
                                }
                            } else {
                                field344.method2440();
                                class24 var9 = new class24();
                                var9.field632 = var3;
                                var9.field629 = class158.method560(var9.field632, Statics.field87);
                                var9.field630 = var4;
                                var9.field631 = var5;
                                int var10;
                                for (var10 = Statics.field2918 - 1; var10 >= 0; var10--) {
                                    int var11 = Statics.field1912[var10].field629.compareTo(var9.field629);
                                    if (var11 == 0) {
                                        Statics.field1912[var10].field630 = var4;
                                        Statics.field1912[var10].field631 = var5;
                                        if (var3.equals(Statics.field143.field53)) {
                                            Statics.field1359 = var5;
                                        }
                                        field495 = field385;
                                        field346 = -1;
                                        var1 = true;
                                        break label2774;
                                    }
                                    if (var11 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field2918 >= Statics.field1912.length) {
                                    field346 = -1;
                                    var1 = true;
                                    break label2774;
                                }
                                for (int var12 = Statics.field2918 - 1; var12 > var10; var12--) {
                                    Statics.field1912[var12 + 1] = Statics.field1912[var12];
                                }
                                if (Statics.field2918 == 0) {
                                    Statics.field1912 = new class24[100];
                                }
                                Statics.field1912[var10 + 1] = var9;
                                Statics.field2918++;
                                if (var3.equals(Statics.field143.field53)) {
                                    Statics.field1359 = var5;
                                }
                            }
                            field495 = field385;
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 230) {
                            int var13 = field344.method2364();
                            class167 var14 = class167.method1258(var13);
                            for (int var15 = 0; var15 < var14.field2792.length; var15++) {
                                var14.field2792[var15] = -1;
                                var14.field2792[var15] = 0;
                            }
                            method1085(var14);
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 146) {
                            method3131();
                            field466 = field344.method2322();
                            field498 = field385;
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 6) {
                            String var16 = field344.method2440();
                            String var17 = class217.method3681(class157.method650(class216.method2862(field344)));
                            class11.method1792(6, var16, var17);
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 52) {
                            field537 = field344.method2322();
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 65) {
                            class25 var18 = new class25();
                            var18.field638 = field344.method2440();
                            var18.field650 = field344.method2324();
                            int var19 = field344.method2327();
                            var18.field641 = var19;
                            method2157(45);
                            Statics.field2150.method2781();
                            Statics.field2150 = null;
                            class31.method1797(var18);
                            field346 = -1;
                            var1 = false;
                            break label2774;
                        }
                        if (field346 == 31) {
                            for (int var20 = 0; var20 < class170.field2823.length; var20++) {
                                if (class170.field2824[var20] != class170.field2823[var20]) {
                                    class170.field2823[var20] = class170.field2824[var20];
                                    method174(var20);
                                    field565[++field488 - 1 & 0x1F] = var20;
                                }
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 58) {
                            field513 = field344.method2322();
                            if (field513 == 255) {
                                field513 = 0;
                            }
                            field536 = field344.method2322();
                            if (field536 == 255) {
                                field536 = 0;
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 142) {
                            method3131();
                            int var21 = field344.method2327();
                            int var22 = field344.method2388();
                            int var23 = field344.method2480();
                            field440[var23] = var21;
                            field445[var23] = var22;
                            field348[var23] = 1;
                            for (int var24 = 0; var24 < 98; var24++) {
                                if (var21 >= class149.field2205[var24]) {
                                    field348[var23] = var24 + 2;
                                }
                            }
                            field390[++field492 - 1 & 0x1F] = var23;
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 199) {
                            int var25 = field344.method2322();
                            int var26 = field344.method2322();
                            int var27 = field344.method2322();
                            int var28 = field344.method2322();
                            field551[var25] = true;
                            field442[var25] = var26;
                            field372[var25] = var27;
                            field554[var25] = var28;
                            field555[var25] = 0;
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 50) {
                            int var29 = field344.method2376();
                            int var30 = field344.method2396();
                            int var31 = field344.method2376();
                            class167 var32 = class167.method1258(var30);
                            if (var32.field2739 != var29 || var32.field2686 != var31 || var32.field2681 != 0 || var32.field2671 != 0) {
                                var32.field2739 = var29;
                                var32.field2686 = var31;
                                var32.field2681 = 0;
                                var32.field2671 = 0;
                                method1085(var32);
                                method2273(var32);
                                if (var32.field2714 == 0) {
                                    method568(Statics.field1130[var30 >> 16], var32, false);
                                }
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 138) {
                            field490 = field344.method2322();
                            if (field490 == 1) {
                                field321 = field344.method2324();
                            }
                            if (field490 >= 2 && field490 <= 6) {
                                if (field490 == 2) {
                                    field326 = 64;
                                    field327 = 64;
                                }
                                if (field490 == 3) {
                                    field326 = 0;
                                    field327 = 64;
                                }
                                if (field490 == 4) {
                                    field326 = 128;
                                    field327 = 64;
                                }
                                if (field490 == 5) {
                                    field326 = 64;
                                    field327 = 0;
                                }
                                if (field490 == 6) {
                                    field326 = 64;
                                    field327 = 128;
                                }
                                field490 = 2;
                                field505 = field344.method2324();
                                field463 = field344.method2324();
                                field510 = field344.method2322();
                            }
                            if (field490 == 10) {
                                field322 = field344.method2324();
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 2) {
                            field384 = field344.method2322();
                            field520 = field344.method2322();
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 161) {
                            int var33 = field344.method2363();
                            String var34 = field344.method2440();
                            class167 var35 = class167.method1258(var33);
                            if (!var34.equals(var35.field2708)) {
                                var35.field2708 = var34;
                                method1085(var35);
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 186) {
                            int var36 = field344.method2364();
                            int var37 = field344.method2324();
                            int var38 = field344.method2324();
                            int var39 = field344.method2356();
                            class167 var40 = class167.method1258(var36);
                            if (var40.field2725 != var38 || var40.field2726 != var39 || var40.field2728 != var37) {
                                var40.field2725 = var38;
                                var40.field2726 = var39;
                                var40.field2728 = var37;
                                method1085(var40);
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 177) {
                            method2156(true);
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 18) {
                            int var41 = field344.method2324();
                            if (var41 == 65535) {
                                var41 = -1;
                            }
                            int var42 = field344.method2364();
                            int var43 = field344.method2364();
                            int var44 = field344.method2356();
                            if (var44 == 65535) {
                                var44 = -1;
                            }
                            for (int var45 = var41; var45 <= var44; var45++) {
                                long var46 = ((long) var42 << 32) + (long) var45;
                                class202 var48 = field503.method3459(var46);
                                if (var48 != null) {
                                    var48.method3563();
                                }
                                field503.method3463(new class195(var43), var46);
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 201) {
                            int var49 = field344.method2401();
                            boolean var50 = field344.method2322() == 1;
                            String var51 = "";
                            boolean var52 = false;
                            if (var50) {
                                var51 = field344.method2440();
                                if (method688(var51)) {
                                    var52 = true;
                                }
                            }
                            String var53 = field344.method2440();
                            if (!var52) {
                                class11.method1792(var49, var51, var53);
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 206) {
                            int var54 = field344.method2357();
                            int var55 = field344.method2364();
                            class167 var56 = class167.method1258(var55);
                            if (var56.field2745 != var54 || var54 == -1) {
                                var56.field2745 = var54;
                                var56.field2796 = 0;
                                var56.field2797 = 0;
                                method1085(var56);
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 60) {
                            int var57 = field344.method2327();
                            int var58 = field344.method2327();
                            if (Statics.field1901 == null || !Statics.field1901.isValid()) {
                                try {
                                    Iterator var59 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                    while (var59.hasNext()) {
                                        GarbageCollectorMXBean var60 = (GarbageCollectorMXBean) var59.next();
                                        if (var60.isValid()) {
                                            Statics.field1901 = var60;
                                            field580 = -1L;
                                            field579 = -1L;
                                        }
                                    }
                                } catch (Throwable var408) {
                                }
                            }
                            long var62 = Statics.method2875();
                            int var64 = -1;
                            if (Statics.field1901 != null) {
                                long var65 = Statics.field1901.getCollectionTime();
                                if (field579 != -1L) {
                                    long var67 = var65 - field579;
                                    long var69 = var62 - field580;
                                    if (var69 != 0L) {
                                        var64 = (int) (var67 * 100L / var69);
                                    }
                                }
                                field579 = var65;
                                field580 = var62;
                            }
                            field342.method2574(133);
                            field342.method2359(var57);
                            field342.method2359(var58);
                            field342.method2346(var64);
                            field342.method2346(field2103);
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 254) {
                            int var71 = field344.method2322();
                            int var72 = field344.method2388();
                            int var73 = field344.method2517();
                            Statics.field3101 = var73 >> 1;
                            Statics.field143.method716(var72, var71, (var73 & 0x1) == 1);
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 170) {
                            Statics.field1023 = field344.method2322();
                            Statics.field1022 = field344.method2517();
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 83) {
                            field344.field1894 += 28;
                            if (field344.method2333()) {
                                class117 var74 = field344;
                                int var75 = field344.field1894 - 28;
                                if (class144.field2136 != null) {
                                    try {
                                        class144.field2136.method3772(0L);
                                        class144.field2136.method3773(var74.field1891, var75, 24);
                                    } catch (Exception var406) {
                                    }
                                }
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 67) {
                            method98(false);
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 185) {
                            while (field344.field1894 < field345) {
                                int var77 = field344.method2322();
                                boolean var78 = (var77 & 0x1) == 1;
                                String var79 = field344.method2440();
                                String var80 = field344.method2440();
                                field344.method2440();
                                for (int var81 = 0; var81 < field571; var81++) {
                                    class8 var82 = field304[var81];
                                    if (var78) {
                                        if (var80.equals(var82.field137)) {
                                            var82.field137 = var79;
                                            var82.field138 = var80;
                                            var79 = null;
                                            break;
                                        }
                                    } else if (var79.equals(var82.field137)) {
                                        var82.field137 = var79;
                                        var82.field138 = var80;
                                        var79 = null;
                                        break;
                                    }
                                }
                                if (var79 != null && field571 < 400) {
                                    class8 var83 = new class8();
                                    field304[field571] = var83;
                                    var83.field137 = var79;
                                    var83.field138 = var80;
                                    field571++;
                                }
                            }
                            field494 = field385;
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 47) {
                            field495 = field385;
                            if (field345 == 0) {
                                field439 = null;
                                field529 = null;
                                Statics.field2918 = 0;
                                Statics.field1912 = null;
                                field346 = -1;
                                var1 = true;
                            } else {
                                field529 = field344.method2440();
                                long var84 = field344.method2328();
                                long var86 = var84;
                                String var88;
                                if (var84 <= 0L || var84 >= 6582952005840035281L) {
                                    var88 = null;
                                } else if (var84 % 37L == 0L) {
                                    var88 = null;
                                } else {
                                    int var89 = 0;
                                    for (long var90 = var84; var90 != 0L; var90 /= 37L) {
                                        var89++;
                                    }
                                    StringBuilder var92 = new StringBuilder(var89);
                                    while (var86 != 0L) {
                                        long var93 = var86;
                                        var86 /= 37L;
                                        var92.append(class156.field2569[(int) (var93 - var86 * 37L)]);
                                    }
                                    var88 = var92.reverse().toString();
                                }
                                field439 = var88;
                                Statics.field701 = field344.method2323();
                                int var95 = field344.method2322();
                                if (var95 == 255) {
                                    field346 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field2918 = var95;
                                    class24[] var96 = new class24[100];
                                    for (int var97 = 0; var97 < Statics.field2918; var97++) {
                                        var96[var97] = new class24();
                                        var96[var97].field632 = field344.method2440();
                                        var96[var97].field629 = class158.method560(var96[var97].field632, Statics.field87);
                                        var96[var97].field630 = field344.method2324();
                                        var96[var97].field631 = field344.method2323();
                                        field344.method2440();
                                        if (var96[var97].field632.equals(Statics.field143.field53)) {
                                            Statics.field1359 = var96[var97].field631;
                                        }
                                    }
                                    boolean var98 = false;
                                    int var99 = Statics.field2918;
                                    while (var99 > 0) {
                                        boolean var100 = true;
                                        var99--;
                                        for (int var101 = 0; var101 < var99; var101++) {
                                            if (var96[var101].field629.compareTo(var96[var101 + 1].field629) > 0) {
                                                class24 var102 = var96[var101];
                                                var96[var101] = var96[var101 + 1];
                                                var96[var101 + 1] = var102;
                                                var100 = false;
                                            }
                                        }
                                        if (var100) {
                                            break;
                                        }
                                    }
                                    Statics.field1912 = var96;
                                    field346 = -1;
                                    var1 = true;
                                }
                            }
                            break label2774;
                        }
                        if (field346 == 125) {
                            for (int var103 = 0; var103 < Statics.field1132; var103++) {
                                class51 var104 = class51.method810(var103);
                                if (var104 != null) {
                                    class170.field2824[var103] = 0;
                                    class170.field2823[var103] = 0;
                                }
                            }
                            method3131();
                            field488 += 32;
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 180) {
                            int var105 = field344.method2364();
                            class167 var106 = class167.method1258(var105);
                            var106.field2752 = 3;
                            var106.field2720 = Statics.field143.field39.method3200();
                            method1085(var106);
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 167) {
                            boolean var107 = field344.method2322() == 1;
                            if (var107) {
                                Statics.field68 = Statics.method2875() - field344.method2328();
                                Statics.field667 = new class215(field344, true);
                            } else {
                                Statics.field667 = null;
                            }
                            field497 = field385;
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 255) {
                            int var108 = field344.method2364();
                            Statics.field2087 = Statics.field109.method2693(var108);
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 195) {
                            int var109 = field344.method2322();
                            String var110 = field344.method2440();
                            int var111 = field344.method2322();
                            if (var109 >= 1 && var109 <= 8) {
                                if (var110.equalsIgnoreCase("null")) {
                                    var110 = null;
                                }
                                field485[var109 - 1] = var110;
                                field431[var109 - 1] = var111 == 0;
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 7) {
                            int var112 = field345 + field344.field1894;
                            int var113 = field344.method2324();
                            int var114 = field344.method2324();
                            if (field461 != var113) {
                                field461 = var113;
                                method3429(field461, Statics.field2066, Statics.field2056, false);
                                method175(field461);
                                class35.method654(field461);
                                for (int var115 = 0; var115 < 100; var115++) {
                                    field379[var115] = true;
                                }
                            }
                            while (var114-- > 0) {
                                int var116 = field344.method2327();
                                int var117 = field344.method2324();
                                int var118 = field344.method2322();
                                class4 var119 = (class4) field462.method3459((long) var116);
                                if (var119 != null && var119.field69 != var117) {
                                    Statics.method962(var119, true);
                                    var119 = null;
                                }
                                if (var119 == null) {
                                    var119 = method39(var116, var117, var118);
                                }
                                var119.field62 = true;
                            }
                            for (class4 var120 = (class4) field462.method3462(); var120 != null; var120 = (class4) field462.method3468()) {
                                if (var120.field62) {
                                    var120.field62 = false;
                                } else {
                                    Statics.method962(var120, true);
                                }
                            }
                            field503 = new class190(512);
                            while (field344.field1894 < var112) {
                                int var121 = field344.method2327();
                                int var122 = field344.method2324();
                                int var123 = field344.method2324();
                                int var124 = field344.method2327();
                                for (int var125 = var122; var125 <= var123; var125++) {
                                    long var126 = ((long) var121 << 32) + (long) var125;
                                    field503.method3463(new class195(var124), var126);
                                }
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 59) {
                            field550 = true;
                            Statics.field2149 = field344.method2322();
                            Statics.field242 = field344.method2322();
                            Statics.field237 = field344.method2324();
                            Statics.field1938 = field344.method2322();
                            Statics.field77 = field344.method2322();
                            if (Statics.field77 >= 100) {
                                int var128 = Statics.field2149 * 128 + 64;
                                int var129 = Statics.field242 * 128 + 64;
                                int var130 = method2267(var128, var129, Statics.field3101) - Statics.field237;
                                int var131 = var128 - Statics.field276;
                                int var132 = var130 - Statics.field789;
                                int var133 = var129 - Statics.field215;
                                int var134 = (int) Math.sqrt((double) (var131 * var131 + var133 * var133));
                                Statics.field12 = (int) (Math.atan2((double) var132, (double) var134) * 325.949D) & 0x7FF;
                                Statics.field106 = (int) (Math.atan2((double) var131, (double) var133) * -325.949D) & 0x7FF;
                                if (Statics.field12 < 128) {
                                    Statics.field12 = 128;
                                }
                                if (Statics.field12 > 383) {
                                    Statics.field12 = 383;
                                }
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 132) {
                            method3131();
                            field467 = field344.method2308();
                            field498 = field385;
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 61) {
                            int var135 = field344.method2363();
                            int var136 = field344.method2324();
                            class167 var137 = class167.method1258(var135);
                            if (var137.field2752 != 1 || var137.field2720 != var136) {
                                var137.field2752 = 1;
                                var137.field2720 = var136;
                                method1085(var137);
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 194) {
                            int var138 = field344.method2306();
                            if (var138 == 65535) {
                                var138 = -1;
                            }
                            if (var138 == -1 && !field540) {
                                class177.method2070();
                            } else if (var138 != -1 && field539 != var138 && field538 != 0 && !field540) {
                                class177.method570(2, Statics.field677, var138, 0, field538, false);
                            }
                            field539 = var138;
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 99) {
                            int var139 = field344.method2321();
                            int var140 = field344.method2306();
                            if (var140 == 65535) {
                                var140 = -1;
                            }
                            if (field538 != 0 && var140 != -1) {
                                class177.method708(Statics.field1848, var140, 0, field538, false);
                                field540 = true;
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 242) {
                            int var141 = field344.method2363();
                            int var142 = field344.method2517();
                            int var143 = field344.method2355();
                            class4 var144 = (class4) field462.method3459((long) var141);
                            if (var144 != null) {
                                Statics.method962(var144, var144.field69 != var143);
                            }
                            method39(var141, var143, var142);
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 198) {
                            int var145 = field344.method2322();
                            if (field344.method2322() == 0) {
                                field578[var145] = new class214();
                                field344.field1894 += 18;
                            } else {
                                field344.field1894--;
                                field578[var145] = new class214(field344, false);
                            }
                            field496 = field385;
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 124) {
                            String var146 = field344.method2440();
                            Object[] var147 = new Object[var146.length() + 1];
                            for (int var148 = var146.length() - 1; var148 >= 0; var148--) {
                                if (var146.charAt(var148) == 's') {
                                    var147[var148 + 1] = field344.method2440();
                                } else {
                                    var147[var148 + 1] = Integer.valueOf(field344.method2327());
                                }
                            }
                            var147[0] = Integer.valueOf(field344.method2327());
                            class1 var149 = new class1();
                            var149.field4 = var147;
                            class35.method26(var149);
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 54) {
                            field319 = field344.method2355() * 30;
                            field498 = field385;
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 12) {
                            int var150 = field344.method2327();
                            int var151 = field344.method2324();
                            if (var150 < -70000) {
                                var151 += 32768;
                            }
                            class167 var152;
                            if (var150 >= 0) {
                                var152 = class167.method1258(var150);
                            } else {
                                var152 = null;
                            }
                            if (var152 != null) {
                                for (int var153 = 0; var153 < var152.field2792.length; var153++) {
                                    var152.field2792[var153] = 0;
                                    var152.field2793[var153] = 0;
                                }
                            }
                            class15.method91(var151);
                            int var154 = field344.method2324();
                            for (int var155 = 0; var155 < var154; var155++) {
                                int var156 = field344.method2388();
                                if (var156 == 255) {
                                    var156 = field344.method2364();
                                }
                                int var157 = field344.method2324();
                                if (var152 != null && var155 < var152.field2792.length) {
                                    var152.field2792[var155] = var157;
                                    var152.field2793[var155] = var156;
                                }
                                class15.method126(var151, var155, var157 - 1, var156);
                            }
                            if (var152 != null) {
                                method1085(var152);
                            }
                            method3131();
                            field489[++field378 - 1 & 0x1F] = var151 & 0x7FFF;
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 44) {
                            int var158 = field344.method2356();
                            int var159 = field344.method2363();
                            int var160 = var158 >> 10 & 0x1F;
                            int var161 = var158 >> 5 & 0x1F;
                            int var162 = var158 & 0x1F;
                            int var163 = (var162 << 3) + (var160 << 19) + (var161 << 11);
                            class167 var164 = class167.method1258(var159);
                            if (var164.field2701 != var163) {
                                var164.field2701 = var163;
                                method1085(var164);
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 153) {
                            Statics.field1023 = field344.method2322();
                            Statics.field1022 = field344.method2322();
                            for (int var165 = Statics.field1022; var165 < Statics.field1022 + 8; var165++) {
                                for (int var166 = Statics.field1023; var166 < Statics.field1023 + 8; var166++) {
                                    if (field391[Statics.field3101][var165][var166] != null) {
                                        field391[Statics.field3101][var165][var166] = null;
                                        method157(var165, var166);
                                    }
                                }
                            }
                            for (class16 var167 = (class16) field581.method3490(); var167 != null; var167 = (class16) field581.method3492()) {
                                if (var167.field232 >= Statics.field1022 && var167.field232 < Statics.field1022 + 8 && var167.field233 >= Statics.field1023 && var167.field233 < Statics.field1023 + 8 && Statics.field3101 == var167.field247) {
                                    var167.field250 = 0;
                                }
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 98) {
                            int var168 = field344.method2306();
                            field461 = var168;
                            method3429(field461, Statics.field2066, Statics.field2056, false);
                            method175(var168);
                            class35.method654(field461);
                            for (int var169 = 0; var169 < 100; var169++) {
                                field379[var169] = true;
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 28) {
                            class205.method2941(field344, field345);
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 82) {
                            int var170 = field344.method2327();
                            int var171 = field344.method2324();
                            if (var170 < -70000) {
                                var171 += 32768;
                            }
                            class167 var172;
                            if (var170 >= 0) {
                                var172 = class167.method1258(var170);
                            } else {
                                var172 = null;
                            }
                            while (field344.field1894 < field345) {
                                int var173 = field344.method2401();
                                int var174 = field344.method2324();
                                int var175 = 0;
                                if (var174 != 0) {
                                    var175 = field344.method2322();
                                    if (var175 == 255) {
                                        var175 = field344.method2327();
                                    }
                                }
                                if (var172 != null && var173 >= 0 && var173 < var172.field2792.length) {
                                    var172.field2792[var173] = var174;
                                    var172.field2793[var173] = var175;
                                }
                                class15.method126(var171, var173, var174 - 1, var175);
                            }
                            if (var172 != null) {
                                method1085(var172);
                            }
                            method3131();
                            field489[++field378 - 1 & 0x1F] = var171 & 0x7FFF;
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 30) {
                            int var176 = field344.method2396();
                            boolean var177 = field344.method2322() == 1;
                            class167 var178 = class167.method1258(var176);
                            if (var178.field2696 != var177) {
                                var178.field2696 = var177;
                                method1085(var178);
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 0) {
                            int var179 = field344.method2355();
                            int var180 = field344.method2324();
                            int var181 = field344.method2327();
                            class167 var182 = class167.method1258(var181);
                            var182.field2730 = (var179 << 16) + var180;
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 14) {
                            method98(true);
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 157) {
                            int var183 = field344.method2363();
                            int var184 = field344.method2306();
                            class170.field2824[var184] = var183;
                            if (class170.field2823[var184] != var183) {
                                class170.field2823[var184] = var183;
                                method174(var184);
                            }
                            field565[++field488 - 1 & 0x1F] = var184;
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 115) {
                            field550 = false;
                            for (int var185 = 0; var185 < 5; var185++) {
                                field551[var185] = false;
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 190) {
                            method1971();
                            field346 = -1;
                            var1 = false;
                            break label2774;
                        }
                        if (field346 == 107) {
                            String var186 = field344.method2440();
                            Statics.field309 = var186;
                            try {
                                String var187 = Statics.field2072.getParameter(class184.field2995.field2982);
                                String var188 = Statics.field2072.getParameter(class184.field2992.field2982);
                                String var189 = var187 + "settings=" + var186 + "; version=1; path=/; domain=" + var188;
                                String var190;
                                if (var186.length() == 0) {
                                    var190 = var189 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                                } else {
                                    var190 = var189 + "; Expires=" + class106.method2064(Statics.method2875() + 94608000000L) + "; Max-Age=" + 94608000L;
                                }
                                client var191 = Statics.field2072;
                                String var192 = "document.cookie=\"" + var190 + "\"";
                                JSObject.getWindow(var191).eval(var192);
                            } catch (Throwable var405) {
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 29) {
                            int var194 = field344.method2324();
                            int var195 = field344.method2322();
                            int var196 = field344.method2324();
                            if (field558 != 0 && var195 != 0 && field544 < 50) {
                                field545[field544] = var194;
                                field546[field544] = var195;
                                field547[field544] = var196;
                                field549[field544] = null;
                                field548[field544] = 0;
                                field544++;
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 88) {
                            int var200 = field344.method2327();
                            class4 var201 = (class4) field462.method3459((long) var200);
                            if (var201 != null) {
                                Statics.method962(var201, true);
                            }
                            if (field360 != null) {
                                method1085(field360);
                                field360 = null;
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 229) {
                            int var202 = field344.method2306();
                            class15 var203 = (class15) class15.field228.method3459((long) var202);
                            if (var203 != null) {
                                var203.method3563();
                            }
                            field489[++field378 - 1 & 0x1F] = var202 & 0x7FFF;
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 80) {
                            for (int var204 = 0; var204 < field419.length; var204++) {
                                if (field419[var204] != null) {
                                    field419[var204].field824 = -1;
                                }
                            }
                            for (int var205 = 0; var205 < field573.length; var205++) {
                                if (field573[var205] != null) {
                                    field573[var205].field824 = -1;
                                }
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 223) {
                            String var206 = field344.method2440();
                            long var207 = field344.method2328();
                            long var209 = (long) field344.method2324();
                            long var211 = (long) field344.method2321();
                            class146[] var213 = new class146[] { class146.field2168, class146.field2169, class146.field2176, class146.field2174, class146.field2167 };
                            class146 var214 = (class146) class104.method631(var213, field344.method2322());
                            long var215 = (var209 << 32) + var211;
                            boolean var217 = false;
                            for (int var218 = 0; var218 < 100; var218++) {
                                if (field522[var218] == var215) {
                                    var217 = true;
                                    break;
                                }
                            }
                            if (var214.field2173 && method688(var206)) {
                                var217 = true;
                            }
                            if (!var217 && field418 == 0) {
                                field522[field523] = var215;
                                field523 = (field523 + 1) % 100;
                                String var219 = class217.method3681(class157.method650(class216.method2862(field344)));
                                if (var214.field2172 == -1) {
                                    Statics.method37(9, var206, var219, class156.method2610(var207));
                                } else {
                                    Statics.method37(9, class2.method3082(var214.field2172) + var206, var219, class156.method2610(var207));
                                }
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 116) {
                            field550 = true;
                            Statics.field149 = field344.method2322();
                            Statics.field1 = field344.method2322();
                            Statics.field1880 = field344.method2324();
                            Statics.field111 = field344.method2322();
                            Statics.field168 = field344.method2322();
                            if (Statics.field168 >= 100) {
                                Statics.field276 = Statics.field149 * 128 + 64;
                                Statics.field215 = Statics.field1 * 128 + 64;
                                Statics.field789 = method2267(Statics.field276, Statics.field215, Statics.field3101) - Statics.field1880;
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 166) {
                            int var220 = field344.method2396();
                            int var221 = field344.method2363();
                            class4 var222 = (class4) field462.method3459((long) var220);
                            class4 var223 = (class4) field462.method3459((long) var221);
                            if (var223 != null) {
                                Statics.method962(var223, var222 == null || var222.field69 != var223.field69);
                            }
                            if (var222 != null) {
                                var222.method3563();
                                field462.method3463(var222, (long) var221);
                            }
                            class167 var224 = class167.method1258(var220);
                            if (var224 != null) {
                                method1085(var224);
                            }
                            class167 var225 = class167.method1258(var221);
                            if (var225 != null) {
                                method1085(var225);
                                method568(Statics.field1130[var225.field2807 >>> 16], var225, true);
                            }
                            if (field461 != -1) {
                                method657(field461, 1);
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 102) {
                            if (field461 != -1) {
                                method657(field461, 0);
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 112) {
                            field534 = 1;
                            field494 = field385;
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 173) {
                            method2156(false);
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 39) {
                            Statics.field252 = class125.method2568(field344.method2322());
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 51) {
                            while (field344.field1894 < field345) {
                                boolean var226 = field344.method2322() == 1;
                                String var227 = field344.method2440();
                                String var228 = field344.method2440();
                                int var229 = field344.method2324();
                                int var230 = field344.method2322();
                                int var231 = field344.method2322();
                                boolean var232 = (var231 & 0x2) != 0;
                                boolean var233 = (var231 & 0x1) != 0;
                                if (var229 > 0) {
                                    field344.method2440();
                                    field344.method2322();
                                    field344.method2327();
                                }
                                field344.method2440();
                                for (int var234 = 0; var234 < field374; var234++) {
                                    class17 var235 = field417[var234];
                                    if (var226) {
                                        if (var228.equals(var235.field260)) {
                                            var235.field260 = var227;
                                            var235.field253 = var228;
                                            var227 = null;
                                            break;
                                        }
                                    } else if (var227.equals(var235.field260)) {
                                        if (var235.field254 != var229) {
                                            boolean var236 = true;
                                            for (class37 var237 = (class37) field572.method3452(); var237 != null; var237 = (class37) field572.method3453()) {
                                                if (var237.field859.equals(var227)) {
                                                    if (var229 != 0 && var237.field860 == 0) {
                                                        var237.method3560();
                                                        var236 = false;
                                                    } else if (var229 == 0 && var237.field860 != 0) {
                                                        var237.method3560();
                                                        var236 = false;
                                                    }
                                                }
                                            }
                                            if (var236) {
                                                field572.method3454(new class37(var227, var229));
                                            }
                                            var235.field254 = var229;
                                        }
                                        var235.field253 = var228;
                                        var235.field255 = var230;
                                        var235.field256 = var232;
                                        var235.field257 = var233;
                                        var227 = null;
                                        break;
                                    }
                                }
                                if (var227 != null && field374 < 400) {
                                    class17 var238 = new class17();
                                    field417[field374] = var238;
                                    var238.field260 = var227;
                                    var238.field253 = var228;
                                    var238.field254 = var229;
                                    var238.field255 = var230;
                                    var238.field256 = var232;
                                    var238.field257 = var233;
                                    field374++;
                                }
                            }
                            field534 = 2;
                            field494 = field385;
                            boolean var239 = false;
                            int var240 = field374;
                            while (var240 > 0) {
                                boolean var241 = true;
                                var240--;
                                for (int var242 = 0; var242 < var240; var242++) {
                                    boolean var243 = false;
                                    class17 var244 = field417[var242];
                                    class17 var245 = field417[var242 + 1];
                                    if (field397 != var244.field254 && field397 == var245.field254) {
                                        var243 = true;
                                    }
                                    if (!var243 && var244.field254 == 0 && var245.field254 != 0) {
                                        var243 = true;
                                    }
                                    if (!var243 && !var244.field256 && var245.field256) {
                                        var243 = true;
                                    }
                                    if (!var243 && !var244.field257 && var245.field257) {
                                        var243 = true;
                                    }
                                    if (var243) {
                                        class17 var246 = field417[var242];
                                        field417[var242] = field417[var242 + 1];
                                        field417[var242 + 1] = var246;
                                        var241 = false;
                                    }
                                }
                                if (var241) {
                                    break;
                                }
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 187) {
                            int var247 = field344.method2356();
                            byte var248 = field344.method2350();
                            class170.field2824[var247] = var248;
                            if (class170.field2823[var247] != var248) {
                                class170.field2823[var247] = var248;
                                method174(var247);
                            }
                            field565[++field488 - 1 & 0x1F] = var247;
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 118 || field346 == 162 || field346 == 205 || field346 == 131 || field346 == 183 || field346 == 36 || field346 == 240 || field346 == 48 || field346 == 56 || field346 == 234) {
                            Statics.method150();
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 207) {
                            int var249 = field344.method2327();
                            int var250 = field344.method2306();
                            class167 var251 = class167.method1258(var249);
                            if (var251.field2752 != 2 || var251.field2720 != var250) {
                                var251.field2752 = 2;
                                var251.field2720 = var250;
                                method1085(var251);
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 40) {
                            int var252 = field344.method2355();
                            if (var252 == 65535) {
                                var252 = -1;
                            }
                            int var253 = field344.method2364();
                            int var254 = field344.method2396();
                            class167 var255 = class167.method1258(var253);
                            if (var255.field2675) {
                                var255.field2794 = var252;
                                var255.field2795 = var254;
                                class50 var257 = class50.method1088(var252);
                                var255.field2725 = var257.field1123;
                                var255.field2726 = var257.field1096;
                                var255.field2727 = var257.field1095;
                                var255.field2723 = var257.field1099;
                                var255.field2724 = var257.field1097;
                                var255.field2728 = var257.field1092;
                                if (var257.field1102 == 1) {
                                    var255.field2732 = 1;
                                } else {
                                    var255.field2732 = 2;
                                }
                                if (var255.field2729 > 0) {
                                    var255.field2728 = var255.field2728 * 32 / var255.field2729;
                                } else if (var255.field2780 > 0) {
                                    var255.field2728 = var255.field2728 * 32 / var255.field2780;
                                }
                                method1085(var255);
                            } else {
                                if (var252 == -1) {
                                    var255.field2752 = 0;
                                    field346 = -1;
                                    var1 = true;
                                    break label2774;
                                }
                                class50 var256 = class50.method1088(var252);
                                var255.field2752 = 4;
                                var255.field2720 = var252;
                                var255.field2725 = var256.field1123;
                                var255.field2726 = var256.field1096;
                                var255.field2728 = var256.field1092 * 100 / var254;
                                method1085(var255);
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 90) {
                            field427 = 0;
                            field347 = 0;
                            method4();
                            method931();
                            while (field344.method2592(field345) >= 11) {
                                int var258 = field344.method2576(11);
                                if (var258 == 2047) {
                                    break;
                                }
                                boolean var259 = false;
                                if (field419[var258] == null) {
                                    field419[var258] = new class3();
                                    if (field575[var258] != null) {
                                        field419[var258].method13(field575[var258]);
                                    }
                                    var259 = true;
                                }
                                field447[++field409 - 1] = var258;
                                class3 var260 = field419[var258];
                                var260.field841 = field477;
                                int var261 = field344.method2576(1);
                                if (var261 == 1) {
                                    field423[++field347 - 1] = var258;
                                }
                                int var262 = field344.method2576(1);
                                int var263 = field344.method2576(5);
                                if (var263 > 15) {
                                    var263 -= 32;
                                }
                                int var264 = field487[field344.method2576(3)];
                                if (var259) {
                                    var260.field843 = var260.field795 = var264;
                                }
                                int var265 = field344.method2576(5);
                                if (var265 > 15) {
                                    var265 -= 32;
                                }
                                var260.method716(Statics.field143.field847[0] + var265, Statics.field143.field848[0] + var263, var262 == 1);
                            }
                            field344.method2577();
                            for (int var266 = 0; var266 < field347; var266++) {
                                int var267 = field423[var266];
                                class3 var268 = field419[var267];
                                int var269 = field344.method2322();
                                if ((var269 & 0x4) != 0) {
                                    var269 += field344.method2322() << 8;
                                }
                                method103(var267, var268, var269);
                            }
                            for (int var270 = 0; var270 < field427; var270++) {
                                int var271 = field428[var270];
                                if (field477 != field419[var271].field841) {
                                    field419[var271] = null;
                                }
                            }
                            if (field345 != field344.field1894) {
                                throw new RuntimeException(field344.field1894 + class2.field21 + field345);
                            }
                            for (int var272 = 0; var272 < field409; var272++) {
                                if (field419[field447[var272]] == null) {
                                    throw new RuntimeException(var272 + class2.field21 + field409);
                                }
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 81) {
                            String var273 = field344.method2440();
                            long var274 = (long) field344.method2324();
                            long var276 = (long) field344.method2321();
                            class146[] var278 = new class146[] { class146.field2168, class146.field2169, class146.field2176, class146.field2174, class146.field2167 };
                            class146 var279 = (class146) class104.method631(var278, field344.method2322());
                            long var280 = (var274 << 32) + var276;
                            boolean var282 = false;
                            for (int var283 = 0; var283 < 100; var283++) {
                                if (field522[var283] == var280) {
                                    var282 = true;
                                    break;
                                }
                            }
                            if (method688(var273)) {
                                var282 = true;
                            }
                            if (!var282 && field418 == 0) {
                                field522[field523] = var280;
                                field523 = (field523 + 1) % 100;
                                String var284 = class217.method3681(class157.method650(class216.method2862(field344)));
                                byte var285;
                                if (var279.field2177) {
                                    var285 = 7;
                                } else {
                                    var285 = 3;
                                }
                                if (var279.field2172 == -1) {
                                    class11.method1792(var285, var273, var284);
                                } else {
                                    class11.method1792(var285, class2.method3082(var279.field2172) + var273, var284);
                                }
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        if (field346 == 24) {
                            int var286 = field344.method2364();
                            int var287 = field344.method2355();
                            class167 var288 = class167.method1258(var286);
                            if (var288 != null && var288.field2714 == 0) {
                                if (var287 > var288.field2700 - var288.field2692) {
                                    var287 = var288.field2700 - var288.field2692;
                                }
                                if (var287 < 0) {
                                    var287 = 0;
                                }
                                if (var288.field2698 != var287) {
                                    var288.field2698 = var287;
                                    method1085(var288);
                                }
                            }
                            field346 = -1;
                            var1 = true;
                            break label2774;
                        }
                        class143.method1973("" + field346 + class2.field21 + field350 + class2.field21 + field405 + class2.field21 + field345, (Throwable) null);
                        method1971();
                    } catch (IOException var409) {
                        method1270();
                    } catch (Exception var410) {
                        String var291 = "" + field346 + class2.field21 + field350 + class2.field21 + field405 + class2.field21 + field345 + class2.field21 + (Statics.field1367 + Statics.field143.field847[0]) + class2.field21 + (Statics.field2578 + Statics.field143.field848[0]) + class2.field21;
                        for (int var292 = 0; var292 < field345 && var292 < 50; var292++) {
                            var291 = var291 + field344.field1891[var292] + class2.field21;
                        }
                        class143.method1973(var291, var410);
                        method1971();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field310 != 30) {
            return;
        }
        while (class205.method1972()) {
            field342.method2574(162);
            field342.method2307(0);
            int var293 = field342.field1894;
            class205.method845(field342);
            field342.method2319(field342.field1894 - var293);
        }
        Object var294 = Statics.field167.field208;
        synchronized (Statics.field167.field208) {
            if (!field493) {
                Statics.field167.field200 = 0;
            } else if (class135.field2043 != 0 || Statics.field167.field200 >= 40) {
                field342.method2574(206);
                field342.method2307(0);
                int var295 = field342.field1894;
                int var296 = 0;
                for (int var297 = 0; var297 < Statics.field167.field200 && field342.field1894 - var295 < 240; var297++) {
                    var296++;
                    int var298 = Statics.field167.field204[var297];
                    if (var298 < 0) {
                        var298 = 0;
                    } else if (var298 > 502) {
                        var298 = 502;
                    }
                    int var299 = Statics.field167.field202[var297];
                    if (var299 < 0) {
                        var299 = 0;
                    } else if (var299 > 764) {
                        var299 = 764;
                    }
                    int var300 = var298 * 765 + var299;
                    if (Statics.field167.field204[var297] == -1 && Statics.field167.field202[var297] == -1) {
                        var299 = -1;
                        var298 = -1;
                        var300 = 524287;
                    }
                    if (field314 != var299 || field315 != var298) {
                        int var301 = var299 - field314;
                        field314 = var299;
                        int var302 = var298 - field315;
                        field315 = var298;
                        if (field316 < 8 && var301 >= -32 && var301 <= 31 && var302 >= -32 && var302 <= 31) {
                            var301 += 32;
                            var302 += 32;
                            field342.method2367((field316 << 12) + (var301 << 6) + var302);
                            field316 = 0;
                        } else if (field316 < 8) {
                            field342.method2309((field316 << 19) + 8388608 + var300);
                            field316 = 0;
                        } else {
                            field342.method2310((field316 << 19) + -1073741824 + var300);
                            field316 = 0;
                        }
                    } else if (field316 < 2047) {
                        field316++;
                    }
                }
                field342.method2319(field342.field1894 - var295);
                if (var296 >= Statics.field167.field200) {
                    Statics.field167.field200 = 0;
                } else {
                    Statics.field167.field200 -= var296;
                    for (int var303 = 0; var303 < Statics.field167.field200; var303++) {
                        Statics.field167.field202[var303] = Statics.field167.field202[var296 + var303];
                        Statics.field167.field204[var303] = Statics.field167.field204[var296 + var303];
                    }
                }
            }
        }
        if (class135.field2043 == 1 || !Statics.field1352 && class135.field2043 == 4 || class135.field2043 == 2) {
            long var305 = (class135.field2054 - field313 * -1L) / 50L;
            if (var305 > 4095L) {
                var305 = 4095L;
            }
            field313 = class135.field2054 * -1L;
            int var307 = class135.field2048;
            if (var307 < 0) {
                var307 = 0;
            } else if (var307 > Statics.field2056) {
                var307 = Statics.field2056;
            }
            int var308 = class135.field2052;
            if (var308 < 0) {
                var308 = 0;
            } else if (var308 > Statics.field2066) {
                var308 = Statics.field2066;
            }
            int var309 = (int) var305;
            field342.method2574(32);
            field342.method2367((class135.field2043 == 2 ? 1 : 0) + (var309 << 1));
            field342.method2367(var308);
            field342.method2367(var307);
        }
        if (class132.field2011 > 0) {
            field342.method2574(156);
            field342.method2367(0);
            int var310 = field342.field1894;
            long var311 = Statics.method2875();
            for (int var313 = 0; var313 < class132.field2011; var313++) {
                long var314 = var311 - field527;
                if (var314 > 16777215L) {
                    var314 = 16777215L;
                }
                field527 = var311;
                field342.method2344(class132.field2017[var313]);
                field342.method2309((int) var314);
            }
            field342.method2318(field342.field1894 - var310);
        }
        if (field420 > 0) {
            field420--;
        }
        if (class132.field2004[96] || class132.field2004[97] || class132.field2004[98] || class132.field2004[99]) {
            field362 = true;
        }
        if (field362 && field420 <= 0) {
            field420 = 20;
            field362 = false;
            field342.method2574(238);
            field342.method2353(field574);
            field342.method2360(field394);
        }
        if (Statics.field2201 && !field531) {
            field531 = true;
            field342.method2574(93);
            field342.method2307(1);
        }
        if (!Statics.field2201 && field531) {
            field531 = false;
            field342.method2574(93);
            field342.method2307(0);
        }
        if (field307 && Statics.field3101 != field324) {
            method3097(Statics.field625, Statics.field191, Statics.field3101, Statics.field143.field847[0], Statics.field143.field848[0]);
        } else if (Statics.field3101 != field530) {
            field530 = Statics.field3101;
            int var316 = Statics.field3101;
            int[] var317 = Statics.field51.field1380;
            int var318 = var317.length;
            for (int var319 = 0; var319 < var318; var319++) {
                var317[var319] = 0;
            }
            for (int var320 = 1; var320 < 103; var320++) {
                int var321 = (103 - var320) * 2048 + 24628;
                for (int var322 = 1; var322 < 103; var322++) {
                    if ((class6.field89[var316][var322][var320] & 0x18) == 0) {
                        Statics.field1555.method1925(var317, var321, 512, var316, var322, var320);
                    }
                    if (var316 < 3 && (class6.field89[var316 + 1][var322][var320] & 0x8) != 0) {
                        Statics.field1555.method1925(var317, var321, 512, var316 + 1, var322, var320);
                    }
                    var321 += 4;
                }
            }
            int var323 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var324 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field51.method1630();
            for (int var325 = 1; var325 < 103; var325++) {
                for (int var326 = 1; var326 < 103; var326++) {
                    if ((class6.field89[var316][var326][var325] & 0x18) == 0) {
                        Statics.method155(var316, var326, var325, var323, var324);
                    }
                    if (var316 < 3 && (class6.field89[var316 + 1][var326][var325] & 0x8) != 0) {
                        Statics.method155(var316 + 1, var326, var325, var323, var324);
                    }
                }
            }
            field383 = 0;
            for (int var327 = 0; var327 < 104; var327++) {
                for (int var328 = 0; var328 < 104; var328++) {
                    int var329 = Statics.field1555.method1836(Statics.field3101, var327, var328);
                    if (var329 != 0) {
                        int var330 = var329 >> 14 & 0x7FFF;
                        int var331 = class39.method902(var330).field907;
                        if (var331 >= 0) {
                            int var332 = var327;
                            int var333 = var328;
                            if (var331 != 22 && var331 != 29 && var331 != 34 && var331 != 36 && var331 != 46 && var331 != 47 && var331 != 48) {
                                int[][] var334 = field511[Statics.field3101].field3161;
                                for (int var335 = 0; var335 < 10; var335++) {
                                    int var336 = (int) (Math.random() * 4.0D);
                                    if (var336 == 0 && var332 > 0 && var332 > var327 - 3 && (var334[var332 - 1][var333] & 0x1240108) == 0) {
                                        var332--;
                                    }
                                    if (var336 == 1 && var332 < 103 && var332 < var327 + 3 && (var334[var332 + 1][var333] & 0x1240180) == 0) {
                                        var332++;
                                    }
                                    if (var336 == 2 && var333 > 0 && var333 > var328 - 3 && (var334[var332][var333 - 1] & 0x1240102) == 0) {
                                        var333--;
                                    }
                                    if (var336 == 3 && var333 < 103 && var333 < var328 + 3 && (var334[var332][var333 + 1] & 0x1240120) == 0) {
                                        var333++;
                                    }
                                }
                            }
                            field563[field383] = Statics.field2834[var331];
                            field532[field383] = var332;
                            field533[field383] = var333;
                            field383++;
                        }
                    }
                }
            }
            Statics.field1877.method1621();
        }
        if (field310 != 30) {
            return;
        }
        method7();
        int var10002;
        for (int var337 = 0; var337 < field544; var337++) {
            var10002 = field547[var337]--;
            if (field547[var337] >= -10) {
                class57 var339 = field549[var337];
                if (var339 == null) {
                    class57 var411 = (class57) null;
                    var339 = class57.method1242(Statics.field1807, field545[var337], 0);
                    if (var339 == null) {
                        continue;
                    }
                    field547[var337] += var339.method1250();
                    field549[var337] = var339;
                }
                if (field547[var337] < 0) {
                    int var346;
                    if (field548[var337] == 0) {
                        var346 = field558;
                    } else {
                        int var340 = (field548[var337] & 0xFF) * 128;
                        int var341 = field548[var337] >> 16 & 0xFF;
                        int var342 = var341 * 128 + 64 - Statics.field143.field814;
                        if (var342 < 0) {
                            var342 = -var342;
                        }
                        int var343 = field548[var337] >> 8 & 0xFF;
                        int var344 = var343 * 128 + 64 - Statics.field143.field821;
                        if (var344 < 0) {
                            var344 = -var344;
                        }
                        int var345 = var342 + var344 - 128;
                        if (var345 > var340) {
                            field547[var337] = -100;
                            continue;
                        }
                        if (var345 < 0) {
                            var345 = 0;
                        }
                        var346 = field525 * (var340 - var345) / var340;
                    }
                    if (var346 > 0) {
                        class61 var347 = var339.method1243().method1283(Statics.field107);
                        class63 var348 = class63.method1309(var347, 100, var346);
                        var348.method1355(field546[var337] - 1);
                        Statics.field2060.method1184(var348);
                    }
                    field547[var337] = -100;
                }
            } else {
                field544--;
                for (int var338 = var337; var338 < field544; var338++) {
                    field545[var338] = field545[var338 + 1];
                    field549[var338] = field549[var338 + 1];
                    field546[var338] = field546[var338 + 1];
                    field547[var338] = field547[var338 + 1];
                    field548[var338] = field548[var338 + 1];
                }
                var337--;
            }
        }
        if (field540 && !class177.method153()) {
            if (field538 != 0 && field539 != -1) {
                class177.method708(Statics.field677, field539, 0, field538, false);
            }
            field540 = false;
        }
        field512++;
        if (field512 > 750) {
            method1270();
            return;
        }
        for (int var349 = -1; var349 < field409; var349++) {
            int var350;
            if (var349 == -1) {
                var350 = 2047;
            } else {
                var350 = field447[var349];
            }
            class3 var351 = field419[var350];
            if (var351 != null) {
                method2643(var351, 1);
            }
        }
        method2521();
        for (int var352 = -1; var352 < field409; var352++) {
            int var353;
            if (var352 == -1) {
                var353 = 2047;
            } else {
                var353 = field447[var352];
            }
            class3 var354 = field419[var353];
            if (var354 != null && var354.field809 > 0) {
                var354.field809--;
                if (var354.field809 == 0) {
                    var354.field806 = null;
                }
            }
        }
        for (int var355 = 0; var355 < field340; var355++) {
            int var356 = field341[var355];
            class33 var357 = field573[var356];
            if (var357 != null && var357.field809 > 0) {
                var357.field809--;
                if (var357.field809 == 0) {
                    var357.field806 = null;
                }
            }
        }
        field430++;
        if (field460 != 0) {
            field408 += 20;
            if (field408 >= 400) {
                field460 = 0;
            }
        }
        if (Statics.field2520 != null) {
            field328++;
            if (field328 >= 15) {
                method1085(Statics.field2520);
                Statics.field2520 = null;
            }
        }
        class167 var358 = Statics.field1573;
        class167 var359 = Statics.field14;
        Statics.field1573 = null;
        Statics.field14 = null;
        field478 = null;
        field482 = false;
        field479 = false;
        field524 = 0;
        while (class132.method3606() && field524 < 128) {
            if (field468 >= 2 && class132.field2004[82] && Statics.field626 == 66) {
                String var360 = class11.method2887();
                Statics.field320.setContents(new StringSelection(var360), (ClipboardOwner) null);
            } else {
                field560[field524] = Statics.field626;
                field377[field524] = Statics.field911;
                field524++;
            }
        }
        int var361 = field461;
        int var362 = Statics.field2066;
        int var363 = Statics.field2056;
        if (class167.method2884(var361)) {
            method2162(Statics.field1130[var361], -1, 0, 0, var362, var363, 0, 0);
        }
        field385++;
        while (true) {
            class1 var364;
            class167 var365;
            class167 var366;
            do {
                var364 = (class1) field501.method3488();
                if (var364 == null) {
                    while (true) {
                        class1 var367;
                        class167 var368;
                        class167 var369;
                        do {
                            var367 = (class1) field458.method3488();
                            if (var367 == null) {
                                while (true) {
                                    class1 var370;
                                    class167 var371;
                                    class167 var372;
                                    do {
                                        var370 = (class1) field500.method3488();
                                        if (var370 == null) {
                                            method2872();
                                            if (field474 != null) {
                                                method1791();
                                            }
                                            if (Statics.field259 != null) {
                                                method1085(Statics.field259);
                                                field452++;
                                                if (class135.field2044 == 0) {
                                                    if (field303) {
                                                        if (Statics.field901 == Statics.field259 && field412 != field393) {
                                                            class167 var373 = Statics.field259;
                                                            byte var374 = 0;
                                                            if (field354 == 1 && var373.field2680 == 206) {
                                                                var374 = 1;
                                                            }
                                                            if (var373.field2792[field393] <= 0) {
                                                                var374 = 0;
                                                            }
                                                            int var375 = method147(var373);
                                                            boolean var376 = (var375 >> 29 & 0x1) != 0;
                                                            if (var376) {
                                                                int var377 = field412;
                                                                int var378 = field393;
                                                                var373.field2792[var378] = var373.field2792[var377];
                                                                var373.field2793[var378] = var373.field2793[var377];
                                                                var373.field2792[var377] = -1;
                                                                var373.field2793[var377] = 0;
                                                            } else if (var374 == 1) {
                                                                int var379 = field412;
                                                                int var380 = field393;
                                                                while (var379 != var380) {
                                                                    if (var379 > var380) {
                                                                        var373.method3104(var379 - 1, var379);
                                                                        var379--;
                                                                    } else if (var379 < var380) {
                                                                        var373.method3104(var379 + 1, var379);
                                                                        var379++;
                                                                    }
                                                                }
                                                            } else {
                                                                var373.method3104(field393, field412);
                                                            }
                                                            field342.method2574(212);
                                                            field342.method2360(field412);
                                                            field342.method2367(field393);
                                                            field342.method2359(Statics.field259.field2807);
                                                            field342.method2307(var374);
                                                        }
                                                    } else if ((field441 == 1 || method2641(field443 - 1)) && field443 > 2) {
                                                        method904(field413, field414);
                                                    } else if (field443 > 0) {
                                                        method588(field413, field414);
                                                    }
                                                    field328 = 10;
                                                    class135.field2043 = 0;
                                                    Statics.field259 = null;
                                                } else if (field452 >= 5 && (class135.field2045 > field413 + 5 || class135.field2045 < field413 - 5 || class135.field2046 * 200873089 > field414 + 5 || class135.field2046 * 200873089 < field414 - 5)) {
                                                    field303 = true;
                                                }
                                            }
                                            if (class84.field1448 != -1) {
                                                int var381 = class84.field1448;
                                                int var382 = class84.field1456;
                                                field342.method2574(28);
                                                field342.method2307(5);
                                                field342.method2353(Statics.field2578 + var382);
                                                field342.method2360(Statics.field1367 + var381);
                                                field342.method2346(class132.field2004[82] ? (class132.field2004[81] ? 2 : 1) : 0);
                                                class84.field1448 = -1;
                                                field406 = class135.field2052;
                                                field407 = class135.field2048;
                                                field460 = 1;
                                                field408 = 0;
                                                field513 = var381;
                                                field536 = var382;
                                            }
                                            if (Statics.field1573 != var358) {
                                                if (var358 != null) {
                                                    method1085(var358);
                                                }
                                                if (Statics.field1573 != null) {
                                                    method1085(Statics.field1573);
                                                }
                                            }
                                            if (Statics.field14 != var359 && field453 == field359) {
                                                if (var359 != null) {
                                                    method1085(var359);
                                                }
                                                if (Statics.field14 != null) {
                                                    method1085(Statics.field14);
                                                }
                                            }
                                            if (Statics.field14 == null) {
                                                if (field359 > 0) {
                                                    field359--;
                                                }
                                            } else if (field359 < field453) {
                                                field359++;
                                                if (field453 == field359) {
                                                    method1085(Statics.field14);
                                                }
                                            }
                                            int var383 = field364 + Statics.field143.field814;
                                            int var384 = field366 + Statics.field143.field821;
                                            if (Statics.field245 - var383 < -500 || Statics.field245 - var383 > 500 || Statics.field2020 - var384 < -500 || Statics.field2020 - var384 > 500) {
                                                Statics.field245 = var383;
                                                Statics.field2020 = var384;
                                            }
                                            if (Statics.field245 != var383) {
                                                Statics.field245 += (var383 - Statics.field245) / 16;
                                            }
                                            if (Statics.field2020 != var384) {
                                                Statics.field2020 += (var384 - Statics.field2020) / 16;
                                            }
                                            if (class135.field2044 == 4 && Statics.field1352) {
                                                int var385 = class135.field2046 * 200873089 - field388 * 200873089;
                                                field386 = var385 * 2;
                                                field388 = (var385 == -1 || var385 == 1 ? class135.field2046 * 200873089 : (field388 * 200873089 + class135.field2046 * 200873089) / 2) * 2139827073;
                                                int var386 = field387 - class135.field2045;
                                                field516 = var386 * 2;
                                                field387 = var386 == -1 || var386 == 1 ? class135.field2045 : (field387 + class135.field2045) / 2;
                                            } else {
                                                if (class132.field2004[96]) {
                                                    field516 += (-24 - field516) / 2;
                                                } else if (class132.field2004[97]) {
                                                    field516 += (24 - field516) / 2;
                                                } else {
                                                    field516 /= 2;
                                                }
                                                if (class132.field2004[98]) {
                                                    field386 += (12 - field386) / 2;
                                                } else if (class132.field2004[99]) {
                                                    field386 += (-12 - field386) / 2;
                                                } else {
                                                    field386 /= 2;
                                                }
                                                field388 = class135.field2046;
                                                field387 = class135.field2045;
                                            }
                                            field574 = field516 / 2 + field574 & 0x7FF;
                                            field394 += field386 / 2;
                                            if (field394 < 128) {
                                                field394 = 128;
                                            }
                                            if (field394 > 383) {
                                                field394 = 383;
                                            }
                                            int var387 = Statics.field245 >> 7;
                                            int var388 = Statics.field2020 >> 7;
                                            int var389 = method2267(Statics.field245, Statics.field2020, Statics.field3101);
                                            int var390 = 0;
                                            if (var387 > 3 && var388 > 3 && var387 < 100 && var388 < 100) {
                                                for (int var391 = var387 - 4; var391 <= var387 + 4; var391++) {
                                                    for (int var392 = var388 - 4; var392 <= var388 + 4; var392++) {
                                                        int var393 = Statics.field3101;
                                                        if (var393 < 3 && (class6.field89[1][var391][var392] & 0x2) == 2) {
                                                            var393++;
                                                        }
                                                        int var394 = var389 - class6.field88[var393][var391][var392];
                                                        if (var394 > var390) {
                                                            var390 = var394;
                                                        }
                                                    }
                                                }
                                            }
                                            int var395 = var390 * 192;
                                            if (var395 > 98048) {
                                                var395 = 98048;
                                            }
                                            if (var395 < 32768) {
                                                var395 = 32768;
                                            }
                                            if (var395 > field506) {
                                                field506 += (var395 - field506) / 24;
                                            } else if (var395 < field506) {
                                                field506 += (var395 - field506) / 80;
                                            }
                                            if (field550) {
                                                method2657();
                                            }
                                            for (int var396 = 0; var396 < 5; var396++) {
                                                var10002 = field555[var396]++;
                                            }
                                            Statics.field15.method192();
                                            int var397 = ++class135.field2040 - 1;
                                            int var399 = class132.method1970();
                                            if (var397 > 15000 && var399 > 15000) {
                                                field352 = 250;
                                                class135.field2040 = 14500;
                                                field342.method2574(187);
                                            }
                                            field370++;
                                            if (field370 > 500) {
                                                field370 = 0;
                                                int var400 = (int) (Math.random() * 8.0D);
                                                if ((var400 & 0x1) == 1) {
                                                    field364 += field365;
                                                }
                                                if ((var400 & 0x2) == 2) {
                                                    field366 += field367;
                                                }
                                                if ((var400 & 0x4) == 4) {
                                                    field368 += field369;
                                                }
                                            }
                                            if (field364 < -50) {
                                                field365 = 2;
                                            }
                                            if (field364 > 50) {
                                                field365 = -2;
                                            }
                                            if (field366 < -55) {
                                                field367 = 2;
                                            }
                                            if (field366 > 55) {
                                                field367 = -2;
                                            }
                                            if (field368 < -40) {
                                                field369 = 1;
                                            }
                                            if (field368 > 40) {
                                                field369 = -1;
                                            }
                                            field375++;
                                            if (field375 > 500) {
                                                field375 = 0;
                                                int var401 = (int) (Math.random() * 8.0D);
                                                if ((var401 & 0x1) == 1) {
                                                    field371 += field483;
                                                }
                                                if ((var401 & 0x2) == 2) {
                                                    field373 += field526;
                                                }
                                            }
                                            if (field371 < -60) {
                                                field483 = 2;
                                            }
                                            if (field371 > 60) {
                                                field483 = -2;
                                            }
                                            if (field373 < -20) {
                                                field526 = 1;
                                            }
                                            if (field373 > 10) {
                                                field526 = -1;
                                            }
                                            for (class37 var402 = (class37) field572.method3452(); var402 != null; var402 = (class37) field572.method3453()) {
                                                if ((long) var402.field862 < Statics.method2875() / 1000L - 5L) {
                                                    if (var402.field860 > 0) {
                                                        class11.method1792(5, "", var402.field859 + class151.field2376);
                                                    }
                                                    if (var402.field860 == 0) {
                                                        class11.method1792(5, "", var402.field859 + class151.field2377);
                                                    }
                                                    var402.method3560();
                                                }
                                            }
                                            field343++;
                                            if (field343 > 50) {
                                                field342.method2574(250);
                                            }
                                            try {
                                                if (Statics.field2150 != null && field342.field1894 > 0) {
                                                    Statics.field2150.method2779(field342.field1891, 0, field342.field1894);
                                                    field342.field1894 = 0;
                                                    field343 = 0;
                                                }
                                            } catch (IOException var404) {
                                                method1270();
                                            }
                                            return;
                                        }
                                        var371 = var370.field3;
                                        if (var371.field2677 < 0) {
                                            break;
                                        }
                                        var372 = class167.method1258(var371.field2782);
                                    } while (var372 == null || var372.field2786 == null || var371.field2677 >= var372.field2786.length || var372.field2786[var371.field2677] != var371);
                                    class35.method26(var370);
                                }
                            }
                            var368 = var367.field3;
                            if (var368.field2677 < 0) {
                                break;
                            }
                            var369 = class167.method1258(var368.field2782);
                        } while (var369 == null || var369.field2786 == null || var368.field2677 >= var369.field2786.length || var369.field2786[var368.field2677] != var368);
                        class35.method26(var367);
                    }
                }
                var365 = var364.field3;
                if (var365.field2677 < 0) {
                    break;
                }
                var366 = class167.method1258(var365.field2782);
            } while (var366 == null || var366.field2786 == null || var365.field2677 >= var366.field2786.length || var366.field2786[var365.field2677] != var365);
            class35.method26(var364);
        }
    }

    @ObfuscatedName("ay.c(B)V")
    public static final void method1017() {
        if (Statics.field682 != null) {
            Statics.field682.method1201();
        }
        if (Statics.field543 != null) {
            Statics.field543.method1201();
        }
    }

    @ObfuscatedName("aa.x(Lax;IIII)V")
    public static void method652(class41 arg0, int arg1, int arg2, int arg3) {
        if (field544 >= 50 || field525 == 0 || arg0.field968 == null || arg1 >= arg0.field968.length) {
            return;
        }
        int var4 = arg0.field968[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field545[field544] = var5;
        field546[field544] = var6;
        field547[field544] = 0;
        field549[field544] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field548[field544] = (var8 << 16) + (var9 << 8) + var7;
        field544++;
    }

    @ObfuscatedName("dt.q(I)V")
    public static final void method2657() {
        int var0 = Statics.field149 * 128 + 64;
        int var1 = Statics.field1 * 128 + 64;
        int var2 = method2267(var0, var1, Statics.field3101) - Statics.field1880;
        if (Statics.field276 < var0) {
            Statics.field276 += Statics.field168 * (var0 - Statics.field276) / 1000 + Statics.field111;
            if (Statics.field276 > var0) {
                Statics.field276 = var0;
            }
        }
        if (Statics.field276 > var0) {
            Statics.field276 -= Statics.field168 * (Statics.field276 - var0) / 1000 + Statics.field111;
            if (Statics.field276 < var0) {
                Statics.field276 = var0;
            }
        }
        if (Statics.field789 < var2) {
            Statics.field789 += Statics.field168 * (var2 - Statics.field789) / 1000 + Statics.field111;
            if (Statics.field789 > var2) {
                Statics.field789 = var2;
            }
        }
        if (Statics.field789 > var2) {
            Statics.field789 -= Statics.field168 * (Statics.field789 - var2) / 1000 + Statics.field111;
            if (Statics.field789 < var2) {
                Statics.field789 = var2;
            }
        }
        if (Statics.field215 < var1) {
            Statics.field215 += Statics.field168 * (var1 - Statics.field215) / 1000 + Statics.field111;
            if (Statics.field215 > var1) {
                Statics.field215 = var1;
            }
        }
        if (Statics.field215 > var1) {
            Statics.field215 -= Statics.field168 * (Statics.field215 - var1) / 1000 + Statics.field111;
            if (Statics.field215 < var1) {
                Statics.field215 = var1;
            }
        }
        int var3 = Statics.field2149 * 128 + 64;
        int var4 = Statics.field242 * 128 + 64;
        int var5 = method2267(var3, var4, Statics.field3101) - Statics.field237;
        int var6 = var3 - Statics.field276;
        int var7 = var5 - Statics.field789;
        int var8 = var4 - Statics.field215;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field12 < var10) {
            Statics.field12 += Statics.field77 * (var10 - Statics.field12) / 1000 + Statics.field1938;
            if (Statics.field12 > var10) {
                Statics.field12 = var10;
            }
        }
        if (Statics.field12 > var10) {
            Statics.field12 -= Statics.field77 * (Statics.field12 - var10) / 1000 + Statics.field1938;
            if (Statics.field12 < var10) {
                Statics.field12 = var10;
            }
        }
        int var12 = var11 - Statics.field106;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field106 += Statics.field77 * var12 / 1000 + Statics.field1938;
            Statics.field106 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field106 -= Statics.field77 * -var12 / 1000 + Statics.field1938;
            Statics.field106 &= 0x7FF;
        }
        int var13 = var11 - Statics.field106;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field106 = var11;
        }
    }

    @ObfuscatedName("de.b(B)V")
    public static final void method2521() {
        for (int var0 = 0; var0 < field340; var0++) {
            int var1 = field341[var0];
            class33 var2 = field573[var1];
            if (var2 != null) {
                method2643(var2, var2.field764.field868);
            }
        }
    }

    @ObfuscatedName("dc.k(Lav;II)V")
    public static final void method2643(class36 arg0, int arg1) {
        if (arg0.field838 > field477) {
            int var2 = arg0.field838 - field477;
            int var3 = arg0.field834 * 128 + arg0.field797 * 64;
            int var4 = arg0.field836 * 128 + arg0.field797 * 64;
            arg0.field814 += (var3 - arg0.field814) / var2;
            arg0.field821 += (var4 - arg0.field821) / var2;
            arg0.field850 = 0;
            if (arg0.field840 == 0) {
                arg0.field843 = 1024;
            }
            if (arg0.field840 == 1) {
                arg0.field843 = 1536;
            }
            if (arg0.field840 == 2) {
                arg0.field843 = 0;
            }
            if (arg0.field840 == 3) {
                arg0.field843 = 512;
            }
        } else if (arg0.field839 >= field477) {
            if (field477 == arg0.field839 || arg0.field824 == -1 || arg0.field796 != 0 || arg0.field811 + 1 > class41.method1016(arg0.field824).field963[arg0.field825]) {
                int var5 = arg0.field839 - arg0.field838;
                int var6 = field477 - arg0.field838;
                int var7 = arg0.field834 * 128 + arg0.field797 * 64;
                int var8 = arg0.field836 * 128 + arg0.field797 * 64;
                int var9 = arg0.field845 * 128 + arg0.field797 * 64;
                int var10 = arg0.field827 * 128 + arg0.field797 * 64;
                arg0.field814 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field821 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field850 = 0;
            if (arg0.field840 == 0) {
                arg0.field843 = 1024;
            }
            if (arg0.field840 == 1) {
                arg0.field843 = 1536;
            }
            if (arg0.field840 == 2) {
                arg0.field843 = 0;
            }
            if (arg0.field840 == 3) {
                arg0.field843 = 512;
            }
            arg0.field795 = arg0.field843;
        } else {
            method2893(arg0);
        }
        if (arg0.field814 < 128 || arg0.field821 < 128 || arg0.field814 >= 13184 || arg0.field821 >= 13184) {
            arg0.field824 = -1;
            arg0.field835 = -1;
            arg0.field838 = 0;
            arg0.field839 = 0;
            arg0.field814 = arg0.field847[0] * 128 + arg0.field797 * 64;
            arg0.field821 = arg0.field848[0] * 128 + arg0.field797 * 64;
            arg0.method713();
        }
        if (Statics.field143 == arg0 && (arg0.field814 < 1536 || arg0.field821 < 1536 || arg0.field814 >= 11776 || arg0.field821 >= 11776)) {
            arg0.field824 = -1;
            arg0.field835 = -1;
            arg0.field838 = 0;
            arg0.field839 = 0;
            arg0.field814 = arg0.field847[0] * 128 + arg0.field797 * 64;
            arg0.field821 = arg0.field848[0] * 128 + arg0.field797 * 64;
            arg0.method713();
        }
        method2880(arg0);
        method35(arg0);
    }

    @ObfuscatedName("ee.at(Lav;I)V")
    public static final void method2893(class36 arg0) {
        arg0.field798 = arg0.field844;
        if (arg0.field846 == 0) {
            arg0.field850 = 0;
            return;
        }
        if (arg0.field824 != -1 && arg0.field796 == 0) {
            class41 var1 = class41.method1016(arg0.field824);
            if (arg0.field851 > 0 && var1.field979 == 0) {
                arg0.field850++;
                return;
            }
            if (arg0.field851 <= 0 && var1.field974 == 0) {
                arg0.field850++;
                return;
            }
        }
        int var2 = arg0.field814;
        int var3 = arg0.field821;
        int var4 = arg0.field847[arg0.field846 - 1] * 128 + arg0.field797 * 64;
        int var5 = arg0.field848[arg0.field846 - 1] * 128 + arg0.field797 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field814 = var4;
            arg0.field821 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field843 = 1280;
            } else if (var3 > var5) {
                arg0.field843 = 1792;
            } else {
                arg0.field843 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field843 = 768;
            } else if (var3 > var5) {
                arg0.field843 = 256;
            } else {
                arg0.field843 = 512;
            }
        } else if (var3 < var5) {
            arg0.field843 = 1024;
        } else if (var3 > var5) {
            arg0.field843 = 0;
        }
        int var6 = arg0.field843 - arg0.field795 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field802;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field837;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field804;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field803;
        }
        if (var7 == -1) {
            var7 = arg0.field837;
        }
        arg0.field798 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class33) {
            var9 = ((class33) arg0).field764.field896;
        }
        if (var9) {
            if (arg0.field843 != arg0.field795 && arg0.field818 == -1 && arg0.field849 != 0) {
                var8 = 2;
            }
            if (arg0.field846 > 2) {
                var8 = 6;
            }
            if (arg0.field846 > 3) {
                var8 = 8;
            }
            if (arg0.field850 > 0 && arg0.field846 > 1) {
                var8 = 8;
                arg0.field850--;
            }
        } else {
            if (arg0.field846 > 1) {
                var8 = 6;
            }
            if (arg0.field846 > 2) {
                var8 = 8;
            }
            if (arg0.field850 > 0 && arg0.field846 > 1) {
                var8 = 8;
                arg0.field850--;
            }
        }
        if (arg0.field826[arg0.field846 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field837 == arg0.field798 && arg0.field805 != -1) {
            arg0.field798 = arg0.field805;
        }
        if (var2 < var4) {
            arg0.field814 += var8;
            if (arg0.field814 > var4) {
                arg0.field814 = var4;
            }
        } else if (var2 > var4) {
            arg0.field814 -= var8;
            if (arg0.field814 < var4) {
                arg0.field814 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field821 += var8;
            if (arg0.field821 > var5) {
                arg0.field821 = var5;
            }
        } else if (var3 > var5) {
            arg0.field821 -= var8;
            if (arg0.field821 < var5) {
                arg0.field821 = var5;
            }
        }
        if (arg0.field814 == var4 && arg0.field821 == var5) {
            arg0.field846--;
            if (arg0.field851 > 0) {
                arg0.field851--;
            }
        }
    }

    @ObfuscatedName("ex.au(Lav;B)V")
    public static final void method2880(class36 arg0) {
        if (arg0.field849 == 0) {
            return;
        }
        if (arg0.field818 != -1 && arg0.field818 < 32768) {
            class33 var1 = field573[arg0.field818];
            if (var1 != null) {
                int var2 = arg0.field814 - var1.field814;
                int var3 = arg0.field821 - var1.field821;
                if (var2 != 0 || var3 != 0) {
                    arg0.field843 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field818 >= 32768) {
            int var4 = arg0.field818 - 32768;
            if (field425 == var4) {
                var4 = 2047;
            }
            class3 var5 = field419[var4];
            if (var5 != null) {
                int var6 = arg0.field814 - var5.field814;
                int var7 = arg0.field821 - var5.field821;
                if (var6 != 0 || var7 != 0) {
                    arg0.field843 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field794 != 0 || arg0.field853 != 0) && (arg0.field846 == 0 || arg0.field850 > 0)) {
            int var8 = arg0.field814 - (arg0.field794 * 64 - Statics.field1367 * 64 - Statics.field1367 * 64);
            int var9 = arg0.field821 - (arg0.field853 * 64 - Statics.field2578 * 64 - Statics.field2578 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field843 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field794 = 0;
            arg0.field853 = 0;
        }
        int var10 = arg0.field843 - arg0.field795 & 0x7FF;
        if (var10 == 0) {
            arg0.field829 = 0;
            return;
        }
        arg0.field829++;
        if (var10 > 1024) {
            arg0.field795 -= arg0.field849;
            boolean var11 = true;
            if (var10 < arg0.field849 || var10 > 2048 - arg0.field849) {
                arg0.field795 = arg0.field843;
                var11 = false;
            }
            if (arg0.field844 == arg0.field798 && (arg0.field829 > 25 || var11)) {
                if (arg0.field799 == -1) {
                    arg0.field798 = arg0.field837;
                } else {
                    arg0.field798 = arg0.field799;
                }
            }
        } else {
            arg0.field795 += arg0.field849;
            boolean var12 = true;
            if (var10 < arg0.field849 || var10 > 2048 - arg0.field849) {
                arg0.field795 = arg0.field843;
                var12 = false;
            }
            if (arg0.field844 == arg0.field798 && (arg0.field829 > 25 || var12)) {
                if (arg0.field800 == -1) {
                    arg0.field798 = arg0.field837;
                } else {
                    arg0.field798 = arg0.field800;
                }
            }
        }
        arg0.field795 &= 0x7FF;
    }

    @ObfuscatedName("w.aa(Lav;B)V")
    public static final void method35(class36 arg0) {
        arg0.field833 = false;
        if (arg0.field798 != -1) {
            class41 var1 = class41.method1016(arg0.field798);
            if (var1 == null || var1.field970 == null) {
                arg0.field798 = -1;
            } else {
                arg0.field823++;
                if (arg0.field819 < var1.field970.length && arg0.field823 > var1.field963[arg0.field819]) {
                    arg0.field823 = 1;
                    arg0.field819++;
                    method652(var1, arg0.field819, arg0.field814, arg0.field821);
                }
                if (arg0.field819 >= var1.field970.length) {
                    arg0.field823 = 0;
                    arg0.field819 = 0;
                    method652(var1, arg0.field819, arg0.field814, arg0.field821);
                }
            }
        }
        if (arg0.field835 != -1 && field477 >= arg0.field832) {
            if (arg0.field830 < 0) {
                arg0.field830 = 0;
            }
            int var2 = class42.method122(arg0.field835).field991;
            if (var2 == -1) {
                arg0.field835 = -1;
            } else {
                class41 var3 = class41.method1016(var2);
                if (var3 == null || var3.field970 == null) {
                    arg0.field835 = -1;
                } else {
                    arg0.field831++;
                    if (arg0.field830 < var3.field970.length && arg0.field831 > var3.field963[arg0.field830]) {
                        arg0.field831 = 1;
                        arg0.field830++;
                        method652(var3, arg0.field830, arg0.field814, arg0.field821);
                    }
                    if (arg0.field830 >= var3.field970.length && (arg0.field830 < 0 || arg0.field830 >= var3.field970.length)) {
                        arg0.field835 = -1;
                    }
                }
            }
        }
        if (arg0.field824 != -1 && arg0.field796 <= 1) {
            class41 var4 = class41.method1016(arg0.field824);
            if (var4.field979 == 1 && arg0.field851 > 0 && arg0.field838 <= field477 && arg0.field839 < field477) {
                arg0.field796 = 1;
                return;
            }
        }
        if (arg0.field824 != -1 && arg0.field796 == 0) {
            class41 var5 = class41.method1016(arg0.field824);
            if (var5 == null || var5.field970 == null) {
                arg0.field824 = -1;
            } else {
                arg0.field811++;
                if (arg0.field825 < var5.field970.length && arg0.field811 > var5.field963[arg0.field825]) {
                    arg0.field811 = 1;
                    arg0.field825++;
                    method652(var5, arg0.field825, arg0.field814, arg0.field821);
                }
                if (arg0.field825 >= var5.field970.length) {
                    arg0.field825 -= var5.field972;
                    arg0.field828++;
                    if (arg0.field828 >= var5.field985) {
                        arg0.field824 = -1;
                    } else if (arg0.field825 >= 0 && arg0.field825 < var5.field970.length) {
                        method652(var5, arg0.field825, arg0.field814, arg0.field821);
                    } else {
                        arg0.field824 = -1;
                    }
                }
                arg0.field833 = var5.field971;
            }
        }
        if (arg0.field796 > 0) {
            arg0.field796--;
        }
    }

    @ObfuscatedName("s.ak(Lz;III)V")
    public static void method182(class3 arg0, int arg1, int arg2) {
        if (arg0.field824 == arg1 && arg1 != -1) {
            int var3 = class41.method1016(arg1).field981;
            if (var3 == 1) {
                arg0.field825 = 0;
                arg0.field811 = 0;
                arg0.field796 = arg2;
                arg0.field828 = 0;
            }
            if (var3 == 2) {
                arg0.field828 = 0;
            }
        } else if (arg1 == -1 || arg0.field824 == -1 || class41.method1016(arg1).field965 >= class41.method1016(arg0.field824).field965) {
            arg0.field824 = arg1;
            arg0.field825 = 0;
            arg0.field811 = 0;
            arg0.field796 = arg2;
            arg0.field828 = 0;
            arg0.field851 = arg0.field846;
        }
    }

    @ObfuscatedName("h.an(I)I")
    public static int method563() {
        return field515 ? 2 : 1;
    }

    @ObfuscatedName("aw.ad(II)V")
    public static void method901(int arg0) {
        field514 = 0L;
        if (arg0 >= 2) {
            field515 = true;
        } else {
            field515 = false;
        }
        method591();
        if (field310 >= 25) {
            method980();
        }
        field2101 = true;
    }

    @ObfuscatedName("de.ap(I)V")
    public static void method2519() {
        class132.method2066(Statics.field1706);
        Canvas var0 = Statics.field1706;
        var0.removeMouseListener(class135.field2042);
        var0.removeMouseMotionListener(class135.field2042);
        var0.removeFocusListener(class135.field2042);
        class135.field2059 = 0;
        if (Statics.field175 != null) {
            Statics.field175.method2645(Statics.field1706);
        }
        Statics.field2072.method2791();
        Statics.field1706.setBackground(Color.black);
        Canvas var1 = Statics.field1706;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class132.field2013);
        var1.addFocusListener(class132.field2013);
        class135.method2688(Statics.field1706);
        if (Statics.field175 != null) {
            Statics.field175.method2652(Statics.field1706);
        }
        if (field461 != -1) {
            method3429(field461, Statics.field2066, Statics.field2056, false);
        }
        field2110 = true;
    }

    @ObfuscatedName("am.ag(I)V")
    public static void method980() {
        field342.method2574(140);
        field342.method2307(method563());
        field342.method2367(Statics.field2066);
        field342.method2367(Statics.field2056);
    }

    @ObfuscatedName("x.aj(I)V")
    public static void method591() {
        client var0 = Statics.field2072;
        synchronized (Statics.field2072) {
            Container var1 = Statics.field2072.method2801();
            if (var1 != null) {
                Statics.field1705 = Math.max(var1.getSize().width, Statics.field1866);
                Statics.field698 = Math.max(var1.getSize().height, Statics.field1007);
                if (Statics.field1966 == var1) {
                    Insets var2 = Statics.field1966.getInsets();
                    Statics.field1705 -= var2.right + var2.left;
                    Statics.field698 -= var2.top + var2.bottom;
                }
                if (Statics.field1705 <= 0) {
                    Statics.field1705 = 1;
                }
                if (Statics.field698 <= 0) {
                    Statics.field698 = 1;
                }
                if (method563() == 1) {
                    Statics.field2066 = field389 * 765;
                    Statics.field2056 = field517;
                } else {
                    Statics.field2066 = Math.min(Statics.field1705, 7680);
                    Statics.field2056 = Math.min(Statics.field698, 2160);
                }
                field2106 = (Statics.field1705 - Statics.field2066) / 2;
                field2107 = 0;
                Statics.field1706.setSize(Statics.field2066, Statics.field2056);
                Statics.field1877 = class76.method994(Statics.field2066, Statics.field2056, Statics.field1706);
                if (Statics.field1966 == var1) {
                    Insets var3 = Statics.field1966.getInsets();
                    Statics.field1706.setLocation(field2106 + var3.left, field2107 + var3.top);
                } else {
                    Statics.field1706.setLocation(field2106, field2107);
                }
                int var4 = Statics.field2066;
                int var5 = Statics.field2056;
                if (Statics.field1705 < var4) {
                    int var6 = Statics.field1705;
                }
                if (Statics.field698 < var5) {
                    int var7 = Statics.field698;
                }
                if (Statics.field1870 != null) {
                    try {
                        client var8 = Statics.field2072;
                        Object[] var9 = new Object[] { method563() };
                        JSObject.getWindow(var8).call("resize", var9);
                    } catch (Throwable var12) {
                    }
                }
                if (field461 != -1) {
                    method3429(field461, Statics.field2066, Statics.field2056, true);
                }
                method646();
            }
        }
    }

    @ObfuscatedName("aa.av(I)V")
    public static void method646() {
        int var0 = field2106;
        int var1 = field2107;
        int var2 = Statics.field1705 - Statics.field2066 - var0;
        int var3 = Statics.field698 - Statics.field2056 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field2072.method2801();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1966 == var4) {
                Insets var7 = Statics.field1966.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field698);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field1705, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field1705 + var5 - var2, var6, var2, Statics.field698);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field698 + var6 - var3, Statics.field1705, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("al.ab(IIIII)V")
    public static final void method947(int arg0, int arg1, int arg2, int arg3) {
        field403++;
        method128(class32.field758);
        boolean var4 = false;
        if (field433 >= 0) {
            for (int var5 = 0; var5 < field409; var5++) {
                if (field433 == field447[var5]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method128(class32.field756);
        }
        method2796(true);
        method128(var4 ? class32.field755 : class32.field757);
        method2796(false);
        for (class7 var6 = (class7) field436.method3490(); var6 != null; var6 = (class7) field436.method3492()) {
            if (Statics.field3101 != var6.field113 || field477 > var6.field119) {
                var6.method3563();
            } else if (field477 >= var6.field124) {
                if (var6.field118 > 0) {
                    class33 var7 = field573[var6.field118 - 1];
                    if (var7 != null && var7.field814 >= 0 && var7.field814 < 13312 && var7.field821 >= 0 && var7.field821 < 13312) {
                        var6.method88(var7.field814, var7.field821, method2267(var7.field814, var7.field821, var6.field113) - var6.field117, field477);
                    }
                }
                if (var6.field118 < 0) {
                    int var8 = -var6.field118 - 1;
                    class3 var9;
                    if (field425 == var8) {
                        var9 = Statics.field143;
                    } else {
                        var9 = field419[var8];
                    }
                    if (var9 != null && var9.field814 >= 0 && var9.field814 < 13312 && var9.field821 >= 0 && var9.field821 < 13312) {
                        var6.method88(var9.field814, var9.field821, method2267(var9.field814, var9.field821, var6.field113) - var6.field117, field477);
                    }
                }
                var6.method87(field430);
                Statics.field1555.method1933(Statics.field3101, (int) var6.field123, (int) var6.field125, (int) var6.field112, 60, var6, var6.field132, -1, false);
            }
        }
        method3098();
        method702(arg0, arg1, arg2, arg3, true);
        int var10 = field564;
        int var11 = field557;
        int var12 = field566;
        int var13 = field567;
        class78.method1711(var10, var11, var10 + var12, var11 + var13);
        class89.method1978();
        if (!field550) {
            int var14 = field394;
            if (field506 / 256 > var14) {
                var14 = field506 / 256;
            }
            if (field551[4] && field372[4] + 128 > var14) {
                var14 = field372[4] + 128;
            }
            int var15 = field574 + field368 & 0x7FF;
            method2593(Statics.field245, method2267(Statics.field143.field814, Statics.field143.field821, Statics.field3101) - 50, Statics.field2020, var14, var15, var14 * 3 + 600);
        }
        int var28;
        if (field550) {
            var28 = method2586();
        } else {
            int var16;
            if (Statics.field1870.field145) {
                var16 = Statics.field3101;
            } else {
                int var17 = 3;
                if (Statics.field12 < 310) {
                    int var18 = Statics.field276 >> 7;
                    int var19 = Statics.field215 >> 7;
                    int var20 = Statics.field143.field814 >> 7;
                    int var21 = Statics.field143.field821 >> 7;
                    if ((class6.field89[Statics.field3101][var18][var19] & 0x4) != 0) {
                        var17 = Statics.field3101;
                    }
                    int var22;
                    if (var20 > var18) {
                        var22 = var20 - var18;
                    } else {
                        var22 = var18 - var20;
                    }
                    int var23;
                    if (var21 > var19) {
                        var23 = var21 - var19;
                    } else {
                        var23 = var19 - var21;
                    }
                    if (var22 > var23) {
                        int var24 = var23 * 65536 / var22;
                        int var25 = 32768;
                        while (var18 != var20) {
                            if (var18 < var20) {
                                var18++;
                            } else if (var18 > var20) {
                                var18--;
                            }
                            if ((class6.field89[Statics.field3101][var18][var19] & 0x4) != 0) {
                                var17 = Statics.field3101;
                            }
                            var25 += var24;
                            if (var25 >= 65536) {
                                var25 -= 65536;
                                if (var19 < var21) {
                                    var19++;
                                } else if (var19 > var21) {
                                    var19--;
                                }
                                if ((class6.field89[Statics.field3101][var18][var19] & 0x4) != 0) {
                                    var17 = Statics.field3101;
                                }
                            }
                        }
                    } else {
                        int var26 = var22 * 65536 / var23;
                        int var27 = 32768;
                        while (var19 != var21) {
                            if (var19 < var21) {
                                var19++;
                            } else if (var19 > var21) {
                                var19--;
                            }
                            if ((class6.field89[Statics.field3101][var18][var19] & 0x4) != 0) {
                                var17 = Statics.field3101;
                            }
                            var27 += var26;
                            if (var27 >= 65536) {
                                var27 -= 65536;
                                if (var18 < var20) {
                                    var18++;
                                } else if (var18 > var20) {
                                    var18--;
                                }
                                if ((class6.field89[Statics.field3101][var18][var19] & 0x4) != 0) {
                                    var17 = Statics.field3101;
                                }
                            }
                        }
                    }
                }
                if ((class6.field89[Statics.field3101][Statics.field143.field814 >> 7][Statics.field143.field821 >> 7] & 0x4) != 0) {
                    var17 = Statics.field3101;
                }
                var16 = var17;
            }
            var28 = var16;
        }
        int var29 = Statics.field276;
        int var30 = Statics.field789;
        int var31 = Statics.field215;
        int var32 = Statics.field12;
        int var33 = Statics.field106;
        for (int var34 = 0; var34 < 5; var34++) {
            if (field551[var34]) {
                int var35 = (int) (Math.random() * (double) (field442[var34] * 2 + 1) - (double) field442[var34] + Math.sin((double) field554[var34] / 100.0D * (double) field555[var34]) * (double) field372[var34]);
                if (var34 == 0) {
                    Statics.field276 += var35;
                }
                if (var34 == 1) {
                    Statics.field789 += var35;
                }
                if (var34 == 2) {
                    Statics.field215 += var35;
                }
                if (var34 == 3) {
                    Statics.field106 = Statics.field106 + var35 & 0x7FF;
                }
                if (var34 == 4) {
                    Statics.field12 += var35;
                    if (Statics.field12 < 128) {
                        Statics.field12 = 128;
                    }
                    if (Statics.field12 > 383) {
                        Statics.field12 = 383;
                    }
                }
            }
        }
        int var36 = class135.field2045;
        int var37 = class135.field2046 * 200873089;
        if (class135.field2043 != 0) {
            var36 = class135.field2052;
            var37 = class135.field2048;
        }
        if (var36 >= var10 && var36 < var10 + var12 && var37 >= var11 && var37 < var11 + var13) {
            class103.field1763 = true;
            class103.field1797 = 0;
            class103.field1759 = var36 - var10;
            class103.field1796 = var37 - var11;
        } else {
            class103.field1763 = false;
            class103.field1797 = 0;
        }
        method1017();
        class78.method1717(var10, var11, var12, var13, 0);
        method1017();
        int var38 = class89.field1528;
        class89.field1528 = field568;
        Statics.field1555.method1866(Statics.field276, Statics.field789, Statics.field215, Statics.field12, Statics.field106, var28);
        class89.field1528 = var38;
        method1017();
        Statics.field1555.method1964();
        field392 = 0;
        boolean var39 = false;
        int var40 = -1;
        for (int var41 = -1; var41 < field409 + field340; var41++) {
            class36 var42;
            if (var41 == -1) {
                var42 = Statics.field143;
            } else if (var41 < field409) {
                var42 = field419[field447[var41]];
                if (field433 == field447[var41]) {
                    var39 = true;
                    var40 = var41;
                    continue;
                }
            } else {
                var42 = field573[field341[var41 - field409]];
            }
            method23(var42, var41, var10, var11, var12, var13);
        }
        if (var39) {
            method23(field419[field433], var40, var10, var11, var12, var13);
        }
        for (int var43 = 0; var43 < field392; var43++) {
            int var44 = field351[var43];
            int var45 = field395[var43];
            int var46 = field422[var43];
            int var47 = field396[var43];
            boolean var48 = true;
            while (var48) {
                var48 = false;
                for (int var49 = 0; var49 < var43; var49++) {
                    if (var45 + 2 > field395[var49] - field396[var49] && var45 - var47 < field395[var49] + 2 && var44 - var46 < field422[var49] + field351[var49] && var44 + var46 > field351[var49] - field422[var49] && field395[var49] - field396[var49] < var45) {
                        var45 = field395[var49] - field396[var49];
                        var48 = true;
                    }
                }
            }
            field404 = field351[var43];
            field471 = field395[var43] = var45;
            String var50 = field562[var43];
            if (field450 == 0) {
                int var51 = 16776960;
                if (field438[var43] < 6) {
                    var51 = field415[field438[var43]];
                }
                if (field438[var43] == 6) {
                    var51 = field403 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field438[var43] == 7) {
                    var51 = field403 % 20 < 10 ? 255 : 65535;
                }
                if (field438[var43] == 8) {
                    var51 = field403 % 20 < 10 ? 45056 : 8454016;
                }
                if (field438[var43] == 9) {
                    int var52 = 150 - field300[var43];
                    if (var52 < 50) {
                        var51 = var52 * 1280 + 16711680;
                    } else if (var52 < 100) {
                        var51 = 16776960 - (var52 - 50) * 327680;
                    } else if (var52 < 150) {
                        var51 = (var52 - 100) * 5 + 65280;
                    }
                }
                if (field438[var43] == 10) {
                    int var53 = 150 - field300[var43];
                    if (var53 < 50) {
                        var51 = var53 * 5 + 16711680;
                    } else if (var53 < 100) {
                        var51 = 16711935 - (var53 - 50) * 327680;
                    } else if (var53 < 150) {
                        var51 = (var53 - 100) * 327680 + 255 - (var53 - 100) * 5;
                    }
                }
                if (field438[var43] == 11) {
                    int var54 = 150 - field300[var43];
                    if (var54 < 50) {
                        var51 = 16777215 - var54 * 327685;
                    } else if (var54 < 100) {
                        var51 = (var54 - 50) * 327685 + 65280;
                    } else if (var54 < 150) {
                        var51 = 16777215 - (var54 - 100) * 327680;
                    }
                }
                if (field399[var43] == 0) {
                    Statics.field299.method3667(var50, field404 + var10, field471 + var11, var51, 0);
                }
                if (field399[var43] == 1) {
                    Statics.field299.method3669(var50, field404 + var10, field471 + var11, var51, 0, field403);
                }
                if (field399[var43] == 2) {
                    Statics.field299.method3714(var50, field404 + var10, field471 + var11, var51, 0, field403);
                }
                if (field399[var43] == 3) {
                    Statics.field299.method3678(var50, field404 + var10, field471 + var11, var51, 0, field403, 150 - field300[var43]);
                }
                if (field399[var43] == 4) {
                    int var55 = (150 - field300[var43]) * (Statics.field299.method3660(var50) + 100) / 150;
                    class78.method1735(field404 + var10 - 50, var11, field404 + var10 + 50, var11 + var13);
                    Statics.field299.method3665(var50, field404 + var10 + 50 - var55, field471 + var11, var51, 0);
                    class78.method1711(var10, var11, var10 + var12, var11 + var13);
                }
                if (field399[var43] == 5) {
                    int var56 = 150 - field300[var43];
                    int var57 = 0;
                    if (var56 < 25) {
                        var57 = var56 - 25;
                    } else if (var56 > 125) {
                        var57 = var56 - 125;
                    }
                    class78.method1735(var10, field471 + var11 - Statics.field299.field3128 - 1, var10 + var12, field471 + var11 + 5);
                    Statics.field299.method3667(var50, field404 + var10, field471 + var11 + var57, var51, 0);
                    class78.method1711(var10, var11, var10 + var12, var11 + var13);
                }
            } else {
                Statics.field299.method3667(var50, field404 + var10, field471 + var11, 16776960, 0);
            }
        }
        method173(var10, var11);
        ((class93) Statics.field1519).method2056(field430);
        method33(var10, var11, var12, var13);
        Statics.field276 = var29;
        Statics.field789 = var30;
        Statics.field215 = var31;
        Statics.field12 = var32;
        Statics.field106 = var33;
        if (field311) {
            byte var58 = 0;
            int var59 = class165.field2641 + class165.field2638 + var58;
            if (var59 == 0) {
                field311 = false;
            }
        }
        if (field311) {
            class78.method1717(var10, var11, var12, var13, 0);
            Statics.method28(class151.field2497, false);
        }
    }

    @ObfuscatedName("ag.ai(IIIIZI)V")
    public static final void method702(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field349 - field556) * var5 / 100 + field556;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field553) {
            short var8 = field553;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field561) {
                var6 = field561;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class78.method1710();
                    class78.method1717(arg0, arg1, var10, arg3, -16777216);
                    class78.method1717(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field325) {
            short var11 = field325;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field570) {
                var6 = field570;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class78.method1710();
                    class78.method1717(arg0, arg1, arg2, var13, -16777216);
                    class78.method1717(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field410 - field499) * var5 / 100 + field499;
        field568 = arg3 * var6 * var14 / 85504 << 1;
        if (field566 != arg2 || field567 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class89.field1542[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class84.method1865(var15, 500, 800, arg2, arg3);
        }
        field564 = arg0;
        field557 = arg1;
        field566 = arg2;
        field567 = arg3;
    }

    @ObfuscatedName("o.ae(Lad;I)V")
    public static final void method128(class32 arg0) {
        if (Statics.field143.field814 >> 7 == field513 && Statics.field143.field821 >> 7 == field536) {
            field513 = 0;
        }
        int var1 = field409;
        if (class32.field758 == arg0 || class32.field756 == arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (class32.field758 == arg0) {
                var3 = Statics.field143;
                var4 = 33538048;
            } else if (class32.field756 == arg0) {
                var3 = field419[field433];
                var4 = field433 << 14;
            } else {
                var3 = field419[field447[var2]];
                var4 = field447[var2] << 14;
                if (class32.field755 == arg0 && field433 == field447[var2]) {
                    continue;
                }
            }
            if (var3 != null && var3.method17() && !var3.field57) {
                var3.field55 = false;
                if ((field307 && field409 > 50 || field409 > 200) && class32.field758 != arg0 && var3.field844 == var3.field798) {
                    var3.field55 = true;
                }
                int var5 = var3.field814 >> 7;
                int var6 = var3.field821 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field50 == null || field477 < var3.field38 || field477 >= var3.field46) {
                        if ((var3.field814 & 0x7F) == 64 && (var3.field821 & 0x7F) == 64) {
                            if (field403 == field402[var5][var6]) {
                                continue;
                            }
                            field402[var5][var6] = field403;
                        }
                        var3.field44 = method2267(var3.field814, var3.field821, Statics.field3101);
                        Statics.field1555.method1933(Statics.field3101, var3.field814, var3.field821, var3.field44, 60, var3, var3.field795, var4, var3.field833);
                    } else {
                        var3.field55 = false;
                        var3.field44 = method2267(var3.field814, var3.field821, Statics.field3101);
                        Statics.field1555.method1812(Statics.field3101, var3.field814, var3.field821, var3.field44, 60, var3, var3.field795, var4, var3.field43, var3.field59, var3.field52, var3.field54);
                    }
                }
            }
        }
    }

    @ObfuscatedName("eb.ax(ZB)V")
    public static final void method2796(boolean arg0) {
        for (int var1 = 0; var1 < field340; var1++) {
            class33 var2 = field573[field341[var1]];
            int var3 = (field341[var1] << 14) + 536870912;
            if (var2 != null && var2.method17() && var2.field764.field887 == arg0 && var2.field764.method738()) {
                int var4 = var2.field814 >> 7;
                int var5 = var2.field821 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field797 == 1 && (var2.field814 & 0x7F) == 64 && (var2.field821 & 0x7F) == 64) {
                        if (field403 == field402[var4][var5]) {
                            continue;
                        }
                        field402[var4][var5] = field403;
                    }
                    if (!var2.field764.field895) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1555.method1933(Statics.field3101, var2.field814, var2.field821, method2267(var2.field814 + (var2.field797 * 64 - 64), var2.field821 + (var2.field797 * 64 - 64), Statics.field3101), var2.field797 * 64 - 64 + 60, var2, var2.field795, var3, var2.field833);
                }
            }
        }
    }

    @ObfuscatedName("fy.aw(I)V")
    public static final void method3098() {
        for (class29 var0 = (class29) field437.method3490(); var0 != null; var0 = (class29) field437.method3492()) {
            if (Statics.field3101 != var0.field688 || var0.field691) {
                var0.method3563();
            } else if (field477 >= var0.field687) {
                var0.method645(field430);
                if (var0.field691) {
                    var0.method3563();
                } else {
                    Statics.field1555.method1933(var0.field688, var0.field689, var0.field697, var0.field690, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("do.ac(I)I")
    public static final int method2586() {
        if (Statics.field1870.field145) {
            return Statics.field3101;
        } else {
            int var0 = method2267(Statics.field276, Statics.field215, Statics.field3101);
            return var0 - Statics.field789 >= 800 || (class6.field89[Statics.field3101][Statics.field276 >> 7][Statics.field215 >> 7] & 0x4) == 0 ? 3 : Statics.field3101;
        }
    }

    @ObfuscatedName("t.al(III)V")
    public static final void method173(int arg0, int arg1) {
        if (field490 == 2) {
            method2768((field505 - Statics.field1367 << 7) + field326, (field463 - Statics.field2578 << 7) + field327, field510 * 2);
            if (field404 > -1 && field477 % 20 < 10) {
                Statics.field1015[0].method1640(field404 + arg0 - 12, field471 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("z.az(Lav;IIIIII)V")
    public static final void method23(class36 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method17()) {
            return;
        }
        if (arg0 instanceof class33) {
            class38 var6 = ((class33) arg0).field764;
            if (var6.field891 != null) {
                var6 = var6.method742();
            }
            if (var6 == null) {
                return;
            }
        }
        if (arg1 < field409) {
            int var7 = 30;
            class3 var8 = (class3) arg0;
            if (var8.field57) {
                return;
            }
            if (var8.field40 != -1 || var8.field41 != -1) {
                method90(arg0, arg0.field842 + 15);
                if (field404 > -1) {
                    if (var8.field40 != -1) {
                        Statics.field1365[var8.field40].method1640(field404 + arg2 - 12, field471 + arg3 - var7);
                        var7 += 25;
                    }
                    if (var8.field41 != -1) {
                        Statics.field982[var8.field41].method1640(field404 + arg2 - 12, field471 + arg3 - var7);
                        var7 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field490 == 10 && field322 == field447[arg1]) {
                method90(arg0, arg0.field842 + 15);
                if (field404 > -1) {
                    Statics.field1015[1].method1640(field404 + arg2 - 12, field471 + arg3 - var7);
                }
            }
        } else {
            class38 var9 = ((class33) arg0).field764;
            if (var9.field891 != null) {
                var9 = var9.method742();
            }
            if (var9.field870 >= 0 && var9.field870 < Statics.field982.length) {
                method90(arg0, arg0.field842 + 15);
                if (field404 > -1) {
                    Statics.field982[var9.field870].method1640(field404 + arg2 - 12, field471 + arg3 - 30);
                }
            }
            if (field490 == 1 && field321 == field341[arg1 - field409] && field477 % 20 < 10) {
                method90(arg0, arg0.field842 + 15);
                if (field404 > -1) {
                    Statics.field1015[0].method1640(field404 + arg2 - 12, field471 + arg3 - 28);
                }
            }
        }
        if (arg0.field806 != null && (arg1 >= field409 || !arg0.field808 && (field384 == 4 || !arg0.field793 && (field384 == 0 || field384 == 3 || field384 == 1 && method811(((class3) arg0).field53, false))))) {
            method90(arg0, arg0.field842);
            if (field404 > -1 && field392 < field435) {
                field422[field392] = Statics.field299.method3660(arg0.field806) / 2;
                field396[field392] = Statics.field299.field3128;
                field351[field392] = field404;
                field395[field392] = field471;
                field438[field392] = arg0.field810;
                field399[field392] = arg0.field820;
                field300[field392] = arg0.field809;
                field562[field392] = arg0.field806;
                field392++;
            }
        }
        if (arg0.field815 > field477) {
            method90(arg0, arg0.field842 + 15);
            if (field404 > -1) {
                int var10;
                if (arg1 < field409) {
                    var10 = 30;
                } else {
                    class38 var11 = ((class33) arg0).field764;
                    var10 = var11.field898;
                }
                int var12 = arg0.field816 * var10 / arg0.field817;
                if (var12 > var10) {
                    var12 = var10;
                } else if (var12 == 0 && arg0.field816 > 0) {
                    var12 = 1;
                }
                class78.method1717(field404 + arg2 - var10 / 2, field471 + arg3 - 3, var12, 5, 65280);
                class78.method1717(field404 + arg2 - var10 / 2 + var12, field471 + arg3 - 3, var10 - var12, 5, 16711680);
            }
        }
        for (int var13 = 0; var13 < 4; var13++) {
            if (arg0.field812[var13] > field477) {
                method90(arg0, arg0.field842 / 2);
                if (field404 > -1) {
                    if (var13 == 1) {
                        field471 -= 20;
                    }
                    if (var13 == 2) {
                        field404 -= 15;
                        field471 -= 10;
                    }
                    if (var13 == 3) {
                        field404 += 15;
                        field471 -= 10;
                    }
                    Statics.field2510[arg0.field813[var13]].method1640(field404 + arg2 - 12, field471 + arg3 - 12);
                    Statics.field647.method3667(Integer.toString(arg0.field852[var13]), field404 + arg2 - 1, field471 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("l.as(IIIIB)V")
    public static final void method33(int arg0, int arg1, int arg2, int arg3) {
        if (field460 == 1) {
            Statics.field3164[field408 / 100].method1640(field406 - 8, field407 - 8);
        }
        if (field460 == 2) {
            Statics.field3164[field408 / 100 + 4].method1640(field406 - 8, field407 - 8);
        }
        field418 = 0;
        int var4 = (Statics.field143.field814 >> 7) + Statics.field1367;
        int var5 = (Statics.field143.field821 >> 7) + Statics.field2578;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field418 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field418 = 1;
        }
        if (field418 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field418 = 0;
        }
    }

    @ObfuscatedName("f.am(Lav;II)V")
    public static final void method90(class36 arg0, int arg1) {
        method2768(arg0.field814, arg0.field821, arg1);
    }

    @ObfuscatedName("eo.ay(IIII)V")
    public static final void method2768(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field404 = -1;
            field471 = -1;
            return;
        }
        int var3 = method2267(arg0, arg1, Statics.field3101) - arg2;
        int var4 = arg0 - Statics.field276;
        int var5 = var3 - Statics.field789;
        int var6 = arg1 - Statics.field215;
        int var7 = class89.field1542[Statics.field12];
        int var8 = class89.field1543[Statics.field12];
        int var9 = class89.field1542[Statics.field106];
        int var10 = class89.field1543[Statics.field106];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field404 = field568 * var11 / var15 + field566 / 2;
            field471 = field568 * var14 / var15 + field567 / 2;
        } else {
            field404 = -1;
            field471 = -1;
        }
    }

    @ObfuscatedName("dn.ao(IIII)I")
    public static final int method2267(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field89[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field88[var5][var3][var4] + class6.field88[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field88[var5][var3][var4 + 1] + class6.field88[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("do.aq(IIIIIII)V")
    public static final void method2593(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class89.field1542[var6];
            int var12 = class89.field1543[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class89.field1542[var7];
            int var15 = class89.field1543[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field276 = arg0 - var8;
        Statics.field789 = arg1 - var9;
        Statics.field215 = arg2 - var10;
        Statics.field12 = arg3;
        Statics.field106 = arg4;
    }

    @ObfuscatedName("cg.af(ZI)V")
    public static final void method2156(boolean arg0) {
        field361 = arg0;
        if (!field361) {
            int var1 = field344.method2306();
            int var2 = field344.method2306();
            int var3 = (field345 - field344.field1894) / 16;
            Statics.field1087 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field1087[var4][var5] = field344.method2327();
                }
            }
            int var6 = field344.method2322();
            int var7 = field344.method2324();
            int var8 = field344.method2356();
            Statics.field187 = new int[var3];
            Statics.field1183 = new int[var3];
            Statics.field883 = new int[var3];
            Statics.field2864 = new byte[var3][];
            Statics.field762 = new byte[var3][];
            boolean var9 = false;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && var8 / 8 == 48) {
                var9 = true;
            }
            if (var2 / 8 == 48 && var8 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var2 - 6) / 8; var11 <= (var2 + 6) / 8; var11++) {
                for (int var12 = (var8 - 6) / 8; var12 <= (var8 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field187[var10] = var13;
                        Statics.field1183[var10] = Statics.field3099.method2994("m" + var11 + "_" + var12);
                        Statics.field883[var10] = Statics.field3099.method2994("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method3097(var2, var8, var6, var1, var7);
            return;
        }
        field344.method2590();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field344.method2576(1);
                    if (var17 == 1) {
                        field312[var14][var15][var16] = field344.method2576(26);
                    } else {
                        field312[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field344.method2577();
        int var18 = (field345 - field344.field1894) / 16;
        Statics.field1087 = new int[var18][4];
        for (int var19 = 0; var19 < var18; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field1087[var19][var20] = field344.method2364();
            }
        }
        int var21 = field344.method2356();
        int var22 = field344.method2324();
        int var23 = field344.method2322();
        int var24 = field344.method2356();
        int var25 = field344.method2324();
        Statics.field187 = new int[var18];
        Statics.field1183 = new int[var18];
        Statics.field883 = new int[var18];
        Statics.field2864 = new byte[var18][];
        Statics.field762 = new byte[var18][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field312[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field187[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field187[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field1183[var26] = Statics.field3099.method2994("m" + var35 + "_" + var36);
                            Statics.field883[var26] = Statics.field3099.method2994("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method3097(var21, var25, var23, var24, var22);
    }

    @ObfuscatedName("fy.ah(IIIIII)V")
    public static final void method3097(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field625 == arg0 && Statics.field191 == arg1 && field324 == arg2 || !field307) {
            return;
        }
        Statics.field625 = arg0;
        Statics.field191 = arg1;
        field324 = arg2;
        if (!field307) {
            field324 = 0;
        }
        method2157(25);
        Statics.method28(class151.field2497, true);
        int var5 = Statics.field1367;
        int var6 = Statics.field2578;
        Statics.field1367 = (arg0 - 6) * 8;
        Statics.field2578 = (arg1 - 6) * 8;
        int var7 = Statics.field1367 - var5;
        int var8 = Statics.field2578 - var6;
        int var9 = Statics.field1367;
        int var10 = Statics.field2578;
        for (int var11 = 0; var11 < 32768; var11++) {
            class33 var12 = field573[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field847[var13] -= var7;
                    var12.field848[var13] -= var8;
                }
                var12.field814 -= var7 * 128;
                var12.field821 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field419[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field847[var16] -= var7;
                    var15.field848[var16] -= var8;
                }
                var15.field814 -= var7 * 128;
                var15.field821 -= var8 * 128;
            }
        }
        Statics.field3101 = arg2;
        Statics.field143.method716(arg3, arg4, false);
        byte var17 = 0;
        byte var18 = 104;
        byte var19 = 1;
        if (var7 < 0) {
            var17 = 103;
            var18 = -1;
            var19 = -1;
        }
        byte var20 = 0;
        byte var21 = 104;
        byte var22 = 1;
        if (var8 < 0) {
            var20 = 103;
            var21 = -1;
            var22 = -1;
        }
        for (int var23 = var17; var23 != var18; var23 += var19) {
            for (int var24 = var20; var24 != var21; var24 += var22) {
                int var25 = var7 + var23;
                int var26 = var8 + var24;
                for (int var27 = 0; var27 < 4; var27++) {
                    if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                        field391[var27][var23][var24] = field391[var27][var25][var26];
                    } else {
                        field391[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class16 var28 = (class16) field581.method3490(); var28 != null; var28 = (class16) field581.method3492()) {
            var28.field232 -= var7;
            var28.field233 -= var8;
            if (var28.field232 < 0 || var28.field233 < 0 || var28.field232 >= 104 || var28.field233 >= 104) {
                var28.method3563();
            }
        }
        if (field513 != 0) {
            field513 -= var7;
            field536 -= var8;
        }
        field544 = 0;
        field550 = false;
        field530 = -1;
        field437.method3509();
        field436.method3509();
    }

    @ObfuscatedName("cx.bz(ZS)V")
    public static final void method2069(boolean arg0) {
        method1017();
        field343++;
        if (field343 < 50 && !arg0) {
            return;
        }
        field343 = 0;
        if (field434 || Statics.field2150 == null) {
            return;
        }
        field342.method2574(250);
        try {
            Statics.field2150.method2779(field342.field1891, 0, field342.field1894);
            field342.field1894 = 0;
        } catch (IOException var2) {
            field434 = true;
        }
    }

    @ObfuscatedName("bk.bw(B)V")
    public static final void method1585() {
        method2069(false);
        field355 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field2864.length; var1++) {
            if (Statics.field1183[var1] != -1 && Statics.field2864[var1] == null) {
                Statics.field2864[var1] = Statics.field3099.method2995(Statics.field1183[var1], 0);
                if (Statics.field2864[var1] == null) {
                    var0 = false;
                    field355++;
                }
            }
            if (Statics.field883[var1] != -1 && Statics.field762[var1] == null) {
                Statics.field762[var1] = Statics.field3099.method2987(Statics.field883[var1], 0, Statics.field1087[var1]);
                if (Statics.field762[var1] == null) {
                    var0 = false;
                    field355++;
                }
            }
        }
        if (!var0) {
            field432 = 1;
            return;
        }
        field357 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field2864.length; var3++) {
            byte[] var4 = Statics.field762[var3];
            if (var4 != null) {
                int var5 = (Statics.field187[var3] >> 8) * 64 - Statics.field1367;
                int var6 = (Statics.field187[var3] & 0xFF) * 64 - Statics.field2578;
                if (field361) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class6.method1023(var4, var5, var6);
            }
        }
        if (!var2) {
            field432 = 2;
            return;
        }
        if (field432 != 0) {
            Statics.method28(class151.field2497 + class2.field26 + class2.field20 + 100 + "%" + class2.field37, true);
        }
        method1017();
        method734();
        method1017();
        Statics.field1555.method1800();
        method1017();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field511[var7].method3799();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class6.field89[var8][var9][var10] = 0;
                }
            }
        }
        method1017();
        class6.method840();
        int var11 = Statics.field2864.length;
        class23.method32();
        method2069(true);
        if (!field361) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field187[var12] >> 8) * 64 - Statics.field1367;
                int var14 = (Statics.field187[var12] & 0xFF) * 64 - Statics.field2578;
                byte[] var15 = Statics.field2864[var12];
                if (var15 != null) {
                    method1017();
                    int var16 = Statics.field625 * 8 - 48;
                    int var17 = Statics.field191 * 8 - 48;
                    class223[] var18 = field511;
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 64; var20++) {
                            for (int var21 = 0; var21 < 64; var21++) {
                                if (var13 + var20 > 0 && var13 + var20 < 103 && var14 + var21 > 0 && var14 + var21 < 103) {
                                    var18[var19].field3161[var13 + var20][var14 + var21] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class114 var22 = new class114(var15);
                    for (int var23 = 0; var23 < 4; var23++) {
                        for (int var24 = 0; var24 < 64; var24++) {
                            for (int var25 = 0; var25 < 64; var25++) {
                                class6.method178(var22, var23, var13 + var24, var14 + var25, var16, var17, 0);
                            }
                        }
                    }
                }
            }
            for (int var26 = 0; var26 < var11; var26++) {
                int var27 = (Statics.field187[var26] >> 8) * 64 - Statics.field1367;
                int var28 = (Statics.field187[var26] & 0xFF) * 64 - Statics.field2578;
                byte[] var29 = Statics.field2864[var26];
                if (var29 == null && Statics.field191 < 800) {
                    method1017();
                    class6.method85(var27, var28, 64, 64);
                }
            }
            method2069(true);
            for (int var30 = 0; var30 < var11; var30++) {
                byte[] var31 = Statics.field762[var30];
                if (var31 != null) {
                    int var32 = (Statics.field187[var30] >> 8) * 64 - Statics.field1367;
                    int var33 = (Statics.field187[var30] & 0xFF) * 64 - Statics.field2578;
                    method1017();
                    class6.method846(var31, var32, var33, Statics.field1555, field511);
                }
            }
        }
        if (field361) {
            for (int var34 = 0; var34 < 4; var34++) {
                method1017();
                for (int var35 = 0; var35 < 13; var35++) {
                    for (int var36 = 0; var36 < 13; var36++) {
                        boolean var37 = false;
                        int var38 = field312[var34][var35][var36];
                        if (var38 != -1) {
                            int var39 = var38 >> 24 & 0x3;
                            int var40 = var38 >> 1 & 0x3;
                            int var41 = var38 >> 14 & 0x3FF;
                            int var42 = var38 >> 3 & 0x7FF;
                            int var43 = (var41 / 8 << 8) + var42 / 8;
                            for (int var44 = 0; var44 < Statics.field187.length; var44++) {
                                if (Statics.field187[var44] == var43 && Statics.field2864[var44] != null) {
                                    class6.method1618(Statics.field2864[var44], var34, var35 * 8, var36 * 8, var39, (var41 & 0x7) * 8, (var42 & 0x7) * 8, var40, field511);
                                    var37 = true;
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            int var45 = var34;
                            int var46 = var35 * 8;
                            int var47 = var36 * 8;
                            for (int var48 = 0; var48 < 8; var48++) {
                                for (int var49 = 0; var49 < 8; var49++) {
                                    class6.field88[var45][var46 + var48][var47 + var49] = 0;
                                }
                            }
                            if (var46 > 0) {
                                for (int var50 = 1; var50 < 8; var50++) {
                                    class6.field88[var45][var46][var47 + var50] = class6.field88[var45][var46 - 1][var47 + var50];
                                }
                            }
                            if (var47 > 0) {
                                for (int var51 = 1; var51 < 8; var51++) {
                                    class6.field88[var45][var46 + var51][var47] = class6.field88[var45][var46 + var51][var47 - 1];
                                }
                            }
                            if (var46 > 0 && class6.field88[var45][var46 - 1][var47] != 0) {
                                class6.field88[var45][var46][var47] = class6.field88[var45][var46 - 1][var47];
                            } else if (var47 > 0 && class6.field88[var45][var46][var47 - 1] != 0) {
                                class6.field88[var45][var46][var47] = class6.field88[var45][var46][var47 - 1];
                            } else if (var46 > 0 && var47 > 0 && class6.field88[var45][var46 - 1][var47 - 1] != 0) {
                                class6.field88[var45][var46][var47] = class6.field88[var45][var46 - 1][var47 - 1];
                            }
                        }
                    }
                }
            }
            for (int var52 = 0; var52 < 13; var52++) {
                for (int var53 = 0; var53 < 13; var53++) {
                    int var54 = field312[0][var52][var53];
                    if (var54 == -1) {
                        class6.method85(var52 * 8, var53 * 8, 8, 8);
                    }
                }
            }
            method2069(true);
            for (int var55 = 0; var55 < 4; var55++) {
                method1017();
                for (int var56 = 0; var56 < 13; var56++) {
                    label321: for (int var57 = 0; var57 < 13; var57++) {
                        int var58 = field312[var55][var56][var57];
                        if (var58 != -1) {
                            int var59 = var58 >> 24 & 0x3;
                            int var60 = var58 >> 1 & 0x3;
                            int var61 = var58 >> 14 & 0x3FF;
                            int var62 = var58 >> 3 & 0x7FF;
                            int var63 = (var61 / 8 << 8) + var62 / 8;
                            for (int var64 = 0; var64 < Statics.field187.length; var64++) {
                                if (Statics.field187[var64] == var63 && Statics.field762[var64] != null) {
                                    byte[] var65 = Statics.field762[var64];
                                    int var66 = var56 * 8;
                                    int var67 = var57 * 8;
                                    int var68 = (var61 & 0x7) * 8;
                                    int var69 = (var62 & 0x7) * 8;
                                    class84 var70 = Statics.field1555;
                                    class223[] var71 = field511;
                                    class114 var72 = new class114(var65);
                                    int var73 = -1;
                                    while (true) {
                                        int var74 = var72.method2401();
                                        if (var74 == 0) {
                                            continue label321;
                                        }
                                        var73 += var74;
                                        int var75 = 0;
                                        while (true) {
                                            int var76 = var72.method2401();
                                            if (var76 == 0) {
                                                break;
                                            }
                                            var75 += var76 - 1;
                                            int var77 = var75 & 0x3F;
                                            int var78 = var75 >> 6 & 0x3F;
                                            int var79 = var75 >> 12;
                                            int var80 = var72.method2322();
                                            int var81 = var80 >> 2;
                                            int var82 = var80 & 0x3;
                                            if (var59 == var79 && var78 >= var68 && var78 < var68 + 8 && var77 >= var69 && var77 < var69 + 8) {
                                                class39 var83 = class39.method902(var73);
                                                int var84 = var66 + class171.method145(var78 & 0x7, var77 & 0x7, var60, var83.field918, var83.field949, var82);
                                                int var85 = var67 + class171.method2788(var78 & 0x7, var77 & 0x7, var60, var83.field918, var83.field949, var82);
                                                if (var84 > 0 && var85 > 0 && var84 < 103 && var85 < 103) {
                                                    int var86 = var55;
                                                    if ((class6.field89[1][var84][var85] & 0x2) == 2) {
                                                        var86 = var55 - 1;
                                                    }
                                                    class223 var87 = null;
                                                    if (var86 >= 0) {
                                                        var87 = var71[var86];
                                                    }
                                                    class6.method596(var55, var84, var85, var73, var60 + var82 & 0x3, var81, var70, var87);
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
        method2069(true);
        method734();
        method1017();
        class6.method130(Statics.field1555, field511);
        method2069(true);
        int var88 = class6.field94;
        if (var88 > Statics.field3101) {
            var88 = Statics.field3101;
        }
        if (var88 < Statics.field3101 - 1) {
            int var89 = Statics.field3101 - 1;
        }
        if (field307) {
            Statics.field1555.method1801(class6.field94);
        } else {
            Statics.field1555.method1801(0);
        }
        for (int var90 = 0; var90 < 104; var90++) {
            for (int var91 = 0; var91 < 104; var91++) {
                method157(var90, var91);
            }
        }
        method1017();
        for (class16 var92 = (class16) field581.method3490(); var92 != null; var92 = (class16) field581.method3492()) {
            if (var92.field250 == -1) {
                var92.field240 = 0;
                method714(var92);
            } else {
                var92.method3563();
            }
        }
        class39.field906.method3435();
        if (Statics.field1966 != null) {
            field342.method2574(103);
            field342.method2310(1057001181);
        }
        if (!field361) {
            int var93 = (Statics.field625 - 6) / 8;
            int var94 = (Statics.field625 + 6) / 8;
            int var95 = (Statics.field191 - 6) / 8;
            int var96 = (Statics.field191 + 6) / 8;
            for (int var97 = var93 - 1; var97 <= var94 + 1; var97++) {
                for (int var98 = var95 - 1; var98 <= var96 + 1; var98++) {
                    if (var97 < var93 || var97 > var94 || var98 < var95 || var98 > var96) {
                        Statics.field3099.method3049("m" + var97 + "_" + var98);
                        Statics.field3099.method3049("l" + var97 + "_" + var98);
                    }
                }
            }
        }
        method2157(30);
        method1017();
        Statics.method3();
        field342.method2574(104);
        class139.method2163();
    }

    @ObfuscatedName("fe.bj(IIIIIIIIIB)V")
    public static final void method3414(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class16 var9 = null;
        for (class16 var10 = (class16) field581.method3490(); var10 != null; var10 = (class16) field581.method3492()) {
            if (var10.field247 == arg0 && var10.field232 == arg1 && var10.field233 == arg2 && var10.field231 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class16();
            var9.field247 = arg0;
            var9.field231 = arg3;
            var9.field232 = arg1;
            var9.field233 = arg2;
            method714(var9);
            field581.method3485(var9);
        }
        var9.field248 = arg4;
        var9.field239 = arg5;
        var9.field238 = arg6;
        var9.field240 = arg7;
        var9.field250 = arg8;
    }

    @ObfuscatedName("av.bf(Lt;I)V")
    public static final void method714(class16 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field231 == 0) {
            var1 = Statics.field1555.method1867(arg0.field247, arg0.field232, arg0.field233);
        }
        if (arg0.field231 == 1) {
            var1 = Statics.field1555.method1827(arg0.field247, arg0.field232, arg0.field233);
        }
        if (arg0.field231 == 2) {
            var1 = Statics.field1555.method1828(arg0.field247, arg0.field232, arg0.field233);
        }
        if (arg0.field231 == 3) {
            var1 = Statics.field1555.method1836(arg0.field247, arg0.field232, arg0.field233);
        }
        if (var1 != 0) {
            int var5 = Statics.field1555.method1899(arg0.field247, arg0.field232, arg0.field233, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field234 = var2;
        arg0.field236 = var3;
        arg0.field235 = var4;
    }

    @ObfuscatedName("y.bo(I)V")
    public static final void method7() {
        for (class16 var0 = (class16) field581.method3490(); var0 != null; var0 = (class16) field581.method3492()) {
            if (var0.field250 > 0) {
                var0.field250--;
            }
            if (var0.field250 != 0) {
                if (var0.field240 > 0) {
                    var0.field240--;
                }
                if (var0.field240 == 0 && var0.field232 >= 1 && var0.field233 >= 1 && var0.field232 <= 102 && var0.field233 <= 102 && (var0.field248 < 0 || class6.method97(var0.field248, var0.field239))) {
                    method2659(var0.field247, var0.field231, var0.field232, var0.field233, var0.field248, var0.field238, var0.field239);
                    var0.field240 = -1;
                    if (var0.field248 == var0.field234 && var0.field234 == -1) {
                        var0.method3563();
                    } else if (var0.field248 == var0.field234 && var0.field238 == var0.field235 && var0.field239 == var0.field236) {
                        var0.method3563();
                    }
                }
            } else if (var0.field234 < 0 || class6.method97(var0.field234, var0.field236)) {
                method2659(var0.field247, var0.field231, var0.field232, var0.field233, var0.field234, var0.field235, var0.field236);
                var0.method3563();
            }
        }
    }

    @ObfuscatedName("dg.bi(IIIIIIII)V")
    public static final void method2659(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field307 && Statics.field3101 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1555.method1867(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1555.method1827(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1555.method1828(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1555.method1836(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1555.method1899(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1555.method1834(arg0, arg2, arg3);
                class39 var15 = class39.method902(var12);
                if (var15.field920 != 0) {
                    field511[arg0].method3829(arg2, arg3, var13, var14, var15.field953);
                }
            }
            if (arg1 == 1) {
                Statics.field1555.method1818(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1555.method1811(arg0, arg2, arg3);
                class39 var16 = class39.method902(var12);
                if (var16.field918 + arg2 > 103 || var16.field918 + arg3 > 103 || var16.field949 + arg2 > 103 || var16.field949 + arg3 > 103) {
                    return;
                }
                if (var16.field920 != 0) {
                    field511[arg0].method3806(arg2, arg3, var16.field918, var16.field949, var14, var16.field953);
                }
            }
            if (arg1 == 3) {
                Statics.field1555.method1877(arg0, arg2, arg3);
                class39 var17 = class39.method902(var12);
                if (var17.field920 == 1) {
                    field511[arg0].method3808(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field89[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class84 var19 = Statics.field1555;
        class223 var20 = field511[arg0];
        class39 var21 = class39.method902(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field949;
            var23 = var21.field918;
        } else {
            var22 = var21.field918;
            var23 = var21.field949;
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
        int[][] var28 = class6.field88[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field922 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field903 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class83 var34;
            if (var21.field926 == -1 && var21.field944 == null) {
                var34 = var21.method769(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class12(arg4, 22, arg5, var18, arg2, arg3, var21.field926, true, (class83) null);
            }
            var19.method1806(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field920 == 1) {
                var20.method3818(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class83 var57;
            if (var21.field926 == -1 && var21.field944 == null) {
                var57 = var21.method769(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class12(arg4, 10, arg5, var18, arg2, arg3, var21.field926, true, (class83) null);
            }
            if (var57 != null) {
                var19.method1844(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field920 != 0) {
                var20.method3805(arg2, arg3, var22, var23, var21.field953);
            }
        } else if (arg6 >= 12) {
            class83 var35;
            if (var21.field926 == -1 && var21.field944 == null) {
                var35 = var21.method769(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class12(arg4, arg6, arg5, var18, arg2, arg3, var21.field926, true, (class83) null);
            }
            var19.method1844(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field920 != 0) {
                var20.method3805(arg2, arg3, var22, var23, var21.field953);
            }
        } else if (arg6 == 0) {
            class83 var36;
            if (var21.field926 == -1 && var21.field944 == null) {
                var36 = var21.method769(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class12(arg4, 0, arg5, var18, arg2, arg3, var21.field926, true, (class83) null);
            }
            var19.method1815(arg0, arg2, arg3, var29, var36, (class83) null, class6.field99[arg5], 0, var32, var33);
            if (var21.field920 != 0) {
                var20.method3800(arg2, arg3, arg6, arg5, var21.field953);
            }
        } else if (arg6 == 1) {
            class83 var37;
            if (var21.field926 == -1 && var21.field944 == null) {
                var37 = var21.method769(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class12(arg4, 1, arg5, var18, arg2, arg3, var21.field926, true, (class83) null);
            }
            var19.method1815(arg0, arg2, arg3, var29, var37, (class83) null, class6.field90[arg5], 0, var32, var33);
            if (var21.field920 != 0) {
                var20.method3800(arg2, arg3, arg6, arg5, var21.field953);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class83 var39;
            class83 var40;
            if (var21.field926 == -1 && var21.field944 == null) {
                var39 = var21.method769(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method769(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class12(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field926, true, (class83) null);
                var40 = new class12(arg4, 2, var38, var18, arg2, arg3, var21.field926, true, (class83) null);
            }
            var19.method1815(arg0, arg2, arg3, var29, var39, var40, class6.field99[arg5], class6.field99[var38], var32, var33);
            if (var21.field920 != 0) {
                var20.method3800(arg2, arg3, arg6, arg5, var21.field953);
            }
        } else if (arg6 == 3) {
            class83 var41;
            if (var21.field926 == -1 && var21.field944 == null) {
                var41 = var21.method769(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class12(arg4, 3, arg5, var18, arg2, arg3, var21.field926, true, (class83) null);
            }
            var19.method1815(arg0, arg2, arg3, var29, var41, (class83) null, class6.field90[arg5], 0, var32, var33);
            if (var21.field920 != 0) {
                var20.method3800(arg2, arg3, arg6, arg5, var21.field953);
            }
        } else if (arg6 == 9) {
            class83 var42;
            if (var21.field926 == -1 && var21.field944 == null) {
                var42 = var21.method769(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class12(arg4, arg6, arg5, var18, arg2, arg3, var21.field926, true, (class83) null);
            }
            var19.method1844(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field920 != 0) {
                var20.method3805(arg2, arg3, var22, var23, var21.field953);
            }
        } else if (arg6 == 4) {
            class83 var43;
            if (var21.field926 == -1 && var21.field944 == null) {
                var43 = var21.method769(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class12(arg4, 4, arg5, var18, arg2, arg3, var21.field926, true, (class83) null);
            }
            var19.method1809(arg0, arg2, arg3, var29, var43, (class83) null, class6.field99[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1867(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class39.method902(var45 >> 14 & 0x7FFF).field940;
            }
            class83 var46;
            if (var21.field926 == -1 && var21.field944 == null) {
                var46 = var21.method769(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class12(arg4, 4, arg5, var18, arg2, arg3, var21.field926, true, (class83) null);
            }
            var19.method1809(arg0, arg2, arg3, var29, var46, (class83) null, class6.field99[arg5], 0, class6.field100[arg5] * var44, class6.field101[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1867(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class39.method902(var48 >> 14 & 0x7FFF).field940 / 2;
            }
            class83 var49;
            if (var21.field926 == -1 && var21.field944 == null) {
                var49 = var21.method769(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class12(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field926, true, (class83) null);
            }
            var19.method1809(arg0, arg2, arg3, var29, var49, (class83) null, 256, arg5, class6.field102[arg5] * var47, class6.field103[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class83 var51;
            if (var21.field926 == -1 && var21.field944 == null) {
                var51 = var21.method769(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class12(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field926, true, (class83) null);
            }
            var19.method1809(arg0, arg2, arg3, var29, var51, (class83) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1867(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class39.method902(var53 >> 14 & 0x7FFF).field940 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class83 var55;
            class83 var56;
            if (var21.field926 == -1 && var21.field944 == null) {
                var55 = var21.method769(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method769(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class12(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field926, true, (class83) null);
                var56 = new class12(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field926, true, (class83) null);
            }
            var19.method1809(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field102[arg5] * var52, class6.field103[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("v.bv(III)V")
    public static final void method157(int arg0, int arg1) {
        class193 var2 = field391[Statics.field3101][arg0][arg1];
        if (var2 == null) {
            Statics.field1555.method1821(Statics.field3101, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class28 var5 = null;
        for (class28 var6 = (class28) var2.method3490(); var6 != null; var6 = (class28) var2.method3492()) {
            class50 var7 = class50.method1088(var6.field681);
            long var8 = (long) var7.field1079;
            if (var7.field1102 == 1) {
                var8 = (long) (var6.field684 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1555.method1821(Statics.field3101, arg0, arg1);
            return;
        }
        var2.method3486(var5);
        class28 var10 = null;
        class28 var11 = null;
        for (class28 var12 = (class28) var2.method3490(); var12 != null; var12 = (class28) var2.method3492()) {
            if (var5.field681 != var12.field681) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field681 != var12.field681 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1555.method1839(Statics.field3101, arg0, arg1, method2267(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field3101), var5, var13, var10, var11);
    }

    @ObfuscatedName("j.bp(I)V")
    public static final void method4() {
        field344.method2590();
        int var0 = field344.method2576(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field344.method2576(2);
        if (var1 == 0) {
            field423[++field347 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field344.method2576(3);
            Statics.field143.method715(var2, false);
            int var3 = field344.method2576(1);
            if (var3 == 1) {
                field423[++field347 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field344.method2576(3);
            Statics.field143.method715(var4, true);
            int var5 = field344.method2576(3);
            Statics.field143.method715(var5, true);
            int var6 = field344.method2576(1);
            if (var6 == 1) {
                field423[++field347 - 1] = 2047;
            }
        } else if (var1 == 3) {
            Statics.field3101 = field344.method2576(2);
            int var7 = field344.method2576(1);
            if (var7 == 1) {
                field423[++field347 - 1] = 2047;
            }
            int var8 = field344.method2576(1);
            int var9 = field344.method2576(7);
            int var10 = field344.method2576(7);
            Statics.field143.method716(var10, var9, var8 == 1);
        }
    }

    @ObfuscatedName("ac.bm(I)V")
    public static final void method931() {
        int var0 = field344.method2576(8);
        if (var0 < field409) {
            for (int var1 = var0; var1 < field409; var1++) {
                field428[++field427 - 1] = field447[var1];
            }
        }
        if (var0 > field409) {
            throw new RuntimeException("");
        }
        field409 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field447[var2];
            class3 var4 = field419[var3];
            int var5 = field344.method2576(1);
            if (var5 == 0) {
                field447[++field409 - 1] = var3;
                var4.field841 = field477;
            } else {
                int var6 = field344.method2576(2);
                if (var6 == 0) {
                    field447[++field409 - 1] = var3;
                    var4.field841 = field477;
                    field423[++field347 - 1] = var3;
                } else if (var6 == 1) {
                    field447[++field409 - 1] = var3;
                    var4.field841 = field477;
                    int var7 = field344.method2576(3);
                    var4.method715(var7, false);
                    int var8 = field344.method2576(1);
                    if (var8 == 1) {
                        field423[++field347 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field447[++field409 - 1] = var3;
                    var4.field841 = field477;
                    int var9 = field344.method2576(3);
                    var4.method715(var9, true);
                    int var10 = field344.method2576(3);
                    var4.method715(var10, true);
                    int var11 = field344.method2576(1);
                    if (var11 == 1) {
                        field423[++field347 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field428[++field427 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("i.br(ILz;II)V")
    public static final void method103(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x100) != 0) {
            int var3 = field344.method2324();
            int var4 = field344.method2517();
            arg1.method719(var3, var4, field477);
            arg1.field815 = field477 + 300;
            arg1.field816 = field344.method2322();
            arg1.field817 = field344.method2388();
        }
        if ((arg2 & 0x1) != 0) {
            arg1.field794 = field344.method2355();
            arg1.field853 = field344.method2356();
        }
        if ((arg2 & 0x2) != 0) {
            int var5 = field344.method2356();
            if (var5 == 65535) {
                var5 = -1;
            }
            int var6 = field344.method2517();
            method182(arg1, var5, var6);
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field834 = field344.method2517();
            arg1.field836 = field344.method2322();
            arg1.field845 = field344.method2388();
            arg1.field827 = field344.method2480();
            arg1.field838 = field344.method2324() + field477;
            arg1.field839 = field344.method2356() + field477;
            arg1.field840 = field344.method2388();
            arg1.field846 = 1;
            arg1.field851 = 0;
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field835 = field344.method2324();
            int var7 = field344.method2396();
            arg1.field801 = var7 >> 16;
            arg1.field832 = (var7 & 0xFFFF) + field477;
            arg1.field830 = 0;
            arg1.field831 = 0;
            if (arg1.field832 > field477) {
                arg1.field830 = -1;
            }
            if (arg1.field835 == 65535) {
                arg1.field835 = -1;
            }
        }
        if ((arg2 & 0x20) != 0) {
            int var8 = field344.method2356();
            class146[] var9 = new class146[] { class146.field2168, class146.field2169, class146.field2176, class146.field2174, class146.field2167 };
            class146 var10 = (class146) class104.method631(var9, field344.method2517());
            boolean var11 = field344.method2517() == 1;
            int var12 = field344.method2480();
            int var13 = field344.field1894;
            if (arg1.field53 != null && arg1.field39 != null) {
                boolean var14 = false;
                if (var10.field2173 && method688(arg1.field53)) {
                    var14 = true;
                }
                if (!var14 && field418 == 0 && !arg1.field57) {
                    field465.field1894 = 0;
                    field344.method2447(field465.field1891, 0, var12);
                    field465.field1894 = 0;
                    String var15 = class217.method3681(class157.method650(class216.method2862(field465)));
                    arg1.field806 = var15.trim();
                    arg1.field810 = var8 >> 8;
                    arg1.field820 = var8 & 0xFF;
                    arg1.field809 = 150;
                    arg1.field793 = var11;
                    arg1.field808 = Statics.field143 != arg1 && var10.field2173 && field521 != "" && var15.toLowerCase().indexOf(field521) == -1;
                    int var16;
                    if (var10.field2177) {
                        var16 = var11 ? 91 : 1;
                    } else {
                        var16 = var11 ? 90 : 2;
                    }
                    if (var10.field2172 == -1) {
                        class11.method1792(var16, arg1.field53, var15);
                    } else {
                        class11.method1792(var16, class2.method3082(var10.field2172) + arg1.field53, var15);
                    }
                }
            }
            field344.field1894 = var12 + var13;
        }
        if ((arg2 & 0x40) != 0) {
            arg1.field806 = field344.method2440();
            if (arg1.field806.charAt(0) == '~') {
                arg1.field806 = arg1.field806.substring(1);
                class11.method1792(2, arg1.field53, arg1.field806);
            } else if (Statics.field143 == arg1) {
                class11.method1792(2, arg1.field53, arg1.field806);
            }
            arg1.field793 = false;
            arg1.field810 = 0;
            arg1.field820 = 0;
            arg1.field809 = 150;
        }
        if ((arg2 & 0x8) != 0) {
            int var17 = field344.method2517();
            byte[] var18 = new byte[var17];
            class114 var19 = new class114(var18);
            field344.method2365(var18, 0, var17);
            field575[arg0] = var19;
            arg1.method13(var19);
        }
        if ((arg2 & 0x10) != 0) {
            arg1.field818 = field344.method2324();
            if (arg1.field818 == 65535) {
                arg1.field818 = -1;
            }
        }
        if ((arg2 & 0x80) == 0) {
            return;
        }
        int var20 = field344.method2356();
        int var21 = field344.method2322();
        arg1.method719(var20, var21, field477);
        arg1.field815 = field477 + 300;
        arg1.field816 = field344.method2517();
        arg1.field817 = field344.method2322();
    }

    @ObfuscatedName("f.bx(ZI)V")
    public static final void method98(boolean arg0) {
        field427 = 0;
        field347 = 0;
        field344.method2590();
        int var1 = field344.method2576(8);
        if (var1 < field340) {
            for (int var2 = var1; var2 < field340; var2++) {
                field428[++field427 - 1] = field341[var2];
            }
        }
        if (var1 > field340) {
            throw new RuntimeException("");
        }
        field340 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field341[var3];
            class33 var5 = field573[var4];
            int var6 = field344.method2576(1);
            if (var6 == 0) {
                field341[++field340 - 1] = var4;
                var5.field841 = field477;
            } else {
                int var7 = field344.method2576(2);
                if (var7 == 0) {
                    field341[++field340 - 1] = var4;
                    var5.field841 = field477;
                    field423[++field347 - 1] = var4;
                } else if (var7 == 1) {
                    field341[++field340 - 1] = var4;
                    var5.field841 = field477;
                    int var8 = field344.method2576(3);
                    var5.method715(var8, false);
                    int var9 = field344.method2576(1);
                    if (var9 == 1) {
                        field423[++field347 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field341[++field340 - 1] = var4;
                    var5.field841 = field477;
                    int var10 = field344.method2576(3);
                    var5.method715(var10, true);
                    int var11 = field344.method2576(3);
                    var5.method715(var11, true);
                    int var12 = field344.method2576(1);
                    if (var12 == 1) {
                        field423[++field347 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field428[++field427 - 1] = var4;
                }
            }
        }
        while (field344.method2592(field345) >= 27) {
            int var13 = field344.method2576(15);
            if (var13 == 32767) {
                break;
            }
            boolean var29 = false;
            if (field573[var13] == null) {
                field573[var13] = new class33();
                var29 = true;
            }
            class33 var30 = field573[var13];
            field341[++field340 - 1] = var13;
            var30.field841 = field477;
            int var31;
            if (arg0) {
                var31 = field344.method2576(8);
                if (var31 > 127) {
                    var31 -= 256;
                }
            } else {
                var31 = field344.method2576(5);
                if (var31 > 15) {
                    var31 -= 32;
                }
            }
            int var32;
            if (arg0) {
                var32 = field344.method2576(8);
                if (var32 > 127) {
                    var32 -= 256;
                }
            } else {
                var32 = field344.method2576(5);
                if (var32 > 15) {
                    var32 -= 32;
                }
            }
            var30.field764 = class38.method564(field344.method2576(14));
            int var33 = field487[field344.method2576(3)];
            if (var29) {
                var30.field843 = var30.field795 = var33;
            }
            int var34 = field344.method2576(1);
            int var35 = field344.method2576(1);
            if (var35 == 1) {
                field423[++field347 - 1] = var13;
            }
            var30.field797 = var30.field764.field868;
            var30.field849 = var30.field764.field892;
            if (var30.field849 == 0) {
                var30.field795 = 0;
            }
            var30.field837 = var30.field764.field874;
            var30.field802 = var30.field764.field875;
            var30.field803 = var30.field764.field882;
            var30.field804 = var30.field764.field877;
            var30.field844 = var30.field764.field871;
            var30.field799 = var30.field764.field872;
            var30.field800 = var30.field764.field873;
            var30.method716(Statics.field143.field847[0] + var31, Statics.field143.field848[0] + var32, var34 == 1);
        }
        field344.method2577();
        for (int var14 = 0; var14 < field347; var14++) {
            int var15 = field423[var14];
            class33 var16 = field573[var15];
            int var17 = field344.method2322();
            if ((var17 & 0x8) != 0) {
                int var18 = field344.method2306();
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = field344.method2322();
                if (var16.field824 == var18 && var18 != -1) {
                    int var20 = class41.method1016(var18).field981;
                    if (var20 == 1) {
                        var16.field825 = 0;
                        var16.field811 = 0;
                        var16.field796 = var19;
                        var16.field828 = 0;
                    }
                    if (var20 == 2) {
                        var16.field828 = 0;
                    }
                } else if (var18 == -1 || var16.field824 == -1 || class41.method1016(var18).field965 >= class41.method1016(var16.field824).field965) {
                    var16.field824 = var18;
                    var16.field825 = 0;
                    var16.field811 = 0;
                    var16.field796 = var19;
                    var16.field828 = 0;
                    var16.field851 = var16.field846;
                }
            }
            if ((var17 & 0x20) != 0) {
                var16.field794 = field344.method2306();
                var16.field853 = field344.method2324();
            }
            if ((var17 & 0x80) != 0) {
                var16.field806 = field344.method2440();
                var16.field809 = 100;
            }
            if ((var17 & 0x40) != 0) {
                var16.field835 = field344.method2355();
                int var21 = field344.method2327();
                var16.field801 = var21 >> 16;
                var16.field832 = (var21 & 0xFFFF) + field477;
                var16.field830 = 0;
                var16.field831 = 0;
                if (var16.field832 > field477) {
                    var16.field830 = -1;
                }
                if (var16.field835 == 65535) {
                    var16.field835 = -1;
                }
            }
            if ((var17 & 0x4) != 0) {
                int var22 = field344.method2517();
                int var23 = field344.method2322();
                var16.method719(var22, var23, field477);
                var16.field815 = field477 + 300;
                var16.field816 = field344.method2324();
                var16.field817 = field344.method2356();
            }
            if ((var17 & 0x10) != 0) {
                var16.field764 = class38.method564(field344.method2306());
                var16.field797 = var16.field764.field868;
                var16.field849 = var16.field764.field892;
                var16.field837 = var16.field764.field874;
                var16.field802 = var16.field764.field875;
                var16.field803 = var16.field764.field882;
                var16.field804 = var16.field764.field877;
                var16.field844 = var16.field764.field871;
                var16.field799 = var16.field764.field872;
                var16.field800 = var16.field764.field873;
            }
            if ((var17 & 0x1) != 0) {
                int var24 = field344.method2480();
                int var25 = field344.method2388();
                var16.method719(var24, var25, field477);
                var16.field815 = field477 + 300;
                var16.field816 = field344.method2356();
                var16.field817 = field344.method2356();
            }
            if ((var17 & 0x2) != 0) {
                var16.field818 = field344.method2306();
                if (var16.field818 == 65535) {
                    var16.field818 = -1;
                }
            }
        }
        for (int var26 = 0; var26 < field427; var26++) {
            int var27 = field428[var26];
            if (field477 != field573[var27].field841) {
                field573[var27].field764 = null;
                field573[var27] = null;
            }
        }
        if (field345 != field344.field1894) {
            throw new RuntimeException(field344.field1894 + class2.field21 + field345);
        }
        for (int var28 = 0; var28 < field340; var28++) {
            if (field573[field341[var28]] == null) {
                throw new RuntimeException(var28 + class2.field21 + field340);
            }
        }
    }

    @ObfuscatedName("cn.bg(I)V")
    public static final void method2052() {
        int var0 = Statics.field3059;
        int var1 = Statics.field1972;
        int var2 = Statics.field251;
        int var3 = Statics.field152;
        int var4 = 6116423;
        class78.method1717(var0, var1, var2, var3, var4);
        class78.method1717(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class78.method1719(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field299.method3665(class151.field2382, var0 + 3, var1 + 14, var4, -1);
        int var5 = class135.field2045;
        int var6 = class135.field2046 * 200873089;
        for (int var7 = 0; var7 < field443; var7++) {
            int var8 = (field443 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class218 var10 = Statics.field299;
            String var11;
            if (field449[var7].length() > 0) {
                var11 = field448[var7] + class151.field2389 + field449[var7];
            } else {
                var11 = field448[var7];
            }
            var10.method3665(var11, var0 + 3, var8, var9, 0);
        }
        method131(Statics.field3059, Statics.field1972, Statics.field251, Statics.field152);
    }

    @ObfuscatedName("cm.bn(IIIIS)V")
    public static final void method2161(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field504; var4++) {
            if (field528[var4] + field509[var4] > arg0 && field509[var4] < arg0 + arg2 && field542[var4] + field541[var4] > arg1 && field542[var4] < arg1 + arg3) {
                field379[var4] = true;
            }
        }
    }

    @ObfuscatedName("u.bb(IIIII)V")
    public static final void method131(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field504; var4++) {
            if (field528[var4] + field509[var4] > arg0 && field509[var4] < arg0 + arg2 && field542[var4] + field541[var4] > arg1 && field542[var4] < arg1 + arg3) {
                field507[var4] = true;
            }
        }
    }

    @ObfuscatedName("er.bu(I)V")
    public static final void method2872() {
        method29();
        if (Statics.field259 != null || field474 != null) {
            return;
        }
        int var12;
        int var13;
        label196: {
            int var0 = class135.field2043;
            if (field559) {
                if (var0 != 1 && (Statics.field1352 || var0 != 4)) {
                    int var1 = class135.field2045;
                    int var2 = class135.field2046 * 200873089;
                    if (var1 < Statics.field3059 - 10 || var1 > Statics.field3059 + Statics.field251 + 10 || var2 < Statics.field1972 - 10 || var2 > Statics.field1972 + Statics.field152 + 10) {
                        field559 = false;
                        method2161(Statics.field3059, Statics.field1972, Statics.field251, Statics.field152);
                    }
                }
                if (var0 == 1 || !Statics.field1352 && var0 == 4) {
                    int var3 = Statics.field3059;
                    int var4 = Statics.field1972;
                    int var5 = Statics.field251;
                    int var6 = class135.field2052;
                    int var7 = class135.field2048;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field443; var9++) {
                        int var10 = (field443 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1) {
                        method2068(var8);
                    }
                    field559 = false;
                    method2161(Statics.field3059, Statics.field1972, Statics.field251, Statics.field152);
                }
            } else {
                if ((var0 == 1 || !Statics.field1352 && var0 == 4) && field443 > 0) {
                    int var11 = field446[field443 - 1];
                    if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                        var12 = field444[field443 - 1];
                        var13 = field381[field443 - 1];
                        class167 var14 = class167.method1258(var13);
                        if (class172.method1974(method147(var14))) {
                            break label196;
                        }
                        int var15 = method147(var14);
                        boolean var16 = (var15 >> 29 & 0x1) != 0;
                        if (var16) {
                            break label196;
                        }
                    }
                }
                if ((var0 == 1 || !Statics.field1352 && var0 == 4) && (field441 == 1 && field443 > 2 || method2641(field443 - 1))) {
                    var0 = 2;
                }
                if ((var0 == 1 || !Statics.field1352 && var0 == 4) && field443 > 0) {
                    method2068(field443 - 1);
                }
                if (var0 == 2 && field443 > 0) {
                    method904(class135.field2052, class135.field2048);
                }
            }
            return;
        }
        if (Statics.field259 != null && !field303 && field441 != 1 && !method2641(field443 - 1) && field443 > 0) {
            method588(field413, field414);
        }
        field303 = false;
        field452 = 0;
        if (Statics.field259 != null) {
            method1085(Statics.field259);
        }
        Statics.field259 = class167.method1258(var13);
        field412 = var12;
        field413 = class135.field2052;
        field414 = class135.field2048;
        if (field443 > 0) {
            method1790(field443 - 1);
        }
        method1085(Statics.field259);
    }

    @ObfuscatedName("aw.by(III)V")
    public static final void method904(int arg0, int arg1) {
        int var2 = Statics.field299.method3660(class151.field2382);
        for (int var3 = 0; var3 < field443; var3++) {
            class218 var4 = Statics.field299;
            String var5;
            if (field449[var3].length() > 0) {
                var5 = field448[var3] + class151.field2389 + field449[var3];
            } else {
                var5 = field448[var3];
            }
            int var6 = var4.method3660(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field443 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field2066) {
            var8 = Statics.field2066 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field2056) {
            var9 = Statics.field2056 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field559 = true;
        Statics.field3059 = var8;
        Statics.field1972 = var9;
        Statics.field251 = var2;
        Statics.field152 = field443 * 15 + 22;
    }

    @ObfuscatedName("dc.bt(II)Z")
    public static final boolean method2641(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field446[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("cx.ba(IB)V")
    public static final void method2068(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field444[arg0];
        int var2 = field381[arg0];
        int var3 = field446[arg0];
        int var4 = field459[arg0];
        String var5 = field448[arg0];
        String var6 = field449[arg0];
        method2271(var1, var2, var3, var4, var5, var6, class135.field2052, class135.field2048);
    }

    @ObfuscatedName("dh.bq(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method2271(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 47) {
            class3 var8 = field419[arg3];
            if (var8 != null) {
                field406 = arg6;
                field407 = arg7;
                field460 = 2;
                field408 = 0;
                field513 = arg0;
                field536 = arg1;
                field342.method2574(139);
                field342.method2367(arg3);
                field342.method2345(class132.field2004[82] ? 1 : 0);
            }
        }
        if (arg2 == 8) {
            class33 var9 = field573[arg3];
            if (var9 != null) {
                field406 = arg6;
                field407 = arg7;
                field460 = 2;
                field408 = 0;
                field513 = arg0;
                field536 = arg1;
                field342.method2574(83);
                field342.method2367(field457);
                field342.method2345(class132.field2004[82] ? 1 : 0);
                field342.method2361(Statics.field226);
                field342.method2367(arg3);
            }
        }
        if (arg2 == 1005) {
            class167 var10 = class167.method1258(arg1);
            if (var10 == null || var10.field2793[arg0] < 100000) {
                field342.method2574(65);
                field342.method2351(arg3);
            } else {
                class11.method1792(27, "", var10.field2793[arg0] + " x " + class50.method1088(arg3).field1094);
            }
            field328 = 0;
            Statics.field2520 = class167.method1258(arg1);
            field411 = arg0;
        }
        if (arg2 == 36) {
            field342.method2574(53);
            field342.method2353(arg3);
            field342.method2360(arg0);
            field342.method2361(arg1);
            field328 = 0;
            Statics.field2520 = class167.method1258(arg1);
            field411 = arg0;
        }
        if (arg2 == 1002) {
            field406 = arg6;
            field407 = arg7;
            field460 = 2;
            field408 = 0;
            field342.method2574(161);
            field342.method2367(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1) {
            field406 = arg6;
            field407 = arg7;
            field460 = 2;
            field408 = 0;
            field513 = arg0;
            field536 = arg1;
            field342.method2574(8);
            field342.method2367(arg3 >> 14 & 0x7FFF);
            field342.method2481(Statics.field1634);
            field342.method2367(Statics.field2628);
            field342.method2307(class132.field2004[82] ? 1 : 0);
            field342.method2360(Statics.field1367 + arg0);
            field342.method2360(Statics.field2578 + arg1);
            field342.method2353(Statics.field2028);
        }
        if (arg2 == 19) {
            field406 = arg6;
            field407 = arg7;
            field460 = 2;
            field408 = 0;
            field513 = arg0;
            field536 = arg1;
            field342.method2574(200);
            field342.method2360(arg3);
            field342.method2345(class132.field2004[82] ? 1 : 0);
            field342.method2367(Statics.field1367 + arg0);
            field342.method2367(Statics.field2578 + arg1);
        }
        if (arg2 == 28) {
            field342.method2574(125);
            field342.method2310(arg1);
            class167 var11 = class167.method1258(arg1);
            if (var11.field2801 != null && var11.field2801[0][0] == 5) {
                int var12 = var11.field2801[0][1];
                class170.field2823[var12] = 1 - class170.field2823[var12];
                method174(var12);
            }
        }
        if (arg2 == 48) {
            class3 var13 = field419[arg3];
            if (var13 != null) {
                field406 = arg6;
                field407 = arg7;
                field460 = 2;
                field408 = 0;
                field513 = arg0;
                field536 = arg1;
                field342.method2574(179);
                field342.method2345(class132.field2004[82] ? 1 : 0);
                field342.method2351(arg3);
            }
        }
        if (arg2 == 4) {
            field406 = arg6;
            field407 = arg7;
            field460 = 2;
            field408 = 0;
            field513 = arg0;
            field536 = arg1;
            field342.method2574(124);
            field342.method2344(class132.field2004[82] ? 1 : 0);
            field342.method2367(Statics.field2578 + arg1);
            field342.method2353(arg3 >> 14 & 0x7FFF);
            field342.method2353(Statics.field1367 + arg0);
        }
        if (arg2 == 7) {
            class33 var14 = field573[arg3];
            if (var14 != null) {
                field406 = arg6;
                field407 = arg7;
                field460 = 2;
                field408 = 0;
                field513 = arg0;
                field536 = arg1;
                field342.method2574(25);
                field342.method2351(Statics.field2028);
                field342.method2353(arg3);
                field342.method2351(Statics.field2628);
                field342.method2345(class132.field2004[82] ? 1 : 0);
                field342.method2310(Statics.field1634);
            }
        }
        if (arg2 == 43) {
            field342.method2574(4);
            field342.method2481(arg1);
            field342.method2360(arg3);
            field342.method2353(arg0);
            field328 = 0;
            Statics.field2520 = class167.method1258(arg1);
            field411 = arg0;
        }
        if (arg2 == 34) {
            field342.method2574(169);
            field342.method2360(arg3);
            field342.method2359(arg1);
            field342.method2367(arg0);
            field328 = 0;
            Statics.field2520 = class167.method1258(arg1);
            field411 = arg0;
        }
        if (arg2 == 17) {
            field406 = arg6;
            field407 = arg7;
            field460 = 2;
            field408 = 0;
            field513 = arg0;
            field536 = arg1;
            field342.method2574(12);
            field342.method2351(arg3);
            field342.method2361(Statics.field226);
            field342.method2360(field457);
            field342.method2353(Statics.field2578 + arg1);
            field342.method2351(Statics.field1367 + arg0);
            field342.method2346(class132.field2004[82] ? 1 : 0);
        }
        if (arg2 == 21) {
            field406 = arg6;
            field407 = arg7;
            field460 = 2;
            field408 = 0;
            field513 = arg0;
            field536 = arg1;
            field342.method2574(10);
            field342.method2351(Statics.field2578 + arg1);
            field342.method2345(class132.field2004[82] ? 1 : 0);
            field342.method2353(Statics.field1367 + arg0);
            field342.method2351(arg3);
        }
        if (arg2 == 41) {
            field342.method2574(60);
            field342.method2353(arg3);
            field342.method2359(arg1);
            field342.method2353(arg0);
            field328 = 0;
            Statics.field2520 = class167.method1258(arg1);
            field411 = arg0;
        }
        if (arg2 == 1004) {
            field406 = arg6;
            field407 = arg7;
            field460 = 2;
            field408 = 0;
            field342.method2574(65);
            field342.method2351(arg3);
        }
        if (arg2 == 16) {
            field406 = arg6;
            field407 = arg7;
            field460 = 2;
            field408 = 0;
            field513 = arg0;
            field536 = arg1;
            field342.method2574(87);
            field342.method2367(arg3);
            field342.method2360(Statics.field2028);
            field342.method2351(Statics.field2578 + arg1);
            field342.method2360(Statics.field2628);
            field342.method2360(Statics.field1367 + arg0);
            field342.method2359(Statics.field1634);
            field342.method2346(class132.field2004[82] ? 1 : 0);
        }
        if (arg2 == 1001) {
            field406 = arg6;
            field407 = arg7;
            field460 = 2;
            field408 = 0;
            field513 = arg0;
            field536 = arg1;
            field342.method2574(69);
            field342.method2367(arg3 >> 14 & 0x7FFF);
            field342.method2351(Statics.field2578 + arg1);
            field342.method2307(class132.field2004[82] ? 1 : 0);
            field342.method2367(Statics.field1367 + arg0);
        }
        if (arg2 == 30 && field360 == null) {
            field342.method2574(198);
            field342.method2310(arg1);
            field342.method2367(arg0);
            field360 = class167.method2858(arg1, arg0);
            method1085(field360);
        }
        if (arg2 == 6) {
            field406 = arg6;
            field407 = arg7;
            field460 = 2;
            field408 = 0;
            field513 = arg0;
            field536 = arg1;
            field342.method2574(240);
            field342.method2353(Statics.field1367 + arg0);
            field342.method2360(Statics.field2578 + arg1);
            field342.method2307(class132.field2004[82] ? 1 : 0);
            field342.method2367(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 20) {
            field406 = arg6;
            field407 = arg7;
            field460 = 2;
            field408 = 0;
            field513 = arg0;
            field536 = arg1;
            field342.method2574(195);
            field342.method2360(Statics.field2578 + arg1);
            field342.method2351(arg3);
            field342.method2367(Statics.field1367 + arg0);
            field342.method2307(class132.field2004[82] ? 1 : 0);
        }
        if (arg2 == 46) {
            class3 var15 = field419[arg3];
            if (var15 != null) {
                field406 = arg6;
                field407 = arg7;
                field460 = 2;
                field408 = 0;
                field513 = arg0;
                field536 = arg1;
                field342.method2574(64);
                field342.method2346(class132.field2004[82] ? 1 : 0);
                field342.method2367(arg3);
            }
        }
        if (arg2 == 10) {
            class33 var16 = field573[arg3];
            if (var16 != null) {
                field406 = arg6;
                field407 = arg7;
                field460 = 2;
                field408 = 0;
                field513 = arg0;
                field536 = arg1;
                field342.method2574(190);
                field342.method2307(class132.field2004[82] ? 1 : 0);
                field342.method2367(arg3);
            }
        }
        if (arg2 == 9) {
            class33 var17 = field573[arg3];
            if (var17 != null) {
                field406 = arg6;
                field407 = arg7;
                field460 = 2;
                field408 = 0;
                field513 = arg0;
                field536 = arg1;
                field342.method2574(31);
                field342.method2307(class132.field2004[82] ? 1 : 0);
                field342.method2353(arg3);
            }
        }
        if (arg2 == 42) {
            field342.method2574(74);
            field342.method2481(arg1);
            field342.method2351(arg3);
            field342.method2360(arg0);
            field328 = 0;
            Statics.field2520 = class167.method1258(arg1);
            field411 = arg0;
        }
        if (arg2 == 5) {
            field406 = arg6;
            field407 = arg7;
            field460 = 2;
            field408 = 0;
            field513 = arg0;
            field536 = arg1;
            field342.method2574(189);
            field342.method2351(Statics.field2578 + arg1);
            field342.method2353(Statics.field1367 + arg0);
            field342.method2367(arg3 >> 14 & 0x7FFF);
            field342.method2345(class132.field2004[82] ? 1 : 0);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class167 var18 = class167.method2858(arg1, arg0);
            if (var18 != null) {
                int var19 = var18.field2794;
                class167 var20 = class167.method2858(arg1, arg0);
                if (var20 != null) {
                    if (var20.field2721 != null) {
                        class1 var21 = new class1();
                        var21.field3 = var20;
                        var21.field6 = arg3;
                        var21.field11 = arg5;
                        var21.field4 = var20.field2721;
                        class35.method26(var21);
                    }
                    boolean var22 = true;
                    if (var20.field2680 > 0) {
                        var22 = method1590(var20);
                    }
                    if (var22) {
                        int var23 = method147(var20);
                        int var24 = arg3 - 1;
                        boolean var25 = (var23 >> var24 + 1 & 0x1) != 0;
                        if (var25) {
                            if (arg3 == 1) {
                                field342.method2574(182);
                                field342.method2310(arg1);
                                field342.method2367(arg0);
                                field342.method2367(var19);
                            }
                            if (arg3 == 2) {
                                field342.method2574(253);
                                field342.method2310(arg1);
                                field342.method2367(arg0);
                                field342.method2367(var19);
                            }
                            if (arg3 == 3) {
                                field342.method2574(209);
                                field342.method2310(arg1);
                                field342.method2367(arg0);
                                field342.method2367(var19);
                            }
                            if (arg3 == 4) {
                                field342.method2574(197);
                                field342.method2310(arg1);
                                field342.method2367(arg0);
                                field342.method2367(var19);
                            }
                            if (arg3 == 5) {
                                field342.method2574(118);
                                field342.method2310(arg1);
                                field342.method2367(arg0);
                                field342.method2367(var19);
                            }
                            if (arg3 == 6) {
                                field342.method2574(230);
                                field342.method2310(arg1);
                                field342.method2367(arg0);
                                field342.method2367(var19);
                            }
                            if (arg3 == 7) {
                                field342.method2574(183);
                                field342.method2310(arg1);
                                field342.method2367(arg0);
                                field342.method2367(var19);
                            }
                            if (arg3 == 8) {
                                field342.method2574(152);
                                field342.method2310(arg1);
                                field342.method2367(arg0);
                                field342.method2367(var19);
                            }
                            if (arg3 == 9) {
                                field342.method2574(23);
                                field342.method2310(arg1);
                                field342.method2367(arg0);
                                field342.method2367(var19);
                            }
                            if (arg3 == 10) {
                                field342.method2574(59);
                                field342.method2310(arg1);
                                field342.method2367(arg0);
                                field342.method2367(var19);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 37) {
            field342.method2574(174);
            field342.method2353(arg3);
            field342.method2360(arg0);
            field342.method2310(arg1);
            field328 = 0;
            Statics.field2520 = class167.method1258(arg1);
            field411 = arg0;
        }
        if (arg2 == 18) {
            field406 = arg6;
            field407 = arg7;
            field460 = 2;
            field408 = 0;
            field513 = arg0;
            field536 = arg1;
            field342.method2574(116);
            field342.method2360(arg3);
            field342.method2344(class132.field2004[82] ? 1 : 0);
            field342.method2360(Statics.field2578 + arg1);
            field342.method2360(Statics.field1367 + arg0);
        }
        if (arg2 == 40) {
            field342.method2574(1);
            field342.method2359(arg1);
            field342.method2353(arg3);
            field342.method2367(arg0);
            field328 = 0;
            Statics.field2520 = class167.method1258(arg1);
            field411 = arg0;
        }
        if (arg2 == 31) {
            field342.method2574(54);
            field342.method2310(arg1);
            field342.method2353(Statics.field2628);
            field342.method2360(arg3);
            field342.method2359(Statics.field1634);
            field342.method2360(arg0);
            field342.method2353(Statics.field2028);
            field328 = 0;
            Statics.field2520 = class167.method1258(arg1);
            field411 = arg0;
        }
        if (arg2 == 32) {
            field342.method2574(11);
            field342.method2361(arg1);
            field342.method2367(arg3);
            field342.method2367(field457);
            field342.method2360(arg0);
            field342.method2310(Statics.field226);
            field328 = 0;
            Statics.field2520 = class167.method1258(arg1);
            field411 = arg0;
        }
        if (arg2 == 33) {
            field342.method2574(208);
            field342.method2367(arg3);
            field342.method2353(arg0);
            field342.method2310(arg1);
            field328 = 0;
            Statics.field2520 = class167.method1258(arg1);
            field411 = arg0;
        }
        if (arg2 == 49) {
            class3 var26 = field419[arg3];
            if (var26 != null) {
                field406 = arg6;
                field407 = arg7;
                field460 = 2;
                field408 = 0;
                field513 = arg0;
                field536 = arg1;
                field342.method2574(192);
                field342.method2360(arg3);
                field342.method2344(class132.field2004[82] ? 1 : 0);
            }
        }
        if (arg2 == 44) {
            class3 var27 = field419[arg3];
            if (var27 != null) {
                field406 = arg6;
                field407 = arg7;
                field460 = 2;
                field408 = 0;
                field513 = arg0;
                field536 = arg1;
                field342.method2574(177);
                field342.method2351(arg3);
                field342.method2345(class132.field2004[82] ? 1 : 0);
            }
        }
        if (arg2 == 15) {
            class3 var28 = field419[arg3];
            if (var28 != null) {
                field406 = arg6;
                field407 = arg7;
                field460 = 2;
                field408 = 0;
                field513 = arg0;
                field536 = arg1;
                field342.method2574(231);
                field342.method2345(class132.field2004[82] ? 1 : 0);
                field342.method2367(field457);
                field342.method2353(arg3);
                field342.method2359(Statics.field226);
            }
        }
        if (arg2 == 1003) {
            field406 = arg6;
            field407 = arg7;
            field460 = 2;
            field408 = 0;
            class33 var29 = field573[arg3];
            if (var29 != null) {
                class38 var30 = var29.field764;
                if (var30.field891 != null) {
                    var30 = var30.method742();
                }
                if (var30 != null) {
                    field342.method2574(178);
                    field342.method2351(var30.field866);
                }
            }
        }
        if (arg2 == 25) {
            class167 var31 = class167.method2858(arg1, arg0);
            if (var31 != null) {
                method2058();
                int var32 = method147(var31);
                int var33 = var32 >> 11 & 0x3F;
                int var35 = var31.field2794;
                class167 var36 = class167.method2858(arg1, arg0);
                if (var36 != null && var36.field2759 != null) {
                    class1 var37 = new class1();
                    var37.field3 = var36;
                    var37.field4 = var36.field2759;
                    class35.method26(var37);
                }
                field400 = var35;
                field456 = true;
                Statics.field226 = arg1;
                field457 = arg0;
                Statics.field1341 = var33;
                method1085(var36);
                field454 = 0;
                int var38 = method147(var31);
                int var39 = var38 >> 11 & 0x3F;
                String var40;
                if (var39 == 0) {
                    var40 = null;
                } else if (var31.field2753 == null || var31.field2753.trim().length() == 0) {
                    var40 = null;
                } else {
                    var40 = var31.field2753;
                }
                field301 = var40;
                if (field301 == null) {
                    field301 = "Null";
                }
                if (var31.field2675) {
                    field353 = var31.field2747 + class2.method3393(16777215);
                } else {
                    field353 = class2.method3393(65280) + var31.field2763 + class2.method3393(16777215);
                }
            }
            return;
        }
        if (arg2 == 50) {
            class3 var41 = field419[arg3];
            if (var41 != null) {
                field406 = arg6;
                field407 = arg7;
                field460 = 2;
                field408 = 0;
                field513 = arg0;
                field536 = arg1;
                field342.method2574(153);
                field342.method2360(arg3);
                field342.method2345(class132.field2004[82] ? 1 : 0);
            }
        }
        if (arg2 == 3) {
            field406 = arg6;
            field407 = arg7;
            field460 = 2;
            field408 = 0;
            field513 = arg0;
            field536 = arg1;
            field342.method2574(119);
            field342.method2353(Statics.field2578 + arg1);
            field342.method2345(class132.field2004[82] ? 1 : 0);
            field342.method2367(Statics.field1367 + arg0);
            field342.method2360(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 11) {
            class33 var42 = field573[arg3];
            if (var42 != null) {
                field406 = arg6;
                field407 = arg7;
                field460 = 2;
                field408 = 0;
                field513 = arg0;
                field536 = arg1;
                field342.method2574(82);
                field342.method2353(arg3);
                field342.method2344(class132.field2004[82] ? 1 : 0);
            }
        }
        if (arg2 == 2) {
            field406 = arg6;
            field407 = arg7;
            field460 = 2;
            field408 = 0;
            field513 = arg0;
            field536 = arg1;
            field342.method2574(99);
            field342.method2346(class132.field2004[82] ? 1 : 0);
            field342.method2351(Statics.field1367 + arg0);
            field342.method2360(arg3 >> 14 & 0x7FFF);
            field342.method2360(field457);
            field342.method2361(Statics.field226);
            field342.method2351(Statics.field2578 + arg1);
        }
        if (arg2 == 24) {
            class167 var43 = class167.method1258(arg1);
            boolean var44 = true;
            if (var43.field2680 > 0) {
                var44 = method1590(var43);
            }
            if (var44) {
                field342.method2574(125);
                field342.method2310(arg1);
            }
        }
        if (arg2 == 22) {
            field406 = arg6;
            field407 = arg7;
            field460 = 2;
            field408 = 0;
            field513 = arg0;
            field536 = arg1;
            field342.method2574(97);
            field342.method2346(class132.field2004[82] ? 1 : 0);
            field342.method2360(Statics.field2578 + arg1);
            field342.method2353(Statics.field1367 + arg0);
            field342.method2353(arg3);
        }
        if (arg2 == 51) {
            class3 var45 = field419[arg3];
            if (var45 != null) {
                field406 = arg6;
                field407 = arg7;
                field460 = 2;
                field408 = 0;
                field513 = arg0;
                field536 = arg1;
                field342.method2574(228);
                field342.method2346(class132.field2004[82] ? 1 : 0);
                field342.method2353(arg3);
            }
        }
        if (arg2 == 45) {
            class3 var46 = field419[arg3];
            if (var46 != null) {
                field406 = arg6;
                field407 = arg7;
                field460 = 2;
                field408 = 0;
                field513 = arg0;
                field536 = arg1;
                field342.method2574(105);
                field342.method2346(class132.field2004[82] ? 1 : 0);
                field342.method2351(arg3);
            }
        }
        if (arg2 == 13) {
            class33 var47 = field573[arg3];
            if (var47 != null) {
                field406 = arg6;
                field407 = arg7;
                field460 = 2;
                field408 = 0;
                field513 = arg0;
                field536 = arg1;
                field342.method2574(186);
                field342.method2344(class132.field2004[82] ? 1 : 0);
                field342.method2367(arg3);
            }
        }
        if (arg2 == 35) {
            field342.method2574(43);
            field342.method2351(arg3);
            field342.method2481(arg1);
            field342.method2353(arg0);
            field328 = 0;
            Statics.field2520 = class167.method1258(arg1);
            field411 = arg0;
        }
        if (arg2 == 26) {
            field342.method2574(180);
            for (class4 var48 = (class4) field462.method3462(); var48 != null; var48 = (class4) field462.method3468()) {
                if (var48.field61 == 0 || var48.field61 == 3) {
                    Statics.method962(var48, true);
                }
            }
            if (field360 != null) {
                method1085(field360);
                field360 = null;
            }
        }
        if (arg2 == 58) {
            class167 var49 = class167.method2858(arg1, arg0);
            if (var49 != null) {
                field342.method2574(66);
                field342.method2360(field457);
                field342.method2310(Statics.field226);
                field342.method2360(arg0);
                field342.method2353(field400);
                field342.method2351(var49.field2794);
                field342.method2361(arg1);
            }
        }
        if (arg2 == 29) {
            field342.method2574(125);
            field342.method2310(arg1);
            class167 var50 = class167.method1258(arg1);
            if (var50.field2801 != null && var50.field2801[0][0] == 5) {
                int var51 = var50.field2801[0][1];
                if (class170.field2823[var51] != var50.field2764[0]) {
                    class170.field2823[var51] = var50.field2764[0];
                    method174(var51);
                }
            }
        }
        if (arg2 == 12) {
            class33 var52 = field573[arg3];
            if (var52 != null) {
                field406 = arg6;
                field407 = arg7;
                field460 = 2;
                field408 = 0;
                field513 = arg0;
                field536 = arg1;
                field342.method2574(236);
                field342.method2360(arg3);
                field342.method2345(class132.field2004[82] ? 1 : 0);
            }
        }
        if (arg2 == 38) {
            method2058();
            class167 var53 = class167.method1258(arg1);
            field454 = 1;
            Statics.field2028 = arg0;
            Statics.field1634 = arg1;
            Statics.field2628 = arg3;
            method1085(var53);
            field455 = class2.method3393(16748608) + class50.method1088(arg3).field1094 + class2.method3393(16777215);
            if (field455 == null) {
                field455 = "null";
            }
            return;
        }
        if (arg2 == 23) {
            Statics.field1555.method1837(Statics.field3101, arg0, arg1);
        }
        if (arg2 == 39) {
            field342.method2574(77);
            field342.method2353(arg0);
            field342.method2351(arg3);
            field342.method2310(arg1);
            field328 = 0;
            Statics.field2520 = class167.method1258(arg1);
            field411 = arg0;
        }
        if (arg2 == 14) {
            class3 var54 = field419[arg3];
            if (var54 != null) {
                field406 = arg6;
                field407 = arg7;
                field460 = 2;
                field408 = 0;
                field513 = arg0;
                field536 = arg1;
                field342.method2574(244);
                field342.method2353(Statics.field2028);
                field342.method2344(class132.field2004[82] ? 1 : 0);
                field342.method2360(Statics.field2628);
                field342.method2310(Statics.field1634);
                field342.method2353(arg3);
            }
        }
        if (field454 != 0) {
            field454 = 0;
            method1085(class167.method1258(Statics.field1634));
        }
        if (field456) {
            method2058();
        }
        if (Statics.field2520 != null && field328 == 0) {
            method1085(Statics.field2520);
        }
    }

    @ObfuscatedName("cj.bk(I)V")
    public static void method2058() {
        if (!field456) {
            return;
        }
        class167 var0 = class167.method2858(Statics.field226, field457);
        if (var0 != null && var0.field2766 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field4 = var0.field2766;
            class35.method26(var1);
        }
        field456 = false;
        method1085(var0);
    }

    @ObfuscatedName("l.bc(B)V")
    public static final void method29() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field443 - 1; var1++) {
                if (field446[var1] < 1000 && field446[var1 + 1] > 1000) {
                    String var2 = field449[var1];
                    field449[var1] = field449[var1 + 1];
                    field449[var1 + 1] = var2;
                    String var3 = field448[var1];
                    field448[var1] = field448[var1 + 1];
                    field448[var1 + 1] = var3;
                    int var4 = field446[var1];
                    field446[var1] = field446[var1 + 1];
                    field446[var1 + 1] = var4;
                    int var5 = field444[var1];
                    field444[var1] = field444[var1 + 1];
                    field444[var1 + 1] = var5;
                    int var6 = field381[var1];
                    field381[var1] = field381[var1 + 1];
                    field381[var1 + 1] = var6;
                    int var7 = field459[var1];
                    field459[var1] = field459[var1 + 1];
                    field459[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ak.be(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method656(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field559 || field443 >= 500) {
            return;
        }
        field448[field443] = arg0;
        field449[field443] = arg1;
        field446[field443] = arg2;
        field459[field443] = arg3;
        field444[field443] = arg4;
        field381[field443] = arg5;
        field443++;
    }

    @ObfuscatedName("da.bh(B)V")
    public static void method2270() {
        for (int var0 = 0; var0 < field443; var0++) {
            int var1 = field446[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field443 - 1) {
                    for (int var3 = var0; var3 < field443 - 1; var3++) {
                        field448[var3] = field448[var3 + 1];
                        field449[var3] = field449[var3 + 1];
                        field446[var3] = field446[var3 + 1];
                        field459[var3] = field459[var3 + 1];
                        field444[var3] = field444[var3 + 1];
                        field381[var3] = field381[var3 + 1];
                    }
                }
                field443--;
            }
        }
    }

    @ObfuscatedName("n.bl(IIIII)V")
    public static final void method185(int arg0, int arg1, int arg2, int arg3) {
        if (field454 == 0 && !field456) {
            method656(class151.field2384, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class103.field1797; var6++) {
            int var7 = class103.field1798[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field1555.method1899(Statics.field3101, var8, var9, var7) >= 0) {
                    class39 var12 = class39.method902(var11);
                    if (var12.field944 != null) {
                        var12 = var12.method771();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field454 == 1) {
                        method656(class151.field2379, field455 + " " + class2.field25 + " " + class2.method3393(65535) + var12.field913, 1, var7, var8, var9);
                    } else if (!field456) {
                        String[] var13 = var12.field930;
                        if (field472) {
                            var13 = method2158(var13);
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
                                    method656(var13[var14], class2.method3393(65535) + var12.field913, var15, var7, var8, var9);
                                }
                            }
                        }
                        method656(class151.field2436, class2.method3393(65535) + var12.field913, 1002, var12.field951 << 14, var8, var9);
                    } else if ((Statics.field1341 & 0x4) == 4) {
                        method656(field301, field353 + " " + class2.field25 + " " + class2.method3393(65535) + var12.field913, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class33 var16 = field573[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field764.field868 == 1 && (var16.field814 & 0x7F) == 64 && (var16.field821 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field340; var17++) {
                            class33 var18 = field573[field341[var17]];
                            if (var18 != null && var16 != var18 && var18.field764.field868 == 1 && var16.field814 == var18.field814 && var16.field821 == var18.field821) {
                                method730(var18.field764, field341[var17], var8, var9);
                            }
                        }
                        for (int var19 = 0; var19 < field409; var19++) {
                            class3 var20 = field419[field447[var19]];
                            if (var20 != null && var16.field814 == var20.field814 && var16.field821 == var20.field821) {
                                method158(var20, field447[var19], var8, var9);
                            }
                        }
                    }
                    method730(var16.field764, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var21 = field419[var11];
                    if (var21 == null) {
                        continue;
                    }
                    if ((var21.field814 & 0x7F) == 64 && (var21.field821 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < field340; var22++) {
                            class33 var23 = field573[field341[var22]];
                            if (var23 != null && var23.field764.field868 == 1 && var21.field814 == var23.field814 && var21.field821 == var23.field821) {
                                method730(var23.field764, field341[var22], var8, var9);
                            }
                        }
                        for (int var24 = 0; var24 < field409; var24++) {
                            class3 var25 = field419[field447[var24]];
                            if (var25 != null && var21 != var25 && var21.field814 == var25.field814 && var21.field821 == var25.field821) {
                                method158(var25, field447[var24], var8, var9);
                            }
                        }
                    }
                    if (field433 == var11) {
                        var4 = var7;
                    } else {
                        method158(var21, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class193 var26 = field391[Statics.field3101][var8][var9];
                    if (var26 != null) {
                        for (class28 var27 = (class28) var26.method3491(); var27 != null; var27 = (class28) var26.method3487()) {
                            class50 var28 = class50.method1088(var27.field681);
                            if (field454 == 1) {
                                method656(class151.field2379, field455 + " " + class2.field25 + " " + class2.method3393(16748608) + var28.field1094, 16, var27.field681, var8, var9);
                            } else if (!field456) {
                                String[] var29 = var28.field1101;
                                if (field472) {
                                    var29 = method2158(var29);
                                }
                                for (int var30 = 4; var30 >= 0; var30--) {
                                    if (var29 != null && var29[var30] != null) {
                                        byte var31 = 0;
                                        if (var30 == 0) {
                                            var31 = 18;
                                        }
                                        if (var30 == 1) {
                                            var31 = 19;
                                        }
                                        if (var30 == 2) {
                                            var31 = 20;
                                        }
                                        if (var30 == 3) {
                                            var31 = 21;
                                        }
                                        if (var30 == 4) {
                                            var31 = 22;
                                        }
                                        method656(var29[var30], class2.method3393(16748608) + var28.field1094, var31, var27.field681, var8, var9);
                                    } else if (var30 == 2) {
                                        method656(class151.field2284, class2.method3393(16748608) + var28.field1094, 20, var27.field681, var8, var9);
                                    }
                                }
                                method656(class151.field2436, class2.method3393(16748608) + var28.field1094, 1004, var27.field681, var8, var9);
                            } else if ((Statics.field1341 & 0x1) == 1) {
                                method656(field301, field353 + " " + class2.field25 + " " + class2.method3393(16748608) + var28.field1094, 17, var27.field681, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var32 = var4 & 0x7F;
            int var33 = var4 >> 7 & 0x7F;
            class3 var34 = field419[field433];
            method158(var34, field433, var32, var33);
        }
    }

    @ObfuscatedName("ar.cb(Lab;IIIB)V")
    public static final void method730(class38 arg0, int arg1, int arg2, int arg3) {
        if (field443 >= 400) {
            return;
        }
        if (arg0.field891 != null) {
            arg0 = arg0.method742();
        }
        if (arg0 == null || !arg0.field895 || arg0.field897 && field469 != arg1) {
            return;
        }
        String var4 = arg0.field867;
        if (arg0.field899 != 0) {
            int var6 = arg0.field899;
            int var7 = Statics.field143.field42;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method3393(16711680);
            } else if (var8 < -6) {
                var9 = class2.method3393(16723968);
            } else if (var8 < -3) {
                var9 = class2.method3393(16740352);
            } else if (var8 < 0) {
                var9 = class2.method3393(16756736);
            } else if (var8 > 9) {
                var9 = class2.method3393(65280);
            } else if (var8 > 6) {
                var9 = class2.method3393(4259584);
            } else if (var8 > 3) {
                var9 = class2.method3393(8453888);
            } else if (var8 > 0) {
                var9 = class2.method3393(12648192);
            } else {
                var9 = class2.method3393(16776960);
            }
            var4 = var4 + var9 + " " + class2.field20 + class151.field2385 + arg0.field899 + class2.field37;
        }
        if (field454 == 1) {
            method656(class151.field2379, field455 + " " + class2.field25 + " " + class2.method3393(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field456) {
            String[] var10 = arg0.field893;
            if (field472) {
                var10 = method2158(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class151.field2381)) {
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
                        method656(var10[var11], class2.method3393(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class151.field2381)) {
                        short var14 = 0;
                        if (field329 == class20.field586 || field329 == class20.field584 && arg0.field899 > Statics.field143.field42) {
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
                        method656(var10[var13], class2.method3393(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method656(class151.field2436, class2.method3393(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1341 & 0x2) == 2) {
            method656(field301, field353 + " " + class2.field25 + " " + class2.method3393(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("v.cl(Lz;IIII)V")
    public static final void method158(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field143 == arg0 || field443 >= 400) {
            return;
        }
        String var9;
        if (arg0.field48 == 0) {
            String var4 = arg0.field53;
            int var5 = arg0.field42;
            int var6 = Statics.field143.field42;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method3393(16711680);
            } else if (var7 < -6) {
                var8 = class2.method3393(16723968);
            } else if (var7 < -3) {
                var8 = class2.method3393(16740352);
            } else if (var7 < 0) {
                var8 = class2.method3393(16756736);
            } else if (var7 > 9) {
                var8 = class2.method3393(65280);
            } else if (var7 > 6) {
                var8 = class2.method3393(4259584);
            } else if (var7 > 3) {
                var8 = class2.method3393(8453888);
            } else if (var7 > 0) {
                var8 = class2.method3393(12648192);
            } else {
                var8 = class2.method3393(16776960);
            }
            var9 = var4 + var8 + " " + class2.field20 + class151.field2385 + arg0.field42 + class2.field37;
        } else {
            var9 = arg0.field53 + " " + class2.field20 + class151.field2386 + arg0.field48 + class2.field37;
        }
        if (field454 == 1) {
            method656(class151.field2379, field455 + " " + class2.field25 + " " + class2.method3393(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field456) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field485[var10] != null) {
                    short var11 = 0;
                    if (field485[var10].equalsIgnoreCase(class151.field2381)) {
                        if (field329 == class20.field586 || field329 == class20.field584 && arg0.field42 > Statics.field143.field42) {
                            var11 = 2000;
                        }
                        if (Statics.field143.field56 != 0 && arg0.field56 != 0) {
                            if (Statics.field143.field56 == arg0.field56) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field431[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field429[var10] + var11;
                    method656(field485[var10], class2.method3393(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1341 & 0x8) == 8) {
            method656(field301, field353 + " " + class2.field25 + " " + class2.method3393(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field443; var14++) {
            if (field446[var14] == 23) {
                field449[var14] = class2.method3393(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("ai.cs(IIIIIIIII)V")
    public static final void method812(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class167.method2884(arg0)) {
            Statics.field785 = null;
            method86(Statics.field1130[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field785 != null) {
                method86(Statics.field785, -1412584499, arg1, arg2, arg3, arg4, Statics.field214, Statics.field2024, arg7);
                Statics.field785 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field379[var8] = true;
            }
        } else {
            field379[arg7] = true;
        }
    }

    @ObfuscatedName("d.ca([Lfo;IIIIIIIII)V")
    public static final void method86(class167[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class78.method1711(arg2, arg3, arg4, arg5);
        class89.method1978();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class167 var10 = arg0[var9];
            if (var10 != null && (var10.field2782 == arg1 || arg1 == -1412584499 && field474 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field509[field504] = var10.field2689 + arg6;
                    field542[field504] = var10.field2746 + arg7;
                    field528[field504] = var10.field2691;
                    field541[field504] = var10.field2692;
                    var11 = ++field504 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2762 = var11;
                var10.field2806 = field477;
                if (!var10.field2675 || !method964(var10)) {
                    if (var10.field2680 > 0) {
                        int var12 = var10.field2680;
                        if (var12 == 324) {
                            if (field576 == -1) {
                                field576 = var10.field2709;
                                field577 = var10.field2710;
                            }
                            if (field569.field2840) {
                                var10.field2709 = field576;
                            } else {
                                var10.field2709 = field577;
                            }
                        } else if (var12 == 325) {
                            if (field576 == -1) {
                                field576 = var10.field2709;
                                field577 = var10.field2710;
                            }
                            if (field569.field2840) {
                                var10.field2709 = field577;
                            } else {
                                var10.field2709 = field576;
                            }
                        } else if (var12 == 327) {
                            var10.field2725 = 150;
                            var10.field2726 = (int) (Math.sin((double) field477 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2752 = 5;
                            var10.field2720 = 0;
                        } else if (var12 == 328) {
                            var10.field2725 = 150;
                            var10.field2726 = (int) (Math.sin((double) field477 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2752 = 5;
                            var10.field2720 = 1;
                        }
                    }
                    int var13 = var10.field2689 + arg6;
                    int var14 = var10.field2746 + arg7;
                    int var15 = var10.field2706;
                    if (field474 == var10) {
                        if (arg1 != -1412584499 && !var10.field2676) {
                            Statics.field785 = arg0;
                            Statics.field214 = arg6;
                            Statics.field2024 = arg7;
                            continue;
                        }
                        if (field552 && field479) {
                            int var16 = class135.field2045;
                            int var17 = class135.field2046 * 200873089;
                            int var18 = var16 - field476;
                            int var19 = var17 - field464;
                            if (var18 < field480) {
                                var18 = field480;
                            }
                            if (var10.field2691 + var18 > field480 + field518.field2691) {
                                var18 = field480 + field518.field2691 - var10.field2691;
                            }
                            if (var19 < field481) {
                                var19 = field481;
                            }
                            if (var10.field2692 + var19 > field481 + field518.field2692) {
                                var19 = field481 + field518.field2692 - var10.field2692;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2676) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2714 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2714 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2691 + var13;
                        int var27 = var10.field2692 + var14;
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
                        int var30 = var10.field2691 + var13;
                        int var31 = var10.field2692 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2675 || var20 < var22 && var21 < var23) {
                        if (var10.field2680 != 0) {
                            if (var10.field2680 == 1336) {
                                if (field318) {
                                    var14 += 15;
                                    Statics.field2826.method3701("Fps:" + field2103, var10.field2691 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field307) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field307) {
                                        var34 = 16711680;
                                    }
                                    Statics.field2826.method3701("Mem:" + var33 + "k", var10.field2691 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2680 == 1337) {
                                field491 = var13;
                                field451 = var14;
                                method947(var13, var14, var10.field2691, var10.field2692);
                                field379[var10.field2762] = true;
                                class78.method1711(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2680 == 1338) {
                                method690(var10, var13, var14, var11);
                                class78.method1711(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2680 == 1339) {
                                method151(var10, var13, var14, var11);
                                class78.method1711(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2714 == 0) {
                            if (!var10.field2675 && method964(var10) && Statics.field1573 != var10) {
                                continue;
                            }
                            if (!var10.field2675) {
                                if (var10.field2698 > var10.field2700 - var10.field2692) {
                                    var10.field2698 = var10.field2700 - var10.field2692;
                                }
                                if (var10.field2698 < 0) {
                                    var10.field2698 = 0;
                                }
                            }
                            method86(arg0, var10.field2807, var20, var21, var22, var23, var13 - var10.field2697, var14 - var10.field2698, var11);
                            if (var10.field2786 != null) {
                                method86(var10.field2786, var10.field2807, var20, var21, var22, var23, var13 - var10.field2697, var14 - var10.field2698, var11);
                            }
                            class4 var35 = (class4) field462.method3459((long) var10.field2807);
                            if (var35 != null) {
                                method812(var35.field69, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class78.method1711(arg2, arg3, arg4, arg5);
                            class89.method1978();
                        }
                        if (field515 || field508[var11] || field308 > 1) {
                            if (var10.field2714 == 0 && !var10.field2675 && var10.field2700 > var10.field2692) {
                                method2067(var10.field2691 + var13, var14, var10.field2698, var10.field2692, var10.field2700);
                            }
                            if (var10.field2714 != 1) {
                                if (var10.field2714 == 2) {
                                    int var36 = 0;
                                    for (int var37 = 0; var37 < var10.field2688; var37++) {
                                        for (int var38 = 0; var38 < var10.field2780; var38++) {
                                            int var39 = (var10.field2740 + 32) * var38 + var13;
                                            int var40 = (var10.field2703 + 32) * var37 + var14;
                                            if (var36 < 20) {
                                                var39 += var10.field2742[var36];
                                                var40 += var10.field2743[var36];
                                            }
                                            if (var10.field2792[var36] > 0) {
                                                boolean var41 = false;
                                                boolean var42 = false;
                                                int var43 = var10.field2792[var36] - 1;
                                                if (var39 + 32 > arg2 && var39 < arg4 && var40 + 32 > arg3 && var40 < arg5 || Statics.field259 == var10 && field412 == var36) {
                                                    class77 var44;
                                                    if (field454 == 1 && Statics.field2028 == var36 && Statics.field1634 == var10.field2807) {
                                                        var44 = class50.method148(var43, var10.field2793[var36], 2, 0, 2, false);
                                                    } else {
                                                        var44 = class50.method148(var43, var10.field2793[var36], 1, 3153952, 2, false);
                                                    }
                                                    if (var44 == null) {
                                                        method1085(var10);
                                                    } else if (Statics.field259 == var10 && field412 == var36) {
                                                        int var45 = class135.field2045 - field413;
                                                        int var46 = class135.field2046 * 200873089 - field414;
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (var46 < 5 && var46 > -5) {
                                                            var46 = 0;
                                                        }
                                                        if (field452 < 5) {
                                                            var45 = 0;
                                                            var46 = 0;
                                                        }
                                                        var44.method1633(var39 + var45, var40 + var46, 128);
                                                        if (arg1 != -1) {
                                                            class167 var47 = arg0[arg1 & 0xFFFF];
                                                            if (var40 + var46 < class78.field1382 && var47.field2698 > 0) {
                                                                int var48 = field430 * (class78.field1382 - var40 - var46) / 3;
                                                                if (var48 > field430 * 10) {
                                                                    var48 = field430 * 10;
                                                                }
                                                                if (var48 > var47.field2698) {
                                                                    var48 = var47.field2698;
                                                                }
                                                                var47.field2698 -= var48;
                                                                field414 += var48;
                                                                method1085(var47);
                                                            }
                                                            if (var40 + var46 + 32 > class78.field1386 && var47.field2698 < var47.field2700 - var47.field2692) {
                                                                int var49 = field430 * (var40 + var46 + 32 - class78.field1386) / 3;
                                                                if (var49 > field430 * 10) {
                                                                    var49 = field430 * 10;
                                                                }
                                                                if (var49 > var47.field2700 - var47.field2692 - var47.field2698) {
                                                                    var49 = var47.field2700 - var47.field2692 - var47.field2698;
                                                                }
                                                                var47.field2698 += var49;
                                                                field414 -= var49;
                                                                method1085(var47);
                                                            }
                                                        }
                                                    } else if (Statics.field2520 == var10 && field411 == var36) {
                                                        var44.method1633(var39, var40, 128);
                                                    } else {
                                                        var44.method1640(var39, var40);
                                                    }
                                                }
                                            } else if (var10.field2744 != null && var36 < 20) {
                                                class77 var50 = var10.method3107(var36);
                                                if (var50 != null) {
                                                    var50.method1640(var39, var40);
                                                } else if (class167.field2674) {
                                                    method1085(var10);
                                                }
                                            }
                                            var36++;
                                        }
                                    }
                                } else if (var10.field2714 == 3) {
                                    int var51;
                                    if (method689(var10)) {
                                        var51 = var10.field2702;
                                        if (Statics.field1573 == var10 && var10.field2704 != 0) {
                                            var51 = var10.field2704;
                                        }
                                    } else {
                                        var51 = var10.field2701;
                                        if (Statics.field1573 == var10 && var10.field2765 != 0) {
                                            var51 = var10.field2765;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2741) {
                                            class78.method1717(var13, var14, var10.field2691, var10.field2692, var51);
                                        } else {
                                            class78.method1719(var13, var14, var10.field2691, var10.field2692, var51);
                                        }
                                    } else if (var10.field2741) {
                                        class78.method1716(var13, var14, var10.field2691, var10.field2692, var51, 256 - (var15 & 0xFF));
                                    } else {
                                        class78.method1720(var13, var14, var10.field2691, var10.field2692, var51, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2714 == 4) {
                                    class218 var52 = var10.method3142();
                                    if (var52 != null) {
                                        String var53 = var10.field2708;
                                        int var54;
                                        if (method689(var10)) {
                                            var54 = var10.field2702;
                                            if (Statics.field1573 == var10 && var10.field2704 != 0) {
                                                var54 = var10.field2704;
                                            }
                                            if (var10.field2735.length() > 0) {
                                                var53 = var10.field2735;
                                            }
                                        } else {
                                            var54 = var10.field2701;
                                            if (Statics.field1573 == var10 && var10.field2765 != 0) {
                                                var54 = var10.field2765;
                                            }
                                        }
                                        if (var10.field2675 && var10.field2794 != -1) {
                                            class50 var55 = class50.method1088(var10.field2794);
                                            var53 = var55.field1094;
                                            if (var53 == null) {
                                                var53 = "null";
                                            }
                                            if ((var55.field1102 == 1 || var10.field2795 != 1) && var10.field2795 != -1) {
                                                var53 = class2.method3393(16748608) + var53 + class2.field27 + " " + 'x' + method1522(var10.field2795);
                                            }
                                        }
                                        if (field360 == var10) {
                                            class151 var10000 = (class151) null;
                                            var53 = class151.field2387;
                                            var54 = var10.field2701;
                                        }
                                        if (!var10.field2675) {
                                            var53 = method967(var53, var10);
                                        }
                                        var52.method3675(var53, var13, var14, var10.field2691, var10.field2692, var54, var10.field2734 ? 0 : -1, var10.field2737, var10.field2738, var10.field2736);
                                    } else if (class167.field2674) {
                                        method1085(var10);
                                    }
                                } else if (var10.field2714 == 5) {
                                    if (var10.field2675) {
                                        class77 var57;
                                        if (var10.field2794 == -1) {
                                            var57 = var10.method3105(false);
                                        } else {
                                            var57 = class50.method148(var10.field2794, var10.field2795, var10.field2690, var10.field2803, var10.field2732, false);
                                        }
                                        if (var57 != null) {
                                            int var58 = var57.field1375;
                                            int var59 = var57.field1376;
                                            if (var10.field2712) {
                                                class78.method1735(var13, var14, var10.field2691 + var13, var10.field2692 + var14);
                                                int var60 = (var10.field2691 + (var58 - 1)) / var58;
                                                int var61 = (var10.field2692 + (var59 - 1)) / var59;
                                                for (int var62 = 0; var62 < var60; var62++) {
                                                    for (int var63 = 0; var63 < var61; var63++) {
                                                        if (var10.field2711 != 0) {
                                                            var57.method1670(var58 / 2 + var58 * var62 + var13, var59 / 2 + var59 * var63 + var14, var10.field2711, 4096);
                                                        } else if (var15 == 0) {
                                                            var57.method1640(var58 * var62 + var13, var59 * var63 + var14);
                                                        } else {
                                                            var57.method1633(var58 * var62 + var13, var59 * var63 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class78.method1711(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var64 = var10.field2691 * 4096 / var58;
                                                if (var10.field2711 != 0) {
                                                    var57.method1670(var10.field2691 / 2 + var13, var10.field2692 / 2 + var14, var10.field2711, var64);
                                                } else if (var15 != 0) {
                                                    var57.method1675(var13, var14, var10.field2691, var10.field2692, 256 - (var15 & 0xFF));
                                                } else if (var10.field2691 == var58 && var10.field2692 == var59) {
                                                    var57.method1640(var13, var14);
                                                } else {
                                                    var57.method1642(var13, var14, var10.field2691, var10.field2692);
                                                }
                                            }
                                        } else if (class167.field2674) {
                                            method1085(var10);
                                        }
                                    } else {
                                        class77 var56 = var10.method3105(method689(var10));
                                        if (var56 != null) {
                                            var56.method1640(var13, var14);
                                        } else if (class167.field2674) {
                                            method1085(var10);
                                        }
                                    }
                                } else if (var10.field2714 == 6) {
                                    boolean var65 = method689(var10);
                                    int var66;
                                    if (var65) {
                                        var66 = var10.field2722;
                                    } else {
                                        var66 = var10.field2745;
                                    }
                                    class103 var67 = null;
                                    int var68 = 0;
                                    if (var10.field2794 != -1) {
                                        class50 var69 = class50.method1088(var10.field2794);
                                        if (var69 != null) {
                                            class50 var70 = var69.method1041(var10.field2795);
                                            var67 = var70.method1063(1);
                                            if (var67 == null) {
                                                method1085(var10);
                                            } else {
                                                var67.method2170();
                                                var68 = var67.field1419 / 2;
                                            }
                                        }
                                    } else if (var10.field2752 == 5) {
                                        if (var10.field2720 == 0) {
                                            var67 = field569.method3198((class41) null, -1, (class41) null, -1);
                                        } else {
                                            var67 = Statics.field143.method14();
                                        }
                                    } else if (var66 == -1) {
                                        var67 = var10.method3108((class41) null, -1, var65, Statics.field143.field39);
                                        if (var67 == null && class167.field2674) {
                                            method1085(var10);
                                        }
                                    } else {
                                        class41 var71 = class41.method1016(var66);
                                        var67 = var10.method3108(var71, var10.field2796, var65, Statics.field143.field39);
                                        if (var67 == null && class167.field2674) {
                                            method1085(var10);
                                        }
                                    }
                                    class89.method1981(var10.field2691 / 2 + var13, var10.field2692 / 2 + var14);
                                    int var72 = var10.field2728 * class89.field1542[var10.field2725] >> 16;
                                    int var73 = var10.field2728 * class89.field1543[var10.field2725] >> 16;
                                    if (var67 != null) {
                                        if (var10.field2675) {
                                            var67.method2170();
                                            if (var10.field2731) {
                                                var67.method2183(0, var10.field2726, var10.field2727, var10.field2725, var10.field2723, var10.field2724 + var68 + var72, var10.field2724 + var73, var10.field2728);
                                            } else {
                                                var67.method2227(0, var10.field2726, var10.field2727, var10.field2725, var10.field2723, var10.field2724 + var68 + var72, var10.field2724 + var73);
                                            }
                                        } else {
                                            var67.method2227(0, var10.field2726, 0, var10.field2725, 0, var72, var73);
                                        }
                                    }
                                    class89.method2035();
                                } else {
                                    if (var10.field2714 == 7) {
                                        class218 var74 = var10.method3142();
                                        if (var74 == null) {
                                            if (class167.field2674) {
                                                method1085(var10);
                                            }
                                            continue;
                                        }
                                        int var75 = 0;
                                        for (int var76 = 0; var76 < var10.field2688; var76++) {
                                            for (int var77 = 0; var77 < var10.field2780; var77++) {
                                                if (var10.field2792[var75] > 0) {
                                                    class50 var78 = class50.method1088(var10.field2792[var75] - 1);
                                                    String var79;
                                                    if (var78.field1102 != 1 && var10.field2793[var75] == 1) {
                                                        var79 = class2.method3393(16748608) + var78.field1094 + class2.field27;
                                                    } else {
                                                        var79 = class2.method3393(16748608) + var78.field1094 + class2.field27 + " " + 'x' + method1522(var10.field2793[var75]);
                                                    }
                                                    int var80 = (var10.field2740 + 115) * var77 + var13;
                                                    int var81 = (var10.field2703 + 12) * var76 + var14;
                                                    if (var10.field2737 == 0) {
                                                        var74.method3665(var79, var80, var81, var10.field2701, var10.field2734 ? 0 : -1);
                                                    } else if (var10.field2737 == 1) {
                                                        var74.method3667(var79, var10.field2691 / 2 + var80, var81, var10.field2701, var10.field2734 ? 0 : -1);
                                                    } else {
                                                        var74.method3701(var79, var10.field2691 + var80 - 1, var81, var10.field2701, var10.field2734 ? 0 : -1);
                                                    }
                                                }
                                                var75++;
                                            }
                                        }
                                    }
                                    if (var10.field2714 == 8 && Statics.field14 == var10 && field453 == field359) {
                                        int var82 = 0;
                                        int var83 = 0;
                                        class218 var84 = Statics.field2826;
                                        String var85 = var10.field2708;
                                        String var86 = method967(var85, var10);
                                        while (var86.length() > 0) {
                                            int var87 = var86.indexOf(class2.field26);
                                            String var88;
                                            if (var87 == -1) {
                                                var88 = var86;
                                                var86 = "";
                                            } else {
                                                var88 = var86.substring(0, var87);
                                                var86 = var86.substring(var87 + 4);
                                            }
                                            int var89 = var84.method3660(var88);
                                            if (var89 > var82) {
                                                var82 = var89;
                                            }
                                            var83 += var84.field3128 + 1;
                                        }
                                        var82 += 6;
                                        var83 += 7;
                                        int var90 = var10.field2691 + var13 - 5 - var82;
                                        int var91 = var10.field2692 + var14 + 5;
                                        if (var90 < var13 + 5) {
                                            var90 = var13 + 5;
                                        }
                                        if (var82 + var90 > arg4) {
                                            var90 = arg4 - var82;
                                        }
                                        if (var83 + var91 > arg5) {
                                            var91 = arg5 - var83;
                                        }
                                        class78.method1717(var90, var91, var82, var83, 16777120);
                                        class78.method1719(var90, var91, var82, var83, 0);
                                        String var92 = var10.field2708;
                                        int var93 = var84.field3128 + var91 + 2;
                                        String var94 = method967(var92, var10);
                                        while (var94.length() > 0) {
                                            int var95 = var94.indexOf(class2.field26);
                                            String var96;
                                            if (var95 == -1) {
                                                var96 = var94;
                                                var94 = "";
                                            } else {
                                                var96 = var94.substring(0, var95);
                                                var94 = var94.substring(var95 + 4);
                                            }
                                            var84.method3665(var96, var90 + 3, var93, 0, -1);
                                            var93 += var84.field3128 + 1;
                                        }
                                    }
                                    if (var10.field2714 == 9) {
                                        if (var10.field2760 == 1) {
                                            int var97;
                                            int var98;
                                            int var99;
                                            int var100;
                                            if (var10.field2705) {
                                                var97 = var13;
                                                var98 = var10.field2692 + var14;
                                                var99 = var10.field2691 + var13;
                                                var100 = var14;
                                            } else {
                                                var97 = var13;
                                                var98 = var14;
                                                var99 = var10.field2691 + var13;
                                                var100 = var10.field2692 + var14;
                                            }
                                            class78.method1725(var97, var98, var99, var100, var10.field2701);
                                        } else {
                                            int var101 = var10.field2691 >= 0 ? var10.field2691 : -var10.field2691;
                                            int var102 = var10.field2692 >= 0 ? var10.field2692 : -var10.field2692;
                                            int var103 = var101;
                                            if (var101 < var102) {
                                                var103 = var102;
                                            }
                                            if (var103 != 0) {
                                                int var104 = (var10.field2691 << 16) / var103;
                                                int var105 = (var10.field2692 << 16) / var103;
                                                if (var105 <= var104) {
                                                    var104 = -var104;
                                                } else {
                                                    var105 = -var105;
                                                }
                                                int var106 = var10.field2760 * var105 >> 17;
                                                int var107 = var10.field2760 * var105 + 1 >> 17;
                                                int var108 = var10.field2760 * var104 >> 17;
                                                int var109 = var10.field2760 * var104 + 1 >> 17;
                                                int var110 = var13 + var106;
                                                int var111 = var13 - var107;
                                                int var112 = var10.field2691 + var13 - var107;
                                                int var113 = var10.field2691 + var13 + var106;
                                                int var114 = var14 + var108;
                                                int var115 = var14 - var109;
                                                int var116 = var10.field2692 + var14 - var109;
                                                int var117 = var10.field2692 + var14 + var108;
                                                class89.method1986(var110, var111, var112);
                                                class89.method1990(var114, var115, var116, var110, var111, var112, var10.field2701);
                                                class89.method1986(var110, var112, var113);
                                                class89.method1990(var114, var116, var117, var110, var112, var113, var10.field2701);
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

    @ObfuscatedName("as.cz(Ljava/lang/String;Lfo;I)Ljava/lang/String;")
    public static String method967(String arg0, class167 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method3424(arg1, var2 - 1);
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
                if (Statics.field2087 != null) {
                    var8 = class157.method729(Statics.field2087.field2122);
                    if (Statics.field2087.field2118 != null) {
                        var8 = (String) Statics.field2087.field2118;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("bt.cc(II)Ljava/lang/String;")
    public static final String method1522(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field21 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method3393(65408) + var1.substring(0, var1.length() - 8) + class151.field2390 + " " + class2.field20 + var1 + class2.field37 + class2.field27;
        } else if (var1.length() > 6) {
            return " " + class2.method3393(16777215) + var1.substring(0, var1.length() - 4) + class151.field2392 + " " + class2.field20 + var1 + class2.field37 + class2.field27;
        } else {
            return " " + class2.method3393(16776960) + var1 + class2.field27;
        }
    }

    @ObfuscatedName("dp.ci(Lfo;I)V")
    public static void method2273(class167 arg0) {
        class167 var1 = arg0.field2782 == -1 ? null : class167.method1258(arg0.field2782);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field2066;
            var3 = Statics.field2056;
        } else {
            var2 = var1.field2691;
            var3 = var1.field2692;
        }
        method579(arg0, var2, var3, false);
        method129(arg0, var2, var3);
    }

    @ObfuscatedName("p.ce([Lfo;Lfo;ZB)V")
    public static void method568(class167[] arg0, class167 arg1, boolean arg2) {
        int var3 = arg1.field2699 == 0 ? arg1.field2691 : arg1.field2699;
        int var4 = arg1.field2700 == 0 ? arg1.field2692 : arg1.field2700;
        method2787(arg0, arg1.field2807, var3, var4, arg2);
        if (arg1.field2786 != null) {
            method2787(arg1.field2786, arg1.field2807, var3, var4, arg2);
        }
        class4 var5 = (class4) field462.method3459((long) arg1.field2807);
        if (var5 != null) {
            method3429(var5.field69, var3, var4, arg2);
        }
        if (arg1.field2680 == 1337) {
        }
    }

    @ObfuscatedName("gw.ch(IIIZI)V")
    public static final void method3429(int arg0, int arg1, int arg2, boolean arg3) {
        if (class167.method2884(arg0)) {
            method2787(Statics.field1130[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("el.cq([Lfo;IIIZI)V")
    public static void method2787(class167[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class167 var6 = arg0[var5];
            if (var6 != null && var6.field2782 == arg1) {
                method579(var6, arg2, arg3, arg4);
                method129(var6, arg2, arg3);
                if (var6.field2697 > var6.field2699 - var6.field2691) {
                    var6.field2697 = var6.field2699 - var6.field2691;
                }
                if (var6.field2697 < 0) {
                    var6.field2697 = 0;
                }
                if (var6.field2698 > var6.field2700 - var6.field2692) {
                    var6.field2698 = var6.field2700 - var6.field2692;
                }
                if (var6.field2698 < 0) {
                    var6.field2698 = 0;
                }
                if (var6.field2714 == 0) {
                    method568(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("c.cu(Lfo;IIZI)V")
    public static void method579(class167 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2691;
        int var5 = arg0.field2692;
        if (arg0.field2733 == 0) {
            arg0.field2691 = arg0.field2780;
        } else if (arg0.field2733 == 1) {
            arg0.field2691 = arg1 - arg0.field2780;
        } else if (arg0.field2733 == 2) {
            arg0.field2691 = arg0.field2780 * arg1 >> 14;
        }
        if (arg0.field2684 == 0) {
            arg0.field2692 = arg0.field2688;
        } else if (arg0.field2684 == 1) {
            arg0.field2692 = arg2 - arg0.field2688;
        } else if (arg0.field2684 == 2) {
            arg0.field2692 = arg0.field2688 * arg2 >> 14;
        }
        if (arg0.field2733 == 4) {
            arg0.field2691 = arg0.field2693 * arg0.field2692 / arg0.field2694;
        }
        if (arg0.field2684 == 4) {
            arg0.field2692 = arg0.field2694 * arg0.field2691 / arg0.field2693;
        }
        if (field339 && arg0.field2714 == 0) {
            if (arg0.field2692 < 5 && arg0.field2691 < 5) {
                arg0.field2692 = 5;
                arg0.field2691 = 5;
            } else {
                if (arg0.field2692 <= 0) {
                    arg0.field2692 = 5;
                }
                if (arg0.field2691 <= 0) {
                    arg0.field2691 = 5;
                }
            }
        }
        if (arg0.field2680 == 1337) {
            field473 = arg0;
        }
        if (arg3 && arg0.field2707 != null && (arg0.field2691 != var4 || arg0.field2692 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field4 = arg0.field2707;
            field500.method3485(var6);
        }
    }

    @ObfuscatedName("o.cv(Lfo;IIS)V")
    public static void method129(class167 arg0, int arg1, int arg2) {
        if (arg0.field2681 == 0) {
            arg0.field2689 = arg0.field2739;
        } else if (arg0.field2681 == 1) {
            arg0.field2689 = (arg1 - arg0.field2691) / 2 + arg0.field2739;
        } else if (arg0.field2681 == 2) {
            arg0.field2689 = arg1 - arg0.field2691 - arg0.field2739;
        } else if (arg0.field2681 == 3) {
            arg0.field2689 = arg0.field2739 * arg1 >> 14;
        } else if (arg0.field2681 == 4) {
            arg0.field2689 = (arg0.field2739 * arg1 >> 14) + (arg1 - arg0.field2691) / 2;
        } else {
            arg0.field2689 = arg1 - arg0.field2691 - (arg0.field2739 * arg1 >> 14);
        }
        if (arg0.field2671 == 0) {
            arg0.field2746 = arg0.field2686;
        } else if (arg0.field2671 == 1) {
            arg0.field2746 = (arg2 - arg0.field2692) / 2 + arg0.field2686;
        } else if (arg0.field2671 == 2) {
            arg0.field2746 = arg2 - arg0.field2692 - arg0.field2686;
        } else if (arg0.field2671 == 3) {
            arg0.field2746 = arg0.field2686 * arg2 >> 14;
        } else if (arg0.field2671 == 4) {
            arg0.field2746 = (arg0.field2686 * arg2 >> 14) + (arg2 - arg0.field2692) / 2;
        } else {
            arg0.field2746 = arg2 - arg0.field2692 - (arg0.field2686 * arg2 >> 14);
        }
        if (!field339 || arg0.field2714 != 0) {
            return;
        }
        if (arg0.field2689 < 0) {
            arg0.field2689 = 0;
        } else if (arg0.field2691 + arg0.field2689 > arg1) {
            arg0.field2689 = arg1 - arg0.field2691;
        }
        if (arg0.field2746 < 0) {
            arg0.field2746 = 0;
        } else if (arg0.field2746 + arg0.field2692 > arg2) {
            arg0.field2746 = arg2 - arg0.field2692;
        }
    }

    @ObfuscatedName("cf.ct(IIIIII)V")
    public static final void method2067(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field3053[0].method1769(arg0, arg1);
        Statics.field3053[1].method1769(arg0, arg1 + arg3 - 16);
        class78.method1717(arg0, arg1 + 16, 16, arg3 - 32, field583);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class78.method1717(arg0, arg1 + 16 + var6, 16, var5, field421);
        class78.method1723(arg0, arg1 + 16 + var6, var5, field380);
        class78.method1723(arg0 + 1, arg1 + 16 + var6, var5, field380);
        class78.method1727(arg0, arg1 + 16 + var6, 16, field380);
        class78.method1727(arg0, arg1 + 17 + var6, 16, field380);
        class78.method1723(arg0 + 15, arg1 + 16 + var6, var5, field424);
        class78.method1723(arg0 + 14, arg1 + 17 + var6, var5 - 1, field424);
        class78.method1727(arg0, arg1 + 15 + var6 + var5, 16, field424);
        class78.method1727(arg0 + 1, arg1 + 14 + var6 + var5, 15, field424);
    }

    @ObfuscatedName("ad.cn(Lfo;I)Z")
    public static final boolean method689(class167 arg0) {
        if (arg0.field2787 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2787.length; var1++) {
            int var2 = method3424(arg0, var1);
            int var3 = arg0.field2764[var1];
            if (arg0.field2787[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2787[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2787[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gw.cj(Lfo;IB)I")
    public static final int method3424(class167 arg0, int arg1) {
        if (arg0.field2801 == null || arg1 >= arg0.field2801.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2801[arg1];
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
                    var7 = field445[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field348[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field440[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class167 var11 = class167.method1258(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class50.method1088(var12).field1100 || field306)) {
                        for (int var13 = 0; var13 < var11.field2792.length; var13++) {
                            if (var12 + 1 == var11.field2792[var13]) {
                                var7 += var11.field2793[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class170.field2823[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class149.field2205[field348[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class170.field2823[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field143.field42;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class149.field2211[var14]) {
                            var7 += field348[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class167 var17 = class167.method1258(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class50.method1088(var18).field1100 || field306)) {
                        for (int var19 = 0; var19 < var17.field2792.length; var19++) {
                            if (var18 + 1 == var17.field2792[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field466;
                }
                if (var6 == 12) {
                    var7 = field467;
                }
                if (var6 == 13) {
                    int var20 = class170.field2823[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class170.method2874(var22);
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
                    var7 = (Statics.field143.field814 >> 7) + Statics.field1367;
                }
                if (var6 == 19) {
                    var7 = (Statics.field143.field821 >> 7) + Statics.field2578;
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

    @ObfuscatedName("fr.cf(Lfo;III)V")
    public static final void method3176(class167 arg0, int arg1, int arg2) {
        if (arg0.field2679 == 1) {
            method656(arg0.field2791, "", 24, 0, 0, arg0.field2807);
        }
        if (arg0.field2679 == 2 && !field456) {
            int var3 = method147(arg0);
            int var4 = var3 >> 11 & 0x3F;
            String var5;
            if (var4 == 0) {
                var5 = null;
            } else if (arg0.field2753 == null || arg0.field2753.trim().length() == 0) {
                var5 = null;
            } else {
                var5 = arg0.field2753;
            }
            if (var5 != null) {
                method656(var5, class2.method3393(65280) + arg0.field2763, 25, 0, -1, arg0.field2807);
            }
        }
        if (arg0.field2679 == 3) {
            method656(class151.field2480, "", 26, 0, 0, arg0.field2807);
        }
        if (arg0.field2679 == 4) {
            method656(arg0.field2791, "", 28, 0, 0, arg0.field2807);
        }
        if (arg0.field2679 == 5) {
            method656(arg0.field2791, "", 29, 0, 0, arg0.field2807);
        }
        if (arg0.field2679 == 6 && field360 == null) {
            method656(arg0.field2791, "", 30, 0, -1, arg0.field2807);
        }
        if (arg0.field2714 == 2) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field2692; var8++) {
                for (int var9 = 0; var9 < arg0.field2691; var9++) {
                    int var10 = (arg0.field2740 + 32) * var9;
                    int var11 = (arg0.field2703 + 32) * var8;
                    if (var7 < 20) {
                        var10 += arg0.field2742[var7];
                        var11 += arg0.field2743[var7];
                    }
                    if (arg1 >= var10 && arg2 >= var11 && arg1 < var10 + 32 && arg2 < var11 + 32) {
                        field393 = var7;
                        Statics.field901 = arg0;
                        if (arg0.field2792[var7] > 0) {
                            class50 var12 = class50.method1088(arg0.field2792[var7] - 1);
                            if (field454 == 1 && class172.method156(method147(arg0))) {
                                if (Statics.field1634 != arg0.field2807 || Statics.field2028 != var7) {
                                    method656(class151.field2379, field455 + " " + class2.field25 + " " + class2.method3393(16748608) + var12.field1094, 31, var12.field1085, var7, arg0.field2807);
                                }
                            } else if (!field456 || !class172.method156(method147(arg0))) {
                                String[] var13 = var12.field1111;
                                if (field472) {
                                    var13 = method2158(var13);
                                }
                                if (class172.method156(method147(arg0))) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 36;
                                            } else {
                                                var15 = 37;
                                            }
                                            method656(var13[var14], class2.method3393(16748608) + var12.field1094, var15, var12.field1085, var7, arg0.field2807);
                                        } else if (var14 == 4) {
                                            method656(class151.field2230, class2.method3393(16748608) + var12.field1094, 37, var12.field1085, var7, arg0.field2807);
                                        }
                                    }
                                }
                                if (class172.method2739(method147(arg0))) {
                                    method656(class151.field2379, class2.method3393(16748608) + var12.field1094, 38, var12.field1085, var7, arg0.field2807);
                                }
                                if (class172.method156(method147(arg0)) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
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
                                            method656(var13[var16], class2.method3393(16748608) + var12.field1094, var17, var12.field1085, var7, arg0.field2807);
                                        }
                                    }
                                }
                                String[] var18 = arg0.field2695;
                                if (field472) {
                                    var18 = method2158(var18);
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
                                            method656(var18[var19], class2.method3393(16748608) + var12.field1094, var20, var12.field1085, var7, arg0.field2807);
                                        }
                                    }
                                }
                                method656(class151.field2436, class2.method3393(16748608) + var12.field1094, 1005, var12.field1085, var7, arg0.field2807);
                            } else if ((Statics.field1341 & 0x10) == 16) {
                                method656(field301, field353 + " " + class2.field25 + " " + class2.method3393(16748608) + var12.field1094, 32, var12.field1085, var7, arg0.field2807);
                            }
                        }
                    }
                    var7++;
                }
            }
        }
        if (!arg0.field2675) {
            return;
        }
        if (!field456) {
            for (int var21 = 9; var21 >= 5; var21--) {
                int var22 = method147(arg0);
                boolean var23 = (var22 >> var21 + 1 & 0x1) != 0;
                String var24;
                if (!var23 && arg0.field2721 == null) {
                    var24 = null;
                } else if (arg0.field2748 == null || arg0.field2748.length <= var21 || arg0.field2748[var21] == null || arg0.field2748[var21].trim().length() == 0) {
                    var24 = null;
                } else {
                    var24 = arg0.field2748[var21];
                }
                if (var24 != null) {
                    method656(var24, arg0.field2747, 1007, var21 + 1, arg0.field2677, arg0.field2807);
                }
            }
            int var26 = method147(arg0);
            int var27 = var26 >> 11 & 0x3F;
            String var28;
            if (var27 == 0) {
                var28 = null;
            } else if (arg0.field2753 == null || arg0.field2753.trim().length() == 0) {
                var28 = null;
            } else {
                var28 = arg0.field2753;
            }
            if (var28 != null) {
                method656(var28, arg0.field2747, 25, 0, arg0.field2677, arg0.field2807);
            }
            for (int var30 = 4; var30 >= 0; var30--) {
                int var31 = method147(arg0);
                boolean var32 = (var31 >> var30 + 1 & 0x1) != 0;
                String var33;
                if (!var32 && arg0.field2721 == null) {
                    var33 = null;
                } else if (arg0.field2748 == null || arg0.field2748.length <= var30 || arg0.field2748[var30] == null || arg0.field2748[var30].trim().length() == 0) {
                    var33 = null;
                } else {
                    var33 = arg0.field2748[var30];
                }
                if (var33 != null) {
                    method656(var33, arg0.field2747, 57, var30 + 1, arg0.field2677, arg0.field2807);
                }
            }
            if (class172.method3150(method147(arg0))) {
                method656(class151.field2234, "", 30, 0, arg0.field2677, arg0.field2807);
            }
        } else if (class172.method633(method147(arg0)) && (Statics.field1341 & 0x20) == 32) {
            method656(field301, field353 + " " + class2.field25 + " " + arg0.field2747, 58, 0, arg0.field2677, arg0.field2807);
        }
    }

    @ObfuscatedName("cr.ck([Lfo;IIIIIIII)V")
    public static final void method2162(class167[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class167 var9 = arg0[var8];
            if (var9 != null && (!var9.field2675 || var9.field2714 == 0 || var9.field2718 || method147(var9) != 0 || field518 == var9 || var9.field2680 == 1338) && var9.field2782 == arg1 && (!var9.field2675 || !method964(var9))) {
                int var10 = var9.field2689 + arg6;
                int var11 = var9.field2746 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2714 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2714 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2691 + var10;
                    int var19 = var9.field2692 + var11;
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
                    int var22 = var9.field2691 + var10;
                    int var23 = var9.field2692 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field474 == var9) {
                    field482 = true;
                    field519 = var10;
                    field484 = var11;
                }
                if (!var9.field2675 || var12 < var14 && var13 < var15) {
                    int var24 = class135.field2045;
                    int var25 = class135.field2046 * 200873089;
                    if (class135.field2043 != 0) {
                        var24 = class135.field2052;
                        var25 = class135.field2048;
                    }
                    if (var9.field2680 == 1337) {
                        if (!field311 && !field559 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method185(var24, var25, var12, var13);
                        }
                    } else if (var9.field2680 != 1338) {
                        if (!field559 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method3176(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2714 == 0) {
                            if (!var9.field2675 && method964(var9) && Statics.field1573 != var9) {
                                continue;
                            }
                            method2162(arg0, var9.field2807, var12, var13, var14, var15, var10 - var9.field2697, var11 - var9.field2698);
                            if (var9.field2786 != null) {
                                method2162(var9.field2786, var9.field2807, var12, var13, var14, var15, var10 - var9.field2697, var11 - var9.field2698);
                            }
                            class4 var40 = (class4) field462.method3459((long) var9.field2807);
                            if (var40 != null) {
                                if (var40.field61 == 0 && class135.field2045 >= var12 && class135.field2046 * 200873089 >= var13 && class135.field2045 < var14 && class135.field2046 * 200873089 < var15 && !field559 && !field339) {
                                    for (class1 var41 = (class1) field500.method3490(); var41 != null; var41 = (class1) field500.method3492()) {
                                        if (var41.field5) {
                                            var41.method3563();
                                            var41.field3.field2799 = false;
                                        }
                                    }
                                    if (Statics.field142 == 0) {
                                        field474 = null;
                                        field518 = null;
                                    }
                                    if (!field559) {
                                        field448[0] = class151.field2388;
                                        field449[0] = "";
                                        field446[0] = 1006;
                                        field443 = 1;
                                    }
                                }
                                int var42 = var40.field69;
                                if (class167.method2884(var42)) {
                                    method2162(Statics.field1130[var42], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2675) {
                            if (var9.field2783) {
                                if (class135.field2045 >= var12 && class135.field2046 * 200873089 >= var13 && class135.field2045 < var14 && class135.field2046 * 200873089 < var15) {
                                    for (class1 var43 = (class1) field500.method3490(); var43 != null; var43 = (class1) field500.method3492()) {
                                        if (var43.field5) {
                                            var43.method3563();
                                            var43.field3.field2799 = false;
                                        }
                                    }
                                    if (Statics.field142 == 0) {
                                        field474 = null;
                                        field518 = null;
                                    }
                                    if (!field559) {
                                        field448[0] = class151.field2388;
                                        field449[0] = "";
                                        field446[0] = 1006;
                                        field443 = 1;
                                    }
                                }
                            } else if (var9.field2808 && class135.field2045 >= var12 && class135.field2046 * 200873089 >= var13 && class135.field2045 < var14 && class135.field2046 * 200873089 < var15) {
                                for (class1 var44 = (class1) field500.method3490(); var44 != null; var44 = (class1) field500.method3492()) {
                                    if (var44.field5 && var44.field3.field2775 == var44.field4) {
                                        var44.method3563();
                                    }
                                }
                            }
                            boolean var45;
                            if (class135.field2045 >= var12 && class135.field2046 * 200873089 >= var13 && class135.field2045 < var14 && class135.field2046 * 200873089 < var15) {
                                var45 = true;
                            } else {
                                var45 = false;
                            }
                            boolean var46 = false;
                            if ((class135.field2044 == 1 || !Statics.field1352 && class135.field2044 == 4) && var45) {
                                var46 = true;
                            }
                            boolean var47 = false;
                            if ((class135.field2043 == 1 || !Statics.field1352 && class135.field2043 == 4) && class135.field2052 >= var12 && class135.field2048 >= var13 && class135.field2052 < var14 && class135.field2048 < var15) {
                                var47 = true;
                            }
                            if (var47) {
                                method105(var9, class135.field2052 - var10, class135.field2048 - var11);
                            }
                            if (field474 != null && field474 != var9 && var45) {
                                int var48 = method147(var9);
                                boolean var49 = (var48 >> 20 & 0x1) != 0;
                                if (var49) {
                                    field478 = var9;
                                }
                            }
                            if (field518 == var9) {
                                field479 = true;
                                field480 = var10;
                                field481 = var11;
                            }
                            if (var9.field2718) {
                                if (var45 && field502 != 0 && var9.field2775 != null) {
                                    class1 var50 = new class1();
                                    var50.field5 = true;
                                    var50.field3 = var9;
                                    var50.field13 = field502;
                                    var50.field4 = var9.field2775;
                                    field500.method3485(var50);
                                }
                                if (field474 != null || Statics.field259 != null || field559) {
                                    var47 = false;
                                    var46 = false;
                                    var45 = false;
                                }
                                if (!var9.field2800 && var47) {
                                    var9.field2800 = true;
                                    if (var9.field2756 != null) {
                                        class1 var51 = new class1();
                                        var51.field5 = true;
                                        var51.field3 = var9;
                                        var51.field7 = class135.field2052 - var10;
                                        var51.field13 = class135.field2048 - var11;
                                        var51.field4 = var9.field2756;
                                        field500.method3485(var51);
                                    }
                                }
                                if (var9.field2800 && var46 && var9.field2757 != null) {
                                    class1 var52 = new class1();
                                    var52.field5 = true;
                                    var52.field3 = var9;
                                    var52.field7 = class135.field2045 - var10;
                                    var52.field13 = class135.field2046 * 200873089 - var11;
                                    var52.field4 = var9.field2757;
                                    field500.method3485(var52);
                                }
                                if (var9.field2800 && !var46) {
                                    var9.field2800 = false;
                                    if (var9.field2758 != null) {
                                        class1 var53 = new class1();
                                        var53.field5 = true;
                                        var53.field3 = var9;
                                        var53.field7 = class135.field2045 - var10;
                                        var53.field13 = class135.field2046 * 200873089 - var11;
                                        var53.field4 = var9.field2758;
                                        field458.method3485(var53);
                                    }
                                }
                                if (var46 && var9.field2717 != null) {
                                    class1 var54 = new class1();
                                    var54.field5 = true;
                                    var54.field3 = var9;
                                    var54.field7 = class135.field2045 - var10;
                                    var54.field13 = class135.field2046 * 200873089 - var11;
                                    var54.field4 = var9.field2717;
                                    field500.method3485(var54);
                                }
                                if (!var9.field2799 && var45) {
                                    var9.field2799 = true;
                                    if (var9.field2749 != null) {
                                        class1 var55 = new class1();
                                        var55.field5 = true;
                                        var55.field3 = var9;
                                        var55.field7 = class135.field2045 - var10;
                                        var55.field13 = class135.field2046 * 200873089 - var11;
                                        var55.field4 = var9.field2749;
                                        field500.method3485(var55);
                                    }
                                }
                                if (var9.field2799 && var45 && var9.field2761 != null) {
                                    class1 var56 = new class1();
                                    var56.field5 = true;
                                    var56.field3 = var9;
                                    var56.field7 = class135.field2045 - var10;
                                    var56.field13 = class135.field2046 * 200873089 - var11;
                                    var56.field4 = var9.field2761;
                                    field500.method3485(var56);
                                }
                                if (var9.field2799 && !var45) {
                                    var9.field2799 = false;
                                    if (var9.field2683 != null) {
                                        class1 var57 = new class1();
                                        var57.field5 = true;
                                        var57.field3 = var9;
                                        var57.field7 = class135.field2045 - var10;
                                        var57.field13 = class135.field2046 * 200873089 - var11;
                                        var57.field4 = var9.field2683;
                                        field458.method3485(var57);
                                    }
                                }
                                if (var9.field2773 != null) {
                                    class1 var58 = new class1();
                                    var58.field3 = var9;
                                    var58.field4 = var9.field2773;
                                    field501.method3485(var58);
                                }
                                if (var9.field2767 != null && field488 > var9.field2802) {
                                    if (var9.field2804 == null || field488 - var9.field2802 > 32) {
                                        class1 var63 = new class1();
                                        var63.field3 = var9;
                                        var63.field4 = var9.field2767;
                                        field500.method3485(var63);
                                    } else {
                                        label592: for (int var59 = var9.field2802; var59 < field488; var59++) {
                                            int var60 = field565[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2804.length; var61++) {
                                                if (var9.field2804[var61] == var60) {
                                                    class1 var62 = new class1();
                                                    var62.field3 = var9;
                                                    var62.field4 = var9.field2767;
                                                    field500.method3485(var62);
                                                    break label592;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2802 = field488;
                                }
                                if (var9.field2769 != null && field378 > var9.field2798) {
                                    if (var9.field2805 == null || field378 - var9.field2798 > 32) {
                                        class1 var68 = new class1();
                                        var68.field3 = var9;
                                        var68.field4 = var9.field2769;
                                        field500.method3485(var68);
                                    } else {
                                        label568: for (int var64 = var9.field2798; var64 < field378; var64++) {
                                            int var65 = field489[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var9.field2805.length; var66++) {
                                                if (var9.field2805[var66] == var65) {
                                                    class1 var67 = new class1();
                                                    var67.field3 = var9;
                                                    var67.field4 = var9.field2769;
                                                    field500.method3485(var67);
                                                    break label568;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2798 = field378;
                                }
                                if (var9.field2771 != null && field492 > var9.field2768) {
                                    if (var9.field2772 == null || field492 - var9.field2768 > 32) {
                                        class1 var73 = new class1();
                                        var73.field3 = var9;
                                        var73.field4 = var9.field2771;
                                        field500.method3485(var73);
                                    } else {
                                        label544: for (int var69 = var9.field2768; var69 < field492; var69++) {
                                            int var70 = field390[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var9.field2772.length; var71++) {
                                                if (var9.field2772[var71] == var70) {
                                                    class1 var72 = new class1();
                                                    var72.field3 = var9;
                                                    var72.field4 = var9.field2771;
                                                    field500.method3485(var72);
                                                    break label544;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2768 = field492;
                                }
                                if (field416 > var9.field2685 && var9.field2667 != null) {
                                    class1 var74 = new class1();
                                    var74.field3 = var9;
                                    var74.field4 = var9.field2667;
                                    field500.method3485(var74);
                                }
                                if (field494 > var9.field2685 && var9.field2778 != null) {
                                    class1 var75 = new class1();
                                    var75.field3 = var9;
                                    var75.field4 = var9.field2778;
                                    field500.method3485(var75);
                                }
                                if (field495 > var9.field2685 && var9.field2754 != null) {
                                    class1 var76 = new class1();
                                    var76.field3 = var9;
                                    var76.field4 = var9.field2754;
                                    field500.method3485(var76);
                                }
                                if (field496 > var9.field2685 && var9.field2784 != null) {
                                    class1 var77 = new class1();
                                    var77.field3 = var9;
                                    var77.field4 = var9.field2784;
                                    field500.method3485(var77);
                                }
                                if (field497 > var9.field2685 && var9.field2785 != null) {
                                    class1 var78 = new class1();
                                    var78.field3 = var9;
                                    var78.field4 = var9.field2785;
                                    field500.method3485(var78);
                                }
                                if (field498 > var9.field2685 && var9.field2776 != null) {
                                    class1 var79 = new class1();
                                    var79.field3 = var9;
                                    var79.field4 = var9.field2776;
                                    field500.method3485(var79);
                                }
                                var9.field2685 = field385;
                                if (var9.field2777 != null) {
                                    for (int var80 = 0; var80 < field524; var80++) {
                                        class1 var81 = new class1();
                                        var81.field3 = var9;
                                        var81.field8 = field560[var80];
                                        var81.field2 = field377[var80];
                                        var81.field4 = var9.field2777;
                                        field500.method3485(var81);
                                    }
                                }
                            }
                        }
                        if (!var9.field2675 && field474 == null && Statics.field259 == null && !field559) {
                            if ((var9.field2789 >= 0 || var9.field2765 != 0) && class135.field2045 >= var12 && class135.field2046 * 200873089 >= var13 && class135.field2045 < var14 && class135.field2046 * 200873089 < var15) {
                                if (var9.field2789 >= 0) {
                                    Statics.field1573 = arg0[var9.field2789];
                                } else {
                                    Statics.field1573 = var9;
                                }
                            }
                            if (var9.field2714 == 8 && class135.field2045 >= var12 && class135.field2046 * 200873089 >= var13 && class135.field2045 < var14 && class135.field2046 * 200873089 < var15) {
                                Statics.field14 = var9;
                            }
                            if (var9.field2700 > var9.field2692) {
                                int var82 = var9.field2691 + var10;
                                int var83 = var9.field2692;
                                int var84 = var9.field2700;
                                int var85 = class135.field2045;
                                int var86 = class135.field2046 * 200873089;
                                if (field475) {
                                    field382 = 32;
                                } else {
                                    field382 = 0;
                                }
                                field475 = false;
                                if (class135.field2044 == 1 || !Statics.field1352 && class135.field2044 == 4) {
                                    if (var85 >= var82 && var85 < var82 + 16 && var86 >= var11 && var86 < var11 + 16) {
                                        var9.field2698 -= 4;
                                        method1085(var9);
                                    } else if (var85 >= var82 && var85 < var82 + 16 && var86 >= var11 + var83 - 16 && var86 < var11 + var83) {
                                        var9.field2698 += 4;
                                        method1085(var9);
                                    } else if (var85 >= var82 - field382 && var85 < field382 + var82 + 16 && var86 >= var11 + 16 && var86 < var11 + var83 - 16) {
                                        int var87 = (var83 - 32) * var83 / var84;
                                        if (var87 < 8) {
                                            var87 = 8;
                                        }
                                        int var88 = var86 - var11 - 16 - var87 / 2;
                                        int var89 = var83 - 32 - var87;
                                        var9.field2698 = (var84 - var83) * var88 / var89;
                                        method1085(var9);
                                        field475 = true;
                                    }
                                }
                                if (field502 != 0) {
                                    int var90 = var9.field2691;
                                    if (var85 >= var82 - var90 && var86 >= var11 && var85 < var82 + 16 && var86 <= var11 + var83) {
                                        var9.field2698 += field502 * 45;
                                        method1085(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field537 == 0 || field537 == 3) && (class135.field2043 == 1 || !Statics.field1352 && class135.field2043 == 4)) {
                        class169 var26 = var9.method3125(true);
                        if (var26 != null) {
                            int var27 = class135.field2052 - var10;
                            int var28 = class135.field2048 - var11;
                            if (var26.method3152(var27, var28)) {
                                int var29 = var27 - var26.field2821 / 2;
                                int var30 = var28 - var26.field2816 / 2;
                                int var31 = field574 + field371 & 0x7FF;
                                int var32 = class89.field1542[var31];
                                int var33 = class89.field1543[var31];
                                int var34 = (field373 + 256) * var32 >> 8;
                                int var35 = (field373 + 256) * var33 >> 8;
                                int var36 = var29 * var35 + var30 * var34 >> 11;
                                int var37 = var30 * var35 - var29 * var34 >> 11;
                                int var38 = Statics.field143.field814 + var36 >> 7;
                                int var39 = Statics.field143.field821 - var37 >> 7;
                                field342.method2574(165);
                                field342.method2307(18);
                                field342.method2353(Statics.field2578 + var39);
                                field342.method2360(Statics.field1367 + var38);
                                field342.method2346(class132.field2004[82] ? (class132.field2004[81] ? 2 : 1) : 0);
                                field342.method2307(var29);
                                field342.method2307(var30);
                                field342.method2367(field574);
                                field342.method2307(57);
                                field342.method2307(field371);
                                field342.method2307(field373);
                                field342.method2307(89);
                                field342.method2367(Statics.field143.field814);
                                field342.method2367(Statics.field143.field821);
                                field342.method2307(63);
                                field513 = var38;
                                field536 = var39;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.cx(IIB)V")
    public static final void method657(int arg0, int arg1) {
        if (class167.method2884(arg0)) {
            method100(Statics.field1130[arg0], arg1);
        }
    }

    @ObfuscatedName("i.co([Lfo;IB)V")
    public static final void method100(class167[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class167 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2714 == 0) {
                    if (var3.field2786 != null) {
                        method100(var3.field2786, arg1);
                    }
                    class4 var4 = (class4) field462.method3459((long) var3.field2807);
                    if (var4 != null) {
                        method657(var4.field69, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2781 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field4 = var3.field2781;
                    class35.method26(var5);
                }
                if (arg1 == 1 && var3.field2770 != null) {
                    if (var3.field2677 >= 0) {
                        class167 var6 = class167.method1258(var3.field2807);
                        if (var6 == null || var6.field2786 == null || var3.field2677 >= var6.field2786.length || var6.field2786[var3.field2677] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field4 = var3.field2770;
                    class35.method26(var7);
                }
            }
        }
    }

    @ObfuscatedName("i.cd(Lfo;IIB)V")
    public static final void method105(class167 arg0, int arg1, int arg2) {
        if (field474 != null || field559 || arg0 == null || method224(arg0) == null) {
            return;
        }
        field474 = arg0;
        field518 = method224(arg0);
        field476 = arg1;
        field464 = arg2;
        Statics.field142 = 0;
        field552 = false;
        if (field443 > 0) {
            method1790(field443 - 1);
        }
    }

    @ObfuscatedName("ca.cg(I)V")
    public static final void method1791() {
        method1085(field474);
        Statics.field142++;
        if (field482 && field479) {
            int var0 = class135.field2045;
            int var1 = class135.field2046 * 200873089;
            int var2 = var0 - field476;
            int var3 = var1 - field464;
            if (var2 < field480) {
                var2 = field480;
            }
            if (field474.field2691 + var2 > field480 + field518.field2691) {
                var2 = field480 + field518.field2691 - field474.field2691;
            }
            if (var3 < field481) {
                var3 = field481;
            }
            if (field474.field2692 + var3 > field481 + field518.field2692) {
                var3 = field481 + field518.field2692 - field474.field2692;
            }
            int var4 = var2 - field519;
            int var5 = var3 - field484;
            int var6 = field474.field2750;
            if (Statics.field142 > field474.field2751 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field552 = true;
            }
            int var7 = field518.field2697 + (var2 - field480);
            int var8 = field518.field2698 + (var3 - field481);
            if (field474.field2779 != null && field552) {
                class1 var9 = new class1();
                var9.field3 = field474;
                var9.field7 = var7;
                var9.field13 = var8;
                var9.field4 = field474.field2779;
                class35.method26(var9);
            }
            if (class135.field2044 == 0) {
                if (field552) {
                    if (field474.field2682 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field474;
                        var10.field7 = var7;
                        var10.field13 = var8;
                        var10.field9 = field478;
                        var10.field4 = field474.field2682;
                        class35.method26(var10);
                    }
                    if (field478 != null) {
                        class167 var11 = field474;
                        int var12 = class172.method2861(method147(var11));
                        class167 var13;
                        if (var12 == 0) {
                            var13 = null;
                        } else {
                            int var14 = 0;
                            while (true) {
                                if (var14 >= var12) {
                                    var13 = var11;
                                    break;
                                }
                                var11 = class167.method1258(var11.field2782);
                                if (var11 == null) {
                                    var13 = null;
                                    break;
                                }
                                var14++;
                            }
                        }
                        if (var13 != null) {
                            field342.method2574(26);
                            field342.method2351(field478.field2677);
                            field342.method2359(field474.field2807);
                            field342.method2351(field478.field2794);
                            field342.method2353(field474.field2794);
                            field342.method2359(field478.field2807);
                            field342.method2351(field474.field2677);
                        }
                    }
                } else if ((field441 == 1 || method2641(field443 - 1)) && field443 > 2) {
                    method904(field519 + field476, field484 + field464);
                } else if (field443 > 0) {
                    method588(field519 + field476, field484 + field464);
                }
                field474 = null;
            }
        } else if (Statics.field142 > 1) {
            field474 = null;
        }
    }

    @ObfuscatedName("ca.cy(IB)V")
    public static void method1790(int arg0) {
        Statics.field1998 = new class30();
        Statics.field1998.field713 = field444[arg0];
        Statics.field1998.field704 = field381[arg0];
        Statics.field1998.field706 = field446[arg0];
        Statics.field1998.field710 = field459[arg0];
        Statics.field1998.field707 = field448[arg0];
    }

    @ObfuscatedName("x.cm(IIS)V")
    public static void method588(int arg0, int arg1) {
        class30 var2 = Statics.field1998;
        method2271(var2.field713, var2.field704, var2.field706, var2.field710, var2.field707, var2.field707, arg0, arg1);
        Statics.field1998 = null;
    }

    @ObfuscatedName("aq.cr(Lfo;B)V")
    public static void method1085(class167 arg0) {
        if (field535 == arg0.field2806) {
            field379[arg0.field2762] = true;
        }
    }

    @ObfuscatedName("fo.cw(I)V")
    public static void method3131() {
        for (class4 var0 = (class4) field462.method3462(); var0 != null; var0 = (class4) field462.method3468()) {
            int var1 = var0.field69;
            if (class167.method2884(var1)) {
                boolean var2 = true;
                class167[] var3 = Statics.field1130[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2675;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3043;
                    class167 var6 = class167.method1258(var5);
                    if (var6 != null) {
                        method1085(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("n.cp(Lfo;B)Lfo;")
    public static class167 method224(class167 arg0) {
        class167 var1 = arg0;
        int var2 = class172.method2861(method147(arg0));
        class167 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = class167.method1258(var1.field2782);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class167 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2774;
        }
        return var5;
    }

    @ObfuscatedName("cg.dd([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method2158(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("g.dv(IB)V")
    public static final void method175(int arg0) {
        if (!class167.method2884(arg0)) {
            return;
        }
        class167[] var1 = Statics.field1130[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class167 var3 = var1[var2];
            if (var3 != null) {
                var3.field2796 = 0;
                var3.field2797 = 0;
            }
        }
    }

    @ObfuscatedName("r.ds(II)V")
    public static final void method170(int arg0) {
        if (class167.method2884(arg0)) {
            method2268(Statics.field1130[arg0], -1);
        }
    }

    @ObfuscatedName("da.dn([Lfo;IB)V")
    public static final void method2268(class167[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class167 var3 = arg0[var2];
            if (var3 != null && var3.field2782 == arg1 && (!var3.field2675 || !method964(var3))) {
                if (var3.field2714 == 0) {
                    if (!var3.field2675 && method964(var3) && Statics.field1573 != var3) {
                        continue;
                    }
                    method2268(arg0, var3.field2807);
                    if (var3.field2786 != null) {
                        method2268(var3.field2786, var3.field2807);
                    }
                    class4 var4 = (class4) field462.method3459((long) var3.field2807);
                    if (var4 != null) {
                        method170(var4.field69);
                    }
                }
                if (var3.field2714 == 6) {
                    if (var3.field2745 != -1 || var3.field2722 != -1) {
                        boolean var5 = method689(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2722;
                        } else {
                            var6 = var3.field2745;
                        }
                        if (var6 != -1) {
                            class41 var7 = class41.method1016(var6);
                            var3.field2797 += field430;
                            while (var3.field2797 > var7.field963[var3.field2796]) {
                                var3.field2797 -= var7.field963[var3.field2796];
                                var3.field2796++;
                                if (var3.field2796 >= var7.field970.length) {
                                    var3.field2796 -= var7.field972;
                                    if (var3.field2796 < 0 || var3.field2796 >= var7.field970.length) {
                                        var3.field2796 = 0;
                                    }
                                }
                                method1085(var3);
                            }
                        }
                    }
                    if (var3.field2730 != 0 && !var3.field2675) {
                        int var8 = var3.field2730 >> 16;
                        int var9 = var3.field2730 << 16 >> 16;
                        int var10 = field430 * var8;
                        int var11 = field430 * var9;
                        var3.field2725 = var3.field2725 + var10 & 0x7FF;
                        var3.field2726 = var3.field2726 + var11 & 0x7FF;
                        method1085(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("t.da(II)V")
    public static final void method174(int arg0) {
        method3131();
        for (class23 var1 = (class23) class23.field622.method3490(); var1 != null; var1 = (class23) class23.field622.method3492()) {
            if (var1.field623 != null) {
                var1.method581();
            }
        }
        int var2 = class51.method810(arg0).field1134;
        if (var2 == 0) {
            return;
        }
        int var3 = class170.field2823[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class89.method2030(0.9D);
                ((class93) Statics.field1519).method2054(0.9D);
            }
            if (var3 == 2) {
                class89.method2030(0.8D);
                ((class93) Statics.field1519).method2054(0.8D);
            }
            if (var3 == 3) {
                class89.method2030(0.7D);
                ((class93) Statics.field1519).method2054(0.7D);
            }
            if (var3 == 4) {
                class89.method2030(0.6D);
                ((class93) Statics.field1519).method2054(0.6D);
            }
            class50.field1084.method3435();
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
            if (field538 != var4) {
                if (field538 == 0 && field539 != -1) {
                    class177.method708(Statics.field677, field539, 0, var4, false);
                    field540 = false;
                } else if (var4 == 0) {
                    class177.method2070();
                    field540 = false;
                } else {
                    class177.method2678(var4);
                }
                field538 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field558 = 127;
            }
            if (var3 == 1) {
                field558 = 96;
            }
            if (var3 == 2) {
                field558 = 64;
            }
            if (var3 == 3) {
                field558 = 32;
            }
            if (var3 == 4) {
                field558 = 0;
            }
        }
        if (var2 == 5) {
            field441 = var3;
        }
        if (var2 == 6) {
            field450 = var3;
        }
        if (var2 == 9) {
            field354 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field525 = 127;
            }
            if (var3 == 1) {
                field525 = 96;
            }
            if (var3 == 2) {
                field525 = 64;
            }
            if (var3 == 3) {
                field525 = 32;
            }
            if (var3 == 4) {
                field525 = 0;
            }
        }
        if (var2 == 17) {
            field469 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field329 = (class20) class104.method631(class20.method183(), var3);
            if (field329 == null) {
                field329 = class20.field584;
            }
        }
        if (var2 != 19) {
            return;
        }
        if (var3 == -1) {
            field433 = -1;
        } else {
            field433 = var3 & 0x7FF;
        }
    }

    @ObfuscatedName("w.dh(IIIB)Ll;")
    public static final class4 method39(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field69 = arg1;
        var3.field61 = arg2;
        field462.method3463(var3, (long) arg0);
        method175(arg1);
        class167 var4 = class167.method1258(arg0);
        method1085(var4);
        if (field360 != null) {
            method1085(field360);
            field360 = null;
        }
        method2270();
        method568(Statics.field1130[arg0 >> 16], var4, false);
        class35.method654(arg1);
        if (field461 != -1) {
            method657(field461, 1);
        }
        return var3;
    }

    @ObfuscatedName("bc.db(Lfo;S)Z")
    public static final boolean method1590(class167 arg0) {
        int var1 = arg0.field2680;
        if (var1 == 205) {
            field352 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field569.method3193(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field569.method3194(var4, var5 == 1);
        }
        if (var1 == 324) {
            field569.method3191(false);
        }
        if (var1 == 325) {
            field569.method3191(true);
        }
        if (var1 == 326) {
            field342.method2574(149);
            field569.method3196(field342);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ad.dy(Lfo;IIII)V")
    public static final void method690(class167 arg0, int arg1, int arg2, int arg3) {
        method1017();
        class169 var4 = arg0.method3125(false);
        if (var4 == null) {
            return;
        }
        class78.method1711(arg1, arg2, var4.field2821 + arg1, var4.field2816 + arg2);
        if (field537 == 2 || field537 == 5) {
            class78.method1726(arg1, arg2, 0, var4.field2818, var4.field2817);
        } else {
            int var5 = field574 + field371 & 0x7FF;
            int var6 = Statics.field143.field814 / 32 + 48;
            int var7 = 464 - Statics.field143.field821 / 32;
            Statics.field51.method1650(arg1, arg2, var4.field2821, var4.field2816, var6, var7, var5, field373 + 256, var4.field2818, var4.field2817);
            for (int var8 = 0; var8 < field383; var8++) {
                int var9 = field532[var8] * 4 + 2 - Statics.field143.field814 / 32;
                int var10 = field533[var8] * 4 + 2 - Statics.field143.field821 / 32;
                method760(arg1, arg2, var9, var10, field563[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class193 var13 = field391[Statics.field3101][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field143.field814 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field143.field821 / 32;
                        method760(arg1, arg2, var14, var15, Statics.field270[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field340; var16++) {
                class33 var17 = field573[field341[var16]];
                if (var17 != null && var17.method17()) {
                    class38 var18 = var17.field764;
                    if (var18 != null && var18.field891 != null) {
                        var18 = var18.method742();
                    }
                    if (var18 != null && var18.field880 && var18.field895) {
                        int var19 = var17.field814 / 32 - Statics.field143.field814 / 32;
                        int var20 = var17.field821 / 32 - Statics.field143.field821 / 32;
                        method760(arg1, arg2, var19, var20, Statics.field270[1], var4);
                    }
                }
            }
            for (int var21 = 0; var21 < field409; var21++) {
                class3 var22 = field419[field447[var21]];
                if (var22 != null && var22.method17() && !var22.field57) {
                    int var23 = var22.field814 / 32 - Statics.field143.field814 / 32;
                    int var24 = var22.field821 / 32 - Statics.field143.field821 / 32;
                    boolean var25 = false;
                    if (method811(var22.field53, true)) {
                        var25 = true;
                    }
                    boolean var26 = false;
                    for (int var27 = 0; var27 < Statics.field2918; var27++) {
                        if (var22.field53.equals(Statics.field1912[var27].field632)) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (Statics.field143.field56 != 0 && var22.field56 != 0 && Statics.field143.field56 == var22.field56) {
                        var28 = true;
                    }
                    if (var25) {
                        method760(arg1, arg2, var23, var24, Statics.field270[3], var4);
                    } else if (var28) {
                        method760(arg1, arg2, var23, var24, Statics.field270[4], var4);
                    } else if (var26) {
                        method760(arg1, arg2, var23, var24, Statics.field270[5], var4);
                    } else {
                        method760(arg1, arg2, var23, var24, Statics.field270[2], var4);
                    }
                }
            }
            if (field490 != 0 && field477 % 20 < 10) {
                if (field490 == 1 && field321 >= 0 && field321 < field573.length) {
                    class33 var29 = field573[field321];
                    if (var29 != null) {
                        int var30 = var29.field814 / 32 - Statics.field143.field814 / 32;
                        int var31 = var29.field821 / 32 - Statics.field143.field821 / 32;
                        Statics.method979(arg1, arg2, var30, var31, Statics.field1353[1], var4);
                    }
                }
                if (field490 == 2) {
                    int var32 = field505 * 4 - Statics.field1367 * 4 + 2 - Statics.field143.field814 / 32;
                    int var33 = field463 * 4 - Statics.field2578 * 4 + 2 - Statics.field143.field821 / 32;
                    Statics.method979(arg1, arg2, var32, var33, Statics.field1353[1], var4);
                }
                if (field490 == 10 && field322 >= 0 && field322 < field419.length) {
                    class3 var34 = field419[field322];
                    if (var34 != null) {
                        int var35 = var34.field814 / 32 - Statics.field143.field814 / 32;
                        int var36 = var34.field821 / 32 - Statics.field143.field821 / 32;
                        Statics.method979(arg1, arg2, var35, var36, Statics.field1353[1], var4);
                    }
                }
            }
            if (field513 != 0) {
                int var37 = field513 * 4 + 2 - Statics.field143.field814 / 32;
                int var38 = field536 * 4 + 2 - Statics.field143.field821 / 32;
                method760(arg1, arg2, var37, var38, Statics.field1353[0], var4);
            }
            if (!Statics.field143.field57) {
                class78.method1717(var4.field2821 / 2 + arg1 - 1, var4.field2816 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field507[arg3] = true;
    }

    @ObfuscatedName("m.de(Lfo;IIII)V")
    public static final void method151(class167 arg0, int arg1, int arg2, int arg3) {
        class169 var4 = arg0.method3125(false);
        if (var4 == null) {
            return;
        }
        if (field537 < 3) {
            Statics.field172.method1650(arg1, arg2, var4.field2821, var4.field2816, 25, 25, field574, 256, var4.field2818, var4.field2817);
        } else {
            class78.method1726(arg1, arg2, 0, var4.field2818, var4.field2817);
        }
    }

    @ObfuscatedName("ab.dm(IIIILbh;Lfv;I)V")
    public static final void method760(int arg0, int arg1, int arg2, int arg3, class77 arg4, class169 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field574 + field371 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class89.field1542[var6];
        int var9 = class89.field1543[var6];
        int var10 = var8 * 256 / (field373 + 256);
        int var11 = var9 * 256 / (field373 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1669(arg5.field2821 / 2 + var12 - arg4.field1375 / 2, arg5.field2816 / 2 - var13 - arg4.field1376 / 2, arg0, arg1, arg5.field2821, arg5.field2816, arg5.field2818, arg5.field2817);
        } else {
            arg4.method1640(arg5.field2821 / 2 + arg0 + var12 - arg4.field1375 / 2, arg5.field2816 / 2 + arg1 - var13 - arg4.field1376 / 2);
        }
    }

    @ObfuscatedName("ai.do(Ljava/lang/String;ZI)Z")
    public static boolean method811(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class158.method560(arg0, Statics.field87);
        for (int var3 = 0; var3 < field374; var3++) {
            if (var2.equalsIgnoreCase(class158.method560(field417[var3].field260, Statics.field87)) && (!arg1 || field417[var3].field254 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class158.method560(Statics.field143.field53, Statics.field87))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ad.du(Ljava/lang/String;I)Z")
    public static boolean method688(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class158.method560(arg0, Statics.field87);
        for (int var2 = 0; var2 < field571; var2++) {
            class8 var3 = field304[var2];
            if (var1.equalsIgnoreCase(class158.method560(var3.field137, Statics.field87))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class158.method560(var3.field138, Statics.field87))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("s.dl(Ljava/lang/String;I)V")
    public static final void method181(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field374 < 200 || field426 == 1) || field374 >= 400) {
            class11.method1792(30, "", class151.field2465);
            return;
        }
        String var1 = class158.method560(arg0, Statics.field87);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field374; var2++) {
            class17 var3 = field417[var2];
            String var4 = class158.method560(var3.field260, Statics.field87);
            if (var4 != null && var4.equals(var1)) {
                class11.method1792(30, "", arg0 + class151.field2396);
                return;
            }
            if (var3.field253 != null) {
                String var5 = class158.method560(var3.field253, Statics.field87);
                if (var5 != null && var5.equals(var1)) {
                    class11.method1792(30, "", arg0 + class151.field2396);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field571; var6++) {
            class8 var7 = field304[var6];
            String var8 = class158.method560(var7.field137, Statics.field87);
            if (var8 != null && var8.equals(var1)) {
                class11.method1792(30, "", class151.field2292 + arg0 + class151.field2334);
                return;
            }
            if (var7.field138 != null) {
                String var9 = class158.method560(var7.field138, Statics.field87);
                if (var9 != null && var9.equals(var1)) {
                    class11.method1792(30, "", class151.field2292 + arg0 + class151.field2334);
                    return;
                }
            }
        }
        if (class158.method560(Statics.field143.field53, Statics.field87).equals(var1)) {
            class11.method1792(30, "", class151.field2259);
        } else {
            field342.method2574(70);
            field342.method2307(class114.method2250(arg0));
            field342.method2313(arg0);
        }
    }

    @ObfuscatedName("i.df(Ljava/lang/String;ZI)V")
    public static final void method101(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field571 < 100 || field426 == 1) || field571 >= 400) {
            class11.method1792(31, "", class151.field2402);
            return;
        }
        String var2 = class158.method560(arg0, Statics.field87);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field571; var3++) {
            class8 var4 = field304[var3];
            String var5 = class158.method560(var4.field137, Statics.field87);
            if (var5 != null && var5.equals(var2)) {
                class11.method1792(31, "", arg0 + class151.field2398);
                return;
            }
            if (var4.field138 != null) {
                String var6 = class158.method560(var4.field138, Statics.field87);
                if (var6 != null && var6.equals(var2)) {
                    class11.method1792(31, "", arg0 + class151.field2398);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field374; var7++) {
            class17 var8 = field417[var7];
            String var9 = class158.method560(var8.field260, Statics.field87);
            if (var9 != null && var9.equals(var2)) {
                class11.method1792(31, "", class151.field2297 + arg0 + class151.field2404);
                return;
            }
            if (var8.field253 != null) {
                String var10 = class158.method560(var8.field253, Statics.field87);
                if (var10 != null && var10.equals(var2)) {
                    class11.method1792(31, "", class151.field2297 + arg0 + class151.field2404);
                    return;
                }
            }
        }
        if (class158.method560(Statics.field143.field53, Statics.field87).equals(var2)) {
            class11.method1792(31, "", class151.field2400);
        } else {
            field342.method2574(67);
            field342.method2307(class114.method2250(arg0));
            field342.method2313(arg0);
        }
    }

    @ObfuscatedName("b.dz(Ljava/lang/String;B)V")
    public static final void method629(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class158.method560(arg0, Statics.field87);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field571; var2++) {
            class8 var3 = field304[var2];
            String var4 = var3.field137;
            String var5 = class158.method560(var4, Statics.field87);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field571--;
                for (int var7 = var2; var7 < field571; var7++) {
                    field304[var7] = field304[var7 + 1];
                }
                field494 = field385;
                field342.method2574(27);
                field342.method2307(class114.method2250(arg0));
                field342.method2313(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("bt.di(Ljava/lang/String;IB)V")
    public static final void method1524(String arg0, int arg1) {
        field342.method2574(21);
        field342.method2307(class114.method2250(arg0) + 1);
        field342.method2307(arg1);
        field342.method2313(arg0);
    }

    @ObfuscatedName("w.dq(Ljava/lang/String;B)V")
    public static final void method38(String arg0) {
        if (Statics.field1912 != null) {
            field342.method2574(22);
            field342.method2307(class114.method2250(arg0));
            field342.method2313(arg0);
        }
    }

    @ObfuscatedName("fb.dr(Ljava/lang/String;B)V")
    public static final void method2965(String arg0) {
        if (!arg0.equals("")) {
            field342.method2574(36);
            field342.method2307(class114.method2250(arg0));
            field342.method2313(arg0);
        }
    }

    @ObfuscatedName("m.dc(Lfo;B)I")
    public static int method147(class167 arg0) {
        class195 var1 = (class195) field503.method3459(((long) arg0.field2807 << 32) + (long) arg0.field2677);
        return var1 == null ? arg0.field2713 : var1.field3030;
    }

    @ObfuscatedName("az.dt(Lfo;I)Z")
    public static boolean method964(class167 arg0) {
        if (field339) {
            if (method147(arg0) != 0) {
                return false;
            }
            if (arg0.field2714 == 0) {
                return false;
            }
        }
        return arg0.field2696;
    }

    @ObfuscatedName("at.dx(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method643(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field398 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field398 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field398 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field398 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field398 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field309 != null) {
            var3 = "/p=" + Statics.field309;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field376 + "/a=" + Statics.field1930 + var3 + "/";
    }
}

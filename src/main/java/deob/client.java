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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Date;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class114 {

    @ObfuscatedName("client.q")
    public static boolean field376 = true;

    @ObfuscatedName("client.d")
    public static int field280 = 1;

    @ObfuscatedName("client.k")
    public static int field281 = 0;

    @ObfuscatedName("client.s")
    public static int field425 = 0;

    @ObfuscatedName("client.c")
    public static boolean field283 = false;

    @ObfuscatedName("client.m")
    public static boolean field284 = false;

    @ObfuscatedName("client.h")
    public static int field354 = 0;

    @ObfuscatedName("client.n")
    public static int field287 = 0;

    @ObfuscatedName("client.w")
    public static class118[] field339 = new class118[4];

    @ObfuscatedName("client.v")
    public static boolean field386 = true;

    @ObfuscatedName("client.f")
    public static int field289 = 0;

    @ObfuscatedName("client.l")
    public static long field290 = -1L;

    @ObfuscatedName("client.b")
    public static int field291 = -1;

    @ObfuscatedName("client.e")
    public static int field292 = -1;

    @ObfuscatedName("client.ai")
    public static int field293 = -1;

    @ObfuscatedName("client.am")
    public static boolean field294 = true;

    @ObfuscatedName("client.ad")
    public static boolean field478 = false;

    @ObfuscatedName("client.ah")
    public static int field296 = 0;

    @ObfuscatedName("client.aj")
    public static int field408 = 0;

    @ObfuscatedName("client.ax")
    public static int field500 = 0;

    @ObfuscatedName("client.ak")
    public static int field322 = 0;

    @ObfuscatedName("client.ar")
    public static int field440 = 0;

    @ObfuscatedName("client.aw")
    public static int field550 = 0;

    @ObfuscatedName("client.ay")
    public static int field302 = 0;

    @ObfuscatedName("client.af")
    public static int field357 = 0;

    @ObfuscatedName("client.av")
    public static int field297 = 0;

    @ObfuscatedName("client.ao")
    public static class41 field308 = class41.field809;

    @ObfuscatedName("client.ab")
    public static class41 field306 = class41.field809;

    @ObfuscatedName("client.ac")
    public static int field307 = 0;

    @ObfuscatedName("client.ap")
    public static int field445 = 0;

    @ObfuscatedName("client.au")
    public static int field309 = 0;

    @ObfuscatedName("client.bi")
    public static int field311 = 0;

    @ObfuscatedName("client.bc")
    public static int field312 = 0;

    @ObfuscatedName("client.bs")
    public static int field304 = 0;

    @ObfuscatedName("client.bw")
    public static int field314 = 0;

    @ObfuscatedName("client.bv")
    public static int field315 = 0;

    @ObfuscatedName("client.cf")
    public static class36[] field285 = new class36[32768];

    @ObfuscatedName("client.co")
    public static int field317 = 0;

    @ObfuscatedName("client.cq")
    public static int[] field420 = new int[32768];

    @ObfuscatedName("client.cw")
    public static int field555 = 0;

    @ObfuscatedName("client.ci")
    public static int[] field320 = new int[250];

    @ObfuscatedName("client.cb")
    public static class160 field395 = new class160(5000);

    @ObfuscatedName("client.cg")
    public static class160 field323 = new class160(5000);

    @ObfuscatedName("client.ch")
    public static class160 field324 = new class160(15000);

    @ObfuscatedName("client.cy")
    public static int field542 = 0;

    @ObfuscatedName("client.cs")
    public static int field326 = 0;

    @ObfuscatedName("client.cv")
    public static int field327 = 0;

    @ObfuscatedName("client.cj")
    public static int field349 = 0;

    @ObfuscatedName("client.ce")
    public static int field329 = 0;

    @ObfuscatedName("client.cp")
    public static int field401 = 0;

    @ObfuscatedName("client.cz")
    public static int field331 = 0;

    @ObfuscatedName("client.ck")
    public static int field332 = 0;

    @ObfuscatedName("client.ca")
    public static boolean field333 = false;

    @ObfuscatedName("client.de")
    public static int field334 = 0;

    @ObfuscatedName("client.dw")
    public static int field335 = 1;

    @ObfuscatedName("client.dm")
    public static int field336 = 0;

    @ObfuscatedName("client.dq")
    public static int field499 = 1;

    @ObfuscatedName("client.dl")
    public static int field350 = 0;

    @ObfuscatedName("client.dh")
    public static boolean field340 = false;

    @ObfuscatedName("client.dj")
    public static int[][][] field341 = new int[4][13][13];

    @ObfuscatedName("client.do")
    public static final int[] field342 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dn")
    public static int field363 = 0;

    @ObfuscatedName("client.dx")
    public static int field300 = 2;

    @ObfuscatedName("client.db")
    public static int field345 = 0;

    @ObfuscatedName("client.da")
    public static int field418 = 2;

    @ObfuscatedName("client.dp")
    public static int field347 = 0;

    @ObfuscatedName("client.ew")
    public static int field348 = 1;

    @ObfuscatedName("client.eh")
    public static int field464 = 0;

    @ObfuscatedName("client.ei")
    public static int field295 = 0;

    @ObfuscatedName("client.eu")
    public static int field351 = 2;

    @ObfuscatedName("client.ee")
    public static int field352 = 0;

    @ObfuscatedName("client.eg")
    public static int field353 = 1;

    @ObfuscatedName("client.ej")
    public static int field282 = 0;

    @ObfuscatedName("client.eq")
    public static int field355 = 0;

    @ObfuscatedName("client.eb")
    public static int field538 = 2301979;

    @ObfuscatedName("client.ea")
    public static int field358 = 5063219;

    @ObfuscatedName("client.ex")
    public static int field359 = 3353893;

    @ObfuscatedName("client.ev")
    public static int field360 = 7759444;

    @ObfuscatedName("client.ez")
    public static boolean field361 = false;

    @ObfuscatedName("client.ep")
    public static int field488 = 0;

    @ObfuscatedName("client.fk")
    public static int field384 = 128;

    @ObfuscatedName("client.fs")
    public static int field364 = 0;

    @ObfuscatedName("client.fv")
    public static int field365 = 0;

    @ObfuscatedName("client.fb")
    public static int field366 = 0;

    @ObfuscatedName("client.fo")
    public static int field367 = 0;

    @ObfuscatedName("client.fp")
    public static int field368 = 0;

    @ObfuscatedName("client.fd")
    public static int field299 = 50;

    @ObfuscatedName("client.fe")
    public static int field370 = 0;

    @ObfuscatedName("client.ft")
    public static boolean field436 = false;

    @ObfuscatedName("client.fn")
    public static int field520 = 0;

    @ObfuscatedName("client.fy")
    public static int field373 = 0;

    @ObfuscatedName("client.fz")
    public static int field374 = 50;

    @ObfuscatedName("client.fj")
    public static int[] field492 = new int[field374];

    @ObfuscatedName("client.fi")
    public static int[] field402 = new int[field374];

    @ObfuscatedName("client.fu")
    public static int[] field377 = new int[field374];

    @ObfuscatedName("client.fl")
    public static int[] field378 = new int[field374];

    @ObfuscatedName("client.fm")
    public static int[] field279 = new int[field374];

    @ObfuscatedName("client.fr")
    public static int[] field380 = new int[field374];

    @ObfuscatedName("client.fx")
    public static int[] field381 = new int[field374];

    @ObfuscatedName("client.gp")
    public static String[] field382 = new String[field374];

    @ObfuscatedName("client.gx")
    public static int[][] field288 = new int[104][104];

    @ObfuscatedName("client.gm")
    public static int field525 = 0;

    @ObfuscatedName("client.ga")
    public static int field399 = -1;

    @ObfuscatedName("client.gi")
    public static int field318 = -1;

    @ObfuscatedName("client.gh")
    public static int field421 = 0;

    @ObfuscatedName("client.ge")
    public static int field465 = 0;

    @ObfuscatedName("client.gj")
    public static int field389 = 0;

    @ObfuscatedName("client.gw")
    public static int field372 = 0;

    @ObfuscatedName("client.gl")
    public static int field391 = 0;

    @ObfuscatedName("client.gb")
    public static int field392 = 0;

    @ObfuscatedName("client.gy")
    public static int field393 = 0;

    @ObfuscatedName("client.gk")
    public static int field394 = 0;

    @ObfuscatedName("client.gd")
    public static int field527 = 0;

    @ObfuscatedName("client.gs")
    public static int field396 = 0;

    @ObfuscatedName("client.gf")
    public static boolean field397 = false;

    @ObfuscatedName("client.gu")
    public static int field321 = 0;

    @ObfuscatedName("client.gg")
    public static int field398 = 0;

    @ObfuscatedName("client.gt")
    public static class24[] field400 = new class24[2048];

    @ObfuscatedName("client.gv")
    public static int field409 = -1;

    @ObfuscatedName("client.gr")
    public static int field305 = 0;

    @ObfuscatedName("client.hc")
    public static int field403 = 0;

    @ObfuscatedName("client.hk")
    public static int[] field404 = new int[1000];

    @ObfuscatedName("client.hh")
    public static final int[] field405 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.he")
    public static String[] field406 = new String[8];

    @ObfuscatedName("client.ht")
    public static boolean[] field325 = new boolean[8];

    @ObfuscatedName("client.hn")
    public static int[] field419 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hd")
    public static int field337 = -1;

    @ObfuscatedName("client.hf")
    public static class129[][][] field410 = new class129[4][104][104];

    @ObfuscatedName("client.hp")
    public static class129 field411 = new class129();

    @ObfuscatedName("client.hw")
    public static class129 field412 = new class129();

    @ObfuscatedName("client.hq")
    public static class129 field413 = new class129();

    @ObfuscatedName("client.hb")
    public static int[] field456 = new int[25];

    @ObfuscatedName("client.hl")
    public static int[] field415 = new int[25];

    @ObfuscatedName("client.ho")
    public static int[] field388 = new int[25];

    @ObfuscatedName("client.hs")
    public static int field385 = 0;

    @ObfuscatedName("client.hu")
    public static boolean field416 = false;

    @ObfuscatedName("client.hm")
    public static int field460 = 0;

    @ObfuscatedName("client.hr")
    public static int[] field510 = new int[500];

    @ObfuscatedName("client.hi")
    public static int[] field547 = new int[500];

    @ObfuscatedName("client.ir")
    public static int[] field422 = new int[500];

    @ObfuscatedName("client.iu")
    public static int[] field423 = new int[500];

    @ObfuscatedName("client.is")
    public static String[] field424 = new String[500];

    @ObfuscatedName("client.ia")
    public static String[] field454 = new String[500];

    @ObfuscatedName("client.ih")
    public static int field426 = -1;

    @ObfuscatedName("client.iq")
    public static int field427 = -1;

    @ObfuscatedName("client.ig")
    public static int field428 = 0;

    @ObfuscatedName("client.ik")
    public static int field508 = 50;

    @ObfuscatedName("client.iy")
    public static int field430 = 0;

    @ObfuscatedName("client.it")
    public static String field432 = null;

    @ObfuscatedName("client.il")
    public static boolean field433 = false;

    @ObfuscatedName("client.io")
    public static int field434 = -1;

    @ObfuscatedName("client.if")
    public static int field435 = -1;

    @ObfuscatedName("client.id")
    public static String field407 = null;

    @ObfuscatedName("client.ic")
    public static String field437 = null;

    @ObfuscatedName("client.iw")
    public static int field438 = -1;

    @ObfuscatedName("client.iz")
    public static class126 field439 = new class126(8);

    @ObfuscatedName("client.iv")
    public static int field414 = 0;

    @ObfuscatedName("client.jk")
    public static int field441 = 0;

    @ObfuscatedName("client.jh")
    public static class170 field442 = null;

    @ObfuscatedName("client.ju")
    public static int field443 = 0;

    @ObfuscatedName("client.jc")
    public static int field319 = 0;

    @ObfuscatedName("client.jq")
    public static int field328 = 0;

    @ObfuscatedName("client.jn")
    public static int field446 = -1;

    @ObfuscatedName("client.jd")
    public static boolean field447 = false;

    @ObfuscatedName("client.jm")
    public static boolean field506 = false;

    @ObfuscatedName("client.js")
    public static boolean field503 = false;

    @ObfuscatedName("client.je")
    public static class170 field450 = null;

    @ObfuscatedName("client.jp")
    public static class170 field369 = null;

    @ObfuscatedName("client.jz")
    public static class170 field431 = null;

    @ObfuscatedName("client.jx")
    public static int field453 = 0;

    @ObfuscatedName("client.ja")
    public static int field552 = 0;

    @ObfuscatedName("client.jl")
    public static class170 field455 = null;

    @ObfuscatedName("client.jr")
    public static boolean field338 = false;

    @ObfuscatedName("client.jy")
    public static int field457 = -1;

    @ObfuscatedName("client.jg")
    public static int field458 = -1;

    @ObfuscatedName("client.jf")
    public static boolean field449 = false;

    @ObfuscatedName("client.jj")
    public static int field498 = -1;

    @ObfuscatedName("client.jt")
    public static int field461 = -1;

    @ObfuscatedName("client.jo")
    public static boolean field462 = false;

    @ObfuscatedName("client.ke")
    public static int field463 = 1;

    @ObfuscatedName("client.ki")
    public static int[] field429 = new int[32];

    @ObfuscatedName("client.kk")
    public static int field459 = 0;

    @ObfuscatedName("client.ku")
    public static int[] field466 = new int[32];

    @ObfuscatedName("client.kq")
    public static int field467 = 0;

    @ObfuscatedName("client.kw")
    public static int[] field468 = new int[32];

    @ObfuscatedName("client.kg")
    public static int field469 = 0;

    @ObfuscatedName("client.km")
    public static int field470 = 0;

    @ObfuscatedName("client.kf")
    public static int field417 = 0;

    @ObfuscatedName("client.ky")
    public static int field472 = 0;

    @ObfuscatedName("client.kr")
    public static int field471 = 0;

    @ObfuscatedName("client.kv")
    public static int field474 = 0;

    @ObfuscatedName("client.ko")
    public static int field475 = 0;

    @ObfuscatedName("client.kd")
    public static int field476 = 0;

    @ObfuscatedName("client.kj")
    public static class129 field477 = new class129();

    @ObfuscatedName("client.ks")
    public static class129 field379 = new class129();

    @ObfuscatedName("client.kh")
    public static class129 field479 = new class129();

    @ObfuscatedName("client.kx")
    public static class126 field480 = new class126(512);

    @ObfuscatedName("client.ka")
    public static int field481 = 0;

    @ObfuscatedName("client.kt")
    public static int field482 = -2;

    @ObfuscatedName("client.kb")
    public static boolean[] field483 = new boolean[100];

    @ObfuscatedName("client.lp")
    public static boolean[] field484 = new boolean[100];

    @ObfuscatedName("client.li")
    public static boolean[] field485 = new boolean[100];

    @ObfuscatedName("client.lb")
    public static int[] field486 = new int[100];

    @ObfuscatedName("client.lc")
    public static int[] field544 = new int[100];

    @ObfuscatedName("client.lg")
    public static int[] field487 = new int[100];

    @ObfuscatedName("client.ld")
    public static int[] field489 = new int[100];

    @ObfuscatedName("client.ll")
    public static int field490 = 0;

    @ObfuscatedName("client.le")
    public static long field491 = 0L;

    @ObfuscatedName("client.lk")
    public static boolean field301 = true;

    @ObfuscatedName("client.ln")
    public static int field493 = 765;

    @ObfuscatedName("client.lo")
    public static int field494 = 1;

    @ObfuscatedName("client.ly")
    public static int[] field495 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lr")
    public static int field496 = 0;

    @ObfuscatedName("client.lw")
    public static int field515 = 0;

    @ObfuscatedName("client.lf")
    public static String field298 = "";

    @ObfuscatedName("client.lm")
    public static long[] field362 = new long[100];

    @ObfuscatedName("client.lj")
    public static int field313 = 0;

    @ObfuscatedName("client.lv")
    public static int field501 = 0;

    @ObfuscatedName("client.lu")
    public static int[] field502 = new int[128];

    @ObfuscatedName("client.mj")
    public static int[] field448 = new int[128];

    @ObfuscatedName("client.mc")
    public static long field504 = -1L;

    @ObfuscatedName("client.mg")
    public static String field505 = null;

    @ObfuscatedName("client.ma")
    public static String field316 = null;

    @ObfuscatedName("client.mr")
    public static int field507 = -1;

    @ObfuscatedName("client.mv")
    public static int field344 = 0;

    @ObfuscatedName("client.mz")
    public static int[] field509 = new int[1000];

    @ObfuscatedName("client.mi")
    public static int[] field532 = new int[1000];

    @ObfuscatedName("client.ms")
    public static class225[] field511 = new class225[1000];

    @ObfuscatedName("client.mo")
    public static int field512 = 0;

    @ObfuscatedName("client.ml")
    public static int field513 = 0;

    @ObfuscatedName("client.mt")
    public static int field514 = 0;

    @ObfuscatedName("client.mf")
    public static int field537 = 255;

    @ObfuscatedName("client.mh")
    public static int field516 = -1;

    @ObfuscatedName("client.mu")
    public static boolean field517 = false;

    @ObfuscatedName("client.nd")
    public static int field518 = 127;

    @ObfuscatedName("client.ng")
    public static int field519 = 127;

    @ObfuscatedName("client.nw")
    public static int field371 = 0;

    @ObfuscatedName("client.nq")
    public static int[] field521 = new int[50];

    @ObfuscatedName("client.nh")
    public static int[] field522 = new int[50];

    @ObfuscatedName("client.nz")
    public static int[] field523 = new int[50];

    @ObfuscatedName("client.nf")
    public static int[] field524 = new int[50];

    @ObfuscatedName("client.ni")
    public static class54[] field303 = new class54[50];

    @ObfuscatedName("client.nu")
    public static boolean field526 = false;

    @ObfuscatedName("client.nv")
    public static boolean[] field444 = new boolean[5];

    @ObfuscatedName("client.oa")
    public static int[] field528 = new int[5];

    @ObfuscatedName("client.ov")
    public static int[] field529 = new int[5];

    @ObfuscatedName("client.ou")
    public static int[] field530 = new int[5];

    @ObfuscatedName("client.ox")
    public static int[] field531 = new int[5];

    @ObfuscatedName("client.oz")
    public static short field356 = 256;

    @ObfuscatedName("client.oy")
    public static short field533 = 205;

    @ObfuscatedName("client.om")
    public static short field534 = 256;

    @ObfuscatedName("client.oo")
    public static short field535 = 320;

    @ObfuscatedName("client.of")
    public static short field536 = 1;

    @ObfuscatedName("client.oh")
    public static short field451 = 32767;

    @ObfuscatedName("client.oq")
    public static short field346 = 1;

    @ObfuscatedName("client.on")
    public static short field539 = 32767;

    @ObfuscatedName("client.op")
    public static int field540 = 0;

    @ObfuscatedName("client.ol")
    public static int field541 = 0;

    @ObfuscatedName("client.od")
    public static int field387 = 0;

    @ObfuscatedName("client.oc")
    public static int field543 = 0;

    @ObfuscatedName("client.oj")
    public static int field343 = 0;

    @ObfuscatedName("client.oi")
    public static int field545 = 0;

    @ObfuscatedName("client.or")
    public static int field546 = 0;

    @ObfuscatedName("client.og")
    public static class15[] field383 = new class15[400];

    @ObfuscatedName("client.ot")
    public static class131 field548 = new class131();

    @ObfuscatedName("client.ow")
    public static int field549 = 0;

    @ObfuscatedName("client.ok")
    public static class20[] field330 = new class20[400];

    @ObfuscatedName("client.ob")
    public static class167 field551 = new class167();

    @ObfuscatedName("client.pw")
    public static int field452 = -1;

    @ObfuscatedName("client.pp")
    public static int field553 = -1;

    @ObfuscatedName("client.pu")
    public static class5[] field554 = new class5[8];

    @ObfuscatedName("client.pm")
    public static long field375 = -1L;

    @ObfuscatedName("client.pg")
    public static long field556 = -1L;

    @ObfuscatedName("client.ps")
    public static final class23 field557 = new class23();

    @ObfuscatedName("client.pz")
    public static int[] field558 = new int[50];

    @ObfuscatedName("client.pq")
    public static int[] field559 = new int[50];

    @ObfuscatedName("client.q(I)V")
    public final void method254() {
    }

    public final void init() {
        if (!this.method1954()) {
            return;
        }
        class215[] var1 = class215.method3537();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class215 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3161);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3161)) {
                    case 1:
                        field354 = Integer.parseInt(var4);
                        break;
                    case 2:
                        Statics.field286 = Integer.parseInt(var4);
                        break;
                    case 3:
                        Statics.field137 = var4;
                    case 4:
                    case 7:
                    case 9:
                    default:
                        break;
                    case 5:
                        int var5 = Integer.parseInt(var4);
                        class179[] var6 = class179.method1308();
                        int var7 = 0;
                        class179 var9;
                        while (true) {
                            if (var7 >= var6.length) {
                                var9 = null;
                                break;
                            }
                            class179 var8 = var6[var7];
                            if (var8.field2672 == var5) {
                                var9 = var8;
                                break;
                            }
                            var7++;
                        }
                        Statics.field799 = var9;
                        break;
                    case 6:
                        field281 = Integer.parseInt(var4);
                        break;
                    case 8:
                        if (var4.equalsIgnoreCase(class38.field775)) {
                            field283 = true;
                        } else {
                            field283 = false;
                        }
                        break;
                    case 10:
                        Statics.field2108 = (class180) class149.method1356(class180.method97(), Integer.parseInt(var4));
                        if (Statics.field2108 == class180.field2686) {
                            Statics.field1562 = class229.field3240;
                        } else {
                            Statics.field1562 = class229.field3234;
                        }
                        break;
                    case 11:
                        Statics.field2023 = Integer.parseInt(var4);
                        break;
                    case 12:
                        if (var4.equalsIgnoreCase(class38.field775)) {
                        }
                        break;
                    case 13:
                        field425 = Integer.parseInt(var4);
                        break;
                    case 14:
                        field280 = Integer.parseInt(var4);
                        break;
                    case 15:
                        Statics.field928 = var4;
                }
            }
        }
        class88.field1495 = false;
        field284 = false;
        Statics.field224 = this.getCodeBase().getHost();
        String var10 = Statics.field799.field2675;
        byte var11 = 0;
        try {
            class105.method675("oldschool", var10, var11, 16);
        } catch (Exception var13) {
            class102.method1103((String) null, var13);
        }
        Statics.field1537 = this;
        this.method1952(765, 503, 132);
    }

    @ObfuscatedName("client.k(I)V")
    public final void method410() {
        Statics.field964 = field425 == 0 ? 43594 : field280 + 40000;
        Statics.field2638 = field425 == 0 ? 443 : field280 + 50000;
        Statics.field1677 = Statics.field964;
        Statics.field3230 = class168.field2182;
        Statics.field2172 = class168.field2180;
        Statics.field2173 = class168.field2179;
        Statics.field684 = class168.field2181;
        if (Statics.field1672.toLowerCase().indexOf("microsoft") == -1) {
            class106.field1713[44] = 71;
            class106.field1713[45] = 26;
            class106.field1713[46] = 72;
            class106.field1713[47] = 73;
            class106.field1713[59] = 57;
            class106.field1713[61] = 27;
            class106.field1713[91] = 42;
            class106.field1713[92] = 74;
            class106.field1713[93] = 43;
            class106.field1713[192] = 28;
            class106.field1713[222] = 58;
            class106.field1713[520] = 59;
        } else {
            class106.field1713[186] = 57;
            class106.field1713[187] = 27;
            class106.field1713[188] = 71;
            class106.field1713[189] = 26;
            class106.field1713[190] = 72;
            class106.field1713[191] = 73;
            class106.field1713[192] = 58;
            class106.field1713[219] = 42;
            class106.field1713[220] = 74;
            class106.field1713[221] = 43;
            class106.field1713[222] = 59;
            class106.field1713[223] = 28;
        }
        Canvas var1 = Statics.field2118;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class106.field1699);
        var1.addFocusListener(class106.field1699);
        class116.method1330(Statics.field2118);
        Statics.field1918 = class113.method1074();
        if (Statics.field1918 != null) {
            Statics.field1918.method1887(Statics.field2118);
        }
        Statics.field27 = new class117(255, class105.field1689, class105.field1690, 500000);
        class74 var2 = null;
        class31 var3 = new class31();
        try {
            var2 = class105.method715("", Statics.field2108.field2689, false);
            byte[] var4 = new byte[(int) var2.method1320()];
            int var6;
            for (int var5 = 0; var5 < var4.length; var5 += var6) {
                var6 = var2.method1307(var4, var5, var4.length - var5);
                if (var6 == -1) {
                    throw new IOException();
                }
            }
            var3 = new class31(new class154(var4));
        } catch (Exception var12) {
        }
        try {
            if (var2 != null) {
                var2.method1305();
            }
        } catch (Exception var11) {
        }
        Statics.field1734 = var3;
        Statics.field166 = this.getToolkit().getSystemClipboard();
        class115.method855(this, Statics.field2026);
        if (field425 != 0) {
            field478 = true;
        }
        int var10 = Statics.field1734.field688;
        field491 = 0L;
        if (var10 >= 2) {
            field301 = true;
        } else {
            field301 = false;
        }
        method3172();
        if (field287 >= 25) {
            method2926();
        }
        field1782 = true;
    }

    @ObfuscatedName("client.j(B)V")
    public final void method257() {
        field289++;
        this.method260();
        class184.method21();
        try {
            if (class139.field1922 == 1) {
                int var1 = Statics.field1921.method2364();
                if (var1 > 0 && Statics.field1921.method2396()) {
                    int var2 = var1 - Statics.field1927;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field1921.method2332(var2);
                } else {
                    Statics.field1921.method2338();
                    Statics.field1921.method2336();
                    if (Statics.field888 == null) {
                        class139.field1922 = 0;
                    } else {
                        class139.field1922 = 2;
                    }
                    Statics.field1792 = null;
                    Statics.field588 = null;
                }
            }
        } catch (Exception var240) {
            var240.printStackTrace();
            Statics.field1921.method2338();
            class139.field1922 = 0;
            Statics.field1792 = null;
            Statics.field588 = null;
            Statics.field888 = null;
        }
        method1594();
        class106.method701();
        class116 var4 = class116.field1809;
        synchronized (class116.field1809) {
            class116.field1805 = class116.field1807;
            class116.field1806 = class116.field1803;
            class116.field1815 = class116.field1804 * -755305065;
            class116.field1814 = class116.field1808;
            class116.field1812 = class116.field1802;
            class116.field1813 = class116.field1810;
            class116.field1800 = class116.field1811;
            class116.field1808 = 0;
        }
        if (Statics.field1918 != null) {
            int var6 = Statics.field1918.method1890();
            field476 = var6;
        }
        if (field287 == 0) {
            method2525();
            Statics.field2128.method1802();
            for (int var7 = 0; var7 < 32; var7++) {
                field1774[var7] = 0L;
            }
            for (int var8 = 0; var8 < 32; var8++) {
                field1779[var8] = 0L;
            }
            Statics.field741 = 0;
        } else if (field287 == 5) {
            class42.method29(this);
            method2525();
            Statics.field2128.method1802();
            for (int var9 = 0; var9 < 32; var9++) {
                field1774[var9] = 0L;
            }
            for (int var10 = 0; var10 < 32; var10++) {
                field1779[var10] = 0L;
            }
            Statics.field741 = 0;
        } else if (field287 == 10 || field287 == 11) {
            class42.method29(this);
        } else if (field287 == 20) {
            class42.method29(this);
            method3013();
        } else if (field287 == 25) {
            method601(false);
            field334 = 0;
            boolean var11 = true;
            for (int var12 = 0; var12 < Statics.field1937.length; var12++) {
                if (Statics.field111[var12] != -1 && Statics.field1937[var12] == null) {
                    Statics.field1937[var12] = Statics.field310.method3044(Statics.field111[var12], 0);
                    if (Statics.field1937[var12] == null) {
                        var11 = false;
                        field334++;
                    }
                }
                if (Statics.field1543[var12] != -1 && Statics.field194[var12] == null) {
                    Statics.field194[var12] = Statics.field310.method3031(Statics.field1543[var12], 0, Statics.field3090[var12]);
                    if (Statics.field194[var12] == null) {
                        var11 = false;
                        field334++;
                    }
                }
            }
            if (var11) {
                field336 = 0;
                boolean var13 = true;
                for (int var14 = 0; var14 < Statics.field1937.length; var14++) {
                    byte[] var15 = Statics.field194[var14];
                    if (var15 != null) {
                        int var16 = (Statics.field1219[var14] >> 8) * 64 - Statics.field878;
                        int var17 = (Statics.field1219[var14] & 0xFF) * 64 - Statics.field33;
                        if (field340) {
                            var16 = 10;
                            var17 = 10;
                        }
                        boolean var19 = true;
                        class154 var20 = new class154(var15);
                        int var21 = -1;
                        label1166: while (true) {
                            int var22 = var20.method2758();
                            if (var22 == 0) {
                                var13 &= var19;
                                break;
                            }
                            var21 += var22;
                            int var23 = 0;
                            boolean var24 = false;
                            while (true) {
                                while (!var24) {
                                    int var26 = var20.method2758();
                                    if (var26 == 0) {
                                        continue label1166;
                                    }
                                    var23 += var26 - 1;
                                    int var27 = var23 & 0x3F;
                                    int var28 = var23 >> 6 & 0x3F;
                                    int var29 = var20.method2593() >> 2;
                                    int var30 = var16 + var28;
                                    int var31 = var17 + var27;
                                    if (var30 > 0 && var31 > 0 && var30 < 103 && var31 < 103) {
                                        class198 var32 = class198.method3716(var21);
                                        if (var29 != 22 || !field284 || var32.field2909 != 0 || var32.field2907 == 1 || var32.field2928) {
                                            if (!var32.method3352()) {
                                                field336++;
                                                var19 = false;
                                            }
                                            var24 = true;
                                        }
                                    }
                                }
                                int var25 = var20.method2758();
                                if (var25 == 0) {
                                    break;
                                }
                                var20.method2593();
                            }
                        }
                    }
                }
                if (var13) {
                    if (field350 != 0) {
                        method1451(class174.field2362 + class38.field781 + class38.field780 + 100 + "%" + class38.field779, true);
                    }
                    method1594();
                    method1084();
                    method1594();
                    Statics.field1542.method1698();
                    method1594();
                    System.gc();
                    for (int var34 = 0; var34 < 4; var34++) {
                        field339[var34].method2092();
                    }
                    for (int var35 = 0; var35 < 4; var35++) {
                        for (int var36 = 0; var36 < 104; var36++) {
                            for (int var37 = 0; var37 < 104; var37++) {
                                class11.field87[var35][var36][var37] = 0;
                            }
                        }
                    }
                    method1594();
                    class11.field88 = 99;
                    Statics.field90 = new byte[4][104][104];
                    Statics.field99 = new byte[4][104][104];
                    Statics.field812 = new byte[4][104][104];
                    Statics.field1080 = new byte[4][104][104];
                    Statics.field1910 = new int[4][105][105];
                    Statics.field932 = new byte[4][105][105];
                    Statics.field101 = new int[105][105];
                    Statics.field2783 = new int[104];
                    Statics.field2164 = new int[104];
                    Statics.field748 = new int[104];
                    Statics.field760 = new int[104];
                    Statics.field582 = new int[104];
                    int var38 = Statics.field1937.length;
                    class32.method3454();
                    method601(true);
                    if (!field340) {
                        for (int var39 = 0; var39 < var38; var39++) {
                            int var40 = (Statics.field1219[var39] >> 8) * 64 - Statics.field878;
                            int var41 = (Statics.field1219[var39] & 0xFF) * 64 - Statics.field33;
                            byte[] var42 = Statics.field1937[var39];
                            if (var42 != null) {
                                method1594();
                                class11.method199(var42, var40, var41, Statics.field2803 * 8 - 48, Statics.field2113 * 8 - 48, field339);
                            }
                        }
                        for (int var43 = 0; var43 < var38; var43++) {
                            int var44 = (Statics.field1219[var43] >> 8) * 64 - Statics.field878;
                            int var45 = (Statics.field1219[var43] & 0xFF) * 64 - Statics.field33;
                            byte[] var46 = Statics.field1937[var43];
                            if (var46 == null && Statics.field2113 < 800) {
                                method1594();
                                class11.method3012(var44, var45, 64, 64);
                            }
                        }
                        method601(true);
                        for (int var47 = 0; var47 < var38; var47++) {
                            byte[] var48 = Statics.field194[var47];
                            if (var48 != null) {
                                int var49 = (Statics.field1219[var47] >> 8) * 64 - Statics.field878;
                                int var50 = (Statics.field1219[var47] & 0xFF) * 64 - Statics.field33;
                                method1594();
                                class88 var51 = Statics.field1542;
                                class118[] var52 = field339;
                                class154 var53 = new class154(var48);
                                int var54 = -1;
                                while (true) {
                                    int var55 = var53.method2758();
                                    if (var55 == 0) {
                                        break;
                                    }
                                    var54 += var55;
                                    int var56 = 0;
                                    while (true) {
                                        int var57 = var53.method2758();
                                        if (var57 == 0) {
                                            break;
                                        }
                                        var56 += var57 - 1;
                                        int var58 = var56 & 0x3F;
                                        int var59 = var56 >> 6 & 0x3F;
                                        int var60 = var56 >> 12;
                                        int var61 = var53.method2593();
                                        int var62 = var61 >> 2;
                                        int var63 = var61 & 0x3;
                                        int var64 = var49 + var59;
                                        int var65 = var50 + var58;
                                        if (var64 > 0 && var65 > 0 && var64 < 103 && var65 < 103) {
                                            int var66 = var60;
                                            if ((class11.field87[1][var64][var65] & 0x2) == 2) {
                                                var66 = var60 - 1;
                                            }
                                            class118 var67 = null;
                                            if (var66 >= 0) {
                                                var67 = var52[var66];
                                            }
                                            class11.method119(var60, var64, var65, var54, var63, var62, var51, var67);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (field340) {
                        int var68 = 0;
                        label1071: while (true) {
                            if (var68 >= 4) {
                                for (int var86 = 0; var86 < 13; var86++) {
                                    for (int var87 = 0; var87 < 13; var87++) {
                                        int var88 = field341[0][var86][var87];
                                        if (var88 == -1) {
                                            class11.method3012(var86 * 8, var87 * 8, 8, 8);
                                        }
                                    }
                                }
                                method601(true);
                                int var89 = 0;
                                while (true) {
                                    if (var89 >= 4) {
                                        break label1071;
                                    }
                                    method1594();
                                    for (int var90 = 0; var90 < 13; var90++) {
                                        for (int var91 = 0; var91 < 13; var91++) {
                                            int var92 = field341[var89][var90][var91];
                                            if (var92 != -1) {
                                                int var93 = var92 >> 24 & 0x3;
                                                int var94 = var92 >> 1 & 0x3;
                                                int var95 = var92 >> 14 & 0x3FF;
                                                int var96 = var92 >> 3 & 0x7FF;
                                                int var97 = (var95 / 8 << 8) + var96 / 8;
                                                for (int var98 = 0; var98 < Statics.field1219.length; var98++) {
                                                    if (Statics.field1219[var98] == var97 && Statics.field194[var98] != null) {
                                                        class11.method3010(Statics.field194[var98], var89, var90 * 8, var91 * 8, var93, (var95 & 0x7) * 8, (var96 & 0x7) * 8, var94, Statics.field1542, field339);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var89++;
                                }
                            }
                            method1594();
                            for (int var69 = 0; var69 < 13; var69++) {
                                for (int var70 = 0; var70 < 13; var70++) {
                                    boolean var71 = false;
                                    int var72 = field341[var68][var69][var70];
                                    if (var72 != -1) {
                                        int var73 = var72 >> 24 & 0x3;
                                        int var74 = var72 >> 1 & 0x3;
                                        int var75 = var72 >> 14 & 0x3FF;
                                        int var76 = var72 >> 3 & 0x7FF;
                                        int var77 = (var75 / 8 << 8) + var76 / 8;
                                        for (int var78 = 0; var78 < Statics.field1219.length; var78++) {
                                            if (Statics.field1219[var78] == var77 && Statics.field1937[var78] != null) {
                                                class11.method3275(Statics.field1937[var78], var68, var69 * 8, var70 * 8, var73, (var75 & 0x7) * 8, (var76 & 0x7) * 8, var74, field339);
                                                var71 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var71) {
                                        int var79 = var68;
                                        int var80 = var69 * 8;
                                        int var81 = var70 * 8;
                                        for (int var82 = 0; var82 < 8; var82++) {
                                            for (int var83 = 0; var83 < 8; var83++) {
                                                class11.field94[var79][var80 + var82][var81 + var83] = 0;
                                            }
                                        }
                                        if (var80 > 0) {
                                            for (int var84 = 1; var84 < 8; var84++) {
                                                class11.field94[var79][var80][var81 + var84] = class11.field94[var79][var80 - 1][var81 + var84];
                                            }
                                        }
                                        if (var81 > 0) {
                                            for (int var85 = 1; var85 < 8; var85++) {
                                                class11.field94[var79][var80 + var85][var81] = class11.field94[var79][var80 + var85][var81 - 1];
                                            }
                                        }
                                        if (var80 > 0 && class11.field94[var79][var80 - 1][var81] != 0) {
                                            class11.field94[var79][var80][var81] = class11.field94[var79][var80 - 1][var81];
                                        } else if (var81 > 0 && class11.field94[var79][var80][var81 - 1] != 0) {
                                            class11.field94[var79][var80][var81] = class11.field94[var79][var80][var81 - 1];
                                        } else if (var80 > 0 && var81 > 0 && class11.field94[var79][var80 - 1][var81 - 1] != 0) {
                                            class11.field94[var79][var80][var81] = class11.field94[var79][var80 - 1][var81 - 1];
                                        }
                                    }
                                }
                            }
                            var68++;
                        }
                    }
                    method601(true);
                    method1084();
                    method1594();
                    class88 var99 = Statics.field1542;
                    class118[] var100 = field339;
                    for (int var101 = 0; var101 < 4; var101++) {
                        for (int var102 = 0; var102 < 104; var102++) {
                            for (int var103 = 0; var103 < 104; var103++) {
                                if ((class11.field87[var101][var102][var103] & 0x1) == 1) {
                                    int var104 = var101;
                                    if ((class11.field87[1][var102][var103] & 0x2) == 2) {
                                        var104 = var101 - 1;
                                    }
                                    if (var104 >= 0) {
                                        var100[var104].method2084(var102, var103);
                                    }
                                }
                            }
                        }
                    }
                    class11.field98 += (int) (Math.random() * 5.0D) - 2;
                    if (class11.field98 < -8) {
                        class11.field98 = -8;
                    }
                    if (class11.field98 > 8) {
                        class11.field98 = 8;
                    }
                    class11.field91 += (int) (Math.random() * 5.0D) - 2;
                    if (class11.field91 < -16) {
                        class11.field91 = -16;
                    }
                    if (class11.field91 > 16) {
                        class11.field91 = 16;
                    }
                    for (int var105 = 0; var105 < 4; var105++) {
                        byte[][] var106 = Statics.field932[var105];
                        int var107 = (int) Math.sqrt(5100.0D);
                        int var108 = var107 * 768 >> 8;
                        for (int var109 = 1; var109 < 103; var109++) {
                            for (int var110 = 1; var110 < 103; var110++) {
                                int var111 = class11.field94[var105][var110 + 1][var109] - class11.field94[var105][var110 - 1][var109];
                                int var112 = class11.field94[var105][var110][var109 + 1] - class11.field94[var105][var110][var109 - 1];
                                int var113 = (int) Math.sqrt((double) (var112 * var112 + var111 * var111 + 65536));
                                int var114 = (var111 << 8) / var113;
                                int var115 = 65536 / var113;
                                int var116 = (var112 << 8) / var113;
                                int var117 = (var116 * -50 + var114 * -50 + var115 * -10) / var108 + 96;
                                int var118 = (var106[var110][var109] >> 1) + (var106[var110][var109 + 1] >> 3) + (var106[var110][var109 - 1] >> 2) + (var106[var110 - 1][var109] >> 2) + (var106[var110 + 1][var109] >> 3);
                                Statics.field101[var110][var109] = var117 - var118;
                            }
                        }
                        for (int var119 = 0; var119 < 104; var119++) {
                            Statics.field2783[var119] = 0;
                            Statics.field2164[var119] = 0;
                            Statics.field748[var119] = 0;
                            Statics.field760[var119] = 0;
                            Statics.field582[var119] = 0;
                        }
                        for (int var120 = -5; var120 < 109; var120++) {
                            for (int var121 = 0; var121 < 104; var121++) {
                                int var122 = var120 + 5;
                                int var10002;
                                if (var122 >= 0 && var122 < 104) {
                                    int var123 = Statics.field90[var105][var122][var121] & 0xFF;
                                    if (var123 > 0) {
                                        class192 var124 = class192.method1823(var123 - 1);
                                        Statics.field2783[var121] += var124.field2809;
                                        Statics.field2164[var121] += var124.field2810;
                                        Statics.field748[var121] += var124.field2806;
                                        Statics.field760[var121] += var124.field2813;
                                        var10002 = Statics.field582[var121]++;
                                    }
                                }
                                int var125 = var120 - 5;
                                if (var125 >= 0 && var125 < 104) {
                                    int var126 = Statics.field90[var105][var125][var121] & 0xFF;
                                    if (var126 > 0) {
                                        class192 var127 = class192.method1823(var126 - 1);
                                        Statics.field2783[var121] -= var127.field2809;
                                        Statics.field2164[var121] -= var127.field2810;
                                        Statics.field748[var121] -= var127.field2806;
                                        Statics.field760[var121] -= var127.field2813;
                                        var10002 = Statics.field582[var121]--;
                                    }
                                }
                            }
                            if (var120 >= 1 && var120 < 103) {
                                int var128 = 0;
                                int var129 = 0;
                                int var130 = 0;
                                int var131 = 0;
                                int var132 = 0;
                                for (int var133 = -5; var133 < 109; var133++) {
                                    int var134 = var133 + 5;
                                    if (var134 >= 0 && var134 < 104) {
                                        var128 += Statics.field2783[var134];
                                        var129 += Statics.field2164[var134];
                                        var130 += Statics.field748[var134];
                                        var131 += Statics.field760[var134];
                                        var132 += Statics.field582[var134];
                                    }
                                    int var135 = var133 - 5;
                                    if (var135 >= 0 && var135 < 104) {
                                        var128 -= Statics.field2783[var135];
                                        var129 -= Statics.field2164[var135];
                                        var130 -= Statics.field748[var135];
                                        var131 -= Statics.field760[var135];
                                        var132 -= Statics.field582[var135];
                                    }
                                    if (var133 >= 1 && var133 < 103 && (!field284 || (class11.field87[0][var120][var133] & 0x2) != 0 || (class11.field87[var105][var120][var133] & 0x10) == 0)) {
                                        if (var105 < class11.field88) {
                                            class11.field88 = var105;
                                        }
                                        int var136 = Statics.field90[var105][var120][var133] & 0xFF;
                                        int var137 = Statics.field99[var105][var120][var133] & 0xFF;
                                        if (var136 > 0 || var137 > 0) {
                                            int var138 = class11.field94[var105][var120][var133];
                                            int var139 = class11.field94[var105][var120 + 1][var133];
                                            int var140 = class11.field94[var105][var120 + 1][var133 + 1];
                                            int var141 = class11.field94[var105][var120][var133 + 1];
                                            int var142 = Statics.field101[var120][var133];
                                            int var143 = Statics.field101[var120 + 1][var133];
                                            int var144 = Statics.field101[var120 + 1][var133 + 1];
                                            int var145 = Statics.field101[var120][var133 + 1];
                                            int var146 = -1;
                                            int var147 = -1;
                                            if (var136 > 0) {
                                                int var148 = var128 * 256 / var131;
                                                int var149 = var129 / var132;
                                                int var150 = var130 / var132;
                                                var146 = class11.method181(var148, var149, var150);
                                                int var151 = class11.field98 + var148 & 0xFF;
                                                int var152 = class11.field91 + var150;
                                                if (var152 < 0) {
                                                    var152 = 0;
                                                } else if (var152 > 255) {
                                                    var152 = 255;
                                                }
                                                var147 = class11.method181(var151, var149, var152);
                                            }
                                            if (var105 > 0) {
                                                boolean var153 = true;
                                                if (var136 == 0 && Statics.field812[var105][var120][var133] != 0) {
                                                    var153 = false;
                                                }
                                                if (var137 > 0) {
                                                    int var154 = var137 - 1;
                                                    class201 var155 = (class201) class201.field3031.method2169((long) var154);
                                                    class201 var156;
                                                    if (var155 == null) {
                                                        byte[] var157 = Statics.field3038.method3044(4, var154);
                                                        class201 var158 = new class201();
                                                        if (var157 != null) {
                                                            var158.method3487(new class154(var157), var154);
                                                        }
                                                        var158.method3495();
                                                        class201.field3031.method2174(var158, (long) var154);
                                                        var156 = var158;
                                                    } else {
                                                        var156 = var155;
                                                    }
                                                    if (!var156.field3035) {
                                                        var153 = false;
                                                    }
                                                }
                                                if (var153 && var138 == var139 && var138 == var140 && var138 == var141) {
                                                    Statics.field1910[var105][var120][var133] |= 0x924;
                                                }
                                            }
                                            int var159 = 0;
                                            if (var147 != -1) {
                                                var159 = class85.field1448[class11.method169(var147, 96)];
                                            }
                                            if (var137 == 0) {
                                                var99.method1606(var105, var120, var133, 0, 0, -1, var138, var139, var140, var141, class11.method169(var146, var142), class11.method169(var146, var143), class11.method169(var146, var144), class11.method169(var146, var145), 0, 0, 0, 0, var159, 0);
                                            } else {
                                                int var160 = Statics.field812[var105][var120][var133] + 1;
                                                byte var161 = Statics.field1080[var105][var120][var133];
                                                int var162 = var137 - 1;
                                                class201 var163 = (class201) class201.field3031.method2169((long) var162);
                                                class201 var164;
                                                if (var163 == null) {
                                                    byte[] var165 = Statics.field3038.method3044(4, var162);
                                                    class201 var166 = new class201();
                                                    if (var165 != null) {
                                                        var166.method3487(new class154(var165), var162);
                                                    }
                                                    var166.method3495();
                                                    class201.field3031.method2174(var166, (long) var162);
                                                    var164 = var166;
                                                } else {
                                                    var164 = var163;
                                                }
                                                int var168 = var164.field3034;
                                                int var169;
                                                int var170;
                                                if (var168 >= 0) {
                                                    var169 = Statics.field1449.method1335(var168);
                                                    var170 = -1;
                                                } else if (var164.field3033 == 16711935) {
                                                    var170 = -2;
                                                    var168 = -1;
                                                    var169 = -2;
                                                } else {
                                                    var170 = class11.method181(var164.field3037, var164.field3039, var164.field3032);
                                                    int var171 = class11.field98 + var164.field3037 & 0xFF;
                                                    int var172 = class11.field91 + var164.field3032;
                                                    if (var172 < 0) {
                                                        var172 = 0;
                                                    } else if (var172 > 255) {
                                                        var172 = 255;
                                                    }
                                                    var169 = class11.method181(var171, var164.field3039, var172);
                                                }
                                                int var173 = 0;
                                                if (var169 != -2) {
                                                    var173 = class85.field1448[class11.method2913(var169, 96)];
                                                }
                                                if (var164.field3036 != -1) {
                                                    int var174 = class11.field98 + var164.field3040 & 0xFF;
                                                    int var175 = class11.field91 + var164.field3042;
                                                    if (var175 < 0) {
                                                        var175 = 0;
                                                    } else if (var175 > 255) {
                                                        var175 = 255;
                                                    }
                                                    int var176 = class11.method181(var174, var164.field3041, var175);
                                                    var173 = class85.field1448[class11.method2913(var176, 96)];
                                                }
                                                var99.method1606(var105, var120, var133, var160, var161, var168, var138, var139, var140, var141, class11.method169(var146, var142), class11.method169(var146, var143), class11.method169(var146, var144), class11.method169(var146, var145), class11.method2913(var170, var142), class11.method2913(var170, var143), class11.method2913(var170, var144), class11.method2913(var170, var145), var159, var173);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var177 = 1; var177 < 103; var177++) {
                            for (int var178 = 1; var178 < 103; var178++) {
                                int var183;
                                if ((class11.field87[var105][var178][var177] & 0x8) != 0) {
                                    var183 = 0;
                                } else if (var105 <= 0 || (class11.field87[1][var178][var177] & 0x2) == 0) {
                                    var183 = var105;
                                } else {
                                    var183 = var105 - 1;
                                }
                                var99.method1605(var105, var178, var177, var183);
                            }
                        }
                        Statics.field90[var105] = (byte[][]) null;
                        Statics.field99[var105] = (byte[][]) null;
                        Statics.field812[var105] = (byte[][]) null;
                        Statics.field1080[var105] = (byte[][]) null;
                        Statics.field932[var105] = (byte[][]) null;
                    }
                    var99.method1632(-50, -10, -50);
                    for (int var184 = 0; var184 < 104; var184++) {
                        for (int var185 = 0; var185 < 104; var185++) {
                            if ((class11.field87[1][var184][var185] & 0x2) == 2) {
                                var99.method1603(var184, var185);
                            }
                        }
                    }
                    int var186 = 1;
                    int var187 = 2;
                    int var188 = 4;
                    for (int var189 = 0; var189 < 4; var189++) {
                        if (var189 > 0) {
                            var186 <<= 0x3;
                            var187 <<= 0x3;
                            var188 <<= 0x3;
                        }
                        for (int var190 = 0; var190 <= var189; var190++) {
                            for (int var191 = 0; var191 <= 104; var191++) {
                                for (int var192 = 0; var192 <= 104; var192++) {
                                    if ((Statics.field1910[var190][var192][var191] & var186) != 0) {
                                        int var193 = var191;
                                        int var194 = var191;
                                        int var195 = var190;
                                        int var196 = var190;
                                        while (var193 > 0 && (Statics.field1910[var190][var192][var193 - 1] & var186) != 0) {
                                            var193--;
                                        }
                                        while (var194 < 104 && (Statics.field1910[var190][var192][var194 + 1] & var186) != 0) {
                                            var194++;
                                        }
                                        label722: while (var195 > 0) {
                                            for (int var197 = var193; var197 <= var194; var197++) {
                                                if ((Statics.field1910[var195 - 1][var192][var197] & var186) == 0) {
                                                    break label722;
                                                }
                                            }
                                            var195--;
                                        }
                                        label711: while (var196 < var189) {
                                            for (int var198 = var193; var198 <= var194; var198++) {
                                                if ((Statics.field1910[var196 + 1][var192][var198] & var186) == 0) {
                                                    break label711;
                                                }
                                            }
                                            var196++;
                                        }
                                        int var199 = (var196 + 1 - var195) * (var194 - var193 + 1);
                                        if (var199 >= 8) {
                                            short var200 = 240;
                                            int var201 = class11.field94[var196][var192][var193] - var200;
                                            int var202 = class11.field94[var195][var192][var193];
                                            class88.method1604(var189, 1, var192 * 128, var192 * 128, var193 * 128, var194 * 128 + 128, var201, var202);
                                            for (int var203 = var195; var203 <= var196; var203++) {
                                                for (int var204 = var193; var204 <= var194; var204++) {
                                                    Statics.field1910[var203][var192][var204] &= ~var186;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field1910[var190][var192][var191] & var187) != 0) {
                                        int var205 = var192;
                                        int var206 = var192;
                                        int var207 = var190;
                                        int var208 = var190;
                                        while (var205 > 0 && (Statics.field1910[var190][var205 - 1][var191] & var187) != 0) {
                                            var205--;
                                        }
                                        while (var206 < 104 && (Statics.field1910[var190][var206 + 1][var191] & var187) != 0) {
                                            var206++;
                                        }
                                        label775: while (var207 > 0) {
                                            for (int var209 = var205; var209 <= var206; var209++) {
                                                if ((Statics.field1910[var207 - 1][var209][var191] & var187) == 0) {
                                                    break label775;
                                                }
                                            }
                                            var207--;
                                        }
                                        label764: while (var208 < var189) {
                                            for (int var210 = var205; var210 <= var206; var210++) {
                                                if ((Statics.field1910[var208 + 1][var210][var191] & var187) == 0) {
                                                    break label764;
                                                }
                                            }
                                            var208++;
                                        }
                                        int var211 = (var208 + 1 - var207) * (var206 - var205 + 1);
                                        if (var211 >= 8) {
                                            short var212 = 240;
                                            int var213 = class11.field94[var208][var205][var191] - var212;
                                            int var214 = class11.field94[var207][var205][var191];
                                            class88.method1604(var189, 2, var205 * 128, var206 * 128 + 128, var191 * 128, var191 * 128, var213, var214);
                                            for (int var215 = var207; var215 <= var208; var215++) {
                                                for (int var216 = var205; var216 <= var206; var216++) {
                                                    Statics.field1910[var215][var216][var191] &= ~var187;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field1910[var190][var192][var191] & var188) != 0) {
                                        int var217 = var192;
                                        int var218 = var192;
                                        int var219 = var191;
                                        int var220 = var191;
                                        while (var219 > 0 && (Statics.field1910[var190][var192][var219 - 1] & var188) != 0) {
                                            var219--;
                                        }
                                        while (var220 < 104 && (Statics.field1910[var190][var192][var220 + 1] & var188) != 0) {
                                            var220++;
                                        }
                                        label828: while (var217 > 0) {
                                            for (int var221 = var219; var221 <= var220; var221++) {
                                                if ((Statics.field1910[var190][var217 - 1][var221] & var188) == 0) {
                                                    break label828;
                                                }
                                            }
                                            var217--;
                                        }
                                        label817: while (var218 < 104) {
                                            for (int var222 = var219; var222 <= var220; var222++) {
                                                if ((Statics.field1910[var190][var218 + 1][var222] & var188) == 0) {
                                                    break label817;
                                                }
                                            }
                                            var218++;
                                        }
                                        if ((var218 - var217 + 1) * (var220 - var219 + 1) >= 4) {
                                            int var223 = class11.field94[var190][var217][var219];
                                            class88.method1604(var189, 4, var217 * 128, var218 * 128 + 128, var219 * 128, var220 * 128 + 128, var223, var223);
                                            for (int var224 = var217; var224 <= var218; var224++) {
                                                for (int var225 = var219; var225 <= var220; var225++) {
                                                    Statics.field1910[var190][var224][var225] &= ~var188;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method601(true);
                    int var226 = class11.field88;
                    if (var226 > Statics.field1559) {
                        var226 = Statics.field1559;
                    }
                    if (var226 < Statics.field1559 - 1) {
                        int var227 = Statics.field1559 - 1;
                    }
                    if (field284) {
                        Statics.field1542.method1756(class11.field88);
                    } else {
                        Statics.field1542.method1756(0);
                    }
                    for (int var228 = 0; var228 < 104; var228++) {
                        for (int var229 = 0; var229 < 104; var229++) {
                            method185(var228, var229);
                        }
                    }
                    method1594();
                    for (class26 var230 = (class26) field411.method2237(); var230 != null; var230 = (class26) field411.method2251()) {
                        if (var230.field571 == -1) {
                            var230.field570 = 0;
                            method677(var230);
                        } else {
                            var230.method2225();
                        }
                    }
                    class198.field2914.method2170();
                    if (Statics.field164 != null) {
                        field395.method2804(240);
                        field395.method2581(1057001181);
                    }
                    if (!field340) {
                        int var231 = (Statics.field2803 - 6) / 8;
                        int var232 = (Statics.field2803 + 6) / 8;
                        int var233 = (Statics.field2113 - 6) / 8;
                        int var234 = (Statics.field2113 + 6) / 8;
                        for (int var235 = var231 - 1; var235 <= var232 + 1; var235++) {
                            for (int var236 = var233 - 1; var236 <= var234 + 1; var236++) {
                                if (var235 < var231 || var235 > var232 || var236 < var233 || var236 > var234) {
                                    Statics.field310.method3050("m" + var235 + "_" + var236);
                                    Statics.field310.method3050("l" + var235 + "_" + var236);
                                }
                            }
                        }
                    }
                    method3704(30);
                    method1594();
                    class11.method3236();
                    field395.method2804(204);
                    Statics.field2128.method1802();
                    for (int var237 = 0; var237 < 32; var237++) {
                        field1774[var237] = 0L;
                    }
                    for (int var238 = 0; var238 < 32; var238++) {
                        field1779[var238] = 0L;
                    }
                    Statics.field741 = 0;
                } else {
                    field350 = 2;
                }
            } else {
                field350 = 1;
            }
        }
        if (field287 == 30) {
            method215();
        } else if (field287 == 40 || field287 == 45) {
            method3013();
        }
    }

    @ObfuscatedName("client.s(I)V")
    public final void method258() {
        boolean var1 = class139.method98();
        if (var1 && field517 && Statics.field2764 != null) {
            Statics.field2764.method995();
        }
        if (field287 == 10 || field287 == 20 || field287 == 30) {
            if (field491 != 0L && class156.method1597() > field491) {
                int var2 = field301 ? 2 : 1;
                field491 = 0L;
                if (var2 >= 2) {
                    field301 = true;
                } else {
                    field301 = false;
                }
                method3172();
                if (field287 >= 25) {
                    method2926();
                }
                field1782 = true;
            } else if (field1788) {
                method1795();
            }
        }
        Dimension var3 = this.method1963();
        if (Statics.field814 != var3.width || Statics.field76 != var3.height || field1784) {
            method3172();
            field491 = class156.method1597() + 500L;
            field1784 = false;
        }
        boolean var4 = false;
        if (field1782) {
            field1782 = false;
            var4 = true;
            for (int var5 = 0; var5 < 100; var5++) {
                field483[var5] = true;
            }
        }
        if (var4) {
            method2032();
        }
        if (field287 == 0) {
            int var6 = class42.field837;
            String var7 = class42.field838;
            Color var8 = null;
            try {
                Graphics var9 = Statics.field2118.getGraphics();
                if (Statics.field1552 == null) {
                    Statics.field1552 = new Font("Helvetica", 1, 13);
                    Statics.field1086 = Statics.field2118.getFontMetrics(Statics.field1552);
                }
                if (var4) {
                    var9.setColor(Color.black);
                    var9.fillRect(0, 0, Statics.field578, Statics.field2777);
                }
                if (var8 == null) {
                    var8 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1685 == null) {
                        Statics.field1685 = Statics.field2118.createImage(304, 34);
                    }
                    Graphics var10 = Statics.field1685.getGraphics();
                    var10.setColor(var8);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, var6 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(var6 * 3 + 2, 2, 300 - var6 * 3, 30);
                    var10.setFont(Statics.field1552);
                    var10.setColor(Color.white);
                    var10.drawString(var7, (304 - Statics.field1086.stringWidth(var7)) / 2, 22);
                    var9.drawImage(Statics.field1685, Statics.field578 / 2 - 152, Statics.field2777 / 2 - 18, (ImageObserver) null);
                } catch (Exception var23) {
                    int var12 = Statics.field578 / 2 - 152;
                    int var13 = Statics.field2777 / 2 - 18;
                    var9.setColor(var8);
                    var9.drawRect(var12, var13, 303, 33);
                    var9.fillRect(var12 + 2, var13 + 2, var6 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(var12 + 1, var13 + 1, 301, 31);
                    var9.fillRect(var6 * 3 + var12 + 2, var13 + 2, 300 - var6 * 3, 30);
                    var9.setFont(Statics.field1552);
                    var9.setColor(Color.white);
                    var9.drawString(var7, var12 + (304 - Statics.field1086.stringWidth(var7)) / 2, var13 + 22);
                }
            } catch (Exception var24) {
                Statics.field2118.repaint();
            }
        } else if (field287 == 5) {
            class42.method93(Statics.field1347, Statics.field205, Statics.field2671, var4);
        } else if (field287 == 10 || field287 == 11) {
            class42.method93(Statics.field1347, Statics.field205, Statics.field2671, var4);
        } else if (field287 == 20) {
            class42.method93(Statics.field1347, Statics.field205, Statics.field2671, var4);
        } else if (field287 == 25) {
            if (field350 == 1) {
                if (field334 > field335) {
                    field335 = field334;
                }
                int var15 = (field335 * 50 - field334 * 50) / field335;
                method1451(class174.field2362 + class38.field781 + class38.field780 + var15 + "%" + class38.field779, false);
            } else if (field350 == 2) {
                if (field336 > field499) {
                    field499 = field336;
                }
                int var16 = (field499 * 50 - field336 * 50) / field499 + 50;
                method1451(class174.field2362 + class38.field781 + class38.field780 + var16 + "%" + class38.field779, false);
            } else {
                method1451(class174.field2362, false);
            }
        } else if (field287 == 30) {
            method1106();
        } else if (field287 == 40) {
            method1451(class174.field2422 + class38.field781 + class174.field2628, false);
        } else if (field287 == 45) {
            method1451(class174.field2508, false);
        }
        if (field287 == 30 && field490 == 0 && !var4) {
            try {
                Graphics var17 = Statics.field2118.getGraphics();
                for (int var18 = 0; var18 < field481; var18++) {
                    if (field484[var18]) {
                        Statics.field1063.method3720(var17, field486[var18], field544[var18], field487[var18], field489[var18]);
                        field484[var18] = false;
                    }
                }
            } catch (Exception var26) {
                Statics.field2118.repaint();
            }
        } else if (field287 > 0) {
            try {
                Graphics var20 = Statics.field2118.getGraphics();
                Statics.field1063.method3719(var20, 0, 0);
                for (int var21 = 0; var21 < field481; var21++) {
                    field484[var21] = false;
                }
            } catch (Exception var25) {
                Statics.field2118.repaint();
            }
        }
    }

    @ObfuscatedName("client.o(B)V")
    public final void method259() {
        if (Statics.field1350.method809()) {
            Statics.field1350.method821();
        }
        if (Statics.field902 != null) {
            Statics.field902.field214 = false;
        }
        Statics.field902 = null;
        if (Statics.field153 != null) {
            Statics.field153.method1921();
            Statics.field153 = null;
        }
        class106.method96();
        if (class116.field1809 != null) {
            class116 var1 = class116.field1809;
            synchronized (class116.field1809) {
                class116.field1809 = null;
            }
        }
        Statics.field1918 = null;
        if (Statics.field2764 != null) {
            Statics.field2764.method1037();
        }
        if (Statics.field936 != null) {
            Statics.field936.method1037();
        }
        class186.method1598();
        class184.method63();
        class105.method1947();
    }

    @ObfuscatedName("hh.a(II)V")
    public static void method3704(int arg0) {
        if (field287 == arg0) {
            return;
        }
        if (field287 == 0) {
            Statics.field1685 = null;
            Statics.field1552 = null;
            Statics.field1086 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field312 = 0;
            field304 = 0;
            field314 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field497 != null) {
            Statics.field497.method1921();
            Statics.field497 = null;
        }
        if (field287 == 25) {
            field350 = 0;
            field334 = 0;
            field335 = 1;
            field336 = 0;
            field499 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class42.method721(Statics.field2118, Statics.field1596, Statics.field2740, true, 0);
        } else if (arg0 == 20) {
            class42.method721(Statics.field2118, Statics.field1596, Statics.field2740, true, field287 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class42.method721(Statics.field2118, Statics.field1596, Statics.field2740, false, 4);
        } else if (Statics.field827) {
            Statics.field852 = null;
            Statics.field821 = null;
            Statics.field3125 = null;
            Statics.field822 = null;
            Statics.field659 = null;
            Statics.field820 = null;
            Statics.field824 = null;
            Statics.field825 = null;
            Statics.field826 = null;
            Statics.field3067 = null;
            Statics.field840 = null;
            Statics.field1852 = null;
            Statics.field711 = null;
            Statics.field960 = null;
            Statics.field4 = null;
            Statics.field32 = null;
            Statics.field2019 = null;
            Statics.field830 = null;
            Statics.field1842 = null;
            Statics.field1192 = null;
            Statics.field807 = null;
            Statics.field102 = null;
            class139.field1922 = 1;
            Statics.field888 = null;
            Statics.field2696 = -1;
            Statics.field1570 = -1;
            Statics.field1722 = 0;
            Statics.field1923 = false;
            Statics.field1927 = 2;
            Statics.method2123(true);
            Statics.field827 = false;
        }
        field287 = arg0;
    }

    @ObfuscatedName("client.c(B)V")
    public void method260() {
        if (field287 == 1000) {
            return;
        }
        long var1 = class156.method1597();
        int var3 = (int) (var1 - Statics.field2760);
        Statics.field2760 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class186.field2752 += var3;
        boolean var4;
        if (class186.field2753 == 0 && class186.field2748 == 0 && class186.field2751 == 0 && class186.field2746 == 0) {
            var4 = true;
        } else if (Statics.field2758 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class186.field2752 > 30000) {
                        throw new IOException();
                    }
                    while (class186.field2748 < 20 && class186.field2746 > 0) {
                        class182 var5 = (class182) class186.field2744.method2186();
                        class154 var6 = new class154(4);
                        var6.method2578(1);
                        var6.method2580((int) var5.field1885);
                        Statics.field2758.method1935(var6.field2092, 0, 4);
                        class186.field2762.method2189(var5, var5.field1885);
                        class186.field2746--;
                        class186.field2748++;
                    }
                    while (class186.field2753 < 20 && class186.field2751 > 0) {
                        class182 var7 = (class182) class186.field2749.method2139();
                        class154 var8 = new class154(4);
                        var8.method2578(0);
                        var8.method2580((int) var7.field1885);
                        Statics.field2758.method1935(var8.field2092, 0, 4);
                        var7.method2265();
                        class186.field2763.method2189(var7, var7.field1885);
                        class186.field2751--;
                        class186.field2753++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2758.method1916();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class186.field2752 = 0;
                        byte var11 = 0;
                        if (Statics.field2754 == null) {
                            var11 = 8;
                        } else if (class186.field2756 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class186.field2755.field2098;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2758.method1917(class186.field2755.field2092, class186.field2755.field2098, var12);
                            if (class186.field2747 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class186.field2755.field2092[class186.field2755.field2098 + var13] ^= class186.field2747;
                                }
                            }
                            class186.field2755.field2098 += var12;
                            if (class186.field2755.field2098 < var11) {
                                break;
                            }
                            if (Statics.field2754 == null) {
                                class186.field2755.field2098 = 0;
                                int var14 = class186.field2755.method2593();
                                int var15 = class186.field2755.method2595();
                                int var16 = class186.field2755.method2593();
                                int var17 = class186.field2755.method2598();
                                long var18 = (long) ((var14 << 16) + var15);
                                class182 var20 = (class182) class186.field2762.method2199(var18);
                                Statics.field2344 = true;
                                if (var20 == null) {
                                    var20 = (class182) class186.field2763.method2199(var18);
                                    Statics.field2344 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2754 = var20;
                                Statics.field2117 = new class154(var17 + var21 + Statics.field2754.field2698);
                                Statics.field2117.method2578(var16);
                                Statics.field2117.method2581(var17);
                                class186.field2756 = 8;
                                class186.field2755.field2098 = 0;
                            } else if (class186.field2756 == 0) {
                                if (class186.field2755.field2092[0] == -1) {
                                    class186.field2756 = 1;
                                    class186.field2755.field2098 = 0;
                                } else {
                                    Statics.field2754 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2117.field2092.length - Statics.field2754.field2698;
                            int var23 = 512 - class186.field2756;
                            if (var23 > var22 - Statics.field2117.field2098) {
                                var23 = var22 - Statics.field2117.field2098;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2758.method1917(Statics.field2117.field2092, Statics.field2117.field2098, var23);
                            if (class186.field2747 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2117.field2092[Statics.field2117.field2098 + var24] ^= class186.field2747;
                                }
                            }
                            Statics.field2117.field2098 += var23;
                            class186.field2756 += var23;
                            if (Statics.field2117.field2098 == var22) {
                                if (Statics.field2754.field1885 == 16711935L) {
                                    Statics.field2091 = Statics.field2117;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class185 var26 = class186.field2759[var25];
                                        if (var26 != null) {
                                            Statics.field2091.field2098 = var25 * 8 + 5;
                                            int var27 = Statics.field2091.method2598();
                                            int var28 = Statics.field2091.method2598();
                                            var26.method3121(var27, var28);
                                        }
                                    }
                                } else {
                                    class186.field2757.reset();
                                    class186.field2757.update(Statics.field2117.field2092, 0, var22);
                                    int var29 = (int) class186.field2757.getValue();
                                    if (Statics.field2754.field2697 != var29) {
                                        try {
                                            Statics.field2758.method1921();
                                        } catch (Exception var35) {
                                        }
                                        class186.field2750++;
                                        Statics.field2758 = null;
                                        class186.field2747 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class186.field2750 = 0;
                                    class186.field2761 = 0;
                                    Statics.field2754.field2700.method3146((int) (Statics.field2754.field1885 & 0xFFFFL), Statics.field2117.field2092, (Statics.field2754.field1885 & 0xFF0000L) == 16711680L, Statics.field2344);
                                }
                                Statics.field2754.method2225();
                                if (Statics.field2344) {
                                    class186.field2748--;
                                } else {
                                    class186.field2753--;
                                }
                                class186.field2756 = 0;
                                Statics.field2754 = null;
                                Statics.field2117 = null;
                            } else {
                                if (class186.field2756 != 512) {
                                    break;
                                }
                                class186.field2756 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2758.method1921();
                } catch (Exception var34) {
                }
                class186.field2761++;
                Statics.field2758 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method261();
        }
    }

    @ObfuscatedName("client.u(I)V")
    public void method261() {
        if (class186.field2750 >= 4) {
            this.method1961("js5crc");
            field287 = 1000;
            return;
        }
        if (class186.field2761 >= 4) {
            if (field287 <= 5) {
                this.method1961("js5io");
                field287 = 1000;
                return;
            }
            field309 = 3000;
            class186.field2761 = 3;
        }
        if (--field309 + 1 > 0) {
            return;
        }
        try {
            if (field445 == 0) {
                Statics.field1601 = Statics.field900.method1819(Statics.field224, Statics.field1677);
                field445++;
            }
            if (field445 == 1) {
                if (Statics.field1601.field1668 == 2) {
                    this.method262(-1);
                    return;
                }
                if (Statics.field1601.field1668 == 1) {
                    field445++;
                }
            }
            if (field445 == 2) {
                Statics.field197 = new class111((Socket) Statics.field1601.field1665, Statics.field900);
                class154 var1 = new class154(5);
                var1.method2578(15);
                var1.method2581(132);
                Statics.field197.method1935(var1.field2092, 0, 5);
                field445++;
                Statics.field44 = class156.method1597();
            }
            if (field445 == 3) {
                if (field287 <= 5 || Statics.field197.method1916() > 0) {
                    int var2 = Statics.field197.method1927();
                    if (var2 != 0) {
                        this.method262(var2);
                        return;
                    }
                    field445++;
                } else if (class156.method1597() - Statics.field44 > 30000L) {
                    this.method262(-2);
                    return;
                }
            }
            if (field445 == 4) {
                class111 var3 = Statics.field197;
                boolean var4 = field287 > 20;
                if (Statics.field2758 != null) {
                    try {
                        Statics.field2758.method1921();
                    } catch (Exception var14) {
                    }
                    Statics.field2758 = null;
                }
                Statics.field2758 = var3;
                Statics.method2123(var4);
                class186.field2755.field2098 = 0;
                Statics.field2754 = null;
                Statics.field2117 = null;
                class186.field2756 = 0;
                while (true) {
                    class182 var6 = (class182) class186.field2762.method2186();
                    if (var6 == null) {
                        while (true) {
                            class182 var7 = (class182) class186.field2763.method2186();
                            if (var7 == null) {
                                if (class186.field2747 != 0) {
                                    try {
                                        class154 var8 = new class154(4);
                                        var8.method2578(4);
                                        var8.method2578(class186.field2747);
                                        var8.method2616(0);
                                        Statics.field2758.method1935(var8.field2092, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2758.method1921();
                                        } catch (Exception var12) {
                                        }
                                        class186.field2761++;
                                        Statics.field2758 = null;
                                    }
                                }
                                class186.field2752 = 0;
                                Statics.field2760 = class156.method1597();
                                Statics.field1601 = null;
                                Statics.field197 = null;
                                field445 = 0;
                                field311 = 0;
                                return;
                            }
                            class186.field2749.method2131(var7);
                            class186.field2742.method2189(var7, var7.field1885);
                            class186.field2751++;
                            class186.field2753--;
                        }
                    }
                    class186.field2744.method2189(var6, var6.field1885);
                    class186.field2746++;
                    class186.field2748--;
                }
            }
        } catch (IOException var15) {
            this.method262(-3);
        }
    }

    @ObfuscatedName("client.i(II)V")
    public void method262(int arg0) {
        Statics.field1601 = null;
        Statics.field197 = null;
        field445 = 0;
        if (Statics.field964 == Statics.field1677) {
            Statics.field1677 = Statics.field2638;
        } else {
            Statics.field1677 = Statics.field964;
        }
        field311++;
        if (field311 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field287 <= 5) {
                this.method1961("js5connect_full");
                field287 = 1000;
            } else {
                field309 = 3000;
            }
        } else if (field311 >= 2 && arg0 == 6) {
            this.method1961("js5connect_outofdate");
            field287 = 1000;
        } else if (field311 >= 4) {
            if (field287 <= 5) {
                this.method1961("js5connect");
                field287 = 1000;
            } else {
                field309 = 3000;
            }
        }
    }

    @ObfuscatedName("ek.z(I)V")
    public static void method2525() {
        if (field307 == 0) {
            Statics.field1542 = new class88(4, 104, 104, class11.field94);
            for (int var0 = 0; var0 < 4; var0++) {
                field339[var0] = new class118(104, 104);
            }
            Statics.field175 = new class225(512, 512);
            class42.field838 = class174.field2364;
            class42.field837 = 5;
            field307 = 20;
        } else if (field307 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class85.field1439[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class88.method1658(var1, 500, 800, 512, 334);
            class42.field838 = class174.field2366;
            class42.field837 = 10;
            field307 = 30;
        } else if (field307 == 30) {
            Statics.field119 = method1905(0, false, true, true);
            Statics.field13 = method1905(1, false, true, true);
            Statics.field66 = method1905(2, true, false, true);
            Statics.field2044 = method1905(3, false, true, true);
            Statics.field2045 = method1905(4, false, true, true);
            Statics.field310 = method1905(5, true, true, true);
            Statics.field3229 = method1905(6, true, true, false);
            Statics.field1190 = method1905(7, false, true, true);
            Statics.field2740 = method1905(8, false, true, true);
            Statics.field1739 = method1905(9, false, true, true);
            Statics.field1596 = method1905(10, false, true, true);
            Statics.field963 = method1905(11, false, true, true);
            Statics.field75 = method1905(12, false, true, true);
            Statics.field1650 = method1905(13, true, false, true);
            Statics.field1926 = method1905(14, false, true, false);
            Statics.field2122 = method1905(15, false, true, true);
            class42.field838 = class174.field2367;
            class42.field837 = 20;
            field307 = 40;
        } else if (field307 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field119.method3120() * 4 / 100;
            int var8 = var7 + Statics.field13.method3120() * 4 / 100;
            int var9 = var8 + Statics.field66.method3120() * 2 / 100;
            int var10 = var9 + Statics.field2044.method3120() * 2 / 100;
            int var11 = var10 + Statics.field2045.method3120() * 6 / 100;
            int var12 = var11 + Statics.field310.method3120() * 4 / 100;
            int var13 = var12 + Statics.field3229.method3120() * 2 / 100;
            int var14 = var13 + Statics.field1190.method3120() * 60 / 100;
            int var15 = var14 + Statics.field2740.method3120() * 2 / 100;
            int var16 = var15 + Statics.field1739.method3120() * 2 / 100;
            int var17 = var16 + Statics.field1596.method3120() * 2 / 100;
            int var18 = var17 + Statics.field963.method3120() * 2 / 100;
            int var19 = var18 + Statics.field75.method3120() * 2 / 100;
            int var20 = var19 + Statics.field1650.method3120() * 2 / 100;
            int var21 = var20 + Statics.field1926.method3120() * 2 / 100;
            int var22 = var21 + Statics.field2122.method3120() * 2 / 100;
            if (var22 == 100) {
                class42.field838 = class174.field2369;
                class42.field837 = 30;
                field307 = 45;
            } else {
                if (var22 != 0) {
                    class42.field838 = class174.field2368 + var22 + "%";
                }
                class42.field837 = 30;
            }
        } else if (field307 == 45) {
            class58.method37(22050, !field284, 2);
            class140 var23 = new class140();
            var23.method2340(9, 128);
            Statics.field2764 = class58.method180(Statics.field900, Statics.field2118, 0, 22050);
            Statics.field2764.method1000(var23);
            class139.method1841(Statics.field2122, Statics.field1926, Statics.field2045, var23);
            Statics.field936 = class58.method180(Statics.field900, Statics.field2118, 1, 2048);
            Statics.field754 = new class52();
            Statics.field936.method1000(Statics.field754);
            Statics.field2770 = new class66(22050, Statics.field1048);
            class42.field838 = class174.field2370;
            class42.field837 = 35;
            field307 = 50;
        } else if (field307 == 50) {
            int var24 = 0;
            if (Statics.field205 == null) {
                class185 var25 = Statics.field2740;
                class185 var26 = Statics.field1650;
                int var27 = var25.method3035("p11_full");
                int var28 = var25.method3046(var27, "");
                class209 var29 = class226.method183(var25, var26, var27, var28);
                Statics.field205 = var29;
            } else {
                var24++;
            }
            if (Statics.field2671 == null) {
                class185 var30 = Statics.field2740;
                class185 var31 = Statics.field1650;
                int var32 = var30.method3035("p12_full");
                int var33 = var30.method3046(var32, "");
                class209 var34 = class226.method183(var30, var31, var32, var33);
                Statics.field2671 = var34;
            } else {
                var24++;
            }
            if (Statics.field1347 == null) {
                class185 var35 = Statics.field2740;
                class185 var36 = Statics.field1650;
                int var37 = var35.method3035("b12_full");
                int var38 = var35.method3046(var37, "");
                class209 var39 = class226.method183(var35, var36, var37, var38);
                Statics.field1347 = var39;
            } else {
                var24++;
            }
            if (var24 < 3) {
                class42.field838 = class174.field2528 + var24 * 100 / 3 + "%";
                class42.field837 = 40;
            } else {
                Statics.field109 = new class231(true);
                class42.field838 = class174.field2372;
                class42.field837 = 40;
                field307 = 60;
            }
        } else if (field307 == 60) {
            class185 var40 = Statics.field1596;
            class185 var41 = Statics.field2740;
            int var42 = 0;
            if (var40.method3048("title.jpg", "")) {
                var42++;
            }
            if (var41.method3048("logo", "")) {
                var42++;
            }
            if (var41.method3048("logo_deadman_mode", "")) {
                var42++;
            }
            if (var41.method3048("titlebox", "")) {
                var42++;
            }
            if (var41.method3048("titlebutton", "")) {
                var42++;
            }
            if (var41.method3048("runes", "")) {
                var42++;
            }
            if (var41.method3048("title_mute", "")) {
                var42++;
            }
            if (var41.method3049("options_radio_buttons,0")) {
                var42++;
            }
            if (var41.method3049("options_radio_buttons,2")) {
                var42++;
            }
            var41.method3048("sl_back", "");
            var41.method3048("sl_flags", "");
            var41.method3048("sl_arrows", "");
            var41.method3048("sl_stars", "");
            var41.method3048("sl_button", "");
            byte var45 = 9;
            if (var42 < var45) {
                class42.field838 = class174.field2373 + var42 * 100 / var45 + "%";
                class42.field837 = 50;
            } else {
                class42.field838 = class174.field2529;
                class42.field837 = 50;
                method3704(5);
                field307 = 70;
            }
        } else if (field307 == 70) {
            if (Statics.field66.method3034()) {
                class201.method1104(Statics.field66);
                class192.method2069(Statics.field66);
                class193.method187(Statics.field66, Statics.field1190);
                class185 var47 = Statics.field66;
                class185 var48 = Statics.field1190;
                boolean var49 = field284;
                Statics.field2890 = var47;
                Statics.field2905 = var48;
                class198.field2891 = var49;
                class200.method689(Statics.field66, Statics.field1190);
                class185 var50 = Statics.field66;
                class185 var51 = Statics.field1190;
                boolean var52 = field283;
                class209 var53 = Statics.field205;
                Statics.field2942 = var50;
                Statics.field78 = var51;
                Statics.field2945 = var52;
                Statics.field2944 = Statics.field2942.method3068(10);
                Statics.field2699 = var53;
                class185 var54 = Statics.field66;
                class185 var55 = Statics.field119;
                class185 var56 = Statics.field13;
                Statics.field3047 = var54;
                Statics.field3046 = var55;
                Statics.field3045 = var56;
                class185 var57 = Statics.field66;
                class185 var58 = Statics.field1190;
                Statics.field39 = var57;
                Statics.field2801 = var58;
                class185 var59 = Statics.field66;
                Statics.field893 = var59;
                class185 var60 = Statics.field66;
                Statics.field2776 = var60;
                Statics.field2771 = Statics.field2776.method3068(16);
                class185 var61 = Statics.field2044;
                class185 var62 = Statics.field1190;
                class185 var63 = Statics.field2740;
                class185 var64 = Statics.field1650;
                Statics.field2282 = var61;
                Statics.field2189 = var62;
                Statics.field84 = var63;
                Statics.field2190 = var64;
                Statics.field2203 = new class170[Statics.field2282.method3041()][];
                Statics.field2187 = new boolean[Statics.field2282.method3041()];
                class185 var65 = Statics.field66;
                Statics.field2768 = var65;
                class185 var66 = Statics.field66;
                Statics.field2858 = var66;
                class189.method2114(Statics.field66);
                class185 var67 = Statics.field66;
                Statics.field2787 = var67;
                Statics.field1350 = new class47();
                class197.method2067(Statics.field66, Statics.field2740, Statics.field1650);
                class194.method3008(Statics.field66, Statics.field2740);
                class42.field838 = class174.field2376;
                class42.field837 = 60;
                field307 = 80;
            } else {
                class42.field838 = class174.field2375 + Statics.field66.method3127() + "%";
                class42.field837 = 60;
            }
        } else if (field307 == 80) {
            int var68 = 0;
            if (Statics.field22 == null) {
                Statics.field22 = class226.method712(Statics.field2740, "compass", "");
            } else {
                var68++;
            }
            if (Statics.field1658 == null) {
                Statics.field1658 = class226.method712(Statics.field2740, "mapedge", "");
            } else {
                var68++;
            }
            if (Statics.field38 == null) {
                Statics.field38 = class226.method117(Statics.field2740, "mapscene", "");
            } else {
                var68++;
            }
            if (Statics.field172 == null) {
                Statics.field172 = class226.method758(Statics.field2740, "mapfunction", "");
            } else {
                var68++;
            }
            if (Statics.field1979 == null) {
                Statics.field1979 = class226.method758(Statics.field2740, "headicons_pk", "");
            } else {
                var68++;
            }
            if (Statics.field390 == null) {
                Statics.field390 = class226.method758(Statics.field2740, "headicons_prayer", "");
            } else {
                var68++;
            }
            if (Statics.field679 == null) {
                Statics.field679 = class226.method758(Statics.field2740, "headicons_hint", "");
            } else {
                var68++;
            }
            if (Statics.field2645 == null) {
                Statics.field2645 = class226.method758(Statics.field2740, "mapmarker", "");
            } else {
                var68++;
            }
            if (Statics.field254 == null) {
                Statics.field254 = class226.method758(Statics.field2740, "cross", "");
            } else {
                var68++;
            }
            if (Statics.field2088 == null) {
                Statics.field2088 = class226.method758(Statics.field2740, "mapdots", "");
            } else {
                var68++;
            }
            if (Statics.field584 == null) {
                Statics.field584 = class226.method117(Statics.field2740, "scrollbar", "");
            } else {
                var68++;
            }
            if (Statics.field1541 == null) {
                Statics.field1541 = class226.method117(Statics.field2740, "mod_icons", "");
            } else {
                var68++;
            }
            if (var68 < 12) {
                class42.field838 = class174.field2377 + var68 * 100 / 12 + "%";
                class42.field837 = 70;
            } else {
                Statics.field3103 = Statics.field1541;
                Statics.field1658.method3856();
                int var69 = (int) (Math.random() * 21.0D) - 10;
                int var70 = (int) (Math.random() * 21.0D) - 10;
                int var71 = (int) (Math.random() * 21.0D) - 10;
                int var72 = (int) (Math.random() * 41.0D) - 20;
                for (int var73 = 0; var73 < Statics.field172.length; var73++) {
                    Statics.field172[var73].method3869(var69 + var72, var70 + var72, var71 + var72);
                }
                Statics.field38[0].method3813(var69 + var72, var70 + var72, var71 + var72);
                class42.field838 = class174.field2452;
                class42.field837 = 70;
                field307 = 90;
            }
        } else if (field307 == 90) {
            if (Statics.field1739.method3034()) {
                class75 var74 = new class75(Statics.field1739, Statics.field2740, 20, 0.8D, field284 ? 64 : 128);
                class85.method1535(var74);
                class85.method1586(0.8D);
                class42.field838 = class174.field2380;
                class42.field837 = 90;
                field307 = 110;
            } else {
                class42.field838 = class174.field2401 + Statics.field1739.method3127() + "%";
                class42.field837 = 90;
            }
        } else if (field307 == 110) {
            Statics.field902 = new class21();
            Statics.field900.method1838(Statics.field902, 10);
            class42.field838 = class174.field2381;
            class42.field837 = 94;
            field307 = 120;
        } else if (field307 == 120) {
            if (Statics.field1596.method3048("huffman", "")) {
                class146 var75 = new class146(Statics.field1596.method3047("huffman", ""));
                class211.method2794(var75);
                class42.field838 = class174.field2383;
                class42.field837 = 96;
                field307 = 130;
            } else {
                class42.field838 = class174.field2423 + "%";
                class42.field837 = 96;
            }
        } else if (field307 == 130) {
            if (!Statics.field2044.method3034()) {
                class42.field838 = class174.field2471 + Statics.field2044.method3127() * 4 / 5 + "%";
                class42.field837 = 100;
            } else if (!Statics.field75.method3034()) {
                class42.field838 = class174.field2471 + (80 + Statics.field75.method3127() / 6) + "%";
                class42.field837 = 100;
            } else if (Statics.field1650.method3034()) {
                class42.field838 = class174.field2371;
                class42.field837 = 100;
                field307 = 140;
            } else {
                class42.field838 = class174.field2471 + (96 + Statics.field1650.method3127() / 20) + "%";
                class42.field837 = 100;
            }
        } else if (field307 == 140) {
            method3704(10);
        }
    }

    @ObfuscatedName("dv.n(IZZZI)Lgm;")
    public static class185 method1905(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class117 var4 = null;
        if (class105.field1689 != null) {
            var4 = new class117(arg0, class105.field1689, Statics.field152[arg0], 1000000);
        }
        return new class185(var4, Statics.field27, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("fu.w(I)V")
    public static final void method3013() {
        try {
            if (field312 == 0) {
                if (Statics.field153 != null) {
                    Statics.field153.method1921();
                    Statics.field153 = null;
                }
                Statics.field1980 = null;
                field333 = false;
                field304 = 0;
                field312 = 1;
            }
            if (field312 == 1) {
                if (Statics.field1980 == null) {
                    Statics.field1980 = Statics.field900.method1819(Statics.field224, Statics.field1677);
                }
                if (Statics.field1980.field1668 == 2) {
                    throw new IOException();
                }
                if (Statics.field1980.field1668 == 1) {
                    Statics.field153 = new class111((Socket) Statics.field1980.field1665, Statics.field900);
                    Statics.field1980 = null;
                    field312 = 2;
                }
            }
            if (field312 == 2) {
                field395.field2098 = 0;
                field395.method2578(14);
                Statics.field153.method1935(field395.field2092, 0, 1);
                field324.field2098 = 0;
                field312 = 3;
            }
            if (field312 == 3) {
                if (Statics.field2764 != null) {
                    Statics.field2764.method1004();
                }
                if (Statics.field936 != null) {
                    Statics.field936.method1004();
                }
                int var0 = Statics.field153.method1927();
                if (Statics.field2764 != null) {
                    Statics.field2764.method1004();
                }
                if (Statics.field936 != null) {
                    Statics.field936.method1004();
                }
                if (var0 != 0) {
                    method20(var0);
                    return;
                }
                field324.field2098 = 0;
                field312 = 5;
            }
            if (field312 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field395.field2098 = 0;
                field395.method2578(1);
                field395.method2578(class42.field846.method727());
                field395.method2581(var1[0]);
                field395.method2581(var1[1]);
                field395.method2581(var1[2]);
                field395.method2581(var1[3]);
                switch(class42.field846.field1633) {
                    case 0:
                    case 3:
                        field395.method2580(Statics.field714);
                        field395.field2098 += 5;
                        break;
                    case 1:
                        field395.method2581((Integer) Statics.field1734.field689.get(class208.method3161(class42.field844)));
                        field395.field2098 += 4;
                        break;
                    case 2:
                        field395.field2098 += 8;
                }
                field395.method2584(class42.field845);
                field395.method2663(class40.field805, class40.field801);
                field323.field2098 = 0;
                if (field287 == 40) {
                    field323.method2578(18);
                } else {
                    field323.method2578(16);
                }
                field323.method2616(0);
                int var2 = field323.field2098;
                field323.method2581(132);
                field323.method2587(field395.field2092, 0, field395.field2098);
                int var3 = field323.field2098;
                field323.method2584(class42.field844);
                field323.method2578((field301 ? 1 : 0) << 1 | (field284 ? 1 : 0));
                field323.method2616(Statics.field578);
                field323.method2616(Statics.field2777);
                class105.method854(field323);
                field323.method2584(Statics.field928);
                field323.method2581(Statics.field2023);
                class154 var4 = new class154(Statics.field109.method3993());
                Statics.field109.method3994(var4);
                field323.method2587(var4.field2092, 0, var4.field2092.length);
                field323.method2578(Statics.field286);
                field323.method2581(Statics.field119.field2704);
                field323.method2581(Statics.field13.field2704);
                field323.method2581(Statics.field66.field2704);
                field323.method2581(Statics.field2044.field2704);
                field323.method2581(Statics.field2045.field2704);
                field323.method2581(Statics.field310.field2704);
                field323.method2581(Statics.field3229.field2704);
                field323.method2581(Statics.field1190.field2704);
                field323.method2581(Statics.field2740.field2704);
                field323.method2581(Statics.field1739.field2704);
                field323.method2581(Statics.field1596.field2704);
                field323.method2581(Statics.field963.field2704);
                field323.method2581(Statics.field75.field2704);
                field323.method2581(Statics.field1650.field2704);
                field323.method2581(Statics.field1926.field2704);
                field323.method2581(Statics.field2122.field2704);
                field323.method2611(var1, var3, field323.field2098);
                field323.method2589(field323.field2098 - var2);
                Statics.field153.method1935(field323.field2092, 0, field323.field2098);
                field395.method2805(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field324.method2805(var1);
                field312 = 6;
            }
            if (field312 == 6 && Statics.field153.method1916() > 0) {
                int var6 = Statics.field153.method1927();
                if (var6 == 21 && field287 == 20) {
                    field312 = 7;
                } else if (var6 == 2) {
                    field312 = 9;
                } else if (var6 == 15 && field287 == 40) {
                    field542 = -1;
                    field312 = 13;
                } else if (var6 == 23 && field314 < 1) {
                    field314++;
                    field312 = 0;
                } else if (var6 == 29) {
                    field312 = 11;
                } else {
                    method20(var6);
                    return;
                }
            }
            if (field312 == 7 && Statics.field153.method1916() > 0) {
                field315 = (Statics.field153.method1927() + 3) * 60;
                field312 = 8;
            }
            if (field312 == 8) {
                field304 = 0;
                class42.method205(class174.field2389, class174.field2390, field315 / 60 + class174.field2391);
                if (--field315 <= 0) {
                    field312 = 0;
                }
            } else {
                if (field312 == 9 && Statics.field153.method1916() >= 13) {
                    boolean var7 = Statics.field153.method1927() == 1;
                    Statics.field153.method1917(field324.field2092, 0, 4);
                    field324.field2098 = 0;
                    boolean var8 = false;
                    if (var7) {
                        int var9 = field324.method2807() << 24;
                        int var10 = var9 | field324.method2807() << 16;
                        int var11 = var10 | field324.method2807() << 8;
                        int var12 = var11 | field324.method2807();
                        int var13 = class208.method3161(class42.field844);
                        if (Statics.field1734.field689.size() >= 10 && !Statics.field1734.field689.containsKey(var13)) {
                            Iterator var14 = Statics.field1734.field689.entrySet().iterator();
                            var14.next();
                            var14.remove();
                        }
                        Statics.field1734.field689.put(var13, var12);
                        class31.method1596();
                    }
                    field328 = Statics.field153.method1927();
                    field447 = Statics.field153.method1927() == 1;
                    field409 = Statics.field153.method1927();
                    field409 <<= 0x8;
                    field409 += Statics.field153.method1927();
                    field305 = Statics.field153.method1927();
                    Statics.field153.method1917(field324.field2092, 0, 1);
                    field324.field2098 = 0;
                    field326 = field324.method2807();
                    Statics.field153.method1917(field324.field2092, 0, 2);
                    field324.field2098 = 0;
                    field542 = field324.method2595();
                    try {
                        class101.method1812(Statics.field1537, "zap");
                    } catch (Throwable var21) {
                    }
                    field312 = 10;
                }
                if (field312 != 10) {
                    if (field312 == 11 && Statics.field153.method1916() >= 2) {
                        field324.field2098 = 0;
                        Statics.field153.method1917(field324.field2092, 0, 2);
                        field324.field2098 = 0;
                        Statics.field273 = field324.method2595();
                        field312 = 12;
                    }
                    if (field312 == 12 && Statics.field153.method1916() >= Statics.field273) {
                        field324.field2098 = 0;
                        Statics.field153.method1917(field324.field2092, 0, Statics.field273);
                        field324.field2098 = 0;
                        String var16 = field324.method2625();
                        String var17 = field324.method2625();
                        String var18 = field324.method2625();
                        class42.method205(var16, var17, var18);
                        method3704(10);
                    }
                    if (field312 == 13) {
                        if (field542 == -1) {
                            if (Statics.field153.method1916() < 2) {
                                return;
                            }
                            Statics.field153.method1917(field324.field2092, 0, 2);
                            field324.field2098 = 0;
                            field542 = field324.method2595();
                        }
                        if (Statics.field153.method1916() >= field542) {
                            Statics.field153.method1917(field324.field2092, 0, field542);
                            field324.field2098 = 0;
                            int var19 = field542;
                            method120();
                            class46.method627(field324);
                            if (field324.field2098 != var19) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field304++;
                        if (field304 > 2000) {
                            if (field314 < 1) {
                                if (Statics.field964 == Statics.field1677) {
                                    Statics.field1677 = Statics.field2638;
                                } else {
                                    Statics.field1677 = Statics.field964;
                                }
                                field314++;
                                field312 = 0;
                            } else {
                                method20(-3);
                            }
                        }
                    }
                } else if (Statics.field153.method1916() >= field542) {
                    field324.field2098 = 0;
                    Statics.field153.method1917(field324.field2092, 0, field542);
                    Statics.method249();
                    class46.method627(field324);
                    Statics.field2803 = -1;
                    method660(false);
                    field326 = -1;
                }
            }
        } catch (IOException var22) {
            if (field314 < 1) {
                if (Statics.field964 == Statics.field1677) {
                    Statics.field1677 = Statics.field2638;
                } else {
                    Statics.field1677 = Statics.field964;
                }
                field314++;
                field312 = 0;
            } else {
                method20(-2);
            }
        }
    }

    @ObfuscatedName("a.v(I)V")
    public static void method120() {
        field395.field2098 = 0;
        field324.field2098 = 0;
        field326 = -1;
        field329 = -1;
        field401 = -1;
        field331 = -1;
        field542 = 0;
        field327 = 0;
        field296 = 0;
        field460 = 0;
        field416 = false;
        field514 = 0;
        field512 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field400[var0] = null;
        }
        Statics.field169 = null;
        for (int var1 = 0; var1 < field285.length; var1++) {
            class36 var2 = field285[var1];
            if (var2 != null) {
                var2.field641 = -1;
                var2.field620 = false;
            }
        }
        class13.field115 = new class126(32);
        method3704(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field483[var3] = true;
        }
        method2926();
    }

    @ObfuscatedName("g.f(II)V")
    public static void method20(int arg0) {
        if (arg0 == -3) {
            class42.method205(class174.field2365, class174.field2393, class174.field2394);
        } else if (arg0 == -2) {
            class42.method205(class174.field2599, class174.field2396, class174.field2534);
        } else if (arg0 == -1) {
            class42.method205(class174.field2398, class174.field2399, class174.field2400);
        } else if (arg0 == 3) {
            class42.field841 = 3;
        } else if (arg0 == 4) {
            class42.method205(class174.field2430, class174.field2357, class174.field2403);
        } else if (arg0 == 5) {
            class42.method205(class174.field2404, class174.field2515, class174.field2406);
        } else if (arg0 == 6) {
            class42.method205(class174.field2397, class174.field2378, class174.field2409);
        } else if (arg0 == 7) {
            class42.method205(class174.field2410, class174.field2623, class174.field2412);
        } else if (arg0 == 8) {
            class42.method205(class174.field2413, class174.field2414, class174.field2415);
        } else if (arg0 == 9) {
            class42.method205(class174.field2595, class174.field2450, class174.field2418);
        } else if (arg0 == 10) {
            class42.method205(class174.field2552, class174.field2420, class174.field2421);
        } else if (arg0 == 11) {
            class42.method205(class174.field2457, class174.field2563, class174.field2355);
        } else if (arg0 == 12) {
            class42.method205(class174.field2425, class174.field2432, class174.field2427);
        } else if (arg0 == 13) {
            class42.method205(class174.field2428, class174.field2530, class174.field2407);
        } else if (arg0 == 14) {
            class42.method205(class174.field2445, class174.field2603, class174.field2411);
        } else if (arg0 == 16) {
            class42.method205(class174.field2434, class174.field2459, class174.field2451);
        } else if (arg0 == 17) {
            class42.method205(class174.field2437, class174.field2438, class174.field2439);
        } else if (arg0 == 18) {
            class42.method205(class174.field2440, class174.field2441, class174.field2442);
        } else if (arg0 == 19) {
            class42.method205(class174.field2354, class174.field2444, class174.field2483);
        } else if (arg0 == 20) {
            class42.method205(class174.field2446, class174.field2447, class174.field2448);
        } else if (arg0 == 22) {
            class42.method205(class174.field2467, class174.field2382, class174.field2466);
        } else if (arg0 == 23) {
            class42.method205(class174.field2618, class174.field2453, class174.field2481);
        } else if (arg0 == 24) {
            class42.method205(class174.field2455, class174.field2456, class174.field2500);
        } else if (arg0 == 25) {
            class42.method205(class174.field2458, class174.field2581, class174.field2395);
        } else if (arg0 == 26) {
            class42.method205(class174.field2461, class174.field2462, class174.field2463);
        } else if (arg0 == 27) {
            class42.method205(class174.field2464, class174.field2416, class174.field2536);
        } else if (arg0 == 31) {
            class42.method205(class174.field2473, class174.field2474, class174.field2433);
        } else if (arg0 == 32) {
            class42.method205(class174.field2470, class174.field2510, class174.field2478);
        } else if (arg0 == 37) {
            class42.method205(class174.field2479, class174.field2480, class174.field2489);
        } else if (arg0 == 38) {
            class42.method205(class174.field2482, class174.field2385, class174.field2484);
        } else if (arg0 == 55) {
            class42.method205(class174.field2485, class174.field2486, class174.field2487);
        } else if (arg0 == 56) {
            class42.method205(class174.field2488, class174.field2475, class174.field2490);
            method3704(11);
            return;
        } else if (arg0 == 57) {
            class42.method205(class174.field2491, class174.field2469, class174.field2493);
            method3704(11);
            return;
        } else {
            class42.method205(class174.field2494, class174.field2592, class174.field2496);
        }
        method3704(10);
    }

    @ObfuscatedName("cz.l(I)V")
    public static final void method1797() {
        if (Statics.field153 != null) {
            Statics.field153.method1921();
            Statics.field153 = null;
        }
        method1084();
        Statics.field1542.method1698();
        for (int var0 = 0; var0 < 4; var0++) {
            field339[var0].method2092();
        }
        System.gc();
        class139.field1922 = 1;
        Statics.field888 = null;
        Statics.field2696 = -1;
        Statics.field1570 = -1;
        Statics.field1722 = 0;
        Statics.field1923 = false;
        Statics.field1927 = 2;
        field516 = -1;
        field517 = false;
        class32.method3454();
        method3704(10);
    }

    @ObfuscatedName("bx.t(I)V")
    public static final void method1084() {
        class201.field3031.method2170();
        class192.method2024();
        class193.method1934();
        class198.method1943();
        class200.field2996.method2170();
        class200.field2997.method2170();
        class199.method1796();
        class202.method3017();
        class191.field2798.method2170();
        class191.field2790.method2170();
        class195.field2846.method2170();
        class188.method2526();
        class197.method868();
        class194.method179();
        class167.method18();
        class170.field2191.method2170();
        class170.field2284.method2170();
        class170.field2232.method2170();
        class170.field2194.method2170();
        ((class75) Statics.field1449).method1336();
        class49.field953.method2170();
        Statics.field119.method3070();
        Statics.field13.method3070();
        Statics.field2044.method3070();
        Statics.field2045.method3070();
        Statics.field310.method3070();
        Statics.field3229.method3070();
        Statics.field1190.method3070();
        Statics.field2740.method3070();
        Statics.field1739.method3070();
        Statics.field1596.method3070();
        Statics.field963.method3070();
        Statics.field75.method3070();
    }

    @ObfuscatedName("l.b(I)V")
    public static final void method215() {
        if (field296 > 1) {
            field296--;
        }
        if (field332 > 0) {
            field332--;
        }
        if (field333) {
            field333 = false;
            if (field332 > 0) {
                method1797();
            } else {
                method3704(40);
                Statics.field497 = Statics.field153;
                Statics.field153 = null;
            }
            return;
        }
        if (!field416) {
            field424[0] = class174.field2379;
            field454[0] = "";
            field422[0] = 1006;
            field460 = 1;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field153 == null) {
                var1 = false;
            } else {
                label2940: {
                    try {
                        int var2 = Statics.field153.method1916();
                        if (var2 == 0) {
                            var1 = false;
                            break label2940;
                        }
                        if (field326 == -1) {
                            Statics.field153.method1917(field324.field2092, 0, 1);
                            field324.field2098 = 0;
                            field326 = field324.method2807();
                            field542 = class213.field3144[field326];
                            var2--;
                        }
                        if (field542 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2940;
                            }
                            Statics.field153.method1917(field324.field2092, 0, 1);
                            field542 = field324.field2092[0] & 0xFF;
                            var2--;
                        }
                        if (field542 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2940;
                            }
                            Statics.field153.method1917(field324.field2092, 0, 2);
                            field324.field2098 = 0;
                            field542 = field324.method2595();
                            var2 -= 2;
                        }
                        if (var2 < field542) {
                            var1 = false;
                            break label2940;
                        }
                        field324.field2098 = 0;
                        Statics.field153.method1917(field324.field2092, 0, field542);
                        field327 = 0;
                        field331 = field401;
                        field401 = field329;
                        field329 = field326;
                        if (field326 == 144) {
                            field296 = field324.method2595() * 30;
                            field475 = field463;
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 4) {
                            class30 var3 = new class30();
                            var3.field676 = field324.method2625();
                            var3.field665 = field324.method2595();
                            int var4 = field324.method2598();
                            var3.field675 = var4;
                            method3704(45);
                            Statics.field153.method1921();
                            Statics.field153 = null;
                            class42.method2312(var3);
                            field326 = -1;
                            var1 = false;
                            break label2940;
                        }
                        if (field326 == 89) {
                            for (int var5 = 0; var5 < field400.length; var5++) {
                                if (field400[var5] != null) {
                                    field400[var5].field625 = -1;
                                }
                            }
                            for (int var6 = 0; var6 < field285.length; var6++) {
                                if (field285[var6] != null) {
                                    field285[var6].field625 = -1;
                                }
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 38) {
                            int var7 = field324.method2598();
                            int var8 = field324.method2610();
                            class18 var9 = (class18) field439.method2199((long) var7);
                            class18 var10 = (class18) field439.method2199((long) var8);
                            if (var10 != null) {
                                method118(var10, var9 == null || var9.field180 != var10.field180);
                            }
                            if (var9 != null) {
                                var9.method2225();
                                field439.method2189(var9, (long) var8);
                            }
                            class170 var11 = class170.method723(var7);
                            if (var11 != null) {
                                method676(var11);
                            }
                            class170 var12 = class170.method723(var8);
                            if (var12 != null) {
                                method676(var12);
                                method1787(Statics.field2203[var12.field2237 >>> 16], var12, true);
                            }
                            if (field438 != -1) {
                                method2562(field438, 1);
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 22) {
                            String var13 = field324.method2625();
                            long var14 = (long) field324.method2595();
                            long var16 = (long) field324.method2748();
                            class178 var18 = (class178) class149.method1356(class178.method690(), field324.method2593());
                            long var19 = (var14 << 32) + var16;
                            boolean var21 = false;
                            for (int var22 = 0; var22 < 100; var22++) {
                                if (field362[var22] == var19) {
                                    var21 = true;
                                    break;
                                }
                            }
                            if (method3004(var13)) {
                                var21 = true;
                            }
                            if (!var21 && field398 == 0) {
                                field362[field313] = var19;
                                field313 = (field313 + 1) % 100;
                                class160 var23 = field324;
                                String var27;
                                try {
                                    int var24 = var23.method2758();
                                    if (var24 > 32767) {
                                        var24 = 32767;
                                    }
                                    byte[] var25 = new byte[var24];
                                    var23.field2098 += Statics.field3118.method2524(var23.field2092, var23.field2098, var25, 0, var24);
                                    String var26 = class204.method609(var25, 0, var24);
                                    var27 = var26;
                                } catch (Exception var443) {
                                    var27 = "Cabbage";
                                }
                                String var30 = class210.method3665(class208.method23(var27));
                                byte var31;
                                if (var18.field2665) {
                                    var31 = 7;
                                } else {
                                    var31 = 3;
                                }
                                if (var18.field2664 == -1) {
                                    class48.method1829(var31, var13, var30);
                                } else {
                                    class48.method1829(var31, class38.method2930(var18.field2664) + var13, var30);
                                }
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 1) {
                            if (field438 != -1) {
                                method2562(field438, 0);
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 211) {
                            field546 = 1;
                            field417 = field463;
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 165) {
                            int var32 = field324.method2758();
                            boolean var33 = field324.method2593() == 1;
                            String var34 = "";
                            boolean var35 = false;
                            if (var33) {
                                var34 = field324.method2625();
                                if (method3004(var34)) {
                                    var35 = true;
                                }
                            }
                            String var36 = field324.method2625();
                            if (!var35) {
                                class48.method1829(var32, var34, var36);
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 222) {
                            int var37 = field324.method2637();
                            int var38 = field324.method2712();
                            class170 var39 = class170.method723(var37);
                            if (var39 != null && var39.field2199 == 0) {
                                if (var38 > var39.field2221 - var39.field2213) {
                                    var38 = var39.field2221 - var39.field2213;
                                }
                                if (var38 < 0) {
                                    var38 = 0;
                                }
                                if (var39.field2209 != var38) {
                                    var39.field2209 = var38;
                                    method676(var39);
                                }
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 148) {
                            int var40 = field324.method2593();
                            int var41 = field324.method2593();
                            int var42 = field324.method2593();
                            int var43 = field324.method2593();
                            field444[var40] = true;
                            field528[var40] = var41;
                            field529[var40] = var42;
                            field530[var40] = var43;
                            field531[var40] = 0;
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 54) {
                            String var44 = field324.method2625();
                            int var45 = field324.method2637();
                            class170 var46 = class170.method723(var45);
                            if (!var44.equals(var46.field2257)) {
                                var46.field2257 = var44;
                                method676(var46);
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 68) {
                            String var47 = field324.method2625();
                            int var48 = field324.method2595();
                            byte var49 = field324.method2631();
                            boolean var50 = false;
                            if (var49 == -128) {
                                var50 = true;
                            }
                            if (var50) {
                                if (Statics.field100 == 0) {
                                    field326 = -1;
                                    var1 = true;
                                    break label2940;
                                }
                                boolean var51 = false;
                                int var52;
                                for (var52 = 0; var52 < Statics.field100 && (!Statics.field1545[var52].field269.equals(var47) || Statics.field1545[var52].field272 != var48); var52++) {
                                }
                                if (var52 < Statics.field100) {
                                    while (var52 < Statics.field100 - 1) {
                                        Statics.field1545[var52] = Statics.field1545[var52 + 1];
                                        var52++;
                                    }
                                    Statics.field100--;
                                    Statics.field1545[Statics.field100] = null;
                                }
                            } else {
                                field324.method2625();
                                class25 var53 = new class25();
                                var53.field269 = var47;
                                var53.field278 = class205.method1599(var53.field269, Statics.field1562);
                                var53.field272 = var48;
                                var53.field271 = var49;
                                int var54;
                                for (var54 = Statics.field100 - 1; var54 >= 0; var54--) {
                                    int var55 = Statics.field1545[var54].field278.compareTo(var53.field278);
                                    if (var55 == 0) {
                                        Statics.field1545[var54].field272 = var48;
                                        Statics.field1545[var54].field271 = var49;
                                        if (var47.equals(Statics.field169.field264)) {
                                            Statics.field1743 = var49;
                                        }
                                        field472 = field463;
                                        field326 = -1;
                                        var1 = true;
                                        break label2940;
                                    }
                                    if (var55 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field100 >= Statics.field1545.length) {
                                    field326 = -1;
                                    var1 = true;
                                    break label2940;
                                }
                                for (int var56 = Statics.field100 - 1; var56 > var54; var56--) {
                                    Statics.field1545[var56 + 1] = Statics.field1545[var56];
                                }
                                if (Statics.field100 == 0) {
                                    Statics.field1545 = new class25[100];
                                }
                                Statics.field1545[var54 + 1] = var53;
                                Statics.field100++;
                                if (var47.equals(Statics.field169.field264)) {
                                    Statics.field1743 = var49;
                                }
                            }
                            field472 = field463;
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 92 || field326 == 7 || field326 == 156 || field326 == 136 || field326 == 236 || field326 == 241 || field326 == 37 || field326 == 51 || field326 == 231 || field326 == 219) {
                            method781();
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 75) {
                            Statics.field1730 = field324.method2627();
                            Statics.field2722 = field324.method2593();
                            while (field324.field2098 < field542) {
                                field326 = field324.method2593();
                                method781();
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 113) {
                            int var57 = field324.method2629();
                            if (var57 == 65535) {
                                var57 = -1;
                            }
                            int var58 = field324.method2598();
                            int var59 = field324.method2629();
                            if (var59 == 65535) {
                                var59 = -1;
                            }
                            int var60 = field324.method2610();
                            for (int var61 = var57; var61 <= var59; var61++) {
                                long var62 = ((long) var58 << 32) + (long) var61;
                                class128 var64 = field480.method2199(var62);
                                if (var64 != null) {
                                    var64.method2225();
                                }
                                field480.method2189(new class134(var60), var62);
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 120) {
                            int var65 = field324.method2606();
                            if (var65 == 65535) {
                                var65 = -1;
                            }
                            if (var65 == -1 && !field517) {
                                Statics.field1921.method2338();
                                class139.field1922 = 1;
                                Statics.field888 = null;
                            } else if (var65 != -1 && field516 != var65 && field537 != 0 && !field517) {
                                class139.method3478(2, Statics.field3229, var65, 0, field537, false);
                            }
                            field516 = var65;
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 65) {
                            int var66 = field324.method2712();
                            if (var66 == 65535) {
                                var66 = -1;
                            }
                            int var67 = field324.method2632();
                            method667(var66, var67);
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 0) {
                            int var68 = field324.method2621();
                            int var69 = field324.method2627();
                            String var70 = field324.method2625();
                            if (var68 >= 1 && var68 <= 8) {
                                if (var70.equalsIgnoreCase("null")) {
                                    var70 = null;
                                }
                                field406[var68 - 1] = var70;
                                field325[var68 - 1] = var69 == 0;
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 227) {
                            int var71 = field324.method2629();
                            int var72 = field324.method2627();
                            int var73 = field324.method2636();
                            class18 var74 = (class18) field439.method2199((long) var73);
                            if (var74 != null) {
                                method118(var74, var74.field180 != var71);
                            }
                            method358(var73, var71, var72);
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 200) {
                            Statics.field663 = class217.method3538(field324.method2593());
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 111) {
                            int var75 = field324.method2595();
                            int var76 = field324.method2595();
                            int var77 = field324.method2598();
                            int var78 = field324.method2629();
                            class170 var79 = class170.method723(var77);
                            if (var79.field2268 != var78 || var79.field2310 != var76 || var79.field2251 != var75) {
                                var79.field2268 = var78;
                                var79.field2310 = var76;
                                var79.field2251 = var75;
                                method676(var79);
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 64) {
                            int var80 = field542 + field324.field2098;
                            int var81 = field324.method2595();
                            int var82 = field324.method2595();
                            if (field438 != var81) {
                                field438 = var81;
                                Statics.method743(false);
                                method121(field438);
                                class33.method79(field438);
                                for (int var83 = 0; var83 < 100; var83++) {
                                    field483[var83] = true;
                                }
                            }
                            while (var82-- > 0) {
                                int var84 = field324.method2598();
                                int var85 = field324.method2595();
                                int var86 = field324.method2593();
                                class18 var87 = (class18) field439.method2199((long) var84);
                                if (var87 != null && var87.field180 != var85) {
                                    method118(var87, true);
                                    var87 = null;
                                }
                                if (var87 == null) {
                                    var87 = method358(var84, var85, var86);
                                }
                                var87.field177 = true;
                            }
                            for (class18 var88 = (class18) field439.method2186(); var88 != null; var88 = (class18) field439.method2194()) {
                                if (var88.field177) {
                                    var88.field177 = false;
                                } else {
                                    method118(var88, true);
                                }
                            }
                            field480 = new class126(512);
                            while (field324.field2098 < var80) {
                                int var89 = field324.method2598();
                                int var90 = field324.method2595();
                                int var91 = field324.method2595();
                                int var92 = field324.method2598();
                                for (int var93 = var90; var93 <= var91; var93++) {
                                    long var94 = ((long) var89 << 32) + (long) var93;
                                    field480.method2189(new class134(var92), var94);
                                }
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 66) {
                            int var96 = field324.method2593();
                            if (field324.method2593() == 0) {
                                field554[var96] = new class5();
                                field324.field2098 += 18;
                            } else {
                                field324.field2098--;
                                field554[var96] = new class5(field324, false);
                            }
                            field471 = field463;
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 6) {
                            method1797();
                            field326 = -1;
                            var1 = false;
                            break label2940;
                        }
                        if (field326 == 143) {
                            boolean var97 = field324.method2733() == 1;
                            int var98 = field324.method2637();
                            class170 var99 = class170.method723(var98);
                            if (var99.field2217 != var97) {
                                var99.field2217 = var97;
                                method676(var99);
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 100) {
                            field324.field2098 += 28;
                            if (field324.method2615()) {
                                class160 var100 = field324;
                                int var101 = field324.field2098 - 28;
                                if (class105.field1684 != null) {
                                    try {
                                        class105.field1684.method1271(0L);
                                        class105.field1684.method1275(var100.field2092, var101, 24);
                                    } catch (Exception var442) {
                                    }
                                }
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 47) {
                            int var103 = field324.method2598();
                            Statics.field691 = Statics.field900.method1824(var103);
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 139) {
                            class46.method2990(field324, field542);
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 166) {
                            method177();
                            field443 = field324.method2593();
                            field475 = field463;
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 201) {
                            method177();
                            field319 = field324.method2739();
                            field475 = field463;
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 159) {
                            int var104 = field324.method2610();
                            int var105 = field324.method2629();
                            int var106 = var105 >> 10 & 0x1F;
                            int var107 = var105 >> 5 & 0x1F;
                            int var108 = var105 & 0x1F;
                            int var109 = (var108 << 3) + (var106 << 19) + (var107 << 11);
                            class170 var110 = class170.method723(var104);
                            if (var110.field2322 != var109) {
                                var110.field2322 = var109;
                                method676(var110);
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 9) {
                            method660(true);
                            field324.method2807();
                            int var111 = field324.method2595();
                            class46.method2990(field324, var111);
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 225) {
                            int var112 = field324.method2598();
                            class18 var113 = (class18) field439.method2199((long) var112);
                            if (var113 != null) {
                                method118(var113, true);
                            }
                            if (field442 != null) {
                                method676(field442);
                                field442 = null;
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 198) {
                            method177();
                            int var114 = field324.method2637();
                            int var115 = field324.method2627();
                            int var116 = field324.method2621();
                            field388[var116] = var114;
                            field456[var116] = var115;
                            field415[var116] = 1;
                            for (int var117 = 0; var117 < 98; var117++) {
                                if (var114 >= class173.field2346[var117]) {
                                    field415[var116] = var117 + 2;
                                }
                            }
                            field468[++field469 - 1 & 0x1F] = var116;
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 254) {
                            int var118 = field324.method2606();
                            int var119 = field324.method2636();
                            class170 var120 = class170.method723(var119);
                            if (var120.field2186 != 2 || var120.field2241 != var118) {
                                var120.field2186 = 2;
                                var120.field2241 = var118;
                                method676(var120);
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 132) {
                            field472 = field463;
                            if (field542 == 0) {
                                field505 = null;
                                field316 = null;
                                Statics.field100 = 0;
                                Statics.field1545 = null;
                                field326 = -1;
                                var1 = true;
                            } else {
                                field316 = field324.method2625();
                                long var121 = field324.method2599();
                                field505 = class206.method2576(var121);
                                Statics.field150 = field324.method2631();
                                int var123 = field324.method2593();
                                if (var123 == 255) {
                                    field326 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field100 = var123;
                                    class25[] var124 = new class25[100];
                                    for (int var125 = 0; var125 < Statics.field100; var125++) {
                                        var124[var125] = new class25();
                                        var124[var125].field269 = field324.method2625();
                                        var124[var125].field278 = class205.method1599(var124[var125].field269, Statics.field1562);
                                        var124[var125].field272 = field324.method2595();
                                        var124[var125].field271 = field324.method2631();
                                        field324.method2625();
                                        if (var124[var125].field269.equals(Statics.field169.field264)) {
                                            Statics.field1743 = var124[var125].field271;
                                        }
                                    }
                                    boolean var126 = false;
                                    int var127 = Statics.field100;
                                    while (var127 > 0) {
                                        boolean var128 = true;
                                        var127--;
                                        for (int var129 = 0; var129 < var127; var129++) {
                                            if (var124[var129].field278.compareTo(var124[var129 + 1].field278) > 0) {
                                                class25 var130 = var124[var129];
                                                var124[var129] = var124[var129 + 1];
                                                var124[var129 + 1] = var130;
                                                var128 = false;
                                            }
                                        }
                                        if (var128) {
                                            break;
                                        }
                                    }
                                    Statics.field1545 = var124;
                                    field326 = -1;
                                    var1 = true;
                                }
                            }
                            break label2940;
                        }
                        if (field326 == 181) {
                            method660(false);
                            field324.method2807();
                            int var131 = field324.method2595();
                            class46.method2990(field324, var131);
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 244) {
                            byte var132 = field324.method2623();
                            int var133 = field324.method2595();
                            class166.field2160[var133] = var132;
                            if (class166.field2159[var133] != var132) {
                                class166.field2159[var133] = var132;
                            }
                            method719(var133);
                            field429[++field459 - 1 & 0x1F] = var133;
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 18) {
                            int var134 = field324.method2606();
                            int var135 = field324.method2610();
                            class166.field2160[var134] = var135;
                            if (class166.field2159[var134] != var135) {
                                class166.field2159[var134] = var135;
                            }
                            method719(var134);
                            field429[++field459 - 1 & 0x1F] = var134;
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 157) {
                            method101(false);
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 96) {
                            field408 = field324.method2593();
                            if (field408 == 1) {
                                field500 = field324.method2595();
                            }
                            if (field408 >= 2 && field408 <= 6) {
                                if (field408 == 2) {
                                    field357 = 64;
                                    field297 = 64;
                                }
                                if (field408 == 3) {
                                    field357 = 0;
                                    field297 = 64;
                                }
                                if (field408 == 4) {
                                    field357 = 128;
                                    field297 = 64;
                                }
                                if (field408 == 5) {
                                    field357 = 64;
                                    field297 = 0;
                                }
                                if (field408 == 6) {
                                    field357 = 64;
                                    field297 = 128;
                                }
                                field408 = 2;
                                field440 = field324.method2595();
                                field550 = field324.method2595();
                                field302 = field324.method2593();
                            }
                            if (field408 == 10) {
                                field322 = field324.method2595();
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 238) {
                            String var136 = field324.method2625();
                            Object[] var137 = new Object[var136.length() + 1];
                            for (int var138 = var136.length() - 1; var138 >= 0; var138--) {
                                if (var136.charAt(var138) == 's') {
                                    var137[var138 + 1] = field324.method2625();
                                } else {
                                    var137[var138 + 1] = Integer.valueOf(field324.method2598());
                                }
                            }
                            var137[0] = Integer.valueOf(field324.method2598());
                            class19 var139 = new class19();
                            var139.field189 = var137;
                            class33.method161(var139, 200000);
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 133) {
                            while (field324.field2098 < field542) {
                                int var140 = field324.method2593();
                                boolean var141 = (var140 & 0x1) == 1;
                                String var142 = field324.method2625();
                                String var143 = field324.method2625();
                                field324.method2625();
                                for (int var144 = 0; var144 < field549; var144++) {
                                    class20 var145 = field330[var144];
                                    if (var141) {
                                        if (var143.equals(var145.field201)) {
                                            var145.field201 = var142;
                                            var145.field204 = var143;
                                            var142 = null;
                                            break;
                                        }
                                    } else if (var142.equals(var145.field201)) {
                                        var145.field201 = var142;
                                        var145.field204 = var143;
                                        var142 = null;
                                        break;
                                    }
                                }
                                if (var142 != null && field549 < 400) {
                                    class20 var146 = new class20();
                                    field330[field549] = var146;
                                    var146.field201 = var142;
                                    var146.field204 = var143;
                                    field549++;
                                }
                            }
                            field417 = field463;
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 142) {
                            int var147 = field324.method2629();
                            int var148 = field324.method2598();
                            class170 var149 = class170.method723(var148);
                            if (var149.field2186 != 1 || var149.field2241 != var147) {
                                var149.field2186 = 1;
                                var149.field2241 = var147;
                                method676(var149);
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 63) {
                            int var150 = field324.method2595();
                            int var151 = field324.method2593();
                            int var152 = field324.method2595();
                            if (field518 != 0 && var151 != 0 && field371 < 50) {
                                field521[field371] = var150;
                                field522[field371] = var151;
                                field523[field371] = var152;
                                field303[field371] = null;
                                field524[field371] = 0;
                                field371++;
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 62) {
                            Statics.field2722 = field324.method2593();
                            Statics.field1730 = field324.method2621();
                            for (int var156 = Statics.field1730; var156 < Statics.field1730 + 8; var156++) {
                                for (int var157 = Statics.field2722; var157 < Statics.field2722 + 8; var157++) {
                                    if (field410[Statics.field1559][var156][var157] != null) {
                                        field410[Statics.field1559][var156][var157] = null;
                                        method185(var156, var157);
                                    }
                                }
                            }
                            for (class26 var158 = (class26) field411.method2237(); var158 != null; var158 = (class26) field411.method2251()) {
                                if (var158.field561 >= Statics.field1730 && var158.field561 < Statics.field1730 + 8 && var158.field563 >= Statics.field2722 && var158.field563 < Statics.field2722 + 8 && Statics.field1559 == var158.field566) {
                                    var158.field571 = 0;
                                }
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 184) {
                            method2829(field324.method2625());
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 20) {
                            method101(true);
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 23) {
                            field512 = field324.method2593();
                            if (field512 == 255) {
                                field512 = 0;
                            }
                            field513 = field324.method2593();
                            if (field513 == 255) {
                                field513 = 0;
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 52) {
                            for (int var159 = 0; var159 < Statics.field2771; var159++) {
                                class188 var160 = (class188) class188.field2773.method2169((long) var159);
                                class188 var161;
                                if (var160 == null) {
                                    byte[] var162 = Statics.field2776.method3044(16, var159);
                                    class188 var163 = new class188();
                                    if (var162 != null) {
                                        var163.method3174(new class154(var162));
                                    }
                                    class188.field2773.method2174(var163, (long) var159);
                                    var161 = var163;
                                } else {
                                    var161 = var160;
                                }
                                if (var161 != null) {
                                    class166.field2160[var159] = 0;
                                    class166.field2159[var159] = 0;
                                }
                            }
                            method177();
                            field459 += 32;
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 21) {
                            String var165 = field324.method2625();
                            long var166 = field324.method2599();
                            long var168 = (long) field324.method2595();
                            long var170 = (long) field324.method2748();
                            class178 var172 = (class178) class149.method1356(class178.method690(), field324.method2593());
                            long var173 = (var168 << 32) + var170;
                            boolean var175 = false;
                            for (int var176 = 0; var176 < 100; var176++) {
                                if (field362[var176] == var173) {
                                    var175 = true;
                                    break;
                                }
                            }
                            if (var172.field2666 && method3004(var165)) {
                                var175 = true;
                            }
                            if (!var175 && field398 == 0) {
                                field362[field313] = var173;
                                field313 = (field313 + 1) % 100;
                                class160 var177 = field324;
                                String var181;
                                try {
                                    int var178 = var177.method2758();
                                    if (var178 > 32767) {
                                        var178 = 32767;
                                    }
                                    byte[] var179 = new byte[var178];
                                    var177.field2098 += Statics.field3118.method2524(var177.field2092, var177.field2098, var179, 0, var178);
                                    String var180 = class204.method609(var179, 0, var178);
                                    var181 = var180;
                                } catch (Exception var441) {
                                    var181 = "Cabbage";
                                }
                                String var184 = class210.method3665(class208.method23(var181));
                                if (var172.field2664 == -1) {
                                    Statics.method765(9, var165, var184, class206.method2563(var166));
                                } else {
                                    Statics.method765(9, class38.method2930(var172.field2664) + var165, var184, class206.method2563(var166));
                                }
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 84) {
                            class46.field899 = 0;
                            for (int var185 = 0; var185 < 2048; var185++) {
                                class46.field898[var185] = null;
                                class46.field911[var185] = 1;
                            }
                            for (int var186 = 0; var186 < 2048; var186++) {
                                field400[var186] = null;
                            }
                            class46.method627(field324);
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 206) {
                            int var187 = field324.method2610();
                            int var188 = field324.method2606();
                            int var189 = field324.method2606();
                            class170 var190 = class170.method723(var187);
                            var190.field2193 = (var189 << 16) + var188;
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 224) {
                            int var191 = field324.method2598();
                            int var192 = field324.method2595();
                            if (var191 < -70000) {
                                var192 += 32768;
                            }
                            class170 var193;
                            if (var191 >= 0) {
                                var193 = class170.method723(var191);
                            } else {
                                var193 = null;
                            }
                            while (field324.field2098 < field542) {
                                int var194 = field324.method2758();
                                int var195 = field324.method2595();
                                int var196 = 0;
                                if (var195 != 0) {
                                    var196 = field324.method2593();
                                    if (var196 == 255) {
                                        var196 = field324.method2598();
                                    }
                                }
                                if (var193 != null && var194 >= 0 && var194 < var193.field2315.length) {
                                    var193.field2315[var194] = var195;
                                    var193.field2316[var194] = var196;
                                }
                                class13.method2929(var192, var194, var195 - 1, var196);
                            }
                            if (var193 != null) {
                                method676(var193);
                            }
                            method177();
                            field466[++field467 - 1 & 0x1F] = var192 & 0x7FFF;
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 105) {
                            int var197 = field324.method2595();
                            class13 var198 = (class13) class13.field115.method2199((long) var197);
                            if (var198 != null) {
                                var198.method2225();
                            }
                            field466[++field467 - 1 & 0x1F] = var197 & 0x7FFF;
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 255) {
                            class160 var199 = field324;
                            int var200 = field542;
                            class227 var201 = new class227();
                            var201.field3228 = var199.method2593();
                            var201.field3222 = var199.method2598();
                            var201.field3225 = new int[var201.field3228];
                            var201.field3223 = new int[var201.field3228];
                            var201.field3220 = new Field[var201.field3228];
                            var201.field3221 = new int[var201.field3228];
                            var201.field3226 = new Method[var201.field3228];
                            var201.field3227 = new byte[var201.field3228][][];
                            for (int var202 = 0; var202 < var201.field3228; var202++) {
                                try {
                                    int var203 = var199.method2593();
                                    if (var203 == 0 || var203 == 1 || var203 == 2) {
                                        String var204 = var199.method2625();
                                        String var205 = var199.method2625();
                                        int var206 = 0;
                                        if (var203 == 1) {
                                            var206 = var199.method2598();
                                        }
                                        var201.field3225[var202] = var203;
                                        var201.field3221[var202] = var206;
                                        if (class228.method720(var204).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        var201.field3220[var202] = class228.method720(var204).getDeclaredField(var205);
                                    } else if (var203 == 3 || var203 == 4) {
                                        String var207 = var199.method2625();
                                        String var208 = var199.method2625();
                                        int var209 = var199.method2593();
                                        String[] var210 = new String[var209];
                                        for (int var211 = 0; var211 < var209; var211++) {
                                            var210[var211] = var199.method2625();
                                        }
                                        String var212 = var199.method2625();
                                        byte[][] var213 = new byte[var209][];
                                        if (var203 == 3) {
                                            for (int var214 = 0; var214 < var209; var214++) {
                                                int var215 = var199.method2598();
                                                var213[var214] = new byte[var215];
                                                var199.method2603(var213[var214], 0, var215);
                                            }
                                        }
                                        var201.field3225[var202] = var203;
                                        Class[] var216 = new Class[var209];
                                        for (int var217 = 0; var217 < var209; var217++) {
                                            var216[var217] = class228.method720(var210[var217]);
                                        }
                                        Class var218 = class228.method720(var212);
                                        if (class228.method720(var207).getClassLoader() == null) {
                                            throw new SecurityException();
                                        }
                                        Method[] var219 = class228.method720(var207).getDeclaredMethods();
                                        Method[] var220 = var219;
                                        for (int var221 = 0; var221 < var220.length; var221++) {
                                            Method var222 = var220[var221];
                                            if (var222.getName().equals(var208)) {
                                                Class[] var223 = var222.getParameterTypes();
                                                if (var216.length == var223.length) {
                                                    boolean var224 = true;
                                                    for (int var225 = 0; var225 < var216.length; var225++) {
                                                        if (var216[var225] != var223[var225]) {
                                                            var224 = false;
                                                            break;
                                                        }
                                                    }
                                                    if (var224 && var218 == var222.getReturnType()) {
                                                        var201.field3226[var202] = var222;
                                                    }
                                                }
                                            }
                                        }
                                        var201.field3227[var202] = var213;
                                    }
                                } catch (ClassNotFoundException var447) {
                                    var201.field3223[var202] = -1;
                                } catch (SecurityException var448) {
                                    var201.field3223[var202] = -2;
                                } catch (NullPointerException var449) {
                                    var201.field3223[var202] = -3;
                                } catch (Exception var450) {
                                    var201.field3223[var202] = -4;
                                } catch (Throwable var451) {
                                    var201.field3223[var202] = -5;
                                }
                            }
                            class228.field3231.method2223(var201);
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 168) {
                            int var231 = field324.method2629();
                            if (var231 == 65535) {
                                var231 = -1;
                            }
                            int var232 = field324.method2636();
                            int var233 = field324.method2610();
                            class170 var234 = class170.method723(var233);
                            if (var234.field2215) {
                                var234.field2317 = var231;
                                var234.field2318 = var232;
                                class199 var236 = class199.method713(var231);
                                var234.field2268 = var236.field2956;
                                var234.field2310 = var236.field2940;
                                var234.field2250 = var236.field2952;
                                var234.field2246 = var236.field2951;
                                var234.field2248 = var236.field2957;
                                var234.field2251 = var236.field2955;
                                if (var236.field2961 == 1) {
                                    var234.field2188 = 1;
                                } else {
                                    var234.field2188 = 2;
                                }
                                if (var234.field2200 > 0) {
                                    var234.field2251 = var234.field2251 * 32 / var234.field2200;
                                } else if (var234.field2208 > 0) {
                                    var234.field2251 = var234.field2251 * 32 / var234.field2208;
                                }
                                method676(var234);
                            } else {
                                if (var231 == -1) {
                                    var234.field2186 = 0;
                                    field326 = -1;
                                    var1 = true;
                                    break label2940;
                                }
                                class199 var235 = class199.method713(var231);
                                var234.field2186 = 4;
                                var234.field2241 = var231;
                                var234.field2268 = var235.field2956;
                                var234.field2310 = var235.field2940;
                                var234.field2251 = var235.field2955 * 100 / var232;
                                method676(var234);
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 101) {
                            int var237 = field324.method2595();
                            field438 = var237;
                            Statics.method743(false);
                            method121(var237);
                            class33.method79(field438);
                            for (int var238 = 0; var238 < 100; var238++) {
                                field483[var238] = true;
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 248) {
                            field514 = field324.method2593();
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 57) {
                            int var239 = field324.method2636();
                            int var240 = field324.method2739();
                            class170 var241 = class170.method723(var239);
                            if (var241.field2244 != var240 || var240 == -1) {
                                var241.field2244 = var240;
                                var241.field2222 = 0;
                                var241.field2320 = 0;
                                method676(var241);
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 58) {
                            int var242 = field324.method2598();
                            int var243 = field324.method2598();
                            if (Statics.field885 == null || !Statics.field885.isValid()) {
                                try {
                                    Iterator var244 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                    while (var244.hasNext()) {
                                        GarbageCollectorMXBean var245 = (GarbageCollectorMXBean) var244.next();
                                        if (var245.isValid()) {
                                            Statics.field885 = var245;
                                            field556 = -1L;
                                            field375 = -1L;
                                        }
                                    }
                                } catch (Throwable var446) {
                                }
                            }
                            long var247 = class156.method1597();
                            int var249 = -1;
                            if (Statics.field885 != null) {
                                long var250 = Statics.field885.getCollectionTime();
                                if (field375 != -1L) {
                                    long var252 = var250 - field375;
                                    long var254 = var247 - field556;
                                    if (var254 != 0L) {
                                        var249 = (int) (var252 * 100L / var254);
                                    }
                                }
                                field375 = var250;
                                field556 = var247;
                            }
                            field395.method2804(205);
                            field395.method2617(field1789);
                            field395.method2634(var242);
                            field395.method2626(var243);
                            field395.method2578(var249);
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 250) {
                            field526 = true;
                            Statics.field974 = field324.method2593();
                            Statics.field59 = field324.method2593();
                            Statics.field2 = field324.method2595();
                            Statics.field1113 = field324.method2593();
                            Statics.field160 = field324.method2593();
                            if (Statics.field160 >= 100) {
                                Statics.field1776 = Statics.field974 * 128 + 64;
                                Statics.field2042 = Statics.field59 * 128 + 64;
                                Statics.field817 = method1105(Statics.field1776, Statics.field2042, Statics.field1559) - Statics.field2;
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 235) {
                            int var256 = field324.method2598();
                            int var257 = field324.method2595();
                            if (var256 < -70000) {
                                var257 += 32768;
                            }
                            class170 var258;
                            if (var256 >= 0) {
                                var258 = class170.method723(var256);
                            } else {
                                var258 = null;
                            }
                            if (var258 != null) {
                                for (int var259 = 0; var259 < var258.field2315.length; var259++) {
                                    var258.field2315[var259] = 0;
                                    var258.field2316[var259] = 0;
                                }
                            }
                            class13.method3206(var257);
                            int var260 = field324.method2595();
                            for (int var261 = 0; var261 < var260; var261++) {
                                int var262 = field324.method2712();
                                int var263 = field324.method2593();
                                if (var263 == 255) {
                                    var263 = field324.method2637();
                                }
                                if (var258 != null && var261 < var258.field2315.length) {
                                    var258.field2315[var261] = var262;
                                    var258.field2316[var261] = var263;
                                }
                                class13.method2929(var257, var261, var262 - 1, var263);
                            }
                            if (var258 != null) {
                                method676(var258);
                            }
                            method177();
                            field466[++field467 - 1 & 0x1F] = var257 & 0x7FFF;
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 45) {
                            for (int var264 = 0; var264 < class166.field2159.length; var264++) {
                                if (class166.field2160[var264] != class166.field2159[var264]) {
                                    class166.field2159[var264] = class166.field2160[var264];
                                    method719(var264);
                                    field429[++field459 - 1 & 0x1F] = var264;
                                }
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 24) {
                            int var265 = field324.method2636();
                            int var266 = field324.method2630();
                            int var267 = field324.method2739();
                            class170 var268 = class170.method723(var265);
                            if (var268.field2239 != var267 || var268.field2207 != var266 || var268.field2202 != 0 || var268.field2196 != 0) {
                                var268.field2239 = var267;
                                var268.field2207 = var266;
                                var268.field2202 = 0;
                                var268.field2196 = 0;
                                method676(var268);
                                method3006(var268);
                                if (var268.field2199 == 0) {
                                    method1787(Statics.field2203[var265 >> 16], var268, false);
                                }
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 69) {
                            String var269 = field324.method2625();
                            class160 var270 = field324;
                            String var274;
                            try {
                                int var271 = var270.method2758();
                                if (var271 > 32767) {
                                    var271 = 32767;
                                }
                                byte[] var272 = new byte[var271];
                                var270.field2098 += Statics.field3118.method2524(var270.field2092, var270.field2098, var272, 0, var271);
                                String var273 = class204.method609(var272, 0, var271);
                                var274 = var273;
                            } catch (Exception var440) {
                                var274 = "Cabbage";
                            }
                            String var277 = class210.method3665(class208.method23(var274));
                            class48.method1829(6, var269, var277);
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 215) {
                            boolean var278 = field324.method2593() == 1;
                            if (var278) {
                                Statics.field159 = class156.method1597() - field324.method2599();
                                Statics.field2185 = new class2(field324, true);
                            } else {
                                Statics.field2185 = null;
                            }
                            field474 = field463;
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 27) {
                            field526 = true;
                            Statics.field2087 = field324.method2593();
                            Statics.field250 = field324.method2593();
                            Statics.field1648 = field324.method2595();
                            Statics.field1188 = field324.method2593();
                            Statics.field219 = field324.method2593();
                            if (Statics.field219 >= 100) {
                                int var279 = Statics.field2087 * 128 + 64;
                                int var280 = Statics.field250 * 128 + 64;
                                int var281 = method1105(var279, var280, Statics.field1559) - Statics.field1648;
                                int var282 = var279 - Statics.field1776;
                                int var283 = var281 - Statics.field817;
                                int var284 = var280 - Statics.field2042;
                                int var285 = (int) Math.sqrt((double) (var282 * var282 + var284 * var284));
                                Statics.field142 = (int) (Math.atan2((double) var283, (double) var285) * 325.949D) & 0x7FF;
                                Statics.field681 = (int) (Math.atan2((double) var282, (double) var284) * -325.949D) & 0x7FF;
                                if (Statics.field142 < 128) {
                                    Statics.field142 = 128;
                                }
                                if (Statics.field142 > 383) {
                                    Statics.field142 = 383;
                                }
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 234) {
                            field496 = field324.method2593();
                            field515 = field324.method2593();
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 106) {
                            int var286 = field324.method2636();
                            class170 var287 = class170.method723(var286);
                            for (int var288 = 0; var288 < var287.field2315.length; var288++) {
                                var287.field2315[var288] = -1;
                                var287.field2315[var288] = 0;
                            }
                            method676(var287);
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 43) {
                            int var289 = field324.method2637();
                            class170 var290 = class170.method723(var289);
                            var290.field2186 = 3;
                            var290.field2241 = Statics.field169.field240.method2895();
                            method676(var290);
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 70) {
                            while (field324.field2098 < field542) {
                                boolean var291 = field324.method2593() == 1;
                                String var292 = field324.method2625();
                                String var293 = field324.method2625();
                                int var294 = field324.method2595();
                                int var295 = field324.method2593();
                                int var296 = field324.method2593();
                                boolean var297 = (var296 & 0x2) != 0;
                                boolean var298 = (var296 & 0x1) != 0;
                                if (var294 > 0) {
                                    field324.method2625();
                                    field324.method2593();
                                    field324.method2598();
                                }
                                field324.method2625();
                                for (int var299 = 0; var299 < field545; var299++) {
                                    class15 var300 = field383[var299];
                                    if (var291) {
                                        if (var293.equals(var300.field144)) {
                                            var300.field144 = var292;
                                            var300.field145 = var293;
                                            var292 = null;
                                            break;
                                        }
                                    } else if (var292.equals(var300.field144)) {
                                        if (var300.field146 != var294) {
                                            boolean var301 = true;
                                            for (class17 var302 = (class17) field548.method2271(); var302 != null; var302 = (class17) field548.method2273()) {
                                                if (var302.field170.equals(var292)) {
                                                    if (var294 != 0 && var302.field171 == 0) {
                                                        var302.method2276();
                                                        var301 = false;
                                                    } else if (var294 == 0 && var302.field171 != 0) {
                                                        var302.method2276();
                                                        var301 = false;
                                                    }
                                                }
                                            }
                                            if (var301) {
                                                field548.method2269(new class17(var292, var294));
                                            }
                                            var300.field146 = var294;
                                        }
                                        var300.field145 = var293;
                                        var300.field148 = var295;
                                        var300.field147 = var297;
                                        var300.field149 = var298;
                                        var292 = null;
                                        break;
                                    }
                                }
                                if (var292 != null && field545 < 400) {
                                    class15 var303 = new class15();
                                    field383[field545] = var303;
                                    var303.field144 = var292;
                                    var303.field145 = var293;
                                    var303.field146 = var294;
                                    var303.field148 = var295;
                                    var303.field147 = var297;
                                    var303.field149 = var298;
                                    field545++;
                                }
                            }
                            field546 = 2;
                            field417 = field463;
                            boolean var304 = false;
                            int var305 = field545;
                            while (var305 > 0) {
                                boolean var306 = true;
                                var305--;
                                for (int var307 = 0; var307 < var305; var307++) {
                                    boolean var308 = false;
                                    class15 var309 = field383[var307];
                                    class15 var310 = field383[var307 + 1];
                                    if (field280 != var309.field146 && field280 == var310.field146) {
                                        var308 = true;
                                    }
                                    if (!var308 && var309.field146 == 0 && var310.field146 != 0) {
                                        var308 = true;
                                    }
                                    if (!var308 && !var309.field147 && var310.field147) {
                                        var308 = true;
                                    }
                                    if (!var308 && !var309.field149 && var310.field149) {
                                        var308 = true;
                                    }
                                    if (var308) {
                                        class15 var311 = field383[var307];
                                        field383[var307] = field383[var307 + 1];
                                        field383[var307 + 1] = var311;
                                        var306 = false;
                                    }
                                }
                                if (var306) {
                                    break;
                                }
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 134) {
                            field526 = false;
                            for (int var312 = 0; var312 < 5; var312++) {
                                field444[var312] = false;
                            }
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        if (field326 == 153) {
                            Statics.field2722 = field324.method2621();
                            Statics.field1730 = field324.method2627();
                            field326 = -1;
                            var1 = true;
                            break label2940;
                        }
                        class102.method1103("" + field326 + class38.field776 + field401 + class38.field776 + field331 + class38.field776 + field542, (Throwable) null);
                        method1797();
                    } catch (IOException var452) {
                        if (field332 > 0) {
                            method1797();
                        } else {
                            method3704(40);
                            Statics.field497 = Statics.field153;
                            Statics.field153 = null;
                        }
                    } catch (Exception var453) {
                        String var315 = "" + field326 + class38.field776 + field401 + class38.field776 + field331 + class38.field776 + field542 + class38.field776 + (Statics.field878 + Statics.field169.field636[0]) + class38.field776 + (Statics.field33 + Statics.field169.field630[0]) + class38.field776;
                        for (int var316 = 0; var316 < field542 && var316 < 50; var316++) {
                            var315 = var315 + field324.field2092[var316] + class38.field776;
                        }
                        class102.method1103(var315, var453);
                        method1797();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field287 != 30) {
            return;
        }
        while (true) {
            class227 var317 = (class227) class228.field3231.method2206();
            boolean var318;
            if (var317 == null) {
                var318 = false;
            } else {
                var318 = true;
            }
            if (!var318) {
                Object var320 = Statics.field902.field215;
                synchronized (Statics.field902.field215) {
                    if (!field376) {
                        Statics.field902.field211 = 0;
                    } else if (class116.field1814 != 0 || Statics.field902.field211 >= 40) {
                        field395.method2804(88);
                        field395.method2578(0);
                        int var321 = field395.field2098;
                        int var322 = 0;
                        for (int var323 = 0; var323 < Statics.field902.field211 && field395.field2098 - var321 < 240; var323++) {
                            var322++;
                            int var324 = Statics.field902.field213[var323];
                            if (var324 < 0) {
                                var324 = 0;
                            } else if (var324 > 502) {
                                var324 = 502;
                            }
                            int var325 = Statics.field902.field212[var323];
                            if (var325 < 0) {
                                var325 = 0;
                            } else if (var325 > 764) {
                                var325 = 764;
                            }
                            int var326 = var324 * 765 + var325;
                            if (Statics.field902.field213[var323] == -1 && Statics.field902.field212[var323] == -1) {
                                var325 = -1;
                                var324 = -1;
                                var326 = 524287;
                            }
                            if (field291 != var325 || field292 != var324) {
                                int var327 = var325 - field291;
                                field291 = var325;
                                int var328 = var324 - field292;
                                field292 = var324;
                                if (field293 < 8 && var327 >= -32 && var327 <= 31 && var328 >= -32 && var328 <= 31) {
                                    var327 += 32;
                                    var328 += 32;
                                    field395.method2616((field293 << 12) + (var327 << 6) + var328);
                                    field293 = 0;
                                } else if (field293 < 8) {
                                    field395.method2580((field293 << 19) + 8388608 + var326);
                                    field293 = 0;
                                } else {
                                    field395.method2581((field293 << 19) + -1073741824 + var326);
                                    field293 = 0;
                                }
                            } else if (field293 < 2047) {
                                field293++;
                            }
                        }
                        field395.method2590(field395.field2098 - var321);
                        if (var322 >= Statics.field902.field211) {
                            Statics.field902.field211 = 0;
                        } else {
                            Statics.field902.field211 -= var322;
                            for (int var329 = 0; var329 < Statics.field902.field211; var329++) {
                                Statics.field902.field212[var329] = Statics.field902.field212[var322 + var329];
                                Statics.field902.field213[var329] = Statics.field902.field213[var322 + var329];
                            }
                        }
                    }
                }
                if (class116.field1814 == 1 || !Statics.field938 && class116.field1814 == 4 || class116.field1814 == 2) {
                    long var331 = (class116.field1800 - field290) / 50L;
                    if (var331 > 4095L) {
                        var331 = 4095L;
                    }
                    field290 = class116.field1800;
                    int var333 = class116.field1813;
                    if (var333 < 0) {
                        var333 = 0;
                    } else if (var333 > Statics.field2777) {
                        var333 = Statics.field2777;
                    }
                    int var334 = class116.field1812;
                    if (var334 < 0) {
                        var334 = 0;
                    } else if (var334 > Statics.field578) {
                        var334 = Statics.field578;
                    }
                    int var335 = (int) var331;
                    field395.method2804(110);
                    field395.method2616((class116.field1814 == 2 ? 1 : 0) + (var335 << 1));
                    field395.method2616(var334);
                    field395.method2616(var333);
                }
                if (class106.field1716 > 0) {
                    field395.method2804(72);
                    field395.method2616(0);
                    int var336 = field395.field2098;
                    long var337 = class156.method1597();
                    for (int var339 = 0; var339 < class106.field1716; var339++) {
                        long var340 = var337 - field504;
                        if (var340 > 16777215L) {
                            var340 = 16777215L;
                        }
                        field504 = var337;
                        field395.method2661((int) var340);
                        field395.method2578(class106.field1715[var339]);
                    }
                    field395.method2589(field395.field2098 - var336);
                }
                if (field370 > 0) {
                    field370--;
                }
                if (class106.field1709[96] || class106.field1709[97] || class106.field1709[98] || class106.field1709[99]) {
                    field436 = true;
                }
                if (field436 && field370 <= 0) {
                    field370 = 20;
                    field436 = false;
                    field395.method2804(175);
                    field395.method2649(field364);
                    field395.method2616(field384);
                }
                if (Statics.field2669 && !field294) {
                    field294 = true;
                    field395.method2804(41);
                    field395.method2578(1);
                }
                if (!Statics.field2669 && field294) {
                    field294 = false;
                    field395.method2804(41);
                    field395.method2578(0);
                }
                if (Statics.field1559 != field507) {
                    field507 = Statics.field1559;
                    method2824(Statics.field1559);
                }
                if (field287 != 30) {
                    return;
                }
                for (class26 var342 = (class26) field411.method2237(); var342 != null; var342 = (class26) field411.method2251()) {
                    if (var342.field571 > 0) {
                        var342.field571--;
                    }
                    if (var342.field571 != 0) {
                        if (var342.field570 > 0) {
                            var342.field570--;
                        }
                        if (var342.field570 == 0 && var342.field561 >= 1 && var342.field563 >= 1 && var342.field561 <= 102 && var342.field563 <= 102 && (var342.field573 < 0 || class11.method208(var342.field573, var342.field569))) {
                            method1884(var342.field566, var342.field560, var342.field561, var342.field563, var342.field573, var342.field568, var342.field569);
                            var342.field570 = -1;
                            if (var342.field573 == var342.field564 && var342.field564 == -1) {
                                var342.method2225();
                            } else if (var342.field573 == var342.field564 && var342.field568 == var342.field565 && var342.field572 == var342.field569) {
                                var342.method2225();
                            }
                        }
                    } else if (var342.field564 < 0 || class11.method208(var342.field564, var342.field572)) {
                        method1884(var342.field566, var342.field560, var342.field561, var342.field563, var342.field564, var342.field565, var342.field572);
                        var342.method2225();
                    }
                }
                int var10002;
                for (int var343 = 0; var343 < field371; var343++) {
                    var10002 = field523[var343]--;
                    if (field523[var343] >= -10) {
                        class54 var345 = field303[var343];
                        if (var345 == null) {
                            class54 var454 = (class54) null;
                            var345 = class54.method929(Statics.field2045, field521[var343], 0);
                            if (var345 == null) {
                                continue;
                            }
                            field523[var343] += var345.method925();
                            field303[var343] = var345;
                        }
                        if (field523[var343] < 0) {
                            int var352;
                            if (field524[var343] == 0) {
                                var352 = field518;
                            } else {
                                int var346 = (field524[var343] & 0xFF) * 128;
                                int var347 = field524[var343] >> 16 & 0xFF;
                                int var348 = var347 * 128 + 64 - Statics.field169.field622;
                                if (var348 < 0) {
                                    var348 = -var348;
                                }
                                int var349 = field524[var343] >> 8 & 0xFF;
                                int var350 = var349 * 128 + 64 - Statics.field169.field639;
                                if (var350 < 0) {
                                    var350 = -var350;
                                }
                                int var351 = var348 + var350 - 128;
                                if (var351 > var346) {
                                    field523[var343] = -100;
                                    continue;
                                }
                                if (var351 < 0) {
                                    var351 = 0;
                                }
                                var352 = field519 * (var346 - var351) / var346;
                            }
                            if (var352 > 0) {
                                class56 var353 = var345.method927().method967(Statics.field2770);
                                class67 var354 = class67.method1152(var353, 100, var352);
                                var354.method1113(field522[var343] - 1);
                                Statics.field754.method870(var354);
                            }
                            field523[var343] = -100;
                        }
                    } else {
                        field371--;
                        for (int var344 = var343; var344 < field371; var344++) {
                            field521[var344] = field521[var344 + 1];
                            field303[var344] = field303[var344 + 1];
                            field522[var344] = field522[var344 + 1];
                            field523[var344] = field523[var344 + 1];
                            field524[var344] = field524[var344 + 1];
                        }
                        var343--;
                    }
                }
                if (field517) {
                    boolean var355;
                    if (class139.field1922 == 0) {
                        var355 = Statics.field1921.method2396();
                    } else {
                        var355 = true;
                    }
                    if (!var355) {
                        if (field537 != 0 && field516 != -1) {
                            class139.method852(Statics.field3229, field516, 0, field537, false);
                        }
                        field517 = false;
                    }
                }
                field327++;
                if (field327 > 750) {
                    if (field332 > 0) {
                        method1797();
                    } else {
                        method3704(40);
                        Statics.field497 = Statics.field153;
                        Statics.field153 = null;
                    }
                    return;
                }
                method191();
                method1344();
                int[] var356 = class46.field896;
                for (int var357 = 0; var357 < class46.field899; var357++) {
                    class24 var358 = field400[var356[var357]];
                    if (var358 != null && var358.field609 > 0) {
                        var358.field609--;
                        if (var358.field609 == 0) {
                            var358.field606 = null;
                        }
                    }
                }
                for (int var359 = 0; var359 < field317; var359++) {
                    int var360 = field420[var359];
                    class36 var361 = field285[var360];
                    if (var361 != null && var361.field609 > 0) {
                        var361.field609--;
                        if (var361.field609 == 0) {
                            var361.field606 = null;
                        }
                    }
                }
                field355++;
                if (field372 != 0) {
                    field389 += 20;
                    if (field389 >= 400) {
                        field372 = 0;
                    }
                }
                if (Statics.field1064 != null) {
                    field391++;
                    if (field391 >= 15) {
                        method676(Statics.field1064);
                        Statics.field1064 = null;
                    }
                }
                class170 var362 = Statics.field168;
                class170 var363 = Statics.field202;
                Statics.field168 = null;
                Statics.field202 = null;
                field455 = null;
                field449 = false;
                field338 = false;
                field501 = 0;
                while (class106.method1094() && field501 < 128) {
                    if (field328 >= 2 && class106.field1709[82] && Statics.field1745 == 66) {
                        String var364 = class48.method1788();
                        Statics.field166.setContents(new StringSelection(var364), (ClipboardOwner) null);
                    } else {
                        field448[field501] = Statics.field1745;
                        field502[field501] = Statics.field1425;
                        field501++;
                    }
                }
                if (field438 != -1) {
                    int var365 = field438;
                    int var366 = Statics.field578;
                    int var367 = Statics.field2777;
                    if (class170.method1843(var365)) {
                        method595(Statics.field2203[var365], -1, 0, 0, var366, var367, 0, 0);
                    }
                }
                field463++;
                while (true) {
                    class19 var368;
                    class170 var369;
                    class170 var370;
                    do {
                        var368 = (class19) field379.method2247();
                        if (var368 == null) {
                            while (true) {
                                class19 var371;
                                class170 var372;
                                class170 var373;
                                do {
                                    var371 = (class19) field479.method2247();
                                    if (var371 == null) {
                                        while (true) {
                                            class19 var374;
                                            class170 var375;
                                            class170 var376;
                                            do {
                                                var374 = (class19) field477.method2247();
                                                if (var374 == null) {
                                                    boolean var377 = false;
                                                    while (!var377) {
                                                        var377 = true;
                                                        for (int var378 = 0; var378 < field460 - 1; var378++) {
                                                            if (field422[var378] < 1000 && field422[var378 + 1] > 1000) {
                                                                String var379 = field454[var378];
                                                                field454[var378] = field454[var378 + 1];
                                                                field454[var378 + 1] = var379;
                                                                String var380 = field424[var378];
                                                                field424[var378] = field424[var378 + 1];
                                                                field424[var378 + 1] = var380;
                                                                int var381 = field422[var378];
                                                                field422[var378] = field422[var378 + 1];
                                                                field422[var378 + 1] = var381;
                                                                int var382 = field510[var378];
                                                                field510[var378] = field510[var378 + 1];
                                                                field510[var378 + 1] = var382;
                                                                int var383 = field547[var378];
                                                                field547[var378] = field547[var378 + 1];
                                                                field547[var378 + 1] = var383;
                                                                int var384 = field423[var378];
                                                                field423[var378] = field423[var378 + 1];
                                                                field423[var378 + 1] = var384;
                                                                var377 = false;
                                                            }
                                                        }
                                                    }
                                                    if (Statics.field752 == null && field369 == null) {
                                                        int var385 = class116.field1814;
                                                        if (field416) {
                                                            if (var385 != 1 && (Statics.field938 || var385 != 4)) {
                                                                int var386 = class116.field1806;
                                                                int var387 = class116.field1815 * -693183961;
                                                                if (var386 < Statics.field2743 - 10 || var386 > Statics.field275 + Statics.field2743 + 10 || var387 < Statics.field1678 - 10 || var387 > Statics.field2640 + Statics.field1678 + 10) {
                                                                    field416 = false;
                                                                    method704(Statics.field2743, Statics.field1678, Statics.field275, Statics.field2640);
                                                                }
                                                            }
                                                            if (var385 == 1 || !Statics.field938 && var385 == 4) {
                                                                int var388 = Statics.field2743;
                                                                int var389 = Statics.field1678;
                                                                int var390 = Statics.field275;
                                                                int var391 = class116.field1812;
                                                                int var392 = class116.field1813;
                                                                int var393 = -1;
                                                                for (int var394 = 0; var394 < field460; var394++) {
                                                                    int var395 = (field460 - 1 - var394) * 15 + var389 + 31;
                                                                    if (var391 > var388 && var391 < var388 + var390 && var392 > var395 - 13 && var392 < var395 + 3) {
                                                                        var393 = var394;
                                                                    }
                                                                }
                                                                if (var393 != -1) {
                                                                    method178(var393);
                                                                }
                                                                field416 = false;
                                                                method704(Statics.field2743, Statics.field1678, Statics.field275, Statics.field2640);
                                                            }
                                                        } else {
                                                            label3054: {
                                                                int var397;
                                                                int var398;
                                                                label3165: {
                                                                    if ((var385 == 1 || !Statics.field938 && var385 == 4) && field460 > 0) {
                                                                        int var396 = field422[field460 - 1];
                                                                        if (var396 == 39 || var396 == 40 || var396 == 41 || var396 == 42 || var396 == 43 || var396 == 33 || var396 == 34 || var396 == 35 || var396 == 36 || var396 == 37 || var396 == 38 || var396 == 1005) {
                                                                            var397 = field510[field460 - 1];
                                                                            var398 = field547[field460 - 1];
                                                                            class170 var399 = class170.method723(var398);
                                                                            int var400 = method711(var399);
                                                                            boolean var401 = (var400 >> 28 & 0x1) != 0;
                                                                            if (var401) {
                                                                                break label3165;
                                                                            }
                                                                            class171 var455 = (class171) null;
                                                                            if (class171.method2920(method711(var399))) {
                                                                                break label3165;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (var385 == 1 || !Statics.field938 && var385 == 4) {
                                                                        label3158: {
                                                                            if (field385 != 1 || field460 <= 2) {
                                                                                int var406 = field460 - 1;
                                                                                boolean var407;
                                                                                if (var406 < 0) {
                                                                                    var407 = false;
                                                                                } else {
                                                                                    int var408 = field422[var406];
                                                                                    if (var408 >= 2000) {
                                                                                        var408 -= 2000;
                                                                                    }
                                                                                    if (var408 == 1007) {
                                                                                        var407 = true;
                                                                                    } else {
                                                                                        var407 = false;
                                                                                    }
                                                                                }
                                                                                if (!var407) {
                                                                                    break label3158;
                                                                                }
                                                                            }
                                                                            var385 = 2;
                                                                        }
                                                                    }
                                                                    if ((var385 == 1 || !Statics.field938 && var385 == 4) && field460 > 0) {
                                                                        method178(field460 - 1);
                                                                    }
                                                                    if (var385 == 2 && field460 > 0) {
                                                                        method3216(class116.field1812, class116.field1813);
                                                                    }
                                                                    break label3054;
                                                                }
                                                                if (Statics.field752 != null && !field397 && field385 != 1) {
                                                                    int var402 = field460 - 1;
                                                                    boolean var403;
                                                                    if (var402 < 0) {
                                                                        var403 = false;
                                                                    } else {
                                                                        int var404 = field422[var402];
                                                                        if (var404 >= 2000) {
                                                                            var404 -= 2000;
                                                                        }
                                                                        if (var404 == 1007) {
                                                                            var403 = true;
                                                                        } else {
                                                                            var403 = false;
                                                                        }
                                                                    }
                                                                    if (!var403 && field460 > 0) {
                                                                        method424(field394, field527);
                                                                    }
                                                                }
                                                                field397 = false;
                                                                field321 = 0;
                                                                if (Statics.field752 != null) {
                                                                    method676(Statics.field752);
                                                                }
                                                                Statics.field752 = class170.method723(var398);
                                                                field393 = var397;
                                                                field394 = class116.field1812;
                                                                field527 = class116.field1813;
                                                                if (field460 > 0) {
                                                                    int var405 = field460 - 1;
                                                                    Statics.field165 = new class39();
                                                                    Statics.field165.field795 = field510[var405];
                                                                    Statics.field165.field792 = field547[var405];
                                                                    Statics.field165.field791 = field422[var405];
                                                                    Statics.field165.field794 = field423[var405];
                                                                    Statics.field165.field797 = field424[var405];
                                                                }
                                                                method676(Statics.field752);
                                                            }
                                                        }
                                                    }
                                                    if (field369 != null) {
                                                        method576();
                                                    }
                                                    if (Statics.field752 != null) {
                                                        method676(Statics.field752);
                                                        field321++;
                                                        if (class116.field1805 == 0) {
                                                            if (!field397) {
                                                                label3106: {
                                                                    label2070: {
                                                                        if (field385 != 1) {
                                                                            int var415 = field460 - 1;
                                                                            boolean var416;
                                                                            if (var415 < 0) {
                                                                                var416 = false;
                                                                            } else {
                                                                                int var417 = field422[var415];
                                                                                if (var417 >= 2000) {
                                                                                    var417 -= 2000;
                                                                                }
                                                                                if (var417 == 1007) {
                                                                                    var416 = true;
                                                                                } else {
                                                                                    var416 = false;
                                                                                }
                                                                            }
                                                                            if (!var416) {
                                                                                break label2070;
                                                                            }
                                                                        }
                                                                        if (field460 > 2) {
                                                                            method3216(field394, field527);
                                                                            break label3106;
                                                                        }
                                                                    }
                                                                    if (field460 > 0) {
                                                                        method424(field394, field527);
                                                                    }
                                                                }
                                                            } else if (Statics.field803 == Statics.field752 && field396 != field393) {
                                                                class170 var409 = Statics.field752;
                                                                byte var410 = 0;
                                                                if (field441 == 1 && var409.field2201 == 206) {
                                                                    var410 = 1;
                                                                }
                                                                if (var409.field2315[field396] <= 0) {
                                                                    var410 = 0;
                                                                }
                                                                if (class171.method2920(method711(var409))) {
                                                                    int var411 = field393;
                                                                    int var412 = field396;
                                                                    var409.field2315[var412] = var409.field2315[var411];
                                                                    var409.field2316[var412] = var409.field2316[var411];
                                                                    var409.field2315[var411] = -1;
                                                                    var409.field2316[var411] = 0;
                                                                } else if (var410 == 1) {
                                                                    int var413 = field393;
                                                                    int var414 = field396;
                                                                    while (var413 != var414) {
                                                                        if (var413 > var414) {
                                                                            var409.method2973(var413 - 1, var413);
                                                                            var413--;
                                                                        } else if (var413 < var414) {
                                                                            var409.method2973(var413 + 1, var413);
                                                                            var413++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var409.method2973(field396, field393);
                                                                }
                                                                field395.method2804(54);
                                                                field395.method2581(Statics.field752.field2237);
                                                                field395.method2578(var410);
                                                                field395.method2683(field393);
                                                                field395.method2649(field396);
                                                            }
                                                            field391 = 10;
                                                            class116.field1814 = 0;
                                                            Statics.field752 = null;
                                                        } else if (field321 >= 5 && (class116.field1806 > field394 + 5 || class116.field1806 < field394 - 5 || class116.field1815 * -693183961 > field527 + 5 || class116.field1815 * -693183961 < field527 - 5)) {
                                                            field397 = true;
                                                        }
                                                    }
                                                    if (class88.method1620()) {
                                                        int var418 = class88.field1506;
                                                        int var419 = class88.field1492;
                                                        field395.method2804(237);
                                                        field395.method2578(5);
                                                        field395.method2618(class106.field1709[82] ? (class106.field1709[81] ? 2 : 1) : 0);
                                                        field395.method2683(Statics.field33 + var419);
                                                        field395.method2683(Statics.field878 + var418);
                                                        class88.method1641();
                                                        field421 = class116.field1812;
                                                        field465 = class116.field1813;
                                                        field372 = 1;
                                                        field389 = 0;
                                                        field512 = var418;
                                                        field513 = var419;
                                                    }
                                                    if (Statics.field168 != var362) {
                                                        if (var362 != null) {
                                                            method676(var362);
                                                        }
                                                        if (Statics.field168 != null) {
                                                            method676(Statics.field168);
                                                        }
                                                    }
                                                    if (Statics.field202 != var363 && field508 == field428) {
                                                        if (var363 != null) {
                                                            method676(var363);
                                                        }
                                                        if (Statics.field202 != null) {
                                                            method676(Statics.field202);
                                                        }
                                                    }
                                                    if (Statics.field202 == null) {
                                                        if (field428 > 0) {
                                                            field428--;
                                                        }
                                                    } else if (field428 < field508) {
                                                        field428++;
                                                        if (field508 == field428) {
                                                            method676(Statics.field202);
                                                        }
                                                    }
                                                    int var420 = field363 + Statics.field169.field622;
                                                    int var421 = field345 + Statics.field169.field639;
                                                    if (Statics.field892 - var420 < -500 || Statics.field892 - var420 > 500 || Statics.field123 - var421 < -500 || Statics.field123 - var421 > 500) {
                                                        Statics.field892 = var420;
                                                        Statics.field123 = var421;
                                                    }
                                                    if (Statics.field892 != var420) {
                                                        Statics.field892 += (var420 - Statics.field892) / 16;
                                                    }
                                                    if (Statics.field123 != var421) {
                                                        Statics.field123 += (var421 - Statics.field123) / 16;
                                                    }
                                                    if (class116.field1805 == 4 && Statics.field938) {
                                                        int var422 = class116.field1815 * -693183961 - field368;
                                                        field366 = var422 * 2;
                                                        field368 = var422 == -1 || var422 == 1 ? class116.field1815 * -693183961 : (field368 + class116.field1815 * -693183961) / 2;
                                                        int var423 = field367 - class116.field1806;
                                                        field365 = var423 * 2;
                                                        field367 = var423 == -1 || var423 == 1 ? class116.field1806 : (field367 + class116.field1806) / 2;
                                                    } else {
                                                        if (class106.field1709[96]) {
                                                            field365 += (-24 - field365) / 2;
                                                        } else if (class106.field1709[97]) {
                                                            field365 += (24 - field365) / 2;
                                                        } else {
                                                            field365 /= 2;
                                                        }
                                                        if (class106.field1709[98]) {
                                                            field366 += (12 - field366) / 2;
                                                        } else if (class106.field1709[99]) {
                                                            field366 += (-12 - field366) / 2;
                                                        } else {
                                                            field366 /= 2;
                                                        }
                                                        field368 = class116.field1815 * -693183961;
                                                        field367 = class116.field1806;
                                                    }
                                                    field364 = field365 / 2 + field364 & 0x7FF;
                                                    field384 += field366 / 2;
                                                    if (field384 < 128) {
                                                        field384 = 128;
                                                    }
                                                    if (field384 > 383) {
                                                        field384 = 383;
                                                    }
                                                    int var424 = Statics.field892 >> 7;
                                                    int var425 = Statics.field123 >> 7;
                                                    int var426 = method1105(Statics.field892, Statics.field123, Statics.field1559);
                                                    int var427 = 0;
                                                    if (var424 > 3 && var425 > 3 && var424 < 100 && var425 < 100) {
                                                        for (int var428 = var424 - 4; var428 <= var424 + 4; var428++) {
                                                            for (int var429 = var425 - 4; var429 <= var425 + 4; var429++) {
                                                                int var430 = Statics.field1559;
                                                                if (var430 < 3 && (class11.field87[1][var428][var429] & 0x2) == 2) {
                                                                    var430++;
                                                                }
                                                                int var431 = var426 - class11.field94[var430][var428][var429];
                                                                if (var431 > var427) {
                                                                    var427 = var431;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int var432 = var427 * 192;
                                                    if (var432 > 98048) {
                                                        var432 = 98048;
                                                    }
                                                    if (var432 < 32768) {
                                                        var432 = 32768;
                                                    }
                                                    if (var432 > field520) {
                                                        field520 += (var432 - field520) / 24;
                                                    } else if (var432 < field520) {
                                                        field520 += (var432 - field520) / 80;
                                                    }
                                                    if (field526) {
                                                        method60();
                                                    }
                                                    for (int var433 = 0; var433 < 5; var433++) {
                                                        var10002 = field531[var433]++;
                                                    }
                                                    Statics.field1350.method808();
                                                    int var434 = class116.method994();
                                                    int var435 = class106.method573();
                                                    if (var434 > 15000 && var435 > 15000) {
                                                        field332 = 250;
                                                        class116.field1801 = 14500;
                                                        field395.method2804(55);
                                                    }
                                                    field464++;
                                                    if (field464 > 500) {
                                                        field464 = 0;
                                                        int var436 = (int) (Math.random() * 8.0D);
                                                        if ((var436 & 0x1) == 1) {
                                                            field363 += field300;
                                                        }
                                                        if ((var436 & 0x2) == 2) {
                                                            field345 += field418;
                                                        }
                                                        if ((var436 & 0x4) == 4) {
                                                            field347 += field348;
                                                        }
                                                    }
                                                    if (field363 < -50) {
                                                        field300 = 2;
                                                    }
                                                    if (field363 > 50) {
                                                        field300 = -2;
                                                    }
                                                    if (field345 < -55) {
                                                        field418 = 2;
                                                    }
                                                    if (field345 > 55) {
                                                        field418 = -2;
                                                    }
                                                    if (field347 < -40) {
                                                        field348 = 1;
                                                    }
                                                    if (field347 > 40) {
                                                        field348 = -1;
                                                    }
                                                    field282++;
                                                    if (field282 > 500) {
                                                        field282 = 0;
                                                        int var437 = (int) (Math.random() * 8.0D);
                                                        if ((var437 & 0x1) == 1) {
                                                            field295 += field351;
                                                        }
                                                        if ((var437 & 0x2) == 2) {
                                                            field352 += field353;
                                                        }
                                                    }
                                                    if (field295 < -60) {
                                                        field351 = 2;
                                                    }
                                                    if (field295 > 60) {
                                                        field351 = -2;
                                                    }
                                                    if (field352 < -20) {
                                                        field353 = 1;
                                                    }
                                                    if (field352 > 10) {
                                                        field353 = -1;
                                                    }
                                                    for (class17 var438 = (class17) field548.method2271(); var438 != null; var438 = (class17) field548.method2273()) {
                                                        if ((long) var438.field174 < class156.method1597() / 1000L - 5L) {
                                                            if (var438.field171 > 0) {
                                                                class48.method1829(5, "", var438.field170 + class174.field2497);
                                                            }
                                                            if (var438.field171 == 0) {
                                                                class48.method1829(5, "", var438.field170 + class174.field2498);
                                                            }
                                                            var438.method2276();
                                                        }
                                                    }
                                                    field349++;
                                                    if (field349 > 50) {
                                                        field395.method2804(249);
                                                    }
                                                    try {
                                                        if (Statics.field153 != null && field395.field2098 > 0) {
                                                            Statics.field153.method1935(field395.field2092, 0, field395.field2098);
                                                            field395.field2098 = 0;
                                                            field349 = 0;
                                                        }
                                                    } catch (IOException var444) {
                                                        if (field332 > 0) {
                                                            method1797();
                                                        } else {
                                                            method3704(40);
                                                            Statics.field497 = Statics.field153;
                                                            Statics.field153 = null;
                                                        }
                                                    }
                                                    return;
                                                }
                                                var375 = var374.field181;
                                                if (var375.field2198 < 0) {
                                                    break;
                                                }
                                                var376 = class170.method723(var375.field2216);
                                            } while (var376 == null || var376.field2321 == null || var375.field2198 >= var376.field2321.length || var376.field2321[var375.field2198] != var375);
                                            class33.method161(var374, 200000);
                                        }
                                    }
                                    var372 = var371.field181;
                                    if (var372.field2198 < 0) {
                                        break;
                                    }
                                    var373 = class170.method723(var372.field2216);
                                } while (var373 == null || var373.field2321 == null || var372.field2198 >= var373.field2321.length || var373.field2321[var372.field2198] != var372);
                                class33.method161(var371, 200000);
                            }
                        }
                        var369 = var368.field181;
                        if (var369.field2198 < 0) {
                            break;
                        }
                        var370 = class170.method723(var369.field2216);
                    } while (var370 == null || var370.field2321 == null || var369.field2198 >= var370.field2321.length || var370.field2321[var369.field2198] != var369);
                    class33.method161(var368, 200000);
                }
            }
            field395.method2804(177);
            field395.method2578(0);
            int var319 = field395.field2098;
            class228.method219(field395);
            field395.method2590(field395.field2098 - var319);
        }
    }

    @ObfuscatedName("cc.e(I)V")
    public static final void method1594() {
        if (Statics.field936 != null) {
            Statics.field936.method1031();
        }
        if (Statics.field2764 != null) {
            Statics.field2764.method1031();
        }
    }

    @ObfuscatedName("ce.ai(Lgu;IIII)V")
    public static void method1794(class202 arg0, int arg1, int arg2, int arg3) {
        if (field371 >= 50 || field519 == 0 || arg0.field3053 == null || arg1 >= arg0.field3053.length) {
            return;
        }
        int var4 = arg0.field3053[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field521[field371] = var5;
        field522[field371] = var6;
        field523[field371] = 0;
        field303[field371] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field524[field371] = (var8 << 16) + (var9 << 8) + var7;
        field371++;
    }

    @ObfuscatedName("ax.am(III)V")
    public static void method667(int arg0, int arg1) {
        if (field537 != 0 && arg0 != -1) {
            class139.method852(Statics.field963, arg0, 0, field537, false);
            field517 = true;
        }
    }

    @ObfuscatedName("eq.ad(Lfw;III)V")
    public static final void method2311(class170 arg0, int arg1, int arg2) {
        if (field514 != 0 && field514 != 3 || class116.field1814 != 1 && Statics.field938 || class116.field1814 != 4) {
            return;
        }
        class165 var3 = arg0.method2985(true);
        if (var3 == null) {
            return;
        }
        int var4 = class116.field1812 - arg1;
        int var5 = class116.field1813 - arg2;
        if (!var3.method2883(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2157 / 2;
        int var7 = var5 - var3.field2154 / 2;
        int var8 = field364 + field295 & 0x7FF;
        int var9 = class85.field1439[var8];
        int var10 = class85.field1453[var8];
        int var11 = (field352 + 256) * var9 >> 8;
        int var12 = (field352 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field169.field622 + var13 >> 7;
        int var16 = Statics.field169.field639 - var14 >> 7;
        field395.method2804(46);
        field395.method2578(18);
        field395.method2618(class106.field1709[82] ? (class106.field1709[81] ? 2 : 1) : 0);
        field395.method2683(Statics.field33 + var16);
        field395.method2683(Statics.field878 + var15);
        field395.method2578(var6);
        field395.method2578(var7);
        field395.method2616(field364);
        field395.method2578(57);
        field395.method2578(field295);
        field395.method2578(field352);
        field395.method2578(89);
        field395.method2616(Statics.field169.field622);
        field395.method2616(Statics.field169.field639);
        field395.method2578(63);
        field512 = var15;
        field513 = var16;
    }

    @ObfuscatedName("d.ah(I)V")
    public static final void method60() {
        int var0 = Statics.field974 * 128 + 64;
        int var1 = Statics.field59 * 128 + 64;
        int var2 = method1105(var0, var1, Statics.field1559) - Statics.field2;
        if (Statics.field1776 < var0) {
            Statics.field1776 += Statics.field160 * (var0 - Statics.field1776) / 1000 + Statics.field1113;
            if (Statics.field1776 > var0) {
                Statics.field1776 = var0;
            }
        }
        if (Statics.field1776 > var0) {
            Statics.field1776 -= Statics.field160 * (Statics.field1776 - var0) / 1000 + Statics.field1113;
            if (Statics.field1776 < var0) {
                Statics.field1776 = var0;
            }
        }
        if (Statics.field817 < var2) {
            Statics.field817 += Statics.field160 * (var2 - Statics.field817) / 1000 + Statics.field1113;
            if (Statics.field817 > var2) {
                Statics.field817 = var2;
            }
        }
        if (Statics.field817 > var2) {
            Statics.field817 -= Statics.field160 * (Statics.field817 - var2) / 1000 + Statics.field1113;
            if (Statics.field817 < var2) {
                Statics.field817 = var2;
            }
        }
        if (Statics.field2042 < var1) {
            Statics.field2042 += Statics.field160 * (var1 - Statics.field2042) / 1000 + Statics.field1113;
            if (Statics.field2042 > var1) {
                Statics.field2042 = var1;
            }
        }
        if (Statics.field2042 > var1) {
            Statics.field2042 -= Statics.field160 * (Statics.field2042 - var1) / 1000 + Statics.field1113;
            if (Statics.field2042 < var1) {
                Statics.field2042 = var1;
            }
        }
        int var3 = Statics.field2087 * 128 + 64;
        int var4 = Statics.field250 * 128 + 64;
        int var5 = method1105(var3, var4, Statics.field1559) - Statics.field1648;
        int var6 = var3 - Statics.field1776;
        int var7 = var5 - Statics.field817;
        int var8 = var4 - Statics.field2042;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field142 < var10) {
            Statics.field142 += Statics.field219 * (var10 - Statics.field142) / 1000 + Statics.field1188;
            if (Statics.field142 > var10) {
                Statics.field142 = var10;
            }
        }
        if (Statics.field142 > var10) {
            Statics.field142 -= Statics.field219 * (Statics.field142 - var10) / 1000 + Statics.field1188;
            if (Statics.field142 < var10) {
                Statics.field142 = var10;
            }
        }
        int var12 = var11 - Statics.field681;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field681 += Statics.field219 * var12 / 1000 + Statics.field1188;
            Statics.field681 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field681 -= Statics.field219 * -var12 / 1000 + Statics.field1188;
            Statics.field681 &= 0x7FF;
        }
        int var13 = var11 - Statics.field681;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field681 = var11;
        }
    }

    @ObfuscatedName("w.aj(B)V")
    public static final void method191() {
        int var0 = class46.field899;
        int[] var1 = class46.field896;
        for (int var2 = 0; var2 < var0; var2++) {
            class24 var3 = field400[var1[var2]];
            if (var3 != null) {
                method212(var3, 1);
            }
        }
    }

    @ObfuscatedName("bh.ax(I)V")
    public static final void method1344() {
        for (int var0 = 0; var0 < field317; var0++) {
            int var1 = field420[var0];
            class36 var2 = field285[var1];
            if (var2 != null) {
                method212(var2, var2.field763.field3000);
            }
        }
    }

    @ObfuscatedName("l.ak(Lam;II)V")
    public static final void method212(class28 arg0, int arg1) {
        if (arg0.field653 > field289) {
            method2847(arg0);
        } else if (arg0.field640 >= field289) {
            if (field289 == arg0.field640 || arg0.field625 == -1 || arg0.field633 != 0 || arg0.field627 + 1 > class202.method2533(arg0.field625).field3061[arg0.field615]) {
                int var2 = arg0.field640 - arg0.field653;
                int var3 = field289 - arg0.field653;
                int var4 = arg0.field635 * 128 + arg0.field597 * 64;
                int var5 = arg0.field637 * 128 + arg0.field597 * 64;
                int var6 = arg0.field611 * 128 + arg0.field597 * 64;
                int var7 = arg0.field648 * 128 + arg0.field597 * 64;
                arg0.field622 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field639 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field628 = 0;
            arg0.field644 = arg0.field593;
            arg0.field626 = arg0.field644;
        } else {
            method846(arg0);
        }
        if (arg0.field622 < 128 || arg0.field639 < 128 || arg0.field622 >= 13184 || arg0.field639 >= 13184) {
            arg0.field625 = -1;
            arg0.field629 = -1;
            arg0.field653 = 0;
            arg0.field640 = 0;
            arg0.field622 = arg0.field636[0] * 128 + arg0.field597 * 64;
            arg0.field639 = arg0.field630[0] * 128 + arg0.field597 * 64;
            arg0.method581();
        }
        if (Statics.field169 == arg0 && (arg0.field622 < 1536 || arg0.field639 < 1536 || arg0.field622 >= 11776 || arg0.field639 >= 11776)) {
            arg0.field625 = -1;
            arg0.field629 = -1;
            arg0.field653 = 0;
            arg0.field640 = 0;
            arg0.field622 = arg0.field636[0] * 128 + arg0.field597 * 64;
            arg0.field639 = arg0.field630[0] * 128 + arg0.field597 * 64;
            arg0.method581();
        }
        if (arg0.field646 != 0) {
            if (arg0.field641 != -1) {
                class28 var8 = null;
                if (arg0.field641 < 32768) {
                    var8 = field285[arg0.field641];
                } else if (arg0.field641 >= 32768) {
                    var8 = field400[arg0.field641 - 32768];
                }
                if (var8 != null) {
                    int var9 = arg0.field622 - var8.field622;
                    int var10 = arg0.field639 - var8.field639;
                    if (var9 != 0 || var10 != 0) {
                        arg0.field644 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field620) {
                    arg0.field641 = -1;
                    arg0.field620 = false;
                }
            }
            if (arg0.field621 != -1 && (arg0.field647 == 0 || arg0.field628 > 0)) {
                arg0.field644 = arg0.field621;
                arg0.field621 = -1;
            }
            int var11 = arg0.field644 - arg0.field626 & 0x7FF;
            if (var11 == 0 && arg0.field620) {
                arg0.field641 = -1;
                arg0.field620 = false;
            }
            if (var11 == 0) {
                arg0.field645 = 0;
            } else {
                arg0.field645++;
                if (var11 > 1024) {
                    arg0.field626 -= arg0.field646;
                    boolean var12 = true;
                    if (var11 < arg0.field646 || var11 > 2048 - arg0.field646) {
                        arg0.field626 = arg0.field644;
                        var12 = false;
                    }
                    if (arg0.field618 == arg0.field598 && (arg0.field645 > 25 || var12)) {
                        if (arg0.field599 == -1) {
                            arg0.field618 = arg0.field601;
                        } else {
                            arg0.field618 = arg0.field599;
                        }
                    }
                } else {
                    arg0.field626 += arg0.field646;
                    boolean var13 = true;
                    if (var11 < arg0.field646 || var11 > 2048 - arg0.field646) {
                        arg0.field626 = arg0.field644;
                        var13 = false;
                    }
                    if (arg0.field618 == arg0.field598 && (arg0.field645 > 25 || var13)) {
                        if (arg0.field600 == -1) {
                            arg0.field618 = arg0.field601;
                        } else {
                            arg0.field618 = arg0.field600;
                        }
                    }
                }
                arg0.field626 &= 0x7FF;
            }
        }
        method188(arg0);
    }

    @ObfuscatedName("fs.ar(Lam;B)V")
    public static final void method2847(class28 arg0) {
        int var1 = arg0.field653 - field289;
        int var2 = arg0.field635 * 128 + arg0.field597 * 64;
        int var3 = arg0.field637 * 128 + arg0.field597 * 64;
        arg0.field622 += (var2 - arg0.field622) / var1;
        arg0.field639 += (var3 - arg0.field639) / var1;
        arg0.field628 = 0;
        arg0.field644 = arg0.field593;
    }

    @ObfuscatedName("au.aw(Lam;I)V")
    public static final void method846(class28 arg0) {
        arg0.field618 = arg0.field598;
        if (arg0.field647 == 0) {
            arg0.field628 = 0;
            return;
        }
        if (arg0.field625 != -1 && arg0.field633 == 0) {
            class202 var1 = class202.method2533(arg0.field625);
            if (arg0.field652 > 0 && var1.field3049 == 0) {
                arg0.field628++;
                return;
            }
            if (arg0.field652 <= 0 && var1.field3062 == 0) {
                arg0.field628++;
                return;
            }
        }
        int var2 = arg0.field622;
        int var3 = arg0.field639;
        int var4 = arg0.field636[arg0.field647 - 1] * 128 + arg0.field597 * 64;
        int var5 = arg0.field630[arg0.field647 - 1] * 128 + arg0.field597 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field644 = 1280;
            } else if (var3 > var5) {
                arg0.field644 = 1792;
            } else {
                arg0.field644 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field644 = 768;
            } else if (var3 > var5) {
                arg0.field644 = 256;
            } else {
                arg0.field644 = 512;
            }
        } else if (var3 < var5) {
            arg0.field644 = 1024;
        } else if (var3 > var5) {
            arg0.field644 = 0;
        }
        byte var6 = arg0.field650[arg0.field647 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field622 = var4;
            arg0.field639 = var5;
            arg0.field647--;
            if (arg0.field652 > 0) {
                arg0.field652--;
            }
            return;
        }
        int var7 = arg0.field644 - arg0.field626 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field602;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field601;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field604;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field603;
        }
        if (var8 == -1) {
            var8 = arg0.field601;
        }
        arg0.field618 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class36) {
            var10 = ((class36) arg0).field763.field2998;
        }
        if (var10) {
            if (arg0.field644 != arg0.field626 && arg0.field641 == -1 && arg0.field646 != 0) {
                var9 = 2;
            }
            if (arg0.field647 > 2) {
                var9 = 6;
            }
            if (arg0.field647 > 3) {
                var9 = 8;
            }
            if (arg0.field628 > 0 && arg0.field647 > 1) {
                var9 = 8;
                arg0.field628--;
            }
        } else {
            if (arg0.field647 > 1) {
                var9 = 6;
            }
            if (arg0.field647 > 2) {
                var9 = 8;
            }
            if (arg0.field628 > 0 && arg0.field647 > 1) {
                var9 = 8;
                arg0.field628--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field618 == arg0.field601 && arg0.field605 != -1) {
            arg0.field618 = arg0.field605;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field622 += var9;
                if (arg0.field622 > var4) {
                    arg0.field622 = var4;
                }
            } else if (var2 > var4) {
                arg0.field622 -= var9;
                if (arg0.field622 < var4) {
                    arg0.field622 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field639 += var9;
                if (arg0.field639 > var5) {
                    arg0.field639 = var5;
                }
            } else if (var3 > var5) {
                arg0.field639 -= var9;
                if (arg0.field639 < var5) {
                    arg0.field639 = var5;
                }
            }
        }
        if (arg0.field622 == var4 && arg0.field639 == var5) {
            arg0.field647--;
            if (arg0.field652 > 0) {
                arg0.field652--;
            }
        }
    }

    @ObfuscatedName("n.ay(Lam;I)V")
    public static final void method188(class28 arg0) {
        arg0.field638 = false;
        if (arg0.field618 != -1) {
            class202 var1 = class202.method2533(arg0.field618);
            if (var1 == null || var1.field3050 == null) {
                arg0.field618 = -1;
            } else {
                arg0.field624++;
                if (arg0.field623 < var1.field3050.length && arg0.field624 > var1.field3061[arg0.field623]) {
                    arg0.field624 = 1;
                    arg0.field623++;
                    method1794(var1, arg0.field623, arg0.field622, arg0.field639);
                }
                if (arg0.field623 >= var1.field3050.length) {
                    arg0.field624 = 0;
                    arg0.field623 = 0;
                    method1794(var1, arg0.field623, arg0.field622, arg0.field639);
                }
            }
        }
        if (arg0.field629 != -1 && field289 >= arg0.field619) {
            if (arg0.field631 < 0) {
                arg0.field631 = 0;
            }
            int var2 = class191.method1354(arg0.field629).field2793;
            if (var2 == -1) {
                arg0.field629 = -1;
            } else {
                class202 var3 = class202.method2533(var2);
                if (var3 == null || var3.field3050 == null) {
                    arg0.field629 = -1;
                } else {
                    arg0.field632++;
                    if (arg0.field631 < var3.field3050.length && arg0.field632 > var3.field3061[arg0.field631]) {
                        arg0.field632 = 1;
                        arg0.field631++;
                        method1794(var3, arg0.field631, arg0.field622, arg0.field639);
                    }
                    if (arg0.field631 >= var3.field3050.length && (arg0.field631 < 0 || arg0.field631 >= var3.field3050.length)) {
                        arg0.field629 = -1;
                    }
                }
            }
        }
        if (arg0.field625 != -1 && arg0.field633 <= 1) {
            class202 var4 = class202.method2533(arg0.field625);
            if (var4.field3049 == 1 && arg0.field652 > 0 && arg0.field653 <= field289 && arg0.field640 < field289) {
                arg0.field633 = 1;
                return;
            }
        }
        if (arg0.field625 != -1 && arg0.field633 == 0) {
            class202 var5 = class202.method2533(arg0.field625);
            if (var5 == null || var5.field3050 == null) {
                arg0.field625 = -1;
            } else {
                arg0.field627++;
                if (arg0.field615 < var5.field3050.length && arg0.field627 > var5.field3061[arg0.field615]) {
                    arg0.field627 = 1;
                    arg0.field615++;
                    method1794(var5, arg0.field615, arg0.field622, arg0.field639);
                }
                if (arg0.field615 >= var5.field3050.length) {
                    arg0.field615 -= var5.field3054;
                    arg0.field649++;
                    if (arg0.field649 >= var5.field3056) {
                        arg0.field625 = -1;
                    } else if (arg0.field615 >= 0 && arg0.field615 < var5.field3050.length) {
                        method1794(var5, arg0.field615, arg0.field622, arg0.field639);
                    } else {
                        arg0.field625 = -1;
                    }
                }
                arg0.field638 = var5.field3058;
            }
        }
        if (arg0.field633 > 0) {
            arg0.field633--;
        }
    }

    @ObfuscatedName("cp.av(B)V")
    public static void method1795() {
        Canvas var0 = Statics.field2118;
        var0.removeKeyListener(class106.field1699);
        var0.removeFocusListener(class106.field1699);
        class106.field1712 = -1;
        class116.method1300(Statics.field2118);
        if (Statics.field1918 != null) {
            Statics.field1918.method1888(Statics.field2118);
        }
        Statics.field1537.method1971();
        Statics.field2118.setBackground(Color.black);
        Canvas var1 = Statics.field2118;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class106.field1699);
        var1.addFocusListener(class106.field1699);
        class116.method1330(Statics.field2118);
        if (Statics.field1918 != null) {
            Statics.field1918.method1887(Statics.field2118);
        }
        if (field438 != -1) {
            Statics.method743(false);
        }
        field1784 = true;
    }

    @ObfuscatedName("fd.aa(I)V")
    public static void method2926() {
        field395.method2804(138);
        class160 var0 = field395;
        int var1 = field301 ? 2 : 1;
        var0.method2578(var1);
        field395.method2616(Statics.field578);
        field395.method2616(Statics.field2777);
    }

    @ObfuscatedName("gi.ag(B)V")
    public static void method3172() {
        client var0 = Statics.field1537;
        synchronized (Statics.field1537) {
            Container var1 = Statics.field1537.method1960();
            if (var1 != null) {
                Statics.field814 = Math.max(var1.getSize().width, Statics.field1771);
                Statics.field76 = Math.max(var1.getSize().height, Statics.field1638);
                if (Statics.field164 == var1) {
                    Insets var2 = Statics.field164.getInsets();
                    Statics.field814 -= var2.right + var2.left;
                    Statics.field76 -= var2.top + var2.bottom;
                }
                if (Statics.field814 <= 0) {
                    Statics.field814 = 1;
                }
                if (Statics.field76 <= 0) {
                    Statics.field76 = 1;
                }
                int var3 = field301 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field578 = field493;
                    Statics.field2777 = field494 * 503;
                } else {
                    Statics.field578 = Math.min(Statics.field814, 7680);
                    Statics.field2777 = Math.min(Statics.field76, 2160);
                }
                field1780 = (Statics.field814 - Statics.field578) / 2;
                field1781 = 0;
                Statics.field2118.setSize(Statics.field578, Statics.field2777);
                int var4 = Statics.field578;
                int var5 = Statics.field2777;
                Canvas var6 = Statics.field2118;
                class221 var8;
                try {
                    class219 var7 = new class219();
                    var7.method3718(var4, var5, var6);
                    var8 = var7;
                } catch (Throwable var13) {
                    class224 var10 = new class224();
                    var10.method3718(var4, var5, var6);
                    var8 = var10;
                }
                Statics.field1063 = var8;
                if (Statics.field164 == var1) {
                    Insets var11 = Statics.field164.getInsets();
                    Statics.field2118.setLocation(field1780 + var11.left, field1781 + var11.top);
                } else {
                    Statics.field2118.setLocation(field1780, field1781);
                }
                method679();
                if (field438 != -1) {
                    Statics.method743(true);
                }
                method2032();
            }
        }
    }

    @ObfuscatedName("ar.ao(I)V")
    public static void method679() {
        int var0 = Statics.field578;
        int var1 = Statics.field2777;
        if (Statics.field814 < var0) {
            int var2 = Statics.field814;
        }
        if (Statics.field76 < var1) {
            int var3 = Statics.field76;
        }
        if (Statics.field1734 == null) {
            return;
        }
        try {
            client var4 = Statics.field1537;
            int var5 = field301 ? 2 : 1;
            Object[] var6 = new Object[] { var5 };
            JSObject.getWindow(var4).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("dg.ab(I)V")
    public static void method2032() {
        int var0 = field1780;
        int var1 = field1781;
        int var2 = Statics.field814 - Statics.field578 - var0;
        int var3 = Statics.field76 - Statics.field2777 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field1537.method1960();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field164 == var4) {
                Insets var7 = Statics.field164.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field76);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field814, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field814 + var5 - var2, var6, var2, Statics.field76);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field76 + var6 - var3, Statics.field814, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("ba.an(B)V")
    public static final void method1106() {
        if (field438 != -1) {
            int var0 = field438;
            if (class170.method1843(var0)) {
                method2846(Statics.field2203[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field481; var1++) {
            if (field483[var1]) {
                field484[var1] = true;
            }
            field485[var1] = field483[var1];
            field483[var1] = false;
        }
        field482 = field289;
        field426 = -1;
        field427 = -1;
        Statics.field803 = null;
        if (field438 != -1) {
            field481 = 0;
            int var2 = field438;
            int var3 = Statics.field578;
            int var4 = Statics.field2777;
            if (class170.method1843(var2)) {
                Statics.field1649 = null;
                method710(Statics.field2203[var2], -1, 0, 0, var3, var4, 0, 0, -1);
                if (Statics.field1649 != null) {
                    method710(Statics.field1649, -1412584499, 0, 0, var3, var4, Statics.field589, Statics.field786, -1);
                    Statics.field1649 = null;
                }
            } else {
                for (int var5 = 0; var5 < 100; var5++) {
                    field483[var5] = true;
                }
            }
        }
        class220.method3783();
        if (field416) {
            method1809();
        } else if (field426 != -1) {
            int var6 = field426;
            int var7 = field427;
            if (field460 >= 2 || field430 != 0 || field433) {
                String var8;
                if (field430 == 1 && field460 < 2) {
                    var8 = class174.field2594 + class174.field2431 + field432 + " " + class38.field777;
                } else if (field433 && field460 < 2) {
                    var8 = field407 + class174.field2431 + field437 + " " + class38.field777;
                } else {
                    var8 = method570(field460 - 1);
                }
                if (field460 > 2) {
                    var8 = var8 + class38.method569(16777215) + " " + '/' + " " + (field460 - 2) + class174.field2504;
                }
                Statics.field1347.method3698(var8, var6 + 4, var7 + 15, 16777215, 0, field289 / 1000);
            }
        }
        if (field490 == 3) {
            for (int var9 = 0; var9 < field481; var9++) {
                if (field485[var9]) {
                    class220.method3736(field486[var9], field544[var9], field487[var9], field489[var9], 16711935, 128);
                } else if (field484[var9]) {
                    class220.method3736(field486[var9], field544[var9], field487[var9], field489[var9], 16711680, 128);
                }
            }
        }
        int var10 = Statics.field1559;
        int var11 = Statics.field169.field622;
        int var12 = Statics.field169.field639;
        int var13 = field355;
        for (class32 var14 = (class32) class32.field712.method2237(); var14 != null; var14 = (class32) class32.field712.method2251()) {
            if (var14.field705 != -1 || var14.field701 != null) {
                int var15 = 0;
                if (var11 > var14.field699) {
                    var15 += var11 - var14.field699;
                } else if (var11 < var14.field697) {
                    var15 += var14.field697 - var11;
                }
                if (var12 > var14.field700) {
                    var15 += var12 - var14.field700;
                } else if (var12 < var14.field698) {
                    var15 += var14.field698 - var12;
                }
                if (var15 - 64 > var14.field710 || field519 == 0 || var14.field708 != var10) {
                    if (var14.field703 != null) {
                        Statics.field754.method871(var14.field703);
                        var14.field703 = null;
                    }
                    if (var14.field707 != null) {
                        Statics.field754.method871(var14.field707);
                        var14.field707 = null;
                    }
                } else {
                    var15 -= 64;
                    if (var15 < 0) {
                        var15 = 0;
                    }
                    int var16 = field519 * (var14.field710 - var15) / var14.field710;
                    class54 var10000;
                    if (var14.field703 != null) {
                        var14.field703.method1114(var16);
                    } else if (var14.field705 >= 0) {
                        var10000 = (class54) null;
                        class54 var17 = class54.method929(Statics.field2045, var14.field705, 0);
                        if (var17 != null) {
                            class56 var18 = var17.method927().method967(Statics.field2770);
                            class67 var19 = class67.method1152(var18, 100, var16);
                            var19.method1113(-1);
                            Statics.field754.method870(var19);
                            var14.field703 = var19;
                        }
                    }
                    if (var14.field707 != null) {
                        var14.field707.method1114(var16);
                        if (!var14.field707.method2226()) {
                            var14.field707 = null;
                        }
                    } else if (var14.field701 != null && (var14.field702 -= var13) <= 0) {
                        int var20 = (int) (Math.random() * (double) var14.field701.length);
                        var10000 = (class54) null;
                        class54 var21 = class54.method929(Statics.field2045, var14.field701[var20], 0);
                        if (var21 != null) {
                            class56 var22 = var21.method927().method967(Statics.field2770);
                            class67 var23 = class67.method1152(var22, 100, var16);
                            var23.method1113(0);
                            Statics.field754.method870(var23);
                            var14.field707 = var23;
                            var14.field702 = var14.field704 + (int) (Math.random() * (double) (var14.field696 - var14.field704));
                        }
                    }
                }
            }
        }
        field355 = 0;
    }

    @ObfuscatedName("cq.ac(Ljava/lang/String;ZI)V")
    public static final void method1451(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2671.method3625(arg0, 250);
        int var6 = Statics.field2671.method3626(arg0, 250) * 13;
        class220.method3766(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class220.method3743(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2671.method3619(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method704(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method2886(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field2118.getGraphics();
            Statics.field1063.method3719(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field2118.repaint();
        }
    }

    @ObfuscatedName("bk.al(IIIIB)V")
    public static final void method1328(int arg0, int arg1, int arg2, int arg3) {
        field525++;
        method3279(class16.field154);
        boolean var4 = false;
        if (field337 >= 0) {
            int var5 = class46.field899;
            int[] var6 = class46.field896;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field337 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method3279(class16.field158);
        }
        method81(true);
        method3279(var4 ? class16.field157 : class16.field156);
        method81(false);
        method3007();
        method574();
        method722(arg0, arg1, arg2, arg3, true);
        int var8 = field540;
        int var9 = field541;
        int var10 = field387;
        int var11 = field543;
        class220.method3754(var8, var9, var8 + var10, var9 + var11);
        class85.method1580();
        if (!field526) {
            int var12 = field384;
            if (field520 / 256 > var12) {
                var12 = field520 / 256;
            }
            if (field444[4] && field529[4] + 128 > var12) {
                var12 = field529[4] + 128;
            }
            int var13 = field364 + field347 & 0x7FF;
            int var14 = Statics.field892;
            int var15 = method1105(Statics.field169.field622, Statics.field169.field639, Statics.field1559) - field299;
            int var16 = Statics.field123;
            int var17 = var12 * 3 + 600;
            int var18 = 2048 - var12 & 0x7FF;
            int var19 = 2048 - var13 & 0x7FF;
            int var20 = 0;
            int var21 = 0;
            int var22 = var17;
            if (var18 != 0) {
                int var23 = class85.field1439[var18];
                int var24 = class85.field1453[var18];
                int var25 = var21 * var24 - var17 * var23 >> 16;
                var22 = var21 * var23 + var17 * var24 >> 16;
                var21 = var25;
            }
            if (var19 != 0) {
                int var26 = class85.field1439[var19];
                int var27 = class85.field1453[var19];
                int var28 = var20 * var27 + var22 * var26 >> 16;
                var22 = var22 * var27 - var20 * var26 >> 16;
                var20 = var28;
            }
            Statics.field1776 = var14 - var20;
            Statics.field817 = var15 - var21;
            Statics.field2042 = var16 - var22;
            Statics.field142 = var12;
            Statics.field681 = var13;
        }
        int var29;
        if (field526) {
            var29 = method216();
        } else {
            var29 = method3996();
        }
        int var30 = Statics.field1776;
        int var31 = Statics.field817;
        int var32 = Statics.field2042;
        int var33 = Statics.field142;
        int var34 = Statics.field681;
        for (int var35 = 0; var35 < 5; var35++) {
            if (field444[var35]) {
                int var36 = (int) (Math.random() * (double) (field528[var35] * 2 + 1) - (double) field528[var35] + Math.sin((double) field530[var35] / 100.0D * (double) field531[var35]) * (double) field529[var35]);
                if (var35 == 0) {
                    Statics.field1776 += var36;
                }
                if (var35 == 1) {
                    Statics.field817 += var36;
                }
                if (var35 == 2) {
                    Statics.field2042 += var36;
                }
                if (var35 == 3) {
                    Statics.field681 = Statics.field681 + var36 & 0x7FF;
                }
                if (var35 == 4) {
                    Statics.field142 += var36;
                    if (Statics.field142 < 128) {
                        Statics.field142 = 128;
                    }
                    if (Statics.field142 > 383) {
                        Statics.field142 = 383;
                    }
                }
            }
        }
        int var37 = class116.field1806;
        int var38 = class116.field1815 * -693183961;
        if (class116.field1814 != 0) {
            var37 = class116.field1812;
            var38 = class116.field1813;
        }
        if (var37 >= var8 && var37 < var8 + var10 && var38 >= var9 && var38 < var9 + var11) {
            class83.field1410 = true;
            class83.field1413 = 0;
            class83.field1411 = var37 - var8;
            class83.field1364 = var38 - var9;
        } else {
            class83.field1410 = false;
            class83.field1413 = 0;
        }
        method1594();
        class220.method3766(var8, var9, var10, var11, 0);
        method1594();
        int var39 = class85.field1438;
        class85.field1438 = field343;
        Statics.field1542.method1693(Statics.field1776, Statics.field817, Statics.field2042, Statics.field142, Statics.field681, var29);
        class85.field1438 = var39;
        method1594();
        Statics.field1542.method1781();
        field373 = 0;
        boolean var40 = false;
        int var41 = -1;
        int var42 = class46.field899;
        int[] var43 = class46.field896;
        for (int var44 = 0; var44 < field317 + var42; var44++) {
            class28 var45;
            if (var44 < var42) {
                var45 = field400[var43[var44]];
                if (field337 == var43[var44]) {
                    var40 = true;
                    var41 = var44;
                    continue;
                }
            } else {
                var45 = field285[field420[var44 - var42]];
            }
            method15(var45, var44, var8, var9, var10, var11);
        }
        if (var40) {
            method15(field400[field337], var41, var8, var9, var10, var11);
        }
        for (int var46 = 0; var46 < field373; var46++) {
            int var47 = field492[var46];
            int var48 = field402[var46];
            int var49 = field378[var46];
            int var50 = field377[var46];
            boolean var51 = true;
            while (var51) {
                var51 = false;
                for (int var52 = 0; var52 < var46; var52++) {
                    if (var48 + 2 > field402[var52] - field377[var52] && var48 - var50 < field402[var52] + 2 && var47 - var49 < field492[var52] + field378[var52] && var47 + var49 > field492[var52] - field378[var52] && field402[var52] - field377[var52] < var48) {
                        var48 = field402[var52] - field377[var52];
                        var51 = true;
                    }
                }
            }
            field399 = field492[var46];
            field318 = field402[var46] = var48;
            String var53 = field382[var46];
            if (field414 == 0) {
                int var54 = 16776960;
                if (field279[var46] < 6) {
                    var54 = field495[field279[var46]];
                }
                if (field279[var46] == 6) {
                    var54 = field525 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field279[var46] == 7) {
                    var54 = field525 % 20 < 10 ? 255 : 65535;
                }
                if (field279[var46] == 8) {
                    var54 = field525 % 20 < 10 ? 45056 : 8454016;
                }
                if (field279[var46] == 9) {
                    int var55 = 150 - field381[var46];
                    if (var55 < 50) {
                        var54 = var55 * 1280 + 16711680;
                    } else if (var55 < 100) {
                        var54 = 16776960 - (var55 - 50) * 327680;
                    } else if (var55 < 150) {
                        var54 = (var55 - 100) * 5 + 65280;
                    }
                }
                if (field279[var46] == 10) {
                    int var56 = 150 - field381[var46];
                    if (var56 < 50) {
                        var54 = var56 * 5 + 16711680;
                    } else if (var56 < 100) {
                        var54 = 16711935 - (var56 - 50) * 327680;
                    } else if (var56 < 150) {
                        var54 = (var56 - 100) * 327680 + 255 - (var56 - 100) * 5;
                    }
                }
                if (field279[var46] == 11) {
                    int var57 = 150 - field381[var46];
                    if (var57 < 50) {
                        var54 = 16777215 - var57 * 327685;
                    } else if (var57 < 100) {
                        var54 = (var57 - 50) * 327685 + 65280;
                    } else if (var57 < 150) {
                        var54 = 16777215 - (var57 - 100) * 327680;
                    }
                }
                if (field380[var46] == 0) {
                    Statics.field1347.method3657(var53, field399 + var8, field318 + var9, var54, 0);
                }
                if (field380[var46] == 1) {
                    Statics.field1347.method3631(var53, field399 + var8, field318 + var9, var54, 0, field525);
                }
                if (field380[var46] == 2) {
                    Statics.field1347.method3632(var53, field399 + var8, field318 + var9, var54, 0, field525);
                }
                if (field380[var46] == 3) {
                    Statics.field1347.method3633(var53, field399 + var8, field318 + var9, var54, 0, field525, 150 - field381[var46]);
                }
                if (field380[var46] == 4) {
                    int var58 = (150 - field381[var46]) * (Statics.field1347.method3623(var53) + 100) / 150;
                    class220.method3732(field399 + var8 - 50, var9, field399 + var8 + 50, var9 + var11);
                    Statics.field1347.method3628(var53, field399 + var8 + 50 - var58, field318 + var9, var54, 0);
                    class220.method3754(var8, var9, var8 + var10, var9 + var11);
                }
                if (field380[var46] == 5) {
                    int var59 = 150 - field381[var46];
                    int var60 = 0;
                    if (var59 < 25) {
                        var60 = var59 - 25;
                    } else if (var59 > 125) {
                        var60 = var59 - 125;
                    }
                    class220.method3732(var8, field318 + var9 - Statics.field1347.field3101 - 1, var8 + var10, field318 + var9 + 5);
                    Statics.field1347.method3657(var53, field399 + var8, field318 + var9 + var60, var54, 0);
                    class220.method3754(var8, var9, var8 + var10, var9 + var11);
                }
            } else {
                Statics.field1347.method3657(var53, field399 + var8, field318 + var9, 16776960, 0);
            }
        }
        if (field408 == 2) {
            method2848((field440 - Statics.field878 << 7) + field357, (field550 - Statics.field33 << 7) + field297, field302 * 2);
            if (field399 > -1 && field289 % 20 < 10) {
                Statics.field679[0].method3864(field399 + var8 - 12, field318 + var9 - 28);
            }
        }
        ((class75) Statics.field1449).method1339(field355);
        if (field372 == 1) {
            Statics.field254[field389 / 100].method3864(field421 - 8, field465 - 8);
        }
        if (field372 == 2) {
            Statics.field254[field389 / 100 + 4].method3864(field421 - 8, field465 - 8);
        }
        Statics.method92();
        Statics.field1776 = var30;
        Statics.field817 = var31;
        Statics.field2042 = var32;
        Statics.field142 = var33;
        Statics.field681 = var34;
        if (field386 && class186.method1593(true, false) == 0) {
            field386 = false;
        }
        if (field386) {
            class220.method3766(var8, var9, var10, var11, 0);
            method1451(class174.field2362, false);
        }
    }

    @ObfuscatedName("av.ae(IIIIZI)V")
    public static final void method722(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field533 - field356) * var5 / 100 + field356;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field346) {
            short var8 = field346;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field451) {
                var6 = field451;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class220.method3783();
                    class220.method3766(arg0, arg1, var10, arg3, -16777216);
                    class220.method3766(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field539) {
            short var11 = field539;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field536) {
                var6 = field536;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class220.method3783();
                    class220.method3766(arg0, arg1, arg2, var13, -16777216);
                    class220.method3766(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field535 - field534) * var5 / 100 + field534;
        field343 = arg3 * var6 * var14 / 85504 << 1;
        if (field387 != arg2 || field543 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class85.field1439[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class88.method1658(var15, 500, 800, arg2, arg3);
        }
        field540 = arg0;
        field541 = arg1;
        field387 = arg2;
        field543 = arg3;
    }

    @ObfuscatedName("gb.ap(Li;B)V")
    public static final void method3279(class16 arg0) {
        if (Statics.field169.field622 >> 7 == field512 && Statics.field169.field639 >> 7 == field513) {
            field512 = 0;
        }
        int var1 = class46.field899;
        int[] var2 = class46.field896;
        int var3 = var1;
        if (class16.field154 == arg0 || class16.field158 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class24 var5;
            int var6;
            if (class16.field154 == arg0) {
                var5 = Statics.field169;
                var6 = Statics.field169.field261 << 14;
            } else if (class16.field158 == arg0) {
                var5 = field400[field337];
                var6 = field337 << 14;
            } else {
                var5 = field400[var2[var4]];
                var6 = var2[var4] << 14;
                if (class16.field157 == arg0 && field337 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method227() && !var5.field267) {
                var5.field257 = false;
                if ((field284 && var1 > 50 || var1 > 200) && class16.field154 != arg0 && var5.field618 == var5.field598) {
                    var5.field257 = true;
                }
                int var7 = var5.field622 >> 7;
                int var8 = var5.field639 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field252 == null || field289 < var5.field255 || field289 >= var5.field248) {
                        if ((var5.field622 & 0x7F) == 64 && (var5.field639 & 0x7F) == 64) {
                            if (field525 == field288[var7][var8]) {
                                continue;
                            }
                            field288[var7][var8] = field525;
                        }
                        var5.field239 = method1105(var5.field622, var5.field639, Statics.field1559);
                        Statics.field1542.method1612(Statics.field1559, var5.field622, var5.field639, var5.field239, 60, var5, var5.field626, var6, var5.field638);
                    } else {
                        var5.field257 = false;
                        var5.field239 = method1105(var5.field622, var5.field639, Statics.field1559);
                        Statics.field1542.method1613(Statics.field1559, var5.field622, var5.field639, var5.field239, 60, var5, var5.field626, var6, var5.field253, var5.field259, var5.field265, var5.field256);
                    }
                }
            }
        }
    }

    @ObfuscatedName("k.au(ZB)V")
    public static final void method81(boolean arg0) {
        for (int var1 = 0; var1 < field317; var1++) {
            class36 var2 = field285[field420[var1]];
            int var3 = (field420[var1] << 14) + 536870912;
            if (var2 != null && var2.method227() && var2.field763.field3005 == arg0 && var2.field763.method3468()) {
                int var4 = var2.field622 >> 7;
                int var5 = var2.field639 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field597 == 1 && (var2.field622 & 0x7F) == 64 && (var2.field639 & 0x7F) == 64) {
                        if (field525 == field288[var4][var5]) {
                            continue;
                        }
                        field288[var4][var5] = field525;
                    }
                    if (!var2.field763.field3027) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1542.method1612(Statics.field1559, var2.field622, var2.field639, method1105(var2.field622 + (var2.field597 * 64 - 64), var2.field639 + (var2.field597 * 64 - 64), Statics.field1559), var2.field597 * 64 - 64 + 60, var2, var2.field626, var3, var2.field638);
                }
            }
        }
    }

    @ObfuscatedName("fn.aq(I)V")
    public static final void method3007() {
        for (class43 var0 = (class43) field412.method2237(); var0 != null; var0 = (class43) field412.method2251()) {
            if (Statics.field1559 != var0.field856 || field289 > var0.field862) {
                var0.method2225();
            } else if (field289 >= var0.field861) {
                if (var0.field857 > 0) {
                    class36 var1 = field285[var0.field857 - 1];
                    if (var1 != null && var1.field622 >= 0 && var1.field622 < 13312 && var1.field639 >= 0 && var1.field639 < 13312) {
                        var0.method761(var1.field622, var1.field639, method1105(var1.field622, var1.field639, var0.field856) - var0.field860, field289);
                    }
                }
                if (var0.field857 < 0) {
                    int var2 = -var0.field857 - 1;
                    class24 var3;
                    if (field409 == var2) {
                        var3 = Statics.field169;
                    } else {
                        var3 = field400[var2];
                    }
                    if (var3 != null && var3.field622 >= 0 && var3.field622 < 13312 && var3.field639 >= 0 && var3.field639 < 13312) {
                        var0.method761(var3.field622, var3.field639, method1105(var3.field622, var3.field639, var0.field856) - var0.field860, field289);
                    }
                }
                var0.method762(field355);
                Statics.field1542.method1612(Statics.field1559, (int) var0.field867, (int) var0.field871, (int) var0.field877, 60, var0, var0.field855, -1, false);
            }
        }
    }

    @ObfuscatedName("e.at(B)V")
    public static final void method574() {
        for (class34 var0 = (class34) field413.method2237(); var0 != null; var0 = (class34) field413.method2251()) {
            if (Statics.field1559 != var0.field737 || var0.field740) {
                var0.method2225();
            } else if (field289 >= var0.field731) {
                var0.method672(field355);
                if (var0.field740) {
                    var0.method2225();
                } else {
                    Statics.field1542.method1612(var0.field737, var0.field734, var0.field739, var0.field736, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("hz.az(I)I")
    public static final int method3996() {
        if (Statics.field1734.field686) {
            return Statics.field1559;
        }
        int var0 = 3;
        if (Statics.field142 < 310) {
            int var1 = Statics.field1776 >> 7;
            int var2 = Statics.field2042 >> 7;
            int var3 = Statics.field169.field622 >> 7;
            int var4 = Statics.field169.field639 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field1559;
            }
            if ((class11.field87[Statics.field1559][var1][var2] & 0x4) != 0) {
                var0 = Statics.field1559;
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
                    if ((class11.field87[Statics.field1559][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1559;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class11.field87[Statics.field1559][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1559;
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
                    if ((class11.field87[Statics.field1559][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1559;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class11.field87[Statics.field1559][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1559;
                        }
                    }
                }
            }
        }
        if (Statics.field169.field622 >= 0 && Statics.field169.field639 >= 0 && Statics.field169.field622 < 13312 && Statics.field169.field639 < 13312) {
            if ((class11.field87[Statics.field1559][Statics.field169.field622 >> 7][Statics.field169.field639 >> 7] & 0x4) != 0) {
                var0 = Statics.field1559;
            }
            return var0;
        } else {
            return Statics.field1559;
        }
    }

    @ObfuscatedName("l.as(I)I")
    public static final int method216() {
        if (Statics.field1734.field686) {
            return Statics.field1559;
        } else {
            int var0 = method1105(Statics.field1776, Statics.field2042, Statics.field1559);
            return var0 - Statics.field817 >= 800 || (class11.field87[Statics.field1559][Statics.field1776 >> 7][Statics.field2042 >> 7] & 0x4) == 0 ? 3 : Statics.field1559;
        }
    }

    @ObfuscatedName("p.be(Lam;IIIIII)V")
    public static final void method15(class28 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method227()) {
            return;
        }
        if (arg0 instanceof class36) {
            class200 var6 = ((class36) arg0).field763;
            if (var6.field3024 != null) {
                var6 = var6.method3461();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class46.field899;
        int[] var8 = class46.field896;
        int var9 = 3;
        if (!arg0.field596.method2208()) {
            method1073(arg0, arg0.field643 + 15);
            for (class35 var10 = (class35) arg0.field596.method2206(); var10 != null; var10 = (class35) arg0.field596.method2214()) {
                class29 var11 = var10.method682(field289);
                if (var11 != null) {
                    class194 var12 = var10.field745;
                    class225 var13 = var12.method3268();
                    class225 var14 = var12.method3264();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field2827;
                    } else {
                        if (var12.field2840 * 2 < var14.field3213) {
                            var15 = var12.field2840;
                        }
                        var16 = var14.field3213 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field289 - var11.field662;
                    int var20 = var11.field656 * var16 / var12.field2827;
                    int var23;
                    if (var11.field657 > var19) {
                        int var21 = var12.field2835 == 0 ? 0 : var19 / var12.field2835 * var12.field2835;
                        int var22 = var11.field655 * var16 / var12.field2827;
                        var23 = (var20 - var22) * var21 / var11.field657 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field657 + var12.field2836 - var19;
                        if (var12.field2834 >= 0) {
                            var17 = (var24 << 8) / (var12.field2836 - var12.field2834);
                        }
                    }
                    if (var11.field656 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field399 + arg2 - (var16 >> 1);
                    int var26 = field318 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field399 > -1) {
                            class220.method3766(var25, var26, var23, 5, 65280);
                            class220.method3766(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                            var13.method3943(var27, var26, var17);
                            class220.method3732(var27, var26, var27 + var28, var26 + var29);
                            var14.method3943(var27, var26, var17);
                        } else {
                            var13.method3864(var27, var26);
                            class220.method3732(var27, var26, var27 + var28, var26 + var29);
                            var14.method3864(var27, var26);
                        }
                        class220.method3754(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method681()) {
                    var10.method2225();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class24 var30 = (class24) arg0;
            if (var30.field267) {
                return;
            }
            if (var30.field241 != -1 || var30.field242 != -1) {
                method1073(arg0, arg0.field643 + 15);
                if (field399 > -1) {
                    if (var30.field241 != -1) {
                        Statics.field1979[var30.field241].method3864(field399 + arg2 - 12, field318 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field242 != -1) {
                        Statics.field390[var30.field242].method3864(field399 + arg2 - 12, field318 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field408 == 10 && field322 == var8[arg1]) {
                method1073(arg0, arg0.field643 + 15);
                if (field399 > -1) {
                    Statics.field679[1].method3864(field399 + arg2 - 12, field318 + arg3 - var9);
                }
            }
        } else {
            class200 var31 = ((class36) arg0).field763;
            if (var31.field3024 != null) {
                var31 = var31.method3461();
            }
            if (var31.field3013 >= 0 && var31.field3013 < Statics.field390.length) {
                method1073(arg0, arg0.field643 + 15);
                if (field399 > -1) {
                    Statics.field390[var31.field3013].method3864(field399 + arg2 - 12, field318 + arg3 - 30);
                }
            }
            if (field408 == 1 && field500 == field420[arg1 - var7] && field289 % 20 < 10) {
                method1073(arg0, arg0.field643 + 15);
                if (field399 > -1) {
                    Statics.field679[0].method3864(field399 + arg2 - 12, field318 + arg3 - 28);
                }
            }
        }
        if (arg0.field606 != null && (arg1 >= var7 || !arg0.field608 && (field496 == 4 || !arg0.field607 && (field496 == 0 || field496 == 3 || field496 == 1 && method2022(((class24) arg0).field264, false))))) {
            method1073(arg0, arg0.field643);
            if (field399 > -1 && field373 < field374) {
                field378[field373] = Statics.field1347.method3623(arg0.field606) / 2;
                field377[field373] = Statics.field1347.field3101;
                field492[field373] = field399;
                field402[field373] = field318;
                field279[field373] = arg0.field595;
                field380[field373] = arg0.field610;
                field381[field373] = arg0.field609;
                field382[field373] = arg0.field606;
                field373++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field613[var32];
            int var34 = arg0.field651[var32];
            class197 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field289) {
                    continue;
                }
                var35 = class197.method1908(arg0.field651[var32]);
                var36 = var35.field2870;
                if (var35 != null && var35.field2881 != null) {
                    var35 = var35.method3343();
                    if (var35 == null) {
                        arg0.field613[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field616[var32];
            class197 var38 = null;
            if (var37 >= 0) {
                var38 = class197.method1908(var37);
                if (var38 != null && var38.field2881 != null) {
                    var38 = var38.method3343();
                }
            }
            if (var33 - var36 <= field289) {
                if (var35 == null) {
                    arg0.field613[var32] = -1;
                } else {
                    method1073(arg0, arg0.field643 / 2);
                    if (field399 > -1) {
                        if (var32 == 1) {
                            field318 -= 20;
                        }
                        if (var32 == 2) {
                            field399 -= 15;
                            field318 -= 10;
                        }
                        if (var32 == 3) {
                            field399 += 15;
                            field318 -= 10;
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
                        class225 var64 = var35.method3304();
                        if (var64 != null) {
                            var43 = var64.field3213;
                            int var65 = var64.field3205;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3206;
                        }
                        class225 var66 = var35.method3305();
                        if (var66 != null) {
                            var44 = var66.field3213;
                            int var67 = var66.field3205;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3206;
                        }
                        class225 var68 = var35.method3306();
                        if (var68 != null) {
                            var45 = var68.field3213;
                            int var69 = var68.field3205;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3206;
                        }
                        class225 var70 = var35.method3307();
                        if (var70 != null) {
                            var46 = var70.field3213;
                            int var71 = var70.field3205;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3206;
                        }
                        if (var38 != null) {
                            var51 = var38.method3304();
                            if (var51 != null) {
                                var55 = var51.field3213;
                                int var72 = var51.field3205;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3206;
                            }
                            var52 = var38.method3305();
                            if (var52 != null) {
                                var56 = var52.field3213;
                                int var73 = var52.field3205;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3206;
                            }
                            var53 = var38.method3306();
                            if (var53 != null) {
                                var57 = var53.field3213;
                                int var74 = var53.field3205;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3206;
                            }
                            var54 = var38.method3307();
                            if (var54 != null) {
                                var58 = var54.field3213;
                                int var75 = var54.field3205;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3206;
                            }
                        }
                        class209 var76 = var35.method3308();
                        if (var76 == null) {
                            var76 = Statics.field205;
                        }
                        class209 var77;
                        if (var38 == null) {
                            var77 = Statics.field205;
                        } else {
                            var77 = var38.method3308();
                            if (var77 == null) {
                                var77 = Statics.field205;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method3303(arg0.field614[var32]);
                        int var83 = var76.method3623(var82);
                        if (var38 != null) {
                            var79 = var38.method3303(arg0.field617[var32]);
                            var81 = var77.method3623(var79);
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
                        int var100 = arg0.field613[var32] - field289;
                        int var101 = var35.field2875 - var35.field2875 * var100 / var35.field2870;
                        int var102 = var35.field2862 * var100 / var35.field2870 + -var35.field2862;
                        int var103 = field399 + arg2 - (var92 >> 1) + var101;
                        int var104 = field318 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field2883 + var104 + 15;
                        int var108 = var107 - var76.field3102;
                        int var109 = var76.field3107 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field2883 + var104 + 15;
                            int var111 = var110 - var77.field3102;
                            int var112 = var77.field3107 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field2877 >= 0) {
                            var115 = (var100 << 8) / (var35.field2870 - var35.field2877);
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
                            var76.method3629(var82, var90 + var103, var107, var35.field2880, 0, var115);
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
                                var77.method3629(var79, var98 + var103, var110, var38.field2880, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method3864(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method3864(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method3864(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method3864(var93 + var103 - var50, var104);
                            }
                            var76.method3628(var82, var90 + var103, var107, var35.field2880 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method3864(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method3864(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method3864(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method3864(var97 + var103 - var62, var104);
                                }
                                var77.method3628(var79, var98 + var103, var110, var38.field2880 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bg.bo(Lam;II)V")
    public static final void method1073(class28 arg0, int arg1) {
        method2848(arg0.field622, arg0.field639, arg1);
    }

    @ObfuscatedName("fs.br(IIII)V")
    public static final void method2848(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field399 = -1;
            field318 = -1;
            return;
        }
        int var3 = method1105(arg0, arg1, Statics.field1559) - arg2;
        int var4 = arg0 - Statics.field1776;
        int var5 = var3 - Statics.field817;
        int var6 = arg1 - Statics.field2042;
        int var7 = class85.field1439[Statics.field142];
        int var8 = class85.field1453[Statics.field142];
        int var9 = class85.field1439[Statics.field681];
        int var10 = class85.field1453[Statics.field681];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field399 = field343 * var11 / var15 + field387 / 2;
            field318 = field343 * var14 / var15 + field543 / 2;
        } else {
            field399 = -1;
            field318 = -1;
        }
    }

    @ObfuscatedName("ba.bb(IIII)I")
    public static final int method1105(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class11.field87[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class11.field94[var5][var3][var4] + class11.field94[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class11.field94[var5][var3][var4 + 1] + class11.field94[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("aj.bl(ZI)V")
    public static final void method660(boolean arg0) {
        field340 = arg0;
        if (!field340) {
            int var1 = field324.method2606();
            int var2 = field324.method2606();
            int var3 = field324.method2595();
            Statics.field3090 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field3090[var4][var5] = field324.method2598();
                }
            }
            Statics.field1219 = new int[var3];
            Statics.field111 = new int[var3];
            Statics.field1543 = new int[var3];
            Statics.field1937 = new byte[var3][];
            Statics.field194 = new byte[var3][];
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
                        Statics.field1219[var7] = var10;
                        Statics.field111[var7] = Statics.field310.method3035("m" + var8 + "_" + var9);
                        Statics.field1543[var7] = Statics.field310.method3035("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            Statics.method597(var1, var2);
            return;
        }
        int var11 = field324.method2595();
        int var12 = field324.method2606();
        int var13 = field324.method2595();
        field324.method2821();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field324.method2828(1);
                    if (var17 == 1) {
                        field341[var14][var15][var16] = field324.method2828(26);
                    } else {
                        field341[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field324.method2810();
        Statics.field3090 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field3090[var18][var19] = field324.method2598();
            }
        }
        Statics.field1219 = new int[var13];
        Statics.field111 = new int[var13];
        Statics.field1543 = new int[var13];
        Statics.field1937 = new byte[var13][];
        Statics.field194 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field341[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field1219[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field1219[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field111[var20] = Statics.field310.method3035("m" + var29 + "_" + var30);
                            Statics.field1543[var20] = Statics.field310.method3035("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        Statics.method597(var12, var11);
    }

    @ObfuscatedName("ad.bf(ZI)V")
    public static final void method601(boolean arg0) {
        method1594();
        field349++;
        if (field349 < 50 && !arg0) {
            return;
        }
        field349 = 0;
        if (field333 || Statics.field153 == null) {
            return;
        }
        field395.method2804(249);
        try {
            Statics.field153.method1935(field395.field2092, 0, field395.field2098);
            field395.field2098 = 0;
        } catch (IOException var2) {
            field333 = true;
        }
    }

    @ObfuscatedName("fg.bg(II)V")
    public static final void method2824(int arg0) {
        int[] var1 = Statics.field175.field3209;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class11.field87[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field1542.method1635(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class11.field87[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1542.method1635(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field175.method3854();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class11.field87[arg0][var10][var9] & 0x18) == 0) {
                    method3193(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class11.field87[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method3193(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field344 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field1542.method1643(Statics.field1559, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class198.method3716(var14).field2918;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field339[Statics.field1559].field1840;
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
                        field511[field344] = Statics.field172[var15];
                        field509[field344] = var16;
                        field532[field344] = var17;
                        field344++;
                    }
                }
            }
        }
        Statics.field1063.method3806();
    }

    @ObfuscatedName("gj.bp(IIIIII)V")
    public static final void method3193(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1542.method1680(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1542.method1631(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field175.field3209;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class198 var13 = class198.method3716(var12);
            if (var13.field2919 == -1) {
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
                class223 var14 = Statics.field38[var13.field2919];
                if (var14 != null) {
                    int var15 = (var13.field2917 * 4 - var14.field3199) / 2;
                    int var16 = (var13.field2906 * 4 - var14.field3195) / 2;
                    var14.method3814(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field2906) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1542.method1629(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1542.method1631(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class198 var22 = class198.method3716(var21);
            if (var22.field2919 != -1) {
                class223 var23 = Statics.field38[var22.field2919];
                if (var23 != null) {
                    int var24 = (var22.field2917 * 4 - var23.field3199) / 2;
                    int var25 = (var22.field2906 * 4 - var23.field3195) / 2;
                    var23.method3814(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field2906) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field175.field3209;
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
        int var29 = Statics.field1542.method1643(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class198 var31 = class198.method3716(var30);
        if (var31.field2919 == -1) {
            return;
        }
        class223 var32 = Statics.field38[var31.field2919];
        if (var32 != null) {
            int var33 = (var31.field2917 * 4 - var32.field3199) / 2;
            int var34 = (var31.field2906 * 4 - var32.field3195) / 2;
            var32.method3814(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field2906) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("al.bj(I)V")
    public static final void method781() {
        if (field326 == 236) {
            int var0 = field324.method2593();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1730;
            int var2 = (var0 & 0x7) + Statics.field2722;
            int var3 = var1 + field324.method2631();
            int var4 = var2 + field324.method2631();
            int var5 = field324.method2739();
            int var6 = field324.method2595();
            int var7 = field324.method2593() * 4;
            int var8 = field324.method2593() * 4;
            int var9 = field324.method2595();
            int var10 = field324.method2595();
            int var11 = field324.method2593();
            int var12 = field324.method2593();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104 && var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104 && var6 != 65535) {
                int var13 = var1 * 128 + 64;
                int var14 = var2 * 128 + 64;
                int var15 = var3 * 128 + 64;
                int var16 = var4 * 128 + 64;
                class43 var17 = new class43(var6, Statics.field1559, var13, var14, method1105(var13, var14, Statics.field1559) - var7, field289 + var9, field289 + var10, var11, var12, var5, var8);
                var17.method761(var15, var16, method1105(var15, var16, Statics.field1559) - var8, field289 + var9);
                field412.method2232(var17);
            }
        } else if (field326 == 51) {
            int var18 = field324.method2593();
            int var19 = var18 >> 2;
            int var20 = var18 & 0x3;
            int var21 = field342[var19];
            int var22 = field324.method2593();
            int var23 = (var22 >> 4 & 0x7) + Statics.field1730;
            int var24 = (var22 & 0x7) + Statics.field2722;
            int var25 = field324.method2606();
            if (var23 >= 0 && var24 >= 0 && var23 < 103 && var24 < 103) {
                if (var21 == 0) {
                    class91 var26 = Statics.field1542.method1614(Statics.field1559, var23, var24);
                    if (var26 != null) {
                        int var27 = var26.field1547 >> 14 & 0x7FFF;
                        if (var19 == 2) {
                            var26.field1551 = new class50(var27, 2, var20 + 4, Statics.field1559, var23, var24, var25, false, var26.field1551);
                            var26.field1550 = new class50(var27, 2, var20 + 1 & 0x3, Statics.field1559, var23, var24, var25, false, var26.field1550);
                        } else {
                            var26.field1551 = new class50(var27, var19, var20, Statics.field1559, var23, var24, var25, false, var26.field1551);
                        }
                    }
                }
                if (var21 == 1) {
                    class96 var28 = Statics.field1542.method1695(Statics.field1559, var23, var24);
                    if (var28 != null) {
                        int var29 = var28.field1606 >> 14 & 0x7FFF;
                        if (var19 == 4 || var19 == 5) {
                            var28.field1604 = new class50(var29, 4, var20, Statics.field1559, var23, var24, var25, false, var28.field1604);
                        } else if (var19 == 6) {
                            var28.field1604 = new class50(var29, 4, var20 + 4, Statics.field1559, var23, var24, var25, false, var28.field1604);
                        } else if (var19 == 7) {
                            var28.field1604 = new class50(var29, 4, (var20 + 2 & 0x3) + 4, Statics.field1559, var23, var24, var25, false, var28.field1604);
                        } else if (var19 == 8) {
                            var28.field1604 = new class50(var29, 4, var20 + 4, Statics.field1559, var23, var24, var25, false, var28.field1604);
                            var28.field1607 = new class50(var29, 4, (var20 + 2 & 0x3) + 4, Statics.field1559, var23, var24, var25, false, var28.field1607);
                        }
                    }
                }
                if (var21 == 2) {
                    class97 var30 = Statics.field1542.method1625(Statics.field1559, var23, var24);
                    if (var19 == 11) {
                        var19 = 10;
                    }
                    if (var30 != null) {
                        var30.field1613 = new class50(var30.field1618 >> 14 & 0x7FFF, var19, var20, Statics.field1559, var23, var24, var25, false, var30.field1613);
                    }
                }
                if (var21 == 3) {
                    class79 var31 = Statics.field1542.method1681(Statics.field1559, var23, var24);
                    if (var31 != null) {
                        var31.field1293 = new class50(var31.field1290 >> 14 & 0x7FFF, 22, var20, Statics.field1559, var23, var24, var25, false, var31.field1293);
                    }
                }
            }
        } else {
            if (field326 == 156) {
                int var32 = field324.method2595();
                int var33 = field324.method2606();
                byte var34 = field324.method2753();
                byte var35 = field324.method2631();
                byte var36 = field324.method2631();
                int var37 = field324.method2627();
                int var38 = (var37 >> 4 & 0x7) + Statics.field1730;
                int var39 = (var37 & 0x7) + Statics.field2722;
                int var40 = field324.method2712();
                int var41 = field324.method2733();
                int var42 = var41 >> 2;
                int var43 = var41 & 0x3;
                int var44 = field342[var42];
                byte var45 = field324.method2753();
                int var46 = field324.method2595();
                class24 var47;
                if (field409 == var40) {
                    var47 = Statics.field169;
                } else {
                    var47 = field400[var40];
                }
                if (var47 != null) {
                    class198 var48 = class198.method3716(var33);
                    int var49;
                    int var50;
                    if (var43 == 1 || var43 == 3) {
                        var49 = var48.field2906;
                        var50 = var48.field2917;
                    } else {
                        var49 = var48.field2917;
                        var50 = var48.field2906;
                    }
                    int var51 = (var49 >> 1) + var38;
                    int var52 = (var49 + 1 >> 1) + var38;
                    int var53 = (var50 >> 1) + var39;
                    int var54 = (var50 + 1 >> 1) + var39;
                    int[][] var55 = class11.field94[Statics.field1559];
                    int var56 = var55[var51][var53] + var55[var52][var53] + var55[var51][var54] + var55[var52][var54] >> 2;
                    int var57 = (var38 << 7) + (var49 << 6);
                    int var58 = (var39 << 7) + (var50 << 6);
                    class83 var59 = var48.method3361(var42, var43, var55, var57, var56, var58);
                    if (var59 != null) {
                        method3026(Statics.field1559, var38, var39, var44, -1, 0, 0, var32 + 1, var46 + 1);
                        var47.field255 = field289 + var32;
                        var47.field248 = field289 + var46;
                        var47.field252 = var59;
                        var47.field249 = var38 * 128 + var49 * 64;
                        var47.field251 = var39 * 128 + var50 * 64;
                        var47.field262 = var56;
                        if (var35 > var34) {
                            byte var60 = var35;
                            var35 = var34;
                            var34 = var60;
                        }
                        if (var45 > var36) {
                            byte var61 = var45;
                            var45 = var36;
                            var36 = var61;
                        }
                        var47.field253 = var35 + var38;
                        var47.field265 = var34 + var38;
                        var47.field259 = var39 + var45;
                        var47.field256 = var36 + var39;
                    }
                }
            }
            if (field326 == 231) {
                int var62 = field324.method2733();
                int var63 = (var62 >> 4 & 0x7) + Statics.field1730;
                int var64 = (var62 & 0x7) + Statics.field2722;
                int var65 = field324.method2733();
                int var66 = var65 >> 2;
                int var67 = var65 & 0x3;
                int var68 = field342[var66];
                if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                    method3026(Statics.field1559, var63, var64, var68, -1, var66, var67, 0, -1);
                }
            } else if (field326 == 241) {
                int var69 = field324.method2606();
                int var70 = field324.method2593();
                int var71 = (var70 >> 4 & 0x7) + Statics.field1730;
                int var72 = (var70 & 0x7) + Statics.field2722;
                if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104) {
                    class129 var73 = field410[Statics.field1559][var71][var72];
                    if (var73 != null) {
                        for (class44 var74 = (class44) var73.method2237(); var74 != null; var74 = (class44) var73.method2251()) {
                            if ((var69 & 0x7FFF) == var74.field884) {
                                var74.method2225();
                                break;
                            }
                        }
                        if (var73.method2237() == null) {
                            field410[Statics.field1559][var71][var72] = null;
                        }
                        method185(var71, var72);
                    }
                }
            } else if (field326 == 7) {
                int var75 = field324.method2593();
                int var76 = (var75 >> 4 & 0x7) + Statics.field1730;
                int var77 = (var75 & 0x7) + Statics.field2722;
                int var78 = field324.method2595();
                int var79 = field324.method2595();
                int var80 = field324.method2595();
                if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                    class129 var81 = field410[Statics.field1559][var76][var77];
                    if (var81 != null) {
                        for (class44 var82 = (class44) var81.method2237(); var82 != null; var82 = (class44) var81.method2251()) {
                            if ((var78 & 0x7FFF) == var82.field884 && var82.field887 == var79) {
                                var82.field887 = var80;
                                break;
                            }
                        }
                        method185(var76, var77);
                    }
                }
            } else if (field326 == 37) {
                int var83 = field324.method2595();
                int var84 = field324.method2595();
                int var85 = field324.method2733();
                int var86 = (var85 >> 4 & 0x7) + Statics.field1730;
                int var87 = (var85 & 0x7) + Statics.field2722;
                if (var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104) {
                    class44 var88 = new class44();
                    var88.field884 = var84;
                    var88.field887 = var83;
                    if (field410[Statics.field1559][var86][var87] == null) {
                        field410[Statics.field1559][var86][var87] = new class129();
                    }
                    field410[Statics.field1559][var86][var87].method2232(var88);
                    method185(var86, var87);
                }
            } else {
                if (field326 == 92) {
                    int var89 = field324.method2593();
                    int var90 = (var89 >> 4 & 0x7) + Statics.field1730;
                    int var91 = (var89 & 0x7) + Statics.field2722;
                    int var92 = field324.method2595();
                    int var93 = field324.method2593();
                    int var94 = var93 >> 4 & 0xF;
                    int var95 = var93 & 0x7;
                    int var96 = field324.method2593();
                    if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104) {
                        int var97 = var94 + 1;
                        if (Statics.field169.field636[0] >= var90 - var97 && Statics.field169.field636[0] <= var90 + var97 && Statics.field169.field630[0] >= var91 - var97 && Statics.field169.field630[0] <= var91 + var97 && field519 != 0 && var95 > 0 && field371 < 50) {
                            field521[field371] = var92;
                            field522[field371] = var95;
                            field523[field371] = var96;
                            field303[field371] = null;
                            field524[field371] = (var90 << 16) + (var91 << 8) + var94;
                            field371++;
                        }
                    }
                }
                if (field326 == 136) {
                    int var98 = field324.method2593();
                    int var99 = (var98 >> 4 & 0x7) + Statics.field1730;
                    int var100 = (var98 & 0x7) + Statics.field2722;
                    int var101 = field324.method2595();
                    int var102 = field324.method2593();
                    int var103 = field324.method2595();
                    if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
                        int var104 = var99 * 128 + 64;
                        int var105 = var100 * 128 + 64;
                        class34 var106 = new class34(var101, Statics.field1559, var104, var105, method1105(var104, var105, Statics.field1559) - var102, var103, field289);
                        field413.method2232(var106);
                    }
                } else if (field326 == 219) {
                    int var107 = field324.method2627();
                    int var108 = var107 >> 2;
                    int var109 = var107 & 0x3;
                    int var110 = field342[var108];
                    int var111 = field324.method2629();
                    int var112 = field324.method2733();
                    int var113 = (var112 >> 4 & 0x7) + Statics.field1730;
                    int var114 = (var112 & 0x7) + Statics.field2722;
                    if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104) {
                        method3026(Statics.field1559, var113, var114, var110, var111, var108, var109, 0, -1);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fr.bx(IIIIIIIIII)V")
    public static final void method3026(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class26 var9 = null;
        for (class26 var10 = (class26) field411.method2237(); var10 != null; var10 = (class26) field411.method2251()) {
            if (var10.field566 == arg0 && var10.field561 == arg1 && var10.field563 == arg2 && var10.field560 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class26();
            var9.field566 = arg0;
            var9.field560 = arg3;
            var9.field561 = arg1;
            var9.field563 = arg2;
            method677(var9);
            field411.method2232(var9);
        }
        var9.field573 = arg4;
        var9.field569 = arg5;
        var9.field568 = arg6;
        var9.field570 = arg7;
        var9.field571 = arg8;
    }

    @ObfuscatedName("ar.bn(Le;I)V")
    public static final void method677(class26 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field560 == 0) {
            var1 = Statics.field1542.method1680(arg0.field566, arg0.field561, arg0.field563);
        }
        if (arg0.field560 == 1) {
            var1 = Statics.field1542.method1628(arg0.field566, arg0.field561, arg0.field563);
        }
        if (arg0.field560 == 2) {
            var1 = Statics.field1542.method1629(arg0.field566, arg0.field561, arg0.field563);
        }
        if (arg0.field560 == 3) {
            var1 = Statics.field1542.method1643(arg0.field566, arg0.field561, arg0.field563);
        }
        if (var1 != 0) {
            int var5 = Statics.field1542.method1631(arg0.field566, arg0.field561, arg0.field563, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field564 = var2;
        arg0.field572 = var3;
        arg0.field565 = var4;
    }

    @ObfuscatedName("dd.ba(IIIIIIII)V")
    public static final void method1884(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field284 && Statics.field1559 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1542.method1680(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1542.method1628(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1542.method1629(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1542.method1643(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1542.method1631(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1542.method1618(arg0, arg2, arg3);
                class198 var15 = class198.method3716(var12);
                if (var15.field2907 != 0) {
                    field339[arg0].method2087(arg2, arg3, var13, var14, var15.field2935);
                }
            }
            if (arg1 == 1) {
                Statics.field1542.method1619(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1542.method1732(arg0, arg2, arg3);
                class198 var16 = class198.method3716(var12);
                if (var16.field2917 + arg2 > 103 || var16.field2917 + arg3 > 103 || var16.field2906 + arg2 > 103 || var16.field2906 + arg3 > 103) {
                    return;
                }
                if (var16.field2907 != 0) {
                    field339[arg0].method2095(arg2, arg3, var16.field2917, var16.field2906, var14, var16.field2935);
                }
            }
            if (arg1 == 3) {
                Statics.field1542.method1621(arg0, arg2, arg3);
                class198 var17 = class198.method3716(var12);
                if (var17.field2907 == 1) {
                    field339[arg0].method2097(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class11.field87[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class88 var19 = Statics.field1542;
        class118 var20 = field339[arg0];
        class198 var21 = class198.method3716(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field2906;
            var23 = var21.field2917;
        } else {
            var22 = var21.field2917;
            var23 = var21.field2906;
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
        int[][] var28 = class11.field94[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field2909 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field2930 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class90 var34;
            if (var21.field2913 == -1 && var21.field2896 == null) {
                var34 = var21.method3361(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class50(arg4, 22, arg5, var18, arg2, arg3, var21.field2913, true, (class90) null);
            }
            var19.method1607(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field2907 == 1) {
                var20.method2085(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class90 var57;
            if (var21.field2913 == -1 && var21.field2896 == null) {
                var57 = var21.method3361(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class50(arg4, 10, arg5, var18, arg2, arg3, var21.field2913, true, (class90) null);
            }
            if (var57 != null) {
                var19.method1611(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field2907 != 0) {
                var20.method2083(arg2, arg3, var22, var23, var21.field2935);
            }
        } else if (arg6 >= 12) {
            class90 var35;
            if (var21.field2913 == -1 && var21.field2896 == null) {
                var35 = var21.method3361(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class50(arg4, arg6, arg5, var18, arg2, arg3, var21.field2913, true, (class90) null);
            }
            var19.method1611(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field2907 != 0) {
                var20.method2083(arg2, arg3, var22, var23, var21.field2935);
            }
        } else if (arg6 == 0) {
            class90 var36;
            if (var21.field2913 == -1 && var21.field2896 == null) {
                var36 = var21.method3361(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class50(arg4, 0, arg5, var18, arg2, arg3, var21.field2913, true, (class90) null);
            }
            var19.method1769(arg0, arg2, arg3, var29, var36, (class90) null, class11.field92[arg5], 0, var32, var33);
            if (var21.field2907 != 0) {
                var20.method2082(arg2, arg3, arg6, arg5, var21.field2935);
            }
        } else if (arg6 == 1) {
            class90 var37;
            if (var21.field2913 == -1 && var21.field2896 == null) {
                var37 = var21.method3361(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class50(arg4, 1, arg5, var18, arg2, arg3, var21.field2913, true, (class90) null);
            }
            var19.method1769(arg0, arg2, arg3, var29, var37, (class90) null, class11.field93[arg5], 0, var32, var33);
            if (var21.field2907 != 0) {
                var20.method2082(arg2, arg3, arg6, arg5, var21.field2935);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class90 var39;
            class90 var40;
            if (var21.field2913 == -1 && var21.field2896 == null) {
                var39 = var21.method3361(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method3361(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class50(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field2913, true, (class90) null);
                var40 = new class50(arg4, 2, var38, var18, arg2, arg3, var21.field2913, true, (class90) null);
            }
            var19.method1769(arg0, arg2, arg3, var29, var39, var40, class11.field92[arg5], class11.field92[var38], var32, var33);
            if (var21.field2907 != 0) {
                var20.method2082(arg2, arg3, arg6, arg5, var21.field2935);
            }
        } else if (arg6 == 3) {
            class90 var41;
            if (var21.field2913 == -1 && var21.field2896 == null) {
                var41 = var21.method3361(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class50(arg4, 3, arg5, var18, arg2, arg3, var21.field2913, true, (class90) null);
            }
            var19.method1769(arg0, arg2, arg3, var29, var41, (class90) null, class11.field93[arg5], 0, var32, var33);
            if (var21.field2907 != 0) {
                var20.method2082(arg2, arg3, arg6, arg5, var21.field2935);
            }
        } else if (arg6 == 9) {
            class90 var42;
            if (var21.field2913 == -1 && var21.field2896 == null) {
                var42 = var21.method3361(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class50(arg4, arg6, arg5, var18, arg2, arg3, var21.field2913, true, (class90) null);
            }
            var19.method1611(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field2907 != 0) {
                var20.method2083(arg2, arg3, var22, var23, var21.field2935);
            }
        } else if (arg6 == 4) {
            class90 var43;
            if (var21.field2913 == -1 && var21.field2896 == null) {
                var43 = var21.method3361(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class50(arg4, 4, arg5, var18, arg2, arg3, var21.field2913, true, (class90) null);
            }
            var19.method1659(arg0, arg2, arg3, var29, var43, (class90) null, class11.field92[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1680(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class198.method3716(var45 >> 14 & 0x7FFF).field2936;
            }
            class90 var46;
            if (var21.field2913 == -1 && var21.field2896 == null) {
                var46 = var21.method3361(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class50(arg4, 4, arg5, var18, arg2, arg3, var21.field2913, true, (class90) null);
            }
            var19.method1659(arg0, arg2, arg3, var29, var46, (class90) null, class11.field92[arg5], 0, class11.field96[arg5] * var44, class11.field95[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1680(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class198.method3716(var48 >> 14 & 0x7FFF).field2936 / 2;
            }
            class90 var49;
            if (var21.field2913 == -1 && var21.field2896 == null) {
                var49 = var21.method3361(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class50(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field2913, true, (class90) null);
            }
            var19.method1659(arg0, arg2, arg3, var29, var49, (class90) null, 256, arg5, class11.field86[arg5] * var47, class11.field97[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class90 var51;
            if (var21.field2913 == -1 && var21.field2896 == null) {
                var51 = var21.method3361(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class50(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field2913, true, (class90) null);
            }
            var19.method1659(arg0, arg2, arg3, var29, var51, (class90) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1680(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class198.method3716(var53 >> 14 & 0x7FFF).field2936 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class90 var55;
            class90 var56;
            if (var21.field2913 == -1 && var21.field2896 == null) {
                var55 = var21.method3361(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method3361(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class50(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field2913, true, (class90) null);
                var56 = new class50(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field2913, true, (class90) null);
            }
            var19.method1659(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class11.field86[arg5] * var52, class11.field97[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("i.bi(IIB)V")
    public static final void method185(int arg0, int arg1) {
        class129 var2 = field410[Statics.field1559][arg0][arg1];
        if (var2 == null) {
            Statics.field1542.method1622(Statics.field1559, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class44 var5 = null;
        for (class44 var6 = (class44) var2.method2237(); var6 != null; var6 = (class44) var2.method2251()) {
            class199 var7 = class199.method713(var6.field884);
            long var8 = (long) var7.field2959;
            if (var7.field2961 == 1) {
                var8 = (long) (var6.field887 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1542.method1622(Statics.field1559, arg0, arg1);
            return;
        }
        var2.method2233(var5);
        class44 var10 = null;
        class44 var11 = null;
        for (class44 var12 = (class44) var2.method2237(); var12 != null; var12 = (class44) var2.method2251()) {
            if (var5.field884 != var12.field884) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field884 != var12.field884 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1542.method1639(Statics.field1559, arg0, arg1, method1105(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1559), var5, var13, var10, var11);
    }

    @ObfuscatedName("s.bc(ZI)V")
    public static final void method101(boolean arg0) {
        field403 = 0;
        field555 = 0;
        field324.method2821();
        int var1 = field324.method2828(8);
        if (var1 < field317) {
            for (int var2 = var1; var2 < field317; var2++) {
                field404[++field403 - 1] = field420[var2];
            }
        }
        if (var1 > field317) {
            throw new RuntimeException("");
        }
        field317 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field420[var3];
            class36 var5 = field285[var4];
            int var6 = field324.method2828(1);
            if (var6 == 0) {
                field420[++field317 - 1] = var4;
                var5.field642 = field289;
            } else {
                int var7 = field324.method2828(2);
                if (var7 == 0) {
                    field420[++field317 - 1] = var4;
                    var5.field642 = field289;
                    field320[++field555 - 1] = var4;
                } else if (var7 == 1) {
                    field420[++field317 - 1] = var4;
                    var5.field642 = field289;
                    int var8 = field324.method2828(3);
                    var5.method698(var8, (byte) 1);
                    int var9 = field324.method2828(1);
                    if (var9 == 1) {
                        field320[++field555 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field420[++field317 - 1] = var4;
                    var5.field642 = field289;
                    int var10 = field324.method2828(3);
                    var5.method698(var10, (byte) 2);
                    int var11 = field324.method2828(3);
                    var5.method698(var11, (byte) 2);
                    int var12 = field324.method2828(1);
                    if (var12 == 1) {
                        field320[++field555 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field404[++field403 - 1] = var4;
                }
            }
        }
        while (field324.method2811(field542) >= 27) {
            int var13 = field324.method2828(15);
            if (var13 == 32767) {
                break;
            }
            boolean var43 = false;
            if (field285[var13] == null) {
                field285[var13] = new class36();
                var43 = true;
            }
            class36 var44 = field285[var13];
            field420[++field317 - 1] = var13;
            var44.field642 = field289;
            var44.field763 = class200.method1450(field324.method2828(14));
            int var45 = field324.method2828(1);
            if (var45 == 1) {
                field320[++field555 - 1] = var13;
            }
            int var46 = field324.method2828(1);
            int var47;
            if (arg0) {
                var47 = field324.method2828(8);
                if (var47 > 127) {
                    var47 -= 256;
                }
            } else {
                var47 = field324.method2828(5);
                if (var47 > 15) {
                    var47 -= 32;
                }
            }
            int var48;
            if (arg0) {
                var48 = field324.method2828(8);
                if (var48 > 127) {
                    var48 -= 256;
                }
            } else {
                var48 = field324.method2828(5);
                if (var48 > 15) {
                    var48 -= 32;
                }
            }
            int var49 = field419[field324.method2828(3)];
            if (var43) {
                var44.field644 = var44.field626 = var49;
            }
            var44.field597 = var44.field763.field3000;
            var44.field646 = var44.field763.field2994;
            if (var44.field646 == 0) {
                var44.field626 = 0;
            }
            var44.field601 = var44.field763.field3006;
            var44.field602 = var44.field763.field3007;
            var44.field603 = var44.field763.field3008;
            var44.field604 = var44.field763.field3009;
            var44.field598 = var44.field763.field3023;
            var44.field599 = var44.field763.field3004;
            var44.field600 = var44.field763.field3019;
            var44.method693(Statics.field169.field636[0] + var48, Statics.field169.field630[0] + var47, var46 == 1);
        }
        field324.method2810();
        for (int var14 = 0; var14 < field555; var14++) {
            int var15 = field320[var14];
            class36 var16 = field285[var15];
            int var17 = field324.method2593();
            if ((var17 & 0x8) != 0) {
                int var18 = field324.method2733();
                if (var18 > 0) {
                    for (int var19 = 0; var19 < var18; var19++) {
                        int var20 = -1;
                        int var21 = -1;
                        int var22 = -1;
                        int var23 = field324.method2758();
                        if (var23 == 32767) {
                            var23 = field324.method2758();
                            var21 = field324.method2758();
                            var20 = field324.method2758();
                            var22 = field324.method2758();
                        } else if (var23 == 32766) {
                            var23 = -1;
                        } else {
                            var21 = field324.method2758();
                        }
                        int var24 = field324.method2758();
                        var16.method591(var23, var21, var20, var22, field289, var24);
                    }
                }
                int var25 = field324.method2593();
                if (var25 > 0) {
                    for (int var26 = 0; var26 < var25; var26++) {
                        int var27 = field324.method2758();
                        int var28 = field324.method2758();
                        if (var28 == 32767) {
                            var16.method583(var27);
                        } else {
                            int var29 = field324.method2758();
                            int var30 = field324.method2593();
                            int var31 = var28 > 0 ? field324.method2621() : var30;
                            var16.method586(var27, field289, var28, var29, var30, var31);
                        }
                    }
                }
            }
            if ((var17 & 0x40) != 0) {
                int var32 = field324.method2712();
                int var33 = field324.method2712();
                int var34 = var16.field622 - (var32 - Statics.field878 - Statics.field878) * 64;
                int var35 = var16.field639 - (var33 - Statics.field33 - Statics.field33) * 64;
                if (var34 != 0 || var35 != 0) {
                    var16.field621 = (int) (Math.atan2((double) var34, (double) var35) * 325.949D) & 0x7FF;
                }
            }
            if ((var17 & 0x2) != 0) {
                var16.field641 = field324.method2606();
                if (var16.field641 == 65535) {
                    var16.field641 = -1;
                }
            }
            if ((var17 & 0x10) != 0) {
                var16.field763 = class200.method1450(field324.method2595());
                var16.field597 = var16.field763.field3000;
                var16.field646 = var16.field763.field2994;
                var16.field601 = var16.field763.field3006;
                var16.field602 = var16.field763.field3007;
                var16.field603 = var16.field763.field3008;
                var16.field604 = var16.field763.field3009;
                var16.field598 = var16.field763.field3023;
                var16.field599 = var16.field763.field3004;
                var16.field600 = var16.field763.field3019;
            }
            if ((var17 & 0x4) != 0) {
                var16.field606 = field324.method2625();
                var16.field609 = 100;
            }
            if ((var17 & 0x20) != 0) {
                var16.field629 = field324.method2595();
                int var36 = field324.method2610();
                var16.field634 = var36 >> 16;
                var16.field619 = (var36 & 0xFFFF) + field289;
                var16.field631 = 0;
                var16.field632 = 0;
                if (var16.field619 > field289) {
                    var16.field631 = -1;
                }
                if (var16.field629 == 65535) {
                    var16.field629 = -1;
                }
            }
            if ((var17 & 0x1) != 0) {
                int var37 = field324.method2606();
                if (var37 == 65535) {
                    var37 = -1;
                }
                int var38 = field324.method2627();
                if (var16.field625 == var37 && var37 != -1) {
                    int var39 = class202.method2533(var37).field3063;
                    if (var39 == 1) {
                        var16.field615 = 0;
                        var16.field627 = 0;
                        var16.field633 = var38;
                        var16.field649 = 0;
                    }
                    if (var39 == 2) {
                        var16.field649 = 0;
                    }
                } else if (var37 == -1 || var16.field625 == -1 || class202.method2533(var37).field3057 >= class202.method2533(var16.field625).field3057) {
                    var16.field625 = var37;
                    var16.field615 = 0;
                    var16.field627 = 0;
                    var16.field633 = var38;
                    var16.field649 = 0;
                    var16.field652 = var16.field647;
                }
            }
        }
        for (int var40 = 0; var40 < field403; var40++) {
            int var41 = field404[var40];
            if (field289 != field285[var41].field642) {
                field285[var41].field763 = null;
                field285[var41] = null;
            }
        }
        if (field542 != field324.field2098) {
            throw new RuntimeException(field324.field2098 + class38.field776 + field542);
        }
        for (int var42 = 0; var42 < field317; var42++) {
            if (field285[field420[var42]] == null) {
                throw new RuntimeException(var42 + class38.field776 + field317);
            }
        }
    }

    @ObfuscatedName("cu.bs(I)V")
    public static final void method1809() {
        int var0 = Statics.field2743;
        int var1 = Statics.field1678;
        int var2 = Statics.field275;
        int var3 = Statics.field2640;
        int var4 = 6116423;
        class220.method3766(var0, var1, var2, var3, var4);
        class220.method3766(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class220.method3743(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1347.method3628(class174.field2503, var0 + 3, var1 + 14, var4, -1);
        int var5 = class116.field1806;
        int var6 = class116.field1815 * -693183961;
        for (int var7 = 0; var7 < field460; var7++) {
            int var8 = (field460 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class209 var10 = Statics.field1347;
            String var11;
            if (field454[var7].length() > 0) {
                var11 = field424[var7] + class174.field2431 + field454[var7];
            } else {
                var11 = field424[var7];
            }
            var10.method3628(var11, var0 + 3, var8, var9, 0);
        }
        method2886(Statics.field2743, Statics.field1678, Statics.field275, Statics.field2640);
    }

    @ObfuscatedName("ay.bw(IIIII)V")
    public static final void method704(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field481; var4++) {
            if (field487[var4] + field486[var4] > arg0 && field486[var4] < arg0 + arg2 && field544[var4] + field489[var4] > arg1 && field544[var4] < arg1 + arg3) {
                field483[var4] = true;
            }
        }
    }

    @ObfuscatedName("fo.bv(IIIII)V")
    public static final void method2886(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field481; var4++) {
            if (field487[var4] + field486[var4] > arg0 && field486[var4] < arg0 + arg2 && field544[var4] + field489[var4] > arg1 && field544[var4] < arg1 + arg3) {
                field484[var4] = true;
            }
        }
    }

    @ObfuscatedName("gw.bt(III)V")
    public static final void method3216(int arg0, int arg1) {
        int var2 = Statics.field1347.method3623(class174.field2503);
        for (int var3 = 0; var3 < field460; var3++) {
            class209 var4 = Statics.field1347;
            String var5;
            if (field454[var3].length() > 0) {
                var5 = field424[var3] + class174.field2431 + field454[var3];
            } else {
                var5 = field424[var3];
            }
            int var6 = var4.method3623(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field460 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field578) {
            var8 = Statics.field578 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field2777) {
            var9 = Statics.field2777 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        Statics.field1542.method1638(Statics.field1559, arg0, arg1, false);
        field416 = true;
        Statics.field2743 = var8;
        Statics.field1678 = var9;
        Statics.field275 = var2;
        Statics.field2640 = field460 * 15 + 22;
    }

    @ObfuscatedName("r.bq(IB)V")
    public static final void method178(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field510[arg0];
        int var2 = field547[arg0];
        int var3 = field422[arg0];
        int var4 = field423[arg0];
        String var5 = field424[arg0];
        String var6 = field454[arg0];
        method72(var1, var2, var3, var4, var5, var6, class116.field1812, class116.field1813);
    }

    @ObfuscatedName("ao.bk(Laa;III)V")
    public static final void method733(class39 arg0, int arg1, int arg2) {
        method72(arg0.field795, arg0.field792, arg0.field791, arg0.field794, arg0.field797, arg0.field797, arg1, arg2);
    }

    @ObfuscatedName("k.bh(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method72(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 58) {
            class170 var8 = class170.method1862(arg1, arg0);
            if (var8 != null) {
                field395.method2804(116);
                field395.method2581(Statics.field815);
                field395.method2616(field434);
                field395.method2781(arg1);
                field395.method2616(var8.field2317);
                field395.method2616(arg0);
                field395.method2624(field435);
            }
        }
        if (arg2 == 1003) {
            field421 = arg6;
            field465 = arg7;
            field372 = 2;
            field389 = 0;
            class36 var9 = field285[arg3];
            if (var9 != null) {
                class200 var10 = var9.field763;
                if (var10.field3024 != null) {
                    var10 = var10.method3461();
                }
                if (var10 != null) {
                    field395.method2804(8);
                    field395.method2624(var10.field3010);
                }
            }
        }
        if (arg2 == 15) {
            class24 var11 = field400[arg3];
            if (var11 != null) {
                field421 = arg6;
                field465 = arg7;
                field372 = 2;
                field389 = 0;
                field512 = arg0;
                field513 = arg1;
                field395.method2804(117);
                field395.method2581(Statics.field815);
                field395.method2578(class106.field1709[82] ? 1 : 0);
                field395.method2683(field434);
                field395.method2683(arg3);
            }
        }
        if (arg2 == 11) {
            class36 var12 = field285[arg3];
            if (var12 != null) {
                field421 = arg6;
                field465 = arg7;
                field372 = 2;
                field389 = 0;
                field512 = arg0;
                field513 = arg1;
                field395.method2804(198);
                field395.method2624(arg3);
                field395.method2578(class106.field1709[82] ? 1 : 0);
            }
        }
        if (arg2 == 10) {
            class36 var13 = field285[arg3];
            if (var13 != null) {
                field421 = arg6;
                field465 = arg7;
                field372 = 2;
                field389 = 0;
                field512 = arg0;
                field513 = arg1;
                field395.method2804(218);
                field395.method2617(class106.field1709[82] ? 1 : 0);
                field395.method2649(arg3);
            }
        }
        if (arg2 == 48) {
            class24 var14 = field400[arg3];
            if (var14 != null) {
                field421 = arg6;
                field465 = arg7;
                field372 = 2;
                field389 = 0;
                field512 = arg0;
                field513 = arg1;
                field395.method2804(31);
                field395.method2616(arg3);
                field395.method2734(class106.field1709[82] ? 1 : 0);
            }
        }
        if (arg2 == 28) {
            field395.method2804(238);
            field395.method2581(arg1);
            class170 var15 = class170.method723(arg1);
            if (var15.field2309 != null && var15.field2309[0][0] == 5) {
                int var16 = var15.field2309[0][1];
                class166.field2159[var16] = 1 - class166.field2159[var16];
                method719(var16);
            }
        }
        if (arg2 == 5) {
            field421 = arg6;
            field465 = arg7;
            field372 = 2;
            field389 = 0;
            field512 = arg0;
            field513 = arg1;
            field395.method2804(96);
            field395.method2683(arg3 >> 14 & 0x7FFF);
            field395.method2616(Statics.field33 + arg1);
            field395.method2616(Statics.field878 + arg0);
            field395.method2734(class106.field1709[82] ? 1 : 0);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class170 var17 = class170.method1862(arg1, arg0);
            if (var17 != null) {
                int var18 = var17.field2317;
                class170 var19 = class170.method1862(arg1, arg0);
                if (var19 != null) {
                    if (var19.field2297 != null) {
                        class19 var20 = new class19();
                        var20.field181 = var19;
                        var20.field188 = arg3;
                        var20.field191 = arg5;
                        var20.field189 = var19.field2297;
                        class33.method161(var20, 200000);
                    }
                    boolean var21 = true;
                    if (var19.field2201 > 0) {
                        var21 = method43(var19);
                    }
                    if (var21) {
                        int var22 = method711(var19);
                        int var23 = arg3 - 1;
                        boolean var24 = (var22 >> var23 + 1 & 0x1) != 0;
                        if (var24) {
                            if (arg3 == 1) {
                                field395.method2804(189);
                                field395.method2581(arg1);
                                field395.method2616(arg0);
                                field395.method2616(var18);
                            }
                            if (arg3 == 2) {
                                field395.method2804(115);
                                field395.method2581(arg1);
                                field395.method2616(arg0);
                                field395.method2616(var18);
                            }
                            if (arg3 == 3) {
                                field395.method2804(185);
                                field395.method2581(arg1);
                                field395.method2616(arg0);
                                field395.method2616(var18);
                            }
                            if (arg3 == 4) {
                                field395.method2804(140);
                                field395.method2581(arg1);
                                field395.method2616(arg0);
                                field395.method2616(var18);
                            }
                            if (arg3 == 5) {
                                field395.method2804(97);
                                field395.method2581(arg1);
                                field395.method2616(arg0);
                                field395.method2616(var18);
                            }
                            if (arg3 == 6) {
                                field395.method2804(233);
                                field395.method2581(arg1);
                                field395.method2616(arg0);
                                field395.method2616(var18);
                            }
                            if (arg3 == 7) {
                                field395.method2804(251);
                                field395.method2581(arg1);
                                field395.method2616(arg0);
                                field395.method2616(var18);
                            }
                            if (arg3 == 8) {
                                field395.method2804(217);
                                field395.method2581(arg1);
                                field395.method2616(arg0);
                                field395.method2616(var18);
                            }
                            if (arg3 == 9) {
                                field395.method2804(215);
                                field395.method2581(arg1);
                                field395.method2616(arg0);
                                field395.method2616(var18);
                            }
                            if (arg3 == 10) {
                                field395.method2804(194);
                                field395.method2581(arg1);
                                field395.method2616(arg0);
                                field395.method2616(var18);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 6) {
            field421 = arg6;
            field465 = arg7;
            field372 = 2;
            field389 = 0;
            field512 = arg0;
            field513 = arg1;
            field395.method2804(202);
            field395.method2578(class106.field1709[82] ? 1 : 0);
            field395.method2649(Statics.field33 + arg1);
            field395.method2616(Statics.field878 + arg0);
            field395.method2649(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 22) {
            field421 = arg6;
            field465 = arg7;
            field372 = 2;
            field389 = 0;
            field512 = arg0;
            field513 = arg1;
            field395.method2804(19);
            field395.method2683(Statics.field33 + arg1);
            field395.method2649(arg3);
            field395.method2649(Statics.field878 + arg0);
            field395.method2617(class106.field1709[82] ? 1 : 0);
        }
        if (arg2 == 18) {
            field421 = arg6;
            field465 = arg7;
            field372 = 2;
            field389 = 0;
            field512 = arg0;
            field513 = arg1;
            field395.method2804(128);
            field395.method2616(Statics.field878 + arg0);
            field395.method2616(Statics.field33 + arg1);
            field395.method2734(class106.field1709[82] ? 1 : 0);
            field395.method2683(arg3);
        }
        if (arg2 == 26) {
            field395.method2804(181);
            for (class18 var25 = (class18) field439.method2186(); var25 != null; var25 = (class18) field439.method2194()) {
                if (var25.field176 == 0 || var25.field176 == 3) {
                    method118(var25, true);
                }
            }
            if (field442 != null) {
                method676(field442);
                field442 = null;
            }
        }
        if (arg2 == 31) {
            field395.method2804(157);
            field395.method2624(arg0);
            field395.method2624(arg3);
            field395.method2581(arg1);
            field395.method2624(Statics.field203);
            field395.method2581(Statics.field473);
            field395.method2683(Statics.field2769);
            field391 = 0;
            Statics.field1064 = class170.method723(arg1);
            field392 = arg0;
        }
        if (arg2 == 41) {
            field395.method2804(154);
            field395.method2616(arg3);
            field395.method2626(arg1);
            field395.method2616(arg0);
            field391 = 0;
            Statics.field1064 = class170.method723(arg1);
            field392 = arg0;
        }
        if (arg2 == 8) {
            class36 var26 = field285[arg3];
            if (var26 != null) {
                field421 = arg6;
                field465 = arg7;
                field372 = 2;
                field389 = 0;
                field512 = arg0;
                field513 = arg1;
                field395.method2804(27);
                field395.method2581(Statics.field815);
                field395.method2624(field434);
                field395.method2617(class106.field1709[82] ? 1 : 0);
                field395.method2616(arg3);
            }
        }
        if (arg2 == 2) {
            field421 = arg6;
            field465 = arg7;
            field372 = 2;
            field389 = 0;
            field512 = arg0;
            field513 = arg1;
            field395.method2804(4);
            field395.method2626(Statics.field815);
            field395.method2683(Statics.field878 + arg0);
            field395.method2624(field434);
            field395.method2616(Statics.field33 + arg1);
            field395.method2624(arg3 >> 14 & 0x7FFF);
            field395.method2734(class106.field1709[82] ? 1 : 0);
        }
        if (arg2 == 14) {
            class24 var27 = field400[arg3];
            if (var27 != null) {
                field421 = arg6;
                field465 = arg7;
                field372 = 2;
                field389 = 0;
                field512 = arg0;
                field513 = arg1;
                field395.method2804(211);
                field395.method2624(arg3);
                field395.method2649(Statics.field203);
                field395.method2578(class106.field1709[82] ? 1 : 0);
                field395.method2649(Statics.field2769);
                field395.method2581(Statics.field473);
            }
        }
        if (arg2 == 50) {
            class24 var28 = field400[arg3];
            if (var28 != null) {
                field421 = arg6;
                field465 = arg7;
                field372 = 2;
                field389 = 0;
                field512 = arg0;
                field513 = arg1;
                field395.method2804(48);
                field395.method2683(arg3);
                field395.method2578(class106.field1709[82] ? 1 : 0);
            }
        }
        if (arg2 == 51) {
            class24 var29 = field400[arg3];
            if (var29 != null) {
                field421 = arg6;
                field465 = arg7;
                field372 = 2;
                field389 = 0;
                field512 = arg0;
                field513 = arg1;
                field395.method2804(43);
                field395.method2616(arg3);
                field395.method2734(class106.field1709[82] ? 1 : 0);
            }
        }
        if (arg2 == 45) {
            class24 var30 = field400[arg3];
            if (var30 != null) {
                field421 = arg6;
                field465 = arg7;
                field372 = 2;
                field389 = 0;
                field512 = arg0;
                field513 = arg1;
                field395.method2804(42);
                field395.method2617(class106.field1709[82] ? 1 : 0);
                field395.method2616(arg3);
            }
        }
        if (arg2 == 32) {
            field395.method2804(199);
            field395.method2624(arg3);
            field395.method2683(arg0);
            field395.method2781(arg1);
            field395.method2683(field434);
            field395.method2781(Statics.field815);
            field391 = 0;
            Statics.field1064 = class170.method723(arg1);
            field392 = arg0;
        }
        if (arg2 == 13) {
            class36 var31 = field285[arg3];
            if (var31 != null) {
                field421 = arg6;
                field465 = arg7;
                field372 = 2;
                field389 = 0;
                field512 = arg0;
                field513 = arg1;
                field395.method2804(99);
                field395.method2618(class106.field1709[82] ? 1 : 0);
                field395.method2616(arg3);
            }
        }
        if (arg2 == 1005) {
            class170 var32 = class170.method723(arg1);
            if (var32 == null || var32.field2316[arg0] < 100000) {
                field395.method2804(118);
                field395.method2649(arg3);
            } else {
                class48.method1829(27, "", var32.field2316[arg0] + " x " + class199.method713(arg3).field2958);
            }
            field391 = 0;
            Statics.field1064 = class170.method723(arg1);
            field392 = arg0;
        }
        if (arg2 == 1004) {
            field421 = arg6;
            field465 = arg7;
            field372 = 2;
            field389 = 0;
            field395.method2804(118);
            field395.method2649(arg3);
        }
        if (arg2 == 43) {
            field395.method2804(168);
            field395.method2616(arg3);
            field395.method2683(arg0);
            field395.method2634(arg1);
            field391 = 0;
            Statics.field1064 = class170.method723(arg1);
            field392 = arg0;
        }
        if (arg2 == 9) {
            class36 var33 = field285[arg3];
            if (var33 != null) {
                field421 = arg6;
                field465 = arg7;
                field372 = 2;
                field389 = 0;
                field512 = arg0;
                field513 = arg1;
                field395.method2804(171);
                field395.method2617(class106.field1709[82] ? 1 : 0);
                field395.method2683(arg3);
            }
        }
        if (arg2 == 35) {
            field395.method2804(241);
            field395.method2781(arg1);
            field395.method2683(arg3);
            field395.method2683(arg0);
            field391 = 0;
            Statics.field1064 = class170.method723(arg1);
            field392 = arg0;
        }
        if (arg2 == 3) {
            field421 = arg6;
            field465 = arg7;
            field372 = 2;
            field389 = 0;
            field512 = arg0;
            field513 = arg1;
            field395.method2804(61);
            field395.method2624(Statics.field878 + arg0);
            field395.method2617(class106.field1709[82] ? 1 : 0);
            field395.method2649(Statics.field33 + arg1);
            field395.method2616(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 29) {
            field395.method2804(238);
            field395.method2581(arg1);
            class170 var34 = class170.method723(arg1);
            if (var34.field2309 != null && var34.field2309[0][0] == 5) {
                int var35 = var34.field2309[0][1];
                if (class166.field2159[var35] != var34.field2311[0]) {
                    class166.field2159[var35] = var34.field2311[0];
                    method719(var35);
                }
            }
        }
        if (arg2 == 24) {
            class170 var36 = class170.method723(arg1);
            boolean var37 = true;
            if (var36.field2201 > 0) {
                var37 = method43(var36);
            }
            if (var37) {
                field395.method2804(238);
                field395.method2581(arg1);
            }
        }
        if (arg2 == 1001) {
            field421 = arg6;
            field465 = arg7;
            field372 = 2;
            field389 = 0;
            field512 = arg0;
            field513 = arg1;
            field395.method2804(158);
            field395.method2649(Statics.field878 + arg0);
            field395.method2578(class106.field1709[82] ? 1 : 0);
            field395.method2649(arg3 >> 14 & 0x7FFF);
            field395.method2624(Statics.field33 + arg1);
        }
        if (arg2 == 40) {
            field395.method2804(124);
            field395.method2626(arg1);
            field395.method2624(arg0);
            field395.method2683(arg3);
            field391 = 0;
            Statics.field1064 = class170.method723(arg1);
            field392 = arg0;
        }
        if (arg2 == 7) {
            class36 var38 = field285[arg3];
            if (var38 != null) {
                field421 = arg6;
                field465 = arg7;
                field372 = 2;
                field389 = 0;
                field512 = arg0;
                field513 = arg1;
                field395.method2804(35);
                field395.method2618(class106.field1709[82] ? 1 : 0);
                field395.method2624(Statics.field2769);
                field395.method2649(arg3);
                field395.method2626(Statics.field473);
                field395.method2683(Statics.field203);
            }
        }
        if (arg2 == 17) {
            field421 = arg6;
            field465 = arg7;
            field372 = 2;
            field389 = 0;
            field512 = arg0;
            field513 = arg1;
            field395.method2804(58);
            field395.method2581(Statics.field815);
            field395.method2617(class106.field1709[82] ? 1 : 0);
            field395.method2624(Statics.field878 + arg0);
            field395.method2624(arg3);
            field395.method2616(field434);
            field395.method2683(Statics.field33 + arg1);
        }
        if (arg2 == 37) {
            field395.method2804(172);
            field395.method2581(arg1);
            field395.method2649(arg0);
            field395.method2683(arg3);
            field391 = 0;
            Statics.field1064 = class170.method723(arg1);
            field392 = arg0;
        }
        if (arg2 == 33) {
            field395.method2804(224);
            field395.method2683(arg0);
            field395.method2683(arg3);
            field395.method2626(arg1);
            field391 = 0;
            Statics.field1064 = class170.method723(arg1);
            field392 = arg0;
        }
        if (arg2 == 49) {
            class24 var39 = field400[arg3];
            if (var39 != null) {
                field421 = arg6;
                field465 = arg7;
                field372 = 2;
                field389 = 0;
                field512 = arg0;
                field513 = arg1;
                field395.method2804(247);
                field395.method2618(class106.field1709[82] ? 1 : 0);
                field395.method2616(arg3);
            }
        }
        if (arg2 == 1) {
            field421 = arg6;
            field465 = arg7;
            field372 = 2;
            field389 = 0;
            field512 = arg0;
            field513 = arg1;
            field395.method2804(197);
            field395.method2683(Statics.field33 + arg1);
            field395.method2649(Statics.field203);
            field395.method2634(Statics.field473);
            field395.method2616(Statics.field878 + arg0);
            field395.method2624(arg3 >> 14 & 0x7FFF);
            field395.method2649(Statics.field2769);
            field395.method2734(class106.field1709[82] ? 1 : 0);
        }
        if (arg2 == 34) {
            field395.method2804(152);
            field395.method2683(arg3);
            field395.method2624(arg0);
            field395.method2781(arg1);
            field391 = 0;
            Statics.field1064 = class170.method723(arg1);
            field392 = arg0;
        }
        if (arg2 == 42) {
            field395.method2804(188);
            field395.method2649(arg0);
            field395.method2634(arg1);
            field395.method2624(arg3);
            field391 = 0;
            Statics.field1064 = class170.method723(arg1);
            field392 = arg0;
        }
        if (arg2 == 4) {
            field421 = arg6;
            field465 = arg7;
            field372 = 2;
            field389 = 0;
            field512 = arg0;
            field513 = arg1;
            field395.method2804(56);
            field395.method2616(arg3 >> 14 & 0x7FFF);
            field395.method2624(Statics.field878 + arg0);
            field395.method2616(Statics.field33 + arg1);
            field395.method2734(class106.field1709[82] ? 1 : 0);
        }
        if (arg2 == 12) {
            class36 var40 = field285[arg3];
            if (var40 != null) {
                field421 = arg6;
                field465 = arg7;
                field372 = 2;
                field389 = 0;
                field512 = arg0;
                field513 = arg1;
                field395.method2804(216);
                field395.method2649(arg3);
                field395.method2617(class106.field1709[82] ? 1 : 0);
            }
        }
        if (arg2 == 46) {
            class24 var41 = field400[arg3];
            if (var41 != null) {
                field421 = arg6;
                field465 = arg7;
                field372 = 2;
                field389 = 0;
                field512 = arg0;
                field513 = arg1;
                field395.method2804(144);
                field395.method2616(arg3);
                field395.method2618(class106.field1709[82] ? 1 : 0);
            }
        }
        if (arg2 == 44) {
            class24 var42 = field400[arg3];
            if (var42 != null) {
                field421 = arg6;
                field465 = arg7;
                field372 = 2;
                field389 = 0;
                field512 = arg0;
                field513 = arg1;
                field395.method2804(64);
                field395.method2649(arg3);
                field395.method2618(class106.field1709[82] ? 1 : 0);
            }
        }
        if (arg2 == 1002) {
            field421 = arg6;
            field465 = arg7;
            field372 = 2;
            field389 = 0;
            field395.method2804(150);
            field395.method2624(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 16) {
            field421 = arg6;
            field465 = arg7;
            field372 = 2;
            field389 = 0;
            field512 = arg0;
            field513 = arg1;
            field395.method2804(76);
            field395.method2683(Statics.field33 + arg1);
            field395.method2683(Statics.field2769);
            field395.method2649(Statics.field878 + arg0);
            field395.method2734(class106.field1709[82] ? 1 : 0);
            field395.method2649(arg3);
            field395.method2626(Statics.field473);
            field395.method2683(Statics.field203);
        }
        if (arg2 == 30 && field442 == null) {
            method656(arg1, arg0);
            field442 = class170.method1862(arg1, arg0);
            method676(field442);
        }
        if (arg2 == 25) {
            class170 var43 = class170.method1862(arg1, arg0);
            if (var43 != null) {
                method575();
                int var44 = method711(var43);
                int var45 = var44 >> 11 & 0x3F;
                int var47 = var43.field2317;
                class170 var48 = class170.method1862(arg1, arg0);
                if (var48 != null && var48.field2288 != null) {
                    class19 var49 = new class19();
                    var49.field181 = var48;
                    var49.field189 = var48.field2288;
                    class33.method161(var49, 200000);
                }
                field435 = var47;
                field433 = true;
                Statics.field815 = arg1;
                field434 = arg0;
                Statics.field30 = var45;
                method676(var48);
                field430 = 0;
                field407 = method206(var43);
                if (field407 == null) {
                    field407 = "Null";
                }
                if (var43.field2215) {
                    field437 = var43.field2270 + class38.method569(16777215);
                } else {
                    field437 = class38.method569(65280) + var43.field2314 + class38.method569(16777215);
                }
            }
            return;
        }
        if (arg2 == 21) {
            field421 = arg6;
            field465 = arg7;
            field372 = 2;
            field389 = 0;
            field512 = arg0;
            field513 = arg1;
            field395.method2804(254);
            field395.method2624(Statics.field33 + arg1);
            field395.method2618(class106.field1709[82] ? 1 : 0);
            field395.method2624(Statics.field878 + arg0);
            field395.method2624(arg3);
        }
        if (arg2 == 39) {
            field395.method2804(226);
            field395.method2683(arg3);
            field395.method2634(arg1);
            field395.method2683(arg0);
            field391 = 0;
            Statics.field1064 = class170.method723(arg1);
            field392 = arg0;
        }
        if (arg2 == 23) {
            if (field416) {
                Statics.field1542.method1743();
            } else {
                Statics.field1542.method1638(Statics.field1559, arg0, arg1, true);
            }
        }
        if (arg2 == 36) {
            field395.method2804(255);
            field395.method2683(arg3);
            field395.method2634(arg1);
            field395.method2683(arg0);
            field391 = 0;
            Statics.field1064 = class170.method723(arg1);
            field392 = arg0;
        }
        if (arg2 == 38) {
            method575();
            class170 var50 = class170.method723(arg1);
            field430 = 1;
            Statics.field203 = arg0;
            Statics.field473 = arg1;
            Statics.field2769 = arg3;
            method676(var50);
            field432 = class38.method569(16748608) + class199.method713(arg3).field2958 + class38.method569(16777215);
            if (field432 == null) {
                field432 = "null";
            }
            return;
        }
        if (arg2 == 19) {
            field421 = arg6;
            field465 = arg7;
            field372 = 2;
            field389 = 0;
            field512 = arg0;
            field513 = arg1;
            field395.method2804(220);
            field395.method2618(class106.field1709[82] ? 1 : 0);
            field395.method2683(Statics.field33 + arg1);
            field395.method2624(arg3);
            field395.method2649(Statics.field878 + arg0);
        }
        if (arg2 == 47) {
            class24 var51 = field400[arg3];
            if (var51 != null) {
                field421 = arg6;
                field465 = arg7;
                field372 = 2;
                field389 = 0;
                field512 = arg0;
                field513 = arg1;
                field395.method2804(159);
                field395.method2683(arg3);
                field395.method2617(class106.field1709[82] ? 1 : 0);
            }
        }
        if (arg2 == 20) {
            field421 = arg6;
            field465 = arg7;
            field372 = 2;
            field389 = 0;
            field512 = arg0;
            field513 = arg1;
            field395.method2804(89);
            field395.method2683(Statics.field878 + arg0);
            field395.method2616(Statics.field33 + arg1);
            field395.method2624(arg3);
            field395.method2578(class106.field1709[82] ? 1 : 0);
        }
        if (field430 != 0) {
            field430 = 0;
            method676(class170.method723(Statics.field473));
        }
        if (field433) {
            method575();
        }
        if (Statics.field1064 != null && field391 == 0) {
            method676(Statics.field1064);
        }
    }

    @ObfuscatedName("e.by(S)V")
    public static void method575() {
        if (!field433) {
            return;
        }
        class170 var0 = class170.method1862(Statics.field815, field434);
        if (var0 != null && var0.field2254 != null) {
            class19 var1 = new class19();
            var1.field181 = var0;
            var1.field189 = var0.field2254;
            class33.method161(var1, 200000);
        }
        field433 = false;
        method676(var0);
    }

    @ObfuscatedName("aj.bz(IIB)V")
    public static void method656(int arg0, int arg1) {
        field395.method2804(195);
        field395.method2624(arg1);
        field395.method2626(arg0);
    }

    @ObfuscatedName("bq.bd(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method1298(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field416 || field460 >= 500) {
            return;
        }
        field424[field460] = arg0;
        field454[field460] = arg1;
        field422[field460] = arg2;
        field423[field460] = arg3;
        field510[field460] = arg4;
        field547[field460] = arg5;
        field460++;
    }

    @ObfuscatedName("r.cl(I)V")
    public static void method176() {
        for (int var0 = 0; var0 < field460; var0++) {
            if (method2088(field422[var0])) {
                if (var0 < field460 - 1) {
                    for (int var1 = var0; var1 < field460 - 1; var1++) {
                        field424[var1] = field424[var1 + 1];
                        field454[var1] = field454[var1 + 1];
                        field422[var1] = field422[var1 + 1];
                        field423[var1] = field423[var1 + 1];
                        field510[var1] = field510[var1 + 1];
                        field547[var1] = field547[var1 + 1];
                    }
                }
                field460--;
            }
        }
    }

    @ObfuscatedName("dt.cf(IB)Z")
    public static boolean method2088(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("client.co(II)Ljava/lang/String;")
    public static String method570(int arg0) {
        return field454[arg0].length() > 0 ? field424[arg0] + class174.field2431 + field454[arg0] : field424[arg0];
    }

    @ObfuscatedName("dv.cq(IIIII)V")
    public static final void method1906(int arg0, int arg1, int arg2, int arg3) {
        if (field430 == 0 && !field433) {
            method1298(class174.field2505, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class83.field1413; var6++) {
            int var7 = class83.field1392[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field1542.method1631(Statics.field1559, var8, var9, var7) >= 0) {
                    class198 var12 = class198.method3716(var11);
                    if (var12.field2896 != null) {
                        var12 = var12.method3357();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field430 == 1) {
                        method1298(class174.field2594, field432 + " " + class38.field777 + " " + class38.method569(65535) + var12.field2900, 1, var7, var8, var9);
                    } else if (!field433) {
                        String[] var13 = var12.field2892;
                        if (field503) {
                            var13 = method2809(var13);
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
                                    method1298(var13[var14], class38.method569(65535) + var12.field2900, var15, var7, var8, var9);
                                }
                            }
                        }
                        method1298(class174.field2501, class38.method569(65535) + var12.field2900, 1002, var12.field2897 << 14, var8, var9);
                    } else if ((Statics.field30 & 0x4) == 4) {
                        method1298(field407, field437 + " " + class38.field777 + " " + class38.method569(65535) + var12.field2900, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class36 var16 = field285[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field763.field3000 == 1 && (var16.field622 & 0x7F) == 64 && (var16.field639 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field317; var17++) {
                            class36 var18 = field285[field420[var17]];
                            if (var18 != null && var16 != var18 && var18.field763.field3000 == 1 && var16.field622 == var18.field622 && var16.field639 == var18.field639) {
                                Statics.method175(var18.field763, field420[var17], var8, var9);
                            }
                        }
                        int var19 = class46.field899;
                        int[] var20 = class46.field896;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class24 var22 = field400[var20[var21]];
                            if (var22 != null && var16.field622 == var22.field622 && var16.field639 == var22.field639) {
                                method580(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    Statics.method175(var16.field763, var11, var8, var9);
                }
                if (var10 == 0) {
                    class24 var23 = field400[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field622 & 0x7F) == 64 && (var23.field639 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field317; var24++) {
                            class36 var25 = field285[field420[var24]];
                            if (var25 != null && var25.field763.field3000 == 1 && var23.field622 == var25.field622 && var23.field639 == var25.field639) {
                                Statics.method175(var25.field763, field420[var24], var8, var9);
                            }
                        }
                        int var26 = class46.field899;
                        int[] var27 = class46.field896;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class24 var29 = field400[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field622 == var29.field622 && var23.field639 == var29.field639) {
                                method580(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field337 == var11) {
                        var4 = var7;
                    } else {
                        method580(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class129 var30 = field410[Statics.field1559][var8][var9];
                    if (var30 != null) {
                        for (class44 var31 = (class44) var30.method2238(); var31 != null; var31 = (class44) var30.method2240()) {
                            class199 var32 = class199.method713(var31.field884);
                            if (field430 == 1) {
                                method1298(class174.field2594, field432 + " " + class38.field777 + " " + class38.method569(16748608) + var32.field2958, 16, var31.field884, var8, var9);
                            } else if (!field433) {
                                String[] var33 = var32.field2964;
                                if (field503) {
                                    var33 = method2809(var33);
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
                                        method1298(var33[var34], class38.method569(16748608) + var32.field2958, var35, var31.field884, var8, var9);
                                    } else if (var34 == 2) {
                                        method1298(class174.field2353, class38.method569(16748608) + var32.field2958, 20, var31.field884, var8, var9);
                                    }
                                }
                                method1298(class174.field2501, class38.method569(16748608) + var32.field2958, 1004, var31.field884, var8, var9);
                            } else if ((Statics.field30 & 0x1) == 1) {
                                method1298(field407, field437 + " " + class38.field777 + " " + class38.method569(16748608) + var32.field2958, 17, var31.field884, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class24 var38 = field400[field337];
            method580(var38, field337, var36, var37);
        }
    }

    @ObfuscatedName("am.ci(Lt;IIII)V")
    public static final void method580(class24 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field169 == arg0 || field460 >= 400) {
            return;
        }
        String var4;
        if (arg0.field245 == 0) {
            var4 = arg0.field243[0] + arg0.field264 + arg0.field243[1] + method2832(arg0.field244, Statics.field169.field244) + " " + class38.field780 + class174.field2560 + arg0.field244 + class38.field779 + arg0.field243[2];
        } else {
            var4 = arg0.field243[0] + arg0.field264 + arg0.field243[1] + " " + class38.field780 + class174.field2402 + arg0.field245 + class38.field779 + arg0.field243[2];
        }
        if (field430 == 1) {
            method1298(class174.field2594, field432 + " " + class38.field777 + " " + class38.method569(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field433) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field406[var5] != null) {
                    short var6 = 0;
                    if (field406[var5].equalsIgnoreCase(class174.field2502)) {
                        if (field308 == class41.field809) {
                            continue;
                        }
                        if (field308 == class41.field813 || field308 == class41.field816 && arg0.field244 > Statics.field169.field244) {
                            var6 = 2000;
                        }
                        if (Statics.field169.field258 != 0 && arg0.field258 != 0) {
                            if (Statics.field169.field258 == arg0.field258) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field325[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field405[var5] + var6;
                    method1298(field406[var5], class38.method569(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field30 & 0x8) == 8) {
            method1298(field407, field437 + " " + class38.field777 + " " + class38.method569(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field460; var9++) {
            if (field422[var9] == 23) {
                field454[var9] = class38.method569(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("fg.cm(IIB)Ljava/lang/String;")
    public static final String method2832(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class38.method569(16711680);
        } else if (var2 < -6) {
            return class38.method569(16723968);
        } else if (var2 < -3) {
            return class38.method569(16740352);
        } else if (var2 < 0) {
            return class38.method569(16756736);
        } else if (var2 > 9) {
            return class38.method569(65280);
        } else if (var2 > 6) {
            return class38.method569(4259584);
        } else if (var2 > 3) {
            return class38.method569(8453888);
        } else if (var2 > 0) {
            return class38.method569(12648192);
        } else {
            return class38.method569(16776960);
        }
    }

    @ObfuscatedName("af.cc([Lfw;IIIIIIIII)V")
    public static final void method710(class170[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class220.method3754(arg2, arg3, arg4, arg5);
        class85.method1580();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class170 var10 = arg0[var9];
            if (var10 != null && (var10.field2216 == arg1 || arg1 == -1412584499 && field369 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field486[field481] = var10.field2210 + arg6;
                    field544[field481] = var10.field2211 + arg7;
                    field487[field481] = var10.field2219;
                    field489[field481] = var10.field2213;
                    var11 = ++field481 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2312 = var11;
                var10.field2329 = field289;
                if (!var10.field2215 || !method1799(var10)) {
                    if (var10.field2201 > 0) {
                        int var12 = var10.field2201;
                        if (var12 == 324) {
                            if (field452 == -1) {
                                field452 = var10.field2197;
                                field553 = var10.field2233;
                            }
                            if (field551.field2168) {
                                var10.field2197 = field452;
                            } else {
                                var10.field2197 = field553;
                            }
                        } else if (var12 == 325) {
                            if (field452 == -1) {
                                field452 = var10.field2197;
                                field553 = var10.field2233;
                            }
                            if (field551.field2168) {
                                var10.field2197 = field553;
                            } else {
                                var10.field2197 = field452;
                            }
                        } else if (var12 == 327) {
                            var10.field2268 = 150;
                            var10.field2310 = (int) (Math.sin((double) field289 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2186 = 5;
                            var10.field2241 = 0;
                        } else if (var12 == 328) {
                            var10.field2268 = 150;
                            var10.field2310 = (int) (Math.sin((double) field289 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2186 = 5;
                            var10.field2241 = 1;
                        }
                    }
                    int var13 = var10.field2210 + arg6;
                    int var14 = var10.field2211 + arg7;
                    int var15 = var10.field2228;
                    if (field369 == var10) {
                        if (arg1 != -1412584499 && !var10.field2212) {
                            Statics.field1649 = arg0;
                            Statics.field589 = arg6;
                            Statics.field786 = arg7;
                            continue;
                        }
                        if (field462 && field338) {
                            int var16 = class116.field1806;
                            int var17 = class116.field1815 * -693183961;
                            int var18 = var16 - field453;
                            int var19 = var17 - field552;
                            if (var18 < field457) {
                                var18 = field457;
                            }
                            if (var10.field2219 + var18 > field457 + field431.field2219) {
                                var18 = field457 + field431.field2219 - var10.field2219;
                            }
                            if (var19 < field458) {
                                var19 = field458;
                            }
                            if (var10.field2213 + var19 > field458 + field431.field2213) {
                                var19 = field458 + field431.field2213 - var10.field2213;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2212) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2199 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2199 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2219 + var13;
                        int var27 = var10.field2213 + var14;
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
                        int var30 = var10.field2219 + var13;
                        int var31 = var10.field2213 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2215 || var20 < var22 && var21 < var23) {
                        if (var10.field2201 != 0) {
                            if (var10.field2201 == 1336) {
                                if (field478) {
                                    var14 += 15;
                                    Statics.field2671.method3630("Fps:" + field1789, var10.field2219 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field284) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field284) {
                                        var34 = 16711680;
                                    }
                                    Statics.field2671.method3630("Mem:" + var33 + "k", var10.field2219 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2201 == 1337) {
                                field426 = var13;
                                field427 = var14;
                                method1328(var13, var14, var10.field2219, var10.field2213);
                                field483[var10.field2312] = true;
                                class220.method3754(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2201 == 1338) {
                                method184(var10, var13, var14, var11);
                                class220.method3754(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2201 == 1339) {
                                class165 var35 = var10.method2985(false);
                                if (var35 != null) {
                                    if (field514 < 3) {
                                        Statics.field22.method3875(var13, var14, var35.field2157, var35.field2154, 25, 25, field364, 256, var35.field2153, var35.field2151);
                                    } else {
                                        class220.method3734(var13, var14, 0, var35.field2153, var35.field2151);
                                    }
                                }
                                class220.method3754(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2199 == 0) {
                            if (!var10.field2215 && method1799(var10) && Statics.field168 != var10) {
                                continue;
                            }
                            if (!var10.field2215) {
                                if (var10.field2209 > var10.field2221 - var10.field2213) {
                                    var10.field2209 = var10.field2221 - var10.field2213;
                                }
                                if (var10.field2209 < 0) {
                                    var10.field2209 = 0;
                                }
                            }
                            method710(arg0, var10.field2237, var20, var21, var22, var23, var13 - var10.field2218, var14 - var10.field2209, var11);
                            if (var10.field2321 != null) {
                                method710(var10.field2321, var10.field2237, var20, var21, var22, var23, var13 - var10.field2218, var14 - var10.field2209, var11);
                            }
                            class18 var36 = (class18) field439.method2199((long) var10.field2237);
                            if (var36 != null) {
                                int var37 = var36.field180;
                                if (class170.method1843(var37)) {
                                    Statics.field1649 = null;
                                    method710(Statics.field2203[var37], -1, var20, var21, var22, var23, var13, var14, var11);
                                    if (Statics.field1649 != null) {
                                        method710(Statics.field1649, -1412584499, var20, var21, var22, var23, Statics.field589, Statics.field786, var11);
                                        Statics.field1649 = null;
                                    }
                                } else if (var11 == -1) {
                                    for (int var38 = 0; var38 < 100; var38++) {
                                        field483[var38] = true;
                                    }
                                } else {
                                    field483[var11] = true;
                                }
                            }
                            class220.method3754(arg2, arg3, arg4, arg5);
                            class85.method1580();
                        }
                        if (field301 || field485[var11] || field490 > 1) {
                            if (var10.field2199 == 0 && !var10.field2215 && var10.field2221 > var10.field2213) {
                                method678(var10.field2219 + var13, var14, var10.field2209, var10.field2213, var10.field2221);
                            }
                            if (var10.field2199 != 1) {
                                if (var10.field2199 == 2) {
                                    int var39 = 0;
                                    for (int var40 = 0; var40 < var10.field2242; var40++) {
                                        for (int var41 = 0; var41 < var10.field2208; var41++) {
                                            int var42 = (var10.field2263 + 32) * var41 + var13;
                                            int var43 = (var10.field2319 + 32) * var40 + var14;
                                            if (var39 < 20) {
                                                var42 += var10.field2265[var39];
                                                var43 += var10.field2266[var39];
                                            }
                                            if (var10.field2315[var39] > 0) {
                                                boolean var44 = false;
                                                boolean var45 = false;
                                                int var46 = var10.field2315[var39] - 1;
                                                if (var42 + 32 > arg2 && var42 < arg4 && var43 + 32 > arg3 && var43 < arg5 || Statics.field752 == var10 && field393 == var39) {
                                                    class225 var47;
                                                    if (field430 == 1 && Statics.field203 == var39 && Statics.field473 == var10.field2237) {
                                                        var47 = class199.method2510(var46, var10.field2316[var39], 2, 0, 2, false);
                                                    } else {
                                                        var47 = class199.method2510(var46, var10.field2316[var39], 1, 3153952, 2, false);
                                                    }
                                                    if (var47 == null) {
                                                        method676(var10);
                                                    } else if (Statics.field752 == var10 && field393 == var39) {
                                                        int var48 = class116.field1806 - field394;
                                                        int var49 = class116.field1815 * -693183961 - field527;
                                                        if (var48 < 5 && var48 > -5) {
                                                            var48 = 0;
                                                        }
                                                        if (var49 < 5 && var49 > -5) {
                                                            var49 = 0;
                                                        }
                                                        if (field321 < 5) {
                                                            var48 = 0;
                                                            var49 = 0;
                                                        }
                                                        var47.method3943(var42 + var48, var43 + var49, 128);
                                                        if (arg1 != -1) {
                                                            class170 var50 = arg0[arg1 & 0xFFFF];
                                                            if (var43 + var49 < class220.field3176 && var50.field2209 > 0) {
                                                                int var51 = field355 * (class220.field3176 - var43 - var49) / 3;
                                                                if (var51 > field355 * 10) {
                                                                    var51 = field355 * 10;
                                                                }
                                                                if (var51 > var50.field2209) {
                                                                    var51 = var50.field2209;
                                                                }
                                                                var50.field2209 -= var51;
                                                                field527 += var51;
                                                                method676(var50);
                                                            }
                                                            if (var43 + var49 + 32 > class220.field3177 && var50.field2209 < var50.field2221 - var50.field2213) {
                                                                int var52 = field355 * (var43 + var49 + 32 - class220.field3177) / 3;
                                                                if (var52 > field355 * 10) {
                                                                    var52 = field355 * 10;
                                                                }
                                                                if (var52 > var50.field2221 - var50.field2213 - var50.field2209) {
                                                                    var52 = var50.field2221 - var50.field2213 - var50.field2209;
                                                                }
                                                                var50.field2209 += var52;
                                                                field527 -= var52;
                                                                method676(var50);
                                                            }
                                                        }
                                                    } else if (Statics.field1064 == var10 && field392 == var39) {
                                                        var47.method3943(var42, var43, 128);
                                                    } else {
                                                        var47.method3864(var42, var43);
                                                    }
                                                }
                                            } else if (var10.field2267 != null && var39 < 20) {
                                                class225 var53 = var10.method2946(var39);
                                                if (var53 != null) {
                                                    var53.method3864(var42, var43);
                                                } else if (class170.field2327) {
                                                    method676(var10);
                                                }
                                            }
                                            var39++;
                                        }
                                    }
                                } else if (var10.field2199 == 3) {
                                    int var54;
                                    if (method806(var10)) {
                                        var54 = var10.field2290;
                                        if (Statics.field168 == var10 && var10.field2225 != 0) {
                                            var54 = var10.field2225;
                                        }
                                    } else {
                                        var54 = var10.field2322;
                                        if (Statics.field168 == var10 && var10.field2224 != 0) {
                                            var54 = var10.field2224;
                                        }
                                    }
                                    if (var10.field2226) {
                                        switch(var10.field2227.field3185) {
                                            case 1:
                                                class220.method3738(var13, var14, var10.field2219, var10.field2213, var10.field2322, var10.field2290, 256 - (var10.field2228 & 0xFF), 256 - (var10.field2229 & 0xFF));
                                                break;
                                            case 2:
                                                class220.method3793(var13, var14, var10.field2219, var10.field2213, var10.field2322, var10.field2290, 256 - (var10.field2228 & 0xFF), 256 - (var10.field2229 & 0xFF));
                                                break;
                                            case 3:
                                                class220.method3740(var13, var14, var10.field2219, var10.field2213, var10.field2322, var10.field2290, 256 - (var10.field2228 & 0xFF), 256 - (var10.field2229 & 0xFF));
                                                break;
                                            case 4:
                                                class220.method3741(var13, var14, var10.field2219, var10.field2213, var10.field2322, var10.field2290, 256 - (var10.field2228 & 0xFF), 256 - (var10.field2229 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class220.method3766(var13, var14, var10.field2219, var10.field2213, var54);
                                                } else {
                                                    class220.method3736(var13, var14, var10.field2219, var10.field2213, var54, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class220.method3743(var13, var14, var10.field2219, var10.field2213, var54);
                                    } else {
                                        class220.method3798(var13, var14, var10.field2219, var10.field2213, var54, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2199 == 4) {
                                    class209 var55 = var10.method2945();
                                    if (var55 != null) {
                                        String var56 = var10.field2257;
                                        int var57;
                                        if (method806(var10)) {
                                            var57 = var10.field2290;
                                            if (Statics.field168 == var10 && var10.field2225 != 0) {
                                                var57 = var10.field2225;
                                            }
                                            if (var10.field2313.length() > 0) {
                                                var56 = var10.field2313;
                                            }
                                        } else {
                                            var57 = var10.field2322;
                                            if (Statics.field168 == var10 && var10.field2224 != 0) {
                                                var57 = var10.field2224;
                                            }
                                        }
                                        if (var10.field2215 && var10.field2317 != -1) {
                                            class199 var58 = class199.method713(var10.field2317);
                                            var56 = var58.field2958;
                                            if (var56 == null) {
                                                var56 = "null";
                                            }
                                            if ((var58.field2961 == 1 || var10.field2318 != 1) && var10.field2318 != -1) {
                                                var56 = class38.method569(16748608) + var56 + class38.field782 + " " + 'x' + method2882(var10.field2318);
                                            }
                                        }
                                        if (field442 == var10) {
                                            class174 var10000 = (class174) null;
                                            var56 = class174.field2508;
                                            var57 = var10.field2322;
                                        }
                                        if (!var10.field2215) {
                                            var56 = method605(var56, var10);
                                        }
                                        var55.method3619(var56, var13, var14, var10.field2219, var10.field2213, var57, var10.field2262 ? 0 : -1, var10.field2260, var10.field2264, var10.field2259);
                                    } else if (class170.field2327) {
                                        method676(var10);
                                    }
                                } else if (var10.field2199 == 5) {
                                    if (var10.field2215) {
                                        class225 var60;
                                        if (var10.field2317 == -1) {
                                            var60 = var10.method2940(false);
                                        } else {
                                            var60 = class199.method2510(var10.field2317, var10.field2318, var10.field2236, var10.field2240, var10.field2188, false);
                                        }
                                        if (var60 != null) {
                                            int var61 = var60.field3208;
                                            int var62 = var60.field3214;
                                            if (var10.field2235) {
                                                class220.method3732(var13, var14, var10.field2219 + var13, var10.field2213 + var14);
                                                int var63 = (var10.field2219 + (var61 - 1)) / var61;
                                                int var64 = (var10.field2213 + (var62 - 1)) / var62;
                                                for (int var65 = 0; var65 < var63; var65++) {
                                                    for (int var66 = 0; var66 < var64; var66++) {
                                                        if (var10.field2234 != 0) {
                                                            var60.method3868(var61 / 2 + var61 * var65 + var13, var62 / 2 + var62 * var66 + var14, var10.field2234, 4096);
                                                        } else if (var15 == 0) {
                                                            var60.method3864(var61 * var65 + var13, var62 * var66 + var14);
                                                        } else {
                                                            var60.method3943(var61 * var65 + var13, var62 * var66 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class220.method3754(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var67 = var10.field2219 * 4096 / var61;
                                                if (var10.field2234 != 0) {
                                                    var60.method3868(var10.field2219 / 2 + var13, var10.field2213 / 2 + var14, var10.field2234, var67);
                                                } else if (var15 != 0) {
                                                    var60.method3913(var13, var14, var10.field2219, var10.field2213, 256 - (var15 & 0xFF));
                                                } else if (var10.field2219 == var61 && var10.field2213 == var62) {
                                                    var60.method3864(var13, var14);
                                                } else {
                                                    var60.method3866(var13, var14, var10.field2219, var10.field2213);
                                                }
                                            }
                                        } else if (class170.field2327) {
                                            method676(var10);
                                        }
                                    } else {
                                        class225 var59 = var10.method2940(method806(var10));
                                        if (var59 != null) {
                                            var59.method3864(var13, var14);
                                        } else if (class170.field2327) {
                                            method676(var10);
                                        }
                                    }
                                } else if (var10.field2199 == 6) {
                                    boolean var68 = method806(var10);
                                    int var69;
                                    if (var68) {
                                        var69 = var10.field2300;
                                    } else {
                                        var69 = var10.field2244;
                                    }
                                    class83 var70 = null;
                                    int var71 = 0;
                                    if (var10.field2317 != -1) {
                                        class199 var72 = class199.method713(var10.field2317);
                                        if (var72 != null) {
                                            class199 var73 = var72.method3405(var10.field2318);
                                            var70 = var73.method3418(1);
                                            if (var70 == null) {
                                                method676(var10);
                                            } else {
                                                var70.method1504();
                                                var71 = var70.field1544 / 2;
                                            }
                                        }
                                    } else if (var10.field2186 == 5) {
                                        if (var10.field2241 == 0) {
                                            var70 = field551.method2893((class202) null, -1, (class202) null, -1);
                                        } else {
                                            var70 = Statics.field169.method223();
                                        }
                                    } else if (var69 == -1) {
                                        var70 = var10.method2947((class202) null, -1, var68, Statics.field169.field240);
                                        if (var70 == null && class170.field2327) {
                                            method676(var10);
                                        }
                                    } else {
                                        class202 var74 = class202.method2533(var69);
                                        var70 = var10.method2947(var74, var10.field2222, var68, Statics.field169.field240);
                                        if (var70 == null && class170.field2327) {
                                            method676(var10);
                                        }
                                    }
                                    class85.method1550(var10.field2219 / 2 + var13, var10.field2213 / 2 + var14);
                                    int var75 = var10.field2251 * class85.field1439[var10.field2268] >> 16;
                                    int var76 = var10.field2251 * class85.field1453[var10.field2268] >> 16;
                                    if (var70 != null) {
                                        if (var10.field2215) {
                                            var70.method1504();
                                            if (var10.field2247) {
                                                var70.method1474(0, var10.field2310, var10.field2250, var10.field2268, var10.field2246, var10.field2248 + var71 + var75, var10.field2248 + var76, var10.field2251);
                                            } else {
                                                var70.method1485(0, var10.field2310, var10.field2250, var10.field2268, var10.field2246, var10.field2248 + var71 + var75, var10.field2248 + var76);
                                            }
                                        } else {
                                            var70.method1485(0, var10.field2310, 0, var10.field2268, 0, var75, var76);
                                        }
                                    }
                                    class85.method1533();
                                } else {
                                    if (var10.field2199 == 7) {
                                        class209 var77 = var10.method2945();
                                        if (var77 == null) {
                                            if (class170.field2327) {
                                                method676(var10);
                                            }
                                            continue;
                                        }
                                        int var78 = 0;
                                        for (int var79 = 0; var79 < var10.field2242; var79++) {
                                            for (int var80 = 0; var80 < var10.field2208; var80++) {
                                                if (var10.field2315[var78] > 0) {
                                                    class199 var81 = class199.method713(var10.field2315[var78] - 1);
                                                    String var82;
                                                    if (var81.field2961 != 1 && var10.field2316[var78] == 1) {
                                                        var82 = class38.method569(16748608) + var81.field2958 + class38.field782;
                                                    } else {
                                                        var82 = class38.method569(16748608) + var81.field2958 + class38.field782 + " " + 'x' + method2882(var10.field2316[var78]);
                                                    }
                                                    int var83 = (var10.field2263 + 115) * var80 + var13;
                                                    int var84 = (var10.field2319 + 12) * var79 + var14;
                                                    if (var10.field2260 == 0) {
                                                        var77.method3628(var82, var83, var84, var10.field2322, var10.field2262 ? 0 : -1);
                                                    } else if (var10.field2260 == 1) {
                                                        var77.method3657(var82, var10.field2219 / 2 + var83, var84, var10.field2322, var10.field2262 ? 0 : -1);
                                                    } else {
                                                        var77.method3630(var82, var10.field2219 + var83 - 1, var84, var10.field2322, var10.field2262 ? 0 : -1);
                                                    }
                                                }
                                                var78++;
                                            }
                                        }
                                    }
                                    if (var10.field2199 == 8 && Statics.field202 == var10 && field508 == field428) {
                                        int var85 = 0;
                                        int var86 = 0;
                                        class209 var87 = Statics.field2671;
                                        String var88 = var10.field2257;
                                        String var89 = method605(var88, var10);
                                        while (var89.length() > 0) {
                                            int var90 = var89.indexOf(class38.field781);
                                            String var91;
                                            if (var90 == -1) {
                                                var91 = var89;
                                                var89 = "";
                                            } else {
                                                var91 = var89.substring(0, var90);
                                                var89 = var89.substring(var90 + 4);
                                            }
                                            int var92 = var87.method3623(var91);
                                            if (var92 > var85) {
                                                var85 = var92;
                                            }
                                            var86 += var87.field3101 + 1;
                                        }
                                        var85 += 6;
                                        var86 += 7;
                                        int var93 = var10.field2219 + var13 - 5 - var85;
                                        int var94 = var10.field2213 + var14 + 5;
                                        if (var93 < var13 + 5) {
                                            var93 = var13 + 5;
                                        }
                                        if (var85 + var93 > arg4) {
                                            var93 = arg4 - var85;
                                        }
                                        if (var86 + var94 > arg5) {
                                            var94 = arg5 - var86;
                                        }
                                        class220.method3766(var93, var94, var85, var86, 16777120);
                                        class220.method3743(var93, var94, var85, var86, 0);
                                        String var95 = var10.field2257;
                                        int var96 = var87.field3101 + var94 + 2;
                                        String var97 = method605(var95, var10);
                                        while (var97.length() > 0) {
                                            int var98 = var97.indexOf(class38.field781);
                                            String var99;
                                            if (var98 == -1) {
                                                var99 = var97;
                                                var97 = "";
                                            } else {
                                                var99 = var97.substring(0, var98);
                                                var97 = var97.substring(var98 + 4);
                                            }
                                            var87.method3628(var99, var93 + 3, var96, 0, -1);
                                            var96 += var87.field3101 + 1;
                                        }
                                    }
                                    if (var10.field2199 == 9) {
                                        if (var10.field2230 == 1) {
                                            int var100;
                                            int var101;
                                            int var102;
                                            int var103;
                                            if (var10.field2231) {
                                                var100 = var13;
                                                var101 = var10.field2213 + var14;
                                                var102 = var10.field2219 + var13;
                                                var103 = var14;
                                            } else {
                                                var100 = var13;
                                                var101 = var14;
                                                var102 = var10.field2219 + var13;
                                                var103 = var10.field2213 + var14;
                                            }
                                            class220.method3748(var100, var101, var102, var103, var10.field2322);
                                        } else {
                                            int var104 = var10.field2219 >= 0 ? var10.field2219 : -var10.field2219;
                                            int var105 = var10.field2213 >= 0 ? var10.field2213 : -var10.field2213;
                                            int var106 = var104;
                                            if (var104 < var105) {
                                                var106 = var105;
                                            }
                                            if (var106 != 0) {
                                                int var107 = (var10.field2219 << 16) / var106;
                                                int var108 = (var10.field2213 << 16) / var106;
                                                if (var108 <= var107) {
                                                    var107 = -var107;
                                                } else {
                                                    var108 = -var108;
                                                }
                                                int var109 = var10.field2230 * var108 >> 17;
                                                int var110 = var10.field2230 * var108 + 1 >> 17;
                                                int var111 = var10.field2230 * var107 >> 17;
                                                int var112 = var10.field2230 * var107 + 1 >> 17;
                                                int var113 = var13 + var109;
                                                int var114 = var13 - var110;
                                                int var115 = var10.field2219 + var13 - var110;
                                                int var116 = var10.field2219 + var13 + var109;
                                                int var117 = var14 + var111;
                                                int var118 = var14 - var112;
                                                int var119 = var10.field2213 + var14 - var112;
                                                int var120 = var10.field2213 + var14 + var111;
                                                class85.method1568(var113, var114, var115);
                                                class85.method1542(var117, var118, var119, var113, var114, var115, var10.field2322);
                                                class85.method1568(var113, var115, var116);
                                                class85.method1542(var117, var119, var120, var113, var115, var116, var10.field2322);
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

    @ObfuscatedName("ad.cd(Ljava/lang/String;Lfw;I)Ljava/lang/String;")
    public static String method605(String arg0, class170 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method3024(method867(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field691 != null) {
                    var5 = class208.method2788(Statics.field691.field1666);
                    if (Statics.field691.field1665 != null) {
                        var5 = (String) Statics.field691.field1665;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("fb.cb(II)Ljava/lang/String;")
    public static final String method2882(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class38.field776 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class38.method569(65408) + var1.substring(0, var1.length() - 8) + class174.field2417 + " " + class38.field780 + var1 + class38.field779 + class38.field782;
        } else if (var1.length() > 6) {
            return " " + class38.method569(16777215) + var1.substring(0, var1.length() - 4) + class174.field2513 + " " + class38.field780 + var1 + class38.field779 + class38.field782;
        } else {
            return " " + class38.method569(16776960) + var1 + class38.field782;
        }
    }

    @ObfuscatedName("fn.ch(Lfw;B)V")
    public static void method3006(class170 arg0) {
        class170 var1 = arg0.field2216 == -1 ? null : class170.method723(arg0.field2216);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field578;
            var3 = Statics.field2777;
        } else {
            var2 = var1.field2219;
            var3 = var1.field2213;
        }
        method838(arg0, var2, var3, false);
        method3204(arg0, var2, var3);
    }

    @ObfuscatedName("ch.cy([Lfw;Lfw;ZI)V")
    public static void method1787(class170[] arg0, class170 arg1, boolean arg2) {
        int var3 = arg1.field2204 == 0 ? arg1.field2219 : arg1.field2204;
        int var4 = arg1.field2221 == 0 ? arg1.field2213 : arg1.field2221;
        method3571(arg0, arg1.field2237, var3, var4, arg2);
        if (arg1.field2321 != null) {
            method3571(arg1.field2321, arg1.field2237, var3, var4, arg2);
        }
        class18 var5 = (class18) field439.method2199((long) arg1.field2237);
        if (var5 != null) {
            int var6 = var5.field180;
            if (class170.method1843(var6)) {
                method3571(Statics.field2203[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2201 == 1337) {
        }
    }

    @ObfuscatedName("gc.cs([Lfw;IIIZB)V")
    public static void method3571(class170[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class170 var6 = arg0[var5];
            if (var6 != null && var6.field2216 == arg1) {
                method838(var6, arg2, arg3, arg4);
                method3204(var6, arg2, arg3);
                if (var6.field2218 > var6.field2204 - var6.field2219) {
                    var6.field2218 = var6.field2204 - var6.field2219;
                }
                if (var6.field2218 < 0) {
                    var6.field2218 = 0;
                }
                if (var6.field2209 > var6.field2221 - var6.field2213) {
                    var6.field2209 = var6.field2221 - var6.field2213;
                }
                if (var6.field2209 < 0) {
                    var6.field2209 = 0;
                }
                if (var6.field2199 == 0) {
                    method1787(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ap.cv(Lfw;IIZI)V")
    public static void method838(class170 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2219;
        int var5 = arg0.field2213;
        if (arg0.field2252 == 0) {
            arg0.field2219 = arg0.field2208;
        } else if (arg0.field2252 == 1) {
            arg0.field2219 = arg1 - arg0.field2208;
        } else if (arg0.field2252 == 2) {
            arg0.field2219 = arg0.field2208 * arg1 >> 14;
        }
        if (arg0.field2205 == 0) {
            arg0.field2213 = arg0.field2242;
        } else if (arg0.field2205 == 1) {
            arg0.field2213 = arg2 - arg0.field2242;
        } else if (arg0.field2205 == 2) {
            arg0.field2213 = arg0.field2242 * arg2 >> 14;
        }
        if (arg0.field2252 == 4) {
            arg0.field2219 = arg0.field2255 * arg0.field2213 / arg0.field2292;
        }
        if (arg0.field2205 == 4) {
            arg0.field2213 = arg0.field2292 * arg0.field2219 / arg0.field2255;
        }
        if (field506 && arg0.field2199 == 0) {
            if (arg0.field2213 < 5 && arg0.field2219 < 5) {
                arg0.field2213 = 5;
                arg0.field2219 = 5;
            } else {
                if (arg0.field2213 <= 0) {
                    arg0.field2213 = 5;
                }
                if (arg0.field2219 <= 0) {
                    arg0.field2219 = 5;
                }
            }
        }
        if (arg0.field2201 == 1337) {
            field450 = arg0;
        }
        if (arg3 && arg0.field2306 != null && (arg0.field2219 != var4 || arg0.field2213 != var5)) {
            class19 var6 = new class19();
            var6.field181 = arg0;
            var6.field189 = arg0.field2306;
            field477.method2232(var6);
        }
    }

    @ObfuscatedName("gj.cj(Lfw;III)V")
    public static void method3204(class170 arg0, int arg1, int arg2) {
        if (arg0.field2202 == 0) {
            arg0.field2210 = arg0.field2239;
        } else if (arg0.field2202 == 1) {
            arg0.field2210 = (arg1 - arg0.field2219) / 2 + arg0.field2239;
        } else if (arg0.field2202 == 2) {
            arg0.field2210 = arg1 - arg0.field2219 - arg0.field2239;
        } else if (arg0.field2202 == 3) {
            arg0.field2210 = arg0.field2239 * arg1 >> 14;
        } else if (arg0.field2202 == 4) {
            arg0.field2210 = (arg0.field2239 * arg1 >> 14) + (arg1 - arg0.field2219) / 2;
        } else {
            arg0.field2210 = arg1 - arg0.field2219 - (arg0.field2239 * arg1 >> 14);
        }
        if (arg0.field2196 == 0) {
            arg0.field2211 = arg0.field2207;
        } else if (arg0.field2196 == 1) {
            arg0.field2211 = (arg2 - arg0.field2213) / 2 + arg0.field2207;
        } else if (arg0.field2196 == 2) {
            arg0.field2211 = arg2 - arg0.field2213 - arg0.field2207;
        } else if (arg0.field2196 == 3) {
            arg0.field2211 = arg0.field2207 * arg2 >> 14;
        } else if (arg0.field2196 == 4) {
            arg0.field2211 = (arg0.field2207 * arg2 >> 14) + (arg2 - arg0.field2213) / 2;
        } else {
            arg0.field2211 = arg2 - arg0.field2213 - (arg0.field2207 * arg2 >> 14);
        }
        if (!field506 || arg0.field2199 != 0) {
            return;
        }
        if (arg0.field2210 < 0) {
            arg0.field2210 = 0;
        } else if (arg0.field2219 + arg0.field2210 > arg1) {
            arg0.field2210 = arg1 - arg0.field2219;
        }
        if (arg0.field2211 < 0) {
            arg0.field2211 = 0;
        } else if (arg0.field2213 + arg0.field2211 > arg2) {
            arg0.field2211 = arg2 - arg0.field2213;
        }
    }

    @ObfuscatedName("dl.ce(Lfw;IIIIIII)V")
    public static final void method1946(class170 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field361) {
            field488 = 32;
        } else {
            field488 = 0;
        }
        field361 = false;
        if (class116.field1805 == 1 || !Statics.field938 && class116.field1805 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2209 -= 4;
                method676(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2209 += 4;
                method676(arg0);
            } else if (arg5 >= arg1 - field488 && arg5 < field488 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2209 = (arg4 - arg3) * var8 / var9;
                method676(arg0);
                field361 = true;
            }
        }
        if (field476 == 0) {
            return;
        }
        int var10 = arg0.field2219;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2209 += field476 * 45;
            method676(arg0);
        }
    }

    @ObfuscatedName("ar.cp(IIIIIB)V")
    public static final void method678(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field584[0].method3814(arg0, arg1);
        Statics.field584[1].method3814(arg0, arg1 + arg3 - 16);
        class220.method3766(arg0, arg1 + 16, 16, arg3 - 32, field538);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class220.method3766(arg0, arg1 + 16 + var6, 16, var5, field358);
        class220.method3762(arg0, arg1 + 16 + var6, var5, field360);
        class220.method3762(arg0 + 1, arg1 + 16 + var6, var5, field360);
        class220.method3745(arg0, arg1 + 16 + var6, 16, field360);
        class220.method3745(arg0, arg1 + 17 + var6, 16, field360);
        class220.method3762(arg0 + 15, arg1 + 16 + var6, var5, field359);
        class220.method3762(arg0 + 14, arg1 + 17 + var6, var5 - 1, field359);
        class220.method3745(arg0, arg1 + 15 + var6 + var5, 16, field359);
        class220.method3745(arg0 + 1, arg1 + 14 + var6 + var5, 15, field359);
    }

    @ObfuscatedName("fm.cz(IB)Ljava/lang/String;")
    public static final String method3024(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("ap.ck(Lfw;I)Z")
    public static final boolean method806(class170 arg0) {
        if (arg0.field2279 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2279.length; var1++) {
            int var2 = method867(arg0, var1);
            int var3 = arg0.field2311[var1];
            if (arg0.field2279[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2279[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2279[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("az.ca(Lfw;II)I")
    public static final int method867(class170 arg0, int arg1) {
        if (arg0.field2309 == null || arg1 >= arg0.field2309.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2309[arg1];
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
                    var7 = field456[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field415[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field388[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class170 var11 = class170.method723(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class199.method713(var12).field2976 || field283)) {
                        for (int var13 = 0; var13 < var11.field2315.length; var13++) {
                            if (var12 + 1 == var11.field2315[var13]) {
                                var7 += var11.field2316[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class166.field2159[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class173.field2346[field415[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class166.field2159[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field169.field244;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class173.field2351[var14]) {
                            var7 += field415[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class170 var17 = class170.method723(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class199.method713(var18).field2976 || field283)) {
                        for (int var19 = 0; var19 < var17.field2315.length; var19++) {
                            if (var18 + 1 == var17.field2315[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field443;
                }
                if (var6 == 12) {
                    var7 = field319;
                }
                if (var6 == 13) {
                    int var20 = class166.field2159[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = Statics.method115(var22);
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
                    var7 = (Statics.field169.field622 >> 7) + Statics.field878;
                }
                if (var6 == 19) {
                    var7 = (Statics.field169.field639 >> 7) + Statics.field33;
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

    @ObfuscatedName("am.cu([Lfw;IIIIIIII)V")
    public static final void method595(class170[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class170 var9 = arg0[var8];
            if (var9 != null && (!var9.field2215 || var9.field2199 == 0 || var9.field2277 || method711(var9) != 0 || field431 == var9 || var9.field2201 == 1338) && var9.field2216 == arg1 && (!var9.field2215 || !method1799(var9))) {
                int var10 = var9.field2210 + arg6;
                int var11 = var9.field2211 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2199 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2199 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2219 + var10;
                    int var19 = var9.field2213 + var11;
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
                    int var22 = var9.field2219 + var10;
                    int var23 = var9.field2213 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field369 == var9) {
                    field449 = true;
                    field498 = var10;
                    field461 = var11;
                }
                if (!var9.field2215 || var12 < var14 && var13 < var15) {
                    int var24 = class116.field1806;
                    int var25 = class116.field1815 * -693183961;
                    if (class116.field1814 != 0) {
                        var24 = class116.field1812;
                        var25 = class116.field1813;
                    }
                    if (var9.field2201 == 1337) {
                        if (!field386 && !field416 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method1906(var24, var25, var12, var13);
                        }
                    } else if (var9.field2201 == 1338) {
                        method2311(var9, var10, var11);
                    } else {
                        if (!field416 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var26 = var24 - var10;
                            int var27 = var25 - var11;
                            if (var9.field2238 == 1) {
                                method1298(var9.field2192, "", 24, 0, 0, var9.field2237);
                            }
                            if (var9.field2238 == 2 && !field433) {
                                String var28 = method206(var9);
                                if (var28 != null) {
                                    method1298(var28, class38.method569(65280) + var9.field2314, 25, 0, -1, var9.field2237);
                                }
                            }
                            if (var9.field2238 == 3) {
                                method1298(class174.field2600, "", 26, 0, 0, var9.field2237);
                            }
                            if (var9.field2238 == 4) {
                                method1298(var9.field2192, "", 28, 0, 0, var9.field2237);
                            }
                            if (var9.field2238 == 5) {
                                method1298(var9.field2192, "", 29, 0, 0, var9.field2237);
                            }
                            if (var9.field2238 == 6 && field442 == null) {
                                method1298(var9.field2192, "", 30, 0, -1, var9.field2237);
                            }
                            if (var9.field2199 == 2) {
                                int var29 = 0;
                                for (int var30 = 0; var30 < var9.field2213; var30++) {
                                    for (int var31 = 0; var31 < var9.field2219; var31++) {
                                        int var32 = (var9.field2263 + 32) * var31;
                                        int var33 = (var9.field2319 + 32) * var30;
                                        if (var29 < 20) {
                                            var32 += var9.field2265[var29];
                                            var33 += var9.field2266[var29];
                                        }
                                        if (var26 >= var32 && var27 >= var33 && var26 < var32 + 32 && var27 < var33 + 32) {
                                            field396 = var29;
                                            Statics.field803 = var9;
                                            if (var9.field2315[var29] > 0) {
                                                class199 var34 = class199.method713(var9.field2315[var29] - 1);
                                                if (field430 == 1 && class171.method1810(method711(var9))) {
                                                    if (Statics.field473 != var9.field2237 || Statics.field203 != var29) {
                                                        method1298(class174.field2594, field432 + " " + class38.field777 + " " + class38.method569(16748608) + var34.field2958, 31, var34.field2948, var29, var9.field2237);
                                                    }
                                                } else if (!field433 || !class171.method1810(method711(var9))) {
                                                    String[] var35 = var34.field2965;
                                                    if (field503) {
                                                        var35 = method2809(var35);
                                                    }
                                                    if (class171.method1810(method711(var9))) {
                                                        for (int var36 = 4; var36 >= 3; var36--) {
                                                            if (var35 != null && var35[var36] != null) {
                                                                byte var37;
                                                                if (var36 == 3) {
                                                                    var37 = 36;
                                                                } else {
                                                                    var37 = 37;
                                                                }
                                                                method1298(var35[var36], class38.method569(16748608) + var34.field2958, var37, var34.field2948, var29, var9.field2237);
                                                            } else if (var36 == 4) {
                                                                method1298(class174.field2358, class38.method569(16748608) + var34.field2958, 37, var34.field2948, var29, var9.field2237);
                                                            }
                                                        }
                                                    }
                                                    if (class171.method1942(method711(var9))) {
                                                        method1298(class174.field2594, class38.method569(16748608) + var34.field2958, 38, var34.field2948, var29, var9.field2237);
                                                    }
                                                    if (class171.method1810(method711(var9)) && var35 != null) {
                                                        for (int var38 = 2; var38 >= 0; var38--) {
                                                            if (var35[var38] != null) {
                                                                byte var39 = 0;
                                                                if (var38 == 0) {
                                                                    var39 = 33;
                                                                }
                                                                if (var38 == 1) {
                                                                    var39 = 34;
                                                                }
                                                                if (var38 == 2) {
                                                                    var39 = 35;
                                                                }
                                                                method1298(var35[var38], class38.method569(16748608) + var34.field2958, var39, var34.field2948, var29, var9.field2237);
                                                            }
                                                        }
                                                    }
                                                    String[] var40 = var9.field2330;
                                                    if (field503) {
                                                        var40 = method2809(var40);
                                                    }
                                                    if (var40 != null) {
                                                        for (int var41 = 4; var41 >= 0; var41--) {
                                                            if (var40[var41] != null) {
                                                                byte var42 = 0;
                                                                if (var41 == 0) {
                                                                    var42 = 39;
                                                                }
                                                                if (var41 == 1) {
                                                                    var42 = 40;
                                                                }
                                                                if (var41 == 2) {
                                                                    var42 = 41;
                                                                }
                                                                if (var41 == 3) {
                                                                    var42 = 42;
                                                                }
                                                                if (var41 == 4) {
                                                                    var42 = 43;
                                                                }
                                                                method1298(var40[var41], class38.method569(16748608) + var34.field2958, var42, var34.field2948, var29, var9.field2237);
                                                            }
                                                        }
                                                    }
                                                    method1298(class174.field2501, class38.method569(16748608) + var34.field2958, 1005, var34.field2948, var29, var9.field2237);
                                                } else if ((Statics.field30 & 0x10) == 16) {
                                                    method1298(field407, field437 + " " + class38.field777 + " " + class38.method569(16748608) + var34.field2958, 32, var34.field2948, var29, var9.field2237);
                                                }
                                            }
                                        }
                                        var29++;
                                    }
                                }
                            }
                            if (var9.field2215) {
                                if (field433) {
                                    int var43 = method711(var9);
                                    boolean var44 = (var43 >> 21 & 0x1) != 0;
                                    if (var44 && (Statics.field30 & 0x20) == 32) {
                                        method1298(field407, field437 + " " + class38.field777 + " " + var9.field2270, 58, 0, var9.field2198, var9.field2237);
                                    }
                                } else {
                                    for (int var45 = 9; var45 >= 5; var45--) {
                                        int var46 = method711(var9);
                                        boolean var47 = (var46 >> var45 + 1 & 0x1) != 0;
                                        String var48;
                                        if (!var47 && var9.field2297 == null) {
                                            var48 = null;
                                        } else if (var9.field2271 == null || var9.field2271.length <= var45 || var9.field2271[var45] == null || var9.field2271[var45].trim().length() == 0) {
                                            var48 = null;
                                        } else {
                                            var48 = var9.field2271[var45];
                                        }
                                        if (var48 != null) {
                                            method1298(var48, var9.field2270, 1007, var45 + 1, var9.field2198, var9.field2237);
                                        }
                                    }
                                    String var50 = method206(var9);
                                    if (var50 != null) {
                                        method1298(var50, var9.field2270, 25, 0, var9.field2198, var9.field2237);
                                    }
                                    for (int var51 = 4; var51 >= 0; var51--) {
                                        int var52 = method711(var9);
                                        boolean var53 = (var52 >> var51 + 1 & 0x1) != 0;
                                        String var54;
                                        if (!var53 && var9.field2297 == null) {
                                            var54 = null;
                                        } else if (var9.field2271 == null || var9.field2271.length <= var51 || var9.field2271[var51] == null || var9.field2271[var51].trim().length() == 0) {
                                            var54 = null;
                                        } else {
                                            var54 = var9.field2271[var51];
                                        }
                                        if (var54 != null) {
                                            method1298(var54, var9.field2270, 57, var51 + 1, var9.field2198, var9.field2237);
                                        }
                                    }
                                    if (class171.method725(method711(var9))) {
                                        method1298(class174.field2507, "", 30, 0, var9.field2198, var9.field2237);
                                    }
                                }
                            }
                        }
                        if (var9.field2199 == 0) {
                            if (!var9.field2215 && method1799(var9) && Statics.field168 != var9) {
                                continue;
                            }
                            method595(arg0, var9.field2237, var12, var13, var14, var15, var10 - var9.field2218, var11 - var9.field2209);
                            if (var9.field2321 != null) {
                                method595(var9.field2321, var9.field2237, var12, var13, var14, var15, var10 - var9.field2218, var11 - var9.field2209);
                            }
                            class18 var56 = (class18) field439.method2199((long) var9.field2237);
                            if (var56 != null) {
                                if (var56.field176 == 0 && class116.field1806 >= var12 && class116.field1815 * -693183961 >= var13 && class116.field1806 < var14 && class116.field1815 * -693183961 < var15 && !field416 && !field506) {
                                    for (class19 var57 = (class19) field477.method2237(); var57 != null; var57 = (class19) field477.method2251()) {
                                        if (var57.field190) {
                                            var57.method2225();
                                            var57.field181.field2273 = false;
                                        }
                                    }
                                    if (Statics.field2654 == 0) {
                                        field369 = null;
                                        field431 = null;
                                    }
                                    if (!field416) {
                                        field424[0] = class174.field2379;
                                        field454[0] = "";
                                        field422[0] = 1006;
                                        field460 = 1;
                                    }
                                }
                                int var58 = var56.field180;
                                if (class170.method1843(var58)) {
                                    method595(Statics.field2203[var58], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2215) {
                            if (var9.field2195) {
                                if (class116.field1806 >= var12 && class116.field1815 * -693183961 >= var13 && class116.field1806 < var14 && class116.field1815 * -693183961 < var15) {
                                    for (class19 var59 = (class19) field477.method2237(); var59 != null; var59 = (class19) field477.method2251()) {
                                        if (var59.field190) {
                                            var59.method2225();
                                            var59.field181.field2273 = false;
                                        }
                                    }
                                    if (Statics.field2654 == 0) {
                                        field369 = null;
                                        field431 = null;
                                    }
                                    if (!field416) {
                                        field424[0] = class174.field2379;
                                        field454[0] = "";
                                        field422[0] = 1006;
                                        field460 = 1;
                                    }
                                }
                            } else if (var9.field2298 && class116.field1806 >= var12 && class116.field1815 * -693183961 >= var13 && class116.field1806 < var14 && class116.field1815 * -693183961 < var15) {
                                for (class19 var60 = (class19) field477.method2237(); var60 != null; var60 = (class19) field477.method2251()) {
                                    if (var60.field190 && var60.field181.field2206 == var60.field189) {
                                        var60.method2225();
                                    }
                                }
                            }
                            boolean var61;
                            if (class116.field1806 >= var12 && class116.field1815 * -693183961 >= var13 && class116.field1806 < var14 && class116.field1815 * -693183961 < var15) {
                                var61 = true;
                            } else {
                                var61 = false;
                            }
                            boolean var62 = false;
                            if ((class116.field1805 == 1 || !Statics.field938 && class116.field1805 == 4) && var61) {
                                var62 = true;
                            }
                            boolean var63 = false;
                            if ((class116.field1814 == 1 || !Statics.field938 && class116.field1814 == 4) && class116.field1812 >= var12 && class116.field1813 >= var13 && class116.field1812 < var14 && class116.field1813 < var15) {
                                var63 = true;
                            }
                            if (var63) {
                                method2125(var9, class116.field1812 - var10, class116.field1813 - var11);
                            }
                            if (field369 != null && field369 != var9 && var61) {
                                int var64 = method711(var9);
                                boolean var65 = (var64 >> 20 & 0x1) != 0;
                                if (var65) {
                                    field455 = var9;
                                }
                            }
                            if (field431 == var9) {
                                field338 = true;
                                field457 = var10;
                                field458 = var11;
                            }
                            if (var9.field2277) {
                                if (var61 && field476 != 0 && var9.field2206 != null) {
                                    class19 var66 = new class19();
                                    var66.field190 = true;
                                    var66.field181 = var9;
                                    var66.field185 = field476;
                                    var66.field189 = var9.field2206;
                                    field477.method2232(var66);
                                }
                                if (field369 != null || Statics.field752 != null || field416) {
                                    var63 = false;
                                    var62 = false;
                                    var61 = false;
                                }
                                if (!var9.field2323 && var63) {
                                    var9.field2323 = true;
                                    if (var9.field2296 != null) {
                                        class19 var67 = new class19();
                                        var67.field190 = true;
                                        var67.field181 = var9;
                                        var67.field184 = class116.field1812 - var10;
                                        var67.field185 = class116.field1813 - var11;
                                        var67.field189 = var9.field2296;
                                        field477.method2232(var67);
                                    }
                                }
                                if (var9.field2323 && var62 && var9.field2280 != null) {
                                    class19 var68 = new class19();
                                    var68.field190 = true;
                                    var68.field181 = var9;
                                    var68.field184 = class116.field1806 - var10;
                                    var68.field185 = class116.field1815 * -693183961 - var11;
                                    var68.field189 = var9.field2280;
                                    field477.method2232(var68);
                                }
                                if (var9.field2323 && !var62) {
                                    var9.field2323 = false;
                                    if (var9.field2281 != null) {
                                        class19 var69 = new class19();
                                        var69.field190 = true;
                                        var69.field181 = var9;
                                        var69.field184 = class116.field1806 - var10;
                                        var69.field185 = class116.field1815 * -693183961 - var11;
                                        var69.field189 = var9.field2281;
                                        field479.method2232(var69);
                                    }
                                }
                                if (var62 && var9.field2294 != null) {
                                    class19 var70 = new class19();
                                    var70.field190 = true;
                                    var70.field181 = var9;
                                    var70.field184 = class116.field1806 - var10;
                                    var70.field185 = class116.field1815 * -693183961 - var11;
                                    var70.field189 = var9.field2294;
                                    field477.method2232(var70);
                                }
                                if (!var9.field2273 && var61) {
                                    var9.field2273 = true;
                                    if (var9.field2283 != null) {
                                        class19 var71 = new class19();
                                        var71.field190 = true;
                                        var71.field181 = var9;
                                        var71.field184 = class116.field1806 - var10;
                                        var71.field185 = class116.field1815 * -693183961 - var11;
                                        var71.field189 = var9.field2283;
                                        field477.method2232(var71);
                                    }
                                }
                                if (var9.field2273 && var61 && var9.field2214 != null) {
                                    class19 var72 = new class19();
                                    var72.field190 = true;
                                    var72.field181 = var9;
                                    var72.field184 = class116.field1806 - var10;
                                    var72.field185 = class116.field1815 * -693183961 - var11;
                                    var72.field189 = var9.field2214;
                                    field477.method2232(var72);
                                }
                                if (var9.field2273 && !var61) {
                                    var9.field2273 = false;
                                    if (var9.field2275 != null) {
                                        class19 var73 = new class19();
                                        var73.field190 = true;
                                        var73.field181 = var9;
                                        var73.field184 = class116.field1806 - var10;
                                        var73.field185 = class116.field1815 * -693183961 - var11;
                                        var73.field189 = var9.field2275;
                                        field479.method2232(var73);
                                    }
                                }
                                if (var9.field2220 != null) {
                                    class19 var74 = new class19();
                                    var74.field181 = var9;
                                    var74.field189 = var9.field2220;
                                    field379.method2232(var74);
                                }
                                if (var9.field2249 != null && field459 > var9.field2325) {
                                    if (var9.field2305 == null || field459 - var9.field2325 > 32) {
                                        class19 var79 = new class19();
                                        var79.field181 = var9;
                                        var79.field189 = var9.field2249;
                                        field477.method2232(var79);
                                    } else {
                                        label678: for (int var75 = var9.field2325; var75 < field459; var75++) {
                                            int var76 = field429[var75 & 0x1F];
                                            for (int var77 = 0; var77 < var9.field2305.length; var77++) {
                                                if (var9.field2305[var77] == var76) {
                                                    class19 var78 = new class19();
                                                    var78.field181 = var9;
                                                    var78.field189 = var9.field2249;
                                                    field477.method2232(var78);
                                                    break label678;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2325 = field459;
                                }
                                if (var9.field2331 != null && field467 > var9.field2326) {
                                    if (var9.field2293 == null || field467 - var9.field2326 > 32) {
                                        class19 var84 = new class19();
                                        var84.field181 = var9;
                                        var84.field189 = var9.field2331;
                                        field477.method2232(var84);
                                    } else {
                                        label654: for (int var80 = var9.field2326; var80 < field467; var80++) {
                                            int var81 = field466[var80 & 0x1F];
                                            for (int var82 = 0; var82 < var9.field2293.length; var82++) {
                                                if (var9.field2293[var82] == var81) {
                                                    class19 var83 = new class19();
                                                    var83.field181 = var9;
                                                    var83.field189 = var9.field2331;
                                                    field477.method2232(var83);
                                                    break label654;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2326 = field467;
                                }
                                if (var9.field2289 != null && field469 > var9.field2245) {
                                    if (var9.field2295 == null || field469 - var9.field2245 > 32) {
                                        class19 var89 = new class19();
                                        var89.field181 = var9;
                                        var89.field189 = var9.field2289;
                                        field477.method2232(var89);
                                    } else {
                                        label630: for (int var85 = var9.field2245; var85 < field469; var85++) {
                                            int var86 = field468[var85 & 0x1F];
                                            for (int var87 = 0; var87 < var9.field2295.length; var87++) {
                                                if (var9.field2295[var87] == var86) {
                                                    class19 var88 = new class19();
                                                    var88.field181 = var9;
                                                    var88.field189 = var9.field2289;
                                                    field477.method2232(var88);
                                                    break label630;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2245 = field469;
                                }
                                if (field470 > var9.field2324 && var9.field2299 != null) {
                                    class19 var90 = new class19();
                                    var90.field181 = var9;
                                    var90.field189 = var9.field2299;
                                    field477.method2232(var90);
                                }
                                if (field417 > var9.field2324 && var9.field2301 != null) {
                                    class19 var91 = new class19();
                                    var91.field181 = var9;
                                    var91.field189 = var9.field2301;
                                    field477.method2232(var91);
                                }
                                if (field472 > var9.field2324 && var9.field2302 != null) {
                                    class19 var92 = new class19();
                                    var92.field181 = var9;
                                    var92.field189 = var9.field2302;
                                    field477.method2232(var92);
                                }
                                if (field471 > var9.field2324 && var9.field2307 != null) {
                                    class19 var93 = new class19();
                                    var93.field181 = var9;
                                    var93.field189 = var9.field2307;
                                    field477.method2232(var93);
                                }
                                if (field474 > var9.field2324 && var9.field2308 != null) {
                                    class19 var94 = new class19();
                                    var94.field181 = var9;
                                    var94.field189 = var9.field2308;
                                    field477.method2232(var94);
                                }
                                if (field475 > var9.field2324 && var9.field2303 != null) {
                                    class19 var95 = new class19();
                                    var95.field181 = var9;
                                    var95.field189 = var9.field2303;
                                    field477.method2232(var95);
                                }
                                var9.field2324 = field463;
                                if (var9.field2291 != null) {
                                    for (int var96 = 0; var96 < field501; var96++) {
                                        class19 var97 = new class19();
                                        var97.field181 = var9;
                                        var97.field196 = field448[var96];
                                        var97.field199 = field502[var96];
                                        var97.field189 = var9.field2291;
                                        field477.method2232(var97);
                                    }
                                }
                            }
                        }
                        if (!var9.field2215 && field369 == null && Statics.field752 == null && !field416) {
                            if ((var9.field2223 >= 0 || var9.field2224 != 0) && class116.field1806 >= var12 && class116.field1815 * -693183961 >= var13 && class116.field1806 < var14 && class116.field1815 * -693183961 < var15) {
                                if (var9.field2223 >= 0) {
                                    Statics.field168 = arg0[var9.field2223];
                                } else {
                                    Statics.field168 = var9;
                                }
                            }
                            if (var9.field2199 == 8 && class116.field1806 >= var12 && class116.field1815 * -693183961 >= var13 && class116.field1806 < var14 && class116.field1815 * -693183961 < var15) {
                                Statics.field202 = var9;
                            }
                            if (var9.field2221 > var9.field2213) {
                                method1946(var9, var9.field2219 + var10, var11, var9.field2213, var9.field2221, class116.field1806, class116.field1815 * -693183961);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ec.cx(III)V")
    public static final void method2562(int arg0, int arg1) {
        if (class170.method1843(arg0)) {
            method66(Statics.field2203[arg0], arg1);
        }
    }

    @ObfuscatedName("k.cr([Lfw;II)V")
    public static final void method66(class170[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class170 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2199 == 0) {
                    if (var3.field2321 != null) {
                        method66(var3.field2321, arg1);
                    }
                    class18 var4 = (class18) field439.method2199((long) var3.field2237);
                    if (var4 != null) {
                        method2562(var4.field180, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2304 != null) {
                    class19 var5 = new class19();
                    var5.field181 = var3;
                    var5.field189 = var3.field2304;
                    class33.method161(var5, 200000);
                }
                if (arg1 == 1 && var3.field2258 != null) {
                    if (var3.field2198 >= 0) {
                        class170 var6 = class170.method723(var3.field2237);
                        if (var6 == null || var6.field2321 == null || var3.field2198 >= var6.field2321.length || var6.field2321[var3.field2198] != var3) {
                            continue;
                        }
                    }
                    class19 var7 = new class19();
                    var7.field181 = var3;
                    var7.field189 = var3.field2258;
                    class33.method161(var7, 200000);
                }
            }
        }
    }

    @ObfuscatedName("ds.cn(Lfw;III)V")
    public static final void method2125(class170 arg0, int arg1, int arg2) {
        if (field369 != null || field416 || arg0 == null) {
            return;
        }
        class170 var3 = arg0;
        int var4 = method711(arg0);
        int var5 = var4 >> 17 & 0x7;
        int var6 = var5;
        class170 var7;
        if (var5 == 0) {
            var7 = null;
        } else {
            int var8 = 0;
            while (true) {
                if (var8 >= var6) {
                    var7 = var3;
                    break;
                }
                var3 = class170.method723(var3.field2216);
                if (var3 == null) {
                    var7 = null;
                    break;
                }
                var8++;
            }
        }
        class170 var9 = var7;
        if (var7 == null) {
            var9 = arg0.field2272;
        }
        if (var9 == null) {
            return;
        }
        field369 = arg0;
        class170 var11 = arg0;
        int var12 = method711(arg0);
        int var13 = var12 >> 17 & 0x7;
        int var14 = var13;
        class170 var15;
        if (var13 == 0) {
            var15 = null;
        } else {
            int var16 = 0;
            while (true) {
                if (var16 >= var14) {
                    var15 = var11;
                    break;
                }
                var11 = class170.method723(var11.field2216);
                if (var11 == null) {
                    var15 = null;
                    break;
                }
                var16++;
            }
        }
        class170 var17 = var15;
        if (var15 == null) {
            var17 = arg0.field2272;
        }
        field431 = var17;
        field453 = arg1;
        field552 = arg2;
        Statics.field2654 = 0;
        field462 = false;
        if (field460 > 0) {
            int var19 = field460 - 1;
            Statics.field165 = new class39();
            Statics.field165.field795 = field510[var19];
            Statics.field165.field792 = field547[var19];
            Statics.field165.field791 = field422[var19];
            Statics.field165.field794 = field423[var19];
            Statics.field165.field797 = field424[var19];
        }
        return;
    }

    @ObfuscatedName("ai.ct(I)V")
    public static final void method576() {
        method676(field369);
        Statics.field2654++;
        if (field449 && field338) {
            int var0 = class116.field1806;
            int var1 = class116.field1815 * -693183961;
            int var2 = var0 - field453;
            int var3 = var1 - field552;
            if (var2 < field457) {
                var2 = field457;
            }
            if (field369.field2219 + var2 > field457 + field431.field2219) {
                var2 = field457 + field431.field2219 - field369.field2219;
            }
            if (var3 < field458) {
                var3 = field458;
            }
            if (field369.field2213 + var3 > field458 + field431.field2213) {
                var3 = field458 + field431.field2213 - field369.field2213;
            }
            int var4 = var2 - field498;
            int var5 = var3 - field461;
            int var6 = field369.field2261;
            if (Statics.field2654 > field369.field2274 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field462 = true;
            }
            int var7 = field431.field2218 + (var2 - field457);
            int var8 = field431.field2209 + (var3 - field458);
            if (field369.field2286 != null && field462) {
                class19 var9 = new class19();
                var9.field181 = field369;
                var9.field184 = var7;
                var9.field185 = var8;
                var9.field189 = field369.field2286;
                class33.method161(var9, 200000);
            }
            if (class116.field1805 == 0) {
                if (field462) {
                    if (field369.field2287 != null) {
                        class19 var10 = new class19();
                        var10.field181 = field369;
                        var10.field184 = var7;
                        var10.field185 = var8;
                        var10.field187 = field455;
                        var10.field189 = field369.field2287;
                        class33.method161(var10, 200000);
                    }
                    if (field455 != null) {
                        class170 var11 = field369;
                        int var12 = method711(var11);
                        int var13 = var12 >> 17 & 0x7;
                        int var14 = var13;
                        class170 var15;
                        if (var13 == 0) {
                            var15 = null;
                        } else {
                            int var16 = 0;
                            while (true) {
                                if (var16 >= var14) {
                                    var15 = var11;
                                    break;
                                }
                                var11 = class170.method723(var11.field2216);
                                if (var11 == null) {
                                    var15 = null;
                                    break;
                                }
                                var16++;
                            }
                        }
                        if (var15 != null) {
                            field395.method2804(166);
                            field395.method2616(field369.field2198);
                            field395.method2634(field455.field2237);
                            field395.method2624(field455.field2198);
                            field395.method2634(field369.field2237);
                            field395.method2616(field455.field2317);
                            field395.method2616(field369.field2317);
                        }
                    }
                } else {
                    label120: {
                        label91: {
                            if (field385 != 1) {
                                int var17 = field460 - 1;
                                boolean var18;
                                if (var17 < 0) {
                                    var18 = false;
                                } else {
                                    int var19 = field422[var17];
                                    if (var19 >= 2000) {
                                        var19 -= 2000;
                                    }
                                    if (var19 == 1007) {
                                        var18 = true;
                                    } else {
                                        var18 = false;
                                    }
                                }
                                if (!var18) {
                                    break label91;
                                }
                            }
                            if (field460 > 2) {
                                method3216(field498 + field453, field552 + field461);
                                break label120;
                            }
                        }
                        if (field460 > 0) {
                            method424(field498 + field453, field552 + field461);
                        }
                    }
                }
                field369 = null;
            }
        } else if (Statics.field2654 > 1) {
            field369 = null;
        }
    }

    @ObfuscatedName("client.dy(III)V")
    public static void method424(int arg0, int arg1) {
        method733(Statics.field165, arg0, arg1);
        Statics.field165 = null;
    }

    @ObfuscatedName("ar.dd(Lfw;I)V")
    public static void method676(class170 arg0) {
        if (field482 == arg0.field2329) {
            field483[arg0.field2312] = true;
        }
    }

    @ObfuscatedName("r.dk(I)V")
    public static void method177() {
        for (class18 var0 = (class18) field439.method2186(); var0 != null; var0 = (class18) field439.method2194()) {
            int var1 = var0.field180;
            if (class170.method1843(var1)) {
                boolean var2 = true;
                class170[] var3 = Statics.field2203[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2215;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field1885;
                    class170 var6 = class170.method723(var5);
                    if (var6 != null) {
                        method676(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fg.dv([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2809(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("a.de(II)V")
    public static final void method121(int arg0) {
        if (!class170.method1843(arg0)) {
            return;
        }
        class170[] var1 = Statics.field2203[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class170 var3 = var1[var2];
            if (var3 != null) {
                var3.field2222 = 0;
                var3.field2320 = 0;
            }
        }
    }

    @ObfuscatedName("fk.dw([Lfw;IB)V")
    public static final void method2846(class170[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class170 var3 = arg0[var2];
            if (var3 != null && var3.field2216 == arg1 && (!var3.field2215 || !method1799(var3))) {
                if (var3.field2199 == 0) {
                    if (!var3.field2215 && method1799(var3) && Statics.field168 != var3) {
                        continue;
                    }
                    method2846(arg0, var3.field2237);
                    if (var3.field2321 != null) {
                        method2846(var3.field2321, var3.field2237);
                    }
                    class18 var4 = (class18) field439.method2199((long) var3.field2237);
                    if (var4 != null) {
                        int var5 = var4.field180;
                        if (class170.method1843(var5)) {
                            method2846(Statics.field2203[var5], -1);
                        }
                    }
                }
                if (var3.field2199 == 6) {
                    if (var3.field2244 != -1 || var3.field2300 != -1) {
                        boolean var6 = method806(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2300;
                        } else {
                            var7 = var3.field2244;
                        }
                        if (var7 != -1) {
                            class202 var8 = class202.method2533(var7);
                            var3.field2320 += field355;
                            while (var3.field2320 > var8.field3061[var3.field2222]) {
                                var3.field2320 -= var8.field3061[var3.field2222];
                                var3.field2222++;
                                if (var3.field2222 >= var8.field3050.length) {
                                    var3.field2222 -= var8.field3054;
                                    if (var3.field2222 < 0 || var3.field2222 >= var8.field3050.length) {
                                        var3.field2222 = 0;
                                    }
                                }
                                method676(var3);
                            }
                        }
                    }
                    if (var3.field2193 != 0 && !var3.field2215) {
                        int var9 = var3.field2193 >> 16;
                        int var10 = var3.field2193 << 16 >> 16;
                        int var11 = field355 * var9;
                        int var12 = field355 * var10;
                        var3.field2268 = var3.field2268 + var11 & 0x7FF;
                        var3.field2310 = var3.field2310 + var12 & 0x7FF;
                        method676(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.dm(II)V")
    public static final void method719(int arg0) {
        method177();
        Statics.method1918();
        class188 var1 = (class188) class188.field2773.method2169((long) arg0);
        class188 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field2776.method3044(16, arg0);
            class188 var4 = new class188();
            if (var3 != null) {
                var4.method3174(new class154(var3));
            }
            class188.field2773.method2174(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var5 = var2.field2772;
        if (var5 == 0) {
            return;
        }
        int var6 = class166.field2159[arg0];
        if (var5 == 1) {
            if (var6 == 1) {
                class85.method1586(0.9D);
                ((class75) Statics.field1449).method1333(0.9D);
            }
            if (var6 == 2) {
                class85.method1586(0.8D);
                ((class75) Statics.field1449).method1333(0.8D);
            }
            if (var6 == 3) {
                class85.method1586(0.7D);
                ((class75) Statics.field1449).method1333(0.7D);
            }
            if (var6 == 4) {
                class85.method1586(0.6D);
                ((class75) Statics.field1449).method1333(0.6D);
            }
            class199.field2954.method2170();
        }
        if (var5 == 3) {
            short var7 = 0;
            if (var6 == 0) {
                var7 = 255;
            }
            if (var6 == 1) {
                var7 = 192;
            }
            if (var6 == 2) {
                var7 = 128;
            }
            if (var6 == 3) {
                var7 = 64;
            }
            if (var6 == 4) {
                var7 = 0;
            }
            if (field537 != var7) {
                if (field537 == 0 && field516 != -1) {
                    class139.method852(Statics.field3229, field516, 0, var7, false);
                    field517 = false;
                } else if (var7 == 0) {
                    Statics.field1921.method2338();
                    class139.field1922 = 1;
                    Statics.field888 = null;
                    field517 = false;
                } else {
                    class139.method1529(var7);
                }
                field537 = var7;
            }
        }
        if (var5 == 4) {
            if (var6 == 0) {
                field518 = 127;
            }
            if (var6 == 1) {
                field518 = 96;
            }
            if (var6 == 2) {
                field518 = 64;
            }
            if (var6 == 3) {
                field518 = 32;
            }
            if (var6 == 4) {
                field518 = 0;
            }
        }
        if (var5 == 5) {
            field385 = var6;
        }
        if (var5 == 6) {
            field414 = var6;
        }
        if (var5 == 9) {
            field441 = var6;
        }
        if (var5 == 10) {
            if (var6 == 0) {
                field519 = 127;
            }
            if (var6 == 1) {
                field519 = 96;
            }
            if (var6 == 2) {
                field519 = 64;
            }
            if (var6 == 3) {
                field519 = 32;
            }
            if (var6 == 4) {
                field519 = 0;
            }
        }
        if (var5 == 17) {
            field446 = var6 & 0xFFFF;
        }
        if (var5 == 18) {
            field308 = (class41) class149.method1356(class41.method718(), var6);
            if (field308 == null) {
                field308 = class41.field816;
            }
        }
        if (var5 == 19) {
            if (var6 == -1) {
                field337 = -1;
            } else {
                field337 = var6 & 0x7FF;
            }
        }
        if (var5 == 22) {
            field306 = (class41) class149.method1356(class41.method718(), var6);
            if (field306 == null) {
                field306 = class41.field816;
            }
        }
    }

    @ObfuscatedName("client.dq(IIII)Ln;")
    public static final class18 method358(int arg0, int arg1, int arg2) {
        class18 var3 = new class18();
        var3.field180 = arg1;
        var3.field176 = arg2;
        field439.method2189(var3, (long) arg0);
        method121(arg1);
        class170 var4 = class170.method723(arg0);
        method676(var4);
        if (field442 != null) {
            method676(field442);
            field442 = null;
        }
        method176();
        method1787(Statics.field2203[arg0 >> 16], var4, false);
        class33.method79(arg1);
        if (field438 != -1) {
            method2562(field438, 1);
        }
        return var3;
    }

    @ObfuscatedName("a.dl(Ln;ZI)V")
    public static final void method118(class18 arg0, boolean arg1) {
        int var2 = arg0.field180;
        int var3 = (int) arg0.field1885;
        arg0.method2225();
        if (arg1) {
            class170.method1842(var2);
        }
        method798(var2);
        class170 var4 = class170.method723(var3);
        if (var4 != null) {
            method676(var4);
        }
        method176();
        if (field438 != -1) {
            method2562(field438, 1);
        }
    }

    @ObfuscatedName("q.dz(Lfw;I)Z")
    public static final boolean method43(class170 arg0) {
        int var1 = arg0.field2201;
        if (var1 == 205) {
            field332 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field551.method2888(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field551.method2889(var4, var5 == 1);
        }
        if (var1 == 324) {
            field551.method2890(false);
        }
        if (var1 == 325) {
            field551.method2890(true);
        }
        if (var1 == 326) {
            field395.method2804(32);
            field551.method2891(field395);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("i.dg(Lfw;IIIB)V")
    public static final void method184(class170 arg0, int arg1, int arg2, int arg3) {
        method1594();
        class165 var4 = arg0.method2985(false);
        if (var4 == null) {
            return;
        }
        class220.method3754(arg1, arg2, var4.field2157 + arg1, var4.field2154 + arg2);
        if (field514 == 2 || field514 == 5) {
            class220.method3734(arg1, arg2, 0, var4.field2153, var4.field2151);
        } else {
            int var5 = field364 + field295 & 0x7FF;
            int var6 = Statics.field169.field622 / 32 + 48;
            int var7 = 464 - Statics.field169.field639 / 32;
            Statics.field175.method3875(arg1, arg2, var4.field2157, var4.field2154, var6, var7, var5, field352 + 256, var4.field2153, var4.field2151);
            for (int var8 = 0; var8 < field344; var8++) {
                int var9 = field509[var8] * 4 + 2 - Statics.field169.field622 / 32;
                int var10 = field532[var8] * 4 + 2 - Statics.field169.field639 / 32;
                method1292(arg1, arg2, var9, var10, field511[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class129 var13 = field410[Statics.field1559][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field169.field622 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field169.field639 / 32;
                        method1292(arg1, arg2, var14, var15, Statics.field2088[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field317; var16++) {
                class36 var17 = field285[field420[var16]];
                if (var17 != null && var17.method227()) {
                    class200 var18 = var17.field763;
                    if (var18 != null && var18.field3024 != null) {
                        var18 = var18.method3461();
                    }
                    if (var18 != null && var18.field3012 && var18.field3027) {
                        int var19 = var17.field622 / 32 - Statics.field169.field622 / 32;
                        int var20 = var17.field639 / 32 - Statics.field169.field639 / 32;
                        method1292(arg1, arg2, var19, var20, Statics.field2088[1], var4);
                    }
                }
            }
            int var21 = class46.field899;
            int[] var22 = class46.field896;
            for (int var23 = 0; var23 < var21; var23++) {
                class24 var24 = field400[var22[var23]];
                if (var24 != null && var24.method227() && !var24.field267 && Statics.field169 != var24) {
                    int var25 = var24.field622 / 32 - Statics.field169.field622 / 32;
                    int var26 = var24.field639 / 32 - Statics.field169.field639 / 32;
                    boolean var27 = false;
                    if (method2022(var24.field264, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field100; var29++) {
                        if (var24.field264.equals(Statics.field1545[var29].field269)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field169.field258 != 0 && var24.field258 != 0 && Statics.field169.field258 == var24.field258) {
                        var30 = true;
                    }
                    if (var27) {
                        method1292(arg1, arg2, var25, var26, Statics.field2088[3], var4);
                    } else if (var30) {
                        method1292(arg1, arg2, var25, var26, Statics.field2088[4], var4);
                    } else if (var28) {
                        method1292(arg1, arg2, var25, var26, Statics.field2088[5], var4);
                    } else {
                        method1292(arg1, arg2, var25, var26, Statics.field2088[2], var4);
                    }
                }
            }
            if (field408 != 0 && field289 % 20 < 10) {
                if (field408 == 1 && field500 >= 0 && field500 < field285.length) {
                    class36 var31 = field285[field500];
                    if (var31 != null) {
                        int var32 = var31.field622 / 32 - Statics.field169.field622 / 32;
                        int var33 = var31.field639 / 32 - Statics.field169.field639 / 32;
                        method2436(arg1, arg2, var32, var33, Statics.field2645[1], var4);
                    }
                }
                if (field408 == 2) {
                    int var34 = field440 * 4 - Statics.field878 * 4 + 2 - Statics.field169.field622 / 32;
                    int var35 = field550 * 4 - Statics.field33 * 4 + 2 - Statics.field169.field639 / 32;
                    method2436(arg1, arg2, var34, var35, Statics.field2645[1], var4);
                }
                if (field408 == 10 && field322 >= 0 && field322 < field400.length) {
                    class24 var36 = field400[field322];
                    if (var36 != null) {
                        int var37 = var36.field622 / 32 - Statics.field169.field622 / 32;
                        int var38 = var36.field639 / 32 - Statics.field169.field639 / 32;
                        method2436(arg1, arg2, var37, var38, Statics.field2645[1], var4);
                    }
                }
            }
            if (field512 != 0) {
                int var39 = field512 * 4 + 2 - Statics.field169.field622 / 32;
                int var40 = field513 * 4 + 2 - Statics.field169.field639 / 32;
                method1292(arg1, arg2, var39, var40, Statics.field2645[0], var4);
            }
            if (!Statics.field169.field267) {
                class220.method3766(var4.field2157 / 2 + arg1 - 1, var4.field2154 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field484[arg3] = true;
    }

    @ObfuscatedName("em.dr(IIIILhs;Lfb;I)V")
    public static final void method2436(int arg0, int arg1, int arg2, int arg3, class225 arg4, class165 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method1292(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field364 + field295 & 0x7FF;
        int var8 = class85.field1439[var7];
        int var9 = class85.field1453[var7];
        int var10 = var8 * 256 / (field352 + 256);
        int var11 = var9 * 256 / (field352 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field1658.method3947(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("bq.du(IIIILhs;Lfb;I)V")
    public static final void method1292(int arg0, int arg1, int arg2, int arg3, class225 arg4, class165 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field364 + field295 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class85.field1439[var6];
        int var9 = class85.field1453[var6];
        int var10 = var8 * 256 / (field352 + 256);
        int var11 = var9 * 256 / (field352 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method3874(arg5.field2157 / 2 + var12 - arg4.field3208 / 2, arg5.field2154 / 2 - var13 - arg4.field3214 / 2, arg0, arg1, arg5.field2157, arg5.field2154, arg5.field2153, arg5.field2151);
        } else {
            arg4.method3864(arg5.field2157 / 2 + arg0 + var12 - arg4.field3208 / 2, arg5.field2154 / 2 + arg1 - var13 - arg4.field3214 / 2);
        }
    }

    @ObfuscatedName("dz.dt(Ljava/lang/String;ZI)Z")
    public static boolean method2022(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class205.method1599(arg0, Statics.field1562);
        for (int var3 = 0; var3 < field545; var3++) {
            if (var2.equalsIgnoreCase(class205.method1599(field383[var3].field144, Statics.field1562)) && (!arg1 || field383[var3].field146 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class205.method1599(Statics.field169.field264, Statics.field1562))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fe.di(Ljava/lang/String;I)Z")
    public static boolean method3004(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class205.method1599(arg0, Statics.field1562);
        for (int var2 = 0; var2 < field549; var2++) {
            class20 var3 = field330[var2];
            if (var1.equalsIgnoreCase(class205.method1599(var3.field201, Statics.field1562))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class205.method1599(var3.field204, Statics.field1562))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("gu.ds(Ljava/lang/String;B)V")
    public static final void method3521(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field545 < 200 || field305 == 1) || field545 >= 400) {
            class48.method1829(30, "", class174.field2516);
            return;
        }
        String var1 = class205.method1599(arg0, Statics.field1562);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field545; var2++) {
            class15 var3 = field383[var2];
            String var4 = class205.method1599(var3.field144, Statics.field1562);
            if (var4 != null && var4.equals(var1)) {
                class48.method1829(30, "", arg0 + class174.field2517);
                return;
            }
            if (var3.field145 != null) {
                String var5 = class205.method1599(var3.field145, Statics.field1562);
                if (var5 != null && var5.equals(var1)) {
                    class48.method1829(30, "", arg0 + class174.field2517);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field549; var6++) {
            class20 var7 = field330[var6];
            String var8 = class205.method1599(var7.field201, Statics.field1562);
            if (var8 != null && var8.equals(var1)) {
                class48.method1829(30, "", class174.field2522 + arg0 + class174.field2454);
                return;
            }
            if (var7.field204 != null) {
                String var9 = class205.method1599(var7.field204, Statics.field1562);
                if (var9 != null && var9.equals(var1)) {
                    class48.method1829(30, "", class174.field2522 + arg0 + class174.field2454);
                    return;
                }
            }
        }
        if (class205.method1599(Statics.field169.field264, Statics.field1562).equals(var1)) {
            class48.method1829(30, "", class174.field2520);
        } else {
            field395.method2804(127);
            field395.method2578(class154.method724(arg0));
            field395.method2584(arg0);
        }
    }

    @ObfuscatedName("dt.dh(Ljava/lang/String;ZI)V")
    public static final void method2112(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field549 < 100 || field305 == 1) || field549 >= 400) {
            class48.method1829(31, "", class174.field2518);
            return;
        }
        String var2 = class205.method1599(arg0, Statics.field1562);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field549; var3++) {
            class20 var4 = field330[var3];
            String var5 = class205.method1599(var4.field201, Statics.field1562);
            if (var5 != null && var5.equals(var2)) {
                class48.method1829(31, "", arg0 + class174.field2519);
                return;
            }
            if (var4.field204 != null) {
                String var6 = class205.method1599(var4.field204, Statics.field1562);
                if (var6 != null && var6.equals(var2)) {
                    class48.method1829(31, "", arg0 + class174.field2519);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field545; var7++) {
            class15 var8 = field383[var7];
            String var9 = class205.method1599(var8.field144, Statics.field1562);
            if (var9 != null && var9.equals(var2)) {
                class48.method1829(31, "", class174.field2524 + arg0 + class174.field2525);
                return;
            }
            if (var8.field145 != null) {
                String var10 = class205.method1599(var8.field145, Statics.field1562);
                if (var10 != null && var10.equals(var2)) {
                    class48.method1829(31, "", class174.field2524 + arg0 + class174.field2525);
                    return;
                }
            }
        }
        if (class205.method1599(Statics.field169.field264, Statics.field1562).equals(var2)) {
            class48.method1829(31, "", class174.field2521);
        } else {
            field395.method2804(83);
            field395.method2578(class154.method724(arg0));
            field395.method2584(arg0);
        }
    }

    @ObfuscatedName("fd.dj(Ljava/lang/String;I)V")
    public static final void method2932(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class205.method1599(arg0, Statics.field1562);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field549; var2++) {
            class20 var3 = field330[var2];
            String var4 = var3.field201;
            String var5 = class205.method1599(var4, Statics.field1562);
            if (class218.method1331(arg0, var1, var4, var5)) {
                field549--;
                for (int var6 = var2; var6 < field549; var6++) {
                    field330[var6] = field330[var6 + 1];
                }
                field417 = field463;
                field395.method2804(36);
                field395.method2578(class154.method724(arg0));
                field395.method2584(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("dv.do(Ljava/lang/String;II)V")
    public static final void method1907(String arg0, int arg1) {
        field395.method2804(121);
        field395.method2578(class154.method724(arg0) + 1);
        field395.method2584(arg0);
        field395.method2734(arg1);
    }

    @ObfuscatedName("ag.df(Ljava/lang/String;I)V")
    public static final void method726(String arg0) {
        if (Statics.field1545 != null) {
            field395.method2804(79);
            field395.method2578(class154.method724(arg0));
            field395.method2584(arg0);
        }
    }

    @ObfuscatedName("cc.dc(I)V")
    public static final void method1592() {
        field395.method2804(111);
        field395.method2578(0);
    }

    @ObfuscatedName("ae.dn(II)V")
    public static void method798(int arg0) {
        for (class134 var1 = (class134) field480.method2186(); var1 != null; var1 = (class134) field480.method2194()) {
            if ((var1.field1885 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method2225();
            }
        }
    }

    @ObfuscatedName("af.dx(Lfw;S)I")
    public static int method711(class170 arg0) {
        class134 var1 = (class134) field480.method2199(((long) arg0.field2237 << 32) + (long) arg0.field2198);
        return var1 == null ? arg0.field2269 : var1.field1898;
    }

    @ObfuscatedName("ck.db(Lfw;I)Z")
    public static boolean method1799(class170 arg0) {
        if (field506) {
            if (method711(arg0) != 0) {
                return false;
            }
            if (arg0.field2199 == 0) {
                return false;
            }
        }
        return arg0.field2217;
    }

    @ObfuscatedName("f.da(Lfw;I)Ljava/lang/String;")
    public static String method206(class170 arg0) {
        int var1 = method711(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2276 == null || arg0.field2276.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2276;
        }
    }

    @ObfuscatedName("f.dp(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method204(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field425 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field425 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field425 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field425 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field425 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field928 != null) {
            var3 = "/p=" + Statics.field928;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field354 + "/a=" + Statics.field2023 + var3 + "/";
    }

    @ObfuscatedName("fg.ew(Ljava/lang/String;I)V")
    public static void method2829(String arg0) {
        Statics.field928 = arg0;
        try {
            String var1 = Statics.field1537.getParameter(class215.field3158.field3161);
            String var2 = Statics.field1537.getParameter(class215.field3159.field3161);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class156.method1597() + 94608000000L;
                class163.field2147.setTime(new Date(var6));
                int var8 = class163.field2147.get(7);
                int var9 = class163.field2147.get(5);
                int var10 = class163.field2147.get(2);
                int var11 = class163.field2147.get(1);
                int var12 = class163.field2147.get(11);
                int var13 = class163.field2147.get(12);
                int var14 = class163.field2147.get(13);
                String var15 = class163.field2149[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class163.field2146[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field1537;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }

    @ObfuscatedName("em.eh(Ljava/lang/String;ZI)V")
    public static void method2404(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field2944; var5++) {
            class199 var6 = class199.method713(var5);
            if ((!arg1 || var6.field2988) && var6.field2981 == -1 && var6.field2958.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1855 = -1;
                    Statics.field1816 = null;
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
        Statics.field1816 = var3;
        Statics.field946 = 0;
        Statics.field1855 = var4;
        String[] var9 = new String[Statics.field1855];
        for (int var10 = 0; var10 < Statics.field1855; var10++) {
            var9[var10] = class199.method713(var3[var10]).field2958;
        }
        short[] var11 = Statics.field1816;
        class151.method47(var9, var11, 0, var9.length - 1);
    }
}

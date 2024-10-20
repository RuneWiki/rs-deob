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
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class114 {

    @ObfuscatedName("client.b")
    public static boolean field289 = true;

    @ObfuscatedName("client.g")
    public static int field290 = 1;

    @ObfuscatedName("client.h")
    public static int field457 = 0;

    @ObfuscatedName("client.l")
    public static int field429 = 0;

    @ObfuscatedName("client.k")
    public static boolean field294 = false;

    @ObfuscatedName("client.z")
    public static boolean field315 = false;

    @ObfuscatedName("client.j")
    public static int field510 = 0;

    @ObfuscatedName("client.d")
    public static int field297 = 0;

    @ObfuscatedName("client.w")
    public static class118[] field348 = new class118[4];

    @ObfuscatedName("client.n")
    public static boolean field298 = true;

    @ObfuscatedName("client.q")
    public static int field299 = 0;

    @ObfuscatedName("client.t")
    public static long field300 = 1L;

    @ObfuscatedName("client.a")
    public static int field480 = -1;

    @ObfuscatedName("client.e")
    public static int field302 = -1;

    @ObfuscatedName("client.am")
    public static int field544 = -1;

    @ObfuscatedName("client.ag")
    public static boolean field351 = true;

    @ObfuscatedName("client.au")
    public static boolean field476 = false;

    @ObfuscatedName("client.aa")
    public static int field306 = 0;

    @ObfuscatedName("client.ae")
    public static int field307 = 0;

    @ObfuscatedName("client.av")
    public static int field308 = 0;

    @ObfuscatedName("client.ao")
    public static int field358 = 0;

    @ObfuscatedName("client.ah")
    public static int field334 = 0;

    @ObfuscatedName("client.ak")
    public static int field365 = 0;

    @ObfuscatedName("client.ab")
    public static int field312 = 0;

    @ObfuscatedName("client.ay")
    public static int field431 = 0;

    @ObfuscatedName("client.an")
    public static int field314 = 0;

    @ObfuscatedName("client.ac")
    public static class41 field377 = class41.field825;

    @ObfuscatedName("client.ar")
    public static class41 field316 = class41.field825;

    @ObfuscatedName("client.al")
    public static int field383 = 0;

    @ObfuscatedName("client.ai")
    public static int field319 = 0;

    @ObfuscatedName("client.ap")
    public static int field320 = 0;

    @ObfuscatedName("client.bc")
    public static int field321 = 0;

    @ObfuscatedName("client.bs")
    public static int field515 = 0;

    @ObfuscatedName("client.bi")
    public static int field323 = 0;

    @ObfuscatedName("client.bx")
    public static int field324 = 0;

    @ObfuscatedName("client.bw")
    public static int field373 = 0;

    @ObfuscatedName("client.ce")
    public static class36[] field326 = new class36[32768];

    @ObfuscatedName("client.ca")
    public static int field493 = 0;

    @ObfuscatedName("client.cp")
    public static int[] field328 = new int[32768];

    @ObfuscatedName("client.cy")
    public static int field329 = 0;

    @ObfuscatedName("client.ch")
    public static int[] field385 = new int[250];

    @ObfuscatedName("client.cl")
    public static class160 field331 = new class160(5000);

    @ObfuscatedName("client.cb")
    public static class160 field332 = new class160(5000);

    @ObfuscatedName("client.ck")
    public static class160 field333 = new class160(15000);

    @ObfuscatedName("client.cn")
    public static int field524 = 0;

    @ObfuscatedName("client.cr")
    public static int field335 = 0;

    @ObfuscatedName("client.ci")
    public static int field336 = 0;

    @ObfuscatedName("client.cc")
    public static int field337 = 0;

    @ObfuscatedName("client.cq")
    public static int field338 = 0;

    @ObfuscatedName("client.cg")
    public static int field411 = 0;

    @ObfuscatedName("client.cw")
    public static int field340 = 0;

    @ObfuscatedName("client.cv")
    public static int field341 = 0;

    @ObfuscatedName("client.cs")
    public static boolean field342 = false;

    @ObfuscatedName("client.di")
    public static int field517 = 0;

    @ObfuscatedName("client.dl")
    public static int field344 = 1;

    @ObfuscatedName("client.dj")
    public static int field345 = 0;

    @ObfuscatedName("client.dk")
    public static int field346 = 1;

    @ObfuscatedName("client.de")
    public static int field347 = 0;

    @ObfuscatedName("client.dm")
    public static boolean field349 = false;

    @ObfuscatedName("client.df")
    public static int[][][] field448 = new int[4][13][13];

    @ObfuscatedName("client.dy")
    public static final int[] field529 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.db")
    public static int field506 = 0;

    @ObfuscatedName("client.dp")
    public static int field311 = 2;

    @ObfuscatedName("client.dr")
    public static int field516 = 0;

    @ObfuscatedName("client.dv")
    public static int field537 = 2;

    @ObfuscatedName("client.dn")
    public static int field366 = 0;

    @ObfuscatedName("client.ef")
    public static int field296 = 1;

    @ObfuscatedName("client.ei")
    public static int field557 = 0;

    @ObfuscatedName("client.ej")
    public static int field359 = 0;

    @ObfuscatedName("client.eu")
    public static int field561 = 2;

    @ObfuscatedName("client.ed")
    public static int field361 = 0;

    @ObfuscatedName("client.eq")
    public static int field362 = 1;

    @ObfuscatedName("client.er")
    public static int field363 = 0;

    @ObfuscatedName("client.ey")
    public static int field364 = 0;

    @ObfuscatedName("client.ee")
    public static int field360 = 2301979;

    @ObfuscatedName("client.eb")
    public static int field569 = 5063219;

    @ObfuscatedName("client.ex")
    public static int field412 = 3353893;

    @ObfuscatedName("client.ez")
    public static int field354 = 7759444;

    @ObfuscatedName("client.em")
    public static boolean field369 = false;

    @ObfuscatedName("client.el")
    public static int field370 = 0;

    @ObfuscatedName("client.fq")
    public static int field371 = 128;

    @ObfuscatedName("client.fu")
    public static int field372 = 0;

    @ObfuscatedName("client.fk")
    public static int field503 = 0;

    @ObfuscatedName("client.fe")
    public static int field553 = 0;

    @ObfuscatedName("client.ff")
    public static int field375 = 0;

    @ObfuscatedName("client.fw")
    public static int field520 = 0;

    @ObfuscatedName("client.fi")
    public static int field322 = 50;

    @ObfuscatedName("client.fg")
    public static int field403 = 0;

    @ObfuscatedName("client.fz")
    public static boolean field379 = false;

    @ObfuscatedName("client.fn")
    public static int field380 = 0;

    @ObfuscatedName("client.fv")
    public static int field293 = 0;

    @ObfuscatedName("client.fx")
    public static int field382 = 50;

    @ObfuscatedName("client.fj")
    public static int[] field287 = new int[field382];

    @ObfuscatedName("client.fr")
    public static int[] field305 = new int[field382];

    @ObfuscatedName("client.fd")
    public static int[] field459 = new int[field382];

    @ObfuscatedName("client.fs")
    public static int[] field531 = new int[field382];

    @ObfuscatedName("client.fm")
    public static int[] field387 = new int[field382];

    @ObfuscatedName("client.fc")
    public static int[] field356 = new int[field382];

    @ObfuscatedName("client.ft")
    public static int[] field415 = new int[field382];

    @ObfuscatedName("client.gl")
    public static String[] field390 = new String[field382];

    @ObfuscatedName("client.gc")
    public static int[][] field391 = new int[104][104];

    @ObfuscatedName("client.gk")
    public static int field392 = 0;

    @ObfuscatedName("client.gj")
    public static int field393 = -1;

    @ObfuscatedName("client.gn")
    public static int field394 = -1;

    @ObfuscatedName("client.ga")
    public static int field501 = 0;

    @ObfuscatedName("client.gs")
    public static int field396 = 0;

    @ObfuscatedName("client.gw")
    public static int field397 = 0;

    @ObfuscatedName("client.gm")
    public static int field477 = 0;

    @ObfuscatedName("client.gq")
    public static int field399 = 0;

    @ObfuscatedName("client.gt")
    public static int field400 = 0;

    @ObfuscatedName("client.gi")
    public static int field401 = 0;

    @ObfuscatedName("client.gg")
    public static int field432 = 0;

    @ObfuscatedName("client.gu")
    public static int field388 = 0;

    @ObfuscatedName("client.gh")
    public static int field404 = 0;

    @ObfuscatedName("client.gd")
    public static boolean field405 = false;

    @ObfuscatedName("client.gf")
    public static int field406 = 0;

    @ObfuscatedName("client.gp")
    public static int field543 = 0;

    @ObfuscatedName("client.gv")
    public static class24[] field408 = new class24[2048];

    @ObfuscatedName("client.gz")
    public static int field409 = -1;

    @ObfuscatedName("client.ge")
    public static int field410 = 0;

    @ObfuscatedName("client.he")
    public static int field317 = 0;

    @ObfuscatedName("client.hi")
    public static int[] field288 = new int[1000];

    @ObfuscatedName("client.hk")
    public static final int[] field413 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hp")
    public static String[] field414 = new String[8];

    @ObfuscatedName("client.hh")
    public static boolean[] field374 = new boolean[8];

    @ObfuscatedName("client.hw")
    public static int[] field416 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hz")
    public static int field417 = -1;

    @ObfuscatedName("client.hf")
    public static class129[][][] field418 = new class129[4][104][104];

    @ObfuscatedName("client.ha")
    public static class129 field301 = new class129();

    @ObfuscatedName("client.hn")
    public static class129 field420 = new class129();

    @ObfuscatedName("client.hg")
    public static class129 field512 = new class129();

    @ObfuscatedName("client.hv")
    public static int[] field422 = new int[25];

    @ObfuscatedName("client.hj")
    public static int[] field443 = new int[25];

    @ObfuscatedName("client.hd")
    public static int[] field402 = new int[25];

    @ObfuscatedName("client.hm")
    public static int field425 = 0;

    @ObfuscatedName("client.ho")
    public static boolean field426 = false;

    @ObfuscatedName("client.hb")
    public static int field427 = 0;

    @ObfuscatedName("client.hs")
    public static int[] field428 = new int[500];

    @ObfuscatedName("client.hl")
    public static int[] field343 = new int[500];

    @ObfuscatedName("client.il")
    public static int[] field430 = new int[500];

    @ObfuscatedName("client.ib")
    public static int[] field423 = new int[500];

    @ObfuscatedName("client.ig")
    public static String[] field446 = new String[500];

    @ObfuscatedName("client.iq")
    public static String[] field433 = new String[500];

    @ObfuscatedName("client.iv")
    public static int field505 = -1;

    @ObfuscatedName("client.ij")
    public static int field502 = -1;

    @ObfuscatedName("client.is")
    public static int field513 = 0;

    @ObfuscatedName("client.ia")
    public static int field437 = 50;

    @ObfuscatedName("client.ii")
    public static int field438 = 0;

    @ObfuscatedName("client.ih")
    public static String field439 = null;

    @ObfuscatedName("client.in")
    public static boolean field440 = false;

    @ObfuscatedName("client.iy")
    public static int field386 = -1;

    @ObfuscatedName("client.ip")
    public static int field442 = -1;

    @ObfuscatedName("client.iz")
    public static String field563 = null;

    @ObfuscatedName("client.it")
    public static String field444 = null;

    @ObfuscatedName("client.im")
    public static int field445 = -1;

    @ObfuscatedName("client.ic")
    public static class126 field419 = new class126(8);

    @ObfuscatedName("client.ik")
    public static int field447 = 0;

    @ObfuscatedName("client.jd")
    public static int field355 = 0;

    @ObfuscatedName("client.je")
    public static class170 field449 = null;

    @ObfuscatedName("client.jg")
    public static int field450 = 0;

    @ObfuscatedName("client.jp")
    public static int field451 = 0;

    @ObfuscatedName("client.jh")
    public static int field452 = 0;

    @ObfuscatedName("client.jz")
    public static int field453 = -1;

    @ObfuscatedName("client.jy")
    public static boolean field454 = false;

    @ObfuscatedName("client.jm")
    public static boolean field455 = false;

    @ObfuscatedName("client.jl")
    public static boolean field435 = false;

    @ObfuscatedName("client.jc")
    public static class170 field567 = null;

    @ObfuscatedName("client.jx")
    public static class170 field456 = null;

    @ObfuscatedName("client.jo")
    public static class170 field436 = null;

    @ObfuscatedName("client.ja")
    public static int field460 = 0;

    @ObfuscatedName("client.jj")
    public static int field461 = 0;

    @ObfuscatedName("client.jr")
    public static class170 field462 = null;

    @ObfuscatedName("client.js")
    public static boolean field389 = false;

    @ObfuscatedName("client.jv")
    public static int field464 = -1;

    @ObfuscatedName("client.jq")
    public static int field465 = -1;

    @ObfuscatedName("client.jb")
    public static boolean field466 = false;

    @ObfuscatedName("client.jw")
    public static int field434 = -1;

    @ObfuscatedName("client.jk")
    public static int field468 = -1;

    @ObfuscatedName("client.jt")
    public static boolean field469 = false;

    @ObfuscatedName("client.kl")
    public static int field470 = 1;

    @ObfuscatedName("client.kc")
    public static int[] field471 = new int[32];

    @ObfuscatedName("client.kx")
    public static int field472 = 0;

    @ObfuscatedName("client.ky")
    public static int[] field473 = new int[32];

    @ObfuscatedName("client.kp")
    public static int field474 = 0;

    @ObfuscatedName("client.ko")
    public static int[] field327 = new int[32];

    @ObfuscatedName("client.ki")
    public static int field558 = 0;

    @ObfuscatedName("client.ka")
    public static int field458 = 0;

    @ObfuscatedName("client.ks")
    public static int field478 = 0;

    @ObfuscatedName("client.kk")
    public static int field339 = 0;

    @ObfuscatedName("client.kf")
    public static int field467 = 0;

    @ObfuscatedName("client.kh")
    public static int field481 = 0;

    @ObfuscatedName("client.ke")
    public static int field482 = 0;

    @ObfuscatedName("client.kv")
    public static int field483 = 0;

    @ObfuscatedName("client.kb")
    public static class129 field484 = new class129();

    @ObfuscatedName("client.kq")
    public static class129 field485 = new class129();

    @ObfuscatedName("client.kg")
    public static class129 field486 = new class129();

    @ObfuscatedName("client.kj")
    public static class126 field487 = new class126(512);

    @ObfuscatedName("client.kz")
    public static int field488 = 0;

    @ObfuscatedName("client.kt")
    public static int field489 = -2;

    @ObfuscatedName("client.kn")
    public static boolean[] field309 = new boolean[100];

    @ObfuscatedName("client.ld")
    public static boolean[] field491 = new boolean[100];

    @ObfuscatedName("client.lw")
    public static boolean[] field492 = new boolean[100];

    @ObfuscatedName("client.lr")
    public static int[] field310 = new int[100];

    @ObfuscatedName("client.lh")
    public static int[] field421 = new int[100];

    @ObfuscatedName("client.lx")
    public static int[] field495 = new int[100];

    @ObfuscatedName("client.lc")
    public static int[] field357 = new int[100];

    @ObfuscatedName("client.lj")
    public static int field497 = 0;

    @ObfuscatedName("client.ls")
    public static long field498 = 0L;

    @ObfuscatedName("client.li")
    public static boolean field499 = true;

    @ObfuscatedName("client.lm")
    public static int field500 = 1;

    @ObfuscatedName("client.lq")
    public static int field384 = 503;

    @ObfuscatedName("client.lo")
    public static int[] field381 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lb")
    public static int field353 = 0;

    @ObfuscatedName("client.lf")
    public static int field504 = 0;

    @ObfuscatedName("client.le")
    public static String field304 = "";

    @ObfuscatedName("client.ly")
    public static long[] field542 = new long[100];

    @ObfuscatedName("client.ll")
    public static int field507 = 0;

    @ObfuscatedName("client.lz")
    public static int field508 = 0;

    @ObfuscatedName("client.lp")
    public static int[] field509 = new int[128];

    @ObfuscatedName("client.ml")
    public static int[] field303 = new int[128];

    @ObfuscatedName("client.mw")
    public static long field407 = -1L;

    @ObfuscatedName("client.mn")
    public static String field291 = null;

    @ObfuscatedName("client.mq")
    public static String field376 = null;

    @ObfuscatedName("client.mm")
    public static int field514 = -1;

    @ObfuscatedName("client.mj")
    public static int field378 = 0;

    @ObfuscatedName("client.mc")
    public static int[] field424 = new int[1000];

    @ObfuscatedName("client.md")
    public static int[] field475 = new int[1000];

    @ObfuscatedName("client.my")
    public static class225[] field518 = new class225[1000];

    @ObfuscatedName("client.me")
    public static int field519 = 0;

    @ObfuscatedName("client.mv")
    public static int field490 = 0;

    @ObfuscatedName("client.mz")
    public static int field521 = 0;

    @ObfuscatedName("client.mp")
    public static int field522 = 255;

    @ObfuscatedName("client.mr")
    public static int field523 = -1;

    @ObfuscatedName("client.mf")
    public static boolean field494 = false;

    @ObfuscatedName("client.nd")
    public static int field525 = 127;

    @ObfuscatedName("client.nj")
    public static int field526 = 127;

    @ObfuscatedName("client.nk")
    public static int field527 = 0;

    @ObfuscatedName("client.ni")
    public static int[] field528 = new int[50];

    @ObfuscatedName("client.nl")
    public static int[] field352 = new int[50];

    @ObfuscatedName("client.np")
    public static int[] field530 = new int[50];

    @ObfuscatedName("client.nv")
    public static int[] field350 = new int[50];

    @ObfuscatedName("client.nf")
    public static class54[] field532 = new class54[50];

    @ObfuscatedName("client.nn")
    public static boolean field555 = false;

    @ObfuscatedName("client.na")
    public static boolean[] field534 = new boolean[5];

    @ObfuscatedName("client.of")
    public static int[] field535 = new int[5];

    @ObfuscatedName("client.oq")
    public static int[] field536 = new int[5];

    @ObfuscatedName("client.ox")
    public static int[] field368 = new int[5];

    @ObfuscatedName("client.ov")
    public static int[] field538 = new int[5];

    @ObfuscatedName("client.od")
    public static short field539 = 256;

    @ObfuscatedName("client.os")
    public static short field540 = 205;

    @ObfuscatedName("client.ou")
    public static short field367 = 256;

    @ObfuscatedName("client.or")
    public static short field395 = 320;

    @ObfuscatedName("client.oh")
    public static short field398 = 1;

    @ObfuscatedName("client.oc")
    public static short field463 = 32767;

    @ObfuscatedName("client.oi")
    public static short field545 = 1;

    @ObfuscatedName("client.op")
    public static short field511 = 32767;

    @ObfuscatedName("client.oy")
    public static int field547 = 0;

    @ObfuscatedName("client.ow")
    public static int field548 = 0;

    @ObfuscatedName("client.oe")
    public static int field549 = 0;

    @ObfuscatedName("client.ok")
    public static int field550 = 0;

    @ObfuscatedName("client.oa")
    public static int field570 = 0;

    @ObfuscatedName("client.og")
    public static int field552 = 0;

    @ObfuscatedName("client.om")
    public static int field313 = 0;

    @ObfuscatedName("client.oj")
    public static class15[] field554 = new class15[400];

    @ObfuscatedName("client.ot")
    public static class131 field479 = new class131();

    @ObfuscatedName("client.oz")
    public static int field556 = 0;

    @ObfuscatedName("client.ol")
    public static class20[] field551 = new class20[400];

    @ObfuscatedName("client.oo")
    public static class167 field496 = new class167();

    @ObfuscatedName("client.pl")
    public static int field559 = -1;

    @ObfuscatedName("client.pb")
    public static int field560 = -1;

    @ObfuscatedName("client.pq")
    public static class5[] field533 = new class5[8];

    @ObfuscatedName("client.pu")
    public static long field562 = -1L;

    @ObfuscatedName("client.ph")
    public static long field295 = -1L;

    @ObfuscatedName("client.pv")
    public static final class23 field564 = new class23();

    @ObfuscatedName("client.pn")
    public static int[] field565 = new int[50];

    @ObfuscatedName("client.pi")
    public static int[] field566 = new int[50];

    @ObfuscatedName("client.b(I)V")
    public final void method306() {
    }

    public final void init() {
        if (!this.method1930()) {
            return;
        }
        class215[] var1 = class215.method3569();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class215 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3158);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3158)) {
                    case 1:
                        Statics.field1777 = var4;
                        break;
                    case 2:
                        Statics.field2196 = var4;
                        break;
                    case 3:
                        Statics.field3241 = Integer.parseInt(var4);
                        break;
                    case 4:
                        if (var4.equalsIgnoreCase(class38.field790)) {
                            field294 = true;
                        } else {
                            field294 = false;
                        }
                    case 5:
                    case 7:
                    default:
                        break;
                    case 6:
                        field290 = Integer.parseInt(var4);
                        break;
                    case 8:
                        Statics.field292 = class179.method2992(Integer.parseInt(var4));
                        break;
                    case 9:
                        Statics.field216 = Integer.parseInt(var4);
                        break;
                    case 10:
                        field429 = Integer.parseInt(var4);
                        break;
                    case 11:
                        field457 = Integer.parseInt(var4);
                        break;
                    case 12:
                        if (var4.equalsIgnoreCase(class38.field790)) {
                        }
                        break;
                    case 13:
                        field510 = Integer.parseInt(var4);
                        break;
                    case 14:
                        class180[] var5 = new class180[] { class180.field2696, class180.field2695, class180.field2694, class180.field2693, class180.field2692, class180.field2698 };
                        Statics.field2025 = (class180) class149.method1314(var5, Integer.parseInt(var4));
                        if (Statics.field2025 == class180.field2696) {
                            Statics.field156 = class229.field3231;
                        } else {
                            Statics.field156 = class229.field3240;
                        }
                }
            }
        }
        Statics.method874();
        Statics.field1968 = this.getCodeBase().getHost();
        String var6 = Statics.field292.field2686;
        byte var7 = 0;
        try {
            class105.method3147("oldschool", var6, var7, 16);
        } catch (Exception var9) {
            class102.method1762((String) null, var9);
        }
        Statics.field541 = this;
        this.method1928(765, 503, 128);
    }

    @ObfuscatedName("client.c(I)V")
    public final void method342() {
        Statics.field238 = field429 == 0 ? 43594 : field290 + 40000;
        Statics.field813 = field429 == 0 ? 443 : field290 + 50000;
        Statics.field3088 = Statics.field238;
        Statics.field2167 = class168.field2192;
        Statics.field1868 = class168.field2194;
        Statics.field2186 = class168.field2193;
        Statics.field1462 = class168.field2195;
        class106.method186();
        class106.method592(Statics.field782);
        class116.method556(Statics.field782);
        Statics.field2034 = class113.method1802();
        if (Statics.field2034 != null) {
            Statics.field2034.method1872(Statics.field782);
        }
        Statics.field1295 = new class117(255, class105.field1689, class105.field1690, 500000);
        Statics.field36 = class31.method719();
        Statics.field1211 = this.getToolkit().getSystemClipboard();
        class115.method2870(this, Statics.field86);
        if (field429 != 0) {
            field476 = true;
        }
        int var1 = Statics.field36.field702;
        field498 = 0L;
        if (var1 >= 2) {
            field499 = true;
        } else {
            field499 = false;
        }
        method90();
        if (field297 >= 25) {
            field331.method2782(92);
            field331.method2641(method856());
            field331.method2538(Statics.field1201);
            field331.method2538(Statics.field1585);
        }
        field1798 = true;
    }

    @ObfuscatedName("client.u(I)V")
    public final void method244() {
        field299++;
        this.method381();
        while (true) {
            class129 var1 = class184.field2734;
            class181 var2;
            synchronized (class184.field2734) {
                var2 = (class181) class184.field2735.method2199();
            }
            if (var2 == null) {
                class139.method1808();
                method3101();
                class106.method233();
                class116 var4 = class116.field1811;
                synchronized (class116.field1811) {
                    class116.field1823 = class116.field1828;
                    class116.field1815 = class116.field1812;
                    class116.field1822 = class116.field1813;
                    class116.field1821 = class116.field1817;
                    class116.field1824 = class116.field1818;
                    class116.field1826 = class116.field1819;
                    class116.field1814 = class116.field1820;
                    class116.field1817 = 0;
                }
                if (Statics.field2034 != null) {
                    int var6 = Statics.field2034.method1874();
                    field483 = var6;
                }
                if (field297 == 0) {
                    method170();
                    Statics.field78.method1787();
                    for (int var7 = 0; var7 < 32; var7++) {
                        field1792[var7] = 0L;
                    }
                    for (int var8 = 0; var8 < 32; var8++) {
                        field1787[var8] = 0L;
                    }
                    Statics.field185 = 0;
                } else if (field297 == 5) {
                    class42.method94(this);
                    method170();
                    Statics.field78.method1787();
                    for (int var9 = 0; var9 < 32; var9++) {
                        field1792[var9] = 0L;
                    }
                    for (int var10 = 0; var10 < 32; var10++) {
                        field1787[var10] = 0L;
                    }
                    Statics.field185 = 0;
                } else if (field297 == 10 || field297 == 11) {
                    class42.method94(this);
                } else if (field297 == 20) {
                    class42.method94(this);
                    method101();
                } else if (field297 == 25) {
                    method177();
                }
                if (field297 == 30) {
                    if (field306 > 1) {
                        field306--;
                    }
                    if (field341 > 0) {
                        field341--;
                    }
                    if (field342) {
                        field342 = false;
                        method1760();
                    } else {
                        if (!field426) {
                            field446[0] = class174.field2419;
                            field433[0] = "";
                            field430[0] = 1006;
                            field427 = 1;
                        }
                        for (int var11 = 0; var11 < 100 && method1924(); var11++) {
                        }
                        if (field297 == 30) {
                            while (class228.method2909()) {
                                field331.method2782(178);
                                field331.method2641(0);
                                int var12 = field331.field2105;
                                class228.method3272(field331);
                                field331.method2735(field331.field2105 - var12);
                            }
                            Object var13 = Statics.field696.field224;
                            synchronized (Statics.field696.field224) {
                                if (!field289) {
                                    Statics.field696.field225 = 0;
                                } else if (class116.field1821 != 0 || Statics.field696.field225 >= 40) {
                                    field331.method2782(140);
                                    field331.method2641(0);
                                    int var14 = field331.field2105;
                                    int var15 = 0;
                                    for (int var16 = 0; var16 < Statics.field696.field225 && field331.field2105 - var14 < 240; var16++) {
                                        var15++;
                                        int var17 = Statics.field696.field228[var16];
                                        if (var17 < 0) {
                                            var17 = 0;
                                        } else if (var17 > 502) {
                                            var17 = 502;
                                        }
                                        int var18 = Statics.field696.field226[var16];
                                        if (var18 < 0) {
                                            var18 = 0;
                                        } else if (var18 > 764) {
                                            var18 = 764;
                                        }
                                        int var19 = var17 * 765 + var18;
                                        if (Statics.field696.field228[var16] == -1 && Statics.field696.field226[var16] == -1) {
                                            var18 = -1;
                                            var17 = -1;
                                            var19 = 524287;
                                        }
                                        if (field480 != var18 || field302 != var17) {
                                            int var20 = var18 - field480;
                                            field480 = var18;
                                            int var21 = var17 - field302;
                                            field302 = var17;
                                            if (field544 < 8 && var20 >= -32 && var20 <= 31 && var21 >= -32 && var21 <= 31) {
                                                var20 += 32;
                                                var21 += 32;
                                                field331.method2538((field544 << 12) + (var20 << 6) + var21);
                                                field544 = 0;
                                            } else if (field544 < 8) {
                                                field331.method2539((field544 << 19) + 8388608 + var19);
                                                field544 = 0;
                                            } else {
                                                field331.method2540((field544 << 19) + -1073741824 + var19);
                                                field544 = 0;
                                            }
                                        } else if (field544 < 2047) {
                                            field544++;
                                        }
                                    }
                                    field331.method2735(field331.field2105 - var14);
                                    if (var15 >= Statics.field696.field225) {
                                        Statics.field696.field225 = 0;
                                    } else {
                                        Statics.field696.field225 -= var15;
                                        for (int var22 = 0; var22 < Statics.field696.field225; var22++) {
                                            Statics.field696.field226[var22] = Statics.field696.field226[var15 + var22];
                                            Statics.field696.field228[var22] = Statics.field696.field228[var15 + var22];
                                        }
                                    }
                                }
                            }
                            if (class116.field1821 == 1 || !Statics.field2048 && class116.field1821 == 4 || class116.field1821 == 2) {
                                long var24 = (class116.field1814 - field300 * -1L) / 50L;
                                if (var24 > 4095L) {
                                    var24 = 4095L;
                                }
                                field300 = class116.field1814 * -1L;
                                int var26 = class116.field1826;
                                if (var26 < 0) {
                                    var26 = 0;
                                } else if (var26 > Statics.field1585) {
                                    var26 = Statics.field1585;
                                }
                                int var27 = class116.field1824;
                                if (var27 < 0) {
                                    var27 = 0;
                                } else if (var27 > Statics.field1201) {
                                    var27 = Statics.field1201;
                                }
                                int var28 = (int) var24;
                                field331.method2782(141);
                                field331.method2538((class116.field1821 == 2 ? 1 : 0) + (var28 << 1));
                                field331.method2538(var27);
                                field331.method2538(var26);
                            }
                            if (class106.field1723 > 0) {
                                field331.method2782(244);
                                field331.method2538(0);
                                int var29 = field331.field2105;
                                long var30 = class156.method2009();
                                for (int var32 = 0; var32 < class106.field1723; var32++) {
                                    long var33 = var30 - field407;
                                    if (var33 > 16777215L) {
                                        var33 = 16777215L;
                                    }
                                    field407 = var30;
                                    field331.method2539((int) var33);
                                    field331.method2578(class106.field1722[var32]);
                                }
                                field331.method2548(field331.field2105 - var29);
                            }
                            if (field403 > 0) {
                                field403--;
                            }
                            if (class106.field1729[96] || class106.field1729[97] || class106.field1729[98] || class106.field1729[99]) {
                                field379 = true;
                            }
                            if (field379 && field403 <= 0) {
                                field403 = 20;
                                field379 = false;
                                field331.method2782(81);
                                field331.method2586(field371);
                                field331.method2586(field372);
                            }
                            if (Statics.field271 && !field351) {
                                field351 = true;
                                field331.method2782(55);
                                field331.method2641(1);
                            }
                            if (!Statics.field271 && field351) {
                                field351 = false;
                                field331.method2782(55);
                                field331.method2641(0);
                            }
                            if (Statics.field1094 != field514) {
                                field514 = Statics.field1094;
                                method3194(Statics.field1094);
                            }
                            if (field297 == 30) {
                                for (class26 var35 = (class26) field301.method2201(); var35 != null; var35 = (class26) field301.method2203()) {
                                    if (var35.field578 > 0) {
                                        var35.field578--;
                                    }
                                    if (var35.field578 == 0) {
                                        if (var35.field573 >= 0) {
                                            int var36 = var35.field573;
                                            int var37 = var35.field577;
                                            class198 var38 = class198.method2463(var36);
                                            if (var37 == 11) {
                                                var37 = 10;
                                            }
                                            if (var37 >= 5 && var37 <= 8) {
                                                var37 = 4;
                                            }
                                            boolean var39 = var38.method3321(var37);
                                            if (!var39) {
                                                continue;
                                            }
                                        }
                                        method569(var35.field576, var35.field572, var35.field585, var35.field574, var35.field573, var35.field582, var35.field577);
                                        var35.method2189();
                                    } else {
                                        if (var35.field581 > 0) {
                                            var35.field581--;
                                        }
                                        if (var35.field581 == 0 && var35.field585 >= 1 && var35.field574 >= 1 && var35.field585 <= 102 && var35.field574 <= 102) {
                                            if (var35.field580 >= 0) {
                                                int var40 = var35.field580;
                                                int var41 = var35.field571;
                                                class198 var42 = class198.method2463(var40);
                                                if (var41 == 11) {
                                                    var41 = 10;
                                                }
                                                if (var41 >= 5 && var41 <= 8) {
                                                    var41 = 4;
                                                }
                                                boolean var43 = var42.method3321(var41);
                                                if (!var43) {
                                                    continue;
                                                }
                                            }
                                            method569(var35.field576, var35.field572, var35.field585, var35.field574, var35.field580, var35.field579, var35.field571);
                                            var35.field581 = -1;
                                            if (var35.field580 == var35.field573 && var35.field573 == -1) {
                                                var35.method2189();
                                            } else if (var35.field580 == var35.field573 && var35.field582 == var35.field579 && var35.field577 == var35.field571) {
                                                var35.method2189();
                                            }
                                        }
                                    }
                                }
                                method176();
                                field336++;
                                if (field336 > 750) {
                                    method1760();
                                } else {
                                    int var44 = class46.field901;
                                    int[] var45 = class46.field903;
                                    for (int var46 = 0; var46 < var44; var46++) {
                                        class24 var47 = field408[var45[var46]];
                                        if (var47 != null) {
                                            Statics.method1785(var47, 1);
                                        }
                                    }
                                    method720();
                                    int[] var48 = class46.field903;
                                    for (int var49 = 0; var49 < class46.field901; var49++) {
                                        class24 var50 = field408[var48[var49]];
                                        if (var50 != null && var50.field620 > 0) {
                                            var50.field620--;
                                            if (var50.field620 == 0) {
                                                var50.field617 = null;
                                            }
                                        }
                                    }
                                    for (int var51 = 0; var51 < field493; var51++) {
                                        int var52 = field328[var51];
                                        class36 var53 = field326[var52];
                                        if (var53 != null && var53.field620 > 0) {
                                            var53.field620--;
                                            if (var53.field620 == 0) {
                                                var53.field617 = null;
                                            }
                                        }
                                    }
                                    field364++;
                                    if (field477 != 0) {
                                        field397 += 20;
                                        if (field397 >= 400) {
                                            field477 = 0;
                                        }
                                    }
                                    if (Statics.field210 != null) {
                                        field399++;
                                        if (field399 >= 15) {
                                            method1786(Statics.field210);
                                            Statics.field210 = null;
                                        }
                                    }
                                    class170 var54 = Statics.field246;
                                    class170 var55 = Statics.field1193;
                                    Statics.field246 = null;
                                    Statics.field1193 = null;
                                    field462 = null;
                                    field466 = false;
                                    field389 = false;
                                    field508 = 0;
                                    while (true) {
                                        while (class106.method148() && field508 < 128) {
                                            if (field452 >= 2 && class106.field1729[82] && Statics.field2671 == 66) {
                                                String var56 = class48.method3257();
                                                Statics.field1211.setContents(new StringSelection(var56), (ClipboardOwner) null);
                                            } else {
                                                field303[field508] = Statics.field2671;
                                                field509[field508] = Statics.field1530;
                                                field508++;
                                            }
                                        }
                                        if (field445 != -1) {
                                            int var57 = field445;
                                            int var58 = Statics.field1201;
                                            int var59 = Statics.field1585;
                                            if (class170.method26(var57)) {
                                                method2051(Statics.field2257[var57], -1, 0, 0, var58, var59, 0, 0);
                                            }
                                        }
                                        field470++;
                                        while (true) {
                                            class19 var60;
                                            class170 var61;
                                            class170 var62;
                                            do {
                                                var60 = (class19) field485.method2199();
                                                if (var60 == null) {
                                                    while (true) {
                                                        class19 var63;
                                                        class170 var64;
                                                        class170 var65;
                                                        do {
                                                            var63 = (class19) field486.method2199();
                                                            if (var63 == null) {
                                                                while (true) {
                                                                    class19 var66;
                                                                    class170 var67;
                                                                    class170 var68;
                                                                    do {
                                                                        var66 = (class19) field484.method2199();
                                                                        if (var66 == null) {
                                                                            Statics.method561();
                                                                            if (Statics.field670 == null && field456 == null) {
                                                                                int var69 = class116.field1821;
                                                                                if (field426) {
                                                                                    if (var69 != 1 && (Statics.field2048 || var69 != 4)) {
                                                                                        int var70 = class116.field1815;
                                                                                        int var71 = class116.field1822;
                                                                                        if (var70 < Statics.field1620 - 10 || var70 > Statics.field24 + Statics.field1620 + 10 || var71 < Statics.field1750 - 10 || var71 > Statics.field704 + Statics.field1750 + 10) {
                                                                                            field426 = false;
                                                                                            method87(Statics.field1620, Statics.field1750, Statics.field24, Statics.field704);
                                                                                        }
                                                                                    }
                                                                                    if (var69 == 1 || !Statics.field2048 && var69 == 4) {
                                                                                        int var72 = Statics.field1620;
                                                                                        int var73 = Statics.field1750;
                                                                                        int var74 = Statics.field24;
                                                                                        int var75 = class116.field1824;
                                                                                        int var76 = class116.field1826;
                                                                                        int var77 = -1;
                                                                                        for (int var78 = 0; var78 < field427; var78++) {
                                                                                            int var79 = (field427 - 1 - var78) * 15 + var73 + 31;
                                                                                            if (var75 > var72 && var75 < var72 + var74 && var76 > var79 - 13 && var76 < var79 + 3) {
                                                                                                var77 = var78;
                                                                                            }
                                                                                        }
                                                                                        if (var77 != -1 && var77 >= 0) {
                                                                                            int var80 = field428[var77];
                                                                                            int var81 = field343[var77];
                                                                                            int var82 = field430[var77];
                                                                                            int var83 = field423[var77];
                                                                                            String var84 = field446[var77];
                                                                                            String var85 = field433[var77];
                                                                                            method1894(var80, var81, var82, var83, var84, var85, class116.field1824, class116.field1826);
                                                                                        }
                                                                                        field426 = false;
                                                                                        method87(Statics.field1620, Statics.field1750, Statics.field24, Statics.field704);
                                                                                    }
                                                                                } else {
                                                                                    label1152: {
                                                                                        int var87;
                                                                                        int var88;
                                                                                        label1184: {
                                                                                            if ((var69 == 1 || !Statics.field2048 && var69 == 4) && field427 > 0) {
                                                                                                int var86 = field430[field427 - 1];
                                                                                                if (var86 == 39 || var86 == 40 || var86 == 41 || var86 == 42 || var86 == 43 || var86 == 33 || var86 == 34 || var86 == 35 || var86 == 36 || var86 == 37 || var86 == 38 || var86 == 1005) {
                                                                                                    var87 = field428[field427 - 1];
                                                                                                    var88 = field343[field427 - 1];
                                                                                                    class170 var89 = class170.method2993(var88);
                                                                                                    int var90 = method3671(var89);
                                                                                                    boolean var91 = (var90 >> 28 & 0x1) != 0;
                                                                                                    if (var91) {
                                                                                                        break label1184;
                                                                                                    }
                                                                                                    class171 var10000 = (class171) null;
                                                                                                    if (class171.method221(method3671(var89))) {
                                                                                                        break label1184;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            if ((var69 == 1 || !Statics.field2048 && var69 == 4) && (field425 == 1 && field427 > 2 || method1522(field427 - 1))) {
                                                                                                var69 = 2;
                                                                                            }
                                                                                            if ((var69 == 1 || !Statics.field2048 && var69 == 4) && field427 > 0) {
                                                                                                int var93 = field427 - 1;
                                                                                                if (var93 >= 0) {
                                                                                                    int var94 = field428[var93];
                                                                                                    int var95 = field343[var93];
                                                                                                    int var96 = field430[var93];
                                                                                                    int var97 = field423[var93];
                                                                                                    String var98 = field446[var93];
                                                                                                    String var99 = field433[var93];
                                                                                                    method1894(var94, var95, var96, var97, var98, var99, class116.field1824, class116.field1826);
                                                                                                }
                                                                                            }
                                                                                            if (var69 == 2 && field427 > 0) {
                                                                                                method756(class116.field1824, class116.field1826);
                                                                                            }
                                                                                            break label1152;
                                                                                        }
                                                                                        if (Statics.field670 != null && !field405 && field425 != 1 && !method1522(field427 - 1) && field427 > 0) {
                                                                                            method1430(field432, field388);
                                                                                        }
                                                                                        field405 = false;
                                                                                        field406 = 0;
                                                                                        if (Statics.field670 != null) {
                                                                                            method1786(Statics.field670);
                                                                                        }
                                                                                        Statics.field670 = class170.method2993(var88);
                                                                                        field401 = var87;
                                                                                        field432 = class116.field1824;
                                                                                        field388 = class116.field1826;
                                                                                        if (field427 > 0) {
                                                                                            int var92 = field427 - 1;
                                                                                            Statics.field2121 = new class39();
                                                                                            Statics.field2121.field808 = field428[var92];
                                                                                            Statics.field2121.field804 = field343[var92];
                                                                                            Statics.field2121.field805 = field430[var92];
                                                                                            Statics.field2121.field803 = field423[var92];
                                                                                            Statics.field2121.field806 = field446[var92];
                                                                                        }
                                                                                        method1786(Statics.field670);
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (field456 != null) {
                                                                                method1786(field456);
                                                                                Statics.field775++;
                                                                                if (field466 && field389) {
                                                                                    int var100 = class116.field1815;
                                                                                    int var101 = class116.field1822;
                                                                                    int var102 = var100 - field460;
                                                                                    int var103 = var101 - field461;
                                                                                    if (var102 < field464) {
                                                                                        var102 = field464;
                                                                                    }
                                                                                    if (field456.field2223 + var102 > field464 + field436.field2223) {
                                                                                        var102 = field464 + field436.field2223 - field456.field2223;
                                                                                    }
                                                                                    if (var103 < field465) {
                                                                                        var103 = field465;
                                                                                    }
                                                                                    if (field456.field2224 + var103 > field465 + field436.field2224) {
                                                                                        var103 = field465 + field436.field2224 - field456.field2224;
                                                                                    }
                                                                                    int var104 = var102 - field434;
                                                                                    int var105 = var103 - field468;
                                                                                    int var106 = field456.field2284;
                                                                                    if (Statics.field775 > field456.field2303 && (var104 > var106 || var104 < -var106 || var105 > var106 || var105 < -var106)) {
                                                                                        field469 = true;
                                                                                    }
                                                                                    int var107 = field436.field2229 + (var102 - field464);
                                                                                    int var108 = field436.field2230 + (var103 - field465);
                                                                                    if (field456.field2297 != null && field469) {
                                                                                        class19 var109 = new class19();
                                                                                        var109.field194 = field456;
                                                                                        var109.field196 = var107;
                                                                                        var109.field195 = var108;
                                                                                        var109.field204 = field456.field2297;
                                                                                        class33.method166(var109);
                                                                                    }
                                                                                    if (class116.field1823 == 0) {
                                                                                        if (field469) {
                                                                                            if (field456.field2298 != null) {
                                                                                                class19 var110 = new class19();
                                                                                                var110.field194 = field456;
                                                                                                var110.field196 = var107;
                                                                                                var110.field195 = var108;
                                                                                                var110.field199 = field462;
                                                                                                var110.field204 = field456.field2298;
                                                                                                class33.method166(var110);
                                                                                            }
                                                                                            if (field462 != null && method3529(field456) != null) {
                                                                                                field331.method2782(176);
                                                                                                field331.method2748(field462.field2209);
                                                                                                field331.method2538(field456.field2328);
                                                                                                field331.method2748(field462.field2328);
                                                                                                field331.method2748(field456.field2209);
                                                                                                field331.method2617(field462.field2208);
                                                                                                field331.method2595(field456.field2208);
                                                                                            }
                                                                                        } else if ((field425 == 1 || method1522(field427 - 1)) && field427 > 2) {
                                                                                            method756(field460 + field434, field468 + field461);
                                                                                        } else if (field427 > 0) {
                                                                                            method1430(field460 + field434, field468 + field461);
                                                                                        }
                                                                                        field456 = null;
                                                                                    }
                                                                                } else if (Statics.field775 > 1) {
                                                                                    field456 = null;
                                                                                }
                                                                            }
                                                                            if (Statics.field670 != null) {
                                                                                method1786(Statics.field670);
                                                                                field406++;
                                                                                if (class116.field1823 == 0) {
                                                                                    if (field405) {
                                                                                        if (Statics.field670 == Statics.field52 && field404 != field401) {
                                                                                            class170 var111 = Statics.field670;
                                                                                            byte var112 = 0;
                                                                                            if (field355 == 1 && var111.field2263 == 206) {
                                                                                                var112 = 1;
                                                                                            }
                                                                                            if (var111.field2326[field404] <= 0) {
                                                                                                var112 = 0;
                                                                                            }
                                                                                            if (class171.method221(method3671(var111))) {
                                                                                                int var113 = field401;
                                                                                                int var114 = field404;
                                                                                                var111.field2326[var114] = var111.field2326[var113];
                                                                                                var111.field2327[var114] = var111.field2327[var113];
                                                                                                var111.field2326[var113] = -1;
                                                                                                var111.field2327[var113] = 0;
                                                                                            } else if (var112 == 1) {
                                                                                                int var115 = field401;
                                                                                                int var116 = field404;
                                                                                                while (var115 != var116) {
                                                                                                    if (var115 > var116) {
                                                                                                        var111.method2925(var115 - 1, var115);
                                                                                                        var115--;
                                                                                                    } else if (var115 < var116) {
                                                                                                        var111.method2925(var115 + 1, var115);
                                                                                                        var115++;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var111.method2925(field404, field401);
                                                                                            }
                                                                                            field331.method2782(127);
                                                                                            field331.method2586(field401);
                                                                                            field331.method2739(var112);
                                                                                            field331.method2617(Statics.field670.field2208);
                                                                                            field331.method2538(field404);
                                                                                        }
                                                                                    } else if ((field425 == 1 || method1522(field427 - 1)) && field427 > 2) {
                                                                                        method756(field432, field388);
                                                                                    } else if (field427 > 0) {
                                                                                        method1430(field432, field388);
                                                                                    }
                                                                                    field399 = 10;
                                                                                    class116.field1821 = 0;
                                                                                    Statics.field670 = null;
                                                                                } else if (field406 >= 5 && (class116.field1815 > field432 + 5 || class116.field1815 < field432 - 5 || class116.field1822 > field388 + 5 || class116.field1822 < field388 - 5)) {
                                                                                    field405 = true;
                                                                                }
                                                                            }
                                                                            if (class88.field1510 != -1) {
                                                                                int var117 = class88.field1510;
                                                                                int var118 = class88.field1506;
                                                                                field331.method2782(34);
                                                                                field331.method2641(5);
                                                                                field331.method2578(class106.field1729[82] ? (class106.field1729[81] ? 2 : 1) : 0);
                                                                                field331.method2586(Statics.field1735 + var117);
                                                                                field331.method2585(Statics.field284 + var118);
                                                                                class88.field1510 = -1;
                                                                                field501 = class116.field1824;
                                                                                field396 = class116.field1826;
                                                                                field477 = 1;
                                                                                field397 = 0;
                                                                                field519 = var117;
                                                                                field490 = var118;
                                                                            }
                                                                            if (Statics.field246 != var54) {
                                                                                if (var54 != null) {
                                                                                    method1786(var54);
                                                                                }
                                                                                if (Statics.field246 != null) {
                                                                                    method1786(Statics.field246);
                                                                                }
                                                                            }
                                                                            if (Statics.field1193 != var55 && field513 == field437) {
                                                                                if (var55 != null) {
                                                                                    method1786(var55);
                                                                                }
                                                                                if (Statics.field1193 != null) {
                                                                                    method1786(Statics.field1193);
                                                                                }
                                                                            }
                                                                            if (Statics.field1193 == null) {
                                                                                if (field513 > 0) {
                                                                                    field513--;
                                                                                }
                                                                            } else if (field513 < field437) {
                                                                                field513++;
                                                                                if (field513 == field437) {
                                                                                    method1786(Statics.field1193);
                                                                                }
                                                                            }
                                                                            method1443();
                                                                            if (field555) {
                                                                                method3007();
                                                                            }
                                                                            for (int var119 = 0; var119 < 5; var119++) {
                                                                                int var10002 = field538[var119]++;
                                                                            }
                                                                            Statics.field1745.method809();
                                                                            int var120 = class116.method2008();
                                                                            int var121 = class106.field1727;
                                                                            if (var120 > 15000 && var121 > 15000) {
                                                                                field341 = 250;
                                                                                class116.method178(14500);
                                                                                field331.method2782(186);
                                                                            }
                                                                            field557++;
                                                                            if (field557 > 500) {
                                                                                field557 = 0;
                                                                                int var123 = (int) (Math.random() * 8.0D);
                                                                                if ((var123 & 0x1) == 1) {
                                                                                    field506 += field311;
                                                                                }
                                                                                if ((var123 & 0x2) == 2) {
                                                                                    field516 += field537;
                                                                                }
                                                                                if ((var123 & 0x4) == 4) {
                                                                                    field366 += field296;
                                                                                }
                                                                            }
                                                                            if (field506 < -50) {
                                                                                field311 = 2;
                                                                            }
                                                                            if (field506 > 50) {
                                                                                field311 = -2;
                                                                            }
                                                                            if (field516 < -55) {
                                                                                field537 = 2;
                                                                            }
                                                                            if (field516 > 55) {
                                                                                field537 = -2;
                                                                            }
                                                                            if (field366 < -40) {
                                                                                field296 = 1;
                                                                            }
                                                                            if (field366 > 40) {
                                                                                field296 = -1;
                                                                            }
                                                                            field363++;
                                                                            if (field363 > 500) {
                                                                                field363 = 0;
                                                                                int var124 = (int) (Math.random() * 8.0D);
                                                                                if ((var124 & 0x1) == 1) {
                                                                                    field359 += field561;
                                                                                }
                                                                                if ((var124 & 0x2) == 2) {
                                                                                    field361 += field362;
                                                                                }
                                                                            }
                                                                            if (field359 < -60) {
                                                                                field561 = 2;
                                                                            }
                                                                            if (field359 > 60) {
                                                                                field561 = -2;
                                                                            }
                                                                            if (field361 < -20) {
                                                                                field362 = 1;
                                                                            }
                                                                            if (field361 > 10) {
                                                                                field362 = -1;
                                                                            }
                                                                            for (class17 var125 = (class17) field479.method2235(); var125 != null; var125 = (class17) field479.method2236()) {
                                                                                if ((long) var125.field179 < class156.method2009() / 1000L - 5L) {
                                                                                    if (var125.field177 > 0) {
                                                                                        class48.method184(5, "", var125.field175 + class174.field2506);
                                                                                    }
                                                                                    if (var125.field177 == 0) {
                                                                                        class48.method184(5, "", var125.field175 + class174.field2507);
                                                                                    }
                                                                                    var125.method2247();
                                                                                }
                                                                            }
                                                                            field337++;
                                                                            if (field337 > 50) {
                                                                                field331.method2782(78);
                                                                            }
                                                                            try {
                                                                                if (Statics.field47 != null && field331.field2105 > 0) {
                                                                                    Statics.field47.method1904(field331.field2108, 0, field331.field2105);
                                                                                    field331.field2105 = 0;
                                                                                    field337 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var127) {
                                                                                method1760();
                                                                            }
                                                                            return;
                                                                        }
                                                                        var67 = var66.field194;
                                                                        if (var67.field2209 < 0) {
                                                                            break;
                                                                        }
                                                                        var68 = class170.method2993(var67.field2232);
                                                                    } while (var68 == null || var68.field2332 == null || var67.field2209 >= var68.field2332.length || var68.field2332[var67.field2209] != var67);
                                                                    class33.method166(var66);
                                                                }
                                                            }
                                                            var64 = var63.field194;
                                                            if (var64.field2209 < 0) {
                                                                break;
                                                            }
                                                            var65 = class170.method2993(var64.field2232);
                                                        } while (var65 == null || var65.field2332 == null || var64.field2209 >= var65.field2332.length || var65.field2332[var64.field2209] != var64);
                                                        class33.method166(var63);
                                                    }
                                                }
                                                var61 = var60.field194;
                                                if (var61.field2209 < 0) {
                                                    break;
                                                }
                                                var62 = class170.method2993(var61.field2232);
                                            } while (var62 == null || var62.field2332 == null || var61.field2209 >= var62.field2332.length || var62.field2332[var61.field2209] != var61);
                                            class33.method166(var60);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (field297 == 40 || field297 == 45) {
                    method101();
                }
                return;
            }
            var2.field2706.method3105(var2.field2705, (int) var2.field1894, var2.field2704, false);
        }
    }

    @ObfuscatedName("client.k(I)V")
    public final void method245() {
        boolean var1;
        label264: {
            try {
                if (class139.field1930 == 2) {
                    if (Statics.field1084 == null) {
                        Statics.field1084 = class145.method2472(Statics.field1931, Statics.field1932, Statics.field2712);
                        if (Statics.field1084 == null) {
                            var1 = false;
                            break label264;
                        }
                    }
                    if (Statics.field933 == null) {
                        Statics.field933 = new class61(Statics.field1928, Statics.field1929);
                    }
                    if (Statics.field1927.method2361(Statics.field1084, Statics.field1935, Statics.field933, 22050)) {
                        Statics.field1927.method2305();
                        Statics.field1927.method2299(Statics.field1933);
                        Statics.field1927.method2363(Statics.field1084, Statics.field666);
                        class139.field1930 = 0;
                        Statics.field1084 = null;
                        Statics.field933 = null;
                        Statics.field1931 = null;
                        var1 = true;
                        break label264;
                    }
                }
            } catch (Exception var24) {
                var24.printStackTrace();
                Statics.field1927.method2333();
                class139.field1930 = 0;
                Statics.field1084 = null;
                Statics.field933 = null;
                Statics.field1931 = null;
            }
            var1 = false;
        }
        if (var1 && field494 && Statics.field1528 != null) {
            Statics.field1528.method1004();
        }
        if (field297 == 10 || field297 == 20 || field297 == 30) {
            if (field498 != 0L && class156.method2009() > field498) {
                int var4 = method856();
                field498 = 0L;
                if (var4 >= 2) {
                    field499 = true;
                } else {
                    field499 = false;
                }
                method90();
                if (field297 >= 25) {
                    field331.method2782(92);
                    field331.method2641(method856());
                    field331.method2538(Statics.field1201);
                    field331.method2538(Statics.field1585);
                }
                field1798 = true;
            } else if (field1786) {
                class106.method1776(Statics.field782);
                Canvas var5 = Statics.field782;
                var5.removeMouseListener(class116.field1811);
                var5.removeMouseMotionListener(class116.field1811);
                var5.removeFocusListener(class116.field1811);
                class116.field1828 = 0;
                if (Statics.field2034 != null) {
                    Statics.field2034.method1878(Statics.field782);
                }
                Statics.field541.method1929();
                Statics.field782.setBackground(Color.black);
                class106.method592(Statics.field782);
                class116.method556(Statics.field782);
                if (Statics.field2034 != null) {
                    Statics.field2034.method1872(Statics.field782);
                }
                if (field445 != -1) {
                    method1926(false);
                }
                field1793 = true;
            }
        }
        Dimension var6 = this.method1942();
        if (Statics.field1721 != var6.width || Statics.field915 != var6.height || field1793) {
            method90();
            field498 = class156.method2009() + 500L;
            field1793 = false;
        }
        boolean var7 = false;
        if (field1798) {
            field1798 = false;
            var7 = true;
            for (int var8 = 0; var8 < 100; var8++) {
                field309[var8] = true;
            }
        }
        if (var7) {
            method3230();
        }
        if (field297 == 0) {
            class114.method1782(class42.field838, class42.field844, (Color) null, var7);
        } else if (field297 == 5) {
            class42.method2496(Statics.field219, Statics.field41, Statics.field758, var7);
        } else if (field297 == 10 || field297 == 11) {
            class42.method2496(Statics.field219, Statics.field41, Statics.field758, var7);
        } else if (field297 == 20) {
            class42.method2496(Statics.field219, Statics.field41, Statics.field758, var7);
        } else if (field297 == 25) {
            if (field347 == 1) {
                if (field517 > field344) {
                    field344 = field517;
                }
                int var9 = (field344 * 50 - field517 * 50) / field344;
                Statics.method1778(class174.field2371 + class38.field795 + class38.field792 + var9 + "%" + class38.field793, false);
            } else if (field347 == 2) {
                if (field345 > field346) {
                    field346 = field345;
                }
                int var10 = (field346 * 50 - field345 * 50) / field346 + 50;
                Statics.method1778(class174.field2371 + class38.field795 + class38.field792 + var10 + "%" + class38.field793, false);
            } else {
                Statics.method1778(class174.field2371, false);
            }
        } else if (field297 == 30) {
            if (field445 != -1) {
                Statics.method1099(field445);
            }
            for (int var11 = 0; var11 < field488; var11++) {
                if (field309[var11]) {
                    field491[var11] = true;
                }
                field492[var11] = field309[var11];
                field309[var11] = false;
            }
            field489 = field299;
            field505 = -1;
            field502 = -1;
            Statics.field52 = null;
            if (field445 != -1) {
                field488 = 0;
                method567(field445, 0, 0, Statics.field1201, Statics.field1585, 0, 0, -1);
            }
            class220.method3688();
            if (field426) {
                method688();
            } else if (field505 != -1) {
                int var12 = field505;
                int var13 = field502;
                if (field427 >= 2 || field438 != 0 || field440) {
                    String var14;
                    if (field438 == 1 && field427 < 2) {
                        var14 = class174.field2509 + class174.field2519 + field439 + " " + class38.field794;
                    } else if (field440 && field427 < 2) {
                        var14 = field563 + class174.field2519 + field444 + " " + class38.field794;
                    } else {
                        var14 = method764(field427 - 1);
                    }
                    if (field427 > 2) {
                        var14 = var14 + class38.method183(16777215) + " " + '/' + " " + (field427 - 2) + class174.field2513;
                    }
                    Statics.field219.method3591(var14, var12 + 4, var13 + 15, 16777215, 0, field299 / 1000);
                }
            }
            if (field497 == 3) {
                for (int var15 = 0; var15 < field488; var15++) {
                    if (field492[var15]) {
                        class220.method3695(field310[var15], field421[var15], field495[var15], field357[var15], 16711935, 128);
                    } else if (field491[var15]) {
                        class220.method3695(field310[var15], field421[var15], field495[var15], field357[var15], 16711680, 128);
                    }
                }
            }
            class32.method2998(Statics.field1094, Statics.field43.field608, Statics.field43.field605, field364);
            field364 = 0;
        } else if (field297 == 40) {
            Statics.method1778(class174.field2372 + class38.field795 + class174.field2373, false);
        } else if (field297 == 45) {
            Statics.method1778(class174.field2517, false);
        }
        if (field297 == 30 && field497 == 0 && !var7) {
            try {
                Graphics var16 = Statics.field782.getGraphics();
                for (int var17 = 0; var17 < field488; var17++) {
                    if (field491[var17]) {
                        Statics.field1210.method3673(var16, field310[var17], field421[var17], field495[var17], field357[var17]);
                        field491[var17] = false;
                    }
                }
            } catch (Exception var23) {
                Statics.field782.repaint();
            }
        } else if (field297 > 0) {
            try {
                Graphics var19 = Statics.field782.getGraphics();
                Statics.field1210.method3675(var19, 0, 0);
                for (int var20 = 0; var20 < field488; var20++) {
                    field491[var20] = false;
                }
            } catch (Exception var22) {
                Statics.field782.repaint();
            }
        }
    }

    @ObfuscatedName("client.z(I)V")
    public final void method243() {
        if (Statics.field1745.method813()) {
            Statics.field1745.method812();
        }
        if (Statics.field696 != null) {
            Statics.field696.field227 = false;
        }
        Statics.field696 = null;
        if (Statics.field47 != null) {
            Statics.field47.method1915();
            Statics.field47 = null;
        }
        class106.method716();
        class116.method713();
        Statics.field2034 = null;
        if (Statics.field1528 != null) {
            Statics.field1528.method1025();
        }
        if (Statics.field63 != null) {
            Statics.field63.method1025();
        }
        class186.method3445();
        Object var1 = class184.field2737;
        synchronized (class184.field2737) {
            if (class184.field2741 != 0) {
                class184.field2741 = 1;
                try {
                    class184.field2737.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        try {
            class105.field1689.method1291();
            for (int var4 = 0; var4 < Statics.field1419; var4++) {
                Statics.field1691[var4].method1291();
            }
            class105.field1690.method1291();
            class105.field1688.method1291();
        } catch (Exception var7) {
        }
    }

    @ObfuscatedName("n.y(II)V")
    public static void method191(int arg0) {
        if (field297 == arg0) {
            return;
        }
        if (field297 == 0) {
            class114.method92();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field515 = 0;
            field323 = 0;
            field324 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field144 != null) {
            Statics.field144.method1915();
            Statics.field144 = null;
        }
        if (field297 == 25) {
            field347 = 0;
            field517 = 0;
            field344 = 1;
            field345 = 0;
            field346 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class42.method570(Statics.field782, Statics.field588, Statics.field3087, true, 0);
        } else if (arg0 == 20) {
            class42.method570(Statics.field782, Statics.field588, Statics.field3087, true, field297 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class42.method570(Statics.field782, Statics.field588, Statics.field3087, false, 4);
        } else {
            class42.method1793();
        }
        field297 = arg0;
    }

    @ObfuscatedName("client.j(I)V")
    public void method381() {
        if (field297 == 1000) {
            return;
        }
        long var1 = class156.method2009();
        int var3 = (int) (var1 - Statics.field2758);
        Statics.field2758 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class186.field2757 += var3;
        boolean var4;
        if (class186.field2768 == 0 && class186.field2762 == 0 && class186.field2765 == 0 && class186.field2766 == 0) {
            var4 = true;
        } else if (Statics.field2775 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class186.field2757 > 30000) {
                        throw new IOException();
                    }
                    while (class186.field2762 < 20 && class186.field2766 > 0) {
                        class182 var5 = (class182) class186.field2774.method2148();
                        class154 var6 = new class154(4);
                        var6.method2641(1);
                        var6.method2539((int) var5.field1894);
                        Statics.field2775.method1904(var6.field2108, 0, 4);
                        class186.field2759.method2143(var5, var5.field1894);
                        class186.field2766--;
                        class186.field2762++;
                    }
                    while (class186.field2768 < 20 && class186.field2765 > 0) {
                        class182 var7 = (class182) class186.field2763.method2096();
                        class154 var8 = new class154(4);
                        var8.method2641(0);
                        var8.method2539((int) var7.field1894);
                        Statics.field2775.method1904(var8.field2108, 0, 4);
                        var7.method2232();
                        class186.field2767.method2143(var7, var7.field1894);
                        class186.field2765--;
                        class186.field2768++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2775.method1902();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class186.field2757 = 0;
                        byte var11 = 0;
                        if (Statics.field2359 == null) {
                            var11 = 8;
                        } else if (class186.field2769 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class186.field2776.field2105;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2775.method1903(class186.field2776.field2108, class186.field2776.field2105, var12);
                            if (class186.field2761 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class186.field2776.field2108[class186.field2776.field2105 + var13] ^= class186.field2761;
                                }
                            }
                            class186.field2776.field2105 += var12;
                            if (class186.field2776.field2105 < var11) {
                                break;
                            }
                            if (Statics.field2359 == null) {
                                class186.field2776.field2105 = 0;
                                int var14 = class186.field2776.method2552();
                                int var15 = class186.field2776.method2554();
                                int var16 = class186.field2776.method2552();
                                int var17 = class186.field2776.method2557();
                                long var18 = (long) ((var14 << 16) + var15);
                                class182 var20 = (class182) class186.field2759.method2151(var18);
                                Statics.field3220 = true;
                                if (var20 == null) {
                                    var20 = (class182) class186.field2767.method2151(var18);
                                    Statics.field3220 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2359 = var20;
                                Statics.field2052 = new class154(var17 + var21 + Statics.field2359.field2711);
                                Statics.field2052.method2641(var16);
                                Statics.field2052.method2540(var17);
                                class186.field2769 = 8;
                                class186.field2776.field2105 = 0;
                            } else if (class186.field2769 == 0) {
                                if (class186.field2776.field2108[0] == -1) {
                                    class186.field2769 = 1;
                                    class186.field2776.field2105 = 0;
                                } else {
                                    Statics.field2359 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2052.field2108.length - Statics.field2359.field2711;
                            int var23 = 512 - class186.field2769;
                            if (var23 > var22 - Statics.field2052.field2105) {
                                var23 = var22 - Statics.field2052.field2105;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2775.method1903(Statics.field2052.field2108, Statics.field2052.field2105, var23);
                            if (class186.field2761 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2052.field2108[Statics.field2052.field2105 + var24] ^= class186.field2761;
                                }
                            }
                            Statics.field2052.field2105 += var23;
                            class186.field2769 += var23;
                            if (Statics.field2052.field2105 == var22) {
                                if (Statics.field2359.field1894 == 16711935L) {
                                    Statics.field1863 = Statics.field2052;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class185 var26 = class186.field2771[var25];
                                        if (var26 != null) {
                                            Statics.field1863.field2105 = var25 * 8 + 5;
                                            int var27 = Statics.field1863.method2557();
                                            int var28 = Statics.field1863.method2557();
                                            var26.method3104(var27, var28);
                                        }
                                    }
                                } else {
                                    class186.field2770.reset();
                                    class186.field2770.update(Statics.field2052.field2108, 0, var22);
                                    int var29 = (int) class186.field2770.getValue();
                                    if (Statics.field2359.field2710 != var29) {
                                        try {
                                            Statics.field2775.method1915();
                                        } catch (Exception var35) {
                                        }
                                        class186.field2773++;
                                        Statics.field2775 = null;
                                        class186.field2761 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class186.field2773 = 0;
                                    class186.field2764 = 0;
                                    Statics.field2359.field2709.method3113((int) (Statics.field2359.field1894 & 0xFFFFL), Statics.field2052.field2108, (Statics.field2359.field1894 & 0xFF0000L) == 16711680L, Statics.field3220);
                                }
                                Statics.field2359.method2189();
                                if (Statics.field3220) {
                                    class186.field2762--;
                                } else {
                                    class186.field2768--;
                                }
                                class186.field2769 = 0;
                                Statics.field2359 = null;
                                Statics.field2052 = null;
                            } else {
                                if (class186.field2769 != 512) {
                                    break;
                                }
                                class186.field2769 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2775.method1915();
                } catch (Exception var34) {
                }
                class186.field2764++;
                Statics.field2775 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method543();
        }
    }

    @ObfuscatedName("client.f(B)V")
    public void method543() {
        if (class186.field2773 >= 4) {
            this.method1940("js5crc");
            field297 = 1000;
            return;
        }
        if (class186.field2764 >= 4) {
            if (field297 <= 5) {
                this.method1940("js5io");
                field297 = 1000;
                return;
            }
            field320 = 3000;
            class186.field2764 = 3;
        }
        if (--field320 + 1 > 0) {
            return;
        }
        try {
            if (field319 == 0) {
                Statics.field2141 = Statics.field1347.method1812(Statics.field1968, Statics.field3088);
                field319++;
            }
            if (field319 == 1) {
                if (Statics.field2141.field1665 == 2) {
                    this.method525(-1);
                    return;
                }
                if (Statics.field2141.field1665 == 1) {
                    field319++;
                }
            }
            if (field319 == 2) {
                Statics.field318 = new class111((Socket) Statics.field2141.field1663, Statics.field1347);
                class154 var1 = new class154(5);
                var1.method2641(15);
                var1.method2540(128);
                Statics.field318.method1904(var1.field2108, 0, 5);
                field319++;
                Statics.field2199 = class156.method2009();
            }
            if (field319 == 3) {
                if (field297 <= 5 || Statics.field318.method1902() > 0) {
                    int var2 = Statics.field318.method1901();
                    if (var2 != 0) {
                        this.method525(var2);
                        return;
                    }
                    field319++;
                } else if (class156.method2009() - Statics.field2199 > 30000L) {
                    this.method525(-2);
                    return;
                }
            }
            if (field319 == 4) {
                class186.method2918(Statics.field318, field297 > 20);
                Statics.field2141 = null;
                Statics.field318 = null;
                field319 = 0;
                field321 = 0;
            }
        } catch (IOException var4) {
            this.method525(-3);
        }
    }

    @ObfuscatedName("client.p(IB)V")
    public void method525(int arg0) {
        Statics.field2141 = null;
        Statics.field318 = null;
        field319 = 0;
        if (Statics.field3088 == Statics.field238) {
            Statics.field3088 = Statics.field813;
        } else {
            Statics.field3088 = Statics.field238;
        }
        field321++;
        if (field321 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field297 <= 5) {
                this.method1940("js5connect_full");
                field297 = 1000;
            } else {
                field320 = 3000;
            }
        } else if (field321 >= 2 && arg0 == 6) {
            this.method1940("js5connect_outofdate");
            field297 = 1000;
        } else if (field321 >= 4) {
            if (field297 <= 5) {
                this.method1940("js5connect");
                field297 = 1000;
            } else {
                field320 = 3000;
            }
        }
    }

    @ObfuscatedName("f.i(I)V")
    public static void method170() {
        if (field383 == 0) {
            Statics.field2137 = new class88(4, 104, 104, class11.field94);
            for (int var0 = 0; var0 < 4; var0++) {
                field348[var0] = new class118(104, 104);
            }
            Statics.field2119 = new class225(512, 512);
            class42.field844 = class174.field2619;
            class42.field838 = 5;
            field383 = 20;
        } else if (field383 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class85.field1436[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class88.method1605(var1, 500, 800, 512, 334);
            class42.field844 = class174.field2375;
            class42.field838 = 10;
            field383 = 30;
        } else if (field383 == 30) {
            Statics.field916 = method656(0, false, true, true);
            Statics.field193 = method656(1, false, true, true);
            Statics.field2179 = method656(2, true, false, true);
            Statics.field76 = method656(3, false, true, true);
            Statics.field1666 = method656(4, false, true, true);
            Statics.field971 = method656(5, true, true, true);
            Statics.field1865 = method656(6, true, true, false);
            Statics.field3169 = method656(7, false, true, true);
            Statics.field3087 = method656(8, false, true, true);
            Statics.field143 = method656(9, false, true, true);
            Statics.field588 = method656(10, false, true, true);
            Statics.field161 = method656(11, false, true, true);
            Statics.field2845 = method656(12, false, true, true);
            Statics.field908 = method656(13, true, false, true);
            Statics.field3077 = method656(14, false, true, false);
            Statics.field584 = method656(15, false, true, true);
            class42.field844 = class174.field2631;
            class42.field838 = 20;
            field383 = 40;
        } else if (field383 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field916.method3102() * 4 / 100;
            int var8 = var7 + Statics.field193.method3102() * 4 / 100;
            int var9 = var8 + Statics.field2179.method3102() * 2 / 100;
            int var10 = var9 + Statics.field76.method3102() * 2 / 100;
            int var11 = var10 + Statics.field1666.method3102() * 6 / 100;
            int var12 = var11 + Statics.field971.method3102() * 4 / 100;
            int var13 = var12 + Statics.field1865.method3102() * 2 / 100;
            int var14 = var13 + Statics.field3169.method3102() * 60 / 100;
            int var15 = var14 + Statics.field3087.method3102() * 2 / 100;
            int var16 = var15 + Statics.field143.method3102() * 2 / 100;
            int var17 = var16 + Statics.field588.method3102() * 2 / 100;
            int var18 = var17 + Statics.field161.method3102() * 2 / 100;
            int var19 = var18 + Statics.field2845.method3102() * 2 / 100;
            int var20 = var19 + Statics.field908.method3102() * 2 / 100;
            int var21 = var20 + Statics.field3077.method3102() * 2 / 100;
            int var22 = var21 + Statics.field584.method3102() * 2 / 100;
            if (var22 == 100) {
                class42.field844 = class174.field2378;
                class42.field838 = 30;
                field383 = 45;
            } else {
                if (var22 != 0) {
                    class42.field844 = class174.field2377 + var22 + "%";
                }
                class42.field838 = 30;
            }
        } else if (field383 == 45) {
            boolean var23 = !field315;
            Statics.field1043 = 22050;
            Statics.field1045 = var23;
            Statics.field1 = 2;
            class140 var24 = new class140();
            var24.method2338(9, 128);
            Statics.field1528 = class58.method237(Statics.field1347, Statics.field782, 0, 22050);
            Statics.field1528.method1001(var24);
            class139.method1863(Statics.field584, Statics.field3077, Statics.field1666, var24);
            Statics.field63 = class58.method237(Statics.field1347, Statics.field782, 1, 2048);
            Statics.field1555 = new class52();
            Statics.field63.method1001(Statics.field1555);
            Statics.field142 = new class66(22050, Statics.field1043);
            class42.field844 = class174.field2413;
            class42.field838 = 35;
            field383 = 50;
        } else if (field383 == 50) {
            int var25 = 0;
            if (Statics.field41 == null) {
                class185 var26 = Statics.field3087;
                class185 var27 = Statics.field908;
                int var28 = var26.method3027("p11_full");
                int var29 = var26.method3028(var28, "");
                class209 var30 = class226.method19(var26, var27, var28, var29);
                Statics.field41 = var30;
            } else {
                var25++;
            }
            if (Statics.field758 == null) {
                class185 var31 = Statics.field3087;
                class185 var32 = Statics.field908;
                int var33 = var31.method3027("p12_full");
                int var34 = var31.method3028(var33, "");
                class209 var35 = class226.method19(var31, var32, var33, var34);
                Statics.field758 = var35;
            } else {
                var25++;
            }
            if (Statics.field219 == null) {
                class185 var36 = Statics.field3087;
                class185 var37 = Statics.field908;
                int var38 = var36.method3027("b12_full");
                int var39 = var36.method3028(var38, "");
                class209 var40 = class226.method19(var36, var37, var38, var39);
                Statics.field219 = var40;
            } else {
                var25++;
            }
            if (var25 < 3) {
                class42.field844 = class174.field2380 + var25 * 100 / 3 + "%";
                class42.field838 = 40;
            } else {
                Statics.field1855 = new class231(true);
                class42.field844 = class174.field2543;
                class42.field838 = 40;
                field383 = 60;
            }
        } else if (field383 == 60) {
            class185 var41 = Statics.field588;
            class185 var42 = Statics.field3087;
            int var43 = 0;
            if (var41.method3030("title.jpg", "")) {
                var43++;
            }
            if (var42.method3030("logo", "")) {
                var43++;
            }
            if (var42.method3030("logo_deadman_mode", "")) {
                var43++;
            }
            if (var42.method3030("titlebox", "")) {
                var43++;
            }
            if (var42.method3030("titlebutton", "")) {
                var43++;
            }
            if (var42.method3030("runes", "")) {
                var43++;
            }
            if (var42.method3030("title_mute", "")) {
                var43++;
            }
            if (var42.method3031("options_radio_buttons,0")) {
                var43++;
            }
            if (var42.method3031("options_radio_buttons,2")) {
                var43++;
            }
            var42.method3030("sl_back", "");
            var42.method3030("sl_flags", "");
            var42.method3030("sl_arrows", "");
            var42.method3030("sl_stars", "");
            var42.method3030("sl_button", "");
            int var46 = class42.method1086();
            if (var43 < var46) {
                class42.field844 = class174.field2382 + var43 * 100 / var46 + "%";
                class42.field838 = 50;
            } else {
                class42.field844 = class174.field2383;
                class42.field838 = 50;
                method191(5);
                field383 = 70;
            }
        } else if (field383 == 70) {
            if (Statics.field2179.method3016()) {
                class185 var47 = Statics.field2179;
                Statics.field3040 = var47;
                class185 var48 = Statics.field2179;
                Statics.field4 = var48;
                class185 var49 = Statics.field2179;
                class185 var50 = Statics.field3169;
                Statics.field2829 = var49;
                Statics.field61 = var50;
                Statics.field2820 = Statics.field2829.method3054(3);
                class185 var51 = Statics.field2179;
                class185 var52 = Statics.field3169;
                boolean var53 = field315;
                Statics.field2927 = var51;
                Statics.field3071 = var52;
                class198.field2892 = var53;
                class200.method1783(Statics.field2179, Statics.field3169);
                class199.method3312(Statics.field2179, Statics.field3169, field294, Statics.field41);
                class202.method1759(Statics.field2179, Statics.field916, Statics.field193);
                class185 var54 = Statics.field2179;
                class185 var55 = Statics.field3169;
                Statics.field2801 = var54;
                Statics.field2784 = var55;
                class195.method2811(Statics.field2179);
                class188.method861(Statics.field2179);
                class185 var56 = Statics.field76;
                class185 var57 = Statics.field3169;
                class185 var58 = Statics.field3087;
                class185 var59 = Statics.field908;
                Statics.field217 = var56;
                Statics.field2285 = var57;
                Statics.field1560 = var58;
                Statics.field893 = var59;
                Statics.field2257 = new class170[Statics.field217.method3063()][];
                Statics.field1531 = new boolean[Statics.field217.method3063()];
                class187.method2991(Statics.field2179);
                class185 var60 = Statics.field2179;
                Statics.field2856 = var60;
                class185 var61 = Statics.field2179;
                Statics.field2788 = var61;
                class190.method2403(Statics.field2179);
                Statics.field1745 = new class47();
                class197.method3062(Statics.field2179, Statics.field3087, Statics.field908);
                class185 var62 = Statics.field2179;
                class185 var63 = Statics.field3087;
                Statics.field2839 = var62;
                Statics.field2832 = var63;
                class42.field844 = class174.field2385;
                class42.field838 = 60;
                field383 = 80;
            } else {
                class42.field844 = class174.field2384 + Statics.field2179.method3107() + "%";
                class42.field838 = 60;
            }
        } else if (field383 == 80) {
            int var64 = 0;
            if (Statics.field2140 == null) {
                Statics.field2140 = class226.method2761(Statics.field3087, "compass", "");
            } else {
                var64++;
            }
            if (Statics.field1527 == null) {
                Statics.field1527 = class226.method2761(Statics.field3087, "mapedge", "");
            } else {
                var64++;
            }
            if (Statics.field809 == null) {
                Statics.field809 = class226.method2052(Statics.field3087, "mapscene", "");
            } else {
                var64++;
            }
            if (Statics.field165 == null) {
                Statics.field165 = Statics.method1794(Statics.field3087, "mapfunction", "");
            } else {
                var64++;
            }
            if (Statics.field741 == null) {
                Statics.field741 = Statics.method1794(Statics.field3087, "headicons_pk", "");
            } else {
                var64++;
            }
            if (Statics.field2062 == null) {
                Statics.field2062 = Statics.method1794(Statics.field3087, "headicons_prayer", "");
            } else {
                var64++;
            }
            if (Statics.field2020 == null) {
                Statics.field2020 = Statics.method1794(Statics.field3087, "headicons_hint", "");
            } else {
                var64++;
            }
            if (Statics.field275 == null) {
                Statics.field275 = Statics.method1794(Statics.field3087, "mapmarker", "");
            } else {
                var64++;
            }
            if (Statics.field64 == null) {
                Statics.field64 = Statics.method1794(Statics.field3087, "cross", "");
            } else {
                var64++;
            }
            if (Statics.field2143 == null) {
                Statics.field2143 = Statics.method1794(Statics.field3087, "mapdots", "");
            } else {
                var64++;
            }
            if (Statics.field3122 == null) {
                Statics.field3122 = class226.method2052(Statics.field3087, "scrollbar", "");
            } else {
                var64++;
            }
            if (Statics.field2022 == null) {
                Statics.field2022 = class226.method2052(Statics.field3087, "mod_icons", "");
            } else {
                var64++;
            }
            if (var64 < 12) {
                class42.field844 = class174.field2386 + var64 * 100 / 12 + "%";
                class42.field838 = 70;
            } else {
                Statics.field3118 = Statics.field2022;
                Statics.field1527.method3808();
                int var65 = (int) (Math.random() * 21.0D) - 10;
                int var66 = (int) (Math.random() * 21.0D) - 10;
                int var67 = (int) (Math.random() * 21.0D) - 10;
                int var68 = (int) (Math.random() * 41.0D) - 20;
                for (int var69 = 0; var69 < Statics.field165.length; var69++) {
                    Statics.field165[var69].method3807(var65 + var68, var66 + var68, var67 + var68);
                }
                Statics.field809[0].method3772(var65 + var68, var66 + var68, var67 + var68);
                class42.field844 = class174.field2387;
                class42.field838 = 70;
                field383 = 90;
            }
        } else if (field383 == 90) {
            if (Statics.field143.method3016()) {
                class75 var70 = new class75(Statics.field143, Statics.field3087, 20, 0.8D, field315 ? 64 : 128);
                class85.method1527(var70);
                class85.method1567(0.8D);
                class42.field844 = class174.field2389;
                class42.field838 = 90;
                field383 = 110;
            } else {
                class42.field844 = class174.field2563 + Statics.field143.method3107() + "%";
                class42.field838 = 90;
            }
        } else if (field383 == 110) {
            Statics.field696 = new class21();
            Statics.field1347.method1833(Statics.field696, 10);
            class42.field844 = class174.field2390;
            class42.field838 = 94;
            field383 = 120;
        } else if (field383 == 120) {
            if (Statics.field588.method3030("huffman", "")) {
                class146 var71 = new class146(Statics.field588.method3029("huffman", ""));
                Statics.field79 = var71;
                class42.field844 = class174.field2392;
                class42.field838 = 96;
                field383 = 130;
            } else {
                class42.field844 = class174.field2391 + "%";
                class42.field838 = 96;
            }
        } else if (field383 == 130) {
            if (!Statics.field76.method3016()) {
                class42.field844 = class174.field2398 + Statics.field76.method3107() * 4 / 5 + "%";
                class42.field838 = 100;
            } else if (!Statics.field2845.method3016()) {
                class42.field844 = class174.field2398 + (80 + Statics.field2845.method3107() / 6) + "%";
                class42.field838 = 100;
            } else if (Statics.field908.method3016()) {
                class42.field844 = class174.field2583;
                class42.field838 = 100;
                field383 = 140;
            } else {
                class42.field844 = class174.field2398 + (96 + Statics.field908.method3107() / 20) + "%";
                class42.field838 = 100;
            }
        } else if (field383 == 140) {
            method191(10);
        }
    }

    @ObfuscatedName("av.s(IZZZI)Lgk;")
    public static class185 method656(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class117 var4 = null;
        if (class105.field1689 != null) {
            var4 = new class117(arg0, class105.field1689, Statics.field1691[arg0], 1000000);
        }
        return new class185(var4, Statics.field1295, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("k.x(B)V")
    public static final void method101() {
        try {
            if (field515 == 0) {
                if (Statics.field47 != null) {
                    Statics.field47.method1915();
                    Statics.field47 = null;
                }
                Statics.field927 = null;
                field342 = false;
                field323 = 0;
                field515 = 1;
            }
            if (field515 == 1) {
                if (Statics.field927 == null) {
                    Statics.field927 = Statics.field1347.method1812(Statics.field1968, Statics.field3088);
                }
                if (Statics.field927.field1665 == 2) {
                    throw new IOException();
                }
                if (Statics.field927.field1665 == 1) {
                    Statics.field47 = new class111((Socket) Statics.field927.field1663, Statics.field1347);
                    Statics.field927 = null;
                    field515 = 2;
                }
            }
            if (field515 == 2) {
                field331.field2105 = 0;
                field331.method2641(14);
                Statics.field47.method1904(field331.field2108, 0, 1);
                field333.field2105 = 0;
                field515 = 3;
            }
            if (field515 == 3) {
                if (Statics.field1528 != null) {
                    Statics.field1528.method1003();
                }
                if (Statics.field63 != null) {
                    Statics.field63.method1003();
                }
                int var0 = Statics.field47.method1901();
                if (Statics.field1528 != null) {
                    Statics.field1528.method1003();
                }
                if (Statics.field63 != null) {
                    Statics.field63.method1003();
                }
                if (var0 != 0) {
                    method1431(var0);
                    return;
                }
                field333.field2105 = 0;
                field515 = 5;
            }
            if (field515 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field331.field2105 = 0;
                field331.method2641(1);
                field331.method2641(class42.field845.method721());
                field331.method2540(var1[0]);
                field331.method2540(var1[1]);
                field331.method2540(var1[2]);
                field331.method2540(var1[3]);
                switch(class42.field845.field1627) {
                    case 0:
                    case 2:
                        field331.method2539(Statics.field3092);
                        field331.field2105 += 5;
                        break;
                    case 1:
                        field331.method2540((Integer) Statics.field36.field707.get(class208.method173(class42.field850)));
                        field331.field2105 += 4;
                        break;
                    case 3:
                        field331.field2105 += 8;
                }
                field331.method2543(class42.field851);
                field331.method2573(class40.field814, class40.field815);
                field332.field2105 = 0;
                if (field297 == 40) {
                    field332.method2641(18);
                } else {
                    field332.method2641(16);
                }
                field332.method2538(0);
                int var2 = field332.field2105;
                field332.method2540(128);
                field332.method2639(field331.field2108, 0, field331.field2105);
                int var3 = field332.field2105;
                field332.method2543(class42.field850);
                field332.method2641((field499 ? 1 : 0) << 1 | (field315 ? 1 : 0));
                field332.method2538(Statics.field1201);
                field332.method2538(Statics.field1585);
                class160 var4 = field332;
                byte[] var5 = new byte[24];
                try {
                    class105.field1688.method1277(0L);
                    class105.field1688.method1305(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var38) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2639(var5, 0, 24);
                field332.method2543(Statics.field1777);
                field332.method2540(Statics.field216);
                class154 var9 = new class154(Statics.field1855.method3940());
                Statics.field1855.method3941(var9);
                field332.method2639(var9.field2108, 0, var9.field2108.length);
                field332.method2641(Statics.field3241);
                field332.method2540(Statics.field916.field2729);
                field332.method2540(Statics.field193.field2729);
                field332.method2540(Statics.field2179.field2729);
                field332.method2540(Statics.field76.field2729);
                field332.method2540(Statics.field1666.field2729);
                field332.method2540(Statics.field971.field2729);
                field332.method2540(Statics.field1865.field2729);
                field332.method2540(Statics.field3169.field2729);
                field332.method2540(Statics.field3087.field2729);
                field332.method2540(Statics.field143.field2729);
                field332.method2540(Statics.field588.field2729);
                field332.method2540(Statics.field161.field2729);
                field332.method2540(Statics.field2845.field2729);
                field332.method2540(Statics.field908.field2729);
                field332.method2540(Statics.field3077.field2729);
                field332.method2540(Statics.field584.field2729);
                field332.method2571(var1, var3, field332.field2105);
                field332.method2548(field332.field2105 - var2);
                Statics.field47.method1904(field332.field2108, 0, field332.field2105);
                field331.method2790(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field333.method2790(var1);
                field515 = 6;
            }
            if (field515 == 6 && Statics.field47.method1902() > 0) {
                int var11 = Statics.field47.method1901();
                if (var11 == 21 && field297 == 20) {
                    field515 = 7;
                } else if (var11 == 2) {
                    field515 = 9;
                } else if (var11 == 15 && field297 == 40) {
                    field524 = -1;
                    field515 = 13;
                } else if (var11 == 23 && field324 < 1) {
                    field324++;
                    field515 = 0;
                } else if (var11 == 29) {
                    field515 = 11;
                } else {
                    method1431(var11);
                    return;
                }
            }
            if (field515 == 7 && Statics.field47.method1902() > 0) {
                field373 = (Statics.field47.method1901() + 3) * 60;
                field515 = 8;
            }
            if (field515 == 8) {
                field323 = 0;
                class42.method846(class174.field2494, class174.field2587, field373 / 60 + class174.field2400);
                if (--field373 <= 0) {
                    field515 = 0;
                }
            } else {
                if (field515 == 9 && Statics.field47.method1902() >= 13) {
                    boolean var12 = Statics.field47.method1901() == 1;
                    Statics.field47.method1903(field333.field2108, 0, 4);
                    field333.field2105 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field333.method2783() << 24;
                        int var15 = var14 | field333.method2783() << 16;
                        int var16 = var15 | field333.method2783() << 8;
                        int var17 = var16 | field333.method2783();
                        int var18 = class208.method173(class42.field850);
                        if (Statics.field36.field707.size() >= 10 && !Statics.field36.field707.containsKey(var18)) {
                            Iterator var19 = Statics.field36.field707.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field36.field707.put(var18, var17);
                        class31.method2089();
                    }
                    field452 = Statics.field47.method1901();
                    field454 = Statics.field47.method1901() == 1;
                    field409 = Statics.field47.method1901();
                    field409 <<= 0x8;
                    field409 += Statics.field47.method1901();
                    field410 = Statics.field47.method1901();
                    Statics.field47.method1903(field333.field2108, 0, 1);
                    field333.field2105 = 0;
                    field335 = field333.method2783();
                    Statics.field47.method1903(field333.field2108, 0, 2);
                    field333.field2105 = 0;
                    field524 = field333.method2554();
                    try {
                        class101.method1796(Statics.field541, "zap");
                    } catch (Throwable var37) {
                    }
                    field515 = 10;
                }
                if (field515 != 10) {
                    if (field515 == 11 && Statics.field47.method1902() >= 2) {
                        field333.field2105 = 0;
                        Statics.field47.method1903(field333.field2108, 0, 2);
                        field333.field2105 = 0;
                        Statics.field2175 = field333.method2554();
                        field515 = 12;
                    }
                    if (field515 == 12 && Statics.field47.method1902() >= Statics.field2175) {
                        field333.field2105 = 0;
                        Statics.field47.method1903(field333.field2108, 0, Statics.field2175);
                        field333.field2105 = 0;
                        String var32 = field333.method2606();
                        String var33 = field333.method2606();
                        String var34 = field333.method2606();
                        class42.method846(var32, var33, var34);
                        method191(10);
                    }
                    if (field515 == 13) {
                        if (field524 == -1) {
                            if (Statics.field47.method1902() < 2) {
                                return;
                            }
                            Statics.field47.method1903(field333.field2108, 0, 2);
                            field333.field2105 = 0;
                            field524 = field333.method2554();
                        }
                        if (Statics.field47.method1902() >= field524) {
                            Statics.field47.method1903(field333.field2108, 0, field524);
                            field333.field2105 = 0;
                            int var35 = field524;
                            method27();
                            class46.method755(field333);
                            if (field333.field2105 != var35) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field323++;
                        if (field323 > 2000) {
                            if (field324 < 1) {
                                if (Statics.field3088 == Statics.field238) {
                                    Statics.field3088 = Statics.field813;
                                } else {
                                    Statics.field3088 = Statics.field238;
                                }
                                field324++;
                                field515 = 0;
                            } else {
                                method1431(-3);
                            }
                        }
                    }
                } else if (Statics.field47.method1902() >= field524) {
                    field333.field2105 = 0;
                    Statics.field47.method1903(field333.field2108, 0, field524);
                    field300 = 1L;
                    field544 = -1;
                    Statics.field696.field225 = 0;
                    Statics.field271 = true;
                    field351 = true;
                    field407 = -1L;
                    class228.field3229 = new class127();
                    field331.field2105 = 0;
                    field333.field2105 = 0;
                    field335 = -1;
                    field338 = -1;
                    field411 = -1;
                    field340 = -1;
                    field336 = 0;
                    field306 = 0;
                    field341 = 0;
                    field307 = 0;
                    field427 = 0;
                    field426 = false;
                    class116.method178(0);
                    class48.field938.clear();
                    class48.field946.method2112();
                    class48.field940.method2260();
                    class48.field941 = 0;
                    field438 = 0;
                    field440 = false;
                    field527 = 0;
                    field506 = (int) (Math.random() * 100.0D) - 50;
                    field516 = (int) (Math.random() * 110.0D) - 55;
                    field366 = (int) (Math.random() * 80.0D) - 40;
                    field359 = (int) (Math.random() * 120.0D) - 60;
                    field361 = (int) (Math.random() * 30.0D) - 20;
                    field372 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field521 = 0;
                    field514 = -1;
                    field519 = 0;
                    field490 = 0;
                    field377 = class41.field825;
                    field316 = class41.field825;
                    field493 = 0;
                    class46.method3271();
                    for (int var21 = 0; var21 < 2048; var21++) {
                        field408[var21] = null;
                    }
                    for (int var22 = 0; var22 < 32768; var22++) {
                        field326[var22] = null;
                    }
                    field417 = -1;
                    field420.method2200();
                    field512.method2200();
                    for (int var23 = 0; var23 < 4; var23++) {
                        for (int var24 = 0; var24 < 104; var24++) {
                            for (int var25 = 0; var25 < 104; var25++) {
                                field418[var23][var24][var25] = null;
                            }
                        }
                    }
                    field301 = new class129();
                    field313 = 0;
                    field552 = 0;
                    field556 = 0;
                    for (int var26 = 0; var26 < Statics.field2058; var26++) {
                        class188 var27 = class188.method3000(var26);
                        if (var27 != null) {
                            class166.field2173[var26] = 0;
                            class166.field2174[var26] = 0;
                        }
                    }
                    Statics.field1745.method811();
                    field453 = -1;
                    if (field445 != -1) {
                        class170.method777(field445);
                    }
                    for (class18 var28 = (class18) field419.method2148(); var28 != null; var28 = (class18) field419.method2152()) {
                        method768(var28, true);
                    }
                    field445 = -1;
                    field419 = new class126(8);
                    field449 = null;
                    field426 = false;
                    field427 = 0;
                    field496.method2875((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var29 = 0; var29 < 8; var29++) {
                        field414[var29] = null;
                        field374[var29] = false;
                    }
                    class13.method787();
                    field298 = true;
                    for (int var30 = 0; var30 < 100; var30++) {
                        field309[var30] = true;
                    }
                    method13();
                    field291 = null;
                    Statics.field2679 = 0;
                    Statics.field1763 = null;
                    for (int var31 = 0; var31 < 8; var31++) {
                        field533[var31] = new class5();
                    }
                    Statics.field1749 = null;
                    class46.method755(field333);
                    Statics.field55 = -1;
                    method718(false);
                    field335 = -1;
                }
            }
        } catch (IOException var39) {
            if (field324 < 1) {
                if (Statics.field3088 == Statics.field238) {
                    Statics.field3088 = Statics.field813;
                } else {
                    Statics.field3088 = Statics.field238;
                }
                field324++;
                field515 = 0;
            } else {
                method1431(-2);
            }
        }
    }

    @ObfuscatedName("b.d(B)V")
    public static void method27() {
        field331.field2105 = 0;
        field333.field2105 = 0;
        field335 = -1;
        field338 = -1;
        field411 = -1;
        field340 = -1;
        field524 = 0;
        field336 = 0;
        field306 = 0;
        field427 = 0;
        field426 = false;
        field521 = 0;
        field519 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field408[var0] = null;
        }
        Statics.field43 = null;
        for (int var1 = 0; var1 < field326.length; var1++) {
            class36 var2 = field326[var1];
            if (var2 != null) {
                var2.field614 = -1;
                var2.field632 = false;
            }
        }
        class13.method787();
        method191(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field309[var3] = true;
        }
        field331.method2782(92);
        field331.method2641(method856());
        field331.method2538(Statics.field1201);
        field331.method2538(Statics.field1585);
    }

    @ObfuscatedName("ct.w(IB)V")
    public static void method1431(int arg0) {
        if (arg0 == -3) {
            class42.method846(class174.field2499, class174.field2467, class174.field2403);
        } else if (arg0 == -2) {
            class42.method846(class174.field2424, class174.field2374, class174.field2623);
        } else if (arg0 == -1) {
            class42.method846(class174.field2436, class174.field2408, class174.field2542);
        } else if (arg0 == 3) {
            class42.field860 = 3;
        } else if (arg0 == 4) {
            class42.method846(class174.field2410, class174.field2363, class174.field2412);
        } else if (arg0 == 5) {
            class42.method846(class174.field2528, class174.field2571, class174.field2415);
        } else if (arg0 == 6) {
            class42.method846(class174.field2416, class174.field2417, class174.field2418);
        } else if (arg0 == 7) {
            class42.method846(class174.field2527, class174.field2420, class174.field2469);
        } else if (arg0 == 8) {
            class42.method846(class174.field2422, class174.field2423, class174.field2405);
        } else if (arg0 == 9) {
            class42.method846(class174.field2421, class174.field2485, class174.field2427);
        } else if (arg0 == 10) {
            class42.method846(class174.field2428, class174.field2429, class174.field2430);
        } else if (arg0 == 11) {
            class42.method846(class174.field2431, class174.field2432, class174.field2433);
        } else if (arg0 == 12) {
            class42.method846(class174.field2434, class174.field2442, class174.field2598);
        } else if (arg0 == 13) {
            class42.method846(class174.field2481, class174.field2596, class174.field2450);
        } else if (arg0 == 14) {
            class42.method846(class174.field2440, class174.field2441, class174.field2370);
        } else if (arg0 == 16) {
            class42.method846(class174.field2443, class174.field2388, class174.field2361);
        } else if (arg0 == 17) {
            class42.method846(class174.field2446, class174.field2590, class174.field2448);
        } else if (arg0 == 18) {
            class42.method846(class174.field2449, class174.field2566, class174.field2451);
        } else if (arg0 == 19) {
            class42.method846(class174.field2452, class174.field2453, class174.field2454);
        } else if (arg0 == 20) {
            class42.method846(class174.field2447, class174.field2456, class174.field2457);
        } else if (arg0 == 22) {
            class42.method846(class174.field2458, class174.field2459, class174.field2439);
        } else if (arg0 == 23) {
            class42.method846(class174.field2393, class174.field2462, class174.field2463);
        } else if (arg0 == 24) {
            class42.method846(class174.field2464, class174.field2465, class174.field2505);
        } else if (arg0 == 25) {
            class42.method846(class174.field2492, class174.field2468, class174.field2503);
        } else if (arg0 == 26) {
            class42.method846(class174.field2470, class174.field2471, class174.field2472);
        } else if (arg0 == 27) {
            class42.method846(class174.field2518, class174.field2474, class174.field2475);
        } else if (arg0 == 31) {
            class42.method846(class174.field2482, class174.field2483, class174.field2484);
        } else if (arg0 == 32) {
            class42.method846(class174.field2414, class174.field2486, class174.field2487);
        } else if (arg0 == 37) {
            class42.method846(class174.field2488, class174.field2489, class174.field2565);
        } else if (arg0 == 38) {
            class42.method846(class174.field2438, class174.field2479, class174.field2493);
        } else if (arg0 == 55) {
            class42.method846(class174.field2600, class174.field2495, class174.field2496);
        } else if (arg0 == 56) {
            class42.method846(class174.field2497, class174.field2498, class174.field2502);
            method191(11);
            return;
        } else if (arg0 == 57) {
            class42.method846(class174.field2500, class174.field2425, class174.field2466);
            method191(11);
            return;
        } else {
            class42.method846(class174.field2521, class174.field2491, class174.field2455);
        }
        method191(10);
    }

    @ObfuscatedName("fx.n(B)V")
    public static final void method2994() {
        if (Statics.field47 != null) {
            Statics.field47.method1915();
            Statics.field47 = null;
        }
        method34();
        Statics.field2137.method1590();
        for (int var0 = 0; var0 < 4; var0++) {
            field348[var0].method2054();
        }
        System.gc();
        class139.method2091(2);
        field523 = -1;
        field494 = false;
        for (class32 var1 = (class32) class32.field724.method2201(); var1 != null; var1 = (class32) class32.field724.method2203()) {
            if (var1.field717 != null) {
                Statics.field1555.method905(var1.field717);
                var1.field717 = null;
            }
            if (var1.field715 != null) {
                Statics.field1555.method905(var1.field715);
                var1.field715 = null;
            }
        }
        class32.field724.method2200();
        method191(10);
    }

    @ObfuscatedName("g.q(I)V")
    public static final void method34() {
        class201.field3045.method2139();
        class192.field2818.method2139();
        class193.field2821.method2139();
        class198.field2893.method2139();
        class198.field2913.method2139();
        class198.field2895.method2139();
        class198.field2917.method2139();
        class200.method1097();
        class199.method2989();
        class202.method2987();
        class191.method648();
        class195.method3004();
        class188.field2781.method2139();
        class197.method571();
        class194.method164();
        class167.field2188.method2139();
        class170.field2202.method2139();
        class170.field2261.method2139();
        class170.field2220.method2139();
        class170.field2231.method2139();
        ((class75) Statics.field1443).method1335();
        class49.field947.method2139();
        Statics.field916.method3061();
        Statics.field193.method3061();
        Statics.field76.method3061();
        Statics.field1666.method3061();
        Statics.field971.method3061();
        Statics.field1865.method3061();
        Statics.field3169.method3061();
        Statics.field3087.method3061();
        Statics.field143.method3061();
        Statics.field588.method3061();
        Statics.field161.method3061();
        Statics.field2845.method3061();
    }

    @ObfuscatedName("cn.t(I)V")
    public static final void method1760() {
        if (field341 > 0) {
            method2994();
        } else {
            method191(40);
            Statics.field144 = Statics.field47;
            Statics.field47 = null;
        }
    }

    @ObfuscatedName("gc.r(I)V")
    public static final void method3101() {
        if (Statics.field63 != null) {
            Statics.field63.method1002();
        }
        if (Statics.field1528 != null) {
            Statics.field1528.method1002();
        }
    }

    @ObfuscatedName("i.a(I)V")
    public static final void method176() {
        for (int var0 = 0; var0 < field527; var0++) {
            int var10002 = field530[var0]--;
            if (field530[var0] >= -10) {
                class54 var2 = field532[var0];
                if (var2 == null) {
                    class54 var10000 = (class54) null;
                    var2 = class54.method937(Statics.field1666, field528[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field530[var0] += var2.method936();
                    field532[var0] = var2;
                }
                if (field530[var0] < 0) {
                    int var9;
                    if (field350[var0] == 0) {
                        var9 = field525;
                    } else {
                        int var3 = (field350[var0] & 0xFF) * 128;
                        int var4 = field350[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field43.field608;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field350[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field43.field605;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field530[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field526 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class56 var10 = var2.method926().method972(Statics.field142);
                        class67 var11 = class67.method1194(var10, 100, var9);
                        var11.method1210(field352[var0] - 1);
                        Statics.field1555.method880(var11);
                    }
                    field530[var0] = -100;
                }
            } else {
                field527--;
                for (int var1 = var0; var1 < field527; var1++) {
                    field528[var1] = field528[var1 + 1];
                    field532[var1] = field532[var1 + 1];
                    field352[var1] = field352[var1 + 1];
                    field530[var1] = field530[var1 + 1];
                    field350[var1] = field350[var1 + 1];
                }
                var0--;
            }
        }
        if (field494 && !class139.method654()) {
            if (field522 != 0 && field523 != -1) {
                class139.method1761(Statics.field1865, field523, 0, field522, false);
            }
            field494 = false;
        }
    }

    @ObfuscatedName("bn.e(Lgf;IIIB)V")
    public static void method1328(class202 arg0, int arg1, int arg2, int arg3) {
        if (field527 >= 50 || field526 == 0 || arg0.field3054 == null || arg1 >= arg0.field3054.length) {
            return;
        }
        int var4 = arg0.field3054[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field528[field527] = var5;
        field352[field527] = var6;
        field530[field527] = 0;
        field532[field527] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field350[field527] = (var8 << 16) + (var9 << 8) + var7;
        field527++;
    }

    @ObfuscatedName("da.am(IB)V")
    public static void method2010(int arg0) {
        if (arg0 == -1 && !field494) {
            Statics.field1927.method2333();
            class139.field1930 = 1;
            Statics.field1931 = null;
        } else if (arg0 != -1 && field523 != arg0 && field522 != 0 && !field494) {
            class185 var1 = Statics.field1865;
            int var2 = field522;
            class139.field1930 = 1;
            Statics.field1931 = var1;
            Statics.field1932 = arg0;
            Statics.field2712 = 0;
            Statics.field1933 = var2;
            Statics.field666 = false;
            Statics.field187 = 2;
        }
        field523 = arg0;
    }

    @ObfuscatedName("fs.ag(I)V")
    public static final void method3007() {
        int var0 = Statics.field1060 * 128 + 64;
        int var1 = Statics.field929 * 128 + 64;
        int var2 = method878(var0, var1, Statics.field1094) - Statics.field902;
        if (Statics.field1759 < var0) {
            Statics.field1759 += Statics.field74 * (var0 - Statics.field1759) / 1000 + Statics.field1198;
            if (Statics.field1759 > var0) {
                Statics.field1759 = var0;
            }
        }
        if (Statics.field1759 > var0) {
            Statics.field1759 -= Statics.field74 * (Statics.field1759 - var0) / 1000 + Statics.field1198;
            if (Statics.field1759 < var0) {
                Statics.field1759 = var0;
            }
        }
        if (Statics.field2791 < var2) {
            Statics.field2791 += Statics.field74 * (var2 - Statics.field2791) / 1000 + Statics.field1198;
            if (Statics.field2791 > var2) {
                Statics.field2791 = var2;
            }
        }
        if (Statics.field2791 > var2) {
            Statics.field2791 -= Statics.field74 * (Statics.field2791 - var2) / 1000 + Statics.field1198;
            if (Statics.field2791 < var2) {
                Statics.field2791 = var2;
            }
        }
        if (Statics.field178 < var1) {
            Statics.field178 += Statics.field74 * (var1 - Statics.field178) / 1000 + Statics.field1198;
            if (Statics.field178 > var1) {
                Statics.field178 = var1;
            }
        }
        if (Statics.field178 > var1) {
            Statics.field178 -= Statics.field74 * (Statics.field178 - var1) / 1000 + Statics.field1198;
            if (Statics.field178 < var1) {
                Statics.field178 = var1;
            }
        }
        int var3 = Statics.field621 * 128 + 64;
        int var4 = Statics.field1942 * 128 + 64;
        int var5 = method878(var3, var4, Statics.field1094) - Statics.field888;
        int var6 = var3 - Statics.field1759;
        int var7 = var5 - Statics.field2791;
        int var8 = var4 - Statics.field178;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field191 < var10) {
            Statics.field191 += Statics.field2152 * (var10 - Statics.field191) / 1000 + Statics.field149;
            if (Statics.field191 > var10) {
                Statics.field191 = var10;
            }
        }
        if (Statics.field191 > var10) {
            Statics.field191 -= Statics.field2152 * (Statics.field191 - var10) / 1000 + Statics.field149;
            if (Statics.field191 < var10) {
                Statics.field191 = var10;
            }
        }
        int var12 = var11 - Statics.field1079;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1079 += Statics.field2152 * var12 / 1000 + Statics.field149;
            Statics.field1079 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1079 -= Statics.field2152 * -var12 / 1000 + Statics.field149;
            Statics.field1079 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1079;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1079 = var11;
        }
    }

    @ObfuscatedName("cp.au(I)V")
    public static final void method1443() {
        int var0 = field506 + Statics.field43.field608;
        int var1 = field516 + Statics.field43.field605;
        if (Statics.field2191 - var0 < -500 || Statics.field2191 - var0 > 500 || Statics.field1804 - var1 < -500 || Statics.field1804 - var1 > 500) {
            Statics.field2191 = var0;
            Statics.field1804 = var1;
        }
        if (Statics.field2191 != var0) {
            Statics.field2191 += (var0 - Statics.field2191) / 16;
        }
        if (Statics.field1804 != var1) {
            Statics.field1804 += (var1 - Statics.field1804) / 16;
        }
        if (class116.field1823 == 4 && Statics.field2048) {
            int var2 = class116.field1822 - field520;
            field553 = var2 * 2;
            field520 = var2 == -1 || var2 == 1 ? class116.field1822 : (field520 + class116.field1822) / 2;
            int var3 = field375 - class116.field1815;
            field503 = var3 * 2;
            field375 = var3 == -1 || var3 == 1 ? class116.field1815 : (field375 + class116.field1815) / 2;
        } else {
            if (class106.field1729[96]) {
                field503 += (-24 - field503) / 2;
            } else if (class106.field1729[97]) {
                field503 += (24 - field503) / 2;
            } else {
                field503 /= 2;
            }
            if (class106.field1729[98]) {
                field553 += (12 - field553) / 2;
            } else if (class106.field1729[99]) {
                field553 += (-12 - field553) / 2;
            } else {
                field553 /= 2;
            }
            field520 = class116.field1822;
            field375 = class116.field1815;
        }
        field372 = field503 / 2 + field372 & 0x7FF;
        field371 += field553 / 2;
        if (field371 < 128) {
            field371 = 128;
        }
        if (field371 > 383) {
            field371 = 383;
        }
        int var4 = Statics.field2191 >> 7;
        int var5 = Statics.field1804 >> 7;
        int var6 = method878(Statics.field2191, Statics.field1804, Statics.field1094);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field1094;
                    if (var10 < 3 && (class11.field82[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class11.field94[var10][var8][var9];
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
        if (var12 > field380) {
            field380 += (var12 - field380) / 24;
        } else if (var12 < field380) {
            field380 += (var12 - field380) / 80;
        }
    }

    @ObfuscatedName("af.aa(B)V")
    public static final void method720() {
        for (int var0 = 0; var0 < field493; var0++) {
            int var1 = field328[var0];
            class36 var2 = field326[var1];
            if (var2 != null) {
                Statics.method1785(var2, var2.field772.field3000);
            }
        }
    }

    @ObfuscatedName("ag.av(Lag;I)V")
    public static final void method584(class28 arg0) {
        int var1 = arg0.field651 - field299;
        int var2 = arg0.field659 * 128 + arg0.field613 * 64;
        int var3 = arg0.field633 * 128 + arg0.field613 * 64;
        arg0.field608 += (var2 - arg0.field608) / var1;
        arg0.field605 += (var3 - arg0.field605) / var1;
        arg0.field663 = 0;
        arg0.field656 = arg0.field653;
    }

    @ObfuscatedName("dw.ao(Lag;S)V")
    public static final void method2088(class28 arg0) {
        arg0.field634 = arg0.field644;
        if (arg0.field657 == 0) {
            arg0.field663 = 0;
            return;
        }
        if (arg0.field637 != -1 && arg0.field646 == 0) {
            class202 var1 = class202.method658(arg0.field637);
            if (arg0.field664 > 0 && var1.field3047 == 0) {
                arg0.field663++;
                return;
            }
            if (arg0.field664 <= 0 && var1.field3063 == 0) {
                arg0.field663++;
                return;
            }
        }
        int var2 = arg0.field608;
        int var3 = arg0.field605;
        int var4 = arg0.field660[arg0.field657 - 1] * 128 + arg0.field613 * 64;
        int var5 = arg0.field661[arg0.field657 - 1] * 128 + arg0.field613 * 64;
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
        byte var6 = arg0.field662[arg0.field657 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field608 = var4;
            arg0.field605 = var5;
            arg0.field657--;
            if (arg0.field664 > 0) {
                arg0.field664--;
            }
            return;
        }
        int var7 = arg0.field656 - arg0.field606 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field641;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field625;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field649;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field616;
        }
        if (var8 == -1) {
            var8 = arg0.field625;
        }
        arg0.field634 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class36) {
            var10 = ((class36) arg0).field772.field3028;
        }
        if (var10) {
            if (arg0.field656 != arg0.field606 && arg0.field614 == -1 && arg0.field658 != 0) {
                var9 = 2;
            }
            if (arg0.field657 > 2) {
                var9 = 6;
            }
            if (arg0.field657 > 3) {
                var9 = 8;
            }
            if (arg0.field663 > 0 && arg0.field657 > 1) {
                var9 = 8;
                arg0.field663--;
            }
        } else {
            if (arg0.field657 > 1) {
                var9 = 6;
            }
            if (arg0.field657 > 2) {
                var9 = 8;
            }
            if (arg0.field663 > 0 && arg0.field657 > 1) {
                var9 = 8;
                arg0.field663--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field634 == arg0.field625 && arg0.field612 != -1) {
            arg0.field634 = arg0.field612;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field608 += var9;
                if (arg0.field608 > var4) {
                    arg0.field608 = var4;
                }
            } else if (var2 > var4) {
                arg0.field608 -= var9;
                if (arg0.field608 < var4) {
                    arg0.field608 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field605 += var9;
                if (arg0.field605 > var5) {
                    arg0.field605 = var5;
                }
            } else if (var3 > var5) {
                arg0.field605 -= var9;
                if (arg0.field605 < var5) {
                    arg0.field605 = var5;
                }
            }
        }
        if (arg0.field608 == var4 && arg0.field605 == var5) {
            arg0.field657--;
            if (arg0.field664 > 0) {
                arg0.field664--;
            }
        }
    }

    @ObfuscatedName("cv.ah(Lag;B)V")
    public static final void method1784(class28 arg0) {
        if (arg0.field658 == 0) {
            return;
        }
        if (arg0.field614 != -1) {
            class28 var1 = null;
            if (arg0.field614 < 32768) {
                var1 = field326[arg0.field614];
            } else if (arg0.field614 >= 32768) {
                var1 = field408[arg0.field614 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field608 - var1.field608;
                int var3 = arg0.field605 - var1.field605;
                if (var2 != 0 || var3 != 0) {
                    arg0.field656 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field632) {
                arg0.field614 = -1;
                arg0.field632 = false;
            }
        }
        if (arg0.field615 != -1 && (arg0.field657 == 0 || arg0.field663 > 0)) {
            arg0.field656 = arg0.field615;
            arg0.field615 = -1;
        }
        int var4 = arg0.field656 - arg0.field606 & 0x7FF;
        if (var4 == 0 && arg0.field632) {
            arg0.field614 = -1;
            arg0.field632 = false;
        }
        if (var4 == 0) {
            arg0.field604 = 0;
            return;
        }
        arg0.field604++;
        if (var4 > 1024) {
            arg0.field606 -= arg0.field658;
            boolean var5 = true;
            if (var4 < arg0.field658 || var4 > 2048 - arg0.field658) {
                arg0.field606 = arg0.field656;
                var5 = false;
            }
            if (arg0.field644 == arg0.field634 && (arg0.field604 > 25 || var5)) {
                if (arg0.field647 == -1) {
                    arg0.field634 = arg0.field625;
                } else {
                    arg0.field634 = arg0.field647;
                }
            }
        } else {
            arg0.field606 += arg0.field658;
            boolean var6 = true;
            if (var4 < arg0.field658 || var4 > 2048 - arg0.field658) {
                arg0.field606 = arg0.field656;
                var6 = false;
            }
            if (arg0.field644 == arg0.field634 && (arg0.field604 > 25 || var6)) {
                if (arg0.field611 == -1) {
                    arg0.field634 = arg0.field625;
                } else {
                    arg0.field634 = arg0.field611;
                }
            }
        }
        arg0.field606 &= 0x7FF;
    }

    @ObfuscatedName("ae.ak(Lr;IIB)V")
    public static void method644(class24 arg0, int arg1, int arg2) {
        if (arg0.field637 == arg1 && arg1 != -1) {
            int var3 = class202.method658(arg1).field3060;
            if (var3 == 1) {
                arg0.field638 = 0;
                arg0.field640 = 0;
                arg0.field646 = arg2;
                arg0.field627 = 0;
            }
            if (var3 == 2) {
                arg0.field627 = 0;
            }
        } else if (arg1 == -1 || arg0.field637 == -1 || class202.method658(arg1).field3057 >= class202.method658(arg0.field637).field3057) {
            arg0.field637 = arg1;
            arg0.field638 = 0;
            arg0.field640 = 0;
            arg0.field646 = arg2;
            arg0.field627 = 0;
            arg0.field664 = arg0.field657;
        }
    }

    @ObfuscatedName("ap.ab(I)I")
    public static int method856() {
        return field499 ? 2 : 1;
    }

    @ObfuscatedName("m.ay(I)V")
    public static void method13() {
        field331.method2782(92);
        field331.method2641(method856());
        field331.method2538(Statics.field1201);
        field331.method2538(Statics.field1585);
    }

    @ObfuscatedName("u.an(I)V")
    public static void method90() {
        client var0 = Statics.field541;
        synchronized (Statics.field541) {
            Container var1 = Statics.field541.method1941();
            if (var1 != null) {
                Statics.field1721 = Math.max(var1.getSize().width, Statics.field810);
                Statics.field915 = Math.max(var1.getSize().height, Statics.field186);
                if (Statics.field1778 == var1) {
                    Insets var2 = Statics.field1778.getInsets();
                    Statics.field1721 -= var2.right + var2.left;
                    Statics.field915 -= var2.top + var2.bottom;
                }
                if (Statics.field1721 <= 0) {
                    Statics.field1721 = 1;
                }
                if (Statics.field915 <= 0) {
                    Statics.field915 = 1;
                }
                if (method856() == 1) {
                    Statics.field1201 = field500 * 765;
                    Statics.field1585 = field384;
                } else {
                    Statics.field1201 = Math.min(Statics.field1721, 7680);
                    Statics.field1585 = Math.min(Statics.field915, 2160);
                }
                field1789 = (Statics.field1721 - Statics.field1201) / 2;
                field1794 = 0;
                Statics.field782.setSize(Statics.field1201, Statics.field1585);
                int var3 = Statics.field1201;
                int var4 = Statics.field1585;
                Canvas var5 = Statics.field782;
                class221 var7;
                try {
                    class219 var6 = new class219();
                    var6.method3674(var3, var4, var5);
                    var7 = var6;
                } catch (Throwable var18) {
                    class224 var9 = new class224();
                    var9.method3674(var3, var4, var5);
                    var7 = var9;
                }
                Statics.field1210 = var7;
                if (Statics.field1778 == var1) {
                    Insets var10 = Statics.field1778.getInsets();
                    Statics.field782.setLocation(field1789 + var10.left, field1794 + var10.top);
                } else {
                    Statics.field782.setLocation(field1789, field1794);
                }
                int var11 = Statics.field1201;
                int var12 = Statics.field1585;
                if (Statics.field1721 < var11) {
                    int var13 = Statics.field1721;
                }
                if (Statics.field915 < var12) {
                    int var14 = Statics.field915;
                }
                if (Statics.field36 != null) {
                    try {
                        class101.method1795(Statics.field541, "resize", new Object[] { method856() });
                    } catch (Throwable var17) {
                    }
                }
                if (field445 != -1) {
                    method1926(true);
                }
                method3230();
            }
        }
    }

    @ObfuscatedName("gq.aw(I)V")
    public static void method3230() {
        int var0 = field1789;
        int var1 = field1794;
        int var2 = Statics.field1721 - Statics.field1201 - var0;
        int var3 = Statics.field915 - Statics.field1585 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field541.method1941();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1778 == var4) {
                Insets var7 = Statics.field1778.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field915);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field1721, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field1721 + var5 - var2, var6, var2, Statics.field915);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field915 + var6 - var3, Statics.field1721, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("gp.ac(IIIIZB)V")
    public static final void method3508(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field540 - field539) * var5 / 100 + field539;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field545) {
            short var8 = field545;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field463) {
                var6 = field463;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class220.method3688();
                    class220.method3696(arg0, arg1, var10, arg3, -16777216);
                    class220.method3696(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field511) {
            short var11 = field511;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field398) {
                var6 = field398;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class220.method3688();
                    class220.method3696(arg0, arg1, arg2, var13, -16777216);
                    class220.method3696(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field395 - field367) * var5 / 100 + field367;
        field570 = arg3 * var6 * var14 / 85504 << 1;
        if (field549 != arg2 || field550 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class85.field1436[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class88.method1605(var15, 500, 800, arg2, arg3);
        }
        field547 = arg0;
        field548 = arg1;
        field549 = arg2;
        field550 = arg3;
    }

    @ObfuscatedName("cg.ar(Li;B)V")
    public static final void method1777(class16 arg0) {
        if (Statics.field43.field608 >> 7 == field519 && Statics.field43.field605 >> 7 == field490) {
            field519 = 0;
        }
        int var1 = class46.field901;
        int[] var2 = class46.field903;
        int var3 = var1;
        if (class16.field169 == arg0 || class16.field168 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class24 var5;
            int var6;
            if (class16.field169 == arg0) {
                var5 = Statics.field43;
                var6 = Statics.field43.field274 << 14;
            } else if (class16.field168 == arg0) {
                var5 = field408[field417];
                var6 = field417 << 14;
            } else {
                var5 = field408[var2[var4]];
                var6 = var2[var4] << 14;
                if (class16.field167 == arg0 && field417 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method216() && !var5.field269) {
                var5.field267 = false;
                if ((field315 && var1 > 50 || var1 > 200) && class16.field169 != arg0 && var5.field644 == var5.field634) {
                    var5.field267 = true;
                }
                int var7 = var5.field608 >> 7;
                int var8 = var5.field605 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field262 == null || field299 < var5.field270 || field299 >= var5.field258) {
                        if ((var5.field608 & 0x7F) == 64 && (var5.field605 & 0x7F) == 64) {
                            if (field392 == field391[var7][var8]) {
                                continue;
                            }
                            field391[var7][var8] = field392;
                        }
                        var5.field256 = method878(var5.field608, var5.field605, Statics.field1094);
                        Statics.field2137.method1601(Statics.field1094, var5.field608, var5.field605, var5.field256, 60, var5, var5.field606, var6, var5.field607);
                    } else {
                        var5.field267 = false;
                        var5.field256 = method878(var5.field608, var5.field605, Statics.field1094);
                        Statics.field2137.method1602(Statics.field1094, var5.field608, var5.field605, var5.field256, 60, var5, var5.field606, var6, var5.field263, var5.field248, var5.field265, var5.field266);
                    }
                }
            }
        }
    }

    @ObfuscatedName("eh.at(ZB)V")
    public static final void method2408(boolean arg0) {
        for (int var1 = 0; var1 < field493; var1++) {
            class36 var2 = field326[field328[var1]];
            int var3 = (field328[var1] << 14) + 536870912;
            if (var2 != null && var2.method216() && var2.field772.field2997 == arg0 && var2.field772.method3419()) {
                int var4 = var2.field608 >> 7;
                int var5 = var2.field605 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field613 == 1 && (var2.field608 & 0x7F) == 64 && (var2.field605 & 0x7F) == 64) {
                        if (field392 == field391[var4][var5]) {
                            continue;
                        }
                        field391[var4][var5] = field392;
                    }
                    if (!var2.field772.field2994) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2137.method1601(Statics.field1094, var2.field608, var2.field605, method878(var2.field608 + (var2.field613 * 64 - 64), var2.field605 + (var2.field613 * 64 - 64), Statics.field1094), var2.field613 * 64 - 64 + 60, var2, var2.field606, var3, var2.field607);
                }
            }
        }
    }

    @ObfuscatedName("be.al(I)V")
    public static final void method1075() {
        for (class34 var0 = (class34) field512.method2201(); var0 != null; var0 = (class34) field512.method2203()) {
            if (Statics.field1094 != var0.field748 || var0.field755) {
                var0.method2189();
            } else if (field299 >= var0.field759) {
                var0.method669(field364);
                if (var0.field755) {
                    var0.method2189();
                } else {
                    Statics.field2137.method1601(var0.field748, var0.field751, var0.field746, var0.field756, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("cq.ax(I)I")
    public static final int method1773() {
        if (Statics.field36.field700) {
            return Statics.field1094;
        }
        int var0 = 3;
        if (Statics.field191 < 310) {
            int var1 = Statics.field1759 >> 7;
            int var2 = Statics.field178 >> 7;
            int var3 = Statics.field43.field608 >> 7;
            int var4 = Statics.field43.field605 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field1094;
            }
            if ((class11.field82[Statics.field1094][var1][var2] & 0x4) != 0) {
                var0 = Statics.field1094;
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
                    if ((class11.field82[Statics.field1094][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1094;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class11.field82[Statics.field1094][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1094;
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
                    if ((class11.field82[Statics.field1094][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1094;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class11.field82[Statics.field1094][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1094;
                        }
                    }
                }
            }
        }
        if (Statics.field43.field608 >= 0 && Statics.field43.field605 >= 0 && Statics.field43.field608 < 13312 && Statics.field43.field605 < 13312) {
            if ((class11.field82[Statics.field1094][Statics.field43.field608 >> 7][Statics.field43.field605 >> 7] & 0x4) != 0) {
                var0 = Statics.field1094;
            }
            return var0;
        } else {
            return Statics.field1094;
        }
    }

    @ObfuscatedName("fp.az(I)I")
    public static final int method2794() {
        if (Statics.field36.field700) {
            return Statics.field1094;
        } else {
            int var0 = method878(Statics.field1759, Statics.field178, Statics.field1094);
            return var0 - Statics.field2791 >= 800 || (class11.field82[Statics.field1094][Statics.field1759 >> 7][Statics.field178 >> 7] & 0x4) == 0 ? 3 : Statics.field1094;
        }
    }

    @ObfuscatedName("ck.ap(Lag;IIIIII)V")
    public static final void method1755(class28 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method216()) {
            return;
        }
        if (arg0 instanceof class36) {
            class200 var6 = ((class36) arg0).field772;
            if (var6.field3024 != null) {
                var6 = var6.method3444();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class46.field901;
        int[] var8 = class46.field903;
        int var9 = 3;
        if (!arg0.field630.method2166()) {
            method3534(arg0, arg0.field635 + 15);
            for (class35 var10 = (class35) arg0.field630.method2163(); var10 != null; var10 = (class35) arg0.field630.method2161()) {
                class29 var11 = var10.method675(field299);
                if (var11 != null) {
                    class194 var12 = var10.field764;
                    class225 var13 = var12.method3235();
                    class225 var14 = var12.method3239();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field2843;
                    } else {
                        if (var12.field2844 * 2 < var14.field3208) {
                            var15 = var12.field2844;
                        }
                        var16 = var14.field3208 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field299 - var11.field668;
                    int var20 = var11.field674 * var16 / var12.field2843;
                    int var23;
                    if (var11.field669 > var19) {
                        int var21 = var12.field2836 == 0 ? 0 : var19 / var12.field2836 * var12.field2836;
                        int var22 = var11.field667 * var16 / var12.field2843;
                        var23 = (var20 - var22) * var21 / var11.field669 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field669 + var12.field2834 - var19;
                        if (var12.field2838 >= 0) {
                            var17 = (var24 << 8) / (var12.field2834 - var12.field2838);
                        }
                    }
                    if (var11.field674 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field393 + arg2 - (var16 >> 1);
                    int var26 = field394 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field393 > -1) {
                            class220.method3696(var25, var26, var23, 5, 65280);
                            class220.method3696(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3207;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method3820(var27, var26, var17);
                            class220.method3691(var27, var26, var27 + var28, var26 + var29);
                            var14.method3820(var27, var26, var17);
                        } else {
                            var13.method3814(var27, var26);
                            class220.method3691(var27, var26, var27 + var28, var26 + var29);
                            var14.method3814(var27, var26);
                        }
                        class220.method3690(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method676()) {
                    var10.method2189();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class24 var30 = (class24) arg0;
            if (var30.field269) {
                return;
            }
            if (var30.field250 != -1 || var30.field251 != -1) {
                method3534(arg0, arg0.field635 + 15);
                if (field393 > -1) {
                    if (var30.field250 != -1) {
                        Statics.field741[var30.field250].method3814(field393 + arg2 - 12, field394 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field251 != -1) {
                        Statics.field2062[var30.field251].method3814(field393 + arg2 - 12, field394 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field307 == 10 && field358 == var8[arg1]) {
                method3534(arg0, arg0.field635 + 15);
                if (field393 > -1) {
                    Statics.field2020[1].method3814(field393 + arg2 - 12, field394 + arg3 - var9);
                }
            }
        } else {
            class200 var31 = ((class36) arg0).field772;
            if (var31.field3024 != null) {
                var31 = var31.method3444();
            }
            if (var31.field3033 >= 0 && var31.field3033 < Statics.field2062.length) {
                method3534(arg0, arg0.field635 + 15);
                if (field393 > -1) {
                    Statics.field2062[var31.field3033].method3814(field393 + arg2 - 12, field394 + arg3 - 30);
                }
            }
            if (field307 == 1 && field308 == field328[arg1 - var7] && field299 % 20 < 10) {
                method3534(arg0, arg0.field635 + 15);
                if (field393 > -1) {
                    Statics.field2020[0].method3814(field393 + arg2 - 12, field394 + arg3 - 28);
                }
            }
        }
        if (arg0.field617 != null && (arg1 >= var7 || !arg0.field619 && (field353 == 4 || !arg0.field618 && (field353 == 0 || field353 == 3 || field353 == 1 && method2760(((class24) arg0).field264, false))))) {
            method3534(arg0, arg0.field635);
            if (field393 > -1 && field293 < field382) {
                field531[field293] = Statics.field219.method3575(arg0.field617) / 2;
                field459[field293] = Statics.field219.field3103;
                field287[field293] = field393;
                field305[field293] = field394;
                field387[field293] = arg0.field609;
                field356[field293] = arg0.field622;
                field415[field293] = arg0.field620;
                field390[field293] = arg0.field617;
                field293++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field610[var32];
            int var34 = arg0.field639[var32];
            class197 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field299) {
                    continue;
                }
                var35 = class197.method2869(arg0.field639[var32]);
                var36 = var35.field2876;
                if (var35 != null && var35.field2878 != null) {
                    var35 = var35.method3292();
                    if (var35 == null) {
                        arg0.field610[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field628[var32];
            class197 var38 = null;
            if (var37 >= 0) {
                var38 = class197.method2869(var37);
                if (var38 != null && var38.field2878 != null) {
                    var38 = var38.method3292();
                }
            }
            if (var33 - var36 <= field299) {
                if (var35 == null) {
                    arg0.field610[var32] = -1;
                } else {
                    method3534(arg0, arg0.field635 / 2);
                    if (field393 > -1) {
                        if (var32 == 1) {
                            field394 -= 20;
                        }
                        if (var32 == 2) {
                            field393 -= 15;
                            field394 -= 10;
                        }
                        if (var32 == 3) {
                            field393 += 15;
                            field394 -= 10;
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
                        class225 var64 = var35.method3280();
                        if (var64 != null) {
                            var43 = var64.field3208;
                            int var65 = var64.field3207;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3204;
                        }
                        class225 var66 = var35.method3302();
                        if (var66 != null) {
                            var44 = var66.field3208;
                            int var67 = var66.field3207;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3204;
                        }
                        class225 var68 = var35.method3282();
                        if (var68 != null) {
                            var45 = var68.field3208;
                            int var69 = var68.field3207;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3204;
                        }
                        class225 var70 = var35.method3283();
                        if (var70 != null) {
                            var46 = var70.field3208;
                            int var71 = var70.field3207;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3204;
                        }
                        if (var38 != null) {
                            var51 = var38.method3280();
                            if (var51 != null) {
                                var55 = var51.field3208;
                                int var72 = var51.field3207;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3204;
                            }
                            var52 = var38.method3302();
                            if (var52 != null) {
                                var56 = var52.field3208;
                                int var73 = var52.field3207;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3204;
                            }
                            var53 = var38.method3282();
                            if (var53 != null) {
                                var57 = var53.field3208;
                                int var74 = var53.field3207;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3204;
                            }
                            var54 = var38.method3283();
                            if (var54 != null) {
                                var58 = var54.field3208;
                                int var75 = var54.field3207;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3204;
                            }
                        }
                        class209 var76 = var35.method3307();
                        if (var76 == null) {
                            var76 = Statics.field41;
                        }
                        class209 var77;
                        if (var38 == null) {
                            var77 = Statics.field41;
                        } else {
                            var77 = var38.method3307();
                            if (var77 == null) {
                                var77 = Statics.field41;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method3279(arg0.field626[var32]);
                        int var83 = var76.method3575(var82);
                        if (var38 != null) {
                            var79 = var38.method3279(arg0.field629[var32]);
                            var81 = var77.method3575(var79);
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
                        int var100 = arg0.field610[var32] - field299;
                        int var101 = var35.field2881 - var35.field2881 * var100 / var35.field2876;
                        int var102 = var35.field2883 * var100 / var35.field2876 + -var35.field2883;
                        int var103 = field393 + arg2 - (var92 >> 1) + var101;
                        int var104 = field394 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field2868 + var104 + 15;
                        int var108 = var107 - var76.field3106;
                        int var109 = var76.field3105 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field2868 + var104 + 15;
                            int var111 = var110 - var77.field3106;
                            int var112 = var77.field3105 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field2886 >= 0) {
                            var115 = (var100 << 8) / (var35.field2876 - var35.field2886);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method3820(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method3820(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method3820(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method3820(var93 + var103 - var50, var104, var115);
                            }
                            var76.method3580(var82, var90 + var103, var107, var35.field2875, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method3820(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method3820(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method3820(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method3820(var97 + var103 - var62, var104, var115);
                                }
                                var77.method3580(var79, var98 + var103, var110, var38.field2875, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method3814(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method3814(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method3814(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method3814(var93 + var103 - var50, var104);
                            }
                            var76.method3584(var82, var90 + var103, var107, var35.field2875 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method3814(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method3814(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method3814(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method3814(var97 + var103 - var62, var104);
                                }
                                var77.method3584(var79, var98 + var103, var110, var38.field2875 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("c.aj(IIIIB)V")
    public static final void method86(int arg0, int arg1, int arg2, int arg3) {
        field293 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class46.field901;
        int[] var7 = class46.field903;
        for (int var8 = 0; var8 < field493 + var6; var8++) {
            class28 var9;
            if (var8 < var6) {
                var9 = field408[var7[var8]];
                if (field417 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field326[field328[var8 - var6]];
            }
            method1755(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method1755(field408[field417], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field293; var10++) {
            int var11 = field287[var10];
            int var12 = field305[var10];
            int var13 = field531[var10];
            int var14 = field459[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field305[var16] - field459[var16] && var12 - var14 < field305[var16] + 2 && var11 - var13 < field531[var16] + field287[var16] && var11 + var13 > field287[var16] - field531[var16] && field305[var16] - field459[var16] < var12) {
                        var12 = field305[var16] - field459[var16];
                        var15 = true;
                    }
                }
            }
            field393 = field287[var10];
            field394 = field305[var10] = var12;
            String var17 = field390[var10];
            if (field447 == 0) {
                int var18 = 16776960;
                if (field387[var10] < 6) {
                    var18 = field381[field387[var10]];
                }
                if (field387[var10] == 6) {
                    var18 = field392 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field387[var10] == 7) {
                    var18 = field392 % 20 < 10 ? 255 : 65535;
                }
                if (field387[var10] == 8) {
                    var18 = field392 % 20 < 10 ? 45056 : 8454016;
                }
                if (field387[var10] == 9) {
                    int var19 = 150 - field415[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field387[var10] == 10) {
                    int var20 = 150 - field415[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field387[var10] == 11) {
                    int var21 = 150 - field415[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field356[var10] == 0) {
                    Statics.field219.method3587(var17, field393 + arg0, field394 + arg1, var18, 0);
                }
                if (field356[var10] == 1) {
                    Statics.field219.method3589(var17, field393 + arg0, field394 + arg1, var18, 0, field392);
                }
                if (field356[var10] == 2) {
                    Statics.field219.method3638(var17, field393 + arg0, field394 + arg1, var18, 0, field392);
                }
                if (field356[var10] == 3) {
                    Statics.field219.method3590(var17, field393 + arg0, field394 + arg1, var18, 0, field392, 150 - field415[var10]);
                }
                if (field356[var10] == 4) {
                    int var22 = (150 - field415[var10]) * (Statics.field219.method3575(var17) + 100) / 150;
                    class220.method3691(field393 + arg0 - 50, arg1, field393 + arg0 + 50, arg1 + arg3);
                    Statics.field219.method3584(var17, field393 + arg0 + 50 - var22, field394 + arg1, var18, 0);
                    class220.method3690(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field356[var10] == 5) {
                    int var23 = 150 - field415[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class220.method3691(arg0, field394 + arg1 - Statics.field219.field3103 - 1, arg0 + arg2, field394 + arg1 + 5);
                    Statics.field219.method3587(var17, field393 + arg0, field394 + arg1 + var24, var18, 0);
                    class220.method3690(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field219.method3587(var17, field393 + arg0, field394 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("ga.aq(B)V")
    public static final void method3157() {
        field543 = 0;
        int var0 = (Statics.field43.field608 >> 7) + Statics.field1735;
        int var1 = (Statics.field43.field605 >> 7) + Statics.field284;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field543 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field543 = 1;
        }
        if (field543 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field543 = 0;
        }
    }

    @ObfuscatedName("p.as(IIIIB)V")
    public static final void method174(int arg0, int arg1, int arg2, int arg3) {
        if (field477 == 1) {
            Statics.field64[field397 / 100].method3814(field501 - 8, field396 - 8);
        }
        if (field477 == 2) {
            Statics.field64[field397 / 100 + 4].method3814(field501 - 8, field396 - 8);
        }
        method3157();
    }

    @ObfuscatedName("gz.ad(Lag;II)V")
    public static final void method3534(class28 arg0, int arg1) {
        method3500(arg0.field608, arg0.field605, arg1);
    }

    @ObfuscatedName("gf.bm(IIII)V")
    public static final void method3500(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field393 = -1;
            field394 = -1;
            return;
        }
        int var3 = method878(arg0, arg1, Statics.field1094) - arg2;
        int var4 = arg0 - Statics.field1759;
        int var5 = var3 - Statics.field2791;
        int var6 = arg1 - Statics.field178;
        int var7 = class85.field1436[Statics.field191];
        int var8 = class85.field1447[Statics.field191];
        int var9 = class85.field1436[Statics.field1079];
        int var10 = class85.field1447[Statics.field1079];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field393 = field570 * var11 / var15 + field549 / 2;
            field394 = field570 * var14 / var15 + field550 / 2;
        } else {
            field393 = -1;
            field394 = -1;
        }
    }

    @ObfuscatedName("as.bd(IIII)I")
    public static final int method878(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class11.field82[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class11.field94[var5][var3][var4] + class11.field94[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class11.field94[var5][var3][var4 + 1] + class11.field94[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("dj.br(IIIIIII)V")
    public static final void method1913(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class85.field1436[var6];
            int var12 = class85.field1447[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class85.field1436[var7];
            int var15 = class85.field1447[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1759 = arg0 - var8;
        Statics.field2791 = arg1 - var9;
        Statics.field178 = arg2 - var10;
        Statics.field191 = arg3;
        Statics.field1079 = arg4;
    }

    @ObfuscatedName("aw.bh(ZI)V")
    public static final void method718(boolean arg0) {
        field349 = arg0;
        if (!field349) {
            int var1 = field333.method2554();
            int var2 = field333.method2554();
            int var3 = field333.method2554();
            Statics.field109 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field109[var4][var5] = field333.method2557();
                }
            }
            Statics.field180 = new int[var3];
            Statics.field207 = new int[var3];
            Statics.field798 = new int[var3];
            Statics.field1090 = new byte[var3][];
            Statics.field693 = new byte[var3][];
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
                        Statics.field180[var7] = var10;
                        Statics.field207[var7] = Statics.field971.method3027("m" + var8 + "_" + var9);
                        Statics.field798[var7] = Statics.field971.method3027("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method3(var2, var1);
            return;
        }
        int var11 = field333.method2554();
        int var12 = field333.method2554();
        int var13 = field333.method2554();
        field333.method2784();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field333.method2801(1);
                    if (var17 == 1) {
                        field448[var14][var15][var16] = field333.method2801(26);
                    } else {
                        field448[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field333.method2807();
        Statics.field109 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field109[var18][var19] = field333.method2557();
            }
        }
        Statics.field180 = new int[var13];
        Statics.field207 = new int[var13];
        Statics.field798 = new int[var13];
        Statics.field1090 = new byte[var13][];
        Statics.field693 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field448[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field180[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field180[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field207[var20] = Statics.field971.method3027("m" + var29 + "_" + var30);
                            Statics.field798[var20] = Statics.field971.method3027("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method3(var11, var12);
    }

    @ObfuscatedName("o.bv(III)V")
    public static final void method3(int arg0, int arg1) {
        if (Statics.field55 == arg0 && Statics.field788 == arg1) {
            return;
        }
        Statics.field55 = arg0;
        Statics.field788 = arg1;
        method191(25);
        Statics.method1778(class174.field2371, true);
        int var2 = Statics.field1735;
        int var3 = Statics.field284;
        Statics.field1735 = (arg0 - 6) * 8;
        Statics.field284 = (arg1 - 6) * 8;
        int var4 = Statics.field1735 - var2;
        int var5 = Statics.field284 - var3;
        int var6 = Statics.field1735;
        int var7 = Statics.field284;
        for (int var8 = 0; var8 < 32768; var8++) {
            class36 var9 = field326[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field660[var10] -= var4;
                    var9.field661[var10] -= var5;
                }
                var9.field608 -= var4 * 128;
                var9.field605 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class24 var12 = field408[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field660[var13] -= var4;
                    var12.field661[var13] -= var5;
                }
                var12.field608 -= var4 * 128;
                var12.field605 -= var5 * 128;
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
        for (class26 var25 = (class26) field301.method2201(); var25 != null; var25 = (class26) field301.method2203()) {
            var25.field585 -= var4;
            var25.field574 -= var5;
            if (var25.field585 < 0 || var25.field574 < 0 || var25.field585 >= 104 || var25.field574 >= 104) {
                var25.method2189();
            }
        }
        if (field519 != 0) {
            field519 -= var4;
            field490 -= var5;
        }
        field527 = 0;
        field555 = false;
        field514 = -1;
        field512.method2200();
        field420.method2200();
        for (int var26 = 0; var26 < 4; var26++) {
            field348[var26].method2054();
        }
    }

    @ObfuscatedName("bq.bf(ZB)V")
    public static final void method1115(boolean arg0) {
        method3101();
        field337++;
        if (field337 < 50 && !arg0) {
            return;
        }
        field337 = 0;
        if (field342 || Statics.field47 == null) {
            return;
        }
        field331.method2782(78);
        try {
            Statics.field47.method1904(field331.field2108, 0, field331.field2105);
            field331.field2105 = 0;
        } catch (IOException var2) {
            field342 = true;
        }
    }

    @ObfuscatedName("i.bu(I)V")
    public static final void method177() {
        method1115(false);
        field517 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1090.length; var1++) {
            if (Statics.field207[var1] != -1 && Statics.field1090[var1] == null) {
                Statics.field1090[var1] = Statics.field971.method3012(Statics.field207[var1], 0);
                if (Statics.field1090[var1] == null) {
                    var0 = false;
                    field517++;
                }
            }
            if (Statics.field798[var1] != -1 && Statics.field693[var1] == null) {
                Statics.field693[var1] = Statics.field971.method3088(Statics.field798[var1], 0, Statics.field109[var1]);
                if (Statics.field693[var1] == null) {
                    var0 = false;
                    field517++;
                }
            }
        }
        if (!var0) {
            field347 = 1;
            return;
        }
        field345 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1090.length; var3++) {
            byte[] var4 = Statics.field693[var3];
            if (var4 != null) {
                int var5 = (Statics.field180[var3] >> 8) * 64 - Statics.field1735;
                int var6 = (Statics.field180[var3] & 0xFF) * 64 - Statics.field284;
                if (field349) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class154 var9 = new class154(var4);
                int var10 = -1;
                label514: while (true) {
                    int var11 = var9.method2668();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2668();
                            if (var16 == 0) {
                                continue label514;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2552() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class198 var22 = class198.method2463(var10);
                                if (var19 != 22 || !field315 || var22.field2910 != 0 || var22.field2908 == 1 || var22.field2929) {
                                    if (!var22.method3318()) {
                                        field345++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2668();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2552();
                    }
                }
            }
        }
        if (!var2) {
            field347 = 2;
            return;
        }
        if (field347 != 0) {
            Statics.method1778(class174.field2371 + class38.field795 + class38.field792 + 100 + "%" + class38.field793, true);
        }
        method3101();
        method34();
        method3101();
        Statics.field2137.method1590();
        method3101();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field348[var23].method2054();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class11.field82[var24][var25][var26] = 0;
                }
            }
        }
        method3101();
        class11.field95 = 99;
        Statics.field84 = new byte[4][104][104];
        Statics.field3073 = new byte[4][104][104];
        Statics.field2738 = new byte[4][104][104];
        Statics.field83 = new byte[4][104][104];
        Statics.field1597 = new int[4][105][105];
        Statics.field81 = new byte[4][105][105];
        Statics.field87 = new int[105][105];
        Statics.field2033 = new int[104];
        Statics.field105 = new int[104];
        Statics.field89 = new int[104];
        Statics.field85 = new int[104];
        Statics.field91 = new int[104];
        int var27 = Statics.field1090.length;
        for (class32 var28 = (class32) class32.field724.method2201(); var28 != null; var28 = (class32) class32.field724.method2203()) {
            if (var28.field717 != null) {
                Statics.field1555.method905(var28.field717);
                var28.field717 = null;
            }
            if (var28.field715 != null) {
                Statics.field1555.method905(var28.field715);
                var28.field715 = null;
            }
        }
        class32.field724.method2200();
        method1115(true);
        if (!field349) {
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = (Statics.field180[var29] >> 8) * 64 - Statics.field1735;
                int var31 = (Statics.field180[var29] & 0xFF) * 64 - Statics.field284;
                byte[] var32 = Statics.field1090[var29];
                if (var32 != null) {
                    method3101();
                    class11.method185(var32, var30, var31, Statics.field55 * 8 - 48, Statics.field788 * 8 - 48, field348);
                }
            }
            for (int var33 = 0; var33 < var27; var33++) {
                int var34 = (Statics.field180[var33] >> 8) * 64 - Statics.field1735;
                int var35 = (Statics.field180[var33] & 0xFF) * 64 - Statics.field284;
                byte[] var36 = Statics.field1090[var33];
                if (var36 == null && Statics.field788 < 800) {
                    method3101();
                    class11.method667(var34, var35, 64, 64);
                }
            }
            method1115(true);
            for (int var37 = 0; var37 < var27; var37++) {
                byte[] var38 = Statics.field693[var37];
                if (var38 != null) {
                    int var39 = (Statics.field180[var37] >> 8) * 64 - Statics.field1735;
                    int var40 = (Statics.field180[var37] & 0xFF) * 64 - Statics.field284;
                    method3101();
                    class11.method169(var38, var39, var40, Statics.field2137, field348);
                }
            }
        }
        if (field349) {
            for (int var41 = 0; var41 < 4; var41++) {
                method3101();
                for (int var42 = 0; var42 < 13; var42++) {
                    for (int var43 = 0; var43 < 13; var43++) {
                        boolean var44 = false;
                        int var45 = field448[var41][var42][var43];
                        if (var45 != -1) {
                            int var46 = var45 >> 24 & 0x3;
                            int var47 = var45 >> 1 & 0x3;
                            int var48 = var45 >> 14 & 0x3FF;
                            int var49 = var45 >> 3 & 0x7FF;
                            int var50 = (var48 / 8 << 8) + var49 / 8;
                            for (int var51 = 0; var51 < Statics.field180.length; var51++) {
                                if (Statics.field180[var51] == var50 && Statics.field1090[var51] != null) {
                                    class11.method1752(Statics.field1090[var51], var41, var42 * 8, var43 * 8, var46, (var48 & 0x7) * 8, (var49 & 0x7) * 8, var47, field348);
                                    var44 = true;
                                    break;
                                }
                            }
                        }
                        if (!var44) {
                            int var52 = var41;
                            int var53 = var42 * 8;
                            int var54 = var43 * 8;
                            for (int var55 = 0; var55 < 8; var55++) {
                                for (int var56 = 0; var56 < 8; var56++) {
                                    class11.field94[var52][var53 + var55][var54 + var56] = 0;
                                }
                            }
                            if (var53 > 0) {
                                for (int var57 = 1; var57 < 8; var57++) {
                                    class11.field94[var52][var53][var54 + var57] = class11.field94[var52][var53 - 1][var54 + var57];
                                }
                            }
                            if (var54 > 0) {
                                for (int var58 = 1; var58 < 8; var58++) {
                                    class11.field94[var52][var53 + var58][var54] = class11.field94[var52][var53 + var58][var54 - 1];
                                }
                            }
                            if (var53 > 0 && class11.field94[var52][var53 - 1][var54] != 0) {
                                class11.field94[var52][var53][var54] = class11.field94[var52][var53 - 1][var54];
                            } else if (var54 > 0 && class11.field94[var52][var53][var54 - 1] != 0) {
                                class11.field94[var52][var53][var54] = class11.field94[var52][var53][var54 - 1];
                            } else if (var53 > 0 && var54 > 0 && class11.field94[var52][var53 - 1][var54 - 1] != 0) {
                                class11.field94[var52][var53][var54] = class11.field94[var52][var53 - 1][var54 - 1];
                            }
                        }
                    }
                }
            }
            for (int var59 = 0; var59 < 13; var59++) {
                for (int var60 = 0; var60 < 13; var60++) {
                    int var61 = field448[0][var59][var60];
                    if (var61 == -1) {
                        class11.method667(var59 * 8, var60 * 8, 8, 8);
                    }
                }
            }
            method1115(true);
            for (int var62 = 0; var62 < 4; var62++) {
                method3101();
                for (int var63 = 0; var63 < 13; var63++) {
                    label349: for (int var64 = 0; var64 < 13; var64++) {
                        int var65 = field448[var62][var63][var64];
                        if (var65 != -1) {
                            int var66 = var65 >> 24 & 0x3;
                            int var67 = var65 >> 1 & 0x3;
                            int var68 = var65 >> 14 & 0x3FF;
                            int var69 = var65 >> 3 & 0x7FF;
                            int var70 = (var68 / 8 << 8) + var69 / 8;
                            for (int var71 = 0; var71 < Statics.field180.length; var71++) {
                                if (Statics.field180[var71] == var70 && Statics.field693[var71] != null) {
                                    byte[] var72 = Statics.field693[var71];
                                    int var73 = var63 * 8;
                                    int var74 = var64 * 8;
                                    int var75 = (var68 & 0x7) * 8;
                                    int var76 = (var69 & 0x7) * 8;
                                    class88 var77 = Statics.field2137;
                                    class118[] var78 = field348;
                                    class154 var79 = new class154(var72);
                                    int var80 = -1;
                                    while (true) {
                                        int var81 = var79.method2668();
                                        if (var81 == 0) {
                                            continue label349;
                                        }
                                        var80 += var81;
                                        int var82 = 0;
                                        while (true) {
                                            int var83 = var79.method2668();
                                            if (var83 == 0) {
                                                break;
                                            }
                                            var82 += var83 - 1;
                                            int var84 = var82 & 0x3F;
                                            int var85 = var82 >> 6 & 0x3F;
                                            int var86 = var82 >> 12;
                                            int var87 = var79.method2552();
                                            int var88 = var87 >> 2;
                                            int var89 = var87 & 0x3;
                                            if (var66 == var86 && var85 >= var75 && var85 < var75 + 8 && var84 >= var76 && var84 < var76 + 8) {
                                                class198 var90 = class198.method2463(var80);
                                                int var91 = var73 + class169.method28(var85 & 0x7, var84 & 0x7, var67, var90.field2906, var90.field2939, var89);
                                                int var93 = var85 & 0x7;
                                                int var94 = var84 & 0x7;
                                                int var96 = var90.field2906;
                                                int var97 = var90.field2939;
                                                if ((var89 & 0x1) == 1) {
                                                    int var98 = var96;
                                                    var96 = var97;
                                                    var97 = var98;
                                                }
                                                int var99 = var67 & 0x3;
                                                int var100;
                                                if (var99 == 0) {
                                                    var100 = var94;
                                                } else if (var99 == 1) {
                                                    var100 = 7 - var93 - (var96 - 1);
                                                } else if (var99 == 2) {
                                                    var100 = 7 - var94 - (var97 - 1);
                                                } else {
                                                    var100 = var93;
                                                }
                                                int var101 = var74 + var100;
                                                if (var91 > 0 && var101 > 0 && var91 < 103 && var101 < 103) {
                                                    int var102 = var62;
                                                    if ((class11.field82[1][var91][var101] & 0x2) == 2) {
                                                        var102 = var62 - 1;
                                                    }
                                                    class118 var103 = null;
                                                    if (var102 >= 0) {
                                                        var103 = var78[var102];
                                                    }
                                                    class11.method3264(var62, var91, var101, var80, var67 + var89 & 0x3, var88, var77, var103);
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
        method1115(true);
        method34();
        method3101();
        class11.method805(Statics.field2137, field348);
        method1115(true);
        int var104 = class11.field95;
        if (var104 > Statics.field1094) {
            var104 = Statics.field1094;
        }
        if (var104 < Statics.field1094 - 1) {
            int var105 = Statics.field1094 - 1;
        }
        if (field315) {
            Statics.field2137.method1749(class11.field95);
        } else {
            Statics.field2137.method1749(0);
        }
        for (int var106 = 0; var106 < 104; var106++) {
            for (int var107 = 0; var107 < 104; var107++) {
                method2823(var106, var107);
            }
        }
        method3101();
        method2497();
        class198.field2913.method2139();
        if (Statics.field1778 != null) {
            field331.method2782(215);
            field331.method2540(1057001181);
        }
        if (!field349) {
            int var108 = (Statics.field55 - 6) / 8;
            int var109 = (Statics.field55 + 6) / 8;
            int var110 = (Statics.field788 - 6) / 8;
            int var111 = (Statics.field788 + 6) / 8;
            for (int var112 = var108 - 1; var112 <= var109 + 1; var112++) {
                for (int var113 = var110 - 1; var113 <= var111 + 1; var113++) {
                    if (var112 < var108 || var112 > var109 || var113 < var110 || var113 > var111) {
                        Statics.field971.method3032("m" + var112 + "_" + var113);
                        Statics.field971.method3032("l" + var112 + "_" + var113);
                    }
                }
            }
        }
        method191(30);
        method3101();
        Statics.field84 = (byte[][][]) null;
        Statics.field3073 = (byte[][][]) null;
        Statics.field2738 = (byte[][][]) null;
        Statics.field83 = (byte[][][]) null;
        Statics.field1597 = (int[][][]) null;
        Statics.field81 = (byte[][][]) null;
        Statics.field87 = (int[][]) null;
        Statics.field2033 = null;
        Statics.field105 = null;
        Statics.field89 = null;
        Statics.field85 = null;
        Statics.field91 = null;
        field331.method2782(187);
        Statics.field78.method1787();
        for (int var114 = 0; var114 < 32; var114++) {
            field1792[var114] = 0L;
        }
        for (int var115 = 0; var115 < 32; var115++) {
            field1787[var115] = 0L;
        }
        Statics.field185 = 0;
    }

    @ObfuscatedName("gb.bp(IB)V")
    public static final void method3194(int arg0) {
        int[] var1 = Statics.field2119.field3211;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class11.field82[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field2137.method1624(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class11.field82[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field2137.method1624(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field2119.method3806();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class11.field82[arg0][var10][var9] & 0x18) == 0) {
                    Statics.method123(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class11.field82[arg0 + 1][var10][var9] & 0x8) != 0) {
                    Statics.method123(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field378 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field2137.method1727(Statics.field1094, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class198.method2463(var14).field2936;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field348[Statics.field1094].field1851;
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
                        field518[field378] = Statics.field165[var15];
                        field424[field378] = var16;
                        field475[field378] = var17;
                        field378++;
                    }
                }
            }
        }
        Statics.field1210.method3769();
    }

    @ObfuscatedName("de.bo(I)Z")
    public static final boolean method1924() {
        if (Statics.field47 == null) {
            return false;
        }
        try {
            int var0 = Statics.field47.method1902();
            if (var0 == 0) {
                return false;
            }
            if (field335 == -1) {
                Statics.field47.method1903(field333.field2108, 0, 1);
                field333.field2105 = 0;
                field335 = field333.method2783();
                field524 = class213.field3127[field335];
                var0--;
            }
            if (field524 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field47.method1903(field333.field2108, 0, 1);
                field524 = field333.field2108[0] & 0xFF;
                var0--;
            }
            if (field524 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field47.method1903(field333.field2108, 0, 2);
                field333.field2105 = 0;
                field524 = field333.method2554();
                var0 -= 2;
            }
            if (var0 < field524) {
                return false;
            }
            field333.field2105 = 0;
            Statics.field47.method1903(field333.field2108, 0, field524);
            field336 = 0;
            field340 = field411;
            field411 = field338;
            field338 = field335;
            if (field335 == 72) {
                field333.field2105 += 28;
                if (field333.method2598()) {
                    class105.method673(field333, field333.field2105 - 28);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 219) {
                int var1 = field333.method2596();
                int var2 = field333.method2546();
                int var3 = field333.method2718();
                class18 var4 = (class18) field419.method2151((long) var2);
                if (var4 != null) {
                    method768(var4, var4.field184 != var1);
                }
                method165(var2, var1, var3);
                field335 = -1;
                return true;
            }
            if (field335 == 136) {
                int var5 = field524 + field333.field2105;
                int var6 = field333.method2554();
                int var7 = field333.method2554();
                if (field445 != var6) {
                    field445 = var6;
                    method1926(false);
                    method195(field445);
                    class33.method208(field445);
                    for (int var8 = 0; var8 < 100; var8++) {
                        field309[var8] = true;
                    }
                }
                while (var7-- > 0) {
                    int var9 = field333.method2557();
                    int var10 = field333.method2554();
                    int var11 = field333.method2552();
                    class18 var12 = (class18) field419.method2151((long) var9);
                    if (var12 != null && var12.field184 != var10) {
                        method768(var12, true);
                        var12 = null;
                    }
                    if (var12 == null) {
                        var12 = method165(var9, var10, var11);
                    }
                    var12.field182 = true;
                }
                for (class18 var13 = (class18) field419.method2148(); var13 != null; var13 = (class18) field419.method2152()) {
                    if (var13.field182) {
                        var13.field182 = false;
                    } else {
                        method768(var13, true);
                    }
                }
                field487 = new class126(512);
                while (field333.field2105 < var5) {
                    int var14 = field333.method2557();
                    int var15 = field333.method2554();
                    int var16 = field333.method2554();
                    int var17 = field333.method2557();
                    for (int var18 = var15; var18 <= var16; var18++) {
                        long var19 = ((long) var14 << 32) + (long) var18;
                        field487.method2143(new class134(var17), var19);
                    }
                }
                field335 = -1;
                return true;
            }
            if (field335 == 33) {
                int var21 = field333.method2596();
                int var22 = field333.method2681();
                class170 var23 = class170.method2993(var22);
                if (var23.field2251 != 1 || var23.field2204 != var21) {
                    var23.field2251 = 1;
                    var23.field2204 = var21;
                    method1786(var23);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 147) {
                String var24 = field333.method2606();
                long var25 = field333.method2558();
                long var27 = (long) field333.method2554();
                long var29 = (long) field333.method2556();
                class178[] var31 = new class178[] { class178.field2673, class178.field2674, class178.field2670, class178.field2672, class178.field2677, class178.field2669 };
                class178 var32 = (class178) class149.method1314(var31, field333.method2552());
                long var33 = (var27 << 32) + var29;
                boolean var35 = false;
                for (int var36 = 0; var36 < 100; var36++) {
                    if (field542[var36] == var33) {
                        var35 = true;
                        break;
                    }
                }
                if (var32.field2678 && method151(var24)) {
                    var35 = true;
                }
                if (!var35 && field543 == 0) {
                    field542[field507] = var33;
                    field507 = (field507 + 1) % 100;
                    class160 var37 = field333;
                    String var38 = class211.method2012(var37, 32767);
                    String var39 = class210.method3583(class208.method2973(var38));
                    if (var32.field2676 == -1) {
                        class48.method2090(9, var24, var39, class206.method2269(var25));
                    } else {
                        class48.method2090(9, class38.method167(var32.field2676) + var24, var39, class206.method2269(var25));
                    }
                }
                field335 = -1;
                return true;
            }
            if (field335 == 139) {
                while (field333.field2105 < field524) {
                    boolean var40 = field333.method2552() == 1;
                    String var41 = field333.method2606();
                    String var42 = field333.method2606();
                    int var43 = field333.method2554();
                    int var44 = field333.method2552();
                    int var45 = field333.method2552();
                    boolean var46 = (var45 & 0x2) != 0;
                    boolean var47 = (var45 & 0x1) != 0;
                    if (var43 > 0) {
                        field333.method2606();
                        field333.method2552();
                        field333.method2557();
                    }
                    field333.method2606();
                    for (int var48 = 0; var48 < field552; var48++) {
                        class15 var49 = field554[var48];
                        if (var40) {
                            if (var42.equals(var49.field158)) {
                                var49.field158 = var41;
                                var49.field151 = var42;
                                var41 = null;
                                break;
                            }
                        } else if (var41.equals(var49.field158)) {
                            if (var49.field154 != var43) {
                                boolean var50 = true;
                                for (class17 var51 = (class17) field479.method2235(); var51 != null; var51 = (class17) field479.method2236()) {
                                    if (var51.field175.equals(var41)) {
                                        if (var43 != 0 && var51.field177 == 0) {
                                            var51.method2247();
                                            var50 = false;
                                        } else if (var43 == 0 && var51.field177 != 0) {
                                            var51.method2247();
                                            var50 = false;
                                        }
                                    }
                                }
                                if (var50) {
                                    field479.method2239(new class17(var41, var43));
                                }
                                var49.field154 = var43;
                            }
                            var49.field151 = var42;
                            var49.field153 = var44;
                            var49.field160 = var46;
                            var49.field155 = var47;
                            var41 = null;
                            break;
                        }
                    }
                    if (var41 != null && field552 < 400) {
                        class15 var52 = new class15();
                        field554[field552] = var52;
                        var52.field158 = var41;
                        var52.field151 = var42;
                        var52.field154 = var43;
                        var52.field153 = var44;
                        var52.field160 = var46;
                        var52.field155 = var47;
                        field552++;
                    }
                }
                field313 = 2;
                field478 = field470;
                boolean var53 = false;
                int var54 = field552;
                while (var54 > 0) {
                    boolean var55 = true;
                    var54--;
                    for (int var56 = 0; var56 < var54; var56++) {
                        boolean var57 = false;
                        class15 var58 = field554[var56];
                        class15 var59 = field554[var56 + 1];
                        if (field290 != var58.field154 && field290 == var59.field154) {
                            var57 = true;
                        }
                        if (!var57 && var58.field154 == 0 && var59.field154 != 0) {
                            var57 = true;
                        }
                        if (!var57 && !var58.field160 && var59.field160) {
                            var57 = true;
                        }
                        if (!var57 && !var58.field155 && var59.field155) {
                            var57 = true;
                        }
                        if (var57) {
                            class15 var60 = field554[var56];
                            field554[var56] = field554[var56 + 1];
                            field554[var56 + 1] = var60;
                            var55 = false;
                        }
                    }
                    if (var55) {
                        break;
                    }
                }
                field335 = -1;
                return true;
            }
            if (field335 == 73) {
                method189();
                int var61 = field333.method2579();
                int var62 = field333.method2579();
                int var63 = field333.method2546();
                field402[var62] = var63;
                field422[var62] = var61;
                field443[var62] = 1;
                for (int var64 = 0; var64 < 98; var64++) {
                    if (var63 >= class173.field2356[var64]) {
                        field443[var62] = var64 + 2;
                    }
                }
                field327[++field558 - 1 & 0x1F] = var62;
                field335 = -1;
                return true;
            }
            if (field335 == 108) {
                int var65 = field333.method2552();
                if (field333.method2552() == 0) {
                    field533[var65] = new class5();
                    field333.field2105 += 18;
                } else {
                    field333.field2105--;
                    field533[var65] = new class5(field333, false);
                }
                field467 = field470;
                field335 = -1;
                return true;
            }
            if (field335 == 15) {
                int var66 = field333.method2579();
                int var67 = field333.method2718();
                String var68 = field333.method2606();
                if (var66 >= 1 && var66 <= 8) {
                    if (var68.equalsIgnoreCase("null")) {
                        var68 = null;
                    }
                    field414[var66 - 1] = var68;
                    field374[var66 - 1] = var67 == 0;
                }
                field335 = -1;
                return true;
            }
            if (field335 == 154) {
                int var69 = field333.method2554();
                if (var69 == 65535) {
                    var69 = -1;
                }
                method2010(var69);
                field335 = -1;
                return true;
            }
            if (field335 == 101) {
                int var70 = field333.method2592();
                int var71 = field333.method2554();
                if (var71 == 65535) {
                    var71 = -1;
                }
                if (field522 != 0 && var71 != -1) {
                    class139.method1761(Statics.field161, var71, 0, field522, false);
                    field494 = true;
                }
                field335 = -1;
                return true;
            }
            if (field335 == 241) {
                String var72 = field333.method2606();
                Object[] var73 = new Object[var72.length() + 1];
                for (int var74 = var72.length() - 1; var74 >= 0; var74--) {
                    if (var72.charAt(var74) == 's') {
                        var73[var74 + 1] = field333.method2606();
                    } else {
                        var73[var74 + 1] = Integer.valueOf(field333.method2557());
                    }
                }
                var73[0] = Integer.valueOf(field333.method2557());
                class19 var75 = new class19();
                var75.field204 = var73;
                class33.method166(var75);
                field335 = -1;
                return true;
            }
            if (field335 == 168) {
                String var76 = field333.method2606();
                long var77 = (long) field333.method2554();
                long var79 = (long) field333.method2556();
                class178[] var81 = new class178[] { class178.field2673, class178.field2674, class178.field2670, class178.field2672, class178.field2677, class178.field2669 };
                class178 var82 = (class178) class149.method1314(var81, field333.method2552());
                long var83 = (var77 << 32) + var79;
                boolean var85 = false;
                for (int var86 = 0; var86 < 100; var86++) {
                    if (field542[var86] == var83) {
                        var85 = true;
                        break;
                    }
                }
                if (method151(var76)) {
                    var85 = true;
                }
                if (!var85 && field543 == 0) {
                    field542[field507] = var83;
                    field507 = (field507 + 1) % 100;
                    class160 var87 = field333;
                    String var88 = class211.method2012(var87, 32767);
                    String var89 = class210.method3583(class208.method2973(var88));
                    byte var90;
                    if (var82.field2681) {
                        var90 = 7;
                    } else {
                        var90 = 3;
                    }
                    if (var82.field2676 == -1) {
                        class48.method184(var90, var76, var89);
                    } else {
                        class48.method184(var90, class38.method167(var82.field2676) + var76, var89);
                    }
                }
                field335 = -1;
                return true;
            }
            if (field335 == 37) {
                int var91 = field333.method2596();
                class13 var92 = (class13) class13.field119.method2151((long) var91);
                if (var92 != null) {
                    var92.method2189();
                }
                field473[++field474 - 1 & 0x1F] = var91 & 0x7FFF;
                field335 = -1;
                return true;
            }
            if (field335 == 51) {
                method93(false);
                field335 = -1;
                return true;
            }
            if (field335 == 23) {
                int var93 = field333.method2577();
                int var94 = field333.method2681();
                class170 var95 = class170.method2993(var94);
                if (var95 != null && var95.field2210 == 0) {
                    if (var93 > var95.field2203 - var95.field2224) {
                        var93 = var95.field2203 - var95.field2224;
                    }
                    if (var93 < 0) {
                        var93 = 0;
                    }
                    if (var95.field2230 != var93) {
                        var95.field2230 = var93;
                        method1786(var95);
                    }
                }
                field335 = -1;
                return true;
            }
            if (field335 == 87) {
                for (int var96 = 0; var96 < field408.length; var96++) {
                    if (field408[var96] != null) {
                        field408[var96].field637 = -1;
                    }
                }
                for (int var97 = 0; var97 < field326.length; var97++) {
                    if (field326[var97] != null) {
                        field326[var97].field637 = -1;
                    }
                }
                field335 = -1;
                return true;
            }
            if (field335 == 233) {
                field306 = field333.method2554() * 30;
                field482 = field470;
                field335 = -1;
                return true;
            }
            if (field335 == 244) {
                field353 = field333.method2552();
                field504 = field333.method2552();
                field335 = -1;
                return true;
            }
            if (field335 == 218) {
                int var98 = field333.method2552();
                class217[] var99 = class217.method3532();
                int var100 = 0;
                class217 var102;
                while (true) {
                    if (var100 >= var99.length) {
                        var102 = null;
                        break;
                    }
                    class217 var101 = var99[var100];
                    if (var101.field3165 == var98) {
                        var102 = var101;
                        break;
                    }
                    var100++;
                }
                Statics.field223 = var102;
                field335 = -1;
                return true;
            }
            if (field335 == 120) {
                int var103 = field333.method2681();
                int var104 = field333.method2696();
                if (var104 == 65535) {
                    var104 = -1;
                }
                int var105 = field333.method2557();
                int var106 = field333.method2596();
                if (var106 == 65535) {
                    var106 = -1;
                }
                for (int var107 = var106; var107 <= var104; var107++) {
                    long var108 = ((long) var105 << 32) + (long) var107;
                    class128 var110 = field487.method2151(var108);
                    if (var110 != null) {
                        var110.method2189();
                    }
                    field487.method2143(new class134(var103), var108);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 74) {
                while (field333.field2105 < field524) {
                    int var111 = field333.method2552();
                    boolean var112 = (var111 & 0x1) == 1;
                    String var113 = field333.method2606();
                    String var114 = field333.method2606();
                    field333.method2606();
                    for (int var115 = 0; var115 < field556; var115++) {
                        class20 var116 = field551[var115];
                        if (var112) {
                            if (var114.equals(var116.field208)) {
                                var116.field208 = var113;
                                var116.field218 = var114;
                                var113 = null;
                                break;
                            }
                        } else if (var113.equals(var116.field208)) {
                            var116.field208 = var113;
                            var116.field218 = var114;
                            var113 = null;
                            break;
                        }
                    }
                    if (var113 != null && field556 < 400) {
                        class20 var117 = new class20();
                        field551[field556] = var117;
                        var117.field208 = var113;
                        var117.field218 = var114;
                        field556++;
                    }
                }
                field478 = field470;
                field335 = -1;
                return true;
            }
            if (field335 == 193) {
                int var118 = field333.method2596();
                int var119 = field333.method2681();
                class166.field2173[var118] = var119;
                if (class166.field2174[var118] != var119) {
                    class166.field2174[var118] = var119;
                }
                method144(var118);
                field471[++field472 - 1 & 0x1F] = var118;
                field335 = -1;
                return true;
            }
            if (field335 == 215) {
                field307 = field333.method2552();
                if (field307 == 1) {
                    field308 = field333.method2554();
                }
                if (field307 >= 2 && field307 <= 6) {
                    if (field307 == 2) {
                        field431 = 64;
                        field314 = 64;
                    }
                    if (field307 == 3) {
                        field431 = 0;
                        field314 = 64;
                    }
                    if (field307 == 4) {
                        field431 = 128;
                        field314 = 64;
                    }
                    if (field307 == 5) {
                        field431 = 64;
                        field314 = 0;
                    }
                    if (field307 == 6) {
                        field431 = 64;
                        field314 = 128;
                    }
                    field307 = 2;
                    field334 = field333.method2554();
                    field365 = field333.method2554();
                    field312 = field333.method2552();
                }
                if (field307 == 10) {
                    field358 = field333.method2554();
                }
                field335 = -1;
                return true;
            }
            if (field335 == 251) {
                int var120 = field333.method2552();
                int var121 = field333.method2552();
                int var122 = field333.method2552();
                int var123 = field333.method2552();
                field534[var120] = true;
                field535[var120] = var121;
                field536[var120] = var122;
                field368[var120] = var123;
                field538[var120] = 0;
                field335 = -1;
                return true;
            }
            if (field335 == 83) {
                int var124 = field333.method2557();
                int var125 = field333.method2681();
                int var126 = field333.method2577();
                if (var126 == 65535) {
                    var126 = -1;
                }
                class170 var127 = class170.method2993(var125);
                if (var127.field2205) {
                    var127.field2328 = var126;
                    var127.field2265 = var124;
                    class199 var129 = class199.method2268(var126);
                    var127.field2259 = var129.field2974;
                    var127.field2260 = var129.field2978;
                    var127.field2266 = var129.field2943;
                    var127.field2292 = var129.field2959;
                    var127.field2258 = var129.field2960;
                    var127.field2262 = var129.field2955;
                    if (var129.field2961 == 1) {
                        var127.field2212 = 1;
                    } else {
                        var127.field2212 = 2;
                    }
                    if (var127.field2253 > 0) {
                        var127.field2262 = var127.field2262 * 32 / var127.field2253;
                    } else if (var127.field2219 > 0) {
                        var127.field2262 = var127.field2262 * 32 / var127.field2219;
                    }
                    method1786(var127);
                } else if (var126 == -1) {
                    var127.field2251 = 0;
                    field335 = -1;
                    return true;
                } else {
                    class199 var128 = class199.method2268(var126);
                    var127.field2251 = 4;
                    var127.field2204 = var126;
                    var127.field2259 = var128.field2974;
                    var127.field2260 = var128.field2978;
                    var127.field2262 = var128.field2955 * 100 / var124;
                    method1786(var127);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 115) {
                int var130 = field333.method2557();
                int var131 = field333.method2554();
                if (var130 < -70000) {
                    var131 += 32768;
                }
                class170 var132;
                if (var130 >= 0) {
                    var132 = class170.method2993(var130);
                } else {
                    var132 = null;
                }
                while (field333.field2105 < field524) {
                    int var133 = field333.method2668();
                    int var134 = field333.method2554();
                    int var135 = 0;
                    if (var134 != 0) {
                        var135 = field333.method2552();
                        if (var135 == 255) {
                            var135 = field333.method2557();
                        }
                    }
                    if (var132 != null && var133 >= 0 && var133 < var132.field2326.length) {
                        var132.field2326[var133] = var134;
                        var132.field2327[var133] = var135;
                    }
                    class13.method736(var131, var133, var134 - 1, var135);
                }
                if (var132 != null) {
                    method1786(var132);
                }
                method189();
                field473[++field474 - 1 & 0x1F] = var131 & 0x7FFF;
                field335 = -1;
                return true;
            }
            if (field335 == 89) {
                int var136 = field333.method2697();
                int var137 = field333.method2557();
                class18 var138 = (class18) field419.method2151((long) var137);
                class18 var139 = (class18) field419.method2151((long) var136);
                if (var139 != null) {
                    method768(var139, var138 == null || var138.field184 != var139.field184);
                }
                if (var138 != null) {
                    var138.method2189();
                    field419.method2143(var138, (long) var136);
                }
                class170 var140 = class170.method2993(var137);
                if (var140 != null) {
                    method1786(var140);
                }
                class170 var141 = class170.method2993(var136);
                if (var141 != null) {
                    method1786(var141);
                    method1754(Statics.field2257[var141.field2208 >>> 16], var141, true);
                }
                if (field445 != -1) {
                    method46(field445, 1);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 40) {
                String var142 = field333.method2606();
                Statics.field1777 = var142;
                try {
                    String var143 = Statics.field541.getParameter(class215.field3156.field3158);
                    String var144 = Statics.field541.getParameter(class215.field3157.field3158);
                    String var145 = var143 + "settings=" + var142 + "; version=1; path=/; domain=" + var144;
                    String var146;
                    if (var142.length() == 0) {
                        var146 = var145 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var146 = var145 + "; Expires=" + class163.method724(class156.method2009() + 94608000000L) + "; Max-Age=" + 94608000L;
                    }
                    client var147 = Statics.field541;
                    String var148 = "document.cookie=\"" + var146 + "\"";
                    JSObject.getWindow(var147).eval(var148);
                } catch (Throwable var275) {
                }
                field335 = -1;
                return true;
            }
            if (field335 == 58) {
                method718(true);
                field333.method2783();
                int var150 = field333.method2554();
                class46.method712(field333, var150);
                field335 = -1;
                return true;
            }
            if (field335 == 143) {
                int var151 = field333.method2546();
                class170 var152 = class170.method2993(var151);
                for (int var153 = 0; var153 < var152.field2326.length; var153++) {
                    var152.field2326[var153] = -1;
                    var152.field2326[var153] = 0;
                }
                method1786(var152);
                field335 = -1;
                return true;
            }
            if (field335 == 63) {
                Statics.field183 = field333.method2552();
                Statics.field1634 = field333.method2579();
                while (field333.field2105 < field524) {
                    field335 = field333.method2552();
                    method181();
                }
                field335 = -1;
                return true;
            }
            if (field335 == 69) {
                class30 var154 = new class30();
                var154.field688 = field333.method2606();
                var154.field685 = field333.method2554();
                int var155 = field333.method2557();
                var154.field695 = var155;
                method191(45);
                Statics.field47.method1915();
                Statics.field47 = null;
                class42.method1847(var154);
                field335 = -1;
                return false;
            }
            if (field335 == 50) {
                method2994();
                field335 = -1;
                return false;
            }
            if (field335 == 34) {
                field555 = true;
                Statics.field1060 = field333.method2552();
                Statics.field929 = field333.method2552();
                Statics.field902 = field333.method2554();
                Statics.field1198 = field333.method2552();
                Statics.field74 = field333.method2552();
                if (Statics.field74 >= 100) {
                    Statics.field1759 = Statics.field1060 * 128 + 64;
                    Statics.field178 = Statics.field929 * 128 + 64;
                    Statics.field2791 = method878(Statics.field1759, Statics.field178, Statics.field1094) - Statics.field902;
                }
                field335 = -1;
                return true;
            }
            if (field335 == 118) {
                String var156 = field333.method2606();
                class160 var157 = field333;
                String var158 = class211.method2012(var157, 32767);
                String var159 = class210.method3583(class208.method2973(var158));
                class48.method184(6, var156, var159);
                field335 = -1;
                return true;
            }
            if (field335 == 235) {
                int var160 = field333.method2546();
                int var161 = field333.method2577();
                int var162 = field333.method2554();
                int var163 = field333.method2596();
                class170 var164 = class170.method2993(var160);
                if (var164.field2259 != var162 || var164.field2260 != var163 || var164.field2262 != var161) {
                    var164.field2259 = var162;
                    var164.field2260 = var163;
                    var164.field2262 = var161;
                    method1786(var164);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 229) {
                int var165 = field333.method2554();
                int var166 = field333.method2552();
                int var167 = field333.method2554();
                if (field525 != 0 && var166 != 0 && field527 < 50) {
                    field528[field527] = var165;
                    field352[field527] = var166;
                    field530[field527] = var167;
                    field532[field527] = null;
                    field350[field527] = 0;
                    field527++;
                }
                field335 = -1;
                return true;
            }
            if (field335 == 95) {
                int var171 = field333.method2681();
                String var172 = field333.method2606();
                class170 var173 = class170.method2993(var171);
                if (!var172.equals(var173.field2268)) {
                    var173.field2268 = var172;
                    method1786(var173);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 150) {
                field555 = true;
                Statics.field621 = field333.method2552();
                Statics.field1942 = field333.method2552();
                Statics.field888 = field333.method2554();
                Statics.field149 = field333.method2552();
                Statics.field2152 = field333.method2552();
                if (Statics.field2152 >= 100) {
                    int var174 = Statics.field621 * 128 + 64;
                    int var175 = Statics.field1942 * 128 + 64;
                    int var176 = method878(var174, var175, Statics.field1094) - Statics.field888;
                    int var177 = var174 - Statics.field1759;
                    int var178 = var176 - Statics.field2791;
                    int var179 = var175 - Statics.field178;
                    int var180 = (int) Math.sqrt((double) (var177 * var177 + var179 * var179));
                    Statics.field191 = (int) (Math.atan2((double) var178, (double) var180) * 325.949D) & 0x7FF;
                    Statics.field1079 = (int) (Math.atan2((double) var177, (double) var179) * -325.949D) & 0x7FF;
                    if (Statics.field191 < 128) {
                        Statics.field191 = 128;
                    }
                    if (Statics.field191 > 383) {
                        Statics.field191 = 383;
                    }
                }
                field335 = -1;
                return true;
            }
            if (field335 == 214) {
                int var181 = field333.method2697();
                Statics.field679 = Statics.field1347.method1814(var181);
                field335 = -1;
                return true;
            }
            if (field335 == 239) {
                method93(true);
                field335 = -1;
                return true;
            }
            if (field335 == 148) {
                int var182 = field333.method2577();
                int var183 = field333.method2546();
                class170 var184 = class170.method2993(var183);
                if (var184.field2251 != 2 || var184.field2204 != var182) {
                    var184.field2251 = 2;
                    var184.field2204 = var182;
                    method1786(var184);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 32) {
                method189();
                field450 = field333.method2552();
                field482 = field470;
                field335 = -1;
                return true;
            }
            if (field335 == 45) {
                boolean var185 = field333.method2552() == 1;
                int var186 = field333.method2681();
                class170 var187 = class170.method2993(var186);
                if (var187.field2228 != var185) {
                    var187.field2228 = var185;
                    method1786(var187);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 197) {
                boolean var188 = field333.method2552() == 1;
                if (var188) {
                    Statics.field157 = class156.method2009() - field333.method2558();
                    Statics.field1749 = new class2(field333, true);
                } else {
                    Statics.field1749 = null;
                }
                field481 = field470;
                field335 = -1;
                return true;
            }
            if (field335 == 64) {
                int var189 = field333.method2546();
                class170 var190 = class170.method2993(var189);
                var190.field2251 = 3;
                var190.field2204 = Statics.field43.field254.method2876();
                method1786(var190);
                field335 = -1;
                return true;
            }
            if (field335 == 14) {
                int var191 = field333.method2557();
                int var192 = field333.method2554();
                if (var191 < -70000) {
                    var192 += 32768;
                }
                class170 var193;
                if (var191 >= 0) {
                    var193 = class170.method2993(var191);
                } else {
                    var193 = null;
                }
                if (var193 != null) {
                    for (int var194 = 0; var194 < var193.field2326.length; var194++) {
                        var193.field2326[var194] = 0;
                        var193.field2327[var194] = 0;
                    }
                }
                class13.method145(var192);
                int var195 = field333.method2554();
                for (int var196 = 0; var196 < var195; var196++) {
                    int var197 = field333.method2579();
                    if (var197 == 255) {
                        var197 = field333.method2557();
                    }
                    int var198 = field333.method2554();
                    if (var193 != null && var196 < var193.field2326.length) {
                        var193.field2326[var196] = var198;
                        var193.field2327[var196] = var197;
                    }
                    class13.method736(var192, var196, var198 - 1, var197);
                }
                if (var193 != null) {
                    method1786(var193);
                }
                method189();
                field473[++field474 - 1 & 0x1F] = var192 & 0x7FFF;
                field335 = -1;
                return true;
            }
            if (field335 == 123) {
                String var199 = field333.method2606();
                int var200 = field333.method2554();
                byte var201 = field333.method2553();
                boolean var202 = false;
                if (var201 == -128) {
                    var202 = true;
                }
                if (var202) {
                    if (Statics.field2679 == 0) {
                        field335 = -1;
                        return true;
                    }
                    boolean var203 = false;
                    int var204;
                    for (var204 = 0; var204 < Statics.field2679 && (!Statics.field1763[var204].field283.equals(var199) || Statics.field1763[var204].field281 != var200); var204++) {
                    }
                    if (var204 < Statics.field2679) {
                        while (var204 < Statics.field2679 - 1) {
                            Statics.field1763[var204] = Statics.field1763[var204 + 1];
                            var204++;
                        }
                        Statics.field2679--;
                        Statics.field1763[Statics.field2679] = null;
                    }
                } else {
                    field333.method2606();
                    class25 var205 = new class25();
                    var205.field283 = var199;
                    var205.field279 = class205.method2828(var205.field283, Statics.field156);
                    var205.field281 = var200;
                    var205.field280 = var201;
                    int var206;
                    for (var206 = Statics.field2679 - 1; var206 >= 0; var206--) {
                        int var207 = Statics.field1763[var206].field279.compareTo(var205.field279);
                        if (var207 == 0) {
                            Statics.field1763[var206].field281 = var200;
                            Statics.field1763[var206].field280 = var201;
                            if (var199.equals(Statics.field43.field264)) {
                                Statics.field35 = var201;
                            }
                            field339 = field470;
                            field335 = -1;
                            return true;
                        }
                        if (var207 < 0) {
                            break;
                        }
                    }
                    if (Statics.field2679 >= Statics.field1763.length) {
                        field335 = -1;
                        return true;
                    }
                    for (int var208 = Statics.field2679 - 1; var208 > var206; var208--) {
                        Statics.field1763[var208 + 1] = Statics.field1763[var208];
                    }
                    if (Statics.field2679 == 0) {
                        Statics.field1763 = new class25[100];
                    }
                    Statics.field1763[var206 + 1] = var205;
                    Statics.field2679++;
                    if (var199.equals(Statics.field43.field264)) {
                        Statics.field35 = var201;
                    }
                }
                field339 = field470;
                field335 = -1;
                return true;
            }
            if (field335 == 85) {
                class46.method3271();
                for (int var209 = 0; var209 < 2048; var209++) {
                    field408[var209] = null;
                }
                class46.method755(field333);
                field335 = -1;
                return true;
            }
            if (field335 == 68) {
                int var210 = field333.method2697();
                int var211 = field333.method2647();
                class170 var212 = class170.method2993(var210);
                if (var212.field2255 != var211 || var211 == -1) {
                    var212.field2255 = var211;
                    var212.field2330 = 0;
                    var212.field2227 = 0;
                    method1786(var212);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 75) {
                int var213 = field333.method2596();
                field445 = var213;
                method1926(false);
                method195(var213);
                class33.method208(field445);
                for (int var214 = 0; var214 < 100; var214++) {
                    field309[var214] = true;
                }
                field335 = -1;
                return true;
            }
            if (field335 == 77 || field335 == 236 || field335 == 93 || field335 == 209 || field335 == 240 || field335 == 96 || field335 == 195 || field335 == 228 || field335 == 238 || field335 == 105) {
                method181();
                field335 = -1;
                return true;
            }
            if (field335 == 42) {
                int var215 = field333.method2546();
                int var216 = field333.method2696();
                int var217 = var216 >> 10 & 0x1F;
                int var218 = var216 >> 5 & 0x1F;
                int var219 = var216 & 0x1F;
                int var220 = (var219 << 3) + (var217 << 19) + (var218 << 11);
                class170 var221 = class170.method2993(var215);
                if (var221.field2309 != var220) {
                    var221.field2309 = var220;
                    method1786(var221);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 21) {
                field555 = false;
                for (int var222 = 0; var222 < 5; var222++) {
                    field534[var222] = false;
                }
                field335 = -1;
                return true;
            }
            if (field335 == 129) {
                for (int var223 = 0; var223 < Statics.field2058; var223++) {
                    class188 var224 = class188.method3000(var223);
                    if (var224 != null) {
                        class166.field2173[var223] = 0;
                        class166.field2174[var223] = 0;
                    }
                }
                method189();
                field472 += 32;
                field335 = -1;
                return true;
            }
            if (field335 == 127) {
                int var225 = field333.method2668();
                boolean var226 = field333.method2552() == 1;
                String var227 = "";
                boolean var228 = false;
                if (var226) {
                    var227 = field333.method2606();
                    if (method151(var227)) {
                        var228 = true;
                    }
                }
                String var229 = field333.method2606();
                if (!var228) {
                    class48.method184(var225, var227, var229);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 10) {
                field339 = field470;
                if (field524 == 0) {
                    field291 = null;
                    field376 = null;
                    Statics.field2679 = 0;
                    Statics.field1763 = null;
                    field335 = -1;
                    return true;
                }
                field376 = field333.method2606();
                long var230 = field333.method2558();
                field291 = class206.method190(var230);
                Statics.field2178 = field333.method2553();
                int var232 = field333.method2552();
                if (var232 == 255) {
                    field335 = -1;
                    return true;
                }
                Statics.field2679 = var232;
                class25[] var233 = new class25[100];
                for (int var234 = 0; var234 < Statics.field2679; var234++) {
                    var233[var234] = new class25();
                    var233[var234].field283 = field333.method2606();
                    var233[var234].field279 = class205.method2828(var233[var234].field283, Statics.field156);
                    var233[var234].field281 = field333.method2554();
                    var233[var234].field280 = field333.method2553();
                    field333.method2606();
                    if (var233[var234].field283.equals(Statics.field43.field264)) {
                        Statics.field35 = var233[var234].field280;
                    }
                }
                boolean var235 = false;
                int var236 = Statics.field2679;
                while (var236 > 0) {
                    boolean var237 = true;
                    var236--;
                    for (int var238 = 0; var238 < var236; var238++) {
                        if (var233[var238].field279.compareTo(var233[var238 + 1].field279) > 0) {
                            class25 var239 = var233[var238];
                            var233[var238] = var233[var238 + 1];
                            var233[var238 + 1] = var239;
                            var237 = false;
                        }
                    }
                    if (var237) {
                        break;
                    }
                }
                Statics.field1763 = var233;
                field335 = -1;
                return true;
            }
            if (field335 == 4) {
                int var240 = field333.method2555();
                int var241 = field333.method2697();
                int var242 = field333.method2753();
                class170 var243 = class170.method2993(var241);
                if (var243.field2217 != var240 || var243.field2218 != var242 || var243.field2213 != 0 || var243.field2237 != 0) {
                    var243.field2217 = var240;
                    var243.field2218 = var242;
                    var243.field2213 = 0;
                    var243.field2237 = 0;
                    method1786(var243);
                    method95(var243);
                    if (var243.field2210 == 0) {
                        method1754(Statics.field2257[var241 >> 16], var243, false);
                    }
                }
                field335 = -1;
                return true;
            }
            if (field335 == 82) {
                method718(false);
                field333.method2783();
                int var244 = field333.method2554();
                class46.method712(field333, var244);
                field335 = -1;
                return true;
            }
            if (field335 == 119) {
                int var245 = field333.method2554();
                byte var246 = field333.method2695();
                class166.field2173[var245] = var246;
                if (class166.field2174[var245] != var246) {
                    class166.field2174[var245] = var246;
                }
                method144(var245);
                field471[++field472 - 1 & 0x1F] = var245;
                field335 = -1;
                return true;
            }
            if (field335 == 183) {
                int var247 = field333.method2557();
                int var248 = field333.method2557();
                if (Statics.field209 == null || !Statics.field209.isValid()) {
                    try {
                        Iterator var249 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var249.hasNext()) {
                            GarbageCollectorMXBean var250 = (GarbageCollectorMXBean) var249.next();
                            if (var250.isValid()) {
                                Statics.field209 = var250;
                                field295 = -1L;
                                field562 = -1L;
                            }
                        }
                    } catch (Throwable var276) {
                    }
                }
                long var252 = class156.method2009();
                int var254 = -1;
                if (Statics.field209 != null) {
                    long var255 = Statics.field209.getCollectionTime();
                    if (field562 != -1L) {
                        long var257 = var255 - field562;
                        long var259 = var252 - field295;
                        if (var259 != 0L) {
                            var254 = (int) (var257 * 100L / var259);
                        }
                    }
                    field562 = var255;
                    field295 = var252;
                }
                field331.method2782(183);
                field331.method2540(var247);
                field331.method2595(var248);
                field331.method2578(var254);
                field331.method2578(field1783);
                field335 = -1;
                return true;
            }
            if (field335 == 107) {
                if (field445 != -1) {
                    method46(field445, 0);
                }
                field335 = -1;
                return true;
            }
            if (field335 == 35) {
                class228.method3269(field333, field524);
                field335 = -1;
                return true;
            }
            if (field335 == 116) {
                field521 = field333.method2552();
                field335 = -1;
                return true;
            }
            if (field335 == 97) {
                Statics.field1634 = field333.method2581();
                Statics.field183 = field333.method2579();
                for (int var261 = Statics.field1634; var261 < Statics.field1634 + 8; var261++) {
                    for (int var262 = Statics.field183; var262 < Statics.field183 + 8; var262++) {
                        if (field418[Statics.field1094][var261][var262] != null) {
                            field418[Statics.field1094][var261][var262] = null;
                            method2823(var261, var262);
                        }
                    }
                }
                for (class26 var263 = (class26) field301.method2201(); var263 != null; var263 = (class26) field301.method2203()) {
                    if (var263.field585 >= Statics.field1634 && var263.field585 < Statics.field1634 + 8 && var263.field574 >= Statics.field183 && var263.field574 < Statics.field183 + 8 && Statics.field1094 == var263.field576) {
                        var263.field578 = 0;
                    }
                }
                field335 = -1;
                return true;
            }
            if (field335 == 142) {
                Statics.field1634 = field333.method2552();
                Statics.field183 = field333.method2579();
                field335 = -1;
                return true;
            }
            if (field335 == 28) {
                method189();
                field451 = field333.method2555();
                field482 = field470;
                field335 = -1;
                return true;
            }
            if (field335 == 165) {
                field519 = field333.method2552();
                if (field519 == 255) {
                    field519 = 0;
                }
                field490 = field333.method2552();
                if (field490 == 255) {
                    field490 = 0;
                }
                field335 = -1;
                return true;
            }
            if (field335 == 205) {
                field313 = 1;
                field478 = field470;
                field335 = -1;
                return true;
            }
            if (field335 == 2) {
                int var264 = field333.method2557();
                int var265 = field333.method2554();
                int var266 = field333.method2696();
                class170 var267 = class170.method2993(var264);
                var267.field2264 = (var265 << 16) + var266;
                field335 = -1;
                return true;
            }
            if (field335 == 184) {
                int var268 = field333.method2557();
                class18 var269 = (class18) field419.method2151((long) var268);
                if (var269 != null) {
                    method768(var269, true);
                }
                if (field449 != null) {
                    method1786(field449);
                    field449 = null;
                }
                field335 = -1;
                return true;
            }
            if (field335 == 36) {
                class46.method712(field333, field524);
                field335 = -1;
                return true;
            }
            if (field335 == 71) {
                for (int var270 = 0; var270 < class166.field2174.length; var270++) {
                    if (class166.field2174[var270] != class166.field2173[var270]) {
                        class166.field2174[var270] = class166.field2173[var270];
                        method144(var270);
                        field471[++field472 - 1 & 0x1F] = var270;
                    }
                }
                field335 = -1;
                return true;
            }
            class102.method1762("" + field335 + class38.field801 + field411 + class38.field801 + field340 + class38.field801 + field524, (Throwable) null);
            method2994();
        } catch (IOException var277) {
            method1760();
        } catch (Exception var278) {
            String var273 = "" + field335 + class38.field801 + field411 + class38.field801 + field340 + class38.field801 + field524 + class38.field801 + (Statics.field1735 + Statics.field43.field660[0]) + class38.field801 + (Statics.field284 + Statics.field43.field661[0]) + class38.field801;
            for (int var274 = 0; var274 < field524 && var274 < 50; var274++) {
                var273 = var273 + field333.field2108[var274] + class38.field801;
            }
            class102.method1762(var273, var278);
            method2994();
        }
        return true;
    }

    @ObfuscatedName("s.bk(I)V")
    public static final void method181() {
        if (field335 == 236) {
            int var0 = field333.method2552();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1634;
            int var2 = (var0 & 0x7) + Statics.field183;
            int var3 = field333.method2554();
            int var4 = field333.method2554();
            int var5 = field333.method2554();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class129 var6 = field418[Statics.field1094][var1][var2];
                if (var6 != null) {
                    for (class44 var7 = (class44) var6.method2201(); var7 != null; var7 = (class44) var6.method2203()) {
                        if ((var3 & 0x7FFF) == var7.field891 && var7.field890 == var4) {
                            var7.field890 = var5;
                            break;
                        }
                    }
                    method2823(var1, var2);
                }
            }
        } else if (field335 == 105) {
            int var8 = field333.method2581();
            int var9 = var8 >> 2;
            int var10 = var8 & 0x3;
            int var11 = field529[var9];
            int var12 = field333.method2696();
            int var13 = field333.method2579();
            int var14 = (var13 >> 4 & 0x7) + Statics.field1634;
            int var15 = (var13 & 0x7) + Statics.field183;
            if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
                method727(Statics.field1094, var14, var15, var11, var12, var9, var10, 0, -1);
            }
        } else {
            if (field335 == 77) {
                int var16 = field333.method2552();
                int var17 = (var16 >> 4 & 0x7) + Statics.field1634;
                int var18 = (var16 & 0x7) + Statics.field183;
                int var19 = field333.method2554();
                int var20 = field333.method2552();
                int var21 = var20 >> 4 & 0xF;
                int var22 = var20 & 0x7;
                int var23 = field333.method2552();
                if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104) {
                    int var24 = var21 + 1;
                    if (Statics.field43.field660[0] >= var17 - var24 && Statics.field43.field660[0] <= var17 + var24 && Statics.field43.field661[0] >= var18 - var24 && Statics.field43.field661[0] <= var18 + var24 && field526 != 0 && var22 > 0 && field527 < 50) {
                        field528[field527] = var19;
                        field352[field527] = var22;
                        field530[field527] = var23;
                        field532[field527] = null;
                        field350[field527] = (var17 << 16) + (var18 << 8) + var21;
                        field527++;
                    }
                }
            }
            if (field335 == 240) {
                int var25 = field333.method2552();
                int var26 = (var25 >> 4 & 0x7) + Statics.field1634;
                int var27 = (var25 & 0x7) + Statics.field183;
                int var28 = var26 + field333.method2553();
                int var29 = var27 + field333.method2553();
                int var30 = field333.method2555();
                int var31 = field333.method2554();
                int var32 = field333.method2552() * 4;
                int var33 = field333.method2552() * 4;
                int var34 = field333.method2554();
                int var35 = field333.method2554();
                int var36 = field333.method2552();
                int var37 = field333.method2552();
                if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && var28 >= 0 && var29 >= 0 && var28 < 104 && var29 < 104 && var31 != 65535) {
                    int var38 = var26 * 128 + 64;
                    int var39 = var27 * 128 + 64;
                    int var40 = var28 * 128 + 64;
                    int var41 = var29 * 128 + 64;
                    class43 var42 = new class43(var31, Statics.field1094, var38, var39, method878(var38, var39, Statics.field1094) - var32, field299 + var34, field299 + var35, var36, var37, var30, var33);
                    var42.method757(var40, var41, method878(var40, var41, Statics.field1094) - var33, field299 + var34);
                    field420.method2213(var42);
                }
            } else {
                if (field335 == 93) {
                    int var43 = field333.method2577();
                    byte var44 = field333.method2583();
                    int var45 = field333.method2696();
                    byte var46 = field333.method2553();
                    int var47 = field333.method2554();
                    int var48 = field333.method2577();
                    byte var49 = field333.method2553();
                    int var50 = field333.method2718();
                    int var51 = var50 >> 2;
                    int var52 = var50 & 0x3;
                    int var53 = field529[var51];
                    int var54 = field333.method2552();
                    int var55 = (var54 >> 4 & 0x7) + Statics.field1634;
                    int var56 = (var54 & 0x7) + Statics.field183;
                    byte var57 = field333.method2553();
                    class24 var58;
                    if (field409 == var43) {
                        var58 = Statics.field43;
                    } else {
                        var58 = field408[var43];
                    }
                    if (var58 != null) {
                        class198 var59 = class198.method2463(var47);
                        int var60;
                        int var61;
                        if (var52 == 1 || var52 == 3) {
                            var60 = var59.field2939;
                            var61 = var59.field2906;
                        } else {
                            var60 = var59.field2906;
                            var61 = var59.field2939;
                        }
                        int var62 = (var60 >> 1) + var55;
                        int var63 = (var60 + 1 >> 1) + var55;
                        int var64 = (var61 >> 1) + var56;
                        int var65 = (var61 + 1 >> 1) + var56;
                        int[][] var66 = class11.field94[Statics.field1094];
                        int var67 = var66[var62][var64] + var66[var63][var64] + var66[var62][var65] + var66[var63][var65] >> 2;
                        int var68 = (var55 << 7) + (var60 << 6);
                        int var69 = (var56 << 7) + (var61 << 6);
                        class83 var70 = var59.method3327(var51, var52, var66, var68, var67, var69);
                        if (var70 != null) {
                            method727(Statics.field1094, var55, var56, var53, -1, 0, 0, var48 + 1, var45 + 1);
                            var58.field270 = field299 + var48;
                            var58.field258 = field299 + var45;
                            var58.field262 = var70;
                            var58.field259 = var55 * 128 + var60 * 64;
                            var58.field261 = var56 * 128 + var61 * 64;
                            var58.field260 = var67;
                            if (var44 > var49) {
                                byte var71 = var44;
                                var44 = var49;
                                var49 = var71;
                            }
                            if (var57 > var46) {
                                byte var72 = var57;
                                var57 = var46;
                                var46 = var72;
                            }
                            var58.field263 = var44 + var55;
                            var58.field265 = var49 + var55;
                            var58.field248 = var56 + var57;
                            var58.field266 = var46 + var56;
                        }
                    }
                }
                if (field335 == 96) {
                    int var73 = field333.method2554();
                    int var74 = field333.method2552();
                    int var75 = (var74 >> 4 & 0x7) + Statics.field1634;
                    int var76 = (var74 & 0x7) + Statics.field183;
                    if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104) {
                        class129 var77 = field418[Statics.field1094][var75][var76];
                        if (var77 != null) {
                            for (class44 var78 = (class44) var77.method2201(); var78 != null; var78 = (class44) var77.method2203()) {
                                if ((var73 & 0x7FFF) == var78.field891) {
                                    var78.method2189();
                                    break;
                                }
                            }
                            if (var77.method2201() == null) {
                                field418[Statics.field1094][var75][var76] = null;
                            }
                            method2823(var75, var76);
                        }
                    }
                } else if (field335 == 228) {
                    int var79 = field333.method2579();
                    int var80 = var79 >> 2;
                    int var81 = var79 & 0x3;
                    int var82 = field529[var80];
                    int var83 = field333.method2718();
                    int var84 = (var83 >> 4 & 0x7) + Statics.field1634;
                    int var85 = (var83 & 0x7) + Statics.field183;
                    int var86 = field333.method2596();
                    if (var84 >= 0 && var85 >= 0 && var84 < 103 && var85 < 103) {
                        if (var82 == 0) {
                            class91 var87 = Statics.field2137.method1612(Statics.field1094, var84, var85);
                            if (var87 != null) {
                                int var88 = var87.field1538 >> 14 & 0x7FFF;
                                if (var80 == 2) {
                                    var87.field1540 = new class50(var88, 2, var81 + 4, Statics.field1094, var84, var85, var86, false, var87.field1540);
                                    var87.field1541 = new class50(var88, 2, var81 + 1 & 0x3, Statics.field1094, var84, var85, var86, false, var87.field1541);
                                } else {
                                    var87.field1540 = new class50(var88, var80, var81, Statics.field1094, var84, var85, var86, false, var87.field1540);
                                }
                            }
                        }
                        if (var82 == 1) {
                            class96 var89 = Statics.field2137.method1613(Statics.field1094, var84, var85);
                            if (var89 != null) {
                                int var90 = var89.field1595 >> 14 & 0x7FFF;
                                if (var80 == 4 || var80 == 5) {
                                    var89.field1592 = new class50(var90, 4, var81, Statics.field1094, var84, var85, var86, false, var89.field1592);
                                } else if (var80 == 6) {
                                    var89.field1592 = new class50(var90, 4, var81 + 4, Statics.field1094, var84, var85, var86, false, var89.field1592);
                                } else if (var80 == 7) {
                                    var89.field1592 = new class50(var90, 4, (var81 + 2 & 0x3) + 4, Statics.field1094, var84, var85, var86, false, var89.field1592);
                                } else if (var80 == 8) {
                                    var89.field1592 = new class50(var90, 4, var81 + 4, Statics.field1094, var84, var85, var86, false, var89.field1592);
                                    var89.field1594 = new class50(var90, 4, (var81 + 2 & 0x3) + 4, Statics.field1094, var84, var85, var86, false, var89.field1594);
                                }
                            }
                        }
                        if (var82 == 2) {
                            class97 var91 = Statics.field2137.method1725(Statics.field1094, var84, var85);
                            if (var80 == 11) {
                                var80 = 10;
                            }
                            if (var91 != null) {
                                var91.field1605 = new class50(var91.field1613 >> 14 & 0x7FFF, var80, var81, Statics.field1094, var84, var85, var86, false, var91.field1605);
                            }
                        }
                        if (var82 == 3) {
                            class79 var92 = Statics.field2137.method1616(Statics.field1094, var84, var85);
                            if (var92 != null) {
                                var92.field1292 = new class50(var92.field1293 >> 14 & 0x7FFF, 22, var81, Statics.field1094, var84, var85, var86, false, var92.field1292);
                            }
                        }
                    }
                } else if (field335 == 195) {
                    int var93 = field333.method2577();
                    int var94 = field333.method2696();
                    int var95 = field333.method2552();
                    int var96 = (var95 >> 4 & 0x7) + Statics.field1634;
                    int var97 = (var95 & 0x7) + Statics.field183;
                    if (var96 >= 0 && var97 >= 0 && var96 < 104 && var97 < 104) {
                        class44 var98 = new class44();
                        var98.field891 = var93;
                        var98.field890 = var94;
                        if (field418[Statics.field1094][var96][var97] == null) {
                            field418[Statics.field1094][var96][var97] = new class129();
                        }
                        field418[Statics.field1094][var96][var97].method2213(var98);
                        method2823(var96, var97);
                    }
                } else if (field335 == 238) {
                    int var99 = field333.method2718();
                    int var100 = var99 >> 2;
                    int var101 = var99 & 0x3;
                    int var102 = field529[var100];
                    int var103 = field333.method2718();
                    int var104 = (var103 >> 4 & 0x7) + Statics.field1634;
                    int var105 = (var103 & 0x7) + Statics.field183;
                    if (var104 >= 0 && var105 >= 0 && var104 < 104 && var105 < 104) {
                        method727(Statics.field1094, var104, var105, var102, -1, var100, var101, 0, -1);
                    }
                } else if (field335 == 209) {
                    int var106 = field333.method2552();
                    int var107 = (var106 >> 4 & 0x7) + Statics.field1634;
                    int var108 = (var106 & 0x7) + Statics.field183;
                    int var109 = field333.method2554();
                    int var110 = field333.method2552();
                    int var111 = field333.method2554();
                    if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                        int var112 = var107 * 128 + 64;
                        int var113 = var108 * 128 + 64;
                        class34 var114 = new class34(var109, Statics.field1094, var112, var113, method878(var112, var113, Statics.field1094) - var110, var111, field299);
                        field512.method2213(var114);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ac.ba(IIIIIIIIII)V")
    public static final void method727(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class26 var9 = null;
        for (class26 var10 = (class26) field301.method2201(); var10 != null; var10 = (class26) field301.method2203()) {
            if (var10.field576 == arg0 && var10.field585 == arg1 && var10.field574 == arg2 && var10.field572 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class26();
            var9.field576 = arg0;
            var9.field572 = arg3;
            var9.field585 = arg1;
            var9.field574 = arg2;
            method401(var9);
            field301.method2213(var9);
        }
        var9.field580 = arg4;
        var9.field571 = arg5;
        var9.field579 = arg6;
        var9.field581 = arg7;
        var9.field578 = arg8;
    }

    @ObfuscatedName("en.bl(I)V")
    public static final void method2497() {
        for (class26 var0 = (class26) field301.method2201(); var0 != null; var0 = (class26) field301.method2203()) {
            if (var0.field578 == -1) {
                var0.field581 = 0;
                method401(var0);
            } else {
                var0.method2189();
            }
        }
    }

    @ObfuscatedName("client.bq(Le;I)V")
    public static final void method401(class26 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field572 == 0) {
            var1 = Statics.field2137.method1747(arg0.field576, arg0.field585, arg0.field574);
        }
        if (arg0.field572 == 1) {
            var1 = Statics.field2137.method1617(arg0.field576, arg0.field585, arg0.field574);
        }
        if (arg0.field572 == 2) {
            var1 = Statics.field2137.method1615(arg0.field576, arg0.field585, arg0.field574);
        }
        if (arg0.field572 == 3) {
            var1 = Statics.field2137.method1727(arg0.field576, arg0.field585, arg0.field574);
        }
        if (var1 != 0) {
            int var5 = Statics.field2137.method1620(arg0.field576, arg0.field585, arg0.field574, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field573 = var2;
        arg0.field577 = var3;
        arg0.field582 = var4;
    }

    @ObfuscatedName("am.bc(IIIIIIII)V")
    public static final void method569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field315 && Statics.field1094 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2137.method1747(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2137.method1617(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2137.method1615(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2137.method1727(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2137.method1620(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2137.method1607(arg0, arg2, arg3);
                class198 var15 = class198.method2463(var12);
                if (var15.field2908 != 0) {
                    field348[arg0].method2060(arg2, arg3, var13, var14, var15.field2919);
                }
            }
            if (arg1 == 1) {
                Statics.field2137.method1608(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2137.method1609(arg0, arg2, arg3);
                class198 var16 = class198.method2463(var12);
                if (var16.field2906 + arg2 > 103 || var16.field2906 + arg3 > 103 || var16.field2939 + arg2 > 103 || var16.field2939 + arg3 > 103) {
                    return;
                }
                if (var16.field2908 != 0) {
                    field348[arg0].method2061(arg2, arg3, var16.field2906, var16.field2939, var14, var16.field2919);
                }
            }
            if (arg1 == 3) {
                Statics.field2137.method1730(arg0, arg2, arg3);
                class198 var17 = class198.method2463(var12);
                if (var17.field2908 == 1) {
                    field348[arg0].method2063(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class11.field82[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class11.method196(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field2137, field348[arg0]);
    }

    @ObfuscatedName("fq.bs(III)V")
    public static final void method2823(int arg0, int arg1) {
        class129 var2 = field418[Statics.field1094][arg0][arg1];
        if (var2 == null) {
            Statics.field2137.method1600(Statics.field1094, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class44 var5 = null;
        for (class44 var6 = (class44) var2.method2201(); var6 != null; var6 = (class44) var2.method2203()) {
            class199 var7 = class199.method2268(var6.field891);
            long var8 = (long) var7.field2992;
            if (var7.field2961 == 1) {
                var8 = (long) (var6.field890 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field2137.method1600(Statics.field1094, arg0, arg1);
            return;
        }
        var2.method2197(var5);
        class44 var10 = null;
        class44 var11 = null;
        for (class44 var12 = (class44) var2.method2201(); var12 != null; var12 = (class44) var2.method2203()) {
            if (var5.field891 != var12.field891) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field891 != var12.field891 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field2137.method1597(Statics.field1094, arg0, arg1, method878(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1094), var5, var13, var10, var11);
    }

    @ObfuscatedName("u.bi(ZI)V")
    public static final void method93(boolean arg0) {
        field317 = 0;
        field329 = 0;
        field333.method2784();
        int var1 = field333.method2801(8);
        if (var1 < field493) {
            for (int var2 = var1; var2 < field493; var2++) {
                field288[++field317 - 1] = field328[var2];
            }
        }
        if (var1 > field493) {
            throw new RuntimeException("");
        }
        field493 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field328[var3];
            class36 var5 = field326[var4];
            int var6 = field333.method2801(1);
            if (var6 == 0) {
                field328[++field493 - 1] = var4;
                var5.field654 = field299;
            } else {
                int var7 = field333.method2801(2);
                if (var7 == 0) {
                    field328[++field493 - 1] = var4;
                    var5.field654 = field299;
                    field385[++field329 - 1] = var4;
                } else if (var7 == 1) {
                    field328[++field493 - 1] = var4;
                    var5.field654 = field299;
                    int var8 = field333.method2801(3);
                    var5.method687(var8, (byte) 1);
                    int var9 = field333.method2801(1);
                    if (var9 == 1) {
                        field385[++field329 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field328[++field493 - 1] = var4;
                    var5.field654 = field299;
                    int var10 = field333.method2801(3);
                    var5.method687(var10, (byte) 2);
                    int var11 = field333.method2801(3);
                    var5.method687(var11, (byte) 2);
                    int var12 = field333.method2801(1);
                    if (var12 == 1) {
                        field385[++field329 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field288[++field317 - 1] = var4;
                }
            }
        }
        while (field333.method2786(field524) >= 27) {
            int var13 = field333.method2801(15);
            if (var13 == 32767) {
                break;
            }
            boolean var17 = false;
            if (field326[var13] == null) {
                field326[var13] = new class36();
                var17 = true;
            }
            class36 var18 = field326[var13];
            field328[++field493 - 1] = var13;
            var18.field654 = field299;
            int var19 = field333.method2801(1);
            if (var19 == 1) {
                field385[++field329 - 1] = var13;
            }
            int var20 = field416[field333.method2801(3)];
            if (var17) {
                var18.field656 = var18.field606 = var20;
            }
            var18.field772 = class200.method635(field333.method2801(14));
            int var21;
            if (arg0) {
                var21 = field333.method2801(8);
                if (var21 > 127) {
                    var21 -= 256;
                }
            } else {
                var21 = field333.method2801(5);
                if (var21 > 15) {
                    var21 -= 32;
                }
            }
            int var22 = field333.method2801(1);
            int var23;
            if (arg0) {
                var23 = field333.method2801(8);
                if (var23 > 127) {
                    var23 -= 256;
                }
            } else {
                var23 = field333.method2801(5);
                if (var23 > 15) {
                    var23 -= 32;
                }
            }
            var18.field613 = var18.field772.field3000;
            var18.field658 = var18.field772.field3012;
            if (var18.field658 == 0) {
                var18.field606 = 0;
            }
            var18.field625 = var18.field772.field3006;
            var18.field641 = var18.field772.field3007;
            var18.field616 = var18.field772.field3008;
            var18.field649 = var18.field772.field3009;
            var18.field644 = var18.field772.field3003;
            var18.field647 = var18.field772.field3004;
            var18.field611 = var18.field772.field3025;
            var18.method689(Statics.field43.field660[0] + var23, Statics.field43.field661[0] + var21, var22 == 1);
        }
        field333.method2807();
        method147();
        for (int var14 = 0; var14 < field317; var14++) {
            int var15 = field288[var14];
            if (field299 != field326[var15].field654) {
                field326[var15].field772 = null;
                field326[var15] = null;
            }
        }
        if (field524 != field333.field2105) {
            throw new RuntimeException(field333.field2105 + class38.field801 + field524);
        }
        for (int var16 = 0; var16 < field493; var16++) {
            if (field326[field328[var16]] == null) {
                throw new RuntimeException(var16 + class38.field801 + field493);
            }
        }
    }

    @ObfuscatedName("y.bx(I)V")
    public static final void method147() {
        for (int var0 = 0; var0 < field329; var0++) {
            int var1 = field385[var0];
            class36 var2 = field326[var1];
            int var3 = field333.method2552();
            if ((var3 & 0x20) != 0) {
                var2.field642 = field333.method2577();
                int var4 = field333.method2557();
                var2.field655 = var4 >> 16;
                var2.field645 = (var4 & 0xFFFF) + field299;
                var2.field643 = 0;
                var2.field665 = 0;
                if (var2.field645 > field299) {
                    var2.field643 = -1;
                }
                if (var2.field642 == 65535) {
                    var2.field642 = -1;
                }
            }
            if ((var3 & 0x4) != 0) {
                var2.field772 = class200.method635(field333.method2596());
                var2.field613 = var2.field772.field3000;
                var2.field658 = var2.field772.field3012;
                var2.field625 = var2.field772.field3006;
                var2.field641 = var2.field772.field3007;
                var2.field616 = var2.field772.field3008;
                var2.field649 = var2.field772.field3009;
                var2.field644 = var2.field772.field3003;
                var2.field647 = var2.field772.field3004;
                var2.field611 = var2.field772.field3025;
            }
            if ((var3 & 0x2) != 0) {
                var2.field617 = field333.method2606();
                var2.field620 = 100;
            }
            if ((var3 & 0x40) != 0) {
                var2.field614 = field333.method2596();
                if (var2.field614 == 65535) {
                    var2.field614 = -1;
                }
            }
            if ((var3 & 0x8) != 0) {
                int var5 = field333.method2596();
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = field333.method2718();
                if (var2.field637 == var5 && var5 != -1) {
                    int var7 = class202.method658(var5).field3060;
                    if (var7 == 1) {
                        var2.field638 = 0;
                        var2.field640 = 0;
                        var2.field646 = var6;
                        var2.field627 = 0;
                    }
                    if (var7 == 2) {
                        var2.field627 = 0;
                    }
                } else if (var5 == -1 || var2.field637 == -1 || class202.method658(var5).field3057 >= class202.method658(var2.field637).field3057) {
                    var2.field637 = var5;
                    var2.field638 = 0;
                    var2.field640 = 0;
                    var2.field646 = var6;
                    var2.field627 = 0;
                    var2.field664 = var2.field657;
                }
            }
            if ((var3 & 0x1) != 0) {
                int var8 = field333.method2696();
                int var9 = field333.method2696();
                int var10 = var2.field608 - (var8 - Statics.field1735 - Statics.field1735) * 64;
                int var11 = var2.field605 - (var9 - Statics.field284 - Statics.field284) * 64;
                if (var10 != 0 || var11 != 0) {
                    var2.field615 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x10) != 0) {
                int var12 = field333.method2718();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = field333.method2668();
                        if (var17 == 32767) {
                            var17 = field333.method2668();
                            var15 = field333.method2668();
                            var14 = field333.method2668();
                            var16 = field333.method2668();
                        } else if (var17 == 32766) {
                            var17 = -1;
                        } else {
                            var15 = field333.method2668();
                        }
                        int var18 = field333.method2668();
                        var2.method576(var17, var15, var14, var16, field299, var18);
                    }
                }
                int var19 = field333.method2552();
                if (var19 > 0) {
                    for (int var20 = 0; var20 < var19; var20++) {
                        int var21 = field333.method2668();
                        int var22 = field333.method2668();
                        if (var22 == 32767) {
                            var2.method572(var21);
                        } else {
                            int var23 = field333.method2668();
                            int var24 = field333.method2579();
                            int var25 = var22 > 0 ? field333.method2718() : var24;
                            var2.method574(var21, field299, var22, var23, var24, var25);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.bw(III)Lds;")
    public static class120 method674(int arg0, int arg1) {
        field564.field1872 = arg0;
        field564.field1866 = arg1;
        field564.field1867 = 1;
        field564.field1871 = 1;
        return field564;
    }

    @ObfuscatedName("ab.bt(I)V")
    public static final void method688() {
        int var0 = Statics.field1620;
        int var1 = Statics.field1750;
        int var2 = Statics.field24;
        int var3 = Statics.field704;
        int var4 = 6116423;
        class220.method3696(var0, var1, var2, var3, var4);
        class220.method3696(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class220.method3702(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field219.method3584(class174.field2512, var0 + 3, var1 + 14, var4, -1);
        int var5 = class116.field1815;
        int var6 = class116.field1822;
        for (int var7 = 0; var7 < field427; var7++) {
            int var8 = (field427 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class209 var10 = Statics.field219;
            String var11;
            if (field433[var7].length() > 0) {
                var11 = field446[var7] + class174.field2519 + field433[var7];
            } else {
                var11 = field446[var7];
            }
            var10.method3584(var11, var0 + 3, var8, var9, 0);
        }
        method143(Statics.field1620, Statics.field1750, Statics.field24, Statics.field704);
    }

    @ObfuscatedName("c.by(IIIIB)V")
    public static final void method87(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field488; var4++) {
            if (field495[var4] + field310[var4] > arg0 && field310[var4] < arg0 + arg2 && field421[var4] + field357[var4] > arg1 && field421[var4] < arg1 + arg3) {
                field309[var4] = true;
            }
        }
    }

    @ObfuscatedName("z.bn(IIIIB)V")
    public static final void method143(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field488; var4++) {
            if (field495[var4] + field310[var4] > arg0 && field310[var4] < arg0 + arg2 && field421[var4] + field357[var4] > arg1 && field421[var4] < arg1 + arg3) {
                field491[var4] = true;
            }
        }
    }

    @ObfuscatedName("at.bj(III)V")
    public static final void method756(int arg0, int arg1) {
        int var2 = Statics.field219.method3575(class174.field2512);
        for (int var3 = 0; var3 < field427; var3++) {
            class209 var4 = Statics.field219;
            String var5;
            if (field433[var3].length() > 0) {
                var5 = field446[var3] + class174.field2519 + field433[var3];
            } else {
                var5 = field446[var3];
            }
            int var6 = var4.method3575(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field427 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field1201) {
            var8 = Statics.field1201 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field1585) {
            var9 = Statics.field1585 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field426 = true;
        Statics.field1620 = var8;
        Statics.field1750 = var9;
        Statics.field24 = var2;
        Statics.field704 = field427 * 15 + 22;
    }

    @ObfuscatedName("ch.bz(II)Z")
    public static final boolean method1522(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field430[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("dl.bg(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1894(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 18) {
            field501 = arg6;
            field396 = arg7;
            field477 = 2;
            field397 = 0;
            field519 = arg0;
            field490 = arg1;
            field331.method2782(131);
            field331.method2586(Statics.field284 + arg1);
            field331.method2578(class106.field1729[82] ? 1 : 0);
            field331.method2586(arg3);
            field331.method2585(Statics.field1735 + arg0);
        }
        if (arg2 == 34) {
            field331.method2782(74);
            field331.method2748(arg0);
            field331.method2540(arg1);
            field331.method2585(arg3);
            field399 = 0;
            Statics.field210 = class170.method2993(arg1);
            field400 = arg0;
        }
        if (arg2 == 21) {
            field501 = arg6;
            field396 = arg7;
            field477 = 2;
            field397 = 0;
            field519 = arg0;
            field490 = arg1;
            field331.method2782(195);
            field331.method2538(arg3);
            field331.method2585(Statics.field284 + arg1);
            field331.method2585(Statics.field1735 + arg0);
            field331.method2739(class106.field1729[82] ? 1 : 0);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class170 var8 = class170.method2271(arg1, arg0);
            if (var8 != null) {
                int var9 = var8.field2328;
                class170 var10 = class170.method2271(arg1, arg0);
                if (var10 != null) {
                    if (var10.field2308 != null) {
                        class19 var11 = new class19();
                        var11.field194 = var10;
                        var11.field198 = arg3;
                        var11.field202 = arg5;
                        var11.field204 = var10.field2308;
                        class33.method166(var11);
                    }
                    boolean var12 = true;
                    if (var10.field2263 > 0) {
                        var12 = method776(var10);
                    }
                    if (var12 && class171.method1772(method3671(var10), arg3 - 1)) {
                        if (arg3 == 1) {
                            field331.method2782(151);
                            field331.method2540(arg1);
                            field331.method2538(arg0);
                            field331.method2538(var9);
                        }
                        if (arg3 == 2) {
                            field331.method2782(239);
                            field331.method2540(arg1);
                            field331.method2538(arg0);
                            field331.method2538(var9);
                        }
                        if (arg3 == 3) {
                            field331.method2782(144);
                            field331.method2540(arg1);
                            field331.method2538(arg0);
                            field331.method2538(var9);
                        }
                        if (arg3 == 4) {
                            field331.method2782(238);
                            field331.method2540(arg1);
                            field331.method2538(arg0);
                            field331.method2538(var9);
                        }
                        if (arg3 == 5) {
                            field331.method2782(155);
                            field331.method2540(arg1);
                            field331.method2538(arg0);
                            field331.method2538(var9);
                        }
                        if (arg3 == 6) {
                            field331.method2782(189);
                            field331.method2540(arg1);
                            field331.method2538(arg0);
                            field331.method2538(var9);
                        }
                        if (arg3 == 7) {
                            field331.method2782(226);
                            field331.method2540(arg1);
                            field331.method2538(arg0);
                            field331.method2538(var9);
                        }
                        if (arg3 == 8) {
                            field331.method2782(171);
                            field331.method2540(arg1);
                            field331.method2538(arg0);
                            field331.method2538(var9);
                        }
                        if (arg3 == 9) {
                            field331.method2782(203);
                            field331.method2540(arg1);
                            field331.method2538(arg0);
                            field331.method2538(var9);
                        }
                        if (arg3 == 10) {
                            field331.method2782(73);
                            field331.method2540(arg1);
                            field331.method2538(arg0);
                            field331.method2538(var9);
                        }
                    }
                }
            }
        }
        if (arg2 == 22) {
            field501 = arg6;
            field396 = arg7;
            field477 = 2;
            field397 = 0;
            field519 = arg0;
            field490 = arg1;
            field331.method2782(162);
            field331.method2650(class106.field1729[82] ? 1 : 0);
            field331.method2586(Statics.field1735 + arg0);
            field331.method2585(arg3);
            field331.method2538(Statics.field284 + arg1);
        }
        if (arg2 == 33) {
            field331.method2782(199);
            field331.method2585(arg3);
            field331.method2617(arg1);
            field331.method2538(arg0);
            field399 = 0;
            Statics.field210 = class170.method2993(arg1);
            field400 = arg0;
        }
        if (arg2 == 1002) {
            field501 = arg6;
            field396 = arg7;
            field477 = 2;
            field397 = 0;
            field331.method2782(120);
            field331.method2748(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 36) {
            field331.method2782(222);
            field331.method2538(arg0);
            field331.method2594(arg1);
            field331.method2585(arg3);
            field399 = 0;
            Statics.field210 = class170.method2993(arg1);
            field400 = arg0;
        }
        if (arg2 == 32) {
            field331.method2782(143);
            field331.method2586(arg0);
            field331.method2538(field386);
            field331.method2538(arg3);
            field331.method2540(Statics.field2129);
            field331.method2540(arg1);
            field399 = 0;
            Statics.field210 = class170.method2993(arg1);
            field400 = arg0;
        }
        if (arg2 == 26) {
            field331.method2782(237);
            for (class18 var13 = (class18) field419.method2148(); var13 != null; var13 = (class18) field419.method2152()) {
                if (var13.field192 == 0 || var13.field192 == 3) {
                    method768(var13, true);
                }
            }
            if (field449 != null) {
                method1786(field449);
                field449 = null;
            }
        }
        if (arg2 == 48) {
            class24 var14 = field408[arg3];
            if (var14 != null) {
                field501 = arg6;
                field396 = arg7;
                field477 = 2;
                field397 = 0;
                field519 = arg0;
                field490 = arg1;
                field331.method2782(243);
                field331.method2538(arg3);
                field331.method2739(class106.field1729[82] ? 1 : 0);
            }
        }
        if (arg2 == 28) {
            field331.method2782(125);
            field331.method2540(arg1);
            class170 var15 = class170.method2993(arg1);
            if (var15.field2320 != null && var15.field2320[0][0] == 5) {
                int var16 = var15.field2320[0][1];
                class166.field2174[var16] = 1 - class166.field2174[var16];
                method144(var16);
            }
        }
        if (arg2 == 49) {
            class24 var17 = field408[arg3];
            if (var17 != null) {
                field501 = arg6;
                field396 = arg7;
                field477 = 2;
                field397 = 0;
                field519 = arg0;
                field490 = arg1;
                field331.method2782(24);
                field331.method2586(arg3);
                field331.method2650(class106.field1729[82] ? 1 : 0);
            }
        }
        if (arg2 == 50) {
            class24 var18 = field408[arg3];
            if (var18 != null) {
                field501 = arg6;
                field396 = arg7;
                field477 = 2;
                field397 = 0;
                field519 = arg0;
                field490 = arg1;
                field331.method2782(111);
                field331.method2748(arg3);
                field331.method2578(class106.field1729[82] ? 1 : 0);
            }
        }
        if (arg2 == 1001) {
            field501 = arg6;
            field396 = arg7;
            field477 = 2;
            field397 = 0;
            field519 = arg0;
            field490 = arg1;
            field331.method2782(157);
            field331.method2585(arg3 >> 14 & 0x7FFF);
            field331.method2739(class106.field1729[82] ? 1 : 0);
            field331.method2538(Statics.field284 + arg1);
            field331.method2586(Statics.field1735 + arg0);
        }
        if (arg2 == 23) {
            Statics.field2137.method1627(Statics.field1094, arg0, arg1);
        }
        if (arg2 == 1004) {
            field501 = arg6;
            field396 = arg7;
            field477 = 2;
            field397 = 0;
            field331.method2782(23);
            field331.method2585(arg3);
        }
        if (arg2 == 7) {
            class36 var19 = field326[arg3];
            if (var19 != null) {
                field501 = arg6;
                field396 = arg7;
                field477 = 2;
                field397 = 0;
                field519 = arg0;
                field490 = arg1;
                field331.method2782(21);
                field331.method2748(arg3);
                field331.method2540(Statics.field245);
                field331.method2739(class106.field1729[82] ? 1 : 0);
                field331.method2538(Statics.field1926);
                field331.method2586(Statics.field1832);
            }
        }
        if (arg2 == 11) {
            class36 var20 = field326[arg3];
            if (var20 != null) {
                field501 = arg6;
                field396 = arg7;
                field477 = 2;
                field397 = 0;
                field519 = arg0;
                field490 = arg1;
                field331.method2782(174);
                field331.method2538(arg3);
                field331.method2578(class106.field1729[82] ? 1 : 0);
            }
        }
        if (arg2 == 25) {
            class170 var21 = class170.method2271(arg1, arg0);
            if (var21 != null) {
                method31();
                int var24 = method3671(var21);
                int var25 = var24 >> 11 & 0x3F;
                method684(arg1, arg0, var25, var21.field2328);
                field438 = 0;
                int var26 = method3671(var21);
                int var27 = var26 >> 11 & 0x3F;
                String var28;
                if (var27 == 0) {
                    var28 = null;
                } else if (var21.field2287 == null || var21.field2287.trim().length() == 0) {
                    var28 = null;
                } else {
                    var28 = var21.field2287;
                }
                field563 = var28;
                if (field563 == null) {
                    field563 = "Null";
                }
                if (var21.field2205) {
                    field444 = var21.field2281 + class38.method183(16777215);
                } else {
                    field444 = class38.method183(65280) + var21.field2324 + class38.method183(16777215);
                }
            }
            return;
        }
        if (arg2 == 31) {
            field331.method2782(102);
            field331.method2586(arg0);
            field331.method2595(arg1);
            field331.method2617(Statics.field245);
            field331.method2748(Statics.field1926);
            field331.method2586(Statics.field1832);
            field331.method2585(arg3);
            field399 = 0;
            Statics.field210 = class170.method2993(arg1);
            field400 = arg0;
        }
        if (arg2 == 14) {
            class24 var29 = field408[arg3];
            if (var29 != null) {
                field501 = arg6;
                field396 = arg7;
                field477 = 2;
                field397 = 0;
                field519 = arg0;
                field490 = arg1;
                field331.method2782(167);
                field331.method2650(class106.field1729[82] ? 1 : 0);
                field331.method2540(Statics.field245);
                field331.method2748(Statics.field1832);
                field331.method2748(Statics.field1926);
                field331.method2748(arg3);
            }
        }
        if (arg2 == 46) {
            class24 var30 = field408[arg3];
            if (var30 != null) {
                field501 = arg6;
                field396 = arg7;
                field477 = 2;
                field397 = 0;
                field519 = arg0;
                field490 = arg1;
                field331.method2782(182);
                field331.method2585(arg3);
                field331.method2641(class106.field1729[82] ? 1 : 0);
            }
        }
        if (arg2 == 1) {
            field501 = arg6;
            field396 = arg7;
            field477 = 2;
            field397 = 0;
            field519 = arg0;
            field490 = arg1;
            field331.method2782(35);
            field331.method2586(Statics.field1926);
            field331.method2586(arg3 >> 14 & 0x7FFF);
            field331.method2538(Statics.field1735 + arg0);
            field331.method2586(Statics.field1832);
            field331.method2748(Statics.field284 + arg1);
            field331.method2650(class106.field1729[82] ? 1 : 0);
            field331.method2617(Statics.field245);
        }
        if (arg2 == 4) {
            field501 = arg6;
            field396 = arg7;
            field477 = 2;
            field397 = 0;
            field519 = arg0;
            field490 = arg1;
            field331.method2782(95);
            field331.method2586(Statics.field284 + arg1);
            field331.method2585(arg3 >> 14 & 0x7FFF);
            field331.method2585(Statics.field1735 + arg0);
            field331.method2650(class106.field1729[82] ? 1 : 0);
        }
        if (arg2 == 42) {
            field331.method2782(11);
            field331.method2540(arg1);
            field331.method2748(arg3);
            field331.method2538(arg0);
            field399 = 0;
            Statics.field210 = class170.method2993(arg1);
            field400 = arg0;
        }
        if (arg2 == 40) {
            field331.method2782(135);
            field331.method2586(arg0);
            field331.method2617(arg1);
            field331.method2586(arg3);
            field399 = 0;
            Statics.field210 = class170.method2993(arg1);
            field400 = arg0;
        }
        if (arg2 == 24) {
            class170 var31 = class170.method2993(arg1);
            boolean var32 = true;
            if (var31.field2263 > 0) {
                var32 = method776(var31);
            }
            if (var32) {
                field331.method2782(125);
                field331.method2540(arg1);
            }
        }
        if (arg2 == 12) {
            class36 var33 = field326[arg3];
            if (var33 != null) {
                field501 = arg6;
                field396 = arg7;
                field477 = 2;
                field397 = 0;
                field519 = arg0;
                field490 = arg1;
                field331.method2782(72);
                field331.method2739(class106.field1729[82] ? 1 : 0);
                field331.method2586(arg3);
            }
        }
        if (arg2 == 6) {
            field501 = arg6;
            field396 = arg7;
            field477 = 2;
            field397 = 0;
            field519 = arg0;
            field490 = arg1;
            field331.method2782(106);
            field331.method2578(class106.field1729[82] ? 1 : 0);
            field331.method2748(Statics.field1735 + arg0);
            field331.method2748(Statics.field284 + arg1);
            field331.method2586(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 20) {
            field501 = arg6;
            field396 = arg7;
            field477 = 2;
            field397 = 0;
            field519 = arg0;
            field490 = arg1;
            field331.method2782(190);
            field331.method2650(class106.field1729[82] ? 1 : 0);
            field331.method2748(Statics.field1735 + arg0);
            field331.method2538(arg3);
            field331.method2748(Statics.field284 + arg1);
        }
        if (arg2 == 5) {
            field501 = arg6;
            field396 = arg7;
            field477 = 2;
            field397 = 0;
            field519 = arg0;
            field490 = arg1;
            field331.method2782(50);
            field331.method2585(Statics.field1735 + arg0);
            field331.method2641(class106.field1729[82] ? 1 : 0);
            field331.method2586(Statics.field284 + arg1);
            field331.method2538(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 29) {
            field331.method2782(125);
            field331.method2540(arg1);
            class170 var34 = class170.method2993(arg1);
            if (var34.field2320 != null && var34.field2320[0][0] == 5) {
                int var35 = var34.field2320[0][1];
                if (class166.field2174[var35] != var34.field2322[0]) {
                    class166.field2174[var35] = var34.field2322[0];
                    method144(var35);
                }
            }
        }
        if (arg2 == 10) {
            class36 var36 = field326[arg3];
            if (var36 != null) {
                field501 = arg6;
                field396 = arg7;
                field477 = 2;
                field397 = 0;
                field519 = arg0;
                field490 = arg1;
                field331.method2782(70);
                field331.method2538(arg3);
                field331.method2641(class106.field1729[82] ? 1 : 0);
            }
        }
        if (arg2 == 51) {
            class24 var37 = field408[arg3];
            if (var37 != null) {
                field501 = arg6;
                field396 = arg7;
                field477 = 2;
                field397 = 0;
                field519 = arg0;
                field490 = arg1;
                field331.method2782(65);
                field331.method2585(arg3);
                field331.method2578(class106.field1729[82] ? 1 : 0);
            }
        }
        if (arg2 == 9) {
            class36 var38 = field326[arg3];
            if (var38 != null) {
                field501 = arg6;
                field396 = arg7;
                field477 = 2;
                field397 = 0;
                field519 = arg0;
                field490 = arg1;
                field331.method2782(113);
                field331.method2585(arg3);
                field331.method2578(class106.field1729[82] ? 1 : 0);
            }
        }
        if (arg2 == 3) {
            field501 = arg6;
            field396 = arg7;
            field477 = 2;
            field397 = 0;
            field519 = arg0;
            field490 = arg1;
            field331.method2782(45);
            field331.method2585(arg3 >> 14 & 0x7FFF);
            field331.method2641(class106.field1729[82] ? 1 : 0);
            field331.method2748(Statics.field284 + arg1);
            field331.method2586(Statics.field1735 + arg0);
        }
        if (arg2 == 41) {
            field331.method2782(211);
            field331.method2538(arg0);
            field331.method2748(arg3);
            field331.method2617(arg1);
            field399 = 0;
            Statics.field210 = class170.method2993(arg1);
            field400 = arg0;
        }
        if (arg2 == 8) {
            class36 var39 = field326[arg3];
            if (var39 != null) {
                field501 = arg6;
                field396 = arg7;
                field477 = 2;
                field397 = 0;
                field519 = arg0;
                field490 = arg1;
                field331.method2782(252);
                field331.method2748(field386);
                field331.method2748(arg3);
                field331.method2650(class106.field1729[82] ? 1 : 0);
                field331.method2594(Statics.field2129);
            }
        }
        if (arg2 == 19) {
            field501 = arg6;
            field396 = arg7;
            field477 = 2;
            field397 = 0;
            field519 = arg0;
            field490 = arg1;
            field331.method2782(107);
            field331.method2538(arg3);
            field331.method2578(class106.field1729[82] ? 1 : 0);
            field331.method2586(Statics.field1735 + arg0);
            field331.method2586(Statics.field284 + arg1);
        }
        if (arg2 == 16) {
            field501 = arg6;
            field396 = arg7;
            field477 = 2;
            field397 = 0;
            field519 = arg0;
            field490 = arg1;
            field331.method2782(136);
            field331.method2585(arg3);
            field331.method2538(Statics.field1735 + arg0);
            field331.method2585(Statics.field284 + arg1);
            field331.method2617(Statics.field245);
            field331.method2739(class106.field1729[82] ? 1 : 0);
            field331.method2748(Statics.field1832);
            field331.method2748(Statics.field1926);
        }
        if (arg2 == 15) {
            class24 var40 = field408[arg3];
            if (var40 != null) {
                field501 = arg6;
                field396 = arg7;
                field477 = 2;
                field397 = 0;
                field519 = arg0;
                field490 = arg1;
                field331.method2782(79);
                field331.method2538(arg3);
                field331.method2538(field386);
                field331.method2739(class106.field1729[82] ? 1 : 0);
                field331.method2594(Statics.field2129);
            }
        }
        if (arg2 == 35) {
            field331.method2782(76);
            field331.method2585(arg0);
            field331.method2748(arg3);
            field331.method2594(arg1);
            field399 = 0;
            Statics.field210 = class170.method2993(arg1);
            field400 = arg0;
        }
        if (arg2 == 1005) {
            class170 var41 = class170.method2993(arg1);
            if (var41 == null || var41.field2327[arg0] < 100000) {
                field331.method2782(23);
                field331.method2585(arg3);
            } else {
                class48.method184(27, "", var41.field2327[arg0] + " x " + class199.method2268(arg3).field2950);
            }
            field399 = 0;
            Statics.field210 = class170.method2993(arg1);
            field400 = arg0;
        }
        if (arg2 == 2) {
            field501 = arg6;
            field396 = arg7;
            field477 = 2;
            field397 = 0;
            field519 = arg0;
            field490 = arg1;
            field331.method2782(20);
            field331.method2748(Statics.field284 + arg1);
            field331.method2586(arg3 >> 14 & 0x7FFF);
            field331.method2748(Statics.field1735 + arg0);
            field331.method2585(field386);
            field331.method2594(Statics.field2129);
            field331.method2650(class106.field1729[82] ? 1 : 0);
        }
        if (arg2 == 44) {
            class24 var42 = field408[arg3];
            if (var42 != null) {
                field501 = arg6;
                field396 = arg7;
                field477 = 2;
                field397 = 0;
                field519 = arg0;
                field490 = arg1;
                field331.method2782(150);
                field331.method2739(class106.field1729[82] ? 1 : 0);
                field331.method2748(arg3);
            }
        }
        if (arg2 == 39) {
            field331.method2782(214);
            field331.method2748(arg3);
            field331.method2538(arg0);
            field331.method2617(arg1);
            field399 = 0;
            Statics.field210 = class170.method2993(arg1);
            field400 = arg0;
        }
        if (arg2 == 13) {
            class36 var43 = field326[arg3];
            if (var43 != null) {
                field501 = arg6;
                field396 = arg7;
                field477 = 2;
                field397 = 0;
                field519 = arg0;
                field490 = arg1;
                field331.method2782(168);
                field331.method2650(class106.field1729[82] ? 1 : 0);
                field331.method2538(arg3);
            }
        }
        if (arg2 == 30 && field449 == null) {
            field331.method2782(53);
            field331.method2748(arg0);
            field331.method2617(arg1);
            field449 = class170.method2271(arg1, arg0);
            method1786(field449);
        }
        if (arg2 == 58) {
            class170 var44 = class170.method2271(arg1, arg0);
            if (var44 != null) {
                field331.method2782(241);
                field331.method2540(Statics.field2129);
                field331.method2538(field442);
                field331.method2748(field386);
                field331.method2585(arg0);
                field331.method2595(arg1);
                field331.method2585(var44.field2328);
            }
        }
        if (arg2 == 43) {
            field331.method2782(69);
            field331.method2586(arg3);
            field331.method2617(arg1);
            field331.method2748(arg0);
            field399 = 0;
            Statics.field210 = class170.method2993(arg1);
            field400 = arg0;
        }
        if (arg2 == 1003) {
            field501 = arg6;
            field396 = arg7;
            field477 = 2;
            field397 = 0;
            class36 var45 = field326[arg3];
            if (var45 != null) {
                class200 var46 = var45.field772;
                if (var46.field3024 != null) {
                    var46 = var46.method3444();
                }
                if (var46 != null) {
                    field331.method2782(138);
                    field331.method2538(var46.field2998);
                }
            }
        }
        if (arg2 == 45) {
            class24 var47 = field408[arg3];
            if (var47 != null) {
                field501 = arg6;
                field396 = arg7;
                field477 = 2;
                field397 = 0;
                field519 = arg0;
                field490 = arg1;
                field331.method2782(104);
                field331.method2739(class106.field1729[82] ? 1 : 0);
                field331.method2585(arg3);
            }
        }
        if (arg2 == 17) {
            field501 = arg6;
            field396 = arg7;
            field477 = 2;
            field397 = 0;
            field519 = arg0;
            field490 = arg1;
            field331.method2782(156);
            field331.method2585(field386);
            field331.method2586(Statics.field1735 + arg0);
            field331.method2586(Statics.field284 + arg1);
            field331.method2578(class106.field1729[82] ? 1 : 0);
            field331.method2617(Statics.field2129);
            field331.method2538(arg3);
        }
        if (arg2 == 47) {
            class24 var48 = field408[arg3];
            if (var48 != null) {
                field501 = arg6;
                field396 = arg7;
                field477 = 2;
                field397 = 0;
                field519 = arg0;
                field490 = arg1;
                field331.method2782(201);
                field331.method2641(class106.field1729[82] ? 1 : 0);
                field331.method2748(arg3);
            }
        }
        if (arg2 == 37) {
            field331.method2782(77);
            field331.method2538(arg0);
            field331.method2595(arg1);
            field331.method2586(arg3);
            field399 = 0;
            Statics.field210 = class170.method2993(arg1);
            field400 = arg0;
        }
        if (arg2 != 38) {
            if (field438 != 0) {
                field438 = 0;
                method1786(class170.method2993(Statics.field245));
            }
            if (field440) {
                method31();
            }
            if (Statics.field210 != null && field399 == 0) {
                method1786(Statics.field210);
            }
            return;
        }
        method31();
        class170 var49 = class170.method2993(arg1);
        field438 = 1;
        Statics.field1926 = arg0;
        Statics.field245 = arg1;
        Statics.field1832 = arg3;
        method1786(var49);
        field439 = class38.method183(16748608) + class199.method2268(arg3).field2950 + class38.method183(16777215);
        if (field439 == null) {
            field439 = "null";
        }
    }

    @ObfuscatedName("n.bb(ILjava/lang/String;I)V")
    public static void method197(int arg0, String arg1) {
        int var2 = class46.field901;
        int[] var3 = class46.field903;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class24 var6 = field408[var3[var5]];
            if (var6 != null && Statics.field43 != var6 && var6.field264 != null && var6.field264.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field331.method2782(150);
                    field331.method2739(0);
                    field331.method2748(var3[var5]);
                } else if (arg0 == 4) {
                    field331.method2782(201);
                    field331.method2641(0);
                    field331.method2748(var3[var5]);
                } else if (arg0 == 6) {
                    field331.method2782(24);
                    field331.method2586(var3[var5]);
                    field331.method2650(0);
                } else if (arg0 == 7) {
                    field331.method2782(111);
                    field331.method2748(var3[var5]);
                    field331.method2578(0);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class48.method184(4, "", class174.field2508 + arg1);
        }
    }

    @ObfuscatedName("ak.ct(IIIIB)V")
    public static void method684(int arg0, int arg1, int arg2, int arg3) {
        class170 var4 = class170.method2271(arg0, arg1);
        if (var4 != null && var4.field2299 != null) {
            class19 var5 = new class19();
            var5.field194 = var4;
            var5.field204 = var4.field2299;
            class33.method166(var5);
        }
        field442 = arg3;
        field440 = true;
        Statics.field2129 = arg0;
        field386 = arg1;
        Statics.field1838 = arg2;
        method1786(var4);
    }

    @ObfuscatedName("g.ce(B)V")
    public static void method31() {
        if (!field440) {
            return;
        }
        class170 var0 = class170.method2271(Statics.field2129, field386);
        if (var0 != null && var0.field2252 != null) {
            class19 var1 = new class19();
            var1.field194 = var0;
            var1.field204 = var0.field2252;
            class33.method166(var1);
        }
        field440 = false;
        method1786(var0);
    }

    @ObfuscatedName("aj.cp(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method863(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field426 || field427 >= 500) {
            return;
        }
        field446[field427] = arg0;
        field433[field427] = arg1;
        field430[field427] = arg2;
        field423[field427] = arg3;
        field428[field427] = arg4;
        field343[field427] = arg5;
        field427++;
    }

    @ObfuscatedName("ci.cy(I)V")
    public static void method1768() {
        for (int var0 = 0; var0 < field427; var0++) {
            if (method53(field430[var0])) {
                if (var0 < field427 - 1) {
                    for (int var1 = var0; var1 < field427 - 1; var1++) {
                        field446[var1] = field446[var1 + 1];
                        field433[var1] = field433[var1 + 1];
                        field430[var1] = field430[var1 + 1];
                        field423[var1] = field423[var1 + 1];
                        field428[var1] = field428[var1 + 1];
                        field343[var1] = field343[var1 + 1];
                    }
                }
                field427--;
            }
        }
    }

    @ObfuscatedName("h.ch(II)Z")
    public static boolean method53(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("at.cu(IB)Ljava/lang/String;")
    public static String method764(int arg0) {
        return field433[arg0].length() > 0 ? field446[arg0] + class174.field2519 + field433[arg0] : field446[arg0];
    }

    @ObfuscatedName("av.cx(IIIII)V")
    public static final void method657(int arg0, int arg1, int arg2, int arg3) {
        if (field438 == 0 && !field440) {
            method863(class174.field2575, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class83.field1407; var6++) {
            int var7 = class83.field1408[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field2137.method1620(Statics.field1094, var8, var9, var7) >= 0) {
                    class198 var12 = class198.method2463(var11);
                    if (var12.field2932 != null) {
                        var12 = var12.method3323();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field438 == 1) {
                        method863(class174.field2509, field439 + " " + class38.field794 + " " + class38.method183(65535) + var12.field2901, 1, var7, var8, var9);
                    } else if (!field440) {
                        String[] var13 = var12.field2918;
                        if (field435) {
                            var13 = method717(var13);
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
                                    method863(var13[var14], class38.method183(65535) + var12.field2901, var15, var7, var8, var9);
                                }
                            }
                        }
                        method863(class174.field2510, class38.method183(65535) + var12.field2901, 1002, var12.field2898 << 14, var8, var9);
                    } else if ((Statics.field1838 & 0x4) == 4) {
                        method863(field563, field444 + " " + class38.field794 + " " + class38.method183(65535) + var12.field2901, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class36 var16 = field326[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field772.field3000 == 1 && (var16.field608 & 0x7F) == 64 && (var16.field605 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field493; var17++) {
                            class36 var18 = field326[field328[var17]];
                            if (var18 != null && var16 != var18 && var18.field772.field3000 == 1 && var16.field608 == var18.field608 && var16.field605 == var18.field605) {
                                method2087(var18.field772, field328[var17], var8, var9);
                            }
                        }
                        int var19 = class46.field901;
                        int[] var20 = class46.field903;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class24 var22 = field408[var20[var21]];
                            if (var22 != null && var16.field608 == var22.field608 && var16.field605 == var22.field605) {
                                method1775(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method2087(var16.field772, var11, var8, var9);
                }
                if (var10 == 0) {
                    class24 var23 = field408[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field608 & 0x7F) == 64 && (var23.field605 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field493; var24++) {
                            class36 var25 = field326[field328[var24]];
                            if (var25 != null && var25.field772.field3000 == 1 && var23.field608 == var25.field608 && var23.field605 == var25.field605) {
                                method2087(var25.field772, field328[var24], var8, var9);
                            }
                        }
                        int var26 = class46.field901;
                        int[] var27 = class46.field903;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class24 var29 = field408[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field608 == var29.field608 && var23.field605 == var29.field605) {
                                method1775(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field417 == var11) {
                        var4 = var7;
                    } else {
                        method1775(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class129 var30 = field418[Statics.field1094][var8][var9];
                    if (var30 != null) {
                        for (class44 var31 = (class44) var30.method2224(); var31 != null; var31 = (class44) var30.method2214()) {
                            class199 var32 = class199.method2268(var31.field891);
                            if (field438 == 1) {
                                method863(class174.field2509, field439 + " " + class38.field794 + " " + class38.method183(16748608) + var32.field2950, 16, var31.field891, var8, var9);
                            } else if (!field440) {
                                String[] var33 = var32.field2965;
                                if (field435) {
                                    var33 = method717(var33);
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
                                        method863(var33[var34], class38.method183(16748608) + var32.field2950, var35, var31.field891, var8, var9);
                                    } else if (var34 == 2) {
                                        method863(class174.field2381, class38.method183(16748608) + var32.field2950, 20, var31.field891, var8, var9);
                                    }
                                }
                                method863(class174.field2510, class38.method183(16748608) + var32.field2950, 1004, var31.field891, var8, var9);
                            } else if ((Statics.field1838 & 0x1) == 1) {
                                method863(field563, field444 + " " + class38.field794 + " " + class38.method183(16748608) + var32.field2950, 17, var31.field891, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class24 var38 = field408[field417];
            method1775(var38, field417, var36, var37);
        }
    }

    @ObfuscatedName("dw.co(Lgh;IIII)V")
    public static final void method2087(class200 arg0, int arg1, int arg2, int arg3) {
        if (field427 >= 400) {
            return;
        }
        if (arg0.field3024 != null) {
            arg0 = arg0.method3444();
        }
        if (arg0 == null || !arg0.field2994 || arg0.field3029 && field453 != arg1) {
            return;
        }
        String var4 = arg0.field3019;
        if (arg0.field3016 != 0) {
            int var6 = arg0.field3016;
            int var7 = Statics.field43.field253;
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
            var4 = var4 + var9 + " " + class38.field792 + class174.field2515 + arg0.field3016 + class38.field793;
        }
        if (field438 == 1) {
            method863(class174.field2509, field439 + " " + class38.field794 + " " + class38.method183(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field440) {
            String[] var10 = arg0.field3014;
            if (field435) {
                var10 = method717(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class174.field2511)) {
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
                        method863(var10[var11], class38.method183(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class174.field2511)) {
                        short var14 = 0;
                        if (field316 != class41.field825) {
                            if (field316 == class41.field819 || field316 == class41.field822 && arg0.field3016 > Statics.field43.field253) {
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
                            method863(var10[var13], class38.method183(16776960) + var4, var15, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method863(class174.field2510, class38.method183(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1838 & 0x2) == 2) {
            method863(field563, field444 + " " + class38.field794 + " " + class38.method183(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("cq.cl(Lr;IIII)V")
    public static final void method1775(class24 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field43 == arg0 || field427 >= 400) {
            return;
        }
        String var9;
        if (arg0.field255 == 0) {
            String var4 = arg0.field249[0] + arg0.field264 + arg0.field249[1];
            int var5 = arg0.field253;
            int var6 = Statics.field43.field253;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class38.method183(16711680);
            } else if (var7 < -6) {
                var8 = class38.method183(16723968);
            } else if (var7 < -3) {
                var8 = class38.method183(16740352);
            } else if (var7 < 0) {
                var8 = class38.method183(16756736);
            } else if (var7 > 9) {
                var8 = class38.method183(65280);
            } else if (var7 > 6) {
                var8 = class38.method183(4259584);
            } else if (var7 > 3) {
                var8 = class38.method183(8453888);
            } else if (var7 > 0) {
                var8 = class38.method183(12648192);
            } else {
                var8 = class38.method183(16776960);
            }
            var9 = var4 + var8 + " " + class38.field792 + class174.field2515 + arg0.field253 + class38.field793 + arg0.field249[2];
        } else {
            var9 = arg0.field249[0] + arg0.field264 + arg0.field249[1] + " " + class38.field792 + class174.field2516 + arg0.field255 + class38.field793 + arg0.field249[2];
        }
        if (field438 == 1) {
            method863(class174.field2509, field439 + " " + class38.field794 + " " + class38.method183(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field440) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field414[var10] != null) {
                    short var11 = 0;
                    if (field414[var10].equalsIgnoreCase(class174.field2511)) {
                        if (field377 == class41.field825) {
                            continue;
                        }
                        if (field377 == class41.field819 || field377 == class41.field822 && arg0.field253 > Statics.field43.field253) {
                            var11 = 2000;
                        }
                        if (Statics.field43.field268 != 0 && arg0.field268 != 0) {
                            if (Statics.field43.field268 == arg0.field268) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field374[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field413[var10] + var11;
                    method863(field414[var10], class38.method183(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1838 & 0x8) == 8) {
            method863(field563, field444 + " " + class38.field794 + " " + class38.method183(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field427; var14++) {
            if (field430[var14] == 23) {
                field433[var14] = class38.method183(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("am.cb(IIIIIIIIB)V")
    public static final void method567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class170.method26(arg0)) {
            Statics.field807 = null;
            method37(Statics.field2257[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field807 != null) {
                method37(Statics.field807, -1412584499, arg1, arg2, arg3, arg4, Statics.field2164, Statics.field102, arg7);
                Statics.field807 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field309[var8] = true;
            }
        } else {
            field309[arg7] = true;
        }
    }

    @ObfuscatedName("g.ck([Lfl;IIIIIIIII)V")
    public static final void method37(class170[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class220.method3690(arg2, arg3, arg4, arg5);
        class85.method1528();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class170 var10 = arg0[var9];
            if (var10 != null && (var10.field2232 == arg1 || arg1 == -1412584499 && field456 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field310[field488] = var10.field2331 + arg6;
                    field421[field488] = var10.field2222 + arg7;
                    field495[field488] = var10.field2223;
                    field357[field488] = var10.field2224;
                    var11 = ++field488 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2339 = var11;
                var10.field2340 = field299;
                if (!var10.field2205 || !method91(var10)) {
                    if (var10.field2263 > 0) {
                        int var12 = var10.field2263;
                        if (var12 == 324) {
                            if (field559 == -1) {
                                field559 = var10.field2243;
                                field560 = var10.field2244;
                            }
                            if (field496.field2190) {
                                var10.field2243 = field559;
                            } else {
                                var10.field2243 = field560;
                            }
                        } else if (var12 == 325) {
                            if (field559 == -1) {
                                field559 = var10.field2243;
                                field560 = var10.field2244;
                            }
                            if (field496.field2190) {
                                var10.field2243 = field560;
                            } else {
                                var10.field2243 = field559;
                            }
                        } else if (var12 == 327) {
                            var10.field2259 = 150;
                            var10.field2260 = (int) (Math.sin((double) field299 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2251 = 5;
                            var10.field2204 = 0;
                        } else if (var12 == 328) {
                            var10.field2259 = 150;
                            var10.field2260 = (int) (Math.sin((double) field299 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2251 = 5;
                            var10.field2204 = 1;
                        }
                    }
                    int var13 = var10.field2331 + arg6;
                    int var14 = var10.field2222 + arg7;
                    int var15 = var10.field2239;
                    if (field456 == var10) {
                        if (arg1 != -1412584499 && !var10.field2286) {
                            Statics.field807 = arg0;
                            Statics.field2164 = arg6;
                            Statics.field102 = arg7;
                            continue;
                        }
                        if (field469 && field389) {
                            int var16 = class116.field1815;
                            int var17 = class116.field1822;
                            int var18 = var16 - field460;
                            int var19 = var17 - field461;
                            if (var18 < field464) {
                                var18 = field464;
                            }
                            if (var10.field2223 + var18 > field464 + field436.field2223) {
                                var18 = field464 + field436.field2223 - var10.field2223;
                            }
                            if (var19 < field465) {
                                var19 = field465;
                            }
                            if (var10.field2224 + var19 > field465 + field436.field2224) {
                                var19 = field465 + field436.field2224 - var10.field2224;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2286) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2210 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2210 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2223 + var13;
                        int var27 = var10.field2224 + var14;
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
                        int var30 = var10.field2223 + var13;
                        int var31 = var10.field2224 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2205 || var20 < var22 && var21 < var23) {
                        if (var10.field2263 != 0) {
                            if (var10.field2263 == 1336) {
                                if (field476) {
                                    var14 += 15;
                                    Statics.field758.method3586("Fps:" + field1783, var10.field2223 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field315) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field315) {
                                        var34 = 16711680;
                                    }
                                    Statics.field758.method3586("Mem:" + var33 + "k", var10.field2223 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2263 == 1337) {
                                field505 = var13;
                                field502 = var14;
                                int var37 = var10.field2223;
                                int var38 = var10.field2224;
                                field392++;
                                method1777(class16.field169);
                                boolean var39 = false;
                                if (field417 >= 0) {
                                    int var40 = class46.field901;
                                    int[] var41 = class46.field903;
                                    for (int var42 = 0; var42 < var40; var42++) {
                                        if (field417 == var41[var42]) {
                                            var39 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var39) {
                                    method1777(class16.field168);
                                }
                                method2408(true);
                                method1777(var39 ? class16.field167 : class16.field166);
                                method2408(false);
                                for (class43 var43 = (class43) field420.method2201(); var43 != null; var43 = (class43) field420.method2203()) {
                                    if (Statics.field1094 != var43.field864 || field299 > var43.field870) {
                                        var43.method2189();
                                    } else if (field299 >= var43.field869) {
                                        if (var43.field877 > 0) {
                                            class36 var44 = field326[var43.field877 - 1];
                                            if (var44 != null && var44.field608 >= 0 && var44.field608 < 13312 && var44.field605 >= 0 && var44.field605 < 13312) {
                                                var43.method757(var44.field608, var44.field605, method878(var44.field608, var44.field605, var43.field864) - var43.field868, field299);
                                            }
                                        }
                                        if (var43.field877 < 0) {
                                            int var45 = -var43.field877 - 1;
                                            class24 var46;
                                            if (field409 == var45) {
                                                var46 = Statics.field43;
                                            } else {
                                                var46 = field408[var45];
                                            }
                                            if (var46 != null && var46.field608 >= 0 && var46.field608 < 13312 && var46.field605 >= 0 && var46.field605 < 13312) {
                                                var43.method757(var46.field608, var46.field605, method878(var46.field608, var46.field605, var43.field864) - var43.field868, field299);
                                            }
                                        }
                                        var43.method758(field364);
                                        Statics.field2137.method1601(Statics.field1094, (int) var43.field875, (int) var43.field876, (int) var43.field884, 60, var43, var43.field883, -1, false);
                                    }
                                }
                                method1075();
                                method3508(var13, var14, var37, var38, true);
                                int var47 = field547;
                                int var48 = field548;
                                int var49 = field549;
                                int var50 = field550;
                                class220.method3690(var47, var48, var47 + var49, var48 + var50);
                                class85.method1528();
                                if (!field555) {
                                    int var51 = field371;
                                    if (field380 / 256 > var51) {
                                        var51 = field380 / 256;
                                    }
                                    if (field534[4] && field536[4] + 128 > var51) {
                                        var51 = field536[4] + 128;
                                    }
                                    int var52 = field372 + field366 & 0x7FF;
                                    method1913(Statics.field2191, method878(Statics.field43.field608, Statics.field43.field605, Statics.field1094) - field322, Statics.field1804, var51, var52, var51 * 3 + 600);
                                }
                                int var53;
                                if (field555) {
                                    var53 = method2794();
                                } else {
                                    var53 = method1773();
                                }
                                int var54 = Statics.field1759;
                                int var55 = Statics.field2791;
                                int var56 = Statics.field178;
                                int var57 = Statics.field191;
                                int var58 = Statics.field1079;
                                for (int var59 = 0; var59 < 5; var59++) {
                                    if (field534[var59]) {
                                        int var60 = (int) (Math.random() * (double) (field535[var59] * 2 + 1) - (double) field535[var59] + Math.sin((double) field368[var59] / 100.0D * (double) field538[var59]) * (double) field536[var59]);
                                        if (var59 == 0) {
                                            Statics.field1759 += var60;
                                        }
                                        if (var59 == 1) {
                                            Statics.field2791 += var60;
                                        }
                                        if (var59 == 2) {
                                            Statics.field178 += var60;
                                        }
                                        if (var59 == 3) {
                                            Statics.field1079 = Statics.field1079 + var60 & 0x7FF;
                                        }
                                        if (var59 == 4) {
                                            Statics.field191 += var60;
                                            if (Statics.field191 < 128) {
                                                Statics.field191 = 128;
                                            }
                                            if (Statics.field191 > 383) {
                                                Statics.field191 = 383;
                                            }
                                        }
                                    }
                                }
                                int var61 = class116.field1815;
                                int var62 = class116.field1822;
                                if (class116.field1821 != 0) {
                                    var61 = class116.field1824;
                                    var62 = class116.field1826;
                                }
                                if (var61 >= var47 && var61 < var47 + var49 && var62 >= var48 && var62 < var48 + var50) {
                                    class83.field1404 = true;
                                    class83.field1407 = 0;
                                    class83.field1360 = var61 - var47;
                                    class83.field1396 = var62 - var48;
                                } else {
                                    class83.field1404 = false;
                                    class83.field1407 = 0;
                                }
                                method3101();
                                class220.method3696(var47, var48, var49, var50, 0);
                                method3101();
                                int var63 = class85.field1442;
                                class85.field1442 = field570;
                                Statics.field2137.method1628(Statics.field1759, Statics.field2791, Statics.field178, Statics.field191, Statics.field1079, var53);
                                class85.field1442 = var63;
                                method3101();
                                Statics.field2137.method1604();
                                method86(var47, var48, var49, var50);
                                Statics.method3672(var47, var48);
                                ((class75) Statics.field1443).method1334(field364);
                                method174(var47, var48, var49, var50);
                                Statics.field1759 = var54;
                                Statics.field2791 = var55;
                                Statics.field178 = var56;
                                Statics.field191 = var57;
                                Statics.field1079 = var58;
                                if (field298) {
                                    byte var64 = 0;
                                    int var65 = class186.field2766 + class186.field2762 + var64;
                                    if (var65 == 0) {
                                        field298 = false;
                                    }
                                }
                                if (field298) {
                                    class220.method3696(var47, var48, var49, var50, 0);
                                    Statics.method1778(class174.field2371, false);
                                }
                                field309[var10.field2339] = true;
                                class220.method3690(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2263 == 1338) {
                                method3101();
                                class165 var67 = var10.method2929(false);
                                if (var67 != null) {
                                    class220.method3690(var13, var14, var67.field2165 + var13, var67.field2166 + var14);
                                    if (field521 == 2 || field521 == 5) {
                                        class220.method3718(var13, var14, 0, var67.field2163, var67.field2169);
                                    } else {
                                        int var68 = field372 + field359 & 0x7FF;
                                        int var69 = Statics.field43.field608 / 32 + 48;
                                        int var70 = 464 - Statics.field43.field605 / 32;
                                        Statics.field2119.method3825(var13, var14, var67.field2165, var67.field2166, var69, var70, var68, field361 + 256, var67.field2163, var67.field2169);
                                        for (int var71 = 0; var71 < field378; var71++) {
                                            int var72 = field424[var71] * 4 + 2 - Statics.field43.field608 / 32;
                                            int var73 = field475[var71] * 4 + 2 - Statics.field43.field605 / 32;
                                            method1763(var13, var14, var72, var73, field518[var71], var67);
                                        }
                                        int var74 = 0;
                                        while (true) {
                                            if (var74 >= 104) {
                                                for (int var79 = 0; var79 < field493; var79++) {
                                                    class36 var80 = field326[field328[var79]];
                                                    if (var80 != null && var80.method216()) {
                                                        class200 var81 = var80.field772;
                                                        if (var81 != null && var81.field3024 != null) {
                                                            var81 = var81.method3444();
                                                        }
                                                        if (var81 != null && var81.field3030 && var81.field2994) {
                                                            int var82 = var80.field608 / 32 - Statics.field43.field608 / 32;
                                                            int var83 = var80.field605 / 32 - Statics.field43.field605 / 32;
                                                            method1763(var13, var14, var82, var83, Statics.field2143[1], var67);
                                                        }
                                                    }
                                                }
                                                int var84 = class46.field901;
                                                int[] var85 = class46.field903;
                                                for (int var86 = 0; var86 < var84; var86++) {
                                                    class24 var87 = field408[var85[var86]];
                                                    if (var87 != null && var87.method216() && !var87.field269 && Statics.field43 != var87) {
                                                        int var88 = var87.field608 / 32 - Statics.field43.field608 / 32;
                                                        int var89 = var87.field605 / 32 - Statics.field43.field605 / 32;
                                                        boolean var90 = false;
                                                        if (method2760(var87.field264, true)) {
                                                            var90 = true;
                                                        }
                                                        boolean var91 = false;
                                                        for (int var92 = 0; var92 < Statics.field2679; var92++) {
                                                            if (var87.field264.equals(Statics.field1763[var92].field283)) {
                                                                var91 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var93 = false;
                                                        if (Statics.field43.field268 != 0 && var87.field268 != 0 && Statics.field43.field268 == var87.field268) {
                                                            var93 = true;
                                                        }
                                                        if (var90) {
                                                            method1763(var13, var14, var88, var89, Statics.field2143[3], var67);
                                                        } else if (var93) {
                                                            method1763(var13, var14, var88, var89, Statics.field2143[4], var67);
                                                        } else if (var91) {
                                                            method1763(var13, var14, var88, var89, Statics.field2143[5], var67);
                                                        } else {
                                                            method1763(var13, var14, var88, var89, Statics.field2143[2], var67);
                                                        }
                                                    }
                                                }
                                                if (field307 != 0 && field299 % 20 < 10) {
                                                    if (field307 == 1 && field308 >= 0 && field308 < field326.length) {
                                                        class36 var94 = field326[field308];
                                                        if (var94 != null) {
                                                            int var95 = var94.field608 / 32 - Statics.field43.field608 / 32;
                                                            int var96 = var94.field605 / 32 - Statics.field43.field605 / 32;
                                                            method3348(var13, var14, var95, var96, Statics.field275[1], var67);
                                                        }
                                                    }
                                                    if (field307 == 2) {
                                                        int var97 = field334 * 4 - Statics.field1735 * 4 + 2 - Statics.field43.field608 / 32;
                                                        int var98 = field365 * 4 - Statics.field284 * 4 + 2 - Statics.field43.field605 / 32;
                                                        method3348(var13, var14, var97, var98, Statics.field275[1], var67);
                                                    }
                                                    if (field307 == 10 && field358 >= 0 && field358 < field408.length) {
                                                        class24 var99 = field408[field358];
                                                        if (var99 != null) {
                                                            int var100 = var99.field608 / 32 - Statics.field43.field608 / 32;
                                                            int var101 = var99.field605 / 32 - Statics.field43.field605 / 32;
                                                            method3348(var13, var14, var100, var101, Statics.field275[1], var67);
                                                        }
                                                    }
                                                }
                                                if (field519 != 0) {
                                                    int var102 = field519 * 4 + 2 - Statics.field43.field608 / 32;
                                                    int var103 = field490 * 4 + 2 - Statics.field43.field605 / 32;
                                                    method1763(var13, var14, var102, var103, Statics.field275[0], var67);
                                                }
                                                if (!Statics.field43.field269) {
                                                    class220.method3696(var67.field2165 / 2 + var13 - 1, var67.field2166 / 2 + var14 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var75 = 0; var75 < 104; var75++) {
                                                class129 var76 = field418[Statics.field1094][var74][var75];
                                                if (var76 != null) {
                                                    int var77 = var74 * 4 + 2 - Statics.field43.field608 / 32;
                                                    int var78 = var75 * 4 + 2 - Statics.field43.field605 / 32;
                                                    method1763(var13, var14, var77, var78, Statics.field2143[0], var67);
                                                }
                                            }
                                            var74++;
                                        }
                                    }
                                    field491[var11] = true;
                                }
                                class220.method3690(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2263 == 1339) {
                                method149(var10, var13, var14, var11);
                                class220.method3690(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2210 == 0) {
                            if (!var10.field2205 && method91(var10) && Statics.field246 != var10) {
                                continue;
                            }
                            if (!var10.field2205) {
                                if (var10.field2230 > var10.field2203 - var10.field2224) {
                                    var10.field2230 = var10.field2203 - var10.field2224;
                                }
                                if (var10.field2230 < 0) {
                                    var10.field2230 = 0;
                                }
                            }
                            method37(arg0, var10.field2208, var20, var21, var22, var23, var13 - var10.field2229, var14 - var10.field2230, var11);
                            if (var10.field2332 != null) {
                                method37(var10.field2332, var10.field2208, var20, var21, var22, var23, var13 - var10.field2229, var14 - var10.field2230, var11);
                            }
                            class18 var104 = (class18) field419.method2151((long) var10.field2208);
                            if (var104 != null) {
                                method567(var104.field184, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class220.method3690(arg2, arg3, arg4, arg5);
                            class85.method1528();
                        }
                        if (field499 || field492[var11] || field497 > 1) {
                            if (var10.field2210 == 0 && !var10.field2205 && var10.field2203 > var10.field2224) {
                                method2996(var10.field2223 + var13, var14, var10.field2230, var10.field2224, var10.field2203);
                            }
                            if (var10.field2210 != 1) {
                                if (var10.field2210 == 2) {
                                    int var105 = 0;
                                    for (int var106 = 0; var106 < var10.field2216; var106++) {
                                        for (int var107 = 0; var107 < var10.field2219; var107++) {
                                            int var108 = (var10.field2274 + 32) * var107 + var13;
                                            int var109 = (var10.field2201 + 32) * var106 + var14;
                                            if (var105 < 20) {
                                                var108 += var10.field2276[var105];
                                                var109 += var10.field2316[var105];
                                            }
                                            if (var10.field2326[var105] > 0) {
                                                boolean var110 = false;
                                                boolean var111 = false;
                                                int var112 = var10.field2326[var105] - 1;
                                                if (var108 + 32 > arg2 && var108 < arg4 && var109 + 32 > arg3 && var109 < arg5 || Statics.field670 == var10 && field401 == var105) {
                                                    class225 var113;
                                                    if (field438 == 1 && Statics.field1926 == var105 && Statics.field245 == var10.field2208) {
                                                        var113 = class199.method1779(var112, var10.field2327[var105], 2, 0, 2, false);
                                                    } else {
                                                        var113 = class199.method1779(var112, var10.field2327[var105], 1, 3153952, 2, false);
                                                    }
                                                    if (var113 == null) {
                                                        method1786(var10);
                                                    } else if (Statics.field670 == var10 && field401 == var105) {
                                                        int var114 = class116.field1815 - field432;
                                                        int var115 = class116.field1822 - field388;
                                                        if (var114 < 5 && var114 > -5) {
                                                            var114 = 0;
                                                        }
                                                        if (var115 < 5 && var115 > -5) {
                                                            var115 = 0;
                                                        }
                                                        if (field406 < 5) {
                                                            var114 = 0;
                                                            var115 = 0;
                                                        }
                                                        var113.method3820(var108 + var114, var109 + var115, 128);
                                                        if (arg1 != -1) {
                                                            class170 var116 = arg0[arg1 & 0xFFFF];
                                                            if (var109 + var115 < class220.field3172 && var116.field2230 > 0) {
                                                                int var117 = field364 * (class220.field3172 - var109 - var115) / 3;
                                                                if (var117 > field364 * 10) {
                                                                    var117 = field364 * 10;
                                                                }
                                                                if (var117 > var116.field2230) {
                                                                    var117 = var116.field2230;
                                                                }
                                                                var116.field2230 -= var117;
                                                                field388 += var117;
                                                                method1786(var116);
                                                            }
                                                            if (var109 + var115 + 32 > class220.field3174 && var116.field2230 < var116.field2203 - var116.field2224) {
                                                                int var118 = field364 * (var109 + var115 + 32 - class220.field3174) / 3;
                                                                if (var118 > field364 * 10) {
                                                                    var118 = field364 * 10;
                                                                }
                                                                if (var118 > var116.field2203 - var116.field2224 - var116.field2230) {
                                                                    var118 = var116.field2203 - var116.field2224 - var116.field2230;
                                                                }
                                                                var116.field2230 += var118;
                                                                field388 -= var118;
                                                                method1786(var116);
                                                            }
                                                        }
                                                    } else if (Statics.field210 == var10 && field400 == var105) {
                                                        var113.method3820(var108, var109, 128);
                                                    } else {
                                                        var113.method3814(var108, var109);
                                                    }
                                                }
                                            } else if (var10.field2226 != null && var105 < 20) {
                                                class225 var119 = var10.method2931(var105);
                                                if (var119 != null) {
                                                    var119.method3814(var108, var109);
                                                } else if (class170.field2270) {
                                                    method1786(var10);
                                                }
                                            }
                                            var105++;
                                        }
                                    }
                                } else if (var10.field2210 == 3) {
                                    int var120;
                                    if (method230(var10)) {
                                        var120 = var10.field2234;
                                        if (Statics.field246 == var10 && var10.field2236 != 0) {
                                            var120 = var10.field2236;
                                        }
                                    } else {
                                        var120 = var10.field2309;
                                        if (Statics.field246 == var10 && var10.field2235 != 0) {
                                            var120 = var10.field2235;
                                        }
                                    }
                                    if (var10.field2301) {
                                        switch(var10.field2242.field3188) {
                                            case 1:
                                                class220.method3697(var13, var14, var10.field2223, var10.field2224, var10.field2309, var10.field2234, 256 - (var10.field2239 & 0xFF), 256 - (var10.field2200 & 0xFF));
                                                break;
                                            case 2:
                                                class220.method3722(var13, var14, var10.field2223, var10.field2224, var10.field2309, var10.field2234, 256 - (var10.field2239 & 0xFF), 256 - (var10.field2200 & 0xFF));
                                                break;
                                            case 3:
                                                class220.method3699(var13, var14, var10.field2223, var10.field2224, var10.field2309, var10.field2234, 256 - (var10.field2239 & 0xFF), 256 - (var10.field2200 & 0xFF));
                                                break;
                                            case 4:
                                                class220.method3700(var13, var14, var10.field2223, var10.field2224, var10.field2309, var10.field2234, 256 - (var10.field2239 & 0xFF), 256 - (var10.field2200 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class220.method3696(var13, var14, var10.field2223, var10.field2224, var120);
                                                } else {
                                                    class220.method3695(var13, var14, var10.field2223, var10.field2224, var120, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class220.method3702(var13, var14, var10.field2223, var10.field2224, var120);
                                    } else {
                                        class220.method3703(var13, var14, var10.field2223, var10.field2224, var120, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2210 == 4) {
                                    class209 var121 = var10.method2927();
                                    if (var121 != null) {
                                        String var122 = var10.field2268;
                                        int var123;
                                        if (method230(var10)) {
                                            var123 = var10.field2234;
                                            if (Statics.field246 == var10 && var10.field2236 != 0) {
                                                var123 = var10.field2236;
                                            }
                                            if (var10.field2269.length() > 0) {
                                                var122 = var10.field2269;
                                            }
                                        } else {
                                            var123 = var10.field2309;
                                            if (Statics.field246 == var10 && var10.field2235 != 0) {
                                                var123 = var10.field2235;
                                            }
                                        }
                                        if (var10.field2205 && var10.field2328 != -1) {
                                            class199 var124 = class199.method2268(var10.field2328);
                                            var122 = var124.field2950;
                                            if (var122 == null) {
                                                var122 = "null";
                                            }
                                            if ((var124.field2961 == 1 || var10.field2265 != 1) && var10.field2265 != -1) {
                                                var122 = class38.method183(16748608) + var122 + class38.field797 + " " + 'x' + method1307(var10.field2265);
                                            }
                                        }
                                        if (field449 == var10) {
                                            class174 var10000 = (class174) null;
                                            var122 = class174.field2517;
                                            var123 = var10.field2309;
                                        }
                                        if (!var10.field2205) {
                                            var122 = method2795(var122, var10);
                                        }
                                        var121.method3625(var122, var13, var14, var10.field2223, var10.field2224, var123, var10.field2206 ? 0 : -1, var10.field2271, var10.field2272, var10.field2211);
                                    } else if (class170.field2270) {
                                        method1786(var10);
                                    }
                                } else if (var10.field2210 == 5) {
                                    if (var10.field2205) {
                                        class225 var126;
                                        if (var10.field2328 == -1) {
                                            var126 = var10.method2926(false);
                                        } else {
                                            var126 = class199.method1779(var10.field2328, var10.field2265, var10.field2247, var10.field2248, var10.field2212, false);
                                        }
                                        if (var126 != null) {
                                            int var127 = var126.field3209;
                                            int var128 = var126.field3210;
                                            if (var10.field2246) {
                                                class220.method3691(var13, var14, var10.field2223 + var13, var10.field2224 + var14);
                                                int var129 = (var10.field2223 + (var127 - 1)) / var127;
                                                int var130 = (var10.field2224 + (var128 - 1)) / var128;
                                                for (int var131 = 0; var131 < var129; var131++) {
                                                    for (int var132 = 0; var132 < var130; var132++) {
                                                        if (var10.field2245 != 0) {
                                                            var126.method3849(var127 / 2 + var127 * var131 + var13, var128 / 2 + var128 * var132 + var14, var10.field2245, 4096);
                                                        } else if (var15 == 0) {
                                                            var126.method3814(var127 * var131 + var13, var128 * var132 + var14);
                                                        } else {
                                                            var126.method3820(var127 * var131 + var13, var128 * var132 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class220.method3690(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var133 = var10.field2223 * 4096 / var127;
                                                if (var10.field2245 != 0) {
                                                    var126.method3849(var10.field2223 / 2 + var13, var10.field2224 / 2 + var14, var10.field2245, var133);
                                                } else if (var15 != 0) {
                                                    var126.method3817(var13, var14, var10.field2223, var10.field2224, 256 - (var15 & 0xFF));
                                                } else if (var10.field2223 == var127 && var10.field2224 == var128) {
                                                    var126.method3814(var13, var14);
                                                } else {
                                                    var126.method3816(var13, var14, var10.field2223, var10.field2224);
                                                }
                                            }
                                        } else if (class170.field2270) {
                                            method1786(var10);
                                        }
                                    } else {
                                        class225 var125 = var10.method2926(method230(var10));
                                        if (var125 != null) {
                                            var125.method3814(var13, var14);
                                        } else if (class170.field2270) {
                                            method1786(var10);
                                        }
                                    }
                                } else if (var10.field2210 == 6) {
                                    boolean var134 = method230(var10);
                                    int var135;
                                    if (var134) {
                                        var135 = var10.field2241;
                                    } else {
                                        var135 = var10.field2255;
                                    }
                                    class83 var136 = null;
                                    int var137 = 0;
                                    if (var10.field2328 != -1) {
                                        class199 var138 = class199.method2268(var10.field2328);
                                        if (var138 != null) {
                                            class199 var139 = var138.method3362(var10.field2265);
                                            var136 = var139.method3365(1);
                                            if (var136 == null) {
                                                method1786(var10);
                                            } else {
                                                var136.method1445();
                                                var137 = var136.field1534 / 2;
                                            }
                                        }
                                    } else if (var10.field2251 == 5) {
                                        if (var10.field2204 == 0) {
                                            var136 = field496.method2882((class202) null, -1, (class202) null, -1);
                                        } else {
                                            var136 = Statics.field43.method212();
                                        }
                                    } else if (var135 == -1) {
                                        var136 = var10.method2928((class202) null, -1, var134, Statics.field43.field254);
                                        if (var136 == null && class170.field2270) {
                                            method1786(var10);
                                        }
                                    } else {
                                        class202 var140 = class202.method658(var135);
                                        var136 = var10.method2928(var140, var10.field2330, var134, Statics.field43.field254);
                                        if (var136 == null && class170.field2270) {
                                            method1786(var10);
                                        }
                                    }
                                    class85.method1526(var10.field2223 / 2 + var13, var10.field2224 / 2 + var14);
                                    int var141 = var10.field2262 * class85.field1436[var10.field2259] >> 16;
                                    int var142 = var10.field2262 * class85.field1447[var10.field2259] >> 16;
                                    if (var136 != null) {
                                        if (var10.field2205) {
                                            var136.method1445();
                                            if (var10.field2342) {
                                                var136.method1463(0, var10.field2260, var10.field2266, var10.field2259, var10.field2292, var10.field2258 + var137 + var141, var10.field2258 + var142, var10.field2262);
                                            } else {
                                                var136.method1462(0, var10.field2260, var10.field2266, var10.field2259, var10.field2292, var10.field2258 + var137 + var141, var10.field2258 + var142);
                                            }
                                        } else {
                                            var136.method1462(0, var10.field2260, 0, var10.field2259, 0, var141, var142);
                                        }
                                    }
                                    class85.method1534();
                                } else {
                                    if (var10.field2210 == 7) {
                                        class209 var143 = var10.method2927();
                                        if (var143 == null) {
                                            if (class170.field2270) {
                                                method1786(var10);
                                            }
                                            continue;
                                        }
                                        int var144 = 0;
                                        for (int var145 = 0; var145 < var10.field2216; var145++) {
                                            for (int var146 = 0; var146 < var10.field2219; var146++) {
                                                if (var10.field2326[var144] > 0) {
                                                    class199 var147 = class199.method2268(var10.field2326[var144] - 1);
                                                    String var148;
                                                    if (var147.field2961 != 1 && var10.field2327[var144] == 1) {
                                                        var148 = class38.method183(16748608) + var147.field2950 + class38.field797;
                                                    } else {
                                                        var148 = class38.method183(16748608) + var147.field2950 + class38.field797 + " " + 'x' + method1307(var10.field2327[var144]);
                                                    }
                                                    int var149 = (var10.field2274 + 115) * var146 + var13;
                                                    int var150 = (var10.field2201 + 12) * var145 + var14;
                                                    if (var10.field2271 == 0) {
                                                        var143.method3584(var148, var149, var150, var10.field2309, var10.field2206 ? 0 : -1);
                                                    } else if (var10.field2271 == 1) {
                                                        var143.method3587(var148, var10.field2223 / 2 + var149, var150, var10.field2309, var10.field2206 ? 0 : -1);
                                                    } else {
                                                        var143.method3586(var148, var10.field2223 + var149 - 1, var150, var10.field2309, var10.field2206 ? 0 : -1);
                                                    }
                                                }
                                                var144++;
                                            }
                                        }
                                    }
                                    if (var10.field2210 == 8 && Statics.field1193 == var10 && field513 == field437) {
                                        int var151 = 0;
                                        int var152 = 0;
                                        class209 var153 = Statics.field758;
                                        String var154 = var10.field2268;
                                        String var155 = method2795(var154, var10);
                                        while (var155.length() > 0) {
                                            int var156 = var155.indexOf(class38.field795);
                                            String var157;
                                            if (var156 == -1) {
                                                var157 = var155;
                                                var155 = "";
                                            } else {
                                                var157 = var155.substring(0, var156);
                                                var155 = var155.substring(var156 + 4);
                                            }
                                            int var158 = var153.method3575(var157);
                                            if (var158 > var151) {
                                                var151 = var158;
                                            }
                                            var152 += var153.field3103 + 1;
                                        }
                                        var151 += 6;
                                        var152 += 7;
                                        int var159 = var10.field2223 + var13 - 5 - var151;
                                        int var160 = var10.field2224 + var14 + 5;
                                        if (var159 < var13 + 5) {
                                            var159 = var13 + 5;
                                        }
                                        if (var151 + var159 > arg4) {
                                            var159 = arg4 - var151;
                                        }
                                        if (var152 + var160 > arg5) {
                                            var160 = arg5 - var152;
                                        }
                                        class220.method3696(var159, var160, var151, var152, 16777120);
                                        class220.method3702(var159, var160, var151, var152, 0);
                                        String var161 = var10.field2268;
                                        int var162 = var153.field3103 + var160 + 2;
                                        String var163 = method2795(var161, var10);
                                        while (var163.length() > 0) {
                                            int var164 = var163.indexOf(class38.field795);
                                            String var165;
                                            if (var164 == -1) {
                                                var165 = var163;
                                                var163 = "";
                                            } else {
                                                var165 = var163.substring(0, var164);
                                                var163 = var163.substring(var164 + 4);
                                            }
                                            var153.method3584(var165, var159 + 3, var162, 0, -1);
                                            var162 += var153.field3103 + 1;
                                        }
                                    }
                                    if (var10.field2210 == 9) {
                                        if (var10.field2312 == 1) {
                                            int var166;
                                            int var167;
                                            int var168;
                                            int var169;
                                            if (var10.field2221) {
                                                var166 = var13;
                                                var167 = var10.field2224 + var14;
                                                var168 = var10.field2223 + var13;
                                                var169 = var14;
                                            } else {
                                                var166 = var13;
                                                var167 = var14;
                                                var168 = var10.field2223 + var13;
                                                var169 = var10.field2224 + var14;
                                            }
                                            class220.method3708(var166, var167, var168, var169, var10.field2309);
                                        } else {
                                            int var170 = var10.field2223 >= 0 ? var10.field2223 : -var10.field2223;
                                            int var171 = var10.field2224 >= 0 ? var10.field2224 : -var10.field2224;
                                            int var172 = var170;
                                            if (var170 < var171) {
                                                var172 = var171;
                                            }
                                            if (var172 != 0) {
                                                int var173 = (var10.field2223 << 16) / var172;
                                                int var174 = (var10.field2224 << 16) / var172;
                                                if (var174 <= var173) {
                                                    var173 = -var173;
                                                } else {
                                                    var174 = -var174;
                                                }
                                                int var175 = var10.field2312 * var174 >> 17;
                                                int var176 = var10.field2312 * var174 + 1 >> 17;
                                                int var177 = var10.field2312 * var173 >> 17;
                                                int var178 = var10.field2312 * var173 + 1 >> 17;
                                                int var179 = var13 + var175;
                                                int var180 = var13 - var176;
                                                int var181 = var10.field2223 + var13 - var176;
                                                int var182 = var10.field2223 + var13 + var175;
                                                int var183 = var14 + var177;
                                                int var184 = var14 - var178;
                                                int var185 = var10.field2224 + var14 - var178;
                                                int var186 = var10.field2224 + var14 + var177;
                                                class85.method1531(var179, var180, var181);
                                                class85.method1584(var183, var184, var185, var179, var180, var181, var10.field2309);
                                                class85.method1531(var179, var181, var182);
                                                class85.method1584(var183, var185, var186, var179, var181, var182, var10.field2309);
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

    @ObfuscatedName("fp.cn(Ljava/lang/String;Lfl;B)Ljava/lang/String;")
    public static String method2795(String arg0, class170 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method2995(method236(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field679 != null) {
                    int var6 = Statics.field679.field1657;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field679.field1663 != null) {
                        var5 = (String) Statics.field679.field1663;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("by.cr(II)Ljava/lang/String;")
    public static final String method1307(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class38.field801 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class38.method183(65408) + var1.substring(0, var1.length() - 8) + class174.field2520 + " " + class38.field792 + var1 + class38.field793 + class38.field797;
        } else if (var1.length() > 6) {
            return " " + class38.method183(16777215) + var1.substring(0, var1.length() - 4) + class174.field2640 + " " + class38.field792 + var1 + class38.field793 + class38.field797;
        } else {
            return " " + class38.method183(16776960) + var1 + class38.field797;
        }
    }

    @ObfuscatedName("de.ci(ZI)V")
    public static final void method1926(boolean arg0) {
        int var1 = field445;
        int var2 = Statics.field1201;
        int var3 = Statics.field1585;
        if (class170.method26(var1)) {
            method1780(Statics.field2257[var1], -1, var2, var3, arg0);
        }
    }

    @ObfuscatedName("u.cc(Lfl;I)V")
    public static void method95(class170 arg0) {
        class170 var1 = arg0.field2232 == -1 ? null : class170.method2993(arg0.field2232);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field1201;
            var3 = Statics.field1585;
        } else {
            var2 = var1.field2223;
            var3 = var1.field2224;
        }
        method2297(arg0, var2, var3, false);
        method1757(arg0, var2, var3);
    }

    @ObfuscatedName("ck.cq([Lfl;Lfl;ZI)V")
    public static void method1754(class170[] arg0, class170 arg1, boolean arg2) {
        int var3 = arg1.field2329 == 0 ? arg1.field2223 : arg1.field2329;
        int var4 = arg1.field2203 == 0 ? arg1.field2224 : arg1.field2203;
        method1780(arg0, arg1.field2208, var3, var4, arg2);
        if (arg1.field2332 != null) {
            method1780(arg1.field2332, arg1.field2208, var3, var4, arg2);
        }
        class18 var5 = (class18) field419.method2151((long) arg1.field2208);
        if (var5 != null) {
            int var6 = var5.field184;
            if (class170.method26(var6)) {
                method1780(Statics.field2257[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2263 == 1337) {
        }
    }

    @ObfuscatedName("cg.cg([Lfl;IIIZI)V")
    public static void method1780(class170[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class170 var6 = arg0[var5];
            if (var6 != null && var6.field2232 == arg1) {
                method2297(var6, arg2, arg3, arg4);
                method1757(var6, arg2, arg3);
                if (var6.field2229 > var6.field2329 - var6.field2223) {
                    var6.field2229 = var6.field2329 - var6.field2223;
                }
                if (var6.field2229 < 0) {
                    var6.field2229 = 0;
                }
                if (var6.field2230 > var6.field2203 - var6.field2224) {
                    var6.field2230 = var6.field2203 - var6.field2224;
                }
                if (var6.field2230 < 0) {
                    var6.field2230 = 0;
                }
                if (var6.field2210 == 0) {
                    method1754(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ev.cw(Lfl;IIZI)V")
    public static void method2297(class170 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2223;
        int var5 = arg0.field2224;
        if (arg0.field2215 == 0) {
            arg0.field2223 = arg0.field2219;
        } else if (arg0.field2215 == 1) {
            arg0.field2223 = arg1 - arg0.field2219;
        } else if (arg0.field2215 == 2) {
            arg0.field2223 = arg0.field2219 * arg1 >> 14;
        }
        if (arg0.field2254 == 0) {
            arg0.field2224 = arg0.field2216;
        } else if (arg0.field2254 == 1) {
            arg0.field2224 = arg2 - arg0.field2216;
        } else if (arg0.field2254 == 2) {
            arg0.field2224 = arg0.field2216 * arg2 >> 14;
        }
        if (arg0.field2215 == 4) {
            arg0.field2223 = arg0.field2225 * arg0.field2224 / arg0.field2233;
        }
        if (arg0.field2254 == 4) {
            arg0.field2224 = arg0.field2233 * arg0.field2223 / arg0.field2225;
        }
        if (field455 && arg0.field2210 == 0) {
            if (arg0.field2224 < 5 && arg0.field2223 < 5) {
                arg0.field2224 = 5;
                arg0.field2223 = 5;
            } else {
                if (arg0.field2224 <= 0) {
                    arg0.field2224 = 5;
                }
                if (arg0.field2223 <= 0) {
                    arg0.field2223 = 5;
                }
            }
        }
        if (arg0.field2263 == 1337) {
            field567 = arg0;
        }
        if (arg3 && arg0.field2317 != null && (arg0.field2223 != var4 || arg0.field2224 != var5)) {
            class19 var6 = new class19();
            var6.field194 = arg0;
            var6.field204 = arg0.field2317;
            field484.method2213(var6);
        }
    }

    @ObfuscatedName("cn.cv(Lfl;III)V")
    public static void method1757(class170 arg0, int arg1, int arg2) {
        if (arg0.field2213 == 0) {
            arg0.field2331 = arg0.field2217;
        } else if (arg0.field2213 == 1) {
            arg0.field2331 = (arg1 - arg0.field2223) / 2 + arg0.field2217;
        } else if (arg0.field2213 == 2) {
            arg0.field2331 = arg1 - arg0.field2223 - arg0.field2217;
        } else if (arg0.field2213 == 3) {
            arg0.field2331 = arg0.field2217 * arg1 >> 14;
        } else if (arg0.field2213 == 4) {
            arg0.field2331 = (arg0.field2217 * arg1 >> 14) + (arg1 - arg0.field2223) / 2;
        } else {
            arg0.field2331 = arg1 - arg0.field2223 - (arg0.field2217 * arg1 >> 14);
        }
        if (arg0.field2237 == 0) {
            arg0.field2222 = arg0.field2218;
        } else if (arg0.field2237 == 1) {
            arg0.field2222 = (arg2 - arg0.field2224) / 2 + arg0.field2218;
        } else if (arg0.field2237 == 2) {
            arg0.field2222 = arg2 - arg0.field2224 - arg0.field2218;
        } else if (arg0.field2237 == 3) {
            arg0.field2222 = arg0.field2218 * arg2 >> 14;
        } else if (arg0.field2237 == 4) {
            arg0.field2222 = (arg0.field2218 * arg2 >> 14) + (arg2 - arg0.field2224) / 2;
        } else {
            arg0.field2222 = arg2 - arg0.field2224 - (arg0.field2218 * arg2 >> 14);
        }
        if (!field455 || arg0.field2210 != 0) {
            return;
        }
        if (arg0.field2331 < 0) {
            arg0.field2331 = 0;
        } else if (arg0.field2331 + arg0.field2223 > arg1) {
            arg0.field2331 = arg1 - arg0.field2223;
        }
        if (arg0.field2222 < 0) {
            arg0.field2222 = 0;
        } else if (arg0.field2224 + arg0.field2222 > arg2) {
            arg0.field2222 = arg2 - arg0.field2224;
        }
    }

    @ObfuscatedName("aa.cs(Lfl;IIIIIII)V")
    public static final void method629(class170 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field369) {
            field370 = 32;
        } else {
            field370 = 0;
        }
        field369 = false;
        if (class116.field1823 == 1 || !Statics.field2048 && class116.field1823 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2230 -= 4;
                method1786(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2230 += 4;
                method1786(arg0);
            } else if (arg5 >= arg1 - field370 && arg5 < field370 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2230 = (arg4 - arg3) * var8 / var9;
                method1786(arg0);
                field369 = true;
            }
        }
        if (field483 == 0) {
            return;
        }
        int var10 = arg0.field2223;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2230 += field483 * 45;
            method1786(arg0);
        }
    }

    @ObfuscatedName("fj.cf(IIIIII)V")
    public static final void method2996(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field3122[0].method3775(arg0, arg1);
        Statics.field3122[1].method3775(arg0, arg1 + arg3 - 16);
        class220.method3696(arg0, arg1 + 16, 16, arg3 - 32, field360);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class220.method3696(arg0, arg1 + 16 + var6, 16, var5, field569);
        class220.method3706(arg0, arg1 + 16 + var6, var5, field354);
        class220.method3706(arg0 + 1, arg1 + 16 + var6, var5, field354);
        class220.method3704(arg0, arg1 + 16 + var6, 16, field354);
        class220.method3704(arg0, arg1 + 17 + var6, 16, field354);
        class220.method3706(arg0 + 15, arg1 + 16 + var6, var5, field412);
        class220.method3706(arg0 + 14, arg1 + 17 + var6, var5 - 1, field412);
        class220.method3704(arg0, arg1 + 15 + var6 + var5, 16, field412);
        class220.method3704(arg0 + 1, arg1 + 14 + var6 + var5, 15, field412);
    }

    @ObfuscatedName("fx.cd(II)Ljava/lang/String;")
    public static final String method2995(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("r.cj(Lfl;B)Z")
    public static final boolean method230(class170 arg0) {
        if (arg0.field2321 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2321.length; var1++) {
            int var2 = method236(arg0, var1);
            int var3 = arg0.field2322[var1];
            if (arg0.field2321[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2321[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2321[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("r.cm(Lfl;IS)I")
    public static final int method236(class170 arg0, int arg1) {
        if (arg0.field2320 == null || arg1 >= arg0.field2320.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2320[arg1];
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
                    var7 = field422[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field443[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field402[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class170 var11 = class170.method2993(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class199.method2268(var12).field2963 || field294)) {
                        for (int var13 = 0; var13 < var11.field2326.length; var13++) {
                            if (var12 + 1 == var11.field2326[var13]) {
                                var7 += var11.field2327[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class166.field2174[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class173.field2356[field443[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class166.field2174[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field43.field253;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class173.field2357[var14]) {
                            var7 += field443[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class170 var17 = class170.method2993(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class199.method2268(var18).field2963 || field294)) {
                        for (int var19 = 0; var19 < var17.field2326.length; var19++) {
                            if (var18 + 1 == var17.field2326[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field450;
                }
                if (var6 == 12) {
                    var7 = field451;
                }
                if (var6 == 13) {
                    int var20 = class166.field2174[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class166.method162(var22);
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
                    var7 = (Statics.field43.field608 >> 7) + Statics.field1735;
                }
                if (var6 == 19) {
                    var7 = (Statics.field43.field605 >> 7) + Statics.field284;
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

    @ObfuscatedName("dz.cz([Lfl;IIIIIIII)V")
    public static final void method2051(class170[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class170 var9 = arg0[var8];
            if (var9 != null && (!var9.field2205 || var9.field2210 == 0 || var9.field2288 || method3671(var9) != 0 || field436 == var9 || var9.field2263 == 1338) && var9.field2232 == arg1 && (!var9.field2205 || !method91(var9))) {
                int var10 = var9.field2331 + arg6;
                int var11 = var9.field2222 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2210 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2210 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2223 + var10;
                    int var19 = var9.field2224 + var11;
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
                    int var22 = var9.field2223 + var10;
                    int var23 = var9.field2224 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field456 == var9) {
                    field466 = true;
                    field434 = var10;
                    field468 = var11;
                }
                if (!var9.field2205 || var12 < var14 && var13 < var15) {
                    int var24 = class116.field1815;
                    int var25 = class116.field1822;
                    if (class116.field1821 != 0) {
                        var24 = class116.field1824;
                        var25 = class116.field1826;
                    }
                    if (var9.field2263 == 1337) {
                        if (!field298 && !field426 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method657(var24, var25, var12, var13);
                        }
                    } else if (var9.field2263 != 1338) {
                        if (!field426 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var40 = var24 - var10;
                            int var41 = var25 - var11;
                            if (var9.field2337 == 1) {
                                method863(var9.field2325, "", 24, 0, 0, var9.field2208);
                            }
                            if (var9.field2337 == 2 && !field440) {
                                int var42 = method3671(var9);
                                int var43 = var42 >> 11 & 0x3F;
                                String var44;
                                if (var43 == 0) {
                                    var44 = null;
                                } else if (var9.field2287 == null || var9.field2287.trim().length() == 0) {
                                    var44 = null;
                                } else {
                                    var44 = var9.field2287;
                                }
                                if (var44 != null) {
                                    method863(var44, class38.method183(65280) + var9.field2324, 25, 0, -1, var9.field2208);
                                }
                            }
                            if (var9.field2337 == 3) {
                                method863(class174.field2561, "", 26, 0, 0, var9.field2208);
                            }
                            if (var9.field2337 == 4) {
                                method863(var9.field2325, "", 28, 0, 0, var9.field2208);
                            }
                            if (var9.field2337 == 5) {
                                method863(var9.field2325, "", 29, 0, 0, var9.field2208);
                            }
                            if (var9.field2337 == 6 && field449 == null) {
                                method863(var9.field2325, "", 30, 0, -1, var9.field2208);
                            }
                            if (var9.field2210 == 2) {
                                int var46 = 0;
                                for (int var47 = 0; var47 < var9.field2224; var47++) {
                                    for (int var48 = 0; var48 < var9.field2223; var48++) {
                                        int var49 = (var9.field2274 + 32) * var48;
                                        int var50 = (var9.field2201 + 32) * var47;
                                        if (var46 < 20) {
                                            var49 += var9.field2276[var46];
                                            var50 += var9.field2316[var46];
                                        }
                                        if (var40 >= var49 && var41 >= var50 && var40 < var49 + 32 && var41 < var50 + 32) {
                                            field404 = var46;
                                            Statics.field52 = var9;
                                            if (var9.field2326[var46] > 0) {
                                                class199 var51 = class199.method2268(var9.field2326[var46] - 1);
                                                if (field438 == 1 && class171.method9(method3671(var9))) {
                                                    if (Statics.field245 != var9.field2208 || Statics.field1926 != var46) {
                                                        method863(class174.field2509, field439 + " " + class38.field794 + " " + class38.method183(16748608) + var51.field2950, 31, var51.field2948, var46, var9.field2208);
                                                    }
                                                } else if (!field440 || !class171.method9(method3671(var9))) {
                                                    String[] var52 = var51.field2954;
                                                    if (field435) {
                                                        var52 = method717(var52);
                                                    }
                                                    if (class171.method9(method3671(var9))) {
                                                        for (int var53 = 4; var53 >= 3; var53--) {
                                                            if (var52 != null && var52[var53] != null) {
                                                                byte var54;
                                                                if (var53 == 3) {
                                                                    var54 = 36;
                                                                } else {
                                                                    var54 = 37;
                                                                }
                                                                method863(var52[var53], class38.method183(16748608) + var51.field2950, var54, var51.field2948, var46, var9.field2208);
                                                            } else if (var53 == 4) {
                                                                method863(class174.field2365, class38.method183(16748608) + var51.field2950, 37, var51.field2948, var46, var9.field2208);
                                                            }
                                                        }
                                                    }
                                                    if (class171.method187(method3671(var9))) {
                                                        method863(class174.field2509, class38.method183(16748608) + var51.field2950, 38, var51.field2948, var46, var9.field2208);
                                                    }
                                                    if (class171.method9(method3671(var9)) && var52 != null) {
                                                        for (int var55 = 2; var55 >= 0; var55--) {
                                                            if (var52[var55] != null) {
                                                                byte var56 = 0;
                                                                if (var55 == 0) {
                                                                    var56 = 33;
                                                                }
                                                                if (var55 == 1) {
                                                                    var56 = 34;
                                                                }
                                                                if (var55 == 2) {
                                                                    var56 = 35;
                                                                }
                                                                method863(var52[var55], class38.method183(16748608) + var51.field2950, var56, var51.field2948, var46, var9.field2208);
                                                            }
                                                        }
                                                    }
                                                    String[] var57 = var9.field2279;
                                                    if (field435) {
                                                        var57 = method717(var57);
                                                    }
                                                    if (var57 != null) {
                                                        for (int var58 = 4; var58 >= 0; var58--) {
                                                            if (var57[var58] != null) {
                                                                byte var59 = 0;
                                                                if (var58 == 0) {
                                                                    var59 = 39;
                                                                }
                                                                if (var58 == 1) {
                                                                    var59 = 40;
                                                                }
                                                                if (var58 == 2) {
                                                                    var59 = 41;
                                                                }
                                                                if (var58 == 3) {
                                                                    var59 = 42;
                                                                }
                                                                if (var58 == 4) {
                                                                    var59 = 43;
                                                                }
                                                                method863(var57[var58], class38.method183(16748608) + var51.field2950, var59, var51.field2948, var46, var9.field2208);
                                                            }
                                                        }
                                                    }
                                                    method863(class174.field2510, class38.method183(16748608) + var51.field2950, 1005, var51.field2948, var46, var9.field2208);
                                                } else if ((Statics.field1838 & 0x10) == 16) {
                                                    method863(field563, field444 + " " + class38.field794 + " " + class38.method183(16748608) + var51.field2950, 32, var51.field2948, var46, var9.field2208);
                                                }
                                            }
                                        }
                                        var46++;
                                    }
                                }
                            }
                            if (var9.field2205) {
                                if (!field440) {
                                    for (int var60 = 9; var60 >= 5; var60--) {
                                        String var61;
                                        if (!class171.method1772(method3671(var9), var60) && var9.field2308 == null) {
                                            var61 = null;
                                        } else if (var9.field2282 == null || var9.field2282.length <= var60 || var9.field2282[var60] == null || var9.field2282[var60].trim().length() == 0) {
                                            var61 = null;
                                        } else {
                                            var61 = var9.field2282[var60];
                                        }
                                        if (var61 != null) {
                                            method863(var61, var9.field2281, 1007, var60 + 1, var9.field2209, var9.field2208);
                                        }
                                    }
                                    int var63 = method3671(var9);
                                    int var64 = var63 >> 11 & 0x3F;
                                    String var65;
                                    if (var64 == 0) {
                                        var65 = null;
                                    } else if (var9.field2287 == null || var9.field2287.trim().length() == 0) {
                                        var65 = null;
                                    } else {
                                        var65 = var9.field2287;
                                    }
                                    if (var65 != null) {
                                        method863(var65, var9.field2281, 25, 0, var9.field2209, var9.field2208);
                                    }
                                    for (int var67 = 4; var67 >= 0; var67--) {
                                        String var68;
                                        if (!class171.method1772(method3671(var9), var67) && var9.field2308 == null) {
                                            var68 = null;
                                        } else if (var9.field2282 == null || var9.field2282.length <= var67 || var9.field2282[var67] == null || var9.field2282[var67].trim().length() == 0) {
                                            var68 = null;
                                        } else {
                                            var68 = var9.field2282[var67];
                                        }
                                        if (var68 != null) {
                                            method863(var68, var9.field2281, 57, var67 + 1, var9.field2209, var9.field2208);
                                        }
                                    }
                                    if (class171.method2910(method3671(var9))) {
                                        method863(class174.field2624, "", 30, 0, var9.field2209, var9.field2208);
                                    }
                                } else if (class171.method2406(method3671(var9)) && (Statics.field1838 & 0x20) == 32) {
                                    method863(field563, field444 + " " + class38.field794 + " " + var9.field2281, 58, 0, var9.field2209, var9.field2208);
                                }
                            }
                        }
                        if (var9.field2210 == 0) {
                            if (!var9.field2205 && method91(var9) && Statics.field246 != var9) {
                                continue;
                            }
                            method2051(arg0, var9.field2208, var12, var13, var14, var15, var10 - var9.field2229, var11 - var9.field2230);
                            if (var9.field2332 != null) {
                                method2051(var9.field2332, var9.field2208, var12, var13, var14, var15, var10 - var9.field2229, var11 - var9.field2230);
                            }
                            class18 var70 = (class18) field419.method2151((long) var9.field2208);
                            if (var70 != null) {
                                if (var70.field192 == 0 && class116.field1815 >= var12 && class116.field1822 >= var13 && class116.field1815 < var14 && class116.field1822 < var15 && !field426 && !field455) {
                                    for (class19 var71 = (class19) field484.method2201(); var71 != null; var71 = (class19) field484.method2203()) {
                                        if (var71.field197) {
                                            var71.method2189();
                                            var71.field194.field2333 = false;
                                        }
                                    }
                                    if (Statics.field775 == 0) {
                                        field456 = null;
                                        field436 = null;
                                    }
                                    if (!field426) {
                                        field446[0] = class174.field2419;
                                        field433[0] = "";
                                        field430[0] = 1006;
                                        field427 = 1;
                                    }
                                }
                                int var72 = var70.field184;
                                if (class170.method26(var72)) {
                                    method2051(Statics.field2257[var72], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2205) {
                            if (var9.field2341) {
                                if (class116.field1815 >= var12 && class116.field1822 >= var13 && class116.field1815 < var14 && class116.field1822 < var15) {
                                    for (class19 var73 = (class19) field484.method2201(); var73 != null; var73 = (class19) field484.method2203()) {
                                        if (var73.field197) {
                                            var73.method2189();
                                            var73.field194.field2333 = false;
                                        }
                                    }
                                    if (Statics.field775 == 0) {
                                        field456 = null;
                                        field436 = null;
                                    }
                                    if (!field426) {
                                        field446[0] = class174.field2419;
                                        field433[0] = "";
                                        field430[0] = 1006;
                                        field427 = 1;
                                    }
                                }
                            } else if (var9.field2300 && class116.field1815 >= var12 && class116.field1822 >= var13 && class116.field1815 < var14 && class116.field1822 < var15) {
                                for (class19 var74 = (class19) field484.method2201(); var74 != null; var74 = (class19) field484.method2203()) {
                                    if (var74.field197 && var74.field194.field2296 == var74.field204) {
                                        var74.method2189();
                                    }
                                }
                            }
                            boolean var75;
                            if (class116.field1815 >= var12 && class116.field1822 >= var13 && class116.field1815 < var14 && class116.field1822 < var15) {
                                var75 = true;
                            } else {
                                var75 = false;
                            }
                            boolean var76 = false;
                            if ((class116.field1823 == 1 || !Statics.field2048 && class116.field1823 == 4) && var75) {
                                var76 = true;
                            }
                            boolean var77 = false;
                            if ((class116.field1821 == 1 || !Statics.field2048 && class116.field1821 == 4) && class116.field1824 >= var12 && class116.field1826 >= var13 && class116.field1824 < var14 && class116.field1826 < var15) {
                                var77 = true;
                            }
                            if (var77) {
                                method1893(var9, class116.field1824 - var10, class116.field1826 - var11);
                            }
                            if (field456 != null && field456 != var9 && var75 && class171.method2999(method3671(var9))) {
                                field462 = var9;
                            }
                            if (field436 == var9) {
                                field389 = true;
                                field464 = var10;
                                field465 = var11;
                            }
                            if (var9.field2288) {
                                if (var75 && field483 != 0 && var9.field2296 != null) {
                                    class19 var78 = new class19();
                                    var78.field197 = true;
                                    var78.field194 = var9;
                                    var78.field195 = field483;
                                    var78.field204 = var9.field2296;
                                    field484.method2213(var78);
                                }
                                if (field456 != null || Statics.field670 != null || field426) {
                                    var77 = false;
                                    var76 = false;
                                    var75 = false;
                                }
                                if (!var9.field2334 && var77) {
                                    var9.field2334 = true;
                                    if (var9.field2290 != null) {
                                        class19 var79 = new class19();
                                        var79.field197 = true;
                                        var79.field194 = var9;
                                        var79.field196 = class116.field1824 - var10;
                                        var79.field195 = class116.field1826 - var11;
                                        var79.field204 = var9.field2290;
                                        field484.method2213(var79);
                                    }
                                }
                                if (var9.field2334 && var76 && var9.field2280 != null) {
                                    class19 var80 = new class19();
                                    var80.field197 = true;
                                    var80.field194 = var9;
                                    var80.field196 = class116.field1815 - var10;
                                    var80.field195 = class116.field1822 - var11;
                                    var80.field204 = var9.field2280;
                                    field484.method2213(var80);
                                }
                                if (var9.field2334 && !var76) {
                                    var9.field2334 = false;
                                    if (var9.field2214 != null) {
                                        class19 var81 = new class19();
                                        var81.field197 = true;
                                        var81.field194 = var9;
                                        var81.field196 = class116.field1815 - var10;
                                        var81.field195 = class116.field1822 - var11;
                                        var81.field204 = var9.field2214;
                                        field486.method2213(var81);
                                    }
                                }
                                if (var76 && var9.field2293 != null) {
                                    class19 var82 = new class19();
                                    var82.field197 = true;
                                    var82.field194 = var9;
                                    var82.field196 = class116.field1815 - var10;
                                    var82.field195 = class116.field1822 - var11;
                                    var82.field204 = var9.field2293;
                                    field484.method2213(var82);
                                }
                                if (!var9.field2333 && var75) {
                                    var9.field2333 = true;
                                    if (var9.field2294 != null) {
                                        class19 var83 = new class19();
                                        var83.field197 = true;
                                        var83.field194 = var9;
                                        var83.field196 = class116.field1815 - var10;
                                        var83.field195 = class116.field1822 - var11;
                                        var83.field204 = var9.field2294;
                                        field484.method2213(var83);
                                    }
                                }
                                if (var9.field2333 && var75 && var9.field2273 != null) {
                                    class19 var84 = new class19();
                                    var84.field197 = true;
                                    var84.field194 = var9;
                                    var84.field196 = class116.field1815 - var10;
                                    var84.field195 = class116.field1822 - var11;
                                    var84.field204 = var9.field2273;
                                    field484.method2213(var84);
                                }
                                if (var9.field2333 && !var75) {
                                    var9.field2333 = false;
                                    if (var9.field2238 != null) {
                                        class19 var85 = new class19();
                                        var85.field197 = true;
                                        var85.field194 = var9;
                                        var85.field196 = class116.field1815 - var10;
                                        var85.field195 = class116.field1822 - var11;
                                        var85.field204 = var9.field2238;
                                        field486.method2213(var85);
                                    }
                                }
                                if (var9.field2307 != null) {
                                    class19 var86 = new class19();
                                    var86.field194 = var9;
                                    var86.field204 = var9.field2307;
                                    field485.method2213(var86);
                                }
                                if (var9.field2291 != null && field472 > var9.field2336) {
                                    if (var9.field2302 == null || field472 - var9.field2336 > 32) {
                                        class19 var91 = new class19();
                                        var91.field194 = var9;
                                        var91.field204 = var9.field2291;
                                        field484.method2213(var91);
                                    } else {
                                        label700: for (int var87 = var9.field2336; var87 < field472; var87++) {
                                            int var88 = field471[var87 & 0x1F];
                                            for (int var89 = 0; var89 < var9.field2302.length; var89++) {
                                                if (var9.field2302[var89] == var88) {
                                                    class19 var90 = new class19();
                                                    var90.field194 = var9;
                                                    var90.field204 = var9.field2291;
                                                    field484.method2213(var90);
                                                    break label700;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2336 = field472;
                                }
                                if (var9.field2304 != null && field474 > var9.field2207) {
                                    if (var9.field2277 == null || field474 - var9.field2207 > 32) {
                                        class19 var96 = new class19();
                                        var96.field194 = var9;
                                        var96.field204 = var9.field2304;
                                        field484.method2213(var96);
                                    } else {
                                        label676: for (int var92 = var9.field2207; var92 < field474; var92++) {
                                            int var93 = field473[var92 & 0x1F];
                                            for (int var94 = 0; var94 < var9.field2277.length; var94++) {
                                                if (var9.field2277[var94] == var93) {
                                                    class19 var95 = new class19();
                                                    var95.field194 = var9;
                                                    var95.field204 = var9.field2304;
                                                    field484.method2213(var95);
                                                    break label676;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2207 = field474;
                                }
                                if (var9.field2305 != null && field558 > var9.field2338) {
                                    if (var9.field2306 == null || field558 - var9.field2338 > 32) {
                                        class19 var101 = new class19();
                                        var101.field194 = var9;
                                        var101.field204 = var9.field2305;
                                        field484.method2213(var101);
                                    } else {
                                        label652: for (int var97 = var9.field2338; var97 < field558; var97++) {
                                            int var98 = field327[var97 & 0x1F];
                                            for (int var99 = 0; var99 < var9.field2306.length; var99++) {
                                                if (var9.field2306[var99] == var98) {
                                                    class19 var100 = new class19();
                                                    var100.field194 = var9;
                                                    var100.field204 = var9.field2305;
                                                    field484.method2213(var100);
                                                    break label652;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2338 = field558;
                                }
                                if (field458 > var9.field2335 && var9.field2310 != null) {
                                    class19 var102 = new class19();
                                    var102.field194 = var9;
                                    var102.field204 = var9.field2310;
                                    field484.method2213(var102);
                                }
                                if (field478 > var9.field2335 && var9.field2318 != null) {
                                    class19 var103 = new class19();
                                    var103.field194 = var9;
                                    var103.field204 = var9.field2318;
                                    field484.method2213(var103);
                                }
                                if (field339 > var9.field2335 && var9.field2313 != null) {
                                    class19 var104 = new class19();
                                    var104.field194 = var9;
                                    var104.field204 = var9.field2313;
                                    field484.method2213(var104);
                                }
                                if (field467 > var9.field2335 && var9.field2311 != null) {
                                    class19 var105 = new class19();
                                    var105.field194 = var9;
                                    var105.field204 = var9.field2311;
                                    field484.method2213(var105);
                                }
                                if (field481 > var9.field2335 && var9.field2319 != null) {
                                    class19 var106 = new class19();
                                    var106.field194 = var9;
                                    var106.field204 = var9.field2319;
                                    field484.method2213(var106);
                                }
                                if (field482 > var9.field2335 && var9.field2314 != null) {
                                    class19 var107 = new class19();
                                    var107.field194 = var9;
                                    var107.field204 = var9.field2314;
                                    field484.method2213(var107);
                                }
                                var9.field2335 = field470;
                                if (var9.field2275 != null) {
                                    for (int var108 = 0; var108 < field508; var108++) {
                                        class19 var109 = new class19();
                                        var109.field194 = var9;
                                        var109.field200 = field303[var108];
                                        var109.field201 = field509[var108];
                                        var109.field204 = var9.field2275;
                                        field484.method2213(var109);
                                    }
                                }
                            }
                        }
                        if (!var9.field2205 && field456 == null && Statics.field670 == null && !field426) {
                            if ((var9.field2323 >= 0 || var9.field2235 != 0) && class116.field1815 >= var12 && class116.field1822 >= var13 && class116.field1815 < var14 && class116.field1822 < var15) {
                                if (var9.field2323 >= 0) {
                                    Statics.field246 = arg0[var9.field2323];
                                } else {
                                    Statics.field246 = var9;
                                }
                            }
                            if (var9.field2210 == 8 && class116.field1815 >= var12 && class116.field1822 >= var13 && class116.field1815 < var14 && class116.field1822 < var15) {
                                Statics.field1193 = var9;
                            }
                            if (var9.field2203 > var9.field2224) {
                                method629(var9, var9.field2223 + var10, var11, var9.field2224, var9.field2203, class116.field1815, class116.field1822);
                            }
                        }
                    } else if ((field521 == 0 || field521 == 3) && (class116.field1821 == 1 || !Statics.field2048 && class116.field1821 == 4)) {
                        class165 var26 = var9.method2929(true);
                        if (var26 != null) {
                            int var27 = class116.field1824 - var10;
                            int var28 = class116.field1826 - var11;
                            if (var26.method2867(var27, var28)) {
                                int var29 = var27 - var26.field2165 / 2;
                                int var30 = var28 - var26.field2166 / 2;
                                int var31 = field372 + field359 & 0x7FF;
                                int var32 = class85.field1436[var31];
                                int var33 = class85.field1447[var31];
                                int var34 = (field361 + 256) * var32 >> 8;
                                int var35 = (field361 + 256) * var33 >> 8;
                                int var36 = var29 * var35 + var30 * var34 >> 11;
                                int var37 = var30 * var35 - var29 * var34 >> 11;
                                int var38 = Statics.field43.field608 + var36 >> 7;
                                int var39 = Statics.field43.field605 - var37 >> 7;
                                field331.method2782(198);
                                field331.method2641(18);
                                field331.method2578(class106.field1729[82] ? (class106.field1729[81] ? 2 : 1) : 0);
                                field331.method2586(Statics.field1735 + var38);
                                field331.method2585(Statics.field284 + var39);
                                field331.method2641(var29);
                                field331.method2641(var30);
                                field331.method2538(field372);
                                field331.method2641(57);
                                field331.method2641(field359);
                                field331.method2641(field361);
                                field331.method2641(89);
                                field331.method2538(Statics.field43.field608);
                                field331.method2538(Statics.field43.field605);
                                field331.method2641(63);
                                field519 = var38;
                                field490 = var39;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("h.dq(IIB)V")
    public static final void method46(int arg0, int arg1) {
        if (class170.method26(arg0)) {
            method231(Statics.field2257[arg0], arg1);
        }
    }

    @ObfuscatedName("r.dc([Lfl;II)V")
    public static final void method231(class170[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class170 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2210 == 0) {
                    if (var3.field2332 != null) {
                        method231(var3.field2332, arg1);
                    }
                    class18 var4 = (class18) field419.method2151((long) var3.field2208);
                    if (var4 != null) {
                        method46(var4.field184, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2315 != null) {
                    class19 var5 = new class19();
                    var5.field194 = var3;
                    var5.field204 = var3.field2315;
                    class33.method166(var5);
                }
                if (arg1 == 1 && var3.field2256 != null) {
                    if (var3.field2209 >= 0) {
                        class170 var6 = class170.method2993(var3.field2208);
                        if (var6 == null || var6.field2332 == null || var3.field2209 >= var6.field2332.length || var6.field2332[var3.field2209] != var3) {
                            continue;
                        }
                    }
                    class19 var7 = new class19();
                    var7.field194 = var3;
                    var7.field204 = var3.field2256;
                    class33.method166(var7);
                }
            }
        }
    }

    @ObfuscatedName("di.dg(Lfl;III)V")
    public static final void method1893(class170 arg0, int arg1, int arg2) {
        if (field456 != null || field426 || arg0 == null || method179(arg0) == null) {
            return;
        }
        field456 = arg0;
        field436 = method179(arg0);
        field460 = arg1;
        field461 = arg2;
        Statics.field775 = 0;
        field469 = false;
        if (field427 <= 0) {
            return;
        }
        int var3 = field427 - 1;
        Statics.field2121 = new class39();
        Statics.field2121.field808 = field428[var3];
        Statics.field2121.field804 = field343[var3];
        Statics.field2121.field805 = field430[var3];
        Statics.field2121.field803 = field423[var3];
        Statics.field2121.field806 = field446[var3];
    }

    @ObfuscatedName("ct.dx(III)V")
    public static void method1430(int arg0, int arg1) {
        class39 var2 = Statics.field2121;
        method1894(var2.field808, var2.field804, var2.field805, var2.field803, var2.field806, var2.field806, arg0, arg1);
        Statics.field2121 = null;
    }

    @ObfuscatedName("cv.di(Lfl;S)V")
    public static void method1786(class170 arg0) {
        if (field489 == arg0.field2340) {
            field309[arg0.field2339] = true;
        }
    }

    @ObfuscatedName("w.dl(I)V")
    public static void method189() {
        for (class18 var0 = (class18) field419.method2148(); var0 != null; var0 = (class18) field419.method2152()) {
            int var1 = var0.field184;
            if (class170.method26(var1)) {
                boolean var2 = true;
                class170[] var3 = Statics.field2257[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2205;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field1894;
                    class170 var6 = class170.method2993(var5);
                    if (var6 != null) {
                        method1786(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.dj(Lfl;B)Lfl;")
    public static class170 method179(class170 arg0) {
        class170 var1 = method3529(arg0);
        if (var1 == null) {
            var1 = arg0.field2283;
        }
        return var1;
    }

    @ObfuscatedName("aw.dk([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method717(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("n.de(II)V")
    public static final void method195(int arg0) {
        if (!class170.method26(arg0)) {
            return;
        }
        class170[] var1 = Statics.field2257[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class170 var3 = var1[var2];
            if (var3 != null) {
                var3.field2330 = 0;
                var3.field2227 = 0;
            }
        }
    }

    @ObfuscatedName("r.da([Lfl;II)V")
    public static final void method235(class170[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class170 var3 = arg0[var2];
            if (var3 != null && var3.field2232 == arg1 && (!var3.field2205 || !method91(var3))) {
                if (var3.field2210 == 0) {
                    if (!var3.field2205 && method91(var3) && Statics.field246 != var3) {
                        continue;
                    }
                    method235(arg0, var3.field2208);
                    if (var3.field2332 != null) {
                        method235(var3.field2332, var3.field2208);
                    }
                    class18 var4 = (class18) field419.method2151((long) var3.field2208);
                    if (var4 != null) {
                        Statics.method1099(var4.field184);
                    }
                }
                if (var3.field2210 == 6) {
                    if (var3.field2255 != -1 || var3.field2241 != -1) {
                        boolean var5 = method230(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2241;
                        } else {
                            var6 = var3.field2255;
                        }
                        if (var6 != -1) {
                            class202 var7 = class202.method658(var6);
                            var3.field2227 += field364;
                            while (var3.field2227 > var7.field3048[var3.field2330]) {
                                var3.field2227 -= var7.field3048[var3.field2330];
                                var3.field2330++;
                                if (var3.field2330 >= var7.field3051.length) {
                                    var3.field2330 -= var7.field3055;
                                    if (var3.field2330 < 0 || var3.field2330 >= var7.field3051.length) {
                                        var3.field2330 = 0;
                                    }
                                }
                                method1786(var3);
                            }
                        }
                    }
                    if (var3.field2264 != 0 && !var3.field2205) {
                        int var8 = var3.field2264 >> 16;
                        int var9 = var3.field2264 << 16 >> 16;
                        int var10 = field364 * var8;
                        int var11 = field364 * var9;
                        var3.field2259 = var3.field2259 + var10 & 0x7FF;
                        var3.field2260 = var3.field2260 + var11 & 0x7FF;
                        method1786(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("z.do(IB)V")
    public static final void method144(int arg0) {
        method189();
        for (class32 var1 = (class32) class32.field724.method2201(); var1 != null; var1 = (class32) class32.field724.method2203()) {
            if (var1.field726 != null) {
                var1.method650();
            }
        }
        int var2 = class188.method3000(arg0).field2783;
        if (var2 == 0) {
            return;
        }
        int var3 = class166.field2174[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class85.method1567(0.9D);
                ((class75) Statics.field1443).method1330(0.9D);
            }
            if (var3 == 2) {
                class85.method1567(0.8D);
                ((class75) Statics.field1443).method1330(0.8D);
            }
            if (var3 == 3) {
                class85.method1567(0.7D);
                ((class75) Statics.field1443).method1330(0.7D);
            }
            if (var3 == 4) {
                class85.method1567(0.6D);
                ((class75) Statics.field1443).method1330(0.6D);
            }
            class199.field2946.method2139();
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
            if (field522 != var4) {
                if (field522 == 0 && field523 != -1) {
                    class139.method1761(Statics.field1865, field523, 0, var4, false);
                    field494 = false;
                } else if (var4 == 0) {
                    class139.method858();
                    field494 = false;
                } else {
                    class139.method194(var4);
                }
                field522 = var4;
            }
        }
        if (var2 == 4) {
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
        if (var2 == 5) {
            field425 = var3;
        }
        if (var2 == 6) {
            field447 = var3;
        }
        if (var2 == 9) {
            field355 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field526 = 127;
            }
            if (var3 == 1) {
                field526 = 96;
            }
            if (var3 == 2) {
                field526 = 64;
            }
            if (var3 == 3) {
                field526 = 32;
            }
            if (var3 == 4) {
                field526 = 0;
            }
        }
        if (var2 == 17) {
            field453 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class41[] var5 = new class41[] { class41.field825, class41.field822, class41.field819, class41.field820 };
            field377 = (class41) class149.method1314(var5, var3);
            if (field377 == null) {
                field377 = class41.field822;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field417 = -1;
            } else {
                field417 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class41[] var6 = new class41[] { class41.field825, class41.field822, class41.field819, class41.field820 };
        field316 = (class41) class149.method1314(var6, var3);
        if (field316 == null) {
            field316 = class41.field822;
        }
    }

    @ObfuscatedName("f.dz(IIII)Lx;")
    public static final class18 method165(int arg0, int arg1, int arg2) {
        class18 var3 = new class18();
        var3.field184 = arg1;
        var3.field192 = arg2;
        field419.method2143(var3, (long) arg0);
        method195(arg1);
        class170 var4 = class170.method2993(arg0);
        method1786(var4);
        if (field449 != null) {
            method1786(field449);
            field449 = null;
        }
        method1768();
        method1754(Statics.field2257[arg0 >> 16], var4, false);
        class33.method208(arg1);
        if (field445 != -1) {
            method46(field445, 1);
        }
        return var3;
    }

    @ObfuscatedName("ax.dh(Lx;ZI)V")
    public static final void method768(class18 arg0, boolean arg1) {
        int var2 = arg0.field184;
        int var3 = (int) arg0.field1894;
        arg0.method2189();
        if (arg1) {
            class170.method777(var2);
        }
        method1886(var2);
        class170 var4 = class170.method2993(var3);
        if (var4 != null) {
            method1786(var4);
        }
        method1768();
        if (field445 != -1) {
            method46(field445, 1);
        }
    }

    @ObfuscatedName("ax.dw(Lfl;B)Z")
    public static final boolean method776(class170 arg0) {
        int var1 = arg0.field2263;
        if (var1 == 205) {
            field341 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field496.method2886(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field496.method2880(var4, var5 == 1);
        }
        if (var1 == 324) {
            field496.method2877(false);
        }
        if (var1 == 325) {
            field496.method2877(true);
        }
        if (var1 == 326) {
            field331.method2782(100);
            field496.method2885(field331);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("y.ds(Lfl;IIII)V")
    public static final void method149(class170 arg0, int arg1, int arg2, int arg3) {
        class165 var4 = arg0.method2929(false);
        if (var4 == null) {
            return;
        }
        if (field521 < 3) {
            Statics.field2140.method3825(arg1, arg2, var4.field2165, var4.field2166, 25, 25, field372, 256, var4.field2163, var4.field2169);
        } else {
            class220.method3718(arg1, arg2, 0, var4.field2163, var4.field2169);
        }
    }

    @ObfuscatedName("gg.dm(IIIILhm;Lfe;I)V")
    public static final void method3348(int arg0, int arg1, int arg2, int arg3, class225 arg4, class165 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method1763(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field372 + field359 & 0x7FF;
        int var8 = class85.field1436[var7];
        int var9 = class85.field1447[var7];
        int var10 = var8 * 256 / (field361 + 256);
        int var11 = var9 * 256 / (field361 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field1527.method3826(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("cr.df(IIIILhm;Lfe;I)V")
    public static final void method1763(int arg0, int arg1, int arg2, int arg3, class225 arg4, class165 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field372 + field359 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class85.field1436[var6];
        int var9 = class85.field1447[var6];
        int var10 = var8 * 256 / (field361 + 256);
        int var11 = var9 * 256 / (field361 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method3824(arg5.field2165 / 2 + var12 - arg4.field3209 / 2, arg5.field2166 / 2 - var13 - arg4.field3210 / 2, arg0, arg1, arg5.field2165, arg5.field2166, arg5.field2163, arg5.field2169);
        } else {
            arg4.method3814(arg5.field2165 / 2 + arg0 + var12 - arg4.field3209 / 2, arg5.field2166 / 2 + arg1 - var13 - arg4.field3210 / 2);
        }
    }

    @ObfuscatedName("el.dy(Ljava/lang/String;ZI)Z")
    public static boolean method2760(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class205.method2828(arg0, Statics.field156);
        for (int var3 = 0; var3 < field552; var3++) {
            if (var2.equalsIgnoreCase(class205.method2828(field554[var3].field158, Statics.field156)) && (!arg1 || field554[var3].field154 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class205.method2828(Statics.field43.field264, Statics.field156))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("j.dt(Ljava/lang/String;I)Z")
    public static boolean method151(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class205.method2828(arg0, Statics.field156);
        for (int var2 = 0; var2 < field556; var2++) {
            class20 var3 = field551[var2];
            if (var1.equalsIgnoreCase(class205.method2828(var3.field208, Statics.field156))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class205.method2828(var3.field218, Statics.field156))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("s.dd(Ljava/lang/String;I)V")
    public static final void method182(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field552 < 200 || field410 == 1) || field552 >= 400) {
            class48.method184(30, "", class174.field2402);
            return;
        }
        String var1 = class205.method2828(arg0, Statics.field156);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field552; var2++) {
            class15 var3 = field554[var2];
            String var4 = class205.method2828(var3.field158, Statics.field156);
            if (var4 != null && var4.equals(var1)) {
                class48.method184(30, "", arg0 + class174.field2526);
                return;
            }
            if (var3.field151 != null) {
                String var5 = class205.method2828(var3.field151, Statics.field156);
                if (var5 != null && var5.equals(var1)) {
                    class48.method184(30, "", arg0 + class174.field2526);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field556; var6++) {
            class20 var7 = field551[var6];
            String var8 = class205.method2828(var7.field208, Statics.field156);
            if (var8 != null && var8.equals(var1)) {
                class48.method184(30, "", class174.field2531 + arg0 + class174.field2532);
                return;
            }
            if (var7.field218 != null) {
                String var9 = class205.method2828(var7.field218, Statics.field156);
                if (var9 != null && var9.equals(var1)) {
                    class48.method184(30, "", class174.field2531 + arg0 + class174.field2532);
                    return;
                }
            }
        }
        if (class205.method2828(Statics.field43.field264, Statics.field156).equals(var1)) {
            class48.method184(30, "", class174.field2529);
        } else {
            field331.method2782(206);
            field331.method2641(class154.method1925(arg0));
            field331.method2543(arg0);
        }
    }

    @ObfuscatedName("f.db(Ljava/lang/String;ZS)V")
    public static final void method168(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field556 < 100 || field410 == 1) || field556 >= 400) {
            class48.method184(31, "", class174.field2534);
            return;
        }
        String var2 = class205.method2828(arg0, Statics.field156);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field556; var3++) {
            class20 var4 = field551[var3];
            String var5 = class205.method2828(var4.field208, Statics.field156);
            if (var5 != null && var5.equals(var2)) {
                class48.method184(31, "", arg0 + class174.field2525);
                return;
            }
            if (var4.field218 != null) {
                String var6 = class205.method2828(var4.field218, Statics.field156);
                if (var6 != null && var6.equals(var2)) {
                    class48.method184(31, "", arg0 + class174.field2525);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field552; var7++) {
            class15 var8 = field554[var7];
            String var9 = class205.method2828(var8.field158, Statics.field156);
            if (var9 != null && var9.equals(var2)) {
                class48.method184(31, "", class174.field2407 + arg0 + class174.field2530);
                return;
            }
            if (var8.field151 != null) {
                String var10 = class205.method2828(var8.field151, Statics.field156);
                if (var10 != null && var10.equals(var2)) {
                    class48.method184(31, "", class174.field2407 + arg0 + class174.field2530);
                    return;
                }
            }
        }
        if (class205.method2828(Statics.field43.field264, Statics.field156).equals(var2)) {
            class48.method184(31, "", class174.field2379);
        } else {
            field331.method2782(161);
            field331.method2641(class154.method1925(arg0));
            field331.method2543(arg0);
        }
    }

    @ObfuscatedName("be.dp(Ljava/lang/String;I)V")
    public static final void method1084(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class205.method2828(arg0, Statics.field156);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field556; var2++) {
            class20 var3 = field551[var2];
            String var4 = var3.field208;
            String var5 = class205.method2828(var4, Statics.field156);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field556--;
                for (int var7 = var2; var7 < field556; var7++) {
                    field551[var7] = field551[var7 + 1];
                }
                field478 = field470;
                field331.method2782(184);
                field331.method2641(class154.method1925(arg0));
                field331.method2543(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("dx.dr(II)V")
    public static void method1886(int arg0) {
        for (class134 var1 = (class134) field487.method2148(); var1 != null; var1 = (class134) field487.method2152()) {
            if ((long) arg0 == (var1.field1894 >> 48 & 0xFFFFL)) {
                var1.method2189();
            }
        }
    }

    @ObfuscatedName("hf.dv(Lfl;I)I")
    public static int method3671(class170 arg0) {
        class134 var1 = (class134) field487.method2151(((long) arg0.field2208 << 32) + (long) arg0.field2209);
        return var1 == null ? arg0.field2240 : var1.field1909;
    }

    @ObfuscatedName("gr.dn(Lfl;I)Lfl;")
    public static class170 method3529(class170 arg0) {
        int var1 = method3671(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class170.method2993(arg0.field2232);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("u.ef(Lfl;I)Z")
    public static boolean method91(class170 arg0) {
        if (field455) {
            if (method3671(arg0) != 0) {
                return false;
            }
            if (arg0.field2210 == 0) {
                return false;
            }
        }
        return arg0.field2228;
    }

    @ObfuscatedName("bq.ei(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method1116(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field429 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field429 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field429 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field429 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field429 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1777 != null) {
            var3 = "/p=" + Statics.field1777;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field510 + "/a=" + Statics.field216 + var3 + "/";
    }
}

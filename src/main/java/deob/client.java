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
import java.io.RandomAccessFile;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class114 {

    @ObfuscatedName("client.i")
    public static boolean field281 = true;

    @ObfuscatedName("client.t")
    public static int field282 = 1;

    @ObfuscatedName("client.k")
    public static int field283 = 0;

    @ObfuscatedName("client.n")
    public static int field296 = 0;

    @ObfuscatedName("client.r")
    public static boolean field288 = false;

    @ObfuscatedName("client.z")
    public static boolean field405 = false;

    @ObfuscatedName("client.p")
    public static int field290 = 0;

    @ObfuscatedName("client.w")
    public static class118[] field346 = new class118[4];

    @ObfuscatedName("client.q")
    public static int field436 = 0;

    @ObfuscatedName("client.c")
    public static boolean field548 = true;

    @ObfuscatedName("client.v")
    public static int field293 = 0;

    @ObfuscatedName("client.e")
    public static long field294 = -1L;

    @ObfuscatedName("client.d")
    public static int field295 = -1;

    @ObfuscatedName("client.g")
    public static int field347 = -1;

    @ObfuscatedName("client.ap")
    public static int field297 = -1;

    @ObfuscatedName("client.aj")
    public static boolean field298 = true;

    @ObfuscatedName("client.ab")
    public static boolean field299 = false;

    @ObfuscatedName("client.af")
    public static int field505 = 0;

    @ObfuscatedName("client.aw")
    public static int field301 = 0;

    @ObfuscatedName("client.ac")
    public static int field302 = 0;

    @ObfuscatedName("client.an")
    public static int field312 = 0;

    @ObfuscatedName("client.ae")
    public static int field537 = 0;

    @ObfuscatedName("client.au")
    public static int field316 = 0;

    @ObfuscatedName("client.am")
    public static int field388 = 0;

    @ObfuscatedName("client.as")
    public static int field307 = 0;

    @ObfuscatedName("client.ay")
    public static int field308 = 0;

    @ObfuscatedName("client.aa")
    public static class41 field360 = class41.field809;

    @ObfuscatedName("client.ar")
    public static class41 field417 = class41.field809;

    @ObfuscatedName("client.ad")
    public static int field367 = 0;

    @ObfuscatedName("client.ak")
    public static int field279 = 0;

    @ObfuscatedName("client.ax")
    public static int field336 = 0;

    @ObfuscatedName("client.bx")
    public static int field438 = 0;

    @ObfuscatedName("client.bo")
    public static int field318 = 0;

    @ObfuscatedName("client.bq")
    public static int field319 = 0;

    @ObfuscatedName("client.bw")
    public static int field320 = 0;

    @ObfuscatedName("client.bt")
    public static int field321 = 0;

    @ObfuscatedName("client.bh")
    public static byte[] field322 = null;

    @ObfuscatedName("client.ck")
    public static class36[] field323 = new class36[32768];

    @ObfuscatedName("client.cu")
    public static int field324 = 0;

    @ObfuscatedName("client.cs")
    public static int[] field325 = new int[32768];

    @ObfuscatedName("client.ci")
    public static int field326 = 0;

    @ObfuscatedName("client.cw")
    public static int[] field394 = new int[250];

    @ObfuscatedName("client.cb")
    public static class160 field328 = new class160(5000);

    @ObfuscatedName("client.ct")
    public static class160 field389 = new class160(5000);

    @ObfuscatedName("client.cf")
    public static class160 field330 = new class160(15000);

    @ObfuscatedName("client.cd")
    public static int field331 = 0;

    @ObfuscatedName("client.cq")
    public static int field398 = 0;

    @ObfuscatedName("client.ca")
    public static int field386 = 0;

    @ObfuscatedName("client.cc")
    public static int field334 = 0;

    @ObfuscatedName("client.cg")
    public static int field541 = 0;

    @ObfuscatedName("client.cv")
    public static int field289 = 0;

    @ObfuscatedName("client.cj")
    public static int field311 = 0;

    @ObfuscatedName("client.co")
    public static int field338 = 0;

    @ObfuscatedName("client.cy")
    public static boolean field339 = false;

    @ObfuscatedName("client.dd")
    public static int field341 = 0;

    @ObfuscatedName("client.da")
    public static int field396 = 1;

    @ObfuscatedName("client.dg")
    public static int field533 = 0;

    @ObfuscatedName("client.dn")
    public static int field344 = 1;

    @ObfuscatedName("client.dh")
    public static int field345 = 0;

    @ObfuscatedName("client.do")
    public static boolean field426 = false;

    @ObfuscatedName("client.dt")
    public static int[][][] field348 = new int[4][13][13];

    @ObfuscatedName("client.dc")
    public static final int[] field349 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dz")
    public static int field350 = 0;

    @ObfuscatedName("client.dk")
    public static int field480 = 2;

    @ObfuscatedName("client.dp")
    public static int field450 = 0;

    @ObfuscatedName("client.ew")
    public static int field353 = 2;

    @ObfuscatedName("client.ev")
    public static int field354 = 0;

    @ObfuscatedName("client.em")
    public static int field305 = 1;

    @ObfuscatedName("client.el")
    public static int field356 = 0;

    @ObfuscatedName("client.ex")
    public static int field357 = 0;

    @ObfuscatedName("client.eb")
    public static int field358 = 2;

    @ObfuscatedName("client.ed")
    public static int field343 = 0;

    @ObfuscatedName("client.er")
    public static int field529 = 1;

    @ObfuscatedName("client.eu")
    public static int field370 = 0;

    @ObfuscatedName("client.ey")
    public static int field478 = 0;

    @ObfuscatedName("client.eh")
    public static int field363 = 2301979;

    @ObfuscatedName("client.eg")
    public static int field364 = 5063219;

    @ObfuscatedName("client.ej")
    public static int field365 = 3353893;

    @ObfuscatedName("client.ep")
    public static int field377 = 7759444;

    @ObfuscatedName("client.fs")
    public static boolean field430 = false;

    @ObfuscatedName("client.fk")
    public static int field368 = 0;

    @ObfuscatedName("client.fi")
    public static int field369 = 128;

    @ObfuscatedName("client.fj")
    public static int field558 = 0;

    @ObfuscatedName("client.fv")
    public static int field473 = 0;

    @ObfuscatedName("client.fm")
    public static int field372 = 0;

    @ObfuscatedName("client.fa")
    public static int field561 = 0;

    @ObfuscatedName("client.fp")
    public static int field374 = 0;

    @ObfuscatedName("client.fr")
    public static int field375 = 50;

    @ObfuscatedName("client.fb")
    public static int field376 = 0;

    @ObfuscatedName("client.fq")
    public static boolean field427 = false;

    @ObfuscatedName("client.ff")
    public static int field378 = 0;

    @ObfuscatedName("client.fz")
    public static int field446 = 0;

    @ObfuscatedName("client.fl")
    public static int field373 = 50;

    @ObfuscatedName("client.fd")
    public static int[] field381 = new int[field373];

    @ObfuscatedName("client.fg")
    public static int[] field292 = new int[field373];

    @ObfuscatedName("client.fc")
    public static int[] field383 = new int[field373];

    @ObfuscatedName("client.fo")
    public static int[] field384 = new int[field373];

    @ObfuscatedName("client.fe")
    public static int[] field385 = new int[field373];

    @ObfuscatedName("client.gj")
    public static int[] field418 = new int[field373];

    @ObfuscatedName("client.gn")
    public static int[] field546 = new int[field373];

    @ObfuscatedName("client.gk")
    public static String[] field489 = new String[field373];

    @ObfuscatedName("client.gd")
    public static int[][] field335 = new int[104][104];

    @ObfuscatedName("client.gh")
    public static int field544 = 0;

    @ObfuscatedName("client.go")
    public static int field391 = -1;

    @ObfuscatedName("client.gx")
    public static int field392 = -1;

    @ObfuscatedName("client.gt")
    public static int field393 = 0;

    @ObfuscatedName("client.gz")
    public static int field525 = 0;

    @ObfuscatedName("client.gu")
    public static int field395 = 0;

    @ObfuscatedName("client.ga")
    public static int field327 = 0;

    @ObfuscatedName("client.gr")
    public static int field397 = 0;

    @ObfuscatedName("client.gg")
    public static int field309 = 0;

    @ObfuscatedName("client.gy")
    public static int field399 = 0;

    @ObfuscatedName("client.gi")
    public static int field400 = 0;

    @ObfuscatedName("client.gf")
    public static int field492 = 0;

    @ObfuscatedName("client.gb")
    public static int field285 = 0;

    @ObfuscatedName("client.ge")
    public static boolean field403 = false;

    @ObfuscatedName("client.gl")
    public static int field404 = 0;

    @ObfuscatedName("client.gw")
    public static int field337 = 0;

    @ObfuscatedName("client.gc")
    public static class24[] field406 = new class24[2048];

    @ObfuscatedName("client.hm")
    public static int field407 = -1;

    @ObfuscatedName("client.hx")
    public static int field408 = 0;

    @ObfuscatedName("client.hp")
    public static int field409 = 0;

    @ObfuscatedName("client.hg")
    public static int[] field410 = new int[1000];

    @ObfuscatedName("client.hf")
    public static final int[] field411 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hs")
    public static String[] field412 = new String[8];

    @ObfuscatedName("client.hv")
    public static boolean[] field413 = new boolean[8];

    @ObfuscatedName("client.hi")
    public static int[] field359 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hw")
    public static int field415 = -1;

    @ObfuscatedName("client.hz")
    public static class129[][][] field416 = new class129[4][104][104];

    @ObfuscatedName("client.hn")
    public static class129 field468 = new class129();

    @ObfuscatedName("client.hc")
    public static class129 field463 = new class129();

    @ObfuscatedName("client.hu")
    public static class129 field419 = new class129();

    @ObfuscatedName("client.hd")
    public static int[] field303 = new int[25];

    @ObfuscatedName("client.hq")
    public static int[] field421 = new int[25];

    @ObfuscatedName("client.he")
    public static int[] field422 = new int[25];

    @ObfuscatedName("client.ht")
    public static int field423 = 0;

    @ObfuscatedName("client.ha")
    public static boolean field424 = false;

    @ObfuscatedName("client.hj")
    public static int field362 = 0;

    @ObfuscatedName("client.ii")
    public static int[] field355 = new int[500];

    @ObfuscatedName("client.id")
    public static int[] field522 = new int[500];

    @ObfuscatedName("client.ib")
    public static int[] field465 = new int[500];

    @ObfuscatedName("client.ie")
    public static int[] field429 = new int[500];

    @ObfuscatedName("client.iv")
    public static String[] field366 = new String[500];

    @ObfuscatedName("client.ic")
    public static String[] field431 = new String[500];

    @ObfuscatedName("client.im")
    public static boolean field432 = false;

    @ObfuscatedName("client.ir")
    public static int field433 = -1;

    @ObfuscatedName("client.ig")
    public static boolean field434 = false;

    @ObfuscatedName("client.io")
    public static int field435 = -1;

    @ObfuscatedName("client.ia")
    public static int field488 = -1;

    @ObfuscatedName("client.iu")
    public static int field437 = 0;

    @ObfuscatedName("client.in")
    public static int field508 = 50;

    @ObfuscatedName("client.iw")
    public static int field439 = 0;

    @ObfuscatedName("client.it")
    public static String field440 = null;

    @ObfuscatedName("client.ih")
    public static boolean field550 = false;

    @ObfuscatedName("client.ip")
    public static int field442 = -1;

    @ObfuscatedName("client.is")
    public static int field443 = -1;

    @ObfuscatedName("client.ji")
    public static String field329 = null;

    @ObfuscatedName("client.jl")
    public static String field351 = null;

    @ObfuscatedName("client.jm")
    public static int field452 = -1;

    @ObfuscatedName("client.jo")
    public static class126 field447 = new class126(8);

    @ObfuscatedName("client.jd")
    public static int field448 = 0;

    @ObfuscatedName("client.jw")
    public static int field449 = 0;

    @ObfuscatedName("client.jn")
    public static class170 field547 = null;

    @ObfuscatedName("client.jz")
    public static int field451 = 0;

    @ObfuscatedName("client.jk")
    public static int field560 = 0;

    @ObfuscatedName("client.jb")
    public static int field371 = 0;

    @ObfuscatedName("client.ju")
    public static int field454 = -1;

    @ObfuscatedName("client.jt")
    public static boolean field455 = false;

    @ObfuscatedName("client.je")
    public static boolean field456 = false;

    @ObfuscatedName("client.jr")
    public static boolean field457 = false;

    @ObfuscatedName("client.js")
    public static class170 field458 = null;

    @ObfuscatedName("client.jp")
    public static class170 field459 = null;

    @ObfuscatedName("client.jj")
    public static class170 field460 = null;

    @ObfuscatedName("client.jf")
    public static int field461 = 0;

    @ObfuscatedName("client.jg")
    public static int field462 = 0;

    @ObfuscatedName("client.jv")
    public static class170 field564 = null;

    @ObfuscatedName("client.jq")
    public static boolean field464 = false;

    @ObfuscatedName("client.jh")
    public static int field507 = -1;

    @ObfuscatedName("client.ja")
    public static int field466 = -1;

    @ObfuscatedName("client.jy")
    public static boolean field420 = false;

    @ObfuscatedName("client.jx")
    public static int field425 = -1;

    @ObfuscatedName("client.kd")
    public static int field469 = -1;

    @ObfuscatedName("client.kh")
    public static boolean field470 = false;

    @ObfuscatedName("client.ka")
    public static int field471 = 1;

    @ObfuscatedName("client.kz")
    public static int[] field472 = new int[32];

    @ObfuscatedName("client.ks")
    public static int field570 = 0;

    @ObfuscatedName("client.kv")
    public static int[] field474 = new int[32];

    @ObfuscatedName("client.ko")
    public static int field475 = 0;

    @ObfuscatedName("client.kx")
    public static int[] field476 = new int[32];

    @ObfuscatedName("client.kb")
    public static int field477 = 0;

    @ObfuscatedName("client.km")
    public static int field444 = 0;

    @ObfuscatedName("client.kn")
    public static int field286 = 0;

    @ObfuscatedName("client.ki")
    public static int field514 = 0;

    @ObfuscatedName("client.ke")
    public static int field481 = 0;

    @ObfuscatedName("client.kp")
    public static int field482 = 0;

    @ObfuscatedName("client.kg")
    public static int field483 = 0;

    @ObfuscatedName("client.ku")
    public static int field484 = 0;

    @ObfuscatedName("client.kq")
    public static class129 field485 = new class129();

    @ObfuscatedName("client.kj")
    public static class129 field486 = new class129();

    @ObfuscatedName("client.la")
    public static class129 field487 = new class129();

    @ObfuscatedName("client.lc")
    public static class126 field310 = new class126(512);

    @ObfuscatedName("client.le")
    public static int field545 = 0;

    @ObfuscatedName("client.ll")
    public static int field490 = -2;

    @ObfuscatedName("client.lp")
    public static boolean[] field491 = new boolean[100];

    @ObfuscatedName("client.ln")
    public static boolean[] field387 = new boolean[100];

    @ObfuscatedName("client.ld")
    public static boolean[] field493 = new boolean[100];

    @ObfuscatedName("client.lk")
    public static int[] field494 = new int[100];

    @ObfuscatedName("client.lg")
    public static int[] field495 = new int[100];

    @ObfuscatedName("client.lv")
    public static int[] field496 = new int[100];

    @ObfuscatedName("client.lj")
    public static int[] field497 = new int[100];

    @ObfuscatedName("client.lm")
    public static int field498 = 0;

    @ObfuscatedName("client.ls")
    public static long field428 = 0L;

    @ObfuscatedName("client.lu")
    public static boolean field499 = true;

    @ObfuscatedName("client.lo")
    public static int field501 = 765;

    @ObfuscatedName("client.lz")
    public static int field502 = 503;

    @ObfuscatedName("client.lh")
    public static int[] field306 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lq")
    public static int field453 = 0;

    @ObfuscatedName("client.lw")
    public static int field382 = 0;

    @ObfuscatedName("client.lt")
    public static String field503 = "";

    @ObfuscatedName("client.mn")
    public static long[] field340 = new long[100];

    @ObfuscatedName("client.mf")
    public static int field379 = 0;

    @ObfuscatedName("client.mr")
    public static int field509 = 0;

    @ObfuscatedName("client.mj")
    public static int[] field510 = new int[128];

    @ObfuscatedName("client.mp")
    public static int[] field511 = new int[128];

    @ObfuscatedName("client.mz")
    public static long field512 = -1L;

    @ObfuscatedName("client.mw")
    public static String field513 = null;

    @ObfuscatedName("client.mv")
    public static String field500 = null;

    @ObfuscatedName("client.ms")
    public static int field515 = -1;

    @ObfuscatedName("client.mq")
    public static int field516 = 0;

    @ObfuscatedName("client.me")
    public static int[] field517 = new int[1000];

    @ObfuscatedName("client.mm")
    public static int[] field518 = new int[1000];

    @ObfuscatedName("client.md")
    public static class225[] field519 = new class225[1000];

    @ObfuscatedName("client.mu")
    public static int field520 = 0;

    @ObfuscatedName("client.mi")
    public static int field521 = 0;

    @ObfuscatedName("client.nd")
    public static int field559 = 0;

    @ObfuscatedName("client.nm")
    public static int field523 = 255;

    @ObfuscatedName("client.ng")
    public static int field524 = -1;

    @ObfuscatedName("client.nl")
    public static boolean field402 = false;

    @ObfuscatedName("client.nk")
    public static int field526 = 127;

    @ObfuscatedName("client.nu")
    public static int field527 = 127;

    @ObfuscatedName("client.ni")
    public static int field528 = 0;

    @ObfuscatedName("client.no")
    public static int[] field553 = new int[50];

    @ObfuscatedName("client.np")
    public static int[] field530 = new int[50];

    @ObfuscatedName("client.nw")
    public static int[] field531 = new int[50];

    @ObfuscatedName("client.nx")
    public static int[] field532 = new int[50];

    @ObfuscatedName("client.na")
    public static class54[] field352 = new class54[50];

    @ObfuscatedName("client.nn")
    public static boolean field333 = false;

    @ObfuscatedName("client.ou")
    public static boolean[] field479 = new boolean[5];

    @ObfuscatedName("client.ob")
    public static int[] field536 = new int[5];

    @ObfuscatedName("client.ok")
    public static int[] field304 = new int[5];

    @ObfuscatedName("client.od")
    public static int[] field538 = new int[5];

    @ObfuscatedName("client.ow")
    public static int[] field539 = new int[5];

    @ObfuscatedName("client.of")
    public static short field540 = 256;

    @ObfuscatedName("client.oe")
    public static short field361 = 205;

    @ObfuscatedName("client.op")
    public static short field542 = 256;

    @ObfuscatedName("client.om")
    public static short field543 = 320;

    @ObfuscatedName("client.oa")
    public static short field401 = 1;

    @ObfuscatedName("client.oq")
    public static short field506 = 32767;

    @ObfuscatedName("client.oj")
    public static short field556 = 1;

    @ObfuscatedName("client.os")
    public static short field557 = 32767;

    @ObfuscatedName("client.ox")
    public static int field317 = 0;

    @ObfuscatedName("client.on")
    public static int field549 = 0;

    @ObfuscatedName("client.og")
    public static int field445 = 0;

    @ObfuscatedName("client.oi")
    public static int field551 = 0;

    @ObfuscatedName("client.ov")
    public static int field552 = 0;

    @ObfuscatedName("client.oy")
    public static int field342 = 0;

    @ObfuscatedName("client.oh")
    public static int field554 = 0;

    @ObfuscatedName("client.pv")
    public static class15[] field555 = new class15[400];

    @ObfuscatedName("client.pp")
    public static class131 field313 = new class131();

    @ObfuscatedName("client.pf")
    public static int field467 = 0;

    @ObfuscatedName("client.pn")
    public static class20[] field291 = new class20[400];

    @ObfuscatedName("client.pw")
    public static class167 field563 = new class167();

    @ObfuscatedName("client.pi")
    public static int field390 = -1;

    @ObfuscatedName("client.pq")
    public static int field300 = -1;

    @ObfuscatedName("client.pd")
    public static class5[] field562 = new class5[8];

    @ObfuscatedName("client.ph")
    public static long field332 = -1L;

    @ObfuscatedName("client.pg")
    public static long field504 = -1L;

    @ObfuscatedName("client.ps")
    public static final class23 field565 = new class23();

    @ObfuscatedName("client.pu")
    public static int[] field566 = new int[50];

    @ObfuscatedName("client.pz")
    public static int[] field567 = new int[50];

    @ObfuscatedName("client.t(I)V")
    public final void method264() {
    }

    public final void init() {
        if (!this.method2042()) {
            return;
        }
        class215[] var1 = class215.method9();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class215 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3163);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3163)) {
                    case 1:
                        field290 = Integer.parseInt(var4);
                    case 2:
                    case 6:
                    case 14:
                    default:
                        break;
                    case 3:
                        field296 = Integer.parseInt(var4);
                        break;
                    case 4:
                        Statics.field227 = var4;
                        break;
                    case 5:
                        Statics.field1568 = var4;
                        break;
                    case 7:
                        field283 = Integer.parseInt(var4);
                        break;
                    case 8:
                        Statics.field79 = Integer.parseInt(var4);
                        break;
                    case 9:
                        class180[] var11 = new class180[] { class180.field2688, class180.field2689, class180.field2687, class180.field2685, class180.field2686, class180.field2694 };
                        Statics.field414 = (class180) class149.method784(var11, Integer.parseInt(var4));
                        if (Statics.field414 == class180.field2689) {
                            Statics.field287 = class229.field3253;
                        } else {
                            Statics.field287 = class229.field3258;
                        }
                        break;
                    case 10:
                        if (var4.equalsIgnoreCase(class38.field780)) {
                            field288 = true;
                        } else {
                            field288 = false;
                        }
                        break;
                    case 11:
                        if (var4.equalsIgnoreCase(class38.field780)) {
                        }
                        break;
                    case 12:
                        int var5 = Integer.parseInt(var4);
                        class179[] var6 = new class179[] { class179.field2672, class179.field2675, class179.field2681, class179.field2677 };
                        class179[] var7 = var6;
                        int var8 = 0;
                        class179 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class179 var9 = var7[var8];
                            if (var9.field2679 == var5) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field284 = var10;
                        break;
                    case 13:
                        field282 = Integer.parseInt(var4);
                        break;
                    case 15:
                        Statics.field2645 = Integer.parseInt(var4);
                }
            }
        }
        class88.field1482 = false;
        field405 = false;
        Statics.field1718 = this.getCodeBase().getHost();
        String var12 = Statics.field284.field2676;
        byte var13 = 0;
        try {
            Statics.field1680 = 16;
            Statics.field1716 = var13;
            try {
                Statics.field2 = System.getProperty("os.name");
            } catch (Exception var59) {
                Statics.field2 = "Unknown";
            }
            Statics.field1686 = Statics.field2.toLowerCase();
            try {
                Statics.field1687 = System.getProperty("user.home");
                if (Statics.field1687 != null) {
                    Statics.field1687 = Statics.field1687 + "/";
                }
            } catch (Exception var58) {
            }
            try {
                if (Statics.field1686.startsWith("win")) {
                    if (Statics.field1687 == null) {
                        Statics.field1687 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1687 == null) {
                    Statics.field1687 = System.getenv("HOME");
                }
                if (Statics.field1687 != null) {
                    Statics.field1687 = Statics.field1687 + "/";
                }
            } catch (Exception var57) {
            }
            if (Statics.field1687 == null) {
                Statics.field1687 = "~/";
            }
            Statics.field2176 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1687, "/tmp/", "" };
            Statics.field1849 = new String[] { ".jagex_cache_" + Statics.field1716, ".file_store_" + Statics.field1716 };
            int var17 = 0;
            label280: while (var17 < 4) {
                String var18 = var17 == 0 ? "" : "" + var17;
                Statics.field1678 = new File(Statics.field1687, "jagex_cl_oldschool_" + var12 + var18 + ".dat");
                String var19 = null;
                String var20 = null;
                boolean var21 = false;
                if (Statics.field1678.exists()) {
                    try {
                        class74 var22 = new class74(Statics.field1678, "rw", 10000L);
                        class154 var23 = new class154((int) var22.method1393());
                        while (var23.field2085 < var23.field2083.length) {
                            int var24 = var22.method1392(var23.field2083, var23.field2085, var23.field2083.length - var23.field2085);
                            if (var24 == -1) {
                                throw new IOException();
                            }
                            var23.field2085 += var24;
                        }
                        var23.field2085 = 0;
                        int var25 = var23.method2678();
                        if (var25 < 1 || var25 > 3) {
                            throw new IOException("" + var25);
                        }
                        int var26 = 0;
                        if (var25 > 1) {
                            var26 = var23.method2678();
                        }
                        if (var25 <= 2) {
                            var19 = var23.method2687();
                            if (var26 == 1) {
                                var20 = var23.method2687();
                            }
                        } else {
                            var19 = var23.method2688();
                            if (var26 == 1) {
                                var20 = var23.method2688();
                            }
                        }
                        var22.method1394();
                    } catch (IOException var62) {
                        var62.printStackTrace();
                    }
                    if (var19 != null) {
                        File var28 = new File(var19);
                        if (!var28.exists()) {
                            var19 = null;
                        }
                    }
                    if (var19 != null) {
                        File var29 = new File(var19, "test.dat");
                        if (!class105.method636(var29, true)) {
                            var19 = null;
                        }
                    }
                }
                if (var19 == null && var17 == 0) {
                    label256: for (int var30 = 0; var30 < Statics.field1849.length; var30++) {
                        for (int var31 = 0; var31 < Statics.field2176.length; var31++) {
                            File var32 = new File(Statics.field2176[var31] + Statics.field1849[var30] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var32.exists() && class105.method636(new File(var32, "test.dat"), true)) {
                                var19 = var32.toString();
                                var21 = true;
                                break label256;
                            }
                        }
                    }
                }
                if (var19 == null) {
                    var19 = Statics.field1687 + File.separatorChar + "jagexcache" + var18 + File.separatorChar + "oldschool" + File.separatorChar + var12 + File.separatorChar;
                    var21 = true;
                }
                if (var20 != null) {
                    File var33 = new File(var20);
                    File var34 = new File(var19);
                    try {
                        File[] var35 = var33.listFiles();
                        File[] var36 = var35;
                        for (int var37 = 0; var37 < var36.length; var37++) {
                            File var38 = var36[var37];
                            File var39 = new File(var34, var38.getName());
                            boolean var40 = var38.renameTo(var39);
                            if (!var40) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var61) {
                        var61.printStackTrace();
                    }
                    var21 = true;
                }
                if (var21) {
                    class105.method52(new File(var19), (File) null);
                }
                File var42 = new File(var19);
                Statics.field1679 = var42;
                if (!Statics.field1679.exists()) {
                    Statics.field1679.mkdirs();
                }
                File[] var43 = Statics.field1679.listFiles();
                if (var43 == null) {
                    break;
                }
                File[] var44 = var43;
                int var45 = 0;
                while (true) {
                    if (var45 >= var44.length) {
                        break label280;
                    }
                    File var46 = var44[var45];
                    if (!class105.method636(var46, false)) {
                        var17++;
                        break;
                    }
                    var45++;
                }
            }
            File var47 = Statics.field1679;
            Statics.field1724 = var47;
            if (!Statics.field1724.exists()) {
                throw new RuntimeException("");
            }
            class108.field1723 = true;
            try {
                File var48 = new File(Statics.field1687, "random.dat");
                if (var48.exists()) {
                    class105.field1682 = new class73(new class74(var48, "rw", 25L), 24, 0);
                } else {
                    label209: for (int var49 = 0; var49 < Statics.field1849.length; var49++) {
                        for (int var50 = 0; var50 < Statics.field2176.length; var50++) {
                            File var51 = new File(Statics.field2176[var50] + Statics.field1849[var49] + File.separatorChar + "random.dat");
                            if (var51.exists()) {
                                class105.field1682 = new class73(new class74(var51, "rw", 25L), 24, 0);
                                break label209;
                            }
                        }
                    }
                }
                if (class105.field1682 == null) {
                    RandomAccessFile var52 = new RandomAccessFile(var48, "rw");
                    int var53 = var52.read();
                    var52.seek(0L);
                    var52.write(var53);
                    var52.seek(0L);
                    var52.close();
                    class105.field1682 = new class73(new class74(var48, "rw", 25L), 24, 0);
                }
            } catch (IOException var60) {
            }
            class105.field1684 = new class73(new class74(class108.method1858("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class105.field1681 = new class73(new class74(class108.method1858("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1822 = new class73[Statics.field1680];
            for (int var55 = 0; var55 < Statics.field1680; var55++) {
                Statics.field1822[var55] = new class73(new class74(class108.method1858("main_file_cache.idx" + var55), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var63) {
            class102.method1864((String) null, var63);
        }
        Statics.field280 = this;
        this.method2041(765, 503, 137);
    }

    @ObfuscatedName("client.x(I)V")
    public final void method267() {
        Statics.field1407 = field296 == 0 ? 43594 : field282 + 40000;
        Statics.field891 = field296 == 0 ? 443 : field282 + 50000;
        Statics.field714 = Statics.field1407;
        Statics.field3213 = class168.field2177;
        Statics.field152 = class168.field2173;
        Statics.field2167 = class168.field2174;
        Statics.field2168 = class168.field2175;
        if (Statics.field1662.toLowerCase().indexOf("microsoft") == -1) {
            class106.field1721[44] = 71;
            class106.field1721[45] = 26;
            class106.field1721[46] = 72;
            class106.field1721[47] = 73;
            class106.field1721[59] = 57;
            class106.field1721[61] = 27;
            class106.field1721[91] = 42;
            class106.field1721[92] = 74;
            class106.field1721[93] = 43;
            class106.field1721[192] = 28;
            class106.field1721[222] = 58;
            class106.field1721[520] = 59;
        } else {
            class106.field1721[186] = 57;
            class106.field1721[187] = 27;
            class106.field1721[188] = 71;
            class106.field1721[189] = 26;
            class106.field1721[190] = 72;
            class106.field1721[191] = 73;
            class106.field1721[192] = 58;
            class106.field1721[219] = 42;
            class106.field1721[220] = 74;
            class106.field1721[221] = 43;
            class106.field1721[222] = 59;
            class106.field1721[223] = 28;
        }
        class106.method2984(Statics.field3);
        class116.method634(Statics.field3);
        Statics.field74 = class113.method3423();
        if (Statics.field74 != null) {
            Statics.field74.method1969(Statics.field3);
        }
        Statics.field853 = new class117(255, class105.field1684, class105.field1681, 500000);
        Statics.field1552 = class31.method931();
        Statics.field2015 = this.getToolkit().getSystemClipboard();
        class115.method80(this, Statics.field268);
        if (field296 != 0) {
            field299 = true;
        }
        int var1 = Statics.field1552.field694;
        field428 = 0L;
        if (var1 >= 2) {
            field499 = true;
        } else {
            field499 = false;
        }
        method1861();
        if (field436 >= 25) {
            field328.method2936(166);
            field328.method2832(method628());
            field328.method2664(Statics.field22);
            field328.method2664(Statics.field217);
        }
        field1774 = true;
    }

    @ObfuscatedName("client.z(I)V")
    public final void method268() {
        field293++;
        this.method525();
        while (true) {
            class129 var1 = class184.field2731;
            class181 var2;
            synchronized (class184.field2731) {
                var2 = (class181) class184.field2726.method2333();
            }
            if (var2 == null) {
                class139.method1162();
                method225();
                class106.method2894();
                class116 var4 = class116.field1801;
                synchronized (class116.field1801) {
                    class116.field1810 = class116.field1798;
                    class116.field1803 = class116.field1796;
                    class116.field1802 = class116.field1800 * -1136434159;
                    class116.field1797 = class116.field1804;
                    class116.field1809 = class116.field1805;
                    class116.field1799 = class116.field1806;
                    class116.field1811 = class116.field1807;
                    class116.field1804 = 0;
                }
                if (Statics.field74 != null) {
                    int var6 = Statics.field74.method1976();
                    field484 = var6;
                }
                if (field436 == 0) {
                    method92();
                    class114.method942();
                } else if (field436 == 5) {
                    class42.method3472(this);
                    method92();
                    class114.method942();
                } else if (field436 == 10 || field436 == 11) {
                    class42.method3472(this);
                } else if (field436 == 20) {
                    class42.method3472(this);
                    method2388();
                } else if (field436 == 25) {
                    method189();
                }
                if (field436 == 30) {
                    method192();
                } else if (field436 == 40 || field436 == 45) {
                    method2388();
                }
                return;
            }
            var2.field2695.method3261(var2.field2697, (int) var2.field1879, var2.field2696, false);
        }
    }

    @ObfuscatedName("client.p(I)V")
    public final void method389() {
        boolean var1;
        label173: {
            try {
                if (class139.field1916 == 2) {
                    if (Statics.field953 == null) {
                        Statics.field953 = class145.method2592(Statics.field1919, Statics.field206, Statics.field1447);
                        if (Statics.field953 == null) {
                            var1 = false;
                            break label173;
                        }
                    }
                    if (Statics.field42 == null) {
                        Statics.field42 = new class61(Statics.field1915, Statics.field1914);
                    }
                    if (Statics.field801.method2412(Statics.field953, Statics.field1917, Statics.field42, 22050)) {
                        Statics.field801.method2425();
                        Statics.field801.method2410(Statics.field1562);
                        Statics.field801.method2459(Statics.field953, Statics.field1714);
                        class139.field1916 = 0;
                        Statics.field953 = null;
                        Statics.field42 = null;
                        Statics.field1919 = null;
                        var1 = true;
                        break label173;
                    }
                }
            } catch (Exception var18) {
                var18.printStackTrace();
                Statics.field801.method2506();
                class139.field1916 = 0;
                Statics.field953 = null;
                Statics.field42 = null;
                Statics.field1919 = null;
            }
            var1 = false;
        }
        if (var1 && field402 && Statics.field31 != null) {
            Statics.field31.method1085();
        }
        if (field436 == 10 || field436 == 20 || field436 == 30) {
            if (field428 != 0L && class156.method910() > field428) {
                int var4 = method628();
                field428 = 0L;
                if (var4 >= 2) {
                    field499 = true;
                } else {
                    field499 = false;
                }
                method1861();
                if (field436 >= 25) {
                    field328.method2936(166);
                    field328.method2832(method628());
                    field328.method2664(Statics.field22);
                    field328.method2664(Statics.field217);
                }
                field1774 = true;
            } else if (field1777) {
                method122();
            }
        }
        Dimension var5 = this.method2050();
        if (Statics.field1554 != var5.width || Statics.field1446 != var5.height || field1776) {
            method1861();
            field428 = class156.method910() + 500L;
            field1776 = false;
        }
        boolean var6 = false;
        if (field1774) {
            field1774 = false;
            var6 = true;
            for (int var7 = 0; var7 < 100; var7++) {
                field491[var7] = true;
            }
        }
        if (var6) {
            method68();
        }
        if (field436 == 0) {
            class114.method957(class42.field830, class42.field835, (Color) null, var6);
        } else if (field436 == 5) {
            class42.method207(Statics.field171, Statics.field568, Statics.field120, var6);
        } else if (field436 == 10 || field436 == 11) {
            class42.method207(Statics.field171, Statics.field568, Statics.field120, var6);
        } else if (field436 == 20) {
            class42.method207(Statics.field171, Statics.field568, Statics.field120, var6);
        } else if (field436 == 25) {
            if (field345 == 1) {
                if (field341 > field396) {
                    field396 = field341;
                }
                int var8 = (field396 * 50 - field341 * 50) / field396;
                method66(class174.field2599 + class38.field782 + class38.field779 + var8 + "%" + class38.field786, false);
            } else if (field345 == 2) {
                if (field533 > field344) {
                    field344 = field533;
                }
                int var9 = (field344 * 50 - field533 * 50) / field344 + 50;
                method66(class174.field2599 + class38.field782 + class38.field779 + var9 + "%" + class38.field786, false);
            } else {
                method66(class174.field2599, false);
            }
        } else if (field436 == 30) {
            method692();
        } else if (field436 == 40) {
            method66(class174.field2402 + class38.field782 + class174.field2520, false);
        } else if (field436 == 45) {
            method66(class174.field2511, false);
        }
        if (field436 == 30 && field498 == 0 && !var6) {
            try {
                Graphics var10 = Statics.field3.getGraphics();
                for (int var11 = 0; var11 < field545; var11++) {
                    if (field387[var11]) {
                        Statics.field232.method3862(var10, field494[var11], field495[var11], field496[var11], field497[var11]);
                        field387[var11] = false;
                    }
                }
            } catch (Exception var17) {
                Statics.field3.repaint();
            }
        } else if (field436 > 0) {
            try {
                Graphics var13 = Statics.field3.getGraphics();
                Statics.field232.method3860(var13, 0, 0);
                for (int var14 = 0; var14 < field545; var14++) {
                    field387[var14] = false;
                }
            } catch (Exception var16) {
                Statics.field3.repaint();
            }
        }
    }

    @ObfuscatedName("client.s(I)V")
    public final void method270() {
        if (Statics.field86.method888()) {
            Statics.field86.method885();
        }
        if (Statics.field1622 != null) {
            Statics.field1622.field209 = false;
        }
        Statics.field1622 = null;
        if (Statics.field47 != null) {
            Statics.field47.method1996();
            Statics.field47 = null;
        }
        class106.method82();
        if (class116.field1801 != null) {
            class116 var1 = class116.field1801;
            synchronized (class116.field1801) {
                class116.field1801 = null;
            }
        }
        Statics.field74 = null;
        if (Statics.field31 != null) {
            Statics.field31.method1112();
        }
        if (Statics.field569 != null) {
            Statics.field569.method1112();
        }
        class186.method940();
        Object var3 = class184.field2729;
        synchronized (class184.field2729) {
            if (class184.field2728 != 0) {
                class184.field2728 = 1;
                try {
                    class184.field2729.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        class105.method2661();
    }

    @ObfuscatedName("cg.o(II)V")
    public static void method1883(int arg0) {
        if (field436 == arg0) {
            return;
        }
        if (field436 == 0) {
            Statics.field234 = null;
            Statics.field1623 = null;
            Statics.field945 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field318 = 0;
            field319 = 0;
            field320 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2057 != null) {
            Statics.field2057.method1996();
            Statics.field2057 = null;
        }
        if (field436 == 25) {
            field345 = 0;
            field341 = 0;
            field396 = 1;
            field533 = 0;
            field344 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class42.method782(Statics.field3, Statics.field1546, Statics.field1791, true, 0);
        } else if (arg0 == 20) {
            class42.method782(Statics.field3, Statics.field1546, Statics.field1791, true, field436 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class42.method782(Statics.field3, Statics.field1546, Statics.field1791, false, 4);
        } else if (Statics.field820) {
            Statics.field819 = null;
            Statics.field817 = null;
            Statics.field54 = null;
            Statics.field821 = null;
            Statics.field847 = null;
            Statics.field44 = null;
            Statics.field65 = null;
            Statics.field823 = null;
            Statics.field838 = null;
            Statics.field576 = null;
            Statics.field173 = null;
            Statics.field1818 = null;
            Statics.field2692 = null;
            Statics.field796 = null;
            Statics.field2123 = null;
            Statics.field1174 = null;
            Statics.field762 = null;
            Statics.field2038 = null;
            Statics.field2089 = null;
            Statics.field131 = null;
            Statics.field829 = null;
            Statics.field52 = null;
            class139.method757(2);
            class186.method691(true);
            Statics.field820 = false;
        }
        field436 = arg0;
    }

    @ObfuscatedName("client.y(I)V")
    public void method525() {
        if (field436 == 1000) {
            return;
        }
        long var1 = class156.method910();
        int var3 = (int) (var1 - Statics.field2744);
        Statics.field2744 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class186.field2743 += var3;
        boolean var4;
        if (class186.field2753 == 0 && class186.field2748 == 0 && class186.field2751 == 0 && class186.field2756 == 0) {
            var4 = true;
        } else if (Statics.field2742 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class186.field2743 > 30000) {
                        throw new IOException();
                    }
                    while (class186.field2748 < 20 && class186.field2756 > 0) {
                        class182 var5 = (class182) class186.field2746.method2275();
                        class154 var6 = new class154(4);
                        var6.method2832(1);
                        var6.method2684((int) var5.field1879);
                        Statics.field2742.method2001(var6.field2083, 0, 4);
                        class186.field2747.method2277(var5, var5.field1879);
                        class186.field2756--;
                        class186.field2748++;
                    }
                    while (class186.field2753 < 20 && class186.field2751 > 0) {
                        class182 var7 = (class182) class186.field2749.method2228();
                        class154 var8 = new class154(4);
                        var8.method2832(0);
                        var8.method2684((int) var7.field1879);
                        Statics.field2742.method2001(var8.field2083, 0, 4);
                        var7.method2349();
                        class186.field2757.method2277(var7, var7.field1879);
                        class186.field2751--;
                        class186.field2753++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2742.method2018();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class186.field2743 = 0;
                        byte var11 = 0;
                        if (Statics.field2182 == null) {
                            var11 = 8;
                        } else if (class186.field2755 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class186.field2754.field2085;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2742.method2000(class186.field2754.field2083, class186.field2754.field2085, var12);
                            if (class186.field2758 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class186.field2754.field2083[class186.field2754.field2085 + var13] ^= class186.field2758;
                                }
                            }
                            class186.field2754.field2085 += var12;
                            if (class186.field2754.field2085 < var11) {
                                break;
                            }
                            if (Statics.field2182 == null) {
                                class186.field2754.field2085 = 0;
                                int var14 = class186.field2754.method2678();
                                int var15 = class186.field2754.method2801();
                                int var16 = class186.field2754.method2678();
                                int var17 = class186.field2754.method2683();
                                long var18 = (long) ((var14 << 16) + var15);
                                class182 var20 = (class182) class186.field2747.method2280(var18);
                                Statics.field2350 = true;
                                if (var20 == null) {
                                    var20 = (class182) class186.field2757.method2280(var18);
                                    Statics.field2350 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2182 = var20;
                                Statics.field84 = new class154(var17 + var21 + Statics.field2182.field2703);
                                Statics.field84.method2832(var16);
                                Statics.field84.method2666(var17);
                                class186.field2755 = 8;
                                class186.field2754.field2085 = 0;
                            } else if (class186.field2755 == 0) {
                                if (class186.field2754.field2083[0] == -1) {
                                    class186.field2755 = 1;
                                    class186.field2754.field2085 = 0;
                                } else {
                                    Statics.field2182 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field84.field2083.length - Statics.field2182.field2703;
                            int var23 = 512 - class186.field2755;
                            if (var23 > var22 - Statics.field84.field2085) {
                                var23 = var22 - Statics.field84.field2085;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2742.method2000(Statics.field84.field2083, Statics.field84.field2085, var23);
                            if (class186.field2758 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field84.field2083[Statics.field84.field2085 + var24] ^= class186.field2758;
                                }
                            }
                            Statics.field84.field2085 += var23;
                            class186.field2755 += var23;
                            if (Statics.field84.field2085 == var22) {
                                if (Statics.field2182.field1879 == 16711935L) {
                                    Statics.field155 = Statics.field84;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class185 var26 = class186.field2750[var25];
                                        if (var26 != null) {
                                            Statics.field155.field2085 = var25 * 8 + 5;
                                            int var27 = Statics.field155.method2683();
                                            int var28 = Statics.field155.method2683();
                                            var26.method3237(var27, var28);
                                        }
                                    }
                                } else {
                                    class186.field2752.reset();
                                    class186.field2752.update(Statics.field84.field2083, 0, var22);
                                    int var29 = (int) class186.field2752.getValue();
                                    if (Statics.field2182.field2705 != var29) {
                                        try {
                                            Statics.field2742.method1996();
                                        } catch (Exception var35) {
                                        }
                                        class186.field2759++;
                                        Statics.field2742 = null;
                                        class186.field2758 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class186.field2759 = 0;
                                    class186.field2760 = 0;
                                    Statics.field2182.field2704.method3236((int) (Statics.field2182.field1879 & 0xFFFFL), Statics.field84.field2083, (Statics.field2182.field1879 & 0xFF0000L) == 16711680L, Statics.field2350);
                                }
                                Statics.field2182.method2313();
                                if (Statics.field2350) {
                                    class186.field2748--;
                                } else {
                                    class186.field2753--;
                                }
                                class186.field2755 = 0;
                                Statics.field2182 = null;
                                Statics.field84 = null;
                            } else {
                                if (class186.field2755 != 512) {
                                    break;
                                }
                                class186.field2755 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2742.method1996();
                } catch (Exception var34) {
                }
                class186.field2760++;
                Statics.field2742 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method586();
        }
    }

    @ObfuscatedName("client.w(I)V")
    public void method586() {
        if (class186.field2759 >= 4) {
            this.method2048("js5crc");
            field436 = 1000;
            return;
        }
        if (class186.field2760 >= 4) {
            if (field436 <= 5) {
                this.method2048("js5io");
                field436 = 1000;
                return;
            }
            field336 = 3000;
            class186.field2760 = 3;
        }
        if (--field336 + 1 > 0) {
            return;
        }
        try {
            if (field279 == 0) {
                Statics.field2720 = Statics.field580.method1912(Statics.field1718, Statics.field714);
                field279++;
            }
            if (field279 == 1) {
                if (Statics.field2720.field1656 == 2) {
                    this.method273(-1);
                    return;
                }
                if (Statics.field2720.field1656 == 1) {
                    field279++;
                }
            }
            if (field279 == 2) {
                Statics.field160 = new class111((Socket) Statics.field2720.field1660, Statics.field580);
                class154 var1 = new class154(5);
                var1.method2832(15);
                var1.method2666(137);
                Statics.field160.method2001(var1.field2083, 0, 5);
                field279++;
                Statics.field2772 = class156.method910();
            }
            if (field279 == 3) {
                if (field436 <= 5 || Statics.field160.method2018() > 0) {
                    int var2 = Statics.field160.method2020();
                    if (var2 != 0) {
                        this.method273(var2);
                        return;
                    }
                    field279++;
                } else if (class156.method910() - Statics.field2772 > 30000L) {
                    this.method273(-2);
                    return;
                }
            }
            if (field279 == 4) {
                class111 var3 = Statics.field160;
                boolean var4 = field436 > 20;
                if (Statics.field2742 != null) {
                    try {
                        Statics.field2742.method1996();
                    } catch (Exception var14) {
                    }
                    Statics.field2742 = null;
                }
                Statics.field2742 = var3;
                class186.method691(var4);
                class186.field2754.field2085 = 0;
                Statics.field2182 = null;
                Statics.field84 = null;
                class186.field2755 = 0;
                while (true) {
                    class182 var6 = (class182) class186.field2747.method2275();
                    if (var6 == null) {
                        while (true) {
                            class182 var7 = (class182) class186.field2757.method2275();
                            if (var7 == null) {
                                if (class186.field2758 != 0) {
                                    try {
                                        class154 var8 = new class154(4);
                                        var8.method2832(4);
                                        var8.method2832(class186.field2758);
                                        var8.method2664(0);
                                        Statics.field2742.method2001(var8.field2083, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2742.method1996();
                                        } catch (Exception var12) {
                                        }
                                        class186.field2760++;
                                        Statics.field2742 = null;
                                    }
                                }
                                class186.field2743 = 0;
                                Statics.field2744 = class156.method910();
                                Statics.field2720 = null;
                                Statics.field160 = null;
                                field279 = 0;
                                field438 = 0;
                                return;
                            }
                            class186.field2749.method2217(var7);
                            class186.field2745.method2277(var7, var7.field1879);
                            class186.field2751++;
                            class186.field2753--;
                        }
                    }
                    class186.field2746.method2277(var6, var6.field1879);
                    class186.field2756++;
                    class186.field2748--;
                }
            }
        } catch (IOException var15) {
            this.method273(-3);
        }
    }

    @ObfuscatedName("client.m(II)V")
    public void method273(int arg0) {
        Statics.field2720 = null;
        Statics.field160 = null;
        field279 = 0;
        if (Statics.field714 == Statics.field1407) {
            Statics.field714 = Statics.field891;
        } else {
            Statics.field714 = Statics.field1407;
        }
        field438++;
        if (field438 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field436 <= 5) {
                this.method2048("js5connect_full");
                field436 = 1000;
            } else {
                field336 = 3000;
            }
        } else if (field438 >= 2 && arg0 == 6) {
            this.method2048("js5connect_outofdate");
            field436 = 1000;
        } else if (field438 >= 4) {
            if (field436 <= 5) {
                this.method2048("js5connect");
                field436 = 1000;
            } else {
                field336 = 3000;
            }
        }
    }

    @ObfuscatedName("n.u(I)V")
    public static void method92() {
        if (field367 == 0) {
            Statics.field2856 = new class88(4, 104, 104, class11.field99);
            for (int var0 = 0; var0 < 4; var0++) {
                field346[var0] = new class118(104, 104);
            }
            Statics.field2026 = new class225(512, 512);
            class42.field835 = class174.field2368;
            class42.field830 = 5;
            field367 = 20;
        } else if (field367 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class85.field1436[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class88.method1802(var1, 500, 800, 512, 334);
            class42.field835 = class174.field2369;
            class42.field830 = 10;
            field367 = 30;
        } else if (field367 == 30) {
            Statics.field239 = method71(0, false, true, true);
            Statics.field912 = method71(1, false, true, true);
            Statics.field314 = method71(2, true, false, true);
            Statics.field315 = method71(3, false, true, true);
            Statics.field14 = method71(4, false, true, true);
            Statics.field589 = method71(5, true, true, true);
            Statics.field123 = method71(6, true, true, false);
            Statics.field267 = method71(7, false, true, true);
            Statics.field1791 = method71(8, false, true, true);
            Statics.field815 = method71(9, false, true, true);
            Statics.field1546 = method71(10, false, true, true);
            Statics.field1790 = method71(11, false, true, true);
            Statics.field2005 = method71(12, false, true, true);
            Statics.field534 = method71(13, true, false, true);
            Statics.field2872 = method71(14, false, true, false);
            Statics.field1459 = method71(15, false, true, true);
            class42.field835 = class174.field2403;
            class42.field830 = 20;
            field367 = 40;
        } else if (field367 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field239.method3234() * 4 / 100;
            int var8 = var7 + Statics.field912.method3234() * 4 / 100;
            int var9 = var8 + Statics.field314.method3234() * 2 / 100;
            int var10 = var9 + Statics.field315.method3234() * 2 / 100;
            int var11 = var10 + Statics.field14.method3234() * 6 / 100;
            int var12 = var11 + Statics.field589.method3234() * 4 / 100;
            int var13 = var12 + Statics.field123.method3234() * 2 / 100;
            int var14 = var13 + Statics.field267.method3234() * 60 / 100;
            int var15 = var14 + Statics.field1791.method3234() * 2 / 100;
            int var16 = var15 + Statics.field815.method3234() * 2 / 100;
            int var17 = var16 + Statics.field1546.method3234() * 2 / 100;
            int var18 = var17 + Statics.field1790.method3234() * 2 / 100;
            int var19 = var18 + Statics.field2005.method3234() * 2 / 100;
            int var20 = var19 + Statics.field534.method3234() * 2 / 100;
            int var21 = var20 + Statics.field2872.method3234() * 2 / 100;
            int var22 = var21 + Statics.field1459.method3234() * 2 / 100;
            if (var22 == 100) {
                class42.field835 = class174.field2365;
                class42.field830 = 30;
                field367 = 45;
            } else {
                if (var22 != 0) {
                    class42.field835 = class174.field2371 + var22 + "%";
                }
                class42.field830 = 30;
            }
        } else if (field367 == 45) {
            class58.method3026(22050, !field405, 2);
            class140 var23 = new class140();
            var23.method2418(9, 128);
            Statics.field31 = class58.method844(Statics.field580, Statics.field3, 0, 22050);
            Statics.field31.method1082(var23);
            class139.method1882(Statics.field1459, Statics.field2872, Statics.field14, var23);
            Statics.field569 = class58.method844(Statics.field580, Statics.field3, 1, 2048);
            Statics.field169 = new class52();
            Statics.field569.method1082(Statics.field169);
            Statics.field1854 = new class66(22050, Statics.field3080);
            class42.field835 = class174.field2373;
            class42.field830 = 35;
            field367 = 50;
        } else if (field367 == 50) {
            int var24 = 0;
            if (Statics.field568 == null) {
                class185 var25 = Statics.field1791;
                class185 var26 = Statics.field534;
                int var27 = var25.method3165("p11_full");
                int var28 = var25.method3209(var27, "");
                class209 var29;
                if (class226.method3262(var25, var27, var28)) {
                    var29 = class226.method1411(var26.method3226(var27, var28));
                } else {
                    var29 = null;
                }
                Statics.field568 = var29;
            } else {
                var24++;
            }
            if (Statics.field120 == null) {
                class185 var31 = Statics.field1791;
                class185 var32 = Statics.field534;
                int var33 = var31.method3165("p12_full");
                int var34 = var31.method3209(var33, "");
                class209 var35;
                if (class226.method3262(var31, var33, var34)) {
                    var35 = class226.method1411(var32.method3226(var33, var34));
                } else {
                    var35 = null;
                }
                Statics.field120 = var35;
            } else {
                var24++;
            }
            if (Statics.field171 == null) {
                class185 var37 = Statics.field1791;
                class185 var38 = Statics.field534;
                int var39 = var37.method3165("b12_full");
                int var40 = var37.method3209(var39, "");
                class209 var41;
                if (class226.method3262(var37, var39, var40)) {
                    var41 = class226.method1411(var38.method3226(var39, var40));
                } else {
                    var41 = null;
                }
                Statics.field171 = var41;
            } else {
                var24++;
            }
            if (var24 < 3) {
                class42.field835 = class174.field2374 + var24 * 100 / 3 + "%";
                class42.field830 = 40;
            } else {
                Statics.field1525 = new class231(true);
                class42.field835 = class174.field2375;
                class42.field830 = 40;
                field367 = 60;
            }
        } else if (field367 == 60) {
            class185 var43 = Statics.field1546;
            class185 var44 = Statics.field1791;
            int var45 = 0;
            if (var43.method3168("title.jpg", "")) {
                var45++;
            }
            if (var44.method3168("logo", "")) {
                var45++;
            }
            if (var44.method3168("logo_deadman_mode", "")) {
                var45++;
            }
            if (var44.method3168("titlebox", "")) {
                var45++;
            }
            if (var44.method3168("titlebutton", "")) {
                var45++;
            }
            if (var44.method3168("runes", "")) {
                var45++;
            }
            if (var44.method3168("title_mute", "")) {
                var45++;
            }
            if (var44.method3169("options_radio_buttons,0")) {
                var45++;
            }
            if (var44.method3169("options_radio_buttons,2")) {
                var45++;
            }
            var44.method3168("sl_back", "");
            var44.method3168("sl_flags", "");
            var44.method3168("sl_arrows", "");
            var44.method3168("sl_stars", "");
            var44.method3168("sl_button", "");
            byte var48 = 9;
            if (var45 < var48) {
                class42.field835 = class174.field2417 + var45 * 100 / var48 + "%";
                class42.field830 = 50;
            } else {
                class42.field835 = class174.field2445;
                class42.field830 = 50;
                method1883(5);
                field367 = 70;
            }
        } else if (field367 == 70) {
            if (Statics.field314.method3154()) {
                class185 var50 = Statics.field314;
                Statics.field3052 = var50;
                class192.method3296(Statics.field314);
                class185 var51 = Statics.field314;
                class185 var52 = Statics.field267;
                Statics.field2829 = var51;
                Statics.field2820 = var52;
                Statics.field2821 = Statics.field2829.method3200(3);
                class198.method2514(Statics.field314, Statics.field267, field405);
                class200.method2038(Statics.field314, Statics.field267);
                class199.method3426(Statics.field314, Statics.field267, field288, Statics.field568);
                class202.method261(Statics.field314, Statics.field239, Statics.field912);
                class185 var53 = Statics.field314;
                class185 var54 = Statics.field267;
                Statics.field2795 = var53;
                Statics.field2793 = var54;
                class195.method3473(Statics.field314);
                class188.method3027(Statics.field314);
                class170.method796(Statics.field315, Statics.field267, Statics.field1791, Statics.field534);
                class187.method2987(Statics.field314);
                class196.method935(Statics.field314);
                class185 var55 = Statics.field314;
                Statics.field2333 = var55;
                class185 var56 = Statics.field314;
                Statics.field2788 = var56;
                Statics.field86 = new class47();
                class197.method783(Statics.field314, Statics.field1791, Statics.field534);
                class194.method1676(Statics.field314, Statics.field1791);
                class42.field835 = class174.field2379;
                class42.field830 = 60;
                field367 = 80;
            } else {
                class42.field835 = class174.field2378 + Statics.field314.method3248() + "%";
                class42.field830 = 60;
            }
        } else if (field367 == 80) {
            int var57 = 0;
            if (Statics.field1589 == null) {
                class185 var58 = Statics.field1791;
                int var59 = var58.method3165("compass");
                int var60 = var58.method3209(var59, "");
                class225 var61 = class226.method3607(var58, var59, var60);
                Statics.field1589 = var61;
            } else {
                var57++;
            }
            if (Statics.field172 == null) {
                class185 var62 = Statics.field1791;
                int var63 = var62.method3165("mapedge");
                int var64 = var62.method3209(var63, "");
                class225 var65 = class226.method3607(var62, var63, var64);
                Statics.field172 = var65;
            } else {
                var57++;
            }
            if (Statics.field733 == null) {
                Statics.field733 = class226.method3029(Statics.field1791, "mapscene", "");
            } else {
                var57++;
            }
            if (Statics.field178 == null) {
                Statics.field178 = class226.method2645(Statics.field1791, "mapfunction", "");
            } else {
                var57++;
            }
            if (Statics.field441 == null) {
                Statics.field441 = class226.method2645(Statics.field1791, "headicons_pk", "");
            } else {
                var57++;
            }
            if (Statics.field2122 == null) {
                Statics.field2122 = class226.method2645(Statics.field1791, "headicons_prayer", "");
            } else {
                var57++;
            }
            if (Statics.field2153 == null) {
                Statics.field2153 = class226.method2645(Statics.field1791, "headicons_hint", "");
            } else {
                var57++;
            }
            if (Statics.field1172 == null) {
                Statics.field1172 = class226.method2645(Statics.field1791, "mapmarker", "");
            } else {
                var57++;
            }
            if (Statics.field116 == null) {
                Statics.field116 = class226.method2645(Statics.field1791, "cross", "");
            } else {
                var57++;
            }
            if (Statics.field1284 == null) {
                Statics.field1284 = class226.method2645(Statics.field1791, "mapdots", "");
            } else {
                var57++;
            }
            if (Statics.field48 == null) {
                Statics.field48 = class226.method3029(Statics.field1791, "scrollbar", "");
            } else {
                var57++;
            }
            if (Statics.field23 == null) {
                Statics.field23 = class226.method3029(Statics.field1791, "mod_icons", "");
            } else {
                var57++;
            }
            if (var57 < 12) {
                class42.field835 = class174.field2380 + var57 * 100 / 12 + "%";
                class42.field830 = 70;
            } else {
                Statics.field3102 = Statics.field23;
                Statics.field172.method4035();
                int var66 = (int) (Math.random() * 21.0D) - 10;
                int var67 = (int) (Math.random() * 21.0D) - 10;
                int var68 = (int) (Math.random() * 21.0D) - 10;
                int var69 = (int) (Math.random() * 41.0D) - 20;
                for (int var70 = 0; var70 < Statics.field178.length; var70++) {
                    Statics.field178[var70].method3997(var66 + var69, var67 + var69, var68 + var69);
                }
                Statics.field733[0].method3954(var66 + var69, var67 + var69, var68 + var69);
                class42.field835 = class174.field2381;
                class42.field830 = 70;
                field367 = 90;
            }
        } else if (field367 == 90) {
            if (Statics.field815.method3154()) {
                class75 var71 = new class75(Statics.field815, Statics.field1791, 20, 0.8D, field405 ? 64 : 128);
                class85.method1632(var71);
                class85.method1623(0.8D);
                class42.field835 = class174.field2383;
                class42.field830 = 90;
                field367 = 110;
            } else {
                class42.field835 = class174.field2382 + Statics.field815.method3248() + "%";
                class42.field830 = 90;
            }
        } else if (field367 == 110) {
            Statics.field1622 = new class21();
            Statics.field580.method1923(Statics.field1622, 10);
            class42.field835 = class174.field2384;
            class42.field830 = 94;
            field367 = 120;
        } else if (field367 == 120) {
            if (Statics.field1546.method3168("huffman", "")) {
                class146 var72 = new class146(Statics.field1546.method3167("huffman", ""));
                Statics.field3121 = var72;
                class42.field835 = class174.field2407;
                class42.field830 = 96;
                field367 = 130;
            } else {
                class42.field835 = class174.field2385 + "%";
                class42.field830 = 96;
            }
        } else if (field367 == 130) {
            if (!Statics.field315.method3154()) {
                class42.field835 = class174.field2452 + Statics.field315.method3248() * 4 / 5 + "%";
                class42.field830 = 100;
            } else if (!Statics.field2005.method3154()) {
                class42.field835 = class174.field2452 + (80 + Statics.field2005.method3248() / 6) + "%";
                class42.field830 = 100;
            } else if (Statics.field534.method3154()) {
                class42.field835 = class174.field2388;
                class42.field830 = 100;
                field367 = 140;
            } else {
                class42.field835 = class174.field2452 + (96 + Statics.field534.method3248() / 20) + "%";
                class42.field830 = 100;
            }
        } else if (field367 == 140) {
            method1883(10);
        }
    }

    @ObfuscatedName("k.q(IZZZI)Lgk;")
    public static class185 method71(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class117 var4 = null;
        if (class105.field1684 != null) {
            var4 = new class117(arg0, class105.field1684, Statics.field1822[arg0], 1000000);
        }
        return new class185(var4, Statics.field853, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("er.c(I)V")
    public static final void method2388() {
        try {
            if (field318 == 0) {
                if (Statics.field47 != null) {
                    Statics.field47.method1996();
                    Statics.field47 = null;
                }
                Statics.field2857 = null;
                field339 = false;
                field319 = 0;
                field318 = 1;
            }
            if (field318 == 1) {
                if (Statics.field2857 == null) {
                    Statics.field2857 = Statics.field580.method1912(Statics.field1718, Statics.field714);
                }
                if (Statics.field2857.field1656 == 2) {
                    throw new IOException();
                }
                if (Statics.field2857.field1656 == 1) {
                    Statics.field47 = new class111((Socket) Statics.field2857.field1660, Statics.field580);
                    Statics.field2857 = null;
                    field318 = 2;
                }
            }
            if (field318 == 2) {
                field328.field2085 = 0;
                field328.method2832(14);
                Statics.field47.method2001(field328.field2083, 0, 1);
                field330.field2085 = 0;
                field318 = 3;
            }
            if (field318 == 3) {
                if (Statics.field31 != null) {
                    Statics.field31.method1091();
                }
                if (Statics.field569 != null) {
                    Statics.field569.method1091();
                }
                int var0 = Statics.field47.method2020();
                if (Statics.field31 != null) {
                    Statics.field31.method1091();
                }
                if (Statics.field569 != null) {
                    Statics.field569.method1091();
                }
                if (var0 != 0) {
                    method3024(var0);
                    return;
                }
                field330.field2085 = 0;
                field318 = 4;
            }
            if (field318 == 4) {
                if (field330.field2085 < 8) {
                    int var1 = Statics.field47.method2018();
                    if (var1 > 8 - field330.field2085) {
                        var1 = 8 - field330.field2085;
                    }
                    if (var1 > 0) {
                        Statics.field47.method2000(field330.field2083, field330.field2085, var1);
                        field330.field2085 += var1;
                    }
                }
                if (field330.field2085 == 8) {
                    field330.field2085 = 0;
                    Statics.field6 = field330.method2769();
                    field318 = 5;
                }
            }
            if (field318 == 5) {
                int[] var2 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field6 >> 32), (int) (Statics.field6 & 0xFFFFFFFFFFFFFFFFL) };
                field328.field2085 = 0;
                field328.method2832(1);
                field328.method2832(class42.field843.method799());
                field328.method2666(var2[0]);
                field328.method2666(var2[1]);
                field328.method2666(var2[2]);
                field328.method2666(var2[3]);
                switch(class42.field843.field1628) {
                    case 0:
                        field328.method2666((Integer) Statics.field1552.field689.get(class208.method164(class42.field834)));
                        field328.field2085 += 4;
                        break;
                    case 1:
                        field328.field2085 += 8;
                        break;
                    case 2:
                    case 3:
                        field328.method2684(Statics.field844);
                        field328.field2085 += 5;
                }
                field328.method2715(class42.field842);
                field328.method2699(class40.field803, class40.field802);
                field389.field2085 = 0;
                if (field436 == 40) {
                    field389.method2832(18);
                } else {
                    field389.method2832(16);
                }
                field389.method2664(0);
                int var3 = field389.field2085;
                field389.method2666(137);
                field389.method2672(field328.field2083, 0, field328.field2085);
                int var4 = field389.field2085;
                field389.method2715(class42.field834);
                field389.method2832((field499 ? 1 : 0) << 1 | (field405 ? 1 : 0));
                field389.method2664(Statics.field22);
                field389.method2664(Statics.field217);
                method756(field389);
                field389.method2715(Statics.field227);
                field389.method2666(Statics.field2645);
                class154 var5 = new class154(Statics.field1525.method4133());
                Statics.field1525.method4139(var5);
                field389.method2672(var5.field2083, 0, var5.field2083.length);
                field389.method2832(Statics.field79);
                field389.method2666(0);
                field389.method2666(Statics.field239.field2724);
                field389.method2666(Statics.field912.field2724);
                field389.method2666(Statics.field314.field2724);
                field389.method2666(Statics.field315.field2724);
                field389.method2666(Statics.field14.field2724);
                field389.method2666(Statics.field589.field2724);
                field389.method2666(Statics.field123.field2724);
                field389.method2666(Statics.field267.field2724);
                field389.method2666(Statics.field1791.field2724);
                field389.method2666(Statics.field815.field2724);
                field389.method2666(Statics.field1546.field2724);
                field389.method2666(Statics.field1790.field2724);
                field389.method2666(Statics.field2005.field2724);
                field389.method2666(Statics.field534.field2724);
                field389.method2666(Statics.field2872.field2724);
                field389.method2666(Statics.field1459.field2724);
                field389.method2697(var2, var4, field389.field2085);
                field389.method2674(field389.field2085 - var3);
                Statics.field47.method2001(field389.field2083, 0, field389.field2085);
                field328.method2932(var2);
                for (int var6 = 0; var6 < 4; var6++) {
                    var2[var6] += 50;
                }
                field330.method2932(var2);
                field318 = 6;
            }
            if (field318 == 6 && Statics.field47.method2018() > 0) {
                int var7 = Statics.field47.method2020();
                if (var7 == 21 && field436 == 20) {
                    field318 = 7;
                } else if (var7 == 2) {
                    field318 = 9;
                } else if (var7 == 15 && field436 == 40) {
                    field331 = -1;
                    field318 = 13;
                } else if (var7 == 23 && field320 < 1) {
                    field320++;
                    field318 = 0;
                } else if (var7 == 29) {
                    field318 = 11;
                } else {
                    method3024(var7);
                    return;
                }
            }
            if (field318 == 7 && Statics.field47.method2018() > 0) {
                field321 = (Statics.field47.method2020() + 3) * 60;
                field318 = 8;
            }
            if (field318 == 8) {
                field319 = 0;
                class42.method1987(class174.field2392, class174.field2393, field321 / 60 + class174.field2495);
                if (--field321 <= 0) {
                    field318 = 0;
                }
            } else {
                if (field318 == 9 && Statics.field47.method2018() >= 13) {
                    boolean var8 = Statics.field47.method2020() == 1;
                    Statics.field47.method2000(field330.field2083, 0, 4);
                    field330.field2085 = 0;
                    boolean var9 = false;
                    if (var8) {
                        int var10 = field330.method2934() << 24;
                        int var11 = var10 | field330.method2934() << 16;
                        int var12 = var11 | field330.method2934() << 8;
                        int var13 = var12 | field330.method2934();
                        int var14 = class208.method164(class42.field834);
                        if (Statics.field1552.field689.size() >= 10 && !Statics.field1552.field689.containsKey(var14)) {
                            Iterator var15 = Statics.field1552.field689.entrySet().iterator();
                            var15.next();
                            var15.remove();
                        }
                        Statics.field1552.field689.put(var14, var13);
                        class31.method1879();
                    }
                    field371 = Statics.field47.method2020();
                    field455 = Statics.field47.method2020() == 1;
                    field407 = Statics.field47.method2020();
                    field407 <<= 0x8;
                    field407 += Statics.field47.method2020();
                    field408 = Statics.field47.method2020();
                    Statics.field47.method2000(field330.field2083, 0, 1);
                    field330.field2085 = 0;
                    field398 = field330.method2934();
                    Statics.field47.method2000(field330.field2083, 0, 2);
                    field330.field2085 = 0;
                    field331 = field330.method2801();
                    try {
                        client var16 = Statics.field280;
                        JSObject.getWindow(var16).call("zap", (Object[]) null);
                    } catch (Throwable var38) {
                    }
                    field318 = 10;
                }
                if (field318 != 10) {
                    if (field318 == 11 && Statics.field47.method2018() >= 2) {
                        field330.field2085 = 0;
                        Statics.field47.method2000(field330.field2083, 0, 2);
                        field330.field2085 = 0;
                        Statics.field1750 = field330.method2801();
                        field318 = 12;
                    }
                    if (field318 == 12 && Statics.field47.method2018() >= Statics.field1750) {
                        field330.field2085 = 0;
                        Statics.field47.method2000(field330.field2083, 0, Statics.field1750);
                        field330.field2085 = 0;
                        String var29 = field330.method2686();
                        String var30 = field330.method2686();
                        String var31 = field330.method2686();
                        class42.method1987(var29, var30, var31);
                        method1883(10);
                    }
                    if (field318 == 13) {
                        if (field331 == -1) {
                            if (Statics.field47.method2018() < 2) {
                                return;
                            }
                            Statics.field47.method2000(field330.field2083, 0, 2);
                            field330.field2085 = 0;
                            field331 = field330.method2801();
                        }
                        if (Statics.field47.method2018() >= field331) {
                            Statics.field47.method2000(field330.field2083, 0, field331);
                            field330.field2085 = 0;
                            int var32 = field331;
                            field328.field2085 = 0;
                            field330.field2085 = 0;
                            field398 = -1;
                            field541 = -1;
                            field289 = -1;
                            field311 = -1;
                            field331 = 0;
                            field386 = 0;
                            field505 = 0;
                            field362 = 0;
                            field433 = -1;
                            field424 = false;
                            field559 = 0;
                            field520 = 0;
                            for (int var33 = 0; var33 < 2048; var33++) {
                                field406[var33] = null;
                            }
                            Statics.field85 = null;
                            for (int var34 = 0; var34 < field323.length; var34++) {
                                class36 var35 = field323[var34];
                                if (var35 != null) {
                                    var35.field603 = -1;
                                    var35.field651 = false;
                                }
                            }
                            class13.method3031();
                            method1883(30);
                            for (int var36 = 0; var36 < 100; var36++) {
                                field491[var36] = true;
                            }
                            field328.method2936(166);
                            field328.method2832(method628());
                            field328.method2664(Statics.field22);
                            field328.method2664(Statics.field217);
                            class46.method208(field330);
                            if (field330.field2085 != var32) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field319++;
                        if (field319 > 2000) {
                            if (field320 < 1) {
                                if (Statics.field714 == Statics.field1407) {
                                    Statics.field714 = Statics.field891;
                                } else {
                                    Statics.field714 = Statics.field1407;
                                }
                                field320++;
                                field318 = 0;
                            } else {
                                method3024(-3);
                            }
                        }
                    }
                } else if (Statics.field47.method2018() >= field331) {
                    field330.field2085 = 0;
                    Statics.field47.method2000(field330.field2083, 0, field331);
                    field294 = -1L;
                    field297 = -1;
                    Statics.field1622.field208 = 0;
                    Statics.field1448 = true;
                    field298 = true;
                    field512 = -1L;
                    class228.field3247 = new class127();
                    field328.field2085 = 0;
                    field330.field2085 = 0;
                    field398 = -1;
                    field541 = -1;
                    field289 = -1;
                    field311 = -1;
                    field386 = 0;
                    field505 = 0;
                    field338 = 0;
                    field301 = 0;
                    field362 = 0;
                    field433 = -1;
                    field424 = false;
                    class116.method1408(0);
                    class48.method1884();
                    field439 = 0;
                    field550 = false;
                    field528 = 0;
                    field350 = (int) (Math.random() * 100.0D) - 50;
                    field450 = (int) (Math.random() * 110.0D) - 55;
                    field354 = (int) (Math.random() * 80.0D) - 40;
                    field357 = (int) (Math.random() * 120.0D) - 60;
                    field343 = (int) (Math.random() * 30.0D) - 20;
                    field558 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field559 = 0;
                    field515 = -1;
                    field520 = 0;
                    field521 = 0;
                    field360 = class41.field809;
                    field417 = class41.field809;
                    field324 = 0;
                    class46.method27();
                    for (int var18 = 0; var18 < 2048; var18++) {
                        field406[var18] = null;
                    }
                    for (int var19 = 0; var19 < 32768; var19++) {
                        field323[var19] = null;
                    }
                    field415 = -1;
                    field463.method2319();
                    field419.method2319();
                    for (int var20 = 0; var20 < 4; var20++) {
                        for (int var21 = 0; var21 < 104; var21++) {
                            for (int var22 = 0; var22 < 104; var22++) {
                                field416[var20][var21][var22] = null;
                            }
                        }
                    }
                    field468 = new class129();
                    field554 = 0;
                    field342 = 0;
                    field467 = 0;
                    for (int var23 = 0; var23 < Statics.field2769; var23++) {
                        class188 var24 = class188.method2024(var23);
                        if (var24 != null) {
                            class166.field2155[var23] = 0;
                            class166.field2156[var23] = 0;
                        }
                    }
                    Statics.field86.method883();
                    field454 = -1;
                    if (field452 != -1) {
                        class170.method1989(field452);
                    }
                    for (class18 var25 = (class18) field447.method2275(); var25 != null; var25 = (class18) field447.method2276()) {
                        method679(var25, true);
                    }
                    field452 = -1;
                    field447 = new class126(8);
                    field547 = null;
                    field362 = 0;
                    field433 = -1;
                    field424 = false;
                    field563.method3035((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var26 = 0; var26 < 8; var26++) {
                        field412[var26] = null;
                        field413[var26] = false;
                    }
                    class13.method3031();
                    field548 = true;
                    for (int var27 = 0; var27 < 100; var27++) {
                        field491[var27] = true;
                    }
                    field328.method2936(166);
                    field328.method2832(method628());
                    field328.method2664(Statics.field22);
                    field328.method2664(Statics.field217);
                    field513 = null;
                    Statics.field12 = 0;
                    Statics.field2950 = null;
                    for (int var28 = 0; var28 < 8; var28++) {
                        field562[var28] = new class5();
                    }
                    Statics.field2003 = null;
                    class46.method208(field330);
                    Statics.field1529 = -1;
                    method805(false);
                    field398 = -1;
                }
            }
        } catch (IOException var39) {
            if (field320 < 1) {
                if (Statics.field714 == Statics.field1407) {
                    Statics.field714 = Statics.field891;
                } else {
                    Statics.field714 = Statics.field1407;
                }
                field320++;
                field318 = 0;
            } else {
                method3024(-2);
            }
        }
    }

    @ObfuscatedName("fj.v(II)V")
    public static void method3024(int arg0) {
        if (arg0 == -3) {
            class42.method1987(class174.field2395, class174.field2396, class174.field2489);
        } else if (arg0 == -2) {
            class42.method1987(class174.field2398, class174.field2399, class174.field2400);
        } else if (arg0 == -1) {
            class42.method1987(class174.field2401, class174.field2622, class174.field2386);
        } else if (arg0 == 3) {
            class42.field836 = 3;
        } else if (arg0 == 4) {
            class42.method1987(class174.field2404, class174.field2405, class174.field2581);
        } else if (arg0 == 5) {
            class42.method1987(class174.field2432, class174.field2408, class174.field2409);
        } else if (arg0 == 6) {
            class42.method1987(class174.field2585, class174.field2411, class174.field2575);
        } else if (arg0 == 7) {
            class42.method1987(class174.field2413, class174.field2414, class174.field2502);
        } else if (arg0 == 8) {
            class42.method1987(class174.field2416, class174.field2394, class174.field2367);
        } else if (arg0 == 9) {
            class42.method1987(class174.field2444, class174.field2420, class174.field2519);
        } else if (arg0 == 10) {
            class42.method1987(class174.field2526, class174.field2423, class174.field2419);
        } else if (arg0 == 11) {
            class42.method1987(class174.field2425, class174.field2426, class174.field2427);
        } else if (arg0 == 12) {
            class42.method1987(class174.field2428, class174.field2429, class174.field2430);
        } else if (arg0 == 13) {
            class42.method1987(class174.field2431, class174.field2536, class174.field2433);
        } else if (arg0 == 14) {
            class42.method1987(class174.field2434, class174.field2422, class174.field2436);
        } else if (arg0 == 16) {
            class42.method1987(class174.field2611, class174.field2438, class174.field2591);
        } else if (arg0 == 17) {
            class42.method1987(class174.field2617, class174.field2441, class174.field2442);
        } else if (arg0 == 18) {
            class42.method1987(class174.field2533, class174.field2415, class174.field2377);
        } else if (arg0 == 19) {
            class42.method1987(class174.field2446, class174.field2447, class174.field2448);
        } else if (arg0 == 20) {
            class42.method1987(class174.field2449, class174.field2464, class174.field2451);
        } else if (arg0 == 22) {
            class42.method1987(class174.field2537, class174.field2455, class174.field2529);
        } else if (arg0 == 23) {
            class42.method1987(class174.field2531, class174.field2456, class174.field2595);
        } else if (arg0 == 24) {
            class42.method1987(class174.field2406, class174.field2633, class174.field2460);
        } else if (arg0 == 25) {
            class42.method1987(class174.field2461, class174.field2462, class174.field2463);
        } else if (arg0 == 26) {
            class42.method1987(class174.field2410, class174.field2458, class174.field2466);
        } else if (arg0 == 27) {
            class42.method1987(class174.field2566, class174.field2468, class174.field2469);
        } else if (arg0 == 31) {
            class42.method1987(class174.field2366, class174.field2477, class174.field2478);
        } else if (arg0 == 32) {
            class42.method1987(class174.field2479, class174.field2534, class174.field2481);
        } else if (arg0 == 37) {
            class42.method1987(class174.field2482, class174.field2472, class174.field2484);
        } else if (arg0 == 38) {
            class42.method1987(class174.field2485, class174.field2486, class174.field2487);
        } else if (arg0 == 55) {
            class42.method1987(class174.field2488, class174.field2571, class174.field2490);
        } else if (arg0 == 56) {
            class42.method1987(class174.field2491, class174.field2435, class174.field2493);
            method1883(11);
            return;
        } else if (arg0 == 57) {
            class42.method1987(class174.field2494, class174.field2630, class174.field2496);
            method1883(11);
            return;
        } else {
            class42.method1987(class174.field2497, class174.field2498, class174.field2499);
        }
        method1883(10);
    }

    @ObfuscatedName("m.e(I)V")
    public static final void method201() {
        if (Statics.field47 != null) {
            Statics.field47.method1996();
            Statics.field47 = null;
        }
        method187();
        Statics.field2856.method1679();
        for (int var0 = 0; var0 < 4; var0++) {
            field346[var0].method2172();
        }
        System.gc();
        class139.method757(2);
        field524 = -1;
        field402 = false;
        class32.method1967();
        method1883(10);
    }

    @ObfuscatedName("o.j(B)V")
    public static final void method187() {
        class201.method1988();
        class192.method770();
        class193.method199();
        class198.method2125();
        class200.field3007.method2257();
        class200.field3010.method2257();
        class199.method177();
        class202.method3252();
        class191.field2810.method2257();
        class191.field2792.method2257();
        class195.field2851.method2257();
        class188.field2770.method2257();
        class197.field2874.method2257();
        class197.field2877.method2257();
        class197.field2879.method2257();
        class194.field2833.method2257();
        class194.field2835.method2257();
        class167.method2386();
        class170.method3714();
        ((class75) Statics.field1416).method1418();
        class49.field935.method2257();
        Statics.field239.method3163();
        Statics.field912.method3163();
        Statics.field315.method3163();
        Statics.field14.method3163();
        Statics.field589.method3163();
        Statics.field123.method3163();
        Statics.field267.method3163();
        Statics.field1791.method3163();
        Statics.field815.method3163();
        Statics.field1546.method3163();
        Statics.field1790.method3163();
        Statics.field2005.method3163();
    }

    @ObfuscatedName("f.d(B)V")
    public static final void method110() {
        if (field338 > 0) {
            method201();
        } else {
            method1883(40);
            Statics.field2057 = Statics.field47;
            Statics.field47 = null;
        }
    }

    @ObfuscatedName("y.g(I)V")
    public static final void method192() {
        if (field505 > 1) {
            field505--;
        }
        if (field338 > 0) {
            field338--;
        }
        if (field339) {
            field339 = false;
            method110();
            return;
        }
        if (!field424) {
            method3364();
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field47 == null) {
                var1 = false;
            } else {
                label2721: {
                    try {
                        int var2 = Statics.field47.method2018();
                        if (var2 == 0) {
                            var1 = false;
                            break label2721;
                        }
                        if (field398 == -1) {
                            Statics.field47.method2000(field330.field2083, 0, 1);
                            field330.field2085 = 0;
                            field398 = field330.method2934();
                            field331 = class213.field3145[field398];
                            var2--;
                        }
                        if (field331 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2721;
                            }
                            Statics.field47.method2000(field330.field2083, 0, 1);
                            field331 = field330.field2083[0] & 0xFF;
                            var2--;
                        }
                        if (field331 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2721;
                            }
                            Statics.field47.method2000(field330.field2083, 0, 2);
                            field330.field2085 = 0;
                            field331 = field330.method2801();
                            var2 -= 2;
                        }
                        if (var2 < field331) {
                            var1 = false;
                            break label2721;
                        }
                        field330.field2085 = 0;
                        Statics.field47.method2000(field330.field2083, 0, field331);
                        field386 = 0;
                        field311 = field289;
                        field289 = field541;
                        field541 = field398;
                        if (field398 == 55) {
                            int var3 = field330.method2813();
                            boolean var4 = field330.method2678() == 1;
                            String var5 = "";
                            boolean var6 = false;
                            if (var4) {
                                var5 = field330.method2686();
                                if (method83(var5)) {
                                    var6 = true;
                                }
                            }
                            String var7 = field330.method2686();
                            if (!var6) {
                                class48.method2520(var3, var5, var7);
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 34) {
                            int var8 = field330.method2837();
                            int var9 = field330.method2723();
                            class18 var10 = (class18) field447.method2280((long) var9);
                            class18 var11 = (class18) field447.method2280((long) var8);
                            if (var11 != null) {
                                method679(var11, var10 == null || var10.field183 != var11.field183);
                            }
                            if (var10 != null) {
                                var10.method2313();
                                field447.method2277(var10, (long) var8);
                            }
                            class170 var12 = class170.method2518(var9);
                            if (var12 != null) {
                                method1874(var12);
                            }
                            class170 var13 = class170.method2518(var8);
                            if (var13 != null) {
                                method1874(var13);
                                method642(Statics.field2195[var13.field2197 >>> 16], var13, true);
                            }
                            if (field452 != -1) {
                                method1859(field452, 1);
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 66) {
                            String var14 = field330.method2686();
                            long var15 = field330.method2769();
                            long var17 = (long) field330.method2801();
                            long var19 = (long) field330.method2682();
                            class178[] var21 = new class178[] { class178.field2659, class178.field2662, class178.field2669, class178.field2658, class178.field2664, class178.field2665 };
                            class178 var22 = (class178) class149.method784(var21, field330.method2678());
                            long var23 = (var17 << 32) + var19;
                            boolean var25 = false;
                            for (int var26 = 0; var26 < 100; var26++) {
                                if (field340[var26] == var23) {
                                    var25 = true;
                                    break;
                                }
                            }
                            if (var22.field2671 && method83(var14)) {
                                var25 = true;
                            }
                            if (!var25 && field337 == 0) {
                                field340[field379] = var23;
                                field379 = (field379 + 1) % 100;
                                String var27 = class210.method3768(class208.method2910(class211.method3227(field330)));
                                if (var22.field2661 == -1) {
                                    class48.method2408(9, var14, var27, class206.method2986(var15));
                                } else {
                                    class48.method2408(9, class38.method615(var22.field2661) + var14, var27, class206.method2986(var15));
                                }
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 152) {
                            int var28 = field330.method2842();
                            class13.method1438(var28);
                            field474[++field475 - 1 & 0x1F] = var28 & 0x7FFF;
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 215) {
                            method805(false);
                            field330.method2934();
                            int var29 = field330.method2801();
                            class46.method2971(field330, var29);
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 91) {
                            int var30 = field330.method2801();
                            int var31 = field330.method2678();
                            int var32 = field330.method2801();
                            if (field526 != 0 && var31 != 0 && field528 < 50) {
                                field553[field528] = var30;
                                field530[field528] = var31;
                                field531[field528] = var32;
                                field352[field528] = null;
                                field532[field528] = 0;
                                field528++;
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 234) {
                            String var36 = field330.method2686();
                            Object[] var37 = new Object[var36.length() + 1];
                            for (int var38 = var36.length() - 1; var38 >= 0; var38--) {
                                if (var36.charAt(var38) == 's') {
                                    var37[var38 + 1] = field330.method2686();
                                } else {
                                    var37[var38 + 1] = Integer.valueOf(field330.method2683());
                                }
                            }
                            var37[0] = Integer.valueOf(field330.method2683());
                            class19 var39 = new class19();
                            var39.field198 = var37;
                            class33.method1885(var39);
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 154) {
                            for (int var40 = 0; var40 < field406.length; var40++) {
                                if (field406[var40] != null) {
                                    field406[var40].field605 = -1;
                                }
                            }
                            for (int var41 = 0; var41 < field323.length; var41++) {
                                if (field323[var41] != null) {
                                    field323[var41].field605 = -1;
                                }
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 219) {
                            method791(true);
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 103) {
                            boolean var42 = field330.method2678() == 1;
                            if (var42) {
                                Statics.field767 = class156.method910() - field330.method2769();
                                Statics.field2003 = new class2(field330, true);
                            } else {
                                Statics.field2003 = null;
                            }
                            field482 = field471;
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 222) {
                            method201();
                            field398 = -1;
                            var1 = false;
                            break label2721;
                        }
                        if (field398 == 228) {
                            int var43 = field330.method2837();
                            int var44 = field330.method2879();
                            class166.field2155[var44] = var43;
                            if (class166.field2156[var44] != var43) {
                                class166.field2156[var44] = var43;
                            }
                            method769(var44);
                            field472[++field570 - 1 & 0x1F] = var44;
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 80) {
                            int var45 = field330.method2837();
                            boolean var46 = field330.method2678() == 1;
                            class170 var47 = class170.method2518(var45);
                            if (var47.field2257 != var46) {
                                var47.field2257 = var46;
                                method1874(var47);
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 153) {
                            int var48 = field330.method2723();
                            int var49 = field330.method2801();
                            int var50 = field330.method2801();
                            int var51 = field330.method2879();
                            class170 var52 = class170.method2518(var48);
                            if (var52.field2248 != var51 || var52.field2249 != var49 || var52.field2239 != var50) {
                                var52.field2248 = var51;
                                var52.field2249 = var49;
                                var52.field2239 = var50;
                                method1874(var52);
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 11) {
                            field301 = field330.method2678();
                            if (field301 == 1) {
                                field302 = field330.method2801();
                            }
                            if (field301 >= 2 && field301 <= 6) {
                                if (field301 == 2) {
                                    field307 = 64;
                                    field308 = 64;
                                }
                                if (field301 == 3) {
                                    field307 = 0;
                                    field308 = 64;
                                }
                                if (field301 == 4) {
                                    field307 = 128;
                                    field308 = 64;
                                }
                                if (field301 == 5) {
                                    field307 = 64;
                                    field308 = 0;
                                }
                                if (field301 == 6) {
                                    field307 = 64;
                                    field308 = 128;
                                }
                                field301 = 2;
                                field537 = field330.method2801();
                                field316 = field330.method2801();
                                field388 = field330.method2678();
                            }
                            if (field301 == 10) {
                                field312 = field330.method2801();
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 24) {
                            String var53 = field330.method2686();
                            int var54 = field330.method2763();
                            class170 var55 = class170.method2518(var54);
                            if (!var53.equals(var55.field2301)) {
                                var55.field2301 = var53;
                                method1874(var55);
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 22) {
                            int var56 = field330.method2683();
                            class18 var57 = (class18) field447.method2280((long) var56);
                            if (var57 != null) {
                                method679(var57, true);
                            }
                            if (field547 != null) {
                                method1874(field547);
                                field547 = null;
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 245) {
                            int var58 = field330.method2723();
                            class170 var59 = class170.method2518(var58);
                            var59.field2240 = 3;
                            var59.field2241 = Statics.field85.field241.method3043();
                            method1874(var59);
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 110) {
                            method188();
                            field451 = field330.method2678();
                            field483 = field471;
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 160) {
                            method188();
                            int var60 = field330.method2678();
                            int var61 = field330.method2723();
                            int var62 = field330.method2678();
                            field422[var62] = var61;
                            field303[var62] = var60;
                            field421[var62] = 1;
                            for (int var63 = 0; var63 < 98; var63++) {
                                if (var61 >= class173.field2353[var63]) {
                                    field421[var62] = var63 + 2;
                                }
                            }
                            field476[++field477 - 1 & 0x1F] = var62;
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 236) {
                            field453 = field330.method2678();
                            field382 = field330.method2678();
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 14) {
                            field520 = field330.method2678();
                            if (field520 == 255) {
                                field520 = 0;
                            }
                            field521 = field330.method2678();
                            if (field521 == 255) {
                                field521 = 0;
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 121) {
                            class46.method27();
                            for (int var64 = 0; var64 < 2048; var64++) {
                                field406[var64] = null;
                            }
                            class46.method208(field330);
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 174) {
                            Statics.field1531 = field330.method2706();
                            Statics.field2846 = field330.method2678();
                            for (int var65 = Statics.field1531; var65 < Statics.field1531 + 8; var65++) {
                                for (int var66 = Statics.field2846; var66 < Statics.field2846 + 8; var66++) {
                                    if (field416[Statics.field2111][var65][var66] != null) {
                                        field416[Statics.field2111][var65][var66] = null;
                                        method934(var65, var66);
                                    }
                                }
                            }
                            for (class26 var67 = (class26) field468.method2324(); var67 != null; var67 = (class26) field468.method2331()) {
                                if (var67.field574 >= Statics.field1531 && var67.field574 < Statics.field1531 + 8 && var67.field584 >= Statics.field2846 && var67.field584 < Statics.field2846 + 8 && Statics.field2111 == var67.field588) {
                                    var67.field582 = 0;
                                }
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 242) {
                            String var68 = field330.method2686();
                            Statics.field227 = var68;
                            try {
                                String var69 = Statics.field280.getParameter(class215.field3169.field3163);
                                String var70 = Statics.field280.getParameter(class215.field3170.field3163);
                                String var71 = var69 + "settings=" + var68 + "; version=1; path=/; domain=" + var70;
                                String var72;
                                if (var68.length() == 0) {
                                    var72 = var71 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                                } else {
                                    var72 = var71 + "; Expires=" + class163.method759(class156.method910() + 94608000000L) + "; Max-Age=" + 94608000L;
                                }
                                client var73 = Statics.field280;
                                String var74 = "document.cookie=\"" + var72 + "\"";
                                JSObject.getWindow(var73).eval(var74);
                            } catch (Throwable var401) {
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 156) {
                            Statics.field142 = class217.method865(field330.method2678());
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 10) {
                            byte var76 = field330.method2663();
                            int var77 = field330.method2716();
                            class166.field2155[var77] = var76;
                            if (class166.field2156[var77] != var76) {
                                class166.field2156[var77] = var76;
                            }
                            method769(var77);
                            field472[++field570 - 1 & 0x1F] = var77;
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 85) {
                            int var78 = field330.method2717();
                            int var79 = field330.method2763();
                            int var80 = field330.method2717();
                            class170 var81 = class170.method2518(var79);
                            if (var81.field2206 != var80 || var81.field2299 != var78 || var81.field2202 != 0 || var81.field2203 != 0) {
                                var81.field2206 = var80;
                                var81.field2299 = var78;
                                var81.field2202 = 0;
                                var81.field2203 = 0;
                                method1874(var81);
                                method798(var81);
                                if (var81.field2245 == 0) {
                                    method642(Statics.field2195[var79 >> 16], var81, false);
                                }
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 235) {
                            field330.field2085 += 28;
                            if (field330.method2848()) {
                                class160 var82 = field330;
                                int var83 = field330.field2085 - 28;
                                byte[] var84 = var82.field2083;
                                if (field322 == null) {
                                    field322 = new byte[24];
                                }
                                class164.method2991(var84, var83, field322, 0, 24);
                                if (class105.field1682 != null) {
                                    try {
                                        class105.field1682.method1359(0L);
                                        class105.field1682.method1384(var82.field2083, var83, 24);
                                    } catch (Exception var400) {
                                    }
                                }
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 12) {
                            int var86 = field330.method2678();
                            int var87 = field330.method2678();
                            int var88 = field330.method2678();
                            int var89 = field330.method2678();
                            field479[var86] = true;
                            field536[var86] = var87;
                            field304[var86] = var88;
                            field538[var86] = var89;
                            field539[var86] = 0;
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 199) {
                            int var90 = field330.method2763();
                            int var91 = field330.method2842();
                            int var92 = var91 >> 10 & 0x1F;
                            int var93 = var91 >> 5 & 0x1F;
                            int var94 = var91 & 0x1F;
                            int var95 = (var94 << 3) + (var92 << 19) + (var93 << 11);
                            class170 var96 = class170.method2518(var90);
                            if (var96.field2199 != var95) {
                                var96.field2199 = var95;
                                method1874(var96);
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 54) {
                            int var97 = field330.method2879();
                            int var98 = field330.method2683();
                            int var99 = field330.method2879();
                            class170 var100 = class170.method2518(var98);
                            var100.field2253 = (var97 << 16) + var99;
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 164) {
                            method791(false);
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 71) {
                            int var101 = field330.method2678();
                            String var102 = field330.method2686();
                            int var103 = field330.method2706();
                            if (var103 >= 1 && var103 <= 8) {
                                if (var102.equalsIgnoreCase("null")) {
                                    var102 = null;
                                }
                                field412[var103 - 1] = var102;
                                field413[var103 - 1] = var101 == 0;
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 60) {
                            Statics.field1531 = field330.method2678();
                            Statics.field2846 = field330.method2706();
                            while (field330.field2085 < field331) {
                                field398 = field330.method2678();
                                method43();
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 68) {
                            int var104 = field330.method2763();
                            int var105 = field330.method2717();
                            class170 var106 = class170.method2518(var104);
                            if (var106.field2244 != var105 || var105 == -1) {
                                var106.field2244 = var105;
                                var106.field2319 = 0;
                                var106.field2304 = 0;
                                method1874(var106);
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 17) {
                            method188();
                            field560 = field330.method2681();
                            field483 = field471;
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 15) {
                            int var107 = field330.method2683();
                            Statics.field2117 = Statics.field580.method1909(var107);
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 171) {
                            for (int var108 = 0; var108 < class166.field2156.length; var108++) {
                                if (class166.field2156[var108] != class166.field2155[var108]) {
                                    class166.field2156[var108] = class166.field2155[var108];
                                    method769(var108);
                                    field472[++field570 - 1 & 0x1F] = var108;
                                }
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 149) {
                            int var109 = field330.method2716();
                            if (var109 == 65535) {
                                var109 = -1;
                            }
                            if (var109 == -1 && !field402) {
                                class139.method677();
                            } else if (var109 != -1 && field524 != var109 && field523 != 0 && !field402) {
                                class139.method614(2, Statics.field123, var109, 0, field523, false);
                            }
                            field524 = var109;
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 47) {
                            int var110 = field330.method2682();
                            int var111 = field330.method2801();
                            if (var111 == 65535) {
                                var111 = -1;
                            }
                            Statics.method702(var111, var110);
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 217) {
                            int var112 = field330.method2842();
                            field452 = var112;
                            method797(false);
                            method643(var112);
                            class33.method1087(field452);
                            for (int var113 = 0; var113 < 100; var113++) {
                                field491[var113] = true;
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 29) {
                            int var114 = field330.method2716();
                            if (var114 == 65535) {
                                var114 = -1;
                            }
                            int var115 = field330.method2879();
                            if (var115 == 65535) {
                                var115 = -1;
                            }
                            int var116 = field330.method2683();
                            int var117 = field330.method2683();
                            for (int var118 = var115; var118 <= var114; var118++) {
                                long var119 = ((long) var117 << 32) + (long) var118;
                                class128 var121 = field310.method2280(var119);
                                if (var121 != null) {
                                    var121.method2313();
                                }
                                field310.method2277(new class134(var116), var119);
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 104) {
                            class228.method181(field330, field331);
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 254) {
                            field554 = 1;
                            field286 = field471;
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 13) {
                            if (field452 != -1) {
                                method1859(field452, 0);
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 101) {
                            int var122 = field330.method2683();
                            int var123 = field330.method2801();
                            if (var122 < -70000) {
                                var123 += 32768;
                            }
                            class170 var124;
                            if (var122 >= 0) {
                                var124 = class170.method2518(var122);
                            } else {
                                var124 = null;
                            }
                            while (field330.field2085 < field331) {
                                int var125 = field330.method2813();
                                int var126 = field330.method2801();
                                int var127 = 0;
                                if (var126 != 0) {
                                    var127 = field330.method2678();
                                    if (var127 == 255) {
                                        var127 = field330.method2683();
                                    }
                                }
                                if (var124 != null && var125 >= 0 && var125 < var124.field2287.length) {
                                    var124.field2287[var125] = var126;
                                    var124.field2316[var125] = var127;
                                }
                                class13.method44(var123, var125, var126 - 1, var127);
                            }
                            if (var124 != null) {
                                method1874(var124);
                            }
                            method188();
                            field474[++field475 - 1 & 0x1F] = var123 & 0x7FFF;
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 99) {
                            field333 = true;
                            Statics.field938 = field330.method2678();
                            Statics.field11 = field330.method2678();
                            Statics.field754 = field330.method2801();
                            Statics.field1641 = field330.method2678();
                            Statics.field105 = field330.method2678();
                            if (Statics.field105 >= 100) {
                                int var128 = Statics.field938 * 128 + 64;
                                int var129 = Statics.field11 * 128 + 64;
                                int var130 = method1180(var128, var129, Statics.field2111) - Statics.field754;
                                int var131 = var128 - Statics.field3093;
                                int var132 = var130 - Statics.field1759;
                                int var133 = var129 - Statics.field233;
                                int var134 = (int) Math.sqrt((double) (var131 * var131 + var133 * var133));
                                Statics.field1553 = (int) (Math.atan2((double) var132, (double) var134) * 325.949D) & 0x7FF;
                                Statics.field149 = (int) (Math.atan2((double) var131, (double) var133) * -325.949D) & 0x7FF;
                                if (Statics.field1553 < 128) {
                                    Statics.field1553 = 128;
                                }
                                if (Statics.field1553 > 383) {
                                    Statics.field1553 = 383;
                                }
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 58) {
                            String var135 = field330.method2686();
                            String var136 = class210.method3768(class208.method2910(class211.method3227(field330)));
                            class48.method2520(6, var135, var136);
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 229) {
                            int var137 = field330.method2723();
                            class170 var138 = class170.method2518(var137);
                            for (int var139 = 0; var139 < var138.field2287.length; var139++) {
                                var138.field2287[var139] = -1;
                                var138.field2287[var139] = 0;
                            }
                            method1874(var138);
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 255) {
                            for (int var140 = 0; var140 < Statics.field2769; var140++) {
                                class188 var141 = class188.method2024(var140);
                                if (var141 != null) {
                                    class166.field2155[var140] = 0;
                                    class166.field2156[var140] = 0;
                                }
                            }
                            method188();
                            field570 += 32;
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 146) {
                            field505 = field330.method2842() * 30;
                            field483 = field471;
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 180) {
                            int var142 = field331 + field330.field2085;
                            int var143 = field330.method2801();
                            int var144 = field330.method2801();
                            if (field452 != var143) {
                                field452 = var143;
                                method797(false);
                                method643(field452);
                                class33.method1087(field452);
                                for (int var145 = 0; var145 < 100; var145++) {
                                    field491[var145] = true;
                                }
                            }
                            while (var144-- > 0) {
                                int var146 = field330.method2683();
                                int var147 = field330.method2801();
                                int var148 = field330.method2678();
                                class18 var149 = (class18) field447.method2280((long) var146);
                                if (var149 != null && var149.field183 != var147) {
                                    method679(var149, true);
                                    var149 = null;
                                }
                                if (var149 == null) {
                                    var149 = Statics.method180(var146, var147, var148);
                                }
                                var149.field179 = true;
                            }
                            for (class18 var150 = (class18) field447.method2275(); var150 != null; var150 = (class18) field447.method2276()) {
                                if (var150.field179) {
                                    var150.field179 = false;
                                } else {
                                    method679(var150, true);
                                }
                            }
                            field310 = new class126(512);
                            while (field330.field2085 < var142) {
                                int var151 = field330.method2683();
                                int var152 = field330.method2801();
                                int var153 = field330.method2801();
                                int var154 = field330.method2683();
                                for (int var155 = var152; var155 <= var153; var155++) {
                                    long var156 = ((long) var151 << 32) + (long) var155;
                                    field310.method2277(new class134(var154), var156);
                                }
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 155) {
                            int var158 = field330.method2683();
                            int var159 = field330.method2801();
                            if (var158 < -70000) {
                                var159 += 32768;
                            }
                            class170 var160;
                            if (var158 >= 0) {
                                var160 = class170.method2518(var158);
                            } else {
                                var160 = null;
                            }
                            if (var160 != null) {
                                for (int var161 = 0; var161 < var160.field2287.length; var161++) {
                                    var160.field2287[var161] = 0;
                                    var160.field2316[var161] = 0;
                                }
                            }
                            class13 var162 = (class13) class13.field127.method2280((long) var159);
                            if (var162 != null) {
                                for (int var163 = 0; var163 < var162.field121.length; var163++) {
                                    var162.field121[var163] = -1;
                                    var162.field122[var163] = 0;
                                }
                            }
                            int var164 = field330.method2801();
                            for (int var165 = 0; var165 < var164; var165++) {
                                int var166 = field330.method2716();
                                int var167 = field330.method2706();
                                if (var167 == 255) {
                                    var167 = field330.method2723();
                                }
                                if (var160 != null && var165 < var160.field2287.length) {
                                    var160.field2287[var165] = var166;
                                    var160.field2316[var165] = var167;
                                }
                                class13.method44(var159, var165, var166 - 1, var167);
                            }
                            if (var160 != null) {
                                method1874(var160);
                            }
                            method188();
                            field474[++field475 - 1 & 0x1F] = var159 & 0x7FFF;
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 188 || field398 == 94 || field398 == 114 || field398 == 251 || field398 == 193 || field398 == 136 || field398 == 206 || field398 == 37 || field398 == 97 || field398 == 21) {
                            method43();
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 9) {
                            int var168 = field330.method2683();
                            int var169 = field330.method2683();
                            if (Statics.field2775 == null || !Statics.field2775.isValid()) {
                                try {
                                    Iterator var170 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                    while (var170.hasNext()) {
                                        GarbageCollectorMXBean var171 = (GarbageCollectorMXBean) var170.next();
                                        if (var171.isValid()) {
                                            Statics.field2775 = var171;
                                            field504 = -1L;
                                            field332 = -1L;
                                        }
                                    }
                                } catch (Throwable var403) {
                                }
                            }
                            long var173 = class156.method910();
                            int var175 = -1;
                            if (Statics.field2775 != null) {
                                long var176 = Statics.field2775.getCollectionTime();
                                if (field332 != -1L) {
                                    long var178 = var176 - field332;
                                    long var180 = var173 - field504;
                                    if (var180 != 0L) {
                                        var175 = (int) (var178 * 100L / var180);
                                    }
                                }
                                field332 = var176;
                                field504 = var173;
                            }
                            field328.method2936(37);
                            field328.method2782(field1769);
                            field328.method2721(var168);
                            field328.method2666(var169);
                            field328.method2702(var175);
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 212) {
                            method805(true);
                            field330.method2934();
                            int var182 = field330.method2801();
                            class46.method2971(field330, var182);
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 83) {
                            field333 = false;
                            for (int var183 = 0; var183 < 5; var183++) {
                                field479[var183] = false;
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 26) {
                            int var184 = field330.method2837();
                            int var185 = field330.method2879();
                            class170 var186 = class170.method2518(var184);
                            if (var186 != null && var186.field2245 == 0) {
                                if (var185 > var186.field2221 - var186.field2312) {
                                    var185 = var186.field2221 - var186.field2312;
                                }
                                if (var185 < 0) {
                                    var185 = 0;
                                }
                                if (var186.field2219 != var185) {
                                    var186.field2219 = var185;
                                    method1874(var186);
                                }
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 35) {
                            class46.method2971(field330, field331);
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 143) {
                            int var187 = field330.method2716();
                            int var188 = field330.method2723();
                            class170 var189 = class170.method2518(var188);
                            if (var189.field2240 != 2 || var189.field2241 != var187) {
                                var189.field2240 = 2;
                                var189.field2241 = var187;
                                method1874(var189);
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 112) {
                            int var190 = field330.method2801();
                            int var191 = field330.method2723();
                            class170 var192 = class170.method2518(var191);
                            if (var192.field2240 != 1 || var192.field2241 != var190) {
                                var192.field2240 = 1;
                                var192.field2241 = var190;
                                method1874(var192);
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 108) {
                            String var193 = field330.method2686();
                            long var194 = (long) field330.method2801();
                            long var196 = (long) field330.method2682();
                            class178[] var198 = new class178[] { class178.field2659, class178.field2662, class178.field2669, class178.field2658, class178.field2664, class178.field2665 };
                            class178 var199 = (class178) class149.method784(var198, field330.method2678());
                            long var200 = (var194 << 32) + var196;
                            boolean var202 = false;
                            for (int var203 = 0; var203 < 100; var203++) {
                                if (field340[var203] == var200) {
                                    var202 = true;
                                    break;
                                }
                            }
                            if (method83(var193)) {
                                var202 = true;
                            }
                            if (!var202 && field337 == 0) {
                                field340[field379] = var200;
                                field379 = (field379 + 1) % 100;
                                String var204 = class210.method3768(class208.method2910(class211.method3227(field330)));
                                byte var205;
                                if (var199.field2660) {
                                    var205 = 7;
                                } else {
                                    var205 = 3;
                                }
                                if (var199.field2661 == -1) {
                                    class48.method2520(var205, var193, var204);
                                } else {
                                    class48.method2520(var205, class38.method615(var199.field2661) + var193, var204);
                                }
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 134) {
                            int var206 = field330.method2678();
                            if (field330.method2678() == 0) {
                                field562[var206] = new class5();
                                field330.field2085 += 18;
                            } else {
                                field330.field2085--;
                                field562[var206] = new class5(field330, false);
                            }
                            field481 = field471;
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 124) {
                            class30 var207 = new class30();
                            var207.field684 = field330.method2686();
                            var207.field681 = field330.method2801();
                            int var208 = field330.method2683();
                            var207.field676 = var208;
                            method1883(45);
                            Statics.field47.method1996();
                            Statics.field47 = null;
                            class42.method186(var207);
                            field398 = -1;
                            var1 = false;
                            break label2721;
                        }
                        if (field398 == 200) {
                            Statics.field1531 = field330.method2729();
                            Statics.field2846 = field330.method2729();
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 4) {
                            int var209 = field330.method2842();
                            int var210 = field330.method2723();
                            int var211 = field330.method2707();
                            class18 var212 = (class18) field447.method2280((long) var210);
                            if (var212 != null) {
                                method679(var212, var212.field183 != var209);
                            }
                            Statics.method180(var210, var209, var211);
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 33) {
                            while (field330.field2085 < field331) {
                                int var213 = field330.method2678();
                                boolean var214 = (var213 & 0x1) == 1;
                                String var215 = field330.method2686();
                                String var216 = field330.method2686();
                                field330.method2686();
                                for (int var217 = 0; var217 < field467; var217++) {
                                    class20 var218 = field291[var217];
                                    if (var214) {
                                        if (var216.equals(var218.field201)) {
                                            var218.field201 = var215;
                                            var218.field203 = var216;
                                            var215 = null;
                                            break;
                                        }
                                    } else if (var215.equals(var218.field201)) {
                                        var218.field201 = var215;
                                        var218.field203 = var216;
                                        var215 = null;
                                        break;
                                    }
                                }
                                if (var215 != null && field467 < 400) {
                                    class20 var219 = new class20();
                                    field291[field467] = var219;
                                    var219.field201 = var215;
                                    var219.field203 = var216;
                                    field467++;
                                }
                            }
                            field286 = field471;
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 106) {
                            field559 = field330.method2678();
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 151) {
                            String var220 = field330.method2686();
                            int var221 = field330.method2801();
                            byte var222 = field330.method2679();
                            boolean var223 = false;
                            if (var222 == -128) {
                                var223 = true;
                            }
                            if (var223) {
                                if (Statics.field12 == 0) {
                                    field398 = -1;
                                    var1 = true;
                                    break label2721;
                                }
                                boolean var224 = false;
                                int var225;
                                for (var225 = 0; var225 < Statics.field12 && (!Statics.field2950[var225].field276.equals(var220) || Statics.field2950[var225].field269 != var221); var225++) {
                                }
                                if (var225 < Statics.field12) {
                                    while (var225 < Statics.field12 - 1) {
                                        Statics.field2950[var225] = Statics.field2950[var225 + 1];
                                        var225++;
                                    }
                                    Statics.field12--;
                                    Statics.field2950[Statics.field12] = null;
                                }
                            } else {
                                field330.method2686();
                                class25 var226 = new class25();
                                var226.field276 = var220;
                                var226.field278 = class205.method123(var226.field276, Statics.field287);
                                var226.field269 = var221;
                                var226.field275 = var222;
                                int var227;
                                for (var227 = Statics.field12 - 1; var227 >= 0; var227--) {
                                    int var228 = Statics.field2950[var227].field278.compareTo(var226.field278);
                                    if (var228 == 0) {
                                        Statics.field2950[var227].field269 = var221;
                                        Statics.field2950[var227].field275 = var222;
                                        if (var220.equals(Statics.field85.field264)) {
                                            Statics.field2701 = var222;
                                        }
                                        field514 = field471;
                                        field398 = -1;
                                        var1 = true;
                                        break label2721;
                                    }
                                    if (var228 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field12 >= Statics.field2950.length) {
                                    field398 = -1;
                                    var1 = true;
                                    break label2721;
                                }
                                for (int var229 = Statics.field12 - 1; var229 > var227; var229--) {
                                    Statics.field2950[var229 + 1] = Statics.field2950[var229];
                                }
                                if (Statics.field12 == 0) {
                                    Statics.field2950 = new class25[100];
                                }
                                Statics.field2950[var227 + 1] = var226;
                                Statics.field12++;
                                if (var220.equals(Statics.field85.field264)) {
                                    Statics.field2701 = var222;
                                }
                            }
                            field514 = field471;
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 126) {
                            field514 = field471;
                            if (field331 == 0) {
                                field513 = null;
                                field500 = null;
                                Statics.field12 = 0;
                                Statics.field2950 = null;
                                field398 = -1;
                                var1 = true;
                            } else {
                                field500 = field330.method2686();
                                long var230 = field330.method2769();
                                long var232 = var230;
                                String var234;
                                if (var230 <= 0L || var230 >= 6582952005840035281L) {
                                    var234 = null;
                                } else if (var230 % 37L == 0L) {
                                    var234 = null;
                                } else {
                                    int var235 = 0;
                                    for (long var236 = var230; var236 != 0L; var236 /= 37L) {
                                        var235++;
                                    }
                                    StringBuilder var238 = new StringBuilder(var235);
                                    while (var232 != 0L) {
                                        long var239 = var232;
                                        var232 /= 37L;
                                        var238.append(class206.field3087[(int) (var239 - var232 * 37L)]);
                                    }
                                    var234 = var238.reverse().toString();
                                }
                                field513 = var234;
                                Statics.field1027 = field330.method2679();
                                int var241 = field330.method2678();
                                if (var241 == 255) {
                                    field398 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field12 = var241;
                                    class25[] var242 = new class25[100];
                                    for (int var243 = 0; var243 < Statics.field12; var243++) {
                                        var242[var243] = new class25();
                                        var242[var243].field276 = field330.method2686();
                                        var242[var243].field278 = class205.method123(var242[var243].field276, Statics.field287);
                                        var242[var243].field269 = field330.method2801();
                                        var242[var243].field275 = field330.method2679();
                                        field330.method2686();
                                        if (var242[var243].field276.equals(Statics.field85.field264)) {
                                            Statics.field2701 = var242[var243].field275;
                                        }
                                    }
                                    boolean var244 = false;
                                    int var245 = Statics.field12;
                                    while (var245 > 0) {
                                        boolean var246 = true;
                                        var245--;
                                        for (int var247 = 0; var247 < var245; var247++) {
                                            if (var242[var247].field278.compareTo(var242[var247 + 1].field278) > 0) {
                                                class25 var248 = var242[var247];
                                                var242[var247] = var242[var247 + 1];
                                                var242[var247 + 1] = var248;
                                                var246 = false;
                                            }
                                        }
                                        if (var246) {
                                            break;
                                        }
                                    }
                                    Statics.field2950 = var242;
                                    field398 = -1;
                                    var1 = true;
                                }
                            }
                            break label2721;
                        }
                        if (field398 == 252) {
                            field333 = true;
                            Statics.field2011 = field330.method2678();
                            Statics.field1175 = field330.method2678();
                            Statics.field1789 = field330.method2801();
                            Statics.field1532 = field330.method2678();
                            Statics.field2027 = field330.method2678();
                            if (Statics.field2027 >= 100) {
                                Statics.field3093 = Statics.field2011 * 128 + 64;
                                Statics.field233 = Statics.field1175 * 128 + 64;
                                Statics.field1759 = method1180(Statics.field3093, Statics.field233, Statics.field2111) - Statics.field1789;
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 3) {
                            int var249 = field330.method2837();
                            int var250 = field330.method2801();
                            if (var250 == 65535) {
                                var250 = -1;
                            }
                            int var251 = field330.method2723();
                            class170 var252 = class170.method2518(var251);
                            if (var252.field2227) {
                                var252.field2317 = var250;
                                var252.field2323 = var249;
                                class199 var254 = class199.method3070(var250);
                                var252.field2248 = var254.field2968;
                                var252.field2249 = var254.field2969;
                                var252.field2250 = var254.field2970;
                                var252.field2246 = var254.field2971;
                                var252.field2247 = var254.field2981;
                                var252.field2239 = var254.field2967;
                                if (var254.field2954 == 1) {
                                    var252.field2255 = 1;
                                } else {
                                    var252.field2255 = 2;
                                }
                                if (var252.field2252 > 0) {
                                    var252.field2239 = var252.field2239 * 32 / var252.field2252;
                                } else if (var252.field2208 > 0) {
                                    var252.field2239 = var252.field2239 * 32 / var252.field2208;
                                }
                                method1874(var252);
                            } else {
                                if (var250 == -1) {
                                    var252.field2240 = 0;
                                    field398 = -1;
                                    var1 = true;
                                    break label2721;
                                }
                                class199 var253 = class199.method3070(var250);
                                var252.field2240 = 4;
                                var252.field2241 = var250;
                                var252.field2248 = var253.field2968;
                                var252.field2249 = var253.field2969;
                                var252.field2239 = var253.field2967 * 100 / var249;
                                method1874(var252);
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        if (field398 == 117) {
                            while (field330.field2085 < field331) {
                                boolean var255 = field330.method2678() == 1;
                                String var256 = field330.method2686();
                                String var257 = field330.method2686();
                                int var258 = field330.method2801();
                                int var259 = field330.method2678();
                                int var260 = field330.method2678();
                                boolean var261 = (var260 & 0x2) != 0;
                                boolean var262 = (var260 & 0x1) != 0;
                                if (var258 > 0) {
                                    field330.method2686();
                                    field330.method2678();
                                    field330.method2683();
                                }
                                field330.method2686();
                                for (int var263 = 0; var263 < field342; var263++) {
                                    class15 var264 = field555[var263];
                                    if (var255) {
                                        if (var257.equals(var264.field144)) {
                                            var264.field144 = var256;
                                            var264.field147 = var257;
                                            var256 = null;
                                            break;
                                        }
                                    } else if (var256.equals(var264.field144)) {
                                        if (var264.field150 != var258) {
                                            boolean var265 = true;
                                            for (class17 var266 = (class17) field313.method2352(); var266 != null; var266 = (class17) field313.method2357()) {
                                                if (var266.field168.equals(var256)) {
                                                    if (var258 != 0 && var266.field167 == 0) {
                                                        var266.method2362();
                                                        var265 = false;
                                                    } else if (var258 == 0 && var266.field167 != 0) {
                                                        var266.method2362();
                                                        var265 = false;
                                                    }
                                                }
                                            }
                                            if (var265) {
                                                field313.method2351(new class17(var256, var258));
                                            }
                                            var264.field150 = var258;
                                        }
                                        var264.field147 = var257;
                                        var264.field143 = var259;
                                        var264.field145 = var261;
                                        var264.field148 = var262;
                                        var256 = null;
                                        break;
                                    }
                                }
                                if (var256 != null && field342 < 400) {
                                    class15 var267 = new class15();
                                    field555[field342] = var267;
                                    var267.field144 = var256;
                                    var267.field147 = var257;
                                    var267.field150 = var258;
                                    var267.field143 = var259;
                                    var267.field145 = var261;
                                    var267.field148 = var262;
                                    field342++;
                                }
                            }
                            field554 = 2;
                            field286 = field471;
                            boolean var268 = false;
                            int var269 = field342;
                            while (var269 > 0) {
                                boolean var270 = true;
                                var269--;
                                for (int var271 = 0; var271 < var269; var271++) {
                                    boolean var272 = false;
                                    class15 var273 = field555[var271];
                                    class15 var274 = field555[var271 + 1];
                                    if (field282 != var273.field150 && field282 == var274.field150) {
                                        var272 = true;
                                    }
                                    if (!var272 && var273.field150 == 0 && var274.field150 != 0) {
                                        var272 = true;
                                    }
                                    if (!var272 && !var273.field145 && var274.field145) {
                                        var272 = true;
                                    }
                                    if (!var272 && !var273.field148 && var274.field148) {
                                        var272 = true;
                                    }
                                    if (var272) {
                                        class15 var275 = field555[var271];
                                        field555[var271] = field555[var271 + 1];
                                        field555[var271 + 1] = var275;
                                        var270 = false;
                                    }
                                }
                                if (var270) {
                                    break;
                                }
                            }
                            field398 = -1;
                            var1 = true;
                            break label2721;
                        }
                        class102.method1864("" + field398 + class38.field777 + field289 + class38.field777 + field311 + class38.field777 + field331, (Throwable) null);
                        method201();
                    } catch (IOException var404) {
                        method110();
                    } catch (Exception var405) {
                        String var278 = "" + field398 + class38.field777 + field289 + class38.field777 + field311 + class38.field777 + field331 + class38.field777 + (Statics.field221 + Statics.field85.field657[0]) + class38.field777 + (Statics.field21 + Statics.field85.field641[0]) + class38.field777;
                        for (int var279 = 0; var279 < field331 && var279 < 50; var279++) {
                            var278 = var278 + field330.field2083[var279] + class38.field777;
                        }
                        class102.method1864(var278, var405);
                        method201();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field436 != 30) {
            return;
        }
        while (class228.method785()) {
            field328.method2936(227);
            field328.method2832(0);
            int var280 = field328.field2085;
            class228.method3749(field328);
            field328.method2675(field328.field2085 - var280);
        }
        Object var281 = Statics.field1622.field207;
        synchronized (Statics.field1622.field207) {
            if (!field281) {
                Statics.field1622.field208 = 0;
            } else if (class116.field1797 != 0 || Statics.field1622.field208 >= 40) {
                field328.method2936(127);
                field328.method2832(0);
                int var282 = field328.field2085;
                int var283 = 0;
                for (int var284 = 0; var284 < Statics.field1622.field208 && field328.field2085 - var282 < 240; var284++) {
                    var283++;
                    int var285 = Statics.field1622.field210[var284];
                    if (var285 < 0) {
                        var285 = 0;
                    } else if (var285 > 502) {
                        var285 = 502;
                    }
                    int var286 = Statics.field1622.field213[var284];
                    if (var286 < 0) {
                        var286 = 0;
                    } else if (var286 > 764) {
                        var286 = 764;
                    }
                    int var287 = var285 * 765 + var286;
                    if (Statics.field1622.field210[var284] == -1 && Statics.field1622.field213[var284] == -1) {
                        var286 = -1;
                        var285 = -1;
                        var287 = 524287;
                    }
                    if (field295 != var286 || field347 != var285) {
                        int var288 = var286 - field295;
                        field295 = var286;
                        int var289 = var285 - field347;
                        field347 = var285;
                        if (field297 < 8 && var288 >= -32 && var288 <= 31 && var289 >= -32 && var289 <= 31) {
                            var288 += 32;
                            var289 += 32;
                            field328.method2664((field297 << 12) + (var288 << 6) + var289);
                            field297 = 0;
                        } else if (field297 < 8) {
                            field328.method2684((field297 << 19) + 8388608 + var287);
                            field297 = 0;
                        } else {
                            field328.method2666((field297 << 19) + -1073741824 + var287);
                            field297 = 0;
                        }
                    } else if (field297 < 2047) {
                        field297++;
                    }
                }
                field328.method2675(field328.field2085 - var282);
                if (var283 >= Statics.field1622.field208) {
                    Statics.field1622.field208 = 0;
                } else {
                    Statics.field1622.field208 -= var283;
                    for (int var290 = 0; var290 < Statics.field1622.field208; var290++) {
                        Statics.field1622.field213[var290] = Statics.field1622.field213[var283 + var290];
                        Statics.field1622.field210[var290] = Statics.field1622.field210[var283 + var290];
                    }
                }
            }
        }
        if (class116.field1797 == 1 || !Statics.field770 && class116.field1797 == 4 || class116.field1797 == 2) {
            long var292 = (class116.field1811 - field294) / 50L;
            if (var292 > 4095L) {
                var292 = 4095L;
            }
            field294 = class116.field1811;
            int var294 = class116.field1799;
            if (var294 < 0) {
                var294 = 0;
            } else if (var294 > Statics.field217) {
                var294 = Statics.field217;
            }
            int var295 = class116.field1809;
            if (var295 < 0) {
                var295 = 0;
            } else if (var295 > Statics.field22) {
                var295 = Statics.field22;
            }
            int var296 = (int) var292;
            field328.method2936(117);
            field328.method2664((class116.field1797 == 2 ? 1 : 0) + (var296 << 1));
            field328.method2664(var295);
            field328.method2664(var294);
        }
        if (class106.field1708 > 0) {
            field328.method2936(107);
            field328.method2664(0);
            int var297 = field328.field2085;
            long var298 = class156.method910();
            for (int var300 = 0; var300 < class106.field1708; var300++) {
                long var301 = var298 - field512;
                if (var301 > 16777215L) {
                    var301 = 16777215L;
                }
                field512 = var298;
                field328.method2718((int) var301);
                field328.method2870(class106.field1710[var300]);
            }
            field328.method2674(field328.field2085 - var297);
        }
        if (field376 > 0) {
            field376--;
        }
        if (class106.field1701[96] || class106.field1701[97] || class106.field1701[98] || class106.field1701[99]) {
            field427 = true;
        }
        if (field427 && field376 <= 0) {
            field376 = 20;
            field427 = false;
            field328.method2936(2);
            field328.method2709(field558);
            field328.method2664(field369);
        }
        if (Statics.field1448 && !field298) {
            field298 = true;
            field328.method2936(173);
            field328.method2832(1);
        }
        if (!Statics.field1448 && field298) {
            field298 = false;
            field328.method2936(173);
            field328.method2832(0);
        }
        if (Statics.field2111 != field515) {
            field515 = Statics.field2111;
            method29(Statics.field2111);
        }
        if (field436 != 30) {
            return;
        }
        method1991();
        int var10002;
        for (int var303 = 0; var303 < field528; var303++) {
            var10002 = field531[var303]--;
            if (field531[var303] >= -10) {
                class54 var305 = field352[var303];
                if (var305 == null) {
                    class54 var406 = (class54) null;
                    var305 = class54.method1017(Statics.field14, field553[var303], 0);
                    if (var305 == null) {
                        continue;
                    }
                    field531[var303] += var305.method1020();
                    field352[var303] = var305;
                }
                if (field531[var303] < 0) {
                    int var312;
                    if (field532[var303] == 0) {
                        var312 = field526;
                    } else {
                        int var306 = (field532[var303] & 0xFF) * 128;
                        int var307 = field532[var303] >> 16 & 0xFF;
                        int var308 = var307 * 128 + 64 - Statics.field85.field658;
                        if (var308 < 0) {
                            var308 = -var308;
                        }
                        int var309 = field532[var303] >> 8 & 0xFF;
                        int var310 = var309 * 128 + 64 - Statics.field85.field632;
                        if (var310 < 0) {
                            var310 = -var310;
                        }
                        int var311 = var308 + var310 - 128;
                        if (var311 > var306) {
                            field531[var303] = -100;
                            continue;
                        }
                        if (var311 < 0) {
                            var311 = 0;
                        }
                        var312 = field527 * (var306 - var311) / var306;
                    }
                    if (var312 > 0) {
                        class56 var313 = var305.method1023().method1058(Statics.field1854);
                        class67 var314 = class67.method1192(var313, 100, var312);
                        var314.method1195(field530[var303] - 1);
                        Statics.field169.method964(var314);
                    }
                    field531[var303] = -100;
                }
            } else {
                field528--;
                for (int var304 = var303; var304 < field528; var304++) {
                    field553[var304] = field553[var304 + 1];
                    field352[var304] = field352[var304 + 1];
                    field530[var304] = field530[var304 + 1];
                    field531[var304] = field531[var304 + 1];
                    field532[var304] = field532[var304 + 1];
                }
                var303--;
            }
        }
        if (field402) {
            boolean var315;
            if (class139.field1916 == 0) {
                var315 = Statics.field801.method2417();
            } else {
                var315 = true;
            }
            if (!var315) {
                if (field523 != 0 && field524 != -1) {
                    class139.method2044(Statics.field123, field524, 0, field523, false);
                }
                field402 = false;
            }
        }
        field386++;
        if (field386 > 750) {
            method110();
            return;
        }
        int var316 = class46.field908;
        int[] var317 = class46.field901;
        for (int var318 = 0; var318 < var316; var318++) {
            class24 var319 = field406[var317[var318]];
            if (var319 != null) {
                method84(var319, 1);
            }
        }
        method778();
        int[] var320 = class46.field901;
        for (int var321 = 0; var321 < class46.field908; var321++) {
            class24 var322 = field406[var320[var321]];
            if (var322 != null && var322.field607 > 0) {
                var322.field607--;
                if (var322.field607 == 0) {
                    var322.field615 = null;
                }
            }
        }
        for (int var323 = 0; var323 < field324; var323++) {
            int var324 = field325[var323];
            class36 var325 = field323[var324];
            if (var325 != null && var325.field607 > 0) {
                var325.field607--;
                if (var325.field607 == 0) {
                    var325.field615 = null;
                }
            }
        }
        field478++;
        if (field327 != 0) {
            field395 += 20;
            if (field395 >= 400) {
                field327 = 0;
            }
        }
        if (Statics.field1645 != null) {
            field397++;
            if (field397 >= 15) {
                method1874(Statics.field1645);
                Statics.field1645 = null;
            }
        }
        class170 var326 = Statics.field897;
        class170 var327 = Statics.field202;
        Statics.field897 = null;
        Statics.field202 = null;
        field564 = null;
        field420 = false;
        field464 = false;
        field509 = 0;
        while (Statics.method792() && field509 < 128) {
            if (field371 >= 2 && class106.field1701[82] && Statics.field212 == 66) {
                String var328 = "";
                Iterator var329 = class48.field925.iterator();
                while (var329.hasNext()) {
                    class22 var330 = (class22) var329.next();
                    var328 = var328 + var330.field224 + ':' + var330.field218 + '\n';
                }
                Statics.field2015.setContents(new StringSelection(var328), (ClipboardOwner) null);
            } else {
                field511[field509] = Statics.field212;
                field510[field509] = Statics.field33;
                field509++;
            }
        }
        if (field452 != -1) {
            method1990(field452, 0, 0, Statics.field22, Statics.field217, 0, 0);
        }
        field471++;
        while (true) {
            class19 var333;
            class170 var334;
            class170 var335;
            do {
                var333 = (class19) field486.method2333();
                if (var333 == null) {
                    while (true) {
                        class19 var336;
                        class170 var337;
                        class170 var338;
                        do {
                            var336 = (class19) field487.method2333();
                            if (var336 == null) {
                                while (true) {
                                    class19 var339;
                                    class170 var340;
                                    class170 var341;
                                    do {
                                        var339 = (class19) field485.method2333();
                                        if (var339 == null) {
                                            method15();
                                            if (field459 != null) {
                                                method1874(field459);
                                                Statics.field1920++;
                                                if (field420 && field464) {
                                                    int var342 = class116.field1803;
                                                    int var343 = class116.field1802 * 603852017;
                                                    int var344 = var342 - field461;
                                                    int var345 = var343 - field462;
                                                    if (var344 < field507) {
                                                        var344 = field507;
                                                    }
                                                    if (field459.field2212 + var344 > field507 + field460.field2212) {
                                                        var344 = field507 + field460.field2212 - field459.field2212;
                                                    }
                                                    if (var345 < field466) {
                                                        var345 = field466;
                                                    }
                                                    if (field459.field2312 + var345 > field466 + field460.field2312) {
                                                        var345 = field466 + field460.field2312 - field459.field2312;
                                                    }
                                                    int var346 = var344 - field425;
                                                    int var347 = var345 - field469;
                                                    int var348 = field459.field2273;
                                                    if (Statics.field1920 > field459.field2213 && (var346 > var348 || var346 < -var348 || var347 > var348 || var347 < -var348)) {
                                                        field470 = true;
                                                    }
                                                    int var349 = field460.field2218 + (var344 - field507);
                                                    int var350 = field460.field2219 + (var345 - field466);
                                                    if (field459.field2286 != null && field470) {
                                                        class19 var351 = new class19();
                                                        var351.field186 = field459;
                                                        var351.field197 = var349;
                                                        var351.field190 = var350;
                                                        var351.field198 = field459.field2286;
                                                        class33.method1885(var351);
                                                    }
                                                    if (class116.field1810 == 0) {
                                                        if (field470) {
                                                            if (field459.field2315 != null) {
                                                                class19 var352 = new class19();
                                                                var352.field186 = field459;
                                                                var352.field197 = var349;
                                                                var352.field190 = var350;
                                                                var352.field189 = field564;
                                                                var352.field198 = field459.field2315;
                                                                class33.method1885(var352);
                                                            }
                                                            if (field564 != null && method1388(field459) != null) {
                                                                field328.method2936(91);
                                                                field328.method2711(field459.field2317);
                                                                field328.method2830(field459.field2197);
                                                                field328.method2666(field564.field2197);
                                                                field328.method2664(field564.field2317);
                                                                field328.method2712(field564.field2321);
                                                                field328.method2711(field459.field2321);
                                                            }
                                                        } else {
                                                            int var353 = method111();
                                                            if (field362 > 2 && (field423 == 1 && !method816() || method1387(var353))) {
                                                                method3072(field461 + field425, field469 + field462);
                                                            } else if (field362 > 0) {
                                                                method1161(field461 + field425, field469 + field462);
                                                            }
                                                        }
                                                        field459 = null;
                                                    }
                                                } else if (Statics.field1920 > 1) {
                                                    field459 = null;
                                                }
                                            }
                                            if (Statics.field51 != null) {
                                                method1874(Statics.field51);
                                                field404++;
                                                if (class116.field1810 == 0) {
                                                    if (!field403) {
                                                        int var362 = method111();
                                                        if (field362 > 2 && (field423 == 1 && !method816() || method1387(var362))) {
                                                            method3072(field400, field492);
                                                        } else if (field362 > 0) {
                                                            method1161(field400, field492);
                                                        }
                                                    } else if (Statics.field51 == Statics.field1535 && field399 != field285) {
                                                        class170 var354 = Statics.field51;
                                                        byte var355 = 0;
                                                        if (field449 == 1 && var354.field2201 == 206) {
                                                            var355 = 1;
                                                        }
                                                        if (var354.field2287[field285] <= 0) {
                                                            var355 = 0;
                                                        }
                                                        int var356 = method113(var354);
                                                        boolean var357 = (var356 >> 29 & 0x1) != 0;
                                                        if (var357) {
                                                            int var358 = field399;
                                                            int var359 = field285;
                                                            var354.field2287[var359] = var354.field2287[var358];
                                                            var354.field2316[var359] = var354.field2316[var358];
                                                            var354.field2287[var358] = -1;
                                                            var354.field2316[var358] = 0;
                                                        } else if (var355 == 1) {
                                                            int var360 = field399;
                                                            int var361 = field285;
                                                            while (var360 != var361) {
                                                                if (var360 > var361) {
                                                                    var354.method3095(var360 - 1, var360);
                                                                    var360--;
                                                                } else if (var360 < var361) {
                                                                    var354.method3095(var360 + 1, var360);
                                                                    var360++;
                                                                }
                                                            }
                                                        } else {
                                                            var354.method3095(field285, field399);
                                                        }
                                                        field328.method2936(132);
                                                        field328.method2712(field285);
                                                        field328.method2712(field399);
                                                        field328.method2666(Statics.field51.field2197);
                                                        field328.method2832(var355);
                                                    }
                                                    field397 = 10;
                                                    class116.field1797 = 0;
                                                    Statics.field51 = null;
                                                } else if (field404 >= 5 && (class116.field1803 > field400 + 5 || class116.field1803 < field400 - 5 || class116.field1802 * 603852017 > field492 + 5 || class116.field1802 * 603852017 < field492 - 5)) {
                                                    field403 = true;
                                                }
                                            }
                                            if (class88.method1816()) {
                                                int var363 = class88.field1463;
                                                int var364 = class88.field1518;
                                                field328.method2936(129);
                                                field328.method2832(5);
                                                field328.method2709(Statics.field21 + var364);
                                                field328.method2870(class106.field1701[82] ? (class106.field1701[81] ? 2 : 1) : 0);
                                                field328.method2711(Statics.field221 + var363);
                                                class88.method1718();
                                                field393 = class116.field1809;
                                                field525 = class116.field1799;
                                                field327 = 1;
                                                field395 = 0;
                                                field520 = var363;
                                                field521 = var364;
                                            }
                                            if (Statics.field897 != var326) {
                                                if (var326 != null) {
                                                    method1874(var326);
                                                }
                                                if (Statics.field897 != null) {
                                                    method1874(Statics.field897);
                                                }
                                            }
                                            if (Statics.field202 != var327 && field508 == field437) {
                                                if (var327 != null) {
                                                    method1874(var327);
                                                }
                                                if (Statics.field202 != null) {
                                                    method1874(Statics.field202);
                                                }
                                            }
                                            if (Statics.field202 == null) {
                                                if (field437 > 0) {
                                                    field437--;
                                                }
                                            } else if (field437 < field508) {
                                                field437++;
                                                if (field508 == field437) {
                                                    method1874(Statics.field202);
                                                }
                                            }
                                            int var365 = field350 + Statics.field85.field658;
                                            int var366 = field450 + Statics.field85.field632;
                                            if (Statics.field3058 - var365 < -500 || Statics.field3058 - var365 > 500 || Statics.field813 - var366 < -500 || Statics.field813 - var366 > 500) {
                                                Statics.field3058 = var365;
                                                Statics.field813 = var366;
                                            }
                                            if (Statics.field3058 != var365) {
                                                Statics.field3058 += (var365 - Statics.field3058) / 16;
                                            }
                                            if (Statics.field813 != var366) {
                                                Statics.field813 += (var366 - Statics.field813) / 16;
                                            }
                                            if (class116.field1810 == 4 && Statics.field770) {
                                                int var367 = class116.field1802 * 603852017 - field374 * 603852017;
                                                field372 = var367 * 2;
                                                field374 = (var367 == -1 || var367 == 1 ? class116.field1802 * 603852017 : (field374 * 603852017 + class116.field1802 * 603852017) / 2) * -1136434159;
                                                int var368 = field561 - class116.field1803;
                                                field473 = var368 * 2;
                                                field561 = var368 == -1 || var368 == 1 ? class116.field1803 : (field561 + class116.field1803) / 2;
                                            } else {
                                                if (class106.field1701[96]) {
                                                    field473 += (-24 - field473) / 2;
                                                } else if (class106.field1701[97]) {
                                                    field473 += (24 - field473) / 2;
                                                } else {
                                                    field473 /= 2;
                                                }
                                                if (class106.field1701[98]) {
                                                    field372 += (12 - field372) / 2;
                                                } else if (class106.field1701[99]) {
                                                    field372 += (-12 - field372) / 2;
                                                } else {
                                                    field372 /= 2;
                                                }
                                                field374 = class116.field1802;
                                                field561 = class116.field1803;
                                            }
                                            field558 = field473 / 2 + field558 & 0x7FF;
                                            field369 += field372 / 2;
                                            if (field369 < 128) {
                                                field369 = 128;
                                            }
                                            if (field369 > 383) {
                                                field369 = 383;
                                            }
                                            int var369 = Statics.field3058 >> 7;
                                            int var370 = Statics.field813 >> 7;
                                            int var371 = method1180(Statics.field3058, Statics.field813, Statics.field2111);
                                            int var372 = 0;
                                            if (var369 > 3 && var370 > 3 && var369 < 100 && var370 < 100) {
                                                for (int var373 = var369 - 4; var373 <= var369 + 4; var373++) {
                                                    for (int var374 = var370 - 4; var374 <= var370 + 4; var374++) {
                                                        int var375 = Statics.field2111;
                                                        if (var375 < 3 && (class11.field88[1][var373][var374] & 0x2) == 2) {
                                                            var375++;
                                                        }
                                                        int var376 = var371 - class11.field99[var375][var373][var374];
                                                        if (var376 > var372) {
                                                            var372 = var376;
                                                        }
                                                    }
                                                }
                                            }
                                            int var377 = var372 * 192;
                                            if (var377 > 98048) {
                                                var377 = 98048;
                                            }
                                            if (var377 < 32768) {
                                                var377 = 32768;
                                            }
                                            if (var377 > field378) {
                                                field378 += (var377 - field378) / 24;
                                            } else if (var377 < field378) {
                                                field378 += (var377 - field378) / 80;
                                            }
                                            if (field333) {
                                                int var378 = Statics.field2011 * 128 + 64;
                                                int var379 = Statics.field1175 * 128 + 64;
                                                int var380 = method1180(var378, var379, Statics.field2111) - Statics.field1789;
                                                if (Statics.field3093 < var378) {
                                                    Statics.field3093 += Statics.field2027 * (var378 - Statics.field3093) / 1000 + Statics.field1532;
                                                    if (Statics.field3093 > var378) {
                                                        Statics.field3093 = var378;
                                                    }
                                                }
                                                if (Statics.field3093 > var378) {
                                                    Statics.field3093 -= Statics.field2027 * (Statics.field3093 - var378) / 1000 + Statics.field1532;
                                                    if (Statics.field3093 < var378) {
                                                        Statics.field3093 = var378;
                                                    }
                                                }
                                                if (Statics.field1759 < var380) {
                                                    Statics.field1759 += Statics.field2027 * (var380 - Statics.field1759) / 1000 + Statics.field1532;
                                                    if (Statics.field1759 > var380) {
                                                        Statics.field1759 = var380;
                                                    }
                                                }
                                                if (Statics.field1759 > var380) {
                                                    Statics.field1759 -= Statics.field2027 * (Statics.field1759 - var380) / 1000 + Statics.field1532;
                                                    if (Statics.field1759 < var380) {
                                                        Statics.field1759 = var380;
                                                    }
                                                }
                                                if (Statics.field233 < var379) {
                                                    Statics.field233 += Statics.field2027 * (var379 - Statics.field233) / 1000 + Statics.field1532;
                                                    if (Statics.field233 > var379) {
                                                        Statics.field233 = var379;
                                                    }
                                                }
                                                if (Statics.field233 > var379) {
                                                    Statics.field233 -= Statics.field2027 * (Statics.field233 - var379) / 1000 + Statics.field1532;
                                                    if (Statics.field233 < var379) {
                                                        Statics.field233 = var379;
                                                    }
                                                }
                                                int var381 = Statics.field938 * 128 + 64;
                                                int var382 = Statics.field11 * 128 + 64;
                                                int var383 = method1180(var381, var382, Statics.field2111) - Statics.field754;
                                                int var384 = var381 - Statics.field3093;
                                                int var385 = var383 - Statics.field1759;
                                                int var386 = var382 - Statics.field233;
                                                int var387 = (int) Math.sqrt((double) (var384 * var384 + var386 * var386));
                                                int var388 = (int) (Math.atan2((double) var385, (double) var387) * 325.949D) & 0x7FF;
                                                int var389 = (int) (Math.atan2((double) var384, (double) var386) * -325.949D) & 0x7FF;
                                                if (var388 < 128) {
                                                    var388 = 128;
                                                }
                                                if (var388 > 383) {
                                                    var388 = 383;
                                                }
                                                if (Statics.field1553 < var388) {
                                                    Statics.field1553 += Statics.field105 * (var388 - Statics.field1553) / 1000 + Statics.field1641;
                                                    if (Statics.field1553 > var388) {
                                                        Statics.field1553 = var388;
                                                    }
                                                }
                                                if (Statics.field1553 > var388) {
                                                    Statics.field1553 -= Statics.field105 * (Statics.field1553 - var388) / 1000 + Statics.field1641;
                                                    if (Statics.field1553 < var388) {
                                                        Statics.field1553 = var388;
                                                    }
                                                }
                                                int var390 = var389 - Statics.field149;
                                                if (var390 > 1024) {
                                                    var390 -= 2048;
                                                }
                                                if (var390 < -1024) {
                                                    var390 += 2048;
                                                }
                                                if (var390 > 0) {
                                                    Statics.field149 += Statics.field105 * var390 / 1000 + Statics.field1641;
                                                    Statics.field149 &= 0x7FF;
                                                }
                                                if (var390 < 0) {
                                                    Statics.field149 -= Statics.field105 * -var390 / 1000 + Statics.field1641;
                                                    Statics.field149 &= 0x7FF;
                                                }
                                                int var391 = var389 - Statics.field149;
                                                if (var391 > 1024) {
                                                    var391 -= 2048;
                                                }
                                                if (var391 < -1024) {
                                                    var391 += 2048;
                                                }
                                                if (var391 < 0 && var390 > 0 || var391 > 0 && var390 < 0) {
                                                    Statics.field149 = var389;
                                                }
                                            }
                                            for (int var392 = 0; var392 < 5; var392++) {
                                                var10002 = field539[var392]++;
                                            }
                                            Statics.field86.method887();
                                            int var393 = class116.method2022();
                                            int var394 = class106.method166();
                                            if (var393 > 15000 && var394 > 15000) {
                                                field338 = 250;
                                                class116.method1408(14500);
                                                field328.method2936(219);
                                            }
                                            field356++;
                                            if (field356 > 500) {
                                                field356 = 0;
                                                int var395 = (int) (Math.random() * 8.0D);
                                                if ((var395 & 0x1) == 1) {
                                                    field350 += field480;
                                                }
                                                if ((var395 & 0x2) == 2) {
                                                    field450 += field353;
                                                }
                                                if ((var395 & 0x4) == 4) {
                                                    field354 += field305;
                                                }
                                            }
                                            if (field350 < -50) {
                                                field480 = 2;
                                            }
                                            if (field350 > 50) {
                                                field480 = -2;
                                            }
                                            if (field450 < -55) {
                                                field353 = 2;
                                            }
                                            if (field450 > 55) {
                                                field353 = -2;
                                            }
                                            if (field354 < -40) {
                                                field305 = 1;
                                            }
                                            if (field354 > 40) {
                                                field305 = -1;
                                            }
                                            field370++;
                                            if (field370 > 500) {
                                                field370 = 0;
                                                int var396 = (int) (Math.random() * 8.0D);
                                                if ((var396 & 0x1) == 1) {
                                                    field357 += field358;
                                                }
                                                if ((var396 & 0x2) == 2) {
                                                    field343 += field529;
                                                }
                                            }
                                            if (field357 < -60) {
                                                field358 = 2;
                                            }
                                            if (field357 > 60) {
                                                field358 = -2;
                                            }
                                            if (field343 < -20) {
                                                field529 = 1;
                                            }
                                            if (field343 > 10) {
                                                field529 = -1;
                                            }
                                            for (class17 var397 = (class17) field313.method2352(); var397 != null; var397 = (class17) field313.method2357()) {
                                                if ((long) var397.field177 < class156.method910() / 1000L - 5L) {
                                                    if (var397.field167 > 0) {
                                                        class48.method2520(5, "", var397.field168 + class174.field2500);
                                                    }
                                                    if (var397.field167 == 0) {
                                                        class48.method2520(5, "", var397.field168 + class174.field2501);
                                                    }
                                                    var397.method2362();
                                                }
                                            }
                                            field334++;
                                            if (field334 > 50) {
                                                field328.method2936(108);
                                            }
                                            try {
                                                if (Statics.field47 != null && field328.field2085 > 0) {
                                                    Statics.field47.method2001(field328.field2083, 0, field328.field2085);
                                                    field328.field2085 = 0;
                                                    field334 = 0;
                                                }
                                            } catch (IOException var399) {
                                                method110();
                                            }
                                            return;
                                        }
                                        var340 = var339.field186;
                                        if (var340.field2321 < 0) {
                                            break;
                                        }
                                        var341 = class170.method2518(var340.field2207);
                                    } while (var341 == null || var341.field2282 == null || var340.field2321 >= var341.field2282.length || var341.field2282[var340.field2321] != var340);
                                    class33.method1885(var339);
                                }
                            }
                            var337 = var336.field186;
                            if (var337.field2321 < 0) {
                                break;
                            }
                            var338 = class170.method2518(var337.field2207);
                        } while (var338 == null || var338.field2282 == null || var337.field2321 >= var338.field2282.length || var338.field2282[var337.field2321] != var337);
                        class33.method1885(var336);
                    }
                }
                var334 = var333.field186;
                if (var334.field2321 < 0) {
                    break;
                }
                var335 = class170.method2518(var334.field2207);
            } while (var335 == null || var335.field2282 == null || var334.field2321 >= var335.field2282.length || var335.field2282[var334.field2321] != var334);
            class33.method1885(var333);
        }
    }

    @ObfuscatedName("e.ap(I)V")
    public static final void method225() {
        if (Statics.field569 != null) {
            Statics.field569.method1083();
        }
        if (Statics.field31 != null) {
            Statics.field31.method1083();
        }
    }

    @ObfuscatedName("y.aj(Lgb;IIII)V")
    public static void method193(class202 arg0, int arg1, int arg2, int arg3) {
        if (field528 >= 50 || field527 == 0 || arg0.field3059 == null || arg1 >= arg0.field3059.length) {
            return;
        }
        int var4 = arg0.field3059[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field553[field528] = var5;
        field530[field528] = var6;
        field531[field528] = 0;
        field352[field528] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field532[field528] = (var8 << 16) + (var9 << 8) + var7;
        field528++;
    }

    @ObfuscatedName("t.af(Lfr;III)V")
    public static final void method33(class170 arg0, int arg1, int arg2) {
        if (field559 != 0 && field559 != 3 || class116.field1797 != 1 && Statics.field770 || class116.field1797 != 4) {
            return;
        }
        class165 var3 = arg0.method3105(true);
        if (var3 == null) {
            return;
        }
        int var4 = class116.field1809 - arg1;
        int var5 = class116.field1799 - arg2;
        if (!var3.method3023(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2149 / 2;
        int var7 = var5 - var3.field2147 / 2;
        int var8 = field558 + field357 & 0x7FF;
        int var9 = class85.field1436[var8];
        int var10 = class85.field1433[var8];
        int var11 = (field343 + 256) * var9 >> 8;
        int var12 = (field343 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field85.field658 + var13 >> 7;
        int var16 = Statics.field85.field632 - var14 >> 7;
        field328.method2936(124);
        field328.method2832(18);
        field328.method2709(Statics.field21 + var16);
        field328.method2870(class106.field1701[82] ? (class106.field1701[81] ? 2 : 1) : 0);
        field328.method2711(Statics.field221 + var15);
        field328.method2832(var6);
        field328.method2832(var7);
        field328.method2664(field558);
        field328.method2832(57);
        field328.method2832(field357);
        field328.method2832(field343);
        field328.method2832(89);
        field328.method2664(Statics.field85.field658);
        field328.method2664(Statics.field85.field632);
        field328.method2832(63);
        field520 = var15;
        field521 = var16;
    }

    @ObfuscatedName("h.aw(Ljava/lang/String;S)V")
    public static final void method86(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1552.field690 = !Statics.field1552.field690;
            class31.method1879();
            if (Statics.field1552.field690) {
                class48.method2520(99, "", "Roofs are now all hidden");
            } else {
                class48.method2520(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field299 = !field299;
        }
        if (field371 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field299 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field299 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method110();
            }
            if (arg0.equalsIgnoreCase("errortest") && field296 == 2) {
                throw new RuntimeException();
            }
        }
        field328.method2936(87);
        field328.method2832(arg0.length() + 1);
        field328.method2715(arg0);
    }

    @ObfuscatedName("am.ac(I)V")
    public static final void method778() {
        for (int var0 = 0; var0 < field324; var0++) {
            int var1 = field325[var0];
            class36 var2 = field323[var1];
            if (var2 != null) {
                method84(var2, var2.field759.field3013);
            }
        }
    }

    @ObfuscatedName("h.an(Laj;II)V")
    public static final void method84(class28 arg0, int arg1) {
        if (arg0.field648 > field293) {
            int var2 = arg0.field648 - field293;
            int var3 = arg0.field644 * 128 + arg0.field635 * 64;
            int var4 = arg0.field646 * 128 + arg0.field635 * 64;
            arg0.field658 += (var3 - arg0.field658) / var2;
            arg0.field632 += (var4 - arg0.field632) / var2;
            arg0.field602 = 0;
            arg0.field653 = arg0.field650;
        } else if (arg0.field634 >= field293) {
            method205(arg0);
        } else {
            method3537(arg0);
        }
        if (arg0.field658 < 128 || arg0.field632 < 128 || arg0.field658 >= 13184 || arg0.field632 >= 13184) {
            arg0.field605 = -1;
            arg0.field639 = -1;
            arg0.field648 = 0;
            arg0.field634 = 0;
            arg0.field658 = arg0.field657[0] * 128 + arg0.field635 * 64;
            arg0.field632 = arg0.field641[0] * 128 + arg0.field635 * 64;
            arg0.method623();
        }
        if (Statics.field85 == arg0 && (arg0.field658 < 1536 || arg0.field632 < 1536 || arg0.field658 >= 11776 || arg0.field632 >= 11776)) {
            arg0.field605 = -1;
            arg0.field639 = -1;
            arg0.field648 = 0;
            arg0.field634 = 0;
            arg0.field658 = arg0.field657[0] * 128 + arg0.field635 * 64;
            arg0.field632 = arg0.field641[0] * 128 + arg0.field635 * 64;
            arg0.method623();
        }
        if (arg0.field655 != 0) {
            if (arg0.field603 != -1) {
                class28 var5 = null;
                if (arg0.field603 < 32768) {
                    var5 = field323[arg0.field603];
                } else if (arg0.field603 >= 32768) {
                    var5 = field406[arg0.field603 - 32768];
                }
                if (var5 != null) {
                    int var6 = arg0.field658 - var5.field658;
                    int var7 = arg0.field632 - var5.field632;
                    if (var6 != 0 || var7 != 0) {
                        arg0.field653 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field651) {
                    arg0.field603 = -1;
                    arg0.field651 = false;
                }
            }
            if (arg0.field611 != -1 && (arg0.field656 == 0 || arg0.field602 > 0)) {
                arg0.field653 = arg0.field611;
                arg0.field611 = -1;
            }
            int var8 = arg0.field653 - arg0.field604 & 0x7FF;
            if (var8 == 0 && arg0.field651) {
                arg0.field603 = -1;
                arg0.field651 = false;
            }
            if (var8 == 0) {
                arg0.field660 = 0;
            } else {
                arg0.field660++;
                if (var8 > 1024) {
                    arg0.field604 -= arg0.field655;
                    boolean var9 = true;
                    if (var8 < arg0.field655 || var8 > 2048 - arg0.field655) {
                        arg0.field604 = arg0.field653;
                        var9 = false;
                    }
                    if (arg0.field631 == arg0.field606 && (arg0.field660 > 25 || var9)) {
                        if (arg0.field608 == -1) {
                            arg0.field631 = arg0.field628;
                        } else {
                            arg0.field631 = arg0.field608;
                        }
                    }
                } else {
                    arg0.field604 += arg0.field655;
                    boolean var10 = true;
                    if (var8 < arg0.field655 || var8 > 2048 - arg0.field655) {
                        arg0.field604 = arg0.field653;
                        var10 = false;
                    }
                    if (arg0.field631 == arg0.field606 && (arg0.field660 > 25 || var10)) {
                        if (arg0.field609 == -1) {
                            arg0.field631 = arg0.field628;
                        } else {
                            arg0.field631 = arg0.field609;
                        }
                    }
                }
                arg0.field604 &= 0x7FF;
            }
        }
        method859(arg0);
    }

    @ObfuscatedName("m.ae(Laj;B)V")
    public static final void method205(class28 arg0) {
        if (field293 == arg0.field634 || arg0.field605 == -1 || arg0.field637 != 0 || arg0.field636 + 1 > class202.method262(arg0.field605).field3067[arg0.field619]) {
            int var1 = arg0.field634 - arg0.field648;
            int var2 = field293 - arg0.field648;
            int var3 = arg0.field644 * 128 + arg0.field635 * 64;
            int var4 = arg0.field646 * 128 + arg0.field635 * 64;
            int var5 = arg0.field645 * 128 + arg0.field635 * 64;
            int var6 = arg0.field647 * 128 + arg0.field635 * 64;
            arg0.field658 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field632 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field602 = 0;
        arg0.field653 = arg0.field650;
        arg0.field604 = arg0.field653;
    }

    @ObfuscatedName("gy.au(Laj;I)V")
    public static final void method3537(class28 arg0) {
        arg0.field631 = arg0.field606;
        if (arg0.field656 == 0) {
            arg0.field602 = 0;
            return;
        }
        if (arg0.field605 != -1 && arg0.field637 == 0) {
            class202 var1 = class202.method262(arg0.field605);
            if (arg0.field661 > 0 && var1.field3074 == 0) {
                arg0.field602++;
                return;
            }
            if (arg0.field661 <= 0 && var1.field3075 == 0) {
                arg0.field602++;
                return;
            }
        }
        int var2 = arg0.field658;
        int var3 = arg0.field632;
        int var4 = arg0.field657[arg0.field656 - 1] * 128 + arg0.field635 * 64;
        int var5 = arg0.field641[arg0.field656 - 1] * 128 + arg0.field635 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field653 = 1280;
            } else if (var3 > var5) {
                arg0.field653 = 1792;
            } else {
                arg0.field653 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field653 = 768;
            } else if (var3 > var5) {
                arg0.field653 = 256;
            } else {
                arg0.field653 = 512;
            }
        } else if (var3 < var5) {
            arg0.field653 = 1024;
        } else if (var3 > var5) {
            arg0.field653 = 0;
        }
        byte var6 = arg0.field659[arg0.field656 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field658 = var4;
            arg0.field632 = var5;
            arg0.field656--;
            if (arg0.field661 > 0) {
                arg0.field661--;
            }
            return;
        }
        int var7 = arg0.field653 - arg0.field604 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field625;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field628;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field613;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field612;
        }
        if (var8 == -1) {
            var8 = arg0.field628;
        }
        arg0.field631 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class36) {
            var10 = ((class36) arg0).field759.field3030;
        }
        if (var10) {
            if (arg0.field653 != arg0.field604 && arg0.field603 == -1 && arg0.field655 != 0) {
                var9 = 2;
            }
            if (arg0.field656 > 2) {
                var9 = 6;
            }
            if (arg0.field656 > 3) {
                var9 = 8;
            }
            if (arg0.field602 > 0 && arg0.field656 > 1) {
                var9 = 8;
                arg0.field602--;
            }
        } else {
            if (arg0.field656 > 1) {
                var9 = 6;
            }
            if (arg0.field656 > 2) {
                var9 = 8;
            }
            if (arg0.field602 > 0 && arg0.field656 > 1) {
                var9 = 8;
                arg0.field602--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field631 == arg0.field628 && arg0.field614 != -1) {
            arg0.field631 = arg0.field614;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field658 += var9;
                if (arg0.field658 > var4) {
                    arg0.field658 = var4;
                }
            } else if (var2 > var4) {
                arg0.field658 -= var9;
                if (arg0.field658 < var4) {
                    arg0.field658 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field632 += var9;
                if (arg0.field632 > var5) {
                    arg0.field632 = var5;
                }
            } else if (var3 > var5) {
                arg0.field632 -= var9;
                if (arg0.field632 < var5) {
                    arg0.field632 = var5;
                }
            }
        }
        if (arg0.field658 == var4 && arg0.field632 == var5) {
            arg0.field656--;
            if (arg0.field661 > 0) {
                arg0.field661--;
            }
        }
    }

    @ObfuscatedName("al.am(Laj;I)V")
    public static final void method859(class28 arg0) {
        arg0.field633 = false;
        if (arg0.field631 != -1) {
            class202 var1 = class202.method262(arg0.field631);
            if (var1 == null || var1.field3073 == null) {
                arg0.field631 = -1;
            } else {
                arg0.field630++;
                if (arg0.field654 < var1.field3073.length && arg0.field630 > var1.field3067[arg0.field654]) {
                    arg0.field630 = 1;
                    arg0.field654++;
                    method193(var1, arg0.field654, arg0.field658, arg0.field632);
                }
                if (arg0.field654 >= var1.field3073.length) {
                    arg0.field630 = 0;
                    arg0.field654 = 0;
                    method193(var1, arg0.field654, arg0.field658, arg0.field632);
                }
            }
        }
        if (arg0.field639 != -1 && field293 >= arg0.field642) {
            if (arg0.field640 < 0) {
                arg0.field640 = 0;
            }
            int var2 = class191.method2966(arg0.field639).field2798;
            if (var2 == -1) {
                arg0.field639 = -1;
            } else {
                class202 var3 = class202.method262(var2);
                if (var3 == null || var3.field3073 == null) {
                    arg0.field639 = -1;
                } else {
                    arg0.field629++;
                    if (arg0.field640 < var3.field3073.length && arg0.field629 > var3.field3067[arg0.field640]) {
                        arg0.field629 = 1;
                        arg0.field640++;
                        method193(var3, arg0.field640, arg0.field658, arg0.field632);
                    }
                    if (arg0.field640 >= var3.field3073.length && (arg0.field640 < 0 || arg0.field640 >= var3.field3073.length)) {
                        arg0.field639 = -1;
                    }
                }
            }
        }
        if (arg0.field605 != -1 && arg0.field637 <= 1) {
            class202 var4 = class202.method262(arg0.field605);
            if (var4.field3074 == 1 && arg0.field661 > 0 && arg0.field648 <= field293 && arg0.field634 < field293) {
                arg0.field637 = 1;
                return;
            }
        }
        if (arg0.field605 != -1 && arg0.field637 == 0) {
            class202 var5 = class202.method262(arg0.field605);
            if (var5 == null || var5.field3073 == null) {
                arg0.field605 = -1;
            } else {
                arg0.field636++;
                if (arg0.field619 < var5.field3073.length && arg0.field636 > var5.field3067[arg0.field619]) {
                    arg0.field636 = 1;
                    arg0.field619++;
                    method193(var5, arg0.field619, arg0.field658, arg0.field632);
                }
                if (arg0.field619 >= var5.field3073.length) {
                    arg0.field619 -= var5.field3069;
                    arg0.field638++;
                    if (arg0.field638 >= var5.field3061) {
                        arg0.field605 = -1;
                    } else if (arg0.field619 >= 0 && arg0.field619 < var5.field3073.length) {
                        method193(var5, arg0.field619, arg0.field658, arg0.field632);
                    } else {
                        arg0.field605 = -1;
                    }
                }
                arg0.field633 = var5.field3077;
            }
        }
        if (arg0.field637 > 0) {
            arg0.field637--;
        }
    }

    @ObfuscatedName("ao.as(Lj;III)V")
    public static void method958(class24 arg0, int arg1, int arg2) {
        if (arg0.field605 == arg1 && arg1 != -1) {
            int var3 = class202.method262(arg1).field3063;
            if (var3 == 1) {
                arg0.field619 = 0;
                arg0.field636 = 0;
                arg0.field637 = arg2;
                arg0.field638 = 0;
            }
            if (var3 == 2) {
                arg0.field638 = 0;
            }
        } else if (arg1 == -1 || arg0.field605 == -1 || class202.method262(arg1).field3070 >= class202.method262(arg0.field605).field3070) {
            arg0.field605 = arg1;
            arg0.field619 = 0;
            arg0.field636 = 0;
            arg0.field637 = arg2;
            arg0.field638 = 0;
            arg0.field661 = arg0.field656;
        }
    }

    @ObfuscatedName("aj.ay(I)I")
    public static int method628() {
        return field499 ? 2 : 1;
    }

    @ObfuscatedName("r.at(I)V")
    public static void method122() {
        Canvas var0 = Statics.field3;
        var0.removeKeyListener(class106.field1720);
        var0.removeFocusListener(class106.field1720);
        class106.field1704 = -1;
        class116.method260(Statics.field3);
        if (Statics.field74 != null) {
            Statics.field74.method1970(Statics.field3);
        }
        Statics.field280.method2078();
        Statics.field3.setBackground(Color.black);
        class106.method2984(Statics.field3);
        class116.method634(Statics.field3);
        if (Statics.field74 != null) {
            Statics.field74.method1969(Statics.field3);
        }
        if (field452 != -1) {
            method797(false);
        }
        field1776 = true;
    }

    @ObfuscatedName("cl.ai(I)V")
    public static void method1861() {
        client var0 = Statics.field280;
        synchronized (Statics.field280) {
            Container var1 = Statics.field280.method2077();
            if (var1 != null) {
                Statics.field1554 = Math.max(var1.getSize().width, Statics.field2667);
                Statics.field1446 = Math.max(var1.getSize().height, Statics.field1584);
                if (Statics.field882 == var1) {
                    Insets var2 = Statics.field882.getInsets();
                    Statics.field1554 -= var2.right + var2.left;
                    Statics.field1446 -= var2.top + var2.bottom;
                }
                if (Statics.field1554 <= 0) {
                    Statics.field1554 = 1;
                }
                if (Statics.field1446 <= 0) {
                    Statics.field1446 = 1;
                }
                if (method628() == 1) {
                    Statics.field22 = field501;
                    Statics.field217 = field502;
                } else {
                    Statics.field22 = Math.min(Statics.field1554, 7680);
                    Statics.field217 = Math.min(Statics.field1446, 2160);
                }
                field1762 = (Statics.field1554 - Statics.field22) / 2;
                field1781 = 0;
                Statics.field3.setSize(Statics.field22, Statics.field217);
                Statics.field232 = class221.method224(Statics.field22, Statics.field217, Statics.field3);
                if (Statics.field882 == var1) {
                    Insets var3 = Statics.field882.getInsets();
                    Statics.field3.setLocation(field1762 + var3.left, field1781 + var3.top);
                } else {
                    Statics.field3.setLocation(field1762, field1781);
                }
                method633();
                if (field452 != -1) {
                    method797(true);
                }
                method68();
            }
        }
    }

    @ObfuscatedName("aj.aa(I)V")
    public static void method633() {
        int var0 = Statics.field22;
        int var1 = Statics.field217;
        if (Statics.field1554 < var0) {
            int var2 = Statics.field1554;
        }
        if (Statics.field1446 < var1) {
            int var3 = Statics.field1446;
        }
        if (Statics.field1552 == null) {
            return;
        }
        try {
            client var4 = Statics.field280;
            Object[] var5 = new Object[] { method628() };
            JSObject.getWindow(var4).call("resize", var5);
        } catch (Throwable var7) {
        }
    }

    @ObfuscatedName("k.ar(B)V")
    public static void method68() {
        int var0 = field1762;
        int var1 = field1781;
        int var2 = Statics.field1554 - Statics.field22 - var0;
        int var3 = Statics.field1446 - Statics.field217 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field280.method2077();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field882 == var4) {
                Insets var7 = Statics.field882.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field1446);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field1554, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field1554 + var5 - var2, var6, var2, Statics.field1446);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field1446 + var6 - var3, Statics.field1554, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("aw.ag(S)V")
    public static final void method692() {
        if (field452 != -1) {
            method3145(field452);
        }
        for (int var0 = 0; var0 < field545; var0++) {
            if (field491[var0]) {
                field387[var0] = true;
            }
            field493[var0] = field491[var0];
            field491[var0] = false;
        }
        field490 = field293;
        field435 = -1;
        field488 = -1;
        Statics.field1535 = null;
        if (field452 != -1) {
            field545 = 0;
            method3137(field452, 0, 0, Statics.field22, Statics.field217, 0, 0, -1);
        }
        class220.method3925();
        if (field424) {
            method67();
        } else if (field435 != -1) {
            method2579(field435, field488);
        }
        if (field498 == 3) {
            for (int var1 = 0; var1 < field545; var1++) {
                if (field493[var1]) {
                    class220.method3892(field494[var1], field495[var1], field496[var1], field497[var1], 16711935, 128);
                } else if (field387[var1]) {
                    class220.method3892(field494[var1], field495[var1], field496[var1], field497[var1], 16711680, 128);
                }
            }
        }
        int var2 = Statics.field2111;
        int var3 = Statics.field85.field658;
        int var4 = Statics.field85.field632;
        int var5 = field478;
        for (class32 var6 = (class32) class32.field701.method2324(); var6 != null; var6 = (class32) class32.field701.method2331()) {
            if (var6.field704 != -1 || var6.field699 != null) {
                int var7 = 0;
                if (var3 > var6.field705) {
                    var7 += var3 - var6.field705;
                } else if (var3 < var6.field711) {
                    var7 += var6.field711 - var3;
                }
                if (var4 > var6.field702) {
                    var7 += var4 - var6.field702;
                } else if (var4 < var6.field700) {
                    var7 += var6.field700 - var4;
                }
                if (var7 - 64 > var6.field703 || field527 == 0 || var6.field698 != var2) {
                    if (var6.field697 != null) {
                        Statics.field169.method965(var6.field697);
                        var6.field697 = null;
                    }
                    if (var6.field710 != null) {
                        Statics.field169.method965(var6.field710);
                        var6.field710 = null;
                    }
                } else {
                    var7 -= 64;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = field527 * (var6.field703 - var7) / var6.field703;
                    class54 var10000;
                    if (var6.field697 != null) {
                        var6.field697.method1212(var8);
                    } else if (var6.field704 >= 0) {
                        var10000 = (class54) null;
                        class54 var9 = class54.method1017(Statics.field14, var6.field704, 0);
                        if (var9 != null) {
                            class56 var10 = var9.method1023().method1058(Statics.field1854);
                            class67 var11 = class67.method1192(var10, 100, var8);
                            var11.method1195(-1);
                            Statics.field169.method964(var11);
                            var6.field697 = var11;
                        }
                    }
                    if (var6.field710 != null) {
                        var6.field710.method1212(var8);
                        if (!var6.field710.method2314()) {
                            var6.field710 = null;
                        }
                    } else if (var6.field699 != null && (var6.field709 -= var5) <= 0) {
                        int var12 = (int) (Math.random() * (double) var6.field699.length);
                        var10000 = (class54) null;
                        class54 var13 = class54.method1017(Statics.field14, var6.field699[var12], 0);
                        if (var13 != null) {
                            class56 var14 = var13.method1023().method1058(Statics.field1854);
                            class67 var15 = class67.method1192(var14, 100, var8);
                            var15.method1195(0);
                            Statics.field169.method964(var15);
                            var6.field710 = var15;
                            var6.field709 = var6.field706 + (int) (Math.random() * (double) (var6.field707 - var6.field706));
                        }
                    }
                }
            }
        }
        field478 = 0;
    }

    @ObfuscatedName("k.ad(Ljava/lang/String;ZI)V")
    public static final void method66(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field120.method3766(arg0, 250);
        int var6 = Statics.field120.method3777(arg0, 250) * 13;
        class220.method3884(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class220.method3889(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field120.method3829(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method1968(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            Statics.method114(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field3.getGraphics();
            Statics.field232.method3860(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field3.repaint();
        }
    }

    @ObfuscatedName("cx.al(IIIIZS)V")
    public static final void method1917(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field361 - field540) * var5 / 100 + field540;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field556) {
            short var8 = field556;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field506) {
                var6 = field506;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class220.method3925();
                    class220.method3884(arg0, arg1, var10, arg3, -16777216);
                    class220.method3884(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field557) {
            short var11 = field557;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field401) {
                var6 = field401;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class220.method3925();
                    class220.method3884(arg0, arg1, arg2, var13, -16777216);
                    class220.method3884(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field543 - field542) * var5 / 100 + field542;
        field552 = arg3 * var6 * var14 / 85504 << 1;
        if (field445 != arg2 || field551 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class85.field1436[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class88.method1802(var15, 500, 800, arg2, arg3);
        }
        field317 = arg0;
        field549 = arg1;
        field445 = arg2;
        field551 = arg3;
    }

    @ObfuscatedName("z.ah(Ly;I)V")
    public static final void method167(class16 arg0) {
        if (Statics.field85.field658 >> 7 == field520 && Statics.field85.field632 >> 7 == field521) {
            field520 = 0;
        }
        int var1 = class46.field908;
        int[] var2 = class46.field901;
        int var3 = var1;
        if (class16.field162 == arg0 || class16.field156 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class24 var5;
            int var6;
            if (class16.field162 == arg0) {
                var5 = Statics.field85;
                var6 = Statics.field85.field262 << 14;
            } else if (class16.field156 == arg0) {
                var5 = field406[field415];
                var6 = field415 << 14;
            } else {
                var5 = field406[var2[var4]];
                var6 = var2[var4] << 14;
                if (class16.field161 == arg0 && field415 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method230() && !var5.field260) {
                var5.field258 = false;
                if ((field405 && var1 > 50 || var1 > 200) && class16.field162 != arg0 && var5.field631 == var5.field606) {
                    var5.field258 = true;
                }
                int var7 = var5.field658 >> 7;
                int var8 = var5.field632 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field253 == null || field293 < var5.field247 || field293 >= var5.field240) {
                        if ((var5.field658 & 0x7F) == 64 && (var5.field632 & 0x7F) == 64) {
                            if (field544 == field335[var7][var8]) {
                                continue;
                            }
                            field335[var7][var8] = field544;
                        }
                        var5.field263 = method1180(var5.field658, var5.field632, Statics.field2111);
                        Statics.field2856.method1761(Statics.field2111, var5.field658, var5.field632, var5.field263, 60, var5, var5.field604, var6, var5.field633);
                    } else {
                        var5.field258 = false;
                        var5.field263 = method1180(var5.field658, var5.field632, Statics.field2111);
                        Statics.field2856.method1770(Statics.field2111, var5.field658, var5.field632, var5.field263, 60, var5, var5.field604, var6, var5.field254, var5.field255, var5.field256, var5.field251);
                    }
                }
            }
        }
    }

    @ObfuscatedName("s.ak(ZI)V")
    public static final void method183(boolean arg0) {
        for (int var1 = 0; var1 < field324; var1++) {
            class36 var2 = field323[field325[var1]];
            int var3 = (field325[var1] << 14) + 536870912;
            if (var2 != null && var2.method230() && var2.field759.field3016 == arg0 && var2.field759.method3601()) {
                int var4 = var2.field658 >> 7;
                int var5 = var2.field632 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field635 == 1 && (var2.field658 & 0x7F) == 64 && (var2.field632 & 0x7F) == 64) {
                        if (field544 == field335[var4][var5]) {
                            continue;
                        }
                        field335[var4][var5] = field544;
                    }
                    if (!var2.field759.field3040) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2856.method1761(Statics.field2111, var2.field658, var2.field632, method1180(var2.field658 + (var2.field635 * 64 - 64), var2.field632 + (var2.field635 * 64 - 64), Statics.field2111), var2.field635 * 64 - 64 + 60, var2, var2.field604, var3, var2.field633);
                }
            }
        }
    }

    @ObfuscatedName("j.ax(B)V")
    public static final void method246() {
        for (class43 var0 = (class43) field463.method2324(); var0 != null; var0 = (class43) field463.method2331()) {
            if (Statics.field2111 != var0.field856 || field293 > var0.field862) {
                var0.method2313();
            } else if (field293 >= var0.field858) {
                if (var0.field855 > 0) {
                    class36 var1 = field323[var0.field855 - 1];
                    if (var1 != null && var1.field658 >= 0 && var1.field658 < 13312 && var1.field632 >= 0 && var1.field632 < 13312) {
                        var0.method840(var1.field658, var1.field632, method1180(var1.field658, var1.field632, var0.field856) - var0.field860, field293);
                    }
                }
                if (var0.field855 < 0) {
                    int var2 = -var0.field855 - 1;
                    class24 var3;
                    if (field407 == var2) {
                        var3 = Statics.field85;
                    } else {
                        var3 = field406[var2];
                    }
                    if (var3 != null && var3.field658 >= 0 && var3.field658 < 13312 && var3.field632 >= 0 && var3.field632 < 13312) {
                        var0.method840(var3.field658, var3.field632, method1180(var3.field658, var3.field632, var0.field856) - var0.field860, field293);
                    }
                }
                var0.method841(field478);
                Statics.field2856.method1761(Statics.field2111, (int) var0.field864, (int) var0.field868, (int) var0.field869, 60, var0, var0.field861, -1, false);
            }
        }
    }

    @ObfuscatedName("hg.av(I)V")
    public static final void method3846() {
        for (class34 var0 = (class34) field419.method2324(); var0 != null; var0 = (class34) field419.method2331()) {
            if (Statics.field2111 != var0.field738 || var0.field748) {
                var0.method2313();
            } else if (field293 >= var0.field737) {
                var0.method753(field478);
                if (var0.field748) {
                    var0.method2313();
                } else {
                    Statics.field2856.method1761(var0.field738, var0.field739, var0.field740, var0.field741, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("bp.az(B)I")
    public static final int method1383() {
        if (Statics.field1552.field690) {
            return Statics.field2111;
        } else {
            int var0 = method1180(Statics.field3093, Statics.field233, Statics.field2111);
            return var0 - Statics.field1759 >= 800 || (class11.field88[Statics.field2111][Statics.field3093 >> 7][Statics.field233 >> 7] & 0x4) == 0 ? 3 : Statics.field2111;
        }
    }

    @ObfuscatedName("ho.ao(Laj;IIIIIB)V")
    public static final void method3847(class28 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method230()) {
            return;
        }
        if (arg0 instanceof class36) {
            class200 var6 = ((class36) arg0).field759;
            if (var6.field3036 != null) {
                var6 = var6.method3602();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class46.field908;
        int[] var8 = class46.field901;
        int var9 = 3;
        if (!arg0.field627.method2290()) {
            method780(arg0, arg0.field610 + 15);
            for (class35 var10 = (class35) arg0.field627.method2307(); var10 != null; var10 = (class35) arg0.field627.method2289()) {
                class29 var11 = var10.method760(field293);
                if (var11 != null) {
                    class194 var12 = var10.field752;
                    class225 var13 = var12.method3396();
                    class225 var14 = var12.method3395();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field2844;
                    } else {
                        if (var12.field2834 * 2 < var14.field3216) {
                            var15 = var12.field2834;
                        }
                        var16 = var14.field3216 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field293 - var11.field669;
                    int var20 = var11.field666 * var16 / var12.field2844;
                    int var23;
                    if (var11.field667 > var19) {
                        int var21 = var12.field2840 == 0 ? 0 : var19 / var12.field2840 * var12.field2840;
                        int var22 = var11.field671 * var16 / var12.field2844;
                        var23 = (var20 - var22) * var21 / var11.field667 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field667 + var12.field2841 - var19;
                        if (var12.field2839 >= 0) {
                            var17 = (var24 << 8) / (var12.field2841 - var12.field2839);
                        }
                    }
                    if (var11.field666 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field391 + arg2 - (var16 >> 1);
                    int var26 = field392 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field391 > -1) {
                            class220.method3884(var25, var26, var23, 5, 65280);
                            class220.method3884(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3217;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method4023(var27, var26, var17);
                            class220.method3878(var27, var26, var27 + var28, var26 + var29);
                            var14.method4023(var27, var26, var17);
                        } else {
                            var13.method4036(var27, var26);
                            class220.method3878(var27, var26, var27 + var28, var26 + var29);
                            var14.method4036(var27, var26);
                        }
                        class220.method3909(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method765()) {
                    var10.method2313();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class24 var30 = (class24) arg0;
            if (var30.field260) {
                return;
            }
            if (var30.field242 != -1 || var30.field257 != -1) {
                method780(arg0, arg0.field610 + 15);
                if (field391 > -1) {
                    if (var30.field242 != -1) {
                        Statics.field441[var30.field242].method4036(field391 + arg2 - 12, field392 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field257 != -1) {
                        Statics.field2122[var30.field257].method4036(field391 + arg2 - 12, field392 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field301 == 10 && field312 == var8[arg1]) {
                method780(arg0, arg0.field610 + 15);
                if (field391 > -1) {
                    Statics.field2153[1].method4036(field391 + arg2 - 12, field392 + arg3 - var9);
                }
            }
        } else {
            class200 var31 = ((class36) arg0).field759;
            if (var31.field3036 != null) {
                var31 = var31.method3602();
            }
            if (var31.field3035 >= 0 && var31.field3035 < Statics.field2122.length) {
                method780(arg0, arg0.field610 + 15);
                if (field391 > -1) {
                    Statics.field2122[var31.field3035].method4036(field391 + arg2 - 12, field392 + arg3 - 30);
                }
            }
            if (field301 == 1 && field302 == field325[arg1 - var7] && field293 % 20 < 10) {
                method780(arg0, arg0.field610 + 15);
                if (field391 > -1) {
                    Statics.field2153[0].method4036(field391 + arg2 - 12, field392 + arg3 - 28);
                }
            }
        }
        if (arg0.field615 != null && (arg1 >= var7 || !arg0.field617 && (field453 == 4 || !arg0.field616 && (field453 == 0 || field453 == 3 || field453 == 1 && method954(((class24) arg0).field264, false))))) {
            method780(arg0, arg0.field610);
            if (field391 > -1 && field446 < field373) {
                field384[field446] = Statics.field171.method3764(arg0.field615) / 2;
                field383[field446] = Statics.field171.field3105;
                field381[field446] = field391;
                field292[field446] = field392;
                field385[field446] = arg0.field649;
                field418[field446] = arg0.field620;
                field546[field446] = arg0.field607;
                field489[field446] = arg0.field615;
                field446++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field624[var32];
            int var34 = arg0.field622[var32];
            class197 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field293) {
                    continue;
                }
                var35 = class197.method3627(arg0.field622[var32]);
                var36 = var35.field2883;
                if (var35 != null && var35.field2894 != null) {
                    var35 = var35.method3466();
                    if (var35 == null) {
                        arg0.field624[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field652[var32];
            class197 var38 = null;
            if (var37 >= 0) {
                var38 = class197.method3627(var37);
                if (var38 != null && var38.field2894 != null) {
                    var38 = var38.method3466();
                }
            }
            if (var33 - var36 <= field293) {
                if (var35 == null) {
                    arg0.field624[var32] = -1;
                } else {
                    method780(arg0, arg0.field610 / 2);
                    if (field391 > -1) {
                        if (var32 == 1) {
                            field392 -= 20;
                        }
                        if (var32 == 2) {
                            field391 -= 15;
                            field392 -= 10;
                        }
                        if (var32 == 3) {
                            field391 += 15;
                            field392 -= 10;
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
                        class225 var64 = var35.method3469();
                        if (var64 != null) {
                            var43 = var64.field3216;
                            int var65 = var64.field3217;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3218;
                        }
                        class225 var66 = var35.method3441();
                        if (var66 != null) {
                            var44 = var66.field3216;
                            int var67 = var66.field3217;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3218;
                        }
                        class225 var68 = var35.method3442();
                        if (var68 != null) {
                            var45 = var68.field3216;
                            int var69 = var68.field3217;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3218;
                        }
                        class225 var70 = var35.method3443();
                        if (var70 != null) {
                            var46 = var70.field3216;
                            int var71 = var70.field3217;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3218;
                        }
                        if (var38 != null) {
                            var51 = var38.method3469();
                            if (var51 != null) {
                                var55 = var51.field3216;
                                int var72 = var51.field3217;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3218;
                            }
                            var52 = var38.method3441();
                            if (var52 != null) {
                                var56 = var52.field3216;
                                int var73 = var52.field3217;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3218;
                            }
                            var53 = var38.method3442();
                            if (var53 != null) {
                                var57 = var53.field3216;
                                int var74 = var53.field3217;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3218;
                            }
                            var54 = var38.method3443();
                            if (var54 != null) {
                                var58 = var54.field3216;
                                int var75 = var54.field3217;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3218;
                            }
                        }
                        class209 var76 = var35.method3444();
                        if (var76 == null) {
                            var76 = Statics.field568;
                        }
                        class209 var77;
                        if (var38 == null) {
                            var77 = Statics.field568;
                        } else {
                            var77 = var38.method3444();
                            if (var77 == null) {
                                var77 = Statics.field568;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method3474(arg0.field623[var32]);
                        int var83 = var76.method3764(var82);
                        if (var38 != null) {
                            var79 = var38.method3474(arg0.field626[var32]);
                            var81 = var77.method3764(var79);
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
                        int var100 = arg0.field624[var32] - field293;
                        int var101 = var35.field2888 - var35.field2888 * var100 / var35.field2883;
                        int var102 = var35.field2897 * var100 / var35.field2883 + -var35.field2897;
                        int var103 = field391 + arg2 - (var92 >> 1) + var101;
                        int var104 = field392 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field2893 + var104 + 15;
                        int var108 = var107 - var76.field3106;
                        int var109 = var76.field3117 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field2893 + var104 + 15;
                            int var111 = var110 - var77.field3106;
                            int var112 = var77.field3117 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field2878 >= 0) {
                            var115 = (var100 << 8) / (var35.field2883 - var35.field2878);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method4023(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method4023(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method4023(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method4023(var93 + var103 - var50, var104, var115);
                            }
                            var76.method3770(var82, var90 + var103, var107, var35.field2890, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4023(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method4023(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method4023(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4023(var97 + var103 - var62, var104, var115);
                                }
                                var77.method3770(var79, var98 + var103, var110, var38.field2890, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method4036(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method4036(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method4036(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method4036(var93 + var103 - var50, var104);
                            }
                            var76.method3769(var82, var90 + var103, var107, var35.field2890 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4036(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method4036(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method4036(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4036(var97 + var103 - var62, var104);
                                }
                                var77.method3769(var79, var98 + var103, var110, var38.field2890 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("as.aq(Laj;II)V")
    public static final void method780(class28 arg0, int arg1) {
        method1439(arg0.field658, arg0.field632, arg1);
    }

    @ObfuscatedName("bu.by(IIII)V")
    public static final void method1439(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field391 = -1;
            field392 = -1;
            return;
        }
        int var3 = method1180(arg0, arg1, Statics.field2111) - arg2;
        int var4 = arg0 - Statics.field3093;
        int var5 = var3 - Statics.field1759;
        int var6 = arg1 - Statics.field233;
        int var7 = class85.field1436[Statics.field1553];
        int var8 = class85.field1433[Statics.field1553];
        int var9 = class85.field1436[Statics.field149];
        int var10 = class85.field1433[Statics.field149];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field391 = field552 * var11 / var15 + field445 / 2;
            field392 = field552 * var14 / var15 + field551 / 2;
        } else {
            field391 = -1;
            field392 = -1;
        }
    }

    @ObfuscatedName("bb.bj(IIII)I")
    public static final int method1180(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class11.field88[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class11.field99[var5][var3][var4] + class11.field99[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class11.field99[var5][var3][var4 + 1] + class11.field99[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("dx.bg(IIIIIII)V")
    public static final void method1941(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class85.field1436[var6];
            int var12 = class85.field1433[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class85.field1436[var7];
            int var15 = class85.field1433[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field3093 = arg0 - var8;
        Statics.field1759 = arg1 - var9;
        Statics.field233 = arg2 - var10;
        Statics.field1553 = arg3;
        Statics.field149 = arg4;
    }

    @ObfuscatedName("aa.bl(ZI)V")
    public static final void method805(boolean arg0) {
        field426 = arg0;
        if (!field426) {
            int var1 = field330.method2716();
            int var2 = field330.method2879();
            int var3 = field330.method2801();
            Statics.field124 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field124[var4][var5] = field330.method2683();
                }
            }
            Statics.field30 = new int[var3];
            Statics.field1688 = new int[var3];
            Statics.field53 = new int[var3];
            Statics.field1712 = new byte[var3][];
            Statics.field1780 = new byte[var3][];
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
                        Statics.field30[var7] = var10;
                        Statics.field1688[var7] = Statics.field589.method3165("m" + var8 + "_" + var9);
                        Statics.field53[var7] = Statics.field589.method3165("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method1442(var2, var1);
            return;
        }
        int var11 = field330.method2716();
        int var12 = field330.method2716();
        int var13 = field330.method2801();
        field330.method2953();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field330.method2931(1);
                    if (var17 == 1) {
                        field348[var14][var15][var16] = field330.method2931(26);
                    } else {
                        field348[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field330.method2937();
        Statics.field124 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field124[var18][var19] = field330.method2683();
            }
        }
        Statics.field30 = new int[var13];
        Statics.field1688 = new int[var13];
        Statics.field53 = new int[var13];
        Statics.field1712 = new byte[var13][];
        Statics.field1780 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field348[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field30[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field30[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field1688[var20] = Statics.field589.method3165("m" + var29 + "_" + var30);
                            Statics.field53[var20] = Statics.field589.method3165("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method1442(var12, var11);
    }

    @ObfuscatedName("bu.ba(III)V")
    public static final void method1442(int arg0, int arg1) {
        if (Statics.field1529 == arg0 && Statics.field2108 == arg1) {
            return;
        }
        Statics.field1529 = arg0;
        Statics.field2108 = arg1;
        method1883(25);
        method66(class174.field2599, true);
        int var2 = Statics.field221;
        int var3 = Statics.field21;
        Statics.field221 = (arg0 - 6) * 8;
        Statics.field21 = (arg1 - 6) * 8;
        int var4 = Statics.field221 - var2;
        int var5 = Statics.field21 - var3;
        int var6 = Statics.field221;
        int var7 = Statics.field21;
        for (int var8 = 0; var8 < 32768; var8++) {
            class36 var9 = field323[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field657[var10] -= var4;
                    var9.field641[var10] -= var5;
                }
                var9.field658 -= var4 * 128;
                var9.field632 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class24 var12 = field406[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field657[var13] -= var4;
                    var12.field641[var13] -= var5;
                }
                var12.field658 -= var4 * 128;
                var12.field632 -= var5 * 128;
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
                        field416[var24][var20][var21] = field416[var24][var22][var23];
                    } else {
                        field416[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class26 var25 = (class26) field468.method2324(); var25 != null; var25 = (class26) field468.method2331()) {
            var25.field574 -= var4;
            var25.field584 -= var5;
            if (var25.field574 < 0 || var25.field584 < 0 || var25.field574 >= 104 || var25.field584 >= 104) {
                var25.method2313();
            }
        }
        if (field520 != 0) {
            field520 -= var4;
            field521 -= var5;
        }
        field528 = 0;
        field333 = false;
        field515 = -1;
        field419.method2319();
        field463.method2319();
        for (int var26 = 0; var26 < 4; var26++) {
            field346[var26].method2172();
        }
    }

    @ObfuscatedName("eg.bi(ZB)V")
    public static final void method2735(boolean arg0) {
        method225();
        field334++;
        if (field334 < 50 && !arg0) {
            return;
        }
        field334 = 0;
        if (field339 || Statics.field47 == null) {
            return;
        }
        field328.method2936(108);
        try {
            Statics.field47.method2001(field328.field2083, 0, field328.field2085);
            field328.field2085 = 0;
        } catch (IOException var2) {
            field339 = true;
        }
    }

    @ObfuscatedName("o.bf(I)V")
    public static final void method189() {
        method2735(false);
        field341 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1712.length; var1++) {
            if (Statics.field1688[var1] != -1 && Statics.field1712[var1] == null) {
                Statics.field1712[var1] = Statics.field589.method3226(Statics.field1688[var1], 0);
                if (Statics.field1712[var1] == null) {
                    var0 = false;
                    field341++;
                }
            }
            if (Statics.field53[var1] != -1 && Statics.field1780[var1] == null) {
                Statics.field1780[var1] = Statics.field589.method3152(Statics.field53[var1], 0, Statics.field124[var1]);
                if (Statics.field1780[var1] == null) {
                    var0 = false;
                    field341++;
                }
            }
        }
        if (!var0) {
            field345 = 1;
            return;
        }
        field533 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1712.length; var3++) {
            byte[] var4 = Statics.field1780[var3];
            if (var4 != null) {
                int var5 = (Statics.field30[var3] >> 8) * 64 - Statics.field221;
                int var6 = (Statics.field30[var3] & 0xFF) * 64 - Statics.field21;
                if (field426) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class11.method2039(var4, var5, var6);
            }
        }
        if (!var2) {
            field345 = 2;
            return;
        }
        if (field345 != 0) {
            method66(class174.field2599 + class38.field782 + class38.field779 + 100 + "%" + class38.field786, true);
        }
        method225();
        method187();
        method225();
        Statics.field2856.method1679();
        method225();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field346[var7].method2172();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class11.field88[var8][var9][var10] = 0;
                }
            }
        }
        method225();
        class11.method1875();
        int var11 = Statics.field1712.length;
        class32.method1967();
        method2735(true);
        if (!field426) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field30[var12] >> 8) * 64 - Statics.field221;
                int var14 = (Statics.field30[var12] & 0xFF) * 64 - Statics.field21;
                byte[] var15 = Statics.field1712[var12];
                if (var15 != null) {
                    method225();
                    int var16 = Statics.field1529 * 8 - 48;
                    int var17 = Statics.field2108 * 8 - 48;
                    class118[] var18 = field346;
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 64; var20++) {
                            for (int var21 = 0; var21 < 64; var21++) {
                                if (var13 + var20 > 0 && var13 + var20 < 103 && var14 + var21 > 0 && var14 + var21 < 103) {
                                    var18[var19].field1826[var13 + var20][var14 + var21] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class154 var22 = new class154(var15);
                    for (int var23 = 0; var23 < 4; var23++) {
                        for (int var24 = 0; var24 < 64; var24++) {
                            for (int var25 = 0; var25 < 64; var25++) {
                                class11.method118(var22, var23, var13 + var24, var14 + var25, var16, var17, 0);
                            }
                        }
                    }
                }
            }
            for (int var26 = 0; var26 < var11; var26++) {
                int var27 = (Statics.field30[var26] >> 8) * 64 - Statics.field221;
                int var28 = (Statics.field30[var26] & 0xFF) * 64 - Statics.field21;
                byte[] var29 = Statics.field1712[var26];
                if (var29 == null && Statics.field2108 < 800) {
                    method225();
                    class11.method1865(var27, var28, 64, 64);
                }
            }
            method2735(true);
            for (int var30 = 0; var30 < var11; var30++) {
                byte[] var31 = Statics.field1780[var30];
                if (var31 != null) {
                    int var32 = (Statics.field30[var30] >> 8) * 64 - Statics.field221;
                    int var33 = (Statics.field30[var30] & 0xFF) * 64 - Statics.field21;
                    method225();
                    class88 var34 = Statics.field2856;
                    class118[] var35 = field346;
                    class154 var36 = new class154(var31);
                    int var37 = -1;
                    while (true) {
                        int var38 = var36.method2813();
                        if (var38 == 0) {
                            break;
                        }
                        var37 += var38;
                        int var39 = 0;
                        while (true) {
                            int var40 = var36.method2813();
                            if (var40 == 0) {
                                break;
                            }
                            var39 += var40 - 1;
                            int var41 = var39 & 0x3F;
                            int var42 = var39 >> 6 & 0x3F;
                            int var43 = var39 >> 12;
                            int var44 = var36.method2678();
                            int var45 = var44 >> 2;
                            int var46 = var44 & 0x3;
                            int var47 = var32 + var42;
                            int var48 = var33 + var41;
                            if (var47 > 0 && var48 > 0 && var47 < 103 && var48 < 103) {
                                int var49 = var43;
                                if ((class11.field88[1][var47][var48] & 0x2) == 2) {
                                    var49 = var43 - 1;
                                }
                                class118 var50 = null;
                                if (var49 >= 0) {
                                    var50 = var35[var49];
                                }
                                class11.method1440(var43, var47, var48, var37, var46, var45, var34, var50);
                            }
                        }
                    }
                }
            }
        }
        if (field426) {
            for (int var51 = 0; var51 < 4; var51++) {
                method225();
                for (int var52 = 0; var52 < 13; var52++) {
                    for (int var53 = 0; var53 < 13; var53++) {
                        boolean var54 = false;
                        int var55 = field348[var51][var52][var53];
                        if (var55 != -1) {
                            int var56 = var55 >> 24 & 0x3;
                            int var57 = var55 >> 1 & 0x3;
                            int var58 = var55 >> 14 & 0x3FF;
                            int var59 = var55 >> 3 & 0x7FF;
                            int var60 = (var58 / 8 << 8) + var59 / 8;
                            for (int var61 = 0; var61 < Statics.field30.length; var61++) {
                                if (Statics.field30[var61] == var60 && Statics.field1712[var61] != null) {
                                    class11.method1441(Statics.field1712[var61], var51, var52 * 8, var53 * 8, var56, (var58 & 0x7) * 8, (var59 & 0x7) * 8, var57, field346);
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
                                    class11.field99[var62][var63 + var65][var64 + var66] = 0;
                                }
                            }
                            if (var63 > 0) {
                                for (int var67 = 1; var67 < 8; var67++) {
                                    class11.field99[var62][var63][var64 + var67] = class11.field99[var62][var63 - 1][var64 + var67];
                                }
                            }
                            if (var64 > 0) {
                                for (int var68 = 1; var68 < 8; var68++) {
                                    class11.field99[var62][var63 + var68][var64] = class11.field99[var62][var63 + var68][var64 - 1];
                                }
                            }
                            if (var63 > 0 && class11.field99[var62][var63 - 1][var64] != 0) {
                                class11.field99[var62][var63][var64] = class11.field99[var62][var63 - 1][var64];
                            } else if (var64 > 0 && class11.field99[var62][var63][var64 - 1] != 0) {
                                class11.field99[var62][var63][var64] = class11.field99[var62][var63][var64 - 1];
                            } else if (var63 > 0 && var64 > 0 && class11.field99[var62][var63 - 1][var64 - 1] != 0) {
                                class11.field99[var62][var63][var64] = class11.field99[var62][var63 - 1][var64 - 1];
                            }
                        }
                    }
                }
            }
            for (int var69 = 0; var69 < 13; var69++) {
                for (int var70 = 0; var70 < 13; var70++) {
                    int var71 = field348[0][var69][var70];
                    if (var71 == -1) {
                        class11.method1865(var69 * 8, var70 * 8, 8, 8);
                    }
                }
            }
            method2735(true);
            for (int var72 = 0; var72 < 4; var72++) {
                method225();
                for (int var73 = 0; var73 < 13; var73++) {
                    for (int var74 = 0; var74 < 13; var74++) {
                        int var75 = field348[var72][var73][var74];
                        if (var75 != -1) {
                            int var76 = var75 >> 24 & 0x3;
                            int var77 = var75 >> 1 & 0x3;
                            int var78 = var75 >> 14 & 0x3FF;
                            int var79 = var75 >> 3 & 0x7FF;
                            int var80 = (var78 / 8 << 8) + var79 / 8;
                            for (int var81 = 0; var81 < Statics.field30.length; var81++) {
                                if (Statics.field30[var81] == var80 && Statics.field1780[var81] != null) {
                                    Statics.method1904(Statics.field1780[var81], var72, var73 * 8, var74 * 8, var76, (var78 & 0x7) * 8, (var79 & 0x7) * 8, var77, Statics.field2856, field346);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method2735(true);
        method187();
        method225();
        class11.method3147(Statics.field2856, field346);
        method2735(true);
        int var82 = class11.field110;
        if (var82 > Statics.field2111) {
            var82 = Statics.field2111;
        }
        if (var82 < Statics.field2111 - 1) {
            int var83 = Statics.field2111 - 1;
        }
        if (field405) {
            Statics.field2856.method1680(class11.field110);
        } else {
            Statics.field2856.method1680(0);
        }
        for (int var84 = 0; var84 < 104; var84++) {
            for (int var85 = 0; var85 < 104; var85++) {
                method934(var84, var85);
            }
        }
        method225();
        for (class26 var86 = (class26) field468.method2324(); var86 != null; var86 = (class26) field468.method2331()) {
            if (var86.field582 == -1) {
                var86.field583 = 0;
                method2981(var86);
            } else {
                var86.method2313();
            }
        }
        class198.field2901.method2257();
        if (Statics.field882 != null) {
            field328.method2936(167);
            field328.method2666(1057001181);
        }
        if (!field426) {
            int var87 = (Statics.field1529 - 6) / 8;
            int var88 = (Statics.field1529 + 6) / 8;
            int var89 = (Statics.field2108 - 6) / 8;
            int var90 = (Statics.field2108 + 6) / 8;
            for (int var91 = var87 - 1; var91 <= var88 + 1; var91++) {
                for (int var92 = var89 - 1; var92 <= var90 + 1; var92++) {
                    if (var91 < var87 || var91 > var88 || var92 < var89 || var92 > var90) {
                        Statics.field589.method3170("m" + var91 + "_" + var92);
                        Statics.field589.method3170("l" + var91 + "_" + var92);
                    }
                }
            }
        }
        method1883(30);
        method225();
        class11.method2902();
        field328.method2936(202);
        class114.method942();
    }

    @ObfuscatedName("i.bd(II)V")
    public static final void method29(int arg0) {
        int[] var1 = Statics.field2026.field3222;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class11.field88[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field2856.method1712(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class11.field88[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field2856.method1712(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field2026.method4043();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class11.field88[arg0][var10][var9] & 0x18) == 0) {
                    method911(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class11.field88[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method911(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field516 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field2856.method1708(Statics.field2111, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class198.method3471(var14).field2903;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field346[Statics.field2111].field1826;
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
                        field519[field516] = Statics.field178[var15];
                        field517[field516] = var16;
                        field518[field516] = var17;
                        field516++;
                    }
                }
            }
        }
        Statics.field232.method3948();
    }

    @ObfuscatedName("ak.bk(IIIIII)V")
    public static final void method911(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2856.method1748(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2856.method1709(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2026.field3222;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class198 var13 = class198.method3471(var12);
            if (var13.field2927 == -1) {
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
                class223 var14 = Statics.field733[var13.field2927];
                if (var14 != null) {
                    int var15 = (var13.field2913 * 4 - var14.field3205) / 2;
                    int var16 = (var13.field2914 * 4 - var14.field3203) / 2;
                    var14.method3957(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field2914) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2856.method1707(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2856.method1709(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class198 var22 = class198.method3471(var21);
            if (var22.field2927 != -1) {
                class223 var23 = Statics.field733[var22.field2927];
                if (var23 != null) {
                    int var24 = (var22.field2913 * 4 - var23.field3205) / 2;
                    int var25 = (var22.field2914 * 4 - var23.field3203) / 2;
                    var23.method3957(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field2914) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2026.field3222;
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
        int var29 = Statics.field2856.method1708(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class198 var31 = class198.method3471(var30);
        if (var31.field2927 == -1) {
            return;
        }
        class223 var32 = Statics.field733[var31.field2927];
        if (var32 != null) {
            int var33 = (var31.field2913 * 4 - var32.field3205) / 2;
            int var34 = (var31.field2914 * 4 - var32.field3203) / 2;
            var32.method3957(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field2914) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("t.bm(B)V")
    public static final void method43() {
        if (field398 == 114) {
            int var0 = field330.method2842();
            byte var1 = field330.method2851();
            int var2 = field330.method2678();
            int var3 = (var2 >> 4 & 0x7) + Statics.field1531;
            int var4 = (var2 & 0x7) + Statics.field2846;
            int var5 = field330.method2678();
            int var6 = var5 >> 2;
            int var7 = var5 & 0x3;
            int var8 = field349[var6];
            int var9 = field330.method2801();
            byte var10 = field330.method2663();
            int var11 = field330.method2842();
            int var12 = field330.method2801();
            byte var13 = field330.method2851();
            byte var14 = field330.method2710();
            class24 var15;
            if (field407 == var11) {
                var15 = Statics.field85;
            } else {
                var15 = field406[var11];
            }
            if (var15 != null) {
                class198 var16 = class198.method3471(var0);
                int var17;
                int var18;
                if (var7 == 1 || var7 == 3) {
                    var17 = var16.field2914;
                    var18 = var16.field2913;
                } else {
                    var17 = var16.field2913;
                    var18 = var16.field2914;
                }
                int var19 = (var17 >> 1) + var3;
                int var20 = (var17 + 1 >> 1) + var3;
                int var21 = (var18 >> 1) + var4;
                int var22 = (var18 + 1 >> 1) + var4;
                int[][] var23 = class11.field99[Statics.field2111];
                int var24 = var23[var19][var21] + var23[var20][var21] + var23[var19][var22] + var23[var20][var22] >> 2;
                int var25 = (var3 << 7) + (var17 << 6);
                int var26 = (var4 << 7) + (var18 << 6);
                class83 var27 = var16.method3501(var6, var7, var23, var25, var24, var26);
                if (var27 != null) {
                    method938(Statics.field2111, var3, var4, var8, -1, 0, 0, var9 + 1, var12 + 1);
                    var15.field247 = field293 + var9;
                    var15.field240 = field293 + var12;
                    var15.field253 = var27;
                    var15.field250 = var3 * 128 + var17 * 64;
                    var15.field252 = var4 * 128 + var18 * 64;
                    var15.field248 = var24;
                    if (var1 > var10) {
                        byte var28 = var1;
                        var1 = var10;
                        var10 = var28;
                    }
                    if (var14 > var13) {
                        byte var29 = var14;
                        var14 = var13;
                        var13 = var29;
                    }
                    var15.field254 = var1 + var3;
                    var15.field256 = var3 + var10;
                    var15.field255 = var4 + var14;
                    var15.field251 = var4 + var13;
                }
            }
        }
        if (field398 == 136) {
            int var30 = field330.method2729();
            int var31 = (var30 >> 4 & 0x7) + Statics.field1531;
            int var32 = (var30 & 0x7) + Statics.field2846;
            int var33 = field330.method2879();
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                class129 var34 = field416[Statics.field2111][var31][var32];
                if (var34 != null) {
                    for (class44 var35 = (class44) var34.method2324(); var35 != null; var35 = (class44) var34.method2331()) {
                        if ((var33 & 0x7FFF) == var35.field883) {
                            var35.method2313();
                            break;
                        }
                    }
                    if (var34.method2324() == null) {
                        field416[Statics.field2111][var31][var32] = null;
                    }
                    method934(var31, var32);
                }
            }
        } else if (field398 == 193) {
            int var36 = field330.method2678();
            int var37 = (var36 >> 4 & 0x7) + Statics.field1531;
            int var38 = (var36 & 0x7) + Statics.field2846;
            int var39 = var37 + field330.method2679();
            int var40 = var38 + field330.method2679();
            int var41 = field330.method2681();
            int var42 = field330.method2801();
            int var43 = field330.method2678() * 4;
            int var44 = field330.method2678() * 4;
            int var45 = field330.method2801();
            int var46 = field330.method2801();
            int var47 = field330.method2678();
            int var48 = field330.method2678();
            if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104 && var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104 && var42 != 65535) {
                int var49 = var37 * 128 + 64;
                int var50 = var38 * 128 + 64;
                int var51 = var39 * 128 + 64;
                int var52 = var40 * 128 + 64;
                class43 var53 = new class43(var42, Statics.field2111, var49, var50, method1180(var49, var50, Statics.field2111) - var43, field293 + var45, field293 + var46, var47, var48, var41, var44);
                var53.method840(var51, var52, method1180(var51, var52, Statics.field2111) - var44, field293 + var45);
                field463.method2320(var53);
            }
        } else {
            if (field398 == 188) {
                int var54 = field330.method2678();
                int var55 = (var54 >> 4 & 0x7) + Statics.field1531;
                int var56 = (var54 & 0x7) + Statics.field2846;
                int var57 = field330.method2801();
                int var58 = field330.method2678();
                int var59 = var58 >> 4 & 0xF;
                int var60 = var58 & 0x7;
                int var61 = field330.method2678();
                if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
                    int var62 = var59 + 1;
                    if (Statics.field85.field657[0] >= var55 - var62 && Statics.field85.field657[0] <= var55 + var62 && Statics.field85.field641[0] >= var56 - var62 && Statics.field85.field641[0] <= var56 + var62 && field527 != 0 && var60 > 0 && field528 < 50) {
                        field553[field528] = var57;
                        field530[field528] = var60;
                        field531[field528] = var61;
                        field352[field528] = null;
                        field532[field528] = (var55 << 16) + (var56 << 8) + var59;
                        field528++;
                    }
                }
            }
            if (field398 == 94) {
                int var63 = field330.method2678();
                int var64 = (var63 >> 4 & 0x7) + Statics.field1531;
                int var65 = (var63 & 0x7) + Statics.field2846;
                int var66 = field330.method2801();
                int var67 = field330.method2801();
                int var68 = field330.method2801();
                if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104) {
                    class129 var69 = field416[Statics.field2111][var64][var65];
                    if (var69 != null) {
                        for (class44 var70 = (class44) var69.method2324(); var70 != null; var70 = (class44) var69.method2331()) {
                            if ((var66 & 0x7FFF) == var70.field883 && var70.field886 == var67) {
                                var70.field886 = var68;
                                break;
                            }
                        }
                        method934(var64, var65);
                    }
                }
            } else if (field398 == 37) {
                int var71 = field330.method2729();
                int var72 = var71 >> 2;
                int var73 = var71 & 0x3;
                int var74 = field349[var72];
                int var75 = field330.method2707();
                int var76 = (var75 >> 4 & 0x7) + Statics.field1531;
                int var77 = (var75 & 0x7) + Statics.field2846;
                int var78 = field330.method2879();
                if (var76 >= 0 && var77 >= 0 && var76 < 103 && var77 < 103) {
                    if (var74 == 0) {
                        class91 var79 = Statics.field2856.method1751(Statics.field2111, var76, var77);
                        if (var79 != null) {
                            int var80 = var79.field1533 >> 14 & 0x7FFF;
                            if (var72 == 2) {
                                var79.field1538 = new class50(var80, 2, var73 + 4, Statics.field2111, var76, var77, var78, false, var79.field1538);
                                var79.field1534 = new class50(var80, 2, var73 + 1 & 0x3, Statics.field2111, var76, var77, var78, false, var79.field1534);
                            } else {
                                var79.field1538 = new class50(var80, var72, var73, Statics.field2111, var76, var77, var78, false, var79.field1538);
                            }
                        }
                    }
                    if (var74 == 1) {
                        class96 var81 = Statics.field2856.method1702(Statics.field2111, var76, var77);
                        if (var81 != null) {
                            int var82 = var81.field1600 >> 14 & 0x7FFF;
                            if (var72 == 4 || var72 == 5) {
                                var81.field1599 = new class50(var82, 4, var73, Statics.field2111, var76, var77, var78, false, var81.field1599);
                            } else if (var72 == 6) {
                                var81.field1599 = new class50(var82, 4, var73 + 4, Statics.field2111, var76, var77, var78, false, var81.field1599);
                            } else if (var72 == 7) {
                                var81.field1599 = new class50(var82, 4, (var73 + 2 & 0x3) + 4, Statics.field2111, var76, var77, var78, false, var81.field1599);
                            } else if (var72 == 8) {
                                var81.field1599 = new class50(var82, 4, var73 + 4, Statics.field2111, var76, var77, var78, false, var81.field1599);
                                var81.field1602 = new class50(var82, 4, (var73 + 2 & 0x3) + 4, Statics.field2111, var76, var77, var78, false, var81.field1602);
                            }
                        }
                    }
                    if (var74 == 2) {
                        class97 var83 = Statics.field2856.method1703(Statics.field2111, var76, var77);
                        if (var72 == 11) {
                            var72 = 10;
                        }
                        if (var83 != null) {
                            var83.field1610 = new class50(var83.field1616 >> 14 & 0x7FFF, var72, var73, Statics.field2111, var76, var77, var78, false, var83.field1610);
                        }
                    }
                    if (var74 == 3) {
                        class79 var84 = Statics.field2856.method1704(Statics.field2111, var76, var77);
                        if (var84 != null) {
                            var84.field1278 = new class50(var84.field1279 >> 14 & 0x7FFF, 22, var73, Statics.field2111, var76, var77, var78, false, var84.field1278);
                        }
                    }
                }
            } else if (field398 == 97) {
                int var85 = field330.method2678();
                int var86 = var85 >> 2;
                int var87 = var85 & 0x3;
                int var88 = field349[var86];
                int var89 = field330.method2729();
                int var90 = (var89 >> 4 & 0x7) + Statics.field1531;
                int var91 = (var89 & 0x7) + Statics.field2846;
                if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104) {
                    method938(Statics.field2111, var90, var91, var88, -1, var86, var87, 0, -1);
                }
            } else if (field398 == 251) {
                int var92 = field330.method2678();
                int var93 = (var92 >> 4 & 0x7) + Statics.field1531;
                int var94 = (var92 & 0x7) + Statics.field2846;
                int var95 = field330.method2801();
                int var96 = field330.method2678();
                int var97 = field330.method2801();
                if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
                    int var98 = var93 * 128 + 64;
                    int var99 = var94 * 128 + 64;
                    class34 var100 = new class34(var95, Statics.field2111, var98, var99, method1180(var98, var99, Statics.field2111) - var96, var97, field293);
                    field419.method2320(var100);
                }
            } else if (field398 == 21) {
                int var101 = field330.method2801();
                int var102 = field330.method2678();
                int var103 = var102 >> 2;
                int var104 = var102 & 0x3;
                int var105 = field349[var103];
                int var106 = field330.method2678();
                int var107 = (var106 >> 4 & 0x7) + Statics.field1531;
                int var108 = (var106 & 0x7) + Statics.field2846;
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    method938(Statics.field2111, var107, var108, var105, var101, var103, var104, 0, -1);
                }
            } else if (field398 == 206) {
                int var109 = field330.method2716();
                int var110 = field330.method2842();
                int var111 = field330.method2678();
                int var112 = (var111 >> 4 & 0x7) + Statics.field1531;
                int var113 = (var111 & 0x7) + Statics.field2846;
                if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104) {
                    class44 var114 = new class44();
                    var114.field883 = var109;
                    var114.field886 = var110;
                    if (field416[Statics.field2111][var112][var113] == null) {
                        field416[Statics.field2111][var112][var113] = new class129();
                    }
                    field416[Statics.field2111][var112][var113].method2320(var114);
                    method934(var112, var113);
                }
            }
        }
    }

    @ObfuscatedName("av.bv(IIIIIIIIII)V")
    public static final void method938(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class26 var9 = null;
        for (class26 var10 = (class26) field468.method2324(); var10 != null; var10 = (class26) field468.method2331()) {
            if (var10.field588 == arg0 && var10.field574 == arg1 && var10.field584 == arg2 && var10.field572 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class26();
            var9.field588 = arg0;
            var9.field572 = arg3;
            var9.field574 = arg1;
            var9.field584 = arg2;
            method2981(var9);
            field468.method2320(var9);
        }
        var9.field571 = arg4;
        var9.field578 = arg5;
        var9.field579 = arg6;
        var9.field583 = arg7;
        var9.field582 = arg8;
    }

    @ObfuscatedName("fw.be(Lg;I)V")
    public static final void method2981(class26 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field572 == 0) {
            var1 = Statics.field2856.method1748(arg0.field588, arg0.field574, arg0.field584);
        }
        if (arg0.field572 == 1) {
            var1 = Statics.field2856.method1774(arg0.field588, arg0.field574, arg0.field584);
        }
        if (arg0.field572 == 2) {
            var1 = Statics.field2856.method1707(arg0.field588, arg0.field574, arg0.field584);
        }
        if (arg0.field572 == 3) {
            var1 = Statics.field2856.method1708(arg0.field588, arg0.field574, arg0.field584);
        }
        if (var1 != 0) {
            int var5 = Statics.field2856.method1709(arg0.field588, arg0.field574, arg0.field584, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field575 = var2;
        arg0.field577 = var3;
        arg0.field573 = var4;
    }

    @ObfuscatedName("dm.bc(B)V")
    public static final void method1991() {
        for (class26 var0 = (class26) field468.method2324(); var0 != null; var0 = (class26) field468.method2331()) {
            if (var0.field582 > 0) {
                var0.field582--;
            }
            if (var0.field582 == 0) {
                if (var0.field575 >= 0) {
                    int var1 = var0.field575;
                    int var2 = var0.field577;
                    class198 var3 = class198.method3471(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method3512(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method165(var0.field588, var0.field572, var0.field574, var0.field584, var0.field575, var0.field573, var0.field577);
                var0.method2313();
            } else {
                if (var0.field583 > 0) {
                    var0.field583--;
                }
                if (var0.field583 == 0 && var0.field574 >= 1 && var0.field584 >= 1 && var0.field574 <= 102 && var0.field584 <= 102) {
                    if (var0.field571 >= 0) {
                        int var5 = var0.field571;
                        int var6 = var0.field578;
                        class198 var7 = class198.method3471(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method3512(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method165(var0.field588, var0.field572, var0.field574, var0.field584, var0.field571, var0.field579, var0.field578);
                    var0.field583 = -1;
                    if (var0.field575 == var0.field571 && var0.field575 == -1) {
                        var0.method2313();
                    } else if (var0.field575 == var0.field571 && var0.field579 == var0.field573 && var0.field578 == var0.field577) {
                        var0.method2313();
                    }
                }
            }
        }
    }

    @ObfuscatedName("z.bb(IIIIIIII)V")
    public static final void method165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field405 && Statics.field2111 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2856.method1748(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2856.method1774(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2856.method1707(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2856.method1708(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2856.method1709(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2856.method1845(arg0, arg2, arg3);
                class198 var15 = class198.method3471(var12);
                if (var15.field2915 != 0) {
                    field346[arg0].method2183(arg2, arg3, var13, var14, var15.field2916);
                }
            }
            if (arg1 == 1) {
                Statics.field2856.method1697(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2856.method1765(arg0, arg2, arg3);
                class198 var16 = class198.method3471(var12);
                if (var16.field2913 + arg2 > 103 || var16.field2913 + arg3 > 103 || var16.field2914 + arg2 > 103 || var16.field2914 + arg3 > 103) {
                    return;
                }
                if (var16.field2915 != 0) {
                    field346[arg0].method2188(arg2, arg3, var16.field2913, var16.field2914, var14, var16.field2916);
                }
            }
            if (arg1 == 3) {
                Statics.field2856.method1699(arg0, arg2, arg3);
                class198 var17 = class198.method3471(var12);
                if (var17.field2915 == 1) {
                    field346[arg0].method2181(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class11.field88[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class11.method1908(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field2856, field346[arg0]);
    }

    @ObfuscatedName("av.bx(III)V")
    public static final void method934(int arg0, int arg1) {
        class129 var2 = field416[Statics.field2111][arg0][arg1];
        if (var2 == null) {
            Statics.field2856.method1700(Statics.field2111, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class44 var5 = null;
        for (class44 var6 = (class44) var2.method2324(); var6 != null; var6 = (class44) var2.method2331()) {
            class199 var7 = class199.method3070(var6.field883);
            long var8 = (long) var7.field2974;
            if (var7.field2954 == 1) {
                var8 = (long) (var6.field886 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field2856.method1700(Statics.field2111, arg0, arg1);
            return;
        }
        var2.method2322(var5);
        class44 var10 = null;
        class44 var11 = null;
        for (class44 var12 = (class44) var2.method2324(); var12 != null; var12 = (class44) var2.method2331()) {
            if (var5.field883 != var12.field883) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field883 != var12.field883 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field2856.method1854(Statics.field2111, arg0, arg1, method1180(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2111), var5, var13, var10, var11);
    }

    @ObfuscatedName("at.bo(ZS)V")
    public static final void method791(boolean arg0) {
        field409 = 0;
        field326 = 0;
        field330.method2953();
        int var1 = field330.method2931(8);
        if (var1 < field324) {
            for (int var2 = var1; var2 < field324; var2++) {
                field410[++field409 - 1] = field325[var2];
            }
        }
        if (var1 > field324) {
            throw new RuntimeException("");
        }
        field324 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field325[var3];
            class36 var5 = field323[var4];
            int var6 = field330.method2931(1);
            if (var6 == 0) {
                field325[++field324 - 1] = var4;
                var5.field618 = field293;
            } else {
                int var7 = field330.method2931(2);
                if (var7 == 0) {
                    field325[++field324 - 1] = var4;
                    var5.field618 = field293;
                    field394[++field326 - 1] = var4;
                } else if (var7 == 1) {
                    field325[++field324 - 1] = var4;
                    var5.field618 = field293;
                    int var8 = field330.method2931(3);
                    var5.method773(var8, (byte) 1);
                    int var9 = field330.method2931(1);
                    if (var9 == 1) {
                        field394[++field326 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field325[++field324 - 1] = var4;
                    var5.field618 = field293;
                    int var10 = field330.method2931(3);
                    var5.method773(var10, (byte) 2);
                    int var11 = field330.method2931(3);
                    var5.method773(var11, (byte) 2);
                    int var12 = field330.method2931(1);
                    if (var12 == 1) {
                        field394[++field326 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field410[++field409 - 1] = var4;
                }
            }
        }
        while (field330.method2938(field331) >= 27) {
            int var13 = field330.method2931(15);
            if (var13 == 32767) {
                break;
            }
            boolean var17 = false;
            if (field323[var13] == null) {
                field323[var13] = new class36();
                var17 = true;
            }
            class36 var18 = field323[var13];
            field325[++field324 - 1] = var13;
            var18.field618 = field293;
            var18.field759 = class200.method960(field330.method2931(14));
            int var19 = field359[field330.method2931(3)];
            if (var17) {
                var18.field653 = var18.field604 = var19;
            }
            int var20 = field330.method2931(1);
            if (var20 == 1) {
                field394[++field326 - 1] = var13;
            }
            int var21;
            if (arg0) {
                var21 = field330.method2931(8);
                if (var21 > 127) {
                    var21 -= 256;
                }
            } else {
                var21 = field330.method2931(5);
                if (var21 > 15) {
                    var21 -= 32;
                }
            }
            int var22 = field330.method2931(1);
            int var23;
            if (arg0) {
                var23 = field330.method2931(8);
                if (var23 > 127) {
                    var23 -= 256;
                }
            } else {
                var23 = field330.method2931(5);
                if (var23 > 15) {
                    var23 -= 32;
                }
            }
            var18.field635 = var18.field759.field3013;
            var18.field655 = var18.field759.field3039;
            if (var18.field655 == 0) {
                var18.field604 = 0;
            }
            var18.field628 = var18.field759.field3037;
            var18.field625 = var18.field759.field3020;
            var18.field612 = var18.field759.field3021;
            var18.field613 = var18.field759.field3022;
            var18.field606 = var18.field759.field3019;
            var18.field608 = var18.field759.field3017;
            var18.field609 = var18.field759.field3018;
            var18.method771(Statics.field85.field657[0] + var23, Statics.field85.field641[0] + var21, var22 == 1);
        }
        field330.method2937();
        method3719();
        for (int var14 = 0; var14 < field409; var14++) {
            int var15 = field410[var14];
            if (field293 != field323[var15].field618) {
                field323[var15].field759 = null;
                field323[var15] = null;
            }
        }
        if (field331 != field330.field2085) {
            throw new RuntimeException(field330.field2085 + class38.field777 + field331);
        }
        for (int var16 = 0; var16 < field324; var16++) {
            if (field323[field325[var16]] == null) {
                throw new RuntimeException(var16 + class38.field777 + field324);
            }
        }
    }

    @ObfuscatedName("gc.bq(I)V")
    public static final void method3719() {
        for (int var0 = 0; var0 < field326; var0++) {
            int var1 = field394[var0];
            class36 var2 = field323[var1];
            int var3 = field330.method2678();
            if ((var3 & 0x40) != 0) {
                var2.field615 = field330.method2686();
                var2.field607 = 100;
            }
            if ((var3 & 0x10) != 0) {
                var2.field759 = class200.method960(field330.method2801());
                var2.field635 = var2.field759.field3013;
                var2.field655 = var2.field759.field3039;
                var2.field628 = var2.field759.field3037;
                var2.field625 = var2.field759.field3020;
                var2.field612 = var2.field759.field3021;
                var2.field613 = var2.field759.field3022;
                var2.field606 = var2.field759.field3019;
                var2.field608 = var2.field759.field3017;
                var2.field609 = var2.field759.field3018;
            }
            if ((var3 & 0x2) != 0) {
                int var4 = field330.method2879();
                int var5 = field330.method2716();
                int var6 = var2.field658 - (var4 - Statics.field221 - Statics.field221) * 64;
                int var7 = var2.field632 - (var5 - Statics.field21 - Statics.field21) * 64;
                if (var6 != 0 || var7 != 0) {
                    var2.field611 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field603 = field330.method2801();
                if (var2.field603 == 65535) {
                    var2.field603 = -1;
                }
            }
            if ((var3 & 0x8) != 0) {
                var2.field639 = field330.method2716();
                int var8 = field330.method2837();
                var2.field643 = var8 >> 16;
                var2.field642 = (var8 & 0xFFFF) + field293;
                var2.field640 = 0;
                var2.field629 = 0;
                if (var2.field642 > field293) {
                    var2.field640 = -1;
                }
                if (var2.field639 == 65535) {
                    var2.field639 = -1;
                }
            }
            if ((var3 & 0x1) != 0) {
                int var9 = field330.method2716();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = field330.method2706();
                if (var2.field605 == var9 && var9 != -1) {
                    int var11 = class202.method262(var9).field3063;
                    if (var11 == 1) {
                        var2.field619 = 0;
                        var2.field636 = 0;
                        var2.field637 = var10;
                        var2.field638 = 0;
                    }
                    if (var11 == 2) {
                        var2.field638 = 0;
                    }
                } else if (var9 == -1 || var2.field605 == -1 || class202.method262(var9).field3070 >= class202.method262(var2.field605).field3070) {
                    var2.field605 = var9;
                    var2.field619 = 0;
                    var2.field636 = 0;
                    var2.field637 = var10;
                    var2.field638 = 0;
                    var2.field661 = var2.field656;
                }
            }
            if ((var3 & 0x4) != 0) {
                int var12 = field330.method2678();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = field330.method2813();
                        if (var17 == 32767) {
                            var17 = field330.method2813();
                            var15 = field330.method2813();
                            var14 = field330.method2813();
                            var16 = field330.method2813();
                        } else if (var17 == 32766) {
                            var17 = -1;
                        } else {
                            var15 = field330.method2813();
                        }
                        int var18 = field330.method2813();
                        var2.method637(var17, var15, var14, var16, field293, var18);
                    }
                }
                int var19 = field330.method2678();
                if (var19 > 0) {
                    for (int var20 = 0; var20 < var19; var20++) {
                        int var21 = field330.method2813();
                        int var22 = field330.method2813();
                        if (var22 == 32767) {
                            var2.method626(var21);
                        } else {
                            int var23 = field330.method2813();
                            int var24 = field330.method2706();
                            int var25 = var22 > 0 ? field330.method2707() : var24;
                            var2.method625(var21, field293, var22, var23, var24, var25);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("m.bw(Lj;IIBI)V")
    public static final void method204(class24 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field657[0];
        int var5 = arg0.field641[0];
        int var6 = arg0.method247();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var9 = arg0.method247();
        field565.field1855 = arg1;
        field565.field1850 = arg2;
        field565.field1851 = 1;
        field565.field1852 = 1;
        class23 var10 = field565;
        int var11 = class119.method2023(var4, var5, var9, var10, field346[arg0.field261], true, field566, field567);
        if (var11 >= 1) {
            for (int var12 = 0; var12 < var11 - 1; var12++) {
                arg0.method239(field566[var12], field567[var12], arg3);
            }
        }
    }

    @ObfuscatedName("gu.bt(B)V")
    public static void method3364() {
        field362 = 0;
        field433 = -1;
        field424 = false;
        field366[0] = class174.field2592;
        field431[0] = "";
        field465[0] = 1006;
        field362 = 1;
    }

    @ObfuscatedName("es.bn(III)V")
    public static final void method2579(int arg0, int arg1) {
        if (field362 < 2 && field439 == 0 && !field550) {
            return;
        }
        int var2 = method111();
        String var3;
        if (field439 == 1 && field362 < 2) {
            var3 = class174.field2503 + class174.field2513 + field440 + " " + class38.field781;
        } else if (field550 && field362 < 2) {
            var3 = field329 + class174.field2513 + field351 + " " + class38.field781;
        } else {
            var3 = method1132(var2);
        }
        if (field362 > 2) {
            var3 = var3 + class38.method3310(16777215) + " " + '/' + " " + (field362 - 2) + class174.field2507;
        }
        Statics.field171.method3776(var3, arg0 + 4, arg1 + 15, 16777215, 0, field293 / 1000);
    }

    @ObfuscatedName("k.bp(B)V")
    public static final void method67() {
        int var0 = Statics.field220;
        int var1 = Statics.field1898;
        int var2 = Statics.field774;
        int var3 = Statics.field3147;
        int var4 = 6116423;
        class220.method3884(var0, var1, var2, var3, var4);
        class220.method3884(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class220.method3889(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field171.method3769(class174.field2506, var0 + 3, var1 + 14, var4, -1);
        int var5 = class116.field1803;
        int var6 = class116.field1802 * 603852017;
        for (int var7 = 0; var7 < field362; var7++) {
            int var8 = (field362 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field171.method3769(method1132(var7), var0 + 3, var8, var9, 0);
        }
        Statics.method114(Statics.field220, Statics.field1898, Statics.field774, Statics.field3147);
    }

    @ObfuscatedName("dq.bz(IIIII)V")
    public static final void method1968(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field545; var4++) {
            if (field496[var4] + field494[var4] > arg0 && field494[var4] < arg0 + arg2 && field497[var4] + field495[var4] > arg1 && field495[var4] < arg1 + arg3) {
                field491[var4] = true;
            }
        }
    }

    @ObfuscatedName("l.bu(I)V")
    public static final void method15() {
        method72();
        if (Statics.field51 != null || field459 != null) {
            return;
        }
        int var11;
        int var13;
        int var14;
        label217: {
            int var0 = class116.field1797;
            if (field424) {
                if (var0 != 1 && (Statics.field770 || var0 != 4)) {
                    int var1 = class116.field1803;
                    int var2 = class116.field1802 * 603852017;
                    if (var1 < Statics.field220 - 10 || var1 > Statics.field774 + Statics.field220 + 10 || var2 < Statics.field1898 - 10 || var2 > Statics.field3147 + Statics.field1898 + 10) {
                        field424 = false;
                        method1968(Statics.field220, Statics.field1898, Statics.field774, Statics.field3147);
                    }
                }
                if (var0 == 1 || !Statics.field770 && var0 == 4) {
                    int var3 = Statics.field220;
                    int var4 = Statics.field1898;
                    int var5 = Statics.field774;
                    int var6 = class116.field1809;
                    int var7 = class116.field1799;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field362; var9++) {
                        int var10 = (field362 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1) {
                        method3436(var8);
                    }
                    field424 = false;
                    method1968(Statics.field220, Statics.field1898, Statics.field774, Statics.field3147);
                }
            } else {
                var11 = method111();
                if ((var0 == 1 || !Statics.field770 && var0 == 4) && var11 >= 0) {
                    int var12 = field465[var11];
                    if (var12 == 39 || var12 == 40 || var12 == 41 || var12 == 42 || var12 == 43 || var12 == 33 || var12 == 34 || var12 == 35 || var12 == 36 || var12 == 37 || var12 == 38 || var12 == 1005) {
                        var13 = field355[var11];
                        var14 = field522[var11];
                        class170 var15 = class170.method2518(var14);
                        if (class171.method257(method113(var15))) {
                            break label217;
                        }
                        int var16 = method113(var15);
                        boolean var17 = (var16 >> 29 & 0x1) != 0;
                        if (var17) {
                            break label217;
                        }
                    }
                }
                if (var0 == 1 || !Statics.field770 && var0 == 4) {
                    label223: {
                        label143: {
                            if (field423 == 1 && field362 > 2) {
                                boolean var19;
                                if (field362 <= 0) {
                                    var19 = false;
                                } else if (field434 && class106.field1701[81] && field433 != -1) {
                                    var19 = true;
                                } else {
                                    var19 = false;
                                }
                                if (!var19) {
                                    break label143;
                                }
                            }
                            if (!method1387(var11)) {
                                break label223;
                            }
                        }
                        var0 = 2;
                    }
                }
                if ((var0 == 1 || !Statics.field770 && var0 == 4) && field362 > 0) {
                    method3436(var11);
                }
                if (var0 == 2 && field362 > 0) {
                    method3072(class116.field1809, class116.field1799);
                }
            }
            return;
        }
        if (Statics.field51 != null && !field403) {
            int var18 = method111();
            if (field423 != 1 && !method1387(var18) && field362 > 0) {
                method1161(field400, field492);
            }
        }
        field403 = false;
        field404 = 0;
        if (Statics.field51 != null) {
            method1874(Statics.field51);
        }
        Statics.field51 = class170.method2518(var14);
        field399 = var13;
        field400 = class116.field1809;
        field492 = class116.field1799;
        if (var11 >= 0) {
            Statics.field2699 = new class39();
            Statics.field2699.field798 = field355[var11];
            Statics.field2699.field791 = field522[var11];
            Statics.field2699.field792 = field465[var11];
            Statics.field2699.field793 = field429[var11];
            Statics.field2699.field794 = field366[var11];
        }
        method1874(Statics.field51);
    }

    @ObfuscatedName("fp.bh(IIB)V")
    public static final void method3072(int arg0, int arg1) {
        int var2 = Statics.field171.method3764(class174.field2506);
        for (int var3 = 0; var3 < field362; var3++) {
            int var4 = Statics.field171.method3764(method1132(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field362 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field22) {
            var6 = Statics.field22 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field217) {
            var7 = Statics.field217 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field2856.method1715(Statics.field2111, arg0, arg1, false);
        field424 = true;
        Statics.field220 = var6;
        Statics.field1898 = var7;
        Statics.field774 = var2;
        Statics.field3147 = field362 * 15 + 22;
    }

    @ObfuscatedName("bp.br(II)Z")
    public static final boolean method1387(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field465[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("gs.cm(II)V")
    public static final void method3436(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field355[arg0];
        int var2 = field522[arg0];
        int var3 = field465[arg0];
        int var4 = field429[arg0];
        String var5 = field366[arg0];
        String var6 = field431[arg0];
        method860(var1, var2, var3, var4, var5, var6, class116.field1809, class116.field1799);
    }

    @ObfuscatedName("al.cr(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method860(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 31) {
            field328.method2936(254);
            field328.method2664(Statics.field1733);
            field328.method2666(arg1);
            field328.method2712(arg0);
            field328.method2712(Statics.field1285);
            field328.method2721(Statics.field43);
            field328.method2664(arg3);
            field397 = 0;
            Statics.field1645 = class170.method2518(arg1);
            field309 = arg0;
        }
        if (arg2 == 46) {
            class24 var8 = field406[arg3];
            if (var8 != null) {
                field393 = arg6;
                field525 = arg7;
                field327 = 2;
                field395 = 0;
                field520 = arg0;
                field521 = arg1;
                field328.method2936(46);
                field328.method2832(class106.field1701[82] ? 1 : 0);
                field328.method2712(arg3);
            }
        }
        if (arg2 == 14) {
            class24 var9 = field406[arg3];
            if (var9 != null) {
                field393 = arg6;
                field525 = arg7;
                field327 = 2;
                field395 = 0;
                field520 = arg0;
                field521 = arg1;
                field328.method2936(1);
                field328.method2832(class106.field1701[82] ? 1 : 0);
                field328.method2712(arg3);
                field328.method2664(Statics.field1285);
                field328.method2664(Statics.field1733);
                field328.method2721(Statics.field43);
            }
        }
        if (arg2 == 36) {
            field328.method2936(253);
            field328.method2721(arg1);
            field328.method2712(arg0);
            field328.method2709(arg3);
            field397 = 0;
            Statics.field1645 = class170.method2518(arg1);
            field309 = arg0;
        }
        if (arg2 == 1) {
            field393 = arg6;
            field525 = arg7;
            field327 = 2;
            field395 = 0;
            field520 = arg0;
            field521 = arg1;
            field328.method2936(140);
            field328.method2711(Statics.field1285);
            field328.method2664(arg3 >> 14 & 0x7FFF);
            field328.method2830(Statics.field43);
            field328.method2702(class106.field1701[82] ? 1 : 0);
            field328.method2711(Statics.field21 + arg1);
            field328.method2709(Statics.field221 + arg0);
            field328.method2664(Statics.field1733);
        }
        if (arg2 == 12) {
            class36 var10 = field323[arg3];
            if (var10 != null) {
                field393 = arg6;
                field525 = arg7;
                field327 = 2;
                field395 = 0;
                field520 = arg0;
                field521 = arg1;
                field328.method2936(189);
                field328.method2664(arg3);
                field328.method2870(class106.field1701[82] ? 1 : 0);
            }
        }
        if (arg2 == 29) {
            field328.method2936(54);
            field328.method2666(arg1);
            class170 var11 = class170.method2518(arg1);
            if (var11.field2309 != null && var11.field2309[0][0] == 5) {
                int var12 = var11.field2309[0][1];
                if (class166.field2156[var12] != var11.field2193[0]) {
                    class166.field2156[var12] = var11.field2193[0];
                    method769(var12);
                }
            }
        }
        if (arg2 == 42) {
            field328.method2936(60);
            field328.method2720(arg1);
            field328.method2712(arg0);
            field328.method2664(arg3);
            field397 = 0;
            Statics.field1645 = class170.method2518(arg1);
            field309 = arg0;
        }
        if (arg2 == 10) {
            class36 var13 = field323[arg3];
            if (var13 != null) {
                field393 = arg6;
                field525 = arg7;
                field327 = 2;
                field395 = 0;
                field520 = arg0;
                field521 = arg1;
                field328.method2936(193);
                field328.method2832(class106.field1701[82] ? 1 : 0);
                field328.method2664(arg3);
            }
        }
        if (arg2 == 51) {
            class24 var14 = field406[arg3];
            if (var14 != null) {
                field393 = arg6;
                field525 = arg7;
                field327 = 2;
                field395 = 0;
                field520 = arg0;
                field521 = arg1;
                field328.method2936(133);
                field328.method2711(arg3);
                field328.method2702(class106.field1701[82] ? 1 : 0);
            }
        }
        if (arg2 == 1005) {
            class170 var15 = class170.method2518(arg1);
            if (var15 == null || var15.field2316[arg0] < 100000) {
                field328.method2936(4);
                field328.method2712(arg3);
            } else {
                class48.method2520(27, "", var15.field2316[arg0] + " x " + class199.method3070(arg3).field2962);
            }
            field397 = 0;
            Statics.field1645 = class170.method2518(arg1);
            field309 = arg0;
        }
        if (arg2 == 19) {
            field393 = arg6;
            field525 = arg7;
            field327 = 2;
            field395 = 0;
            field520 = arg0;
            field521 = arg1;
            field328.method2936(8);
            field328.method2711(Statics.field21 + arg1);
            field328.method2664(arg3);
            field328.method2782(class106.field1701[82] ? 1 : 0);
            field328.method2711(Statics.field221 + arg0);
        }
        if (arg2 == 7) {
            class36 var16 = field323[arg3];
            if (var16 != null) {
                field393 = arg6;
                field525 = arg7;
                field327 = 2;
                field395 = 0;
                field520 = arg0;
                field521 = arg1;
                field328.method2936(195);
                field328.method2709(Statics.field1285);
                field328.method2664(Statics.field1733);
                field328.method2712(arg3);
                field328.method2721(Statics.field43);
                field328.method2870(class106.field1701[82] ? 1 : 0);
            }
        }
        if (arg2 == 30 && field547 == null) {
            field328.method2936(192);
            field328.method2666(arg1);
            field328.method2712(arg0);
            field547 = class170.method2178(arg1, arg0);
            method1874(field547);
        }
        if (arg2 == 22) {
            field393 = arg6;
            field525 = arg7;
            field327 = 2;
            field395 = 0;
            field520 = arg0;
            field521 = arg1;
            field328.method2936(152);
            field328.method2712(Statics.field221 + arg0);
            field328.method2711(arg3);
            field328.method2709(Statics.field21 + arg1);
            field328.method2782(class106.field1701[82] ? 1 : 0);
        }
        if (arg2 == 25) {
            class170 var17 = class170.method2178(arg1, arg0);
            if (var17 != null) {
                method259();
                method2028(arg1, arg0, class171.method11(method113(var17)), var17.field2317);
                field439 = 0;
                field329 = Statics.method790(var17);
                if (field329 == null) {
                    field329 = "Null";
                }
                if (var17.field2227) {
                    field351 = var17.field2270 + class38.method3310(16777215);
                } else {
                    field351 = class38.method3310(65280) + var17.field2313 + class38.method3310(16777215);
                }
            }
            return;
        }
        if (arg2 == 35) {
            field328.method2936(215);
            field328.method2720(arg1);
            field328.method2709(arg0);
            field328.method2664(arg3);
            field397 = 0;
            Statics.field1645 = class170.method2518(arg1);
            field309 = arg0;
        }
        if (arg2 == 17) {
            field393 = arg6;
            field525 = arg7;
            field327 = 2;
            field395 = 0;
            field520 = arg0;
            field521 = arg1;
            field328.method2936(83);
            field328.method2712(Statics.field221 + arg0);
            field328.method2666(Statics.field2332);
            field328.method2711(Statics.field21 + arg1);
            field328.method2711(arg3);
            field328.method2709(field442);
            field328.method2702(class106.field1701[82] ? 1 : 0);
        }
        if (arg2 == 2) {
            field393 = arg6;
            field525 = arg7;
            field327 = 2;
            field395 = 0;
            field520 = arg0;
            field521 = arg1;
            field328.method2936(13);
            field328.method2832(class106.field1701[82] ? 1 : 0);
            field328.method2664(Statics.field221 + arg0);
            field328.method2711(Statics.field21 + arg1);
            field328.method2712(arg3 >> 14 & 0x7FFF);
            field328.method2720(Statics.field2332);
            field328.method2712(field442);
        }
        if (arg2 == 24) {
            class170 var18 = class170.method2518(arg1);
            boolean var19 = true;
            if (var18.field2201 > 0) {
                var19 = method761(var18);
            }
            if (var19) {
                field328.method2936(54);
                field328.method2666(arg1);
            }
        }
        if (arg2 == 41) {
            field328.method2936(68);
            field328.method2664(arg3);
            field328.method2830(arg1);
            field328.method2711(arg0);
            field397 = 0;
            Statics.field1645 = class170.method2518(arg1);
            field309 = arg0;
        }
        if (arg2 == 8) {
            class36 var20 = field323[arg3];
            if (var20 != null) {
                field393 = arg6;
                field525 = arg7;
                field327 = 2;
                field395 = 0;
                field520 = arg0;
                field521 = arg1;
                field328.method2936(161);
                field328.method2782(class106.field1701[82] ? 1 : 0);
                field328.method2711(field442);
                field328.method2711(arg3);
                field328.method2721(Statics.field2332);
            }
        }
        if (arg2 == 4) {
            field393 = arg6;
            field525 = arg7;
            field327 = 2;
            field395 = 0;
            field520 = arg0;
            field521 = arg1;
            field328.method2936(200);
            field328.method2709(Statics.field221 + arg0);
            field328.method2870(class106.field1701[82] ? 1 : 0);
            field328.method2664(arg3 >> 14 & 0x7FFF);
            field328.method2712(Statics.field21 + arg1);
        }
        if (arg2 == 43) {
            field328.method2936(101);
            field328.method2720(arg1);
            field328.method2711(arg0);
            field328.method2712(arg3);
            field397 = 0;
            Statics.field1645 = class170.method2518(arg1);
            field309 = arg0;
        }
        if (arg2 == 21) {
            field393 = arg6;
            field525 = arg7;
            field327 = 2;
            field395 = 0;
            field520 = arg0;
            field521 = arg1;
            field328.method2936(134);
            field328.method2712(arg3);
            field328.method2832(class106.field1701[82] ? 1 : 0);
            field328.method2711(Statics.field21 + arg1);
            field328.method2709(Statics.field221 + arg0);
        }
        if (arg2 == 3) {
            field393 = arg6;
            field525 = arg7;
            field327 = 2;
            field395 = 0;
            field520 = arg0;
            field521 = arg1;
            field328.method2936(232);
            field328.method2870(class106.field1701[82] ? 1 : 0);
            field328.method2664(arg3 >> 14 & 0x7FFF);
            field328.method2712(Statics.field221 + arg0);
            field328.method2709(Statics.field21 + arg1);
        }
        if (arg2 == 1004) {
            field393 = arg6;
            field525 = arg7;
            field327 = 2;
            field395 = 0;
            field328.method2936(4);
            field328.method2712(arg3);
        }
        if (arg2 == 34) {
            field328.method2936(5);
            field328.method2709(arg0);
            field328.method2711(arg3);
            field328.method2721(arg1);
            field397 = 0;
            Statics.field1645 = class170.method2518(arg1);
            field309 = arg0;
        }
        if (arg2 == 58) {
            class170 var21 = class170.method2178(arg1, arg0);
            if (var21 != null) {
                field328.method2936(236);
                field328.method2709(var21.field2317);
                field328.method2664(field442);
                field328.method2666(arg1);
                field328.method2830(Statics.field2332);
                field328.method2664(arg0);
                field328.method2712(field443);
            }
        }
        if (arg2 == 13) {
            class36 var22 = field323[arg3];
            if (var22 != null) {
                field393 = arg6;
                field525 = arg7;
                field327 = 2;
                field395 = 0;
                field520 = arg0;
                field521 = arg1;
                field328.method2936(245);
                field328.method2711(arg3);
                field328.method2702(class106.field1701[82] ? 1 : 0);
            }
        }
        if (arg2 == 23) {
            if (field424) {
                Statics.field2856.method1681();
            } else {
                Statics.field2856.method1715(Statics.field2111, arg0, arg1, true);
            }
        }
        if (arg2 == 11) {
            class36 var23 = field323[arg3];
            if (var23 != null) {
                field393 = arg6;
                field525 = arg7;
                field327 = 2;
                field395 = 0;
                field520 = arg0;
                field521 = arg1;
                field328.method2936(126);
                field328.method2711(arg3);
                field328.method2832(class106.field1701[82] ? 1 : 0);
            }
        }
        if (arg2 == 32) {
            field328.method2936(217);
            field328.method2712(field442);
            field328.method2712(arg3);
            field328.method2720(arg1);
            field328.method2712(arg0);
            field328.method2720(Statics.field2332);
            field397 = 0;
            Statics.field1645 = class170.method2518(arg1);
            field309 = arg0;
        }
        if (arg2 == 45) {
            class24 var24 = field406[arg3];
            if (var24 != null) {
                field393 = arg6;
                field525 = arg7;
                field327 = 2;
                field395 = 0;
                field520 = arg0;
                field521 = arg1;
                field328.method2936(136);
                field328.method2702(class106.field1701[82] ? 1 : 0);
                field328.method2711(arg3);
            }
        }
        if (arg2 == 44) {
            class24 var25 = field406[arg3];
            if (var25 != null) {
                field393 = arg6;
                field525 = arg7;
                field327 = 2;
                field395 = 0;
                field520 = arg0;
                field521 = arg1;
                field328.method2936(69);
                field328.method2832(class106.field1701[82] ? 1 : 0);
                field328.method2712(arg3);
            }
        }
        if (arg2 == 39) {
            field328.method2936(118);
            field328.method2712(arg3);
            field328.method2720(arg1);
            field328.method2711(arg0);
            field397 = 0;
            Statics.field1645 = class170.method2518(arg1);
            field309 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class170 var26 = class170.method2178(arg1, arg0);
            if (var26 != null) {
                int var27 = var26.field2317;
                class170 var28 = class170.method2178(arg1, arg0);
                if (var28 != null) {
                    if (var28.field2289 != null) {
                        class19 var29 = new class19();
                        var29.field186 = var28;
                        var29.field191 = arg3;
                        var29.field195 = arg5;
                        var29.field198 = var28.field2289;
                        class33.method1885(var29);
                    }
                    boolean var30 = true;
                    if (var28.field2201 > 0) {
                        var30 = method761(var28);
                    }
                    if (var30 && class171.method3313(method113(var28), arg3 - 1)) {
                        if (arg3 == 1) {
                            field328.method2936(212);
                            field328.method2666(arg1);
                            field328.method2664(arg0);
                            field328.method2664(var27);
                        }
                        if (arg3 == 2) {
                            field328.method2936(36);
                            field328.method2666(arg1);
                            field328.method2664(arg0);
                            field328.method2664(var27);
                        }
                        if (arg3 == 3) {
                            field328.method2936(20);
                            field328.method2666(arg1);
                            field328.method2664(arg0);
                            field328.method2664(var27);
                        }
                        if (arg3 == 4) {
                            field328.method2936(130);
                            field328.method2666(arg1);
                            field328.method2664(arg0);
                            field328.method2664(var27);
                        }
                        if (arg3 == 5) {
                            field328.method2936(66);
                            field328.method2666(arg1);
                            field328.method2664(arg0);
                            field328.method2664(var27);
                        }
                        if (arg3 == 6) {
                            field328.method2936(40);
                            field328.method2666(arg1);
                            field328.method2664(arg0);
                            field328.method2664(var27);
                        }
                        if (arg3 == 7) {
                            field328.method2936(146);
                            field328.method2666(arg1);
                            field328.method2664(arg0);
                            field328.method2664(var27);
                        }
                        if (arg3 == 8) {
                            field328.method2936(3);
                            field328.method2666(arg1);
                            field328.method2664(arg0);
                            field328.method2664(var27);
                        }
                        if (arg3 == 9) {
                            field328.method2936(147);
                            field328.method2666(arg1);
                            field328.method2664(arg0);
                            field328.method2664(var27);
                        }
                        if (arg3 == 10) {
                            field328.method2936(123);
                            field328.method2666(arg1);
                            field328.method2664(arg0);
                            field328.method2664(var27);
                        }
                    }
                }
            }
        }
        if (arg2 == 5) {
            field393 = arg6;
            field525 = arg7;
            field327 = 2;
            field395 = 0;
            field520 = arg0;
            field521 = arg1;
            field328.method2936(157);
            field328.method2712(Statics.field21 + arg1);
            field328.method2711(arg3 >> 14 & 0x7FFF);
            field328.method2870(class106.field1701[82] ? 1 : 0);
            field328.method2709(Statics.field221 + arg0);
        }
        if (arg2 == 1001) {
            field393 = arg6;
            field525 = arg7;
            field327 = 2;
            field395 = 0;
            field520 = arg0;
            field521 = arg1;
            field328.method2936(11);
            field328.method2832(class106.field1701[82] ? 1 : 0);
            field328.method2712(arg3 >> 14 & 0x7FFF);
            field328.method2709(Statics.field221 + arg0);
            field328.method2664(Statics.field21 + arg1);
        }
        if (arg2 == 47) {
            class24 var31 = field406[arg3];
            if (var31 != null) {
                field393 = arg6;
                field525 = arg7;
                field327 = 2;
                field395 = 0;
                field520 = arg0;
                field521 = arg1;
                field328.method2936(225);
                field328.method2664(arg3);
                field328.method2870(class106.field1701[82] ? 1 : 0);
            }
        }
        if (arg2 == 49) {
            class24 var32 = field406[arg3];
            if (var32 != null) {
                field393 = arg6;
                field525 = arg7;
                field327 = 2;
                field395 = 0;
                field520 = arg0;
                field521 = arg1;
                field328.method2936(58);
                field328.method2709(arg3);
                field328.method2702(class106.field1701[82] ? 1 : 0);
            }
        }
        if (arg2 == 6) {
            field393 = arg6;
            field525 = arg7;
            field327 = 2;
            field395 = 0;
            field520 = arg0;
            field521 = arg1;
            field328.method2936(196);
            field328.method2712(arg3 >> 14 & 0x7FFF);
            field328.method2702(class106.field1701[82] ? 1 : 0);
            field328.method2709(Statics.field221 + arg0);
            field328.method2664(Statics.field21 + arg1);
        }
        if (arg2 == 26) {
            field328.method2936(6);
            for (class18 var33 = (class18) field447.method2275(); var33 != null; var33 = (class18) field447.method2276()) {
                if (var33.field180 == 0 || var33.field180 == 3) {
                    method679(var33, true);
                }
            }
            if (field547 != null) {
                method1874(field547);
                field547 = null;
            }
        }
        if (arg2 == 15) {
            class24 var34 = field406[arg3];
            if (var34 != null) {
                field393 = arg6;
                field525 = arg7;
                field327 = 2;
                field395 = 0;
                field520 = arg0;
                field521 = arg1;
                field328.method2936(112);
                field328.method2664(arg3);
                field328.method2782(class106.field1701[82] ? 1 : 0);
                field328.method2830(Statics.field2332);
                field328.method2709(field442);
            }
        }
        if (arg2 == 50) {
            class24 var35 = field406[arg3];
            if (var35 != null) {
                field393 = arg6;
                field525 = arg7;
                field327 = 2;
                field395 = 0;
                field520 = arg0;
                field521 = arg1;
                field328.method2936(53);
                field328.method2702(class106.field1701[82] ? 1 : 0);
                field328.method2711(arg3);
            }
        }
        if (arg2 == 18) {
            field393 = arg6;
            field525 = arg7;
            field327 = 2;
            field395 = 0;
            field520 = arg0;
            field521 = arg1;
            field328.method2936(191);
            field328.method2711(Statics.field221 + arg0);
            field328.method2702(class106.field1701[82] ? 1 : 0);
            field328.method2664(Statics.field21 + arg1);
            field328.method2712(arg3);
        }
        if (arg2 == 1002) {
            field393 = arg6;
            field525 = arg7;
            field327 = 2;
            field395 = 0;
            field328.method2936(92);
            field328.method2709(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 9) {
            class36 var36 = field323[arg3];
            if (var36 != null) {
                field393 = arg6;
                field525 = arg7;
                field327 = 2;
                field395 = 0;
                field520 = arg0;
                field521 = arg1;
                field328.method2936(102);
                field328.method2870(class106.field1701[82] ? 1 : 0);
                field328.method2711(arg3);
            }
        }
        if (arg2 == 40) {
            field328.method2936(160);
            field328.method2712(arg3);
            field328.method2711(arg0);
            field328.method2666(arg1);
            field397 = 0;
            Statics.field1645 = class170.method2518(arg1);
            field309 = arg0;
        }
        if (arg2 == 48) {
            class24 var37 = field406[arg3];
            if (var37 != null) {
                field393 = arg6;
                field525 = arg7;
                field327 = 2;
                field395 = 0;
                field520 = arg0;
                field521 = arg1;
                field328.method2936(111);
                field328.method2702(class106.field1701[82] ? 1 : 0);
                field328.method2711(arg3);
            }
        }
        if (arg2 == 37) {
            field328.method2936(176);
            field328.method2712(arg3);
            field328.method2721(arg1);
            field328.method2711(arg0);
            field397 = 0;
            Statics.field1645 = class170.method2518(arg1);
            field309 = arg0;
        }
        if (arg2 == 1003) {
            field393 = arg6;
            field525 = arg7;
            field327 = 2;
            field395 = 0;
            class36 var38 = field323[arg3];
            if (var38 != null) {
                class200 var39 = var38.field759;
                if (var39.field3036 != null) {
                    var39 = var39.method3602();
                }
                if (var39 != null) {
                    field328.method2936(19);
                    field328.method2711(var39.field3027);
                }
            }
        }
        if (arg2 == 20) {
            field393 = arg6;
            field525 = arg7;
            field327 = 2;
            field395 = 0;
            field520 = arg0;
            field521 = arg1;
            field328.method2936(137);
            field328.method2664(Statics.field221 + arg0);
            field328.method2711(arg3);
            field328.method2832(class106.field1701[82] ? 1 : 0);
            field328.method2709(Statics.field21 + arg1);
        }
        if (arg2 == 28) {
            field328.method2936(54);
            field328.method2666(arg1);
            class170 var40 = class170.method2518(arg1);
            if (var40.field2309 != null && var40.field2309[0][0] == 5) {
                int var41 = var40.field2309[0][1];
                class166.field2156[var41] = 1 - class166.field2156[var41];
                method769(var41);
            }
        }
        if (arg2 == 16) {
            field393 = arg6;
            field525 = arg7;
            field327 = 2;
            field395 = 0;
            field520 = arg0;
            field521 = arg1;
            field328.method2936(85);
            field328.method2711(Statics.field221 + arg0);
            field328.method2870(class106.field1701[82] ? 1 : 0);
            field328.method2711(arg3);
            field328.method2709(Statics.field21 + arg1);
            field328.method2712(Statics.field1733);
            field328.method2709(Statics.field1285);
            field328.method2721(Statics.field43);
        }
        if (arg2 == 33) {
            field328.method2936(47);
            field328.method2709(arg3);
            field328.method2711(arg0);
            field328.method2720(arg1);
            field397 = 0;
            Statics.field1645 = class170.method2518(arg1);
            field309 = arg0;
        }
        if (arg2 != 38) {
            if (field439 != 0) {
                field439 = 0;
                method1874(class170.method2518(Statics.field43));
            }
            if (field550) {
                method259();
            }
            if (Statics.field1645 != null && field397 == 0) {
                method1874(Statics.field1645);
            }
            return;
        }
        method259();
        class170 var42 = class170.method2518(arg1);
        field439 = 1;
        Statics.field1733 = arg0;
        Statics.field43 = arg1;
        Statics.field1285 = arg3;
        method1874(var42);
        field440 = class38.method3310(16748608) + class199.method3070(arg3).field2962 + class38.method3310(16777215);
        if (field440 == null) {
            field440 = "null";
        }
    }

    @ObfuscatedName("da.ck(IIIII)V")
    public static void method2028(int arg0, int arg1, int arg2, int arg3) {
        class170 var4 = class170.method2178(arg0, arg1);
        if (var4 != null && var4.field2254 != null) {
            class19 var5 = new class19();
            var5.field186 = var4;
            var5.field198 = var4.field2254;
            class33.method1885(var5);
        }
        field443 = arg3;
        field550 = true;
        Statics.field2332 = arg0;
        field442 = arg1;
        Statics.field1909 = arg2;
        method1874(var4);
    }

    @ObfuscatedName("d.cu(I)V")
    public static void method259() {
        if (!field550) {
            return;
        }
        class170 var0 = class170.method2178(Statics.field2332, field442);
        if (var0 != null && var0.field2264 != null) {
            class19 var1 = new class19();
            var1.field186 = var0;
            var1.field198 = var0.field2264;
            class33.method1885(var1);
        }
        field550 = false;
        method1874(var0);
    }

    @ObfuscatedName("k.cs(I)V")
    public static final void method72() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field362 - 1; var1++) {
                if (field465[var1] < 1000 && field465[var1 + 1] > 1000) {
                    String var2 = field431[var1];
                    field431[var1] = field431[var1 + 1];
                    field431[var1 + 1] = var2;
                    String var3 = field366[var1];
                    field366[var1] = field366[var1 + 1];
                    field366[var1 + 1] = var3;
                    int var4 = field465[var1];
                    field465[var1] = field465[var1 + 1];
                    field465[var1 + 1] = var4;
                    int var5 = field355[var1];
                    field355[var1] = field355[var1 + 1];
                    field355[var1 + 1] = var5;
                    int var6 = field522[var1];
                    field522[var1] = field522[var1 + 1];
                    field522[var1 + 1] = var6;
                    int var7 = field429[var1];
                    field429[var1] = field429[var1 + 1];
                    field429[var1 + 1] = var7;
                    if (field433 != -1) {
                        if (field433 == var1) {
                            field433 = var1 + 1;
                        } else if (field433 == var1 + 1) {
                            field433 = var1;
                        }
                    }
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("fj.ci(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method3028(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method920(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("ax.cw(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method920(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field424 || field362 >= 500) {
            return;
        }
        field366[field362] = arg0;
        field431[field362] = arg1;
        field465[field362] = arg2;
        field429[field362] = arg3;
        field355[field362] = arg4;
        field522[field362] = arg5;
        if (arg6) {
            field433 = field362;
        }
        field362++;
    }

    @ObfuscatedName("f.cz(I)I")
    public static final int method111() {
        if (field362 <= 0) {
            return -1;
        } else if (field434 && class106.field1701[81] && field433 != -1) {
            return field433;
        } else {
            return field362 - 1;
        }
    }

    @ObfuscatedName("ar.ce(I)Z")
    public static final boolean method816() {
        if (field362 <= 0) {
            return false;
        } else {
            return field434 && class106.field1701[81] && field433 != -1;
        }
    }

    @ObfuscatedName("ad.cn(I)V")
    public static void method848() {
        for (int var0 = 0; var0 < field362; var0++) {
            if (method2646(field465[var0])) {
                if (var0 < field362 - 1) {
                    for (int var1 = var0; var1 < field362 - 1; var1++) {
                        field366[var1] = field366[var1 + 1];
                        field431[var1] = field431[var1 + 1];
                        field465[var1] = field465[var1 + 1];
                        field429[var1] = field429[var1 + 1];
                        field355[var1] = field355[var1 + 1];
                        field522[var1] = field522[var1 + 1];
                    }
                }
                field362--;
            }
        }
    }

    @ObfuscatedName("eo.cl(IB)Z")
    public static boolean method2646(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("bi.cb(II)Ljava/lang/String;")
    public static String method1132(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field431[arg0].length() > 0) {
            return field366[arg0] + class174.field2513 + field431[arg0];
        } else {
            return field366[arg0];
        }
    }

    @ObfuscatedName("bp.ct(IIIIB)V")
    public static final void method1372(int arg0, int arg1, int arg2, int arg3) {
        if (field439 == 0 && !field550) {
            method3028(class174.field2508, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class83.field1395; var6++) {
            int var7 = class83.field1396[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field2856.method1709(Statics.field2111, var8, var9, var7) >= 0) {
                    class198 var12 = class198.method3471(var11);
                    if (var12.field2939 != null) {
                        var12 = var12.method3484();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field439 == 1) {
                        method3028(class174.field2503, field440 + " " + class38.field781 + " " + class38.method3310(65535) + var12.field2908, 1, var7, var8, var9);
                    } else if (!field550) {
                        String[] var13 = var12.field2911;
                        if (field457) {
                            var13 = method2900(var13);
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
                                    method3028(var13[var14], class38.method3310(65535) + var12.field2908, var15, var7, var8, var9);
                                }
                            }
                        }
                        method3028(class174.field2476, class38.method3310(65535) + var12.field2908, 1002, var12.field2929 << 14, var8, var9);
                    } else if ((Statics.field1909 & 0x4) == 4) {
                        method3028(field329, field351 + " " + class38.field781 + " " + class38.method3310(65535) + var12.field2908, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class36 var16 = field323[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field759.field3013 == 1 && (var16.field658 & 0x7F) == 64 && (var16.field632 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field324; var17++) {
                            class36 var18 = field323[field325[var17]];
                            if (var18 != null && var16 != var18 && var18.field759.field3013 == 1 && var16.field658 == var18.field658 && var16.field632 == var18.field632) {
                                method185(var18.field759, field325[var17], var8, var9);
                            }
                        }
                        int var19 = class46.field908;
                        int[] var20 = class46.field901;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class24 var22 = field406[var20[var21]];
                            if (var22 != null && var16.field658 == var22.field658 && var16.field632 == var22.field632) {
                                method843(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method185(var16.field759, var11, var8, var9);
                }
                if (var10 == 0) {
                    class24 var23 = field406[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field658 & 0x7F) == 64 && (var23.field632 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field324; var24++) {
                            class36 var25 = field323[field325[var24]];
                            if (var25 != null && var25.field759.field3013 == 1 && var23.field658 == var25.field658 && var23.field632 == var25.field632) {
                                method185(var25.field759, field325[var24], var8, var9);
                            }
                        }
                        int var26 = class46.field908;
                        int[] var27 = class46.field901;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class24 var29 = field406[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field658 == var29.field658 && var23.field632 == var29.field632) {
                                method843(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field415 == var11) {
                        var4 = var7;
                    } else {
                        method843(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class129 var30 = field416[Statics.field2111][var8][var9];
                    if (var30 != null) {
                        for (class44 var31 = (class44) var30.method2328(); var31 != null; var31 = (class44) var30.method2327()) {
                            class199 var32 = class199.method3070(var31.field883);
                            if (field439 == 1) {
                                method3028(class174.field2503, field440 + " " + class38.field781 + " " + class38.method3310(16748608) + var32.field2962, 16, var31.field883, var8, var9);
                            } else if (!field550) {
                                String[] var33 = var32.field2976;
                                if (field457) {
                                    var33 = method2900(var33);
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
                                        method3028(var33[var34], class38.method3310(16748608) + var32.field2962, var35, var31.field883, var8, var9);
                                    } else if (var34 == 2) {
                                        method3028(class174.field2356, class38.method3310(16748608) + var32.field2962, 20, var31.field883, var8, var9);
                                    }
                                }
                                method3028(class174.field2476, class38.method3310(16748608) + var32.field2962, 1004, var31.field883, var8, var9);
                            } else if ((Statics.field1909 & 0x1) == 1) {
                                method3028(field329, field351 + " " + class38.field781 + " " + class38.method3310(16748608) + var32.field2962, 17, var31.field883, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class24 var38 = field406[field415];
            method843(var38, field415, var36, var37);
        }
    }

    @ObfuscatedName("o.cf(Lgi;IIIB)V")
    public static final void method185(class200 arg0, int arg1, int arg2, int arg3) {
        if (field362 >= 400) {
            return;
        }
        if (arg0.field3036 != null) {
            arg0 = arg0.method3602();
        }
        if (arg0 == null || !arg0.field3040 || arg0.field3042 && field454 != arg1) {
            return;
        }
        String var4 = arg0.field3012;
        if (arg0.field3029 != 0) {
            var4 = var4 + method206(arg0.field3029, Statics.field85.field249) + " " + class38.field779 + class174.field2509 + arg0.field3029 + class38.field786;
        }
        if (arg0.field3042 && field432) {
            method3028(class174.field2476, class38.method3310(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field439 == 1) {
            method3028(class174.field2503, field440 + " " + class38.field781 + " " + class38.method3310(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field550) {
            int var5 = arg0.field3042 && field432 ? 2000 : 0;
            String[] var6 = arg0.field3009;
            if (field457) {
                var6 = method2900(var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class174.field2618)) {
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
                        method3028(var6[var7], class38.method3310(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class174.field2618)) {
                        short var10 = 0;
                        if (field417 != class41.field809) {
                            if (field417 == class41.field811 || field417 == class41.field808 && arg0.field3029 > Statics.field85.field249) {
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
                            method3028(var6[var9], class38.method3310(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3042 || !field432) {
                method3028(class174.field2476, class38.method3310(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1909 & 0x2) == 2) {
            method3028(field329, field351 + " " + class38.field781 + " " + class38.method3310(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ag.cd(Lj;IIII)V")
    public static final void method843(class24 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field85 == arg0 || field362 >= 400) {
            return;
        }
        String var4;
        if (arg0.field246 == 0) {
            var4 = arg0.field244[0] + arg0.field264 + arg0.field244[1] + method206(arg0.field249, Statics.field85.field249) + " " + class38.field779 + class174.field2509 + arg0.field249 + class38.field786 + arg0.field244[2];
        } else {
            var4 = arg0.field244[0] + arg0.field264 + arg0.field244[1] + " " + class38.field779 + class174.field2510 + arg0.field246 + class38.field786 + arg0.field244[2];
        }
        if (field439 == 1) {
            method3028(class174.field2503, field440 + " " + class38.field781 + " " + class38.method3310(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field550) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field412[var5] != null) {
                    short var6 = 0;
                    if (field412[var5].equalsIgnoreCase(class174.field2618)) {
                        if (field360 == class41.field809) {
                            continue;
                        }
                        if (field360 == class41.field811 || field360 == class41.field808 && arg0.field249 > Statics.field85.field249) {
                            var6 = 2000;
                        }
                        if (Statics.field85.field259 != 0 && arg0.field259 != 0) {
                            if (Statics.field85.field259 == arg0.field259) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field413[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field411[var5] + var6;
                    method3028(field412[var5], class38.method3310(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1909 & 0x8) == 8) {
            method3028(field329, field351 + " " + class38.field781 + " " + class38.method3310(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field362; var9++) {
            if (field465[var9] == 23) {
                field431[var9] = class38.method3310(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("u.cq(IIB)Ljava/lang/String;")
    public static final String method206(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class38.method3310(16711680);
        } else if (var2 < -6) {
            return class38.method3310(16723968);
        } else if (var2 < -3) {
            return class38.method3310(16740352);
        } else if (var2 < 0) {
            return class38.method3310(16756736);
        } else if (var2 > 9) {
            return class38.method3310(65280);
        } else if (var2 > 6) {
            return class38.method3310(4259584);
        } else if (var2 > 3) {
            return class38.method3310(8453888);
        } else if (var2 > 0) {
            return class38.method3310(12648192);
        } else {
            return class38.method3310(16776960);
        }
    }

    @ObfuscatedName("fb.ca(IIIIIIIIB)V")
    public static final void method3137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (Statics.method2954(arg0)) {
            Statics.field1590 = null;
            method1675(Statics.field2195[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1590 != null) {
                method1675(Statics.field1590, -1412584499, arg1, arg2, arg3, arg4, Statics.field2134, Statics.field814, arg7);
                Statics.field1590 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field491[var8] = true;
            }
        } else {
            field491[arg7] = true;
        }
    }

    @ObfuscatedName("cz.cc([Lfr;IIIIIIIIB)V")
    public static final void method1675(class170[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class220.method3909(arg2, arg3, arg4, arg5);
        class85.method1618();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class170 var10 = arg0[var9];
            if (var10 != null && (var10.field2207 == arg1 || arg1 == -1412584499 && field459 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field494[field545] = var10.field2210 + arg6;
                    field495[field545] = var10.field2298 + arg7;
                    field496[field545] = var10.field2212;
                    field497[field545] = var10.field2312;
                    var11 = ++field545 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2278 = var11;
                var10.field2329 = field293;
                if (!var10.field2227 || !method612(var10)) {
                    if (var10.field2201 > 0) {
                        method1873(var10);
                    }
                    int var12 = var10.field2210 + arg6;
                    int var13 = var10.field2298 + arg7;
                    int var14 = var10.field2228;
                    if (field459 == var10) {
                        if (arg1 != -1412584499 && !var10.field2275) {
                            Statics.field1590 = arg0;
                            Statics.field2134 = arg6;
                            Statics.field814 = arg7;
                            continue;
                        }
                        if (field470 && field464) {
                            int var15 = class116.field1803;
                            int var16 = class116.field1802 * 603852017;
                            int var17 = var15 - field461;
                            int var18 = var16 - field462;
                            if (var17 < field507) {
                                var17 = field507;
                            }
                            if (var10.field2212 + var17 > field507 + field460.field2212) {
                                var17 = field507 + field460.field2212 - var10.field2212;
                            }
                            if (var18 < field466) {
                                var18 = field466;
                            }
                            if (var10.field2312 + var18 > field466 + field460.field2312) {
                                var18 = field466 + field460.field2312 - var10.field2312;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2275) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2245 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2245 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2212 + var12;
                        int var26 = var10.field2312 + var13;
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
                        int var29 = var10.field2212 + var12;
                        int var30 = var10.field2312 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2227 || var19 < var21 && var20 < var22) {
                        if (var10.field2201 != 0) {
                            if (var10.field2201 == 1336) {
                                if (field299) {
                                    var13 += 15;
                                    Statics.field120.method3760("Fps:" + field1769, var10.field2212 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 32768 && field405) {
                                        var33 = 16711680;
                                    }
                                    if (var32 > 65536 && !field405) {
                                        var33 = 16711680;
                                    }
                                    Statics.field120.method3760("Mem:" + var32 + "k", var10.field2212 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2201 == 1337) {
                                field435 = var12;
                                field488 = var13;
                                int var36 = var10.field2212;
                                int var37 = var10.field2312;
                                field544++;
                                method167(class16.field162);
                                boolean var38 = false;
                                if (field415 >= 0) {
                                    int var39 = class46.field908;
                                    int[] var40 = class46.field901;
                                    for (int var41 = 0; var41 < var39; var41++) {
                                        if (field415 == var40[var41]) {
                                            var38 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var38) {
                                    method167(class16.field156);
                                }
                                method183(true);
                                method167(var38 ? class16.field161 : class16.field157);
                                method183(false);
                                method246();
                                method3846();
                                method1917(var12, var13, var36, var37, true);
                                int var42 = field317;
                                int var43 = field549;
                                int var44 = field445;
                                int var45 = field551;
                                class220.method3909(var42, var43, var42 + var44, var43 + var45);
                                class85.method1618();
                                if (!field333) {
                                    int var46 = field369;
                                    if (field378 / 256 > var46) {
                                        var46 = field378 / 256;
                                    }
                                    if (field479[4] && field304[4] + 128 > var46) {
                                        var46 = field304[4] + 128;
                                    }
                                    int var47 = field558 + field354 & 0x7FF;
                                    method1941(Statics.field3058, method1180(Statics.field85.field658, Statics.field85.field632, Statics.field2111) - field375, Statics.field813, var46, var47, var46 * 3 + 600);
                                }
                                int var60;
                                if (field333) {
                                    var60 = method1383();
                                } else {
                                    int var48;
                                    if (Statics.field1552.field690) {
                                        var48 = Statics.field2111;
                                    } else {
                                        label1446: {
                                            int var49 = 3;
                                            if (Statics.field1553 < 310) {
                                                int var50 = Statics.field3093 >> 7;
                                                int var51 = Statics.field233 >> 7;
                                                int var52 = Statics.field85.field658 >> 7;
                                                int var53 = Statics.field85.field632 >> 7;
                                                if (var50 < 0 || var51 < 0 || var50 >= 104 || var51 >= 104) {
                                                    var48 = Statics.field2111;
                                                    break label1446;
                                                }
                                                if ((class11.field88[Statics.field2111][var50][var51] & 0x4) != 0) {
                                                    var49 = Statics.field2111;
                                                }
                                                int var54;
                                                if (var52 > var50) {
                                                    var54 = var52 - var50;
                                                } else {
                                                    var54 = var50 - var52;
                                                }
                                                int var55;
                                                if (var53 > var51) {
                                                    var55 = var53 - var51;
                                                } else {
                                                    var55 = var51 - var53;
                                                }
                                                if (var54 > var55) {
                                                    int var56 = var55 * 65536 / var54;
                                                    int var57 = 32768;
                                                    while (var50 != var52) {
                                                        if (var50 < var52) {
                                                            var50++;
                                                        } else if (var50 > var52) {
                                                            var50--;
                                                        }
                                                        if ((class11.field88[Statics.field2111][var50][var51] & 0x4) != 0) {
                                                            var49 = Statics.field2111;
                                                        }
                                                        var57 += var56;
                                                        if (var57 >= 65536) {
                                                            var57 -= 65536;
                                                            if (var51 < var53) {
                                                                var51++;
                                                            } else if (var51 > var53) {
                                                                var51--;
                                                            }
                                                            if ((class11.field88[Statics.field2111][var50][var51] & 0x4) != 0) {
                                                                var49 = Statics.field2111;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int var58 = var54 * 65536 / var55;
                                                    int var59 = 32768;
                                                    while (var51 != var53) {
                                                        if (var51 < var53) {
                                                            var51++;
                                                        } else if (var51 > var53) {
                                                            var51--;
                                                        }
                                                        if ((class11.field88[Statics.field2111][var50][var51] & 0x4) != 0) {
                                                            var49 = Statics.field2111;
                                                        }
                                                        var59 += var58;
                                                        if (var59 >= 65536) {
                                                            var59 -= 65536;
                                                            if (var50 < var52) {
                                                                var50++;
                                                            } else if (var50 > var52) {
                                                                var50--;
                                                            }
                                                            if ((class11.field88[Statics.field2111][var50][var51] & 0x4) != 0) {
                                                                var49 = Statics.field2111;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (Statics.field85.field658 >= 0 && Statics.field85.field632 >= 0 && Statics.field85.field658 < 13312 && Statics.field85.field632 < 13312) {
                                                if ((class11.field88[Statics.field2111][Statics.field85.field658 >> 7][Statics.field85.field632 >> 7] & 0x4) != 0) {
                                                    var49 = Statics.field2111;
                                                }
                                                var48 = var49;
                                            } else {
                                                var48 = Statics.field2111;
                                            }
                                        }
                                    }
                                    var60 = var48;
                                }
                                int var61 = Statics.field3093;
                                int var62 = Statics.field1759;
                                int var63 = Statics.field233;
                                int var64 = Statics.field1553;
                                int var65 = Statics.field149;
                                for (int var66 = 0; var66 < 5; var66++) {
                                    if (field479[var66]) {
                                        int var67 = (int) (Math.random() * (double) (field536[var66] * 2 + 1) - (double) field536[var66] + Math.sin((double) field538[var66] / 100.0D * (double) field539[var66]) * (double) field304[var66]);
                                        if (var66 == 0) {
                                            Statics.field3093 += var67;
                                        }
                                        if (var66 == 1) {
                                            Statics.field1759 += var67;
                                        }
                                        if (var66 == 2) {
                                            Statics.field233 += var67;
                                        }
                                        if (var66 == 3) {
                                            Statics.field149 = Statics.field149 + var67 & 0x7FF;
                                        }
                                        if (var66 == 4) {
                                            Statics.field1553 += var67;
                                            if (Statics.field1553 < 128) {
                                                Statics.field1553 = 128;
                                            }
                                            if (Statics.field1553 > 383) {
                                                Statics.field1553 = 383;
                                            }
                                        }
                                    }
                                }
                                int var68 = class116.field1803;
                                int var69 = class116.field1802 * 603852017;
                                if (class116.field1797 != 0) {
                                    var68 = class116.field1809;
                                    var69 = class116.field1799;
                                }
                                if (var68 >= var42 && var68 < var42 + var44 && var69 >= var43 && var69 < var43 + var45) {
                                    class83.field1392 = true;
                                    class83.field1395 = 0;
                                    class83.field1393 = var68 - var42;
                                    class83.field1394 = var69 - var43;
                                } else {
                                    class83.field1392 = false;
                                    class83.field1395 = 0;
                                }
                                method225();
                                class220.method3884(var42, var43, var44, var45, 0);
                                method225();
                                int var70 = class85.field1422;
                                class85.field1422 = field552;
                                Statics.field2856.method1737(Statics.field3093, Statics.field1759, Statics.field233, Statics.field1553, Statics.field149, var60);
                                class85.field1422 = var70;
                                method225();
                                Statics.field2856.method1693();
                                field446 = 0;
                                boolean var71 = false;
                                int var72 = -1;
                                int var73 = class46.field908;
                                int[] var74 = class46.field901;
                                for (int var75 = 0; var75 < field324 + var73; var75++) {
                                    class28 var76;
                                    if (var75 < var73) {
                                        var76 = field406[var74[var75]];
                                        if (field415 == var74[var75]) {
                                            var71 = true;
                                            var72 = var75;
                                            continue;
                                        }
                                    } else {
                                        var76 = field323[field325[var75 - var73]];
                                    }
                                    method3847(var76, var75, var42, var43, var44, var45);
                                }
                                if (var71) {
                                    method3847(field406[field415], var72, var42, var43, var44, var45);
                                }
                                for (int var77 = 0; var77 < field446; var77++) {
                                    int var78 = field381[var77];
                                    int var79 = field292[var77];
                                    int var80 = field384[var77];
                                    int var81 = field383[var77];
                                    boolean var82 = true;
                                    while (var82) {
                                        var82 = false;
                                        for (int var83 = 0; var83 < var77; var83++) {
                                            if (var79 + 2 > field292[var83] - field383[var83] && var79 - var81 < field292[var83] + 2 && var78 - var80 < field384[var83] + field381[var83] && var78 + var80 > field381[var83] - field384[var83] && field292[var83] - field383[var83] < var79) {
                                                var79 = field292[var83] - field383[var83];
                                                var82 = true;
                                            }
                                        }
                                    }
                                    field391 = field381[var77];
                                    field392 = field292[var77] = var79;
                                    String var84 = field489[var77];
                                    if (field448 == 0) {
                                        int var85 = 16776960;
                                        if (field385[var77] < 6) {
                                            var85 = field306[field385[var77]];
                                        }
                                        if (field385[var77] == 6) {
                                            var85 = field544 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field385[var77] == 7) {
                                            var85 = field544 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field385[var77] == 8) {
                                            var85 = field544 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field385[var77] == 9) {
                                            int var86 = 150 - field546[var77];
                                            if (var86 < 50) {
                                                var85 = var86 * 1280 + 16711680;
                                            } else if (var86 < 100) {
                                                var85 = 16776960 - (var86 - 50) * 327680;
                                            } else if (var86 < 150) {
                                                var85 = (var86 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field385[var77] == 10) {
                                            int var87 = 150 - field546[var77];
                                            if (var87 < 50) {
                                                var85 = var87 * 5 + 16711680;
                                            } else if (var87 < 100) {
                                                var85 = 16711935 - (var87 - 50) * 327680;
                                            } else if (var87 < 150) {
                                                var85 = (var87 - 100) * 327680 + 255 - (var87 - 100) * 5;
                                            }
                                        }
                                        if (field385[var77] == 11) {
                                            int var88 = 150 - field546[var77];
                                            if (var88 < 50) {
                                                var85 = 16777215 - var88 * 327685;
                                            } else if (var88 < 100) {
                                                var85 = (var88 - 50) * 327685 + 65280;
                                            } else if (var88 < 150) {
                                                var85 = 16777215 - (var88 - 100) * 327680;
                                            }
                                        }
                                        if (field418[var77] == 0) {
                                            Statics.field171.method3794(var84, field391 + var42, field392 + var43, var85, 0);
                                        }
                                        if (field418[var77] == 1) {
                                            Statics.field171.method3827(var84, field391 + var42, field392 + var43, var85, 0, field544);
                                        }
                                        if (field418[var77] == 2) {
                                            Statics.field171.method3783(var84, field391 + var42, field392 + var43, var85, 0, field544);
                                        }
                                        if (field418[var77] == 3) {
                                            Statics.field171.method3808(var84, field391 + var42, field392 + var43, var85, 0, field544, 150 - field546[var77]);
                                        }
                                        if (field418[var77] == 4) {
                                            int var89 = (150 - field546[var77]) * (Statics.field171.method3764(var84) + 100) / 150;
                                            class220.method3878(field391 + var42 - 50, var43, field391 + var42 + 50, var43 + var45);
                                            Statics.field171.method3769(var84, field391 + var42 + 50 - var89, field392 + var43, var85, 0);
                                            class220.method3909(var42, var43, var42 + var44, var43 + var45);
                                        }
                                        if (field418[var77] == 5) {
                                            int var90 = 150 - field546[var77];
                                            int var91 = 0;
                                            if (var90 < 25) {
                                                var91 = var90 - 25;
                                            } else if (var90 > 125) {
                                                var91 = var90 - 125;
                                            }
                                            class220.method3878(var42, field392 + var43 - Statics.field171.field3105 - 1, var42 + var44, field392 + var43 + 5);
                                            Statics.field171.method3794(var84, field391 + var42, field392 + var43 + var91, var85, 0);
                                            class220.method3909(var42, var43, var42 + var44, var43 + var45);
                                        }
                                    } else {
                                        Statics.field171.method3794(var84, field391 + var42, field392 + var43, 16776960, 0);
                                    }
                                }
                                if (field301 == 2) {
                                    method1439((field537 - Statics.field221 << 7) + field307, (field316 - Statics.field21 << 7) + field308, field388 * 2);
                                    if (field391 > -1 && field293 % 20 < 10) {
                                        Statics.field2153[0].method4036(field391 + var42 - 12, field392 + var43 - 28);
                                    }
                                }
                                ((class75) Statics.field1416).method1419(field478);
                                if (field327 == 1) {
                                    Statics.field116[field395 / 100].method4036(field393 - 8, field525 - 8);
                                }
                                if (field327 == 2) {
                                    Statics.field116[field395 / 100 + 4].method4036(field393 - 8, field525 - 8);
                                }
                                field337 = 0;
                                int var92 = (Statics.field85.field658 >> 7) + Statics.field221;
                                int var93 = (Statics.field85.field632 >> 7) + Statics.field21;
                                if (var92 >= 3053 && var92 <= 3156 && var93 >= 3056 && var93 <= 3136) {
                                    field337 = 1;
                                }
                                if (var92 >= 3072 && var92 <= 3118 && var93 >= 9492 && var93 <= 9535) {
                                    field337 = 1;
                                }
                                if (field337 == 1 && var92 >= 3139 && var92 <= 3199 && var93 >= 3008 && var93 <= 3062) {
                                    field337 = 0;
                                }
                                Statics.field3093 = var61;
                                Statics.field1759 = var62;
                                Statics.field233 = var63;
                                Statics.field1553 = var64;
                                Statics.field149 = var65;
                                if (field548 && class186.method1932(true, false) == 0) {
                                    field548 = false;
                                }
                                if (field548) {
                                    class220.method3884(var42, var43, var44, var45, 0);
                                    method66(class174.field2599, false);
                                }
                                field491[var10.field2278] = true;
                                class220.method3909(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2201 == 1338) {
                                method225();
                                class165 var94 = var10.method3105(false);
                                if (var94 != null) {
                                    class220.method3909(var12, var13, var94.field2149 + var12, var94.field2147 + var13);
                                    if (field559 == 2 || field559 == 5) {
                                        class220.method3896(var12, var13, 0, var94.field2150, var94.field2146);
                                    } else {
                                        int var95 = field558 + field357 & 0x7FF;
                                        int var96 = Statics.field85.field658 / 32 + 48;
                                        int var97 = 464 - Statics.field85.field632 / 32;
                                        Statics.field2026.method4017(var12, var13, var94.field2149, var94.field2147, var96, var97, var95, field343 + 256, var94.field2150, var94.field2146);
                                        for (int var98 = 0; var98 < field516; var98++) {
                                            int var99 = field517[var98] * 4 + 2 - Statics.field85.field658 / 32;
                                            int var100 = field518[var98] * 4 + 2 - Statics.field85.field632 / 32;
                                            method1677(var12, var13, var99, var100, field519[var98], var94);
                                        }
                                        int var101 = 0;
                                        while (true) {
                                            if (var101 >= 104) {
                                                for (int var106 = 0; var106 < field324; var106++) {
                                                    class36 var107 = field323[field325[var106]];
                                                    if (var107 != null && var107.method230()) {
                                                        class200 var108 = var107.field759;
                                                        if (var108 != null && var108.field3036 != null) {
                                                            var108 = var108.method3602();
                                                        }
                                                        if (var108 != null && var108.field3028 && var108.field3040) {
                                                            int var109 = var107.field658 / 32 - Statics.field85.field658 / 32;
                                                            int var110 = var107.field632 / 32 - Statics.field85.field632 / 32;
                                                            method1677(var12, var13, var109, var110, Statics.field1284[1], var94);
                                                        }
                                                    }
                                                }
                                                int var111 = class46.field908;
                                                int[] var112 = class46.field901;
                                                for (int var113 = 0; var113 < var111; var113++) {
                                                    class24 var114 = field406[var112[var113]];
                                                    if (var114 != null && var114.method230() && !var114.field260 && Statics.field85 != var114) {
                                                        int var115 = var114.field658 / 32 - Statics.field85.field658 / 32;
                                                        int var116 = var114.field632 / 32 - Statics.field85.field632 / 32;
                                                        boolean var117 = false;
                                                        if (method954(var114.field264, true)) {
                                                            var117 = true;
                                                        }
                                                        boolean var118 = false;
                                                        for (int var119 = 0; var119 < Statics.field12; var119++) {
                                                            if (var114.field264.equals(Statics.field2950[var119].field276)) {
                                                                var118 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var120 = false;
                                                        if (Statics.field85.field259 != 0 && var114.field259 != 0 && Statics.field85.field259 == var114.field259) {
                                                            var120 = true;
                                                        }
                                                        if (var117) {
                                                            method1677(var12, var13, var115, var116, Statics.field1284[3], var94);
                                                        } else if (var120) {
                                                            method1677(var12, var13, var115, var116, Statics.field1284[4], var94);
                                                        } else if (var118) {
                                                            method1677(var12, var13, var115, var116, Statics.field1284[5], var94);
                                                        } else {
                                                            method1677(var12, var13, var115, var116, Statics.field1284[2], var94);
                                                        }
                                                    }
                                                }
                                                if (field301 != 0 && field293 % 20 < 10) {
                                                    if (field301 == 1 && field302 >= 0 && field302 < field323.length) {
                                                        class36 var121 = field323[field302];
                                                        if (var121 != null) {
                                                            int var122 = var121.field658 / 32 - Statics.field85.field658 / 32;
                                                            int var123 = var121.field632 / 32 - Statics.field85.field632 / 32;
                                                            method229(var12, var13, var122, var123, Statics.field1172[1], var94);
                                                        }
                                                    }
                                                    if (field301 == 2) {
                                                        int var124 = field537 * 4 - Statics.field221 * 4 + 2 - Statics.field85.field658 / 32;
                                                        int var125 = field316 * 4 - Statics.field21 * 4 + 2 - Statics.field85.field632 / 32;
                                                        method229(var12, var13, var124, var125, Statics.field1172[1], var94);
                                                    }
                                                    if (field301 == 10 && field312 >= 0 && field312 < field406.length) {
                                                        class24 var126 = field406[field312];
                                                        if (var126 != null) {
                                                            int var127 = var126.field658 / 32 - Statics.field85.field658 / 32;
                                                            int var128 = var126.field632 / 32 - Statics.field85.field632 / 32;
                                                            method229(var12, var13, var127, var128, Statics.field1172[1], var94);
                                                        }
                                                    }
                                                }
                                                if (field520 != 0) {
                                                    int var129 = field520 * 4 + 2 - Statics.field85.field658 / 32;
                                                    int var130 = field521 * 4 + 2 - Statics.field85.field632 / 32;
                                                    method1677(var12, var13, var129, var130, Statics.field1172[0], var94);
                                                }
                                                if (!Statics.field85.field260) {
                                                    class220.method3884(var94.field2149 / 2 + var12 - 1, var94.field2147 / 2 + var13 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var102 = 0; var102 < 104; var102++) {
                                                class129 var103 = field416[Statics.field2111][var101][var102];
                                                if (var103 != null) {
                                                    int var104 = var101 * 4 + 2 - Statics.field85.field658 / 32;
                                                    int var105 = var102 * 4 + 2 - Statics.field85.field632 / 32;
                                                    method1677(var12, var13, var104, var105, Statics.field1284[0], var94);
                                                }
                                            }
                                            var101++;
                                        }
                                    }
                                    field387[var11] = true;
                                }
                                class220.method3909(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2201 == 1339) {
                                class165 var131 = var10.method3105(false);
                                if (var131 != null) {
                                    if (field559 < 3) {
                                        Statics.field1589.method4017(var12, var13, var131.field2149, var131.field2147, 25, 25, field558, 256, var131.field2150, var131.field2146);
                                    } else {
                                        class220.method3896(var12, var13, 0, var131.field2150, var131.field2146);
                                    }
                                }
                                class220.method3909(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2245 == 0) {
                            if (!var10.field2227 && method612(var10) && Statics.field897 != var10) {
                                continue;
                            }
                            if (!var10.field2227) {
                                if (var10.field2219 > var10.field2221 - var10.field2312) {
                                    var10.field2219 = var10.field2221 - var10.field2312;
                                }
                                if (var10.field2219 < 0) {
                                    var10.field2219 = 0;
                                }
                            }
                            method1675(arg0, var10.field2197, var19, var20, var21, var22, var12 - var10.field2218, var13 - var10.field2219, var11);
                            if (var10.field2282 != null) {
                                method1675(var10.field2282, var10.field2197, var19, var20, var21, var22, var12 - var10.field2218, var13 - var10.field2219, var11);
                            }
                            class18 var132 = (class18) field447.method2280((long) var10.field2197);
                            if (var132 != null) {
                                method3137(var132.field183, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class220.method3909(arg2, arg3, arg4, arg5);
                            class85.method1618();
                        }
                        if (field499 || field493[var11] || field498 > 1) {
                            if (var10.field2245 == 0 && !var10.field2227 && var10.field2221 > var10.field2312) {
                                method751(var10.field2212 + var12, var13, var10.field2219, var10.field2312, var10.field2221);
                            }
                            if (var10.field2245 != 1) {
                                if (var10.field2245 == 2) {
                                    int var133 = 0;
                                    for (int var134 = 0; var134 < var10.field2209; var134++) {
                                        for (int var135 = 0; var135 < var10.field2208; var135++) {
                                            int var136 = (var10.field2260 + 32) * var135 + var12;
                                            int var137 = (var10.field2314 + 32) * var134 + var13;
                                            if (var133 < 20) {
                                                var136 += var10.field2265[var133];
                                                var137 += var10.field2320[var133];
                                            }
                                            if (var10.field2287[var133] > 0) {
                                                boolean var138 = false;
                                                boolean var139 = false;
                                                int var140 = var10.field2287[var133] - 1;
                                                if (var136 + 32 > arg2 && var136 < arg4 && var137 + 32 > arg3 && var137 < arg5 || Statics.field51 == var10 && field399 == var133) {
                                                    class225 var141;
                                                    if (field439 == 1 && Statics.field1733 == var133 && Statics.field43 == var10.field2197) {
                                                        var141 = class199.method3138(var140, var10.field2316[var133], 2, 0, 2, false);
                                                    } else {
                                                        var141 = class199.method3138(var140, var10.field2316[var133], 1, 3153952, 2, false);
                                                    }
                                                    if (var141 == null) {
                                                        method1874(var10);
                                                    } else if (Statics.field51 == var10 && field399 == var133) {
                                                        int var142 = class116.field1803 - field400;
                                                        int var143 = class116.field1802 * 603852017 - field492;
                                                        if (var142 < 5 && var142 > -5) {
                                                            var142 = 0;
                                                        }
                                                        if (var143 < 5 && var143 > -5) {
                                                            var143 = 0;
                                                        }
                                                        if (field404 < 5) {
                                                            var142 = 0;
                                                            var143 = 0;
                                                        }
                                                        var141.method4023(var136 + var142, var137 + var143, 128);
                                                        if (arg1 != -1) {
                                                            class170 var144 = arg0[arg1 & 0xFFFF];
                                                            if (var137 + var143 < class220.field3188 && var144.field2219 > 0) {
                                                                int var145 = field478 * (class220.field3188 - var137 - var143) / 3;
                                                                if (var145 > field478 * 10) {
                                                                    var145 = field478 * 10;
                                                                }
                                                                if (var145 > var144.field2219) {
                                                                    var145 = var144.field2219;
                                                                }
                                                                var144.field2219 -= var145;
                                                                field492 += var145;
                                                                method1874(var144);
                                                            }
                                                            if (var137 + var143 + 32 > class220.field3183 && var144.field2219 < var144.field2221 - var144.field2312) {
                                                                int var146 = field478 * (var137 + var143 + 32 - class220.field3183) / 3;
                                                                if (var146 > field478 * 10) {
                                                                    var146 = field478 * 10;
                                                                }
                                                                if (var146 > var144.field2221 - var144.field2312 - var144.field2219) {
                                                                    var146 = var144.field2221 - var144.field2312 - var144.field2219;
                                                                }
                                                                var144.field2219 += var146;
                                                                field492 -= var146;
                                                                method1874(var144);
                                                            }
                                                        }
                                                    } else if (Statics.field1645 == var10 && field309 == var133) {
                                                        var141.method4023(var136, var137, 128);
                                                    } else {
                                                        var141.method4036(var136, var137);
                                                    }
                                                }
                                            } else if (var10.field2267 != null && var133 < 20) {
                                                class225 var147 = var10.method3080(var133);
                                                if (var147 != null) {
                                                    var147.method4036(var136, var137);
                                                } else if (class170.field2196) {
                                                    method1874(var10);
                                                }
                                            }
                                            var133++;
                                        }
                                    }
                                } else if (var10.field2245 == 3) {
                                    int var148;
                                    if (method3140(var10)) {
                                        var148 = var10.field2223;
                                        if (Statics.field897 == var10 && var10.field2311 != 0) {
                                            var148 = var10.field2311;
                                        }
                                    } else {
                                        var148 = var10.field2199;
                                        if (Statics.field897 == var10 && var10.field2224 != 0) {
                                            var148 = var10.field2224;
                                        }
                                    }
                                    if (var10.field2226) {
                                        switch(var10.field2330.field3197) {
                                            case 1:
                                                class220.method3891(var12, var13, var10.field2212, var10.field2312, var10.field2199, var10.field2223, 256 - (var10.field2228 & 0xFF), 256 - (var10.field2229 & 0xFF));
                                                break;
                                            case 2:
                                                class220.method3885(var12, var13, var10.field2212, var10.field2312, var10.field2199, var10.field2223, 256 - (var10.field2228 & 0xFF), 256 - (var10.field2229 & 0xFF));
                                                break;
                                            case 3:
                                                class220.method3886(var12, var13, var10.field2212, var10.field2312, var10.field2199, var10.field2223, 256 - (var10.field2228 & 0xFF), 256 - (var10.field2229 & 0xFF));
                                                break;
                                            case 4:
                                                class220.method3887(var12, var13, var10.field2212, var10.field2312, var10.field2199, var10.field2223, 256 - (var10.field2228 & 0xFF), 256 - (var10.field2229 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class220.method3884(var12, var13, var10.field2212, var10.field2312, var148);
                                                } else {
                                                    class220.method3892(var12, var13, var10.field2212, var10.field2312, var148, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class220.method3889(var12, var13, var10.field2212, var10.field2312, var148);
                                    } else {
                                        class220.method3883(var12, var13, var10.field2212, var10.field2312, var148, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2245 == 4) {
                                    class209 var149 = var10.method3097();
                                    if (var149 != null) {
                                        String var150 = var10.field2301;
                                        int var151;
                                        if (method3140(var10)) {
                                            var151 = var10.field2223;
                                            if (Statics.field897 == var10 && var10.field2311 != 0) {
                                                var151 = var10.field2311;
                                            }
                                            if (var10.field2258.length() > 0) {
                                                var150 = var10.field2258;
                                            }
                                        } else {
                                            var151 = var10.field2199;
                                            if (Statics.field897 == var10 && var10.field2224 != 0) {
                                                var151 = var10.field2224;
                                            }
                                        }
                                        if (var10.field2227 && var10.field2317 != -1) {
                                            class199 var152 = class199.method3070(var10.field2317);
                                            var150 = var152.field2962;
                                            if (var150 == null) {
                                                var150 = "null";
                                            }
                                            if ((var152.field2954 == 1 || var10.field2323 != 1) && var10.field2323 != -1) {
                                                var150 = class38.method3310(16748608) + var150 + class38.field783 + " " + 'x' + method2893(var10.field2323);
                                            }
                                        }
                                        if (field547 == var10) {
                                            class174 var10000 = (class174) null;
                                            var150 = class174.field2511;
                                            var151 = var10.field2199;
                                        }
                                        if (!var10.field2227) {
                                            var150 = method168(var150, var10);
                                        }
                                        var149.method3829(var150, var12, var13, var10.field2212, var10.field2312, var151, var10.field2262 ? 0 : -1, var10.field2237, var10.field2261, var10.field2284);
                                    } else if (class170.field2196) {
                                        method1874(var10);
                                    }
                                } else if (var10.field2245 == 5) {
                                    if (var10.field2227) {
                                        class225 var154;
                                        if (var10.field2317 == -1) {
                                            var154 = var10.method3078(false);
                                        } else {
                                            var154 = class199.method3138(var10.field2317, var10.field2323, var10.field2236, var10.field2322, var10.field2255, false);
                                        }
                                        if (var154 != null) {
                                            int var155 = var154.field3220;
                                            int var156 = var154.field3221;
                                            if (var10.field2279) {
                                                class220.method3878(var12, var13, var10.field2212 + var12, var10.field2312 + var13);
                                                int var157 = (var10.field2212 + (var155 - 1)) / var155;
                                                int var158 = (var10.field2312 + (var156 - 1)) / var156;
                                                for (int var159 = 0; var159 < var157; var159++) {
                                                    for (int var160 = 0; var160 < var158; var160++) {
                                                        if (var10.field2234 != 0) {
                                                            var154.method4019(var155 / 2 + var155 * var159 + var12, var156 / 2 + var156 * var160 + var13, var10.field2234, 4096);
                                                        } else if (var14 == 0) {
                                                            var154.method4036(var155 * var159 + var12, var156 * var160 + var13);
                                                        } else {
                                                            var154.method4023(var155 * var159 + var12, var156 * var160 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class220.method3909(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var161 = var10.field2212 * 4096 / var155;
                                                if (var10.field2234 != 0) {
                                                    var154.method4019(var10.field2212 / 2 + var12, var10.field2312 / 2 + var13, var10.field2234, var161);
                                                } else if (var14 != 0) {
                                                    var154.method4041(var12, var13, var10.field2212, var10.field2312, 256 - (var14 & 0xFF));
                                                } else if (var10.field2212 == var155 && var10.field2312 == var156) {
                                                    var154.method4036(var12, var13);
                                                } else {
                                                    var154.method3999(var12, var13, var10.field2212, var10.field2312);
                                                }
                                            }
                                        } else if (class170.field2196) {
                                            method1874(var10);
                                        }
                                    } else {
                                        class225 var153 = var10.method3078(method3140(var10));
                                        if (var153 != null) {
                                            var153.method4036(var12, var13);
                                        } else if (class170.field2196) {
                                            method1874(var10);
                                        }
                                    }
                                } else if (var10.field2245 == 6) {
                                    boolean var162 = method3140(var10);
                                    int var163;
                                    if (var162) {
                                        var163 = var10.field2263;
                                    } else {
                                        var163 = var10.field2244;
                                    }
                                    class83 var164 = null;
                                    int var165 = 0;
                                    if (var10.field2317 != -1) {
                                        class199 var166 = class199.method3070(var10.field2317);
                                        if (var166 != null) {
                                            class199 var167 = var166.method3567(var10.field2323);
                                            var164 = var167.method3590(1);
                                            if (var164 == null) {
                                                method1874(var10);
                                            } else {
                                                var164.method1607();
                                                var165 = var164.field1530 / 2;
                                            }
                                        }
                                    } else if (var10.field2240 == 5) {
                                        if (var10.field2241 == 0) {
                                            var164 = field563.method3048((class202) null, -1, (class202) null, -1);
                                        } else {
                                            var164 = Statics.field85.method226();
                                        }
                                    } else if (var163 == -1) {
                                        var164 = var10.method3081((class202) null, -1, var162, Statics.field85.field241);
                                        if (var164 == null && class170.field2196) {
                                            method1874(var10);
                                        }
                                    } else {
                                        class202 var168 = class202.method262(var163);
                                        var164 = var10.method3081(var168, var10.field2319, var162, Statics.field85.field241);
                                        if (var164 == null && class170.field2196) {
                                            method1874(var10);
                                        }
                                    }
                                    class85.method1664(var10.field2212 / 2 + var12, var10.field2312 / 2 + var13);
                                    int var169 = var10.field2239 * class85.field1436[var10.field2248] >> 16;
                                    int var170 = var10.field2239 * class85.field1433[var10.field2248] >> 16;
                                    if (var164 != null) {
                                        if (var10.field2227) {
                                            var164.method1607();
                                            if (var10.field2288) {
                                                var164.method1550(0, var10.field2249, var10.field2250, var10.field2248, var10.field2246, var10.field2247 + var165 + var169, var10.field2247 + var170, var10.field2239);
                                            } else {
                                                var164.method1556(0, var10.field2249, var10.field2250, var10.field2248, var10.field2246, var10.field2247 + var165 + var169, var10.field2247 + var170);
                                            }
                                        } else {
                                            var164.method1556(0, var10.field2249, 0, var10.field2248, 0, var169, var170);
                                        }
                                    }
                                    class85.method1622();
                                } else {
                                    if (var10.field2245 == 7) {
                                        class209 var171 = var10.method3097();
                                        if (var171 == null) {
                                            if (class170.field2196) {
                                                method1874(var10);
                                            }
                                            continue;
                                        }
                                        int var172 = 0;
                                        for (int var173 = 0; var173 < var10.field2209; var173++) {
                                            for (int var174 = 0; var174 < var10.field2208; var174++) {
                                                if (var10.field2287[var172] > 0) {
                                                    class199 var175 = class199.method3070(var10.field2287[var172] - 1);
                                                    String var176;
                                                    if (var175.field2954 != 1 && var10.field2316[var172] == 1) {
                                                        var176 = class38.method3310(16748608) + var175.field2962 + class38.field783;
                                                    } else {
                                                        var176 = class38.method3310(16748608) + var175.field2962 + class38.field783 + " " + 'x' + method2893(var10.field2316[var172]);
                                                    }
                                                    int var177 = (var10.field2260 + 115) * var174 + var12;
                                                    int var178 = (var10.field2314 + 12) * var173 + var13;
                                                    if (var10.field2237 == 0) {
                                                        var171.method3769(var176, var177, var178, var10.field2199, var10.field2262 ? 0 : -1);
                                                    } else if (var10.field2237 == 1) {
                                                        var171.method3794(var176, var10.field2212 / 2 + var177, var178, var10.field2199, var10.field2262 ? 0 : -1);
                                                    } else {
                                                        var171.method3760(var176, var10.field2212 + var177 - 1, var178, var10.field2199, var10.field2262 ? 0 : -1);
                                                    }
                                                }
                                                var172++;
                                            }
                                        }
                                    }
                                    if (var10.field2245 == 8 && Statics.field202 == var10 && field508 == field437) {
                                        int var179 = 0;
                                        int var180 = 0;
                                        class209 var181 = Statics.field120;
                                        String var182 = var10.field2301;
                                        String var183 = method168(var182, var10);
                                        while (var183.length() > 0) {
                                            int var184 = var183.indexOf(class38.field782);
                                            String var185;
                                            if (var184 == -1) {
                                                var185 = var183;
                                                var183 = "";
                                            } else {
                                                var185 = var183.substring(0, var184);
                                                var183 = var183.substring(var184 + 4);
                                            }
                                            int var186 = var181.method3764(var185);
                                            if (var186 > var179) {
                                                var179 = var186;
                                            }
                                            var180 += var181.field3105 + 1;
                                        }
                                        var179 += 6;
                                        var180 += 7;
                                        int var187 = var10.field2212 + var12 - 5 - var179;
                                        int var188 = var10.field2312 + var13 + 5;
                                        if (var187 < var12 + 5) {
                                            var187 = var12 + 5;
                                        }
                                        if (var179 + var187 > arg4) {
                                            var187 = arg4 - var179;
                                        }
                                        if (var180 + var188 > arg5) {
                                            var188 = arg5 - var180;
                                        }
                                        class220.method3884(var187, var188, var179, var180, 16777120);
                                        class220.method3889(var187, var188, var179, var180, 0);
                                        String var189 = var10.field2301;
                                        int var190 = var181.field3105 + var188 + 2;
                                        String var191 = method168(var189, var10);
                                        while (var191.length() > 0) {
                                            int var192 = var191.indexOf(class38.field782);
                                            String var193;
                                            if (var192 == -1) {
                                                var193 = var191;
                                                var191 = "";
                                            } else {
                                                var193 = var191.substring(0, var192);
                                                var191 = var191.substring(var192 + 4);
                                            }
                                            var181.method3769(var193, var187 + 3, var190, 0, -1);
                                            var190 += var181.field3105 + 1;
                                        }
                                    }
                                    if (var10.field2245 == 9) {
                                        if (var10.field2230 == 1) {
                                            int var194;
                                            int var195;
                                            int var196;
                                            int var197;
                                            if (var10.field2231) {
                                                var194 = var12;
                                                var195 = var10.field2312 + var13;
                                                var196 = var10.field2212 + var12;
                                                var197 = var13;
                                            } else {
                                                var194 = var12;
                                                var195 = var13;
                                                var196 = var10.field2212 + var12;
                                                var197 = var10.field2312 + var13;
                                            }
                                            class220.method3882(var194, var195, var196, var197, var10.field2199);
                                        } else {
                                            int var198 = var10.field2212 >= 0 ? var10.field2212 : -var10.field2212;
                                            int var199 = var10.field2312 >= 0 ? var10.field2312 : -var10.field2312;
                                            int var200 = var198;
                                            if (var198 < var199) {
                                                var200 = var199;
                                            }
                                            if (var200 != 0) {
                                                int var201 = (var10.field2212 << 16) / var200;
                                                int var202 = (var10.field2312 << 16) / var200;
                                                if (var202 <= var201) {
                                                    var201 = -var201;
                                                } else {
                                                    var202 = -var202;
                                                }
                                                int var203 = var10.field2230 * var202 >> 17;
                                                int var204 = var10.field2230 * var202 + 1 >> 17;
                                                int var205 = var10.field2230 * var201 >> 17;
                                                int var206 = var10.field2230 * var201 + 1 >> 17;
                                                int var207 = var12 + var203;
                                                int var208 = var12 - var204;
                                                int var209 = var10.field2212 + var12 - var204;
                                                int var210 = var10.field2212 + var12 + var203;
                                                int var211 = var13 + var205;
                                                int var212 = var13 - var206;
                                                int var213 = var10.field2312 + var13 - var206;
                                                int var214 = var10.field2312 + var13 + var205;
                                                class85.method1626(var207, var208, var209);
                                                class85.method1640(var211, var212, var213, var207, var208, var209, var10.field2199);
                                                class85.method1626(var207, var209, var210);
                                                class85.method1640(var211, var213, var214, var207, var209, var210, var10.field2199);
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

    @ObfuscatedName("p.cg(Ljava/lang/String;Lfr;I)Ljava/lang/String;")
    public static String method168(String arg0, class170 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method1986(arg1, var2 - 1);
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
                if (Statics.field2117 != null) {
                    int var9 = Statics.field2117.field1658;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field2117.field1660 != null) {
                        var8 = (String) Statics.field2117.field1660;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("eg.cv(IB)Ljava/lang/String;")
    public static final String method2893(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class38.field777 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class38.method3310(65408) + var1.substring(0, var1.length() - 8) + class174.field2514 + " " + class38.field779 + var1 + class38.field786 + class38.field783;
        } else if (var1.length() > 6) {
            return " " + class38.method3310(16777215) + var1.substring(0, var1.length() - 4) + class174.field2516 + " " + class38.field779 + var1 + class38.field786 + class38.field783;
        } else {
            return " " + class38.method3310(16776960) + var1 + class38.field783;
        }
    }

    @ObfuscatedName("ai.cj(ZI)V")
    public static final void method797(boolean arg0) {
        int var1 = field452;
        int var2 = Statics.field22;
        int var3 = Statics.field217;
        if (Statics.method2954(var1)) {
            method211(Statics.field2195[var1], -1, var2, var3, arg0);
        }
    }

    @ObfuscatedName("ai.co(Lfr;B)V")
    public static void method798(class170 arg0) {
        class170 var1 = arg0.field2207 == -1 ? null : class170.method2518(arg0.field2207);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field22;
            var3 = Statics.field217;
        } else {
            var2 = var1.field2212;
            var3 = var1.field2312;
        }
        method191(arg0, var2, var3, false);
        method1876(arg0, var2, var3);
    }

    @ObfuscatedName("ab.cy([Lfr;Lfr;ZI)V")
    public static void method642(class170[] arg0, class170 arg1, boolean arg2) {
        int var3 = arg1.field2220 == 0 ? arg1.field2212 : arg1.field2220;
        int var4 = arg1.field2221 == 0 ? arg1.field2312 : arg1.field2221;
        method211(arg0, arg1.field2197, var3, var4, arg2);
        if (arg1.field2282 != null) {
            method211(arg1.field2282, arg1.field2197, var3, var4, arg2);
        }
        class18 var5 = (class18) field447.method2280((long) arg1.field2197);
        if (var5 != null) {
            int var6 = var5.field183;
            if (Statics.method2954(var6)) {
                method211(Statics.field2195[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2201 == 1337) {
        }
    }

    @ObfuscatedName("c.cp([Lfr;IIIZI)V")
    public static void method211(class170[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class170 var6 = arg0[var5];
            if (var6 != null && var6.field2207 == arg1) {
                method191(var6, arg2, arg3, arg4);
                method1876(var6, arg2, arg3);
                if (var6.field2218 > var6.field2220 - var6.field2212) {
                    var6.field2218 = var6.field2220 - var6.field2212;
                }
                if (var6.field2218 < 0) {
                    var6.field2218 = 0;
                }
                if (var6.field2219 > var6.field2221 - var6.field2312) {
                    var6.field2219 = var6.field2221 - var6.field2312;
                }
                if (var6.field2219 < 0) {
                    var6.field2219 = 0;
                }
                if (var6.field2245 == 0) {
                    method642(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("y.ch(Lfr;IIZI)V")
    public static void method191(class170 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2212;
        int var5 = arg0.field2312;
        if (arg0.field2204 == 0) {
            arg0.field2212 = arg0.field2208;
        } else if (arg0.field2204 == 1) {
            arg0.field2212 = arg1 - arg0.field2208;
        } else if (arg0.field2204 == 2) {
            arg0.field2212 = arg0.field2208 * arg1 >> 14;
        }
        if (arg0.field2205 == 0) {
            arg0.field2312 = arg0.field2209;
        } else if (arg0.field2205 == 1) {
            arg0.field2312 = arg2 - arg0.field2209;
        } else if (arg0.field2205 == 2) {
            arg0.field2312 = arg0.field2209 * arg2 >> 14;
        }
        if (arg0.field2204 == 4) {
            arg0.field2212 = arg0.field2312 * arg0.field2214 / arg0.field2215;
        }
        if (arg0.field2205 == 4) {
            arg0.field2312 = arg0.field2215 * arg0.field2212 / arg0.field2214;
        }
        if (field456 && arg0.field2245 == 0) {
            if (arg0.field2312 < 5 && arg0.field2212 < 5) {
                arg0.field2312 = 5;
                arg0.field2212 = 5;
            } else {
                if (arg0.field2312 <= 0) {
                    arg0.field2312 = 5;
                }
                if (arg0.field2212 <= 0) {
                    arg0.field2212 = 5;
                }
            }
        }
        if (arg0.field2201 == 1337) {
            field458 = arg0;
        }
        if (arg3 && arg0.field2306 != null && (arg0.field2212 != var4 || arg0.field2312 != var5)) {
            class19 var6 = new class19();
            var6.field186 = arg0;
            var6.field198 = arg0.field2306;
            field485.method2320(var6);
        }
    }

    @ObfuscatedName("ca.cx(Lfr;III)V")
    public static void method1876(class170 arg0, int arg1, int arg2) {
        if (arg0.field2202 == 0) {
            arg0.field2210 = arg0.field2206;
        } else if (arg0.field2202 == 1) {
            arg0.field2210 = (arg1 - arg0.field2212) / 2 + arg0.field2206;
        } else if (arg0.field2202 == 2) {
            arg0.field2210 = arg1 - arg0.field2212 - arg0.field2206;
        } else if (arg0.field2202 == 3) {
            arg0.field2210 = arg0.field2206 * arg1 >> 14;
        } else if (arg0.field2202 == 4) {
            arg0.field2210 = (arg0.field2206 * arg1 >> 14) + (arg1 - arg0.field2212) / 2;
        } else {
            arg0.field2210 = arg1 - arg0.field2212 - (arg0.field2206 * arg1 >> 14);
        }
        if (arg0.field2203 == 0) {
            arg0.field2298 = arg0.field2299;
        } else if (arg0.field2203 == 1) {
            arg0.field2298 = (arg2 - arg0.field2312) / 2 + arg0.field2299;
        } else if (arg0.field2203 == 2) {
            arg0.field2298 = arg2 - arg0.field2312 - arg0.field2299;
        } else if (arg0.field2203 == 3) {
            arg0.field2298 = arg0.field2299 * arg2 >> 14;
        } else if (arg0.field2203 == 4) {
            arg0.field2298 = (arg0.field2299 * arg2 >> 14) + (arg2 - arg0.field2312) / 2;
        } else {
            arg0.field2298 = arg2 - arg0.field2312 - (arg0.field2299 * arg2 >> 14);
        }
        if (!field456 || arg0.field2245 != 0) {
            return;
        }
        if (arg0.field2210 < 0) {
            arg0.field2210 = 0;
        } else if (arg0.field2212 + arg0.field2210 > arg1) {
            arg0.field2210 = arg1 - arg0.field2212;
        }
        if (arg0.field2298 < 0) {
            arg0.field2298 = 0;
        } else if (arg0.field2312 + arg0.field2298 > arg2) {
            arg0.field2298 = arg2 - arg0.field2312;
        }
    }

    @ObfuscatedName("i.dx(Lfr;IIIIIII)V")
    public static final void method24(class170 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field430) {
            field368 = 32;
        } else {
            field368 = 0;
        }
        field430 = false;
        if (class116.field1810 == 1 || !Statics.field770 && class116.field1810 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2219 -= 4;
                method1874(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2219 += 4;
                method1874(arg0);
            } else if (arg5 >= arg1 - field368 && arg5 < field368 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2219 = (arg4 - arg3) * var8 / var9;
                method1874(arg0);
                field430 = true;
            }
        }
        if (field484 == 0) {
            return;
        }
        int var10 = arg0.field2212;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2219 += field484 * 45;
            method1874(arg0);
        }
    }

    @ObfuscatedName("an.dq(IIIIII)V")
    public static final void method751(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field48[0].method3957(arg0, arg1);
        Statics.field48[1].method3957(arg0, arg1 + arg3 - 16);
        class220.method3884(arg0, arg1 + 16, 16, arg3 - 32, field363);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class220.method3884(arg0, arg1 + 16 + var6, 16, var5, field364);
        class220.method3893(arg0, arg1 + 16 + var6, var5, field377);
        class220.method3893(arg0 + 1, arg1 + 16 + var6, var5, field377);
        class220.method3876(arg0, arg1 + 16 + var6, 16, field377);
        class220.method3876(arg0, arg1 + 17 + var6, 16, field377);
        class220.method3893(arg0 + 15, arg1 + 16 + var6, var5, field365);
        class220.method3893(arg0 + 14, arg1 + 17 + var6, var5 - 1, field365);
        class220.method3876(arg0, arg1 + 15 + var6 + var5, 16, field365);
        class220.method3876(arg0 + 1, arg1 + 14 + var6 + var5, 15, field365);
    }

    @ObfuscatedName("fz.df(Lfr;I)Z")
    public static final boolean method3140(class170 arg0) {
        if (arg0.field2310 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2310.length; var1++) {
            int var2 = method1986(arg0, var1);
            int var3 = arg0.field2193[var1];
            if (arg0.field2310[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2310[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2310[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("dj.dj(Lfr;IB)I")
    public static final int method1986(class170 arg0, int arg1) {
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
                    var7 = field303[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field421[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field422[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class170 var11 = class170.method2518(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class199.method3070(var12).field3003 || field288)) {
                        for (int var13 = 0; var13 < var11.field2287.length; var13++) {
                            if (var12 + 1 == var11.field2287[var13]) {
                                var7 += var11.field2316[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class166.field2156[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class173.field2353[field421[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class166.field2156[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field85.field249;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class173.field2348[var14]) {
                            var7 += field421[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class170 var17 = class170.method2518(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class199.method3070(var18).field3003 || field288)) {
                        for (int var19 = 0; var19 < var17.field2287.length; var19++) {
                            if (var18 + 1 == var17.field2287[var19]) {
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
                    var7 = field560;
                }
                if (var6 == 13) {
                    int var20 = class166.field2156[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class166.method2904(var22);
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
                    var7 = (Statics.field85.field658 >> 7) + Statics.field221;
                }
                if (var6 == 19) {
                    var7 = (Statics.field85.field632 >> 7) + Statics.field21;
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

    @ObfuscatedName("dm.dm(IIIIIIIB)V")
    public static final void method1990(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (Statics.method2954(arg0)) {
            method3433(Statics.field2195[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("gg.de([Lfr;IIIIIIII)V")
    public static final void method3433(class170[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class170 var9 = arg0[var8];
            if (var9 != null && (!var9.field2227 || var9.field2245 == 0 || var9.field2277 || method113(var9) != 0 || field460 == var9 || var9.field2201 == 1338) && var9.field2207 == arg1 && (!var9.field2227 || !method612(var9))) {
                int var10 = var9.field2210 + arg6;
                int var11 = var9.field2298 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2245 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2245 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2212 + var10;
                    int var19 = var9.field2312 + var11;
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
                    int var22 = var9.field2212 + var10;
                    int var23 = var9.field2312 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field459 == var9) {
                    field420 = true;
                    field425 = var10;
                    field469 = var11;
                }
                if (!var9.field2227 || var12 < var14 && var13 < var15) {
                    int var24 = class116.field1803;
                    int var25 = class116.field1802 * 603852017;
                    if (class116.field1797 != 0) {
                        var24 = class116.field1809;
                        var25 = class116.field1799;
                    }
                    if (var9.field2201 == 1337) {
                        if (!field548 && !field424 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method1372(var24, var25, var12, var13);
                        }
                    } else if (var9.field2201 == 1338) {
                        method33(var9, var10, var11);
                    } else {
                        if (!field424 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var26 = var24 - var10;
                            int var27 = var25 - var11;
                            if (var9.field2200 == 1) {
                                method3028(var9.field2217, "", 24, 0, 0, var9.field2197);
                            }
                            if (var9.field2200 == 2 && !field550) {
                                String var28 = Statics.method790(var9);
                                if (var28 != null) {
                                    method3028(var28, class38.method3310(65280) + var9.field2313, 25, 0, -1, var9.field2197);
                                }
                            }
                            if (var9.field2200 == 3) {
                                method3028(class174.field2512, "", 26, 0, 0, var9.field2197);
                            }
                            if (var9.field2200 == 4) {
                                method3028(var9.field2217, "", 28, 0, 0, var9.field2197);
                            }
                            if (var9.field2200 == 5) {
                                method3028(var9.field2217, "", 29, 0, 0, var9.field2197);
                            }
                            if (var9.field2200 == 6 && field547 == null) {
                                method3028(var9.field2217, "", 30, 0, -1, var9.field2197);
                            }
                            if (var9.field2245 == 2) {
                                int var29 = 0;
                                for (int var30 = 0; var30 < var9.field2312; var30++) {
                                    for (int var31 = 0; var31 < var9.field2212; var31++) {
                                        int var32 = (var9.field2260 + 32) * var31;
                                        int var33 = (var9.field2314 + 32) * var30;
                                        if (var29 < 20) {
                                            var32 += var9.field2265[var29];
                                            var33 += var9.field2320[var29];
                                        }
                                        if (var26 >= var32 && var27 >= var33 && var26 < var32 + 32 && var27 < var33 + 32) {
                                            field285 = var29;
                                            Statics.field1535 = var9;
                                            if (var9.field2287[var29] > 0) {
                                                class199 var34 = class199.method3070(var9.field2287[var29] - 1);
                                                if (field439 == 1 && class171.method874(method113(var9))) {
                                                    if (Statics.field43 != var9.field2197 || Statics.field1733 != var29) {
                                                        method3028(class174.field2503, field440 + " " + class38.field781 + " " + class38.method3310(16748608) + var34.field2962, 31, var34.field2960, var29, var9.field2197);
                                                    }
                                                } else if (!field550 || !class171.method874(method113(var9))) {
                                                    String[] var35 = var34.field2966;
                                                    if (field457) {
                                                        var35 = method2900(var35);
                                                    }
                                                    int var36 = var34.method3532();
                                                    if (class171.method874(method113(var9))) {
                                                        for (int var37 = 4; var37 >= 3; var37--) {
                                                            boolean var38 = var36 == var37;
                                                            if (var35 != null && var35[var37] != null) {
                                                                byte var39;
                                                                if (var37 == 3) {
                                                                    var39 = 36;
                                                                } else {
                                                                    var39 = 37;
                                                                }
                                                                method920(var35[var37], class38.method3310(16748608) + var34.field2962, var39, var34.field2960, var29, var9.field2197, var38);
                                                            } else if (var37 == 4) {
                                                                method920(class174.field2357, class38.method3310(16748608) + var34.field2962, 37, var34.field2960, var29, var9.field2197, var38);
                                                            }
                                                        }
                                                    }
                                                    if (class171.method1171(method113(var9))) {
                                                        method3028(class174.field2503, class38.method3310(16748608) + var34.field2962, 38, var34.field2960, var29, var9.field2197);
                                                    }
                                                    if (class171.method874(method113(var9)) && var35 != null) {
                                                        for (int var40 = 2; var40 >= 0; var40--) {
                                                            boolean var41 = var36 == var40;
                                                            if (var35[var40] != null) {
                                                                byte var42 = 0;
                                                                if (var40 == 0) {
                                                                    var42 = 33;
                                                                }
                                                                if (var40 == 1) {
                                                                    var42 = 34;
                                                                }
                                                                if (var40 == 2) {
                                                                    var42 = 35;
                                                                }
                                                                method920(var35[var40], class38.method3310(16748608) + var34.field2962, var42, var34.field2960, var29, var9.field2197, var41);
                                                            }
                                                        }
                                                    }
                                                    String[] var43 = var9.field2188;
                                                    if (field457) {
                                                        var43 = method2900(var43);
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
                                                                method3028(var43[var44], class38.method3310(16748608) + var34.field2962, var45, var34.field2960, var29, var9.field2197);
                                                            }
                                                        }
                                                    }
                                                    method3028(class174.field2476, class38.method3310(16748608) + var34.field2962, 1005, var34.field2960, var29, var9.field2197);
                                                } else if ((Statics.field1909 & 0x10) == 16) {
                                                    method3028(field329, field351 + " " + class38.field781 + " " + class38.method3310(16748608) + var34.field2962, 32, var34.field2960, var29, var9.field2197);
                                                }
                                            }
                                        }
                                        var29++;
                                    }
                                }
                            }
                            if (var9.field2227) {
                                if (!field550) {
                                    for (int var46 = 9; var46 >= 5; var46--) {
                                        String var47;
                                        if (!class171.method3313(method113(var9), var46) && var9.field2289 == null) {
                                            var47 = null;
                                        } else if (var9.field2271 == null || var9.field2271.length <= var46 || var9.field2271[var46] == null || var9.field2271[var46].trim().length() == 0) {
                                            var47 = null;
                                        } else {
                                            var47 = var9.field2271[var46];
                                        }
                                        if (var47 != null) {
                                            method3028(var47, var9.field2270, 1007, var46 + 1, var9.field2321, var9.field2197);
                                        }
                                    }
                                    String var49 = Statics.method790(var9);
                                    if (var49 != null) {
                                        method3028(var49, var9.field2270, 25, 0, var9.field2321, var9.field2197);
                                    }
                                    for (int var50 = 4; var50 >= 0; var50--) {
                                        String var51;
                                        if (!class171.method3313(method113(var9), var50) && var9.field2289 == null) {
                                            var51 = null;
                                        } else if (var9.field2271 == null || var9.field2271.length <= var50 || var9.field2271[var50] == null || var9.field2271[var50].trim().length() == 0) {
                                            var51 = null;
                                        } else {
                                            var51 = var9.field2271[var50];
                                        }
                                        if (var51 != null) {
                                            method3028(var51, var9.field2270, 57, var50 + 1, var9.field2321, var9.field2197);
                                        }
                                    }
                                    int var53 = method113(var9);
                                    boolean var54 = (var53 & 0x1) != 0;
                                    if (var54) {
                                        method3028(class174.field2361, "", 30, 0, var9.field2321, var9.field2197);
                                    }
                                } else if (class171.method789(method113(var9)) && (Statics.field1909 & 0x20) == 32) {
                                    method3028(field329, field351 + " " + class38.field781 + " " + var9.field2270, 58, 0, var9.field2321, var9.field2197);
                                }
                            }
                        }
                        if (var9.field2245 == 0) {
                            if (!var9.field2227 && method612(var9) && Statics.field897 != var9) {
                                continue;
                            }
                            method3433(arg0, var9.field2197, var12, var13, var14, var15, var10 - var9.field2218, var11 - var9.field2219);
                            if (var9.field2282 != null) {
                                method3433(var9.field2282, var9.field2197, var12, var13, var14, var15, var10 - var9.field2218, var11 - var9.field2219);
                            }
                            class18 var55 = (class18) field447.method2280((long) var9.field2197);
                            if (var55 != null) {
                                if (var55.field180 == 0 && class116.field1803 >= var12 && class116.field1802 * 603852017 >= var13 && class116.field1803 < var14 && class116.field1802 * 603852017 < var15 && !field424 && !field456) {
                                    for (class19 var56 = (class19) field485.method2324(); var56 != null; var56 = (class19) field485.method2331()) {
                                        if (var56.field187) {
                                            var56.method2313();
                                            var56.field186.field2216 = false;
                                        }
                                    }
                                    if (Statics.field1920 == 0) {
                                        field459 = null;
                                        field460 = null;
                                    }
                                    if (!field424) {
                                        method3364();
                                    }
                                }
                                method1990(var55.field183, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2227) {
                            if (var9.field2281) {
                                if (class116.field1803 >= var12 && class116.field1802 * 603852017 >= var13 && class116.field1803 < var14 && class116.field1802 * 603852017 < var15) {
                                    for (class19 var57 = (class19) field485.method2324(); var57 != null; var57 = (class19) field485.method2331()) {
                                        if (var57.field187) {
                                            var57.method2313();
                                            var57.field186.field2216 = false;
                                        }
                                    }
                                    if (Statics.field1920 == 0) {
                                        field459 = null;
                                        field460 = null;
                                    }
                                    if (!field424) {
                                        field366[0] = class174.field2592;
                                        field431[0] = "";
                                        field465[0] = 1006;
                                        field362 = 1;
                                    }
                                }
                            } else if (var9.field2211 && class116.field1803 >= var12 && class116.field1802 * 603852017 >= var13 && class116.field1803 < var14 && class116.field1802 * 603852017 < var15) {
                                for (class19 var58 = (class19) field485.method2324(); var58 != null; var58 = (class19) field485.method2331()) {
                                    if (var58.field187 && var58.field186.field2259 == var58.field198) {
                                        var58.method2313();
                                    }
                                }
                            }
                            boolean var59;
                            if (class116.field1803 >= var12 && class116.field1802 * 603852017 >= var13 && class116.field1803 < var14 && class116.field1802 * 603852017 < var15) {
                                var59 = true;
                            } else {
                                var59 = false;
                            }
                            boolean var60 = false;
                            if ((class116.field1810 == 1 || !Statics.field770 && class116.field1810 == 4) && var59) {
                                var60 = true;
                            }
                            boolean var61 = false;
                            if ((class116.field1797 == 1 || !Statics.field770 && class116.field1797 == 4) && class116.field1809 >= var12 && class116.field1799 >= var13 && class116.field1809 < var14 && class116.field1799 < var15) {
                                var61 = true;
                            }
                            if (var61) {
                                method1410(var9, class116.field1809 - var10, class116.field1799 - var11);
                            }
                            if (field459 != null && field459 != var9 && var59 && class171.method941(method113(var9))) {
                                field564 = var9;
                            }
                            if (field460 == var9) {
                                field464 = true;
                                field507 = var10;
                                field466 = var11;
                            }
                            if (var9.field2277) {
                                if (var59 && field484 != 0 && var9.field2259 != null) {
                                    class19 var62 = new class19();
                                    var62.field187 = true;
                                    var62.field186 = var9;
                                    var62.field190 = field484;
                                    var62.field198 = var9.field2259;
                                    field485.method2320(var62);
                                }
                                if (field459 != null || Statics.field51 != null || field424) {
                                    var61 = false;
                                    var60 = false;
                                    var59 = false;
                                }
                                if (!var9.field2225 && var61) {
                                    var9.field2225 = true;
                                    if (var9.field2187 != null) {
                                        class19 var63 = new class19();
                                        var63.field187 = true;
                                        var63.field186 = var9;
                                        var63.field197 = class116.field1809 - var10;
                                        var63.field190 = class116.field1799 - var11;
                                        var63.field198 = var9.field2187;
                                        field485.method2320(var63);
                                    }
                                }
                                if (var9.field2225 && var60 && var9.field2280 != null) {
                                    class19 var64 = new class19();
                                    var64.field187 = true;
                                    var64.field186 = var9;
                                    var64.field197 = class116.field1803 - var10;
                                    var64.field190 = class116.field1802 * 603852017 - var11;
                                    var64.field198 = var9.field2280;
                                    field485.method2320(var64);
                                }
                                if (var9.field2225 && !var60) {
                                    var9.field2225 = false;
                                    if (var9.field2328 != null) {
                                        class19 var65 = new class19();
                                        var65.field187 = true;
                                        var65.field186 = var9;
                                        var65.field197 = class116.field1803 - var10;
                                        var65.field190 = class116.field1802 * 603852017 - var11;
                                        var65.field198 = var9.field2328;
                                        field487.method2320(var65);
                                    }
                                }
                                if (var60 && var9.field2331 != null) {
                                    class19 var66 = new class19();
                                    var66.field187 = true;
                                    var66.field186 = var9;
                                    var66.field197 = class116.field1803 - var10;
                                    var66.field190 = class116.field1802 * 603852017 - var11;
                                    var66.field198 = var9.field2331;
                                    field485.method2320(var66);
                                }
                                if (!var9.field2216 && var59) {
                                    var9.field2216 = true;
                                    if (var9.field2283 != null) {
                                        class19 var67 = new class19();
                                        var67.field187 = true;
                                        var67.field186 = var9;
                                        var67.field197 = class116.field1803 - var10;
                                        var67.field190 = class116.field1802 * 603852017 - var11;
                                        var67.field198 = var9.field2283;
                                        field485.method2320(var67);
                                    }
                                }
                                if (var9.field2216 && var59 && var9.field2268 != null) {
                                    class19 var68 = new class19();
                                    var68.field187 = true;
                                    var68.field186 = var9;
                                    var68.field197 = class116.field1803 - var10;
                                    var68.field190 = class116.field1802 * 603852017 - var11;
                                    var68.field198 = var9.field2268;
                                    field485.method2320(var68);
                                }
                                if (var9.field2216 && !var59) {
                                    var9.field2216 = false;
                                    if (var9.field2242 != null) {
                                        class19 var69 = new class19();
                                        var69.field187 = true;
                                        var69.field186 = var9;
                                        var69.field197 = class116.field1803 - var10;
                                        var69.field190 = class116.field1802 * 603852017 - var11;
                                        var69.field198 = var9.field2242;
                                        field487.method2320(var69);
                                    }
                                }
                                if (var9.field2296 != null) {
                                    class19 var70 = new class19();
                                    var70.field186 = var9;
                                    var70.field198 = var9.field2296;
                                    field486.method2320(var70);
                                }
                                if (var9.field2290 != null && field570 > var9.field2325) {
                                    if (var9.field2291 == null || field570 - var9.field2325 > 32) {
                                        class19 var75 = new class19();
                                        var75.field186 = var9;
                                        var75.field198 = var9.field2290;
                                        field485.method2320(var75);
                                    } else {
                                        label670: for (int var71 = var9.field2325; var71 < field570; var71++) {
                                            int var72 = field472[var71 & 0x1F];
                                            for (int var73 = 0; var73 < var9.field2291.length; var73++) {
                                                if (var9.field2291[var73] == var72) {
                                                    class19 var74 = new class19();
                                                    var74.field186 = var9;
                                                    var74.field198 = var9.field2290;
                                                    field485.method2320(var74);
                                                    break label670;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2325 = field570;
                                }
                                if (var9.field2292 != null && field475 > var9.field2326) {
                                    if (var9.field2293 == null || field475 - var9.field2326 > 32) {
                                        class19 var80 = new class19();
                                        var80.field186 = var9;
                                        var80.field198 = var9.field2292;
                                        field485.method2320(var80);
                                    } else {
                                        label646: for (int var76 = var9.field2326; var76 < field475; var76++) {
                                            int var77 = field474[var76 & 0x1F];
                                            for (int var78 = 0; var78 < var9.field2293.length; var78++) {
                                                if (var9.field2293[var78] == var77) {
                                                    class19 var79 = new class19();
                                                    var79.field186 = var9;
                                                    var79.field198 = var9.field2292;
                                                    field485.method2320(var79);
                                                    break label646;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2326 = field475;
                                }
                                if (var9.field2294 != null && field477 > var9.field2327) {
                                    if (var9.field2295 == null || field477 - var9.field2327 > 32) {
                                        class19 var85 = new class19();
                                        var85.field186 = var9;
                                        var85.field198 = var9.field2294;
                                        field485.method2320(var85);
                                    } else {
                                        label622: for (int var81 = var9.field2327; var81 < field477; var81++) {
                                            int var82 = field476[var81 & 0x1F];
                                            for (int var83 = 0; var83 < var9.field2295.length; var83++) {
                                                if (var9.field2295[var83] == var82) {
                                                    class19 var84 = new class19();
                                                    var84.field186 = var9;
                                                    var84.field198 = var9.field2294;
                                                    field485.method2320(var84);
                                                    break label622;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2327 = field477;
                                }
                                if (field444 > var9.field2324 && var9.field2297 != null) {
                                    class19 var86 = new class19();
                                    var86.field186 = var9;
                                    var86.field198 = var9.field2297;
                                    field485.method2320(var86);
                                }
                                if (field286 > var9.field2324 && var9.field2266 != null) {
                                    class19 var87 = new class19();
                                    var87.field186 = var9;
                                    var87.field198 = var9.field2266;
                                    field485.method2320(var87);
                                }
                                if (field514 > var9.field2324 && var9.field2302 != null) {
                                    class19 var88 = new class19();
                                    var88.field186 = var9;
                                    var88.field198 = var9.field2302;
                                    field485.method2320(var88);
                                }
                                if (field481 > var9.field2324 && var9.field2307 != null) {
                                    class19 var89 = new class19();
                                    var89.field186 = var9;
                                    var89.field198 = var9.field2307;
                                    field485.method2320(var89);
                                }
                                if (field482 > var9.field2324 && var9.field2308 != null) {
                                    class19 var90 = new class19();
                                    var90.field186 = var9;
                                    var90.field198 = var9.field2308;
                                    field485.method2320(var90);
                                }
                                if (field483 > var9.field2324 && var9.field2303 != null) {
                                    class19 var91 = new class19();
                                    var91.field186 = var9;
                                    var91.field198 = var9.field2303;
                                    field485.method2320(var91);
                                }
                                var9.field2324 = field471;
                                if (var9.field2300 != null) {
                                    for (int var92 = 0; var92 < field509; var92++) {
                                        class19 var93 = new class19();
                                        var93.field186 = var9;
                                        var93.field192 = field511[var92];
                                        var93.field196 = field510[var92];
                                        var93.field198 = var9.field2300;
                                        field485.method2320(var93);
                                    }
                                }
                            }
                        }
                        if (!var9.field2227 && field459 == null && Statics.field51 == null && !field424) {
                            if ((var9.field2318 >= 0 || var9.field2224 != 0) && class116.field1803 >= var12 && class116.field1802 * 603852017 >= var13 && class116.field1803 < var14 && class116.field1802 * 603852017 < var15) {
                                if (var9.field2318 >= 0) {
                                    Statics.field897 = arg0[var9.field2318];
                                } else {
                                    Statics.field897 = var9;
                                }
                            }
                            if (var9.field2245 == 8 && class116.field1803 >= var12 && class116.field1802 * 603852017 >= var13 && class116.field1803 < var14 && class116.field1802 * 603852017 < var15) {
                                Statics.field202 = var9;
                            }
                            if (var9.field2221 > var9.field2312) {
                                method24(var9, var9.field2212 + var10, var11, var9.field2312, var9.field2221, class116.field1803, class116.field1802 * 603852017);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cl.dd(IIB)V")
    public static final void method1859(int arg0, int arg1) {
        if (Statics.method2954(arg0)) {
            method1881(Statics.field2195[arg0], arg1);
        }
    }

    @ObfuscatedName("cc.da([Lfr;II)V")
    public static final void method1881(class170[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class170 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2245 == 0) {
                    if (var3.field2282 != null) {
                        method1881(var3.field2282, arg1);
                    }
                    class18 var4 = (class18) field447.method2280((long) var3.field2197);
                    if (var4 != null) {
                        method1859(var4.field183, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2198 != null) {
                    class19 var5 = new class19();
                    var5.field186 = var3;
                    var5.field198 = var3.field2198;
                    class33.method1885(var5);
                }
                if (arg1 == 1 && var3.field2305 != null) {
                    if (var3.field2321 >= 0) {
                        class170 var6 = class170.method2518(var3.field2197);
                        if (var6 == null || var6.field2282 == null || var3.field2321 >= var6.field2282.length || var6.field2282[var3.field2321] != var3) {
                            continue;
                        }
                    }
                    class19 var7 = new class19();
                    var7.field186 = var3;
                    var7.field198 = var3.field2305;
                    class33.method1885(var7);
                }
            }
        }
    }

    @ObfuscatedName("bz.dg(Lfr;IIB)V")
    public static final void method1410(class170 arg0, int arg1, int arg2) {
        if (field459 != null || field424 || arg0 == null || method930(arg0) == null) {
            return;
        }
        field459 = arg0;
        field460 = method930(arg0);
        field461 = arg1;
        field462 = arg2;
        Statics.field1920 = 0;
        field470 = false;
        int var3 = method111();
        if (var3 == -1) {
            return;
        }
        Statics.field2699 = new class39();
        Statics.field2699.field798 = field355[var3];
        Statics.field2699.field791 = field522[var3];
        Statics.field2699.field792 = field465[var3];
        Statics.field2699.field793 = field429[var3];
        Statics.field2699.field794 = field366[var3];
    }

    @ObfuscatedName("bk.dn(III)V")
    public static void method1161(int arg0, int arg1) {
        class39 var2 = Statics.field2699;
        method860(var2.field798, var2.field791, var2.field792, var2.field793, var2.field794, var2.field794, arg0, arg1);
        Statics.field2699 = null;
    }

    @ObfuscatedName("cd.dh(Lfr;I)V")
    public static void method1874(class170 arg0) {
        if (field490 == arg0.field2329) {
            field491[arg0.field2278] = true;
        }
    }

    @ObfuscatedName("o.db(I)V")
    public static void method188() {
        for (class18 var0 = (class18) field447.method2275(); var0 != null; var0 = (class18) field447.method2276()) {
            int var1 = var0.field183;
            if (Statics.method2954(var1)) {
                boolean var2 = true;
                class170[] var3 = Statics.field2195[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2227;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field1879;
                    class170 var6 = class170.method2518(var5);
                    if (var6 != null) {
                        method1874(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ax.du(Lfr;I)Lfr;")
    public static class170 method930(class170 arg0) {
        class170 var1 = method1388(arg0);
        if (var1 == null) {
            var1 = arg0.field2272;
        }
        return var1;
    }

    @ObfuscatedName("ep.dr([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2900(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("ab.dy(II)V")
    public static final void method643(int arg0) {
        if (!Statics.method2954(arg0)) {
            return;
        }
        class170[] var1 = Statics.field2195[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class170 var3 = var1[var2];
            if (var3 != null) {
                var3.field2319 = 0;
                var3.field2304 = 0;
            }
        }
    }

    @ObfuscatedName("fo.ds(II)V")
    public static final void method3145(int arg0) {
        if (Statics.method2954(arg0)) {
            method1863(Statics.field2195[arg0], -1);
        }
    }

    @ObfuscatedName("ct.dw([Lfr;II)V")
    public static final void method1863(class170[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class170 var3 = arg0[var2];
            if (var3 != null && var3.field2207 == arg1 && (!var3.field2227 || !method612(var3))) {
                if (var3.field2245 == 0) {
                    if (!var3.field2227 && method612(var3) && Statics.field897 != var3) {
                        continue;
                    }
                    method1863(arg0, var3.field2197);
                    if (var3.field2282 != null) {
                        method1863(var3.field2282, var3.field2197);
                    }
                    class18 var4 = (class18) field447.method2280((long) var3.field2197);
                    if (var4 != null) {
                        method3145(var4.field183);
                    }
                }
                if (var3.field2245 == 6) {
                    if (var3.field2244 != -1 || var3.field2263 != -1) {
                        boolean var5 = method3140(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2263;
                        } else {
                            var6 = var3.field2244;
                        }
                        if (var6 != -1) {
                            class202 var7 = class202.method262(var6);
                            var3.field2304 += field478;
                            while (var3.field2304 > var7.field3067[var3.field2319]) {
                                var3.field2304 -= var7.field3067[var3.field2319];
                                var3.field2319++;
                                if (var3.field2319 >= var7.field3073.length) {
                                    var3.field2319 -= var7.field3069;
                                    if (var3.field2319 < 0 || var3.field2319 >= var7.field3073.length) {
                                        var3.field2319 = 0;
                                    }
                                }
                                method1874(var3);
                            }
                        }
                    }
                    if (var3.field2253 != 0 && !var3.field2227) {
                        int var8 = var3.field2253 >> 16;
                        int var9 = var3.field2253 << 16 >> 16;
                        int var10 = field478 * var8;
                        int var11 = field478 * var9;
                        var3.field2248 = var3.field2248 + var10 & 0x7FF;
                        var3.field2249 = var3.field2249 + var11 & 0x7FF;
                        method1874(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("au.dl(II)V")
    public static final void method769(int arg0) {
        method188();
        for (class32 var1 = (class32) class32.field701.method2324(); var1 != null; var1 = (class32) class32.field701.method2331()) {
            if (var1.field715 != null) {
                var1.method700();
            }
        }
        int var2 = class188.method2024(arg0).field2768;
        if (var2 == 0) {
            return;
        }
        int var3 = class166.field2156[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class85.method1623(0.9D);
                ((class75) Statics.field1416).method1434(0.9D);
            }
            if (var3 == 2) {
                class85.method1623(0.8D);
                ((class75) Statics.field1416).method1434(0.8D);
            }
            if (var3 == 3) {
                class85.method1623(0.7D);
                ((class75) Statics.field1416).method1434(0.7D);
            }
            if (var3 == 4) {
                class85.method1623(0.6D);
                ((class75) Statics.field1416).method1434(0.6D);
            }
            class199.field2959.method2257();
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
            if (field523 != var4) {
                if (field523 == 0 && field524 != -1) {
                    class139.method2044(Statics.field123, field524, 0, var4, false);
                    field402 = false;
                } else if (var4 == 0) {
                    Statics.field801.method2506();
                    class139.field1916 = 1;
                    Statics.field1919 = null;
                    field402 = false;
                } else if (class139.field1916 == 0) {
                    Statics.field801.method2410(var4);
                } else {
                    Statics.field1562 = var4;
                }
                field523 = var4;
            }
        }
        if (var2 == 4) {
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
        if (var2 == 5) {
            field423 = var3;
        }
        if (var2 == 6) {
            field448 = var3;
        }
        if (var2 == 9) {
            field449 = var3;
        }
        if (var2 == 10) {
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
        if (var2 == 17) {
            field454 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field360 = (class41) class149.method784(class41.method116(), var3);
            if (field360 == null) {
                field360 = class41.field808;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field415 = -1;
            } else {
                field415 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field417 = (class41) class149.method784(class41.method116(), var3);
            if (field417 == null) {
                field417 = class41.field808;
            }
        }
    }

    @ObfuscatedName("cd.do(Lfr;I)V")
    public static final void method1873(class170 arg0) {
        int var1 = arg0.field2201;
        if (var1 == 324) {
            if (field390 == -1) {
                field390 = arg0.field2232;
                field300 = arg0.field2233;
            }
            if (field563.field2169) {
                arg0.field2232 = field390;
            } else {
                arg0.field2232 = field300;
            }
        } else if (var1 == 325) {
            if (field390 == -1) {
                field390 = arg0.field2232;
                field300 = arg0.field2233;
            }
            if (field563.field2169) {
                arg0.field2232 = field300;
            } else {
                arg0.field2232 = field390;
            }
        } else if (var1 == 327) {
            arg0.field2248 = 150;
            arg0.field2249 = (int) (Math.sin((double) field293 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2240 = 5;
            arg0.field2241 = 0;
        } else if (var1 == 328) {
            arg0.field2248 = 150;
            arg0.field2249 = (int) (Math.sin((double) field293 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2240 = 5;
            arg0.field2241 = 1;
        }
    }

    @ObfuscatedName("aw.dc(Lm;ZB)V")
    public static final void method679(class18 arg0, boolean arg1) {
        int var2 = arg0.field183;
        int var3 = (int) arg0.field1879;
        arg0.method2313();
        if (arg1) {
            class170.method1989(var2);
        }
        for (class134 var4 = (class134) field310.method2275(); var4 != null; var4 = (class134) field310.method2276()) {
            if ((var4.field1879 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method2313();
            }
        }
        class170 var5 = class170.method2518(var3);
        if (var5 != null) {
            method1874(var5);
        }
        method848();
        if (field452 != -1) {
            method1859(field452, 1);
        }
    }

    @ObfuscatedName("au.di(Lfr;B)Z")
    public static final boolean method761(class170 arg0) {
        int var1 = arg0.field2201;
        if (var1 == 205) {
            field338 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field563.method3047(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field563.method3037(var4, var5 == 1);
        }
        if (var1 == 324) {
            field563.method3038(false);
        }
        if (var1 == 325) {
            field563.method3038(true);
        }
        if (var1 == 326) {
            field328.method2936(175);
            field563.method3039(field328);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("j.dv(IIIILhq;Lfj;I)V")
    public static final void method229(int arg0, int arg1, int arg2, int arg3, class225 arg4, class165 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method1677(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field558 + field357 & 0x7FF;
        int var8 = class85.field1436[var7];
        int var9 = class85.field1433[var7];
        int var10 = var8 * 256 / (field343 + 256);
        int var11 = var9 * 256 / (field343 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field172.method4018(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("ce.dz(IIIILhq;Lfj;I)V")
    public static final void method1677(int arg0, int arg1, int arg2, int arg3, class225 arg4, class165 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field558 + field357 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class85.field1436[var6];
        int var9 = class85.field1433[var6];
        int var10 = var8 * 256 / (field343 + 256);
        int var11 = var9 * 256 / (field343 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method4013(arg5.field2149 / 2 + var12 - arg4.field3220 / 2, arg5.field2147 / 2 - var13 - arg4.field3221 / 2, arg0, arg1, arg5.field2149, arg5.field2147, arg5.field2150, arg5.field2146);
        } else {
            arg4.method4036(arg5.field2149 / 2 + arg0 + var12 - arg4.field3220 / 2, arg5.field2147 / 2 + arg1 - var13 - arg4.field3221 / 2);
        }
    }

    @ObfuscatedName("ao.dk(Ljava/lang/String;ZI)Z")
    public static boolean method954(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class205.method123(arg0, Statics.field287);
        for (int var3 = 0; var3 < field342; var3++) {
            if (var2.equalsIgnoreCase(class205.method123(field555[var3].field144, Statics.field287)) && (!arg1 || field555[var3].field150 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class205.method123(Statics.field85.field264, Statics.field287))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("h.dp(Ljava/lang/String;I)Z")
    public static boolean method83(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class205.method123(arg0, Statics.field287);
        for (int var2 = 0; var2 < field467; var2++) {
            class20 var3 = field291[var2];
            if (var1.equalsIgnoreCase(class205.method123(var3.field201, Statics.field287))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class205.method123(var3.field203, Statics.field287))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("cp.ew(Ljava/lang/String;ZB)V")
    public static final void method1907(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field467 < 100 || field408 == 1) || field467 >= 400) {
            class48.method2520(31, "", class174.field2578);
            return;
        }
        String var2 = class205.method123(arg0, Statics.field287);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field467; var3++) {
            class20 var4 = field291[var3];
            String var5 = class205.method123(var4.field201, Statics.field287);
            if (var5 != null && var5.equals(var2)) {
                class48.method2520(31, "", arg0 + class174.field2522);
                return;
            }
            if (var4.field203 != null) {
                String var6 = class205.method123(var4.field203, Statics.field287);
                if (var6 != null && var6.equals(var2)) {
                    class48.method2520(31, "", arg0 + class174.field2522);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field342; var7++) {
            class15 var8 = field555[var7];
            String var9 = class205.method123(var8.field144, Statics.field287);
            if (var9 != null && var9.equals(var2)) {
                class48.method2520(31, "", class174.field2624 + arg0 + class174.field2528);
                return;
            }
            if (var8.field147 != null) {
                String var10 = class205.method123(var8.field147, Statics.field287);
                if (var10 != null && var10.equals(var2)) {
                    class48.method2520(31, "", class174.field2624 + arg0 + class174.field2528);
                    return;
                }
            }
        }
        if (class205.method123(Statics.field85.field264, Statics.field287).equals(var2)) {
            class48.method2520(31, "", class174.field2524);
        } else {
            field328.method2936(50);
            field328.method2832(class154.method616(arg0));
            field328.method2715(arg0);
        }
    }

    @ObfuscatedName("w.ev(Ljava/lang/String;II)V")
    public static final void method195(String arg0, int arg1) {
        field328.method2936(203);
        field328.method2832(class154.method616(arg0) + 1);
        field328.method2715(arg0);
        field328.method2702(arg1);
    }

    @ObfuscatedName("hd.em(Ljava/lang/String;B)V")
    public static final void method3992(String arg0) {
        if (!arg0.equals("")) {
            field328.method2936(177);
            field328.method2832(class154.method616(arg0));
            field328.method2715(arg0);
        }
    }

    @ObfuscatedName("a.el(Lfr;I)I")
    public static int method113(class170 arg0) {
        class134 var1 = (class134) field310.method2280(((long) arg0.field2197 << 32) + (long) arg0.field2321);
        return var1 == null ? arg0.field2269 : var1.field1892;
    }

    @ObfuscatedName("bp.ex(Lfr;B)Lfr;")
    public static class170 method1388(class170 arg0) {
        int var1 = class171.method2956(method113(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class170.method2518(arg0.field2207);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("client.eb(Lfr;I)Z")
    public static boolean method612(class170 arg0) {
        if (field456) {
            if (method113(arg0) != 0) {
                return false;
            }
            if (arg0.field2245 == 0) {
                return false;
            }
        }
        return arg0.field2257;
    }

    @ObfuscatedName("cp.er(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method1900(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field296 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field296 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field296 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field296 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field296 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field227 != null) {
            var3 = "/p=" + Statics.field227;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field290 + "/a=" + Statics.field2645 + var3 + "/";
    }

    @ObfuscatedName("ae.eu(Leg;I)V")
    public static void method756(class154 arg0) {
        if (field322 != null) {
            arg0.method2672(field322, 0, field322.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class105.field1682.method1359(0L);
            class105.field1682.method1361(var1);
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
        arg0.method2672(var1, 0, var1.length);
    }
}

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
import java.util.Date;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class144 {

    @ObfuscatedName("client.f")
    public static boolean field488 = true;

    @ObfuscatedName("client.s")
    public static int field528 = 1;

    @ObfuscatedName("client.e")
    public static int field507 = 0;

    @ObfuscatedName("client.m")
    public static int field296 = 0;

    @ObfuscatedName("client.l")
    public static boolean field297 = false;

    @ObfuscatedName("client.h")
    public static boolean field298 = false;

    @ObfuscatedName("client.i")
    public static int field299 = 0;

    @ObfuscatedName("client.b")
    public static int field553 = 0;

    @ObfuscatedName("client.c")
    public static boolean field427 = true;

    @ObfuscatedName("client.d")
    public static int field304 = 0;

    @ObfuscatedName("client.p")
    public static long field305 = -1L;

    @ObfuscatedName("client.w")
    public static class108[] field360 = new class108[4];

    @ObfuscatedName("client.k")
    public static int field306 = -1;

    @ObfuscatedName("client.o")
    public static int field307 = -1;

    @ObfuscatedName("client.ad")
    public static int field308 = -1;

    @ObfuscatedName("client.at")
    public static boolean field309 = true;

    @ObfuscatedName("client.aw")
    public static boolean field310 = false;

    @ObfuscatedName("client.ax")
    public static int field311 = 0;

    @ObfuscatedName("client.ak")
    public static int field312 = 0;

    @ObfuscatedName("client.ah")
    public static int field313 = 0;

    @ObfuscatedName("client.ac")
    public static int field314 = 0;

    @ObfuscatedName("client.as")
    public static int field419 = 0;

    @ObfuscatedName("client.ao")
    public static int field316 = 0;

    @ObfuscatedName("client.am")
    public static int field317 = 0;

    @ObfuscatedName("client.ai")
    public static int field290 = 0;

    @ObfuscatedName("client.ab")
    public static int field319 = 0;

    @ObfuscatedName("client.aa")
    public static class21 field320 = class21.field590;

    @ObfuscatedName("client.ag")
    public static class21 field333 = class21.field590;

    @ObfuscatedName("client.av")
    public static int field322 = 0;

    @ObfuscatedName("client.aq")
    public static int field405 = 0;

    @ObfuscatedName("client.af")
    public static int field324 = 0;

    @ObfuscatedName("client.bb")
    public static int field325 = 0;

    @ObfuscatedName("client.be")
    public static int field336 = 0;

    @ObfuscatedName("client.bg")
    public static int field385 = 0;

    @ObfuscatedName("client.bc")
    public static int field422 = 0;

    @ObfuscatedName("client.bw")
    public static int field329 = 0;

    @ObfuscatedName("client.cs")
    public static class35[] field359 = new class35[32768];

    @ObfuscatedName("client.cj")
    public static int field332 = 0;

    @ObfuscatedName("client.cc")
    public static int[] field565 = new int[32768];

    @ObfuscatedName("client.ci")
    public static int field331 = 0;

    @ObfuscatedName("client.ct")
    public static int[] field335 = new int[250];

    @ObfuscatedName("client.cv")
    public static class122 field302 = new class122(5000);

    @ObfuscatedName("client.cu")
    public static class122 field478 = new class122(5000);

    @ObfuscatedName("client.cm")
    public static class122 field473 = new class122(15000);

    @ObfuscatedName("client.cq")
    public static int field570 = 0;

    @ObfuscatedName("client.cx")
    public static int field489 = 0;

    @ObfuscatedName("client.ck")
    public static int field341 = 0;

    @ObfuscatedName("client.cp")
    public static int field342 = 0;

    @ObfuscatedName("client.cb")
    public static int field343 = 0;

    @ObfuscatedName("client.cy")
    public static int field344 = 0;

    @ObfuscatedName("client.cf")
    public static int field345 = 0;

    @ObfuscatedName("client.co")
    public static int field346 = 0;

    @ObfuscatedName("client.cn")
    public static boolean field347 = false;

    @ObfuscatedName("client.da")
    public static int field445 = 0;

    @ObfuscatedName("client.dh")
    public static int field349 = 1;

    @ObfuscatedName("client.de")
    public static int field350 = 0;

    @ObfuscatedName("client.du")
    public static int field479 = 1;

    @ObfuscatedName("client.do")
    public static int field352 = 0;

    @ObfuscatedName("client.dv")
    public static boolean field354 = false;

    @ObfuscatedName("client.dg")
    public static int[][][] field355 = new int[4][13][13];

    @ObfuscatedName("client.db")
    public static final int[] field398 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dr")
    public static int field357 = 0;

    @ObfuscatedName("client.df")
    public static int field358 = 2;

    @ObfuscatedName("client.dz")
    public static int field380 = 0;

    @ObfuscatedName("client.dm")
    public static int field556 = 2;

    @ObfuscatedName("client.dj")
    public static int field361 = 0;

    @ObfuscatedName("client.ek")
    public static int field362 = 1;

    @ObfuscatedName("client.et")
    public static int field363 = 0;

    @ObfuscatedName("client.ea")
    public static int field547 = 0;

    @ObfuscatedName("client.ei")
    public static int field365 = 2;

    @ObfuscatedName("client.ey")
    public static int field366 = 0;

    @ObfuscatedName("client.ef")
    public static int field450 = 1;

    @ObfuscatedName("client.eh")
    public static int field368 = 0;

    @ObfuscatedName("client.eu")
    public static int field410 = 0;

    @ObfuscatedName("client.eo")
    public static int field425 = 2301979;

    @ObfuscatedName("client.ev")
    public static int field374 = 5063219;

    @ObfuscatedName("client.er")
    public static int field375 = 3353893;

    @ObfuscatedName("client.eb")
    public static int field376 = 7759444;

    @ObfuscatedName("client.eg")
    public static boolean field328 = false;

    @ObfuscatedName("client.fg")
    public static int field378 = 0;

    @ObfuscatedName("client.fe")
    public static int field555 = 128;

    @ObfuscatedName("client.fb")
    public static int field496 = 0;

    @ObfuscatedName("client.fm")
    public static int field381 = 0;

    @ObfuscatedName("client.fl")
    public static int field538 = 0;

    @ObfuscatedName("client.fz")
    public static int field476 = 0;

    @ObfuscatedName("client.fn")
    public static int field384 = 0;

    @ObfuscatedName("client.fq")
    public static int field334 = 50;

    @ObfuscatedName("client.fh")
    public static int field353 = 0;

    @ObfuscatedName("client.fa")
    public static boolean field387 = false;

    @ObfuscatedName("client.fv")
    public static int field388 = 0;

    @ObfuscatedName("client.fk")
    public static int field389 = 0;

    @ObfuscatedName("client.fx")
    public static int field390 = 50;

    @ObfuscatedName("client.fj")
    public static int[] field382 = new int[field390];

    @ObfuscatedName("client.fy")
    public static int[] field392 = new int[field390];

    @ObfuscatedName("client.fd")
    public static int[] field393 = new int[field390];

    @ObfuscatedName("client.fo")
    public static int[] field394 = new int[field390];

    @ObfuscatedName("client.fs")
    public static int[] field395 = new int[field390];

    @ObfuscatedName("client.fi")
    public static int[] field576 = new int[field390];

    @ObfuscatedName("client.gw")
    public static int[] field397 = new int[field390];

    @ObfuscatedName("client.ge")
    public static String[] field412 = new String[field390];

    @ObfuscatedName("client.gp")
    public static int[][] field399 = new int[104][104];

    @ObfuscatedName("client.gu")
    public static int field400 = 0;

    @ObfuscatedName("client.gh")
    public static int field401 = -1;

    @ObfuscatedName("client.gm")
    public static int field402 = -1;

    @ObfuscatedName("client.gk")
    public static int field403 = 0;

    @ObfuscatedName("client.gv")
    public static int field404 = 0;

    @ObfuscatedName("client.gc")
    public static int field356 = 0;

    @ObfuscatedName("client.gt")
    public static int field406 = 0;

    @ObfuscatedName("client.gi")
    public static int field407 = 0;

    @ObfuscatedName("client.gj")
    public static int field351 = 0;

    @ObfuscatedName("client.gr")
    public static int field409 = 0;

    @ObfuscatedName("client.gd")
    public static int field511 = 0;

    @ObfuscatedName("client.gf")
    public static int field494 = 0;

    @ObfuscatedName("client.gn")
    public static int field550 = 0;

    @ObfuscatedName("client.ga")
    public static boolean field413 = false;

    @ObfuscatedName("client.gz")
    public static int field414 = 0;

    @ObfuscatedName("client.gq")
    public static int field415 = 0;

    @ObfuscatedName("client.gx")
    public static class3[] field416 = new class3[2048];

    @ObfuscatedName("client.gs")
    public static int field417 = -1;

    @ObfuscatedName("client.hm")
    public static int field460 = 0;

    @ObfuscatedName("client.hb")
    public static int field578 = 0;

    @ObfuscatedName("client.hh")
    public static int[] field411 = new int[1000];

    @ObfuscatedName("client.hg")
    public static final int[] field526 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ho")
    public static String[] field433 = new String[8];

    @ObfuscatedName("client.he")
    public static boolean[] field521 = new boolean[8];

    @ObfuscatedName("client.hy")
    public static int[] field435 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hr")
    public static int field522 = -1;

    @ObfuscatedName("client.ha")
    public static class199[][][] field420 = new class199[4][104][104];

    @ObfuscatedName("client.hp")
    public static class199 field428 = new class199();

    @ObfuscatedName("client.hq")
    public static class199 field386 = new class199();

    @ObfuscatedName("client.hl")
    public static class199 field430 = new class199();

    @ObfuscatedName("client.hs")
    public static int[] field431 = new int[25];

    @ObfuscatedName("client.ht")
    public static int[] field338 = new int[25];

    @ObfuscatedName("client.hk")
    public static int[] field291 = new int[25];

    @ObfuscatedName("client.hd")
    public static int field434 = 0;

    @ObfuscatedName("client.hn")
    public static boolean field471 = false;

    @ObfuscatedName("client.hi")
    public static int field436 = 0;

    @ObfuscatedName("client.hf")
    public static int[] field437 = new int[500];

    @ObfuscatedName("client.is")
    public static int[] field438 = new int[500];

    @ObfuscatedName("client.ij")
    public static int[] field303 = new int[500];

    @ObfuscatedName("client.iv")
    public static int[] field440 = new int[500];

    @ObfuscatedName("client.if")
    public static String[] field441 = new String[500];

    @ObfuscatedName("client.ia")
    public static String[] field446 = new String[500];

    @ObfuscatedName("client.ih")
    public static int field443 = -1;

    @ObfuscatedName("client.ir")
    public static int field444 = -1;

    @ObfuscatedName("client.il")
    public static int field495 = 0;

    @ObfuscatedName("client.ic")
    public static int field396 = 50;

    @ObfuscatedName("client.ib")
    public static int field447 = 0;

    @ObfuscatedName("client.it")
    public static String field448 = null;

    @ObfuscatedName("client.im")
    public static boolean field449 = false;

    @ObfuscatedName("client.io")
    public static int field383 = -1;

    @ObfuscatedName("client.ig")
    public static int field451 = -1;

    @ObfuscatedName("client.ix")
    public static String field452 = null;

    @ObfuscatedName("client.iw")
    public static String field453 = null;

    @ObfuscatedName("client.iq")
    public static int field454 = -1;

    @ObfuscatedName("client.iu")
    public static class196 field455 = new class196(8);

    @ObfuscatedName("client.jz")
    public static int field456 = 0;

    @ObfuscatedName("client.jh")
    public static int field457 = 0;

    @ObfuscatedName("client.jd")
    public static class173 field432 = null;

    @ObfuscatedName("client.jg")
    public static int field459 = 0;

    @ObfuscatedName("client.jn")
    public static int field337 = 0;

    @ObfuscatedName("client.jw")
    public static int field461 = 0;

    @ObfuscatedName("client.jp")
    public static int field462 = -1;

    @ObfuscatedName("client.jb")
    public static boolean field472 = false;

    @ObfuscatedName("client.js")
    public static boolean field464 = false;

    @ObfuscatedName("client.jk")
    public static boolean field465 = false;

    @ObfuscatedName("client.jc")
    public static class173 field466 = null;

    @ObfuscatedName("client.jr")
    public static class173 field467 = null;

    @ObfuscatedName("client.jl")
    public static class173 field567 = null;

    @ObfuscatedName("client.jt")
    public static int field469 = 0;

    @ObfuscatedName("client.jm")
    public static int field470 = 0;

    @ObfuscatedName("client.jx")
    public static class173 field369 = null;

    @ObfuscatedName("client.jv")
    public static boolean field499 = false;

    @ObfuscatedName("client.ju")
    public static int field481 = -1;

    @ObfuscatedName("client.jf")
    public static int field474 = -1;

    @ObfuscatedName("client.jj")
    public static boolean field475 = false;

    @ObfuscatedName("client.jo")
    public static int field424 = -1;

    @ObfuscatedName("client.jy")
    public static int field477 = -1;

    @ObfuscatedName("client.ja")
    public static boolean field566 = false;

    @ObfuscatedName("client.kw")
    public static int field480 = 1;

    @ObfuscatedName("client.ko")
    public static int[] field339 = new int[32];

    @ObfuscatedName("client.kz")
    public static int field482 = 0;

    @ObfuscatedName("client.kb")
    public static int[] field468 = new int[32];

    @ObfuscatedName("client.kd")
    public static int field484 = 0;

    @ObfuscatedName("client.kq")
    public static int[] field485 = new int[32];

    @ObfuscatedName("client.ks")
    public static int field486 = 0;

    @ObfuscatedName("client.kv")
    public static int field487 = 0;

    @ObfuscatedName("client.kj")
    public static int field497 = 0;

    @ObfuscatedName("client.kt")
    public static int field545 = 0;

    @ObfuscatedName("client.ka")
    public static int field490 = 0;

    @ObfuscatedName("client.kn")
    public static int field491 = 0;

    @ObfuscatedName("client.kf")
    public static int field492 = 0;

    @ObfuscatedName("client.ku")
    public static int field493 = 0;

    @ObfuscatedName("client.kp")
    public static class199 field293 = new class199();

    @ObfuscatedName("client.kc")
    public static class199 field294 = new class199();

    @ObfuscatedName("client.kl")
    public static class199 field321 = new class199();

    @ObfuscatedName("client.kx")
    public static class196 field367 = new class196(512);

    @ObfuscatedName("client.ky")
    public static int field498 = 0;

    @ObfuscatedName("client.kh")
    public static int field323 = -2;

    @ObfuscatedName("client.li")
    public static boolean[] field500 = new boolean[100];

    @ObfuscatedName("client.lc")
    public static boolean[] field501 = new boolean[100];

    @ObfuscatedName("client.lj")
    public static boolean[] field502 = new boolean[100];

    @ObfuscatedName("client.lv")
    public static int[] field503 = new int[100];

    @ObfuscatedName("client.lg")
    public static int[] field516 = new int[100];

    @ObfuscatedName("client.lx")
    public static int[] field505 = new int[100];

    @ObfuscatedName("client.lu")
    public static int[] field506 = new int[100];

    @ObfuscatedName("client.la")
    public static int field523 = 0;

    @ObfuscatedName("client.lb")
    public static long field508 = 0L;

    @ObfuscatedName("client.le")
    public static boolean field509 = true;

    @ObfuscatedName("client.lp")
    public static int field418 = 765;

    @ObfuscatedName("client.lk")
    public static int field519 = 1;

    @ObfuscatedName("client.ln")
    public static int[] field517 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lm")
    public static int field513 = 0;

    @ObfuscatedName("client.ly")
    public static int field483 = 0;

    @ObfuscatedName("client.lf")
    public static String field515 = "";

    @ObfuscatedName("client.ls")
    public static long[] field340 = new long[100];

    @ObfuscatedName("client.lo")
    public static int field562 = 0;

    @ObfuscatedName("client.lq")
    public static int field518 = 0;

    @ObfuscatedName("client.mr")
    public static int[] field549 = new int[128];

    @ObfuscatedName("client.mt")
    public static int[] field520 = new int[128];

    @ObfuscatedName("client.mi")
    public static long field564 = -1L;

    @ObfuscatedName("client.mh")
    public static String field439 = null;

    @ObfuscatedName("client.me")
    public static String field315 = null;

    @ObfuscatedName("client.mv")
    public static int field524 = -1;

    @ObfuscatedName("client.md")
    public static int field525 = 0;

    @ObfuscatedName("client.mp")
    public static int[] field364 = new int[1000];

    @ObfuscatedName("client.mw")
    public static int[] field527 = new int[1000];

    @ObfuscatedName("client.mu")
    public static class79[] field318 = new class79[1000];

    @ObfuscatedName("client.mj")
    public static int field529 = 0;

    @ObfuscatedName("client.ms")
    public static int field530 = 0;

    @ObfuscatedName("client.mq")
    public static int field531 = 0;

    @ObfuscatedName("client.mf")
    public static int field532 = 255;

    @ObfuscatedName("client.mn")
    public static int field533 = -1;

    @ObfuscatedName("client.mm")
    public static boolean field534 = false;

    @ObfuscatedName("client.nz")
    public static int field535 = 127;

    @ObfuscatedName("client.nb")
    public static int field536 = 127;

    @ObfuscatedName("client.nw")
    public static int field537 = 0;

    @ObfuscatedName("client.nn")
    public static int[] field327 = new int[50];

    @ObfuscatedName("client.nk")
    public static int[] field539 = new int[50];

    @ObfuscatedName("client.nv")
    public static int[] field540 = new int[50];

    @ObfuscatedName("client.nq")
    public static int[] field504 = new int[50];

    @ObfuscatedName("client.nh")
    public static class59[] field542 = new class59[50];

    @ObfuscatedName("client.nt")
    public static boolean field543 = false;

    @ObfuscatedName("client.ob")
    public static boolean[] field391 = new boolean[5];

    @ObfuscatedName("client.or")
    public static int[] field426 = new int[5];

    @ObfuscatedName("client.oy")
    public static int[] field512 = new int[5];

    @ObfuscatedName("client.ox")
    public static int[] field548 = new int[5];

    @ObfuscatedName("client.od")
    public static int[] field423 = new int[5];

    @ObfuscatedName("client.ot")
    public static short field442 = 256;

    @ObfuscatedName("client.oq")
    public static short field551 = 205;

    @ObfuscatedName("client.oe")
    public static short field552 = 256;

    @ObfuscatedName("client.ok")
    public static short field458 = 320;

    @ObfuscatedName("client.ol")
    public static short field554 = 1;

    @ObfuscatedName("client.oa")
    public static short field373 = 32767;

    @ObfuscatedName("client.oh")
    public static short field326 = 1;

    @ObfuscatedName("client.og")
    public static short field557 = 32767;

    @ObfuscatedName("client.oj")
    public static int field558 = 0;

    @ObfuscatedName("client.om")
    public static int field559 = 0;

    @ObfuscatedName("client.oi")
    public static int field560 = 0;

    @ObfuscatedName("client.os")
    public static int field561 = 0;

    @ObfuscatedName("client.oc")
    public static int field348 = 0;

    @ObfuscatedName("client.ou")
    public static int field563 = 0;

    @ObfuscatedName("client.op")
    public static int field370 = 0;

    @ObfuscatedName("client.ov")
    public static class18[] field514 = new class18[400];

    @ObfuscatedName("client.on")
    public static class195 field429 = new class195();

    @ObfuscatedName("client.of")
    public static int field510 = 0;

    @ObfuscatedName("client.oz")
    public static class8[] field569 = new class8[400];

    @ObfuscatedName("client.pj")
    public static class179 field379 = new class179();

    @ObfuscatedName("client.py")
    public static int field571 = -1;

    @ObfuscatedName("client.pf")
    public static int field572 = -1;

    @ObfuscatedName("client.pn")
    public static class220[] field573 = new class220[8];

    @ObfuscatedName("client.pl")
    public static long field574 = -1L;

    @ObfuscatedName("client.pi")
    public static long field575 = -1L;

    @ObfuscatedName("client.ph")
    public static final class11 field292 = new class11();

    @ObfuscatedName("client.pk")
    public static int[] field577 = new int[50];

    @ObfuscatedName("client.pb")
    public static int[] field301 = new int[50];

    @ObfuscatedName("client.f(I)V")
    public final void method256() {
    }

    public final void init() {
        if (!this.method2841()) {
            return;
        }
        class190[] var1 = class190.method145();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class190 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3050);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3050)) {
                    case 1:
                        if (var4.equalsIgnoreCase(class2.field17)) {
                            field297 = true;
                        } else {
                            field297 = false;
                        }
                        break;
                    case 2:
                        if (var4.equalsIgnoreCase(class2.field17)) {
                        }
                        break;
                    case 3:
                        Statics.field59 = var4;
                    case 4:
                    case 5:
                    case 11:
                    default:
                        break;
                    case 6:
                        field296 = Integer.parseInt(var4);
                        break;
                    case 7:
                        Statics.field275 = (class154) class109.method2942(class154.method698(), Integer.parseInt(var4));
                        if (Statics.field275 == class154.field2272) {
                            Statics.field2063 = class212.field3131;
                        } else {
                            Statics.field2063 = class212.field3135;
                        }
                        break;
                    case 8:
                        Statics.field463 = Integer.parseInt(var4);
                        break;
                    case 9:
                        field507 = Integer.parseInt(var4);
                        break;
                    case 10:
                        Statics.field300 = Integer.parseInt(var4);
                        break;
                    case 12:
                        field528 = Integer.parseInt(var4);
                        break;
                    case 13:
                        int var5 = Integer.parseInt(var4);
                        class153[] var6 = new class153[] { class153.field2259, class153.field2257, class153.field2266, class153.field2258 };
                        class153[] var7 = var6;
                        int var8 = 0;
                        class153 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class153 var9 = var7[var8];
                            if (var9.field2261 == var5) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field295 = var10;
                        break;
                    case 14:
                        Statics.field3115 = var4;
                        break;
                    case 15:
                        field299 = Integer.parseInt(var4);
                }
            }
        }
        method2272();
        Statics.field769 = this.getCodeBase().getHost();
        String var11 = Statics.field295.field2260;
        byte var12 = 0;
        try {
            Statics.field1620 = 16;
            Statics.field2079 = var12;
            try {
                Statics.field2227 = System.getProperty("os.name");
            } catch (Exception var32) {
                Statics.field2227 = "Unknown";
            }
            Statics.field1987 = Statics.field2227.toLowerCase();
            try {
                Statics.field2162 = System.getProperty("user.home");
                if (Statics.field2162 != null) {
                    Statics.field2162 = Statics.field2162 + "/";
                }
            } catch (Exception var31) {
            }
            try {
                if (Statics.field1987.startsWith("win")) {
                    if (Statics.field2162 == null) {
                        Statics.field2162 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2162 == null) {
                    Statics.field2162 = System.getenv("HOME");
                }
                if (Statics.field2162 != null) {
                    Statics.field2162 = Statics.field2162 + "/";
                }
            } catch (Exception var30) {
            }
            if (Statics.field2162 == null) {
                Statics.field2162 = "~/";
            }
            Statics.field13 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2162, "/tmp/", "" };
            Statics.field2014 = new String[] { ".jagex_cache_" + Statics.field2079, ".file_store_" + Statics.field2079 };
            label155: for (int var16 = 0; var16 < 4; var16++) {
                Statics.field2220 = class149.method779("oldschool", var11, var16);
                if (!Statics.field2220.exists()) {
                    Statics.field2220.mkdirs();
                }
                File[] var17 = Statics.field2220.listFiles();
                if (var17 == null) {
                    break;
                }
                File[] var18 = var17;
                int var19 = 0;
                while (true) {
                    if (var19 >= var18.length) {
                        break label155;
                    }
                    File var20 = var18[var19];
                    if (!class149.method2814(var20, false)) {
                        break;
                    }
                    var19++;
                }
            }
            class135.method555(Statics.field2220);
            try {
                File var21 = new File(Statics.field2162, "random.dat");
                if (var21.exists()) {
                    class149.field2224 = new class228(new class227(var21, "rw", 25L), 24, 0);
                } else {
                    label135: for (int var22 = 0; var22 < Statics.field2014.length; var22++) {
                        for (int var23 = 0; var23 < Statics.field13.length; var23++) {
                            File var24 = new File(Statics.field13[var23] + Statics.field2014[var22] + File.separatorChar + "random.dat");
                            if (var24.exists()) {
                                class149.field2224 = new class228(new class227(var24, "rw", 25L), 24, 0);
                                break label135;
                            }
                        }
                    }
                }
                if (class149.field2224 == null) {
                    RandomAccessFile var25 = new RandomAccessFile(var21, "rw");
                    int var26 = var25.read();
                    var25.seek(0L);
                    var25.write(var26);
                    var25.seek(0L);
                    var25.close();
                    class149.field2224 = new class228(new class227(var21, "rw", 25L), 24, 0);
                }
            } catch (IOException var33) {
            }
            class149.field2226 = new class228(new class227(class135.method567("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class149.field2222 = new class228(new class227(class135.method567("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field3222 = new class228[Statics.field1620];
            for (int var28 = 0; var28 < Statics.field1620; var28++) {
                Statics.field3222[var28] = new class228(new class227(class135.method567("main_file_cache.idx" + var28), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var34) {
            class148.method643((String) null, var34);
        }
        Statics.field541 = this;
        this.method2839(765, 503, 109);
    }

    @ObfuscatedName("de.y(B)V")
    public static final void method2272() {
        class86.field1501 = false;
        field298 = false;
    }

    @ObfuscatedName("client.e(I)V")
    public final void method401() {
        Statics.field1351 = field296 == 0 ? 43594 : field528 + 40000;
        Statics.field1613 = field296 == 0 ? 443 : field528 + 50000;
        Statics.field801 = Statics.field1351;
        Statics.field1866 = class174.field2878;
        Statics.field2028 = class174.field2881;
        Statics.field2909 = class174.field2879;
        Statics.field2915 = class174.field2880;
        if (Statics.field2081.toLowerCase().indexOf("microsoft") == -1) {
            class137.field2119[44] = 71;
            class137.field2119[45] = 26;
            class137.field2119[46] = 72;
            class137.field2119[47] = 73;
            class137.field2119[59] = 57;
            class137.field2119[61] = 27;
            class137.field2119[91] = 42;
            class137.field2119[92] = 74;
            class137.field2119[93] = 43;
            class137.field2119[192] = 28;
            class137.field2119[222] = 58;
            class137.field2119[520] = 59;
        } else {
            class137.field2119[186] = 57;
            class137.field2119[187] = 27;
            class137.field2119[188] = 71;
            class137.field2119[189] = 26;
            class137.field2119[190] = 72;
            class137.field2119[191] = 73;
            class137.field2119[192] = 58;
            class137.field2119[219] = 42;
            class137.field2119[220] = 74;
            class137.field2119[221] = 43;
            class137.field2119[222] = 59;
            class137.field2119[223] = 28;
        }
        class137.method200(Statics.field1043);
        class140.method2064(Statics.field1043);
        Statics.field1895 = class131.method177();
        if (Statics.field1895 != null) {
            Statics.field1895.method2671(Statics.field1043);
        }
        Statics.field221 = new class134(255, class149.field2226, class149.field2222, 500000);
        Statics.field1549 = class9.method2140();
        Statics.field2615 = this.getToolkit().getSystemClipboard();
        class138.method613(this, Statics.field2890);
        if (field296 != 0) {
            field310 = true;
        }
        int var1 = Statics.field1549.field134;
        field508 = 0L;
        if (var1 >= 2) {
            field509 = true;
        } else {
            field509 = false;
        }
        method1775();
        if (field553 >= 25) {
            field302.method2586(78);
            class122 var2 = field302;
            int var3 = field509 ? 2 : 1;
            var2.method2330(var3);
            field302.method2331(Statics.field108);
            field302.method2331(Statics.field750);
        }
        field2191 = true;
    }

    @ObfuscatedName("client.g(B)V")
    public final void method246() {
        field304++;
        this.method249();
        class170.method144();
        class183.method2935();
        method143();
        class137.method646();
        class140.method2619();
        if (Statics.field1895 != null) {
            int var1 = Statics.field1895.method2667();
            field493 = var1;
        }
        if (field553 == 0) {
            method2930();
            Statics.method2910();
        } else if (field553 == 5) {
            class32.method2675(this);
            method2930();
            Statics.method2910();
        } else if (field553 == 10 || field553 == 11) {
            class32.method2675(this);
        } else if (field553 == 20) {
            class32.method2675(this);
            method574();
        } else if (field553 == 25) {
            method190(false);
            field445 = 0;
            boolean var2 = true;
            for (int var3 = 0; var3 < Statics.field2995.length; var3++) {
                if (Statics.field2580[var3] != -1 && Statics.field2995[var3] == null) {
                    Statics.field2995[var3] = Statics.field1089.method3025(Statics.field2580[var3], 0);
                    if (Statics.field2995[var3] == null) {
                        var2 = false;
                        field445++;
                    }
                }
                if (Statics.field191[var3] != -1 && Statics.field215[var3] == null) {
                    Statics.field215[var3] = Statics.field1089.method3073(Statics.field191[var3], 0, Statics.field242[var3]);
                    if (Statics.field215[var3] == null) {
                        var2 = false;
                        field445++;
                    }
                }
            }
            if (var2) {
                field350 = 0;
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2995.length; var5++) {
                    byte[] var6 = Statics.field215[var5];
                    if (var6 != null) {
                        int var7 = (Statics.field1952[var5] >> 8) * 64 - Statics.field2215;
                        int var8 = (Statics.field1952[var5] & 0xFF) * 64 - Statics.field258;
                        if (field354) {
                            var7 = 10;
                            var8 = 10;
                        }
                        var4 &= class6.method931(var6, var7, var8);
                    }
                }
                if (var4) {
                    if (field352 != 0) {
                        method3494(class157.field2556 + class2.field20 + class2.field14 + 100 + "%" + class2.field18, true);
                    }
                    method143();
                    method3300();
                    method143();
                    Statics.field1397.method1783();
                    method143();
                    System.gc();
                    for (int var9 = 0; var9 < 4; var9++) {
                        field360[var9].method2235();
                    }
                    for (int var10 = 0; var10 < 4; var10++) {
                        for (int var11 = 0; var11 < 104; var11++) {
                            for (int var12 = 0; var12 < 104; var12++) {
                                class6.field91[var10][var11][var12] = 0;
                            }
                        }
                    }
                    method143();
                    class6.method589();
                    int var13 = Statics.field2995.length;
                    class24.method50();
                    method190(true);
                    if (!field354) {
                        int var14 = 0;
                        label3479: while (true) {
                            if (var14 >= var13) {
                                for (int var28 = 0; var28 < var13; var28++) {
                                    int var29 = (Statics.field1952[var28] >> 8) * 64 - Statics.field2215;
                                    int var30 = (Statics.field1952[var28] & 0xFF) * 64 - Statics.field258;
                                    byte[] var31 = Statics.field2995[var28];
                                    if (var31 == null && Statics.field149 < 800) {
                                        method143();
                                        class6.method47(var29, var30, 64, 64);
                                    }
                                }
                                method190(true);
                                int var32 = 0;
                                while (true) {
                                    if (var32 >= var13) {
                                        break label3479;
                                    }
                                    byte[] var33 = Statics.field215[var32];
                                    if (var33 != null) {
                                        int var34 = (Statics.field1952[var32] >> 8) * 64 - Statics.field2215;
                                        int var35 = (Statics.field1952[var32] & 0xFF) * 64 - Statics.field258;
                                        method143();
                                        class6.method3168(var33, var34, var35, Statics.field1397, field360);
                                    }
                                    var32++;
                                }
                            }
                            int var15 = (Statics.field1952[var14] >> 8) * 64 - Statics.field2215;
                            int var16 = (Statics.field1952[var14] & 0xFF) * 64 - Statics.field258;
                            byte[] var17 = Statics.field2995[var14];
                            if (var17 != null) {
                                method143();
                                int var18 = Statics.field874 * 8 - 48;
                                int var19 = Statics.field149 * 8 - 48;
                                class108[] var20 = field360;
                                int var21 = 0;
                                label3476: while (true) {
                                    if (var21 >= 4) {
                                        class119 var24 = new class119(var17);
                                        int var25 = 0;
                                        while (true) {
                                            if (var25 >= 4) {
                                                break label3476;
                                            }
                                            for (int var26 = 0; var26 < 64; var26++) {
                                                for (int var27 = 0; var27 < 64; var27++) {
                                                    class6.method174(var24, var25, var15 + var26, var16 + var27, var18, var19, 0);
                                                }
                                            }
                                            var25++;
                                        }
                                    }
                                    for (int var22 = 0; var22 < 64; var22++) {
                                        for (int var23 = 0; var23 < 64; var23++) {
                                            if (var15 + var22 > 0 && var15 + var22 < 103 && var16 + var23 > 0 && var16 + var23 < 103) {
                                                var20[var21].field1889[var15 + var22][var16 + var23] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var21++;
                                }
                            }
                            var14++;
                        }
                    }
                    if (field354) {
                        int var36 = 0;
                        label3425: while (true) {
                            if (var36 >= 4) {
                                for (int var66 = 0; var66 < 13; var66++) {
                                    for (int var67 = 0; var67 < 13; var67++) {
                                        int var68 = field355[0][var66][var67];
                                        if (var68 == -1) {
                                            class6.method47(var66 * 8, var67 * 8, 8, 8);
                                        }
                                    }
                                }
                                method190(true);
                                int var69 = 0;
                                while (true) {
                                    if (var69 >= 4) {
                                        break label3425;
                                    }
                                    method143();
                                    for (int var70 = 0; var70 < 13; var70++) {
                                        for (int var71 = 0; var71 < 13; var71++) {
                                            int var72 = field355[var69][var70][var71];
                                            if (var72 != -1) {
                                                int var73 = var72 >> 24 & 0x3;
                                                int var74 = var72 >> 1 & 0x3;
                                                int var75 = var72 >> 14 & 0x3FF;
                                                int var76 = var72 >> 3 & 0x7FF;
                                                int var77 = (var75 / 8 << 8) + var76 / 8;
                                                for (int var78 = 0; var78 < Statics.field1952.length; var78++) {
                                                    if (Statics.field1952[var78] == var77 && Statics.field215[var78] != null) {
                                                        class6.method2752(Statics.field215[var78], var69, var70 * 8, var71 * 8, var73, (var75 & 0x7) * 8, (var76 & 0x7) * 8, var74, Statics.field1397, field360);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var69++;
                                }
                            }
                            method143();
                            for (int var37 = 0; var37 < 13; var37++) {
                                for (int var38 = 0; var38 < 13; var38++) {
                                    boolean var39 = false;
                                    int var40 = field355[var36][var37][var38];
                                    if (var40 != -1) {
                                        int var41 = var40 >> 24 & 0x3;
                                        int var42 = var40 >> 1 & 0x3;
                                        int var43 = var40 >> 14 & 0x3FF;
                                        int var44 = var40 >> 3 & 0x7FF;
                                        int var45 = (var43 / 8 << 8) + var44 / 8;
                                        for (int var46 = 0; var46 < Statics.field1952.length; var46++) {
                                            if (Statics.field1952[var46] == var45 && Statics.field2995[var46] != null) {
                                                byte[] var47 = Statics.field2995[var46];
                                                int var48 = var37 * 8;
                                                int var49 = var38 * 8;
                                                int var50 = (var43 & 0x7) * 8;
                                                int var51 = (var44 & 0x7) * 8;
                                                class108[] var52 = field360;
                                                for (int var53 = 0; var53 < 8; var53++) {
                                                    for (int var54 = 0; var54 < 8; var54++) {
                                                        if (var48 + var53 > 0 && var48 + var53 < 103 && var49 + var54 > 0 && var49 + var54 < 103) {
                                                            var52[var36].field1889[var48 + var53][var49 + var54] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class119 var55 = new class119(var47);
                                                for (int var56 = 0; var56 < 4; var56++) {
                                                    for (int var57 = 0; var57 < 64; var57++) {
                                                        for (int var58 = 0; var58 < 64; var58++) {
                                                            if (var41 == var56 && var57 >= var50 && var57 < var50 + 8 && var58 >= var51 && var58 < var51 + 8) {
                                                                class6.method174(var55, var36, var48 + class177.method101(var57 & 0x7, var58 & 0x7, var42), var49 + class177.method180(var57 & 0x7, var58 & 0x7, var42), 0, 0, var42);
                                                            } else {
                                                                class6.method174(var55, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var39 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var39) {
                                        int var59 = var36;
                                        int var60 = var37 * 8;
                                        int var61 = var38 * 8;
                                        for (int var62 = 0; var62 < 8; var62++) {
                                            for (int var63 = 0; var63 < 8; var63++) {
                                                class6.field87[var59][var60 + var62][var61 + var63] = 0;
                                            }
                                        }
                                        if (var60 > 0) {
                                            for (int var64 = 1; var64 < 8; var64++) {
                                                class6.field87[var59][var60][var61 + var64] = class6.field87[var59][var60 - 1][var61 + var64];
                                            }
                                        }
                                        if (var61 > 0) {
                                            for (int var65 = 1; var65 < 8; var65++) {
                                                class6.field87[var59][var60 + var65][var61] = class6.field87[var59][var60 + var65][var61 - 1];
                                            }
                                        }
                                        if (var60 > 0 && class6.field87[var59][var60 - 1][var61] != 0) {
                                            class6.field87[var59][var60][var61] = class6.field87[var59][var60 - 1][var61];
                                        } else if (var61 > 0 && class6.field87[var59][var60][var61 - 1] != 0) {
                                            class6.field87[var59][var60][var61] = class6.field87[var59][var60][var61 - 1];
                                        } else if (var60 > 0 && var61 > 0 && class6.field87[var59][var60 - 1][var61 - 1] != 0) {
                                            class6.field87[var59][var60][var61] = class6.field87[var59][var60 - 1][var61 - 1];
                                        }
                                    }
                                }
                            }
                            var36++;
                        }
                    }
                    method190(true);
                    method3300();
                    method143();
                    class6.method2836(Statics.field1397, field360);
                    method190(true);
                    int var79 = class6.field73;
                    if (var79 > Statics.field1079) {
                        var79 = Statics.field1079;
                    }
                    if (var79 < Statics.field1079 - 1) {
                        int var80 = Statics.field1079 - 1;
                    }
                    if (field298) {
                        Statics.field1397.method1790(class6.field73);
                    } else {
                        Statics.field1397.method1790(0);
                    }
                    for (int var81 = 0; var81 < 104; var81++) {
                        for (int var82 = 0; var82 < 104; var82++) {
                            method3117(var81, var82);
                        }
                    }
                    method143();
                    method165();
                    class41.field934.method3515();
                    if (Statics.field1218 != null) {
                        field302.method2586(27);
                        field302.method2496(1057001181);
                    }
                    if (!field354) {
                        int var83 = (Statics.field874 - 6) / 8;
                        int var84 = (Statics.field874 + 6) / 8;
                        int var85 = (Statics.field149 - 6) / 8;
                        int var86 = (Statics.field149 + 6) / 8;
                        for (int var87 = var83 - 1; var87 <= var84 + 1; var87++) {
                            for (int var88 = var85 - 1; var88 <= var86 + 1; var88++) {
                                if (var87 < var83 || var87 > var84 || var88 < var85 || var88 > var86) {
                                    Statics.field1089.method3045("m" + var87 + "_" + var88);
                                    Statics.field1089.method3045("l" + var87 + "_" + var88);
                                }
                            }
                        }
                    }
                    method10(30);
                    method143();
                    Statics.field75 = (byte[][][]) null;
                    Statics.field76 = (byte[][][]) null;
                    Statics.field77 = (byte[][][]) null;
                    Statics.field74 = (byte[][][]) null;
                    Statics.field81 = (int[][][]) null;
                    Statics.field79 = (byte[][][]) null;
                    Statics.field72 = (int[][]) null;
                    Statics.field1352 = null;
                    Statics.field2698 = null;
                    Statics.field3120 = null;
                    Statics.field241 = null;
                    Statics.field3167 = null;
                    field302.method2586(30);
                    Statics.method2910();
                } else {
                    field352 = 2;
                }
            } else {
                field352 = 1;
            }
        }
        if (field553 == 30) {
            if (field311 > 1) {
                field311--;
            }
            if (field346 > 0) {
                field346--;
            }
            if (field347) {
                field347 = false;
                if (field346 > 0) {
                    method3697();
                } else {
                    method10(40);
                    Statics.field2070 = Statics.field2913;
                    Statics.field2913 = null;
                }
            } else {
                if (!field471) {
                    field441[0] = class157.field2547;
                    field446[0] = "";
                    field303[0] = 1006;
                    field436 = 1;
                }
                for (int var89 = 0; var89 < 100; var89++) {
                    boolean var90;
                    if (Statics.field2913 == null) {
                        var90 = false;
                    } else {
                        label3711: {
                            try {
                                int var91 = Statics.field2913.method2819();
                                if (var91 == 0) {
                                    var90 = false;
                                    break label3711;
                                }
                                if (field489 == -1) {
                                    Statics.field2913.method2820(field473.field1981, 0, 1);
                                    field473.field1980 = 0;
                                    field489 = field473.method2585();
                                    field570 = class188.field3030[field489];
                                    var91--;
                                }
                                if (field570 == -1) {
                                    if (var91 <= 0) {
                                        var90 = false;
                                        break label3711;
                                    }
                                    Statics.field2913.method2820(field473.field1981, 0, 1);
                                    field570 = field473.field1981[0] & 0xFF;
                                    var91--;
                                }
                                if (field570 == -2) {
                                    if (var91 <= 1) {
                                        var90 = false;
                                        break label3711;
                                    }
                                    Statics.field2913.method2820(field473.field1981, 0, 2);
                                    field473.field1980 = 0;
                                    field570 = field473.method2347();
                                    var91 -= 2;
                                }
                                if (var91 < field570) {
                                    var90 = false;
                                    break label3711;
                                }
                                field473.field1980 = 0;
                                Statics.field2913.method2820(field473.field1981, 0, field570);
                                field341 = 0;
                                field345 = field344;
                                field344 = field343;
                                field343 = field489;
                                if (field489 == 227) {
                                    method778(false);
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 111) {
                                    int var92 = field473.method2380();
                                    int var93 = field473.method2523();
                                    int var94 = field473.method2350();
                                    class173 var95 = class173.method2041(var94);
                                    var95.field2798 = (var92 << 16) + var93;
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 169) {
                                    int var96 = field473.method2412();
                                    if (field473.method2412() == 0) {
                                        field573[var96] = new class220();
                                        field473.field1980 += 18;
                                    } else {
                                        field473.field1980--;
                                        field573[var96] = new class220(field473, false);
                                    }
                                    field490 = field480;
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 122) {
                                    Statics.field127 = class130.method188(field473.method2412());
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 199) {
                                    int var97 = field473.method2412();
                                    String var98 = field473.method2353();
                                    int var99 = field473.method2475();
                                    if (var99 >= 1 && var99 <= 8) {
                                        if (var98.equalsIgnoreCase("null")) {
                                            var98 = null;
                                        }
                                        field433[var99 - 1] = var98;
                                        field521[var99 - 1] = var97 == 0;
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 184 || field489 == 244 || field489 == 108 || field489 == 112 || field489 == 96 || field489 == 240 || field489 == 100 || field489 == 117 || field489 == 200 || field489 == 215) {
                                    method192();
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 247) {
                                    int var100 = field473.method2348();
                                    int var101 = field473.method2388();
                                    class173 var102 = class173.method2041(var101);
                                    if (var102.field2789 != var100 || var100 == -1) {
                                        var102.field2789 = var100;
                                        var102.field2809 = 0;
                                        var102.field2865 = 0;
                                        method723(var102);
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 144) {
                                    String var103 = field473.method2353();
                                    long var104 = (long) field473.method2347();
                                    long var106 = (long) field473.method2349();
                                    class152 var108 = (class152) class109.method2942(class152.method3685(), field473.method2412());
                                    long var109 = (var104 << 32) + var106;
                                    boolean var111 = false;
                                    for (int var112 = 0; var112 < 100; var112++) {
                                        if (field340[var112] == var109) {
                                            var111 = true;
                                            break;
                                        }
                                    }
                                    if (method628(var103)) {
                                        var111 = true;
                                    }
                                    if (!var111 && field415 == 0) {
                                        field340[field562] = var109;
                                        field562 = (field562 + 1) % 100;
                                        class122 var113 = field473;
                                        String var117;
                                        try {
                                            int var114 = var113.method2492();
                                            if (var114 > 32767) {
                                                var114 = 32767;
                                            }
                                            byte[] var115 = new byte[var114];
                                            var113.field1980 += Statics.field3178.method2274(var113.field1981, var113.field1980, var115, 0, var114);
                                            String var116 = class165.method984(var115, 0, var114);
                                            var117 = var116;
                                        } catch (Exception var544) {
                                            var117 = "Cabbage";
                                        }
                                        String var120 = class223.method3845(class163.method3499(var117));
                                        byte var121;
                                        if (var108.field2250) {
                                            var121 = 7;
                                        } else {
                                            var121 = 3;
                                        }
                                        if (var108.field2249 == -1) {
                                            class12.method2769(var121, var103, var120);
                                        } else {
                                            int var123 = var108.field2249;
                                            String var124 = "<img=" + var123 + ">";
                                            class12.method2769(var121, var124 + var103, var120);
                                        }
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 17) {
                                    field545 = field480;
                                    if (field570 == 0) {
                                        field439 = null;
                                        field315 = null;
                                        Statics.field152 = 0;
                                        Statics.field1004 = null;
                                        field489 = -1;
                                        var90 = true;
                                        break label3711;
                                    }
                                    field315 = field473.method2353();
                                    long var125 = field473.method2351();
                                    long var127 = var125;
                                    String var129;
                                    if (var125 <= 0L || var125 >= 6582952005840035281L) {
                                        var129 = null;
                                    } else if (var125 % 37L == 0L) {
                                        var129 = null;
                                    } else {
                                        int var130 = 0;
                                        for (long var131 = var125; var131 != 0L; var131 /= 37L) {
                                            var130++;
                                        }
                                        StringBuilder var133 = new StringBuilder(var130);
                                        while (var127 != 0L) {
                                            long var134 = var127;
                                            var127 /= 37L;
                                            var133.append(class162.field2631[(int) (var134 - var127 * 37L)]);
                                        }
                                        var129 = var133.reverse().toString();
                                    }
                                    field439 = var129;
                                    Statics.field185 = field473.method2540();
                                    int var136 = field473.method2412();
                                    if (var136 == 255) {
                                        field489 = -1;
                                        var90 = true;
                                        break label3711;
                                    }
                                    Statics.field152 = var136;
                                    class25[] var137 = new class25[100];
                                    for (int var138 = 0; var138 < Statics.field152; var138++) {
                                        var137[var138] = new class25();
                                        var137[var138].field625 = field473.method2353();
                                        var137[var138].field628 = class164.method2658(var137[var138].field625, Statics.field2063);
                                        var137[var138].field630 = field473.method2347();
                                        var137[var138].field627 = field473.method2540();
                                        field473.method2353();
                                        if (var137[var138].field625.equals(Statics.field2254.field41)) {
                                            Statics.field163 = var137[var138].field627;
                                        }
                                    }
                                    boolean var139 = false;
                                    int var140 = Statics.field152;
                                    while (var140 > 0) {
                                        boolean var141 = true;
                                        var140--;
                                        for (int var142 = 0; var142 < var140; var142++) {
                                            if (var137[var142].field628.compareTo(var137[var142 + 1].field628) > 0) {
                                                class25 var143 = var137[var142];
                                                var137[var142] = var137[var142 + 1];
                                                var137[var142 + 1] = var143;
                                                var141 = false;
                                            }
                                        }
                                        if (var141) {
                                            break;
                                        }
                                    }
                                    Statics.field1004 = var137;
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 24) {
                                    field531 = field473.method2412();
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 7) {
                                    int var144 = field473.method2389();
                                    Statics.field1357 = Statics.field2057.method2706(var144);
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 180) {
                                    Statics.field67 = field473.method2371();
                                    Statics.field125 = field473.method2412();
                                    while (field473.field1980 < field570) {
                                        field489 = field473.method2412();
                                        method192();
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 20) {
                                    field543 = true;
                                    Statics.field276 = field473.method2412();
                                    Statics.field544 = field473.method2412();
                                    Statics.field161 = field473.method2347();
                                    Statics.field2725 = field473.method2412();
                                    Statics.field2216 = field473.method2412();
                                    if (Statics.field2216 >= 100) {
                                        int var145 = Statics.field276 * 128 + 64;
                                        int var146 = Statics.field544 * 128 + 64;
                                        int var147 = method53(var145, var146, Statics.field1079) - Statics.field161;
                                        int var148 = var145 - Statics.field1038;
                                        int var149 = var147 - Statics.field714;
                                        int var150 = var146 - Statics.field255;
                                        int var151 = (int) Math.sqrt((double) (var148 * var148 + var150 * var150));
                                        Statics.field220 = (int) (Math.atan2((double) var149, (double) var151) * 325.949D) & 0x7FF;
                                        Statics.field194 = (int) (Math.atan2((double) var148, (double) var150) * -325.949D) & 0x7FF;
                                        if (Statics.field220 < 128) {
                                            Statics.field220 = 128;
                                        }
                                        if (Statics.field220 > 383) {
                                            Statics.field220 = 383;
                                        }
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 158) {
                                    int var152 = field473.method2380();
                                    if (var152 == 65535) {
                                        var152 = -1;
                                    }
                                    if (var152 == -1 && !field534) {
                                        Statics.field2943.method3382();
                                        class183.field2948 = 1;
                                        Statics.field2947 = null;
                                    } else if (var152 != -1 && field533 != var152 && field532 != 0 && !field534) {
                                        class183.method713(2, Statics.field2055, var152, 0, field532, false);
                                    }
                                    field533 = var152;
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 59) {
                                    int var153 = field473.method2379();
                                    if (var153 == 65535) {
                                        var153 = -1;
                                    }
                                    int var154 = field473.method2511();
                                    method637(var153, var154);
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 172) {
                                    method777(false);
                                    field473.method2585();
                                    int var155 = field473.method2347();
                                    class33.method623(field473, var155);
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 149) {
                                    method777(true);
                                    field473.method2585();
                                    int var156 = field473.method2347();
                                    class33.method623(field473, var156);
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 104) {
                                    int var157 = field473.method2389();
                                    int var158 = field473.method2389();
                                    class4 var159 = (class4) field455.method3539((long) var157);
                                    class4 var160 = (class4) field455.method3539((long) var158);
                                    if (var160 != null) {
                                        method2279(var160, var159 == null || var159.field57 != var160.field57);
                                    }
                                    if (var159 != null) {
                                        var159.method3661();
                                        field455.method3546(var159, (long) var158);
                                    }
                                    class173 var161 = class173.method2041(var157);
                                    if (var161 != null) {
                                        method723(var161);
                                    }
                                    class173 var162 = class173.method2041(var158);
                                    if (var162 != null) {
                                        method723(var162);
                                        method15(Statics.field2851[var162.field2801 >>> 16], var162, true);
                                    }
                                    if (field454 != -1) {
                                        int var163 = field454;
                                        if (Statics.method2150(var163)) {
                                            method2705(Statics.field2851[var163], 1);
                                        }
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 10) {
                                    String var164 = field473.method2353();
                                    int var165 = field473.method2347();
                                    byte var166 = field473.method2540();
                                    boolean var167 = false;
                                    if (var166 == -128) {
                                        var167 = true;
                                    }
                                    if (var167) {
                                        if (Statics.field152 == 0) {
                                            field489 = -1;
                                            var90 = true;
                                            break label3711;
                                        }
                                        boolean var168 = false;
                                        int var169;
                                        for (var169 = 0; var169 < Statics.field152 && (!Statics.field1004[var169].field625.equals(var164) || Statics.field1004[var169].field630 != var165); var169++) {
                                        }
                                        if (var169 < Statics.field152) {
                                            while (var169 < Statics.field152 - 1) {
                                                Statics.field1004[var169] = Statics.field1004[var169 + 1];
                                                var169++;
                                            }
                                            Statics.field152--;
                                            Statics.field1004[Statics.field152] = null;
                                        }
                                    } else {
                                        field473.method2353();
                                        class25 var170 = new class25();
                                        var170.field625 = var164;
                                        var170.field628 = class164.method2658(var170.field625, Statics.field2063);
                                        var170.field630 = var165;
                                        var170.field627 = var166;
                                        int var171;
                                        for (var171 = Statics.field152 - 1; var171 >= 0; var171--) {
                                            int var172 = Statics.field1004[var171].field628.compareTo(var170.field628);
                                            if (var172 == 0) {
                                                Statics.field1004[var171].field630 = var165;
                                                Statics.field1004[var171].field627 = var166;
                                                if (var164.equals(Statics.field2254.field41)) {
                                                    Statics.field163 = var166;
                                                }
                                                field545 = field480;
                                                field489 = -1;
                                                var90 = true;
                                                break label3711;
                                            }
                                            if (var172 < 0) {
                                                break;
                                            }
                                        }
                                        if (Statics.field152 >= Statics.field1004.length) {
                                            field489 = -1;
                                            var90 = true;
                                            break label3711;
                                        }
                                        for (int var173 = Statics.field152 - 1; var173 > var171; var173--) {
                                            Statics.field1004[var173 + 1] = Statics.field1004[var173];
                                        }
                                        if (Statics.field152 == 0) {
                                            Statics.field1004 = new class25[100];
                                        }
                                        Statics.field1004[var171 + 1] = var170;
                                        Statics.field152++;
                                        if (var164.equals(Statics.field2254.field41)) {
                                            Statics.field163 = var166;
                                        }
                                    }
                                    field545 = field480;
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 32) {
                                    int var174 = field473.method2379();
                                    if (var174 == 65535) {
                                        var174 = -1;
                                    }
                                    int var175 = field473.method2478();
                                    int var176 = field473.method2379();
                                    if (var176 == 65535) {
                                        var176 = -1;
                                    }
                                    int var177 = field473.method2388();
                                    for (int var178 = var176; var178 <= var174; var178++) {
                                        long var179 = ((long) var177 << 32) + (long) var178;
                                        class208 var181 = field367.method3539(var179);
                                        if (var181 != null) {
                                            var181.method3661();
                                        }
                                        field367.method3546(new class201(var175), var179);
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 234) {
                                    field370 = 1;
                                    field497 = field480;
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 69) {
                                    int var182 = field473.method2350();
                                    int var183 = field473.method2350();
                                    if (Statics.field629 == null || !Statics.field629.isValid()) {
                                        try {
                                            Iterator var184 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                            while (var184.hasNext()) {
                                                GarbageCollectorMXBean var185 = (GarbageCollectorMXBean) var184.next();
                                                if (var185.isValid()) {
                                                    Statics.field629 = var185;
                                                    field575 = -1L;
                                                    field574 = -1L;
                                                }
                                            }
                                        } catch (Throwable var547) {
                                        }
                                    }
                                    long var187 = class115.method207();
                                    int var189 = -1;
                                    if (Statics.field629 != null) {
                                        long var190 = Statics.field629.getCollectionTime();
                                        if (field574 != -1L) {
                                            long var192 = var190 - field574;
                                            long var194 = var187 - field575;
                                            if (var194 != 0L) {
                                                var189 = (int) (var192 * 100L / var194);
                                            }
                                        }
                                        field574 = var190;
                                        field575 = var187;
                                    }
                                    field302.method2586(186);
                                    field302.method2330(field2179);
                                    field302.method2506(var182);
                                    field302.method2385(var183);
                                    field302.method2368(var189);
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 28) {
                                    class211.method2633(field473, field570);
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 73) {
                                    int var196 = field473.method2523();
                                    int var197 = field473.method2388();
                                    int var198 = field473.method2347();
                                    int var199 = field473.method2523();
                                    class173 var200 = class173.method2041(var197);
                                    if (var200.field2793 != var198 || var200.field2803 != var199 || var200.field2796 != var196) {
                                        var200.field2793 = var198;
                                        var200.field2803 = var199;
                                        var200.field2796 = var196;
                                        method723(var200);
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 19) {
                                    int var201 = field473.method2523();
                                    field454 = var201;
                                    int var202 = field454;
                                    int var203 = Statics.field108;
                                    int var204 = Statics.field750;
                                    if (Statics.method2150(var202)) {
                                        Statics.method12(Statics.field2851[var202], -1, var203, var204, false);
                                    }
                                    method1518(var201);
                                    class37.method2230(field454);
                                    for (int var205 = 0; var205 < 100; var205++) {
                                        field500[var205] = true;
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 248) {
                                    String var206 = field473.method2353();
                                    Object[] var207 = new Object[var206.length() + 1];
                                    for (int var208 = var206.length() - 1; var208 >= 0; var208--) {
                                        if (var206.charAt(var208) == 's') {
                                            var207[var208 + 1] = field473.method2353();
                                        } else {
                                            var207[var208 + 1] = Integer.valueOf(field473.method2350());
                                        }
                                    }
                                    var207[0] = Integer.valueOf(field473.method2350());
                                    class1 var209 = new class1();
                                    var209.field9 = var207;
                                    class37.method2928(var209);
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 120) {
                                    while (field473.field1980 < field570) {
                                        boolean var210 = field473.method2412() == 1;
                                        String var211 = field473.method2353();
                                        String var212 = field473.method2353();
                                        int var213 = field473.method2347();
                                        int var214 = field473.method2412();
                                        int var215 = field473.method2412();
                                        boolean var216 = (var215 & 0x2) != 0;
                                        boolean var217 = (var215 & 0x1) != 0;
                                        if (var213 > 0) {
                                            field473.method2353();
                                            field473.method2412();
                                            field473.method2350();
                                        }
                                        field473.method2353();
                                        for (int var218 = 0; var218 < field563; var218++) {
                                            class18 var219 = field514[var218];
                                            if (var210) {
                                                if (var212.equals(var219.field262)) {
                                                    var219.field262 = var211;
                                                    var219.field249 = var212;
                                                    var211 = null;
                                                    break;
                                                }
                                            } else if (var211.equals(var219.field262)) {
                                                if (var219.field250 != var213) {
                                                    boolean var220 = true;
                                                    for (class39 var221 = (class39) field429.method3532(); var221 != null; var221 = (class39) field429.method3533()) {
                                                        if (var221.field873.equals(var211)) {
                                                            if (var213 != 0 && var221.field875 == 0) {
                                                                var221.method3655();
                                                                var220 = false;
                                                            } else if (var213 == 0 && var221.field875 != 0) {
                                                                var221.method3655();
                                                                var220 = false;
                                                            }
                                                        }
                                                    }
                                                    if (var220) {
                                                        field429.method3531(new class39(var211, var213));
                                                    }
                                                    var219.field250 = var213;
                                                }
                                                var219.field249 = var212;
                                                var219.field251 = var214;
                                                var219.field252 = var216;
                                                var219.field264 = var217;
                                                var211 = null;
                                                break;
                                            }
                                        }
                                        if (var211 != null && field563 < 400) {
                                            class18 var222 = new class18();
                                            field514[field563] = var222;
                                            var222.field262 = var211;
                                            var222.field249 = var212;
                                            var222.field250 = var213;
                                            var222.field251 = var214;
                                            var222.field252 = var216;
                                            var222.field264 = var217;
                                            field563++;
                                        }
                                    }
                                    field370 = 2;
                                    field497 = field480;
                                    boolean var223 = false;
                                    int var224 = field563;
                                    while (var224 > 0) {
                                        boolean var225 = true;
                                        var224--;
                                        for (int var226 = 0; var226 < var224; var226++) {
                                            boolean var227 = false;
                                            class18 var228 = field514[var226];
                                            class18 var229 = field514[var226 + 1];
                                            if (field528 != var228.field250 && field528 == var229.field250) {
                                                var227 = true;
                                            }
                                            if (!var227 && var228.field250 == 0 && var229.field250 != 0) {
                                                var227 = true;
                                            }
                                            if (!var227 && !var228.field252 && var229.field252) {
                                                var227 = true;
                                            }
                                            if (!var227 && !var228.field264 && var229.field264) {
                                                var227 = true;
                                            }
                                            if (var227) {
                                                class18 var230 = field514[var226];
                                                field514[var226] = field514[var226 + 1];
                                                field514[var226 + 1] = var230;
                                                var225 = false;
                                            }
                                        }
                                        if (var225) {
                                            break;
                                        }
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 110) {
                                    int var231 = field473.method2347();
                                    if (var231 == 65535) {
                                        var231 = -1;
                                    }
                                    int var232 = field473.method2350();
                                    int var233 = field473.method2478();
                                    class173 var234 = class173.method2041(var232);
                                    if (var234.field2743) {
                                        var234.field2835 = var231;
                                        var234.field2863 = var233;
                                        class52 var236 = class52.method1531(var231);
                                        var234.field2793 = var236.field1142;
                                        var234.field2803 = var236.field1123;
                                        var234.field2795 = var236.field1150;
                                        var234.field2791 = var236.field1125;
                                        var234.field2794 = var236.field1126;
                                        var234.field2796 = var236.field1128;
                                        if (var236.field1127 == 1) {
                                            var234.field2840 = 1;
                                        } else {
                                            var234.field2840 = 2;
                                        }
                                        if (var234.field2797 > 0) {
                                            var234.field2796 = var234.field2796 * 32 / var234.field2797;
                                        } else if (var234.field2784 > 0) {
                                            var234.field2796 = var234.field2796 * 32 / var234.field2784;
                                        }
                                        method723(var234);
                                    } else {
                                        if (var231 == -1) {
                                            var234.field2785 = 0;
                                            field489 = -1;
                                            var90 = true;
                                            break label3711;
                                        }
                                        class52 var235 = class52.method1531(var231);
                                        var234.field2785 = 4;
                                        var234.field2847 = var231;
                                        var234.field2793 = var235.field1142;
                                        var234.field2803 = var235.field1123;
                                        var234.field2796 = var235.field1128 * 100 / var233;
                                        method723(var234);
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 87) {
                                    method1774(field473.method2353());
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 186) {
                                    int var237 = field473.method2350();
                                    int var238 = field473.method2347();
                                    if (var237 < -70000) {
                                        var238 += 32768;
                                    }
                                    class173 var239;
                                    if (var237 >= 0) {
                                        var239 = class173.method2041(var237);
                                    } else {
                                        var239 = null;
                                    }
                                    while (field473.field1980 < field570) {
                                        int var240 = field473.method2492();
                                        int var241 = field473.method2347();
                                        int var242 = 0;
                                        if (var241 != 0) {
                                            var242 = field473.method2412();
                                            if (var242 == 255) {
                                                var242 = field473.method2350();
                                            }
                                        }
                                        if (var239 != null && var240 >= 0 && var240 < var239.field2860.length) {
                                            var239.field2860[var240] = var241;
                                            var239.field2861[var240] = var242;
                                        }
                                        class16.method2415(var238, var240, var241 - 1, var242);
                                    }
                                    if (var239 != null) {
                                        method723(var239);
                                    }
                                    method965();
                                    field468[++field484 - 1 & 0x1F] = var238 & 0x7FFF;
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 250) {
                                    method965();
                                    int var243 = field473.method2371();
                                    int var244 = field473.method2371();
                                    int var245 = field473.method2350();
                                    field291[var243] = var245;
                                    field431[var243] = var244;
                                    field338[var243] = 1;
                                    for (int var246 = 0; var246 < 98; var246++) {
                                        if (var245 >= class155.field2280[var246]) {
                                            field338[var243] = var246 + 2;
                                        }
                                    }
                                    field485[++field486 - 1 & 0x1F] = var243;
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 36) {
                                    field312 = field473.method2412();
                                    if (field312 == 1) {
                                        field313 = field473.method2347();
                                    }
                                    if (field312 >= 2 && field312 <= 6) {
                                        if (field312 == 2) {
                                            field290 = 64;
                                            field319 = 64;
                                        }
                                        if (field312 == 3) {
                                            field290 = 0;
                                            field319 = 64;
                                        }
                                        if (field312 == 4) {
                                            field290 = 128;
                                            field319 = 64;
                                        }
                                        if (field312 == 5) {
                                            field290 = 64;
                                            field319 = 0;
                                        }
                                        if (field312 == 6) {
                                            field290 = 64;
                                            field319 = 128;
                                        }
                                        field312 = 2;
                                        field419 = field473.method2347();
                                        field316 = field473.method2347();
                                        field317 = field473.method2412();
                                    }
                                    if (field312 == 10) {
                                        field314 = field473.method2347();
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 121) {
                                    field513 = field473.method2412();
                                    field483 = field473.method2412();
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 118) {
                                    int var247 = field473.method2388();
                                    class173 var248 = class173.method2041(var247);
                                    var248.field2785 = 3;
                                    var248.field2847 = Statics.field2254.field44.method3276();
                                    method723(var248);
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 147) {
                                    field311 = field473.method2523() * 30;
                                    field492 = field480;
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 229) {
                                    method3697();
                                    field489 = -1;
                                    var90 = false;
                                    break label3711;
                                }
                                if (field489 == 35) {
                                    field473.field1980 += 28;
                                    if (field473.method2367()) {
                                        class122 var249 = field473;
                                        int var250 = field473.field1980 - 28;
                                        if (class149.field2224 != null) {
                                            try {
                                                class149.field2224.method3881(0L);
                                                class149.field2224.method3903(var249.field1981, var250, 24);
                                            } catch (Exception var543) {
                                            }
                                        }
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 58) {
                                    int var252 = field473.method2347();
                                    int var253 = field473.method2412();
                                    int var254 = field473.method2347();
                                    if (field535 != 0 && var253 != 0 && field537 < 50) {
                                        field327[field537] = var252;
                                        field539[field537] = var253;
                                        field540[field537] = var254;
                                        field542[field537] = null;
                                        field504[field537] = 0;
                                        field537++;
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 195) {
                                    int var258 = field473.method2380();
                                    class16.method2136(var258);
                                    field468[++field484 - 1 & 0x1F] = var258 & 0x7FFF;
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 93) {
                                    if (field454 != -1) {
                                        int var259 = field454;
                                        if (Statics.method2150(var259)) {
                                            method2705(Statics.field2851[var259], 0);
                                        }
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 25) {
                                    method965();
                                    field337 = field473.method2348();
                                    field492 = field480;
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 179) {
                                    boolean var260 = field473.method2412() == 1;
                                    int var261 = field473.method2389();
                                    class173 var262 = class173.method2041(var261);
                                    if (var262.field2764 != var260) {
                                        var262.field2764 = var260;
                                        method723(var262);
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 218) {
                                    int var263 = field473.method2412();
                                    int var264 = field473.method2412();
                                    int var265 = field473.method2412();
                                    int var266 = field473.method2412();
                                    field391[var263] = true;
                                    field426[var263] = var264;
                                    field512[var263] = var265;
                                    field548[var263] = var266;
                                    field423[var263] = 0;
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 175) {
                                    Statics.field125 = field473.method2371();
                                    Statics.field67 = field473.method2373();
                                    for (int var267 = Statics.field67; var267 < Statics.field67 + 8; var267++) {
                                        for (int var268 = Statics.field125; var268 < Statics.field125 + 8; var268++) {
                                            if (field420[Statics.field1079][var267][var268] != null) {
                                                field420[Statics.field1079][var267][var268] = null;
                                                method3117(var267, var268);
                                            }
                                        }
                                    }
                                    for (class17 var269 = (class17) field428.method3575(); var269 != null; var269 = (class17) field428.method3576()) {
                                        if (var269.field230 >= Statics.field67 && var269.field230 < Statics.field67 + 8 && var269.field245 >= Statics.field125 && var269.field245 < Statics.field125 + 8 && Statics.field1079 == var269.field237) {
                                            var269.field239 = 0;
                                        }
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 187) {
                                    method965();
                                    field459 = field473.method2412();
                                    field492 = field480;
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 245) {
                                    for (int var270 = 0; var270 < Statics.field1158; var270++) {
                                        class53 var271 = class53.method102(var270);
                                        if (var271 != null) {
                                            class176.field2892[var270] = 0;
                                            class176.field2891[var270] = 0;
                                        }
                                    }
                                    method965();
                                    field482 += 32;
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 151) {
                                    for (int var272 = 0; var272 < field416.length; var272++) {
                                        if (field416[var272] != null) {
                                            field416[var272].field870 = -1;
                                        }
                                    }
                                    for (int var273 = 0; var273 < field359.length; var273++) {
                                        if (field359[var273] != null) {
                                            field359[var273].field870 = -1;
                                        }
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 129) {
                                    int var274 = field473.method2478();
                                    class173 var275 = class173.method2041(var274);
                                    for (int var276 = 0; var276 < var275.field2860.length; var276++) {
                                        var275.field2860[var276] = -1;
                                        var275.field2860[var276] = 0;
                                    }
                                    method723(var275);
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 181) {
                                    while (field473.field1980 < field570) {
                                        int var277 = field473.method2412();
                                        boolean var278 = (var277 & 0x1) == 1;
                                        String var279 = field473.method2353();
                                        String var280 = field473.method2353();
                                        field473.method2353();
                                        for (int var281 = 0; var281 < field510; var281++) {
                                            class8 var282 = field569[var281];
                                            if (var278) {
                                                if (var280.equals(var282.field130)) {
                                                    var282.field130 = var279;
                                                    var282.field126 = var280;
                                                    var279 = null;
                                                    break;
                                                }
                                            } else if (var279.equals(var282.field130)) {
                                                var282.field130 = var279;
                                                var282.field126 = var280;
                                                var279 = null;
                                                break;
                                            }
                                        }
                                        if (var279 != null && field510 < 400) {
                                            class8 var283 = new class8();
                                            field569[field510] = var283;
                                            var283.field130 = var279;
                                            var283.field126 = var280;
                                            field510++;
                                        }
                                    }
                                    field497 = field480;
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 30) {
                                    class33.method2677();
                                    for (int var284 = 0; var284 < 2048; var284++) {
                                        field416[var284] = null;
                                    }
                                    class33.method3169(field473);
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 4) {
                                    boolean var285 = field473.method2412() == 1;
                                    if (var285) {
                                        Statics.field1097 = class115.method207() - field473.method2351();
                                        Statics.field2654 = new class221(field473, true);
                                    } else {
                                        Statics.field2654 = null;
                                    }
                                    field491 = field480;
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 123) {
                                    int var286 = field473.method2492();
                                    boolean var287 = field473.method2412() == 1;
                                    String var288 = "";
                                    boolean var289 = false;
                                    if (var287) {
                                        var288 = field473.method2353();
                                        if (method628(var288)) {
                                            var289 = true;
                                        }
                                    }
                                    String var290 = field473.method2353();
                                    if (!var289) {
                                        class12.method2769(var286, var288, var290);
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 255) {
                                    int var291 = field473.method2350();
                                    class4 var292 = (class4) field455.method3539((long) var291);
                                    if (var292 != null) {
                                        method2279(var292, true);
                                    }
                                    if (field432 != null) {
                                        method723(field432);
                                        field432 = null;
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 130) {
                                    int var293 = field473.method2350();
                                    String var294 = field473.method2353();
                                    class173 var295 = class173.method2041(var293);
                                    if (!var294.equals(var295.field2779)) {
                                        var295.field2779 = var294;
                                        method723(var295);
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 235) {
                                    int var296 = field473.method2379();
                                    byte var297 = field473.method2372();
                                    class176.field2892[var296] = var297;
                                    if (class176.field2891[var296] != var297) {
                                        class176.field2891[var296] = var297;
                                    }
                                    Statics.method934(var296);
                                    field339[++field482 - 1 & 0x1F] = var296;
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 155) {
                                    for (int var298 = 0; var298 < class176.field2891.length; var298++) {
                                        if (class176.field2892[var298] != class176.field2891[var298]) {
                                            class176.field2891[var298] = class176.field2892[var298];
                                            Statics.method934(var298);
                                            field339[++field482 - 1 & 0x1F] = var298;
                                        }
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 139) {
                                    int var299 = field473.method2478();
                                    int var300 = field473.method2347();
                                    class173 var301 = class173.method2041(var299);
                                    if (var301.field2785 != 1 || var301.field2847 != var300) {
                                        var301.field2785 = 1;
                                        var301.field2847 = var300;
                                        method723(var301);
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 39) {
                                    method778(true);
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 26) {
                                    int var302 = field473.method2347();
                                    int var303 = field473.method2478();
                                    int var304 = field473.method2371();
                                    class4 var305 = (class4) field455.method3539((long) var303);
                                    if (var305 != null) {
                                        method2279(var305, var305.field57 != var302);
                                    }
                                    method740(var303, var302, var304);
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 114) {
                                    int var306 = field473.method2350();
                                    int var307 = field473.method2347();
                                    if (var306 < -70000) {
                                        var307 += 32768;
                                    }
                                    class173 var308;
                                    if (var306 >= 0) {
                                        var308 = class173.method2041(var306);
                                    } else {
                                        var308 = null;
                                    }
                                    if (var308 != null) {
                                        for (int var309 = 0; var309 < var308.field2860.length; var309++) {
                                            var308.field2860[var309] = 0;
                                            var308.field2861[var309] = 0;
                                        }
                                    }
                                    class16 var310 = (class16) class16.field226.method3539((long) var307);
                                    if (var310 != null) {
                                        for (int var311 = 0; var311 < var310.field216.length; var311++) {
                                            var310.field216[var311] = -1;
                                            var310.field222[var311] = 0;
                                        }
                                    }
                                    int var312 = field473.method2347();
                                    for (int var313 = 0; var313 < var312; var313++) {
                                        int var314 = field473.method2373();
                                        if (var314 == 255) {
                                            var314 = field473.method2389();
                                        }
                                        int var315 = field473.method2379();
                                        if (var308 != null && var313 < var308.field2860.length) {
                                            var308.field2860[var313] = var315;
                                            var308.field2861[var313] = var314;
                                        }
                                        class16.method2415(var307, var313, var315 - 1, var314);
                                    }
                                    if (var308 != null) {
                                        method723(var308);
                                    }
                                    method965();
                                    field468[++field484 - 1 & 0x1F] = var307 & 0x7FFF;
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 194) {
                                    int var316 = field570 + field473.field1980;
                                    int var317 = field473.method2347();
                                    int var318 = field473.method2347();
                                    if (field454 != var317) {
                                        field454 = var317;
                                        int var319 = field454;
                                        int var320 = Statics.field108;
                                        int var321 = Statics.field750;
                                        if (Statics.method2150(var319)) {
                                            Statics.method12(Statics.field2851[var319], -1, var320, var321, false);
                                        }
                                        method1518(field454);
                                        class37.method2230(field454);
                                        for (int var322 = 0; var322 < 100; var322++) {
                                            field500[var322] = true;
                                        }
                                    }
                                    while (var318-- > 0) {
                                        int var323 = field473.method2350();
                                        int var324 = field473.method2347();
                                        int var325 = field473.method2412();
                                        class4 var326 = (class4) field455.method3539((long) var323);
                                        if (var326 != null && var326.field57 != var324) {
                                            method2279(var326, true);
                                            var326 = null;
                                        }
                                        if (var326 == null) {
                                            var326 = method740(var323, var324, var325);
                                        }
                                        var326.field60 = true;
                                    }
                                    for (class4 var327 = (class4) field455.method3551(); var327 != null; var327 = (class4) field455.method3542()) {
                                        if (var327.field60) {
                                            var327.field60 = false;
                                        } else {
                                            method2279(var327, true);
                                        }
                                    }
                                    field367 = new class196(512);
                                    while (field473.field1980 < var316) {
                                        int var328 = field473.method2350();
                                        int var329 = field473.method2347();
                                        int var330 = field473.method2347();
                                        int var331 = field473.method2350();
                                        for (int var332 = var329; var332 <= var330; var332++) {
                                            long var333 = ((long) var328 << 32) + (long) var332;
                                            field367.method3546(new class201(var331), var333);
                                        }
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 113) {
                                    field543 = false;
                                    for (int var335 = 0; var335 < 5; var335++) {
                                        field391[var335] = false;
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 156) {
                                    field543 = true;
                                    Statics.field2901 = field473.method2412();
                                    Statics.field218 = field473.method2412();
                                    Statics.field2634 = field473.method2347();
                                    Statics.field2038 = field473.method2412();
                                    Statics.field2704 = field473.method2412();
                                    if (Statics.field2704 >= 100) {
                                        Statics.field1038 = Statics.field2901 * 128 + 64;
                                        Statics.field255 = Statics.field218 * 128 + 64;
                                        Statics.field714 = method53(Statics.field1038, Statics.field255, Statics.field1079) - Statics.field2634;
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 242) {
                                    int var336 = field473.method2389();
                                    int var337 = field473.method2382();
                                    int var338 = field473.method2348();
                                    class173 var339 = class173.method2041(var336);
                                    if (var339.field2744 != var338 || var339.field2754 != var337 || var339.field2749 != 0 || var339.field2750 != 0) {
                                        var339.field2744 = var338;
                                        var339.field2754 = var337;
                                        var339.field2749 = 0;
                                        var339.field2750 = 0;
                                        method723(var339);
                                        method1960(var339);
                                        if (var339.field2765 == 0) {
                                            method15(Statics.field2851[var336 >> 16], var339, false);
                                        }
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 61) {
                                    field529 = field473.method2412();
                                    if (field529 == 255) {
                                        field529 = 0;
                                    }
                                    field530 = field473.method2412();
                                    if (field530 == 255) {
                                        field530 = 0;
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 62) {
                                    Statics.field67 = field473.method2475();
                                    Statics.field125 = field473.method2412();
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 143) {
                                    String var340 = field473.method2353();
                                    long var341 = field473.method2351();
                                    long var343 = (long) field473.method2347();
                                    long var345 = (long) field473.method2349();
                                    class152 var347 = (class152) class109.method2942(class152.method3685(), field473.method2412());
                                    long var348 = (var343 << 32) + var345;
                                    boolean var350 = false;
                                    for (int var351 = 0; var351 < 100; var351++) {
                                        if (field340[var351] == var348) {
                                            var350 = true;
                                            break;
                                        }
                                    }
                                    if (var347.field2251 && method628(var340)) {
                                        var350 = true;
                                    }
                                    if (!var350 && field415 == 0) {
                                        field340[field562] = var348;
                                        field562 = (field562 + 1) % 100;
                                        class122 var352 = field473;
                                        String var356;
                                        try {
                                            int var353 = var352.method2492();
                                            if (var353 > 32767) {
                                                var353 = 32767;
                                            }
                                            byte[] var354 = new byte[var353];
                                            var352.field1980 += Statics.field3178.method2274(var352.field1981, var352.field1980, var354, 0, var353);
                                            String var355 = class165.method984(var354, 0, var353);
                                            var356 = var355;
                                        } catch (Exception var542) {
                                            var356 = "Cabbage";
                                        }
                                        String var359 = class223.method3845(class163.method3499(var356));
                                        if (var347.field2249 == -1) {
                                            class12.method6(9, var340, var359, class162.method701(var341));
                                        } else {
                                            int var360 = var347.field2249;
                                            String var361 = "<img=" + var360 + ">";
                                            class12.method6(9, var361 + var340, var359, class162.method701(var341));
                                        }
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 44) {
                                    class26 var362 = new class26();
                                    var362.field631 = field473.method2353();
                                    var362.field639 = field473.method2347();
                                    int var363 = field473.method2350();
                                    var362.field640 = var363;
                                    method10(45);
                                    Statics.field2913.method2837();
                                    Statics.field2913 = null;
                                    class32.method204(var362);
                                    field489 = -1;
                                    var90 = false;
                                    break label3711;
                                }
                                if (field489 == 94) {
                                    int var364 = field473.method2347();
                                    int var365 = field473.method2350();
                                    int var366 = var364 >> 10 & 0x1F;
                                    int var367 = var364 >> 5 & 0x1F;
                                    int var368 = var364 & 0x1F;
                                    int var369 = (var368 << 3) + (var366 << 19) + (var367 << 11);
                                    class173 var370 = class173.method2041(var365);
                                    if (var370.field2769 != var369) {
                                        var370.field2769 = var369;
                                        method723(var370);
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 141) {
                                    int var371 = field473.method2350();
                                    int var372 = field473.method2379();
                                    class176.field2892[var372] = var371;
                                    if (class176.field2891[var372] != var371) {
                                        class176.field2891[var372] = var371;
                                    }
                                    Statics.method934(var372);
                                    field339[++field482 - 1 & 0x1F] = var372;
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 223) {
                                    int var373 = field473.method2478();
                                    int var374 = field473.method2523();
                                    class173 var375 = class173.method2041(var373);
                                    if (var375.field2785 != 2 || var375.field2847 != var374) {
                                        var375.field2785 = 2;
                                        var375.field2847 = var374;
                                        method723(var375);
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 153) {
                                    class33.method623(field473, field570);
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 131) {
                                    String var376 = field473.method2353();
                                    class122 var377 = field473;
                                    String var381;
                                    try {
                                        int var378 = var377.method2492();
                                        if (var378 > 32767) {
                                            var378 = 32767;
                                        }
                                        byte[] var379 = new byte[var378];
                                        var377.field1980 += Statics.field3178.method2274(var377.field1981, var377.field1980, var379, 0, var378);
                                        String var380 = class165.method984(var379, 0, var378);
                                        var381 = var380;
                                    } catch (Exception var541) {
                                        var381 = "Cabbage";
                                    }
                                    String var384 = class223.method3845(class163.method3499(var381));
                                    class12.method2769(6, var376, var384);
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                if (field489 == 165) {
                                    int var385 = field473.method2379();
                                    int var386 = field473.method2478();
                                    class173 var387 = class173.method2041(var386);
                                    if (var387 != null && var387.field2765 == 0) {
                                        if (var385 > var387.field2814 - var387.field2760) {
                                            var385 = var387.field2814 - var387.field2760;
                                        }
                                        if (var385 < 0) {
                                            var385 = 0;
                                        }
                                        if (var387.field2766 != var385) {
                                            var387.field2766 = var385;
                                            method723(var387);
                                        }
                                    }
                                    field489 = -1;
                                    var90 = true;
                                    break label3711;
                                }
                                class148.method643("" + field489 + class2.field15 + field344 + class2.field15 + field345 + class2.field15 + field570, (Throwable) null);
                                method3697();
                            } catch (IOException var548) {
                                if (field346 > 0) {
                                    method3697();
                                } else {
                                    method10(40);
                                    Statics.field2070 = Statics.field2913;
                                    Statics.field2913 = null;
                                }
                            } catch (Exception var549) {
                                String var390 = "" + field489 + class2.field15 + field344 + class2.field15 + field345 + class2.field15 + field570 + class2.field15 + (Statics.field2215 + Statics.field2254.field867[0]) + class2.field15 + (Statics.field258 + Statics.field2254.field868[0]) + class2.field15;
                                for (int var391 = 0; var391 < field570 && var391 < 50; var391++) {
                                    var390 = var390 + field473.field1981[var391] + class2.field15;
                                }
                                class148.method643(var390, var549);
                                method3697();
                            }
                            var90 = true;
                        }
                    }
                    if (!var90) {
                        break;
                    }
                }
                if (field553 == 30) {
                    while (class211.method2654()) {
                        field302.method2586(184);
                        field302.method2330(0);
                        int var392 = field302.field1980;
                        class211.method2580(field302);
                        field302.method2342(field302.field1980 - var392);
                    }
                    Object var393 = Statics.field1601.field189;
                    synchronized (Statics.field1601.field189) {
                        if (!field488) {
                            Statics.field1601.field190 = 0;
                        } else if (class140.field2146 != 0 || Statics.field1601.field190 >= 40) {
                            field302.method2586(8);
                            field302.method2330(0);
                            int var394 = field302.field1980;
                            int var395 = 0;
                            for (int var396 = 0; var396 < Statics.field1601.field190 && field302.field1980 - var394 < 240; var396++) {
                                var395++;
                                int var397 = Statics.field1601.field196[var396];
                                if (var397 < 0) {
                                    var397 = 0;
                                } else if (var397 > 502) {
                                    var397 = 502;
                                }
                                int var398 = Statics.field1601.field198[var396];
                                if (var398 < 0) {
                                    var398 = 0;
                                } else if (var398 > 764) {
                                    var398 = 764;
                                }
                                int var399 = var397 * 765 + var398;
                                if (Statics.field1601.field196[var396] == -1 && Statics.field1601.field198[var396] == -1) {
                                    var398 = -1;
                                    var397 = -1;
                                    var399 = 524287;
                                }
                                if (field306 != var398 || field307 != var397) {
                                    int var400 = var398 - field306;
                                    field306 = var398;
                                    int var401 = var397 - field307;
                                    field307 = var397;
                                    if (field308 < 8 && var400 >= -32 && var400 <= 31 && var401 >= -32 && var401 <= 31) {
                                        var400 += 32;
                                        var401 += 32;
                                        field302.method2331((field308 << 12) + (var400 << 6) + var401);
                                        field308 = 0;
                                    } else if (field308 < 8) {
                                        field302.method2332((field308 << 19) + 8388608 + var399);
                                        field308 = 0;
                                    } else {
                                        field302.method2496((field308 << 19) + -1073741824 + var399);
                                        field308 = 0;
                                    }
                                } else if (field308 < 2047) {
                                    field308++;
                                }
                            }
                            field302.method2342(field302.field1980 - var394);
                            if (var395 >= Statics.field1601.field190) {
                                Statics.field1601.field190 = 0;
                            } else {
                                Statics.field1601.field190 -= var395;
                                for (int var402 = 0; var402 < Statics.field1601.field190; var402++) {
                                    Statics.field1601.field198[var402] = Statics.field1601.field198[var395 + var402];
                                    Statics.field1601.field196[var402] = Statics.field1601.field196[var395 + var402];
                                }
                            }
                        }
                    }
                    if (class140.field2146 == 1 || !Statics.field3150 && class140.field2146 == 4 || class140.field2146 == 2) {
                        long var404 = (class140.field2149 - field305) / 50L;
                        if (var404 > 4095L) {
                            var404 = 4095L;
                        }
                        field305 = class140.field2149;
                        int var406 = class140.field2148;
                        if (var406 < 0) {
                            var406 = 0;
                        } else if (var406 > Statics.field750) {
                            var406 = Statics.field750;
                        }
                        int var407 = class140.field2147;
                        if (var407 < 0) {
                            var407 = 0;
                        } else if (var407 > Statics.field108) {
                            var407 = Statics.field108;
                        }
                        int var408 = (int) var404;
                        field302.method2586(101);
                        field302.method2331((class140.field2146 == 2 ? 1 : 0) + (var408 << 1));
                        field302.method2331(var407);
                        field302.method2331(var406);
                    }
                    if (class137.field2111 > 0) {
                        field302.method2586(125);
                        field302.method2331(0);
                        int var409 = field302.field1980;
                        long var410 = class115.method207();
                        for (int var412 = 0; var412 < class137.field2111; var412++) {
                            long var413 = var410 - field564;
                            if (var413 > 16777215L) {
                                var413 = 16777215L;
                            }
                            field564 = var410;
                            field302.method2330(class137.field2113[var412]);
                            field302.method2490((int) var413);
                        }
                        field302.method2341(field302.field1980 - var409);
                    }
                    if (field353 > 0) {
                        field353--;
                    }
                    if (class137.field2088[96] || class137.field2088[97] || class137.field2088[98] || class137.field2088[99]) {
                        field387 = true;
                    }
                    if (field387 && field353 <= 0) {
                        field353 = 20;
                        field387 = false;
                        field302.method2586(65);
                        field302.method2378(field555);
                        field302.method2377(field496);
                    }
                    if (Statics.field1058 && !field309) {
                        field309 = true;
                        field302.method2586(31);
                        field302.method2330(1);
                    }
                    if (!Statics.field1058 && field309) {
                        field309 = false;
                        field302.method2586(31);
                        field302.method2330(0);
                    }
                    if (Statics.field1079 != field524) {
                        field524 = Statics.field1079;
                        int var415 = Statics.field1079;
                        int[] var416 = Statics.field22.field1398;
                        int var417 = var416.length;
                        for (int var418 = 0; var418 < var417; var418++) {
                            var416[var418] = 0;
                        }
                        int var419 = 1;
                        while (true) {
                            if (var419 >= 103) {
                                int var422 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                                int var423 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                                Statics.field22.method1625();
                                for (int var424 = 1; var424 < 103; var424++) {
                                    for (int var425 = 1; var425 < 103; var425++) {
                                        if ((class6.field91[var415][var425][var424] & 0x18) == 0) {
                                            method3856(var415, var425, var424, var422, var423);
                                        }
                                        if (var415 < 3 && (class6.field91[var415 + 1][var425][var424] & 0x8) != 0) {
                                            method3856(var415 + 1, var425, var424, var422, var423);
                                        }
                                    }
                                }
                                field525 = 0;
                                for (int var426 = 0; var426 < 104; var426++) {
                                    for (int var427 = 0; var427 < 104; var427++) {
                                        int var428 = Statics.field1397.method1812(Statics.field1079, var426, var427);
                                        if (var428 != 0) {
                                            int var429 = var428 >> 14 & 0x7FFF;
                                            int var430 = class41.method2944(var429).field944;
                                            if (var430 >= 0) {
                                                int var431 = var426;
                                                int var432 = var427;
                                                if (var430 != 22 && var430 != 29 && var430 != 34 && var430 != 36 && var430 != 46 && var430 != 47 && var430 != 48) {
                                                    int[][] var433 = field360[Statics.field1079].field1889;
                                                    for (int var434 = 0; var434 < 10; var434++) {
                                                        int var435 = (int) (Math.random() * 4.0D);
                                                        if (var435 == 0 && var431 > 0 && var431 > var426 - 3 && (var433[var431 - 1][var432] & 0x1240108) == 0) {
                                                            var431--;
                                                        }
                                                        if (var435 == 1 && var431 < 103 && var431 < var426 + 3 && (var433[var431 + 1][var432] & 0x1240180) == 0) {
                                                            var431++;
                                                        }
                                                        if (var435 == 2 && var432 > 0 && var432 > var427 - 3 && (var433[var431][var432 - 1] & 0x1240102) == 0) {
                                                            var432--;
                                                        }
                                                        if (var435 == 3 && var432 < 103 && var432 < var427 + 3 && (var433[var431][var432 + 1] & 0x1240120) == 0) {
                                                            var432++;
                                                        }
                                                    }
                                                }
                                                field318[field525] = Statics.field2001[var430];
                                                field364[field525] = var431;
                                                field527[field525] = var432;
                                                field525++;
                                            }
                                        }
                                    }
                                }
                                Statics.field2150.method1597();
                                break;
                            }
                            int var420 = (103 - var419) * 2048 + 24628;
                            for (int var421 = 1; var421 < 103; var421++) {
                                if ((class6.field91[var415][var421][var419] & 0x18) == 0) {
                                    Statics.field1397.method1817(var416, var420, 512, var415, var421, var419);
                                }
                                if (var415 < 3 && (class6.field91[var415 + 1][var421][var419] & 0x8) != 0) {
                                    Statics.field1397.method1817(var416, var420, 512, var415 + 1, var421, var419);
                                }
                                var420 += 4;
                            }
                            var419++;
                        }
                    }
                    if (field553 == 30) {
                        for (class17 var436 = (class17) field428.method3575(); var436 != null; var436 = (class17) field428.method3576()) {
                            if (var436.field239 > 0) {
                                var436.field239--;
                            }
                            if (var436.field239 != 0) {
                                if (var436.field238 > 0) {
                                    var436.field238--;
                                }
                                if (var436.field238 == 0 && var436.field230 >= 1 && var436.field245 >= 1 && var436.field230 <= 102 && var436.field245 <= 102 && (var436.field235 < 0 || class6.method938(var436.field235, var436.field243))) {
                                    method48(var436.field237, var436.field228, var436.field230, var436.field245, var436.field235, var436.field236, var436.field243);
                                    var436.field238 = -1;
                                    if (var436.field235 == var436.field229 && var436.field229 == -1) {
                                        var436.method3661();
                                    } else if (var436.field235 == var436.field229 && var436.field236 == var436.field233 && var436.field243 == var436.field234) {
                                        var436.method3661();
                                    }
                                }
                            } else if (var436.field229 < 0 || class6.method938(var436.field229, var436.field234)) {
                                method48(var436.field237, var436.field228, var436.field230, var436.field245, var436.field229, var436.field233, var436.field234);
                                var436.method3661();
                            }
                        }
                        method196();
                        field341++;
                        if (field341 <= 750) {
                            method44();
                            for (int var437 = 0; var437 < field332; var437++) {
                                int var438 = field565[var437];
                                class35 var439 = field359[var438];
                                if (var439 != null) {
                                    method1001(var439, var439.field786.field882);
                                }
                            }
                            method1587();
                            field410++;
                            if (field406 != 0) {
                                field356 += 20;
                                if (field356 >= 400) {
                                    field406 = 0;
                                }
                            }
                            if (Statics.field680 != null) {
                                field407++;
                                if (field407 >= 15) {
                                    method723(Statics.field680);
                                    Statics.field680 = null;
                                }
                            }
                            class173 var440 = Statics.field3040;
                            class173 var441 = Statics.field2633;
                            Statics.field3040 = null;
                            Statics.field2633 = null;
                            field369 = null;
                            field475 = false;
                            field499 = false;
                            field518 = 0;
                            while (true) {
                                while (class137.method700() && field518 < 128) {
                                    if (field461 >= 2 && class137.field2088[82] && Statics.field202 == 66) {
                                        String var442 = class12.method2685();
                                        Statics.field2615.setContents(new StringSelection(var442), (ClipboardOwner) null);
                                    } else {
                                        field520[field518] = Statics.field202;
                                        field549[field518] = Statics.field1949;
                                        field518++;
                                    }
                                }
                                if (field454 != -1) {
                                    method645(field454, 0, 0, Statics.field108, Statics.field750, 0, 0);
                                }
                                field480++;
                                while (true) {
                                    class1 var443;
                                    class173 var444;
                                    class173 var445;
                                    do {
                                        var443 = (class1) field294.method3581();
                                        if (var443 == null) {
                                            while (true) {
                                                class1 var446;
                                                class173 var447;
                                                class173 var448;
                                                do {
                                                    var446 = (class1) field321.method3581();
                                                    if (var446 == null) {
                                                        while (true) {
                                                            class1 var449;
                                                            class173 var450;
                                                            class173 var451;
                                                            do {
                                                                var449 = (class1) field293.method3581();
                                                                if (var449 == null) {
                                                                    boolean var452 = false;
                                                                    while (!var452) {
                                                                        var452 = true;
                                                                        for (int var453 = 0; var453 < field436 - 1; var453++) {
                                                                            if (field303[var453] < 1000 && field303[var453 + 1] > 1000) {
                                                                                String var454 = field446[var453];
                                                                                field446[var453] = field446[var453 + 1];
                                                                                field446[var453 + 1] = var454;
                                                                                String var455 = field441[var453];
                                                                                field441[var453] = field441[var453 + 1];
                                                                                field441[var453 + 1] = var455;
                                                                                int var456 = field303[var453];
                                                                                field303[var453] = field303[var453 + 1];
                                                                                field303[var453 + 1] = var456;
                                                                                int var457 = field437[var453];
                                                                                field437[var453] = field437[var453 + 1];
                                                                                field437[var453 + 1] = var457;
                                                                                int var458 = field438[var453];
                                                                                field438[var453] = field438[var453 + 1];
                                                                                field438[var453 + 1] = var458;
                                                                                int var459 = field440[var453];
                                                                                field440[var453] = field440[var453 + 1];
                                                                                field440[var453 + 1] = var459;
                                                                                var452 = false;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (Statics.field763 == null && field467 == null) {
                                                                        int var460 = class140.field2146;
                                                                        if (field471) {
                                                                            if (var460 != 1 && (Statics.field3150 || var460 != 4)) {
                                                                                int var461 = class140.field2141;
                                                                                int var462 = class140.field2136;
                                                                                if (var461 < Statics.field193 - 10 || var461 > Statics.field2926 + Statics.field193 + 10 || var462 < Statics.field710 - 10 || var462 > Statics.field710 + Statics.field1988 + 10) {
                                                                                    field471 = false;
                                                                                    method203(Statics.field193, Statics.field710, Statics.field2926, Statics.field1988);
                                                                                }
                                                                            }
                                                                            if (var460 == 1 || !Statics.field3150 && var460 == 4) {
                                                                                int var463 = Statics.field193;
                                                                                int var464 = Statics.field710;
                                                                                int var465 = Statics.field2926;
                                                                                int var466 = class140.field2147;
                                                                                int var467 = class140.field2148;
                                                                                int var468 = -1;
                                                                                for (int var469 = 0; var469 < field436; var469++) {
                                                                                    int var470 = (field436 - 1 - var469) * 15 + var464 + 31;
                                                                                    if (var466 > var463 && var466 < var463 + var465 && var467 > var470 - 13 && var467 < var470 + 3) {
                                                                                        var468 = var469;
                                                                                    }
                                                                                }
                                                                                if (var468 != -1 && var468 >= 0) {
                                                                                    int var471 = field437[var468];
                                                                                    int var472 = field438[var468];
                                                                                    int var473 = field303[var468];
                                                                                    int var474 = field440[var468];
                                                                                    String var475 = field441[var468];
                                                                                    String var476 = field446[var468];
                                                                                    method142(var471, var472, var473, var474, var475, var476, class140.field2147, class140.field2148);
                                                                                }
                                                                                field471 = false;
                                                                                method203(Statics.field193, Statics.field710, Statics.field2926, Statics.field1988);
                                                                            }
                                                                        } else {
                                                                            label3861: {
                                                                                if ((var460 == 1 || !Statics.field3150 && var460 == 4) && field436 > 0) {
                                                                                    int var477 = field303[field436 - 1];
                                                                                    if (var477 == 39 || var477 == 40 || var477 == 41 || var477 == 42 || var477 == 43 || var477 == 33 || var477 == 34 || var477 == 35 || var477 == 36 || var477 == 37 || var477 == 38 || var477 == 1005) {
                                                                                        int var478 = field437[field436 - 1];
                                                                                        int var479 = field438[field436 - 1];
                                                                                        class173 var480 = class173.method2041(var479);
                                                                                        if (class178.method1590(method2141(var480)) || class178.method1230(method2141(var480))) {
                                                                                            if (Statics.field763 != null && !field413 && field434 != 1 && !method951(field436 - 1) && field436 > 0) {
                                                                                                int var481 = field511;
                                                                                                int var482 = field494;
                                                                                                method162(Statics.field2121, var481, var482);
                                                                                                Statics.field2121 = null;
                                                                                            }
                                                                                            field413 = false;
                                                                                            field414 = 0;
                                                                                            if (Statics.field763 != null) {
                                                                                                method723(Statics.field763);
                                                                                            }
                                                                                            Statics.field763 = class173.method2041(var479);
                                                                                            field409 = var478;
                                                                                            field511 = class140.field2147;
                                                                                            field494 = class140.field2148;
                                                                                            if (field436 > 0) {
                                                                                                int var483 = field436 - 1;
                                                                                                Statics.field2121 = new class31();
                                                                                                Statics.field2121.field704 = field437[var483];
                                                                                                Statics.field2121.field705 = field438[var483];
                                                                                                Statics.field2121.field706 = field303[var483];
                                                                                                Statics.field2121.field707 = field440[var483];
                                                                                                Statics.field2121.field708 = field441[var483];
                                                                                            }
                                                                                            method723(Statics.field763);
                                                                                            break label3861;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if ((var460 == 1 || !Statics.field3150 && var460 == 4) && (field434 == 1 && field436 > 2 || method951(field436 - 1))) {
                                                                                    var460 = 2;
                                                                                }
                                                                                if ((var460 == 1 || !Statics.field3150 && var460 == 4) && field436 > 0) {
                                                                                    int var484 = field436 - 1;
                                                                                    if (var484 >= 0) {
                                                                                        int var485 = field437[var484];
                                                                                        int var486 = field438[var484];
                                                                                        int var487 = field303[var484];
                                                                                        int var488 = field440[var484];
                                                                                        String var489 = field441[var484];
                                                                                        String var490 = field446[var484];
                                                                                        method142(var485, var486, var487, var488, var489, var490, class140.field2147, class140.field2148);
                                                                                    }
                                                                                }
                                                                                if (var460 == 2 && field436 > 0) {
                                                                                    method1776(class140.field2147, class140.field2148);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (field467 != null) {
                                                                        method723(field467);
                                                                        Statics.field408++;
                                                                        if (field475 && field499) {
                                                                            int var491 = class140.field2141;
                                                                            int var492 = class140.field2136;
                                                                            int var493 = var491 - field469;
                                                                            int var494 = var492 - field470;
                                                                            if (var493 < field481) {
                                                                                var493 = field481;
                                                                            }
                                                                            if (field467.field2753 + var493 > field481 + field567.field2753) {
                                                                                var493 = field481 + field567.field2753 - field467.field2753;
                                                                            }
                                                                            if (var494 < field474) {
                                                                                var494 = field474;
                                                                            }
                                                                            if (field467.field2760 + var494 > field474 + field567.field2760) {
                                                                                var494 = field474 + field567.field2760 - field467.field2760;
                                                                            }
                                                                            int var495 = var493 - field424;
                                                                            int var496 = var494 - field477;
                                                                            int var497 = field467.field2733;
                                                                            if (Statics.field408 > field467.field2819 && (var495 > var497 || var495 < -var497 || var496 > var497 || var496 < -var497)) {
                                                                                field566 = true;
                                                                            }
                                                                            int var498 = field567.field2804 + (var493 - field481);
                                                                            int var499 = field567.field2766 + (var494 - field474);
                                                                            if (field467.field2831 != null && field566) {
                                                                                class1 var500 = new class1();
                                                                                var500.field7 = field467;
                                                                                var500.field4 = var498;
                                                                                var500.field5 = var499;
                                                                                var500.field9 = field467.field2831;
                                                                                class37.method2928(var500);
                                                                            }
                                                                            if (class140.field2139 == 0) {
                                                                                if (field566) {
                                                                                    if (field467.field2768 != null) {
                                                                                        class1 var501 = new class1();
                                                                                        var501.field7 = field467;
                                                                                        var501.field4 = var498;
                                                                                        var501.field5 = var499;
                                                                                        var501.field3 = field369;
                                                                                        var501.field9 = field467.field2768;
                                                                                        class37.method2928(var501);
                                                                                    }
                                                                                    if (field369 != null) {
                                                                                        class173 var502 = field467;
                                                                                        int var503 = method2141(var502);
                                                                                        int var504 = var503 >> 17 & 0x7;
                                                                                        int var505 = var504;
                                                                                        class173 var506;
                                                                                        if (var504 == 0) {
                                                                                            var506 = null;
                                                                                        } else {
                                                                                            int var507 = 0;
                                                                                            while (true) {
                                                                                                if (var507 >= var505) {
                                                                                                    var506 = var502;
                                                                                                    break;
                                                                                                }
                                                                                                var502 = class173.method2041(var502.field2763);
                                                                                                if (var502 == null) {
                                                                                                    var506 = null;
                                                                                                    break;
                                                                                                }
                                                                                                var507++;
                                                                                            }
                                                                                        }
                                                                                        if (var506 != null) {
                                                                                            field302.method2586(7);
                                                                                            field302.method2378(field467.field2745);
                                                                                            field302.method2499(field369.field2835);
                                                                                            field302.method2485(field467.field2801);
                                                                                            field302.method2378(field369.field2745);
                                                                                            field302.method2499(field467.field2835);
                                                                                            field302.method2496(field369.field2801);
                                                                                        }
                                                                                    }
                                                                                } else if ((field434 == 1 || method951(field436 - 1)) && field436 > 2) {
                                                                                    method1776(field469 + field424, field477 + field470);
                                                                                } else if (field436 > 0) {
                                                                                    int var508 = field469 + field424;
                                                                                    int var509 = field477 + field470;
                                                                                    method162(Statics.field2121, var508, var509);
                                                                                    Statics.field2121 = null;
                                                                                }
                                                                                field467 = null;
                                                                            }
                                                                        } else if (Statics.field408 > 1) {
                                                                            field467 = null;
                                                                        }
                                                                    }
                                                                    if (Statics.field763 != null) {
                                                                        method723(Statics.field763);
                                                                        field414++;
                                                                        if (class140.field2139 == 0) {
                                                                            if (field413) {
                                                                                if (Statics.field763 == Statics.field205 && field550 != field409) {
                                                                                    class173 var510 = Statics.field763;
                                                                                    byte var511 = 0;
                                                                                    if (field457 == 1 && var510.field2748 == 206) {
                                                                                        var511 = 1;
                                                                                    }
                                                                                    if (var510.field2860[field550] <= 0) {
                                                                                        var511 = 0;
                                                                                    }
                                                                                    if (class178.method1230(method2141(var510))) {
                                                                                        int var512 = field409;
                                                                                        int var513 = field550;
                                                                                        var510.field2860[var513] = var510.field2860[var512];
                                                                                        var510.field2861[var513] = var510.field2861[var512];
                                                                                        var510.field2860[var512] = -1;
                                                                                        var510.field2861[var512] = 0;
                                                                                    } else if (var511 == 1) {
                                                                                        int var514 = field409;
                                                                                        int var515 = field550;
                                                                                        while (var514 != var515) {
                                                                                            if (var514 > var515) {
                                                                                                var510.method3186(var514 - 1, var514);
                                                                                                var514--;
                                                                                            } else if (var514 < var515) {
                                                                                                var510.method3186(var514 + 1, var514);
                                                                                                var514++;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        var510.method3186(field550, field409);
                                                                                    }
                                                                                    field302.method2586(208);
                                                                                    field302.method2506(Statics.field763.field2801);
                                                                                    field302.method2368(var511);
                                                                                    field302.method2499(field409);
                                                                                    field302.method2499(field550);
                                                                                }
                                                                            } else if ((field434 == 1 || method951(field436 - 1)) && field436 > 2) {
                                                                                method1776(field511, field494);
                                                                            } else if (field436 > 0) {
                                                                                int var516 = field511;
                                                                                int var517 = field494;
                                                                                method162(Statics.field2121, var516, var517);
                                                                                Statics.field2121 = null;
                                                                            }
                                                                            field407 = 10;
                                                                            class140.field2146 = 0;
                                                                            Statics.field763 = null;
                                                                        } else if (field414 >= 5 && (class140.field2141 > field511 + 5 || class140.field2141 < field511 - 5 || class140.field2136 > field494 + 5 || class140.field2136 < field494 - 5)) {
                                                                            field413 = true;
                                                                        }
                                                                    }
                                                                    if (class86.field1485 != -1) {
                                                                        int var518 = class86.field1485;
                                                                        int var519 = class86.field1486;
                                                                        field302.method2586(32);
                                                                        field302.method2330(5);
                                                                        field302.method2330(class137.field2088[82] ? (class137.field2088[81] ? 2 : 1) : 0);
                                                                        field302.method2377(Statics.field2215 + var518);
                                                                        field302.method2378(Statics.field258 + var519);
                                                                        class86.field1485 = -1;
                                                                        field403 = class140.field2147;
                                                                        field404 = class140.field2148;
                                                                        field406 = 1;
                                                                        field356 = 0;
                                                                        field529 = var518;
                                                                        field530 = var519;
                                                                    }
                                                                    if (Statics.field3040 != var440) {
                                                                        if (var440 != null) {
                                                                            method723(var440);
                                                                        }
                                                                        if (Statics.field3040 != null) {
                                                                            method723(Statics.field3040);
                                                                        }
                                                                    }
                                                                    if (Statics.field2633 != var441 && field495 == field396) {
                                                                        if (var441 != null) {
                                                                            method723(var441);
                                                                        }
                                                                        if (Statics.field2633 != null) {
                                                                            method723(Statics.field2633);
                                                                        }
                                                                    }
                                                                    if (Statics.field2633 == null) {
                                                                        if (field495 > 0) {
                                                                            field495--;
                                                                        }
                                                                    } else if (field495 < field396) {
                                                                        field495++;
                                                                        if (field495 == field396) {
                                                                            method723(Statics.field2633);
                                                                        }
                                                                    }
                                                                    int var520 = field357 + Statics.field2254.field871;
                                                                    int var521 = field380 + Statics.field2254.field814;
                                                                    if (Statics.field2252 - var520 < -500 || Statics.field2252 - var520 > 500 || Statics.field1985 - var521 < -500 || Statics.field1985 - var521 > 500) {
                                                                        Statics.field2252 = var520;
                                                                        Statics.field1985 = var521;
                                                                    }
                                                                    if (Statics.field2252 != var520) {
                                                                        Statics.field2252 += (var520 - Statics.field2252) / 16;
                                                                    }
                                                                    if (Statics.field1985 != var521) {
                                                                        Statics.field1985 += (var521 - Statics.field1985) / 16;
                                                                    }
                                                                    if (class140.field2139 == 4 && Statics.field3150) {
                                                                        int var522 = class140.field2136 - field384;
                                                                        field538 = var522 * 2;
                                                                        field384 = var522 == -1 || var522 == 1 ? class140.field2136 : (field384 + class140.field2136) / 2;
                                                                        int var523 = field476 - class140.field2141;
                                                                        field381 = var523 * 2;
                                                                        field476 = var523 == -1 || var523 == 1 ? class140.field2141 : (field476 + class140.field2141) / 2;
                                                                    } else {
                                                                        if (class137.field2088[96]) {
                                                                            field381 += (-24 - field381) / 2;
                                                                        } else if (class137.field2088[97]) {
                                                                            field381 += (24 - field381) / 2;
                                                                        } else {
                                                                            field381 /= 2;
                                                                        }
                                                                        if (class137.field2088[98]) {
                                                                            field538 += (12 - field538) / 2;
                                                                        } else if (class137.field2088[99]) {
                                                                            field538 += (-12 - field538) / 2;
                                                                        } else {
                                                                            field538 /= 2;
                                                                        }
                                                                        field384 = class140.field2136;
                                                                        field476 = class140.field2141;
                                                                    }
                                                                    field496 = field381 / 2 + field496 & 0x7FF;
                                                                    field555 += field538 / 2;
                                                                    if (field555 < 128) {
                                                                        field555 = 128;
                                                                    }
                                                                    if (field555 > 383) {
                                                                        field555 = 383;
                                                                    }
                                                                    int var524 = Statics.field2252 >> 7;
                                                                    int var525 = Statics.field1985 >> 7;
                                                                    int var526 = method53(Statics.field2252, Statics.field1985, Statics.field1079);
                                                                    int var527 = 0;
                                                                    if (var524 > 3 && var525 > 3 && var524 < 100 && var525 < 100) {
                                                                        for (int var528 = var524 - 4; var528 <= var524 + 4; var528++) {
                                                                            for (int var529 = var525 - 4; var529 <= var525 + 4; var529++) {
                                                                                int var530 = Statics.field1079;
                                                                                if (var530 < 3 && (class6.field91[1][var528][var529] & 0x2) == 2) {
                                                                                    var530++;
                                                                                }
                                                                                int var531 = var526 - class6.field87[var530][var528][var529];
                                                                                if (var531 > var527) {
                                                                                    var527 = var531;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    int var532 = var527 * 192;
                                                                    if (var532 > 98048) {
                                                                        var532 = 98048;
                                                                    }
                                                                    if (var532 < 32768) {
                                                                        var532 = 32768;
                                                                    }
                                                                    if (var532 > field388) {
                                                                        field388 += (var532 - field388) / 24;
                                                                    } else if (var532 < field388) {
                                                                        field388 += (var532 - field388) / 80;
                                                                    }
                                                                    if (field543) {
                                                                        Statics.method153();
                                                                    }
                                                                    for (int var533 = 0; var533 < 5; var533++) {
                                                                        int var10002 = field423[var533]++;
                                                                    }
                                                                    Statics.field1959.method211();
                                                                    int var534 = ++class140.field2140 - 1;
                                                                    int var536 = class137.method1957();
                                                                    if (var534 > 15000 && var536 > 15000) {
                                                                        field346 = 250;
                                                                        class140.field2140 = 14500;
                                                                        field302.method2586(183);
                                                                    }
                                                                    field363++;
                                                                    if (field363 > 500) {
                                                                        field363 = 0;
                                                                        int var537 = (int) (Math.random() * 8.0D);
                                                                        if ((var537 & 0x1) == 1) {
                                                                            field357 += field358;
                                                                        }
                                                                        if ((var537 & 0x2) == 2) {
                                                                            field380 += field556;
                                                                        }
                                                                        if ((var537 & 0x4) == 4) {
                                                                            field361 += field362;
                                                                        }
                                                                    }
                                                                    if (field357 < -50) {
                                                                        field358 = 2;
                                                                    }
                                                                    if (field357 > 50) {
                                                                        field358 = -2;
                                                                    }
                                                                    if (field380 < -55) {
                                                                        field556 = 2;
                                                                    }
                                                                    if (field380 > 55) {
                                                                        field556 = -2;
                                                                    }
                                                                    if (field361 < -40) {
                                                                        field362 = 1;
                                                                    }
                                                                    if (field361 > 40) {
                                                                        field362 = -1;
                                                                    }
                                                                    field368++;
                                                                    if (field368 > 500) {
                                                                        field368 = 0;
                                                                        int var538 = (int) (Math.random() * 8.0D);
                                                                        if ((var538 & 0x1) == 1) {
                                                                            field547 += field365;
                                                                        }
                                                                        if ((var538 & 0x2) == 2) {
                                                                            field366 += field450;
                                                                        }
                                                                    }
                                                                    if (field547 < -60) {
                                                                        field365 = 2;
                                                                    }
                                                                    if (field547 > 60) {
                                                                        field365 = -2;
                                                                    }
                                                                    if (field366 < -20) {
                                                                        field450 = 1;
                                                                    }
                                                                    if (field366 > 10) {
                                                                        field450 = -1;
                                                                    }
                                                                    for (class39 var539 = (class39) field429.method3532(); var539 != null; var539 = (class39) field429.method3533()) {
                                                                        if ((long) var539.field876 < class115.method207() / 1000L - 5L) {
                                                                            if (var539.field875 > 0) {
                                                                                class12.method2769(5, "", var539.field873 + class157.field2438);
                                                                            }
                                                                            if (var539.field875 == 0) {
                                                                                class12.method2769(5, "", var539.field873 + class157.field2323);
                                                                            }
                                                                            var539.method3655();
                                                                        }
                                                                    }
                                                                    field342++;
                                                                    if (field342 > 50) {
                                                                        field302.method2586(163);
                                                                    }
                                                                    try {
                                                                        if (Statics.field2913 != null && field302.field1980 > 0) {
                                                                            Statics.field2913.method2821(field302.field1981, 0, field302.field1980);
                                                                            field302.field1980 = 0;
                                                                            field342 = 0;
                                                                            return;
                                                                        }
                                                                    } catch (IOException var545) {
                                                                        if (field346 > 0) {
                                                                            method3697();
                                                                        } else {
                                                                            method10(40);
                                                                            Statics.field2070 = Statics.field2913;
                                                                            Statics.field2913 = null;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                var450 = var449.field7;
                                                                if (var450.field2745 < 0) {
                                                                    break;
                                                                }
                                                                var451 = class173.method2041(var450.field2763);
                                                            } while (var451 == null || var451.field2866 == null || var450.field2745 >= var451.field2866.length || var451.field2866[var450.field2745] != var450);
                                                            class37.method2928(var449);
                                                        }
                                                    }
                                                    var447 = var446.field7;
                                                    if (var447.field2745 < 0) {
                                                        break;
                                                    }
                                                    var448 = class173.method2041(var447.field2763);
                                                } while (var448 == null || var448.field2866 == null || var447.field2745 >= var448.field2866.length || var448.field2866[var447.field2745] != var447);
                                                class37.method2928(var446);
                                            }
                                        }
                                        var444 = var443.field7;
                                        if (var444.field2745 < 0) {
                                            break;
                                        }
                                        var445 = class173.method2041(var444.field2763);
                                    } while (var445 == null || var445.field2866 == null || var444.field2745 >= var445.field2866.length || var445.field2866[var444.field2745] != var444);
                                    class37.method2928(var443);
                                }
                            }
                        } else if (field346 > 0) {
                            method3697();
                        } else {
                            method10(40);
                            Statics.field2070 = Statics.field2913;
                            Statics.field2913 = null;
                        }
                    }
                }
            }
        } else if (field553 == 40 || field553 == 45) {
            method574();
        }
    }

    @ObfuscatedName("client.m(I)V")
    public final void method365() {
        boolean var1;
        label183: {
            try {
                if (class183.field2948 == 2) {
                    if (Statics.field2951 == null) {
                        Statics.field2951 = class180.method3284(Statics.field2947, Statics.field2946, Statics.field2949);
                        if (Statics.field2951 == null) {
                            var1 = false;
                            break label183;
                        }
                    }
                    if (Statics.field2122 == null) {
                        Statics.field2122 = new class60(Statics.field2944, Statics.field2945);
                    }
                    if (Statics.field2943.method3379(Statics.field2951, Statics.field594, Statics.field2122, 22050)) {
                        Statics.field2943.method3380();
                        Statics.field2943.method3377(Statics.field2078);
                        Statics.field2943.method3463(Statics.field2951, Statics.field2950);
                        class183.field2948 = 0;
                        Statics.field2951 = null;
                        Statics.field2122 = null;
                        Statics.field2947 = null;
                        var1 = true;
                        break label183;
                    }
                }
            } catch (Exception var20) {
                var20.printStackTrace();
                Statics.field2943.method3382();
                class183.field2948 = 0;
                Statics.field2951 = null;
                Statics.field2122 = null;
                Statics.field2947 = null;
            }
            var1 = false;
        }
        if (var1 && field534 && Statics.field1381 != null) {
            Statics.field1381.method1170();
        }
        if (field553 == 10 || field553 == 20 || field553 == 30) {
            if (field508 != 0L && class115.method207() > field508) {
                int var4 = field509 ? 2 : 1;
                field508 = 0L;
                if (var4 >= 2) {
                    field509 = true;
                } else {
                    field509 = false;
                }
                method1775();
                if (field553 >= 25) {
                    field302.method2586(78);
                    class122 var5 = field302;
                    int var6 = field509 ? 2 : 1;
                    var5.method2330(var6);
                    field302.method2331(Statics.field108);
                    field302.method2331(Statics.field750);
                }
                field2191 = true;
            } else if (field2193) {
                method3167();
            }
        }
        Dimension var7 = this.method2851();
        if (Statics.field3162 != var7.width || Statics.field1006 != var7.height || field2188) {
            method1775();
            field508 = class115.method207() + 500L;
            field2188 = false;
        }
        boolean var8 = false;
        if (field2191) {
            field2191 = false;
            var8 = true;
            for (int var9 = 0; var9 < 100; var9++) {
                field500[var9] = true;
            }
        }
        if (var8) {
            method742();
        }
        if (field553 == 0) {
            class144.method776(class32.field751, class32.field741, (Color) null, var8);
        } else if (field553 == 5) {
            class32.method1571(Statics.field877, Statics.field1628, Statics.field1349, var8);
        } else if (field553 == 10 || field553 == 11) {
            class32.method1571(Statics.field877, Statics.field1628, Statics.field1349, var8);
        } else if (field553 == 20) {
            class32.method1571(Statics.field877, Statics.field1628, Statics.field1349, var8);
        } else if (field553 == 25) {
            if (field352 == 1) {
                if (field445 > field349) {
                    field349 = field445;
                }
                int var10 = (field349 * 50 - field445 * 50) / field349;
                method3494(class157.field2556 + class2.field20 + class2.field14 + var10 + "%" + class2.field18, false);
            } else if (field352 == 2) {
                if (field350 > field479) {
                    field479 = field350;
                }
                int var11 = (field479 * 50 - field350 * 50) / field479 + 50;
                method3494(class157.field2556 + class2.field20 + class2.field14 + var11 + "%" + class2.field18, false);
            } else {
                method3494(class157.field2556, false);
            }
        } else if (field553 == 30) {
            Statics.method2581();
        } else if (field553 == 40) {
            method3494(class157.field2449 + class2.field20 + class157.field2305, false);
        } else if (field553 == 45) {
            method3494(class157.field2472, false);
        }
        if (field553 == 30 && field523 == 0 && !var8) {
            try {
                Graphics var12 = Statics.field1043.getGraphics();
                for (int var13 = 0; var13 < field498; var13++) {
                    if (field501[var13]) {
                        Statics.field2150.method1526(var12, field503[var13], field516[var13], field505[var13], field506[var13]);
                        field501[var13] = false;
                    }
                }
            } catch (Exception var19) {
                Statics.field1043.repaint();
            }
        } else if (field553 > 0) {
            try {
                Graphics var15 = Statics.field1043.getGraphics();
                Statics.field2150.method1525(var15, 0, 0);
                for (int var16 = 0; var16 < field498; var16++) {
                    field501[var16] = false;
                }
            } catch (Exception var18) {
                Statics.field1043.repaint();
            }
        }
    }

    @ObfuscatedName("client.j(B)V")
    public final void method248() {
        if (Statics.field1959.method218()) {
            Statics.field1959.method214();
        }
        if (Statics.field1601 != null) {
            Statics.field1601.field192 = false;
        }
        Statics.field1601 = null;
        if (Statics.field2913 != null) {
            Statics.field2913.method2837();
            Statics.field2913 = null;
        }
        class137.method2139();
        class140.method1558();
        Statics.field1895 = null;
        if (Statics.field1381 != null) {
            Statics.field1381.method1171();
        }
        if (Statics.field54 != null) {
            Statics.field54.method1171();
        }
        if (Statics.field1550 != null) {
            Statics.field1550.method2837();
        }
        class170.method962();
        class149.method2943();
    }

    @ObfuscatedName("r.n(II)V")
    public static void method10(int arg0) {
        if (field553 == arg0) {
            return;
        }
        if (field553 == 0) {
            Statics.field1755 = null;
            Statics.field1100 = null;
            Statics.field2125 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field336 = 0;
            field385 = 0;
            field422 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2070 != null) {
            Statics.field2070.method2837();
            Statics.field2070 = null;
        }
        if (field553 == 25) {
            field352 = 0;
            field445 = 0;
            field349 = 1;
            field350 = 0;
            field479 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            Statics.method2808(Statics.field1043, Statics.field3147, Statics.field128, true, 0);
        } else if (arg0 == 20) {
            Statics.method2808(Statics.field1043, Statics.field3147, Statics.field128, true, field553 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            Statics.method2808(Statics.field1043, Statics.field3147, Statics.field128, false, 4);
        } else if (Statics.field746) {
            Statics.field2039 = null;
            Statics.field3113 = null;
            Statics.field3139 = null;
            Statics.field718 = null;
            Statics.field719 = null;
            Statics.field160 = null;
            Statics.field1161 = null;
            Statics.field1394 = null;
            Statics.field720 = null;
            Statics.field701 = null;
            Statics.field881 = null;
            Statics.field1095 = null;
            Statics.field1588 = null;
            Statics.field747 = null;
            Statics.field257 = null;
            Statics.field725 = null;
            Statics.field173 = null;
            Statics.field724 = null;
            Statics.field591 = null;
            Statics.field2230 = null;
            Statics.field1385 = null;
            Statics.field776 = null;
            class183.method2941(2);
            class171.method17(true);
            Statics.field746 = false;
        }
        field553 = arg0;
    }

    @ObfuscatedName("client.l(I)V")
    public void method249() {
        if (field553 != 1000) {
            boolean var1 = class171.method952();
            if (!var1) {
                this.method525();
            }
        }
    }

    @ObfuscatedName("client.h(S)V")
    public void method525() {
        if (class171.field2721 >= 4) {
            this.method2877("js5crc");
            field553 = 1000;
            return;
        }
        if (class171.field2722 >= 4) {
            if (field553 <= 5) {
                this.method2877("js5io");
                field553 = 1000;
                return;
            }
            field324 = 3000;
            class171.field2722 = 3;
        }
        if (--field324 + 1 > 0) {
            return;
        }
        try {
            if (field405 == 0) {
                Statics.field770 = Statics.field2057.method2710(Statics.field769, Statics.field801);
                field405++;
            }
            if (field405 == 1) {
                if (Statics.field770.field2203 == 2) {
                    this.method251(-1);
                    return;
                }
                if (Statics.field770.field2203 == 1) {
                    field405++;
                }
            }
            if (field405 == 2) {
                Statics.field2650 = new class143((Socket) Statics.field770.field2207, Statics.field2057);
                class119 var1 = new class119(5);
                var1.method2330(15);
                var1.method2496(109);
                Statics.field2650.method2821(var1.field1981, 0, 5);
                field405++;
                Statics.field1358 = class115.method207();
            }
            if (field405 == 3) {
                if (field553 <= 5 || Statics.field2650.method2819() > 0) {
                    int var2 = Statics.field2650.method2823();
                    if (var2 != 0) {
                        this.method251(var2);
                        return;
                    }
                    field405++;
                } else if (class115.method207() - Statics.field1358 > 30000L) {
                    this.method251(-2);
                    return;
                }
            }
            if (field405 == 4) {
                class143 var3 = Statics.field2650;
                boolean var4 = field553 > 20;
                if (Statics.field1550 != null) {
                    try {
                        Statics.field1550.method2837();
                    } catch (Exception var14) {
                    }
                    Statics.field1550 = null;
                }
                Statics.field1550 = var3;
                class171.method17(var4);
                class171.field2715.field1980 = 0;
                Statics.field1869 = null;
                Statics.field1389 = null;
                class171.field2707 = 0;
                while (true) {
                    class172 var6 = (class172) class171.field2708.method3551();
                    if (var6 == null) {
                        while (true) {
                            class172 var7 = (class172) class171.field2713.method3551();
                            if (var7 == null) {
                                if (class171.field2720 != 0) {
                                    try {
                                        class119 var8 = new class119(4);
                                        var8.method2330(4);
                                        var8.method2330(class171.field2720);
                                        var8.method2331(0);
                                        Statics.field1550.method2821(var8.field1981, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field1550.method2837();
                                        } catch (Exception var12) {
                                        }
                                        class171.field2722++;
                                        Statics.field1550 = null;
                                    }
                                }
                                class171.field2717 = 0;
                                Statics.field2705 = class115.method207();
                                Statics.field770 = null;
                                Statics.field2650 = null;
                                field405 = 0;
                                field325 = 0;
                                return;
                            }
                            class171.field2710.method3624(var7);
                            class171.field2719.method3546(var7, var7.field3112);
                            class171.field2712++;
                            class171.field2714--;
                        }
                    }
                    class171.field2706.method3546(var6, var6.field3112);
                    class171.field2726++;
                    class171.field2718--;
                }
            }
        } catch (IOException var15) {
            this.method251(-3);
        }
    }

    @ObfuscatedName("client.i(II)V")
    public void method251(int arg0) {
        Statics.field770 = null;
        Statics.field2650 = null;
        field405 = 0;
        if (Statics.field801 == Statics.field1351) {
            Statics.field801 = Statics.field1613;
        } else {
            Statics.field801 = Statics.field1351;
        }
        field325++;
        if (field325 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field553 <= 5) {
                this.method2877("js5connect_full");
                field553 = 1000;
            } else {
                field324 = 3000;
            }
        } else if (field325 >= 2 && arg0 == 6) {
            this.method2877("js5connect_outofdate");
            field553 = 1000;
        } else if (field325 >= 4) {
            if (field553 <= 5) {
                this.method2877("js5connect");
                field553 = 1000;
            } else {
                field324 = 3000;
            }
        }
    }

    @ObfuscatedName("ed.v(B)V")
    public static void method2930() {
        if (field322 == 0) {
            Statics.field1397 = new class86(4, 104, 104, class6.field87);
            for (int var0 = 0; var0 < 4; var0++) {
                field360[var0] = new class108(104, 104);
            }
            Statics.field22 = new class79(512, 512);
            class32.field741 = class157.field2463;
            class32.field751 = 5;
            field322 = 20;
        } else if (field322 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class91.field1573[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class86.method1855(var1, 500, 800, 512, 334);
            class32.field741 = class157.field2307;
            class32.field751 = 10;
            field322 = 30;
        } else if (field322 == 30) {
            Statics.field673 = method163(0, false, true, true);
            Statics.field2130 = method163(1, false, true, true);
            Statics.field1080 = method163(2, true, false, true);
            Statics.field3041 = method163(3, false, true, true);
            Statics.field182 = method163(4, false, true, true);
            Statics.field1089 = method163(5, true, true, true);
            Statics.field2055 = method163(6, true, true, false);
            Statics.field2893 = method163(7, false, true, true);
            Statics.field128 = method163(8, false, true, true);
            Statics.field19 = method163(9, false, true, true);
            Statics.field3147 = method163(10, false, true, true);
            Statics.field702 = method163(11, false, true, true);
            Statics.field624 = method163(12, false, true, true);
            Statics.field1392 = method163(13, true, false, true);
            Statics.field2036 = method163(14, false, true, false);
            Statics.field589 = method163(15, false, true, true);
            class32.field741 = class157.field2402;
            class32.field751 = 20;
            field322 = 40;
        } else if (field322 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field673.method3130() * 4 / 100;
            int var8 = var7 + Statics.field2130.method3130() * 4 / 100;
            int var9 = var8 + Statics.field1080.method3130() * 2 / 100;
            int var10 = var9 + Statics.field3041.method3130() * 2 / 100;
            int var11 = var10 + Statics.field182.method3130() * 6 / 100;
            int var12 = var11 + Statics.field1089.method3130() * 4 / 100;
            int var13 = var12 + Statics.field2055.method3130() * 2 / 100;
            int var14 = var13 + Statics.field2893.method3130() * 60 / 100;
            int var15 = var14 + Statics.field128.method3130() * 2 / 100;
            int var16 = var15 + Statics.field19.method3130() * 2 / 100;
            int var17 = var16 + Statics.field3147.method3130() * 2 / 100;
            int var18 = var17 + Statics.field702.method3130() * 2 / 100;
            int var19 = var18 + Statics.field624.method3130() * 2 / 100;
            int var20 = var19 + Statics.field1392.method3130() * 2 / 100;
            int var21 = var20 + Statics.field2036.method3130() * 2 / 100;
            int var22 = var21 + Statics.field589.method3130() * 2 / 100;
            if (var22 == 100) {
                class32.field741 = class157.field2310;
                class32.field751 = 30;
                field322 = 45;
            } else {
                if (var22 != 0) {
                    class32.field741 = class157.field2309 + var22 + "%";
                }
                class32.field751 = 30;
            }
        } else if (field322 == 45) {
            boolean var23 = !field298;
            Statics.field1186 = 22050;
            Statics.field1174 = var23;
            Statics.field1175 = 2;
            class184 var24 = new class184();
            var24.method3411(9, 128);
            Statics.field1381 = class57.method629(Statics.field2057, Statics.field1043, 0, 22050);
            Statics.field1381.method1167(var24);
            class168 var25 = Statics.field589;
            class168 var26 = Statics.field2036;
            class168 var27 = Statics.field182;
            Statics.field594 = var25;
            Statics.field2945 = var26;
            Statics.field2944 = var27;
            Statics.field2943 = var24;
            Statics.field54 = class57.method629(Statics.field2057, Statics.field1043, 1, 2048);
            Statics.field974 = new class56();
            Statics.field54.method1167(Statics.field974);
            Statics.field151 = new class75(22050, Statics.field1186);
            class32.field741 = class157.field2311;
            class32.field751 = 35;
            field322 = 50;
        } else if (field322 == 50) {
            int var28 = 0;
            if (Statics.field1628 == null) {
                Statics.field1628 = class77.method1556(Statics.field128, Statics.field1392, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field1349 == null) {
                Statics.field1349 = class77.method1556(Statics.field128, Statics.field1392, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field877 == null) {
                Statics.field877 = class77.method1556(Statics.field128, Statics.field1392, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class32.field741 = class157.field2312 + var28 * 100 / 3 + "%";
                class32.field751 = 40;
            } else {
                Statics.field155 = new class160(true);
                class32.field741 = class157.field2464;
                class32.field751 = 40;
                field322 = 60;
            }
        } else if (field322 == 60) {
            int var29 = class32.method206(Statics.field3147, Statics.field128);
            byte var30 = 9;
            if (var29 < var30) {
                class32.field741 = class157.field2314 + var29 * 100 / var30 + "%";
                class32.field751 = 50;
            } else {
                class32.field741 = class157.field2315;
                class32.field751 = 50;
                method10(5);
                field322 = 70;
            }
        } else if (field322 == 70) {
            if (Statics.field1080.method3029()) {
                class168 var32 = Statics.field1080;
                Statics.field1060 = var32;
                class168 var33 = Statics.field1080;
                Statics.field976 = var33;
                class45.method46(Statics.field1080, Statics.field2893);
                class168 var34 = Statics.field1080;
                class168 var35 = Statics.field2893;
                boolean var36 = field298;
                Statics.field966 = var34;
                Statics.field925 = var35;
                class41.field941 = var36;
                class40.method113(Statics.field1080, Statics.field2893);
                class168 var37 = Statics.field1080;
                class168 var38 = Statics.field2893;
                boolean var39 = field297;
                class224 var40 = Statics.field1628;
                Statics.field1147 = var37;
                Statics.field66 = var38;
                Statics.field1110 = var39;
                Statics.field2656 = Statics.field1147.method3035(10);
                Statics.field1375 = var40;
                class43.method187(Statics.field1080, Statics.field673, Statics.field2130);
                class44.method3216(Statics.field1080, Statics.field2893);
                class48.method2(Statics.field1080);
                class168 var41 = Statics.field1080;
                Statics.field1157 = var41;
                Statics.field1158 = Statics.field1157.method3035(16);
                class168 var42 = Statics.field3041;
                class168 var43 = Statics.field2893;
                class168 var44 = Statics.field128;
                class168 var45 = Statics.field1392;
                Statics.field2783 = var42;
                Statics.field2736 = var43;
                Statics.field2737 = var44;
                Statics.field2033 = var45;
                Statics.field2851 = new class173[Statics.field2783.method3049()][];
                Statics.field2734 = new boolean[Statics.field2783.method3049()];
                class51.method2058(Statics.field1080);
                class49.method175(Statics.field1080);
                class168 var46 = Statics.field1080;
                Statics.field1047 = var46;
                class50.method2807(Statics.field1080);
                Statics.field1959 = new class20();
                class32.field741 = class157.field2317;
                class32.field751 = 60;
                field322 = 80;
            } else {
                class32.field741 = class157.field2316 + Statics.field1080.method3137() + "%";
                class32.field751 = 60;
            }
        } else if (field322 == 80) {
            int var47 = 0;
            if (Statics.field2237 == null) {
                Statics.field2237 = class77.method1(Statics.field128, "compass", "");
            } else {
                var47++;
            }
            if (Statics.field280 == null) {
                Statics.field280 = class77.method1(Statics.field128, "mapedge", "");
            } else {
                var47++;
            }
            if (Statics.field677 == null) {
                Statics.field677 = class77.method649(Statics.field128, "mapscene", "");
            } else {
                var47++;
            }
            if (Statics.field2001 == null) {
                Statics.field2001 = class77.method1520(Statics.field128, "mapfunction", "");
            } else {
                var47++;
            }
            if (Statics.field546 == null) {
                Statics.field546 = class77.method1520(Statics.field128, "hitmarks", "");
            } else {
                var47++;
            }
            if (Statics.field217 == null) {
                Statics.field217 = class77.method1520(Statics.field128, "headicons_pk", "");
            } else {
                var47++;
            }
            if (Statics.field788 == null) {
                Statics.field788 = class77.method1520(Statics.field128, "headicons_prayer", "");
            } else {
                var47++;
            }
            if (Statics.field371 == null) {
                Statics.field371 = class77.method1520(Statics.field128, "headicons_hint", "");
            } else {
                var47++;
            }
            if (Statics.field372 == null) {
                Statics.field372 = class77.method1520(Statics.field128, "mapmarker", "");
            } else {
                var47++;
            }
            if (Statics.field207 == null) {
                Statics.field207 = class77.method1520(Statics.field128, "cross", "");
            } else {
                var47++;
            }
            if (Statics.field666 == null) {
                Statics.field666 = class77.method1520(Statics.field128, "mapdots", "");
            } else {
                var47++;
            }
            if (Statics.field3175 == null) {
                Statics.field3175 = class77.method649(Statics.field128, "scrollbar", "");
            } else {
                var47++;
            }
            if (Statics.field740 == null) {
                Statics.field740 = class77.method649(Statics.field128, "mod_icons", "");
            } else {
                var47++;
            }
            if (var47 < 13) {
                class32.field741 = class157.field2318 + var47 * 100 / 13 + "%";
                class32.field751 = 70;
            } else {
                Statics.field3188 = Statics.field740;
                Statics.field280.method1606();
                int var48 = (int) (Math.random() * 21.0D) - 10;
                int var49 = (int) (Math.random() * 21.0D) - 10;
                int var50 = (int) (Math.random() * 21.0D) - 10;
                int var51 = (int) (Math.random() * 41.0D) - 20;
                for (int var52 = 0; var52 < Statics.field2001.length; var52++) {
                    Statics.field2001[var52].method1605(var48 + var51, var49 + var51, var50 + var51);
                }
                Statics.field677[0].method1756(var48 + var51, var49 + var51, var50 + var51);
                class32.field741 = class157.field2351;
                class32.field751 = 70;
                field322 = 90;
            }
        } else if (field322 == 90) {
            if (Statics.field19.method3029()) {
                class95 var53 = new class95(Statics.field19, Statics.field128, 20, 0.8D, field298 ? 64 : 128);
                class91.method2001(var53);
                class91.method1968(0.8D);
                class32.field741 = class157.field2490;
                class32.field751 = 90;
                field322 = 110;
            } else {
                class32.field741 = class157.field2320 + Statics.field19.method3137() + "%";
                class32.field751 = 90;
            }
        } else if (field322 == 110) {
            Statics.field1601 = new class14();
            Statics.field2057.method2719(Statics.field1601, 10);
            class32.field741 = class157.field2322;
            class32.field751 = 94;
            field322 = 120;
        } else if (field322 == 120) {
            if (Statics.field3147.method3043("huffman", "")) {
                class113 var54 = new class113(Statics.field3147.method3042("huffman", ""));
                Statics.field3178 = var54;
                class32.field741 = class157.field2306;
                class32.field751 = 96;
                field322 = 130;
            } else {
                class32.field741 = class157.field2487 + "%";
                class32.field751 = 96;
            }
        } else if (field322 == 130) {
            if (!Statics.field3041.method3029()) {
                class32.field741 = class157.field2325 + Statics.field3041.method3137() * 4 / 5 + "%";
                class32.field751 = 100;
            } else if (!Statics.field624.method3029()) {
                class32.field741 = class157.field2325 + (80 + Statics.field624.method3137() / 6) + "%";
                class32.field751 = 100;
            } else if (Statics.field1392.method3029()) {
                class32.field741 = class157.field2476;
                class32.field751 = 100;
                field322 = 140;
            } else {
                class32.field741 = class157.field2325 + (96 + Statics.field1392.method3137() / 20) + "%";
                class32.field751 = 100;
            }
        } else if (field322 == 140) {
            method10(10);
        }
    }

    @ObfuscatedName("h.z(IZZZI)Lfn;")
    public static class168 method163(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class134 var4 = null;
        if (class149.field2226 != null) {
            var4 = new class134(arg0, class149.field2226, Statics.field3222[arg0], 1000000);
        }
        return new class168(var4, Statics.field221, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("q.u(I)V")
    public static final void method574() {
        try {
            if (field336 == 0) {
                if (Statics.field2913 != null) {
                    Statics.field2913.method2837();
                    Statics.field2913 = null;
                }
                Statics.field2236 = null;
                field347 = false;
                field385 = 0;
                field336 = 1;
            }
            if (field336 == 1) {
                if (Statics.field2236 == null) {
                    Statics.field2236 = Statics.field2057.method2710(Statics.field769, Statics.field801);
                }
                if (Statics.field2236.field2203 == 2) {
                    throw new IOException();
                }
                if (Statics.field2236.field2203 == 1) {
                    Statics.field2913 = new class143((Socket) Statics.field2236.field2207, Statics.field2057);
                    Statics.field2236 = null;
                    field336 = 2;
                }
            }
            if (field336 == 2) {
                field302.field1980 = 0;
                field302.method2330(14);
                Statics.field2913.method2821(field302.field1981, 0, 1);
                field473.field1980 = 0;
                field336 = 3;
            }
            if (field336 == 3) {
                if (Statics.field1381 != null) {
                    Statics.field1381.method1169();
                }
                if (Statics.field54 != null) {
                    Statics.field54.method1169();
                }
                int var0 = Statics.field2913.method2823();
                if (Statics.field1381 != null) {
                    Statics.field1381.method1169();
                }
                if (Statics.field54 != null) {
                    Statics.field54.method1169();
                }
                if (var0 != 0) {
                    method56(var0);
                    return;
                }
                field473.field1980 = 0;
                field336 = 5;
            }
            if (field336 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field302.field1980 = 0;
                field302.method2330(1);
                field302.method2330(class32.field716.method549());
                field302.method2496(var1[0]);
                field302.method2496(var1[1]);
                field302.method2496(var1[2]);
                field302.method2496(var1[3]);
                switch(class32.field716.field2583) {
                    case 0:
                    case 2:
                        field302.method2332(Statics.field2900);
                        field302.field1980 += 5;
                        break;
                    case 1:
                        field302.method2496((Integer) Statics.field1549.field135.get(class163.method2656(class32.field743)));
                        field302.field1980 += 4;
                        break;
                    case 3:
                        field302.field1980 += 8;
                }
                field302.method2336(class32.field727);
                field302.method2384(class5.field71, class5.field65);
                field478.field1980 = 0;
                if (field553 == 40) {
                    field478.method2330(18);
                } else {
                    field478.method2330(16);
                }
                field478.method2331(0);
                int var2 = field478.field1980;
                field478.method2496(109);
                field478.method2532(field302.field1981, 0, field302.field1980);
                int var3 = field478.field1980;
                field478.method2336(class32.field743);
                field478.method2330((field509 ? 1 : 0) << 1 | (field298 ? 1 : 0));
                field478.method2331(Statics.field108);
                field478.method2331(Statics.field750);
                class122 var4 = field478;
                byte[] var5 = new byte[24];
                try {
                    class149.field2224.method3881(0L);
                    class149.field2224.method3883(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var37) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2532(var5, 0, 24);
                field478.method2336(Statics.field59);
                field478.method2496(Statics.field300);
                class119 var9 = new class119(Statics.field155.method2950());
                Statics.field155.method2949(var9);
                field478.method2532(var9.field1981, 0, var9.field1981.length);
                field478.method2330(Statics.field463);
                field478.method2496(Statics.field673.field2666);
                field478.method2496(Statics.field2130.field2666);
                field478.method2496(Statics.field1080.field2666);
                field478.method2496(Statics.field3041.field2666);
                field478.method2496(Statics.field182.field2666);
                field478.method2496(Statics.field1089.field2666);
                field478.method2496(Statics.field2055.field2666);
                field478.method2496(Statics.field2893.field2666);
                field478.method2496(Statics.field128.field2666);
                field478.method2496(Statics.field19.field2666);
                field478.method2496(Statics.field3147.field2666);
                field478.method2496(Statics.field702.field2666);
                field478.method2496(Statics.field624.field2666);
                field478.method2496(Statics.field1392.field2666);
                field478.method2496(Statics.field2036.field2666);
                field478.method2496(Statics.field589.field2666);
                field478.method2363(var1, var3, field478.field1980);
                field478.method2341(field478.field1980 - var2);
                Statics.field2913.method2821(field478.field1981, 0, field478.field1980);
                field302.method2584(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field473.method2584(var1);
                field336 = 6;
            }
            if (field336 == 6 && Statics.field2913.method2819() > 0) {
                int var11 = Statics.field2913.method2823();
                if (var11 == 21 && field553 == 20) {
                    field336 = 7;
                } else if (var11 == 2) {
                    field336 = 9;
                } else if (var11 == 15 && field553 == 40) {
                    field570 = -1;
                    field336 = 13;
                } else if (var11 == 23 && field422 < 1) {
                    field422++;
                    field336 = 0;
                } else if (var11 == 29) {
                    field336 = 11;
                } else {
                    method56(var11);
                    return;
                }
            }
            if (field336 == 7 && Statics.field2913.method2819() > 0) {
                field329 = (Statics.field2913.method2823() + 3) * 60;
                field336 = 8;
            }
            if (field336 == 8) {
                field385 = 0;
                Statics.method57(class157.field2330, class157.field2439, field329 / 60 + class157.field2561);
                if (--field329 <= 0) {
                    field336 = 0;
                }
            } else {
                if (field336 == 9 && Statics.field2913.method2819() >= 13) {
                    boolean var12 = Statics.field2913.method2823() == 1;
                    Statics.field2913.method2820(field473.field1981, 0, 4);
                    field473.field1980 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field473.method2585() << 24;
                        int var15 = var14 | field473.method2585() << 16;
                        int var16 = var15 | field473.method2585() << 8;
                        int var17 = var16 | field473.method2585();
                        int var18 = class163.method2656(class32.field743);
                        if (Statics.field1549.field135.size() >= 10 && !Statics.field1549.field135.containsKey(var18)) {
                            Iterator var19 = Statics.field1549.field135.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field1549.field135.put(var18, var17);
                        class9.method2269();
                    }
                    field461 = Statics.field2913.method2823();
                    field472 = Statics.field2913.method2823() == 1;
                    field417 = Statics.field2913.method2823();
                    field417 <<= 0x8;
                    field417 += Statics.field2913.method2823();
                    field460 = Statics.field2913.method2823();
                    Statics.field2913.method2820(field473.field1981, 0, 1);
                    field473.field1980 = 0;
                    field489 = field473.method2585();
                    Statics.field2913.method2820(field473.field1981, 0, 2);
                    field473.field1980 = 0;
                    field570 = field473.method2347();
                    if (field460 == 1) {
                        try {
                            client var20 = Statics.field541;
                            JSObject.getWindow(var20).call("zap", (Object[]) null);
                        } catch (Throwable var36) {
                        }
                    } else {
                        try {
                            client var22 = Statics.field541;
                            JSObject.getWindow(var22).call("unzap", (Object[]) null);
                        } catch (Throwable var35) {
                        }
                    }
                    field336 = 10;
                }
                if (field336 != 10) {
                    if (field336 == 11 && Statics.field2913.method2819() >= 2) {
                        field473.field1980 = 0;
                        Statics.field2913.method2820(field473.field1981, 0, 2);
                        field473.field1980 = 0;
                        Statics.field330 = field473.method2347();
                        field336 = 12;
                    }
                    if (field336 == 12 && Statics.field2913.method2819() >= Statics.field330) {
                        field473.field1980 = 0;
                        Statics.field2913.method2820(field473.field1981, 0, Statics.field330);
                        field473.field1980 = 0;
                        String var24 = field473.method2353();
                        String var25 = field473.method2353();
                        String var26 = field473.method2353();
                        Statics.method57(var24, var25, var26);
                        method10(10);
                    }
                    if (field336 == 13) {
                        if (field570 == -1) {
                            if (Statics.field2913.method2819() < 2) {
                                return;
                            }
                            Statics.field2913.method2820(field473.field1981, 0, 2);
                            field473.field1980 = 0;
                            field570 = field473.method2347();
                        }
                        if (Statics.field2913.method2819() >= field570) {
                            Statics.field2913.method2820(field473.field1981, 0, field570);
                            field473.field1980 = 0;
                            int var27 = field570;
                            field302.field1980 = 0;
                            field473.field1980 = 0;
                            field489 = -1;
                            field343 = -1;
                            field344 = -1;
                            field345 = -1;
                            field570 = 0;
                            field341 = 0;
                            field311 = 0;
                            field436 = 0;
                            field471 = false;
                            field531 = 0;
                            field529 = 0;
                            for (int var28 = 0; var28 < 2048; var28++) {
                                field416[var28] = null;
                            }
                            Statics.field2254 = null;
                            for (int var29 = 0; var29 < field359.length; var29++) {
                                class35 var30 = field359[var29];
                                if (var30 != null) {
                                    var30.field838 = -1;
                                    var30.field819 = false;
                                }
                            }
                            class16.field226 = new class196(32);
                            method10(30);
                            for (int var31 = 0; var31 < 100; var31++) {
                                field500[var31] = true;
                            }
                            field302.method2586(78);
                            class122 var32 = field302;
                            int var33 = field509 ? 2 : 1;
                            var32.method2330(var33);
                            field302.method2331(Statics.field108);
                            field302.method2331(Statics.field750);
                            class33.method3169(field473);
                            if (field473.field1980 != var27) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field385++;
                        if (field385 > 2000) {
                            if (field422 < 1) {
                                if (Statics.field801 == Statics.field1351) {
                                    Statics.field801 = Statics.field1613;
                                } else {
                                    Statics.field801 = Statics.field1351;
                                }
                                field422++;
                                field336 = 0;
                            } else {
                                method56(-3);
                            }
                        }
                    }
                } else if (Statics.field2913.method2819() >= field570) {
                    field473.field1980 = 0;
                    Statics.field2913.method2820(field473.field1981, 0, field570);
                    Statics.method728();
                    class33.method3169(field473);
                    Statics.field874 = -1;
                    method777(false);
                    field489 = -1;
                }
            }
        } catch (IOException var38) {
            if (field422 < 1) {
                if (Statics.field801 == Statics.field1351) {
                    Statics.field801 = Statics.field1613;
                } else {
                    Statics.field801 = Statics.field1351;
                }
                field422++;
                field336 = 0;
            } else {
                method56(-2);
            }
        }
    }

    @ObfuscatedName("y.b(IB)V")
    public static void method56(int arg0) {
        if (arg0 == -3) {
            Statics.method57(class157.field2363, class157.field2397, class157.field2335);
        } else if (arg0 == -2) {
            Statics.method57(class157.field2336, class157.field2337, class157.field2338);
        } else if (arg0 == -1) {
            Statics.method57(class157.field2339, class157.field2340, class157.field2457);
        } else if (arg0 == 3) {
            class32.field734 = 3;
        } else if (arg0 == 4) {
            Statics.method57(class157.field2331, class157.field2319, class157.field2344);
        } else if (arg0 == 5) {
            Statics.method57(class157.field2327, class157.field2346, class157.field2347);
        } else if (arg0 == 6) {
            Statics.method57(class157.field2348, class157.field2479, class157.field2523);
        } else if (arg0 == 7) {
            Statics.method57(class157.field2417, class157.field2352, class157.field2353);
        } else if (arg0 == 8) {
            Statics.method57(class157.field2553, class157.field2355, class157.field2356);
        } else if (arg0 == 9) {
            Statics.method57(class157.field2334, class157.field2568, class157.field2558);
        } else if (arg0 == 10) {
            Statics.method57(class157.field2360, class157.field2361, class157.field2362);
        } else if (arg0 == 11) {
            Statics.method57(class157.field2375, class157.field2364, class157.field2365);
        } else if (arg0 == 12) {
            Statics.method57(class157.field2366, class157.field2367, class157.field2300);
        } else if (arg0 == 13) {
            Statics.method57(class157.field2369, class157.field2370, class157.field2371);
        } else if (arg0 == 14) {
            Statics.method57(class157.field2372, class157.field2566, class157.field2374);
        } else if (arg0 == 16) {
            Statics.method57(class157.field2354, class157.field2376, class157.field2377);
        } else if (arg0 == 17) {
            Statics.method57(class157.field2378, class157.field2379, class157.field2380);
        } else if (arg0 == 18) {
            Statics.method57(class157.field2381, class157.field2382, class157.field2383);
        } else if (arg0 == 19) {
            Statics.method57(class157.field2384, class157.field2385, class157.field2386);
        } else if (arg0 == 20) {
            Statics.method57(class157.field2387, class157.field2555, class157.field2389);
        } else if (arg0 == 22) {
            Statics.method57(class157.field2517, class157.field2391, class157.field2295);
        } else if (arg0 == 23) {
            Statics.method57(class157.field2393, class157.field2394, class157.field2395);
        } else if (arg0 == 24) {
            Statics.method57(class157.field2422, class157.field2420, class157.field2398);
        } else if (arg0 == 25) {
            Statics.method57(class157.field2399, class157.field2400, class157.field2416);
        } else if (arg0 == 26) {
            Statics.method57(class157.field2548, class157.field2403, class157.field2404);
        } else if (arg0 == 27) {
            Statics.method57(class157.field2549, class157.field2562, class157.field2390);
        } else if (arg0 == 31) {
            Statics.method57(class157.field2414, class157.field2415, class157.field2516);
        } else if (arg0 == 32) {
            Statics.method57(class157.field2411, class157.field2345, class157.field2419);
        } else if (arg0 == 37) {
            Statics.method57(class157.field2421, class157.field2431, class157.field2368);
        } else if (arg0 == 38) {
            Statics.method57(class157.field2423, class157.field2542, class157.field2425);
        } else if (arg0 == 55) {
            Statics.method57(class157.field2426, class157.field2427, class157.field2428);
        } else if (arg0 == 56) {
            Statics.method57(class157.field2429, class157.field2430, class157.field2293);
            method10(11);
            return;
        } else if (arg0 == 57) {
            Statics.method57(class157.field2432, class157.field2433, class157.field2326);
            method10(11);
            return;
        } else {
            Statics.method57(class157.field2324, class157.field2436, class157.field2455);
        }
        method10(10);
    }

    @ObfuscatedName("hc.c(I)V")
    public static final void method3697() {
        if (Statics.field2913 != null) {
            Statics.field2913.method2837();
            Statics.field2913 = null;
        }
        method3300();
        Statics.field1397.method1783();
        for (int var0 = 0; var0 < 4; var0++) {
            field360[var0].method2235();
        }
        System.gc();
        class183.method2941(2);
        field533 = -1;
        field534 = false;
        class24.method50();
        method10(10);
    }

    @ObfuscatedName("fs.x(I)V")
    public static final void method3300() {
        class47.method2945();
        class42.field982.method3515();
        class45.field1029.method3515();
        class41.field946.method3515();
        class41.field934.method3515();
        class41.field928.method3515();
        class41.field935.method3515();
        class40.field884.method3515();
        class40.field885.method3515();
        class52.field1138.method3515();
        class52.field1112.method3515();
        class52.field1156.method3515();
        class43.field987.method3515();
        class43.field1005.method3515();
        class44.field1009.method3515();
        class44.field1021.method3515();
        class48.method14();
        class53.method997();
        class179.method651();
        class173.field2738.method3515();
        class173.field2739.method3515();
        class173.field2802.method3515();
        class173.field2799.method3515();
        ((class95) Statics.field1575).method2046();
        class23.field605.method3515();
        Statics.field673.method3038();
        Statics.field2130.method3038();
        Statics.field3041.method3038();
        Statics.field182.method3038();
        Statics.field1089.method3038();
        Statics.field2055.method3038();
        Statics.field2893.method3038();
        Statics.field128.method3038();
        Statics.field19.method3038();
        Statics.field3147.method3038();
        Statics.field702.method3038();
        Statics.field624.method3038();
    }

    @ObfuscatedName("l.d(B)V")
    public static final void method143() {
        if (Statics.field54 != null) {
            Statics.field54.method1168();
        }
        if (Statics.field1381 != null) {
            Statics.field1381.method1168();
        }
    }

    @ObfuscatedName("t.p(I)V")
    public static final void method196() {
        for (int var0 = 0; var0 < field537; var0++) {
            int var10002 = field540[var0]--;
            if (field540[var0] >= -10) {
                class59 var2 = field542[var0];
                if (var2 == null) {
                    class59 var10000 = (class59) null;
                    var2 = class59.method1224(Statics.field182, field327[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field540[var0] += var2.method1217();
                    field542[var0] = var2;
                }
                if (field540[var0] < 0) {
                    int var9;
                    if (field504[var0] == 0) {
                        var9 = field535;
                    } else {
                        int var3 = (field504[var0] & 0xFF) * 128;
                        int var4 = field504[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2254.field871;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field504[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2254.field814;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field540[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field536 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1222().method1257(Statics.field151);
                        class65 var11 = class65.method1366(var10, 100, var9);
                        var11.method1280(field539[var0] - 1);
                        Statics.field974.method1127(var11);
                    }
                    field540[var0] = -100;
                }
            } else {
                field537--;
                for (int var1 = var0; var1 < field537; var1++) {
                    field327[var1] = field327[var1 + 1];
                    field542[var1] = field542[var1 + 1];
                    field539[var1] = field539[var1 + 1];
                    field540[var1] = field540[var1 + 1];
                    field504[var1] = field504[var1 + 1];
                }
                var0--;
            }
        }
        if (field534 && !class183.method880()) {
            if (field532 != 0 && field533 != -1) {
                class183.method1958(Statics.field2055, field533, 0, field532, false);
            }
            field534 = false;
        }
    }

    @ObfuscatedName("o.q(Lan;IIII)V")
    public static void method626(class43 arg0, int arg1, int arg2, int arg3) {
        if (field537 >= 50 || field536 == 0 || arg0.field988 == null || arg1 >= arg0.field988.length) {
            return;
        }
        int var4 = arg0.field988[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field327[field537] = var5;
        field539[field537] = var6;
        field540[field537] = 0;
        field542[field537] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field504[field537] = (var8 << 16) + (var9 << 8) + var7;
        field537++;
    }

    @ObfuscatedName("at.w(III)V")
    public static void method637(int arg0, int arg1) {
        if (field532 != 0 && arg0 != -1) {
            class183.method1958(Statics.field702, arg0, 0, field532, false);
            field534 = true;
        }
    }

    @ObfuscatedName("bm.k(I)V")
    public static final void method1587() {
        int[] var0 = class33.field760;
        for (int var1 = 0; var1 < class33.field775; var1++) {
            class3 var2 = field416[var0[var1]];
            if (var2 != null && var2.field856 > 0) {
                var2.field856--;
                if (var2.field856 == 0) {
                    var2.field826 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field332; var3++) {
            int var4 = field565[var3];
            class35 var5 = field359[var4];
            if (var5 != null && var5.field856 > 0) {
                var5.field856--;
                if (var5.field856 == 0) {
                    var5.field826 = null;
                }
            }
        }
    }

    @ObfuscatedName("f.ad(B)V")
    public static final void method44() {
        int var0 = class33.field775;
        int[] var1 = class33.field760;
        for (int var2 = 0; var2 < var0; var2++) {
            class3 var3 = field416[var1[var2]];
            if (var3 != null) {
                method1001(var3, 1);
            }
        }
    }

    @ObfuscatedName("au.at(Lab;II)V")
    public static final void method1001(class38 arg0, int arg1) {
        if (arg0.field858 > field304) {
            method135(arg0);
        } else if (arg0.field864 >= field304) {
            method18(arg0);
        } else {
            arg0.field841 = arg0.field818;
            if (arg0.field866 == 0) {
                arg0.field849 = 0;
            } else {
                label213: {
                    if (arg0.field870 != -1 && arg0.field847 == 0) {
                        class43 var2 = class43.method2701(arg0.field870);
                        if (arg0.field862 > 0 && var2.field1000 == 0) {
                            arg0.field849++;
                            break label213;
                        }
                        if (arg0.field862 <= 0 && var2.field993 == 0) {
                            arg0.field849++;
                            break label213;
                        }
                    }
                    int var3 = arg0.field871;
                    int var4 = arg0.field814;
                    int var5 = arg0.field867[arg0.field866 - 1] * 128 + arg0.field817 * 64;
                    int var6 = arg0.field868[arg0.field866 - 1] * 128 + arg0.field817 * 64;
                    if (var3 < var5) {
                        if (var4 < var6) {
                            arg0.field863 = 1280;
                        } else if (var4 > var6) {
                            arg0.field863 = 1792;
                        } else {
                            arg0.field863 = 1536;
                        }
                    } else if (var3 > var5) {
                        if (var4 < var6) {
                            arg0.field863 = 768;
                        } else if (var4 > var6) {
                            arg0.field863 = 256;
                        } else {
                            arg0.field863 = 512;
                        }
                    } else if (var4 < var6) {
                        arg0.field863 = 1024;
                    } else if (var4 > var6) {
                        arg0.field863 = 0;
                    }
                    byte var7 = arg0.field832[arg0.field866 - 1];
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        int var8 = arg0.field863 - arg0.field815 & 0x7FF;
                        if (var8 > 1024) {
                            var8 -= 2048;
                        }
                        int var9 = arg0.field822;
                        if (var8 >= -256 && var8 <= 256) {
                            var9 = arg0.field821;
                        } else if (var8 >= 256 && var8 < 768) {
                            var9 = arg0.field824;
                        } else if (var8 >= -768 && var8 <= -256) {
                            var9 = arg0.field861;
                        }
                        if (var9 == -1) {
                            var9 = arg0.field821;
                        }
                        arg0.field841 = var9;
                        int var10 = 4;
                        boolean var11 = true;
                        if (arg0 instanceof class35) {
                            var11 = ((class35) arg0).field786.field916;
                        }
                        if (var11) {
                            if (arg0.field863 != arg0.field815 && arg0.field838 == -1 && arg0.field865 != 0) {
                                var10 = 2;
                            }
                            if (arg0.field866 > 2) {
                                var10 = 6;
                            }
                            if (arg0.field866 > 3) {
                                var10 = 8;
                            }
                            if (arg0.field849 > 0 && arg0.field866 > 1) {
                                var10 = 8;
                                arg0.field849--;
                            }
                        } else {
                            if (arg0.field866 > 1) {
                                var10 = 6;
                            }
                            if (arg0.field866 > 2) {
                                var10 = 8;
                            }
                            if (arg0.field849 > 0 && arg0.field866 > 1) {
                                var10 = 8;
                                arg0.field849--;
                            }
                        }
                        if (var7 == 2) {
                            var10 <<= 0x1;
                        }
                        if (var10 >= 8 && arg0.field841 == arg0.field821 && arg0.field829 != -1) {
                            arg0.field841 = arg0.field829;
                        }
                        if (var3 != var5 || var4 != var6) {
                            if (var3 < var5) {
                                arg0.field871 += var10;
                                if (arg0.field871 > var5) {
                                    arg0.field871 = var5;
                                }
                            } else if (var3 > var5) {
                                arg0.field871 -= var10;
                                if (arg0.field871 < var5) {
                                    arg0.field871 = var5;
                                }
                            }
                            if (var4 < var6) {
                                arg0.field814 += var10;
                                if (arg0.field814 > var6) {
                                    arg0.field814 = var6;
                                }
                            } else if (var4 > var6) {
                                arg0.field814 -= var10;
                                if (arg0.field814 < var6) {
                                    arg0.field814 = var6;
                                }
                            }
                        }
                        if (arg0.field871 == var5 && arg0.field814 == var6) {
                            arg0.field866--;
                            if (arg0.field862 > 0) {
                                arg0.field862--;
                            }
                        }
                    } else {
                        arg0.field871 = var5;
                        arg0.field814 = var6;
                        arg0.field866--;
                        if (arg0.field862 > 0) {
                            arg0.field862--;
                        }
                    }
                }
            }
        }
        if (arg0.field871 < 128 || arg0.field814 < 128 || arg0.field871 >= 13184 || arg0.field814 >= 13184) {
            arg0.field870 = -1;
            arg0.field860 = -1;
            arg0.field858 = 0;
            arg0.field864 = 0;
            arg0.field871 = arg0.field867[0] * 128 + arg0.field817 * 64;
            arg0.field814 = arg0.field868[0] * 128 + arg0.field817 * 64;
            arg0.method735();
        }
        if (Statics.field2254 == arg0 && (arg0.field871 < 1536 || arg0.field814 < 1536 || arg0.field871 >= 11776 || arg0.field814 >= 11776)) {
            arg0.field870 = -1;
            arg0.field860 = -1;
            arg0.field858 = 0;
            arg0.field864 = 0;
            arg0.field871 = arg0.field867[0] * 128 + arg0.field817 * 64;
            arg0.field814 = arg0.field868[0] * 128 + arg0.field817 * 64;
            arg0.method735();
        }
        method718(arg0);
        method2970(arg0);
    }

    @ObfuscatedName("n.aw(Lab;I)V")
    public static final void method135(class38 arg0) {
        int var1 = arg0.field858 - field304;
        int var2 = arg0.field854 * 128 + arg0.field817 * 64;
        int var3 = arg0.field817 * 64 + arg0.field813 * 128;
        arg0.field871 += (var2 - arg0.field871) / var1;
        arg0.field814 += (var3 - arg0.field814) / var1;
        arg0.field849 = 0;
        arg0.field863 = arg0.field825;
    }

    @ObfuscatedName("r.ax(Lab;I)V")
    public static final void method18(class38 arg0) {
        if (field304 == arg0.field864 || arg0.field870 == -1 || arg0.field847 != 0 || arg0.field857 + 1 > class43.method2701(arg0.field870).field991[arg0.field845]) {
            int var1 = arg0.field864 - arg0.field858;
            int var2 = field304 - arg0.field858;
            int var3 = arg0.field854 * 128 + arg0.field817 * 64;
            int var4 = arg0.field817 * 64 + arg0.field813 * 128;
            int var5 = arg0.field855 * 128 + arg0.field817 * 64;
            int var6 = arg0.field835 * 128 + arg0.field817 * 64;
            arg0.field871 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field814 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field849 = 0;
        arg0.field863 = arg0.field825;
        arg0.field815 = arg0.field863;
    }

    @ObfuscatedName("am.ak(Lab;I)V")
    public static final void method718(class38 arg0) {
        if (arg0.field865 == 0) {
            return;
        }
        if (arg0.field838 != -1) {
            class38 var1 = null;
            if (arg0.field838 < 32768) {
                var1 = field359[arg0.field838];
            } else if (arg0.field838 >= 32768) {
                var1 = field416[arg0.field838 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field871 - var1.field871;
                int var3 = arg0.field814 - var1.field814;
                if (var2 != 0 || var3 != 0) {
                    arg0.field863 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field819) {
                arg0.field838 = -1;
                arg0.field819 = false;
            }
        }
        if (arg0.field840 != -1 && (arg0.field866 == 0 || arg0.field849 > 0)) {
            arg0.field863 = arg0.field840;
            arg0.field840 = -1;
        }
        int var4 = arg0.field863 - arg0.field815 & 0x7FF;
        if (var4 == 0 && arg0.field819) {
            arg0.field838 = -1;
            arg0.field819 = false;
        }
        if (var4 == 0) {
            arg0.field844 = 0;
            return;
        }
        arg0.field844++;
        if (var4 > 1024) {
            arg0.field815 -= arg0.field865;
            boolean var5 = true;
            if (var4 < arg0.field865 || var4 > 2048 - arg0.field865) {
                arg0.field815 = arg0.field863;
                var5 = false;
            }
            if (arg0.field841 == arg0.field818 && (arg0.field844 > 25 || var5)) {
                if (arg0.field831 == -1) {
                    arg0.field841 = arg0.field821;
                } else {
                    arg0.field841 = arg0.field831;
                }
            }
        } else {
            arg0.field815 += arg0.field865;
            boolean var6 = true;
            if (var4 < arg0.field865 || var4 > 2048 - arg0.field865) {
                arg0.field815 = arg0.field863;
                var6 = false;
            }
            if (arg0.field841 == arg0.field818 && (arg0.field844 > 25 || var6)) {
                if (arg0.field820 == -1) {
                    arg0.field841 = arg0.field821;
                } else {
                    arg0.field841 = arg0.field820;
                }
            }
        }
        arg0.field815 &= 0x7FF;
    }

    @ObfuscatedName("fr.ah(Lab;I)V")
    public static final void method2970(class38 arg0) {
        arg0.field816 = false;
        if (arg0.field841 != -1) {
            class43 var1 = class43.method2701(arg0.field841);
            if (var1 == null || var1.field989 == null) {
                arg0.field841 = -1;
            } else {
                arg0.field843++;
                if (arg0.field842 < var1.field989.length && arg0.field843 > var1.field991[arg0.field842]) {
                    arg0.field843 = 1;
                    arg0.field842++;
                    method626(var1, arg0.field842, arg0.field871, arg0.field814);
                }
                if (arg0.field842 >= var1.field989.length) {
                    arg0.field843 = 0;
                    arg0.field842 = 0;
                    method626(var1, arg0.field842, arg0.field871, arg0.field814);
                }
            }
        }
        if (arg0.field860 != -1 && field304 >= arg0.field869) {
            if (arg0.field850 < 0) {
                arg0.field850 = 0;
            }
            int var2 = class44.method588(arg0.field860).field1013;
            if (var2 == -1) {
                arg0.field860 = -1;
            } else {
                class43 var3 = class43.method2701(var2);
                if (var3 == null || var3.field989 == null) {
                    arg0.field860 = -1;
                } else {
                    arg0.field851++;
                    if (arg0.field850 < var3.field989.length && arg0.field851 > var3.field991[arg0.field850]) {
                        arg0.field851 = 1;
                        arg0.field850++;
                        method626(var3, arg0.field850, arg0.field871, arg0.field814);
                    }
                    if (arg0.field850 >= var3.field989.length && (arg0.field850 < 0 || arg0.field850 >= var3.field989.length)) {
                        arg0.field860 = -1;
                    }
                }
            }
        }
        if (arg0.field870 != -1 && arg0.field847 <= 1) {
            class43 var4 = class43.method2701(arg0.field870);
            if (var4.field1000 == 1 && arg0.field862 > 0 && arg0.field858 <= field304 && arg0.field864 < field304) {
                arg0.field847 = 1;
                return;
            }
        }
        if (arg0.field870 != -1 && arg0.field847 == 0) {
            class43 var5 = class43.method2701(arg0.field870);
            if (var5 == null || var5.field989 == null) {
                arg0.field870 = -1;
            } else {
                arg0.field857++;
                if (arg0.field845 < var5.field989.length && arg0.field857 > var5.field991[arg0.field845]) {
                    arg0.field857 = 1;
                    arg0.field845++;
                    method626(var5, arg0.field845, arg0.field871, arg0.field814);
                }
                if (arg0.field845 >= var5.field989.length) {
                    arg0.field845 -= var5.field1001;
                    arg0.field848++;
                    if (arg0.field848 >= var5.field999) {
                        arg0.field870 = -1;
                    } else if (arg0.field845 >= 0 && arg0.field845 < var5.field989.length) {
                        method626(var5, arg0.field845, arg0.field871, arg0.field814);
                    } else {
                        arg0.field870 = -1;
                    }
                }
                arg0.field816 = var5.field995;
            }
        }
        if (arg0.field847 > 0) {
            arg0.field847--;
        }
    }

    @ObfuscatedName("z.ac(Lf;IIB)V")
    public static void method179(class3 arg0, int arg1, int arg2) {
        if (arg0.field870 == arg1 && arg1 != -1) {
            int var3 = class43.method2701(arg1).field1002;
            if (var3 == 1) {
                arg0.field845 = 0;
                arg0.field857 = 0;
                arg0.field847 = arg2;
                arg0.field848 = 0;
            }
            if (var3 == 2) {
                arg0.field848 = 0;
            }
        } else if (arg1 == -1 || arg0.field870 == -1 || class43.method2701(arg1).field984 >= class43.method2701(arg0.field870).field984) {
            arg0.field870 = arg1;
            arg0.field845 = 0;
            arg0.field857 = 0;
            arg0.field847 = arg2;
            arg0.field848 = 0;
            arg0.field862 = arg0.field866;
        }
    }

    @ObfuscatedName("ft.as(I)V")
    public static void method3167() {
        class137.method843(Statics.field1043);
        class140.method2616(Statics.field1043);
        if (Statics.field1895 != null) {
            Statics.field1895.method2666(Statics.field1043);
        }
        Statics.field541.method2865();
        Statics.field1043.setBackground(Color.black);
        Canvas var0 = Statics.field1043;
        var0.setFocusTraversalKeysEnabled(false);
        var0.addKeyListener(class137.field2109);
        var0.addFocusListener(class137.field2109);
        class140.method2064(Statics.field1043);
        if (Statics.field1895 != null) {
            Statics.field1895.method2671(Statics.field1043);
        }
        if (field454 != -1) {
            int var1 = field454;
            int var2 = Statics.field108;
            int var3 = Statics.field750;
            if (Statics.method2150(var1)) {
                Statics.method12(Statics.field2851[var1], -1, var2, var3, false);
            }
        }
        field2188 = true;
    }

    @ObfuscatedName("ct.ao(I)V")
    public static void method1775() {
        client var0 = Statics.field541;
        synchronized (Statics.field541) {
            Container var1 = Statics.field541.method2850();
            if (var1 != null) {
                Statics.field3162 = Math.max(var1.getSize().width, Statics.field1986);
                Statics.field1006 = Math.max(var1.getSize().height, Statics.field2161);
                if (Statics.field1218 == var1) {
                    Insets var2 = Statics.field1218.getInsets();
                    Statics.field3162 -= var2.right + var2.left;
                    Statics.field1006 -= var2.top + var2.bottom;
                }
                if (Statics.field3162 <= 0) {
                    Statics.field3162 = 1;
                }
                if (Statics.field1006 <= 0) {
                    Statics.field1006 = 1;
                }
                int var3 = field509 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field108 = field418;
                    Statics.field750 = field519 * 503;
                } else {
                    Statics.field108 = Math.min(Statics.field3162, 7680);
                    Statics.field750 = Math.min(Statics.field1006, 2160);
                }
                field2180 = (Statics.field3162 - Statics.field108) / 2;
                field2190 = 0;
                Statics.field1043.setSize(Statics.field108, Statics.field750);
                Statics.field2150 = class78.method240(Statics.field108, Statics.field750, Statics.field1043);
                if (Statics.field1218 == var1) {
                    Insets var4 = Statics.field1218.getInsets();
                    Statics.field1043.setLocation(field2180 + var4.left, field2190 + var4.top);
                } else {
                    Statics.field1043.setLocation(field2180, field2190);
                }
                method985();
                if (field454 != -1) {
                    int var5 = field454;
                    int var6 = Statics.field108;
                    int var7 = Statics.field750;
                    if (Statics.method2150(var5)) {
                        Statics.method12(Statics.field2851[var5], -1, var6, var7, true);
                    }
                }
                method742();
            }
        }
    }

    @ObfuscatedName("af.am(B)V")
    public static void method985() {
        int var0 = Statics.field108;
        int var1 = Statics.field750;
        if (Statics.field3162 < var0) {
            int var2 = Statics.field3162;
        }
        if (Statics.field1006 < var1) {
            int var3 = Statics.field1006;
        }
        if (Statics.field1549 == null) {
            return;
        }
        try {
            client var4 = Statics.field541;
            int var5 = field509 ? 2 : 1;
            Object[] var6 = new Object[] { var5 };
            JSObject.getWindow(var4).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("al.ai(S)V")
    public static void method742() {
        int var0 = field2180;
        int var1 = field2190;
        int var2 = Statics.field3162 - Statics.field108 - var0;
        int var3 = Statics.field1006 - Statics.field750 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field541.method2850();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1218 == var4) {
                Insets var7 = Statics.field1218.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field1006);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field3162, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field3162 + var5 - var2, var6, var2, Statics.field1006);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field1006 + var6 - var3, Statics.field3162, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("gu.al(Ljava/lang/String;ZI)V")
    public static final void method3494(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1349.method3769(arg0, 250);
        int var6 = Statics.field1349.method3770(arg0, 250) * 13;
        class80.method1704(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1727(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1349.method3810(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method203(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method5(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1043.getGraphics();
            Statics.field2150.method1525(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1043.repaint();
        }
    }

    @ObfuscatedName("bq.ar(IIIII)V")
    public static final void method1182(int arg0, int arg1, int arg2, int arg3) {
        field400++;
        method627(class34.field777);
        boolean var4 = false;
        if (field522 >= 0) {
            int var5 = class33.field775;
            int[] var6 = class33.field760;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field522 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method627(class34.field784);
        }
        method1511(true);
        method627(var4 ? class34.field779 : class34.field778);
        method1511(false);
        for (class7 var8 = (class7) field386.method3575(); var8 != null; var8 = (class7) field386.method3576()) {
            if (Statics.field1079 != var8.field97 || field304 > var8.field103) {
                var8.method3661();
            } else if (field304 >= var8.field123) {
                if (var8.field106 > 0) {
                    class35 var9 = field359[var8.field106 - 1];
                    if (var9 != null && var9.field871 >= 0 && var9.field871 < 13312 && var9.field814 >= 0 && var9.field814 < 13312) {
                        var8.method104(var9.field871, var9.field814, method53(var9.field871, var9.field814, var8.field97) - var8.field101, field304);
                    }
                }
                if (var8.field106 < 0) {
                    int var10 = -var8.field106 - 1;
                    class3 var11;
                    if (field417 == var10) {
                        var11 = Statics.field2254;
                    } else {
                        var11 = field416[var10];
                    }
                    if (var11 != null && var11.field871 >= 0 && var11.field871 < 13312 && var11.field814 >= 0 && var11.field814 < 13312) {
                        var8.method104(var11.field871, var11.field814, method53(var11.field871, var11.field814, var8.field97) - var8.field101, field304);
                    }
                }
                var8.method105(field410);
                Statics.field1397.method1829(Statics.field1079, (int) var8.field114, (int) var8.field109, (int) var8.field110, 60, var8, var8.field116, -1, false);
            }
        }
        method2936();
        method169(arg0, arg1, arg2, arg3, true);
        int var12 = field558;
        int var13 = field559;
        int var14 = field560;
        int var15 = field561;
        class80.method1726(var12, var13, var12 + var14, var13 + var15);
        class91.method2014();
        if (!field543) {
            int var16 = field555;
            if (field388 / 256 > var16) {
                var16 = field388 / 256;
            }
            if (field391[4] && field512[4] + 128 > var16) {
                var16 = field512[4] + 128;
            }
            int var17 = field496 + field361 & 0x7FF;
            method2806(Statics.field2252, method53(Statics.field2254.field871, Statics.field2254.field814, Statics.field1079) - field334, Statics.field1985, var16, var17, var16 * 3 + 600);
        }
        int var30;
        if (field543) {
            var30 = method2940();
        } else {
            int var18;
            if (Statics.field1549.field132) {
                var18 = Statics.field1079;
            } else {
                label307: {
                    int var19 = 3;
                    if (Statics.field220 < 310) {
                        int var20 = Statics.field1038 >> 7;
                        int var21 = Statics.field255 >> 7;
                        int var22 = Statics.field2254.field871 >> 7;
                        int var23 = Statics.field2254.field814 >> 7;
                        if (var20 < 0 || var21 < 0 || var20 >= 104 || var21 >= 104) {
                            var18 = Statics.field1079;
                            break label307;
                        }
                        if ((class6.field91[Statics.field1079][var20][var21] & 0x4) != 0) {
                            var19 = Statics.field1079;
                        }
                        int var24;
                        if (var22 > var20) {
                            var24 = var22 - var20;
                        } else {
                            var24 = var20 - var22;
                        }
                        int var25;
                        if (var23 > var21) {
                            var25 = var23 - var21;
                        } else {
                            var25 = var21 - var23;
                        }
                        if (var24 > var25) {
                            int var26 = var25 * 65536 / var24;
                            int var27 = 32768;
                            while (var20 != var22) {
                                if (var20 < var22) {
                                    var20++;
                                } else if (var20 > var22) {
                                    var20--;
                                }
                                if ((class6.field91[Statics.field1079][var20][var21] & 0x4) != 0) {
                                    var19 = Statics.field1079;
                                }
                                var27 += var26;
                                if (var27 >= 65536) {
                                    var27 -= 65536;
                                    if (var21 < var23) {
                                        var21++;
                                    } else if (var21 > var23) {
                                        var21--;
                                    }
                                    if ((class6.field91[Statics.field1079][var20][var21] & 0x4) != 0) {
                                        var19 = Statics.field1079;
                                    }
                                }
                            }
                        } else {
                            int var28 = var24 * 65536 / var25;
                            int var29 = 32768;
                            while (var21 != var23) {
                                if (var21 < var23) {
                                    var21++;
                                } else if (var21 > var23) {
                                    var21--;
                                }
                                if ((class6.field91[Statics.field1079][var20][var21] & 0x4) != 0) {
                                    var19 = Statics.field1079;
                                }
                                var29 += var28;
                                if (var29 >= 65536) {
                                    var29 -= 65536;
                                    if (var20 < var22) {
                                        var20++;
                                    } else if (var20 > var22) {
                                        var20--;
                                    }
                                    if ((class6.field91[Statics.field1079][var20][var21] & 0x4) != 0) {
                                        var19 = Statics.field1079;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field2254.field871 >= 0 && Statics.field2254.field814 >= 0 && Statics.field2254.field871 < 13312 && Statics.field2254.field814 < 13312) {
                        if ((class6.field91[Statics.field1079][Statics.field2254.field871 >> 7][Statics.field2254.field814 >> 7] & 0x4) != 0) {
                            var19 = Statics.field1079;
                        }
                        var18 = var19;
                    } else {
                        var18 = Statics.field1079;
                    }
                }
            }
            var30 = var18;
        }
        int var31 = Statics.field1038;
        int var32 = Statics.field714;
        int var33 = Statics.field255;
        int var34 = Statics.field220;
        int var35 = Statics.field194;
        for (int var36 = 0; var36 < 5; var36++) {
            if (field391[var36]) {
                int var37 = (int) (Math.random() * (double) (field426[var36] * 2 + 1) - (double) field426[var36] + Math.sin((double) field548[var36] / 100.0D * (double) field423[var36]) * (double) field512[var36]);
                if (var36 == 0) {
                    Statics.field1038 += var37;
                }
                if (var36 == 1) {
                    Statics.field714 += var37;
                }
                if (var36 == 2) {
                    Statics.field255 += var37;
                }
                if (var36 == 3) {
                    Statics.field194 = Statics.field194 + var37 & 0x7FF;
                }
                if (var36 == 4) {
                    Statics.field220 += var37;
                    if (Statics.field220 < 128) {
                        Statics.field220 = 128;
                    }
                    if (Statics.field220 > 383) {
                        Statics.field220 = 383;
                    }
                }
            }
        }
        int var38 = class140.field2141;
        int var39 = class140.field2136;
        if (class140.field2146 != 0) {
            var38 = class140.field2147;
            var39 = class140.field2148;
        }
        if (var38 >= var12 && var38 < var12 + var14 && var39 >= var13 && var39 < var13 + var15) {
            class105.field1796 = true;
            class105.field1845 = 0;
            class105.field1843 = var38 - var12;
            class105.field1844 = var39 - var13;
        } else {
            class105.field1796 = false;
            class105.field1845 = 0;
        }
        method143();
        class80.method1704(var12, var13, var14, var15, 0);
        method143();
        int var40 = class91.field1563;
        class91.field1563 = field348;
        Statics.field1397.method1821(Statics.field1038, Statics.field714, Statics.field255, Statics.field220, Statics.field194, var30);
        class91.field1563 = var40;
        method143();
        Statics.field1397.method1797();
        method118(var12, var13, var14, var15);
        if (field312 == 2) {
            method1241((field419 - Statics.field2215 << 7) + field290, (field316 - Statics.field258 << 7) + field319, field317 * 2);
            if (field401 > -1 && field304 % 20 < 10) {
                Statics.field371[0].method1679(field401 + var12 - 12, field402 + var13 - 28);
            }
        }
        ((class95) Statics.field1575).method2056(field410);
        method959(var12, var13, var14, var15);
        Statics.field1038 = var31;
        Statics.field714 = var32;
        Statics.field255 = var33;
        Statics.field220 = var34;
        Statics.field194 = var35;
        if (field427) {
            byte var41 = 0;
            int var42 = class171.field2726 + class171.field2718 + var41;
            if (var42 == 0) {
                field427 = false;
            }
        }
        if (field427) {
            class80.method1704(var12, var13, var14, var15, 0);
            method3494(class157.field2556, false);
        }
    }

    @ObfuscatedName("i.aa(IIIIZI)V")
    public static final void method169(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field551 - field442) * var5 / 100 + field442;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field326) {
            short var8 = field326;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field373) {
                var6 = field373;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1747();
                    class80.method1704(arg0, arg1, var10, arg3, -16777216);
                    class80.method1704(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field557) {
            short var11 = field557;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field554) {
                var6 = field554;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1747();
                    class80.method1704(arg0, arg1, arg2, var13, -16777216);
                    class80.method1704(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field458 - field552) * var5 / 100 + field552;
        field348 = arg3 * var6 * var14 / 85504 << 1;
        if (field560 != arg2 || field561 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class91.field1573[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class86.method1855(var15, 500, 800, arg2, arg3);
        }
        field558 = arg0;
        field559 = arg1;
        field560 = arg2;
        field561 = arg3;
    }

    @ObfuscatedName("ad.ag(Las;I)V")
    public static final void method627(class34 arg0) {
        if (Statics.field2254.field871 >> 7 == field529 && Statics.field2254.field814 >> 7 == field530) {
            field529 = 0;
        }
        int var1 = class33.field775;
        int[] var2 = class33.field760;
        int var3 = var1;
        if (class34.field777 == arg0 || class34.field784 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field777 == arg0) {
                var5 = Statics.field2254;
                var6 = Statics.field2254.field49 << 14;
            } else if (class34.field784 == arg0) {
                var5 = field416[field522];
                var6 = field522 << 14;
            } else {
                var5 = field416[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field779 == arg0 && field522 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method25() && !var5.field53) {
                var5.field45 = false;
                if ((field298 && var1 > 50 || var1 > 200) && class34.field777 != arg0 && var5.field841 == var5.field818) {
                    var5.field45 = true;
                }
                int var7 = var5.field871 >> 7;
                int var8 = var5.field814 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field40 == null || field304 < var5.field35 || field304 >= var5.field36) {
                        if ((var5.field871 & 0x7F) == 64 && (var5.field814 & 0x7F) == 64) {
                            if (field400 == field399[var7][var8]) {
                                continue;
                            }
                            field399[var7][var8] = field400;
                        }
                        var5.field34 = method53(var5.field871, var5.field814, Statics.field1079);
                        Statics.field1397.method1829(Statics.field1079, var5.field871, var5.field814, var5.field34, 60, var5, var5.field815, var6, var5.field816);
                    } else {
                        var5.field45 = false;
                        var5.field34 = method53(var5.field871, var5.field814, Statics.field1079);
                        Statics.field1397.method1795(Statics.field1079, var5.field871, var5.field814, var5.field34, 60, var5, var5.field815, var6, var5.field26, var5.field42, var5.field52, var5.field51);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ba.an(ZB)V")
    public static final void method1511(boolean arg0) {
        for (int var1 = 0; var1 < field332; var1++) {
            class35 var2 = field359[field565[var1]];
            int var3 = (field565[var1] << 14) + 536870912;
            if (var2 != null && var2.method25() && var2.field786.field904 == arg0 && var2.field786.method750()) {
                int var4 = var2.field871 >> 7;
                int var5 = var2.field814 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field817 == 1 && (var2.field871 & 0x7F) == 64 && (var2.field814 & 0x7F) == 64) {
                        if (field400 == field399[var4][var5]) {
                            continue;
                        }
                        field399[var4][var5] = field400;
                    }
                    if (!var2.field786.field890) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1397.method1829(Statics.field1079, var2.field871, var2.field814, method53(var2.field871 + (var2.field817 * 64 - 64), var2.field814 + (var2.field817 * 64 - 64), Statics.field1079), var2.field817 * 64 - 64 + 60, var2, var2.field815, var3, var2.field816);
                }
            }
        }
    }

    @ObfuscatedName("eo.av(B)V")
    public static final void method2936() {
        for (class30 var0 = (class30) field430.method3575(); var0 != null; var0 = (class30) field430.method3576()) {
            if (Statics.field1079 != var0.field697 || var0.field694) {
                var0.method3661();
            } else if (field304 >= var0.field686) {
                var0.method647(field410);
                if (var0.field694) {
                    var0.method3661();
                } else {
                    Statics.field1397.method1829(var0.field697, var0.field688, var0.field689, var0.field690, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("er.aj(B)I")
    public static final int method2940() {
        if (Statics.field1549.field132) {
            return Statics.field1079;
        } else {
            int var0 = method53(Statics.field1038, Statics.field255, Statics.field1079);
            return var0 - Statics.field714 >= 800 || (class6.field91[Statics.field1079][Statics.field1038 >> 7][Statics.field255 >> 7] & 0x4) == 0 ? 3 : Statics.field1079;
        }
    }

    @ObfuscatedName("hb.ap(Lab;IIIIIS)V")
    public static final void method3678(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method25()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field786;
            if (var6.field910 != null) {
                var6 = var6.method749();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field775;
        int[] var8 = class33.field760;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field53) {
                return;
            }
            if (var10.field28 != -1 || var10.field37 != -1) {
                method553(arg0, arg0.field846 + 15);
                if (field401 > -1) {
                    if (var10.field28 != -1) {
                        Statics.field217[var10.field28].method1679(field401 + arg2 - 12, field402 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field37 != -1) {
                        Statics.field788[var10.field37].method1679(field401 + arg2 - 12, field402 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field312 == 10 && field314 == var8[arg1]) {
                method553(arg0, arg0.field846 + 15);
                if (field401 > -1) {
                    Statics.field371[1].method1679(field401 + arg2 - 12, field402 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field786;
            if (var11.field910 != null) {
                var11 = var11.method749();
            }
            if (var11.field917 >= 0 && var11.field917 < Statics.field788.length) {
                method553(arg0, arg0.field846 + 15);
                if (field401 > -1) {
                    Statics.field788[var11.field917].method1679(field401 + arg2 - 12, field402 + arg3 - 30);
                }
            }
            if (field312 == 1 && field313 == field565[arg1 - var7] && field304 % 20 < 10) {
                method553(arg0, arg0.field846 + 15);
                if (field401 > -1) {
                    Statics.field371[0].method1679(field401 + arg2 - 12, field402 + arg3 - 28);
                }
            }
        }
        if (arg0.field826 != null && (arg1 >= var7 || !arg0.field830 && (field513 == 4 || !arg0.field827 && (field513 == 0 || field513 == 3 || field513 == 1 && method137(((class3) arg0).field41, false))))) {
            method553(arg0, arg0.field846);
            if (field401 > -1 && field389 < field390) {
                field394[field389] = Statics.field877.method3767(arg0.field826) / 2;
                field393[field389] = Statics.field877.field3194;
                field382[field389] = field401;
                field392[field389] = field402;
                field395[field389] = arg0.field823;
                field576[field389] = arg0.field828;
                field397[field389] = arg0.field856;
                field412[field389] = arg0.field826;
                field389++;
            }
        }
        if (arg0.field839 > field304) {
            method553(arg0, arg0.field846 + 15);
            if (field401 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field786;
                    var12 = var13.field896;
                }
                int var14 = arg0.field836 * var12 / arg0.field837;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field836 > 0) {
                    var14 = 1;
                }
                class80.method1704(field401 + arg2 - var12 / 2, field402 + arg3 - 3, var14, 5, 65280);
                class80.method1704(field401 + arg2 - var12 / 2 + var14, field402 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field834[var15] > field304) {
                method553(arg0, arg0.field846 / 2);
                if (field401 > -1) {
                    if (var15 == 1) {
                        field402 -= 20;
                    }
                    if (var15 == 2) {
                        field401 -= 15;
                        field402 -= 10;
                    }
                    if (var15 == 3) {
                        field401 += 15;
                        field402 -= 10;
                    }
                    Statics.field546[arg0.field833[var15]].method1679(field401 + arg2 - 12, field402 + arg3 - 12);
                    Statics.field1628.method3774(Integer.toString(arg0.field859[var15]), field401 + arg2 - 1, field402 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("j.aq(IIIII)V")
    public static final void method118(int arg0, int arg1, int arg2, int arg3) {
        field389 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class33.field775;
        int[] var7 = class33.field760;
        for (int var8 = 0; var8 < field332 + var6; var8++) {
            class38 var9;
            if (var8 < var6) {
                var9 = field416[var7[var8]];
                if (field522 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field359[field565[var8 - var6]];
            }
            method3678(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method3678(field416[field522], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field389; var10++) {
            int var11 = field382[var10];
            int var12 = field392[var10];
            int var13 = field394[var10];
            int var14 = field393[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field392[var16] - field393[var16] && var12 - var14 < field392[var16] + 2 && var11 - var13 < field394[var16] + field382[var16] && var11 + var13 > field382[var16] - field394[var16] && field392[var16] - field393[var16] < var12) {
                        var12 = field392[var16] - field393[var16];
                        var15 = true;
                    }
                }
            }
            field401 = field382[var10];
            field402 = field392[var10] = var12;
            String var17 = field412[var10];
            if (field456 == 0) {
                int var18 = 16776960;
                if (field395[var10] < 6) {
                    var18 = field517[field395[var10]];
                }
                if (field395[var10] == 6) {
                    var18 = field400 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field395[var10] == 7) {
                    var18 = field400 % 20 < 10 ? 255 : 65535;
                }
                if (field395[var10] == 8) {
                    var18 = field400 % 20 < 10 ? 45056 : 8454016;
                }
                if (field395[var10] == 9) {
                    int var19 = 150 - field397[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field395[var10] == 10) {
                    int var20 = 150 - field397[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field395[var10] == 11) {
                    int var21 = 150 - field397[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field576[var10] == 0) {
                    Statics.field877.method3774(var17, field401 + arg0, field402 + arg1, var18, 0);
                }
                if (field576[var10] == 1) {
                    Statics.field877.method3776(var17, field401 + arg0, field402 + arg1, var18, 0, field400);
                }
                if (field576[var10] == 2) {
                    Statics.field877.method3777(var17, field401 + arg0, field402 + arg1, var18, 0, field400);
                }
                if (field576[var10] == 3) {
                    Statics.field877.method3778(var17, field401 + arg0, field402 + arg1, var18, 0, field400, 150 - field397[var10]);
                }
                if (field576[var10] == 4) {
                    int var22 = (150 - field397[var10]) * (Statics.field877.method3767(var17) + 100) / 150;
                    class80.method1699(field401 + arg0 - 50, arg1, field401 + arg0 + 50, arg1 + arg3);
                    Statics.field877.method3772(var17, field401 + arg0 + 50 - var22, field402 + arg1, var18, 0);
                    class80.method1726(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field576[var10] == 5) {
                    int var23 = 150 - field397[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class80.method1699(arg0, field402 + arg1 - Statics.field877.field3194 - 1, arg0 + arg2, field402 + arg1 + 5);
                    Statics.field877.method3774(var17, field401 + arg0, field402 + arg1 + var24, var18, 0);
                    class80.method1726(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field877.method3774(var17, field401 + arg0, field402 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("y.af(I)V")
    public static final void method55() {
        field415 = 0;
        int var0 = (Statics.field2254.field871 >> 7) + Statics.field2215;
        int var1 = (Statics.field2254.field814 >> 7) + Statics.field258;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field415 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field415 = 1;
        }
        if (field415 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field415 = 0;
        }
    }

    @ObfuscatedName("aq.ay(IIIII)V")
    public static final void method959(int arg0, int arg1, int arg2, int arg3) {
        if (field406 == 1) {
            Statics.field207[field356 / 100].method1679(field403 - 8, field404 - 8);
        }
        if (field406 == 2) {
            Statics.field207[field356 / 100 + 4].method1679(field403 - 8, field404 - 8);
        }
        method55();
    }

    @ObfuscatedName("d.au(Lab;II)V")
    public static final void method553(class38 arg0, int arg1) {
        method1241(arg0.field871, arg0.field814, arg1);
    }

    @ObfuscatedName("bu.az(IIII)V")
    public static final void method1241(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field401 = -1;
            field402 = -1;
            return;
        }
        int var3 = method53(arg0, arg1, Statics.field1079) - arg2;
        int var4 = arg0 - Statics.field1038;
        int var5 = var3 - Statics.field714;
        int var6 = arg1 - Statics.field255;
        int var7 = class91.field1573[Statics.field220];
        int var8 = class91.field1579[Statics.field220];
        int var9 = class91.field1573[Statics.field194];
        int var10 = class91.field1579[Statics.field194];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field401 = field348 * var11 / var15 + field560 / 2;
            field402 = field348 * var14 / var15 + field561 / 2;
        } else {
            field401 = -1;
            field402 = -1;
        }
    }

    @ObfuscatedName("y.ae(IIII)I")
    public static final int method53(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field91[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field87[var5][var3][var4] + class6.field87[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field87[var5][var3][var4 + 1] + class6.field87[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ej.bd(IIIIIII)V")
    public static final void method2806(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class91.field1573[var6];
            int var12 = class91.field1579[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class91.field1573[var7];
            int var15 = class91.field1579[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1038 = arg0 - var8;
        Statics.field714 = arg1 - var9;
        Statics.field255 = arg2 - var10;
        Statics.field220 = arg3;
        Statics.field194 = arg4;
    }

    @ObfuscatedName("ar.br(ZB)V")
    public static final void method777(boolean arg0) {
        field354 = arg0;
        if (!field354) {
            int var1 = field473.method2347();
            int var2 = field473.method2379();
            int var3 = field473.method2347();
            Statics.field242 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field242[var4][var5] = field473.method2350();
                }
            }
            Statics.field1952 = new int[var3];
            Statics.field2580 = new int[var3];
            Statics.field191 = new int[var3];
            Statics.field2995 = new byte[var3][];
            Statics.field215 = new byte[var3][];
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
                        Statics.field1952[var7] = var10;
                        Statics.field2580[var7] = Statics.field1089.method3040("m" + var8 + "_" + var9);
                        Statics.field191[var7] = Statics.field1089.method3040("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method2137(var1, var2);
            return;
        }
        int var11 = field473.method2347();
        int var12 = field473.method2347();
        int var13 = field473.method2347();
        field473.method2587();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field473.method2583(1);
                    if (var17 == 1) {
                        field355[var14][var15][var16] = field473.method2583(26);
                    } else {
                        field355[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field473.method2588();
        Statics.field242 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field242[var18][var19] = field473.method2350();
            }
        }
        Statics.field1952 = new int[var13];
        Statics.field2580 = new int[var13];
        Statics.field191 = new int[var13];
        Statics.field2995 = new byte[var13][];
        Statics.field215 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field355[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field1952[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field1952[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field2580[var20] = Statics.field1089.method3040("m" + var29 + "_" + var30);
                            Statics.field191[var20] = Statics.field1089.method3040("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method2137(var11, var12);
    }

    @ObfuscatedName("cd.bt(III)V")
    public static final void method2137(int arg0, int arg1) {
        if (Statics.field874 == arg0 && Statics.field149 == arg1) {
            return;
        }
        Statics.field874 = arg0;
        Statics.field149 = arg1;
        method10(25);
        method3494(class157.field2556, true);
        int var2 = Statics.field2215;
        int var3 = Statics.field258;
        Statics.field2215 = (arg0 - 6) * 8;
        Statics.field258 = (arg1 - 6) * 8;
        int var4 = Statics.field2215 - var2;
        int var5 = Statics.field258 - var3;
        int var6 = Statics.field2215;
        int var7 = Statics.field258;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field359[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field867[var10] -= var4;
                    var9.field868[var10] -= var5;
                }
                var9.field871 -= var4 * 128;
                var9.field814 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field416[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field867[var13] -= var4;
                    var12.field868[var13] -= var5;
                }
                var12.field871 -= var4 * 128;
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
                        field420[var24][var20][var21] = field420[var24][var22][var23];
                    } else {
                        field420[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field428.method3575(); var25 != null; var25 = (class17) field428.method3576()) {
            var25.field230 -= var4;
            var25.field245 -= var5;
            if (var25.field230 < 0 || var25.field245 < 0 || var25.field230 >= 104 || var25.field245 >= 104) {
                var25.method3661();
            }
        }
        if (field529 != 0) {
            field529 -= var4;
            field530 -= var5;
        }
        field537 = 0;
        field543 = false;
        field524 = -1;
        field430.method3569();
        field386.method3569();
        for (int var26 = 0; var26 < 4; var26++) {
            field360[var26].method2235();
        }
    }

    @ObfuscatedName("u.bp(ZI)V")
    public static final void method190(boolean arg0) {
        method143();
        field342++;
        if (field342 < 50 && !arg0) {
            return;
        }
        field342 = 0;
        if (field347 || Statics.field2913 == null) {
            return;
        }
        field302.method2586(163);
        try {
            Statics.field2913.method2821(field302.field1981, 0, field302.field1980);
            field302.field1980 = 0;
        } catch (IOException var2) {
            field347 = true;
        }
    }

    @ObfuscatedName("hk.bq(IIIIII)V")
    public static final void method3856(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1397.method1809(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1397.method1948(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field22.field1398;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method2944(var12);
            if (var13.field953 == -1) {
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
                class81 var14 = Statics.field677[var13.field953];
                if (var14 != null) {
                    int var15 = (var13.field939 * 4 - var14.field1419) / 2;
                    int var16 = (var13.field940 * 4 - var14.field1418) / 2;
                    var14.method1757(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field940) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1397.method1811(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1397.method1948(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method2944(var21);
            if (var22.field953 != -1) {
                class81 var23 = Statics.field677[var22.field953];
                if (var23 != null) {
                    int var24 = (var22.field939 * 4 - var23.field1419) / 2;
                    int var25 = (var22.field940 * 4 - var23.field1418) / 2;
                    var23.method1757(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field940) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field22.field1398;
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
        int var29 = Statics.field1397.method1812(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method2944(var30);
        if (var31.field953 == -1) {
            return;
        }
        class81 var32 = Statics.field677[var31.field953];
        if (var32 != null) {
            int var33 = (var31.field939 * 4 - var32.field1419) / 2;
            int var34 = (var31.field940 * 4 - var32.field1418) / 2;
            var32.method1757(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field940) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("t.bv(I)V")
    public static final void method192() {
        if (field489 == 108) {
            byte var0 = field473.method2372();
            int var1 = field473.method2379();
            byte var2 = field473.method2375();
            byte var3 = field473.method2372();
            int var4 = field473.method2347();
            int var5 = field473.method2371();
            int var6 = (var5 >> 4 & 0x7) + Statics.field67;
            int var7 = (var5 & 0x7) + Statics.field125;
            int var8 = field473.method2379();
            int var9 = field473.method2523();
            int var10 = field473.method2371();
            int var11 = var10 >> 2;
            int var12 = var10 & 0x3;
            int var13 = field398[var11];
            byte var14 = field473.method2375();
            class3 var15;
            if (field417 == var9) {
                var15 = Statics.field2254;
            } else {
                var15 = field416[var9];
            }
            if (var15 != null) {
                class41 var16 = class41.method2944(var8);
                int var17;
                int var18;
                if (var12 == 1 || var12 == 3) {
                    var17 = var16.field940;
                    var18 = var16.field939;
                } else {
                    var17 = var16.field939;
                    var18 = var16.field940;
                }
                int var19 = (var17 >> 1) + var6;
                int var20 = (var17 + 1 >> 1) + var6;
                int var21 = (var18 >> 1) + var7;
                int var22 = (var18 + 1 >> 1) + var7;
                int[][] var23 = class6.field87[Statics.field1079];
                int var24 = var23[var19][var21] + var23[var20][var21] + var23[var19][var22] + var23[var20][var22] >> 2;
                int var25 = (var6 << 7) + (var17 << 6);
                int var26 = (var7 << 7) + (var18 << 6);
                class105 var27 = var16.method787(var11, var12, var23, var25, var24, var26);
                if (var27 != null) {
                    method3302(Statics.field1079, var6, var7, var13, -1, 0, 0, var4 + 1, var1 + 1);
                    var15.field35 = field304 + var4;
                    var15.field36 = field304 + var1;
                    var15.field40 = var27;
                    var15.field47 = var6 * 128 + var17 * 64;
                    var15.field43 = var7 * 128 + var18 * 64;
                    var15.field38 = var24;
                    if (var14 > var2) {
                        byte var28 = var14;
                        var14 = var2;
                        var2 = var28;
                    }
                    if (var3 > var0) {
                        byte var29 = var3;
                        var3 = var0;
                        var0 = var29;
                    }
                    var15.field26 = var6 + var14;
                    var15.field52 = var2 + var6;
                    var15.field42 = var3 + var7;
                    var15.field51 = var0 + var7;
                }
            }
        }
        if (field489 == 244) {
            int var30 = field473.method2412();
            int var31 = (var30 >> 4 & 0x7) + Statics.field67;
            int var32 = (var30 & 0x7) + Statics.field125;
            int var33 = field473.method2347();
            int var34 = field473.method2347();
            int var35 = field473.method2347();
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                class199 var36 = field420[Statics.field1079][var31][var32];
                if (var36 != null) {
                    for (class29 var37 = (class29) var36.method3575(); var37 != null; var37 = (class29) var36.method3576()) {
                        if ((var33 & 0x7FFF) == var37.field682 && var37.field678 == var34) {
                            var37.field678 = var35;
                            break;
                        }
                    }
                    method3117(var31, var32);
                }
            }
        } else if (field489 == 200) {
            int var38 = field473.method2373();
            int var39 = var38 >> 2;
            int var40 = var38 & 0x3;
            int var41 = field398[var39];
            int var42 = field473.method2475();
            int var43 = (var42 >> 4 & 0x7) + Statics.field67;
            int var44 = (var42 & 0x7) + Statics.field125;
            if (var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
                method3302(Statics.field1079, var43, var44, var41, -1, var39, var40, 0, -1);
            }
        } else {
            if (field489 == 184) {
                int var45 = field473.method2412();
                int var46 = (var45 >> 4 & 0x7) + Statics.field67;
                int var47 = (var45 & 0x7) + Statics.field125;
                int var48 = field473.method2347();
                int var49 = field473.method2412();
                int var50 = var49 >> 4 & 0xF;
                int var51 = var49 & 0x7;
                int var52 = field473.method2412();
                if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                    int var53 = var50 + 1;
                    if (Statics.field2254.field867[0] >= var46 - var53 && Statics.field2254.field867[0] <= var46 + var53 && Statics.field2254.field868[0] >= var47 - var53 && Statics.field2254.field868[0] <= var47 + var53 && field536 != 0 && var51 > 0 && field537 < 50) {
                        field327[field537] = var48;
                        field539[field537] = var51;
                        field540[field537] = var52;
                        field542[field537] = null;
                        field504[field537] = (var46 << 16) + (var47 << 8) + var50;
                        field537++;
                    }
                }
            }
            if (field489 == 240) {
                int var54 = field473.method2412();
                int var55 = (var54 >> 4 & 0x7) + Statics.field67;
                int var56 = (var54 & 0x7) + Statics.field125;
                int var57 = field473.method2523();
                if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
                    class199 var58 = field420[Statics.field1079][var55][var56];
                    if (var58 != null) {
                        for (class29 var59 = (class29) var58.method3575(); var59 != null; var59 = (class29) var58.method3576()) {
                            if ((var57 & 0x7FFF) == var59.field682) {
                                var59.method3661();
                                break;
                            }
                        }
                        if (var58.method3575() == null) {
                            field420[Statics.field1079][var55][var56] = null;
                        }
                        method3117(var55, var56);
                    }
                }
            } else if (field489 == 215) {
                int var60 = field473.method2412();
                int var61 = var60 >> 2;
                int var62 = var60 & 0x3;
                int var63 = field398[var61];
                int var64 = field473.method2380();
                int var65 = field473.method2412();
                int var66 = (var65 >> 4 & 0x7) + Statics.field67;
                int var67 = (var65 & 0x7) + Statics.field125;
                if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104) {
                    method3302(Statics.field1079, var66, var67, var63, var64, var61, var62, 0, -1);
                }
            } else if (field489 == 112) {
                int var68 = field473.method2412();
                int var69 = (var68 >> 4 & 0x7) + Statics.field67;
                int var70 = (var68 & 0x7) + Statics.field125;
                int var71 = field473.method2347();
                int var72 = field473.method2412();
                int var73 = field473.method2347();
                if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
                    int var74 = var69 * 128 + 64;
                    int var75 = var70 * 128 + 64;
                    class30 var76 = new class30(var71, Statics.field1079, var74, var75, method53(var74, var75, Statics.field1079) - var72, var73, field304);
                    field430.method3570(var76);
                }
            } else if (field489 == 100) {
                int var77 = field473.method2523();
                int var78 = field473.method2347();
                int var79 = field473.method2373();
                int var80 = (var79 >> 4 & 0x7) + Statics.field67;
                int var81 = (var79 & 0x7) + Statics.field125;
                if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104) {
                    class29 var82 = new class29();
                    var82.field682 = var78;
                    var82.field678 = var77;
                    if (field420[Statics.field1079][var80][var81] == null) {
                        field420[Statics.field1079][var80][var81] = new class199();
                    }
                    field420[Statics.field1079][var80][var81].method3570(var82);
                    method3117(var80, var81);
                }
            } else if (field489 == 117) {
                int var83 = field473.method2523();
                int var84 = field473.method2373();
                int var85 = (var84 >> 4 & 0x7) + Statics.field67;
                int var86 = (var84 & 0x7) + Statics.field125;
                int var87 = field473.method2371();
                int var88 = var87 >> 2;
                int var89 = var87 & 0x3;
                int var90 = field398[var88];
                if (var85 >= 0 && var86 >= 0 && var85 < 103 && var86 < 103) {
                    if (var90 == 0) {
                        class87 var91 = Statics.field1397.method1951(Statics.field1079, var85, var86);
                        if (var91 != null) {
                            int var92 = var91.field1514 >> 14 & 0x7FFF;
                            if (var88 == 2) {
                                var91.field1517 = new class13(var92, 2, var89 + 4, Statics.field1079, var85, var86, var83, false, var91.field1517);
                                var91.field1518 = new class13(var92, 2, var89 + 1 & 0x3, Statics.field1079, var85, var86, var83, false, var91.field1518);
                            } else {
                                var91.field1517 = new class13(var92, var88, var89, Statics.field1079, var85, var86, var83, false, var91.field1517);
                            }
                        }
                    }
                    if (var90 == 1) {
                        class94 var93 = Statics.field1397.method1853(Statics.field1079, var85, var86);
                        if (var93 != null) {
                            int var94 = var93.field1599 >> 14 & 0x7FFF;
                            if (var88 == 4 || var88 == 5) {
                                var93.field1597 = new class13(var94, 4, var89, Statics.field1079, var85, var86, var83, false, var93.field1597);
                            } else if (var88 == 6) {
                                var93.field1597 = new class13(var94, 4, var89 + 4, Statics.field1079, var85, var86, var83, false, var93.field1597);
                            } else if (var88 == 7) {
                                var93.field1597 = new class13(var94, 4, (var89 + 2 & 0x3) + 4, Statics.field1079, var85, var86, var83, false, var93.field1597);
                            } else if (var88 == 8) {
                                var93.field1597 = new class13(var94, 4, var89 + 4, Statics.field1079, var85, var86, var83, false, var93.field1597);
                                var93.field1598 = new class13(var94, 4, (var89 + 2 & 0x3) + 4, Statics.field1079, var85, var86, var83, false, var93.field1598);
                            }
                        }
                    }
                    if (var90 == 2) {
                        class98 var95 = Statics.field1397.method1807(Statics.field1079, var85, var86);
                        if (var88 == 11) {
                            var88 = 10;
                        }
                        if (var95 != null) {
                            var95.field1655 = new class13(var95.field1654 >> 14 & 0x7FFF, var88, var89, Statics.field1079, var85, var86, var83, false, var95.field1655);
                        }
                    }
                    if (var90 == 3) {
                        class93 var96 = Statics.field1397.method1808(Statics.field1079, var85, var86);
                        if (var96 != null) {
                            var96.field1583 = new class13(var96.field1584 >> 14 & 0x7FFF, 22, var89, Statics.field1079, var85, var86, var83, false, var96.field1583);
                        }
                    }
                }
            } else if (field489 == 96) {
                int var97 = field473.method2412();
                int var98 = (var97 >> 4 & 0x7) + Statics.field67;
                int var99 = (var97 & 0x7) + Statics.field125;
                int var100 = var98 + field473.method2540();
                int var101 = var99 + field473.method2540();
                int var102 = field473.method2348();
                int var103 = field473.method2347();
                int var104 = field473.method2412() * 4;
                int var105 = field473.method2412() * 4;
                int var106 = field473.method2347();
                int var107 = field473.method2347();
                int var108 = field473.method2412();
                int var109 = field473.method2412();
                if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104 && var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104 && var103 != 65535) {
                    int var110 = var98 * 128 + 64;
                    int var111 = var99 * 128 + 64;
                    int var112 = var100 * 128 + 64;
                    int var113 = var101 * 128 + 64;
                    class7 var114 = new class7(var103, Statics.field1079, var110, var111, method53(var110, var111, Statics.field1079) - var104, field304 + var106, field304 + var107, var108, var109, var102, var105);
                    var114.method104(var112, var113, method53(var112, var113, Statics.field1079) - var105, field304 + var106);
                    field386.method3570(var114);
                }
            }
        }
    }

    @ObfuscatedName("fs.by(IIIIIIIIIB)V")
    public static final void method3302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field428.method3575(); var10 != null; var10 = (class17) field428.method3576()) {
            if (var10.field237 == arg0 && var10.field230 == arg1 && var10.field245 == arg2 && var10.field228 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field237 = arg0;
            var9.field228 = arg3;
            var9.field230 = arg1;
            var9.field245 = arg2;
            method198(var9);
            field428.method3570(var9);
        }
        var9.field235 = arg4;
        var9.field243 = arg5;
        var9.field236 = arg6;
        var9.field238 = arg7;
        var9.field239 = arg8;
    }

    @ObfuscatedName("h.bu(B)V")
    public static final void method165() {
        for (class17 var0 = (class17) field428.method3575(); var0 != null; var0 = (class17) field428.method3576()) {
            if (var0.field239 == -1) {
                var0.field238 = 0;
                method198(var0);
            } else {
                var0.method3661();
            }
        }
    }

    @ObfuscatedName("b.bo(Lt;B)V")
    public static final void method198(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field228 == 0) {
            var1 = Statics.field1397.method1809(arg0.field237, arg0.field230, arg0.field245);
        }
        if (arg0.field228 == 1) {
            var1 = Statics.field1397.method1810(arg0.field237, arg0.field230, arg0.field245);
        }
        if (arg0.field228 == 2) {
            var1 = Statics.field1397.method1811(arg0.field237, arg0.field230, arg0.field245);
        }
        if (arg0.field228 == 3) {
            var1 = Statics.field1397.method1812(arg0.field237, arg0.field230, arg0.field245);
        }
        if (var1 != 0) {
            int var5 = Statics.field1397.method1948(arg0.field237, arg0.field230, arg0.field245, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field229 = var2;
        arg0.field234 = var3;
        arg0.field233 = var4;
    }

    @ObfuscatedName("s.bs(IIIIIIII)V")
    public static final void method48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field298 && Statics.field1079 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1397.method1809(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1397.method1810(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1397.method1811(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1397.method1812(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1397.method1948(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1397.method1800(arg0, arg2, arg3);
                class41 var15 = class41.method2944(var12);
                if (var15.field926 != 0) {
                    field360[arg0].method2236(arg2, arg3, var13, var14, var15.field942);
                }
            }
            if (arg1 == 1) {
                Statics.field1397.method1801(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1397.method1802(arg0, arg2, arg3);
                class41 var16 = class41.method2944(var12);
                if (var16.field939 + arg2 > 103 || var16.field939 + arg3 > 103 || var16.field940 + arg2 > 103 || var16.field940 + arg3 > 103) {
                    return;
                }
                if (var16.field926 != 0) {
                    field360[arg0].method2249(arg2, arg3, var16.field939, var16.field940, var14, var16.field942);
                }
            }
            if (arg1 == 3) {
                Statics.field1397.method1803(arg0, arg2, arg3);
                class41 var17 = class41.method2944(var12);
                if (var17.field926 == 1) {
                    field360[arg0].method2244(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field91[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        Statics.method189(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field1397, field360[arg0]);
    }

    @ObfuscatedName("fz.bl(IIB)V")
    public static final void method3117(int arg0, int arg1) {
        class199 var2 = field420[Statics.field1079][arg0][arg1];
        if (var2 == null) {
            Statics.field1397.method1804(Statics.field1079, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3575(); var6 != null; var6 = (class29) var2.method3576()) {
            class52 var7 = class52.method1531(var6.field682);
            long var8 = (long) var7.field1144;
            if (var7.field1127 == 1) {
                var8 = (long) (var6.field678 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1397.method1804(Statics.field1079, arg0, arg1);
            return;
        }
        var2.method3571(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3575(); var12 != null; var12 = (class29) var2.method3576()) {
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
        Statics.field1397.method1947(Statics.field1079, arg0, arg1, method53(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1079), var5, var13, var10, var11);
    }

    @ObfuscatedName("ar.bn(ZI)V")
    public static final void method778(boolean arg0) {
        field578 = 0;
        field331 = 0;
        field473.method2587();
        int var1 = field473.method2583(8);
        if (var1 < field332) {
            for (int var2 = var1; var2 < field332; var2++) {
                field411[++field578 - 1] = field565[var2];
            }
        }
        if (var1 > field332) {
            throw new RuntimeException("");
        }
        field332 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field565[var3];
            class35 var5 = field359[var4];
            int var6 = field473.method2583(1);
            if (var6 == 0) {
                field565[++field332 - 1] = var4;
                var5.field852 = field304;
            } else {
                int var7 = field473.method2583(2);
                if (var7 == 0) {
                    field565[++field332 - 1] = var4;
                    var5.field852 = field304;
                    field335[++field331 - 1] = var4;
                } else if (var7 == 1) {
                    field565[++field332 - 1] = var4;
                    var5.field852 = field304;
                    int var8 = field473.method2583(3);
                    var5.method703(var8, (byte) 1);
                    int var9 = field473.method2583(1);
                    if (var9 == 1) {
                        field335[++field331 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field565[++field332 - 1] = var4;
                    var5.field852 = field304;
                    int var10 = field473.method2583(3);
                    var5.method703(var10, (byte) 2);
                    int var11 = field473.method2583(3);
                    var5.method703(var11, (byte) 2);
                    int var12 = field473.method2583(1);
                    if (var12 == 1) {
                        field335[++field331 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field411[++field578 - 1] = var4;
                }
            }
        }
        while (field473.method2589(field570) >= 27) {
            int var13 = field473.method2583(15);
            if (var13 == 32767) {
                break;
            }
            boolean var17 = false;
            if (field359[var13] == null) {
                field359[var13] = new class35();
                var17 = true;
            }
            class35 var18 = field359[var13];
            field565[++field332 - 1] = var13;
            var18.field852 = field304;
            int var19 = field473.method2583(1);
            int var20 = field435[field473.method2583(3)];
            if (var17) {
                var18.field863 = var18.field815 = var20;
            }
            int var21;
            if (arg0) {
                var21 = field473.method2583(8);
                if (var21 > 127) {
                    var21 -= 256;
                }
            } else {
                var21 = field473.method2583(5);
                if (var21 > 15) {
                    var21 -= 32;
                }
            }
            int var22;
            if (arg0) {
                var22 = field473.method2583(8);
                if (var22 > 127) {
                    var22 -= 256;
                }
            } else {
                var22 = field473.method2583(5);
                if (var22 > 15) {
                    var22 -= 32;
                }
            }
            int var23 = field473.method2583(1);
            if (var23 == 1) {
                field335[++field331 - 1] = var13;
            }
            var18.field786 = class40.method586(field473.method2583(14));
            var18.field817 = var18.field786.field882;
            var18.field865 = var18.field786.field911;
            if (var18.field865 == 0) {
                var18.field815 = 0;
            }
            var18.field821 = var18.field786.field894;
            var18.field822 = var18.field786.field895;
            var18.field861 = var18.field786.field905;
            var18.field824 = var18.field786.field915;
            var18.field818 = var18.field786.field891;
            var18.field831 = var18.field786.field892;
            var18.field820 = var18.field786.field893;
            var18.method702(Statics.field2254.field867[0] + var22, Statics.field2254.field868[0] + var21, var19 == 1);
        }
        field473.method2588();
        method2894();
        for (int var14 = 0; var14 < field578; var14++) {
            int var15 = field411[var14];
            if (field304 != field359[var15].field852) {
                field359[var15].field786 = null;
                field359[var15] = null;
            }
        }
        if (field570 != field473.field1980) {
            throw new RuntimeException(field473.field1980 + class2.field15 + field570);
        }
        for (int var16 = 0; var16 < field332; var16++) {
            if (field359[field565[var16]] == null) {
                throw new RuntimeException(var16 + class2.field15 + field332);
            }
        }
    }

    @ObfuscatedName("el.bz(B)V")
    public static final void method2894() {
        for (int var0 = 0; var0 < field331; var0++) {
            int var1 = field335[var0];
            class35 var2 = field359[var1];
            int var3 = field473.method2412();
            if ((var3 & 0x2) != 0) {
                int var4 = field473.method2475();
                int var5 = field473.method2412();
                var2.method733(var4, var5, field304);
                var2.field839 = field304 + 300;
                var2.field836 = field473.method2379();
                var2.field837 = field473.method2379();
            }
            if ((var3 & 0x40) != 0) {
                int var6 = field473.method2412();
                int var7 = field473.method2475();
                var2.method733(var6, var7, field304);
                var2.field839 = field304 + 300;
                var2.field836 = field473.method2347();
                var2.field837 = field473.method2379();
            }
            if ((var3 & 0x80) != 0) {
                var2.field826 = field473.method2353();
                var2.field856 = 100;
            }
            if ((var3 & 0x20) != 0) {
                var2.field860 = field473.method2380();
                int var8 = field473.method2350();
                var2.field853 = var8 >> 16;
                var2.field869 = (var8 & 0xFFFF) + field304;
                var2.field850 = 0;
                var2.field851 = 0;
                if (var2.field869 > field304) {
                    var2.field850 = -1;
                }
                if (var2.field860 == 65535) {
                    var2.field860 = -1;
                }
            }
            if ((var3 & 0x8) != 0) {
                int var9 = field473.method2523();
                int var10 = field473.method2347();
                int var11 = var2.field871 - (var9 - Statics.field2215 - Statics.field2215) * 64;
                int var12 = var2.field814 - (var10 - Statics.field258 - Statics.field258) * 64;
                if (var11 != 0 || var12 != 0) {
                    var2.field840 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x1) != 0) {
                int var13 = field473.method2523();
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = field473.method2373();
                if (var2.field870 == var13 && var13 != -1) {
                    int var15 = class43.method2701(var13).field1002;
                    if (var15 == 1) {
                        var2.field845 = 0;
                        var2.field857 = 0;
                        var2.field847 = var14;
                        var2.field848 = 0;
                    }
                    if (var15 == 2) {
                        var2.field848 = 0;
                    }
                } else if (var13 == -1 || var2.field870 == -1 || class43.method2701(var13).field984 >= class43.method2701(var2.field870).field984) {
                    var2.field870 = var13;
                    var2.field845 = 0;
                    var2.field857 = 0;
                    var2.field847 = var14;
                    var2.field848 = 0;
                    var2.field862 = var2.field866;
                }
            }
            if ((var3 & 0x4) != 0) {
                var2.field838 = field473.method2347();
                if (var2.field838 == 65535) {
                    var2.field838 = -1;
                }
            }
            if ((var3 & 0x10) != 0) {
                var2.field786 = class40.method586(field473.method2379());
                var2.field817 = var2.field786.field882;
                var2.field865 = var2.field786.field911;
                var2.field821 = var2.field786.field894;
                var2.field822 = var2.field786.field895;
                var2.field861 = var2.field786.field905;
                var2.field824 = var2.field786.field915;
                var2.field818 = var2.field786.field891;
                var2.field831 = var2.field786.field892;
                var2.field820 = var2.field786.field893;
            }
        }
    }

    @ObfuscatedName("dj.bb(III)Ldd;")
    public static class107 method2663(int arg0, int arg1) {
        field292.field1872 = arg0;
        field292.field1865 = arg1;
        field292.field1867 = 1;
        field292.field1868 = 1;
        return field292;
    }

    @ObfuscatedName("z.be(III)V")
    public static final void method178(int arg0, int arg1) {
        if (field436 < 2 && field447 == 0 && !field449) {
            return;
        }
        String var2;
        if (field447 == 1 && field436 < 2) {
            var2 = class157.field2446 + class157.field2451 + field448 + " " + class2.field24;
        } else if (field449 && field436 < 2) {
            var2 = field452 + class157.field2451 + field453 + " " + class2.field24;
        } else {
            int var3 = field436 - 1;
            String var4;
            if (field446[var3].length() > 0) {
                var4 = field441[var3] + class157.field2451 + field446[var3];
            } else {
                var4 = field441[var3];
            }
            var2 = var4;
        }
        if (field436 > 2) {
            var2 = var2 + class2.method1065(16777215) + " " + '/' + " " + (field436 - 2) + class157.field2445;
        }
        Statics.field877.method3779(var2, arg0 + 4, arg1 + 15, 16777215, 0, field304 / 1000);
    }

    @ObfuscatedName("c.bg(IIIIB)V")
    public static final void method203(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field498; var4++) {
            if (field505[var4] + field503[var4] > arg0 && field503[var4] < arg0 + arg2 && field516[var4] + field506[var4] > arg1 && field516[var4] < arg1 + arg3) {
                field500[var4] = true;
            }
        }
    }

    @ObfuscatedName("a.bc(IIIII)V")
    public static final void method5(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field498; var4++) {
            if (field505[var4] + field503[var4] > arg0 && field503[var4] < arg0 + arg2 && field516[var4] + field506[var4] > arg1 && field516[var4] < arg1 + arg3) {
                field501[var4] = true;
            }
        }
    }

    @ObfuscatedName("ct.bw(III)V")
    public static final void method1776(int arg0, int arg1) {
        int var2 = Statics.field877.method3767(class157.field2444);
        for (int var3 = 0; var3 < field436; var3++) {
            class224 var4 = Statics.field877;
            String var5;
            if (field446[var3].length() > 0) {
                var5 = field441[var3] + class157.field2451 + field446[var3];
            } else {
                var5 = field441[var3];
            }
            int var6 = var4.method3767(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field436 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field108) {
            var8 = Statics.field108 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field750) {
            var9 = Statics.field750 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field471 = true;
        Statics.field193 = var8;
        Statics.field710 = var9;
        Statics.field2926 = var2;
        Statics.field1988 = field436 * 15 + 22;
    }

    @ObfuscatedName("aq.bf(II)Z")
    public static final boolean method951(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field303[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("h.bx(Lak;III)V")
    public static final void method162(class31 arg0, int arg1, int arg2) {
        method142(arg0.field704, arg0.field705, arg0.field706, arg0.field707, arg0.field708, arg0.field708, arg1, arg2);
    }

    @ObfuscatedName("l.bi(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method142(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 58) {
            class173 var8 = class173.method176(arg1, arg0);
            if (var8 != null) {
                field302.method2586(254);
                field302.method2378(field383);
                field302.method2378(var8.field2835);
                field302.method2506(arg1);
                field302.method2385(Statics.field136);
                field302.method2378(field451);
                field302.method2331(arg0);
            }
        }
        if (arg2 == 45) {
            class3 var9 = field416[arg3];
            if (var9 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field356 = 0;
                field529 = arg0;
                field530 = arg1;
                field302.method2586(21);
                field302.method2481(class137.field2088[82] ? 1 : 0);
                field302.method2499(arg3);
            }
        }
        if (arg2 == 16) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field356 = 0;
            field529 = arg0;
            field530 = arg1;
            field302.method2586(0);
            field302.method2377(arg3);
            field302.method2331(Statics.field684);
            field302.method2499(Statics.field2215 + arg0);
            field302.method2368(class137.field2088[82] ? 1 : 0);
            field302.method2496(Statics.field1537);
            field302.method2331(Statics.field2265);
            field302.method2331(Statics.field258 + arg1);
        }
        if (arg2 == 21) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field356 = 0;
            field529 = arg0;
            field530 = arg1;
            field302.method2586(116);
            field302.method2331(Statics.field258 + arg1);
            field302.method2481(class137.field2088[82] ? 1 : 0);
            field302.method2378(arg3);
            field302.method2331(Statics.field2215 + arg0);
        }
        if (arg2 == 9) {
            class35 var10 = field359[arg3];
            if (var10 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field356 = 0;
                field529 = arg0;
                field530 = arg1;
                field302.method2586(63);
                field302.method2368(class137.field2088[82] ? 1 : 0);
                field302.method2331(arg3);
            }
        }
        if (arg2 == 20) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field356 = 0;
            field529 = arg0;
            field530 = arg1;
            field302.method2586(158);
            field302.method2499(Statics.field2215 + arg0);
            field302.method2499(Statics.field258 + arg1);
            field302.method2330(class137.field2088[82] ? 1 : 0);
            field302.method2499(arg3);
        }
        if (arg2 == 5) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field356 = 0;
            field529 = arg0;
            field530 = arg1;
            field302.method2586(188);
            field302.method2369(class137.field2088[82] ? 1 : 0);
            field302.method2499(arg3 >> 14 & 0x7FFF);
            field302.method2377(Statics.field2215 + arg0);
            field302.method2331(Statics.field258 + arg1);
        }
        if (arg2 == 34) {
            field302.method2586(144);
            field302.method2331(arg0);
            field302.method2485(arg1);
            field302.method2499(arg3);
            field407 = 0;
            Statics.field680 = class173.method2041(arg1);
            field351 = arg0;
        }
        if (arg2 == 40) {
            field302.method2586(195);
            field302.method2331(arg3);
            field302.method2506(arg1);
            field302.method2331(arg0);
            field407 = 0;
            Statics.field680 = class173.method2041(arg1);
            field351 = arg0;
        }
        if (arg2 == 24) {
            class173 var11 = class173.method2041(arg1);
            boolean var12 = true;
            if (var11.field2748 > 0) {
                var12 = method205(var11);
            }
            if (var12) {
                field302.method2586(230);
                field302.method2496(arg1);
            }
        }
        if (arg2 == 43) {
            field302.method2586(245);
            field302.method2331(arg0);
            field302.method2377(arg3);
            field302.method2496(arg1);
            field407 = 0;
            Statics.field680 = class173.method2041(arg1);
            field351 = arg0;
        }
        if (arg2 == 48) {
            class3 var13 = field416[arg3];
            if (var13 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field356 = 0;
                field529 = arg0;
                field530 = arg1;
                field302.method2586(75);
                field302.method2331(arg3);
                field302.method2481(class137.field2088[82] ? 1 : 0);
            }
        }
        if (arg2 == 1004) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field356 = 0;
            field302.method2586(210);
            field302.method2378(arg3);
        }
        if (arg2 == 10) {
            class35 var14 = field359[arg3];
            if (var14 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field356 = 0;
                field529 = arg0;
                field530 = arg1;
                field302.method2586(207);
                field302.method2377(arg3);
                field302.method2368(class137.field2088[82] ? 1 : 0);
            }
        }
        if (arg2 == 1005) {
            class173 var15 = class173.method2041(arg1);
            if (var15 == null || var15.field2861[arg0] < 100000) {
                field302.method2586(210);
                field302.method2378(arg3);
            } else {
                class12.method2769(27, "", var15.field2861[arg0] + " x " + class52.method1531(arg3).field1116);
            }
            field407 = 0;
            Statics.field680 = class173.method2041(arg1);
            field351 = arg0;
        }
        if (arg2 == 39) {
            field302.method2586(154);
            field302.method2377(arg0);
            field302.method2506(arg1);
            field302.method2331(arg3);
            field407 = 0;
            Statics.field680 = class173.method2041(arg1);
            field351 = arg0;
        }
        if (arg2 == 7) {
            class35 var16 = field359[arg3];
            if (var16 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field356 = 0;
                field529 = arg0;
                field530 = arg1;
                field302.method2586(73);
                field302.method2378(arg3);
                field302.method2499(Statics.field2265);
                field302.method2378(Statics.field684);
                field302.method2506(Statics.field1537);
                field302.method2368(class137.field2088[82] ? 1 : 0);
            }
        }
        if (arg2 == 1002) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field356 = 0;
            field302.method2586(83);
            field302.method2378(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class173 var17 = class173.method176(arg1, arg0);
            if (var17 != null) {
                Statics.method841(arg3, arg1, arg0, var17.field2835, arg5);
            }
        }
        if (arg2 == 1003) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field356 = 0;
            class35 var18 = field359[arg3];
            if (var18 != null) {
                class40 var19 = var18.field786;
                if (var19.field910 != null) {
                    var19 = var19.method749();
                }
                if (var19 != null) {
                    field302.method2586(127);
                    field302.method2377(var19.field912);
                }
            }
        }
        if (arg2 == 1001) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field356 = 0;
            field529 = arg0;
            field530 = arg1;
            field302.method2586(19);
            field302.method2499(Statics.field2215 + arg0);
            field302.method2331(arg3 >> 14 & 0x7FFF);
            field302.method2378(Statics.field258 + arg1);
            field302.method2368(class137.field2088[82] ? 1 : 0);
        }
        if (arg2 == 25) {
            class173 var20 = class173.method176(arg1, arg0);
            if (var20 != null) {
                method2147();
                int var21 = method2141(var20);
                int var22 = var21 >> 11 & 0x3F;
                int var24 = var20.field2835;
                class173 var25 = class173.method176(arg1, arg0);
                if (var25 != null && var25.field2833 != null) {
                    class1 var26 = new class1();
                    var26.field7 = var25;
                    var26.field9 = var25.field2833;
                    class37.method2928(var26);
                }
                field451 = var24;
                field449 = true;
                Statics.field136 = arg1;
                field383 = arg0;
                Statics.field219 = var22;
                method723(var25);
                field447 = 0;
                field452 = Statics.method111(var20);
                if (field452 == null) {
                    field452 = "Null";
                }
                if (var20.field2743) {
                    field453 = var20.field2815 + class2.method1065(16777215);
                } else {
                    field453 = class2.method1065(65280) + var20.field2858 + class2.method1065(16777215);
                }
            }
            return;
        }
        if (arg2 == 4) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field356 = 0;
            field529 = arg0;
            field530 = arg1;
            field302.method2586(179);
            field302.method2377(Statics.field258 + arg1);
            field302.method2378(arg3 >> 14 & 0x7FFF);
            field302.method2369(class137.field2088[82] ? 1 : 0);
            field302.method2331(Statics.field2215 + arg0);
        }
        if (arg2 == 51) {
            class3 var27 = field416[arg3];
            if (var27 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field356 = 0;
                field529 = arg0;
                field530 = arg1;
                field302.method2586(28);
                field302.method2331(arg3);
                field302.method2330(class137.field2088[82] ? 1 : 0);
            }
        }
        if (arg2 == 29) {
            field302.method2586(230);
            field302.method2496(arg1);
            class173 var28 = class173.method2041(arg1);
            if (var28.field2854 != null && var28.field2854[0][0] == 5) {
                int var29 = var28.field2854[0][1];
                if (class176.field2891[var29] != var28.field2856[0]) {
                    class176.field2891[var29] = var28.field2856[0];
                    Statics.method934(var29);
                }
            }
        }
        if (arg2 == 1) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field356 = 0;
            field529 = arg0;
            field530 = arg1;
            field302.method2586(41);
            field302.method2368(class137.field2088[82] ? 1 : 0);
            field302.method2499(Statics.field684);
            field302.method2499(Statics.field2215 + arg0);
            field302.method2499(arg3 >> 14 & 0x7FFF);
            field302.method2377(Statics.field2265);
            field302.method2485(Statics.field1537);
            field302.method2378(Statics.field258 + arg1);
        }
        if (arg2 == 38) {
            method2147();
            class173 var30 = class173.method2041(arg1);
            field447 = 1;
            Statics.field2265 = arg0;
            Statics.field1537 = arg1;
            Statics.field684 = arg3;
            method723(var30);
            field448 = class2.method1065(16748608) + class52.method1531(arg3).field1116 + class2.method1065(16777215);
            if (field448 == null) {
                field448 = "null";
            }
            return;
        }
        if (arg2 == 37) {
            field302.method2586(222);
            field302.method2378(arg3);
            field302.method2499(arg0);
            field302.method2496(arg1);
            field407 = 0;
            Statics.field680 = class173.method2041(arg1);
            field351 = arg0;
        }
        if (arg2 == 50) {
            class3 var31 = field416[arg3];
            if (var31 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field356 = 0;
                field529 = arg0;
                field530 = arg1;
                field302.method2586(40);
                field302.method2499(arg3);
                field302.method2330(class137.field2088[82] ? 1 : 0);
            }
        }
        if (arg2 == 19) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field356 = 0;
            field529 = arg0;
            field530 = arg1;
            field302.method2586(109);
            field302.method2330(class137.field2088[82] ? 1 : 0);
            field302.method2499(arg3);
            field302.method2378(Statics.field2215 + arg0);
            field302.method2331(Statics.field258 + arg1);
        }
        if (arg2 == 46) {
            class3 var32 = field416[arg3];
            if (var32 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field356 = 0;
                field529 = arg0;
                field530 = arg1;
                field302.method2586(141);
                field302.method2378(arg3);
                field302.method2330(class137.field2088[82] ? 1 : 0);
            }
        }
        if (arg2 == 23) {
            Statics.field1397.method1820(Statics.field1079, arg0, arg1);
        }
        if (arg2 == 8) {
            class35 var33 = field359[arg3];
            if (var33 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field356 = 0;
                field529 = arg0;
                field530 = arg1;
                field302.method2586(12);
                field302.method2496(Statics.field136);
                field302.method2331(arg3);
                field302.method2481(class137.field2088[82] ? 1 : 0);
                field302.method2331(field383);
            }
        }
        if (arg2 == 32) {
            field302.method2586(226);
            field302.method2499(arg0);
            field302.method2506(Statics.field136);
            field302.method2331(arg3);
            field302.method2331(field383);
            field302.method2385(arg1);
            field407 = 0;
            Statics.field680 = class173.method2041(arg1);
            field351 = arg0;
        }
        if (arg2 == 28) {
            field302.method2586(230);
            field302.method2496(arg1);
            class173 var34 = class173.method2041(arg1);
            if (var34.field2854 != null && var34.field2854[0][0] == 5) {
                int var35 = var34.field2854[0][1];
                class176.field2891[var35] = 1 - class176.field2891[var35];
                Statics.method934(var35);
            }
        }
        if (arg2 == 41) {
            field302.method2586(4);
            field302.method2499(arg0);
            field302.method2377(arg3);
            field302.method2485(arg1);
            field407 = 0;
            Statics.field680 = class173.method2041(arg1);
            field351 = arg0;
        }
        if (arg2 == 11) {
            class35 var36 = field359[arg3];
            if (var36 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field356 = 0;
                field529 = arg0;
                field530 = arg1;
                field302.method2586(86);
                field302.method2330(class137.field2088[82] ? 1 : 0);
                field302.method2378(arg3);
            }
        }
        if (arg2 == 18) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field356 = 0;
            field529 = arg0;
            field530 = arg1;
            field302.method2586(136);
            field302.method2499(Statics.field258 + arg1);
            field302.method2377(Statics.field2215 + arg0);
            field302.method2481(class137.field2088[82] ? 1 : 0);
            field302.method2377(arg3);
        }
        if (arg2 == 15) {
            class3 var37 = field416[arg3];
            if (var37 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field356 = 0;
                field529 = arg0;
                field530 = arg1;
                field302.method2586(88);
                field302.method2330(class137.field2088[82] ? 1 : 0);
                field302.method2378(arg3);
                field302.method2331(field383);
                field302.method2496(Statics.field136);
            }
        }
        if (arg2 == 22) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field356 = 0;
            field529 = arg0;
            field530 = arg1;
            field302.method2586(209);
            field302.method2499(Statics.field258 + arg1);
            field302.method2378(Statics.field2215 + arg0);
            field302.method2331(arg3);
            field302.method2369(class137.field2088[82] ? 1 : 0);
        }
        if (arg2 == 42) {
            field302.method2586(199);
            field302.method2499(arg3);
            field302.method2485(arg1);
            field302.method2499(arg0);
            field407 = 0;
            Statics.field680 = class173.method2041(arg1);
            field351 = arg0;
        }
        if (arg2 == 35) {
            field302.method2586(202);
            field302.method2331(arg0);
            field302.method2496(arg1);
            field302.method2331(arg3);
            field407 = 0;
            Statics.field680 = class173.method2041(arg1);
            field351 = arg0;
        }
        if (arg2 == 14) {
            class3 var38 = field416[arg3];
            if (var38 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field356 = 0;
                field529 = arg0;
                field530 = arg1;
                field302.method2586(64);
                field302.method2331(Statics.field684);
                field302.method2331(Statics.field2265);
                field302.method2485(Statics.field1537);
                field302.method2377(arg3);
                field302.method2368(class137.field2088[82] ? 1 : 0);
            }
        }
        if (arg2 == 33) {
            field302.method2586(113);
            field302.method2499(arg0);
            field302.method2378(arg3);
            field302.method2506(arg1);
            field407 = 0;
            Statics.field680 = class173.method2041(arg1);
            field351 = arg0;
        }
        if (arg2 == 44) {
            class3 var39 = field416[arg3];
            if (var39 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field356 = 0;
                field529 = arg0;
                field530 = arg1;
                field302.method2586(165);
                field302.method2331(arg3);
                field302.method2369(class137.field2088[82] ? 1 : 0);
            }
        }
        if (arg2 == 12) {
            class35 var40 = field359[arg3];
            if (var40 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field356 = 0;
                field529 = arg0;
                field530 = arg1;
                field302.method2586(46);
                field302.method2331(arg3);
                field302.method2481(class137.field2088[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field302.method2586(201);
            field302.method2385(arg1);
            field302.method2499(arg3);
            field302.method2377(arg0);
            field407 = 0;
            Statics.field680 = class173.method2041(arg1);
            field351 = arg0;
        }
        if (arg2 == 6) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field356 = 0;
            field529 = arg0;
            field530 = arg1;
            field302.method2586(193);
            field302.method2378(arg3 >> 14 & 0x7FFF);
            field302.method2499(Statics.field2215 + arg0);
            field302.method2369(class137.field2088[82] ? 1 : 0);
            field302.method2331(Statics.field258 + arg1);
        }
        if (arg2 == 30 && field432 == null) {
            field302.method2586(159);
            field302.method2485(arg1);
            field302.method2378(arg0);
            field432 = class173.method176(arg1, arg0);
            method723(field432);
        }
        if (arg2 == 17) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field356 = 0;
            field529 = arg0;
            field530 = arg1;
            field302.method2586(96);
            field302.method2378(field383);
            field302.method2499(Statics.field2215 + arg0);
            field302.method2481(class137.field2088[82] ? 1 : 0);
            field302.method2496(Statics.field136);
            field302.method2378(arg3);
            field302.method2331(Statics.field258 + arg1);
        }
        if (arg2 == 47) {
            class3 var41 = field416[arg3];
            if (var41 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field356 = 0;
                field529 = arg0;
                field530 = arg1;
                field302.method2586(248);
                field302.method2481(class137.field2088[82] ? 1 : 0);
                field302.method2378(arg3);
            }
        }
        if (arg2 == 13) {
            class35 var42 = field359[arg3];
            if (var42 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field356 = 0;
                field529 = arg0;
                field530 = arg1;
                field302.method2586(169);
                field302.method2377(arg3);
                field302.method2369(class137.field2088[82] ? 1 : 0);
            }
        }
        if (arg2 == 31) {
            field302.method2586(77);
            field302.method2499(arg3);
            field302.method2378(Statics.field2265);
            field302.method2506(Statics.field1537);
            field302.method2378(arg0);
            field302.method2378(Statics.field684);
            field302.method2485(arg1);
            field407 = 0;
            Statics.field680 = class173.method2041(arg1);
            field351 = arg0;
        }
        if (arg2 == 3) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field356 = 0;
            field529 = arg0;
            field530 = arg1;
            field302.method2586(100);
            field302.method2499(Statics.field258 + arg1);
            field302.method2377(Statics.field2215 + arg0);
            field302.method2331(arg3 >> 14 & 0x7FFF);
            field302.method2330(class137.field2088[82] ? 1 : 0);
        }
        if (arg2 == 49) {
            class3 var43 = field416[arg3];
            if (var43 != null) {
                field403 = arg6;
                field404 = arg7;
                field406 = 2;
                field356 = 0;
                field529 = arg0;
                field530 = arg1;
                field302.method2586(234);
                field302.method2499(arg3);
                field302.method2368(class137.field2088[82] ? 1 : 0);
            }
        }
        if (arg2 == 2) {
            field403 = arg6;
            field404 = arg7;
            field406 = 2;
            field356 = 0;
            field529 = arg0;
            field530 = arg1;
            field302.method2586(224);
            field302.method2377(arg3 >> 14 & 0x7FFF);
            field302.method2378(Statics.field2215 + arg0);
            field302.method2485(Statics.field136);
            field302.method2481(class137.field2088[82] ? 1 : 0);
            field302.method2499(field383);
            field302.method2377(Statics.field258 + arg1);
        }
        if (arg2 == 26) {
            field302.method2586(138);
            for (class4 var44 = (class4) field455.method3551(); var44 != null; var44 = (class4) field455.method3542()) {
                if (var44.field63 == 0 || var44.field63 == 3) {
                    method2279(var44, true);
                }
            }
            if (field432 != null) {
                method723(field432);
                field432 = null;
            }
        }
        if (field447 != 0) {
            field447 = 0;
            method723(class173.method2041(Statics.field1537));
        }
        if (field449) {
            method2147();
        }
        if (Statics.field680 != null && field407 == 0) {
            method723(Statics.field680);
        }
    }

    @ObfuscatedName("af.bj(ILjava/lang/String;I)V")
    public static void method983(int arg0, String arg1) {
        int var2 = class33.field775;
        int[] var3 = class33.field760;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class3 var6 = field416[var3[var5]];
            if (var6 != null && Statics.field2254 != var6 && var6.field41 != null && var6.field41.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field302.method2586(165);
                    field302.method2331(var3[var5]);
                    field302.method2369(0);
                } else if (arg0 == 4) {
                    field302.method2586(248);
                    field302.method2481(0);
                    field302.method2378(var3[var5]);
                } else if (arg0 == 6) {
                    field302.method2586(234);
                    field302.method2499(var3[var5]);
                    field302.method2368(0);
                } else if (arg0 == 7) {
                    field302.method2586(40);
                    field302.method2499(var3[var5]);
                    field302.method2330(0);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class12.method2769(4, "", class157.field2350 + arg1);
        }
    }

    @ObfuscatedName("ce.ba(B)V")
    public static void method2147() {
        if (!field449) {
            return;
        }
        class173 var0 = class173.method176(Statics.field136, field383);
        if (var0 != null && var0.field2857 != null) {
            class1 var1 = new class1();
            var1.field7 = var0;
            var1.field9 = var0.field2857;
            class37.method2928(var1);
        }
        field449 = false;
        method723(var0);
    }

    @ObfuscatedName("hc.bm(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method3698(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field471 || field436 >= 500) {
            return;
        }
        field441[field436] = arg0;
        field446[field436] = arg1;
        field303[field436] = arg2;
        field440[field436] = arg3;
        field437[field436] = arg4;
        field438[field436] = arg5;
        field436++;
    }

    @ObfuscatedName("ff.ca(IIIII)V")
    public static final void method2963(int arg0, int arg1, int arg2, int arg3) {
        if (field447 == 0 && !field449) {
            method3698(class157.field2407, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class105.field1845; var6++) {
            int var7 = class105.field1797[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field1397.method1948(Statics.field1079, var8, var9, var7) >= 0) {
                    class41 var12 = class41.method2944(var11);
                    if (var12.field956 != null) {
                        var12 = var12.method823();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field447 == 1) {
                        method3698(class157.field2446, field448 + " " + class2.field24 + " " + class2.method1065(65535) + var12.field955, 1, var7, var8, var9);
                    } else if (!field449) {
                        String[] var13 = var12.field951;
                        if (field465) {
                            var13 = Statics.method546(var13);
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
                                    method3698(var13[var14], class2.method1065(65535) + var12.field955, var15, var7, var8, var9);
                                }
                            }
                        }
                        method3698(class157.field2572, class2.method1065(65535) + var12.field955, 1002, var12.field931 << 14, var8, var9);
                    } else if ((Statics.field219 & 0x4) == 4) {
                        method3698(field452, field453 + " " + class2.field24 + " " + class2.method1065(65535) + var12.field955, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class35 var16 = field359[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field786.field882 == 1 && (var16.field871 & 0x7F) == 64 && (var16.field814 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field332; var17++) {
                            class35 var18 = field359[field565[var17]];
                            if (var18 != null && var16 != var18 && var18.field786.field882 == 1 && var16.field871 == var18.field871 && var16.field814 == var18.field814) {
                                method902(var18.field786, field565[var17], var8, var9);
                            }
                        }
                        int var19 = class33.field775;
                        int[] var20 = class33.field760;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class3 var22 = field416[var20[var21]];
                            if (var22 != null && var16.field871 == var22.field871 && var16.field814 == var22.field814) {
                                method2929(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method902(var16.field786, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var23 = field416[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field871 & 0x7F) == 64 && (var23.field814 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field332; var24++) {
                            class35 var25 = field359[field565[var24]];
                            if (var25 != null && var25.field786.field882 == 1 && var23.field871 == var25.field871 && var23.field814 == var25.field814) {
                                method902(var25.field786, field565[var24], var8, var9);
                            }
                        }
                        int var26 = class33.field775;
                        int[] var27 = class33.field760;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class3 var29 = field416[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field871 == var29.field871 && var23.field814 == var29.field814) {
                                method2929(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field522 == var11) {
                        var4 = var7;
                    } else {
                        method2929(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class199 var30 = field420[Statics.field1079][var8][var9];
                    if (var30 != null) {
                        for (class29 var31 = (class29) var30.method3587(); var31 != null; var31 = (class29) var30.method3578()) {
                            class52 var32 = class52.method1531(var31.field682);
                            if (field447 == 1) {
                                method3698(class157.field2446, field448 + " " + class2.field24 + " " + class2.method1065(16748608) + var32.field1116, 16, var31.field682, var8, var9);
                            } else if (!field449) {
                                String[] var33 = var32.field1130;
                                if (field465) {
                                    var33 = Statics.method546(var33);
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
                                        method3698(var33[var34], class2.method1065(16748608) + var32.field1116, var35, var31.field682, var8, var9);
                                    } else if (var34 == 2) {
                                        method3698(class157.field2294, class2.method1065(16748608) + var32.field1116, 20, var31.field682, var8, var9);
                                    }
                                }
                                method3698(class157.field2572, class2.method1065(16748608) + var32.field1116, 1004, var31.field682, var8, var9);
                            } else if ((Statics.field219 & 0x1) == 1) {
                                method3698(field452, field453 + " " + class2.field24 + " " + class2.method1065(16748608) + var32.field1116, 17, var31.field682, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class3 var38 = field416[field522];
            method2929(var38, field522, var36, var37);
        }
    }

    @ObfuscatedName("av.cs(Lar;IIII)V")
    public static final void method902(class40 arg0, int arg1, int arg2, int arg3) {
        if (field436 >= 400) {
            return;
        }
        if (arg0.field910 != null) {
            arg0 = arg0.method749();
        }
        if (arg0 == null || !arg0.field890 || arg0.field921 && field462 != arg1) {
            return;
        }
        String var4 = arg0.field887;
        if (arg0.field919 != 0) {
            var4 = var4 + method2815(arg0.field919, Statics.field2254.field32) + " " + class2.field14 + class157.field2388 + arg0.field919 + class2.field18;
        }
        if (field447 == 1) {
            method3698(class157.field2446, field448 + " " + class2.field24 + " " + class2.method1065(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field449) {
            String[] var5 = arg0.field902;
            if (field465) {
                var5 = Statics.method546(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class157.field2443)) {
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
                        method3698(var5[var6], class2.method1065(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class157.field2443)) {
                        short var9 = 0;
                        if (field333 != class21.field590) {
                            if (field333 == class21.field581 || field333 == class21.field584 && arg0.field919 > Statics.field2254.field32) {
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
                            method3698(var5[var8], class2.method1065(16776960) + var4, var10, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method3698(class157.field2572, class2.method1065(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field219 & 0x2) == 2) {
            method3698(field452, field453 + " " + class2.field24 + " " + class2.method1065(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ed.cj(Lf;IIII)V")
    public static final void method2929(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2254 == arg0 || field436 >= 400) {
            return;
        }
        String var4;
        if (arg0.field33 == 0) {
            var4 = arg0.field31[0] + arg0.field41 + arg0.field31[1] + method2815(arg0.field32, Statics.field2254.field32) + " " + class2.field14 + class157.field2388 + arg0.field32 + class2.field18 + arg0.field31[2];
        } else {
            var4 = arg0.field31[0] + arg0.field41 + arg0.field31[1] + " " + class2.field14 + class157.field2448 + arg0.field33 + class2.field18 + arg0.field31[2];
        }
        if (field447 == 1) {
            method3698(class157.field2446, field448 + " " + class2.field24 + " " + class2.method1065(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field449) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field433[var5] != null) {
                    short var6 = 0;
                    if (field433[var5].equalsIgnoreCase(class157.field2443)) {
                        if (field320 == class21.field590) {
                            continue;
                        }
                        if (field320 == class21.field581 || field320 == class21.field584 && arg0.field32 > Statics.field2254.field32) {
                            var6 = 2000;
                        }
                        if (Statics.field2254.field46 != 0 && arg0.field46 != 0) {
                            if (Statics.field2254.field46 == arg0.field46) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field521[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field526[var5] + var6;
                    method3698(field433[var5], class2.method1065(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field219 & 0x8) == 8) {
            method3698(field452, field453 + " " + class2.field24 + " " + class2.method1065(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field436; var9++) {
            if (field303[var9] == 23) {
                field446[var9] = class2.method1065(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("ex.cc(IIB)Ljava/lang/String;")
    public static final String method2815(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method1065(16711680);
        } else if (var2 < -6) {
            return class2.method1065(16723968);
        } else if (var2 < -3) {
            return class2.method1065(16740352);
        } else if (var2 < 0) {
            return class2.method1065(16756736);
        } else if (var2 > 9) {
            return class2.method1065(65280);
        } else if (var2 > 6) {
            return class2.method1065(4259584);
        } else if (var2 > 3) {
            return class2.method1065(8453888);
        } else if (var2 > 0) {
            return class2.method1065(12648192);
        } else {
            return class2.method1065(16776960);
        }
    }

    @ObfuscatedName("ay.ci(IIIIIIIII)V")
    public static final void method993(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (Statics.method2150(arg0)) {
            Statics.field171 = null;
            method2927(Statics.field2851[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field171 != null) {
                method2927(Statics.field171, -1412584499, arg1, arg2, arg3, arg4, Statics.field201, Statics.field1216, arg7);
                Statics.field171 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field500[var8] = true;
            }
        } else {
            field500[arg7] = true;
        }
    }

    @ObfuscatedName("ed.ct([Lfa;IIIIIIIII)V")
    public static final void method2927(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1726(arg2, arg3, arg4, arg5);
        class91.method2014();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class173 var10 = arg0[var9];
            if (var10 != null && (var10.field2763 == arg1 || arg1 == -1412584499 && field467 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field503[field498] = var10.field2735 + arg6;
                    field516[field498] = var10.field2758 + arg7;
                    field505[field498] = var10.field2753;
                    field506[field498] = var10.field2760;
                    var11 = ++field498 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2873 = var11;
                var10.field2874 = field304;
                if (!var10.field2743 || !method2280(var10)) {
                    if (var10.field2748 > 0) {
                        int var12 = var10.field2748;
                        if (var12 == 324) {
                            if (field571 == -1) {
                                field571 = var10.field2777;
                                field572 = var10.field2778;
                            }
                            if (field379.field2905) {
                                var10.field2777 = field571;
                            } else {
                                var10.field2777 = field572;
                            }
                        } else if (var12 == 325) {
                            if (field571 == -1) {
                                field571 = var10.field2777;
                                field572 = var10.field2778;
                            }
                            if (field379.field2905) {
                                var10.field2777 = field572;
                            } else {
                                var10.field2777 = field571;
                            }
                        } else if (var12 == 327) {
                            var10.field2793 = 150;
                            var10.field2803 = (int) (Math.sin((double) field304 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2785 = 5;
                            var10.field2847 = 0;
                        } else if (var12 == 328) {
                            var10.field2793 = 150;
                            var10.field2803 = (int) (Math.sin((double) field304 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2785 = 5;
                            var10.field2847 = 1;
                        }
                    }
                    int var13 = var10.field2735 + arg6;
                    int var14 = var10.field2758 + arg7;
                    int var15 = var10.field2774;
                    if (field467 == var10) {
                        if (arg1 != -1412584499 && !var10.field2755) {
                            Statics.field171 = arg0;
                            Statics.field201 = arg6;
                            Statics.field1216 = arg7;
                            continue;
                        }
                        if (field566 && field499) {
                            int var16 = class140.field2141;
                            int var17 = class140.field2136;
                            int var18 = var16 - field469;
                            int var19 = var17 - field470;
                            if (var18 < field481) {
                                var18 = field481;
                            }
                            if (var10.field2753 + var18 > field481 + field567.field2753) {
                                var18 = field481 + field567.field2753 - var10.field2753;
                            }
                            if (var19 < field474) {
                                var19 = field474;
                            }
                            if (var10.field2760 + var19 > field474 + field567.field2760) {
                                var19 = field474 + field567.field2760 - var10.field2760;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2755) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2765 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2765 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2753 + var13;
                        int var27 = var10.field2760 + var14;
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
                        int var30 = var10.field2753 + var13;
                        int var31 = var10.field2760 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2743 || var20 < var22 && var21 < var23) {
                        if (var10.field2748 != 0) {
                            if (var10.field2748 == 1336) {
                                if (field310) {
                                    var14 += 15;
                                    Statics.field1349.method3773("Fps:" + field2179, var10.field2753 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field298) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field298) {
                                        var34 = 16711680;
                                    }
                                    Statics.field1349.method3773("Mem:" + var33 + "k", var10.field2753 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2748 == 1337) {
                                field443 = var13;
                                field444 = var14;
                                method1182(var13, var14, var10.field2753, var10.field2760);
                                field500[var10.field2873] = true;
                                class80.method1726(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2748 == 1338) {
                                method2061(var10, var13, var14, var11);
                                class80.method1726(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2748 == 1339) {
                                method2912(var10, var13, var14, var11);
                                class80.method1726(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2765 == 0) {
                            if (!var10.field2743 && method2280(var10) && Statics.field3040 != var10) {
                                continue;
                            }
                            if (!var10.field2743) {
                                if (var10.field2766 > var10.field2814 - var10.field2760) {
                                    var10.field2766 = var10.field2814 - var10.field2760;
                                }
                                if (var10.field2766 < 0) {
                                    var10.field2766 = 0;
                                }
                            }
                            method2927(arg0, var10.field2801, var20, var21, var22, var23, var13 - var10.field2804, var14 - var10.field2766, var11);
                            if (var10.field2866 != null) {
                                method2927(var10.field2866, var10.field2801, var20, var21, var22, var23, var13 - var10.field2804, var14 - var10.field2766, var11);
                            }
                            class4 var35 = (class4) field455.method3539((long) var10.field2801);
                            if (var35 != null) {
                                method993(var35.field57, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class80.method1726(arg2, arg3, arg4, arg5);
                            class91.method2014();
                        }
                        if (field509 || field502[var11] || field523 > 1) {
                            if (var10.field2765 == 0 && !var10.field2743 && var10.field2814 > var10.field2760) {
                                int var36 = var10.field2753 + var13;
                                int var37 = var10.field2766;
                                int var38 = var10.field2760;
                                int var39 = var10.field2814;
                                Statics.field3175[0].method1757(var36, var14);
                                Statics.field3175[1].method1757(var36, var14 + var38 - 16);
                                class80.method1704(var36, var14 + 16, 16, var38 - 32, field425);
                                int var40 = (var38 - 32) * var38 / var39;
                                if (var40 < 8) {
                                    var40 = 8;
                                }
                                int var41 = (var38 - 32 - var40) * var37 / (var39 - var38);
                                class80.method1704(var36, var14 + 16 + var41, 16, var40, field374);
                                class80.method1736(var36, var14 + 16 + var41, var40, field376);
                                class80.method1736(var36 + 1, var14 + 16 + var41, var40, field376);
                                class80.method1738(var36, var14 + 16 + var41, 16, field376);
                                class80.method1738(var36, var14 + 17 + var41, 16, field376);
                                class80.method1736(var36 + 15, var14 + 16 + var41, var40, field375);
                                class80.method1736(var36 + 14, var14 + 17 + var41, var40 - 1, field375);
                                class80.method1738(var36, var14 + 15 + var41 + var40, 16, field375);
                                class80.method1738(var36 + 1, var14 + 14 + var41 + var40, 15, field375);
                            }
                            if (var10.field2765 != 1) {
                                if (var10.field2765 == 2) {
                                    int var42 = 0;
                                    for (int var43 = 0; var43 < var10.field2756; var43++) {
                                        for (int var44 = 0; var44 < var10.field2784; var44++) {
                                            int var45 = (var10.field2808 + 32) * var44 + var13;
                                            int var46 = (var10.field2806 + 32) * var43 + var14;
                                            if (var42 < 20) {
                                                var45 += var10.field2810[var42];
                                                var46 += var10.field2811[var42];
                                            }
                                            if (var10.field2860[var42] > 0) {
                                                boolean var47 = false;
                                                boolean var48 = false;
                                                int var49 = var10.field2860[var42] - 1;
                                                if (var45 + 32 > arg2 && var45 < arg4 && var46 + 32 > arg3 && var46 < arg5 || Statics.field763 == var10 && field409 == var42) {
                                                    class79 var50;
                                                    if (field447 == 1 && Statics.field2265 == var42 && Statics.field1537 == var10.field2801) {
                                                        var50 = class52.method2996(var49, var10.field2861[var42], 2, 0, 2, false);
                                                    } else {
                                                        var50 = class52.method2996(var49, var10.field2861[var42], 1, 3153952, 2, false);
                                                    }
                                                    if (var50 == null) {
                                                        method723(var10);
                                                    } else if (Statics.field763 == var10 && field409 == var42) {
                                                        int var51 = class140.field2141 - field511;
                                                        int var52 = class140.field2136 - field494;
                                                        if (var51 < 5 && var51 > -5) {
                                                            var51 = 0;
                                                        }
                                                        if (var52 < 5 && var52 > -5) {
                                                            var52 = 0;
                                                        }
                                                        if (field414 < 5) {
                                                            var51 = 0;
                                                            var52 = 0;
                                                        }
                                                        var50.method1635(var45 + var51, var46 + var52, 128);
                                                        if (arg1 != -1) {
                                                            class173 var53 = arg0[arg1 & 0xFFFF];
                                                            if (var46 + var52 < class80.field1410 && var53.field2766 > 0) {
                                                                int var54 = field410 * (class80.field1410 - var46 - var52) / 3;
                                                                if (var54 > field410 * 10) {
                                                                    var54 = field410 * 10;
                                                                }
                                                                if (var54 > var53.field2766) {
                                                                    var54 = var53.field2766;
                                                                }
                                                                var53.field2766 -= var54;
                                                                field494 += var54;
                                                                method723(var53);
                                                            }
                                                            if (var46 + var52 + 32 > class80.field1414 && var53.field2766 < var53.field2814 - var53.field2760) {
                                                                int var55 = field410 * (var46 + var52 + 32 - class80.field1414) / 3;
                                                                if (var55 > field410 * 10) {
                                                                    var55 = field410 * 10;
                                                                }
                                                                if (var55 > var53.field2814 - var53.field2760 - var53.field2766) {
                                                                    var55 = var53.field2814 - var53.field2760 - var53.field2766;
                                                                }
                                                                var53.field2766 += var55;
                                                                field494 -= var55;
                                                                method723(var53);
                                                            }
                                                        }
                                                    } else if (Statics.field680 == var10 && field351 == var42) {
                                                        var50.method1635(var45, var46, 128);
                                                    } else {
                                                        var50.method1679(var45, var46);
                                                    }
                                                }
                                            } else if (var10.field2746 != null && var42 < 20) {
                                                class79 var56 = var10.method3177(var42);
                                                if (var56 != null) {
                                                    var56.method1679(var45, var46);
                                                } else if (class173.field2770) {
                                                    method723(var10);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                } else if (var10.field2765 == 3) {
                                    int var57;
                                    if (method2042(var10)) {
                                        var57 = var10.field2838;
                                        if (Statics.field3040 == var10 && var10.field2772 != 0) {
                                            var57 = var10.field2772;
                                        }
                                    } else {
                                        var57 = var10.field2769;
                                        if (Statics.field3040 == var10 && var10.field2771 != 0) {
                                            var57 = var10.field2771;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2773) {
                                            class80.method1704(var13, var14, var10.field2753, var10.field2760, var57);
                                        } else {
                                            class80.method1727(var13, var14, var10.field2753, var10.field2760, var57);
                                        }
                                    } else if (var10.field2773) {
                                        class80.method1703(var13, var14, var10.field2753, var10.field2760, var57, 256 - (var15 & 0xFF));
                                    } else {
                                        class80.method1707(var13, var14, var10.field2753, var10.field2760, var57, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2765 == 4) {
                                    class224 var58 = var10.method3208();
                                    if (var58 != null) {
                                        String var59 = var10.field2779;
                                        int var60;
                                        if (method2042(var10)) {
                                            var60 = var10.field2838;
                                            if (Statics.field3040 == var10 && var10.field2772 != 0) {
                                                var60 = var10.field2772;
                                            }
                                            if (var10.field2775.length() > 0) {
                                                var59 = var10.field2775;
                                            }
                                        } else {
                                            var60 = var10.field2769;
                                            if (Statics.field3040 == var10 && var10.field2771 != 0) {
                                                var60 = var10.field2771;
                                            }
                                        }
                                        if (var10.field2743 && var10.field2835 != -1) {
                                            class52 var61 = class52.method1531(var10.field2835);
                                            var59 = var61.field1116;
                                            if (var59 == null) {
                                                var59 = "null";
                                            }
                                            if ((var61.field1127 == 1 || var10.field2863 != 1) && var10.field2863 != -1) {
                                                var59 = class2.method1065(16748608) + var59 + class2.field25 + " " + 'x' + method1522(var10.field2863);
                                            }
                                        }
                                        if (field432 == var10) {
                                            class157 var10000 = (class157) null;
                                            var59 = class157.field2472;
                                            var60 = var10.field2769;
                                        }
                                        if (!var10.field2743) {
                                            var59 = method112(var59, var10);
                                        }
                                        var58.method3810(var59, var13, var14, var10.field2753, var10.field2760, var60, var10.field2786 ? 0 : -1, var10.field2820, var10.field2867, var10.field2742);
                                    } else if (class173.field2770) {
                                        method723(var10);
                                    }
                                } else if (var10.field2765 == 5) {
                                    if (var10.field2743) {
                                        class79 var63;
                                        if (var10.field2835 == -1) {
                                            var63 = var10.method3175(false);
                                        } else {
                                            var63 = class52.method2996(var10.field2835, var10.field2863, var10.field2781, var10.field2782, var10.field2840, false);
                                        }
                                        if (var63 != null) {
                                            int var64 = var63.field1403;
                                            int var65 = var63.field1404;
                                            if (var10.field2822) {
                                                class80.method1699(var13, var14, var10.field2753 + var13, var10.field2760 + var14);
                                                int var66 = (var10.field2753 + (var64 - 1)) / var64;
                                                int var67 = (var10.field2760 + (var65 - 1)) / var65;
                                                for (int var68 = 0; var68 < var66; var68++) {
                                                    for (int var69 = 0; var69 < var67; var69++) {
                                                        if (var10.field2780 != 0) {
                                                            var63.method1627(var64 / 2 + var64 * var68 + var13, var65 / 2 + var65 * var69 + var14, var10.field2780, 4096);
                                                        } else if (var15 == 0) {
                                                            var63.method1679(var64 * var68 + var13, var65 * var69 + var14);
                                                        } else {
                                                            var63.method1635(var64 * var68 + var13, var65 * var69 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1726(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var70 = var10.field2753 * 4096 / var64;
                                                if (var10.field2780 != 0) {
                                                    var63.method1627(var10.field2753 / 2 + var13, var10.field2760 / 2 + var14, var10.field2780, var70);
                                                } else if (var15 != 0) {
                                                    var63.method1622(var13, var14, var10.field2753, var10.field2760, 256 - (var15 & 0xFF));
                                                } else if (var10.field2753 == var64 && var10.field2760 == var65) {
                                                    var63.method1679(var13, var14);
                                                } else {
                                                    var63.method1661(var13, var14, var10.field2753, var10.field2760);
                                                }
                                            }
                                        } else if (class173.field2770) {
                                            method723(var10);
                                        }
                                    } else {
                                        class79 var62 = var10.method3175(method2042(var10));
                                        if (var62 != null) {
                                            var62.method1679(var13, var14);
                                        } else if (class173.field2770) {
                                            method723(var10);
                                        }
                                    }
                                } else if (var10.field2765 == 6) {
                                    boolean var71 = method2042(var10);
                                    int var72;
                                    if (var71) {
                                        var72 = var10.field2790;
                                    } else {
                                        var72 = var10.field2789;
                                    }
                                    class105 var73 = null;
                                    int var74 = 0;
                                    if (var10.field2835 != -1) {
                                        class52 var75 = class52.method1531(var10.field2835);
                                        if (var75 != null) {
                                            class52 var76 = var75.method1024(var10.field2863);
                                            var73 = var76.method1023(1);
                                            if (var73 == null) {
                                                method723(var10);
                                            } else {
                                                var73.method2152();
                                                var74 = var73.field1449 / 2;
                                            }
                                        }
                                    } else if (var10.field2785 == 5) {
                                        if (var10.field2847 == 0) {
                                            var73 = field379.method3257((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var73 = Statics.field2254.method27();
                                        }
                                    } else if (var72 == -1) {
                                        var73 = var10.method3178((class43) null, -1, var71, Statics.field2254.field44);
                                        if (var73 == null && class173.field2770) {
                                            method723(var10);
                                        }
                                    } else {
                                        class43 var77 = class43.method2701(var72);
                                        var73 = var10.method3178(var77, var10.field2809, var71, Statics.field2254.field44);
                                        if (var73 == null && class173.field2770) {
                                            method723(var10);
                                        }
                                    }
                                    class91.method1967(var10.field2753 / 2 + var13, var10.field2760 / 2 + var14);
                                    int var78 = var10.field2796 * class91.field1573[var10.field2793] >> 16;
                                    int var79 = var10.field2796 * class91.field1579[var10.field2793] >> 16;
                                    if (var73 != null) {
                                        if (var10.field2743) {
                                            var73.method2152();
                                            if (var10.field2818) {
                                                var73.method2169(0, var10.field2803, var10.field2795, var10.field2793, var10.field2791, var10.field2794 + var74 + var78, var10.field2794 + var79, var10.field2796);
                                            } else {
                                                var73.method2168(0, var10.field2803, var10.field2795, var10.field2793, var10.field2791, var10.field2794 + var74 + var78, var10.field2794 + var79);
                                            }
                                        } else {
                                            var73.method2168(0, var10.field2803, 0, var10.field2793, 0, var78, var79);
                                        }
                                    }
                                    class91.method1965();
                                } else {
                                    if (var10.field2765 == 7) {
                                        class224 var80 = var10.method3208();
                                        if (var80 == null) {
                                            if (class173.field2770) {
                                                method723(var10);
                                            }
                                            continue;
                                        }
                                        int var81 = 0;
                                        for (int var82 = 0; var82 < var10.field2756; var82++) {
                                            for (int var83 = 0; var83 < var10.field2784; var83++) {
                                                if (var10.field2860[var81] > 0) {
                                                    class52 var84 = class52.method1531(var10.field2860[var81] - 1);
                                                    String var85;
                                                    if (var84.field1127 != 1 && var10.field2861[var81] == 1) {
                                                        var85 = class2.method1065(16748608) + var84.field1116 + class2.field25;
                                                    } else {
                                                        var85 = class2.method1065(16748608) + var84.field1116 + class2.field25 + " " + 'x' + method1522(var10.field2861[var81]);
                                                    }
                                                    int var86 = (var10.field2808 + 115) * var83 + var13;
                                                    int var87 = (var10.field2806 + 12) * var82 + var14;
                                                    if (var10.field2820 == 0) {
                                                        var80.method3772(var85, var86, var87, var10.field2769, var10.field2786 ? 0 : -1);
                                                    } else if (var10.field2820 == 1) {
                                                        var80.method3774(var85, var10.field2753 / 2 + var86, var87, var10.field2769, var10.field2786 ? 0 : -1);
                                                    } else {
                                                        var80.method3773(var85, var10.field2753 + var86 - 1, var87, var10.field2769, var10.field2786 ? 0 : -1);
                                                    }
                                                }
                                                var81++;
                                            }
                                        }
                                    }
                                    if (var10.field2765 == 8 && Statics.field2633 == var10 && field495 == field396) {
                                        int var88 = 0;
                                        int var89 = 0;
                                        class224 var90 = Statics.field1349;
                                        String var91 = var10.field2779;
                                        String var92 = method112(var91, var10);
                                        while (var92.length() > 0) {
                                            int var93 = var92.indexOf(class2.field20);
                                            String var94;
                                            if (var93 == -1) {
                                                var94 = var92;
                                                var92 = "";
                                            } else {
                                                var94 = var92.substring(0, var93);
                                                var92 = var92.substring(var93 + 4);
                                            }
                                            int var95 = var90.method3767(var94);
                                            if (var95 > var88) {
                                                var88 = var95;
                                            }
                                            var89 += var90.field3194 + 1;
                                        }
                                        var88 += 6;
                                        var89 += 7;
                                        int var96 = var10.field2753 + var13 - 5 - var88;
                                        int var97 = var10.field2760 + var14 + 5;
                                        if (var96 < var13 + 5) {
                                            var96 = var13 + 5;
                                        }
                                        if (var88 + var96 > arg4) {
                                            var96 = arg4 - var88;
                                        }
                                        if (var89 + var97 > arg5) {
                                            var97 = arg5 - var89;
                                        }
                                        class80.method1704(var96, var97, var88, var89, 16777120);
                                        class80.method1727(var96, var97, var88, var89, 0);
                                        String var98 = var10.field2779;
                                        int var99 = var90.field3194 + var97 + 2;
                                        String var100 = method112(var98, var10);
                                        while (var100.length() > 0) {
                                            int var101 = var100.indexOf(class2.field20);
                                            String var102;
                                            if (var101 == -1) {
                                                var102 = var100;
                                                var100 = "";
                                            } else {
                                                var102 = var100.substring(0, var101);
                                                var100 = var100.substring(var101 + 4);
                                            }
                                            var90.method3772(var102, var96 + 3, var99, 0, -1);
                                            var99 += var90.field3194 + 1;
                                        }
                                    }
                                    if (var10.field2765 == 9) {
                                        if (var10.field2805 == 1) {
                                            int var103;
                                            int var104;
                                            int var105;
                                            int var106;
                                            if (var10.field2776) {
                                                var103 = var13;
                                                var104 = var10.field2760 + var14;
                                                var105 = var10.field2753 + var13;
                                                var106 = var14;
                                            } else {
                                                var103 = var13;
                                                var104 = var14;
                                                var105 = var10.field2753 + var13;
                                                var106 = var10.field2760 + var14;
                                            }
                                            class80.method1712(var103, var104, var105, var106, var10.field2769);
                                        } else {
                                            int var107 = var10.field2753 >= 0 ? var10.field2753 : -var10.field2753;
                                            int var108 = var10.field2760 >= 0 ? var10.field2760 : -var10.field2760;
                                            int var109 = var107;
                                            if (var107 < var108) {
                                                var109 = var108;
                                            }
                                            if (var109 != 0) {
                                                int var110 = (var10.field2753 << 16) / var109;
                                                int var111 = (var10.field2760 << 16) / var109;
                                                if (var111 <= var110) {
                                                    var110 = -var110;
                                                } else {
                                                    var111 = -var111;
                                                }
                                                int var112 = var10.field2805 * var111 >> 17;
                                                int var113 = var10.field2805 * var111 + 1 >> 17;
                                                int var114 = var10.field2805 * var110 >> 17;
                                                int var115 = var10.field2805 * var110 + 1 >> 17;
                                                int var116 = var13 + var112;
                                                int var117 = var13 - var113;
                                                int var118 = var10.field2753 + var13 - var113;
                                                int var119 = var10.field2753 + var13 + var112;
                                                int var120 = var14 + var114;
                                                int var121 = var14 - var115;
                                                int var122 = var10.field2760 + var14 - var115;
                                                int var123 = var10.field2760 + var14 + var114;
                                                class91.method1971(var116, var117, var118);
                                                class91.method1974(var120, var121, var122, var116, var117, var118, var10.field2769);
                                                class91.method1971(var116, var118, var119);
                                                class91.method1974(var120, var122, var123, var116, var118, var119, var10.field2769);
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

    @ObfuscatedName("m.cr(Ljava/lang/String;Lfa;I)Ljava/lang/String;")
    public static String method112(String arg0, class173 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method1961(arg1, var2 - 1);
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
                if (Statics.field1357 != null) {
                    int var9 = Statics.field1357.field2204;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field1357.field2207 != null) {
                        var8 = (String) Statics.field1357.field2207;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("ba.cz(IB)Ljava/lang/String;")
    public static final String method1522(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field15 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method1065(65408) + var1.substring(0, var1.length() - 8) + class157.field2452 + " " + class2.field14 + var1 + class2.field18 + class2.field25;
        } else if (var1.length() > 6) {
            return " " + class2.method1065(16777215) + var1.substring(0, var1.length() - 4) + class157.field2454 + " " + class2.field14 + var1 + class2.field18 + class2.field25;
        } else {
            return " " + class2.method1065(16776960) + var1 + class2.field25;
        }
    }

    @ObfuscatedName("cu.cl(Lfa;B)V")
    public static void method1960(class173 arg0) {
        class173 var1 = arg0.field2763 == -1 ? null : class173.method2041(arg0.field2763);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field108;
            var3 = Statics.field750;
        } else {
            var2 = var1.field2753;
            var3 = var1.field2760;
        }
        Statics.method49(arg0, var2, var3, false);
        method1005(arg0, var2, var3);
    }

    @ObfuscatedName("r.cv([Lfa;Lfa;ZI)V")
    public static void method15(class173[] arg0, class173 arg1, boolean arg2) {
        int var3 = arg1.field2767 == 0 ? arg1.field2753 : arg1.field2767;
        int var4 = arg1.field2814 == 0 ? arg1.field2760 : arg1.field2814;
        Statics.method12(arg0, arg1.field2801, var3, var4, arg2);
        if (arg1.field2866 != null) {
            Statics.method12(arg1.field2866, arg1.field2801, var3, var4, arg2);
        }
        class4 var5 = (class4) field455.method3539((long) arg1.field2801);
        if (var5 != null) {
            int var6 = var5.field57;
            if (Statics.method2150(var6)) {
                Statics.method12(Statics.field2851[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2748 == 1337) {
        }
    }

    @ObfuscatedName("au.cq(Lfa;III)V")
    public static void method1005(class173 arg0, int arg1, int arg2) {
        if (arg0.field2749 == 0) {
            arg0.field2735 = arg0.field2744;
        } else if (arg0.field2749 == 1) {
            arg0.field2735 = (arg1 - arg0.field2753) / 2 + arg0.field2744;
        } else if (arg0.field2749 == 2) {
            arg0.field2735 = arg1 - arg0.field2753 - arg0.field2744;
        } else if (arg0.field2749 == 3) {
            arg0.field2735 = arg0.field2744 * arg1 >> 14;
        } else if (arg0.field2749 == 4) {
            arg0.field2735 = (arg0.field2744 * arg1 >> 14) + (arg1 - arg0.field2753) / 2;
        } else {
            arg0.field2735 = arg1 - arg0.field2753 - (arg0.field2744 * arg1 >> 14);
        }
        if (arg0.field2750 == 0) {
            arg0.field2758 = arg0.field2754;
        } else if (arg0.field2750 == 1) {
            arg0.field2758 = (arg2 - arg0.field2760) / 2 + arg0.field2754;
        } else if (arg0.field2750 == 2) {
            arg0.field2758 = arg2 - arg0.field2760 - arg0.field2754;
        } else if (arg0.field2750 == 3) {
            arg0.field2758 = arg0.field2754 * arg2 >> 14;
        } else if (arg0.field2750 == 4) {
            arg0.field2758 = (arg0.field2754 * arg2 >> 14) + (arg2 - arg0.field2760) / 2;
        } else {
            arg0.field2758 = arg2 - arg0.field2760 - (arg0.field2754 * arg2 >> 14);
        }
        if (!field464 || arg0.field2765 != 0) {
            return;
        }
        if (arg0.field2735 < 0) {
            arg0.field2735 = 0;
        } else if (arg0.field2753 + arg0.field2735 > arg1) {
            arg0.field2735 = arg1 - arg0.field2753;
        }
        if (arg0.field2758 < 0) {
            arg0.field2758 = 0;
        } else if (arg0.field2760 + arg0.field2758 > arg2) {
            arg0.field2758 = arg2 - arg0.field2760;
        }
    }

    @ObfuscatedName("ae.cx(Lfa;IIIIIIB)V")
    public static final void method1067(class173 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field328) {
            field378 = 32;
        } else {
            field378 = 0;
        }
        field328 = false;
        if (class140.field2139 == 1 || !Statics.field3150 && class140.field2139 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2766 -= 4;
                method723(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2766 += 4;
                method723(arg0);
            } else if (arg5 >= arg1 - field378 && arg5 < field378 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2766 = (arg4 - arg3) * var8 / var9;
                method723(arg0);
                field328 = true;
            }
        }
        if (field493 == 0) {
            return;
        }
        int var10 = arg0.field2753;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2766 += field493 * 45;
            method723(arg0);
        }
    }

    @ObfuscatedName("ck.ck(Lfa;I)Z")
    public static final boolean method2042(class173 arg0) {
        if (arg0.field2855 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2855.length; var1++) {
            int var2 = method1961(arg0, var1);
            int var3 = arg0.field2856[var1];
            if (arg0.field2855[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2855[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2855[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("cm.cp(Lfa;II)I")
    public static final int method1961(class173 arg0, int arg1) {
        if (arg0.field2854 == null || arg1 >= arg0.field2854.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2854[arg1];
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
                    var7 = field431[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field338[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field291[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class173 var11 = class173.method2041(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method1531(var12).field1129 || field297)) {
                        for (int var13 = 0; var13 < var11.field2860.length; var13++) {
                            if (var12 + 1 == var11.field2860[var13]) {
                                var7 += var11.field2861[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class176.field2891[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class155.field2280[field338[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class176.field2891[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2254.field32;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class155.field2281[var14]) {
                            var7 += field338[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class173 var17 = class173.method2041(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method1531(var18).field1129 || field297)) {
                        for (int var19 = 0; var19 < var17.field2860.length; var19++) {
                            if (var18 + 1 == var17.field2860[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field459;
                }
                if (var6 == 12) {
                    var7 = field337;
                }
                if (var6 == 13) {
                    int var20 = class176.field2891[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class176.method2646(var22);
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
                    var7 = (Statics.field2254.field871 >> 7) + Statics.field2215;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2254.field814 >> 7) + Statics.field258;
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

    @ObfuscatedName("v.cb(Lfa;IIB)V")
    public static final void method173(class173 arg0, int arg1, int arg2) {
        if (arg0.field2747 == 1) {
            method3698(arg0.field2859, "", 24, 0, 0, arg0.field2801);
        }
        if (arg0.field2747 == 2 && !field449) {
            String var3 = Statics.method111(arg0);
            if (var3 != null) {
                method3698(var3, class2.method1065(65280) + arg0.field2858, 25, 0, -1, arg0.field2801);
            }
        }
        if (arg0.field2747 == 3) {
            method3698(class157.field2450, "", 26, 0, 0, arg0.field2801);
        }
        if (arg0.field2747 == 4) {
            method3698(arg0.field2859, "", 28, 0, 0, arg0.field2801);
        }
        if (arg0.field2747 == 5) {
            method3698(arg0.field2859, "", 29, 0, 0, arg0.field2801);
        }
        if (arg0.field2747 == 6 && field432 == null) {
            method3698(arg0.field2859, "", 30, 0, -1, arg0.field2801);
        }
        if (arg0.field2765 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2760; var5++) {
                for (int var6 = 0; var6 < arg0.field2753; var6++) {
                    int var7 = (arg0.field2808 + 32) * var6;
                    int var8 = (arg0.field2806 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2810[var4];
                        var8 += arg0.field2811[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field550 = var4;
                        Statics.field205 = arg0;
                        if (arg0.field2860[var4] > 0) {
                            class52 var9 = class52.method1531(arg0.field2860[var4] - 1);
                            if (field447 == 1 && class178.method720(method2141(arg0))) {
                                if (Statics.field1537 != arg0.field2801 || Statics.field2265 != var4) {
                                    method3698(class157.field2446, field448 + " " + class2.field24 + " " + class2.method1065(16748608) + var9.field1116, 31, var9.field1111, var4, arg0.field2801);
                                }
                            } else if (!field449 || !class178.method720(method2141(arg0))) {
                                String[] var10 = var9.field1136;
                                if (field465) {
                                    var10 = Statics.method546(var10);
                                }
                                if (class178.method720(method2141(arg0))) {
                                    for (int var11 = 4; var11 >= 3; var11--) {
                                        if (var10 != null && var10[var11] != null) {
                                            byte var12;
                                            if (var11 == 3) {
                                                var12 = 36;
                                            } else {
                                                var12 = 37;
                                            }
                                            method3698(var10[var11], class2.method1065(16748608) + var9.field1116, var12, var9.field1111, var4, arg0.field2801);
                                        } else if (var11 == 4) {
                                            method3698(class157.field2478, class2.method1065(16748608) + var9.field1116, 37, var9.field1111, var4, arg0.field2801);
                                        }
                                    }
                                }
                                if (class178.method106(method2141(arg0))) {
                                    method3698(class157.field2446, class2.method1065(16748608) + var9.field1116, 38, var9.field1111, var4, arg0.field2801);
                                }
                                if (class178.method720(method2141(arg0)) && var10 != null) {
                                    for (int var13 = 2; var13 >= 0; var13--) {
                                        if (var10[var13] != null) {
                                            byte var14 = 0;
                                            if (var13 == 0) {
                                                var14 = 33;
                                            }
                                            if (var13 == 1) {
                                                var14 = 34;
                                            }
                                            if (var13 == 2) {
                                                var14 = 35;
                                            }
                                            method3698(var10[var13], class2.method1065(16748608) + var9.field1116, var14, var9.field1111, var4, arg0.field2801);
                                        }
                                    }
                                }
                                String[] var15 = arg0.field2846;
                                if (field465) {
                                    var15 = Statics.method546(var15);
                                }
                                if (var15 != null) {
                                    for (int var16 = 4; var16 >= 0; var16--) {
                                        if (var15[var16] != null) {
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 39;
                                            }
                                            if (var16 == 1) {
                                                var17 = 40;
                                            }
                                            if (var16 == 2) {
                                                var17 = 41;
                                            }
                                            if (var16 == 3) {
                                                var17 = 42;
                                            }
                                            if (var16 == 4) {
                                                var17 = 43;
                                            }
                                            method3698(var15[var16], class2.method1065(16748608) + var9.field1116, var17, var9.field1111, var4, arg0.field2801);
                                        }
                                    }
                                }
                                method3698(class157.field2572, class2.method1065(16748608) + var9.field1116, 1005, var9.field1111, var4, arg0.field2801);
                            } else if ((Statics.field219 & 0x10) == 16) {
                                method3698(field452, field453 + " " + class2.field24 + " " + class2.method1065(16748608) + var9.field1116, 32, var9.field1111, var4, arg0.field2801);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2743) {
            return;
        }
        if (!field449) {
            for (int var18 = 9; var18 >= 5; var18--) {
                int var19 = method2141(arg0);
                boolean var20 = (var19 >> var18 + 1 & 0x1) != 0;
                String var21;
                if (!var20 && arg0.field2842 == null) {
                    var21 = null;
                } else if (arg0.field2816 == null || arg0.field2816.length <= var18 || arg0.field2816[var18] == null || arg0.field2816[var18].trim().length() == 0) {
                    var21 = null;
                } else {
                    var21 = arg0.field2816[var18];
                }
                if (var21 != null) {
                    method3698(var21, arg0.field2815, 1007, var18 + 1, arg0.field2745, arg0.field2801);
                }
            }
            String var23 = Statics.method111(arg0);
            if (var23 != null) {
                method3698(var23, arg0.field2815, 25, 0, arg0.field2745, arg0.field2801);
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                int var25 = method2141(arg0);
                boolean var26 = (var25 >> var24 + 1 & 0x1) != 0;
                String var27;
                if (!var26 && arg0.field2842 == null) {
                    var27 = null;
                } else if (arg0.field2816 == null || arg0.field2816.length <= var24 || arg0.field2816[var24] == null || arg0.field2816[var24].trim().length() == 0) {
                    var27 = null;
                } else {
                    var27 = arg0.field2816[var24];
                }
                if (var27 != null) {
                    method3698(var27, arg0.field2815, 57, var24 + 1, arg0.field2745, arg0.field2801);
                }
            }
            int var29 = method2141(arg0);
            boolean var30 = (var29 & 0x1) != 0;
            if (var30) {
                method3698(class157.field2442, "", 30, 0, arg0.field2745, arg0.field2801);
            }
        } else if (class178.method2937(method2141(arg0)) && (Statics.field219 & 0x20) == 32) {
            method3698(field452, field453 + " " + class2.field24 + " " + arg0.field2815, 58, 0, arg0.field2745, arg0.field2801);
        }
    }

    @ObfuscatedName("aw.cy(IIIIIIII)V")
    public static final void method645(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (Statics.method2150(arg0)) {
            method1066(Statics.field2851[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ae.cf([Lfa;IIIIIIIB)V")
    public static final void method1066(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class173 var9 = arg0[var8];
            if (var9 != null && (!var9.field2743 || var9.field2765 == 0 || var9.field2759 || method2141(var9) != 0 || field567 == var9 || var9.field2748 == 1338) && var9.field2763 == arg1 && (!var9.field2743 || !method2280(var9))) {
                int var10 = var9.field2735 + arg6;
                int var11 = var9.field2758 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2765 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2765 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2753 + var10;
                    int var19 = var9.field2760 + var11;
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
                    int var22 = var9.field2753 + var10;
                    int var23 = var9.field2760 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field467 == var9) {
                    field475 = true;
                    field424 = var10;
                    field477 = var11;
                }
                if (!var9.field2743 || var12 < var14 && var13 < var15) {
                    int var24 = class140.field2141;
                    int var25 = class140.field2136;
                    if (class140.field2146 != 0) {
                        var24 = class140.field2147;
                        var25 = class140.field2148;
                    }
                    if (var9.field2748 == 1337) {
                        if (!field427 && !field471 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method2963(var24, var25, var12, var13);
                        }
                    } else if (var9.field2748 != 1338) {
                        if (!field471 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method173(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2765 == 0) {
                            if (!var9.field2743 && method2280(var9) && Statics.field3040 != var9) {
                                continue;
                            }
                            method1066(arg0, var9.field2801, var12, var13, var14, var15, var10 - var9.field2804, var11 - var9.field2766);
                            if (var9.field2866 != null) {
                                method1066(var9.field2866, var9.field2801, var12, var13, var14, var15, var10 - var9.field2804, var11 - var9.field2766);
                            }
                            class4 var40 = (class4) field455.method3539((long) var9.field2801);
                            if (var40 != null) {
                                if (var40.field63 == 0 && class140.field2141 >= var12 && class140.field2136 >= var13 && class140.field2141 < var14 && class140.field2136 < var15 && !field471 && !field464) {
                                    for (class1 var41 = (class1) field293.method3575(); var41 != null; var41 = (class1) field293.method3576()) {
                                        if (var41.field2) {
                                            var41.method3661();
                                            var41.field7.field2792 = false;
                                        }
                                    }
                                    if (Statics.field408 == 0) {
                                        field467 = null;
                                        field567 = null;
                                    }
                                    if (!field471) {
                                        field441[0] = class157.field2547;
                                        field446[0] = "";
                                        field303[0] = 1006;
                                        field436 = 1;
                                    }
                                }
                                method645(var40.field57, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2743) {
                            if (var9.field2875) {
                                if (class140.field2141 >= var12 && class140.field2136 >= var13 && class140.field2141 < var14 && class140.field2136 < var15) {
                                    for (class1 var42 = (class1) field293.method3575(); var42 != null; var42 = (class1) field293.method3576()) {
                                        if (var42.field2) {
                                            var42.method3661();
                                            var42.field7.field2792 = false;
                                        }
                                    }
                                    if (Statics.field408 == 0) {
                                        field467 = null;
                                        field567 = null;
                                    }
                                    if (!field471) {
                                        field441[0] = class157.field2547;
                                        field446[0] = "";
                                        field303[0] = 1006;
                                        field436 = 1;
                                    }
                                }
                            } else if (var9.field2876 && class140.field2141 >= var12 && class140.field2136 >= var13 && class140.field2141 < var14 && class140.field2136 < var15) {
                                for (class1 var43 = (class1) field293.method3575(); var43 != null; var43 = (class1) field293.method3576()) {
                                    if (var43.field2 && var43.field7.field2843 == var43.field9) {
                                        var43.method3661();
                                    }
                                }
                            }
                            boolean var44;
                            if (class140.field2141 >= var12 && class140.field2136 >= var13 && class140.field2141 < var14 && class140.field2136 < var15) {
                                var44 = true;
                            } else {
                                var44 = false;
                            }
                            boolean var45 = false;
                            if ((class140.field2139 == 1 || !Statics.field3150 && class140.field2139 == 4) && var44) {
                                var45 = true;
                            }
                            boolean var46 = false;
                            if ((class140.field2146 == 1 || !Statics.field3150 && class140.field2146 == 4) && class140.field2147 >= var12 && class140.field2148 >= var13 && class140.field2147 < var14 && class140.field2148 < var15) {
                                var46 = true;
                            }
                            if (var46) {
                                method585(var9, class140.field2147 - var10, class140.field2148 - var11);
                            }
                            if (field467 != null && field467 != var9 && var44 && class178.method2737(method2141(var9))) {
                                field369 = var9;
                            }
                            if (field567 == var9) {
                                field499 = true;
                                field481 = var10;
                                field474 = var11;
                            }
                            if (var9.field2759) {
                                if (var44 && field493 != 0 && var9.field2843 != null) {
                                    class1 var47 = new class1();
                                    var47.field2 = true;
                                    var47.field7 = var9;
                                    var47.field5 = field493;
                                    var47.field9 = var9.field2843;
                                    field293.method3570(var47);
                                }
                                if (field467 != null || Statics.field763 != null || field471) {
                                    var46 = false;
                                    var45 = false;
                                    var44 = false;
                                }
                                if (!var9.field2868 && var46) {
                                    var9.field2868 = true;
                                    if (var9.field2740 != null) {
                                        class1 var48 = new class1();
                                        var48.field2 = true;
                                        var48.field7 = var9;
                                        var48.field4 = class140.field2147 - var10;
                                        var48.field5 = class140.field2148 - var11;
                                        var48.field9 = var9.field2740;
                                        field293.method3570(var48);
                                    }
                                }
                                if (var9.field2868 && var45 && var9.field2825 != null) {
                                    class1 var49 = new class1();
                                    var49.field2 = true;
                                    var49.field7 = var9;
                                    var49.field4 = class140.field2141 - var10;
                                    var49.field5 = class140.field2136 - var11;
                                    var49.field9 = var9.field2825;
                                    field293.method3570(var49);
                                }
                                if (var9.field2868 && !var45) {
                                    var9.field2868 = false;
                                    if (var9.field2826 != null) {
                                        class1 var50 = new class1();
                                        var50.field2 = true;
                                        var50.field7 = var9;
                                        var50.field4 = class140.field2141 - var10;
                                        var50.field5 = class140.field2136 - var11;
                                        var50.field9 = var9.field2826;
                                        field321.method3570(var50);
                                    }
                                }
                                if (var45 && var9.field2827 != null) {
                                    class1 var51 = new class1();
                                    var51.field2 = true;
                                    var51.field7 = var9;
                                    var51.field4 = class140.field2141 - var10;
                                    var51.field5 = class140.field2136 - var11;
                                    var51.field9 = var9.field2827;
                                    field293.method3570(var51);
                                }
                                if (!var9.field2792 && var44) {
                                    var9.field2792 = true;
                                    if (var9.field2828 != null) {
                                        class1 var52 = new class1();
                                        var52.field2 = true;
                                        var52.field7 = var9;
                                        var52.field4 = class140.field2141 - var10;
                                        var52.field5 = class140.field2136 - var11;
                                        var52.field9 = var9.field2828;
                                        field293.method3570(var52);
                                    }
                                }
                                if (var9.field2792 && var44 && var9.field2829 != null) {
                                    class1 var53 = new class1();
                                    var53.field2 = true;
                                    var53.field7 = var9;
                                    var53.field4 = class140.field2141 - var10;
                                    var53.field5 = class140.field2136 - var11;
                                    var53.field9 = var9.field2829;
                                    field293.method3570(var53);
                                }
                                if (var9.field2792 && !var44) {
                                    var9.field2792 = false;
                                    if (var9.field2830 != null) {
                                        class1 var54 = new class1();
                                        var54.field2 = true;
                                        var54.field7 = var9;
                                        var54.field4 = class140.field2141 - var10;
                                        var54.field5 = class140.field2136 - var11;
                                        var54.field9 = var9.field2830;
                                        field321.method3570(var54);
                                    }
                                }
                                if (var9.field2841 != null) {
                                    class1 var55 = new class1();
                                    var55.field7 = var9;
                                    var55.field9 = var9.field2841;
                                    field294.method3570(var55);
                                }
                                if (var9.field2757 != null && field482 > var9.field2870) {
                                    if (var9.field2836 == null || field482 - var9.field2870 > 32) {
                                        class1 var60 = new class1();
                                        var60.field7 = var9;
                                        var60.field9 = var9.field2757;
                                        field293.method3570(var60);
                                    } else {
                                        label523: for (int var56 = var9.field2870; var56 < field482; var56++) {
                                            int var57 = field339[var56 & 0x1F];
                                            for (int var58 = 0; var58 < var9.field2836.length; var58++) {
                                                if (var9.field2836[var58] == var57) {
                                                    class1 var59 = new class1();
                                                    var59.field7 = var9;
                                                    var59.field9 = var9.field2757;
                                                    field293.method3570(var59);
                                                    break label523;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2870 = field482;
                                }
                                if (var9.field2837 != null && field484 > var9.field2871) {
                                    if (var9.field2834 == null || field484 - var9.field2871 > 32) {
                                        class1 var65 = new class1();
                                        var65.field7 = var9;
                                        var65.field9 = var9.field2837;
                                        field293.method3570(var65);
                                    } else {
                                        label499: for (int var61 = var9.field2871; var61 < field484; var61++) {
                                            int var62 = field468[var61 & 0x1F];
                                            for (int var63 = 0; var63 < var9.field2834.length; var63++) {
                                                if (var9.field2834[var63] == var62) {
                                                    class1 var64 = new class1();
                                                    var64.field7 = var9;
                                                    var64.field9 = var9.field2837;
                                                    field293.method3570(var64);
                                                    break label499;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2871 = field484;
                                }
                                if (var9.field2839 != null && field486 > var9.field2872) {
                                    if (var9.field2813 == null || field486 - var9.field2872 > 32) {
                                        class1 var70 = new class1();
                                        var70.field7 = var9;
                                        var70.field9 = var9.field2839;
                                        field293.method3570(var70);
                                    } else {
                                        label475: for (int var66 = var9.field2872; var66 < field486; var66++) {
                                            int var67 = field485[var66 & 0x1F];
                                            for (int var68 = 0; var68 < var9.field2813.length; var68++) {
                                                if (var9.field2813[var68] == var67) {
                                                    class1 var69 = new class1();
                                                    var69.field7 = var9;
                                                    var69.field9 = var9.field2839;
                                                    field293.method3570(var69);
                                                    break label475;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2872 = field486;
                                }
                                if (field487 > var9.field2864 && var9.field2812 != null) {
                                    class1 var71 = new class1();
                                    var71.field7 = var9;
                                    var71.field9 = var9.field2812;
                                    field293.method3570(var71);
                                }
                                if (field497 > var9.field2864 && var9.field2869 != null) {
                                    class1 var72 = new class1();
                                    var72.field7 = var9;
                                    var72.field9 = var9.field2869;
                                    field293.method3570(var72);
                                }
                                if (field545 > var9.field2864 && var9.field2741 != null) {
                                    class1 var73 = new class1();
                                    var73.field7 = var9;
                                    var73.field9 = var9.field2741;
                                    field293.method3570(var73);
                                }
                                if (field490 > var9.field2864 && var9.field2852 != null) {
                                    class1 var74 = new class1();
                                    var74.field7 = var9;
                                    var74.field9 = var9.field2852;
                                    field293.method3570(var74);
                                }
                                if (field491 > var9.field2864 && var9.field2853 != null) {
                                    class1 var75 = new class1();
                                    var75.field7 = var9;
                                    var75.field9 = var9.field2853;
                                    field293.method3570(var75);
                                }
                                if (field492 > var9.field2864 && var9.field2848 != null) {
                                    class1 var76 = new class1();
                                    var76.field7 = var9;
                                    var76.field9 = var9.field2848;
                                    field293.method3570(var76);
                                }
                                var9.field2864 = field480;
                                if (var9.field2845 != null) {
                                    for (int var77 = 0; var77 < field518; var77++) {
                                        class1 var78 = new class1();
                                        var78.field7 = var9;
                                        var78.field8 = field520[var77];
                                        var78.field11 = field549[var77];
                                        var78.field9 = var9.field2845;
                                        field293.method3570(var78);
                                    }
                                }
                            }
                        }
                        if (!var9.field2743 && field467 == null && Statics.field763 == null && !field471) {
                            if ((var9.field2824 >= 0 || var9.field2771 != 0) && class140.field2141 >= var12 && class140.field2136 >= var13 && class140.field2141 < var14 && class140.field2136 < var15) {
                                if (var9.field2824 >= 0) {
                                    Statics.field3040 = arg0[var9.field2824];
                                } else {
                                    Statics.field3040 = var9;
                                }
                            }
                            if (var9.field2765 == 8 && class140.field2141 >= var12 && class140.field2136 >= var13 && class140.field2141 < var14 && class140.field2136 < var15) {
                                Statics.field2633 = var9;
                            }
                            if (var9.field2814 > var9.field2760) {
                                method1067(var9, var9.field2753 + var10, var11, var9.field2760, var9.field2814, class140.field2141, class140.field2136);
                            }
                        }
                    } else if ((field531 == 0 || field531 == 3) && (class140.field2146 == 1 || !Statics.field3150 && class140.field2146 == 4)) {
                        class175 var26 = var9.method3188(true);
                        if (var26 != null) {
                            int var27 = class140.field2147 - var10;
                            int var28 = class140.field2148 - var11;
                            if (var26.method3220(var27, var28)) {
                                int var29 = var27 - var26.field2885 / 2;
                                int var30 = var28 - var26.field2884 / 2;
                                int var31 = field547 + field496 & 0x7FF;
                                int var32 = class91.field1573[var31];
                                int var33 = class91.field1579[var31];
                                int var34 = (field366 + 256) * var32 >> 8;
                                int var35 = (field366 + 256) * var33 >> 8;
                                int var36 = var29 * var35 + var30 * var34 >> 11;
                                int var37 = var30 * var35 - var29 * var34 >> 11;
                                int var38 = Statics.field2254.field871 + var36 >> 7;
                                int var39 = Statics.field2254.field814 - var37 >> 7;
                                field302.method2586(240);
                                field302.method2330(18);
                                field302.method2330(class137.field2088[82] ? (class137.field2088[81] ? 2 : 1) : 0);
                                field302.method2377(Statics.field2215 + var38);
                                field302.method2378(Statics.field258 + var39);
                                field302.method2330(var29);
                                field302.method2330(var30);
                                field302.method2331(field496);
                                field302.method2330(57);
                                field302.method2330(field547);
                                field302.method2330(field366);
                                field302.method2330(89);
                                field302.method2331(Statics.field2254.field871);
                                field302.method2331(Statics.field2254.field814);
                                field302.method2330(63);
                                field529 = var38;
                                field530 = var39;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ey.co([Lfa;IB)V")
    public static final void method2705(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2765 == 0) {
                    if (var3.field2866 != null) {
                        method2705(var3.field2866, arg1);
                    }
                    class4 var4 = (class4) field455.method3539((long) var3.field2801);
                    if (var4 != null) {
                        int var5 = var4.field57;
                        if (Statics.method2150(var5)) {
                            method2705(Statics.field2851[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2849 != null) {
                    class1 var6 = new class1();
                    var6.field7 = var3;
                    var6.field9 = var3.field2849;
                    class37.method2928(var6);
                }
                if (arg1 == 1 && var3.field2850 != null) {
                    if (var3.field2745 >= 0) {
                        class173 var7 = class173.method2041(var3.field2801);
                        if (var7 == null || var7.field2866 == null || var3.field2745 >= var7.field2866.length || var7.field2866[var3.field2745] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field7 = var3;
                    var8.field9 = var3.field2850;
                    class37.method2928(var8);
                }
            }
        }
    }

    @ObfuscatedName("w.cn(Lfa;III)V")
    public static final void method585(class173 arg0, int arg1, int arg2) {
        if (field467 != null || field471 || arg0 == null || method130(arg0) == null) {
            return;
        }
        field467 = arg0;
        field567 = method130(arg0);
        field469 = arg1;
        field470 = arg2;
        Statics.field408 = 0;
        field566 = false;
        if (field436 <= 0) {
            return;
        }
        int var3 = field436 - 1;
        Statics.field2121 = new class31();
        Statics.field2121.field704 = field437[var3];
        Statics.field2121.field705 = field438[var3];
        Statics.field2121.field706 = field303[var3];
        Statics.field2121.field707 = field440[var3];
        Statics.field2121.field708 = field441[var3];
    }

    @ObfuscatedName("ai.ch(Lfa;I)V")
    public static void method723(class173 arg0) {
        if (field323 == arg0.field2874) {
            field500[arg0.field2873] = true;
        }
    }

    @ObfuscatedName("aq.cd(I)V")
    public static void method965() {
        for (class4 var0 = (class4) field455.method3551(); var0 != null; var0 = (class4) field455.method3542()) {
            int var1 = var0.field57;
            if (Statics.method2150(var1)) {
                boolean var2 = true;
                class173[] var3 = Statics.field2851[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2743;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3112;
                    class173 var6 = class173.method2041(var5);
                    if (var6 != null) {
                        method723(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("n.cg(Lfa;I)Lfa;")
    public static class173 method130(class173 arg0) {
        class173 var1 = arg0;
        int var2 = method2141(arg0);
        int var3 = var2 >> 17 & 0x7;
        int var4 = var3;
        class173 var5;
        if (var3 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var1;
                    break;
                }
                var1 = class173.method2041(var1.field2763);
                if (var1 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class173 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2817;
        }
        return var7;
    }

    @ObfuscatedName("ba.ce(IB)V")
    public static final void method1518(int arg0) {
        if (!Statics.method2150(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2851[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3 != null) {
                var3.field2809 = 0;
                var3.field2865 = 0;
            }
        }
    }

    @ObfuscatedName("ba.dn([Lfa;II)V")
    public static final void method1519(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null && var3.field2763 == arg1 && (!var3.field2743 || !method2280(var3))) {
                if (var3.field2765 == 0) {
                    if (!var3.field2743 && method2280(var3) && Statics.field3040 != var3) {
                        continue;
                    }
                    method1519(arg0, var3.field2801);
                    if (var3.field2866 != null) {
                        method1519(var3.field2866, var3.field2801);
                    }
                    class4 var4 = (class4) field455.method3539((long) var3.field2801);
                    if (var4 != null) {
                        int var5 = var4.field57;
                        if (Statics.method2150(var5)) {
                            method1519(Statics.field2851[var5], -1);
                        }
                    }
                }
                if (var3.field2765 == 6) {
                    if (var3.field2789 != -1 || var3.field2790 != -1) {
                        boolean var6 = method2042(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2790;
                        } else {
                            var7 = var3.field2789;
                        }
                        if (var7 != -1) {
                            class43 var8 = class43.method2701(var7);
                            var3.field2865 += field410;
                            while (var3.field2865 > var8.field991[var3.field2809]) {
                                var3.field2865 -= var8.field991[var3.field2809];
                                var3.field2809++;
                                if (var3.field2809 >= var8.field989.length) {
                                    var3.field2809 -= var8.field1001;
                                    if (var3.field2809 < 0 || var3.field2809 >= var8.field989.length) {
                                        var3.field2809 = 0;
                                    }
                                }
                                method723(var3);
                            }
                        }
                    }
                    if (var3.field2798 != 0 && !var3.field2743) {
                        int var9 = var3.field2798 >> 16;
                        int var10 = var3.field2798 << 16 >> 16;
                        int var11 = field410 * var9;
                        int var12 = field410 * var10;
                        var3.field2793 = var3.field2793 + var11 & 0x7FF;
                        var3.field2803 = var3.field2803 + var12 & 0x7FF;
                        method723(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ab.dd(IIII)Ls;")
    public static final class4 method740(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field57 = arg1;
        var3.field63 = arg2;
        field455.method3546(var3, (long) arg0);
        method1518(arg1);
        class173 var4 = class173.method2041(arg0);
        method723(var4);
        if (field432 != null) {
            method723(field432);
            field432 = null;
        }
        Statics.method739();
        method15(Statics.field2851[arg0 >> 16], var4, false);
        class37.method2230(arg1);
        if (field454 != -1) {
            int var5 = field454;
            if (Statics.method2150(var5)) {
                method2705(Statics.field2851[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("do.dl(Ls;ZI)V")
    public static final void method2279(class4 arg0, boolean arg1) {
        int var2 = arg0.field57;
        int var3 = (int) arg0.field3112;
        arg0.method3661();
        if (arg1) {
            class173.method2060(var2);
        }
        method3680(var2);
        class173 var4 = class173.method2041(var3);
        if (var4 != null) {
            method723(var4);
        }
        Statics.method739();
        if (field454 != -1) {
            int var5 = field454;
            if (Statics.method2150(var5)) {
                method2705(Statics.field2851[var5], 1);
            }
        }
    }

    @ObfuscatedName("c.da(Lfa;B)Z")
    public static final boolean method205(class173 arg0) {
        int var1 = arg0.field2748;
        if (var1 == 205) {
            field346 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field379.method3259(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field379.method3253(var4, var5 == 1);
        }
        if (var1 == 324) {
            field379.method3252(false);
        }
        if (var1 == 325) {
            field379.method3252(true);
        }
        if (var1 == 326) {
            field302.method2586(84);
            field379.method3255(field302);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("co.dh(Lfa;IIII)V")
    public static final void method2061(class173 arg0, int arg1, int arg2, int arg3) {
        method143();
        class175 var4 = arg0.method3188(false);
        if (var4 == null) {
            return;
        }
        class80.method1726(arg1, arg2, var4.field2885 + arg1, var4.field2884 + arg2);
        if (field531 == 2 || field531 == 5) {
            class80.method1713(arg1, arg2, 0, var4.field2887, var4.field2886);
        } else {
            int var5 = field547 + field496 & 0x7FF;
            int var6 = Statics.field2254.field871 / 32 + 48;
            int var7 = 464 - Statics.field2254.field814 / 32;
            Statics.field22.method1654(arg1, arg2, var4.field2885, var4.field2884, var6, var7, var5, field366 + 256, var4.field2887, var4.field2886);
            for (int var8 = 0; var8 < field525; var8++) {
                int var9 = field364[var8] * 4 + 2 - Statics.field2254.field871 / 32;
                int var10 = field527[var8] * 4 + 2 - Statics.field2254.field814 / 32;
                method975(arg1, arg2, var9, var10, field318[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class199 var13 = field420[Statics.field1079][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field2254.field871 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field2254.field814 / 32;
                        method975(arg1, arg2, var14, var15, Statics.field666[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field332; var16++) {
                class35 var17 = field359[field565[var16]];
                if (var17 != null && var17.method25()) {
                    class40 var18 = var17.field786;
                    if (var18 != null && var18.field910 != null) {
                        var18 = var18.method749();
                    }
                    if (var18 != null && var18.field903 && var18.field890) {
                        int var19 = var17.field871 / 32 - Statics.field2254.field871 / 32;
                        int var20 = var17.field814 / 32 - Statics.field2254.field814 / 32;
                        method975(arg1, arg2, var19, var20, Statics.field666[1], var4);
                    }
                }
            }
            int var21 = class33.field775;
            int[] var22 = class33.field760;
            for (int var23 = 0; var23 < var21; var23++) {
                class3 var24 = field416[var22[var23]];
                if (var24 != null && var24.method25() && !var24.field53 && Statics.field2254 != var24) {
                    int var25 = var24.field871 / 32 - Statics.field2254.field871 / 32;
                    int var26 = var24.field814 / 32 - Statics.field2254.field814 / 32;
                    boolean var27 = false;
                    if (method137(var24.field41, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field152; var29++) {
                        if (var24.field41.equals(Statics.field1004[var29].field625)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field2254.field46 != 0 && var24.field46 != 0 && Statics.field2254.field46 == var24.field46) {
                        var30 = true;
                    }
                    if (var27) {
                        method975(arg1, arg2, var25, var26, Statics.field666[3], var4);
                    } else if (var30) {
                        method975(arg1, arg2, var25, var26, Statics.field666[4], var4);
                    } else if (var28) {
                        method975(arg1, arg2, var25, var26, Statics.field666[5], var4);
                    } else {
                        method975(arg1, arg2, var25, var26, Statics.field666[2], var4);
                    }
                }
            }
            if (field312 != 0 && field304 % 20 < 10) {
                if (field312 == 1 && field313 >= 0 && field313 < field359.length) {
                    class35 var31 = field359[field313];
                    if (var31 != null) {
                        int var32 = var31.field871 / 32 - Statics.field2254.field871 / 32;
                        int var33 = var31.field814 / 32 - Statics.field2254.field814 / 32;
                        method11(arg1, arg2, var32, var33, Statics.field372[1], var4);
                    }
                }
                if (field312 == 2) {
                    int var34 = field419 * 4 - Statics.field2215 * 4 + 2 - Statics.field2254.field871 / 32;
                    int var35 = field316 * 4 - Statics.field258 * 4 + 2 - Statics.field2254.field814 / 32;
                    method11(arg1, arg2, var34, var35, Statics.field372[1], var4);
                }
                if (field312 == 10 && field314 >= 0 && field314 < field416.length) {
                    class3 var36 = field416[field314];
                    if (var36 != null) {
                        int var37 = var36.field871 / 32 - Statics.field2254.field871 / 32;
                        int var38 = var36.field814 / 32 - Statics.field2254.field814 / 32;
                        method11(arg1, arg2, var37, var38, Statics.field372[1], var4);
                    }
                }
            }
            if (field529 != 0) {
                int var39 = field529 * 4 + 2 - Statics.field2254.field871 / 32;
                int var40 = field530 * 4 + 2 - Statics.field2254.field814 / 32;
                method975(arg1, arg2, var39, var40, Statics.field372[0], var4);
            }
            if (!Statics.field2254.field53) {
                class80.method1704(var4.field2885 / 2 + arg1 - 1, var4.field2884 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field501[arg3] = true;
    }

    @ObfuscatedName("ez.de(Lfa;IIII)V")
    public static final void method2912(class173 arg0, int arg1, int arg2, int arg3) {
        class175 var4 = arg0.method3188(false);
        if (var4 == null) {
            return;
        }
        if (field531 < 3) {
            Statics.field2237.method1654(arg1, arg2, var4.field2885, var4.field2884, 25, 25, field496, 256, var4.field2887, var4.field2886);
        } else {
            class80.method1713(arg1, arg2, 0, var4.field2887, var4.field2886);
        }
    }

    @ObfuscatedName("r.du(IIIILca;Lfk;I)V")
    public static final void method11(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method975(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field547 + field496 & 0x7FF;
        int var8 = class91.field1573[var7];
        int var9 = class91.field1579[var7];
        int var10 = var8 * 256 / (field366 + 256);
        int var11 = var9 * 256 / (field366 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field280.method1663(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("af.do(IIIILca;Lfk;I)V")
    public static final void method975(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field547 + field496 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class91.field1573[var6];
        int var9 = class91.field1579[var6];
        int var10 = var8 * 256 / (field366 + 256);
        int var11 = var9 * 256 / (field366 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1624(arg5.field2885 / 2 + var12 - arg4.field1403 / 2, arg5.field2884 / 2 - var13 - arg4.field1404 / 2, arg0, arg1, arg5.field2885, arg5.field2884, arg5.field2887, arg5.field2886);
        } else {
            arg4.method1679(arg5.field2885 / 2 + arg0 + var12 - arg4.field1403 / 2, arg5.field2884 / 2 + arg1 - var13 - arg4.field1404 / 2);
        }
    }

    @ObfuscatedName("l.dp(Ljava/lang/String;ZB)Z")
    public static boolean method137(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class164.method2658(arg0, Statics.field2063);
        for (int var3 = 0; var3 < field563; var3++) {
            if (var2.equalsIgnoreCase(class164.method2658(field514[var3].field262, Statics.field2063)) && (!arg1 || field514[var3].field250 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class164.method2658(Statics.field2254.field41, Statics.field2063))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ad.dx(Ljava/lang/String;I)Z")
    public static boolean method628(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class164.method2658(arg0, Statics.field2063);
        for (int var2 = 0; var2 < field510; var2++) {
            class8 var3 = field569[var2];
            if (var1.equalsIgnoreCase(class164.method2658(var3.field130, Statics.field2063))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class164.method2658(var3.field126, Statics.field2063))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("g.dq(Ljava/lang/String;B)V")
    public static final void method110(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field563 < 200 || field460 == 1) || field563 >= 400) {
            class12.method2769(30, "", class157.field2304);
            return;
        }
        String var1 = class164.method2658(arg0, Statics.field2063);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field563; var2++) {
            class18 var3 = field514[var2];
            String var4 = class164.method2658(var3.field262, Statics.field2063);
            if (var4 != null && var4.equals(var1)) {
                class12.method2769(30, "", arg0 + class157.field2458);
                return;
            }
            if (var3.field249 != null) {
                String var5 = class164.method2658(var3.field249, Statics.field2063);
                if (var5 != null && var5.equals(var1)) {
                    class12.method2769(30, "", arg0 + class157.field2458);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field510; var6++) {
            class8 var7 = field569[var6];
            String var8 = class164.method2658(var7.field130, Statics.field2063);
            if (var8 != null && var8.equals(var1)) {
                class12.method2769(30, "", class157.field2532 + arg0 + class157.field2303);
                return;
            }
            if (var7.field126 != null) {
                String var9 = class164.method2658(var7.field126, Statics.field2063);
                if (var9 != null && var9.equals(var1)) {
                    class12.method2769(30, "", class157.field2532 + arg0 + class157.field2303);
                    return;
                }
            }
        }
        if (class164.method2658(Statics.field2254.field41, Statics.field2063).equals(var1)) {
            class12.method2769(30, "", class157.field2461);
        } else {
            field302.method2586(216);
            field302.method2330(class119.method571(arg0));
            field302.method2336(arg0);
        }
    }

    @ObfuscatedName("ae.dy(Ljava/lang/String;I)V")
    public static final void method1064(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class164.method2658(arg0, Statics.field2063);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field510; var2++) {
            class8 var3 = field569[var2];
            String var4 = var3.field130;
            String var5 = class164.method2658(var4, Statics.field2063);
            if (class129.method2149(arg0, var1, var4, var5)) {
                field510--;
                for (int var6 = var2; var6 < field510; var6++) {
                    field569[var6] = field569[var6 + 1];
                }
                field497 = field480;
                field302.method2586(11);
                field302.method2330(class119.method571(arg0));
                field302.method2336(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("cp.dk(Ljava/lang/String;II)V")
    public static final void method2043(String arg0, int arg1) {
        field302.method2586(153);
        field302.method2330(class119.method571(arg0) + 1);
        field302.method2336(arg0);
        field302.method2481(arg1);
    }

    @ObfuscatedName("ag.ds(Ljava/lang/String;S)V")
    public static final void method842(String arg0) {
        if (Statics.field1004 != null) {
            field302.method2586(129);
            field302.method2330(class119.method571(arg0));
            field302.method2336(arg0);
        }
    }

    @ObfuscatedName("hb.dv(IB)V")
    public static void method3680(int arg0) {
        for (class201 var1 = (class201) field367.method3551(); var1 != null; var1 = (class201) field367.method3542()) {
            if ((long) arg0 == (var1.field3112 >> 48 & 0xFFFFL)) {
                var1.method3661();
            }
        }
    }

    @ObfuscatedName("cg.dg(Lfa;I)I")
    public static int method2141(class173 arg0) {
        class201 var1 = (class201) field367.method3539(((long) arg0.field2801 << 32) + (long) arg0.field2745);
        return var1 == null ? arg0.field2807 : var1.field3097;
    }

    @ObfuscatedName("do.db(Lfa;I)Z")
    public static boolean method2280(class173 arg0) {
        if (field464) {
            if (method2141(arg0) != 0) {
                return false;
            }
            if (arg0.field2765 == 0) {
                return false;
            }
        }
        return arg0.field2764;
    }

    @ObfuscatedName("cp.dc(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method2044(String arg0, boolean arg1) {
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
        if (Statics.field59 != null) {
            var3 = "/p=" + Statics.field59;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field299 + "/a=" + Statics.field300 + var3 + "/";
    }

    @ObfuscatedName("ct.dr(Ljava/lang/String;B)V")
    public static void method1774(String arg0) {
        Statics.field59 = arg0;
        try {
            String var1 = Statics.field541.getParameter(class190.field3052.field3050);
            String var2 = Statics.field541.getParameter(class190.field3059.field3050);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class115.method207() + 94608000000L;
                class111.field1946.setTime(new Date(var6));
                int var8 = class111.field1946.get(7);
                int var9 = class111.field1946.get(5);
                int var10 = class111.field1946.get(2);
                int var11 = class111.field1946.get(1);
                int var12 = class111.field1946.get(11);
                int var13 = class111.field1946.get(12);
                int var14 = class111.field1946.get(13);
                String var15 = class111.field1945[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class111.field1951[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field541;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }

    @ObfuscatedName("bq.df(Ljava/lang/String;ZB)V")
    public static void method1193(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field2656; var5++) {
            class52 var6 = class52.method1531(var5);
            if ((!arg1 || var6.field1133) && var6.field1121 == -1 && var6.field1116.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field752 = -1;
                    Statics.field1758 = null;
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
        Statics.field1758 = var3;
        Statics.field880 = 0;
        Statics.field752 = var4;
        String[] var9 = new String[Statics.field752];
        for (int var10 = 0; var10 < Statics.field752; var10++) {
            var9[var10] = class52.method1531(var3[var10]).field1116;
        }
        short[] var11 = Statics.field1758;
        class124.method1554(var9, var11, 0, var9.length - 1);
    }
}

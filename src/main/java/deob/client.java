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
import java.util.Iterator;

public final class client extends class114 {

    @ObfuscatedName("client.u")
    public static boolean field552 = true;

    @ObfuscatedName("client.h")
    public static int field301 = 1;

    @ObfuscatedName("client.r")
    public static int field302 = 0;

    @ObfuscatedName("client.l")
    public static int field581 = 0;

    @ObfuscatedName("client.w")
    public static class118[] field527 = new class118[4];

    @ObfuscatedName("client.j")
    public static boolean field306 = false;

    @ObfuscatedName("client.s")
    public static boolean field307 = false;

    @ObfuscatedName("client.q")
    public static int field309 = 0;

    @ObfuscatedName("client.z")
    public static int field362 = 0;

    @ObfuscatedName("client.g")
    public static boolean field579 = true;

    @ObfuscatedName("client.b")
    public static int field312 = 0;

    @ObfuscatedName("client.k")
    public static long field340 = 1L;

    @ObfuscatedName("client.c")
    public static int field315 = -1;

    @ObfuscatedName("client.e")
    public static int field310 = -1;

    @ObfuscatedName("client.am")
    public static int field317 = -1;

    @ObfuscatedName("client.an")
    public static boolean field555 = true;

    @ObfuscatedName("client.aq")
    public static boolean field319 = false;

    @ObfuscatedName("client.ah")
    public static int field320 = 0;

    @ObfuscatedName("client.ag")
    public static int field321 = 0;

    @ObfuscatedName("client.ab")
    public static int field342 = 0;

    @ObfuscatedName("client.aw")
    public static int field323 = 0;

    @ObfuscatedName("client.ax")
    public static int field324 = 0;

    @ObfuscatedName("client.ar")
    public static int field394 = 0;

    @ObfuscatedName("client.ak")
    public static int field467 = 0;

    @ObfuscatedName("client.ai")
    public static int field502 = 0;

    @ObfuscatedName("client.ap")
    public static int field328 = 0;

    @ObfuscatedName("client.at")
    public static class41 field329 = class41.field828;

    @ObfuscatedName("client.ad")
    public static class41 field393 = class41.field828;

    @ObfuscatedName("client.ao")
    public static int field331 = 0;

    @ObfuscatedName("client.as")
    public static int field304 = 0;

    @ObfuscatedName("client.al")
    public static int field333 = 0;

    @ObfuscatedName("client.bg")
    public static int field334 = 0;

    @ObfuscatedName("client.bz")
    public static int field407 = 0;

    @ObfuscatedName("client.bm")
    public static int field336 = 0;

    @ObfuscatedName("client.bo")
    public static int field337 = 0;

    @ObfuscatedName("client.bd")
    public static int field410 = 0;

    @ObfuscatedName("client.bp")
    public static byte[] field530 = null;

    @ObfuscatedName("client.cx")
    public static class36[] field412 = new class36[32768];

    @ObfuscatedName("client.cv")
    public static int field403 = 0;

    @ObfuscatedName("client.ce")
    public static int[] field343 = new int[32768];

    @ObfuscatedName("client.cg")
    public static int field344 = 0;

    @ObfuscatedName("client.ck")
    public static int[] field486 = new int[250];

    @ObfuscatedName("client.cp")
    public static class160 field495 = new class160(5000);

    @ObfuscatedName("client.ch")
    public static class160 field347 = new class160(5000);

    @ObfuscatedName("client.ca")
    public static class160 field348 = new class160(15000);

    @ObfuscatedName("client.cc")
    public static int field349 = 0;

    @ObfuscatedName("client.cq")
    public static int field350 = 0;

    @ObfuscatedName("client.cm")
    public static int field351 = 0;

    @ObfuscatedName("client.ct")
    public static int field437 = 0;

    @ObfuscatedName("client.cb")
    public static int field353 = 0;

    @ObfuscatedName("client.cz")
    public static int field425 = 0;

    @ObfuscatedName("client.cu")
    public static int field355 = 0;

    @ObfuscatedName("client.cy")
    public static int field356 = 0;

    @ObfuscatedName("client.cj")
    public static boolean field518 = false;

    @ObfuscatedName("client.dr")
    public static int field358 = 0;

    @ObfuscatedName("client.ds")
    public static int field359 = 1;

    @ObfuscatedName("client.dy")
    public static int field360 = 0;

    @ObfuscatedName("client.dn")
    public static int field361 = 1;

    @ObfuscatedName("client.dp")
    public static int field536 = 0;

    @ObfuscatedName("client.de")
    public static boolean field364 = false;

    @ObfuscatedName("client.do")
    public static int[][][] field365 = new int[4][13][13];

    @ObfuscatedName("client.dg")
    public static final int[] field451 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dt")
    public static int field367 = 0;

    @ObfuscatedName("client.df")
    public static int field368 = 2;

    @ObfuscatedName("client.dm")
    public static int field574 = 0;

    @ObfuscatedName("client.en")
    public static int field520 = 2;

    @ObfuscatedName("client.ey")
    public static int field371 = 0;

    @ObfuscatedName("client.et")
    public static int field372 = 1;

    @ObfuscatedName("client.eg")
    public static int field373 = 0;

    @ObfuscatedName("client.el")
    public static int field374 = 0;

    @ObfuscatedName("client.ei")
    public static int field375 = 2;

    @ObfuscatedName("client.eq")
    public static int field376 = 0;

    @ObfuscatedName("client.ej")
    public static int field377 = 1;

    @ObfuscatedName("client.ea")
    public static int field549 = 0;

    @ObfuscatedName("client.ep")
    public static int field512 = 0;

    @ObfuscatedName("client.ek")
    public static int field380 = 2301979;

    @ObfuscatedName("client.eo")
    public static int field330 = 5063219;

    @ObfuscatedName("client.ev")
    public static int field382 = 3353893;

    @ObfuscatedName("client.ex")
    public static int field383 = 7759444;

    @ObfuscatedName("client.fx")
    public static boolean field322 = false;

    @ObfuscatedName("client.fh")
    public static int field366 = 0;

    @ObfuscatedName("client.fb")
    public static int field399 = 128;

    @ObfuscatedName("client.fl")
    public static int field387 = 0;

    @ObfuscatedName("client.fy")
    public static int field388 = 0;

    @ObfuscatedName("client.fe")
    public static int field389 = 0;

    @ObfuscatedName("client.fo")
    public static int field316 = 0;

    @ObfuscatedName("client.fk")
    public static int field318 = 0;

    @ObfuscatedName("client.fr")
    public static int field573 = 50;

    @ObfuscatedName("client.fq")
    public static int field487 = 0;

    @ObfuscatedName("client.fj")
    public static boolean field391 = false;

    @ObfuscatedName("client.fs")
    public static int field395 = 0;

    @ObfuscatedName("client.fi")
    public static int field396 = 0;

    @ObfuscatedName("client.fc")
    public static int field397 = 50;

    @ObfuscatedName("client.fz")
    public static int[] field398 = new int[field397];

    @ObfuscatedName("client.fp")
    public static int[] field381 = new int[field397];

    @ObfuscatedName("client.fg")
    public static int[] field400 = new int[field397];

    @ObfuscatedName("client.fn")
    public static int[] field445 = new int[field397];

    @ObfuscatedName("client.fv")
    public static int[] field402 = new int[field397];

    @ObfuscatedName("client.gb")
    public static int[] field533 = new int[field397];

    @ObfuscatedName("client.gi")
    public static int[] field404 = new int[field397];

    @ObfuscatedName("client.gp")
    public static String[] field405 = new String[field397];

    @ObfuscatedName("client.gg")
    public static int[][] field406 = new int[104][104];

    @ObfuscatedName("client.gr")
    public static int field338 = 0;

    @ObfuscatedName("client.ga")
    public static int field408 = -1;

    @ObfuscatedName("client.gj")
    public static int field409 = -1;

    @ObfuscatedName("client.gx")
    public static int field558 = 0;

    @ObfuscatedName("client.gt")
    public static int field411 = 0;

    @ObfuscatedName("client.gw")
    public static int field313 = 0;

    @ObfuscatedName("client.ge")
    public static int field413 = 0;

    @ObfuscatedName("client.gf")
    public static int field352 = 0;

    @ObfuscatedName("client.gz")
    public static int field453 = 0;

    @ObfuscatedName("client.gu")
    public static int field557 = 0;

    @ObfuscatedName("client.gv")
    public static int field339 = 0;

    @ObfuscatedName("client.gh")
    public static int field428 = 0;

    @ObfuscatedName("client.gl")
    public static int field419 = 0;

    @ObfuscatedName("client.gk")
    public static boolean field417 = false;

    @ObfuscatedName("client.gy")
    public static int field379 = 0;

    @ObfuscatedName("client.gd")
    public static int field422 = 0;

    @ObfuscatedName("client.gs")
    public static class24[] field423 = new class24[2048];

    @ObfuscatedName("client.hg")
    public static int field386 = -1;

    @ObfuscatedName("client.hr")
    public static int field314 = 0;

    @ObfuscatedName("client.hd")
    public static int field311 = 0;

    @ObfuscatedName("client.hq")
    public static int[] field427 = new int[1000];

    @ObfuscatedName("client.hz")
    public static final int[] field421 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hw")
    public static String[] field429 = new String[8];

    @ObfuscatedName("client.hk")
    public static boolean[] field430 = new boolean[8];

    @ObfuscatedName("client.hn")
    public static int[] field431 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hs")
    public static int field341 = -1;

    @ObfuscatedName("client.hm")
    public static class129[][][] field433 = new class129[4][104][104];

    @ObfuscatedName("client.hj")
    public static class129 field462 = new class129();

    @ObfuscatedName("client.hi")
    public static class129 field586 = new class129();

    @ObfuscatedName("client.hy")
    public static class129 field392 = new class129();

    @ObfuscatedName("client.hv")
    public static int[] field424 = new int[25];

    @ObfuscatedName("client.he")
    public static int[] field354 = new int[25];

    @ObfuscatedName("client.hu")
    public static int[] field439 = new int[25];

    @ObfuscatedName("client.hp")
    public static int field440 = 0;

    @ObfuscatedName("client.ho")
    public static boolean field441 = false;

    @ObfuscatedName("client.hb")
    public static int field442 = 0;

    @ObfuscatedName("client.in")
    public static int[] field443 = new int[500];

    @ObfuscatedName("client.ig")
    public static int[] field444 = new int[500];

    @ObfuscatedName("client.ie")
    public static int[] field524 = new int[500];

    @ObfuscatedName("client.id")
    public static int[] field446 = new int[500];

    @ObfuscatedName("client.ip")
    public static String[] field577 = new String[500];

    @ObfuscatedName("client.ii")
    public static String[] field448 = new String[500];

    @ObfuscatedName("client.iw")
    public static boolean field449 = false;

    @ObfuscatedName("client.ir")
    public static int field450 = -1;

    @ObfuscatedName("client.ic")
    public static boolean field418 = false;

    @ObfuscatedName("client.ib")
    public static int field452 = -1;

    @ObfuscatedName("client.im")
    public static int field332 = -1;

    @ObfuscatedName("client.ik")
    public static int field454 = 0;

    @ObfuscatedName("client.iy")
    public static int field370 = 50;

    @ObfuscatedName("client.io")
    public static int field456 = 0;

    @ObfuscatedName("client.it")
    public static String field458 = null;

    @ObfuscatedName("client.ih")
    public static boolean field459 = false;

    @ObfuscatedName("client.il")
    public static int field415 = -1;

    @ObfuscatedName("client.ia")
    public static int field461 = -1;

    @ObfuscatedName("client.jg")
    public static String field327 = null;

    @ObfuscatedName("client.jz")
    public static String field528 = null;

    @ObfuscatedName("client.jb")
    public static int field464 = -1;

    @ObfuscatedName("client.jv")
    public static class126 field554 = new class126(8);

    @ObfuscatedName("client.jl")
    public static int field466 = 0;

    @ObfuscatedName("client.jh")
    public static int field345 = 0;

    @ObfuscatedName("client.jp")
    public static class170 field468 = null;

    @ObfuscatedName("client.ja")
    public static int field469 = 0;

    @ObfuscatedName("client.jo")
    public static int field470 = 0;

    @ObfuscatedName("client.jj")
    public static int field471 = 0;

    @ObfuscatedName("client.jq")
    public static int field472 = -1;

    @ObfuscatedName("client.jd")
    public static boolean field369 = false;

    @ObfuscatedName("client.jm")
    public static boolean field474 = false;

    @ObfuscatedName("client.ju")
    public static boolean field475 = false;

    @ObfuscatedName("client.jt")
    public static class170 field476 = null;

    @ObfuscatedName("client.jw")
    public static class170 field477 = null;

    @ObfuscatedName("client.jk")
    public static class170 field478 = null;

    @ObfuscatedName("client.jx")
    public static int field479 = 0;

    @ObfuscatedName("client.jc")
    public static int field480 = 0;

    @ObfuscatedName("client.ji")
    public static class170 field481 = null;

    @ObfuscatedName("client.js")
    public static boolean field482 = false;

    @ObfuscatedName("client.jr")
    public static int field325 = -1;

    @ObfuscatedName("client.jf")
    public static int field484 = -1;

    @ObfuscatedName("client.jy")
    public static boolean field485 = false;

    @ObfuscatedName("client.jn")
    public static int field455 = -1;

    @ObfuscatedName("client.kx")
    public static int field492 = -1;

    @ObfuscatedName("client.kn")
    public static boolean field488 = false;

    @ObfuscatedName("client.ke")
    public static int field562 = 1;

    @ObfuscatedName("client.kl")
    public static int[] field490 = new int[32];

    @ObfuscatedName("client.kb")
    public static int field491 = 0;

    @ObfuscatedName("client.kd")
    public static int[] field385 = new int[32];

    @ObfuscatedName("client.ku")
    public static int field493 = 0;

    @ObfuscatedName("client.ky")
    public static int[] field494 = new int[32];

    @ObfuscatedName("client.kw")
    public static int field504 = 0;

    @ObfuscatedName("client.kz")
    public static int field496 = 0;

    @ObfuscatedName("client.ki")
    public static int field497 = 0;

    @ObfuscatedName("client.kv")
    public static int field498 = 0;

    @ObfuscatedName("client.kc")
    public static int field499 = 0;

    @ObfuscatedName("client.ko")
    public static int field500 = 0;

    @ObfuscatedName("client.kq")
    public static int field501 = 0;

    @ObfuscatedName("client.ks")
    public static int field539 = 0;

    @ObfuscatedName("client.ka")
    public static class129 field503 = new class129();

    @ObfuscatedName("client.kg")
    public static class129 field308 = new class129();

    @ObfuscatedName("client.lb")
    public static class129 field505 = new class129();

    @ObfuscatedName("client.ly")
    public static class126 field463 = new class126(512);

    @ObfuscatedName("client.ld")
    public static int field507 = 0;

    @ObfuscatedName("client.lg")
    public static int field508 = -2;

    @ObfuscatedName("client.ln")
    public static boolean[] field509 = new boolean[100];

    @ObfuscatedName("client.lk")
    public static boolean[] field426 = new boolean[100];

    @ObfuscatedName("client.ls")
    public static boolean[] field511 = new boolean[100];

    @ObfuscatedName("client.lj")
    public static int[] field300 = new int[100];

    @ObfuscatedName("client.lf")
    public static int[] field513 = new int[100];

    @ObfuscatedName("client.lh")
    public static int[] field514 = new int[100];

    @ObfuscatedName("client.ll")
    public static int[] field515 = new int[100];

    @ObfuscatedName("client.lq")
    public static int field516 = 0;

    @ObfuscatedName("client.lr")
    public static long field517 = 0L;

    @ObfuscatedName("client.li")
    public static boolean field390 = true;

    @ObfuscatedName("client.lw")
    public static int field363 = 1;

    @ObfuscatedName("client.lx")
    public static int field550 = 1;

    @ObfuscatedName("client.lo")
    public static int[] field521 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lc")
    public static int field522 = 0;

    @ObfuscatedName("client.le")
    public static int field523 = 0;

    @ObfuscatedName("client.lm")
    public static String field473 = "";

    @ObfuscatedName("client.mr")
    public static long[] field525 = new long[100];

    @ObfuscatedName("client.ml")
    public static int field526 = 0;

    @ObfuscatedName("client.me")
    public static int field346 = 0;

    @ObfuscatedName("client.mx")
    public static int[] field420 = new int[128];

    @ObfuscatedName("client.mp")
    public static int[] field529 = new int[128];

    @ObfuscatedName("client.mv")
    public static long field489 = -1L;

    @ObfuscatedName("client.md")
    public static String field531 = null;

    @ObfuscatedName("client.mo")
    public static String field416 = null;

    @ObfuscatedName("client.ms")
    public static int field460 = -1;

    @ObfuscatedName("client.mk")
    public static int field534 = 0;

    @ObfuscatedName("client.mw")
    public static int[] field535 = new int[1000];

    @ObfuscatedName("client.mq")
    public static int[] field436 = new int[1000];

    @ObfuscatedName("client.mz")
    public static class225[] field537 = new class225[1000];

    @ObfuscatedName("client.mh")
    public static int field538 = 0;

    @ObfuscatedName("client.mn")
    public static int field435 = 0;

    @ObfuscatedName("client.nn")
    public static int field540 = 0;

    @ObfuscatedName("client.ng")
    public static int field541 = 255;

    @ObfuscatedName("client.nd")
    public static int field542 = -1;

    @ObfuscatedName("client.ns")
    public static boolean field543 = false;

    @ObfuscatedName("client.nl")
    public static int field544 = 127;

    @ObfuscatedName("client.nt")
    public static int field545 = 127;

    @ObfuscatedName("client.nh")
    public static int field546 = 0;

    @ObfuscatedName("client.nv")
    public static int[] field547 = new int[50];

    @ObfuscatedName("client.nc")
    public static int[] field548 = new int[50];

    @ObfuscatedName("client.ne")
    public static int[] field335 = new int[50];

    @ObfuscatedName("client.nb")
    public static int[] field465 = new int[50];

    @ObfuscatedName("client.nw")
    public static class54[] field551 = new class54[50];

    @ObfuscatedName("client.nx")
    public static boolean field447 = false;

    @ObfuscatedName("client.oa")
    public static boolean[] field553 = new boolean[5];

    @ObfuscatedName("client.og")
    public static int[] field483 = new int[5];

    @ObfuscatedName("client.od")
    public static int[] field357 = new int[5];

    @ObfuscatedName("client.ol")
    public static int[] field384 = new int[5];

    @ObfuscatedName("client.or")
    public static int[] field414 = new int[5];

    @ObfuscatedName("client.oi")
    public static short field326 = 256;

    @ObfuscatedName("client.ot")
    public static short field559 = 205;

    @ObfuscatedName("client.os")
    public static short field560 = 256;

    @ObfuscatedName("client.oj")
    public static short field561 = 320;

    @ObfuscatedName("client.oh")
    public static short field506 = 1;

    @ObfuscatedName("client.oq")
    public static short field563 = 32767;

    @ObfuscatedName("client.oy")
    public static short field564 = 1;

    @ObfuscatedName("client.oz")
    public static short field565 = 32767;

    @ObfuscatedName("client.oo")
    public static int field566 = 0;

    @ObfuscatedName("client.ok")
    public static int field567 = 0;

    @ObfuscatedName("client.ou")
    public static int field568 = 0;

    @ObfuscatedName("client.ob")
    public static int field569 = 0;

    @ObfuscatedName("client.oe")
    public static int field570 = 0;

    @ObfuscatedName("client.oc")
    public static int field556 = 0;

    @ObfuscatedName("client.of")
    public static int field572 = 0;

    @ObfuscatedName("client.ph")
    public static class15[] field298 = new class15[400];

    @ObfuscatedName("client.pk")
    public static class131 field532 = new class131();

    @ObfuscatedName("client.pi")
    public static int field575 = 0;

    @ObfuscatedName("client.pt")
    public static class20[] field576 = new class20[400];

    @ObfuscatedName("client.pv")
    public static class167 field510 = new class167();

    @ObfuscatedName("client.pj")
    public static int field578 = -1;

    @ObfuscatedName("client.pz")
    public static int field299 = -1;

    @ObfuscatedName("client.pm")
    public static class5[] field580 = new class5[8];

    @ObfuscatedName("client.pu")
    public static long field519 = -1L;

    @ObfuscatedName("client.pd")
    public static long field582 = -1L;

    @ObfuscatedName("client.pg")
    public static final class23 field583 = new class23();

    @ObfuscatedName("client.pr")
    public static int[] field584 = new int[50];

    @ObfuscatedName("client.pe")
    public static int[] field585 = new int[50];

    @ObfuscatedName("client.r(I)V")
    public final void method288() {
    }

    public final void init() {
        if (!this.method2010()) {
            return;
        }
        class215[] var1 = new class215[] { class215.field3166, class215.field3168, class215.field3171, class215.field3165, class215.field3177, class215.field3172, class215.field3174, class215.field3169, class215.field3164, class215.field3175, class215.field3176, class215.field3173, class215.field3163, class215.field3170, class215.field3167 };
        class215[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class215 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3162);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3162)) {
                    case 1:
                        Statics.field378 = Integer.parseInt(var5);
                        break;
                    case 2:
                        field581 = Integer.parseInt(var5);
                    case 3:
                    case 5:
                    case 14:
                    default:
                        break;
                    case 4:
                        Statics.field114 = Integer.parseInt(var5);
                        break;
                    case 6:
                        Statics.field2134 = var5;
                        break;
                    case 7:
                        Statics.field781 = var5;
                        break;
                    case 8:
                        field301 = Integer.parseInt(var5);
                        break;
                    case 9:
                        if (var5.equalsIgnoreCase(class38.field810)) {
                        }
                        break;
                    case 10:
                        class180[] var6 = new class180[] { class180.field2705, class180.field2709, class180.field2706, class180.field2714, class180.field2712, class180.field2707 };
                        Statics.field305 = (class180) class149.method557(var6, Integer.parseInt(var5));
                        if (Statics.field305 == class180.field2709) {
                            Statics.field215 = class229.field3258;
                        } else {
                            Statics.field215 = class229.field3251;
                        }
                        break;
                    case 11:
                        Statics.field303 = class179.method906(Integer.parseInt(var5));
                        break;
                    case 12:
                        if (var5.equalsIgnoreCase(class38.field810)) {
                            field306 = true;
                        } else {
                            field306 = false;
                        }
                        break;
                    case 13:
                        field302 = Integer.parseInt(var5);
                        break;
                    case 15:
                        field309 = Integer.parseInt(var5);
                }
            }
        }
        method92();
        Statics.field34 = this.getCodeBase().getHost();
        String var7 = Statics.field303.field2701;
        byte var8 = 0;
        try {
            class105.method2198("oldschool", var7, var8, 16);
        } catch (Exception var10) {
            Statics.method1851((String) null, var10);
        }
        Statics.field434 = this;
        this.method2008(765, 503, 139);
    }

    @ObfuscatedName("m.l(I)V")
    public static final void method92() {
        class88.field1521 = false;
        field307 = false;
    }

    @ObfuscatedName("client.n(B)V")
    public final void method241() {
        Statics.field1672 = field581 == 0 ? 43594 : field301 + 40000;
        Statics.field5 = field581 == 0 ? 443 : field301 + 50000;
        Statics.field432 = Statics.field1672;
        Statics.field2191 = class168.field2206;
        Statics.field2192 = class168.field2202;
        Statics.field1447 = class168.field2203;
        Statics.field1322 = class168.field2204;
        class106.method140();
        Canvas var1 = Statics.field900;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class106.field1742);
        var1.addFocusListener(class106.field1742);
        class116.method1581(Statics.field900);
        class107 var2;
        try {
            var2 = new class107();
        } catch (Throwable var7) {
            var2 = null;
        }
        Statics.field1575 = var2;
        if (Statics.field1575 != null) {
            Statics.field1575.method1946(Statics.field900);
        }
        Statics.field696 = new class117(255, class105.field1714, class105.field1715, 500000);
        Statics.field2059 = Statics.method87();
        Statics.field2750 = this.getToolkit().getSystemClipboard();
        String var5 = Statics.field1496;
        class115.field1805 = this;
        class115.field1811 = var5;
        if (field581 != 0) {
            field319 = true;
        }
        int var6 = Statics.field2059.field715;
        field517 = 0L;
        if (var6 >= 2) {
            field390 = true;
        } else {
            field390 = false;
        }
        method2498();
        if (field362 >= 25) {
            method1843();
        }
        field1788 = true;
    }

    @ObfuscatedName("client.m(I)V")
    public final void method530() {
        field312++;
        this.method402();
        while (true) {
            class129 var1 = class184.field2747;
            class181 var2;
            synchronized (class184.field2747) {
                var2 = (class181) class184.field2746.method2324();
            }
            if (var2 == null) {
                try {
                    if (class139.field1941 == 1) {
                        int var4 = Statics.field1940.method2391();
                        if (var4 > 0 && Statics.field1940.method2392()) {
                            int var5 = var4 - Statics.field1938;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field1940.method2401(var5);
                        } else {
                            Statics.field1940.method2421();
                            Statics.field1940.method2394();
                            if (Statics.field2062 == null) {
                                class139.field1941 = 0;
                            } else {
                                class139.field1941 = 2;
                            }
                            Statics.field1945 = null;
                            Statics.field286 = null;
                        }
                    }
                } catch (Exception var140) {
                    var140.printStackTrace();
                    Statics.field1940.method2421();
                    class139.field1941 = 0;
                    Statics.field1945 = null;
                    Statics.field286 = null;
                    Statics.field2062 = null;
                }
                method593();
                class106 var7 = class106.field1742;
                synchronized (class106.field1742) {
                    class106.field1747++;
                    class106.field1743 = class106.field1727;
                    class106.field1746 = 0;
                    if (class106.field1744 >= 0) {
                        while (class106.field1744 != class106.field1737) {
                            int var9 = class106.field1736[class106.field1737];
                            class106.field1737 = class106.field1737 + 1 & 0x7F;
                            if (var9 < 0) {
                                class106.field1735[~var9] = false;
                            } else {
                                if (!class106.field1735[var9] && class106.field1746 < class106.field1741.length - 1) {
                                    class106.field1741[++class106.field1746 - 1] = var9;
                                }
                                class106.field1735[var9] = true;
                            }
                        }
                    } else {
                        for (int var8 = 0; var8 < 112; var8++) {
                            class106.field1735[var8] = false;
                        }
                        class106.field1744 = class106.field1737;
                    }
                    if (class106.field1746 > 0) {
                        class106.field1747 = 0;
                    }
                    class106.field1727 = class106.field1738;
                }
                class116.method3374();
                if (Statics.field1575 != null) {
                    int var11 = Statics.field1575.method1948();
                    field539 = var11;
                }
                if (field362 == 0) {
                    method66();
                    class114.method1479();
                } else if (field362 == 5) {
                    class42.method2863(this);
                    method66();
                    class114.method1479();
                } else if (field362 == 10 || field362 == 11) {
                    class42.method2863(this);
                } else if (field362 == 20) {
                    class42.method2863(this);
                    method152();
                } else if (field362 == 25) {
                    method264();
                }
                if (field362 == 30) {
                    if (field320 > 1) {
                        field320--;
                    }
                    if (field356 > 0) {
                        field356--;
                    }
                    if (field518) {
                        field518 = false;
                        method1964();
                    } else {
                        if (!field441) {
                            method749();
                            field577[0] = class174.field2612;
                            field448[0] = "";
                            field524[0] = 1006;
                            field442 = 1;
                        }
                        for (int var12 = 0; var12 < 100 && method146(); var12++) {
                        }
                        if (field362 == 30) {
                            while (true) {
                                class227 var13 = (class227) class228.field3245.method2279();
                                boolean var14;
                                if (var13 == null) {
                                    var14 = false;
                                } else {
                                    var14 = true;
                                }
                                if (!var14) {
                                    Object var16 = Statics.field401.field228;
                                    synchronized (Statics.field401.field228) {
                                        if (!field552) {
                                            Statics.field401.field235 = 0;
                                        } else if (class116.field1824 != 0 || Statics.field401.field235 >= 40) {
                                            field495.method2889(166);
                                            field495.method2651(0);
                                            int var17 = field495.field2111;
                                            int var18 = 0;
                                            for (int var19 = 0; var19 < Statics.field401.field235 && field495.field2111 - var17 < 240; var19++) {
                                                var18++;
                                                int var20 = Statics.field401.field227[var19];
                                                if (var20 < 0) {
                                                    var20 = 0;
                                                } else if (var20 > 502) {
                                                    var20 = 502;
                                                }
                                                int var21 = Statics.field401.field230[var19];
                                                if (var21 < 0) {
                                                    var21 = 0;
                                                } else if (var21 > 764) {
                                                    var21 = 764;
                                                }
                                                int var22 = var20 * 765 + var21;
                                                if (Statics.field401.field227[var19] == -1 && Statics.field401.field230[var19] == -1) {
                                                    var21 = -1;
                                                    var20 = -1;
                                                    var22 = 524287;
                                                }
                                                if (field315 != var21 || field310 != var20) {
                                                    int var23 = var21 - field315;
                                                    field315 = var21;
                                                    int var24 = var20 - field310;
                                                    field310 = var20;
                                                    if (field317 < 8 && var23 >= -32 && var23 <= 31 && var24 >= -32 && var24 <= 31) {
                                                        var23 += 32;
                                                        var24 += 32;
                                                        field495.method2793((field317 << 12) + (var23 << 6) + var24);
                                                        field317 = 0;
                                                    } else if (field317 < 8) {
                                                        field495.method2752((field317 << 19) + 8388608 + var22);
                                                        field317 = 0;
                                                    } else {
                                                        field495.method2654((field317 << 19) + -1073741824 + var22);
                                                        field317 = 0;
                                                    }
                                                } else if (field317 < 2047) {
                                                    field317++;
                                                }
                                            }
                                            field495.method2663(field495.field2111 - var17);
                                            if (var18 >= Statics.field401.field235) {
                                                Statics.field401.field235 = 0;
                                            } else {
                                                Statics.field401.field235 -= var18;
                                                for (int var25 = 0; var25 < Statics.field401.field235; var25++) {
                                                    Statics.field401.field230[var25] = Statics.field401.field230[var18 + var25];
                                                    Statics.field401.field227[var25] = Statics.field401.field227[var18 + var25];
                                                }
                                            }
                                        }
                                    }
                                    if (class116.field1824 == 1 || !Statics.field2688 && class116.field1824 == 4 || class116.field1824 == 2) {
                                        long var27 = (class116.field1827 - field340 * -1L) / 50L;
                                        if (var27 > 4095L) {
                                            var27 = 4095L;
                                        }
                                        field340 = class116.field1827 * -1L;
                                        int var29 = class116.field1814;
                                        if (var29 < 0) {
                                            var29 = 0;
                                        } else if (var29 > Statics.field2208) {
                                            var29 = Statics.field2208;
                                        }
                                        int var30 = class116.field1826;
                                        if (var30 < 0) {
                                            var30 = 0;
                                        } else if (var30 > Statics.field756) {
                                            var30 = Statics.field756;
                                        }
                                        int var31 = (int) var27;
                                        field495.method2889(241);
                                        field495.method2793((class116.field1824 == 2 ? 1 : 0) + (var31 << 1));
                                        field495.method2793(var30);
                                        field495.method2793(var29);
                                    }
                                    if (class106.field1746 > 0) {
                                        field495.method2889(223);
                                        field495.method2793(0);
                                        int var32 = field495.field2111;
                                        long var33 = class156.method848();
                                        for (int var35 = 0; var35 < class106.field1746; var35++) {
                                            long var36 = var33 - field489;
                                            if (var36 > 16777215L) {
                                                var36 = 16777215L;
                                            }
                                            field489 = var33;
                                            field495.method2690(class106.field1741[var35]);
                                            field495.method2822((int) var36);
                                        }
                                        field495.method2847(field495.field2111 - var32);
                                    }
                                    if (field487 > 0) {
                                        field487--;
                                    }
                                    if (class106.field1735[96] || class106.field1735[97] || class106.field1735[98] || class106.field1735[99]) {
                                        field391 = true;
                                    }
                                    if (field391 && field487 <= 0) {
                                        field487 = 20;
                                        field391 = false;
                                        field495.method2889(162);
                                        field495.method2699(field399);
                                        field495.method2793(field387);
                                    }
                                    if (Statics.field1804 && !field555) {
                                        field555 = true;
                                        field495.method2889(90);
                                        field495.method2651(1);
                                    }
                                    if (!Statics.field1804 && field555) {
                                        field555 = false;
                                        field495.method2889(90);
                                        field495.method2651(0);
                                    }
                                    method1326();
                                    if (field362 == 30) {
                                        for (class26 var38 = (class26) field462.method2301(); var38 != null; var38 = (class26) field462.method2309()) {
                                            if (var38.field599 > 0) {
                                                var38.field599--;
                                            }
                                            if (var38.field599 == 0) {
                                                if (var38.field592 >= 0) {
                                                    int var39 = var38.field592;
                                                    int var40 = var38.field594;
                                                    class198 var41 = class198.method2502(var39);
                                                    if (var40 == 11) {
                                                        var40 = 10;
                                                    }
                                                    if (var40 >= 5 && var40 <= 8) {
                                                        var40 = 4;
                                                    }
                                                    boolean var42 = var41.method3417(var40);
                                                    if (!var42) {
                                                        continue;
                                                    }
                                                }
                                                method137(var38.field602, var38.field589, var38.field600, var38.field598, var38.field592, var38.field593, var38.field594);
                                                var38.method2289();
                                            } else {
                                                if (var38.field590 > 0) {
                                                    var38.field590--;
                                                }
                                                if (var38.field590 == 0 && var38.field600 >= 1 && var38.field598 >= 1 && var38.field600 <= 102 && var38.field598 <= 102) {
                                                    if (var38.field595 >= 0) {
                                                        int var43 = var38.field595;
                                                        int var44 = var38.field597;
                                                        class198 var45 = class198.method2502(var43);
                                                        if (var44 == 11) {
                                                            var44 = 10;
                                                        }
                                                        if (var44 >= 5 && var44 <= 8) {
                                                            var44 = 4;
                                                        }
                                                        boolean var46 = var45.method3417(var44);
                                                        if (!var46) {
                                                            continue;
                                                        }
                                                    }
                                                    method137(var38.field602, var38.field589, var38.field600, var38.field598, var38.field595, var38.field588, var38.field597);
                                                    var38.field590 = -1;
                                                    if (var38.field595 == var38.field592 && var38.field592 == -1) {
                                                        var38.method2289();
                                                    } else if (var38.field595 == var38.field592 && var38.field593 == var38.field588 && var38.field597 == var38.field594) {
                                                        var38.method2289();
                                                    }
                                                }
                                            }
                                        }
                                        method145();
                                        field351++;
                                        if (field351 > 750) {
                                            method1964();
                                        } else {
                                            method3599();
                                            for (int var47 = 0; var47 < field403; var47++) {
                                                int var48 = field343[var47];
                                                class36 var49 = field412[var48];
                                                if (var49 != null) {
                                                    Statics.method556(var49, var49.field783.field3012);
                                                }
                                            }
                                            method1945();
                                            field512++;
                                            if (field413 != 0) {
                                                field313 += 20;
                                                if (field313 >= 400) {
                                                    field413 = 0;
                                                }
                                            }
                                            if (Statics.field43 != null) {
                                                field352++;
                                                if (field352 >= 15) {
                                                    method198(Statics.field43);
                                                    Statics.field43 = null;
                                                }
                                            }
                                            class170 var50 = Statics.field2086;
                                            class170 var51 = Statics.field191;
                                            Statics.field2086 = null;
                                            Statics.field191 = null;
                                            field481 = null;
                                            field485 = false;
                                            field482 = false;
                                            field346 = 0;
                                            while (true) {
                                                while (class106.method1404() && field346 < 128) {
                                                    if (field471 >= 2 && class106.field1735[82] && Statics.field3085 == 66) {
                                                        String var52 = class48.method2925();
                                                        Statics.field2750.setContents(new StringSelection(var52), (ClipboardOwner) null);
                                                    } else {
                                                        field529[field346] = Statics.field3085;
                                                        field420[field346] = Statics.field811;
                                                        field346++;
                                                    }
                                                }
                                                if (field464 != -1) {
                                                    int var53 = field464;
                                                    int var54 = Statics.field756;
                                                    int var55 = Statics.field2208;
                                                    if (class170.method179(var53)) {
                                                        method559(Statics.field2240[var53], -1, 0, 0, var54, var55, 0, 0);
                                                    }
                                                }
                                                field562++;
                                                while (true) {
                                                    class19 var56;
                                                    class170 var57;
                                                    class170 var58;
                                                    do {
                                                        var56 = (class19) field308.method2324();
                                                        if (var56 == null) {
                                                            while (true) {
                                                                class19 var59;
                                                                class170 var60;
                                                                class170 var61;
                                                                do {
                                                                    var59 = (class19) field505.method2324();
                                                                    if (var59 == null) {
                                                                        while (true) {
                                                                            class19 var62;
                                                                            class170 var63;
                                                                            class170 var64;
                                                                            do {
                                                                                var62 = (class19) field503.method2324();
                                                                                if (var62 == null) {
                                                                                    method640();
                                                                                    if (Statics.field2178 == null && field477 == null) {
                                                                                        int var65 = class116.field1824;
                                                                                        if (field441) {
                                                                                            if (var65 != 1 && (Statics.field2688 || var65 != 4)) {
                                                                                                int var66 = class116.field1818;
                                                                                                int var67 = class116.field1819;
                                                                                                if (var66 < Statics.field710 - 10 || var66 > Statics.field710 + Statics.field2356 + 10 || var67 < Statics.field1718 - 10 || var67 > Statics.field1718 + Statics.field1659 + 10) {
                                                                                                    field441 = false;
                                                                                                    method2378(Statics.field710, Statics.field1718, Statics.field2356, Statics.field1659);
                                                                                                }
                                                                                            }
                                                                                            if (var65 == 1 || !Statics.field2688 && var65 == 4) {
                                                                                                int var68 = Statics.field710;
                                                                                                int var69 = Statics.field1718;
                                                                                                int var70 = Statics.field2356;
                                                                                                int var71 = class116.field1826;
                                                                                                int var72 = class116.field1814;
                                                                                                int var73 = -1;
                                                                                                for (int var74 = 0; var74 < field442; var74++) {
                                                                                                    int var75 = (field442 - 1 - var74) * 15 + var69 + 31;
                                                                                                    if (var71 > var68 && var71 < var68 + var70 && var72 > var75 - 13 && var72 < var75 + 3) {
                                                                                                        var73 = var74;
                                                                                                    }
                                                                                                }
                                                                                                if (var73 != -1 && var73 >= 0) {
                                                                                                    int var76 = field443[var73];
                                                                                                    int var77 = field444[var73];
                                                                                                    int var78 = field524[var73];
                                                                                                    int var79 = field446[var73];
                                                                                                    String var80 = field577[var73];
                                                                                                    String var81 = field448[var73];
                                                                                                    method813(var76, var77, var78, var79, var80, var81, class116.field1826, class116.field1814);
                                                                                                }
                                                                                                field441 = false;
                                                                                                method2378(Statics.field710, Statics.field1718, Statics.field2356, Statics.field1659);
                                                                                            }
                                                                                        } else {
                                                                                            label1213: {
                                                                                                int var82 = method632();
                                                                                                if ((var65 == 1 || !Statics.field2688 && var65 == 4) && var82 >= 0) {
                                                                                                    int var83 = field524[var82];
                                                                                                    if (var83 == 39 || var83 == 40 || var83 == 41 || var83 == 42 || var83 == 43 || var83 == 33 || var83 == 34 || var83 == 35 || var83 == 36 || var83 == 37 || var83 == 38 || var83 == 1005) {
                                                                                                        label1201: {
                                                                                                            int var84 = field443[var82];
                                                                                                            int var85 = field444[var82];
                                                                                                            class170 var86 = Statics.method1837(var85);
                                                                                                            int var87 = method3309(var86);
                                                                                                            boolean var88 = (var87 >> 28 & 0x1) != 0;
                                                                                                            if (!var88) {
                                                                                                                int var89 = method3309(var86);
                                                                                                                boolean var90 = (var89 >> 29 & 0x1) != 0;
                                                                                                                if (!var90) {
                                                                                                                    break label1201;
                                                                                                                }
                                                                                                            }
                                                                                                            if (Statics.field2178 != null && !field417) {
                                                                                                                int var91 = method632();
                                                                                                                if (field440 != 1 && !Statics.method3109(var91) && field442 > 0) {
                                                                                                                    int var92 = field339;
                                                                                                                    int var93 = field428;
                                                                                                                    class39 var94 = Statics.field1646;
                                                                                                                    method813(var94.field821, var94.field817, var94.field818, var94.field819, var94.field820, var94.field820, var92, var93);
                                                                                                                    Statics.field1646 = null;
                                                                                                                }
                                                                                                            }
                                                                                                            field417 = false;
                                                                                                            field379 = 0;
                                                                                                            if (Statics.field2178 != null) {
                                                                                                                method198(Statics.field2178);
                                                                                                            }
                                                                                                            Statics.field2178 = Statics.method1837(var85);
                                                                                                            field557 = var84;
                                                                                                            field339 = class116.field1826;
                                                                                                            field428 = class116.field1814;
                                                                                                            if (var82 >= 0) {
                                                                                                                Statics.field1646 = new class39();
                                                                                                                Statics.field1646.field821 = field443[var82];
                                                                                                                Statics.field1646.field817 = field444[var82];
                                                                                                                Statics.field1646.field818 = field524[var82];
                                                                                                                Statics.field1646.field819 = field446[var82];
                                                                                                                Statics.field1646.field820 = field577[var82];
                                                                                                            }
                                                                                                            method198(Statics.field2178);
                                                                                                            break label1213;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if ((var65 == 1 || !Statics.field2688 && var65 == 4) && (field440 == 1 && field442 > 2 && !method3271() || Statics.method3109(var82))) {
                                                                                                    var65 = 2;
                                                                                                }
                                                                                                if ((var65 == 1 || !Statics.field2688 && var65 == 4) && field442 > 0 && var82 >= 0) {
                                                                                                    int var95 = field443[var82];
                                                                                                    int var96 = field444[var82];
                                                                                                    int var97 = field524[var82];
                                                                                                    int var98 = field446[var82];
                                                                                                    String var99 = field577[var82];
                                                                                                    String var100 = field448[var82];
                                                                                                    method813(var95, var96, var97, var98, var99, var100, class116.field1826, class116.field1814);
                                                                                                }
                                                                                                if (var65 == 2 && field442 > 0) {
                                                                                                    method802(class116.field1826, class116.field1814);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (field477 != null) {
                                                                                        method2574();
                                                                                    }
                                                                                    if (Statics.field2178 != null) {
                                                                                        method198(Statics.field2178);
                                                                                        field379++;
                                                                                        if (class116.field1812 == 0) {
                                                                                            if (!field417) {
                                                                                                int var109 = method632();
                                                                                                if (field442 > 2 && !(field440 != 1 || method3271()) || Statics.method3109(var109)) {
                                                                                                    method802(field339, field428);
                                                                                                } else if (field442 > 0) {
                                                                                                    int var110 = field339;
                                                                                                    int var111 = field428;
                                                                                                    class39 var112 = Statics.field1646;
                                                                                                    method813(var112.field821, var112.field817, var112.field818, var112.field819, var112.field820, var112.field820, var110, var111);
                                                                                                    Statics.field1646 = null;
                                                                                                }
                                                                                            } else if (Statics.field2178 == Statics.field2161 && field557 != field419) {
                                                                                                class170 var101 = Statics.field2178;
                                                                                                byte var102 = 0;
                                                                                                if (field345 == 1 && var101.field2326 == 206) {
                                                                                                    var102 = 1;
                                                                                                }
                                                                                                if (var101.field2257[field419] <= 0) {
                                                                                                    var102 = 0;
                                                                                                }
                                                                                                int var103 = method3309(var101);
                                                                                                boolean var104 = (var103 >> 29 & 0x1) != 0;
                                                                                                if (var104) {
                                                                                                    int var105 = field557;
                                                                                                    int var106 = field419;
                                                                                                    var101.field2257[var106] = var101.field2257[var105];
                                                                                                    var101.field2339[var106] = var101.field2339[var105];
                                                                                                    var101.field2257[var105] = -1;
                                                                                                    var101.field2339[var105] = 0;
                                                                                                } else if (var102 == 1) {
                                                                                                    int var107 = field557;
                                                                                                    int var108 = field419;
                                                                                                    while (var107 != var108) {
                                                                                                        if (var107 > var108) {
                                                                                                            var101.method3044(var107 - 1, var107);
                                                                                                            var107--;
                                                                                                        } else if (var107 < var108) {
                                                                                                            var101.method3044(var107 + 1, var107);
                                                                                                            var107++;
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    var101.method3044(field419, field557);
                                                                                                }
                                                                                                field495.method2889(54);
                                                                                                field495.method2699(field419);
                                                                                                field495.method2699(field557);
                                                                                                field495.method2692(var102);
                                                                                                field495.method2749(Statics.field2178.field2274);
                                                                                            }
                                                                                            field352 = 10;
                                                                                            class116.field1824 = 0;
                                                                                            Statics.field2178 = null;
                                                                                        } else if (field379 >= 5 && (class116.field1818 > field339 + 5 || class116.field1818 < field339 - 5 || class116.field1819 > field428 + 5 || class116.field1819 < field428 - 5)) {
                                                                                            field417 = true;
                                                                                        }
                                                                                    }
                                                                                    if (class88.method1688()) {
                                                                                        int var113 = class88.field1533;
                                                                                        int var114 = class88.field1534;
                                                                                        field495.method2889(11);
                                                                                        field495.method2651(5);
                                                                                        field495.method2692(class106.field1735[82] ? (class106.field1735[81] ? 2 : 1) : 0);
                                                                                        field495.method2699(Statics.field2792 + var114);
                                                                                        field495.method2694(Statics.field1880 + var113);
                                                                                        class88.method1689();
                                                                                        field558 = class116.field1826;
                                                                                        field411 = class116.field1814;
                                                                                        field413 = 1;
                                                                                        field313 = 0;
                                                                                        field538 = var113;
                                                                                        field435 = var114;
                                                                                    }
                                                                                    if (Statics.field2086 != var50) {
                                                                                        if (var50 != null) {
                                                                                            method198(var50);
                                                                                        }
                                                                                        if (Statics.field2086 != null) {
                                                                                            method198(Statics.field2086);
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field191 != var51 && field454 == field370) {
                                                                                        if (var51 != null) {
                                                                                            method198(var51);
                                                                                        }
                                                                                        if (Statics.field191 != null) {
                                                                                            method198(Statics.field191);
                                                                                        }
                                                                                    }
                                                                                    if (Statics.field191 == null) {
                                                                                        if (field454 > 0) {
                                                                                            field454--;
                                                                                        }
                                                                                    } else if (field454 < field370) {
                                                                                        field454++;
                                                                                        if (field454 == field370) {
                                                                                            method198(Statics.field191);
                                                                                        }
                                                                                    }
                                                                                    method1842();
                                                                                    if (field447) {
                                                                                        int var115 = Statics.field173 * 128 + 64;
                                                                                        int var116 = Statics.field255 * 128 + 64;
                                                                                        int var117 = method1906(var115, var116, Statics.field3063) - Statics.field217;
                                                                                        if (Statics.field245 < var115) {
                                                                                            Statics.field245 += Statics.field55 * (var115 - Statics.field245) / 1000 + Statics.field3110;
                                                                                            if (Statics.field245 > var115) {
                                                                                                Statics.field245 = var115;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field245 > var115) {
                                                                                            Statics.field245 -= Statics.field55 * (Statics.field245 - var115) / 1000 + Statics.field3110;
                                                                                            if (Statics.field245 < var115) {
                                                                                                Statics.field245 = var115;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field186 < var117) {
                                                                                            Statics.field186 += Statics.field55 * (var117 - Statics.field186) / 1000 + Statics.field3110;
                                                                                            if (Statics.field186 > var117) {
                                                                                                Statics.field186 = var117;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field186 > var117) {
                                                                                            Statics.field186 -= Statics.field55 * (Statics.field186 - var117) / 1000 + Statics.field3110;
                                                                                            if (Statics.field186 < var117) {
                                                                                                Statics.field186 = var117;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field1628 < var116) {
                                                                                            Statics.field1628 += Statics.field55 * (var116 - Statics.field1628) / 1000 + Statics.field3110;
                                                                                            if (Statics.field1628 > var116) {
                                                                                                Statics.field1628 = var116;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field1628 > var116) {
                                                                                            Statics.field1628 -= Statics.field55 * (Statics.field1628 - var116) / 1000 + Statics.field3110;
                                                                                            if (Statics.field1628 < var116) {
                                                                                                Statics.field1628 = var116;
                                                                                            }
                                                                                        }
                                                                                        int var118 = Statics.field1840 * 128 + 64;
                                                                                        int var119 = Statics.field901 * 128 + 64;
                                                                                        int var120 = method1906(var118, var119, Statics.field3063) - Statics.field2034;
                                                                                        int var121 = var118 - Statics.field245;
                                                                                        int var122 = var120 - Statics.field186;
                                                                                        int var123 = var119 - Statics.field1628;
                                                                                        int var124 = (int) Math.sqrt((double) (var121 * var121 + var123 * var123));
                                                                                        int var125 = (int) (Math.atan2((double) var122, (double) var124) * 325.949D) & 0x7FF;
                                                                                        int var126 = (int) (Math.atan2((double) var121, (double) var123) * -325.949D) & 0x7FF;
                                                                                        if (var125 < 128) {
                                                                                            var125 = 128;
                                                                                        }
                                                                                        if (var125 > 383) {
                                                                                            var125 = 383;
                                                                                        }
                                                                                        if (Statics.field182 < var125) {
                                                                                            Statics.field182 += Statics.field814 * (var125 - Statics.field182) / 1000 + Statics.field2196;
                                                                                            if (Statics.field182 > var125) {
                                                                                                Statics.field182 = var125;
                                                                                            }
                                                                                        }
                                                                                        if (Statics.field182 > var125) {
                                                                                            Statics.field182 -= Statics.field814 * (Statics.field182 - var125) / 1000 + Statics.field2196;
                                                                                            if (Statics.field182 < var125) {
                                                                                                Statics.field182 = var125;
                                                                                            }
                                                                                        }
                                                                                        int var127 = var126 - Statics.field83;
                                                                                        if (var127 > 1024) {
                                                                                            var127 -= 2048;
                                                                                        }
                                                                                        if (var127 < -1024) {
                                                                                            var127 += 2048;
                                                                                        }
                                                                                        if (var127 > 0) {
                                                                                            Statics.field83 += Statics.field814 * var127 / 1000 + Statics.field2196;
                                                                                            Statics.field83 &= 0x7FF;
                                                                                        }
                                                                                        if (var127 < 0) {
                                                                                            Statics.field83 -= Statics.field814 * -var127 / 1000 + Statics.field2196;
                                                                                            Statics.field83 &= 0x7FF;
                                                                                        }
                                                                                        int var128 = var126 - Statics.field83;
                                                                                        if (var128 > 1024) {
                                                                                            var128 -= 2048;
                                                                                        }
                                                                                        if (var128 < -1024) {
                                                                                            var128 += 2048;
                                                                                        }
                                                                                        if (var128 < 0 && var127 > 0 || var128 > 0 && var127 < 0) {
                                                                                            Statics.field83 = var126;
                                                                                        }
                                                                                    }
                                                                                    for (int var129 = 0; var129 < 5; var129++) {
                                                                                        int var10002 = field414[var129]++;
                                                                                    }
                                                                                    Statics.field78.method859();
                                                                                    int var130 = class116.method2565();
                                                                                    int var131 = class106.method176();
                                                                                    if (var130 > 15000 && var131 > 15000) {
                                                                                        field356 = 250;
                                                                                        class116.method585(14500);
                                                                                        field495.method2889(140);
                                                                                    }
                                                                                    field373++;
                                                                                    if (field373 > 500) {
                                                                                        field373 = 0;
                                                                                        int var132 = (int) (Math.random() * 8.0D);
                                                                                        if ((var132 & 0x1) == 1) {
                                                                                            field367 += field368;
                                                                                        }
                                                                                        if ((var132 & 0x2) == 2) {
                                                                                            field574 += field520;
                                                                                        }
                                                                                        if ((var132 & 0x4) == 4) {
                                                                                            field371 += field372;
                                                                                        }
                                                                                    }
                                                                                    if (field367 < -50) {
                                                                                        field368 = 2;
                                                                                    }
                                                                                    if (field367 > 50) {
                                                                                        field368 = -2;
                                                                                    }
                                                                                    if (field574 < -55) {
                                                                                        field520 = 2;
                                                                                    }
                                                                                    if (field574 > 55) {
                                                                                        field520 = -2;
                                                                                    }
                                                                                    if (field371 < -40) {
                                                                                        field372 = 1;
                                                                                    }
                                                                                    if (field371 > 40) {
                                                                                        field372 = -1;
                                                                                    }
                                                                                    field549++;
                                                                                    if (field549 > 500) {
                                                                                        field549 = 0;
                                                                                        int var133 = (int) (Math.random() * 8.0D);
                                                                                        if ((var133 & 0x1) == 1) {
                                                                                            field374 += field375;
                                                                                        }
                                                                                        if ((var133 & 0x2) == 2) {
                                                                                            field376 += field377;
                                                                                        }
                                                                                    }
                                                                                    if (field374 < -60) {
                                                                                        field375 = 2;
                                                                                    }
                                                                                    if (field374 > 60) {
                                                                                        field375 = -2;
                                                                                    }
                                                                                    if (field376 < -20) {
                                                                                        field377 = 1;
                                                                                    }
                                                                                    if (field376 > 10) {
                                                                                        field377 = -1;
                                                                                    }
                                                                                    for (class17 var134 = (class17) field532.method2336(); var134 != null; var134 = (class17) field532.method2337()) {
                                                                                        if ((long) var134.field184 < class156.method848() / 1000L - 5L) {
                                                                                            if (var134.field183 > 0) {
                                                                                                class48.method225(5, "", var134.field179 + class174.field2520);
                                                                                            }
                                                                                            if (var134.field183 == 0) {
                                                                                                class48.method225(5, "", var134.field179 + class174.field2475);
                                                                                            }
                                                                                            var134.method2348();
                                                                                        }
                                                                                    }
                                                                                    field437++;
                                                                                    if (field437 > 50) {
                                                                                        field495.method2889(210);
                                                                                    }
                                                                                    try {
                                                                                        if (Statics.field234 != null && field495.field2111 > 0) {
                                                                                            Statics.field234.method1978(field495.field2114, 0, field495.field2111);
                                                                                            field495.field2111 = 0;
                                                                                            field437 = 0;
                                                                                            return;
                                                                                        }
                                                                                    } catch (IOException var136) {
                                                                                        method1964();
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                var63 = var62.field208;
                                                                                if (var63.field2221 < 0) {
                                                                                    break;
                                                                                }
                                                                                var64 = Statics.method1837(var63.field2239);
                                                                            } while (var64 == null || var64.field2344 == null || var63.field2221 >= var64.field2344.length || var64.field2344[var63.field2221] != var63);
                                                                            class33.method566(var62);
                                                                        }
                                                                    }
                                                                    var60 = var59.field208;
                                                                    if (var60.field2221 < 0) {
                                                                        break;
                                                                    }
                                                                    var61 = Statics.method1837(var60.field2239);
                                                                } while (var61 == null || var61.field2344 == null || var60.field2221 >= var61.field2344.length || var61.field2344[var60.field2221] != var60);
                                                                class33.method566(var59);
                                                            }
                                                        }
                                                        var57 = var56.field208;
                                                        if (var57.field2221 < 0) {
                                                            break;
                                                        }
                                                        var58 = Statics.method1837(var57.field2239);
                                                    } while (var58 == null || var58.field2344 == null || var57.field2221 >= var58.field2344.length || var58.field2344[var57.field2221] != var57);
                                                    class33.method566(var56);
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                                field495.method2889(152);
                                field495.method2651(0);
                                int var15 = field495.field2111;
                                class228.method3102(field495);
                                field495.method2663(field495.field2111 - var15);
                            }
                        }
                    }
                } else if (field362 == 40 || field362 == 45) {
                    method152();
                }
                return;
            }
            var2.field2715.method3203(var2.field2717, (int) var2.field1905, var2.field2716, false);
        }
    }

    @ObfuscatedName("client.w(I)V")
    public final void method243() {
        boolean var1 = class139.method1134();
        if (var1 && field543 && Statics.field24 != null) {
            Statics.field24.method1062();
        }
        if (field362 == 10 || field362 == 20 || field362 == 30) {
            if (field517 != 0L && class156.method848() > field517) {
                int var2 = field390 ? 2 : 1;
                field517 = 0L;
                if (var2 >= 2) {
                    field390 = true;
                } else {
                    field390 = false;
                }
                method2498();
                if (field362 >= 25) {
                    method1843();
                }
                field1788 = true;
            } else if (field1795) {
                method1966();
            }
        }
        Dimension var3 = this.method2020();
        if (Statics.field683 != var3.width || Statics.field759 != var3.height || field1798) {
            method2498();
            field517 = class156.method848() + 500L;
            field1798 = false;
        }
        boolean var4 = false;
        if (field1788) {
            field1788 = false;
            var4 = true;
            for (int var5 = 0; var5 < 100; var5++) {
                field509[var5] = true;
            }
        }
        if (var4) {
            method1354();
        }
        if (field362 == 0) {
            int var6 = class42.field852;
            String var7 = class42.field853;
            Color var8 = null;
            try {
                Graphics var9 = Statics.field900.getGraphics();
                if (Statics.field1781 == null) {
                    Statics.field1781 = new Font("Helvetica", 1, 13);
                    Statics.field254 = Statics.field900.getFontMetrics(Statics.field1781);
                }
                if (var4) {
                    var9.setColor(Color.black);
                    var9.fillRect(0, 0, Statics.field756, Statics.field2208);
                }
                if (var8 == null) {
                    var8 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field144 == null) {
                        Statics.field144 = Statics.field900.createImage(304, 34);
                    }
                    Graphics var10 = Statics.field144.getGraphics();
                    var10.setColor(var8);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, var6 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(var6 * 3 + 2, 2, 300 - var6 * 3, 30);
                    var10.setFont(Statics.field1781);
                    var10.setColor(Color.white);
                    var10.drawString(var7, (304 - Statics.field254.stringWidth(var7)) / 2, 22);
                    var9.drawImage(Statics.field144, Statics.field756 / 2 - 152, Statics.field2208 / 2 - 18, (ImageObserver) null);
                } catch (Exception var23) {
                    int var12 = Statics.field756 / 2 - 152;
                    int var13 = Statics.field2208 / 2 - 18;
                    var9.setColor(var8);
                    var9.drawRect(var12, var13, 303, 33);
                    var9.fillRect(var12 + 2, var13 + 2, var6 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(var12 + 1, var13 + 1, 301, 31);
                    var9.fillRect(var6 * 3 + var12 + 2, var13 + 2, 300 - var6 * 3, 30);
                    var9.setFont(Statics.field1781);
                    var9.setColor(Color.white);
                    var9.drawString(var7, var12 + (304 - Statics.field254.stringWidth(var7)) / 2, var13 + 22);
                }
            } catch (Exception var24) {
                Statics.field900.repaint();
            }
        } else if (field362 == 5) {
            class42.method3101(Statics.field1120, Statics.field2718, Statics.field283, var4);
        } else if (field362 == 10 || field362 == 11) {
            class42.method3101(Statics.field1120, Statics.field2718, Statics.field283, var4);
        } else if (field362 == 20) {
            class42.method3101(Statics.field1120, Statics.field2718, Statics.field283, var4);
        } else if (field362 == 25) {
            if (field536 == 1) {
                if (field358 > field359) {
                    field359 = field358;
                }
                int var15 = (field359 * 50 - field358 * 50) / field359;
                method2083(class174.field2467 + class38.field808 + class38.field812 + var15 + "%" + class38.field807, false);
            } else if (field536 == 2) {
                if (field360 > field361) {
                    field361 = field360;
                }
                int var16 = (field361 * 50 - field360 * 50) / field361 + 50;
                method2083(class174.field2467 + class38.field808 + class38.field812 + var16 + "%" + class38.field807, false);
            } else {
                method2083(class174.field2467, false);
            }
        } else if (field362 == 30) {
            method373();
        } else if (field362 == 40) {
            method2083(class174.field2533 + class38.field808 + class174.field2442, false);
        } else if (field362 == 45) {
            method2083(class174.field2531, false);
        }
        if (field362 == 30 && field516 == 0 && !var4) {
            try {
                Graphics var17 = Statics.field900.getGraphics();
                for (int var18 = 0; var18 < field507; var18++) {
                    if (field426[var18]) {
                        Statics.field1828.method3763(var17, field300[var18], field513[var18], field514[var18], field515[var18]);
                        field426[var18] = false;
                    }
                }
            } catch (Exception var26) {
                Statics.field900.repaint();
            }
        } else if (field362 > 0) {
            try {
                Graphics var20 = Statics.field900.getGraphics();
                Statics.field1828.method3762(var20, 0, 0);
                for (int var21 = 0; var21 < field507; var21++) {
                    field426[var21] = false;
                }
            } catch (Exception var25) {
                Statics.field900.repaint();
            }
        }
    }

    @ObfuscatedName("client.j(I)V")
    public final void method244() {
        if (Statics.field78.method871()) {
            Statics.field78.method857();
        }
        if (Statics.field401 != null) {
            Statics.field401.field229 = false;
        }
        Statics.field401 = null;
        if (Statics.field234 != null) {
            Statics.field234.method1986();
            Statics.field234 = null;
        }
        if (class106.field1742 != null) {
            class106 var1 = class106.field1742;
            synchronized (class106.field1742) {
                class106.field1742 = null;
            }
        }
        class116.method845();
        Statics.field1575 = null;
        if (Statics.field24 != null) {
            Statics.field24.method1091();
        }
        if (Statics.field1928 != null) {
            Statics.field1928.method1091();
        }
        class186.method584();
        Object var3 = class184.field2749;
        synchronized (class184.field2749) {
            if (class184.field2748 != 0) {
                class184.field2748 = 1;
                try {
                    class184.field2749.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        class105.method163();
    }

    @ObfuscatedName("cb.s(II)V")
    public static void method1850(int arg0) {
        if (field362 == arg0) {
            return;
        }
        if (field362 == 0) {
            Statics.field144 = null;
            Statics.field1781 = null;
            Statics.field254 = null;
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field407 = 0;
            field336 = 0;
            field337 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2140 != null) {
            Statics.field2140.method1986();
            Statics.field2140 = null;
        }
        if (field362 == 25) {
            field536 = 0;
            field358 = 0;
            field359 = 1;
            field360 = 0;
            field361 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class42.method651(Statics.field900, Statics.field1582, Statics.field1218, true, 0);
        } else if (arg0 == 20) {
            class42.method651(Statics.field900, Statics.field1582, Statics.field1218, true, field362 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class42.method651(Statics.field900, Statics.field1582, Statics.field1218, false, 4);
        } else {
            class42.method2987();
        }
        field362 = arg0;
    }

    @ObfuscatedName("client.q(B)V")
    public void method402() {
        if (field362 != 1000) {
            boolean var1 = class186.method2984();
            if (!var1) {
                this.method246();
            }
        }
    }

    @ObfuscatedName("client.d(B)V")
    public void method246() {
        if (class186.field2782 >= 4) {
            this.method2018("js5crc");
            field362 = 1000;
            return;
        }
        if (class186.field2783 >= 4) {
            if (field362 <= 5) {
                this.method2018("js5io");
                field362 = 1000;
                return;
            }
            field333 = 3000;
            class186.field2783 = 3;
        }
        if (--field333 + 1 > 0) {
            return;
        }
        try {
            if (field304 == 0) {
                Statics.field2663 = Statics.field1756.method1884(Statics.field34, Statics.field432);
                field304++;
            }
            if (field304 == 1) {
                if (Statics.field2663.field1687 == 2) {
                    this.method247(-1);
                    return;
                }
                if (Statics.field2663.field1687 == 1) {
                    field304++;
                }
            }
            if (field304 == 2) {
                Statics.field711 = new class111((Socket) Statics.field2663.field1691, Statics.field1756);
                class154 var1 = new class154(5);
                var1.method2651(15);
                var1.method2654(139);
                Statics.field711.method1978(var1.field2114, 0, 5);
                field304++;
                Statics.field41 = class156.method848();
            }
            if (field304 == 3) {
                if (field362 <= 5 || Statics.field711.method1981() > 0) {
                    int var2 = Statics.field711.method1975();
                    if (var2 != 0) {
                        this.method247(var2);
                        return;
                    }
                    field304++;
                } else if (class156.method848() - Statics.field41 > 30000L) {
                    this.method247(-2);
                    return;
                }
            }
            if (field304 == 4) {
                class186.method3093(Statics.field711, field362 > 20);
                Statics.field2663 = null;
                Statics.field711 = null;
                field304 = 0;
                field334 = 0;
            }
        } catch (IOException var4) {
            this.method247(-3);
        }
    }

    @ObfuscatedName("client.p(II)V")
    public void method247(int arg0) {
        Statics.field2663 = null;
        Statics.field711 = null;
        field304 = 0;
        if (Statics.field432 == Statics.field1672) {
            Statics.field432 = Statics.field5;
        } else {
            Statics.field432 = Statics.field1672;
        }
        field334++;
        if (field334 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field362 <= 5) {
                this.method2018("js5connect_full");
                field362 = 1000;
            } else {
                field333 = 3000;
            }
        } else if (field334 >= 2 && arg0 == 6) {
            this.method2018("js5connect_outofdate");
            field362 = 1000;
        } else if (field334 >= 4) {
            if (field362 <= 5) {
                this.method2018("js5connect");
                field362 = 1000;
            } else {
                field333 = 3000;
            }
        }
    }

    @ObfuscatedName("o.y(I)V")
    public static void method66() {
        if (field331 == 0) {
            Statics.field688 = new class88(4, 104, 104, class11.field103);
            for (int var0 = 0; var0 < 4; var0++) {
                field527[var0] = new class118(104, 104);
            }
            Statics.field687 = new class225(512, 512);
            class42.field853 = class174.field2388;
            class42.field852 = 5;
            field331 = 20;
        } else if (field331 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class85.field1476[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class88.method1723(var1, 500, 800, 512, 334);
            class42.field853 = class174.field2389;
            class42.field852 = 10;
            field331 = 30;
        } else if (field331 == 30) {
            Statics.field2138 = method99(0, false, true, true);
            Statics.field989 = method99(1, false, true, true);
            Statics.field991 = method99(2, true, false, true);
            Statics.field806 = method99(3, false, true, true);
            Statics.field1831 = method99(4, false, true, true);
            Statics.field3097 = method99(5, true, true, true);
            Statics.field587 = method99(6, true, true, false);
            Statics.field1858 = method99(7, false, true, true);
            Statics.field1218 = method99(8, false, true, true);
            Statics.field2368 = method99(9, false, true, true);
            Statics.field1582 = method99(10, false, true, true);
            Statics.field163 = method99(11, false, true, true);
            Statics.field878 = method99(12, false, true, true);
            Statics.field57 = method99(13, true, false, true);
            Statics.field1084 = method99(14, false, true, false);
            Statics.field216 = method99(15, false, true, true);
            class42.field853 = class174.field2390;
            class42.field852 = 20;
            field331 = 40;
        } else if (field331 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2138.method3202() * 4 / 100;
            int var8 = var7 + Statics.field989.method3202() * 4 / 100;
            int var9 = var8 + Statics.field991.method3202() * 2 / 100;
            int var10 = var9 + Statics.field806.method3202() * 2 / 100;
            int var11 = var10 + Statics.field1831.method3202() * 6 / 100;
            int var12 = var11 + Statics.field3097.method3202() * 4 / 100;
            int var13 = var12 + Statics.field587.method3202() * 2 / 100;
            int var14 = var13 + Statics.field1858.method3202() * 60 / 100;
            int var15 = var14 + Statics.field1218.method3202() * 2 / 100;
            int var16 = var15 + Statics.field2368.method3202() * 2 / 100;
            int var17 = var16 + Statics.field1582.method3202() * 2 / 100;
            int var18 = var17 + Statics.field163.method3202() * 2 / 100;
            int var19 = var18 + Statics.field878.method3202() * 2 / 100;
            int var20 = var19 + Statics.field57.method3202() * 2 / 100;
            int var21 = var20 + Statics.field1084.method3202() * 2 / 100;
            int var22 = var21 + Statics.field216.method3202() * 2 / 100;
            if (var22 == 100) {
                class42.field853 = class174.field2392;
                class42.field852 = 30;
                field331 = 45;
            } else {
                if (var22 != 0) {
                    class42.field853 = class174.field2391 + var22 + "%";
                }
                class42.field852 = 30;
            }
        } else if (field331 == 45) {
            boolean var23 = !field307;
            Statics.field1078 = 22050;
            Statics.field1079 = var23;
            Statics.field3187 = 2;
            class140 var24 = new class140();
            var24.method2413(9, 128);
            Statics.field24 = class58.method1993(Statics.field1756, Statics.field900, 0, 22050);
            Statics.field24.method1059(var24);
            class185 var25 = Statics.field216;
            class185 var26 = Statics.field1084;
            class185 var27 = Statics.field1831;
            Statics.field1946 = var25;
            Statics.field2038 = var26;
            Statics.field1943 = var27;
            Statics.field1940 = var24;
            Statics.field1928 = class58.method1993(Statics.field1756, Statics.field900, 1, 2048);
            Statics.field225 = new class52();
            Statics.field1928.method1059(Statics.field225);
            Statics.field1869 = new class66(22050, Statics.field1078);
            class42.field853 = class174.field2518;
            class42.field852 = 35;
            field331 = 50;
        } else if (field331 == 50) {
            int var28 = 0;
            if (Statics.field2718 == null) {
                Statics.field2718 = class226.method3249(Statics.field1218, Statics.field57, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field283 == null) {
                Statics.field283 = class226.method3249(Statics.field1218, Statics.field57, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field1120 == null) {
                Statics.field1120 = class226.method3249(Statics.field1218, Statics.field57, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class42.field853 = class174.field2394 + var28 * 100 / 3 + "%";
                class42.field852 = 40;
            } else {
                Statics.field1574 = new class231(true);
                class42.field853 = class174.field2395;
                class42.field852 = 40;
                field331 = 60;
            }
        } else if (field331 == 60) {
            int var29 = class42.method1358(Statics.field1582, Statics.field1218);
            int var30 = class42.method649();
            if (var29 < var30) {
                class42.field853 = class174.field2396 + var29 * 100 / var30 + "%";
                class42.field852 = 50;
            } else {
                class42.field853 = class174.field2397;
                class42.field852 = 50;
                method1850(5);
                field331 = 70;
            }
        } else if (field331 == 70) {
            if (Statics.field991.method3139()) {
                class185 var31 = Statics.field991;
                Statics.field3048 = var31;
                class192.method1852(Statics.field991);
                class193.method1880(Statics.field991, Statics.field1858);
                class185 var32 = Statics.field991;
                class185 var33 = Statics.field1858;
                boolean var34 = field307;
                Statics.field2898 = var32;
                Statics.field2899 = var33;
                class198.field2936 = var34;
                class185 var35 = Statics.field991;
                class185 var36 = Statics.field1858;
                Statics.field3023 = var35;
                Statics.field3037 = var36;
                class185 var37 = Statics.field991;
                class185 var38 = Statics.field1858;
                boolean var39 = field306;
                class209 var40 = Statics.field2718;
                Statics.field1593 = var37;
                Statics.field957 = var38;
                Statics.field1760 = var39;
                Statics.field3001 = Statics.field1593.method3127(10);
                Statics.field2994 = var40;
                class202.method1965(Statics.field991, Statics.field2138, Statics.field989);
                class191.method3754(Statics.field991, Statics.field1858);
                class185 var41 = Statics.field991;
                Statics.field2858 = var41;
                class185 var42 = Statics.field991;
                Statics.field2789 = var42;
                Statics.field2790 = Statics.field2789.method3127(16);
                class185 var43 = Statics.field806;
                class185 var44 = Statics.field1858;
                class185 var45 = Statics.field1218;
                class185 var46 = Statics.field57;
                Statics.field2302 = var43;
                Statics.field2212 = var44;
                Statics.field2318 = var45;
                Statics.field236 = var46;
                Statics.field2240 = new class170[Statics.field2302.method3138()][];
                Statics.field58 = new boolean[Statics.field2302.method3138()];
                class187.method641(Statics.field991);
                class185 var47 = Statics.field991;
                Statics.field2868 = var47;
                class185 var48 = Statics.field991;
                Statics.field2798 = var48;
                class190.method558(Statics.field991);
                Statics.field78 = new class47();
                class185 var49 = Statics.field991;
                class185 var50 = Statics.field1218;
                class185 var51 = Statics.field57;
                Statics.field2886 = var49;
                Statics.field2884 = var50;
                Statics.field6 = var51;
                class185 var52 = Statics.field991;
                class185 var53 = Statics.field1218;
                Statics.field2853 = var52;
                Statics.field2843 = var53;
                class42.field853 = class174.field2399;
                class42.field852 = 60;
                field331 = 80;
            } else {
                class42.field853 = class174.field2398 + Statics.field991.method3201() + "%";
                class42.field852 = 60;
            }
        } else if (field331 == 80) {
            int var54 = 0;
            if (Statics.field40 == null) {
                class185 var55 = Statics.field1218;
                int var56 = var55.method3132("compass");
                int var57 = var55.method3133(var56, "");
                class225 var58 = Statics.method565(var55, var56, var57);
                Statics.field40 = var58;
            } else {
                var54++;
            }
            if (Statics.field2719 == null) {
                class185 var59 = Statics.field1218;
                int var60 = var59.method3132("mapedge");
                int var61 = var59.method3133(var60, "");
                class225 var62 = Statics.method565(var59, var60, var61);
                Statics.field2719 = var62;
            } else {
                var54++;
            }
            if (Statics.field48 == null) {
                Statics.field48 = class226.method3495(Statics.field1218, "mapscene", "");
            } else {
                var54++;
            }
            if (Statics.field172 == null) {
                Statics.field172 = class226.method1862(Statics.field1218, "mapfunction", "");
            } else {
                var54++;
            }
            if (Statics.field1083 == null) {
                Statics.field1083 = class226.method1862(Statics.field1218, "headicons_pk", "");
            } else {
                var54++;
            }
            if (Statics.field109 == null) {
                Statics.field109 = class226.method1862(Statics.field1218, "headicons_prayer", "");
            } else {
                var54++;
            }
            if (Statics.field171 == null) {
                Statics.field171 = class226.method1862(Statics.field1218, "headicons_hint", "");
            } else {
                var54++;
            }
            if (Statics.field2195 == null) {
                Statics.field2195 = class226.method1862(Statics.field1218, "mapmarker", "");
            } else {
                var54++;
            }
            if (Statics.field772 == null) {
                Statics.field772 = class226.method1862(Statics.field1218, "cross", "");
            } else {
                var54++;
            }
            if (Statics.field252 == null) {
                Statics.field252 = class226.method1862(Statics.field1218, "mapdots", "");
            } else {
                var54++;
            }
            if (Statics.field1373 == null) {
                Statics.field1373 = class226.method3495(Statics.field1218, "scrollbar", "");
            } else {
                var54++;
            }
            if (Statics.field1374 == null) {
                Statics.field1374 = class226.method3495(Statics.field1218, "mod_icons", "");
            } else {
                var54++;
            }
            if (var54 < 12) {
                class42.field853 = class174.field2400 + var54 * 100 / 12 + "%";
                class42.field852 = 70;
            } else {
                Statics.field3125 = Statics.field1374;
                Statics.field2719.method3922();
                int var63 = (int) (Math.random() * 21.0D) - 10;
                int var64 = (int) (Math.random() * 21.0D) - 10;
                int var65 = (int) (Math.random() * 21.0D) - 10;
                int var66 = (int) (Math.random() * 41.0D) - 20;
                for (int var67 = 0; var67 < Statics.field172.length; var67++) {
                    Statics.field172[var67].method3919(var63 + var66, var64 + var66, var65 + var66);
                }
                Statics.field48[0].method3848(var63 + var66, var64 + var66, var65 + var66);
                class42.field853 = class174.field2401;
                class42.field852 = 70;
                field331 = 90;
            }
        } else if (field331 == 90) {
            if (Statics.field2368.method3139()) {
                class75 var68 = new class75(Statics.field2368, Statics.field1218, 20, 0.8D, field307 ? 64 : 128);
                class85.method1588(var68);
                class85.method1593(0.8D);
                class42.field853 = class174.field2403;
                class42.field852 = 90;
                field331 = 110;
            } else {
                class42.field853 = class174.field2402 + Statics.field2368.method3201() + "%";
                class42.field852 = 90;
            }
        } else if (field331 == 110) {
            Statics.field401 = new class21();
            Statics.field1756.method1885(Statics.field401, 10);
            class42.field853 = class174.field2404;
            class42.field852 = 94;
            field331 = 120;
        } else if (field331 == 120) {
            if (Statics.field1582.method3135("huffman", "")) {
                class146 var69 = new class146(Statics.field1582.method3134("huffman", ""));
                Statics.field3134 = var69;
                class42.field853 = class174.field2587;
                class42.field852 = 96;
                field331 = 130;
            } else {
                class42.field853 = class174.field2405 + "%";
                class42.field852 = 96;
            }
        } else if (field331 == 130) {
            if (!Statics.field806.method3139()) {
                class42.field853 = class174.field2597 + Statics.field806.method3201() * 4 / 5 + "%";
                class42.field852 = 100;
            } else if (!Statics.field878.method3139()) {
                class42.field853 = class174.field2597 + (80 + Statics.field878.method3201() / 6) + "%";
                class42.field852 = 100;
            } else if (Statics.field57.method3139()) {
                class42.field853 = class174.field2408;
                class42.field852 = 100;
                field331 = 140;
            } else {
                class42.field853 = class174.field2597 + (96 + Statics.field57.method3201() / 20) + "%";
                class42.field852 = 100;
            }
        } else if (field331 == 140) {
            method1850(10);
        }
    }

    @ObfuscatedName("w.a(IZZZI)Lgp;")
    public static class185 method99(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class117 var4 = null;
        if (class105.field1714 != null) {
            var4 = new class117(arg0, class105.field1714, Statics.field187[arg0], 1000000);
        }
        return new class185(var4, Statics.field696, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("q.v(I)V")
    public static final void method152() {
        try {
            if (field407 == 0) {
                if (Statics.field234 != null) {
                    Statics.field234.method1986();
                    Statics.field234 = null;
                }
                Statics.field197 = null;
                field518 = false;
                field336 = 0;
                field407 = 1;
            }
            if (field407 == 1) {
                if (Statics.field197 == null) {
                    Statics.field197 = Statics.field1756.method1884(Statics.field34, Statics.field432);
                }
                if (Statics.field197.field1687 == 2) {
                    throw new IOException();
                }
                if (Statics.field197.field1687 == 1) {
                    Statics.field234 = new class111((Socket) Statics.field197.field1691, Statics.field1756);
                    Statics.field197 = null;
                    field407 = 2;
                }
            }
            if (field407 == 2) {
                field495.field2111 = 0;
                field495.method2651(14);
                Statics.field234.method1978(field495.field2114, 0, 1);
                field348.field2111 = 0;
                field407 = 3;
            }
            if (field407 == 3) {
                if (Statics.field24 != null) {
                    Statics.field24.method1061();
                }
                if (Statics.field1928 != null) {
                    Statics.field1928.method1061();
                }
                int var0 = Statics.field234.method1975();
                if (Statics.field24 != null) {
                    Statics.field24.method1061();
                }
                if (Statics.field1928 != null) {
                    Statics.field1928.method1061();
                }
                if (var0 != 0) {
                    method742(var0);
                    return;
                }
                field348.field2111 = 0;
                field407 = 4;
            }
            if (field407 == 4) {
                if (field348.field2111 < 8) {
                    int var1 = Statics.field234.method1981();
                    if (var1 > 8 - field348.field2111) {
                        var1 = 8 - field348.field2111;
                    }
                    if (var1 > 0) {
                        Statics.field234.method1977(field348.field2114, field348.field2111, var1);
                        field348.field2111 += var1;
                    }
                }
                if (field348.field2111 == 8) {
                    field348.field2111 = 0;
                    Statics.field947 = field348.method2726();
                    field407 = 5;
                }
            }
            if (field407 == 5) {
                int[] var2 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field947 >> 32), (int) (Statics.field947 & 0xFFFFFFFFFFFFFFFFL) };
                field495.field2111 = 0;
                field495.method2651(1);
                field495.method2651(class42.field859.method758());
                field495.method2654(var2[0]);
                field495.method2654(var2[1]);
                field495.method2654(var2[2]);
                field495.method2654(var2[3]);
                switch(class42.field859.field1654) {
                    case 0:
                    case 2:
                        field495.method2752(Statics.field684);
                        field495.field2111 += 5;
                        break;
                    case 1:
                        field495.field2111 += 8;
                        break;
                    case 3:
                        field495.method2654((Integer) Statics.field2059.field716.get(class208.method1969(class42.field865)));
                        field495.field2111 += 4;
                }
                field495.method2730(class42.field869);
                field495.method2687(class40.field826, class40.field823);
                field347.field2111 = 0;
                if (field362 == 40) {
                    field347.method2651(18);
                } else {
                    field347.method2651(16);
                }
                field347.method2793(0);
                int var3 = field347.field2111;
                field347.method2654(139);
                field347.method2660(field495.field2114, 0, field495.field2111);
                int var4 = field347.field2111;
                field347.method2730(class42.field865);
                field347.method2651((field390 ? 1 : 0) << 1 | (field307 ? 1 : 0));
                field347.method2793(Statics.field756);
                field347.method2793(Statics.field2208);
                method571(field347);
                field347.method2730(Statics.field2134);
                field347.method2654(Statics.field378);
                class154 var5 = new class154(Statics.field1574.method4019());
                Statics.field1574.method4018(var5);
                field347.method2660(var5.field2114, 0, var5.field2114.length);
                field347.method2651(Statics.field114);
                field347.method2654(0);
                field347.method2654(Statics.field2138.field2738);
                field347.method2654(Statics.field989.field2738);
                field347.method2654(Statics.field991.field2738);
                field347.method2654(Statics.field806.field2738);
                field347.method2654(Statics.field1831.field2738);
                field347.method2654(Statics.field3097.field2738);
                field347.method2654(Statics.field587.field2738);
                field347.method2654(Statics.field1858.field2738);
                field347.method2654(Statics.field1218.field2738);
                field347.method2654(Statics.field2368.field2738);
                field347.method2654(Statics.field1582.field2738);
                field347.method2654(Statics.field163.field2738);
                field347.method2654(Statics.field878.field2738);
                field347.method2654(Statics.field57.field2738);
                field347.method2654(Statics.field1084.field2738);
                field347.method2654(Statics.field216.field2738);
                field347.method2685(var2, var4, field347.field2111);
                field347.method2847(field347.field2111 - var3);
                Statics.field234.method1978(field347.field2114, 0, field347.field2111);
                field495.method2888(var2);
                for (int var6 = 0; var6 < 4; var6++) {
                    var2[var6] += 50;
                }
                field348.method2888(var2);
                field407 = 6;
            }
            if (field407 == 6 && Statics.field234.method1981() > 0) {
                int var7 = Statics.field234.method1975();
                if (var7 == 21 && field362 == 20) {
                    field407 = 7;
                } else if (var7 == 2) {
                    field407 = 9;
                } else if (var7 == 15 && field362 == 40) {
                    field349 = -1;
                    field407 = 13;
                } else if (var7 == 23 && field337 < 1) {
                    field337++;
                    field407 = 0;
                } else if (var7 == 29) {
                    field407 = 11;
                } else {
                    method742(var7);
                    return;
                }
            }
            if (field407 == 7 && Statics.field234.method1981() > 0) {
                field410 = (Statics.field234.method1975() + 3) * 60;
                field407 = 8;
            }
            if (field407 == 8) {
                field336 = 0;
                class42.method1158(class174.field2574, class174.field2413, field410 / 60 + class174.field2414);
                if (--field410 <= 0) {
                    field407 = 0;
                }
            } else {
                if (field407 == 9 && Statics.field234.method1981() >= 13) {
                    boolean var8 = Statics.field234.method1975() == 1;
                    Statics.field234.method1977(field348.field2114, 0, 4);
                    field348.field2111 = 0;
                    boolean var9 = false;
                    if (var8) {
                        int var10 = field348.method2894() << 24;
                        int var11 = var10 | field348.method2894() << 16;
                        int var12 = var11 | field348.method2894() << 8;
                        int var13 = var12 | field348.method2894();
                        int var14 = class208.method1969(class42.field865);
                        if (Statics.field2059.field716.size() >= 10 && !Statics.field2059.field716.containsKey(var14)) {
                            Iterator var15 = Statics.field2059.field716.entrySet().iterator();
                            var15.next();
                            var15.remove();
                        }
                        Statics.field2059.field716.put(var14, var13);
                        class31.method2638();
                    }
                    field471 = Statics.field234.method1975();
                    field369 = Statics.field234.method1975() == 1;
                    field386 = Statics.field234.method1975();
                    field386 <<= 0x8;
                    field386 += Statics.field234.method1975();
                    field314 = Statics.field234.method1975();
                    Statics.field234.method1977(field348.field2114, 0, 1);
                    field348.field2111 = 0;
                    field350 = field348.method2894();
                    Statics.field234.method1977(field348.field2114, 0, 2);
                    field348.field2111 = 0;
                    field349 = field348.method2668();
                    try {
                        class101.method1869(Statics.field434, "zap");
                    } catch (Throwable var26) {
                    }
                    field407 = 10;
                }
                if (field407 != 10) {
                    if (field407 == 11 && Statics.field234.method1981() >= 2) {
                        field348.field2111 = 0;
                        Statics.field234.method1977(field348.field2114, 0, 2);
                        field348.field2111 = 0;
                        Statics.field774 = field348.method2668();
                        field407 = 12;
                    }
                    if (field407 == 12 && Statics.field234.method1981() >= Statics.field774) {
                        field348.field2111 = 0;
                        Statics.field234.method1977(field348.field2114, 0, Statics.field774);
                        field348.field2111 = 0;
                        String var17 = field348.method2674();
                        String var18 = field348.method2674();
                        String var19 = field348.method2674();
                        class42.method1158(var17, var18, var19);
                        method1850(10);
                    }
                    if (field407 == 13) {
                        if (field349 == -1) {
                            if (Statics.field234.method1981() < 2) {
                                return;
                            }
                            Statics.field234.method1977(field348.field2114, 0, 2);
                            field348.field2111 = 0;
                            field349 = field348.method2668();
                        }
                        if (Statics.field234.method1981() >= field349) {
                            Statics.field234.method1977(field348.field2114, 0, field349);
                            field348.field2111 = 0;
                            int var20 = field349;
                            field495.field2111 = 0;
                            field348.field2111 = 0;
                            field350 = -1;
                            field353 = -1;
                            field425 = -1;
                            field355 = -1;
                            field349 = 0;
                            field351 = 0;
                            field320 = 0;
                            method749();
                            field540 = 0;
                            field538 = 0;
                            for (int var21 = 0; var21 < 2048; var21++) {
                                field423[var21] = null;
                            }
                            Statics.field899 = null;
                            for (int var22 = 0; var22 < field412.length; var22++) {
                                class36 var23 = field412[var22];
                                if (var23 != null) {
                                    var23.field629 = -1;
                                    var23.field678 = false;
                                }
                            }
                            class13.method180();
                            method1850(30);
                            for (int var24 = 0; var24 < 100; var24++) {
                                field509[var24] = true;
                            }
                            method1843();
                            class46.method1973(field348);
                            if (field348.field2111 != var20) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field336++;
                        if (field336 > 2000) {
                            if (field337 < 1) {
                                if (Statics.field432 == Statics.field1672) {
                                    Statics.field432 = Statics.field5;
                                } else {
                                    Statics.field432 = Statics.field1672;
                                }
                                field337++;
                                field407 = 0;
                            } else {
                                method742(-3);
                            }
                        }
                    }
                } else if (Statics.field234.method1981() >= field349) {
                    field348.field2111 = 0;
                    Statics.field234.method1977(field348.field2114, 0, field349);
                    method149();
                    class46.method1973(field348);
                    Statics.field162 = -1;
                    method3188(false);
                    field350 = -1;
                }
            }
        } catch (IOException var27) {
            if (field337 < 1) {
                if (Statics.field432 == Statics.field1672) {
                    Statics.field432 = Statics.field5;
                } else {
                    Statics.field432 = Statics.field1672;
                }
                field337++;
                field407 = 0;
            } else {
                method742(-2);
            }
        }
    }

    @ObfuscatedName("q.z(I)V")
    public static void method149() {
        field340 = 1L;
        field317 = -1;
        Statics.field401.field235 = 0;
        Statics.field1804 = true;
        field555 = true;
        field489 = -1L;
        Statics.method2911();
        field495.field2111 = 0;
        field348.field2111 = 0;
        field350 = -1;
        field353 = -1;
        field425 = -1;
        field355 = -1;
        field351 = 0;
        field320 = 0;
        field356 = 0;
        field321 = 0;
        method749();
        class116.method585(0);
        class48.field959.clear();
        class48.field950.method2219();
        class48.field953.method2371();
        class48.field954 = 0;
        field456 = 0;
        field459 = false;
        field546 = 0;
        field367 = (int) (Math.random() * 100.0D) - 50;
        field574 = (int) (Math.random() * 110.0D) - 55;
        field371 = (int) (Math.random() * 80.0D) - 40;
        field374 = (int) (Math.random() * 120.0D) - 60;
        field376 = (int) (Math.random() * 30.0D) - 20;
        field387 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field540 = 0;
        field460 = -1;
        field538 = 0;
        field435 = 0;
        field329 = class41.field828;
        field393 = class41.field828;
        field403 = 0;
        class46.method727();
        for (int var0 = 0; var0 < 2048; var0++) {
            field423[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field412[var1] = null;
        }
        field341 = -1;
        field586.method2295();
        field392.method2295();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field433[var2][var3][var4] = null;
                }
            }
        }
        field462 = new class129();
        field572 = 0;
        field556 = 0;
        field575 = 0;
        for (int var5 = 0; var5 < Statics.field2790; var5++) {
            class188 var6 = class188.method1970(var5);
            if (var6 != null) {
                class166.field2180[var5] = 0;
                class166.field2181[var5] = 0;
            }
        }
        Statics.field78.method867();
        field472 = -1;
        if (field464 != -1) {
            class170.method2921(field464);
        }
        for (class18 var7 = (class18) field554.method2257(); var7 != null; var7 = (class18) field554.method2259()) {
            method811(var7, true);
        }
        field464 = -1;
        field554 = new class126(8);
        field468 = null;
        method749();
        field510.method3020((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field429[var8] = null;
            field430[var8] = false;
        }
        class13.method180();
        field579 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field509[var9] = true;
        }
        method1843();
        field531 = null;
        Statics.field1449 = 0;
        Statics.field2137 = null;
        for (int var10 = 0; var10 < 8; var10++) {
            field580[var10] = new class5();
        }
        Statics.field139 = null;
    }

    @ObfuscatedName("ai.x(II)V")
    public static void method742(int arg0) {
        if (arg0 == -3) {
            class42.method1158(class174.field2643, class174.field2416, class174.field2417);
        } else if (arg0 == -2) {
            class42.method1158(class174.field2418, class174.field2419, class174.field2420);
        } else if (arg0 == -1) {
            class42.method1158(class174.field2421, class174.field2422, class174.field2423);
        } else if (arg0 == 3) {
            class42.field854 = 3;
        } else if (arg0 == 4) {
            class42.method1158(class174.field2424, class174.field2425, class174.field2462);
        } else if (arg0 == 5) {
            class42.method1158(class174.field2554, class174.field2428, class174.field2429);
        } else if (arg0 == 6) {
            class42.method1158(class174.field2430, class174.field2431, class174.field2541);
        } else if (arg0 == 7) {
            class42.method1158(class174.field2446, class174.field2434, class174.field2435);
        } else if (arg0 == 8) {
            class42.method1158(class174.field2436, class174.field2491, class174.field2438);
        } else if (arg0 == 9) {
            class42.method1158(class174.field2569, class174.field2440, class174.field2441);
        } else if (arg0 == 10) {
            class42.method1158(class174.field2426, class174.field2443, class174.field2621);
        } else if (arg0 == 11) {
            class42.method1158(class174.field2445, class174.field2651, class174.field2447);
        } else if (arg0 == 12) {
            class42.method1158(class174.field2448, class174.field2449, class174.field2450);
        } else if (arg0 == 13) {
            class42.method1158(class174.field2451, class174.field2452, class174.field2453);
        } else if (arg0 == 14) {
            class42.method1158(class174.field2454, class174.field2455, class174.field2456);
        } else if (arg0 == 16) {
            class42.method1158(class174.field2457, class174.field2458, class174.field2459);
        } else if (arg0 == 17) {
            class42.method1158(class174.field2432, class174.field2461, class174.field2377);
        } else if (arg0 == 18) {
            class42.method1158(class174.field2463, class174.field2464, class174.field2516);
        } else if (arg0 == 19) {
            class42.method1158(class174.field2466, class174.field2386, class174.field2468);
        } else if (arg0 == 20) {
            class42.method1158(class174.field2469, class174.field2470, class174.field2471);
        } else if (arg0 == 22) {
            class42.method1158(class174.field2472, class174.field2473, class174.field2474);
        } else if (arg0 == 23) {
            class42.method1158(class174.field2506, class174.field2476, class174.field2573);
        } else if (arg0 == 24) {
            class42.method1158(class174.field2478, class174.field2444, class174.field2480);
        } else if (arg0 == 25) {
            class42.method1158(class174.field2603, class174.field2576, class174.field2483);
        } else if (arg0 == 26) {
            class42.method1158(class174.field2484, class174.field2485, class174.field2535);
        } else if (arg0 == 27) {
            class42.method1158(class174.field2601, class174.field2488, class174.field2489);
        } else if (arg0 == 31) {
            class42.method1158(class174.field2496, class174.field2497, class174.field2477);
        } else if (arg0 == 32) {
            class42.method1158(class174.field2598, class174.field2387, class174.field2498);
        } else if (arg0 == 37) {
            class42.method1158(class174.field2502, class174.field2503, class174.field2632);
        } else if (arg0 == 38) {
            class42.method1158(class174.field2505, class174.field2393, class174.field2636);
        } else if (arg0 == 55) {
            class42.method1158(class174.field2508, class174.field2509, class174.field2482);
        } else if (arg0 == 56) {
            class42.method1158(class174.field2492, class174.field2512, class174.field2385);
            method1850(11);
            return;
        } else if (arg0 == 57) {
            class42.method1158(class174.field2500, class174.field2515, class174.field2596);
            method1850(11);
            return;
        } else {
            class42.method1158(class174.field2517, class174.field2521, class174.field2620);
        }
        method1850(10);
    }

    @ObfuscatedName("ch.g(B)V")
    public static final void method1835() {
        if (Statics.field234 != null) {
            Statics.field234.method1986();
            Statics.field234 = null;
        }
        method190();
        Statics.field688.method1649();
        for (int var0 = 0; var0 < 4; var0++) {
            field527[var0].method2187();
        }
        System.gc();
        class139.method2188(2);
        field542 = -1;
        field543 = false;
        class32.method89();
        method1850(10);
    }

    @ObfuscatedName("g.b(I)V")
    public static final void method190() {
        class201.method1834();
        class192.field2822.method2244();
        class193.field2831.method2244();
        Statics.method2633();
        class200.field3027.method2244();
        class200.field3009.method2244();
        class199.field2953.method2244();
        class199.field2996.method2244();
        class199.field2955.method2244();
        class202.field3059.method2244();
        class202.field3072.method2244();
        class191.field2805.method2244();
        class191.field2819.method2244();
        class195.field2857.method2244();
        class188.method726();
        class197.method900();
        class194.method3453();
        class167.method1405();
        class170.field2261.method2244();
        class170.field2215.method2244();
        class170.field2216.method2244();
        class170.field2324.method2244();
        ((class75) Statics.field1473).method1380();
        class49.field969.method2244();
        Statics.field2138.method3130();
        Statics.field989.method3130();
        Statics.field806.method3130();
        Statics.field1831.method3130();
        Statics.field3097.method3130();
        Statics.field587.method3130();
        Statics.field1858.method3130();
        Statics.field1218.method3130();
        Statics.field2368.method3130();
        Statics.field1582.method3130();
        Statics.field163.method3130();
        Statics.field878.method3130();
    }

    @ObfuscatedName("dk.k(I)V")
    public static final void method1964() {
        if (field356 > 0) {
            method1835();
        } else {
            method1850(40);
            Statics.field2140 = Statics.field234;
            Statics.field234 = null;
        }
    }

    @ObfuscatedName("ah.t(B)V")
    public static final void method593() {
        if (Statics.field1928 != null) {
            Statics.field1928.method1060();
        }
        if (Statics.field24 != null) {
            Statics.field24.method1060();
        }
    }

    @ObfuscatedName("s.c(I)V")
    public static final void method145() {
        for (int var0 = 0; var0 < field546; var0++) {
            int var10002 = field335[var0]--;
            if (field335[var0] >= -10) {
                class54 var2 = field551[var0];
                if (var2 == null) {
                    class54 var10000 = (class54) null;
                    var2 = class54.method991(Statics.field1831, field547[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field335[var0] += var2.method981();
                    field551[var0] = var2;
                }
                if (field335[var0] < 0) {
                    int var9;
                    if (field465[var0] == 0) {
                        var9 = field544;
                    } else {
                        int var3 = (field465[var0] & 0xFF) * 128;
                        int var4 = field465[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field899.field625;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field465[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field899.field620;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field335[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field545 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class56 var10 = var2.method986().method1032(Statics.field1869);
                        class67 var11 = class67.method1164(var10, 100, var9);
                        var11.method1169(field548[var0] - 1);
                        Statics.field225.method920(var11);
                    }
                    field335[var0] = -100;
                }
            } else {
                field546--;
                for (int var1 = var0; var1 < field546; var1++) {
                    field547[var1] = field547[var1 + 1];
                    field551[var1] = field551[var1 + 1];
                    field548[var1] = field548[var1 + 1];
                    field335[var1] = field335[var1 + 1];
                    field465[var1] = field465[var1 + 1];
                }
                var0--;
            }
        }
        if (!field543) {
            return;
        }
        boolean var12;
        if (class139.field1941 == 0) {
            var12 = Statics.field1940.method2392();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field541 != 0 && field542 != -1) {
                class139.method1400(Statics.field587, field542, 0, field541, false);
            }
            field543 = false;
        }
    }

    @ObfuscatedName("cl.e(Lgl;IIII)V")
    public static void method1480(class202 arg0, int arg1, int arg2, int arg3) {
        if (field546 >= 50 || field545 == 0 || arg0.field3064 == null || arg1 >= arg0.field3064.length) {
            return;
        }
        int var4 = arg0.field3064[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field547[field546] = var5;
        field548[field546] = var6;
        field335[field546] = 0;
        field551[field546] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field465[field546] = (var8 << 16) + (var9 << 8) + var7;
        field546++;
    }

    @ObfuscatedName("bi.am(B)V")
    public static final void method1326() {
        if (Statics.field3063 != field460) {
            field460 = Statics.field3063;
            method204(Statics.field3063);
        }
    }

    @ObfuscatedName("u.an(Lfr;III)V")
    public static final void method10(class170 arg0, int arg1, int arg2) {
        if (field540 != 0 && field540 != 3 || class116.field1824 != 1 && Statics.field2688 || class116.field1824 != 4) {
            return;
        }
        class165 var3 = arg0.method3077(true);
        if (var3 == null) {
            return;
        }
        int var4 = class116.field1826 - arg1;
        int var5 = class116.field1814 - arg2;
        if (!var3.method2978(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2175 / 2;
        int var7 = var5 - var3.field2173 / 2;
        int var8 = field387 + field374 & 0x7FF;
        int var9 = class85.field1476[var8];
        int var10 = class85.field1470[var8];
        int var11 = (field376 + 256) * var9 >> 8;
        int var12 = (field376 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field899.field625 + var13 >> 7;
        int var16 = Statics.field899.field620 - var14 >> 7;
        field495.method2889(229);
        field495.method2651(18);
        field495.method2692(class106.field1735[82] ? (class106.field1735[81] ? 2 : 1) : 0);
        field495.method2699(Statics.field2792 + var16);
        field495.method2694(Statics.field1880 + var15);
        field495.method2651(var6);
        field495.method2651(var7);
        field495.method2793(field387);
        field495.method2651(57);
        field495.method2651(field374);
        field495.method2651(field376);
        field495.method2651(89);
        field495.method2793(Statics.field899.field625);
        field495.method2793(Statics.field899.field620);
        field495.method2651(63);
        field538 = var15;
        field435 = var16;
    }

    @ObfuscatedName("dh.aq(I)V")
    public static final void method1945() {
        int[] var0 = class46.field919;
        for (int var1 = 0; var1 < class46.field924; var1++) {
            class24 var2 = field423[var0[var1]];
            if (var2 != null && var2.field657 > 0) {
                var2.field657--;
                if (var2.field657 == 0) {
                    var2.field632 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field403; var3++) {
            int var4 = field343[var3];
            class36 var5 = field412[var4];
            if (var5 != null && var5.field657 > 0) {
                var5.field657--;
                if (var5.field657 == 0) {
                    var5.field632 = null;
                }
            }
        }
    }

    @ObfuscatedName("au.ah(Ljava/lang/String;I)V")
    public static final void method751(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field2059.field717 = !Statics.field2059.field717;
            class31.method2638();
            if (Statics.field2059.field717) {
                class48.method225(99, "", "Roofs are now all hidden");
            } else {
                class48.method225(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field319 = !field319;
        }
        if (field471 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field319 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field319 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method1964();
            }
            if (arg0.equalsIgnoreCase("errortest") && field581 == 2) {
                throw new RuntimeException();
            }
        }
        field495.method2889(138);
        field495.method2651(arg0.length() + 1);
        field495.method2730(arg0);
    }

    @ObfuscatedName("cc.ag(B)V")
    public static final void method1842() {
        int var0 = field367 + Statics.field899.field625;
        int var1 = field574 + Statics.field899.field620;
        if (Statics.field787 - var0 < -500 || Statics.field787 - var0 > 500 || Statics.field2721 - var1 < -500 || Statics.field2721 - var1 > 500) {
            Statics.field787 = var0;
            Statics.field2721 = var1;
        }
        if (Statics.field787 != var0) {
            Statics.field787 += (var0 - Statics.field787) / 16;
        }
        if (Statics.field2721 != var1) {
            Statics.field2721 += (var1 - Statics.field2721) / 16;
        }
        if (class116.field1812 == 4 && Statics.field2688) {
            int var2 = class116.field1819 - field318;
            field389 = var2 * 2;
            field318 = var2 == -1 || var2 == 1 ? class116.field1819 : (field318 + class116.field1819) / 2;
            int var3 = field316 - class116.field1818;
            field388 = var3 * 2;
            field316 = var3 == -1 || var3 == 1 ? class116.field1818 : (field316 + class116.field1818) / 2;
        } else {
            if (class106.field1735[96]) {
                field388 += (-24 - field388) / 2;
            } else if (class106.field1735[97]) {
                field388 += (24 - field388) / 2;
            } else {
                field388 /= 2;
            }
            if (class106.field1735[98]) {
                field389 += (12 - field389) / 2;
            } else if (class106.field1735[99]) {
                field389 += (-12 - field389) / 2;
            } else {
                field389 /= 2;
            }
            field318 = class116.field1819;
            field316 = class116.field1818;
        }
        field387 = field388 / 2 + field387 & 0x7FF;
        field399 += field389 / 2;
        if (field399 < 128) {
            field399 = 128;
        }
        if (field399 > 383) {
            field399 = 383;
        }
        int var4 = Statics.field787 >> 7;
        int var5 = Statics.field2721 >> 7;
        int var6 = method1906(Statics.field787, Statics.field2721, Statics.field3063);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field3063;
                    if (var10 < 3 && (class11.field86[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class11.field103[var10][var8][var9];
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
        if (var12 > field395) {
            field395 += (var12 - field395) / 24;
        } else if (var12 < field395) {
            field395 += (var12 - field395) / 80;
        }
    }

    @ObfuscatedName("gk.ab(B)V")
    public static final void method3599() {
        int var0 = class46.field924;
        int[] var1 = class46.field919;
        for (int var2 = 0; var2 < var0; var2++) {
            class24 var3 = field423[var1[var2]];
            if (var3 != null) {
                Statics.method556(var3, 1);
            }
        }
    }

    @ObfuscatedName("r.ax(Lan;B)V")
    public static final void method33(class28 arg0) {
        arg0.field648 = arg0.field624;
        if (arg0.field673 == 0) {
            arg0.field652 = 0;
            return;
        }
        if (arg0.field651 != -1 && arg0.field621 == 0) {
            class202 var1 = class202.method164(arg0.field651);
            if (arg0.field656 > 0 && var1.field3057 == 0) {
                arg0.field652++;
                return;
            }
            if (arg0.field656 <= 0 && var1.field3073 == 0) {
                arg0.field652++;
                return;
            }
        }
        int var2 = arg0.field625;
        int var3 = arg0.field620;
        int var4 = arg0.field674[arg0.field673 - 1] * 128 + arg0.field623 * 64;
        int var5 = arg0.field675[arg0.field673 - 1] * 128 + arg0.field623 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field670 = 1280;
            } else if (var3 > var5) {
                arg0.field670 = 1792;
            } else {
                arg0.field670 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field670 = 768;
            } else if (var3 > var5) {
                arg0.field670 = 256;
            } else {
                arg0.field670 = 512;
            }
        } else if (var3 < var5) {
            arg0.field670 = 1024;
        } else if (var3 > var5) {
            arg0.field670 = 0;
        }
        byte var6 = arg0.field676[arg0.field673 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field625 = var4;
            arg0.field620 = var5;
            arg0.field673--;
            if (arg0.field656 > 0) {
                arg0.field656--;
            }
            return;
        }
        int var7 = arg0.field670 - arg0.field671 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field628;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field627;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field630;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field646;
        }
        if (var8 == -1) {
            var8 = arg0.field627;
        }
        arg0.field648 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class36) {
            var10 = ((class36) arg0).field783.field3040;
        }
        if (var10) {
            if (arg0.field671 != arg0.field670 && arg0.field629 == -1 && arg0.field672 != 0) {
                var9 = 2;
            }
            if (arg0.field673 > 2) {
                var9 = 6;
            }
            if (arg0.field673 > 3) {
                var9 = 8;
            }
            if (arg0.field652 > 0 && arg0.field673 > 1) {
                var9 = 8;
                arg0.field652--;
            }
        } else {
            if (arg0.field673 > 1) {
                var9 = 6;
            }
            if (arg0.field673 > 2) {
                var9 = 8;
            }
            if (arg0.field652 > 0 && arg0.field673 > 1) {
                var9 = 8;
                arg0.field652--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field648 == arg0.field627 && arg0.field631 != -1) {
            arg0.field648 = arg0.field631;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field625 += var9;
                if (arg0.field625 > var4) {
                    arg0.field625 = var4;
                }
            } else if (var2 > var4) {
                arg0.field625 -= var9;
                if (arg0.field625 < var4) {
                    arg0.field625 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field620 += var9;
                if (arg0.field620 > var5) {
                    arg0.field620 = var5;
                }
            } else if (var3 > var5) {
                arg0.field620 -= var9;
                if (arg0.field620 < var5) {
                    arg0.field620 = var5;
                }
            }
        }
        if (arg0.field625 == var4 && arg0.field620 == var5) {
            arg0.field673--;
            if (arg0.field656 > 0) {
                arg0.field656--;
            }
        }
    }

    @ObfuscatedName("p.ar(Lt;III)V")
    public static void method166(class24 arg0, int arg1, int arg2) {
        if (arg0.field651 == arg1 && arg1 != -1) {
            int var3 = class202.method164(arg1).field3074;
            if (var3 == 1) {
                arg0.field654 = 0;
                arg0.field653 = 0;
                arg0.field621 = arg2;
                arg0.field638 = 0;
            }
            if (var3 == 2) {
                arg0.field638 = 0;
            }
        } else if (arg1 == -1 || arg0.field651 == -1 || class202.method164(arg1).field3068 >= class202.method164(arg0.field651).field3068) {
            arg0.field651 = arg1;
            arg0.field654 = 0;
            arg0.field653 = 0;
            arg0.field621 = arg2;
            arg0.field638 = 0;
            arg0.field656 = arg0.field673;
        }
    }

    @ObfuscatedName("dk.ak(B)V")
    public static void method1966() {
        class106.method711(Statics.field900);
        class116.method2647(Statics.field900);
        if (Statics.field1575 != null) {
            Statics.field1575.method1950(Statics.field900);
        }
        Statics.field434.method2040();
        Statics.field900.setBackground(Color.black);
        Canvas var0 = Statics.field900;
        var0.setFocusTraversalKeysEnabled(false);
        var0.addKeyListener(class106.field1742);
        var0.addFocusListener(class106.field1742);
        class116.method1581(Statics.field900);
        if (Statics.field1575 != null) {
            Statics.field1575.method1946(Statics.field900);
        }
        if (field464 != -1) {
            int var1 = field464;
            int var2 = Statics.field756;
            int var3 = Statics.field2208;
            if (class170.method179(var1)) {
                method1159(Statics.field2240[var1], -1, var2, var3, false);
            }
        }
        field1798 = true;
    }

    @ObfuscatedName("cm.ai(I)V")
    public static void method1843() {
        field495.method2889(3);
        class160 var0 = field495;
        int var1 = field390 ? 2 : 1;
        var0.method2651(var1);
        field495.method2793(Statics.field756);
        field495.method2793(Statics.field2208);
    }

    @ObfuscatedName("ep.ap(B)V")
    public static void method2498() {
        client var0 = Statics.field434;
        synchronized (Statics.field434) {
            Container var1 = Statics.field434.method2019();
            if (var1 != null) {
                Statics.field683 = Math.max(var1.getSize().width, Statics.field832);
                Statics.field759 = Math.max(var1.getSize().height, Statics.field1803);
                if (Statics.field1861 == var1) {
                    Insets var2 = Statics.field1861.getInsets();
                    Statics.field683 -= var2.right + var2.left;
                    Statics.field759 -= var2.top + var2.bottom;
                }
                if (Statics.field683 <= 0) {
                    Statics.field683 = 1;
                }
                if (Statics.field759 <= 0) {
                    Statics.field759 = 1;
                }
                int var3 = field390 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field756 = field363 * 765;
                    Statics.field2208 = field550 * 503;
                } else {
                    Statics.field756 = Math.min(Statics.field683, 7680);
                    Statics.field2208 = Math.min(Statics.field759, 2160);
                }
                field1793 = (Statics.field683 - Statics.field756) / 2;
                field1783 = 0;
                Statics.field900.setSize(Statics.field756, Statics.field2208);
                Statics.field1828 = class221.method70(Statics.field756, Statics.field2208, Statics.field900);
                if (Statics.field1861 == var1) {
                    Insets var4 = Statics.field1861.getInsets();
                    Statics.field900.setLocation(field1793 + var4.left, field1783 + var4.top);
                } else {
                    Statics.field900.setLocation(field1793, field1783);
                }
                method755();
                if (field464 != -1) {
                    int var5 = field464;
                    int var6 = Statics.field756;
                    int var7 = Statics.field2208;
                    if (class170.method179(var5)) {
                        method1159(Statics.field2240[var5], -1, var6, var7, true);
                    }
                }
                method1354();
            }
        }
    }

    @ObfuscatedName("aj.au(B)V")
    public static void method755() {
        int var0 = Statics.field756;
        int var1 = Statics.field2208;
        if (Statics.field683 < var0) {
            int var2 = Statics.field683;
        }
        if (Statics.field759 < var1) {
            int var3 = Statics.field759;
        }
        if (Statics.field2059 == null) {
            return;
        }
        try {
            client var4 = Statics.field434;
            int var5 = field390 ? 2 : 1;
            class101.method1866(var4, "resize", new Object[] { var5 });
        } catch (Throwable var7) {
        }
    }

    @ObfuscatedName("bi.aj(B)V")
    public static void method1354() {
        int var0 = field1793;
        int var1 = field1783;
        int var2 = Statics.field683 - Statics.field756 - var0;
        int var3 = Statics.field759 - Statics.field2208 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field434.method2019();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1861 == var4) {
                Insets var7 = Statics.field1861.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field759);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field683, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field683 + var5 - var2, var6, var2, Statics.field759);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field759 + var6 - var3, Statics.field683, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("client.at(I)V")
    public static final void method373() {
        if (field464 != -1) {
            method2632(field464);
        }
        for (int var0 = 0; var0 < field507; var0++) {
            if (field509[var0]) {
                field426[var0] = true;
            }
            field511[var0] = field509[var0];
            field509[var0] = false;
        }
        field508 = field312;
        field452 = -1;
        field332 = -1;
        Statics.field2161 = null;
        if (field464 != -1) {
            field507 = 0;
            method886(field464, 0, 0, Statics.field756, Statics.field2208, 0, 0, -1);
        }
        class220.method3772();
        if (field441) {
            method2567();
        } else if (field452 != -1) {
            method186(field452, field332);
        }
        if (field516 == 3) {
            for (int var1 = 0; var1 < field507; var1++) {
                if (field511[var1]) {
                    class220.method3778(field300[var1], field513[var1], field514[var1], field515[var1], 16711935, 128);
                } else if (field426[var1]) {
                    class220.method3778(field300[var1], field513[var1], field514[var1], field515[var1], 16711680, 128);
                }
            }
        }
        int var2 = Statics.field3063;
        int var3 = Statics.field899.field625;
        int var4 = Statics.field899.field620;
        int var5 = field512;
        for (class32 var6 = (class32) class32.field733.method2301(); var6 != null; var6 = (class32) class32.field733.method2309()) {
            if (var6.field735 != -1 || var6.field734 != null) {
                int var7 = 0;
                if (var3 > var6.field727) {
                    var7 += var3 - var6.field727;
                } else if (var3 < var6.field725) {
                    var7 += var6.field725 - var3;
                }
                if (var4 > var6.field723) {
                    var7 += var4 - var6.field723;
                } else if (var4 < var6.field726) {
                    var7 += var6.field726 - var4;
                }
                if (var7 - 64 > var6.field729 || field545 == 0 || var6.field724 != var2) {
                    if (var6.field737 != null) {
                        Statics.field225.method921(var6.field737);
                        var6.field737 = null;
                    }
                    if (var6.field736 != null) {
                        Statics.field225.method921(var6.field736);
                        var6.field736 = null;
                    }
                } else {
                    var7 -= 64;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = field545 * (var6.field729 - var7) / var6.field729;
                    class54 var10000;
                    if (var6.field737 != null) {
                        var6.field737.method1160(var8);
                    } else if (var6.field735 >= 0) {
                        var10000 = (class54) null;
                        class54 var9 = class54.method991(Statics.field1831, var6.field735, 0);
                        if (var9 != null) {
                            class56 var10 = var9.method986().method1032(Statics.field1869);
                            class67 var11 = class67.method1164(var10, 100, var8);
                            var11.method1169(-1);
                            Statics.field225.method920(var11);
                            var6.field737 = var11;
                        }
                    }
                    if (var6.field736 != null) {
                        var6.field736.method1160(var8);
                        if (!var6.field736.method2293()) {
                            var6.field736 = null;
                        }
                    } else if (var6.field734 != null && (var6.field731 -= var5) <= 0) {
                        int var12 = (int) (Math.random() * (double) var6.field734.length);
                        var10000 = (class54) null;
                        class54 var13 = class54.method991(Statics.field1831, var6.field734[var12], 0);
                        if (var13 != null) {
                            class56 var14 = var13.method986().method1032(Statics.field1869);
                            class67 var15 = class67.method1164(var14, 100, var8);
                            var15.method1169(0);
                            Statics.field225.method920(var15);
                            var6.field736 = var15;
                            var6.field731 = var6.field732 + (int) (Math.random() * (double) (var6.field728 - var6.field732));
                        }
                    }
                }
            }
        }
        field512 = 0;
    }

    @ObfuscatedName("dn.ad(Ljava/lang/String;ZI)V")
    public static final void method2083(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field283.method3683(arg0, 250);
        int var6 = Statics.field283.method3695(arg0, 250) * 13;
        class220.method3779(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class220.method3785(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field283.method3680(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2378(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method106(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field900.getGraphics();
            Statics.field1828.method3762(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field900.repaint();
        }
    }

    @ObfuscatedName("eo.av(IIIIB)V")
    public static final void method2864(int arg0, int arg1, int arg2, int arg3) {
        field338++;
        method116(class16.field175);
        boolean var4 = false;
        if (field341 >= 0) {
            int var5 = class46.field924;
            int[] var6 = class46.field919;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field341 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method116(class16.field168);
        }
        method1845(true);
        method116(var4 ? class16.field170 : class16.field169);
        method1845(false);
        method737();
        for (class34 var8 = (class34) field392.method2301(); var8 != null; var8 = (class34) field392.method2309()) {
            if (Statics.field3063 != var8.field760 || var8.field767) {
                var8.method2289();
            } else if (field312 >= var8.field773) {
                var8.method707(field512);
                if (var8.field767) {
                    var8.method2289();
                } else {
                    Statics.field688.method1660(var8.field760, var8.field758, var8.field769, var8.field763, 60, var8, 0, -1, false);
                }
            }
        }
        method155(arg0, arg1, arg2, arg3, true);
        int var9 = field566;
        int var10 = field567;
        int var11 = field568;
        int var12 = field569;
        class220.method3773(var9, var10, var9 + var11, var10 + var12);
        class85.method1584();
        if (!field447) {
            int var13 = field399;
            if (field395 / 256 > var13) {
                var13 = field395 / 256;
            }
            if (field553[4] && field357[4] + 128 > var13) {
                var13 = field357[4] + 128;
            }
            int var14 = field387 + field371 & 0x7FF;
            method1846(Statics.field787, method1906(Statics.field899.field625, Statics.field899.field620, Statics.field3063) - field573, Statics.field2721, var13, var14, var13 * 3 + 600);
        }
        int var27;
        if (field447) {
            var27 = method88();
        } else {
            int var15;
            if (Statics.field2059.field717) {
                var15 = Statics.field3063;
            } else {
                label488: {
                    int var16 = 3;
                    if (Statics.field182 < 310) {
                        int var17 = Statics.field245 >> 7;
                        int var18 = Statics.field1628 >> 7;
                        int var19 = Statics.field899.field625 >> 7;
                        int var20 = Statics.field899.field620 >> 7;
                        if (var17 < 0 || var18 < 0 || var17 >= 104 || var18 >= 104) {
                            var15 = Statics.field3063;
                            break label488;
                        }
                        if ((class11.field86[Statics.field3063][var17][var18] & 0x4) != 0) {
                            var16 = Statics.field3063;
                        }
                        int var21;
                        if (var19 > var17) {
                            var21 = var19 - var17;
                        } else {
                            var21 = var17 - var19;
                        }
                        int var22;
                        if (var20 > var18) {
                            var22 = var20 - var18;
                        } else {
                            var22 = var18 - var20;
                        }
                        if (var21 > var22) {
                            int var23 = var22 * 65536 / var21;
                            int var24 = 32768;
                            while (var17 != var19) {
                                if (var17 < var19) {
                                    var17++;
                                } else if (var17 > var19) {
                                    var17--;
                                }
                                if ((class11.field86[Statics.field3063][var17][var18] & 0x4) != 0) {
                                    var16 = Statics.field3063;
                                }
                                var24 += var23;
                                if (var24 >= 65536) {
                                    var24 -= 65536;
                                    if (var18 < var20) {
                                        var18++;
                                    } else if (var18 > var20) {
                                        var18--;
                                    }
                                    if ((class11.field86[Statics.field3063][var17][var18] & 0x4) != 0) {
                                        var16 = Statics.field3063;
                                    }
                                }
                            }
                        } else {
                            int var25 = var21 * 65536 / var22;
                            int var26 = 32768;
                            while (var18 != var20) {
                                if (var18 < var20) {
                                    var18++;
                                } else if (var18 > var20) {
                                    var18--;
                                }
                                if ((class11.field86[Statics.field3063][var17][var18] & 0x4) != 0) {
                                    var16 = Statics.field3063;
                                }
                                var26 += var25;
                                if (var26 >= 65536) {
                                    var26 -= 65536;
                                    if (var17 < var19) {
                                        var17++;
                                    } else if (var17 > var19) {
                                        var17--;
                                    }
                                    if ((class11.field86[Statics.field3063][var17][var18] & 0x4) != 0) {
                                        var16 = Statics.field3063;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field899.field625 >= 0 && Statics.field899.field620 >= 0 && Statics.field899.field625 < 13312 && Statics.field899.field620 < 13312) {
                        if ((class11.field86[Statics.field3063][Statics.field899.field625 >> 7][Statics.field899.field620 >> 7] & 0x4) != 0) {
                            var16 = Statics.field3063;
                        }
                        var15 = var16;
                    } else {
                        var15 = Statics.field3063;
                    }
                }
            }
            var27 = var15;
        }
        int var28 = Statics.field245;
        int var29 = Statics.field186;
        int var30 = Statics.field1628;
        int var31 = Statics.field182;
        int var32 = Statics.field83;
        for (int var33 = 0; var33 < 5; var33++) {
            if (field553[var33]) {
                int var34 = (int) (Math.random() * (double) (field483[var33] * 2 + 1) - (double) field483[var33] + Math.sin((double) field384[var33] / 100.0D * (double) field414[var33]) * (double) field357[var33]);
                if (var33 == 0) {
                    Statics.field245 += var34;
                }
                if (var33 == 1) {
                    Statics.field186 += var34;
                }
                if (var33 == 2) {
                    Statics.field1628 += var34;
                }
                if (var33 == 3) {
                    Statics.field83 = Statics.field83 + var34 & 0x7FF;
                }
                if (var33 == 4) {
                    Statics.field182 += var34;
                    if (Statics.field182 < 128) {
                        Statics.field182 = 128;
                    }
                    if (Statics.field182 > 383) {
                        Statics.field182 = 383;
                    }
                }
            }
        }
        int var35 = class116.field1818;
        int var36 = class116.field1819;
        if (class116.field1824 != 0) {
            var35 = class116.field1826;
            var36 = class116.field1814;
        }
        if (var35 >= var9 && var35 < var9 + var11 && var36 >= var10 && var36 < var10 + var12) {
            class83.field1432 = true;
            class83.field1422 = 0;
            class83.field1409 = var35 - var9;
            class83.field1434 = var36 - var10;
        } else {
            class83.field1432 = false;
            class83.field1422 = 0;
        }
        method593();
        class220.method3779(var9, var10, var11, var12, 0);
        method593();
        int var37 = class85.field1462;
        class85.field1462 = field570;
        Statics.field688.method1806(Statics.field245, Statics.field186, Statics.field1628, Statics.field182, Statics.field83, var27);
        class85.field1462 = var37;
        method593();
        Statics.field688.method1793();
        field396 = 0;
        boolean var38 = false;
        int var39 = -1;
        int var40 = class46.field924;
        int[] var41 = class46.field919;
        for (int var42 = 0; var42 < field403 + var40; var42++) {
            class28 var43;
            if (var42 < var40) {
                var43 = field423[var41[var42]];
                if (field341 == var41[var42]) {
                    var38 = true;
                    var39 = var42;
                    continue;
                }
            } else {
                var43 = field412[field343[var42 - var40]];
            }
            method3088(var43, var42, var9, var10, var11, var12);
        }
        if (var38) {
            method3088(field423[field341], var39, var9, var10, var11, var12);
        }
        for (int var44 = 0; var44 < field396; var44++) {
            int var45 = field398[var44];
            int var46 = field381[var44];
            int var47 = field445[var44];
            int var48 = field400[var44];
            boolean var49 = true;
            while (var49) {
                var49 = false;
                for (int var50 = 0; var50 < var44; var50++) {
                    if (var46 + 2 > field381[var50] - field400[var50] && var46 - var48 < field381[var50] + 2 && var45 - var47 < field445[var50] + field398[var50] && var45 + var47 > field398[var50] - field445[var50] && field381[var50] - field400[var50] < var46) {
                        var46 = field381[var50] - field400[var50];
                        var49 = true;
                    }
                }
            }
            field408 = field398[var44];
            field409 = field381[var44] = var46;
            String var51 = field405[var44];
            if (field466 == 0) {
                int var52 = 16776960;
                if (field402[var44] < 6) {
                    var52 = field521[field402[var44]];
                }
                if (field402[var44] == 6) {
                    var52 = field338 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field402[var44] == 7) {
                    var52 = field338 % 20 < 10 ? 255 : 65535;
                }
                if (field402[var44] == 8) {
                    var52 = field338 % 20 < 10 ? 45056 : 8454016;
                }
                if (field402[var44] == 9) {
                    int var53 = 150 - field404[var44];
                    if (var53 < 50) {
                        var52 = var53 * 1280 + 16711680;
                    } else if (var53 < 100) {
                        var52 = 16776960 - (var53 - 50) * 327680;
                    } else if (var53 < 150) {
                        var52 = (var53 - 100) * 5 + 65280;
                    }
                }
                if (field402[var44] == 10) {
                    int var54 = 150 - field404[var44];
                    if (var54 < 50) {
                        var52 = var54 * 5 + 16711680;
                    } else if (var54 < 100) {
                        var52 = 16711935 - (var54 - 50) * 327680;
                    } else if (var54 < 150) {
                        var52 = (var54 - 100) * 327680 + 255 - (var54 - 100) * 5;
                    }
                }
                if (field402[var44] == 11) {
                    int var55 = 150 - field404[var44];
                    if (var55 < 50) {
                        var52 = 16777215 - var55 * 327685;
                    } else if (var55 < 100) {
                        var52 = (var55 - 50) * 327685 + 65280;
                    } else if (var55 < 150) {
                        var52 = 16777215 - (var55 - 100) * 327680;
                    }
                }
                if (field533[var44] == 0) {
                    Statics.field1120.method3735(var51, field408 + var9, field409 + var10, var52, 0);
                }
                if (field533[var44] == 1) {
                    Statics.field1120.method3681(var51, field408 + var9, field409 + var10, var52, 0, field338);
                }
                if (field533[var44] == 2) {
                    Statics.field1120.method3682(var51, field408 + var9, field409 + var10, var52, 0, field338);
                }
                if (field533[var44] == 3) {
                    Statics.field1120.method3690(var51, field408 + var9, field409 + var10, var52, 0, field338, 150 - field404[var44]);
                }
                if (field533[var44] == 4) {
                    int var56 = (150 - field404[var44]) * (Statics.field1120.method3672(var51) + 100) / 150;
                    class220.method3774(field408 + var9 - 50, var10, field408 + var9 + 50, var10 + var12);
                    Statics.field1120.method3702(var51, field408 + var9 + 50 - var56, field409 + var10, var52, 0);
                    class220.method3773(var9, var10, var9 + var11, var10 + var12);
                }
                if (field533[var44] == 5) {
                    int var57 = 150 - field404[var44];
                    int var58 = 0;
                    if (var57 < 25) {
                        var58 = var57 - 25;
                    } else if (var57 > 125) {
                        var58 = var57 - 125;
                    }
                    class220.method3774(var9, field409 + var10 - Statics.field1120.field3118 - 1, var9 + var11, field409 + var10 + 5);
                    Statics.field1120.method3735(var51, field408 + var9, field409 + var10 + var58, var52, 0);
                    class220.method3773(var9, var10, var9 + var11, var10 + var12);
                }
            } else {
                Statics.field1120.method3735(var51, field408 + var9, field409 + var10, 16776960, 0);
            }
        }
        if (field321 == 2) {
            method3083((field324 - Statics.field1880 << 7) + field502, (field394 - Statics.field2792 << 7) + field328, field467 * 2);
            if (field408 > -1 && field312 % 20 < 10) {
                Statics.field171[0].method3891(field408 + var9 - 12, field409 + var10 - 28);
            }
        }
        ((class75) Statics.field1473).method1381(field512);
        if (field413 == 1) {
            Statics.field772[field313 / 100].method3891(field558 - 8, field411 - 8);
        }
        if (field413 == 2) {
            Statics.field772[field313 / 100 + 4].method3891(field558 - 8, field411 - 8);
        }
        field422 = 0;
        int var59 = (Statics.field899.field625 >> 7) + Statics.field1880;
        int var60 = (Statics.field899.field620 >> 7) + Statics.field2792;
        if (var59 >= 3053 && var59 <= 3156 && var60 >= 3056 && var60 <= 3136) {
            field422 = 1;
        }
        if (var59 >= 3072 && var59 <= 3118 && var60 >= 9492 && var60 <= 9535) {
            field422 = 1;
        }
        if (field422 == 1 && var59 >= 3139 && var59 <= 3199 && var60 >= 3008 && var60 <= 3062) {
            field422 = 0;
        }
        Statics.field245 = var28;
        Statics.field186 = var29;
        Statics.field1628 = var30;
        Statics.field182 = var31;
        Statics.field83 = var32;
        if (field579 && class186.method1368(true, false) == 0) {
            field579 = false;
        }
        if (field579) {
            class220.method3779(var9, var10, var11, var12, 0);
            method2083(class174.field2467, false);
        }
    }

    @ObfuscatedName("q.ao(IIIIZI)V")
    public static final void method155(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field559 - field326) * var5 / 100 + field326;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field564) {
            short var8 = field564;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field563) {
                var6 = field563;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class220.method3772();
                    class220.method3779(arg0, arg1, var10, arg3, -16777216);
                    class220.method3779(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field565) {
            short var11 = field565;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field506) {
                var6 = field506;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class220.method3772();
                    class220.method3779(arg0, arg1, arg2, var13, -16777216);
                    class220.method3779(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field561 - field560) * var5 / 100 + field560;
        field570 = arg3 * var6 * var14 / 85504 << 1;
        if (field568 != arg2 || field569 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class85.field1476[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class88.method1723(var15, 500, 800, arg2, arg3);
        }
        field566 = arg0;
        field567 = arg1;
        field568 = arg2;
        field569 = arg3;
    }

    @ObfuscatedName("j.ae(Ly;B)V")
    public static final void method116(class16 arg0) {
        if (Statics.field899.field625 >> 7 == field538 && Statics.field899.field620 >> 7 == field435) {
            field538 = 0;
        }
        int var1 = class46.field924;
        int[] var2 = class46.field919;
        int var3 = var1;
        if (class16.field175 == arg0 || class16.field168 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class24 var5;
            int var6;
            if (class16.field175 == arg0) {
                var5 = Statics.field899;
                var6 = Statics.field899.field267 << 14;
            } else if (class16.field168 == arg0) {
                var5 = field423[field341];
                var6 = field341 << 14;
            } else {
                var5 = field423[var2[var4]];
                var6 = var2[var4] << 14;
                if (class16.field170 == arg0 && field341 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method213() && !var5.field266) {
                var5.field274 = false;
                if ((field307 && var1 > 50 || var1 > 200) && class16.field175 != arg0 && var5.field648 == var5.field624) {
                    var5.field274 = true;
                }
                int var7 = var5.field625 >> 7;
                int var8 = var5.field620 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field258 == null || field312 < var5.field278 || field312 >= var5.field265) {
                        if ((var5.field625 & 0x7F) == 64 && (var5.field620 & 0x7F) == 64) {
                            if (field338 == field406[var7][var8]) {
                                continue;
                            }
                            field406[var7][var8] = field338;
                        }
                        var5.field263 = method1906(var5.field625, var5.field620, Statics.field3063);
                        Statics.field688.method1660(Statics.field3063, var5.field625, var5.field620, var5.field263, 60, var5, var5.field671, var6, var5.field622);
                    } else {
                        var5.field274 = false;
                        var5.field263 = method1906(var5.field625, var5.field620, Statics.field3063);
                        Statics.field688.method1661(Statics.field3063, var5.field625, var5.field620, var5.field263, 60, var5, var5.field671, var6, var5.field270, var5.field271, var5.field272, var5.field273);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cm.aa(ZI)V")
    public static final void method1845(boolean arg0) {
        for (int var1 = 0; var1 < field403; var1++) {
            class36 var2 = field412[field343[var1]];
            int var3 = (field343[var1] << 14) + 536870912;
            if (var2 != null && var2.method213() && var2.field783.field3031 == arg0 && var2.field783.method3518()) {
                int var4 = var2.field625 >> 7;
                int var5 = var2.field620 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field623 == 1 && (var2.field625 & 0x7F) == 64 && (var2.field620 & 0x7F) == 64) {
                        if (field338 == field406[var4][var5]) {
                            continue;
                        }
                        field406[var4][var5] = field338;
                    }
                    if (!var2.field783.field3021) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field688.method1660(Statics.field3063, var2.field625, var2.field620, method1906(var2.field625 + (var2.field623 * 64 - 64), var2.field620 + (var2.field623 * 64 - 64), Statics.field3063), var2.field623 * 64 - 64 + 60, var2, var2.field671, var3, var2.field622);
                }
            }
        }
    }

    @ObfuscatedName("ak.as(B)V")
    public static final void method737() {
        for (class43 var0 = (class43) field586.method2301(); var0 != null; var0 = (class43) field586.method2309()) {
            if (Statics.field3063 != var0.field875 || field312 > var0.field895) {
                var0.method2289();
            } else if (field312 >= var0.field880) {
                if (var0.field884 > 0) {
                    class36 var1 = field412[var0.field884 - 1];
                    if (var1 != null && var1.field625 >= 0 && var1.field625 < 13312 && var1.field620 >= 0 && var1.field620 < 13312) {
                        var0.method803(var1.field625, var1.field620, method1906(var1.field625, var1.field620, var0.field875) - var0.field879, field312);
                    }
                }
                if (var0.field884 < 0) {
                    int var2 = -var0.field884 - 1;
                    class24 var3;
                    if (field386 == var2) {
                        var3 = Statics.field899;
                    } else {
                        var3 = field423[var2];
                    }
                    if (var3 != null && var3.field625 >= 0 && var3.field625 < 13312 && var3.field620 >= 0 && var3.field620 < 13312) {
                        var0.method803(var3.field625, var3.field620, method1906(var3.field625, var3.field620, var0.field875) - var0.field879, field312);
                    }
                }
                var0.method808(field512);
                Statics.field688.method1660(Statics.field3063, (int) var0.field886, (int) var0.field885, (int) var0.field888, 60, var0, var0.field896, -1, false);
            }
        }
    }

    @ObfuscatedName("n.al(I)I")
    public static final int method88() {
        if (Statics.field2059.field717) {
            return Statics.field3063;
        } else {
            int var0 = method1906(Statics.field245, Statics.field1628, Statics.field3063);
            return var0 - Statics.field186 >= 800 || (class11.field86[Statics.field3063][Statics.field245 >> 7][Statics.field1628 >> 7] & 0x4) == 0 ? 3 : Statics.field3063;
        }
    }

    @ObfuscatedName("fr.az(Lan;IIIIII)V")
    public static final void method3088(class28 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method213()) {
            return;
        }
        if (arg0 instanceof class36) {
            class200 var6 = ((class36) arg0).field783;
            if (var6.field3036 != null) {
                var6 = var6.method3517();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class46.field924;
        int[] var8 = class46.field919;
        int var9 = 3;
        if (!arg0.field637.method2266()) {
            method57(arg0, arg0.field677 + 15);
            for (class35 var10 = (class35) arg0.field637.method2279(); var10 != null; var10 = (class35) arg0.field637.method2270()) {
                class29 var11 = var10.method720(field312);
                if (var11 != null) {
                    class194 var12 = var10.field775;
                    class225 var13 = var12.method3350();
                    class225 var14 = var12.method3349();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field2844;
                    } else {
                        if (var12.field2854 * 2 < var14.field3220) {
                            var15 = var12.field2854;
                        }
                        var16 = var14.field3220 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field312 - var11.field685;
                    int var20 = var11.field682 * var16 / var12.field2844;
                    int var23;
                    if (var11.field691 > var19) {
                        int var21 = var12.field2849 == 0 ? 0 : var19 / var12.field2849 * var12.field2849;
                        int var22 = var11.field681 * var16 / var12.field2844;
                        var23 = (var20 - var22) * var21 / var11.field691 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field691 + var12.field2841 - var19;
                        if (var12.field2848 >= 0) {
                            var17 = (var24 << 8) / (var12.field2841 - var12.field2848);
                        }
                    }
                    if (var11.field682 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field408 + arg2 - (var16 >> 1);
                    int var26 = field409 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field408 > -1) {
                            class220.method3779(var25, var26, var23, 5, 65280);
                            class220.method3779(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3222;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method3897(var27, var26, var17);
                            class220.method3774(var27, var26, var27 + var28, var26 + var29);
                            var14.method3897(var27, var26, var17);
                        } else {
                            var13.method3891(var27, var26);
                            class220.method3774(var27, var26, var27 + var28, var26 + var29);
                            var14.method3891(var27, var26);
                        }
                        class220.method3773(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method716()) {
                    var10.method2289();
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
            if (var30.field275 != -1 || var30.field259 != -1) {
                method57(arg0, arg0.field677 + 15);
                if (field408 > -1) {
                    if (var30.field275 != -1) {
                        Statics.field1083[var30.field275].method3891(field408 + arg2 - 12, field409 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field259 != -1) {
                        Statics.field109[var30.field259].method3891(field408 + arg2 - 12, field409 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field321 == 10 && field323 == var8[arg1]) {
                method57(arg0, arg0.field677 + 15);
                if (field408 > -1) {
                    Statics.field171[1].method3891(field408 + arg2 - 12, field409 + arg3 - var9);
                }
            }
        } else {
            class200 var31 = ((class36) arg0).field783;
            if (var31.field3036 != null) {
                var31 = var31.method3517();
            }
            if (var31.field3034 >= 0 && var31.field3034 < Statics.field109.length) {
                method57(arg0, arg0.field677 + 15);
                if (field408 > -1) {
                    Statics.field109[var31.field3034].method3891(field408 + arg2 - 12, field409 + arg3 - 30);
                }
            }
            if (field321 == 1 && field342 == field343[arg1 - var7] && field312 % 20 < 10) {
                method57(arg0, arg0.field677 + 15);
                if (field408 > -1) {
                    Statics.field171[0].method3891(field408 + arg2 - 12, field409 + arg3 - 28);
                }
            }
        }
        if (arg0.field632 != null && (arg1 >= var7 || !arg0.field649 && (field522 == 4 || !arg0.field633 && (field522 == 0 || field522 == 3 || field522 == 1 && method138(((class24) arg0).field279, false))))) {
            method57(arg0, arg0.field677);
            if (field408 > -1 && field396 < field397) {
                field445[field396] = Statics.field1120.method3672(arg0.field632) / 2;
                field400[field396] = Statics.field1120.field3118;
                field398[field396] = field408;
                field381[field396] = field409;
                field402[field396] = arg0.field636;
                field533[field396] = arg0.field619;
                field404[field396] = arg0.field657;
                field405[field396] = arg0.field632;
                field396++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field645[var32];
            int var34 = arg0.field658[var32];
            class197 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field312) {
                    continue;
                }
                var35 = class197.method2099(arg0.field658[var32]);
                var36 = var35.field2882;
                if (var35 != null && var35.field2893 != null) {
                    var35 = var35.method3381();
                    if (var35 == null) {
                        arg0.field645[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field642[var32];
            class197 var38 = null;
            if (var37 >= 0) {
                var38 = class197.method2099(var37);
                if (var38 != null && var38.field2893 != null) {
                    var38 = var38.method3381();
                }
            }
            if (var33 - var36 <= field312) {
                if (var35 == null) {
                    arg0.field645[var32] = -1;
                } else {
                    method57(arg0, arg0.field677 / 2);
                    if (field408 > -1) {
                        if (var32 == 1) {
                            field409 -= 20;
                        }
                        if (var32 == 2) {
                            field408 -= 15;
                            field409 -= 10;
                        }
                        if (var32 == 3) {
                            field408 += 15;
                            field409 -= 10;
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
                        class225 var64 = var35.method3385();
                        if (var64 != null) {
                            var43 = var64.field3220;
                            int var65 = var64.field3222;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3225;
                        }
                        class225 var66 = var35.method3386();
                        if (var66 != null) {
                            var44 = var66.field3220;
                            int var67 = var66.field3222;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3225;
                        }
                        class225 var68 = var35.method3387();
                        if (var68 != null) {
                            var45 = var68.field3220;
                            int var69 = var68.field3222;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3225;
                        }
                        class225 var70 = var35.method3388();
                        if (var70 != null) {
                            var46 = var70.field3220;
                            int var71 = var70.field3222;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3225;
                        }
                        if (var38 != null) {
                            var51 = var38.method3385();
                            if (var51 != null) {
                                var55 = var51.field3220;
                                int var72 = var51.field3222;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3225;
                            }
                            var52 = var38.method3386();
                            if (var52 != null) {
                                var56 = var52.field3220;
                                int var73 = var52.field3222;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3225;
                            }
                            var53 = var38.method3387();
                            if (var53 != null) {
                                var57 = var53.field3220;
                                int var74 = var53.field3222;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3225;
                            }
                            var54 = var38.method3388();
                            if (var54 != null) {
                                var58 = var54.field3220;
                                int var75 = var54.field3222;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3225;
                            }
                        }
                        class209 var76 = var35.method3389();
                        if (var76 == null) {
                            var76 = Statics.field2718;
                        }
                        class209 var77;
                        if (var38 == null) {
                            var77 = Statics.field2718;
                        } else {
                            var77 = var38.method3389();
                            if (var77 == null) {
                                var77 = Statics.field2718;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method3384(arg0.field640[var32]);
                        int var83 = var76.method3672(var82);
                        if (var38 != null) {
                            var79 = var38.method3384(arg0.field643[var32]);
                            var81 = var77.method3672(var79);
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
                        int var100 = arg0.field645[var32] - field312;
                        int var101 = var35.field2887 - var35.field2887 * var100 / var35.field2882;
                        int var102 = var35.field2874 * var100 / var35.field2882 + -var35.field2874;
                        int var103 = field408 + arg2 - (var92 >> 1) + var101;
                        int var104 = field409 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field2892 + var104 + 15;
                        int var108 = var107 - var76.field3119;
                        int var109 = var76.field3120 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field2892 + var104 + 15;
                            int var111 = var110 - var77.field3119;
                            int var112 = var77.field3120 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field2881 >= 0) {
                            var115 = (var100 << 8) / (var35.field2882 - var35.field2881);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method3897(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method3897(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method3897(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method3897(var93 + var103 - var50, var104, var115);
                            }
                            var76.method3677(var82, var90 + var103, var107, var35.field2883, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method3897(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method3897(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method3897(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method3897(var97 + var103 - var62, var104, var115);
                                }
                                var77.method3677(var79, var98 + var103, var110, var38.field2883, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method3891(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method3891(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method3891(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method3891(var93 + var103 - var50, var104);
                            }
                            var76.method3702(var82, var90 + var103, var107, var35.field2883 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method3891(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method3891(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method3891(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method3891(var97 + var103 - var62, var104);
                                }
                                var77.method3702(var79, var98 + var103, var110, var38.field2883 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.ay(Lan;II)V")
    public static final void method57(class28 arg0, int arg1) {
        method3083(arg0.field625, arg0.field620, arg1);
    }

    @ObfuscatedName("fr.ac(IIII)V")
    public static final void method3083(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field408 = -1;
            field409 = -1;
            return;
        }
        int var3 = method1906(arg0, arg1, Statics.field3063) - arg2;
        int var4 = arg0 - Statics.field245;
        int var5 = var3 - Statics.field186;
        int var6 = arg1 - Statics.field1628;
        int var7 = class85.field1476[Statics.field182];
        int var8 = class85.field1470[Statics.field182];
        int var9 = class85.field1476[Statics.field83];
        int var10 = class85.field1470[Statics.field83];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field408 = field570 * var11 / var15 + field568 / 2;
            field409 = field570 * var14 / var15 + field569 / 2;
        } else {
            field408 = -1;
            field409 = -1;
        }
    }

    @ObfuscatedName("cd.af(IIIB)I")
    public static final int method1906(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class11.field86[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class11.field103[var5][var3][var4] + class11.field103[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class11.field103[var5][var3][var4 + 1] + class11.field103[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("cm.bc(IIIIIII)V")
    public static final void method1846(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class85.field1476[var6];
            int var12 = class85.field1470[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class85.field1476[var7];
            int var15 = class85.field1470[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field245 = arg0 - var8;
        Statics.field186 = arg1 - var9;
        Statics.field1628 = arg2 - var10;
        Statics.field182 = arg3;
        Statics.field83 = arg4;
    }

    @ObfuscatedName("gb.bh(ZB)V")
    public static final void method3188(boolean arg0) {
        field364 = arg0;
        if (!field364) {
            int var1 = field348.method2668();
            int var2 = field348.method2703();
            int var3 = field348.method2668();
            Statics.field870 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field870[var4][var5] = field348.method2695();
                }
            }
            Statics.field601 = new int[var3];
            Statics.field916 = new int[var3];
            Statics.field297 = new int[var3];
            Statics.field1485 = new byte[var3][];
            Statics.field1594 = new byte[var3][];
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
                        Statics.field601[var7] = var10;
                        Statics.field916[var7] = Statics.field3097.method3132("m" + var8 + "_" + var9);
                        Statics.field297[var7] = Statics.field3097.method3132("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method62(var2, var1);
            return;
        }
        int var11 = field348.method2702();
        int var12 = field348.method2652();
        int var13 = field348.method2668();
        field348.method2891();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field348.method2900(1);
                    if (var17 == 1) {
                        field365[var14][var15][var16] = field348.method2900(26);
                    } else {
                        field365[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field348.method2892();
        Statics.field870 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field870[var18][var19] = field348.method2695();
            }
        }
        Statics.field601 = new int[var13];
        Statics.field916 = new int[var13];
        Statics.field297 = new int[var13];
        Statics.field1485 = new byte[var13][];
        Statics.field1594 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field365[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field601[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field601[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field916[var20] = Statics.field3097.method3132("m" + var29 + "_" + var30);
                            Statics.field297[var20] = Statics.field3097.method3132("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method62(var12, var11);
    }

    @ObfuscatedName("o.bj(III)V")
    public static final void method62(int arg0, int arg1) {
        if (Statics.field162 == arg0 && Statics.field2057 == arg1) {
            return;
        }
        Statics.field162 = arg0;
        Statics.field2057 = arg1;
        method1850(25);
        method2083(class174.field2467, true);
        int var2 = Statics.field1880;
        int var3 = Statics.field2792;
        Statics.field1880 = (arg0 - 6) * 8;
        Statics.field2792 = (arg1 - 6) * 8;
        int var4 = Statics.field1880 - var2;
        int var5 = Statics.field2792 - var3;
        int var6 = Statics.field1880;
        int var7 = Statics.field2792;
        for (int var8 = 0; var8 < 32768; var8++) {
            class36 var9 = field412[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field674[var10] -= var4;
                    var9.field675[var10] -= var5;
                }
                var9.field625 -= var4 * 128;
                var9.field620 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class24 var12 = field423[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field674[var13] -= var4;
                    var12.field675[var13] -= var5;
                }
                var12.field625 -= var4 * 128;
                var12.field620 -= var5 * 128;
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
                        field433[var24][var20][var21] = field433[var24][var22][var23];
                    } else {
                        field433[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class26 var25 = (class26) field462.method2301(); var25 != null; var25 = (class26) field462.method2309()) {
            var25.field600 -= var4;
            var25.field598 -= var5;
            if (var25.field600 < 0 || var25.field598 < 0 || var25.field600 >= 104 || var25.field598 >= 104) {
                var25.method2289();
            }
        }
        if (field538 != 0) {
            field538 -= var4;
            field435 -= var5;
        }
        field546 = 0;
        field447 = false;
        field460 = -1;
        field392.method2295();
        field586.method2295();
        for (int var26 = 0; var26 < 4; var26++) {
            field527[var26].method2187();
        }
    }

    @ObfuscatedName("ad.br(ZI)V")
    public static final void method799(boolean arg0) {
        method593();
        field437++;
        if (field437 < 50 && !arg0) {
            return;
        }
        field437 = 0;
        if (field518 || Statics.field234 == null) {
            return;
        }
        field495.method2889(210);
        try {
            Statics.field234.method1978(field495.field2114, 0, field495.field2111);
            field495.field2111 = 0;
        } catch (IOException var2) {
            field518 = true;
        }
    }

    @ObfuscatedName("client.bk(I)V")
    public static final void method264() {
        method799(false);
        field358 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1485.length; var1++) {
            if (Statics.field916[var1] != -1 && Statics.field1485[var1] == null) {
                Statics.field1485[var1] = Statics.field3097.method3163(Statics.field916[var1], 0);
                if (Statics.field1485[var1] == null) {
                    var0 = false;
                    field358++;
                }
            }
            if (Statics.field297[var1] != -1 && Statics.field1594[var1] == null) {
                Statics.field1594[var1] = Statics.field3097.method3150(Statics.field297[var1], 0, Statics.field870[var1]);
                if (Statics.field1594[var1] == null) {
                    var0 = false;
                    field358++;
                }
            }
        }
        if (!var0) {
            field536 = 1;
            return;
        }
        field360 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1485.length; var3++) {
            byte[] var4 = Statics.field1594[var3];
            if (var4 != null) {
                int var5 = (Statics.field601[var3] >> 8) * 64 - Statics.field1880;
                int var6 = (Statics.field601[var3] & 0xFF) * 64 - Statics.field2792;
                if (field364) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class11.method812(var4, var5, var6);
            }
        }
        if (!var2) {
            field536 = 2;
            return;
        }
        if (field536 != 0) {
            method2083(class174.field2467 + class38.field808 + class38.field812 + 100 + "%" + class38.field807, true);
        }
        method593();
        method190();
        method593();
        Statics.field688.method1649();
        method593();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field527[var7].method2187();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class11.field86[var8][var9][var10] = 0;
                }
            }
        }
        method593();
        class11.field87 = 99;
        Statics.field88 = new byte[4][104][104];
        Statics.field1 = new byte[4][104][104];
        Statics.field30 = new byte[4][104][104];
        Statics.field1762 = new byte[4][104][104];
        Statics.field2167 = new int[4][105][105];
        Statics.field220 = new byte[4][105][105];
        Statics.field689 = new int[105][105];
        Statics.field95 = new int[104];
        Statics.field713 = new int[104];
        Statics.field10 = new int[104];
        Statics.field3 = new int[104];
        Statics.field3244 = new int[104];
        int var11 = Statics.field1485.length;
        for (class32 var12 = (class32) class32.field733.method2301(); var12 != null; var12 = (class32) class32.field733.method2309()) {
            if (var12.field737 != null) {
                Statics.field225.method921(var12.field737);
                var12.field737 = null;
            }
            if (var12.field736 != null) {
                Statics.field225.method921(var12.field736);
                var12.field736 = null;
            }
        }
        class32.field733.method2295();
        method799(true);
        if (!field364) {
            for (int var13 = 0; var13 < var11; var13++) {
                int var14 = (Statics.field601[var13] >> 8) * 64 - Statics.field1880;
                int var15 = (Statics.field601[var13] & 0xFF) * 64 - Statics.field2792;
                byte[] var16 = Statics.field1485[var13];
                if (var16 != null) {
                    method593();
                    class11.method197(var16, var14, var15, Statics.field162 * 8 - 48, Statics.field2057 * 8 - 48, field527);
                }
            }
            for (int var17 = 0; var17 < var11; var17++) {
                int var18 = (Statics.field601[var17] >> 8) * 64 - Statics.field1880;
                int var19 = (Statics.field601[var17] & 0xFF) * 64 - Statics.field2792;
                byte[] var20 = Statics.field1485[var17];
                if (var20 == null && Statics.field2057 < 800) {
                    method593();
                    class11.method234(var18, var19, 64, 64);
                }
            }
            method799(true);
            for (int var21 = 0; var21 < var11; var21++) {
                byte[] var22 = Statics.field1594[var21];
                if (var22 != null) {
                    int var23 = (Statics.field601[var21] >> 8) * 64 - Statics.field1880;
                    int var24 = (Statics.field601[var21] & 0xFF) * 64 - Statics.field2792;
                    method593();
                    class11.method76(var22, var23, var24, Statics.field688, field527);
                }
            }
        }
        if (field364) {
            for (int var25 = 0; var25 < 4; var25++) {
                method593();
                for (int var26 = 0; var26 < 13; var26++) {
                    for (int var27 = 0; var27 < 13; var27++) {
                        boolean var28 = false;
                        int var29 = field365[var25][var26][var27];
                        if (var29 != -1) {
                            int var30 = var29 >> 24 & 0x3;
                            int var31 = var29 >> 1 & 0x3;
                            int var32 = var29 >> 14 & 0x3FF;
                            int var33 = var29 >> 3 & 0x7FF;
                            int var34 = (var32 / 8 << 8) + var33 / 8;
                            for (int var35 = 0; var35 < Statics.field601.length; var35++) {
                                if (Statics.field601[var35] == var34 && Statics.field1485[var35] != null) {
                                    class11.method178(Statics.field1485[var35], var25, var26 * 8, var27 * 8, var30, (var32 & 0x7) * 8, (var33 & 0x7) * 8, var31, field527);
                                    var28 = true;
                                    break;
                                }
                            }
                        }
                        if (!var28) {
                            int var36 = var25;
                            int var37 = var26 * 8;
                            int var38 = var27 * 8;
                            for (int var39 = 0; var39 < 8; var39++) {
                                for (int var40 = 0; var40 < 8; var40++) {
                                    class11.field103[var36][var37 + var39][var38 + var40] = 0;
                                }
                            }
                            if (var37 > 0) {
                                for (int var41 = 1; var41 < 8; var41++) {
                                    class11.field103[var36][var37][var38 + var41] = class11.field103[var36][var37 - 1][var38 + var41];
                                }
                            }
                            if (var38 > 0) {
                                for (int var42 = 1; var42 < 8; var42++) {
                                    class11.field103[var36][var37 + var42][var38] = class11.field103[var36][var37 + var42][var38 - 1];
                                }
                            }
                            if (var37 > 0 && class11.field103[var36][var37 - 1][var38] != 0) {
                                class11.field103[var36][var37][var38] = class11.field103[var36][var37 - 1][var38];
                            } else if (var38 > 0 && class11.field103[var36][var37][var38 - 1] != 0) {
                                class11.field103[var36][var37][var38] = class11.field103[var36][var37][var38 - 1];
                            } else if (var37 > 0 && var38 > 0 && class11.field103[var36][var37 - 1][var38 - 1] != 0) {
                                class11.field103[var36][var37][var38] = class11.field103[var36][var37 - 1][var38 - 1];
                            }
                        }
                    }
                }
            }
            for (int var43 = 0; var43 < 13; var43++) {
                for (int var44 = 0; var44 < 13; var44++) {
                    int var45 = field365[0][var43][var44];
                    if (var45 == -1) {
                        class11.method234(var43 * 8, var44 * 8, 8, 8);
                    }
                }
            }
            method799(true);
            for (int var46 = 0; var46 < 4; var46++) {
                method593();
                for (int var47 = 0; var47 < 13; var47++) {
                    label322: for (int var48 = 0; var48 < 13; var48++) {
                        int var49 = field365[var46][var47][var48];
                        if (var49 != -1) {
                            int var50 = var49 >> 24 & 0x3;
                            int var51 = var49 >> 1 & 0x3;
                            int var52 = var49 >> 14 & 0x3FF;
                            int var53 = var49 >> 3 & 0x7FF;
                            int var54 = (var52 / 8 << 8) + var53 / 8;
                            for (int var55 = 0; var55 < Statics.field601.length; var55++) {
                                if (Statics.field601[var55] == var54 && Statics.field1594[var55] != null) {
                                    byte[] var56 = Statics.field1594[var55];
                                    int var57 = var47 * 8;
                                    int var58 = var48 * 8;
                                    int var59 = (var52 & 0x7) * 8;
                                    int var60 = (var53 & 0x7) * 8;
                                    class88 var61 = Statics.field688;
                                    class118[] var62 = field527;
                                    class154 var63 = new class154(var56);
                                    int var64 = -1;
                                    while (true) {
                                        int var65 = var63.method2679();
                                        if (var65 == 0) {
                                            continue label322;
                                        }
                                        var64 += var65;
                                        int var66 = 0;
                                        while (true) {
                                            int var67 = var63.method2679();
                                            if (var67 == 0) {
                                                break;
                                            }
                                            var66 += var67 - 1;
                                            int var68 = var66 & 0x3F;
                                            int var69 = var66 >> 6 & 0x3F;
                                            int var70 = var66 >> 12;
                                            int var71 = var63.method2666();
                                            int var72 = var71 >> 2;
                                            int var73 = var71 & 0x3;
                                            if (var50 == var70 && var69 >= var59 && var69 < var59 + 8 && var68 >= var60 && var68 < var60 + 8) {
                                                class198 var74 = class198.method2502(var64);
                                                int var76 = var69 & 0x7;
                                                int var77 = var68 & 0x7;
                                                int var79 = var74.field2943;
                                                int var80 = var74.field2914;
                                                if ((var73 & 0x1) == 1) {
                                                    int var81 = var79;
                                                    var79 = var80;
                                                    var80 = var81;
                                                }
                                                int var82 = var51 & 0x3;
                                                int var83;
                                                if (var82 == 0) {
                                                    var83 = var76;
                                                } else if (var82 == 1) {
                                                    var83 = var77;
                                                } else if (var82 == 2) {
                                                    var83 = 7 - var76 - (var79 - 1);
                                                } else {
                                                    var83 = 7 - var77 - (var80 - 1);
                                                }
                                                int var84 = var57 + var83;
                                                int var85 = var58 + class169.method3365(var69 & 0x7, var68 & 0x7, var51, var74.field2943, var74.field2914, var73);
                                                if (var84 > 0 && var85 > 0 && var84 < 103 && var85 < 103) {
                                                    int var86 = var46;
                                                    if ((class11.field86[1][var84][var85] & 0x2) == 2) {
                                                        var86 = var46 - 1;
                                                    }
                                                    class118 var87 = null;
                                                    if (var86 >= 0) {
                                                        var87 = var62[var86];
                                                    }
                                                    class11.method3097(var46, var84, var85, var64, var51 + var73 & 0x3, var72, var61, var87);
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
        method799(true);
        method190();
        method593();
        class11.method1963(Statics.field688, field527);
        method799(true);
        int var88 = class11.field87;
        if (var88 > Statics.field3063) {
            var88 = Statics.field3063;
        }
        if (var88 < Statics.field3063 - 1) {
            int var89 = Statics.field3063 - 1;
        }
        if (field307) {
            Statics.field688.method1753(class11.field87);
        } else {
            Statics.field688.method1753(0);
        }
        for (int var90 = 0; var90 < 104; var90++) {
            for (int var91 = 0; var91 < 104; var91++) {
                method350(var90, var91);
            }
        }
        method593();
        for (class26 var92 = (class26) field462.method2301(); var92 != null; var92 = (class26) field462.method2309()) {
            if (var92.field599 == -1) {
                var92.field590 = 0;
                method553(var92);
            } else {
                var92.method2289();
            }
        }
        class198.field2913.method2244();
        if (Statics.field1861 != null) {
            field495.method2889(6);
            field495.method2654(1057001181);
        }
        if (!field364) {
            int var93 = (Statics.field162 - 6) / 8;
            int var94 = (Statics.field162 + 6) / 8;
            int var95 = (Statics.field2057 - 6) / 8;
            int var96 = (Statics.field2057 + 6) / 8;
            for (int var97 = var93 - 1; var97 <= var94 + 1; var97++) {
                for (int var98 = var95 - 1; var98 <= var96 + 1; var98++) {
                    if (var97 < var93 || var97 > var94 || var98 < var95 || var98 > var96) {
                        Statics.field3097.method3137("m" + var97 + "_" + var98);
                        Statics.field3097.method3137("l" + var97 + "_" + var98);
                    }
                }
            }
        }
        method1850(30);
        method593();
        Statics.field88 = (byte[][][]) null;
        Statics.field1 = (byte[][][]) null;
        Statics.field30 = (byte[][][]) null;
        Statics.field1762 = (byte[][][]) null;
        Statics.field2167 = (int[][][]) null;
        Statics.field220 = (byte[][][]) null;
        Statics.field689 = (int[][]) null;
        Statics.field95 = null;
        Statics.field713 = null;
        Statics.field10 = null;
        Statics.field3 = null;
        Statics.field3244 = null;
        field495.method2889(66);
        class114.method1479();
    }

    @ObfuscatedName("k.bu(II)V")
    public static final void method204(int arg0) {
        int[] var1 = Statics.field687.field3229;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class11.field86[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field688.method1683(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class11.field86[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field688.method1683(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field687.method3881();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class11.field86[arg0][var10][var9] & 0x18) == 0) {
                    method196(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class11.field86[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method196(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field534 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field688.method1758(Statics.field3063, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class198.method2502(var14).field2926;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field527[Statics.field3063].field1863;
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
                        field537[field534] = Statics.field172[var15];
                        field535[field534] = var16;
                        field436[field534] = var17;
                        field534++;
                    }
                }
            }
        }
        Statics.field1828.method3843();
    }

    @ObfuscatedName("b.by(IIIIII)V")
    public static final void method196(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field688.method1675(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field688.method1679(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field687.field3229;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class198 var13 = class198.method2502(var12);
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
                class223 var14 = Statics.field48[var13.field2927];
                if (var14 != null) {
                    int var15 = (var13.field2943 * 4 - var14.field3214) / 2;
                    int var16 = (var13.field2914 * 4 - var14.field3211) / 2;
                    var14.method3846(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field2914) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field688.method1687(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field688.method1679(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class198 var22 = class198.method2502(var21);
            if (var22.field2927 != -1) {
                class223 var23 = Statics.field48[var22.field2927];
                if (var23 != null) {
                    int var24 = (var22.field2943 * 4 - var23.field3214) / 2;
                    int var25 = (var22.field2914 * 4 - var23.field3211) / 2;
                    var23.method3846(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field2914) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field687.field3229;
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
        int var29 = Statics.field688.method1758(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class198 var31 = class198.method2502(var30);
        if (var31.field2927 == -1) {
            return;
        }
        class223 var32 = Statics.field48[var31.field2927];
        if (var32 != null) {
            int var33 = (var31.field2943 * 4 - var32.field3214) / 2;
            int var34 = (var31.field2914 * 4 - var32.field3211) / 2;
            var32.method3846(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field2914) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("s.bl(B)Z")
    public static final boolean method146() {
        if (Statics.field234 == null) {
            return false;
        }
        try {
            int var0 = Statics.field234.method1981();
            if (var0 == 0) {
                return false;
            }
            if (field350 == -1) {
                Statics.field234.method1977(field348.field2114, 0, 1);
                field348.field2111 = 0;
                field350 = field348.method2894();
                field349 = class213.field3155[field350];
                var0--;
            }
            if (field349 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field234.method1977(field348.field2114, 0, 1);
                field349 = field348.field2114[0] & 0xFF;
                var0--;
            }
            if (field349 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field234.method1977(field348.field2114, 0, 2);
                field348.field2111 = 0;
                field349 = field348.method2668();
                var0 -= 2;
            }
            if (var0 < field349) {
                return false;
            }
            field348.field2111 = 0;
            Statics.field234.method1977(field348.field2114, 0, field349);
            field351 = 0;
            field355 = field425;
            field425 = field353;
            field353 = field350;
            if (field350 == 5) {
                int var1 = field348.method2814();
                int var2 = field348.method2850();
                String var3 = field348.method2674();
                if (var1 >= 1 && var1 <= 8) {
                    if (var3.equalsIgnoreCase("null")) {
                        var3 = null;
                    }
                    field429[var1 - 1] = var3;
                    field430[var1 - 1] = var2 == 0;
                }
                field350 = -1;
                return true;
            }
            if (field350 == 114) {
                Statics.field251 = field348.method2666();
                Statics.field1881 = field348.method2850();
                while (field348.field2111 < field349) {
                    field350 = field348.method2666();
                    method1133();
                }
                field350 = -1;
                return true;
            }
            if (field350 == 238) {
                method637();
                field469 = field348.method2666();
                field501 = field562;
                field350 = -1;
                return true;
            }
            if (field350 == 9) {
                boolean var4 = field348.method2666() == 1;
                int var5 = field348.method2711();
                class170 var6 = Statics.method1837(var5);
                if (var6.field2256 != var4) {
                    var6.field2256 = var4;
                    method198(var6);
                }
                field350 = -1;
                return true;
            }
            if (field350 == 7) {
                String var7 = field348.method2674();
                int var8 = field348.method2805();
                class170 var9 = Statics.method1837(var8);
                if (!var7.equals(var9.field2280)) {
                    var9.field2280 = var7;
                    method198(var9);
                }
                field350 = -1;
                return true;
            }
            if (field350 == 213) {
                field498 = field562;
                if (field349 == 0) {
                    field531 = null;
                    field416 = null;
                    Statics.field1449 = 0;
                    Statics.field2137 = null;
                    field350 = -1;
                    return true;
                }
                field416 = field348.method2674();
                long var10 = field348.method2726();
                long var12 = var10;
                String var14;
                if (var10 <= 0L || var10 >= 6582952005840035281L) {
                    var14 = null;
                } else if (var10 % 37L == 0L) {
                    var14 = null;
                } else {
                    int var15 = 0;
                    for (long var16 = var10; var16 != 0L; var16 /= 37L) {
                        var15++;
                    }
                    StringBuilder var18 = new StringBuilder(var15);
                    while (var12 != 0L) {
                        long var19 = var12;
                        var12 /= 37L;
                        var18.append(class206.field3093[(int) (var19 - var12 * 37L)]);
                    }
                    var14 = var18.reverse().toString();
                }
                field531 = var14;
                Statics.field960 = field348.method2667();
                int var21 = field348.method2666();
                if (var21 == 255) {
                    field350 = -1;
                    return true;
                }
                Statics.field1449 = var21;
                class25[] var22 = new class25[100];
                for (int var23 = 0; var23 < Statics.field1449; var23++) {
                    var22[var23] = new class25();
                    var22[var23].field290 = field348.method2674();
                    var22[var23].field292 = class205.method3259(var22[var23].field290, Statics.field215);
                    var22[var23].field287 = field348.method2668();
                    var22[var23].field288 = field348.method2667();
                    field348.method2674();
                    if (var22[var23].field290.equals(Statics.field899.field279)) {
                        Statics.field76 = var22[var23].field288;
                    }
                }
                boolean var24 = false;
                int var25 = Statics.field1449;
                while (var25 > 0) {
                    boolean var26 = true;
                    var25--;
                    for (int var27 = 0; var27 < var25; var27++) {
                        if (var22[var27].field292.compareTo(var22[var27 + 1].field292) > 0) {
                            class25 var28 = var22[var27];
                            var22[var27] = var22[var27 + 1];
                            var22[var27 + 1] = var28;
                            var26 = false;
                        }
                    }
                    if (var26) {
                        break;
                    }
                }
                Statics.field2137 = var22;
                field350 = -1;
                return true;
            }
            if (field350 == 103) {
                field540 = field348.method2666();
                field350 = -1;
                return true;
            }
            if (field350 == 48) {
                field320 = field348.method2703() * 30;
                field501 = field562;
                field350 = -1;
                return true;
            }
            if (field350 == 73) {
                int var29 = field348.method2805();
                int var30 = field348.method2668();
                class170 var31 = Statics.method1837(var29);
                if (var31.field2243 != 1 || var31.field2264 != var30) {
                    var31.field2243 = 1;
                    var31.field2264 = var30;
                    method198(var31);
                }
                field350 = -1;
                return true;
            }
            if (field350 == 88) {
                method1835();
                field350 = -1;
                return false;
            }
            if (field350 == 239) {
                class46.method572(field348, field349);
                field350 = -1;
                return true;
            }
            if (field350 == 178) {
                method637();
                field470 = field348.method2669();
                field501 = field562;
                field350 = -1;
                return true;
            }
            if (field350 == 83) {
                int var32 = field348.method2652();
                int var33 = field348.method2652();
                int var34 = field348.method2695();
                int var35 = field348.method2703();
                class170 var36 = Statics.method1837(var34);
                if (var36.field2271 != var35 || var36.field2272 != var33 || var36.field2321 != var32) {
                    var36.field2271 = var35;
                    var36.field2272 = var33;
                    var36.field2321 = var32;
                    method198(var36);
                }
                field350 = -1;
                return true;
            }
            if (field350 == 136) {
                int var37 = field348.method2652();
                int var38 = field348.method2805();
                class166.field2180[var37] = var38;
                if (class166.field2181[var37] != var38) {
                    class166.field2181[var37] = var38;
                }
                method551(var37);
                field490[++field491 - 1 & 0x1F] = var37;
                field350 = -1;
                return true;
            }
            if (field350 == 219) {
                int var39 = field348.method2695();
                int var40 = field348.method2712();
                int var41 = field348.method2652();
                if (var41 == 65535) {
                    var41 = -1;
                }
                class170 var42 = Statics.method1837(var40);
                if (var42.field2230) {
                    var42.field2340 = var41;
                    var42.field2222 = var39;
                    class199 var44 = class199.method3402(var41);
                    var42.field2271 = var44.field2965;
                    var42.field2272 = var44.field2966;
                    var42.field2273 = var44.field2967;
                    var42.field2269 = var44.field2968;
                    var42.field2270 = var44.field2969;
                    var42.field2321 = var44.field2979;
                    if (var44.field2958 == 1) {
                        var42.field2278 = 1;
                    } else {
                        var42.field2278 = 2;
                    }
                    if (var42.field2275 > 0) {
                        var42.field2321 = var42.field2321 * 32 / var42.field2275;
                    } else if (var42.field2231 > 0) {
                        var42.field2321 = var42.field2321 * 32 / var42.field2231;
                    }
                    method198(var42);
                } else if (var41 == -1) {
                    var42.field2243 = 0;
                    field350 = -1;
                    return true;
                } else {
                    class199 var43 = class199.method3402(var41);
                    var42.field2243 = 4;
                    var42.field2264 = var41;
                    var42.field2271 = var43.field2965;
                    var42.field2272 = var43.field2966;
                    var42.field2321 = var43.field2979 * 100 / var39;
                    method198(var42);
                }
                field350 = -1;
                return true;
            }
            if (field350 == 30) {
                int var45 = field348.method2695();
                int var46 = field348.method2668();
                if (var45 < -70000) {
                    var46 += 32768;
                }
                class170 var47;
                if (var45 >= 0) {
                    var47 = Statics.method1837(var45);
                } else {
                    var47 = null;
                }
                while (field348.field2111 < field349) {
                    int var48 = field348.method2679();
                    int var49 = field348.method2668();
                    int var50 = 0;
                    if (var49 != 0) {
                        var50 = field348.method2666();
                        if (var50 == 255) {
                            var50 = field348.method2695();
                        }
                    }
                    if (var47 != null && var48 >= 0 && var48 < var47.field2257.length) {
                        var47.field2257[var48] = var49;
                        var47.field2339[var48] = var50;
                    }
                    Statics.method1836(var46, var48, var49 - 1, var50);
                }
                if (var47 != null) {
                    method198(var47);
                }
                method637();
                field385[++field493 - 1 & 0x1F] = var46 & 0x7FFF;
                field350 = -1;
                return true;
            }
            if (field350 == 57) {
                int var51 = field348.method2695();
                int var52 = field348.method2695();
                if (Statics.field2068 == null || !Statics.field2068.isValid()) {
                    try {
                        Iterator var53 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var53.hasNext()) {
                            GarbageCollectorMXBean var54 = (GarbageCollectorMXBean) var53.next();
                            if (var54.isValid()) {
                                Statics.field2068 = var54;
                                field582 = -1L;
                                field519 = -1L;
                            }
                        }
                    } catch (Throwable var319) {
                    }
                }
                long var56 = class156.method848();
                int var58 = -1;
                if (Statics.field2068 != null) {
                    long var59 = Statics.field2068.getCollectionTime();
                    if (field519 != -1L) {
                        long var61 = var59 - field519;
                        long var63 = var56 - field582;
                        if (var63 != 0L) {
                            var58 = (int) (var61 * 100L / var63);
                        }
                    }
                    field519 = var59;
                    field582 = var56;
                }
                field495.method2889(148);
                field495.method2691(field1790);
                field495.method2690(var58);
                field495.method2749(var51);
                field495.method2707(var52);
                field350 = -1;
                return true;
            }
            if (field350 == 139) {
                Statics.field1881 = field348.method2666();
                Statics.field251 = field348.method2850();
                for (int var65 = Statics.field1881; var65 < Statics.field1881 + 8; var65++) {
                    for (int var66 = Statics.field251; var66 < Statics.field251 + 8; var66++) {
                        if (field433[Statics.field3063][var65][var66] != null) {
                            field433[Statics.field3063][var65][var66] = null;
                            method350(var65, var66);
                        }
                    }
                }
                for (class26 var67 = (class26) field462.method2301(); var67 != null; var67 = (class26) field462.method2309()) {
                    if (var67.field600 >= Statics.field1881 && var67.field600 < Statics.field1881 + 8 && var67.field598 >= Statics.field251 && var67.field598 < Statics.field251 + 8 && Statics.field3063 == var67.field602) {
                        var67.field599 = 0;
                    }
                }
                field350 = -1;
                return true;
            }
            if (field350 == 41) {
                method3188(true);
                field348.method2894();
                int var68 = field348.method2668();
                class46.method572(field348, var68);
                field350 = -1;
                return true;
            }
            if (field350 == 72) {
                field572 = 1;
                field497 = field562;
                field350 = -1;
                return true;
            }
            if (field350 == 180) {
                method161(true);
                field350 = -1;
                return true;
            }
            if (field350 == 16) {
                Statics.field1881 = field348.method2850();
                Statics.field251 = field348.method2666();
                field350 = -1;
                return true;
            }
            if (field350 == 172) {
                class30 var69 = new class30();
                var69.field704 = field348.method2674();
                var69.field701 = field348.method2668();
                int var70 = field348.method2695();
                var69.field692 = var70;
                method1850(45);
                Statics.field234.method1986();
                Statics.field234 = null;
                class42.method2568(var69);
                field350 = -1;
                return false;
            }
            if (field350 == 158) {
                int var71 = field349 + field348.field2111;
                int var72 = field348.method2668();
                int var73 = field348.method2668();
                if (field464 != var72) {
                    field464 = var72;
                    int var74 = field464;
                    int var75 = Statics.field756;
                    int var76 = Statics.field2208;
                    if (class170.method179(var74)) {
                        method1159(Statics.field2240[var74], -1, var75, var76, false);
                    }
                    method3103(field464);
                    class33.method2098(field464);
                    for (int var77 = 0; var77 < 100; var77++) {
                        field509[var77] = true;
                    }
                }
                while (var73-- > 0) {
                    int var78 = field348.method2695();
                    int var79 = field348.method2668();
                    int var80 = field348.method2666();
                    class18 var81 = (class18) field554.method2254((long) var78);
                    if (var81 != null && var81.field190 != var79) {
                        method811(var81, true);
                        var81 = null;
                    }
                    if (var81 == null) {
                        var81 = method3095(var78, var79, var80);
                    }
                    var81.field189 = true;
                }
                for (class18 var82 = (class18) field554.method2257(); var82 != null; var82 = (class18) field554.method2259()) {
                    if (var82.field189) {
                        var82.field189 = false;
                    } else {
                        method811(var82, true);
                    }
                }
                field463 = new class126(512);
                while (field348.field2111 < var71) {
                    int var83 = field348.method2695();
                    int var84 = field348.method2668();
                    int var85 = field348.method2668();
                    int var86 = field348.method2695();
                    for (int var87 = var84; var87 <= var85; var87++) {
                        long var88 = ((long) var83 << 32) + (long) var87;
                        field463.method2255(new class134(var86), var88);
                    }
                }
                field350 = -1;
                return true;
            }
            if (field350 == 106) {
                int var90 = field348.method2703();
                class13.method9(var90);
                field385[++field493 - 1 & 0x1F] = var90 & 0x7FFF;
                field350 = -1;
                return true;
            }
            if (field350 == 95) {
                String var91 = field348.method2674();
                Object[] var92 = new Object[var91.length() + 1];
                for (int var93 = var91.length() - 1; var93 >= 0; var93--) {
                    if (var91.charAt(var93) == 's') {
                        var92[var93 + 1] = field348.method2674();
                    } else {
                        var92[var93 + 1] = Integer.valueOf(field348.method2695());
                    }
                }
                var92[0] = Integer.valueOf(field348.method2695());
                class19 var94 = new class19();
                var94.field200 = var92;
                class33.method566(var94);
                field350 = -1;
                return true;
            }
            if (field350 == 67) {
                field447 = true;
                Statics.field173 = field348.method2666();
                Statics.field255 = field348.method2666();
                Statics.field217 = field348.method2668();
                Statics.field3110 = field348.method2666();
                Statics.field55 = field348.method2666();
                if (Statics.field55 >= 100) {
                    Statics.field245 = Statics.field173 * 128 + 64;
                    Statics.field1628 = Statics.field255 * 128 + 64;
                    Statics.field186 = method1906(Statics.field245, Statics.field1628, Statics.field3063) - Statics.field217;
                }
                field350 = -1;
                return true;
            }
            if (field350 == 240) {
                int var95 = field348.method2712();
                int var96 = field348.method2668();
                int var97 = field348.method2850();
                class18 var98 = (class18) field554.method2254((long) var95);
                if (var98 != null) {
                    method811(var98, var98.field190 != var96);
                }
                method3095(var95, var96, var97);
                field350 = -1;
                return true;
            }
            if (field350 == 193) {
                class160 var99 = field348;
                int var100 = field349;
                class227 var101 = new class227();
                var101.field3241 = var99.method2666();
                var101.field3237 = var99.method2695();
                var101.field3238 = new int[var101.field3241];
                var101.field3236 = new int[var101.field3241];
                var101.field3240 = new Field[var101.field3241];
                var101.field3239 = new int[var101.field3241];
                var101.field3242 = new Method[var101.field3241];
                var101.field3243 = new byte[var101.field3241][][];
                for (int var102 = 0; var102 < var101.field3241; var102++) {
                    try {
                        int var103 = var99.method2666();
                        if (var103 == 0 || var103 == 1 || var103 == 2) {
                            String var104 = var99.method2674();
                            String var105 = var99.method2674();
                            int var106 = 0;
                            if (var103 == 1) {
                                var106 = var99.method2695();
                            }
                            var101.field3238[var102] = var103;
                            var101.field3239[var102] = var106;
                            if (class228.method4007(var104).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var101.field3240[var102] = class228.method4007(var104).getDeclaredField(var105);
                        } else if (var103 == 3 || var103 == 4) {
                            String var107 = var99.method2674();
                            String var108 = var99.method2674();
                            int var109 = var99.method2666();
                            String[] var110 = new String[var109];
                            for (int var111 = 0; var111 < var109; var111++) {
                                var110[var111] = var99.method2674();
                            }
                            String var112 = var99.method2674();
                            byte[][] var113 = new byte[var109][];
                            if (var103 == 3) {
                                for (int var114 = 0; var114 < var109; var114++) {
                                    int var115 = var99.method2695();
                                    var113[var114] = new byte[var115];
                                    var99.method2677(var113[var114], 0, var115);
                                }
                            }
                            var101.field3238[var102] = var103;
                            Class[] var116 = new Class[var109];
                            for (int var117 = 0; var117 < var109; var117++) {
                                var116[var117] = class228.method4007(var110[var117]);
                            }
                            Class var118 = class228.method4007(var112);
                            if (class228.method4007(var107).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var119 = class228.method4007(var107).getDeclaredMethods();
                            Method[] var120 = var119;
                            for (int var121 = 0; var121 < var120.length; var121++) {
                                Method var122 = var120[var121];
                                if (var122.getName().equals(var108)) {
                                    Class[] var123 = var122.getParameterTypes();
                                    if (var116.length == var123.length) {
                                        boolean var124 = true;
                                        for (int var125 = 0; var125 < var116.length; var125++) {
                                            if (var116[var125] != var123[var125]) {
                                                var124 = false;
                                                break;
                                            }
                                        }
                                        if (var124 && var118 == var122.getReturnType()) {
                                            var101.field3242[var102] = var122;
                                        }
                                    }
                                }
                            }
                            var101.field3243[var102] = var113;
                        }
                    } catch (ClassNotFoundException var314) {
                        var101.field3236[var102] = -1;
                    } catch (SecurityException var315) {
                        var101.field3236[var102] = -2;
                    } catch (NullPointerException var316) {
                        var101.field3236[var102] = -3;
                    } catch (Exception var317) {
                        var101.field3236[var102] = -4;
                    } catch (Throwable var318) {
                        var101.field3236[var102] = -5;
                    }
                }
                class228.field3245.method2267(var101);
                field350 = -1;
                return true;
            }
            if (field350 == 214) {
                int var131 = field348.method2668();
                int var132 = field348.method2666();
                int var133 = field348.method2668();
                if (field544 != 0 && var132 != 0 && field546 < 50) {
                    field547[field546] = var131;
                    field548[field546] = var132;
                    field335[field546] = var133;
                    field551[field546] = null;
                    field465[field546] = 0;
                    field546++;
                }
                field350 = -1;
                return true;
            }
            if (field350 == 232) {
                int var137 = field348.method2679();
                boolean var138 = field348.method2666() == 1;
                String var139 = "";
                boolean var140 = false;
                if (var138) {
                    var139 = field348.method2674();
                    if (method1844(var139)) {
                        var140 = true;
                    }
                }
                String var141 = field348.method2674();
                if (!var140) {
                    class48.method225(var137, var139, var141);
                }
                field350 = -1;
                return true;
            }
            if (field350 == 207) {
                int var142 = field348.method2666();
                if (field348.method2666() == 0) {
                    field580[var142] = new class5();
                    field348.field2111 += 18;
                } else {
                    field348.field2111--;
                    field580[var142] = new class5(field348, false);
                }
                field499 = field562;
                field350 = -1;
                return true;
            }
            if (field350 == 204) {
                boolean var143 = field348.method2666() == 1;
                if (var143) {
                    Statics.field1699 = class156.method848() - field348.method2726();
                    Statics.field139 = new class2(field348, true);
                } else {
                    Statics.field139 = null;
                }
                field500 = field562;
                field350 = -1;
                return true;
            }
            if (field350 == 124) {
                field348.field2111 += 28;
                if (field348.method2742()) {
                    class160 var144 = field348;
                    int var145 = field348.field2111 - 28;
                    method3113(var144.field2114, var145);
                    if (class105.field1713 != null) {
                        try {
                            class105.field1713.method1350(0L);
                            class105.field1713.method1356(var144.field2114, var145, 24);
                        } catch (Exception var313) {
                        }
                    }
                }
                field350 = -1;
                return true;
            }
            if (field350 == 190) {
                field447 = false;
                for (int var147 = 0; var147 < 5; var147++) {
                    field553[var147] = false;
                }
                field350 = -1;
                return true;
            }
            if (field350 == 228) {
                if (field464 != -1) {
                    method712(field464, 0);
                }
                field350 = -1;
                return true;
            }
            if (field350 == 244) {
                int var148 = field348.method2652();
                int var149 = field348.method2695();
                class170 var150 = Statics.method1837(var149);
                if (var150 != null && var150.field2241 == 0) {
                    if (var148 > var150.field2244 - var150.field2210) {
                        var148 = var150.field2244 - var150.field2210;
                    }
                    if (var148 < 0) {
                        var148 = 0;
                    }
                    if (var150.field2217 != var148) {
                        var150.field2217 = var148;
                        method198(var150);
                    }
                }
                field350 = -1;
                return true;
            }
            if (field350 == 113) {
                String var151 = field348.method2674();
                int var152 = field348.method2668();
                byte var153 = field348.method2667();
                boolean var154 = false;
                if (var153 == -128) {
                    var154 = true;
                }
                if (var154) {
                    if (Statics.field1449 == 0) {
                        field350 = -1;
                        return true;
                    }
                    boolean var155 = false;
                    int var156;
                    for (var156 = 0; var156 < Statics.field1449 && (!Statics.field2137[var156].field290.equals(var151) || Statics.field2137[var156].field287 != var152); var156++) {
                    }
                    if (var156 < Statics.field1449) {
                        while (var156 < Statics.field1449 - 1) {
                            Statics.field2137[var156] = Statics.field2137[var156 + 1];
                            var156++;
                        }
                        Statics.field1449--;
                        Statics.field2137[Statics.field1449] = null;
                    }
                } else {
                    field348.method2674();
                    class25 var157 = new class25();
                    var157.field290 = var151;
                    var157.field292 = class205.method3259(var157.field290, Statics.field215);
                    var157.field287 = var152;
                    var157.field288 = var153;
                    int var158;
                    for (var158 = Statics.field1449 - 1; var158 >= 0; var158--) {
                        int var159 = Statics.field2137[var158].field292.compareTo(var157.field292);
                        if (var159 == 0) {
                            Statics.field2137[var158].field287 = var152;
                            Statics.field2137[var158].field288 = var153;
                            if (var151.equals(Statics.field899.field279)) {
                                Statics.field76 = var153;
                            }
                            field498 = field562;
                            field350 = -1;
                            return true;
                        }
                        if (var159 < 0) {
                            break;
                        }
                    }
                    if (Statics.field1449 >= Statics.field2137.length) {
                        field350 = -1;
                        return true;
                    }
                    for (int var160 = Statics.field1449 - 1; var160 > var158; var160--) {
                        Statics.field2137[var160 + 1] = Statics.field2137[var160];
                    }
                    if (Statics.field1449 == 0) {
                        Statics.field2137 = new class25[100];
                    }
                    Statics.field2137[var158 + 1] = var157;
                    Statics.field1449++;
                    if (var151.equals(Statics.field899.field279)) {
                        Statics.field76 = var153;
                    }
                }
                field498 = field562;
                field350 = -1;
                return true;
            }
            if (field350 == 161) {
                while (field348.field2111 < field349) {
                    int var161 = field348.method2666();
                    boolean var162 = (var161 & 0x1) == 1;
                    String var163 = field348.method2674();
                    String var164 = field348.method2674();
                    field348.method2674();
                    for (int var165 = 0; var165 < field575; var165++) {
                        class20 var166 = field576[var165];
                        if (var162) {
                            if (var164.equals(var166.field226)) {
                                var166.field226 = var163;
                                var166.field223 = var164;
                                var163 = null;
                                break;
                            }
                        } else if (var163.equals(var166.field226)) {
                            var166.field226 = var163;
                            var166.field223 = var164;
                            var163 = null;
                            break;
                        }
                    }
                    if (var163 != null && field575 < 400) {
                        class20 var167 = new class20();
                        field576[field575] = var167;
                        var167.field226 = var163;
                        var167.field223 = var164;
                        field575++;
                    }
                }
                field497 = field562;
                field350 = -1;
                return true;
            }
            if (field350 == 66) {
                method161(false);
                field350 = -1;
                return true;
            }
            if (field350 == 115) {
                Statics.field2042 = class217.method1406(field348.method2666());
                field350 = -1;
                return true;
            }
            if (field350 == 173) {
                field538 = field348.method2666();
                if (field538 == 255) {
                    field538 = 0;
                }
                field435 = field348.method2666();
                if (field435 == 255) {
                    field435 = 0;
                }
                field350 = -1;
                return true;
            }
            if (field350 == 51) {
                class46.method727();
                for (int var168 = 0; var168 < 2048; var168++) {
                    field423[var168] = null;
                }
                class46.method1973(field348);
                field350 = -1;
                return true;
            }
            if (field350 == 55) {
                int var169 = field348.method2695();
                int var170 = field348.method2652();
                class170 var171 = Statics.method1837(var169);
                if (var171.field2243 != 2 || var171.field2264 != var170) {
                    var171.field2243 = 2;
                    var171.field2264 = var170;
                    method198(var171);
                }
                field350 = -1;
                return true;
            }
            if (field350 == 91) {
                int var172 = field348.method2702();
                if (var172 == 65535) {
                    var172 = -1;
                }
                if (var172 == -1 && !field543) {
                    class139.method1399();
                } else if (var172 != -1 && field542 != var172 && field541 != 0 && !field543) {
                    class185 var173 = Statics.field587;
                    int var174 = field541;
                    class139.field1941 = 1;
                    Statics.field2062 = var173;
                    Statics.field1942 = var172;
                    Statics.field1778 = 0;
                    Statics.field784 = var174;
                    Statics.field1939 = false;
                    Statics.field1938 = 2;
                }
                field542 = var172;
                field350 = -1;
                return true;
            }
            if (field350 == 164) {
                int var175 = field348.method2650();
                int var176 = field348.method2668();
                if (var176 == 65535) {
                    var176 = -1;
                }
                if (field541 != 0 && var176 != -1) {
                    class139.method1400(Statics.field163, var176, 0, field541, false);
                    field543 = true;
                }
                field350 = -1;
                return true;
            }
            if (field350 == 176) {
                for (int var177 = 0; var177 < Statics.field2790; var177++) {
                    class188 var178 = class188.method1970(var177);
                    if (var178 != null) {
                        class166.field2180[var177] = 0;
                        class166.field2181[var177] = 0;
                    }
                }
                method637();
                field491 += 32;
                field350 = -1;
                return true;
            }
            if (field350 == 162 || field350 == 77 || field350 == 205 || field350 == 12 || field350 == 194 || field350 == 94 || field350 == 181 || field350 == 245 || field350 == 147 || field350 == 36) {
                method1133();
                field350 = -1;
                return true;
            }
            if (field350 == 215) {
                int var179 = field348.method2711();
                class170 var180 = Statics.method1837(var179);
                var180.field2243 = 3;
                var180.field2264 = Statics.field899.field257.method2997();
                method198(var180);
                field350 = -1;
                return true;
            }
            if (field350 == 159) {
                int var181 = field348.method2702();
                int var182 = field348.method2712();
                int var183 = var181 >> 10 & 0x1F;
                int var184 = var181 >> 5 & 0x1F;
                int var185 = var181 & 0x1F;
                int var186 = (var185 << 3) + (var183 << 19) + (var184 << 11);
                class170 var187 = Statics.method1837(var182);
                if (var187.field2245 != var186) {
                    var187.field2245 = var186;
                    method198(var187);
                }
                field350 = -1;
                return true;
            }
            if (field350 == 135) {
                method3188(false);
                field348.method2894();
                int var188 = field348.method2668();
                class46.method572(field348, var188);
                field350 = -1;
                return true;
            }
            if (field350 == 120) {
                field321 = field348.method2666();
                if (field321 == 1) {
                    field342 = field348.method2668();
                }
                if (field321 >= 2 && field321 <= 6) {
                    if (field321 == 2) {
                        field502 = 64;
                        field328 = 64;
                    }
                    if (field321 == 3) {
                        field502 = 0;
                        field328 = 64;
                    }
                    if (field321 == 4) {
                        field502 = 128;
                        field328 = 64;
                    }
                    if (field321 == 5) {
                        field502 = 64;
                        field328 = 0;
                    }
                    if (field321 == 6) {
                        field502 = 64;
                        field328 = 128;
                    }
                    field321 = 2;
                    field324 = field348.method2668();
                    field394 = field348.method2668();
                    field467 = field348.method2666();
                }
                if (field321 == 10) {
                    field323 = field348.method2668();
                }
                field350 = -1;
                return true;
            }
            if (field350 == 153) {
                int var189 = field348.method2695();
                class18 var190 = (class18) field554.method2254((long) var189);
                if (var190 != null) {
                    method811(var190, true);
                }
                if (field468 != null) {
                    method198(field468);
                    field468 = null;
                }
                field350 = -1;
                return true;
            }
            if (field350 == 126) {
                method637();
                int var191 = field348.method2850();
                int var192 = field348.method2711();
                int var193 = field348.method2850();
                field439[var193] = var192;
                field424[var193] = var191;
                field354[var193] = 1;
                for (int var194 = 0; var194 < 98; var194++) {
                    if (var192 >= class173.field2370[var194]) {
                        field354[var193] = var194 + 2;
                    }
                }
                field494[++field504 - 1 & 0x1F] = var193;
                field350 = -1;
                return true;
            }
            if (field350 == 62) {
                String var195 = field348.method2674();
                class160 var196 = field348;
                String var197 = class211.method2146(var196, 32767);
                String var198 = class210.method3675(class208.method1847(var197));
                class48.method225(6, var195, var198);
                field350 = -1;
                return true;
            }
            if (field350 == 134) {
                byte var199 = field348.method2667();
                int var200 = field348.method2652();
                class166.field2180[var200] = var199;
                if (class166.field2181[var200] != var199) {
                    class166.field2181[var200] = var199;
                }
                method551(var200);
                field490[++field491 - 1 & 0x1F] = var200;
                field350 = -1;
                return true;
            }
            if (field350 == 236) {
                int var201 = field348.method2695();
                class170 var202 = Statics.method1837(var201);
                for (int var203 = 0; var203 < var202.field2257.length; var203++) {
                    var202.field2257[var203] = -1;
                    var202.field2257[var203] = 0;
                }
                method198(var202);
                field350 = -1;
                return true;
            }
            if (field350 == 250) {
                method1357(field348.method2674());
                field350 = -1;
                return true;
            }
            if (field350 == 99) {
                int var204 = field348.method2695();
                int var205 = field348.method2738();
                int var206 = field348.method2669();
                class170 var207 = Statics.method1837(var204);
                if (var207.field2229 != var205 || var207.field2238 != var206 || var207.field2352 != 0 || var207.field2218 != 0) {
                    var207.field2229 = var205;
                    var207.field2238 = var206;
                    var207.field2352 = 0;
                    var207.field2218 = 0;
                    method198(var207);
                    method55(var207);
                    if (var207.field2241 == 0) {
                        Statics.method17(Statics.field2240[var204 >> 16], var207, false);
                    }
                }
                field350 = -1;
                return true;
            }
            if (field350 == 86) {
                String var208 = field348.method2674();
                long var209 = (long) field348.method2668();
                long var211 = (long) field348.method2670();
                class178 var213 = (class178) class149.method557(class178.method24(), field348.method2666());
                long var214 = (var209 << 32) + var211;
                boolean var216 = false;
                for (int var217 = 0; var217 < 100; var217++) {
                    if (field525[var217] == var214) {
                        var216 = true;
                        break;
                    }
                }
                if (method1844(var208)) {
                    var216 = true;
                }
                if (!var216 && field422 == 0) {
                    field525[field526] = var214;
                    field526 = (field526 + 1) % 100;
                    class160 var218 = field348;
                    String var219 = class211.method2146(var218, 32767);
                    String var220 = class210.method3675(class208.method1847(var219));
                    byte var221;
                    if (var213.field2691) {
                        var221 = 7;
                    } else {
                        var221 = 3;
                    }
                    if (var213.field2696 == -1) {
                        class48.method225(var221, var208, var220);
                    } else {
                        class48.method225(var221, class38.method645(var213.field2696) + var208, var220);
                    }
                }
                field350 = -1;
                return true;
            }
            if (field350 == 69) {
                for (int var222 = 0; var222 < field423.length; var222++) {
                    if (field423[var222] != null) {
                        field423[var222].field651 = -1;
                    }
                }
                for (int var223 = 0; var223 < field412.length; var223++) {
                    if (field412[var223] != null) {
                        field412[var223].field651 = -1;
                    }
                }
                field350 = -1;
                return true;
            }
            if (field350 == 35) {
                int var224 = field348.method2666();
                int var225 = field348.method2666();
                int var226 = field348.method2666();
                int var227 = field348.method2666();
                field553[var224] = true;
                field483[var224] = var225;
                field357[var224] = var226;
                field384[var224] = var227;
                field414[var224] = 0;
                field350 = -1;
                return true;
            }
            if (field350 == 233) {
                for (int var228 = 0; var228 < class166.field2181.length; var228++) {
                    if (class166.field2181[var228] != class166.field2180[var228]) {
                        class166.field2181[var228] = class166.field2180[var228];
                        method551(var228);
                        field490[++field491 - 1 & 0x1F] = var228;
                    }
                }
                field350 = -1;
                return true;
            }
            if (field350 == 20) {
                int var229 = field348.method2738();
                int var230 = field348.method2805();
                class170 var231 = Statics.method1837(var230);
                if (var231.field2267 != var229 || var229 == -1) {
                    var231.field2267 = var229;
                    var231.field2345 = 0;
                    var231.field2343 = 0;
                    method198(var231);
                }
                field350 = -1;
                return true;
            }
            if (field350 == 221) {
                int var232 = field348.method2652();
                field464 = var232;
                int var233 = field464;
                int var234 = Statics.field756;
                int var235 = Statics.field2208;
                if (class170.method179(var233)) {
                    method1159(Statics.field2240[var233], -1, var234, var235, false);
                }
                method3103(var232);
                class33.method2098(field464);
                for (int var236 = 0; var236 < 100; var236++) {
                    field509[var236] = true;
                }
                field350 = -1;
                return true;
            }
            if (field350 == 242) {
                int var237 = field348.method2805();
                int var238 = field348.method2695();
                int var239 = field348.method2652();
                if (var239 == 65535) {
                    var239 = -1;
                }
                int var240 = field348.method2652();
                if (var240 == 65535) {
                    var240 = -1;
                }
                for (int var241 = var240; var241 <= var239; var241++) {
                    long var242 = ((long) var238 << 32) + (long) var241;
                    class128 var244 = field463.method2254(var242);
                    if (var244 != null) {
                        var244.method2289();
                    }
                    field463.method2255(new class134(var237), var242);
                }
                field350 = -1;
                return true;
            }
            if (field350 == 209) {
                field522 = field348.method2666();
                field523 = field348.method2666();
                field350 = -1;
                return true;
            }
            if (field350 == 146) {
                field447 = true;
                Statics.field1840 = field348.method2666();
                Statics.field901 = field348.method2666();
                Statics.field2034 = field348.method2668();
                Statics.field2196 = field348.method2666();
                Statics.field814 = field348.method2666();
                if (Statics.field814 >= 100) {
                    int var245 = Statics.field1840 * 128 + 64;
                    int var246 = Statics.field901 * 128 + 64;
                    int var247 = method1906(var245, var246, Statics.field3063) - Statics.field2034;
                    int var248 = var245 - Statics.field245;
                    int var249 = var247 - Statics.field186;
                    int var250 = var246 - Statics.field1628;
                    int var251 = (int) Math.sqrt((double) (var248 * var248 + var250 * var250));
                    Statics.field182 = (int) (Math.atan2((double) var249, (double) var251) * 325.949D) & 0x7FF;
                    Statics.field83 = (int) (Math.atan2((double) var248, (double) var250) * -325.949D) & 0x7FF;
                    if (Statics.field182 < 128) {
                        Statics.field182 = 128;
                    }
                    if (Statics.field182 > 383) {
                        Statics.field182 = 383;
                    }
                }
                field350 = -1;
                return true;
            }
            if (field350 == 234) {
                int var252 = field348.method2805();
                int var253 = field348.method2695();
                class18 var254 = (class18) field554.method2254((long) var253);
                class18 var255 = (class18) field554.method2254((long) var252);
                if (var255 != null) {
                    method811(var255, var254 == null || var254.field190 != var255.field190);
                }
                if (var254 != null) {
                    var254.method2289();
                    field554.method2255(var254, (long) var252);
                }
                class170 var256 = Statics.method1837(var253);
                if (var256 != null) {
                    method198(var256);
                }
                class170 var257 = Statics.method1837(var252);
                if (var257 != null) {
                    method198(var257);
                    Statics.method17(Statics.field2240[var257.field2274 >>> 16], var257, true);
                }
                if (field464 != -1) {
                    method712(field464, 1);
                }
                field350 = -1;
                return true;
            }
            if (field350 == 56) {
                int var258 = field348.method2695();
                int var259 = field348.method2668();
                if (var258 < -70000) {
                    var259 += 32768;
                }
                class170 var260;
                if (var258 >= 0) {
                    var260 = Statics.method1837(var258);
                } else {
                    var260 = null;
                }
                if (var260 != null) {
                    for (int var261 = 0; var261 < var260.field2257.length; var261++) {
                        var260.field2257[var261] = 0;
                        var260.field2339[var261] = 0;
                    }
                }
                class13 var262 = (class13) class13.field124.method2254((long) var259);
                if (var262 != null) {
                    for (int var263 = 0; var263 < var262.field119.length; var263++) {
                        var262.field119[var263] = -1;
                        var262.field120[var263] = 0;
                    }
                }
                int var264 = field348.method2668();
                for (int var265 = 0; var265 < var264; var265++) {
                    int var266 = field348.method2814();
                    if (var266 == 255) {
                        var266 = field348.method2712();
                    }
                    int var267 = field348.method2702();
                    if (var260 != null && var265 < var260.field2257.length) {
                        var260.field2257[var265] = var267;
                        var260.field2339[var265] = var266;
                    }
                    Statics.method1836(var259, var265, var267 - 1, var266);
                }
                if (var260 != null) {
                    method198(var260);
                }
                method637();
                field385[++field493 - 1 & 0x1F] = var259 & 0x7FFF;
                field350 = -1;
                return true;
            }
            if (field350 == 198) {
                while (field348.field2111 < field349) {
                    boolean var268 = field348.method2666() == 1;
                    String var269 = field348.method2674();
                    String var270 = field348.method2674();
                    int var271 = field348.method2668();
                    int var272 = field348.method2666();
                    int var273 = field348.method2666();
                    boolean var274 = (var273 & 0x2) != 0;
                    boolean var275 = (var273 & 0x1) != 0;
                    if (var271 > 0) {
                        field348.method2674();
                        field348.method2666();
                        field348.method2695();
                    }
                    field348.method2674();
                    for (int var276 = 0; var276 < field556; var276++) {
                        class15 var277 = field298[var276];
                        if (var268) {
                            if (var270.equals(var277.field166)) {
                                var277.field166 = var269;
                                var277.field155 = var270;
                                var269 = null;
                                break;
                            }
                        } else if (var269.equals(var277.field166)) {
                            if (var277.field156 != var271) {
                                boolean var278 = true;
                                for (class17 var279 = (class17) field532.method2336(); var279 != null; var279 = (class17) field532.method2337()) {
                                    if (var279.field179.equals(var269)) {
                                        if (var271 != 0 && var279.field183 == 0) {
                                            var279.method2348();
                                            var278 = false;
                                        } else if (var271 == 0 && var279.field183 != 0) {
                                            var279.method2348();
                                            var278 = false;
                                        }
                                    }
                                }
                                if (var278) {
                                    field532.method2335(new class17(var269, var271));
                                }
                                var277.field156 = var271;
                            }
                            var277.field155 = var270;
                            var277.field164 = var272;
                            var277.field158 = var274;
                            var277.field157 = var275;
                            var269 = null;
                            break;
                        }
                    }
                    if (var269 != null && field556 < 400) {
                        class15 var280 = new class15();
                        field298[field556] = var280;
                        var280.field166 = var269;
                        var280.field155 = var270;
                        var280.field156 = var271;
                        var280.field164 = var272;
                        var280.field158 = var274;
                        var280.field157 = var275;
                        field556++;
                    }
                }
                field572 = 2;
                field497 = field562;
                boolean var281 = false;
                int var282 = field556;
                while (var282 > 0) {
                    boolean var283 = true;
                    var282--;
                    for (int var284 = 0; var284 < var282; var284++) {
                        boolean var285 = false;
                        class15 var286 = field298[var284];
                        class15 var287 = field298[var284 + 1];
                        if (field301 != var286.field156 && field301 == var287.field156) {
                            var285 = true;
                        }
                        if (!var285 && var286.field156 == 0 && var287.field156 != 0) {
                            var285 = true;
                        }
                        if (!var285 && !var286.field158 && var287.field158) {
                            var285 = true;
                        }
                        if (!var285 && !var286.field157 && var287.field157) {
                            var285 = true;
                        }
                        if (var285) {
                            class15 var288 = field298[var284];
                            field298[var284] = field298[var284 + 1];
                            field298[var284 + 1] = var288;
                            var283 = false;
                        }
                    }
                    if (var283) {
                        break;
                    }
                }
                field350 = -1;
                return true;
            }
            if (field350 == 206) {
                int var289 = field348.method2668();
                int var290 = field348.method2695();
                int var291 = field348.method2702();
                class170 var292 = Statics.method1837(var290);
                var292.field2276 = (var289 << 16) + var291;
                field350 = -1;
                return true;
            }
            if (field350 == 63) {
                String var293 = field348.method2674();
                long var294 = field348.method2726();
                long var296 = (long) field348.method2668();
                long var298 = (long) field348.method2670();
                class178 var300 = (class178) class149.method557(class178.method24(), field348.method2666());
                long var301 = (var296 << 32) + var298;
                boolean var303 = false;
                for (int var304 = 0; var304 < 100; var304++) {
                    if (field525[var304] == var301) {
                        var303 = true;
                        break;
                    }
                }
                if (var300.field2689 && method1844(var293)) {
                    var303 = true;
                }
                if (!var303 && field422 == 0) {
                    field525[field526] = var301;
                    field526 = (field526 + 1) % 100;
                    class160 var305 = field348;
                    String var306 = class211.method2146(var305, 32767);
                    String var307 = class210.method3675(class208.method1847(var306));
                    if (var300.field2696 == -1) {
                        class48.method3756(9, var293, var307, class206.method81(var294));
                    } else {
                        class48.method3756(9, class38.method645(var300.field2696) + var293, var307, class206.method81(var294));
                    }
                }
                field350 = -1;
                return true;
            }
            if (field350 == 174) {
                int var308 = field348.method2712();
                Statics.field796 = Statics.field1756.method1892(var308);
                field350 = -1;
                return true;
            }
            Statics.method1851("" + field350 + class38.field803 + field425 + class38.field803 + field355 + class38.field803 + field349, (Throwable) null);
            method1835();
        } catch (IOException var320) {
            method1964();
        } catch (Exception var321) {
            String var311 = "" + field350 + class38.field803 + field425 + class38.field803 + field355 + class38.field803 + field349 + class38.field803 + (Statics.field1880 + Statics.field899.field674[0]) + class38.field803 + (Statics.field2792 + Statics.field899.field675[0]) + class38.field803;
            for (int var312 = 0; var312 < field349 && var312 < 50; var312++) {
                var311 = var311 + field348.field2114[var312] + class38.field803;
            }
            Statics.method1851(var311, var321);
            method1835();
        }
        return true;
    }

    @ObfuscatedName("bv.bv(S)V")
    public static final void method1133() {
        if (field350 == 181) {
            int var0 = field348.method2666();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1881;
            int var2 = (var0 & 0x7) + Statics.field251;
            int var3 = field348.method2652();
            int var4 = field348.method2668();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                class44 var5 = new class44();
                var5.field907 = var4;
                var5.field906 = var3;
                if (field433[Statics.field3063][var1][var2] == null) {
                    field433[Statics.field3063][var1][var2] = new class129();
                }
                field433[Statics.field3063][var1][var2].method2296(var5);
                method350(var1, var2);
            }
            return;
        }
        if (field350 == 205) {
            byte var6 = field348.method2697();
            int var7 = field348.method2652();
            int var8 = field348.method2666();
            int var9 = var8 >> 2;
            int var10 = var8 & 0x3;
            int var11 = field451[var9];
            byte var12 = field348.method2697();
            int var13 = field348.method2652();
            byte var14 = field348.method2697();
            int var15 = field348.method2720();
            int var16 = (var15 >> 4 & 0x7) + Statics.field1881;
            int var17 = (var15 & 0x7) + Statics.field251;
            int var18 = field348.method2702();
            int var19 = field348.method2703();
            byte var20 = field348.method2759();
            class24 var21;
            if (field386 == var7) {
                var21 = Statics.field899;
            } else {
                var21 = field423[var7];
            }
            if (var21 != null) {
                class198 var22 = class198.method2502(var19);
                int var23;
                int var24;
                if (var10 == 1 || var10 == 3) {
                    var23 = var22.field2914;
                    var24 = var22.field2943;
                } else {
                    var23 = var22.field2943;
                    var24 = var22.field2914;
                }
                int var25 = (var23 >> 1) + var16;
                int var26 = (var23 + 1 >> 1) + var16;
                int var27 = (var24 >> 1) + var17;
                int var28 = (var24 + 1 >> 1) + var17;
                int[][] var29 = class11.field103[Statics.field3063];
                int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
                int var31 = (var16 << 7) + (var23 << 6);
                int var32 = (var17 << 7) + (var24 << 6);
                class83 var33 = var22.method3420(var9, var10, var29, var31, var30, var32);
                if (var33 != null) {
                    method2923(Statics.field3063, var16, var17, var11, -1, 0, 0, var18 + 1, var13 + 1);
                    var21.field278 = field312 + var18;
                    var21.field265 = field312 + var13;
                    var21.field258 = var33;
                    var21.field281 = var16 * 128 + var23 * 64;
                    var21.field268 = var17 * 128 + var24 * 64;
                    var21.field269 = var30;
                    if (var20 > var14) {
                        byte var34 = var20;
                        var20 = var14;
                        var14 = var34;
                    }
                    if (var12 > var6) {
                        byte var35 = var12;
                        var12 = var6;
                        var6 = var35;
                    }
                    var21.field270 = var16 + var20;
                    var21.field272 = var14 + var16;
                    var21.field271 = var12 + var17;
                    var21.field273 = var6 + var17;
                }
            }
        }
        if (field350 == 162) {
            int var36 = field348.method2666();
            int var37 = (var36 >> 4 & 0x7) + Statics.field1881;
            int var38 = (var36 & 0x7) + Statics.field251;
            int var39 = field348.method2668();
            int var40 = field348.method2666();
            int var41 = var40 >> 4 & 0xF;
            int var42 = var40 & 0x7;
            int var43 = field348.method2666();
            if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104) {
                int var44 = var41 + 1;
                if (Statics.field899.field674[0] >= var37 - var44 && Statics.field899.field674[0] <= var37 + var44 && Statics.field899.field675[0] >= var38 - var44 && Statics.field899.field675[0] <= var38 + var44 && field545 != 0 && var42 > 0 && field546 < 50) {
                    field547[field546] = var39;
                    field548[field546] = var42;
                    field335[field546] = var43;
                    field551[field546] = null;
                    field465[field546] = (var37 << 16) + (var38 << 8) + var41;
                    field546++;
                }
            }
        }
        if (field350 == 12) {
            int var45 = field348.method2666();
            int var46 = (var45 >> 4 & 0x7) + Statics.field1881;
            int var47 = (var45 & 0x7) + Statics.field251;
            int var48 = field348.method2668();
            int var49 = field348.method2666();
            int var50 = field348.method2668();
            if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                int var51 = var46 * 128 + 64;
                int var52 = var47 * 128 + 64;
                class34 var53 = new class34(var48, Statics.field3063, var51, var52, method1906(var51, var52, Statics.field3063) - var49, var50, field312);
                field392.method2296(var53);
            }
        } else if (field350 == 77) {
            int var54 = field348.method2666();
            int var55 = (var54 >> 4 & 0x7) + Statics.field1881;
            int var56 = (var54 & 0x7) + Statics.field251;
            int var57 = field348.method2668();
            int var58 = field348.method2668();
            int var59 = field348.method2668();
            if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
                class129 var60 = field433[Statics.field3063][var55][var56];
                if (var60 != null) {
                    for (class44 var61 = (class44) var60.method2301(); var61 != null; var61 = (class44) var60.method2309()) {
                        if ((var57 & 0x7FFF) == var61.field907 && var61.field906 == var58) {
                            var61.field906 = var59;
                            break;
                        }
                    }
                    method350(var55, var56);
                }
            }
        } else if (field350 == 94) {
            int var62 = field348.method2702();
            int var63 = field348.method2814();
            int var64 = (var63 >> 4 & 0x7) + Statics.field1881;
            int var65 = (var63 & 0x7) + Statics.field251;
            if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104) {
                class129 var66 = field433[Statics.field3063][var64][var65];
                if (var66 != null) {
                    for (class44 var67 = (class44) var66.method2301(); var67 != null; var67 = (class44) var66.method2309()) {
                        if ((var62 & 0x7FFF) == var67.field907) {
                            var67.method2289();
                            break;
                        }
                    }
                    if (var66.method2301() == null) {
                        field433[Statics.field3063][var64][var65] = null;
                    }
                    method350(var64, var65);
                }
            }
        } else if (field350 == 147) {
            int var68 = field348.method2814();
            int var69 = var68 >> 2;
            int var70 = var68 & 0x3;
            int var71 = field451[var69];
            int var72 = field348.method2814();
            int var73 = (var72 >> 4 & 0x7) + Statics.field1881;
            int var74 = (var72 & 0x7) + Statics.field251;
            if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                method2923(Statics.field3063, var73, var74, var71, -1, var69, var70, 0, -1);
            }
        } else if (field350 == 36) {
            int var75 = field348.method2668();
            int var76 = field348.method2666();
            int var77 = (var76 >> 4 & 0x7) + Statics.field1881;
            int var78 = (var76 & 0x7) + Statics.field251;
            int var79 = field348.method2666();
            int var80 = var79 >> 2;
            int var81 = var79 & 0x3;
            int var82 = field451[var80];
            if (var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104) {
                method2923(Statics.field3063, var77, var78, var82, var75, var80, var81, 0, -1);
            }
        } else if (field350 == 245) {
            int var83 = field348.method2720();
            int var84 = (var83 >> 4 & 0x7) + Statics.field1881;
            int var85 = (var83 & 0x7) + Statics.field251;
            int var86 = field348.method2850();
            int var87 = var86 >> 2;
            int var88 = var86 & 0x3;
            int var89 = field451[var87];
            int var90 = field348.method2668();
            if (var84 >= 0 && var85 >= 0 && var84 < 103 && var85 < 103) {
                if (var89 == 0) {
                    class91 var91 = Statics.field688.method1750(Statics.field3063, var84, var85);
                    if (var91 != null) {
                        int var92 = var91.field1572 >> 14 & 0x7FFF;
                        if (var87 == 2) {
                            var91.field1577 = new class50(var92, 2, var88 + 4, Statics.field3063, var84, var85, var90, false, var91.field1577);
                            var91.field1571 = new class50(var92, 2, var88 + 1 & 0x3, Statics.field3063, var84, var85, var90, false, var91.field1571);
                        } else {
                            var91.field1577 = new class50(var92, var87, var88, Statics.field3063, var84, var85, var90, false, var91.field1577);
                        }
                    }
                }
                if (var89 == 1) {
                    class96 var93 = Statics.field688.method1672(Statics.field3063, var84, var85);
                    if (var93 != null) {
                        int var94 = var93.field1625 >> 14 & 0x7FFF;
                        if (var87 == 4 || var87 == 5) {
                            var93.field1623 = new class50(var94, 4, var88, Statics.field3063, var84, var85, var90, false, var93.field1623);
                        } else if (var87 == 6) {
                            var93.field1623 = new class50(var94, 4, var88 + 4, Statics.field3063, var84, var85, var90, false, var93.field1623);
                        } else if (var87 == 7) {
                            var93.field1623 = new class50(var94, 4, (var88 + 2 & 0x3) + 4, Statics.field3063, var84, var85, var90, false, var93.field1623);
                        } else if (var87 == 8) {
                            var93.field1623 = new class50(var94, 4, var88 + 4, Statics.field3063, var84, var85, var90, false, var93.field1623);
                            var93.field1624 = new class50(var94, 4, (var88 + 2 & 0x3) + 4, Statics.field3063, var84, var85, var90, false, var93.field1624);
                        }
                    }
                }
                if (var89 == 2) {
                    class97 var95 = Statics.field688.method1673(Statics.field3063, var84, var85);
                    if (var87 == 11) {
                        var87 = 10;
                    }
                    if (var95 != null) {
                        var95.field1635 = new class50(var95.field1643 >> 14 & 0x7FFF, var87, var88, Statics.field3063, var84, var85, var90, false, var95.field1635);
                    }
                }
                if (var89 == 3) {
                    class79 var96 = Statics.field688.method1674(Statics.field3063, var84, var85);
                    if (var96 != null) {
                        var96.field1317 = new class50(var96.field1318 >> 14 & 0x7FFF, 22, var88, Statics.field3063, var84, var85, var90, false, var96.field1317);
                    }
                }
            }
        } else if (field350 == 194) {
            int var97 = field348.method2666();
            int var98 = (var97 >> 4 & 0x7) + Statics.field1881;
            int var99 = (var97 & 0x7) + Statics.field251;
            int var100 = var98 + field348.method2667();
            int var101 = var99 + field348.method2667();
            int var102 = field348.method2669();
            int var103 = field348.method2668();
            int var104 = field348.method2666() * 4;
            int var105 = field348.method2666() * 4;
            int var106 = field348.method2668();
            int var107 = field348.method2668();
            int var108 = field348.method2666();
            int var109 = field348.method2666();
            if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104 && var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104 && var103 != 65535) {
                int var110 = var98 * 128 + 64;
                int var111 = var99 * 128 + 64;
                int var112 = var100 * 128 + 64;
                int var113 = var101 * 128 + 64;
                class43 var114 = new class43(var103, Statics.field3063, var110, var111, method1906(var110, var111, Statics.field3063) - var104, field312 + var106, field312 + var107, var108, var109, var102, var105);
                var114.method803(var112, var113, method1906(var112, var113, Statics.field3063) - var105, field312 + var106);
                field586.method2296(var114);
            }
        }
    }

    @ObfuscatedName("fd.bb(IIIIIIIIII)V")
    public static final void method2923(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class26 var9 = null;
        for (class26 var10 = (class26) field462.method2301(); var10 != null; var10 = (class26) field462.method2309()) {
            if (var10.field602 == arg0 && var10.field600 == arg1 && var10.field598 == arg2 && var10.field589 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class26();
            var9.field602 = arg0;
            var9.field589 = arg3;
            var9.field600 = arg1;
            var9.field598 = arg2;
            method553(var9);
            field462.method2296(var9);
        }
        var9.field595 = arg4;
        var9.field597 = arg5;
        var9.field588 = arg6;
        var9.field590 = arg7;
        var9.field599 = arg8;
    }

    @ObfuscatedName("client.bq(Le;I)V")
    public static final void method553(class26 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field589 == 0) {
            var1 = Statics.field688.method1675(arg0.field602, arg0.field600, arg0.field598);
        }
        if (arg0.field589 == 1) {
            var1 = Statics.field688.method1755(arg0.field602, arg0.field600, arg0.field598);
        }
        if (arg0.field589 == 2) {
            var1 = Statics.field688.method1687(arg0.field602, arg0.field600, arg0.field598);
        }
        if (arg0.field589 == 3) {
            var1 = Statics.field688.method1758(arg0.field602, arg0.field600, arg0.field598);
        }
        if (var1 != 0) {
            int var5 = Statics.field688.method1679(arg0.field602, arg0.field600, arg0.field598, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field592 = var2;
        arg0.field594 = var3;
        arg0.field593 = var4;
    }

    @ObfuscatedName("j.bf(IIIIIIIB)V")
    public static final void method137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field307 && Statics.field3063 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field688.method1675(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field688.method1755(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field688.method1687(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field688.method1758(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field688.method1679(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field688.method1829(arg0, arg2, arg3);
                class198 var15 = class198.method2502(var12);
                if (var15.field2915 != 0) {
                    field527[arg0].method2163(arg2, arg3, var13, var14, var15.field2916);
                }
            }
            if (arg1 == 1) {
                Statics.field688.method1790(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field688.method1668(arg0, arg2, arg3);
                class198 var16 = class198.method2502(var12);
                if (var16.field2943 + arg2 > 103 || var16.field2943 + arg3 > 103 || var16.field2914 + arg2 > 103 || var16.field2914 + arg3 > 103) {
                    return;
                }
                if (var16.field2915 != 0) {
                    field527[arg0].method2164(arg2, arg3, var16.field2943, var16.field2914, var14, var16.field2916);
                }
            }
            if (arg1 == 3) {
                Statics.field688.method1669(arg0, arg2, arg3);
                class198 var17 = class198.method2502(var12);
                if (var17.field2915 == 1) {
                    field527[arg0].method2166(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class11.field86[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class88 var19 = Statics.field688;
        class118 var20 = field527[arg0];
        class198 var21 = class198.method2502(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field2914;
            var23 = var21.field2943;
        } else {
            var22 = var21.field2943;
            var23 = var21.field2914;
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
        int[][] var28 = class11.field103[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field2917 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field2938 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class90 var34;
            if (var21.field2921 == -1 && var21.field2939 == null) {
                var34 = var21.method3420(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class50(arg4, 22, arg5, var18, arg2, arg3, var21.field2921, true, (class90) null);
            }
            var19.method1655(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field2915 == 1) {
                var20.method2161(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class90 var57;
            if (var21.field2921 == -1 && var21.field2939 == null) {
                var57 = var21.method3420(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class50(arg4, 10, arg5, var18, arg2, arg3, var21.field2921, true, (class90) null);
            }
            if (var57 != null) {
                var19.method1662(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field2915 != 0) {
                var20.method2171(arg2, arg3, var22, var23, var21.field2916);
            }
        } else if (arg6 >= 12) {
            class90 var35;
            if (var21.field2921 == -1 && var21.field2939 == null) {
                var35 = var21.method3420(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class50(arg4, arg6, arg5, var18, arg2, arg3, var21.field2921, true, (class90) null);
            }
            var19.method1662(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field2915 != 0) {
                var20.method2171(arg2, arg3, var22, var23, var21.field2916);
            }
        } else if (arg6 == 0) {
            class90 var36;
            if (var21.field2921 == -1 && var21.field2939 == null) {
                var36 = var21.method3420(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class50(arg4, 0, arg5, var18, arg2, arg3, var21.field2921, true, (class90) null);
            }
            var19.method1789(arg0, arg2, arg3, var29, var36, (class90) null, class11.field91[arg5], 0, var32, var33);
            if (var21.field2915 != 0) {
                var20.method2158(arg2, arg3, arg6, arg5, var21.field2916);
            }
        } else if (arg6 == 1) {
            class90 var37;
            if (var21.field2921 == -1 && var21.field2939 == null) {
                var37 = var21.method3420(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class50(arg4, 1, arg5, var18, arg2, arg3, var21.field2921, true, (class90) null);
            }
            var19.method1789(arg0, arg2, arg3, var29, var37, (class90) null, class11.field102[arg5], 0, var32, var33);
            if (var21.field2915 != 0) {
                var20.method2158(arg2, arg3, arg6, arg5, var21.field2916);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class90 var39;
            class90 var40;
            if (var21.field2921 == -1 && var21.field2939 == null) {
                var39 = var21.method3420(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method3420(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class50(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field2921, true, (class90) null);
                var40 = new class50(arg4, 2, var38, var18, arg2, arg3, var21.field2921, true, (class90) null);
            }
            var19.method1789(arg0, arg2, arg3, var29, var39, var40, class11.field91[arg5], class11.field91[var38], var32, var33);
            if (var21.field2915 != 0) {
                var20.method2158(arg2, arg3, arg6, arg5, var21.field2916);
            }
        } else if (arg6 == 3) {
            class90 var41;
            if (var21.field2921 == -1 && var21.field2939 == null) {
                var41 = var21.method3420(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class50(arg4, 3, arg5, var18, arg2, arg3, var21.field2921, true, (class90) null);
            }
            var19.method1789(arg0, arg2, arg3, var29, var41, (class90) null, class11.field102[arg5], 0, var32, var33);
            if (var21.field2915 != 0) {
                var20.method2158(arg2, arg3, arg6, arg5, var21.field2916);
            }
        } else if (arg6 == 9) {
            class90 var42;
            if (var21.field2921 == -1 && var21.field2939 == null) {
                var42 = var21.method3420(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class50(arg4, arg6, arg5, var18, arg2, arg3, var21.field2921, true, (class90) null);
            }
            var19.method1662(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field2915 != 0) {
                var20.method2171(arg2, arg3, var22, var23, var21.field2916);
            }
        } else if (arg6 == 4) {
            class90 var43;
            if (var21.field2921 == -1 && var21.field2939 == null) {
                var43 = var21.method3420(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class50(arg4, 4, arg5, var18, arg2, arg3, var21.field2921, true, (class90) null);
            }
            var19.method1658(arg0, arg2, arg3, var29, var43, (class90) null, class11.field91[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1675(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class198.method2502(var45 >> 14 & 0x7FFF).field2900;
            }
            class90 var46;
            if (var21.field2921 == -1 && var21.field2939 == null) {
                var46 = var21.method3420(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class50(arg4, 4, arg5, var18, arg2, arg3, var21.field2921, true, (class90) null);
            }
            var19.method1658(arg0, arg2, arg3, var29, var46, (class90) null, class11.field91[arg5], 0, class11.field93[arg5] * var44, class11.field94[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1675(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class198.method2502(var48 >> 14 & 0x7FFF).field2900 / 2;
            }
            class90 var49;
            if (var21.field2921 == -1 && var21.field2939 == null) {
                var49 = var21.method3420(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class50(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field2921, true, (class90) null);
            }
            var19.method1658(arg0, arg2, arg3, var29, var49, (class90) null, 256, arg5, class11.field85[arg5] * var47, class11.field96[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class90 var51;
            if (var21.field2921 == -1 && var21.field2939 == null) {
                var51 = var21.method3420(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class50(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field2921, true, (class90) null);
            }
            var19.method1658(arg0, arg2, arg3, var29, var51, (class90) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1675(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class198.method2502(var53 >> 14 & 0x7FFF).field2900 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class90 var55;
            class90 var56;
            if (var21.field2921 == -1 && var21.field2939 == null) {
                var55 = var21.method3420(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method3420(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class50(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field2921, true, (class90) null);
                var56 = new class50(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field2921, true, (class90) null);
            }
            var19.method1658(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class11.field85[arg5] * var52, class11.field96[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("client.bw(III)V")
    public static final void method350(int arg0, int arg1) {
        class129 var2 = field433[Statics.field3063][arg0][arg1];
        if (var2 == null) {
            Statics.field688.method1670(Statics.field3063, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class44 var5 = null;
        for (class44 var6 = (class44) var2.method2301(); var6 != null; var6 = (class44) var2.method2309()) {
            class199 var7 = class199.method3402(var6.field907);
            long var8 = (long) var7.field2971;
            if (var7.field2958 == 1) {
                var8 = (long) (var6.field906 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field688.method1670(Statics.field3063, arg0, arg1);
            return;
        }
        var2.method2297(var5);
        class44 var10 = null;
        class44 var11 = null;
        for (class44 var12 = (class44) var2.method2301(); var12 != null; var12 = (class44) var2.method2309()) {
            if (var5.field907 != var12.field907) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field907 != var12.field907 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field688.method1656(Statics.field3063, arg0, arg1, method1906(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field3063), var5, var13, var10, var11);
    }

    @ObfuscatedName("d.be(ZI)V")
    public static final void method161(boolean arg0) {
        field311 = 0;
        field344 = 0;
        field348.method2891();
        int var1 = field348.method2900(8);
        if (var1 < field403) {
            for (int var2 = var1; var2 < field403; var2++) {
                field427[++field311 - 1] = field343[var2];
            }
        }
        if (var1 > field403) {
            throw new RuntimeException("");
        }
        field403 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field343[var3];
            class36 var5 = field412[var4];
            int var6 = field348.method2900(1);
            if (var6 == 0) {
                field343[++field403 - 1] = var4;
                var5.field668 = field312;
            } else {
                int var7 = field348.method2900(2);
                if (var7 == 0) {
                    field343[++field403 - 1] = var4;
                    var5.field668 = field312;
                    field486[++field344 - 1] = var4;
                } else if (var7 == 1) {
                    field343[++field403 - 1] = var4;
                    var5.field668 = field312;
                    int var8 = field348.method2900(3);
                    var5.method729(var8, (byte) 1);
                    int var9 = field348.method2900(1);
                    if (var9 == 1) {
                        field486[++field344 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field343[++field403 - 1] = var4;
                    var5.field668 = field312;
                    int var10 = field348.method2900(3);
                    var5.method729(var10, (byte) 2);
                    int var11 = field348.method2900(3);
                    var5.method729(var11, (byte) 2);
                    int var12 = field348.method2900(1);
                    if (var12 == 1) {
                        field486[++field344 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field427[++field311 - 1] = var4;
                }
            }
        }
        while (field348.method2887(field349) >= 27) {
            int var13 = field348.method2900(15);
            if (var13 == 32767) {
                break;
            }
            boolean var43 = false;
            if (field412[var13] == null) {
                field412[var13] = new class36();
                var43 = true;
            }
            class36 var44 = field412[var13];
            field343[++field403 - 1] = var13;
            var44.field668 = field312;
            int var45 = field348.method2900(1);
            int var46 = field348.method2900(1);
            if (var46 == 1) {
                field486[++field344 - 1] = var13;
            }
            int var47 = field431[field348.method2900(3)];
            if (var43) {
                var44.field670 = var44.field671 = var47;
            }
            var44.field783 = class200.method168(field348.method2900(14));
            int var48;
            if (arg0) {
                var48 = field348.method2900(8);
                if (var48 > 127) {
                    var48 -= 256;
                }
            } else {
                var48 = field348.method2900(5);
                if (var48 > 15) {
                    var48 -= 32;
                }
            }
            int var49;
            if (arg0) {
                var49 = field348.method2900(8);
                if (var49 > 127) {
                    var49 -= 256;
                }
            } else {
                var49 = field348.method2900(5);
                if (var49 > 15) {
                    var49 -= 32;
                }
            }
            var44.field623 = var44.field783.field3012;
            var44.field672 = var44.field783.field3035;
            if (var44.field672 == 0) {
                var44.field671 = 0;
            }
            var44.field627 = var44.field783.field3018;
            var44.field628 = var44.field783.field3019;
            var44.field646 = var44.field783.field3020;
            var44.field630 = var44.field783.field3032;
            var44.field624 = var44.field783.field3015;
            var44.field634 = var44.field783.field3039;
            var44.field626 = var44.field783.field3017;
            var44.method730(Statics.field899.field674[0] + var48, Statics.field899.field675[0] + var49, var45 == 1);
        }
        field348.method2892();
        for (int var14 = 0; var14 < field344; var14++) {
            int var15 = field486[var14];
            class36 var16 = field412[var15];
            int var17 = field348.method2666();
            if ((var17 & 0x8) != 0) {
                var16.field783 = class200.method168(field348.method2652());
                var16.field623 = var16.field783.field3012;
                var16.field672 = var16.field783.field3035;
                var16.field627 = var16.field783.field3018;
                var16.field628 = var16.field783.field3019;
                var16.field646 = var16.field783.field3020;
                var16.field630 = var16.field783.field3032;
                var16.field624 = var16.field783.field3015;
                var16.field634 = var16.field783.field3039;
                var16.field626 = var16.field783.field3017;
            }
            if ((var17 & 0x20) != 0) {
                var16.field632 = field348.method2674();
                var16.field657 = 100;
            }
            if ((var17 & 0x1) != 0) {
                int var18 = field348.method2703();
                int var19 = field348.method2652();
                int var20 = var16.field625 - (var18 - Statics.field1880 - Statics.field1880) * 64;
                int var21 = var16.field620 - (var19 - Statics.field2792 - Statics.field2792) * 64;
                if (var20 != 0 || var21 != 0) {
                    var16.field647 = (int) (Math.atan2((double) var20, (double) var21) * 325.949D) & 0x7FF;
                }
            }
            if ((var17 & 0x40) != 0) {
                int var22 = field348.method2702();
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var23 = field348.method2814();
                if (var16.field651 == var22 && var22 != -1) {
                    int var24 = class202.method164(var22).field3074;
                    if (var24 == 1) {
                        var16.field654 = 0;
                        var16.field653 = 0;
                        var16.field621 = var23;
                        var16.field638 = 0;
                    }
                    if (var24 == 2) {
                        var16.field638 = 0;
                    }
                } else if (var22 == -1 || var16.field651 == -1 || class202.method164(var22).field3068 >= class202.method164(var16.field651).field3068) {
                    var16.field651 = var22;
                    var16.field654 = 0;
                    var16.field653 = 0;
                    var16.field621 = var23;
                    var16.field638 = 0;
                    var16.field656 = var16.field673;
                }
            }
            if ((var17 & 0x2) != 0) {
                int var25 = field348.method2850();
                if (var25 > 0) {
                    for (int var26 = 0; var26 < var25; var26++) {
                        int var27 = -1;
                        int var28 = -1;
                        int var29 = -1;
                        int var30 = field348.method2679();
                        if (var30 == 32767) {
                            var30 = field348.method2679();
                            var28 = field348.method2679();
                            var27 = field348.method2679();
                            var29 = field348.method2679();
                        } else if (var30 == 32766) {
                            var30 = -1;
                        } else {
                            var28 = field348.method2679();
                        }
                        int var31 = field348.method2679();
                        var16.method583(var30, var28, var27, var29, field312, var31);
                    }
                }
                int var32 = field348.method2814();
                if (var32 > 0) {
                    for (int var33 = 0; var33 < var32; var33++) {
                        int var34 = field348.method2679();
                        int var35 = field348.method2679();
                        if (var35 == 32767) {
                            var16.method569(var34);
                        } else {
                            int var36 = field348.method2679();
                            int var37 = field348.method2666();
                            int var38 = var35 > 0 ? field348.method2666() : var37;
                            var16.method570(var34, field312, var35, var36, var37, var38);
                        }
                    }
                }
            }
            if ((var17 & 0x4) != 0) {
                var16.field629 = field348.method2703();
                if (var16.field629 == 65535) {
                    var16.field629 = -1;
                }
            }
            if ((var17 & 0x10) != 0) {
                var16.field669 = field348.method2652();
                int var39 = field348.method2805();
                var16.field660 = var39 >> 16;
                var16.field659 = (var39 & 0xFFFF) + field312;
                var16.field679 = 0;
                var16.field639 = 0;
                if (var16.field659 > field312) {
                    var16.field679 = -1;
                }
                if (var16.field669 == 65535) {
                    var16.field669 = -1;
                }
            }
        }
        for (int var40 = 0; var40 < field311; var40++) {
            int var41 = field427[var40];
            if (field312 != field412[var41].field668) {
                field412[var41].field783 = null;
                field412[var41] = null;
            }
        }
        if (field349 != field348.field2111) {
            throw new RuntimeException(field348.field2111 + class38.field803 + field349);
        }
        for (int var42 = 0; var42 < field403; var42++) {
            if (field412[field343[var42]] == null) {
                throw new RuntimeException(var42 + class38.field803 + field403);
            }
        }
    }

    @ObfuscatedName("al.bg(Lt;IIBI)V")
    public static final void method901(class24 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field674[0];
        int var5 = arg0.field675[0];
        int var6 = arg0.method208();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var9 = arg0.method208();
        field583.field1875 = arg1;
        field583.field1883 = arg2;
        field583.field1877 = 1;
        field583.field1876 = 1;
        class23 var10 = field583;
        int var11 = class119.method1971(var4, var5, var9, var10, field527[arg0.field277], true, field584, field585);
        if (var11 >= 1) {
            for (int var12 = 0; var12 < var11 - 1; var12++) {
                arg0.method212(field584[var12], field585[var12], arg3);
            }
        }
    }

    @ObfuscatedName("ap.bz(B)V")
    public static void method749() {
        field442 = 0;
        field450 = -1;
        field441 = false;
    }

    @ObfuscatedName("g.bm(III)V")
    public static final void method186(int arg0, int arg1) {
        if (field442 < 2 && field456 == 0 && !field459) {
            return;
        }
        int var2 = method632();
        String var3;
        if (field456 == 1 && field442 < 2) {
            var3 = class174.field2519 + class174.field2625 + field458 + " " + class38.field802;
        } else if (field459 && field442 < 2) {
            var3 = field327 + class174.field2625 + field528 + " " + class38.field802;
        } else {
            String var4;
            if (var2 < 0) {
                var4 = "";
            } else if (field448[var2].length() > 0) {
                var4 = field577[var2] + class174.field2625 + field448[var2];
            } else {
                var4 = field577[var2];
            }
            var3 = var4;
        }
        if (field442 > 2) {
            var3 = var3 + class38.method154(16777215) + " " + '/' + " " + (field442 - 2) + class174.field2527;
        }
        Statics.field1120.method3684(var3, arg0 + 4, arg1 + 15, 16777215, 0, field312 / 1000);
    }

    @ObfuscatedName("eh.bo(I)V")
    public static final void method2567() {
        int var0 = Statics.field710;
        int var1 = Statics.field1718;
        int var2 = Statics.field2356;
        int var3 = Statics.field1659;
        int var4 = 6116423;
        class220.method3779(var0, var1, var2, var3, var4);
        class220.method3779(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class220.method3785(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1120.method3702(class174.field2526, var0 + 3, var1 + 14, var4, -1);
        int var5 = class116.field1818;
        int var6 = class116.field1819;
        for (int var7 = 0; var7 < field442; var7++) {
            int var8 = (field442 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class209 var10 = Statics.field1120;
            String var11;
            if (var7 < 0) {
                var11 = "";
            } else if (field448[var7].length() > 0) {
                var11 = field577[var7] + class174.field2625 + field448[var7];
            } else {
                var11 = field577[var7];
            }
            var10.method3702(var11, var0 + 3, var8, var9, 0);
        }
        method106(Statics.field710, Statics.field1718, Statics.field2356, Statics.field1659);
    }

    @ObfuscatedName("ej.bd(IIIIB)V")
    public static final void method2378(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field507; var4++) {
            if (field514[var4] + field300[var4] > arg0 && field300[var4] < arg0 + arg2 && field515[var4] + field513[var4] > arg1 && field513[var4] < arg1 + arg3) {
                field509[var4] = true;
            }
        }
    }

    @ObfuscatedName("j.ba(IIIII)V")
    public static final void method106(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field507; var4++) {
            if (field514[var4] + field300[var4] > arg0 && field300[var4] < arg0 + arg2 && field515[var4] + field513[var4] > arg1 && field513[var4] < arg1 + arg3) {
                field426[var4] = true;
            }
        }
    }

    @ObfuscatedName("ad.bi(IIB)V")
    public static final void method802(int arg0, int arg1) {
        int var2 = Statics.field1120.method3672(class174.field2526);
        for (int var3 = 0; var3 < field442; var3++) {
            class209 var4 = Statics.field1120;
            String var5;
            if (var3 < 0) {
                var5 = "";
            } else if (field448[var3].length() > 0) {
                var5 = field577[var3] + class174.field2625 + field448[var3];
            } else {
                var5 = field577[var3];
            }
            int var6 = var4.method3672(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field442 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field756) {
            var8 = Statics.field756 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field2208) {
            var9 = Statics.field2208 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        Statics.field688.method1686(Statics.field3063, arg0, arg1, false);
        field441 = true;
        Statics.field710 = var8;
        Statics.field1718 = var9;
        Statics.field2356 = var2;
        Statics.field1659 = field442 * 15 + 22;
    }

    @ObfuscatedName("ao.bs(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method813(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 50) {
            class24 var8 = field423[arg3];
            if (var8 != null) {
                field558 = arg6;
                field411 = arg7;
                field413 = 2;
                field313 = 0;
                field538 = arg0;
                field435 = arg1;
                field495.method2889(45);
                field495.method2772(arg3);
                field495.method2691(class106.field1735[82] ? 1 : 0);
            }
        }
        if (arg2 == 9) {
            class36 var9 = field412[arg3];
            if (var9 != null) {
                field558 = arg6;
                field411 = arg7;
                field413 = 2;
                field313 = 0;
                field538 = arg0;
                field435 = arg1;
                field495.method2889(203);
                field495.method2772(arg3);
                field495.method2690(class106.field1735[82] ? 1 : 0);
            }
        }
        if (arg2 == 23) {
            if (field441) {
                Statics.field688.method1719();
            } else {
                Statics.field688.method1686(Statics.field3063, arg0, arg1, true);
            }
        }
        if (arg2 == 12) {
            class36 var10 = field412[arg3];
            if (var10 != null) {
                field558 = arg6;
                field411 = arg7;
                field413 = 2;
                field313 = 0;
                field538 = arg0;
                field435 = arg1;
                field495.method2889(94);
                field495.method2694(arg3);
                field495.method2651(class106.field1735[82] ? 1 : 0);
            }
        }
        if (arg2 == 22) {
            field558 = arg6;
            field411 = arg7;
            field413 = 2;
            field313 = 0;
            field538 = arg0;
            field435 = arg1;
            field495.method2889(235);
            field495.method2694(Statics.field1880 + arg0);
            field495.method2694(arg3);
            field495.method2691(class106.field1735[82] ? 1 : 0);
            field495.method2793(Statics.field2792 + arg1);
        }
        if (arg2 == 49) {
            class24 var11 = field423[arg3];
            if (var11 != null) {
                field558 = arg6;
                field411 = arg7;
                field413 = 2;
                field313 = 0;
                field538 = arg0;
                field435 = arg1;
                field495.method2889(172);
                field495.method2694(arg3);
                field495.method2651(class106.field1735[82] ? 1 : 0);
            }
        }
        if (arg2 == 28) {
            field495.method2889(143);
            field495.method2654(arg1);
            class170 var12 = Statics.method1837(arg1);
            if (var12.field2282 != null && var12.field2282[0][0] == 5) {
                int var13 = var12.field2282[0][1];
                class166.field2181[var13] = 1 - class166.field2181[var13];
                method551(var13);
            }
        }
        if (arg2 == 1003) {
            field558 = arg6;
            field411 = arg7;
            field413 = 2;
            field313 = 0;
            class36 var14 = field412[arg3];
            if (var14 != null) {
                class200 var15 = var14.field783;
                if (var15.field3036 != null) {
                    var15 = var15.method3517();
                }
                if (var15 != null) {
                    field495.method2889(125);
                    field495.method2699(var15.field3010);
                }
            }
        }
        if (arg2 == 35) {
            field495.method2889(187);
            field495.method2749(arg1);
            field495.method2699(arg0);
            field495.method2699(arg3);
            field352 = 0;
            Statics.field43 = Statics.method1837(arg1);
            field453 = arg0;
        }
        if (arg2 == 29) {
            field495.method2889(143);
            field495.method2654(arg1);
            class170 var16 = Statics.method1837(arg1);
            if (var16.field2282 != null && var16.field2282[0][0] == 5) {
                int var17 = var16.field2282[0][1];
                if (class166.field2181[var17] != var16.field2334[0]) {
                    class166.field2181[var17] = var16.field2334[0];
                    method551(var17);
                }
            }
        }
        if (arg2 == 2) {
            field558 = arg6;
            field411 = arg7;
            field413 = 2;
            field313 = 0;
            field538 = arg0;
            field435 = arg1;
            field495.method2889(230);
            field495.method2699(Statics.field1880 + arg0);
            field495.method2699(field415);
            field495.method2694(Statics.field2792 + arg1);
            field495.method2654(Statics.field285);
            field495.method2793(arg3 >> 14 & 0x7FFF);
            field495.method2651(class106.field1735[82] ? 1 : 0);
        }
        if (arg2 == 37) {
            field495.method2889(245);
            field495.method2694(arg0);
            field495.method2772(arg3);
            field495.method2749(arg1);
            field352 = 0;
            Statics.field43 = Statics.method1837(arg1);
            field453 = arg0;
        }
        if (arg2 == 36) {
            field495.method2889(109);
            field495.method2772(arg0);
            field495.method2654(arg1);
            field495.method2772(arg3);
            field352 = 0;
            Statics.field43 = Statics.method1837(arg1);
            field453 = arg0;
        }
        if (arg2 == 40) {
            field495.method2889(76);
            field495.method2699(arg0);
            field495.method2793(arg3);
            field495.method2708(arg1);
            field352 = 0;
            Statics.field43 = Statics.method1837(arg1);
            field453 = arg0;
        }
        if (arg2 == 58) {
            class170 var18 = class170.method2195(arg1, arg0);
            if (var18 != null) {
                field495.method2889(171);
                field495.method2707(arg1);
                field495.method2793(var18.field2340);
                field495.method2772(arg0);
                field495.method2654(Statics.field285);
                field495.method2793(field461);
                field495.method2699(field415);
            }
        }
        if (arg2 == 18) {
            field558 = arg6;
            field411 = arg7;
            field413 = 2;
            field313 = 0;
            field538 = arg0;
            field435 = arg1;
            field495.method2889(93);
            field495.method2694(Statics.field1880 + arg0);
            field495.method2772(Statics.field2792 + arg1);
            field495.method2772(arg3);
            field495.method2692(class106.field1735[82] ? 1 : 0);
        }
        if (arg2 == 3) {
            field558 = arg6;
            field411 = arg7;
            field413 = 2;
            field313 = 0;
            field538 = arg0;
            field435 = arg1;
            field495.method2889(185);
            field495.method2793(arg3 >> 14 & 0x7FFF);
            field495.method2772(Statics.field1880 + arg0);
            field495.method2772(Statics.field2792 + arg1);
            field495.method2690(class106.field1735[82] ? 1 : 0);
        }
        if (arg2 == 41) {
            field495.method2889(83);
            field495.method2699(arg0);
            field495.method2654(arg1);
            field495.method2694(arg3);
            field352 = 0;
            Statics.field43 = Statics.method1837(arg1);
            field453 = arg0;
        }
        if (arg2 == 1004) {
            field558 = arg6;
            field411 = arg7;
            field413 = 2;
            field313 = 0;
            field495.method2889(63);
            field495.method2699(arg3);
        }
        if (arg2 == 20) {
            field558 = arg6;
            field411 = arg7;
            field413 = 2;
            field313 = 0;
            field538 = arg0;
            field435 = arg1;
            field495.method2889(211);
            field495.method2772(Statics.field2792 + arg1);
            field495.method2694(Statics.field1880 + arg0);
            field495.method2692(class106.field1735[82] ? 1 : 0);
            field495.method2772(arg3);
        }
        if (arg2 == 4) {
            field558 = arg6;
            field411 = arg7;
            field413 = 2;
            field313 = 0;
            field538 = arg0;
            field435 = arg1;
            field495.method2889(47);
            field495.method2694(arg3 >> 14 & 0x7FFF);
            field495.method2694(Statics.field2792 + arg1);
            field495.method2690(class106.field1735[82] ? 1 : 0);
            field495.method2793(Statics.field1880 + arg0);
        }
        if (arg2 == 25) {
            class170 var19 = class170.method2195(arg1, arg0);
            if (var19 != null) {
                method78();
                int var20 = method3309(var19);
                int var21 = var20 >> 11 & 0x3F;
                int var23 = var19.field2340;
                class170 var24 = class170.method2195(arg1, arg0);
                if (var24 != null && var24.field2351 != null) {
                    class19 var25 = new class19();
                    var25.field208 = var24;
                    var25.field200 = var24.field2351;
                    class33.method566(var25);
                }
                field461 = var23;
                field459 = true;
                Statics.field285 = arg1;
                field415 = arg0;
                Statics.field3005 = var21;
                method198(var24);
                field456 = 0;
                int var26 = method3309(var19);
                int var27 = var26 >> 11 & 0x3F;
                String var28;
                if (var27 == 0) {
                    var28 = null;
                } else if (var19.field2329 == null || var19.field2329.trim().length() == 0) {
                    var28 = null;
                } else {
                    var28 = var19.field2329;
                }
                field327 = var28;
                if (field327 == null) {
                    field327 = "Null";
                }
                if (var19.field2230) {
                    field528 = var19.field2293 + class38.method154(16777215);
                } else {
                    field528 = class38.method154(65280) + var19.field2336 + class38.method154(16777215);
                }
            }
            return;
        }
        if (arg2 == 1001) {
            field558 = arg6;
            field411 = arg7;
            field413 = 2;
            field313 = 0;
            field538 = arg0;
            field435 = arg1;
            field495.method2889(67);
            field495.method2691(class106.field1735[82] ? 1 : 0);
            field495.method2699(arg3 >> 14 & 0x7FFF);
            field495.method2699(Statics.field1880 + arg0);
            field495.method2793(Statics.field2792 + arg1);
        }
        if (arg2 == 51) {
            class24 var29 = field423[arg3];
            if (var29 != null) {
                field558 = arg6;
                field411 = arg7;
                field413 = 2;
                field313 = 0;
                field538 = arg0;
                field435 = arg1;
                field495.method2889(150);
                field495.method2694(arg3);
                field495.method2692(class106.field1735[82] ? 1 : 0);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class170 var30 = class170.method2195(arg1, arg0);
            if (var30 != null) {
                int var31 = var30.field2340;
                class170 var32 = class170.method2195(arg1, arg0);
                if (var32 != null) {
                    if (var32.field2320 != null) {
                        class19 var33 = new class19();
                        var33.field208 = var32;
                        var33.field203 = arg3;
                        var33.field201 = arg5;
                        var33.field200 = var32.field2320;
                        class33.method566(var33);
                    }
                    boolean var34 = true;
                    if (var32.field2326 > 0) {
                        var34 = Statics.method1481(var32);
                    }
                    if (var34 && class171.method2648(method3309(var32), arg3 - 1)) {
                        if (arg3 == 1) {
                            field495.method2889(74);
                            field495.method2654(arg1);
                            field495.method2793(arg0);
                            field495.method2793(var31);
                        }
                        if (arg3 == 2) {
                            field495.method2889(155);
                            field495.method2654(arg1);
                            field495.method2793(arg0);
                            field495.method2793(var31);
                        }
                        if (arg3 == 3) {
                            field495.method2889(70);
                            field495.method2654(arg1);
                            field495.method2793(arg0);
                            field495.method2793(var31);
                        }
                        if (arg3 == 4) {
                            field495.method2889(190);
                            field495.method2654(arg1);
                            field495.method2793(arg0);
                            field495.method2793(var31);
                        }
                        if (arg3 == 5) {
                            field495.method2889(179);
                            field495.method2654(arg1);
                            field495.method2793(arg0);
                            field495.method2793(var31);
                        }
                        if (arg3 == 6) {
                            field495.method2889(219);
                            field495.method2654(arg1);
                            field495.method2793(arg0);
                            field495.method2793(var31);
                        }
                        if (arg3 == 7) {
                            field495.method2889(142);
                            field495.method2654(arg1);
                            field495.method2793(arg0);
                            field495.method2793(var31);
                        }
                        if (arg3 == 8) {
                            field495.method2889(8);
                            field495.method2654(arg1);
                            field495.method2793(arg0);
                            field495.method2793(var31);
                        }
                        if (arg3 == 9) {
                            field495.method2889(115);
                            field495.method2654(arg1);
                            field495.method2793(arg0);
                            field495.method2793(var31);
                        }
                        if (arg3 == 10) {
                            field495.method2889(194);
                            field495.method2654(arg1);
                            field495.method2793(arg0);
                            field495.method2793(var31);
                        }
                    }
                }
            }
        }
        if (arg2 == 47) {
            class24 var35 = field423[arg3];
            if (var35 != null) {
                field558 = arg6;
                field411 = arg7;
                field413 = 2;
                field313 = 0;
                field538 = arg0;
                field435 = arg1;
                field495.method2889(135);
                field495.method2694(arg3);
                field495.method2691(class106.field1735[82] ? 1 : 0);
            }
        }
        if (arg2 == 46) {
            class24 var36 = field423[arg3];
            if (var36 != null) {
                field558 = arg6;
                field411 = arg7;
                field413 = 2;
                field313 = 0;
                field538 = arg0;
                field435 = arg1;
                field495.method2889(44);
                field495.method2690(class106.field1735[82] ? 1 : 0);
                field495.method2772(arg3);
            }
        }
        if (arg2 == 15) {
            class24 var37 = field423[arg3];
            if (var37 != null) {
                field558 = arg6;
                field411 = arg7;
                field413 = 2;
                field313 = 0;
                field538 = arg0;
                field435 = arg1;
                field495.method2889(178);
                field495.method2691(class106.field1735[82] ? 1 : 0);
                field495.method2708(Statics.field285);
                field495.method2772(field415);
                field495.method2793(arg3);
            }
        }
        if (arg2 == 48) {
            class24 var38 = field423[arg3];
            if (var38 != null) {
                field558 = arg6;
                field411 = arg7;
                field413 = 2;
                field313 = 0;
                field538 = arg0;
                field435 = arg1;
                field495.method2889(112);
                field495.method2692(class106.field1735[82] ? 1 : 0);
                field495.method2699(arg3);
            }
        }
        if (arg2 == 1) {
            field558 = arg6;
            field411 = arg7;
            field413 = 2;
            field313 = 0;
            field538 = arg0;
            field435 = arg1;
            field495.method2889(68);
            field495.method2793(Statics.field1880 + arg0);
            field495.method2772(arg3 >> 14 & 0x7FFF);
            field495.method2694(Statics.field958);
            field495.method2772(Statics.field2792 + arg1);
            field495.method2699(Statics.field457);
            field495.method2651(class106.field1735[82] ? 1 : 0);
            field495.method2749(Statics.field2690);
        }
        if (arg2 == 7) {
            class36 var39 = field412[arg3];
            if (var39 != null) {
                field558 = arg6;
                field411 = arg7;
                field413 = 2;
                field313 = 0;
                field538 = arg0;
                field435 = arg1;
                field495.method2889(243);
                field495.method2749(Statics.field2690);
                field495.method2699(Statics.field457);
                field495.method2772(Statics.field958);
                field495.method2694(arg3);
                field495.method2690(class106.field1735[82] ? 1 : 0);
            }
        }
        if (arg2 == 16) {
            field558 = arg6;
            field411 = arg7;
            field413 = 2;
            field313 = 0;
            field538 = arg0;
            field435 = arg1;
            field495.method2889(234);
            field495.method2699(Statics.field457);
            field495.method2699(Statics.field958);
            field495.method2694(Statics.field2792 + arg1);
            field495.method2772(arg3);
            field495.method2699(Statics.field1880 + arg0);
            field495.method2690(class106.field1735[82] ? 1 : 0);
            field495.method2708(Statics.field2690);
        }
        if (arg2 == 19) {
            field558 = arg6;
            field411 = arg7;
            field413 = 2;
            field313 = 0;
            field538 = arg0;
            field435 = arg1;
            field495.method2889(4);
            field495.method2772(Statics.field2792 + arg1);
            field495.method2651(class106.field1735[82] ? 1 : 0);
            field495.method2694(Statics.field1880 + arg0);
            field495.method2699(arg3);
        }
        if (arg2 == 42) {
            field495.method2889(139);
            field495.method2772(arg0);
            field495.method2793(arg3);
            field495.method2707(arg1);
            field352 = 0;
            Statics.field43 = Statics.method1837(arg1);
            field453 = arg0;
        }
        if (arg2 == 34) {
            field495.method2889(20);
            field495.method2793(arg3);
            field495.method2708(arg1);
            field495.method2772(arg0);
            field352 = 0;
            Statics.field43 = Statics.method1837(arg1);
            field453 = arg0;
        }
        if (arg2 == 17) {
            field558 = arg6;
            field411 = arg7;
            field413 = 2;
            field313 = 0;
            field538 = arg0;
            field435 = arg1;
            field495.method2889(71);
            field495.method2694(arg3);
            field495.method2793(Statics.field1880 + arg0);
            field495.method2699(Statics.field2792 + arg1);
            field495.method2699(field415);
            field495.method2690(class106.field1735[82] ? 1 : 0);
            field495.method2707(Statics.field285);
        }
        if (arg2 == 43) {
            field495.method2889(39);
            field495.method2772(arg0);
            field495.method2793(arg3);
            field495.method2707(arg1);
            field352 = 0;
            Statics.field43 = Statics.method1837(arg1);
            field453 = arg0;
        }
        if (arg2 == 13) {
            class36 var40 = field412[arg3];
            if (var40 != null) {
                field558 = arg6;
                field411 = arg7;
                field413 = 2;
                field313 = 0;
                field538 = arg0;
                field435 = arg1;
                field495.method2889(147);
                field495.method2692(class106.field1735[82] ? 1 : 0);
                field495.method2694(arg3);
            }
        }
        if (arg2 == 32) {
            field495.method2889(157);
            field495.method2694(arg0);
            field495.method2793(field415);
            field495.method2749(arg1);
            field495.method2708(Statics.field285);
            field495.method2772(arg3);
            field352 = 0;
            Statics.field43 = Statics.method1837(arg1);
            field453 = arg0;
        }
        if (arg2 == 31) {
            field495.method2889(113);
            field495.method2654(arg1);
            field495.method2708(Statics.field2690);
            field495.method2772(Statics.field457);
            field495.method2793(arg3);
            field495.method2793(arg0);
            field495.method2694(Statics.field958);
            field352 = 0;
            Statics.field43 = Statics.method1837(arg1);
            field453 = arg0;
        }
        if (arg2 == 44) {
            class24 var41 = field423[arg3];
            if (var41 != null) {
                field558 = arg6;
                field411 = arg7;
                field413 = 2;
                field313 = 0;
                field538 = arg0;
                field435 = arg1;
                field495.method2889(28);
                field495.method2651(class106.field1735[82] ? 1 : 0);
                field495.method2694(arg3);
            }
        }
        if (arg2 == 6) {
            field558 = arg6;
            field411 = arg7;
            field413 = 2;
            field313 = 0;
            field538 = arg0;
            field435 = arg1;
            field495.method2889(174);
            field495.method2793(Statics.field2792 + arg1);
            field495.method2699(arg3 >> 14 & 0x7FFF);
            field495.method2793(Statics.field1880 + arg0);
            field495.method2691(class106.field1735[82] ? 1 : 0);
        }
        if (arg2 == 8) {
            class36 var42 = field412[arg3];
            if (var42 != null) {
                field558 = arg6;
                field411 = arg7;
                field413 = 2;
                field313 = 0;
                field538 = arg0;
                field435 = arg1;
                field495.method2889(110);
                field495.method2690(class106.field1735[82] ? 1 : 0);
                field495.method2793(arg3);
                field495.method2654(Statics.field285);
                field495.method2772(field415);
            }
        }
        if (arg2 == 30 && field468 == null) {
            field495.method2889(153);
            field495.method2699(arg0);
            field495.method2707(arg1);
            field468 = class170.method2195(arg1, arg0);
            method198(field468);
        }
        if (arg2 == 10) {
            class36 var43 = field412[arg3];
            if (var43 != null) {
                field558 = arg6;
                field411 = arg7;
                field413 = 2;
                field313 = 0;
                field538 = arg0;
                field435 = arg1;
                field495.method2889(56);
                field495.method2793(arg3);
                field495.method2691(class106.field1735[82] ? 1 : 0);
            }
        }
        if (arg2 == 14) {
            class24 var44 = field423[arg3];
            if (var44 != null) {
                field558 = arg6;
                field411 = arg7;
                field413 = 2;
                field313 = 0;
                field538 = arg0;
                field435 = arg1;
                field495.method2889(75);
                field495.method2793(Statics.field457);
                field495.method2749(Statics.field2690);
                field495.method2692(class106.field1735[82] ? 1 : 0);
                field495.method2694(arg3);
                field495.method2772(Statics.field958);
            }
        }
        if (arg2 == 45) {
            class24 var45 = field423[arg3];
            if (var45 != null) {
                field558 = arg6;
                field411 = arg7;
                field413 = 2;
                field313 = 0;
                field538 = arg0;
                field435 = arg1;
                field495.method2889(34);
                field495.method2699(arg3);
                field495.method2690(class106.field1735[82] ? 1 : 0);
            }
        }
        if (arg2 == 39) {
            field495.method2889(146);
            field495.method2793(arg3);
            field495.method2772(arg0);
            field495.method2749(arg1);
            field352 = 0;
            Statics.field43 = Statics.method1837(arg1);
            field453 = arg0;
        }
        if (arg2 == 38) {
            method78();
            class170 var46 = Statics.method1837(arg1);
            field456 = 1;
            Statics.field958 = arg0;
            Statics.field2690 = arg1;
            Statics.field457 = arg3;
            method198(var46);
            field458 = class38.method154(16748608) + class199.method3402(arg3).field2954 + class38.method154(16777215);
            if (field458 == null) {
                field458 = "null";
            }
            return;
        }
        if (arg2 == 26) {
            method3194();
        }
        if (arg2 == 1002) {
            field558 = arg6;
            field411 = arg7;
            field413 = 2;
            field313 = 0;
            field495.method2889(248);
            field495.method2699(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1005) {
            class170 var47 = Statics.method1837(arg1);
            if (var47 == null || var47.field2339[arg0] < 100000) {
                field495.method2889(63);
                field495.method2699(arg3);
            } else {
                class48.method225(27, "", var47.field2339[arg0] + " x " + class199.method3402(arg3).field2954);
            }
            field352 = 0;
            Statics.field43 = Statics.method1837(arg1);
            field453 = arg0;
        }
        if (arg2 == 5) {
            field558 = arg6;
            field411 = arg7;
            field413 = 2;
            field313 = 0;
            field538 = arg0;
            field435 = arg1;
            field495.method2889(198);
            field495.method2690(class106.field1735[82] ? 1 : 0);
            field495.method2772(arg3 >> 14 & 0x7FFF);
            field495.method2699(Statics.field2792 + arg1);
            field495.method2699(Statics.field1880 + arg0);
        }
        if (arg2 == 11) {
            class36 var48 = field412[arg3];
            if (var48 != null) {
                field558 = arg6;
                field411 = arg7;
                field413 = 2;
                field313 = 0;
                field538 = arg0;
                field435 = arg1;
                field495.method2889(220);
                field495.method2651(class106.field1735[82] ? 1 : 0);
                field495.method2772(arg3);
            }
        }
        if (arg2 == 33) {
            field495.method2889(123);
            field495.method2654(arg1);
            field495.method2699(arg0);
            field495.method2772(arg3);
            field352 = 0;
            Statics.field43 = Statics.method1837(arg1);
            field453 = arg0;
        }
        if (arg2 == 21) {
            field558 = arg6;
            field411 = arg7;
            field413 = 2;
            field313 = 0;
            field538 = arg0;
            field435 = arg1;
            field495.method2889(159);
            field495.method2793(Statics.field2792 + arg1);
            field495.method2694(arg3);
            field495.method2691(class106.field1735[82] ? 1 : 0);
            field495.method2772(Statics.field1880 + arg0);
        }
        if (arg2 == 24) {
            class170 var49 = Statics.method1837(arg1);
            boolean var50 = true;
            if (var49.field2326 > 0) {
                var50 = Statics.method1481(var49);
            }
            if (var50) {
                field495.method2889(143);
                field495.method2654(arg1);
            }
        }
        if (field456 != 0) {
            field456 = 0;
            method198(Statics.method1837(Statics.field2690));
        }
        if (field459) {
            method78();
        }
        if (Statics.field43 != null && field352 == 0) {
            method198(Statics.field43);
        }
    }

    @ObfuscatedName("l.bt(B)V")
    public static void method78() {
        if (!field459) {
            return;
        }
        class170 var0 = class170.method2195(Statics.field285, field415);
        if (var0 != null && var0.field2312 != null) {
            class19 var1 = new class19();
            var1.field208 = var0;
            var1.field200 = var0.field2312;
            class33.method566(var1);
        }
        field459 = false;
        method198(var0);
    }

    @ObfuscatedName("ag.bp(B)V")
    public static final void method640() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field442 - 1; var1++) {
                if (field524[var1] < 1000 && field524[var1 + 1] > 1000) {
                    String var2 = field448[var1];
                    field448[var1] = field448[var1 + 1];
                    field448[var1 + 1] = var2;
                    String var3 = field577[var1];
                    field577[var1] = field577[var1 + 1];
                    field577[var1 + 1] = var3;
                    int var4 = field524[var1];
                    field524[var1] = field524[var1 + 1];
                    field524[var1 + 1] = var4;
                    int var5 = field443[var1];
                    field443[var1] = field443[var1 + 1];
                    field443[var1 + 1] = var5;
                    int var6 = field444[var1];
                    field444[var1] = field444[var1 + 1];
                    field444[var1 + 1] = var6;
                    int var7 = field446[var1];
                    field446[var1] = field446[var1 + 1];
                    field446[var1 + 1] = var7;
                    if (field450 != -1) {
                        if (field450 == var1) {
                            field450 = var1 + 1;
                        } else if (field450 == var1 + 1) {
                            field450 = var1;
                        }
                    }
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("dv.bn(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2196(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method3038(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("fk.cl(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method3038(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field441 || field442 >= 500) {
            return;
        }
        field577[field442] = arg0;
        field448[field442] = arg1;
        field524[field442] = arg2;
        field446[field442] = arg3;
        field443[field442] = arg4;
        field444[field442] = arg5;
        if (arg6) {
            field450 = field442;
        }
        field442++;
    }

    @ObfuscatedName("ah.cs(I)I")
    public static final int method632() {
        if (field442 <= 0) {
            return -1;
        } else if (field418 && class106.field1735[81] && field450 != -1) {
            return field450;
        } else {
            return field442 - 1;
        }
    }

    @ObfuscatedName("ga.cx(I)Z")
    public static final boolean method3271() {
        if (field442 <= 0) {
            return false;
        } else {
            return field418 && class106.field1735[81] && field450 != -1;
        }
    }

    @ObfuscatedName("k.cv(B)V")
    public static void method203() {
        for (int var0 = 0; var0 < field442; var0++) {
            int var1 = field524[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field442 - 1) {
                    for (int var3 = var0; var3 < field442 - 1; var3++) {
                        field577[var3] = field577[var3 + 1];
                        field448[var3] = field448[var3 + 1];
                        field524[var3] = field524[var3 + 1];
                        field446[var3] = field446[var3 + 1];
                        field443[var3] = field443[var3 + 1];
                        field444[var3] = field444[var3 + 1];
                    }
                }
                field442--;
            }
        }
    }

    @ObfuscatedName("eh.ce(IIIIB)V")
    public static final void method2569(int arg0, int arg1, int arg2, int arg3) {
        if (field456 == 0 && !field459) {
            method2196(class174.field2528, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class83.field1422; var6++) {
            int var7 = class83.field1436[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field688.method1679(Statics.field3063, var8, var9, var7) >= 0) {
                    class198 var12 = class198.method2502(var11);
                    if (var12.field2939 != null) {
                        var12 = var12.method3423();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field456 == 1) {
                        method2196(class174.field2519, field458 + " " + class38.field802 + " " + class38.method154(65535) + var12.field2932, 1, var7, var8, var9);
                    } else if (!field459) {
                        String[] var13 = var12.field2925;
                        if (field475) {
                            var13 = method656(var13);
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
                                    method2196(var13[var14], class38.method154(65535) + var12.field2932, var15, var7, var8, var9);
                                }
                            }
                        }
                        method2196(class174.field2524, class38.method154(65535) + var12.field2932, 1002, var12.field2905 << 14, var8, var9);
                    } else if ((Statics.field3005 & 0x4) == 4) {
                        method2196(field327, field528 + " " + class38.field802 + " " + class38.method154(65535) + var12.field2932, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class36 var16 = field412[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field783.field3012 == 1 && (var16.field625 & 0x7F) == 64 && (var16.field620 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field403; var17++) {
                            class36 var18 = field412[field343[var17]];
                            if (var18 != null && var16 != var18 && var18.field783.field3012 == 1 && var16.field625 == var18.field625 && var16.field620 == var18.field620) {
                                method2566(var18.field783, field343[var17], var8, var9);
                            }
                        }
                        int var19 = class46.field924;
                        int[] var20 = class46.field919;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class24 var22 = field423[var20[var21]];
                            if (var22 != null && var16.field625 == var22.field625 && var16.field620 == var22.field620) {
                                method25(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method2566(var16.field783, var11, var8, var9);
                }
                if (var10 == 0) {
                    class24 var23 = field423[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field625 & 0x7F) == 64 && (var23.field620 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field403; var24++) {
                            class36 var25 = field412[field343[var24]];
                            if (var25 != null && var25.field783.field3012 == 1 && var23.field625 == var25.field625 && var23.field620 == var25.field620) {
                                method2566(var25.field783, field343[var24], var8, var9);
                            }
                        }
                        int var26 = class46.field924;
                        int[] var27 = class46.field919;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class24 var29 = field423[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field625 == var29.field625 && var23.field620 == var29.field620) {
                                method25(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field341 == var11) {
                        var4 = var7;
                    } else {
                        method25(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class129 var30 = field433[Statics.field3063][var8][var9];
                    if (var30 != null) {
                        for (class44 var31 = (class44) var30.method2306(); var31 != null; var31 = (class44) var30.method2304()) {
                            class199 var32 = class199.method3402(var31.field907);
                            if (field456 == 1) {
                                method2196(class174.field2519, field458 + " " + class38.field802 + " " + class38.method154(16748608) + var32.field2954, 16, var31.field907, var8, var9);
                            } else if (!field459) {
                                String[] var33 = var32.field2957;
                                if (field475) {
                                    var33 = method656(var33);
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
                                        method2196(var33[var34], class38.method154(16748608) + var32.field2954, var35, var31.field907, var8, var9);
                                    } else if (var34 == 2) {
                                        method2196(class174.field2376, class38.method154(16748608) + var32.field2954, 20, var31.field907, var8, var9);
                                    }
                                }
                                method2196(class174.field2524, class38.method154(16748608) + var32.field2954, 1004, var31.field907, var8, var9);
                            } else if ((Statics.field3005 & 0x1) == 1) {
                                method2196(field327, field528 + " " + class38.field802 + " " + class38.method154(16748608) + var32.field2954, 17, var31.field907, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class24 var38 = field423[field341];
            method25(var38, field341, var36, var37);
        }
    }

    @ObfuscatedName("eh.cg(Lgv;IIII)V")
    public static final void method2566(class200 arg0, int arg1, int arg2, int arg3) {
        if (field442 >= 400) {
            return;
        }
        if (arg0.field3036 != null) {
            arg0 = arg0.method3517();
        }
        if (arg0 == null || !arg0.field3021 || arg0.field3008 && field472 != arg1) {
            return;
        }
        String var4 = arg0.field3011;
        if (arg0.field3028 != 0) {
            var4 = var4 + method2003(arg0.field3028, Statics.field899.field261) + " " + class38.field812 + class174.field2529 + arg0.field3028 + class38.field807;
        }
        if (arg0.field3008 && field449) {
            method2196(class174.field2524, class38.method154(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field456 == 1) {
            method2196(class174.field2519, field458 + " " + class38.field802 + " " + class38.method154(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field459) {
            int var5 = arg0.field3008 && field449 ? 2000 : 0;
            String[] var6 = arg0.field3026;
            if (field475) {
                var6 = method656(var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class174.field2525)) {
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
                        method2196(var6[var7], class38.method154(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class174.field2525)) {
                        short var10 = 0;
                        if (field393 != class41.field828) {
                            if (field393 == class41.field831 || field393 == class41.field830 && arg0.field3028 > Statics.field899.field261) {
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
                            method2196(var6[var9], class38.method154(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3008 || !field449) {
                method2196(class174.field2524, class38.method154(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field3005 & 0x2) == 2) {
            method2196(field327, field528 + " " + class38.field802 + " " + class38.method154(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("h.ck(Lt;IIII)V")
    public static final void method25(class24 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field899 == arg0 || field442 >= 400) {
            return;
        }
        String var4;
        if (arg0.field262 == 0) {
            var4 = arg0.field276[0] + arg0.field279 + arg0.field276[1] + method2003(arg0.field261, Statics.field899.field261) + " " + class38.field812 + class174.field2529 + arg0.field261 + class38.field807 + arg0.field276[2];
        } else {
            var4 = arg0.field276[0] + arg0.field279 + arg0.field276[1] + " " + class38.field812 + class174.field2530 + arg0.field262 + class38.field807 + arg0.field276[2];
        }
        if (field456 == 1) {
            method2196(class174.field2519, field458 + " " + class38.field802 + " " + class38.method154(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field459) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field429[var5] != null) {
                    short var6 = 0;
                    if (field429[var5].equalsIgnoreCase(class174.field2525)) {
                        if (field329 == class41.field828) {
                            continue;
                        }
                        if (field329 == class41.field831 || field329 == class41.field830 && arg0.field261 > Statics.field899.field261) {
                            var6 = 2000;
                        }
                        if (Statics.field899.field280 != 0 && arg0.field280 != 0) {
                            if (Statics.field899.field280 == arg0.field280) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field430[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field421[var5] + var6;
                    method2196(field429[var5], class38.method154(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field3005 & 0x8) == 8) {
            method2196(field327, field528 + " " + class38.field802 + " " + class38.method154(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field442; var9++) {
            if (field524[var9] == 23) {
                field448[var9] = class38.method154(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("ds.cn(III)Ljava/lang/String;")
    public static final String method2003(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class38.method154(16711680);
        } else if (var2 < -6) {
            return class38.method154(16723968);
        } else if (var2 < -3) {
            return class38.method154(16740352);
        } else if (var2 < 0) {
            return class38.method154(16756736);
        } else if (var2 > 9) {
            return class38.method154(65280);
        } else if (var2 > 6) {
            return class38.method154(4259584);
        } else if (var2 > 3) {
            return class38.method154(8453888);
        } else if (var2 > 0) {
            return class38.method154(12648192);
        } else {
            return class38.method154(16776960);
        }
    }

    @ObfuscatedName("as.cr(IIIIIIIII)V")
    public static final void method886(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class170.method179(arg0)) {
            Statics.field2171 = null;
            method1582(Statics.field2240[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2171 != null) {
                method1582(Statics.field2171, -1412584499, arg1, arg2, arg3, arg4, Statics.field2063, Statics.field246, arg7);
                Statics.field2171 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field509[var8] = true;
            }
        } else {
            field509[arg7] = true;
        }
    }

    @ObfuscatedName("cg.cf([Lfr;IIIIIIIII)V")
    public static final void method1582(class170[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class220.method3773(arg2, arg3, arg4, arg5);
        class85.method1584();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class170 var10 = arg0[var9];
            if (var10 != null && (var10.field2239 == arg1 || arg1 == -1412584499 && field477 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field300[field507] = var10.field2233 + arg6;
                    field513[field507] = var10.field2234 + arg7;
                    field514[field507] = var10.field2294;
                    field515[field507] = var10.field2210;
                    var11 = ++field507 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2310 = var11;
                var10.field2255 = field312;
                if (!var10.field2230 || !method2913(var10)) {
                    if (var10.field2326 > 0) {
                        int var12 = var10.field2326;
                        if (var12 == 324) {
                            if (field578 == -1) {
                                field578 = var10.field2236;
                                field299 = var10.field2333;
                            }
                            if (field510.field2187) {
                                var10.field2236 = field578;
                            } else {
                                var10.field2236 = field299;
                            }
                        } else if (var12 == 325) {
                            if (field578 == -1) {
                                field578 = var10.field2236;
                                field299 = var10.field2333;
                            }
                            if (field510.field2187) {
                                var10.field2236 = field299;
                            } else {
                                var10.field2236 = field578;
                            }
                        } else if (var12 == 327) {
                            var10.field2271 = 150;
                            var10.field2272 = (int) (Math.sin((double) field312 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2243 = 5;
                            var10.field2264 = 0;
                        } else if (var12 == 328) {
                            var10.field2271 = 150;
                            var10.field2272 = (int) (Math.sin((double) field312 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2243 = 5;
                            var10.field2264 = 1;
                        }
                    }
                    int var13 = var10.field2233 + arg6;
                    int var14 = var10.field2234 + arg7;
                    int var15 = var10.field2251;
                    if (field477 == var10) {
                        if (arg1 != -1412584499 && !var10.field2298) {
                            Statics.field2171 = arg0;
                            Statics.field2063 = arg6;
                            Statics.field246 = arg7;
                            continue;
                        }
                        if (field488 && field482) {
                            int var16 = class116.field1818;
                            int var17 = class116.field1819;
                            int var18 = var16 - field479;
                            int var19 = var17 - field480;
                            if (var18 < field325) {
                                var18 = field325;
                            }
                            if (var10.field2294 + var18 > field325 + field478.field2294) {
                                var18 = field325 + field478.field2294 - var10.field2294;
                            }
                            if (var19 < field484) {
                                var19 = field484;
                            }
                            if (var10.field2210 + var19 > field484 + field478.field2210) {
                                var19 = field484 + field478.field2210 - var10.field2210;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2298) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2241 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2241 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2294 + var13;
                        int var27 = var10.field2210 + var14;
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
                        int var30 = var10.field2294 + var13;
                        int var31 = var10.field2210 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2230 || var20 < var22 && var21 < var23) {
                        if (var10.field2326 != 0) {
                            if (var10.field2326 == 1336) {
                                if (field319) {
                                    var14 += 15;
                                    Statics.field283.method3713("Fps:" + field1790, var10.field2294 + var13, var14, 16776960, -1);
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
                                    Statics.field283.method3713("Mem:" + var33 + "k", var10.field2294 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2326 == 1337) {
                                field452 = var13;
                                field332 = var14;
                                method2864(var13, var14, var10.field2294, var10.field2210);
                                field509[var10.field2310] = true;
                                class220.method3773(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2326 == 1338) {
                                method1967(var10, var13, var14, var11);
                                class220.method3773(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2326 == 1339) {
                                class165 var35 = var10.method3077(false);
                                if (var35 != null) {
                                    if (field540 < 3) {
                                        Statics.field40.method3902(var13, var14, var35.field2175, var35.field2173, 25, 25, field387, 256, var35.field2174, var35.field2172);
                                    } else {
                                        class220.method3802(var13, var14, 0, var35.field2174, var35.field2172);
                                    }
                                }
                                class220.method3773(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2241 == 0) {
                            if (!var10.field2230 && method2913(var10) && Statics.field2086 != var10) {
                                continue;
                            }
                            if (!var10.field2230) {
                                if (var10.field2217 > var10.field2244 - var10.field2210) {
                                    var10.field2217 = var10.field2244 - var10.field2210;
                                }
                                if (var10.field2217 < 0) {
                                    var10.field2217 = 0;
                                }
                            }
                            method1582(arg0, var10.field2274, var20, var21, var22, var23, var13 - var10.field2332, var14 - var10.field2217, var11);
                            if (var10.field2344 != null) {
                                method1582(var10.field2344, var10.field2274, var20, var21, var22, var23, var13 - var10.field2332, var14 - var10.field2217, var11);
                            }
                            class18 var36 = (class18) field554.method2254((long) var10.field2274);
                            if (var36 != null) {
                                method886(var36.field190, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class220.method3773(arg2, arg3, arg4, arg5);
                            class85.method1584();
                        }
                        if (field390 || field511[var11] || field516 > 1) {
                            if (var10.field2241 == 0 && !var10.field2230 && var10.field2244 > var10.field2210) {
                                method160(var10.field2294 + var13, var14, var10.field2217, var10.field2210, var10.field2244);
                            }
                            if (var10.field2241 != 1) {
                                if (var10.field2241 == 2) {
                                    int var37 = 0;
                                    for (int var38 = 0; var38 < var10.field2232; var38++) {
                                        for (int var39 = 0; var39 < var10.field2231; var39++) {
                                            int var40 = (var10.field2286 + 32) * var39 + var13;
                                            int var41 = (var10.field2287 + 32) * var38 + var14;
                                            if (var37 < 20) {
                                                var40 += var10.field2341[var37];
                                                var41 += var10.field2289[var37];
                                            }
                                            if (var10.field2257[var37] > 0) {
                                                boolean var42 = false;
                                                boolean var43 = false;
                                                int var44 = var10.field2257[var37] - 1;
                                                if (var40 + 32 > arg2 && var40 < arg4 && var41 + 32 > arg3 && var41 < arg5 || Statics.field2178 == var10 && field557 == var37) {
                                                    class225 var45;
                                                    if (field456 == 1 && Statics.field958 == var37 && Statics.field2690 == var10.field2274) {
                                                        var45 = class199.method69(var44, var10.field2339[var37], 2, 0, 2, false);
                                                    } else {
                                                        var45 = class199.method69(var44, var10.field2339[var37], 1, 3153952, 2, false);
                                                    }
                                                    if (var45 == null) {
                                                        method198(var10);
                                                    } else if (Statics.field2178 == var10 && field557 == var37) {
                                                        int var46 = class116.field1818 - field339;
                                                        int var47 = class116.field1819 - field428;
                                                        if (var46 < 5 && var46 > -5) {
                                                            var46 = 0;
                                                        }
                                                        if (var47 < 5 && var47 > -5) {
                                                            var47 = 0;
                                                        }
                                                        if (field379 < 5) {
                                                            var46 = 0;
                                                            var47 = 0;
                                                        }
                                                        var45.method3897(var40 + var46, var41 + var47, 128);
                                                        if (arg1 != -1) {
                                                            class170 var48 = arg0[arg1 & 0xFFFF];
                                                            if (var41 + var47 < class220.field3192 && var48.field2217 > 0) {
                                                                int var49 = field512 * (class220.field3192 - var41 - var47) / 3;
                                                                if (var49 > field512 * 10) {
                                                                    var49 = field512 * 10;
                                                                }
                                                                if (var49 > var48.field2217) {
                                                                    var49 = var48.field2217;
                                                                }
                                                                var48.field2217 -= var49;
                                                                field428 += var49;
                                                                method198(var48);
                                                            }
                                                            if (var41 + var47 + 32 > class220.field3190 && var48.field2217 < var48.field2244 - var48.field2210) {
                                                                int var50 = field512 * (var41 + var47 + 32 - class220.field3190) / 3;
                                                                if (var50 > field512 * 10) {
                                                                    var50 = field512 * 10;
                                                                }
                                                                if (var50 > var48.field2244 - var48.field2210 - var48.field2217) {
                                                                    var50 = var48.field2244 - var48.field2210 - var48.field2217;
                                                                }
                                                                var48.field2217 += var50;
                                                                field428 -= var50;
                                                                method198(var48);
                                                            }
                                                        }
                                                    } else if (Statics.field43 == var10 && field453 == var37) {
                                                        var45.method3897(var40, var41, 128);
                                                    } else {
                                                        var45.method3891(var40, var41);
                                                    }
                                                }
                                            } else if (var10.field2290 != null && var37 < 20) {
                                                class225 var51 = var10.method3042(var37);
                                                if (var51 != null) {
                                                    var51.method3891(var40, var41);
                                                } else if (class170.field2214) {
                                                    method198(var10);
                                                }
                                            }
                                            var37++;
                                        }
                                    }
                                } else if (var10.field2241 == 3) {
                                    int var52;
                                    if (method2927(var10)) {
                                        var52 = var10.field2246;
                                        if (Statics.field2086 == var10 && var10.field2248 != 0) {
                                            var52 = var10.field2248;
                                        }
                                    } else {
                                        var52 = var10.field2245;
                                        if (Statics.field2086 == var10 && var10.field2281 != 0) {
                                            var52 = var10.field2281;
                                        }
                                    }
                                    if (var10.field2268) {
                                        switch(var10.field2250.field3206) {
                                            case 1:
                                                class220.method3780(var13, var14, var10.field2294, var10.field2210, var10.field2245, var10.field2246, 256 - (var10.field2251 & 0xFF), 256 - (var10.field2252 & 0xFF));
                                                break;
                                            case 2:
                                                class220.method3781(var13, var14, var10.field2294, var10.field2210, var10.field2245, var10.field2246, 256 - (var10.field2251 & 0xFF), 256 - (var10.field2252 & 0xFF));
                                                break;
                                            case 3:
                                                class220.method3782(var13, var14, var10.field2294, var10.field2210, var10.field2245, var10.field2246, 256 - (var10.field2251 & 0xFF), 256 - (var10.field2252 & 0xFF));
                                                break;
                                            case 4:
                                                class220.method3787(var13, var14, var10.field2294, var10.field2210, var10.field2245, var10.field2246, 256 - (var10.field2251 & 0xFF), 256 - (var10.field2252 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class220.method3779(var13, var14, var10.field2294, var10.field2210, var52);
                                                } else {
                                                    class220.method3778(var13, var14, var10.field2294, var10.field2210, var52, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class220.method3785(var13, var14, var10.field2294, var10.field2210, var52);
                                    } else {
                                        class220.method3786(var13, var14, var10.field2294, var10.field2210, var52, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2241 == 4) {
                                    class209 var53 = var10.method3046();
                                    if (var53 != null) {
                                        String var54 = var10.field2280;
                                        int var55;
                                        if (method2927(var10)) {
                                            var55 = var10.field2246;
                                            if (Statics.field2086 == var10 && var10.field2248 != 0) {
                                                var55 = var10.field2248;
                                            }
                                            if (var10.field2242.length() > 0) {
                                                var54 = var10.field2242;
                                            }
                                        } else {
                                            var55 = var10.field2245;
                                            if (Statics.field2086 == var10 && var10.field2281 != 0) {
                                                var55 = var10.field2281;
                                            }
                                        }
                                        if (var10.field2230 && var10.field2340 != -1) {
                                            class199 var56 = class199.method3402(var10.field2340);
                                            var54 = var56.field2954;
                                            if (var54 == null) {
                                                var54 = "null";
                                            }
                                            if ((var56.field2958 == 1 || var10.field2222 != 1) && var10.field2222 != -1) {
                                                var54 = class38.method154(16748608) + var54 + class38.field809 + " " + 'x' + method1838(var10.field2222);
                                            }
                                        }
                                        if (field468 == var10) {
                                            class174 var10000 = (class174) null;
                                            var54 = class174.field2531;
                                            var55 = var10.field2245;
                                        }
                                        if (!var10.field2230) {
                                            var54 = method8(var54, var10);
                                        }
                                        var53.method3680(var54, var13, var14, var10.field2294, var10.field2210, var55, var10.field2299 ? 0 : -1, var10.field2220, var10.field2284, var10.field2213);
                                    } else if (class170.field2214) {
                                        method198(var10);
                                    }
                                } else if (var10.field2241 == 5) {
                                    if (var10.field2230) {
                                        class225 var58;
                                        if (var10.field2340 == -1) {
                                            var58 = var10.method3045(false);
                                        } else {
                                            var58 = class199.method69(var10.field2340, var10.field2222, var10.field2259, var10.field2260, var10.field2278, false);
                                        }
                                        if (var58 != null) {
                                            int var59 = var58.field3224;
                                            int var60 = var58.field3221;
                                            if (var10.field2258) {
                                                class220.method3774(var13, var14, var10.field2294 + var13, var10.field2210 + var14);
                                                int var61 = (var10.field2294 + (var59 - 1)) / var59;
                                                int var62 = (var10.field2210 + (var60 - 1)) / var60;
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    for (int var64 = 0; var64 < var62; var64++) {
                                                        if (var10.field2295 != 0) {
                                                            var58.method3904(var59 / 2 + var59 * var63 + var13, var60 / 2 + var60 * var64 + var14, var10.field2295, 4096);
                                                        } else if (var15 == 0) {
                                                            var58.method3891(var59 * var63 + var13, var60 * var64 + var14);
                                                        } else {
                                                            var58.method3897(var59 * var63 + var13, var60 * var64 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class220.method3773(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var65 = var10.field2294 * 4096 / var59;
                                                if (var10.field2295 != 0) {
                                                    var58.method3904(var10.field2294 / 2 + var13, var10.field2210 / 2 + var14, var10.field2295, var65);
                                                } else if (var15 != 0) {
                                                    var58.method3899(var13, var14, var10.field2294, var10.field2210, 256 - (var15 & 0xFF));
                                                } else if (var10.field2294 == var59 && var10.field2210 == var60) {
                                                    var58.method3891(var13, var14);
                                                } else {
                                                    var58.method3927(var13, var14, var10.field2294, var10.field2210);
                                                }
                                            }
                                        } else if (class170.field2214) {
                                            method198(var10);
                                        }
                                    } else {
                                        class225 var57 = var10.method3045(method2927(var10));
                                        if (var57 != null) {
                                            var57.method3891(var13, var14);
                                        } else if (class170.field2214) {
                                            method198(var10);
                                        }
                                    }
                                } else if (var10.field2241 == 6) {
                                    boolean var66 = method2927(var10);
                                    int var67;
                                    if (var66) {
                                        var67 = var10.field2277;
                                    } else {
                                        var67 = var10.field2267;
                                    }
                                    class83 var68 = null;
                                    int var69 = 0;
                                    if (var10.field2340 != -1) {
                                        class199 var70 = class199.method3402(var10.field2340);
                                        if (var70 != null) {
                                            class199 var71 = var70.method3459(var10.field2222);
                                            var68 = var71.method3458(1);
                                            if (var68 == null) {
                                                method198(var10);
                                            } else {
                                                var68.method1556();
                                                var69 = var68.field1564 / 2;
                                            }
                                        }
                                    } else if (var10.field2243 == 5) {
                                        if (var10.field2264 == 0) {
                                            var68 = field510.method2995((class202) null, -1, (class202) null, -1);
                                        } else {
                                            var68 = Statics.field899.method209();
                                        }
                                    } else if (var67 == -1) {
                                        var68 = var10.method3068((class202) null, -1, var66, Statics.field899.field257);
                                        if (var68 == null && class170.field2214) {
                                            method198(var10);
                                        }
                                    } else {
                                        class202 var72 = class202.method164(var67);
                                        var68 = var10.method3068(var72, var10.field2345, var66, Statics.field899.field257);
                                        if (var68 == null && class170.field2214) {
                                            method198(var10);
                                        }
                                    }
                                    class85.method1587(var10.field2294 / 2 + var13, var10.field2210 / 2 + var14);
                                    int var73 = var10.field2321 * class85.field1476[var10.field2271] >> 16;
                                    int var74 = var10.field2321 * class85.field1470[var10.field2271] >> 16;
                                    if (var68 != null) {
                                        if (var10.field2230) {
                                            var68.method1556();
                                            if (var10.field2297) {
                                                var68.method1513(0, var10.field2272, var10.field2273, var10.field2271, var10.field2269, var10.field2270 + var69 + var73, var10.field2270 + var74, var10.field2321);
                                            } else {
                                                var68.method1512(0, var10.field2272, var10.field2273, var10.field2271, var10.field2269, var10.field2270 + var69 + var73, var10.field2270 + var74);
                                            }
                                        } else {
                                            var68.method1512(0, var10.field2272, 0, var10.field2271, 0, var73, var74);
                                        }
                                    }
                                    class85.method1586();
                                } else {
                                    if (var10.field2241 == 7) {
                                        class209 var75 = var10.method3046();
                                        if (var75 == null) {
                                            if (class170.field2214) {
                                                method198(var10);
                                            }
                                            continue;
                                        }
                                        int var76 = 0;
                                        for (int var77 = 0; var77 < var10.field2232; var77++) {
                                            for (int var78 = 0; var78 < var10.field2231; var78++) {
                                                if (var10.field2257[var76] > 0) {
                                                    class199 var79 = class199.method3402(var10.field2257[var76] - 1);
                                                    String var80;
                                                    if (var79.field2958 != 1 && var10.field2339[var76] == 1) {
                                                        var80 = class38.method154(16748608) + var79.field2954 + class38.field809;
                                                    } else {
                                                        var80 = class38.method154(16748608) + var79.field2954 + class38.field809 + " " + 'x' + method1838(var10.field2339[var76]);
                                                    }
                                                    int var81 = (var10.field2286 + 115) * var78 + var13;
                                                    int var82 = (var10.field2287 + 12) * var77 + var14;
                                                    if (var10.field2220 == 0) {
                                                        var75.method3702(var80, var81, var82, var10.field2245, var10.field2299 ? 0 : -1);
                                                    } else if (var10.field2220 == 1) {
                                                        var75.method3735(var80, var10.field2294 / 2 + var81, var82, var10.field2245, var10.field2299 ? 0 : -1);
                                                    } else {
                                                        var75.method3713(var80, var10.field2294 + var81 - 1, var82, var10.field2245, var10.field2299 ? 0 : -1);
                                                    }
                                                }
                                                var76++;
                                            }
                                        }
                                    }
                                    if (var10.field2241 == 8 && Statics.field191 == var10 && field454 == field370) {
                                        int var83 = 0;
                                        int var84 = 0;
                                        class209 var85 = Statics.field283;
                                        String var86 = var10.field2280;
                                        String var87 = method8(var86, var10);
                                        while (var87.length() > 0) {
                                            int var88 = var87.indexOf(class38.field808);
                                            String var89;
                                            if (var88 == -1) {
                                                var89 = var87;
                                                var87 = "";
                                            } else {
                                                var89 = var87.substring(0, var88);
                                                var87 = var87.substring(var88 + 4);
                                            }
                                            int var90 = var85.method3672(var89);
                                            if (var90 > var83) {
                                                var83 = var90;
                                            }
                                            var84 += var85.field3118 + 1;
                                        }
                                        var83 += 6;
                                        var84 += 7;
                                        int var91 = var10.field2294 + var13 - 5 - var83;
                                        int var92 = var10.field2210 + var14 + 5;
                                        if (var91 < var13 + 5) {
                                            var91 = var13 + 5;
                                        }
                                        if (var83 + var91 > arg4) {
                                            var91 = arg4 - var83;
                                        }
                                        if (var84 + var92 > arg5) {
                                            var92 = arg5 - var84;
                                        }
                                        class220.method3779(var91, var92, var83, var84, 16777120);
                                        class220.method3785(var91, var92, var83, var84, 0);
                                        String var93 = var10.field2280;
                                        int var94 = var85.field3118 + var92 + 2;
                                        String var95 = method8(var93, var10);
                                        while (var95.length() > 0) {
                                            int var96 = var95.indexOf(class38.field808);
                                            String var97;
                                            if (var96 == -1) {
                                                var97 = var95;
                                                var95 = "";
                                            } else {
                                                var97 = var95.substring(0, var96);
                                                var95 = var95.substring(var96 + 4);
                                            }
                                            var85.method3702(var97, var91 + 3, var94, 0, -1);
                                            var94 += var85.field3118 + 1;
                                        }
                                    }
                                    if (var10.field2241 == 9) {
                                        if (var10.field2219 == 1) {
                                            int var98;
                                            int var99;
                                            int var100;
                                            int var101;
                                            if (var10.field2254) {
                                                var98 = var13;
                                                var99 = var10.field2210 + var14;
                                                var100 = var10.field2294 + var13;
                                                var101 = var14;
                                            } else {
                                                var98 = var13;
                                                var99 = var14;
                                                var100 = var10.field2294 + var13;
                                                var101 = var10.field2210 + var14;
                                            }
                                            class220.method3791(var98, var99, var100, var101, var10.field2245);
                                        } else {
                                            int var102 = var10.field2294 >= 0 ? var10.field2294 : -var10.field2294;
                                            int var103 = var10.field2210 >= 0 ? var10.field2210 : -var10.field2210;
                                            int var104 = var102;
                                            if (var102 < var103) {
                                                var104 = var103;
                                            }
                                            if (var104 != 0) {
                                                int var105 = (var10.field2294 << 16) / var104;
                                                int var106 = (var10.field2210 << 16) / var104;
                                                if (var106 <= var105) {
                                                    var105 = -var105;
                                                } else {
                                                    var106 = -var106;
                                                }
                                                int var107 = var10.field2219 * var106 >> 17;
                                                int var108 = var10.field2219 * var106 + 1 >> 17;
                                                int var109 = var10.field2219 * var105 >> 17;
                                                int var110 = var10.field2219 * var105 + 1 >> 17;
                                                int var111 = var13 + var107;
                                                int var112 = var13 - var108;
                                                int var113 = var10.field2294 + var13 - var108;
                                                int var114 = var10.field2294 + var13 + var107;
                                                int var115 = var14 + var109;
                                                int var116 = var14 - var110;
                                                int var117 = var10.field2210 + var14 - var110;
                                                int var118 = var10.field2210 + var14 + var109;
                                                class85.method1592(var111, var112, var113);
                                                class85.method1595(var115, var116, var117, var111, var112, var113, var10.field2245);
                                                class85.method1592(var111, var113, var114);
                                                class85.method1595(var115, var117, var118, var111, var113, var114, var10.field2245);
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

    @ObfuscatedName("i.ci(Ljava/lang/String;Lfr;I)Ljava/lang/String;")
    public static String method8(String arg0, class170 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method735(arg1, var2 - 1);
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
                if (Statics.field796 != null) {
                    var8 = class208.method3096(Statics.field796.field1689);
                    if (Statics.field796.field1691 != null) {
                        var8 = (String) Statics.field796.field1691;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("ca.cp(II)Ljava/lang/String;")
    public static final String method1838(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class38.field803 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class38.method154(65408) + var1.substring(0, var1.length() - 8) + class174.field2534 + " " + class38.field812 + var1 + class38.field807 + class38.field809;
        } else if (var1.length() > 6) {
            return " " + class38.method154(16777215) + var1.substring(0, var1.length() - 4) + class174.field2536 + " " + class38.field812 + var1 + class38.field807 + class38.field809;
        } else {
            return " " + class38.method154(16776960) + var1 + class38.field809;
        }
    }

    @ObfuscatedName("r.ch(Lfr;I)V")
    public static void method55(class170 arg0) {
        class170 var1 = arg0.field2239 == -1 ? null : Statics.method1837(arg0.field2239);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field756;
            var3 = Statics.field2208;
        } else {
            var2 = var1.field2294;
            var3 = var1.field2210;
        }
        method144(arg0, var2, var3, false);
        method171(arg0, var2, var3);
    }

    @ObfuscatedName("be.cc([Lfr;IIIZI)V")
    public static void method1159(class170[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class170 var6 = arg0[var5];
            if (var6 != null && var6.field2239 == arg1) {
                method144(var6, arg2, arg3, arg4);
                method171(var6, arg2, arg3);
                if (var6.field2332 > var6.field2328 - var6.field2294) {
                    var6.field2332 = var6.field2328 - var6.field2294;
                }
                if (var6.field2332 < 0) {
                    var6.field2332 = 0;
                }
                if (var6.field2217 > var6.field2244 - var6.field2210) {
                    var6.field2217 = var6.field2244 - var6.field2210;
                }
                if (var6.field2217 < 0) {
                    var6.field2217 = 0;
                }
                if (var6.field2241 == 0) {
                    Statics.method17(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("s.cq(Lfr;IIZI)V")
    public static void method144(class170 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2294;
        int var5 = arg0.field2210;
        if (arg0.field2227 == 0) {
            arg0.field2294 = arg0.field2231;
        } else if (arg0.field2227 == 1) {
            arg0.field2294 = arg1 - arg0.field2231;
        } else if (arg0.field2227 == 2) {
            arg0.field2294 = arg0.field2231 * arg1 >> 14;
        }
        if (arg0.field2228 == 0) {
            arg0.field2210 = arg0.field2232;
        } else if (arg0.field2228 == 1) {
            arg0.field2210 = arg2 - arg0.field2232;
        } else if (arg0.field2228 == 2) {
            arg0.field2210 = arg0.field2232 * arg2 >> 14;
        }
        if (arg0.field2227 == 4) {
            arg0.field2294 = arg0.field2237 * arg0.field2210 / arg0.field2279;
        }
        if (arg0.field2228 == 4) {
            arg0.field2210 = arg0.field2294 * arg0.field2279 / arg0.field2237;
        }
        if (field474 && arg0.field2241 == 0) {
            if (arg0.field2210 < 5 && arg0.field2294 < 5) {
                arg0.field2210 = 5;
                arg0.field2294 = 5;
            } else {
                if (arg0.field2210 <= 0) {
                    arg0.field2210 = 5;
                }
                if (arg0.field2294 <= 0) {
                    arg0.field2294 = 5;
                }
            }
        }
        if (arg0.field2326 == 1337) {
            field476 = arg0;
        }
        if (arg3 && arg0.field2342 != null && (arg0.field2294 != var4 || arg0.field2210 != var5)) {
            class19 var6 = new class19();
            var6.field208 = arg0;
            var6.field200 = arg0.field2342;
            field503.method2296(var6);
        }
    }

    @ObfuscatedName("a.cm(Lfr;III)V")
    public static void method171(class170 arg0, int arg1, int arg2) {
        if (arg0.field2352 == 0) {
            arg0.field2233 = arg0.field2229;
        } else if (arg0.field2352 == 1) {
            arg0.field2233 = (arg1 - arg0.field2294) / 2 + arg0.field2229;
        } else if (arg0.field2352 == 2) {
            arg0.field2233 = arg1 - arg0.field2294 - arg0.field2229;
        } else if (arg0.field2352 == 3) {
            arg0.field2233 = arg0.field2229 * arg1 >> 14;
        } else if (arg0.field2352 == 4) {
            arg0.field2233 = (arg0.field2229 * arg1 >> 14) + (arg1 - arg0.field2294) / 2;
        } else {
            arg0.field2233 = arg1 - arg0.field2294 - (arg0.field2229 * arg1 >> 14);
        }
        if (arg0.field2218 == 0) {
            arg0.field2234 = arg0.field2238;
        } else if (arg0.field2218 == 1) {
            arg0.field2234 = (arg2 - arg0.field2210) / 2 + arg0.field2238;
        } else if (arg0.field2218 == 2) {
            arg0.field2234 = arg2 - arg0.field2210 - arg0.field2238;
        } else if (arg0.field2218 == 3) {
            arg0.field2234 = arg0.field2238 * arg2 >> 14;
        } else if (arg0.field2218 == 4) {
            arg0.field2234 = (arg0.field2238 * arg2 >> 14) + (arg2 - arg0.field2210) / 2;
        } else {
            arg0.field2234 = arg2 - arg0.field2210 - (arg0.field2238 * arg2 >> 14);
        }
        if (!field474 || arg0.field2241 != 0) {
            return;
        }
        if (arg0.field2233 < 0) {
            arg0.field2233 = 0;
        } else if (arg0.field2294 + arg0.field2233 > arg1) {
            arg0.field2233 = arg1 - arg0.field2294;
        }
        if (arg0.field2234 < 0) {
            arg0.field2234 = 0;
        } else if (arg0.field2234 + arg0.field2210 > arg2) {
            arg0.field2234 = arg2 - arg0.field2210;
        }
    }

    @ObfuscatedName("d.ct(IIIIII)V")
    public static final void method160(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1373[0].method3846(arg0, arg1);
        Statics.field1373[1].method3846(arg0, arg1 + arg3 - 16);
        class220.method3779(arg0, arg1 + 16, 16, arg3 - 32, field380);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class220.method3779(arg0, arg1 + 16 + var6, 16, var5, field330);
        class220.method3789(arg0, arg1 + 16 + var6, var5, field383);
        class220.method3789(arg0 + 1, arg1 + 16 + var6, var5, field383);
        class220.method3799(arg0, arg1 + 16 + var6, 16, field383);
        class220.method3799(arg0, arg1 + 17 + var6, 16, field383);
        class220.method3789(arg0 + 15, arg1 + 16 + var6, var5, field382);
        class220.method3789(arg0 + 14, arg1 + 17 + var6, var5 - 1, field382);
        class220.method3799(arg0, arg1 + 15 + var6 + var5, 16, field382);
        class220.method3799(arg0 + 1, arg1 + 14 + var6 + var5, 15, field382);
    }

    @ObfuscatedName("ff.cb(Lfr;B)Z")
    public static final boolean method2927(class170 arg0) {
        if (arg0.field2225 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2225.length; var1++) {
            int var2 = method735(arg0, var1);
            int var3 = arg0.field2334[var1];
            if (arg0.field2225[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2225[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2225[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ak.cz(Lfr;II)I")
    public static final int method735(class170 arg0, int arg1) {
        if (arg0.field2282 == null || arg1 >= arg0.field2282.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2282[arg1];
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
                    var7 = field354[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field439[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class170 var11 = Statics.method1837(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class199.method3402(var12).field2972 || field306)) {
                        for (int var13 = 0; var13 < var11.field2257.length; var13++) {
                            if (var12 + 1 == var11.field2257[var13]) {
                                var7 += var11.field2339[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class166.field2181[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class173.field2370[field354[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class166.field2181[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field899.field261;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class173.field2372[var14]) {
                            var7 += field354[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class170 var17 = Statics.method1837(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class199.method3402(var18).field2972 || field306)) {
                        for (int var19 = 0; var19 < var17.field2257.length; var19++) {
                            if (var18 + 1 == var17.field2257[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field469;
                }
                if (var6 == 12) {
                    var7 = field470;
                }
                if (var6 == 13) {
                    int var20 = class166.field2181[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class166.method561(var22);
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
                    var7 = (Statics.field899.field625 >> 7) + Statics.field1880;
                }
                if (var6 == 19) {
                    var7 = (Statics.field899.field620 >> 7) + Statics.field2792;
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

    @ObfuscatedName("e.cu([Lfr;IIIIIIII)V")
    public static final void method559(class170[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class170 var9 = arg0[var8];
            if (var9 != null && (!var9.field2230 || var9.field2241 == 0 || var9.field2300 || method3309(var9) != 0 || field478 == var9 || var9.field2326 == 1338) && var9.field2239 == arg1 && (!var9.field2230 || !method2913(var9))) {
                int var10 = var9.field2233 + arg6;
                int var11 = var9.field2234 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2241 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2241 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2294 + var10;
                    int var19 = var9.field2210 + var11;
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
                    int var22 = var9.field2294 + var10;
                    int var23 = var9.field2210 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field477 == var9) {
                    field485 = true;
                    field455 = var10;
                    field492 = var11;
                }
                if (!var9.field2230 || var12 < var14 && var13 < var15) {
                    int var24 = class116.field1818;
                    int var25 = class116.field1819;
                    if (class116.field1824 != 0) {
                        var24 = class116.field1826;
                        var25 = class116.field1814;
                    }
                    if (var9.field2326 == 1337) {
                        if (!field579 && !field441 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method2569(var24, var25, var12, var13);
                        }
                    } else if (var9.field2326 == 1338) {
                        method10(var9, var10, var11);
                    } else {
                        if (!field441 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var26 = var24 - var10;
                            int var27 = var25 - var11;
                            if (var9.field2223 == 1) {
                                method2196(var9.field2353, "", 24, 0, 0, var9.field2274);
                            }
                            if (var9.field2223 == 2 && !field459) {
                                int var28 = method3309(var9);
                                int var29 = var28 >> 11 & 0x3F;
                                String var30;
                                if (var29 == 0) {
                                    var30 = null;
                                } else if (var9.field2329 == null || var9.field2329.trim().length() == 0) {
                                    var30 = null;
                                } else {
                                    var30 = var9.field2329;
                                }
                                if (var30 != null) {
                                    method2196(var30, class38.method154(65280) + var9.field2336, 25, 0, -1, var9.field2274);
                                }
                            }
                            if (var9.field2223 == 3) {
                                method2196(class174.field2532, "", 26, 0, 0, var9.field2274);
                            }
                            if (var9.field2223 == 4) {
                                method2196(var9.field2353, "", 28, 0, 0, var9.field2274);
                            }
                            if (var9.field2223 == 5) {
                                method2196(var9.field2353, "", 29, 0, 0, var9.field2274);
                            }
                            if (var9.field2223 == 6 && field468 == null) {
                                method2196(var9.field2353, "", 30, 0, -1, var9.field2274);
                            }
                            if (var9.field2241 == 2) {
                                int var32 = 0;
                                for (int var33 = 0; var33 < var9.field2210; var33++) {
                                    for (int var34 = 0; var34 < var9.field2294; var34++) {
                                        int var35 = (var9.field2286 + 32) * var34;
                                        int var36 = (var9.field2287 + 32) * var33;
                                        if (var32 < 20) {
                                            var35 += var9.field2341[var32];
                                            var36 += var9.field2289[var32];
                                        }
                                        if (var26 >= var35 && var27 >= var36 && var26 < var35 + 32 && var27 < var36 + 32) {
                                            field419 = var32;
                                            Statics.field2161 = var9;
                                            if (var9.field2257[var32] > 0) {
                                                label1108: {
                                                    class199 var37 = class199.method3402(var9.field2257[var32] - 1);
                                                    if (field456 == 1) {
                                                        int var38 = method3309(var9);
                                                        boolean var39 = (var38 >> 30 & 0x1) != 0;
                                                        if (var39) {
                                                            if (Statics.field2690 != var9.field2274 || Statics.field958 != var32) {
                                                                method2196(class174.field2519, field458 + " " + class38.field802 + " " + class38.method154(16748608) + var37.field2954, 31, var37.field2974, var32, var9.field2274);
                                                            }
                                                            break label1108;
                                                        }
                                                    }
                                                    if (field459) {
                                                        int var40 = method3309(var9);
                                                        boolean var41 = (var40 >> 30 & 0x1) != 0;
                                                        if (var41) {
                                                            if ((Statics.field3005 & 0x10) == 16) {
                                                                method2196(field327, field528 + " " + class38.field802 + " " + class38.method154(16748608) + var37.field2954, 32, var37.field2974, var32, var9.field2274);
                                                            }
                                                            break label1108;
                                                        }
                                                    }
                                                    String[] var42 = var37.field2970;
                                                    if (field475) {
                                                        var42 = method656(var42);
                                                    }
                                                    int var43 = var37.method3463();
                                                    int var44 = method3309(var9);
                                                    boolean var45 = (var44 >> 30 & 0x1) != 0;
                                                    if (var45) {
                                                        for (int var46 = 4; var46 >= 3; var46--) {
                                                            boolean var47 = var43 == var46;
                                                            if (var42 != null && var42[var46] != null) {
                                                                byte var48;
                                                                if (var46 == 3) {
                                                                    var48 = 36;
                                                                } else {
                                                                    var48 = 37;
                                                                }
                                                                method3038(var42[var46], class38.method154(16748608) + var37.field2954, var48, var37.field2974, var32, var9.field2274, var47);
                                                            } else if (var46 == 4) {
                                                                method3038(class174.field2433, class38.method154(16748608) + var37.field2954, 37, var37.field2974, var32, var9.field2274, var47);
                                                            }
                                                        }
                                                    }
                                                    int var49 = method3309(var9);
                                                    boolean var50 = (var49 >> 31 & 0x1) != 0;
                                                    if (var50) {
                                                        method2196(class174.field2519, class38.method154(16748608) + var37.field2954, 38, var37.field2974, var32, var9.field2274);
                                                    }
                                                    int var51 = method3309(var9);
                                                    boolean var52 = (var51 >> 30 & 0x1) != 0;
                                                    if (var52 && var42 != null) {
                                                        for (int var53 = 2; var53 >= 0; var53--) {
                                                            boolean var54 = var43 == var53;
                                                            if (var42[var53] != null) {
                                                                byte var55 = 0;
                                                                if (var53 == 0) {
                                                                    var55 = 33;
                                                                }
                                                                if (var53 == 1) {
                                                                    var55 = 34;
                                                                }
                                                                if (var53 == 2) {
                                                                    var55 = 35;
                                                                }
                                                                method3038(var42[var53], class38.method154(16748608) + var37.field2954, var55, var37.field2974, var32, var9.field2274, var54);
                                                            }
                                                        }
                                                    }
                                                    String[] var56 = var9.field2337;
                                                    if (field475) {
                                                        var56 = method656(var56);
                                                    }
                                                    if (var56 != null) {
                                                        for (int var57 = 4; var57 >= 0; var57--) {
                                                            if (var56[var57] != null) {
                                                                byte var58 = 0;
                                                                if (var57 == 0) {
                                                                    var58 = 39;
                                                                }
                                                                if (var57 == 1) {
                                                                    var58 = 40;
                                                                }
                                                                if (var57 == 2) {
                                                                    var58 = 41;
                                                                }
                                                                if (var57 == 3) {
                                                                    var58 = 42;
                                                                }
                                                                if (var57 == 4) {
                                                                    var58 = 43;
                                                                }
                                                                method2196(var56[var57], class38.method154(16748608) + var37.field2954, var58, var37.field2974, var32, var9.field2274);
                                                            }
                                                        }
                                                    }
                                                    method2196(class174.field2524, class38.method154(16748608) + var37.field2954, 1005, var37.field2974, var32, var9.field2274);
                                                }
                                            }
                                        }
                                        var32++;
                                    }
                                }
                            }
                            if (var9.field2230) {
                                if (field459) {
                                    int var59 = method3309(var9);
                                    boolean var60 = (var59 >> 21 & 0x1) != 0;
                                    if (var60 && (Statics.field3005 & 0x20) == 32) {
                                        method2196(field327, field528 + " " + class38.field802 + " " + var9.field2293, 58, 0, var9.field2221, var9.field2274);
                                    }
                                } else {
                                    for (int var61 = 9; var61 >= 5; var61--) {
                                        String var62;
                                        if (!class171.method2648(method3309(var9), var61) && var9.field2320 == null) {
                                            var62 = null;
                                        } else if (var9.field2247 == null || var9.field2247.length <= var61 || var9.field2247[var61] == null || var9.field2247[var61].trim().length() == 0) {
                                            var62 = null;
                                        } else {
                                            var62 = var9.field2247[var61];
                                        }
                                        if (var62 != null) {
                                            method2196(var62, var9.field2293, 1007, var61 + 1, var9.field2221, var9.field2274);
                                        }
                                    }
                                    int var64 = method3309(var9);
                                    int var65 = var64 >> 11 & 0x3F;
                                    String var66;
                                    if (var65 == 0) {
                                        var66 = null;
                                    } else if (var9.field2329 == null || var9.field2329.trim().length() == 0) {
                                        var66 = null;
                                    } else {
                                        var66 = var9.field2329;
                                    }
                                    if (var66 != null) {
                                        method2196(var66, var9.field2293, 25, 0, var9.field2221, var9.field2274);
                                    }
                                    for (int var68 = 4; var68 >= 0; var68--) {
                                        String var69;
                                        if (!class171.method2648(method3309(var9), var68) && var9.field2320 == null) {
                                            var69 = null;
                                        } else if (var9.field2247 == null || var9.field2247.length <= var68 || var9.field2247[var68] == null || var9.field2247[var68].trim().length() == 0) {
                                            var69 = null;
                                        } else {
                                            var69 = var9.field2247[var68];
                                        }
                                        if (var69 != null) {
                                            method2196(var69, var9.field2293, 57, var68 + 1, var9.field2221, var9.field2274);
                                        }
                                    }
                                    int var71 = method3309(var9);
                                    boolean var72 = (var71 & 0x1) != 0;
                                    if (var72) {
                                        method2196(class174.field2545, "", 30, 0, var9.field2221, var9.field2274);
                                    }
                                }
                            }
                        }
                        if (var9.field2241 == 0) {
                            if (!var9.field2230 && method2913(var9) && Statics.field2086 != var9) {
                                continue;
                            }
                            method559(arg0, var9.field2274, var12, var13, var14, var15, var10 - var9.field2332, var11 - var9.field2217);
                            if (var9.field2344 != null) {
                                method559(var9.field2344, var9.field2274, var12, var13, var14, var15, var10 - var9.field2332, var11 - var9.field2217);
                            }
                            class18 var73 = (class18) field554.method2254((long) var9.field2274);
                            if (var73 != null) {
                                if (var73.field188 == 0 && class116.field1818 >= var12 && class116.field1819 >= var13 && class116.field1818 < var14 && class116.field1819 < var15 && !field441 && !field474) {
                                    for (class19 var74 = (class19) field503.method2301(); var74 != null; var74 = (class19) field503.method2309()) {
                                        if (var74.field198) {
                                            var74.method2289();
                                            var74.field208.field2253 = false;
                                        }
                                    }
                                    if (Statics.field913 == 0) {
                                        field477 = null;
                                        field478 = null;
                                    }
                                    if (!field441) {
                                        method749();
                                        field577[0] = class174.field2612;
                                        field448[0] = "";
                                        field524[0] = 1006;
                                        field442 = 1;
                                    }
                                }
                                int var75 = var73.field190;
                                if (class170.method179(var75)) {
                                    method559(Statics.field2240[var75], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2230) {
                            if (var9.field2211) {
                                if (class116.field1818 >= var12 && class116.field1819 >= var13 && class116.field1818 < var14 && class116.field1819 < var15) {
                                    for (class19 var76 = (class19) field503.method2301(); var76 != null; var76 = (class19) field503.method2309()) {
                                        if (var76.field198) {
                                            var76.method2289();
                                            var76.field208.field2253 = false;
                                        }
                                    }
                                    if (Statics.field913 == 0) {
                                        field477 = null;
                                        field478 = null;
                                    }
                                    if (!field441) {
                                        field577[0] = class174.field2612;
                                        field448[0] = "";
                                        field524[0] = 1006;
                                        field442 = 1;
                                    }
                                }
                            } else if (var9.field2354 && class116.field1818 >= var12 && class116.field1819 >= var13 && class116.field1818 < var14 && class116.field1819 < var15) {
                                for (class19 var77 = (class19) field503.method2301(); var77 != null; var77 = (class19) field503.method2309()) {
                                    if (var77.field198 && var77.field208.field2263 == var77.field200) {
                                        var77.method2289();
                                    }
                                }
                            }
                            boolean var78;
                            if (class116.field1818 >= var12 && class116.field1819 >= var13 && class116.field1818 < var14 && class116.field1819 < var15) {
                                var78 = true;
                            } else {
                                var78 = false;
                            }
                            boolean var79 = false;
                            if ((class116.field1812 == 1 || !Statics.field2688 && class116.field1812 == 4) && var78) {
                                var79 = true;
                            }
                            boolean var80 = false;
                            if ((class116.field1824 == 1 || !Statics.field2688 && class116.field1824 == 4) && class116.field1826 >= var12 && class116.field1814 >= var13 && class116.field1826 < var14 && class116.field1814 < var15) {
                                var80 = true;
                            }
                            if (var80) {
                                method188(var9, class116.field1826 - var10, class116.field1814 - var11);
                            }
                            if (field477 != null && field477 != var9 && var78 && class171.method3036(method3309(var9))) {
                                field481 = var9;
                            }
                            if (field478 == var9) {
                                field482 = true;
                                field325 = var10;
                                field484 = var11;
                            }
                            if (var9.field2300) {
                                if (var78 && field539 != 0 && var9.field2263 != null) {
                                    class19 var81 = new class19();
                                    var81.field198 = true;
                                    var81.field208 = var9;
                                    var81.field202 = field539;
                                    var81.field200 = var9.field2263;
                                    field503.method2296(var81);
                                }
                                if (field477 != null || Statics.field2178 != null || field441) {
                                    var80 = false;
                                    var79 = false;
                                    var78 = false;
                                }
                                if (!var9.field2346 && var80) {
                                    var9.field2346 = true;
                                    if (var9.field2338 != null) {
                                        class19 var82 = new class19();
                                        var82.field198 = true;
                                        var82.field208 = var9;
                                        var82.field199 = class116.field1826 - var10;
                                        var82.field202 = class116.field1814 - var11;
                                        var82.field200 = var9.field2338;
                                        field503.method2296(var82);
                                    }
                                }
                                if (var9.field2346 && var79 && var9.field2288 != null) {
                                    class19 var83 = new class19();
                                    var83.field198 = true;
                                    var83.field208 = var9;
                                    var83.field199 = class116.field1818 - var10;
                                    var83.field202 = class116.field1819 - var11;
                                    var83.field200 = var9.field2288;
                                    field503.method2296(var83);
                                }
                                if (var9.field2346 && !var79) {
                                    var9.field2346 = false;
                                    if (var9.field2304 != null) {
                                        class19 var84 = new class19();
                                        var84.field198 = true;
                                        var84.field208 = var9;
                                        var84.field199 = class116.field1818 - var10;
                                        var84.field202 = class116.field1819 - var11;
                                        var84.field200 = var9.field2304;
                                        field505.method2296(var84);
                                    }
                                }
                                if (var79 && var9.field2305 != null) {
                                    class19 var85 = new class19();
                                    var85.field198 = true;
                                    var85.field208 = var9;
                                    var85.field199 = class116.field1818 - var10;
                                    var85.field202 = class116.field1819 - var11;
                                    var85.field200 = var9.field2305;
                                    field503.method2296(var85);
                                }
                                if (!var9.field2253 && var78) {
                                    var9.field2253 = true;
                                    if (var9.field2301 != null) {
                                        class19 var86 = new class19();
                                        var86.field198 = true;
                                        var86.field208 = var9;
                                        var86.field199 = class116.field1818 - var10;
                                        var86.field202 = class116.field1819 - var11;
                                        var86.field200 = var9.field2301;
                                        field503.method2296(var86);
                                    }
                                }
                                if (var9.field2253 && var78 && var9.field2307 != null) {
                                    class19 var87 = new class19();
                                    var87.field198 = true;
                                    var87.field208 = var9;
                                    var87.field199 = class116.field1818 - var10;
                                    var87.field202 = class116.field1819 - var11;
                                    var87.field200 = var9.field2307;
                                    field503.method2296(var87);
                                }
                                if (var9.field2253 && !var78) {
                                    var9.field2253 = false;
                                    if (var9.field2249 != null) {
                                        class19 var88 = new class19();
                                        var88.field198 = true;
                                        var88.field208 = var9;
                                        var88.field199 = class116.field1818 - var10;
                                        var88.field202 = class116.field1819 - var11;
                                        var88.field200 = var9.field2249;
                                        field505.method2296(var88);
                                    }
                                }
                                if (var9.field2319 != null) {
                                    class19 var89 = new class19();
                                    var89.field208 = var9;
                                    var89.field200 = var9.field2319;
                                    field308.method2296(var89);
                                }
                                if (var9.field2313 != null && field491 > var9.field2348) {
                                    if (var9.field2314 == null || field491 - var9.field2348 > 32) {
                                        class19 var94 = new class19();
                                        var94.field208 = var9;
                                        var94.field200 = var9.field2313;
                                        field503.method2296(var94);
                                    } else {
                                        label771: for (int var90 = var9.field2348; var90 < field491; var90++) {
                                            int var91 = field490[var90 & 0x1F];
                                            for (int var92 = 0; var92 < var9.field2314.length; var92++) {
                                                if (var9.field2314[var92] == var91) {
                                                    class19 var93 = new class19();
                                                    var93.field208 = var9;
                                                    var93.field200 = var9.field2313;
                                                    field503.method2296(var93);
                                                    break label771;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2348 = field491;
                                }
                                if (var9.field2315 != null && field493 > var9.field2349) {
                                    if (var9.field2316 == null || field493 - var9.field2349 > 32) {
                                        class19 var99 = new class19();
                                        var99.field208 = var9;
                                        var99.field200 = var9.field2315;
                                        field503.method2296(var99);
                                    } else {
                                        label747: for (int var95 = var9.field2349; var95 < field493; var95++) {
                                            int var96 = field385[var95 & 0x1F];
                                            for (int var97 = 0; var97 < var9.field2316.length; var97++) {
                                                if (var9.field2316[var97] == var96) {
                                                    class19 var98 = new class19();
                                                    var98.field208 = var9;
                                                    var98.field200 = var9.field2315;
                                                    field503.method2296(var98);
                                                    break label747;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2349 = field493;
                                }
                                if (var9.field2317 != null && field504 > var9.field2350) {
                                    if (var9.field2283 == null || field504 - var9.field2350 > 32) {
                                        class19 var104 = new class19();
                                        var104.field208 = var9;
                                        var104.field200 = var9.field2317;
                                        field503.method2296(var104);
                                    } else {
                                        label723: for (int var100 = var9.field2350; var100 < field504; var100++) {
                                            int var101 = field494[var100 & 0x1F];
                                            for (int var102 = 0; var102 < var9.field2283.length; var102++) {
                                                if (var9.field2283[var102] == var101) {
                                                    class19 var103 = new class19();
                                                    var103.field208 = var9;
                                                    var103.field200 = var9.field2317;
                                                    field503.method2296(var103);
                                                    break label723;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2350 = field504;
                                }
                                if (field496 > var9.field2347 && var9.field2322 != null) {
                                    class19 var105 = new class19();
                                    var105.field208 = var9;
                                    var105.field200 = var9.field2322;
                                    field503.method2296(var105);
                                }
                                if (field497 > var9.field2347 && var9.field2291 != null) {
                                    class19 var106 = new class19();
                                    var106.field208 = var9;
                                    var106.field200 = var9.field2291;
                                    field503.method2296(var106);
                                }
                                if (field498 > var9.field2347 && var9.field2325 != null) {
                                    class19 var107 = new class19();
                                    var107.field208 = var9;
                                    var107.field200 = var9.field2325;
                                    field503.method2296(var107);
                                }
                                if (field499 > var9.field2347 && var9.field2330 != null) {
                                    class19 var108 = new class19();
                                    var108.field208 = var9;
                                    var108.field200 = var9.field2330;
                                    field503.method2296(var108);
                                }
                                if (field500 > var9.field2347 && var9.field2331 != null) {
                                    class19 var109 = new class19();
                                    var109.field208 = var9;
                                    var109.field200 = var9.field2331;
                                    field503.method2296(var109);
                                }
                                if (field501 > var9.field2347 && var9.field2285 != null) {
                                    class19 var110 = new class19();
                                    var110.field208 = var9;
                                    var110.field200 = var9.field2285;
                                    field503.method2296(var110);
                                }
                                var9.field2347 = field562;
                                if (var9.field2323 != null) {
                                    for (int var111 = 0; var111 < field346; var111++) {
                                        class19 var112 = new class19();
                                        var112.field208 = var9;
                                        var112.field205 = field529[var111];
                                        var112.field206 = field420[var111];
                                        var112.field200 = var9.field2323;
                                        field503.method2296(var112);
                                    }
                                }
                            }
                        }
                        if (!var9.field2230 && field477 == null && Statics.field2178 == null && !field441) {
                            if ((var9.field2335 >= 0 || var9.field2281 != 0) && class116.field1818 >= var12 && class116.field1819 >= var13 && class116.field1818 < var14 && class116.field1819 < var15) {
                                if (var9.field2335 >= 0) {
                                    Statics.field2086 = arg0[var9.field2335];
                                } else {
                                    Statics.field2086 = var9;
                                }
                            }
                            if (var9.field2241 == 8 && class116.field1818 >= var12 && class116.field1819 >= var13 && class116.field1818 < var14 && class116.field1819 < var15) {
                                Statics.field191 = var9;
                            }
                            if (var9.field2244 > var9.field2210) {
                                int var113 = var9.field2294 + var10;
                                int var114 = var9.field2210;
                                int var115 = var9.field2244;
                                int var116 = class116.field1818;
                                int var117 = class116.field1819;
                                if (field322) {
                                    field366 = 32;
                                } else {
                                    field366 = 0;
                                }
                                field322 = false;
                                if (class116.field1812 == 1 || !Statics.field2688 && class116.field1812 == 4) {
                                    if (var116 >= var113 && var116 < var113 + 16 && var117 >= var11 && var117 < var11 + 16) {
                                        var9.field2217 -= 4;
                                        method198(var9);
                                    } else if (var116 >= var113 && var116 < var113 + 16 && var117 >= var11 + var114 - 16 && var117 < var11 + var114) {
                                        var9.field2217 += 4;
                                        method198(var9);
                                    } else if (var116 >= var113 - field366 && var116 < field366 + var113 + 16 && var117 >= var11 + 16 && var117 < var11 + var114 - 16) {
                                        int var118 = (var114 - 32) * var114 / var115;
                                        if (var118 < 8) {
                                            var118 = 8;
                                        }
                                        int var119 = var117 - var11 - 16 - var118 / 2;
                                        int var120 = var114 - 32 - var118;
                                        var9.field2217 = (var115 - var114) * var119 / var120;
                                        method198(var9);
                                        field322 = true;
                                    }
                                }
                                if (field539 != 0) {
                                    int var121 = var9.field2294;
                                    if (var116 >= var113 - var121 && var117 >= var11 && var116 < var113 + 16 && var117 <= var11 + var114) {
                                        var9.field2217 += field539 * 45;
                                        method198(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ax.cy(IIB)V")
    public static final void method712(int arg0, int arg1) {
        if (class170.method179(arg0)) {
            method810(Statics.field2240[arg0], arg1);
        }
    }

    @ObfuscatedName("av.cj([Lfr;II)V")
    public static final void method810(class170[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class170 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2241 == 0) {
                    if (var3.field2344 != null) {
                        method810(var3.field2344, arg1);
                    }
                    class18 var4 = (class18) field554.method2254((long) var3.field2274);
                    if (var4 != null) {
                        method712(var4.field190, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2327 != null) {
                    class19 var5 = new class19();
                    var5.field208 = var3;
                    var5.field200 = var3.field2327;
                    class33.method566(var5);
                }
                if (arg1 == 1 && var3.field2235 != null) {
                    if (var3.field2221 >= 0) {
                        class170 var6 = Statics.method1837(var3.field2274);
                        if (var6 == null || var6.field2344 == null || var3.field2221 >= var6.field2344.length || var6.field2344[var3.field2221] != var3) {
                            continue;
                        }
                    }
                    class19 var7 = new class19();
                    var7.field208 = var3;
                    var7.field200 = var3.field2235;
                    class33.method566(var7);
                }
            }
        }
    }

    @ObfuscatedName("g.co(Lfr;III)V")
    public static final void method188(class170 arg0, int arg1, int arg2) {
        if (field477 != null || field441 || arg0 == null) {
            return;
        }
        class170 var3 = method1849(arg0);
        if (var3 == null) {
            var3 = arg0.field2303;
        }
        if (var3 == null) {
            return;
        }
        field477 = arg0;
        class170 var5 = method1849(arg0);
        if (var5 == null) {
            var5 = arg0.field2303;
        }
        field478 = var5;
        field479 = arg1;
        field480 = arg2;
        Statics.field913 = 0;
        field488 = false;
        int var7 = method632();
        if (var7 != -1) {
            Statics.field1646 = new class39();
            Statics.field1646.field821 = field443[var7];
            Statics.field1646.field817 = field444[var7];
            Statics.field1646.field818 = field524[var7];
            Statics.field1646.field819 = field446[var7];
            Statics.field1646.field820 = field577[var7];
        }
        return;
    }

    @ObfuscatedName("ee.cw(B)V")
    public static final void method2574() {
        method198(field477);
        Statics.field913++;
        if (field485 && field482) {
            int var0 = class116.field1818;
            int var1 = class116.field1819;
            int var2 = var0 - field479;
            int var3 = var1 - field480;
            if (var2 < field325) {
                var2 = field325;
            }
            if (field477.field2294 + var2 > field325 + field478.field2294) {
                var2 = field325 + field478.field2294 - field477.field2294;
            }
            if (var3 < field484) {
                var3 = field484;
            }
            if (field477.field2210 + var3 > field484 + field478.field2210) {
                var3 = field484 + field478.field2210 - field477.field2210;
            }
            int var4 = var2 - field455;
            int var5 = var3 - field492;
            int var6 = field477.field2296;
            if (Statics.field913 > field477.field2224 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field488 = true;
            }
            int var7 = field478.field2332 + (var2 - field325);
            int var8 = field478.field2217 + (var3 - field484);
            if (field477.field2309 != null && field488) {
                class19 var9 = new class19();
                var9.field208 = field477;
                var9.field199 = var7;
                var9.field202 = var8;
                var9.field200 = field477.field2309;
                class33.method566(var9);
            }
            if (class116.field1812 == 0) {
                if (field488) {
                    if (field477.field2311 != null) {
                        class19 var10 = new class19();
                        var10.field208 = field477;
                        var10.field199 = var7;
                        var10.field202 = var8;
                        var10.field204 = field481;
                        var10.field200 = field477.field2311;
                        class33.method566(var10);
                    }
                    if (field481 != null && method1849(field477) != null) {
                        field495.method2889(85);
                        field495.method2694(field481.field2340);
                        field495.method2793(field477.field2221);
                        field495.method2708(field481.field2274);
                        field495.method2699(field477.field2340);
                        field495.method2772(field481.field2221);
                        field495.method2707(field477.field2274);
                    }
                } else {
                    int var11 = method632();
                    if (field442 > 2 && !(field440 != 1 || method3271()) || Statics.method3109(var11)) {
                        method802(field479 + field455, field492 + field480);
                    } else if (field442 > 0) {
                        int var12 = field479 + field455;
                        int var13 = field492 + field480;
                        class39 var14 = Statics.field1646;
                        method813(var14.field821, var14.field817, var14.field818, var14.field819, var14.field820, var14.field820, var12, var13);
                        Statics.field1646 = null;
                    }
                }
                field477 = null;
            }
        } else if (Statics.field913 > 1) {
            field477 = null;
        }
    }

    @ObfuscatedName("k.cd(Lfr;I)V")
    public static void method198(class170 arg0) {
        if (field508 == arg0.field2255) {
            field509[arg0.field2310] = true;
        }
    }

    @ObfuscatedName("ag.dd(I)V")
    public static void method637() {
        for (class18 var0 = (class18) field554.method2257(); var0 != null; var0 = (class18) field554.method2259()) {
            int var1 = var0.field190;
            if (class170.method179(var1)) {
                boolean var2 = true;
                class170[] var3 = Statics.field2240[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2230;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field1905;
                    class170 var6 = Statics.method1837(var5);
                    if (var6 != null) {
                        method198(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ab.dh([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method656(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("fc.da(II)V")
    public static final void method3103(int arg0) {
        if (!class170.method179(arg0)) {
            return;
        }
        class170[] var1 = Statics.field2240[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class170 var3 = var1[var2];
            if (var3 != null) {
                var3.field2345 = 0;
                var3.field2343 = 0;
            }
        }
    }

    @ObfuscatedName("er.dk(IB)V")
    public static final void method2632(int arg0) {
        if (class170.method179(arg0)) {
            method98(Statics.field2240[arg0], -1);
        }
    }

    @ObfuscatedName("w.dj([Lfr;II)V")
    public static final void method98(class170[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class170 var3 = arg0[var2];
            if (var3 != null && var3.field2239 == arg1 && (!var3.field2230 || !method2913(var3))) {
                if (var3.field2241 == 0) {
                    if (!var3.field2230 && method2913(var3) && Statics.field2086 != var3) {
                        continue;
                    }
                    method98(arg0, var3.field2274);
                    if (var3.field2344 != null) {
                        method98(var3.field2344, var3.field2274);
                    }
                    class18 var4 = (class18) field554.method2254((long) var3.field2274);
                    if (var4 != null) {
                        method2632(var4.field190);
                    }
                }
                if (var3.field2241 == 6) {
                    if (var3.field2267 != -1 || var3.field2277 != -1) {
                        boolean var5 = method2927(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2277;
                        } else {
                            var6 = var3.field2267;
                        }
                        if (var6 != -1) {
                            class202 var7 = class202.method164(var6);
                            var3.field2343 += field512;
                            while (var3.field2343 > var7.field3066[var3.field2345]) {
                                var3.field2343 -= var7.field3066[var3.field2345];
                                var3.field2345++;
                                if (var3.field2345 >= var7.field3061.length) {
                                    var3.field2345 -= var7.field3065;
                                    if (var3.field2345 < 0 || var3.field2345 >= var7.field3061.length) {
                                        var3.field2345 = 0;
                                    }
                                }
                                method198(var3);
                            }
                        }
                    }
                    if (var3.field2276 != 0 && !var3.field2230) {
                        int var8 = var3.field2276 >> 16;
                        int var9 = var3.field2276 << 16 >> 16;
                        int var10 = field512 * var8;
                        int var11 = field512 * var9;
                        var3.field2271 = var3.field2271 + var10 & 0x7FF;
                        var3.field2272 = var3.field2272 + var11 & 0x7FF;
                        method198(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("client.dq(IB)V")
    public static final void method551(int arg0) {
        method637();
        for (class32 var1 = (class32) class32.field733.method2301(); var1 != null; var1 = (class32) class32.field733.method2309()) {
            if (var1.field730 != null) {
                var1.method662();
            }
        }
        int var2 = class188.method1970(arg0).field2791;
        if (var2 == 0) {
            return;
        }
        int var3 = class166.field2181[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class85.method1593(0.9D);
                ((class75) Statics.field1473).method1375(0.9D);
            }
            if (var3 == 2) {
                class85.method1593(0.8D);
                ((class75) Statics.field1473).method1375(0.8D);
            }
            if (var3 == 3) {
                class85.method1593(0.7D);
                ((class75) Statics.field1473).method1375(0.7D);
            }
            if (var3 == 4) {
                class85.method1593(0.6D);
                ((class75) Statics.field1473).method1375(0.6D);
            }
            class199.method885();
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
            if (field541 != var4) {
                if (field541 == 0 && field542 != -1) {
                    class139.method1400(Statics.field587, field542, 0, var4, false);
                    field543 = false;
                } else if (var4 == 0) {
                    class139.method1399();
                    field543 = false;
                } else if (class139.field1941 == 0) {
                    Statics.field1940.method2401(var4);
                } else {
                    Statics.field784 = var4;
                }
                field541 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field544 = 127;
            }
            if (var3 == 1) {
                field544 = 96;
            }
            if (var3 == 2) {
                field544 = 64;
            }
            if (var3 == 3) {
                field544 = 32;
            }
            if (var3 == 4) {
                field544 = 0;
            }
        }
        if (var2 == 5) {
            field440 = var3;
        }
        if (var2 == 6) {
            field466 = var3;
        }
        if (var2 == 9) {
            field345 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field545 = 127;
            }
            if (var3 == 1) {
                field545 = 96;
            }
            if (var3 == 2) {
                field545 = 64;
            }
            if (var3 == 3) {
                field545 = 32;
            }
            if (var3 == 4) {
                field545 = 0;
            }
        }
        if (var2 == 17) {
            field472 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class41[] var5 = new class41[] { class41.field828, class41.field829, class41.field830, class41.field831 };
            field329 = (class41) class149.method557(var5, var3);
            if (field329 == null) {
                field329 = class41.field830;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field341 = -1;
            } else {
                field341 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class41[] var6 = new class41[] { class41.field828, class41.field829, class41.field830, class41.field831 };
        field393 = (class41) class149.method557(var6, var3);
        if (field393 == null) {
            field393 = class41.field830;
        }
    }

    @ObfuscatedName("gi.dr(I)V")
    public static final void method3194() {
        field495.method2889(48);
        for (class18 var0 = (class18) field554.method2257(); var0 != null; var0 = (class18) field554.method2259()) {
            if (var0.field188 == 0 || var0.field188 == 3) {
                method811(var0, true);
            }
        }
        if (field468 != null) {
            method198(field468);
            field468 = null;
        }
    }

    @ObfuscatedName("fq.ds(IIII)Lv;")
    public static final class18 method3095(int arg0, int arg1, int arg2) {
        class18 var3 = new class18();
        var3.field190 = arg1;
        var3.field188 = arg2;
        field554.method2255(var3, (long) arg0);
        method3103(arg1);
        class170 var4 = Statics.method1837(arg0);
        method198(var4);
        if (field468 != null) {
            method198(field468);
            field468 = null;
        }
        method203();
        Statics.method17(Statics.field2240[arg0 >> 16], var4, false);
        class33.method2098(arg1);
        if (field464 != -1) {
            method712(field464, 1);
        }
        return var3;
    }

    @ObfuscatedName("ao.dy(Lv;ZI)V")
    public static final void method811(class18 arg0, boolean arg1) {
        int var2 = arg0.field190;
        int var3 = (int) arg0.field1905;
        arg0.method2289();
        if (arg1) {
            class170.method2921(var2);
        }
        for (class134 var4 = (class134) field463.method2257(); var4 != null; var4 = (class134) field463.method2259()) {
            if ((var4.field1905 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method2289();
            }
        }
        class170 var5 = Statics.method1837(var3);
        if (var5 != null) {
            method198(var5);
        }
        method203();
        if (field464 != -1) {
            method712(field464, 1);
        }
    }

    @ObfuscatedName("dj.dp(Lfr;IIII)V")
    public static final void method1967(class170 arg0, int arg1, int arg2, int arg3) {
        method593();
        class165 var4 = arg0.method3077(false);
        if (var4 == null) {
            return;
        }
        class220.method3773(arg1, arg2, var4.field2175 + arg1, var4.field2173 + arg2);
        if (field540 == 2 || field540 == 5) {
            class220.method3802(arg1, arg2, 0, var4.field2174, var4.field2172);
        } else {
            int var5 = field387 + field374 & 0x7FF;
            int var6 = Statics.field899.field625 / 32 + 48;
            int var7 = 464 - Statics.field899.field620 / 32;
            Statics.field687.method3902(arg1, arg2, var4.field2175, var4.field2173, var6, var7, var5, field376 + 256, var4.field2174, var4.field2172);
            for (int var8 = 0; var8 < field534; var8++) {
                int var9 = field535[var8] * 4 + 2 - Statics.field899.field625 / 32;
                int var10 = field436[var8] * 4 + 2 - Statics.field899.field620 / 32;
                method3190(arg1, arg2, var9, var10, field537[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class129 var13 = field433[Statics.field3063][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field899.field625 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field899.field620 / 32;
                        method3190(arg1, arg2, var14, var15, Statics.field252[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field403; var16++) {
                class36 var17 = field412[field343[var16]];
                if (var17 != null && var17.method213()) {
                    class200 var18 = var17.field783;
                    if (var18 != null && var18.field3036 != null) {
                        var18 = var18.method3517();
                    }
                    if (var18 != null && var18.field3042 && var18.field3021) {
                        int var19 = var17.field625 / 32 - Statics.field899.field625 / 32;
                        int var20 = var17.field620 / 32 - Statics.field899.field620 / 32;
                        method3190(arg1, arg2, var19, var20, Statics.field252[1], var4);
                    }
                }
            }
            int var21 = class46.field924;
            int[] var22 = class46.field919;
            for (int var23 = 0; var23 < var21; var23++) {
                class24 var24 = field423[var22[var23]];
                if (var24 != null && var24.method213() && !var24.field266 && Statics.field899 != var24) {
                    int var25 = var24.field625 / 32 - Statics.field899.field625 / 32;
                    int var26 = var24.field620 / 32 - Statics.field899.field620 / 32;
                    boolean var27 = false;
                    if (method138(var24.field279, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field1449; var29++) {
                        if (var24.field279.equals(Statics.field2137[var29].field290)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field899.field280 != 0 && var24.field280 != 0 && Statics.field899.field280 == var24.field280) {
                        var30 = true;
                    }
                    if (var27) {
                        method3190(arg1, arg2, var25, var26, Statics.field252[3], var4);
                    } else if (var30) {
                        method3190(arg1, arg2, var25, var26, Statics.field252[4], var4);
                    } else if (var28) {
                        method3190(arg1, arg2, var25, var26, Statics.field252[5], var4);
                    } else {
                        method3190(arg1, arg2, var25, var26, Statics.field252[2], var4);
                    }
                }
            }
            if (field321 != 0 && field312 % 20 < 10) {
                if (field321 == 1 && field342 >= 0 && field342 < field412.length) {
                    class36 var31 = field412[field342];
                    if (var31 != null) {
                        int var32 = var31.field625 / 32 - Statics.field899.field625 / 32;
                        int var33 = var31.field620 / 32 - Statics.field899.field620 / 32;
                        method1958(arg1, arg2, var32, var33, Statics.field2195[1], var4);
                    }
                }
                if (field321 == 2) {
                    int var34 = field324 * 4 - Statics.field1880 * 4 + 2 - Statics.field899.field625 / 32;
                    int var35 = field394 * 4 - Statics.field2792 * 4 + 2 - Statics.field899.field620 / 32;
                    method1958(arg1, arg2, var34, var35, Statics.field2195[1], var4);
                }
                if (field321 == 10 && field323 >= 0 && field323 < field423.length) {
                    class24 var36 = field423[field323];
                    if (var36 != null) {
                        int var37 = var36.field625 / 32 - Statics.field899.field625 / 32;
                        int var38 = var36.field620 / 32 - Statics.field899.field620 / 32;
                        method1958(arg1, arg2, var37, var38, Statics.field2195[1], var4);
                    }
                }
            }
            if (field538 != 0) {
                int var39 = field538 * 4 + 2 - Statics.field899.field625 / 32;
                int var40 = field435 * 4 + 2 - Statics.field899.field620 / 32;
                method3190(arg1, arg2, var39, var40, Statics.field2195[0], var4);
            }
            if (!Statics.field899.field266) {
                class220.method3779(var4.field2175 / 2 + arg1 - 1, var4.field2173 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field426[arg3] = true;
    }

    @ObfuscatedName("dk.dc(IIIILhe;Lfl;I)V")
    public static final void method1958(int arg0, int arg1, int arg2, int arg3, class225 arg4, class165 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method3190(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field387 + field374 & 0x7FF;
        int var8 = class85.field1476[var7];
        int var9 = class85.field1470[var7];
        int var10 = var8 * 256 / (field376 + 256);
        int var11 = var9 * 256 / (field376 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field2719.method3916(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("gi.db(IIIILhe;Lfl;I)V")
    public static final void method3190(int arg0, int arg1, int arg2, int arg3, class225 arg4, class165 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field387 + field374 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class85.field1476[var6];
        int var9 = class85.field1470[var6];
        int var10 = var8 * 256 / (field376 + 256);
        int var11 = var9 * 256 / (field376 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method3908(arg5.field2175 / 2 + var12 - arg4.field3224 / 2, arg5.field2173 / 2 - var13 - arg4.field3221 / 2, arg0, arg1, arg5.field2175, arg5.field2173, arg5.field2174, arg5.field2172);
        } else {
            arg4.method3891(arg5.field2175 / 2 + arg0 + var12 - arg4.field3224 / 2, arg5.field2173 / 2 + arg1 - var13 - arg4.field3221 / 2);
        }
    }

    @ObfuscatedName("j.dl(Ljava/lang/String;ZI)Z")
    public static boolean method138(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class205.method3259(arg0, Statics.field215);
        for (int var3 = 0; var3 < field556; var3++) {
            if (var2.equalsIgnoreCase(class205.method3259(field298[var3].field166, Statics.field215)) && (!arg1 || field298[var3].field156 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class205.method3259(Statics.field899.field279, Statics.field215))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cm.dz(Ljava/lang/String;I)Z")
    public static boolean method1844(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class205.method3259(arg0, Statics.field215);
        for (int var2 = 0; var2 < field575; var2++) {
            class20 var3 = field576[var2];
            if (var1.equalsIgnoreCase(class205.method3259(var3.field226, Statics.field215))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class205.method3259(var3.field223, Statics.field215))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("fv.dv(Ljava/lang/String;I)V")
    public static final void method3112(String arg0) {
        if (Statics.field2137 != null) {
            field495.method2889(23);
            field495.method2651(class154.method1352(arg0));
            field495.method2730(arg0);
        }
    }

    @ObfuscatedName("aj.dw(Ljava/lang/String;B)V")
    public static final void method756(String arg0) {
        if (!arg0.equals("")) {
            field495.method2889(253);
            field495.method2651(class154.method1352(arg0));
            field495.method2730(arg0);
        }
    }

    @ObfuscatedName("eo.dx(I)V")
    public static final void method2865() {
        field495.method2889(253);
        field495.method2651(0);
    }

    @ObfuscatedName("gw.de(Lfr;I)I")
    public static int method3309(class170 arg0) {
        class134 var1 = (class134) field463.method2254(((long) arg0.field2274 << 32) + (long) arg0.field2221);
        return var1 == null ? arg0.field2292 : var1.field1919;
    }

    @ObfuscatedName("ct.do(Lfr;I)Lfr;")
    public static class170 method1849(class170 arg0) {
        int var1 = method3309(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = Statics.method1837(arg0.field2239);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("fd.dg(Lfr;I)Z")
    public static boolean method2913(class170 arg0) {
        if (field474) {
            if (method3309(arg0) != 0) {
                return false;
            }
            if (arg0.field2241 == 0) {
                return false;
            }
        }
        return arg0.field2256;
    }

    @ObfuscatedName("fj.di(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method3099(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field581 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field581 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field581 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field581 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field581 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field2134 != null) {
            var3 = "/p=" + Statics.field2134;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field309 + "/a=" + Statics.field378 + var3 + "/";
    }

    @ObfuscatedName("bi.du(Ljava/lang/String;I)V")
    public static void method1357(String arg0) {
        Statics.field2134 = arg0;
        try {
            String var1 = Statics.field434.getParameter(class215.field3174.field3162);
            String var2 = Statics.field434.getParameter(class215.field3175.field3162);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class163.method821(class156.method848() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class101.method1864(Statics.field434, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("fv.dt([BII)V")
    public static void method3113(byte[] arg0, int arg1) {
        if (field530 == null) {
            field530 = new byte[24];
        }
        class164.method2936(arg0, arg1, field530, 0, 24);
    }

    @ObfuscatedName("an.df(Leo;B)V")
    public static void method571(class154 arg0) {
        if (field530 != null) {
            arg0.method2660(field530, 0, field530.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class105.field1713.method1350(0L);
            class105.field1713.method1328(var1);
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
        arg0.method2660(var1, 0, var1.length);
    }
}
